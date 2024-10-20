package deob;

@ObfuscatedName("dj")
public class class130 {

    @ObfuscatedName("dj.a")
    public static final class130 field2050 = new class130(0);

    @ObfuscatedName("dj.r")
    public static final class130 field2056 = new class130(1);

    @ObfuscatedName("dj.f")
    public static final class130 field2047 = new class130(2);

    @ObfuscatedName("dj.s")
    public final int field2051;

    public class130(int arg0) {
        this.field2051 = arg0;
    }

    @ObfuscatedName("u.a(II)Ldj;")
    public static class130 method188(int arg0) {
        class130[] var1 = new class130[] { field2047, field2056, field2050 };
        class130[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class130 var4 = var2[var3];
            if (var4.field2051 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
