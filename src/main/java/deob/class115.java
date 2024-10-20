package deob;

@ObfuscatedName("dr")
public class class115 {

    @ObfuscatedName("dr.a")
    public int field1567 = class106.method1795(16);

    @ObfuscatedName("dr.w")
    public int field1565 = class106.method1795(24);

    @ObfuscatedName("dr.e")
    public int field1571 = class106.method1795(24);

    @ObfuscatedName("dr.k")
    public int field1568 = class106.method1795(24) + 1;

    @ObfuscatedName("dr.u")
    public int field1569 = class106.method1795(6) + 1;

    @ObfuscatedName("dr.z")
    public int field1570 = class106.method1795(8);

    @ObfuscatedName("dr.t")
    public int[] field1566;

    public class115() {
        int[] var1 = new int[this.field1569];
        for (int var2 = 0; var2 < this.field1569; var2++) {
            int var3 = 0;
            int var4 = class106.method1795(3);
            boolean var5 = class106.method1789() != 0;
            if (var5) {
                var3 = class106.method1795(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1566 = new int[this.field1569 * 8];
        for (int var6 = 0; var6 < this.field1569 * 8; var6++) {
            this.field1566[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class106.method1795(8);
        }
    }

    @ObfuscatedName("dr.a([FIZ)V")
    public void method1918(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1498[this.field1570].field1469;
        int var6 = this.field1571 - this.field1565;
        int var7 = var6 / this.field1568;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1498[this.field1570].method1771();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1569;
                        }
                        var11 /= this.field1569;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1566[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1568 * var10 + this.field1565;
                        class104 var17 = Statics.field1498[var15];
                        if (this.field1567 == 0) {
                            int var18 = this.field1568 / var17.field1469;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1768();
                                for (int var21 = 0; var21 < var17.field1469; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1568) {
                                float[] var23 = var17.method1768();
                                for (int var24 = 0; var24 < var17.field1469; var24++) {
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
