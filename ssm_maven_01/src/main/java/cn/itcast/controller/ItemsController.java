package cn.itcast.controller;


import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService service;

    @RequestMapping("/findById")
    public  String  findById(Model model){
        Items items = service.findById(1);
        model.addAttribute("item",items);
        System.out.println(items);
        return "itemDetail";
    }
}
