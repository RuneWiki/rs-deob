package deob;

@ObfuscatedName("dj")
public class class109 implements class105 {

    @ObfuscatedName("dj.v")
    public class89[] field1816;

    @ObfuscatedName("dj.f")
    public class176 field1813 = new class176();

    @ObfuscatedName("dj.n")
    public int field1819;

    @ObfuscatedName("dj.c")
    public int field1814 = 0;

    @ObfuscatedName("dj.r")
    public double field1812 = 1.0D;

    @ObfuscatedName("dj.k")
    public int field1817 = 128;

    @ObfuscatedName("dj.e")
    public class151 field1818;

    public class109(class151 arg0, class151 arg1, int arg2, double arg3, int arg4) {
        this.field1818 = arg1;
        this.field1819 = arg2;
        this.field1814 = this.field1819;
        this.field1812 = arg3;
        this.field1817 = arg4;
        int[] var7 = arg0.method2970(0);
        int var8 = var7.length;
        this.field1816 = new class89[arg0.method2971(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method3020(0, var7[var9]));
            this.field1816[var7[var9]] = new class89(var10);
        }
    }

    @ObfuscatedName("dj.i(D)V")
    public void method2239(double arg0) {
        this.field1812 = arg0;
        this.method2237();
    }

    @ObfuscatedName("dj.v(IB)[I")
    public int[] method2217(int arg0) {
        class89 var2 = this.field1816[arg0];
        if (var2 != null) {
            if (var2.field1472 != null) {
                this.field1813.method3291(var2);
                var2.field1484 = true;
                return var2.field1472;
            }
            boolean var3 = var2.method1870(this.field1812, this.field1817, this.field1818);
            if (var3) {
                if (this.field1814 == 0) {
                    class89 var4 = (class89) this.field1813.method3293();
                    var4.method1868();
                } else {
                    this.field1814--;
                }
                this.field1813.method3291(var2);
                var2.field1484 = true;
                return var2.field1472;
            }
        }
        return null;
    }

    @ObfuscatedName("dj.f(II)I")
    public int method2206(int arg0) {
        return this.field1816[arg0] == null ? 0 : this.field1816[arg0].field1475;
    }

    @ObfuscatedName("dj.n(II)Z")
    public boolean method2208(int arg0) {
        return this.field1816[arg0].field1476;
    }

    @ObfuscatedName("dj.c(IB)Z")
    public boolean method2207(int arg0) {
        return this.field1817 == 64;
    }

    @ObfuscatedName("dj.j(I)V")
    public void method2237() {
        for (int var1 = 0; var1 < this.field1816.length; var1++) {
            if (this.field1816[var1] != null) {
                this.field1816[var1].method1868();
            }
        }
        this.field1813 = new class176();
        this.field1814 = this.field1819;
    }

    @ObfuscatedName("dj.a(IB)V")
    public void method2236(int arg0) {
        for (int var2 = 0; var2 < this.field1816.length; var2++) {
            class89 var3 = this.field1816[var2];
            if (var3 != null && var3.field1471 != 0 && var3.field1484) {
                var3.method1869(arg0);
                var3.field1484 = false;
            }
        }
    }
}
