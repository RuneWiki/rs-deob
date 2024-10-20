package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("dz")
public class class106 {

    @ObfuscatedName("dz.f")
    public static final Map field1384 = new HashMap();

    @ObfuscatedName("dz.w")
    public static final class450 field1381 = new class450(1024);

    @ObfuscatedName("dz.v")
    public static final class361 field1383 = new class361();

    @ObfuscatedName("dz.s")
    public static int field1389 = 0;

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method5047(int arg0, String arg1, String arg2) {
        method2977(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("el.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2977(int arg0, String arg1, String arg2, String arg3) {
        class77 var4 = (class77) field1384.get(arg0);
        if (var4 == null) {
            var4 = new class77();
            field1384.put(arg0, var4);
        }
        class61 var5 = var4.method2108(arg0, arg1, arg2, arg3);
        field1381.method7693(var5, (long) var5.field485);
        field1383.method6371(var5);
        client.field709 = client.field700;
    }

    @ObfuscatedName("bq.v(IIB)Lbq;")
    public static class61 method1126(int arg0, int arg1) {
        class77 var2 = (class77) field1384.get(arg0);
        return var2.method2109(arg1);
    }

    @ObfuscatedName("o.s(IB)Lbq;")
    public static class61 method265(int arg0) {
        return (class61) field1381.method7691((long) arg0);
    }

    @ObfuscatedName("bp.z(IB)I")
    public static int method2083(int arg0) {
        class77 var1 = (class77) field1384.get(arg0);
        return var1 == null ? 0 : var1.method2112();
    }

    @ObfuscatedName("ed.j(I)V")
    public static void method2994() {
        field1384.clear();
        field1381.method7698();
        field1383.method6370();
        field1389 = 0;
    }

    @ObfuscatedName("im.i(II)I")
    public static int method4921(int arg0) {
        class61 var1 = (class61) field1381.method7691((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1383.field4356 == var1.field4703) {
            return -1;
        } else {
            return ((class61) var1.field4703).field485;
        }
    }

    @ObfuscatedName("n.n(II)I")
    public static int method68(int arg0) {
        class61 var1 = (class61) field1381.method7691((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1383.field4356 == var1.field4702) {
            return -1;
        } else {
            return ((class61) var1.field4702).field485;
        }
    }

    @ObfuscatedName("hf.l(I)Ljava/lang/String;")
    public static String method3881() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1381.iterator();
        while (var1.hasNext()) {
            class61 var2 = (class61) var1.next();
            if (var2.field480 != null && !var2.field480.isEmpty()) {
                var0.append(var2.field480).append(':');
            }
            var0.append(var2.field481).append('\n');
        }
        return var0.toString();
    }
}
