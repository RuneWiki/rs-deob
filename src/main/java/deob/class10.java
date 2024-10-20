package deob;

@ObfuscatedName("p")
public final class class10 extends class94 {

    @ObfuscatedName("p.y")
    public int field141;

    @ObfuscatedName("p.m")
    public int field163;

    @ObfuscatedName("p.d")
    public int field164;

    @ObfuscatedName("p.k")
    public int field142;

    @ObfuscatedName("p.n")
    public int field149;

    @ObfuscatedName("p.s")
    public int field145;

    @ObfuscatedName("p.x")
    public int field146;

    @ObfuscatedName("p.b")
    public int field140;

    @ObfuscatedName("p.j")
    public int field148;

    @ObfuscatedName("p.p")
    public int field160;

    @ObfuscatedName("p.l")
    public int field169;

    @ObfuscatedName("p.i")
    public boolean field151 = false;

    @ObfuscatedName("p.r")
    public double field153;

    @ObfuscatedName("p.o")
    public double field152;

    @ObfuscatedName("p.c")
    public double field154;

    @ObfuscatedName("p.f")
    public double field155;

    @ObfuscatedName("p.a")
    public double field156;

    @ObfuscatedName("p.t")
    public double field157;

    @ObfuscatedName("p.u")
    public double field158;

    @ObfuscatedName("p.z")
    public double field159;

    @ObfuscatedName("p.v")
    public int field143;

    @ObfuscatedName("p.w")
    public int field161;

    @ObfuscatedName("p.h")
    public class34 field144;

    @ObfuscatedName("p.q")
    public int field162 = 0;

    @ObfuscatedName("p.g")
    public int field150 = 0;

    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field141 = arg0;
        this.field163 = arg1;
        this.field164 = arg2;
        this.field142 = arg3;
        this.field149 = arg4;
        this.field146 = arg5;
        this.field140 = arg6;
        this.field148 = arg7;
        this.field160 = arg8;
        this.field169 = arg9;
        this.field145 = arg10;
        this.field151 = false;
        int var12 = class35.method1458(this.field141).field892;
        if (var12 == -1) {
            this.field144 = null;
        } else {
            this.field144 = class34.method540(var12);
        }
    }

    @ObfuscatedName("p.y(IIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field151) {
            double var5 = (double) (arg0 - this.field164);
            double var7 = (double) (arg1 - this.field142);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field153 = (double) this.field160 * var5 / var9 + (double) this.field164;
            this.field152 = (double) this.field160 * var7 / var9 + (double) this.field142;
            this.field154 = (double) this.field149;
        }
        double var11 = (double) (this.field140 + 1 - arg3);
        this.field155 = ((double) arg0 - this.field153) / var11;
        this.field156 = ((double) arg1 - this.field152) / var11;
        this.field157 = Math.sqrt(this.field156 * this.field156 + this.field155 * this.field155);
        if (!this.field151) {
            this.field158 = -this.field157 * Math.tan((double) this.field148 * 0.02454369D);
        }
        this.field159 = ((double) arg2 - this.field154 - this.field158 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("p.d(II)V")
    public final void method93(int arg0) {
        this.field151 = true;
        this.field153 += (double) arg0 * this.field155;
        this.field152 += (double) arg0 * this.field156;
        this.field154 += this.field159 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field158;
        this.field158 += (double) arg0 * this.field159;
        this.field143 = (int) (Math.atan2(this.field155, this.field156) * 325.949D) + 1024 & 0x7FF;
        this.field161 = (int) (Math.atan2(this.field158, this.field157) * 325.949D) & 0x7FF;
        if (this.field144 == null) {
            return;
        }
        this.field150 += arg0;
        while (true) {
            do {
                do {
                    if (this.field150 <= this.field144.field868[this.field162]) {
                        return;
                    }
                    this.field150 -= this.field144.field868[this.field162];
                    this.field162++;
                } while (this.field162 < this.field144.field863.length);
                this.field162 -= this.field144.field870;
            } while (this.field162 >= 0 && this.field162 < this.field144.field863.length);
            this.field162 = 0;
        }
    }

    @ObfuscatedName("p.m(I)Ldw;")
    public final class112 method20() {
        class35 var1 = class35.method1458(this.field141);
        class112 var2 = var1.method760(this.field162);
        if (var2 == null) {
            return null;
        } else {
            var2.method2257(this.field161);
            return var2;
        }
    }
}
