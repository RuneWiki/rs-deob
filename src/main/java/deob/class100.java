package deob;

@ObfuscatedName("dd")
public class class100 {

    @ObfuscatedName("dd.ac")
    public class543[] field1283;

    @ObfuscatedName("dd.ar")
    public int[] field1276 = new int[256];

    @ObfuscatedName("dd.ab")
    public int field1277 = 0;

    @ObfuscatedName("dd.am")
    public int[] field1285;

    @ObfuscatedName("dd.av")
    public int[] field1279;

    @ObfuscatedName("dd.ag")
    public int[] field1280;

    @ObfuscatedName("dd.aa")
    public int[] field1275;

    @ObfuscatedName("dd.ap")
    public int field1282 = 0;

    @ObfuscatedName("dd.ay")
    public int field1291 = 0;

    @ObfuscatedName("dd.as")
    public int[] field1281;

    @ObfuscatedName("dd.aj")
    public int[] field1287;

    @ObfuscatedName("dd.an")
    public int[] field1278;

    @ObfuscatedName("dd.au")
    public int[] field1289;

    @ObfuscatedName("dd.ai")
    public int field1288 = 0;

    @ObfuscatedName("dd.ae")
    public int field1286 = 0;

    @ObfuscatedName("dd.aw")
    public int field1290 = 0;

    public class100(class543[] arg0) {
        this.field1283 = arg0;
        this.method2377();
    }

    @ObfuscatedName("dd.ac(B)V")
    public void method2377() {
        this.field1279 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1279[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1279[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1279[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1279[var4 + 192] = 16777215;
        }
        this.field1280 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1280[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1280[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1280[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1280[var8 + 192] = 16777215;
        }
        this.field1275 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1275[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1275[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1275[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1275[var12 + 192] = 16777215;
        }
        this.field1285 = new int[256];
        this.field1288 = 0;
        this.field1278 = new int[32768];
        this.field1289 = new int[32768];
        this.method2355((class543) null);
        this.field1281 = new int[32768];
        this.field1287 = new int[32768];
    }

    @ObfuscatedName("dd.al(I)V")
    public void method2348() {
        this.field1279 = null;
        this.field1280 = null;
        this.field1275 = null;
        this.field1285 = null;
        this.field1278 = null;
        this.field1289 = null;
        this.field1281 = null;
        this.field1287 = null;
        this.field1288 = 0;
        this.field1286 = 0;
    }

    @ObfuscatedName("dd.ak(III)V")
    public void method2379(int arg0, int arg1) {
        if (this.field1281 == null) {
            this.method2377();
        }
        if (this.field1290 == 0) {
            this.field1290 = arg1;
        }
        int var3 = arg1 - this.field1290;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1290 = arg1;
        if (var3 > 0) {
            this.method2349(var3);
        }
        this.method2352(arg0);
    }

    @ObfuscatedName("dd.ax(II)V")
    public final void method2349(int arg0) {
        this.field1288 += arg0 * 128;
        if (this.field1288 > this.field1278.length) {
            this.field1288 -= this.field1278.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2355(this.field1283[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1281[var3 + var4] - this.field1278[this.field1288 + var3 & this.field1278.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1281[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1281[var11 + var12] = 255;
                } else {
                    this.field1281[var11 + var12] = 0;
                }
            }
        }
        if (this.field1282 > 0) {
            this.field1282 -= arg0 * 4;
        }
        if (this.field1291 > 0) {
            this.field1291 -= arg0 * 4;
        }
        if (this.field1282 == 0 && this.field1291 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1282 = 1024;
            }
            if (var14 == 1) {
                this.field1291 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1276[var15] = this.field1276[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1276[var16] = (int) (Math.sin((double) this.field1277 / 14.0D) * 16.0D + Math.sin((double) this.field1277 / 15.0D) * 14.0D + Math.sin((double) this.field1277 / 16.0D) * 12.0D);
            this.field1277++;
        }
        this.field1286 += arg0;
        int var17 = ((client.field533 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1286 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1281[(var23 << 7) + var22] = 192;
        }
        this.field1286 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1281[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1281[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1287[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1287[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1287[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1281[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dd.ao(IIIB)I")
    public final int method2350(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dd.ah(II)V")
    public final void method2352(int arg0) {
        int var2 = this.field1285.length;
        if (this.field1282 > 0) {
            this.method2369(this.field1282, this.field1280);
        } else if (this.field1291 > 0) {
            this.method2369(this.field1291, this.field1275);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1285[var3] = this.field1279[var3];
            }
        }
        this.method2354(arg0);
    }

    @ObfuscatedName("dd.ar(I[II)V")
    public final void method2369(int arg0, int[] arg1) {
        int var3 = this.field1285.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1285[var4] = this.method2350(this.field1279[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1285[var4] = arg1[var4];
            } else {
                this.field1285[var4] = this.method2350(arg1[var4], this.field1279[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dd.ab(II)V")
    public final void method2354(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1276[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2346.field5216) {
                var7 = Statics.field2346.field5216 - var5;
            }
            int var8 = Statics.field2346.field5216 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1281[var9++];
                int var12 = var8 % Statics.field5207;
                if (var11 == 0 || var12 < class540.field5214 || var12 >= class540.field5215) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1285[var11];
                    int var16 = Statics.field2346.field5218[var8];
                    Statics.field2346.field5218[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dd.am(Lun;I)V")
    public final void method2355(class543 arg0) {
        for (int var2 = 0; var2 < this.field1278.length; var2++) {
            this.field1278[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1278[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1289[var8] = (this.field1278[var8 - 1] + this.field1278[var8 + 1] + this.field1278[var8 - 128] + this.field1278[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1278;
            this.field1278 = this.field1289;
            this.field1289 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5229; var11++) {
            for (int var12 = 0; var12 < arg0.field5231; var12++) {
                if (arg0.field5230[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5228;
                    int var14 = var11 + 16 + arg0.field5226;
                    int var15 = (var14 << 7) + var13;
                    this.field1278[var15] = 0;
                }
            }
        }
    }
}
