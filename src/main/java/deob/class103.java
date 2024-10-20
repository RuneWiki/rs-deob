package deob;

@ObfuscatedName("ce")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.z(I)J")
    public static synchronized long method26() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1798) {
            Statics.field1799 += Statics.field1798 - var0;
        }
        Statics.field1798 = var0;
        return Statics.field1799 + var0;
    }
}
