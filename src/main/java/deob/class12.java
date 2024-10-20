package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("v")
public class class12 {

    @ObfuscatedName("v.o")
    public static final Map field176 = new HashMap();

    @ObfuscatedName("v.f")
    public static final class198 field175 = new class198(1024);

    @ObfuscatedName("v.i")
    public static final class200 field177 = new class200();

    @ObfuscatedName("v.h")
    public static int field178 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.o(I)I")
    public static int method697() {
        return ++field178 - 1;
    }

    @ObfuscatedName("t.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method100(int arg0, String arg1, String arg2) {
        method3440(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("gw.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3440(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field176.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field176.put(arg0, var4);
        }
        class36 var5 = var4.method617(arg0, arg1, arg2, arg3);
        field175.method3512(var5, (long) var5.field782);
        field177.method3553(var5);
        client.field344 = client.field549;
    }

    @ObfuscatedName("aq.h(III)Lag;")
    public static class36 method1015(int arg0, int arg1) {
        class28 var2 = (class28) field176.get(arg0);
        return var2.method616(arg1);
    }

    @ObfuscatedName("dy.q(IB)Lag;")
    public static class36 method2581(int arg0) {
        return (class36) field175.method3501((long) arg0);
    }

    @ObfuscatedName("s.u(I)V")
    public static void method182() {
        field176.clear();
        field175.method3503();
        field177.method3550();
        field178 = 0;
    }

    @ObfuscatedName("a.m(I)Ljava/lang/String;")
    public static String method150() {
        String var0 = "";
        Iterator var1 = field175.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field788 + ':' + var2.field787 + '\n';
        }
        return var0;
    }
}
