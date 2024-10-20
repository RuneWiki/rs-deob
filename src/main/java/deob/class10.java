package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("u")
public class class10 {

    @ObfuscatedName("u.t")
    public static final Map field141 = new HashMap();

    @ObfuscatedName("u.s")
    public static final class176 field143 = new class176(1024);

    @ObfuscatedName("u.f")
    public static final class178 field140 = new class178();

    @ObfuscatedName("u.e")
    public static int field142 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.t(B)I")
    public static int method2411() {
        return ++field142 - 1;
    }

    @ObfuscatedName("ab.s(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method551(int arg0, String arg1, String arg2) {
        method2822(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("eo.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2822(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field141.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field141.put(arg0, var4);
        }
        class31 var5 = var4.method491(arg0, arg1, arg2, arg3);
        field143.method3217(var5, (long) var5.field695);
        field140.method3269(var5);
        client.field437 = client.field430;
    }

    @ObfuscatedName("dl.e(III)Lao;")
    public static class31 method2581(int arg0, int arg1) {
        class24 var2 = (class24) field141.get(arg0);
        return var2.method492(arg1);
    }

    @ObfuscatedName("cu.d(II)I")
    public static int method2044(int arg0) {
        class24 var1 = (class24) field141.get(arg0);
        return var1 == null ? 0 : var1.method493();
    }

    @ObfuscatedName("bm.n(I)Ljava/lang/String;")
    public static String method1392() {
        String var0 = "";
        Iterator var1 = field143.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field687 + ':' + var2.field689 + '\n';
        }
        return var0;
    }
}
