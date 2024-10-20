package deob;

@ObfuscatedName("h")
public final class class10 extends class94 {

    @ObfuscatedName("h.c")
    public int field171;

    @ObfuscatedName("h.q")
    public int field152;

    @ObfuscatedName("h.y")
    public int field161;

    @ObfuscatedName("h.v")
    public int field154;

    @ObfuscatedName("h.g")
    public int field153;

    @ObfuscatedName("h.x")
    public int field156;

    @ObfuscatedName("h.u")
    public int field157;

    @ObfuscatedName("h.l")
    public int field158;

    @ObfuscatedName("h.a")
    public int field159;

    @ObfuscatedName("h.h")
    public int field160;

    @ObfuscatedName("h.t")
    public int field155;

    @ObfuscatedName("h.m")
    public boolean field173 = false;

    @ObfuscatedName("h.s")
    public double field163;

    @ObfuscatedName("h.j")
    public double field168;

    @ObfuscatedName("h.b")
    public double field177;

    @ObfuscatedName("h.n")
    public double field166;

    @ObfuscatedName("h.z")
    public double field167;

    @ObfuscatedName("h.d")
    public double field175;

    @ObfuscatedName("h.f")
    public double field169;

    @ObfuscatedName("h.o")
    public double field165;

    @ObfuscatedName("h.r")
    public int field162;

    @ObfuscatedName("h.k")
    public int field172;

    @ObfuscatedName("h.w")
    public class34 field151;

    @ObfuscatedName("h.e")
    public int field174 = 0;

    @ObfuscatedName("h.p")
    public int field164 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field171 = arg0;
        this.field152 = arg1;
        this.field161 = arg2;
        this.field154 = arg3;
        this.field153 = arg4;
        this.field157 = arg5;
        this.field158 = arg6;
        this.field159 = arg7;
        this.field160 = arg8;
        this.field155 = arg9;
        this.field156 = arg10;
        this.field173 = false;
        int var12 = class35.method743(this.field171).field926;
        if (var12 == -1) {
            this.field151 = null;
        } else {
            this.field151 = Statics.method1425(var12);
        }
    }

    @ObfuscatedName("h.c(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field173) {
            double var5 = (double) (arg0 - this.field161);
            double var7 = (double) (arg1 - this.field154);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field163 = (double) this.field160 * var5 / var9 + (double) this.field161;
            this.field168 = (double) this.field160 * var7 / var9 + (double) this.field154;
            this.field177 = (double) this.field153;
        }
        double var11 = (double) (this.field158 + 1 - arg3);
        this.field166 = ((double) arg0 - this.field163) / var11;
        this.field167 = ((double) arg1 - this.field168) / var11;
        this.field175 = Math.sqrt(this.field167 * this.field167 + this.field166 * this.field166);
        if (!this.field173) {
            this.field169 = -this.field175 * Math.tan((double) this.field159 * 0.02454369D);
        }
        this.field165 = ((double) arg2 - this.field177 - this.field169 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("h.y(II)V")
    public final void method94(int arg0) {
        this.field173 = true;
        this.field163 += (double) arg0 * this.field166;
        this.field168 += (double) arg0 * this.field167;
        this.field177 += this.field165 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field169;
        this.field169 += (double) arg0 * this.field165;
        this.field162 = (int) (Math.atan2(this.field166, this.field167) * 325.949D) + 1024 & 0x7FF;
        this.field172 = (int) (Math.atan2(this.field169, this.field175) * 325.949D) & 0x7FF;
        if (this.field151 == null) {
            return;
        }
        this.field164 += arg0;
        while (true) {
            do {
                do {
                    if (this.field164 <= this.field151.field906[this.field174]) {
                        return;
                    }
                    this.field164 -= this.field151.field906[this.field174];
                    this.field174++;
                } while (this.field174 < this.field151.field899.length);
                this.field174 -= this.field151.field908;
            } while (this.field174 >= 0 && this.field174 < this.field151.field899.length);
            this.field174 = 0;
        }
    }

    @ObfuscatedName("h.q(B)Ldl;")
    public final class112 method13() {
        class35 var1 = class35.method743(this.field171);
        class112 var2 = var1.method720(this.field174);
        if (var2 == null) {
            return null;
        } else {
            var2.method2147(this.field172);
            return var2;
        }
    }
}
