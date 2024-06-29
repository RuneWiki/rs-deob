import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class94 {

    @OriginalMember(owner = "client!bd", name = "Bb", descriptor = "Z")
    private boolean field256 = false;

    @OriginalMember(owner = "client!bd", name = "ub", descriptor = "I")
    private int field249 = 0;

    @OriginalMember(owner = "client!bd", name = "zb", descriptor = "I")
    private int field254 = 0;

    @OriginalMember(owner = "client!bd", name = "sb", descriptor = "B")
    private byte field247 = 0;

    @OriginalMember(owner = "client!bd", name = "Zb", descriptor = "I")
    private int field280 = 0;

    @OriginalMember(owner = "client!bd", name = "yb", descriptor = "[I")
    private int[] field253;

    @OriginalMember(owner = "client!bd", name = "rb", descriptor = "[I")
    private int[] field246;

    @OriginalMember(owner = "client!bd", name = "Ob", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client!bd", name = "vb", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client!bd", name = "bc", descriptor = "[I")
    private int[] field282;

    @OriginalMember(owner = "client!bd", name = "Xb", descriptor = "[I")
    private int[] field278;

    @OriginalMember(owner = "client!bd", name = "Pb", descriptor = "[I")
    private int[] field270;

    @OriginalMember(owner = "client!bd", name = "xb", descriptor = "[I")
    private int[] field252;

    @OriginalMember(owner = "client!bd", name = "Sb", descriptor = "[I")
    private int[] field273;

    @OriginalMember(owner = "client!bd", name = "Jb", descriptor = "[I")
    private int[] field264;

    @OriginalMember(owner = "client!bd", name = "Qb", descriptor = "[B")
    private byte[] field271;

    @OriginalMember(owner = "client!bd", name = "Eb", descriptor = "[B")
    private byte[] field259;

    @OriginalMember(owner = "client!bd", name = "Rb", descriptor = "[B")
    private byte[] field272;

    @OriginalMember(owner = "client!bd", name = "Db", descriptor = "[B")
    private byte[] field258;

    @OriginalMember(owner = "client!bd", name = "Wb", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "client!bd", name = "Fb", descriptor = "[S")
    private short[] field260;

    @OriginalMember(owner = "client!bd", name = "Ub", descriptor = "[[I")
    private int[][] field275;

    @OriginalMember(owner = "client!bd", name = "Yb", descriptor = "[[I")
    private int[][] field279;

    @OriginalMember(owner = "client!bd", name = "Ab", descriptor = "[Lqc;")
    private class113[] field255;

    @OriginalMember(owner = "client!bd", name = "Gb", descriptor = "[Lpd;")
    private class108[] field261;

    @OriginalMember(owner = "client!bd", name = "Cb", descriptor = "[Lqc;")
    private class113[] field257;

    @OriginalMember(owner = "client!bd", name = "wb", descriptor = "S")
    public short field251;

    @OriginalMember(owner = "client!bd", name = "Lb", descriptor = "S")
    public short field266;

    @OriginalMember(owner = "client!bd", name = "tb", descriptor = "I")
    private static int field248 = 0;

    @OriginalMember(owner = "client!bd", name = "Hb", descriptor = "[I")
    private static int[] field262 = new int[10000];

    @OriginalMember(owner = "client!bd", name = "Tb", descriptor = "[I")
    private static int[] field274 = new int[10000];

    @OriginalMember(owner = "client!bd", name = "Nb", descriptor = "[I")
    private static int[] field268 = new int[128];

    @OriginalMember(owner = "client!bd", name = "Ib", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!bd", name = "Kb", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!bd", name = "Mb", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!bd", name = "Vb", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!bd", name = "ac", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lbd;Lbd;IIIZ)V")
    public static final void method125(class12 arg0, class12 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method130();
        arg0.method139();
        arg1.method130();
        arg1.method139();
        ++field248;
        int var6 = 0;
        int[] var7 = arg1.field253;
        int var8 = arg1.field249;
        for (int var9 = 0; var9 < arg0.field249; ++var9) {
            class113 var12 = arg0.field255[var9];
            if (var12.field2532 != 0) {
                int var13 = arg0.field246[var9] - arg3;
                if (var13 <= arg1.field263) {
                    int var14 = arg0.field253[var9] - arg2;
                    if (var14 >= arg1.field265 && var14 <= arg1.field276) {
                        int var15 = arg0.field269[var9] - arg4;
                        if (var15 >= arg1.field281 && var15 <= arg1.field267) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class113 var17 = arg1.field255[var16];
                                if (var7[var16] == var14 && arg1.field269[var16] == var15 && arg1.field246[var16] == var13 && var17.field2532 != 0) {
                                    if (arg0.field257 == null) {
                                        arg0.field257 = new class113[arg0.field249];
                                    }
                                    if (arg1.field257 == null) {
                                        arg1.field257 = new class113[var8];
                                    }
                                    class113 var18 = arg0.field257[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field257[var9] = new class113(var12);
                                    }
                                    class113 var19 = arg1.field257[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field257[var16] = new class113(var17);
                                    }
                                    var18.field2538 += var17.field2538;
                                    var18.field2521 += var17.field2521;
                                    var18.field2530 += var17.field2530;
                                    var18.field2532 += var17.field2532;
                                    var19.field2538 += var12.field2538;
                                    var19.field2521 += var12.field2521;
                                    var19.field2530 += var12.field2530;
                                    var19.field2532 += var12.field2532;
                                    ++var6;
                                    field274[var9] = field248;
                                    field262[var16] = field248;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field280; ++var10) {
                if (field274[arg0.field250[var10]] == field248 && field274[arg0.field282[var10]] == field248 && field274[arg0.field278[var10]] == field248) {
                    if (arg0.field271 == null) {
                        arg0.field271 = new byte[arg0.field280];
                    }
                    arg0.field271[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field280; ++var11) {
                if (field262[arg1.field250[var11]] == field248 && field262[arg1.field282[var11]] == field248 && field262[arg1.field278[var11]] == field248) {
                    if (arg1.field271 == null) {
                        arg1.field271 = new byte[arg1.field280];
                    }
                    arg1.field271[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)Lt;")
    public final class128 method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method139();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class128 var8 = new class128();
        var8.field2889 = new int[this.field280];
        var8.field2881 = new int[this.field280];
        var8.field2866 = new int[this.field280];
        for (int var9 = 0; var9 < this.field280; ++var9) {
            byte var10;
            if (this.field271 == null) {
                var10 = 0;
            } else {
                var10 = this.field271[var9];
            }
            if (this.field259 != null && this.field259[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class108 var17 = this.field261[var9];
                        int var18 = (var17.field2443 * arg4 + var17.field2453 * arg2 + var17.field2448 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field2889[var9] = method127(var18);
                        var8.field2866[var9] = -1;
                    } else {
                        var8.field2866[var9] = -2;
                    }
                } else {
                    class113 var11;
                    if (this.field257 != null && this.field257[this.field250[var9]] != null) {
                        var11 = this.field257[this.field250[var9]];
                    } else {
                        var11 = this.field255[this.field250[var9]];
                    }
                    int var12 = (var11.field2530 * arg4 + var11.field2538 * arg2 + var11.field2521 * arg3) / (var11.field2532 * var7) + arg0;
                    var8.field2889[var9] = method127(var12);
                    class113 var13;
                    if (this.field257 != null && this.field257[this.field282[var9]] != null) {
                        var13 = this.field257[this.field282[var9]];
                    } else {
                        var13 = this.field255[this.field282[var9]];
                    }
                    int var14 = (var13.field2530 * arg4 + var13.field2538 * arg2 + var13.field2521 * arg3) / (var13.field2532 * var7) + arg0;
                    var8.field2881[var9] = method127(var14);
                    class113 var15;
                    if (this.field257 != null && this.field257[this.field278[var9]] != null) {
                        var15 = this.field257[this.field278[var9]];
                    } else {
                        var15 = this.field255[this.field278[var9]];
                    }
                    int var16 = (var15.field2530 * arg4 + var15.field2538 * arg2 + var15.field2521 * arg3) / (var15.field2532 * var7) + arg0;
                    var8.field2866[var9] = method127(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class108 var26 = this.field261[var9];
                    int var27 = (var26.field2443 * arg4 + var26.field2453 * arg2 + var26.field2448 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2889[var9] = method141(this.field260[var9] & 65535, var27);
                    var8.field2866[var9] = -1;
                } else {
                    var8.field2866[var9] = -2;
                }
            } else {
                int var19 = this.field260[var9] & 65535;
                class113 var20;
                if (this.field257 != null && this.field257[this.field250[var9]] != null) {
                    var20 = this.field257[this.field250[var9]];
                } else {
                    var20 = this.field255[this.field250[var9]];
                }
                int var21 = (var20.field2530 * arg4 + var20.field2538 * arg2 + var20.field2521 * arg3) / (var20.field2532 * var7) + arg0;
                var8.field2889[var9] = method141(var19, var21);
                class113 var22;
                if (this.field257 != null && this.field257[this.field282[var9]] != null) {
                    var22 = this.field257[this.field282[var9]];
                } else {
                    var22 = this.field255[this.field282[var9]];
                }
                int var23 = (var22.field2530 * arg4 + var22.field2538 * arg2 + var22.field2521 * arg3) / (var22.field2532 * var7) + arg0;
                var8.field2881[var9] = method141(var19, var23);
                class113 var24;
                if (this.field257 != null && this.field257[this.field278[var9]] != null) {
                    var24 = this.field257[this.field278[var9]];
                } else {
                    var24 = this.field255[this.field278[var9]];
                }
                int var25 = (var24.field2530 * arg4 + var24.field2538 * arg2 + var24.field2521 * arg3) / (var24.field2532 * var7) + arg0;
                var8.field2866[var9] = method141(var19, var25);
            }
        }
        this.method142();
        var8.field2879 = this.field249;
        var8.field2882 = this.field253;
        var8.field2878 = this.field246;
        var8.field2869 = this.field269;
        var8.field2896 = this.field280;
        var8.field2874 = this.field250;
        var8.field2872 = this.field282;
        var8.field2867 = this.field278;
        var8.field2884 = this.field272;
        var8.field2870 = this.field258;
        var8.field2894 = this.field259;
        if (var8.field2894 != null) {
            var8.field2876 = this.field260;
        } else {
            var8.field2876 = null;
        }
        var8.field2877 = this.field247;
        var8.field2893 = this.field254;
        var8.field2883 = this.field270;
        var8.field2890 = this.field252;
        var8.field2888 = this.field273;
        var8.field2868 = this.field275;
        var8.field2873 = this.field279;
        return var8;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)I")
    private static final int method127(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field268[arg0];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
    public final void method128(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field249; ++var4) {
            this.field253[var4] = this.field253[var4] * arg0 / 128;
            this.field246[var4] = this.field246[var4] * arg1 / 128;
            this.field269[var4] = this.field269[var4] * arg2 / 128;
        }
        this.method144();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lbd;")
    public final class12 method129() {
        class12 var1 = new class12();
        if (this.field271 != null) {
            var1.field271 = new byte[this.field280];
            for (int var2 = 0; var2 < this.field280; ++var2) {
                var1.field271[var2] = this.field271[var2];
            }
        }
        var1.field249 = this.field249;
        var1.field280 = this.field280;
        var1.field254 = this.field254;
        var1.field253 = this.field253;
        var1.field246 = this.field246;
        var1.field269 = this.field269;
        var1.field250 = this.field250;
        var1.field282 = this.field282;
        var1.field278 = this.field278;
        var1.field272 = this.field272;
        var1.field258 = this.field258;
        var1.field259 = this.field259;
        var1.field260 = this.field260;
        var1.field247 = this.field247;
        var1.field270 = this.field270;
        var1.field252 = this.field252;
        var1.field273 = this.field273;
        var1.field264 = this.field264;
        var1.field277 = this.field277;
        var1.field275 = this.field275;
        var1.field279 = this.field279;
        var1.field255 = this.field255;
        var1.field261 = this.field261;
        var1.field251 = this.field251;
        var1.field266 = this.field266;
        return var1;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()V")
    private final void method130() {
        if (!this.field256) {
            super.field2153 = 0;
            this.field263 = 0;
            this.field265 = 999999;
            this.field276 = -999999;
            this.field267 = -99999;
            this.field281 = 99999;
            for (int var1 = 0; var1 < this.field249; ++var1) {
                int var2 = this.field253[var1];
                int var3 = this.field246[var1];
                int var4 = this.field269[var1];
                if (var2 < this.field265) {
                    this.field265 = var2;
                }
                if (var2 > this.field276) {
                    this.field276 = var2;
                }
                if (var4 < this.field281) {
                    this.field281 = var4;
                }
                if (var4 > this.field267) {
                    this.field267 = var4;
                }
                if (-var3 > super.field2153) {
                    super.field2153 = -var3;
                }
                if (var3 > this.field263) {
                    this.field263 = var3;
                }
            }
            this.field256 = true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()V")
    public final void method131() {
        for (int var1 = 0; var1 < this.field249; ++var1) {
            this.field269[var1] = -this.field269[var1];
        }
        for (int var2 = 0; var2 < this.field280; ++var2) {
            int var3 = this.field250[var2];
            this.field250[var2] = this.field278[var2];
            this.field278[var2] = var3;
        }
        this.method144();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lbd;I)I")
    private final int method132(class12 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field253[arg1];
        int var5 = arg0.field246[arg1];
        int var6 = arg0.field269[arg1];
        for (int var7 = 0; var7 < this.field249; ++var7) {
            if (this.field253[var7] == var4 && this.field246[var7] == var5 && this.field269[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field253[this.field249] = var4;
            this.field246[this.field249] = var5;
            this.field269[this.field249] = var6;
            if (arg0.field264 != null) {
                this.field264[this.field249] = arg0.field264[arg1];
            }
            var3 = this.field249++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ltb;II)Lbd;")
    public static final class12 method133(class130 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1058(arg1, 119, arg2);
        return var3 == null ? null : new class12(var3);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(SS)V")
    public final void method134(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field280; ++var3) {
            if (this.field260[var3] == arg0) {
                this.field260[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
    public final void method135() {
        for (int var1 = 0; var1 < this.field249; ++var1) {
            int var2 = this.field269[var1];
            this.field269[var1] = this.field253[var1];
            this.field253[var1] = -var2;
        }
        this.method144();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIZ)Lbd;")
    public final class12 method136(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class12 var6;
            if (arg4) {
                var6 = new class12();
                var6.field249 = this.field249;
                var6.field280 = this.field280;
                var6.field254 = this.field254;
                var6.field253 = this.field253;
                var6.field269 = this.field269;
                var6.field250 = this.field250;
                var6.field282 = this.field282;
                var6.field278 = this.field278;
                var6.field271 = this.field271;
                var6.field272 = this.field272;
                var6.field258 = this.field258;
                var6.field259 = this.field259;
                var6.field260 = this.field260;
                var6.field247 = this.field247;
                var6.field270 = this.field270;
                var6.field252 = this.field252;
                var6.field273 = this.field273;
                var6.field264 = this.field264;
                var6.field277 = this.field277;
                var6.field275 = this.field275;
                var6.field279 = this.field279;
                var6.field251 = this.field251;
                var6.field266 = this.field266;
                var6.field246 = new int[var6.field249];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field249; ++var8) {
                int var9 = this.field253[var8];
                int var10 = this.field246[var8];
                int var11 = this.field269[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field246[var8] = var10 + var14 - var7;
            }
            var6.method144();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field249; ++var4) {
            this.field253[var4] += arg0;
            this.field246[var4] += arg1;
            this.field269[var4] += arg2;
        }
        this.method144();
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "()V")
    public final void method138() {
        for (int var1 = 0; var1 < this.field249; ++var1) {
            this.field253[var1] = -this.field253[var1];
            this.field269[var1] = -this.field269[var1];
        }
        this.method144();
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "()V")
    public final void method139() {
        if (this.field255 == null) {
            this.field255 = new class113[this.field249];
            for (int var1 = 0; var1 < this.field249; ++var1) {
                this.field255[var1] = new class113();
            }
            for (int var2 = 0; var2 < this.field280; ++var2) {
                int var3 = this.field250[var2];
                int var4 = this.field282[var2];
                int var5 = this.field278[var2];
                int var6 = this.field253[var4] - this.field253[var3];
                int var7 = this.field246[var4] - this.field246[var3];
                int var8 = this.field269[var4] - this.field269[var3];
                int var9 = this.field253[var5] - this.field253[var3];
                int var10 = this.field246[var5] - this.field246[var3];
                int var11 = this.field269[var5] - this.field269[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field271 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field271[var2];
                }
                if (var19 == 0) {
                    class113 var20 = this.field255[var3];
                    var20.field2538 += var16;
                    var20.field2521 += var17;
                    var20.field2530 += var18;
                    ++var20.field2532;
                    class113 var21 = this.field255[var4];
                    var21.field2538 += var16;
                    var21.field2521 += var17;
                    var21.field2530 += var18;
                    ++var21.field2532;
                    class113 var22 = this.field255[var5];
                    var22.field2538 += var16;
                    var22.field2521 += var17;
                    var22.field2530 += var18;
                    ++var22.field2532;
                } else if (var19 == 1) {
                    if (this.field261 == null) {
                        this.field261 = new class108[this.field280];
                    }
                    class108 var23 = this.field261[var2] = new class108();
                    var23.field2453 = var16;
                    var23.field2448 = var17;
                    var23.field2443 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "()V")
    public final void method140() {
        for (int var1 = 0; var1 < this.field249; ++var1) {
            int var2 = this.field253[var1];
            this.field253[var1] = this.field269[var1];
            this.field269[var1] = -var2;
        }
        this.method144();
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
    private static final int method141(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "()V")
    private final void method142() {
        int var10002;
        if (this.field264 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field249; ++var3) {
                int var7 = this.field264[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field275 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field275[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field249) {
                int var6 = this.field264[var5];
                this.field275[var6][var1[var6]++] = var5++;
            }
            this.field264 = null;
        }
        if (this.field277 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field280; ++var10) {
                int var14 = this.field277[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field279 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field279[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field280) {
                int var13 = this.field277[var12];
                this.field279[var13][var8[var13]++] = var12++;
            }
            this.field277 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "()V")
    public static void method143() {
        field274 = null;
        field262 = null;
        field268 = null;
    }

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "()V")
    private final void method144() {
        this.field255 = null;
        this.field257 = null;
        this.field261 = null;
        this.field256 = false;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    private class12() {
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([B)V")
    private class12(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class8 var4 = new class8(arg0);
        class8 var5 = new class8(arg0);
        class8 var6 = new class8(arg0);
        class8 var7 = new class8(arg0);
        class8 var8 = new class8(arg0);
        var4.field182 = arg0.length - 18;
        int var9 = var4.method68(-2);
        int var10 = var4.method68(-2);
        int var11 = var4.method62((byte) 117);
        int var12 = var4.method62((byte) 117);
        int var13 = var4.method62((byte) 111);
        int var14 = var4.method62((byte) 109);
        int var15 = var4.method62((byte) 121);
        int var16 = var4.method62((byte) 99);
        int var17 = var4.method68(-2);
        int var18 = var4.method68(-2);
        int var19 = var4.method68(-2);
        int var20 = var4.method68(-2);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field249 = var9;
        this.field280 = var10;
        this.field254 = var11;
        this.field253 = new int[var9];
        this.field246 = new int[var9];
        this.field269 = new int[var9];
        this.field250 = new int[var10];
        this.field282 = new int[var10];
        this.field278 = new int[var10];
        if (var11 > 0) {
            this.field270 = new int[var11];
            this.field252 = new int[var11];
            this.field273 = new int[var11];
        }
        if (var16 == 1) {
            this.field264 = new int[var9];
        }
        if (var12 == 1) {
            this.field271 = new byte[var10];
            this.field259 = new byte[var10];
        }
        if (var13 == 255) {
            this.field272 = new byte[var10];
        } else {
            this.field247 = (byte) var13;
        }
        if (var14 == 1) {
            this.field258 = new byte[var10];
        }
        if (var15 == 1) {
            this.field277 = new int[var10];
        }
        this.field260 = new short[var10];
        var4.field182 = var21;
        var5.field182 = var36;
        var6.field182 = var38;
        var7.field182 = var40;
        var8.field182 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method62((byte) 106);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method61(false);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method61(false);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method61(false);
            }
            this.field253[var46] = var43 + var60;
            this.field246[var46] = var44 + var61;
            this.field269[var46] = var45 + var62;
            var43 = this.field253[var46];
            var44 = this.field246[var46];
            var45 = this.field269[var46];
            if (var16 == 1) {
                this.field264[var46] = var8.method62((byte) 95);
            }
        }
        var4.field182 = var32;
        var5.field182 = var28;
        var6.field182 = var26;
        var7.field182 = var30;
        var8.field182 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field260[var47] = (short) var4.method68(-2);
            if (var12 == 1) {
                int var58 = var5.method62((byte) 104);
                if ((var58 & 1) == 1) {
                    this.field271[var47] = 1;
                    var3 = true;
                } else {
                    this.field271[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field259[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field259[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field272[var47] = var6.method57(117);
            }
            if (var14 == 1) {
                this.field258[var47] = var7.method57(36);
            }
            if (var15 == 1) {
                this.field277[var47] = var8.method62((byte) 111);
            }
        }
        var4.field182 = var25;
        var5.field182 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method62((byte) 121);
            if (var54 == 1) {
                var48 = var4.method61(false) + var51;
                var49 = var4.method61(false) + var48;
                var50 = var4.method61(false) + var49;
                var51 = var50;
                this.field250[var52] = var48;
                this.field282[var52] = var49;
                this.field278[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method61(false) + var51;
                var51 = var50;
                this.field250[var52] = var48;
                this.field282[var52] = var49;
                this.field278[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method61(false) + var51;
                var51 = var50;
                this.field250[var52] = var48;
                this.field282[var52] = var49;
                this.field278[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method61(false) + var51;
                var51 = var50;
                this.field250[var52] = var48;
                this.field282[var52] = var57;
                this.field278[var52] = var50;
            }
        }
        var4.field182 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field270[var53] = var4.method68(-2);
            this.field252[var53] = var4.method68(-2);
            this.field273[var53] = var4.method68(-2);
        }
        if (!var2) {
            this.field259 = null;
        }
        if (!var3) {
            this.field271 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([Lbd;I)V")
    public class12(class12[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field249 = 0;
        this.field280 = 0;
        this.field254 = 0;
        this.field247 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class12 var14 = arg0[var8];
            if (var14 != null) {
                this.field249 += var14.field249;
                this.field280 += var14.field280;
                this.field254 += var14.field254;
                if (var14.field272 != null) {
                    var4 = true;
                } else {
                    if (this.field247 == -1) {
                        this.field247 = var14.field247;
                    }
                    if (this.field247 != var14.field247) {
                        var4 = true;
                    }
                }
                var3 |= var14.field271 != null;
                var5 |= var14.field258 != null;
                var6 |= var14.field277 != null;
                var7 |= var14.field259 != null;
            }
        }
        this.field253 = new int[this.field249];
        this.field246 = new int[this.field249];
        this.field269 = new int[this.field249];
        this.field264 = new int[this.field249];
        this.field250 = new int[this.field280];
        this.field282 = new int[this.field280];
        this.field278 = new int[this.field280];
        if (this.field254 > 0) {
            this.field270 = new int[this.field254];
            this.field252 = new int[this.field254];
            this.field273 = new int[this.field254];
        }
        if (var3) {
            this.field271 = new byte[this.field280];
        }
        if (var4) {
            this.field272 = new byte[this.field280];
        }
        if (var5) {
            this.field258 = new byte[this.field280];
        }
        if (var7) {
            this.field259 = new byte[this.field280];
        }
        if (var6) {
            this.field277 = new int[this.field280];
        }
        this.field260 = new short[this.field280];
        this.field249 = 0;
        this.field280 = 0;
        this.field254 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class12 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field280; ++var12) {
                    if (var3 && var11.field271 != null) {
                        this.field271[this.field280] = var11.field271[var12];
                    }
                    if (var4) {
                        if (var11.field272 != null) {
                            this.field272[this.field280] = var11.field272[var12];
                        } else {
                            this.field272[this.field280] = var11.field247;
                        }
                    }
                    if (var5 && var11.field258 != null) {
                        this.field258[this.field280] = var11.field258[var12];
                    }
                    if (var7) {
                        if (var11.field259 != null && var11.field259[var12] != -1) {
                            this.field259[this.field280] = (byte) (var11.field259[var12] + var9);
                        } else {
                            this.field259[this.field280] = -1;
                        }
                    }
                    if (var6 && var11.field277 != null) {
                        this.field277[this.field280] = var11.field277[var12];
                    }
                    this.field260[this.field280] = var11.field260[var12];
                    this.field250[this.field280] = this.method132(var11, var11.field250[var12]);
                    this.field282[this.field280] = this.method132(var11, var11.field282[var12]);
                    this.field278[this.field280] = this.method132(var11, var11.field278[var12]);
                    ++this.field280;
                }
                for (int var13 = 0; var13 < var11.field254; ++var13) {
                    this.field270[this.field254] = this.method132(var11, var11.field270[var13]);
                    this.field252[this.field254] = this.method132(var11, var11.field252[var13]);
                    this.field273[this.field254] = this.method132(var11, var11.field273[var13]);
                    ++this.field254;
                }
                var9 += var11.field254;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lbd;ZZZ)V")
    public class12(class12 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field249 = arg0.field249;
        this.field280 = arg0.field280;
        this.field254 = arg0.field254;
        if (arg1) {
            this.field253 = arg0.field253;
            this.field246 = arg0.field246;
            this.field269 = arg0.field269;
        } else {
            this.field253 = new int[this.field249];
            this.field246 = new int[this.field249];
            this.field269 = new int[this.field249];
            for (int var5 = 0; var5 < this.field249; ++var5) {
                this.field253[var5] = arg0.field253[var5];
                this.field246[var5] = arg0.field246[var5];
                this.field269[var5] = arg0.field269[var5];
            }
        }
        if (arg2) {
            this.field260 = arg0.field260;
        } else {
            this.field260 = new short[this.field280];
            for (int var6 = 0; var6 < this.field280; ++var6) {
                this.field260[var6] = arg0.field260[var6];
            }
        }
        if (arg3) {
            this.field258 = arg0.field258;
        } else {
            this.field258 = new byte[this.field280];
            if (arg0.field258 == null) {
                for (int var7 = 0; var7 < this.field280; ++var7) {
                    this.field258[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field280; ++var8) {
                    this.field258[var8] = arg0.field258[var8];
                }
            }
        }
        this.field250 = arg0.field250;
        this.field282 = arg0.field282;
        this.field278 = arg0.field278;
        this.field271 = arg0.field271;
        this.field272 = arg0.field272;
        this.field259 = arg0.field259;
        this.field247 = arg0.field247;
        this.field270 = arg0.field270;
        this.field252 = arg0.field252;
        this.field273 = arg0.field273;
        this.field264 = arg0.field264;
        this.field277 = arg0.field277;
        this.field275 = arg0.field275;
        this.field279 = arg0.field279;
        this.field255 = arg0.field255;
        this.field261 = arg0.field261;
        this.field257 = arg0.field257;
        this.field251 = arg0.field251;
        this.field266 = arg0.field266;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field268[var0++] = 255;
        }
        while (var0 < 16) {
            field268[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field268[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field268[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field268[var0++] = var1--;
        }
    }
}
