package deob;

@ObfuscatedName("df")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.e(I)J")
    public static synchronized long method635() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1811) {
            Statics.field1810 += Statics.field1811 - var0;
        }
        Statics.field1811 = var0;
        return Statics.field1810 + var0;
    }
}
