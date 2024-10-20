package deob;

@ObfuscatedName("dy")
public class class114 {

    @ObfuscatedName("dy.z")
    public static final class114 field1883 = new class114(0);

    @ObfuscatedName("dy.n")
    public static final class114 field1885 = new class114(1);

    @ObfuscatedName("dy.u")
    public static final class114 field1882 = new class114(2);

    @ObfuscatedName("dy.t")
    public final int field1884;

    public class114(int arg0) {
        this.field1884 = arg0;
    }

    @ObfuscatedName("eb.z(II)Ldy;")
    public static class114 method2708(int arg0) {
        class114[] var1 = new class114[] { field1883, field1885, field1882 };
        class114[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class114 var4 = var2[var3];
            if (var4.field1884 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
