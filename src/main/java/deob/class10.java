package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("b")
public class class10 {

    @ObfuscatedName("b.k")
    public static final Map field160 = new HashMap();

    @ObfuscatedName("b.r")
    public static final class176 field152 = new class176(1024);

    @ObfuscatedName("b.y")
    public static final class178 field153 = new class178();

    @ObfuscatedName("b.w")
    public static int field157 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.k(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2663(int arg0, String arg1, String arg2) {
        method2411(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dk.r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2411(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field160.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field160.put(arg0, var4);
        }
        class31 var5 = var4.method503(arg0, arg1, arg2, arg3);
        field152.method3176(var5, (long) var5.field700);
        field153.method3227(var5);
        client.field447 = client.field325;
    }
}
