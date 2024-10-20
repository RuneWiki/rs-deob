package deob;

@ObfuscatedName("dl")
public class class110 implements class106 {

    @ObfuscatedName("dl.b")
    public class90[] field1847;

    @ObfuscatedName("dl.c")
    public class177 field1845 = new class177();

    @ObfuscatedName("dl.j")
    public int field1842;

    @ObfuscatedName("dl.i")
    public int field1843 = 0;

    @ObfuscatedName("dl.k")
    public double field1844 = 1.0D;

    @ObfuscatedName("dl.q")
    public int field1840 = 128;

    @ObfuscatedName("dl.t")
    public class153 field1846;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1846 = arg1;
        this.field1842 = arg2;
        this.field1843 = this.field1842;
        this.field1844 = arg3;
        this.field1840 = arg4;
        int[] var7 = arg0.method2999(0);
        int var8 = var7.length;
        this.field1847 = new class90[arg0.method2973(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2964(0, var7[var9]));
            this.field1847[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dl.o(D)V")
    public void method2182(double arg0) {
        this.field1844 = arg0;
        this.method2184();
    }

    @ObfuscatedName("dl.b(II)[I")
    public int[] method2161(int arg0) {
        class90 var2 = this.field1847[arg0];
        if (var2 != null) {
            if (var2.field1527 != null) {
                this.field1845.method3242(var2);
                var2.field1532 = true;
                return var2.field1527;
            }
            boolean var3 = var2.method1801(this.field1844, this.field1840, this.field1846);
            if (var3) {
                if (this.field1843 == 0) {
                    class90 var4 = (class90) this.field1845.method3245();
                    var4.method1805();
                } else {
                    this.field1843--;
                }
                this.field1845.method3242(var2);
                var2.field1532 = true;
                return var2.field1527;
            }
        }
        return null;
    }

    @ObfuscatedName("dl.c(IB)I")
    public int method2153(int arg0) {
        return this.field1847[arg0] == null ? 0 : this.field1847[arg0].field1523;
    }

    @ObfuscatedName("dl.j(II)Z")
    public boolean method2154(int arg0) {
        return this.field1847[arg0].field1524;
    }

    @ObfuscatedName("dl.i(IB)Z")
    public boolean method2155(int arg0) {
        return this.field1840 == 64;
    }

    @ObfuscatedName("dl.l(I)V")
    public void method2184() {
        for (int var1 = 0; var1 < this.field1847.length; var1++) {
            if (this.field1847[var1] != null) {
                this.field1847[var1].method1805();
            }
        }
        this.field1845 = new class177();
        this.field1843 = this.field1842;
    }

    @ObfuscatedName("dl.u(II)V")
    public void method2183(int arg0) {
        for (int var2 = 0; var2 < this.field1847.length; var2++) {
            class90 var3 = this.field1847[var2];
            if (var3 != null && var3.field1529 != 0 && var3.field1532) {
                var3.method1803(arg0);
                var3.field1532 = false;
            }
        }
    }
}
