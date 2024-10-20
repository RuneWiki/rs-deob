package deob;

@ObfuscatedName("w")
public final class class10 extends class93 {

    @ObfuscatedName("w.c")
    public int field167;

    @ObfuscatedName("w.j")
    public int field159;

    @ObfuscatedName("w.f")
    public int field160;

    @ObfuscatedName("w.y")
    public int field161;

    @ObfuscatedName("w.x")
    public int field162;

    @ObfuscatedName("w.e")
    public int field163;

    @ObfuscatedName("w.m")
    public int field178;

    @ObfuscatedName("w.s")
    public int field165;

    @ObfuscatedName("w.p")
    public int field171;

    @ObfuscatedName("w.w")
    public int field158;

    @ObfuscatedName("w.r")
    public int field168;

    @ObfuscatedName("w.n")
    public boolean field181 = false;

    @ObfuscatedName("w.b")
    public double field166;

    @ObfuscatedName("w.z")
    public double field183;

    @ObfuscatedName("w.h")
    public double field169;

    @ObfuscatedName("w.q")
    public double field173;

    @ObfuscatedName("w.l")
    public double field174;

    @ObfuscatedName("w.t")
    public double field175;

    @ObfuscatedName("w.g")
    public double field176;

    @ObfuscatedName("w.a")
    public double field177;

    @ObfuscatedName("w.v")
    public int field172;

    @ObfuscatedName("w.i")
    public int field179;

    @ObfuscatedName("w.k")
    public class33 field180;

    @ObfuscatedName("w.o")
    public int field170 = 0;

    @ObfuscatedName("w.d")
    public int field182 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field167 = arg0;
        this.field159 = arg1;
        this.field160 = arg2;
        this.field161 = arg3;
        this.field162 = arg4;
        this.field178 = arg5;
        this.field165 = arg6;
        this.field171 = arg7;
        this.field158 = arg8;
        this.field168 = arg9;
        this.field163 = arg10;
        this.field181 = false;
        int var12 = class34.method135(this.field167).field895;
        if (var12 == -1) {
            this.field180 = null;
        } else {
            this.field180 = class33.method2589(var12);
        }
    }

    @ObfuscatedName("w.c(IIIII)V")
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field181) {
            double var5 = (double) (arg0 - this.field160);
            double var7 = (double) (arg1 - this.field161);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field166 = (double) this.field158 * var5 / var9 + (double) this.field160;
            this.field183 = (double) this.field158 * var7 / var9 + (double) this.field161;
            this.field169 = (double) this.field162;
        }
        double var11 = (double) (this.field165 + 1 - arg3);
        this.field173 = ((double) arg0 - this.field166) / var11;
        this.field174 = ((double) arg1 - this.field183) / var11;
        this.field175 = Math.sqrt(this.field174 * this.field174 + this.field173 * this.field173);
        if (!this.field181) {
            this.field176 = -this.field175 * Math.tan((double) this.field171 * 0.02454369D);
        }
        this.field177 = ((double) arg2 - this.field169 - this.field176 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("w.f(IS)V")
    public final void method104(int arg0) {
        this.field181 = true;
        this.field166 += (double) arg0 * this.field173;
        this.field183 += (double) arg0 * this.field174;
        this.field169 += this.field177 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field176;
        this.field176 += (double) arg0 * this.field177;
        this.field172 = (int) (Math.atan2(this.field173, this.field174) * 325.949D) + 1024 & 0x7FF;
        this.field179 = (int) (Math.atan2(this.field176, this.field175) * 325.949D) & 0x7FF;
        if (this.field180 == null) {
            return;
        }
        this.field182 += arg0;
        while (true) {
            do {
                do {
                    if (this.field182 <= this.field180.field864[this.field170]) {
                        return;
                    }
                    this.field182 -= this.field180.field864[this.field170];
                    this.field170++;
                } while (this.field170 < this.field180.field857.length);
                this.field170 -= this.field180.field866;
            } while (this.field170 >= 0 && this.field170 < this.field180.field857.length);
            this.field170 = 0;
        }
    }

    @ObfuscatedName("w.j(B)Ldf;")
    public final class111 method18() {
        class34 var1 = class34.method135(this.field167);
        class111 var2 = var1.method708(this.field170);
        if (var2 == null) {
            return null;
        } else {
            var2.method2143(this.field179);
            return var2;
        }
    }
}
