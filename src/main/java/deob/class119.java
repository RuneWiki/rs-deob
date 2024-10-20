package deob;

@ObfuscatedName("dk")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.x(I)J")
    public static synchronized long method698() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2036) {
            Statics.field2033 += Statics.field2036 - var0;
        }
        Statics.field2036 = var0;
        return Statics.field2033 + var0;
    }
}
