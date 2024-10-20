package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("n")
public class class12 {

    @ObfuscatedName("n.b")
    public static final Map field167 = new HashMap();

    @ObfuscatedName("n.g")
    public static final class199 field170 = new class199(1024);

    @ObfuscatedName("n.j")
    public static final class201 field165 = new class201();

    @ObfuscatedName("n.d")
    public static int field169 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.b(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method936(int arg0, String arg1, String arg2) {
        method568(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("m.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method568(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field167.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field167.put(arg0, var4);
        }
        class36 var5 = var4.method636(arg0, arg1, arg2, arg3);
        field170.method3540(var5, (long) var5.field770);
        field165.method3589(var5);
        client.field436 = client.field360;
    }

    @ObfuscatedName("bu.j(IIB)Lac;")
    public static class36 method1572(int arg0, int arg1) {
        class28 var2 = (class28) field167.get(arg0);
        return var2.method637(arg1);
    }

    @ObfuscatedName("c.d(B)V")
    public static void method90() {
        field167.clear();
        field170.method3543();
        field165.method3592();
        field169 = 0;
    }

    @ObfuscatedName("de.x(IS)I")
    public static int method2285(int arg0) {
        class36 var1 = (class36) field170.method3539((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field165.field3100 == var1.field3105) {
            return -1;
        } else {
            return ((class36) var1.field3105).field770;
        }
    }

    @ObfuscatedName("s.y(II)I")
    public static int method587(int arg0) {
        class36 var1 = (class36) field170.method3539((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field165.field3100 == var1.field3104) {
            return -1;
        } else {
            return ((class36) var1.field3104).field770;
        }
    }
}
