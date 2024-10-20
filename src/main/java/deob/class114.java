package deob;

@ObfuscatedName("dr")
public class class114 implements class134 {

    @ObfuscatedName("dr.v")
    public class119[] field1493;

    @ObfuscatedName("dr.s")
    public class208 field1497 = new class208();

    @ObfuscatedName("dr.o")
    public int field1494;

    @ObfuscatedName("dr.k")
    public int field1495 = 0;

    @ObfuscatedName("dr.u")
    public double field1496 = 1.0D;

    @ObfuscatedName("dr.i")
    public int field1492 = 128;

    @ObfuscatedName("dr.t")
    public class250 field1499;

    public class114(class250 arg0, class250 arg1, int arg2, double arg3, int arg4) {
        this.field1499 = arg1;
        this.field1494 = arg2;
        this.field1495 = this.field1494;
        this.field1496 = arg3;
        this.field1492 = arg4;
        int[] var7 = arg0.method4282(0);
        int var8 = var7.length;
        this.field1493 = new class119[arg0.method4331(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4270(0, var7[var9]));
            this.field1493[var7[var9]] = new class119(var10);
        }
    }

    @ObfuscatedName("dr.v(I)I")
    public int method2355() {
        int var1 = 0;
        int var2 = 0;
        class119[] var3 = this.field1493;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class119 var5 = var3[var4];
            if (var5 != null && var5.field1588 != null) {
                var1 += var5.field1588.length;
                int[] var6 = var5.field1588;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1499.method4273(var8)) {
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

    @ObfuscatedName("dr.s(D)V")
    public void method2356(double arg0) {
        this.field1496 = arg0;
        this.method2375();
    }

    @ObfuscatedName("dr.o(II)[I")
    public int[] method2357(int arg0) {
        class119 var2 = this.field1493[arg0];
        if (var2 != null) {
            if (var2.field1590 != null) {
                this.field1497.method3824(var2);
                var2.field1595 = true;
                return var2.field1590;
            }
            boolean var3 = var2.method2453(this.field1496, this.field1492, this.field1499);
            if (var3) {
                if (this.field1495 == 0) {
                    class119 var4 = (class119) this.field1497.method3805();
                    var4.method2463();
                } else {
                    this.field1495--;
                }
                this.field1497.method3824(var2);
                var2.field1595 = true;
                return var2.field1590;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.k(IB)I")
    public int method2358(int arg0) {
        return this.field1493[arg0] == null ? 0 : this.field1493[arg0].field1586;
    }

    @ObfuscatedName("dr.u(IB)Z")
    public boolean method2372(int arg0) {
        return this.field1493[arg0].field1582;
    }

    @ObfuscatedName("dr.i(II)Z")
    public boolean method2360(int arg0) {
        return this.field1492 == 64;
    }

    @ObfuscatedName("dr.t(I)V")
    public void method2375() {
        for (int var1 = 0; var1 < this.field1493.length; var1++) {
            if (this.field1493[var1] != null) {
                this.field1493[var1].method2463();
            }
        }
        this.field1497 = new class208();
        this.field1495 = this.field1494;
    }

    @ObfuscatedName("dr.c(II)V")
    public void method2362(int arg0) {
        for (int var2 = 0; var2 < this.field1493.length; var2++) {
            class119 var3 = this.field1493[var2];
            if (var3 != null && var3.field1592 != 0 && var3.field1595) {
                var3.method2455(arg0);
                var3.field1595 = false;
            }
        }
    }
}
