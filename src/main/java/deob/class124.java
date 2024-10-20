package deob;

@ObfuscatedName("dh")
public class class124 implements class144 {

    @ObfuscatedName("dh.d")
    public class129[] field1761;

    @ObfuscatedName("dh.k")
    public class194 field1760 = new class194();

    @ObfuscatedName("dh.e")
    public int field1763;

    @ObfuscatedName("dh.p")
    public int field1770 = 0;

    @ObfuscatedName("dh.q")
    public double field1762 = 1.0D;

    @ObfuscatedName("dh.s")
    public int field1767 = 128;

    @ObfuscatedName("dh.r")
    public class236 field1765;

    public class124(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1765 = arg1;
        this.field1763 = arg2;
        this.field1770 = this.field1763;
        this.field1762 = arg3;
        this.field1767 = arg4;
        int[] var7 = arg0.method3885(0);
        int var8 = var7.length;
        this.field1761 = new class129[arg0.method3889(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3875(0, var7[var9]));
            this.field1761[var7[var9]] = new class129(var10);
        }
    }

    @ObfuscatedName("dh.d(D)V")
    public void method2239(double arg0) {
        this.field1762 = arg0;
        this.method2260();
    }

    @ObfuscatedName("dh.k(II)[I")
    public int[] method2240(int arg0) {
        class129 var2 = this.field1761[arg0];
        if (var2 != null) {
            if (var2.field1866 != null) {
                this.field1760.method3415(var2);
                var2.field1875 = true;
                return var2.field1866;
            }
            boolean var3 = var2.method2351(this.field1762, this.field1767, this.field1765);
            if (var3) {
                if (this.field1770 == 0) {
                    class129 var4 = (class129) this.field1760.method3410();
                    var4.method2349();
                } else {
                    this.field1770--;
                }
                this.field1760.method3415(var2);
                var2.field1875 = true;
                return var2.field1866;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.e(IB)I")
    public int method2241(int arg0) {
        return this.field1761[arg0] == null ? 0 : this.field1761[arg0].field1870;
    }

    @ObfuscatedName("dh.p(II)Z")
    public boolean method2245(int arg0) {
        return this.field1761[arg0].field1867;
    }

    @ObfuscatedName("dh.q(IB)Z")
    public boolean method2238(int arg0) {
        return this.field1767 == 64;
    }

    @ObfuscatedName("dh.s(I)V")
    public void method2260() {
        for (int var1 = 0; var1 < this.field1761.length; var1++) {
            if (this.field1761[var1] != null) {
                this.field1761[var1].method2349();
            }
        }
        this.field1760 = new class194();
        this.field1770 = this.field1763;
    }

    @ObfuscatedName("dh.r(II)V")
    public void method2258(int arg0) {
        for (int var2 = 0; var2 < this.field1761.length; var2++) {
            class129 var3 = this.field1761[var2];
            if (var3 != null && var3.field1872 != 0 && var3.field1875) {
                var3.method2350(arg0);
                var3.field1875 = false;
            }
        }
    }
}
