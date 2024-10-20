package deob;

@ObfuscatedName("dx")
public class class123 implements class143 {

    @ObfuscatedName("dx.p")
    public class128[] field1658;

    @ObfuscatedName("dx.i")
    public class205 field1653 = new class205();

    @ObfuscatedName("dx.w")
    public int field1654;

    @ObfuscatedName("dx.s")
    public int field1655 = 0;

    @ObfuscatedName("dx.j")
    public double field1652 = 1.0D;

    @ObfuscatedName("dx.a")
    public int field1657 = 128;

    @ObfuscatedName("dx.t")
    public class247 field1656;

    public class123(class247 arg0, class247 arg1, int arg2, double arg3, int arg4) {
        this.field1656 = arg1;
        this.field1654 = arg2;
        this.field1655 = this.field1654;
        this.field1652 = arg3;
        this.field1657 = arg4;
        int[] var7 = arg0.method4043(0);
        int var8 = var7.length;
        this.field1658 = new class128[arg0.method4044(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4032(0, var7[var9]));
            this.field1658[var7[var9]] = new class128(var10);
        }
    }

    @ObfuscatedName("dx.p(B)I")
    public int method2336() {
        int var1 = 0;
        int var2 = 0;
        class128[] var3 = this.field1658;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class128 var5 = var3[var4];
            if (var5 != null && var5.field1755 != null) {
                var1 += var5.field1755.length;
                int[] var6 = var5.field1755;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1656.method4040(var8)) {
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

    @ObfuscatedName("dx.i(D)V")
    public void method2338(double arg0) {
        this.field1652 = arg0;
        this.method2351();
    }

    @ObfuscatedName("dx.w(II)[I")
    public int[] method2345(int arg0) {
        class128 var2 = this.field1658[arg0];
        if (var2 != null) {
            if (var2.field1753 != null) {
                this.field1653.method3567(var2);
                var2.field1762 = true;
                return var2.field1753;
            }
            boolean var3 = var2.method2451(this.field1652, this.field1657, this.field1656);
            if (var3) {
                if (this.field1655 == 0) {
                    class128 var4 = (class128) this.field1653.method3571();
                    var4.method2447();
                } else {
                    this.field1655--;
                }
                this.field1653.method3567(var2);
                var2.field1762 = true;
                return var2.field1753;
            }
        }
        return null;
    }

    @ObfuscatedName("dx.s(II)I")
    public int method2340(int arg0) {
        return this.field1658[arg0] == null ? 0 : this.field1658[arg0].field1763;
    }

    @ObfuscatedName("dx.j(II)Z")
    public boolean method2360(int arg0) {
        return this.field1658[arg0].field1757;
    }

    @ObfuscatedName("dx.a(II)Z")
    public boolean method2342(int arg0) {
        return this.field1657 == 64;
    }

    @ObfuscatedName("dx.t(B)V")
    public void method2351() {
        for (int var1 = 0; var1 < this.field1658.length; var1++) {
            if (this.field1658[var1] != null) {
                this.field1658[var1].method2447();
            }
        }
        this.field1653 = new class205();
        this.field1655 = this.field1654;
    }

    @ObfuscatedName("dx.r(II)V")
    public void method2344(int arg0) {
        for (int var2 = 0; var2 < this.field1658.length; var2++) {
            class128 var3 = this.field1658[var2];
            if (var3 != null && var3.field1759 != 0 && var3.field1762) {
                var3.method2448(arg0);
                var3.field1762 = false;
            }
        }
    }
}
