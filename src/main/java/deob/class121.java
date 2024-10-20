package deob;

@ObfuscatedName("dw")
public class class121 extends class387 {

    @ObfuscatedName("dw.c")
    public int field1472;

    @ObfuscatedName("dw.l")
    public class116[][] field1471 = (class116[][]) null;

    @ObfuscatedName("dw.s")
    public class116[][] field1473 = (class116[][]) null;

    @ObfuscatedName("dw.e")
    public int field1474;

    @ObfuscatedName("dw.r")
    public int field1475;

    @ObfuscatedName("dw.o")
    public class196 field1479;

    @ObfuscatedName("dw.i")
    public int field1477 = 0;

    @ObfuscatedName("dw.w")
    public boolean field1476;

    public class121(class307 arg0, class307 arg1, int arg2, boolean arg3) {
        this.field1472 = arg2;
        byte[] var5 = arg0.method5066(this.field1472 >> 16 & 0xFFFF, this.field1472 & 0xFFFF);
        class421 var6 = new class421(var5);
        int var7 = var6.method6686();
        int var8 = var6.method6666();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5111(0, var8);
        } else {
            var9 = arg1.method5111(var8, 0);
        }
        this.field1479 = new class196(var8, var9);
        this.method2527(var6, var7);
    }

    @ObfuscatedName("dw.c(Lpi;IB)V")
    public void method2527(class421 arg0, int arg1) {
        this.field1474 = arg0.method6666();
        this.field1475 = arg0.method6666();
        this.field1477 = arg0.method6686();
        int var3 = arg0.method6666();
        this.field1473 = new class116[this.field1479.method3563().method3547()][];
        this.field1471 = new class116[this.field1479.method3562()][];
        for (int var4 = 0; var4 < var3; var4++) {
            class117 var5 = class117.method2476(arg0.method6686());
            int var6 = arg0.method6804();
            int var7 = arg0.method6686();
            class118 var8 = (class118) class321.method2696(class118.method767(), var7);
            if (var8 == null) {
                var8 = class118.field1458;
            }
            class116 var11 = new class116();
            var11.method2492(arg0, arg1);
            int var12 = var5.method2512();
            class116[][] var13;
            if (class117.field1437 == var5) {
                var13 = this.field1473;
            } else {
                var13 = this.field1471;
            }
            if (var13[var6] == null) {
                var13[var6] = new class116[var12];
            }
            var13[var6][var8.method2515()] = var11;
            if (class117.field1442 == var5) {
                this.field1476 = true;
            }
        }
    }

    @ObfuscatedName("dw.l(B)I")
    public int method2528() {
        return this.field1474;
    }

    @ObfuscatedName("dw.s(I)I")
    public int method2529() {
        return this.field1475;
    }

    @ObfuscatedName("dw.e(I)I")
    public int method2533() {
        return this.field1477;
    }

    @ObfuscatedName("dw.r(I)I")
    public int method2560() {
        return this.method2529() - this.method2528();
    }

    @ObfuscatedName("dw.o(B)Z")
    public boolean method2564() {
        return this.field1476;
    }

    @ObfuscatedName("dw.i(ILdm;IIB)V")
    public void method2546(int arg0, class114 arg1, int arg2, int arg3) {
        class372 var5 = class372.method4307();
        this.method2554(var5, arg2, arg1, arg0);
        this.method2536(var5, arg2, arg1, arg0);
        this.method2547(var5, arg2, arg1, arg0);
        arg1.method2441(var5);
        var5.method6043();
    }

    @ObfuscatedName("dw.w(Lni;ILdm;IS)V")
    public void method2554(class372 arg0, int arg1, class114 arg2, int arg3) {
        float[] var5 = arg2.method2445(this.field1477);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1473[arg1] != null) {
            class116 var9 = this.field1473[arg1][0];
            class116 var10 = this.field1473[arg1][1];
            class116 var11 = this.field1473[arg1][2];
            if (var9 != null) {
                var6 = var9.method2484(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2484(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2484(arg3);
            }
        }
        class371 var12 = class371.method5146();
        var12.method6009(1.0F, 0.0F, 0.0F, var6);
        class371[] var13 = class371.field4236;
        class371 var14;
        synchronized (class371.field4236) {
            if (Statics.field4232 == 0) {
                var14 = new class371();
            } else {
                class371.field4236[--Statics.field4232].method5983();
                var14 = class371.field4236[Statics.field4232];
            }
        }
        var14.method6009(0.0F, 1.0F, 0.0F, var7);
        class371[] var17 = class371.field4236;
        class371 var18;
        synchronized (class371.field4236) {
            if (Statics.field4232 == 0) {
                var18 = new class371();
            } else {
                class371.field4236[--Statics.field4232].method5983();
                var18 = class371.field4236[Statics.field4232];
            }
        }
        var18.method6009(0.0F, 0.0F, 1.0F, var8);
        class371[] var21 = class371.field4236;
        class371 var22;
        synchronized (class371.field4236) {
            if (Statics.field4232 == 0) {
                var22 = new class371();
            } else {
                class371.field4236[--Statics.field4232].method5983();
                var22 = class371.field4236[Statics.field4232];
            }
        }
        var22.method6003(var18);
        var22.method6003(var12);
        var22.method6003(var14);
        class372 var25 = class372.method4307();
        var25.method6023(var22);
        arg0.method6022(var25);
        var12.method5982();
        var14.method5982();
        var18.method5982();
        var22.method5982();
        var25.method6043();
    }

    @ObfuscatedName("dw.v(Lni;ILdm;II)V")
    public void method2547(class372 arg0, int arg1, class114 arg2, int arg3) {
        float[] var5 = arg2.method2465(this.field1477);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1473[arg1] != null) {
            class116 var9 = this.field1473[arg1][3];
            class116 var10 = this.field1473[arg1][4];
            class116 var11 = this.field1473[arg1][5];
            if (var9 != null) {
                var6 = var9.method2484(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2484(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2484(arg3);
            }
        }
        arg0.field4242[12] = var6;
        arg0.field4242[13] = var7;
        arg0.field4242[14] = var8;
    }

    @ObfuscatedName("dw.a(Lni;ILdm;II)V")
    public void method2536(class372 arg0, int arg1, class114 arg2, int arg3) {
        float[] var5 = arg2.method2446(this.field1477);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1473[arg1] != null) {
            class116 var9 = this.field1473[arg1][6];
            class116 var10 = this.field1473[arg1][7];
            class116 var11 = this.field1473[arg1][8];
            if (var9 != null) {
                var6 = var9.method2484(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2484(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2484(arg3);
            }
        }
        class372 var12 = class372.method4307();
        var12.method6021(var6, var7, var8);
        arg0.method6022(var12);
        var12.method6043();
    }
}
