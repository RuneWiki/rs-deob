package deob;

@ObfuscatedName("dx")
public class class127 implements class147 {

    @ObfuscatedName("dx.e")
    public class132[] field1760;

    @ObfuscatedName("dx.n")
    public class195 field1765 = new class195();

    @ObfuscatedName("dx.g")
    public int field1759;

    @ObfuscatedName("dx.y")
    public int field1762 = 0;

    @ObfuscatedName("dx.w")
    public double field1763 = 1.0D;

    @ObfuscatedName("dx.k")
    public int field1764 = 128;

    @ObfuscatedName("dx.v")
    public class237 field1761;

    public class127(class237 arg0, class237 arg1, int arg2, double arg3, int arg4) {
        this.field1761 = arg1;
        this.field1759 = arg2;
        this.field1762 = this.field1759;
        this.field1763 = arg3;
        this.field1764 = arg4;
        int[] var7 = arg0.method3827(0);
        int var8 = var7.length;
        this.field1760 = new class132[arg0.method3828(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class175 var10 = new class175(arg0.method3817(0, var7[var9]));
            this.field1760[var7[var9]] = new class132(var10);
        }
    }

    @ObfuscatedName("dx.e(D)V")
    public void method2194(double arg0) {
        this.field1763 = arg0;
        this.method2201();
    }

    @ObfuscatedName("dx.n(II)[I")
    public int[] method2218(int arg0) {
        class132 var2 = this.field1760[arg0];
        if (var2 != null) {
            if (var2.field1873 != null) {
                this.field1765.method3343(var2);
                var2.field1874 = true;
                return var2.field1873;
            }
            boolean var3 = var2.method2303(this.field1763, this.field1764, this.field1761);
            if (var3) {
                if (this.field1762 == 0) {
                    class132 var4 = (class132) this.field1765.method3347();
                    var4.method2311();
                } else {
                    this.field1762--;
                }
                this.field1765.method3343(var2);
                var2.field1874 = true;
                return var2.field1873;
            }
        }
        return null;
    }

    @ObfuscatedName("dx.g(II)I")
    public int method2196(int arg0) {
        return this.field1760[arg0] == null ? 0 : this.field1760[arg0].field1865;
    }

    @ObfuscatedName("dx.y(II)Z")
    public boolean method2198(int arg0) {
        return this.field1760[arg0].field1864;
    }

    @ObfuscatedName("dx.w(IB)Z")
    public boolean method2197(int arg0) {
        return this.field1764 == 64;
    }

    @ObfuscatedName("dx.k(B)V")
    public void method2201() {
        for (int var1 = 0; var1 < this.field1760.length; var1++) {
            if (this.field1760[var1] != null) {
                this.field1760[var1].method2311();
            }
        }
        this.field1765 = new class195();
        this.field1762 = this.field1759;
    }

    @ObfuscatedName("dx.v(IS)V")
    public void method2199(int arg0) {
        for (int var2 = 0; var2 < this.field1760.length; var2++) {
            class132 var3 = this.field1760[var2];
            if (var3 != null && var3.field1871 != 0 && var3.field1874) {
                var3.method2305(arg0);
                var3.field1874 = false;
            }
        }
    }
}
