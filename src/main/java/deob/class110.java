package deob;

@ObfuscatedName("dj")
public class class110 implements class106 {

    @ObfuscatedName("dj.b")
    public class90[] field1818;

    @ObfuscatedName("dj.e")
    public class177 field1812 = new class177();

    @ObfuscatedName("dj.g")
    public int field1813;

    @ObfuscatedName("dj.o")
    public int field1819 = 0;

    @ObfuscatedName("dj.a")
    public double field1815 = 1.0D;

    @ObfuscatedName("dj.h")
    public int field1811 = 128;

    @ObfuscatedName("dj.j")
    public class153 field1814;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1814 = arg1;
        this.field1813 = arg2;
        this.field1819 = this.field1813;
        this.field1815 = arg3;
        this.field1811 = arg4;
        int[] var7 = arg0.method3002(0);
        int var8 = var7.length;
        this.field1818 = new class90[arg0.method3006(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method3026(0, var7[var9]));
            this.field1818[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dj.w(D)V")
    public void method2208(double arg0) {
        this.field1815 = arg0;
        this.method2210();
    }

    @ObfuscatedName("dj.b(II)[I")
    public int[] method2186(int arg0) {
        class90 var2 = this.field1818[arg0];
        if (var2 != null) {
            if (var2.field1489 != null) {
                this.field1812.method3310(var2);
                var2.field1490 = true;
                return var2.field1489;
            }
            boolean var3 = var2.method1830(this.field1815, this.field1811, this.field1814);
            if (var3) {
                if (this.field1819 == 0) {
                    class90 var4 = (class90) this.field1812.method3313();
                    var4.method1829();
                } else {
                    this.field1819--;
                }
                this.field1812.method3310(var2);
                var2.field1490 = true;
                return var2.field1489;
            }
        }
        return null;
    }

    @ObfuscatedName("dj.e(II)I")
    public int method2182(int arg0) {
        return this.field1818[arg0] == null ? 0 : this.field1818[arg0].field1481;
    }

    @ObfuscatedName("dj.g(IB)Z")
    public boolean method2188(int arg0) {
        return this.field1818[arg0].field1482;
    }

    @ObfuscatedName("dj.o(II)Z")
    public boolean method2193(int arg0) {
        return this.field1811 == 64;
    }

    @ObfuscatedName("dj.r(I)V")
    public void method2210() {
        for (int var1 = 0; var1 < this.field1818.length; var1++) {
            if (this.field1818[var1] != null) {
                this.field1818[var1].method1829();
            }
        }
        this.field1812 = new class177();
        this.field1819 = this.field1813;
    }

    @ObfuscatedName("dj.x(IB)V")
    public void method2209(int arg0) {
        for (int var2 = 0; var2 < this.field1818.length; var2++) {
            class90 var3 = this.field1818[var2];
            if (var3 != null && var3.field1487 != 0 && var3.field1490) {
                var3.method1832(arg0);
                var3.field1490 = false;
            }
        }
    }
}
