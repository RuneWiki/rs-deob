package deob;

@ObfuscatedName("do")
public class class110 implements class106 {

    @ObfuscatedName("do.c")
    public class90[] field1845;

    @ObfuscatedName("do.q")
    public class177 field1841 = new class177();

    @ObfuscatedName("do.y")
    public int field1847;

    @ObfuscatedName("do.v")
    public int field1843 = 0;

    @ObfuscatedName("do.g")
    public double field1844 = 1.0D;

    @ObfuscatedName("do.x")
    public int field1842 = 128;

    @ObfuscatedName("do.u")
    public class153 field1840;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1840 = arg1;
        this.field1847 = arg2;
        this.field1843 = this.field1847;
        this.field1844 = arg3;
        this.field1842 = arg4;
        int[] var7 = arg0.method2951(0);
        int var8 = var7.length;
        this.field1845 = new class90[arg0.method2956(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2886(0, var7[var9]));
            this.field1845[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("do.d(D)V")
    public void method2122(double arg0) {
        this.field1844 = arg0;
        this.method2124();
    }

    @ObfuscatedName("do.c(II)[I")
    public int[] method2105(int arg0) {
        class90 var2 = this.field1845[arg0];
        if (var2 != null) {
            if (var2.field1529 != null) {
                this.field1841.method3159(var2);
                var2.field1525 = true;
                return var2.field1529;
            }
            boolean var3 = var2.method1767(this.field1844, this.field1842, this.field1840);
            if (var3) {
                if (this.field1843 == 0) {
                    class90 var4 = (class90) this.field1841.method3162();
                    var4.method1768();
                } else {
                    this.field1843--;
                }
                this.field1841.method3159(var2);
                var2.field1525 = true;
                return var2.field1529;
            }
        }
        return null;
    }

    @ObfuscatedName("do.q(II)I")
    public int method2095(int arg0) {
        return this.field1845[arg0] == null ? 0 : this.field1845[arg0].field1521;
    }

    @ObfuscatedName("do.y(IS)Z")
    public boolean method2094(int arg0) {
        return this.field1845[arg0].field1519;
    }

    @ObfuscatedName("do.v(II)Z")
    public boolean method2097(int arg0) {
        return this.field1842 == 64;
    }

    @ObfuscatedName("do.f(I)V")
    public void method2124() {
        for (int var1 = 0; var1 < this.field1845.length; var1++) {
            if (this.field1845[var1] != null) {
                this.field1845[var1].method1768();
            }
        }
        this.field1841 = new class177();
        this.field1843 = this.field1847;
    }

    @ObfuscatedName("do.o(II)V")
    public void method2125(int arg0) {
        for (int var2 = 0; var2 < this.field1845.length; var2++) {
            class90 var3 = this.field1845[var2];
            if (var3 != null && var3.field1527 != 0 && var3.field1525) {
                var3.method1766(arg0);
                var3.field1525 = false;
            }
        }
    }
}
