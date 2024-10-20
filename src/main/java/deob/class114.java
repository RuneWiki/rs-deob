package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ex")
public class class114 {

    @ObfuscatedName("ex.ak")
    public static final Map field1463 = new HashMap();

    @ObfuscatedName("ex.al")
    public static final class519 field1459 = new class519(1024);

    @ObfuscatedName("ex.aj")
    public static final class411 field1458 = new class411();

    @ObfuscatedName("ex.az")
    public static int field1461 = 0;

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.ak(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2802(int arg0, String arg1, String arg2) {
        method8180(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("tk.al(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method8180(int arg0, String arg1, String arg2, String arg3) {
        class83 var4 = (class83) field1463.get(arg0);
        if (var4 == null) {
            var4 = new class83();
            field1463.put(arg0, var4);
        }
        class65 var5 = var4.method2133(arg0, arg1, arg2, arg3);
        field1459.method8513(var5, (long) var5.field477);
        field1458.method6984(var5);
        client.field729 = client.field720;
    }

    @ObfuscatedName("po.aj(III)Lco;")
    public static class65 method7004(int arg0, int arg1) {
        class83 var2 = (class83) field1463.get(arg0);
        return var2.method2140(arg1);
    }

    @ObfuscatedName("bd.az(IB)Lco;")
    public static class65 method800(int arg0) {
        return (class65) field1459.method8506((long) arg0);
    }

    @ObfuscatedName("dy.af(IB)I")
    public static int method2347(int arg0) {
        class83 var1 = (class83) field1463.get(arg0);
        return var1 == null ? 0 : var1.method2134();
    }

    @ObfuscatedName("dt.aa(I)V")
    public static void method2524() {
        field1463.clear();
        field1459.method8508();
        field1458.method6983();
        field1461 = 0;
    }

    @ObfuscatedName("dx.at(II)I")
    public static int method2511(int arg0) {
        class65 var1 = (class65) field1459.method8506((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1458.field4641 == var1.field5044) {
            return -1;
        } else {
            return ((class65) var1.field5044).field477;
        }
    }

    @ObfuscatedName("du.ab(IS)I")
    public static int method2248(int arg0) {
        class65 var1 = (class65) field1459.method8506((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1458.field4641 == var1.field5042) {
            return -1;
        } else {
            return ((class65) var1.field5042).field477;
        }
    }

    @ObfuscatedName("nb.ac(I)Ljava/lang/String;")
    public static String method6428() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1459.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            if (var2.field484 != null && !var2.field484.isEmpty()) {
                var0.append(var2.field484).append(':');
            }
            var0.append(var2.field482).append('\n');
        }
        return var0.toString();
    }
}
