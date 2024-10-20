package deob;

@ObfuscatedName("dk")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gf.m(I)J")
    public static synchronized long method3544() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1636) {
            Statics.field2029 += Statics.field1636 - var0;
        }
        Statics.field1636 = var0;
        return Statics.field2029 + var0;
    }
}
