package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("h")
public class class10 {

    @ObfuscatedName("h.g")
    public static final Map field150 = new HashMap();

    @ObfuscatedName("h.i")
    public static final class177 field151 = new class177(1024);

    @ObfuscatedName("h.k")
    public static final class179 field152 = new class179();

    @ObfuscatedName("h.e")
    public static int field156 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.i(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method469(int arg0, String arg1, String arg2) {
        method568(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("aa.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method568(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field150.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field150.put(arg0, var4);
        }
        class31 var5 = var4.method491(arg0, arg1, arg2, arg3);
        field151.method3191(var5, (long) var5.field716);
        field152.method3233(var5);
        client.field448 = client.field506;
    }

    @ObfuscatedName("ai.w(I)V")
    public static void method662() {
        field150.clear();
        field151.method3192();
        field152.method3234();
        field156 = 0;
    }

    @ObfuscatedName("db.m(II)I")
    public static int method2359(int arg0) {
        class31 var1 = (class31) field151.method3189((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field152.field2871 == var1.field2876) {
            return -1;
        } else {
            return ((class31) var1.field2876).field716;
        }
    }

    @ObfuscatedName("az.u(B)Ljava/lang/String;")
    public static String method753() {
        String var0 = "";
        Iterator var1 = field151.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field717 + ':' + var2.field714 + '\n';
        }
        return var0;
    }
}
