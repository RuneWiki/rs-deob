package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("l")
public class class12 {

    @ObfuscatedName("l.h")
    public static final Map field180 = new HashMap();

    @ObfuscatedName("l.q")
    public static final class198 field182 = new class198(1024);

    @ObfuscatedName("l.v")
    public static final class200 field181 = new class200();

    @ObfuscatedName("l.n")
    public static int field179 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.h(I)I")
    public static int method1515() {
        return ++field179 - 1;
    }

    @ObfuscatedName("ae.q(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method974(int arg0, String arg1, String arg2) {
        method1590(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bh.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1590(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field180.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field180.put(arg0, var4);
        }
        class36 var5 = var4.method623(arg0, arg1, arg2, arg3);
        field182.method3597(var5, (long) var5.field798);
        field181.method3644(var5);
        client.field491 = client.field484;
    }

    @ObfuscatedName("aj.n(III)Lap;")
    public static class36 method990(int arg0, int arg1) {
        class28 var2 = (class28) field180.get(arg0);
        return var2.method626(arg1);
    }

    @ObfuscatedName("er.f(II)Lap;")
    public static class36 method2978(int arg0) {
        return (class36) field182.method3593((long) arg0);
    }

    @ObfuscatedName("h.g(II)I")
    public static int method1(int arg0) {
        class28 var1 = (class28) field180.get(arg0);
        return var1 == null ? 0 : var1.method625();
    }

    @ObfuscatedName("a.o(II)I")
    public static int method615(int arg0) {
        class36 var1 = (class36) field182.method3593((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field181.field3079 == var1.field3084) {
            return -1;
        } else {
            return ((class36) var1.field3084).field798;
        }
    }
}
