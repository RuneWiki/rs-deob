package deob;

@ObfuscatedName("ds")
public class class109 implements class105 {

    @ObfuscatedName("ds.p")
    public class89[] field1841;

    @ObfuscatedName("ds.j")
    public class176 field1837 = new class176();

    @ObfuscatedName("ds.w")
    public int field1831;

    @ObfuscatedName("ds.h")
    public int field1832 = 0;

    @ObfuscatedName("ds.v")
    public double field1830 = 1.0D;

    @ObfuscatedName("ds.k")
    public int field1829 = 128;

    @ObfuscatedName("ds.g")
    public class151 field1835;

    public class109(class151 arg0, class151 arg1, int arg2, double arg3, int arg4) {
        this.field1835 = arg1;
        this.field1831 = arg2;
        this.field1832 = this.field1831;
        this.field1830 = arg3;
        this.field1829 = arg4;
        int[] var7 = arg0.method2972(0);
        int var8 = var7.length;
        this.field1841 = new class89[arg0.method2923(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method2973(0, var7[var9]));
            this.field1841[var7[var9]] = new class89(var10);
        }
    }

    @ObfuscatedName("ds.e(D)V")
    public void method2168(double arg0) {
        this.field1830 = arg0;
        this.method2170();
    }

    @ObfuscatedName("ds.p(IB)[I")
    public int[] method2143(int arg0) {
        class89 var2 = this.field1841[arg0];
        if (var2 != null) {
            if (var2.field1509 != null) {
                this.field1837.method3281(var2);
                var2.field1512 = true;
                return var2.field1509;
            }
            boolean var3 = var2.method1816(this.field1830, this.field1829, this.field1835);
            if (var3) {
                if (this.field1832 == 0) {
                    class89 var4 = (class89) this.field1837.method3284();
                    var4.method1815();
                } else {
                    this.field1832--;
                }
                this.field1837.method3281(var2);
                var2.field1512 = true;
                return var2.field1509;
            }
        }
        return null;
    }

    @ObfuscatedName("ds.j(II)I")
    public int method2145(int arg0) {
        return this.field1841[arg0] == null ? 0 : this.field1841[arg0].field1513;
    }

    @ObfuscatedName("ds.w(II)Z")
    public boolean method2141(int arg0) {
        return this.field1841[arg0].field1504;
    }

    @ObfuscatedName("ds.h(II)Z")
    public boolean method2144(int arg0) {
        return this.field1829 == 64;
    }

    @ObfuscatedName("ds.l(B)V")
    public void method2170() {
        for (int var1 = 0; var1 < this.field1841.length; var1++) {
            if (this.field1841[var1] != null) {
                this.field1841[var1].method1815();
            }
        }
        this.field1837 = new class176();
        this.field1832 = this.field1831;
    }

    @ObfuscatedName("ds.m(IB)V")
    public void method2171(int arg0) {
        for (int var2 = 0; var2 < this.field1841.length; var2++) {
            class89 var3 = this.field1841[var2];
            if (var3 != null && var3.field1510 != 0 && var3.field1512) {
                var3.method1818(arg0);
                var3.field1512 = false;
            }
        }
    }
}
