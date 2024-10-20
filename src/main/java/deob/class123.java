package deob;

@ObfuscatedName("da")
public class class123 extends class405 {

    @ObfuscatedName("da.c")
    public int field1522;

    @ObfuscatedName("da.v")
    public class118[][] field1519 = (class118[][]) null;

    @ObfuscatedName("da.q")
    public class118[][] field1520 = (class118[][]) null;

    @ObfuscatedName("da.f")
    public int field1521;

    @ObfuscatedName("da.j")
    public int field1525;

    @ObfuscatedName("da.e")
    public class203 field1524;

    @ObfuscatedName("da.g")
    public int field1523 = 0;

    @ObfuscatedName("da.w")
    public boolean field1526;

    @ObfuscatedName("bw.c(Llh;Llh;IZI)Lda;")
    public static class123 method1871(class315 arg0, class315 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method5307(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method5307(0, var7);
        } else {
            var8 = arg1.method5307(var7, 0);
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

    public class123(class315 arg0, class315 arg1, int arg2, boolean arg3) {
        this.field1522 = arg2;
        byte[] var5 = arg0.method5305(this.field1522 >> 16 & 0xFFFF, this.field1522 & 0xFFFF);
        class443 var6 = new class443(var5);
        int var7 = var6.method7047();
        int var8 = var6.method7049();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5307(0, var8);
        } else {
            var9 = arg1.method5307(var8, 0);
        }
        this.field1524 = new class203(var8, var9);
        this.method2628(var6, var7);
    }

    @ObfuscatedName("da.v(Lqt;IB)V")
    public void method2628(class443 arg0, int arg1) {
        this.field1521 = arg0.method7049();
        this.field1525 = arg0.method7049();
        this.field1523 = arg0.method7047();
        int var3 = arg0.method7049();
        this.field1520 = new class118[this.field1524.method3819().method3799()][];
        this.field1519 = new class118[this.field1524.method3817()][];
        for (int var4 = 0; var4 < var3; var4++) {
            class119 var5 = class119.method2019(arg0.method7047());
            int var6 = arg0.method7213();
            class120 var7 = class120.method249(arg0.method7047());
            class118 var8 = new class118();
            var8.method2574(arg0, arg1);
            int var9 = var5.method2606();
            class118[][] var10;
            if (class119.field1478 == var5) {
                var10 = this.field1520;
            } else {
                var10 = this.field1519;
            }
            if (var10[var6] == null) {
                var10[var6] = new class118[var9];
            }
            var10[var6][var7.method2616()] = var8;
            if (class119.field1481 == var5) {
                this.field1526 = true;
            }
        }
    }

    @ObfuscatedName("da.q(B)I")
    public int method2652() {
        return this.field1521;
    }

    @ObfuscatedName("da.f(I)I")
    public int method2631() {
        return this.field1525;
    }

    @ObfuscatedName("da.j(B)I")
    public int method2632() {
        return this.field1523;
    }

    @ObfuscatedName("da.e(I)I")
    public int method2633() {
        return this.method2631() - this.method2652();
    }

    @ObfuscatedName("da.g(I)Z")
    public boolean method2644() {
        return this.field1526;
    }

    @ObfuscatedName("da.w(ILdc;III)V")
    public void method2656(int arg0, class116 arg1, int arg2, int arg3) {
        class388 var5 = class388.method1795();
        this.method2636(var5, arg2, arg1, arg0);
        this.method2638(var5, arg2, arg1, arg0);
        this.method2645(var5, arg2, arg1, arg0);
        arg1.method2531(var5);
        var5.method6340();
    }

    @ObfuscatedName("da.y(Lny;ILdc;II)V")
    public void method2636(class388 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2535(this.field1523);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1520[arg1] != null) {
            class118 var9 = this.field1520[arg1][0];
            class118 var10 = this.field1520[arg1][1];
            class118 var11 = this.field1520[arg1][2];
            if (var9 != null) {
                var6 = var9.method2573(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2573(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2573(arg3);
            }
        }
        class387[] var12 = class387.field4390;
        class387 var13;
        synchronized (class387.field4390) {
            if (class387.field4386 == 0) {
                var13 = new class387();
            } else {
                class387.field4390[--class387.field4386].method6323();
                var13 = class387.field4390[class387.field4386];
            }
        }
        var13.method6317(1.0F, 0.0F, 0.0F, var6);
        class387[] var16 = class387.field4390;
        class387 var17;
        synchronized (class387.field4390) {
            if (class387.field4386 == 0) {
                var17 = new class387();
            } else {
                class387.field4390[--class387.field4386].method6323();
                var17 = class387.field4390[class387.field4386];
            }
        }
        var17.method6317(0.0F, 1.0F, 0.0F, var7);
        class387[] var20 = class387.field4390;
        class387 var21;
        synchronized (class387.field4390) {
            if (class387.field4386 == 0) {
                var21 = new class387();
            } else {
                class387.field4390[--class387.field4386].method6323();
                var21 = class387.field4390[class387.field4386];
            }
        }
        var21.method6317(0.0F, 0.0F, 1.0F, var8);
        class387[] var24 = class387.field4390;
        class387 var25;
        synchronized (class387.field4390) {
            if (class387.field4386 == 0) {
                var25 = new class387();
            } else {
                class387.field4390[--class387.field4386].method6323();
                var25 = class387.field4390[class387.field4386];
            }
        }
        var25.method6310(var21);
        var25.method6310(var13);
        var25.method6310(var17);
        class388 var28 = class388.method1795();
        var28.method6339(var25);
        arg0.method6334(var28);
        var13.method6308();
        var17.method6308();
        var21.method6308();
        var25.method6308();
        var28.method6340();
    }

    @ObfuscatedName("da.i(Lny;ILdc;II)V")
    public void method2645(class388 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2536(this.field1523);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1520[arg1] != null) {
            class118 var9 = this.field1520[arg1][3];
            class118 var10 = this.field1520[arg1][4];
            class118 var11 = this.field1520[arg1][5];
            if (var9 != null) {
                var6 = var9.method2573(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2573(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2573(arg3);
            }
        }
        arg0.field4395[12] = var6;
        arg0.field4395[13] = var7;
        arg0.field4395[14] = var8;
    }

    @ObfuscatedName("da.s(Lny;ILdc;II)V")
    public void method2638(class388 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2554(this.field1523);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1520[arg1] != null) {
            class118 var9 = this.field1520[arg1][6];
            class118 var10 = this.field1520[arg1][7];
            class118 var11 = this.field1520[arg1][8];
            if (var9 != null) {
                var6 = var9.method2573(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2573(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2573(arg3);
            }
        }
        class388 var12 = class388.method1795();
        var12.method6336(var6, var7, var8);
        arg0.method6334(var12);
        var12.method6340();
    }
}
