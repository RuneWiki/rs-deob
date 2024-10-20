package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ck")
public class class101 {

    @ObfuscatedName("ck.x")
    public static final Map field1293 = new HashMap();

    @ObfuscatedName("ck.m")
    public static final class326 field1292 = new class326(1024);

    @ObfuscatedName("ck.k")
    public static final class276 field1291 = new class276();

    @ObfuscatedName("ck.d")
    public static int field1294 = 0;

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.x(I)I")
    public static int method1186() {
        return ++field1294 - 1;
    }

    @ObfuscatedName("eb.m(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2911(int arg0, String arg1, String arg2) {
        method2151(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cl.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2151(int arg0, String arg1, String arg2, String arg3) {
        class104 var4 = (class104) field1293.get(arg0);
        if (var4 == null) {
            var4 = new class104();
            field1293.put(arg0, var4);
        }
        class74 var5 = var4.method2144(arg0, arg1, arg2, arg3);
        field1292.method5514(var5, (long) var5.field623);
        field1291.method4627(var5);
        client.field904 = client.field866;
    }

    @ObfuscatedName("m.d(IIB)Lby;")
    public static class74 method10(int arg0, int arg1) {
        class104 var2 = (class104) field1293.get(arg0);
        return var2.method2143(arg1);
    }

    @ObfuscatedName("bw.w(II)Lby;")
    public static class74 method1660(int arg0) {
        return (class74) field1292.method5519((long) arg0);
    }

    @ObfuscatedName("dv.v(II)I")
    public static int method2177(int arg0) {
        class104 var1 = (class104) field1293.get(arg0);
        return var1 == null ? 0 : var1.method2142();
    }

    @ObfuscatedName("cu.q(I)V")
    public static void method1930() {
        field1293.clear();
        field1292.method5515();
        field1291.method4638();
        field1294 = 0;
    }

    @ObfuscatedName("be.z(IB)I")
    public static int method809(int arg0) {
        class74 var1 = (class74) field1292.method5519((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1291.field3543 == var1.field2108) {
            return -1;
        } else {
            return ((class74) var1.field2108).field623;
        }
    }

    @ObfuscatedName("cm.t(II)I")
    public static int method1834(int arg0) {
        class74 var1 = (class74) field1292.method5519((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1291.field3543 == var1.field2110) {
            return -1;
        } else {
            return ((class74) var1.field2110).field623;
        }
    }
}
