package deob;

@ObfuscatedName("d")
public class class13 {

    @ObfuscatedName("d.g")
    public static final class13 field93 = new class13(2, 0, 4);

    @ObfuscatedName("d.r")
    public static final class13 field94 = new class13(1, 1, 2);

    @ObfuscatedName("d.e")
    public static final class13 field95 = new class13(0, 2, 0);

    @ObfuscatedName("d.q")
    public final int field96;

    @ObfuscatedName("d.c")
    public final int field98;

    @ObfuscatedName("d.l")
    public final int field97;

    @ObfuscatedName("d.g(I)[Ld;")
    public static class13[] method123() {
        return new class13[] { field93, field95, field94 };
    }

    public class13(int arg0, int arg1, int arg2) {
        this.field96 = arg0;
        this.field98 = arg1;
        this.field97 = arg2;
    }

    @ObfuscatedName("d.r(FI)Z")
    public boolean method130(float arg0) {
        return arg0 >= (float) this.field97;
    }

    @ObfuscatedName("d.e(II)Ld;")
    public static class13 method125(int arg0) {
        class13[] var1 = method123();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class13 var3 = var1[var2];
            if (var3.field98 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
