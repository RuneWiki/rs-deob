package deob;

@ObfuscatedName("dq")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.q(I)J")
    public static synchronized long method533() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1925) {
            Statics.field2014 += Statics.field1925 - var0;
        }
        Statics.field1925 = var0;
        return Statics.field2014 + var0;
    }
}
