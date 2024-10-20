package deob;

@ObfuscatedName("dn")
public class class102 {

    @ObfuscatedName("dn.ac")
    public class564[] field1310;

    @ObfuscatedName("dn.af")
    public int[] field1317 = new int[256];

    @ObfuscatedName("dn.at")
    public int field1313 = 0;

    @ObfuscatedName("dn.au")
    public int[] field1314;

    @ObfuscatedName("dn.ar")
    public int[] field1321;

    @ObfuscatedName("dn.al")
    public int[] field1316;

    @ObfuscatedName("dn.ad")
    public int[] field1326;

    @ObfuscatedName("dn.ah")
    public int field1318 = 0;

    @ObfuscatedName("dn.ap")
    public int field1328 = 0;

    @ObfuscatedName("dn.ab")
    public int[] field1320;

    @ObfuscatedName("dn.az")
    public int[] field1319;

    @ObfuscatedName("dn.aa")
    public int[] field1322;

    @ObfuscatedName("dn.ai")
    public int[] field1323;

    @ObfuscatedName("dn.ao")
    public int field1324 = 0;

    @ObfuscatedName("dn.as")
    public int field1325 = 0;

    @ObfuscatedName("dn.ay")
    public int field1315 = 0;

    @ObfuscatedName("dn.aj")
    public final int[][] field1327;

    public class102(class564[] arg0, int[][] arg1) {
        this.field1310 = arg0;
        this.field1327 = arg1;
        this.method2567();
    }

    @ObfuscatedName("dn.ac(I)V")
    public void method2567() {
        this.field1321 = method3182(this.field1327[0][0], this.field1327[0][1], this.field1327[0][2], this.field1327[0][3], this.field1327[0][4]);
        this.field1316 = method3182(this.field1327[1][0], this.field1327[1][1], this.field1327[1][2], this.field1327[1][3], this.field1327[1][4]);
        this.field1326 = method3182(this.field1327[2][0], this.field1327[2][1], this.field1327[2][2], this.field1327[2][3], this.field1327[2][4]);
        this.field1314 = new int[256];
        this.field1324 = 0;
        this.field1322 = new int[32768];
        this.field1323 = new int[32768];
        this.method2575((class564) null);
        this.field1320 = new int[32768];
        this.field1319 = new int[32768];
    }

    @ObfuscatedName("fg.ae(IIIIIB)[I")
    public static int[] method3182(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var5 = new int[256];
        for (int var6 = 0; var6 < 64; var6++) {
            var5[var6] = method8245(arg0, arg1, var6);
        }
        for (int var7 = 0; var7 < 64; var7++) {
            var5[var7 + 64] = method8245(arg1, arg2, var7);
        }
        for (int var8 = 0; var8 < 64; var8++) {
            var5[var8 + 128] = method8245(arg2, arg3, var8);
        }
        for (int var9 = 0; var9 < 64; var9++) {
            var5[var9 + 192] = method8245(arg3, arg4, var9);
        }
        return var5;
    }

    @ObfuscatedName("sg.ag(IIII)I")
    public static int method8245(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dn.am(B)V")
    public void method2595() {
        this.field1321 = null;
        this.field1316 = null;
        this.field1326 = null;
        this.field1314 = null;
        this.field1322 = null;
        this.field1323 = null;
        this.field1320 = null;
        this.field1319 = null;
        this.field1324 = 0;
        this.field1325 = 0;
    }

    @ObfuscatedName("dn.ax(IIB)V")
    public void method2561(int arg0, int arg1) {
        if (this.field1320 == null) {
            this.method2567();
        }
        if (this.field1315 == 0) {
            this.field1315 = arg1;
        }
        int var3 = arg1 - this.field1315;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1315 = arg1;
        if (var3 > 0) {
            this.method2562(var3);
        }
        this.method2559(arg0);
    }

    @ObfuscatedName("dn.aq(II)V")
    public final void method2562(int arg0) {
        this.field1324 += arg0 * 128;
        if (this.field1324 > this.field1322.length) {
            this.field1324 -= this.field1322.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2575(this.field1310[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1320[var3 + var4] - this.field1322[this.field1324 + var3 & this.field1322.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1320[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1320[var11 + var12] = 255;
                } else {
                    this.field1320[var11 + var12] = 0;
                }
            }
        }
        if (this.field1318 > 0) {
            this.field1318 -= arg0 * 4;
        }
        if (this.field1328 > 0) {
            this.field1328 -= arg0 * 4;
        }
        if (this.field1318 == 0 && this.field1328 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1318 = 1024;
            }
            if (var14 == 1) {
                this.field1328 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1317[var15] = this.field1317[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1317[var16] = (int) (Math.sin((double) this.field1313 / 14.0D) * 16.0D + Math.sin((double) this.field1313 / 15.0D) * 14.0D + Math.sin((double) this.field1313 / 16.0D) * 12.0D);
            this.field1313++;
        }
        this.field1325 += arg0;
        int var17 = ((client.field609 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1325 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1320[(var23 << 7) + var22] = 192;
        }
        this.field1325 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1320[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1320[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1319[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1319[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1319[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1320[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dn.af(IIIB)I")
    public final int method2579(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dn.at(II)V")
    public final void method2559(int arg0) {
        int var2 = this.field1314.length;
        if (this.field1318 > 0) {
            this.method2565(this.field1318, this.field1316);
        } else if (this.field1328 > 0) {
            this.method2565(this.field1328, this.field1326);
        } else {
            System.arraycopy(this.field1321, 0, this.field1314, 0, var2);
        }
        this.method2592(arg0);
    }

    @ObfuscatedName("dn.au(I[II)V")
    public final void method2565(int arg0, int[] arg1) {
        int var3 = this.field1314.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1314[var4] = this.method2579(this.field1321[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1314[var4] = arg1[var4];
            } else {
                this.field1314[var4] = this.method2579(arg1[var4], this.field1321[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dn.ar(II)V")
    public final void method2592(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1317[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field3281.field5492) {
                var7 = Statics.field3281.field5492 - var5;
            }
            int var8 = Statics.field3281.field5492 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1320[var9++];
                int var12 = var8 % Statics.field5483;
                if (var11 == 0 || var12 < class561.field5486 || var12 >= class561.field5487) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1314[var11];
                    int var16 = Statics.field3281.field5494[var8];
                    Statics.field3281.field5494[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dn.al(Lvt;I)V")
    public final void method2575(class564 arg0) {
        for (int var2 = 0; var2 < this.field1322.length; var2++) {
            this.field1322[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1322[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1323[var8] = (this.field1322[var8 - 1] + this.field1322[var8 + 1] + this.field1322[var8 - 128] + this.field1322[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1322;
            this.field1322 = this.field1323;
            this.field1323 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5504; var11++) {
            for (int var12 = 0; var12 < arg0.field5503; var12++) {
                if (arg0.field5507[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5508;
                    int var14 = var11 + 16 + arg0.field5506;
                    int var15 = (var14 << 7) + var13;
                    this.field1322[var15] = 0;
                }
            }
        }
    }
}
