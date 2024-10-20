package deob;

@ObfuscatedName("dz")
public class class102 {

    @ObfuscatedName("dz.ap")
    public class571[] field1303;

    @ObfuscatedName("dz.as")
    public int[] field1304 = new int[256];

    @ObfuscatedName("dz.ae")
    public int field1313 = 0;

    @ObfuscatedName("dz.am")
    public int[] field1321;

    @ObfuscatedName("dz.at")
    public int[] field1301;

    @ObfuscatedName("dz.au")
    public int[] field1305;

    @ObfuscatedName("dz.an")
    public int[] field1309;

    @ObfuscatedName("dz.ao")
    public int field1310 = 0;

    @ObfuscatedName("dz.af")
    public int field1311 = 0;

    @ObfuscatedName("dz.ar")
    public int[] field1312;

    @ObfuscatedName("dz.ab")
    public int[] field1316;

    @ObfuscatedName("dz.az")
    public int[] field1314;

    @ObfuscatedName("dz.ag")
    public int[] field1315;

    @ObfuscatedName("dz.ad")
    public int field1302 = 0;

    @ObfuscatedName("dz.ac")
    public int field1317 = 0;

    @ObfuscatedName("dz.av")
    public int field1318 = 0;

    @ObfuscatedName("dz.ax")
    public final int[][] field1319;

    public class102(class571[] arg0, int[][] arg1) {
        this.field1303 = arg0;
        this.field1319 = arg1;
        this.method2671();
    }

    @ObfuscatedName("dz.ap(I)V")
    public void method2671() {
        this.field1301 = method7425(this.field1319[0][0], this.field1319[0][1], this.field1319[0][2], this.field1319[0][3], this.field1319[0][4]);
        this.field1305 = method7425(this.field1319[1][0], this.field1319[1][1], this.field1319[1][2], this.field1319[1][3], this.field1319[1][4]);
        this.field1309 = method7425(this.field1319[2][0], this.field1319[2][1], this.field1319[2][2], this.field1319[2][3], this.field1319[2][4]);
        this.field1321 = new int[256];
        this.field1302 = 0;
        this.field1314 = new int[32768];
        this.field1315 = new int[32768];
        this.method2679((class571) null);
        this.field1312 = new int[32768];
        this.field1316 = new int[32768];
    }

    @ObfuscatedName("qk.aw(IIIIII)[I")
    public static int[] method7425(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var5 = new int[256];
        for (int var6 = 0; var6 < 64; var6++) {
            var5[var6] = method5892(arg0, arg1, var6);
        }
        for (int var7 = 0; var7 < 64; var7++) {
            var5[var7 + 64] = method5892(arg1, arg2, var7);
        }
        for (int var8 = 0; var8 < 64; var8++) {
            var5[var8 + 128] = method5892(arg2, arg3, var8);
        }
        for (int var9 = 0; var9 < 64; var9++) {
            var5[var9 + 192] = method5892(arg3, arg4, var9);
        }
        return var5;
    }

    @ObfuscatedName("lj.ak(IIII)I")
    public static int method5892(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 16 & 0xFF;
        int var4 = arg0 >> 8 & 0xFF;
        int var5 = arg0 & 0xFF;
        int var6 = arg1 >> 16 & 0xFF;
        int var7 = arg1 >> 8 & 0xFF;
        int var8 = arg1 & 0xFF;
        int var9 = (var6 - var3 + 1) * arg2 / 64 + var3 & 0xFF;
        int var10 = (var7 - var4 + 1) * arg2 / 64 + var4 & 0xFF;
        int var11 = (var8 - var5 + 1) * arg2 / 64 + var5 & 0xFF;
        return var9 << 16 | var10 << 8 | var11;
    }

    @ObfuscatedName("dz.aj(B)V")
    public void method2680() {
        this.field1301 = null;
        this.field1305 = null;
        this.field1309 = null;
        this.field1321 = null;
        this.field1314 = null;
        this.field1315 = null;
        this.field1312 = null;
        this.field1316 = null;
        this.field1302 = 0;
        this.field1317 = 0;
    }

    @ObfuscatedName("dz.ai(IIB)V")
    public void method2672(int arg0, int arg1) {
        if (this.field1312 == null) {
            this.method2671();
        }
        if (this.field1318 == 0) {
            this.field1318 = arg1;
        }
        int var3 = arg1 - this.field1318;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1318 = arg1;
        if (var3 > 0) {
            this.method2673(var3);
        }
        this.method2670(arg0);
    }

    @ObfuscatedName("dz.ay(II)V")
    public final void method2673(int arg0) {
        this.field1302 += arg0 * 128;
        if (this.field1302 > this.field1314.length) {
            this.field1302 -= this.field1314.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2679(this.field1303[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1312[var3 + var4] - this.field1314[this.field1302 + var3 & this.field1314.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1312[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1312[var11 + var12] = 255;
                } else {
                    this.field1312[var11 + var12] = 0;
                }
            }
        }
        if (this.field1310 > 0) {
            this.field1310 -= arg0 * 4;
        }
        if (this.field1311 > 0) {
            this.field1311 -= arg0 * 4;
        }
        if (this.field1310 == 0 && this.field1311 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1310 = 1024;
            }
            if (var14 == 1) {
                this.field1311 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1304[var15] = this.field1304[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1304[var16] = (int) (Math.sin((double) this.field1313 / 14.0D) * 16.0D + Math.sin((double) this.field1313 / 15.0D) * 14.0D + Math.sin((double) this.field1313 / 16.0D) * 12.0D);
            this.field1313++;
        }
        this.field1317 += arg0;
        int var17 = ((client.field518 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1317 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1312[(var23 << 7) + var22] = 192;
        }
        this.field1317 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1312[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1312[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1316[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1316[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1316[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1312[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dz.as(IIIB)I")
    public final int method2678(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dz.ae(II)V")
    public final void method2670(int arg0) {
        int var2 = this.field1321.length;
        if (this.field1310 > 0) {
            this.method2676(this.field1310, this.field1305);
        } else if (this.field1311 > 0) {
            this.method2676(this.field1311, this.field1309);
        } else {
            System.arraycopy(this.field1301, 0, this.field1321, 0, var2);
        }
        this.method2700(arg0);
    }

    @ObfuscatedName("dz.am(I[IS)V")
    public final void method2676(int arg0, int[] arg1) {
        int var3 = this.field1321.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1321[var4] = this.method2678(this.field1301[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1321[var4] = arg1[var4];
            } else {
                this.field1321[var4] = this.method2678(arg1[var4], this.field1301[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dz.at(II)V")
    public final void method2700(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1304[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2344.field5543) {
                var7 = Statics.field2344.field5543 - var5;
            }
            int var8 = Statics.field2344.field5543 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1312[var9++];
                int var12 = var8 % Statics.field5532;
                if (var11 == 0 || var12 < class568.field5538 || var12 >= class568.field5539) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1321[var11];
                    int var16 = Statics.field2344.field5540[var8];
                    Statics.field2344.field5540[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dz.au(Lvc;I)V")
    public final void method2679(class571 arg0) {
        for (int var2 = 0; var2 < this.field1314.length; var2++) {
            this.field1314[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1314[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1315[var8] = (this.field1314[var8 - 1] + this.field1314[var8 + 1] + this.field1314[var8 - 128] + this.field1314[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1314;
            this.field1314 = this.field1315;
            this.field1315 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5551; var11++) {
            for (int var12 = 0; var12 < arg0.field5549; var12++) {
                if (arg0.field5552[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5553;
                    int var14 = var11 + 16 + arg0.field5554;
                    int var15 = (var14 << 7) + var13;
                    this.field1314[var15] = 0;
                }
            }
        }
    }
}
