package deob;

@ObfuscatedName("q")
public final class class10 extends class93 {

    @ObfuscatedName("q.j")
    public int field159;

    @ObfuscatedName("q.y")
    public int field162;

    @ObfuscatedName("q.x")
    public int field169;

    @ObfuscatedName("q.z")
    public int field152;

    @ObfuscatedName("q.c")
    public int field153;

    @ObfuscatedName("q.e")
    public int field154;

    @ObfuscatedName("q.s")
    public int field155;

    @ObfuscatedName("q.i")
    public int field176;

    @ObfuscatedName("q.g")
    public int field157;

    @ObfuscatedName("q.q")
    public int field158;

    @ObfuscatedName("q.w")
    public int field156;

    @ObfuscatedName("q.k")
    public boolean field160 = false;

    @ObfuscatedName("q.v")
    public double field161;

    @ObfuscatedName("q.o")
    public double field170;

    @ObfuscatedName("q.m")
    public double field172;

    @ObfuscatedName("q.u")
    public double field164;

    @ObfuscatedName("q.r")
    public double field163;

    @ObfuscatedName("q.d")
    public double field166;

    @ObfuscatedName("q.n")
    public double field167;

    @ObfuscatedName("q.b")
    public double field151;

    @ObfuscatedName("q.p")
    public int field165;

    @ObfuscatedName("q.t")
    public int field149;

    @ObfuscatedName("q.l")
    public class33 field171;

    @ObfuscatedName("q.a")
    public int field168 = 0;

    @ObfuscatedName("q.f")
    public int field173 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field159 = arg0;
        this.field162 = arg1;
        this.field169 = arg2;
        this.field152 = arg3;
        this.field153 = arg4;
        this.field155 = arg5;
        this.field176 = arg6;
        this.field157 = arg7;
        this.field158 = arg8;
        this.field156 = arg9;
        this.field154 = arg10;
        this.field160 = false;
        int var12 = class34.method564(this.field159).field901;
        if (var12 == -1) {
            this.field171 = null;
        } else {
            this.field171 = class33.method2614(var12);
        }
    }

    @ObfuscatedName("q.j(IIIII)V")
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field160) {
            double var5 = (double) (arg0 - this.field169);
            double var7 = (double) (arg1 - this.field152);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field161 = (double) this.field158 * var5 / var9 + (double) this.field169;
            this.field170 = (double) this.field158 * var7 / var9 + (double) this.field152;
            this.field172 = (double) this.field153;
        }
        double var11 = (double) (this.field176 + 1 - arg3);
        this.field164 = ((double) arg0 - this.field161) / var11;
        this.field163 = ((double) arg1 - this.field170) / var11;
        this.field166 = Math.sqrt(this.field164 * this.field164 + this.field163 * this.field163);
        if (!this.field160) {
            this.field167 = -this.field166 * Math.tan((double) this.field157 * 0.02454369D);
        }
        this.field151 = ((double) arg2 - this.field172 - this.field167 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("q.x(II)V")
    public final void method105(int arg0) {
        this.field160 = true;
        this.field161 += (double) arg0 * this.field164;
        this.field170 += (double) arg0 * this.field163;
        this.field172 += this.field151 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field167;
        this.field167 += (double) arg0 * this.field151;
        this.field165 = (int) (Math.atan2(this.field164, this.field163) * 325.949D) + 1024 & 0x7FF;
        this.field149 = (int) (Math.atan2(this.field167, this.field166) * 325.949D) & 0x7FF;
        if (this.field171 == null) {
            return;
        }
        this.field173 += arg0;
        while (true) {
            do {
                do {
                    if (this.field173 <= this.field171.field863[this.field168]) {
                        return;
                    }
                    this.field173 -= this.field171.field863[this.field168];
                    this.field168++;
                } while (this.field168 < this.field171.field861.length);
                this.field168 -= this.field171.field865;
            } while (this.field168 >= 0 && this.field168 < this.field171.field861.length);
            this.field168 = 0;
        }
    }

    @ObfuscatedName("q.y(B)Ldh;")
    public final class111 method13() {
        class34 var1 = class34.method564(this.field159);
        class111 var2 = var1.method719(this.field168);
        if (var2 == null) {
            return null;
        } else {
            var2.method2179(this.field149);
            return var2;
        }
    }
}
