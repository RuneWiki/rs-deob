package deob;

@ObfuscatedName("du")
public class class106 {

    @ObfuscatedName("du.m")
    public class122[] field1568 = new class122[10];

    @ObfuscatedName("du.e")
    public int field1569;

    @ObfuscatedName("du.t")
    public int field1567;

    @ObfuscatedName("du.p(Lil;II)Ldu;")
    public static class106 method1725(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3720(arg1, arg2);
        return var3 == null ? null : new class106(new class174(var3));
    }

    public class106(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2810();
            if (var3 != 0) {
                arg0.field2408--;
                this.field1568[var2] = new class122();
                this.field1568[var2].method2052(arg0);
            }
        }
        this.field1569 = arg0.method2824();
        this.field1567 = arg0.method2824();
    }

    @ObfuscatedName("du.m()Ldc;")
    public class108 method1721() {
        byte[] var1 = this.method1719();
        return new class108(22050, var1, this.field1569 * 22050 / 1000, this.field1567 * 22050 / 1000);
    }

    @ObfuscatedName("du.e()I")
    public final int method1720() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1568[var2] != null && this.field1568[var2].field1733 / 20 < var1) {
                var1 = this.field1568[var2].field1733 / 20;
            }
        }
        if (this.field1569 < this.field1567 && this.field1569 / 20 < var1) {
            var1 = this.field1569 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1568[var3] != null) {
                this.field1568[var3].field1733 -= var1 * 20;
            }
        }
        if (this.field1569 < this.field1567) {
            this.field1569 -= var1 * 20;
            this.field1567 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("du.t()[B")
    public final byte[] method1719() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1568[var2] != null && this.field1568[var2].field1733 + this.field1568[var2].field1727 > var1) {
                var1 = this.field1568[var2].field1733 + this.field1568[var2].field1727;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1568[var5] != null) {
                int var6 = this.field1568[var5].field1727 * 22050 / 1000;
                int var7 = this.field1568[var5].field1733 * 22050 / 1000;
                int[] var8 = this.field1568[var5].method2050(var6, this.field1568[var5].field1727);
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
