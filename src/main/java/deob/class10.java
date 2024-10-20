package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("p")
public class class10 {

    @ObfuscatedName("p.g")
    public static final Map field159 = new HashMap();

    @ObfuscatedName("p.s")
    public static final class177 field152 = new class177(1024);

    @ObfuscatedName("p.v")
    public static final class179 field153 = new class179();

    @ObfuscatedName("p.o")
    public static int field157 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.g(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1845(int arg0, String arg1, String arg2) {
        method3306(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("gy.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method3306(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field159.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field159.put(arg0, var4);
        }
        class31 var5 = var4.method499(arg0, arg1, arg2, arg3);
        field152.method3171(var5, (long) var5.field696);
        field153.method3220(var5);
        client.field503 = client.field448;
    }

    @ObfuscatedName("an.v(III)Lax;")
    public static class31 method775(int arg0, int arg1) {
        class24 var2 = (class24) field159.get(arg0);
        return var2.method506(arg1);
    }

    @ObfuscatedName("q.o(IB)I")
    public static int method148(int arg0) {
        class24 var1 = (class24) field159.get(arg0);
        return var1 == null ? 0 : var1.method507();
    }

    @ObfuscatedName("g.k(I)V")
    public static void method2() {
        field159.clear();
        field152.method3168();
        field153.method3219();
        field157 = 0;
    }

    @ObfuscatedName("cp.m(IB)I")
    public static int method2034(int arg0) {
        class31 var1 = (class31) field152.method3181((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field153.field2868 == var1.field2873) {
            return -1;
        } else {
            return ((class31) var1.field2873).field696;
        }
    }

    @ObfuscatedName("ed.i(II)I")
    public static int method2744(int arg0) {
        class31 var1 = (class31) field152.method3181((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field153.field2868 == var1.field2872) {
            return -1;
        } else {
            return ((class31) var1.field2872).field696;
        }
    }

    @ObfuscatedName("ao.t(I)Ljava/lang/String;")
    public static String method683() {
        String var0 = "";
        Iterator var1 = field152.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field694 + ':' + var2.field692 + '\n';
        }
        return var0;
    }
}
