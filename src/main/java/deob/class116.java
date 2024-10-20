package deob;

@ObfuscatedName("da")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.j(B)J")
    public static synchronized long method1579() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1956) {
            Statics.field2917 += Statics.field1956 - var0;
        }
        Statics.field1956 = var0;
        return Statics.field2917 + var0;
    }
}
