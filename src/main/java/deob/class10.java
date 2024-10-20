package deob;

@ObfuscatedName("d")
public final class class10 extends class95 {

    @ObfuscatedName("d.e")
    public int field174;

    @ObfuscatedName("d.i")
    public int field158;

    @ObfuscatedName("d.k")
    public int field159;

    @ObfuscatedName("d.q")
    public int field178;

    @ObfuscatedName("d.j")
    public int field161;

    @ObfuscatedName("d.z")
    public int field179;

    @ObfuscatedName("d.m")
    public int field163;

    @ObfuscatedName("d.w")
    public int field183;

    @ObfuscatedName("d.a")
    public int field160;

    @ObfuscatedName("d.d")
    public int field166;

    @ObfuscatedName("d.u")
    public int field167;

    @ObfuscatedName("d.p")
    public boolean field168 = false;

    @ObfuscatedName("d.t")
    public double field177;

    @ObfuscatedName("d.g")
    public double field170;

    @ObfuscatedName("d.o")
    public double field171;

    @ObfuscatedName("d.x")
    public double field172;

    @ObfuscatedName("d.c")
    public double field173;

    @ObfuscatedName("d.b")
    public double field176;

    @ObfuscatedName("d.f")
    public double field175;

    @ObfuscatedName("d.s")
    public double field157;

    @ObfuscatedName("d.y")
    public int field182;

    @ObfuscatedName("d.r")
    public int field162;

    @ObfuscatedName("d.l")
    public class35 field169;

    @ObfuscatedName("d.n")
    public int field180 = 0;

    @ObfuscatedName("d.h")
    public int field181 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field174 = arg0;
        this.field158 = arg1;
        this.field159 = arg2;
        this.field178 = arg3;
        this.field161 = arg4;
        this.field163 = arg5;
        this.field183 = arg6;
        this.field160 = arg7;
        this.field166 = arg8;
        this.field167 = arg9;
        this.field179 = arg10;
        this.field168 = false;
        int var12 = class36.method867(this.field174).field926;
        if (var12 == -1) {
            this.field169 = null;
        } else {
            this.field169 = class35.method28(var12);
        }
    }

    @ObfuscatedName("d.e(IIIIB)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field168) {
            double var5 = (double) (arg0 - this.field159);
            double var7 = (double) (arg1 - this.field178);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field177 = (double) this.field166 * var5 / var9 + (double) this.field159;
            this.field170 = (double) this.field166 * var7 / var9 + (double) this.field178;
            this.field171 = (double) this.field161;
        }
        double var11 = (double) (this.field183 + 1 - arg3);
        this.field172 = ((double) arg0 - this.field177) / var11;
        this.field173 = ((double) arg1 - this.field170) / var11;
        this.field176 = Math.sqrt(this.field173 * this.field173 + this.field172 * this.field172);
        if (!this.field168) {
            this.field175 = -this.field176 * Math.tan((double) this.field160 * 0.02454369D);
        }
        this.field157 = ((double) arg2 - this.field171 - this.field175 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("d.k(II)V")
    public final void method121(int arg0) {
        this.field168 = true;
        this.field177 += (double) arg0 * this.field172;
        this.field170 += (double) arg0 * this.field173;
        this.field171 += this.field157 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field175;
        this.field175 += (double) arg0 * this.field157;
        this.field182 = (int) (Math.atan2(this.field172, this.field173) * 325.949D) + 1024 & 0x7FF;
        this.field162 = (int) (Math.atan2(this.field175, this.field176) * 325.949D) & 0x7FF;
        if (this.field169 == null) {
            return;
        }
        this.field181 += arg0;
        while (true) {
            do {
                do {
                    if (this.field181 <= this.field169.field902[this.field180]) {
                        return;
                    }
                    this.field181 -= this.field169.field902[this.field180];
                    this.field180++;
                } while (this.field180 < this.field169.field900.length);
                this.field180 -= this.field169.field914;
            } while (this.field180 >= 0 && this.field180 < this.field169.field900.length);
            this.field180 = 0;
        }
    }

    @ObfuscatedName("d.i(B)Ldo;")
    public final class113 method16() {
        class36 var1 = class36.method867(this.field174);
        class113 var2 = var1.method795(this.field180);
        if (var2 == null) {
            return null;
        } else {
            var2.method2290(this.field162);
            return var2;
        }
    }
}
