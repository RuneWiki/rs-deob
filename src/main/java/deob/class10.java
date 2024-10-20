package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("n")
public class class10 {

    @ObfuscatedName("n.l")
    public static final Map field146 = new HashMap();

    @ObfuscatedName("n.y")
    public static final class179 field144 = new class179(1024);

    @ObfuscatedName("n.g")
    public static final class181 field145 = new class181();

    @ObfuscatedName("n.j")
    public static int field143 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.l(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1881(int arg0, String arg1, String arg2) {
        method2567(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ds.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2567(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field146.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field146.put(arg0, var4);
        }
        class32 var5 = var4.method513(arg0, arg1, arg2, arg3);
        field144.method3269(var5, (long) var5.field695);
        field145.method3317(var5);
        client.field428 = client.field421;
    }

    @ObfuscatedName("aw.g(III)Lad;")
    public static class32 method572(int arg0, int arg1) {
        class25 var2 = (class25) field146.get(arg0);
        return var2.method512(arg1);
    }

    @ObfuscatedName("r.j(II)Lad;")
    public static class32 method159(int arg0) {
        return (class32) field144.method3267((long) arg0);
    }

    @ObfuscatedName("cl.w(B)V")
    public static void method2086() {
        field146.clear();
        field144.method3268();
        field145.method3316();
        field143 = 0;
    }
}
