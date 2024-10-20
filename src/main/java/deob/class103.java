package deob;

@ObfuscatedName("cq")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.t(I)J")
    public static synchronized long method1861() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1807) {
            Statics.field1810 += Statics.field1807 - var0;
        }
        Statics.field1807 = var0;
        return Statics.field1810 + var0;
    }
}
