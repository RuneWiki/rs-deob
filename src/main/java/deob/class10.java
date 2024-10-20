package deob;

@ObfuscatedName("n")
public final class class10 extends class94 {

    @ObfuscatedName("n.g")
    public int field161;

    @ObfuscatedName("n.h")
    public int field142;

    @ObfuscatedName("n.s")
    public int field143;

    @ObfuscatedName("n.o")
    public int field144;

    @ObfuscatedName("n.p")
    public int field173;

    @ObfuscatedName("n.x")
    public int field146;

    @ObfuscatedName("n.k")
    public int field147;

    @ObfuscatedName("n.r")
    public int field158;

    @ObfuscatedName("n.z")
    public int field149;

    @ObfuscatedName("n.n")
    public int field166;

    @ObfuscatedName("n.j")
    public int field151;

    @ObfuscatedName("n.b")
    public boolean field152 = false;

    @ObfuscatedName("n.t")
    public double field153;

    @ObfuscatedName("n.q")
    public double field172;

    @ObfuscatedName("n.e")
    public double field155;

    @ObfuscatedName("n.l")
    public double field141;

    @ObfuscatedName("n.u")
    public double field162;

    @ObfuscatedName("n.m")
    public double field145;

    @ObfuscatedName("n.a")
    public double field159;

    @ObfuscatedName("n.f")
    public double field160;

    @ObfuscatedName("n.y")
    public int field156;

    @ObfuscatedName("n.v")
    public int field165;

    @ObfuscatedName("n.w")
    public class34 field150;

    @ObfuscatedName("n.d")
    public int field164 = 0;

    @ObfuscatedName("n.i")
    public int field154 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field161 = arg0;
        this.field142 = arg1;
        this.field143 = arg2;
        this.field144 = arg3;
        this.field173 = arg4;
        this.field147 = arg5;
        this.field158 = arg6;
        this.field149 = arg7;
        this.field166 = arg8;
        this.field151 = arg9;
        this.field146 = arg10;
        this.field152 = false;
        int var12 = class35.method3034(this.field161).field912;
        if (var12 == -1) {
            this.field150 = null;
        } else {
            this.field150 = class34.method152(var12);
        }
    }

    @ObfuscatedName("n.g(IIIII)V")
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field152) {
            double var5 = (double) (arg0 - this.field143);
            double var7 = (double) (arg1 - this.field144);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field153 = (double) this.field166 * var5 / var9 + (double) this.field143;
            this.field172 = (double) this.field166 * var7 / var9 + (double) this.field144;
            this.field155 = (double) this.field173;
        }
        double var11 = (double) (this.field158 + 1 - arg3);
        this.field141 = ((double) arg0 - this.field153) / var11;
        this.field162 = ((double) arg1 - this.field172) / var11;
        this.field145 = Math.sqrt(this.field162 * this.field162 + this.field141 * this.field141);
        if (!this.field152) {
            this.field159 = -this.field145 * Math.tan((double) this.field149 * 0.02454369D);
        }
        this.field160 = ((double) arg2 - this.field155 - this.field159 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("n.s(II)V")
    public final void method104(int arg0) {
        this.field152 = true;
        this.field153 += (double) arg0 * this.field141;
        this.field172 += (double) arg0 * this.field162;
        this.field155 += this.field160 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field159;
        this.field159 += (double) arg0 * this.field160;
        this.field156 = (int) (Math.atan2(this.field141, this.field162) * 325.949D) + 1024 & 0x7FF;
        this.field165 = (int) (Math.atan2(this.field159, this.field145) * 325.949D) & 0x7FF;
        if (this.field150 == null) {
            return;
        }
        this.field154 += arg0;
        while (true) {
            do {
                do {
                    if (this.field154 <= this.field150.field901[this.field164]) {
                        return;
                    }
                    this.field154 -= this.field150.field901[this.field164];
                    this.field164++;
                } while (this.field164 < this.field150.field887.length);
                this.field164 -= this.field150.field891;
            } while (this.field164 >= 0 && this.field164 < this.field150.field887.length);
            this.field164 = 0;
        }
    }

    @ObfuscatedName("n.h(I)Ldn;")
    public final class112 method18() {
        class35 var1 = class35.method3034(this.field161);
        class112 var2 = var1.method750(this.field164);
        if (var2 == null) {
            return null;
        } else {
            var2.method2285(this.field165);
            return var2;
        }
    }
}
