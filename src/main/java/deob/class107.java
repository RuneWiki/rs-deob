package deob;

@ObfuscatedName("dr")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.p(I)J")
    public static synchronized long method579() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1866) {
            Statics.field1864 += Statics.field1866 - var0;
        }
        Statics.field1866 = var0;
        return Statics.field1864 + var0;
    }
}
