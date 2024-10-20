package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("n")
public class class10 {

    @ObfuscatedName("n.t")
    public static final Map field156 = new HashMap();

    @ObfuscatedName("n.o")
    public static final class176 field154 = new class176(1024);

    @ObfuscatedName("n.i")
    public static final class178 field151 = new class178();

    @ObfuscatedName("n.p")
    public static int field152 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.t(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method9(int arg0, String arg1, String arg2) {
        method680(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("af.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method680(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field156.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field156.put(arg0, var4);
        }
        class31 var5 = var4.method508(arg0, arg1, arg2, arg3);
        field154.method3153(var5, (long) var5.field689);
        field151.method3205(var5);
        client.field445 = client.field268;
    }

    @ObfuscatedName("cg.i(II)Lak;")
    public static class31 method2055(int arg0) {
        return (class31) field154.method3155((long) arg0);
    }

    @ObfuscatedName("af.p(II)I")
    public static int method656(int arg0) {
        class24 var1 = (class24) field156.get(arg0);
        return var1 == null ? 0 : var1.method503();
    }

    @ObfuscatedName("dj.c(II)I")
    public static int method2388(int arg0) {
        class31 var1 = (class31) field154.method3155((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field151.field2850 == var1.field2855) {
            return -1;
        } else {
            return ((class31) var1.field2855).field689;
        }
    }
}
