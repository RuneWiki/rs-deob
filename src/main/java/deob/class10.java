package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("a")
public class class10 {

    @ObfuscatedName("a.j")
    public static final Map field154 = new HashMap();

    @ObfuscatedName("a.z")
    public static final class176 field151 = new class176(1024);

    @ObfuscatedName("a.y")
    public static final class178 field152 = new class178();

    @ObfuscatedName("a.h")
    public static int field153 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method545(int arg0, String arg1, String arg2) {
        method2713(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ep.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2713(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field154.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field154.put(arg0, var4);
        }
        class31 var5 = var4.method474(arg0, arg1, arg2, arg3);
        field151.method3232(var5, (long) var5.field713);
        field152.method3272(var5);
        client.field457 = client.field416;
    }

    @ObfuscatedName("eb.y(III)Lak;")
    public static class31 method2915(int arg0, int arg1) {
        class24 var2 = (class24) field154.get(arg0);
        return var2.method475(arg1);
    }

    @ObfuscatedName("eh.h(II)Lak;")
    public static class31 method2715(int arg0) {
        return (class31) field151.method3226((long) arg0);
    }

    @ObfuscatedName("eq.r(II)I")
    public static int method2716(int arg0) {
        class24 var1 = (class24) field154.get(arg0);
        return var1 == null ? 0 : var1.method483();
    }

    @ObfuscatedName("r.e(II)I")
    public static int method39(int arg0) {
        class31 var1 = (class31) field151.method3226((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field152.field2850 == var1.field2853) {
            return -1;
        } else {
            return ((class31) var1.field2853).field713;
        }
    }
}
