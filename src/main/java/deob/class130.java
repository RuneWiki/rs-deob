package deob;

@ObfuscatedName("dz")
public class class130 {

    @ObfuscatedName("dz.z")
    public static final class130 field2050 = new class130(0);

    @ObfuscatedName("dz.q")
    public static final class130 field2045 = new class130(1);

    @ObfuscatedName("dz.k")
    public static final class130 field2046 = new class130(2);

    @ObfuscatedName("dz.f")
    public final int field2052;

    public class130(int arg0) {
        this.field2052 = arg0;
    }

    @ObfuscatedName("dz.z(II)Ldz;")
    public static class130 method2624(int arg0) {
        class130[] var1 = new class130[] { field2045, field2046, field2050 };
        class130[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class130 var4 = var2[var3];
            if (var4.field2052 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
