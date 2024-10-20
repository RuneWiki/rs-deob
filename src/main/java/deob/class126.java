package deob;

@ObfuscatedName("da")
public class class126 implements class146 {

    @ObfuscatedName("da.d")
    public class131[] field1751;

    @ObfuscatedName("da.q")
    public class194 field1743 = new class194();

    @ObfuscatedName("da.x")
    public int field1744;

    @ObfuscatedName("da.y")
    public int field1746 = 0;

    @ObfuscatedName("da.e")
    public double field1745 = 1.0D;

    @ObfuscatedName("da.f")
    public int field1747 = 128;

    @ObfuscatedName("da.v")
    public class236 field1748;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1748 = arg1;
        this.field1744 = arg2;
        this.field1746 = this.field1744;
        this.field1745 = arg3;
        this.field1747 = arg4;
        int[] var7 = arg0.method3760(0);
        int var8 = var7.length;
        this.field1751 = new class131[arg0.method3761(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3750(0, var7[var9]));
            this.field1751[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("da.d(D)V")
    public void method2158(double arg0) {
        this.field1745 = arg0;
        this.method2159();
    }

    @ObfuscatedName("da.q(II)[I")
    public int[] method2155(int arg0) {
        class131 var2 = this.field1751[arg0];
        if (var2 != null) {
            if (var2.field1854 != null) {
                this.field1743.method3317(var2);
                var2.field1851 = true;
                return var2.field1854;
            }
            boolean var3 = var2.method2256(this.field1745, this.field1747, this.field1748);
            if (var3) {
                if (this.field1746 == 0) {
                    class131 var4 = (class131) this.field1743.method3322();
                    var4.method2259();
                } else {
                    this.field1746--;
                }
                this.field1743.method3317(var2);
                var2.field1851 = true;
                return var2.field1854;
            }
        }
        return null;
    }

    @ObfuscatedName("da.x(IB)I")
    public int method2163(int arg0) {
        return this.field1751[arg0] == null ? 0 : this.field1751[arg0].field1848;
    }

    @ObfuscatedName("da.y(IB)Z")
    public boolean method2157(int arg0) {
        return this.field1751[arg0].field1847;
    }

    @ObfuscatedName("da.e(IS)Z")
    public boolean method2154(int arg0) {
        return this.field1747 == 64;
    }

    @ObfuscatedName("da.f(I)V")
    public void method2159() {
        for (int var1 = 0; var1 < this.field1751.length; var1++) {
            if (this.field1751[var1] != null) {
                this.field1751[var1].method2259();
            }
        }
        this.field1743 = new class194();
        this.field1746 = this.field1744;
    }

    @ObfuscatedName("da.v(IB)V")
    public void method2160(int arg0) {
        for (int var2 = 0; var2 < this.field1751.length; var2++) {
            class131 var3 = this.field1751[var2];
            if (var3 != null && var3.field1852 != 0 && var3.field1851) {
                var3.method2258(arg0);
                var3.field1851 = false;
            }
        }
    }
}
