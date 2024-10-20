package deob;

@ObfuscatedName("w")
public class class13 {

    @ObfuscatedName("w.v")
    public static final class13 field88 = new class13(1, 0, 4);

    @ObfuscatedName("w.s")
    public static final class13 field85 = new class13(0, 1, 2);

    @ObfuscatedName("w.o")
    public static final class13 field89 = new class13(2, 2, 0);

    @ObfuscatedName("w.k")
    public final int field87;

    @ObfuscatedName("w.u")
    public final int field90;

    @ObfuscatedName("w.i")
    public final int field86;

    public class13(int arg0, int arg1, int arg2) {
        this.field87 = arg0;
        this.field90 = arg1;
        this.field86 = arg2;
    }

    @ObfuscatedName("w.v(FI)Z")
    public boolean method133(float arg0) {
        return arg0 >= (float) this.field86;
    }

    @ObfuscatedName("w.s(II)Lw;")
    public static class13 method135(int arg0) {
        class13[] var1 = new class13[] { field88, field85, field89 };
        class13[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class13 var4 = var2[var3];
            if (var4.field90 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
