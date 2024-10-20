package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("dg")
public class class112 {

    @ObfuscatedName("dg.f")
    public static final Map field1394 = new HashMap();

    @ObfuscatedName("dg.e")
    public static final class362 field1390 = new class362(1024);

    @ObfuscatedName("dg.v")
    public static final class300 field1391 = new class300();

    @ObfuscatedName("dg.y")
    public static int field1392 = 0;

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.f(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2289(int arg0, String arg1, String arg2) {
        method1894(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cd.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1894(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1394.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1394.put(arg0, var4);
        }
        class73 var5 = var4.method1843(arg0, arg1, arg2, arg3);
        field1390.method5669(var5, (long) var5.field598);
        field1391.method4845(var5);
        client.field817 = client.field808;
    }

    @ObfuscatedName("client.v(III)Lbl;")
    public static class73 method1486(int arg0, int arg1) {
        class89 var2 = (class89) field1394.get(arg0);
        return var2.method1845(arg1);
    }

    @ObfuscatedName("client.y(II)Lbl;")
    public static class73 method1487(int arg0) {
        return (class73) field1390.method5668((long) arg0);
    }

    @ObfuscatedName("jp.j(II)I")
    public static int method4587(int arg0) {
        class89 var1 = (class89) field1394.get(arg0);
        return var1 == null ? 0 : var1.method1846();
    }

    @ObfuscatedName("bo.o(B)V")
    public static void method979() {
        field1394.clear();
        field1390.method5670();
        field1391.method4846();
        field1392 = 0;
    }

    @ObfuscatedName("ej.m(I)V")
    public static void method2360() {
        Iterator var0 = field1390.iterator();
        while (var0.hasNext()) {
            class73 var1 = (class73) var0.next();
            var1.method1022();
        }
    }

    @ObfuscatedName("hu.r(B)V")
    public static void method4050() {
        Iterator var0 = field1390.iterator();
        while (var0.hasNext()) {
            class73 var1 = (class73) var0.next();
            var1.method1012();
        }
    }

    @ObfuscatedName("n.h(II)I")
    public static int method187(int arg0) {
        class73 var1 = (class73) field1390.method5668((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1391.field3720 == var1.field3928) {
            return -1;
        } else {
            return ((class73) var1.field3928).field598;
        }
    }

    @ObfuscatedName("cq.d(II)I")
    public static int method1762(int arg0) {
        class73 var1 = (class73) field1390.method5668((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1391.field3720 == var1.field3929) {
            return -1;
        } else {
            return ((class73) var1.field3929).field598;
        }
    }
}
