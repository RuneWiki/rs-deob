package deob;

@ObfuscatedName("w")
public final class class10 extends class93 {

    @ObfuscatedName("w.g")
    public int field171;

    @ObfuscatedName("w.e")
    public int field145;

    @ObfuscatedName("w.n")
    public int field166;

    @ObfuscatedName("w.j")
    public int field147;

    @ObfuscatedName("w.i")
    public int field148;

    @ObfuscatedName("w.o")
    public int field149;

    @ObfuscatedName("w.l")
    public int field150;

    @ObfuscatedName("w.p")
    public int field151;

    @ObfuscatedName("w.t")
    public int field153;

    @ObfuscatedName("w.w")
    public int field167;

    @ObfuscatedName("w.r")
    public int field154;

    @ObfuscatedName("w.a")
    public boolean field155 = false;

    @ObfuscatedName("w.q")
    public double field157;

    @ObfuscatedName("w.z")
    public double field164;

    @ObfuscatedName("w.d")
    public double field158;

    @ObfuscatedName("w.x")
    public double field159;

    @ObfuscatedName("w.s")
    public double field160;

    @ObfuscatedName("w.m")
    public double field156;

    @ObfuscatedName("w.y")
    public double field168;

    @ObfuscatedName("w.b")
    public double field161;

    @ObfuscatedName("w.h")
    public int field162;

    @ObfuscatedName("w.f")
    public int field165;

    @ObfuscatedName("w.v")
    public class33 field152;

    @ObfuscatedName("w.u")
    public int field144 = 0;

    @ObfuscatedName("w.k")
    public int field173 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field171 = arg0;
        this.field145 = arg1;
        this.field166 = arg2;
        this.field147 = arg3;
        this.field148 = arg4;
        this.field150 = arg5;
        this.field151 = arg6;
        this.field153 = arg7;
        this.field167 = arg8;
        this.field154 = arg9;
        this.field149 = arg10;
        this.field155 = false;
        int var12 = class34.method895(this.field171).field894;
        if (var12 == -1) {
            this.field152 = null;
        } else {
            this.field152 = class33.method224(var12);
        }
    }

    @ObfuscatedName("w.g(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field155) {
            double var5 = (double) (arg0 - this.field166);
            double var7 = (double) (arg1 - this.field147);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field157 = (double) this.field167 * var5 / var9 + (double) this.field166;
            this.field164 = (double) this.field167 * var7 / var9 + (double) this.field147;
            this.field158 = (double) this.field148;
        }
        double var11 = (double) (this.field151 + 1 - arg3);
        this.field159 = ((double) arg0 - this.field157) / var11;
        this.field160 = ((double) arg1 - this.field164) / var11;
        this.field156 = Math.sqrt(this.field160 * this.field160 + this.field159 * this.field159);
        if (!this.field155) {
            this.field168 = -this.field156 * Math.tan((double) this.field153 * 0.02454369D);
        }
        this.field161 = ((double) arg2 - this.field158 - this.field168 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("w.n(IB)V")
    public final void method97(int arg0) {
        this.field155 = true;
        this.field157 += (double) arg0 * this.field159;
        this.field164 += (double) arg0 * this.field160;
        this.field158 += this.field161 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field168;
        this.field168 += (double) arg0 * this.field161;
        this.field162 = (int) (Math.atan2(this.field159, this.field160) * 325.949D) + 1024 & 0x7FF;
        this.field165 = (int) (Math.atan2(this.field168, this.field156) * 325.949D) & 0x7FF;
        if (this.field152 == null) {
            return;
        }
        this.field173 += arg0;
        while (true) {
            do {
                do {
                    if (this.field173 <= this.field152.field862[this.field144]) {
                        return;
                    }
                    this.field173 -= this.field152.field862[this.field144];
                    this.field144++;
                } while (this.field144 < this.field152.field863.length);
                this.field144 -= this.field152.field867;
            } while (this.field144 >= 0 && this.field144 < this.field152.field863.length);
            this.field144 = 0;
        }
    }

    @ObfuscatedName("w.e(I)Ldk;")
    public final class111 method19() {
        class34 var1 = class34.method895(this.field171);
        class111 var2 = var1.method749(this.field144);
        if (var2 == null) {
            return null;
        } else {
            var2.method2276(this.field165);
            return var2;
        }
    }
}
