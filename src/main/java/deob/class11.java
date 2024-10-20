package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("f")
public class class11 {

    @ObfuscatedName("f.y")
    public static final Map field162 = new HashMap();

    @ObfuscatedName("f.k")
    public static final class189 field163 = new class189(1024);

    @ObfuscatedName("f.g")
    public static final class191 field167 = new class191();

    @ObfuscatedName("f.n")
    public static int field169 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.y(B)I")
    public static int method77() {
        return ++field169 - 1;
    }

    @ObfuscatedName("o.k(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method590(int arg0, String arg1, String arg2) {
        method411(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("client.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method411(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field162.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field162.put(arg0, var4);
        }
        class33 var5 = var4.method578(arg0, arg1, arg2, arg3);
        field163.method3376(var5, (long) var5.field734);
        field167.method3426(var5);
        client.field459 = client.field521;
    }

    @ObfuscatedName("y.n(II)Lan;")
    public static class33 method4(int arg0) {
        return (class33) field163.method3375((long) arg0);
    }

    @ObfuscatedName("x.t(I)V")
    public static void method492() {
        field162.clear();
        field163.method3388();
        field167.method3424();
        field169 = 0;
    }

    @ObfuscatedName("aq.e(B)Ljava/lang/String;")
    public static String method806() {
        String var0 = "";
        Iterator var1 = field163.iterator();
        while (var1.hasNext()) {
            class33 var2 = (class33) var1.next();
            var0 = var0 + var2.field735 + ':' + var2.field738 + '\n';
        }
        return var0;
    }
}
