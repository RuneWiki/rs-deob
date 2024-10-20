package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("eo")
public class class106 {

    @ObfuscatedName("eo.af")
    public static final Map field1376 = new HashMap();

    @ObfuscatedName("eo.an")
    public static final class464 field1375 = new class464(1024);

    @ObfuscatedName("eo.aw")
    public static final class368 field1378 = new class368();

    @ObfuscatedName("eo.ac")
    public static int field1377 = 0;

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.af(I)I")
    public static int method2963() {
        return ++field1377 - 1;
    }

    @ObfuscatedName("es.an(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2767(int arg0, String arg1, String arg2) {
        method3024(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("fo.aw(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method3024(int arg0, String arg1, String arg2, String arg3) {
        class77 var4 = (class77) field1376.get(arg0);
        if (var4 == null) {
            var4 = new class77();
            field1376.put(arg0, var4);
        }
        class61 var5 = var4.method2048(arg0, arg1, arg2, arg3);
        field1375.method7946(var5, (long) var5.field471);
        field1378.method6480(var5);
        client.field752 = client.field680;
    }

    @ObfuscatedName("de.ac(III)Lcq;")
    public static class61 method2253(int arg0, int arg1) {
        class77 var2 = (class77) field1376.get(arg0);
        return var2.method2049(arg1);
    }

    @ObfuscatedName("dl.au(IB)Lcq;")
    public static class61 method2161(int arg0) {
        return (class61) field1375.method7945((long) arg0);
    }

    @ObfuscatedName("ga.aq(B)V")
    public static void method3183() {
        field1376.clear();
        field1375.method7947();
        field1378.method6463();
        field1377 = 0;
    }

    @ObfuscatedName("bm.al(I)V")
    public static void method578() {
        Iterator var0 = field1375.iterator();
        while (var0.hasNext()) {
            class61 var1 = (class61) var0.next();
            var1.method1127();
        }
    }

    @ObfuscatedName("eh.at(B)V")
    public static void method2906() {
        Iterator var0 = field1375.iterator();
        while (var0.hasNext()) {
            class61 var1 = (class61) var0.next();
            var1.method1101();
        }
    }

    @ObfuscatedName("er.aa(II)I")
    public static int method2801(int arg0) {
        class61 var1 = (class61) field1375.method7945((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1378.field4368 == var1.field4740) {
            return -1;
        } else {
            return ((class61) var1.field4740).field471;
        }
    }

    @ObfuscatedName("ir.ay(II)I")
    public static int method4348(int arg0) {
        class61 var1 = (class61) field1375.method7945((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1378.field4368 == var1.field4739) {
            return -1;
        } else {
            return ((class61) var1.field4739).field471;
        }
    }
}
