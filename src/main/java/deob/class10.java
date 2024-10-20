package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("u")
public class class10 {

    @ObfuscatedName("u.e")
    public static final Map field164 = new HashMap();

    @ObfuscatedName("u.v")
    public static final class176 field157 = new class176(1024);

    @ObfuscatedName("u.i")
    public static final class178 field161 = new class178();

    @ObfuscatedName("u.g")
    public static int field162 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.e(I)I")
    public static int method72() {
        return ++field162 - 1;
    }

    @ObfuscatedName("eq.v(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2658(int arg0, String arg1, String arg2) {
        method845(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ai.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method845(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field164.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field164.put(arg0, var4);
        }
        class31 var5 = var4.method496(arg0, arg1, arg2, arg3);
        field157.method3174(var5, (long) var5.field696);
        field161.method3218(var5);
        client.field453 = client.field446;
    }

    @ObfuscatedName("ap.g(II)Lak;")
    public static class31 method590(int arg0) {
        return (class31) field157.method3177((long) arg0);
    }

    @ObfuscatedName("au.x(II)I")
    public static int method816(int arg0) {
        class24 var1 = (class24) field164.get(arg0);
        return var1 == null ? 0 : var1.method498();
    }

    @ObfuscatedName("bc.b(IB)I")
    public static int method1047(int arg0) {
        class31 var1 = (class31) field157.method3177((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field161.field2851 == var1.field2855) {
            return -1;
        } else {
            return ((class31) var1.field2855).field696;
        }
    }

    @ObfuscatedName("n.q(I)Ljava/lang/String;")
    public static String method508() {
        String var0 = "";
        Iterator var1 = field157.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field704 + ':' + var2.field701 + '\n';
        }
        return var0;
    }
}
