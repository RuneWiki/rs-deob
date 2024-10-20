package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ec")
public class class112 {

    @ObfuscatedName("ec.aq")
    public static final Map field1420 = new HashMap();

    @ObfuscatedName("ec.aw")
    public static final class507 field1422 = new class507(1024);

    @ObfuscatedName("ec.al")
    public static final class402 field1421 = new class402();

    @ObfuscatedName("ec.ai")
    public static int field1419 = 0;

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.aq(B)I")
    public static int method292() {
        return ++field1419 - 1;
    }

    @ObfuscatedName("if.aw(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3792(int arg0, String arg1, String arg2) {
        method1111(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cy.al(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1111(int arg0, String arg1, String arg2, String arg3) {
        class82 var4 = (class82) field1420.get(arg0);
        if (var4 == null) {
            var4 = new class82();
            field1420.put(arg0, var4);
        }
        class65 var5 = var4.method2148(arg0, arg1, arg2, arg3);
        field1422.method8319(var5, (long) var5.field483);
        field1421.method6836(var5);
        client.field732 = client.field726;
    }

    @ObfuscatedName("ee.ai(IIB)Lcy;")
    public static class65 method2639(int arg0, int arg1) {
        class82 var2 = (class82) field1420.get(arg0);
        return var2.method2149(arg1);
    }

    @ObfuscatedName("client.ar(II)Lcy;")
    public static class65 method1716(int arg0) {
        return (class65) field1422.method8299((long) arg0);
    }

    @ObfuscatedName("mr.as(II)I")
    public static int method5456(int arg0) {
        class82 var1 = (class82) field1420.get(arg0);
        return var1 == null ? 0 : var1.method2150();
    }

    @ObfuscatedName("df.aa(I)V")
    public static void method2521() {
        field1420.clear();
        field1422.method8308();
        field1421.method6835();
        field1419 = 0;
    }

    @ObfuscatedName("dy.az(I)V")
    public static void method2340() {
        Iterator var0 = field1422.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1092();
        }
    }

    @ObfuscatedName("dc.ao(I)V")
    public static void method2142() {
        Iterator var0 = field1422.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1098();
        }
    }

    @ObfuscatedName("bd.au(IS)I")
    public static int method394(int arg0) {
        class65 var1 = (class65) field1422.method8299((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1421.field4529 == var1.field4914) {
            return -1;
        } else {
            return ((class65) var1.field4914).field483;
        }
    }
}
