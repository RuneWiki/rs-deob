package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("et")
public class class112 {

    @ObfuscatedName("et.az")
    public static final Map field1428 = new HashMap();

    @ObfuscatedName("et.ah")
    public static final class508 field1429 = new class508(1024);

    @ObfuscatedName("et.af")
    public static final class403 field1430 = new class403();

    @ObfuscatedName("et.at")
    public static int field1431 = 0;

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.az(B)I")
    public static int method2861() {
        return ++field1431 - 1;
    }

    @ObfuscatedName("da.ah(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2177(int arg0, String arg1, String arg2) {
        method3399(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("hh.af(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3399(int arg0, String arg1, String arg2, String arg3) {
        class82 var4 = (class82) field1428.get(arg0);
        if (var4 == null) {
            var4 = new class82();
            field1428.put(arg0, var4);
        }
        class65 var5 = var4.method2110(arg0, arg1, arg2, arg3);
        field1429.method8200(var5, (long) var5.field468);
        field1430.method6759(var5);
        client.field716 = client.field707;
    }

    @ObfuscatedName("ah.at(IIS)Lcn;")
    public static class65 method9(int arg0, int arg1) {
        class82 var2 = (class82) field1428.get(arg0);
        return var2.method2113(arg1);
    }

    @ObfuscatedName("nn.an(II)Lcn;")
    public static class65 method5679(int arg0) {
        return (class65) field1429.method8177((long) arg0);
    }

    @ObfuscatedName("ox.ao(II)I")
    public static int method6325(int arg0) {
        class82 var1 = (class82) field1428.get(arg0);
        return var1 == null ? 0 : var1.method2109();
    }

    @ObfuscatedName("kh.ab(I)V")
    public static void method5120() {
        Iterator var0 = field1429.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1090();
        }
    }

    @ObfuscatedName("rp.aw(II)I")
    public static int method7368(int arg0) {
        class65 var1 = (class65) field1429.method8177((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1430.field4552 == var1.field4946) {
            return -1;
        } else {
            return ((class65) var1.field4946).field468;
        }
    }

    @ObfuscatedName("ml.ad(II)I")
    public static int method5646(int arg0) {
        class65 var1 = (class65) field1429.method8177((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1430.field4552 == var1.field4945) {
            return -1;
        } else {
            return ((class65) var1.field4945).field468;
        }
    }
}
