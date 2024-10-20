package deob;

@ObfuscatedName("s")
public class class13 {

    @ObfuscatedName("s.w")
    public static final class13 field94 = new class13("SMALL", 1, 0, 4);

    @ObfuscatedName("s.m")
    public static final class13 field88 = new class13("MEDIUM", 2, 1, 2);

    @ObfuscatedName("s.q")
    public static final class13 field90 = new class13("LARGE", 0, 2, 0);

    @ObfuscatedName("s.b")
    public final String field91;

    @ObfuscatedName("s.f")
    public final int field89;

    @ObfuscatedName("s.n")
    public final int field93;

    @ObfuscatedName("s.h")
    public final int field99;

    public class13(String arg0, int arg1, int arg2, int arg3) {
        this.field91 = arg0;
        this.field89 = arg1;
        this.field93 = arg2;
        this.field99 = arg3;
    }

    @ObfuscatedName("s.w(FI)Z")
    public boolean method122(float arg0) {
        return arg0 >= (float) this.field99;
    }

    @ObfuscatedName("s.m(II)Ls;")
    public static class13 method118(int arg0) {
        class13[] var1 = new class13[] { field88, field90, field94 };
        class13[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class13 var4 = var2[var3];
            if (var4.field93 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
