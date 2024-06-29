import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class351 extends class282 {

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    private int field4512 = -1;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Laha;")
    private class384 field4526;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "[[B")
    private byte[][] field4522;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[[B")
    private byte[][] field4515;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "F")
    private float field4508;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "F")
    private float field4509;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "F")
    private float field4511;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "F")
    private float field4514;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "F")
    private float field4518;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "F")
    private float field4519;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "F")
    private float field4520;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "F")
    private float field4521;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "F")
    private float field4525;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "F")
    private float field4527;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "F")
    private float field4528;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "F")
    private float field4529;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "[[Lc;")
    private class189[][] field4524;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[[Ltc;")
    private class355[][] field4517;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "[[Lbg;")
    private class467[][] field4513;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[[Lsca;")
    private class46[][] field4510;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "[[Laea;")
    private class51[][] field4516;

    @OriginalMember(owner = "client!sc", name = "fa", descriptor = "(IILr;)Lr;")
    public final class185 method1672(int arg0, int arg1, class185 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1675(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public final void method1678(int arg0, int arg1) {
        this.method2057(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII[[ZLk;Lwba;[I[I)V")
    private final void method2050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class567 arg8, class50 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7961;
        this.field4526.method504(false);
        arg9.field695 = false;
        arg9.field692 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4517 != null) {
                        if (this.field4517[var18][var19] != null) {
                            class355 var20 = this.field4517[var18][var19];
                            if (var20.field4554 != -1 && (var20.field4553 & 2) == 0 && var20.field4555 == 0) {
                                int var21 = this.field4526.method2175(var20.field4554);
                                arg9.method383((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class752.method4183(var21, 126, var20.field4556), (float) class752.method4183(var21, 126, var20.field4558), (float) class752.method4183(var21, 126, var20.field4551));
                                arg9.method383((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class752.method4183(var21, 126, var20.field4557), (float) class752.method4183(var21, 126, var20.field4551), (float) class752.method4183(var21, 126, var20.field4558));
                            } else if (var20.field4555 == 0) {
                                arg9.method377((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field4556, var20.field4558, var20.field4551);
                                arg9.method377((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field4557, var20.field4551, var20.field4558);
                            } else {
                                int var22 = var20.field4555;
                                arg9.method377((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class397.method2234(-116, var20.field4556 & -16777216, var22), class397.method2234(-109, var20.field4558 & -16777216, var22), class397.method2234(-89, var20.field4551 & -16777216, var22));
                                arg9.method377((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class397.method2234(-98, var20.field4557 & -16777216, var22), class397.method2234(-95, var20.field4551 & -16777216, var22), class397.method2234(-104, var20.field4558 & -16777216, var22));
                            }
                        } else if (this.field4524[var18][var19] != null) {
                            class189 var23 = this.field4524[var18][var19];
                            for (int var24 = 0; var24 < var23.field2610; ++var24) {
                                arg10[var24] = var23.field2611[var24] * var14 / super.field3557 + var16;
                                arg11[var24] = var17 - var23.field2613[var24] * var14 / super.field3557;
                            }
                            for (int var25 = 0; var25 < var23.field2614; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field2609 != null && var23.field2609[var25] != 0 && (var23.field2612 == null || var23.field2612 != null && var23.field2612[var25] == -1)) {
                                    int var35 = var23.field2609[var25];
                                    arg9.method377((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class397.method2234(-95, -16777216 - (var23.field2615[var26] & -16777216), var35), class397.method2234(-94, -16777216 - (var23.field2615[var27] & -16777216), var35), class397.method2234(-121, -16777216 - (var23.field2615[var28] & -16777216), var35));
                                } else if (var23.field2612 != null && var23.field2612[var25] != -1) {
                                    int var36 = this.field4526.method2175(var23.field2612[var25]);
                                    arg9.method383((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method377((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field2615[var26], var23.field2615[var27], var23.field2615[var28]);
                                }
                            }
                        }
                    } else if (this.field4516[var18][var19] != null) {
                        class51 var37 = this.field4516[var18][var19];
                        for (int var38 = 0; var38 < var37.field733; ++var38) {
                            arg10[var38] = var37.field729[var38] * var14 / super.field3557 + var16;
                            arg11[var38] = var17 - var37.field732[var38] * var14 / super.field3557;
                        }
                        for (int var39 = 0; var39 < var37.field726; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field735 != null && var37.field735[var39] != 0) {
                                int var49 = var37.field735[var39];
                                arg9.method377((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method377((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field731[var40], var37.field731[var41], var37.field731[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field695 = true;
        this.field4526.method504(var15);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZLk;Lwba;[I[I[I[II)V")
    private final void method2051(int arg0, int arg1, boolean arg2, class567 arg3, class50 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class51 var11 = this.field4516[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field4512 == -1) {
                    for (int var12 = 0; var12 < var11.field733; ++var12) {
                        int var13 = (arg0 << super.field3550) + var11.field729[var12];
                        int var14 = var11.field725[var12];
                        int var15 = (arg1 << super.field3550) + var11.field732[var12];
                        float var16 = (float) var15 * this.field4509 + (float) var13 * this.field4528 + (float) var14 * this.field4525 + this.field4529;
                        if (var16 <= (float) this.field4526.field4871) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7954);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field730[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7958) {
                            int var19 = (int) (var16 - (float) arg3.field7954);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field4511 + (float) var13 * this.field4520 + (float) var14 * this.field4508 + this.field4519;
                        float var21 = (float) var15 * this.field4518 + (float) var13 * this.field4521 + (float) var14 * this.field4514 + this.field4527;
                        arg5[var12] = (int) ((float) this.field4526.field4874 * var20 / var16) + arg4.field702;
                        arg6[var12] = (int) ((float) this.field4526.field4881 * var21 / var16) + arg4.field706;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field733; ++var22) {
                        int var36 = (arg0 << super.field3550) + var11.field729[var22];
                        int var37 = var11.field725[var22];
                        int var38 = (arg1 << super.field3550) + var11.field732[var22];
                        float var39 = (float) var38 * this.field4509 + (float) var36 * this.field4528 + (float) var37 * this.field4525 + this.field4529;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field4512 - arg3.field7954;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field730[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7958) {
                            int var42 = this.field4512 - arg3.field7954;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field4511 + (float) var36 * this.field4520 + (float) var37 * this.field4508 + this.field4519;
                        float var44 = (float) var38 * this.field4518 + (float) var36 * this.field4521 + (float) var37 * this.field4514 + this.field4527;
                        arg5[var22] = (int) ((float) this.field4526.field4874 * var43 / (float) this.field4512) + arg4.field702;
                        arg6[var22] = (int) ((float) this.field4526.field4881 * var44 / (float) this.field4512) + arg4.field706;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3557;
                for (int var24 = 0; var24 < var11.field726; ++var24) {
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
                        arg4.field696 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field694 || var29 > arg4.field694 || var30 > arg4.field694;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3550;
                            int var35 = arg1 << super.field3550;
                            if ((var11.field731[var25] & 16777215) != 0) {
                                if (var11.field728[var25] == var11.field728[var26] && var11.field728[var25] == var11.field728[var27] && var11.field734[var25] == var11.field734[var26] && var11.field734[var25] == var11.field734[var27]) {
                                    arg4.method381((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field729[var25] + var34) / (float) var11.field734[var25], (float) (var11.field729[var26] + var34) / (float) var11.field734[var26], (float) (var11.field729[var27] + var34) / (float) var11.field734[var27], (float) (var11.field732[var25] + var35) / (float) var11.field734[var25], (float) (var11.field732[var26] + var35) / (float) var11.field734[var26], (float) (var11.field732[var27] + var35) / (float) var11.field734[var27], var11.field731[var25], var11.field731[var26], var11.field731[var27], arg3.field7957, arg8[var25], arg8[var26], arg8[var27], var11.field728[var25]);
                                } else {
                                    arg4.method379((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field729[var25] + var34) / var23, (float) (var11.field729[var26] + var34) / var23, (float) (var11.field729[var27] + var34) / var23, (float) (var11.field732[var25] + var35) / var23, (float) (var11.field732[var26] + var35) / var23, (float) (var11.field732[var27] + var35) / var23, var11.field731[var25], var11.field731[var26], var11.field731[var27], arg3.field7957, arg8[var25], arg8[var26], arg8[var27], var11.field728[var25], var23 / (float) var11.field734[var25], var11.field728[var26], var23 / (float) var11.field734[var26], var11.field728[var27], var23 / (float) var11.field734[var27]);
                                }
                            }
                        } else {
                            arg4.method378((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7957);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1674(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field4523 & 32) == 0;
        if (this.field4517 == null && !var15) {
            this.field4517 = new class355[super.field3561][super.field3555];
            this.field4524 = new class189[super.field3561][super.field3555];
        } else if (this.field4516 == null && var15) {
            this.field4516 = new class51[super.field3561][super.field3555];
        } else if (this.field4513 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class22.field415[class693.method3882(arg6[var16], 63) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class22.field415[class693.method3882(arg7[var17], 63) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class51 var18 = new class51();
                var18.field733 = (short) arg2.length;
                var18.field726 = (short) (arg2.length / 3);
                var18.field729 = new short[var18.field733];
                var18.field725 = new short[var18.field733];
                var18.field732 = new short[var18.field733];
                var18.field731 = new int[var18.field733];
                var18.field728 = new short[var18.field733];
                var18.field734 = new short[var18.field733];
                var18.field727 = new byte[var18.field733];
                if (arg5 != null) {
                    var18.field730 = new short[var18.field733];
                }
                for (int var19 = 0; var19 < var18.field733; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field4522[arg0][arg1] - this.field4515[arg0][arg1];
                    } else if (var22 == 0 && super.field3557 == var23) {
                        var25 = this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1];
                    } else if (super.field3557 == var22 && super.field3557 == var23) {
                        var25 = this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1];
                    } else if (super.field3557 == var22 && var23 == 0) {
                        var25 = this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]) * var22 + (this.field4522[arg0][arg1] - this.field4515[arg0][arg1]) * (super.field3557 - var22);
                        int var27 = (this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]) * var22 + (this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]) * (super.field3557 - var22);
                        var25 = (super.field3557 - var23) * var26 + var23 * var27 >> super.field3550 * 2;
                    }
                    int var28 = (arg0 << super.field3550) + var22;
                    int var29 = (arg1 << super.field3550) + var23;
                    var18.field729[var19] = (short) var22;
                    var18.field732[var19] = (short) var23;
                    var18.field725[var19] = (short) (this.method1676(var28, true, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field731[var19] = 0;
                        if (arg7 != null) {
                            var18.field727[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field730[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method2052(this.field4526.field830.method1072(arg8[var19], true).field7443)) {
                            var32 = -1694498816;
                        }
                        var18.field731[var19] = var32 | class29.method198(method2056(arg6[var19] >> 8, var25), var30, (byte) 61, arg10);
                        if (arg7 != null) {
                            var18.field727[var19] = (byte) var25;
                        }
                    }
                    var18.field728[var19] = (short) arg8[var19];
                    var18.field734[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field735 = new int[var18.field726];
                }
                for (int var20 = 0; var20 < var18.field726; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field735[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field4516[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field3557 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3557 && arg4[var38] == super.field3557) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3557) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3557 != arg2[var40] && arg2[0] - super.field3557 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3557 != arg4[var40] && arg4[0] - super.field3557 != arg4[var40]) {
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
                    class355 var41 = new class355();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field4555 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field4553 = (byte) (var41.field4553 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3559[arg0 + 1][arg1] == super.field3559[arg0][arg1] && super.field3559[arg0 + 1][arg1 + 1] == super.field3559[arg0][arg1] && super.field3559[arg0][arg1 + 1] == super.field3559[arg0][arg1]) {
                        var41.field4553 = (byte) (var41.field4553 | 1);
                    }
                    if (var43 != -1 && (var41.field4553 & 2) == 0 && !this.field4526.field830.method1072(var43, true).field7456) {
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
                        var41.field4557 = class29.method198(method2056(arg6[var34] >> 8, this.field4522[arg0][arg1] - this.field4515[arg0][arg1]), var44, (byte) -113, arg10);
                        if (var41.field4555 != 0) {
                            var41.field4557 |= 255 - (this.field4522[arg0][arg1] - this.field4515[arg0][arg1]) << 25;
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
                        var41.field4551 = class29.method198(method2056(arg6[var35] >> 8, this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]), var45, (byte) 106, arg10);
                        if (var41.field4555 != 0) {
                            var41.field4551 |= 255 - (this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]) << 25;
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
                        var41.field4556 = class29.method198(method2056(arg6[var36] >> 8, this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]), var46, (byte) 106, arg10);
                        if (var41.field4555 != 0) {
                            var41.field4556 |= 255 - (this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field4558 = class29.method198(method2056(arg6[var37] >> 8, this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]), var47, (byte) 40, arg10);
                        var41.field4554 = (short) var43;
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
                        var41.field4557 = class29.method198(method2056(arg6[var34] >> 8, this.field4522[arg0][arg1] - this.field4515[arg0][arg1]), var48, (byte) -111, arg10);
                        if (var41.field4555 != 0) {
                            var41.field4557 |= 255 - (this.field4522[arg0][arg1] - this.field4515[arg0][arg1]) << 25;
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
                        var41.field4551 = class29.method198(method2056(arg6[var35] >> 8, this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]), var49, (byte) 4, arg10);
                        if (var41.field4555 != 0) {
                            var41.field4551 |= 255 - (this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]) << 25;
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
                        var41.field4556 = class29.method198(method2056(arg6[var36] >> 8, this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]), var50, (byte) -125, arg10);
                        if (var41.field4555 != 0) {
                            var41.field4556 |= 255 - (this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field4558 = class29.method198(method2056(arg6[var37] >> 8, this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]), var51, (byte) 66, arg10);
                        if (var41.field4555 != 0) {
                            var41.field4558 |= 255 - (this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]) << 25;
                        }
                        var41.field4554 = -1;
                    }
                    if (arg5 != null) {
                        var41.field4561 = (short) arg5[var36];
                        var41.field4560 = (short) arg5[var37];
                        var41.field4552 = (short) arg5[var35];
                        var41.field4559 = (short) arg5[var34];
                    }
                    this.field4517[arg0][arg1] = var41;
                } else {
                    class189 var52 = new class189();
                    var52.field2610 = (short) arg2.length;
                    var52.field2614 = (short) (arg2.length / 3);
                    var52.field2611 = new short[var52.field2610];
                    var52.field2606 = new short[var52.field2610];
                    var52.field2613 = new short[var52.field2610];
                    var52.field2615 = new int[var52.field2610];
                    if (arg5 != null) {
                        var52.field2608 = new short[var52.field2610];
                    }
                    for (int var53 = 0; var53 < var52.field2610; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field4522[arg0][arg1] - this.field4515[arg0][arg1];
                        } else if (var68 == 0 && super.field3557 == var69) {
                            var71 = this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1];
                        } else if (super.field3557 == var68 && super.field3557 == var69) {
                            var71 = this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1];
                        } else if (super.field3557 == var68 && var69 == 0) {
                            var71 = this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]) * var68 + (this.field4522[arg0][arg1] - this.field4515[arg0][arg1]) * (super.field3557 - var68);
                            int var73 = (this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]) * var68 + (this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]) * (super.field3557 - var68);
                            var71 = (super.field3557 - var69) * var72 + var69 * var73 >> super.field3550 * 2;
                        }
                        int var74 = (arg0 << super.field3550) + var68;
                        int var75 = (arg1 << super.field3550) + var69;
                        var52.field2611[var53] = (short) var68;
                        var52.field2613[var53] = (short) var69;
                        var52.field2606[var53] = (short) (this.method1676(var74, true, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field2615[var53] = var71 << 25;
                            } else {
                                var52.field2615[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field2608[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field2615[var53] = class29.method198(method2056(arg6[var53] >> 8, var71), var76, (byte) 11, arg10);
                            if (arg7 != null) {
                                var52.field2615[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field2614; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field4526.field830.method1072(arg8[var55 * 3], true).field7456) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field2609 = new int[var52.field2614];
                    }
                    if (var54) {
                        var52.field2612 = new short[var52.field2614];
                        var52.field2607 = new short[var52.field2614];
                    }
                    for (int var56 = 0; var56 < var52.field2614; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field2609[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field4526.field830.method1072(var62, true).field7456) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field4526.field830.method1072(var63, true).field7456) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field4526.field830.method1072(var64, true).field7456) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field2612[var56] = (short) var64;
                                var52.field2607[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field4526.field830.method1072(var65, true).field7456) {
                                        var52.field2615[var57] = class22.field415[class693.method3882(this.field4526.field830.method1072(var65, true).field7451 & 65535, 63) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field4526.field830.method1072(var66, true).field7456) {
                                        var52.field2615[var58] = class22.field415[class693.method3882(this.field4526.field830.method1072(var66, true).field7451 & 65535, 63) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field4526.field830.method1072(var67, true).field7456) {
                                        var52.field2615[var59] = class22.field415[class693.method3882(this.field4526.field830.method1072(var67, true).field7451 & 65535, 63) & 65535];
                                    }
                                }
                                var52.field2612[var56] = -1;
                            }
                        }
                    }
                    this.field4524[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z")
    private final boolean method2052(int arg0) {
        if ((this.field4523 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!sc", name = "ka", descriptor = "(III)V")
    public final void method1670(int arg0, int arg1, int arg2) {
        if (this.field4515[arg0][arg1] < arg2) {
            this.field4515[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIIIII[[ZLk;Lwba;[I[I)V")
    private final void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class567 arg8, class50 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7961;
        this.field4526.method504(false);
        arg9.field695 = false;
        arg9.field692 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4513[var18][var19] != null) {
                        class467 var20 = this.field4513[var18][var19];
                        if (var20.field6270 != -1 && (var20.field6269 & 2) == 0 && var20.field6272 == -1) {
                            int var21 = this.field4526.method2175(var20.field6270);
                            arg9.method383((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class752.method4183(var21, 126, var20.field6271 & 65535), (float) class752.method4183(var21, 126, var20.field6274 & 65535), (float) class752.method4183(var21, 126, var20.field6268 & 65535));
                            arg9.method383((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class752.method4183(var21, 126, var20.field6273 & 65535), (float) class752.method4183(var21, 126, var20.field6268 & 65535), (float) class752.method4183(var21, 126, var20.field6274 & 65535));
                        } else if (var20.field6272 == -1) {
                            arg9.method383((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field6271 & 65535), (float) (var20.field6274 & 65535), (float) (var20.field6268 & 65535));
                            arg9.method383((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field6273 & 65535), (float) (var20.field6268 & 65535), (float) (var20.field6274 & 65535));
                        } else {
                            int var22 = var20.field6272;
                            arg9.method383((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method383((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field4510[var18][var19] != null) {
                        class46 var23 = this.field4510[var18][var19];
                        for (int var24 = 0; var24 < var23.field668; ++var24) {
                            arg10[var24] = var23.field670[var24] * var14 / super.field3557 + var16;
                            arg11[var24] = var17 - var23.field672[var24] * var14 / super.field3557;
                        }
                        for (int var25 = 0; var25 < var23.field666; ++var25) {
                            short var26 = var23.field669[var25];
                            short var27 = var23.field677[var25];
                            short var28 = var23.field676[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field674 != null && var23.field674[var25] != -1) {
                                int var35 = var23.field674[var25];
                                arg9.method383((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class752.method4183(var35, 126, var23.field664[var26]), (float) class752.method4183(var35, 126, var23.field664[var27]), (float) class752.method4183(var35, 126, var23.field664[var28]));
                            } else if (var23.field675 != null && var23.field675[var25] != -1) {
                                int var36 = this.field4526.method2175(var23.field675[var25]);
                                arg9.method383((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class752.method4183(var36, 126, var23.field664[var26]), (float) class752.method4183(var36, 126, var23.field664[var27]), (float) class752.method4183(var36, 126, var23.field664[var28]));
                            } else {
                                int var37 = var23.field667[var25];
                                arg9.method383((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class752.method4183(var37, 126, var23.field664[var26]), (float) class752.method4183(var37, 126, var23.field664[var27]), (float) class752.method4183(var37, 126, var23.field664[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field695 = true;
        this.field4526.method504(var15);
    }

    @OriginalMember(owner = "client!sc", name = "YA", descriptor = "()V")
    public final void method1673() {
        this.field4522 = null;
        this.field4515 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Laha;IIII[[I[[II)V")
    public class351(class384 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4526 = arg0;
        this.field4523 = arg2;
        this.field4522 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4526.field4893 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4526.field4886 * var18 + this.field4526.field4891 * var17 + this.field4526.field4877 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4522[var11][var10] = (byte) var20;
            }
        }
        this.field4515 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1681(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class174 var7 = this.field4526.field4907;
        this.field4512 = -1;
        this.field4520 = var7.field2422;
        this.field4508 = var7.field2424;
        this.field4511 = var7.field2431;
        this.field4519 = var7.field2411;
        this.field4521 = var7.field2438;
        this.field4514 = var7.field2439;
        this.field4518 = var7.field2410;
        this.field4527 = var7.field2408;
        this.field4528 = var7.field2412;
        this.field4525 = var7.field2435;
        this.field4509 = var7.field2426;
        this.field4529 = var7.field2434;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3561 && var11 >= 0 && var11 < super.field3555) {
                        this.method2057(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class567 var9 = this.field4526.method2185(Thread.currentThread());
        class50 var10 = var9.field7973;
        var10.field693 = 0;
        var10.field696 = true;
        this.field4526.method512();
        if (this.field4517 == null && this.field4516 == null) {
            if (this.field4513 != null) {
                this.method2053(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7988, var9.field7968);
            }
        } else {
            this.method2050(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7988, var9.field7968);
        }
    }

    @OriginalMember(owner = "client!sc", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1684(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!sc", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1685(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIZLk;Lwba;[I[I[I[II)V")
    private final void method2054(int arg0, int arg1, boolean arg2, class567 arg3, class50 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class355 var11 = this.field4517[arg0][arg1];
        if (var11 != null) {
            if ((var11.field4553 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field4553 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3557 * arg0;
                int var13 = super.field3557 + var12;
                int var14 = super.field3557 * arg1;
                int var15 = super.field3557 + var14;
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
                if ((var11.field4553 & 1) != 0 && !arg2) {
                    int var20 = super.field3559[arg0][arg1];
                    float var21 = (float) var20 * this.field4525;
                    if (this.field4512 == -1) {
                        var22 = (float) var14 * this.field4509 + (float) var12 * this.field4528 + var21 + this.field4529;
                        if (var22 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var23 = (float) var14 * this.field4509 + (float) var13 * this.field4528 + var21 + this.field4529;
                        if (var23 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var24 = (float) var15 * this.field4509 + (float) var13 * this.field4528 + var21 + this.field4529;
                        if (var24 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var25 = (float) var15 * this.field4509 + (float) var12 * this.field4528 + var21 + this.field4529;
                        if (var25 <= (float) this.field4526.field4871) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field4509 + (float) var12 * this.field4528 + var21 + this.field4529;
                        var23 = (float) var14 * this.field4509 + (float) var13 * this.field4528 + var21 + this.field4529;
                        var24 = (float) var15 * this.field4509 + (float) var13 * this.field4528 + var21 + this.field4529;
                        var25 = (float) var15 * this.field4509 + (float) var12 * this.field4528 + var21 + this.field4529;
                    }
                    if (arg3.field7958) {
                        int var26 = (int) (var22 - (float) arg3.field7954);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7954);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7954);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7954);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field4508;
                    float var31 = (float) var20 * this.field4514;
                    if (this.field4512 == -1) {
                        float var32 = (float) var14 * this.field4511 + (float) var12 * this.field4520 + var30 + this.field4519;
                        var33 = (int) ((float) this.field4526.field4874 * var32 / var22) + arg4.field702;
                        float var34 = (float) var14 * this.field4518 + (float) var12 * this.field4521 + var31 + this.field4527;
                        var35 = (int) ((float) this.field4526.field4881 * var34 / var22) + arg4.field706;
                        float var36 = (float) var14 * this.field4511 + (float) var13 * this.field4520 + var30 + this.field4519;
                        var37 = (int) ((float) this.field4526.field4874 * var36 / var23) + arg4.field702;
                        float var38 = (float) var14 * this.field4518 + (float) var13 * this.field4521 + var31 + this.field4527;
                        var39 = (int) ((float) this.field4526.field4881 * var38 / var23) + arg4.field706;
                        float var40 = (float) var15 * this.field4511 + (float) var13 * this.field4520 + var30 + this.field4519;
                        var41 = (int) ((float) this.field4526.field4874 * var40 / var24) + arg4.field702;
                        float var42 = (float) var15 * this.field4518 + (float) var13 * this.field4521 + var31 + this.field4527;
                        var43 = (int) ((float) this.field4526.field4881 * var42 / var24) + arg4.field706;
                        float var44 = (float) var15 * this.field4511 + (float) var12 * this.field4520 + var30 + this.field4519;
                        var45 = (int) ((float) this.field4526.field4874 * var44 / var25) + arg4.field702;
                        float var46 = (float) var15 * this.field4518 + (float) var12 * this.field4521 + var31 + this.field4527;
                        var47 = (int) ((float) this.field4526.field4881 * var46 / var25) + arg4.field706;
                    } else {
                        float var48 = (float) var14 * this.field4511 + (float) var12 * this.field4520 + var30 + this.field4519;
                        var33 = (int) ((float) this.field4526.field4874 * var48 / (float) this.field4512) + arg4.field702;
                        float var49 = (float) var14 * this.field4518 + (float) var12 * this.field4521 + var31 + this.field4527;
                        var35 = (int) ((float) this.field4526.field4881 * var49 / (float) this.field4512) + arg4.field706;
                        float var50 = (float) var14 * this.field4511 + (float) var13 * this.field4520 + var30 + this.field4519;
                        var37 = (int) ((float) this.field4526.field4874 * var50 / (float) this.field4512) + arg4.field702;
                        float var51 = (float) var14 * this.field4518 + (float) var13 * this.field4521 + var31 + this.field4527;
                        var39 = (int) ((float) this.field4526.field4881 * var51 / (float) this.field4512) + arg4.field706;
                        float var52 = (float) var15 * this.field4511 + (float) var13 * this.field4520 + var30 + this.field4519;
                        var41 = (int) ((float) this.field4526.field4874 * var52 / (float) this.field4512) + arg4.field702;
                        float var53 = (float) var15 * this.field4518 + (float) var13 * this.field4521 + var31 + this.field4527;
                        var43 = (int) ((float) this.field4526.field4881 * var53 / (float) this.field4512) + arg4.field706;
                        float var54 = (float) var15 * this.field4511 + (float) var12 * this.field4520 + var30 + this.field4519;
                        var45 = (int) ((float) this.field4526.field4874 * var54 / (float) this.field4512) + arg4.field702;
                        float var55 = (float) var15 * this.field4518 + (float) var12 * this.field4521 + var31 + this.field4527;
                        var47 = (int) ((float) this.field4526.field4881 * var55 / (float) this.field4512) + arg4.field706;
                    }
                } else {
                    int var56 = super.field3559[arg0][arg1];
                    int var57 = super.field3559[arg0 + 1][arg1];
                    int var58 = super.field3559[arg0 + 1][arg1 + 1];
                    int var59 = super.field3559[arg0][arg1 + 1];
                    if (this.field4512 == -1) {
                        var22 = (float) var14 * this.field4509 + (float) var12 * this.field4528 + (float) var56 * this.field4525 + this.field4529;
                        if (var22 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var23 = (float) var14 * this.field4509 + (float) var13 * this.field4528 + (float) var57 * this.field4525 + this.field4529;
                        if (var23 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var24 = (float) var15 * this.field4509 + (float) var13 * this.field4528 + (float) var58 * this.field4525 + this.field4529;
                        if (var24 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var25 = (float) var15 * this.field4509 + (float) var12 * this.field4528 + (float) var59 * this.field4525 + this.field4529;
                        if (var25 <= (float) this.field4526.field4871) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field4509 + (float) var12 * this.field4528 + (float) var56 * this.field4525 + this.field4529;
                        var23 = (float) var14 * this.field4509 + (float) var13 * this.field4528 + (float) var57 * this.field4525 + this.field4529;
                        var24 = (float) var15 * this.field4509 + (float) var13 * this.field4528 + (float) var58 * this.field4525 + this.field4529;
                        var25 = (float) var15 * this.field4509 + (float) var12 * this.field4528 + (float) var59 * this.field4525 + this.field4529;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7954);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field4559 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7954);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field4552 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7954);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field4561 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7954);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field4560 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7958) {
                        int var68 = (int) (var22 - (float) arg3.field7954);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7954);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7954);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7954);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field4512 == -1) {
                        float var72 = (float) var14 * this.field4511 + (float) var12 * this.field4520 + (float) var56 * this.field4508 + this.field4519;
                        var33 = (int) ((float) this.field4526.field4874 * var72 / var22) + arg4.field702;
                        float var73 = (float) var14 * this.field4518 + (float) var12 * this.field4521 + (float) var56 * this.field4514 + this.field4527;
                        var35 = (int) ((float) this.field4526.field4881 * var73 / var22) + arg4.field706;
                        float var74 = (float) var14 * this.field4511 + (float) var13 * this.field4520 + (float) var57 * this.field4508 + this.field4519;
                        var37 = (int) ((float) this.field4526.field4874 * var74 / var23) + arg4.field702;
                        float var75 = (float) var14 * this.field4518 + (float) var13 * this.field4521 + (float) var57 * this.field4514 + this.field4527;
                        var39 = (int) ((float) this.field4526.field4881 * var75 / var23) + arg4.field706;
                        float var76 = (float) var15 * this.field4511 + (float) var13 * this.field4520 + (float) var58 * this.field4508 + this.field4519;
                        var41 = (int) ((float) this.field4526.field4874 * var76 / var24) + arg4.field702;
                        float var77 = (float) var15 * this.field4518 + (float) var13 * this.field4521 + (float) var58 * this.field4514 + this.field4527;
                        var43 = (int) ((float) this.field4526.field4881 * var77 / var24) + arg4.field706;
                        float var78 = (float) var15 * this.field4511 + (float) var12 * this.field4520 + (float) var59 * this.field4508 + this.field4519;
                        var45 = (int) ((float) this.field4526.field4874 * var78 / var25) + arg4.field702;
                        float var79 = (float) var15 * this.field4518 + (float) var12 * this.field4521 + (float) var59 * this.field4514 + this.field4527;
                        var47 = (int) ((float) this.field4526.field4881 * var79 / var25) + arg4.field706;
                    } else {
                        float var80 = (float) var14 * this.field4511 + (float) var12 * this.field4520 + (float) var56 * this.field4508 + this.field4519;
                        var33 = (int) ((float) this.field4526.field4874 * var80 / (float) this.field4512) + arg4.field702;
                        float var81 = (float) var14 * this.field4518 + (float) var12 * this.field4521 + (float) var56 * this.field4514 + this.field4527;
                        var35 = (int) ((float) this.field4526.field4881 * var81 / (float) this.field4512) + arg4.field706;
                        float var82 = (float) var14 * this.field4511 + (float) var13 * this.field4520 + (float) var57 * this.field4508 + this.field4519;
                        var37 = (int) ((float) this.field4526.field4874 * var82 / (float) this.field4512) + arg4.field702;
                        float var83 = (float) var14 * this.field4518 + (float) var13 * this.field4521 + (float) var57 * this.field4514 + this.field4527;
                        var39 = (int) ((float) this.field4526.field4881 * var83 / (float) this.field4512) + arg4.field706;
                        float var84 = (float) var15 * this.field4511 + (float) var13 * this.field4520 + (float) var58 * this.field4508 + this.field4519;
                        var41 = (int) ((float) this.field4526.field4874 * var84 / (float) this.field4512) + arg4.field702;
                        float var85 = (float) var15 * this.field4518 + (float) var13 * this.field4521 + (float) var58 * this.field4514 + this.field4527;
                        var43 = (int) ((float) this.field4526.field4881 * var85 / (float) this.field4512) + arg4.field706;
                        float var86 = (float) var15 * this.field4511 + (float) var12 * this.field4520 + (float) var59 * this.field4508 + this.field4519;
                        var45 = (int) ((float) this.field4526.field4874 * var86 / (float) this.field4512) + arg4.field702;
                        float var87 = (float) var15 * this.field4518 + (float) var12 * this.field4521 + (float) var59 * this.field4514 + this.field4527;
                        var47 = (int) ((float) this.field4526.field4881 * var87 / (float) this.field4512) + arg4.field706;
                    }
                }
                boolean var88 = var11.field4554 != -1 && this.method2052(this.field4526.field830.method1072(var11.field4554, true).field7443);
                if (this.field4512 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field696 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field694 || var45 > arg4.field694 || var37 > arg4.field694;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field4554 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method381((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field4556 & 16777215, var90 | var11.field4558 & 16777215, var90 | var11.field4551 & 16777215, arg3.field7957, var18, var19, var17, var11.field4554);
                                } else {
                                    if (var88) {
                                        arg4.field693 = 100;
                                    }
                                    arg4.method377((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class397.method2234(-103, var18 << 24 | arg3.field7957, var11.field4556), class397.method2234(-86, var19 << 24 | arg3.field7957, var11.field4558), class397.method2234(-85, var17 << 24 | arg3.field7957, var11.field4551));
                                    arg4.field693 = 0;
                                }
                            } else if (var11.field4554 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method381((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field4556 & 16777215, var91 | var11.field4558 & 16777215, var91 | var11.field4551 & 16777215, 0, 0, 0, 0, var11.field4554);
                            } else {
                                if (var88) {
                                    arg4.field693 = 100;
                                }
                                arg4.method377((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field4556, var11.field4558, var11.field4551);
                                arg4.field693 = 0;
                            }
                        } else {
                            arg4.method378((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7957);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field696 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field694 || var37 > arg4.field694 || var45 > arg4.field694;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field693 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field4554 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method381((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field4557 & 16777215, var93 | var11.field4551 & 16777215, var93 | var11.field4558 & 16777215, arg3.field7957, var16, var17, var19, var11.field4554);
                                    return;
                                }
                                if (var88) {
                                    arg4.field693 = 100;
                                }
                                arg4.method377((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class397.method2234(-97, var16 << 24 | arg3.field7957, var11.field4557), class397.method2234(-121, var17 << 24 | arg3.field7957, var11.field4551), class397.method2234(-107, var19 << 24 | arg3.field7957, var11.field4558));
                                arg4.field693 = 0;
                                return;
                            }
                            if (var11.field4554 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method381((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field4557 & 16777215, var94 | var11.field4551 & 16777215, var94 | var11.field4558 & 16777215, 0, 0, 0, 0, var11.field4554);
                                return;
                            }
                            if (var88) {
                                arg4.field693 = 100;
                            }
                            arg4.method377((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field4557, var11.field4551, var11.field4558);
                            arg4.field693 = 0;
                            return;
                        }
                        arg4.method378((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7957);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field696 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field694 || var45 > arg4.field694 || var37 > arg4.field694;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field693 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field4554 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method381((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field4556 & 16777215, var96 | var11.field4558 & 16777215, var96 | var11.field4551 & 16777215, arg3.field7957, var18, var19, var17, var11.field4554);
                                } else {
                                    if (var88) {
                                        arg4.field693 = 100;
                                    }
                                    arg4.method377((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class397.method2234(-89, var18 << 24 | arg3.field7957, var11.field4556), class397.method2234(-126, var19 << 24 | arg3.field7957, var11.field4558), class397.method2234(-117, var17 << 24 | arg3.field7957, var11.field4551));
                                    arg4.field693 = 0;
                                }
                            } else if (var11.field4554 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method381((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field4556 & 16777215, var97 | var11.field4558 & 16777215, var97 | var11.field4551 & 16777215, 0, 0, 0, 0, var11.field4554);
                            } else {
                                if (var88) {
                                    arg4.field693 = 100;
                                }
                                arg4.method377((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field4556, var11.field4558, var11.field4551);
                                arg4.field693 = 0;
                            }
                        } else {
                            arg4.method378((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7957);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field696 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field694 || var37 > arg4.field694 || var45 > arg4.field694;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field693 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field4554 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method381((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field4557 & 16777215, var99 | var11.field4551 & 16777215, var99 | var11.field4558 & 16777215, arg3.field7957, var16, var17, var19, var11.field4554);
                                    return;
                                }
                                if (var88) {
                                    arg4.field693 = 100;
                                }
                                arg4.method377((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class397.method2234(-102, var16 << 24 | arg3.field7957, var11.field4557), class397.method2234(-117, var17 << 24 | arg3.field7957, var11.field4551), class397.method2234(-97, var19 << 24 | arg3.field7957, var11.field4558));
                                arg4.field693 = 0;
                                return;
                            }
                            if (var11.field4554 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method381((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field4557 & 16777215, var100 | var11.field4551 & 16777215, var100 | var11.field4558 & 16777215, 0, 0, 0, 0, var11.field4554);
                                return;
                            }
                            if (var88) {
                                arg4.field693 = 100;
                            }
                            arg4.method377((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field4557, var11.field4551, var11.field4558);
                            arg4.field693 = 0;
                            return;
                        }
                        arg4.method378((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7957);
                    }
                }
            }
        } else {
            class189 var101 = this.field4524[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field2605 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field4512 == -1) {
                    for (int var102 = 0; var102 < var101.field2610; ++var102) {
                        int var103 = (arg0 << super.field3550) + var101.field2611[var102];
                        int var104 = var101.field2606[var102];
                        int var105 = (arg1 << super.field3550) + var101.field2613[var102];
                        float var106 = (float) var105 * this.field4509 + (float) var103 * this.field4528 + (float) var104 * this.field4525 + this.field4529;
                        if (var106 <= (float) this.field4526.field4871) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7954);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field2608[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7958) {
                            int var109 = (int) (var106 - (float) arg3.field7954);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field4511 + (float) var103 * this.field4520 + (float) var104 * this.field4508 + this.field4519;
                        float var111 = (float) var105 * this.field4518 + (float) var103 * this.field4521 + (float) var104 * this.field4514 + this.field4527;
                        arg5[var102] = (int) ((float) this.field4526.field4874 * var110 / var106) + arg4.field702;
                        arg6[var102] = (int) ((float) this.field4526.field4881 * var111 / var106) + arg4.field706;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field2610; ++var112) {
                        int var152 = (arg0 << super.field3550) + var101.field2611[var112];
                        int var153 = var101.field2606[var112];
                        int var154 = (arg1 << super.field3550) + var101.field2613[var112];
                        float var155 = (float) var154 * this.field4509 + (float) var152 * this.field4528 + (float) var153 * this.field4525 + this.field4529;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field4512 - arg3.field7954;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field2608[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7958) {
                            int var158 = this.field4512 - arg3.field7954;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field4511 + (float) var152 * this.field4520 + (float) var153 * this.field4508 + this.field4519;
                        float var160 = (float) var154 * this.field4518 + (float) var152 * this.field4521 + (float) var153 * this.field4514 + this.field4527;
                        arg5[var112] = (int) ((float) this.field4526.field4874 * var159 / (float) this.field4512) + arg4.field702;
                        arg6[var112] = (int) ((float) this.field4526.field4881 * var160 / (float) this.field4512) + arg4.field706;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field2612 != null) {
                    if (this.field4512 == -1) {
                        for (int var113 = 0; var113 < var101.field2614; ++var113) {
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
                                arg4.field696 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field694 || var118 > arg4.field694 || var119 > arg4.field694;
                                short var124 = var101.field2612[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method2052(this.field4526.field830.method1072(var124, true).field7443)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method381((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field2611[var114] / (float) super.field3557, (float) var101.field2611[var115] / (float) super.field3557, (float) var101.field2611[var116] / (float) super.field3557, (float) var101.field2613[var114] / (float) super.field3557, (float) var101.field2613[var115] / (float) super.field3557, (float) var101.field2613[var116] / (float) super.field3557, var125 | var101.field2615[var114] & 16777215, var125 | var101.field2615[var115] & 16777215, var125 | var101.field2615[var116] & 16777215, arg3.field7957, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field2615[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method2052(this.field4526.field830.method1072(var124, true).field7443)) {
                                                arg4.field693 = -1694498816;
                                            }
                                            arg4.method377((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class397.method2234(-117, arg8[var114] << 24 | arg3.field7957, var101.field2615[var114]), class397.method2234(-97, arg8[var115] << 24 | arg3.field7957, var101.field2615[var115]), class397.method2234(-99, arg8[var116] << 24 | arg3.field7957, var101.field2615[var116]));
                                            arg4.field693 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method2052(this.field4526.field830.method1072(var124, true).field7443)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method381((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field2611[var114] / (float) super.field3557, (float) var101.field2611[var115] / (float) super.field3557, (float) var101.field2611[var116] / (float) super.field3557, (float) var101.field2613[var114] / (float) super.field3557, (float) var101.field2613[var115] / (float) super.field3557, (float) var101.field2613[var116] / (float) super.field3557, var126 | var101.field2615[var114] & 16777215, var126 | var101.field2615[var115] & 16777215, var126 | var101.field2615[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field2615[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method2052(this.field4526.field830.method1072(var124, true).field7443)) {
                                            arg4.field693 = -1694498816;
                                        }
                                        arg4.method377((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field2615[var114], var101.field2615[var115], var101.field2615[var116]);
                                        arg4.field693 = 0;
                                    }
                                } else {
                                    arg4.method378((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7957);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field2614; ++var127) {
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
                            arg4.field696 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field694 || var132 > arg4.field694 || var133 > arg4.field694;
                            short var138 = var101.field2612[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method2052(this.field4526.field830.method1072(var138, true).field7443)) {
                                    arg4.field693 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method2052(this.field4526.field830.method1072(var138, true).field7443)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method381((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field2611[var128] / (float) super.field3557, (float) var101.field2611[var129] / (float) super.field3557, (float) var101.field2611[var130] / (float) super.field3557, (float) var101.field2613[var128] / (float) super.field3557, (float) var101.field2613[var129] / (float) super.field3557, (float) var101.field2613[var130] / (float) super.field3557, var139 | var101.field2615[var128] & 16777215, var139 | var101.field2615[var129] & 16777215, var139 | var101.field2615[var130] & 16777215, arg3.field7957, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field2615[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method2052(this.field4526.field830.method1072(var138, true).field7443)) {
                                            arg4.field693 = -1694498816;
                                        }
                                        arg4.method377((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class397.method2234(-111, arg8[var128] << 24 | arg3.field7957, var101.field2615[var128]), class397.method2234(-110, arg8[var129] << 24 | arg3.field7957, var101.field2615[var129]), class397.method2234(-116, arg8[var130] << 24 | arg3.field7957, var101.field2615[var130]));
                                        arg4.field693 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method2052(this.field4526.field830.method1072(var138, true).field7443)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method381((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field2611[var128] / (float) super.field3557, (float) var101.field2611[var129] / (float) super.field3557, (float) var101.field2611[var130] / (float) super.field3557, (float) var101.field2613[var128] / (float) super.field3557, (float) var101.field2613[var129] / (float) super.field3557, (float) var101.field2613[var130] / (float) super.field3557, var140 | var101.field2615[var128] & 16777215, var140 | var101.field2615[var129] & 16777215, var140 | var101.field2615[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field2615[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method2052(this.field4526.field830.method1072(var138, true).field7443)) {
                                        arg4.field693 = -1694498816;
                                    }
                                    arg4.method377((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field2615[var128], var101.field2615[var129], var101.field2615[var130]);
                                    arg4.field693 = 0;
                                }
                                arg4.field693 = 0;
                            } else {
                                arg4.method378((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7957);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field2614; ++var141) {
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
                        arg4.field696 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field694 || var146 > arg4.field694 || var147 > arg4.field694;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field2615[var142] & 16777215) != 0) {
                                    arg4.method377((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class29.method198(var101.field2615[var142], arg8[var142], (byte) 65, arg3.field7957), class29.method198(var101.field2615[var143], arg8[var143], (byte) -123, arg3.field7957), class29.method198(var101.field2615[var144], arg8[var144], (byte) -124, arg3.field7957));
                                }
                            } else if ((var101.field2615[var142] & 16777215) != 0) {
                                arg4.method377((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field2615[var142], var101.field2615[var143], var101.field2615[var144]);
                            }
                        } else {
                            arg4.method378((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7957);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILwba;[I[I[I[II)V")
    private final void method2055(int arg0, int arg1, class50 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class467 var9 = this.field4513[arg0][arg1];
        if (var9 != null) {
            if ((var9.field6269 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field6269 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3557 * arg0;
                int var11 = super.field3557 + var10;
                int var12 = super.field3557 * arg1;
                int var13 = super.field3557 + var12;
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
                if ((var9.field6269 & 1) != 0) {
                    int var14 = super.field3559[arg0][arg1];
                    float var15 = (float) var14 * this.field4525;
                    if (this.field4512 == -1) {
                        var16 = (float) var12 * this.field4509 + (float) var10 * this.field4528 + var15 + this.field4529;
                        if (var16 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var17 = (float) var12 * this.field4509 + (float) var11 * this.field4528 + var15 + this.field4529;
                        if (var17 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var18 = (float) var13 * this.field4509 + (float) var11 * this.field4528 + var15 + this.field4529;
                        if (var18 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var19 = (float) var13 * this.field4509 + (float) var10 * this.field4528 + var15 + this.field4529;
                        if (var19 <= (float) this.field4526.field4871) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field4509 + (float) var10 * this.field4528 + var15 + this.field4529;
                        var17 = (float) var12 * this.field4509 + (float) var11 * this.field4528 + var15 + this.field4529;
                        var18 = (float) var13 * this.field4509 + (float) var11 * this.field4528 + var15 + this.field4529;
                        var19 = (float) var13 * this.field4509 + (float) var10 * this.field4528 + var15 + this.field4529;
                    }
                    float var20 = (float) var14 * this.field4508;
                    float var21 = (float) var14 * this.field4514;
                    if (this.field4512 == -1) {
                        float var22 = (float) var12 * this.field4511 + (float) var10 * this.field4520 + var20 + this.field4519;
                        var23 = (int) ((float) this.field4526.field4874 * var22 / var16) + arg2.field702;
                        float var24 = (float) var12 * this.field4518 + (float) var10 * this.field4521 + var21 + this.field4527;
                        var25 = (int) ((float) this.field4526.field4881 * var24 / var16) + arg2.field706;
                        float var26 = (float) var12 * this.field4511 + (float) var11 * this.field4520 + var20 + this.field4519;
                        var27 = (int) ((float) this.field4526.field4874 * var26 / var17) + arg2.field702;
                        float var28 = (float) var12 * this.field4518 + (float) var11 * this.field4521 + var21 + this.field4527;
                        var29 = (int) ((float) this.field4526.field4881 * var28 / var17) + arg2.field706;
                        float var30 = (float) var13 * this.field4511 + (float) var11 * this.field4520 + var20 + this.field4519;
                        var31 = (int) ((float) this.field4526.field4874 * var30 / var18) + arg2.field702;
                        float var32 = (float) var13 * this.field4518 + (float) var11 * this.field4521 + var21 + this.field4527;
                        var33 = (int) ((float) this.field4526.field4881 * var32 / var18) + arg2.field706;
                        float var34 = (float) var13 * this.field4511 + (float) var10 * this.field4520 + var20 + this.field4519;
                        var35 = (int) ((float) this.field4526.field4874 * var34 / var19) + arg2.field702;
                        float var36 = (float) var13 * this.field4518 + (float) var10 * this.field4521 + var21 + this.field4527;
                        var37 = (int) ((float) this.field4526.field4881 * var36 / var19) + arg2.field706;
                    } else {
                        float var38 = (float) var12 * this.field4511 + (float) var10 * this.field4520 + var20 + this.field4519;
                        var23 = (int) ((float) this.field4526.field4874 * var38 / (float) this.field4512) + arg2.field702;
                        float var39 = (float) var12 * this.field4518 + (float) var10 * this.field4521 + var21 + this.field4527;
                        var25 = (int) ((float) this.field4526.field4881 * var39 / (float) this.field4512) + arg2.field706;
                        float var40 = (float) var12 * this.field4511 + (float) var11 * this.field4520 + var20 + this.field4519;
                        var27 = (int) ((float) this.field4526.field4874 * var40 / (float) this.field4512) + arg2.field702;
                        float var41 = (float) var12 * this.field4518 + (float) var11 * this.field4521 + var21 + this.field4527;
                        var29 = (int) ((float) this.field4526.field4881 * var41 / (float) this.field4512) + arg2.field706;
                        float var42 = (float) var13 * this.field4511 + (float) var11 * this.field4520 + var20 + this.field4519;
                        var31 = (int) ((float) this.field4526.field4874 * var42 / (float) this.field4512) + arg2.field702;
                        float var43 = (float) var13 * this.field4518 + (float) var11 * this.field4521 + var21 + this.field4527;
                        var33 = (int) ((float) this.field4526.field4881 * var43 / (float) this.field4512) + arg2.field706;
                        float var44 = (float) var13 * this.field4511 + (float) var10 * this.field4520 + var20 + this.field4519;
                        var35 = (int) ((float) this.field4526.field4874 * var44 / (float) this.field4512) + arg2.field702;
                        float var45 = (float) var13 * this.field4518 + (float) var10 * this.field4521 + var21 + this.field4527;
                        var37 = (int) ((float) this.field4526.field4881 * var45 / (float) this.field4512) + arg2.field706;
                    }
                } else {
                    int var46 = super.field3559[arg0][arg1];
                    int var47 = super.field3559[arg0 + 1][arg1];
                    int var48 = super.field3559[arg0 + 1][arg1 + 1];
                    int var49 = super.field3559[arg0][arg1 + 1];
                    if (this.field4512 == -1) {
                        var16 = (float) var12 * this.field4509 + (float) var10 * this.field4528 + (float) var46 * this.field4525 + this.field4529;
                        if (var16 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var17 = (float) var12 * this.field4509 + (float) var11 * this.field4528 + (float) var47 * this.field4525 + this.field4529;
                        if (var17 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var18 = (float) var13 * this.field4509 + (float) var11 * this.field4528 + (float) var48 * this.field4525 + this.field4529;
                        if (var18 <= (float) this.field4526.field4871) {
                            return;
                        }
                        var19 = (float) var13 * this.field4509 + (float) var10 * this.field4528 + (float) var49 * this.field4525 + this.field4529;
                        if (var19 <= (float) this.field4526.field4871) {
                            return;
                        }
                        float var50 = (float) var12 * this.field4511 + (float) var10 * this.field4520 + (float) var46 * this.field4508 + this.field4519;
                        var23 = (int) ((float) this.field4526.field4874 * var50 / var16) + arg2.field702;
                        float var51 = (float) var12 * this.field4518 + (float) var10 * this.field4521 + (float) var46 * this.field4514 + this.field4527;
                        var25 = (int) ((float) this.field4526.field4881 * var51 / var16) + arg2.field706;
                        float var52 = (float) var12 * this.field4511 + (float) var11 * this.field4520 + (float) var47 * this.field4508 + this.field4519;
                        var27 = (int) ((float) this.field4526.field4874 * var52 / var17) + arg2.field702;
                        float var53 = (float) var12 * this.field4518 + (float) var11 * this.field4521 + (float) var47 * this.field4514 + this.field4527;
                        var29 = (int) ((float) this.field4526.field4881 * var53 / var17) + arg2.field706;
                        float var54 = (float) var13 * this.field4511 + (float) var11 * this.field4520 + (float) var48 * this.field4508 + this.field4519;
                        var31 = (int) ((float) this.field4526.field4874 * var54 / var18) + arg2.field702;
                        float var55 = (float) var13 * this.field4518 + (float) var11 * this.field4521 + (float) var48 * this.field4514 + this.field4527;
                        var33 = (int) ((float) this.field4526.field4881 * var55 / var18) + arg2.field706;
                        float var56 = (float) var13 * this.field4511 + (float) var10 * this.field4520 + (float) var49 * this.field4508 + this.field4519;
                        var35 = (int) ((float) this.field4526.field4874 * var56 / var19) + arg2.field702;
                        float var57 = (float) var13 * this.field4518 + (float) var10 * this.field4521 + (float) var49 * this.field4514 + this.field4527;
                        var37 = (int) ((float) this.field4526.field4881 * var57 / var19) + arg2.field706;
                    } else {
                        var16 = (float) var12 * this.field4509 + (float) var10 * this.field4528 + (float) var46 * this.field4525 + this.field4529;
                        var17 = (float) var12 * this.field4509 + (float) var11 * this.field4528 + (float) var47 * this.field4525 + this.field4529;
                        var18 = (float) var13 * this.field4509 + (float) var11 * this.field4528 + (float) var48 * this.field4525 + this.field4529;
                        var19 = (float) var13 * this.field4509 + (float) var10 * this.field4528 + (float) var49 * this.field4525 + this.field4529;
                        float var58 = (float) var12 * this.field4511 + (float) var10 * this.field4520 + (float) var46 * this.field4508 + this.field4519;
                        var23 = (int) ((float) this.field4526.field4874 * var58 / (float) this.field4512) + arg2.field702;
                        float var59 = (float) var12 * this.field4518 + (float) var10 * this.field4521 + (float) var46 * this.field4514 + this.field4527;
                        var25 = (int) ((float) this.field4526.field4881 * var59 / (float) this.field4512) + arg2.field706;
                        float var60 = (float) var12 * this.field4511 + (float) var11 * this.field4520 + (float) var47 * this.field4508 + this.field4519;
                        var27 = (int) ((float) this.field4526.field4874 * var60 / (float) this.field4512) + arg2.field702;
                        float var61 = (float) var12 * this.field4518 + (float) var11 * this.field4521 + (float) var47 * this.field4514 + this.field4527;
                        var29 = (int) ((float) this.field4526.field4881 * var61 / (float) this.field4512) + arg2.field706;
                        float var62 = (float) var13 * this.field4511 + (float) var11 * this.field4520 + (float) var48 * this.field4508 + this.field4519;
                        var31 = (int) ((float) this.field4526.field4874 * var62 / (float) this.field4512) + arg2.field702;
                        float var63 = (float) var13 * this.field4518 + (float) var11 * this.field4521 + (float) var48 * this.field4514 + this.field4527;
                        var33 = (int) ((float) this.field4526.field4881 * var63 / (float) this.field4512) + arg2.field706;
                        float var64 = (float) var13 * this.field4511 + (float) var10 * this.field4520 + (float) var49 * this.field4508 + this.field4519;
                        var35 = (int) ((float) this.field4526.field4874 * var64 / (float) this.field4512) + arg2.field702;
                        float var65 = (float) var13 * this.field4518 + (float) var10 * this.field4521 + (float) var49 * this.field4514 + this.field4527;
                        var37 = (int) ((float) this.field4526.field4881 * var65 / (float) this.field4512) + arg2.field706;
                    }
                }
                if (this.field4512 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field696 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field694 || var35 > arg2.field694 || var27 > arg2.field694;
                        if (var9.field6270 >= 0) {
                            arg2.method381((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class22.field415[var9.field6271 & 65535] & 16777215, -16777216 | class22.field415[var9.field6274 & 65535] & 16777215, -16777216 | class22.field415[var9.field6268 & 65535] & 16777215, 0, 0, 0, 0, var9.field6270);
                        } else {
                            arg2.method383((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field6271 & 65535), (float) (var9.field6274 & 65535), (float) (var9.field6268 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field696 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field694 || var27 > arg2.field694 || var35 > arg2.field694;
                        if (var9.field6270 >= 0) {
                            arg2.method381((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class22.field415[var9.field6273 & 65535] & 16777215, -16777216 | class22.field415[var9.field6268 & 65535] & 16777215, -16777216 | class22.field415[var9.field6274 & 65535] & 16777215, 0, 0, 0, 0, var9.field6270);
                            return;
                        }
                        arg2.method383((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field6273 & 65535), (float) (var9.field6268 & 65535), (float) (var9.field6274 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field696 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field694 || var35 > arg2.field694 || var27 > arg2.field694;
                        if (var9.field6270 >= 0) {
                            arg2.method381((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class22.field415[var9.field6271 & 65535] & 16777215, -16777216 | class22.field415[var9.field6274 & 65535] & 16777215, -16777216 | class22.field415[var9.field6268 & 65535] & 16777215, 0, 0, 0, 0, var9.field6270);
                        } else {
                            arg2.method383((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field6271 & 65535), (float) (var9.field6274 & 65535), (float) (var9.field6268 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field696 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field694 || var27 > arg2.field694 || var35 > arg2.field694;
                        if (var9.field6270 >= 0) {
                            arg2.method381((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class22.field415[var9.field6273 & 65535] & 16777215, -16777216 | class22.field415[var9.field6268 & 65535] & 16777215, -16777216 | class22.field415[var9.field6274 & 65535] & 16777215, 0, 0, 0, 0, var9.field6270);
                            return;
                        }
                        arg2.method383((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field6273 & 65535), (float) (var9.field6268 & 65535), (float) (var9.field6274 & 65535));
                    }
                }
            }
        } else {
            class46 var66 = this.field4510[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field671 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field4512 == -1) {
                    for (int var67 = 0; var67 < var66.field668; ++var67) {
                        int var68 = (arg0 << super.field3550) + var66.field670[var67];
                        short var69 = var66.field673[var67];
                        int var70 = (arg1 << super.field3550) + var66.field672[var67];
                        float var71 = (float) var70 * this.field4509 + (float) var68 * this.field4528 + (float) var69 * this.field4525 + this.field4529;
                        if (var71 <= (float) this.field4526.field4871) {
                            return;
                        }
                        float var72 = (float) var70 * this.field4511 + (float) var68 * this.field4520 + (float) var69 * this.field4508 + this.field4519;
                        float var73 = (float) var70 * this.field4518 + (float) var68 * this.field4521 + (float) var69 * this.field4514 + this.field4527;
                        arg3[var67] = (int) ((float) this.field4526.field4874 * var72 / var71) + arg2.field702;
                        arg4[var67] = (int) ((float) this.field4526.field4881 * var73 / var71) + arg2.field706;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field668; ++var74) {
                        int var110 = (arg0 << super.field3550) + var66.field670[var74];
                        short var111 = var66.field673[var74];
                        int var112 = (arg1 << super.field3550) + var66.field672[var74];
                        float var113 = (float) var112 * this.field4509 + (float) var110 * this.field4528 + (float) var111 * this.field4525 + this.field4529;
                        float var114 = (float) var112 * this.field4511 + (float) var110 * this.field4520 + (float) var111 * this.field4508 + this.field4519;
                        float var115 = (float) var112 * this.field4518 + (float) var110 * this.field4521 + (float) var111 * this.field4514 + this.field4527;
                        arg3[var74] = (int) ((float) this.field4526.field4874 * var114 / (float) this.field4512) + arg2.field702;
                        arg4[var74] = (int) ((float) this.field4526.field4881 * var115 / (float) this.field4512) + arg2.field706;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field675 != null) {
                    if (this.field4512 == -1) {
                        for (int var75 = 0; var75 < var66.field666; ++var75) {
                            short var76 = var66.field669[var75];
                            short var77 = var66.field677[var75];
                            short var78 = var66.field676[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field696 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field694 || var80 > arg2.field694 || var81 > arg2.field694;
                                short var85 = var66.field675[var75];
                                if (var85 != -1) {
                                    arg2.method381((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field670[var76] / (float) super.field3557, (float) var66.field670[var77] / (float) super.field3557, (float) var66.field670[var78] / (float) super.field3557, (float) var66.field672[var76] / (float) super.field3557, (float) var66.field672[var77] / (float) super.field3557, (float) var66.field672[var78] / (float) super.field3557, -16777216 | class22.field415[var66.field664[var76] & 65535] & 16777215, -16777216 | class22.field415[var66.field664[var77] & 65535] & 16777215, -16777216 | class22.field415[var66.field664[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field667[var75];
                                    if (var86 != -1) {
                                        arg2.method383((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class752.method4183(var86, 126, var66.field664[var76]), (float) class752.method4183(var86, 126, var66.field664[var77]), (float) class752.method4183(var86, 126, var66.field664[var78]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field666; ++var87) {
                        short var88 = var66.field669[var87];
                        short var89 = var66.field677[var87];
                        short var90 = var66.field676[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field696 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field694 || var92 > arg2.field694 || var93 > arg2.field694;
                            short var97 = var66.field675[var87];
                            if (var97 != -1) {
                                arg2.method381((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field670[var88] / (float) super.field3557, (float) var66.field670[var89] / (float) super.field3557, (float) var66.field670[var90] / (float) super.field3557, (float) var66.field672[var88] / (float) super.field3557, (float) var66.field672[var89] / (float) super.field3557, (float) var66.field672[var90] / (float) super.field3557, -16777216 | class22.field415[var66.field664[var88] & 65535] & 16777215, -16777216 | class22.field415[var66.field664[var89] & 65535] & 16777215, -16777216 | class22.field415[var66.field664[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field667[var87];
                                if (var98 != -1) {
                                    arg2.method383((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class752.method4183(var98, 126, var66.field664[var88]), (float) class752.method4183(var98, 126, var66.field664[var89]), (float) class752.method4183(var98, 126, var66.field664[var90]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field666; ++var99) {
                    short var100 = var66.field669[var99];
                    short var101 = var66.field677[var99];
                    short var102 = var66.field676[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field667[var99];
                        if (var109 != -1) {
                            arg2.field696 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field694 || var104 > arg2.field694 || var105 > arg2.field694;
                            arg2.method383((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class752.method4183(var109, 126, var66.field664[var100]), (float) class752.method4183(var109, 126, var66.field664[var101]), (float) class752.method4183(var109, 126, var66.field664[var102]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1680(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class174 var8 = this.field4526.field4907;
        this.field4512 = arg5;
        this.field4520 = var8.field2422;
        this.field4508 = var8.field2424;
        this.field4511 = var8.field2431;
        this.field4519 = var8.field2411;
        this.field4521 = var8.field2438;
        this.field4514 = var8.field2439;
        this.field4518 = var8.field2410;
        this.field4527 = var8.field2408;
        this.field4528 = var8.field2412;
        this.field4525 = var8.field2435;
        this.field4509 = var8.field2426;
        this.field4529 = var8.field2434;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3561 && var12 >= 0 && var12 < super.field3555) {
                        this.method2057(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1671(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4513 == null) {
            this.field4513 = new class467[super.field3561][super.field3555];
            this.field4510 = new class46[super.field3561][super.field3555];
        } else if (this.field4517 != null || this.field4516 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3557 != var20 || var21 != 0 && super.field3557 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class46 var22 = new class46();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field668 = var23;
            var22.field664 = new short[var23];
            var22.field670 = new short[var23];
            var22.field673 = new short[var23];
            var22.field672 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field664[var25] = (short) (this.field4522[arg0][arg1] - this.field4515[arg0][arg1]);
                } else if (var32 == 0 && super.field3557 == var33) {
                    var22.field664[var25] = (short) (this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]);
                } else if (super.field3557 == var32 && super.field3557 == var33) {
                    var22.field664[var25] = (short) (this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]);
                } else if (super.field3557 == var32 && var33 == 0) {
                    var22.field664[var25] = (short) (this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]) * var32 + (this.field4522[arg0][arg1] - this.field4515[arg0][arg1]) * (super.field3557 - var32);
                    int var35 = (this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]) * var32 + (this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]) * (super.field3557 - var32);
                    var22.field664[var25] = (short) ((super.field3557 - var33) * var34 + var33 * var35 >> super.field3550 * 2);
                }
                int var36 = (arg0 << super.field3550) + var32;
                int var37 = (arg1 << super.field3550) + var33;
                var22.field670[var25] = (short) var32;
                var22.field672[var25] = (short) var33;
                var22.field673[var25] = (short) (this.method1676(var36, true, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field664[var25] < 2) {
                    var22.field664[var25] = 2;
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
                    class537 var31 = this.field4526.field830.method1072(var30, true);
                    if (!var31.field7456) {
                        var26 = true;
                        if (this.method2052(var31.field7443) || var31.field7441 != 0 || var31.field7444 != 0) {
                            var22.field671 = (byte) (var22.field671 | 4);
                        }
                    }
                }
            }
            var22.field667 = new int[var27];
            if (arg10 != null) {
                var22.field674 = new int[var27];
            }
            var22.field669 = new short[var27];
            var22.field677 = new short[var27];
            var22.field676 = new short[var27];
            if (var26) {
                var22.field675 = new short[var27];
                var22.field665 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field667[var22.field666] = class693.method3882(arg9[var29], 63);
                    } else {
                        var22.field667[var22.field666] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field674[var22.field666] = class693.method3882(arg10[var29], 63);
                        } else {
                            var22.field674[var22.field666] = -1;
                        }
                    }
                    var22.field669[var22.field666] = (short) arg6[var29];
                    var22.field677[var22.field666] = (short) arg7[var29];
                    var22.field676[var22.field666] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4526.field830.method1072(arg11[var29], true).field7456) {
                            var22.field675[var22.field666] = (short) arg11[var29];
                            var22.field665[var22.field666] = (short) arg12[var29];
                        } else {
                            var22.field675[var22.field666] = -1;
                        }
                    }
                    ++var22.field666;
                }
            }
            this.field4510[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class467 var38 = new class467();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field6272 = class752.method4183(class693.method3882(arg10[0], 63), 126, this.field4522[arg0][arg1] - this.field4515[arg0][arg1]);
                    if (var39 == -1) {
                        var38.field6269 = (byte) (var38.field6269 | 2);
                    }
                }
                if (super.field3559[arg0 + 1][arg1] == super.field3559[arg0][arg1] && super.field3559[arg0 + 1][arg1 + 1] == super.field3559[arg0][arg1] && super.field3559[arg0][arg1 + 1] == super.field3559[arg0][arg1]) {
                    var38.field6269 = (byte) (var38.field6269 | 1);
                }
                class537 var41 = null;
                if (var40 != -1) {
                    var41 = this.field4526.field830.method1072(var40, true);
                }
                if (var41 != null && (var38.field6269 & 2) == 0 && !var41.field7456) {
                    var38.field6273 = (short) (this.field4522[arg0][arg1] - this.field4515[arg0][arg1]);
                    var38.field6268 = (short) (this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]);
                    var38.field6271 = (short) (this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]);
                    var38.field6274 = (short) (this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]);
                    var38.field6270 = (short) var40;
                    if (this.method2052(var41.field7443) || var41.field7441 != 0 || var41.field7444 != 0) {
                        var38.field6269 = (byte) (var38.field6269 | 4);
                    }
                } else {
                    short var42 = class693.method3882(var39, 63);
                    var38.field6273 = (short) class752.method4183(var42, 126, this.field4522[arg0][arg1] - this.field4515[arg0][arg1]);
                    var38.field6268 = (short) class752.method4183(var42, 126, this.field4522[arg0 + 1][arg1] - this.field4515[arg0 + 1][arg1]);
                    var38.field6271 = (short) class752.method4183(var42, 126, this.field4522[arg0 + 1][arg1 + 1] - this.field4515[arg0 + 1][arg1 + 1]);
                    var38.field6274 = (short) class752.method4183(var42, 126, this.field4522[arg0][arg1 + 1] - this.field4515[arg0][arg1 + 1]);
                    var38.field6270 = -1;
                }
                this.field4513[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)I")
    private static final int method2056(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    private final void method2057(int arg0, int arg1, int arg2) {
        class567 var4 = this.field4526.method2185(Thread.currentThread());
        var4.field7973.field693 = 0;
        if (this.field4517 != null) {
            this.method2054(arg0, arg1, var4.field7952, var4, var4.field7973, var4.field7988, var4.field7968, var4.field7996, var4.field8002, arg2);
        } else if (this.field4513 != null) {
            this.method2055(arg0, arg1, var4.field7973, var4.field7988, var4.field7968, var4.field7996, var4.field8002, arg2);
        } else {
            if (this.field4516 != null) {
                this.method2051(arg0, arg1, var4.field7952, var4, var4.field7973, var4.field7988, var4.field7968, var4.field7996, var4.field8002, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Llaa;[I)V")
    public final void method1687(class123 arg0, int[] arg1) {
    }
}
