package deob;

@ObfuscatedName("dz")
public class class116 {

    @ObfuscatedName("dz.i")
    public int field1670 = class107.method1821(16);

    @ObfuscatedName("dz.h")
    public int field1665 = class107.method1821(24);

    @ObfuscatedName("dz.u")
    public int field1664 = class107.method1821(24);

    @ObfuscatedName("dz.q")
    public int field1667 = class107.method1821(24) + 1;

    @ObfuscatedName("dz.g")
    public int field1668 = class107.method1821(6) + 1;

    @ObfuscatedName("dz.v")
    public int field1669 = class107.method1821(8);

    @ObfuscatedName("dz.t")
    public int[] field1666;

    public class116() {
        int[] var1 = new int[this.field1668];
        for (int var2 = 0; var2 < this.field1668; var2++) {
            int var3 = 0;
            int var4 = class107.method1821(3);
            boolean var5 = class107.method1820() != 0;
            if (var5) {
                var3 = class107.method1821(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1666 = new int[this.field1668 * 8];
        for (int var6 = 0; var6 < this.field1668 * 8; var6++) {
            this.field1666[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class107.method1821(8);
        }
    }

    @ObfuscatedName("dz.i([FIZ)V")
    public void method1960(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1579[this.field1669].field1562;
        int var6 = this.field1664 - this.field1665;
        int var7 = var6 / this.field1667;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1579[this.field1669].method1793();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1668;
                        }
                        var11 /= this.field1668;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1666[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1667 * var10 + this.field1665;
                        class105 var17 = Statics.field1579[var15];
                        if (this.field1670 == 0) {
                            int var18 = this.field1667 / var17.field1562;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1794();
                                for (int var21 = 0; var21 < var17.field1562; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1667) {
                                float[] var23 = var17.method1794();
                                for (int var24 = 0; var24 < var17.field1562; var24++) {
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
