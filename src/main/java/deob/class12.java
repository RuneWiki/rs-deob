package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("z")
public class class12 {

    @ObfuscatedName("z.v")
    public static final Map field181 = new HashMap();

    @ObfuscatedName("z.f")
    public static final class198 field172 = new class198(1024);

    @ObfuscatedName("z.i")
    public static final class200 field171 = new class200();

    @ObfuscatedName("z.d")
    public static int field174 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.v(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method869(int arg0, String arg1, String arg2) {
        method3470(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("gh.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3470(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field181.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field181.put(arg0, var4);
        }
        class36 var5 = var4.method621(arg0, arg1, arg2, arg3);
        field172.method3550(var5, (long) var5.field788);
        field171.method3587(var5);
        client.field479 = client.field422;
    }

    @ObfuscatedName("c.i(II)Laj;")
    public static class36 method49(int arg0) {
        return (class36) field172.method3545((long) arg0);
    }

    @ObfuscatedName("aj.d(II)I")
    public static int method725(int arg0) {
        class28 var1 = (class28) field181.get(arg0);
        return var1 == null ? 0 : var1.method622();
    }

    @ObfuscatedName("cd.o(IB)I")
    public static int method1956(int arg0) {
        class36 var1 = (class36) field172.method3545((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field171.field3100 == var1.field3105) {
            return -1;
        } else {
            return ((class36) var1.field3105).field788;
        }
    }

    @ObfuscatedName("c.c(I)Ljava/lang/String;")
    public static String method61() {
        String var0 = "";
        Iterator var1 = field172.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field789 + ':' + var2.field786 + '\n';
        }
        return var0;
    }
}
