package deob;

@ObfuscatedName("db")
public class class124 implements class144 {

    @ObfuscatedName("db.o")
    public class129[] field1714;

    @ObfuscatedName("db.k")
    public class218 field1708 = new class218();

    @ObfuscatedName("db.t")
    public int field1709;

    @ObfuscatedName("db.d")
    public int field1710 = 0;

    @ObfuscatedName("db.h")
    public double field1711 = 1.0D;

    @ObfuscatedName("db.m")
    public int field1712 = 128;

    @ObfuscatedName("db.z")
    public class262 field1713;

    public class124(class262 arg0, class262 arg1, int arg2, double arg3, int arg4) {
        this.field1713 = arg1;
        this.field1709 = arg2;
        this.field1710 = this.field1709;
        this.field1711 = arg3;
        this.field1712 = arg4;
        int[] var7 = arg0.method4168(0);
        int var8 = var7.length;
        this.field1714 = new class129[arg0.method4207(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class195 var10 = new class195(arg0.method4241(0, var7[var9]));
            this.field1714[var7[var9]] = new class129(var10);
        }
    }

    @ObfuscatedName("db.o(I)I")
    public int method2345() {
        int var1 = 0;
        int var2 = 0;
        class129[] var3 = this.field1714;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class129 var5 = var3[var4];
            if (var5 != null && var5.field1800 != null) {
                var1 += var5.field1800.length;
                int[] var6 = var5.field1800;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1713.method4244(var8)) {
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

    @ObfuscatedName("db.k(D)V")
    public void method2358(double arg0) {
        this.field1711 = arg0;
        this.method2346();
    }

    @ObfuscatedName("db.t(IB)[I")
    public int[] method2347(int arg0) {
        class129 var2 = this.field1714[arg0];
        if (var2 != null) {
            if (var2.field1812 != null) {
                this.field1708.method3691(var2);
                var2.field1813 = true;
                return var2.field1812;
            }
            boolean var3 = var2.method2448(this.field1711, this.field1712, this.field1713);
            if (var3) {
                if (this.field1710 == 0) {
                    class129 var4 = (class129) this.field1708.method3711();
                    var4.method2449();
                } else {
                    this.field1710--;
                }
                this.field1708.method3691(var2);
                var2.field1813 = true;
                return var2.field1812;
            }
        }
        return null;
    }

    @ObfuscatedName("db.d(II)I")
    public int method2351(int arg0) {
        return this.field1714[arg0] == null ? 0 : this.field1714[arg0].field1804;
    }

    @ObfuscatedName("db.h(IB)Z")
    public boolean method2349(int arg0) {
        return this.field1714[arg0].field1807;
    }

    @ObfuscatedName("db.m(II)Z")
    public boolean method2344(int arg0) {
        return this.field1712 == 64;
    }

    @ObfuscatedName("db.z(I)V")
    public void method2346() {
        for (int var1 = 0; var1 < this.field1714.length; var1++) {
            if (this.field1714[var1] != null) {
                this.field1714[var1].method2449();
            }
        }
        this.field1708 = new class218();
        this.field1710 = this.field1709;
    }

    @ObfuscatedName("db.i(IB)V")
    public void method2352(int arg0) {
        for (int var2 = 0; var2 < this.field1714.length; var2++) {
            class129 var3 = this.field1714[var2];
            if (var3 != null && var3.field1811 != 0 && var3.field1813) {
                var3.method2447(arg0);
                var3.field1813 = false;
            }
        }
    }
}
