package deob;

@ObfuscatedName("dz")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.p(I)J")
    public static synchronized long method711() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2009) {
            Statics.field2007 += Statics.field2009 - var0;
        }
        Statics.field2009 = var0;
        return Statics.field2007 + var0;
    }
}
