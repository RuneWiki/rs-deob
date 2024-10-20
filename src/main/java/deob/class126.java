package deob;

@ObfuscatedName("dj")
public class class126 implements class146 {

    @ObfuscatedName("dj.n")
    public class131[] field1789;

    @ObfuscatedName("dj.p")
    public class194 field1786 = new class194();

    @ObfuscatedName("dj.i")
    public int field1782;

    @ObfuscatedName("dj.j")
    public int field1783 = 0;

    @ObfuscatedName("dj.f")
    public double field1784 = 1.0D;

    @ObfuscatedName("dj.m")
    public int field1785 = 128;

    @ObfuscatedName("dj.c")
    public class236 field1781;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1781 = arg1;
        this.field1782 = arg2;
        this.field1783 = this.field1782;
        this.field1784 = arg3;
        this.field1785 = arg4;
        int[] var7 = arg0.method3861(0);
        int var8 = var7.length;
        this.field1789 = new class131[arg0.method3879(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3880(0, var7[var9]));
            this.field1789[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("dj.n(D)V")
    public void method2209(double arg0) {
        this.field1784 = arg0;
        this.method2202();
    }

    @ObfuscatedName("dj.p(II)[I")
    public int[] method2203(int arg0) {
        class131 var2 = this.field1789[arg0];
        if (var2 != null) {
            if (var2.field1885 != null) {
                this.field1786.method3353(var2);
                var2.field1895 = true;
                return var2.field1885;
            }
            boolean var3 = var2.method2307(this.field1784, this.field1785, this.field1781);
            if (var3) {
                if (this.field1783 == 0) {
                    class131 var4 = (class131) this.field1786.method3356();
                    var4.method2310();
                } else {
                    this.field1783--;
                }
                this.field1786.method3353(var2);
                var2.field1895 = true;
                return var2.field1885;
            }
        }
        return null;
    }

    @ObfuscatedName("dj.i(IB)I")
    public int method2199(int arg0) {
        return this.field1789[arg0] == null ? 0 : this.field1789[arg0].field1886;
    }

    @ObfuscatedName("dj.j(IS)Z")
    public boolean method2207(int arg0) {
        return this.field1789[arg0].field1894;
    }

    @ObfuscatedName("dj.f(II)Z")
    public boolean method2201(int arg0) {
        return this.field1785 == 64;
    }

    @ObfuscatedName("dj.m(I)V")
    public void method2202() {
        for (int var1 = 0; var1 < this.field1789.length; var1++) {
            if (this.field1789[var1] != null) {
                this.field1789[var1].method2310();
            }
        }
        this.field1786 = new class194();
        this.field1783 = this.field1782;
    }

    @ObfuscatedName("dj.c(II)V")
    public void method2214(int arg0) {
        for (int var2 = 0; var2 < this.field1789.length; var2++) {
            class131 var3 = this.field1789[var2];
            if (var3 != null && var3.field1892 != 0 && var3.field1895) {
                var3.method2311(arg0);
                var3.field1895 = false;
            }
        }
    }
}
