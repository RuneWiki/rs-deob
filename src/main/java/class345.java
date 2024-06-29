import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class345 extends class156 {

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lkp;")
    private class283 field4831;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[[I")
    public int[][] field4818;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "[[I")
    private int[][] field4838;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    private int field4837;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[[B")
    private byte[][] field4822;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "[[B")
    private byte[][] field4833;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    private int field4819;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    private int field4823;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    private int field4826;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    private int field4828;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    private int field4829;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    private int field4830;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    private int field4832;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field4835;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    private int field4839;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[[Lon;")
    private class185[][] field4821;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[[Lep;")
    private class241[][] field4817;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[[Lni;")
    private class304[][] field4816;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[[Lda;")
    private class37[][] field4820;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public final void method267(int arg0, int arg1) {
        class336 var3 = this.field4831.method1836(Thread.currentThread());
        var3.field4535.field4520 = 0;
        if (this.field4816 != null) {
            this.method2212(arg0, arg1, this.field4831.field3871, var3.field4535, var3.field4551, var3.field4574, var3.field4566);
        } else {
            if (this.field4820 != null) {
                this.method2213(arg0, arg1, var3.field4535, var3.field4551, var3.field4574, var3.field4566);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III[[ZZ)V")
    public final void method274(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class363 var6 = this.field4831.field3881;
        this.field4824 = var6.field5096;
        this.field4825 = var6.field5097;
        this.field4830 = var6.field5095;
        this.field4823 = var6.field5089;
        this.field4832 = var6.field5099;
        this.field4819 = var6.field5091;
        this.field4828 = var6.field5088;
        this.field4826 = var6.field5098;
        this.field4839 = var6.field5090;
        this.field4834 = var6.field5093;
        this.field4835 = var6.field5094;
        this.field4829 = var6.field5092;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII[[ZLk;[I[I)V")
    private final void method2211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class335 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4524 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4820[var16][var17] != null) {
                        class37 var18 = this.field4820[var16][var17];
                        if (var18.field558 != -1 && (var18.field563 & 2) == 0 && var18.field557 == -1) {
                            int var19 = this.field4831.method1833(var18.field558);
                            arg8.method2087(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class34.method252(var19, var18.field562 & 65535, -113), class34.method252(var19, var18.field561 & 65535, -126), class34.method252(var19, var18.field559 & 65535, 58));
                            arg8.method2087(var15, var15, var15 - var13, var14, var13 + var14, var14, class34.method252(var19, var18.field560 & 65535, 86), class34.method252(var19, var18.field559 & 65535, -117), class34.method252(var19, var18.field561 & 65535, 68));
                        } else if (var18.field557 == -1) {
                            arg8.method2087(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field562 & 65535, var18.field561 & 65535, var18.field559 & 65535);
                            arg8.method2087(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field560 & 65535, var18.field559 & 65535, var18.field561 & 65535);
                        } else {
                            int var20 = var18.field557;
                            arg8.method2087(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2087(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field4821[var16][var17] != null) {
                        class185 var21 = this.field4821[var16][var17];
                        for (int var22 = 0; var22 < var21.field2585; ++var22) {
                            arg9[var22] = (var21.field2590[var22] - this.field4836 * var16) * var13 / this.field4836 + var14;
                            arg10[var22] = var15 - (var21.field2589[var22] - this.field4836 * var17) * var13 / this.field4836;
                        }
                        for (int var23 = 0; var23 < var21.field2582; ++var23) {
                            short var24 = var21.field2581[var23];
                            short var25 = var21.field2580[var23];
                            short var26 = var21.field2592[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2586 != null && var21.field2586[var23] != -1) {
                                int var33 = var21.field2586[var23];
                                arg8.method2087(var30, var31, var32, var27, var28, var29, class34.method252(var33, var21.field2587[var24], -110), class34.method252(var33, var21.field2587[var25], -109), class34.method252(var33, var21.field2587[var26], 63));
                            } else if (var21.field2591 != null && var21.field2591[var23] != -1) {
                                int var34 = this.field4831.method1833(var21.field2591[var23]);
                                arg8.method2087(var30, var31, var32, var27, var28, var29, class34.method252(var34, var21.field2587[var24], 61), class34.method252(var34, var21.field2587[var25], 91), class34.method252(var34, var21.field2587[var26], -97));
                            } else {
                                int var35 = var21.field2584[var23];
                                arg8.method2087(var30, var31, var32, var27, var28, var29, class34.method252(var35, var21.field2587[var24], -111), class34.method252(var35, var21.field2587[var25], -111), class34.method252(var35, var21.field2587[var26], -109));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4524 = true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZLk;[I[I[I)V")
    private final void method2212(int arg0, int arg1, boolean arg2, class335 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class304 var8 = this.field4816[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4183 & 2) == 0) {
                int var9 = this.field4836 * arg0;
                int var10 = this.field4836 + var9;
                int var11 = this.field4836 * arg1;
                int var12 = this.field4836 + var11;
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
                if ((var8.field4183 & 1) != 0 && !arg2) {
                    int var17 = this.field4818[arg0][arg1];
                    int var18 = this.field4834 * var17;
                    var19 = (this.field4835 * var11 + this.field4839 * var9 + var18 >> 15) + this.field4829;
                    if (var19 <= this.field4831.field3892) {
                        return;
                    }
                    var20 = (this.field4835 * var11 + this.field4839 * var10 + var18 >> 15) + this.field4829;
                    if (var20 <= this.field4831.field3892) {
                        return;
                    }
                    var21 = (this.field4835 * var12 + this.field4839 * var10 + var18 >> 15) + this.field4829;
                    if (var21 <= this.field4831.field3892) {
                        return;
                    }
                    var22 = (this.field4835 * var12 + this.field4839 * var9 + var18 >> 15) + this.field4829;
                    if (var22 <= this.field4831.field3892) {
                        return;
                    }
                    if (this.field4831.field3888) {
                        int var23 = var19 - this.field4831.field3902;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field4831.field3902;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field4831.field3902;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field4831.field3902;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field4825 * var17;
                    int var28 = this.field4819 * var17;
                    var29 = (this.field4830 * var11 + this.field4824 * var9 + var27 >> 15) + this.field4823;
                    var30 = this.field4831.field3909 * var29 / var19 + arg3.field4531;
                    var31 = (this.field4828 * var11 + this.field4832 * var9 + var28 >> 15) + this.field4826;
                    var32 = this.field4831.field3886 * var31 / var19 + arg3.field4522;
                    var33 = (this.field4830 * var11 + this.field4824 * var10 + var27 >> 15) + this.field4823;
                    var34 = this.field4831.field3909 * var33 / var20 + arg3.field4531;
                    var35 = (this.field4828 * var11 + this.field4832 * var10 + var28 >> 15) + this.field4826;
                    var36 = this.field4831.field3886 * var35 / var20 + arg3.field4522;
                    var37 = (this.field4830 * var12 + this.field4824 * var10 + var27 >> 15) + this.field4823;
                    var38 = this.field4831.field3909 * var37 / var21 + arg3.field4531;
                    var39 = (this.field4828 * var12 + this.field4832 * var10 + var28 >> 15) + this.field4826;
                    var40 = this.field4831.field3886 * var39 / var21 + arg3.field4522;
                    var41 = (this.field4830 * var12 + this.field4824 * var9 + var27 >> 15) + this.field4823;
                    var42 = this.field4831.field3909 * var41 / var22 + arg3.field4531;
                    var43 = (this.field4828 * var12 + this.field4832 * var9 + var28 >> 15) + this.field4826;
                    var44 = this.field4831.field3886 * var43 / var22 + arg3.field4522;
                } else {
                    int var45 = this.field4818[arg0][arg1];
                    int var46 = this.field4818[arg0 + 1][arg1];
                    int var47 = this.field4818[arg0 + 1][arg1 + 1];
                    int var48 = this.field4818[arg0][arg1 + 1];
                    var19 = (this.field4835 * var11 + this.field4839 * var9 + this.field4834 * var45 >> 15) + this.field4829;
                    if (var19 <= this.field4831.field3892) {
                        return;
                    }
                    var20 = (this.field4835 * var11 + this.field4839 * var10 + this.field4834 * var46 >> 15) + this.field4829;
                    if (var20 <= this.field4831.field3892) {
                        return;
                    }
                    var21 = (this.field4835 * var12 + this.field4839 * var10 + this.field4834 * var47 >> 15) + this.field4829;
                    if (var21 <= this.field4831.field3892) {
                        return;
                    }
                    var22 = (this.field4835 * var12 + this.field4839 * var9 + this.field4834 * var48 >> 15) + this.field4829;
                    if (var22 <= this.field4831.field3892) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field4831.field3902;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field4838[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field4831.field3902;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field4838[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field4831.field3902;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field4838[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field4831.field3902;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field4838[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field4831.field3888) {
                        int var57 = var19 - this.field4831.field3902;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field4831.field3902;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field4831.field3902;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field4831.field3902;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field4830 * var11 + this.field4825 * var45 + this.field4824 * var9 >> 15) + this.field4823;
                    var30 = this.field4831.field3909 * var29 / var19 + arg3.field4531;
                    var31 = (this.field4828 * var11 + this.field4832 * var9 + this.field4819 * var45 >> 15) + this.field4826;
                    var32 = this.field4831.field3886 * var31 / var19 + arg3.field4522;
                    var33 = (this.field4830 * var11 + this.field4825 * var46 + this.field4824 * var10 >> 15) + this.field4823;
                    var34 = this.field4831.field3909 * var33 / var20 + arg3.field4531;
                    var35 = (this.field4828 * var11 + this.field4832 * var10 + this.field4819 * var46 >> 15) + this.field4826;
                    var36 = this.field4831.field3886 * var35 / var20 + arg3.field4522;
                    var37 = (this.field4830 * var12 + this.field4825 * var47 + this.field4824 * var10 >> 15) + this.field4823;
                    var38 = this.field4831.field3909 * var37 / var21 + arg3.field4531;
                    var39 = (this.field4828 * var12 + this.field4832 * var10 + this.field4819 * var47 >> 15) + this.field4826;
                    var40 = this.field4831.field3886 * var39 / var21 + arg3.field4522;
                    var41 = (this.field4830 * var12 + this.field4825 * var48 + this.field4824 * var9 >> 15) + this.field4823;
                    var42 = this.field4831.field3909 * var41 / var22 + arg3.field4531;
                    var43 = (this.field4828 * var12 + this.field4832 * var9 + this.field4819 * var48 >> 15) + this.field4826;
                    var44 = this.field4831.field3886 * var43 / var22 + arg3.field4522;
                }
                boolean var61 = var8.field4179 != -1 && this.method2214(this.field4831.field3900.method607(false, var8.field4179).field2299);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field4525 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field4529 || var42 > arg3.field4529 || var34 > arg3.field4529;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field4520 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field4179 >= 0) {
                                arg3.method2076(var40, var44, var36, var38, var42, var34, this.field4831.field3875, var15, var16, var14, var8.field4181, var8.field4180, var8.field4182, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4179);
                            } else {
                                arg3.method2078(var40, var44, var36, var38, var42, var34, class155.method1043(var8.field4181, var15 << 24 | this.field4831.field3875, -104), class155.method1043(var8.field4180, var16 << 24 | this.field4831.field3875, -112), class155.method1043(var8.field4182, var14 << 24 | this.field4831.field3875, -96));
                            }
                        } else if (var8.field4179 >= 0) {
                            arg3.method2077(var40, var44, var36, var38, var42, var34, var8.field4181, var8.field4180, var8.field4182, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4179);
                        } else {
                            arg3.method2078(var40, var44, var36, var38, var42, var34, var8.field4181, var8.field4180, var8.field4182);
                        }
                        arg3.field4520 = 0;
                    } else {
                        arg3.method2084(var40, var44, var36, var38, var42, var34, this.field4831.field3875);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field4525 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field4529 || var34 > arg3.field4529 || var42 > arg3.field4529;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field4520 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field4179 >= 0) {
                                arg3.method2076(var32, var36, var44, var30, var34, var42, this.field4831.field3875, var13, var14, var16, var8.field4178, var8.field4182, var8.field4180, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4179);
                            } else {
                                arg3.method2078(var32, var36, var44, var30, var34, var42, class155.method1043(var8.field4178, var13 << 24 | this.field4831.field3875, -93), class155.method1043(var8.field4182, var14 << 24 | this.field4831.field3875, -123), class155.method1043(var8.field4180, var16 << 24 | this.field4831.field3875, -120));
                            }
                        } else if (var8.field4179 >= 0) {
                            arg3.method2077(var32, var36, var44, var30, var34, var42, var8.field4178, var8.field4182, var8.field4180, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4179);
                        } else {
                            arg3.method2078(var32, var36, var44, var30, var34, var42, var8.field4178, var8.field4182, var8.field4180);
                        }
                        arg3.field4520 = 0;
                        return;
                    }
                    arg3.method2084(var32, var36, var44, var30, var34, var42, this.field4831.field3875);
                }
            }
        } else {
            class241 var64 = this.field4817[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field3339; ++var65) {
                    short var105 = var64.field3343[var65];
                    int var106 = var64.field3344[var65];
                    short var107 = var64.field3341[var65];
                    int var108 = (this.field4835 * var107 + this.field4839 * var105 + this.field4834 * var106 >> 15) + this.field4829;
                    if (var108 <= this.field4831.field3892) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field4831.field3902;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field3338[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field4831.field3888) {
                        int var111 = var108 - this.field4831.field3902;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field4830 * var107 + this.field4825 * var106 + this.field4824 * var105 >> 15) + this.field4823;
                    int var113 = (this.field4828 * var107 + this.field4832 * var105 + this.field4819 * var106 >> 15) + this.field4826;
                    arg4[var65] = this.field4831.field3909 * var112 / var108 + arg3.field4531;
                    arg5[var65] = this.field4831.field3886 * var113 / var108 + arg3.field4522;
                }
                if (var64.field3342 != null) {
                    int var66 = this.field4818[arg0][arg1];
                    int var67 = this.field4818[arg0 + 1][arg1];
                    int var68 = this.field4818[arg0][arg1 + 1];
                    int var69 = this.field4836 * arg0;
                    int var70 = this.field4836 + var69;
                    int var71 = this.field4836 * arg1;
                    int var72 = this.field4836 + var71;
                    int var73 = (this.field4830 * var71 + this.field4825 * var66 + this.field4824 * var69 >> 15) + this.field4823;
                    int var74 = (this.field4828 * var71 + this.field4832 * var69 + this.field4819 * var66 >> 15) + this.field4826;
                    int var75 = (this.field4835 * var71 + this.field4839 * var69 + this.field4834 * var66 >> 15) + this.field4829;
                    int var76 = (this.field4830 * var71 + this.field4825 * var67 + this.field4824 * var70 >> 15) + this.field4823;
                    int var77 = (this.field4828 * var71 + this.field4832 * var70 + this.field4819 * var67 >> 15) + this.field4826;
                    int var78 = (this.field4835 * var71 + this.field4839 * var70 + this.field4834 * var67 >> 15) + this.field4829;
                    int var79 = (this.field4830 * var72 + this.field4825 * var68 + this.field4824 * var69 >> 15) + this.field4823;
                    int var80 = (this.field4828 * var72 + this.field4832 * var69 + this.field4819 * var68 >> 15) + this.field4826;
                    int var81 = (this.field4835 * var72 + this.field4839 * var69 + this.field4834 * var68 >> 15) + this.field4829;
                    for (int var82 = 0; var82 < var64.field3347; ++var82) {
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
                            arg3.field4525 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field4529 || var87 > arg3.field4529 || var88 > arg3.field4529;
                            short var93 = var64.field3342[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method2214(this.field4831.field3900.method607(false, var93).field2299)) {
                                    arg3.field4520 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2076(var89, var90, var91, var86, var87, var88, this.field4831.field3875, arg6[var83], arg6[var84], arg6[var85], var64.field3345[var83], var64.field3345[var84], var64.field3345[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field3345[var83] & 16777215) != 0) {
                                        arg3.method2078(var89, var90, var91, var86, var87, var88, class155.method1043(var64.field3345[var83], arg6[var83] << 24 | this.field4831.field3875, -126), class155.method1043(var64.field3345[var84], arg6[var84] << 24 | this.field4831.field3875, -125), class155.method1043(var64.field3345[var85], arg6[var85] << 24 | this.field4831.field3875, -115));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2077(var89, var90, var91, var86, var87, var88, var64.field3345[var83], var64.field3345[var84], var64.field3345[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field3345[var83] & 16777215) != 0) {
                                    arg3.method2078(var89, var90, var91, var86, var87, var88, var64.field3345[var83], var64.field3345[var84], var64.field3345[var85]);
                                }
                                arg3.field4520 = 0;
                            } else {
                                arg3.method2084(var89, var90, var91, var86, var87, var88, this.field4831.field3875);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field3347; ++var94) {
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
                        arg3.field4525 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field4529 || var99 > arg3.field4529 || var100 > arg3.field4529;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field3345[var95] & 16777215) != 0) {
                                    arg3.method2078(var101, var102, var103, var98, var99, var100, class281.method1730(var64.field3345[var95], arg6[var95], 1, this.field4831.field3875), class281.method1730(var64.field3345[var96], arg6[var96], 1, this.field4831.field3875), class281.method1730(var64.field3345[var97], arg6[var97], 1, this.field4831.field3875));
                                }
                            } else if ((var64.field3345[var95] & 16777215) != 0) {
                                arg3.method2078(var101, var102, var103, var98, var99, var100, var64.field3345[var95], var64.field3345[var96], var64.field3345[var97]);
                            }
                        } else {
                            arg3.method2084(var101, var102, var103, var98, var99, var100, this.field4831.field3875);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILk;[I[I[I)V")
    private final void method2213(int arg0, int arg1, class335 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class37 var7 = this.field4820[arg0][arg1];
        if (var7 != null) {
            if ((var7.field563 & 2) == 0) {
                int var8 = this.field4836 * arg0;
                int var9 = this.field4836 + var8;
                int var10 = this.field4836 * arg1;
                int var11 = this.field4836 + var10;
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
                if ((var7.field563 & 1) != 0) {
                    int var12 = this.field4818[arg0][arg1];
                    int var13 = this.field4834 * var12;
                    var14 = (this.field4835 * var10 + this.field4839 * var8 + var13 >> 15) + this.field4829;
                    if (var14 <= this.field4831.field3892) {
                        return;
                    }
                    var15 = (this.field4835 * var10 + this.field4839 * var9 + var13 >> 15) + this.field4829;
                    if (var15 <= this.field4831.field3892) {
                        return;
                    }
                    int var16 = (this.field4835 * var11 + this.field4839 * var9 + var13 >> 15) + this.field4829;
                    if (var16 <= this.field4831.field3892) {
                        return;
                    }
                    var17 = (this.field4835 * var11 + this.field4839 * var8 + var13 >> 15) + this.field4829;
                    if (var17 <= this.field4831.field3892) {
                        return;
                    }
                    int var18 = this.field4825 * var12;
                    int var19 = this.field4819 * var12;
                    var20 = (this.field4830 * var10 + this.field4824 * var8 + var18 >> 15) + this.field4823;
                    var21 = this.field4831.field3909 * var20 / var14 + arg2.field4531;
                    var22 = (this.field4828 * var10 + this.field4832 * var8 + var19 >> 15) + this.field4826;
                    var23 = this.field4831.field3886 * var22 / var14 + arg2.field4522;
                    var24 = (this.field4830 * var10 + this.field4824 * var9 + var18 >> 15) + this.field4823;
                    var25 = this.field4831.field3909 * var24 / var15 + arg2.field4531;
                    var26 = (this.field4828 * var10 + this.field4832 * var9 + var19 >> 15) + this.field4826;
                    var27 = this.field4831.field3886 * var26 / var15 + arg2.field4522;
                    int var28 = (this.field4830 * var11 + this.field4824 * var9 + var18 >> 15) + this.field4823;
                    var29 = this.field4831.field3909 * var28 / var16 + arg2.field4531;
                    int var30 = (this.field4828 * var11 + this.field4832 * var9 + var19 >> 15) + this.field4826;
                    var31 = this.field4831.field3886 * var30 / var16 + arg2.field4522;
                    var32 = (this.field4830 * var11 + this.field4824 * var8 + var18 >> 15) + this.field4823;
                    var33 = this.field4831.field3909 * var32 / var17 + arg2.field4531;
                    var34 = (this.field4828 * var11 + this.field4832 * var8 + var19 >> 15) + this.field4826;
                    var35 = this.field4831.field3886 * var34 / var17 + arg2.field4522;
                } else {
                    int var36 = this.field4818[arg0][arg1];
                    int var37 = this.field4818[arg0 + 1][arg1];
                    int var38 = this.field4818[arg0 + 1][arg1 + 1];
                    int var39 = this.field4818[arg0][arg1 + 1];
                    var14 = (this.field4835 * var10 + this.field4839 * var8 + this.field4834 * var36 >> 15) + this.field4829;
                    if (var14 <= this.field4831.field3892) {
                        return;
                    }
                    var15 = (this.field4835 * var10 + this.field4839 * var9 + this.field4834 * var37 >> 15) + this.field4829;
                    if (var15 <= this.field4831.field3892) {
                        return;
                    }
                    int var40 = (this.field4835 * var11 + this.field4839 * var9 + this.field4834 * var38 >> 15) + this.field4829;
                    if (var40 <= this.field4831.field3892) {
                        return;
                    }
                    var17 = (this.field4835 * var11 + this.field4839 * var8 + this.field4834 * var39 >> 15) + this.field4829;
                    if (var17 <= this.field4831.field3892) {
                        return;
                    }
                    var20 = (this.field4830 * var10 + this.field4825 * var36 + this.field4824 * var8 >> 15) + this.field4823;
                    var21 = this.field4831.field3909 * var20 / var14 + arg2.field4531;
                    var22 = (this.field4828 * var10 + this.field4832 * var8 + this.field4819 * var36 >> 15) + this.field4826;
                    var23 = this.field4831.field3886 * var22 / var14 + arg2.field4522;
                    var24 = (this.field4830 * var10 + this.field4825 * var37 + this.field4824 * var9 >> 15) + this.field4823;
                    var25 = this.field4831.field3909 * var24 / var15 + arg2.field4531;
                    var26 = (this.field4828 * var10 + this.field4832 * var9 + this.field4819 * var37 >> 15) + this.field4826;
                    var27 = this.field4831.field3886 * var26 / var15 + arg2.field4522;
                    int var41 = (this.field4830 * var11 + this.field4825 * var38 + this.field4824 * var9 >> 15) + this.field4823;
                    var29 = this.field4831.field3909 * var41 / var40 + arg2.field4531;
                    int var42 = (this.field4828 * var11 + this.field4832 * var9 + this.field4819 * var38 >> 15) + this.field4826;
                    var31 = this.field4831.field3886 * var42 / var40 + arg2.field4522;
                    var32 = (this.field4830 * var11 + this.field4825 * var39 + this.field4824 * var8 >> 15) + this.field4823;
                    var33 = this.field4831.field3909 * var32 / var17 + arg2.field4531;
                    var34 = (this.field4828 * var11 + this.field4832 * var8 + this.field4819 * var39 >> 15) + this.field4826;
                    var35 = this.field4831.field3886 * var34 / var17 + arg2.field4522;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field4525 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field4529 || var33 > arg2.field4529 || var25 > arg2.field4529;
                    if (var7.field558 >= 0) {
                        if (this.method2214(this.field4831.field3900.method607(false, var7.field558).field2299)) {
                            arg2.field4520 = 100;
                        }
                        arg2.method2077(var31, var35, var27, var29, var33, var25, var7.field562 & 65535, var7.field561 & 65535, var7.field559 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field558);
                        arg2.field4520 = 0;
                    } else {
                        arg2.method2087(var31, var35, var27, var29, var33, var25, var7.field562 & 65535, var7.field561 & 65535, var7.field559 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field4525 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field4529 || var25 > arg2.field4529 || var33 > arg2.field4529;
                    if (var7.field558 >= 0) {
                        if (this.method2214(this.field4831.field3900.method607(false, var7.field558).field2299)) {
                            arg2.field4520 = 100;
                        }
                        arg2.method2077(var23, var27, var35, var21, var25, var33, var7.field560 & 65535, var7.field559 & 65535, var7.field561 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field558);
                        arg2.field4520 = 0;
                        return;
                    }
                    arg2.method2087(var23, var27, var35, var21, var25, var33, var7.field560 & 65535, var7.field559 & 65535, var7.field561 & 65535);
                }
            }
        } else {
            class185 var43 = this.field4821[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field2585; ++var44) {
                    int var84 = var43.field2590[var44];
                    int var85 = var43.field2588[var44];
                    int var86 = var43.field2589[var44];
                    int var87 = (this.field4835 * var86 + this.field4839 * var84 + this.field4834 * var85 >> 15) + this.field4829;
                    if (var87 <= this.field4831.field3892) {
                        return;
                    }
                    int var88 = (this.field4830 * var86 + this.field4825 * var85 + this.field4824 * var84 >> 15) + this.field4823;
                    int var89 = (this.field4828 * var86 + this.field4832 * var84 + this.field4819 * var85 >> 15) + this.field4826;
                    arg3[var44] = this.field4831.field3909 * var88 / var87 + arg2.field4531;
                    arg4[var44] = this.field4831.field3886 * var89 / var87 + arg2.field4522;
                }
                if (var43.field2591 != null) {
                    int var45 = this.field4818[arg0][arg1];
                    int var46 = this.field4818[arg0 + 1][arg1];
                    int var47 = this.field4818[arg0][arg1 + 1];
                    int var48 = this.field4836 * arg0;
                    int var49 = this.field4836 + var48;
                    int var50 = this.field4836 * arg1;
                    int var51 = this.field4836 + var50;
                    int var52 = (this.field4830 * var50 + this.field4825 * var45 + this.field4824 * var48 >> 15) + this.field4823;
                    int var53 = (this.field4828 * var50 + this.field4832 * var48 + this.field4819 * var45 >> 15) + this.field4826;
                    int var54 = (this.field4835 * var50 + this.field4839 * var48 + this.field4834 * var45 >> 15) + this.field4829;
                    int var55 = (this.field4830 * var50 + this.field4825 * var46 + this.field4824 * var49 >> 15) + this.field4823;
                    int var56 = (this.field4828 * var50 + this.field4832 * var49 + this.field4819 * var46 >> 15) + this.field4826;
                    int var57 = (this.field4835 * var50 + this.field4839 * var49 + this.field4834 * var46 >> 15) + this.field4829;
                    int var58 = (this.field4830 * var51 + this.field4825 * var47 + this.field4824 * var48 >> 15) + this.field4823;
                    int var59 = (this.field4828 * var51 + this.field4832 * var48 + this.field4819 * var47 >> 15) + this.field4826;
                    int var60 = (this.field4835 * var51 + this.field4839 * var48 + this.field4834 * var47 >> 15) + this.field4829;
                    for (int var61 = 0; var61 < var43.field2582; ++var61) {
                        short var62 = var43.field2581[var61];
                        short var63 = var43.field2580[var61];
                        short var64 = var43.field2592[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field4525 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field4529 || var66 > arg2.field4529 || var67 > arg2.field4529;
                            short var71 = var43.field2591[var61];
                            if (var71 != -1) {
                                if (this.method2214(this.field4831.field3900.method607(false, var71).field2299)) {
                                    arg2.field4520 = 100;
                                }
                                arg2.method2077(var68, var69, var70, var65, var66, var67, var43.field2587[var62], var43.field2587[var63], var43.field2587[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field4520 = 0;
                            } else {
                                int var72 = var43.field2584[var61];
                                if (var72 != -1) {
                                    arg2.method2087(var68, var69, var70, var65, var66, var67, class34.method252(var72, var43.field2587[var62], -121), class34.method252(var72, var43.field2587[var63], -101), class34.method252(var72, var43.field2587[var64], -97));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field2582; ++var73) {
                    short var74 = var43.field2581[var73];
                    short var75 = var43.field2580[var73];
                    short var76 = var43.field2592[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field2584[var73];
                        if (var83 != -1) {
                            arg2.field4525 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field4529 || var78 > arg2.field4529 || var79 > arg2.field4529;
                            arg2.method2087(var80, var81, var82, var77, var78, var79, class34.method252(var83, var43.field2587[var74], 28), class34.method252(var83, var43.field2587[var75], -117), class34.method252(var83, var43.field2587[var76], 62));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)Z")
    private final boolean method2214(int arg0) {
        if ((this.field4827 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lek;IIIIZ)Z")
    public final boolean method276(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method270(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field4816 == null) {
            this.field4816 = new class304[super.field2207][super.field2215];
            this.field4817 = new class241[super.field2207][super.field2215];
        } else if (this.field4820 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class293.field4057[class77.method549(arg5[var13], 127) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class293.field4057[class77.method549(arg6[var14], 127) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field4836 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field4836 && arg4[var20] == this.field4836) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field4836) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field4836 != arg2[var22] && arg2[0] - this.field4836 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field4836 != arg4[var22] && arg4[0] - this.field4836 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class304 var23 = new class304();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field4184 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field4183 = (byte) (var23.field4183 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field4818[arg0 + 1][arg1] == this.field4818[arg0][arg1] && this.field4818[arg0 + 1][arg1 + 1] == this.field4818[arg0][arg1] && this.field4818[arg0][arg1 + 1] == this.field4818[arg0][arg1]) {
                    var23.field4183 = (byte) (var23.field4183 | 1);
                }
                if (var25 != -1 && (var23.field4183 & 2) == 0 && !this.field4831.field3900.method607(false, var25).field2317) {
                    var23.field4178 = this.field4822[arg0][arg1] - this.field4833[arg0][arg1];
                    var23.field4182 = this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1];
                    var23.field4181 = this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1];
                    var23.field4180 = this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1];
                    var23.field4179 = (short) var25;
                } else {
                    int var26;
                    if (this.field4838 != null && arg10 != 0) {
                        var26 = this.field4838[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field4178 = class281.method1730(method2216(arg5[var16] >> 8, this.field4822[arg0][arg1] - this.field4833[arg0][arg1]), var26, 1, arg9);
                    if (var23.field4184 != 0) {
                        var23.field4178 |= 255 - (this.field4822[arg0][arg1] - this.field4833[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field4838 != null && arg10 != 0) {
                        var27 = this.field4838[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field4182 = class281.method1730(method2216(arg5[var17] >> 8, this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1]), var27, 1, arg9);
                    if (var23.field4184 != 0) {
                        var23.field4182 |= 255 - (this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field4838 != null && arg10 != 0) {
                        var28 = this.field4838[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field4181 = class281.method1730(method2216(arg5[var18] >> 8, this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1]), var28, 1, arg9);
                    if (var23.field4184 != 0) {
                        var23.field4181 |= 255 - (this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field4838 != null && arg10 != 0) {
                        var29 = this.field4838[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field4180 = class281.method1730(method2216(arg5[var19] >> 8, this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1]), var29, 1, arg9);
                    if (var23.field4184 != 0) {
                        var23.field4180 |= 255 - (this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1]) << 25;
                    }
                    var23.field4179 = -1;
                }
                this.field4816[arg0][arg1] = var23;
            } else {
                class241 var30 = new class241();
                var30.field3339 = (short) arg2.length;
                var30.field3347 = (short) (arg2.length / 3);
                var30.field3343 = new short[var30.field3339];
                var30.field3344 = new short[var30.field3339];
                var30.field3341 = new short[var30.field3339];
                var30.field3345 = new int[var30.field3339];
                if (this.field4838 != null) {
                    var30.field3338 = new short[var30.field3339];
                }
                for (int var31 = 0; var31 < var30.field3339; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field4822[arg0][arg1] - this.field4833[arg0][arg1];
                    } else if (var46 == 0 && this.field4836 == var47) {
                        var49 = this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1];
                    } else if (this.field4836 == var46 && this.field4836 == var47) {
                        var49 = this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1];
                    } else if (this.field4836 == var46 && var47 == 0) {
                        var49 = this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1]) * var46 + (this.field4822[arg0][arg1] - this.field4833[arg0][arg1]) * (this.field4836 - var46);
                        int var51 = (this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1]) * var46 + (this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1]) * (this.field4836 - var46);
                        var49 = (this.field4836 - var47) * var50 + var47 * var51 >> this.field4837 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field4837) + var46);
                    short var53 = (short) ((arg1 << this.field4837) + var47);
                    var30.field3343[var31] = var52;
                    var30.field3341[var31] = var53;
                    var30.field3344[var31] = (short) (this.method278(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field4831.field3900.method607(false, arg7[var31]).field2317) {
                        var30.field3345[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field3345[var31] = var49 << 25;
                        } else {
                            var30.field3345[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field4838 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field4838[arg0][arg1];
                            } else if (var46 == 0 && this.field4836 == var47) {
                                var56 = this.field4838[arg0][arg1 + 1];
                            } else if (this.field4836 == var46 && this.field4836 == var47) {
                                var56 = this.field4838[arg0 + 1][arg1 + 1];
                            } else if (this.field4836 == var46 && var47 == 0) {
                                var56 = this.field4838[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field4836 - var46) * this.field4838[arg0][arg1] + this.field4838[arg0 + 1][arg1] * var46;
                                int var58 = (this.field4836 - var46) * this.field4838[arg0][arg1 + 1] + this.field4838[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field4836 - var47) * var57 + var47 * var58 >> this.field4837 * 2;
                            }
                            var30.field3338[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field3345[var31] = class281.method1730(method2216(arg5[var31] >> 8, var49), var54, 1, arg9);
                        if (arg6 != null) {
                            var30.field3345[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field3347; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field4831.field3900.method607(false, arg7[var33 * 3]).field2317) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field3346 = new int[var30.field3347];
                }
                if (var32) {
                    var30.field3342 = new short[var30.field3347];
                    var30.field3340 = new short[var30.field3347];
                }
                for (int var34 = 0; var34 < var30.field3347; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field3346[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field4831.field3900.method607(false, var40).field2317) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field4831.field3900.method607(false, var41).field2317) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field4831.field3900.method607(false, var42).field2317) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field3342[var34] = (short) var42;
                            var30.field3340[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field4831.field3900.method607(false, var43).field2317) {
                                    var30.field3345[var35] = class293.field4057[class77.method549(this.field4831.field3900.method607(false, var43).field2303 & 65535, 127) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field4831.field3900.method607(false, var44).field2317) {
                                    var30.field3345[var36] = class293.field4057[class77.method549(this.field4831.field3900.method607(false, var44).field2303 & 65535, 127) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field4831.field3900.method607(false, var45).field2317) {
                                    var30.field3345[var37] = class293.field4057[class77.method549(this.field4831.field3900.method607(false, var45).field2303 & 65535, 127) & 65535];
                                }
                            }
                            var30.field3342[var34] = -1;
                        }
                    }
                }
                this.field4817[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lek;IIIIZ)V")
    public final void method273(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method280() {
        this.field4822 = null;
        this.field4833 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
    public final int method278(int arg0, int arg1) {
        int var3 = arg0 >> this.field4837;
        int var4 = arg1 >> this.field4837;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2207 - 1 && var4 <= super.field2215 - 1) {
            int var5 = arg0 & this.field4836 - 1;
            int var6 = arg1 & this.field4836 - 1;
            int var7 = (this.field4836 - var5) * this.field4818[var3][var4] + this.field4818[var3 + 1][var4] * var5 >> this.field4837;
            int var8 = (this.field4836 - var5) * this.field4818[var3][var4 + 1] + this.field4818[var3 + 1][var4 + 1] * var5 >> this.field4837;
            return (this.field4836 - var6) * var7 + var6 * var8 >> this.field4837;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IIIIIII[[ZLk;[I[I)V")
    private final void method2215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class335 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4524 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4816[var16][var17] != null) {
                        class304 var18 = this.field4816[var16][var17];
                        if (var18.field4179 != -1 && (var18.field4183 & 2) == 0 && var18.field4184 == 0) {
                            int var19 = this.field4831.method1833(var18.field4179);
                            arg8.method2087(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class34.method252(var19, var18.field4181, 73), class34.method252(var19, var18.field4180, 110), class34.method252(var19, var18.field4182, 95));
                            arg8.method2087(var15, var15, var15 - var13, var14, var13 + var14, var14, class34.method252(var19, var18.field4178, 124), class34.method252(var19, var18.field4182, 90), class34.method252(var19, var18.field4180, -101));
                        } else if (var18.field4184 == 0) {
                            arg8.method2078(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4181, var18.field4180, var18.field4182);
                            arg8.method2078(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4178, var18.field4182, var18.field4180);
                        } else {
                            int var20 = var18.field4184;
                            arg8.method2078(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class155.method1043(var20, var18.field4181 & -16777216, -113), class155.method1043(var20, var18.field4180 & -16777216, -83), class155.method1043(var20, var18.field4182 & -16777216, -121));
                            arg8.method2078(var15, var15, var15 - var13, var14, var13 + var14, var14, class155.method1043(var20, var18.field4178 & -16777216, -101), class155.method1043(var20, var18.field4182 & -16777216, -119), class155.method1043(var20, var18.field4180 & -16777216, -94));
                        }
                    } else if (this.field4817[var16][var17] != null) {
                        class241 var21 = this.field4817[var16][var17];
                        for (int var22 = 0; var22 < var21.field3339; ++var22) {
                            arg9[var22] = (var21.field3343[var22] - this.field4836 * var16) * var13 / this.field4836 + var14;
                            arg10[var22] = var15 - (var21.field3341[var22] - this.field4836 * var17) * var13 / this.field4836;
                        }
                        for (int var23 = 0; var23 < var21.field3347; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3346 == null || var21.field3346[var23] == 0 || var21.field3342 != null && (var21.field3342 == null || var21.field3342[var23] != -1)) {
                                if (var21.field3342 != null && var21.field3342[var23] != -1) {
                                    int var34 = this.field4831.method1833(var21.field3342[var23]);
                                    arg8.method2087(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2078(var30, var31, var32, var27, var28, var29, var21.field3345[var24], var21.field3345[var25], var21.field3345[var26]);
                                }
                            } else {
                                int var33 = var21.field3346[var23];
                                arg8.method2078(var30, var31, var32, var27, var28, var29, class155.method1043(var33, -16777216 - (var21.field3345[var24] & -16777216), -106), class155.method1043(var33, -16777216 - (var21.field3345[var25] & -16777216), -118), class155.method1043(var33, -16777216 - (var21.field3345[var26] & -16777216), -89));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4524 = true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class336 var9 = this.field4831.method1836(Thread.currentThread());
        class335 var10 = var9.field4535;
        var10.field4520 = 0;
        var10.field4525 = false;
        if (this.field4816 != null) {
            this.method2215(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4551, var9.field4574);
        } else {
            if (this.field4820 != null) {
                this.method2211(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4551, var9.field4574);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)I")
    private static final int method2216(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILek;)Lek;")
    public final class294 method277(int arg0, int arg1, class294 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I")
    public final int method275(int arg0, int arg1) {
        return this.field4818[arg0][arg1];
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(Lek;IIIIZ)V")
    public final void method269(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method279(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field4820 == null) {
            this.field4820 = new class37[super.field2207][super.field2215];
            this.field4821 = new class185[super.field2207][super.field2215];
        } else if (this.field4816 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field4836 != var18 || var19 != 0 && this.field4836 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class185 var20 = new class185();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field2585 = var21;
            var20.field2587 = new short[var21];
            var20.field2590 = new int[var21];
            var20.field2588 = new int[var21];
            var20.field2589 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field2587[var23] = (short) (this.field4822[arg0][arg1] - this.field4833[arg0][arg1]);
                } else if (var28 == 0 && this.field4836 == var29) {
                    var20.field2587[var23] = (short) (this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1]);
                } else if (this.field4836 == var28 && this.field4836 == var29) {
                    var20.field2587[var23] = (short) (this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1]);
                } else if (this.field4836 == var28 && var29 == 0) {
                    var20.field2587[var23] = (short) (this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1]) * var28 + (this.field4822[arg0][arg1] - this.field4833[arg0][arg1]) * (this.field4836 - var28);
                    int var31 = (this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1]) * var28 + (this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1]) * (this.field4836 - var28);
                    var20.field2587[var23] = (short) ((this.field4836 - var29) * var30 + var29 * var31 >> this.field4837 * 2);
                }
                int var32 = (arg0 << this.field4837) + var28;
                int var33 = (arg1 << this.field4837) + var29;
                var20.field2590[var23] = var32;
                var20.field2589[var23] = var33;
                var20.field2588[var23] = this.method278(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field2587[var23] < 2) {
                    var20.field2587[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field4831.field3900.method607(false, arg10[var26]).field2317) {
                    var24 = true;
                }
            }
            var20.field2584 = new int[var25];
            if (arg9 != null) {
                var20.field2586 = new int[var25];
            }
            var20.field2581 = new short[var25];
            var20.field2580 = new short[var25];
            var20.field2592 = new short[var25];
            if (var24) {
                var20.field2591 = new short[var25];
                var20.field2583 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field2584[var20.field2582] = class77.method549(arg8[var27], 127);
                    } else {
                        var20.field2584[var20.field2582] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field2586[var20.field2582] = class77.method549(arg9[var27], 127);
                        } else {
                            var20.field2586[var20.field2582] = -1;
                        }
                    }
                    var20.field2581[var20.field2582] = (short) arg5[var27];
                    var20.field2580[var20.field2582] = (short) arg6[var27];
                    var20.field2592[var20.field2582] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field4831.field3900.method607(false, arg10[var27]).field2317) {
                            var20.field2591[var20.field2582] = (short) arg10[var27];
                            var20.field2583[var20.field2582] = (short) arg11[var27];
                        } else {
                            var20.field2591[var20.field2582] = -1;
                        }
                    }
                    ++var20.field2582;
                }
            }
            this.field4821[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class37 var34 = new class37();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field557 = class34.method252(class77.method549(arg9[0], 127), this.field4822[arg0][arg1] - this.field4833[arg0][arg1], -108);
                    if (var35 == -1) {
                        var34.field563 = (byte) (var34.field563 | 2);
                    }
                }
                if (this.field4818[arg0 + 1][arg1] == this.field4818[arg0][arg1] && this.field4818[arg0 + 1][arg1 + 1] == this.field4818[arg0][arg1] && this.field4818[arg0][arg1 + 1] == this.field4818[arg0][arg1]) {
                    var34.field563 = (byte) (var34.field563 | 1);
                }
                if (var36 != -1 && (var34.field563 & 2) == 0 && !this.field4831.field3900.method607(false, var36).field2317) {
                    var34.field560 = (short) (this.field4822[arg0][arg1] - this.field4833[arg0][arg1]);
                    var34.field559 = (short) (this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1]);
                    var34.field562 = (short) (this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1]);
                    var34.field561 = (short) (this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1]);
                    var34.field558 = (short) var36;
                } else {
                    short var37 = class77.method549(var35, 127);
                    var34.field560 = (short) class34.method252(var37, this.field4822[arg0][arg1] - this.field4833[arg0][arg1], 27);
                    var34.field559 = (short) class34.method252(var37, this.field4822[arg0 + 1][arg1] - this.field4833[arg0 + 1][arg1], -113);
                    var34.field562 = (short) class34.method252(var37, this.field4822[arg0 + 1][arg1 + 1] - this.field4833[arg0 + 1][arg1 + 1], -95);
                    var34.field561 = (short) class34.method252(var37, this.field4822[arg0][arg1 + 1] - this.field4833[arg0][arg1 + 1], -95);
                    var34.field558 = -1;
                }
                this.field4820[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lvb;[I)V")
    public final void method272(class107 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lkp;IIII[[I[[II)V")
    public class345(class283 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field4831 = arg0;
        this.field4827 = arg2;
        this.field4818 = arg5;
        this.field4838 = arg6;
        this.field4836 = arg7;
        this.field4837 = 0;
        while (arg7 > 1) {
            ++this.field4837;
            arg7 >>= 1;
        }
        this.field4822 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4831.field3897 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field4818[var11 + 1][var10] - this.field4818[var11 - 1][var10];
                int var14 = this.field4818[var11][var10 + 1] - this.field4818[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4831.field3872 * var18 + this.field4831.field3908 * var17 + this.field4831.field3898 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4822[var11][var10] = (byte) var20;
            }
        }
        this.field4833 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public final void method268(int arg0, int arg1, int arg2) {
        if (this.field4833[arg0][arg1] < arg2) {
            this.field4833[arg0][arg1] = (byte) arg2;
        }
    }
}
