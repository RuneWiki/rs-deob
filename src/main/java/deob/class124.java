package deob;

@ObfuscatedName("dx")
public class class124 implements class144 {

    @ObfuscatedName("dx.g")
    public class129[] field1678;

    @ObfuscatedName("dx.e")
    public class218 field1679 = new class218();

    @ObfuscatedName("dx.b")
    public int field1682;

    @ObfuscatedName("dx.z")
    public int field1681 = 0;

    @ObfuscatedName("dx.n")
    public double field1685 = 1.0D;

    @ObfuscatedName("dx.l")
    public int field1683 = 128;

    @ObfuscatedName("dx.s")
    public class262 field1684;

    public class124(class262 arg0, class262 arg1, int arg2, double arg3, int arg4) {
        this.field1684 = arg1;
        this.field1682 = arg2;
        this.field1681 = this.field1682;
        this.field1685 = arg3;
        this.field1683 = arg4;
        int[] var7 = arg0.method4278(0);
        int var8 = var7.length;
        this.field1678 = new class129[arg0.method4279(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class195 var10 = new class195(arg0.method4294(0, var7[var9]));
            this.field1678[var7[var9]] = new class129(var10);
        }
    }

    @ObfuscatedName("dx.g(I)I")
    public int method2452() {
        int var1 = 0;
        int var2 = 0;
        class129[] var3 = this.field1678;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class129 var5 = var3[var4];
            if (var5 != null && var5.field1778 != null) {
                var1 += var5.field1778.length;
                int[] var6 = var5.field1778;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1684.method4270(var8)) {
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

    @ObfuscatedName("dx.e(D)V")
    public void method2453(double arg0) {
        this.field1685 = arg0;
        this.method2480();
    }

    @ObfuscatedName("dx.b(II)[I")
    public int[] method2464(int arg0) {
        class129 var2 = this.field1678[arg0];
        if (var2 != null) {
            if (var2.field1784 != null) {
                this.field1679.method3805(var2);
                var2.field1785 = true;
                return var2.field1784;
            }
            boolean var3 = var2.method2564(this.field1685, this.field1683, this.field1684);
            if (var3) {
                if (this.field1681 == 0) {
                    class129 var4 = (class129) this.field1679.method3808();
                    var4.method2566();
                } else {
                    this.field1681--;
                }
                this.field1679.method3805(var2);
                var2.field1785 = true;
                return var2.field1784;
            }
        }
        return null;
    }

    @ObfuscatedName("dx.z(II)I")
    public int method2455(int arg0) {
        return this.field1678[arg0] == null ? 0 : this.field1678[arg0].field1772;
    }

    @ObfuscatedName("dx.n(II)Z")
    public boolean method2458(int arg0) {
        return this.field1678[arg0].field1777;
    }

    @ObfuscatedName("dx.l(IB)Z")
    public boolean method2457(int arg0) {
        return this.field1683 == 64;
    }

    @ObfuscatedName("dx.s(B)V")
    public void method2480() {
        for (int var1 = 0; var1 < this.field1678.length; var1++) {
            if (this.field1678[var1] != null) {
                this.field1678[var1].method2566();
            }
        }
        this.field1679 = new class218();
        this.field1681 = this.field1682;
    }

    @ObfuscatedName("dx.y(IB)V")
    public void method2477(int arg0) {
        for (int var2 = 0; var2 < this.field1678.length; var2++) {
            class129 var3 = this.field1678[var2];
            if (var3 != null && var3.field1776 != 0 && var3.field1785) {
                var3.method2565(arg0);
                var3.field1785 = false;
            }
        }
    }
}
