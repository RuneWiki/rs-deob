package deob;

@ObfuscatedName("j")
public final class class10 extends class94 {

    @ObfuscatedName("j.l")
    public int field134;

    @ObfuscatedName("j.b")
    public int field158;

    @ObfuscatedName("j.o")
    public int field135;

    @ObfuscatedName("j.w")
    public int field145;

    @ObfuscatedName("j.r")
    public int field137;

    @ObfuscatedName("j.k")
    public int field138;

    @ObfuscatedName("j.z")
    public int field146;

    @ObfuscatedName("j.g")
    public int field140;

    @ObfuscatedName("j.n")
    public int field141;

    @ObfuscatedName("j.j")
    public int field136;

    @ObfuscatedName("j.c")
    public int field143;

    @ObfuscatedName("j.m")
    public boolean field144 = false;

    @ObfuscatedName("j.a")
    public double field139;

    @ObfuscatedName("j.e")
    public double field155;

    @ObfuscatedName("j.q")
    public double field147;

    @ObfuscatedName("j.y")
    public double field148;

    @ObfuscatedName("j.v")
    public double field149;

    @ObfuscatedName("j.s")
    public double field150;

    @ObfuscatedName("j.u")
    public double field142;

    @ObfuscatedName("j.d")
    public double field152;

    @ObfuscatedName("j.i")
    public int field153;

    @ObfuscatedName("j.p")
    public int field154;

    @ObfuscatedName("j.h")
    public class34 field133;

    @ObfuscatedName("j.f")
    public int field151 = 0;

    @ObfuscatedName("j.t")
    public int field157 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field134 = arg0;
        this.field158 = arg1;
        this.field135 = arg2;
        this.field145 = arg3;
        this.field137 = arg4;
        this.field146 = arg5;
        this.field140 = arg6;
        this.field141 = arg7;
        this.field136 = arg8;
        this.field143 = arg9;
        this.field138 = arg10;
        this.field144 = false;
        int var12 = class35.method2114(this.field134).field898;
        if (var12 == -1) {
            this.field133 = null;
        } else {
            this.field133 = class34.method2198(var12);
        }
    }

    @ObfuscatedName("j.l(IIIII)V")
    public final void method109(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field144) {
            double var5 = (double) (arg0 - this.field135);
            double var7 = (double) (arg1 - this.field145);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field139 = (double) this.field136 * var5 / var9 + (double) this.field135;
            this.field155 = (double) this.field136 * var7 / var9 + (double) this.field145;
            this.field147 = (double) this.field137;
        }
        double var11 = (double) (this.field140 + 1 - arg3);
        this.field148 = ((double) arg0 - this.field139) / var11;
        this.field149 = ((double) arg1 - this.field155) / var11;
        this.field150 = Math.sqrt(this.field149 * this.field149 + this.field148 * this.field148);
        if (!this.field144) {
            this.field142 = -this.field150 * Math.tan((double) this.field141 * 0.02454369D);
        }
        this.field152 = ((double) arg2 - this.field147 - this.field142 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("j.o(II)V")
    public final void method113(int arg0) {
        this.field144 = true;
        this.field139 += (double) arg0 * this.field148;
        this.field155 += (double) arg0 * this.field149;
        this.field147 += this.field152 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field142;
        this.field142 += (double) arg0 * this.field152;
        this.field153 = (int) (Math.atan2(this.field148, this.field149) * 325.949D) + 1024 & 0x7FF;
        this.field154 = (int) (Math.atan2(this.field142, this.field150) * 325.949D) & 0x7FF;
        if (this.field133 == null) {
            return;
        }
        this.field157 += arg0;
        while (true) {
            do {
                do {
                    if (this.field157 <= this.field133.field877[this.field151]) {
                        return;
                    }
                    this.field157 -= this.field133.field877[this.field151];
                    this.field151++;
                } while (this.field151 < this.field133.field872.length);
                this.field151 -= this.field133.field876;
            } while (this.field151 >= 0 && this.field151 < this.field133.field872.length);
            this.field151 = 0;
        }
    }

    @ObfuscatedName("j.b(I)Ldt;")
    public final class112 method11() {
        class35 var1 = class35.method2114(this.field134);
        class112 var2 = var1.method742(this.field151);
        if (var2 == null) {
            return null;
        } else {
            var2.method2235(this.field154);
            return var2;
        }
    }
}
