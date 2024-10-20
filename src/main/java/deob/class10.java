package deob;

@ObfuscatedName("o")
public final class class10 extends class94 {

    @ObfuscatedName("o.f")
    public int field162;

    @ObfuscatedName("o.t")
    public int field144;

    @ObfuscatedName("o.n")
    public int field141;

    @ObfuscatedName("o.e")
    public int field142;

    @ObfuscatedName("o.l")
    public int field165;

    @ObfuscatedName("o.d")
    public int field147;

    @ObfuscatedName("o.r")
    public int field145;

    @ObfuscatedName("o.k")
    public int field146;

    @ObfuscatedName("o.u")
    public int field154;

    @ObfuscatedName("o.o")
    public int field148;

    @ObfuscatedName("o.g")
    public int field149;

    @ObfuscatedName("o.s")
    public boolean field150 = false;

    @ObfuscatedName("o.b")
    public double field161;

    @ObfuscatedName("o.v")
    public double field158;

    @ObfuscatedName("o.j")
    public double field153;

    @ObfuscatedName("o.q")
    public double field163;

    @ObfuscatedName("o.a")
    public double field155;

    @ObfuscatedName("o.c")
    public double field156;

    @ObfuscatedName("o.m")
    public double field152;

    @ObfuscatedName("o.z")
    public double field151;

    @ObfuscatedName("o.w")
    public int field159;

    @ObfuscatedName("o.h")
    public int field160;

    @ObfuscatedName("o.y")
    public class34 field140;

    @ObfuscatedName("o.x")
    public int field143 = 0;

    @ObfuscatedName("o.p")
    public int field166 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field162 = arg0;
        this.field144 = arg1;
        this.field141 = arg2;
        this.field142 = arg3;
        this.field165 = arg4;
        this.field145 = arg5;
        this.field146 = arg6;
        this.field154 = arg7;
        this.field148 = arg8;
        this.field149 = arg9;
        this.field147 = arg10;
        this.field150 = false;
        int var12 = class35.method115(this.field162).field900;
        if (var12 == -1) {
            this.field140 = null;
        } else {
            this.field140 = class34.method572(var12);
        }
    }

    @ObfuscatedName("o.f(IIIII)V")
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field150) {
            double var5 = (double) (arg0 - this.field141);
            double var7 = (double) (arg1 - this.field142);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field161 = (double) this.field148 * var5 / var9 + (double) this.field141;
            this.field158 = (double) this.field148 * var7 / var9 + (double) this.field142;
            this.field153 = (double) this.field165;
        }
        double var11 = (double) (this.field146 + 1 - arg3);
        this.field163 = ((double) arg0 - this.field161) / var11;
        this.field155 = ((double) arg1 - this.field158) / var11;
        this.field156 = Math.sqrt(this.field163 * this.field163 + this.field155 * this.field155);
        if (!this.field150) {
            this.field152 = -this.field156 * Math.tan((double) this.field154 * 0.02454369D);
        }
        this.field151 = ((double) arg2 - this.field153 - this.field152 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("o.n(II)V")
    public final void method109(int arg0) {
        this.field150 = true;
        this.field161 += (double) arg0 * this.field163;
        this.field158 += (double) arg0 * this.field155;
        this.field153 += this.field151 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field152;
        this.field152 += (double) arg0 * this.field151;
        this.field159 = (int) (Math.atan2(this.field163, this.field155) * 325.949D) + 1024 & 0x7FF;
        this.field160 = (int) (Math.atan2(this.field152, this.field156) * 325.949D) & 0x7FF;
        if (this.field140 == null) {
            return;
        }
        this.field166 += arg0;
        while (true) {
            do {
                do {
                    if (this.field166 <= this.field140.field887[this.field143]) {
                        return;
                    }
                    this.field166 -= this.field140.field887[this.field143];
                    this.field143++;
                } while (this.field143 < this.field140.field890.length);
                this.field143 -= this.field140.field877;
            } while (this.field143 >= 0 && this.field143 < this.field140.field890.length);
            this.field143 = 0;
        }
    }

    @ObfuscatedName("o.t(I)Ldp;")
    public final class112 method13() {
        class35 var1 = class35.method115(this.field162);
        class112 var2 = var1.method737(this.field143);
        if (var2 == null) {
            return null;
        } else {
            var2.method2248(this.field160);
            return var2;
        }
    }
}
