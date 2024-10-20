package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("o")
public class class10 {

    @ObfuscatedName("o.f")
    public static final Map field146 = new HashMap();

    @ObfuscatedName("o.k")
    public static final class179 field144 = new class179(1024);

    @ObfuscatedName("o.y")
    public static final class181 field145 = new class181();

    @ObfuscatedName("o.e")
    public static int field147 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.f(I)I")
    public static int method2344() {
        return ++field147 - 1;
    }

    @ObfuscatedName("dh.k(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2441(int arg0, String arg1, String arg2) {
        method1819(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ck.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1819(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field146.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field146.put(arg0, var4);
        }
        class32 var5 = var4.method536(arg0, arg1, arg2, arg3);
        field144.method3262(var5, (long) var5.field714);
        field145.method3306(var5);
        client.field443 = client.field495;
    }

    @ObfuscatedName("l.e(IIB)Lao;")
    public static class32 method495(int arg0, int arg1) {
        class25 var2 = (class25) field146.get(arg0);
        return var2.method537(arg1);
    }

    @ObfuscatedName("a.r(IB)I")
    public static int method52(int arg0) {
        class25 var1 = (class25) field146.get(arg0);
        return var1 == null ? 0 : var1.method538();
    }

    @ObfuscatedName("j.a(II)I")
    public static int method474(int arg0) {
        class32 var1 = (class32) field144.method3261((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field145.field2868 == var1.field2872) {
            return -1;
        } else {
            return ((class32) var1.field2872).field714;
        }
    }

    @ObfuscatedName("eu.n(B)Ljava/lang/String;")
    public static String method2751() {
        String var0 = "";
        Iterator var1 = field144.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var0 = var0 + var2.field716 + ':' + var2.field719 + '\n';
        }
        return var0;
    }
}
