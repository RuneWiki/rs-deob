package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("dc")
public class class111 {

    @ObfuscatedName("dc.f")
    public static final Map field1377 = new HashMap();

    @ObfuscatedName("dc.o")
    public static final class360 field1376 = new class360(1024);

    @ObfuscatedName("dc.u")
    public static final class277 field1379 = new class277();

    @ObfuscatedName("dc.p")
    public static int field1375 = 0;

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method930(int arg0, String arg1, String arg2) {
        method1718(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ce.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1718(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1377.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1377.put(arg0, var4);
        }
        class73 var5 = var4.method1753(arg0, arg1, arg2, arg3);
        field1376.method5630(var5, (long) var5.field583);
        field1379.method4297(var5);
        client.field871 = client.field605;
    }

    @ObfuscatedName("du.u(III)Lbs;")
    public static class73 method2151(int arg0, int arg1) {
        class89 var2 = (class89) field1377.get(arg0);
        return var2.method1750(arg1);
    }

    @ObfuscatedName("ks.p(II)Lbs;")
    public static class73 method4892(int arg0) {
        return (class73) field1376.method5621((long) arg0);
    }

    @ObfuscatedName("hb.b(II)I")
    public static int method3831(int arg0) {
        class89 var1 = (class89) field1377.get(arg0);
        return var1 == null ? 0 : var1.method1751();
    }

    @ObfuscatedName("cc.e(I)V")
    public static void method1748() {
        field1377.clear();
        field1376.method5623();
        field1379.method4296();
        field1375 = 0;
    }

    @ObfuscatedName("al.k(I)V")
    public static void method506() {
        Iterator var0 = field1376.iterator();
        while (var0.hasNext()) {
            class73 var1 = (class73) var0.next();
            var1.method941();
        }
    }

    @ObfuscatedName("ab.g(II)I")
    public static int method344(int arg0) {
        class73 var1 = (class73) field1376.method5621((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1379.field3393 == var1.field3934) {
            return -1;
        } else {
            return ((class73) var1.field3934).field583;
        }
    }

    @ObfuscatedName("ca.h(II)I")
    public static int method1760(int arg0) {
        class73 var1 = (class73) field1376.method5621((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1379.field3393 == var1.field3936) {
            return -1;
        } else {
            return ((class73) var1.field3936).field583;
        }
    }
}
