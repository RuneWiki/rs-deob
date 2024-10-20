package deob;

@ObfuscatedName("dd")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.o(I)J")
    public static synchronized long method102() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1948) {
            Statics.field1947 += Statics.field1948 - var0;
        }
        Statics.field1948 = var0;
        return Statics.field1947 + var0;
    }
}
