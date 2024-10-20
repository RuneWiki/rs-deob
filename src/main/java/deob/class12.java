package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("l")
public class class12 {

    @ObfuscatedName("l.o")
    public static final Map field164 = new HashMap();

    @ObfuscatedName("l.e")
    public static final class198 field165 = new class198(1024);

    @ObfuscatedName("l.u")
    public static final class200 field170 = new class200();

    @ObfuscatedName("l.b")
    public static int field167 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.o(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2960(int arg0, String arg1, String arg2) {
        method132(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("d.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method132(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field164.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field164.put(arg0, var4);
        }
        class36 var5 = var4.method650(arg0, arg1, arg2, arg3);
        field165.method3563(var5, (long) var5.field780);
        field170.method3603(var5);
        client.field559 = client.field460;
    }

    @ObfuscatedName("aj.u(IB)Lam;")
    public static class36 method751(int arg0) {
        return (class36) field165.method3564((long) arg0);
    }

    @ObfuscatedName("s.b(II)I")
    public static int method89(int arg0) {
        class28 var1 = (class28) field164.get(arg0);
        return var1 == null ? 0 : var1.method653();
    }

    @ObfuscatedName("ea.p(I)V")
    public static void method2940() {
        field164.clear();
        field165.method3565();
        field170.method3607();
        field167 = 0;
    }

    @ObfuscatedName("e.s(II)I")
    public static int method2(int arg0) {
        class36 var1 = (class36) field165.method3564((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field170.field3097 == var1.field3101) {
            return -1;
        } else {
            return ((class36) var1.field3101).field780;
        }
    }

    @ObfuscatedName("am.y(II)I")
    public static int method722(int arg0) {
        class36 var1 = (class36) field165.method3564((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field170.field3097 == var1.field3102) {
            return -1;
        } else {
            return ((class36) var1.field3102).field780;
        }
    }

    @ObfuscatedName("e.t(I)Ljava/lang/String;")
    public static String method10() {
        String var0 = "";
        Iterator var1 = field165.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field782 + ':' + var2.field784 + '\n';
        }
        return var0;
    }
}
