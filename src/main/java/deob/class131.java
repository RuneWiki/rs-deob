package deob;

@ObfuscatedName("eg")
public class class131 {

    @ObfuscatedName("eg.t")
    public static final class131 field2076 = new class131(0);

    @ObfuscatedName("eg.i")
    public static final class131 field2069 = new class131(1);

    @ObfuscatedName("eg.g")
    public static final class131 field2071 = new class131(2);

    @ObfuscatedName("eg.h")
    public final int field2070;

    public class131(int arg0) {
        this.field2070 = arg0;
    }

    @ObfuscatedName("f.t(II)Leg;")
    public static class131 method69(int arg0) {
        class131[] var1 = new class131[] { field2076, field2071, field2069 };
        class131[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class131 var4 = var2[var3];
            if (var4.field2070 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
