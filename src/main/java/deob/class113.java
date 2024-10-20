package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("er")
public class class113 {

    @ObfuscatedName("er.ac")
    public static final Map field1416 = new HashMap();

    @ObfuscatedName("er.al")
    public static final class503 field1418 = new class503(1024);

    @ObfuscatedName("er.ak")
    public static final class398 field1414 = new class398();

    @ObfuscatedName("er.ax")
    public static int field1417 = 0;

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pe.ac(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method6942(int arg0, String arg1, String arg2) {
        method3113(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("gm.al(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3113(int arg0, String arg1, String arg2, String arg3) {
        class83 var4 = (class83) field1416.get(arg0);
        if (var4 == null) {
            var4 = new class83();
            field1416.put(arg0, var4);
        }
        class66 var5 = var4.method2120(arg0, arg1, arg2, arg3);
        field1418.method8071(var5, (long) var5.field503);
        field1414.method6656(var5);
        client.field723 = client.field665;
    }

    @ObfuscatedName("bl.ak(III)Lcr;")
    public static class66 method834(int arg0, int arg1) {
        class83 var2 = (class83) field1416.get(arg0);
        return var2.method2121(arg1);
    }

    @ObfuscatedName("ke.ax(II)Lcr;")
    public static class66 method5051(int arg0) {
        return (class66) field1418.method8070((long) arg0);
    }

    @ObfuscatedName("oz.ao(IB)I")
    public static int method6411(int arg0) {
        class83 var1 = (class83) field1416.get(arg0);
        return var1 == null ? 0 : var1.method2129();
    }

    @ObfuscatedName("dp.ah(II)I")
    public static int method2237(int arg0) {
        class66 var1 = (class66) field1418.method8070((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1414.field4470 == var1.field4852) {
            return -1;
        } else {
            return ((class66) var1.field4852).field503;
        }
    }

    @ObfuscatedName("iq.ab(I)Ljava/lang/String;")
    public static String method3982() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1418.iterator();
        while (var1.hasNext()) {
            class66 var2 = (class66) var1.next();
            if (var2.field498 != null && !var2.field498.isEmpty()) {
                var0.append(var2.field498).append(':');
            }
            var0.append(var2.field506).append('\n');
        }
        return var0.toString();
    }
}
