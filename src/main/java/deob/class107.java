package deob;

@ObfuscatedName("df")
public class class107 {

    @ObfuscatedName("df.n")
    public class123[] field1562 = new class123[10];

    @ObfuscatedName("df.g")
    public int field1564;

    @ObfuscatedName("df.y")
    public int field1565;

    @ObfuscatedName("df.e(Lit;II)Ldf;")
    public static class107 method1820(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3817(arg1, arg2);
        return var3 == null ? null : new class107(new class175(var3));
    }

    public class107(class175 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2928();
            if (var3 != 0) {
                arg0.field2381--;
                this.field1562[var2] = new class123();
                this.field1562[var2].method2135(arg0);
            }
        }
        this.field1564 = arg0.method3091();
        this.field1565 = arg0.method3091();
    }

    @ObfuscatedName("df.n()Ldb;")
    public class109 method1818() {
        byte[] var1 = this.method1821();
        return new class109(22050, var1, this.field1564 * 22050 / 1000, this.field1565 * 22050 / 1000);
    }

    @ObfuscatedName("df.g()I")
    public final int method1819() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1562[var2] != null && this.field1562[var2].field1717 / 20 < var1) {
                var1 = this.field1562[var2].field1717 / 20;
            }
        }
        if (this.field1564 < this.field1565 && this.field1564 / 20 < var1) {
            var1 = this.field1564 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1562[var3] != null) {
                this.field1562[var3].field1717 -= var1 * 20;
            }
        }
        if (this.field1564 < this.field1565) {
            this.field1564 -= var1 * 20;
            this.field1565 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("df.y()[B")
    public final byte[] method1821() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1562[var2] != null && this.field1562[var2].field1728 + this.field1562[var2].field1717 > var1) {
                var1 = this.field1562[var2].field1728 + this.field1562[var2].field1717;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1562[var5] != null) {
                int var6 = this.field1562[var5].field1728 * 22050 / 1000;
                int var7 = this.field1562[var5].field1717 * 22050 / 1000;
                int[] var8 = this.field1562[var5].method2136(var6, this.field1562[var5].field1728);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
