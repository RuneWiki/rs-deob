package deob;

@ObfuscatedName("dk")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.y(I)J")
    public static synchronized long method1389() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2010) {
            Statics.field2008 += Statics.field2010 - var0;
        }
        Statics.field2010 = var0;
        return Statics.field2008 + var0;
    }
}
