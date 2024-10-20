package deob;

@ObfuscatedName("dt")
public class class120 {

    public class120() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.j(I)J")
    public static synchronized long method2616() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1993) {
            Statics.field1996 += Statics.field1993 - var0;
        }
        Statics.field1993 = var0;
        return Statics.field1996 + var0;
    }
}
