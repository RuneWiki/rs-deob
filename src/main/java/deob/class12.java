package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("q")
public class class12 {

    @ObfuscatedName("q.l")
    public static final Map field183 = new HashMap();

    @ObfuscatedName("q.g")
    public static final class202 field175 = new class202(1024);

    @ObfuscatedName("q.r")
    public static final class204 field174 = new class204();

    @ObfuscatedName("q.e")
    public static int field185 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.l(I)I")
    public static int method206() {
        return ++field185 - 1;
    }

    @ObfuscatedName("cw.g(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method1632(int arg0, String arg1, String arg2) {
        method102(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("k.r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method102(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field183.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field183.put(arg0, var4);
        }
        class38 var5 = var4.method667(arg0, arg1, arg2, arg3);
        field175.method3696(var5, (long) var5.field809);
        field174.method3749(var5);
        client.field486 = client.field479;
    }

    @ObfuscatedName("at.e(III)Lap;")
    public static class38 method914(int arg0, int arg1) {
        class30 var2 = (class30) field183.get(arg0);
        return var2.method663(arg1);
    }

    @ObfuscatedName("dh.h(IB)Lap;")
    public static class38 method2426(int arg0) {
        return (class38) field175.method3698((long) arg0);
    }

    @ObfuscatedName("am.s(II)I")
    public static int method676(int arg0) {
        class30 var1 = (class30) field183.get(arg0);
        return var1 == null ? 0 : var1.method662();
    }

    @ObfuscatedName("s.k(B)V")
    public static void method90() {
        field183.clear();
        field175.method3697();
        field174.method3750();
        field185 = 0;
    }

    @ObfuscatedName("ab.u(II)I")
    public static int method753(int arg0) {
        class38 var1 = (class38) field175.method3698((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field174.field3159 == var1.field3164) {
            return -1;
        } else {
            return ((class38) var1.field3164).field809;
        }
    }

    @ObfuscatedName("as.n(I)Ljava/lang/String;")
    public static String method638() {
        String var0 = "";
        Iterator var1 = field175.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var0 = var0 + var2.field811 + ':' + var2.field808 + '\n';
        }
        return var0;
    }
}
