package deob;

@ObfuscatedName("db")
public class class125 extends class181 {

    @ObfuscatedName("db.k")
    public int field1624;

    @ObfuscatedName("db.l")
    public boolean field1625;

    @ObfuscatedName("db.b")
    public int[] field1633;

    @ObfuscatedName("db.i")
    public int[] field1627;

    @ObfuscatedName("db.c")
    public int[] field1628;

    @ObfuscatedName("db.f")
    public int[] field1620;

    @ObfuscatedName("db.m")
    public int field1630;

    @ObfuscatedName("db.u")
    public int field1631;

    @ObfuscatedName("db.x")
    public int[] field1632;

    @ObfuscatedName("db.r")
    public boolean field1634 = false;

    public class125(class301 arg0) {
        this.field1624 = arg0.method5069();
        this.field1625 = arg0.method5077() == 1;
        int var2 = arg0.method5077();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1633 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1633[var3] = arg0.method5069();
        }
        if (var2 > 1) {
            this.field1627 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1627[var4] = arg0.method5077();
            }
        }
        if (var2 > 1) {
            this.field1628 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1628[var5] = arg0.method5077();
            }
        }
        this.field1620 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1620[var6] = arg0.method5072();
        }
        this.field1630 = arg0.method5077();
        this.field1631 = arg0.method5077();
        this.field1632 = null;
    }

    @ObfuscatedName("db.q(DILhp;)Z")
    public boolean method2589(double arg0, int arg1, class234 arg2) {
        for (int var5 = 0; var5 < this.field1633.length; var5++) {
            if (arg2.method3847(this.field1633[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1632 = new int[var6];
        for (int var7 = 0; var7 < this.field1633.length; var7++) {
            int var8 = this.field1633[var7];
            class325 var9;
            if (class327.method3657(arg2, var8)) {
                class325 var10 = new class325();
                var10.field3897 = Statics.field3914;
                var10.field3895 = Statics.field3911;
                var10.field3891 = Statics.field2524[0];
                var10.field3892 = Statics.field3916[0];
                var10.field3898 = Statics.field3915[0];
                var10.field3894 = Statics.field2549[0];
                var10.field3893 = Statics.field1896;
                var10.field3896 = Statics.field3913[0];
                class327.method160();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method5610();
            byte[] var13 = var9.field3896;
            int[] var14 = var9.field3893;
            int var15 = this.field1620[var7];
            if ((var15 & 0xFF000000) == 16777216) {
            }
            if ((var15 & 0xFF000000) == 33554432) {
            }
            if ((var15 & 0xFF000000) == 50331648) {
                int var16 = var15 & 0xFF00FF;
                int var17 = var15 >> 8 & 0xFF;
                for (int var18 = 0; var18 < var14.length; var18++) {
                    int var19 = var14[var18];
                    if (var19 >> 8 == (var19 & 0xFFFF)) {
                        int var20 = var19 & 0xFF;
                        var14[var18] = var16 * var20 >> 8 & 0xFF00FF | var17 * var20 & 0xFF00;
                    }
                }
            }
            for (int var21 = 0; var21 < var14.length; var21++) {
                var14[var21] = class131.method2723(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1627[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field3898 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1632[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3898 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1632[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3898 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1632[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var22 == 1) {
            }
            if (var22 == 2) {
            }
            if (var22 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("db.w()V")
    public void method2587() {
        this.field1632 = null;
    }

    @ObfuscatedName("db.e(I)V")
    public void method2588(int arg0) {
        if (this.field1632 == null) {
            return;
        }
        if (this.field1630 == 1 || this.field1630 == 3) {
            if (Statics.field1629 == null || Statics.field1629.length < this.field1632.length) {
                Statics.field1629 = new int[this.field1632.length];
            }
            short var2;
            if (this.field1632.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1632.length;
            int var4 = arg0 * var2 * this.field1631;
            int var5 = var3 - 1;
            if (this.field1630 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1629[var6] = this.field1632[var7];
            }
            int[] var8 = this.field1632;
            this.field1632 = Statics.field1629;
            Statics.field1629 = var8;
        }
        if (this.field1630 != 2 && this.field1630 != 4) {
            return;
        }
        if (Statics.field1629 == null || Statics.field1629.length < this.field1632.length) {
            Statics.field1629 = new int[this.field1632.length];
        }
        short var9;
        if (this.field1632.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1632.length;
        int var11 = this.field1631 * arg0;
        int var12 = var9 - 1;
        if (this.field1630 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1629[var15] = this.field1632[var16];
            }
        }
        int[] var17 = this.field1632;
        this.field1632 = Statics.field1629;
        Statics.field1629 = var17;
    }
}
