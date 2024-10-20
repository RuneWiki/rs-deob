package deob;

@ObfuscatedName("dq")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.q(I)J")
    public static synchronized long method2434() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1831) {
            Statics.field1830 += Statics.field1831 - var0;
        }
        Statics.field1831 = var0;
        return Statics.field1830 + var0;
    }
}
