package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("h")
public class class12 {

    @ObfuscatedName("h.a")
    public static final Map field170 = new HashMap();

    @ObfuscatedName("h.r")
    public static final class198 field165 = new class198(1024);

    @ObfuscatedName("h.f")
    public static final class200 field166 = new class200();

    @ObfuscatedName("h.s")
    public static int field167 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.a(I)I")
    public static int method624() {
        return ++field167 - 1;
    }

    @ObfuscatedName("eu.r(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2769(int arg0, String arg1, String arg2) {
        method6(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("a.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method6(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field170.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field170.put(arg0, var4);
        }
        class36 var5 = var4.method634(arg0, arg1, arg2, arg3);
        field165.method3562(var5, (long) var5.field790);
        field166.method3597(var5);
        client.field487 = client.field480;
    }

    @ObfuscatedName("dc.s(II)I")
    public static int method2629(int arg0) {
        class28 var1 = (class28) field170.get(arg0);
        return var1 == null ? 0 : var1.method632();
    }

    @ObfuscatedName("h.y(II)I")
    public static int method164(int arg0) {
        class36 var1 = (class36) field165.method3564((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field166.field3096 == var1.field3100) {
            return -1;
        } else {
            return ((class36) var1.field3100).field790;
        }
    }

    @ObfuscatedName("ea.g(I)Ljava/lang/String;")
    public static String method2685() {
        String var0 = "";
        Iterator var1 = field165.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field792 + ':' + var2.field794 + '\n';
        }
        return var0;
    }
}
