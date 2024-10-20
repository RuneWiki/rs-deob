package deob;

@ObfuscatedName("o")
public final class class10 extends class95 {

    @ObfuscatedName("o.i")
    public int field160;

    @ObfuscatedName("o.b")
    public int field143;

    @ObfuscatedName("o.r")
    public int field144;

    @ObfuscatedName("o.l")
    public int field145;

    @ObfuscatedName("o.s")
    public int field146;

    @ObfuscatedName("o.d")
    public int field158;

    @ObfuscatedName("o.e")
    public int field171;

    @ObfuscatedName("o.u")
    public int field149;

    @ObfuscatedName("o.q")
    public int field153;

    @ObfuscatedName("o.o")
    public int field151;

    @ObfuscatedName("o.v")
    public int field152;

    @ObfuscatedName("o.m")
    public boolean field159 = false;

    @ObfuscatedName("o.x")
    public double field148;

    @ObfuscatedName("o.w")
    public double field147;

    @ObfuscatedName("o.p")
    public double field156;

    @ObfuscatedName("o.z")
    public double field157;

    @ObfuscatedName("o.h")
    public double field172;

    @ObfuscatedName("o.a")
    public double field155;

    @ObfuscatedName("o.c")
    public double field154;

    @ObfuscatedName("o.k")
    public double field161;

    @ObfuscatedName("o.n")
    public int field162;

    @ObfuscatedName("o.t")
    public int field163;

    @ObfuscatedName("o.y")
    public class35 field164;

    @ObfuscatedName("o.g")
    public int field173 = 0;

    @ObfuscatedName("o.f")
    public int field166 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field160 = arg0;
        this.field143 = arg1;
        this.field144 = arg2;
        this.field145 = arg3;
        this.field146 = arg4;
        this.field171 = arg5;
        this.field149 = arg6;
        this.field153 = arg7;
        this.field151 = arg8;
        this.field152 = arg9;
        this.field158 = arg10;
        this.field159 = false;
        int var12 = Statics.method623(this.field160).field913;
        if (var12 == -1) {
            this.field164 = null;
        } else {
            this.field164 = class35.method708(var12);
        }
    }

    @ObfuscatedName("o.i(IIIII)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field159) {
            double var5 = (double) (arg0 - this.field144);
            double var7 = (double) (arg1 - this.field145);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field148 = (double) this.field151 * var5 / var9 + (double) this.field144;
            this.field147 = (double) this.field151 * var7 / var9 + (double) this.field145;
            this.field156 = (double) this.field146;
        }
        double var11 = (double) (this.field149 + 1 - arg3);
        this.field157 = ((double) arg0 - this.field148) / var11;
        this.field172 = ((double) arg1 - this.field147) / var11;
        this.field155 = Math.sqrt(this.field172 * this.field172 + this.field157 * this.field157);
        if (!this.field159) {
            this.field154 = -this.field155 * Math.tan((double) this.field153 * 0.02454369D);
        }
        this.field161 = ((double) arg2 - this.field156 - this.field154 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("o.r(IB)V")
    public final void method104(int arg0) {
        this.field159 = true;
        this.field148 += (double) arg0 * this.field157;
        this.field147 += (double) arg0 * this.field172;
        this.field156 += this.field161 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field154;
        this.field154 += (double) arg0 * this.field161;
        this.field162 = (int) (Math.atan2(this.field157, this.field172) * 325.949D) + 1024 & 0x7FF;
        this.field163 = (int) (Math.atan2(this.field154, this.field155) * 325.949D) & 0x7FF;
        if (this.field164 == null) {
            return;
        }
        this.field166 += arg0;
        while (true) {
            do {
                do {
                    if (this.field166 <= this.field164.field890[this.field173]) {
                        return;
                    }
                    this.field166 -= this.field164.field890[this.field173];
                    this.field173++;
                } while (this.field173 < this.field164.field901.length);
                this.field173 -= this.field164.field888;
            } while (this.field173 >= 0 && this.field173 < this.field164.field901.length);
            this.field173 = 0;
        }
    }

    @ObfuscatedName("o.b(I)Ldt;")
    public final class113 method26() {
        class36 var1 = Statics.method623(this.field160);
        class113 var2 = var1.method756(this.field173);
        if (var2 == null) {
            return null;
        } else {
            var2.method2269(this.field163);
            return var2;
        }
    }
}
