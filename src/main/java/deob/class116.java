package deob;

@ObfuscatedName("dp")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.t(I)J")
    public static synchronized long method2586() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1980) {
            Statics.field1979 += Statics.field1980 - var0;
        }
        Statics.field1980 = var0;
        return Statics.field1979 + var0;
    }
}
