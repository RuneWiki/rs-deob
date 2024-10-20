package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.k")
    public static final Map field164 = new HashMap();

    @ObfuscatedName("b.q")
    public static final class202 field168 = new class202(1024);

    @ObfuscatedName("b.f")
    public static final class204 field165 = new class204();

    @ObfuscatedName("b.c")
    public static int field167 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.k(I)I")
    public static int method1044() {
        return ++field167 - 1;
    }

    @ObfuscatedName("fw.q(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3256(int arg0, String arg1, String arg2) {
        method2358(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ds.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2358(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field164.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field164.put(arg0, var4);
        }
        class38 var5 = var4.method653(arg0, arg1, arg2, arg3);
        field168.method3589(var5, (long) var5.field802);
        field165.method3629(var5);
        client.field473 = client.field466;
    }

    @ObfuscatedName("as.c(II)Lar;")
    public static class38 method1006(int arg0) {
        return (class38) field168.method3587((long) arg0);
    }
}
