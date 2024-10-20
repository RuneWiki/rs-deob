package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("z")
public class class10 {

    @ObfuscatedName("z.b")
    public static final Map field139 = new HashMap();

    @ObfuscatedName("z.e")
    public static final class181 field140 = new class181(1024);

    @ObfuscatedName("z.i")
    public static final class183 field141 = new class183();

    @ObfuscatedName("z.k")
    public static int field142 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.b(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method691(int arg0, String arg1, String arg2) {
        method2416(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("df.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2416(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field139.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field139.put(arg0, var4);
        }
        class32 var5 = var4.method518(arg0, arg1, arg2, arg3);
        field140.method3275(var5, (long) var5.field697);
        field141.method3320(var5);
        client.field335 = client.field446;
    }

    @ObfuscatedName("c.i(II)I")
    public static int method481(int arg0) {
        class25 var1 = (class25) field139.get(arg0);
        return var1 == null ? 0 : var1.method520();
    }

    @ObfuscatedName("bv.k(I)V")
    public static void method1594() {
        field139.clear();
        field140.method3276();
        field141.method3329();
        field142 = 0;
    }

    @ObfuscatedName("a.p(I)Ljava/lang/String;")
    public static String method462() {
        String var0 = "";
        Iterator var1 = field140.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var0 = var0 + var2.field700 + ':' + var2.field702 + '\n';
        }
        return var0;
    }
}
