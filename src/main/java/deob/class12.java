package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("s")
public class class12 {

    @ObfuscatedName("s.i")
    public static final Map field184 = new HashMap();

    @ObfuscatedName("s.h")
    public static final class202 field193 = new class202(1024);

    @ObfuscatedName("s.e")
    public static final class204 field183 = new class204();

    @ObfuscatedName("s.g")
    public static int field186 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.i(B)I")
    public static int method1829() {
        return ++field186 - 1;
    }

    @ObfuscatedName("dq.h(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2280(int arg0, String arg1, String arg2) {
        method639(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("af.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method639(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field184.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field184.put(arg0, var4);
        }
        class38 var5 = var4.method626(arg0, arg1, arg2, arg3);
        field193.method3582(var5, (long) var5.field808);
        field183.method3628(var5);
        client.field493 = client.field486;
    }

    @ObfuscatedName("ao.g(III)Law;")
    public static class38 method764(int arg0, int arg1) {
        class30 var2 = (class30) field184.get(arg0);
        return var2.method627(arg1);
    }

    @ObfuscatedName("bi.n(IS)Law;")
    public static class38 method1079(int arg0) {
        return (class38) field193.method3579((long) arg0);
    }

    @ObfuscatedName("v.u(B)V")
    public static void method156() {
        field184.clear();
        field193.method3588();
        field183.method3621();
        field186 = 0;
    }
}
