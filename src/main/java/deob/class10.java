package deob;

@ObfuscatedName("l")
public final class class10 extends class94 {

    @ObfuscatedName("l.i")
    public int field166;

    @ObfuscatedName("l.w")
    public int field176;

    @ObfuscatedName("l.f")
    public int field143;

    @ObfuscatedName("l.e")
    public int field168;

    @ObfuscatedName("l.t")
    public int field158;

    @ObfuscatedName("l.d")
    public int field146;

    @ObfuscatedName("l.p")
    public int field147;

    @ObfuscatedName("l.k")
    public int field148;

    @ObfuscatedName("l.r")
    public int field149;

    @ObfuscatedName("l.l")
    public int field150;

    @ObfuscatedName("l.a")
    public int field151;

    @ObfuscatedName("l.z")
    public boolean field152 = false;

    @ObfuscatedName("l.s")
    public double field171;

    @ObfuscatedName("l.m")
    public double field154;

    @ObfuscatedName("l.u")
    public double field155;

    @ObfuscatedName("l.g")
    public double field163;

    @ObfuscatedName("l.o")
    public double field157;

    @ObfuscatedName("l.v")
    public double field169;

    @ObfuscatedName("l.j")
    public double field159;

    @ObfuscatedName("l.n")
    public double field160;

    @ObfuscatedName("l.q")
    public int field161;

    @ObfuscatedName("l.c")
    public int field153;

    @ObfuscatedName("l.h")
    public class34 field165;

    @ObfuscatedName("l.b")
    public int field164 = 0;

    @ObfuscatedName("l.y")
    public int field173 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field166 = arg0;
        this.field176 = arg1;
        this.field143 = arg2;
        this.field168 = arg3;
        this.field158 = arg4;
        this.field147 = arg5;
        this.field148 = arg6;
        this.field149 = arg7;
        this.field150 = arg8;
        this.field151 = arg9;
        this.field146 = arg10;
        this.field152 = false;
        int var12 = class35.method633(this.field166).field912;
        if (var12 == -1) {
            this.field165 = null;
        } else {
            this.field165 = class34.method235(var12);
        }
    }

    @ObfuscatedName("l.i(IIIIB)V")
    public final void method114(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field152) {
            double var5 = (double) (arg0 - this.field143);
            double var7 = (double) (arg1 - this.field168);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field171 = (double) this.field150 * var5 / var9 + (double) this.field143;
            this.field154 = (double) this.field150 * var7 / var9 + (double) this.field168;
            this.field155 = (double) this.field158;
        }
        double var11 = (double) (this.field148 + 1 - arg3);
        this.field163 = ((double) arg0 - this.field171) / var11;
        this.field157 = ((double) arg1 - this.field154) / var11;
        this.field169 = Math.sqrt(this.field163 * this.field163 + this.field157 * this.field157);
        if (!this.field152) {
            this.field159 = -this.field169 * Math.tan((double) this.field149 * 0.02454369D);
        }
        this.field160 = ((double) arg2 - this.field155 - this.field159 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.f(IB)V")
    public final void method115(int arg0) {
        this.field152 = true;
        this.field171 += (double) arg0 * this.field163;
        this.field154 += (double) arg0 * this.field157;
        this.field155 += this.field160 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field159;
        this.field159 += (double) arg0 * this.field160;
        this.field161 = (int) (Math.atan2(this.field163, this.field157) * 325.949D) + 1024 & 0x7FF;
        this.field153 = (int) (Math.atan2(this.field159, this.field169) * 325.949D) & 0x7FF;
        if (this.field165 == null) {
            return;
        }
        this.field173 += arg0;
        while (true) {
            do {
                do {
                    if (this.field173 <= this.field165.field891[this.field164]) {
                        return;
                    }
                    this.field173 -= this.field165.field891[this.field164];
                    this.field164++;
                } while (this.field164 < this.field165.field889.length);
                this.field164 -= this.field165.field898;
            } while (this.field164 >= 0 && this.field164 < this.field165.field889.length);
            this.field164 = 0;
        }
    }

    @ObfuscatedName("l.w(I)Ldb;")
    public final class112 method17() {
        class35 var1 = class35.method633(this.field166);
        class112 var2 = var1.method743(this.field164);
        if (var2 == null) {
            return null;
        } else {
            var2.method2253(this.field153);
            return var2;
        }
    }
}
