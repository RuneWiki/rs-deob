package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cx")
public class class101 {

    @ObfuscatedName("cx.m")
    public static final Map field1304 = new HashMap();

    @ObfuscatedName("cx.o")
    public static final class326 field1302 = new class326(1024);

    @ObfuscatedName("cx.q")
    public static final class276 field1303 = new class276();

    @ObfuscatedName("cx.j")
    public static int field1306 = 0;

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.m(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1815(int arg0, String arg1, String arg2) {
        method541(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("an.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method541(int arg0, String arg1, String arg2, String arg3) {
        class104 var4 = (class104) field1304.get(arg0);
        if (var4 == null) {
            var4 = new class104();
            field1304.put(arg0, var4);
        }
        class74 var5 = var4.method2153(arg0, arg1, arg2, arg3);
        field1302.method5614(var5, (long) var5.field625);
        field1303.method4705(var5);
        client.field866 = client.field859;
    }

    @ObfuscatedName("j.q(III)Lbr;")
    public static class74 method29(int arg0, int arg1) {
        class104 var2 = (class104) field1304.get(arg0);
        return var2.method2150(arg1);
    }

    @ObfuscatedName("gz.j(IB)Lbr;")
    public static class74 method3449(int arg0) {
        return (class74) field1302.method5615((long) arg0);
    }

    @ObfuscatedName("s.p(IB)I")
    public static int method127(int arg0) {
        class104 var1 = (class104) field1304.get(arg0);
        return var1 == null ? 0 : var1.method2151();
    }

    @ObfuscatedName("cw.g(B)V")
    public static void method1712() {
        field1304.clear();
        field1302.method5617();
        field1303.method4713();
        field1306 = 0;
    }

    @ObfuscatedName("ex.n(B)V")
    public static void method2902() {
        Iterator var0 = field1302.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1092();
        }
    }

    @ObfuscatedName("ar.u(II)I")
    public static int method406(int arg0) {
        class74 var1 = (class74) field1302.method5615((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1303.field3578 == var1.field2145) {
            return -1;
        } else {
            return ((class74) var1.field2145).field625;
        }
    }
}
