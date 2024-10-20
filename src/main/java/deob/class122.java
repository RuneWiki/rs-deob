package deob;

@ObfuscatedName("db")
public class class122 {

    @ObfuscatedName("db.n")
    public static final class122 field1970 = new class122(0);

    @ObfuscatedName("db.g")
    public static final class122 field1963 = new class122(1);

    @ObfuscatedName("db.a")
    public static final class122 field1965 = new class122(2);

    @ObfuscatedName("db.m")
    public final int field1966;

    public class122(int arg0) {
        this.field1966 = arg0;
    }

    @ObfuscatedName("am.n(IB)Ldb;")
    public static class122 method638(int arg0) {
        class122[] var1 = new class122[] { field1963, field1970, field1965 };
        class122[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class122 var4 = var2[var3];
            if (var4.field1966 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
