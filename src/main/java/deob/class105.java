package deob;

@ObfuscatedName("df")
public class class105 {

    @ObfuscatedName("df.x")
    public class121[] field1491 = new class121[10];

    @ObfuscatedName("df.k")
    public int field1492;

    @ObfuscatedName("df.z")
    public int field1490;

    @ObfuscatedName("df.d(Lid;II)Ldf;")
    public static class105 method1863(class243 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3935(arg1, arg2);
        return var3 == null ? null : new class105(new class181(var3));
    }

    public class105(class181 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3204();
            if (var3 != 0) {
                arg0.field2498--;
                this.field1491[var2] = new class121();
                this.field1491[var2].method2205(arg0);
            }
        }
        this.field1492 = arg0.method3179();
        this.field1490 = arg0.method3179();
    }

    @ObfuscatedName("df.x()Lda;")
    public class107 method1862() {
        byte[] var1 = this.method1864();
        return new class107(22050, var1, this.field1492 * 22050 / 1000, this.field1490 * 22050 / 1000);
    }

    @ObfuscatedName("df.k()I")
    public final int method1872() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1491[var2] != null && this.field1491[var2].field1657 / 20 < var1) {
                var1 = this.field1491[var2].field1657 / 20;
            }
        }
        if (this.field1492 < this.field1490 && this.field1492 / 20 < var1) {
            var1 = this.field1492 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1491[var3] != null) {
                this.field1491[var3].field1657 -= var1 * 20;
            }
        }
        if (this.field1492 < this.field1490) {
            this.field1492 -= var1 * 20;
            this.field1490 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("df.z()[B")
    public final byte[] method1864() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1491[var2] != null && this.field1491[var2].field1657 + this.field1491[var2].field1656 > var1) {
                var1 = this.field1491[var2].field1657 + this.field1491[var2].field1656;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1491[var5] != null) {
                int var6 = this.field1491[var5].field1656 * 22050 / 1000;
                int var7 = this.field1491[var5].field1657 * 22050 / 1000;
                int[] var8 = this.field1491[var5].method2203(var6, this.field1491[var5].field1656);
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
