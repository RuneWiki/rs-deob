package deob;

@ObfuscatedName("z")
public final class class10 extends class94 {

    @ObfuscatedName("z.i")
    public int field165;

    @ObfuscatedName("z.v")
    public int field173;

    @ObfuscatedName("z.m")
    public int field160;

    @ObfuscatedName("z.j")
    public int field166;

    @ObfuscatedName("z.o")
    public int field162;

    @ObfuscatedName("z.l")
    public int field163;

    @ObfuscatedName("z.g")
    public int field174;

    @ObfuscatedName("z.w")
    public int field161;

    @ObfuscatedName("z.c")
    public int field180;

    @ObfuscatedName("z.z")
    public int field185;

    @ObfuscatedName("z.f")
    public int field164;

    @ObfuscatedName("z.a")
    public boolean field169 = false;

    @ObfuscatedName("z.d")
    public double field170;

    @ObfuscatedName("z.e")
    public double field171;

    @ObfuscatedName("z.y")
    public double field179;

    @ObfuscatedName("z.k")
    public double field158;

    @ObfuscatedName("z.h")
    public double field181;

    @ObfuscatedName("z.x")
    public double field175;

    @ObfuscatedName("z.b")
    public double field176;

    @ObfuscatedName("z.n")
    public double field177;

    @ObfuscatedName("z.q")
    public int field178;

    @ObfuscatedName("z.r")
    public int field167;

    @ObfuscatedName("z.u")
    public class34 field168;

    @ObfuscatedName("z.p")
    public int field159 = 0;

    @ObfuscatedName("z.t")
    public int field182 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field165 = arg0;
        this.field173 = arg1;
        this.field160 = arg2;
        this.field166 = arg3;
        this.field162 = arg4;
        this.field174 = arg5;
        this.field161 = arg6;
        this.field180 = arg7;
        this.field185 = arg8;
        this.field164 = arg9;
        this.field163 = arg10;
        this.field169 = false;
        int var12 = class35.method713(this.field165).field919;
        if (var12 == -1) {
            this.field168 = null;
        } else {
            this.field168 = class34.method1443(var12);
        }
    }

    @ObfuscatedName("z.i(IIIII)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field169) {
            double var5 = (double) (arg0 - this.field160);
            double var7 = (double) (arg1 - this.field166);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field170 = (double) this.field185 * var5 / var9 + (double) this.field160;
            this.field171 = (double) this.field185 * var7 / var9 + (double) this.field166;
            this.field179 = (double) this.field162;
        }
        double var11 = (double) (this.field161 + 1 - arg3);
        this.field158 = ((double) arg0 - this.field170) / var11;
        this.field181 = ((double) arg1 - this.field171) / var11;
        this.field175 = Math.sqrt(this.field181 * this.field181 + this.field158 * this.field158);
        if (!this.field169) {
            this.field176 = -this.field175 * Math.tan((double) this.field180 * 0.02454369D);
        }
        this.field177 = ((double) arg2 - this.field179 - this.field176 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("z.m(II)V")
    public final void method93(int arg0) {
        this.field169 = true;
        this.field170 += (double) arg0 * this.field158;
        this.field171 += (double) arg0 * this.field181;
        this.field179 += this.field177 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field176;
        this.field176 += (double) arg0 * this.field177;
        this.field178 = (int) (Math.atan2(this.field158, this.field181) * 325.949D) + 1024 & 0x7FF;
        this.field167 = (int) (Math.atan2(this.field176, this.field175) * 325.949D) & 0x7FF;
        if (this.field168 == null) {
            return;
        }
        this.field182 += arg0;
        while (true) {
            do {
                do {
                    if (this.field182 <= this.field168.field895[this.field159]) {
                        return;
                    }
                    this.field182 -= this.field168.field895[this.field159];
                    this.field159++;
                } while (this.field159 < this.field168.field893.length);
                this.field159 -= this.field168.field906;
            } while (this.field159 >= 0 && this.field159 < this.field168.field893.length);
            this.field159 = 0;
        }
    }

    @ObfuscatedName("z.v(I)Ldl;")
    public final class112 method15() {
        class35 var1 = class35.method713(this.field165);
        class112 var2 = var1.method766(this.field159);
        if (var2 == null) {
            return null;
        } else {
            var2.method2282(this.field167);
            return var2;
        }
    }
}
