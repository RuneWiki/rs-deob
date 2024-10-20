package deob;

@ObfuscatedName("dt")
public class class117 {

    @ObfuscatedName("dt.g")
    public static final class117 field1899 = new class117(0);

    @ObfuscatedName("dt.s")
    public static final class117 field1900 = new class117(1);

    @ObfuscatedName("dt.h")
    public static final class117 field1901 = new class117(2);

    @ObfuscatedName("dt.m")
    public final int field1903;

    public class117(int arg0) {
        this.field1903 = arg0;
    }

    @ObfuscatedName("do.g(IS)Ldt;")
    public static class117 method2532(int arg0) {
        class117[] var1 = new class117[] { field1900, field1899, field1901 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1903 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
