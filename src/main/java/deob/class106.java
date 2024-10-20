package deob;

@ObfuscatedName("dw")
public class class106 {

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.p(I)J")
    public static synchronized long method870() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1825) {
            Statics.field1048 += Statics.field1825 - var0;
        }
        Statics.field1825 = var0;
        return Statics.field1048 + var0;
    }
}
