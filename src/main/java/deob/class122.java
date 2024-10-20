package deob;

@ObfuscatedName("dj")
public class class122 {

    @ObfuscatedName("dj.n")
    public static final class122 field1942 = new class122(0);

    @ObfuscatedName("dj.w")
    public static final class122 field1945 = new class122(1);

    @ObfuscatedName("dj.i")
    public static final class122 field1946 = new class122(2);

    @ObfuscatedName("dj.e")
    public final int field1943;

    @ObfuscatedName("cs.n(B)[Ldj;")
    public static class122[] method1800() {
        return new class122[] { field1945, field1942, field1946 };
    }

    public class122(int arg0) {
        this.field1943 = arg0;
    }

    @ObfuscatedName("ck.w(IB)Ldj;")
    public static class122 method1802(int arg0) {
        class122[] var1 = method1800();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class122 var3 = var1[var2];
            if (var3.field1943 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
