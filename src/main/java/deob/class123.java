package deob;

@ObfuscatedName("dk")
public class class123 extends class406 {

    @ObfuscatedName("dk.s")
    public int field1501;

    @ObfuscatedName("dk.h")
    public class118[][] field1500 = (class118[][]) null;

    @ObfuscatedName("dk.w")
    public class118[][] field1502 = (class118[][]) null;

    @ObfuscatedName("dk.v")
    public class203 field1499;

    @ObfuscatedName("dk.c")
    public int field1503 = 0;

    @ObfuscatedName("dk.q")
    public boolean field1504;

    @ObfuscatedName("jd.s(Lls;Lls;IZI)Ldk;")
    public static class123 method4655(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method5187(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method5187(0, var7);
        } else {
            var8 = arg1.method5187(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        try {
            return new class123(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class123(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        this.field1501 = arg2;
        byte[] var5 = arg0.method5179(this.field1501 >> 16 & 0xFFFF, this.field1501 & 0xFFFF);
        class444 var6 = new class444(var5);
        int var7 = var6.method6929();
        int var8 = var6.method7120();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5187(0, var8);
        } else {
            var9 = arg1.method5187(var8, 0);
        }
        this.field1499 = new class203(var8, var9);
        this.method2594(var6, var7);
    }

    @ObfuscatedName("dk.h(Lqr;II)V")
    public void method2594(class444 arg0, int arg1) {
        arg0.method7120();
        arg0.method7120();
        this.field1503 = arg0.method6929();
        int var3 = arg0.method7120();
        this.field1502 = new class118[this.field1499.method3702().method3693()][];
        this.field1500 = new class118[this.field1499.method3700()][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6929();
            class119[] var6 = new class119[] { class119.field1465, class119.field1458, class119.field1459, class119.field1460, class119.field1466, class119.field1462 };
            class119 var7 = (class119) class330.method525(var6, var5);
            if (var7 == null) {
                var7 = class119.field1465;
            }
            int var10 = arg0.method7044();
            int var11 = arg0.method6929();
            class120 var12 = (class120) class330.method525(class120.method2232(), var11);
            if (var12 == null) {
                var12 = class120.field1489;
            }
            class118 var15 = new class118();
            var15.method2547(arg0, arg1);
            int var16 = var7.method2576();
            class118[][] var17;
            if (class119.field1458 == var7) {
                var17 = this.field1502;
            } else {
                var17 = this.field1500;
            }
            if (var17[var10] == null) {
                var17[var10] = new class118[var16];
            }
            var17[var10][var12.method2582()] = var15;
            if (class119.field1466 == var7) {
                this.field1504 = true;
            }
        }
    }

    @ObfuscatedName("dk.w(I)I")
    public int method2609() {
        return this.field1503;
    }

    @ObfuscatedName("dk.v(I)Z")
    public boolean method2599() {
        return this.field1504;
    }

    @ObfuscatedName("dk.c(ILdp;III)V")
    public void method2596(int arg0, class116 arg1, int arg2, int arg3) {
        class389 var5 = class389.method5400();
        this.method2597(var5, arg2, arg1, arg0);
        this.method2593(var5, arg2, arg1, arg0);
        this.method2598(var5, arg2, arg1, arg0);
        arg1.method2529(var5);
        var5.method6286();
    }

    @ObfuscatedName("dk.q(Lny;ILdp;IB)V")
    public void method2597(class389 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2513(this.field1503);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1502[arg1] != null) {
            class118 var9 = this.field1502[arg1][0];
            class118 var10 = this.field1502[arg1][1];
            class118 var11 = this.field1502[arg1][2];
            if (var9 != null) {
                var6 = var9.method2567(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2567(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2567(arg3);
            }
        }
        class388 var12 = class388.method4900();
        var12.method6223(1.0F, 0.0F, 0.0F, var6);
        class388 var13 = class388.method4900();
        var13.method6223(0.0F, 1.0F, 0.0F, var7);
        class388 var14 = class388.method4900();
        var14.method6223(0.0F, 0.0F, 1.0F, var8);
        class388 var15 = class388.method4900();
        var15.method6225(var14);
        var15.method6225(var12);
        var15.method6225(var13);
        class389 var16 = class389.method5400();
        var16.method6258(var15);
        arg0.method6294(var16);
        var12.method6221();
        var13.method6221();
        var14.method6221();
        var15.method6221();
        var16.method6286();
    }

    @ObfuscatedName("dk.i(Lny;ILdp;II)V")
    public void method2598(class389 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2514(this.field1503);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1502[arg1] != null) {
            class118 var9 = this.field1502[arg1][3];
            class118 var10 = this.field1502[arg1][4];
            class118 var11 = this.field1502[arg1][5];
            if (var9 != null) {
                var6 = var9.method2567(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2567(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2567(arg3);
            }
        }
        arg0.field4399[12] = var6;
        arg0.field4399[13] = var7;
        arg0.field4399[14] = var8;
    }

    @ObfuscatedName("dk.k(Lny;ILdp;II)V")
    public void method2593(class389 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2512(this.field1503);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1502[arg1] != null) {
            class118 var9 = this.field1502[arg1][6];
            class118 var10 = this.field1502[arg1][7];
            class118 var11 = this.field1502[arg1][8];
            if (var9 != null) {
                var6 = var9.method2567(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2567(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2567(arg3);
            }
        }
        class389 var12 = class389.method5400();
        var12.method6268(var6, var7, var8);
        arg0.method6294(var12);
        var12.method6286();
    }
}
