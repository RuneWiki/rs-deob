package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ew")
public class class111 {

    @ObfuscatedName("ew.am")
    public static final Map field1396 = new HashMap();

    @ObfuscatedName("ew.ap")
    public static final class504 field1394 = new class504(1024);

    @ObfuscatedName("ew.af")
    public static final class399 field1395 = new class399();

    @ObfuscatedName("ew.aj")
    public static int field1398 = 0;

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("on.am(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method6511(int arg0, String arg1, String arg2) {
        method2260(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("da.ap(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2260(int arg0, String arg1, String arg2, String arg3) {
        class81 var4 = (class81) field1396.get(arg0);
        if (var4 == null) {
            var4 = new class81();
            field1396.put(arg0, var4);
        }
        class65 var5 = var4.method2170(arg0, arg1, arg2, arg3);
        field1394.method8292(var5, (long) var5.field480);
        field1395.method6815(var5);
        client.field704 = client.field695;
    }

    @ObfuscatedName("ku.af(III)Lco;")
    public static class65 method4731(int arg0, int arg1) {
        class81 var2 = (class81) field1396.get(arg0);
        return var2.method2175(arg1);
    }

    @ObfuscatedName("ay.aj(II)Lco;")
    public static class65 method286(int arg0) {
        return (class65) field1394.method8286((long) arg0);
    }

    @ObfuscatedName("cn.aq(II)I")
    public static int method1187(int arg0) {
        class81 var1 = (class81) field1396.get(arg0);
        return var1 == null ? 0 : var1.method2173();
    }

    @ObfuscatedName("em.ag(I)V")
    public static void method2795() {
        Iterator var0 = field1394.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1148();
        }
    }

    @ObfuscatedName("mh.ao(I)V")
    public static void method5428() {
        Iterator var0 = field1394.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1151();
        }
    }

    @ObfuscatedName("iq.ae(II)I")
    public static int method3907(int arg0) {
        class65 var1 = (class65) field1394.method8286((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1395.field4488 == var1.field4882) {
            return -1;
        } else {
            return ((class65) var1.field4882).field480;
        }
    }

    @ObfuscatedName("ir.aa(IB)I")
    public static int method4164(int arg0) {
        class65 var1 = (class65) field1394.method8286((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1395.field4488 == var1.field4883) {
            return -1;
        } else {
            return ((class65) var1.field4883).field480;
        }
    }
}
