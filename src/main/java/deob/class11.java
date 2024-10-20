package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("p")
public class class11 {

    @ObfuscatedName("p.q")
    public static final Map field160 = new HashMap();

    @ObfuscatedName("p.s")
    public static final class188 field157 = new class188(1024);

    @ObfuscatedName("p.h")
    public static final class190 field156 = new class190();

    @ObfuscatedName("p.e")
    public static int field159 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ft.q(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3012(int arg0, String arg1, String arg2) {
        method2445(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dc.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2445(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field160.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field160.put(arg0, var4);
        }
        class33 var5 = var4.method521(arg0, arg1, arg2, arg3);
        field157.method3291(var5, (long) var5.field719);
        field156.method3352(var5);
        client.field459 = client.field452;
    }

    @ObfuscatedName("b.h(III)Lam;")
    public static class33 method160(int arg0, int arg1) {
        class26 var2 = (class26) field160.get(arg0);
        return var2.method523(arg1);
    }

    @ObfuscatedName("fi.e(II)Lam;")
    public static class33 method3000(int arg0) {
        return (class33) field157.method3297((long) arg0);
    }

    @ObfuscatedName("ab.n(IS)I")
    public static int method753(int arg0) {
        class33 var1 = (class33) field157.method3297((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field156.field2943 == var1.field2948) {
            return -1;
        } else {
            return ((class33) var1.field2948).field719;
        }
    }
}
