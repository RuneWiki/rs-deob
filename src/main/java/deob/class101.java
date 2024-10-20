package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ch")
public class class101 {

    @ObfuscatedName("ch.n")
    public static final Map field1290 = new HashMap();

    @ObfuscatedName("ch.v")
    public static final class327 field1291 = new class327(1024);

    @ObfuscatedName("ch.d")
    public static final class277 field1289 = new class277();

    @ObfuscatedName("ch.c")
    public static int field1292 = 0;

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.n(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method314(int arg0, String arg1, String arg2) {
        method5998(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("mn.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method5998(int arg0, String arg1, String arg2, String arg3) {
        class104 var4 = (class104) field1290.get(arg0);
        if (var4 == null) {
            var4 = new class104();
            field1290.put(arg0, var4);
        }
        class74 var5 = var4.method2221(arg0, arg1, arg2, arg3);
        field1291.method5649(var5, (long) var5.field608);
        field1289.method4772(var5);
        client.field710 = client.field850;
    }

    @ObfuscatedName("cz.d(III)Lbd;")
    public static class74 method2018(int arg0, int arg1) {
        class104 var2 = (class104) field1290.get(arg0);
        return var2.method2215(arg1);
    }

    @ObfuscatedName("ca.c(II)Lbd;")
    public static class74 method2006(int arg0) {
        return (class74) field1291.method5648((long) arg0);
    }

    @ObfuscatedName("fz.y(IB)I")
    public static int method3368(int arg0) {
        class104 var1 = (class104) field1290.get(arg0);
        return var1 == null ? 0 : var1.method2216();
    }

    @ObfuscatedName("gz.h(B)V")
    public static void method3480() {
        Iterator var0 = field1291.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1140();
        }
    }

    @ObfuscatedName("cq.z(S)V")
    public static void method1761() {
        Iterator var0 = field1291.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1143();
        }
    }

    @ObfuscatedName("cd.e(II)I")
    public static int method1713(int arg0) {
        class74 var1 = (class74) field1291.method5648((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1289.field3582 == var1.field2131) {
            return -1;
        } else {
            return ((class74) var1.field2131).field608;
        }
    }

    @ObfuscatedName("bo.q(II)I")
    public static int method1685(int arg0) {
        class74 var1 = (class74) field1291.method5648((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1289.field3582 == var1.field2133) {
            return -1;
        } else {
            return ((class74) var1.field2133).field608;
        }
    }
}
