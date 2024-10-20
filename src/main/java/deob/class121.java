package deob;

@ObfuscatedName("dr")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.x(I)J")
    public static synchronized long method2636() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1982) {
            Statics.field2436 += Statics.field1982 - var0;
        }
        Statics.field1982 = var0;
        return Statics.field2436 + var0;
    }
}
