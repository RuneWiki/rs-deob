package deob;

@ObfuscatedName("bv")
public class class110 {

    @ObfuscatedName("bv.b")
    public int field1750;

    @ObfuscatedName("bv.c")
    public class126[] field1748 = new class126[10];

    @ObfuscatedName("bv.i")
    public int field1751;

    @ObfuscatedName("bv.c()Lbn;")
    public class117 method1929() {
        byte[] var1 = this.method1931();
        return new class117(22050, var1, this.field1750 * 22050 / 1000, this.field1751 * 22050 / 1000);
    }

    @ObfuscatedName("bv.b()I")
    public final int method1930() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1748[var2] != null && this.field1748[var2].field1888 / 20 < var1) {
                var1 = this.field1748[var2].field1888 / 20;
            }
        }
        if (this.field1750 < this.field1751 && this.field1750 / 20 < var1) {
            var1 = this.field1750 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1748[var3] != null) {
                this.field1748[var3].field1888 -= var1 * 20;
            }
        }
        if (this.field1750 < this.field1751) {
            this.field1750 -= var1 * 20;
            this.field1751 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bv.i()[B")
    public final byte[] method1931() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1748[var2] != null && this.field1748[var2].field1909 + this.field1748[var2].field1888 > var1) {
                var1 = this.field1748[var2].field1909 + this.field1748[var2].field1888;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1748[var5] != null) {
                int var6 = this.field1748[var5].field1909 * 22050 / 1000;
                int var7 = this.field1748[var5].field1888 * 22050 / 1000;
                int[] var8 = this.field1748[var5].method2181(var6, this.field1748[var5].field1909);
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

    @ObfuscatedName("bv.v(Lel;II)Lbv;")
    public static class110 method1932(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1298(arg1, arg2);
        return var3 == null ? null : new class110(new class28(var3));
    }

    public class110(class28 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method450();
            if (var3 != 0) {
                arg0.field303--;
                this.field1748[var2] = new class126();
                this.field1748[var2].method2177(arg0);
            }
        }
        this.field1750 = arg0.method349();
        this.field1751 = arg0.method349();
    }
}
