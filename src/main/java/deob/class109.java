package deob;

@ObfuscatedName("dx")
public class class109 implements class105 {

    @ObfuscatedName("dx.u")
    public class89[] field1809;

    @ObfuscatedName("dx.k")
    public class176 field1806 = new class176();

    @ObfuscatedName("dx.x")
    public int field1807;

    @ObfuscatedName("dx.m")
    public int field1808 = 0;

    @ObfuscatedName("dx.n")
    public double field1811 = 1.0D;

    @ObfuscatedName("dx.q")
    public int field1810 = 128;

    @ObfuscatedName("dx.a")
    public class151 field1805;

    public class109(class151 arg0, class151 arg1, int arg2, double arg3, int arg4) {
        this.field1805 = arg1;
        this.field1807 = arg2;
        this.field1808 = this.field1807;
        this.field1811 = arg3;
        this.field1810 = arg4;
        int[] var7 = arg0.method2974(0);
        int var8 = var7.length;
        this.field1809 = new class89[arg0.method2975(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method2965(0, var7[var9]));
            this.field1809[var7[var9]] = new class89(var10);
        }
    }

    @ObfuscatedName("dx.z(D)V")
    public void method2216(double arg0) {
        this.field1811 = arg0;
        this.method2225();
    }

    @ObfuscatedName("dx.u(IB)[I")
    public int[] method2204(int arg0) {
        class89 var2 = this.field1809[arg0];
        if (var2 != null) {
            if (var2.field1480 != null) {
                this.field1806.method3324(var2);
                var2.field1483 = true;
                return var2.field1480;
            }
            boolean var3 = var2.method1846(this.field1811, this.field1810, this.field1805);
            if (var3) {
                if (this.field1808 == 0) {
                    class89 var4 = (class89) this.field1806.method3327();
                    var4.method1847();
                } else {
                    this.field1808--;
                }
                this.field1806.method3324(var2);
                var2.field1483 = true;
                return var2.field1480;
            }
        }
        return null;
    }

    @ObfuscatedName("dx.k(II)I")
    public int method2197(int arg0) {
        return this.field1809[arg0] == null ? 0 : this.field1809[arg0].field1474;
    }

    @ObfuscatedName("dx.x(II)Z")
    public boolean method2200(int arg0) {
        return this.field1809[arg0].field1475;
    }

    @ObfuscatedName("dx.m(II)Z")
    public boolean method2199(int arg0) {
        return this.field1810 == 64;
    }

    @ObfuscatedName("dx.e(I)V")
    public void method2225() {
        for (int var1 = 0; var1 < this.field1809.length; var1++) {
            if (this.field1809[var1] != null) {
                this.field1809[var1].method1847();
            }
        }
        this.field1806 = new class176();
        this.field1808 = this.field1807;
    }

    @ObfuscatedName("dx.b(II)V")
    public void method2219(int arg0) {
        for (int var2 = 0; var2 < this.field1809.length; var2++) {
            class89 var3 = this.field1809[var2];
            if (var3 != null && var3.field1484 != 0 && var3.field1483) {
                var3.method1848(arg0);
                var3.field1483 = false;
            }
        }
    }
}
