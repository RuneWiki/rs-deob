package deob;

@ObfuscatedName("q")
public final class class10 extends class94 {

    @ObfuscatedName("q.a")
    public int field136;

    @ObfuscatedName("q.r")
    public int field131;

    @ObfuscatedName("q.u")
    public int field132;

    @ObfuscatedName("q.t")
    public int field153;

    @ObfuscatedName("q.k")
    public int field148;

    @ObfuscatedName("q.x")
    public int field135;

    @ObfuscatedName("q.v")
    public int field158;

    @ObfuscatedName("q.g")
    public int field133;

    @ObfuscatedName("q.n")
    public int field138;

    @ObfuscatedName("q.q")
    public int field157;

    @ObfuscatedName("q.i")
    public int field139;

    @ObfuscatedName("q.p")
    public boolean field141 = false;

    @ObfuscatedName("q.e")
    public double field140;

    @ObfuscatedName("q.o")
    public double field143;

    @ObfuscatedName("q.j")
    public double field144;

    @ObfuscatedName("q.s")
    public double field145;

    @ObfuscatedName("q.b")
    public double field134;

    @ObfuscatedName("q.c")
    public double field147;

    @ObfuscatedName("q.m")
    public double field142;

    @ObfuscatedName("q.z")
    public double field149;

    @ObfuscatedName("q.h")
    public int field150;

    @ObfuscatedName("q.f")
    public int field151;

    @ObfuscatedName("q.w")
    public class34 field146;

    @ObfuscatedName("q.l")
    public int field137 = 0;

    @ObfuscatedName("q.d")
    public int field154 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field136 = arg0;
        this.field131 = arg1;
        this.field132 = arg2;
        this.field153 = arg3;
        this.field148 = arg4;
        this.field158 = arg5;
        this.field133 = arg6;
        this.field138 = arg7;
        this.field157 = arg8;
        this.field139 = arg9;
        this.field135 = arg10;
        this.field141 = false;
        int var12 = class35.method651(this.field136).field888;
        if (var12 == -1) {
            this.field146 = null;
        } else {
            this.field146 = class34.method30(var12);
        }
    }

    @ObfuscatedName("q.a(IIIII)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field141) {
            double var5 = (double) (arg0 - this.field132);
            double var7 = (double) (arg1 - this.field153);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field140 = (double) this.field157 * var5 / var9 + (double) this.field132;
            this.field143 = (double) this.field157 * var7 / var9 + (double) this.field153;
            this.field144 = (double) this.field148;
        }
        double var11 = (double) (this.field133 + 1 - arg3);
        this.field145 = ((double) arg0 - this.field140) / var11;
        this.field134 = ((double) arg1 - this.field143) / var11;
        this.field147 = Math.sqrt(this.field145 * this.field145 + this.field134 * this.field134);
        if (!this.field141) {
            this.field142 = -this.field147 * Math.tan((double) this.field138 * 0.02454369D);
        }
        this.field149 = ((double) arg2 - this.field144 - this.field142 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("q.u(II)V")
    public final void method85(int arg0) {
        this.field141 = true;
        this.field140 += (double) arg0 * this.field145;
        this.field143 += (double) arg0 * this.field134;
        this.field144 += this.field149 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field142;
        this.field142 += (double) arg0 * this.field149;
        this.field150 = (int) (Math.atan2(this.field145, this.field134) * 325.949D) + 1024 & 0x7FF;
        this.field151 = (int) (Math.atan2(this.field142, this.field147) * 325.949D) & 0x7FF;
        if (this.field146 == null) {
            return;
        }
        this.field154 += arg0;
        while (true) {
            do {
                do {
                    if (this.field154 <= this.field146.field865[this.field137]) {
                        return;
                    }
                    this.field154 -= this.field146.field865[this.field137];
                    this.field137++;
                } while (this.field137 < this.field146.field863.length);
                this.field137 -= this.field146.field867;
            } while (this.field137 >= 0 && this.field137 < this.field146.field863.length);
            this.field137 = 0;
        }
    }

    @ObfuscatedName("q.r(I)Ldw;")
    public final class112 method18() {
        class35 var1 = class35.method651(this.field136);
        class112 var2 = var1.method686(this.field137);
        if (var2 == null) {
            return null;
        } else {
            var2.method2188(this.field151);
            return var2;
        }
    }
}
