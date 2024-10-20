package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("da")
public class class107 {

    @ObfuscatedName("da.h")
    public static final Map field1414 = new HashMap();

    @ObfuscatedName("da.e")
    public static final class443 field1418 = new class443(1024);

    @ObfuscatedName("da.v")
    public static final class357 field1416 = new class357();

    @ObfuscatedName("da.x")
    public static int field1417 = 0;

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.h(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3247(int arg0, String arg1, String arg2) {
        method6720(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("nq.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method6720(int arg0, String arg1, String arg2, String arg3) {
        class78 var4 = (class78) field1414.get(arg0);
        if (var4 == null) {
            var4 = new class78();
            field1414.put(arg0, var4);
        }
        class62 var5 = var4.method2029(arg0, arg1, arg2, arg3);
        field1418.method7523(var5, (long) var5.field487);
        field1416.method6235(var5);
        client.field715 = client.field706;
    }

    @ObfuscatedName("ew.v(IIB)Lbv;")
    public static class62 method2855(int arg0, int arg1) {
        class78 var2 = (class78) field1414.get(arg0);
        return var2.method2028(arg1);
    }

    @ObfuscatedName("bm.x(II)Lbv;")
    public static class62 method2023(int arg0) {
        return (class62) field1418.method7525((long) arg0);
    }

    @ObfuscatedName("eq.m(IB)I")
    public static int method2892(int arg0) {
        class78 var1 = (class78) field1414.get(arg0);
        return var1 == null ? 0 : var1.method2030();
    }

    @ObfuscatedName("ls.q(I)V")
    public static void method5776() {
        field1414.clear();
        field1418.method7512();
        field1416.method6234();
        field1417 = 0;
    }

    @ObfuscatedName("as.f(B)V")
    public static void method370() {
        Iterator var0 = field1418.iterator();
        while (var0.hasNext()) {
            class62 var1 = (class62) var0.next();
            var1.method1110();
        }
    }

    @ObfuscatedName("bk.r(II)I")
    public static int method2027(int arg0) {
        class62 var1 = (class62) field1418.method7525((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1416.field4342 == var1.field4677) {
            return -1;
        } else {
            return ((class62) var1.field4677).field487;
        }
    }

    @ObfuscatedName("lc.u(II)I")
    public static int method5762(int arg0) {
        class62 var1 = (class62) field1418.method7525((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1416.field4342 == var1.field4679) {
            return -1;
        } else {
            return ((class62) var1.field4679).field487;
        }
    }

    @ObfuscatedName("co.b(I)Ljava/lang/String;")
    public static String method2263() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1418.iterator();
        while (var1.hasNext()) {
            class62 var2 = (class62) var1.next();
            if (var2.field489 != null && !var2.field489.isEmpty()) {
                var0.append(var2.field489).append(':');
            }
            var0.append(var2.field492).append('\n');
        }
        return var0.toString();
    }
}
