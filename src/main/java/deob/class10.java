package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("e")
public class class10 {

    @ObfuscatedName("e.n")
    public static final Map field159 = new HashMap();

    @ObfuscatedName("e.x")
    public static final class177 field163 = new class177(1024);

    @ObfuscatedName("e.k")
    public static final class179 field149 = new class179();

    @ObfuscatedName("e.i")
    public static int field152 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.n(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2769(int arg0, String arg1, String arg2) {
        Statics.method590(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("n.k(IB)I")
    public static int method2(int arg0) {
        class24 var1 = (class24) field159.get(arg0);
        return var1 == null ? 0 : var1.method528();
    }

    @ObfuscatedName("aj.i(I)V")
    public static void method759() {
        field159.clear();
        field163.method3175();
        field149.method3219();
        field152 = 0;
    }

    @ObfuscatedName("i.d(IB)I")
    public static int method28(int arg0) {
        class31 var1 = (class31) field163.method3169((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field149.field2872 == var1.field2877) {
            return -1;
        } else {
            return ((class31) var1.field2877).field704;
        }
    }

    @ObfuscatedName("cv.q(B)Ljava/lang/String;")
    public static String method1983() {
        String var0 = "";
        Iterator var1 = field163.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field706 + ':' + var2.field709 + '\n';
        }
        return var0;
    }
}
