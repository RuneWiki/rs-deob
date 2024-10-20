package deob;

@ObfuscatedName("t")
public final class class10 extends class94 {

    @ObfuscatedName("t.g")
    public int field151;

    @ObfuscatedName("t.m")
    public int field138;

    @ObfuscatedName("t.v")
    public int field139;

    @ObfuscatedName("t.r")
    public int field140;

    @ObfuscatedName("t.n")
    public int field141;

    @ObfuscatedName("t.i")
    public int field137;

    @ObfuscatedName("t.s")
    public int field143;

    @ObfuscatedName("t.w")
    public int field150;

    @ObfuscatedName("t.d")
    public int field145;

    @ObfuscatedName("t.t")
    public int field156;

    @ObfuscatedName("t.f")
    public int field142;

    @ObfuscatedName("t.b")
    public boolean field148 = false;

    @ObfuscatedName("t.z")
    public double field149;

    @ObfuscatedName("t.l")
    public double field154;

    @ObfuscatedName("t.e")
    public double field158;

    @ObfuscatedName("t.p")
    public double field146;

    @ObfuscatedName("t.o")
    public double field153;

    @ObfuscatedName("t.h")
    public double field164;

    @ObfuscatedName("t.j")
    public double field155;

    @ObfuscatedName("t.x")
    public double field161;

    @ObfuscatedName("t.k")
    public int field157;

    @ObfuscatedName("t.a")
    public int field144;

    @ObfuscatedName("t.y")
    public class34 field159;

    @ObfuscatedName("t.q")
    public int field160 = 0;

    @ObfuscatedName("t.c")
    public int field152 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field151 = arg0;
        this.field138 = arg1;
        this.field139 = arg2;
        this.field140 = arg3;
        this.field141 = arg4;
        this.field143 = arg5;
        this.field150 = arg6;
        this.field145 = arg7;
        this.field156 = arg8;
        this.field142 = arg9;
        this.field137 = arg10;
        this.field148 = false;
        int var12 = class35.method226(this.field151).field893;
        if (var12 == -1) {
            this.field159 = null;
        } else {
            this.field159 = class34.method1536(var12);
        }
    }

    @ObfuscatedName("t.g(IIIII)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field148) {
            double var5 = (double) (arg0 - this.field139);
            double var7 = (double) (arg1 - this.field140);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field149 = (double) this.field156 * var5 / var9 + (double) this.field139;
            this.field154 = (double) this.field156 * var7 / var9 + (double) this.field140;
            this.field158 = (double) this.field141;
        }
        double var11 = (double) (this.field150 + 1 - arg3);
        this.field146 = ((double) arg0 - this.field149) / var11;
        this.field153 = ((double) arg1 - this.field154) / var11;
        this.field164 = Math.sqrt(this.field153 * this.field153 + this.field146 * this.field146);
        if (!this.field148) {
            this.field155 = -this.field164 * Math.tan((double) this.field145 * 0.02454369D);
        }
        this.field161 = ((double) arg2 - this.field158 - this.field155 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("t.v(IB)V")
    public final void method93(int arg0) {
        this.field148 = true;
        this.field149 += (double) arg0 * this.field146;
        this.field154 += (double) arg0 * this.field153;
        this.field158 += this.field161 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field155;
        this.field155 += (double) arg0 * this.field161;
        this.field157 = (int) (Math.atan2(this.field146, this.field153) * 325.949D) + 1024 & 0x7FF;
        this.field144 = (int) (Math.atan2(this.field155, this.field164) * 325.949D) & 0x7FF;
        if (this.field159 == null) {
            return;
        }
        this.field152 += arg0;
        while (true) {
            do {
                do {
                    if (this.field152 <= this.field159.field872[this.field160]) {
                        return;
                    }
                    this.field152 -= this.field159.field872[this.field160];
                    this.field160++;
                } while (this.field160 < this.field159.field870.length);
                this.field160 -= this.field159.field874;
            } while (this.field160 >= 0 && this.field160 < this.field159.field870.length);
            this.field160 = 0;
        }
    }

    @ObfuscatedName("t.m(B)Ldf;")
    public final class112 method30() {
        class35 var1 = class35.method226(this.field151);
        class112 var2 = var1.method738(this.field160);
        if (var2 == null) {
            return null;
        } else {
            var2.method2215(this.field144);
            return var2;
        }
    }
}
