package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("o")
public class class11 {

    @ObfuscatedName("o.e")
    public static final Map field151 = new HashMap();

    @ObfuscatedName("o.a")
    public static final class188 field148 = new class188(1024);

    @ObfuscatedName("o.l")
    public static final class190 field150 = new class190();

    @ObfuscatedName("o.c")
    public static int field154 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.e(B)I")
    public static int method169() {
        return ++field154 - 1;
    }

    @ObfuscatedName("c.a(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method35(int arg0, String arg1, String arg2) {
        method2776(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("es.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2776(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field151.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field151.put(arg0, var4);
        }
        class33 var5 = var4.method556(arg0, arg1, arg2, arg3);
        field148.method3364(var5, (long) var5.field699);
        field150.method3407(var5);
        client.field436 = client.field429;
    }

    @ObfuscatedName("cj.c(IIB)Lau;")
    public static class33 method1912(int arg0, int arg1) {
        class26 var2 = (class26) field151.get(arg0);
        return var2.method552(arg1);
    }

    @ObfuscatedName("h.u(II)Lau;")
    public static class33 method160(int arg0) {
        return (class33) field148.method3361((long) arg0);
    }

    @ObfuscatedName("dh.w(IB)I")
    public static int method2388(int arg0) {
        class26 var1 = (class26) field151.get(arg0);
        return var1 == null ? 0 : var1.method557();
    }

    @ObfuscatedName("at.i(II)I")
    public static int method790(int arg0) {
        class33 var1 = (class33) field148.method3361((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field150.field2948 == var1.field2952) {
            return -1;
        } else {
            return ((class33) var1.field2952).field699;
        }
    }

    @ObfuscatedName("co.r(I)Ljava/lang/String;")
    public static String method2014() {
        String var0 = "";
        Iterator var1 = field148.iterator();
        while (var1.hasNext()) {
            class33 var2 = (class33) var1.next();
            var0 = var0 + var2.field695 + ':' + var2.field698 + '\n';
        }
        return var0;
    }
}
