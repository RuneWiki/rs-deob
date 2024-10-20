package deob;

@ObfuscatedName("dw")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.i(I)J")
    public static synchronized long method719() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3221) {
            Statics.field2025 += Statics.field3221 - var0;
        }
        Statics.field3221 = var0;
        return Statics.field2025 + var0;
    }
}
