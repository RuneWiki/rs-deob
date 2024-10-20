package deob;

@ObfuscatedName("dc")
public class class124 implements class144 {

    @ObfuscatedName("dc.w")
    public class129[] field1759;

    @ObfuscatedName("dc.s")
    public class194 field1761 = new class194();

    @ObfuscatedName("dc.q")
    public int field1760;

    @ObfuscatedName("dc.o")
    public int field1765 = 0;

    @ObfuscatedName("dc.g")
    public double field1762 = 1.0D;

    @ObfuscatedName("dc.v")
    public int field1763 = 128;

    @ObfuscatedName("dc.p")
    public class236 field1764;

    public class124(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1764 = arg1;
        this.field1760 = arg2;
        this.field1765 = this.field1760;
        this.field1762 = arg3;
        this.field1763 = arg4;
        int[] var7 = arg0.method3886(0);
        int var8 = var7.length;
        this.field1759 = new class129[arg0.method3908(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3876(0, var7[var9]));
            this.field1759[var7[var9]] = new class129(var10);
        }
    }

    @ObfuscatedName("dc.w(D)V")
    public void method2230(double arg0) {
        this.field1762 = arg0;
        this.method2234();
    }

    @ObfuscatedName("dc.s(IS)[I")
    public int[] method2231(int arg0) {
        class129 var2 = this.field1759[arg0];
        if (var2 != null) {
            if (var2.field1874 != null) {
                this.field1761.method3430(var2);
                var2.field1873 = true;
                return var2.field1874;
            }
            boolean var3 = var2.method2344(this.field1762, this.field1763, this.field1764);
            if (var3) {
                if (this.field1765 == 0) {
                    class129 var4 = (class129) this.field1761.method3433();
                    var4.method2346();
                } else {
                    this.field1765--;
                }
                this.field1761.method3430(var2);
                var2.field1873 = true;
                return var2.field1874;
            }
        }
        return null;
    }

    @ObfuscatedName("dc.q(II)I")
    public int method2249(int arg0) {
        return this.field1759[arg0] == null ? 0 : this.field1759[arg0].field1865;
    }

    @ObfuscatedName("dc.o(IB)Z")
    public boolean method2232(int arg0) {
        return this.field1759[arg0].field1866;
    }

    @ObfuscatedName("dc.g(II)Z")
    public boolean method2233(int arg0) {
        return this.field1763 == 64;
    }

    @ObfuscatedName("dc.v(S)V")
    public void method2234() {
        for (int var1 = 0; var1 < this.field1759.length; var1++) {
            if (this.field1759[var1] != null) {
                this.field1759[var1].method2346();
            }
        }
        this.field1761 = new class194();
        this.field1765 = this.field1760;
    }

    @ObfuscatedName("dc.p(II)V")
    public void method2239(int arg0) {
        for (int var2 = 0; var2 < this.field1759.length; var2++) {
            class129 var3 = this.field1759[var2];
            if (var3 != null && var3.field1867 != 0 && var3.field1873) {
                var3.method2347(arg0);
                var3.field1873 = false;
            }
        }
    }
}
