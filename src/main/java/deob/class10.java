package deob;

@ObfuscatedName("o")
public final class class10 extends class93 {

    @ObfuscatedName("o.p")
    public int field177;

    @ObfuscatedName("o.j")
    public int field160;

    @ObfuscatedName("o.w")
    public int field161;

    @ObfuscatedName("o.h")
    public int field162;

    @ObfuscatedName("o.v")
    public int field163;

    @ObfuscatedName("o.k")
    public int field164;

    @ObfuscatedName("o.g")
    public int field173;

    @ObfuscatedName("o.n")
    public int field188;

    @ObfuscatedName("o.c")
    public int field167;

    @ObfuscatedName("o.o")
    public int field168;

    @ObfuscatedName("o.u")
    public int field159;

    @ObfuscatedName("o.z")
    public boolean field170 = false;

    @ObfuscatedName("o.e")
    public double field182;

    @ObfuscatedName("o.l")
    public double field172;

    @ObfuscatedName("o.m")
    public double field180;

    @ObfuscatedName("o.s")
    public double field169;

    @ObfuscatedName("o.i")
    public double field185;

    @ObfuscatedName("o.y")
    public double field176;

    @ObfuscatedName("o.d")
    public double field174;

    @ObfuscatedName("o.f")
    public double field178;

    @ObfuscatedName("o.a")
    public int field179;

    @ObfuscatedName("o.x")
    public int field175;

    @ObfuscatedName("o.r")
    public class33 field181;

    @ObfuscatedName("o.t")
    public int field165 = 0;

    @ObfuscatedName("o.b")
    public int field183 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field177 = arg0;
        this.field160 = arg1;
        this.field161 = arg2;
        this.field162 = arg3;
        this.field163 = arg4;
        this.field173 = arg5;
        this.field188 = arg6;
        this.field167 = arg7;
        this.field168 = arg8;
        this.field159 = arg9;
        this.field164 = arg10;
        this.field170 = false;
        int var12 = class34.method7(this.field177).field904;
        if (var12 == -1) {
            this.field181 = null;
        } else {
            this.field181 = class33.method751(var12);
        }
    }

    @ObfuscatedName("o.p(IIIIB)V")
    public final void method112(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field170) {
            double var5 = (double) (arg0 - this.field161);
            double var7 = (double) (arg1 - this.field162);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field182 = (double) this.field168 * var5 / var9 + (double) this.field161;
            this.field172 = (double) this.field168 * var7 / var9 + (double) this.field162;
            this.field180 = (double) this.field163;
        }
        double var11 = (double) (this.field188 + 1 - arg3);
        this.field169 = ((double) arg0 - this.field182) / var11;
        this.field185 = ((double) arg1 - this.field172) / var11;
        this.field176 = Math.sqrt(this.field185 * this.field185 + this.field169 * this.field169);
        if (!this.field170) {
            this.field174 = -this.field176 * Math.tan((double) this.field167 * 0.02454369D);
        }
        this.field178 = ((double) arg2 - this.field180 - this.field174 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("o.w(II)V")
    public final void method120(int arg0) {
        this.field170 = true;
        this.field182 += (double) arg0 * this.field169;
        this.field172 += (double) arg0 * this.field185;
        this.field180 += this.field178 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field174;
        this.field174 += (double) arg0 * this.field178;
        this.field179 = (int) (Math.atan2(this.field169, this.field185) * 325.949D) + 1024 & 0x7FF;
        this.field175 = (int) (Math.atan2(this.field174, this.field176) * 325.949D) & 0x7FF;
        if (this.field181 == null) {
            return;
        }
        this.field183 += arg0;
        while (true) {
            do {
                do {
                    if (this.field183 <= this.field181.field883[this.field165]) {
                        return;
                    }
                    this.field183 -= this.field181.field883[this.field165];
                    this.field165++;
                } while (this.field165 < this.field181.field876.length);
                this.field165 -= this.field181.field885;
            } while (this.field165 >= 0 && this.field165 < this.field181.field876.length);
            this.field165 = 0;
        }
    }

    @ObfuscatedName("o.j(I)Ldm;")
    public final class111 method19() {
        class34 var1 = class34.method7(this.field177);
        class111 var2 = var1.method713(this.field165);
        if (var2 == null) {
            return null;
        } else {
            var2.method2192(this.field175);
            return var2;
        }
    }
}
