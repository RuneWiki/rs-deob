package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cl")
public class class100 {

    @ObfuscatedName("cl.j")
    public static final Map field1530 = new HashMap();

    @ObfuscatedName("cl.h")
    public static final class188 field1531 = new class188(1024);

    @ObfuscatedName("cl.f")
    public static final class203 field1532 = new class203();

    @ObfuscatedName("cl.p")
    public static int field1535 = 0;

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1553(int arg0, String arg1, String arg2) {
        method465(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ae.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method465(int arg0, String arg1, String arg2, String arg3) {
        class103 var4 = (class103) field1530.get(arg0);
        if (var4 == null) {
            var4 = new class103();
            field1530.put(arg0, var4);
        }
        class74 var5 = var4.method1724(arg0, arg1, arg2, arg3);
        field1531.method3233(var5, (long) var5.field892);
        field1532.method3383(var5);
        client.field1119 = client.field1112;
    }

    @ObfuscatedName("co.f(II)I")
    public static int method1660(int arg0) {
        class103 var1 = (class103) field1530.get(arg0);
        return var1 == null ? 0 : var1.method1728();
    }
}
