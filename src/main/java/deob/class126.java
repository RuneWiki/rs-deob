package deob;

@ObfuscatedName("dl")
public class class126 implements class146 {

    @ObfuscatedName("dl.c")
    public class131[] field1735;

    @ObfuscatedName("dl.o")
    public class194 field1734 = new class194();

    @ObfuscatedName("dl.i")
    public int field1736;

    @ObfuscatedName("dl.u")
    public int field1738 = 0;

    @ObfuscatedName("dl.g")
    public double field1741 = 1.0D;

    @ObfuscatedName("dl.m")
    public int field1739 = 128;

    @ObfuscatedName("dl.s")
    public class236 field1740;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1740 = arg1;
        this.field1736 = arg2;
        this.field1738 = this.field1736;
        this.field1741 = arg3;
        this.field1739 = arg4;
        int[] var7 = arg0.method3792(0);
        int var8 = var7.length;
        this.field1735 = new class131[arg0.method3739(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3741(0, var7[var9]));
            this.field1735[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("dl.c(D)V")
    public void method2131(double arg0) {
        this.field1741 = arg0;
        this.method2132();
    }

    @ObfuscatedName("dl.o(IB)[I")
    public int[] method2114(int arg0) {
        class131 var2 = this.field1735[arg0];
        if (var2 != null) {
            if (var2.field1838 != null) {
                this.field1734.method3292(var2);
                var2.field1828 = true;
                return var2.field1838;
            }
            boolean var3 = var2.method2222(this.field1741, this.field1739, this.field1740);
            if (var3) {
                if (this.field1738 == 0) {
                    class131 var4 = (class131) this.field1734.method3295();
                    var4.method2223();
                } else {
                    this.field1738--;
                }
                this.field1734.method3292(var2);
                var2.field1828 = true;
                return var2.field1838;
            }
        }
        return null;
    }

    @ObfuscatedName("dl.i(IB)I")
    public int method2122(int arg0) {
        return this.field1735[arg0] == null ? 0 : this.field1735[arg0].field1832;
    }

    @ObfuscatedName("dl.u(II)Z")
    public boolean method2117(int arg0) {
        return this.field1735[arg0].field1841;
    }

    @ObfuscatedName("dl.g(IB)Z")
    public boolean method2118(int arg0) {
        return this.field1739 == 64;
    }

    @ObfuscatedName("dl.m(B)V")
    public void method2132() {
        for (int var1 = 0; var1 < this.field1735.length; var1++) {
            if (this.field1735[var1] != null) {
                this.field1735[var1].method2223();
            }
        }
        this.field1734 = new class194();
        this.field1738 = this.field1736;
    }

    @ObfuscatedName("dl.s(IB)V")
    public void method2119(int arg0) {
        for (int var2 = 0; var2 < this.field1735.length; var2++) {
            class131 var3 = this.field1735[var2];
            if (var3 != null && var3.field1835 != 0 && var3.field1828) {
                var3.method2229(arg0);
                var3.field1828 = false;
            }
        }
    }
}
