package deob;

@ObfuscatedName("s")
public final class class10 extends class94 {

    @ObfuscatedName("s.x")
    public int field156;

    @ObfuscatedName("s.p")
    public int field168;

    @ObfuscatedName("s.k")
    public int field144;

    @ObfuscatedName("s.a")
    public int field145;

    @ObfuscatedName("s.q")
    public int field146;

    @ObfuscatedName("s.j")
    public int field147;

    @ObfuscatedName("s.v")
    public int field154;

    @ObfuscatedName("s.w")
    public int field149;

    @ObfuscatedName("s.l")
    public int field150;

    @ObfuscatedName("s.s")
    public int field151;

    @ObfuscatedName("s.n")
    public int field152;

    @ObfuscatedName("s.c")
    public boolean field153 = false;

    @ObfuscatedName("s.h")
    public double field158;

    @ObfuscatedName("s.u")
    public double field155;

    @ObfuscatedName("s.y")
    public double field143;

    @ObfuscatedName("s.b")
    public double field157;

    @ObfuscatedName("s.t")
    public double field148;

    @ObfuscatedName("s.r")
    public double field159;

    @ObfuscatedName("s.g")
    public double field142;

    @ObfuscatedName("s.m")
    public double field161;

    @ObfuscatedName("s.o")
    public int field162;

    @ObfuscatedName("s.e")
    public int field163;

    @ObfuscatedName("s.f")
    public class34 field164;

    @ObfuscatedName("s.i")
    public int field165 = 0;

    @ObfuscatedName("s.d")
    public int field166 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field156 = arg0;
        this.field168 = arg1;
        this.field144 = arg2;
        this.field145 = arg3;
        this.field146 = arg4;
        this.field154 = arg5;
        this.field149 = arg6;
        this.field150 = arg7;
        this.field151 = arg8;
        this.field152 = arg9;
        this.field147 = arg10;
        this.field153 = false;
        int var12 = class35.method1621(this.field156).field875;
        if (var12 == -1) {
            this.field164 = null;
        } else {
            this.field164 = class34.method516(var12);
        }
    }

    @ObfuscatedName("s.x(IIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field153) {
            double var5 = (double) (arg0 - this.field144);
            double var7 = (double) (arg1 - this.field145);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field158 = (double) this.field151 * var5 / var9 + (double) this.field144;
            this.field155 = (double) this.field151 * var7 / var9 + (double) this.field145;
            this.field143 = (double) this.field146;
        }
        double var11 = (double) (this.field149 + 1 - arg3);
        this.field157 = ((double) arg0 - this.field158) / var11;
        this.field148 = ((double) arg1 - this.field155) / var11;
        this.field159 = Math.sqrt(this.field157 * this.field157 + this.field148 * this.field148);
        if (!this.field153) {
            this.field142 = -this.field159 * Math.tan((double) this.field150 * 0.02454369D);
        }
        this.field161 = ((double) arg2 - this.field143 - this.field142 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("s.k(IB)V")
    public final void method93(int arg0) {
        this.field153 = true;
        this.field158 += (double) arg0 * this.field157;
        this.field155 += (double) arg0 * this.field148;
        this.field143 += this.field161 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field142;
        this.field142 += (double) arg0 * this.field161;
        this.field162 = (int) (Math.atan2(this.field157, this.field148) * 325.949D) + 1024 & 0x7FF;
        this.field163 = (int) (Math.atan2(this.field142, this.field159) * 325.949D) & 0x7FF;
        if (this.field164 == null) {
            return;
        }
        this.field166 += arg0;
        while (true) {
            do {
                do {
                    if (this.field166 <= this.field164.field853[this.field165]) {
                        return;
                    }
                    this.field166 -= this.field164.field853[this.field165];
                    this.field165++;
                } while (this.field165 < this.field164.field851.length);
                this.field165 -= this.field164.field864;
            } while (this.field165 >= 0 && this.field165 < this.field164.field851.length);
            this.field165 = 0;
        }
    }

    @ObfuscatedName("s.p(I)Ldi;")
    public final class112 method10() {
        class35 var1 = class35.method1621(this.field156);
        class112 var2 = var1.method717(this.field165);
        if (var2 == null) {
            return null;
        } else {
            var2.method2211(this.field163);
            return var2;
        }
    }
}
