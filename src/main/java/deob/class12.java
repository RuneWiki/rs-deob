package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("k")
public class class12 {

    @ObfuscatedName("k.h")
    public static final Map field167 = new HashMap();

    @ObfuscatedName("k.m")
    public static final class198 field169 = new class198(1024);

    @ObfuscatedName("k.i")
    public static final class200 field168 = new class200();

    @ObfuscatedName("k.q")
    public static int field166 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.h(B)I")
    public static int method221() {
        return ++field166 - 1;
    }

    @ObfuscatedName("dk.m(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2263(int arg0, String arg1, String arg2) {
        method1038(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bm.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1038(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field167.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field167.put(arg0, var4);
        }
        class36 var5 = var4.method607(arg0, arg1, arg2, arg3);
        field169.method3528(var5, (long) var5.field796);
        field168.method3576(var5);
        client.field477 = client.field470;
    }

    @ObfuscatedName("b.q(III)Laa;")
    public static class36 method570(int arg0, int arg1) {
        class28 var2 = (class28) field167.get(arg0);
        return var2.method610(arg1);
    }

    @ObfuscatedName("d.p(IB)Laa;")
    public static class36 method551(int arg0) {
        return (class36) field169.method3527((long) arg0);
    }

    @ObfuscatedName("aj.c(II)I")
    public static int method944(int arg0) {
        class28 var1 = (class28) field167.get(arg0);
        return var1 == null ? 0 : var1.method608();
    }

    @ObfuscatedName("hh.f(I)V")
    public static void method3656() {
        field167.clear();
        field169.method3529();
        field168.method3571();
        field166 = 0;
    }

    @ObfuscatedName("ch.y(IB)I")
    public static int method2104(int arg0) {
        class36 var1 = (class36) field169.method3527((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field168.field3086 == var1.field3091) {
            return -1;
        } else {
            return ((class36) var1.field3091).field796;
        }
    }

    @ObfuscatedName("n.w(II)I")
    public static int method555(int arg0) {
        class36 var1 = (class36) field169.method3527((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field168.field3086 == var1.field3090) {
            return -1;
        } else {
            return ((class36) var1.field3090).field796;
        }
    }

    @ObfuscatedName("q.l(B)Ljava/lang/String;")
    public static String method36() {
        String var0 = "";
        Iterator var1 = field169.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field792 + ':' + var2.field793 + '\n';
        }
        return var0;
    }
}
