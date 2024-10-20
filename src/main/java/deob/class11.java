package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("e")
public class class11 {

    @ObfuscatedName("e.n")
    public static final Map field157 = new HashMap();

    @ObfuscatedName("e.o")
    public static final class189 field158 = new class189(1024);

    @ObfuscatedName("e.a")
    public static final class191 field159 = new class191();

    @ObfuscatedName("e.w")
    public static int field166 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.n(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2919(int arg0, String arg1, String arg2) {
        method2514(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dm.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2514(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field157.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field157.put(arg0, var4);
        }
        class33 var5 = var4.method560(arg0, arg1, arg2, arg3);
        field158.method3426(var5, (long) var5.field754);
        field159.method3478(var5);
        client.field284 = client.field460;
    }

    @ObfuscatedName("an.a(III)Lax;")
    public static class33 method614(int arg0, int arg1) {
        class26 var2 = (class26) field157.get(arg0);
        return var2.method561(arg1);
    }

    @ObfuscatedName("bi.w(II)I")
    public static int method1432(int arg0) {
        class26 var1 = (class26) field157.get(arg0);
        return var1 == null ? 0 : var1.method562();
    }

    @ObfuscatedName("ax.m(I)V")
    public static void method627() {
        field157.clear();
        field158.method3431();
        field159.method3479();
        field166 = 0;
    }

    @ObfuscatedName("j.h(II)I")
    public static int method511(int arg0) {
        class33 var1 = (class33) field158.method3427((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field159.field3004 == var1.field3009) {
            return -1;
        } else {
            return ((class33) var1.field3009).field754;
        }
    }
}
