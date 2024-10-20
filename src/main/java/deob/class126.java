package deob;

@ObfuscatedName("du")
public class class126 implements class146 {

    @ObfuscatedName("du.i")
    public class131[] field1781;

    @ObfuscatedName("du.w")
    public class194 field1782 = new class194();

    @ObfuscatedName("du.a")
    public int field1791;

    @ObfuscatedName("du.t")
    public int field1783 = 0;

    @ObfuscatedName("du.s")
    public double field1785 = 1.0D;

    @ObfuscatedName("du.r")
    public int field1786 = 128;

    @ObfuscatedName("du.v")
    public class236 field1787;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1787 = arg1;
        this.field1791 = arg2;
        this.field1783 = this.field1791;
        this.field1785 = arg3;
        this.field1786 = arg4;
        int[] var7 = arg0.method3775(0);
        int var8 = var7.length;
        this.field1781 = new class131[arg0.method3787(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3768(0, var7[var9]));
            this.field1781[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("du.i(D)V")
    public void method2160(double arg0) {
        this.field1785 = arg0;
        this.method2165();
    }

    @ObfuscatedName("du.w(II)[I")
    public int[] method2161(int arg0) {
        class131 var2 = this.field1781[arg0];
        if (var2 != null) {
            if (var2.field1892 != null) {
                this.field1782.method3299(var2);
                var2.field1891 = true;
                return var2.field1892;
            }
            boolean var3 = var2.method2251(this.field1785, this.field1786, this.field1787);
            if (var3) {
                if (this.field1783 == 0) {
                    class131 var4 = (class131) this.field1782.method3302();
                    var4.method2252();
                } else {
                    this.field1783--;
                }
                this.field1782.method3299(var2);
                var2.field1891 = true;
                return var2.field1892;
            }
        }
        return null;
    }

    @ObfuscatedName("du.a(II)I")
    public int method2162(int arg0) {
        return this.field1781[arg0] == null ? 0 : this.field1781[arg0].field1884;
    }

    @ObfuscatedName("du.t(IS)Z")
    public boolean method2178(int arg0) {
        return this.field1781[arg0].field1890;
    }

    @ObfuscatedName("du.s(II)Z")
    public boolean method2164(int arg0) {
        return this.field1786 == 64;
    }

    @ObfuscatedName("du.r(S)V")
    public void method2165() {
        for (int var1 = 0; var1 < this.field1781.length; var1++) {
            if (this.field1781[var1] != null) {
                this.field1781[var1].method2252();
            }
        }
        this.field1782 = new class194();
        this.field1783 = this.field1791;
    }

    @ObfuscatedName("du.v(II)V")
    public void method2166(int arg0) {
        for (int var2 = 0; var2 < this.field1781.length; var2++) {
            class131 var3 = this.field1781[var2];
            if (var3 != null && var3.field1889 != 0 && var3.field1891) {
                var3.method2253(arg0);
                var3.field1891 = false;
            }
        }
    }
}
