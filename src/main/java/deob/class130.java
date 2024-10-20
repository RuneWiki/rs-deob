package deob;

@ObfuscatedName("dq")
public class class130 {

    @ObfuscatedName("dq.n")
    public static final class130 field2044 = new class130(0);

    @ObfuscatedName("dq.q")
    public static final class130 field2045 = new class130(1);

    @ObfuscatedName("dq.c")
    public static final class130 field2046 = new class130(2);

    @ObfuscatedName("dq.l")
    public final int field2049;

    @ObfuscatedName("db.n(I)[Ldq;")
    public static class130[] method2655() {
        return new class130[] { field2046, field2045, field2044 };
    }

    public class130(int arg0) {
        this.field2049 = arg0;
    }

    @ObfuscatedName("dr.q(II)Ldq;")
    public static class130 method2629(int arg0) {
        class130[] var1 = method2655();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2049 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
