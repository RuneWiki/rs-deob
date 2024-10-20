package deob;

@ObfuscatedName("dn")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.n(B)J")
    public static synchronized long method3364() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1874) {
            Statics.field1877 += Statics.field1874 - var0;
        }
        Statics.field1874 = var0;
        return Statics.field1877 + var0;
    }
}
