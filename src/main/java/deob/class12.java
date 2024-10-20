package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("k")
public class class12 {

    @ObfuscatedName("k.f")
    public static final Map field179 = new HashMap();

    @ObfuscatedName("k.u")
    public static final class199 field183 = new class199(1024);

    @ObfuscatedName("k.x")
    public static final class201 field180 = new class201();

    @ObfuscatedName("k.b")
    public static int field181 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.f(I)I")
    public static int method1534() {
        return ++field181 - 1;
    }

    @ObfuscatedName("bp.u(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1120(int arg0, String arg1, String arg2) {
        method2626(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dk.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2626(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field179.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field179.put(arg0, var4);
        }
        class36 var5 = var4.method683(arg0, arg1, arg2, arg3);
        field183.method3575(var5, (long) var5.field794);
        field180.method3620(var5);
        client.field482 = client.field564;
    }

    @ObfuscatedName("bq.b(III)Lam;")
    public static class36 method1239(int arg0, int arg1) {
        class28 var2 = (class28) field179.get(arg0);
        return var2.method674(arg1);
    }

    @ObfuscatedName("u.l(I)V")
    public static void method11() {
        field179.clear();
        field183.method3576();
        field180.method3619();
        field181 = 0;
    }

    @ObfuscatedName("dw.d(II)I")
    public static int method2259(int arg0) {
        class36 var1 = (class36) field183.method3573((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field180.field3102 == var1.field3107) {
            return -1;
        } else {
            return ((class36) var1.field3107).field794;
        }
    }
}
