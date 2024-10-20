package deob;

@ObfuscatedName("cb")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.k(B)J")
    public static synchronized long method16() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1821) {
            Statics.field1819 += Statics.field1821 - var0;
        }
        Statics.field1821 = var0;
        return Statics.field1819 + var0;
    }
}
