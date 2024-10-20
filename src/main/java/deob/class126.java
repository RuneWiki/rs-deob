package deob;

@ObfuscatedName("dh")
public class class126 implements class146 {

    @ObfuscatedName("dh.w")
    public class131[] field1775;

    @ObfuscatedName("dh.o")
    public class197 field1776 = new class197();

    @ObfuscatedName("dh.x")
    public int field1778;

    @ObfuscatedName("dh.k")
    public int field1779 = 0;

    @ObfuscatedName("dh.f")
    public double field1784 = 1.0D;

    @ObfuscatedName("dh.i")
    public int field1787 = 128;

    @ObfuscatedName("dh.j")
    public class239 field1781;

    public class126(class239 arg0, class239 arg1, int arg2, double arg3, int arg4) {
        this.field1781 = arg1;
        this.field1778 = arg2;
        this.field1779 = this.field1778;
        this.field1784 = arg3;
        this.field1787 = arg4;
        int[] var7 = arg0.method3736(0);
        int var8 = var7.length;
        this.field1775 = new class131[arg0.method3798(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class177 var10 = new class177(arg0.method3754(0, var7[var9]));
            this.field1775[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("dh.w(D)V")
    public void method2134(double arg0) {
        this.field1784 = arg0;
        this.method2149();
    }

    @ObfuscatedName("dh.o(IB)[I")
    public int[] method2135(int arg0) {
        class131 var2 = this.field1775[arg0];
        if (var2 != null) {
            if (var2.field1894 != null) {
                this.field1776.method3300(var2);
                var2.field1882 = true;
                return var2.field1894;
            }
            boolean var3 = var2.method2241(this.field1784, this.field1787, this.field1781);
            if (var3) {
                if (this.field1779 == 0) {
                    class131 var4 = (class131) this.field1776.method3320();
                    var4.method2242();
                } else {
                    this.field1779--;
                }
                this.field1776.method3300(var2);
                var2.field1882 = true;
                return var2.field1894;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.x(II)I")
    public int method2136(int arg0) {
        return this.field1775[arg0] == null ? 0 : this.field1775[arg0].field1891;
    }

    @ObfuscatedName("dh.k(II)Z")
    public boolean method2137(int arg0) {
        return this.field1775[arg0].field1887;
    }

    @ObfuscatedName("dh.f(II)Z")
    public boolean method2138(int arg0) {
        return this.field1787 == 64;
    }

    @ObfuscatedName("dh.i(B)V")
    public void method2149() {
        for (int var1 = 0; var1 < this.field1775.length; var1++) {
            if (this.field1775[var1] != null) {
                this.field1775[var1].method2242();
            }
        }
        this.field1776 = new class197();
        this.field1779 = this.field1778;
    }

    @ObfuscatedName("dh.j(II)V")
    public void method2140(int arg0) {
        for (int var2 = 0; var2 < this.field1775.length; var2++) {
            class131 var3 = this.field1775[var2];
            if (var3 != null && var3.field1892 != 0 && var3.field1882) {
                var3.method2243(arg0);
                var3.field1882 = false;
            }
        }
    }
}
