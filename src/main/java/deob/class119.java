package deob;

@ObfuscatedName("dh")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.a(I)J")
    public static synchronized long method64() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2110) {
            Statics.field2057 += Statics.field2110 - var0;
        }
        Statics.field2110 = var0;
        return Statics.field2057 + var0;
    }
}
