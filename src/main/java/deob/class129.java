package deob;

@ObfuscatedName("du")
public class class129 extends class217 {

    @ObfuscatedName("du.e")
    public int field1788;

    @ObfuscatedName("du.y")
    public boolean field1784;

    @ObfuscatedName("du.k")
    public int[] field1786;

    @ObfuscatedName("du.s")
    public int[] field1791;

    @ObfuscatedName("du.p")
    public int[] field1792;

    @ObfuscatedName("du.x")
    public int[] field1793;

    @ObfuscatedName("du.m")
    public int field1798;

    @ObfuscatedName("du.h")
    public int field1795;

    @ObfuscatedName("du.t")
    public int[] field1796;

    @ObfuscatedName("du.i")
    public boolean field1797 = false;

    public class129(class195 arg0) {
        this.field1788 = arg0.method3269();
        this.field1784 = arg0.method3330() == 1;
        int var2 = arg0.method3330();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1786 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1786[var3] = arg0.method3269();
        }
        if (var2 > 1) {
            this.field1791 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1791[var4] = arg0.method3330();
            }
        }
        if (var2 > 1) {
            this.field1792 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1792[var5] = arg0.method3330();
            }
        }
        this.field1793 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1793[var6] = arg0.method3264();
        }
        this.field1798 = arg0.method3330();
        this.field1795 = arg0.method3330();
        this.field1796 = null;
    }

    @ObfuscatedName("du.d(DILjk;)Z")
    public boolean method2509(double arg0, int arg1, class262 arg2) {
        for (int var5 = 0; var5 < this.field1786.length; var5++) {
            if (arg2.method4282(this.field1786[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1796 = new int[var6];
        for (int var7 = 0; var7 < this.field1786.length; var7++) {
            class331 var8 = class333.method4519(arg2, this.field1786[var7]);
            var8.method5424();
            byte[] var9 = var8.field3971;
            int[] var10 = var8.field3972;
            int var11 = this.field1793[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class135.method2631(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1791[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3976 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1796[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3976 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1796[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3976 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1796[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("du.z()V")
    public void method2510() {
        this.field1796 = null;
    }

    @ObfuscatedName("du.n(I)V")
    public void method2511(int arg0) {
        if (this.field1796 == null) {
            return;
        }
        if (this.field1798 == 1 || this.field1798 == 3) {
            if (Statics.field1789 == null || Statics.field1789.length < this.field1796.length) {
                Statics.field1789 = new int[this.field1796.length];
            }
            short var2;
            if (this.field1796.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1796.length;
            int var4 = arg0 * var2 * this.field1795;
            int var5 = var3 - 1;
            if (this.field1798 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1789[var6] = this.field1796[var7];
            }
            int[] var8 = this.field1796;
            this.field1796 = Statics.field1789;
            Statics.field1789 = var8;
        }
        if (this.field1798 != 2 && this.field1798 != 4) {
            return;
        }
        if (Statics.field1789 == null || Statics.field1789.length < this.field1796.length) {
            Statics.field1789 = new int[this.field1796.length];
        }
        short var9;
        if (this.field1796.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1796.length;
        int var11 = this.field1795 * arg0;
        int var12 = var9 - 1;
        if (this.field1798 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1789[var15] = this.field1796[var16];
            }
        }
        int[] var17 = this.field1796;
        this.field1796 = Statics.field1789;
        Statics.field1789 = var17;
    }
}
