package deob;

@ObfuscatedName("dt")
public class class129 extends class193 {

    @ObfuscatedName("dt.q")
    public int field1870;

    @ObfuscatedName("dt.s")
    public boolean field1867;

    @ObfuscatedName("dt.r")
    public int[] field1862;

    @ObfuscatedName("dt.g")
    public int[] field1868;

    @ObfuscatedName("dt.v")
    public int[] field1869;

    @ObfuscatedName("dt.t")
    public int[] field1871;

    @ObfuscatedName("dt.y")
    public int field1872;

    @ObfuscatedName("dt.o")
    public int field1873;

    @ObfuscatedName("dt.i")
    public int[] field1866;

    @ObfuscatedName("dt.u")
    public boolean field1875 = false;

    public class129(class174 arg0) {
        this.field1870 = arg0.method3035();
        this.field1867 = arg0.method2955() == 1;
        int var2 = arg0.method2955();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1862 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1862[var3] = arg0.method3035();
        }
        if (var2 > 1) {
            this.field1868 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1868[var4] = arg0.method2955();
            }
        }
        if (var2 > 1) {
            this.field1869 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1869[var5] = arg0.method2955();
            }
        }
        this.field1871 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1871[var6] = arg0.method2960();
        }
        this.field1872 = arg0.method2955();
        this.field1873 = arg0.method2955();
        this.field1866 = null;
    }

    @ObfuscatedName("dt.d(DILit;)Z")
    public boolean method2351(double arg0, int arg1, class236 arg2) {
        for (int var5 = 0; var5 < this.field1862.length; var5++) {
            if (arg2.method3883(this.field1862[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1866 = new int[var6];
        for (int var7 = 0; var7 < this.field1862.length; var7++) {
            int var8 = this.field1862[var7];
            class286 var9;
            if (class288.method452(arg2, var8)) {
                var9 = class288.method970();
            } else {
                var9 = null;
            }
            var9.method4767();
            byte[] var11 = var9.field3789;
            int[] var12 = var9.field3788;
            int var13 = this.field1871[var7];
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
                var12[var19] = class135.method2456(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1868[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field3791 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1866[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3791 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1866[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3791 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1866[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("dt.k()V")
    public void method2349() {
        this.field1866 = null;
    }

    @ObfuscatedName("dt.e(I)V")
    public void method2350(int arg0) {
        if (this.field1866 == null) {
            return;
        }
        if (this.field1872 == 1 || this.field1872 == 3) {
            if (Statics.field1874 == null || Statics.field1874.length < this.field1866.length) {
                Statics.field1874 = new int[this.field1866.length];
            }
            short var2;
            if (this.field1866.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1866.length;
            int var4 = arg0 * var2 * this.field1873;
            int var5 = var3 - 1;
            if (this.field1872 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1874[var6] = this.field1866[var7];
            }
            int[] var8 = this.field1866;
            this.field1866 = Statics.field1874;
            Statics.field1874 = var8;
        }
        if (this.field1872 != 2 && this.field1872 != 4) {
            return;
        }
        if (Statics.field1874 == null || Statics.field1874.length < this.field1866.length) {
            Statics.field1874 = new int[this.field1866.length];
        }
        short var9;
        if (this.field1866.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1866.length;
        int var11 = this.field1873 * arg0;
        int var12 = var9 - 1;
        if (this.field1872 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1874[var15] = this.field1866[var16];
            }
        }
        int[] var17 = this.field1866;
        this.field1866 = Statics.field1874;
        Statics.field1874 = var17;
    }
}
