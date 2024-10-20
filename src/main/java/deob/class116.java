package deob;

@ObfuscatedName("dg")
public class class116 {

    @ObfuscatedName("dg.i")
    public int field1694 = class107.method1802(16);

    @ObfuscatedName("dg.c")
    public int field1692 = class107.method1802(24);

    @ObfuscatedName("dg.e")
    public int field1696 = class107.method1802(24);

    @ObfuscatedName("dg.v")
    public int field1693 = class107.method1802(24) + 1;

    @ObfuscatedName("dg.b")
    public int field1695 = class107.method1802(6) + 1;

    @ObfuscatedName("dg.y")
    public int field1697 = class107.method1802(8);

    @ObfuscatedName("dg.h")
    public int[] field1691;

    public class116() {
        int[] var1 = new int[this.field1695];
        for (int var2 = 0; var2 < this.field1695; var2++) {
            int var3 = 0;
            int var4 = class107.method1802(3);
            boolean var5 = class107.method1801() != 0;
            if (var5) {
                var3 = class107.method1802(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1691 = new int[this.field1695 * 8];
        for (int var6 = 0; var6 < this.field1695 * 8; var6++) {
            this.field1691[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class107.method1802(8);
        }
    }

    @ObfuscatedName("dg.i([FIZ)V")
    public void method1921(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1598[this.field1697].field1581;
        int var6 = this.field1696 - this.field1692;
        int var7 = var6 / this.field1693;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1598[this.field1697].method1772();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1695;
                        }
                        var11 /= this.field1695;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1691[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1693 * var10 + this.field1692;
                        class105 var17 = Statics.field1598[var15];
                        if (this.field1694 == 0) {
                            int var18 = this.field1693 / var17.field1581;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1778();
                                for (int var21 = 0; var21 < var17.field1581; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1693) {
                                float[] var23 = var17.method1778();
                                for (int var24 = 0; var24 < var17.field1581; var24++) {
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
