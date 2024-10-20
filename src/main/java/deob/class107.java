package deob;

@ObfuscatedName("dm")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.y(S)J")
    public static synchronized long method78() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1878) {
            Statics.field1877 += Statics.field1878 - var0;
        }
        Statics.field1878 = var0;
        return Statics.field1877 + var0;
    }
}
