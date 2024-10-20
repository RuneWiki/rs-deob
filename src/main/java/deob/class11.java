package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("v")
public class class11 {

    @ObfuscatedName("v.b")
    public static final Map field149 = new HashMap();

    @ObfuscatedName("v.e")
    public static final class189 field150 = new class189(1024);

    @ObfuscatedName("v.a")
    public static final class191 field151 = new class191();

    @ObfuscatedName("v.k")
    public static int field152 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.b(ILjava/lang/String;Ljava/lang/String;S)V")
    public static void method2070(int arg0, String arg1, String arg2) {
        method498(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("w.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method498(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field149.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field149.put(arg0, var4);
        }
        class33 var5 = var4.method540(arg0, arg1, arg2, arg3);
        field150.method3303(var5, (long) var5.field714);
        field151.method3354(var5);
        client.field472 = client.field437;
    }

    @ObfuscatedName("ci.a(II)I")
    public static int method1960(int arg0) {
        class26 var1 = (class26) field149.get(arg0);
        return var1 == null ? 0 : var1.method542();
    }

    @ObfuscatedName("aj.k(I)V")
    public static void method1036() {
        field149.clear();
        field150.method3306();
        field151.method3352();
        field152 = 0;
    }

    @ObfuscatedName("ev.p(IB)I")
    public static int method2765(int arg0) {
        class33 var1 = (class33) field150.method3304((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field151.field2991 == var1.field2996) {
            return -1;
        } else {
            return ((class33) var1.field2996).field714;
        }
    }
}
