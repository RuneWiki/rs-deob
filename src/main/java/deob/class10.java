package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("f")
public class class10 {

    @ObfuscatedName("f.g")
    public static final Map field158 = new HashMap();

    @ObfuscatedName("f.v")
    public static final class176 field149 = new class176(1024);

    @ObfuscatedName("f.z")
    public static final class178 field150 = new class178();

    @ObfuscatedName("f.h")
    public static int field157 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.g(B)I")
    public static int method457() {
        return ++field157 - 1;
    }

    @ObfuscatedName("ay.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method804(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field158.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field158.put(arg0, var4);
        }
        class31 var5 = var4.method501(arg0, arg1, arg2, arg3);
        field149.method3220(var5, (long) var5.field705);
        field150.method3260(var5);
        client.field440 = client.field275;
    }

    @ObfuscatedName("j.h(IIB)Laa;")
    public static class31 method88(int arg0, int arg1) {
        class24 var2 = (class24) field158.get(arg0);
        return var2.method512(arg1);
    }

    @ObfuscatedName("z.l(IB)I")
    public static int method31(int arg0) {
        class31 var1 = (class31) field149.method3219((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field150.field2861 == var1.field2866) {
            return -1;
        } else {
            return ((class31) var1.field2866).field705;
        }
    }
}
