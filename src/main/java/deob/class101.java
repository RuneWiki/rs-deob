package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ch")
public class class101 {

    @ObfuscatedName("ch.f")
    public static final Map field1305 = new HashMap();

    @ObfuscatedName("ch.b")
    public static final class327 field1306 = new class327(1024);

    @ObfuscatedName("ch.l")
    public static final class277 field1304 = new class277();

    @ObfuscatedName("ch.m")
    public static int field1307 = 0;

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kl.f(S)I")
    public static int method4894() {
        return ++field1307 - 1;
    }

    @ObfuscatedName("bg.b(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method783(int arg0, String arg1, String arg2) {
        method50(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("m.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method50(int arg0, String arg1, String arg2, String arg3) {
        class104 var4 = (class104) field1305.get(arg0);
        if (var4 == null) {
            var4 = new class104();
            field1305.put(arg0, var4);
        }
        class74 var5 = var4.method2173(arg0, arg1, arg2, arg3);
        field1306.method5576(var5, (long) var5.field639);
        field1304.method4694(var5);
        client.field762 = client.field867;
    }

    @ObfuscatedName("z.m(IIB)Lbk;")
    public static class74 method56(int arg0, int arg1) {
        class104 var2 = (class104) field1305.get(arg0);
        return var2.method2172(arg1);
    }

    @ObfuscatedName("cn.z(II)Lbk;")
    public static class74 method1971(int arg0) {
        return (class74) field1306.method5561((long) arg0);
    }

    @ObfuscatedName("l.q(II)I")
    public static int method22(int arg0) {
        class104 var1 = (class104) field1305.get(arg0);
        return var1 == null ? 0 : var1.method2162();
    }

    @ObfuscatedName("eg.k(I)V")
    public static void method3152() {
        field1305.clear();
        field1306.method5563();
        field1304.method4693();
        field1307 = 0;
    }

    @ObfuscatedName("t.c(I)V")
    public static void method104() {
        Iterator var0 = field1306.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1144();
        }
    }

    @ObfuscatedName("cw.u(II)I")
    public static int method1977(int arg0) {
        class74 var1 = (class74) field1306.method5561((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1304.field3568 == var1.field2134) {
            return -1;
        } else {
            return ((class74) var1.field2134).field639;
        }
    }

    @ObfuscatedName("dz.t(II)I")
    public static int method2401(int arg0) {
        class74 var1 = (class74) field1306.method5561((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1304.field3568 == var1.field2133) {
            return -1;
        } else {
            return ((class74) var1.field2133).field639;
        }
    }

    @ObfuscatedName("is.e(I)Ljava/lang/String;")
    public static String method3879() {
        String var0 = "";
        Iterator var1 = field1306.iterator();
        while (var1.hasNext()) {
            class74 var2 = (class74) var1.next();
            var0 = var0 + var2.field642 + ':' + var2.field640 + '\n';
        }
        return var0;
    }
}
