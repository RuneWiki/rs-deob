package deob;

@ObfuscatedName("dv")
public class class117 {

    @ObfuscatedName("dv.t")
    public static final class117 field1902 = new class117(0);

    @ObfuscatedName("dv.s")
    public static final class117 field1893 = new class117(1);

    @ObfuscatedName("dv.f")
    public static final class117 field1894 = new class117(2);

    @ObfuscatedName("dv.e")
    public final int field1895;

    public class117(int arg0) {
        this.field1895 = arg0;
    }

    @ObfuscatedName("e.t(II)Ldv;")
    public static class117 method32(int arg0) {
        class117[] var1 = new class117[] { field1902, field1894, field1893 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1895 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
