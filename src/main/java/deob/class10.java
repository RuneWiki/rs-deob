package deob;

@ObfuscatedName("l")
public final class class10 extends class94 {

    @ObfuscatedName("l.q")
    public int field168;

    @ObfuscatedName("l.c")
    public int field147;

    @ObfuscatedName("l.p")
    public int field144;

    @ObfuscatedName("l.z")
    public int field142;

    @ObfuscatedName("l.m")
    public int field152;

    @ObfuscatedName("l.k")
    public int field146;

    @ObfuscatedName("l.v")
    public int field163;

    @ObfuscatedName("l.y")
    public int field149;

    @ObfuscatedName("l.d")
    public int field150;

    @ObfuscatedName("l.l")
    public int field143;

    @ObfuscatedName("l.h")
    public int field151;

    @ObfuscatedName("l.b")
    public boolean field153 = false;

    @ObfuscatedName("l.r")
    public double field154;

    @ObfuscatedName("l.t")
    public double field155;

    @ObfuscatedName("l.u")
    public double field156;

    @ObfuscatedName("l.g")
    public double field157;

    @ObfuscatedName("l.e")
    public double field158;

    @ObfuscatedName("l.n")
    public double field145;

    @ObfuscatedName("l.o")
    public double field160;

    @ObfuscatedName("l.a")
    public double field161;

    @ObfuscatedName("l.f")
    public int field162;

    @ObfuscatedName("l.s")
    public int field159;

    @ObfuscatedName("l.w")
    public class34 field164;

    @ObfuscatedName("l.x")
    public int field148 = 0;

    @ObfuscatedName("l.j")
    public int field166 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field168 = arg0;
        this.field147 = arg1;
        this.field144 = arg2;
        this.field142 = arg3;
        this.field152 = arg4;
        this.field163 = arg5;
        this.field149 = arg6;
        this.field150 = arg7;
        this.field143 = arg8;
        this.field151 = arg9;
        this.field146 = arg10;
        this.field153 = false;
        int var12 = class35.method131(this.field168).field906;
        if (var12 == -1) {
            this.field164 = null;
        } else {
            this.field164 = class34.method2178(var12);
        }
    }

    @ObfuscatedName("l.q(IIIIB)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field153) {
            double var5 = (double) (arg0 - this.field144);
            double var7 = (double) (arg1 - this.field142);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field154 = (double) this.field143 * var5 / var9 + (double) this.field144;
            this.field155 = (double) this.field143 * var7 / var9 + (double) this.field142;
            this.field156 = (double) this.field152;
        }
        double var11 = (double) (this.field149 + 1 - arg3);
        this.field157 = ((double) arg0 - this.field154) / var11;
        this.field158 = ((double) arg1 - this.field155) / var11;
        this.field145 = Math.sqrt(this.field158 * this.field158 + this.field157 * this.field157);
        if (!this.field153) {
            this.field160 = -this.field145 * Math.tan((double) this.field150 * 0.02454369D);
        }
        this.field161 = ((double) arg2 - this.field156 - this.field160 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.p(IB)V")
    public final void method90(int arg0) {
        this.field153 = true;
        this.field154 += (double) arg0 * this.field157;
        this.field155 += (double) arg0 * this.field158;
        this.field156 += this.field161 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field160;
        this.field160 += (double) arg0 * this.field161;
        this.field162 = (int) (Math.atan2(this.field157, this.field158) * 325.949D) + 1024 & 0x7FF;
        this.field159 = (int) (Math.atan2(this.field160, this.field145) * 325.949D) & 0x7FF;
        if (this.field164 == null) {
            return;
        }
        this.field166 += arg0;
        while (true) {
            do {
                do {
                    if (this.field166 <= this.field164.field889[this.field148]) {
                        return;
                    }
                    this.field166 -= this.field164.field889[this.field148];
                    this.field148++;
                } while (this.field148 < this.field164.field881.length);
                this.field148 -= this.field164.field885;
            } while (this.field148 >= 0 && this.field148 < this.field164.field881.length);
            this.field148 = 0;
        }
    }

    @ObfuscatedName("l.c(I)Ldn;")
    public final class112 method17() {
        class35 var1 = class35.method131(this.field168);
        class112 var2 = var1.method742(this.field148);
        if (var2 == null) {
            return null;
        } else {
            var2.method2222(this.field159);
            return var2;
        }
    }
}
