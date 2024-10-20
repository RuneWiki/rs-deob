package deob;

@ObfuscatedName("co")
public class class104 {

    public class104() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.x(I)J")
    public static synchronized long method27() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1818) {
            Statics.field1820 += Statics.field1818 - var0;
        }
        Statics.field1818 = var0;
        return Statics.field1820 + var0;
    }
}
