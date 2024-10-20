package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("a")
public class class12 {

    @ObfuscatedName("a.z")
    public static final Map field163 = new HashMap();

    @ObfuscatedName("a.q")
    public static final class198 field162 = new class198(1024);

    @ObfuscatedName("a.k")
    public static final class200 field171 = new class200();

    @ObfuscatedName("a.f")
    public static int field174 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.z(I)I")
    public static int method2926() {
        return ++field174 - 1;
    }

    @ObfuscatedName("ez.q(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2763(int arg0, String arg1, String arg2) {
        method816(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("at.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method816(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field163.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field163.put(arg0, var4);
        }
        class36 var5 = var4.method604(arg0, arg1, arg2, arg3);
        field162.method3480(var5, (long) var5.field780);
        field171.method3526(var5);
        client.field471 = client.field516;
    }

    @ObfuscatedName("du.f(III)Laj;")
    public static class36 method2224(int arg0, int arg1) {
        class28 var2 = (class28) field163.get(arg0);
        return var2.method605(arg1);
    }

    @ObfuscatedName("at.d(IB)Laj;")
    public static class36 method818(int arg0) {
        return (class36) field162.method3486((long) arg0);
    }

    @ObfuscatedName("ai.l(II)I")
    public static int method801(int arg0) {
        class28 var1 = (class28) field163.get(arg0);
        return var1 == null ? 0 : var1.method614();
    }

    @ObfuscatedName("q.r(I)V")
    public static void method5() {
        field163.clear();
        field162.method3479();
        field171.method3530();
        field174 = 0;
    }
}
