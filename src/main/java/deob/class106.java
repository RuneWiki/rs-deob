package deob;

@ObfuscatedName("dr")
public class class106 {

    @ObfuscatedName("dr.c")
    public class122[] field1583 = new class122[10];

    @ObfuscatedName("dr.e")
    public int field1585;

    @ObfuscatedName("dr.v")
    public int field1586;

    @ObfuscatedName("dr.i(Liw;II)Ldr;")
    public static class106 method1796(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3769(arg1, arg2);
        return var3 == null ? null : new class106(new class174(var3));
    }

    public class106(class174 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2870();
            if (var3 != 0) {
                arg0.field2407--;
                this.field1583[var2] = new class122();
                this.field1583[var2].method2094(arg0);
            }
        }
        this.field1585 = arg0.method2872();
        this.field1586 = arg0.method2872();
    }

    @ObfuscatedName("dr.c()Ldi;")
    public class108 method1785() {
        byte[] var1 = this.method1794();
        return new class108(22050, var1, this.field1585 * 22050 / 1000, this.field1586 * 22050 / 1000);
    }

    @ObfuscatedName("dr.e()I")
    public final int method1797() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1583[var2] != null && this.field1583[var2].field1750 / 20 < var1) {
                var1 = this.field1583[var2].field1750 / 20;
            }
        }
        if (this.field1585 < this.field1586 && this.field1585 / 20 < var1) {
            var1 = this.field1585 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1583[var3] != null) {
                this.field1583[var3].field1750 -= var1 * 20;
            }
        }
        if (this.field1585 < this.field1586) {
            this.field1585 -= var1 * 20;
            this.field1586 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("dr.v()[B")
    public final byte[] method1794() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1583[var2] != null && this.field1583[var2].field1759 + this.field1583[var2].field1750 > var1) {
                var1 = this.field1583[var2].field1759 + this.field1583[var2].field1750;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1583[var5] != null) {
                int var6 = this.field1583[var5].field1759 * 22050 / 1000;
                int var7 = this.field1583[var5].field1750 * 22050 / 1000;
                int[] var8 = this.field1583[var5].method2091(var6, this.field1583[var5].field1759);
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
