package deob;

@ObfuscatedName("q")
public final class class10 extends class94 {

    @ObfuscatedName("q.a")
    public int field145;

    @ObfuscatedName("q.x")
    public int field149;

    @ObfuscatedName("q.e")
    public int field154;

    @ObfuscatedName("q.r")
    public int field139;

    @ObfuscatedName("q.p")
    public int field140;

    @ObfuscatedName("q.n")
    public int field141;

    @ObfuscatedName("q.o")
    public int field166;

    @ObfuscatedName("q.l")
    public int field143;

    @ObfuscatedName("q.t")
    public int field161;

    @ObfuscatedName("q.q")
    public int field156;

    @ObfuscatedName("q.c")
    public int field146;

    @ObfuscatedName("q.z")
    public boolean field147 = false;

    @ObfuscatedName("q.s")
    public double field148;

    @ObfuscatedName("q.h")
    public double field151;

    @ObfuscatedName("q.f")
    public double field150;

    @ObfuscatedName("q.w")
    public double field142;

    @ObfuscatedName("q.d")
    public double field152;

    @ObfuscatedName("q.y")
    public double field153;

    @ObfuscatedName("q.g")
    public double field136;

    @ObfuscatedName("q.v")
    public double field155;

    @ObfuscatedName("q.b")
    public int field138;

    @ObfuscatedName("q.j")
    public int field157;

    @ObfuscatedName("q.m")
    public class34 field158;

    @ObfuscatedName("q.k")
    public int field159 = 0;

    @ObfuscatedName("q.u")
    public int field160 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field145 = arg0;
        this.field149 = arg1;
        this.field154 = arg2;
        this.field139 = arg3;
        this.field140 = arg4;
        this.field166 = arg5;
        this.field143 = arg6;
        this.field161 = arg7;
        this.field156 = arg8;
        this.field146 = arg9;
        this.field141 = arg10;
        this.field147 = false;
        int var12 = class35.method2175(this.field145).field920;
        if (var12 == -1) {
            this.field158 = null;
        } else {
            this.field158 = class34.method57(var12);
        }
    }

    @ObfuscatedName("q.a(IIIII)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field147) {
            double var5 = (double) (arg0 - this.field154);
            double var7 = (double) (arg1 - this.field139);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field148 = (double) this.field156 * var5 / var9 + (double) this.field154;
            this.field151 = (double) this.field156 * var7 / var9 + (double) this.field139;
            this.field150 = (double) this.field140;
        }
        double var11 = (double) (this.field143 + 1 - arg3);
        this.field142 = ((double) arg0 - this.field148) / var11;
        this.field152 = ((double) arg1 - this.field151) / var11;
        this.field153 = Math.sqrt(this.field152 * this.field152 + this.field142 * this.field142);
        if (!this.field147) {
            this.field136 = -this.field153 * Math.tan((double) this.field161 * 0.02454369D);
        }
        this.field155 = ((double) arg2 - this.field150 - this.field136 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("q.e(IB)V")
    public final void method130(int arg0) {
        this.field147 = true;
        this.field148 += (double) arg0 * this.field142;
        this.field151 += (double) arg0 * this.field152;
        this.field150 += this.field155 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field136;
        this.field136 += (double) arg0 * this.field155;
        this.field138 = (int) (Math.atan2(this.field142, this.field152) * 325.949D) + 1024 & 0x7FF;
        this.field157 = (int) (Math.atan2(this.field136, this.field153) * 325.949D) & 0x7FF;
        if (this.field158 == null) {
            return;
        }
        this.field160 += arg0;
        while (true) {
            do {
                do {
                    if (this.field160 <= this.field158.field900[this.field159]) {
                        return;
                    }
                    this.field160 -= this.field158.field900[this.field159];
                    this.field159++;
                } while (this.field159 < this.field158.field898.length);
                this.field159 -= this.field158.field897;
            } while (this.field159 >= 0 && this.field159 < this.field158.field898.length);
            this.field159 = 0;
        }
    }

    @ObfuscatedName("q.x(B)Ldd;")
    public final class112 method15() {
        class35 var1 = class35.method2175(this.field145);
        class112 var2 = var1.method751(this.field159);
        if (var2 == null) {
            return null;
        } else {
            var2.method2192(this.field157);
            return var2;
        }
    }
}
