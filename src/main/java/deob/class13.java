package deob;

@ObfuscatedName("v")
public class class13 {

    @ObfuscatedName("v.c")
    public static final class13 field103 = new class13(0, 0, 4);

    @ObfuscatedName("v.q")
    public static final class13 field96 = new class13(2, 1, 2);

    @ObfuscatedName("v.m")
    public static final class13 field104 = new class13(1, 2, 0);

    @ObfuscatedName("v.j")
    public final int field98;

    @ObfuscatedName("v.g")
    public final int field99;

    @ObfuscatedName("v.i")
    public final int field100;

    public class13(int arg0, int arg1, int arg2) {
        this.field98 = arg0;
        this.field99 = arg1;
        this.field100 = arg2;
    }

    @ObfuscatedName("v.c(FI)Z")
    public boolean method126(float arg0) {
        return arg0 >= (float) this.field100;
    }

    @ObfuscatedName("v.q(II)Lv;")
    public static class13 method125(int arg0) {
        class13[] var1 = new class13[] { field96, field104, field103 };
        class13[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class13 var4 = var2[var3];
            if (var4.field99 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
