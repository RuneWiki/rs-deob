package deob;

@ObfuscatedName("du")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.d(I)J")
    public static synchronized long method2142() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1947) {
            Statics.field1948 += Statics.field1947 - var0;
        }
        Statics.field1947 = var0;
        return Statics.field1948 + var0;
    }
}
