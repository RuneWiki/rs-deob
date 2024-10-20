package deob;

@ObfuscatedName("dk")
public class class130 {

    @ObfuscatedName("dk.l")
    public static final class130 field2058 = new class130(0);

    @ObfuscatedName("dk.e")
    public static final class130 field2057 = new class130(1);

    @ObfuscatedName("dk.q")
    public static final class130 field2056 = new class130(2);

    @ObfuscatedName("dk.o")
    public final int field2059;

    public class130(int arg0) {
        this.field2059 = arg0;
    }

    @ObfuscatedName("at.l(IB)Ldk;")
    public static class130 method1009(int arg0) {
        class130[] var1 = new class130[] { field2056, field2058, field2057 };
        class130[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class130 var4 = var2[var3];
            if (var4.field2059 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
