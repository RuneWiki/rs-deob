package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("h")
public class class10 {

    @ObfuscatedName("h.z")
    public static final Map field148 = new HashMap();

    @ObfuscatedName("h.j")
    public static final class176 field145 = new class176(1024);

    @ObfuscatedName("h.a")
    public static final class178 field146 = new class178();

    @ObfuscatedName("h.y")
    public static int field152 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.z(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2425(int arg0, String arg1, String arg2) {
        method494(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("v.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method494(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field148.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field148.put(arg0, var4);
        }
        class31 var5 = var4.method501(arg0, arg1, arg2, arg3);
        field145.method3215(var5, (long) var5.field672);
        field146.method3260(var5);
        client.field436 = client.field462;
    }

    @ObfuscatedName("ax.a(II)I")
    public static int method885(int arg0) {
        class24 var1 = (class24) field148.get(arg0);
        return var1 == null ? 0 : var1.method503();
    }

    @ObfuscatedName("es.y(I)V")
    public static void method2690() {
        field148.clear();
        field145.method3220();
        field146.method3266();
        field152 = 0;
    }

    @ObfuscatedName("o.i(II)I")
    public static int method120(int arg0) {
        class31 var1 = (class31) field145.method3216((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field146.field2845 == var1.field2848) {
            return -1;
        } else {
            return ((class31) var1.field2848).field672;
        }
    }
}
