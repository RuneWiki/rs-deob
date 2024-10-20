package deob;

@ObfuscatedName("ce")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.y(I)J")
    public static synchronized long method790() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1828) {
            Statics.field1830 += Statics.field1828 - var0;
        }
        Statics.field1828 = var0;
        return Statics.field1830 + var0;
    }
}
