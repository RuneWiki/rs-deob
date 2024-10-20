package deob;

@ObfuscatedName("di")
public class class117 {

    @ObfuscatedName("di.e")
    public static final class117 field1910 = new class117(0);

    @ObfuscatedName("di.v")
    public static final class117 field1911 = new class117(1);

    @ObfuscatedName("di.i")
    public static final class117 field1909 = new class117(2);

    @ObfuscatedName("di.g")
    public final int field1908;

    public class117(int arg0) {
        this.field1908 = arg0;
    }

    @ObfuscatedName("ai.e(II)Ldi;")
    public static class117 method859(int arg0) {
        class117[] var1 = new class117[] { field1911, field1910, field1909 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1908 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
