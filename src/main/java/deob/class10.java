package deob;

@ObfuscatedName("w")
public final class class10 extends class94 {

    @ObfuscatedName("w.b")
    public int field174;

    @ObfuscatedName("w.c")
    public int field165;

    @ObfuscatedName("w.j")
    public int field186;

    @ObfuscatedName("w.i")
    public int field167;

    @ObfuscatedName("w.k")
    public int field168;

    @ObfuscatedName("w.q")
    public int field184;

    @ObfuscatedName("w.t")
    public int field170;

    @ObfuscatedName("w.v")
    public int field171;

    @ObfuscatedName("w.y")
    public int field172;

    @ObfuscatedName("w.w")
    public int field173;

    @ObfuscatedName("w.g")
    public int field188;

    @ObfuscatedName("w.s")
    public boolean field175 = false;

    @ObfuscatedName("w.n")
    public double field176;

    @ObfuscatedName("w.x")
    public double field177;

    @ObfuscatedName("w.o")
    public double field166;

    @ObfuscatedName("w.l")
    public double field179;

    @ObfuscatedName("w.u")
    public double field180;

    @ObfuscatedName("w.z")
    public double field181;

    @ObfuscatedName("w.d")
    public double field182;

    @ObfuscatedName("w.m")
    public double field183;

    @ObfuscatedName("w.f")
    public int field178;

    @ObfuscatedName("w.a")
    public int field185;

    @ObfuscatedName("w.h")
    public class34 field169;

    @ObfuscatedName("w.p")
    public int field187 = 0;

    @ObfuscatedName("w.e")
    public int field164 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field174 = arg0;
        this.field165 = arg1;
        this.field186 = arg2;
        this.field167 = arg3;
        this.field168 = arg4;
        this.field170 = arg5;
        this.field171 = arg6;
        this.field172 = arg7;
        this.field173 = arg8;
        this.field188 = arg9;
        this.field184 = arg10;
        this.field175 = false;
        int var12 = class35.method216(this.field174).field909;
        if (var12 == -1) {
            this.field169 = null;
        } else {
            this.field169 = Statics.method61(var12);
        }
    }

    @ObfuscatedName("w.b(IIIIB)V")
    public final void method118(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field175) {
            double var5 = (double) (arg0 - this.field186);
            double var7 = (double) (arg1 - this.field167);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field176 = (double) this.field173 * var5 / var9 + (double) this.field186;
            this.field177 = (double) this.field173 * var7 / var9 + (double) this.field167;
            this.field166 = (double) this.field168;
        }
        double var11 = (double) (this.field171 + 1 - arg3);
        this.field179 = ((double) arg0 - this.field176) / var11;
        this.field180 = ((double) arg1 - this.field177) / var11;
        this.field181 = Math.sqrt(this.field180 * this.field180 + this.field179 * this.field179);
        if (!this.field175) {
            this.field182 = -this.field181 * Math.tan((double) this.field172 * 0.02454369D);
        }
        this.field183 = ((double) arg2 - this.field166 - this.field182 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("w.j(II)V")
    public final void method116(int arg0) {
        this.field175 = true;
        this.field176 += (double) arg0 * this.field179;
        this.field177 += (double) arg0 * this.field180;
        this.field166 += this.field183 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field182;
        this.field182 += (double) arg0 * this.field183;
        this.field178 = (int) (Math.atan2(this.field179, this.field180) * 325.949D) + 1024 & 0x7FF;
        this.field185 = (int) (Math.atan2(this.field182, this.field181) * 325.949D) & 0x7FF;
        if (this.field169 == null) {
            return;
        }
        this.field164 += arg0;
        while (true) {
            do {
                do {
                    if (this.field164 <= this.field169.field888[this.field187]) {
                        return;
                    }
                    this.field164 -= this.field169.field888[this.field187];
                    this.field187++;
                } while (this.field187 < this.field169.field891.length);
                this.field187 -= this.field169.field890;
            } while (this.field187 >= 0 && this.field187 < this.field169.field891.length);
            this.field187 = 0;
        }
    }

    @ObfuscatedName("w.c(I)Ldr;")
    public final class112 method13() {
        class35 var1 = class35.method216(this.field174);
        class112 var2 = var1.method731(this.field187);
        if (var2 == null) {
            return null;
        } else {
            var2.method2237(this.field185);
            return var2;
        }
    }
}
