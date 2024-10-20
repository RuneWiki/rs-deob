package deob;

@ObfuscatedName("du")
public class class120 {

    public class120() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.v(B)J")
    public static synchronized long method1383() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2006) {
            Statics.field2005 += Statics.field2006 - var0;
        }
        Statics.field2006 = var0;
        return Statics.field2005 + var0;
    }
}
