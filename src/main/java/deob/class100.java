package deob;

@ObfuscatedName("di")
public class class100 {

    @ObfuscatedName("di.ak")
    public class559[] field1308;

    @ObfuscatedName("di.at")
    public int[] field1297 = new int[256];

    @ObfuscatedName("di.ab")
    public int field1294 = 0;

    @ObfuscatedName("di.ac")
    public int[] field1299;

    @ObfuscatedName("di.ao")
    public int[] field1300;

    @ObfuscatedName("di.ah")
    public int[] field1301;

    @ObfuscatedName("di.av")
    public int[] field1302;

    @ObfuscatedName("di.aq")
    public int field1303 = 0;

    @ObfuscatedName("di.ap")
    public int field1304 = 0;

    @ObfuscatedName("di.ae")
    public int[] field1305;

    @ObfuscatedName("di.ax")
    public int[] field1306;

    @ObfuscatedName("di.ay")
    public int[] field1292;

    @ObfuscatedName("di.au")
    public int[] field1298;

    @ObfuscatedName("di.as")
    public int field1309 = 0;

    @ObfuscatedName("di.aw")
    public int field1293 = 0;

    @ObfuscatedName("di.ad")
    public int field1310 = 0;

    public class100(class559[] arg0) {
        this.field1308 = arg0;
        this.method2370();
    }

    @ObfuscatedName("di.ak(I)V")
    public void method2370() {
        this.field1300 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1300[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1300[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1300[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1300[var4 + 192] = 16777215;
        }
        this.field1301 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1301[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1301[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1301[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1301[var8 + 192] = 16777215;
        }
        this.field1302 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1302[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1302[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1302[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1302[var12 + 192] = 16777215;
        }
        this.field1299 = new int[256];
        this.field1309 = 0;
        this.field1292 = new int[32768];
        this.field1298 = new int[32768];
        this.method2366((class559) null);
        this.field1305 = new int[32768];
        this.field1306 = new int[32768];
    }

    @ObfuscatedName("di.al(B)V")
    public void method2355() {
        this.field1300 = null;
        this.field1301 = null;
        this.field1302 = null;
        this.field1299 = null;
        this.field1292 = null;
        this.field1298 = null;
        this.field1305 = null;
        this.field1306 = null;
        this.field1309 = 0;
        this.field1293 = 0;
    }

    @ObfuscatedName("di.aj(IIB)V")
    public void method2365(int arg0, int arg1) {
        if (this.field1305 == null) {
            this.method2370();
        }
        if (this.field1310 == 0) {
            this.field1310 = arg1;
        }
        int var3 = arg1 - this.field1310;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1310 = arg1;
        if (var3 > 0) {
            this.method2352(var3);
        }
        this.method2357(arg0);
    }

    @ObfuscatedName("di.az(II)V")
    public final void method2352(int arg0) {
        this.field1309 += arg0 * 128;
        if (this.field1309 > this.field1292.length) {
            this.field1309 -= this.field1292.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2366(this.field1308[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1305[var3 + var4] - this.field1292[this.field1309 + var3 & this.field1292.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1305[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1305[var11 + var12] = 255;
                } else {
                    this.field1305[var11 + var12] = 0;
                }
            }
        }
        if (this.field1303 > 0) {
            this.field1303 -= arg0 * 4;
        }
        if (this.field1304 > 0) {
            this.field1304 -= arg0 * 4;
        }
        if (this.field1303 == 0 && this.field1304 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1303 = 1024;
            }
            if (var14 == 1) {
                this.field1304 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1297[var15] = this.field1297[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1297[var16] = (int) (Math.sin((double) this.field1294 / 14.0D) * 16.0D + Math.sin((double) this.field1294 / 15.0D) * 14.0D + Math.sin((double) this.field1294 / 16.0D) * 12.0D);
            this.field1294++;
        }
        this.field1293 += arg0;
        int var17 = ((client.field821 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1293 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1305[(var23 << 7) + var22] = 192;
        }
        this.field1293 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1305[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1305[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1306[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1306[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1306[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1305[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("di.af(IIIB)I")
    public final int method2356(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("di.aa(IB)V")
    public final void method2357(int arg0) {
        int var2 = this.field1299.length;
        if (this.field1303 > 0) {
            this.method2364(this.field1303, this.field1301);
        } else if (this.field1304 > 0) {
            this.method2364(this.field1304, this.field1302);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1299[var3] = this.field1300[var3];
            }
        }
        this.method2359(arg0);
    }

    @ObfuscatedName("di.at(I[IB)V")
    public final void method2364(int arg0, int[] arg1) {
        int var3 = this.field1299.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1299[var4] = this.method2356(this.field1300[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1299[var4] = arg1[var4];
            } else {
                this.field1299[var4] = this.method2356(arg1[var4], this.field1300[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("di.ab(IB)V")
    public final void method2359(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1297[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field3196.field5425) {
                var7 = Statics.field3196.field5425 - var5;
            }
            int var8 = Statics.field3196.field5425 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1305[var9++];
                int var12 = var8 % Statics.field5418;
                if (var11 == 0 || var12 < class556.field5419 || var12 >= class556.field5420) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1299[var11];
                    int var16 = Statics.field3196.field5421[var8];
                    Statics.field3196.field5421[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("di.ac(Lvl;I)V")
    public final void method2366(class559 arg0) {
        for (int var2 = 0; var2 < this.field1292.length; var2++) {
            this.field1292[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1292[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1298[var8] = (this.field1292[var8 - 1] + this.field1292[var8 + 1] + this.field1292[var8 - 128] + this.field1292[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1292;
            this.field1292 = this.field1298;
            this.field1298 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5435; var11++) {
            for (int var12 = 0; var12 < arg0.field5432; var12++) {
                if (arg0.field5433[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5438;
                    int var14 = var11 + 16 + arg0.field5437;
                    int var15 = (var14 << 7) + var13;
                    this.field1292[var15] = 0;
                }
            }
        }
    }
}
