package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("m")
public class class11 {

    @ObfuscatedName("m.p")
    public static final Map field170 = new HashMap();

    @ObfuscatedName("m.k")
    public static final class189 field158 = new class189(1024);

    @ObfuscatedName("m.e")
    public static final class191 field159 = new class191();

    @ObfuscatedName("m.f")
    public static int field160 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.p(I)I")
    public static int method794() {
        return ++field160 - 1;
    }

    @ObfuscatedName("fo.k(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3366(int arg0, String arg1, String arg2) {
        method1912(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cq.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method1912(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field170.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field170.put(arg0, var4);
        }
        class33 var5 = var4.method571(arg0, arg1, arg2, arg3);
        field158.method3423(var5, (long) var5.field745);
        field159.method3474(var5);
        client.field523 = client.field538;
    }

    @ObfuscatedName("at.f(II)Lar;")
    public static class33 method940(int arg0) {
        return (class33) field158.method3422((long) arg0);
    }

    @ObfuscatedName("dm.w(II)I")
    public static int method2517(int arg0) {
        class26 var1 = (class26) field170.get(arg0);
        return var1 == null ? 0 : var1.method568();
    }

    @ObfuscatedName("w.s(II)I")
    public static int method35(int arg0) {
        class33 var1 = (class33) field158.method3422((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field159.field3000 == var1.field3004) {
            return -1;
        } else {
            return ((class33) var1.field3004).field745;
        }
    }

    @ObfuscatedName("ds.c(II)I")
    public static int method2472(int arg0) {
        class33 var1 = (class33) field158.method3422((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field159.field3000 == var1.field3005) {
            return -1;
        } else {
            return ((class33) var1.field3005).field745;
        }
    }
}
