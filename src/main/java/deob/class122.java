package deob;

@ObfuscatedName("dm")
public class class122 {

    @ObfuscatedName("dm.t")
    public static final class122 field1934 = new class122(0);

    @ObfuscatedName("dm.b")
    public static final class122 field1936 = new class122(1);

    @ObfuscatedName("dm.p")
    public static final class122 field1932 = new class122(2);

    @ObfuscatedName("dm.e")
    public final int field1933;

    public class122(int arg0) {
        this.field1933 = arg0;
    }

    @ObfuscatedName("fw.t(II)Ldm;")
    public static class122 method3328(int arg0) {
        class122[] var1 = new class122[] { field1936, field1934, field1932 };
        class122[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class122 var4 = var2[var3];
            if (var4.field1933 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
