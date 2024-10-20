package deob;

@ObfuscatedName("n")
public class class13 {

    @ObfuscatedName("n.z")
    public static final class13 field71 = new class13("SMALL", 0, 0, 4);

    @ObfuscatedName("n.w")
    public static final class13 field72 = new class13("MEDIUM", 2, 1, 2);

    @ObfuscatedName("n.s")
    public static final class13 field73 = new class13("LARGE", 1, 2, 0);

    @ObfuscatedName("n.l")
    public final String field74;

    @ObfuscatedName("n.u")
    public final int field80;

    @ObfuscatedName("n.q")
    public final int field76;

    @ObfuscatedName("n.k")
    public final int field77;

    public class13(String arg0, int arg1, int arg2, int arg3) {
        this.field74 = arg0;
        this.field80 = arg1;
        this.field76 = arg2;
        this.field77 = arg3;
    }

    @ObfuscatedName("n.z(FB)Z")
    public boolean method104(float arg0) {
        return arg0 >= (float) this.field77;
    }

    @ObfuscatedName("n.w(IB)Ln;")
    public static class13 method102(int arg0) {
        class13[] var1 = new class13[] { field73, field71, field72 };
        class13[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class13 var4 = var2[var3];
            if (var4.field76 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
