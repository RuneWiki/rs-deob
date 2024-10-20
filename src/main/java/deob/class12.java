package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("m")
public class class12 {

    @ObfuscatedName("m.d")
    public static final Map field183 = new HashMap();

    @ObfuscatedName("m.p")
    public static final class198 field177 = new class198(1024);

    @ObfuscatedName("m.v")
    public static final class200 field176 = new class200();

    @ObfuscatedName("m.l")
    public static int field180 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.d(I)I")
    public static int method1069() {
        return ++field180 - 1;
    }

    @ObfuscatedName("ev.p(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2966(int arg0, String arg1, String arg2) {
        method889(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("aa.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method889(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field183.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field183.put(arg0, var4);
        }
        class36 var5 = var4.method617(arg0, arg1, arg2, arg3);
        field177.method3602(var5, (long) var5.field791);
        field176.method3644(var5);
        client.field380 = client.field474;
    }

    @ObfuscatedName("eu.l(II)Las;")
    public static class36 method2818(int arg0) {
        return (class36) field177.method3601((long) arg0);
    }

    @ObfuscatedName("fa.y(II)I")
    public static int method3276(int arg0) {
        class28 var1 = (class28) field183.get(arg0);
        return var1 == null ? 0 : var1.method618();
    }

    @ObfuscatedName("fh.w(I)V")
    public static void method3192() {
        field183.clear();
        field177.method3600();
        field176.method3642();
        field180 = 0;
    }

    @ObfuscatedName("cd.u(II)I")
    public static int method2057(int arg0) {
        class36 var1 = (class36) field177.method3601((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field176.field3091 == var1.field3095) {
            return -1;
        } else {
            return ((class36) var1.field3095).field791;
        }
    }

    @ObfuscatedName("fs.a(IB)I")
    public static int method3023(int arg0) {
        class36 var1 = (class36) field177.method3601((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field176.field3091 == var1.field3096) {
            return -1;
        } else {
            return ((class36) var1.field3096).field791;
        }
    }
}
