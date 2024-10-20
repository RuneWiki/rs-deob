package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("d")
public class class10 {

    @ObfuscatedName("d.g")
    public static final Map field141 = new HashMap();

    @ObfuscatedName("d.j")
    public static final class179 field140 = new class179(1024);

    @ObfuscatedName("d.z")
    public static final class181 field143 = new class181();

    @ObfuscatedName("d.b")
    public static int field142 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.g(S)I")
    public static int method2350() {
        return ++field142 - 1;
    }

    @ObfuscatedName("au.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method995(int arg0, String arg1, String arg2) {
        method974(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("au.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method974(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field141.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field141.put(arg0, var4);
        }
        class32 var5 = var4.method502(arg0, arg1, arg2, arg3);
        field140.method3155(var5, (long) var5.field711);
        field143.method3205(var5);
        client.field482 = client.field433;
    }

    @ObfuscatedName("client.b(I)V")
    public static void method450() {
        field141.clear();
        field140.method3158();
        field143.method3202();
        field142 = 0;
    }

    @ObfuscatedName("at.k(I)Ljava/lang/String;")
    public static String method559() {
        String var0 = "";
        Iterator var1 = field140.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var0 = var0 + var2.field710 + ':' + var2.field715 + '\n';
        }
        return var0;
    }
}
