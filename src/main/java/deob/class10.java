package deob;

@ObfuscatedName("m")
public final class class10 extends class94 {

    @ObfuscatedName("m.d")
    public int field145;

    @ObfuscatedName("m.g")
    public int field169;

    @ObfuscatedName("m.a")
    public int field146;

    @ObfuscatedName("m.t")
    public int field147;

    @ObfuscatedName("m.f")
    public int field148;

    @ObfuscatedName("m.c")
    public int field149;

    @ObfuscatedName("m.p")
    public int field174;

    @ObfuscatedName("m.s")
    public int field151;

    @ObfuscatedName("m.k")
    public int field152;

    @ObfuscatedName("m.m")
    public int field153;

    @ObfuscatedName("m.y")
    public int field159;

    @ObfuscatedName("m.b")
    public boolean field167 = false;

    @ObfuscatedName("m.l")
    public double field158;

    @ObfuscatedName("m.x")
    public double field157;

    @ObfuscatedName("m.z")
    public double field166;

    @ObfuscatedName("m.r")
    public double field175;

    @ObfuscatedName("m.h")
    public double field160;

    @ObfuscatedName("m.v")
    public double field161;

    @ObfuscatedName("m.u")
    public double field162;

    @ObfuscatedName("m.i")
    public double field163;

    @ObfuscatedName("m.e")
    public int field164;

    @ObfuscatedName("m.n")
    public int field165;

    @ObfuscatedName("m.q")
    public class34 field150;

    @ObfuscatedName("m.w")
    public int field156 = 0;

    @ObfuscatedName("m.o")
    public int field168 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field145 = arg0;
        this.field169 = arg1;
        this.field146 = arg2;
        this.field147 = arg3;
        this.field148 = arg4;
        this.field174 = arg5;
        this.field151 = arg6;
        this.field152 = arg7;
        this.field153 = arg8;
        this.field159 = arg9;
        this.field149 = arg10;
        this.field167 = false;
        int var12 = class35.method102(this.field145).field896;
        if (var12 == -1) {
            this.field150 = null;
        } else {
            this.field150 = class34.method136(var12);
        }
    }

    @ObfuscatedName("m.d(IIIIB)V")
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field167) {
            double var5 = (double) (arg0 - this.field146);
            double var7 = (double) (arg1 - this.field147);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field158 = (double) this.field153 * var5 / var9 + (double) this.field146;
            this.field157 = (double) this.field153 * var7 / var9 + (double) this.field147;
            this.field166 = (double) this.field148;
        }
        double var11 = (double) (this.field151 + 1 - arg3);
        this.field175 = ((double) arg0 - this.field158) / var11;
        this.field160 = ((double) arg1 - this.field157) / var11;
        this.field161 = Math.sqrt(this.field175 * this.field175 + this.field160 * this.field160);
        if (!this.field167) {
            this.field162 = -this.field161 * Math.tan((double) this.field152 * 0.02454369D);
        }
        this.field163 = ((double) arg2 - this.field166 - this.field162 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.a(IB)V")
    public final void method106(int arg0) {
        this.field167 = true;
        this.field158 += (double) arg0 * this.field175;
        this.field157 += (double) arg0 * this.field160;
        this.field166 += this.field163 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field162;
        this.field162 += (double) arg0 * this.field163;
        this.field164 = (int) (Math.atan2(this.field175, this.field160) * 325.949D) + 1024 & 0x7FF;
        this.field165 = (int) (Math.atan2(this.field162, this.field161) * 325.949D) & 0x7FF;
        if (this.field150 == null) {
            return;
        }
        this.field168 += arg0;
        while (true) {
            do {
                do {
                    if (this.field168 <= this.field150.field877[this.field156]) {
                        return;
                    }
                    this.field168 -= this.field150.field877[this.field156];
                    this.field156++;
                } while (this.field156 < this.field150.field871.length);
                this.field156 -= this.field150.field873;
            } while (this.field156 >= 0 && this.field156 < this.field150.field871.length);
            this.field156 = 0;
        }
    }

    @ObfuscatedName("m.g(I)Ldd;")
    public final class112 method18() {
        class35 var1 = class35.method102(this.field145);
        class112 var2 = var1.method715(this.field156);
        if (var2 == null) {
            return null;
        } else {
            var2.method2199(this.field165);
            return var2;
        }
    }
}
