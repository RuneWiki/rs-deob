package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cz")
public class class101 {

    @ObfuscatedName("cz.z")
    public static final Map field1305 = new HashMap();

    @ObfuscatedName("cz.k")
    public static final class326 field1302 = new class326(1024);

    @ObfuscatedName("cz.s")
    public static final class276 field1306 = new class276();

    @ObfuscatedName("cz.t")
    public static int field1304 = 0;

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.z(ILjava/lang/String;Ljava/lang/String;S)V")
    public static void method317(int arg0, String arg1, String arg2) {
        method230(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("l.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method230(int arg0, String arg1, String arg2, String arg3) {
        class104 var4 = (class104) field1305.get(arg0);
        if (var4 == null) {
            var4 = new class104();
            field1305.put(arg0, var4);
        }
        class74 var5 = var4.method2146(arg0, arg1, arg2, arg3);
        field1302.method5583(var5, (long) var5.field613);
        field1306.method4679(var5);
        client.field870 = client.field863;
    }

    @ObfuscatedName("ad.s(IIB)Lbk;")
    public static class74 method577(int arg0, int arg1) {
        class104 var2 = (class104) field1305.get(arg0);
        return var2.method2144(arg1);
    }

    @ObfuscatedName("au.t(IB)Lbk;")
    public static class74 method329(int arg0) {
        return (class74) field1302.method5582((long) arg0);
    }

    @ObfuscatedName("cs.i(II)I")
    public static int method2027(int arg0) {
        class104 var1 = (class104) field1305.get(arg0);
        return var1 == null ? 0 : var1.method2154();
    }

    @ObfuscatedName("cq.o(I)V")
    public static void method1951() {
        Iterator var0 = field1302.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1122();
        }
    }

    @ObfuscatedName("fz.x(I)V")
    public static void method3226() {
        Iterator var0 = field1302.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1100();
        }
    }

    @ObfuscatedName("bt.w(II)I")
    public static int method1193(int arg0) {
        class74 var1 = (class74) field1302.method5582((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1306.field3566 == var1.field2148) {
            return -1;
        } else {
            return ((class74) var1.field2148).field613;
        }
    }

    @ObfuscatedName("cu.g(II)I")
    public static int method1939(int arg0) {
        class74 var1 = (class74) field1302.method5582((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1306.field3566 == var1.field2147) {
            return -1;
        } else {
            return ((class74) var1.field2147).field613;
        }
    }
}
