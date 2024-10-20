package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("j")
public class class11 {

    @ObfuscatedName("j.o")
    public static final Map field158 = new HashMap();

    @ObfuscatedName("j.l")
    public static final class189 field153 = new class189(1024);

    @ObfuscatedName("j.g")
    public static final class191 field154 = new class191();

    @ObfuscatedName("j.u")
    public static int field155 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.o(I)I")
    public static int method3385() {
        return ++field155 - 1;
    }

    @ObfuscatedName("ay.l(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method626(int arg0, String arg1, String arg2) {
        method2041(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cg.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2041(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field158.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field158.put(arg0, var4);
        }
        class33 var5 = var4.method571(arg0, arg1, arg2, arg3);
        field153.method3454(var5, (long) var5.field729);
        field154.method3507(var5);
        client.field278 = client.field448;
    }

    @ObfuscatedName("dl.u(IB)Lao;")
    public static class33 method2142(int arg0) {
        return (class33) field153.method3457((long) arg0);
    }

    @ObfuscatedName("dn.q(II)I")
    public static int method2599(int arg0) {
        class26 var1 = (class26) field158.get(arg0);
        return var1 == null ? 0 : var1.method574();
    }

    @ObfuscatedName("u.r(IB)I")
    public static int method34(int arg0) {
        class33 var1 = (class33) field153.method3457((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field154.field2999 == var1.field3004) {
            return -1;
        } else {
            return ((class33) var1.field3004).field729;
        }
    }
}
