package deob;

@ObfuscatedName("do")
public class class123 extends class404 {

    @ObfuscatedName("do.v")
    public int field1471;

    @ObfuscatedName("do.c")
    public class118[][] field1475 = (class118[][]) null;

    @ObfuscatedName("do.i")
    public class118[][] field1472 = (class118[][]) null;

    @ObfuscatedName("do.f")
    public int field1470;

    @ObfuscatedName("do.b")
    public int field1474;

    @ObfuscatedName("do.n")
    public class233 field1473;

    @ObfuscatedName("do.s")
    public int field1476 = 0;

    @ObfuscatedName("do.l")
    public boolean field1477;

    public class123(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        this.field1471 = arg2;
        byte[] var5 = arg0.method5296(this.field1471 >> 16 & 0xFFFF, this.field1471 & 0xFFFF);
        class438 var6 = new class438(var5);
        int var7 = var6.method6971();
        int var8 = var6.method7148();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5302(0, var8);
        } else {
            var9 = arg1.method5302(var8, 0);
        }
        this.field1473 = new class233(var8, var9);
        this.method2649(var6, var7);
    }

    @ObfuscatedName("do.v(Lpi;II)V")
    public void method2649(class438 arg0, int arg1) {
        this.field1470 = arg0.method7148();
        this.field1474 = arg0.method7148();
        this.field1476 = arg0.method6971();
        int var3 = arg0.method7148();
        this.field1472 = new class118[this.field1473.method4243().method4220()][];
        this.field1475 = new class118[this.field1473.method4242()][];
        for (int var4 = 0; var4 < var3; var4++) {
            class119 var5 = class119.method6219(arg0.method6971());
            int var6 = arg0.method7024();
            int var7 = arg0.method6971();
            class120 var8 = (class120) class330.method4919(class120.method5400(), var7);
            if (var8 == null) {
                var8 = class120.field1450;
            }
            class118 var11 = new class118();
            var11.method2583(arg0, arg1);
            int var12 = var5.method2614();
            class118[][] var13;
            if (class119.field1431 == var5) {
                var13 = this.field1472;
            } else {
                var13 = this.field1475;
            }
            if (var13[var6] == null) {
                var13[var6] = new class118[var12];
            }
            var13[var6][var8.method2623()] = var11;
            if (class119.field1435 == var5) {
                this.field1477 = true;
            }
        }
    }

    @ObfuscatedName("do.c(B)I")
    public int method2633() {
        return this.field1470;
    }

    @ObfuscatedName("do.i(I)I")
    public int method2650() {
        return this.field1474;
    }

    @ObfuscatedName("do.f(S)I")
    public int method2635() {
        return this.field1476;
    }

    @ObfuscatedName("do.b(B)I")
    public int method2631() {
        return this.method2650() - this.method2633();
    }

    @ObfuscatedName("do.n(I)Z")
    public boolean method2637() {
        return this.field1477;
    }

    @ObfuscatedName("do.s(ILda;III)V")
    public void method2665(int arg0, class116 arg1, int arg2, int arg3) {
        class388[] var5 = class388.field4347;
        class388 var6;
        synchronized (class388.field4347) {
            if (Statics.field4348 == 0) {
                var6 = new class388();
            } else {
                class388.field4347[--Statics.field4348].method6350();
                var6 = class388.field4347[Statics.field4348];
            }
        }
        this.method2632(var6, arg2, arg1, arg0);
        this.method2662(var6, arg2, arg1, arg0);
        this.method2640(var6, arg2, arg1, arg0);
        arg1.method2554(var6);
        var6.method6368();
    }

    @ObfuscatedName("do.l(Lnt;ILda;II)V")
    public void method2632(class388 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2550(this.field1476);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1472[arg1] != null) {
            class118 var9 = this.field1472[arg1][0];
            class118 var10 = this.field1472[arg1][1];
            class118 var11 = this.field1472[arg1][2];
            if (var9 != null) {
                var6 = var9.method2584(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2584(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2584(arg3);
            }
        }
        class387 var12 = Statics.method2630();
        var12.method6323(1.0F, 0.0F, 0.0F, var6);
        class387 var13 = Statics.method2630();
        var13.method6323(0.0F, 1.0F, 0.0F, var7);
        class387 var14 = Statics.method2630();
        var14.method6323(0.0F, 0.0F, 1.0F, var8);
        class387 var15 = Statics.method2630();
        var15.method6325(var14);
        var15.method6325(var12);
        var15.method6325(var13);
        class388[] var16 = class388.field4347;
        class388 var17;
        synchronized (class388.field4347) {
            if (Statics.field4348 == 0) {
                var17 = new class388();
            } else {
                class388.field4347[--Statics.field4348].method6350();
                var17 = class388.field4347[Statics.field4348];
            }
        }
        var17.method6345(var15);
        arg0.method6356(var17);
        var12.method6327();
        var13.method6327();
        var14.method6327();
        var15.method6327();
        var17.method6368();
    }

    @ObfuscatedName("do.q(Lnt;ILda;IB)V")
    public void method2640(class388 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2551(this.field1476);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1472[arg1] != null) {
            class118 var9 = this.field1472[arg1][3];
            class118 var10 = this.field1472[arg1][4];
            class118 var11 = this.field1472[arg1][5];
            if (var9 != null) {
                var6 = var9.method2584(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2584(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2584(arg3);
            }
        }
        arg0.field4349[12] = var6;
        arg0.field4349[13] = var7;
        arg0.field4349[14] = var8;
    }

    @ObfuscatedName("do.o(Lnt;ILda;II)V")
    public void method2662(class388 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2552(this.field1476);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1472[arg1] != null) {
            class118 var9 = this.field1472[arg1][6];
            class118 var10 = this.field1472[arg1][7];
            class118 var11 = this.field1472[arg1][8];
            if (var9 != null) {
                var6 = var9.method2584(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2584(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2584(arg3);
            }
        }
        class388[] var12 = class388.field4347;
        class388 var13;
        synchronized (class388.field4347) {
            if (Statics.field4348 == 0) {
                var13 = new class388();
            } else {
                class388.field4347[--Statics.field4348].method6350();
                var13 = class388.field4347[Statics.field4348];
            }
        }
        var13.method6388(var6, var7, var8);
        arg0.method6356(var13);
        var13.method6368();
    }
}
