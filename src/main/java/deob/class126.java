package deob;

@ObfuscatedName("dq")
public class class126 implements class146 {

    @ObfuscatedName("dq.e")
    public class131[] field1776;

    @ObfuscatedName("dq.o")
    public class194 field1773 = new class194();

    @ObfuscatedName("dq.m")
    public int field1779;

    @ObfuscatedName("dq.g")
    public int field1775 = 0;

    @ObfuscatedName("dq.d")
    public double field1778 = 1.0D;

    @ObfuscatedName("dq.b")
    public int field1772 = 128;

    @ObfuscatedName("dq.k")
    public class236 field1774;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1774 = arg1;
        this.field1779 = arg2;
        this.field1775 = this.field1779;
        this.field1778 = arg3;
        this.field1772 = arg4;
        int[] var7 = arg0.method3790(0);
        int var8 = var7.length;
        this.field1776 = new class131[arg0.method3771(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3760(0, var7[var9]));
            this.field1776[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("dq.e(D)V")
    public void method2154(double arg0) {
        this.field1778 = arg0;
        this.method2159();
    }

    @ObfuscatedName("dq.o(II)[I")
    public int[] method2155(int arg0) {
        class131 var2 = this.field1776[arg0];
        if (var2 != null) {
            if (var2.field1879 != null) {
                this.field1773.method3314(var2);
                var2.field1869 = true;
                return var2.field1879;
            }
            boolean var3 = var2.method2264(this.field1778, this.field1772, this.field1774);
            if (var3) {
                if (this.field1775 == 0) {
                    class131 var4 = (class131) this.field1773.method3323();
                    var4.method2265();
                } else {
                    this.field1775--;
                }
                this.field1773.method3314(var2);
                var2.field1869 = true;
                return var2.field1879;
            }
        }
        return null;
    }

    @ObfuscatedName("dq.m(II)I")
    public int method2156(int arg0) {
        return this.field1776[arg0] == null ? 0 : this.field1776[arg0].field1881;
    }

    @ObfuscatedName("dq.g(II)Z")
    public boolean method2157(int arg0) {
        return this.field1776[arg0].field1872;
    }

    @ObfuscatedName("dq.d(IS)Z")
    public boolean method2166(int arg0) {
        return this.field1772 == 64;
    }

    @ObfuscatedName("dq.b(I)V")
    public void method2159() {
        for (int var1 = 0; var1 < this.field1776.length; var1++) {
            if (this.field1776[var1] != null) {
                this.field1776[var1].method2265();
            }
        }
        this.field1773 = new class194();
        this.field1775 = this.field1779;
    }

    @ObfuscatedName("dq.k(II)V")
    public void method2153(int arg0) {
        for (int var2 = 0; var2 < this.field1776.length; var2++) {
            class131 var3 = this.field1776[var2];
            if (var3 != null && var3.field1877 != 0 && var3.field1869) {
                var3.method2270(arg0);
                var3.field1869 = false;
            }
        }
    }
}
