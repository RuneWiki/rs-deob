package deob;

@ObfuscatedName("v")
public final class class10 extends class94 {

    @ObfuscatedName("v.i")
    public int field190;

    @ObfuscatedName("v.p")
    public int field162;

    @ObfuscatedName("v.a")
    public int field163;

    @ObfuscatedName("v.l")
    public int field165;

    @ObfuscatedName("v.q")
    public int field185;

    @ObfuscatedName("v.b")
    public int field166;

    @ObfuscatedName("v.u")
    public int field167;

    @ObfuscatedName("v.d")
    public int field181;

    @ObfuscatedName("v.m")
    public int field186;

    @ObfuscatedName("v.v")
    public int field170;

    @ObfuscatedName("v.j")
    public int field171;

    @ObfuscatedName("v.f")
    public boolean field172 = false;

    @ObfuscatedName("v.h")
    public double field173;

    @ObfuscatedName("v.o")
    public double field174;

    @ObfuscatedName("v.z")
    public double field175;

    @ObfuscatedName("v.k")
    public double field176;

    @ObfuscatedName("v.y")
    public double field189;

    @ObfuscatedName("v.g")
    public double field178;

    @ObfuscatedName("v.e")
    public double field179;

    @ObfuscatedName("v.s")
    public double field169;

    @ObfuscatedName("v.t")
    public int field177;

    @ObfuscatedName("v.r")
    public int field182;

    @ObfuscatedName("v.w")
    public class34 field183;

    @ObfuscatedName("v.x")
    public int field184 = 0;

    @ObfuscatedName("v.n")
    public int field164 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field190 = arg0;
        this.field162 = arg1;
        this.field163 = arg2;
        this.field165 = arg3;
        this.field185 = arg4;
        this.field167 = arg5;
        this.field181 = arg6;
        this.field186 = arg7;
        this.field170 = arg8;
        this.field171 = arg9;
        this.field166 = arg10;
        this.field172 = false;
        int var12 = class35.method37(this.field190).field914;
        if (var12 == -1) {
            this.field183 = null;
        } else {
            this.field183 = class34.method763(var12);
        }
    }

    @ObfuscatedName("v.i(IIIII)V")
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field172) {
            double var5 = (double) (arg0 - this.field163);
            double var7 = (double) (arg1 - this.field165);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field173 = (double) this.field170 * var5 / var9 + (double) this.field163;
            this.field174 = (double) this.field170 * var7 / var9 + (double) this.field165;
            this.field175 = (double) this.field185;
        }
        double var11 = (double) (this.field181 + 1 - arg3);
        this.field176 = ((double) arg0 - this.field173) / var11;
        this.field189 = ((double) arg1 - this.field174) / var11;
        this.field178 = Math.sqrt(this.field189 * this.field189 + this.field176 * this.field176);
        if (!this.field172) {
            this.field179 = -this.field178 * Math.tan((double) this.field186 * 0.02454369D);
        }
        this.field169 = ((double) arg2 - this.field175 - this.field179 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("v.a(IB)V")
    public final void method116(int arg0) {
        this.field172 = true;
        this.field173 += (double) arg0 * this.field176;
        this.field174 += (double) arg0 * this.field189;
        this.field175 += this.field169 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field179;
        this.field179 += (double) arg0 * this.field169;
        this.field177 = (int) (Math.atan2(this.field176, this.field189) * 325.949D) + 1024 & 0x7FF;
        this.field182 = (int) (Math.atan2(this.field179, this.field178) * 325.949D) & 0x7FF;
        if (this.field183 == null) {
            return;
        }
        this.field164 += arg0;
        while (true) {
            do {
                do {
                    if (this.field164 <= this.field183.field892[this.field184]) {
                        return;
                    }
                    this.field164 -= this.field183.field892[this.field184];
                    this.field184++;
                } while (this.field184 < this.field183.field890.length);
                this.field184 -= this.field183.field894;
            } while (this.field184 >= 0 && this.field184 < this.field183.field890.length);
            this.field184 = 0;
        }
    }

    @ObfuscatedName("v.p(I)Ldc;")
    public final class112 method26() {
        class35 var1 = class35.method37(this.field190);
        class112 var2 = var1.method728(this.field184);
        if (var2 == null) {
            return null;
        } else {
            var2.method2183(this.field182);
            return var2;
        }
    }
}
