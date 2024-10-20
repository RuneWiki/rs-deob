package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("h")
public class class12 {

    @ObfuscatedName("h.f")
    public static final Map field172 = new HashMap();

    @ObfuscatedName("h.e")
    public static final class202 field168 = new class202(1024);

    @ObfuscatedName("h.n")
    public static final class204 field175 = new class204();

    @ObfuscatedName("h.t")
    public static int field170 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.f(I)I")
    public static int method838() {
        return ++field170 - 1;
    }

    @ObfuscatedName("gs.e(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3563(int arg0, String arg1, String arg2) {
        method2095(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cu.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2095(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field172.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field172.put(arg0, var4);
        }
        class38 var5 = var4.method663(arg0, arg1, arg2, arg3);
        field168.method3638(var5, (long) var5.field794);
        field175.method3674(var5);
        client.field326 = client.field296;
    }

    @ObfuscatedName("ay.t(II)I")
    public static int method617(int arg0) {
        class30 var1 = (class30) field172.get(arg0);
        return var1 == null ? 0 : var1.method654();
    }

    @ObfuscatedName("do.b(IB)I")
    public static int method2298(int arg0) {
        class38 var1 = (class38) field168.method3637((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field175.field3151 == var1.field3157) {
            return -1;
        } else {
            return ((class38) var1.field3157).field794;
        }
    }
}
