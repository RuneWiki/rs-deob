import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class183 extends class341 {

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    private int field2510 = -1;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Lfga;")
    private class276 field2504;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "[[B")
    private byte[][] field2499;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "[[B")
    private byte[][] field2519;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "F")
    private float field2500;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "F")
    private float field2502;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "F")
    private float field2503;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "F")
    private float field2505;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "F")
    private float field2506;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "F")
    private float field2512;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "F")
    private float field2513;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "F")
    private float field2514;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "F")
    private float field2515;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "F")
    private float field2516;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "F")
    private float field2517;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "F")
    private float field2518;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "[[Lvca;")
    private class271[][] field2511;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "[[Lul;")
    private class366[][] field2509;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "[[Llb;")
    private class637[][] field2520;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "[[Lpv;")
    private class668[][] field2501;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "[[Lck;")
    private class706[][] field2507;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ltj;[I)V")
    public final void method1036(class687 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII[[ZLrd;Lsd;[I[I)V")
    private final void method1150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class552 arg8, class59 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7665;
        this.field2504.method1529(false);
        arg9.field846 = false;
        arg9.field835 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field2520 != null) {
                        if (this.field2520[var18][var19] != null) {
                            class637 var20 = this.field2520[var18][var19];
                            if (var20.field8559 != -1 && (var20.field8554 & 2) == 0 && var20.field8560 == 0) {
                                int var21 = this.field2504.method1852(var20.field8559);
                                arg9.method423((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class587.method3392(var20.field8561, var21, 86), (float) class587.method3392(var20.field8556, var21, 78), (float) class587.method3392(var20.field8557, var21, 87));
                                arg9.method423((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class587.method3392(var20.field8558, var21, 95), (float) class587.method3392(var20.field8557, var21, 67), (float) class587.method3392(var20.field8556, var21, 123));
                            } else if (var20.field8560 == 0) {
                                arg9.method418((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field8561, var20.field8556, var20.field8557);
                                arg9.method418((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field8558, var20.field8557, var20.field8556);
                            } else {
                                int var22 = var20.field8560;
                                arg9.method418((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class380.method2385((byte) -56, var20.field8561 & -16777216, var22), class380.method2385((byte) -56, var20.field8556 & -16777216, var22), class380.method2385((byte) -56, var20.field8557 & -16777216, var22));
                                arg9.method418((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class380.method2385((byte) -56, var20.field8558 & -16777216, var22), class380.method2385((byte) -56, var20.field8557 & -16777216, var22), class380.method2385((byte) -56, var20.field8556 & -16777216, var22));
                            }
                        } else if (this.field2501[var18][var19] != null) {
                            class668 var23 = this.field2501[var18][var19];
                            for (int var24 = 0; var24 < var23.field9229; ++var24) {
                                arg10[var24] = var23.field9222[var24] * var14 / super.field4818 + var16;
                                arg11[var24] = var17 - var23.field9225[var24] * var14 / super.field4818;
                            }
                            for (int var25 = 0; var25 < var23.field9227; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field9228 != null && var23.field9228[var25] != 0 && (var23.field9223 == null || var23.field9223 != null && var23.field9223[var25] == -1)) {
                                    int var35 = var23.field9228[var25];
                                    arg9.method418((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class380.method2385((byte) -56, -16777216 - (var23.field9224[var26] & -16777216), var35), class380.method2385((byte) -56, -16777216 - (var23.field9224[var27] & -16777216), var35), class380.method2385((byte) -56, -16777216 - (var23.field9224[var28] & -16777216), var35));
                                } else if (var23.field9223 != null && var23.field9223[var25] != -1) {
                                    int var36 = this.field2504.method1852(var23.field9223[var25]);
                                    arg9.method423((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method418((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field9224[var26], var23.field9224[var27], var23.field9224[var28]);
                                }
                            }
                        }
                    } else if (this.field2511[var18][var19] != null) {
                        class271 var37 = this.field2511[var18][var19];
                        for (int var38 = 0; var38 < var37.field3944; ++var38) {
                            arg10[var38] = var37.field3939[var38] * var14 / super.field4818 + var16;
                            arg11[var38] = var17 - var37.field3940[var38] * var14 / super.field4818;
                        }
                        for (int var39 = 0; var39 < var37.field3937; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field3941 != null && var37.field3941[var39] != 0) {
                                int var49 = var37.field3941[var39];
                                arg9.method418((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method418((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field3935[var40], var37.field3935[var41], var37.field3935[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field846 = true;
        this.field2504.method1529(var15);
    }

    @OriginalMember(owner = "client!ei", name = "YA", descriptor = "()V")
    public final void method1028() {
        this.field2499 = null;
        this.field2519 = null;
    }

    @OriginalMember(owner = "client!ei", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1042(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZLrd;Lsd;[I[I[I[II)V")
    private final void method1151(int arg0, int arg1, boolean arg2, class552 arg3, class59 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class271 var11 = this.field2511[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field2510 == -1) {
                    for (int var12 = 0; var12 < var11.field3944; ++var12) {
                        int var13 = (arg0 << super.field4822) + var11.field3939[var12];
                        int var14 = var11.field3938[var12];
                        int var15 = (arg1 << super.field4822) + var11.field3940[var12];
                        float var16 = (float) var15 * this.field2517 + (float) var13 * this.field2512 + (float) var14 * this.field2513 + this.field2516;
                        if (var16 <= (float) this.field2504.field4000) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7670);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field3945[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7668) {
                            int var19 = (int) (var16 - (float) arg3.field7670);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field2500 + (float) var13 * this.field2502 + (float) var14 * this.field2505 + this.field2515;
                        float var21 = (float) var15 * this.field2518 + (float) var13 * this.field2514 + (float) var14 * this.field2506 + this.field2503;
                        arg5[var12] = (int) ((float) this.field2504.field4009 * var20 / var16) + arg4.field838;
                        arg6[var12] = (int) ((float) this.field2504.field4018 * var21 / var16) + arg4.field842;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field3944; ++var22) {
                        int var36 = (arg0 << super.field4822) + var11.field3939[var22];
                        int var37 = var11.field3938[var22];
                        int var38 = (arg1 << super.field4822) + var11.field3940[var22];
                        float var39 = (float) var38 * this.field2517 + (float) var36 * this.field2512 + (float) var37 * this.field2513 + this.field2516;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field2510 - arg3.field7670;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field3945[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7668) {
                            int var42 = this.field2510 - arg3.field7670;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field2500 + (float) var36 * this.field2502 + (float) var37 * this.field2505 + this.field2515;
                        float var44 = (float) var38 * this.field2518 + (float) var36 * this.field2514 + (float) var37 * this.field2506 + this.field2503;
                        arg5[var22] = (int) ((float) this.field2504.field4009 * var43 / (float) this.field2510) + arg4.field838;
                        arg6[var22] = (int) ((float) this.field2504.field4018 * var44 / (float) this.field2510) + arg4.field842;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field4818;
                for (int var24 = 0; var24 < var11.field3937; ++var24) {
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
                        arg4.field831 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field845 || var29 > arg4.field845 || var30 > arg4.field845;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field4822;
                            int var35 = arg1 << super.field4822;
                            if ((var11.field3935[var25] & 16777215) != 0) {
                                if (var11.field3943[var25] == var11.field3943[var26] && var11.field3943[var25] == var11.field3943[var27] && var11.field3936[var25] == var11.field3936[var26] && var11.field3936[var25] == var11.field3936[var27]) {
                                    arg4.method428((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field3939[var25] + var34) / (float) var11.field3936[var25], (float) (var11.field3939[var26] + var34) / (float) var11.field3936[var26], (float) (var11.field3939[var27] + var34) / (float) var11.field3936[var27], (float) (var11.field3940[var25] + var35) / (float) var11.field3936[var25], (float) (var11.field3940[var26] + var35) / (float) var11.field3936[var26], (float) (var11.field3940[var27] + var35) / (float) var11.field3936[var27], var11.field3935[var25], var11.field3935[var26], var11.field3935[var27], arg3.field7663, arg8[var25], arg8[var26], arg8[var27], var11.field3943[var25]);
                                } else {
                                    arg4.method426((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field3939[var25] + var34) / var23, (float) (var11.field3939[var26] + var34) / var23, (float) (var11.field3939[var27] + var34) / var23, (float) (var11.field3940[var25] + var35) / var23, (float) (var11.field3940[var26] + var35) / var23, (float) (var11.field3940[var27] + var35) / var23, var11.field3935[var25], var11.field3935[var26], var11.field3935[var27], arg3.field7663, arg8[var25], arg8[var26], arg8[var27], var11.field3943[var25], var23 / (float) var11.field3936[var25], var11.field3943[var26], var23 / (float) var11.field3936[var26], var11.field3943[var27], var23 / (float) var11.field3936[var27]);
                                }
                            }
                        } else {
                            arg4.method419((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7663);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILsd;[I[I[I[II)V")
    private final void method1152(int arg0, int arg1, class59 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class366 var9 = this.field2509[arg0][arg1];
        if (var9 != null) {
            if ((var9.field5196 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field5196 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field4818 * arg0;
                int var11 = super.field4818 + var10;
                int var12 = super.field4818 * arg1;
                int var13 = super.field4818 + var12;
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
                if ((var9.field5196 & 1) != 0) {
                    int var14 = super.field4821[arg0][arg1];
                    float var15 = (float) var14 * this.field2513;
                    if (this.field2510 == -1) {
                        var16 = (float) var12 * this.field2517 + (float) var10 * this.field2512 + var15 + this.field2516;
                        if (var16 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var17 = (float) var12 * this.field2517 + (float) var11 * this.field2512 + var15 + this.field2516;
                        if (var17 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var18 = (float) var13 * this.field2517 + (float) var11 * this.field2512 + var15 + this.field2516;
                        if (var18 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var19 = (float) var13 * this.field2517 + (float) var10 * this.field2512 + var15 + this.field2516;
                        if (var19 <= (float) this.field2504.field4000) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field2517 + (float) var10 * this.field2512 + var15 + this.field2516;
                        var17 = (float) var12 * this.field2517 + (float) var11 * this.field2512 + var15 + this.field2516;
                        var18 = (float) var13 * this.field2517 + (float) var11 * this.field2512 + var15 + this.field2516;
                        var19 = (float) var13 * this.field2517 + (float) var10 * this.field2512 + var15 + this.field2516;
                    }
                    float var20 = (float) var14 * this.field2505;
                    float var21 = (float) var14 * this.field2506;
                    if (this.field2510 == -1) {
                        float var22 = (float) var12 * this.field2500 + (float) var10 * this.field2502 + var20 + this.field2515;
                        var23 = (int) ((float) this.field2504.field4009 * var22 / var16) + arg2.field838;
                        float var24 = (float) var12 * this.field2518 + (float) var10 * this.field2514 + var21 + this.field2503;
                        var25 = (int) ((float) this.field2504.field4018 * var24 / var16) + arg2.field842;
                        float var26 = (float) var12 * this.field2500 + (float) var11 * this.field2502 + var20 + this.field2515;
                        var27 = (int) ((float) this.field2504.field4009 * var26 / var17) + arg2.field838;
                        float var28 = (float) var12 * this.field2518 + (float) var11 * this.field2514 + var21 + this.field2503;
                        var29 = (int) ((float) this.field2504.field4018 * var28 / var17) + arg2.field842;
                        float var30 = (float) var13 * this.field2500 + (float) var11 * this.field2502 + var20 + this.field2515;
                        var31 = (int) ((float) this.field2504.field4009 * var30 / var18) + arg2.field838;
                        float var32 = (float) var13 * this.field2518 + (float) var11 * this.field2514 + var21 + this.field2503;
                        var33 = (int) ((float) this.field2504.field4018 * var32 / var18) + arg2.field842;
                        float var34 = (float) var13 * this.field2500 + (float) var10 * this.field2502 + var20 + this.field2515;
                        var35 = (int) ((float) this.field2504.field4009 * var34 / var19) + arg2.field838;
                        float var36 = (float) var13 * this.field2518 + (float) var10 * this.field2514 + var21 + this.field2503;
                        var37 = (int) ((float) this.field2504.field4018 * var36 / var19) + arg2.field842;
                    } else {
                        float var38 = (float) var12 * this.field2500 + (float) var10 * this.field2502 + var20 + this.field2515;
                        var23 = (int) ((float) this.field2504.field4009 * var38 / (float) this.field2510) + arg2.field838;
                        float var39 = (float) var12 * this.field2518 + (float) var10 * this.field2514 + var21 + this.field2503;
                        var25 = (int) ((float) this.field2504.field4018 * var39 / (float) this.field2510) + arg2.field842;
                        float var40 = (float) var12 * this.field2500 + (float) var11 * this.field2502 + var20 + this.field2515;
                        var27 = (int) ((float) this.field2504.field4009 * var40 / (float) this.field2510) + arg2.field838;
                        float var41 = (float) var12 * this.field2518 + (float) var11 * this.field2514 + var21 + this.field2503;
                        var29 = (int) ((float) this.field2504.field4018 * var41 / (float) this.field2510) + arg2.field842;
                        float var42 = (float) var13 * this.field2500 + (float) var11 * this.field2502 + var20 + this.field2515;
                        var31 = (int) ((float) this.field2504.field4009 * var42 / (float) this.field2510) + arg2.field838;
                        float var43 = (float) var13 * this.field2518 + (float) var11 * this.field2514 + var21 + this.field2503;
                        var33 = (int) ((float) this.field2504.field4018 * var43 / (float) this.field2510) + arg2.field842;
                        float var44 = (float) var13 * this.field2500 + (float) var10 * this.field2502 + var20 + this.field2515;
                        var35 = (int) ((float) this.field2504.field4009 * var44 / (float) this.field2510) + arg2.field838;
                        float var45 = (float) var13 * this.field2518 + (float) var10 * this.field2514 + var21 + this.field2503;
                        var37 = (int) ((float) this.field2504.field4018 * var45 / (float) this.field2510) + arg2.field842;
                    }
                } else {
                    int var46 = super.field4821[arg0][arg1];
                    int var47 = super.field4821[arg0 + 1][arg1];
                    int var48 = super.field4821[arg0 + 1][arg1 + 1];
                    int var49 = super.field4821[arg0][arg1 + 1];
                    if (this.field2510 == -1) {
                        var16 = (float) var12 * this.field2517 + (float) var10 * this.field2512 + (float) var46 * this.field2513 + this.field2516;
                        if (var16 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var17 = (float) var12 * this.field2517 + (float) var11 * this.field2512 + (float) var47 * this.field2513 + this.field2516;
                        if (var17 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var18 = (float) var13 * this.field2517 + (float) var11 * this.field2512 + (float) var48 * this.field2513 + this.field2516;
                        if (var18 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var19 = (float) var13 * this.field2517 + (float) var10 * this.field2512 + (float) var49 * this.field2513 + this.field2516;
                        if (var19 <= (float) this.field2504.field4000) {
                            return;
                        }
                        float var50 = (float) var12 * this.field2500 + (float) var10 * this.field2502 + (float) var46 * this.field2505 + this.field2515;
                        var23 = (int) ((float) this.field2504.field4009 * var50 / var16) + arg2.field838;
                        float var51 = (float) var12 * this.field2518 + (float) var10 * this.field2514 + (float) var46 * this.field2506 + this.field2503;
                        var25 = (int) ((float) this.field2504.field4018 * var51 / var16) + arg2.field842;
                        float var52 = (float) var12 * this.field2500 + (float) var11 * this.field2502 + (float) var47 * this.field2505 + this.field2515;
                        var27 = (int) ((float) this.field2504.field4009 * var52 / var17) + arg2.field838;
                        float var53 = (float) var12 * this.field2518 + (float) var11 * this.field2514 + (float) var47 * this.field2506 + this.field2503;
                        var29 = (int) ((float) this.field2504.field4018 * var53 / var17) + arg2.field842;
                        float var54 = (float) var13 * this.field2500 + (float) var11 * this.field2502 + (float) var48 * this.field2505 + this.field2515;
                        var31 = (int) ((float) this.field2504.field4009 * var54 / var18) + arg2.field838;
                        float var55 = (float) var13 * this.field2518 + (float) var11 * this.field2514 + (float) var48 * this.field2506 + this.field2503;
                        var33 = (int) ((float) this.field2504.field4018 * var55 / var18) + arg2.field842;
                        float var56 = (float) var13 * this.field2500 + (float) var10 * this.field2502 + (float) var49 * this.field2505 + this.field2515;
                        var35 = (int) ((float) this.field2504.field4009 * var56 / var19) + arg2.field838;
                        float var57 = (float) var13 * this.field2518 + (float) var10 * this.field2514 + (float) var49 * this.field2506 + this.field2503;
                        var37 = (int) ((float) this.field2504.field4018 * var57 / var19) + arg2.field842;
                    } else {
                        var16 = (float) var12 * this.field2517 + (float) var10 * this.field2512 + (float) var46 * this.field2513 + this.field2516;
                        var17 = (float) var12 * this.field2517 + (float) var11 * this.field2512 + (float) var47 * this.field2513 + this.field2516;
                        var18 = (float) var13 * this.field2517 + (float) var11 * this.field2512 + (float) var48 * this.field2513 + this.field2516;
                        var19 = (float) var13 * this.field2517 + (float) var10 * this.field2512 + (float) var49 * this.field2513 + this.field2516;
                        float var58 = (float) var12 * this.field2500 + (float) var10 * this.field2502 + (float) var46 * this.field2505 + this.field2515;
                        var23 = (int) ((float) this.field2504.field4009 * var58 / (float) this.field2510) + arg2.field838;
                        float var59 = (float) var12 * this.field2518 + (float) var10 * this.field2514 + (float) var46 * this.field2506 + this.field2503;
                        var25 = (int) ((float) this.field2504.field4018 * var59 / (float) this.field2510) + arg2.field842;
                        float var60 = (float) var12 * this.field2500 + (float) var11 * this.field2502 + (float) var47 * this.field2505 + this.field2515;
                        var27 = (int) ((float) this.field2504.field4009 * var60 / (float) this.field2510) + arg2.field838;
                        float var61 = (float) var12 * this.field2518 + (float) var11 * this.field2514 + (float) var47 * this.field2506 + this.field2503;
                        var29 = (int) ((float) this.field2504.field4018 * var61 / (float) this.field2510) + arg2.field842;
                        float var62 = (float) var13 * this.field2500 + (float) var11 * this.field2502 + (float) var48 * this.field2505 + this.field2515;
                        var31 = (int) ((float) this.field2504.field4009 * var62 / (float) this.field2510) + arg2.field838;
                        float var63 = (float) var13 * this.field2518 + (float) var11 * this.field2514 + (float) var48 * this.field2506 + this.field2503;
                        var33 = (int) ((float) this.field2504.field4018 * var63 / (float) this.field2510) + arg2.field842;
                        float var64 = (float) var13 * this.field2500 + (float) var10 * this.field2502 + (float) var49 * this.field2505 + this.field2515;
                        var35 = (int) ((float) this.field2504.field4009 * var64 / (float) this.field2510) + arg2.field838;
                        float var65 = (float) var13 * this.field2518 + (float) var10 * this.field2514 + (float) var49 * this.field2506 + this.field2503;
                        var37 = (int) ((float) this.field2504.field4018 * var65 / (float) this.field2510) + arg2.field842;
                    }
                }
                if (this.field2510 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field831 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field845 || var35 > arg2.field845 || var27 > arg2.field845;
                        if (var9.field5194 >= 0) {
                            arg2.method428((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class320.field4444[var9.field5191 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5193 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5197 & 65535] & 16777215, 0, 0, 0, 0, var9.field5194);
                        } else {
                            arg2.method423((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5191 & 65535), (float) (var9.field5193 & 65535), (float) (var9.field5197 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field831 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field845 || var27 > arg2.field845 || var35 > arg2.field845;
                        if (var9.field5194 >= 0) {
                            arg2.method428((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class320.field4444[var9.field5195 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5197 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5193 & 65535] & 16777215, 0, 0, 0, 0, var9.field5194);
                            return;
                        }
                        arg2.method423((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5195 & 65535), (float) (var9.field5197 & 65535), (float) (var9.field5193 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field831 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field845 || var35 > arg2.field845 || var27 > arg2.field845;
                        if (var9.field5194 >= 0) {
                            arg2.method428((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class320.field4444[var9.field5191 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5193 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5197 & 65535] & 16777215, 0, 0, 0, 0, var9.field5194);
                        } else {
                            arg2.method423((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5191 & 65535), (float) (var9.field5193 & 65535), (float) (var9.field5197 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field831 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field845 || var27 > arg2.field845 || var35 > arg2.field845;
                        if (var9.field5194 >= 0) {
                            arg2.method428((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class320.field4444[var9.field5195 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5197 & 65535] & 16777215, -16777216 | class320.field4444[var9.field5193 & 65535] & 16777215, 0, 0, 0, 0, var9.field5194);
                            return;
                        }
                        arg2.method423((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5195 & 65535), (float) (var9.field5197 & 65535), (float) (var9.field5193 & 65535));
                    }
                }
            }
        } else {
            class706 var66 = this.field2507[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field9838 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field2510 == -1) {
                    for (int var67 = 0; var67 < var66.field9843; ++var67) {
                        int var68 = (arg0 << super.field4822) + var66.field9832[var67];
                        short var69 = var66.field9840[var67];
                        int var70 = (arg1 << super.field4822) + var66.field9834[var67];
                        float var71 = (float) var70 * this.field2517 + (float) var68 * this.field2512 + (float) var69 * this.field2513 + this.field2516;
                        if (var71 <= (float) this.field2504.field4000) {
                            return;
                        }
                        float var72 = (float) var70 * this.field2500 + (float) var68 * this.field2502 + (float) var69 * this.field2505 + this.field2515;
                        float var73 = (float) var70 * this.field2518 + (float) var68 * this.field2514 + (float) var69 * this.field2506 + this.field2503;
                        arg3[var67] = (int) ((float) this.field2504.field4009 * var72 / var71) + arg2.field838;
                        arg4[var67] = (int) ((float) this.field2504.field4018 * var73 / var71) + arg2.field842;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field9843; ++var74) {
                        int var110 = (arg0 << super.field4822) + var66.field9832[var74];
                        short var111 = var66.field9840[var74];
                        int var112 = (arg1 << super.field4822) + var66.field9834[var74];
                        float var113 = (float) var112 * this.field2517 + (float) var110 * this.field2512 + (float) var111 * this.field2513 + this.field2516;
                        float var114 = (float) var112 * this.field2500 + (float) var110 * this.field2502 + (float) var111 * this.field2505 + this.field2515;
                        float var115 = (float) var112 * this.field2518 + (float) var110 * this.field2514 + (float) var111 * this.field2506 + this.field2503;
                        arg3[var74] = (int) ((float) this.field2504.field4009 * var114 / (float) this.field2510) + arg2.field838;
                        arg4[var74] = (int) ((float) this.field2504.field4018 * var115 / (float) this.field2510) + arg2.field842;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field9842 != null) {
                    if (this.field2510 == -1) {
                        for (int var75 = 0; var75 < var66.field9841; ++var75) {
                            short var76 = var66.field9839[var75];
                            short var77 = var66.field9833[var75];
                            short var78 = var66.field9835[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field831 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field845 || var80 > arg2.field845 || var81 > arg2.field845;
                                short var85 = var66.field9842[var75];
                                if (var85 != -1) {
                                    arg2.method428((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field9832[var76] / (float) super.field4818, (float) var66.field9832[var77] / (float) super.field4818, (float) var66.field9832[var78] / (float) super.field4818, (float) var66.field9834[var76] / (float) super.field4818, (float) var66.field9834[var77] / (float) super.field4818, (float) var66.field9834[var78] / (float) super.field4818, -16777216 | class320.field4444[var66.field9844[var76] & 65535] & 16777215, -16777216 | class320.field4444[var66.field9844[var77] & 65535] & 16777215, -16777216 | class320.field4444[var66.field9844[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field9837[var75];
                                    if (var86 != -1) {
                                        arg2.method423((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class587.method3392(var66.field9844[var76], var86, 95), (float) class587.method3392(var66.field9844[var77], var86, 99), (float) class587.method3392(var66.field9844[var78], var86, 97));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field9841; ++var87) {
                        short var88 = var66.field9839[var87];
                        short var89 = var66.field9833[var87];
                        short var90 = var66.field9835[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field831 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field845 || var92 > arg2.field845 || var93 > arg2.field845;
                            short var97 = var66.field9842[var87];
                            if (var97 != -1) {
                                arg2.method428((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field9832[var88] / (float) super.field4818, (float) var66.field9832[var89] / (float) super.field4818, (float) var66.field9832[var90] / (float) super.field4818, (float) var66.field9834[var88] / (float) super.field4818, (float) var66.field9834[var89] / (float) super.field4818, (float) var66.field9834[var90] / (float) super.field4818, -16777216 | class320.field4444[var66.field9844[var88] & 65535] & 16777215, -16777216 | class320.field4444[var66.field9844[var89] & 65535] & 16777215, -16777216 | class320.field4444[var66.field9844[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field9837[var87];
                                if (var98 != -1) {
                                    arg2.method423((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class587.method3392(var66.field9844[var88], var98, 88), (float) class587.method3392(var66.field9844[var89], var98, 113), (float) class587.method3392(var66.field9844[var90], var98, 92));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field9841; ++var99) {
                    short var100 = var66.field9839[var99];
                    short var101 = var66.field9833[var99];
                    short var102 = var66.field9835[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field9837[var99];
                        if (var109 != -1) {
                            arg2.field831 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field845 || var104 > arg2.field845 || var105 > arg2.field845;
                            arg2.method423((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class587.method3392(var66.field9844[var100], var109, 79), (float) class587.method3392(var66.field9844[var101], var109, 126), (float) class587.method3392(var66.field9844[var102], var109, 70));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIIIIII[[ZLrd;Lsd;[I[I)V")
    private final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class552 arg8, class59 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7665;
        this.field2504.method1529(false);
        arg9.field846 = false;
        arg9.field835 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field2509[var18][var19] != null) {
                        class366 var20 = this.field2509[var18][var19];
                        if (var20.field5194 != -1 && (var20.field5196 & 2) == 0 && var20.field5192 == -1) {
                            int var21 = this.field2504.method1852(var20.field5194);
                            arg9.method423((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class587.method3392(var20.field5191 & 65535, var21, 101), (float) class587.method3392(var20.field5193 & 65535, var21, 79), (float) class587.method3392(var20.field5197 & 65535, var21, 63));
                            arg9.method423((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class587.method3392(var20.field5195 & 65535, var21, 66), (float) class587.method3392(var20.field5197 & 65535, var21, 60), (float) class587.method3392(var20.field5193 & 65535, var21, 86));
                        } else if (var20.field5192 == -1) {
                            arg9.method423((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field5191 & 65535), (float) (var20.field5193 & 65535), (float) (var20.field5197 & 65535));
                            arg9.method423((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field5195 & 65535), (float) (var20.field5197 & 65535), (float) (var20.field5193 & 65535));
                        } else {
                            int var22 = var20.field5192;
                            arg9.method423((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method423((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field2507[var18][var19] != null) {
                        class706 var23 = this.field2507[var18][var19];
                        for (int var24 = 0; var24 < var23.field9843; ++var24) {
                            arg10[var24] = var23.field9832[var24] * var14 / super.field4818 + var16;
                            arg11[var24] = var17 - var23.field9834[var24] * var14 / super.field4818;
                        }
                        for (int var25 = 0; var25 < var23.field9841; ++var25) {
                            short var26 = var23.field9839[var25];
                            short var27 = var23.field9833[var25];
                            short var28 = var23.field9835[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field9836 != null && var23.field9836[var25] != -1) {
                                int var35 = var23.field9836[var25];
                                arg9.method423((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class587.method3392(var23.field9844[var26], var35, 94), (float) class587.method3392(var23.field9844[var27], var35, 101), (float) class587.method3392(var23.field9844[var28], var35, 104));
                            } else if (var23.field9842 != null && var23.field9842[var25] != -1) {
                                int var36 = this.field2504.method1852(var23.field9842[var25]);
                                arg9.method423((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class587.method3392(var23.field9844[var26], var36, 123), (float) class587.method3392(var23.field9844[var27], var36, 85), (float) class587.method3392(var23.field9844[var28], var36, 116));
                            } else {
                                int var37 = var23.field9837[var25];
                                arg9.method423((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class587.method3392(var23.field9844[var26], var37, 52), (float) class587.method3392(var23.field9844[var27], var37, 63), (float) class587.method3392(var23.field9844[var28], var37, 101));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field846 = true;
        this.field2504.method1529(var15);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1043(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class330 var8 = this.field2504.field3997;
        this.field2510 = arg5;
        this.field2502 = var8.field4683;
        this.field2505 = var8.field4691;
        this.field2500 = var8.field4689;
        this.field2515 = var8.field4665;
        this.field2514 = var8.field4664;
        this.field2506 = var8.field4694;
        this.field2518 = var8.field4662;
        this.field2503 = var8.field4669;
        this.field2512 = var8.field4676;
        this.field2513 = var8.field4673;
        this.field2517 = var8.field4687;
        this.field2516 = var8.field4677;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field4814 && var12 >= 0 && var12 < super.field4817) {
                        this.method1157(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lfga;IIII[[I[[II)V")
    public class183(class276 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2504 = arg0;
        this.field2508 = arg2;
        this.field2499 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field2504.field4011 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field2504.field3994 * var18 + this.field2504.field4019 * var16 + this.field2504.field4013 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field2499[var11][var10] = (byte) var20;
            }
        }
        this.field2519 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ei", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1025(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class552 var9 = this.field2504.method1859(Thread.currentThread());
        class59 var10 = var9.field7679;
        var10.field832 = 0;
        var10.field831 = true;
        this.field2504.method346();
        if (this.field2520 == null && this.field2511 == null) {
            if (this.field2509 != null) {
                this.method1153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7687, var9.field7698);
            }
        } else {
            this.method1150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7687, var9.field7698);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1027(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class330 var7 = this.field2504.field3997;
        this.field2510 = -1;
        this.field2502 = var7.field4683;
        this.field2505 = var7.field4691;
        this.field2500 = var7.field4689;
        this.field2515 = var7.field4665;
        this.field2514 = var7.field4664;
        this.field2506 = var7.field4694;
        this.field2518 = var7.field4662;
        this.field2503 = var7.field4669;
        this.field2512 = var7.field4676;
        this.field2513 = var7.field4673;
        this.field2517 = var7.field4687;
        this.field2516 = var7.field4677;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field4814 && var11 >= 0 && var11 < super.field4817) {
                        this.method1157(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1034(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field2509 == null) {
            this.field2509 = new class366[super.field4814][super.field4817];
            this.field2507 = new class706[super.field4814][super.field4817];
        } else if (this.field2520 != null || this.field2511 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field4818 != var20 || var21 != 0 && super.field4818 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class706 var22 = new class706();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field9843 = var23;
            var22.field9844 = new short[var23];
            var22.field9832 = new short[var23];
            var22.field9840 = new short[var23];
            var22.field9834 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field9844[var25] = (short) (this.field2499[arg0][arg1] - this.field2519[arg0][arg1]);
                } else if (var32 == 0 && super.field4818 == var33) {
                    var22.field9844[var25] = (short) (this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]);
                } else if (super.field4818 == var32 && super.field4818 == var33) {
                    var22.field9844[var25] = (short) (this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]);
                } else if (super.field4818 == var32 && var33 == 0) {
                    var22.field9844[var25] = (short) (this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]) * var32 + (this.field2499[arg0][arg1] - this.field2519[arg0][arg1]) * (super.field4818 - var32);
                    int var35 = (this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]) * var32 + (this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]) * (super.field4818 - var32);
                    var22.field9844[var25] = (short) ((super.field4818 - var33) * var34 + var33 * var35 >> super.field4822 * 2);
                }
                int var36 = (arg0 << super.field4822) + var32;
                int var37 = (arg1 << super.field4822) + var33;
                var22.field9832[var25] = (short) var32;
                var22.field9834[var25] = (short) var33;
                var22.field9840[var25] = (short) (this.method2172(var36, -1, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field9844[var25] < 2) {
                    var22.field9844[var25] = 2;
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
                    class239 var31 = this.field2504.field7623.method521(var30, 115);
                    if (!var31.field3562) {
                        var26 = true;
                        if (this.method1154(var31.field3561) || var31.field3579 != 0 || var31.field3573 != 0) {
                            var22.field9838 = (byte) (var22.field9838 | 4);
                        }
                    }
                }
            }
            var22.field9837 = new int[var27];
            if (arg10 != null) {
                var22.field9836 = new int[var27];
            }
            var22.field9839 = new short[var27];
            var22.field9833 = new short[var27];
            var22.field9835 = new short[var27];
            if (var26) {
                var22.field9842 = new short[var27];
                var22.field9845 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field9837[var22.field9841] = class454.method2781(10295, arg9[var29]);
                    } else {
                        var22.field9837[var22.field9841] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field9836[var22.field9841] = class454.method2781(10295, arg10[var29]);
                        } else {
                            var22.field9836[var22.field9841] = -1;
                        }
                    }
                    var22.field9839[var22.field9841] = (short) arg6[var29];
                    var22.field9833[var22.field9841] = (short) arg7[var29];
                    var22.field9835[var22.field9841] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field2504.field7623.method521(arg11[var29], 125).field3562) {
                            var22.field9842[var22.field9841] = (short) arg11[var29];
                            var22.field9845[var22.field9841] = (short) arg12[var29];
                        } else {
                            var22.field9842[var22.field9841] = -1;
                        }
                    }
                    ++var22.field9841;
                }
            }
            this.field2507[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class366 var38 = new class366();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field5192 = class587.method3392(this.field2499[arg0][arg1] - this.field2519[arg0][arg1], class454.method2781(10295, arg10[0]), 80);
                    if (var39 == -1) {
                        var38.field5196 = (byte) (var38.field5196 | 2);
                    }
                }
                if (super.field4821[arg0 + 1][arg1] == super.field4821[arg0][arg1] && super.field4821[arg0 + 1][arg1 + 1] == super.field4821[arg0][arg1] && super.field4821[arg0][arg1 + 1] == super.field4821[arg0][arg1]) {
                    var38.field5196 = (byte) (var38.field5196 | 1);
                }
                class239 var41 = null;
                if (var40 != -1) {
                    var41 = this.field2504.field7623.method521(var40, 108);
                }
                if (var41 != null && (var38.field5196 & 2) == 0 && !var41.field3562) {
                    var38.field5195 = (short) (this.field2499[arg0][arg1] - this.field2519[arg0][arg1]);
                    var38.field5197 = (short) (this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]);
                    var38.field5191 = (short) (this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]);
                    var38.field5193 = (short) (this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]);
                    var38.field5194 = (short) var40;
                    if (this.method1154(var41.field3561) || var41.field3579 != 0 || var41.field3573 != 0) {
                        var38.field5196 = (byte) (var38.field5196 | 4);
                    }
                } else {
                    short var42 = class454.method2781(10295, var39);
                    var38.field5195 = (short) class587.method3392(this.field2499[arg0][arg1] - this.field2519[arg0][arg1], var42, 123);
                    var38.field5197 = (short) class587.method3392(this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1], var42, 77);
                    var38.field5191 = (short) class587.method3392(this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1], var42, 123);
                    var38.field5193 = (short) class587.method3392(this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1], var42, 80);
                    var38.field5194 = -1;
                }
                this.field2509[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)Z")
    private final boolean method1154(int arg0) {
        if ((this.field2508 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ei", name = "fa", descriptor = "(IILr;)Lr;")
    public final class709 method1032(int arg0, int arg1, class709 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)I")
    private static final int method1155(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIZLrd;Lsd;[I[I[I[II)V")
    private final void method1156(int arg0, int arg1, boolean arg2, class552 arg3, class59 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class637 var11 = this.field2520[arg0][arg1];
        if (var11 != null) {
            if ((var11.field8554 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field8554 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field4818 * arg0;
                int var13 = super.field4818 + var12;
                int var14 = super.field4818 * arg1;
                int var15 = super.field4818 + var14;
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
                if ((var11.field8554 & 1) != 0 && !arg2) {
                    int var20 = super.field4821[arg0][arg1];
                    float var21 = (float) var20 * this.field2513;
                    if (this.field2510 == -1) {
                        var22 = (float) var14 * this.field2517 + (float) var12 * this.field2512 + var21 + this.field2516;
                        if (var22 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var23 = (float) var14 * this.field2517 + (float) var13 * this.field2512 + var21 + this.field2516;
                        if (var23 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var24 = (float) var15 * this.field2517 + (float) var13 * this.field2512 + var21 + this.field2516;
                        if (var24 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var25 = (float) var15 * this.field2517 + (float) var12 * this.field2512 + var21 + this.field2516;
                        if (var25 <= (float) this.field2504.field4000) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field2517 + (float) var12 * this.field2512 + var21 + this.field2516;
                        var23 = (float) var14 * this.field2517 + (float) var13 * this.field2512 + var21 + this.field2516;
                        var24 = (float) var15 * this.field2517 + (float) var13 * this.field2512 + var21 + this.field2516;
                        var25 = (float) var15 * this.field2517 + (float) var12 * this.field2512 + var21 + this.field2516;
                    }
                    if (arg3.field7668) {
                        int var26 = (int) (var22 - (float) arg3.field7670);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7670);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7670);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7670);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field2505;
                    float var31 = (float) var20 * this.field2506;
                    if (this.field2510 == -1) {
                        float var32 = (float) var14 * this.field2500 + (float) var12 * this.field2502 + var30 + this.field2515;
                        var33 = (int) ((float) this.field2504.field4009 * var32 / var22) + arg4.field838;
                        float var34 = (float) var14 * this.field2518 + (float) var12 * this.field2514 + var31 + this.field2503;
                        var35 = (int) ((float) this.field2504.field4018 * var34 / var22) + arg4.field842;
                        float var36 = (float) var14 * this.field2500 + (float) var13 * this.field2502 + var30 + this.field2515;
                        var37 = (int) ((float) this.field2504.field4009 * var36 / var23) + arg4.field838;
                        float var38 = (float) var14 * this.field2518 + (float) var13 * this.field2514 + var31 + this.field2503;
                        var39 = (int) ((float) this.field2504.field4018 * var38 / var23) + arg4.field842;
                        float var40 = (float) var15 * this.field2500 + (float) var13 * this.field2502 + var30 + this.field2515;
                        var41 = (int) ((float) this.field2504.field4009 * var40 / var24) + arg4.field838;
                        float var42 = (float) var15 * this.field2518 + (float) var13 * this.field2514 + var31 + this.field2503;
                        var43 = (int) ((float) this.field2504.field4018 * var42 / var24) + arg4.field842;
                        float var44 = (float) var15 * this.field2500 + (float) var12 * this.field2502 + var30 + this.field2515;
                        var45 = (int) ((float) this.field2504.field4009 * var44 / var25) + arg4.field838;
                        float var46 = (float) var15 * this.field2518 + (float) var12 * this.field2514 + var31 + this.field2503;
                        var47 = (int) ((float) this.field2504.field4018 * var46 / var25) + arg4.field842;
                    } else {
                        float var48 = (float) var14 * this.field2500 + (float) var12 * this.field2502 + var30 + this.field2515;
                        var33 = (int) ((float) this.field2504.field4009 * var48 / (float) this.field2510) + arg4.field838;
                        float var49 = (float) var14 * this.field2518 + (float) var12 * this.field2514 + var31 + this.field2503;
                        var35 = (int) ((float) this.field2504.field4018 * var49 / (float) this.field2510) + arg4.field842;
                        float var50 = (float) var14 * this.field2500 + (float) var13 * this.field2502 + var30 + this.field2515;
                        var37 = (int) ((float) this.field2504.field4009 * var50 / (float) this.field2510) + arg4.field838;
                        float var51 = (float) var14 * this.field2518 + (float) var13 * this.field2514 + var31 + this.field2503;
                        var39 = (int) ((float) this.field2504.field4018 * var51 / (float) this.field2510) + arg4.field842;
                        float var52 = (float) var15 * this.field2500 + (float) var13 * this.field2502 + var30 + this.field2515;
                        var41 = (int) ((float) this.field2504.field4009 * var52 / (float) this.field2510) + arg4.field838;
                        float var53 = (float) var15 * this.field2518 + (float) var13 * this.field2514 + var31 + this.field2503;
                        var43 = (int) ((float) this.field2504.field4018 * var53 / (float) this.field2510) + arg4.field842;
                        float var54 = (float) var15 * this.field2500 + (float) var12 * this.field2502 + var30 + this.field2515;
                        var45 = (int) ((float) this.field2504.field4009 * var54 / (float) this.field2510) + arg4.field838;
                        float var55 = (float) var15 * this.field2518 + (float) var12 * this.field2514 + var31 + this.field2503;
                        var47 = (int) ((float) this.field2504.field4018 * var55 / (float) this.field2510) + arg4.field842;
                    }
                } else {
                    int var56 = super.field4821[arg0][arg1];
                    int var57 = super.field4821[arg0 + 1][arg1];
                    int var58 = super.field4821[arg0 + 1][arg1 + 1];
                    int var59 = super.field4821[arg0][arg1 + 1];
                    if (this.field2510 == -1) {
                        var22 = (float) var14 * this.field2517 + (float) var12 * this.field2512 + (float) var56 * this.field2513 + this.field2516;
                        if (var22 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var23 = (float) var14 * this.field2517 + (float) var13 * this.field2512 + (float) var57 * this.field2513 + this.field2516;
                        if (var23 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var24 = (float) var15 * this.field2517 + (float) var13 * this.field2512 + (float) var58 * this.field2513 + this.field2516;
                        if (var24 <= (float) this.field2504.field4000) {
                            return;
                        }
                        var25 = (float) var15 * this.field2517 + (float) var12 * this.field2512 + (float) var59 * this.field2513 + this.field2516;
                        if (var25 <= (float) this.field2504.field4000) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field2517 + (float) var12 * this.field2512 + (float) var56 * this.field2513 + this.field2516;
                        var23 = (float) var14 * this.field2517 + (float) var13 * this.field2512 + (float) var57 * this.field2513 + this.field2516;
                        var24 = (float) var15 * this.field2517 + (float) var13 * this.field2512 + (float) var58 * this.field2513 + this.field2516;
                        var25 = (float) var15 * this.field2517 + (float) var12 * this.field2512 + (float) var59 * this.field2513 + this.field2516;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7670);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field8553 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7670);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field8555 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7670);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field8552 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7670);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field8562 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7668) {
                        int var68 = (int) (var22 - (float) arg3.field7670);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7670);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7670);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7670);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field2510 == -1) {
                        float var72 = (float) var14 * this.field2500 + (float) var12 * this.field2502 + (float) var56 * this.field2505 + this.field2515;
                        var33 = (int) ((float) this.field2504.field4009 * var72 / var22) + arg4.field838;
                        float var73 = (float) var14 * this.field2518 + (float) var12 * this.field2514 + (float) var56 * this.field2506 + this.field2503;
                        var35 = (int) ((float) this.field2504.field4018 * var73 / var22) + arg4.field842;
                        float var74 = (float) var14 * this.field2500 + (float) var13 * this.field2502 + (float) var57 * this.field2505 + this.field2515;
                        var37 = (int) ((float) this.field2504.field4009 * var74 / var23) + arg4.field838;
                        float var75 = (float) var14 * this.field2518 + (float) var13 * this.field2514 + (float) var57 * this.field2506 + this.field2503;
                        var39 = (int) ((float) this.field2504.field4018 * var75 / var23) + arg4.field842;
                        float var76 = (float) var15 * this.field2500 + (float) var13 * this.field2502 + (float) var58 * this.field2505 + this.field2515;
                        var41 = (int) ((float) this.field2504.field4009 * var76 / var24) + arg4.field838;
                        float var77 = (float) var15 * this.field2518 + (float) var13 * this.field2514 + (float) var58 * this.field2506 + this.field2503;
                        var43 = (int) ((float) this.field2504.field4018 * var77 / var24) + arg4.field842;
                        float var78 = (float) var15 * this.field2500 + (float) var12 * this.field2502 + (float) var59 * this.field2505 + this.field2515;
                        var45 = (int) ((float) this.field2504.field4009 * var78 / var25) + arg4.field838;
                        float var79 = (float) var15 * this.field2518 + (float) var12 * this.field2514 + (float) var59 * this.field2506 + this.field2503;
                        var47 = (int) ((float) this.field2504.field4018 * var79 / var25) + arg4.field842;
                    } else {
                        float var80 = (float) var14 * this.field2500 + (float) var12 * this.field2502 + (float) var56 * this.field2505 + this.field2515;
                        var33 = (int) ((float) this.field2504.field4009 * var80 / (float) this.field2510) + arg4.field838;
                        float var81 = (float) var14 * this.field2518 + (float) var12 * this.field2514 + (float) var56 * this.field2506 + this.field2503;
                        var35 = (int) ((float) this.field2504.field4018 * var81 / (float) this.field2510) + arg4.field842;
                        float var82 = (float) var14 * this.field2500 + (float) var13 * this.field2502 + (float) var57 * this.field2505 + this.field2515;
                        var37 = (int) ((float) this.field2504.field4009 * var82 / (float) this.field2510) + arg4.field838;
                        float var83 = (float) var14 * this.field2518 + (float) var13 * this.field2514 + (float) var57 * this.field2506 + this.field2503;
                        var39 = (int) ((float) this.field2504.field4018 * var83 / (float) this.field2510) + arg4.field842;
                        float var84 = (float) var15 * this.field2500 + (float) var13 * this.field2502 + (float) var58 * this.field2505 + this.field2515;
                        var41 = (int) ((float) this.field2504.field4009 * var84 / (float) this.field2510) + arg4.field838;
                        float var85 = (float) var15 * this.field2518 + (float) var13 * this.field2514 + (float) var58 * this.field2506 + this.field2503;
                        var43 = (int) ((float) this.field2504.field4018 * var85 / (float) this.field2510) + arg4.field842;
                        float var86 = (float) var15 * this.field2500 + (float) var12 * this.field2502 + (float) var59 * this.field2505 + this.field2515;
                        var45 = (int) ((float) this.field2504.field4009 * var86 / (float) this.field2510) + arg4.field838;
                        float var87 = (float) var15 * this.field2518 + (float) var12 * this.field2514 + (float) var59 * this.field2506 + this.field2503;
                        var47 = (int) ((float) this.field2504.field4018 * var87 / (float) this.field2510) + arg4.field842;
                    }
                }
                boolean var88 = var11.field8559 != -1 && this.method1154(this.field2504.field7623.method521(var11.field8559, 111).field3561);
                if (this.field2510 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field831 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field845 || var45 > arg4.field845 || var37 > arg4.field845;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field8559 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method428((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field8561 & 16777215, var90 | var11.field8556 & 16777215, var90 | var11.field8557 & 16777215, arg3.field7663, var18, var19, var17, var11.field8559);
                                } else {
                                    if (var88) {
                                        arg4.field832 = 100;
                                    }
                                    arg4.method418((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class380.method2385((byte) -56, var18 << 24 | arg3.field7663, var11.field8561), class380.method2385((byte) -56, var19 << 24 | arg3.field7663, var11.field8556), class380.method2385((byte) -56, var17 << 24 | arg3.field7663, var11.field8557));
                                    arg4.field832 = 0;
                                }
                            } else if (var11.field8559 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method428((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field8561 & 16777215, var91 | var11.field8556 & 16777215, var91 | var11.field8557 & 16777215, 0, 0, 0, 0, var11.field8559);
                            } else {
                                if (var88) {
                                    arg4.field832 = 100;
                                }
                                arg4.method418((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field8561, var11.field8556, var11.field8557);
                                arg4.field832 = 0;
                            }
                        } else {
                            arg4.method419((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7663);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field831 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field845 || var37 > arg4.field845 || var45 > arg4.field845;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field832 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field8559 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method428((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field8558 & 16777215, var93 | var11.field8557 & 16777215, var93 | var11.field8556 & 16777215, arg3.field7663, var16, var17, var19, var11.field8559);
                                    return;
                                }
                                if (var88) {
                                    arg4.field832 = 100;
                                }
                                arg4.method418((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class380.method2385((byte) -56, var16 << 24 | arg3.field7663, var11.field8558), class380.method2385((byte) -56, var17 << 24 | arg3.field7663, var11.field8557), class380.method2385((byte) -56, var19 << 24 | arg3.field7663, var11.field8556));
                                arg4.field832 = 0;
                                return;
                            }
                            if (var11.field8559 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method428((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field8558 & 16777215, var94 | var11.field8557 & 16777215, var94 | var11.field8556 & 16777215, 0, 0, 0, 0, var11.field8559);
                                return;
                            }
                            if (var88) {
                                arg4.field832 = 100;
                            }
                            arg4.method418((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field8558, var11.field8557, var11.field8556);
                            arg4.field832 = 0;
                            return;
                        }
                        arg4.method419((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7663);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field831 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field845 || var45 > arg4.field845 || var37 > arg4.field845;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field832 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field8559 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method428((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field8561 & 16777215, var96 | var11.field8556 & 16777215, var96 | var11.field8557 & 16777215, arg3.field7663, var18, var19, var17, var11.field8559);
                                } else {
                                    if (var88) {
                                        arg4.field832 = 100;
                                    }
                                    arg4.method418((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class380.method2385((byte) -56, var18 << 24 | arg3.field7663, var11.field8561), class380.method2385((byte) -56, var19 << 24 | arg3.field7663, var11.field8556), class380.method2385((byte) -56, var17 << 24 | arg3.field7663, var11.field8557));
                                    arg4.field832 = 0;
                                }
                            } else if (var11.field8559 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method428((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field8561 & 16777215, var97 | var11.field8556 & 16777215, var97 | var11.field8557 & 16777215, 0, 0, 0, 0, var11.field8559);
                            } else {
                                if (var88) {
                                    arg4.field832 = 100;
                                }
                                arg4.method418((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field8561, var11.field8556, var11.field8557);
                                arg4.field832 = 0;
                            }
                        } else {
                            arg4.method419((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7663);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field831 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field845 || var37 > arg4.field845 || var45 > arg4.field845;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field832 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field8559 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method428((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field8558 & 16777215, var99 | var11.field8557 & 16777215, var99 | var11.field8556 & 16777215, arg3.field7663, var16, var17, var19, var11.field8559);
                                    return;
                                }
                                if (var88) {
                                    arg4.field832 = 100;
                                }
                                arg4.method418((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class380.method2385((byte) -56, var16 << 24 | arg3.field7663, var11.field8558), class380.method2385((byte) -56, var17 << 24 | arg3.field7663, var11.field8557), class380.method2385((byte) -56, var19 << 24 | arg3.field7663, var11.field8556));
                                arg4.field832 = 0;
                                return;
                            }
                            if (var11.field8559 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method428((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field8558 & 16777215, var100 | var11.field8557 & 16777215, var100 | var11.field8556 & 16777215, 0, 0, 0, 0, var11.field8559);
                                return;
                            }
                            if (var88) {
                                arg4.field832 = 100;
                            }
                            arg4.method418((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field8558, var11.field8557, var11.field8556);
                            arg4.field832 = 0;
                            return;
                        }
                        arg4.method419((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7663);
                    }
                }
            }
        } else {
            class668 var101 = this.field2501[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field9231 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field2510 == -1) {
                    for (int var102 = 0; var102 < var101.field9229; ++var102) {
                        int var103 = (arg0 << super.field4822) + var101.field9222[var102];
                        int var104 = var101.field9226[var102];
                        int var105 = (arg1 << super.field4822) + var101.field9225[var102];
                        float var106 = (float) var105 * this.field2517 + (float) var103 * this.field2512 + (float) var104 * this.field2513 + this.field2516;
                        if (var106 <= (float) this.field2504.field4000) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7670);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field9230[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7668) {
                            int var109 = (int) (var106 - (float) arg3.field7670);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field2500 + (float) var103 * this.field2502 + (float) var104 * this.field2505 + this.field2515;
                        float var111 = (float) var105 * this.field2518 + (float) var103 * this.field2514 + (float) var104 * this.field2506 + this.field2503;
                        arg5[var102] = (int) ((float) this.field2504.field4009 * var110 / var106) + arg4.field838;
                        arg6[var102] = (int) ((float) this.field2504.field4018 * var111 / var106) + arg4.field842;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field9229; ++var112) {
                        int var152 = (arg0 << super.field4822) + var101.field9222[var112];
                        int var153 = var101.field9226[var112];
                        int var154 = (arg1 << super.field4822) + var101.field9225[var112];
                        float var155 = (float) var154 * this.field2517 + (float) var152 * this.field2512 + (float) var153 * this.field2513 + this.field2516;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field2510 - arg3.field7670;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field9230[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7668) {
                            int var158 = this.field2510 - arg3.field7670;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field2500 + (float) var152 * this.field2502 + (float) var153 * this.field2505 + this.field2515;
                        float var160 = (float) var154 * this.field2518 + (float) var152 * this.field2514 + (float) var153 * this.field2506 + this.field2503;
                        arg5[var112] = (int) ((float) this.field2504.field4009 * var159 / (float) this.field2510) + arg4.field838;
                        arg6[var112] = (int) ((float) this.field2504.field4018 * var160 / (float) this.field2510) + arg4.field842;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field9223 != null) {
                    if (this.field2510 == -1) {
                        for (int var113 = 0; var113 < var101.field9227; ++var113) {
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
                                arg4.field831 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field845 || var118 > arg4.field845 || var119 > arg4.field845;
                                short var124 = var101.field9223[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method1154(this.field2504.field7623.method521(var124, 112).field3561)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method428((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field9222[var114] / (float) super.field4818, (float) var101.field9222[var115] / (float) super.field4818, (float) var101.field9222[var116] / (float) super.field4818, (float) var101.field9225[var114] / (float) super.field4818, (float) var101.field9225[var115] / (float) super.field4818, (float) var101.field9225[var116] / (float) super.field4818, var125 | var101.field9224[var114] & 16777215, var125 | var101.field9224[var115] & 16777215, var125 | var101.field9224[var116] & 16777215, arg3.field7663, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field9224[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method1154(this.field2504.field7623.method521(var124, 107).field3561)) {
                                                arg4.field832 = -1694498816;
                                            }
                                            arg4.method418((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class380.method2385((byte) -56, arg8[var114] << 24 | arg3.field7663, var101.field9224[var114]), class380.method2385((byte) -56, arg8[var115] << 24 | arg3.field7663, var101.field9224[var115]), class380.method2385((byte) -56, arg8[var116] << 24 | arg3.field7663, var101.field9224[var116]));
                                            arg4.field832 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method1154(this.field2504.field7623.method521(var124, 117).field3561)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method428((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field9222[var114] / (float) super.field4818, (float) var101.field9222[var115] / (float) super.field4818, (float) var101.field9222[var116] / (float) super.field4818, (float) var101.field9225[var114] / (float) super.field4818, (float) var101.field9225[var115] / (float) super.field4818, (float) var101.field9225[var116] / (float) super.field4818, var126 | var101.field9224[var114] & 16777215, var126 | var101.field9224[var115] & 16777215, var126 | var101.field9224[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field9224[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method1154(this.field2504.field7623.method521(var124, 119).field3561)) {
                                            arg4.field832 = -1694498816;
                                        }
                                        arg4.method418((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field9224[var114], var101.field9224[var115], var101.field9224[var116]);
                                        arg4.field832 = 0;
                                    }
                                } else {
                                    arg4.method419((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7663);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field9227; ++var127) {
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
                            arg4.field831 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field845 || var132 > arg4.field845 || var133 > arg4.field845;
                            short var138 = var101.field9223[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method1154(this.field2504.field7623.method521(var138, 106).field3561)) {
                                    arg4.field832 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method1154(this.field2504.field7623.method521(var138, 121).field3561)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method428((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field9222[var128] / (float) super.field4818, (float) var101.field9222[var129] / (float) super.field4818, (float) var101.field9222[var130] / (float) super.field4818, (float) var101.field9225[var128] / (float) super.field4818, (float) var101.field9225[var129] / (float) super.field4818, (float) var101.field9225[var130] / (float) super.field4818, var139 | var101.field9224[var128] & 16777215, var139 | var101.field9224[var129] & 16777215, var139 | var101.field9224[var130] & 16777215, arg3.field7663, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field9224[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method1154(this.field2504.field7623.method521(var138, 118).field3561)) {
                                            arg4.field832 = -1694498816;
                                        }
                                        arg4.method418((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class380.method2385((byte) -56, arg8[var128] << 24 | arg3.field7663, var101.field9224[var128]), class380.method2385((byte) -56, arg8[var129] << 24 | arg3.field7663, var101.field9224[var129]), class380.method2385((byte) -56, arg8[var130] << 24 | arg3.field7663, var101.field9224[var130]));
                                        arg4.field832 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method1154(this.field2504.field7623.method521(var138, 124).field3561)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method428((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field9222[var128] / (float) super.field4818, (float) var101.field9222[var129] / (float) super.field4818, (float) var101.field9222[var130] / (float) super.field4818, (float) var101.field9225[var128] / (float) super.field4818, (float) var101.field9225[var129] / (float) super.field4818, (float) var101.field9225[var130] / (float) super.field4818, var140 | var101.field9224[var128] & 16777215, var140 | var101.field9224[var129] & 16777215, var140 | var101.field9224[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field9224[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method1154(this.field2504.field7623.method521(var138, 106).field3561)) {
                                        arg4.field832 = -1694498816;
                                    }
                                    arg4.method418((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field9224[var128], var101.field9224[var129], var101.field9224[var130]);
                                    arg4.field832 = 0;
                                }
                                arg4.field832 = 0;
                            } else {
                                arg4.method419((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7663);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field9227; ++var141) {
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
                        arg4.field831 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field845 || var146 > arg4.field845 || var147 > arg4.field845;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field9224[var142] & 16777215) != 0) {
                                    arg4.method418((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class428.method2648(arg8[var142], arg3.field7663, 1, var101.field9224[var142]), class428.method2648(arg8[var143], arg3.field7663, 1, var101.field9224[var143]), class428.method2648(arg8[var144], arg3.field7663, 1, var101.field9224[var144]));
                                }
                            } else if ((var101.field9224[var142] & 16777215) != 0) {
                                arg4.method418((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field9224[var142], var101.field9224[var143], var101.field9224[var144]);
                            }
                        } else {
                            arg4.method419((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7663);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1041(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)V")
    private final void method1157(int arg0, int arg1, int arg2) {
        class552 var4 = this.field2504.method1859(Thread.currentThread());
        var4.field7679.field832 = 0;
        if (this.field2520 != null) {
            this.method1156(arg0, arg1, var4.field7667, var4, var4.field7679, var4.field7687, var4.field7698, var4.field7699, var4.field7674, arg2);
        } else if (this.field2509 != null) {
            this.method1152(arg0, arg1, var4.field7679, var4.field7687, var4.field7698, var4.field7699, var4.field7674, arg2);
        } else {
            if (this.field2511 != null) {
                this.method1151(arg0, arg1, var4.field7667, var4, var4.field7679, var4.field7687, var4.field7698, var4.field7699, var4.field7674, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "ka", descriptor = "(III)V")
    public final void method1037(int arg0, int arg1, int arg2) {
        if (this.field2519[arg0][arg1] < arg2) {
            this.field2519[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    public final void method1026(int arg0, int arg1) {
        this.method1157(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1040(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field2508 & 32) == 0;
        if (this.field2520 == null && !var15) {
            this.field2520 = new class637[super.field4814][super.field4817];
            this.field2501 = new class668[super.field4814][super.field4817];
        } else if (this.field2511 == null && var15) {
            this.field2511 = new class271[super.field4814][super.field4817];
        } else if (this.field2509 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class320.field4444[class454.method2781(10295, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class320.field4444[class454.method2781(10295, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class271 var18 = new class271();
                var18.field3944 = (short) arg2.length;
                var18.field3937 = (short) (arg2.length / 3);
                var18.field3939 = new short[var18.field3944];
                var18.field3938 = new short[var18.field3944];
                var18.field3940 = new short[var18.field3944];
                var18.field3935 = new int[var18.field3944];
                var18.field3943 = new short[var18.field3944];
                var18.field3936 = new short[var18.field3944];
                var18.field3942 = new byte[var18.field3944];
                if (arg5 != null) {
                    var18.field3945 = new short[var18.field3944];
                }
                for (int var19 = 0; var19 < var18.field3944; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field2499[arg0][arg1] - this.field2519[arg0][arg1];
                    } else if (var22 == 0 && super.field4818 == var23) {
                        var25 = this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1];
                    } else if (super.field4818 == var22 && super.field4818 == var23) {
                        var25 = this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1];
                    } else if (super.field4818 == var22 && var23 == 0) {
                        var25 = this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]) * var22 + (this.field2499[arg0][arg1] - this.field2519[arg0][arg1]) * (super.field4818 - var22);
                        int var27 = (this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]) * var22 + (this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]) * (super.field4818 - var22);
                        var25 = (super.field4818 - var23) * var26 + var23 * var27 >> super.field4822 * 2;
                    }
                    int var28 = (arg0 << super.field4822) + var22;
                    int var29 = (arg1 << super.field4822) + var23;
                    var18.field3939[var19] = (short) var22;
                    var18.field3940[var19] = (short) var23;
                    var18.field3938[var19] = (short) (this.method2172(var28, -1, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field3935[var19] = 0;
                        if (arg7 != null) {
                            var18.field3942[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field3945[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method1154(this.field2504.field7623.method521(arg8[var19], 113).field3561)) {
                            var32 = -1694498816;
                        }
                        var18.field3935[var19] = var32 | class428.method2648(var30, arg10, 1, method1155(arg6[var19] >> 8, var25));
                        if (arg7 != null) {
                            var18.field3942[var19] = (byte) var25;
                        }
                    }
                    var18.field3943[var19] = (short) arg8[var19];
                    var18.field3936[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field3941 = new int[var18.field3937];
                }
                for (int var20 = 0; var20 < var18.field3937; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field3941[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field2511[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field4818 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field4818 && arg4[var38] == super.field4818) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field4818) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field4818 != arg2[var40] && arg2[0] - super.field4818 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field4818 != arg4[var40] && arg4[0] - super.field4818 != arg4[var40]) {
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
                    class637 var41 = new class637();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field8560 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field8554 = (byte) (var41.field8554 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field4821[arg0 + 1][arg1] == super.field4821[arg0][arg1] && super.field4821[arg0 + 1][arg1 + 1] == super.field4821[arg0][arg1] && super.field4821[arg0][arg1 + 1] == super.field4821[arg0][arg1]) {
                        var41.field8554 = (byte) (var41.field8554 | 1);
                    }
                    if (var43 != -1 && (var41.field8554 & 2) == 0 && !this.field2504.field7623.method521(var43, 112).field3562) {
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
                        var41.field8558 = class428.method2648(var44, arg10, 1, method1155(arg6[var34] >> 8, this.field2499[arg0][arg1] - this.field2519[arg0][arg1]));
                        if (var41.field8560 != 0) {
                            var41.field8558 |= 255 - (this.field2499[arg0][arg1] - this.field2519[arg0][arg1]) << 25;
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
                        var41.field8557 = class428.method2648(var45, arg10, 1, method1155(arg6[var35] >> 8, this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]));
                        if (var41.field8560 != 0) {
                            var41.field8557 |= 255 - (this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]) << 25;
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
                        var41.field8561 = class428.method2648(var46, arg10, 1, method1155(arg6[var36] >> 8, this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]));
                        if (var41.field8560 != 0) {
                            var41.field8561 |= 255 - (this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field8556 = class428.method2648(var47, arg10, 1, method1155(arg6[var37] >> 8, this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]));
                        var41.field8559 = (short) var43;
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
                        var41.field8558 = class428.method2648(var48, arg10, 1, method1155(arg6[var34] >> 8, this.field2499[arg0][arg1] - this.field2519[arg0][arg1]));
                        if (var41.field8560 != 0) {
                            var41.field8558 |= 255 - (this.field2499[arg0][arg1] - this.field2519[arg0][arg1]) << 25;
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
                        var41.field8557 = class428.method2648(var49, arg10, 1, method1155(arg6[var35] >> 8, this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]));
                        if (var41.field8560 != 0) {
                            var41.field8557 |= 255 - (this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]) << 25;
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
                        var41.field8561 = class428.method2648(var50, arg10, 1, method1155(arg6[var36] >> 8, this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]));
                        if (var41.field8560 != 0) {
                            var41.field8561 |= 255 - (this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field8556 = class428.method2648(var51, arg10, 1, method1155(arg6[var37] >> 8, this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]));
                        if (var41.field8560 != 0) {
                            var41.field8556 |= 255 - (this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]) << 25;
                        }
                        var41.field8559 = -1;
                    }
                    if (arg5 != null) {
                        var41.field8552 = (short) arg5[var36];
                        var41.field8562 = (short) arg5[var37];
                        var41.field8555 = (short) arg5[var35];
                        var41.field8553 = (short) arg5[var34];
                    }
                    this.field2520[arg0][arg1] = var41;
                } else {
                    class668 var52 = new class668();
                    var52.field9229 = (short) arg2.length;
                    var52.field9227 = (short) (arg2.length / 3);
                    var52.field9222 = new short[var52.field9229];
                    var52.field9226 = new short[var52.field9229];
                    var52.field9225 = new short[var52.field9229];
                    var52.field9224 = new int[var52.field9229];
                    if (arg5 != null) {
                        var52.field9230 = new short[var52.field9229];
                    }
                    for (int var53 = 0; var53 < var52.field9229; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field2499[arg0][arg1] - this.field2519[arg0][arg1];
                        } else if (var68 == 0 && super.field4818 == var69) {
                            var71 = this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1];
                        } else if (super.field4818 == var68 && super.field4818 == var69) {
                            var71 = this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1];
                        } else if (super.field4818 == var68 && var69 == 0) {
                            var71 = this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field2499[arg0 + 1][arg1] - this.field2519[arg0 + 1][arg1]) * var68 + (this.field2499[arg0][arg1] - this.field2519[arg0][arg1]) * (super.field4818 - var68);
                            int var73 = (this.field2499[arg0 + 1][arg1 + 1] - this.field2519[arg0 + 1][arg1 + 1]) * var68 + (this.field2499[arg0][arg1 + 1] - this.field2519[arg0][arg1 + 1]) * (super.field4818 - var68);
                            var71 = (super.field4818 - var69) * var72 + var69 * var73 >> super.field4822 * 2;
                        }
                        int var74 = (arg0 << super.field4822) + var68;
                        int var75 = (arg1 << super.field4822) + var69;
                        var52.field9222[var53] = (short) var68;
                        var52.field9225[var53] = (short) var69;
                        var52.field9226[var53] = (short) (this.method2172(var74, -1, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field9224[var53] = var71 << 25;
                            } else {
                                var52.field9224[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field9230[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field9224[var53] = class428.method2648(var76, arg10, 1, method1155(arg6[var53] >> 8, var71));
                            if (arg7 != null) {
                                var52.field9224[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field9227; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field2504.field7623.method521(arg8[var55 * 3], 121).field3562) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field9228 = new int[var52.field9227];
                    }
                    if (var54) {
                        var52.field9223 = new short[var52.field9227];
                        var52.field9221 = new short[var52.field9227];
                    }
                    for (int var56 = 0; var56 < var52.field9227; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field9228[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field2504.field7623.method521(var62, 113).field3562) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field2504.field7623.method521(var63, 114).field3562) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field2504.field7623.method521(var64, 127).field3562) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field9223[var56] = (short) var64;
                                var52.field9221[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field2504.field7623.method521(var65, 120).field3562) {
                                        var52.field9224[var57] = class320.field4444[class454.method2781(10295, this.field2504.field7623.method521(var65, 114).field3566 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field2504.field7623.method521(var66, 112).field3562) {
                                        var52.field9224[var58] = class320.field4444[class454.method2781(10295, this.field2504.field7623.method521(var66, 114).field3566 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field2504.field7623.method521(var67, 107).field3562) {
                                        var52.field9224[var59] = class320.field4444[class454.method2781(10295, this.field2504.field7623.method521(var67, 110).field3566 & 65535) & 65535];
                                    }
                                }
                                var52.field9223[var56] = -1;
                            }
                        }
                    }
                    this.field2501[arg0][arg1] = var52;
                }
            }
        }
    }
}
