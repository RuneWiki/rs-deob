package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("w")
public class class10 {

    @ObfuscatedName("w.g")
    public static final Map field132 = new HashMap();

    @ObfuscatedName("w.s")
    public static final class177 field133 = new class177(1024);

    @ObfuscatedName("w.h")
    public static final class179 field139 = new class179();

    @ObfuscatedName("w.m")
    public static int field135 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.g(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method100(int arg0, String arg1, String arg2) {
        method81(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("j.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method81(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field132.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field132.put(arg0, var4);
        }
        class31 var5 = var4.method518(arg0, arg1, arg2, arg3);
        field133.method3180(var5, (long) var5.field702);
        field139.method3220(var5);
        client.field359 = client.field429;
    }

    @ObfuscatedName("bt.h(III)Lar;")
    public static class31 method1427(int arg0, int arg1) {
        class24 var2 = (class24) field132.get(arg0);
        return var2.method519(arg1);
    }

    @ObfuscatedName("fx.m(II)Lar;")
    public static class31 method3114(int arg0) {
        return (class31) field133.method3184((long) arg0);
    }

    @ObfuscatedName("ax.u(II)I")
    public static int method1016(int arg0) {
        class24 var1 = (class24) field132.get(arg0);
        return var1 == null ? 0 : var1.method520();
    }

    @ObfuscatedName("ed.j(B)V")
    public static void method2649() {
        field132.clear();
        field133.method3181();
        field139.method3219();
        field135 = 0;
    }

    @ObfuscatedName("at.b(II)I")
    public static int method593(int arg0) {
        class31 var1 = (class31) field133.method3184((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field139.field2858 == var1.field2862) {
            return -1;
        } else {
            return ((class31) var1.field2862).field702;
        }
    }
}
