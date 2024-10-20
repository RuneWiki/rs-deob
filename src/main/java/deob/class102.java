package deob;

@ObfuscatedName("ck")
public class class102 {

    @ObfuscatedName("ck.f")
    public class396[] field1294;

    @ObfuscatedName("ck.m")
    public int[] field1301 = new int[256];

    @ObfuscatedName("ck.r")
    public int field1305 = 0;

    @ObfuscatedName("ck.h")
    public int[] field1295;

    @ObfuscatedName("ck.d")
    public int[] field1296;

    @ObfuscatedName("ck.z")
    public int[] field1297;

    @ObfuscatedName("ck.b")
    public int[] field1298;

    @ObfuscatedName("ck.i")
    public int field1299 = 0;

    @ObfuscatedName("ck.k")
    public int field1300 = 0;

    @ObfuscatedName("ck.g")
    public int[] field1306;

    @ObfuscatedName("ck.t")
    public int[] field1302;

    @ObfuscatedName("ck.x")
    public int[] field1303;

    @ObfuscatedName("ck.u")
    public int[] field1304;

    @ObfuscatedName("ck.q")
    public int field1291 = 0;

    @ObfuscatedName("ck.s")
    public int field1310 = 0;

    @ObfuscatedName("ck.p")
    public int field1307 = 0;

    public class102(class396[] arg0) {
        this.field1294 = arg0;
        this.method2020();
    }

    @ObfuscatedName("ck.f(B)V")
    public void method2020() {
        this.field1296 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1296[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1296[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1296[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1296[var4 + 192] = 16777215;
        }
        this.field1297 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1297[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1297[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1297[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1297[var8 + 192] = 16777215;
        }
        this.field1298 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1298[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1298[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1298[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1298[var12 + 192] = 16777215;
        }
        this.field1295 = new int[256];
        this.field1291 = 0;
        this.field1303 = new int[32768];
        this.field1304 = new int[32768];
        this.method2028((class396) null);
        this.field1306 = new int[32768];
        this.field1302 = new int[32768];
    }

    @ObfuscatedName("ck.e(I)V")
    public void method2030() {
        this.field1296 = null;
        this.field1297 = null;
        this.field1298 = null;
        this.field1295 = null;
        this.field1303 = null;
        this.field1304 = null;
        this.field1306 = null;
        this.field1302 = null;
        this.field1291 = 0;
        this.field1310 = 0;
    }

    @ObfuscatedName("ck.v(III)V")
    public void method2038(int arg0, int arg1) {
        if (this.field1306 == null) {
            this.method2020();
        }
        if (this.field1307 == 0) {
            this.field1307 = arg1;
        }
        int var3 = arg1 - this.field1307;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1307 = arg1;
        if (var3 > 0) {
            this.method2027(var3);
        }
        this.method2024(arg0);
    }

    @ObfuscatedName("ck.y(II)V")
    public final void method2027(int arg0) {
        this.field1291 += arg0 * 128;
        if (this.field1291 > this.field1303.length) {
            this.field1291 -= this.field1303.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2028(this.field1294[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1306[var3 + var4] - this.field1303[this.field1291 + var3 & this.field1303.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1306[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1306[var11 + var12] = 255;
                } else {
                    this.field1306[var11 + var12] = 0;
                }
            }
        }
        if (this.field1299 > 0) {
            this.field1299 -= arg0 * 4;
        }
        if (this.field1300 > 0) {
            this.field1300 -= arg0 * 4;
        }
        if (this.field1299 == 0 && this.field1300 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1299 = 1024;
            }
            if (var14 == 1) {
                this.field1300 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1301[var15] = this.field1301[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1301[var16] = (int) (Math.sin((double) this.field1305 / 14.0D) * 16.0D + Math.sin((double) this.field1305 / 15.0D) * 14.0D + Math.sin((double) this.field1305 / 16.0D) * 12.0D);
            this.field1305++;
        }
        this.field1310 += arg0;
        int var17 = ((client.field631 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1310 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1306[(var23 << 7) + var22] = 192;
        }
        this.field1310 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1306[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1306[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1302[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1302[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1302[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1306[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ck.j(IIII)I")
    public final int method2031(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ck.o(II)V")
    public final void method2024(int arg0) {
        int var2 = this.field1295.length;
        if (this.field1299 > 0) {
            this.method2025(this.field1299, this.field1297);
        } else if (this.field1300 > 0) {
            this.method2025(this.field1300, this.field1298);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1295[var3] = this.field1296[var3];
            }
        }
        this.method2026(arg0);
    }

    @ObfuscatedName("ck.m(I[II)V")
    public final void method2025(int arg0, int[] arg1) {
        int var3 = this.field1295.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1295[var4] = this.method2031(this.field1296[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1295[var4] = arg1[var4];
            } else {
                this.field1295[var4] = this.method2031(arg1[var4], this.field1296[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("ck.r(IB)V")
    public final void method2026(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1301[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2061.field4237) {
                var7 = Statics.field2061.field4237 - var5;
            }
            int var8 = Statics.field2061.field4237 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1306[var9++];
                int var12 = var8 % Statics.field4233;
                if (var11 == 0 || var12 < class393.field4234 || var12 >= class393.field4235) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1295[var11];
                    int var16 = Statics.field2061.field4238[var8];
                    Statics.field2061.field4238[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("ck.h(Lof;B)V")
    public final void method2028(class396 arg0) {
        for (int var2 = 0; var2 < this.field1303.length; var2++) {
            this.field1303[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1303[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1304[var8] = (this.field1303[var8 - 1] + this.field1303[var8 + 1] + this.field1303[var8 - 128] + this.field1303[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1303;
            this.field1303 = this.field1304;
            this.field1304 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4249; var11++) {
            for (int var12 = 0; var12 < arg0.field4246; var12++) {
                if (arg0.field4247[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4248;
                    int var14 = var11 + 16 + arg0.field4251;
                    int var15 = (var14 << 7) + var13;
                    this.field1303[var15] = 0;
                }
            }
        }
    }
}
