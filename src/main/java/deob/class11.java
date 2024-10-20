package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("u")
public class class11 {

    @ObfuscatedName("u.j")
    public static final Map field171 = new HashMap();

    @ObfuscatedName("u.y")
    public static final class192 field177 = new class192(1024);

    @ObfuscatedName("u.z")
    public static final class194 field169 = new class194();

    @ObfuscatedName("u.l")
    public static int field170 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1792(int arg0, String arg1, String arg2) {
        Statics.method37(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("a.z(II)I")
    public static int method120(int arg0) {
        class34 var1 = (class34) field177.method3473((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field169.field3029 == var1.field3034) {
            return -1;
        } else {
            return ((class34) var1.field3034).field775;
        }
    }

    @ObfuscatedName("cg.l(IB)I")
    public static int method2154(int arg0) {
        class34 var1 = (class34) field177.method3473((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field169.field3029 == var1.field3033) {
            return -1;
        } else {
            return ((class34) var1.field3033).field775;
        }
    }

    @ObfuscatedName("ev.w(I)Ljava/lang/String;")
    public static String method2887() {
        String var0 = "";
        Iterator var1 = field177.iterator();
        while (var1.hasNext()) {
            class34 var2 = (class34) var1.next();
            var0 = var0 + var2.field769 + ':' + var2.field773 + '\n';
        }
        return var0;
    }
}
