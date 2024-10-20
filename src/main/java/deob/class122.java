package deob;

@ObfuscatedName("dq")
public class class122 {

    @ObfuscatedName("dq.y")
    public static final class122 field1964 = new class122(0);

    @ObfuscatedName("dq.k")
    public static final class122 field1966 = new class122(1);

    @ObfuscatedName("dq.g")
    public static final class122 field1965 = new class122(2);

    @ObfuscatedName("dq.n")
    public final int field1975;

    public class122(int arg0) {
        this.field1975 = arg0;
    }

    @ObfuscatedName("da.y(II)Ldq;")
    public static class122 method2486(int arg0) {
        class122[] var1 = new class122[] { field1964, field1966, field1965 };
        class122[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class122 var4 = var2[var3];
            if (var4.field1975 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
