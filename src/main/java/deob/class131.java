package deob;

@ObfuscatedName("ew")
public class class131 extends class428 {

    @ObfuscatedName("ew.h")
    public int field1608;

    @ObfuscatedName("ew.e")
    public class126[][] field1605 = (class126[][]) null;

    @ObfuscatedName("ew.v")
    public class126[][] field1606 = (class126[][]) null;

    @ObfuscatedName("ew.x")
    public class215 field1604;

    @ObfuscatedName("ew.m")
    public int field1610 = 0;

    @ObfuscatedName("ew.q")
    public boolean field1607;

    public class131(class333 arg0, class333 arg1, int arg2, boolean arg3) {
        this.field1608 = arg2;
        byte[] var5 = arg0.method5909(this.field1608 >> 16 & 0xFFFF, this.field1608 & 0xFFFF);
        class467 var6 = new class467(var5);
        int var7 = var6.method7792();
        int var8 = var6.method7794();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5852(0, var8);
        } else {
            var9 = arg1.method5852(var8, 0);
        }
        this.field1604 = new class215(var8, var9);
        this.method2849(var6, var7);
    }

    @ObfuscatedName("ew.h(Lqy;IS)V")
    public void method2849(class467 arg0, int arg1) {
        arg0.method7794();
        arg0.method7794();
        this.field1610 = arg0.method7792();
        int var3 = arg0.method7794();
        this.field1606 = new class126[this.field1604.method4035().method4013()][];
        this.field1605 = new class126[this.field1604.method4039()][];
        for (int var4 = 0; var4 < var3; var4++) {
            class127 var5 = class127.method6038(arg0.method7792());
            int var6 = arg0.method7805();
            class128 var7 = class128.method481(arg0.method7792());
            class126 var8 = new class126();
            var8.method2796(arg0, arg1);
            int var9 = var5.method2826();
            class126[][] var10;
            if (class127.field1564 == var5) {
                var10 = this.field1606;
            } else {
                var10 = this.field1605;
            }
            if (var10[var6] == null) {
                var10[var6] = new class126[var9];
            }
            var10[var6][var7.method2837()] = var8;
            if (class127.field1567 == var5) {
                this.field1607 = true;
            }
        }
    }

    @ObfuscatedName("ew.e(I)I")
    public int method2866() {
        return this.field1610;
    }

    @ObfuscatedName("ew.v(B)Z")
    public boolean method2850() {
        return this.field1607;
    }

    @ObfuscatedName("ew.x(ILdt;III)V")
    public void method2848(int arg0, class124 arg1, int arg2, int arg3) {
        class411 var5 = class411.method5785();
        this.method2852(var5, arg2, arg1, arg0);
        this.method2854(var5, arg2, arg1, arg0);
        this.method2853(var5, arg2, arg1, arg0);
        arg1.method2764(var5);
        var5.method7093();
    }

    @ObfuscatedName("ew.m(Loj;ILdt;II)V")
    public void method2852(class411 arg0, int arg1, class124 arg2, int arg3) {
        float[] var5 = arg2.method2766(this.field1610);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1606[arg1] != null) {
            class126 var9 = this.field1606[arg1][0];
            class126 var10 = this.field1606[arg1][1];
            class126 var11 = this.field1606[arg1][2];
            if (var9 != null) {
                var6 = var9.method2819(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2819(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2819(arg3);
            }
        }
        class410 var12 = class410.method3402();
        var12.method7056(1.0F, 0.0F, 0.0F, var6);
        class410 var13 = class410.method3402();
        var13.method7056(0.0F, 1.0F, 0.0F, var7);
        class410 var14 = class410.method3402();
        var14.method7056(0.0F, 0.0F, 1.0F, var8);
        class410 var15 = class410.method3402();
        var15.method7058(var14);
        var15.method7058(var12);
        var15.method7058(var13);
        class411 var16 = class411.method5785();
        var16.method7087(var15);
        arg0.method7086(var16);
        var12.method7073();
        var13.method7073();
        var14.method7073();
        var15.method7073();
        var16.method7093();
    }

    @ObfuscatedName("ew.q(Loj;ILdt;II)V")
    public void method2853(class411 arg0, int arg1, class124 arg2, int arg3) {
        float[] var5 = arg2.method2767(this.field1610);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1606[arg1] != null) {
            class126 var9 = this.field1606[arg1][3];
            class126 var10 = this.field1606[arg1][4];
            class126 var11 = this.field1606[arg1][5];
            if (var9 != null) {
                var6 = var9.method2819(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2819(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2819(arg3);
            }
        }
        arg0.field4613[12] = var6;
        arg0.field4613[13] = var7;
        arg0.field4613[14] = var8;
    }

    @ObfuscatedName("ew.f(Loj;ILdt;II)V")
    public void method2854(class411 arg0, int arg1, class124 arg2, int arg3) {
        float[] var5 = arg2.method2768(this.field1610);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1606[arg1] != null) {
            class126 var9 = this.field1606[arg1][6];
            class126 var10 = this.field1606[arg1][7];
            class126 var11 = this.field1606[arg1][8];
            if (var9 != null) {
                var6 = var9.method2819(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2819(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2819(arg3);
            }
        }
        class411 var12 = class411.method5785();
        var12.method7084(var6, var7, var8);
        arg0.method7086(var12);
        var12.method7093();
    }
}
