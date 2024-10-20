package deob;

@ObfuscatedName("dc")
public class class129 extends class217 {

    @ObfuscatedName("dc.k")
    public int field1795;

    @ObfuscatedName("dc.x")
    public boolean field1794;

    @ObfuscatedName("dc.z")
    public int[] field1797;

    @ObfuscatedName("dc.p")
    public int[] field1798;

    @ObfuscatedName("dc.w")
    public int[] field1801;

    @ObfuscatedName("dc.r")
    public int[] field1800;

    @ObfuscatedName("dc.d")
    public int field1791;

    @ObfuscatedName("dc.a")
    public int field1802;

    @ObfuscatedName("dc.e")
    public int[] field1803;

    @ObfuscatedName("dc.f")
    public boolean field1804 = false;

    public class129(class195 arg0) {
        this.field1795 = arg0.method3218();
        this.field1794 = arg0.method3429() == 1;
        int var2 = arg0.method3429();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1797 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1797[var3] = arg0.method3218();
        }
        if (var2 > 1) {
            this.field1798 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1798[var4] = arg0.method3429();
            }
        }
        if (var2 > 1) {
            this.field1801 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1801[var5] = arg0.method3429();
            }
        }
        this.field1800 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1800[var6] = arg0.method3230();
        }
        this.field1791 = arg0.method3429();
        this.field1802 = arg0.method3429();
        this.field1803 = null;
    }

    @ObfuscatedName("dc.c(DILjm;)Z")
    public boolean method2459(double arg0, int arg1, class262 arg2) {
        for (int var5 = 0; var5 < this.field1797.length; var5++) {
            if (arg2.method4199(this.field1797[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1803 = new int[var6];
        for (int var7 = 0; var7 < this.field1797.length; var7++) {
            int var8 = this.field1797[var7];
            class331 var9;
            if (class333.method1791(arg2, var8)) {
                var9 = class333.method983();
            } else {
                var9 = null;
            }
            var9.method5416();
            byte[] var11 = var9.field3974;
            int[] var12 = var9.field3975;
            int var13 = this.field1800[var7];
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
                var12[var19] = class135.method2587(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1798[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field3972 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1803[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3972 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1803[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3972 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1803[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("dc.i()V")
    public void method2458() {
        this.field1803 = null;
    }

    @ObfuscatedName("dc.o(I)V")
    public void method2456(int arg0) {
        if (this.field1803 == null) {
            return;
        }
        if (this.field1791 == 1 || this.field1791 == 3) {
            if (Statics.field1805 == null || Statics.field1805.length < this.field1803.length) {
                Statics.field1805 = new int[this.field1803.length];
            }
            short var2;
            if (this.field1803.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1803.length;
            int var4 = arg0 * var2 * this.field1802;
            int var5 = var3 - 1;
            if (this.field1791 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1805[var6] = this.field1803[var7];
            }
            int[] var8 = this.field1803;
            this.field1803 = Statics.field1805;
            Statics.field1805 = var8;
        }
        if (this.field1791 != 2 && this.field1791 != 4) {
            return;
        }
        if (Statics.field1805 == null || Statics.field1805.length < this.field1803.length) {
            Statics.field1805 = new int[this.field1803.length];
        }
        short var9;
        if (this.field1803.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1803.length;
        int var11 = this.field1802 * arg0;
        int var12 = var9 - 1;
        if (this.field1791 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1805[var15] = this.field1803[var16];
            }
        }
        int[] var17 = this.field1803;
        this.field1803 = Statics.field1805;
        Statics.field1805 = var17;
    }
}
