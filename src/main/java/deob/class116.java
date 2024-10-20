package deob;

@ObfuscatedName("dg")
public class class116 {

    @ObfuscatedName("dg.s")
    public int field1674 = class107.method1835(16);

    @ObfuscatedName("dg.c")
    public int field1670 = class107.method1835(24);

    @ObfuscatedName("dg.f")
    public int field1671 = class107.method1835(24);

    @ObfuscatedName("dg.m")
    public int field1669 = class107.method1835(24) + 1;

    @ObfuscatedName("dg.h")
    public int field1673 = class107.method1835(6) + 1;

    @ObfuscatedName("dg.t")
    public int field1675 = class107.method1835(8);

    @ObfuscatedName("dg.p")
    public int[] field1672;

    public class116() {
        int[] var1 = new int[this.field1673];
        for (int var2 = 0; var2 < this.field1673; var2++) {
            int var3 = 0;
            int var4 = class107.method1835(3);
            boolean var5 = class107.method1834() != 0;
            if (var5) {
                var3 = class107.method1835(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1672 = new int[this.field1673 * 8];
        for (int var6 = 0; var6 < this.field1673 * 8; var6++) {
            this.field1672[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class107.method1835(8);
        }
    }

    @ObfuscatedName("dg.s([FIZ)V")
    public void method1967(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1580[this.field1675].field1563;
        int var6 = this.field1671 - this.field1670;
        int var7 = var6 / this.field1669;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1580[this.field1675].method1816();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1673;
                        }
                        var11 /= this.field1673;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1672[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1669 * var10 + this.field1670;
                        class105 var17 = Statics.field1580[var15];
                        if (this.field1674 == 0) {
                            int var18 = this.field1669 / var17.field1563;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1810();
                                for (int var21 = 0; var21 < var17.field1563; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1669) {
                                float[] var23 = var17.method1810();
                                for (int var24 = 0; var24 < var17.field1563; var24++) {
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
