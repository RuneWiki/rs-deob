package deob;

@ObfuscatedName("dd")
public class class126 implements class146 {

    @ObfuscatedName("dd.i")
    public class131[] field1758;

    @ObfuscatedName("dd.h")
    public class194 field1762 = new class194();

    @ObfuscatedName("dd.u")
    public int field1760;

    @ObfuscatedName("dd.q")
    public int field1759 = 0;

    @ObfuscatedName("dd.g")
    public double field1761 = 1.0D;

    @ObfuscatedName("dd.v")
    public int field1763 = 128;

    @ObfuscatedName("dd.t")
    public class236 field1764;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1764 = arg1;
        this.field1760 = arg2;
        this.field1759 = this.field1760;
        this.field1761 = arg3;
        this.field1763 = arg4;
        int[] var7 = arg0.method3845(0);
        int var8 = var7.length;
        this.field1758 = new class131[arg0.method3846(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3836(0, var7[var9]));
            this.field1758[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("dd.i(D)V")
    public void method2221(double arg0) {
        this.field1761 = arg0;
        this.method2199();
    }

    @ObfuscatedName("dd.h(II)[I")
    public int[] method2194(int arg0) {
        class131 var2 = this.field1758[arg0];
        if (var2 != null) {
            if (var2.field1874 != null) {
                this.field1762.method3402(var2);
                var2.field1873 = true;
                return var2.field1874;
            }
            boolean var3 = var2.method2309(this.field1761, this.field1763, this.field1764);
            if (var3) {
                if (this.field1759 == 0) {
                    class131 var4 = (class131) this.field1762.method3375();
                    var4.method2313();
                } else {
                    this.field1759--;
                }
                this.field1762.method3402(var2);
                var2.field1873 = true;
                return var2.field1874;
            }
        }
        return null;
    }

    @ObfuscatedName("dd.u(IB)I")
    public int method2196(int arg0) {
        return this.field1758[arg0] == null ? 0 : this.field1758[arg0].field1864;
    }

    @ObfuscatedName("dd.q(IB)Z")
    public boolean method2197(int arg0) {
        return this.field1758[arg0].field1865;
    }

    @ObfuscatedName("dd.g(IB)Z")
    public boolean method2195(int arg0) {
        return this.field1763 == 64;
    }

    @ObfuscatedName("dd.v(I)V")
    public void method2199() {
        for (int var1 = 0; var1 < this.field1758.length; var1++) {
            if (this.field1758[var1] != null) {
                this.field1758[var1].method2313();
            }
        }
        this.field1762 = new class194();
        this.field1759 = this.field1760;
    }

    @ObfuscatedName("dd.t(IS)V")
    public void method2200(int arg0) {
        for (int var2 = 0; var2 < this.field1758.length; var2++) {
            class131 var3 = this.field1758[var2];
            if (var3 != null && var3.field1871 != 0 && var3.field1873) {
                var3.method2310(arg0);
                var3.field1873 = false;
            }
        }
    }
}
