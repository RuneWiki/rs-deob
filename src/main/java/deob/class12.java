package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("z")
public class class12 {

    @ObfuscatedName("z.i")
    public static final Map field173 = new HashMap();

    @ObfuscatedName("z.v")
    public static final class198 field167 = new class198(1024);

    @ObfuscatedName("z.f")
    public static final class200 field168 = new class200();

    @ObfuscatedName("z.h")
    public static int field169 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.i(ILjava/lang/String;Ljava/lang/String;S)V")
    public static void method930(int arg0, String arg1, String arg2) {
        method45(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("h.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method45(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field173.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field173.put(arg0, var4);
        }
        class36 var5 = var4.method590(arg0, arg1, arg2, arg3);
        field167.method3515(var5, (long) var5.field793);
        field168.method3563(var5);
        client.field481 = client.field524;
    }

    @ObfuscatedName("ex.f(III)Laz;")
    public static class36 method2899(int arg0, int arg1) {
        class28 var2 = (class28) field173.get(arg0);
        return var2.method591(arg1);
    }

    @ObfuscatedName("ai.h(IB)Laz;")
    public static class36 method704(int arg0) {
        return (class36) field167.method3523((long) arg0);
    }

    @ObfuscatedName("fx.a(I)V")
    public static void method3124() {
        field173.clear();
        field167.method3520();
        field168.method3562();
        field169 = 0;
    }

    @ObfuscatedName("hd.s(II)I")
    public static int method3667(int arg0) {
        class36 var1 = (class36) field167.method3523((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field168.field3084 == var1.field3089) {
            return -1;
        } else {
            return ((class36) var1.field3089).field793;
        }
    }
}
