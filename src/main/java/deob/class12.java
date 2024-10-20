package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("t")
public class class12 {

    @ObfuscatedName("t.s")
    public static final Map field169 = new HashMap();

    @ObfuscatedName("t.j")
    public static final class199 field168 = new class199(1024);

    @ObfuscatedName("t.p")
    public static final class201 field172 = new class201();

    @ObfuscatedName("t.x")
    public static int field171 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.s(I)I")
    public static int method3213() {
        return ++field171 - 1;
    }

    @ObfuscatedName("dv.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2629(int arg0, String arg1, String arg2) {
        method1030(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bd.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1030(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field169.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field169.put(arg0, var4);
        }
        class36 var5 = var4.method616(arg0, arg1, arg2, arg3);
        field168.method3536(var5, (long) var5.field790);
        field172.method3582(var5);
        client.field470 = client.field463;
    }

    @ObfuscatedName("ad.x(III)Lai;")
    public static class36 method625(int arg0, int arg1) {
        class28 var2 = (class28) field169.get(arg0);
        return var2.method626(arg1);
    }

    @ObfuscatedName("dg.d(II)Lai;")
    public static class36 method2224(int arg0) {
        return (class36) field168.method3535((long) arg0);
    }

    @ObfuscatedName("gw.u(II)I")
    public static int method3364(int arg0) {
        class28 var1 = (class28) field169.get(arg0);
        return var1 == null ? 0 : var1.method618();
    }

    @ObfuscatedName("df.o(II)I")
    public static int method2628(int arg0) {
        class36 var1 = (class36) field168.method3535((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field172.field3111 == var1.field3116) {
            return -1;
        } else {
            return ((class36) var1.field3116).field790;
        }
    }

    @ObfuscatedName("bk.b(IB)I")
    public static int method1455(int arg0) {
        class36 var1 = (class36) field168.method3535((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field172.field3111 == var1.field3115) {
            return -1;
        } else {
            return ((class36) var1.field3115).field790;
        }
    }
}
