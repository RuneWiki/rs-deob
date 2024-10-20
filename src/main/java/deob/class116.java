package deob;

@ObfuscatedName("da")
public class class116 {

    @ObfuscatedName("da.c")
    public int field1640 = class107.method1741(16);

    @ObfuscatedName("da.o")
    public int field1644 = class107.method1741(24);

    @ObfuscatedName("da.i")
    public int field1638 = class107.method1741(24);

    @ObfuscatedName("da.u")
    public int field1641 = class107.method1741(24) + 1;

    @ObfuscatedName("da.g")
    public int field1642 = class107.method1741(6) + 1;

    @ObfuscatedName("da.m")
    public int field1643 = class107.method1741(8);

    @ObfuscatedName("da.s")
    public int[] field1639;

    public class116() {
        int[] var1 = new int[this.field1642];
        for (int var2 = 0; var2 < this.field1642; var2++) {
            int var3 = 0;
            int var4 = class107.method1741(3);
            boolean var5 = class107.method1740() != 0;
            if (var5) {
                var3 = class107.method1741(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1639 = new int[this.field1642 * 8];
        for (int var6 = 0; var6 < this.field1642 * 8; var6++) {
            this.field1639[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class107.method1741(8);
        }
    }

    @ObfuscatedName("da.c([FIZ)V")
    public void method1878(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1573[this.field1643].field1532;
        int var6 = this.field1638 - this.field1644;
        int var7 = var6 / this.field1641;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1573[this.field1643].method1714();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1642;
                        }
                        var11 /= this.field1642;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1639[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1641 * var10 + this.field1644;
                        class105 var17 = Statics.field1573[var15];
                        if (this.field1640 == 0) {
                            int var18 = this.field1641 / var17.field1532;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1723();
                                for (int var21 = 0; var21 < var17.field1532; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1641) {
                                float[] var23 = var17.method1723();
                                for (int var24 = 0; var24 < var17.field1532; var24++) {
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
