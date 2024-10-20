package deob;

@ObfuscatedName("da")
public class class129 implements class149 {

    @ObfuscatedName("da.n")
    public class134[] field1552;

    @ObfuscatedName("da.v")
    public class273 field1547 = new class273();

    @ObfuscatedName("da.d")
    public int field1546;

    @ObfuscatedName("da.c")
    public int field1549 = 0;

    @ObfuscatedName("da.y")
    public double field1550 = 1.0D;

    @ObfuscatedName("da.h")
    public int field1551 = 128;

    @ObfuscatedName("da.z")
    public class245 field1548;

    public class129(class245 arg0, class245 arg1, int arg2, double arg3, int arg4) {
        this.field1548 = arg1;
        this.field1546 = arg2;
        this.field1549 = this.field1546;
        this.field1550 = arg3;
        this.field1551 = arg4;
        int[] var7 = arg0.method3994(0);
        int var8 = var7.length;
        this.field1552 = new class134[arg0.method4008(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class311 var10 = new class311(arg0.method4032(0, var7[var9]));
            this.field1552[var7[var9]] = new class134(var10);
        }
    }

    @ObfuscatedName("da.n(I)I")
    public int method2666() {
        int var1 = 0;
        int var2 = 0;
        class134[] var3 = this.field1552;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134 var5 = var3[var4];
            if (var5 != null && var5.field1641 != null) {
                var1 += var5.field1641.length;
                int[] var6 = var5.field1641;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1548.method3986(var8)) {
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

    @ObfuscatedName("da.v(D)V")
    public void method2667(double arg0) {
        this.field1550 = arg0;
        this.method2671();
    }

    @ObfuscatedName("da.d(II)[I")
    public int[] method2669(int arg0) {
        class134 var2 = this.field1552[arg0];
        if (var2 != null) {
            if (var2.field1647 != null) {
                this.field1547.method4700(var2);
                var2.field1648 = true;
                return var2.field1647;
            }
            boolean var3 = var2.method2782(this.field1550, this.field1551, this.field1548);
            if (var3) {
                if (this.field1549 == 0) {
                    class134 var4 = (class134) this.field1547.method4718();
                    var4.method2784();
                } else {
                    this.field1549--;
                }
                this.field1547.method4700(var2);
                var2.field1648 = true;
                return var2.field1647;
            }
        }
        return null;
    }

    @ObfuscatedName("da.c(IB)I")
    public int method2677(int arg0) {
        return this.field1552[arg0] == null ? 0 : this.field1552[arg0].field1636;
    }

    @ObfuscatedName("da.y(II)Z")
    public boolean method2668(int arg0) {
        return this.field1552[arg0].field1640;
    }

    @ObfuscatedName("da.h(II)Z")
    public boolean method2670(int arg0) {
        return this.field1551 == 64;
    }

    @ObfuscatedName("da.z(I)V")
    public void method2671() {
        for (int var1 = 0; var1 < this.field1552.length; var1++) {
            if (this.field1552[var1] != null) {
                this.field1552[var1].method2784();
            }
        }
        this.field1547 = new class273();
        this.field1549 = this.field1546;
    }

    @ObfuscatedName("da.e(IB)V")
    public void method2672(int arg0) {
        for (int var2 = 0; var2 < this.field1552.length; var2++) {
            class134 var3 = this.field1552[var2];
            if (var3 != null && var3.field1645 != 0 && var3.field1648) {
                var3.method2785(arg0);
                var3.field1648 = false;
            }
        }
    }
}
