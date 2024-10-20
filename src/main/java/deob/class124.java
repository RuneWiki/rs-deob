package deob;

@ObfuscatedName("dg")
public class class124 implements class144 {

    @ObfuscatedName("dg.t")
    public class129[] field1681;

    @ObfuscatedName("dg.q")
    public class218 field1678 = new class218();

    @ObfuscatedName("dg.i")
    public int field1680;

    @ObfuscatedName("dg.a")
    public int field1684 = 0;

    @ObfuscatedName("dg.l")
    public double field1682 = 1.0D;

    @ObfuscatedName("dg.b")
    public int field1685 = 128;

    @ObfuscatedName("dg.e")
    public class262 field1679;

    public class124(class262 arg0, class262 arg1, int arg2, double arg3, int arg4) {
        this.field1679 = arg1;
        this.field1680 = arg2;
        this.field1684 = this.field1680;
        this.field1682 = arg3;
        this.field1685 = arg4;
        int[] var7 = arg0.method4203(0);
        int var8 = var7.length;
        this.field1681 = new class129[arg0.method4204(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class195 var10 = new class195(arg0.method4265(0, var7[var9]));
            this.field1681[var7[var9]] = new class129(var10);
        }
    }

    @ObfuscatedName("dg.t(I)I")
    public int method2346() {
        int var1 = 0;
        int var2 = 0;
        class129[] var3 = this.field1681;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class129 var5 = var3[var4];
            if (var5 != null && var5.field1774 != null) {
                var1 += var5.field1774.length;
                int[] var6 = var5.field1774;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1679.method4195(var8)) {
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

    @ObfuscatedName("dg.q(D)V")
    public void method2347(double arg0) {
        this.field1682 = arg0;
        this.method2352();
    }

    @ObfuscatedName("dg.i(IB)[I")
    public int[] method2367(int arg0) {
        class129 var2 = this.field1681[arg0];
        if (var2 != null) {
            if (var2.field1786 != null) {
                this.field1678.method3728(var2);
                var2.field1780 = true;
                return var2.field1786;
            }
            boolean var3 = var2.method2460(this.field1682, this.field1685, this.field1679);
            if (var3) {
                if (this.field1684 == 0) {
                    class129 var4 = (class129) this.field1678.method3730();
                    var4.method2456();
                } else {
                    this.field1684--;
                }
                this.field1678.method3728(var2);
                var2.field1780 = true;
                return var2.field1786;
            }
        }
        return null;
    }

    @ObfuscatedName("dg.a(II)I")
    public int method2349(int arg0) {
        return this.field1681[arg0] == null ? 0 : this.field1681[arg0].field1778;
    }

    @ObfuscatedName("dg.l(IB)Z")
    public boolean method2350(int arg0) {
        return this.field1681[arg0].field1779;
    }

    @ObfuscatedName("dg.b(II)Z")
    public boolean method2351(int arg0) {
        return this.field1685 == 64;
    }

    @ObfuscatedName("dg.e(I)V")
    public void method2352() {
        for (int var1 = 0; var1 < this.field1681.length; var1++) {
            if (this.field1681[var1] != null) {
                this.field1681[var1].method2456();
            }
        }
        this.field1678 = new class218();
        this.field1684 = this.field1680;
    }

    @ObfuscatedName("dg.x(IB)V")
    public void method2354(int arg0) {
        for (int var2 = 0; var2 < this.field1681.length; var2++) {
            class129 var3 = this.field1681[var2];
            if (var3 != null && var3.field1784 != 0 && var3.field1780) {
                var3.method2454(arg0);
                var3.field1780 = false;
            }
        }
    }
}
