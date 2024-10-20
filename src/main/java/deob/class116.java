package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("el")
public class class116 {

    @ObfuscatedName("el.ap")
    public static final Map field1465 = new HashMap();

    @ObfuscatedName("el.aw")
    public static final class530 field1464 = new class530(1024);

    @ObfuscatedName("el.ak")
    public static final class416 field1467 = new class416();

    @ObfuscatedName("el.aj")
    public static int field1466 = 0;

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.ap(I)I")
    public static int method2908() {
        return ++field1466 - 1;
    }

    @ObfuscatedName("qn.ak(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method7444(int arg0, String arg1, String arg2, String arg3) {
        class84 var4 = (class84) field1465.get(arg0);
        if (var4 == null) {
            var4 = new class84();
            field1465.put(arg0, var4);
        }
        class65 var5 = var4.method2375(arg0, arg1, arg2, arg3);
        field1464.method8970(var5, (long) var5.field456);
        field1467.method7400(var5);
        client.field665 = client.field555;
    }

    @ObfuscatedName("il.aj(III)Lce;")
    public static class65 method4272(int arg0, int arg1) {
        class84 var2 = (class84) field1465.get(arg0);
        return var2.method2376(arg1);
    }

    @ObfuscatedName("client.ai(II)Lce;")
    public static class65 method1564(int arg0) {
        return (class65) field1464.method8985((long) arg0);
    }

    @ObfuscatedName("gq.ay(II)I")
    public static int method3571(int arg0) {
        class84 var1 = (class84) field1465.get(arg0);
        return var1 == null ? 0 : var1.method2377();
    }

    @ObfuscatedName("cu.as(I)V")
    public static void method1162() {
        Iterator var0 = field1464.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1169();
        }
    }

    @ObfuscatedName("uk.ae(IB)I")
    public static int method9131(int arg0) {
        class65 var1 = (class65) field1464.method8985((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1467.field4738 == var1.field5164) {
            return -1;
        } else {
            return ((class65) var1.field5164).field456;
        }
    }

    @ObfuscatedName("ib.am(II)I")
    public static int method4363(int arg0) {
        class65 var1 = (class65) field1464.method8985((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1467.field4738 == var1.field5163) {
            return -1;
        } else {
            return ((class65) var1.field5163).field456;
        }
    }
}
