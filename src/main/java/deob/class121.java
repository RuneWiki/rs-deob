package deob;

@ObfuscatedName("dv")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.l(I)J")
    public static synchronized long method1435() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1994) {
            Statics.field1990 += Statics.field1994 - var0;
        }
        Statics.field1994 = var0;
        return Statics.field1990 + var0;
    }
}
