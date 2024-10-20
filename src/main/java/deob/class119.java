package deob;

@ObfuscatedName("dh")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.l(I)J")
    public static synchronized long method1224() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2032) {
            Statics.field2030 += Statics.field2032 - var0;
        }
        Statics.field2032 = var0;
        return Statics.field2030 + var0;
    }
}
