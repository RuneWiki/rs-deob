package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.j")
    public static final Map field175 = new HashMap();

    @ObfuscatedName("b.l")
    public static final class198 field173 = new class198(1024);

    @ObfuscatedName("b.a")
    public static final class200 field174 = new class200();

    @ObfuscatedName("b.i")
    public static int field177 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method183(int arg0, String arg1, String arg2) {
        method919(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ae.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method919(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field175.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field175.put(arg0, var4);
        }
        class36 var5 = var4.method636(arg0, arg1, arg2, arg3);
        field173.method3515(var5, (long) var5.field790);
        field174.method3554(var5);
        client.field481 = client.field393;
    }

    @ObfuscatedName("ef.a(II)I")
    public static int method2749(int arg0) {
        class28 var1 = (class28) field175.get(arg0);
        return var1 == null ? 0 : var1.method637();
    }

    @ObfuscatedName("s.i(IB)I")
    public static int method179(int arg0) {
        class36 var1 = (class36) field173.method3516((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field174.field3097 == var1.field3102) {
            return -1;
        } else {
            return ((class36) var1.field3102).field790;
        }
    }
}
