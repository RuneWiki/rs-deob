package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("h")
public class class12 {

    @ObfuscatedName("h.m")
    public static final Map field157 = new HashMap();

    @ObfuscatedName("h.w")
    public static final class202 field158 = new class202(1024);

    @ObfuscatedName("h.e")
    public static final class204 field159 = new class204();

    @ObfuscatedName("h.o")
    public static int field160 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.m(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1270(int arg0, String arg1, String arg2) {
        method571(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("q.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method571(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field157.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field157.put(arg0, var4);
        }
        class38 var5 = var4.method646(arg0, arg1, arg2, arg3);
        field158.method3600(var5, (long) var5.field810);
        field159.method3651(var5);
        client.field463 = client.field456;
    }

    @ObfuscatedName("j.e(B)V")
    public static void method87() {
        field157.clear();
        field158.method3602();
        field159.method3653();
        field160 = 0;
    }

    @ObfuscatedName("du.o(II)I")
    public static int method2296(int arg0) {
        class38 var1 = (class38) field158.method3603((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field159.field3152 == var1.field3158) {
            return -1;
        } else {
            return ((class38) var1.field3158).field810;
        }
    }

    @ObfuscatedName("av.g(II)I")
    public static int method711(int arg0) {
        class38 var1 = (class38) field158.method3603((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field159.field3152 == var1.field3157) {
            return -1;
        } else {
            return ((class38) var1.field3157).field810;
        }
    }

    @ObfuscatedName("ae.l(I)Ljava/lang/String;")
    public static String method1063() {
        String var0 = "";
        Iterator var1 = field158.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var0 = var0 + var2.field812 + ':' + var2.field813 + '\n';
        }
        return var0;
    }
}
