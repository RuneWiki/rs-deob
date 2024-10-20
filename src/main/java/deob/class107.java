package deob;

@ObfuscatedName("du")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.b(S)J")
    public static synchronized long method3468() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1866) {
            Statics.field1867 += Statics.field1866 - var0;
        }
        Statics.field1866 = var0;
        return Statics.field1867 + var0;
    }
}
