package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("s")
public class class12 {

    @ObfuscatedName("s.w")
    public static final Map field189 = new HashMap();

    @ObfuscatedName("s.x")
    public static final class199 field187 = new class199(1024);

    @ObfuscatedName("s.t")
    public static final class201 field186 = new class201();

    @ObfuscatedName("s.p")
    public static int field193 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.w(I)I")
    public static int method620() {
        return ++field193 - 1;
    }

    @ObfuscatedName("co.x(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2156(int arg0, String arg1, String arg2) {
        method2160(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dy.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2160(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field189.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field189.put(arg0, var4);
        }
        class36 var5 = var4.method644(arg0, arg1, arg2, arg3);
        field187.method3571(var5, (long) var5.field795);
        field186.method3619(var5);
        client.field458 = client.field492;
    }

    @ObfuscatedName("af.p(IIB)Lae;")
    public static class36 method642(int arg0, int arg1) {
        class28 var2 = (class28) field189.get(arg0);
        return var2.method646(arg1);
    }

    @ObfuscatedName("fw.e(IS)Lae;")
    public static class36 method3228(int arg0) {
        return (class36) field187.method3572((long) arg0);
    }

    @ObfuscatedName("ei.y(II)I")
    public static int method2697(int arg0) {
        class36 var1 = (class36) field187.method3572((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field186.field3110 == var1.field3114) {
            return -1;
        } else {
            return ((class36) var1.field3114).field795;
        }
    }
}
