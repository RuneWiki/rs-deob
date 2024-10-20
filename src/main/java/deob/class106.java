package deob;

@ObfuscatedName("dd")
public class class106 {

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.a(I)J")
    public static synchronized long method2471() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1841) {
            Statics.field1838 += Statics.field1841 - var0;
        }
        Statics.field1841 = var0;
        return Statics.field1838 + var0;
    }
}
