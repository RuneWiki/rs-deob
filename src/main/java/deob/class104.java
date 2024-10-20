package deob;

@ObfuscatedName("ct")
public class class104 {

    public class104() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.e(B)J")
    public static synchronized long method567() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1826) {
            Statics.field1824 += Statics.field1826 - var0;
        }
        Statics.field1826 = var0;
        return Statics.field1824 + var0;
    }
}
