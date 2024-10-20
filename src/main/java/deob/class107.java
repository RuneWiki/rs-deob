package deob;

@ObfuscatedName("dg")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.n(I)J")
    public static synchronized long method1670() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1867) {
            Statics.field1872 += Statics.field1867 - var0;
        }
        Statics.field1867 = var0;
        return Statics.field1872 + var0;
    }
}
