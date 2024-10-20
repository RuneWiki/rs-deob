package deob;

@ObfuscatedName("dj")
public class class110 implements class106 {

    @ObfuscatedName("dj.i")
    public class90[] field1832;

    @ObfuscatedName("dj.v")
    public class177 field1841 = new class177();

    @ObfuscatedName("dj.m")
    public int field1834;

    @ObfuscatedName("dj.j")
    public int field1835 = 0;

    @ObfuscatedName("dj.o")
    public double field1836 = 1.0D;

    @ObfuscatedName("dj.l")
    public int field1833 = 128;

    @ObfuscatedName("dj.g")
    public class152 field1838;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1838 = arg1;
        this.field1834 = arg2;
        this.field1835 = this.field1834;
        this.field1836 = arg3;
        this.field1833 = arg4;
        int[] var7 = arg0.method3041(0);
        int var8 = var7.length;
        this.field1832 = new class90[arg0.method3088(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3032(0, var7[var9]));
            this.field1832[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dj.e(D)V")
    public void method2254(double arg0) {
        this.field1836 = arg0;
        this.method2263();
    }

    @ObfuscatedName("dj.i(II)[I")
    public int[] method2235(int arg0) {
        class90 var2 = this.field1832[arg0];
        if (var2 != null) {
            if (var2.field1512 != null) {
                this.field1841.method3365(var2);
                var2.field1513 = true;
                return var2.field1512;
            }
            boolean var3 = var2.method1869(this.field1836, this.field1833, this.field1838);
            if (var3) {
                if (this.field1835 == 0) {
                    class90 var4 = (class90) this.field1841.method3373();
                    var4.method1870();
                } else {
                    this.field1835--;
                }
                this.field1841.method3365(var2);
                var2.field1513 = true;
                return var2.field1512;
            }
        }
        return null;
    }

    @ObfuscatedName("dj.v(II)I")
    public int method2229(int arg0) {
        return this.field1832[arg0] == null ? 0 : this.field1832[arg0].field1504;
    }

    @ObfuscatedName("dj.m(II)Z")
    public boolean method2230(int arg0) {
        return this.field1832[arg0].field1505;
    }

    @ObfuscatedName("dj.j(II)Z")
    public boolean method2234(int arg0) {
        return this.field1833 == 64;
    }

    @ObfuscatedName("dj.y(I)V")
    public void method2263() {
        for (int var1 = 0; var1 < this.field1832.length; var1++) {
            if (this.field1832[var1] != null) {
                this.field1832[var1].method1870();
            }
        }
        this.field1841 = new class177();
        this.field1835 = this.field1834;
    }

    @ObfuscatedName("dj.k(II)V")
    public void method2256(int arg0) {
        for (int var2 = 0; var2 < this.field1832.length; var2++) {
            class90 var3 = this.field1832[var2];
            if (var3 != null && var3.field1510 != 0 && var3.field1513) {
                var3.method1871(arg0);
                var3.field1513 = false;
            }
        }
    }
}
