package deob;

@ObfuscatedName("dc")
public class class125 implements class145 {

    @ObfuscatedName("dc.a")
    public class130[] field1673;

    @ObfuscatedName("dc.w")
    public class205 field1666 = new class205();

    @ObfuscatedName("dc.e")
    public int field1667;

    @ObfuscatedName("dc.k")
    public int field1665 = 0;

    @ObfuscatedName("dc.u")
    public double field1669 = 1.0D;

    @ObfuscatedName("dc.z")
    public int field1670 = 128;

    @ObfuscatedName("dc.t")
    public class247 field1671;

    public class125(class247 arg0, class247 arg1, int arg2, double arg3, int arg4) {
        this.field1671 = arg1;
        this.field1667 = arg2;
        this.field1665 = this.field1667;
        this.field1669 = arg3;
        this.field1670 = arg4;
        int[] var7 = arg0.method3983(0);
        int var8 = var7.length;
        this.field1673 = new class130[arg0.method3907(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method3897(0, var7[var9]));
            this.field1673[var7[var9]] = new class130(var10);
        }
    }

    @ObfuscatedName("dc.a(D)V")
    public void method2176(double arg0) {
        this.field1669 = arg0;
        this.method2181();
    }

    @ObfuscatedName("dc.w(II)[I")
    public int[] method2177(int arg0) {
        class130 var2 = this.field1673[arg0];
        if (var2 != null) {
            if (var2.field1774 != null) {
                this.field1666.method3460(var2);
                var2.field1775 = true;
                return var2.field1774;
            }
            boolean var3 = var2.method2284(this.field1669, this.field1670, this.field1671);
            if (var3) {
                if (this.field1665 == 0) {
                    class130 var4 = (class130) this.field1666.method3441();
                    var4.method2285();
                } else {
                    this.field1665--;
                }
                this.field1666.method3460(var2);
                var2.field1775 = true;
                return var2.field1774;
            }
        }
        return null;
    }

    @ObfuscatedName("dc.e(IB)I")
    public int method2186(int arg0) {
        return this.field1673[arg0] == null ? 0 : this.field1673[arg0].field1771;
    }

    @ObfuscatedName("dc.k(IB)Z")
    public boolean method2179(int arg0) {
        return this.field1673[arg0].field1762;
    }

    @ObfuscatedName("dc.u(II)Z")
    public boolean method2180(int arg0) {
        return this.field1670 == 64;
    }

    @ObfuscatedName("dc.z(I)V")
    public void method2181() {
        for (int var1 = 0; var1 < this.field1673.length; var1++) {
            if (this.field1673[var1] != null) {
                this.field1673[var1].method2285();
            }
        }
        this.field1666 = new class205();
        this.field1665 = this.field1667;
    }

    @ObfuscatedName("dc.t(II)V")
    public void method2182(int arg0) {
        for (int var2 = 0; var2 < this.field1673.length; var2++) {
            class130 var3 = this.field1673[var2];
            if (var3 != null && var3.field1772 != 0 && var3.field1775) {
                var3.method2291(arg0);
                var3.field1775 = false;
            }
        }
    }
}
