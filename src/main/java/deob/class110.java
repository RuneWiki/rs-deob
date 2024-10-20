package deob;

@ObfuscatedName("dh")
public class class110 implements class106 {

    @ObfuscatedName("dh.p")
    public class90[] field1823;

    @ObfuscatedName("dh.l")
    public class177 field1821 = new class177();

    @ObfuscatedName("dh.d")
    public int field1822;

    @ObfuscatedName("dh.x")
    public int field1825 = 0;

    @ObfuscatedName("dh.o")
    public double field1824 = 1.0D;

    @ObfuscatedName("dh.a")
    public int field1826 = 128;

    @ObfuscatedName("dh.w")
    public class153 field1820;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1820 = arg1;
        this.field1822 = arg2;
        this.field1825 = this.field1822;
        this.field1824 = arg3;
        this.field1826 = arg4;
        int[] var7 = arg0.method3087(0);
        int var8 = var7.length;
        this.field1823 = new class90[arg0.method3117(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3078(0, var7[var9]));
            this.field1823[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dh.s(D)V")
    public void method2253(double arg0) {
        this.field1824 = arg0;
        this.method2254();
    }

    @ObfuscatedName("dh.p(II)[I")
    public int[] method2234(int arg0) {
        class90 var2 = this.field1823[arg0];
        if (var2 != null) {
            if (var2.field1499 != null) {
                this.field1821.method3433(var2);
                var2.field1501 = true;
                return var2.field1499;
            }
            boolean var3 = var2.method1883(this.field1824, this.field1826, this.field1820);
            if (var3) {
                if (this.field1825 == 0) {
                    class90 var4 = (class90) this.field1821.method3423();
                    var4.method1884();
                } else {
                    this.field1825--;
                }
                this.field1821.method3433(var2);
                var2.field1501 = true;
                return var2.field1499;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.l(II)I")
    public int method2233(int arg0) {
        return this.field1823[arg0] == null ? 0 : this.field1823[arg0].field1491;
    }

    @ObfuscatedName("dh.d(IS)Z")
    public boolean method2238(int arg0) {
        return this.field1823[arg0].field1492;
    }

    @ObfuscatedName("dh.x(IB)Z")
    public boolean method2235(int arg0) {
        return this.field1826 == 64;
    }

    @ObfuscatedName("dh.e(B)V")
    public void method2254() {
        for (int var1 = 0; var1 < this.field1823.length; var1++) {
            if (this.field1823[var1] != null) {
                this.field1823[var1].method1884();
            }
        }
        this.field1821 = new class177();
        this.field1825 = this.field1822;
    }

    @ObfuscatedName("dh.r(II)V")
    public void method2256(int arg0) {
        for (int var2 = 0; var2 < this.field1823.length; var2++) {
            class90 var3 = this.field1823[var2];
            if (var3 != null && var3.field1488 != 0 && var3.field1501) {
                var3.method1885(arg0);
                var3.field1501 = false;
            }
        }
    }
}
