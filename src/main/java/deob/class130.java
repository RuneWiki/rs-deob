package deob;

@ObfuscatedName("dx")
public class class130 {

    @ObfuscatedName("dx.j")
    public static final class130 field2065 = new class130(0);

    @ObfuscatedName("dx.l")
    public static final class130 field2062 = new class130(1);

    @ObfuscatedName("dx.a")
    public static final class130 field2063 = new class130(2);

    @ObfuscatedName("dx.i")
    public final int field2064;

    public class130(int arg0) {
        this.field2064 = arg0;
    }

    @ObfuscatedName("as.j(IB)Ldx;")
    public static class130 method736(int arg0) {
        class130[] var1 = new class130[] { field2065, field2063, field2062 };
        class130[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class130 var4 = var2[var3];
            if (var4.field2064 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
