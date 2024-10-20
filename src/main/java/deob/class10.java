package deob;

@ObfuscatedName("k")
public final class class10 extends class94 {

    @ObfuscatedName("k.p")
    public int field168;

    @ObfuscatedName("k.e")
    public int field155;

    @ObfuscatedName("k.a")
    public int field146;

    @ObfuscatedName("k.h")
    public int field147;

    @ObfuscatedName("k.y")
    public int field162;

    @ObfuscatedName("k.j")
    public int field149;

    @ObfuscatedName("k.l")
    public int field150;

    @ObfuscatedName("k.f")
    public int field151;

    @ObfuscatedName("k.n")
    public int field152;

    @ObfuscatedName("k.k")
    public int field153;

    @ObfuscatedName("k.q")
    public int field167;

    @ObfuscatedName("k.w")
    public boolean field154 = false;

    @ObfuscatedName("k.v")
    public double field156;

    @ObfuscatedName("k.z")
    public double field157;

    @ObfuscatedName("k.m")
    public double field171;

    @ObfuscatedName("k.r")
    public double field158;

    @ObfuscatedName("k.u")
    public double field160;

    @ObfuscatedName("k.i")
    public double field161;

    @ObfuscatedName("k.x")
    public double field148;

    @ObfuscatedName("k.s")
    public double field163;

    @ObfuscatedName("k.o")
    public int field164;

    @ObfuscatedName("k.g")
    public int field144;

    @ObfuscatedName("k.d")
    public class34 field166;

    @ObfuscatedName("k.t")
    public int field159 = 0;

    @ObfuscatedName("k.b")
    public int field145 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field168 = arg0;
        this.field155 = arg1;
        this.field146 = arg2;
        this.field147 = arg3;
        this.field162 = arg4;
        this.field150 = arg5;
        this.field151 = arg6;
        this.field152 = arg7;
        this.field153 = arg8;
        this.field167 = arg9;
        this.field149 = arg10;
        this.field154 = false;
        int var12 = class35.method163(this.field168).field891;
        if (var12 == -1) {
            this.field166 = null;
        } else {
            this.field166 = Statics.method1204(var12);
        }
    }

    @ObfuscatedName("k.p(IIIIB)V")
    public final void method114(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field154) {
            double var5 = (double) (arg0 - this.field146);
            double var7 = (double) (arg1 - this.field147);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field156 = (double) this.field153 * var5 / var9 + (double) this.field146;
            this.field157 = (double) this.field153 * var7 / var9 + (double) this.field147;
            this.field171 = (double) this.field162;
        }
        double var11 = (double) (this.field151 + 1 - arg3);
        this.field158 = ((double) arg0 - this.field156) / var11;
        this.field160 = ((double) arg1 - this.field157) / var11;
        this.field161 = Math.sqrt(this.field160 * this.field160 + this.field158 * this.field158);
        if (!this.field154) {
            this.field148 = -this.field161 * Math.tan((double) this.field152 * 0.02454369D);
        }
        this.field163 = ((double) arg2 - this.field171 - this.field148 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("k.a(II)V")
    public final void method113(int arg0) {
        this.field154 = true;
        this.field156 += (double) arg0 * this.field158;
        this.field157 += (double) arg0 * this.field160;
        this.field171 += this.field163 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field148;
        this.field148 += (double) arg0 * this.field163;
        this.field164 = (int) (Math.atan2(this.field158, this.field160) * 325.949D) + 1024 & 0x7FF;
        this.field144 = (int) (Math.atan2(this.field148, this.field161) * 325.949D) & 0x7FF;
        if (this.field166 == null) {
            return;
        }
        this.field145 += arg0;
        while (true) {
            do {
                do {
                    if (this.field145 <= this.field166.field878[this.field159]) {
                        return;
                    }
                    this.field145 -= this.field166.field878[this.field159];
                    this.field159++;
                } while (this.field159 < this.field166.field888.length);
                this.field159 -= this.field166.field876;
            } while (this.field159 >= 0 && this.field159 < this.field166.field888.length);
            this.field159 = 0;
        }
    }

    @ObfuscatedName("k.e(I)Lds;")
    public final class112 method19() {
        class35 var1 = class35.method163(this.field168);
        class112 var2 = var1.method760(this.field159);
        if (var2 == null) {
            return null;
        } else {
            var2.method2290(this.field144);
            return var2;
        }
    }
}
