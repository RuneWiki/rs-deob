package deob;

@ObfuscatedName("ei")
public class class131 {

    @ObfuscatedName("ei.s")
    public static final class131 field2069 = new class131(0);

    @ObfuscatedName("ei.j")
    public static final class131 field2070 = new class131(1);

    @ObfuscatedName("ei.p")
    public static final class131 field2071 = new class131(2);

    @ObfuscatedName("ei.x")
    public final int field2074;

    @ObfuscatedName("gg.s(B)[Lei;")
    public static class131[] method3458() {
        return new class131[] { field2071, field2069, field2070 };
    }

    public class131(int arg0) {
        this.field2074 = arg0;
    }

    @ObfuscatedName("ae.j(IB)Lei;")
    public static class131 method678(int arg0) {
        class131[] var1 = method3458();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class131 var3 = var1[var2];
            if (var3.field2074 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
