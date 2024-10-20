package deob;

@ObfuscatedName("dg")
public class class114 implements class134 {

    @ObfuscatedName("dg.g")
    public class119[] field1509;

    @ObfuscatedName("dg.r")
    public class208 field1503 = new class208();

    @ObfuscatedName("dg.e")
    public int field1511;

    @ObfuscatedName("dg.q")
    public int field1504 = 0;

    @ObfuscatedName("dg.c")
    public double field1506 = 1.0D;

    @ObfuscatedName("dg.l")
    public int field1507 = 128;

    @ObfuscatedName("dg.b")
    public class250 field1508;

    public class114(class250 arg0, class250 arg1, int arg2, double arg3, int arg4) {
        this.field1508 = arg1;
        this.field1511 = arg2;
        this.field1504 = this.field1511;
        this.field1506 = arg3;
        this.field1507 = arg4;
        int[] var7 = arg0.method4446(0);
        int var8 = var7.length;
        this.field1509 = new class119[arg0.method4496(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4438(0, var7[var9]));
            this.field1509[var7[var9]] = new class119(var10);
        }
    }

    @ObfuscatedName("dg.g(I)I")
    public int method2540() {
        int var1 = 0;
        int var2 = 0;
        class119[] var3 = this.field1509;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class119 var5 = var3[var4];
            if (var5 != null && var5.field1596 != null) {
                var1 += var5.field1596.length;
                int[] var6 = var5.field1596;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1508.method4436(var8)) {
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

    @ObfuscatedName("dg.r(D)V")
    public void method2541(double arg0) {
        this.field1506 = arg0;
        this.method2561();
    }

    @ObfuscatedName("dg.e(IB)[I")
    public int[] method2542(int arg0) {
        class119 var2 = this.field1509[arg0];
        if (var2 != null) {
            if (var2.field1593 != null) {
                this.field1503.method3958(var2);
                var2.field1590 = true;
                return var2.field1593;
            }
            boolean var3 = var2.method2652(this.field1506, this.field1507, this.field1508);
            if (var3) {
                if (this.field1504 == 0) {
                    class119 var4 = (class119) this.field1503.method3961();
                    var4.method2653();
                } else {
                    this.field1504--;
                }
                this.field1503.method3958(var2);
                var2.field1590 = true;
                return var2.field1593;
            }
        }
        return null;
    }

    @ObfuscatedName("dg.q(II)I")
    public int method2548(int arg0) {
        return this.field1509[arg0] == null ? 0 : this.field1509[arg0].field1594;
    }

    @ObfuscatedName("dg.c(IB)Z")
    public boolean method2544(int arg0) {
        return this.field1509[arg0].field1603;
    }

    @ObfuscatedName("dg.i(II)Z")
    public boolean method2554(int arg0) {
        return this.field1507 == 64;
    }

    @ObfuscatedName("dg.p(I)V")
    public void method2561() {
        for (int var1 = 0; var1 < this.field1509.length; var1++) {
            if (this.field1509[var1] != null) {
                this.field1509[var1].method2653();
            }
        }
        this.field1503 = new class208();
        this.field1504 = this.field1511;
    }

    @ObfuscatedName("dg.m(IB)V")
    public void method2546(int arg0) {
        for (int var2 = 0; var2 < this.field1509.length; var2++) {
            class119 var3 = this.field1509[var2];
            if (var3 != null && var3.field1600 != 0 && var3.field1590) {
                var3.method2654(arg0);
                var3.field1590 = false;
            }
        }
    }
}
