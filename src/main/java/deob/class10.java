package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("v")
public class class10 {

    @ObfuscatedName("v.c")
    public static final Map field156 = new HashMap();

    @ObfuscatedName("v.j")
    public static final class179 field148 = new class179(1024);

    @ObfuscatedName("v.y")
    public static final class181 field157 = new class181();

    @ObfuscatedName("v.r")
    public static int field149 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.c(I)I")
    public static int method83() {
        return ++field149 - 1;
    }

    @ObfuscatedName("v.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method100(int arg0, String arg1, String arg2) {
        method1(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("c.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field156.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field156.put(arg0, var4);
        }
        class32 var5 = var4.method517(arg0, arg1, arg2, arg3);
        field148.method3229(var5, (long) var5.field704);
        field157.method3281(var5);
        client.field445 = client.field438;
    }

    @ObfuscatedName("dw.r(III)Lao;")
    public static class32 method2501(int arg0, int arg1) {
        class25 var2 = (class25) field156.get(arg0);
        return var2.method511(arg1);
    }
}
