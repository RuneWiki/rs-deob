package deob;

@ObfuscatedName("s")
public final class class10 extends class93 {

    @ObfuscatedName("s.v")
    public int field180;

    @ObfuscatedName("s.f")
    public int field161;

    @ObfuscatedName("s.n")
    public int field162;

    @ObfuscatedName("s.c")
    public int field163;

    @ObfuscatedName("s.r")
    public int field175;

    @ObfuscatedName("s.k")
    public int field165;

    @ObfuscatedName("s.e")
    public int field166;

    @ObfuscatedName("s.q")
    public int field167;

    @ObfuscatedName("s.u")
    public int field168;

    @ObfuscatedName("s.s")
    public int field160;

    @ObfuscatedName("s.l")
    public int field174;

    @ObfuscatedName("s.o")
    public boolean field171 = false;

    @ObfuscatedName("s.h")
    public double field172;

    @ObfuscatedName("s.p")
    public double field173;

    @ObfuscatedName("s.d")
    public double field178;

    @ObfuscatedName("s.m")
    public double field181;

    @ObfuscatedName("s.z")
    public double field176;

    @ObfuscatedName("s.t")
    public double field177;

    @ObfuscatedName("s.i")
    public double field169;

    @ObfuscatedName("s.j")
    public double field179;

    @ObfuscatedName("s.a")
    public int field164;

    @ObfuscatedName("s.g")
    public int field185;

    @ObfuscatedName("s.x")
    public class33 field182;

    @ObfuscatedName("s.b")
    public int field183 = 0;

    @ObfuscatedName("s.w")
    public int field184 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field180 = arg0;
        this.field161 = arg1;
        this.field162 = arg2;
        this.field163 = arg3;
        this.field175 = arg4;
        this.field166 = arg5;
        this.field167 = arg6;
        this.field168 = arg7;
        this.field160 = arg8;
        this.field174 = arg9;
        this.field165 = arg10;
        this.field171 = false;
        int var12 = class34.method239(this.field180).field885;
        if (var12 == -1) {
            this.field182 = null;
        } else {
            this.field182 = class33.method1401(var12);
        }
    }

    @ObfuscatedName("s.v(IIIII)V")
    public final void method93(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field171) {
            double var5 = (double) (arg0 - this.field162);
            double var7 = (double) (arg1 - this.field163);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field172 = (double) this.field160 * var5 / var9 + (double) this.field162;
            this.field173 = (double) this.field160 * var7 / var9 + (double) this.field163;
            this.field178 = (double) this.field175;
        }
        double var11 = (double) (this.field167 + 1 - arg3);
        this.field181 = ((double) arg0 - this.field172) / var11;
        this.field176 = ((double) arg1 - this.field173) / var11;
        this.field177 = Math.sqrt(this.field181 * this.field181 + this.field176 * this.field176);
        if (!this.field171) {
            this.field169 = -this.field177 * Math.tan((double) this.field168 * 0.02454369D);
        }
        this.field179 = ((double) arg2 - this.field178 - this.field169 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("s.n(IS)V")
    public final void method94(int arg0) {
        this.field171 = true;
        this.field172 += (double) arg0 * this.field181;
        this.field173 += (double) arg0 * this.field176;
        this.field178 += this.field179 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field169;
        this.field169 += (double) arg0 * this.field179;
        this.field164 = (int) (Math.atan2(this.field181, this.field176) * 325.949D) + 1024 & 0x7FF;
        this.field185 = (int) (Math.atan2(this.field169, this.field177) * 325.949D) & 0x7FF;
        if (this.field182 == null) {
            return;
        }
        this.field184 += arg0;
        while (true) {
            do {
                do {
                    if (this.field184 <= this.field182.field864[this.field183]) {
                        return;
                    }
                    this.field184 -= this.field182.field864[this.field183];
                    this.field183++;
                } while (this.field183 < this.field182.field861.length);
                this.field183 -= this.field182.field865;
            } while (this.field183 >= 0 && this.field183 < this.field182.field861.length);
            this.field183 = 0;
        }
    }

    @ObfuscatedName("s.f(I)Ldf;")
    public final class111 method13() {
        class34 var1 = class34.method239(this.field180);
        class111 var2 = var1.method743(this.field183);
        if (var2 == null) {
            return null;
        } else {
            var2.method2262(this.field185);
            return var2;
        }
    }
}
