package deob;

@ObfuscatedName("q")
public class class13 extends class128 {

    @ObfuscatedName("q.f")
    public static class126 field124 = new class126(32);

    @ObfuscatedName("q.i")
    public int[] field119 = new int[] { -1 };

    @ObfuscatedName("q.u")
    public int[] field120 = new int[] { 0 };

    @ObfuscatedName("ec.f(IIS)I")
    public static int method2640(int arg0, int arg1) {
        class13 var2 = (class13) field124.method2254((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field119.length) {
            return var2.field119[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("i.u(IB)V")
    public static void method9(int arg0) {
        class13 var1 = (class13) field124.method2254((long) arg0);
        if (var1 != null) {
            var1.method2289();
        }
    }

    @ObfuscatedName("x.r(I)V")
    public static void method180() {
        field124 = new class126(32);
    }
}
