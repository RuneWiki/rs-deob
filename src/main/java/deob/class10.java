package deob;

@ObfuscatedName("l")
public final class class10 extends class94 {

    @ObfuscatedName("l.b")
    public int field161;

    @ObfuscatedName("l.e")
    public int field152;

    @ObfuscatedName("l.g")
    public int field153;

    @ObfuscatedName("l.o")
    public int field154;

    @ObfuscatedName("l.a")
    public int field155;

    @ObfuscatedName("l.h")
    public int field156;

    @ObfuscatedName("l.j")
    public int field171;

    @ObfuscatedName("l.f")
    public int field158;

    @ObfuscatedName("l.q")
    public int field159;

    @ObfuscatedName("l.l")
    public int field160;

    @ObfuscatedName("l.d")
    public int field151;

    @ObfuscatedName("l.z")
    public boolean field163 = false;

    @ObfuscatedName("l.n")
    public double field172;

    @ObfuscatedName("l.t")
    public double field164;

    @ObfuscatedName("l.w")
    public double field165;

    @ObfuscatedName("l.r")
    public double field166;

    @ObfuscatedName("l.x")
    public double field178;

    @ObfuscatedName("l.v")
    public double field174;

    @ObfuscatedName("l.y")
    public double field169;

    @ObfuscatedName("l.k")
    public double field170;

    @ObfuscatedName("l.p")
    public int field168;

    @ObfuscatedName("l.s")
    public int field167;

    @ObfuscatedName("l.m")
    public class34 field173;

    @ObfuscatedName("l.c")
    public int field180 = 0;

    @ObfuscatedName("l.i")
    public int field175 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field161 = arg0;
        this.field152 = arg1;
        this.field153 = arg2;
        this.field154 = arg3;
        this.field155 = arg4;
        this.field171 = arg5;
        this.field158 = arg6;
        this.field159 = arg7;
        this.field160 = arg8;
        this.field151 = arg9;
        this.field156 = arg10;
        this.field163 = false;
        int var12 = class35.method2850(this.field161).field887;
        if (var12 == -1) {
            this.field173 = null;
        } else {
            this.field173 = class34.method215(var12);
        }
    }

    @ObfuscatedName("l.b(IIIII)V")
    public final void method97(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field163) {
            double var5 = (double) (arg0 - this.field153);
            double var7 = (double) (arg1 - this.field154);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field172 = (double) this.field160 * var5 / var9 + (double) this.field153;
            this.field164 = (double) this.field160 * var7 / var9 + (double) this.field154;
            this.field165 = (double) this.field155;
        }
        double var11 = (double) (this.field158 + 1 - arg3);
        this.field166 = ((double) arg0 - this.field172) / var11;
        this.field178 = ((double) arg1 - this.field164) / var11;
        this.field174 = Math.sqrt(this.field178 * this.field178 + this.field166 * this.field166);
        if (!this.field163) {
            this.field169 = -this.field174 * Math.tan((double) this.field159 * 0.02454369D);
        }
        this.field170 = ((double) arg2 - this.field165 - this.field169 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.g(II)V")
    public final void method95(int arg0) {
        this.field163 = true;
        this.field172 += (double) arg0 * this.field166;
        this.field164 += (double) arg0 * this.field178;
        this.field165 += this.field170 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field169;
        this.field169 += (double) arg0 * this.field170;
        this.field168 = (int) (Math.atan2(this.field166, this.field178) * 325.949D) + 1024 & 0x7FF;
        this.field167 = (int) (Math.atan2(this.field169, this.field174) * 325.949D) & 0x7FF;
        if (this.field173 == null) {
            return;
        }
        this.field175 += arg0;
        while (true) {
            do {
                do {
                    if (this.field175 <= this.field173.field869[this.field180]) {
                        return;
                    }
                    this.field175 -= this.field173.field869[this.field180];
                    this.field180++;
                } while (this.field180 < this.field173.field867.length);
                this.field180 -= this.field173.field874;
            } while (this.field180 >= 0 && this.field180 < this.field173.field867.length);
            this.field180 = 0;
        }
    }

    @ObfuscatedName("l.e(I)Ldp;")
    public final class112 method15() {
        class35 var1 = class35.method2850(this.field161);
        class112 var2 = var1.method741(this.field180);
        if (var2 == null) {
            return null;
        } else {
            var2.method2273(this.field167);
            return var2;
        }
    }
}
