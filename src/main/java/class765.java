import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class765 {

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "[I")
    public int[] field10514 = new int[4096];

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
    public int field10517 = 0;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "Z")
    public boolean field10515 = true;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "Z")
    public boolean field10520 = false;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "Z")
    private boolean field10525 = false;

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "Z")
    public boolean field10521 = false;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "Z")
    private boolean field10528 = false;

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "Z")
    private boolean field10532 = true;

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
    private int field10534 = 0;

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "I")
    private int field10537 = 0;

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "I")
    private int field10530 = 0;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "I")
    private int field10533 = 0;

    @OriginalMember(owner = "client!sia", name = "A", descriptor = "F")
    private float field10539 = 0.0F;

    @OriginalMember(owner = "client!sia", name = "C", descriptor = "[I")
    private int[] field10541 = null;

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "F")
    private float field10535 = 0.0F;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    private int field10536 = 0;

    @OriginalMember(owner = "client!sia", name = "B", descriptor = "F")
    private float field10540 = 0.0F;

    @OriginalMember(owner = "client!sia", name = "E", descriptor = "I")
    private int field10543 = 0;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
    private int field10538 = 0;

    @OriginalMember(owner = "client!sia", name = "F", descriptor = "I")
    private int field10544 = -1;

    @OriginalMember(owner = "client!sia", name = "D", descriptor = "[I")
    private int[] field10542 = null;

    @OriginalMember(owner = "client!sia", name = "G", descriptor = "[I")
    private int[] field10545 = null;

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "I")
    private int field10531 = -1;

    @OriginalMember(owner = "client!sia", name = "H", descriptor = "I")
    private int field10546 = -1;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "Lni;")
    private class545 field10518;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "Llda;")
    private class509 field10513;

    @OriginalMember(owner = "client!sia", name = "j", descriptor = "I")
    private int field10522;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "[I")
    private int[] field10519;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "[F")
    private float[] field10516;

    @OriginalMember(owner = "client!sia", name = "k", descriptor = "I")
    public int field10523;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "I")
    public int field10524;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
    public int field10526;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
    public int field10527;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "I")
    private int field10529;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFFFFI)V")
    public final void method4200(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9) {
        if (this.field10525) {
            this.field10518.method419((int) arg4, arg9, (int) arg3, (int) arg1, (byte) 34, (int) arg0);
            this.field10518.method419((int) arg5, arg9, (int) arg4, (int) arg2, (byte) 34, (int) arg1);
            this.field10518.method419((int) arg3, arg9, (int) arg5, (int) arg0, (byte) 34, (int) arg2);
            return;
        }
        float var11 = arg4 - arg3;
        float var12 = arg1 - arg0;
        float var13 = arg5 - arg3;
        float var14 = arg2 - arg0;
        float var15 = arg7 - arg6;
        float var16 = arg8 - arg6;
        float var17 = 0.0F;
        if (arg0 != arg1) {
            var17 = (arg4 - arg3) / (arg1 - arg0);
        }
        float var18 = 0.0F;
        if (arg1 != arg2) {
            var18 = (arg5 - arg4) / (arg2 - arg1);
        }
        float var19 = 0.0F;
        if (arg0 != arg2) {
            var19 = (arg3 - arg5) / (arg0 - arg2);
        }
        float var20 = var11 * var14 - var12 * var13;
        if (var20 == 0.0F) {
            return;
        }
        float var21 = (var14 * var15 - var12 * var16) / var20;
        float var22 = (var11 * var16 - var13 * var15) / var20;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (!(arg0 >= (float) this.field10523)) {
                if (arg1 > (float) this.field10523) {
                    arg1 = this.field10523;
                }
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                float var23 = arg6 + var21 - arg3 * var21;
                if (arg1 < arg2) {
                    float var24 = arg3;
                    if (arg0 < 0.0F) {
                        var24 = arg3 - arg0 * var19;
                        arg3 -= arg0 * var17;
                        var23 -= arg0 * var22;
                        arg0 = 0.0F;
                    }
                    if (arg1 < 0.0F) {
                        arg4 -= arg1 * var18;
                        arg1 = 0.0F;
                    }
                    if (arg0 != arg1 && var19 < var17 || arg0 == arg1 && var19 > var18) {
                        float var25 = arg2 - arg1;
                        float var26 = arg1 - arg0;
                        float var27 = (float) this.field10514[(int) arg0];
                        while (--var26 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var27, arg9, 0, (int) var24, (int) arg3, var23, var21);
                            var24 += var19;
                            arg3 += var17;
                            var23 += var22;
                            var27 += this.field10522;
                        }
                        while (--var25 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var27, arg9, 0, (int) var24, (int) arg4, var23, var21);
                            var24 += var19;
                            arg4 += var18;
                            var23 += var22;
                            var27 += this.field10522;
                        }
                    } else {
                        float var28 = arg2 - arg1;
                        float var29 = arg1 - arg0;
                        float var30 = (float) this.field10514[(int) arg0];
                        while (--var29 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var30, arg9, 0, (int) arg3, (int) var24, var23, var21);
                            var24 += var19;
                            arg3 += var17;
                            var23 += var22;
                            var30 += this.field10522;
                        }
                        while (--var28 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var30, arg9, 0, (int) arg4, (int) var24, var23, var21);
                            var24 += var19;
                            arg4 += var18;
                            var23 += var22;
                            var30 += this.field10522;
                        }
                    }
                } else {
                    float var31 = arg3;
                    if (arg0 < 0.0F) {
                        var31 = arg3 - arg0 * var19;
                        arg3 -= arg0 * var17;
                        var23 -= arg0 * var22;
                        arg0 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var18;
                        arg2 = 0.0F;
                    }
                    if ((arg0 == arg2 || !(var19 < var17)) && (arg0 != arg2 || !(var18 > var17))) {
                        float var35 = arg1 - arg2;
                        float var36 = arg2 - arg0;
                        float var37 = (float) this.field10514[(int) arg0];
                        while (--var36 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var37, arg9, 0, (int) arg3, (int) var31, var23, var21);
                            var31 += var19;
                            arg3 += var17;
                            var23 += var22;
                            var37 += this.field10522;
                        }
                        while (--var35 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var37, arg9, 0, (int) arg3, (int) arg5, var23, var21);
                            arg5 += var18;
                            arg3 += var17;
                            var23 += var22;
                            var37 += this.field10522;
                        }
                    } else {
                        float var32 = arg1 - arg2;
                        float var33 = arg2 - arg0;
                        float var34 = (float) this.field10514[(int) arg0];
                        while (--var33 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var34, arg9, 0, (int) var31, (int) arg3, var23, var21);
                            var31 += var19;
                            arg3 += var17;
                            var23 += var22;
                            var34 += this.field10522;
                        }
                        while (--var32 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var34, arg9, 0, (int) arg5, (int) arg3, var23, var21);
                            arg5 += var18;
                            arg3 += var17;
                            var23 += var22;
                            var34 += this.field10522;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (!(arg1 >= (float) this.field10523)) {
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                if (arg0 > (float) this.field10523) {
                    arg0 = this.field10523;
                }
                float var38 = arg7 + var21 - arg4 * var21;
                if (arg2 < arg0) {
                    float var39 = arg4;
                    if (arg1 < 0.0F) {
                        var39 = arg4 - arg1 * var17;
                        arg4 -= arg1 * var18;
                        var38 -= arg1 * var22;
                        arg1 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var19;
                        arg2 = 0.0F;
                    }
                    if (arg1 != arg2 && var17 < var18 || arg1 == arg2 && var17 > var19) {
                        float var40 = arg0 - arg2;
                        float var41 = arg2 - arg1;
                        float var42 = (float) this.field10514[(int) arg1];
                        while (--var41 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var42, arg9, 0, (int) var39, (int) arg4, var38, var21);
                            var39 += var17;
                            arg4 += var18;
                            var38 += var22;
                            var42 += this.field10522;
                        }
                        while (--var40 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var42, arg9, 0, (int) var39, (int) arg5, var38, var21);
                            var39 += var17;
                            arg5 += var19;
                            var38 += var22;
                            var42 += this.field10522;
                        }
                    } else {
                        float var43 = arg0 - arg2;
                        float var44 = arg2 - arg1;
                        float var45 = (float) this.field10514[(int) arg1];
                        while (--var44 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var45, arg9, 0, (int) arg4, (int) var39, var38, var21);
                            var39 += var17;
                            arg4 += var18;
                            var38 += var22;
                            var45 += this.field10522;
                        }
                        while (--var43 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var45, arg9, 0, (int) arg5, (int) var39, var38, var21);
                            var39 += var17;
                            arg5 += var19;
                            var38 += var22;
                            var45 += this.field10522;
                        }
                    }
                } else {
                    float var46 = arg4;
                    if (arg1 < 0.0F) {
                        var46 = arg4 - arg1 * var17;
                        arg4 -= arg1 * var18;
                        var38 -= arg1 * var22;
                        arg1 = 0.0F;
                    }
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var19;
                        arg0 = 0.0F;
                    }
                    if (var17 < var18) {
                        float var47 = arg2 - arg0;
                        float var48 = arg0 - arg1;
                        float var49 = (float) this.field10514[(int) arg1];
                        while (--var48 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var49, arg9, 0, (int) var46, (int) arg4, var38, var21);
                            var46 += var17;
                            arg4 += var18;
                            var38 += var22;
                            var49 += this.field10522;
                        }
                        while (--var47 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var49, arg9, 0, (int) arg3, (int) arg4, var38, var21);
                            arg3 += var19;
                            arg4 += var18;
                            var38 += var22;
                            var49 += this.field10522;
                        }
                    } else {
                        float var50 = arg2 - arg0;
                        float var51 = arg0 - arg1;
                        float var52 = (float) this.field10514[(int) arg1];
                        while (--var51 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var52, arg9, 0, (int) arg4, (int) var46, var38, var21);
                            var46 += var17;
                            arg4 += var18;
                            var38 += var22;
                            var52 += this.field10522;
                        }
                        while (--var50 >= 0.0F) {
                            this.method4202(this.field10519, this.field10516, (int) var52, arg9, 0, (int) arg4, (int) arg3, var38, var21);
                            arg3 += var19;
                            arg4 += var18;
                            var38 += var22;
                            var52 += this.field10522;
                        }
                    }
                }
            }
        } else if (!(arg2 >= (float) this.field10523)) {
            if (arg0 > (float) this.field10523) {
                arg0 = this.field10523;
            }
            if (arg1 > (float) this.field10523) {
                arg1 = this.field10523;
            }
            float var53 = arg8 + var21 - arg5 * var21;
            if (arg0 < arg1) {
                float var54 = arg5;
                if (arg2 < 0.0F) {
                    var54 = arg5 - arg2 * var18;
                    arg5 -= arg2 * var19;
                    var53 -= arg2 * var22;
                    arg2 = 0.0F;
                }
                if (arg0 < 0.0F) {
                    arg3 -= arg0 * var17;
                    arg0 = 0.0F;
                }
                if (var18 < var19) {
                    float var55 = arg1 - arg0;
                    float var56 = arg0 - arg2;
                    float var57 = (float) this.field10514[(int) arg2];
                    while (--var56 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var57, arg9, 0, (int) var54, (int) arg5, var53, var21);
                        var54 += var18;
                        arg5 += var19;
                        var53 += var22;
                        var57 += this.field10522;
                    }
                    while (--var55 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var57, arg9, 0, (int) var54, (int) arg3, var53, var21);
                        var54 += var18;
                        arg3 += var17;
                        var53 += var22;
                        var57 += this.field10522;
                    }
                } else {
                    float var58 = arg1 - arg0;
                    float var59 = arg0 - arg2;
                    float var60 = (float) this.field10514[(int) arg2];
                    while (--var59 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var60, arg9, 0, (int) arg5, (int) var54, var53, var21);
                        var54 += var18;
                        arg5 += var19;
                        var53 += var22;
                        var60 += this.field10522;
                    }
                    while (--var58 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var60, arg9, 0, (int) arg3, (int) var54, var53, var21);
                        var54 += var18;
                        arg3 += var17;
                        var53 += var22;
                        var60 += this.field10522;
                    }
                }
            } else {
                float var61 = arg5;
                if (arg2 < 0.0F) {
                    var61 = arg5 - arg2 * var18;
                    arg5 -= arg2 * var19;
                    var53 -= arg2 * var22;
                    arg2 = 0.0F;
                }
                if (arg1 < 0.0F) {
                    arg4 -= arg1 * var17;
                    arg1 = 0.0F;
                }
                if (var18 < var19) {
                    float var62 = arg0 - arg1;
                    float var63 = arg1 - arg2;
                    float var64 = (float) this.field10514[(int) arg2];
                    while (--var63 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var64, arg9, 0, (int) var61, (int) arg5, var53, var21);
                        var61 += var18;
                        arg5 += var19;
                        var53 += var22;
                        var64 += this.field10522;
                    }
                    while (--var62 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var64, arg9, 0, (int) arg4, (int) arg5, var53, var21);
                        arg4 += var17;
                        arg5 += var19;
                        var53 += var22;
                        var64 += this.field10522;
                    }
                } else {
                    float var65 = arg0 - arg1;
                    float var66 = arg1 - arg2;
                    float var67 = (float) this.field10514[(int) arg2];
                    while (--var66 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var67, arg9, 0, (int) arg5, (int) var61, var53, var21);
                        var61 += var18;
                        arg5 += var19;
                        var53 += var22;
                        var67 += this.field10522;
                    }
                    while (--var65 >= 0.0F) {
                        this.method4202(this.field10519, this.field10516, (int) var67, arg9, 0, (int) arg5, (int) arg4, var53, var21);
                        arg4 += var17;
                        arg5 += var19;
                        var53 += var22;
                        var67 += this.field10522;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Z)V")
    public final void method4201(boolean arg0) {
        this.field10525 = arg0;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([I[FIIIIIFF)V")
    private final void method4202(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        if (this.field10521) {
            if (arg6 > this.field10524) {
                arg6 = this.field10524;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var10 = arg5 + arg2 - 1;
        int var11 = arg6 - arg5 >> 2;
        float var12 = (float) arg5 * arg8 + arg7;
        if (this.field10513.field7263) {
            if (this.field10517 == 0) {
                while (true) {
                    var11--;
                    if (var11 < 0) {
                        int var13 = arg6 - arg5 & 0x3;
                        while (true) {
                            var13--;
                            if (var13 < 0) {
                                return;
                            }
                            var10++;
                            if (var12 < arg1[var10]) {
                                arg0[var10] = arg3;
                                arg1[var10] = var12;
                            }
                            var12 += arg8;
                        }
                    }
                    var10++;
                    if (var12 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var12;
                    }
                    float var14 = arg8 + var12;
                    var10++;
                    if (var14 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var14;
                    }
                    float var15 = arg8 + var14;
                    var10++;
                    if (var15 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var15;
                    }
                    float var16 = arg8 + var15;
                    var10++;
                    if (var16 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var16;
                    }
                    var12 = arg8 + var16;
                }
            } else if (this.field10517 != 254) {
                int var21 = this.field10517;
                int var22 = 256 - this.field10517;
                int var23 = ((arg3 & 0xFF00FF) * var22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var22 >> 8 & 0xFF00);
                while (true) {
                    var11--;
                    if (var11 < 0) {
                        int var24 = arg6 - arg5 & 0x3;
                        while (true) {
                            var24--;
                            if (var24 < 0) {
                                return;
                            }
                            var10++;
                            if (var12 < arg1[var10]) {
                                int var25 = arg0[var10];
                                arg0[var10] = ((var25 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var25 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                                arg1[var10] = var12;
                            }
                            var12 += arg8;
                        }
                    }
                    var10++;
                    if (var12 < arg1[var10]) {
                        int var26 = arg0[var10];
                        arg0[var10] = ((var26 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var26 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var12;
                    }
                    float var27 = arg8 + var12;
                    var10++;
                    if (var27 < arg1[var10]) {
                        int var28 = arg0[var10];
                        arg0[var10] = ((var28 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var28 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var27;
                    }
                    float var29 = arg8 + var27;
                    var10++;
                    if (var29 < arg1[var10]) {
                        int var30 = arg0[var10];
                        arg0[var10] = ((var30 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var30 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var29;
                    }
                    float var31 = arg8 + var29;
                    var10++;
                    if (var31 < arg1[var10]) {
                        int var32 = arg0[var10];
                        arg0[var10] = ((var32 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var31;
                    }
                    var12 = arg8 + var31;
                }
            } else if (arg5 != 0 && arg6 <= this.field10524 - 1) {
                while (true) {
                    var11--;
                    if (var11 < 0) {
                        int var17 = arg6 - arg5 & 0x3;
                        while (true) {
                            var17--;
                            if (var17 < 0) {
                                return;
                            }
                            var10++;
                            if (var12 < arg1[var10]) {
                                arg0[var10 - 1] = arg0[var10];
                            }
                            var12 += arg8;
                        }
                    }
                    var10++;
                    if (var12 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    float var18 = arg8 + var12;
                    var10++;
                    if (var18 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    float var19 = arg8 + var18;
                    var10++;
                    if (var19 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    float var20 = arg8 + var19;
                    var10++;
                    if (var20 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    var12 = arg8 + var20;
                }
            }
        } else if (this.field10517 == 0) {
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var33 = arg6 - arg5 & 0x3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            return;
                        }
                        var10++;
                        if (var12 < arg1[var10]) {
                            arg0[var10] = arg3;
                        }
                        var12 += arg8;
                    }
                }
                var10++;
                if (var12 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                float var34 = arg8 + var12;
                var10++;
                if (var34 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                float var35 = arg8 + var34;
                var10++;
                if (var35 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                float var36 = arg8 + var35;
                var10++;
                if (var36 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                var12 = arg8 + var36;
            }
        } else if (this.field10517 != 254) {
            int var41 = this.field10517;
            int var42 = 256 - this.field10517;
            int var43 = ((arg3 & 0xFF00FF) * var42 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var42 >> 8 & 0xFF00);
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var44 = arg6 - arg5 & 0x3;
                    while (true) {
                        var44--;
                        if (var44 < 0) {
                            return;
                        }
                        var10++;
                        if (var12 < arg1[var10]) {
                            int var45 = arg0[var10];
                            arg0[var10] = ((var45 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var45 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                        }
                        var12 += arg8;
                    }
                }
                var10++;
                if (var12 < arg1[var10]) {
                    int var46 = arg0[var10];
                    arg0[var10] = ((var46 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var46 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                float var47 = arg8 + var12;
                var10++;
                if (var47 < arg1[var10]) {
                    int var48 = arg0[var10];
                    arg0[var10] = ((var48 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var48 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                float var49 = arg8 + var47;
                var10++;
                if (var49 < arg1[var10]) {
                    int var50 = arg0[var10];
                    arg0[var10] = ((var50 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var50 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                float var51 = arg8 + var49;
                var10++;
                if (var51 < arg1[var10]) {
                    int var52 = arg0[var10];
                    arg0[var10] = ((var52 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var52 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                var12 = arg8 + var51;
            }
        } else if (arg5 != 0 && arg6 <= this.field10524 - 1) {
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var37 = arg6 - arg5 & 0x3;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            return;
                        }
                        var10++;
                        if (var12 < arg1[var10]) {
                            arg0[var10 - 1] = arg0[var10];
                        }
                        var12 += arg8;
                    }
                }
                var10++;
                if (var12 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                float var38 = arg8 + var12;
                var10++;
                if (var38 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                float var39 = arg8 + var38;
                var10++;
                if (var39 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                float var40 = arg8 + var39;
                var10++;
                if (var40 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                var12 = arg8 + var40;
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([I[IIIIFFFFFFFFFFFFFFFF)V")
    private final void method4203(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20) {
        int var22 = arg4 - arg3;
        float var23 = 1.0F / (float) var22;
        float var24 = (arg6 - arg5) * var23;
        float var25 = (arg8 - arg7) * var23;
        float var26 = (arg10 - arg9) * var23;
        float var27 = (arg12 - arg11) * var23;
        float var28 = (arg14 - arg13) * var23;
        float var29 = (arg16 - arg15) * var23;
        float var30 = (arg18 - arg17) * var23;
        float var31 = (arg20 - arg19) * var23;
        if (this.field10521) {
            if (arg4 > this.field10524) {
                arg4 = this.field10524;
            }
            if (arg3 < 0) {
                arg5 -= (float) arg3 * var24;
                arg7 -= (float) arg3 * var25;
                arg9 -= (float) arg3 * var26;
                arg11 -= (float) arg3 * var27;
                arg13 -= (float) arg3 * var28;
                arg15 -= (float) arg3 * var29;
                arg17 -= (float) arg3 * var30;
                arg19 -= (float) arg3 * var31;
                arg3 = 0;
            }
        }
        if (arg3 >= arg4) {
            return;
        }
        int var32 = arg4 - arg3;
        int var33 = arg2 + arg3;
        while (var32-- > 0) {
            float var34 = 1.0F / arg5;
            if (var34 < this.field10516[var33]) {
                int var35 = (int) (arg7 * var34 * (float) this.field10538);
                if (this.field10532) {
                    var35 &= this.field10536;
                } else if (var35 < 0) {
                    var35 = 0;
                } else if (var35 > this.field10536) {
                    var35 = this.field10536;
                }
                int var36 = (int) (arg9 * var34 * (float) this.field10538);
                if (this.field10532) {
                    var36 &= this.field10536;
                } else if (var36 < 0) {
                    var36 = 0;
                } else if (var36 > this.field10536) {
                    var36 = this.field10536;
                }
                int var37 = this.field10541[this.field10538 * var36 + var35];
                boolean var38 = true;
                int var39;
                if (this.field10534 == 2) {
                    var39 = var37 >> 24 & 0xFF;
                } else if (this.field10534 == 1) {
                    var39 = var37 == 0 ? 0 : 255;
                } else {
                    var39 = (int) arg13;
                }
                if (var39 != 0) {
                    if (var39 == 255) {
                        int var46 = (int) ((float) (var37 >> 16 & 0xFF) * arg15) & 0xFF00 | 0xFF0000 << 8 | (int) ((float) (var37 >> 8 & 0xFF) * arg17) & 0xFF00 | (int) ((float) (var37 & 0xFF) * arg19) >> 8;
                        if (arg11 != 0.0F) {
                            int var47 = (int) (255.0F - arg11);
                            int var48 = ((this.field10529 & 0xFF00FF) * (int) arg11 & 0xFF00FF00 | (this.field10529 & 0xFF00) * (int) arg11 & 0xFF0000) >>> 8;
                            var46 = (((var46 & 0xFF00FF) * var47 & 0xFF00FF00 | (var46 & 0xFF00) * var47 & 0xFF0000) >>> 8) + var48;
                        }
                        arg0[var33] = var46;
                        this.field10516[var33] = var34;
                    } else {
                        int var40 = (int) ((float) (var37 >> 16 & 0xFF) * arg15) & 0xFF00 | 0xFF0000 << 8 | (int) ((float) (var37 >> 8 & 0xFF) * arg17) & 0xFF00 | (int) ((float) (var37 & 0xFF) * arg19) >> 8;
                        if (arg11 != 0.0F) {
                            int var41 = (int) (255.0F - arg11);
                            int var42 = ((this.field10529 & 0xFF00FF) * (int) arg11 & 0xFF00FF00 | (this.field10529 & 0xFF00) * (int) arg11 & 0xFF0000) >>> 8;
                            var40 = (((var40 & 0xFF00FF) * var41 & 0xFF00FF00 | (var40 & 0xFF00) * var41 & 0xFF0000) >>> 8) + var42;
                        }
                        int var43 = arg0[var33];
                        int var44 = 255 - var39;
                        int var45 = ((var40 & 0xFF00FF) * var39 + (var43 & 0xFF00FF) * var44 & 0xFF00FF00) + ((var40 & 0xFF00) * var39 + (var43 & 0xFF00) * var44 & 0xFF0000) >> 8;
                        arg0[var33] = var45;
                        this.field10516[var33] = var34;
                    }
                }
            }
            var33++;
            arg5 += var24;
            arg7 += var25;
            arg9 += var26;
            arg11 += var27;
            arg13 += var28;
            arg15 += var29;
            arg17 += var30;
            arg19 += var31;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFFFFFFFFFFIIIIIIIIFIFIF)V")
    public final void method4204(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, float arg23, int arg24, float arg25, int arg26, float arg27) {
        if (this.field10546 != arg22) {
            this.field10541 = this.field10518.method3171(arg22);
            if (this.field10541 == null) {
                this.method4212((float) ((int) arg0), (float) ((int) arg1), (float) ((int) arg2), (float) ((int) arg3), (float) ((int) arg4), (float) ((int) arg5), (float) ((int) arg6), (float) ((int) arg7), (float) ((int) arg8), class623.method3557(arg18 | arg19 << 24, -101, arg15), class623.method3557(arg18 | arg20 << 24, -79, arg16), class623.method3557(arg18 | arg21 << 24, -95, arg17));
                return;
            }
            this.field10538 = this.field10518.method3175(arg22) ? 64 : this.field10518.field7664;
            this.field10536 = this.field10538 - 1;
            this.field10534 = this.field10518.method3161(arg22);
        }
        this.field10535 = arg23;
        if (this.field10544 != arg24) {
            this.field10545 = this.field10518.method3171(arg24);
            if (this.field10545 == null) {
                this.method4212((float) ((int) arg0), (float) ((int) arg1), (float) ((int) arg2), (float) ((int) arg3), (float) ((int) arg4), (float) ((int) arg5), (float) ((int) arg6), (float) ((int) arg7), (float) ((int) arg8), class623.method3557(arg18 | arg19 << 24, -110, arg15), class623.method3557(arg18 | arg20 << 24, -96, arg16), class623.method3557(arg18 | arg21 << 24, -103, arg17));
                return;
            }
            this.field10537 = this.field10518.method3175(arg24) ? 64 : this.field10518.field7664;
            this.field10533 = this.field10537 - 1;
        }
        this.field10540 = arg25;
        if (this.field10531 != arg26) {
            this.field10542 = this.field10518.method3171(arg26);
            if (this.field10542 == null) {
                this.method4212((float) ((int) arg0), (float) ((int) arg1), (float) ((int) arg2), (float) ((int) arg3), (float) ((int) arg4), (float) ((int) arg5), (float) ((int) arg6), (float) ((int) arg7), (float) ((int) arg8), class623.method3557(arg18 | arg19 << 24, -74, arg15), class623.method3557(arg18 | arg20 << 24, -111, arg16), class623.method3557(arg18 | arg21 << 24, -115, arg17));
                return;
            }
            this.field10543 = this.field10518.method3175(arg26) ? 64 : this.field10518.field7664;
            this.field10530 = this.field10543 - 1;
        }
        this.field10539 = arg27;
        this.field10529 = arg18;
        float var29 = (float) (arg15 >> 24 & 0xFF);
        float var30 = (float) (arg16 >> 24 & 0xFF);
        float var31 = (float) (arg17 >> 24 & 0xFF);
        float var32 = (float) (arg15 >> 16 & 0xFF);
        float var33 = (float) (arg16 >> 16 & 0xFF);
        float var34 = (float) (arg17 >> 16 & 0xFF);
        float var35 = (float) (arg15 >> 8 & 0xFF);
        float var36 = (float) (arg16 >> 8 & 0xFF);
        float var37 = (float) (arg17 >> 8 & 0xFF);
        float var38 = (float) (arg15 & 0xFF);
        float var39 = (float) (arg16 & 0xFF);
        float var40 = (float) (arg17 & 0xFF);
        float var41 = arg9 / arg6;
        float var42 = arg10 / arg7;
        float var43 = arg11 / arg8;
        float var44 = arg12 / arg6;
        float var45 = arg13 / arg7;
        float var46 = arg14 / arg8;
        float var47 = 1.0F / arg6;
        float var48 = 1.0F / arg7;
        float var49 = 1.0F / arg8;
        float var50 = 1.0F;
        float var51 = 0.0F;
        float var52 = 0.0F;
        float var53 = 0.0F;
        float var54 = 1.0F;
        float var55 = 0.0F;
        float var56 = 0.0F;
        float var57 = 0.0F;
        float var58 = 0.0F;
        float var59 = 0.0F;
        float var60 = 0.0F;
        float var61 = 0.0F;
        float var62 = 0.0F;
        float var63 = 0.0F;
        float var64 = 0.0F;
        float var65 = 0.0F;
        float var66 = 0.0F;
        if (arg0 != arg1) {
            float var67 = arg1 - arg0;
            var56 = (arg4 - arg3) / var67;
            var57 = (var48 - var47) / var67;
            var58 = (var42 - var41) / var67;
            var59 = (var45 - var44) / var67;
            var60 = (float) (arg20 - arg19) / var67;
            var61 = (var30 - var29) / var67;
            var62 = (var33 - var32) / var67;
            var63 = (var36 - var35) / var67;
            var64 = (var39 - var38) / var67;
            var65 = (var51 - var50) / var67;
            var66 = (var54 - var53) / var67;
        }
        float var68 = 0.0F;
        float var69 = 0.0F;
        float var70 = 0.0F;
        float var71 = 0.0F;
        float var72 = 0.0F;
        float var73 = 0.0F;
        float var74 = 0.0F;
        float var75 = 0.0F;
        float var76 = 0.0F;
        float var77 = 0.0F;
        float var78 = 0.0F;
        if (arg1 != arg2) {
            float var79 = arg2 - arg1;
            var68 = (arg5 - arg4) / var79;
            var69 = (var49 - var48) / var79;
            var70 = (var43 - var42) / var79;
            var71 = (var46 - var45) / var79;
            var72 = (float) (arg21 - arg20) / var79;
            var73 = (var31 - var30) / var79;
            var74 = (var34 - var33) / var79;
            var75 = (var37 - var36) / var79;
            var76 = (var40 - var39) / var79;
            var77 = (var52 - var51) / var79;
            var78 = (var55 - var54) / var79;
        }
        float var80 = 0.0F;
        float var81 = 0.0F;
        float var82 = 0.0F;
        float var83 = 0.0F;
        float var84 = 0.0F;
        float var85 = 0.0F;
        float var86 = 0.0F;
        float var87 = 0.0F;
        float var88 = 0.0F;
        float var89 = 0.0F;
        float var90 = 0.0F;
        if (arg0 != arg2) {
            float var91 = arg0 - arg2;
            var80 = (arg3 - arg5) / var91;
            var81 = (var47 - var49) / var91;
            var82 = (var41 - var43) / var91;
            var83 = (var44 - var46) / var91;
            var84 = (float) (arg19 - arg21) / var91;
            var85 = (var29 - var31) / var91;
            var86 = (var32 - var34) / var91;
            var87 = (var35 - var37) / var91;
            var88 = (var38 - var40) / var91;
            var89 = (var50 - var52) / var91;
            var90 = (var53 - var55) / var91;
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (!(arg0 >= (float) this.field10523)) {
                if (arg1 > (float) this.field10523) {
                    arg1 = this.field10523;
                }
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                if (arg1 < arg2) {
                    float var92 = arg3;
                    float var93 = var47;
                    float var94 = var41;
                    float var95 = var44;
                    int var96 = arg19;
                    float var97 = var29;
                    float var98 = var32;
                    float var99 = var35;
                    float var100 = var38;
                    float var101 = var50;
                    float var102 = var53;
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var56;
                        var92 -= arg0 * var80;
                        var47 -= arg0 * var57;
                        var93 -= arg0 * var81;
                        var41 -= arg0 * var58;
                        var94 -= arg0 * var82;
                        var44 -= arg0 * var59;
                        var95 -= arg0 * var83;
                        arg19 = (int) ((float) arg19 - arg0 * var60);
                        var96 = (int) ((float) var96 - arg0 * var84);
                        var29 -= arg0 * var61;
                        var97 -= arg0 * var85;
                        var32 -= arg0 * var62;
                        var98 -= arg0 * var86;
                        var35 -= arg0 * var63;
                        var99 -= arg0 * var87;
                        var38 -= arg0 * var64;
                        var100 -= arg0 * var88;
                        var50 -= arg0 * var65;
                        var101 -= arg0 * var89;
                        var53 -= arg0 * var66;
                        var102 -= arg0 * var90;
                        arg0 = 0.0F;
                    }
                    if (arg1 < 0.0F) {
                        arg4 -= arg1 * var68;
                        var48 -= arg1 * var69;
                        var42 -= arg1 * var70;
                        var45 -= arg1 * var71;
                        arg20 = (int) ((float) arg20 - arg1 * var72);
                        var30 -= arg1 * var73;
                        var33 -= arg1 * var74;
                        var36 -= arg1 * var75;
                        var39 -= arg1 * var76;
                        var51 -= arg1 * var77;
                        var54 -= arg1 * var78;
                        arg1 = 0.0F;
                    }
                    if (arg0 != arg1 && var80 < var56 || arg0 == arg1 && var80 > var68) {
                        float var103 = arg2 - arg1;
                        float var104 = arg1 - arg0;
                        float var105 = (float) this.field10514[(int) arg0];
                        while (--var104 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var105, (int) var92, (int) arg3, var93, var47, var94, var41, var95, var44, (float) var96, (float) arg19, var97, var29, var98, var32, var99, var35, var100, var38, var101, var50, var102, var53);
                            arg3 += var56;
                            var92 += var80;
                            var47 += var57;
                            var93 += var81;
                            var41 += var58;
                            var94 += var82;
                            var44 += var59;
                            var95 += var83;
                            arg19 = (int) ((float) arg19 + var60);
                            var96 = (int) ((float) var96 + var84);
                            var29 += var61;
                            var97 += var85;
                            var32 += var62;
                            var98 += var86;
                            var35 += var63;
                            var99 += var87;
                            var38 += var64;
                            var100 += var88;
                            var50 += var65;
                            var101 += var89;
                            var53 += var66;
                            var102 += var66;
                            var105 += this.field10522;
                        }
                        while (--var103 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var105, (int) var92, (int) arg4, var93, var48, var94, var42, var95, var45, (float) var96, (float) arg20, var97, var30, var98, var33, var99, var36, var100, var39, var101, var51, var102, var54);
                            arg4 += var68;
                            var92 += var80;
                            var48 += var69;
                            var93 += var81;
                            var42 += var70;
                            var94 += var82;
                            var45 += var71;
                            var95 += var83;
                            arg20 = (int) ((float) arg20 + var72);
                            var96 = (int) ((float) var96 + var84);
                            var30 += var73;
                            var97 += var85;
                            var33 += var74;
                            var98 += var86;
                            var36 += var75;
                            var99 += var87;
                            var39 += var76;
                            var100 += var88;
                            var51 += var77;
                            var101 += var89;
                            var54 += var78;
                            var102 += var90;
                            var105 += this.field10522;
                        }
                    } else {
                        float var106 = arg2 - arg1;
                        float var107 = arg1 - arg0;
                        float var108 = (float) this.field10514[(int) arg0];
                        while (--var107 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var108, (int) arg3, (int) var92, var47, var93, var41, var94, var44, var95, (float) arg19, (float) var96, var29, var97, var32, var98, var35, var99, var38, var100, var50, var101, var53, var102);
                            arg3 += var56;
                            var92 += var80;
                            var47 += var57;
                            var93 += var81;
                            var41 += var58;
                            var94 += var82;
                            var44 += var59;
                            var95 += var83;
                            arg19 = (int) ((float) arg19 + var60);
                            var96 = (int) ((float) var96 + var84);
                            var29 += var61;
                            var97 += var85;
                            var32 += var62;
                            var98 += var86;
                            var35 += var63;
                            var99 += var87;
                            var38 += var64;
                            var100 += var88;
                            var50 += var65;
                            var101 += var89;
                            var53 += var66;
                            var102 += var90;
                            var108 += this.field10522;
                        }
                        while (--var106 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var108, (int) arg4, (int) var92, var48, var93, var42, var94, var45, var95, (float) arg20, (float) var96, var30, var97, var33, var98, var36, var99, var39, var100, var51, var101, var54, var102);
                            arg4 += var68;
                            var92 += var80;
                            var48 += var69;
                            var93 += var81;
                            var42 += var70;
                            var94 += var82;
                            var45 += var71;
                            var95 += var83;
                            arg20 = (int) ((float) arg20 + var72);
                            var96 = (int) ((float) var96 + var84);
                            var30 += var73;
                            var97 += var85;
                            var33 += var74;
                            var98 += var86;
                            var36 += var75;
                            var99 += var87;
                            var39 += var76;
                            var100 += var88;
                            var51 += var77;
                            var101 += var89;
                            var54 += var78;
                            var102 += var90;
                            var108 += this.field10522;
                        }
                    }
                } else {
                    float var109 = arg3;
                    float var110 = var47;
                    float var111 = var41;
                    float var112 = var44;
                    int var113 = arg19;
                    float var114 = var29;
                    float var115 = var32;
                    float var116 = var35;
                    float var117 = var38;
                    float var118 = var50;
                    float var119 = var53;
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var56;
                        var109 -= arg0 * var80;
                        var47 -= arg0 * var57;
                        var110 -= arg0 * var81;
                        var41 -= arg0 * var58;
                        var111 -= arg0 * var82;
                        var44 -= arg0 * var59;
                        var112 -= arg0 * var83;
                        arg19 = (int) ((float) arg19 - arg0 * var60);
                        var113 = (int) ((float) var113 - arg0 * var84);
                        var29 -= arg0 * var61;
                        var114 -= arg0 * var85;
                        var32 -= arg0 * var62;
                        var115 -= arg0 * var86;
                        var35 -= arg0 * var63;
                        var116 -= arg0 * var87;
                        var38 -= arg0 * var64;
                        var117 -= arg0 * var88;
                        var50 -= arg0 * var65;
                        var118 -= arg0 * var89;
                        var53 -= arg0 * var66;
                        var119 -= arg0 * var90;
                        arg0 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var68;
                        var49 -= arg2 * var69;
                        var43 -= arg2 * var70;
                        var46 -= arg2 * var71;
                        arg21 = (int) ((float) arg21 - arg2 * var72);
                        var31 -= arg2 * var73;
                        var34 -= arg2 * var74;
                        var37 -= arg2 * var75;
                        var40 -= arg2 * var76;
                        var52 -= arg2 * var77;
                        var55 -= arg2 * var78;
                        arg2 = 0.0F;
                    }
                    if (arg0 != arg2 && var80 < var56 || arg0 == arg2 && var68 > var56) {
                        float var120 = arg1 - arg2;
                        float var121 = arg2 - arg0;
                        float var122 = (float) this.field10514[(int) arg0];
                        while (--var121 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var122, (int) var109, (int) arg3, var110, var47, var111, var41, var112, var44, (float) var113, (float) arg19, var114, var29, var115, var32, var116, var35, var117, var38, var118, var50, var119, var53);
                            arg3 += var56;
                            var109 += var80;
                            var47 += var57;
                            var110 += var81;
                            var41 += var58;
                            var111 += var82;
                            var44 += var59;
                            var112 += var83;
                            arg19 = (int) ((float) arg19 + var60);
                            var113 = (int) ((float) var113 + var84);
                            var29 += var61;
                            var114 += var85;
                            var32 += var62;
                            var115 += var86;
                            var35 += var63;
                            var116 += var87;
                            var38 += var64;
                            var117 += var88;
                            var50 += var65;
                            var118 += var89;
                            var53 += var66;
                            var119 += var90;
                            var122 += this.field10522;
                        }
                        while (--var120 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var122, (int) arg5, (int) arg3, var49, var47, var43, var41, var46, var44, (float) arg21, (float) arg19, var31, var29, var34, var32, var37, var35, var40, var38, var52, var50, var55, var53);
                            arg5 += var68;
                            arg3 += var56;
                            var49 += var69;
                            var47 += var57;
                            var43 += var70;
                            var41 += var58;
                            var46 += var71;
                            var44 += var59;
                            arg21 = (int) ((float) arg21 + var72);
                            arg19 = (int) ((float) arg19 + var60);
                            var31 += var73;
                            var29 += var61;
                            var34 += var74;
                            var32 += var62;
                            var37 += var75;
                            var35 += var63;
                            var40 += var76;
                            var38 += var64;
                            var52 += var77;
                            var50 += var65;
                            var55 += var78;
                            var53 += var66;
                            var122 += this.field10522;
                        }
                    } else {
                        float var123 = arg1 - arg2;
                        float var124 = arg2 - arg0;
                        float var125 = (float) this.field10514[(int) arg0];
                        while (--var124 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var125, (int) arg3, (int) var109, var47, var110, var41, var111, var44, var112, (float) arg19, (float) var113, var29, var114, var32, var115, var35, var116, var38, var117, var50, var118, var53, var119);
                            var109 += var80;
                            arg3 += var56;
                            var110 += var81;
                            var47 += var57;
                            var111 += var82;
                            var41 += var58;
                            var112 += var83;
                            var44 += var59;
                            var113 = (int) ((float) var113 + var84);
                            arg19 = (int) ((float) arg19 + var60);
                            var114 += var85;
                            var29 += var61;
                            var115 += var86;
                            var32 += var62;
                            var116 += var87;
                            var35 += var63;
                            var117 += var88;
                            var38 += var64;
                            var118 += var89;
                            var50 += var65;
                            var119 += var90;
                            var53 += var66;
                            var125 += this.field10522;
                        }
                        while (--var123 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var125, (int) arg3, (int) arg5, var47, var49, var41, var43, var44, var46, (float) arg19, (float) arg21, var29, var31, var32, var34, var35, var37, var38, var40, var50, var52, var53, var55);
                            arg3 += var56;
                            arg5 += var68;
                            var47 += var57;
                            var49 += var69;
                            var41 += var58;
                            var43 += var70;
                            var44 += var59;
                            var46 += var71;
                            arg19 = (int) ((float) arg19 + var60);
                            arg21 = (int) ((float) arg21 + var72);
                            var29 += var61;
                            var31 += var73;
                            var32 += var62;
                            var34 += var74;
                            var35 += var63;
                            var37 += var75;
                            var38 += var64;
                            var40 += var76;
                            var50 += var65;
                            var52 += var77;
                            var53 += var66;
                            var55 += var78;
                            var125 += this.field10522;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (!(arg1 >= (float) this.field10523)) {
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                if (arg0 > (float) this.field10523) {
                    arg0 = this.field10523;
                }
                if (arg2 < arg0) {
                    float var126 = arg4;
                    float var127 = var48;
                    float var128 = var42;
                    float var129 = var45;
                    int var130 = arg20;
                    float var131 = var30;
                    float var132 = var33;
                    float var133 = var36;
                    float var134 = var39;
                    float var135 = var51;
                    float var136 = var54;
                    if (arg1 < 0.0F) {
                        var126 = arg4 - arg1 * var56;
                        arg4 -= arg1 * var68;
                        var127 = var48 - arg1 * var57;
                        var48 -= arg1 * var69;
                        var128 = var42 - arg1 * var58;
                        var42 -= arg1 * var70;
                        var129 = var45 - arg1 * var59;
                        var45 -= arg1 * var71;
                        var130 = (int) ((float) arg20 - arg1 * var60);
                        arg20 = (int) ((float) arg20 - arg1 * var72);
                        var131 = var30 - arg1 * var61;
                        var30 -= arg1 * var73;
                        var132 = var33 - arg1 * var62;
                        var33 -= arg1 * var74;
                        var133 = var36 - arg1 * var63;
                        var36 -= arg1 * var75;
                        var134 = var39 - arg1 * var64;
                        var39 -= arg1 * var76;
                        var135 = var51 - arg1 * var65;
                        var51 -= arg1 * var77;
                        var136 = var54 - arg1 * var66;
                        var54 -= arg1 * var78;
                        arg1 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var80;
                        var49 -= arg2 * var81;
                        var43 -= arg2 * var82;
                        var46 -= arg2 * var83;
                        arg21 = (int) ((float) arg21 - arg2 * var84);
                        var31 -= arg2 * var85;
                        var34 -= arg2 * var86;
                        var37 -= arg2 * var87;
                        var40 -= arg2 * var88;
                        var52 -= arg2 * var89;
                        var55 -= arg2 * var90;
                        arg2 = 0.0F;
                    }
                    if (arg1 != arg2 && var56 < var68 || arg1 == arg2 && var56 > var80) {
                        float var137 = arg0 - arg2;
                        float var138 = arg2 - arg1;
                        float var139 = (float) this.field10514[(int) arg1];
                        while (--var138 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var139, (int) var126, (int) arg4, var127, var48, var128, var42, var129, var45, (float) var130, (float) arg20, var131, var30, var132, var33, var133, var36, var134, var39, var135, var51, var136, var54);
                            var126 += var56;
                            arg4 += var68;
                            var127 += var57;
                            var48 += var69;
                            var128 += var58;
                            var42 += var70;
                            var129 += var59;
                            var45 += var71;
                            var130 = (int) ((float) var130 + var60);
                            arg20 = (int) ((float) arg20 + var72);
                            var131 += var61;
                            var30 += var73;
                            var132 += var62;
                            var33 += var74;
                            var133 += var63;
                            var36 += var75;
                            var134 += var64;
                            var39 += var76;
                            var135 += var65;
                            var51 += var77;
                            var136 += var66;
                            var54 += var78;
                            var139 += this.field10522;
                        }
                        while (--var137 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var139, (int) var126, (int) arg5, var127, var49, var128, var43, var129, var46, (float) var130, (float) arg21, var131, var31, var132, var34, var133, var37, var134, var40, var135, var52, var136, var55);
                            var126 += var56;
                            arg5 += var80;
                            var127 += var57;
                            var49 += var81;
                            var128 += var58;
                            var43 += var82;
                            var129 += var59;
                            var46 += var83;
                            var130 = (int) ((float) var130 + var60);
                            arg21 = (int) ((float) arg21 + var84);
                            var131 += var61;
                            var31 += var85;
                            var132 += var62;
                            var34 += var86;
                            var133 += var63;
                            var37 += var87;
                            var134 += var64;
                            var40 += var88;
                            var135 += var65;
                            var52 += var89;
                            var136 += var66;
                            var55 += var90;
                            var139 += this.field10522;
                        }
                    } else {
                        float var140 = arg0 - arg2;
                        float var141 = arg2 - arg1;
                        float var142 = (float) this.field10514[(int) arg1];
                        while (--var141 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var142, (int) arg4, (int) var126, var48, var127, var42, var128, var45, var129, (float) arg20, (float) var130, var30, var131, var33, var132, var36, var133, var39, var134, var51, var135, var54, var136);
                            arg4 += var68;
                            var126 += var56;
                            var48 += var69;
                            var127 += var57;
                            var42 += var70;
                            var128 += var58;
                            var45 += var71;
                            var129 += var59;
                            arg20 = (int) ((float) arg20 + var72);
                            var130 = (int) ((float) var130 + var60);
                            var30 += var73;
                            var131 += var61;
                            var33 += var74;
                            var132 += var62;
                            var36 += var75;
                            var133 += var63;
                            var39 += var76;
                            var134 += var64;
                            var52 += var77;
                            var135 += var65;
                            var54 += var78;
                            var136 += var66;
                            var142 += this.field10522;
                        }
                        while (--var140 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var142, (int) arg5, (int) var126, var49, var127, var43, var128, var46, var129, (float) arg21, (float) var130, var31, var131, var34, var132, var37, var133, var40, var134, var52, var135, var55, var136);
                            arg5 += var80;
                            var126 += var56;
                            var49 += var81;
                            var127 += var57;
                            var43 += var82;
                            var128 += var58;
                            var46 += var83;
                            var129 += var59;
                            arg21 = (int) ((float) arg21 + var84);
                            var130 = (int) ((float) var130 + var60);
                            var31 += var85;
                            var131 += var61;
                            var34 += var86;
                            var132 += var62;
                            var37 += var87;
                            var133 += var63;
                            var40 += var88;
                            var134 += var64;
                            var52 += var89;
                            var135 += var65;
                            var55 += var90;
                            var136 += var66;
                            var142 += this.field10522;
                        }
                    }
                } else {
                    float var143 = arg4;
                    float var144 = var48;
                    float var145 = var42;
                    float var146 = var45;
                    int var147 = arg20;
                    float var148 = var30;
                    float var149 = var33;
                    float var150 = var36;
                    float var151 = var39;
                    float var152 = var51;
                    float var153 = var54;
                    if (arg1 < 0.0F) {
                        var143 = arg4 - arg1 * var56;
                        arg4 -= arg1 * var68;
                        var144 = var48 - arg1 * var57;
                        var48 -= arg1 * var69;
                        var145 = var42 - arg1 * var58;
                        var42 -= arg1 * var70;
                        var146 = var45 - arg1 * var59;
                        var45 -= arg1 * var71;
                        var147 = (int) ((float) arg20 - arg1 * var60);
                        arg20 = (int) ((float) arg20 - arg1 * var72);
                        var148 = var30 - arg1 * var61;
                        var30 -= arg1 * var73;
                        var149 = var33 - arg1 * var62;
                        var33 -= arg1 * var74;
                        var150 = var36 - arg1 * var63;
                        var36 -= arg1 * var75;
                        var151 = var39 - arg1 * var64;
                        var39 -= arg1 * var76;
                        var152 = var51 - arg1 * var65;
                        var51 -= arg1 * var77;
                        var153 = var54 - arg1 * var66;
                        var54 -= arg1 * var78;
                        arg1 = 0.0F;
                    }
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var80;
                        var47 -= arg0 * var81;
                        var41 -= arg0 * var82;
                        var44 -= arg0 * var83;
                        arg19 = (int) ((float) arg19 - arg0 * var84);
                        var29 -= arg0 * var85;
                        var32 -= arg0 * var86;
                        var35 -= arg0 * var87;
                        var38 -= arg0 * var88;
                        var50 -= arg0 * var89;
                        var53 -= arg0 * var90;
                        arg0 = 0.0F;
                    }
                    float var154 = arg2 - arg0;
                    float var155 = arg0 - arg1;
                    float var156 = (float) this.field10514[(int) arg1];
                    if (var56 < var68) {
                        while (--var155 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var156, (int) var143, (int) arg4, var144, var48, var145, var42, var146, var45, (float) var147, (float) arg20, var148, var30, var149, var33, var150, var36, var151, var39, var152, var51, var153, var54);
                            var143 += var56;
                            arg4 += var68;
                            var144 += var57;
                            var48 += var69;
                            var145 += var58;
                            var42 += var70;
                            var146 += var59;
                            var45 += var71;
                            var147 = (int) ((float) var147 + var60);
                            arg20 = (int) ((float) arg20 + var72);
                            var148 += var61;
                            var30 += var73;
                            var149 += var62;
                            var33 += var74;
                            var150 += var63;
                            var36 += var75;
                            var151 += var64;
                            var39 += var76;
                            var152 += var65;
                            var51 += var77;
                            var153 += var66;
                            var54 += var78;
                            var156 += this.field10522;
                        }
                        while (--var154 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var156, (int) arg3, (int) arg4, var47, var48, var41, var42, var44, var45, (float) arg19, (float) arg20, var29, var30, var32, var33, var35, var36, var38, var39, var50, var51, var53, var54);
                            arg3 += var80;
                            arg4 += var68;
                            var47 += var81;
                            var48 += var69;
                            var41 += var82;
                            var42 += var70;
                            var44 += var83;
                            var45 += var71;
                            arg19 = (int) ((float) arg19 + var84);
                            arg20 = (int) ((float) arg20 + var72);
                            var29 += var85;
                            var30 += var73;
                            var32 += var86;
                            var33 += var74;
                            var35 += var87;
                            var36 += var75;
                            var38 += var88;
                            var39 += var76;
                            var50 += var89;
                            var51 += var77;
                            var53 += var90;
                            var54 += var78;
                            var156 += this.field10522;
                        }
                    } else {
                        while (--var155 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var156, (int) arg4, (int) var143, var48, var144, var42, var145, var45, var146, (float) arg20, (float) var147, var30, var148, var33, var149, var36, var150, var39, var151, var51, var152, var54, var153);
                            arg4 += var68;
                            var143 += var56;
                            var48 += var69;
                            var144 += var57;
                            var42 += var70;
                            var145 += var58;
                            var45 += var71;
                            var146 += var59;
                            arg20 = (int) ((float) arg20 + var72);
                            var147 = (int) ((float) var147 + var60);
                            var30 += var73;
                            var148 += var61;
                            var33 += var74;
                            var149 += var62;
                            var36 += var75;
                            var150 += var63;
                            var39 += var76;
                            var151 += var64;
                            var51 += var77;
                            var152 += var65;
                            var54 += var78;
                            var153 += var66;
                            var156 += this.field10522;
                        }
                        while (--var154 >= 0.0F) {
                            this.method4205(this.field10519, this.field10541, (int) var156, (int) arg4, (int) arg3, var48, var47, var42, var41, var45, var44, (float) arg20, (float) arg19, var30, var29, var33, var32, var36, var35, var39, var38, var51, var50, var54, var53);
                            arg4 += var68;
                            arg3 += var80;
                            var48 += var69;
                            var47 += var81;
                            var42 += var70;
                            var41 += var82;
                            var45 += var71;
                            var44 += var83;
                            arg20 = (int) ((float) arg20 + var72);
                            arg19 = (int) ((float) arg19 + var84);
                            var30 += var73;
                            var29 += var85;
                            var33 += var74;
                            var32 += var86;
                            var36 += var75;
                            var35 += var87;
                            var39 += var76;
                            var38 += var88;
                            var51 += var77;
                            var50 += var89;
                            var54 += var78;
                            var53 += var90;
                            var156 += this.field10522;
                        }
                    }
                }
            }
        } else if (!(arg2 >= (float) this.field10523)) {
            if (arg0 > (float) this.field10523) {
                arg0 = this.field10523;
            }
            if (arg1 > (float) this.field10523) {
                arg1 = this.field10523;
            }
            if (arg0 < arg1) {
                float var157 = arg5;
                float var158 = var49;
                float var159 = var43;
                float var160 = var46;
                int var161 = arg21;
                float var162 = var31;
                float var163 = var34;
                float var164 = var37;
                float var165 = var40;
                float var166 = var52;
                float var167 = var55;
                if (arg2 < 0.0F) {
                    arg5 -= arg2 * var80;
                    var157 -= arg2 * var68;
                    var49 -= arg2 * var81;
                    var158 -= arg2 * var69;
                    var43 -= arg2 * var82;
                    var159 -= arg2 * var70;
                    var46 -= arg2 * var83;
                    var160 -= arg2 * var71;
                    arg21 = (int) ((float) arg21 - var84 * 3.0F);
                    var161 = (int) ((float) var161 - arg2 * var72);
                    var31 -= arg2 * var85;
                    var162 -= arg2 * var73;
                    var34 -= arg2 * var86;
                    var163 -= arg2 * var74;
                    var37 -= arg2 * var87;
                    var164 -= arg2 * var75;
                    var40 -= arg2 * var88;
                    var165 -= arg2 * var76;
                    var52 -= arg2 * var89;
                    var166 -= arg2 * var77;
                    var55 -= arg2 * var90;
                    var167 -= arg2 * var78;
                    arg2 = 0.0F;
                }
                if (arg0 < 0.0F) {
                    arg3 -= arg0 * var56;
                    var47 -= arg0 * var57;
                    var41 -= arg0 * var58;
                    var44 -= arg0 * var59;
                    arg19 = (int) ((float) arg19 - arg0 * var60);
                    var29 -= arg0 * var61;
                    var32 -= arg0 * var62;
                    var35 -= arg0 * var63;
                    var38 -= arg0 * var64;
                    var50 -= arg0 * var65;
                    var53 -= arg0 * var66;
                    arg0 = 0.0F;
                }
                if (var68 < var80) {
                    float var168 = arg1 - arg0;
                    float var169 = arg0 - arg2;
                    float var170 = (float) this.field10514[(int) arg2];
                    while (--var169 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var170, (int) var157, (int) arg5, var158, var49, var159, var43, var160, var46, (float) var161, (float) arg21, var162, var31, var163, var34, var164, var37, var165, var40, var166, var52, var167, var55);
                        var157 += var68;
                        arg5 += var80;
                        var158 += var69;
                        var49 += var81;
                        var159 += var70;
                        var43 += var82;
                        var160 += var71;
                        var46 += var83;
                        var161 = (int) ((float) var161 + var72);
                        arg21 = (int) ((float) arg21 + var84);
                        var162 += var73;
                        var31 += var85;
                        var163 += var74;
                        var34 += var86;
                        var164 += var75;
                        var37 += var87;
                        var165 += var76;
                        var40 += var88;
                        var166 += var77;
                        var52 += var89;
                        var167 += var78;
                        var55 += var90;
                        var170 += this.field10522;
                    }
                    while (--var168 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var170, (int) var157, (int) arg3, var158, var47, var159, var41, var160, var44, (float) var161, (float) arg19, var162, var29, var163, var32, var164, var35, var165, var38, var166, var50, var167, var53);
                        var157 += var68;
                        arg3 += var56;
                        var158 += var69;
                        var47 += var57;
                        var159 += var70;
                        var41 += var58;
                        var160 += var71;
                        var44 += var59;
                        var161 = (int) ((float) var161 + var72);
                        arg19 = (int) ((float) arg19 + var60);
                        var162 += var73;
                        var29 += var61;
                        var163 += var74;
                        var32 += var62;
                        var164 += var75;
                        var35 += var63;
                        var165 += var76;
                        var38 += var64;
                        var166 += var77;
                        var50 += var65;
                        var167 += var78;
                        var53 += var66;
                        var170 += this.field10522;
                    }
                } else {
                    float var171 = arg1 - arg0;
                    float var172 = arg0 - arg2;
                    float var173 = (float) this.field10514[(int) arg2];
                    while (--var172 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var173, (int) arg5, (int) var157, var49, var158, var43, var159, var46, var160, (float) arg21, (float) var161, var31, var162, var34, var163, var37, var164, var40, var165, var52, var166, var55, var167);
                        arg5 += var80;
                        var157 += var68;
                        var49 += var81;
                        var158 += var69;
                        var43 += var82;
                        var159 += var70;
                        var46 += var83;
                        var160 += var71;
                        arg21 = (int) ((float) arg21 + var84);
                        var161 = (int) ((float) var161 + var72);
                        var31 += var85;
                        var162 += var73;
                        var34 += var86;
                        var163 += var74;
                        var37 += var87;
                        var164 += var75;
                        var40 += var88;
                        var165 += var76;
                        var52 += var89;
                        var166 += var77;
                        var55 += var90;
                        var167 += var78;
                        var173 += this.field10522;
                    }
                    while (--var171 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var173, (int) arg3, (int) var157, var47, var158, var41, var159, var44, var160, (float) arg19, (float) var161, var29, var162, var32, var163, var35, var164, var38, var165, var50, var166, var53, var167);
                        arg3 += var56;
                        var157 += var68;
                        var47 += var57;
                        var158 += var69;
                        var41 += var58;
                        var159 += var70;
                        var44 += var59;
                        var160 += var71;
                        arg19 = (int) ((float) arg19 + var60);
                        var161 = (int) ((float) var161 + var72);
                        var29 += var61;
                        var162 += var73;
                        var32 += var62;
                        var163 += var74;
                        var35 += var63;
                        var164 += var75;
                        var38 += var64;
                        var165 += var76;
                        var50 += var65;
                        var166 += var77;
                        var53 += var66;
                        var167 += var78;
                        var173 += this.field10522;
                    }
                }
            } else {
                float var174 = arg5;
                float var175 = var49;
                float var176 = var43;
                float var177 = var46;
                int var178 = arg21;
                float var179 = var31;
                float var180 = var34;
                float var181 = var37;
                float var182 = var40;
                float var183 = var52;
                float var184 = var55;
                if (arg2 < 0.0F) {
                    arg5 -= arg2 * var80;
                    var174 -= arg2 * var68;
                    var49 -= arg2 * var81;
                    var175 -= arg2 * var69;
                    var43 -= arg2 * var82;
                    var176 -= arg2 * var70;
                    var46 -= arg2 * var83;
                    var177 -= arg2 * var71;
                    arg21 = (int) ((float) arg21 - var84 * 3.0F);
                    var178 = (int) ((float) var178 - arg2 * var72);
                    var31 -= arg2 * var85;
                    var179 -= arg2 * var73;
                    var34 -= arg2 * var86;
                    var180 -= arg2 * var74;
                    var37 -= arg2 * var87;
                    var181 -= arg2 * var75;
                    var40 -= arg2 * var88;
                    var182 -= arg2 * var76;
                    var52 -= arg2 * var89;
                    var183 -= arg2 * var77;
                    var55 -= arg2 * var90;
                    var184 -= arg2 * var78;
                    arg2 = 0.0F;
                }
                if (arg1 < 0.0F) {
                    arg4 -= arg1 * var56;
                    var48 -= arg1 * var57;
                    var42 -= arg1 * var58;
                    var45 -= arg1 * var59;
                    arg20 = (int) ((float) arg20 - arg1 * var60);
                    var30 -= arg1 * var61;
                    var33 -= arg1 * var62;
                    var36 -= arg1 * var63;
                    var39 -= arg1 * var64;
                    var51 -= arg1 * var65;
                    var54 -= arg1 * var66;
                    arg1 = 0.0F;
                }
                if (var68 < var80) {
                    float var185 = arg0 - arg1;
                    float var186 = arg1 - arg2;
                    float var187 = (float) this.field10514[(int) arg2];
                    while (--var186 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var187, (int) var174, (int) arg5, var175, var49, var176, var43, var177, var46, (float) var178, (float) arg21, var179, var31, var180, var34, var181, var37, var182, var40, var183, var52, var184, var55);
                        var174 += var68;
                        arg5 += var80;
                        var175 += var69;
                        var49 += var81;
                        var176 += var70;
                        var43 += var82;
                        var177 += var71;
                        var46 += var83;
                        var178 = (int) ((float) var178 + var72);
                        arg21 = (int) ((float) arg21 + var84);
                        var179 += var73;
                        var31 += var85;
                        var180 += var74;
                        var34 += var86;
                        var181 += var75;
                        var37 += var87;
                        var182 += var76;
                        var40 += var88;
                        var183 += var77;
                        var52 += var89;
                        var184 += var78;
                        var55 += var90;
                        var187 += this.field10522;
                    }
                    while (--var185 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var187, (int) arg4, (int) arg5, var48, var49, var42, var43, var45, var46, (float) arg20, (float) arg21, var30, var31, var33, var34, var36, var37, var39, var40, var51, var52, var54, var55);
                        arg4 += var56;
                        arg5 += var80;
                        var48 += var57;
                        var49 += var81;
                        var42 += var58;
                        var43 += var82;
                        var45 += var59;
                        var46 += var83;
                        arg20 = (int) ((float) arg20 + var60);
                        arg21 = (int) ((float) arg21 + var84);
                        var30 += var61;
                        var31 += var85;
                        var33 += var62;
                        var34 += var86;
                        var36 += var63;
                        var37 += var87;
                        var39 += var64;
                        var40 += var88;
                        var51 += var65;
                        var52 += var89;
                        var54 += var66;
                        var55 += var90;
                        var187 += this.field10522;
                    }
                } else {
                    float var188 = arg0 - arg1;
                    float var189 = arg1 - arg2;
                    float var190 = (float) this.field10514[(int) arg2];
                    while (--var189 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var190, (int) arg5, (int) var174, var49, var175, var43, var176, var46, var177, (float) arg21, (float) var178, var31, var179, var34, var180, var37, var181, var40, var182, var52, var183, var55, var184);
                        arg5 += var80;
                        var174 += var68;
                        var49 += var81;
                        var175 += var69;
                        var43 += var82;
                        var176 += var70;
                        var46 += var83;
                        var177 += var71;
                        arg21 = (int) ((float) arg21 + var84);
                        var178 = (int) ((float) var178 + var72);
                        var31 += var85;
                        var179 += var73;
                        var34 += var86;
                        var180 += var74;
                        var37 += var87;
                        var181 += var75;
                        var40 += var88;
                        var182 += var76;
                        var52 += var89;
                        var183 += var77;
                        var55 += var90;
                        var184 += var78;
                        var190 += this.field10522;
                    }
                    while (--var188 >= 0.0F) {
                        this.method4205(this.field10519, this.field10541, (int) var190, (int) arg5, (int) arg4, var49, var48, var43, var42, var46, var45, (float) arg21, (float) arg20, var31, var30, var34, var33, var37, var36, var40, var39, var52, var51, var55, var54);
                        arg5 += var80;
                        arg4 += var56;
                        var49 += var81;
                        var48 += var57;
                        var43 += var82;
                        var42 += var58;
                        var46 += var83;
                        var45 += var59;
                        arg21 = (int) ((float) arg21 + var84);
                        arg20 = (int) ((float) arg20 + var60);
                        var31 += var85;
                        var30 += var61;
                        var34 += var86;
                        var33 += var62;
                        var37 += var87;
                        var36 += var63;
                        var40 += var88;
                        var39 += var64;
                        var52 += var89;
                        var51 += var65;
                        var55 += var90;
                        var54 += var66;
                        var190 += this.field10522;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([I[IIIIFFFFFFFFFFFFFFFFFFFF)V")
    private final void method4205(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, float arg21, float arg22, float arg23, float arg24) {
        int var26 = arg4 - arg3;
        float var27 = 1.0F / (float) var26;
        float var28 = (arg6 - arg5) * var27;
        float var29 = (arg8 - arg7) * var27;
        float var30 = (arg10 - arg9) * var27;
        float var31 = (arg12 - arg11) * var27;
        float var32 = (arg16 - arg15) * var27;
        float var33 = (arg18 - arg17) * var27;
        float var34 = (arg20 - arg19) * var27;
        float var35 = (arg22 - arg21) * var27;
        float var36 = (arg24 - arg23) * var27;
        if (this.field10521) {
            if (arg4 > this.field10524) {
                arg4 = this.field10524;
            }
            if (arg3 < 0) {
                arg5 -= (float) arg3 * var28;
                arg7 -= (float) arg3 * var29;
                arg9 -= (float) arg3 * var30;
                arg11 -= (float) arg3 * var31;
                arg15 -= (float) arg3 * var32;
                arg17 -= (float) arg3 * var33;
                arg19 -= (float) arg3 * var34;
                arg21 -= (float) arg3 * var35;
                arg23 -= (float) arg3 * var36;
                arg3 = 0;
            }
        }
        if (arg3 >= arg4) {
            return;
        }
        int var37 = arg4 - arg3;
        int var38 = arg2 + arg3;
        while (var37-- > 0) {
            float var39 = 1.0F / arg5;
            if (var39 < this.field10516[var38]) {
                float var40 = arg7 * var39;
                float var41 = arg9 * var39;
                int var42 = (int) ((float) this.field10538 * var40 * this.field10535) & this.field10536;
                int var43 = (int) ((float) this.field10538 * var41 * this.field10535) & this.field10536;
                int var44 = this.field10541[this.field10538 * var43 + var42];
                int var45 = (int) ((float) this.field10537 * var40 * this.field10540) & this.field10533;
                int var46 = (int) ((float) this.field10537 * var41 * this.field10540) & this.field10533;
                int var47 = this.field10545[this.field10537 * var46 + var45];
                int var48 = (int) ((float) this.field10543 * var40 * this.field10539) & this.field10530;
                int var49 = (int) ((float) this.field10543 * var41 * this.field10539) & this.field10530;
                int var50 = this.field10542[this.field10543 * var49 + var48];
                float var51 = 1.0F - (arg21 + arg23);
                int var52 = (int) ((float) (var44 >> 16 & 0xFF) * arg21) | 0xFF00 << 16 | (int) ((float) (var44 >> 8 & 0xFF) * arg21) << 8 | (int) ((float) (var44 & 0xFF) * arg21);
                int var53 = (int) ((float) (var47 >> 16 & 0xFF) * arg23) | 0xFF00 << 16 | (int) ((float) (var47 >> 8 & 0xFF) * arg23) << 8 | (int) ((float) (var47 & 0xFF) * arg23);
                int var54 = (int) ((float) (var50 >> 16 & 0xFF) * var51) | 0xFF00 << 16 | (int) ((float) (var50 >> 8 & 0xFF) * var51) << 8 | (int) ((float) (var50 & 0xFF) * var51);
                int var55 = var52 + var53 + var54;
                int var56 = (int) ((float) (var55 >> 16 & 0xFF) * arg15) & 0xFF00 | 0xFF0000 << 8 | (int) ((float) (var55 >> 8 & 0xFF) * arg17) & 0xFF00 | (int) ((float) (var55 & 0xFF) * arg19) >> 8;
                if (arg11 != 0.0F) {
                    int var57 = (int) (255.0F - arg11);
                    int var58 = ((this.field10529 & 0xFF00FF) * (int) arg11 & 0xFF00FF00 | (this.field10529 & 0xFF00) * (int) arg11 & 0xFF0000) >>> 8;
                    var56 = (((var56 & 0xFF00FF) * var57 & 0xFF00FF00 | (var56 & 0xFF00) * var57 & 0xFF0000) >>> 8) + var58;
                }
                arg0[var38] = var56;
                this.field10516[var38] = var39;
            }
            var38++;
            arg5 += var28;
            arg7 += var29;
            arg9 += var30;
            arg11 += var31;
            arg15 += var32;
            arg17 += var33;
            arg19 += var34;
            arg21 += var35;
            arg23 += var36;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([I[FIIIIIFFFF)V")
    private final void method4206(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, float arg10) {
        if (this.field10521) {
            if (arg6 > this.field10524) {
                arg6 = this.field10524;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var12 = arg5 + arg2 - 1;
        float var13 = (float) arg5 * arg8 + arg7;
        float var14 = (float) arg5 * arg10 + arg9;
        if (this.field10513.field7263) {
            if (this.field10515) {
                int var15 = arg6 - arg5 >> 2;
                float var16 = arg8 * 4.0F;
                if (this.field10517 == 0) {
                    if (var15 > 0) {
                        do {
                            int var17 = class595.field8378[(int) var13];
                            var13 += var16;
                            var12++;
                            if (var14 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var14;
                            }
                            float var18 = arg10 + var14;
                            var12++;
                            if (var18 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var18;
                            }
                            float var19 = arg10 + var18;
                            var12++;
                            if (var19 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var19;
                            }
                            float var20 = arg10 + var19;
                            var12++;
                            if (var20 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var20;
                            }
                            var14 = arg10 + var20;
                            var15--;
                        } while (var15 > 0);
                    }
                    int var21 = arg6 - arg5 & 0x3;
                    if (var21 > 0) {
                        int var22 = class595.field8378[(int) var13];
                        do {
                            var12++;
                            if (var14 < arg1[var12]) {
                                arg0[var12] = var22;
                                arg1[var12] = var14;
                            }
                            var14 += arg10;
                            var21--;
                        } while (var21 > 0);
                        return;
                    }
                } else {
                    int var23 = this.field10517;
                    int var24 = 256 - this.field10517;
                    if (var15 > 0) {
                        do {
                            int var25 = class595.field8378[(int) var13];
                            var13 += var16;
                            int var26 = ((var25 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + ((var25 & 0xFF00) * var24 >> 8 & 0xFF00);
                            var12++;
                            if (var14 < arg1[var12]) {
                                int var27 = arg0[var12];
                                arg0[var12] = ((var27 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var27 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var14;
                            }
                            float var28 = arg10 + var14;
                            var12++;
                            if (var28 < arg1[var12]) {
                                int var29 = arg0[var12];
                                arg0[var12] = ((var29 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var29 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var28;
                            }
                            float var30 = arg10 + var28;
                            var12++;
                            if (var30 < arg1[var12]) {
                                int var31 = arg0[var12];
                                arg0[var12] = ((var31 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var31 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var30;
                            }
                            float var32 = arg10 + var30;
                            var12++;
                            if (var32 < arg1[var12]) {
                                int var33 = arg0[var12];
                                arg0[var12] = ((var33 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var33 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var32;
                            }
                            var14 = arg10 + var32;
                            var15--;
                        } while (var15 > 0);
                    }
                    int var34 = arg6 - arg5 & 0x3;
                    if (var34 <= 0) {
                        return;
                    }
                    int var35 = class595.field8378[(int) var13];
                    int var36 = ((var35 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var24 >> 8 & 0xFF00);
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            int var37 = arg0[var12];
                            arg0[var12] = ((var37 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var37 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var36;
                            arg1[var12] = var14;
                        }
                        var14 += arg10;
                        var34--;
                    } while (var34 > 0);
                }
            } else {
                int var38 = arg6 - arg5;
                if (this.field10517 == 0) {
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            arg0[var12] = class595.field8378[(int) var13];
                            arg1[var12] = var14;
                        }
                        var14 += arg10;
                        var13 += arg8;
                        var38--;
                    } while (var38 > 0);
                } else {
                    int var39 = this.field10517;
                    int var40 = 256 - this.field10517;
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            int var41 = class595.field8378[(int) var13];
                            int var42 = ((var41 & 0xFF00FF) * var40 >> 8 & 0xFF00FF) + ((var41 & 0xFF00) * var40 >> 8 & 0xFF00);
                            int var43 = arg0[var12];
                            arg0[var12] = ((var43 & 0xFF00) * var39 >> 8 & 0xFF00) + ((var43 & 0xFF00FF) * var39 >> 8 & 0xFF00FF) + var42;
                            arg1[var12] = var14;
                        }
                        var13 += arg8;
                        var14 += arg10;
                        var38--;
                    } while (var38 > 0);
                }
            }
        } else if (this.field10515) {
            int var44 = arg6 - arg5 >> 2;
            float var45 = arg8 * 4.0F;
            if (this.field10517 == 0) {
                if (var44 > 0) {
                    do {
                        int var46 = class595.field8378[(int) var13];
                        var13 += var45;
                        var12++;
                        if (var14 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        float var47 = arg10 + var14;
                        var12++;
                        if (var47 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        float var48 = arg10 + var47;
                        var12++;
                        if (var48 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        float var49 = arg10 + var48;
                        var12++;
                        if (var49 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        var14 = arg10 + var49;
                        var44--;
                    } while (var44 > 0);
                }
                int var50 = arg6 - arg5 & 0x3;
                if (var50 > 0) {
                    int var51 = class595.field8378[(int) var13];
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            arg0[var12] = var51;
                        }
                        var14 += arg10;
                        var50--;
                    } while (var50 > 0);
                    return;
                }
            } else {
                int var52 = this.field10517;
                int var53 = 256 - this.field10517;
                if (var44 > 0) {
                    do {
                        int var54 = class595.field8378[(int) var13];
                        var13 += var45;
                        int var55 = ((var54 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + ((var54 & 0xFF00) * var53 >> 8 & 0xFF00);
                        var12++;
                        if (var14 < arg1[var12]) {
                            int var56 = arg0[var12];
                            arg0[var12] = ((var56 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var56 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        float var57 = arg10 + var14;
                        var12++;
                        if (var57 < arg1[var12]) {
                            int var58 = arg0[var12];
                            arg0[var12] = ((var58 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var58 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        float var59 = arg10 + var57;
                        var12++;
                        if (var59 < arg1[var12]) {
                            int var60 = arg0[var12];
                            arg0[var12] = ((var60 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var60 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        float var61 = arg10 + var59;
                        var12++;
                        if (var61 < arg1[var12]) {
                            int var62 = arg0[var12];
                            arg0[var12] = ((var62 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var62 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        var14 = arg10 + var61;
                        var44--;
                    } while (var44 > 0);
                }
                int var63 = arg6 - arg5 & 0x3;
                if (var63 <= 0) {
                    return;
                }
                int var64 = class595.field8378[(int) var13];
                int var65 = ((var64 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + ((var64 & 0xFF00) * var53 >> 8 & 0xFF00);
                do {
                    var12++;
                    if (var14 < arg1[var12]) {
                        int var66 = arg0[var12];
                        arg0[var12] = ((var66 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var66 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var65;
                    }
                    var14 += arg10;
                    var63--;
                } while (var63 > 0);
            }
        } else {
            int var67 = arg6 - arg5;
            if (this.field10517 == 0) {
                do {
                    var12++;
                    if (var14 < arg1[var12]) {
                        arg0[var12] = class595.field8378[(int) var13];
                    }
                    var14 += arg10;
                    var13 += arg8;
                    var67--;
                } while (var67 > 0);
            } else {
                int var68 = this.field10517;
                int var69 = 256 - this.field10517;
                do {
                    var12++;
                    if (var14 < arg1[var12]) {
                        int var70 = class595.field8378[(int) var13];
                        int var71 = ((var70 & 0xFF00FF) * var69 >> 8 & 0xFF00FF) + ((var70 & 0xFF00) * var69 >> 8 & 0xFF00);
                        int var72 = arg0[var12];
                        arg0[var12] = ((var72 & 0xFF00) * var68 >> 8 & 0xFF00) + ((var72 & 0xFF00FF) * var68 >> 8 & 0xFF00FF) + var71;
                    }
                    var13 += arg8;
                    var14 += arg10;
                    var67--;
                } while (var67 > 0);
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFFFFFFF)V")
    public final void method4207(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11) {
        if (this.field10525) {
            this.field10518.method419((int) arg4, class595.field8378[(int) arg9], (int) arg3, (int) arg1, (byte) 34, (int) arg0);
            this.field10518.method419((int) arg5, class595.field8378[(int) arg9], (int) arg4, (int) arg2, (byte) 34, (int) arg1);
            this.field10518.method419((int) arg3, class595.field8378[(int) arg9], (int) arg5, (int) arg0, (byte) 34, (int) arg2);
            return;
        }
        float var13 = arg4 - arg3;
        float var14 = arg1 - arg0;
        float var15 = arg5 - arg3;
        float var16 = arg2 - arg0;
        float var17 = arg10 - arg9;
        float var18 = arg11 - arg9;
        float var19 = arg7 - arg6;
        float var20 = arg8 - arg6;
        float var21;
        if (arg1 == arg2) {
            var21 = 0.0F;
        } else {
            var21 = (arg5 - arg4) / (arg2 - arg1);
        }
        float var22;
        if (arg0 == arg1) {
            var22 = 0.0F;
        } else {
            var22 = var13 / var14;
        }
        float var23;
        if (arg0 == arg2) {
            var23 = 0.0F;
        } else {
            var23 = var15 / var16;
        }
        float var24 = var13 * var16 - var14 * var15;
        if (var24 == 0.0F) {
            return;
        }
        float var25 = (var16 * var17 - var14 * var18) / var24;
        float var26 = (var13 * var18 - var15 * var17) / var24;
        float var27 = (var16 * var19 - var14 * var20) / var24;
        float var28 = (var13 * var20 - var15 * var19) / var24;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (!(arg0 >= (float) this.field10523)) {
                if (arg1 > (float) this.field10523) {
                    arg1 = this.field10523;
                }
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                float var29 = arg9 + var25 - arg3 * var25;
                float var30 = arg6 + var27 - arg3 * var27;
                if (arg1 < arg2) {
                    float var31 = arg3;
                    if (arg0 < 0.0F) {
                        var31 = arg3 - arg0 * var23;
                        arg3 -= arg0 * var22;
                        var29 -= arg0 * var26;
                        var30 -= arg0 * var28;
                        arg0 = 0.0F;
                    }
                    if (arg1 < 0.0F) {
                        arg4 -= arg1 * var21;
                        arg1 = 0.0F;
                    }
                    if (arg0 != arg1 && var23 < var22 || arg0 == arg1 && var23 > var21) {
                        float var32 = arg2 - arg1;
                        float var33 = arg1 - arg0;
                        float var34 = (float) this.field10514[(int) arg0];
                        while (--var33 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var34, 0, 0, (int) var31, (int) arg3, var29, var25, var30, var27);
                            var31 += var23;
                            arg3 += var22;
                            var29 += var26;
                            var30 += var28;
                            var34 += this.field10522;
                        }
                        while (--var32 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var34, 0, 0, (int) var31, (int) arg4, var29, var25, var30, var27);
                            var31 += var23;
                            arg4 += var21;
                            var29 += var26;
                            var30 += var28;
                            var34 += this.field10522;
                        }
                    } else {
                        float var35 = arg2 - arg1;
                        float var36 = arg1 - arg0;
                        float var37 = (float) this.field10514[(int) arg0];
                        while (--var36 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var37, 0, 0, (int) arg3, (int) var31, var29, var25, var30, var27);
                            var31 += var23;
                            arg3 += var22;
                            var29 += var26;
                            var30 += var28;
                            var37 += this.field10522;
                        }
                        while (--var35 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var37, 0, 0, (int) arg4, (int) var31, var29, var25, var30, var27);
                            var31 += var23;
                            arg4 += var21;
                            var29 += var26;
                            var30 += var28;
                            var37 += this.field10522;
                        }
                    }
                } else {
                    float var38 = arg3;
                    if (arg0 < 0.0F) {
                        var38 = arg3 - arg0 * var23;
                        arg3 -= arg0 * var22;
                        var29 -= arg0 * var26;
                        var30 -= arg0 * var28;
                        arg0 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var21;
                        arg2 = 0.0F;
                    }
                    if (arg0 != arg2 && var23 < var22 || arg0 == arg2 && var21 > var22) {
                        float var39 = arg1 - arg2;
                        float var40 = arg2 - arg0;
                        float var41 = (float) this.field10514[(int) arg0];
                        while (--var40 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var41, 0, 0, (int) var38, (int) arg3, var29, var25, var30, var27);
                            var38 += var23;
                            arg3 += var22;
                            var29 += var26;
                            var30 += var28;
                            var41 += this.field10522;
                        }
                        while (--var39 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var41, 0, 0, (int) arg5, (int) arg3, var29, var25, var30, var27);
                            arg5 += var21;
                            arg3 += var22;
                            var29 += var26;
                            var30 += var28;
                            var41 += this.field10522;
                        }
                    } else {
                        float var42 = arg1 - arg2;
                        float var43 = arg2 - arg0;
                        float var44 = (float) this.field10514[(int) arg0];
                        while (--var43 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var44, 0, 0, (int) arg3, (int) var38, var29, var25, var30, var27);
                            var38 += var23;
                            arg3 += var22;
                            var29 += var26;
                            var30 += var28;
                            var44 += this.field10522;
                        }
                        while (--var42 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var44, 0, 0, (int) arg3, (int) arg5, var29, var25, var30, var27);
                            arg5 += var21;
                            arg3 += var22;
                            var29 += var26;
                            var30 += var28;
                            var44 += this.field10522;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (!(arg1 >= (float) this.field10523)) {
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                if (arg0 > (float) this.field10523) {
                    arg0 = this.field10523;
                }
                float var45 = arg10 + var25 - arg4 * var25;
                float var46 = arg7 + var27 - arg4 * var27;
                if (arg2 < arg0) {
                    float var47 = arg4;
                    if (arg1 < 0.0F) {
                        var47 = arg4 - arg1 * var22;
                        arg4 -= arg1 * var21;
                        var45 -= arg1 * var26;
                        var46 -= arg1 * var28;
                        arg1 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var23;
                        arg2 = 0.0F;
                    }
                    if (arg1 != arg2 && var22 < var21 || arg1 == arg2 && var22 > var23) {
                        float var48 = arg0 - arg2;
                        float var49 = arg2 - arg1;
                        float var50 = (float) this.field10514[(int) arg1];
                        while (--var49 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var50, 0, 0, (int) var47, (int) arg4, var45, var25, var46, var27);
                            var47 += var22;
                            arg4 += var21;
                            var45 += var26;
                            var46 += var28;
                            var50 += this.field10522;
                        }
                        while (--var48 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var50, 0, 0, (int) var47, (int) arg5, var45, var25, var46, var27);
                            var47 += var22;
                            arg5 += var23;
                            var45 += var26;
                            var46 += var28;
                            var50 += this.field10522;
                        }
                    } else {
                        float var51 = arg0 - arg2;
                        float var52 = arg2 - arg1;
                        float var53 = (float) this.field10514[(int) arg1];
                        while (--var52 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var53, 0, 0, (int) arg4, (int) var47, var45, var25, var46, var27);
                            var47 += var22;
                            arg4 += var21;
                            var45 += var26;
                            var46 += var28;
                            var53 += this.field10522;
                        }
                        while (--var51 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var53, 0, 0, (int) arg5, (int) var47, var45, var25, var46, var27);
                            var47 += var22;
                            arg5 += var23;
                            var45 += var26;
                            var46 += var28;
                            var53 += this.field10522;
                        }
                    }
                } else {
                    float var54 = arg4;
                    if (arg1 < 0.0F) {
                        var54 = arg4 - arg1 * var22;
                        arg4 -= arg1 * var21;
                        var45 -= arg1 * var26;
                        var46 -= arg1 * var28;
                        arg1 = 0.0F;
                    }
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var23;
                        arg0 = 0.0F;
                    }
                    if (var22 < var21) {
                        float var55 = arg2 - arg0;
                        float var56 = arg0 - arg1;
                        float var57 = (float) this.field10514[(int) arg1];
                        while (--var56 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var57, 0, 0, (int) var54, (int) arg4, var45, var25, var46, var27);
                            var54 += var22;
                            arg4 += var21;
                            var45 += var26;
                            var46 += var28;
                            var57 += this.field10522;
                        }
                        while (--var55 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var57, 0, 0, (int) arg3, (int) arg4, var45, var25, var46, var27);
                            arg3 += var23;
                            arg4 += var21;
                            var45 += var26;
                            var46 += var28;
                            var57 += this.field10522;
                        }
                    } else {
                        float var58 = arg2 - arg0;
                        float var59 = arg0 - arg1;
                        float var60 = (float) this.field10514[(int) arg1];
                        while (--var59 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var60, 0, 0, (int) arg4, (int) var54, var45, var25, var46, var27);
                            var54 += var22;
                            arg4 += var21;
                            var45 += var26;
                            var46 += var28;
                            var60 += this.field10522;
                        }
                        while (--var58 >= 0.0F) {
                            this.method4206(this.field10519, this.field10516, (int) var60, 0, 0, (int) arg4, (int) arg3, var45, var25, var46, var27);
                            arg3 += var23;
                            arg4 += var21;
                            var45 += var26;
                            var46 += var28;
                            var60 += this.field10522;
                        }
                    }
                }
            }
        } else if (!(arg2 >= (float) this.field10523)) {
            if (arg0 > (float) this.field10523) {
                arg0 = this.field10523;
            }
            if (arg1 > (float) this.field10523) {
                arg1 = this.field10523;
            }
            float var61 = arg11 + var25 - arg5 * var25;
            float var62 = arg8 + var27 - arg5 * var27;
            if (arg0 < arg1) {
                float var63 = arg5;
                if (arg2 < 0.0F) {
                    var63 = arg5 - arg2 * var21;
                    arg5 -= arg2 * var23;
                    var61 -= arg2 * var26;
                    var62 -= arg2 * var28;
                    arg2 = 0.0F;
                }
                if (arg0 < 0.0F) {
                    arg3 -= arg0 * var22;
                    arg0 = 0.0F;
                }
                if (var21 < var23) {
                    float var64 = arg1 - arg0;
                    float var65 = arg0 - arg2;
                    float var66 = (float) this.field10514[(int) arg2];
                    while (--var65 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var66, 0, 0, (int) var63, (int) arg5, var61, var25, var62, var27);
                        var63 += var21;
                        arg5 += var23;
                        var61 += var26;
                        var62 += var28;
                        var66 += this.field10522;
                    }
                    while (--var64 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var66, 0, 0, (int) var63, (int) arg3, var61, var25, var62, var27);
                        var63 += var21;
                        arg3 += var22;
                        var61 += var26;
                        var62 += var28;
                        var66 += this.field10522;
                    }
                } else {
                    float var67 = arg1 - arg0;
                    float var68 = arg0 - arg2;
                    float var69 = (float) this.field10514[(int) arg2];
                    while (--var68 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var69, 0, 0, (int) arg5, (int) var63, var61, var25, var62, var27);
                        var63 += var21;
                        arg5 += var23;
                        var61 += var26;
                        var62 += var28;
                        var69 += this.field10522;
                    }
                    while (--var67 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var69, 0, 0, (int) arg3, (int) var63, var61, var25, var62, var27);
                        var63 += var21;
                        arg3 += var22;
                        var61 += var26;
                        var62 += var28;
                        var69 += this.field10522;
                    }
                }
            } else {
                float var70 = arg5;
                if (arg2 < 0.0F) {
                    var70 = arg5 - arg2 * var21;
                    arg5 -= arg2 * var23;
                    var61 -= arg2 * var26;
                    var62 -= arg2 * var28;
                    arg2 = 0.0F;
                }
                if (arg1 < 0.0F) {
                    arg4 -= arg1 * var22;
                    arg1 = 0.0F;
                }
                if (var21 < var23) {
                    float var71 = arg0 - arg1;
                    float var72 = arg1 - arg2;
                    float var73 = (float) this.field10514[(int) arg2];
                    while (--var72 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var73, 0, 0, (int) var70, (int) arg5, var61, var25, var62, var27);
                        var70 += var21;
                        arg5 += var23;
                        var61 += var26;
                        var62 += var28;
                        var73 += this.field10522;
                    }
                    while (--var71 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var73, 0, 0, (int) arg4, (int) arg5, var61, var25, var62, var27);
                        arg4 += var22;
                        arg5 += var23;
                        var61 += var26;
                        var62 += var28;
                        var73 += this.field10522;
                    }
                } else {
                    float var74 = arg0 - arg1;
                    float var75 = arg1 - arg2;
                    float var76 = (float) this.field10514[(int) arg2];
                    while (--var75 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var76, 0, 0, (int) arg5, (int) var70, var61, var25, var62, var27);
                        var70 += var21;
                        arg5 += var23;
                        var61 += var26;
                        var62 += var28;
                        var76 += this.field10522;
                    }
                    while (--var74 >= 0.0F) {
                        this.method4206(this.field10519, this.field10516, (int) var76, 0, 0, (int) arg5, (int) arg4, var61, var25, var62, var27);
                        arg4 += var22;
                        arg5 += var23;
                        var61 += var26;
                        var62 += var28;
                        var76 += this.field10522;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([I[FIIIIIFFFFFFFF)V")
    private final void method4208(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14) {
        if (this.field10521) {
            if (arg6 > this.field10524) {
                arg6 = this.field10524;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        if (this.field10528) {
            int var16 = arg2 + arg5;
            float var17 = (float) arg5 * arg10 + arg9;
            float var18 = (float) arg5 * arg12 + arg11;
            float var19 = (float) arg5 * arg14 + arg13;
            if (this.field10515) {
                int var20 = arg6 - arg5 >> 2;
                float var21 = arg10 * 4.0F;
                float var22 = arg12 * 4.0F;
                float var23 = arg14 * 4.0F;
                if (this.field10517 == 0) {
                    if (var20 > 0) {
                        do {
                            int var24 = (int) var17 & 0xFF0000 | 0xFF000000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                            var17 += var21;
                            var18 += var22;
                            var19 += var23;
                            arg0[var16++] = var24;
                            arg0[var16++] = var24;
                            arg0[var16++] = var24;
                            arg0[var16++] = var24;
                            var20--;
                        } while (var20 > 0);
                    }
                    int var25 = arg6 - arg5 & 0x3;
                    if (var25 > 0) {
                        int var26 = (int) var17 & 0xFF0000 | 0xFF000000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                        do {
                            arg0[var16++] = var26;
                            var25--;
                        } while (var25 > 0);
                        return;
                    }
                } else if (this.field10520) {
                    if (var20 > 0) {
                        do {
                            int var39 = (int) var17 & 0xFF0000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                            var17 += var21;
                            var18 += var22;
                            var19 += var23;
                            int var41 = var16++;
                            int var43 = arg0[var41];
                            int var44 = var39 + var43;
                            int var45 = (var39 & 0xFF00FF) + (var43 & 0xFF00FF);
                            int var46 = (var44 - var45 & 0x10000) + (var45 & 0x1000100);
                            arg0[var41] = var44 - var46 | 0xFF000000 | var46 - (var46 >>> 8);
                            int var48 = var16++;
                            int var50 = arg0[var48];
                            int var51 = var39 + var50;
                            int var52 = (var39 & 0xFF00FF) + (var50 & 0xFF00FF);
                            int var53 = (var51 - var52 & 0x10000) + (var52 & 0x1000100);
                            arg0[var48] = var51 - var53 | 0xFF000000 | var53 - (var53 >>> 8);
                            int var55 = var16++;
                            int var57 = arg0[var55];
                            int var58 = var39 + var57;
                            int var59 = (var39 & 0xFF00FF) + (var57 & 0xFF00FF);
                            int var60 = (var58 - var59 & 0x10000) + (var59 & 0x1000100);
                            arg0[var55] = var58 - var60 | 0xFF000000 | var60 - (var60 >>> 8);
                            int var62 = var16++;
                            int var64 = arg0[var62];
                            int var65 = var39 + var64;
                            int var66 = (var39 & 0xFF00FF) + (var64 & 0xFF00FF);
                            int var67 = (var65 - var66 & 0x10000) + (var66 & 0x1000100);
                            arg0[var62] = var65 - var67 | 0xFF000000 | var67 - (var67 >>> 8);
                            var20--;
                        } while (var20 > 0);
                    }
                    int var68 = arg6 - arg5 & 0x3;
                    if (var68 > 0) {
                        int var69 = (int) var17 & 0xFF0000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                        do {
                            int var71 = var16++;
                            int var73 = arg0[var71];
                            int var74 = var69 + var73;
                            int var75 = (var69 & 0xFF00FF) + (var73 & 0xFF00FF);
                            int var76 = (var74 - var75 & 0x10000) + (var75 & 0x1000100);
                            arg0[var71] = var74 - var76 | 0xFF000000 | var76 - (var76 >>> 8);
                            var68--;
                        } while (var68 > 0);
                    }
                } else {
                    int var27 = this.field10517;
                    int var28 = 256 - this.field10517;
                    if (var20 > 0) {
                        do {
                            int var29 = (int) var17 & 0xFF0000 | 0xFF000000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                            var17 += var21;
                            var18 += var22;
                            var19 += var23;
                            int var30 = ((var29 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + ((var29 & 0xFF00) * var28 >> 8 & 0xFF00);
                            int var31 = arg0[var16];
                            arg0[var16++] = ((var31 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var31 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            int var32 = arg0[var16];
                            arg0[var16++] = ((var32 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            int var33 = arg0[var16];
                            arg0[var16++] = ((var33 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var33 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            int var34 = arg0[var16];
                            arg0[var16++] = ((var34 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            var20--;
                        } while (var20 > 0);
                    }
                    int var35 = arg6 - arg5 & 0x3;
                    if (var35 > 0) {
                        int var36 = (int) var17 & 0xFF0000 | 0xFF000000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                        int var37 = ((var36 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + ((var36 & 0xFF00) * var28 >> 8 & 0xFF00);
                        do {
                            int var38 = arg0[var16];
                            arg0[var16++] = ((var38 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var38 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var37;
                            var35--;
                        } while (var35 > 0);
                        return;
                    }
                }
            } else {
                int var77 = arg6 - arg5;
                if (this.field10517 == 0) {
                    do {
                        arg0[var16++] = (int) var17 & 0xFF0000 | 0xFF000000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                        var17 += arg10;
                        var18 += arg12;
                        var19 += arg14;
                        var77--;
                    } while (var77 > 0);
                } else if (this.field10520) {
                    do {
                        int var84 = var16++;
                        int var85 = (int) var17 & 0xFF0000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                        int var86 = arg0[var84];
                        int var87 = var85 + var86;
                        int var88 = (var85 & 0xFF00FF) + (var86 & 0xFF00FF);
                        int var89 = (var87 - var88 & 0x10000) + (var88 & 0x1000100);
                        arg0[var84] = var87 - var89 | 0xFF000000 | var89 - (var89 >>> 8);
                        var17 += arg10;
                        var18 += arg12;
                        var19 += arg14;
                        var77--;
                    } while (var77 > 0);
                } else {
                    int var78 = this.field10517;
                    int var79 = 256 - this.field10517;
                    do {
                        int var80 = (int) var17 & 0xFF0000 | 0xFF000000 | (int) var18 & 0xFF00 | (int) var19 & 0xFF;
                        var17 += arg10;
                        var18 += arg12;
                        var19 += arg14;
                        int var81 = ((var80 & 0xFF00FF) * var79 >> 8 & 0xFF00FF) + ((var80 & 0xFF00) * var79 >> 8 & 0xFF00);
                        int var82 = arg0[var16];
                        arg0[var16++] = ((var82 & 0xFF00) * var78 >> 8 & 0xFF00) + ((var82 & 0xFF00FF) * var78 >> 8 & 0xFF00FF) + var81;
                        var77--;
                    } while (var77 > 0);
                }
            }
            return;
        }
        int var90 = arg5 + arg2 - 1;
        float var91 = (float) arg5 * arg8 + arg7;
        float var92 = (float) arg5 * arg10 + arg9;
        float var93 = (float) arg5 * arg12 + arg11;
        float var94 = (float) arg5 * arg14 + arg13;
        if (this.field10513.field7263) {
            if (this.field10515) {
                int var95 = arg6 - arg5 >> 2;
                float var96 = arg10 * 4.0F;
                float var97 = arg12 * 4.0F;
                float var98 = arg14 * 4.0F;
                if (this.field10517 == 0) {
                    if (var95 > 0) {
                        do {
                            int var99 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                            var92 += var96;
                            var93 += var97;
                            var94 += var98;
                            var90++;
                            if (var91 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var91;
                            }
                            float var100 = arg8 + var91;
                            var90++;
                            if (var100 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var100;
                            }
                            float var101 = arg8 + var100;
                            var90++;
                            if (var101 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var101;
                            }
                            float var102 = arg8 + var101;
                            var90++;
                            if (var102 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var102;
                            }
                            var91 = arg8 + var102;
                            var95--;
                        } while (var95 > 0);
                    }
                    int var103 = arg6 - arg5 & 0x3;
                    if (var103 > 0) {
                        int var104 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        do {
                            var90++;
                            if (var91 < arg1[var90]) {
                                arg0[var90] = var104;
                                arg1[var90] = var91;
                            }
                            var91 += arg8;
                            var103--;
                        } while (var103 > 0);
                        return;
                    }
                } else if (this.field10520) {
                    if (var95 > 0) {
                        do {
                            int var120 = (int) var92 & 0xFF0000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                            var92 += var96;
                            var93 += var97;
                            var94 += var98;
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var124 = arg0[var90];
                                int var125 = var120 + var124;
                                int var126 = (var120 & 0xFF00FF) + (var124 & 0xFF00FF);
                                int var127 = (var125 - var126 & 0x10000) + (var126 & 0x1000100);
                                arg0[var90] = var125 - var127 | 0xFF000000 | var127 - (var127 >>> 8);
                                arg1[var90] = var91;
                            }
                            float var128 = arg8 + var91;
                            var90++;
                            if (var128 < arg1[var90]) {
                                int var132 = arg0[var90];
                                int var133 = var120 + var132;
                                int var134 = (var120 & 0xFF00FF) + (var132 & 0xFF00FF);
                                int var135 = (var133 - var134 & 0x10000) + (var134 & 0x1000100);
                                arg0[var90] = var133 - var135 | 0xFF000000 | var135 - (var135 >>> 8);
                                arg1[var90] = var128;
                            }
                            float var136 = arg8 + var128;
                            var90++;
                            if (var136 < arg1[var90]) {
                                int var140 = arg0[var90];
                                int var141 = var120 + var140;
                                int var142 = (var120 & 0xFF00FF) + (var140 & 0xFF00FF);
                                int var143 = (var141 - var142 & 0x10000) + (var142 & 0x1000100);
                                arg0[var90] = var141 - var143 | 0xFF000000 | var143 - (var143 >>> 8);
                                arg1[var90] = var136;
                            }
                            float var144 = arg8 + var136;
                            var90++;
                            if (var144 < arg1[var90]) {
                                int var148 = arg0[var90];
                                int var149 = var120 + var148;
                                int var150 = (var120 & 0xFF00FF) + (var148 & 0xFF00FF);
                                int var151 = (var149 - var150 & 0x10000) + (var150 & 0x1000100);
                                arg0[var90] = var149 - var151 | 0xFF000000 | var151 - (var151 >>> 8);
                                arg1[var90] = var144;
                            }
                            var91 = arg8 + var144;
                            var95--;
                        } while (var95 > 0);
                    }
                    int var152 = arg6 - arg5 & 0x3;
                    if (var152 > 0) {
                        int var153 = (int) var92 & 0xFF0000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        do {
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var157 = arg0[var90];
                                int var158 = var153 + var157;
                                int var159 = (var153 & 0xFF00FF) + (var157 & 0xFF00FF);
                                int var160 = (var158 - var159 & 0x10000) + (var159 & 0x1000100);
                                arg0[var90] = var158 - var160 | 0xFF000000 | var160 - (var160 >>> 8);
                                arg1[var90] = var91;
                            }
                            var91 += arg8;
                            var152--;
                        } while (var152 > 0);
                    }
                } else {
                    int var105 = this.field10517;
                    int var106 = 256 - this.field10517;
                    if (var95 > 0) {
                        do {
                            int var107 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                            var92 += var96;
                            var93 += var97;
                            var94 += var98;
                            int var108 = ((var107 & 0xFF00FF) * var106 >> 8 & 0xFF00FF) + ((var107 & 0xFF00) * var106 >> 8 & 0xFF00);
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var109 = arg0[var90];
                                arg0[var90] = ((var109 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var109 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var91;
                            }
                            float var110 = arg8 + var91;
                            var90++;
                            if (var110 < arg1[var90]) {
                                int var111 = arg0[var90];
                                arg0[var90] = ((var111 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var111 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var110;
                            }
                            float var112 = arg8 + var110;
                            var90++;
                            if (var112 < arg1[var90]) {
                                int var113 = arg0[var90];
                                arg0[var90] = ((var113 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var113 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var112;
                            }
                            float var114 = arg8 + var112;
                            var90++;
                            if (var114 < arg1[var90]) {
                                int var115 = arg0[var90];
                                arg0[var90] = ((var115 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var115 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var114;
                            }
                            var91 = arg8 + var114;
                            var95--;
                        } while (var95 > 0);
                    }
                    int var116 = arg6 - arg5 & 0x3;
                    if (var116 > 0) {
                        int var117 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        int var118 = ((var117 & 0xFF00FF) * var106 >> 8 & 0xFF00FF) + ((var117 & 0xFF00) * var106 >> 8 & 0xFF00);
                        do {
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var119 = arg0[var90];
                                arg0[var90] = ((var119 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var119 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var118;
                                arg1[var90] = var91;
                            }
                            var91 += arg8;
                            var116--;
                        } while (var116 > 0);
                        return;
                    }
                }
            } else {
                int var161 = arg6 - arg5;
                if (this.field10517 == 0) {
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            arg0[var90] = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                            arg1[var90] = var91;
                        }
                        var91 += arg8;
                        var92 += arg10;
                        var93 += arg12;
                        var94 += arg14;
                        var161--;
                    } while (var161 > 0);
                } else if (this.field10520) {
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var169 = (int) var92 & 0xFF0000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                            int var170 = arg0[var90];
                            int var171 = var169 + var170;
                            int var172 = (var169 & 0xFF00FF) + (var170 & 0xFF00FF);
                            int var173 = (var171 - var172 & 0x10000) + (var172 & 0x1000100);
                            arg0[var90] = var171 - var173 | 0xFF000000 | var173 - (var173 >>> 8);
                            arg1[var90] = var91;
                        }
                        var91 += arg8;
                        var92 += arg10;
                        var93 += arg12;
                        var94 += arg14;
                        var161--;
                    } while (var161 > 0);
                } else {
                    int var162 = this.field10517;
                    int var163 = 256 - this.field10517;
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var164 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                            int var165 = ((var164 & 0xFF00FF) * var163 >> 8 & 0xFF00FF) + ((var164 & 0xFF00) * var163 >> 8 & 0xFF00);
                            int var166 = arg0[var90];
                            arg0[var90] = ((var166 & 0xFF00) * var162 >> 8 & 0xFF00) + ((var166 & 0xFF00FF) * var162 >> 8 & 0xFF00FF) + var165;
                            arg1[var90] = var91;
                        }
                        var91 += arg8;
                        var92 += arg10;
                        var93 += arg12;
                        var94 += arg14;
                        var161--;
                    } while (var161 > 0);
                }
            }
        } else if (this.field10515) {
            int var174 = arg6 - arg5 >> 2;
            float var175 = arg10 * 4.0F;
            float var176 = arg12 * 4.0F;
            float var177 = arg14 * 4.0F;
            if (this.field10517 == 0) {
                if (var174 > 0) {
                    do {
                        int var178 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        var92 += var175;
                        var93 += var176;
                        var94 += var177;
                        var90++;
                        if (var91 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        float var179 = arg8 + var91;
                        var90++;
                        if (var179 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        float var180 = arg8 + var179;
                        var90++;
                        if (var180 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        float var181 = arg8 + var180;
                        var90++;
                        if (var181 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        var91 = arg8 + var181;
                        var174--;
                    } while (var174 > 0);
                }
                int var182 = arg6 - arg5 & 0x3;
                if (var182 > 0) {
                    int var183 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            arg0[var90] = var183;
                        }
                        var91 += arg8;
                        var182--;
                    } while (var182 > 0);
                    return;
                }
            } else if (this.field10520) {
                if (var174 > 0) {
                    do {
                        int var199 = (int) var92 & 0xFF0000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        var92 += var175;
                        var93 += var176;
                        var94 += var177;
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var203 = arg0[var90];
                            int var204 = var199 + var203;
                            int var205 = (var199 & 0xFF00FF) + (var203 & 0xFF00FF);
                            int var206 = (var204 - var205 & 0x10000) + (var205 & 0x1000100);
                            arg0[var90] = var204 - var206 | 0xFF000000 | var206 - (var206 >>> 8);
                        }
                        float var207 = arg8 + var91;
                        var90++;
                        if (var207 < arg1[var90]) {
                            int var211 = arg0[var90];
                            int var212 = var199 + var211;
                            int var213 = (var199 & 0xFF00FF) + (var211 & 0xFF00FF);
                            int var214 = (var212 - var213 & 0x10000) + (var213 & 0x1000100);
                            arg0[var90] = var212 - var214 | 0xFF000000 | var214 - (var214 >>> 8);
                        }
                        float var215 = arg8 + var207;
                        var90++;
                        if (var215 < arg1[var90]) {
                            int var219 = arg0[var90];
                            int var220 = var199 + var219;
                            int var221 = (var199 & 0xFF00FF) + (var219 & 0xFF00FF);
                            int var222 = (var220 - var221 & 0x10000) + (var221 & 0x1000100);
                            arg0[var90] = var220 - var222 | 0xFF000000 | var222 - (var222 >>> 8);
                        }
                        float var223 = arg8 + var215;
                        var90++;
                        if (var223 < arg1[var90]) {
                            int var227 = arg0[var90];
                            int var228 = var199 + var227;
                            int var229 = (var199 & 0xFF00FF) + (var227 & 0xFF00FF);
                            int var230 = (var228 - var229 & 0x10000) + (var229 & 0x1000100);
                            arg0[var90] = var228 - var230 | 0xFF000000 | var230 - (var230 >>> 8);
                        }
                        var91 = arg8 + var223;
                        var174--;
                    } while (var174 > 0);
                }
                int var231 = arg6 - arg5 & 0x3;
                if (var231 > 0) {
                    int var232 = (int) var92 & 0xFF0000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var236 = arg0[var90];
                            int var237 = var232 + var236;
                            int var238 = (var232 & 0xFF00FF) + (var236 & 0xFF00FF);
                            int var239 = (var237 - var238 & 0x10000) + (var238 & 0x1000100);
                            arg0[var90] = var237 - var239 | 0xFF000000 | var239 - (var239 >>> 8);
                        }
                        var91 += arg8;
                        var231--;
                    } while (var231 > 0);
                }
            } else {
                int var184 = this.field10517;
                int var185 = 256 - this.field10517;
                if (var174 > 0) {
                    do {
                        int var186 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        var92 += var175;
                        var93 += var176;
                        var94 += var177;
                        int var187 = ((var186 & 0xFF00FF) * var185 >> 8 & 0xFF00FF) + ((var186 & 0xFF00) * var185 >> 8 & 0xFF00);
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var188 = arg0[var90];
                            arg0[var90] = ((var188 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var188 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        float var189 = arg8 + var91;
                        var90++;
                        if (var189 < arg1[var90]) {
                            int var190 = arg0[var90];
                            arg0[var90] = ((var190 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var190 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        float var191 = arg8 + var189;
                        var90++;
                        if (var191 < arg1[var90]) {
                            int var192 = arg0[var90];
                            arg0[var90] = ((var192 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var192 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        float var193 = arg8 + var191;
                        var90++;
                        if (var193 < arg1[var90]) {
                            int var194 = arg0[var90];
                            arg0[var90] = ((var194 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var194 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        var91 = arg8 + var193;
                        var174--;
                    } while (var174 > 0);
                }
                int var195 = arg6 - arg5 & 0x3;
                if (var195 > 0) {
                    int var196 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                    int var197 = ((var196 & 0xFF00FF) * var185 >> 8 & 0xFF00FF) + ((var196 & 0xFF00) * var185 >> 8 & 0xFF00);
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var198 = arg0[var90];
                            arg0[var90] = ((var198 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var198 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var197;
                        }
                        var91 += arg8;
                        var195--;
                    } while (var195 > 0);
                    return;
                }
            }
        } else {
            int var240 = arg6 - arg5;
            if (this.field10517 == 0) {
                do {
                    var90++;
                    if (var91 < arg1[var90]) {
                        arg0[var90] = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                    }
                    var91 += arg8;
                    var92 += arg10;
                    var93 += arg12;
                    var94 += arg14;
                    var240--;
                } while (var240 > 0);
            } else if (this.field10520) {
                do {
                    var90++;
                    if (var91 < arg1[var90]) {
                        int var248 = (int) var92 & 0xFF0000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        int var249 = arg0[var90];
                        int var250 = var248 + var249;
                        int var251 = (var248 & 0xFF00FF) + (var249 & 0xFF00FF);
                        int var252 = (var250 - var251 & 0x10000) + (var251 & 0x1000100);
                        arg0[var90] = var250 - var252 | 0xFF000000 | var252 - (var252 >>> 8);
                    }
                    var91 += arg8;
                    var92 += arg10;
                    var93 += arg12;
                    var94 += arg14;
                    var240--;
                } while (var240 > 0);
            } else {
                int var241 = this.field10517;
                int var242 = 256 - this.field10517;
                do {
                    var90++;
                    if (var91 < arg1[var90]) {
                        int var243 = (int) var92 & 0xFF0000 | 0xFF000000 | (int) var93 & 0xFF00 | (int) var94 & 0xFF;
                        int var244 = ((var243 & 0xFF00FF) * var242 >> 8 & 0xFF00FF) + ((var243 & 0xFF00) * var242 >> 8 & 0xFF00);
                        int var245 = arg0[var90];
                        arg0[var90] = ((var245 & 0xFF00) * var241 >> 8 & 0xFF00) + ((var245 & 0xFF00FF) * var241 >> 8 & 0xFF00FF) + var244;
                    }
                    var91 += arg8;
                    var92 += arg10;
                    var93 += arg12;
                    var94 += arg14;
                    var240--;
                } while (var240 > 0);
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "()I")
    public final int method4209() {
        return this.field10514[0] / this.field10522;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFFFFFFFFFFIIIIIIII)V")
    public final void method4210(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22) {
        if (this.field10546 != arg22) {
            this.field10541 = this.field10518.method3166(arg22);
            if (this.field10541 == null) {
                this.method4212((float) ((int) arg0), (float) ((int) arg1), (float) ((int) arg2), (float) ((int) arg3), (float) ((int) arg4), (float) ((int) arg5), (float) ((int) arg6), (float) ((int) arg7), (float) ((int) arg8), class623.method3557(arg18 | arg19 << 24, -101, arg15), class623.method3557(arg18 | arg20 << 24, -100, arg16), class623.method3557(arg18 | arg21 << 24, -91, arg17));
                return;
            }
            this.field10538 = this.field10518.method3175(arg22) ? 64 : this.field10518.field7664;
            this.field10536 = this.field10538 - 1;
            this.field10534 = this.field10518.method3161(arg22);
            this.field10532 = this.field10518.method3173(arg22);
        }
        this.field10529 = arg18;
        float var24 = (float) (arg15 >> 24 & 0xFF);
        float var25 = (float) (arg16 >> 24 & 0xFF);
        float var26 = (float) (arg17 >> 24 & 0xFF);
        float var27 = (float) (arg15 >> 16 & 0xFF);
        float var28 = (float) (arg16 >> 16 & 0xFF);
        float var29 = (float) (arg17 >> 16 & 0xFF);
        float var30 = (float) (arg15 >> 8 & 0xFF);
        float var31 = (float) (arg16 >> 8 & 0xFF);
        float var32 = (float) (arg17 >> 8 & 0xFF);
        float var33 = (float) (arg15 & 0xFF);
        float var34 = (float) (arg16 & 0xFF);
        float var35 = (float) (arg17 & 0xFF);
        float var36 = arg9 / arg6;
        float var37 = arg10 / arg7;
        float var38 = arg11 / arg8;
        float var39 = arg12 / arg6;
        float var40 = arg13 / arg7;
        float var41 = arg14 / arg8;
        float var42 = 1.0F / arg6;
        float var43 = 1.0F / arg7;
        float var44 = 1.0F / arg8;
        float var45 = 0.0F;
        float var46 = 0.0F;
        float var47 = 0.0F;
        float var48 = 0.0F;
        float var49 = 0.0F;
        float var50 = 0.0F;
        float var51 = 0.0F;
        float var52 = 0.0F;
        float var53 = 0.0F;
        if (arg0 != arg1) {
            float var54 = arg1 - arg0;
            var45 = (arg4 - arg3) / var54;
            var46 = (var43 - var42) / var54;
            var47 = (var37 - var36) / var54;
            var48 = (var40 - var39) / var54;
            var49 = (float) (arg20 - arg19) / var54;
            var50 = (var25 - var24) / var54;
            var51 = (var28 - var27) / var54;
            var52 = (var31 - var30) / var54;
            var53 = (var34 - var33) / var54;
        }
        float var55 = 0.0F;
        float var56 = 0.0F;
        float var57 = 0.0F;
        float var58 = 0.0F;
        float var59 = 0.0F;
        float var60 = 0.0F;
        float var61 = 0.0F;
        float var62 = 0.0F;
        float var63 = 0.0F;
        if (arg1 != arg2) {
            float var64 = arg2 - arg1;
            var55 = (arg5 - arg4) / var64;
            var56 = (var44 - var43) / var64;
            var57 = (var38 - var37) / var64;
            var58 = (var41 - var40) / var64;
            var59 = (float) (arg21 - arg20) / var64;
            var60 = (var26 - var25) / var64;
            var61 = (var29 - var28) / var64;
            var62 = (var32 - var31) / var64;
            var63 = (var35 - var34) / var64;
        }
        float var65 = 0.0F;
        float var66 = 0.0F;
        float var67 = 0.0F;
        float var68 = 0.0F;
        float var69 = 0.0F;
        float var70 = 0.0F;
        float var71 = 0.0F;
        float var72 = 0.0F;
        float var73 = 0.0F;
        if (arg0 != arg2) {
            float var74 = arg0 - arg2;
            var65 = (arg3 - arg5) / var74;
            var66 = (var42 - var44) / var74;
            var67 = (var36 - var38) / var74;
            var68 = (var39 - var41) / var74;
            var69 = (float) (arg19 - arg21) / var74;
            var70 = (var24 - var26) / var74;
            var71 = (var27 - var29) / var74;
            var72 = (var30 - var32) / var74;
            var73 = (var33 - var35) / var74;
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (!(arg0 >= (float) this.field10523)) {
                if (arg1 > (float) this.field10523) {
                    arg1 = this.field10523;
                }
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                if (arg1 < arg2) {
                    float var75 = arg3;
                    float var76 = var42;
                    float var77 = var36;
                    float var78 = var39;
                    int var79 = arg19;
                    float var80 = var24;
                    float var81 = var27;
                    float var82 = var30;
                    float var83 = var33;
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var45;
                        var75 -= arg0 * var65;
                        var42 -= arg0 * var46;
                        var76 -= arg0 * var66;
                        var36 -= arg0 * var47;
                        var77 -= arg0 * var67;
                        var39 -= arg0 * var48;
                        var78 -= arg0 * var68;
                        arg19 = (int) ((float) arg19 - arg0 * var49);
                        var79 = (int) ((float) var79 - arg0 * var69);
                        var24 -= arg0 * var50;
                        var80 -= arg0 * var70;
                        var27 -= arg0 * var50;
                        var81 -= arg0 * var70;
                        var30 -= arg0 * var50;
                        var82 -= arg0 * var70;
                        var33 -= arg0 * var50;
                        var83 -= arg0 * var70;
                        arg0 = 0.0F;
                    }
                    if (arg1 < 0.0F) {
                        arg4 -= arg1 * var55;
                        var43 -= arg1 * var56;
                        var37 -= arg1 * var57;
                        var40 -= arg1 * var58;
                        arg20 = (int) ((float) arg20 - arg1 * var59);
                        var25 -= arg1 * var60;
                        var28 -= arg1 * var61;
                        var31 -= arg1 * var62;
                        var34 -= arg1 * var63;
                        arg1 = 0.0F;
                    }
                    if ((arg0 == arg1 || !(var65 < var45)) && (arg0 != arg1 || !(var65 > var55))) {
                        float var87 = arg2 - arg1;
                        float var88 = arg1 - arg0;
                        float var89 = (float) this.field10514[(int) arg0];
                        while (--var88 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var89, (int) arg3, (int) var75, var42, var76, var36, var77, var39, var78, (float) arg19, (float) var79, var24, var80, var27, var81, var30, var82, var33, var83);
                            arg3 += var45;
                            var75 += var65;
                            var42 += var46;
                            var76 += var66;
                            var36 += var47;
                            var77 += var67;
                            var39 += var48;
                            var78 += var68;
                            arg19 = (int) ((float) arg19 + var49);
                            var79 = (int) ((float) var79 + var69);
                            var24 += var50;
                            var80 += var70;
                            var27 += var51;
                            var81 += var71;
                            var30 += var52;
                            var82 += var72;
                            var33 += var53;
                            var83 += var73;
                            var89 += this.field10522;
                        }
                        while (--var87 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var89, (int) arg4, (int) var75, var43, var76, var37, var77, var40, var78, (float) arg20, (float) var79, var25, var80, var28, var81, var31, var82, var34, var83);
                            arg4 += var55;
                            var75 += var65;
                            var43 += var56;
                            var76 += var66;
                            var37 += var57;
                            var77 += var67;
                            var40 += var58;
                            var78 += var68;
                            arg20 = (int) ((float) arg20 + var59);
                            var79 = (int) ((float) var79 + var69);
                            var25 += var60;
                            var80 += var70;
                            var28 += var61;
                            var81 += var71;
                            var31 += var62;
                            var82 += var72;
                            var34 += var63;
                            var83 += var73;
                            var89 += this.field10522;
                        }
                    } else {
                        float var84 = arg2 - arg1;
                        float var85 = arg1 - arg0;
                        float var86 = (float) this.field10514[(int) arg0];
                        while (--var85 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var86, (int) var75, (int) arg3, var76, var42, var77, var36, var78, var39, (float) var79, (float) arg19, var80, var24, var81, var27, var82, var30, var83, var33);
                            arg3 += var45;
                            var75 += var65;
                            var42 += var46;
                            var76 += var66;
                            var36 += var47;
                            var77 += var67;
                            var39 += var48;
                            var78 += var68;
                            arg19 = (int) ((float) arg19 + var49);
                            var79 = (int) ((float) var79 + var69);
                            var24 += var50;
                            var80 += var70;
                            var27 += var51;
                            var81 += var71;
                            var30 += var52;
                            var82 += var72;
                            var33 += var53;
                            var83 += var73;
                            var86 += this.field10522;
                        }
                        while (--var84 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var86, (int) var75, (int) arg4, var76, var43, var77, var37, var78, var40, (float) var79, (float) arg20, var80, var25, var81, var28, var82, var31, var83, var34);
                            arg4 += var55;
                            var75 += var65;
                            var43 += var56;
                            var76 += var66;
                            var37 += var57;
                            var77 += var67;
                            var40 += var58;
                            var78 += var68;
                            arg20 = (int) ((float) arg20 + var59);
                            var79 = (int) ((float) var79 + var69);
                            var25 += var60;
                            var80 += var70;
                            var28 += var61;
                            var81 += var71;
                            var31 += var62;
                            var82 += var72;
                            var34 += var63;
                            var83 += var73;
                            var86 += this.field10522;
                        }
                    }
                } else {
                    float var90 = arg3;
                    float var91 = var42;
                    float var92 = var36;
                    float var93 = var39;
                    int var94 = arg19;
                    float var95 = var24;
                    float var96 = var27;
                    float var97 = var30;
                    float var98 = var33;
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var45;
                        var90 -= arg0 * var65;
                        var42 -= arg0 * var46;
                        var91 -= arg0 * var66;
                        var36 -= arg0 * var47;
                        var92 -= arg0 * var67;
                        var39 -= arg0 * var48;
                        var93 -= arg0 * var68;
                        arg19 = (int) ((float) arg19 - arg0 * var49);
                        var94 = (int) ((float) var94 - arg0 * var69);
                        var24 -= arg0 * var50;
                        var95 -= arg0 * var70;
                        var27 -= arg0 * var50;
                        var96 -= arg0 * var70;
                        var30 -= arg0 * var50;
                        var97 -= arg0 * var70;
                        var33 -= arg0 * var50;
                        var98 -= arg0 * var70;
                        arg0 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var55;
                        var44 -= arg2 * var56;
                        var38 -= arg2 * var57;
                        var41 -= arg2 * var58;
                        arg21 = (int) ((float) arg21 - arg2 * var59);
                        var26 -= arg2 * var60;
                        var29 -= arg2 * var61;
                        var32 -= arg2 * var62;
                        var35 -= arg2 * var63;
                        arg2 = 0.0F;
                    }
                    if (arg0 != arg2 && var65 < var45 || arg0 == arg2 && var55 > var45) {
                        float var99 = arg1 - arg2;
                        float var100 = arg2 - arg0;
                        float var101 = (float) this.field10514[(int) arg0];
                        while (--var100 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var101, (int) var90, (int) arg3, var91, var42, var92, var36, var93, var39, (float) var94, (float) arg19, var95, var24, var96, var27, var97, var30, var98, var33);
                            arg3 += var45;
                            var90 += var65;
                            var42 += var46;
                            var91 += var66;
                            var36 += var47;
                            var92 += var67;
                            var39 += var48;
                            var93 += var68;
                            arg19 = (int) ((float) arg19 + var49);
                            var94 = (int) ((float) var94 + var69);
                            var24 += var50;
                            var95 += var70;
                            var27 += var51;
                            var96 += var71;
                            var30 += var52;
                            var97 += var72;
                            var33 += var53;
                            var98 += var73;
                            var101 += this.field10522;
                        }
                        while (--var99 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var101, (int) arg5, (int) arg3, var44, var42, var38, var36, var41, var39, (float) arg21, (float) arg19, var26, var24, var29, var27, var32, var30, var35, var33);
                            arg5 += var55;
                            arg3 += var45;
                            var44 += var56;
                            var42 += var46;
                            var38 += var57;
                            var36 += var47;
                            var41 += var58;
                            var39 += var48;
                            arg21 = (int) ((float) arg21 + var59);
                            arg19 = (int) ((float) arg19 + var49);
                            var26 += var60;
                            var24 += var50;
                            var29 += var61;
                            var27 += var51;
                            var32 += var62;
                            var30 += var52;
                            var35 += var63;
                            var33 += var53;
                            var101 += this.field10522;
                        }
                    } else {
                        float var102 = arg1 - arg2;
                        float var103 = arg2 - arg0;
                        float var104 = (float) this.field10514[(int) arg0];
                        while (--var103 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var104, (int) arg3, (int) var90, var42, var91, var36, var92, var39, var93, (float) arg19, (float) var94, var24, var95, var27, var96, var30, var97, var33, var98);
                            var90 += var65;
                            arg3 += var45;
                            var91 += var66;
                            var42 += var46;
                            var92 += var67;
                            var36 += var47;
                            var93 += var68;
                            var39 += var48;
                            var94 = (int) ((float) var94 + var69);
                            arg19 = (int) ((float) arg19 + var49);
                            var95 += var70;
                            var24 += var50;
                            var96 += var71;
                            var27 += var51;
                            var97 += var72;
                            var30 += var52;
                            var98 += var73;
                            var33 += var53;
                            var104 += this.field10522;
                        }
                        while (--var102 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var104, (int) arg3, (int) arg5, var42, var44, var36, var38, var39, var41, (float) arg19, (float) arg21, var24, var26, var27, var29, var30, var32, var33, var35);
                            arg3 += var45;
                            arg5 += var55;
                            var42 += var46;
                            var44 += var56;
                            var36 += var47;
                            var38 += var57;
                            var39 += var48;
                            var41 += var58;
                            arg19 = (int) ((float) arg19 + var49);
                            arg21 = (int) ((float) arg21 + var59);
                            var24 += var50;
                            var26 += var60;
                            var27 += var51;
                            var29 += var61;
                            var30 += var52;
                            var32 += var62;
                            var33 += var53;
                            var35 += var63;
                            var104 += this.field10522;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (!(arg1 >= (float) this.field10523)) {
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                if (arg0 > (float) this.field10523) {
                    arg0 = this.field10523;
                }
                if (arg2 < arg0) {
                    float var105 = arg4;
                    float var106 = var43;
                    float var107 = var37;
                    float var108 = var40;
                    int var109 = arg20;
                    float var110 = var25;
                    float var111 = var28;
                    float var112 = var31;
                    float var113 = var34;
                    if (arg1 < 0.0F) {
                        var105 = arg4 - arg1 * var45;
                        arg4 -= arg1 * var55;
                        var106 = var43 - arg1 * var46;
                        var43 -= arg1 * var56;
                        var107 = var37 - arg1 * var47;
                        var37 -= arg1 * var57;
                        var108 = var40 - arg1 * var48;
                        var40 -= arg1 * var58;
                        var109 = (int) ((float) arg20 - arg1 * var49);
                        arg20 = (int) ((float) arg20 - arg1 * var59);
                        var110 = var25 - arg1 * var50;
                        var25 -= arg1 * var60;
                        var111 = var28 - arg1 * var51;
                        var28 -= arg1 * var61;
                        var112 = var31 - arg1 * var52;
                        var31 -= arg1 * var62;
                        var113 = var34 - arg1 * var53;
                        var34 -= arg1 * var63;
                        arg1 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var65;
                        var44 -= arg2 * var66;
                        var38 -= arg2 * var67;
                        var41 -= arg2 * var68;
                        arg21 = (int) ((float) arg21 - arg2 * var69);
                        var26 -= arg2 * var70;
                        var29 -= arg2 * var71;
                        var32 -= arg2 * var72;
                        var35 -= arg2 * var73;
                        arg2 = 0.0F;
                    }
                    if ((arg1 == arg2 || !(var45 < var55)) && (arg1 != arg2 || !(var45 > var65))) {
                        float var117 = arg0 - arg2;
                        float var118 = arg2 - arg1;
                        float var119 = (float) this.field10514[(int) arg1];
                        while (--var118 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var119, (int) arg4, (int) var105, var43, var106, var37, var107, var40, var108, (float) arg20, (float) var109, var25, var110, var28, var111, var31, var112, var34, var113);
                            arg4 += var55;
                            var105 += var45;
                            var43 += var56;
                            var106 += var46;
                            var37 += var57;
                            var107 += var47;
                            var40 += var58;
                            var108 += var48;
                            arg20 = (int) ((float) arg20 + var59);
                            var109 = (int) ((float) var109 + var49);
                            var25 += var60;
                            var110 += var50;
                            var28 += var61;
                            var111 += var51;
                            var31 += var62;
                            var112 += var52;
                            var34 += var63;
                            var113 += var53;
                            var119 += this.field10522;
                        }
                        while (--var117 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var119, (int) arg5, (int) var105, var44, var106, var38, var107, var41, var108, (float) arg21, (float) var109, var26, var110, var29, var111, var32, var112, var35, var113);
                            arg5 += var65;
                            var105 += var45;
                            var44 += var66;
                            var106 += var46;
                            var38 += var67;
                            var107 += var47;
                            var41 += var68;
                            var108 += var48;
                            arg21 = (int) ((float) arg21 + var69);
                            var109 = (int) ((float) var109 + var49);
                            var26 += var70;
                            var110 += var50;
                            var29 += var71;
                            var111 += var51;
                            var32 += var72;
                            var112 += var52;
                            var35 += var73;
                            var113 += var53;
                            var119 += this.field10522;
                        }
                    } else {
                        float var114 = arg0 - arg2;
                        float var115 = arg2 - arg1;
                        float var116 = (float) this.field10514[(int) arg1];
                        while (--var115 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var116, (int) var105, (int) arg4, var106, var43, var107, var37, var108, var40, (float) var109, (float) arg20, var110, var25, var111, var28, var112, var31, var113, var34);
                            var105 += var45;
                            arg4 += var55;
                            var106 += var46;
                            var43 += var56;
                            var107 += var47;
                            var37 += var57;
                            var108 += var48;
                            var40 += var58;
                            var109 = (int) ((float) var109 + var49);
                            arg20 = (int) ((float) arg20 + var59);
                            var110 += var50;
                            var25 += var60;
                            var111 += var51;
                            var28 += var61;
                            var112 += var52;
                            var31 += var62;
                            var113 += var53;
                            var34 += var63;
                            var116 += this.field10522;
                        }
                        while (--var114 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var116, (int) var105, (int) arg5, var106, var44, var107, var38, var108, var41, (float) var109, (float) arg21, var110, var26, var111, var29, var112, var32, var113, var35);
                            var105 += var45;
                            arg5 += var65;
                            var106 += var46;
                            var44 += var66;
                            var107 += var47;
                            var38 += var67;
                            var108 += var48;
                            var41 += var68;
                            var109 = (int) ((float) var109 + var49);
                            arg21 = (int) ((float) arg21 + var69);
                            var110 += var50;
                            var26 += var70;
                            var111 += var51;
                            var29 += var71;
                            var112 += var52;
                            var32 += var72;
                            var113 += var53;
                            var35 += var73;
                            var116 += this.field10522;
                        }
                    }
                } else {
                    float var120 = arg4;
                    float var121 = var43;
                    float var122 = var37;
                    float var123 = var40;
                    int var124 = arg20;
                    float var125 = var25;
                    float var126 = var28;
                    float var127 = var31;
                    float var128 = var34;
                    if (arg1 < 0.0F) {
                        var120 = arg4 - arg1 * var45;
                        arg4 -= arg1 * var55;
                        var121 = var43 - arg1 * var46;
                        var43 -= arg1 * var56;
                        var122 = var37 - arg1 * var47;
                        var37 -= arg1 * var57;
                        var123 = var40 - arg1 * var48;
                        var40 -= arg1 * var58;
                        var124 = (int) ((float) arg20 - arg1 * var49);
                        arg20 = (int) ((float) arg20 - arg1 * var59);
                        var125 = var25 - arg1 * var50;
                        var25 -= arg1 * var60;
                        var126 = var28 - arg1 * var51;
                        var28 -= arg1 * var61;
                        var127 = var31 - arg1 * var52;
                        var31 -= arg1 * var62;
                        var128 = var34 - arg1 * var53;
                        var34 -= arg1 * var63;
                        arg1 = 0.0F;
                    }
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var65;
                        var42 -= arg0 * var66;
                        var36 -= arg0 * var67;
                        var39 -= arg0 * var68;
                        arg19 = (int) ((float) arg19 - arg0 * var69);
                        var24 -= arg0 * var70;
                        var27 -= arg0 * var71;
                        var30 -= arg0 * var72;
                        var33 -= arg0 * var73;
                        arg0 = 0.0F;
                    }
                    float var129 = arg2 - arg0;
                    float var130 = arg0 - arg1;
                    float var131 = (float) this.field10514[(int) arg1];
                    if (var45 < var55) {
                        while (--var130 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var131, (int) var120, (int) arg4, var121, var43, var122, var37, var123, var40, (float) var124, (float) arg20, var125, var25, var126, var28, var127, var31, var128, var34);
                            var120 += var45;
                            arg4 += var55;
                            var121 += var46;
                            var43 += var56;
                            var122 += var47;
                            var37 += var57;
                            var123 += var48;
                            var40 += var58;
                            var124 = (int) ((float) var124 + var49);
                            arg20 = (int) ((float) arg20 + var59);
                            var125 += var50;
                            var25 += var60;
                            var126 += var51;
                            var28 += var61;
                            var127 += var52;
                            var31 += var62;
                            var128 += var53;
                            var34 += var63;
                            var131 += this.field10522;
                        }
                        while (--var129 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var131, (int) arg3, (int) arg4, var42, var43, var36, var37, var39, var40, (float) arg19, (float) arg20, var24, var25, var27, var28, var30, var31, var33, var34);
                            arg3 += var65;
                            arg4 += var55;
                            var42 += var66;
                            var43 += var56;
                            var36 += var67;
                            var37 += var57;
                            var39 += var68;
                            var40 += var58;
                            arg19 = (int) ((float) arg19 + var69);
                            arg20 = (int) ((float) arg20 + var59);
                            var24 += var70;
                            var25 += var60;
                            var27 += var71;
                            var28 += var61;
                            var30 += var72;
                            var31 += var62;
                            var33 += var73;
                            var34 += var63;
                            var131 += this.field10522;
                        }
                    } else {
                        while (--var130 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var131, (int) arg4, (int) var120, var43, var121, var37, var122, var40, var123, (float) arg20, (float) var124, var25, var125, var28, var126, var31, var127, var34, var128);
                            arg4 += var55;
                            var120 += var45;
                            var43 += var56;
                            var121 += var46;
                            var37 += var57;
                            var122 += var47;
                            var40 += var58;
                            var123 += var48;
                            arg20 = (int) ((float) arg20 + var59);
                            var124 = (int) ((float) var124 + var49);
                            var25 += var60;
                            var125 += var50;
                            var28 += var61;
                            var126 += var51;
                            var31 += var62;
                            var127 += var52;
                            var34 += var63;
                            var128 += var53;
                            var131 += this.field10522;
                        }
                        while (--var129 >= 0.0F) {
                            this.method4203(this.field10519, this.field10541, (int) var131, (int) arg4, (int) arg3, var43, var42, var37, var36, var40, var39, (float) arg20, (float) arg19, var25, var24, var28, var27, var31, var30, var34, var33);
                            arg4 += var55;
                            arg3 += var65;
                            var43 += var56;
                            var42 += var66;
                            var37 += var57;
                            var36 += var67;
                            var40 += var58;
                            var39 += var68;
                            arg20 = (int) ((float) arg20 + var59);
                            arg19 = (int) ((float) arg19 + var69);
                            var25 += var60;
                            var24 += var70;
                            var28 += var61;
                            var27 += var71;
                            var31 += var62;
                            var30 += var72;
                            var34 += var63;
                            var33 += var73;
                            var131 += this.field10522;
                        }
                    }
                }
            }
        } else if (!(arg2 >= (float) this.field10523)) {
            if (arg0 > (float) this.field10523) {
                arg0 = this.field10523;
            }
            if (arg1 > (float) this.field10523) {
                arg1 = this.field10523;
            }
            if (arg0 < arg1) {
                float var132 = arg5;
                float var133 = var44;
                float var134 = var38;
                float var135 = var41;
                int var136 = arg21;
                float var137 = var26;
                float var138 = var29;
                float var139 = var32;
                float var140 = var35;
                if (arg2 < 0.0F) {
                    arg5 -= arg2 * var65;
                    var132 -= arg2 * var55;
                    var44 -= arg2 * var66;
                    var133 -= arg2 * var56;
                    var38 -= arg2 * var67;
                    var134 -= arg2 * var57;
                    var41 -= arg2 * var68;
                    var135 -= arg2 * var58;
                    arg21 = (int) ((float) arg21 - var69 * 3.0F);
                    var136 = (int) ((float) var136 - arg2 * var59);
                    var26 -= arg2 * var70;
                    var137 -= arg2 * var60;
                    var29 -= arg2 * var71;
                    var138 -= arg2 * var61;
                    var32 -= arg2 * var72;
                    var139 -= arg2 * var62;
                    var35 -= arg2 * var73;
                    var140 -= arg2 * var63;
                    arg2 = 0.0F;
                }
                if (arg0 < 0.0F) {
                    arg3 -= arg0 * var45;
                    var42 -= arg0 * var46;
                    var36 -= arg0 * var47;
                    var39 -= arg0 * var48;
                    arg19 = (int) ((float) arg19 - arg0 * var49);
                    var24 -= arg0 * var50;
                    var27 -= arg0 * var51;
                    var30 -= arg0 * var52;
                    var33 -= arg0 * var53;
                    arg0 = 0.0F;
                }
                if (var55 < var65) {
                    float var141 = arg1 - arg0;
                    float var142 = arg0 - arg2;
                    float var143 = (float) this.field10514[(int) arg2];
                    while (--var142 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var143, (int) var132, (int) arg5, var133, var44, var134, var38, var135, var41, (float) var136, (float) arg21, var137, var26, var138, var29, var139, var32, var140, var35);
                        var132 += var55;
                        arg5 += var65;
                        var133 += var56;
                        var44 += var66;
                        var134 += var57;
                        var38 += var67;
                        var135 += var58;
                        var41 += var68;
                        var136 = (int) ((float) var136 + var59);
                        arg21 = (int) ((float) arg21 + var69);
                        var137 += var60;
                        var26 += var70;
                        var138 += var61;
                        var29 += var71;
                        var139 += var62;
                        var32 += var72;
                        var140 += var63;
                        var35 += var73;
                        var143 += this.field10522;
                    }
                    while (--var141 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var143, (int) var132, (int) arg3, var133, var42, var134, var36, var135, var39, (float) var136, (float) arg19, var137, var24, var138, var27, var139, var30, var140, var33);
                        var132 += var55;
                        arg3 += var45;
                        var133 += var56;
                        var42 += var46;
                        var134 += var57;
                        var36 += var47;
                        var135 += var58;
                        var39 += var48;
                        var136 = (int) ((float) var136 + var59);
                        arg19 = (int) ((float) arg19 + var49);
                        var137 += var60;
                        var24 += var50;
                        var138 += var61;
                        var27 += var51;
                        var139 += var62;
                        var30 += var52;
                        var140 += var63;
                        var33 += var53;
                        var143 += this.field10522;
                    }
                } else {
                    float var144 = arg1 - arg0;
                    float var145 = arg0 - arg2;
                    float var146 = (float) this.field10514[(int) arg2];
                    while (--var145 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var146, (int) arg5, (int) var132, var44, var133, var38, var134, var41, var135, (float) arg21, (float) var136, var26, var137, var29, var138, var32, var139, var35, var140);
                        arg5 += var65;
                        var132 += var55;
                        var44 += var66;
                        var133 += var56;
                        var38 += var67;
                        var134 += var57;
                        var41 += var68;
                        var135 += var58;
                        arg21 = (int) ((float) arg21 + var69);
                        var136 = (int) ((float) var136 + var59);
                        var26 += var70;
                        var137 += var60;
                        var29 += var71;
                        var138 += var61;
                        var32 += var72;
                        var139 += var62;
                        var35 += var73;
                        var140 += var63;
                        var146 += this.field10522;
                    }
                    while (--var144 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var146, (int) arg3, (int) var132, var42, var133, var36, var134, var39, var135, (float) arg19, (float) var136, var24, var137, var27, var138, var30, var139, var33, var140);
                        arg3 += var45;
                        var132 += var55;
                        var42 += var46;
                        var133 += var56;
                        var36 += var47;
                        var134 += var57;
                        var39 += var48;
                        var135 += var58;
                        arg19 = (int) ((float) arg19 + var49);
                        var136 = (int) ((float) var136 + var59);
                        var24 += var50;
                        var137 += var60;
                        var27 += var51;
                        var138 += var61;
                        var30 += var52;
                        var139 += var62;
                        var33 += var53;
                        var140 += var63;
                        var146 += this.field10522;
                    }
                }
            } else {
                float var147 = arg5;
                float var148 = var44;
                float var149 = var38;
                float var150 = var41;
                int var151 = arg21;
                float var152 = var26;
                float var153 = var29;
                float var154 = var32;
                float var155 = var35;
                if (arg2 < 0.0F) {
                    arg5 -= arg2 * var65;
                    var147 -= arg2 * var55;
                    var44 -= arg2 * var66;
                    var148 -= arg2 * var56;
                    var38 -= arg2 * var67;
                    var149 -= arg2 * var57;
                    var41 -= arg2 * var68;
                    var150 -= arg2 * var58;
                    arg21 = (int) ((float) arg21 - var69 * 3.0F);
                    var151 = (int) ((float) var151 - arg2 * var59);
                    var26 -= arg2 * var70;
                    var152 -= arg2 * var60;
                    var29 -= arg2 * var71;
                    var153 -= arg2 * var61;
                    var32 -= arg2 * var72;
                    var154 -= arg2 * var62;
                    var35 -= arg2 * var73;
                    var155 -= arg2 * var63;
                    arg2 = 0.0F;
                }
                if (arg1 < 0.0F) {
                    arg4 -= arg1 * var45;
                    var43 -= arg1 * var46;
                    var37 -= arg1 * var47;
                    var40 -= arg1 * var48;
                    arg20 = (int) ((float) arg20 - arg1 * var49);
                    var25 -= arg1 * var50;
                    var28 -= arg1 * var51;
                    var31 -= arg1 * var52;
                    var34 -= arg1 * var53;
                    arg1 = 0.0F;
                }
                if (var55 < var65) {
                    float var156 = arg0 - arg1;
                    float var157 = arg1 - arg2;
                    float var158 = (float) this.field10514[(int) arg2];
                    while (--var157 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var158, (int) var147, (int) arg5, var148, var44, var149, var38, var150, var41, (float) var151, (float) arg21, var152, var26, var153, var29, var154, var32, var155, var35);
                        var147 += var55;
                        arg5 += var65;
                        var148 += var56;
                        var44 += var66;
                        var149 += var57;
                        var38 += var67;
                        var150 += var58;
                        var41 += var68;
                        var151 = (int) ((float) var151 + var59);
                        arg21 = (int) ((float) arg21 + var69);
                        var152 += var60;
                        var26 += var70;
                        var153 += var61;
                        var29 += var71;
                        var154 += var62;
                        var32 += var72;
                        var155 += var63;
                        var35 += var73;
                        var158 += this.field10522;
                    }
                    while (--var156 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var158, (int) arg4, (int) arg5, var43, var44, var37, var38, var40, var41, (float) arg20, (float) arg21, var25, var26, var28, var29, var31, var32, var34, var35);
                        arg4 += var45;
                        arg5 += var65;
                        var43 += var46;
                        var44 += var66;
                        var37 += var47;
                        var38 += var67;
                        var40 += var48;
                        var41 += var68;
                        arg20 = (int) ((float) arg20 + var49);
                        arg21 = (int) ((float) arg21 + var69);
                        var25 += var50;
                        var26 += var70;
                        var28 += var51;
                        var29 += var71;
                        var31 += var52;
                        var32 += var72;
                        var34 += var53;
                        var35 += var73;
                        var158 += this.field10522;
                    }
                } else {
                    float var159 = arg0 - arg1;
                    float var160 = arg1 - arg2;
                    float var161 = (float) this.field10514[(int) arg2];
                    while (--var160 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var161, (int) arg5, (int) var147, var44, var148, var38, var149, var41, var150, (float) arg21, (float) var151, var26, var152, var29, var153, var32, var154, var35, var155);
                        arg5 += var65;
                        var147 += var55;
                        var44 += var66;
                        var148 += var56;
                        var38 += var67;
                        var149 += var57;
                        var41 += var68;
                        var150 += var58;
                        arg21 = (int) ((float) arg21 + var69);
                        var151 = (int) ((float) var151 + var59);
                        var26 += var70;
                        var152 += var60;
                        var29 += var71;
                        var153 += var61;
                        var32 += var72;
                        var154 += var62;
                        var35 += var73;
                        var155 += var63;
                        var161 += this.field10522;
                    }
                    while (--var159 >= 0.0F) {
                        this.method4203(this.field10519, this.field10541, (int) var161, (int) arg5, (int) arg4, var44, var43, var38, var37, var41, var40, (float) arg21, (float) arg20, var26, var25, var29, var28, var32, var31, var35, var34);
                        arg5 += var65;
                        arg4 += var45;
                        var44 += var66;
                        var43 += var46;
                        var38 += var67;
                        var37 += var47;
                        var41 += var68;
                        var40 += var48;
                        arg21 = (int) ((float) arg21 + var69);
                        arg20 = (int) ((float) arg20 + var49);
                        var26 += var70;
                        var25 += var50;
                        var29 += var71;
                        var28 += var51;
                        var32 += var72;
                        var31 += var52;
                        var35 += var73;
                        var34 += var53;
                        var161 += this.field10522;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "()I")
    public final int method4211() {
        return this.field10514[0] % this.field10522;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFFFFIII)V")
    public final void method4212(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        if (this.field10525) {
            this.field10518.method419((int) arg4, arg9 | 0xFF000000, (int) arg3, (int) arg1, (byte) 34, (int) arg0);
            this.field10518.method419((int) arg5, arg9 | 0xFF000000, (int) arg4, (int) arg2, (byte) 34, (int) arg1);
            this.field10518.method419((int) arg3, arg9 | 0xFF000000, (int) arg5, (int) arg0, (byte) 34, (int) arg2);
            return;
        }
        float var13 = arg4 - arg3;
        float var14 = arg1 - arg0;
        float var15 = arg5 - arg3;
        float var16 = arg2 - arg0;
        float var17 = arg7 - arg6;
        float var18 = arg8 - arg6;
        float var19 = (float) ((arg10 & 0xFF0000) - (arg9 & 0xFF0000));
        float var20 = (float) ((arg11 & 0xFF0000) - (arg9 & 0xFF0000));
        float var21 = (float) ((arg10 & 0xFF00) - (arg9 & 0xFF00));
        float var22 = (float) ((arg11 & 0xFF00) - (arg9 & 0xFF00));
        float var23 = (float) ((arg10 & 0xFF) - (arg9 & 0xFF));
        float var24 = (float) ((arg11 & 0xFF) - (arg9 & 0xFF));
        float var25;
        if (arg1 == arg2) {
            var25 = 0.0F;
        } else {
            var25 = (arg5 - arg4) / (arg2 - arg1);
        }
        float var26;
        if (arg0 == arg1) {
            var26 = 0.0F;
        } else {
            var26 = var13 / var14;
        }
        float var27;
        if (arg0 == arg2) {
            var27 = 0.0F;
        } else {
            var27 = var15 / var16;
        }
        float var28 = var13 * var16 - var14 * var15;
        if (var28 == 0.0F) {
            return;
        }
        float var29 = (var16 * var17 - var14 * var18) / var28;
        float var30 = (var13 * var18 - var15 * var17) / var28;
        float var31 = (var16 * var19 - var14 * var20) / var28;
        float var32 = (var13 * var20 - var15 * var19) / var28;
        float var33 = (var16 * var21 - var14 * var22) / var28;
        float var34 = (var13 * var22 - var15 * var21) / var28;
        float var35 = (var16 * var23 - var14 * var24) / var28;
        float var36 = (var13 * var24 - var15 * var23) / var28;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (!(arg0 >= (float) this.field10523)) {
                if (arg1 > (float) this.field10523) {
                    arg1 = this.field10523;
                }
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                float var37 = arg6 + var29 - arg3 * var29;
                float var38 = (float) (arg9 & 0xFF0000) + var31 - arg3 * var31;
                float var39 = (float) (arg9 & 0xFF00) + var33 - arg3 * var33;
                float var40 = (float) (arg9 & 0xFF) + var35 - arg3 * var35;
                if (arg1 < arg2) {
                    float var41 = arg3;
                    if (arg0 < 0.0F) {
                        var41 = arg3 - arg0 * var27;
                        arg3 -= arg0 * var26;
                        var37 -= arg0 * var30;
                        var38 -= arg0 * var32;
                        var39 -= arg0 * var34;
                        var40 -= arg0 * var36;
                        arg0 = 0.0F;
                    }
                    if (arg1 < 0.0F) {
                        arg4 -= arg1 * var25;
                        arg1 = 0.0F;
                    }
                    if (arg0 != arg1 && var27 < var26 || arg0 == arg1 && var27 > var25) {
                        float var42 = arg2 - arg1;
                        float var43 = arg1 - arg0;
                        float var44 = (float) this.field10514[(int) arg0];
                        while (--var43 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var44, 0, 0, (int) var41, (int) arg3, var37, var29, var38, var31, var39, var33, var40, var35);
                            var41 += var27;
                            arg3 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var44 += this.field10522;
                        }
                        while (--var42 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var44, 0, 0, (int) var41, (int) arg4, var37, var29, var38, var31, var39, var33, var40, var35);
                            var41 += var27;
                            arg4 += var25;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var44 += this.field10522;
                        }
                    } else {
                        float var45 = arg2 - arg1;
                        float var46 = arg1 - arg0;
                        float var47 = (float) this.field10514[(int) arg0];
                        while (--var46 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var47, 0, 0, (int) arg3, (int) var41, var37, var29, var38, var31, var39, var33, var40, var35);
                            var41 += var27;
                            arg3 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var47 += this.field10522;
                        }
                        while (--var45 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var47, 0, 0, (int) arg4, (int) var41, var37, var29, var38, var31, var39, var33, var40, var35);
                            var41 += var27;
                            arg4 += var25;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var47 += this.field10522;
                        }
                    }
                } else {
                    float var48 = arg3;
                    if (arg0 < 0.0F) {
                        var48 = arg3 - arg0 * var27;
                        arg3 -= arg0 * var26;
                        var37 -= arg0 * var30;
                        var38 -= arg0 * var32;
                        var39 -= arg0 * var34;
                        var40 -= arg0 * var36;
                        arg0 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var25;
                        arg2 = 0.0F;
                    }
                    if (arg0 != arg2 && var27 < var26 || arg0 == arg2 && var25 > var26) {
                        float var49 = arg1 - arg2;
                        float var50 = arg2 - arg0;
                        float var51 = (float) this.field10514[(int) arg0];
                        while (--var50 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var51, 0, 0, (int) var48, (int) arg3, var37, var29, var38, var31, var39, var33, var40, var35);
                            var48 += var27;
                            arg3 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var51 += this.field10522;
                        }
                        while (--var49 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var51, 0, 0, (int) arg5, (int) arg3, var37, var29, var38, var31, var39, var33, var40, var35);
                            arg5 += var25;
                            arg3 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var51 += this.field10522;
                        }
                    } else {
                        float var52 = arg1 - arg2;
                        float var53 = arg2 - arg0;
                        float var54 = (float) this.field10514[(int) arg0];
                        while (--var53 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var54, 0, 0, (int) arg3, (int) var48, var37, var29, var38, var31, var39, var33, var40, var35);
                            var48 += var27;
                            arg3 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var54 += this.field10522;
                        }
                        while (--var52 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var54, 0, 0, (int) arg3, (int) arg5, var37, var29, var38, var31, var39, var33, var40, var35);
                            arg5 += var25;
                            arg3 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var54 += this.field10522;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (!(arg1 >= (float) this.field10523)) {
                if (arg2 > (float) this.field10523) {
                    arg2 = this.field10523;
                }
                if (arg0 > (float) this.field10523) {
                    arg0 = this.field10523;
                }
                float var55 = arg7 + var29 - arg4 * var29;
                float var56 = (float) (arg10 & 0xFF0000) + var31 - arg4 * var31;
                float var57 = (float) (arg10 & 0xFF00) + var33 - arg4 * var33;
                float var58 = (float) (arg10 & 0xFF) + var35 - arg4 * var35;
                if (arg2 < arg0) {
                    float var59 = arg4;
                    if (arg1 < 0.0F) {
                        var59 = arg4 - arg1 * var26;
                        arg4 -= arg1 * var25;
                        var55 -= arg1 * var30;
                        var56 -= arg1 * var32;
                        var57 -= arg1 * var34;
                        var58 -= arg1 * var36;
                        arg1 = 0.0F;
                    }
                    if (arg2 < 0.0F) {
                        arg5 -= arg2 * var27;
                        arg2 = 0.0F;
                    }
                    if (arg1 != arg2 && var26 < var25 || arg1 == arg2 && var26 > var27) {
                        float var60 = arg0 - arg2;
                        float var61 = arg2 - arg1;
                        float var62 = (float) this.field10514[(int) arg1];
                        while (--var61 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var62, 0, 0, (int) var59, (int) arg4, var55, var29, var56, var31, var57, var33, var58, var35);
                            var59 += var26;
                            arg4 += var25;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var62 += this.field10522;
                        }
                        while (--var60 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var62, 0, 0, (int) var59, (int) arg5, var55, var29, var56, var31, var57, var33, var58, var35);
                            var59 += var26;
                            arg5 += var27;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var62 += this.field10522;
                        }
                    } else {
                        float var63 = arg0 - arg2;
                        float var64 = arg2 - arg1;
                        float var65 = (float) this.field10514[(int) arg1];
                        while (--var64 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var65, 0, 0, (int) arg4, (int) var59, var55, var29, var56, var31, var57, var33, var58, var35);
                            var59 += var26;
                            arg4 += var25;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var65 += this.field10522;
                        }
                        while (--var63 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var65, 0, 0, (int) arg5, (int) var59, var55, var29, var56, var31, var57, var33, var58, var35);
                            var59 += var26;
                            arg5 += var27;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var65 += this.field10522;
                        }
                    }
                } else {
                    float var66 = arg4;
                    if (arg1 < 0.0F) {
                        var66 = arg4 - arg1 * var26;
                        arg4 -= arg1 * var25;
                        var55 -= arg1 * var30;
                        var56 -= arg1 * var32;
                        var57 -= arg1 * var34;
                        var58 -= arg1 * var36;
                        arg1 = 0.0F;
                    }
                    if (arg0 < 0.0F) {
                        arg3 -= arg0 * var27;
                        arg0 = 0.0F;
                    }
                    if (var26 < var25) {
                        float var67 = arg2 - arg0;
                        float var68 = arg0 - arg1;
                        float var69 = (float) this.field10514[(int) arg1];
                        while (--var68 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var69, 0, 0, (int) var66, (int) arg4, var55, var29, var56, var31, var57, var33, var58, var35);
                            var66 += var26;
                            arg4 += var25;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var69 += this.field10522;
                        }
                        while (--var67 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var69, 0, 0, (int) arg3, (int) arg4, var55, var29, var56, var31, var57, var33, var58, var35);
                            arg3 += var27;
                            arg4 += var25;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var69 += this.field10522;
                        }
                    } else {
                        float var70 = arg2 - arg0;
                        float var71 = arg0 - arg1;
                        float var72 = (float) this.field10514[(int) arg1];
                        while (--var71 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var72, 0, 0, (int) arg4, (int) var66, var55, var29, var56, var31, var57, var33, var58, var35);
                            var66 += var26;
                            arg4 += var25;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var72 += this.field10522;
                        }
                        while (--var70 >= 0.0F) {
                            this.method4208(this.field10519, this.field10516, (int) var72, 0, 0, (int) arg4, (int) arg3, var55, var29, var56, var31, var57, var33, var58, var35);
                            arg3 += var27;
                            arg4 += var25;
                            var55 += var30;
                            var56 += var32;
                            var57 += var34;
                            var58 += var36;
                            var72 += this.field10522;
                        }
                    }
                }
            }
        } else if (!(arg2 >= (float) this.field10523)) {
            if (arg0 > (float) this.field10523) {
                arg0 = this.field10523;
            }
            if (arg1 > (float) this.field10523) {
                arg1 = this.field10523;
            }
            float var73 = arg8 + var29 - arg5 * var29;
            float var74 = (float) (arg11 & 0xFF0000) + var31 - arg5 * var31;
            float var75 = (float) (arg11 & 0xFF00) + var33 - arg5 * var33;
            float var76 = (float) (arg11 & 0xFF) + var35 - arg5 * var35;
            if (arg0 < arg1) {
                float var77 = arg5;
                if (arg2 < 0.0F) {
                    var77 = arg5 - arg2 * var25;
                    arg5 -= arg2 * var27;
                    var73 -= arg2 * var30;
                    var74 -= arg2 * var32;
                    var75 -= arg2 * var34;
                    var76 -= arg2 * var36;
                    arg2 = 0.0F;
                }
                if (arg0 < 0.0F) {
                    arg3 -= arg0 * var26;
                    arg0 = 0.0F;
                }
                if (var25 < var27) {
                    float var78 = arg1 - arg0;
                    float var79 = arg0 - arg2;
                    float var80 = (float) this.field10514[(int) arg2];
                    while (--var79 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var80, 0, 0, (int) var77, (int) arg5, var73, var29, var74, var31, var75, var33, var76, var35);
                        var77 += var25;
                        arg5 += var27;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var80 += this.field10522;
                    }
                    while (--var78 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var80, 0, 0, (int) var77, (int) arg3, var73, var29, var74, var31, var75, var33, var76, var35);
                        var77 += var25;
                        arg3 += var26;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var80 += this.field10522;
                    }
                } else {
                    float var81 = arg1 - arg0;
                    float var82 = arg0 - arg2;
                    float var83 = (float) this.field10514[(int) arg2];
                    while (--var82 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var83, 0, 0, (int) arg5, (int) var77, var73, var29, var74, var31, var75, var33, var76, var35);
                        var77 += var25;
                        arg5 += var27;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var83 += this.field10522;
                    }
                    while (--var81 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var83, 0, 0, (int) arg3, (int) var77, var73, var29, var74, var31, var75, var33, var76, var35);
                        var77 += var25;
                        arg3 += var26;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var83 += this.field10522;
                    }
                }
            } else {
                float var84 = arg5;
                if (arg2 < 0.0F) {
                    var84 = arg5 - arg2 * var25;
                    arg5 -= arg2 * var27;
                    var73 -= arg2 * var30;
                    var74 -= arg2 * var32;
                    var75 -= arg2 * var34;
                    var76 -= arg2 * var36;
                    arg2 = 0.0F;
                }
                if (arg1 < 0.0F) {
                    arg4 -= arg1 * var26;
                    arg1 = 0.0F;
                }
                if (var25 < var27) {
                    float var85 = arg0 - arg1;
                    float var86 = arg1 - arg2;
                    float var87 = (float) this.field10514[(int) arg2];
                    while (--var86 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var87, 0, 0, (int) var84, (int) arg5, var73, var29, var74, var31, var75, var33, var76, var35);
                        var84 += var25;
                        arg5 += var27;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var87 += this.field10522;
                    }
                    while (--var85 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var87, 0, 0, (int) arg4, (int) arg5, var73, var29, var74, var31, var75, var33, var76, var35);
                        arg4 += var26;
                        arg5 += var27;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var87 += this.field10522;
                    }
                } else {
                    float var88 = arg0 - arg1;
                    float var89 = arg1 - arg2;
                    float var90 = (float) this.field10514[(int) arg2];
                    while (--var89 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var90, 0, 0, (int) arg5, (int) var84, var73, var29, var74, var31, var75, var33, var76, var35);
                        var84 += var25;
                        arg5 += var27;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var90 += this.field10522;
                    }
                    while (--var88 >= 0.0F) {
                        this.method4208(this.field10519, this.field10516, (int) var90, 0, 0, (int) arg5, (int) arg4, var73, var29, var74, var31, var75, var33, var76, var35);
                        arg4 += var26;
                        arg5 += var27;
                        var73 += var30;
                        var74 += var32;
                        var75 += var34;
                        var76 += var36;
                        var90 += this.field10522;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lni;Llda;)V")
    public class765(class545 arg0, class509 arg1) {
        this.field10518 = arg0;
        this.field10513 = arg1;
        this.field10522 = this.field10518.field7686;
        this.field10519 = this.field10518.field7694;
        this.field10516 = this.field10518.field7698;
    }
}
