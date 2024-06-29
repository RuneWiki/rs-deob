import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class321 extends class278 {

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
    private int field4094 = -1;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "Llr;")
    private class749 field4091;

    @OriginalMember(owner = "client!nha", name = "C", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!nha", name = "u", descriptor = "[[B")
    private byte[][] field4097;

    @OriginalMember(owner = "client!nha", name = "D", descriptor = "[[B")
    private byte[][] field4106;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "F")
    private float field4089;

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "F")
    private float field4090;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "F")
    private float field4092;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "F")
    private float field4093;

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "F")
    private float field4095;

    @OriginalMember(owner = "client!nha", name = "t", descriptor = "F")
    private float field4096;

    @OriginalMember(owner = "client!nha", name = "v", descriptor = "F")
    private float field4098;

    @OriginalMember(owner = "client!nha", name = "x", descriptor = "F")
    private float field4100;

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "F")
    private float field4102;

    @OriginalMember(owner = "client!nha", name = "B", descriptor = "F")
    private float field4104;

    @OriginalMember(owner = "client!nha", name = "F", descriptor = "F")
    private float field4108;

    @OriginalMember(owner = "client!nha", name = "H", descriptor = "F")
    private float field4110;

    @OriginalMember(owner = "client!nha", name = "y", descriptor = "[[Luu;")
    private class285[][] field4101;

    @OriginalMember(owner = "client!nha", name = "A", descriptor = "[[Lpa;")
    private class369[][] field4103;

    @OriginalMember(owner = "client!nha", name = "w", descriptor = "[[Lfk;")
    private class651[][] field4099;

    @OriginalMember(owner = "client!nha", name = "G", descriptor = "[[Ljha;")
    private class693[][] field4109;

    @OriginalMember(owner = "client!nha", name = "E", descriptor = "[[Lsfa;")
    private class694[][] field4107;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIZLij;Lgba;[I[I[I[II)V", line = 7)
    private final void method1916(int arg0, int arg1, boolean arg2, class421 arg3, class665 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class693 var11 = this.field4109[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field4094 == -1) {
                    for (int var12 = 0; var12 < var11.field9770; ++var12) {
                        int var13 = (arg0 << super.field3409) + var11.field9768[var12];
                        int var14 = var11.field9765[var12];
                        int var15 = (arg1 << super.field3409) + var11.field9763[var12];
                        float var16 = (float) var15 * this.field4092 + (float) var13 * this.field4104 + (float) var14 * this.field4102 + this.field4100;
                        if (var16 <= (float) this.field4091.field10473) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field6106);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field9772[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field6099) {
                            int var19 = (int) (var16 - (float) arg3.field6106);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field4093 + (float) var13 * this.field4090 + (float) var14 * this.field4096 + this.field4108;
                        float var21 = (float) var15 * this.field4095 + (float) var13 * this.field4089 + (float) var14 * this.field4098 + this.field4110;
                        arg5[var12] = (int) ((float) this.field4091.field10471 * var20 / var16) + arg4.field9452;
                        arg6[var12] = (int) ((float) this.field4091.field10462 * var21 / var16) + arg4.field9465;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field9770; ++var22) {
                        int var36 = (arg0 << super.field3409) + var11.field9768[var22];
                        int var37 = var11.field9765[var22];
                        int var38 = (arg1 << super.field3409) + var11.field9763[var22];
                        float var39 = (float) var38 * this.field4092 + (float) var36 * this.field4104 + (float) var37 * this.field4102 + this.field4100;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field4094 - arg3.field6106;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field9772[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field6099) {
                            int var42 = this.field4094 - arg3.field6106;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field4093 + (float) var36 * this.field4090 + (float) var37 * this.field4096 + this.field4108;
                        float var44 = (float) var38 * this.field4095 + (float) var36 * this.field4089 + (float) var37 * this.field4098 + this.field4110;
                        arg5[var22] = (int) ((float) this.field4091.field10471 * var43 / (float) this.field4094) + arg4.field9452;
                        arg6[var22] = (int) ((float) this.field4091.field10462 * var44 / (float) this.field4094) + arg4.field9465;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3413;
                for (int var24 = 0; var24 < var11.field9771; ++var24) {
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
                        arg4.field9458 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field9453 || var29 > arg4.field9453 || var30 > arg4.field9453;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3409;
                            int var35 = arg1 << super.field3409;
                            if ((var11.field9764[var25] & 16777215) != 0) {
                                if (var11.field9766[var25] == var11.field9766[var26] && var11.field9766[var25] == var11.field9766[var27] && var11.field9773[var25] == var11.field9773[var26] && var11.field9773[var25] == var11.field9773[var27]) {
                                    arg4.method3781((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9768[var25] + var34) / (float) var11.field9773[var25], (float) (var11.field9768[var26] + var34) / (float) var11.field9773[var26], (float) (var11.field9768[var27] + var34) / (float) var11.field9773[var27], (float) (var11.field9763[var25] + var35) / (float) var11.field9773[var25], (float) (var11.field9763[var26] + var35) / (float) var11.field9773[var26], (float) (var11.field9763[var27] + var35) / (float) var11.field9773[var27], var11.field9764[var25], var11.field9764[var26], var11.field9764[var27], arg3.field6105, arg8[var25], arg8[var26], arg8[var27], var11.field9766[var25]);
                                } else {
                                    arg4.method3778((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9768[var25] + var34) / var23, (float) (var11.field9768[var26] + var34) / var23, (float) (var11.field9768[var27] + var34) / var23, (float) (var11.field9763[var25] + var35) / var23, (float) (var11.field9763[var26] + var35) / var23, (float) (var11.field9763[var27] + var35) / var23, var11.field9764[var25], var11.field9764[var26], var11.field9764[var27], arg3.field6105, arg8[var25], arg8[var26], arg8[var27], var11.field9766[var25], var23 / (float) var11.field9773[var25], var11.field9766[var26], var23 / (float) var11.field9773[var26], var11.field9766[var27], var23 / (float) var11.field9773[var27]);
                                }
                            }
                        } else {
                            arg4.method3777((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field6105);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "ka", descriptor = "(III)V", line = 202)
    public final void method1666(int arg0, int arg1, int arg2) {
        if (this.field4106[arg0][arg1] < arg2) {
            this.field4106[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(II)I", line = 208)
    private static final int method1917(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lada;[I)V", line = 237)
    public final void method1668(class163 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!nha", name = "fa", descriptor = "(IILr;)Lr;", line = 240)
    public final class182 method1678(int arg0, int arg1, class182 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(IIZLij;Lgba;[I[I[I[II)V", line = 248)
    private final void method1918(int arg0, int arg1, boolean arg2, class421 arg3, class665 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class694 var11 = this.field4107[arg0][arg1];
        if (var11 != null) {
            if ((var11.field9774 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field9774 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3413 * arg0;
                int var13 = super.field3413 + var12;
                int var14 = super.field3413 * arg1;
                int var15 = super.field3413 + var14;
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
                if ((var11.field9774 & 1) != 0 && !arg2) {
                    int var20 = super.field3415[arg0][arg1];
                    float var21 = (float) var20 * this.field4102;
                    if (this.field4094 == -1) {
                        var22 = (float) var14 * this.field4092 + (float) var12 * this.field4104 + var21 + this.field4100;
                        if (var22 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var23 = (float) var14 * this.field4092 + (float) var13 * this.field4104 + var21 + this.field4100;
                        if (var23 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var24 = (float) var15 * this.field4092 + (float) var13 * this.field4104 + var21 + this.field4100;
                        if (var24 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var25 = (float) var15 * this.field4092 + (float) var12 * this.field4104 + var21 + this.field4100;
                        if (var25 <= (float) this.field4091.field10473) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field4092 + (float) var12 * this.field4104 + var21 + this.field4100;
                        var23 = (float) var14 * this.field4092 + (float) var13 * this.field4104 + var21 + this.field4100;
                        var24 = (float) var15 * this.field4092 + (float) var13 * this.field4104 + var21 + this.field4100;
                        var25 = (float) var15 * this.field4092 + (float) var12 * this.field4104 + var21 + this.field4100;
                    }
                    if (arg3.field6099) {
                        int var26 = (int) (var22 - (float) arg3.field6106);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field6106);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field6106);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field6106);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field4096;
                    float var31 = (float) var20 * this.field4098;
                    if (this.field4094 == -1) {
                        float var32 = (float) var14 * this.field4093 + (float) var12 * this.field4090 + var30 + this.field4108;
                        var33 = (int) ((float) this.field4091.field10471 * var32 / var22) + arg4.field9452;
                        float var34 = (float) var14 * this.field4095 + (float) var12 * this.field4089 + var31 + this.field4110;
                        var35 = (int) ((float) this.field4091.field10462 * var34 / var22) + arg4.field9465;
                        float var36 = (float) var14 * this.field4093 + (float) var13 * this.field4090 + var30 + this.field4108;
                        var37 = (int) ((float) this.field4091.field10471 * var36 / var23) + arg4.field9452;
                        float var38 = (float) var14 * this.field4095 + (float) var13 * this.field4089 + var31 + this.field4110;
                        var39 = (int) ((float) this.field4091.field10462 * var38 / var23) + arg4.field9465;
                        float var40 = (float) var15 * this.field4093 + (float) var13 * this.field4090 + var30 + this.field4108;
                        var41 = (int) ((float) this.field4091.field10471 * var40 / var24) + arg4.field9452;
                        float var42 = (float) var15 * this.field4095 + (float) var13 * this.field4089 + var31 + this.field4110;
                        var43 = (int) ((float) this.field4091.field10462 * var42 / var24) + arg4.field9465;
                        float var44 = (float) var15 * this.field4093 + (float) var12 * this.field4090 + var30 + this.field4108;
                        var45 = (int) ((float) this.field4091.field10471 * var44 / var25) + arg4.field9452;
                        float var46 = (float) var15 * this.field4095 + (float) var12 * this.field4089 + var31 + this.field4110;
                        var47 = (int) ((float) this.field4091.field10462 * var46 / var25) + arg4.field9465;
                    } else {
                        float var48 = (float) var14 * this.field4093 + (float) var12 * this.field4090 + var30 + this.field4108;
                        var33 = (int) ((float) this.field4091.field10471 * var48 / (float) this.field4094) + arg4.field9452;
                        float var49 = (float) var14 * this.field4095 + (float) var12 * this.field4089 + var31 + this.field4110;
                        var35 = (int) ((float) this.field4091.field10462 * var49 / (float) this.field4094) + arg4.field9465;
                        float var50 = (float) var14 * this.field4093 + (float) var13 * this.field4090 + var30 + this.field4108;
                        var37 = (int) ((float) this.field4091.field10471 * var50 / (float) this.field4094) + arg4.field9452;
                        float var51 = (float) var14 * this.field4095 + (float) var13 * this.field4089 + var31 + this.field4110;
                        var39 = (int) ((float) this.field4091.field10462 * var51 / (float) this.field4094) + arg4.field9465;
                        float var52 = (float) var15 * this.field4093 + (float) var13 * this.field4090 + var30 + this.field4108;
                        var41 = (int) ((float) this.field4091.field10471 * var52 / (float) this.field4094) + arg4.field9452;
                        float var53 = (float) var15 * this.field4095 + (float) var13 * this.field4089 + var31 + this.field4110;
                        var43 = (int) ((float) this.field4091.field10462 * var53 / (float) this.field4094) + arg4.field9465;
                        float var54 = (float) var15 * this.field4093 + (float) var12 * this.field4090 + var30 + this.field4108;
                        var45 = (int) ((float) this.field4091.field10471 * var54 / (float) this.field4094) + arg4.field9452;
                        float var55 = (float) var15 * this.field4095 + (float) var12 * this.field4089 + var31 + this.field4110;
                        var47 = (int) ((float) this.field4091.field10462 * var55 / (float) this.field4094) + arg4.field9465;
                    }
                } else {
                    int var56 = super.field3415[arg0][arg1];
                    int var57 = super.field3415[arg0 + 1][arg1];
                    int var58 = super.field3415[arg0 + 1][arg1 + 1];
                    int var59 = super.field3415[arg0][arg1 + 1];
                    if (this.field4094 == -1) {
                        var22 = (float) var14 * this.field4092 + (float) var12 * this.field4104 + (float) var56 * this.field4102 + this.field4100;
                        if (var22 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var23 = (float) var14 * this.field4092 + (float) var13 * this.field4104 + (float) var57 * this.field4102 + this.field4100;
                        if (var23 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var24 = (float) var15 * this.field4092 + (float) var13 * this.field4104 + (float) var58 * this.field4102 + this.field4100;
                        if (var24 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var25 = (float) var15 * this.field4092 + (float) var12 * this.field4104 + (float) var59 * this.field4102 + this.field4100;
                        if (var25 <= (float) this.field4091.field10473) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field4092 + (float) var12 * this.field4104 + (float) var56 * this.field4102 + this.field4100;
                        var23 = (float) var14 * this.field4092 + (float) var13 * this.field4104 + (float) var57 * this.field4102 + this.field4100;
                        var24 = (float) var15 * this.field4092 + (float) var13 * this.field4104 + (float) var58 * this.field4102 + this.field4100;
                        var25 = (float) var15 * this.field4092 + (float) var12 * this.field4104 + (float) var59 * this.field4102 + this.field4100;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field6106);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field9782 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field6106);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field9778 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field6106);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field9780 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field6106);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field9783 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field6099) {
                        int var68 = (int) (var22 - (float) arg3.field6106);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field6106);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field6106);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field6106);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field4094 == -1) {
                        float var72 = (float) var14 * this.field4093 + (float) var12 * this.field4090 + (float) var56 * this.field4096 + this.field4108;
                        var33 = (int) ((float) this.field4091.field10471 * var72 / var22) + arg4.field9452;
                        float var73 = (float) var14 * this.field4095 + (float) var12 * this.field4089 + (float) var56 * this.field4098 + this.field4110;
                        var35 = (int) ((float) this.field4091.field10462 * var73 / var22) + arg4.field9465;
                        float var74 = (float) var14 * this.field4093 + (float) var13 * this.field4090 + (float) var57 * this.field4096 + this.field4108;
                        var37 = (int) ((float) this.field4091.field10471 * var74 / var23) + arg4.field9452;
                        float var75 = (float) var14 * this.field4095 + (float) var13 * this.field4089 + (float) var57 * this.field4098 + this.field4110;
                        var39 = (int) ((float) this.field4091.field10462 * var75 / var23) + arg4.field9465;
                        float var76 = (float) var15 * this.field4093 + (float) var13 * this.field4090 + (float) var58 * this.field4096 + this.field4108;
                        var41 = (int) ((float) this.field4091.field10471 * var76 / var24) + arg4.field9452;
                        float var77 = (float) var15 * this.field4095 + (float) var13 * this.field4089 + (float) var58 * this.field4098 + this.field4110;
                        var43 = (int) ((float) this.field4091.field10462 * var77 / var24) + arg4.field9465;
                        float var78 = (float) var15 * this.field4093 + (float) var12 * this.field4090 + (float) var59 * this.field4096 + this.field4108;
                        var45 = (int) ((float) this.field4091.field10471 * var78 / var25) + arg4.field9452;
                        float var79 = (float) var15 * this.field4095 + (float) var12 * this.field4089 + (float) var59 * this.field4098 + this.field4110;
                        var47 = (int) ((float) this.field4091.field10462 * var79 / var25) + arg4.field9465;
                    } else {
                        float var80 = (float) var14 * this.field4093 + (float) var12 * this.field4090 + (float) var56 * this.field4096 + this.field4108;
                        var33 = (int) ((float) this.field4091.field10471 * var80 / (float) this.field4094) + arg4.field9452;
                        float var81 = (float) var14 * this.field4095 + (float) var12 * this.field4089 + (float) var56 * this.field4098 + this.field4110;
                        var35 = (int) ((float) this.field4091.field10462 * var81 / (float) this.field4094) + arg4.field9465;
                        float var82 = (float) var14 * this.field4093 + (float) var13 * this.field4090 + (float) var57 * this.field4096 + this.field4108;
                        var37 = (int) ((float) this.field4091.field10471 * var82 / (float) this.field4094) + arg4.field9452;
                        float var83 = (float) var14 * this.field4095 + (float) var13 * this.field4089 + (float) var57 * this.field4098 + this.field4110;
                        var39 = (int) ((float) this.field4091.field10462 * var83 / (float) this.field4094) + arg4.field9465;
                        float var84 = (float) var15 * this.field4093 + (float) var13 * this.field4090 + (float) var58 * this.field4096 + this.field4108;
                        var41 = (int) ((float) this.field4091.field10471 * var84 / (float) this.field4094) + arg4.field9452;
                        float var85 = (float) var15 * this.field4095 + (float) var13 * this.field4089 + (float) var58 * this.field4098 + this.field4110;
                        var43 = (int) ((float) this.field4091.field10462 * var85 / (float) this.field4094) + arg4.field9465;
                        float var86 = (float) var15 * this.field4093 + (float) var12 * this.field4090 + (float) var59 * this.field4096 + this.field4108;
                        var45 = (int) ((float) this.field4091.field10471 * var86 / (float) this.field4094) + arg4.field9452;
                        float var87 = (float) var15 * this.field4095 + (float) var12 * this.field4089 + (float) var59 * this.field4098 + this.field4110;
                        var47 = (int) ((float) this.field4091.field10462 * var87 / (float) this.field4094) + arg4.field9465;
                    }
                }
                boolean var88 = var11.field9776 != -1 && this.method1920(this.field4091.field578.method931(var11.field9776, true).field3702);
                if (this.field4094 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field9458 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field9453 || var45 > arg4.field9453 || var37 > arg4.field9453;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field9776 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method3781((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field9781 & 16777215, var90 | var11.field9777 & 16777215, var90 | var11.field9775 & 16777215, arg3.field6105, var18, var19, var17, var11.field9776);
                                } else {
                                    if (var88) {
                                        arg4.field9454 = 100;
                                    }
                                    arg4.method3784((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class552.method3238(15707, var18 << 24 | arg3.field6105, var11.field9781), class552.method3238(15707, var19 << 24 | arg3.field6105, var11.field9777), class552.method3238(15707, var17 << 24 | arg3.field6105, var11.field9775));
                                    arg4.field9454 = 0;
                                }
                            } else if (var11.field9776 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method3781((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field9781 & 16777215, var91 | var11.field9777 & 16777215, var91 | var11.field9775 & 16777215, 0, 0, 0, 0, var11.field9776);
                            } else {
                                if (var88) {
                                    arg4.field9454 = 100;
                                }
                                arg4.method3784((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field9781, var11.field9777, var11.field9775);
                                arg4.field9454 = 0;
                            }
                        } else {
                            arg4.method3777((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field6105);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field9458 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field9453 || var37 > arg4.field9453 || var45 > arg4.field9453;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field9454 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field9776 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method3781((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field9779 & 16777215, var93 | var11.field9775 & 16777215, var93 | var11.field9777 & 16777215, arg3.field6105, var16, var17, var19, var11.field9776);
                                    return;
                                }
                                if (var88) {
                                    arg4.field9454 = 100;
                                }
                                arg4.method3784((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class552.method3238(15707, var16 << 24 | arg3.field6105, var11.field9779), class552.method3238(15707, var17 << 24 | arg3.field6105, var11.field9775), class552.method3238(15707, var19 << 24 | arg3.field6105, var11.field9777));
                                arg4.field9454 = 0;
                                return;
                            }
                            if (var11.field9776 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method3781((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field9779 & 16777215, var94 | var11.field9775 & 16777215, var94 | var11.field9777 & 16777215, 0, 0, 0, 0, var11.field9776);
                                return;
                            }
                            if (var88) {
                                arg4.field9454 = 100;
                            }
                            arg4.method3784((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field9779, var11.field9775, var11.field9777);
                            arg4.field9454 = 0;
                            return;
                        }
                        arg4.method3777((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field6105);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field9458 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field9453 || var45 > arg4.field9453 || var37 > arg4.field9453;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field9454 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field9776 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method3781((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field9781 & 16777215, var96 | var11.field9777 & 16777215, var96 | var11.field9775 & 16777215, arg3.field6105, var18, var19, var17, var11.field9776);
                                } else {
                                    if (var88) {
                                        arg4.field9454 = 100;
                                    }
                                    arg4.method3784((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class552.method3238(15707, var18 << 24 | arg3.field6105, var11.field9781), class552.method3238(15707, var19 << 24 | arg3.field6105, var11.field9777), class552.method3238(15707, var17 << 24 | arg3.field6105, var11.field9775));
                                    arg4.field9454 = 0;
                                }
                            } else if (var11.field9776 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method3781((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field9781 & 16777215, var97 | var11.field9777 & 16777215, var97 | var11.field9775 & 16777215, 0, 0, 0, 0, var11.field9776);
                            } else {
                                if (var88) {
                                    arg4.field9454 = 100;
                                }
                                arg4.method3784((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field9781, var11.field9777, var11.field9775);
                                arg4.field9454 = 0;
                            }
                        } else {
                            arg4.method3777((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field6105);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field9458 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field9453 || var37 > arg4.field9453 || var45 > arg4.field9453;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field9454 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field9776 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method3781((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field9779 & 16777215, var99 | var11.field9775 & 16777215, var99 | var11.field9777 & 16777215, arg3.field6105, var16, var17, var19, var11.field9776);
                                    return;
                                }
                                if (var88) {
                                    arg4.field9454 = 100;
                                }
                                arg4.method3784((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class552.method3238(15707, var16 << 24 | arg3.field6105, var11.field9779), class552.method3238(15707, var17 << 24 | arg3.field6105, var11.field9775), class552.method3238(15707, var19 << 24 | arg3.field6105, var11.field9777));
                                arg4.field9454 = 0;
                                return;
                            }
                            if (var11.field9776 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method3781((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field9779 & 16777215, var100 | var11.field9775 & 16777215, var100 | var11.field9777 & 16777215, 0, 0, 0, 0, var11.field9776);
                                return;
                            }
                            if (var88) {
                                arg4.field9454 = 100;
                            }
                            arg4.method3784((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field9779, var11.field9775, var11.field9777);
                            arg4.field9454 = 0;
                            return;
                        }
                        arg4.method3777((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field6105);
                    }
                }
            }
        } else {
            class285 var101 = this.field4101[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field3482 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field4094 == -1) {
                    for (int var102 = 0; var102 < var101.field3480; ++var102) {
                        int var103 = (arg0 << super.field3409) + var101.field3484[var102];
                        int var104 = var101.field3483[var102];
                        int var105 = (arg1 << super.field3409) + var101.field3479[var102];
                        float var106 = (float) var105 * this.field4092 + (float) var103 * this.field4104 + (float) var104 * this.field4102 + this.field4100;
                        if (var106 <= (float) this.field4091.field10473) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field6106);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field3486[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field6099) {
                            int var109 = (int) (var106 - (float) arg3.field6106);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field4093 + (float) var103 * this.field4090 + (float) var104 * this.field4096 + this.field4108;
                        float var111 = (float) var105 * this.field4095 + (float) var103 * this.field4089 + (float) var104 * this.field4098 + this.field4110;
                        arg5[var102] = (int) ((float) this.field4091.field10471 * var110 / var106) + arg4.field9452;
                        arg6[var102] = (int) ((float) this.field4091.field10462 * var111 / var106) + arg4.field9465;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field3480; ++var112) {
                        int var152 = (arg0 << super.field3409) + var101.field3484[var112];
                        int var153 = var101.field3483[var112];
                        int var154 = (arg1 << super.field3409) + var101.field3479[var112];
                        float var155 = (float) var154 * this.field4092 + (float) var152 * this.field4104 + (float) var153 * this.field4102 + this.field4100;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field4094 - arg3.field6106;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field3486[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field6099) {
                            int var158 = this.field4094 - arg3.field6106;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field4093 + (float) var152 * this.field4090 + (float) var153 * this.field4096 + this.field4108;
                        float var160 = (float) var154 * this.field4095 + (float) var152 * this.field4089 + (float) var153 * this.field4098 + this.field4110;
                        arg5[var112] = (int) ((float) this.field4091.field10471 * var159 / (float) this.field4094) + arg4.field9452;
                        arg6[var112] = (int) ((float) this.field4091.field10462 * var160 / (float) this.field4094) + arg4.field9465;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field3478 != null) {
                    if (this.field4094 == -1) {
                        for (int var113 = 0; var113 < var101.field3487; ++var113) {
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
                                arg4.field9458 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field9453 || var118 > arg4.field9453 || var119 > arg4.field9453;
                                short var124 = var101.field3478[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method1920(this.field4091.field578.method931(var124, true).field3702)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method3781((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field3484[var114] / (float) super.field3413, (float) var101.field3484[var115] / (float) super.field3413, (float) var101.field3484[var116] / (float) super.field3413, (float) var101.field3479[var114] / (float) super.field3413, (float) var101.field3479[var115] / (float) super.field3413, (float) var101.field3479[var116] / (float) super.field3413, var125 | var101.field3481[var114] & 16777215, var125 | var101.field3481[var115] & 16777215, var125 | var101.field3481[var116] & 16777215, arg3.field6105, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field3481[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method1920(this.field4091.field578.method931(var124, true).field3702)) {
                                                arg4.field9454 = -1694498816;
                                            }
                                            arg4.method3784((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class552.method3238(15707, arg8[var114] << 24 | arg3.field6105, var101.field3481[var114]), class552.method3238(15707, arg8[var115] << 24 | arg3.field6105, var101.field3481[var115]), class552.method3238(15707, arg8[var116] << 24 | arg3.field6105, var101.field3481[var116]));
                                            arg4.field9454 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method1920(this.field4091.field578.method931(var124, true).field3702)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method3781((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field3484[var114] / (float) super.field3413, (float) var101.field3484[var115] / (float) super.field3413, (float) var101.field3484[var116] / (float) super.field3413, (float) var101.field3479[var114] / (float) super.field3413, (float) var101.field3479[var115] / (float) super.field3413, (float) var101.field3479[var116] / (float) super.field3413, var126 | var101.field3481[var114] & 16777215, var126 | var101.field3481[var115] & 16777215, var126 | var101.field3481[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field3481[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method1920(this.field4091.field578.method931(var124, true).field3702)) {
                                            arg4.field9454 = -1694498816;
                                        }
                                        arg4.method3784((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field3481[var114], var101.field3481[var115], var101.field3481[var116]);
                                        arg4.field9454 = 0;
                                    }
                                } else {
                                    arg4.method3777((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field6105);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field3487; ++var127) {
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
                            arg4.field9458 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field9453 || var132 > arg4.field9453 || var133 > arg4.field9453;
                            short var138 = var101.field3478[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method1920(this.field4091.field578.method931(var138, true).field3702)) {
                                    arg4.field9454 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method1920(this.field4091.field578.method931(var138, true).field3702)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method3781((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field3484[var128] / (float) super.field3413, (float) var101.field3484[var129] / (float) super.field3413, (float) var101.field3484[var130] / (float) super.field3413, (float) var101.field3479[var128] / (float) super.field3413, (float) var101.field3479[var129] / (float) super.field3413, (float) var101.field3479[var130] / (float) super.field3413, var139 | var101.field3481[var128] & 16777215, var139 | var101.field3481[var129] & 16777215, var139 | var101.field3481[var130] & 16777215, arg3.field6105, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field3481[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method1920(this.field4091.field578.method931(var138, true).field3702)) {
                                            arg4.field9454 = -1694498816;
                                        }
                                        arg4.method3784((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class552.method3238(15707, arg8[var128] << 24 | arg3.field6105, var101.field3481[var128]), class552.method3238(15707, arg8[var129] << 24 | arg3.field6105, var101.field3481[var129]), class552.method3238(15707, arg8[var130] << 24 | arg3.field6105, var101.field3481[var130]));
                                        arg4.field9454 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method1920(this.field4091.field578.method931(var138, true).field3702)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method3781((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field3484[var128] / (float) super.field3413, (float) var101.field3484[var129] / (float) super.field3413, (float) var101.field3484[var130] / (float) super.field3413, (float) var101.field3479[var128] / (float) super.field3413, (float) var101.field3479[var129] / (float) super.field3413, (float) var101.field3479[var130] / (float) super.field3413, var140 | var101.field3481[var128] & 16777215, var140 | var101.field3481[var129] & 16777215, var140 | var101.field3481[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field3481[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method1920(this.field4091.field578.method931(var138, true).field3702)) {
                                        arg4.field9454 = -1694498816;
                                    }
                                    arg4.method3784((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field3481[var128], var101.field3481[var129], var101.field3481[var130]);
                                    arg4.field9454 = 0;
                                }
                                arg4.field9454 = 0;
                            } else {
                                arg4.method3777((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field6105);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field3487; ++var141) {
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
                        arg4.field9458 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field9453 || var146 > arg4.field9453 || var147 > arg4.field9453;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field3481[var142] & 16777215) != 0) {
                                    arg4.method3784((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class142.method890(var101.field3481[var142], arg8[var142], (byte) -34, arg3.field6105), class142.method890(var101.field3481[var143], arg8[var143], (byte) -34, arg3.field6105), class142.method890(var101.field3481[var144], arg8[var144], (byte) -34, arg3.field6105));
                                }
                            } else if ((var101.field3481[var142] & 16777215) != 0) {
                                arg4.method3784((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field3481[var142], var101.field3481[var143], var101.field3481[var144]);
                            }
                        } else {
                            arg4.method3777((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field6105);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(III[[ZZI)V", line = 1238)
    public final void method1667(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class462 var7 = this.field4091.field10478;
        this.field4094 = -1;
        this.field4090 = var7.field6577;
        this.field4096 = var7.field6592;
        this.field4093 = var7.field6579;
        this.field4108 = var7.field6599;
        this.field4089 = var7.field6590;
        this.field4098 = var7.field6591;
        this.field4095 = var7.field6589;
        this.field4110 = var7.field6605;
        this.field4104 = var7.field6585;
        this.field4102 = var7.field6576;
        this.field4092 = var7.field6596;
        this.field4100 = var7.field6595;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3410 && var11 >= 0 && var11 < super.field3408) {
                        this.method1919(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1282)
    public final void method1677(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(III)V", line = 1286)
    private final void method1919(int arg0, int arg1, int arg2) {
        class421 var4 = this.field4091.method4161(Thread.currentThread());
        var4.field6127.field9454 = 0;
        if (this.field4107 != null) {
            this.method1918(arg0, arg1, var4.field6102, var4, var4.field6127, var4.field6120, var4.field6124, var4.field6110, var4.field6111, arg2);
        } else if (this.field4103 != null) {
            this.method1923(arg0, arg1, var4.field6127, var4.field6120, var4.field6124, var4.field6110, var4.field6111, arg2);
        } else {
            if (this.field4109 != null) {
                this.method1916(arg0, arg1, var4.field6102, var4, var4.field6127, var4.field6120, var4.field6124, var4.field6110, var4.field6111, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Llr;IIII[[I[[II)V", line = 2074)
    public class321(class749 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4091 = arg0;
        this.field4105 = arg2;
        this.field4097 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4091.field10460 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4091.field10453 * var18 + this.field4091.field10466 * var16 + this.field4091.field10457 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4097[var11][var10] = (byte) var20;
            }
        }
        this.field4106 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V", line = 1306)
    public final void method1672(int arg0, int arg1) {
        this.method1919(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!nha", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1311)
    public final void method1673(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field4105 & 32) == 0;
        if (this.field4107 == null && !var15) {
            this.field4107 = new class694[super.field3410][super.field3408];
            this.field4101 = new class285[super.field3410][super.field3408];
        } else if (this.field4109 == null && var15) {
            this.field4109 = new class693[super.field3410][super.field3408];
        } else if (this.field4103 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class32.field361[class660.method3759((byte) -2, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class32.field361[class660.method3759((byte) -2, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class693 var18 = new class693();
                var18.field9770 = (short) arg2.length;
                var18.field9771 = (short) (arg2.length / 3);
                var18.field9768 = new short[var18.field9770];
                var18.field9765 = new short[var18.field9770];
                var18.field9763 = new short[var18.field9770];
                var18.field9764 = new int[var18.field9770];
                var18.field9766 = new short[var18.field9770];
                var18.field9773 = new short[var18.field9770];
                var18.field9769 = new byte[var18.field9770];
                if (arg5 != null) {
                    var18.field9772 = new short[var18.field9770];
                }
                for (int var19 = 0; var19 < var18.field9770; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field4097[arg0][arg1] - this.field4106[arg0][arg1];
                    } else if (var22 == 0 && super.field3413 == var23) {
                        var25 = this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1];
                    } else if (super.field3413 == var22 && super.field3413 == var23) {
                        var25 = this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1];
                    } else if (super.field3413 == var22 && var23 == 0) {
                        var25 = this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]) * var22 + (this.field4097[arg0][arg1] - this.field4106[arg0][arg1]) * (super.field3413 - var22);
                        int var27 = (this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]) * var22 + (this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]) * (super.field3413 - var22);
                        var25 = (super.field3413 - var23) * var26 + var23 * var27 >> super.field3409 * 2;
                    }
                    int var28 = (arg0 << super.field3409) + var22;
                    int var29 = (arg1 << super.field3409) + var23;
                    var18.field9768[var19] = (short) var22;
                    var18.field9763[var19] = (short) var23;
                    var18.field9765[var19] = (short) (this.method1675(var29, var28, 65286) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field9764[var19] = 0;
                        if (arg7 != null) {
                            var18.field9769[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field9772[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method1920(this.field4091.field578.method931(arg8[var19], true).field3702)) {
                            var32 = -1694498816;
                        }
                        var18.field9764[var19] = var32 | class142.method890(method1917(arg6[var19] >> 8, var25), var30, (byte) -34, arg10);
                        if (arg7 != null) {
                            var18.field9769[var19] = (byte) var25;
                        }
                    }
                    var18.field9766[var19] = (short) arg8[var19];
                    var18.field9773[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field9767 = new int[var18.field9771];
                }
                for (int var20 = 0; var20 < var18.field9771; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field9767[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field4109[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field3413 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3413 && arg4[var38] == super.field3413) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3413) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3413 != arg2[var40] && arg2[0] - super.field3413 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3413 != arg4[var40] && arg4[0] - super.field3413 != arg4[var40]) {
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
                    class694 var41 = new class694();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field9784 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field9774 = (byte) (var41.field9774 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3415[arg0 + 1][arg1] == super.field3415[arg0][arg1] && super.field3415[arg0 + 1][arg1 + 1] == super.field3415[arg0][arg1] && super.field3415[arg0][arg1 + 1] == super.field3415[arg0][arg1]) {
                        var41.field9774 = (byte) (var41.field9774 | 1);
                    }
                    if (var43 != -1 && (var41.field9774 & 2) == 0 && !this.field4091.field578.method931(var43, true).field3694) {
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
                        var41.field9779 = class142.method890(method1917(arg6[var34] >> 8, this.field4097[arg0][arg1] - this.field4106[arg0][arg1]), var44, (byte) -34, arg10);
                        if (var41.field9784 != 0) {
                            var41.field9779 |= 255 - (this.field4097[arg0][arg1] - this.field4106[arg0][arg1]) << 25;
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
                        var41.field9775 = class142.method890(method1917(arg6[var35] >> 8, this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]), var45, (byte) -34, arg10);
                        if (var41.field9784 != 0) {
                            var41.field9775 |= 255 - (this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]) << 25;
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
                        var41.field9781 = class142.method890(method1917(arg6[var36] >> 8, this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]), var46, (byte) -34, arg10);
                        if (var41.field9784 != 0) {
                            var41.field9781 |= 255 - (this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field9777 = class142.method890(method1917(arg6[var37] >> 8, this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]), var47, (byte) -34, arg10);
                        var41.field9776 = (short) var43;
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
                        var41.field9779 = class142.method890(method1917(arg6[var34] >> 8, this.field4097[arg0][arg1] - this.field4106[arg0][arg1]), var48, (byte) -34, arg10);
                        if (var41.field9784 != 0) {
                            var41.field9779 |= 255 - (this.field4097[arg0][arg1] - this.field4106[arg0][arg1]) << 25;
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
                        var41.field9775 = class142.method890(method1917(arg6[var35] >> 8, this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]), var49, (byte) -34, arg10);
                        if (var41.field9784 != 0) {
                            var41.field9775 |= 255 - (this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]) << 25;
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
                        var41.field9781 = class142.method890(method1917(arg6[var36] >> 8, this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]), var50, (byte) -34, arg10);
                        if (var41.field9784 != 0) {
                            var41.field9781 |= 255 - (this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field9777 = class142.method890(method1917(arg6[var37] >> 8, this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]), var51, (byte) -34, arg10);
                        if (var41.field9784 != 0) {
                            var41.field9777 |= 255 - (this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]) << 25;
                        }
                        var41.field9776 = -1;
                    }
                    if (arg5 != null) {
                        var41.field9780 = (short) arg5[var36];
                        var41.field9783 = (short) arg5[var37];
                        var41.field9778 = (short) arg5[var35];
                        var41.field9782 = (short) arg5[var34];
                    }
                    this.field4107[arg0][arg1] = var41;
                } else {
                    class285 var52 = new class285();
                    var52.field3480 = (short) arg2.length;
                    var52.field3487 = (short) (arg2.length / 3);
                    var52.field3484 = new short[var52.field3480];
                    var52.field3483 = new short[var52.field3480];
                    var52.field3479 = new short[var52.field3480];
                    var52.field3481 = new int[var52.field3480];
                    if (arg5 != null) {
                        var52.field3486 = new short[var52.field3480];
                    }
                    for (int var53 = 0; var53 < var52.field3480; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field4097[arg0][arg1] - this.field4106[arg0][arg1];
                        } else if (var68 == 0 && super.field3413 == var69) {
                            var71 = this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1];
                        } else if (super.field3413 == var68 && super.field3413 == var69) {
                            var71 = this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1];
                        } else if (super.field3413 == var68 && var69 == 0) {
                            var71 = this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]) * var68 + (this.field4097[arg0][arg1] - this.field4106[arg0][arg1]) * (super.field3413 - var68);
                            int var73 = (this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]) * var68 + (this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]) * (super.field3413 - var68);
                            var71 = (super.field3413 - var69) * var72 + var69 * var73 >> super.field3409 * 2;
                        }
                        int var74 = (arg0 << super.field3409) + var68;
                        int var75 = (arg1 << super.field3409) + var69;
                        var52.field3484[var53] = (short) var68;
                        var52.field3479[var53] = (short) var69;
                        var52.field3483[var53] = (short) (this.method1675(var75, var74, 65286) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field3481[var53] = var71 << 25;
                            } else {
                                var52.field3481[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field3486[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field3481[var53] = class142.method890(method1917(arg6[var53] >> 8, var71), var76, (byte) -34, arg10);
                            if (arg7 != null) {
                                var52.field3481[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field3487; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field4091.field578.method931(arg8[var55 * 3], true).field3694) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field3477 = new int[var52.field3487];
                    }
                    if (var54) {
                        var52.field3478 = new short[var52.field3487];
                        var52.field3485 = new short[var52.field3487];
                    }
                    for (int var56 = 0; var56 < var52.field3487; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field3477[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field4091.field578.method931(var62, true).field3694) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field4091.field578.method931(var63, true).field3694) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field4091.field578.method931(var64, true).field3694) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field3478[var56] = (short) var64;
                                var52.field3485[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field4091.field578.method931(var65, true).field3694) {
                                        var52.field3481[var57] = class32.field361[class660.method3759((byte) -2, this.field4091.field578.method931(var65, true).field3706 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field4091.field578.method931(var66, true).field3694) {
                                        var52.field3481[var58] = class32.field361[class660.method3759((byte) -2, this.field4091.field578.method931(var66, true).field3706 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field4091.field578.method931(var67, true).field3694) {
                                        var52.field3481[var59] = class32.field361[class660.method3759((byte) -2, this.field4091.field578.method931(var67, true).field3706 & 65535) & 65535];
                                    }
                                }
                                var52.field3478[var56] = -1;
                            }
                        }
                    }
                    this.field4101[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)Z", line = 2010)
    private final boolean method1920(int arg0) {
        if ((this.field4105 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(III[[ZZII)V", line = 2027)
    public final void method1670(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class462 var8 = this.field4091.field10478;
        this.field4094 = arg5;
        this.field4090 = var8.field6577;
        this.field4096 = var8.field6592;
        this.field4093 = var8.field6579;
        this.field4108 = var8.field6599;
        this.field4089 = var8.field6590;
        this.field4098 = var8.field6591;
        this.field4095 = var8.field6589;
        this.field4110 = var8.field6605;
        this.field4104 = var8.field6585;
        this.field4102 = var8.field6576;
        this.field4092 = var8.field6596;
        this.field4100 = var8.field6595;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3410 && var12 >= 0 && var12 < super.field3408) {
                        this.method1919(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 2071)
    public final void method1663(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 2123)
    public final void method1665(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4103 == null) {
            this.field4103 = new class369[super.field3410][super.field3408];
            this.field4099 = new class651[super.field3410][super.field3408];
        } else if (this.field4107 != null || this.field4109 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3413 != var20 || var21 != 0 && super.field3413 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class651 var22 = new class651();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field9303 = var23;
            var22.field9294 = new short[var23];
            var22.field9295 = new short[var23];
            var22.field9293 = new short[var23];
            var22.field9297 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field9294[var25] = (short) (this.field4097[arg0][arg1] - this.field4106[arg0][arg1]);
                } else if (var32 == 0 && super.field3413 == var33) {
                    var22.field9294[var25] = (short) (this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]);
                } else if (super.field3413 == var32 && super.field3413 == var33) {
                    var22.field9294[var25] = (short) (this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]);
                } else if (super.field3413 == var32 && var33 == 0) {
                    var22.field9294[var25] = (short) (this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]) * var32 + (this.field4097[arg0][arg1] - this.field4106[arg0][arg1]) * (super.field3413 - var32);
                    int var35 = (this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]) * var32 + (this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]) * (super.field3413 - var32);
                    var22.field9294[var25] = (short) ((super.field3413 - var33) * var34 + var33 * var35 >> super.field3409 * 2);
                }
                int var36 = (arg0 << super.field3409) + var32;
                int var37 = (arg1 << super.field3409) + var33;
                var22.field9295[var25] = (short) var32;
                var22.field9297[var25] = (short) var33;
                var22.field9293[var25] = (short) (this.method1675(var37, var36, 65286) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field9294[var25] < 2) {
                    var22.field9294[var25] = 2;
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
                    class298 var31 = this.field4091.field578.method931(var30, true);
                    if (!var31.field3694) {
                        var26 = true;
                        if (this.method1920(var31.field3702) || var31.field3704 != 0 || var31.field3699 != 0) {
                            var22.field9301 = (byte) (var22.field9301 | 4);
                        }
                    }
                }
            }
            var22.field9302 = new int[var27];
            if (arg10 != null) {
                var22.field9291 = new int[var27];
            }
            var22.field9300 = new short[var27];
            var22.field9296 = new short[var27];
            var22.field9292 = new short[var27];
            if (var26) {
                var22.field9290 = new short[var27];
                var22.field9299 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field9302[var22.field9298] = class660.method3759((byte) -2, arg9[var29]);
                    } else {
                        var22.field9302[var22.field9298] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field9291[var22.field9298] = class660.method3759((byte) -2, arg10[var29]);
                        } else {
                            var22.field9291[var22.field9298] = -1;
                        }
                    }
                    var22.field9300[var22.field9298] = (short) arg6[var29];
                    var22.field9296[var22.field9298] = (short) arg7[var29];
                    var22.field9292[var22.field9298] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4091.field578.method931(arg11[var29], true).field3694) {
                            var22.field9290[var22.field9298] = (short) arg11[var29];
                            var22.field9299[var22.field9298] = (short) arg12[var29];
                        } else {
                            var22.field9290[var22.field9298] = -1;
                        }
                    }
                    ++var22.field9298;
                }
            }
            this.field4099[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class369 var38 = new class369();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field4709 = class354.method2090(class660.method3759((byte) -2, arg10[0]), -18, this.field4097[arg0][arg1] - this.field4106[arg0][arg1]);
                    if (var39 == -1) {
                        var38.field4710 = (byte) (var38.field4710 | 2);
                    }
                }
                if (super.field3415[arg0 + 1][arg1] == super.field3415[arg0][arg1] && super.field3415[arg0 + 1][arg1 + 1] == super.field3415[arg0][arg1] && super.field3415[arg0][arg1 + 1] == super.field3415[arg0][arg1]) {
                    var38.field4710 = (byte) (var38.field4710 | 1);
                }
                class298 var41 = null;
                if (var40 != -1) {
                    var41 = this.field4091.field578.method931(var40, true);
                }
                if (var41 != null && (var38.field4710 & 2) == 0 && !var41.field3694) {
                    var38.field4714 = (short) (this.field4097[arg0][arg1] - this.field4106[arg0][arg1]);
                    var38.field4711 = (short) (this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]);
                    var38.field4712 = (short) (this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]);
                    var38.field4708 = (short) (this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]);
                    var38.field4713 = (short) var40;
                    if (this.method1920(var41.field3702) || var41.field3704 != 0 || var41.field3699 != 0) {
                        var38.field4710 = (byte) (var38.field4710 | 4);
                    }
                } else {
                    short var42 = class660.method3759((byte) -2, var39);
                    var38.field4714 = (short) class354.method2090(var42, -15, this.field4097[arg0][arg1] - this.field4106[arg0][arg1]);
                    var38.field4711 = (short) class354.method2090(var42, -60, this.field4097[arg0 + 1][arg1] - this.field4106[arg0 + 1][arg1]);
                    var38.field4712 = (short) class354.method2090(var42, -3, this.field4097[arg0 + 1][arg1 + 1] - this.field4106[arg0 + 1][arg1 + 1]);
                    var38.field4708 = (short) class354.method2090(var42, -29, this.field4097[arg0][arg1 + 1] - this.field4106[arg0][arg1 + 1]);
                    var38.field4713 = -1;
                }
                this.field4103[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2373)
    public final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class421 var9 = this.field4091.method4161(Thread.currentThread());
        class665 var10 = var9.field6127;
        var10.field9454 = 0;
        var10.field9458 = true;
        this.field4091.method319();
        if (this.field4107 == null && this.field4109 == null) {
            if (this.field4103 != null) {
                this.method1922(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field6120, var9.field6124);
            }
        } else {
            this.method1921(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field6120, var9.field6124);
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIIII[[ZLij;Lgba;[I[I)V", line = 2390)
    private final void method1921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class421 arg8, class665 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field6098;
        this.field4091.method364(false);
        arg9.field9466 = false;
        arg9.field9461 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4107 != null) {
                        if (this.field4107[var18][var19] != null) {
                            class694 var20 = this.field4107[var18][var19];
                            if (var20.field9776 != -1 && (var20.field9774 & 2) == 0 && var20.field9784 == 0) {
                                int var21 = this.field4091.method4168(var20.field9776);
                                arg9.method3775((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class354.method2090(var21, -49, var20.field9781), (float) class354.method2090(var21, -28, var20.field9777), (float) class354.method2090(var21, -79, var20.field9775));
                                arg9.method3775((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class354.method2090(var21, -17, var20.field9779), (float) class354.method2090(var21, -111, var20.field9775), (float) class354.method2090(var21, -74, var20.field9777));
                            } else if (var20.field9784 == 0) {
                                arg9.method3784((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field9781, var20.field9777, var20.field9775);
                                arg9.method3784((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field9779, var20.field9775, var20.field9777);
                            } else {
                                int var22 = var20.field9784;
                                arg9.method3784((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class552.method3238(15707, var20.field9781 & -16777216, var22), class552.method3238(15707, var20.field9777 & -16777216, var22), class552.method3238(15707, var20.field9775 & -16777216, var22));
                                arg9.method3784((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class552.method3238(15707, var20.field9779 & -16777216, var22), class552.method3238(15707, var20.field9775 & -16777216, var22), class552.method3238(15707, var20.field9777 & -16777216, var22));
                            }
                        } else if (this.field4101[var18][var19] != null) {
                            class285 var23 = this.field4101[var18][var19];
                            for (int var24 = 0; var24 < var23.field3480; ++var24) {
                                arg10[var24] = var23.field3484[var24] * var14 / super.field3413 + var16;
                                arg11[var24] = var17 - var23.field3479[var24] * var14 / super.field3413;
                            }
                            for (int var25 = 0; var25 < var23.field3487; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field3477 != null && var23.field3477[var25] != 0 && (var23.field3478 == null || var23.field3478 != null && var23.field3478[var25] == -1)) {
                                    int var35 = var23.field3477[var25];
                                    arg9.method3784((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class552.method3238(15707, -16777216 - (var23.field3481[var26] & -16777216), var35), class552.method3238(15707, -16777216 - (var23.field3481[var27] & -16777216), var35), class552.method3238(15707, -16777216 - (var23.field3481[var28] & -16777216), var35));
                                } else if (var23.field3478 != null && var23.field3478[var25] != -1) {
                                    int var36 = this.field4091.method4168(var23.field3478[var25]);
                                    arg9.method3775((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method3784((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field3481[var26], var23.field3481[var27], var23.field3481[var28]);
                                }
                            }
                        }
                    } else if (this.field4109[var18][var19] != null) {
                        class693 var37 = this.field4109[var18][var19];
                        for (int var38 = 0; var38 < var37.field9770; ++var38) {
                            arg10[var38] = var37.field9768[var38] * var14 / super.field3413 + var16;
                            arg11[var38] = var17 - var37.field9763[var38] * var14 / super.field3413;
                        }
                        for (int var39 = 0; var39 < var37.field9771; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field9767 != null && var37.field9767[var39] != 0) {
                                int var49 = var37.field9767[var39];
                                arg9.method3784((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method3784((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field9764[var40], var37.field9764[var41], var37.field9764[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field9466 = true;
        this.field4091.method364(var15);
    }

    @OriginalMember(owner = "client!nha", name = "YA", descriptor = "()V", line = 2584)
    public final void method1674() {
        this.field4097 = null;
        this.field4106 = null;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(IIIIIII[[ZLij;Lgba;[I[I)V", line = 2589)
    private final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class421 arg8, class665 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field6098;
        this.field4091.method364(false);
        arg9.field9466 = false;
        arg9.field9461 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4103[var18][var19] != null) {
                        class369 var20 = this.field4103[var18][var19];
                        if (var20.field4713 != -1 && (var20.field4710 & 2) == 0 && var20.field4709 == -1) {
                            int var21 = this.field4091.method4168(var20.field4713);
                            arg9.method3775((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class354.method2090(var21, -124, var20.field4712 & 65535), (float) class354.method2090(var21, -45, var20.field4708 & 65535), (float) class354.method2090(var21, -45, var20.field4711 & 65535));
                            arg9.method3775((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class354.method2090(var21, -31, var20.field4714 & 65535), (float) class354.method2090(var21, -71, var20.field4711 & 65535), (float) class354.method2090(var21, -11, var20.field4708 & 65535));
                        } else if (var20.field4709 == -1) {
                            arg9.method3775((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field4712 & 65535), (float) (var20.field4708 & 65535), (float) (var20.field4711 & 65535));
                            arg9.method3775((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field4714 & 65535), (float) (var20.field4711 & 65535), (float) (var20.field4708 & 65535));
                        } else {
                            int var22 = var20.field4709;
                            arg9.method3775((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method3775((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field4099[var18][var19] != null) {
                        class651 var23 = this.field4099[var18][var19];
                        for (int var24 = 0; var24 < var23.field9303; ++var24) {
                            arg10[var24] = var23.field9295[var24] * var14 / super.field3413 + var16;
                            arg11[var24] = var17 - var23.field9297[var24] * var14 / super.field3413;
                        }
                        for (int var25 = 0; var25 < var23.field9298; ++var25) {
                            short var26 = var23.field9300[var25];
                            short var27 = var23.field9296[var25];
                            short var28 = var23.field9292[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field9291 != null && var23.field9291[var25] != -1) {
                                int var35 = var23.field9291[var25];
                                arg9.method3775((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class354.method2090(var35, -94, var23.field9294[var26]), (float) class354.method2090(var35, -126, var23.field9294[var27]), (float) class354.method2090(var35, -31, var23.field9294[var28]));
                            } else if (var23.field9290 != null && var23.field9290[var25] != -1) {
                                int var36 = this.field4091.method4168(var23.field9290[var25]);
                                arg9.method3775((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class354.method2090(var36, -57, var23.field9294[var26]), (float) class354.method2090(var36, -118, var23.field9294[var27]), (float) class354.method2090(var36, -50, var23.field9294[var28]));
                            } else {
                                int var37 = var23.field9302[var25];
                                arg9.method3775((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class354.method2090(var37, -60, var23.field9294[var26]), (float) class354.method2090(var37, -24, var23.field9294[var27]), (float) class354.method2090(var37, -62, var23.field9294[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field9466 = true;
        this.field4091.method364(var15);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 2725)
    public final boolean method1669(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IILgba;[I[I[I[II)V", line = 2729)
    private final void method1923(int arg0, int arg1, class665 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class369 var9 = this.field4103[arg0][arg1];
        if (var9 != null) {
            if ((var9.field4710 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field4710 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3413 * arg0;
                int var11 = super.field3413 + var10;
                int var12 = super.field3413 * arg1;
                int var13 = super.field3413 + var12;
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
                if ((var9.field4710 & 1) != 0) {
                    int var14 = super.field3415[arg0][arg1];
                    float var15 = (float) var14 * this.field4102;
                    if (this.field4094 == -1) {
                        var16 = (float) var12 * this.field4092 + (float) var10 * this.field4104 + var15 + this.field4100;
                        if (var16 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var17 = (float) var12 * this.field4092 + (float) var11 * this.field4104 + var15 + this.field4100;
                        if (var17 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var18 = (float) var13 * this.field4092 + (float) var11 * this.field4104 + var15 + this.field4100;
                        if (var18 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var19 = (float) var13 * this.field4092 + (float) var10 * this.field4104 + var15 + this.field4100;
                        if (var19 <= (float) this.field4091.field10473) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field4092 + (float) var10 * this.field4104 + var15 + this.field4100;
                        var17 = (float) var12 * this.field4092 + (float) var11 * this.field4104 + var15 + this.field4100;
                        var18 = (float) var13 * this.field4092 + (float) var11 * this.field4104 + var15 + this.field4100;
                        var19 = (float) var13 * this.field4092 + (float) var10 * this.field4104 + var15 + this.field4100;
                    }
                    float var20 = (float) var14 * this.field4096;
                    float var21 = (float) var14 * this.field4098;
                    if (this.field4094 == -1) {
                        float var22 = (float) var12 * this.field4093 + (float) var10 * this.field4090 + var20 + this.field4108;
                        var23 = (int) ((float) this.field4091.field10471 * var22 / var16) + arg2.field9452;
                        float var24 = (float) var12 * this.field4095 + (float) var10 * this.field4089 + var21 + this.field4110;
                        var25 = (int) ((float) this.field4091.field10462 * var24 / var16) + arg2.field9465;
                        float var26 = (float) var12 * this.field4093 + (float) var11 * this.field4090 + var20 + this.field4108;
                        var27 = (int) ((float) this.field4091.field10471 * var26 / var17) + arg2.field9452;
                        float var28 = (float) var12 * this.field4095 + (float) var11 * this.field4089 + var21 + this.field4110;
                        var29 = (int) ((float) this.field4091.field10462 * var28 / var17) + arg2.field9465;
                        float var30 = (float) var13 * this.field4093 + (float) var11 * this.field4090 + var20 + this.field4108;
                        var31 = (int) ((float) this.field4091.field10471 * var30 / var18) + arg2.field9452;
                        float var32 = (float) var13 * this.field4095 + (float) var11 * this.field4089 + var21 + this.field4110;
                        var33 = (int) ((float) this.field4091.field10462 * var32 / var18) + arg2.field9465;
                        float var34 = (float) var13 * this.field4093 + (float) var10 * this.field4090 + var20 + this.field4108;
                        var35 = (int) ((float) this.field4091.field10471 * var34 / var19) + arg2.field9452;
                        float var36 = (float) var13 * this.field4095 + (float) var10 * this.field4089 + var21 + this.field4110;
                        var37 = (int) ((float) this.field4091.field10462 * var36 / var19) + arg2.field9465;
                    } else {
                        float var38 = (float) var12 * this.field4093 + (float) var10 * this.field4090 + var20 + this.field4108;
                        var23 = (int) ((float) this.field4091.field10471 * var38 / (float) this.field4094) + arg2.field9452;
                        float var39 = (float) var12 * this.field4095 + (float) var10 * this.field4089 + var21 + this.field4110;
                        var25 = (int) ((float) this.field4091.field10462 * var39 / (float) this.field4094) + arg2.field9465;
                        float var40 = (float) var12 * this.field4093 + (float) var11 * this.field4090 + var20 + this.field4108;
                        var27 = (int) ((float) this.field4091.field10471 * var40 / (float) this.field4094) + arg2.field9452;
                        float var41 = (float) var12 * this.field4095 + (float) var11 * this.field4089 + var21 + this.field4110;
                        var29 = (int) ((float) this.field4091.field10462 * var41 / (float) this.field4094) + arg2.field9465;
                        float var42 = (float) var13 * this.field4093 + (float) var11 * this.field4090 + var20 + this.field4108;
                        var31 = (int) ((float) this.field4091.field10471 * var42 / (float) this.field4094) + arg2.field9452;
                        float var43 = (float) var13 * this.field4095 + (float) var11 * this.field4089 + var21 + this.field4110;
                        var33 = (int) ((float) this.field4091.field10462 * var43 / (float) this.field4094) + arg2.field9465;
                        float var44 = (float) var13 * this.field4093 + (float) var10 * this.field4090 + var20 + this.field4108;
                        var35 = (int) ((float) this.field4091.field10471 * var44 / (float) this.field4094) + arg2.field9452;
                        float var45 = (float) var13 * this.field4095 + (float) var10 * this.field4089 + var21 + this.field4110;
                        var37 = (int) ((float) this.field4091.field10462 * var45 / (float) this.field4094) + arg2.field9465;
                    }
                } else {
                    int var46 = super.field3415[arg0][arg1];
                    int var47 = super.field3415[arg0 + 1][arg1];
                    int var48 = super.field3415[arg0 + 1][arg1 + 1];
                    int var49 = super.field3415[arg0][arg1 + 1];
                    if (this.field4094 == -1) {
                        var16 = (float) var12 * this.field4092 + (float) var10 * this.field4104 + (float) var46 * this.field4102 + this.field4100;
                        if (var16 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var17 = (float) var12 * this.field4092 + (float) var11 * this.field4104 + (float) var47 * this.field4102 + this.field4100;
                        if (var17 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var18 = (float) var13 * this.field4092 + (float) var11 * this.field4104 + (float) var48 * this.field4102 + this.field4100;
                        if (var18 <= (float) this.field4091.field10473) {
                            return;
                        }
                        var19 = (float) var13 * this.field4092 + (float) var10 * this.field4104 + (float) var49 * this.field4102 + this.field4100;
                        if (var19 <= (float) this.field4091.field10473) {
                            return;
                        }
                        float var50 = (float) var12 * this.field4093 + (float) var10 * this.field4090 + (float) var46 * this.field4096 + this.field4108;
                        var23 = (int) ((float) this.field4091.field10471 * var50 / var16) + arg2.field9452;
                        float var51 = (float) var12 * this.field4095 + (float) var10 * this.field4089 + (float) var46 * this.field4098 + this.field4110;
                        var25 = (int) ((float) this.field4091.field10462 * var51 / var16) + arg2.field9465;
                        float var52 = (float) var12 * this.field4093 + (float) var11 * this.field4090 + (float) var47 * this.field4096 + this.field4108;
                        var27 = (int) ((float) this.field4091.field10471 * var52 / var17) + arg2.field9452;
                        float var53 = (float) var12 * this.field4095 + (float) var11 * this.field4089 + (float) var47 * this.field4098 + this.field4110;
                        var29 = (int) ((float) this.field4091.field10462 * var53 / var17) + arg2.field9465;
                        float var54 = (float) var13 * this.field4093 + (float) var11 * this.field4090 + (float) var48 * this.field4096 + this.field4108;
                        var31 = (int) ((float) this.field4091.field10471 * var54 / var18) + arg2.field9452;
                        float var55 = (float) var13 * this.field4095 + (float) var11 * this.field4089 + (float) var48 * this.field4098 + this.field4110;
                        var33 = (int) ((float) this.field4091.field10462 * var55 / var18) + arg2.field9465;
                        float var56 = (float) var13 * this.field4093 + (float) var10 * this.field4090 + (float) var49 * this.field4096 + this.field4108;
                        var35 = (int) ((float) this.field4091.field10471 * var56 / var19) + arg2.field9452;
                        float var57 = (float) var13 * this.field4095 + (float) var10 * this.field4089 + (float) var49 * this.field4098 + this.field4110;
                        var37 = (int) ((float) this.field4091.field10462 * var57 / var19) + arg2.field9465;
                    } else {
                        var16 = (float) var12 * this.field4092 + (float) var10 * this.field4104 + (float) var46 * this.field4102 + this.field4100;
                        var17 = (float) var12 * this.field4092 + (float) var11 * this.field4104 + (float) var47 * this.field4102 + this.field4100;
                        var18 = (float) var13 * this.field4092 + (float) var11 * this.field4104 + (float) var48 * this.field4102 + this.field4100;
                        var19 = (float) var13 * this.field4092 + (float) var10 * this.field4104 + (float) var49 * this.field4102 + this.field4100;
                        float var58 = (float) var12 * this.field4093 + (float) var10 * this.field4090 + (float) var46 * this.field4096 + this.field4108;
                        var23 = (int) ((float) this.field4091.field10471 * var58 / (float) this.field4094) + arg2.field9452;
                        float var59 = (float) var12 * this.field4095 + (float) var10 * this.field4089 + (float) var46 * this.field4098 + this.field4110;
                        var25 = (int) ((float) this.field4091.field10462 * var59 / (float) this.field4094) + arg2.field9465;
                        float var60 = (float) var12 * this.field4093 + (float) var11 * this.field4090 + (float) var47 * this.field4096 + this.field4108;
                        var27 = (int) ((float) this.field4091.field10471 * var60 / (float) this.field4094) + arg2.field9452;
                        float var61 = (float) var12 * this.field4095 + (float) var11 * this.field4089 + (float) var47 * this.field4098 + this.field4110;
                        var29 = (int) ((float) this.field4091.field10462 * var61 / (float) this.field4094) + arg2.field9465;
                        float var62 = (float) var13 * this.field4093 + (float) var11 * this.field4090 + (float) var48 * this.field4096 + this.field4108;
                        var31 = (int) ((float) this.field4091.field10471 * var62 / (float) this.field4094) + arg2.field9452;
                        float var63 = (float) var13 * this.field4095 + (float) var11 * this.field4089 + (float) var48 * this.field4098 + this.field4110;
                        var33 = (int) ((float) this.field4091.field10462 * var63 / (float) this.field4094) + arg2.field9465;
                        float var64 = (float) var13 * this.field4093 + (float) var10 * this.field4090 + (float) var49 * this.field4096 + this.field4108;
                        var35 = (int) ((float) this.field4091.field10471 * var64 / (float) this.field4094) + arg2.field9452;
                        float var65 = (float) var13 * this.field4095 + (float) var10 * this.field4089 + (float) var49 * this.field4098 + this.field4110;
                        var37 = (int) ((float) this.field4091.field10462 * var65 / (float) this.field4094) + arg2.field9465;
                    }
                }
                if (this.field4094 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field9458 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field9453 || var35 > arg2.field9453 || var27 > arg2.field9453;
                        if (var9.field4713 >= 0) {
                            arg2.method3781((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class32.field361[var9.field4712 & 65535] & 16777215, -16777216 | class32.field361[var9.field4708 & 65535] & 16777215, -16777216 | class32.field361[var9.field4711 & 65535] & 16777215, 0, 0, 0, 0, var9.field4713);
                        } else {
                            arg2.method3775((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field4712 & 65535), (float) (var9.field4708 & 65535), (float) (var9.field4711 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field9458 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field9453 || var27 > arg2.field9453 || var35 > arg2.field9453;
                        if (var9.field4713 >= 0) {
                            arg2.method3781((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class32.field361[var9.field4714 & 65535] & 16777215, -16777216 | class32.field361[var9.field4711 & 65535] & 16777215, -16777216 | class32.field361[var9.field4708 & 65535] & 16777215, 0, 0, 0, 0, var9.field4713);
                            return;
                        }
                        arg2.method3775((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field4714 & 65535), (float) (var9.field4711 & 65535), (float) (var9.field4708 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field9458 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field9453 || var35 > arg2.field9453 || var27 > arg2.field9453;
                        if (var9.field4713 >= 0) {
                            arg2.method3781((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class32.field361[var9.field4712 & 65535] & 16777215, -16777216 | class32.field361[var9.field4708 & 65535] & 16777215, -16777216 | class32.field361[var9.field4711 & 65535] & 16777215, 0, 0, 0, 0, var9.field4713);
                        } else {
                            arg2.method3775((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field4712 & 65535), (float) (var9.field4708 & 65535), (float) (var9.field4711 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field9458 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field9453 || var27 > arg2.field9453 || var35 > arg2.field9453;
                        if (var9.field4713 >= 0) {
                            arg2.method3781((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class32.field361[var9.field4714 & 65535] & 16777215, -16777216 | class32.field361[var9.field4711 & 65535] & 16777215, -16777216 | class32.field361[var9.field4708 & 65535] & 16777215, 0, 0, 0, 0, var9.field4713);
                            return;
                        }
                        arg2.method3775((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field4714 & 65535), (float) (var9.field4711 & 65535), (float) (var9.field4708 & 65535));
                    }
                }
            }
        } else {
            class651 var66 = this.field4099[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field9301 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field4094 == -1) {
                    for (int var67 = 0; var67 < var66.field9303; ++var67) {
                        int var68 = (arg0 << super.field3409) + var66.field9295[var67];
                        short var69 = var66.field9293[var67];
                        int var70 = (arg1 << super.field3409) + var66.field9297[var67];
                        float var71 = (float) var70 * this.field4092 + (float) var68 * this.field4104 + (float) var69 * this.field4102 + this.field4100;
                        if (var71 <= (float) this.field4091.field10473) {
                            return;
                        }
                        float var72 = (float) var70 * this.field4093 + (float) var68 * this.field4090 + (float) var69 * this.field4096 + this.field4108;
                        float var73 = (float) var70 * this.field4095 + (float) var68 * this.field4089 + (float) var69 * this.field4098 + this.field4110;
                        arg3[var67] = (int) ((float) this.field4091.field10471 * var72 / var71) + arg2.field9452;
                        arg4[var67] = (int) ((float) this.field4091.field10462 * var73 / var71) + arg2.field9465;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field9303; ++var74) {
                        int var110 = (arg0 << super.field3409) + var66.field9295[var74];
                        short var111 = var66.field9293[var74];
                        int var112 = (arg1 << super.field3409) + var66.field9297[var74];
                        float var113 = (float) var112 * this.field4092 + (float) var110 * this.field4104 + (float) var111 * this.field4102 + this.field4100;
                        float var114 = (float) var112 * this.field4093 + (float) var110 * this.field4090 + (float) var111 * this.field4096 + this.field4108;
                        float var115 = (float) var112 * this.field4095 + (float) var110 * this.field4089 + (float) var111 * this.field4098 + this.field4110;
                        arg3[var74] = (int) ((float) this.field4091.field10471 * var114 / (float) this.field4094) + arg2.field9452;
                        arg4[var74] = (int) ((float) this.field4091.field10462 * var115 / (float) this.field4094) + arg2.field9465;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field9290 != null) {
                    if (this.field4094 == -1) {
                        for (int var75 = 0; var75 < var66.field9298; ++var75) {
                            short var76 = var66.field9300[var75];
                            short var77 = var66.field9296[var75];
                            short var78 = var66.field9292[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field9458 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field9453 || var80 > arg2.field9453 || var81 > arg2.field9453;
                                short var85 = var66.field9290[var75];
                                if (var85 != -1) {
                                    arg2.method3781((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field9295[var76] / (float) super.field3413, (float) var66.field9295[var77] / (float) super.field3413, (float) var66.field9295[var78] / (float) super.field3413, (float) var66.field9297[var76] / (float) super.field3413, (float) var66.field9297[var77] / (float) super.field3413, (float) var66.field9297[var78] / (float) super.field3413, -16777216 | class32.field361[var66.field9294[var76] & 65535] & 16777215, -16777216 | class32.field361[var66.field9294[var77] & 65535] & 16777215, -16777216 | class32.field361[var66.field9294[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field9302[var75];
                                    if (var86 != -1) {
                                        arg2.method3775((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class354.method2090(var86, -105, var66.field9294[var76]), (float) class354.method2090(var86, -4, var66.field9294[var77]), (float) class354.method2090(var86, -119, var66.field9294[var78]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field9298; ++var87) {
                        short var88 = var66.field9300[var87];
                        short var89 = var66.field9296[var87];
                        short var90 = var66.field9292[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field9458 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field9453 || var92 > arg2.field9453 || var93 > arg2.field9453;
                            short var97 = var66.field9290[var87];
                            if (var97 != -1) {
                                arg2.method3781((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field9295[var88] / (float) super.field3413, (float) var66.field9295[var89] / (float) super.field3413, (float) var66.field9295[var90] / (float) super.field3413, (float) var66.field9297[var88] / (float) super.field3413, (float) var66.field9297[var89] / (float) super.field3413, (float) var66.field9297[var90] / (float) super.field3413, -16777216 | class32.field361[var66.field9294[var88] & 65535] & 16777215, -16777216 | class32.field361[var66.field9294[var89] & 65535] & 16777215, -16777216 | class32.field361[var66.field9294[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field9302[var87];
                                if (var98 != -1) {
                                    arg2.method3775((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class354.method2090(var98, -47, var66.field9294[var88]), (float) class354.method2090(var98, -37, var66.field9294[var89]), (float) class354.method2090(var98, -11, var66.field9294[var90]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field9298; ++var99) {
                    short var100 = var66.field9300[var99];
                    short var101 = var66.field9296[var99];
                    short var102 = var66.field9292[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field9302[var99];
                        if (var109 != -1) {
                            arg2.field9458 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field9453 || var104 > arg2.field9453 || var105 > arg2.field9453;
                            arg2.method3775((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class354.method2090(var109, -113, var66.field9294[var100]), (float) class354.method2090(var109, -109, var66.field9294[var101]), (float) class354.method2090(var109, -89, var66.field9294[var102]));
                        }
                    }
                }
            }
        }
    }
}
