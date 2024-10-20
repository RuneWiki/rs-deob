package deob;

@ObfuscatedName("k")
public class class13 {

    @ObfuscatedName("k.f")
    public static final class13 field80 = new class13(1, 0, 4);

    @ObfuscatedName("k.h")
    public static final class13 field81 = new class13(0, 1, 2);

    @ObfuscatedName("k.e")
    public static final class13 field87 = new class13(2, 2, 0);

    @ObfuscatedName("k.b")
    public final int field83;

    @ObfuscatedName("k.l")
    public final int field84;

    @ObfuscatedName("k.w")
    public final int field85;

    public class13(int arg0, int arg1, int arg2) {
        this.field83 = arg0;
        this.field84 = arg1;
        this.field85 = arg2;
    }

    @ObfuscatedName("k.f(FS)Z")
    public boolean method135(float arg0) {
        return arg0 >= (float) this.field85;
    }

    @ObfuscatedName("k.h(IB)Lk;")
    public static class13 method136(int arg0) {
        class13[] var1 = new class13[] { field80, field81, field87 };
        class13[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class13 var4 = var2[var3];
            if (var4.field84 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
