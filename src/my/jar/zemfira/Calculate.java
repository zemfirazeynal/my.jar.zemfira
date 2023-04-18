package my.jar.zemfira;

public class Calculate {
    public static Integer topla (Integer a, Integer b){
        return a+b;
    }

    public static Integer cix(Integer a, Integer b){
        return a-b;
    }

    public static Integer vur(Integer a, Integer b){
        return a*b;
    }

    public static Integer bol(Integer a, Integer b){
        return b!=0 ? a/b: 0;
    }

    public static Integer max(Integer a, Integer b){
        return a>b ? a: b;
    }
}
