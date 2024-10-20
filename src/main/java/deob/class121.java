package deob;

@ObfuscatedName("dc")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.b(I)J")
    public static synchronized long method2318() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2025) {
            Statics.field2026 += Statics.field2025 - var0;
        }
        Statics.field2025 = var0;
        return Statics.field2026 + var0;
    }
}
