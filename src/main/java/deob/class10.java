package deob;

@ObfuscatedName("m")
public final class class10 extends class94 {

    @ObfuscatedName("m.p")
    public int field149;

    @ObfuscatedName("m.l")
    public int field159;

    @ObfuscatedName("m.d")
    public int field140;

    @ObfuscatedName("m.x")
    public int field141;

    @ObfuscatedName("m.o")
    public int field142;

    @ObfuscatedName("m.a")
    public int field138;

    @ObfuscatedName("m.w")
    public int field144;

    @ObfuscatedName("m.i")
    public int field139;

    @ObfuscatedName("m.y")
    public int field146;

    @ObfuscatedName("m.m")
    public int field147;

    @ObfuscatedName("m.u")
    public int field148;

    @ObfuscatedName("m.s")
    public boolean field145 = false;

    @ObfuscatedName("m.e")
    public double field150;

    @ObfuscatedName("m.r")
    public double field160;

    @ObfuscatedName("m.n")
    public double field152;

    @ObfuscatedName("m.g")
    public double field153;

    @ObfuscatedName("m.c")
    public double field154;

    @ObfuscatedName("m.v")
    public double field151;

    @ObfuscatedName("m.b")
    public double field156;

    @ObfuscatedName("m.k")
    public double field157;

    @ObfuscatedName("m.t")
    public int field158;

    @ObfuscatedName("m.f")
    public int field155;

    @ObfuscatedName("m.h")
    public class34 field143;

    @ObfuscatedName("m.j")
    public int field161 = 0;

    @ObfuscatedName("m.q")
    public int field162 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field149 = arg0;
        this.field159 = arg1;
        this.field140 = arg2;
        this.field141 = arg3;
        this.field142 = arg4;
        this.field144 = arg5;
        this.field139 = arg6;
        this.field146 = arg7;
        this.field147 = arg8;
        this.field148 = arg9;
        this.field138 = arg10;
        this.field145 = false;
        int var12 = class35.method144(this.field149).field893;
        if (var12 == -1) {
            this.field143 = null;
        } else {
            this.field143 = class34.method93(var12);
        }
    }

    @ObfuscatedName("m.p(IIIII)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field145) {
            double var5 = (double) (arg0 - this.field140);
            double var7 = (double) (arg1 - this.field141);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field150 = (double) this.field147 * var5 / var9 + (double) this.field140;
            this.field160 = (double) this.field147 * var7 / var9 + (double) this.field141;
            this.field152 = (double) this.field142;
        }
        double var11 = (double) (this.field139 + 1 - arg3);
        this.field153 = ((double) arg0 - this.field150) / var11;
        this.field154 = ((double) arg1 - this.field160) / var11;
        this.field151 = Math.sqrt(this.field154 * this.field154 + this.field153 * this.field153);
        if (!this.field145) {
            this.field156 = -this.field151 * Math.tan((double) this.field146 * 0.02454369D);
        }
        this.field157 = ((double) arg2 - this.field152 - this.field156 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.d(II)V")
    public final void method91(int arg0) {
        this.field145 = true;
        this.field150 += (double) arg0 * this.field153;
        this.field160 += (double) arg0 * this.field154;
        this.field152 += this.field157 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field156;
        this.field156 += (double) arg0 * this.field157;
        this.field158 = (int) (Math.atan2(this.field153, this.field154) * 325.949D) + 1024 & 0x7FF;
        this.field155 = (int) (Math.atan2(this.field156, this.field151) * 325.949D) & 0x7FF;
        if (this.field143 == null) {
            return;
        }
        this.field162 += arg0;
        while (true) {
            do {
                do {
                    if (this.field162 <= this.field143.field871[this.field161]) {
                        return;
                    }
                    this.field162 -= this.field143.field871[this.field161];
                    this.field161++;
                } while (this.field161 < this.field143.field869.length);
                this.field161 -= this.field143.field873;
            } while (this.field161 >= 0 && this.field161 < this.field143.field869.length);
            this.field161 = 0;
        }
    }

    @ObfuscatedName("m.l(I)Ldl;")
    public final class112 method9() {
        class35 var1 = class35.method144(this.field149);
        class112 var2 = var1.method747(this.field161);
        if (var2 == null) {
            return null;
        } else {
            var2.method2318(this.field155);
            return var2;
        }
    }
}
