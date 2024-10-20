package deob;

@ObfuscatedName("dk")
public class class100 {

    @ObfuscatedName("dk.ab")
    public class562[] field1265;

    @ObfuscatedName("dk.am")
    public int[] field1275 = new int[256];

    @ObfuscatedName("dk.ac")
    public int field1267 = 0;

    @ObfuscatedName("dk.ae")
    public int[] field1268;

    @ObfuscatedName("dk.ad")
    public int[] field1269;

    @ObfuscatedName("dk.aq")
    public int[] field1272;

    @ObfuscatedName("dk.al")
    public int[] field1271;

    @ObfuscatedName("dk.aj")
    public int field1281 = 0;

    @ObfuscatedName("dk.as")
    public int field1273 = 0;

    @ObfuscatedName("dk.aw")
    public int[] field1266;

    @ObfuscatedName("dk.af")
    public int[] field1277;

    @ObfuscatedName("dk.aa")
    public int[] field1276;

    @ObfuscatedName("dk.ah")
    public int[] field1270;

    @ObfuscatedName("dk.ag")
    public int field1278 = 0;

    @ObfuscatedName("dk.av")
    public int field1279 = 0;

    @ObfuscatedName("dk.ar")
    public int field1280 = 0;

    public class100(class562[] arg0) {
        this.field1265 = arg0;
        this.method2474();
    }

    @ObfuscatedName("dk.ab(B)V")
    public void method2474() {
        this.field1269 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1269[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1269[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1269[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1269[var4 + 192] = 16777215;
        }
        this.field1272 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1272[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1272[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1272[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1272[var8 + 192] = 16777215;
        }
        this.field1271 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1271[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1271[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1271[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1271[var12 + 192] = 16777215;
        }
        this.field1268 = new int[256];
        this.field1278 = 0;
        this.field1276 = new int[32768];
        this.field1270 = new int[32768];
        this.method2481((class562) null);
        this.field1266 = new int[32768];
        this.field1277 = new int[32768];
    }

    @ObfuscatedName("dk.ay(B)V")
    public void method2475() {
        this.field1269 = null;
        this.field1272 = null;
        this.field1271 = null;
        this.field1268 = null;
        this.field1276 = null;
        this.field1270 = null;
        this.field1266 = null;
        this.field1277 = null;
        this.field1278 = 0;
        this.field1279 = 0;
    }

    @ObfuscatedName("dk.an(III)V")
    public void method2476(int arg0, int arg1) {
        if (this.field1266 == null) {
            this.method2474();
        }
        if (this.field1280 == 0) {
            this.field1280 = arg1;
        }
        int var3 = arg1 - this.field1280;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1280 = arg1;
        if (var3 > 0) {
            this.method2487(var3);
        }
        this.method2484(arg0);
    }

    @ObfuscatedName("dk.au(IB)V")
    public final void method2487(int arg0) {
        this.field1278 += arg0 * 128;
        if (this.field1278 > this.field1276.length) {
            this.field1278 -= this.field1276.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2481(this.field1265[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1266[var3 + var4] - this.field1276[this.field1278 + var3 & this.field1276.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1266[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1266[var11 + var12] = 255;
                } else {
                    this.field1266[var11 + var12] = 0;
                }
            }
        }
        if (this.field1281 > 0) {
            this.field1281 -= arg0 * 4;
        }
        if (this.field1273 > 0) {
            this.field1273 -= arg0 * 4;
        }
        if (this.field1281 == 0 && this.field1273 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1281 = 1024;
            }
            if (var14 == 1) {
                this.field1273 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1275[var15] = this.field1275[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1275[var16] = (int) (Math.sin((double) this.field1267 / 14.0D) * 16.0D + Math.sin((double) this.field1267 / 15.0D) * 14.0D + Math.sin((double) this.field1267 / 16.0D) * 12.0D);
            this.field1267++;
        }
        this.field1279 += arg0;
        int var17 = ((client.field519 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1279 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1266[(var23 << 7) + var22] = 192;
        }
        this.field1279 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1266[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1266[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1277[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1277[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1277[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1266[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dk.ax(IIIB)I")
    public final int method2496(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dk.ao(IB)V")
    public final void method2484(int arg0) {
        int var2 = this.field1268.length;
        if (this.field1281 > 0) {
            this.method2479(this.field1281, this.field1272);
        } else if (this.field1273 > 0) {
            this.method2479(this.field1273, this.field1271);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1268[var3] = this.field1269[var3];
            }
        }
        this.method2478(arg0);
    }

    @ObfuscatedName("dk.am(I[IS)V")
    public final void method2479(int arg0, int[] arg1) {
        int var3 = this.field1268.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1268[var4] = this.method2496(this.field1269[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1268[var4] = arg1[var4];
            } else {
                this.field1268[var4] = this.method2496(arg1[var4], this.field1269[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dk.ac(IB)V")
    public final void method2478(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1275[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field3197.field5458) {
                var7 = Statics.field3197.field5458 - var5;
            }
            int var8 = Statics.field3197.field5458 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1266[var9++];
                int var12 = var8 % Statics.field5448;
                if (var11 == 0 || var12 < class559.field5447 || var12 >= class559.field5455) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1268[var11];
                    int var16 = Statics.field3197.field5460[var8];
                    Statics.field3197.field5460[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dk.ae(Lvb;I)V")
    public final void method2481(class562 arg0) {
        for (int var2 = 0; var2 < this.field1276.length; var2++) {
            this.field1276[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1276[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1270[var8] = (this.field1276[var8 - 1] + this.field1276[var8 + 1] + this.field1276[var8 - 128] + this.field1276[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1276;
            this.field1276 = this.field1270;
            this.field1270 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5472; var11++) {
            for (int var12 = 0; var12 < arg0.field5476; var12++) {
                if (arg0.field5469[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5473;
                    int var14 = var11 + 16 + arg0.field5471;
                    int var15 = (var14 << 7) + var13;
                    this.field1276[var15] = 0;
                }
            }
        }
    }
}
