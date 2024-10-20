package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("w")
public class class10 {

    @ObfuscatedName("w.e")
    public static final Map field151 = new HashMap();

    @ObfuscatedName("w.v")
    public static final class179 field146 = new class179(1024);

    @ObfuscatedName("w.k")
    public static final class181 field147 = new class181();

    @ObfuscatedName("w.g")
    public static int field148 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.e(I)I")
    public static int method800() {
        return ++field148 - 1;
    }

    @ObfuscatedName("h.v(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method486(int arg0, String arg1, String arg2) {
        method887(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("aq.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method887(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field151.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field151.put(arg0, var4);
        }
        class32 var5 = var4.method488(arg0, arg1, arg2, arg3);
        field146.method3210(var5, (long) var5.field719);
        field147.method3256(var5);
        client.field439 = client.field432;
    }

    @ObfuscatedName("k.g(IB)Lar;")
    public static class32 method26(int arg0) {
        return (class32) field146.method3209((long) arg0);
    }

    @ObfuscatedName("e.q(IB)I")
    public static int method3(int arg0) {
        class25 var1 = (class25) field151.get(arg0);
        return var1 == null ? 0 : var1.method496();
    }

    @ObfuscatedName("bh.a(I)Ljava/lang/String;")
    public static String method1353() {
        String var0 = "";
        Iterator var1 = field146.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var0 = var0 + var2.field713 + ':' + var2.field718 + '\n';
        }
        return var0;
    }
}
