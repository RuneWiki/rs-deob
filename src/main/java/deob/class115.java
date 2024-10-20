package deob;

@ObfuscatedName("do")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.j(I)J")
    public static synchronized long method2249() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1563) {
            Statics.field1974 += Statics.field1563 - var0;
        }
        Statics.field1563 = var0;
        return Statics.field1974 + var0;
    }
}
