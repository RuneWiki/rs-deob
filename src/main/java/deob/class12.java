package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("g")
public class class12 {

    @ObfuscatedName("g.n")
    public static final Map field171 = new HashMap();

    @ObfuscatedName("g.d")
    public static final class198 field167 = new class198(1024);

    @ObfuscatedName("g.s")
    public static final class200 field168 = new class200();

    @ObfuscatedName("g.q")
    public static int field169 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.n(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2001(int arg0, String arg1, String arg2) {
        method822(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ah.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method822(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field171.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field171.put(arg0, var4);
        }
        class36 var5 = var4.method627(arg0, arg1, arg2, arg3);
        field167.method3536(var5, (long) var5.field770);
        field168.method3589(var5);
        client.field493 = client.field459;
    }

    @ObfuscatedName("g.s(III)Lau;")
    public static class36 method121(int arg0, int arg1) {
        class28 var2 = (class28) field171.get(arg0);
        return var2.method628(arg1);
    }

    @ObfuscatedName("di.q(II)I")
    public static int method2595(int arg0) {
        class28 var1 = (class28) field171.get(arg0);
        return var1 == null ? 0 : var1.method629();
    }

    @ObfuscatedName("ao.j(II)I")
    public static int method944(int arg0) {
        class36 var1 = (class36) field167.method3541((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field168.field3082 == var1.field3087) {
            return -1;
        } else {
            return ((class36) var1.field3087).field770;
        }
    }

    @ObfuscatedName("dt.k(I)Ljava/lang/String;")
    public static String method2256() {
        String var0 = "";
        Iterator var1 = field167.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field762 + ':' + var2.field759 + '\n';
        }
        return var0;
    }
}
