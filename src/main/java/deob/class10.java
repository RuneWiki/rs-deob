package deob;

@ObfuscatedName("z")
public final class class10 extends class94 {

    @ObfuscatedName("z.t")
    public int field192;

    @ObfuscatedName("z.l")
    public int field185;

    @ObfuscatedName("z.c")
    public int field164;

    @ObfuscatedName("z.d")
    public int field177;

    @ObfuscatedName("z.b")
    public int field162;

    @ObfuscatedName("z.i")
    public int field172;

    @ObfuscatedName("z.p")
    public int field175;

    @ObfuscatedName("z.y")
    public int field169;

    @ObfuscatedName("z.u")
    public int field170;

    @ObfuscatedName("z.z")
    public int field171;

    @ObfuscatedName("z.j")
    public int field189;

    @ObfuscatedName("z.h")
    public boolean field173 = false;

    @ObfuscatedName("z.x")
    public double field174;

    @ObfuscatedName("z.q")
    public double field168;

    @ObfuscatedName("z.w")
    public double field176;

    @ObfuscatedName("z.k")
    public double field166;

    @ObfuscatedName("z.o")
    public double field178;

    @ObfuscatedName("z.f")
    public double field179;

    @ObfuscatedName("z.r")
    public double field180;

    @ObfuscatedName("z.s")
    public double field181;

    @ObfuscatedName("z.g")
    public int field182;

    @ObfuscatedName("z.m")
    public int field165;

    @ObfuscatedName("z.a")
    public class34 field184;

    @ObfuscatedName("z.n")
    public int field183 = 0;

    @ObfuscatedName("z.v")
    public int field186 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field192 = arg0;
        this.field185 = arg1;
        this.field164 = arg2;
        this.field177 = arg3;
        this.field162 = arg4;
        this.field175 = arg5;
        this.field169 = arg6;
        this.field170 = arg7;
        this.field171 = arg8;
        this.field189 = arg9;
        this.field172 = arg10;
        this.field173 = false;
        int var12 = class35.method711(this.field192).field925;
        if (var12 == -1) {
            this.field184 = null;
        } else {
            this.field184 = Statics.method31(var12);
        }
    }

    @ObfuscatedName("z.t(IIIII)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field173) {
            double var5 = (double) (arg0 - this.field164);
            double var7 = (double) (arg1 - this.field177);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field174 = (double) this.field171 * var5 / var9 + (double) this.field164;
            this.field168 = (double) this.field171 * var7 / var9 + (double) this.field177;
            this.field176 = (double) this.field162;
        }
        double var11 = (double) (this.field169 + 1 - arg3);
        this.field166 = ((double) arg0 - this.field174) / var11;
        this.field178 = ((double) arg1 - this.field168) / var11;
        this.field179 = Math.sqrt(this.field178 * this.field178 + this.field166 * this.field166);
        if (!this.field173) {
            this.field180 = -this.field179 * Math.tan((double) this.field170 * 0.02454369D);
        }
        this.field181 = ((double) arg2 - this.field176 - this.field180 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("z.c(II)V")
    public final void method113(int arg0) {
        this.field173 = true;
        this.field174 += (double) arg0 * this.field166;
        this.field168 += (double) arg0 * this.field178;
        this.field176 += this.field181 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field180;
        this.field180 += (double) arg0 * this.field181;
        this.field182 = (int) (Math.atan2(this.field166, this.field178) * 325.949D) + 1024 & 0x7FF;
        this.field165 = (int) (Math.atan2(this.field180, this.field179) * 325.949D) & 0x7FF;
        if (this.field184 == null) {
            return;
        }
        this.field186 += arg0;
        while (true) {
            do {
                do {
                    if (this.field186 <= this.field184.field900[this.field183]) {
                        return;
                    }
                    this.field186 -= this.field184.field900[this.field183];
                    this.field183++;
                } while (this.field183 < this.field184.field903.length);
                this.field183 -= this.field184.field907;
            } while (this.field183 >= 0 && this.field183 < this.field184.field903.length);
            this.field183 = 0;
        }
    }

    @ObfuscatedName("z.l(I)Ldk;")
    public final class112 method18() {
        class35 var1 = class35.method711(this.field192);
        class112 var2 = var1.method773(this.field183);
        if (var2 == null) {
            return null;
        } else {
            var2.method2247(this.field165);
            return var2;
        }
    }
}
