package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("eo")
public class class111 {

    @ObfuscatedName("eo.aw")
    public static final Map field1407 = new HashMap();

    @ObfuscatedName("eo.ay")
    public static final class489 field1405 = new class489(1024);

    @ObfuscatedName("eo.ar")
    public static final class384 field1406 = new class384();

    @ObfuscatedName("eo.am")
    public static int field1408 = 0;

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qr.aw(I)I")
    public static int method7160() {
        return ++field1408 - 1;
    }

    @ObfuscatedName("pr.ay(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method7045(int arg0, String arg1, String arg2) {
        method3823(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ih.ar(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method3823(int arg0, String arg1, String arg2, String arg3) {
        class81 var4 = (class81) field1407.get(arg0);
        if (var4 == null) {
            var4 = new class81();
            field1407.put(arg0, var4);
        }
        class65 var5 = var4.method2095(arg0, arg1, arg2, arg3);
        field1405.method7962(var5, (long) var5.field497);
        field1406.method6512(var5);
        client.field718 = client.field709;
    }

    @ObfuscatedName("dk.am(III)Lcx;")
    public static class65 method2179(int arg0, int arg1) {
        class81 var2 = (class81) field1407.get(arg0);
        return var2.method2083(arg1);
    }

    @ObfuscatedName("em.as(IB)Lcx;")
    public static class65 method2555(int arg0) {
        return (class65) field1405.method7961((long) arg0);
    }

    @ObfuscatedName("lv.aj(II)I")
    public static int method5172(int arg0) {
        class81 var1 = (class81) field1407.get(arg0);
        return var1 == null ? 0 : var1.method2082();
    }

    @ObfuscatedName("bh.ag(B)V")
    public static void method829() {
        field1407.clear();
        field1405.method7963();
        field1406.method6511();
        field1408 = 0;
    }

    @ObfuscatedName("ec.az(B)V")
    public static void method2562() {
        Iterator var0 = field1405.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1141();
        }
    }

    @ObfuscatedName("nx.ap(IB)I")
    public static int method6112(int arg0) {
        class65 var1 = (class65) field1405.method7961((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1406.field4426 == var1.field4813) {
            return -1;
        } else {
            return ((class65) var1.field4813).field497;
        }
    }
}
