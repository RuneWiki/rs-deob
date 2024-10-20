package deob;

@ObfuscatedName("dn")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.i(I)J")
    public static synchronized long method2906() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2020) {
            Statics.field1962 += Statics.field2020 - var0;
        }
        Statics.field2020 = var0;
        return Statics.field1962 + var0;
    }
}
