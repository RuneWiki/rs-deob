package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ez")
public class class110 {

    @ObfuscatedName("ez.at")
    public static final Map field1374 = new HashMap();

    @ObfuscatedName("ez.an")
    public static final class476 field1375 = new class476(1024);

    @ObfuscatedName("ez.av")
    public static final class381 field1376 = new class381();

    @ObfuscatedName("ez.as")
    public static int field1377 = 0;

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.at(S)I")
    public static int method646() {
        return ++field1377 - 1;
    }

    @ObfuscatedName("cy.an(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1047(int arg0, String arg1, String arg2) {
        method1115(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ci.av(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1115(int arg0, String arg1, String arg2, String arg3) {
        class81 var4 = (class81) field1374.get(arg0);
        if (var4 == null) {
            var4 = new class81();
            field1374.put(arg0, var4);
        }
        class65 var5 = var4.method2058(arg0, arg1, arg2, arg3);
        field1375.method7857(var5, (long) var5.field483);
        field1376.method6460(var5);
        client.field707 = client.field587;
    }

    @ObfuscatedName("ed.as(III)Lcg;")
    public static class65 method2722(int arg0, int arg1) {
        class81 var2 = (class81) field1374.get(arg0);
        return var2.method2059(arg1);
    }

    @ObfuscatedName("gz.ax(II)Lcg;")
    public static class65 method3099(int arg0) {
        return (class65) field1375.method7848((long) arg0);
    }

    @ObfuscatedName("ep.ap(II)I")
    public static int method2728(int arg0) {
        class81 var1 = (class81) field1374.get(arg0);
        return var1 == null ? 0 : var1.method2057();
    }

    @ObfuscatedName("dv.ab(I)V")
    public static void method2240() {
        Iterator var0 = field1375.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1094();
        }
    }

    @ObfuscatedName("lp.ak(II)I")
    public static int method5150(int arg0) {
        class65 var1 = (class65) field1375.method7848((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1376.field4388 == var1.field4749) {
            return -1;
        } else {
            return ((class65) var1.field4749).field483;
        }
    }

    @ObfuscatedName("ee.ae(II)I")
    public static int method2532(int arg0) {
        class65 var1 = (class65) field1375.method7848((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1376.field4388 == var1.field4750) {
            return -1;
        } else {
            return ((class65) var1.field4750).field483;
        }
    }
}
