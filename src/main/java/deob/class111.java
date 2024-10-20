package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("eo")
public class class111 {

    @ObfuscatedName("eo.at")
    public static final Map field1400 = new HashMap();

    @ObfuscatedName("eo.ah")
    public static final class500 field1397 = new class500(1024);

    @ObfuscatedName("eo.ar")
    public static final class395 field1399 = new class395();

    @ObfuscatedName("eo.ao")
    public static int field1398 = 0;

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ob.at(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method6477(int arg0, String arg1, String arg2) {
        method2214(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dh.ah(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2214(int arg0, String arg1, String arg2, String arg3) {
        class81 var4 = (class81) field1400.get(arg0);
        if (var4 == null) {
            var4 = new class81();
            field1400.put(arg0, var4);
        }
        class65 var5 = var4.method2131(arg0, arg1, arg2, arg3);
        field1397.method8135(var5, (long) var5.field471);
        field1399.method6696(var5);
        client.field742 = client.field682;
    }

    @ObfuscatedName("ay.ar(IIB)Lco;")
    public static class65 method185(int arg0, int arg1) {
        class81 var2 = (class81) field1400.get(arg0);
        return var2.method2132(arg1);
    }

    @ObfuscatedName("bf.ao(IB)Lco;")
    public static class65 method465(int arg0) {
        return (class65) field1397.method8134((long) arg0);
    }

    @ObfuscatedName("co.ab(II)I")
    public static int method1163(int arg0) {
        class81 var1 = (class81) field1400.get(arg0);
        return var1 == null ? 0 : var1.method2130();
    }

    @ObfuscatedName("dz.au(I)V")
    public static void method2403() {
        field1400.clear();
        field1397.method8136();
        field1399.method6706();
        field1398 = 0;
    }

    @ObfuscatedName("ag.aa(B)V")
    public static void method326() {
        Iterator var0 = field1397.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1134();
        }
    }

    @ObfuscatedName("da.ac(II)I")
    public static int method2321(int arg0) {
        class65 var1 = (class65) field1397.method8134((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1399.field4449 == var1.field4844) {
            return -1;
        } else {
            return ((class65) var1.field4844).field471;
        }
    }

    @ObfuscatedName("ax.al(II)I")
    public static int method134(int arg0) {
        class65 var1 = (class65) field1397.method8134((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1399.field4449 == var1.field4842) {
            return -1;
        } else {
            return ((class65) var1.field4842).field471;
        }
    }

    @ObfuscatedName("je.az(I)Ljava/lang/String;")
    public static String method4476() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1397.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            if (var2.field465 != null && !var2.field465.isEmpty()) {
                var0.append(var2.field465).append(':');
            }
            var0.append(var2.field464).append('\n');
        }
        return var0.toString();
    }
}
