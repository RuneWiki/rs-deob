package deob;

@ObfuscatedName("dz")
public class class120 {

    public class120() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.z(B)J")
    public static synchronized long method228() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1978) {
            Statics.field1977 += Statics.field1978 - var0;
        }
        Statics.field1978 = var0;
        return Statics.field1977 + var0;
    }
}
