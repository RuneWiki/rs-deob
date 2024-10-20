package deob;

@ObfuscatedName("dj")
public class class110 implements class106 {

    @ObfuscatedName("dj.g")
    public class90[] field1820;

    @ObfuscatedName("dj.m")
    public class177 field1816 = new class177();

    @ObfuscatedName("dj.v")
    public int field1817;

    @ObfuscatedName("dj.r")
    public int field1815 = 0;

    @ObfuscatedName("dj.n")
    public double field1819 = 1.0D;

    @ObfuscatedName("dj.i")
    public int field1822 = 128;

    @ObfuscatedName("dj.s")
    public class152 field1821;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1821 = arg1;
        this.field1817 = arg2;
        this.field1815 = this.field1817;
        this.field1819 = arg3;
        this.field1822 = arg4;
        int[] var7 = arg0.method2977(0);
        int var8 = var7.length;
        this.field1820 = new class90[arg0.method2975(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2968(0, var7[var9]));
            this.field1820[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dj.l(D)V")
    public void method2189(double arg0) {
        this.field1819 = arg0;
        this.method2198();
    }

    @ObfuscatedName("dj.g(II)[I")
    public int[] method2178(int arg0) {
        class90 var2 = this.field1820[arg0];
        if (var2 != null) {
            if (var2.field1504 != null) {
                this.field1816.method3320(var2);
                var2.field1494 = true;
                return var2.field1504;
            }
            boolean var3 = var2.method1830(this.field1819, this.field1822, this.field1821);
            if (var3) {
                if (this.field1815 == 0) {
                    class90 var4 = (class90) this.field1816.method3322();
                    var4.method1831();
                } else {
                    this.field1815--;
                }
                this.field1816.method3320(var2);
                var2.field1494 = true;
                return var2.field1504;
            }
        }
        return null;
    }

    @ObfuscatedName("dj.m(II)I")
    public int method2172(int arg0) {
        return this.field1820[arg0] == null ? 0 : this.field1820[arg0].field1496;
    }

    @ObfuscatedName("dj.v(II)Z")
    public boolean method2170(int arg0) {
        return this.field1820[arg0].field1497;
    }

    @ObfuscatedName("dj.r(II)Z")
    public boolean method2177(int arg0) {
        return this.field1822 == 64;
    }

    @ObfuscatedName("dj.e(S)V")
    public void method2198() {
        for (int var1 = 0; var1 < this.field1820.length; var1++) {
            if (this.field1820[var1] != null) {
                this.field1820[var1].method1831();
            }
        }
        this.field1816 = new class177();
        this.field1815 = this.field1817;
    }

    @ObfuscatedName("dj.p(IB)V")
    public void method2191(int arg0) {
        for (int var2 = 0; var2 < this.field1820.length; var2++) {
            class90 var3 = this.field1820[var2];
            if (var3 != null && var3.field1502 != 0 && var3.field1494) {
                var3.method1832(arg0);
                var3.field1494 = false;
            }
        }
    }
}
