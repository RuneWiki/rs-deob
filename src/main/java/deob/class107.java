package deob;

@ObfuscatedName("di")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.n(I)J")
    public static synchronized long method2784() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1866) {
            Statics.field1857 += Statics.field1866 - var0;
        }
        Statics.field1866 = var0;
        return Statics.field1857 + var0;
    }
}
