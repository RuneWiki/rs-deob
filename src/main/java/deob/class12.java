package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("p")
public class class12 {

    @ObfuscatedName("p.t")
    public static final Map field176 = new HashMap();

    @ObfuscatedName("p.i")
    public static final class199 field181 = new class199(1024);

    @ObfuscatedName("p.g")
    public static final class201 field175 = new class201();

    @ObfuscatedName("p.h")
    public static int field173 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.t(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method683(int arg0, String arg1, String arg2) {
        method316(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("client.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method316(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field176.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field176.put(arg0, var4);
        }
        class36 var5 = var4.method609(arg0, arg1, arg2, arg3);
        field181.method3499(var5, (long) var5.field781);
        field175.method3545(var5);
        client.field475 = client.field468;
    }

    @ObfuscatedName("bf.g(IB)Lan;")
    public static class36 method1025(int arg0) {
        return (class36) field181.method3498((long) arg0);
    }

    @ObfuscatedName("ak.h(II)I")
    public static int method709(int arg0) {
        class28 var1 = (class28) field176.get(arg0);
        return var1 == null ? 0 : var1.method611();
    }

    @ObfuscatedName("ae.z(I)V")
    public static void method860() {
        field176.clear();
        field181.method3501();
        field175.method3543();
        field173 = 0;
    }

    @ObfuscatedName("q.f(I)Ljava/lang/String;")
    public static String method534() {
        String var0 = "";
        Iterator var1 = field181.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field779 + ':' + var2.field785 + '\n';
        }
        return var0;
    }
}
