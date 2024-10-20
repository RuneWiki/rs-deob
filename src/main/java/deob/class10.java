package deob;

@ObfuscatedName("f")
public final class class10 extends class94 {

    @ObfuscatedName("f.p")
    public int field157;

    @ObfuscatedName("f.i")
    public int field162;

    @ObfuscatedName("f.o")
    public int field146;

    @ObfuscatedName("f.n")
    public int field144;

    @ObfuscatedName("f.l")
    public int field148;

    @ObfuscatedName("f.v")
    public int field149;

    @ObfuscatedName("f.g")
    public int field150;

    @ObfuscatedName("f.x")
    public int field151;

    @ObfuscatedName("f.c")
    public int field155;

    @ObfuscatedName("f.f")
    public int field153;

    @ObfuscatedName("f.r")
    public int field154;

    @ObfuscatedName("f.d")
    public boolean field147 = false;

    @ObfuscatedName("f.a")
    public double field156;

    @ObfuscatedName("f.q")
    public double field161;

    @ObfuscatedName("f.u")
    public double field158;

    @ObfuscatedName("f.w")
    public double field159;

    @ObfuscatedName("f.s")
    public double field160;

    @ObfuscatedName("f.e")
    public double field145;

    @ObfuscatedName("f.b")
    public double field166;

    @ObfuscatedName("f.j")
    public double field163;

    @ObfuscatedName("f.h")
    public int field164;

    @ObfuscatedName("f.m")
    public int field165;

    @ObfuscatedName("f.y")
    public class34 field168;

    @ObfuscatedName("f.t")
    public int field167 = 0;

    @ObfuscatedName("f.k")
    public int field172 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field157 = arg0;
        this.field162 = arg1;
        this.field146 = arg2;
        this.field144 = arg3;
        this.field148 = arg4;
        this.field150 = arg5;
        this.field151 = arg6;
        this.field155 = arg7;
        this.field153 = arg8;
        this.field154 = arg9;
        this.field149 = arg10;
        this.field147 = false;
        int var12 = class35.method2756(this.field157).field908;
        if (var12 == -1) {
            this.field168 = null;
        } else {
            this.field168 = class34.method160(var12);
        }
    }

    @ObfuscatedName("f.p(IIIII)V")
    public final void method107(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field147) {
            double var5 = (double) (arg0 - this.field146);
            double var7 = (double) (arg1 - this.field144);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field156 = (double) this.field153 * var5 / var9 + (double) this.field146;
            this.field161 = (double) this.field153 * var7 / var9 + (double) this.field144;
            this.field158 = (double) this.field148;
        }
        double var11 = (double) (this.field151 + 1 - arg3);
        this.field159 = ((double) arg0 - this.field156) / var11;
        this.field160 = ((double) arg1 - this.field161) / var11;
        this.field145 = Math.sqrt(this.field160 * this.field160 + this.field159 * this.field159);
        if (!this.field147) {
            this.field166 = -this.field145 * Math.tan((double) this.field155 * 0.02454369D);
        }
        this.field163 = ((double) arg2 - this.field158 - this.field166 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.o(II)V")
    public final void method108(int arg0) {
        this.field147 = true;
        this.field156 += (double) arg0 * this.field159;
        this.field161 += (double) arg0 * this.field160;
        this.field158 += this.field163 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field166;
        this.field166 += (double) arg0 * this.field163;
        this.field164 = (int) (Math.atan2(this.field159, this.field160) * 325.949D) + 1024 & 0x7FF;
        this.field165 = (int) (Math.atan2(this.field166, this.field145) * 325.949D) & 0x7FF;
        if (this.field168 == null) {
            return;
        }
        this.field172 += arg0;
        while (true) {
            do {
                do {
                    if (this.field172 <= this.field168.field882[this.field167]) {
                        return;
                    }
                    this.field172 -= this.field168.field882[this.field167];
                    this.field167++;
                } while (this.field167 < this.field168.field881.length);
                this.field167 -= this.field168.field885;
            } while (this.field167 >= 0 && this.field167 < this.field168.field881.length);
            this.field167 = 0;
        }
    }

    @ObfuscatedName("f.i(I)Ldj;")
    public final class112 method21() {
        class35 var1 = class35.method2756(this.field157);
        class112 var2 = var1.method780(this.field167);
        if (var2 == null) {
            return null;
        } else {
            var2.method2288(this.field165);
            return var2;
        }
    }
}
