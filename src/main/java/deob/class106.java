package deob;

@ObfuscatedName("dh")
public class class106 {

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hg.b(B)J")
    public static synchronized long method3592() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1835) {
            Statics.field1834 += Statics.field1835 - var0;
        }
        Statics.field1835 = var0;
        return Statics.field1834 + var0;
    }
}
