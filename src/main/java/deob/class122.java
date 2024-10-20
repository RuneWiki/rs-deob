package deob;

@ObfuscatedName("dx")
public class class122 {

    @ObfuscatedName("dx.e")
    public static final class122 field1901 = new class122(0);

    @ObfuscatedName("dx.a")
    public static final class122 field1903 = new class122(1);

    @ObfuscatedName("dx.l")
    public static final class122 field1902 = new class122(2);

    @ObfuscatedName("dx.c")
    public final int field1900;

    public class122(int arg0) {
        this.field1900 = arg0;
    }

    @ObfuscatedName("bm.e(IB)Ldx;")
    public static class122 method1100(int arg0) {
        class122[] var1 = new class122[] { field1902, field1903, field1901 };
        class122[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class122 var4 = var2[var3];
            if (var4.field1900 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
