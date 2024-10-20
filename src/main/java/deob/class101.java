package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cv")
public class class101 {

    @ObfuscatedName("cv.h")
    public static final Map field1289 = new HashMap();

    @ObfuscatedName("cv.v")
    public static final class327 field1286 = new class327(1024);

    @ObfuscatedName("cv.x")
    public static final class277 field1285 = new class277();

    @ObfuscatedName("cv.w")
    public static int field1288 = 0;

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.h(I)I")
    public static int method1993() {
        return ++field1288 - 1;
    }

    @ObfuscatedName("ff.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3215(int arg0, String arg1, String arg2, String arg3) {
        class104 var4 = (class104) field1289.get(arg0);
        if (var4 == null) {
            var4 = new class104();
            field1289.put(arg0, var4);
        }
        class74 var5 = var4.method2140(arg0, arg1, arg2, arg3);
        field1286.method5503(var5, (long) var5.field599);
        field1285.method4624(var5);
        client.field841 = client.field738;
    }

    @ObfuscatedName("ey.w(III)Lbg;")
    public static class74 method3123(int arg0, int arg1) {
        class104 var2 = (class104) field1289.get(arg0);
        return var2.method2141(arg1);
    }

    @ObfuscatedName("gk.t(II)Lbg;")
    public static class74 method3381(int arg0) {
        return (class74) field1286.method5494((long) arg0);
    }

    @ObfuscatedName("bx.j(II)I")
    public static int method786(int arg0) {
        class104 var1 = (class104) field1289.get(arg0);
        return var1 == null ? 0 : var1.method2142();
    }

    @ObfuscatedName("bi.n(I)V")
    public static void method1082() {
        field1289.clear();
        field1286.method5495();
        field1285.method4629();
        field1288 = 0;
    }

    @ObfuscatedName("ct.p(I)V")
    public static void method2026() {
        Iterator var0 = field1286.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1148();
        }
    }

    @ObfuscatedName("aa.l(II)I")
    public static int method537(int arg0) {
        class74 var1 = (class74) field1286.method5494((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1285.field3580 == var1.field2129) {
            return -1;
        } else {
            return ((class74) var1.field2129).field599;
        }
    }

    @ObfuscatedName("hj.z(IB)I")
    public static int method3639(int arg0) {
        class74 var1 = (class74) field1286.method5494((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1285.field3580 == var1.field2130) {
            return -1;
        } else {
            return ((class74) var1.field2130).field599;
        }
    }
}
