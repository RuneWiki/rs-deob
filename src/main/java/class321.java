import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class321 extends class682 {

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    private int field4450 = -1;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lve;")
    private class578 field4439;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    private int field4441;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[[B")
    private byte[][] field4436;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "[[B")
    private byte[][] field4448;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "F")
    private float field4435;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "F")
    private float field4438;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "F")
    private float field4440;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "F")
    private float field4442;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "F")
    private float field4443;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "F")
    private float field4444;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "F")
    private float field4446;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "F")
    private float field4447;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "F")
    private float field4449;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "F")
    private float field4451;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "F")
    private float field4453;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "F")
    private float field4454;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "[[Lft;")
    private class285[][] field4455;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[[Ljr;")
    private class287[][] field4437;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[[Liu;")
    private class474[][] field4445;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "[[Lnba;")
    private class566[][] field4452;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILoga;[I[I[I[I)V", line = 4)
    private final void method1917(int arg0, int arg1, class159 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class287 var8 = this.field4437[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4040 & 2) == 0) {
                int var9 = super.field9709 * arg0;
                int var10 = super.field9709 + var9;
                int var11 = super.field9709 * arg1;
                int var12 = super.field9709 + var11;
                float var15;
                float var16;
                float var17;
                float var18;
                float var21;
                int var22;
                float var23;
                int var24;
                float var25;
                int var26;
                float var27;
                int var28;
                int var30;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                if ((var8.field4040 & 1) != 0) {
                    int var13 = super.field9713[arg0][arg1];
                    float var14 = (float) var13 * this.field4449;
                    if (this.field4450 == -1) {
                        var15 = (float) var11 * this.field4454 + (float) var9 * this.field4443 + var14 + this.field4446;
                        if (var15 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var16 = (float) var11 * this.field4454 + (float) var10 * this.field4443 + var14 + this.field4446;
                        if (var16 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var17 = (float) var12 * this.field4454 + (float) var10 * this.field4443 + var14 + this.field4446;
                        if (var17 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var18 = (float) var12 * this.field4454 + (float) var9 * this.field4443 + var14 + this.field4446;
                        if (var18 <= (float) this.field4439.field8476) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field4454 + (float) var9 * this.field4443 + var14 + this.field4446;
                        var16 = (float) var11 * this.field4454 + (float) var10 * this.field4443 + var14 + this.field4446;
                        var17 = (float) var12 * this.field4454 + (float) var10 * this.field4443 + var14 + this.field4446;
                        var18 = (float) var12 * this.field4454 + (float) var9 * this.field4443 + var14 + this.field4446;
                    }
                    float var19 = (float) var13 * this.field4444;
                    float var20 = (float) var13 * this.field4447;
                    if (this.field4450 == -1) {
                        var21 = (float) var11 * this.field4442 + (float) var9 * this.field4438 + var19 + this.field4435;
                        var22 = (int) ((float) this.field4439.field8486 * var21 / var15) + arg2.field2579;
                        var23 = (float) var11 * this.field4453 + (float) var9 * this.field4451 + var20 + this.field4440;
                        var24 = (int) ((float) this.field4439.field8472 * var23 / var15) + arg2.field2587;
                        var25 = (float) var11 * this.field4442 + (float) var10 * this.field4438 + var19 + this.field4435;
                        var26 = (int) ((float) this.field4439.field8486 * var25 / var16) + arg2.field2579;
                        var27 = (float) var11 * this.field4453 + (float) var10 * this.field4451 + var20 + this.field4440;
                        var28 = (int) ((float) this.field4439.field8472 * var27 / var16) + arg2.field2587;
                        float var29 = (float) var12 * this.field4442 + (float) var10 * this.field4438 + var19 + this.field4435;
                        var30 = (int) ((float) this.field4439.field8486 * var29 / var17) + arg2.field2579;
                        float var31 = (float) var12 * this.field4453 + (float) var10 * this.field4451 + var20 + this.field4440;
                        var32 = (int) ((float) this.field4439.field8472 * var31 / var17) + arg2.field2587;
                        var33 = (float) var12 * this.field4442 + (float) var9 * this.field4438 + var19 + this.field4435;
                        var34 = (int) ((float) this.field4439.field8486 * var33 / var18) + arg2.field2579;
                        var35 = (float) var12 * this.field4453 + (float) var9 * this.field4451 + var20 + this.field4440;
                        var36 = (int) ((float) this.field4439.field8472 * var35 / var18) + arg2.field2587;
                    } else {
                        var21 = (float) var11 * this.field4442 + (float) var9 * this.field4438 + var19 + this.field4435;
                        var22 = (int) ((float) this.field4439.field8486 * var21 / (float) this.field4450) + arg2.field2579;
                        var23 = (float) var11 * this.field4453 + (float) var9 * this.field4451 + var20 + this.field4440;
                        var24 = (int) ((float) this.field4439.field8472 * var23 / (float) this.field4450) + arg2.field2587;
                        var25 = (float) var11 * this.field4442 + (float) var10 * this.field4438 + var19 + this.field4435;
                        var26 = (int) ((float) this.field4439.field8486 * var25 / (float) this.field4450) + arg2.field2579;
                        var27 = (float) var11 * this.field4453 + (float) var10 * this.field4451 + var20 + this.field4440;
                        var28 = (int) ((float) this.field4439.field8472 * var27 / (float) this.field4450) + arg2.field2587;
                        float var37 = (float) var12 * this.field4442 + (float) var10 * this.field4438 + var19 + this.field4435;
                        var30 = (int) ((float) this.field4439.field8486 * var37 / (float) this.field4450) + arg2.field2579;
                        float var38 = (float) var12 * this.field4453 + (float) var10 * this.field4451 + var20 + this.field4440;
                        var32 = (int) ((float) this.field4439.field8472 * var38 / (float) this.field4450) + arg2.field2587;
                        var33 = (float) var12 * this.field4442 + (float) var9 * this.field4438 + var19 + this.field4435;
                        var34 = (int) ((float) this.field4439.field8486 * var33 / (float) this.field4450) + arg2.field2579;
                        var35 = (float) var12 * this.field4453 + (float) var9 * this.field4451 + var20 + this.field4440;
                        var36 = (int) ((float) this.field4439.field8472 * var35 / (float) this.field4450) + arg2.field2587;
                    }
                } else {
                    int var39 = super.field9713[arg0][arg1];
                    int var40 = super.field9713[arg0 + 1][arg1];
                    int var41 = super.field9713[arg0 + 1][arg1 + 1];
                    int var42 = super.field9713[arg0][arg1 + 1];
                    if (this.field4450 == -1) {
                        var15 = (float) var11 * this.field4454 + (float) var9 * this.field4443 + (float) var39 * this.field4449 + this.field4446;
                        if (var15 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var16 = (float) var11 * this.field4454 + (float) var10 * this.field4443 + (float) var40 * this.field4449 + this.field4446;
                        if (var16 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var17 = (float) var12 * this.field4454 + (float) var10 * this.field4443 + (float) var41 * this.field4449 + this.field4446;
                        if (var17 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var18 = (float) var12 * this.field4454 + (float) var9 * this.field4443 + (float) var42 * this.field4449 + this.field4446;
                        if (var18 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var21 = (float) var11 * this.field4442 + (float) var9 * this.field4438 + (float) var39 * this.field4444 + this.field4435;
                        var22 = (int) ((float) this.field4439.field8486 * var21 / var15) + arg2.field2579;
                        var23 = (float) var11 * this.field4453 + (float) var9 * this.field4451 + (float) var39 * this.field4447 + this.field4440;
                        var24 = (int) ((float) this.field4439.field8472 * var23 / var15) + arg2.field2587;
                        var25 = (float) var11 * this.field4442 + (float) var10 * this.field4438 + (float) var40 * this.field4444 + this.field4435;
                        var26 = (int) ((float) this.field4439.field8486 * var25 / var16) + arg2.field2579;
                        var27 = (float) var11 * this.field4453 + (float) var10 * this.field4451 + (float) var40 * this.field4447 + this.field4440;
                        var28 = (int) ((float) this.field4439.field8472 * var27 / var16) + arg2.field2587;
                        float var43 = (float) var12 * this.field4442 + (float) var10 * this.field4438 + (float) var41 * this.field4444 + this.field4435;
                        var30 = (int) ((float) this.field4439.field8486 * var43 / var17) + arg2.field2579;
                        float var44 = (float) var12 * this.field4453 + (float) var10 * this.field4451 + (float) var41 * this.field4447 + this.field4440;
                        var32 = (int) ((float) this.field4439.field8472 * var44 / var17) + arg2.field2587;
                        var33 = (float) var12 * this.field4442 + (float) var9 * this.field4438 + (float) var42 * this.field4444 + this.field4435;
                        var34 = (int) ((float) this.field4439.field8486 * var33 / var18) + arg2.field2579;
                        var35 = (float) var12 * this.field4453 + (float) var9 * this.field4451 + (float) var42 * this.field4447 + this.field4440;
                        var36 = (int) ((float) this.field4439.field8472 * var35 / var18) + arg2.field2587;
                    } else {
                        var15 = (float) var11 * this.field4454 + (float) var9 * this.field4443 + (float) var39 * this.field4449 + this.field4446;
                        var16 = (float) var11 * this.field4454 + (float) var10 * this.field4443 + (float) var40 * this.field4449 + this.field4446;
                        var17 = (float) var12 * this.field4454 + (float) var10 * this.field4443 + (float) var41 * this.field4449 + this.field4446;
                        var18 = (float) var12 * this.field4454 + (float) var9 * this.field4443 + (float) var42 * this.field4449 + this.field4446;
                        var21 = (float) var11 * this.field4442 + (float) var9 * this.field4438 + (float) var39 * this.field4444 + this.field4435;
                        var22 = (int) ((float) this.field4439.field8486 * var21 / (float) this.field4450) + arg2.field2579;
                        var23 = (float) var11 * this.field4453 + (float) var9 * this.field4451 + (float) var39 * this.field4447 + this.field4440;
                        var24 = (int) ((float) this.field4439.field8472 * var23 / (float) this.field4450) + arg2.field2587;
                        var25 = (float) var11 * this.field4442 + (float) var10 * this.field4438 + (float) var40 * this.field4444 + this.field4435;
                        var26 = (int) ((float) this.field4439.field8486 * var25 / (float) this.field4450) + arg2.field2579;
                        var27 = (float) var11 * this.field4453 + (float) var10 * this.field4451 + (float) var40 * this.field4447 + this.field4440;
                        var28 = (int) ((float) this.field4439.field8472 * var27 / (float) this.field4450) + arg2.field2587;
                        float var45 = (float) var12 * this.field4442 + (float) var10 * this.field4438 + (float) var41 * this.field4444 + this.field4435;
                        var30 = (int) ((float) this.field4439.field8486 * var45 / (float) this.field4450) + arg2.field2579;
                        float var46 = (float) var12 * this.field4453 + (float) var10 * this.field4451 + (float) var41 * this.field4447 + this.field4440;
                        var32 = (int) ((float) this.field4439.field8472 * var46 / (float) this.field4450) + arg2.field2587;
                        var33 = (float) var12 * this.field4442 + (float) var9 * this.field4438 + (float) var42 * this.field4444 + this.field4435;
                        var34 = (int) ((float) this.field4439.field8486 * var33 / (float) this.field4450) + arg2.field2579;
                        var35 = (float) var12 * this.field4453 + (float) var9 * this.field4451 + (float) var42 * this.field4447 + this.field4440;
                        var36 = (int) ((float) this.field4439.field8472 * var35 / (float) this.field4450) + arg2.field2587;
                    }
                }
                if (this.field4450 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field2584 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field2593 || var34 > arg2.field2593 || var26 > arg2.field2593;
                        if (var8.field4039 >= 0) {
                            if (this.method1921(this.field4439.field1459.method2359(-123, var8.field4039).field5217)) {
                                arg2.field2577 = 100;
                            }
                            arg2.method1196(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4043 & 65535, var8.field4042 & 65535, var8.field4041 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field4039);
                            arg2.field2577 = 0;
                        } else {
                            arg2.method1198(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4043 & 65535, var8.field4042 & 65535, var8.field4041 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field2584 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field2593 || var26 > arg2.field2593 || var34 > arg2.field2593;
                        if (var8.field4039 >= 0) {
                            if (this.method1921(this.field4439.field1459.method2359(-122, var8.field4039).field5217)) {
                                arg2.field2577 = 100;
                            }
                            arg2.method1196(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4044 & 65535, var8.field4041 & 65535, var8.field4042 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field4039);
                            arg2.field2577 = 0;
                            return;
                        }
                        arg2.method1198(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4044 & 65535, var8.field4041 & 65535, var8.field4042 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field2584 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field2593 || var34 > arg2.field2593 || var26 > arg2.field2593;
                        if (var8.field4039 >= 0) {
                            if (this.method1921(this.field4439.field1459.method2359(-125, var8.field4039).field5217)) {
                                arg2.field2577 = 100;
                            }
                            arg2.method1196(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4043 & 65535, var8.field4042 & 65535, var8.field4041 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field4450, this.field4450, this.field4450, var8.field4039);
                            arg2.field2577 = 0;
                        } else {
                            arg2.method1198(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4043 & 65535, var8.field4042 & 65535, var8.field4041 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field2584 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field2593 || var26 > arg2.field2593 || var34 > arg2.field2593;
                        if (var8.field4039 >= 0) {
                            if (this.method1921(this.field4439.field1459.method2359(-127, var8.field4039).field5217)) {
                                arg2.field2577 = 100;
                            }
                            arg2.method1196(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4044 & 65535, var8.field4041 & 65535, var8.field4042 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field4450, this.field4450, this.field4450, var8.field4039);
                            arg2.field2577 = 0;
                            return;
                        }
                        arg2.method1198(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4044 & 65535, var8.field4041 & 65535, var8.field4042 & 65535);
                    }
                }
            }
        } else {
            class566 var47 = this.field4452[arg0][arg1];
            if (var47 != null) {
                if (this.field4450 == -1) {
                    for (int var48 = 0; var48 < var47.field8280; ++var48) {
                        int var49 = (arg0 << super.field9707) + var47.field8287[var48];
                        short var50 = var47.field8288[var48];
                        int var51 = (arg1 << super.field9707) + var47.field8283[var48];
                        float var52 = (float) var51 * this.field4454 + (float) var49 * this.field4443 + (float) var50 * this.field4449 + this.field4446;
                        if (var52 <= (float) this.field4439.field8476) {
                            return;
                        }
                        float var53 = (float) var51 * this.field4442 + (float) var49 * this.field4438 + (float) var50 * this.field4444 + this.field4435;
                        float var54 = (float) var51 * this.field4453 + (float) var49 * this.field4451 + (float) var50 * this.field4447 + this.field4440;
                        arg3[var48] = (int) ((float) this.field4439.field8486 * var53 / var52) + arg2.field2579;
                        arg4[var48] = (int) ((float) this.field4439.field8472 * var54 / var52) + arg2.field2587;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field8280; ++var55) {
                        int var107 = (arg0 << super.field9707) + var47.field8287[var55];
                        short var108 = var47.field8288[var55];
                        int var109 = (arg1 << super.field9707) + var47.field8283[var55];
                        float var110 = (float) var109 * this.field4454 + (float) var107 * this.field4443 + (float) var108 * this.field4449 + this.field4446;
                        float var111 = (float) var109 * this.field4442 + (float) var107 * this.field4438 + (float) var108 * this.field4444 + this.field4435;
                        float var112 = (float) var109 * this.field4453 + (float) var107 * this.field4451 + (float) var108 * this.field4447 + this.field4440;
                        arg3[var55] = (int) ((float) this.field4439.field8486 * var111 / (float) this.field4450) + arg2.field2579;
                        arg4[var55] = (int) ((float) this.field4439.field8472 * var112 / (float) this.field4450) + arg2.field2587;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field8289 != null) {
                    int var56 = super.field9713[arg0][arg1];
                    int var57 = super.field9713[arg0 + 1][arg1];
                    int var58 = super.field9713[arg0][arg1 + 1];
                    int var59 = super.field9709 * arg0;
                    int var60 = super.field9709 + var59;
                    int var61 = super.field9709 * arg1;
                    int var62 = super.field9709 + var61;
                    float var63 = (float) var61 * this.field4442 + (float) var56 * this.field4444 + (float) var59 * this.field4438 + this.field4435;
                    float var64 = (float) var61 * this.field4453 + (float) var56 * this.field4447 + (float) var59 * this.field4451 + this.field4440;
                    float var65 = (float) var61 * this.field4454 + (float) var56 * this.field4449 + (float) var59 * this.field4443 + this.field4446;
                    float var66 = (float) var61 * this.field4442 + (float) var57 * this.field4444 + (float) var60 * this.field4438 + this.field4435;
                    float var67 = (float) var61 * this.field4453 + (float) var57 * this.field4447 + (float) var60 * this.field4451 + this.field4440;
                    float var68 = (float) var61 * this.field4454 + (float) var57 * this.field4449 + (float) var60 * this.field4443 + this.field4446;
                    float var69 = (float) var62 * this.field4442 + (float) var58 * this.field4444 + (float) var59 * this.field4438 + this.field4435;
                    float var70 = (float) var62 * this.field4453 + (float) var58 * this.field4447 + (float) var59 * this.field4451 + this.field4440;
                    float var71 = (float) var62 * this.field4454 + (float) var58 * this.field4449 + (float) var59 * this.field4443 + this.field4446;
                    if (this.field4450 == -1) {
                        for (int var72 = 0; var72 < var47.field8285; ++var72) {
                            short var73 = var47.field8286[var72];
                            short var74 = var47.field8281[var72];
                            short var75 = var47.field8282[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field2584 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field2593 || var77 > arg2.field2593 || var78 > arg2.field2593;
                                short var82 = var47.field8289[var72];
                                if (var82 != -1) {
                                    if (this.method1921(this.field4439.field1459.method2359(-124, var82).field5217)) {
                                        arg2.field2577 = 100;
                                    }
                                    arg2.method1196(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field8284[var73], var47.field8284[var74], var47.field8284[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field2577 = 0;
                                } else {
                                    int var83 = var47.field8278[var72];
                                    if (var83 != -1) {
                                        arg2.method1198(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class446.method2602(var83, var47.field8284[var73], 2), class446.method2602(var83, var47.field8284[var74], 2), class446.method2602(var83, var47.field8284[var75], 2));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field8285; ++var84) {
                        short var85 = var47.field8286[var84];
                        short var86 = var47.field8281[var84];
                        short var87 = var47.field8282[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field2584 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field2593 || var89 > arg2.field2593 || var90 > arg2.field2593;
                            short var94 = var47.field8289[var84];
                            if (var94 != -1) {
                                if (this.method1921(this.field4439.field1459.method2359(-126, var94).field5217)) {
                                    arg2.field2577 = 100;
                                }
                                arg2.method1196(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field8284[var85], var47.field8284[var86], var47.field8284[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field4450, this.field4450, this.field4450, var94);
                                arg2.field2577 = 0;
                            } else {
                                int var95 = var47.field8278[var84];
                                if (var95 != -1) {
                                    arg2.method1198(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class446.method2602(var95, var47.field8284[var85], 2), class446.method2602(var95, var47.field8284[var86], 2), class446.method2602(var95, var47.field8284[var87], 2));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field8285; ++var96) {
                    short var97 = var47.field8286[var96];
                    short var98 = var47.field8281[var96];
                    short var99 = var47.field8282[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field8278[var96];
                        if (var106 != -1) {
                            arg2.field2584 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field2593 || var101 > arg2.field2593 || var102 > arg2.field2593;
                            arg2.method1198(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class446.method2602(var106, var47.field8284[var97], 2), class446.method2602(var106, var47.field8284[var98], 2), class446.method2602(var106, var47.field8284[var99], 2));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lam;[I)V", line = 501)
    public final void method1367(class289 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "(Lha;IIIIZ)V", line = 505)
    public final void method1363(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[[ZZ)V", line = 509)
    public final void method1377(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class428 var6 = this.field4439.field8479;
        this.field4450 = -1;
        this.field4438 = var6.field6119;
        this.field4444 = var6.field6101;
        this.field4442 = var6.field6107;
        this.field4435 = var6.field6124;
        this.field4451 = var6.field6126;
        this.field4447 = var6.field6125;
        this.field4453 = var6.field6105;
        this.field4440 = var6.field6097;
        this.field4443 = var6.field6127;
        this.field4449 = var6.field6117;
        this.field4454 = var6.field6100;
        this.field4446 = var6.field6123;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field9706 && var10 >= 0 && var10 < super.field9703) {
                        this.method1374(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "(IILha;)Lha;", line = 556)
    public final class427 method1369(int arg0, int arg1, class427 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII[[Z)V", line = 561)
    public final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class439 var9 = this.field4439.method3353(Thread.currentThread());
        class159 var10 = var9.field6335;
        var10.field2577 = 0;
        var10.field2584 = false;
        this.field4439.method138();
        if (this.field4455 != null) {
            this.method1918(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field6347, var9.field6327);
        } else {
            if (this.field4437 != null) {
                this.method1920(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field6347, var9.field6327);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 576)
    public final void method1376(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 580)
    public final boolean method1370(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 583)
    public final void method1364(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4437 == null) {
            this.field4437 = new class287[super.field9706][super.field9703];
            this.field4452 = new class566[super.field9706][super.field9703];
        } else if (this.field4455 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field9709 != var20 || var21 != 0 && super.field9709 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class566 var22 = new class566();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field8280 = var23;
            var22.field8284 = new short[var23];
            var22.field8287 = new short[var23];
            var22.field8288 = new short[var23];
            var22.field8283 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field8284[var25] = (short) (this.field4436[arg0][arg1] - this.field4448[arg0][arg1]);
                } else if (var30 == 0 && super.field9709 == var31) {
                    var22.field8284[var25] = (short) (this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1]);
                } else if (super.field9709 == var30 && super.field9709 == var31) {
                    var22.field8284[var25] = (short) (this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1]);
                } else if (super.field9709 == var30 && var31 == 0) {
                    var22.field8284[var25] = (short) (this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1]) * var30 + (this.field4436[arg0][arg1] - this.field4448[arg0][arg1]) * (super.field9709 - var30);
                    int var33 = (this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1]) * var30 + (this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1]) * (super.field9709 - var30);
                    var22.field8284[var25] = (short) ((super.field9709 - var31) * var32 + var31 * var33 >> super.field9707 * 2);
                }
                int var34 = (arg0 << super.field9707) + var30;
                int var35 = (arg1 << super.field9707) + var31;
                var22.field8287[var25] = (short) var30;
                var22.field8283[var25] = (short) var31;
                var22.field8288[var25] = (short) (this.method3861((byte) -41, var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field8284[var25] < 2) {
                    var22.field8284[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field4439.field1459.method2359(-125, arg11[var28]).field5232) {
                    var26 = true;
                }
            }
            var22.field8278 = new int[var27];
            if (arg10 != null) {
                var22.field8279 = new int[var27];
            }
            var22.field8286 = new short[var27];
            var22.field8281 = new short[var27];
            var22.field8282 = new short[var27];
            if (var26) {
                var22.field8289 = new short[var27];
                var22.field8290 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field8278[var22.field8285] = class420.method2483(arg9[var29], 0);
                    } else {
                        var22.field8278[var22.field8285] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field8279[var22.field8285] = class420.method2483(arg10[var29], 0);
                        } else {
                            var22.field8279[var22.field8285] = -1;
                        }
                    }
                    var22.field8286[var22.field8285] = (short) arg6[var29];
                    var22.field8281[var22.field8285] = (short) arg7[var29];
                    var22.field8282[var22.field8285] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4439.field1459.method2359(-122, arg11[var29]).field5232) {
                            var22.field8289[var22.field8285] = (short) arg11[var29];
                            var22.field8290[var22.field8285] = (short) arg12[var29];
                        } else {
                            var22.field8289[var22.field8285] = -1;
                        }
                    }
                    ++var22.field8285;
                }
            }
            this.field4452[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class287 var36 = new class287();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field4045 = class446.method2602(class420.method2483(arg10[0], 0), this.field4436[arg0][arg1] - this.field4448[arg0][arg1], 2);
                    if (var37 == -1) {
                        var36.field4040 = (byte) (var36.field4040 | 2);
                    }
                }
                if (super.field9713[arg0 + 1][arg1] == super.field9713[arg0][arg1] && super.field9713[arg0 + 1][arg1 + 1] == super.field9713[arg0][arg1] && super.field9713[arg0][arg1 + 1] == super.field9713[arg0][arg1]) {
                    var36.field4040 = (byte) (var36.field4040 | 1);
                }
                if (var38 != -1 && (var36.field4040 & 2) == 0 && !this.field4439.field1459.method2359(-125, var38).field5232) {
                    var36.field4044 = (short) (this.field4436[arg0][arg1] - this.field4448[arg0][arg1]);
                    var36.field4041 = (short) (this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1]);
                    var36.field4043 = (short) (this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1]);
                    var36.field4042 = (short) (this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1]);
                    var36.field4039 = (short) var38;
                } else {
                    short var39 = class420.method2483(var37, 0);
                    var36.field4044 = (short) class446.method2602(var39, this.field4436[arg0][arg1] - this.field4448[arg0][arg1], 2);
                    var36.field4041 = (short) class446.method2602(var39, this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1], 2);
                    var36.field4043 = (short) class446.method2602(var39, this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1], 2);
                    var36.field4042 = (short) class446.method2602(var39, this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1], 2);
                    var36.field4039 = -1;
                }
                this.field4437[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII[[ZLqm;Loga;[I[I)V", line = 814)
    private final void method1918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class439 arg8, class159 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field6312;
        this.field4439.method770(false);
        arg9.field2583 = false;
        arg9.field2578 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4455[var18][var19] != null) {
                        class285 var20 = this.field4455[var18][var19];
                        if (var20.field3992 != -1 && (var20.field3993 & 2) == 0 && var20.field3995 == 0) {
                            int var21 = this.field4439.method3344(var20.field3992);
                            arg9.method1198(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class446.method2602(var21, var20.field3986, 2), class446.method2602(var21, var20.field3985, 2), class446.method2602(var21, var20.field3990, 2));
                            arg9.method1198(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class446.method2602(var21, var20.field3991, 2), class446.method2602(var21, var20.field3990, 2), class446.method2602(var21, var20.field3985, 2));
                        } else if (var20.field3995 == 0) {
                            arg9.method1197(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field3986, var20.field3985, var20.field3990);
                            arg9.method1197(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field3991, var20.field3990, var20.field3985);
                        } else {
                            int var22 = var20.field3995;
                            arg9.method1197(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class184.method1321(-1192894664, var22, var20.field3986 & -16777216), class184.method1321(-1192894664, var22, var20.field3985 & -16777216), class184.method1321(-1192894664, var22, var20.field3990 & -16777216));
                            arg9.method1197(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class184.method1321(-1192894664, var22, var20.field3991 & -16777216), class184.method1321(-1192894664, var22, var20.field3990 & -16777216), class184.method1321(-1192894664, var22, var20.field3985 & -16777216));
                        }
                    } else if (this.field4445[var18][var19] != null) {
                        class474 var23 = this.field4445[var18][var19];
                        for (int var24 = 0; var24 < var23.field6800; ++var24) {
                            arg10[var24] = var23.field6801[var24] * var14 / super.field9709 + var16;
                            arg11[var24] = var17 - var23.field6805[var24] * var14 / super.field9709;
                        }
                        for (int var25 = 0; var25 < var23.field6803; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field6806 != null && var23.field6806[var25] != 0 && (var23.field6798 == null || var23.field6798 != null && var23.field6798[var25] == -1)) {
                                int var35 = var23.field6806[var25];
                                arg9.method1197(var32, var33, var34, var29, var30, var31, 100, 100, 100, class184.method1321(-1192894664, var35, -16777216 - (var23.field6799[var26] & -16777216)), class184.method1321(-1192894664, var35, -16777216 - (var23.field6799[var27] & -16777216)), class184.method1321(-1192894664, var35, -16777216 - (var23.field6799[var28] & -16777216)));
                            } else if (var23.field6798 != null && var23.field6798[var25] != -1) {
                                int var36 = this.field4439.method3344(var23.field6798[var25]);
                                arg9.method1198(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method1197(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field6799[var26], var23.field6799[var27], var23.field6799[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2583 = true;
        this.field4439.method770(var15);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIZLqm;Loga;[I[I[I[I)V", line = 952)
    private final void method1919(int arg0, int arg1, boolean arg2, class439 arg3, class159 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class285 var10 = this.field4455[arg0][arg1];
        if (var10 != null) {
            if ((var10.field3993 & 2) == 0) {
                int var11 = super.field9709 * arg0;
                int var12 = super.field9709 + var11;
                int var13 = super.field9709 * arg1;
                int var14 = super.field9709 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                float var21;
                float var22;
                float var23;
                float var24;
                float var31;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                float var37;
                int var38;
                float var39;
                int var40;
                float var41;
                int var42;
                float var43;
                int var44;
                float var45;
                int var46;
                if ((var10.field3993 & 1) != 0 && !arg2) {
                    int var19 = super.field9713[arg0][arg1];
                    float var20 = (float) var19 * this.field4449;
                    if (this.field4450 == -1) {
                        var21 = (float) var13 * this.field4454 + (float) var11 * this.field4443 + var20 + this.field4446;
                        if (var21 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var22 = (float) var13 * this.field4454 + (float) var12 * this.field4443 + var20 + this.field4446;
                        if (var22 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var23 = (float) var14 * this.field4454 + (float) var12 * this.field4443 + var20 + this.field4446;
                        if (var23 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var24 = (float) var14 * this.field4454 + (float) var11 * this.field4443 + var20 + this.field4446;
                        if (var24 <= (float) this.field4439.field8476) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field4454 + (float) var11 * this.field4443 + var20 + this.field4446;
                        var22 = (float) var13 * this.field4454 + (float) var12 * this.field4443 + var20 + this.field4446;
                        var23 = (float) var14 * this.field4454 + (float) var12 * this.field4443 + var20 + this.field4446;
                        var24 = (float) var14 * this.field4454 + (float) var11 * this.field4443 + var20 + this.field4446;
                    }
                    if (arg3.field6320) {
                        int var25 = (int) (var21 - (float) arg3.field6321);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field6321);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field6321);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field6321);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field4444;
                    float var30 = (float) var19 * this.field4447;
                    if (this.field4450 == -1) {
                        var31 = (float) var13 * this.field4442 + (float) var11 * this.field4438 + var29 + this.field4435;
                        var32 = (int) ((float) this.field4439.field8486 * var31 / var21) + arg4.field2579;
                        var33 = (float) var13 * this.field4453 + (float) var11 * this.field4451 + var30 + this.field4440;
                        var34 = (int) ((float) this.field4439.field8472 * var33 / var21) + arg4.field2587;
                        var35 = (float) var13 * this.field4442 + (float) var12 * this.field4438 + var29 + this.field4435;
                        var36 = (int) ((float) this.field4439.field8486 * var35 / var22) + arg4.field2579;
                        var37 = (float) var13 * this.field4453 + (float) var12 * this.field4451 + var30 + this.field4440;
                        var38 = (int) ((float) this.field4439.field8472 * var37 / var22) + arg4.field2587;
                        var39 = (float) var14 * this.field4442 + (float) var12 * this.field4438 + var29 + this.field4435;
                        var40 = (int) ((float) this.field4439.field8486 * var39 / var23) + arg4.field2579;
                        var41 = (float) var14 * this.field4453 + (float) var12 * this.field4451 + var30 + this.field4440;
                        var42 = (int) ((float) this.field4439.field8472 * var41 / var23) + arg4.field2587;
                        var43 = (float) var14 * this.field4442 + (float) var11 * this.field4438 + var29 + this.field4435;
                        var44 = (int) ((float) this.field4439.field8486 * var43 / var24) + arg4.field2579;
                        var45 = (float) var14 * this.field4453 + (float) var11 * this.field4451 + var30 + this.field4440;
                        var46 = (int) ((float) this.field4439.field8472 * var45 / var24) + arg4.field2587;
                    } else {
                        var31 = (float) var13 * this.field4442 + (float) var11 * this.field4438 + var29 + this.field4435;
                        var32 = (int) ((float) this.field4439.field8486 * var31 / (float) this.field4450) + arg4.field2579;
                        var33 = (float) var13 * this.field4453 + (float) var11 * this.field4451 + var30 + this.field4440;
                        var34 = (int) ((float) this.field4439.field8472 * var33 / (float) this.field4450) + arg4.field2587;
                        var35 = (float) var13 * this.field4442 + (float) var12 * this.field4438 + var29 + this.field4435;
                        var36 = (int) ((float) this.field4439.field8486 * var35 / (float) this.field4450) + arg4.field2579;
                        var37 = (float) var13 * this.field4453 + (float) var12 * this.field4451 + var30 + this.field4440;
                        var38 = (int) ((float) this.field4439.field8472 * var37 / (float) this.field4450) + arg4.field2587;
                        var39 = (float) var14 * this.field4442 + (float) var12 * this.field4438 + var29 + this.field4435;
                        var40 = (int) ((float) this.field4439.field8486 * var39 / (float) this.field4450) + arg4.field2579;
                        var41 = (float) var14 * this.field4453 + (float) var12 * this.field4451 + var30 + this.field4440;
                        var42 = (int) ((float) this.field4439.field8472 * var41 / (float) this.field4450) + arg4.field2587;
                        var43 = (float) var14 * this.field4442 + (float) var11 * this.field4438 + var29 + this.field4435;
                        var44 = (int) ((float) this.field4439.field8486 * var43 / (float) this.field4450) + arg4.field2579;
                        var45 = (float) var14 * this.field4453 + (float) var11 * this.field4451 + var30 + this.field4440;
                        var46 = (int) ((float) this.field4439.field8472 * var45 / (float) this.field4450) + arg4.field2587;
                    }
                } else {
                    int var47 = super.field9713[arg0][arg1];
                    int var48 = super.field9713[arg0 + 1][arg1];
                    int var49 = super.field9713[arg0 + 1][arg1 + 1];
                    int var50 = super.field9713[arg0][arg1 + 1];
                    if (this.field4450 == -1) {
                        var21 = (float) var13 * this.field4454 + (float) var11 * this.field4443 + (float) var47 * this.field4449 + this.field4446;
                        if (var21 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var22 = (float) var13 * this.field4454 + (float) var12 * this.field4443 + (float) var48 * this.field4449 + this.field4446;
                        if (var22 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var23 = (float) var14 * this.field4454 + (float) var12 * this.field4443 + (float) var49 * this.field4449 + this.field4446;
                        if (var23 <= (float) this.field4439.field8476) {
                            return;
                        }
                        var24 = (float) var14 * this.field4454 + (float) var11 * this.field4443 + (float) var50 * this.field4449 + this.field4446;
                        if (var24 <= (float) this.field4439.field8476) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field4454 + (float) var11 * this.field4443 + (float) var47 * this.field4449 + this.field4446;
                        var22 = (float) var13 * this.field4454 + (float) var12 * this.field4443 + (float) var48 * this.field4449 + this.field4446;
                        var23 = (float) var14 * this.field4454 + (float) var12 * this.field4443 + (float) var49 * this.field4449 + this.field4446;
                        var24 = (float) var14 * this.field4454 + (float) var11 * this.field4443 + (float) var50 * this.field4449 + this.field4446;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field6321);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field3987 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field6321);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field3994 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field6321);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field3989 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field6321);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field3988 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field6320) {
                        int var59 = (int) (var21 - (float) arg3.field6321);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field6321);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field6321);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field6321);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field4450 == -1) {
                        var31 = (float) var13 * this.field4442 + (float) var11 * this.field4438 + (float) var47 * this.field4444 + this.field4435;
                        var32 = (int) ((float) this.field4439.field8486 * var31 / var21) + arg4.field2579;
                        var33 = (float) var13 * this.field4453 + (float) var11 * this.field4451 + (float) var47 * this.field4447 + this.field4440;
                        var34 = (int) ((float) this.field4439.field8472 * var33 / var21) + arg4.field2587;
                        var35 = (float) var13 * this.field4442 + (float) var12 * this.field4438 + (float) var48 * this.field4444 + this.field4435;
                        var36 = (int) ((float) this.field4439.field8486 * var35 / var22) + arg4.field2579;
                        var37 = (float) var13 * this.field4453 + (float) var12 * this.field4451 + (float) var48 * this.field4447 + this.field4440;
                        var38 = (int) ((float) this.field4439.field8472 * var37 / var22) + arg4.field2587;
                        var39 = (float) var14 * this.field4442 + (float) var12 * this.field4438 + (float) var49 * this.field4444 + this.field4435;
                        var40 = (int) ((float) this.field4439.field8486 * var39 / var23) + arg4.field2579;
                        var41 = (float) var14 * this.field4453 + (float) var12 * this.field4451 + (float) var49 * this.field4447 + this.field4440;
                        var42 = (int) ((float) this.field4439.field8472 * var41 / var23) + arg4.field2587;
                        var43 = (float) var14 * this.field4442 + (float) var11 * this.field4438 + (float) var50 * this.field4444 + this.field4435;
                        var44 = (int) ((float) this.field4439.field8486 * var43 / var24) + arg4.field2579;
                        var45 = (float) var14 * this.field4453 + (float) var11 * this.field4451 + (float) var50 * this.field4447 + this.field4440;
                        var46 = (int) ((float) this.field4439.field8472 * var45 / var24) + arg4.field2587;
                    } else {
                        var31 = (float) var13 * this.field4442 + (float) var11 * this.field4438 + (float) var47 * this.field4444 + this.field4435;
                        var32 = (int) ((float) this.field4439.field8486 * var31 / (float) this.field4450) + arg4.field2579;
                        var33 = (float) var13 * this.field4453 + (float) var11 * this.field4451 + (float) var47 * this.field4447 + this.field4440;
                        var34 = (int) ((float) this.field4439.field8472 * var33 / (float) this.field4450) + arg4.field2587;
                        var35 = (float) var13 * this.field4442 + (float) var12 * this.field4438 + (float) var48 * this.field4444 + this.field4435;
                        var36 = (int) ((float) this.field4439.field8486 * var35 / (float) this.field4450) + arg4.field2579;
                        var37 = (float) var13 * this.field4453 + (float) var12 * this.field4451 + (float) var48 * this.field4447 + this.field4440;
                        var38 = (int) ((float) this.field4439.field8472 * var37 / (float) this.field4450) + arg4.field2587;
                        var39 = (float) var14 * this.field4442 + (float) var12 * this.field4438 + (float) var49 * this.field4444 + this.field4435;
                        var40 = (int) ((float) this.field4439.field8486 * var39 / (float) this.field4450) + arg4.field2579;
                        var41 = (float) var14 * this.field4453 + (float) var12 * this.field4451 + (float) var49 * this.field4447 + this.field4440;
                        var42 = (int) ((float) this.field4439.field8472 * var41 / (float) this.field4450) + arg4.field2587;
                        var43 = (float) var14 * this.field4442 + (float) var11 * this.field4438 + (float) var50 * this.field4444 + this.field4435;
                        var44 = (int) ((float) this.field4439.field8486 * var43 / (float) this.field4450) + arg4.field2579;
                        var45 = (float) var14 * this.field4453 + (float) var11 * this.field4451 + (float) var50 * this.field4447 + this.field4440;
                        var46 = (int) ((float) this.field4439.field8472 * var45 / (float) this.field4450) + arg4.field2587;
                    }
                }
                boolean var63 = var10.field3992 != -1 && this.method1921(this.field4439.field1459.method2359(-125, var10.field3992).field5217);
                if (this.field4450 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field2584 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field2593 || var44 > arg4.field2593 || var36 > arg4.field2593;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field2577 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field3992 >= 0) {
                                    arg4.method1188(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field6323, var17, var18, var16, var10.field3986, var10.field3985, var10.field3990, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field3992);
                                } else {
                                    arg4.method1197(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class184.method1321(-1192894664, var10.field3986, var17 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3985, var18 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3990, var16 << 24 | arg3.field6323));
                                }
                            } else if (var10.field3992 >= 0) {
                                arg4.method1196(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3986, var10.field3985, var10.field3990, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field3992);
                            } else {
                                arg4.method1197(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3986, var10.field3985, var10.field3990);
                            }
                            arg4.field2577 = 0;
                        } else {
                            arg4.method1203(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field6323);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field2584 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field2593 || var36 > arg4.field2593 || var44 > arg4.field2593;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field2577 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field3992 >= 0) {
                                    arg4.method1188(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field6323, var15, var16, var18, var10.field3991, var10.field3990, var10.field3985, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field3992);
                                } else {
                                    arg4.method1197(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class184.method1321(-1192894664, var10.field3991, var15 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3990, var16 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3985, var18 << 24 | arg3.field6323));
                                }
                            } else if (var10.field3992 >= 0) {
                                arg4.method1196(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3991, var10.field3990, var10.field3985, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field3992);
                            } else {
                                arg4.method1197(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3991, var10.field3990, var10.field3985);
                            }
                            arg4.field2577 = 0;
                            return;
                        }
                        arg4.method1203(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field6323);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field2584 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field2593 || var44 > arg4.field2593 || var36 > arg4.field2593;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field2577 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field3992 >= 0) {
                                    arg4.method1188(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field6323, var17, var18, var16, var10.field3986, var10.field3985, var10.field3990, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field4450, this.field4450, this.field4450, var10.field3992);
                                } else {
                                    arg4.method1197(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class184.method1321(-1192894664, var10.field3986, var17 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3985, var18 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3990, var16 << 24 | arg3.field6323));
                                }
                            } else if (var10.field3992 >= 0) {
                                arg4.method1196(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3986, var10.field3985, var10.field3990, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field4450, this.field4450, this.field4450, var10.field3992);
                            } else {
                                arg4.method1197(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3986, var10.field3985, var10.field3990);
                            }
                            arg4.field2577 = 0;
                        } else {
                            arg4.method1203(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field6323);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field2584 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field2593 || var36 > arg4.field2593 || var44 > arg4.field2593;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field2577 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field3992 >= 0) {
                                    arg4.method1188(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field6323, var15, var16, var18, var10.field3991, var10.field3990, var10.field3985, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field4450, this.field4450, this.field4450, var10.field3992);
                                } else {
                                    arg4.method1197(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class184.method1321(-1192894664, var10.field3991, var15 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3990, var16 << 24 | arg3.field6323), class184.method1321(-1192894664, var10.field3985, var18 << 24 | arg3.field6323));
                                }
                            } else if (var10.field3992 >= 0) {
                                arg4.method1196(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3991, var10.field3990, var10.field3985, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field4450, this.field4450, this.field4450, var10.field3992);
                            } else {
                                arg4.method1197(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3991, var10.field3990, var10.field3985);
                            }
                            arg4.field2577 = 0;
                            return;
                        }
                        arg4.method1203(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field6323);
                    }
                }
            }
        } else {
            class474 var68 = this.field4445[arg0][arg1];
            if (var68 != null) {
                if (this.field4450 == -1) {
                    for (int var69 = 0; var69 < var68.field6800; ++var69) {
                        int var70 = (arg0 << super.field9707) + var68.field6801[var69];
                        int var71 = var68.field6804[var69];
                        int var72 = (arg1 << super.field9707) + var68.field6805[var69];
                        float var73 = (float) var72 * this.field4454 + (float) var70 * this.field4443 + (float) var71 * this.field4449 + this.field4446;
                        if (var73 <= (float) this.field4439.field8476) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field6321);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field6802[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field6320) {
                            int var76 = (int) (var73 - (float) arg3.field6321);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field4442 + (float) var70 * this.field4438 + (float) var71 * this.field4444 + this.field4435;
                        float var78 = (float) var72 * this.field4453 + (float) var70 * this.field4451 + (float) var71 * this.field4447 + this.field4440;
                        arg5[var69] = (int) ((float) this.field4439.field8486 * var77 / var73) + arg4.field2579;
                        arg6[var69] = (int) ((float) this.field4439.field8472 * var78 / var73) + arg4.field2587;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field6800; ++var79) {
                        int var131 = (arg0 << super.field9707) + var68.field6801[var79];
                        int var132 = var68.field6804[var79];
                        int var133 = (arg1 << super.field9707) + var68.field6805[var79];
                        float var134 = (float) var133 * this.field4454 + (float) var131 * this.field4443 + (float) var132 * this.field4449 + this.field4446;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field4450 - arg3.field6321;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field6802[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field6320) {
                            int var137 = this.field4450 - arg3.field6321;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field4442 + (float) var131 * this.field4438 + (float) var132 * this.field4444 + this.field4435;
                        float var139 = (float) var133 * this.field4453 + (float) var131 * this.field4451 + (float) var132 * this.field4447 + this.field4440;
                        arg5[var79] = (int) ((float) this.field4439.field8486 * var138 / (float) this.field4450) + arg4.field2579;
                        arg6[var79] = (int) ((float) this.field4439.field8472 * var139 / (float) this.field4450) + arg4.field2587;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field6798 != null) {
                    int var80 = super.field9713[arg0][arg1];
                    int var81 = super.field9713[arg0 + 1][arg1];
                    int var82 = super.field9713[arg0][arg1 + 1];
                    int var83 = super.field9709 * arg0;
                    int var84 = super.field9709 + var83;
                    int var85 = super.field9709 * arg1;
                    int var86 = super.field9709 + var85;
                    float var87 = (float) var85 * this.field4442 + (float) var80 * this.field4444 + (float) var83 * this.field4438 + this.field4435;
                    float var88 = (float) var85 * this.field4453 + (float) var80 * this.field4447 + (float) var83 * this.field4451 + this.field4440;
                    float var89 = (float) var85 * this.field4454 + (float) var80 * this.field4449 + (float) var83 * this.field4443 + this.field4446;
                    float var90 = (float) var85 * this.field4442 + (float) var81 * this.field4444 + (float) var84 * this.field4438 + this.field4435;
                    float var91 = (float) var85 * this.field4453 + (float) var81 * this.field4447 + (float) var84 * this.field4451 + this.field4440;
                    float var92 = (float) var85 * this.field4454 + (float) var81 * this.field4449 + (float) var84 * this.field4443 + this.field4446;
                    float var93 = (float) var86 * this.field4442 + (float) var82 * this.field4444 + (float) var83 * this.field4438 + this.field4435;
                    float var94 = (float) var86 * this.field4453 + (float) var82 * this.field4447 + (float) var83 * this.field4451 + this.field4440;
                    float var95 = (float) var86 * this.field4454 + (float) var82 * this.field4449 + (float) var83 * this.field4443 + this.field4446;
                    if (this.field4450 == -1) {
                        for (int var96 = 0; var96 < var68.field6803; ++var96) {
                            int var97 = var96 * 3;
                            int var98 = var97 + 1;
                            int var99 = var98 + 1;
                            int var100 = arg5[var97];
                            int var101 = arg5[var98];
                            int var102 = arg5[var99];
                            int var103 = arg6[var97];
                            int var104 = arg6[var98];
                            int var105 = arg6[var99];
                            int var106 = arg8[var97] + arg8[var98] + arg8[var99];
                            if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                                arg4.field2584 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field2593 || var101 > arg4.field2593 || var102 > arg4.field2593;
                                short var107 = var68.field6798[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method1921(this.field4439.field1459.method2359(-124, var107).field5217)) {
                                        arg4.field2577 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method1188(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field6323, arg8[var97], arg8[var98], arg8[var99], var68.field6799[var97], var68.field6799[var98], var68.field6799[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field6799[var97] & 16777215) != 0) {
                                            arg4.method1197(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class184.method1321(-1192894664, var68.field6799[var97], arg8[var97] << 24 | arg3.field6323), class184.method1321(-1192894664, var68.field6799[var98], arg8[var98] << 24 | arg3.field6323), class184.method1321(-1192894664, var68.field6799[var99], arg8[var99] << 24 | arg3.field6323));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method1196(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field6799[var97], var68.field6799[var98], var68.field6799[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field6799[var97] & 16777215) != 0) {
                                        arg4.method1197(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field6799[var97], var68.field6799[var98], var68.field6799[var99]);
                                    }
                                    arg4.field2577 = 0;
                                } else {
                                    arg4.method1203(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field6323);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field6803; ++var108) {
                        int var109 = var108 * 3;
                        int var110 = var109 + 1;
                        int var111 = var110 + 1;
                        int var112 = arg5[var109];
                        int var113 = arg5[var110];
                        int var114 = arg5[var111];
                        int var115 = arg6[var109];
                        int var116 = arg6[var110];
                        int var117 = arg6[var111];
                        int var118 = arg8[var109] + arg8[var110] + arg8[var111];
                        if ((var112 - var113) * (var117 - var116) - (var114 - var113) * (var115 - var116) > 0) {
                            arg4.field2584 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field2593 || var113 > arg4.field2593 || var114 > arg4.field2593;
                            short var119 = var68.field6798[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method1921(this.field4439.field1459.method2359(-128, var119).field5217)) {
                                    arg4.field2577 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method1188(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field6323, arg8[var109], arg8[var110], arg8[var111], var68.field6799[var109], var68.field6799[var110], var68.field6799[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field4450, this.field4450, this.field4450, var119);
                                    } else if ((var68.field6799[var109] & 16777215) != 0) {
                                        arg4.method1197(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class184.method1321(-1192894664, var68.field6799[var109], arg8[var109] << 24 | arg3.field6323), class184.method1321(-1192894664, var68.field6799[var110], arg8[var110] << 24 | arg3.field6323), class184.method1321(-1192894664, var68.field6799[var111], arg8[var111] << 24 | arg3.field6323));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method1196(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field6799[var109], var68.field6799[var110], var68.field6799[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field4450, this.field4450, this.field4450, var119);
                                } else if ((var68.field6799[var109] & 16777215) != 0) {
                                    arg4.method1197(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field6799[var109], var68.field6799[var110], var68.field6799[var111]);
                                }
                                arg4.field2577 = 0;
                            } else {
                                arg4.method1203(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field6323);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field6803; ++var120) {
                    int var121 = var120 * 3;
                    int var122 = var121 + 1;
                    int var123 = var122 + 1;
                    int var124 = arg5[var121];
                    int var125 = arg5[var122];
                    int var126 = arg5[var123];
                    int var127 = arg6[var121];
                    int var128 = arg6[var122];
                    int var129 = arg6[var123];
                    int var130 = arg8[var121] + arg8[var122] + arg8[var123];
                    if ((var124 - var125) * (var129 - var128) - (var126 - var125) * (var127 - var128) > 0) {
                        arg4.field2584 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field2593 || var125 > arg4.field2593 || var126 > arg4.field2593;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field6799[var121] & 16777215) != 0) {
                                    arg4.method1197(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class445.method2592(arg3.field6323, var68.field6799[var121], (byte) -111, arg8[var121]), class445.method2592(arg3.field6323, var68.field6799[var122], (byte) 95, arg8[var122]), class445.method2592(arg3.field6323, var68.field6799[var123], (byte) 82, arg8[var123]));
                                }
                            } else if ((var68.field6799[var121] & 16777215) != 0) {
                                arg4.method1197(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field6799[var121], var68.field6799[var122], var68.field6799[var123]);
                            }
                        } else {
                            arg4.method1203(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field6323);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[[ZZI)V", line = 1794)
    public final void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class428 var7 = this.field4439.field8479;
        this.field4450 = arg5;
        this.field4438 = var7.field6119;
        this.field4444 = var7.field6101;
        this.field4442 = var7.field6107;
        this.field4435 = var7.field6124;
        this.field4451 = var7.field6126;
        this.field4447 = var7.field6125;
        this.field4453 = var7.field6105;
        this.field4440 = var7.field6097;
        this.field4443 = var7.field6127;
        this.field4449 = var7.field6117;
        this.field4454 = var7.field6100;
        this.field4446 = var7.field6123;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field9706 && var11 >= 0 && var11 < super.field9703) {
                        this.method1374(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "BA", descriptor = "()V", line = 1843)
    public final void method1371() {
        this.field4436 = null;
        this.field4448 = null;
    }

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1848)
    public final void method1365(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field4455 == null) {
            this.field4455 = new class285[super.field9706][super.field9703];
            this.field4445 = new class474[super.field9706][super.field9703];
        } else if (this.field4437 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class324.field4520[class420.method2483(arg6[var15], 0) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class324.field4520[class420.method2483(arg7[var16], 0) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field9709 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field9709 && arg4[var22] == super.field9709) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field9709) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field9709 != arg2[var24] && arg2[0] - super.field9709 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field9709 != arg4[var24] && arg4[0] - super.field9709 != arg4[var24]) {
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
                class285 var25 = new class285();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field3995 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field3993 = (byte) (var25.field3993 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field9713[arg0 + 1][arg1] == super.field9713[arg0][arg1] && super.field9713[arg0 + 1][arg1 + 1] == super.field9713[arg0][arg1] && super.field9713[arg0][arg1 + 1] == super.field9713[arg0][arg1]) {
                    var25.field3993 = (byte) (var25.field3993 | 1);
                }
                if (var27 != -1 && (var25.field3993 & 2) == 0 && !this.field4439.field1459.method2359(-127, var27).field5232) {
                    var25.field3991 = this.field4436[arg0][arg1] - this.field4448[arg0][arg1];
                    var25.field3990 = this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1];
                    var25.field3986 = this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1];
                    var25.field3985 = this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1];
                    var25.field3992 = (short) var27;
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
                    var25.field3991 = class445.method2592(arg10, method1922(arg6[var18] >> 8, this.field4436[arg0][arg1] - this.field4448[arg0][arg1]), (byte) -95, var28);
                    if (var25.field3995 != 0) {
                        var25.field3991 |= 255 - (this.field4436[arg0][arg1] - this.field4448[arg0][arg1]) << 25;
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
                    var25.field3990 = class445.method2592(arg10, method1922(arg6[var19] >> 8, this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1]), (byte) 116, var29);
                    if (var25.field3995 != 0) {
                        var25.field3990 |= 255 - (this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1]) << 25;
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
                    var25.field3986 = class445.method2592(arg10, method1922(arg6[var20] >> 8, this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1]), (byte) 65, var30);
                    if (var25.field3995 != 0) {
                        var25.field3986 |= 255 - (this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field3985 = class445.method2592(arg10, method1922(arg6[var21] >> 8, this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1]), (byte) -106, var31);
                    if (var25.field3995 != 0) {
                        var25.field3985 |= 255 - (this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1]) << 25;
                    }
                    var25.field3992 = -1;
                }
                if (arg5 != null) {
                    var25.field3989 = (short) arg5[var20];
                    var25.field3988 = (short) arg5[var21];
                    var25.field3994 = (short) arg5[var19];
                    var25.field3987 = (short) arg5[var18];
                }
                this.field4455[arg0][arg1] = var25;
            } else {
                class474 var32 = new class474();
                var32.field6800 = (short) arg2.length;
                var32.field6803 = (short) (arg2.length / 3);
                var32.field6801 = new short[var32.field6800];
                var32.field6804 = new short[var32.field6800];
                var32.field6805 = new short[var32.field6800];
                var32.field6799 = new int[var32.field6800];
                if (arg5 != null) {
                    var32.field6802 = new short[var32.field6800];
                }
                for (int var33 = 0; var33 < var32.field6800; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field4436[arg0][arg1] - this.field4448[arg0][arg1];
                    } else if (var48 == 0 && super.field9709 == var49) {
                        var51 = this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1];
                    } else if (super.field9709 == var48 && super.field9709 == var49) {
                        var51 = this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1];
                    } else if (super.field9709 == var48 && var49 == 0) {
                        var51 = this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field4436[arg0 + 1][arg1] - this.field4448[arg0 + 1][arg1]) * var48 + (this.field4436[arg0][arg1] - this.field4448[arg0][arg1]) * (super.field9709 - var48);
                        int var53 = (this.field4436[arg0 + 1][arg1 + 1] - this.field4448[arg0 + 1][arg1 + 1]) * var48 + (this.field4436[arg0][arg1 + 1] - this.field4448[arg0][arg1 + 1]) * (super.field9709 - var48);
                        var51 = (super.field9709 - var49) * var52 + var49 * var53 >> super.field9707 * 2;
                    }
                    int var54 = (arg0 << super.field9707) + var48;
                    int var55 = (arg1 << super.field9707) + var49;
                    var32.field6801[var33] = (short) var48;
                    var32.field6805[var33] = (short) var49;
                    var32.field6804[var33] = (short) (this.method3861((byte) 121, var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field4439.field1459.method2359(-127, arg8[var33]).field5232) {
                        var32.field6799[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field6799[var33] = var51 << 25;
                        } else {
                            var32.field6799[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field6802[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field6799[var33] = class445.method2592(arg10, method1922(arg6[var33] >> 8, var51), (byte) 90, var56);
                        if (arg7 != null) {
                            var32.field6799[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field6803; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field4439.field1459.method2359(-127, arg8[var35 * 3]).field5232) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field6806 = new int[var32.field6803];
                }
                if (var34) {
                    var32.field6798 = new short[var32.field6803];
                    var32.field6807 = new short[var32.field6803];
                }
                for (int var36 = 0; var36 < var32.field6803; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field6806[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field4439.field1459.method2359(-124, var42).field5232) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field4439.field1459.method2359(-125, var43).field5232) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field4439.field1459.method2359(-127, var44).field5232) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field6798[var36] = (short) var44;
                            var32.field6807[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field4439.field1459.method2359(-124, var45).field5232) {
                                    var32.field6799[var37] = class324.field4520[class420.method2483(this.field4439.field1459.method2359(-126, var45).field5223 & 65535, 0) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field4439.field1459.method2359(-124, var46).field5232) {
                                    var32.field6799[var38] = class324.field4520[class420.method2483(this.field4439.field1459.method2359(-124, var46).field5223 & 65535, 0) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field4439.field1459.method2359(-125, var47).field5232) {
                                    var32.field6799[var39] = class324.field4520[class420.method2483(this.field4439.field1459.method2359(-128, var47).field5223 & 65535, 0) & 65535];
                                }
                            }
                            var32.field6798[var36] = -1;
                        }
                    }
                }
                this.field4445[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIII[[ZLqm;Loga;[I[I)V", line = 2346)
    private final void method1920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class439 arg8, class159 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field6312;
        this.field4439.method770(false);
        arg9.field2583 = false;
        arg9.field2578 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4437[var18][var19] != null) {
                        class287 var20 = this.field4437[var18][var19];
                        if (var20.field4039 != -1 && (var20.field4040 & 2) == 0 && var20.field4045 == -1) {
                            int var21 = this.field4439.method3344(var20.field4039);
                            arg9.method1198(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class446.method2602(var21, var20.field4043 & 65535, 2), class446.method2602(var21, var20.field4042 & 65535, 2), class446.method2602(var21, var20.field4041 & 65535, 2));
                            arg9.method1198(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class446.method2602(var21, var20.field4044 & 65535, 2), class446.method2602(var21, var20.field4041 & 65535, 2), class446.method2602(var21, var20.field4042 & 65535, 2));
                        } else if (var20.field4045 == -1) {
                            arg9.method1198(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field4043 & 65535, var20.field4042 & 65535, var20.field4041 & 65535);
                            arg9.method1198(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field4044 & 65535, var20.field4041 & 65535, var20.field4042 & 65535);
                        } else {
                            int var22 = var20.field4045;
                            arg9.method1198(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method1198(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field4452[var18][var19] != null) {
                        class566 var23 = this.field4452[var18][var19];
                        for (int var24 = 0; var24 < var23.field8280; ++var24) {
                            arg10[var24] = var23.field8287[var24] * var14 / super.field9709 + var16;
                            arg11[var24] = var17 - var23.field8283[var24] * var14 / super.field9709;
                        }
                        for (int var25 = 0; var25 < var23.field8285; ++var25) {
                            short var26 = var23.field8286[var25];
                            short var27 = var23.field8281[var25];
                            short var28 = var23.field8282[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field8279 != null && var23.field8279[var25] != -1) {
                                int var35 = var23.field8279[var25];
                                arg9.method1198(var32, var33, var34, var29, var30, var31, 100, 100, 100, class446.method2602(var35, var23.field8284[var26], 2), class446.method2602(var35, var23.field8284[var27], 2), class446.method2602(var35, var23.field8284[var28], 2));
                            } else if (var23.field8289 != null && var23.field8289[var25] != -1) {
                                int var36 = this.field4439.method3344(var23.field8289[var25]);
                                arg9.method1198(var32, var33, var34, var29, var30, var31, 100, 100, 100, class446.method2602(var36, var23.field8284[var26], 2), class446.method2602(var36, var23.field8284[var27], 2), class446.method2602(var36, var23.field8284[var28], 2));
                            } else {
                                int var37 = var23.field8278[var25];
                                arg9.method1198(var32, var33, var34, var29, var30, var31, 100, 100, 100, class446.method2602(var37, var23.field8284[var26], 2), class446.method2602(var37, var23.field8284[var27], 2), class446.method2602(var37, var23.field8284[var28], 2));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2583 = true;
        this.field4439.method770(var15);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Z", line = 2483)
    private final boolean method1921(int arg0) {
        if ((this.field4441 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lve;IIII[[I[[II)V", line = 2501)
    public class321(class578 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4439 = arg0;
        this.field4441 = arg2;
        this.field4436 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4439.field8470 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4439.field8494 * var18 + this.field4439.field8487 * var16 + this.field4439.field8471 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4436[var11][var10] = (byte) var20;
            }
        }
        this.field4448 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 2550)
    public final void method1368(int arg0, int arg1, int arg2) {
        if (this.field4448[arg0][arg1] < arg2) {
            this.field4448[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V", line = 2556)
    public final void method1374(int arg0, int arg1) {
        class439 var3 = this.field4439.method3353(Thread.currentThread());
        var3.field6335.field2577 = 0;
        if (this.field4455 != null) {
            this.method1919(arg0, arg1, var3.field6317, var3, var3.field6335, var3.field6347, var3.field6327, var3.field6341, var3.field6331);
        } else {
            if (this.field4437 != null) {
                this.method1917(arg0, arg1, var3.field6335, var3.field6347, var3.field6327, var3.field6341, var3.field6331);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)I", line = 2572)
    private static final int method1922(int arg0, int arg1) {
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
}
