package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("o")
public class class12 {

    @ObfuscatedName("o.y")
    public static final Map field180 = new HashMap();

    @ObfuscatedName("o.d")
    public static final class198 field178 = new class198(1024);

    @ObfuscatedName("o.g")
    public static final class200 field184 = new class200();

    @ObfuscatedName("o.w")
    public static int field181 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.y(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2628(int arg0, String arg1, String arg2) {
        method2247(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dl.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method2247(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field180.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field180.put(arg0, var4);
        }
        class36 var5 = var4.method618(arg0, arg1, arg2, arg3);
        field178.method3476(var5, (long) var5.field784);
        field184.method3525(var5);
        client.field481 = client.field357;
    }

    @ObfuscatedName("k.g(IS)Laf;")
    public static class36 method134(int arg0) {
        return (class36) field178.method3475((long) arg0);
    }

    @ObfuscatedName("w.w(IB)I")
    public static int method37(int arg0) {
        class28 var1 = (class28) field180.get(arg0);
        return var1 == null ? 0 : var1.method621();
    }

    @ObfuscatedName("cw.e(B)V")
    public static void method2025() {
        field180.clear();
        field178.method3477();
        field184.method3527();
        field181 = 0;
    }

    @ObfuscatedName("bo.c(II)I")
    public static int method1512(int arg0) {
        class36 var1 = (class36) field178.method3475((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field184.field3077 == var1.field3082) {
            return -1;
        } else {
            return ((class36) var1.field3082).field784;
        }
    }
}
