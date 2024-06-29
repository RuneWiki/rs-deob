import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class398 extends class282 {

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    private int field5558 = -1;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "Lgf;")
    private class279 field5563;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    private int field5547;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "[[B")
    private byte[][] field5560;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "[[B")
    private byte[][] field5553;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "F")
    private float field5542;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "F")
    private float field5543;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "F")
    private float field5546;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "F")
    private float field5548;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "F")
    private float field5549;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "F")
    private float field5550;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "F")
    private float field5554;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "F")
    private float field5555;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "F")
    private float field5556;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "F")
    private float field5557;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "F")
    private float field5559;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "F")
    private float field5561;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[[Luha;")
    private class246[][] field5544;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "[[Lvd;")
    private class38[][] field5552;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "[[Lmba;")
    private class424[][] field5551;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "[[Ldn;")
    private class518[][] field5562;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "[[Lmp;")
    private class764[][] field5545;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V", line = 3)
    public final void method1747(int arg0, int arg1) {
        this.method2339(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(III)V", line = 7)
    private final void method2339(int arg0, int arg1, int arg2) {
        class267 var4 = this.field5563.method1691(Thread.currentThread());
        var4.field3747.field8511 = 0;
        if (this.field5552 != null) {
            this.method2345(arg0, arg1, var4.field3712, var4, var4.field3747, var4.field3736, var4.field3726, var4.field3738, var4.field3730, arg2);
        } else if (this.field5551 != null) {
            this.method2343(arg0, arg1, var4.field3747, var4.field3736, var4.field3726, var4.field3738, var4.field3730, arg2);
        } else {
            if (this.field5545 != null) {
                this.method2340(arg0, arg1, var4.field3712, var4, var4.field3747, var4.field3736, var4.field3726, var4.field3738, var4.field3730, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZLmda;Lor;[I[I[I[II)V", line = 29)
    private final void method2340(int arg0, int arg1, boolean arg2, class267 arg3, class641 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class764 var11 = this.field5545[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field5558 == -1) {
                    for (int var12 = 0; var12 < var11.field10640; ++var12) {
                        int var13 = (arg0 << super.field3990) + var11.field10644[var12];
                        int var14 = var11.field10638[var12];
                        int var15 = (arg1 << super.field3990) + var11.field10643[var12];
                        float var16 = (float) var15 * this.field5555 + (float) var13 * this.field5549 + (float) var14 * this.field5557 + this.field5556;
                        if (var16 <= (float) this.field5563.field3953) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field3714);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field10642[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field3717) {
                            int var19 = (int) (var16 - (float) arg3.field3714);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field5561 + (float) var13 * this.field5554 + (float) var14 * this.field5548 + this.field5542;
                        float var21 = (float) var15 * this.field5546 + (float) var13 * this.field5543 + (float) var14 * this.field5559 + this.field5550;
                        arg5[var12] = (int) ((float) this.field5563.field3935 * var20 / var16) + arg4.field8505;
                        arg6[var12] = (int) ((float) this.field5563.field3959 * var21 / var16) + arg4.field8508;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field10640; ++var22) {
                        int var36 = (arg0 << super.field3990) + var11.field10644[var22];
                        int var37 = var11.field10638[var22];
                        int var38 = (arg1 << super.field3990) + var11.field10643[var22];
                        float var39 = (float) var38 * this.field5555 + (float) var36 * this.field5549 + (float) var37 * this.field5557 + this.field5556;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field5558 - arg3.field3714;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field10642[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field3717) {
                            int var42 = this.field5558 - arg3.field3714;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field5561 + (float) var36 * this.field5554 + (float) var37 * this.field5548 + this.field5542;
                        float var44 = (float) var38 * this.field5546 + (float) var36 * this.field5543 + (float) var37 * this.field5559 + this.field5550;
                        arg5[var22] = (int) ((float) this.field5563.field3935 * var43 / (float) this.field5558) + arg4.field8505;
                        arg6[var22] = (int) ((float) this.field5563.field3959 * var44 / (float) this.field5558) + arg4.field8508;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3989;
                for (int var24 = 0; var24 < var11.field10639; ++var24) {
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
                        arg4.field8516 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field8506 || var29 > arg4.field8506 || var30 > arg4.field8506;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3990;
                            int var35 = arg1 << super.field3990;
                            if ((var11.field10636[var25] & 16777215) != 0) {
                                if (var11.field10635[var25] == var11.field10635[var26] && var11.field10635[var25] == var11.field10635[var27] && var11.field10641[var25] == var11.field10641[var26] && var11.field10641[var25] == var11.field10641[var27]) {
                                    arg4.method3515((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field10644[var25] + var34) / (float) var11.field10641[var25], (float) (var11.field10644[var26] + var34) / (float) var11.field10641[var26], (float) (var11.field10644[var27] + var34) / (float) var11.field10641[var27], (float) (var11.field10643[var25] + var35) / (float) var11.field10641[var25], (float) (var11.field10643[var26] + var35) / (float) var11.field10641[var26], (float) (var11.field10643[var27] + var35) / (float) var11.field10641[var27], var11.field10636[var25], var11.field10636[var26], var11.field10636[var27], arg3.field3705, arg8[var25], arg8[var26], arg8[var27], var11.field10635[var25]);
                                } else {
                                    arg4.method3510((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field10644[var25] + var34) / var23, (float) (var11.field10644[var26] + var34) / var23, (float) (var11.field10644[var27] + var34) / var23, (float) (var11.field10643[var25] + var35) / var23, (float) (var11.field10643[var26] + var35) / var23, (float) (var11.field10643[var27] + var35) / var23, var11.field10636[var25], var11.field10636[var26], var11.field10636[var27], arg3.field3705, arg8[var25], arg8[var26], arg8[var27], var11.field10635[var25], var23 / (float) var11.field10641[var25], var11.field10635[var26], var23 / (float) var11.field10641[var26], var11.field10635[var27], var23 / (float) var11.field10641[var27]);
                                }
                            }
                        } else {
                            arg4.method3516((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field3705);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "fa", descriptor = "(IILr;)Lr;", line = 220)
    public final class184 method1746(int arg0, int arg1, class184 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z", line = 224)
    private final boolean method2341(int arg0) {
        if ((this.field5547 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!br", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 238)
    public final void method1739(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)I", line = 243)
    private static final int method2342(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILor;[I[I[I[II)V", line = 275)
    private final void method2343(int arg0, int arg1, class641 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class424 var9 = this.field5551[arg0][arg1];
        if (var9 != null) {
            if ((var9.field5844 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field5844 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3989 * arg0;
                int var11 = super.field3989 + var10;
                int var12 = super.field3989 * arg1;
                int var13 = super.field3989 + var12;
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
                if ((var9.field5844 & 1) != 0) {
                    int var14 = super.field3988[arg0][arg1];
                    float var15 = (float) var14 * this.field5557;
                    if (this.field5558 == -1) {
                        var16 = (float) var12 * this.field5555 + (float) var10 * this.field5549 + var15 + this.field5556;
                        if (var16 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var17 = (float) var12 * this.field5555 + (float) var11 * this.field5549 + var15 + this.field5556;
                        if (var17 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var18 = (float) var13 * this.field5555 + (float) var11 * this.field5549 + var15 + this.field5556;
                        if (var18 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var19 = (float) var13 * this.field5555 + (float) var10 * this.field5549 + var15 + this.field5556;
                        if (var19 <= (float) this.field5563.field3953) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field5555 + (float) var10 * this.field5549 + var15 + this.field5556;
                        var17 = (float) var12 * this.field5555 + (float) var11 * this.field5549 + var15 + this.field5556;
                        var18 = (float) var13 * this.field5555 + (float) var11 * this.field5549 + var15 + this.field5556;
                        var19 = (float) var13 * this.field5555 + (float) var10 * this.field5549 + var15 + this.field5556;
                    }
                    float var20 = (float) var14 * this.field5548;
                    float var21 = (float) var14 * this.field5559;
                    if (this.field5558 == -1) {
                        float var22 = (float) var12 * this.field5561 + (float) var10 * this.field5554 + var20 + this.field5542;
                        var23 = (int) ((float) this.field5563.field3935 * var22 / var16) + arg2.field8505;
                        float var24 = (float) var12 * this.field5546 + (float) var10 * this.field5543 + var21 + this.field5550;
                        var25 = (int) ((float) this.field5563.field3959 * var24 / var16) + arg2.field8508;
                        float var26 = (float) var12 * this.field5561 + (float) var11 * this.field5554 + var20 + this.field5542;
                        var27 = (int) ((float) this.field5563.field3935 * var26 / var17) + arg2.field8505;
                        float var28 = (float) var12 * this.field5546 + (float) var11 * this.field5543 + var21 + this.field5550;
                        var29 = (int) ((float) this.field5563.field3959 * var28 / var17) + arg2.field8508;
                        float var30 = (float) var13 * this.field5561 + (float) var11 * this.field5554 + var20 + this.field5542;
                        var31 = (int) ((float) this.field5563.field3935 * var30 / var18) + arg2.field8505;
                        float var32 = (float) var13 * this.field5546 + (float) var11 * this.field5543 + var21 + this.field5550;
                        var33 = (int) ((float) this.field5563.field3959 * var32 / var18) + arg2.field8508;
                        float var34 = (float) var13 * this.field5561 + (float) var10 * this.field5554 + var20 + this.field5542;
                        var35 = (int) ((float) this.field5563.field3935 * var34 / var19) + arg2.field8505;
                        float var36 = (float) var13 * this.field5546 + (float) var10 * this.field5543 + var21 + this.field5550;
                        var37 = (int) ((float) this.field5563.field3959 * var36 / var19) + arg2.field8508;
                    } else {
                        float var38 = (float) var12 * this.field5561 + (float) var10 * this.field5554 + var20 + this.field5542;
                        var23 = (int) ((float) this.field5563.field3935 * var38 / (float) this.field5558) + arg2.field8505;
                        float var39 = (float) var12 * this.field5546 + (float) var10 * this.field5543 + var21 + this.field5550;
                        var25 = (int) ((float) this.field5563.field3959 * var39 / (float) this.field5558) + arg2.field8508;
                        float var40 = (float) var12 * this.field5561 + (float) var11 * this.field5554 + var20 + this.field5542;
                        var27 = (int) ((float) this.field5563.field3935 * var40 / (float) this.field5558) + arg2.field8505;
                        float var41 = (float) var12 * this.field5546 + (float) var11 * this.field5543 + var21 + this.field5550;
                        var29 = (int) ((float) this.field5563.field3959 * var41 / (float) this.field5558) + arg2.field8508;
                        float var42 = (float) var13 * this.field5561 + (float) var11 * this.field5554 + var20 + this.field5542;
                        var31 = (int) ((float) this.field5563.field3935 * var42 / (float) this.field5558) + arg2.field8505;
                        float var43 = (float) var13 * this.field5546 + (float) var11 * this.field5543 + var21 + this.field5550;
                        var33 = (int) ((float) this.field5563.field3959 * var43 / (float) this.field5558) + arg2.field8508;
                        float var44 = (float) var13 * this.field5561 + (float) var10 * this.field5554 + var20 + this.field5542;
                        var35 = (int) ((float) this.field5563.field3935 * var44 / (float) this.field5558) + arg2.field8505;
                        float var45 = (float) var13 * this.field5546 + (float) var10 * this.field5543 + var21 + this.field5550;
                        var37 = (int) ((float) this.field5563.field3959 * var45 / (float) this.field5558) + arg2.field8508;
                    }
                } else {
                    int var46 = super.field3988[arg0][arg1];
                    int var47 = super.field3988[arg0 + 1][arg1];
                    int var48 = super.field3988[arg0 + 1][arg1 + 1];
                    int var49 = super.field3988[arg0][arg1 + 1];
                    if (this.field5558 == -1) {
                        var16 = (float) var12 * this.field5555 + (float) var10 * this.field5549 + (float) var46 * this.field5557 + this.field5556;
                        if (var16 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var17 = (float) var12 * this.field5555 + (float) var11 * this.field5549 + (float) var47 * this.field5557 + this.field5556;
                        if (var17 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var18 = (float) var13 * this.field5555 + (float) var11 * this.field5549 + (float) var48 * this.field5557 + this.field5556;
                        if (var18 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var19 = (float) var13 * this.field5555 + (float) var10 * this.field5549 + (float) var49 * this.field5557 + this.field5556;
                        if (var19 <= (float) this.field5563.field3953) {
                            return;
                        }
                        float var50 = (float) var12 * this.field5561 + (float) var10 * this.field5554 + (float) var46 * this.field5548 + this.field5542;
                        var23 = (int) ((float) this.field5563.field3935 * var50 / var16) + arg2.field8505;
                        float var51 = (float) var12 * this.field5546 + (float) var10 * this.field5543 + (float) var46 * this.field5559 + this.field5550;
                        var25 = (int) ((float) this.field5563.field3959 * var51 / var16) + arg2.field8508;
                        float var52 = (float) var12 * this.field5561 + (float) var11 * this.field5554 + (float) var47 * this.field5548 + this.field5542;
                        var27 = (int) ((float) this.field5563.field3935 * var52 / var17) + arg2.field8505;
                        float var53 = (float) var12 * this.field5546 + (float) var11 * this.field5543 + (float) var47 * this.field5559 + this.field5550;
                        var29 = (int) ((float) this.field5563.field3959 * var53 / var17) + arg2.field8508;
                        float var54 = (float) var13 * this.field5561 + (float) var11 * this.field5554 + (float) var48 * this.field5548 + this.field5542;
                        var31 = (int) ((float) this.field5563.field3935 * var54 / var18) + arg2.field8505;
                        float var55 = (float) var13 * this.field5546 + (float) var11 * this.field5543 + (float) var48 * this.field5559 + this.field5550;
                        var33 = (int) ((float) this.field5563.field3959 * var55 / var18) + arg2.field8508;
                        float var56 = (float) var13 * this.field5561 + (float) var10 * this.field5554 + (float) var49 * this.field5548 + this.field5542;
                        var35 = (int) ((float) this.field5563.field3935 * var56 / var19) + arg2.field8505;
                        float var57 = (float) var13 * this.field5546 + (float) var10 * this.field5543 + (float) var49 * this.field5559 + this.field5550;
                        var37 = (int) ((float) this.field5563.field3959 * var57 / var19) + arg2.field8508;
                    } else {
                        var16 = (float) var12 * this.field5555 + (float) var10 * this.field5549 + (float) var46 * this.field5557 + this.field5556;
                        var17 = (float) var12 * this.field5555 + (float) var11 * this.field5549 + (float) var47 * this.field5557 + this.field5556;
                        var18 = (float) var13 * this.field5555 + (float) var11 * this.field5549 + (float) var48 * this.field5557 + this.field5556;
                        var19 = (float) var13 * this.field5555 + (float) var10 * this.field5549 + (float) var49 * this.field5557 + this.field5556;
                        float var58 = (float) var12 * this.field5561 + (float) var10 * this.field5554 + (float) var46 * this.field5548 + this.field5542;
                        var23 = (int) ((float) this.field5563.field3935 * var58 / (float) this.field5558) + arg2.field8505;
                        float var59 = (float) var12 * this.field5546 + (float) var10 * this.field5543 + (float) var46 * this.field5559 + this.field5550;
                        var25 = (int) ((float) this.field5563.field3959 * var59 / (float) this.field5558) + arg2.field8508;
                        float var60 = (float) var12 * this.field5561 + (float) var11 * this.field5554 + (float) var47 * this.field5548 + this.field5542;
                        var27 = (int) ((float) this.field5563.field3935 * var60 / (float) this.field5558) + arg2.field8505;
                        float var61 = (float) var12 * this.field5546 + (float) var11 * this.field5543 + (float) var47 * this.field5559 + this.field5550;
                        var29 = (int) ((float) this.field5563.field3959 * var61 / (float) this.field5558) + arg2.field8508;
                        float var62 = (float) var13 * this.field5561 + (float) var11 * this.field5554 + (float) var48 * this.field5548 + this.field5542;
                        var31 = (int) ((float) this.field5563.field3935 * var62 / (float) this.field5558) + arg2.field8505;
                        float var63 = (float) var13 * this.field5546 + (float) var11 * this.field5543 + (float) var48 * this.field5559 + this.field5550;
                        var33 = (int) ((float) this.field5563.field3959 * var63 / (float) this.field5558) + arg2.field8508;
                        float var64 = (float) var13 * this.field5561 + (float) var10 * this.field5554 + (float) var49 * this.field5548 + this.field5542;
                        var35 = (int) ((float) this.field5563.field3935 * var64 / (float) this.field5558) + arg2.field8505;
                        float var65 = (float) var13 * this.field5546 + (float) var10 * this.field5543 + (float) var49 * this.field5559 + this.field5550;
                        var37 = (int) ((float) this.field5563.field3959 * var65 / (float) this.field5558) + arg2.field8508;
                    }
                }
                if (this.field5558 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field8516 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8506 || var35 > arg2.field8506 || var27 > arg2.field8506;
                        if (var9.field5843 >= 0) {
                            arg2.method3515((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class656.field8679[var9.field5845 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5841 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5842 & 65535] & 16777215, 0, 0, 0, 0, var9.field5843);
                        } else {
                            arg2.method3518((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5845 & 65535), (float) (var9.field5841 & 65535), (float) (var9.field5842 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field8516 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8506 || var27 > arg2.field8506 || var35 > arg2.field8506;
                        if (var9.field5843 >= 0) {
                            arg2.method3515((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class656.field8679[var9.field5840 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5842 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5841 & 65535] & 16777215, 0, 0, 0, 0, var9.field5843);
                            return;
                        }
                        arg2.method3518((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5840 & 65535), (float) (var9.field5842 & 65535), (float) (var9.field5841 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field8516 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8506 || var35 > arg2.field8506 || var27 > arg2.field8506;
                        if (var9.field5843 >= 0) {
                            arg2.method3515((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class656.field8679[var9.field5845 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5841 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5842 & 65535] & 16777215, 0, 0, 0, 0, var9.field5843);
                        } else {
                            arg2.method3518((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5845 & 65535), (float) (var9.field5841 & 65535), (float) (var9.field5842 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field8516 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8506 || var27 > arg2.field8506 || var35 > arg2.field8506;
                        if (var9.field5843 >= 0) {
                            arg2.method3515((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class656.field8679[var9.field5840 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5842 & 65535] & 16777215, -16777216 | class656.field8679[var9.field5841 & 65535] & 16777215, 0, 0, 0, 0, var9.field5843);
                            return;
                        }
                        arg2.method3518((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5840 & 65535), (float) (var9.field5842 & 65535), (float) (var9.field5841 & 65535));
                    }
                }
            }
        } else {
            class246 var66 = this.field5544[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field3425 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field5558 == -1) {
                    for (int var67 = 0; var67 < var66.field3420; ++var67) {
                        int var68 = (arg0 << super.field3990) + var66.field3428[var67];
                        short var69 = var66.field3431[var67];
                        int var70 = (arg1 << super.field3990) + var66.field3429[var67];
                        float var71 = (float) var70 * this.field5555 + (float) var68 * this.field5549 + (float) var69 * this.field5557 + this.field5556;
                        if (var71 <= (float) this.field5563.field3953) {
                            return;
                        }
                        float var72 = (float) var70 * this.field5561 + (float) var68 * this.field5554 + (float) var69 * this.field5548 + this.field5542;
                        float var73 = (float) var70 * this.field5546 + (float) var68 * this.field5543 + (float) var69 * this.field5559 + this.field5550;
                        arg3[var67] = (int) ((float) this.field5563.field3935 * var72 / var71) + arg2.field8505;
                        arg4[var67] = (int) ((float) this.field5563.field3959 * var73 / var71) + arg2.field8508;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field3420; ++var74) {
                        int var110 = (arg0 << super.field3990) + var66.field3428[var74];
                        short var111 = var66.field3431[var74];
                        int var112 = (arg1 << super.field3990) + var66.field3429[var74];
                        float var113 = (float) var112 * this.field5555 + (float) var110 * this.field5549 + (float) var111 * this.field5557 + this.field5556;
                        float var114 = (float) var112 * this.field5561 + (float) var110 * this.field5554 + (float) var111 * this.field5548 + this.field5542;
                        float var115 = (float) var112 * this.field5546 + (float) var110 * this.field5543 + (float) var111 * this.field5559 + this.field5550;
                        arg3[var74] = (int) ((float) this.field5563.field3935 * var114 / (float) this.field5558) + arg2.field8505;
                        arg4[var74] = (int) ((float) this.field5563.field3959 * var115 / (float) this.field5558) + arg2.field8508;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field3427 != null) {
                    if (this.field5558 == -1) {
                        for (int var75 = 0; var75 < var66.field3423; ++var75) {
                            short var76 = var66.field3421[var75];
                            short var77 = var66.field3430[var75];
                            short var78 = var66.field3419[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field8516 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field8506 || var80 > arg2.field8506 || var81 > arg2.field8506;
                                short var85 = var66.field3427[var75];
                                if (var85 != -1) {
                                    arg2.method3515((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field3428[var76] / (float) super.field3989, (float) var66.field3428[var77] / (float) super.field3989, (float) var66.field3428[var78] / (float) super.field3989, (float) var66.field3429[var76] / (float) super.field3989, (float) var66.field3429[var77] / (float) super.field3989, (float) var66.field3429[var78] / (float) super.field3989, -16777216 | class656.field8679[var66.field3422[var76] & 65535] & 16777215, -16777216 | class656.field8679[var66.field3422[var77] & 65535] & 16777215, -16777216 | class656.field8679[var66.field3422[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field3426[var75];
                                    if (var86 != -1) {
                                        arg2.method3518((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class257.method1564(var66.field3422[var76], var86, (byte) 80), (float) class257.method1564(var66.field3422[var77], var86, (byte) 80), (float) class257.method1564(var66.field3422[var78], var86, (byte) 80));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field3423; ++var87) {
                        short var88 = var66.field3421[var87];
                        short var89 = var66.field3430[var87];
                        short var90 = var66.field3419[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field8516 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field8506 || var92 > arg2.field8506 || var93 > arg2.field8506;
                            short var97 = var66.field3427[var87];
                            if (var97 != -1) {
                                arg2.method3515((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field3428[var88] / (float) super.field3989, (float) var66.field3428[var89] / (float) super.field3989, (float) var66.field3428[var90] / (float) super.field3989, (float) var66.field3429[var88] / (float) super.field3989, (float) var66.field3429[var89] / (float) super.field3989, (float) var66.field3429[var90] / (float) super.field3989, -16777216 | class656.field8679[var66.field3422[var88] & 65535] & 16777215, -16777216 | class656.field8679[var66.field3422[var89] & 65535] & 16777215, -16777216 | class656.field8679[var66.field3422[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field3426[var87];
                                if (var98 != -1) {
                                    arg2.method3518((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class257.method1564(var66.field3422[var88], var98, (byte) 80), (float) class257.method1564(var66.field3422[var89], var98, (byte) 80), (float) class257.method1564(var66.field3422[var90], var98, (byte) 80));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field3423; ++var99) {
                    short var100 = var66.field3421[var99];
                    short var101 = var66.field3430[var99];
                    short var102 = var66.field3419[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field3426[var99];
                        if (var109 != -1) {
                            arg2.field8516 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field8506 || var104 > arg2.field8506 || var105 > arg2.field8506;
                            arg2.method3518((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class257.method1564(var66.field3422[var100], var109, (byte) 80), (float) class257.method1564(var66.field3422[var101], var109, (byte) 80), (float) class257.method1564(var66.field3422[var102], var109, (byte) 80));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIII[[Z)V", line = 753)
    public final void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class267 var9 = this.field5563.method1691(Thread.currentThread());
        class641 var10 = var9.field3747;
        var10.field8511 = 0;
        var10.field8516 = true;
        this.field5563.method454();
        if (this.field5552 == null && this.field5545 == null) {
            if (this.field5551 != null) {
                this.method2346(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field3736, var9.field3726);
            }
        } else {
            this.method2344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field3736, var9.field3726);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 769)
    public final boolean method1740(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ltn;[I)V", line = 772)
    public final void method1736(class87 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 777)
    public final void method1734(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5551 == null) {
            this.field5551 = new class424[super.field3992][super.field3996];
            this.field5544 = new class246[super.field3992][super.field3996];
        } else if (this.field5552 != null || this.field5545 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3989 != var20 || var21 != 0 && super.field3989 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class246 var22 = new class246();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3420 = var23;
            var22.field3422 = new short[var23];
            var22.field3428 = new short[var23];
            var22.field3431 = new short[var23];
            var22.field3429 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field3422[var25] = (short) (this.field5560[arg0][arg1] - this.field5553[arg0][arg1]);
                } else if (var32 == 0 && super.field3989 == var33) {
                    var22.field3422[var25] = (short) (this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]);
                } else if (super.field3989 == var32 && super.field3989 == var33) {
                    var22.field3422[var25] = (short) (this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]);
                } else if (super.field3989 == var32 && var33 == 0) {
                    var22.field3422[var25] = (short) (this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]) * var32 + (this.field5560[arg0][arg1] - this.field5553[arg0][arg1]) * (super.field3989 - var32);
                    int var35 = (this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]) * var32 + (this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]) * (super.field3989 - var32);
                    var22.field3422[var25] = (short) ((super.field3989 - var33) * var34 + var33 * var35 >> super.field3990 * 2);
                }
                int var36 = (arg0 << super.field3990) + var32;
                int var37 = (arg1 << super.field3990) + var33;
                var22.field3428[var25] = (short) var32;
                var22.field3429[var25] = (short) var33;
                var22.field3431[var25] = (short) (this.method1750((byte) 101, var36, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3422[var25] < 2) {
                    var22.field3422[var25] = 2;
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
                    class758 var31 = this.field5563.field717.method91(var30, (byte) 126);
                    if (!var31.field10534) {
                        var26 = true;
                        if (this.method2341(var31.field10536) || var31.field10555 != 0 || var31.field10554 != 0) {
                            var22.field3425 = (byte) (var22.field3425 | 4);
                        }
                    }
                }
            }
            var22.field3426 = new int[var27];
            if (arg10 != null) {
                var22.field3424 = new int[var27];
            }
            var22.field3421 = new short[var27];
            var22.field3430 = new short[var27];
            var22.field3419 = new short[var27];
            if (var26) {
                var22.field3427 = new short[var27];
                var22.field3418 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3426[var22.field3423] = class550.method3075((byte) -125, arg9[var29]);
                    } else {
                        var22.field3426[var22.field3423] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3424[var22.field3423] = class550.method3075((byte) -118, arg10[var29]);
                        } else {
                            var22.field3424[var22.field3423] = -1;
                        }
                    }
                    var22.field3421[var22.field3423] = (short) arg6[var29];
                    var22.field3430[var22.field3423] = (short) arg7[var29];
                    var22.field3419[var22.field3423] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5563.field717.method91(arg11[var29], (byte) 124).field10534) {
                            var22.field3427[var22.field3423] = (short) arg11[var29];
                            var22.field3418[var22.field3423] = (short) arg12[var29];
                        } else {
                            var22.field3427[var22.field3423] = -1;
                        }
                    }
                    ++var22.field3423;
                }
            }
            this.field5544[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class424 var38 = new class424();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field5839 = class257.method1564(this.field5560[arg0][arg1] - this.field5553[arg0][arg1], class550.method3075((byte) -120, arg10[0]), (byte) 80);
                    if (var39 == -1) {
                        var38.field5844 = (byte) (var38.field5844 | 2);
                    }
                }
                if (super.field3988[arg0 + 1][arg1] == super.field3988[arg0][arg1] && super.field3988[arg0 + 1][arg1 + 1] == super.field3988[arg0][arg1] && super.field3988[arg0][arg1 + 1] == super.field3988[arg0][arg1]) {
                    var38.field5844 = (byte) (var38.field5844 | 1);
                }
                class758 var41 = null;
                if (var40 != -1) {
                    var41 = this.field5563.field717.method91(var40, (byte) 127);
                }
                if (var41 != null && (var38.field5844 & 2) == 0 && !var41.field10534) {
                    var38.field5840 = (short) (this.field5560[arg0][arg1] - this.field5553[arg0][arg1]);
                    var38.field5842 = (short) (this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]);
                    var38.field5845 = (short) (this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]);
                    var38.field5841 = (short) (this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]);
                    var38.field5843 = (short) var40;
                    if (this.method2341(var41.field10536) || var41.field10555 != 0 || var41.field10554 != 0) {
                        var38.field5844 = (byte) (var38.field5844 | 4);
                    }
                } else {
                    short var42 = class550.method3075((byte) -113, var39);
                    var38.field5840 = (short) class257.method1564(this.field5560[arg0][arg1] - this.field5553[arg0][arg1], var42, (byte) 80);
                    var38.field5842 = (short) class257.method1564(this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1], var42, (byte) 80);
                    var38.field5845 = (short) class257.method1564(this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1], var42, (byte) 80);
                    var38.field5841 = (short) class257.method1564(this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1], var42, (byte) 80);
                    var38.field5843 = -1;
                }
                this.field5551[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "YA", descriptor = "()V", line = 1025)
    public final void method1737() {
        this.field5560 = null;
        this.field5553 = null;
    }

    @OriginalMember(owner = "client!br", name = "ka", descriptor = "(III)V", line = 1032)
    public final void method1744(int arg0, int arg1, int arg2) {
        if (this.field5553[arg0][arg1] < arg2) {
            this.field5553[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIII[[ZLmda;Lor;[I[I)V", line = 1041)
    private final void method2344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class267 arg8, class641 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field3718;
        this.field5563.method493(false);
        arg9.field8504 = false;
        arg9.field8507 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field5552 != null) {
                        if (this.field5552[var18][var19] != null) {
                            class38 var20 = this.field5552[var18][var19];
                            if (var20.field536 != -1 && (var20.field539 & 2) == 0 && var20.field531 == 0) {
                                int var21 = this.field5563.method1689(var20.field536);
                                arg9.method3518((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class257.method1564(var20.field532, var21, (byte) 80), (float) class257.method1564(var20.field541, var21, (byte) 80), (float) class257.method1564(var20.field533, var21, (byte) 80));
                                arg9.method3518((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class257.method1564(var20.field537, var21, (byte) 80), (float) class257.method1564(var20.field533, var21, (byte) 80), (float) class257.method1564(var20.field541, var21, (byte) 80));
                            } else if (var20.field531 == 0) {
                                arg9.method3520((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field532, var20.field541, var20.field533);
                                arg9.method3520((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field537, var20.field533, var20.field541);
                            } else {
                                int var22 = var20.field531;
                                arg9.method3520((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class95.method718(var22, var20.field532 & -16777216, false), class95.method718(var22, var20.field541 & -16777216, false), class95.method718(var22, var20.field533 & -16777216, false));
                                arg9.method3520((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class95.method718(var22, var20.field537 & -16777216, false), class95.method718(var22, var20.field533 & -16777216, false), class95.method718(var22, var20.field541 & -16777216, false));
                            }
                        } else if (this.field5562[var18][var19] != null) {
                            class518 var23 = this.field5562[var18][var19];
                            for (int var24 = 0; var24 < var23.field6914; ++var24) {
                                arg10[var24] = var23.field6917[var24] * var14 / super.field3989 + var16;
                                arg11[var24] = var17 - var23.field6912[var24] * var14 / super.field3989;
                            }
                            for (int var25 = 0; var25 < var23.field6910; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field6915 != null && var23.field6915[var25] != 0 && (var23.field6913 == null || var23.field6913 != null && var23.field6913[var25] == -1)) {
                                    int var35 = var23.field6915[var25];
                                    arg9.method3520((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class95.method718(var35, -16777216 - (var23.field6919[var26] & -16777216), false), class95.method718(var35, -16777216 - (var23.field6919[var27] & -16777216), false), class95.method718(var35, -16777216 - (var23.field6919[var28] & -16777216), false));
                                } else if (var23.field6913 != null && var23.field6913[var25] != -1) {
                                    int var36 = this.field5563.method1689(var23.field6913[var25]);
                                    arg9.method3518((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method3520((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field6919[var26], var23.field6919[var27], var23.field6919[var28]);
                                }
                            }
                        }
                    } else if (this.field5545[var18][var19] != null) {
                        class764 var37 = this.field5545[var18][var19];
                        for (int var38 = 0; var38 < var37.field10640; ++var38) {
                            arg10[var38] = var37.field10644[var38] * var14 / super.field3989 + var16;
                            arg11[var38] = var17 - var37.field10643[var38] * var14 / super.field3989;
                        }
                        for (int var39 = 0; var39 < var37.field10639; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field10637 != null && var37.field10637[var39] != 0) {
                                int var49 = var37.field10637[var39];
                                arg9.method3520((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method3520((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field10636[var40], var37.field10636[var41], var37.field10636[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8504 = true;
        this.field5563.method493(var15);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IIZLmda;Lor;[I[I[I[II)V", line = 1234)
    private final void method2345(int arg0, int arg1, boolean arg2, class267 arg3, class641 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class38 var11 = this.field5552[arg0][arg1];
        if (var11 != null) {
            if ((var11.field539 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field539 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3989 * arg0;
                int var13 = super.field3989 + var12;
                int var14 = super.field3989 * arg1;
                int var15 = super.field3989 + var14;
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
                if ((var11.field539 & 1) != 0 && !arg2) {
                    int var20 = super.field3988[arg0][arg1];
                    float var21 = (float) var20 * this.field5557;
                    if (this.field5558 == -1) {
                        var22 = (float) var14 * this.field5555 + (float) var12 * this.field5549 + var21 + this.field5556;
                        if (var22 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var23 = (float) var14 * this.field5555 + (float) var13 * this.field5549 + var21 + this.field5556;
                        if (var23 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var24 = (float) var15 * this.field5555 + (float) var13 * this.field5549 + var21 + this.field5556;
                        if (var24 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var25 = (float) var15 * this.field5555 + (float) var12 * this.field5549 + var21 + this.field5556;
                        if (var25 <= (float) this.field5563.field3953) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field5555 + (float) var12 * this.field5549 + var21 + this.field5556;
                        var23 = (float) var14 * this.field5555 + (float) var13 * this.field5549 + var21 + this.field5556;
                        var24 = (float) var15 * this.field5555 + (float) var13 * this.field5549 + var21 + this.field5556;
                        var25 = (float) var15 * this.field5555 + (float) var12 * this.field5549 + var21 + this.field5556;
                    }
                    if (arg3.field3717) {
                        int var26 = (int) (var22 - (float) arg3.field3714);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field3714);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field3714);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field3714);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field5548;
                    float var31 = (float) var20 * this.field5559;
                    if (this.field5558 == -1) {
                        float var32 = (float) var14 * this.field5561 + (float) var12 * this.field5554 + var30 + this.field5542;
                        var33 = (int) ((float) this.field5563.field3935 * var32 / var22) + arg4.field8505;
                        float var34 = (float) var14 * this.field5546 + (float) var12 * this.field5543 + var31 + this.field5550;
                        var35 = (int) ((float) this.field5563.field3959 * var34 / var22) + arg4.field8508;
                        float var36 = (float) var14 * this.field5561 + (float) var13 * this.field5554 + var30 + this.field5542;
                        var37 = (int) ((float) this.field5563.field3935 * var36 / var23) + arg4.field8505;
                        float var38 = (float) var14 * this.field5546 + (float) var13 * this.field5543 + var31 + this.field5550;
                        var39 = (int) ((float) this.field5563.field3959 * var38 / var23) + arg4.field8508;
                        float var40 = (float) var15 * this.field5561 + (float) var13 * this.field5554 + var30 + this.field5542;
                        var41 = (int) ((float) this.field5563.field3935 * var40 / var24) + arg4.field8505;
                        float var42 = (float) var15 * this.field5546 + (float) var13 * this.field5543 + var31 + this.field5550;
                        var43 = (int) ((float) this.field5563.field3959 * var42 / var24) + arg4.field8508;
                        float var44 = (float) var15 * this.field5561 + (float) var12 * this.field5554 + var30 + this.field5542;
                        var45 = (int) ((float) this.field5563.field3935 * var44 / var25) + arg4.field8505;
                        float var46 = (float) var15 * this.field5546 + (float) var12 * this.field5543 + var31 + this.field5550;
                        var47 = (int) ((float) this.field5563.field3959 * var46 / var25) + arg4.field8508;
                    } else {
                        float var48 = (float) var14 * this.field5561 + (float) var12 * this.field5554 + var30 + this.field5542;
                        var33 = (int) ((float) this.field5563.field3935 * var48 / (float) this.field5558) + arg4.field8505;
                        float var49 = (float) var14 * this.field5546 + (float) var12 * this.field5543 + var31 + this.field5550;
                        var35 = (int) ((float) this.field5563.field3959 * var49 / (float) this.field5558) + arg4.field8508;
                        float var50 = (float) var14 * this.field5561 + (float) var13 * this.field5554 + var30 + this.field5542;
                        var37 = (int) ((float) this.field5563.field3935 * var50 / (float) this.field5558) + arg4.field8505;
                        float var51 = (float) var14 * this.field5546 + (float) var13 * this.field5543 + var31 + this.field5550;
                        var39 = (int) ((float) this.field5563.field3959 * var51 / (float) this.field5558) + arg4.field8508;
                        float var52 = (float) var15 * this.field5561 + (float) var13 * this.field5554 + var30 + this.field5542;
                        var41 = (int) ((float) this.field5563.field3935 * var52 / (float) this.field5558) + arg4.field8505;
                        float var53 = (float) var15 * this.field5546 + (float) var13 * this.field5543 + var31 + this.field5550;
                        var43 = (int) ((float) this.field5563.field3959 * var53 / (float) this.field5558) + arg4.field8508;
                        float var54 = (float) var15 * this.field5561 + (float) var12 * this.field5554 + var30 + this.field5542;
                        var45 = (int) ((float) this.field5563.field3935 * var54 / (float) this.field5558) + arg4.field8505;
                        float var55 = (float) var15 * this.field5546 + (float) var12 * this.field5543 + var31 + this.field5550;
                        var47 = (int) ((float) this.field5563.field3959 * var55 / (float) this.field5558) + arg4.field8508;
                    }
                } else {
                    int var56 = super.field3988[arg0][arg1];
                    int var57 = super.field3988[arg0 + 1][arg1];
                    int var58 = super.field3988[arg0 + 1][arg1 + 1];
                    int var59 = super.field3988[arg0][arg1 + 1];
                    if (this.field5558 == -1) {
                        var22 = (float) var14 * this.field5555 + (float) var12 * this.field5549 + (float) var56 * this.field5557 + this.field5556;
                        if (var22 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var23 = (float) var14 * this.field5555 + (float) var13 * this.field5549 + (float) var57 * this.field5557 + this.field5556;
                        if (var23 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var24 = (float) var15 * this.field5555 + (float) var13 * this.field5549 + (float) var58 * this.field5557 + this.field5556;
                        if (var24 <= (float) this.field5563.field3953) {
                            return;
                        }
                        var25 = (float) var15 * this.field5555 + (float) var12 * this.field5549 + (float) var59 * this.field5557 + this.field5556;
                        if (var25 <= (float) this.field5563.field3953) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field5555 + (float) var12 * this.field5549 + (float) var56 * this.field5557 + this.field5556;
                        var23 = (float) var14 * this.field5555 + (float) var13 * this.field5549 + (float) var57 * this.field5557 + this.field5556;
                        var24 = (float) var15 * this.field5555 + (float) var13 * this.field5549 + (float) var58 * this.field5557 + this.field5556;
                        var25 = (float) var15 * this.field5555 + (float) var12 * this.field5549 + (float) var59 * this.field5557 + this.field5556;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field3714);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field540 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field3714);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field538 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field3714);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field534 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field3714);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field535 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field3717) {
                        int var68 = (int) (var22 - (float) arg3.field3714);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field3714);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field3714);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field3714);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field5558 == -1) {
                        float var72 = (float) var14 * this.field5561 + (float) var12 * this.field5554 + (float) var56 * this.field5548 + this.field5542;
                        var33 = (int) ((float) this.field5563.field3935 * var72 / var22) + arg4.field8505;
                        float var73 = (float) var14 * this.field5546 + (float) var12 * this.field5543 + (float) var56 * this.field5559 + this.field5550;
                        var35 = (int) ((float) this.field5563.field3959 * var73 / var22) + arg4.field8508;
                        float var74 = (float) var14 * this.field5561 + (float) var13 * this.field5554 + (float) var57 * this.field5548 + this.field5542;
                        var37 = (int) ((float) this.field5563.field3935 * var74 / var23) + arg4.field8505;
                        float var75 = (float) var14 * this.field5546 + (float) var13 * this.field5543 + (float) var57 * this.field5559 + this.field5550;
                        var39 = (int) ((float) this.field5563.field3959 * var75 / var23) + arg4.field8508;
                        float var76 = (float) var15 * this.field5561 + (float) var13 * this.field5554 + (float) var58 * this.field5548 + this.field5542;
                        var41 = (int) ((float) this.field5563.field3935 * var76 / var24) + arg4.field8505;
                        float var77 = (float) var15 * this.field5546 + (float) var13 * this.field5543 + (float) var58 * this.field5559 + this.field5550;
                        var43 = (int) ((float) this.field5563.field3959 * var77 / var24) + arg4.field8508;
                        float var78 = (float) var15 * this.field5561 + (float) var12 * this.field5554 + (float) var59 * this.field5548 + this.field5542;
                        var45 = (int) ((float) this.field5563.field3935 * var78 / var25) + arg4.field8505;
                        float var79 = (float) var15 * this.field5546 + (float) var12 * this.field5543 + (float) var59 * this.field5559 + this.field5550;
                        var47 = (int) ((float) this.field5563.field3959 * var79 / var25) + arg4.field8508;
                    } else {
                        float var80 = (float) var14 * this.field5561 + (float) var12 * this.field5554 + (float) var56 * this.field5548 + this.field5542;
                        var33 = (int) ((float) this.field5563.field3935 * var80 / (float) this.field5558) + arg4.field8505;
                        float var81 = (float) var14 * this.field5546 + (float) var12 * this.field5543 + (float) var56 * this.field5559 + this.field5550;
                        var35 = (int) ((float) this.field5563.field3959 * var81 / (float) this.field5558) + arg4.field8508;
                        float var82 = (float) var14 * this.field5561 + (float) var13 * this.field5554 + (float) var57 * this.field5548 + this.field5542;
                        var37 = (int) ((float) this.field5563.field3935 * var82 / (float) this.field5558) + arg4.field8505;
                        float var83 = (float) var14 * this.field5546 + (float) var13 * this.field5543 + (float) var57 * this.field5559 + this.field5550;
                        var39 = (int) ((float) this.field5563.field3959 * var83 / (float) this.field5558) + arg4.field8508;
                        float var84 = (float) var15 * this.field5561 + (float) var13 * this.field5554 + (float) var58 * this.field5548 + this.field5542;
                        var41 = (int) ((float) this.field5563.field3935 * var84 / (float) this.field5558) + arg4.field8505;
                        float var85 = (float) var15 * this.field5546 + (float) var13 * this.field5543 + (float) var58 * this.field5559 + this.field5550;
                        var43 = (int) ((float) this.field5563.field3959 * var85 / (float) this.field5558) + arg4.field8508;
                        float var86 = (float) var15 * this.field5561 + (float) var12 * this.field5554 + (float) var59 * this.field5548 + this.field5542;
                        var45 = (int) ((float) this.field5563.field3935 * var86 / (float) this.field5558) + arg4.field8505;
                        float var87 = (float) var15 * this.field5546 + (float) var12 * this.field5543 + (float) var59 * this.field5559 + this.field5550;
                        var47 = (int) ((float) this.field5563.field3959 * var87 / (float) this.field5558) + arg4.field8508;
                    }
                }
                boolean var88 = var11.field536 != -1 && this.method2341(this.field5563.field717.method91(var11.field536, (byte) 125).field10536);
                if (this.field5558 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field8516 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8506 || var45 > arg4.field8506 || var37 > arg4.field8506;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field536 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method3515((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field532 & 16777215, var90 | var11.field541 & 16777215, var90 | var11.field533 & 16777215, arg3.field3705, var18, var19, var17, var11.field536);
                                } else {
                                    if (var88) {
                                        arg4.field8511 = 100;
                                    }
                                    arg4.method3520((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class95.method718(var11.field532, var18 << 24 | arg3.field3705, false), class95.method718(var11.field541, var19 << 24 | arg3.field3705, false), class95.method718(var11.field533, var17 << 24 | arg3.field3705, false));
                                    arg4.field8511 = 0;
                                }
                            } else if (var11.field536 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method3515((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field532 & 16777215, var91 | var11.field541 & 16777215, var91 | var11.field533 & 16777215, 0, 0, 0, 0, var11.field536);
                            } else {
                                if (var88) {
                                    arg4.field8511 = 100;
                                }
                                arg4.method3520((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field532, var11.field541, var11.field533);
                                arg4.field8511 = 0;
                            }
                        } else {
                            arg4.method3516((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field3705);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field8516 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8506 || var37 > arg4.field8506 || var45 > arg4.field8506;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field8511 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field536 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method3515((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field537 & 16777215, var93 | var11.field533 & 16777215, var93 | var11.field541 & 16777215, arg3.field3705, var16, var17, var19, var11.field536);
                                    return;
                                }
                                if (var88) {
                                    arg4.field8511 = 100;
                                }
                                arg4.method3520((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class95.method718(var11.field537, var16 << 24 | arg3.field3705, false), class95.method718(var11.field533, var17 << 24 | arg3.field3705, false), class95.method718(var11.field541, var19 << 24 | arg3.field3705, false));
                                arg4.field8511 = 0;
                                return;
                            }
                            if (var11.field536 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method3515((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field537 & 16777215, var94 | var11.field533 & 16777215, var94 | var11.field541 & 16777215, 0, 0, 0, 0, var11.field536);
                                return;
                            }
                            if (var88) {
                                arg4.field8511 = 100;
                            }
                            arg4.method3520((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field537, var11.field533, var11.field541);
                            arg4.field8511 = 0;
                            return;
                        }
                        arg4.method3516((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field3705);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field8516 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8506 || var45 > arg4.field8506 || var37 > arg4.field8506;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field8511 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field536 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method3515((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field532 & 16777215, var96 | var11.field541 & 16777215, var96 | var11.field533 & 16777215, arg3.field3705, var18, var19, var17, var11.field536);
                                } else {
                                    if (var88) {
                                        arg4.field8511 = 100;
                                    }
                                    arg4.method3520((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class95.method718(var11.field532, var18 << 24 | arg3.field3705, false), class95.method718(var11.field541, var19 << 24 | arg3.field3705, false), class95.method718(var11.field533, var17 << 24 | arg3.field3705, false));
                                    arg4.field8511 = 0;
                                }
                            } else if (var11.field536 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method3515((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field532 & 16777215, var97 | var11.field541 & 16777215, var97 | var11.field533 & 16777215, 0, 0, 0, 0, var11.field536);
                            } else {
                                if (var88) {
                                    arg4.field8511 = 100;
                                }
                                arg4.method3520((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field532, var11.field541, var11.field533);
                                arg4.field8511 = 0;
                            }
                        } else {
                            arg4.method3516((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field3705);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field8516 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8506 || var37 > arg4.field8506 || var45 > arg4.field8506;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field8511 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field536 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method3515((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field537 & 16777215, var99 | var11.field533 & 16777215, var99 | var11.field541 & 16777215, arg3.field3705, var16, var17, var19, var11.field536);
                                    return;
                                }
                                if (var88) {
                                    arg4.field8511 = 100;
                                }
                                arg4.method3520((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class95.method718(var11.field537, var16 << 24 | arg3.field3705, false), class95.method718(var11.field533, var17 << 24 | arg3.field3705, false), class95.method718(var11.field541, var19 << 24 | arg3.field3705, false));
                                arg4.field8511 = 0;
                                return;
                            }
                            if (var11.field536 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method3515((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field537 & 16777215, var100 | var11.field533 & 16777215, var100 | var11.field541 & 16777215, 0, 0, 0, 0, var11.field536);
                                return;
                            }
                            if (var88) {
                                arg4.field8511 = 100;
                            }
                            arg4.method3520((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field537, var11.field533, var11.field541);
                            arg4.field8511 = 0;
                            return;
                        }
                        arg4.method3516((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field3705);
                    }
                }
            }
        } else {
            class518 var101 = this.field5562[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field6918 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field5558 == -1) {
                    for (int var102 = 0; var102 < var101.field6914; ++var102) {
                        int var103 = (arg0 << super.field3990) + var101.field6917[var102];
                        int var104 = var101.field6911[var102];
                        int var105 = (arg1 << super.field3990) + var101.field6912[var102];
                        float var106 = (float) var105 * this.field5555 + (float) var103 * this.field5549 + (float) var104 * this.field5557 + this.field5556;
                        if (var106 <= (float) this.field5563.field3953) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field3714);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field6916[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field3717) {
                            int var109 = (int) (var106 - (float) arg3.field3714);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field5561 + (float) var103 * this.field5554 + (float) var104 * this.field5548 + this.field5542;
                        float var111 = (float) var105 * this.field5546 + (float) var103 * this.field5543 + (float) var104 * this.field5559 + this.field5550;
                        arg5[var102] = (int) ((float) this.field5563.field3935 * var110 / var106) + arg4.field8505;
                        arg6[var102] = (int) ((float) this.field5563.field3959 * var111 / var106) + arg4.field8508;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field6914; ++var112) {
                        int var152 = (arg0 << super.field3990) + var101.field6917[var112];
                        int var153 = var101.field6911[var112];
                        int var154 = (arg1 << super.field3990) + var101.field6912[var112];
                        float var155 = (float) var154 * this.field5555 + (float) var152 * this.field5549 + (float) var153 * this.field5557 + this.field5556;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field5558 - arg3.field3714;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field6916[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field3717) {
                            int var158 = this.field5558 - arg3.field3714;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field5561 + (float) var152 * this.field5554 + (float) var153 * this.field5548 + this.field5542;
                        float var160 = (float) var154 * this.field5546 + (float) var152 * this.field5543 + (float) var153 * this.field5559 + this.field5550;
                        arg5[var112] = (int) ((float) this.field5563.field3935 * var159 / (float) this.field5558) + arg4.field8505;
                        arg6[var112] = (int) ((float) this.field5563.field3959 * var160 / (float) this.field5558) + arg4.field8508;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field6913 != null) {
                    if (this.field5558 == -1) {
                        for (int var113 = 0; var113 < var101.field6910; ++var113) {
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
                                arg4.field8516 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field8506 || var118 > arg4.field8506 || var119 > arg4.field8506;
                                short var124 = var101.field6913[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method2341(this.field5563.field717.method91(var124, (byte) 125).field10536)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method3515((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field6917[var114] / (float) super.field3989, (float) var101.field6917[var115] / (float) super.field3989, (float) var101.field6917[var116] / (float) super.field3989, (float) var101.field6912[var114] / (float) super.field3989, (float) var101.field6912[var115] / (float) super.field3989, (float) var101.field6912[var116] / (float) super.field3989, var125 | var101.field6919[var114] & 16777215, var125 | var101.field6919[var115] & 16777215, var125 | var101.field6919[var116] & 16777215, arg3.field3705, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field6919[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method2341(this.field5563.field717.method91(var124, (byte) 124).field10536)) {
                                                arg4.field8511 = -1694498816;
                                            }
                                            arg4.method3520((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class95.method718(var101.field6919[var114], arg8[var114] << 24 | arg3.field3705, false), class95.method718(var101.field6919[var115], arg8[var115] << 24 | arg3.field3705, false), class95.method718(var101.field6919[var116], arg8[var116] << 24 | arg3.field3705, false));
                                            arg4.field8511 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method2341(this.field5563.field717.method91(var124, (byte) 126).field10536)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method3515((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field6917[var114] / (float) super.field3989, (float) var101.field6917[var115] / (float) super.field3989, (float) var101.field6917[var116] / (float) super.field3989, (float) var101.field6912[var114] / (float) super.field3989, (float) var101.field6912[var115] / (float) super.field3989, (float) var101.field6912[var116] / (float) super.field3989, var126 | var101.field6919[var114] & 16777215, var126 | var101.field6919[var115] & 16777215, var126 | var101.field6919[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field6919[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method2341(this.field5563.field717.method91(var124, (byte) 124).field10536)) {
                                            arg4.field8511 = -1694498816;
                                        }
                                        arg4.method3520((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field6919[var114], var101.field6919[var115], var101.field6919[var116]);
                                        arg4.field8511 = 0;
                                    }
                                } else {
                                    arg4.method3516((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field3705);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field6910; ++var127) {
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
                            arg4.field8516 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field8506 || var132 > arg4.field8506 || var133 > arg4.field8506;
                            short var138 = var101.field6913[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method2341(this.field5563.field717.method91(var138, (byte) 124).field10536)) {
                                    arg4.field8511 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method2341(this.field5563.field717.method91(var138, (byte) 126).field10536)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method3515((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field6917[var128] / (float) super.field3989, (float) var101.field6917[var129] / (float) super.field3989, (float) var101.field6917[var130] / (float) super.field3989, (float) var101.field6912[var128] / (float) super.field3989, (float) var101.field6912[var129] / (float) super.field3989, (float) var101.field6912[var130] / (float) super.field3989, var139 | var101.field6919[var128] & 16777215, var139 | var101.field6919[var129] & 16777215, var139 | var101.field6919[var130] & 16777215, arg3.field3705, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field6919[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method2341(this.field5563.field717.method91(var138, (byte) 126).field10536)) {
                                            arg4.field8511 = -1694498816;
                                        }
                                        arg4.method3520((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class95.method718(var101.field6919[var128], arg8[var128] << 24 | arg3.field3705, false), class95.method718(var101.field6919[var129], arg8[var129] << 24 | arg3.field3705, false), class95.method718(var101.field6919[var130], arg8[var130] << 24 | arg3.field3705, false));
                                        arg4.field8511 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method2341(this.field5563.field717.method91(var138, (byte) 126).field10536)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method3515((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field6917[var128] / (float) super.field3989, (float) var101.field6917[var129] / (float) super.field3989, (float) var101.field6917[var130] / (float) super.field3989, (float) var101.field6912[var128] / (float) super.field3989, (float) var101.field6912[var129] / (float) super.field3989, (float) var101.field6912[var130] / (float) super.field3989, var140 | var101.field6919[var128] & 16777215, var140 | var101.field6919[var129] & 16777215, var140 | var101.field6919[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field6919[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method2341(this.field5563.field717.method91(var138, (byte) 126).field10536)) {
                                        arg4.field8511 = -1694498816;
                                    }
                                    arg4.method3520((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field6919[var128], var101.field6919[var129], var101.field6919[var130]);
                                    arg4.field8511 = 0;
                                }
                                arg4.field8511 = 0;
                            } else {
                                arg4.method3516((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field3705);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field6910; ++var141) {
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
                        arg4.field8516 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field8506 || var146 > arg4.field8506 || var147 > arg4.field8506;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field6919[var142] & 16777215) != 0) {
                                    arg4.method3520((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class448.method2564(var101.field6919[var142], arg8[var142], (byte) 117, arg3.field3705), class448.method2564(var101.field6919[var143], arg8[var143], (byte) 77, arg3.field3705), class448.method2564(var101.field6919[var144], arg8[var144], (byte) 83, arg3.field3705));
                                }
                            } else if ((var101.field6919[var142] & 16777215) != 0) {
                                arg4.method3520((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field6919[var142], var101.field6919[var143], var101.field6919[var144]);
                            }
                        } else {
                            arg4.method3516((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field3705);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 2221)
    public final void method1748(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III[[ZZII)V", line = 2226)
    public final void method1741(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class395 var8 = this.field5563.field3944;
        this.field5558 = arg5;
        this.field5554 = var8.field5509;
        this.field5548 = var8.field5501;
        this.field5561 = var8.field5504;
        this.field5542 = var8.field5507;
        this.field5543 = var8.field5523;
        this.field5559 = var8.field5519;
        this.field5546 = var8.field5518;
        this.field5550 = var8.field5498;
        this.field5549 = var8.field5515;
        this.field5557 = var8.field5513;
        this.field5555 = var8.field5520;
        this.field5556 = var8.field5496;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3992 && var12 >= 0 && var12 < super.field3996) {
                        this.method2339(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lgf;IIII[[I[[II)V", line = 2274)
    public class398(class279 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5563 = arg0;
        this.field5547 = arg2;
        this.field5560 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5563.field3968 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5563.field3951 * var18 + this.field5563.field3954 * var16 + this.field5563.field3940 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5560[var11][var10] = (byte) var20;
            }
        }
        this.field5553 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!br", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 2328)
    public final void method1735(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field5547 & 32) == 0;
        if (this.field5552 == null && !var15) {
            this.field5552 = new class38[super.field3992][super.field3996];
            this.field5562 = new class518[super.field3992][super.field3996];
        } else if (this.field5545 == null && var15) {
            this.field5545 = new class764[super.field3992][super.field3996];
        } else if (this.field5551 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class656.field8679[class550.method3075((byte) -113, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class656.field8679[class550.method3075((byte) -107, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class764 var18 = new class764();
                var18.field10640 = (short) arg2.length;
                var18.field10639 = (short) (arg2.length / 3);
                var18.field10644 = new short[var18.field10640];
                var18.field10638 = new short[var18.field10640];
                var18.field10643 = new short[var18.field10640];
                var18.field10636 = new int[var18.field10640];
                var18.field10635 = new short[var18.field10640];
                var18.field10641 = new short[var18.field10640];
                var18.field10645 = new byte[var18.field10640];
                if (arg5 != null) {
                    var18.field10642 = new short[var18.field10640];
                }
                for (int var19 = 0; var19 < var18.field10640; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field5560[arg0][arg1] - this.field5553[arg0][arg1];
                    } else if (var22 == 0 && super.field3989 == var23) {
                        var25 = this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1];
                    } else if (super.field3989 == var22 && super.field3989 == var23) {
                        var25 = this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1];
                    } else if (super.field3989 == var22 && var23 == 0) {
                        var25 = this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]) * var22 + (this.field5560[arg0][arg1] - this.field5553[arg0][arg1]) * (super.field3989 - var22);
                        int var27 = (this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]) * var22 + (this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]) * (super.field3989 - var22);
                        var25 = (super.field3989 - var23) * var26 + var23 * var27 >> super.field3990 * 2;
                    }
                    int var28 = (arg0 << super.field3990) + var22;
                    int var29 = (arg1 << super.field3990) + var23;
                    var18.field10644[var19] = (short) var22;
                    var18.field10643[var19] = (short) var23;
                    var18.field10638[var19] = (short) (this.method1750((byte) 103, var28, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field10636[var19] = 0;
                        if (arg7 != null) {
                            var18.field10645[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field10642[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method2341(this.field5563.field717.method91(arg8[var19], (byte) 126).field10536)) {
                            var32 = -1694498816;
                        }
                        var18.field10636[var19] = var32 | class448.method2564(method2342(arg6[var19] >> 8, var25), var30, (byte) 123, arg10);
                        if (arg7 != null) {
                            var18.field10645[var19] = (byte) var25;
                        }
                    }
                    var18.field10635[var19] = (short) arg8[var19];
                    var18.field10641[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field10637 = new int[var18.field10639];
                }
                for (int var20 = 0; var20 < var18.field10639; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field10637[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field5545[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field3989 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3989 && arg4[var38] == super.field3989) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3989) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3989 != arg2[var40] && arg2[0] - super.field3989 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3989 != arg4[var40] && arg4[0] - super.field3989 != arg4[var40]) {
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
                    class38 var41 = new class38();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field531 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field539 = (byte) (var41.field539 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3988[arg0 + 1][arg1] == super.field3988[arg0][arg1] && super.field3988[arg0 + 1][arg1 + 1] == super.field3988[arg0][arg1] && super.field3988[arg0][arg1 + 1] == super.field3988[arg0][arg1]) {
                        var41.field539 = (byte) (var41.field539 | 1);
                    }
                    if (var43 != -1 && (var41.field539 & 2) == 0 && !this.field5563.field717.method91(var43, (byte) 124).field10534) {
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
                        var41.field537 = class448.method2564(method2342(arg6[var34] >> 8, this.field5560[arg0][arg1] - this.field5553[arg0][arg1]), var44, (byte) 98, arg10);
                        if (var41.field531 != 0) {
                            var41.field537 |= 255 - (this.field5560[arg0][arg1] - this.field5553[arg0][arg1]) << 25;
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
                        var41.field533 = class448.method2564(method2342(arg6[var35] >> 8, this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]), var45, (byte) 63, arg10);
                        if (var41.field531 != 0) {
                            var41.field533 |= 255 - (this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]) << 25;
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
                        var41.field532 = class448.method2564(method2342(arg6[var36] >> 8, this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]), var46, (byte) 101, arg10);
                        if (var41.field531 != 0) {
                            var41.field532 |= 255 - (this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field541 = class448.method2564(method2342(arg6[var37] >> 8, this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]), var47, (byte) 95, arg10);
                        var41.field536 = (short) var43;
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
                        var41.field537 = class448.method2564(method2342(arg6[var34] >> 8, this.field5560[arg0][arg1] - this.field5553[arg0][arg1]), var48, (byte) 57, arg10);
                        if (var41.field531 != 0) {
                            var41.field537 |= 255 - (this.field5560[arg0][arg1] - this.field5553[arg0][arg1]) << 25;
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
                        var41.field533 = class448.method2564(method2342(arg6[var35] >> 8, this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]), var49, (byte) 123, arg10);
                        if (var41.field531 != 0) {
                            var41.field533 |= 255 - (this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]) << 25;
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
                        var41.field532 = class448.method2564(method2342(arg6[var36] >> 8, this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]), var50, (byte) 97, arg10);
                        if (var41.field531 != 0) {
                            var41.field532 |= 255 - (this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field541 = class448.method2564(method2342(arg6[var37] >> 8, this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]), var51, (byte) 109, arg10);
                        if (var41.field531 != 0) {
                            var41.field541 |= 255 - (this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]) << 25;
                        }
                        var41.field536 = -1;
                    }
                    if (arg5 != null) {
                        var41.field534 = (short) arg5[var36];
                        var41.field535 = (short) arg5[var37];
                        var41.field538 = (short) arg5[var35];
                        var41.field540 = (short) arg5[var34];
                    }
                    this.field5552[arg0][arg1] = var41;
                } else {
                    class518 var52 = new class518();
                    var52.field6914 = (short) arg2.length;
                    var52.field6910 = (short) (arg2.length / 3);
                    var52.field6917 = new short[var52.field6914];
                    var52.field6911 = new short[var52.field6914];
                    var52.field6912 = new short[var52.field6914];
                    var52.field6919 = new int[var52.field6914];
                    if (arg5 != null) {
                        var52.field6916 = new short[var52.field6914];
                    }
                    for (int var53 = 0; var53 < var52.field6914; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field5560[arg0][arg1] - this.field5553[arg0][arg1];
                        } else if (var68 == 0 && super.field3989 == var69) {
                            var71 = this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1];
                        } else if (super.field3989 == var68 && super.field3989 == var69) {
                            var71 = this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1];
                        } else if (super.field3989 == var68 && var69 == 0) {
                            var71 = this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field5560[arg0 + 1][arg1] - this.field5553[arg0 + 1][arg1]) * var68 + (this.field5560[arg0][arg1] - this.field5553[arg0][arg1]) * (super.field3989 - var68);
                            int var73 = (this.field5560[arg0 + 1][arg1 + 1] - this.field5553[arg0 + 1][arg1 + 1]) * var68 + (this.field5560[arg0][arg1 + 1] - this.field5553[arg0][arg1 + 1]) * (super.field3989 - var68);
                            var71 = (super.field3989 - var69) * var72 + var69 * var73 >> super.field3990 * 2;
                        }
                        int var74 = (arg0 << super.field3990) + var68;
                        int var75 = (arg1 << super.field3990) + var69;
                        var52.field6917[var53] = (short) var68;
                        var52.field6912[var53] = (short) var69;
                        var52.field6911[var53] = (short) (this.method1750((byte) 110, var74, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field6919[var53] = var71 << 25;
                            } else {
                                var52.field6919[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field6916[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field6919[var53] = class448.method2564(method2342(arg6[var53] >> 8, var71), var76, (byte) 80, arg10);
                            if (arg7 != null) {
                                var52.field6919[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field6910; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field5563.field717.method91(arg8[var55 * 3], (byte) 127).field10534) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field6915 = new int[var52.field6910];
                    }
                    if (var54) {
                        var52.field6913 = new short[var52.field6910];
                        var52.field6909 = new short[var52.field6910];
                    }
                    for (int var56 = 0; var56 < var52.field6910; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field6915[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field5563.field717.method91(var62, (byte) 124).field10534) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field5563.field717.method91(var63, (byte) 125).field10534) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field5563.field717.method91(var64, (byte) 127).field10534) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field6913[var56] = (short) var64;
                                var52.field6909[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field5563.field717.method91(var65, (byte) 126).field10534) {
                                        var52.field6919[var57] = class656.field8679[class550.method3075((byte) -128, this.field5563.field717.method91(var65, (byte) 127).field10546 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field5563.field717.method91(var66, (byte) 125).field10534) {
                                        var52.field6919[var58] = class656.field8679[class550.method3075((byte) -118, this.field5563.field717.method91(var66, (byte) 126).field10546 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field5563.field717.method91(var67, (byte) 125).field10534) {
                                        var52.field6919[var59] = class656.field8679[class550.method3075((byte) -127, this.field5563.field717.method91(var67, (byte) 126).field10546 & 65535) & 65535];
                                    }
                                }
                                var52.field6913[var56] = -1;
                            }
                        }
                    }
                    this.field5562[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IIIIIII[[ZLmda;Lor;[I[I)V", line = 3026)
    private final void method2346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class267 arg8, class641 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field3718;
        this.field5563.method493(false);
        arg9.field8504 = false;
        arg9.field8507 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field5551[var18][var19] != null) {
                        class424 var20 = this.field5551[var18][var19];
                        if (var20.field5843 != -1 && (var20.field5844 & 2) == 0 && var20.field5839 == -1) {
                            int var21 = this.field5563.method1689(var20.field5843);
                            arg9.method3518((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class257.method1564(var20.field5845 & 65535, var21, (byte) 80), (float) class257.method1564(var20.field5841 & 65535, var21, (byte) 80), (float) class257.method1564(var20.field5842 & 65535, var21, (byte) 80));
                            arg9.method3518((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class257.method1564(var20.field5840 & 65535, var21, (byte) 80), (float) class257.method1564(var20.field5842 & 65535, var21, (byte) 80), (float) class257.method1564(var20.field5841 & 65535, var21, (byte) 80));
                        } else if (var20.field5839 == -1) {
                            arg9.method3518((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field5845 & 65535), (float) (var20.field5841 & 65535), (float) (var20.field5842 & 65535));
                            arg9.method3518((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field5840 & 65535), (float) (var20.field5842 & 65535), (float) (var20.field5841 & 65535));
                        } else {
                            int var22 = var20.field5839;
                            arg9.method3518((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method3518((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field5544[var18][var19] != null) {
                        class246 var23 = this.field5544[var18][var19];
                        for (int var24 = 0; var24 < var23.field3420; ++var24) {
                            arg10[var24] = var23.field3428[var24] * var14 / super.field3989 + var16;
                            arg11[var24] = var17 - var23.field3429[var24] * var14 / super.field3989;
                        }
                        for (int var25 = 0; var25 < var23.field3423; ++var25) {
                            short var26 = var23.field3421[var25];
                            short var27 = var23.field3430[var25];
                            short var28 = var23.field3419[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field3424 != null && var23.field3424[var25] != -1) {
                                int var35 = var23.field3424[var25];
                                arg9.method3518((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class257.method1564(var23.field3422[var26], var35, (byte) 80), (float) class257.method1564(var23.field3422[var27], var35, (byte) 80), (float) class257.method1564(var23.field3422[var28], var35, (byte) 80));
                            } else if (var23.field3427 != null && var23.field3427[var25] != -1) {
                                int var36 = this.field5563.method1689(var23.field3427[var25]);
                                arg9.method3518((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class257.method1564(var23.field3422[var26], var36, (byte) 80), (float) class257.method1564(var23.field3422[var27], var36, (byte) 80), (float) class257.method1564(var23.field3422[var28], var36, (byte) 80));
                            } else {
                                int var37 = var23.field3426[var25];
                                arg9.method3518((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class257.method1564(var23.field3422[var26], var37, (byte) 80), (float) class257.method1564(var23.field3422[var27], var37, (byte) 80), (float) class257.method1564(var23.field3422[var28], var37, (byte) 80));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8504 = true;
        this.field5563.method493(var15);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III[[ZZI)V", line = 3162)
    public final void method1749(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class395 var7 = this.field5563.field3944;
        this.field5558 = -1;
        this.field5554 = var7.field5509;
        this.field5548 = var7.field5501;
        this.field5561 = var7.field5504;
        this.field5542 = var7.field5507;
        this.field5543 = var7.field5523;
        this.field5559 = var7.field5519;
        this.field5546 = var7.field5518;
        this.field5550 = var7.field5498;
        this.field5549 = var7.field5515;
        this.field5557 = var7.field5513;
        this.field5555 = var7.field5520;
        this.field5556 = var7.field5496;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3992 && var11 >= 0 && var11 < super.field3996) {
                        this.method2339(var10, var11, arg5);
                    }
                }
            }
        }
    }
}
