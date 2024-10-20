package deob;

@ObfuscatedName("dv")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.t(I)J")
    public static synchronized long method591() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1851) {
            Statics.field2550 += Statics.field1851 - var0;
        }
        Statics.field1851 = var0;
        return Statics.field2550 + var0;
    }
}
