package deob;

@ObfuscatedName("dz")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.p(B)J")
    public static synchronized long method2() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2012) {
            Statics.field2013 += Statics.field2012 - var0;
        }
        Statics.field2012 = var0;
        return Statics.field2013 + var0;
    }
}
