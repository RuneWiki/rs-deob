package deob;

@ObfuscatedName("dn")
public class class114 {

    @ObfuscatedName("dn.w")
    public int field1661 = class105.method1872(16);

    @ObfuscatedName("dn.s")
    public int field1660 = class105.method1872(24);

    @ObfuscatedName("dn.q")
    public int field1662 = class105.method1872(24);

    @ObfuscatedName("dn.o")
    public int field1663 = class105.method1872(24) + 1;

    @ObfuscatedName("dn.g")
    public int field1659 = class105.method1872(6) + 1;

    @ObfuscatedName("dn.v")
    public int field1664 = class105.method1872(8);

    @ObfuscatedName("dn.p")
    public int[] field1665;

    public class114() {
        int[] var1 = new int[this.field1659];
        for (int var2 = 0; var2 < this.field1659; var2++) {
            int var3 = 0;
            int var4 = class105.method1872(3);
            boolean var5 = class105.method1868() != 0;
            if (var5) {
                var3 = class105.method1872(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1665 = new int[this.field1659 * 8];
        for (int var6 = 0; var6 < this.field1659 * 8; var6++) {
            this.field1665[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class105.method1872(8);
        }
    }

    @ObfuscatedName("dn.w([FIZ)V")
    public void method1990(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1593[this.field1664].field1560;
        int var6 = this.field1662 - this.field1660;
        int var7 = var6 / this.field1663;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1593[this.field1664].method1822();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1659;
                        }
                        var11 /= this.field1659;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1665[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1663 * var10 + this.field1660;
                        class103 var17 = Statics.field1593[var15];
                        if (this.field1661 == 0) {
                            int var18 = this.field1663 / var17.field1560;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1823();
                                for (int var21 = 0; var21 < var17.field1560; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1663) {
                                float[] var23 = var17.method1823();
                                for (int var24 = 0; var24 < var17.field1560; var24++) {
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
