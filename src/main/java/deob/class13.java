package deob;

@ObfuscatedName("j")
public class class13 extends class176 {

    @ObfuscatedName("j.m")
    public static class169 field207 = new class169(32);

    @ObfuscatedName("j.k")
    public int[] field203 = new int[] { -1 };

    @ObfuscatedName("j.y")
    public int[] field204 = new int[] { 0 };

    @ObfuscatedName("dx.k(IIIIB)V")
    public static void method2434(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field207.method3159((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field207.method3165(var4, (long) arg0);
        }
        if (var4.field203.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field203.length; var7++) {
                var5[var7] = var4.field203[var7];
                var6[var7] = var4.field204[var7];
            }
            for (int var8 = var4.field203.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field203 = var5;
            var4.field204 = var6;
        }
        var4.field203[arg1] = arg2;
        var4.field204[arg1] = arg3;
    }
}
