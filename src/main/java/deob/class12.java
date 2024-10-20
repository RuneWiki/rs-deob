package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("e")
public class class12 {

    @ObfuscatedName("e.n")
    public static final Map field187 = new HashMap();

    @ObfuscatedName("e.q")
    public static final class198 field191 = new class198(1024);

    @ObfuscatedName("e.c")
    public static final class200 field184 = new class200();

    @ObfuscatedName("e.l")
    public static int field183 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.n(I)I")
    public static int method2310() {
        return ++field183 - 1;
    }

    @ObfuscatedName("hj.q(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3686(int arg0, String arg1, String arg2) {
        method264(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("client.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method264(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field187.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field187.put(arg0, var4);
        }
        class36 var5 = var4.method645(arg0, arg1, arg2, arg3);
        field191.method3532(var5, (long) var5.field786);
        field184.method3578(var5);
        client.field484 = client.field477;
    }

    @ObfuscatedName("gu.l(II)Lan;")
    public static class36 method3470(int arg0) {
        return (class36) field191.method3533((long) arg0);
    }

    @ObfuscatedName("as.r(II)I")
    public static int method1074(int arg0) {
        class28 var1 = (class28) field187.get(arg0);
        return var1 == null ? 0 : var1.method647();
    }

    @ObfuscatedName("aw.u(II)I")
    public static int method948(int arg0) {
        class36 var1 = (class36) field191.method3533((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field184.field3096 == var1.field3101) {
            return -1;
        } else {
            return ((class36) var1.field3101).field786;
        }
    }
}
