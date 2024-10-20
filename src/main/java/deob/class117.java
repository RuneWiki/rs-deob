package deob;

@ObfuscatedName("dr")
public class class117 {

    @ObfuscatedName("dr.g")
    public static final class117 field1913 = new class117(0);

    @ObfuscatedName("dr.i")
    public static final class117 field1909 = new class117(1);

    @ObfuscatedName("dr.k")
    public static final class117 field1910 = new class117(2);

    @ObfuscatedName("dr.e")
    public final int field1911;

    public class117(int arg0) {
        this.field1911 = arg0;
    }

    @ObfuscatedName("dv.g(II)Ldr;")
    public static class117 method2511(int arg0) {
        class117[] var1 = new class117[] { field1909, field1910, field1913 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1911 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
