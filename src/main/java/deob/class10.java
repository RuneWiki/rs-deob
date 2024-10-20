package deob;

@ObfuscatedName("i")
public final class class10 extends class94 {

    @ObfuscatedName("i.j")
    public int field162;

    @ObfuscatedName("i.f")
    public int field148;

    @ObfuscatedName("i.o")
    public int field147;

    @ObfuscatedName("i.h")
    public int field150;

    @ObfuscatedName("i.u")
    public int field158;

    @ObfuscatedName("i.a")
    public int field152;

    @ObfuscatedName("i.q")
    public int field153;

    @ObfuscatedName("i.t")
    public int field154;

    @ObfuscatedName("i.n")
    public int field167;

    @ObfuscatedName("i.i")
    public int field156;

    @ObfuscatedName("i.c")
    public int field157;

    @ObfuscatedName("i.b")
    public boolean field155 = false;

    @ObfuscatedName("i.m")
    public double field159;

    @ObfuscatedName("i.g")
    public double field160;

    @ObfuscatedName("i.x")
    public double field161;

    @ObfuscatedName("i.r")
    public double field173;

    @ObfuscatedName("i.s")
    public double field163;

    @ObfuscatedName("i.l")
    public double field164;

    @ObfuscatedName("i.k")
    public double field172;

    @ObfuscatedName("i.w")
    public double field166;

    @ObfuscatedName("i.z")
    public int field165;

    @ObfuscatedName("i.p")
    public int field149;

    @ObfuscatedName("i.v")
    public class34 field169;

    @ObfuscatedName("i.d")
    public int field151 = 0;

    @ObfuscatedName("i.e")
    public int field174 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field162 = arg0;
        this.field148 = arg1;
        this.field147 = arg2;
        this.field150 = arg3;
        this.field158 = arg4;
        this.field153 = arg5;
        this.field154 = arg6;
        this.field167 = arg7;
        this.field156 = arg8;
        this.field157 = arg9;
        this.field152 = arg10;
        this.field155 = false;
        int var12 = class35.method113(this.field162).field914;
        if (var12 == -1) {
            this.field169 = null;
        } else {
            this.field169 = class34.method612(var12);
        }
    }

    @ObfuscatedName("i.j(IIIIS)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field155) {
            double var5 = (double) (arg0 - this.field147);
            double var7 = (double) (arg1 - this.field150);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field159 = (double) this.field156 * var5 / var9 + (double) this.field147;
            this.field160 = (double) this.field156 * var7 / var9 + (double) this.field150;
            this.field161 = (double) this.field158;
        }
        double var11 = (double) (this.field154 + 1 - arg3);
        this.field173 = ((double) arg0 - this.field159) / var11;
        this.field163 = ((double) arg1 - this.field160) / var11;
        this.field164 = Math.sqrt(this.field173 * this.field173 + this.field163 * this.field163);
        if (!this.field155) {
            this.field172 = -this.field164 * Math.tan((double) this.field167 * 0.02454369D);
        }
        this.field166 = ((double) arg2 - this.field161 - this.field172 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.o(II)V")
    public final void method106(int arg0) {
        this.field155 = true;
        this.field159 += (double) arg0 * this.field173;
        this.field160 += (double) arg0 * this.field163;
        this.field161 += this.field166 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field172;
        this.field172 += (double) arg0 * this.field166;
        this.field165 = (int) (Math.atan2(this.field173, this.field163) * 325.949D) + 1024 & 0x7FF;
        this.field149 = (int) (Math.atan2(this.field172, this.field164) * 325.949D) & 0x7FF;
        if (this.field169 == null) {
            return;
        }
        this.field174 += arg0;
        while (true) {
            do {
                do {
                    if (this.field174 <= this.field169.field881[this.field151]) {
                        return;
                    }
                    this.field174 -= this.field169.field881[this.field151];
                    this.field151++;
                } while (this.field151 < this.field169.field879.length);
                this.field151 -= this.field169.field884;
            } while (this.field151 >= 0 && this.field151 < this.field169.field879.length);
            this.field151 = 0;
        }
    }

    @ObfuscatedName("i.f(B)Ldo;")
    public final class112 method19() {
        class35 var1 = class35.method113(this.field162);
        class112 var2 = var1.method755(this.field151);
        if (var2 == null) {
            return null;
        } else {
            var2.method2265(this.field149);
            return var2;
        }
    }
}
