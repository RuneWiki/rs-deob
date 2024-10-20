package deob;

@ObfuscatedName("dp")
public class class119 extends class207 {

    @ObfuscatedName("dp.i")
    public int field1592;

    @ObfuscatedName("dp.r")
    public boolean field1583;

    @ObfuscatedName("dp.j")
    public int[] field1584;

    @ObfuscatedName("dp.p")
    public int[] field1585;

    @ObfuscatedName("dp.e")
    public int[] field1586;

    @ObfuscatedName("dp.s")
    public int[] field1587;

    @ObfuscatedName("dp.v")
    public int field1588;

    @ObfuscatedName("dp.k")
    public int field1581;

    @ObfuscatedName("dp.o")
    public int[] field1579;

    @ObfuscatedName("dp.q")
    public boolean field1591 = false;

    public class119(class185 arg0) {
        this.field1592 = arg0.method3280();
        this.field1583 = arg0.method3299() == 1;
        int var2 = arg0.method3299();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1584 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1584[var3] = arg0.method3280();
        }
        if (var2 > 1) {
            this.field1585 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1585[var4] = arg0.method3299();
            }
        }
        if (var2 > 1) {
            this.field1586 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1586[var5] = arg0.method3299();
            }
        }
        this.field1587 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1587[var6] = arg0.method3374();
        }
        this.field1588 = arg0.method3299();
        this.field1581 = arg0.method3299();
        this.field1579 = null;
    }

    @ObfuscatedName("dp.y(DILiu;)Z")
    public boolean method2460(double arg0, int arg1, class250 arg2) {
        for (int var5 = 0; var5 < this.field1584.length; var5++) {
            if (arg2.method4327(this.field1584[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1579 = new int[var6];
        for (int var7 = 0; var7 < this.field1584.length; var7++) {
            int var8 = this.field1584[var7];
            class323 var9;
            if (class325.method640(arg2, var8)) {
                class323 var10 = new class323();
                var10.field3844 = Statics.field3858;
                var10.field3837 = Statics.field3859;
                var10.field3841 = Statics.field3861[0];
                var10.field3839 = Statics.field3863[0];
                var10.field3838 = Statics.field2604[0];
                var10.field3840 = Statics.field3862[0];
                var10.field3843 = Statics.field3864;
                var10.field3842 = Statics.field2628[0];
                class325.method3127();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method5449();
            byte[] var13 = var9.field3842;
            int[] var14 = var9.field3843;
            int var15 = this.field1587[var7];
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
                var14[var21] = class125.method2595(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1585[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field3838 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1579[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3838 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1579[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3838 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1579[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("dp.c()V")
    public void method2461() {
        this.field1579 = null;
    }

    @ObfuscatedName("dp.n(I)V")
    public void method2459(int arg0) {
        if (this.field1579 == null) {
            return;
        }
        if (this.field1588 == 1 || this.field1588 == 3) {
            if (Statics.field1589 == null || Statics.field1589.length < this.field1579.length) {
                Statics.field1589 = new int[this.field1579.length];
            }
            short var2;
            if (this.field1579.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1579.length;
            int var4 = arg0 * var2 * this.field1581;
            int var5 = var3 - 1;
            if (this.field1588 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1589[var6] = this.field1579[var7];
            }
            int[] var8 = this.field1579;
            this.field1579 = Statics.field1589;
            Statics.field1589 = var8;
        }
        if (this.field1588 != 2 && this.field1588 != 4) {
            return;
        }
        if (Statics.field1589 == null || Statics.field1589.length < this.field1579.length) {
            Statics.field1589 = new int[this.field1579.length];
        }
        short var9;
        if (this.field1579.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1579.length;
        int var11 = this.field1581 * arg0;
        int var12 = var9 - 1;
        if (this.field1588 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1589[var15] = this.field1579[var16];
            }
        }
        int[] var17 = this.field1579;
        this.field1579 = Statics.field1589;
        Statics.field1589 = var17;
    }
}
