package deob;

@ObfuscatedName("dr")
public class class114 implements class134 {

    @ObfuscatedName("dr.f")
    public class119[] field1506;

    @ObfuscatedName("dr.l")
    public class208 field1500 = new class208();

    @ObfuscatedName("dr.w")
    public int field1505;

    @ObfuscatedName("dr.s")
    public int field1502 = 0;

    @ObfuscatedName("dr.e")
    public double field1503 = 1.0D;

    @ObfuscatedName("dr.a")
    public int field1501 = 128;

    @ObfuscatedName("dr.c")
    public class250 field1499;

    public class114(class250 arg0, class250 arg1, int arg2, double arg3, int arg4) {
        this.field1499 = arg1;
        this.field1505 = arg2;
        this.field1502 = this.field1505;
        this.field1503 = arg3;
        this.field1501 = arg4;
        int[] var7 = arg0.method4366(0);
        int var8 = var7.length;
        this.field1506 = new class119[arg0.method4326(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4289(0, var7[var9]));
            this.field1506[var7[var9]] = new class119(var10);
        }
    }

    @ObfuscatedName("dr.f(S)I")
    public int method2409() {
        int var1 = 0;
        int var2 = 0;
        class119[] var3 = this.field1506;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class119 var5 = var3[var4];
            if (var5 != null && var5.field1592 != null) {
                var1 += var5.field1592.length;
                int[] var6 = var5.field1592;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1499.method4292(var8)) {
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

    @ObfuscatedName("dr.l(D)V")
    public void method2423(double arg0) {
        this.field1503 = arg0;
        this.method2414();
    }

    @ObfuscatedName("dr.w(II)[I")
    public int[] method2410(int arg0) {
        class119 var2 = this.field1506[arg0];
        if (var2 != null) {
            if (var2.field1597 != null) {
                this.field1500.method3824(var2);
                var2.field1599 = true;
                return var2.field1597;
            }
            boolean var3 = var2.method2518(this.field1503, this.field1501, this.field1499);
            if (var3) {
                if (this.field1502 == 0) {
                    class119 var4 = (class119) this.field1500.method3826();
                    var4.method2526();
                } else {
                    this.field1502--;
                }
                this.field1500.method3824(var2);
                var2.field1599 = true;
                return var2.field1597;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.s(II)I")
    public int method2411(int arg0) {
        return this.field1506[arg0] == null ? 0 : this.field1506[arg0].field1590;
    }

    @ObfuscatedName("dr.e(II)Z")
    public boolean method2412(int arg0) {
        return this.field1506[arg0].field1595;
    }

    @ObfuscatedName("dr.c(II)Z")
    public boolean method2413(int arg0) {
        return this.field1501 == 64;
    }

    @ObfuscatedName("dr.p(I)V")
    public void method2414() {
        for (int var1 = 0; var1 < this.field1506.length; var1++) {
            if (this.field1506[var1] != null) {
                this.field1506[var1].method2526();
            }
        }
        this.field1500 = new class208();
        this.field1502 = this.field1505;
    }

    @ObfuscatedName("dr.r(II)V")
    public void method2415(int arg0) {
        for (int var2 = 0; var2 < this.field1506.length; var2++) {
            class119 var3 = this.field1506[var2];
            if (var3 != null && var3.field1596 != 0 && var3.field1599) {
                var3.method2520(arg0);
                var3.field1599 = false;
            }
        }
    }
}
