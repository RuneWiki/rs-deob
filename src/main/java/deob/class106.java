package deob;

@ObfuscatedName("dy")
public class class106 {

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.v(B)J")
    public static synchronized long method487() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1828) {
            Statics.field1834 += Statics.field1828 - var0;
        }
        Statics.field1828 = var0;
        return Statics.field1834 + var0;
    }
}
