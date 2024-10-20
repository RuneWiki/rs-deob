package deob;

@ObfuscatedName("db")
public class class120 {

    public class120() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.u(I)J")
    public static synchronized long method2609() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1990) {
            Statics.field1991 += Statics.field1990 - var0;
        }
        Statics.field1990 = var0;
        return Statics.field1991 + var0;
    }
}
