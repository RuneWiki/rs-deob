package deob;

@ObfuscatedName("dx")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.c(I)J")
    public static synchronized long method2119() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2019) {
            Statics.field2023 += Statics.field2019 - var0;
        }
        Statics.field2019 = var0;
        return Statics.field2023 + var0;
    }
}
