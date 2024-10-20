package deob;

@ObfuscatedName("dh")
public class class109 implements class105 {

    @ObfuscatedName("dh.g")
    public class89[] field1801;

    @ObfuscatedName("dh.e")
    public class175 field1795 = new class175();

    @ObfuscatedName("dh.n")
    public int field1796;

    @ObfuscatedName("dh.j")
    public int field1797 = 0;

    @ObfuscatedName("dh.i")
    public double field1794 = 1.0D;

    @ObfuscatedName("dh.o")
    public int field1799 = 128;

    @ObfuscatedName("dh.l")
    public class150 field1800;

    public class109(class150 arg0, class150 arg1, int arg2, double arg3, int arg4) {
        this.field1800 = arg1;
        this.field1796 = arg2;
        this.field1797 = this.field1796;
        this.field1794 = arg3;
        this.field1799 = arg4;
        int[] var7 = arg0.method3031(0);
        int var8 = var7.length;
        this.field1801 = new class89[arg0.method3033(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method3012(0, var7[var9]));
            this.field1801[var7[var9]] = new class89(var10);
        }
    }

    @ObfuscatedName("dh.d(D)V")
    public void method2250(double arg0) {
        this.field1794 = arg0;
        this.method2257();
    }

    @ObfuscatedName("dh.g(II)[I")
    public int[] method2235(int arg0) {
        class89 var2 = this.field1801[arg0];
        if (var2 != null) {
            if (var2.field1494 != null) {
                this.field1795.method3384(var2);
                var2.field1495 = true;
                return var2.field1494;
            }
            boolean var3 = var2.method1854(this.field1794, this.field1799, this.field1800);
            if (var3) {
                if (this.field1797 == 0) {
                    class89 var4 = (class89) this.field1795.method3381();
                    var4.method1862();
                } else {
                    this.field1797--;
                }
                this.field1795.method3384(var2);
                var2.field1495 = true;
                return var2.field1494;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.e(II)I")
    public int method2231(int arg0) {
        return this.field1801[arg0] == null ? 0 : this.field1801[arg0].field1486;
    }

    @ObfuscatedName("dh.n(IS)Z")
    public boolean method2233(int arg0) {
        return this.field1801[arg0].field1487;
    }

    @ObfuscatedName("dh.j(II)Z")
    public boolean method2242(int arg0) {
        return this.field1799 == 64;
    }

    @ObfuscatedName("dh.x(I)V")
    public void method2257() {
        for (int var1 = 0; var1 < this.field1801.length; var1++) {
            if (this.field1801[var1] != null) {
                this.field1801[var1].method1862();
            }
        }
        this.field1795 = new class175();
        this.field1797 = this.field1796;
    }

    @ObfuscatedName("dh.s(IB)V")
    public void method2251(int arg0) {
        for (int var2 = 0; var2 < this.field1801.length; var2++) {
            class89 var3 = this.field1801[var2];
            if (var3 != null && var3.field1492 != 0 && var3.field1495) {
                var3.method1864(arg0);
                var3.field1495 = false;
            }
        }
    }
}
