package deob;

@ObfuscatedName("ef")
public class class132 extends class194 {

    @ObfuscatedName("ef.w")
    public int field1865;

    @ObfuscatedName("ef.k")
    public boolean field1864;

    @ObfuscatedName("ef.v")
    public int[] field1866;

    @ObfuscatedName("ef.z")
    public int[] field1868;

    @ObfuscatedName("ef.r")
    public int[] field1861;

    @ObfuscatedName("ef.u")
    public int[] field1870;

    @ObfuscatedName("ef.d")
    public int field1871;

    @ObfuscatedName("ef.o")
    public int field1872;

    @ObfuscatedName("ef.l")
    public int[] field1873;

    @ObfuscatedName("ef.h")
    public boolean field1874 = false;

    public class132(class175 arg0) {
        this.field1865 = arg0.method3091();
        this.field1864 = arg0.method2928() == 1;
        int var2 = arg0.method2928();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1866 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1866[var3] = arg0.method3091();
        }
        if (var2 > 1) {
            this.field1868 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1868[var4] = arg0.method2928();
            }
        }
        if (var2 > 1) {
            this.field1861 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1861[var5] = arg0.method2928();
            }
        }
        this.field1870 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1870[var6] = arg0.method2933();
        }
        this.field1871 = arg0.method2928();
        this.field1872 = arg0.method2928();
        this.field1873 = null;
    }

    @ObfuscatedName("ef.e(DILit;)Z")
    public boolean method2303(double arg0, int arg1, class237 arg2) {
        for (int var5 = 0; var5 < this.field1866.length; var5++) {
            if (arg2.method3848(this.field1866[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1873 = new int[var6];
        for (int var7 = 0; var7 < this.field1866.length; var7++) {
            int var8 = this.field1866[var7];
            class286 var9;
            if (class288.method4605(arg2, var8)) {
                var9 = class288.method74();
            } else {
                var9 = null;
            }
            var9.method4745();
            byte[] var11 = var9.field3761;
            int[] var12 = var9.field3756;
            int var13 = this.field1870[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class138.method2451(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1868[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field3758 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1873[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3758 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1873[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3758 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1873[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("ef.n()V")
    public void method2311() {
        this.field1873 = null;
    }

    @ObfuscatedName("ef.g(I)V")
    public void method2305(int arg0) {
        if (this.field1873 == null) {
            return;
        }
        if (this.field1871 == 1 || this.field1871 == 3) {
            if (Statics.field1875 == null || Statics.field1875.length < this.field1873.length) {
                Statics.field1875 = new int[this.field1873.length];
            }
            short var2;
            if (this.field1873.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1873.length;
            int var4 = arg0 * var2 * this.field1872;
            int var5 = var3 - 1;
            if (this.field1871 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1875[var6] = this.field1873[var7];
            }
            int[] var8 = this.field1873;
            this.field1873 = Statics.field1875;
            Statics.field1875 = var8;
        }
        if (this.field1871 != 2 && this.field1871 != 4) {
            return;
        }
        if (Statics.field1875 == null || Statics.field1875.length < this.field1873.length) {
            Statics.field1875 = new int[this.field1873.length];
        }
        short var9;
        if (this.field1873.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1873.length;
        int var11 = this.field1872 * arg0;
        int var12 = var9 - 1;
        if (this.field1871 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1875[var15] = this.field1873[var16];
            }
        }
        int[] var17 = this.field1873;
        this.field1873 = Statics.field1875;
        Statics.field1875 = var17;
    }
}
