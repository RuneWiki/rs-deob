package deob;

@ObfuscatedName("dg")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bt.a(I)J")
    public static synchronized long method1471() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1997) {
            Statics.field1992 += Statics.field1997 - var0;
        }
        Statics.field1997 = var0;
        return Statics.field1992 + var0;
    }
}
