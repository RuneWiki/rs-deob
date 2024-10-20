package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("a")
public class class12 {

    @ObfuscatedName("a.m")
    public static final Map field160 = new HashMap();

    @ObfuscatedName("a.l")
    public static final class198 field161 = new class198(1024);

    @ObfuscatedName("a.y")
    public static final class200 field162 = new class200();

    @ObfuscatedName("a.u")
    public static int field163 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.m(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2685(int arg0, String arg1, String arg2) {
        Statics.method1003(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("au.y(IB)Lam;")
    public static class36 method733(int arg0) {
        return (class36) field161.method3589((long) arg0);
    }

    @ObfuscatedName("ao.u(II)I")
    public static int method744(int arg0) {
        class28 var1 = (class28) field160.get(arg0);
        return var1 == null ? 0 : var1.method660();
    }

    @ObfuscatedName("dm.k(IB)I")
    public static int method2304(int arg0) {
        class36 var1 = (class36) field161.method3589((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field162.field3079 == var1.field3083) {
            return -1;
        } else {
            return ((class36) var1.field3083).field755;
        }
    }
}
