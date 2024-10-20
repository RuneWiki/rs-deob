package deob;

@ObfuscatedName("du")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.l(I)J")
    public static synchronized long method2266() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3146) {
            Statics.field1966 += Statics.field3146 - var0;
        }
        Statics.field3146 = var0;
        return Statics.field1966 + var0;
    }
}
