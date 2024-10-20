package deob;

@ObfuscatedName("eu")
public class class131 {

    @ObfuscatedName("eu.e")
    public static final class131 field2053 = new class131(0);

    @ObfuscatedName("eu.w")
    public static final class131 field2050 = new class131(1);

    @ObfuscatedName("eu.f")
    public static final class131 field2049 = new class131(2);

    @ObfuscatedName("eu.s")
    public final int field2051;

    public class131(int arg0) {
        this.field2051 = arg0;
    }

    @ObfuscatedName("i.e(IB)Leu;")
    public static class131 method159(int arg0) {
        class131[] var1 = new class131[] { field2049, field2053, field2050 };
        class131[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class131 var4 = var2[var3];
            if (var4.field2051 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
