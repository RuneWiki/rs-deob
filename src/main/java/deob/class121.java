package deob;

@ObfuscatedName("di")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.g(I)J")
    public static synchronized long method131() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1992) {
            Statics.field1993 += Statics.field1992 - var0;
        }
        Statics.field1992 = var0;
        return Statics.field1993 + var0;
    }
}
