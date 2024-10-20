package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("k")
public class class12 {

    @ObfuscatedName("k.l")
    public static final Map field175 = new HashMap();

    @ObfuscatedName("k.e")
    public static final class198 field174 = new class198(1024);

    @ObfuscatedName("k.q")
    public static final class200 field171 = new class200();

    @ObfuscatedName("k.o")
    public static int field172 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.l(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method755(int arg0, String arg1, String arg2) {
        method583(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("h.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method583(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field175.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field175.put(arg0, var4);
        }
        class36 var5 = var4.method644(arg0, arg1, arg2, arg3);
        field174.method3536(var5, (long) var5.field789);
        field171.method3569(var5);
        client.field484 = client.field477;
    }

    @ObfuscatedName("eg.q(III)Lae;")
    public static class36 method2946(int arg0, int arg1) {
        class28 var2 = (class28) field175.get(arg0);
        return var2.method653(arg1);
    }

    @ObfuscatedName("ci.o(IB)Lae;")
    public static class36 method2165(int arg0) {
        return (class36) field174.method3528((long) arg0);
    }

    @ObfuscatedName("ag.g(B)V")
    public static void method756() {
        field175.clear();
        field174.method3527();
        field171.method3570();
        field172 = 0;
    }

    @ObfuscatedName("fs.m(II)I")
    public static int method3215(int arg0) {
        class36 var1 = (class36) field174.method3528((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field171.field3091 == var1.field3096) {
            return -1;
        } else {
            return ((class36) var1.field3096).field789;
        }
    }
}
