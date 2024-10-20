package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("o")
public class class12 {

    @ObfuscatedName("o.g")
    public static final Map field186 = new HashMap();

    @ObfuscatedName("o.b")
    public static final class198 field177 = new class198(1024);

    @ObfuscatedName("o.w")
    public static final class200 field185 = new class200();

    @ObfuscatedName("o.d")
    public static int field179 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.g(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2737(int arg0, String arg1, String arg2) {
        method1030(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("as.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1030(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field186.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field186.put(arg0, var4);
        }
        class36 var5 = var4.method646(arg0, arg1, arg2, arg3);
        field177.method3590(var5, (long) var5.field798);
        field185.method3632(var5);
        client.field291 = client.field567;
    }

    @ObfuscatedName("ey.w(II)I")
    public static int method2847(int arg0) {
        class28 var1 = (class28) field186.get(arg0);
        return var1 == null ? 0 : var1.method655();
    }

    @ObfuscatedName("x.d(I)V")
    public static void method179() {
        field186.clear();
        field177.method3589();
        field185.method3633();
        field179 = 0;
    }
}
