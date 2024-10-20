package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("l")
public class class10 {

    @ObfuscatedName("l.x")
    public static final Map field143 = new HashMap();

    @ObfuscatedName("l.v")
    public static final class179 field141 = new class179(1024);

    @ObfuscatedName("l.m")
    public static final class181 field142 = new class181();

    @ObfuscatedName("l.e")
    public static int field149 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.x(ILjava/lang/String;Ljava/lang/String;S)V")
    public static void method2806(int arg0, String arg1, String arg2) {
        method133(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("b.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method133(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field143.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field143.put(arg0, var4);
        }
        class32 var5 = var4.method532(arg0, arg1, arg2, arg3);
        field141.method3232(var5, (long) var5.field714);
        field142.method3279(var5);
        client.field235 = client.field272;
    }

    @ObfuscatedName("ce.m(II)Lau;")
    public static class32 method1884(int arg0) {
        return (class32) field141.method3233((long) arg0);
    }

    @ObfuscatedName("i.e(II)I")
    public static int method80(int arg0) {
        class25 var1 = (class25) field143.get(arg0);
        return var1 == null ? 0 : var1.method526();
    }

    @ObfuscatedName("df.h(I)V")
    public static void method2443() {
        field143.clear();
        field141.method3235();
        field142.method3280();
        field149 = 0;
    }

    @ObfuscatedName("ae.p(IB)I")
    public static int method538(int arg0) {
        class32 var1 = (class32) field141.method3233((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field142.field2866 == var1.field2870) {
            return -1;
        } else {
            return ((class32) var1.field2870).field714;
        }
    }

    @ObfuscatedName("cx.j(I)Ljava/lang/String;")
    public static String method2058() {
        String var0 = "";
        Iterator var1 = field141.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var0 = var0 + var2.field705 + ':' + var2.field709 + '\n';
        }
        return var0;
    }
}
