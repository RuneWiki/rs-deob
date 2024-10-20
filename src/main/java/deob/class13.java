package deob;

@ObfuscatedName("fh")
public class class13 {

    @ObfuscatedName("fh.g")
    public static class2 field199 = new class2(260);

    @ObfuscatedName("fh.d")
    public long field201;

    @ObfuscatedName("fh.b")
    public int[] field196;

    @ObfuscatedName("fh.k")
    public boolean field204;

    @ObfuscatedName("fh.h")
    public int[] field197;

    @ObfuscatedName("fh.w")
    public int field198;

    @ObfuscatedName("fh.t")
    public long field200;

    @ObfuscatedName("fh.x")
    public static final int[] field203 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fh.h(IZI)V")
    public void method159(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field204) {
            return;
        }
        int var3 = this.field196[field203[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class180 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1854) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1854 - 1;
                }
            }
            var4 = class180.method381(var3);
        } while (var4 == null || var4.field2732 || var4.field2726 != arg0 + (this.field204 ? 7 : 0));
        this.field196[field203[arg0]] = var3 + 256;
        this.method184();
    }

    @ObfuscatedName("fh.k(IZB)V")
    public void method160(int arg0, boolean arg1) {
        int var3 = this.field197[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field752[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field752[arg0].length - 1;
            }
        }
        this.field197[arg0] = var3;
        this.method184();
    }

    @ObfuscatedName("fh.t(Ldp;B)V")
    public void method162(class50 arg0) {
        arg0.method666(this.field204 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field196[field203[var2]];
            if (var3 == 0) {
                arg0.method666(-1);
            } else {
                arg0.method666(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method666(this.field197[var4]);
        }
    }

    @ObfuscatedName("fh.f(I)Lcf;")
    public class157 method165() {
        if (this.field198 != -1) {
            return class171.method2388(this.field198).method2956();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field196[var2];
            if (var3 >= 256 && var3 < 512 && !class180.method381(var3 - 256).method3131()) {
                var1 = true;
            }
            if (var3 >= 512 && !class176.method3351(var3 - 512).method3087(this.field204)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class157[] var4 = new class157[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field196[var6];
            if (var7 >= 256 && var7 < 512) {
                class157 var8 = class180.method381(var7 - 256).method3130();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class157 var9 = class176.method3351(var7 - 512).method3059(this.field204);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class157 var10 = new class157(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field197[var11] < Statics.field752[var11].length) {
                var10.method2701(Statics.field202[var11], Statics.field752[var11][this.field197[var11]]);
            }
            if (this.field197[var11] < Statics.field1221[var11].length) {
                var10.method2701(Statics.field498[var11], Statics.field1221[var11][this.field197[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fh.s(I)I")
    public int method173() {
        return this.field198 == -1 ? (this.field196[11] << 5) + (this.field196[8] << 10) + (this.field196[0] << 15) + (this.field197[0] << 25) + (this.field197[4] << 20) + this.field196[1] : 305419896 + class171.method2388(this.field198).field2532;
    }

    @ObfuscatedName("fh.l(Lai;ILai;IB)Ldu;")
    public class27 method174(class173 arg0, int arg1, class173 arg2, int arg3) {
        if (this.field198 != -1) {
            return class171.method2388(this.field198).method2955(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field200;
        int[] var7 = this.field196;
        if (arg0 != null && (arg0.field2579 >= 0 || arg0.field2580 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field196[var8];
            }
            if (arg0.field2579 >= 0) {
                var5 += (long) (arg0.field2579 - this.field196[5] << 40);
                var7[5] = arg0.field2579;
            }
            if (arg0.field2580 >= 0) {
                var5 += (long) (arg0.field2580 - this.field196[3] << 48);
                var7[3] = arg0.field2580;
            }
        }
        class27 var9 = (class27) field199.method1(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class180.method381(var12 - 256).method3148()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class176.method3351(var12 - 512).method3056(this.field204)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field201 != -1L) {
                    var9 = (class27) field199.method1(this.field201);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class157[] var13 = new class157[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class157 var17 = class180.method381(var16 - 256).method3133();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class157 var18 = class176.method3351(var16 - 512).method3057(this.field204);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class157 var19 = new class157(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field197[var20] < Statics.field752[var20].length) {
                        var19.method2701(Statics.field202[var20], Statics.field752[var20][this.field197[var20]]);
                    }
                    if (this.field197[var20] < Statics.field1221[var20].length) {
                        var19.method2701(Statics.field498[var20], Statics.field1221[var20][this.field197[var20]]);
                    }
                }
                var9 = var19.method2706(64, 850, -30, -50, -30);
                field199.method4(var9, var5);
                this.field201 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class27 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3029(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3006(var9, arg3);
        } else {
            var21 = arg0.method3006(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fh.w(ZB)V")
    public void method175(boolean arg0) {
        if (this.field204 != arg0) {
            this.method182((int[]) null, this.field197, arg0, -1);
        }
    }

    @ObfuscatedName("fh.b([I[IZII)V")
    public void method182(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1854; var6++) {
                    class180 var7 = class180.method381(var6);
                    if (var7 != null && !var7.field2732 && var7.field2726 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field203[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field196 = arg0;
        this.field197 = arg1;
        this.field204 = arg2;
        this.field198 = arg3;
        this.method184();
    }

    @ObfuscatedName("fh.d(I)V")
    public void method184() {
        long var1 = this.field200;
        int var3 = this.field196[5];
        int var4 = this.field196[9];
        this.field196[5] = var4;
        this.field196[9] = var3;
        this.field200 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field200 <<= 0x4;
            if (this.field196[var5] >= 256) {
                this.field200 += (long) (this.field196[var5] - 256);
            }
        }
        if (this.field196[0] >= 256) {
            this.field200 += (long) (this.field196[0] - 256 >> 4);
        }
        if (this.field196[1] >= 256) {
            this.field200 += (long) (this.field196[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field200 <<= 0x3;
            this.field200 += (long) this.field197[var6];
        }
        this.field200 <<= 0x1;
        this.field200 += (long) (this.field204 ? 1 : 0);
        this.field196[5] = var3;
        this.field196[9] = var4;
        if (var1 != 0L && this.field200 != var1) {
            field199.method3(var1);
        }
    }
}
