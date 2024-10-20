package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("s")
public class class10 {

    @ObfuscatedName("s.p")
    public static final Map field139 = new HashMap();

    @ObfuscatedName("s.y")
    public static final class181 field132 = new class181(1024);

    @ObfuscatedName("s.d")
    public static final class183 field140 = new class183();

    @ObfuscatedName("s.c")
    public static int field134 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.p(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method616(int arg0, String arg1, String arg2) {
        method2731(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("el.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2731(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field139.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field139.put(arg0, var4);
        }
        class32 var5 = var4.method533(arg0, arg1, arg2, arg3);
        field132.method3244(var5, (long) var5.field685);
        field140.method3299(var5);
        client.field426 = client.field471;
    }

    @ObfuscatedName("ax.d(IIB)Lav;")
    public static class32 method600(int arg0, int arg1) {
        class25 var2 = (class25) field139.get(arg0);
        return var2.method534(arg1);
    }

    @ObfuscatedName("n.c(II)Lav;")
    public static class32 method521(int arg0) {
        return (class32) field132.method3243((long) arg0);
    }

    @ObfuscatedName("do.r(II)I")
    public static int method2429(int arg0) {
        class25 var1 = (class25) field139.get(arg0);
        return var1 == null ? 0 : var1.method535();
    }

    @ObfuscatedName("hl.f(B)V")
    public static void method3644() {
        field139.clear();
        field132.method3248();
        field140.method3296();
        field134 = 0;
    }

    @ObfuscatedName("g.z(II)I")
    public static int method494(int arg0) {
        class32 var1 = (class32) field132.method3243((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field140.field2887 == var1.field2892) {
            return -1;
        } else {
            return ((class32) var1.field2892).field685;
        }
    }

    @ObfuscatedName("p.o(II)I")
    public static int method1(int arg0) {
        class32 var1 = (class32) field132.method3243((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field140.field2887 == var1.field2891) {
            return -1;
        } else {
            return ((class32) var1.field2891).field685;
        }
    }
}
