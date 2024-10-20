package deob;

@ObfuscatedName("dr")
public class class122 {

    @ObfuscatedName("dr.b")
    public static final class122 field1959 = new class122(0);

    @ObfuscatedName("dr.e")
    public static final class122 field1960 = new class122(1);

    @ObfuscatedName("dr.a")
    public static final class122 field1958 = new class122(2);

    @ObfuscatedName("dr.k")
    public final int field1957;

    public class122(int arg0) {
        this.field1957 = arg0;
    }

    @ObfuscatedName("am.b(II)Ldr;")
    public static class122 method709(int arg0) {
        class122[] var1 = new class122[] { field1958, field1959, field1960 };
        class122[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class122 var4 = var2[var3];
            if (var4.field1957 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
