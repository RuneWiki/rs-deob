package deob;

@ObfuscatedName("do")
public class class110 implements class106 {

    @ObfuscatedName("do.p")
    public class90[] field1830;

    @ObfuscatedName("do.i")
    public class177 field1833 = new class177();

    @ObfuscatedName("do.o")
    public int field1832;

    @ObfuscatedName("do.n")
    public int field1834 = 0;

    @ObfuscatedName("do.l")
    public double field1831 = 1.0D;

    @ObfuscatedName("do.v")
    public int field1835 = 128;

    @ObfuscatedName("do.g")
    public class152 field1836;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1836 = arg1;
        this.field1832 = arg2;
        this.field1834 = this.field1832;
        this.field1831 = arg3;
        this.field1835 = arg4;
        int[] var7 = arg0.method3007(0);
        int var8 = var7.length;
        this.field1830 = new class90[arg0.method3008(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3049(0, var7[var9]));
            this.field1830[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("do.w(D)V")
    public void method2253(double arg0) {
        this.field1831 = arg0;
        this.method2254();
    }

    @ObfuscatedName("do.p(IB)[I")
    public int[] method2242(int arg0) {
        class90 var2 = this.field1830[arg0];
        if (var2 != null) {
            if (var2.field1497 != null) {
                this.field1833.method3332(var2);
                var2.field1510 = true;
                return var2.field1497;
            }
            boolean var3 = var2.method1903(this.field1831, this.field1835, this.field1836);
            if (var3) {
                if (this.field1834 == 0) {
                    class90 var4 = (class90) this.field1833.method3333();
                    var4.method1905();
                } else {
                    this.field1834--;
                }
                this.field1833.method3332(var2);
                var2.field1510 = true;
                return var2.field1497;
            }
        }
        return null;
    }

    @ObfuscatedName("do.i(II)I")
    public int method2233(int arg0) {
        return this.field1830[arg0] == null ? 0 : this.field1830[arg0].field1511;
    }

    @ObfuscatedName("do.o(II)Z")
    public boolean method2230(int arg0) {
        return this.field1830[arg0].field1500;
    }

    @ObfuscatedName("do.n(IB)Z")
    public boolean method2231(int arg0) {
        return this.field1835 == 64;
    }

    @ObfuscatedName("do.s(I)V")
    public void method2254() {
        for (int var1 = 0; var1 < this.field1830.length; var1++) {
            if (this.field1830[var1] != null) {
                this.field1830[var1].method1905();
            }
        }
        this.field1833 = new class177();
        this.field1834 = this.field1832;
    }

    @ObfuscatedName("do.e(II)V")
    public void method2255(int arg0) {
        for (int var2 = 0; var2 < this.field1830.length; var2++) {
            class90 var3 = this.field1830[var2];
            if (var3 != null && var3.field1507 != 0 && var3.field1510) {
                var3.method1904(arg0);
                var3.field1510 = false;
            }
        }
    }
}
