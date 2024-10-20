package deob;

@ObfuscatedName("t")
public final class class10 extends class93 {

    @ObfuscatedName("t.z")
    public int field150;

    @ObfuscatedName("t.h")
    public int field155;

    @ObfuscatedName("t.c")
    public int field175;

    @ObfuscatedName("t.p")
    public int field149;

    @ObfuscatedName("t.i")
    public int field151;

    @ObfuscatedName("t.v")
    public int field163;

    @ObfuscatedName("t.l")
    public int field152;

    @ObfuscatedName("t.m")
    public int field153;

    @ObfuscatedName("t.g")
    public int field154;

    @ObfuscatedName("t.t")
    public int field147;

    @ObfuscatedName("t.o")
    public int field156;

    @ObfuscatedName("t.b")
    public boolean field157 = false;

    @ObfuscatedName("t.d")
    public double field158;

    @ObfuscatedName("t.k")
    public double field159;

    @ObfuscatedName("t.f")
    public double field169;

    @ObfuscatedName("t.e")
    public double field161;

    @ObfuscatedName("t.u")
    public double field162;

    @ObfuscatedName("t.n")
    public double field148;

    @ObfuscatedName("t.q")
    public double field164;

    @ObfuscatedName("t.y")
    public double field165;

    @ObfuscatedName("t.a")
    public int field166;

    @ObfuscatedName("t.r")
    public int field167;

    @ObfuscatedName("t.x")
    public class33 field168;

    @ObfuscatedName("t.w")
    public int field160 = 0;

    @ObfuscatedName("t.j")
    public int field170 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field150 = arg0;
        this.field155 = arg1;
        this.field175 = arg2;
        this.field149 = arg3;
        this.field151 = arg4;
        this.field152 = arg5;
        this.field153 = arg6;
        this.field154 = arg7;
        this.field147 = arg8;
        this.field156 = arg9;
        this.field163 = arg10;
        this.field157 = false;
        int var12 = Statics.method813(this.field150).field904;
        if (var12 == -1) {
            this.field168 = null;
        } else {
            this.field168 = class33.method2674(var12);
        }
    }

    @ObfuscatedName("t.z(IIIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field157) {
            double var5 = (double) (arg0 - this.field175);
            double var7 = (double) (arg1 - this.field149);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field158 = (double) this.field147 * var5 / var9 + (double) this.field175;
            this.field159 = (double) this.field147 * var7 / var9 + (double) this.field149;
            this.field169 = (double) this.field151;
        }
        double var11 = (double) (this.field153 + 1 - arg3);
        this.field161 = ((double) arg0 - this.field158) / var11;
        this.field162 = ((double) arg1 - this.field159) / var11;
        this.field148 = Math.sqrt(this.field162 * this.field162 + this.field161 * this.field161);
        if (!this.field157) {
            this.field164 = -this.field148 * Math.tan((double) this.field154 * 0.02454369D);
        }
        this.field165 = ((double) arg2 - this.field169 - this.field164 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("t.c(II)V")
    public final void method109(int arg0) {
        this.field157 = true;
        this.field158 += (double) arg0 * this.field161;
        this.field159 += (double) arg0 * this.field162;
        this.field169 += this.field165 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field164;
        this.field164 += (double) arg0 * this.field165;
        this.field166 = (int) (Math.atan2(this.field161, this.field162) * 325.949D) + 1024 & 0x7FF;
        this.field167 = (int) (Math.atan2(this.field164, this.field148) * 325.949D) & 0x7FF;
        if (this.field168 == null) {
            return;
        }
        this.field170 += arg0;
        while (true) {
            do {
                do {
                    if (this.field170 <= this.field168.field894[this.field160]) {
                        return;
                    }
                    this.field170 -= this.field168.field894[this.field160];
                    this.field160++;
                } while (this.field160 < this.field168.field884.length);
                this.field160 -= this.field168.field888;
            } while (this.field160 >= 0 && this.field160 < this.field168.field884.length);
            this.field160 = 0;
        }
    }

    @ObfuscatedName("t.h(I)Ldh;")
    public final class111 method15() {
        class34 var1 = Statics.method813(this.field150);
        class111 var2 = var1.method748(this.field160);
        if (var2 == null) {
            return null;
        } else {
            var2.method2260(this.field167);
            return var2;
        }
    }
}
