package deob;

@ObfuscatedName("dh")
public class class119 extends class207 {

    @ObfuscatedName("dh.u")
    public int field1586;

    @ObfuscatedName("dh.i")
    public boolean field1582;

    @ObfuscatedName("dh.t")
    public int[] field1588;

    @ObfuscatedName("dh.p")
    public int[] field1594;

    @ObfuscatedName("dh.l")
    public int[] field1587;

    @ObfuscatedName("dh.b")
    public int[] field1591;

    @ObfuscatedName("dh.c")
    public int field1592;

    @ObfuscatedName("dh.d")
    public int field1589;

    @ObfuscatedName("dh.w")
    public int[] field1590;

    @ObfuscatedName("dh.a")
    public boolean field1595 = false;

    public class119(class185 arg0) {
        this.field1586 = arg0.method3276();
        this.field1582 = arg0.method3274() == 1;
        int var2 = arg0.method3274();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1588 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1588[var3] = arg0.method3276();
        }
        if (var2 > 1) {
            this.field1594 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1594[var4] = arg0.method3274();
            }
        }
        if (var2 > 1) {
            this.field1587 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1587[var5] = arg0.method3274();
            }
        }
        this.field1591 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1591[var6] = arg0.method3279();
        }
        this.field1592 = arg0.method3274();
        this.field1589 = arg0.method3274();
        this.field1590 = null;
    }

    @ObfuscatedName("dh.v(DILis;)Z")
    public boolean method2453(double arg0, int arg1, class250 arg2) {
        for (int var5 = 0; var5 < this.field1588.length; var5++) {
            if (arg2.method4279(this.field1588[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1590 = new int[var6];
        for (int var7 = 0; var7 < this.field1588.length; var7++) {
            int var8 = this.field1588[var7];
            byte[] var9 = arg2.method4349(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class323.method2993(var9);
                var10 = true;
            }
            class321 var11;
            if (var10) {
                var11 = class323.method3177();
            } else {
                var11 = null;
            }
            var11.method5482();
            byte[] var13 = var11.field3821;
            int[] var14 = var11.field3816;
            int var15 = this.field1591[var7];
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
                var14[var21] = class125.method2584(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1594[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field3817 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1590[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field3817 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1590[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3817 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1590[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("dh.s()V")
    public void method2463() {
        this.field1590 = null;
    }

    @ObfuscatedName("dh.o(I)V")
    public void method2455(int arg0) {
        if (this.field1590 == null) {
            return;
        }
        if (this.field1592 == 1 || this.field1592 == 3) {
            if (Statics.field1596 == null || Statics.field1596.length < this.field1590.length) {
                Statics.field1596 = new int[this.field1590.length];
            }
            short var2;
            if (this.field1590.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1590.length;
            int var4 = arg0 * var2 * this.field1589;
            int var5 = var3 - 1;
            if (this.field1592 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1596[var6] = this.field1590[var7];
            }
            int[] var8 = this.field1590;
            this.field1590 = Statics.field1596;
            Statics.field1596 = var8;
        }
        if (this.field1592 != 2 && this.field1592 != 4) {
            return;
        }
        if (Statics.field1596 == null || Statics.field1596.length < this.field1590.length) {
            Statics.field1596 = new int[this.field1590.length];
        }
        short var9;
        if (this.field1590.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1590.length;
        int var11 = this.field1589 * arg0;
        int var12 = var9 - 1;
        if (this.field1592 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1596[var15] = this.field1590[var16];
            }
        }
        int[] var17 = this.field1590;
        this.field1590 = Statics.field1596;
        Statics.field1596 = var17;
    }
}
