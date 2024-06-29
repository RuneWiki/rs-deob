import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class589 extends class293 {

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
    private int field8549 = -1;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "Lfba;")
    private class24 field8534;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    private int field8543;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "[[B")
    private byte[][] field8537;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "[[B")
    private byte[][] field8544;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "F")
    private float field8531;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "F")
    private float field8532;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "F")
    private float field8533;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "F")
    private float field8535;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "F")
    private float field8538;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "F")
    private float field8540;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "F")
    private float field8541;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "F")
    private float field8542;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "F")
    private float field8545;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "F")
    private float field8548;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "F")
    private float field8550;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "F")
    private float field8551;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "[[Lvr;")
    private class144[][] field8536;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "[[Lsc;")
    private class367[][] field8539;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "[[Laha;")
    private class402[][] field8530;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "[[Lum;")
    private class552[][] field8547;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "[[Lcf;")
    private class631[][] field8546;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)V", line = 4)
    private final void method4324(int arg0, int arg1, int arg2) {
        class539 var4 = this.field8534.method230(Thread.currentThread());
        var4.field7946.field8193 = 0;
        if (this.field8546 != null) {
            this.method4329(arg0, arg1, var4.field7909, var4, var4.field7946, var4.field7947, var4.field7940, var4.field7918, var4.field7936, arg2);
        } else if (this.field8530 != null) {
            this.method4327(arg0, arg1, var4.field7946, var4.field7947, var4.field7940, var4.field7918, var4.field7936, arg2);
        } else {
            if (this.field8547 != null) {
                this.method4325(arg0, arg1, var4.field7909, var4, var4.field7946, var4.field7947, var4.field7940, var4.field7918, var4.field7936, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIZLjq;Lbf;[I[I[I[II)V", line = 21)
    private final void method4325(int arg0, int arg1, boolean arg2, class539 arg3, class564 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class552 var11 = this.field8547[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field8549 == -1) {
                    for (int var12 = 0; var12 < var11.field8087; ++var12) {
                        int var13 = (arg0 << super.field4706) + var11.field8094[var12];
                        int var14 = var11.field8088[var12];
                        int var15 = (arg1 << super.field4706) + var11.field8096[var12];
                        float var16 = (float) var15 * this.field8532 + (float) var13 * this.field8548 + (float) var14 * this.field8545 + this.field8541;
                        if (var16 <= (float) this.field8534.field245) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7904);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field8095[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7903) {
                            int var19 = (int) (var16 - (float) arg3.field7904);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field8531 + (float) var13 * this.field8542 + (float) var14 * this.field8551 + this.field8533;
                        float var21 = (float) var15 * this.field8538 + (float) var13 * this.field8540 + (float) var14 * this.field8550 + this.field8535;
                        arg5[var12] = (int) ((float) this.field8534.field253 * var20 / var16) + arg4.field8197;
                        arg6[var12] = (int) ((float) this.field8534.field261 * var21 / var16) + arg4.field8204;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field8087; ++var22) {
                        int var36 = (arg0 << super.field4706) + var11.field8094[var22];
                        int var37 = var11.field8088[var22];
                        int var38 = (arg1 << super.field4706) + var11.field8096[var22];
                        float var39 = (float) var38 * this.field8532 + (float) var36 * this.field8548 + (float) var37 * this.field8545 + this.field8541;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field8549 - arg3.field7904;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field8095[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7903) {
                            int var42 = this.field8549 - arg3.field7904;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field8531 + (float) var36 * this.field8542 + (float) var37 * this.field8551 + this.field8533;
                        float var44 = (float) var38 * this.field8538 + (float) var36 * this.field8540 + (float) var37 * this.field8550 + this.field8535;
                        arg5[var22] = (int) ((float) this.field8534.field253 * var43 / (float) this.field8549) + arg4.field8197;
                        arg6[var22] = (int) ((float) this.field8534.field261 * var44 / (float) this.field8549) + arg4.field8204;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field4702;
                for (int var24 = 0; var24 < var11.field8089; ++var24) {
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
                        arg4.field8205 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field8192 || var29 > arg4.field8192 || var30 > arg4.field8192;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field4706;
                            int var35 = arg1 << super.field4706;
                            if ((var11.field8093[var25] & 16777215) != 0) {
                                if (var11.field8090[var25] == var11.field8090[var26] && var11.field8090[var25] == var11.field8090[var27] && var11.field8092[var25] == var11.field8092[var26] && var11.field8092[var25] == var11.field8092[var27]) {
                                    arg4.method4156((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field8094[var25] + var34) / (float) var11.field8092[var25], (float) (var11.field8094[var26] + var34) / (float) var11.field8092[var26], (float) (var11.field8094[var27] + var34) / (float) var11.field8092[var27], (float) (var11.field8096[var25] + var35) / (float) var11.field8092[var25], (float) (var11.field8096[var26] + var35) / (float) var11.field8092[var26], (float) (var11.field8096[var27] + var35) / (float) var11.field8092[var27], var11.field8093[var25], var11.field8093[var26], var11.field8093[var27], arg3.field7902, arg8[var25], arg8[var26], arg8[var27], var11.field8090[var25]);
                                } else {
                                    arg4.method4144((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field8094[var25] + var34) / var23, (float) (var11.field8094[var26] + var34) / var23, (float) (var11.field8094[var27] + var34) / var23, (float) (var11.field8096[var25] + var35) / var23, (float) (var11.field8096[var26] + var35) / var23, (float) (var11.field8096[var27] + var35) / var23, var11.field8093[var25], var11.field8093[var26], var11.field8093[var27], arg3.field7902, arg8[var25], arg8[var26], arg8[var27], var11.field8090[var25], var23 / (float) var11.field8092[var25], var11.field8090[var26], var23 / (float) var11.field8092[var26], var11.field8090[var27], var23 / (float) var11.field8092[var27]);
                                }
                            }
                        } else {
                            arg4.method4148((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7902);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Z", line = 211)
    private final boolean method4326(int arg0) {
        if ((this.field8543 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILbf;[I[I[I[II)V", line = 228)
    private final void method4327(int arg0, int arg1, class564 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class402 var9 = this.field8530[arg0][arg1];
        if (var9 != null) {
            if ((var9.field6339 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field6339 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field4702 * arg0;
                int var11 = super.field4702 + var10;
                int var12 = super.field4702 * arg1;
                int var13 = super.field4702 + var12;
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
                if ((var9.field6339 & 1) != 0) {
                    int var14 = super.field4700[arg0][arg1];
                    float var15 = (float) var14 * this.field8545;
                    if (this.field8549 == -1) {
                        var16 = (float) var12 * this.field8532 + (float) var10 * this.field8548 + var15 + this.field8541;
                        if (var16 <= (float) this.field8534.field245) {
                            return;
                        }
                        var17 = (float) var12 * this.field8532 + (float) var11 * this.field8548 + var15 + this.field8541;
                        if (var17 <= (float) this.field8534.field245) {
                            return;
                        }
                        var18 = (float) var13 * this.field8532 + (float) var11 * this.field8548 + var15 + this.field8541;
                        if (var18 <= (float) this.field8534.field245) {
                            return;
                        }
                        var19 = (float) var13 * this.field8532 + (float) var10 * this.field8548 + var15 + this.field8541;
                        if (var19 <= (float) this.field8534.field245) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field8532 + (float) var10 * this.field8548 + var15 + this.field8541;
                        var17 = (float) var12 * this.field8532 + (float) var11 * this.field8548 + var15 + this.field8541;
                        var18 = (float) var13 * this.field8532 + (float) var11 * this.field8548 + var15 + this.field8541;
                        var19 = (float) var13 * this.field8532 + (float) var10 * this.field8548 + var15 + this.field8541;
                    }
                    float var20 = (float) var14 * this.field8551;
                    float var21 = (float) var14 * this.field8550;
                    if (this.field8549 == -1) {
                        float var22 = (float) var12 * this.field8531 + (float) var10 * this.field8542 + var20 + this.field8533;
                        var23 = (int) ((float) this.field8534.field253 * var22 / var16) + arg2.field8197;
                        float var24 = (float) var12 * this.field8538 + (float) var10 * this.field8540 + var21 + this.field8535;
                        var25 = (int) ((float) this.field8534.field261 * var24 / var16) + arg2.field8204;
                        float var26 = (float) var12 * this.field8531 + (float) var11 * this.field8542 + var20 + this.field8533;
                        var27 = (int) ((float) this.field8534.field253 * var26 / var17) + arg2.field8197;
                        float var28 = (float) var12 * this.field8538 + (float) var11 * this.field8540 + var21 + this.field8535;
                        var29 = (int) ((float) this.field8534.field261 * var28 / var17) + arg2.field8204;
                        float var30 = (float) var13 * this.field8531 + (float) var11 * this.field8542 + var20 + this.field8533;
                        var31 = (int) ((float) this.field8534.field253 * var30 / var18) + arg2.field8197;
                        float var32 = (float) var13 * this.field8538 + (float) var11 * this.field8540 + var21 + this.field8535;
                        var33 = (int) ((float) this.field8534.field261 * var32 / var18) + arg2.field8204;
                        float var34 = (float) var13 * this.field8531 + (float) var10 * this.field8542 + var20 + this.field8533;
                        var35 = (int) ((float) this.field8534.field253 * var34 / var19) + arg2.field8197;
                        float var36 = (float) var13 * this.field8538 + (float) var10 * this.field8540 + var21 + this.field8535;
                        var37 = (int) ((float) this.field8534.field261 * var36 / var19) + arg2.field8204;
                    } else {
                        float var38 = (float) var12 * this.field8531 + (float) var10 * this.field8542 + var20 + this.field8533;
                        var23 = (int) ((float) this.field8534.field253 * var38 / (float) this.field8549) + arg2.field8197;
                        float var39 = (float) var12 * this.field8538 + (float) var10 * this.field8540 + var21 + this.field8535;
                        var25 = (int) ((float) this.field8534.field261 * var39 / (float) this.field8549) + arg2.field8204;
                        float var40 = (float) var12 * this.field8531 + (float) var11 * this.field8542 + var20 + this.field8533;
                        var27 = (int) ((float) this.field8534.field253 * var40 / (float) this.field8549) + arg2.field8197;
                        float var41 = (float) var12 * this.field8538 + (float) var11 * this.field8540 + var21 + this.field8535;
                        var29 = (int) ((float) this.field8534.field261 * var41 / (float) this.field8549) + arg2.field8204;
                        float var42 = (float) var13 * this.field8531 + (float) var11 * this.field8542 + var20 + this.field8533;
                        var31 = (int) ((float) this.field8534.field253 * var42 / (float) this.field8549) + arg2.field8197;
                        float var43 = (float) var13 * this.field8538 + (float) var11 * this.field8540 + var21 + this.field8535;
                        var33 = (int) ((float) this.field8534.field261 * var43 / (float) this.field8549) + arg2.field8204;
                        float var44 = (float) var13 * this.field8531 + (float) var10 * this.field8542 + var20 + this.field8533;
                        var35 = (int) ((float) this.field8534.field253 * var44 / (float) this.field8549) + arg2.field8197;
                        float var45 = (float) var13 * this.field8538 + (float) var10 * this.field8540 + var21 + this.field8535;
                        var37 = (int) ((float) this.field8534.field261 * var45 / (float) this.field8549) + arg2.field8204;
                    }
                } else {
                    int var46 = super.field4700[arg0][arg1];
                    int var47 = super.field4700[arg0 + 1][arg1];
                    int var48 = super.field4700[arg0 + 1][arg1 + 1];
                    int var49 = super.field4700[arg0][arg1 + 1];
                    if (this.field8549 == -1) {
                        var16 = (float) var12 * this.field8532 + (float) var10 * this.field8548 + (float) var46 * this.field8545 + this.field8541;
                        if (var16 <= (float) this.field8534.field245) {
                            return;
                        }
                        var17 = (float) var12 * this.field8532 + (float) var11 * this.field8548 + (float) var47 * this.field8545 + this.field8541;
                        if (var17 <= (float) this.field8534.field245) {
                            return;
                        }
                        var18 = (float) var13 * this.field8532 + (float) var11 * this.field8548 + (float) var48 * this.field8545 + this.field8541;
                        if (var18 <= (float) this.field8534.field245) {
                            return;
                        }
                        var19 = (float) var13 * this.field8532 + (float) var10 * this.field8548 + (float) var49 * this.field8545 + this.field8541;
                        if (var19 <= (float) this.field8534.field245) {
                            return;
                        }
                        float var50 = (float) var12 * this.field8531 + (float) var10 * this.field8542 + (float) var46 * this.field8551 + this.field8533;
                        var23 = (int) ((float) this.field8534.field253 * var50 / var16) + arg2.field8197;
                        float var51 = (float) var12 * this.field8538 + (float) var10 * this.field8540 + (float) var46 * this.field8550 + this.field8535;
                        var25 = (int) ((float) this.field8534.field261 * var51 / var16) + arg2.field8204;
                        float var52 = (float) var12 * this.field8531 + (float) var11 * this.field8542 + (float) var47 * this.field8551 + this.field8533;
                        var27 = (int) ((float) this.field8534.field253 * var52 / var17) + arg2.field8197;
                        float var53 = (float) var12 * this.field8538 + (float) var11 * this.field8540 + (float) var47 * this.field8550 + this.field8535;
                        var29 = (int) ((float) this.field8534.field261 * var53 / var17) + arg2.field8204;
                        float var54 = (float) var13 * this.field8531 + (float) var11 * this.field8542 + (float) var48 * this.field8551 + this.field8533;
                        var31 = (int) ((float) this.field8534.field253 * var54 / var18) + arg2.field8197;
                        float var55 = (float) var13 * this.field8538 + (float) var11 * this.field8540 + (float) var48 * this.field8550 + this.field8535;
                        var33 = (int) ((float) this.field8534.field261 * var55 / var18) + arg2.field8204;
                        float var56 = (float) var13 * this.field8531 + (float) var10 * this.field8542 + (float) var49 * this.field8551 + this.field8533;
                        var35 = (int) ((float) this.field8534.field253 * var56 / var19) + arg2.field8197;
                        float var57 = (float) var13 * this.field8538 + (float) var10 * this.field8540 + (float) var49 * this.field8550 + this.field8535;
                        var37 = (int) ((float) this.field8534.field261 * var57 / var19) + arg2.field8204;
                    } else {
                        var16 = (float) var12 * this.field8532 + (float) var10 * this.field8548 + (float) var46 * this.field8545 + this.field8541;
                        var17 = (float) var12 * this.field8532 + (float) var11 * this.field8548 + (float) var47 * this.field8545 + this.field8541;
                        var18 = (float) var13 * this.field8532 + (float) var11 * this.field8548 + (float) var48 * this.field8545 + this.field8541;
                        var19 = (float) var13 * this.field8532 + (float) var10 * this.field8548 + (float) var49 * this.field8545 + this.field8541;
                        float var58 = (float) var12 * this.field8531 + (float) var10 * this.field8542 + (float) var46 * this.field8551 + this.field8533;
                        var23 = (int) ((float) this.field8534.field253 * var58 / (float) this.field8549) + arg2.field8197;
                        float var59 = (float) var12 * this.field8538 + (float) var10 * this.field8540 + (float) var46 * this.field8550 + this.field8535;
                        var25 = (int) ((float) this.field8534.field261 * var59 / (float) this.field8549) + arg2.field8204;
                        float var60 = (float) var12 * this.field8531 + (float) var11 * this.field8542 + (float) var47 * this.field8551 + this.field8533;
                        var27 = (int) ((float) this.field8534.field253 * var60 / (float) this.field8549) + arg2.field8197;
                        float var61 = (float) var12 * this.field8538 + (float) var11 * this.field8540 + (float) var47 * this.field8550 + this.field8535;
                        var29 = (int) ((float) this.field8534.field261 * var61 / (float) this.field8549) + arg2.field8204;
                        float var62 = (float) var13 * this.field8531 + (float) var11 * this.field8542 + (float) var48 * this.field8551 + this.field8533;
                        var31 = (int) ((float) this.field8534.field253 * var62 / (float) this.field8549) + arg2.field8197;
                        float var63 = (float) var13 * this.field8538 + (float) var11 * this.field8540 + (float) var48 * this.field8550 + this.field8535;
                        var33 = (int) ((float) this.field8534.field261 * var63 / (float) this.field8549) + arg2.field8204;
                        float var64 = (float) var13 * this.field8531 + (float) var10 * this.field8542 + (float) var49 * this.field8551 + this.field8533;
                        var35 = (int) ((float) this.field8534.field253 * var64 / (float) this.field8549) + arg2.field8197;
                        float var65 = (float) var13 * this.field8538 + (float) var10 * this.field8540 + (float) var49 * this.field8550 + this.field8535;
                        var37 = (int) ((float) this.field8534.field261 * var65 / (float) this.field8549) + arg2.field8204;
                    }
                }
                if (this.field8549 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field8205 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8192 || var35 > arg2.field8192 || var27 > arg2.field8192;
                        if (var9.field6341 >= 0) {
                            arg2.method4156((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class200.field3161[var9.field6340 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6337 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6343 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                        } else {
                            arg2.method4145((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field6340 & 65535), (float) (var9.field6337 & 65535), (float) (var9.field6343 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field8205 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8192 || var27 > arg2.field8192 || var35 > arg2.field8192;
                        if (var9.field6341 >= 0) {
                            arg2.method4156((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class200.field3161[var9.field6342 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6343 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6337 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                            return;
                        }
                        arg2.method4145((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field6342 & 65535), (float) (var9.field6343 & 65535), (float) (var9.field6337 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field8205 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8192 || var35 > arg2.field8192 || var27 > arg2.field8192;
                        if (var9.field6341 >= 0) {
                            arg2.method4156((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class200.field3161[var9.field6340 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6337 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6343 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                        } else {
                            arg2.method4145((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field6340 & 65535), (float) (var9.field6337 & 65535), (float) (var9.field6343 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field8205 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8192 || var27 > arg2.field8192 || var35 > arg2.field8192;
                        if (var9.field6341 >= 0) {
                            arg2.method4156((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class200.field3161[var9.field6342 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6343 & 65535] & 16777215, -16777216 | class200.field3161[var9.field6337 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                            return;
                        }
                        arg2.method4145((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field6342 & 65535), (float) (var9.field6343 & 65535), (float) (var9.field6337 & 65535));
                    }
                }
            }
        } else {
            class144 var66 = this.field8536[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field2046 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field8549 == -1) {
                    for (int var67 = 0; var67 < var66.field2042; ++var67) {
                        int var68 = (arg0 << super.field4706) + var66.field2038[var67];
                        short var69 = var66.field2036[var67];
                        int var70 = (arg1 << super.field4706) + var66.field2037[var67];
                        float var71 = (float) var70 * this.field8532 + (float) var68 * this.field8548 + (float) var69 * this.field8545 + this.field8541;
                        if (var71 <= (float) this.field8534.field245) {
                            return;
                        }
                        float var72 = (float) var70 * this.field8531 + (float) var68 * this.field8542 + (float) var69 * this.field8551 + this.field8533;
                        float var73 = (float) var70 * this.field8538 + (float) var68 * this.field8540 + (float) var69 * this.field8550 + this.field8535;
                        arg3[var67] = (int) ((float) this.field8534.field253 * var72 / var71) + arg2.field8197;
                        arg4[var67] = (int) ((float) this.field8534.field261 * var73 / var71) + arg2.field8204;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field2042; ++var74) {
                        int var110 = (arg0 << super.field4706) + var66.field2038[var74];
                        short var111 = var66.field2036[var74];
                        int var112 = (arg1 << super.field4706) + var66.field2037[var74];
                        float var113 = (float) var112 * this.field8532 + (float) var110 * this.field8548 + (float) var111 * this.field8545 + this.field8541;
                        float var114 = (float) var112 * this.field8531 + (float) var110 * this.field8542 + (float) var111 * this.field8551 + this.field8533;
                        float var115 = (float) var112 * this.field8538 + (float) var110 * this.field8540 + (float) var111 * this.field8550 + this.field8535;
                        arg3[var74] = (int) ((float) this.field8534.field253 * var114 / (float) this.field8549) + arg2.field8197;
                        arg4[var74] = (int) ((float) this.field8534.field261 * var115 / (float) this.field8549) + arg2.field8204;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field2034 != null) {
                    if (this.field8549 == -1) {
                        for (int var75 = 0; var75 < var66.field2044; ++var75) {
                            short var76 = var66.field2041[var75];
                            short var77 = var66.field2033[var75];
                            short var78 = var66.field2045[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field8205 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field8192 || var80 > arg2.field8192 || var81 > arg2.field8192;
                                short var85 = var66.field2034[var75];
                                if (var85 != -1) {
                                    arg2.method4156((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field2038[var76] / (float) super.field4702, (float) var66.field2038[var77] / (float) super.field4702, (float) var66.field2038[var78] / (float) super.field4702, (float) var66.field2037[var76] / (float) super.field4702, (float) var66.field2037[var77] / (float) super.field4702, (float) var66.field2037[var78] / (float) super.field4702, -16777216 | class200.field3161[var66.field2040[var76] & 65535] & 16777215, -16777216 | class200.field3161[var66.field2040[var77] & 65535] & 16777215, -16777216 | class200.field3161[var66.field2040[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field2039[var75];
                                    if (var86 != -1) {
                                        arg2.method4145((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class112.method1023(var66.field2040[var76], var86, (byte) -79), (float) class112.method1023(var66.field2040[var77], var86, (byte) -79), (float) class112.method1023(var66.field2040[var78], var86, (byte) -79));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field2044; ++var87) {
                        short var88 = var66.field2041[var87];
                        short var89 = var66.field2033[var87];
                        short var90 = var66.field2045[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field8205 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field8192 || var92 > arg2.field8192 || var93 > arg2.field8192;
                            short var97 = var66.field2034[var87];
                            if (var97 != -1) {
                                arg2.method4156((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field2038[var88] / (float) super.field4702, (float) var66.field2038[var89] / (float) super.field4702, (float) var66.field2038[var90] / (float) super.field4702, (float) var66.field2037[var88] / (float) super.field4702, (float) var66.field2037[var89] / (float) super.field4702, (float) var66.field2037[var90] / (float) super.field4702, -16777216 | class200.field3161[var66.field2040[var88] & 65535] & 16777215, -16777216 | class200.field3161[var66.field2040[var89] & 65535] & 16777215, -16777216 | class200.field3161[var66.field2040[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field2039[var87];
                                if (var98 != -1) {
                                    arg2.method4145((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class112.method1023(var66.field2040[var88], var98, (byte) -79), (float) class112.method1023(var66.field2040[var89], var98, (byte) -79), (float) class112.method1023(var66.field2040[var90], var98, (byte) -79));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field2044; ++var99) {
                    short var100 = var66.field2041[var99];
                    short var101 = var66.field2033[var99];
                    short var102 = var66.field2045[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field2039[var99];
                        if (var109 != -1) {
                            arg2.field8205 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field8192 || var104 > arg2.field8192 || var105 > arg2.field8192;
                            arg2.method4145((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class112.method1023(var66.field2040[var100], var109, (byte) -79), (float) class112.method1023(var66.field2040[var101], var109, (byte) -79), (float) class112.method1023(var66.field2040[var102], var109, (byte) -79));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[[ZZI)V", line = 709)
    public final void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class714 var7 = this.field8534.field231;
        this.field8549 = -1;
        this.field8542 = var7.field10339;
        this.field8551 = var7.field10338;
        this.field8531 = var7.field10340;
        this.field8533 = var7.field10331;
        this.field8540 = var7.field10315;
        this.field8550 = var7.field10333;
        this.field8538 = var7.field10343;
        this.field8535 = var7.field10327;
        this.field8548 = var7.field10328;
        this.field8545 = var7.field10334;
        this.field8532 = var7.field10330;
        this.field8541 = var7.field10319;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field4704 && var11 >= 0 && var11 < super.field4697) {
                        this.method4324(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIIIIII[[ZLjq;Lbf;[I[I)V", line = 755)
    private final void method4328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class539 arg8, class564 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7908;
        this.field8534.method265(false);
        arg9.field8198 = false;
        arg9.field8201 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field8546 != null) {
                        if (this.field8546[var18][var19] != null) {
                            class631 var20 = this.field8546[var18][var19];
                            if (var20.field9064 != -1 && (var20.field9073 & 2) == 0 && var20.field9068 == 0) {
                                int var21 = this.field8534.method188(var20.field9064);
                                arg9.method4145((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class112.method1023(var20.field9069, var21, (byte) -79), (float) class112.method1023(var20.field9072, var21, (byte) -79), (float) class112.method1023(var20.field9071, var21, (byte) -79));
                                arg9.method4145((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class112.method1023(var20.field9074, var21, (byte) -79), (float) class112.method1023(var20.field9071, var21, (byte) -79), (float) class112.method1023(var20.field9072, var21, (byte) -79));
                            } else if (var20.field9068 == 0) {
                                arg9.method4147((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field9069, var20.field9072, var20.field9071);
                                arg9.method4147((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field9074, var20.field9071, var20.field9072);
                            } else {
                                int var22 = var20.field9068;
                                arg9.method4147((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class276.method2368(true, var20.field9069 & -16777216, var22), class276.method2368(true, var20.field9072 & -16777216, var22), class276.method2368(true, var20.field9071 & -16777216, var22));
                                arg9.method4147((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class276.method2368(true, var20.field9074 & -16777216, var22), class276.method2368(true, var20.field9071 & -16777216, var22), class276.method2368(true, var20.field9072 & -16777216, var22));
                            }
                        } else if (this.field8539[var18][var19] != null) {
                            class367 var23 = this.field8539[var18][var19];
                            for (int var24 = 0; var24 < var23.field5972; ++var24) {
                                arg10[var24] = var23.field5977[var24] * var14 / super.field4702 + var16;
                                arg11[var24] = var17 - var23.field5973[var24] * var14 / super.field4702;
                            }
                            for (int var25 = 0; var25 < var23.field5970; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field5974 != null && var23.field5974[var25] != 0 && (var23.field5976 == null || var23.field5976 != null && var23.field5976[var25] == -1)) {
                                    int var35 = var23.field5974[var25];
                                    arg9.method4147((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class276.method2368(true, -16777216 - (var23.field5968[var26] & -16777216), var35), class276.method2368(true, -16777216 - (var23.field5968[var27] & -16777216), var35), class276.method2368(true, -16777216 - (var23.field5968[var28] & -16777216), var35));
                                } else if (var23.field5976 != null && var23.field5976[var25] != -1) {
                                    int var36 = this.field8534.method188(var23.field5976[var25]);
                                    arg9.method4145((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method4147((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field5968[var26], var23.field5968[var27], var23.field5968[var28]);
                                }
                            }
                        }
                    } else if (this.field8547[var18][var19] != null) {
                        class552 var37 = this.field8547[var18][var19];
                        for (int var38 = 0; var38 < var37.field8087; ++var38) {
                            arg10[var38] = var37.field8094[var38] * var14 / super.field4702 + var16;
                            arg11[var38] = var17 - var37.field8096[var38] * var14 / super.field4702;
                        }
                        for (int var39 = 0; var39 < var37.field8089; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field8091 != null && var37.field8091[var39] != 0) {
                                int var49 = var37.field8091[var39];
                                arg9.method4147((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method4147((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field8093[var40], var37.field8093[var41], var37.field8093[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8198 = true;
        this.field8534.method265(var15);
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lfba;IIII[[I[[II)V", line = 948)
    public class589(class24 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field8534 = arg0;
        this.field8543 = arg2;
        this.field8537 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field8534.field232 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field8534.field250 * var18 + this.field8534.field259 * var17 + this.field8534.field251 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field8537[var11][var10] = (byte) var20;
            }
        }
        this.field8544 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 998)
    public final boolean method716(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!pu", name = "ka", descriptor = "(III)V", line = 1002)
    public final void method706(int arg0, int arg1, int arg2) {
        if (this.field8544[arg0][arg1] < arg2) {
            this.field8544[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1008)
    public final void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field8530 == null) {
            this.field8530 = new class402[super.field4704][super.field4697];
            this.field8536 = new class144[super.field4704][super.field4697];
        } else if (this.field8546 != null || this.field8547 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field4702 != var20 || var21 != 0 && super.field4702 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class144 var22 = new class144();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field2042 = var23;
            var22.field2040 = new short[var23];
            var22.field2038 = new short[var23];
            var22.field2036 = new short[var23];
            var22.field2037 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field2040[var25] = (short) (this.field8537[arg0][arg1] - this.field8544[arg0][arg1]);
                } else if (var32 == 0 && super.field4702 == var33) {
                    var22.field2040[var25] = (short) (this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]);
                } else if (super.field4702 == var32 && super.field4702 == var33) {
                    var22.field2040[var25] = (short) (this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]);
                } else if (super.field4702 == var32 && var33 == 0) {
                    var22.field2040[var25] = (short) (this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]) * var32 + (this.field8537[arg0][arg1] - this.field8544[arg0][arg1]) * (super.field4702 - var32);
                    int var35 = (this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]) * var32 + (this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]) * (super.field4702 - var32);
                    var22.field2040[var25] = (short) ((super.field4702 - var33) * var34 + var33 * var35 >> super.field4706 * 2);
                }
                int var36 = (arg0 << super.field4706) + var32;
                int var37 = (arg1 << super.field4706) + var33;
                var22.field2038[var25] = (short) var32;
                var22.field2037[var25] = (short) var33;
                var22.field2036[var25] = (short) (this.method2497((byte) -124, var36, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field2040[var25] < 2) {
                    var22.field2040[var25] = 2;
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
                    class304 var31 = this.field8534.field864.method1419(var30, -89);
                    if (!var31.field4890) {
                        var26 = true;
                        if (this.method4326(var31.field4913) || var31.field4899 != 0 || var31.field4902 != 0) {
                            var22.field2046 = (byte) (var22.field2046 | 4);
                        }
                    }
                }
            }
            var22.field2039 = new int[var27];
            if (arg10 != null) {
                var22.field2035 = new int[var27];
            }
            var22.field2041 = new short[var27];
            var22.field2033 = new short[var27];
            var22.field2045 = new short[var27];
            if (var26) {
                var22.field2034 = new short[var27];
                var22.field2043 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field2039[var22.field2044] = class545.method4049(arg9[var29], 125);
                    } else {
                        var22.field2039[var22.field2044] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field2035[var22.field2044] = class545.method4049(arg10[var29], 30);
                        } else {
                            var22.field2035[var22.field2044] = -1;
                        }
                    }
                    var22.field2041[var22.field2044] = (short) arg6[var29];
                    var22.field2033[var22.field2044] = (short) arg7[var29];
                    var22.field2045[var22.field2044] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field8534.field864.method1419(arg11[var29], -122).field4890) {
                            var22.field2034[var22.field2044] = (short) arg11[var29];
                            var22.field2043[var22.field2044] = (short) arg12[var29];
                        } else {
                            var22.field2034[var22.field2044] = -1;
                        }
                    }
                    ++var22.field2044;
                }
            }
            this.field8536[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class402 var38 = new class402();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field6338 = class112.method1023(this.field8537[arg0][arg1] - this.field8544[arg0][arg1], class545.method4049(arg10[0], 115), (byte) -79);
                    if (var39 == -1) {
                        var38.field6339 = (byte) (var38.field6339 | 2);
                    }
                }
                if (super.field4700[arg0 + 1][arg1] == super.field4700[arg0][arg1] && super.field4700[arg0 + 1][arg1 + 1] == super.field4700[arg0][arg1] && super.field4700[arg0][arg1 + 1] == super.field4700[arg0][arg1]) {
                    var38.field6339 = (byte) (var38.field6339 | 1);
                }
                class304 var41 = null;
                if (var40 != -1) {
                    var41 = this.field8534.field864.method1419(var40, -119);
                }
                if (var41 != null && (var38.field6339 & 2) == 0 && !var41.field4890) {
                    var38.field6342 = (short) (this.field8537[arg0][arg1] - this.field8544[arg0][arg1]);
                    var38.field6343 = (short) (this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]);
                    var38.field6340 = (short) (this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]);
                    var38.field6337 = (short) (this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]);
                    var38.field6341 = (short) var40;
                    if (this.method4326(var41.field4913) || var41.field4899 != 0 || var41.field4902 != 0) {
                        var38.field6339 = (byte) (var38.field6339 | 4);
                    }
                } else {
                    short var42 = class545.method4049(var39, 92);
                    var38.field6342 = (short) class112.method1023(this.field8537[arg0][arg1] - this.field8544[arg0][arg1], var42, (byte) -79);
                    var38.field6343 = (short) class112.method1023(this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1], var42, (byte) -79);
                    var38.field6340 = (short) class112.method1023(this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1], var42, (byte) -79);
                    var38.field6337 = (short) class112.method1023(this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1], var42, (byte) -79);
                    var38.field6341 = -1;
                }
                this.field8530[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V", line = 1256)
    public final void method700(int arg0, int arg1) {
        this.method4324(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZLjq;Lbf;[I[I[I[II)V", line = 1263)
    private final void method4329(int arg0, int arg1, boolean arg2, class539 arg3, class564 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class631 var11 = this.field8546[arg0][arg1];
        if (var11 != null) {
            if ((var11.field9073 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field9073 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field4702 * arg0;
                int var13 = super.field4702 + var12;
                int var14 = super.field4702 * arg1;
                int var15 = super.field4702 + var14;
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
                if ((var11.field9073 & 1) != 0 && !arg2) {
                    int var20 = super.field4700[arg0][arg1];
                    float var21 = (float) var20 * this.field8545;
                    if (this.field8549 == -1) {
                        var22 = (float) var14 * this.field8532 + (float) var12 * this.field8548 + var21 + this.field8541;
                        if (var22 <= (float) this.field8534.field245) {
                            return;
                        }
                        var23 = (float) var14 * this.field8532 + (float) var13 * this.field8548 + var21 + this.field8541;
                        if (var23 <= (float) this.field8534.field245) {
                            return;
                        }
                        var24 = (float) var15 * this.field8532 + (float) var13 * this.field8548 + var21 + this.field8541;
                        if (var24 <= (float) this.field8534.field245) {
                            return;
                        }
                        var25 = (float) var15 * this.field8532 + (float) var12 * this.field8548 + var21 + this.field8541;
                        if (var25 <= (float) this.field8534.field245) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field8532 + (float) var12 * this.field8548 + var21 + this.field8541;
                        var23 = (float) var14 * this.field8532 + (float) var13 * this.field8548 + var21 + this.field8541;
                        var24 = (float) var15 * this.field8532 + (float) var13 * this.field8548 + var21 + this.field8541;
                        var25 = (float) var15 * this.field8532 + (float) var12 * this.field8548 + var21 + this.field8541;
                    }
                    if (arg3.field7903) {
                        int var26 = (int) (var22 - (float) arg3.field7904);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7904);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7904);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7904);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field8551;
                    float var31 = (float) var20 * this.field8550;
                    if (this.field8549 == -1) {
                        float var32 = (float) var14 * this.field8531 + (float) var12 * this.field8542 + var30 + this.field8533;
                        var33 = (int) ((float) this.field8534.field253 * var32 / var22) + arg4.field8197;
                        float var34 = (float) var14 * this.field8538 + (float) var12 * this.field8540 + var31 + this.field8535;
                        var35 = (int) ((float) this.field8534.field261 * var34 / var22) + arg4.field8204;
                        float var36 = (float) var14 * this.field8531 + (float) var13 * this.field8542 + var30 + this.field8533;
                        var37 = (int) ((float) this.field8534.field253 * var36 / var23) + arg4.field8197;
                        float var38 = (float) var14 * this.field8538 + (float) var13 * this.field8540 + var31 + this.field8535;
                        var39 = (int) ((float) this.field8534.field261 * var38 / var23) + arg4.field8204;
                        float var40 = (float) var15 * this.field8531 + (float) var13 * this.field8542 + var30 + this.field8533;
                        var41 = (int) ((float) this.field8534.field253 * var40 / var24) + arg4.field8197;
                        float var42 = (float) var15 * this.field8538 + (float) var13 * this.field8540 + var31 + this.field8535;
                        var43 = (int) ((float) this.field8534.field261 * var42 / var24) + arg4.field8204;
                        float var44 = (float) var15 * this.field8531 + (float) var12 * this.field8542 + var30 + this.field8533;
                        var45 = (int) ((float) this.field8534.field253 * var44 / var25) + arg4.field8197;
                        float var46 = (float) var15 * this.field8538 + (float) var12 * this.field8540 + var31 + this.field8535;
                        var47 = (int) ((float) this.field8534.field261 * var46 / var25) + arg4.field8204;
                    } else {
                        float var48 = (float) var14 * this.field8531 + (float) var12 * this.field8542 + var30 + this.field8533;
                        var33 = (int) ((float) this.field8534.field253 * var48 / (float) this.field8549) + arg4.field8197;
                        float var49 = (float) var14 * this.field8538 + (float) var12 * this.field8540 + var31 + this.field8535;
                        var35 = (int) ((float) this.field8534.field261 * var49 / (float) this.field8549) + arg4.field8204;
                        float var50 = (float) var14 * this.field8531 + (float) var13 * this.field8542 + var30 + this.field8533;
                        var37 = (int) ((float) this.field8534.field253 * var50 / (float) this.field8549) + arg4.field8197;
                        float var51 = (float) var14 * this.field8538 + (float) var13 * this.field8540 + var31 + this.field8535;
                        var39 = (int) ((float) this.field8534.field261 * var51 / (float) this.field8549) + arg4.field8204;
                        float var52 = (float) var15 * this.field8531 + (float) var13 * this.field8542 + var30 + this.field8533;
                        var41 = (int) ((float) this.field8534.field253 * var52 / (float) this.field8549) + arg4.field8197;
                        float var53 = (float) var15 * this.field8538 + (float) var13 * this.field8540 + var31 + this.field8535;
                        var43 = (int) ((float) this.field8534.field261 * var53 / (float) this.field8549) + arg4.field8204;
                        float var54 = (float) var15 * this.field8531 + (float) var12 * this.field8542 + var30 + this.field8533;
                        var45 = (int) ((float) this.field8534.field253 * var54 / (float) this.field8549) + arg4.field8197;
                        float var55 = (float) var15 * this.field8538 + (float) var12 * this.field8540 + var31 + this.field8535;
                        var47 = (int) ((float) this.field8534.field261 * var55 / (float) this.field8549) + arg4.field8204;
                    }
                } else {
                    int var56 = super.field4700[arg0][arg1];
                    int var57 = super.field4700[arg0 + 1][arg1];
                    int var58 = super.field4700[arg0 + 1][arg1 + 1];
                    int var59 = super.field4700[arg0][arg1 + 1];
                    if (this.field8549 == -1) {
                        var22 = (float) var14 * this.field8532 + (float) var12 * this.field8548 + (float) var56 * this.field8545 + this.field8541;
                        if (var22 <= (float) this.field8534.field245) {
                            return;
                        }
                        var23 = (float) var14 * this.field8532 + (float) var13 * this.field8548 + (float) var57 * this.field8545 + this.field8541;
                        if (var23 <= (float) this.field8534.field245) {
                            return;
                        }
                        var24 = (float) var15 * this.field8532 + (float) var13 * this.field8548 + (float) var58 * this.field8545 + this.field8541;
                        if (var24 <= (float) this.field8534.field245) {
                            return;
                        }
                        var25 = (float) var15 * this.field8532 + (float) var12 * this.field8548 + (float) var59 * this.field8545 + this.field8541;
                        if (var25 <= (float) this.field8534.field245) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field8532 + (float) var12 * this.field8548 + (float) var56 * this.field8545 + this.field8541;
                        var23 = (float) var14 * this.field8532 + (float) var13 * this.field8548 + (float) var57 * this.field8545 + this.field8541;
                        var24 = (float) var15 * this.field8532 + (float) var13 * this.field8548 + (float) var58 * this.field8545 + this.field8541;
                        var25 = (float) var15 * this.field8532 + (float) var12 * this.field8548 + (float) var59 * this.field8545 + this.field8541;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7904);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field9067 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7904);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field9070 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7904);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field9065 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7904);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field9066 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7903) {
                        int var68 = (int) (var22 - (float) arg3.field7904);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7904);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7904);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7904);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field8549 == -1) {
                        float var72 = (float) var14 * this.field8531 + (float) var12 * this.field8542 + (float) var56 * this.field8551 + this.field8533;
                        var33 = (int) ((float) this.field8534.field253 * var72 / var22) + arg4.field8197;
                        float var73 = (float) var14 * this.field8538 + (float) var12 * this.field8540 + (float) var56 * this.field8550 + this.field8535;
                        var35 = (int) ((float) this.field8534.field261 * var73 / var22) + arg4.field8204;
                        float var74 = (float) var14 * this.field8531 + (float) var13 * this.field8542 + (float) var57 * this.field8551 + this.field8533;
                        var37 = (int) ((float) this.field8534.field253 * var74 / var23) + arg4.field8197;
                        float var75 = (float) var14 * this.field8538 + (float) var13 * this.field8540 + (float) var57 * this.field8550 + this.field8535;
                        var39 = (int) ((float) this.field8534.field261 * var75 / var23) + arg4.field8204;
                        float var76 = (float) var15 * this.field8531 + (float) var13 * this.field8542 + (float) var58 * this.field8551 + this.field8533;
                        var41 = (int) ((float) this.field8534.field253 * var76 / var24) + arg4.field8197;
                        float var77 = (float) var15 * this.field8538 + (float) var13 * this.field8540 + (float) var58 * this.field8550 + this.field8535;
                        var43 = (int) ((float) this.field8534.field261 * var77 / var24) + arg4.field8204;
                        float var78 = (float) var15 * this.field8531 + (float) var12 * this.field8542 + (float) var59 * this.field8551 + this.field8533;
                        var45 = (int) ((float) this.field8534.field253 * var78 / var25) + arg4.field8197;
                        float var79 = (float) var15 * this.field8538 + (float) var12 * this.field8540 + (float) var59 * this.field8550 + this.field8535;
                        var47 = (int) ((float) this.field8534.field261 * var79 / var25) + arg4.field8204;
                    } else {
                        float var80 = (float) var14 * this.field8531 + (float) var12 * this.field8542 + (float) var56 * this.field8551 + this.field8533;
                        var33 = (int) ((float) this.field8534.field253 * var80 / (float) this.field8549) + arg4.field8197;
                        float var81 = (float) var14 * this.field8538 + (float) var12 * this.field8540 + (float) var56 * this.field8550 + this.field8535;
                        var35 = (int) ((float) this.field8534.field261 * var81 / (float) this.field8549) + arg4.field8204;
                        float var82 = (float) var14 * this.field8531 + (float) var13 * this.field8542 + (float) var57 * this.field8551 + this.field8533;
                        var37 = (int) ((float) this.field8534.field253 * var82 / (float) this.field8549) + arg4.field8197;
                        float var83 = (float) var14 * this.field8538 + (float) var13 * this.field8540 + (float) var57 * this.field8550 + this.field8535;
                        var39 = (int) ((float) this.field8534.field261 * var83 / (float) this.field8549) + arg4.field8204;
                        float var84 = (float) var15 * this.field8531 + (float) var13 * this.field8542 + (float) var58 * this.field8551 + this.field8533;
                        var41 = (int) ((float) this.field8534.field253 * var84 / (float) this.field8549) + arg4.field8197;
                        float var85 = (float) var15 * this.field8538 + (float) var13 * this.field8540 + (float) var58 * this.field8550 + this.field8535;
                        var43 = (int) ((float) this.field8534.field261 * var85 / (float) this.field8549) + arg4.field8204;
                        float var86 = (float) var15 * this.field8531 + (float) var12 * this.field8542 + (float) var59 * this.field8551 + this.field8533;
                        var45 = (int) ((float) this.field8534.field253 * var86 / (float) this.field8549) + arg4.field8197;
                        float var87 = (float) var15 * this.field8538 + (float) var12 * this.field8540 + (float) var59 * this.field8550 + this.field8535;
                        var47 = (int) ((float) this.field8534.field261 * var87 / (float) this.field8549) + arg4.field8204;
                    }
                }
                boolean var88 = var11.field9064 != -1 && this.method4326(this.field8534.field864.method1419(var11.field9064, -126).field4913);
                if (this.field8549 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field8205 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8192 || var45 > arg4.field8192 || var37 > arg4.field8192;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field9064 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method4156((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field9069 & 16777215, var90 | var11.field9072 & 16777215, var90 | var11.field9071 & 16777215, arg3.field7902, var18, var19, var17, var11.field9064);
                                } else {
                                    if (var88) {
                                        arg4.field8193 = 100;
                                    }
                                    arg4.method4147((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class276.method2368(true, var18 << 24 | arg3.field7902, var11.field9069), class276.method2368(true, var19 << 24 | arg3.field7902, var11.field9072), class276.method2368(true, var17 << 24 | arg3.field7902, var11.field9071));
                                    arg4.field8193 = 0;
                                }
                            } else if (var11.field9064 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method4156((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field9069 & 16777215, var91 | var11.field9072 & 16777215, var91 | var11.field9071 & 16777215, 0, 0, 0, 0, var11.field9064);
                            } else {
                                if (var88) {
                                    arg4.field8193 = 100;
                                }
                                arg4.method4147((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field9069, var11.field9072, var11.field9071);
                                arg4.field8193 = 0;
                            }
                        } else {
                            arg4.method4148((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7902);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field8205 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8192 || var37 > arg4.field8192 || var45 > arg4.field8192;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field8193 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field9064 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method4156((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field9074 & 16777215, var93 | var11.field9071 & 16777215, var93 | var11.field9072 & 16777215, arg3.field7902, var16, var17, var19, var11.field9064);
                                    return;
                                }
                                if (var88) {
                                    arg4.field8193 = 100;
                                }
                                arg4.method4147((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class276.method2368(true, var16 << 24 | arg3.field7902, var11.field9074), class276.method2368(true, var17 << 24 | arg3.field7902, var11.field9071), class276.method2368(true, var19 << 24 | arg3.field7902, var11.field9072));
                                arg4.field8193 = 0;
                                return;
                            }
                            if (var11.field9064 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method4156((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field9074 & 16777215, var94 | var11.field9071 & 16777215, var94 | var11.field9072 & 16777215, 0, 0, 0, 0, var11.field9064);
                                return;
                            }
                            if (var88) {
                                arg4.field8193 = 100;
                            }
                            arg4.method4147((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field9074, var11.field9071, var11.field9072);
                            arg4.field8193 = 0;
                            return;
                        }
                        arg4.method4148((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7902);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field8205 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8192 || var45 > arg4.field8192 || var37 > arg4.field8192;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field8193 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field9064 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method4156((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field9069 & 16777215, var96 | var11.field9072 & 16777215, var96 | var11.field9071 & 16777215, arg3.field7902, var18, var19, var17, var11.field9064);
                                } else {
                                    if (var88) {
                                        arg4.field8193 = 100;
                                    }
                                    arg4.method4147((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class276.method2368(true, var18 << 24 | arg3.field7902, var11.field9069), class276.method2368(true, var19 << 24 | arg3.field7902, var11.field9072), class276.method2368(true, var17 << 24 | arg3.field7902, var11.field9071));
                                    arg4.field8193 = 0;
                                }
                            } else if (var11.field9064 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method4156((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field9069 & 16777215, var97 | var11.field9072 & 16777215, var97 | var11.field9071 & 16777215, 0, 0, 0, 0, var11.field9064);
                            } else {
                                if (var88) {
                                    arg4.field8193 = 100;
                                }
                                arg4.method4147((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field9069, var11.field9072, var11.field9071);
                                arg4.field8193 = 0;
                            }
                        } else {
                            arg4.method4148((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7902);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field8205 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8192 || var37 > arg4.field8192 || var45 > arg4.field8192;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field8193 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field9064 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method4156((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field9074 & 16777215, var99 | var11.field9071 & 16777215, var99 | var11.field9072 & 16777215, arg3.field7902, var16, var17, var19, var11.field9064);
                                    return;
                                }
                                if (var88) {
                                    arg4.field8193 = 100;
                                }
                                arg4.method4147((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class276.method2368(true, var16 << 24 | arg3.field7902, var11.field9074), class276.method2368(true, var17 << 24 | arg3.field7902, var11.field9071), class276.method2368(true, var19 << 24 | arg3.field7902, var11.field9072));
                                arg4.field8193 = 0;
                                return;
                            }
                            if (var11.field9064 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method4156((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field9074 & 16777215, var100 | var11.field9071 & 16777215, var100 | var11.field9072 & 16777215, 0, 0, 0, 0, var11.field9064);
                                return;
                            }
                            if (var88) {
                                arg4.field8193 = 100;
                            }
                            arg4.method4147((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field9074, var11.field9071, var11.field9072);
                            arg4.field8193 = 0;
                            return;
                        }
                        arg4.method4148((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7902);
                    }
                }
            }
        } else {
            class367 var101 = this.field8539[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field5969 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field8549 == -1) {
                    for (int var102 = 0; var102 < var101.field5972; ++var102) {
                        int var103 = (arg0 << super.field4706) + var101.field5977[var102];
                        int var104 = var101.field5975[var102];
                        int var105 = (arg1 << super.field4706) + var101.field5973[var102];
                        float var106 = (float) var105 * this.field8532 + (float) var103 * this.field8548 + (float) var104 * this.field8545 + this.field8541;
                        if (var106 <= (float) this.field8534.field245) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7904);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field5967[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7903) {
                            int var109 = (int) (var106 - (float) arg3.field7904);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field8531 + (float) var103 * this.field8542 + (float) var104 * this.field8551 + this.field8533;
                        float var111 = (float) var105 * this.field8538 + (float) var103 * this.field8540 + (float) var104 * this.field8550 + this.field8535;
                        arg5[var102] = (int) ((float) this.field8534.field253 * var110 / var106) + arg4.field8197;
                        arg6[var102] = (int) ((float) this.field8534.field261 * var111 / var106) + arg4.field8204;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field5972; ++var112) {
                        int var152 = (arg0 << super.field4706) + var101.field5977[var112];
                        int var153 = var101.field5975[var112];
                        int var154 = (arg1 << super.field4706) + var101.field5973[var112];
                        float var155 = (float) var154 * this.field8532 + (float) var152 * this.field8548 + (float) var153 * this.field8545 + this.field8541;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field8549 - arg3.field7904;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field5967[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7903) {
                            int var158 = this.field8549 - arg3.field7904;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field8531 + (float) var152 * this.field8542 + (float) var153 * this.field8551 + this.field8533;
                        float var160 = (float) var154 * this.field8538 + (float) var152 * this.field8540 + (float) var153 * this.field8550 + this.field8535;
                        arg5[var112] = (int) ((float) this.field8534.field253 * var159 / (float) this.field8549) + arg4.field8197;
                        arg6[var112] = (int) ((float) this.field8534.field261 * var160 / (float) this.field8549) + arg4.field8204;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field5976 != null) {
                    if (this.field8549 == -1) {
                        for (int var113 = 0; var113 < var101.field5970; ++var113) {
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
                                arg4.field8205 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field8192 || var118 > arg4.field8192 || var119 > arg4.field8192;
                                short var124 = var101.field5976[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method4326(this.field8534.field864.method1419(var124, -118).field4913)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method4156((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field5977[var114] / (float) super.field4702, (float) var101.field5977[var115] / (float) super.field4702, (float) var101.field5977[var116] / (float) super.field4702, (float) var101.field5973[var114] / (float) super.field4702, (float) var101.field5973[var115] / (float) super.field4702, (float) var101.field5973[var116] / (float) super.field4702, var125 | var101.field5968[var114] & 16777215, var125 | var101.field5968[var115] & 16777215, var125 | var101.field5968[var116] & 16777215, arg3.field7902, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field5968[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method4326(this.field8534.field864.method1419(var124, -112).field4913)) {
                                                arg4.field8193 = -1694498816;
                                            }
                                            arg4.method4147((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class276.method2368(true, arg8[var114] << 24 | arg3.field7902, var101.field5968[var114]), class276.method2368(true, arg8[var115] << 24 | arg3.field7902, var101.field5968[var115]), class276.method2368(true, arg8[var116] << 24 | arg3.field7902, var101.field5968[var116]));
                                            arg4.field8193 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method4326(this.field8534.field864.method1419(var124, -90).field4913)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method4156((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field5977[var114] / (float) super.field4702, (float) var101.field5977[var115] / (float) super.field4702, (float) var101.field5977[var116] / (float) super.field4702, (float) var101.field5973[var114] / (float) super.field4702, (float) var101.field5973[var115] / (float) super.field4702, (float) var101.field5973[var116] / (float) super.field4702, var126 | var101.field5968[var114] & 16777215, var126 | var101.field5968[var115] & 16777215, var126 | var101.field5968[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field5968[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method4326(this.field8534.field864.method1419(var124, -126).field4913)) {
                                            arg4.field8193 = -1694498816;
                                        }
                                        arg4.method4147((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field5968[var114], var101.field5968[var115], var101.field5968[var116]);
                                        arg4.field8193 = 0;
                                    }
                                } else {
                                    arg4.method4148((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7902);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field5970; ++var127) {
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
                            arg4.field8205 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field8192 || var132 > arg4.field8192 || var133 > arg4.field8192;
                            short var138 = var101.field5976[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method4326(this.field8534.field864.method1419(var138, -95).field4913)) {
                                    arg4.field8193 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method4326(this.field8534.field864.method1419(var138, -117).field4913)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method4156((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field5977[var128] / (float) super.field4702, (float) var101.field5977[var129] / (float) super.field4702, (float) var101.field5977[var130] / (float) super.field4702, (float) var101.field5973[var128] / (float) super.field4702, (float) var101.field5973[var129] / (float) super.field4702, (float) var101.field5973[var130] / (float) super.field4702, var139 | var101.field5968[var128] & 16777215, var139 | var101.field5968[var129] & 16777215, var139 | var101.field5968[var130] & 16777215, arg3.field7902, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field5968[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method4326(this.field8534.field864.method1419(var138, -102).field4913)) {
                                            arg4.field8193 = -1694498816;
                                        }
                                        arg4.method4147((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class276.method2368(true, arg8[var128] << 24 | arg3.field7902, var101.field5968[var128]), class276.method2368(true, arg8[var129] << 24 | arg3.field7902, var101.field5968[var129]), class276.method2368(true, arg8[var130] << 24 | arg3.field7902, var101.field5968[var130]));
                                        arg4.field8193 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method4326(this.field8534.field864.method1419(var138, -95).field4913)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method4156((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field5977[var128] / (float) super.field4702, (float) var101.field5977[var129] / (float) super.field4702, (float) var101.field5977[var130] / (float) super.field4702, (float) var101.field5973[var128] / (float) super.field4702, (float) var101.field5973[var129] / (float) super.field4702, (float) var101.field5973[var130] / (float) super.field4702, var140 | var101.field5968[var128] & 16777215, var140 | var101.field5968[var129] & 16777215, var140 | var101.field5968[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field5968[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method4326(this.field8534.field864.method1419(var138, -108).field4913)) {
                                        arg4.field8193 = -1694498816;
                                    }
                                    arg4.method4147((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field5968[var128], var101.field5968[var129], var101.field5968[var130]);
                                    arg4.field8193 = 0;
                                }
                                arg4.field8193 = 0;
                            } else {
                                arg4.method4148((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7902);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field5970; ++var141) {
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
                        arg4.field8205 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field8192 || var146 > arg4.field8192 || var147 > arg4.field8192;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field5968[var142] & 16777215) != 0) {
                                    arg4.method4147((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class735.method5343(arg3.field7902, arg8[var142], 16711935, var101.field5968[var142]), class735.method5343(arg3.field7902, arg8[var143], 16711935, var101.field5968[var143]), class735.method5343(arg3.field7902, arg8[var144], 16711935, var101.field5968[var144]));
                                }
                            } else if ((var101.field5968[var142] & 16777215) != 0) {
                                arg4.method4147((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field5968[var142], var101.field5968[var143], var101.field5968[var144]);
                            }
                        } else {
                            arg4.method4148((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7902);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2252)
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class539 var9 = this.field8534.method230(Thread.currentThread());
        class564 var10 = var9.field7946;
        var10.field8193 = 0;
        var10.field8205 = true;
        this.field8534.method196();
        if (this.field8546 == null && this.field8547 == null) {
            if (this.field8530 != null) {
                this.method4330(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7947, var9.field7940);
            }
        } else {
            this.method4328(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7947, var9.field7940);
        }
    }

    @OriginalMember(owner = "client!pu", name = "YA", descriptor = "()V", line = 2269)
    public final void method702() {
        this.field8537 = null;
        this.field8544 = null;
    }

    @OriginalMember(owner = "client!pu", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 2274)
    public final void method705(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field8543 & 32) == 0;
        if (this.field8546 == null && !var15) {
            this.field8546 = new class631[super.field4704][super.field4697];
            this.field8539 = new class367[super.field4704][super.field4697];
        } else if (this.field8547 == null && var15) {
            this.field8547 = new class552[super.field4704][super.field4697];
        } else if (this.field8530 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class200.field3161[class545.method4049(arg6[var16], 19) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class200.field3161[class545.method4049(arg7[var17], 45) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class552 var18 = new class552();
                var18.field8087 = (short) arg2.length;
                var18.field8089 = (short) (arg2.length / 3);
                var18.field8094 = new short[var18.field8087];
                var18.field8088 = new short[var18.field8087];
                var18.field8096 = new short[var18.field8087];
                var18.field8093 = new int[var18.field8087];
                var18.field8090 = new short[var18.field8087];
                var18.field8092 = new short[var18.field8087];
                var18.field8097 = new byte[var18.field8087];
                if (arg5 != null) {
                    var18.field8095 = new short[var18.field8087];
                }
                for (int var19 = 0; var19 < var18.field8087; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field8537[arg0][arg1] - this.field8544[arg0][arg1];
                    } else if (var22 == 0 && super.field4702 == var23) {
                        var25 = this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1];
                    } else if (super.field4702 == var22 && super.field4702 == var23) {
                        var25 = this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1];
                    } else if (super.field4702 == var22 && var23 == 0) {
                        var25 = this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]) * var22 + (this.field8537[arg0][arg1] - this.field8544[arg0][arg1]) * (super.field4702 - var22);
                        int var27 = (this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]) * var22 + (this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]) * (super.field4702 - var22);
                        var25 = (super.field4702 - var23) * var26 + var23 * var27 >> super.field4706 * 2;
                    }
                    int var28 = (arg0 << super.field4706) + var22;
                    int var29 = (arg1 << super.field4706) + var23;
                    var18.field8094[var19] = (short) var22;
                    var18.field8096[var19] = (short) var23;
                    var18.field8088[var19] = (short) (this.method2497((byte) -80, var28, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field8093[var19] = 0;
                        if (arg7 != null) {
                            var18.field8097[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field8095[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method4326(this.field8534.field864.method1419(arg8[var19], -101).field4913)) {
                            var32 = -1694498816;
                        }
                        var18.field8093[var19] = var32 | class735.method5343(arg10, var30, 16711935, method4331(arg6[var19] >> 8, var25));
                        if (arg7 != null) {
                            var18.field8097[var19] = (byte) var25;
                        }
                    }
                    var18.field8090[var19] = (short) arg8[var19];
                    var18.field8092[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field8091 = new int[var18.field8089];
                }
                for (int var20 = 0; var20 < var18.field8089; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field8091[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field8547[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field4702 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field4702 && arg4[var38] == super.field4702) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field4702) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field4702 != arg2[var40] && arg2[0] - super.field4702 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field4702 != arg4[var40] && arg4[0] - super.field4702 != arg4[var40]) {
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
                    class631 var41 = new class631();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field9068 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field9073 = (byte) (var41.field9073 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field4700[arg0 + 1][arg1] == super.field4700[arg0][arg1] && super.field4700[arg0 + 1][arg1 + 1] == super.field4700[arg0][arg1] && super.field4700[arg0][arg1 + 1] == super.field4700[arg0][arg1]) {
                        var41.field9073 = (byte) (var41.field9073 | 1);
                    }
                    if (var43 != -1 && (var41.field9073 & 2) == 0 && !this.field8534.field864.method1419(var43, -115).field4890) {
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
                        var41.field9074 = class735.method5343(arg10, var44, 16711935, method4331(arg6[var34] >> 8, this.field8537[arg0][arg1] - this.field8544[arg0][arg1]));
                        if (var41.field9068 != 0) {
                            var41.field9074 |= 255 - (this.field8537[arg0][arg1] - this.field8544[arg0][arg1]) << 25;
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
                        var41.field9071 = class735.method5343(arg10, var45, 16711935, method4331(arg6[var35] >> 8, this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]));
                        if (var41.field9068 != 0) {
                            var41.field9071 |= 255 - (this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]) << 25;
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
                        var41.field9069 = class735.method5343(arg10, var46, 16711935, method4331(arg6[var36] >> 8, this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]));
                        if (var41.field9068 != 0) {
                            var41.field9069 |= 255 - (this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field9072 = class735.method5343(arg10, var47, 16711935, method4331(arg6[var37] >> 8, this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]));
                        var41.field9064 = (short) var43;
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
                        var41.field9074 = class735.method5343(arg10, var48, 16711935, method4331(arg6[var34] >> 8, this.field8537[arg0][arg1] - this.field8544[arg0][arg1]));
                        if (var41.field9068 != 0) {
                            var41.field9074 |= 255 - (this.field8537[arg0][arg1] - this.field8544[arg0][arg1]) << 25;
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
                        var41.field9071 = class735.method5343(arg10, var49, 16711935, method4331(arg6[var35] >> 8, this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]));
                        if (var41.field9068 != 0) {
                            var41.field9071 |= 255 - (this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]) << 25;
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
                        var41.field9069 = class735.method5343(arg10, var50, 16711935, method4331(arg6[var36] >> 8, this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]));
                        if (var41.field9068 != 0) {
                            var41.field9069 |= 255 - (this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field9072 = class735.method5343(arg10, var51, 16711935, method4331(arg6[var37] >> 8, this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]));
                        if (var41.field9068 != 0) {
                            var41.field9072 |= 255 - (this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]) << 25;
                        }
                        var41.field9064 = -1;
                    }
                    if (arg5 != null) {
                        var41.field9065 = (short) arg5[var36];
                        var41.field9066 = (short) arg5[var37];
                        var41.field9070 = (short) arg5[var35];
                        var41.field9067 = (short) arg5[var34];
                    }
                    this.field8546[arg0][arg1] = var41;
                } else {
                    class367 var52 = new class367();
                    var52.field5972 = (short) arg2.length;
                    var52.field5970 = (short) (arg2.length / 3);
                    var52.field5977 = new short[var52.field5972];
                    var52.field5975 = new short[var52.field5972];
                    var52.field5973 = new short[var52.field5972];
                    var52.field5968 = new int[var52.field5972];
                    if (arg5 != null) {
                        var52.field5967 = new short[var52.field5972];
                    }
                    for (int var53 = 0; var53 < var52.field5972; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field8537[arg0][arg1] - this.field8544[arg0][arg1];
                        } else if (var68 == 0 && super.field4702 == var69) {
                            var71 = this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1];
                        } else if (super.field4702 == var68 && super.field4702 == var69) {
                            var71 = this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1];
                        } else if (super.field4702 == var68 && var69 == 0) {
                            var71 = this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field8537[arg0 + 1][arg1] - this.field8544[arg0 + 1][arg1]) * var68 + (this.field8537[arg0][arg1] - this.field8544[arg0][arg1]) * (super.field4702 - var68);
                            int var73 = (this.field8537[arg0 + 1][arg1 + 1] - this.field8544[arg0 + 1][arg1 + 1]) * var68 + (this.field8537[arg0][arg1 + 1] - this.field8544[arg0][arg1 + 1]) * (super.field4702 - var68);
                            var71 = (super.field4702 - var69) * var72 + var69 * var73 >> super.field4706 * 2;
                        }
                        int var74 = (arg0 << super.field4706) + var68;
                        int var75 = (arg1 << super.field4706) + var69;
                        var52.field5977[var53] = (short) var68;
                        var52.field5973[var53] = (short) var69;
                        var52.field5975[var53] = (short) (this.method2497((byte) -126, var74, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field5968[var53] = var71 << 25;
                            } else {
                                var52.field5968[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field5967[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field5968[var53] = class735.method5343(arg10, var76, 16711935, method4331(arg6[var53] >> 8, var71));
                            if (arg7 != null) {
                                var52.field5968[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field5970; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field8534.field864.method1419(arg8[var55 * 3], -111).field4890) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field5974 = new int[var52.field5970];
                    }
                    if (var54) {
                        var52.field5976 = new short[var52.field5970];
                        var52.field5971 = new short[var52.field5970];
                    }
                    for (int var56 = 0; var56 < var52.field5970; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field5974[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field8534.field864.method1419(var62, -124).field4890) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field8534.field864.method1419(var63, -120).field4890) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field8534.field864.method1419(var64, -98).field4890) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field5976[var56] = (short) var64;
                                var52.field5971[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field8534.field864.method1419(var65, -108).field4890) {
                                        var52.field5968[var57] = class200.field3161[class545.method4049(this.field8534.field864.method1419(var65, -107).field4894 & 65535, 62) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field8534.field864.method1419(var66, -100).field4890) {
                                        var52.field5968[var58] = class200.field3161[class545.method4049(this.field8534.field864.method1419(var66, -83).field4894 & 65535, 98) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field8534.field864.method1419(var67, -104).field4890) {
                                        var52.field5968[var59] = class200.field3161[class545.method4049(this.field8534.field864.method1419(var67, -102).field4894 & 65535, 20) & 65535];
                                    }
                                }
                                var52.field5976[var56] = -1;
                            }
                        }
                    }
                    this.field8539[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIII[[ZLjq;Lbf;[I[I)V", line = 2972)
    private final void method4330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class539 arg8, class564 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7908;
        this.field8534.method265(false);
        arg9.field8198 = false;
        arg9.field8201 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field8530[var18][var19] != null) {
                        class402 var20 = this.field8530[var18][var19];
                        if (var20.field6341 != -1 && (var20.field6339 & 2) == 0 && var20.field6338 == -1) {
                            int var21 = this.field8534.method188(var20.field6341);
                            arg9.method4145((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class112.method1023(var20.field6340 & 65535, var21, (byte) -79), (float) class112.method1023(var20.field6337 & 65535, var21, (byte) -79), (float) class112.method1023(var20.field6343 & 65535, var21, (byte) -79));
                            arg9.method4145((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class112.method1023(var20.field6342 & 65535, var21, (byte) -79), (float) class112.method1023(var20.field6343 & 65535, var21, (byte) -79), (float) class112.method1023(var20.field6337 & 65535, var21, (byte) -79));
                        } else if (var20.field6338 == -1) {
                            arg9.method4145((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field6340 & 65535), (float) (var20.field6337 & 65535), (float) (var20.field6343 & 65535));
                            arg9.method4145((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field6342 & 65535), (float) (var20.field6343 & 65535), (float) (var20.field6337 & 65535));
                        } else {
                            int var22 = var20.field6338;
                            arg9.method4145((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method4145((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field8536[var18][var19] != null) {
                        class144 var23 = this.field8536[var18][var19];
                        for (int var24 = 0; var24 < var23.field2042; ++var24) {
                            arg10[var24] = var23.field2038[var24] * var14 / super.field4702 + var16;
                            arg11[var24] = var17 - var23.field2037[var24] * var14 / super.field4702;
                        }
                        for (int var25 = 0; var25 < var23.field2044; ++var25) {
                            short var26 = var23.field2041[var25];
                            short var27 = var23.field2033[var25];
                            short var28 = var23.field2045[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field2035 != null && var23.field2035[var25] != -1) {
                                int var35 = var23.field2035[var25];
                                arg9.method4145((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class112.method1023(var23.field2040[var26], var35, (byte) -79), (float) class112.method1023(var23.field2040[var27], var35, (byte) -79), (float) class112.method1023(var23.field2040[var28], var35, (byte) -79));
                            } else if (var23.field2034 != null && var23.field2034[var25] != -1) {
                                int var36 = this.field8534.method188(var23.field2034[var25]);
                                arg9.method4145((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class112.method1023(var23.field2040[var26], var36, (byte) -79), (float) class112.method1023(var23.field2040[var27], var36, (byte) -79), (float) class112.method1023(var23.field2040[var28], var36, (byte) -79));
                            } else {
                                int var37 = var23.field2039[var25];
                                arg9.method4145((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class112.method1023(var23.field2040[var26], var37, (byte) -79), (float) class112.method1023(var23.field2040[var27], var37, (byte) -79), (float) class112.method1023(var23.field2040[var28], var37, (byte) -79));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8198 = true;
        this.field8534.method265(var15);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)I", line = 3112)
    private static final int method4331(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[[ZZII)V", line = 3142)
    public final void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class714 var8 = this.field8534.field231;
        this.field8549 = arg5;
        this.field8542 = var8.field10339;
        this.field8551 = var8.field10338;
        this.field8531 = var8.field10340;
        this.field8533 = var8.field10331;
        this.field8540 = var8.field10315;
        this.field8550 = var8.field10333;
        this.field8538 = var8.field10343;
        this.field8535 = var8.field10327;
        this.field8548 = var8.field10328;
        this.field8545 = var8.field10334;
        this.field8532 = var8.field10330;
        this.field8541 = var8.field10319;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field4704 && var12 >= 0 && var12 < super.field4697) {
                        this.method4324(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 3185)
    public final void method714(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pu", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 3189)
    public final void method701(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lih;[I)V", line = 3191)
    public final void method713(class731 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!pu", name = "fa", descriptor = "(IILr;)Lr;", line = 3199)
    public final class192 method712(int arg0, int arg1, class192 arg2) {
        return null;
    }
}
