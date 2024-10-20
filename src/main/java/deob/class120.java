package deob;

@ObfuscatedName("dz")
public class class120 {

    public class120() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.p(S)J")
    public static synchronized long method1322() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2014) {
            Statics.field2015 += Statics.field2014 - var0;
        }
        Statics.field2014 = var0;
        return Statics.field2015 + var0;
    }
}
