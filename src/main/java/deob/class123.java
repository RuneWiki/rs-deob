package deob;

@ObfuscatedName("dk")
public class class123 implements class143 {

    @ObfuscatedName("dk.b")
    public class128[] field1661;

    @ObfuscatedName("dk.q")
    public class214 field1658 = new class214();

    @ObfuscatedName("dk.o")
    public int field1660;

    @ObfuscatedName("dk.p")
    public int field1664 = 0;

    @ObfuscatedName("dk.a")
    public double field1657 = 1.0D;

    @ObfuscatedName("dk.h")
    public int field1662 = 128;

    @ObfuscatedName("dk.l")
    public class256 field1663;

    public class123(class256 arg0, class256 arg1, int arg2, double arg3, int arg4) {
        this.field1663 = arg1;
        this.field1660 = arg2;
        this.field1664 = this.field1660;
        this.field1657 = arg3;
        this.field1662 = arg4;
        int[] var7 = arg0.method4222(0);
        int var8 = var7.length;
        this.field1661 = new class128[arg0.method4172(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class194 var10 = new class194(arg0.method4158(0, var7[var9]));
            this.field1661[var7[var9]] = new class128(var10);
        }
    }

    @ObfuscatedName("dk.b(B)I")
    public int method2362() {
        int var1 = 0;
        int var2 = 0;
        class128[] var3 = this.field1661;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class128 var5 = var3[var4];
            if (var5 != null && var5.field1760 != null) {
                var1 += var5.field1760.length;
                int[] var6 = var5.field1760;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1663.method4163(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("dk.q(D)V")
    public void method2371(double arg0) {
        this.field1657 = arg0;
        this.method2368();
    }

    @ObfuscatedName("dk.o(II)[I")
    public int[] method2364(int arg0) {
        class128 var2 = this.field1661[arg0];
        if (var2 != null) {
            if (var2.field1765 != null) {
                this.field1658.method3747(var2);
                var2.field1766 = true;
                return var2.field1765;
            }
            boolean var3 = var2.method2480(this.field1657, this.field1662, this.field1663);
            if (var3) {
                if (this.field1664 == 0) {
                    class128 var4 = (class128) this.field1658.method3738();
                    var4.method2475();
                } else {
                    this.field1664--;
                }
                this.field1658.method3747(var2);
                var2.field1766 = true;
                return var2.field1765;
            }
        }
        return null;
    }

    @ObfuscatedName("dk.p(II)I")
    public int method2365(int arg0) {
        return this.field1661[arg0] == null ? 0 : this.field1661[arg0].field1755;
    }

    @ObfuscatedName("dk.a(IB)Z")
    public boolean method2385(int arg0) {
        return this.field1661[arg0].field1757;
    }

    @ObfuscatedName("dk.h(II)Z")
    public boolean method2374(int arg0) {
        return this.field1662 == 64;
    }

    @ObfuscatedName("dk.l(I)V")
    public void method2368() {
        for (int var1 = 0; var1 < this.field1661.length; var1++) {
            if (this.field1661[var1] != null) {
                this.field1661[var1].method2475();
            }
        }
        this.field1658 = new class214();
        this.field1664 = this.field1660;
    }

    @ObfuscatedName("dk.y(IB)V")
    public void method2369(int arg0) {
        for (int var2 = 0; var2 < this.field1661.length; var2++) {
            class128 var3 = this.field1661[var2];
            if (var3 != null && var3.field1763 != 0 && var3.field1766) {
                var3.method2476(arg0);
                var3.field1766 = false;
            }
        }
    }
}
