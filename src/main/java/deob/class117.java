package deob;

@ObfuscatedName("di")
public class class117 {

    @ObfuscatedName("di.e")
    public int field1669 = class108.method1837(16);

    @ObfuscatedName("di.n")
    public int field1663 = class108.method1837(24);

    @ObfuscatedName("di.g")
    public int field1665 = class108.method1837(24);

    @ObfuscatedName("di.y")
    public int field1664 = class108.method1837(24) + 1;

    @ObfuscatedName("di.w")
    public int field1667 = class108.method1837(6) + 1;

    @ObfuscatedName("di.k")
    public int field1668 = class108.method1837(8);

    @ObfuscatedName("di.v")
    public int[] field1666;

    public class117() {
        int[] var1 = new int[this.field1667];
        for (int var2 = 0; var2 < this.field1667; var2++) {
            int var3 = 0;
            int var4 = class108.method1837(3);
            boolean var5 = class108.method1848() != 0;
            if (var5) {
                var3 = class108.method1837(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1666 = new int[this.field1667 * 8];
        for (int var6 = 0; var6 < this.field1667 * 8; var6++) {
            this.field1666[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class108.method1837(8);
        }
    }

    @ObfuscatedName("di.e([FIZ)V")
    public void method1959(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1573[this.field1668].field1559;
        int var6 = this.field1665 - this.field1663;
        int var7 = var6 / this.field1664;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1573[this.field1668].method1806();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1667;
                        }
                        var11 /= this.field1667;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1666[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1664 * var10 + this.field1663;
                        class106 var17 = Statics.field1573[var15];
                        if (this.field1669 == 0) {
                            int var18 = this.field1664 / var17.field1559;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1807();
                                for (int var21 = 0; var21 < var17.field1559; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1664) {
                                float[] var23 = var17.method1807();
                                for (int var24 = 0; var24 < var17.field1559; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }
}
