package deob;

@ObfuscatedName("dv")
public class class114 implements class134 {

    @ObfuscatedName("dv.y")
    public class119[] field1488;

    @ObfuscatedName("dv.c")
    public class208 field1491 = new class208();

    @ObfuscatedName("dv.n")
    public int field1495;

    @ObfuscatedName("dv.u")
    public int field1490 = 0;

    @ObfuscatedName("dv.i")
    public double field1487 = 1.0D;

    @ObfuscatedName("dv.r")
    public int field1492 = 128;

    @ObfuscatedName("dv.j")
    public class250 field1489;

    public class114(class250 arg0, class250 arg1, int arg2, double arg3, int arg4) {
        this.field1489 = arg1;
        this.field1495 = arg2;
        this.field1490 = this.field1495;
        this.field1487 = arg3;
        this.field1492 = arg4;
        int[] var7 = arg0.method4267(0);
        int var8 = var7.length;
        this.field1488 = new class119[arg0.method4287(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4263(0, var7[var9]));
            this.field1488[var7[var9]] = new class119(var10);
        }
    }

    @ObfuscatedName("dv.y(B)I")
    public int method2352() {
        int var1 = 0;
        int var2 = 0;
        class119[] var3 = this.field1488;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class119 var5 = var3[var4];
            if (var5 != null && var5.field1584 != null) {
                var1 += var5.field1584.length;
                int[] var6 = var5.field1584;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1489.method4288(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("dv.c(D)V")
    public void method2354(double arg0) {
        this.field1487 = arg0;
        this.method2358();
    }

    @ObfuscatedName("dv.n(II)[I")
    public int[] method2363(int arg0) {
        class119 var2 = this.field1488[arg0];
        if (var2 != null) {
            if (var2.field1579 != null) {
                this.field1491.method3774(var2);
                var2.field1591 = true;
                return var2.field1579;
            }
            boolean var3 = var2.method2460(this.field1487, this.field1492, this.field1489);
            if (var3) {
                if (this.field1490 == 0) {
                    class119 var4 = (class119) this.field1491.method3777();
                    var4.method2461();
                } else {
                    this.field1490--;
                }
                this.field1491.method3774(var2);
                var2.field1591 = true;
                return var2.field1579;
            }
        }
        return null;
    }

    @ObfuscatedName("dv.u(IB)I")
    public int method2370(int arg0) {
        return this.field1488[arg0] == null ? 0 : this.field1488[arg0].field1592;
    }

    @ObfuscatedName("dv.i(II)Z")
    public boolean method2356(int arg0) {
        return this.field1488[arg0].field1583;
    }

    @ObfuscatedName("dv.p(II)Z")
    public boolean method2357(int arg0) {
        return this.field1492 == 64;
    }

    @ObfuscatedName("dv.e(I)V")
    public void method2358() {
        for (int var1 = 0; var1 < this.field1488.length; var1++) {
            if (this.field1488[var1] != null) {
                this.field1488[var1].method2461();
            }
        }
        this.field1491 = new class208();
        this.field1490 = this.field1495;
    }

    @ObfuscatedName("dv.s(IB)V")
    public void method2359(int arg0) {
        for (int var2 = 0; var2 < this.field1488.length; var2++) {
            class119 var3 = this.field1488[var2];
            if (var3 != null && var3.field1588 != 0 && var3.field1591) {
                var3.method2459(arg0);
                var3.field1591 = false;
            }
        }
    }
}
