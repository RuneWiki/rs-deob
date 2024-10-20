package deob;

@ObfuscatedName("dn")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.s(B)J")
    public static synchronized long method157() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1987) {
            Statics.field1984 += Statics.field1987 - var0;
        }
        Statics.field1987 = var0;
        return Statics.field1984 + var0;
    }
}
