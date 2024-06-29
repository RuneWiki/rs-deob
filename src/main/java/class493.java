import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class493 extends class296 {

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
    private int field6867 = -1;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "Lbs;")
    private class717 field6862;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    private int field6868;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "[[B")
    private byte[][] field6852;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "[[B")
    private byte[][] field6861;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "F")
    private float field6855;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "F")
    private float field6856;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "F")
    private float field6859;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "F")
    private float field6860;

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "F")
    private float field6864;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "F")
    private float field6865;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "F")
    private float field6866;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "F")
    private float field6869;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "F")
    private float field6870;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "F")
    private float field6871;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "F")
    private float field6872;

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "F")
    private float field6873;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "[[Loe;")
    private class214[][] field6858;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "[[Ljda;")
    private class240[][] field6853;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "[[Luha;")
    private class258[][] field6863;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "[[Lsha;")
    private class758[][] field6857;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "[[Lkca;")
    private class91[][] field6854;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1394(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6858 == null) {
            this.field6858 = new class214[super.field3533][super.field3524];
            this.field6853 = new class240[super.field3533][super.field3524];
        } else if (this.field6854 != null || this.field6863 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3525 != var20 || var21 != 0 && super.field3525 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class240 var22 = new class240();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field2827 = var23;
            var22.field2829 = new short[var23];
            var22.field2823 = new short[var23];
            var22.field2828 = new short[var23];
            var22.field2819 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field2829[var25] = (short) (this.field6852[arg0][arg1] - this.field6861[arg0][arg1]);
                } else if (var32 == 0 && super.field3525 == var33) {
                    var22.field2829[var25] = (short) (this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]);
                } else if (super.field3525 == var32 && super.field3525 == var33) {
                    var22.field2829[var25] = (short) (this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]);
                } else if (super.field3525 == var32 && var33 == 0) {
                    var22.field2829[var25] = (short) (this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]) * var32 + (this.field6852[arg0][arg1] - this.field6861[arg0][arg1]) * (super.field3525 - var32);
                    int var35 = (this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]) * var32 + (this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]) * (super.field3525 - var32);
                    var22.field2829[var25] = (short) ((super.field3525 - var33) * var34 + var33 * var35 >> super.field3530 * 2);
                }
                int var36 = (arg0 << super.field3530) + var32;
                int var37 = (arg1 << super.field3530) + var33;
                var22.field2823[var25] = (short) var32;
                var22.field2819[var25] = (short) var33;
                var22.field2828[var25] = (short) (this.method1730(var36, var37, -1) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field2829[var25] < 2) {
                    var22.field2829[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class359 var31 = this.field6862.field890.method1138(var30, 50);
                    if (!var31.field4464) {
                        var26 = true;
                        if (this.method2910(var31.field4459) || var31.field4444 != 0 || var31.field4449 != 0) {
                            var22.field2824 = (byte) (var22.field2824 | 4);
                        }
                    }
                }
            }
            var22.field2825 = new int[var27];
            if (arg10 != null) {
                var22.field2821 = new int[var27];
            }
            var22.field2820 = new short[var27];
            var22.field2830 = new short[var27];
            var22.field2822 = new short[var27];
            if (var26) {
                var22.field2818 = new short[var27];
                var22.field2831 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field2825[var22.field2826] = class319.method1899(arg9[var29], (byte) 114);
                    } else {
                        var22.field2825[var22.field2826] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field2821[var22.field2826] = class319.method1899(arg10[var29], (byte) 109);
                        } else {
                            var22.field2821[var22.field2826] = -1;
                        }
                    }
                    var22.field2820[var22.field2826] = (short) arg6[var29];
                    var22.field2830[var22.field2826] = (short) arg7[var29];
                    var22.field2822[var22.field2826] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6862.field890.method1138(arg11[var29], 49).field4464) {
                            var22.field2818[var22.field2826] = (short) arg11[var29];
                            var22.field2831[var22.field2826] = (short) arg12[var29];
                        } else {
                            var22.field2818[var22.field2826] = -1;
                        }
                    }
                    ++var22.field2826;
                }
            }
            this.field6853[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class214 var38 = new class214();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field2527 = class477.method2836(-22025, this.field6852[arg0][arg1] - this.field6861[arg0][arg1], class319.method1899(arg10[0], (byte) 78));
                    if (var39 == -1) {
                        var38.field2526 = (byte) (var38.field2526 | 2);
                    }
                }
                if (super.field3526[arg0 + 1][arg1] == super.field3526[arg0][arg1] && super.field3526[arg0 + 1][arg1 + 1] == super.field3526[arg0][arg1] && super.field3526[arg0][arg1 + 1] == super.field3526[arg0][arg1]) {
                    var38.field2526 = (byte) (var38.field2526 | 1);
                }
                class359 var41 = null;
                if (var40 != -1) {
                    var41 = this.field6862.field890.method1138(var40, 37);
                }
                if (var41 != null && (var38.field2526 & 2) == 0 && !var41.field4464) {
                    var38.field2524 = (short) (this.field6852[arg0][arg1] - this.field6861[arg0][arg1]);
                    var38.field2523 = (short) (this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]);
                    var38.field2528 = (short) (this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]);
                    var38.field2529 = (short) (this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]);
                    var38.field2525 = (short) var40;
                    if (this.method2910(var41.field4459) || var41.field4444 != 0 || var41.field4449 != 0) {
                        var38.field2526 = (byte) (var38.field2526 | 4);
                    }
                } else {
                    short var42 = class319.method1899(var39, (byte) 125);
                    var38.field2524 = (short) class477.method2836(-22025, this.field6852[arg0][arg1] - this.field6861[arg0][arg1], var42);
                    var38.field2523 = (short) class477.method2836(-22025, this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1], var42);
                    var38.field2528 = (short) class477.method2836(-22025, this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1], var42);
                    var38.field2529 = (short) class477.method2836(-22025, this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1], var42);
                    var38.field2525 = -1;
                }
                this.field6858[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1403(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(II)I")
    private static final int method2903(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!cq", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1397(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cq", name = "YA", descriptor = "()V")
    public final void method1389() {
        this.field6852 = null;
        this.field6861 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1388(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class7 var7 = this.field6862.field10072;
        this.field6867 = -1;
        this.field6873 = var7.field117;
        this.field6855 = var7.field114;
        this.field6860 = var7.field116;
        this.field6864 = var7.field102;
        this.field6856 = var7.field128;
        this.field6865 = var7.field121;
        this.field6872 = var7.field122;
        this.field6859 = var7.field129;
        this.field6869 = var7.field106;
        this.field6866 = var7.field109;
        this.field6870 = var7.field126;
        this.field6871 = var7.field130;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3533 && var11 >= 0 && var11 < super.field3524) {
                        this.method2904(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(III)V")
    private final void method2904(int arg0, int arg1, int arg2) {
        class506 var4 = this.field6862.method4059(Thread.currentThread());
        var4.field7169.field4727 = 0;
        if (this.field6854 != null) {
            this.method2907(arg0, arg1, var4.field7159, var4, var4.field7169, var4.field7207, var4.field7206, var4.field7184, var4.field7172, arg2);
        } else if (this.field6858 != null) {
            this.method2909(arg0, arg1, var4.field7169, var4.field7207, var4.field7206, var4.field7184, var4.field7172, arg2);
        } else {
            if (this.field6863 != null) {
                this.method2908(arg0, arg1, var4.field7159, var4, var4.field7169, var4.field7207, var4.field7206, var4.field7184, var4.field7172, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
    public final void method1392(int arg0, int arg1) {
        this.method2904(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!cq", name = "fa", descriptor = "(IILr;)Lr;")
    public final class196 method1399(int arg0, int arg1, class196 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lbs;IIII[[I[[II)V")
    public class493(class717 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6862 = arg0;
        this.field6868 = arg2;
        this.field6852 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6862.field10065 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6862.field10045 * var18 + this.field6862.field10071 * var16 + this.field6862.field10063 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6852[var11][var10] = (byte) var20;
            }
        }
        this.field6861 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII[[ZLeu;Ldu;[I[I)V")
    private final void method2905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class506 arg8, class376 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7161;
        this.field6862.method635(false);
        arg9.field4735 = false;
        arg9.field4734 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6854 != null) {
                        if (this.field6854[var18][var19] != null) {
                            class91 var20 = this.field6854[var18][var19];
                            if (var20.field1217 != -1 && (var20.field1212 & 2) == 0 && var20.field1214 == 0) {
                                int var21 = this.field6862.method4061(var20.field1217);
                                arg9.method2197((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class477.method2836(-22025, var20.field1211, var21), (float) class477.method2836(-22025, var20.field1216, var21), (float) class477.method2836(-22025, var20.field1210, var21));
                                arg9.method2197((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class477.method2836(-22025, var20.field1209, var21), (float) class477.method2836(-22025, var20.field1210, var21), (float) class477.method2836(-22025, var20.field1216, var21));
                            } else if (var20.field1214 == 0) {
                                arg9.method2204((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field1211, var20.field1216, var20.field1210);
                                arg9.method2204((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field1209, var20.field1210, var20.field1216);
                            } else {
                                int var22 = var20.field1214;
                                arg9.method2204((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class671.method3767(var20.field1211 & -16777216, var22, 8250), class671.method3767(var20.field1216 & -16777216, var22, 8250), class671.method3767(var20.field1210 & -16777216, var22, 8250));
                                arg9.method2204((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class671.method3767(var20.field1209 & -16777216, var22, 8250), class671.method3767(var20.field1210 & -16777216, var22, 8250), class671.method3767(var20.field1216 & -16777216, var22, 8250));
                            }
                        } else if (this.field6857[var18][var19] != null) {
                            class758 var23 = this.field6857[var18][var19];
                            for (int var24 = 0; var24 < var23.field10494; ++var24) {
                                arg10[var24] = var23.field10491[var24] * var14 / super.field3525 + var16;
                                arg11[var24] = var17 - var23.field10498[var24] * var14 / super.field3525;
                            }
                            for (int var25 = 0; var25 < var23.field10493; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field10495 != null && var23.field10495[var25] != 0 && (var23.field10497 == null || var23.field10497 != null && var23.field10497[var25] == -1)) {
                                    int var35 = var23.field10495[var25];
                                    arg9.method2204((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class671.method3767(-16777216 - (var23.field10501[var26] & -16777216), var35, 8250), class671.method3767(-16777216 - (var23.field10501[var27] & -16777216), var35, 8250), class671.method3767(-16777216 - (var23.field10501[var28] & -16777216), var35, 8250));
                                } else if (var23.field10497 != null && var23.field10497[var25] != -1) {
                                    int var36 = this.field6862.method4061(var23.field10497[var25]);
                                    arg9.method2197((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method2204((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field10501[var26], var23.field10501[var27], var23.field10501[var28]);
                                }
                            }
                        }
                    } else if (this.field6863[var18][var19] != null) {
                        class258 var37 = this.field6863[var18][var19];
                        for (int var38 = 0; var38 < var37.field3057; ++var38) {
                            arg10[var38] = var37.field3063[var38] * var14 / super.field3525 + var16;
                            arg11[var38] = var17 - var37.field3059[var38] * var14 / super.field3525;
                        }
                        for (int var39 = 0; var39 < var37.field3060; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field3054 != null && var37.field3054[var39] != 0) {
                                int var49 = var37.field3054[var39];
                                arg9.method2204((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method2204((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field3055[var40], var37.field3055[var41], var37.field3055[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field4735 = true;
        this.field6862.method635(var15);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lkp;[I)V")
    public final void method1400(class515 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIIIIII[[ZLeu;Ldu;[I[I)V")
    private final void method2906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class506 arg8, class376 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7161;
        this.field6862.method635(false);
        arg9.field4735 = false;
        arg9.field4734 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6858[var18][var19] != null) {
                        class214 var20 = this.field6858[var18][var19];
                        if (var20.field2525 != -1 && (var20.field2526 & 2) == 0 && var20.field2527 == -1) {
                            int var21 = this.field6862.method4061(var20.field2525);
                            arg9.method2197((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class477.method2836(-22025, var20.field2528 & 65535, var21), (float) class477.method2836(-22025, var20.field2529 & 65535, var21), (float) class477.method2836(-22025, var20.field2523 & 65535, var21));
                            arg9.method2197((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class477.method2836(-22025, var20.field2524 & 65535, var21), (float) class477.method2836(-22025, var20.field2523 & 65535, var21), (float) class477.method2836(-22025, var20.field2529 & 65535, var21));
                        } else if (var20.field2527 == -1) {
                            arg9.method2197((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field2528 & 65535), (float) (var20.field2529 & 65535), (float) (var20.field2523 & 65535));
                            arg9.method2197((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field2524 & 65535), (float) (var20.field2523 & 65535), (float) (var20.field2529 & 65535));
                        } else {
                            int var22 = var20.field2527;
                            arg9.method2197((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method2197((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field6853[var18][var19] != null) {
                        class240 var23 = this.field6853[var18][var19];
                        for (int var24 = 0; var24 < var23.field2827; ++var24) {
                            arg10[var24] = var23.field2823[var24] * var14 / super.field3525 + var16;
                            arg11[var24] = var17 - var23.field2819[var24] * var14 / super.field3525;
                        }
                        for (int var25 = 0; var25 < var23.field2826; ++var25) {
                            short var26 = var23.field2820[var25];
                            short var27 = var23.field2830[var25];
                            short var28 = var23.field2822[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field2821 != null && var23.field2821[var25] != -1) {
                                int var35 = var23.field2821[var25];
                                arg9.method2197((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class477.method2836(-22025, var23.field2829[var26], var35), (float) class477.method2836(-22025, var23.field2829[var27], var35), (float) class477.method2836(-22025, var23.field2829[var28], var35));
                            } else if (var23.field2818 != null && var23.field2818[var25] != -1) {
                                int var36 = this.field6862.method4061(var23.field2818[var25]);
                                arg9.method2197((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class477.method2836(-22025, var23.field2829[var26], var36), (float) class477.method2836(-22025, var23.field2829[var27], var36), (float) class477.method2836(-22025, var23.field2829[var28], var36));
                            } else {
                                int var37 = var23.field2825[var25];
                                arg9.method2197((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class477.method2836(-22025, var23.field2829[var26], var37), (float) class477.method2836(-22025, var23.field2829[var27], var37), (float) class477.method2836(-22025, var23.field2829[var28], var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field4735 = true;
        this.field6862.method635(var15);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class506 var9 = this.field6862.method4059(Thread.currentThread());
        class376 var10 = var9.field7169;
        var10.field4727 = 0;
        var10.field4737 = true;
        this.field6862.method6();
        if (this.field6854 == null && this.field6863 == null) {
            if (this.field6858 != null) {
                this.method2906(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7207, var9.field7206);
            }
        } else {
            this.method2905(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7207, var9.field7206);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIZLeu;Ldu;[I[I[I[II)V")
    private final void method2907(int arg0, int arg1, boolean arg2, class506 arg3, class376 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class91 var11 = this.field6854[arg0][arg1];
        if (var11 != null) {
            if ((var11.field1212 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field1212 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3525 * arg0;
                int var13 = super.field3525 + var12;
                int var14 = super.field3525 * arg1;
                int var15 = super.field3525 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field1212 & 1) != 0 && !arg2) {
                    int var20 = super.field3526[arg0][arg1];
                    float var21 = (float) var20 * this.field6866;
                    if (this.field6867 == -1) {
                        var22 = (float) var14 * this.field6870 + (float) var12 * this.field6869 + var21 + this.field6871;
                        if (var22 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var23 = (float) var14 * this.field6870 + (float) var13 * this.field6869 + var21 + this.field6871;
                        if (var23 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var24 = (float) var15 * this.field6870 + (float) var13 * this.field6869 + var21 + this.field6871;
                        if (var24 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var25 = (float) var15 * this.field6870 + (float) var12 * this.field6869 + var21 + this.field6871;
                        if (var25 <= (float) this.field6862.field10059) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field6870 + (float) var12 * this.field6869 + var21 + this.field6871;
                        var23 = (float) var14 * this.field6870 + (float) var13 * this.field6869 + var21 + this.field6871;
                        var24 = (float) var15 * this.field6870 + (float) var13 * this.field6869 + var21 + this.field6871;
                        var25 = (float) var15 * this.field6870 + (float) var12 * this.field6869 + var21 + this.field6871;
                    }
                    if (arg3.field7156) {
                        int var26 = (int) (var22 - (float) arg3.field7155);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7155);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7155);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7155);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field6855;
                    float var31 = (float) var20 * this.field6865;
                    if (this.field6867 == -1) {
                        float var32 = (float) var14 * this.field6860 + (float) var12 * this.field6873 + var30 + this.field6864;
                        var33 = (int) ((float) this.field6862.field10076 * var32 / var22) + arg4.field4739;
                        float var34 = (float) var14 * this.field6872 + (float) var12 * this.field6856 + var31 + this.field6859;
                        var35 = (int) ((float) this.field6862.field10062 * var34 / var22) + arg4.field4729;
                        float var36 = (float) var14 * this.field6860 + (float) var13 * this.field6873 + var30 + this.field6864;
                        var37 = (int) ((float) this.field6862.field10076 * var36 / var23) + arg4.field4739;
                        float var38 = (float) var14 * this.field6872 + (float) var13 * this.field6856 + var31 + this.field6859;
                        var39 = (int) ((float) this.field6862.field10062 * var38 / var23) + arg4.field4729;
                        float var40 = (float) var15 * this.field6860 + (float) var13 * this.field6873 + var30 + this.field6864;
                        var41 = (int) ((float) this.field6862.field10076 * var40 / var24) + arg4.field4739;
                        float var42 = (float) var15 * this.field6872 + (float) var13 * this.field6856 + var31 + this.field6859;
                        var43 = (int) ((float) this.field6862.field10062 * var42 / var24) + arg4.field4729;
                        float var44 = (float) var15 * this.field6860 + (float) var12 * this.field6873 + var30 + this.field6864;
                        var45 = (int) ((float) this.field6862.field10076 * var44 / var25) + arg4.field4739;
                        float var46 = (float) var15 * this.field6872 + (float) var12 * this.field6856 + var31 + this.field6859;
                        var47 = (int) ((float) this.field6862.field10062 * var46 / var25) + arg4.field4729;
                    } else {
                        float var48 = (float) var14 * this.field6860 + (float) var12 * this.field6873 + var30 + this.field6864;
                        var33 = (int) ((float) this.field6862.field10076 * var48 / (float) this.field6867) + arg4.field4739;
                        float var49 = (float) var14 * this.field6872 + (float) var12 * this.field6856 + var31 + this.field6859;
                        var35 = (int) ((float) this.field6862.field10062 * var49 / (float) this.field6867) + arg4.field4729;
                        float var50 = (float) var14 * this.field6860 + (float) var13 * this.field6873 + var30 + this.field6864;
                        var37 = (int) ((float) this.field6862.field10076 * var50 / (float) this.field6867) + arg4.field4739;
                        float var51 = (float) var14 * this.field6872 + (float) var13 * this.field6856 + var31 + this.field6859;
                        var39 = (int) ((float) this.field6862.field10062 * var51 / (float) this.field6867) + arg4.field4729;
                        float var52 = (float) var15 * this.field6860 + (float) var13 * this.field6873 + var30 + this.field6864;
                        var41 = (int) ((float) this.field6862.field10076 * var52 / (float) this.field6867) + arg4.field4739;
                        float var53 = (float) var15 * this.field6872 + (float) var13 * this.field6856 + var31 + this.field6859;
                        var43 = (int) ((float) this.field6862.field10062 * var53 / (float) this.field6867) + arg4.field4729;
                        float var54 = (float) var15 * this.field6860 + (float) var12 * this.field6873 + var30 + this.field6864;
                        var45 = (int) ((float) this.field6862.field10076 * var54 / (float) this.field6867) + arg4.field4739;
                        float var55 = (float) var15 * this.field6872 + (float) var12 * this.field6856 + var31 + this.field6859;
                        var47 = (int) ((float) this.field6862.field10062 * var55 / (float) this.field6867) + arg4.field4729;
                    }
                } else {
                    int var56 = super.field3526[arg0][arg1];
                    int var57 = super.field3526[arg0 + 1][arg1];
                    int var58 = super.field3526[arg0 + 1][arg1 + 1];
                    int var59 = super.field3526[arg0][arg1 + 1];
                    if (this.field6867 == -1) {
                        var22 = (float) var14 * this.field6870 + (float) var12 * this.field6869 + (float) var56 * this.field6866 + this.field6871;
                        if (var22 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var23 = (float) var14 * this.field6870 + (float) var13 * this.field6869 + (float) var57 * this.field6866 + this.field6871;
                        if (var23 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var24 = (float) var15 * this.field6870 + (float) var13 * this.field6869 + (float) var58 * this.field6866 + this.field6871;
                        if (var24 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var25 = (float) var15 * this.field6870 + (float) var12 * this.field6869 + (float) var59 * this.field6866 + this.field6871;
                        if (var25 <= (float) this.field6862.field10059) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field6870 + (float) var12 * this.field6869 + (float) var56 * this.field6866 + this.field6871;
                        var23 = (float) var14 * this.field6870 + (float) var13 * this.field6869 + (float) var57 * this.field6866 + this.field6871;
                        var24 = (float) var15 * this.field6870 + (float) var13 * this.field6869 + (float) var58 * this.field6866 + this.field6871;
                        var25 = (float) var15 * this.field6870 + (float) var12 * this.field6869 + (float) var59 * this.field6866 + this.field6871;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7155);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field1208 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7155);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field1218 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7155);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field1215 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7155);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field1213 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7156) {
                        int var68 = (int) (var22 - (float) arg3.field7155);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7155);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7155);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7155);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field6867 == -1) {
                        float var72 = (float) var14 * this.field6860 + (float) var12 * this.field6873 + (float) var56 * this.field6855 + this.field6864;
                        var33 = (int) ((float) this.field6862.field10076 * var72 / var22) + arg4.field4739;
                        float var73 = (float) var14 * this.field6872 + (float) var12 * this.field6856 + (float) var56 * this.field6865 + this.field6859;
                        var35 = (int) ((float) this.field6862.field10062 * var73 / var22) + arg4.field4729;
                        float var74 = (float) var14 * this.field6860 + (float) var13 * this.field6873 + (float) var57 * this.field6855 + this.field6864;
                        var37 = (int) ((float) this.field6862.field10076 * var74 / var23) + arg4.field4739;
                        float var75 = (float) var14 * this.field6872 + (float) var13 * this.field6856 + (float) var57 * this.field6865 + this.field6859;
                        var39 = (int) ((float) this.field6862.field10062 * var75 / var23) + arg4.field4729;
                        float var76 = (float) var15 * this.field6860 + (float) var13 * this.field6873 + (float) var58 * this.field6855 + this.field6864;
                        var41 = (int) ((float) this.field6862.field10076 * var76 / var24) + arg4.field4739;
                        float var77 = (float) var15 * this.field6872 + (float) var13 * this.field6856 + (float) var58 * this.field6865 + this.field6859;
                        var43 = (int) ((float) this.field6862.field10062 * var77 / var24) + arg4.field4729;
                        float var78 = (float) var15 * this.field6860 + (float) var12 * this.field6873 + (float) var59 * this.field6855 + this.field6864;
                        var45 = (int) ((float) this.field6862.field10076 * var78 / var25) + arg4.field4739;
                        float var79 = (float) var15 * this.field6872 + (float) var12 * this.field6856 + (float) var59 * this.field6865 + this.field6859;
                        var47 = (int) ((float) this.field6862.field10062 * var79 / var25) + arg4.field4729;
                    } else {
                        float var80 = (float) var14 * this.field6860 + (float) var12 * this.field6873 + (float) var56 * this.field6855 + this.field6864;
                        var33 = (int) ((float) this.field6862.field10076 * var80 / (float) this.field6867) + arg4.field4739;
                        float var81 = (float) var14 * this.field6872 + (float) var12 * this.field6856 + (float) var56 * this.field6865 + this.field6859;
                        var35 = (int) ((float) this.field6862.field10062 * var81 / (float) this.field6867) + arg4.field4729;
                        float var82 = (float) var14 * this.field6860 + (float) var13 * this.field6873 + (float) var57 * this.field6855 + this.field6864;
                        var37 = (int) ((float) this.field6862.field10076 * var82 / (float) this.field6867) + arg4.field4739;
                        float var83 = (float) var14 * this.field6872 + (float) var13 * this.field6856 + (float) var57 * this.field6865 + this.field6859;
                        var39 = (int) ((float) this.field6862.field10062 * var83 / (float) this.field6867) + arg4.field4729;
                        float var84 = (float) var15 * this.field6860 + (float) var13 * this.field6873 + (float) var58 * this.field6855 + this.field6864;
                        var41 = (int) ((float) this.field6862.field10076 * var84 / (float) this.field6867) + arg4.field4739;
                        float var85 = (float) var15 * this.field6872 + (float) var13 * this.field6856 + (float) var58 * this.field6865 + this.field6859;
                        var43 = (int) ((float) this.field6862.field10062 * var85 / (float) this.field6867) + arg4.field4729;
                        float var86 = (float) var15 * this.field6860 + (float) var12 * this.field6873 + (float) var59 * this.field6855 + this.field6864;
                        var45 = (int) ((float) this.field6862.field10076 * var86 / (float) this.field6867) + arg4.field4739;
                        float var87 = (float) var15 * this.field6872 + (float) var12 * this.field6856 + (float) var59 * this.field6865 + this.field6859;
                        var47 = (int) ((float) this.field6862.field10062 * var87 / (float) this.field6867) + arg4.field4729;
                    }
                }
                boolean var88 = var11.field1217 != -1 && this.method2910(this.field6862.field890.method1138(var11.field1217, 78).field4459);
                if (this.field6867 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field4737 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field4738 || var45 > arg4.field4738 || var37 > arg4.field4738;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field1217 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method2193((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field1211 & 16777215, var90 | var11.field1216 & 16777215, var90 | var11.field1210 & 16777215, arg3.field7160, var18, var19, var17, var11.field1217);
                                } else {
                                    if (var88) {
                                        arg4.field4727 = 100;
                                    }
                                    arg4.method2204((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class671.method3767(var18 << 24 | arg3.field7160, var11.field1211, 8250), class671.method3767(var19 << 24 | arg3.field7160, var11.field1216, 8250), class671.method3767(var17 << 24 | arg3.field7160, var11.field1210, 8250));
                                    arg4.field4727 = 0;
                                }
                            } else if (var11.field1217 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method2193((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field1211 & 16777215, var91 | var11.field1216 & 16777215, var91 | var11.field1210 & 16777215, 0, 0, 0, 0, var11.field1217);
                            } else {
                                if (var88) {
                                    arg4.field4727 = 100;
                                }
                                arg4.method2204((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1211, var11.field1216, var11.field1210);
                                arg4.field4727 = 0;
                            }
                        } else {
                            arg4.method2203((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7160);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field4737 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field4738 || var37 > arg4.field4738 || var45 > arg4.field4738;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field4727 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field1217 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method2193((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field1209 & 16777215, var93 | var11.field1210 & 16777215, var93 | var11.field1216 & 16777215, arg3.field7160, var16, var17, var19, var11.field1217);
                                    return;
                                }
                                if (var88) {
                                    arg4.field4727 = 100;
                                }
                                arg4.method2204((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class671.method3767(var16 << 24 | arg3.field7160, var11.field1209, 8250), class671.method3767(var17 << 24 | arg3.field7160, var11.field1210, 8250), class671.method3767(var19 << 24 | arg3.field7160, var11.field1216, 8250));
                                arg4.field4727 = 0;
                                return;
                            }
                            if (var11.field1217 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method2193((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field1209 & 16777215, var94 | var11.field1210 & 16777215, var94 | var11.field1216 & 16777215, 0, 0, 0, 0, var11.field1217);
                                return;
                            }
                            if (var88) {
                                arg4.field4727 = 100;
                            }
                            arg4.method2204((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1209, var11.field1210, var11.field1216);
                            arg4.field4727 = 0;
                            return;
                        }
                        arg4.method2203((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7160);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field4737 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field4738 || var45 > arg4.field4738 || var37 > arg4.field4738;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field4727 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field1217 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method2193((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field1211 & 16777215, var96 | var11.field1216 & 16777215, var96 | var11.field1210 & 16777215, arg3.field7160, var18, var19, var17, var11.field1217);
                                } else {
                                    if (var88) {
                                        arg4.field4727 = 100;
                                    }
                                    arg4.method2204((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class671.method3767(var18 << 24 | arg3.field7160, var11.field1211, 8250), class671.method3767(var19 << 24 | arg3.field7160, var11.field1216, 8250), class671.method3767(var17 << 24 | arg3.field7160, var11.field1210, 8250));
                                    arg4.field4727 = 0;
                                }
                            } else if (var11.field1217 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method2193((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field1211 & 16777215, var97 | var11.field1216 & 16777215, var97 | var11.field1210 & 16777215, 0, 0, 0, 0, var11.field1217);
                            } else {
                                if (var88) {
                                    arg4.field4727 = 100;
                                }
                                arg4.method2204((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1211, var11.field1216, var11.field1210);
                                arg4.field4727 = 0;
                            }
                        } else {
                            arg4.method2203((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7160);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field4737 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field4738 || var37 > arg4.field4738 || var45 > arg4.field4738;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field4727 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field1217 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method2193((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field1209 & 16777215, var99 | var11.field1210 & 16777215, var99 | var11.field1216 & 16777215, arg3.field7160, var16, var17, var19, var11.field1217);
                                    return;
                                }
                                if (var88) {
                                    arg4.field4727 = 100;
                                }
                                arg4.method2204((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class671.method3767(var16 << 24 | arg3.field7160, var11.field1209, 8250), class671.method3767(var17 << 24 | arg3.field7160, var11.field1210, 8250), class671.method3767(var19 << 24 | arg3.field7160, var11.field1216, 8250));
                                arg4.field4727 = 0;
                                return;
                            }
                            if (var11.field1217 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method2193((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field1209 & 16777215, var100 | var11.field1210 & 16777215, var100 | var11.field1216 & 16777215, 0, 0, 0, 0, var11.field1217);
                                return;
                            }
                            if (var88) {
                                arg4.field4727 = 100;
                            }
                            arg4.method2204((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1209, var11.field1210, var11.field1216);
                            arg4.field4727 = 0;
                            return;
                        }
                        arg4.method2203((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7160);
                    }
                }
            }
        } else {
            class758 var101 = this.field6857[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field10499 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field6867 == -1) {
                    for (int var102 = 0; var102 < var101.field10494; ++var102) {
                        int var103 = (arg0 << super.field3530) + var101.field10491[var102];
                        int var104 = var101.field10492[var102];
                        int var105 = (arg1 << super.field3530) + var101.field10498[var102];
                        float var106 = (float) var105 * this.field6870 + (float) var103 * this.field6869 + (float) var104 * this.field6866 + this.field6871;
                        if (var106 <= (float) this.field6862.field10059) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7155);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field10500[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7156) {
                            int var109 = (int) (var106 - (float) arg3.field7155);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field6860 + (float) var103 * this.field6873 + (float) var104 * this.field6855 + this.field6864;
                        float var111 = (float) var105 * this.field6872 + (float) var103 * this.field6856 + (float) var104 * this.field6865 + this.field6859;
                        arg5[var102] = (int) ((float) this.field6862.field10076 * var110 / var106) + arg4.field4739;
                        arg6[var102] = (int) ((float) this.field6862.field10062 * var111 / var106) + arg4.field4729;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field10494; ++var112) {
                        int var152 = (arg0 << super.field3530) + var101.field10491[var112];
                        int var153 = var101.field10492[var112];
                        int var154 = (arg1 << super.field3530) + var101.field10498[var112];
                        float var155 = (float) var154 * this.field6870 + (float) var152 * this.field6869 + (float) var153 * this.field6866 + this.field6871;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field6867 - arg3.field7155;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field10500[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7156) {
                            int var158 = this.field6867 - arg3.field7155;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field6860 + (float) var152 * this.field6873 + (float) var153 * this.field6855 + this.field6864;
                        float var160 = (float) var154 * this.field6872 + (float) var152 * this.field6856 + (float) var153 * this.field6865 + this.field6859;
                        arg5[var112] = (int) ((float) this.field6862.field10076 * var159 / (float) this.field6867) + arg4.field4739;
                        arg6[var112] = (int) ((float) this.field6862.field10062 * var160 / (float) this.field6867) + arg4.field4729;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field10497 != null) {
                    if (this.field6867 == -1) {
                        for (int var113 = 0; var113 < var101.field10493; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field4737 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field4738 || var118 > arg4.field4738 || var119 > arg4.field4738;
                                short var124 = var101.field10497[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method2910(this.field6862.field890.method1138(var124, 61).field4459)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method2193((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field10491[var114] / (float) super.field3525, (float) var101.field10491[var115] / (float) super.field3525, (float) var101.field10491[var116] / (float) super.field3525, (float) var101.field10498[var114] / (float) super.field3525, (float) var101.field10498[var115] / (float) super.field3525, (float) var101.field10498[var116] / (float) super.field3525, var125 | var101.field10501[var114] & 16777215, var125 | var101.field10501[var115] & 16777215, var125 | var101.field10501[var116] & 16777215, arg3.field7160, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field10501[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method2910(this.field6862.field890.method1138(var124, 127).field4459)) {
                                                arg4.field4727 = -1694498816;
                                            }
                                            arg4.method2204((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class671.method3767(arg8[var114] << 24 | arg3.field7160, var101.field10501[var114], 8250), class671.method3767(arg8[var115] << 24 | arg3.field7160, var101.field10501[var115], 8250), class671.method3767(arg8[var116] << 24 | arg3.field7160, var101.field10501[var116], 8250));
                                            arg4.field4727 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method2910(this.field6862.field890.method1138(var124, 101).field4459)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method2193((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field10491[var114] / (float) super.field3525, (float) var101.field10491[var115] / (float) super.field3525, (float) var101.field10491[var116] / (float) super.field3525, (float) var101.field10498[var114] / (float) super.field3525, (float) var101.field10498[var115] / (float) super.field3525, (float) var101.field10498[var116] / (float) super.field3525, var126 | var101.field10501[var114] & 16777215, var126 | var101.field10501[var115] & 16777215, var126 | var101.field10501[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field10501[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method2910(this.field6862.field890.method1138(var124, 116).field4459)) {
                                            arg4.field4727 = -1694498816;
                                        }
                                        arg4.method2204((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field10501[var114], var101.field10501[var115], var101.field10501[var116]);
                                        arg4.field4727 = 0;
                                    }
                                } else {
                                    arg4.method2203((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7160);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field10493; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field4737 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field4738 || var132 > arg4.field4738 || var133 > arg4.field4738;
                            short var138 = var101.field10497[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method2910(this.field6862.field890.method1138(var138, 30).field4459)) {
                                    arg4.field4727 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method2910(this.field6862.field890.method1138(var138, 32).field4459)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method2193((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field10491[var128] / (float) super.field3525, (float) var101.field10491[var129] / (float) super.field3525, (float) var101.field10491[var130] / (float) super.field3525, (float) var101.field10498[var128] / (float) super.field3525, (float) var101.field10498[var129] / (float) super.field3525, (float) var101.field10498[var130] / (float) super.field3525, var139 | var101.field10501[var128] & 16777215, var139 | var101.field10501[var129] & 16777215, var139 | var101.field10501[var130] & 16777215, arg3.field7160, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field10501[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method2910(this.field6862.field890.method1138(var138, 62).field4459)) {
                                            arg4.field4727 = -1694498816;
                                        }
                                        arg4.method2204((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class671.method3767(arg8[var128] << 24 | arg3.field7160, var101.field10501[var128], 8250), class671.method3767(arg8[var129] << 24 | arg3.field7160, var101.field10501[var129], 8250), class671.method3767(arg8[var130] << 24 | arg3.field7160, var101.field10501[var130], 8250));
                                        arg4.field4727 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method2910(this.field6862.field890.method1138(var138, 80).field4459)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method2193((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field10491[var128] / (float) super.field3525, (float) var101.field10491[var129] / (float) super.field3525, (float) var101.field10491[var130] / (float) super.field3525, (float) var101.field10498[var128] / (float) super.field3525, (float) var101.field10498[var129] / (float) super.field3525, (float) var101.field10498[var130] / (float) super.field3525, var140 | var101.field10501[var128] & 16777215, var140 | var101.field10501[var129] & 16777215, var140 | var101.field10501[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field10501[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method2910(this.field6862.field890.method1138(var138, 27).field4459)) {
                                        arg4.field4727 = -1694498816;
                                    }
                                    arg4.method2204((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field10501[var128], var101.field10501[var129], var101.field10501[var130]);
                                    arg4.field4727 = 0;
                                }
                                arg4.field4727 = 0;
                            } else {
                                arg4.method2203((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7160);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field10493; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field4737 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field4738 || var146 > arg4.field4738 || var147 > arg4.field4738;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field10501[var142] & 16777215) != 0) {
                                    arg4.method2204((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class757.method4225(arg8[var142], arg3.field7160, -3362, var101.field10501[var142]), class757.method4225(arg8[var143], arg3.field7160, -3362, var101.field10501[var143]), class757.method4225(arg8[var144], arg3.field7160, -3362, var101.field10501[var144]));
                                }
                            } else if ((var101.field10501[var142] & 16777215) != 0) {
                                arg4.method2204((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field10501[var142], var101.field10501[var143], var101.field10501[var144]);
                            }
                        } else {
                            arg4.method2203((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7160);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1405(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field6868 & 32) == 0;
        if (this.field6854 == null && !var15) {
            this.field6854 = new class91[super.field3533][super.field3524];
            this.field6857 = new class758[super.field3533][super.field3524];
        } else if (this.field6863 == null && var15) {
            this.field6863 = new class258[super.field3533][super.field3524];
        } else if (this.field6858 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class12.field211[class319.method1899(arg6[var16], (byte) 61) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class12.field211[class319.method1899(arg7[var17], (byte) 117) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class258 var18 = new class258();
                var18.field3057 = (short) arg2.length;
                var18.field3060 = (short) (arg2.length / 3);
                var18.field3063 = new short[var18.field3057];
                var18.field3056 = new short[var18.field3057];
                var18.field3059 = new short[var18.field3057];
                var18.field3055 = new int[var18.field3057];
                var18.field3061 = new short[var18.field3057];
                var18.field3058 = new short[var18.field3057];
                var18.field3062 = new byte[var18.field3057];
                if (arg5 != null) {
                    var18.field3064 = new short[var18.field3057];
                }
                for (int var19 = 0; var19 < var18.field3057; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field6852[arg0][arg1] - this.field6861[arg0][arg1];
                    } else if (var22 == 0 && super.field3525 == var23) {
                        var25 = this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1];
                    } else if (super.field3525 == var22 && super.field3525 == var23) {
                        var25 = this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1];
                    } else if (super.field3525 == var22 && var23 == 0) {
                        var25 = this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]) * var22 + (this.field6852[arg0][arg1] - this.field6861[arg0][arg1]) * (super.field3525 - var22);
                        int var27 = (this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]) * var22 + (this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]) * (super.field3525 - var22);
                        var25 = (super.field3525 - var23) * var26 + var23 * var27 >> super.field3530 * 2;
                    }
                    int var28 = (arg0 << super.field3530) + var22;
                    int var29 = (arg1 << super.field3530) + var23;
                    var18.field3063[var19] = (short) var22;
                    var18.field3059[var19] = (short) var23;
                    var18.field3056[var19] = (short) (this.method1730(var28, var29, -1) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field3055[var19] = 0;
                        if (arg7 != null) {
                            var18.field3062[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field3064[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method2910(this.field6862.field890.method1138(arg8[var19], 91).field4459)) {
                            var32 = -1694498816;
                        }
                        var18.field3055[var19] = var32 | class757.method4225(var30, arg10, -3362, method2903(arg6[var19] >> 8, var25));
                        if (arg7 != null) {
                            var18.field3062[var19] = (byte) var25;
                        }
                    }
                    var18.field3061[var19] = (short) arg8[var19];
                    var18.field3058[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field3054 = new int[var18.field3060];
                }
                for (int var20 = 0; var20 < var18.field3060; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field3054[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field6863[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field3525 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3525 && arg4[var38] == super.field3525) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3525) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3525 != arg2[var40] && arg2[0] - super.field3525 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3525 != arg4[var40] && arg4[0] - super.field3525 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class91 var41 = new class91();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field1214 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field1212 = (byte) (var41.field1212 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3526[arg0 + 1][arg1] == super.field3526[arg0][arg1] && super.field3526[arg0 + 1][arg1 + 1] == super.field3526[arg0][arg1] && super.field3526[arg0][arg1 + 1] == super.field3526[arg0][arg1]) {
                        var41.field1212 = (byte) (var41.field1212 | 1);
                    }
                    if (var43 != -1 && (var41.field1212 & 2) == 0 && !this.field6862.field890.method1138(var43, 57).field4464) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field1209 = class757.method4225(var44, arg10, -3362, method2903(arg6[var34] >> 8, this.field6852[arg0][arg1] - this.field6861[arg0][arg1]));
                        if (var41.field1214 != 0) {
                            var41.field1209 |= 255 - (this.field6852[arg0][arg1] - this.field6861[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field1210 = class757.method4225(var45, arg10, -3362, method2903(arg6[var35] >> 8, this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]));
                        if (var41.field1214 != 0) {
                            var41.field1210 |= 255 - (this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field1211 = class757.method4225(var46, arg10, -3362, method2903(arg6[var36] >> 8, this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]));
                        if (var41.field1214 != 0) {
                            var41.field1211 |= 255 - (this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field1216 = class757.method4225(var47, arg10, -3362, method2903(arg6[var37] >> 8, this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]));
                        var41.field1217 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field1209 = class757.method4225(var48, arg10, -3362, method2903(arg6[var34] >> 8, this.field6852[arg0][arg1] - this.field6861[arg0][arg1]));
                        if (var41.field1214 != 0) {
                            var41.field1209 |= 255 - (this.field6852[arg0][arg1] - this.field6861[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field1210 = class757.method4225(var49, arg10, -3362, method2903(arg6[var35] >> 8, this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]));
                        if (var41.field1214 != 0) {
                            var41.field1210 |= 255 - (this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field1211 = class757.method4225(var50, arg10, -3362, method2903(arg6[var36] >> 8, this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]));
                        if (var41.field1214 != 0) {
                            var41.field1211 |= 255 - (this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field1216 = class757.method4225(var51, arg10, -3362, method2903(arg6[var37] >> 8, this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]));
                        if (var41.field1214 != 0) {
                            var41.field1216 |= 255 - (this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]) << 25;
                        }
                        var41.field1217 = -1;
                    }
                    if (arg5 != null) {
                        var41.field1215 = (short) arg5[var36];
                        var41.field1213 = (short) arg5[var37];
                        var41.field1218 = (short) arg5[var35];
                        var41.field1208 = (short) arg5[var34];
                    }
                    this.field6854[arg0][arg1] = var41;
                } else {
                    class758 var52 = new class758();
                    var52.field10494 = (short) arg2.length;
                    var52.field10493 = (short) (arg2.length / 3);
                    var52.field10491 = new short[var52.field10494];
                    var52.field10492 = new short[var52.field10494];
                    var52.field10498 = new short[var52.field10494];
                    var52.field10501 = new int[var52.field10494];
                    if (arg5 != null) {
                        var52.field10500 = new short[var52.field10494];
                    }
                    for (int var53 = 0; var53 < var52.field10494; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field6852[arg0][arg1] - this.field6861[arg0][arg1];
                        } else if (var68 == 0 && super.field3525 == var69) {
                            var71 = this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1];
                        } else if (super.field3525 == var68 && super.field3525 == var69) {
                            var71 = this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1];
                        } else if (super.field3525 == var68 && var69 == 0) {
                            var71 = this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field6852[arg0 + 1][arg1] - this.field6861[arg0 + 1][arg1]) * var68 + (this.field6852[arg0][arg1] - this.field6861[arg0][arg1]) * (super.field3525 - var68);
                            int var73 = (this.field6852[arg0 + 1][arg1 + 1] - this.field6861[arg0 + 1][arg1 + 1]) * var68 + (this.field6852[arg0][arg1 + 1] - this.field6861[arg0][arg1 + 1]) * (super.field3525 - var68);
                            var71 = (super.field3525 - var69) * var72 + var69 * var73 >> super.field3530 * 2;
                        }
                        int var74 = (arg0 << super.field3530) + var68;
                        int var75 = (arg1 << super.field3530) + var69;
                        var52.field10491[var53] = (short) var68;
                        var52.field10498[var53] = (short) var69;
                        var52.field10492[var53] = (short) (this.method1730(var74, var75, -1) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field10501[var53] = var71 << 25;
                            } else {
                                var52.field10501[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field10500[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field10501[var53] = class757.method4225(var76, arg10, -3362, method2903(arg6[var53] >> 8, var71));
                            if (arg7 != null) {
                                var52.field10501[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field10493; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field6862.field890.method1138(arg8[var55 * 3], 116).field4464) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field10495 = new int[var52.field10493];
                    }
                    if (var54) {
                        var52.field10497 = new short[var52.field10493];
                        var52.field10496 = new short[var52.field10493];
                    }
                    for (int var56 = 0; var56 < var52.field10493; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field10495[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field6862.field890.method1138(var62, 126).field4464) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field6862.field890.method1138(var63, 54).field4464) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field6862.field890.method1138(var64, 124).field4464) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field10497[var56] = (short) var64;
                                var52.field10496[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field6862.field890.method1138(var65, 91).field4464) {
                                        var52.field10501[var57] = class12.field211[class319.method1899(this.field6862.field890.method1138(var65, 84).field4448 & 65535, (byte) 70) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field6862.field890.method1138(var66, 108).field4464) {
                                        var52.field10501[var58] = class12.field211[class319.method1899(this.field6862.field890.method1138(var66, 54).field4448 & 65535, (byte) 81) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field6862.field890.method1138(var67, 92).field4464) {
                                        var52.field10501[var59] = class12.field211[class319.method1899(this.field6862.field890.method1138(var67, 72).field4448 & 65535, (byte) 106) & 65535];
                                    }
                                }
                                var52.field10497[var56] = -1;
                            }
                        }
                    }
                    this.field6857[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIZLeu;Ldu;[I[I[I[II)V")
    private final void method2908(int arg0, int arg1, boolean arg2, class506 arg3, class376 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class258 var11 = this.field6863[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field6867 == -1) {
                    for (int var12 = 0; var12 < var11.field3057; ++var12) {
                        int var13 = (arg0 << super.field3530) + var11.field3063[var12];
                        int var14 = var11.field3056[var12];
                        int var15 = (arg1 << super.field3530) + var11.field3059[var12];
                        float var16 = (float) var15 * this.field6870 + (float) var13 * this.field6869 + (float) var14 * this.field6866 + this.field6871;
                        if (var16 <= (float) this.field6862.field10059) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7155);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field3064[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7156) {
                            int var19 = (int) (var16 - (float) arg3.field7155);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field6860 + (float) var13 * this.field6873 + (float) var14 * this.field6855 + this.field6864;
                        float var21 = (float) var15 * this.field6872 + (float) var13 * this.field6856 + (float) var14 * this.field6865 + this.field6859;
                        arg5[var12] = (int) ((float) this.field6862.field10076 * var20 / var16) + arg4.field4739;
                        arg6[var12] = (int) ((float) this.field6862.field10062 * var21 / var16) + arg4.field4729;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field3057; ++var22) {
                        int var36 = (arg0 << super.field3530) + var11.field3063[var22];
                        int var37 = var11.field3056[var22];
                        int var38 = (arg1 << super.field3530) + var11.field3059[var22];
                        float var39 = (float) var38 * this.field6870 + (float) var36 * this.field6869 + (float) var37 * this.field6866 + this.field6871;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field6867 - arg3.field7155;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field3064[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7156) {
                            int var42 = this.field6867 - arg3.field7155;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field6860 + (float) var36 * this.field6873 + (float) var37 * this.field6855 + this.field6864;
                        float var44 = (float) var38 * this.field6872 + (float) var36 * this.field6856 + (float) var37 * this.field6865 + this.field6859;
                        arg5[var22] = (int) ((float) this.field6862.field10076 * var43 / (float) this.field6867) + arg4.field4739;
                        arg6[var22] = (int) ((float) this.field6862.field10062 * var44 / (float) this.field6867) + arg4.field4729;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3525;
                for (int var24 = 0; var24 < var11.field3060; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field4737 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field4738 || var29 > arg4.field4738 || var30 > arg4.field4738;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3530;
                            int var35 = arg1 << super.field3530;
                            if ((var11.field3055[var25] & 16777215) != 0) {
                                if (var11.field3061[var25] == var11.field3061[var26] && var11.field3061[var25] == var11.field3061[var27] && var11.field3058[var25] == var11.field3058[var26] && var11.field3058[var25] == var11.field3058[var27]) {
                                    arg4.method2193((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field3063[var25] + var34) / (float) var11.field3058[var25], (float) (var11.field3063[var26] + var34) / (float) var11.field3058[var26], (float) (var11.field3063[var27] + var34) / (float) var11.field3058[var27], (float) (var11.field3059[var25] + var35) / (float) var11.field3058[var25], (float) (var11.field3059[var26] + var35) / (float) var11.field3058[var26], (float) (var11.field3059[var27] + var35) / (float) var11.field3058[var27], var11.field3055[var25], var11.field3055[var26], var11.field3055[var27], arg3.field7160, arg8[var25], arg8[var26], arg8[var27], var11.field3061[var25]);
                                } else {
                                    arg4.method2195((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field3063[var25] + var34) / var23, (float) (var11.field3063[var26] + var34) / var23, (float) (var11.field3063[var27] + var34) / var23, (float) (var11.field3059[var25] + var35) / var23, (float) (var11.field3059[var26] + var35) / var23, (float) (var11.field3059[var27] + var35) / var23, var11.field3055[var25], var11.field3055[var26], var11.field3055[var27], arg3.field7160, arg8[var25], arg8[var26], arg8[var27], var11.field3061[var25], var23 / (float) var11.field3058[var25], var11.field3061[var26], var23 / (float) var11.field3058[var26], var11.field3061[var27], var23 / (float) var11.field3058[var27]);
                                }
                            }
                        } else {
                            arg4.method2203((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7160);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILdu;[I[I[I[II)V")
    private final void method2909(int arg0, int arg1, class376 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class214 var9 = this.field6858[arg0][arg1];
        if (var9 != null) {
            if ((var9.field2526 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field2526 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3525 * arg0;
                int var11 = super.field3525 + var10;
                int var12 = super.field3525 * arg1;
                int var13 = super.field3525 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field2526 & 1) != 0) {
                    int var14 = super.field3526[arg0][arg1];
                    float var15 = (float) var14 * this.field6866;
                    if (this.field6867 == -1) {
                        var16 = (float) var12 * this.field6870 + (float) var10 * this.field6869 + var15 + this.field6871;
                        if (var16 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var17 = (float) var12 * this.field6870 + (float) var11 * this.field6869 + var15 + this.field6871;
                        if (var17 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var18 = (float) var13 * this.field6870 + (float) var11 * this.field6869 + var15 + this.field6871;
                        if (var18 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var19 = (float) var13 * this.field6870 + (float) var10 * this.field6869 + var15 + this.field6871;
                        if (var19 <= (float) this.field6862.field10059) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field6870 + (float) var10 * this.field6869 + var15 + this.field6871;
                        var17 = (float) var12 * this.field6870 + (float) var11 * this.field6869 + var15 + this.field6871;
                        var18 = (float) var13 * this.field6870 + (float) var11 * this.field6869 + var15 + this.field6871;
                        var19 = (float) var13 * this.field6870 + (float) var10 * this.field6869 + var15 + this.field6871;
                    }
                    float var20 = (float) var14 * this.field6855;
                    float var21 = (float) var14 * this.field6865;
                    if (this.field6867 == -1) {
                        float var22 = (float) var12 * this.field6860 + (float) var10 * this.field6873 + var20 + this.field6864;
                        var23 = (int) ((float) this.field6862.field10076 * var22 / var16) + arg2.field4739;
                        float var24 = (float) var12 * this.field6872 + (float) var10 * this.field6856 + var21 + this.field6859;
                        var25 = (int) ((float) this.field6862.field10062 * var24 / var16) + arg2.field4729;
                        float var26 = (float) var12 * this.field6860 + (float) var11 * this.field6873 + var20 + this.field6864;
                        var27 = (int) ((float) this.field6862.field10076 * var26 / var17) + arg2.field4739;
                        float var28 = (float) var12 * this.field6872 + (float) var11 * this.field6856 + var21 + this.field6859;
                        var29 = (int) ((float) this.field6862.field10062 * var28 / var17) + arg2.field4729;
                        float var30 = (float) var13 * this.field6860 + (float) var11 * this.field6873 + var20 + this.field6864;
                        var31 = (int) ((float) this.field6862.field10076 * var30 / var18) + arg2.field4739;
                        float var32 = (float) var13 * this.field6872 + (float) var11 * this.field6856 + var21 + this.field6859;
                        var33 = (int) ((float) this.field6862.field10062 * var32 / var18) + arg2.field4729;
                        float var34 = (float) var13 * this.field6860 + (float) var10 * this.field6873 + var20 + this.field6864;
                        var35 = (int) ((float) this.field6862.field10076 * var34 / var19) + arg2.field4739;
                        float var36 = (float) var13 * this.field6872 + (float) var10 * this.field6856 + var21 + this.field6859;
                        var37 = (int) ((float) this.field6862.field10062 * var36 / var19) + arg2.field4729;
                    } else {
                        float var38 = (float) var12 * this.field6860 + (float) var10 * this.field6873 + var20 + this.field6864;
                        var23 = (int) ((float) this.field6862.field10076 * var38 / (float) this.field6867) + arg2.field4739;
                        float var39 = (float) var12 * this.field6872 + (float) var10 * this.field6856 + var21 + this.field6859;
                        var25 = (int) ((float) this.field6862.field10062 * var39 / (float) this.field6867) + arg2.field4729;
                        float var40 = (float) var12 * this.field6860 + (float) var11 * this.field6873 + var20 + this.field6864;
                        var27 = (int) ((float) this.field6862.field10076 * var40 / (float) this.field6867) + arg2.field4739;
                        float var41 = (float) var12 * this.field6872 + (float) var11 * this.field6856 + var21 + this.field6859;
                        var29 = (int) ((float) this.field6862.field10062 * var41 / (float) this.field6867) + arg2.field4729;
                        float var42 = (float) var13 * this.field6860 + (float) var11 * this.field6873 + var20 + this.field6864;
                        var31 = (int) ((float) this.field6862.field10076 * var42 / (float) this.field6867) + arg2.field4739;
                        float var43 = (float) var13 * this.field6872 + (float) var11 * this.field6856 + var21 + this.field6859;
                        var33 = (int) ((float) this.field6862.field10062 * var43 / (float) this.field6867) + arg2.field4729;
                        float var44 = (float) var13 * this.field6860 + (float) var10 * this.field6873 + var20 + this.field6864;
                        var35 = (int) ((float) this.field6862.field10076 * var44 / (float) this.field6867) + arg2.field4739;
                        float var45 = (float) var13 * this.field6872 + (float) var10 * this.field6856 + var21 + this.field6859;
                        var37 = (int) ((float) this.field6862.field10062 * var45 / (float) this.field6867) + arg2.field4729;
                    }
                } else {
                    int var46 = super.field3526[arg0][arg1];
                    int var47 = super.field3526[arg0 + 1][arg1];
                    int var48 = super.field3526[arg0 + 1][arg1 + 1];
                    int var49 = super.field3526[arg0][arg1 + 1];
                    if (this.field6867 == -1) {
                        var16 = (float) var12 * this.field6870 + (float) var10 * this.field6869 + (float) var46 * this.field6866 + this.field6871;
                        if (var16 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var17 = (float) var12 * this.field6870 + (float) var11 * this.field6869 + (float) var47 * this.field6866 + this.field6871;
                        if (var17 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var18 = (float) var13 * this.field6870 + (float) var11 * this.field6869 + (float) var48 * this.field6866 + this.field6871;
                        if (var18 <= (float) this.field6862.field10059) {
                            return;
                        }
                        var19 = (float) var13 * this.field6870 + (float) var10 * this.field6869 + (float) var49 * this.field6866 + this.field6871;
                        if (var19 <= (float) this.field6862.field10059) {
                            return;
                        }
                        float var50 = (float) var12 * this.field6860 + (float) var10 * this.field6873 + (float) var46 * this.field6855 + this.field6864;
                        var23 = (int) ((float) this.field6862.field10076 * var50 / var16) + arg2.field4739;
                        float var51 = (float) var12 * this.field6872 + (float) var10 * this.field6856 + (float) var46 * this.field6865 + this.field6859;
                        var25 = (int) ((float) this.field6862.field10062 * var51 / var16) + arg2.field4729;
                        float var52 = (float) var12 * this.field6860 + (float) var11 * this.field6873 + (float) var47 * this.field6855 + this.field6864;
                        var27 = (int) ((float) this.field6862.field10076 * var52 / var17) + arg2.field4739;
                        float var53 = (float) var12 * this.field6872 + (float) var11 * this.field6856 + (float) var47 * this.field6865 + this.field6859;
                        var29 = (int) ((float) this.field6862.field10062 * var53 / var17) + arg2.field4729;
                        float var54 = (float) var13 * this.field6860 + (float) var11 * this.field6873 + (float) var48 * this.field6855 + this.field6864;
                        var31 = (int) ((float) this.field6862.field10076 * var54 / var18) + arg2.field4739;
                        float var55 = (float) var13 * this.field6872 + (float) var11 * this.field6856 + (float) var48 * this.field6865 + this.field6859;
                        var33 = (int) ((float) this.field6862.field10062 * var55 / var18) + arg2.field4729;
                        float var56 = (float) var13 * this.field6860 + (float) var10 * this.field6873 + (float) var49 * this.field6855 + this.field6864;
                        var35 = (int) ((float) this.field6862.field10076 * var56 / var19) + arg2.field4739;
                        float var57 = (float) var13 * this.field6872 + (float) var10 * this.field6856 + (float) var49 * this.field6865 + this.field6859;
                        var37 = (int) ((float) this.field6862.field10062 * var57 / var19) + arg2.field4729;
                    } else {
                        var16 = (float) var12 * this.field6870 + (float) var10 * this.field6869 + (float) var46 * this.field6866 + this.field6871;
                        var17 = (float) var12 * this.field6870 + (float) var11 * this.field6869 + (float) var47 * this.field6866 + this.field6871;
                        var18 = (float) var13 * this.field6870 + (float) var11 * this.field6869 + (float) var48 * this.field6866 + this.field6871;
                        var19 = (float) var13 * this.field6870 + (float) var10 * this.field6869 + (float) var49 * this.field6866 + this.field6871;
                        float var58 = (float) var12 * this.field6860 + (float) var10 * this.field6873 + (float) var46 * this.field6855 + this.field6864;
                        var23 = (int) ((float) this.field6862.field10076 * var58 / (float) this.field6867) + arg2.field4739;
                        float var59 = (float) var12 * this.field6872 + (float) var10 * this.field6856 + (float) var46 * this.field6865 + this.field6859;
                        var25 = (int) ((float) this.field6862.field10062 * var59 / (float) this.field6867) + arg2.field4729;
                        float var60 = (float) var12 * this.field6860 + (float) var11 * this.field6873 + (float) var47 * this.field6855 + this.field6864;
                        var27 = (int) ((float) this.field6862.field10076 * var60 / (float) this.field6867) + arg2.field4739;
                        float var61 = (float) var12 * this.field6872 + (float) var11 * this.field6856 + (float) var47 * this.field6865 + this.field6859;
                        var29 = (int) ((float) this.field6862.field10062 * var61 / (float) this.field6867) + arg2.field4729;
                        float var62 = (float) var13 * this.field6860 + (float) var11 * this.field6873 + (float) var48 * this.field6855 + this.field6864;
                        var31 = (int) ((float) this.field6862.field10076 * var62 / (float) this.field6867) + arg2.field4739;
                        float var63 = (float) var13 * this.field6872 + (float) var11 * this.field6856 + (float) var48 * this.field6865 + this.field6859;
                        var33 = (int) ((float) this.field6862.field10062 * var63 / (float) this.field6867) + arg2.field4729;
                        float var64 = (float) var13 * this.field6860 + (float) var10 * this.field6873 + (float) var49 * this.field6855 + this.field6864;
                        var35 = (int) ((float) this.field6862.field10076 * var64 / (float) this.field6867) + arg2.field4739;
                        float var65 = (float) var13 * this.field6872 + (float) var10 * this.field6856 + (float) var49 * this.field6865 + this.field6859;
                        var37 = (int) ((float) this.field6862.field10062 * var65 / (float) this.field6867) + arg2.field4729;
                    }
                }
                if (this.field6867 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field4737 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field4738 || var35 > arg2.field4738 || var27 > arg2.field4738;
                        if (var9.field2525 >= 0) {
                            arg2.method2193((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class12.field211[var9.field2528 & 65535] & 16777215, -16777216 | class12.field211[var9.field2529 & 65535] & 16777215, -16777216 | class12.field211[var9.field2523 & 65535] & 16777215, 0, 0, 0, 0, var9.field2525);
                        } else {
                            arg2.method2197((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field2528 & 65535), (float) (var9.field2529 & 65535), (float) (var9.field2523 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field4737 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field4738 || var27 > arg2.field4738 || var35 > arg2.field4738;
                        if (var9.field2525 >= 0) {
                            arg2.method2193((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class12.field211[var9.field2524 & 65535] & 16777215, -16777216 | class12.field211[var9.field2523 & 65535] & 16777215, -16777216 | class12.field211[var9.field2529 & 65535] & 16777215, 0, 0, 0, 0, var9.field2525);
                            return;
                        }
                        arg2.method2197((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field2524 & 65535), (float) (var9.field2523 & 65535), (float) (var9.field2529 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field4737 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field4738 || var35 > arg2.field4738 || var27 > arg2.field4738;
                        if (var9.field2525 >= 0) {
                            arg2.method2193((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class12.field211[var9.field2528 & 65535] & 16777215, -16777216 | class12.field211[var9.field2529 & 65535] & 16777215, -16777216 | class12.field211[var9.field2523 & 65535] & 16777215, 0, 0, 0, 0, var9.field2525);
                        } else {
                            arg2.method2197((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field2528 & 65535), (float) (var9.field2529 & 65535), (float) (var9.field2523 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field4737 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field4738 || var27 > arg2.field4738 || var35 > arg2.field4738;
                        if (var9.field2525 >= 0) {
                            arg2.method2193((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class12.field211[var9.field2524 & 65535] & 16777215, -16777216 | class12.field211[var9.field2523 & 65535] & 16777215, -16777216 | class12.field211[var9.field2529 & 65535] & 16777215, 0, 0, 0, 0, var9.field2525);
                            return;
                        }
                        arg2.method2197((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field2524 & 65535), (float) (var9.field2523 & 65535), (float) (var9.field2529 & 65535));
                    }
                }
            }
        } else {
            class240 var66 = this.field6853[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field2824 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field6867 == -1) {
                    for (int var67 = 0; var67 < var66.field2827; ++var67) {
                        int var68 = (arg0 << super.field3530) + var66.field2823[var67];
                        short var69 = var66.field2828[var67];
                        int var70 = (arg1 << super.field3530) + var66.field2819[var67];
                        float var71 = (float) var70 * this.field6870 + (float) var68 * this.field6869 + (float) var69 * this.field6866 + this.field6871;
                        if (var71 <= (float) this.field6862.field10059) {
                            return;
                        }
                        float var72 = (float) var70 * this.field6860 + (float) var68 * this.field6873 + (float) var69 * this.field6855 + this.field6864;
                        float var73 = (float) var70 * this.field6872 + (float) var68 * this.field6856 + (float) var69 * this.field6865 + this.field6859;
                        arg3[var67] = (int) ((float) this.field6862.field10076 * var72 / var71) + arg2.field4739;
                        arg4[var67] = (int) ((float) this.field6862.field10062 * var73 / var71) + arg2.field4729;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field2827; ++var74) {
                        int var110 = (arg0 << super.field3530) + var66.field2823[var74];
                        short var111 = var66.field2828[var74];
                        int var112 = (arg1 << super.field3530) + var66.field2819[var74];
                        float var113 = (float) var112 * this.field6870 + (float) var110 * this.field6869 + (float) var111 * this.field6866 + this.field6871;
                        float var114 = (float) var112 * this.field6860 + (float) var110 * this.field6873 + (float) var111 * this.field6855 + this.field6864;
                        float var115 = (float) var112 * this.field6872 + (float) var110 * this.field6856 + (float) var111 * this.field6865 + this.field6859;
                        arg3[var74] = (int) ((float) this.field6862.field10076 * var114 / (float) this.field6867) + arg2.field4739;
                        arg4[var74] = (int) ((float) this.field6862.field10062 * var115 / (float) this.field6867) + arg2.field4729;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field2818 != null) {
                    if (this.field6867 == -1) {
                        for (int var75 = 0; var75 < var66.field2826; ++var75) {
                            short var76 = var66.field2820[var75];
                            short var77 = var66.field2830[var75];
                            short var78 = var66.field2822[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field4737 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field4738 || var80 > arg2.field4738 || var81 > arg2.field4738;
                                short var85 = var66.field2818[var75];
                                if (var85 != -1) {
                                    arg2.method2193((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field2823[var76] / (float) super.field3525, (float) var66.field2823[var77] / (float) super.field3525, (float) var66.field2823[var78] / (float) super.field3525, (float) var66.field2819[var76] / (float) super.field3525, (float) var66.field2819[var77] / (float) super.field3525, (float) var66.field2819[var78] / (float) super.field3525, -16777216 | class12.field211[var66.field2829[var76] & 65535] & 16777215, -16777216 | class12.field211[var66.field2829[var77] & 65535] & 16777215, -16777216 | class12.field211[var66.field2829[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field2825[var75];
                                    if (var86 != -1) {
                                        arg2.method2197((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class477.method2836(-22025, var66.field2829[var76], var86), (float) class477.method2836(-22025, var66.field2829[var77], var86), (float) class477.method2836(-22025, var66.field2829[var78], var86));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field2826; ++var87) {
                        short var88 = var66.field2820[var87];
                        short var89 = var66.field2830[var87];
                        short var90 = var66.field2822[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field4737 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field4738 || var92 > arg2.field4738 || var93 > arg2.field4738;
                            short var97 = var66.field2818[var87];
                            if (var97 != -1) {
                                arg2.method2193((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field2823[var88] / (float) super.field3525, (float) var66.field2823[var89] / (float) super.field3525, (float) var66.field2823[var90] / (float) super.field3525, (float) var66.field2819[var88] / (float) super.field3525, (float) var66.field2819[var89] / (float) super.field3525, (float) var66.field2819[var90] / (float) super.field3525, -16777216 | class12.field211[var66.field2829[var88] & 65535] & 16777215, -16777216 | class12.field211[var66.field2829[var89] & 65535] & 16777215, -16777216 | class12.field211[var66.field2829[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field2825[var87];
                                if (var98 != -1) {
                                    arg2.method2197((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class477.method2836(-22025, var66.field2829[var88], var98), (float) class477.method2836(-22025, var66.field2829[var89], var98), (float) class477.method2836(-22025, var66.field2829[var90], var98));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field2826; ++var99) {
                    short var100 = var66.field2820[var99];
                    short var101 = var66.field2830[var99];
                    short var102 = var66.field2822[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field2825[var99];
                        if (var109 != -1) {
                            arg2.field4737 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field4738 || var104 > arg2.field4738 || var105 > arg2.field4738;
                            arg2.method2197((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class477.method2836(-22025, var66.field2829[var100], var109), (float) class477.method2836(-22025, var66.field2829[var101], var109), (float) class477.method2836(-22025, var66.field2829[var102], var109));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1390(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class7 var8 = this.field6862.field10072;
        this.field6867 = arg5;
        this.field6873 = var8.field117;
        this.field6855 = var8.field114;
        this.field6860 = var8.field116;
        this.field6864 = var8.field102;
        this.field6856 = var8.field128;
        this.field6865 = var8.field121;
        this.field6872 = var8.field122;
        this.field6859 = var8.field129;
        this.field6869 = var8.field106;
        this.field6866 = var8.field109;
        this.field6870 = var8.field126;
        this.field6871 = var8.field130;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3533 && var12 >= 0 && var12 < super.field3524) {
                        this.method2904(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "ka", descriptor = "(III)V")
    public final void method1406(int arg0, int arg1, int arg2) {
        if (this.field6861[arg0][arg1] < arg2) {
            this.field6861[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
    private final boolean method2910(int arg0) {
        if ((this.field6868 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!cq", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1402(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
