package deob;

@ObfuscatedName("dc")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.n(S)J")
    public static synchronized long method1430() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1872) {
            Statics.field1867 += Statics.field1872 - var0;
        }
        Statics.field1872 = var0;
        return Statics.field1867 + var0;
    }
}
