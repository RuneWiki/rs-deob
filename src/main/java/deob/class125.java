package deob;

@ObfuscatedName("dx")
public class class125 implements class145 {

    @ObfuscatedName("dx.n")
    public class130[] field1686;

    @ObfuscatedName("dx.v")
    public class205 field1682 = new class205();

    @ObfuscatedName("dx.y")
    public int field1681;

    @ObfuscatedName("dx.r")
    public int field1683 = 0;

    @ObfuscatedName("dx.h")
    public double field1685 = 1.0D;

    @ObfuscatedName("dx.d")
    public int field1689 = 128;

    @ObfuscatedName("dx.s")
    public class247 field1687;

    public class125(class247 arg0, class247 arg1, int arg2, double arg3, int arg4) {
        this.field1687 = arg1;
        this.field1681 = arg2;
        this.field1683 = this.field1681;
        this.field1685 = arg3;
        this.field1689 = arg4;
        int[] var7 = arg0.method3976(0);
        int var8 = var7.length;
        this.field1686 = new class130[arg0.method3921(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method3931(0, var7[var9]));
            this.field1686[var7[var9]] = new class130(var10);
        }
    }

    @ObfuscatedName("dx.n(B)I")
    public int method2243() {
        int var1 = 0;
        int var2 = 0;
        class130[] var3 = this.field1686;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class130 var5 = var3[var4];
            if (var5 != null && var5.field1784 != null) {
                var1 += var5.field1784.length;
                int[] var6 = var5.field1784;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1687.method3919(var8)) {
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

    @ObfuscatedName("dx.v(D)V")
    public void method2215(double arg0) {
        this.field1685 = arg0;
        this.method2220();
    }

    @ObfuscatedName("dx.y(IB)[I")
    public int[] method2242(int arg0) {
        class130 var2 = this.field1686[arg0];
        if (var2 != null) {
            if (var2.field1778 != null) {
                this.field1682.method3483(var2);
                var2.field1786 = true;
                return var2.field1778;
            }
            boolean var3 = var2.method2336(this.field1685, this.field1689, this.field1687);
            if (var3) {
                if (this.field1683 == 0) {
                    class130 var4 = (class130) this.field1682.method3511();
                    var4.method2339();
                } else {
                    this.field1683--;
                }
                this.field1682.method3483(var2);
                var2.field1786 = true;
                return var2.field1778;
            }
        }
        return null;
    }

    @ObfuscatedName("dx.r(IB)I")
    public int method2217(int arg0) {
        return this.field1686[arg0] == null ? 0 : this.field1686[arg0].field1782;
    }

    @ObfuscatedName("dx.h(II)Z")
    public boolean method2218(int arg0) {
        return this.field1686[arg0].field1791;
    }

    @ObfuscatedName("dx.d(IB)Z")
    public boolean method2216(int arg0) {
        return this.field1689 == 64;
    }

    @ObfuscatedName("dx.s(I)V")
    public void method2220() {
        for (int var1 = 0; var1 < this.field1686.length; var1++) {
            if (this.field1686[var1] != null) {
                this.field1686[var1].method2339();
            }
        }
        this.field1682 = new class205();
        this.field1683 = this.field1681;
    }

    @ObfuscatedName("dx.b(II)V")
    public void method2221(int arg0) {
        for (int var2 = 0; var2 < this.field1686.length; var2++) {
            class130 var3 = this.field1686[var2];
            if (var3 != null && var3.field1788 != 0 && var3.field1786) {
                var3.method2338(arg0);
                var3.field1786 = false;
            }
        }
    }
}
