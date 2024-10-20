package deob;

@ObfuscatedName("dp")
public class class123 implements class143 {

    @ObfuscatedName("dp.s")
    public class128[] field1665;

    @ObfuscatedName("dp.g")
    public class205 field1666 = new class205();

    @ObfuscatedName("dp.m")
    public int field1663;

    @ObfuscatedName("dp.h")
    public int field1664 = 0;

    @ObfuscatedName("dp.i")
    public double field1667 = 1.0D;

    @ObfuscatedName("dp.w")
    public int field1662 = 128;

    @ObfuscatedName("dp.t")
    public class247 field1661;

    public class123(class247 arg0, class247 arg1, int arg2, double arg3, int arg4) {
        this.field1661 = arg1;
        this.field1663 = arg2;
        this.field1664 = this.field1663;
        this.field1667 = arg3;
        this.field1662 = arg4;
        int[] var7 = arg0.method4195(0);
        int var8 = var7.length;
        this.field1665 = new class128[arg0.method4209(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4231(0, var7[var9]));
            this.field1665[var7[var9]] = new class128(var10);
        }
    }

    @ObfuscatedName("dp.s(I)I")
    public int method2403() {
        int var1 = 0;
        int var2 = 0;
        class128[] var3 = this.field1665;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class128 var5 = var3[var4];
            if (var5 != null && var5.field1756 != null) {
                var1 += var5.field1756.length;
                int[] var6 = var5.field1756;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1661.method4268(var8)) {
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

    @ObfuscatedName("dp.g(D)V")
    public void method2413(double arg0) {
        this.field1667 = arg0;
        this.method2404();
    }

    @ObfuscatedName("dp.m(II)[I")
    public int[] method2397(int arg0) {
        class128 var2 = this.field1665[arg0];
        if (var2 != null) {
            if (var2.field1762 != null) {
                this.field1666.method3748(var2);
                var2.field1769 = true;
                return var2.field1762;
            }
            boolean var3 = var2.method2509(this.field1667, this.field1662, this.field1661);
            if (var3) {
                if (this.field1664 == 0) {
                    class128 var4 = (class128) this.field1666.method3751();
                    var4.method2513();
                } else {
                    this.field1664--;
                }
                this.field1666.method3748(var2);
                var2.field1769 = true;
                return var2.field1762;
            }
        }
        return null;
    }

    @ObfuscatedName("dp.h(II)I")
    public int method2401(int arg0) {
        return this.field1665[arg0] == null ? 0 : this.field1665[arg0].field1760;
    }

    @ObfuscatedName("dp.i(II)Z")
    public boolean method2421(int arg0) {
        return this.field1665[arg0].field1757;
    }

    @ObfuscatedName("dp.w(IB)Z")
    public boolean method2398(int arg0) {
        return this.field1662 == 64;
    }

    @ObfuscatedName("dp.t(I)V")
    public void method2404() {
        for (int var1 = 0; var1 < this.field1665.length; var1++) {
            if (this.field1665[var1] != null) {
                this.field1665[var1].method2513();
            }
        }
        this.field1666 = new class205();
        this.field1664 = this.field1663;
    }

    @ObfuscatedName("dp.d(II)V")
    public void method2405(int arg0) {
        for (int var2 = 0; var2 < this.field1665.length; var2++) {
            class128 var3 = this.field1665[var2];
            if (var3 != null && var3.field1766 != 0 && var3.field1769) {
                var3.method2511(arg0);
                var3.field1769 = false;
            }
        }
    }
}
