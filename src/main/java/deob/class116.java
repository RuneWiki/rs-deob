package deob;

@ObfuscatedName("dm")
public class class116 {

    @ObfuscatedName("dm.w")
    public int field1682 = class107.method1763(16);

    @ObfuscatedName("dm.o")
    public int field1678 = class107.method1763(24);

    @ObfuscatedName("dm.x")
    public int field1679 = class107.method1763(24);

    @ObfuscatedName("dm.k")
    public int field1677 = class107.method1763(24) + 1;

    @ObfuscatedName("dm.f")
    public int field1681 = class107.method1763(6) + 1;

    @ObfuscatedName("dm.i")
    public int field1680 = class107.method1763(8);

    @ObfuscatedName("dm.j")
    public int[] field1683;

    public class116() {
        int[] var1 = new int[this.field1681];
        for (int var2 = 0; var2 < this.field1681; var2++) {
            int var3 = 0;
            int var4 = class107.method1763(3);
            boolean var5 = class107.method1762() != 0;
            if (var5) {
                var3 = class107.method1763(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1683 = new int[this.field1681 * 8];
        for (int var6 = 0; var6 < this.field1681 * 8; var6++) {
            this.field1683[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class107.method1763(8);
        }
    }

    @ObfuscatedName("dm.w([FIZ)V")
    public void method1893(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1595[this.field1680].field1578;
        int var6 = this.field1679 - this.field1678;
        int var7 = var6 / this.field1677;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1595[this.field1680].method1729();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1681;
                        }
                        var11 /= this.field1681;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1683[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1677 * var10 + this.field1678;
                        class105 var17 = Statics.field1595[var15];
                        if (this.field1682 == 0) {
                            int var18 = this.field1677 / var17.field1578;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1732();
                                for (int var21 = 0; var21 < var17.field1578; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1677) {
                                float[] var23 = var17.method1732();
                                for (int var24 = 0; var24 < var17.field1578; var24++) {
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
