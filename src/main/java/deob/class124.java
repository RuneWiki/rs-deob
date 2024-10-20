package deob;

@ObfuscatedName("dy")
public class class124 extends class407 {

    @ObfuscatedName("dy.c")
    public int field1519;

    @ObfuscatedName("dy.p")
    public class119[][] field1515 = (class119[][]) null;

    @ObfuscatedName("dy.f")
    public class119[][] field1516 = (class119[][]) null;

    @ObfuscatedName("dy.n")
    public class204 field1517;

    @ObfuscatedName("dy.k")
    public int field1518 = 0;

    @ObfuscatedName("dy.w")
    public boolean field1522;

    @ObfuscatedName("cx.c(Llv;Llv;IZI)Ldy;")
    public static class124 method2426(class317 arg0, class317 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method5421(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method5421(0, var7);
        } else {
            var8 = arg1.method5421(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        try {
            return new class124(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class124(class317 arg0, class317 arg1, int arg2, boolean arg3) {
        this.field1519 = arg2;
        byte[] var5 = arg0.method5499(this.field1519 >> 16 & 0xFFFF, this.field1519 & 0xFFFF);
        class445 var6 = new class445(var5);
        int var7 = var6.method7196();
        int var8 = var6.method7198();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5421(0, var8);
        } else {
            var9 = arg1.method5421(var8, 0);
        }
        this.field1517 = new class204(var8, var9);
        this.method2796(var6, var7);
    }

    @ObfuscatedName("dy.p(Lqq;II)V")
    public void method2796(class445 arg0, int arg1) {
        arg0.method7198();
        arg0.method7198();
        this.field1518 = arg0.method7196();
        int var3 = arg0.method7198();
        this.field1516 = new class119[this.field1517.method3877().method3859()][];
        this.field1515 = new class119[this.field1517.method3876()][];
        for (int var4 = 0; var4 < var3; var4++) {
            class120 var5 = class120.method4737(arg0.method7196());
            int var6 = arg0.method7210();
            class121 var7 = class121.method6481(arg0.method7196());
            class119 var8 = new class119();
            var8.method2741(arg0, arg1);
            int var9 = var5.method2773();
            class119[][] var10;
            if (class120.field1471 == var5) {
                var10 = this.field1516;
            } else {
                var10 = this.field1515;
            }
            if (var10[var6] == null) {
                var10[var6] = new class119[var9];
            }
            var10[var6][var7.method2783()] = var8;
            if (class120.field1472 == var5) {
                this.field1522 = true;
            }
        }
    }

    @ObfuscatedName("dy.f(B)I")
    public int method2812() {
        return this.field1518;
    }

    @ObfuscatedName("dy.n(B)Z")
    public boolean method2798() {
        return this.field1522;
    }

    @ObfuscatedName("dy.k(ILdj;IIB)V")
    public void method2797(int arg0, class117 arg1, int arg2, int arg3) {
        class390 var5 = class390.method3607();
        this.method2808(var5, arg2, arg1, arg0);
        this.method2802(var5, arg2, arg1, arg0);
        this.method2801(var5, arg2, arg1, arg0);
        arg1.method2700(var5);
        var5.method6532();
    }

    @ObfuscatedName("dy.w(Lnw;ILdj;IB)V")
    public void method2808(class390 arg0, int arg1, class117 arg2, int arg3) {
        float[] var5 = arg2.method2704(this.field1518);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1516[arg1] != null) {
            class119 var9 = this.field1516[arg1][0];
            class119 var10 = this.field1516[arg1][1];
            class119 var11 = this.field1516[arg1][2];
            if (var9 != null) {
                var6 = var9.method2743(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2743(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2743(arg3);
            }
        }
        class389 var12 = class389.method2165();
        var12.method6473(1.0F, 0.0F, 0.0F, var6);
        class389 var13 = class389.method2165();
        var13.method6473(0.0F, 1.0F, 0.0F, var7);
        class389 var14 = class389.method2165();
        var14.method6473(0.0F, 0.0F, 1.0F, var8);
        class389 var15 = class389.method2165();
        var15.method6492(var14);
        var15.method6492(var12);
        var15.method6492(var13);
        class390 var16 = class390.method3607();
        var16.method6508(var15);
        arg0.method6507(var16);
        var12.method6472();
        var13.method6472();
        var14.method6472();
        var15.method6472();
        var16.method6532();
    }

    @ObfuscatedName("dy.s(Lnw;ILdj;II)V")
    public void method2801(class390 arg0, int arg1, class117 arg2, int arg3) {
        float[] var5 = arg2.method2725(this.field1518);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1516[arg1] != null) {
            class119 var9 = this.field1516[arg1][3];
            class119 var10 = this.field1516[arg1][4];
            class119 var11 = this.field1516[arg1][5];
            if (var9 != null) {
                var6 = var9.method2743(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2743(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2743(arg3);
            }
        }
        arg0.field4441[12] = var6;
        arg0.field4441[13] = var7;
        arg0.field4441[14] = var8;
    }

    @ObfuscatedName("dy.q(Lnw;ILdj;IB)V")
    public void method2802(class390 arg0, int arg1, class117 arg2, int arg3) {
        float[] var5 = arg2.method2730(this.field1518);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1516[arg1] != null) {
            class119 var9 = this.field1516[arg1][6];
            class119 var10 = this.field1516[arg1][7];
            class119 var11 = this.field1516[arg1][8];
            if (var9 != null) {
                var6 = var9.method2743(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2743(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2743(arg3);
            }
        }
        class390 var12 = class390.method3607();
        var12.method6505(var6, var7, var8);
        arg0.method6507(var12);
        var12.method6532();
    }
}
