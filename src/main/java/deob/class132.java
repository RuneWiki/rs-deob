package deob;

@ObfuscatedName("ex")
public class class132 extends class106 {

    @ObfuscatedName("ex.i")
    public int field1682;

    @ObfuscatedName("ex.e")
    public boolean field1683;

    @ObfuscatedName("ex.a")
    public int[] field1684;

    @ObfuscatedName("ex.g")
    public int[] field1685;

    @ObfuscatedName("ex.w")
    public int[] field1686;

    @ObfuscatedName("ex.v")
    public int[] field1687;

    @ObfuscatedName("ex.u")
    public int field1690;

    @ObfuscatedName("ex.m")
    public int field1688;

    @ObfuscatedName("ex.b")
    public int[] field1678;

    @ObfuscatedName("ex.f")
    public boolean field1691 = false;

    public class132(class135 arg0) {
        this.field1682 = arg0.method1725();
        this.field1683 = arg0.method1571() == 1;
        int var2 = arg0.method1571();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1684 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1684[var3] = arg0.method1725();
        }
        if (var2 > 1) {
            this.field1685 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1685[var4] = arg0.method1571();
            }
        }
        if (var2 > 1) {
            this.field1686 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1686[var5] = arg0.method1571();
            }
        }
        this.field1687 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1687[var6] = arg0.method1616();
        }
        this.field1690 = arg0.method1571();
        this.field1688 = arg0.method1571();
        this.field1678 = null;
    }

    @ObfuscatedName("ex.r(DILcy;)Z")
    public boolean method1545(double arg0, int arg1, class86 arg2) {
        for (int var5 = 0; var5 < this.field1684.length; var5++) {
            if (arg2.method1058(this.field1684[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1678 = new int[var6];
        for (int var7 = 0; var7 < this.field1684.length; var7++) {
            int var8 = this.field1684[var7];
            class171 var9;
            if (class39.method49(arg2, var8)) {
                class171 var10 = new class171();
                var10.field2518 = Statics.field525;
                var10.field2514 = Statics.field528;
                var10.field2516 = Statics.field527[0];
                var10.field2517 = Statics.field524[0];
                var10.field2513 = Statics.field732[0];
                var10.field2515 = Statics.field529[0];
                var10.field2519 = Statics.field530;
                var10.field2512 = Statics.field38[0];
                class39.method158();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method2739();
            byte[] var13 = var9.field2512;
            int[] var14 = var9.field2519;
            int var15 = this.field1687[var7];
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
                var14[var21] = class172.method2755(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1685[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field2513 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1678[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field2513 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1678[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field2513 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1678[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("ex.l()V")
    public void method1546() {
        this.field1678 = null;
    }

    @ObfuscatedName("ex.i(I)V")
    public void method1547(int arg0) {
        if (this.field1678 == null) {
            return;
        }
        if (this.field1690 == 1 || this.field1690 == 3) {
            if (Statics.field1692 == null || Statics.field1692.length < this.field1678.length) {
                Statics.field1692 = new int[this.field1678.length];
            }
            short var2;
            if (this.field1678.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1678.length;
            int var4 = arg0 * var2 * this.field1688;
            int var5 = var3 - 1;
            if (this.field1690 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1692[var6] = this.field1678[var7];
            }
            int[] var8 = this.field1678;
            this.field1678 = Statics.field1692;
            Statics.field1692 = var8;
        }
        if (this.field1690 != 2 && this.field1690 != 4) {
            return;
        }
        if (Statics.field1692 == null || Statics.field1692.length < this.field1678.length) {
            Statics.field1692 = new int[this.field1678.length];
        }
        short var9;
        if (this.field1678.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1678.length;
        int var11 = this.field1688 * arg0;
        int var12 = var9 - 1;
        if (this.field1690 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1692[var15] = this.field1678[var16];
            }
        }
        int[] var17 = this.field1678;
        this.field1678 = Statics.field1692;
        Statics.field1692 = var17;
    }
}
