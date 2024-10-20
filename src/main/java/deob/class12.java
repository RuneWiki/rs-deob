package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("w")
public class class12 {

    @ObfuscatedName("w.j")
    public static final Map field172 = new HashMap();

    @ObfuscatedName("w.m")
    public static final class198 field167 = new class198(1024);

    @ObfuscatedName("w.f")
    public static final class200 field173 = new class200();

    @ObfuscatedName("w.l")
    public static int field168 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1029(int arg0, String arg1, String arg2) {
        method1957(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cx.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1957(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field172.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field172.put(arg0, var4);
        }
        class36 var5 = var4.method678(arg0, arg1, arg2, arg3);
        field167.method3585(var5, (long) var5.field770);
        field173.method3634(var5);
        client.field467 = client.field460;
    }

    @ObfuscatedName("cu.f(IIB)Lav;")
    public static class36 method2153(int arg0, int arg1) {
        class28 var2 = (class28) field172.get(arg0);
        return var2.method672(arg1);
    }

    @ObfuscatedName("au.l(IB)I")
    public static int method956(int arg0) {
        class28 var1 = (class28) field172.get(arg0);
        return var1 == null ? 0 : var1.method673();
    }

    @ObfuscatedName("fn.u(IB)I")
    public static int method3005(int arg0) {
        class36 var1 = (class36) field167.method3586((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field173.field3089 == var1.field3094) {
            return -1;
        } else {
            return ((class36) var1.field3094).field770;
        }
    }

    @ObfuscatedName("cf.a(B)Ljava/lang/String;")
    public static String method1960() {
        String var0 = "";
        Iterator var1 = field167.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field775 + ':' + var2.field772 + '\n';
        }
        return var0;
    }
}
