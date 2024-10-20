package deob;

@ObfuscatedName("i")
public final class class10 extends class94 {

    @ObfuscatedName("i.j")
    public int field160;

    @ObfuscatedName("i.r")
    public int field153;

    @ObfuscatedName("i.v")
    public int field144;

    @ObfuscatedName("i.p")
    public int field145;

    @ObfuscatedName("i.e")
    public int field146;

    @ObfuscatedName("i.d")
    public int field165;

    @ObfuscatedName("i.y")
    public int field148;

    @ObfuscatedName("i.x")
    public int field157;

    @ObfuscatedName("i.t")
    public int field150;

    @ObfuscatedName("i.i")
    public int field151;

    @ObfuscatedName("i.z")
    public int field152;

    @ObfuscatedName("i.o")
    public boolean field142 = false;

    @ObfuscatedName("i.u")
    public double field154;

    @ObfuscatedName("i.f")
    public double field155;

    @ObfuscatedName("i.k")
    public double field156;

    @ObfuscatedName("i.q")
    public double field149;

    @ObfuscatedName("i.a")
    public double field158;

    @ObfuscatedName("i.w")
    public double field159;

    @ObfuscatedName("i.g")
    public double field143;

    @ObfuscatedName("i.l")
    public double field161;

    @ObfuscatedName("i.m")
    public int field147;

    @ObfuscatedName("i.b")
    public int field163;

    @ObfuscatedName("i.h")
    public class34 field162;

    @ObfuscatedName("i.n")
    public int field164 = 0;

    @ObfuscatedName("i.s")
    public int field166 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field160 = arg0;
        this.field153 = arg1;
        this.field144 = arg2;
        this.field145 = arg3;
        this.field146 = arg4;
        this.field148 = arg5;
        this.field157 = arg6;
        this.field150 = arg7;
        this.field151 = arg8;
        this.field152 = arg9;
        this.field165 = arg10;
        this.field142 = false;
        int var12 = class35.method233(this.field160).field900;
        if (var12 == -1) {
            this.field162 = null;
        } else {
            this.field162 = class34.method2349(var12);
        }
    }

    @ObfuscatedName("i.j(IIIII)V")
    public final void method122(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field142) {
            double var5 = (double) (arg0 - this.field144);
            double var7 = (double) (arg1 - this.field145);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field154 = (double) this.field151 * var5 / var9 + (double) this.field144;
            this.field155 = (double) this.field151 * var7 / var9 + (double) this.field145;
            this.field156 = (double) this.field146;
        }
        double var11 = (double) (this.field157 + 1 - arg3);
        this.field149 = ((double) arg0 - this.field154) / var11;
        this.field158 = ((double) arg1 - this.field155) / var11;
        this.field159 = Math.sqrt(this.field158 * this.field158 + this.field149 * this.field149);
        if (!this.field142) {
            this.field143 = -this.field159 * Math.tan((double) this.field150 * 0.02454369D);
        }
        this.field161 = ((double) arg2 - this.field156 - this.field143 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.v(IB)V")
    public final void method132(int arg0) {
        this.field142 = true;
        this.field154 += (double) arg0 * this.field149;
        this.field155 += (double) arg0 * this.field158;
        this.field156 += this.field161 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field143;
        this.field143 += (double) arg0 * this.field161;
        this.field147 = (int) (Math.atan2(this.field149, this.field158) * 325.949D) + 1024 & 0x7FF;
        this.field163 = (int) (Math.atan2(this.field143, this.field159) * 325.949D) & 0x7FF;
        if (this.field162 == null) {
            return;
        }
        this.field166 += arg0;
        while (true) {
            do {
                do {
                    if (this.field166 <= this.field162.field878[this.field164]) {
                        return;
                    }
                    this.field166 -= this.field162.field878[this.field164];
                    this.field164++;
                } while (this.field164 < this.field162.field876.length);
                this.field164 -= this.field162.field880;
            } while (this.field164 >= 0 && this.field164 < this.field162.field876.length);
            this.field164 = 0;
        }
    }

    @ObfuscatedName("i.r(B)Ldt;")
    public final class112 method18() {
        class35 var1 = class35.method233(this.field160);
        class112 var2 = var1.method736(this.field164);
        if (var2 == null) {
            return null;
        } else {
            var2.method2242(this.field163);
            return var2;
        }
    }
}
