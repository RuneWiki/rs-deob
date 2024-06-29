import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class211 extends class48 {

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lwb;")
    private class127 field3174;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    private int field3165;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[[I")
    public int[][] field3169;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    private int field3172;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[[B")
    private byte[][] field3164;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "[[B")
    private byte[][] field3179;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field3160;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    private int field3176;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    private int field3177;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    private int field3182;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[[Lmh;")
    private class104[][] field3166;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[[Lqh;")
    private class217[][] field3171;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[[Ldm;")
    private class278[][] field3168;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "[[Lfk;")
    private class86[][] field3162;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lwb;IIII[[I[[II)V")
    public class211(class127 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field3174 = arg0;
        this.field3165 = arg2;
        this.field3169 = arg5;
        this.field3172 = arg7;
        this.field3170 = 0;
        while (arg7 > 1) {
            ++this.field3170;
            arg7 >>= 1;
        }
        this.field3164 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field3174.field1770 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field3174.field1765 * var18 + this.field3174.field1748 * var17 + this.field3174.field1736 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field3164[var11][var10] = (byte) var20;
            }
        }
        this.field3179 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public final void method198(int arg0, int arg1, int arg2) {
        if (this.field3179[arg0][arg1] < arg2) {
            this.field3179[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lfq;IIIIZ)V")
    public final void method200(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method201(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field3168 == null) {
            this.field3168 = new class278[super.field686][super.field690];
            this.field3166 = new class104[super.field686][super.field690];
        } else if (this.field3171 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && this.field3172 != var20 || var21 != 0 && this.field3172 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class104 var22 = new class104();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1448 = var23;
            var22.field1447 = new short[var23];
            var22.field1453 = new int[var23];
            var22.field1457 = new int[var23];
            var22.field1456 = new int[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1447[var25] = (short) (this.field3164[arg0][arg1] - this.field3179[arg0][arg1]);
                } else if (var30 == 0 && this.field3172 == var31) {
                    var22.field1447[var25] = (short) (this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1]);
                } else if (this.field3172 == var30 && this.field3172 == var31) {
                    var22.field1447[var25] = (short) (this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1]);
                } else if (this.field3172 == var30 && var31 == 0) {
                    var22.field1447[var25] = (short) (this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1]) * var30 + (this.field3164[arg0][arg1] - this.field3179[arg0][arg1]) * (this.field3172 - var30);
                    int var33 = (this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1]) * var30 + (this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1]) * (this.field3172 - var30);
                    var22.field1447[var25] = (short) ((this.field3172 - var31) * var32 + var31 * var33 >> this.field3170 * 2);
                }
                int var34 = (arg0 << this.field3170) + var30;
                int var35 = (arg1 << this.field3170) + var31;
                var22.field1453[var25] = var34;
                var22.field1456[var25] = var35;
                var22.field1457[var25] = this.method204(var34, var35) + (arg3 != null ? arg3[var25] : 0);
                if (var22.field1447[var25] < 2) {
                    var22.field1447[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field3174.field871.method1331(9386, arg11[var28]).field1198) {
                    var26 = true;
                }
            }
            var22.field1446 = new int[var27];
            if (arg10 != null) {
                var22.field1458 = new int[var27];
            }
            var22.field1455 = new short[var27];
            var22.field1454 = new short[var27];
            var22.field1449 = new short[var27];
            if (var26) {
                var22.field1451 = new short[var27];
                var22.field1450 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1446[var22.field1452] = class316.method1949(arg9[var29], (byte) 117);
                    } else {
                        var22.field1446[var22.field1452] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1458[var22.field1452] = class316.method1949(arg10[var29], (byte) -105);
                        } else {
                            var22.field1458[var22.field1452] = -1;
                        }
                    }
                    var22.field1455[var22.field1452] = (short) arg6[var29];
                    var22.field1454[var22.field1452] = (short) arg7[var29];
                    var22.field1449[var22.field1452] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field3174.field871.method1331(9386, arg11[var29]).field1198) {
                            var22.field1451[var22.field1452] = (short) arg11[var29];
                            var22.field1450[var22.field1452] = (short) arg12[var29];
                        } else {
                            var22.field1451[var22.field1452] = -1;
                        }
                    }
                    ++var22.field1452;
                }
            }
            this.field3166[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class278 var36 = new class278();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field4215 = class82.method672(this.field3164[arg0][arg1] - this.field3179[arg0][arg1], class316.method1949(arg10[0], (byte) 119), (byte) -61);
                    if (var37 == -1) {
                        var36.field4212 = (byte) (var36.field4212 | 2);
                    }
                }
                if (this.field3169[arg0 + 1][arg1] == this.field3169[arg0][arg1] && this.field3169[arg0 + 1][arg1 + 1] == this.field3169[arg0][arg1] && this.field3169[arg0][arg1 + 1] == this.field3169[arg0][arg1]) {
                    var36.field4212 = (byte) (var36.field4212 | 1);
                }
                if (var38 != -1 && (var36.field4212 & 2) == 0 && !this.field3174.field871.method1331(9386, var38).field1198) {
                    var36.field4214 = (short) (this.field3164[arg0][arg1] - this.field3179[arg0][arg1]);
                    var36.field4211 = (short) (this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1]);
                    var36.field4213 = (short) (this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1]);
                    var36.field4217 = (short) (this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1]);
                    var36.field4216 = (short) var38;
                } else {
                    short var39 = class316.method1949(var37, (byte) 117);
                    var36.field4214 = (short) class82.method672(this.field3164[arg0][arg1] - this.field3179[arg0][arg1], var39, (byte) -84);
                    var36.field4211 = (short) class82.method672(this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1], var39, (byte) -121);
                    var36.field4213 = (short) class82.method672(this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1], var39, (byte) -125);
                    var36.field4217 = (short) class82.method672(this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1], var39, (byte) -57);
                    var36.field4216 = -1;
                }
                this.field3168[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
    private final boolean method1417(int arg0) {
        if ((this.field3165 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III[[ZZ)V")
    public final void method203(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class62 var6 = this.field3174.field1728;
        this.field3178 = var6.field850;
        this.field3167 = var6.field854;
        this.field3161 = var6.field849;
        this.field3180 = var6.field845;
        this.field3182 = var6.field848;
        this.field3175 = var6.field855;
        this.field3163 = var6.field852;
        this.field3160 = var6.field856;
        this.field3173 = var6.field851;
        this.field3177 = var6.field847;
        this.field3176 = var6.field846;
        this.field3181 = var6.field853;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
    public final void method193(int arg0, int arg1) {
        class344 var3 = this.field3174.method882(Thread.currentThread());
        var3.field5194.field5087 = 0;
        if (this.field3171 != null) {
            this.method1421(arg0, arg1, this.field3174.field1760, var3.field5194, var3.field5215, var3.field5227, var3.field5218);
        } else {
            if (this.field3168 != null) {
                this.method1422(arg0, arg1, var3.field5194, var3.field5215, var3.field5227, var3.field5218);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
    public final int method199(int arg0, int arg1) {
        return this.field3169[arg0][arg1];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lfq;IIIIZ)Z")
    public final boolean method202(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII[[ZLcr;[I[I)V")
    private final void method1418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class339 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5088 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3168[var16][var17] != null) {
                        class278 var18 = this.field3168[var16][var17];
                        if (var18.field4216 != -1 && (var18.field4212 & 2) == 0 && var18.field4215 == -1) {
                            int var19 = this.field3174.method888(var18.field4216);
                            arg8.method2078(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class82.method672(var18.field4213 & 65535, var19, (byte) -60), class82.method672(var18.field4217 & 65535, var19, (byte) -116), class82.method672(var18.field4211 & 65535, var19, (byte) -98));
                            arg8.method2078(var15, var15, var15 - var13, var14, var13 + var14, var14, class82.method672(var18.field4214 & 65535, var19, (byte) -125), class82.method672(var18.field4211 & 65535, var19, (byte) -108), class82.method672(var18.field4217 & 65535, var19, (byte) -102));
                        } else if (var18.field4215 == -1) {
                            arg8.method2078(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4213 & 65535, var18.field4217 & 65535, var18.field4211 & 65535);
                            arg8.method2078(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4214 & 65535, var18.field4211 & 65535, var18.field4217 & 65535);
                        } else {
                            int var20 = var18.field4215;
                            arg8.method2078(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2078(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field3166[var16][var17] != null) {
                        class104 var21 = this.field3166[var16][var17];
                        for (int var22 = 0; var22 < var21.field1448; ++var22) {
                            arg9[var22] = (var21.field1453[var22] - this.field3172 * var16) * var13 / this.field3172 + var14;
                            arg10[var22] = var15 - (var21.field1456[var22] - this.field3172 * var17) * var13 / this.field3172;
                        }
                        for (int var23 = 0; var23 < var21.field1452; ++var23) {
                            short var24 = var21.field1455[var23];
                            short var25 = var21.field1454[var23];
                            short var26 = var21.field1449[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1458 != null && var21.field1458[var23] != -1) {
                                int var33 = var21.field1458[var23];
                                arg8.method2078(var30, var31, var32, var27, var28, var29, class82.method672(var21.field1447[var24], var33, (byte) -116), class82.method672(var21.field1447[var25], var33, (byte) -50), class82.method672(var21.field1447[var26], var33, (byte) -88));
                            } else if (var21.field1451 != null && var21.field1451[var23] != -1) {
                                int var34 = this.field3174.method888(var21.field1451[var23]);
                                arg8.method2078(var30, var31, var32, var27, var28, var29, class82.method672(var21.field1447[var24], var34, (byte) -82), class82.method672(var21.field1447[var25], var34, (byte) -128), class82.method672(var21.field1447[var26], var34, (byte) -62));
                            } else {
                                int var35 = var21.field1446[var23];
                                arg8.method2078(var30, var31, var32, var27, var28, var29, class82.method672(var21.field1447[var24], var35, (byte) -77), class82.method672(var21.field1447[var25], var35, (byte) -79), class82.method672(var21.field1447[var26], var35, (byte) -110));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5088 = true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public final int method204(int arg0, int arg1) {
        int var3 = arg0 >> this.field3170;
        int var4 = arg1 >> this.field3170;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field686 - 1 && var4 <= super.field690 - 1) {
            int var5 = arg0 & this.field3172 - 1;
            int var6 = arg1 & this.field3172 - 1;
            int var7 = (this.field3172 - var5) * this.field3169[var3][var4] + this.field3169[var3 + 1][var4] * var5 >> this.field3170;
            int var8 = (this.field3172 - var5) * this.field3169[var3][var4 + 1] + this.field3169[var3 + 1][var4 + 1] * var5 >> this.field3170;
            return (this.field3172 - var6) * var7 + var6 * var8 >> this.field3170;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)I")
    private static final int method1419(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILfq;)Lfq;")
    public final class87 method197(int arg0, int arg1, class87 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method205(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field3171 == null) {
            this.field3171 = new class217[super.field686][super.field690];
            this.field3162 = new class86[super.field686][super.field690];
        } else if (this.field3168 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class81.field1140[class316.method1949(arg6[var15], (byte) -108) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class81.field1140[class316.method1949(arg7[var16], (byte) 121) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == this.field3172 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == this.field3172 && arg4[var22] == this.field3172) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == this.field3172) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + this.field3172 != arg2[var24] && arg2[0] - this.field3172 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + this.field3172 != arg4[var24] && arg4[0] - this.field3172 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class217 var25 = new class217();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field3221 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field3218 = (byte) (var25.field3218 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field3169[arg0 + 1][arg1] == this.field3169[arg0][arg1] && this.field3169[arg0 + 1][arg1 + 1] == this.field3169[arg0][arg1] && this.field3169[arg0][arg1 + 1] == this.field3169[arg0][arg1]) {
                    var25.field3218 = (byte) (var25.field3218 | 1);
                }
                if (var27 != -1 && (var25.field3218 & 2) == 0 && !this.field3174.field871.method1331(9386, var27).field1198) {
                    var25.field3225 = this.field3164[arg0][arg1] - this.field3179[arg0][arg1];
                    var25.field3226 = this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1];
                    var25.field3220 = this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1];
                    var25.field3223 = this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1];
                    var25.field3222 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field3225 = class220.method1451(arg10, method1419(arg6[var18] >> 8, this.field3164[arg0][arg1] - this.field3179[arg0][arg1]), 125, var28);
                    if (var25.field3221 != 0) {
                        var25.field3225 |= 255 - (this.field3164[arg0][arg1] - this.field3179[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field3226 = class220.method1451(arg10, method1419(arg6[var19] >> 8, this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1]), 127, var29);
                    if (var25.field3221 != 0) {
                        var25.field3226 |= 255 - (this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field3220 = class220.method1451(arg10, method1419(arg6[var20] >> 8, this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1]), 126, var30);
                    if (var25.field3221 != 0) {
                        var25.field3220 |= 255 - (this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field3223 = class220.method1451(arg10, method1419(arg6[var21] >> 8, this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1]), 126, var31);
                    if (var25.field3221 != 0) {
                        var25.field3223 |= 255 - (this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1]) << 25;
                    }
                    var25.field3222 = -1;
                }
                if (arg5 != null) {
                    var25.field3228 = (short) arg5[var20];
                    var25.field3227 = (short) arg5[var21];
                    var25.field3219 = (short) arg5[var19];
                    var25.field3224 = (short) arg5[var18];
                }
                this.field3171[arg0][arg1] = var25;
            } else {
                class86 var32 = new class86();
                var32.field1227 = (short) arg2.length;
                var32.field1231 = (short) (arg2.length / 3);
                var32.field1225 = new short[var32.field1227];
                var32.field1229 = new short[var32.field1227];
                var32.field1232 = new short[var32.field1227];
                var32.field1224 = new int[var32.field1227];
                if (arg5 != null) {
                    var32.field1226 = new short[var32.field1227];
                }
                for (int var33 = 0; var33 < var32.field1227; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field3164[arg0][arg1] - this.field3179[arg0][arg1];
                    } else if (var48 == 0 && this.field3172 == var49) {
                        var51 = this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1];
                    } else if (this.field3172 == var48 && this.field3172 == var49) {
                        var51 = this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1];
                    } else if (this.field3172 == var48 && var49 == 0) {
                        var51 = this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field3164[arg0 + 1][arg1] - this.field3179[arg0 + 1][arg1]) * var48 + (this.field3164[arg0][arg1] - this.field3179[arg0][arg1]) * (this.field3172 - var48);
                        int var53 = (this.field3164[arg0 + 1][arg1 + 1] - this.field3179[arg0 + 1][arg1 + 1]) * var48 + (this.field3164[arg0][arg1 + 1] - this.field3179[arg0][arg1 + 1]) * (this.field3172 - var48);
                        var51 = (this.field3172 - var49) * var52 + var49 * var53 >> this.field3170 * 2;
                    }
                    short var54 = (short) ((arg0 << this.field3170) + var48);
                    short var55 = (short) ((arg1 << this.field3170) + var49);
                    var32.field1225[var33] = var54;
                    var32.field1232[var33] = var55;
                    var32.field1229[var33] = (short) (this.method204(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field3174.field871.method1331(9386, arg8[var33]).field1198) {
                        var32.field1224[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1224[var33] = var51 << 25;
                        } else {
                            var32.field1224[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1226[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1224[var33] = class220.method1451(arg10, method1419(arg6[var33] >> 8, var51), 125, var56);
                        if (arg7 != null) {
                            var32.field1224[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1231; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field3174.field871.method1331(9386, arg8[var35 * 3]).field1198) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1228 = new int[var32.field1231];
                }
                if (var34) {
                    var32.field1230 = new short[var32.field1231];
                    var32.field1223 = new short[var32.field1231];
                }
                for (int var36 = 0; var36 < var32.field1231; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1228[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field3174.field871.method1331(9386, var42).field1198) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field3174.field871.method1331(9386, var43).field1198) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field3174.field871.method1331(9386, var44).field1198) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1230[var36] = (short) var44;
                            var32.field1223[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field3174.field871.method1331(9386, var45).field1198) {
                                    var32.field1224[var37] = class81.field1140[class316.method1949(this.field3174.field871.method1331(9386, var45).field1213 & 65535, (byte) 125) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field3174.field871.method1331(9386, var46).field1198) {
                                    var32.field1224[var38] = class81.field1140[class316.method1949(this.field3174.field871.method1331(9386, var46).field1213 & 65535, (byte) -126) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field3174.field871.method1331(9386, var47).field1198) {
                                    var32.field1224[var39] = class81.field1140[class316.method1949(this.field3174.field871.method1331(9386, var47).field1213 & 65535, (byte) 125) & 65535];
                                }
                            }
                            var32.field1230[var36] = -1;
                        }
                    }
                }
                this.field3162[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIIIII[[ZLcr;[I[I)V")
    private final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class339 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5088 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3171[var16][var17] != null) {
                        class217 var18 = this.field3171[var16][var17];
                        if (var18.field3222 != -1 && (var18.field3218 & 2) == 0 && var18.field3221 == 0) {
                            int var19 = this.field3174.method888(var18.field3222);
                            arg8.method2078(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class82.method672(var18.field3220, var19, (byte) -109), class82.method672(var18.field3223, var19, (byte) -112), class82.method672(var18.field3226, var19, (byte) -95));
                            arg8.method2078(var15, var15, var15 - var13, var14, var13 + var14, var14, class82.method672(var18.field3225, var19, (byte) -78), class82.method672(var18.field3226, var19, (byte) -65), class82.method672(var18.field3223, var19, (byte) -99));
                        } else if (var18.field3221 == 0) {
                            arg8.method2072(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3220, var18.field3223, var18.field3226);
                            arg8.method2072(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3225, var18.field3226, var18.field3223);
                        } else {
                            int var20 = var18.field3221;
                            arg8.method2072(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class230.method1511(var18.field3220 & -16777216, var20, 16711935), class230.method1511(var18.field3223 & -16777216, var20, 16711935), class230.method1511(var18.field3226 & -16777216, var20, 16711935));
                            arg8.method2072(var15, var15, var15 - var13, var14, var13 + var14, var14, class230.method1511(var18.field3225 & -16777216, var20, 16711935), class230.method1511(var18.field3226 & -16777216, var20, 16711935), class230.method1511(var18.field3223 & -16777216, var20, 16711935));
                        }
                    } else if (this.field3162[var16][var17] != null) {
                        class86 var21 = this.field3162[var16][var17];
                        for (int var22 = 0; var22 < var21.field1227; ++var22) {
                            arg9[var22] = (var21.field1225[var22] - this.field3172 * var16) * var13 / this.field3172 + var14;
                            arg10[var22] = var15 - (var21.field1232[var22] - this.field3172 * var17) * var13 / this.field3172;
                        }
                        for (int var23 = 0; var23 < var21.field1231; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1228 != null && var21.field1228[var23] != 0 && (var21.field1230 == null || var21.field1230 != null && var21.field1230[var23] == -1)) {
                                int var33 = var21.field1228[var23];
                                arg8.method2072(var30, var31, var32, var27, var28, var29, class230.method1511(-16777216 - (var21.field1224[var24] & -16777216), var33, 16711935), class230.method1511(-16777216 - (var21.field1224[var25] & -16777216), var33, 16711935), class230.method1511(-16777216 - (var21.field1224[var26] & -16777216), var33, 16711935));
                            } else if (var21.field1230 != null && var21.field1230[var23] != -1) {
                                int var34 = this.field3174.method888(var21.field1230[var23]);
                                arg8.method2078(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method2072(var30, var31, var32, var27, var28, var29, var21.field1224[var24], var21.field1224[var25], var21.field1224[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5088 = true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lma;[I)V")
    public final void method196(class233 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Lfq;IIIIZ)V")
    public final void method207(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class344 var9 = this.field3174.method882(Thread.currentThread());
        class339 var10 = var9.field5194;
        var10.field5087 = 0;
        var10.field5079 = false;
        if (this.field3171 != null) {
            this.method1420(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5215, var9.field5227);
        } else {
            if (this.field3168 != null) {
                this.method1418(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5215, var9.field5227);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
    public final void method194() {
        this.field3164 = null;
        this.field3179 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZLcr;[I[I[I)V")
    private final void method1421(int arg0, int arg1, boolean arg2, class339 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class217 var8 = this.field3171[arg0][arg1];
        if (var8 != null) {
            if ((var8.field3218 & 2) == 0) {
                int var9 = this.field3172 * arg0;
                int var10 = this.field3172 + var9;
                int var11 = this.field3172 * arg1;
                int var12 = this.field3172 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field3218 & 1) != 0 && !arg2) {
                    int var17 = this.field3169[arg0][arg1];
                    int var18 = this.field3177 * var17;
                    var19 = (this.field3176 * var11 + this.field3173 * var9 + var18 >> 15) + this.field3181;
                    if (var19 <= this.field3174.field1754) {
                        return;
                    }
                    var20 = (this.field3176 * var11 + this.field3173 * var10 + var18 >> 15) + this.field3181;
                    if (var20 <= this.field3174.field1754) {
                        return;
                    }
                    var21 = (this.field3176 * var12 + this.field3173 * var10 + var18 >> 15) + this.field3181;
                    if (var21 <= this.field3174.field1754) {
                        return;
                    }
                    var22 = (this.field3176 * var12 + this.field3173 * var9 + var18 >> 15) + this.field3181;
                    if (var22 <= this.field3174.field1754) {
                        return;
                    }
                    if (this.field3174.field1755) {
                        int var23 = var19 - this.field3174.field1734;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field3174.field1734;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field3174.field1734;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field3174.field1734;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field3167 * var17;
                    int var28 = this.field3175 * var17;
                    var29 = (this.field3161 * var11 + this.field3178 * var9 + var27 >> 15) + this.field3180;
                    var30 = this.field3174.field1729 * var29 / var19 + arg3.field5089;
                    var31 = (this.field3163 * var11 + this.field3182 * var9 + var28 >> 15) + this.field3160;
                    var32 = this.field3174.field1759 * var31 / var19 + arg3.field5085;
                    var33 = (this.field3161 * var11 + this.field3178 * var10 + var27 >> 15) + this.field3180;
                    var34 = this.field3174.field1729 * var33 / var20 + arg3.field5089;
                    var35 = (this.field3163 * var11 + this.field3182 * var10 + var28 >> 15) + this.field3160;
                    var36 = this.field3174.field1759 * var35 / var20 + arg3.field5085;
                    var37 = (this.field3161 * var12 + this.field3178 * var10 + var27 >> 15) + this.field3180;
                    var38 = this.field3174.field1729 * var37 / var21 + arg3.field5089;
                    var39 = (this.field3163 * var12 + this.field3182 * var10 + var28 >> 15) + this.field3160;
                    var40 = this.field3174.field1759 * var39 / var21 + arg3.field5085;
                    var41 = (this.field3161 * var12 + this.field3178 * var9 + var27 >> 15) + this.field3180;
                    var42 = this.field3174.field1729 * var41 / var22 + arg3.field5089;
                    var43 = (this.field3163 * var12 + this.field3182 * var9 + var28 >> 15) + this.field3160;
                    var44 = this.field3174.field1759 * var43 / var22 + arg3.field5085;
                } else {
                    int var45 = this.field3169[arg0][arg1];
                    int var46 = this.field3169[arg0 + 1][arg1];
                    int var47 = this.field3169[arg0 + 1][arg1 + 1];
                    int var48 = this.field3169[arg0][arg1 + 1];
                    var19 = (this.field3176 * var11 + this.field3177 * var45 + this.field3173 * var9 >> 15) + this.field3181;
                    if (var19 <= this.field3174.field1754) {
                        return;
                    }
                    var20 = (this.field3176 * var11 + this.field3177 * var46 + this.field3173 * var10 >> 15) + this.field3181;
                    if (var20 <= this.field3174.field1754) {
                        return;
                    }
                    var21 = (this.field3176 * var12 + this.field3177 * var47 + this.field3173 * var10 >> 15) + this.field3181;
                    if (var21 <= this.field3174.field1754) {
                        return;
                    }
                    var22 = (this.field3176 * var12 + this.field3177 * var48 + this.field3173 * var9 >> 15) + this.field3181;
                    if (var22 <= this.field3174.field1754) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field3174.field1734;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field3224 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field3174.field1734;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field3219 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field3174.field1734;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field3228 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field3174.field1734;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field3227 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field3174.field1755) {
                        int var57 = var19 - this.field3174.field1734;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field3174.field1734;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field3174.field1734;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field3174.field1734;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field3161 * var11 + this.field3178 * var9 + this.field3167 * var45 >> 15) + this.field3180;
                    var30 = this.field3174.field1729 * var29 / var19 + arg3.field5089;
                    var31 = (this.field3163 * var11 + this.field3182 * var9 + this.field3175 * var45 >> 15) + this.field3160;
                    var32 = this.field3174.field1759 * var31 / var19 + arg3.field5085;
                    var33 = (this.field3161 * var11 + this.field3178 * var10 + this.field3167 * var46 >> 15) + this.field3180;
                    var34 = this.field3174.field1729 * var33 / var20 + arg3.field5089;
                    var35 = (this.field3163 * var11 + this.field3182 * var10 + this.field3175 * var46 >> 15) + this.field3160;
                    var36 = this.field3174.field1759 * var35 / var20 + arg3.field5085;
                    var37 = (this.field3161 * var12 + this.field3178 * var10 + this.field3167 * var47 >> 15) + this.field3180;
                    var38 = this.field3174.field1729 * var37 / var21 + arg3.field5089;
                    var39 = (this.field3163 * var12 + this.field3182 * var10 + this.field3175 * var47 >> 15) + this.field3160;
                    var40 = this.field3174.field1759 * var39 / var21 + arg3.field5085;
                    var41 = (this.field3161 * var12 + this.field3178 * var9 + this.field3167 * var48 >> 15) + this.field3180;
                    var42 = this.field3174.field1729 * var41 / var22 + arg3.field5089;
                    var43 = (this.field3163 * var12 + this.field3182 * var9 + this.field3175 * var48 >> 15) + this.field3160;
                    var44 = this.field3174.field1759 * var43 / var22 + arg3.field5085;
                }
                boolean var61 = var8.field3222 != -1 && this.method1417(this.field3174.field871.method1331(9386, var8.field3222).field1218);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field5079 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field5084 || var42 > arg3.field5084 || var34 > arg3.field5084;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field5087 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field3222 >= 0) {
                                arg3.method2073(var40, var44, var36, var38, var42, var34, this.field3174.field1757, var15, var16, var14, var8.field3220, var8.field3223, var8.field3226, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field3222);
                            } else {
                                arg3.method2072(var40, var44, var36, var38, var42, var34, class230.method1511(var15 << 24 | this.field3174.field1757, var8.field3220, 16711935), class230.method1511(var16 << 24 | this.field3174.field1757, var8.field3223, 16711935), class230.method1511(var14 << 24 | this.field3174.field1757, var8.field3226, 16711935));
                            }
                        } else if (var8.field3222 >= 0) {
                            arg3.method2076(var40, var44, var36, var38, var42, var34, var8.field3220, var8.field3223, var8.field3226, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field3222);
                        } else {
                            arg3.method2072(var40, var44, var36, var38, var42, var34, var8.field3220, var8.field3223, var8.field3226);
                        }
                        arg3.field5087 = 0;
                    } else {
                        arg3.method2079(var40, var44, var36, var38, var42, var34, this.field3174.field1757);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field5079 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field5084 || var34 > arg3.field5084 || var42 > arg3.field5084;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field5087 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field3222 >= 0) {
                                arg3.method2073(var32, var36, var44, var30, var34, var42, this.field3174.field1757, var13, var14, var16, var8.field3225, var8.field3226, var8.field3223, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field3222);
                            } else {
                                arg3.method2072(var32, var36, var44, var30, var34, var42, class230.method1511(var13 << 24 | this.field3174.field1757, var8.field3225, 16711935), class230.method1511(var14 << 24 | this.field3174.field1757, var8.field3226, 16711935), class230.method1511(var16 << 24 | this.field3174.field1757, var8.field3223, 16711935));
                            }
                        } else if (var8.field3222 >= 0) {
                            arg3.method2076(var32, var36, var44, var30, var34, var42, var8.field3225, var8.field3226, var8.field3223, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field3222);
                        } else {
                            arg3.method2072(var32, var36, var44, var30, var34, var42, var8.field3225, var8.field3226, var8.field3223);
                        }
                        arg3.field5087 = 0;
                        return;
                    }
                    arg3.method2079(var32, var36, var44, var30, var34, var42, this.field3174.field1757);
                }
            }
        } else {
            class86 var64 = this.field3162[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field1227; ++var65) {
                    short var105 = var64.field1225[var65];
                    int var106 = var64.field1229[var65];
                    short var107 = var64.field1232[var65];
                    int var108 = (this.field3176 * var107 + this.field3177 * var106 + this.field3173 * var105 >> 15) + this.field3181;
                    if (var108 <= this.field3174.field1754) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field3174.field1734;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field1226[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field3174.field1755) {
                        int var111 = var108 - this.field3174.field1734;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field3161 * var107 + this.field3178 * var105 + this.field3167 * var106 >> 15) + this.field3180;
                    int var113 = (this.field3163 * var107 + this.field3182 * var105 + this.field3175 * var106 >> 15) + this.field3160;
                    arg4[var65] = this.field3174.field1729 * var112 / var108 + arg3.field5089;
                    arg5[var65] = this.field3174.field1759 * var113 / var108 + arg3.field5085;
                }
                if (var64.field1230 != null) {
                    int var66 = this.field3169[arg0][arg1];
                    int var67 = this.field3169[arg0 + 1][arg1];
                    int var68 = this.field3169[arg0][arg1 + 1];
                    int var69 = this.field3172 * arg0;
                    int var70 = this.field3172 + var69;
                    int var71 = this.field3172 * arg1;
                    int var72 = this.field3172 + var71;
                    int var73 = (this.field3161 * var71 + this.field3178 * var69 + this.field3167 * var66 >> 15) + this.field3180;
                    int var74 = (this.field3163 * var71 + this.field3182 * var69 + this.field3175 * var66 >> 15) + this.field3160;
                    int var75 = (this.field3176 * var71 + this.field3177 * var66 + this.field3173 * var69 >> 15) + this.field3181;
                    int var76 = (this.field3161 * var71 + this.field3178 * var70 + this.field3167 * var67 >> 15) + this.field3180;
                    int var77 = (this.field3163 * var71 + this.field3182 * var70 + this.field3175 * var67 >> 15) + this.field3160;
                    int var78 = (this.field3176 * var71 + this.field3177 * var67 + this.field3173 * var70 >> 15) + this.field3181;
                    int var79 = (this.field3161 * var72 + this.field3178 * var69 + this.field3167 * var68 >> 15) + this.field3180;
                    int var80 = (this.field3163 * var72 + this.field3182 * var69 + this.field3175 * var68 >> 15) + this.field3160;
                    int var81 = (this.field3176 * var72 + this.field3177 * var68 + this.field3173 * var69 >> 15) + this.field3181;
                    for (int var82 = 0; var82 < var64.field1231; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field5079 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field5084 || var87 > arg3.field5084 || var88 > arg3.field5084;
                            short var93 = var64.field1230[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method1417(this.field3174.field871.method1331(9386, var93).field1218)) {
                                    arg3.field5087 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2073(var89, var90, var91, var86, var87, var88, this.field3174.field1757, arg6[var83], arg6[var84], arg6[var85], var64.field1224[var83], var64.field1224[var84], var64.field1224[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field1224[var83] & 16777215) != 0) {
                                        arg3.method2072(var89, var90, var91, var86, var87, var88, class230.method1511(arg6[var83] << 24 | this.field3174.field1757, var64.field1224[var83], 16711935), class230.method1511(arg6[var84] << 24 | this.field3174.field1757, var64.field1224[var84], 16711935), class230.method1511(arg6[var85] << 24 | this.field3174.field1757, var64.field1224[var85], 16711935));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2076(var89, var90, var91, var86, var87, var88, var64.field1224[var83], var64.field1224[var84], var64.field1224[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field1224[var83] & 16777215) != 0) {
                                    arg3.method2072(var89, var90, var91, var86, var87, var88, var64.field1224[var83], var64.field1224[var84], var64.field1224[var85]);
                                }
                                arg3.field5087 = 0;
                            } else {
                                arg3.method2079(var89, var90, var91, var86, var87, var88, this.field3174.field1757);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field1231; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field5079 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field5084 || var99 > arg3.field5084 || var100 > arg3.field5084;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field1224[var95] & 16777215) != 0) {
                                    arg3.method2072(var101, var102, var103, var98, var99, var100, class220.method1451(this.field3174.field1757, var64.field1224[var95], 126, arg6[var95]), class220.method1451(this.field3174.field1757, var64.field1224[var96], 127, arg6[var96]), class220.method1451(this.field3174.field1757, var64.field1224[var97], 126, arg6[var97]));
                                }
                            } else if ((var64.field1224[var95] & 16777215) != 0) {
                                arg3.method2072(var101, var102, var103, var98, var99, var100, var64.field1224[var95], var64.field1224[var96], var64.field1224[var97]);
                            }
                        } else {
                            arg3.method2079(var101, var102, var103, var98, var99, var100, this.field3174.field1757);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILcr;[I[I[I)V")
    private final void method1422(int arg0, int arg1, class339 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class278 var7 = this.field3168[arg0][arg1];
        if (var7 != null) {
            if ((var7.field4212 & 2) == 0) {
                int var8 = this.field3172 * arg0;
                int var9 = this.field3172 + var8;
                int var10 = this.field3172 * arg1;
                int var11 = this.field3172 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field4212 & 1) != 0) {
                    int var12 = this.field3169[arg0][arg1];
                    int var13 = this.field3177 * var12;
                    var14 = (this.field3176 * var10 + this.field3173 * var8 + var13 >> 15) + this.field3181;
                    if (var14 <= this.field3174.field1754) {
                        return;
                    }
                    var15 = (this.field3176 * var10 + this.field3173 * var9 + var13 >> 15) + this.field3181;
                    if (var15 <= this.field3174.field1754) {
                        return;
                    }
                    int var16 = (this.field3176 * var11 + this.field3173 * var9 + var13 >> 15) + this.field3181;
                    if (var16 <= this.field3174.field1754) {
                        return;
                    }
                    var17 = (this.field3176 * var11 + this.field3173 * var8 + var13 >> 15) + this.field3181;
                    if (var17 <= this.field3174.field1754) {
                        return;
                    }
                    int var18 = this.field3167 * var12;
                    int var19 = this.field3175 * var12;
                    var20 = (this.field3161 * var10 + this.field3178 * var8 + var18 >> 15) + this.field3180;
                    var21 = this.field3174.field1729 * var20 / var14 + arg2.field5089;
                    var22 = (this.field3163 * var10 + this.field3182 * var8 + var19 >> 15) + this.field3160;
                    var23 = this.field3174.field1759 * var22 / var14 + arg2.field5085;
                    var24 = (this.field3161 * var10 + this.field3178 * var9 + var18 >> 15) + this.field3180;
                    var25 = this.field3174.field1729 * var24 / var15 + arg2.field5089;
                    var26 = (this.field3163 * var10 + this.field3182 * var9 + var19 >> 15) + this.field3160;
                    var27 = this.field3174.field1759 * var26 / var15 + arg2.field5085;
                    int var28 = (this.field3161 * var11 + this.field3178 * var9 + var18 >> 15) + this.field3180;
                    var29 = this.field3174.field1729 * var28 / var16 + arg2.field5089;
                    int var30 = (this.field3163 * var11 + this.field3182 * var9 + var19 >> 15) + this.field3160;
                    var31 = this.field3174.field1759 * var30 / var16 + arg2.field5085;
                    var32 = (this.field3161 * var11 + this.field3178 * var8 + var18 >> 15) + this.field3180;
                    var33 = this.field3174.field1729 * var32 / var17 + arg2.field5089;
                    var34 = (this.field3163 * var11 + this.field3182 * var8 + var19 >> 15) + this.field3160;
                    var35 = this.field3174.field1759 * var34 / var17 + arg2.field5085;
                } else {
                    int var36 = this.field3169[arg0][arg1];
                    int var37 = this.field3169[arg0 + 1][arg1];
                    int var38 = this.field3169[arg0 + 1][arg1 + 1];
                    int var39 = this.field3169[arg0][arg1 + 1];
                    var14 = (this.field3176 * var10 + this.field3177 * var36 + this.field3173 * var8 >> 15) + this.field3181;
                    if (var14 <= this.field3174.field1754) {
                        return;
                    }
                    var15 = (this.field3176 * var10 + this.field3177 * var37 + this.field3173 * var9 >> 15) + this.field3181;
                    if (var15 <= this.field3174.field1754) {
                        return;
                    }
                    int var40 = (this.field3176 * var11 + this.field3177 * var38 + this.field3173 * var9 >> 15) + this.field3181;
                    if (var40 <= this.field3174.field1754) {
                        return;
                    }
                    var17 = (this.field3176 * var11 + this.field3177 * var39 + this.field3173 * var8 >> 15) + this.field3181;
                    if (var17 <= this.field3174.field1754) {
                        return;
                    }
                    var20 = (this.field3161 * var10 + this.field3178 * var8 + this.field3167 * var36 >> 15) + this.field3180;
                    var21 = this.field3174.field1729 * var20 / var14 + arg2.field5089;
                    var22 = (this.field3163 * var10 + this.field3182 * var8 + this.field3175 * var36 >> 15) + this.field3160;
                    var23 = this.field3174.field1759 * var22 / var14 + arg2.field5085;
                    var24 = (this.field3161 * var10 + this.field3178 * var9 + this.field3167 * var37 >> 15) + this.field3180;
                    var25 = this.field3174.field1729 * var24 / var15 + arg2.field5089;
                    var26 = (this.field3163 * var10 + this.field3182 * var9 + this.field3175 * var37 >> 15) + this.field3160;
                    var27 = this.field3174.field1759 * var26 / var15 + arg2.field5085;
                    int var41 = (this.field3161 * var11 + this.field3178 * var9 + this.field3167 * var38 >> 15) + this.field3180;
                    var29 = this.field3174.field1729 * var41 / var40 + arg2.field5089;
                    int var42 = (this.field3163 * var11 + this.field3182 * var9 + this.field3175 * var38 >> 15) + this.field3160;
                    var31 = this.field3174.field1759 * var42 / var40 + arg2.field5085;
                    var32 = (this.field3161 * var11 + this.field3178 * var8 + this.field3167 * var39 >> 15) + this.field3180;
                    var33 = this.field3174.field1729 * var32 / var17 + arg2.field5089;
                    var34 = (this.field3163 * var11 + this.field3182 * var8 + this.field3175 * var39 >> 15) + this.field3160;
                    var35 = this.field3174.field1759 * var34 / var17 + arg2.field5085;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field5079 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field5084 || var33 > arg2.field5084 || var25 > arg2.field5084;
                    if (var7.field4216 >= 0) {
                        if (this.method1417(this.field3174.field871.method1331(9386, var7.field4216).field1218)) {
                            arg2.field5087 = 100;
                        }
                        arg2.method2076(var31, var35, var27, var29, var33, var25, var7.field4213 & 65535, var7.field4217 & 65535, var7.field4211 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4216);
                        arg2.field5087 = 0;
                    } else {
                        arg2.method2078(var31, var35, var27, var29, var33, var25, var7.field4213 & 65535, var7.field4217 & 65535, var7.field4211 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field5079 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field5084 || var25 > arg2.field5084 || var33 > arg2.field5084;
                    if (var7.field4216 >= 0) {
                        if (this.method1417(this.field3174.field871.method1331(9386, var7.field4216).field1218)) {
                            arg2.field5087 = 100;
                        }
                        arg2.method2076(var23, var27, var35, var21, var25, var33, var7.field4214 & 65535, var7.field4211 & 65535, var7.field4217 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4216);
                        arg2.field5087 = 0;
                        return;
                    }
                    arg2.method2078(var23, var27, var35, var21, var25, var33, var7.field4214 & 65535, var7.field4211 & 65535, var7.field4217 & 65535);
                }
            }
        } else {
            class104 var43 = this.field3166[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field1448; ++var44) {
                    int var84 = var43.field1453[var44];
                    int var85 = var43.field1457[var44];
                    int var86 = var43.field1456[var44];
                    int var87 = (this.field3176 * var86 + this.field3177 * var85 + this.field3173 * var84 >> 15) + this.field3181;
                    if (var87 <= this.field3174.field1754) {
                        return;
                    }
                    int var88 = (this.field3161 * var86 + this.field3178 * var84 + this.field3167 * var85 >> 15) + this.field3180;
                    int var89 = (this.field3163 * var86 + this.field3182 * var84 + this.field3175 * var85 >> 15) + this.field3160;
                    arg3[var44] = this.field3174.field1729 * var88 / var87 + arg2.field5089;
                    arg4[var44] = this.field3174.field1759 * var89 / var87 + arg2.field5085;
                }
                if (var43.field1451 != null) {
                    int var45 = this.field3169[arg0][arg1];
                    int var46 = this.field3169[arg0 + 1][arg1];
                    int var47 = this.field3169[arg0][arg1 + 1];
                    int var48 = this.field3172 * arg0;
                    int var49 = this.field3172 + var48;
                    int var50 = this.field3172 * arg1;
                    int var51 = this.field3172 + var50;
                    int var52 = (this.field3161 * var50 + this.field3178 * var48 + this.field3167 * var45 >> 15) + this.field3180;
                    int var53 = (this.field3163 * var50 + this.field3182 * var48 + this.field3175 * var45 >> 15) + this.field3160;
                    int var54 = (this.field3176 * var50 + this.field3177 * var45 + this.field3173 * var48 >> 15) + this.field3181;
                    int var55 = (this.field3161 * var50 + this.field3178 * var49 + this.field3167 * var46 >> 15) + this.field3180;
                    int var56 = (this.field3163 * var50 + this.field3182 * var49 + this.field3175 * var46 >> 15) + this.field3160;
                    int var57 = (this.field3176 * var50 + this.field3177 * var46 + this.field3173 * var49 >> 15) + this.field3181;
                    int var58 = (this.field3161 * var51 + this.field3178 * var48 + this.field3167 * var47 >> 15) + this.field3180;
                    int var59 = (this.field3163 * var51 + this.field3182 * var48 + this.field3175 * var47 >> 15) + this.field3160;
                    int var60 = (this.field3176 * var51 + this.field3177 * var47 + this.field3173 * var48 >> 15) + this.field3181;
                    for (int var61 = 0; var61 < var43.field1452; ++var61) {
                        short var62 = var43.field1455[var61];
                        short var63 = var43.field1454[var61];
                        short var64 = var43.field1449[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field5079 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field5084 || var66 > arg2.field5084 || var67 > arg2.field5084;
                            short var71 = var43.field1451[var61];
                            if (var71 != -1) {
                                if (this.method1417(this.field3174.field871.method1331(9386, var71).field1218)) {
                                    arg2.field5087 = 100;
                                }
                                arg2.method2076(var68, var69, var70, var65, var66, var67, var43.field1447[var62], var43.field1447[var63], var43.field1447[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field5087 = 0;
                            } else {
                                int var72 = var43.field1446[var61];
                                if (var72 != -1) {
                                    arg2.method2078(var68, var69, var70, var65, var66, var67, class82.method672(var43.field1447[var62], var72, (byte) -71), class82.method672(var43.field1447[var63], var72, (byte) -122), class82.method672(var43.field1447[var64], var72, (byte) -92));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field1452; ++var73) {
                    short var74 = var43.field1455[var73];
                    short var75 = var43.field1454[var73];
                    short var76 = var43.field1449[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field1446[var73];
                        if (var83 != -1) {
                            arg2.field5079 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field5084 || var78 > arg2.field5084 || var79 > arg2.field5084;
                            arg2.method2078(var80, var81, var82, var77, var78, var79, class82.method672(var43.field1447[var74], var83, (byte) -45), class82.method672(var43.field1447[var75], var83, (byte) -52), class82.method672(var43.field1447[var76], var83, (byte) -60));
                        }
                    }
                }
            }
        }
    }
}
