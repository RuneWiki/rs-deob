package deob;

@ObfuscatedName("l")
public final class class10 extends class93 {

    @ObfuscatedName("l.u")
    public int field170;

    @ObfuscatedName("l.k")
    public int field149;

    @ObfuscatedName("l.x")
    public int field150;

    @ObfuscatedName("l.m")
    public int field151;

    @ObfuscatedName("l.n")
    public int field152;

    @ObfuscatedName("l.q")
    public int field148;

    @ObfuscatedName("l.a")
    public int field154;

    @ObfuscatedName("l.g")
    public int field155;

    @ObfuscatedName("l.j")
    public int field156;

    @ObfuscatedName("l.l")
    public int field161;

    @ObfuscatedName("l.w")
    public int field158;

    @ObfuscatedName("l.z")
    public boolean field159 = false;

    @ObfuscatedName("l.e")
    public double field173;

    @ObfuscatedName("l.b")
    public double field168;

    @ObfuscatedName("l.c")
    public double field162;

    @ObfuscatedName("l.d")
    public double field163;

    @ObfuscatedName("l.h")
    public double field160;

    @ObfuscatedName("l.i")
    public double field165;

    @ObfuscatedName("l.v")
    public double field166;

    @ObfuscatedName("l.s")
    public double field167;

    @ObfuscatedName("l.f")
    public int field157;

    @ObfuscatedName("l.y")
    public int field169;

    @ObfuscatedName("l.t")
    public class33 field171;

    @ObfuscatedName("l.r")
    public int field164 = 0;

    @ObfuscatedName("l.p")
    public int field153 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field170 = arg0;
        this.field149 = arg1;
        this.field150 = arg2;
        this.field151 = arg3;
        this.field152 = arg4;
        this.field154 = arg5;
        this.field155 = arg6;
        this.field156 = arg7;
        this.field161 = arg8;
        this.field158 = arg9;
        this.field148 = arg10;
        this.field159 = false;
        int var12 = class34.method203(this.field170).field904;
        if (var12 == -1) {
            this.field171 = null;
        } else {
            this.field171 = Statics.method147(var12);
        }
    }

    @ObfuscatedName("l.u(IIIIB)V")
    public final void method109(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field159) {
            double var5 = (double) (arg0 - this.field150);
            double var7 = (double) (arg1 - this.field151);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field173 = (double) this.field161 * var5 / var9 + (double) this.field150;
            this.field168 = (double) this.field161 * var7 / var9 + (double) this.field151;
            this.field162 = (double) this.field152;
        }
        double var11 = (double) (this.field155 + 1 - arg3);
        this.field163 = ((double) arg0 - this.field173) / var11;
        this.field160 = ((double) arg1 - this.field168) / var11;
        this.field165 = Math.sqrt(this.field163 * this.field163 + this.field160 * this.field160);
        if (!this.field159) {
            this.field166 = -this.field165 * Math.tan((double) this.field156 * 0.02454369D);
        }
        this.field167 = ((double) arg2 - this.field162 - this.field166 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.x(II)V")
    public final void method110(int arg0) {
        this.field159 = true;
        this.field173 += (double) arg0 * this.field163;
        this.field168 += (double) arg0 * this.field160;
        this.field162 += this.field167 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field166;
        this.field166 += (double) arg0 * this.field167;
        this.field157 = (int) (Math.atan2(this.field163, this.field160) * 325.949D) + 1024 & 0x7FF;
        this.field169 = (int) (Math.atan2(this.field166, this.field165) * 325.949D) & 0x7FF;
        if (this.field171 == null) {
            return;
        }
        this.field153 += arg0;
        while (true) {
            do {
                do {
                    if (this.field153 <= this.field171.field878[this.field164]) {
                        return;
                    }
                    this.field153 -= this.field171.field878[this.field164];
                    this.field164++;
                } while (this.field164 < this.field171.field884.length);
                this.field164 -= this.field171.field880;
            } while (this.field164 >= 0 && this.field164 < this.field171.field884.length);
            this.field164 = 0;
        }
    }

    @ObfuscatedName("l.k(B)Ldd;")
    public final class111 method30() {
        class34 var1 = class34.method203(this.field170);
        class111 var2 = var1.method711(this.field164);
        if (var2 == null) {
            return null;
        } else {
            var2.method2246(this.field169);
            return var2;
        }
    }
}
