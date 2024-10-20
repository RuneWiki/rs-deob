package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("v")
public class class12 {

    @ObfuscatedName("v.f")
    public static final Map field181 = new HashMap();

    @ObfuscatedName("v.s")
    public static final class198 field183 = new class198(1024);

    @ObfuscatedName("v.q")
    public static final class200 field182 = new class200();

    @ObfuscatedName("v.g")
    public static int field179 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.f(B)I")
    public static int method3237() {
        return ++field179 - 1;
    }

    @ObfuscatedName("gn.s(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method3488(int arg0, String arg1, String arg2) {
        method2064(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cj.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2064(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field181.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field181.put(arg0, var4);
        }
        class36 var5 = var4.method627(arg0, arg1, arg2, arg3);
        field183.method3556(var5, (long) var5.field796);
        field182.method3597(var5);
        client.field376 = client.field302;
    }

    @ObfuscatedName("f.g(III)Lar;")
    public static class36 method3(int arg0, int arg1) {
        class28 var2 = (class28) field181.get(arg0);
        return var2.method628(arg1);
    }
}
