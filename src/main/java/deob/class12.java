package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("r")
public class class12 {

    @ObfuscatedName("r.j")
    public static final Map field179 = new HashMap();

    @ObfuscatedName("r.h")
    public static final class199 field172 = new class199(1024);

    @ObfuscatedName("r.m")
    public static final class201 field173 = new class201();

    @ObfuscatedName("r.z")
    public static int field174 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method108(int arg0, String arg1, String arg2) {
        method1584(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bp.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1584(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field179.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field179.put(arg0, var4);
        }
        class36 var5 = var4.method628(arg0, arg1, arg2, arg3);
        field172.method3521(var5, (long) var5.field766);
        field173.method3578(var5);
        client.field501 = client.field459;
    }

    @ObfuscatedName("bm.z(II)Las;")
    public static class36 method1226(int arg0) {
        return (class36) field172.method3520((long) arg0);
    }

    @ObfuscatedName("aw.x(II)I")
    public static int method925(int arg0) {
        class28 var1 = (class28) field179.get(arg0);
        return var1 == null ? 0 : var1.method633();
    }

    @ObfuscatedName("dv.e(B)V")
    public static void method2642() {
        field179.clear();
        field172.method3522();
        field173.method3569();
        field174 = 0;
    }

    @ObfuscatedName("fy.i(B)Ljava/lang/String;")
    public static String method3087() {
        String var0 = "";
        Iterator var1 = field172.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field765 + ':' + var2.field769 + '\n';
        }
        return var0;
    }
}
