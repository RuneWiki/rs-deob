package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("c")
public class class10 {

    @ObfuscatedName("c.k")
    public static final Map field143 = new HashMap();

    @ObfuscatedName("c.y")
    public static final class177 field136 = new class177(1024);

    @ObfuscatedName("c.s")
    public static final class179 field137 = new class179();

    @ObfuscatedName("c.g")
    public static int field141 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.k(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method132(int arg0, String arg1, String arg2) {
        method532(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("an.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method532(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field143.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field143.put(arg0, var4);
        }
        class31 var5 = var4.method467(arg0, arg1, arg2, arg3);
        field136.method3257(var5, (long) var5.field693);
        field137.method3310(var5);
        client.field311 = client.field303;
    }

    @ObfuscatedName("cq.s(III)Lar;")
    public static class31 method1984(int arg0, int arg1) {
        class24 var2 = (class24) field143.get(arg0);
        return var2.method468(arg1);
    }

    @ObfuscatedName("dl.g(IB)Lar;")
    public static class31 method2423(int arg0) {
        return (class31) field136.method3268((long) arg0);
    }

    @ObfuscatedName("as.h(I)V")
    public static void method656() {
        field143.clear();
        field136.method3258();
        field137.method3309();
        field141 = 0;
    }

    @ObfuscatedName("f.l(I)Ljava/lang/String;")
    public static String method486() {
        String var0 = "";
        Iterator var1 = field136.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field690 + ':' + var2.field695 + '\n';
        }
        return var0;
    }
}
