package deob;

@ObfuscatedName("m")
public class class13 extends class128 {

    @ObfuscatedName("m.s")
    public static class126 field126 = new class126(32);

    @ObfuscatedName("m.c")
    public int[] field127 = new int[] { -1 };

    @ObfuscatedName("m.f")
    public int[] field130 = new int[] { 0 };

    @ObfuscatedName("fl.s(III)I")
    public static int method2811(int arg0, int arg1) {
        class13 var2 = (class13) field126.method2131((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field127.length) {
            return var2.field127[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fy.c(IIB)I")
    public static int method2963(int arg0, int arg1) {
        class13 var2 = (class13) field126.method2131((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field130.length) {
            return var2.field130[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ck.f(II)V")
    public static void method1798(int arg0) {
        class13 var1 = (class13) field126.method2131((long) arg0);
        if (var1 != null) {
            var1.method2179();
        }
    }
}
