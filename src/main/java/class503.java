import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class503 extends class294 {

    @OriginalMember(owner = "client!lia", name = "F", descriptor = "I")
    private int field7272 = -1;

    @OriginalMember(owner = "client!lia", name = "p", descriptor = "Lcba;")
    private class576 field7293;

    @OriginalMember(owner = "client!lia", name = "n", descriptor = "I")
    private int field7286;

    @OriginalMember(owner = "client!lia", name = "s", descriptor = "[[B")
    private byte[][] field7288;

    @OriginalMember(owner = "client!lia", name = "r", descriptor = "[[B")
    private byte[][] field7280;

    @OriginalMember(owner = "client!lia", name = "x", descriptor = "F")
    private float field7273;

    @OriginalMember(owner = "client!lia", name = "o", descriptor = "F")
    private float field7275;

    @OriginalMember(owner = "client!lia", name = "B", descriptor = "F")
    private float field7276;

    @OriginalMember(owner = "client!lia", name = "C", descriptor = "F")
    private float field7279;

    @OriginalMember(owner = "client!lia", name = "q", descriptor = "F")
    private float field7281;

    @OriginalMember(owner = "client!lia", name = "u", descriptor = "F")
    private float field7282;

    @OriginalMember(owner = "client!lia", name = "E", descriptor = "F")
    private float field7284;

    @OriginalMember(owner = "client!lia", name = "G", descriptor = "F")
    private float field7285;

    @OriginalMember(owner = "client!lia", name = "w", descriptor = "F")
    private float field7287;

    @OriginalMember(owner = "client!lia", name = "m", descriptor = "F")
    private float field7290;

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "F")
    private float field7291;

    @OriginalMember(owner = "client!lia", name = "y", descriptor = "F")
    private float field7292;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "[[Lhk;")
    private class111[][] field7283;

    @OriginalMember(owner = "client!lia", name = "t", descriptor = "[[Lwf;")
    private class147[][] field7277;

    @OriginalMember(owner = "client!lia", name = "A", descriptor = "[[Lcd;")
    private class332[][] field7278;

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "[[Lifa;")
    private class449[][] field7274;

    @OriginalMember(owner = "client!lia", name = "v", descriptor = "[[Liq;")
    private class632[][] field7289;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILem;[I[I[I[II)V", line = 9)
    private final void method3787(int arg0, int arg1, class237 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class332 var9 = this.field7278[arg0][arg1];
        if (var9 != null) {
            if ((var9.field5203 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field5203 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field4340 * arg0;
                int var11 = super.field4340 + var10;
                int var12 = super.field4340 * arg1;
                int var13 = super.field4340 + var12;
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
                if ((var9.field5203 & 1) != 0) {
                    int var14 = super.field4338[arg0][arg1];
                    float var15 = (float) var14 * this.field7284;
                    if (this.field7272 == -1) {
                        var16 = (float) var12 * this.field7279 + (float) var10 * this.field7281 + var15 + this.field7275;
                        if (var16 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var17 = (float) var12 * this.field7279 + (float) var11 * this.field7281 + var15 + this.field7275;
                        if (var17 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var18 = (float) var13 * this.field7279 + (float) var11 * this.field7281 + var15 + this.field7275;
                        if (var18 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var19 = (float) var13 * this.field7279 + (float) var10 * this.field7281 + var15 + this.field7275;
                        if (var19 <= (float) this.field7293.field8515) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field7279 + (float) var10 * this.field7281 + var15 + this.field7275;
                        var17 = (float) var12 * this.field7279 + (float) var11 * this.field7281 + var15 + this.field7275;
                        var18 = (float) var13 * this.field7279 + (float) var11 * this.field7281 + var15 + this.field7275;
                        var19 = (float) var13 * this.field7279 + (float) var10 * this.field7281 + var15 + this.field7275;
                    }
                    float var20 = (float) var14 * this.field7276;
                    float var21 = (float) var14 * this.field7273;
                    if (this.field7272 == -1) {
                        float var22 = (float) var12 * this.field7292 + (float) var10 * this.field7282 + var20 + this.field7285;
                        var23 = (int) ((float) this.field7293.field8542 * var22 / var16) + arg2.field3573;
                        float var24 = (float) var12 * this.field7291 + (float) var10 * this.field7287 + var21 + this.field7290;
                        var25 = (int) ((float) this.field7293.field8518 * var24 / var16) + arg2.field3570;
                        float var26 = (float) var12 * this.field7292 + (float) var11 * this.field7282 + var20 + this.field7285;
                        var27 = (int) ((float) this.field7293.field8542 * var26 / var17) + arg2.field3573;
                        float var28 = (float) var12 * this.field7291 + (float) var11 * this.field7287 + var21 + this.field7290;
                        var29 = (int) ((float) this.field7293.field8518 * var28 / var17) + arg2.field3570;
                        float var30 = (float) var13 * this.field7292 + (float) var11 * this.field7282 + var20 + this.field7285;
                        var31 = (int) ((float) this.field7293.field8542 * var30 / var18) + arg2.field3573;
                        float var32 = (float) var13 * this.field7291 + (float) var11 * this.field7287 + var21 + this.field7290;
                        var33 = (int) ((float) this.field7293.field8518 * var32 / var18) + arg2.field3570;
                        float var34 = (float) var13 * this.field7292 + (float) var10 * this.field7282 + var20 + this.field7285;
                        var35 = (int) ((float) this.field7293.field8542 * var34 / var19) + arg2.field3573;
                        float var36 = (float) var13 * this.field7291 + (float) var10 * this.field7287 + var21 + this.field7290;
                        var37 = (int) ((float) this.field7293.field8518 * var36 / var19) + arg2.field3570;
                    } else {
                        float var38 = (float) var12 * this.field7292 + (float) var10 * this.field7282 + var20 + this.field7285;
                        var23 = (int) ((float) this.field7293.field8542 * var38 / (float) this.field7272) + arg2.field3573;
                        float var39 = (float) var12 * this.field7291 + (float) var10 * this.field7287 + var21 + this.field7290;
                        var25 = (int) ((float) this.field7293.field8518 * var39 / (float) this.field7272) + arg2.field3570;
                        float var40 = (float) var12 * this.field7292 + (float) var11 * this.field7282 + var20 + this.field7285;
                        var27 = (int) ((float) this.field7293.field8542 * var40 / (float) this.field7272) + arg2.field3573;
                        float var41 = (float) var12 * this.field7291 + (float) var11 * this.field7287 + var21 + this.field7290;
                        var29 = (int) ((float) this.field7293.field8518 * var41 / (float) this.field7272) + arg2.field3570;
                        float var42 = (float) var13 * this.field7292 + (float) var11 * this.field7282 + var20 + this.field7285;
                        var31 = (int) ((float) this.field7293.field8542 * var42 / (float) this.field7272) + arg2.field3573;
                        float var43 = (float) var13 * this.field7291 + (float) var11 * this.field7287 + var21 + this.field7290;
                        var33 = (int) ((float) this.field7293.field8518 * var43 / (float) this.field7272) + arg2.field3570;
                        float var44 = (float) var13 * this.field7292 + (float) var10 * this.field7282 + var20 + this.field7285;
                        var35 = (int) ((float) this.field7293.field8542 * var44 / (float) this.field7272) + arg2.field3573;
                        float var45 = (float) var13 * this.field7291 + (float) var10 * this.field7287 + var21 + this.field7290;
                        var37 = (int) ((float) this.field7293.field8518 * var45 / (float) this.field7272) + arg2.field3570;
                    }
                } else {
                    int var46 = super.field4338[arg0][arg1];
                    int var47 = super.field4338[arg0 + 1][arg1];
                    int var48 = super.field4338[arg0 + 1][arg1 + 1];
                    int var49 = super.field4338[arg0][arg1 + 1];
                    if (this.field7272 == -1) {
                        var16 = (float) var12 * this.field7279 + (float) var10 * this.field7281 + (float) var46 * this.field7284 + this.field7275;
                        if (var16 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var17 = (float) var12 * this.field7279 + (float) var11 * this.field7281 + (float) var47 * this.field7284 + this.field7275;
                        if (var17 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var18 = (float) var13 * this.field7279 + (float) var11 * this.field7281 + (float) var48 * this.field7284 + this.field7275;
                        if (var18 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var19 = (float) var13 * this.field7279 + (float) var10 * this.field7281 + (float) var49 * this.field7284 + this.field7275;
                        if (var19 <= (float) this.field7293.field8515) {
                            return;
                        }
                        float var50 = (float) var12 * this.field7292 + (float) var10 * this.field7282 + (float) var46 * this.field7276 + this.field7285;
                        var23 = (int) ((float) this.field7293.field8542 * var50 / var16) + arg2.field3573;
                        float var51 = (float) var12 * this.field7291 + (float) var10 * this.field7287 + (float) var46 * this.field7273 + this.field7290;
                        var25 = (int) ((float) this.field7293.field8518 * var51 / var16) + arg2.field3570;
                        float var52 = (float) var12 * this.field7292 + (float) var11 * this.field7282 + (float) var47 * this.field7276 + this.field7285;
                        var27 = (int) ((float) this.field7293.field8542 * var52 / var17) + arg2.field3573;
                        float var53 = (float) var12 * this.field7291 + (float) var11 * this.field7287 + (float) var47 * this.field7273 + this.field7290;
                        var29 = (int) ((float) this.field7293.field8518 * var53 / var17) + arg2.field3570;
                        float var54 = (float) var13 * this.field7292 + (float) var11 * this.field7282 + (float) var48 * this.field7276 + this.field7285;
                        var31 = (int) ((float) this.field7293.field8542 * var54 / var18) + arg2.field3573;
                        float var55 = (float) var13 * this.field7291 + (float) var11 * this.field7287 + (float) var48 * this.field7273 + this.field7290;
                        var33 = (int) ((float) this.field7293.field8518 * var55 / var18) + arg2.field3570;
                        float var56 = (float) var13 * this.field7292 + (float) var10 * this.field7282 + (float) var49 * this.field7276 + this.field7285;
                        var35 = (int) ((float) this.field7293.field8542 * var56 / var19) + arg2.field3573;
                        float var57 = (float) var13 * this.field7291 + (float) var10 * this.field7287 + (float) var49 * this.field7273 + this.field7290;
                        var37 = (int) ((float) this.field7293.field8518 * var57 / var19) + arg2.field3570;
                    } else {
                        var16 = (float) var12 * this.field7279 + (float) var10 * this.field7281 + (float) var46 * this.field7284 + this.field7275;
                        var17 = (float) var12 * this.field7279 + (float) var11 * this.field7281 + (float) var47 * this.field7284 + this.field7275;
                        var18 = (float) var13 * this.field7279 + (float) var11 * this.field7281 + (float) var48 * this.field7284 + this.field7275;
                        var19 = (float) var13 * this.field7279 + (float) var10 * this.field7281 + (float) var49 * this.field7284 + this.field7275;
                        float var58 = (float) var12 * this.field7292 + (float) var10 * this.field7282 + (float) var46 * this.field7276 + this.field7285;
                        var23 = (int) ((float) this.field7293.field8542 * var58 / (float) this.field7272) + arg2.field3573;
                        float var59 = (float) var12 * this.field7291 + (float) var10 * this.field7287 + (float) var46 * this.field7273 + this.field7290;
                        var25 = (int) ((float) this.field7293.field8518 * var59 / (float) this.field7272) + arg2.field3570;
                        float var60 = (float) var12 * this.field7292 + (float) var11 * this.field7282 + (float) var47 * this.field7276 + this.field7285;
                        var27 = (int) ((float) this.field7293.field8542 * var60 / (float) this.field7272) + arg2.field3573;
                        float var61 = (float) var12 * this.field7291 + (float) var11 * this.field7287 + (float) var47 * this.field7273 + this.field7290;
                        var29 = (int) ((float) this.field7293.field8518 * var61 / (float) this.field7272) + arg2.field3570;
                        float var62 = (float) var13 * this.field7292 + (float) var11 * this.field7282 + (float) var48 * this.field7276 + this.field7285;
                        var31 = (int) ((float) this.field7293.field8542 * var62 / (float) this.field7272) + arg2.field3573;
                        float var63 = (float) var13 * this.field7291 + (float) var11 * this.field7287 + (float) var48 * this.field7273 + this.field7290;
                        var33 = (int) ((float) this.field7293.field8518 * var63 / (float) this.field7272) + arg2.field3570;
                        float var64 = (float) var13 * this.field7292 + (float) var10 * this.field7282 + (float) var49 * this.field7276 + this.field7285;
                        var35 = (int) ((float) this.field7293.field8542 * var64 / (float) this.field7272) + arg2.field3573;
                        float var65 = (float) var13 * this.field7291 + (float) var10 * this.field7287 + (float) var49 * this.field7273 + this.field7290;
                        var37 = (int) ((float) this.field7293.field8518 * var65 / (float) this.field7272) + arg2.field3570;
                    }
                }
                if (this.field7272 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field3576 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field3579 || var35 > arg2.field3579 || var27 > arg2.field3579;
                        if (var9.field5202 >= 0) {
                            arg2.method2024((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class151.field1862[var9.field5207 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5201 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5204 & 65535] & 16777215, 0, 0, 0, 0, var9.field5202);
                        } else {
                            arg2.method2021((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5207 & 65535), (float) (var9.field5201 & 65535), (float) (var9.field5204 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field3576 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field3579 || var27 > arg2.field3579 || var35 > arg2.field3579;
                        if (var9.field5202 >= 0) {
                            arg2.method2024((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class151.field1862[var9.field5206 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5204 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5201 & 65535] & 16777215, 0, 0, 0, 0, var9.field5202);
                            return;
                        }
                        arg2.method2021((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5206 & 65535), (float) (var9.field5204 & 65535), (float) (var9.field5201 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field3576 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field3579 || var35 > arg2.field3579 || var27 > arg2.field3579;
                        if (var9.field5202 >= 0) {
                            arg2.method2024((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class151.field1862[var9.field5207 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5201 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5204 & 65535] & 16777215, 0, 0, 0, 0, var9.field5202);
                        } else {
                            arg2.method2021((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field5207 & 65535), (float) (var9.field5201 & 65535), (float) (var9.field5204 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field3576 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field3579 || var27 > arg2.field3579 || var35 > arg2.field3579;
                        if (var9.field5202 >= 0) {
                            arg2.method2024((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class151.field1862[var9.field5206 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5204 & 65535] & 16777215, -16777216 | class151.field1862[var9.field5201 & 65535] & 16777215, 0, 0, 0, 0, var9.field5202);
                            return;
                        }
                        arg2.method2021((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field5206 & 65535), (float) (var9.field5204 & 65535), (float) (var9.field5201 & 65535));
                    }
                }
            }
        } else {
            class632 var66 = this.field7289[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field9238 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field7272 == -1) {
                    for (int var67 = 0; var67 < var66.field9227; ++var67) {
                        int var68 = (arg0 << super.field4341) + var66.field9225[var67];
                        short var69 = var66.field9230[var67];
                        int var70 = (arg1 << super.field4341) + var66.field9234[var67];
                        float var71 = (float) var70 * this.field7279 + (float) var68 * this.field7281 + (float) var69 * this.field7284 + this.field7275;
                        if (var71 <= (float) this.field7293.field8515) {
                            return;
                        }
                        float var72 = (float) var70 * this.field7292 + (float) var68 * this.field7282 + (float) var69 * this.field7276 + this.field7285;
                        float var73 = (float) var70 * this.field7291 + (float) var68 * this.field7287 + (float) var69 * this.field7273 + this.field7290;
                        arg3[var67] = (int) ((float) this.field7293.field8542 * var72 / var71) + arg2.field3573;
                        arg4[var67] = (int) ((float) this.field7293.field8518 * var73 / var71) + arg2.field3570;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field9227; ++var74) {
                        int var110 = (arg0 << super.field4341) + var66.field9225[var74];
                        short var111 = var66.field9230[var74];
                        int var112 = (arg1 << super.field4341) + var66.field9234[var74];
                        float var113 = (float) var112 * this.field7279 + (float) var110 * this.field7281 + (float) var111 * this.field7284 + this.field7275;
                        float var114 = (float) var112 * this.field7292 + (float) var110 * this.field7282 + (float) var111 * this.field7276 + this.field7285;
                        float var115 = (float) var112 * this.field7291 + (float) var110 * this.field7287 + (float) var111 * this.field7273 + this.field7290;
                        arg3[var74] = (int) ((float) this.field7293.field8542 * var114 / (float) this.field7272) + arg2.field3573;
                        arg4[var74] = (int) ((float) this.field7293.field8518 * var115 / (float) this.field7272) + arg2.field3570;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field9235 != null) {
                    if (this.field7272 == -1) {
                        for (int var75 = 0; var75 < var66.field9228; ++var75) {
                            short var76 = var66.field9226[var75];
                            short var77 = var66.field9232[var75];
                            short var78 = var66.field9229[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field3576 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field3579 || var80 > arg2.field3579 || var81 > arg2.field3579;
                                short var85 = var66.field9235[var75];
                                if (var85 != -1) {
                                    arg2.method2024((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field9225[var76] / (float) super.field4340, (float) var66.field9225[var77] / (float) super.field4340, (float) var66.field9225[var78] / (float) super.field4340, (float) var66.field9234[var76] / (float) super.field4340, (float) var66.field9234[var77] / (float) super.field4340, (float) var66.field9234[var78] / (float) super.field4340, -16777216 | class151.field1862[var66.field9233[var76] & 65535] & 16777215, -16777216 | class151.field1862[var66.field9233[var77] & 65535] & 16777215, -16777216 | class151.field1862[var66.field9233[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field9236[var75];
                                    if (var86 != -1) {
                                        arg2.method2021((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class124.method1074(-24734, var66.field9233[var76], var86), (float) class124.method1074(-24734, var66.field9233[var77], var86), (float) class124.method1074(-24734, var66.field9233[var78], var86));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field9228; ++var87) {
                        short var88 = var66.field9226[var87];
                        short var89 = var66.field9232[var87];
                        short var90 = var66.field9229[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field3576 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field3579 || var92 > arg2.field3579 || var93 > arg2.field3579;
                            short var97 = var66.field9235[var87];
                            if (var97 != -1) {
                                arg2.method2024((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field9225[var88] / (float) super.field4340, (float) var66.field9225[var89] / (float) super.field4340, (float) var66.field9225[var90] / (float) super.field4340, (float) var66.field9234[var88] / (float) super.field4340, (float) var66.field9234[var89] / (float) super.field4340, (float) var66.field9234[var90] / (float) super.field4340, -16777216 | class151.field1862[var66.field9233[var88] & 65535] & 16777215, -16777216 | class151.field1862[var66.field9233[var89] & 65535] & 16777215, -16777216 | class151.field1862[var66.field9233[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field9236[var87];
                                if (var98 != -1) {
                                    arg2.method2021((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class124.method1074(-24734, var66.field9233[var88], var98), (float) class124.method1074(-24734, var66.field9233[var89], var98), (float) class124.method1074(-24734, var66.field9233[var90], var98));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field9228; ++var99) {
                    short var100 = var66.field9226[var99];
                    short var101 = var66.field9232[var99];
                    short var102 = var66.field9229[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field9236[var99];
                        if (var109 != -1) {
                            arg2.field3576 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field3579 || var104 > arg2.field3579 || var105 > arg2.field3579;
                            arg2.method2021((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class124.method1074(-24734, var66.field9233[var100], var109), (float) class124.method1074(-24734, var66.field9233[var101], var109), (float) class124.method1074(-24734, var66.field9233[var102], var109));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lcba;IIII[[I[[II)V", line = 485)
    public class503(class576 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7293 = arg0;
        this.field7286 = arg2;
        this.field7288 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7293.field8529 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7293.field8530 * var18 + this.field7293.field8551 * var16 + this.field7293.field8538 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7288[var11][var10] = (byte) var20;
            }
        }
        this.field7280 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(IIIIIII[[ZLmp;Lem;[I[I)V", line = 535)
    private final void method3788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class792 arg8, class237 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field11520;
        this.field7293.method488(false);
        arg9.field3574 = false;
        arg9.field3584 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field7283 != null) {
                        if (this.field7283[var18][var19] != null) {
                            class111 var20 = this.field7283[var18][var19];
                            if (var20.field1290 != -1 && (var20.field1291 & 2) == 0 && var20.field1287 == 0) {
                                int var21 = this.field7293.method4300(var20.field1290);
                                arg9.method2021((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class124.method1074(-24734, var20.field1294, var21), (float) class124.method1074(-24734, var20.field1286, var21), (float) class124.method1074(-24734, var20.field1289, var21));
                                arg9.method2021((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class124.method1074(-24734, var20.field1288, var21), (float) class124.method1074(-24734, var20.field1289, var21), (float) class124.method1074(-24734, var20.field1286, var21));
                            } else if (var20.field1287 == 0) {
                                arg9.method2035((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field1294, var20.field1286, var20.field1289);
                                arg9.method2035((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field1288, var20.field1289, var20.field1286);
                            } else {
                                int var22 = var20.field1287;
                                arg9.method2035((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class537.method4050(126, var20.field1294 & -16777216, var22), class537.method4050(83, var20.field1286 & -16777216, var22), class537.method4050(120, var20.field1289 & -16777216, var22));
                                arg9.method2035((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class537.method4050(77, var20.field1288 & -16777216, var22), class537.method4050(94, var20.field1289 & -16777216, var22), class537.method4050(121, var20.field1286 & -16777216, var22));
                            }
                        } else if (this.field7277[var18][var19] != null) {
                            class147 var23 = this.field7277[var18][var19];
                            for (int var24 = 0; var24 < var23.field1805; ++var24) {
                                arg10[var24] = var23.field1802[var24] * var14 / super.field4340 + var16;
                                arg11[var24] = var17 - var23.field1807[var24] * var14 / super.field4340;
                            }
                            for (int var25 = 0; var25 < var23.field1812; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field1810 != null && var23.field1810[var25] != 0 && (var23.field1808 == null || var23.field1808 != null && var23.field1808[var25] == -1)) {
                                    int var35 = var23.field1810[var25];
                                    arg9.method2035((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class537.method4050(88, -16777216 - (var23.field1804[var26] & -16777216), var35), class537.method4050(46, -16777216 - (var23.field1804[var27] & -16777216), var35), class537.method4050(44, -16777216 - (var23.field1804[var28] & -16777216), var35));
                                } else if (var23.field1808 != null && var23.field1808[var25] != -1) {
                                    int var36 = this.field7293.method4300(var23.field1808[var25]);
                                    arg9.method2021((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method2035((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field1804[var26], var23.field1804[var27], var23.field1804[var28]);
                                }
                            }
                        }
                    } else if (this.field7274[var18][var19] != null) {
                        class449 var37 = this.field7274[var18][var19];
                        for (int var38 = 0; var38 < var37.field6599; ++var38) {
                            arg10[var38] = var37.field6598[var38] * var14 / super.field4340 + var16;
                            arg11[var38] = var17 - var37.field6604[var38] * var14 / super.field4340;
                        }
                        for (int var39 = 0; var39 < var37.field6603; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field6602 != null && var37.field6602[var39] != 0) {
                                int var49 = var37.field6602[var39];
                                arg9.method2035((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method2035((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field6600[var40], var37.field6600[var41], var37.field6600[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3574 = true;
        this.field7293.method488(var15);
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(IIZLmp;Lem;[I[I[I[II)V", line = 731)
    private final void method3789(int arg0, int arg1, boolean arg2, class792 arg3, class237 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class111 var11 = this.field7283[arg0][arg1];
        if (var11 != null) {
            if ((var11.field1291 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field1291 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field4340 * arg0;
                int var13 = super.field4340 + var12;
                int var14 = super.field4340 * arg1;
                int var15 = super.field4340 + var14;
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
                if ((var11.field1291 & 1) != 0 && !arg2) {
                    int var20 = super.field4338[arg0][arg1];
                    float var21 = (float) var20 * this.field7284;
                    if (this.field7272 == -1) {
                        var22 = (float) var14 * this.field7279 + (float) var12 * this.field7281 + var21 + this.field7275;
                        if (var22 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var23 = (float) var14 * this.field7279 + (float) var13 * this.field7281 + var21 + this.field7275;
                        if (var23 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var24 = (float) var15 * this.field7279 + (float) var13 * this.field7281 + var21 + this.field7275;
                        if (var24 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var25 = (float) var15 * this.field7279 + (float) var12 * this.field7281 + var21 + this.field7275;
                        if (var25 <= (float) this.field7293.field8515) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field7279 + (float) var12 * this.field7281 + var21 + this.field7275;
                        var23 = (float) var14 * this.field7279 + (float) var13 * this.field7281 + var21 + this.field7275;
                        var24 = (float) var15 * this.field7279 + (float) var13 * this.field7281 + var21 + this.field7275;
                        var25 = (float) var15 * this.field7279 + (float) var12 * this.field7281 + var21 + this.field7275;
                    }
                    if (arg3.field11525) {
                        int var26 = (int) (var22 - (float) arg3.field11519);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field11519);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field11519);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field11519);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field7276;
                    float var31 = (float) var20 * this.field7273;
                    if (this.field7272 == -1) {
                        float var32 = (float) var14 * this.field7292 + (float) var12 * this.field7282 + var30 + this.field7285;
                        var33 = (int) ((float) this.field7293.field8542 * var32 / var22) + arg4.field3573;
                        float var34 = (float) var14 * this.field7291 + (float) var12 * this.field7287 + var31 + this.field7290;
                        var35 = (int) ((float) this.field7293.field8518 * var34 / var22) + arg4.field3570;
                        float var36 = (float) var14 * this.field7292 + (float) var13 * this.field7282 + var30 + this.field7285;
                        var37 = (int) ((float) this.field7293.field8542 * var36 / var23) + arg4.field3573;
                        float var38 = (float) var14 * this.field7291 + (float) var13 * this.field7287 + var31 + this.field7290;
                        var39 = (int) ((float) this.field7293.field8518 * var38 / var23) + arg4.field3570;
                        float var40 = (float) var15 * this.field7292 + (float) var13 * this.field7282 + var30 + this.field7285;
                        var41 = (int) ((float) this.field7293.field8542 * var40 / var24) + arg4.field3573;
                        float var42 = (float) var15 * this.field7291 + (float) var13 * this.field7287 + var31 + this.field7290;
                        var43 = (int) ((float) this.field7293.field8518 * var42 / var24) + arg4.field3570;
                        float var44 = (float) var15 * this.field7292 + (float) var12 * this.field7282 + var30 + this.field7285;
                        var45 = (int) ((float) this.field7293.field8542 * var44 / var25) + arg4.field3573;
                        float var46 = (float) var15 * this.field7291 + (float) var12 * this.field7287 + var31 + this.field7290;
                        var47 = (int) ((float) this.field7293.field8518 * var46 / var25) + arg4.field3570;
                    } else {
                        float var48 = (float) var14 * this.field7292 + (float) var12 * this.field7282 + var30 + this.field7285;
                        var33 = (int) ((float) this.field7293.field8542 * var48 / (float) this.field7272) + arg4.field3573;
                        float var49 = (float) var14 * this.field7291 + (float) var12 * this.field7287 + var31 + this.field7290;
                        var35 = (int) ((float) this.field7293.field8518 * var49 / (float) this.field7272) + arg4.field3570;
                        float var50 = (float) var14 * this.field7292 + (float) var13 * this.field7282 + var30 + this.field7285;
                        var37 = (int) ((float) this.field7293.field8542 * var50 / (float) this.field7272) + arg4.field3573;
                        float var51 = (float) var14 * this.field7291 + (float) var13 * this.field7287 + var31 + this.field7290;
                        var39 = (int) ((float) this.field7293.field8518 * var51 / (float) this.field7272) + arg4.field3570;
                        float var52 = (float) var15 * this.field7292 + (float) var13 * this.field7282 + var30 + this.field7285;
                        var41 = (int) ((float) this.field7293.field8542 * var52 / (float) this.field7272) + arg4.field3573;
                        float var53 = (float) var15 * this.field7291 + (float) var13 * this.field7287 + var31 + this.field7290;
                        var43 = (int) ((float) this.field7293.field8518 * var53 / (float) this.field7272) + arg4.field3570;
                        float var54 = (float) var15 * this.field7292 + (float) var12 * this.field7282 + var30 + this.field7285;
                        var45 = (int) ((float) this.field7293.field8542 * var54 / (float) this.field7272) + arg4.field3573;
                        float var55 = (float) var15 * this.field7291 + (float) var12 * this.field7287 + var31 + this.field7290;
                        var47 = (int) ((float) this.field7293.field8518 * var55 / (float) this.field7272) + arg4.field3570;
                    }
                } else {
                    int var56 = super.field4338[arg0][arg1];
                    int var57 = super.field4338[arg0 + 1][arg1];
                    int var58 = super.field4338[arg0 + 1][arg1 + 1];
                    int var59 = super.field4338[arg0][arg1 + 1];
                    if (this.field7272 == -1) {
                        var22 = (float) var14 * this.field7279 + (float) var12 * this.field7281 + (float) var56 * this.field7284 + this.field7275;
                        if (var22 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var23 = (float) var14 * this.field7279 + (float) var13 * this.field7281 + (float) var57 * this.field7284 + this.field7275;
                        if (var23 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var24 = (float) var15 * this.field7279 + (float) var13 * this.field7281 + (float) var58 * this.field7284 + this.field7275;
                        if (var24 <= (float) this.field7293.field8515) {
                            return;
                        }
                        var25 = (float) var15 * this.field7279 + (float) var12 * this.field7281 + (float) var59 * this.field7284 + this.field7275;
                        if (var25 <= (float) this.field7293.field8515) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field7279 + (float) var12 * this.field7281 + (float) var56 * this.field7284 + this.field7275;
                        var23 = (float) var14 * this.field7279 + (float) var13 * this.field7281 + (float) var57 * this.field7284 + this.field7275;
                        var24 = (float) var15 * this.field7279 + (float) var13 * this.field7281 + (float) var58 * this.field7284 + this.field7275;
                        var25 = (float) var15 * this.field7279 + (float) var12 * this.field7281 + (float) var59 * this.field7284 + this.field7275;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field11519);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field1293 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field11519);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field1295 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field11519);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field1292 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field11519);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field1296 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field11525) {
                        int var68 = (int) (var22 - (float) arg3.field11519);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field11519);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field11519);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field11519);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field7272 == -1) {
                        float var72 = (float) var14 * this.field7292 + (float) var12 * this.field7282 + (float) var56 * this.field7276 + this.field7285;
                        var33 = (int) ((float) this.field7293.field8542 * var72 / var22) + arg4.field3573;
                        float var73 = (float) var14 * this.field7291 + (float) var12 * this.field7287 + (float) var56 * this.field7273 + this.field7290;
                        var35 = (int) ((float) this.field7293.field8518 * var73 / var22) + arg4.field3570;
                        float var74 = (float) var14 * this.field7292 + (float) var13 * this.field7282 + (float) var57 * this.field7276 + this.field7285;
                        var37 = (int) ((float) this.field7293.field8542 * var74 / var23) + arg4.field3573;
                        float var75 = (float) var14 * this.field7291 + (float) var13 * this.field7287 + (float) var57 * this.field7273 + this.field7290;
                        var39 = (int) ((float) this.field7293.field8518 * var75 / var23) + arg4.field3570;
                        float var76 = (float) var15 * this.field7292 + (float) var13 * this.field7282 + (float) var58 * this.field7276 + this.field7285;
                        var41 = (int) ((float) this.field7293.field8542 * var76 / var24) + arg4.field3573;
                        float var77 = (float) var15 * this.field7291 + (float) var13 * this.field7287 + (float) var58 * this.field7273 + this.field7290;
                        var43 = (int) ((float) this.field7293.field8518 * var77 / var24) + arg4.field3570;
                        float var78 = (float) var15 * this.field7292 + (float) var12 * this.field7282 + (float) var59 * this.field7276 + this.field7285;
                        var45 = (int) ((float) this.field7293.field8542 * var78 / var25) + arg4.field3573;
                        float var79 = (float) var15 * this.field7291 + (float) var12 * this.field7287 + (float) var59 * this.field7273 + this.field7290;
                        var47 = (int) ((float) this.field7293.field8518 * var79 / var25) + arg4.field3570;
                    } else {
                        float var80 = (float) var14 * this.field7292 + (float) var12 * this.field7282 + (float) var56 * this.field7276 + this.field7285;
                        var33 = (int) ((float) this.field7293.field8542 * var80 / (float) this.field7272) + arg4.field3573;
                        float var81 = (float) var14 * this.field7291 + (float) var12 * this.field7287 + (float) var56 * this.field7273 + this.field7290;
                        var35 = (int) ((float) this.field7293.field8518 * var81 / (float) this.field7272) + arg4.field3570;
                        float var82 = (float) var14 * this.field7292 + (float) var13 * this.field7282 + (float) var57 * this.field7276 + this.field7285;
                        var37 = (int) ((float) this.field7293.field8542 * var82 / (float) this.field7272) + arg4.field3573;
                        float var83 = (float) var14 * this.field7291 + (float) var13 * this.field7287 + (float) var57 * this.field7273 + this.field7290;
                        var39 = (int) ((float) this.field7293.field8518 * var83 / (float) this.field7272) + arg4.field3570;
                        float var84 = (float) var15 * this.field7292 + (float) var13 * this.field7282 + (float) var58 * this.field7276 + this.field7285;
                        var41 = (int) ((float) this.field7293.field8542 * var84 / (float) this.field7272) + arg4.field3573;
                        float var85 = (float) var15 * this.field7291 + (float) var13 * this.field7287 + (float) var58 * this.field7273 + this.field7290;
                        var43 = (int) ((float) this.field7293.field8518 * var85 / (float) this.field7272) + arg4.field3570;
                        float var86 = (float) var15 * this.field7292 + (float) var12 * this.field7282 + (float) var59 * this.field7276 + this.field7285;
                        var45 = (int) ((float) this.field7293.field8542 * var86 / (float) this.field7272) + arg4.field3573;
                        float var87 = (float) var15 * this.field7291 + (float) var12 * this.field7287 + (float) var59 * this.field7273 + this.field7290;
                        var47 = (int) ((float) this.field7293.field8518 * var87 / (float) this.field7272) + arg4.field3570;
                    }
                }
                boolean var88 = var11.field1290 != -1 && this.method3791(this.field7293.field679.method1366((byte) -75, var11.field1290).field6467);
                if (this.field7272 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field3576 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field3579 || var45 > arg4.field3579 || var37 > arg4.field3579;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field1290 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method2024((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field1294 & 16777215, var90 | var11.field1286 & 16777215, var90 | var11.field1289 & 16777215, arg3.field11531, var18, var19, var17, var11.field1290);
                                } else {
                                    if (var88) {
                                        arg4.field3578 = 100;
                                    }
                                    arg4.method2035((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class537.method4050(56, var18 << 24 | arg3.field11531, var11.field1294), class537.method4050(108, var19 << 24 | arg3.field11531, var11.field1286), class537.method4050(51, var17 << 24 | arg3.field11531, var11.field1289));
                                    arg4.field3578 = 0;
                                }
                            } else if (var11.field1290 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method2024((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field1294 & 16777215, var91 | var11.field1286 & 16777215, var91 | var11.field1289 & 16777215, 0, 0, 0, 0, var11.field1290);
                            } else {
                                if (var88) {
                                    arg4.field3578 = 100;
                                }
                                arg4.method2035((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1294, var11.field1286, var11.field1289);
                                arg4.field3578 = 0;
                            }
                        } else {
                            arg4.method2038((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field11531);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field3576 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field3579 || var37 > arg4.field3579 || var45 > arg4.field3579;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field3578 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field1290 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method2024((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field1288 & 16777215, var93 | var11.field1289 & 16777215, var93 | var11.field1286 & 16777215, arg3.field11531, var16, var17, var19, var11.field1290);
                                    return;
                                }
                                if (var88) {
                                    arg4.field3578 = 100;
                                }
                                arg4.method2035((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class537.method4050(48, var16 << 24 | arg3.field11531, var11.field1288), class537.method4050(41, var17 << 24 | arg3.field11531, var11.field1289), class537.method4050(89, var19 << 24 | arg3.field11531, var11.field1286));
                                arg4.field3578 = 0;
                                return;
                            }
                            if (var11.field1290 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method2024((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field1288 & 16777215, var94 | var11.field1289 & 16777215, var94 | var11.field1286 & 16777215, 0, 0, 0, 0, var11.field1290);
                                return;
                            }
                            if (var88) {
                                arg4.field3578 = 100;
                            }
                            arg4.method2035((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1288, var11.field1289, var11.field1286);
                            arg4.field3578 = 0;
                            return;
                        }
                        arg4.method2038((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field11531);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field3576 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field3579 || var45 > arg4.field3579 || var37 > arg4.field3579;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field3578 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field1290 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method2024((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field1294 & 16777215, var96 | var11.field1286 & 16777215, var96 | var11.field1289 & 16777215, arg3.field11531, var18, var19, var17, var11.field1290);
                                } else {
                                    if (var88) {
                                        arg4.field3578 = 100;
                                    }
                                    arg4.method2035((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class537.method4050(71, var18 << 24 | arg3.field11531, var11.field1294), class537.method4050(91, var19 << 24 | arg3.field11531, var11.field1286), class537.method4050(72, var17 << 24 | arg3.field11531, var11.field1289));
                                    arg4.field3578 = 0;
                                }
                            } else if (var11.field1290 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method2024((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field1294 & 16777215, var97 | var11.field1286 & 16777215, var97 | var11.field1289 & 16777215, 0, 0, 0, 0, var11.field1290);
                            } else {
                                if (var88) {
                                    arg4.field3578 = 100;
                                }
                                arg4.method2035((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1294, var11.field1286, var11.field1289);
                                arg4.field3578 = 0;
                            }
                        } else {
                            arg4.method2038((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field11531);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field3576 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field3579 || var37 > arg4.field3579 || var45 > arg4.field3579;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field3578 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field1290 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method2024((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field1288 & 16777215, var99 | var11.field1289 & 16777215, var99 | var11.field1286 & 16777215, arg3.field11531, var16, var17, var19, var11.field1290);
                                    return;
                                }
                                if (var88) {
                                    arg4.field3578 = 100;
                                }
                                arg4.method2035((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class537.method4050(107, var16 << 24 | arg3.field11531, var11.field1288), class537.method4050(124, var17 << 24 | arg3.field11531, var11.field1289), class537.method4050(102, var19 << 24 | arg3.field11531, var11.field1286));
                                arg4.field3578 = 0;
                                return;
                            }
                            if (var11.field1290 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method2024((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field1288 & 16777215, var100 | var11.field1289 & 16777215, var100 | var11.field1286 & 16777215, 0, 0, 0, 0, var11.field1290);
                                return;
                            }
                            if (var88) {
                                arg4.field3578 = 100;
                            }
                            arg4.method2035((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1288, var11.field1289, var11.field1286);
                            arg4.field3578 = 0;
                            return;
                        }
                        arg4.method2038((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field11531);
                    }
                }
            }
        } else {
            class147 var101 = this.field7277[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field1806 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field7272 == -1) {
                    for (int var102 = 0; var102 < var101.field1805; ++var102) {
                        int var103 = (arg0 << super.field4341) + var101.field1802[var102];
                        int var104 = var101.field1811[var102];
                        int var105 = (arg1 << super.field4341) + var101.field1807[var102];
                        float var106 = (float) var105 * this.field7279 + (float) var103 * this.field7281 + (float) var104 * this.field7284 + this.field7275;
                        if (var106 <= (float) this.field7293.field8515) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field11519);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field1809[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field11525) {
                            int var109 = (int) (var106 - (float) arg3.field11519);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field7292 + (float) var103 * this.field7282 + (float) var104 * this.field7276 + this.field7285;
                        float var111 = (float) var105 * this.field7291 + (float) var103 * this.field7287 + (float) var104 * this.field7273 + this.field7290;
                        arg5[var102] = (int) ((float) this.field7293.field8542 * var110 / var106) + arg4.field3573;
                        arg6[var102] = (int) ((float) this.field7293.field8518 * var111 / var106) + arg4.field3570;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field1805; ++var112) {
                        int var152 = (arg0 << super.field4341) + var101.field1802[var112];
                        int var153 = var101.field1811[var112];
                        int var154 = (arg1 << super.field4341) + var101.field1807[var112];
                        float var155 = (float) var154 * this.field7279 + (float) var152 * this.field7281 + (float) var153 * this.field7284 + this.field7275;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field7272 - arg3.field11519;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field1809[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field11525) {
                            int var158 = this.field7272 - arg3.field11519;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field7292 + (float) var152 * this.field7282 + (float) var153 * this.field7276 + this.field7285;
                        float var160 = (float) var154 * this.field7291 + (float) var152 * this.field7287 + (float) var153 * this.field7273 + this.field7290;
                        arg5[var112] = (int) ((float) this.field7293.field8542 * var159 / (float) this.field7272) + arg4.field3573;
                        arg6[var112] = (int) ((float) this.field7293.field8518 * var160 / (float) this.field7272) + arg4.field3570;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field1808 != null) {
                    if (this.field7272 == -1) {
                        for (int var113 = 0; var113 < var101.field1812; ++var113) {
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
                                arg4.field3576 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field3579 || var118 > arg4.field3579 || var119 > arg4.field3579;
                                short var124 = var101.field1808[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method3791(this.field7293.field679.method1366((byte) -55, var124).field6467)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method2024((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field1802[var114] / (float) super.field4340, (float) var101.field1802[var115] / (float) super.field4340, (float) var101.field1802[var116] / (float) super.field4340, (float) var101.field1807[var114] / (float) super.field4340, (float) var101.field1807[var115] / (float) super.field4340, (float) var101.field1807[var116] / (float) super.field4340, var125 | var101.field1804[var114] & 16777215, var125 | var101.field1804[var115] & 16777215, var125 | var101.field1804[var116] & 16777215, arg3.field11531, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field1804[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method3791(this.field7293.field679.method1366((byte) -49, var124).field6467)) {
                                                arg4.field3578 = -1694498816;
                                            }
                                            arg4.method2035((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class537.method4050(81, arg8[var114] << 24 | arg3.field11531, var101.field1804[var114]), class537.method4050(51, arg8[var115] << 24 | arg3.field11531, var101.field1804[var115]), class537.method4050(94, arg8[var116] << 24 | arg3.field11531, var101.field1804[var116]));
                                            arg4.field3578 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method3791(this.field7293.field679.method1366((byte) -79, var124).field6467)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method2024((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field1802[var114] / (float) super.field4340, (float) var101.field1802[var115] / (float) super.field4340, (float) var101.field1802[var116] / (float) super.field4340, (float) var101.field1807[var114] / (float) super.field4340, (float) var101.field1807[var115] / (float) super.field4340, (float) var101.field1807[var116] / (float) super.field4340, var126 | var101.field1804[var114] & 16777215, var126 | var101.field1804[var115] & 16777215, var126 | var101.field1804[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field1804[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method3791(this.field7293.field679.method1366((byte) -108, var124).field6467)) {
                                            arg4.field3578 = -1694498816;
                                        }
                                        arg4.method2035((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field1804[var114], var101.field1804[var115], var101.field1804[var116]);
                                        arg4.field3578 = 0;
                                    }
                                } else {
                                    arg4.method2038((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field11531);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field1812; ++var127) {
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
                            arg4.field3576 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field3579 || var132 > arg4.field3579 || var133 > arg4.field3579;
                            short var138 = var101.field1808[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method3791(this.field7293.field679.method1366((byte) -57, var138).field6467)) {
                                    arg4.field3578 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method3791(this.field7293.field679.method1366((byte) -46, var138).field6467)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method2024((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field1802[var128] / (float) super.field4340, (float) var101.field1802[var129] / (float) super.field4340, (float) var101.field1802[var130] / (float) super.field4340, (float) var101.field1807[var128] / (float) super.field4340, (float) var101.field1807[var129] / (float) super.field4340, (float) var101.field1807[var130] / (float) super.field4340, var139 | var101.field1804[var128] & 16777215, var139 | var101.field1804[var129] & 16777215, var139 | var101.field1804[var130] & 16777215, arg3.field11531, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field1804[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method3791(this.field7293.field679.method1366((byte) -44, var138).field6467)) {
                                            arg4.field3578 = -1694498816;
                                        }
                                        arg4.method2035((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class537.method4050(122, arg8[var128] << 24 | arg3.field11531, var101.field1804[var128]), class537.method4050(64, arg8[var129] << 24 | arg3.field11531, var101.field1804[var129]), class537.method4050(46, arg8[var130] << 24 | arg3.field11531, var101.field1804[var130]));
                                        arg4.field3578 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method3791(this.field7293.field679.method1366((byte) -55, var138).field6467)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method2024((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field1802[var128] / (float) super.field4340, (float) var101.field1802[var129] / (float) super.field4340, (float) var101.field1802[var130] / (float) super.field4340, (float) var101.field1807[var128] / (float) super.field4340, (float) var101.field1807[var129] / (float) super.field4340, (float) var101.field1807[var130] / (float) super.field4340, var140 | var101.field1804[var128] & 16777215, var140 | var101.field1804[var129] & 16777215, var140 | var101.field1804[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field1804[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method3791(this.field7293.field679.method1366((byte) -109, var138).field6467)) {
                                        arg4.field3578 = -1694498816;
                                    }
                                    arg4.method2035((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field1804[var128], var101.field1804[var129], var101.field1804[var130]);
                                    arg4.field3578 = 0;
                                }
                                arg4.field3578 = 0;
                            } else {
                                arg4.method2038((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field11531);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field1812; ++var141) {
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
                        arg4.field3576 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field3579 || var146 > arg4.field3579 || var147 > arg4.field3579;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field1804[var142] & 16777215) != 0) {
                                    arg4.method2035((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class447.method3437(arg3.field11531, var101.field1804[var142], arg8[var142], 86), class447.method3437(arg3.field11531, var101.field1804[var143], arg8[var143], 56), class447.method3437(arg3.field11531, var101.field1804[var144], arg8[var144], 96));
                                }
                            } else if ((var101.field1804[var142] & 16777215) != 0) {
                                arg4.method2035((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field1804[var142], var101.field1804[var143], var101.field1804[var144]);
                            }
                        } else {
                            arg4.method2038((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field11531);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Luf;[I)V", line = 1719)
    public final void method1499(class471 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(III[[ZZI)V", line = 1723)
    public final void method1513(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class559 var7 = this.field7293.field8525;
        this.field7272 = -1;
        this.field7282 = var7.field8305;
        this.field7276 = var7.field8321;
        this.field7292 = var7.field8309;
        this.field7285 = var7.field8324;
        this.field7287 = var7.field8312;
        this.field7273 = var7.field8327;
        this.field7291 = var7.field8326;
        this.field7290 = var7.field8311;
        this.field7281 = var7.field8319;
        this.field7284 = var7.field8315;
        this.field7279 = var7.field8301;
        this.field7275 = var7.field8310;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field4337 && var11 >= 0 && var11 < super.field4336) {
                        this.method3794(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1769)
    public final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class792 var9 = this.field7293.method4306(Thread.currentThread());
        class237 var10 = var9.field11533;
        var10.field3578 = 0;
        var10.field3576 = true;
        this.field7293.method586();
        if (this.field7283 == null && this.field7274 == null) {
            if (this.field7278 != null) {
                this.method3793(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field11560, var9.field11559);
            }
        } else {
            this.method3788(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field11560, var9.field11559);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1784)
    public final void method1506(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7278 == null) {
            this.field7278 = new class332[super.field4337][super.field4336];
            this.field7289 = new class632[super.field4337][super.field4336];
        } else if (this.field7283 != null || this.field7274 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field4340 != var20 || var21 != 0 && super.field4340 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class632 var22 = new class632();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field9227 = var23;
            var22.field9233 = new short[var23];
            var22.field9225 = new short[var23];
            var22.field9230 = new short[var23];
            var22.field9234 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field9233[var25] = (short) (this.field7288[arg0][arg1] - this.field7280[arg0][arg1]);
                } else if (var32 == 0 && super.field4340 == var33) {
                    var22.field9233[var25] = (short) (this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]);
                } else if (super.field4340 == var32 && super.field4340 == var33) {
                    var22.field9233[var25] = (short) (this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]);
                } else if (super.field4340 == var32 && var33 == 0) {
                    var22.field9233[var25] = (short) (this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]) * var32 + (this.field7288[arg0][arg1] - this.field7280[arg0][arg1]) * (super.field4340 - var32);
                    int var35 = (this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]) * var32 + (this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]) * (super.field4340 - var32);
                    var22.field9233[var25] = (short) ((super.field4340 - var33) * var34 + var33 * var35 >> super.field4341 * 2);
                }
                int var36 = (arg0 << super.field4341) + var32;
                int var37 = (arg1 << super.field4341) + var33;
                var22.field9225[var25] = (short) var32;
                var22.field9234[var25] = (short) var33;
                var22.field9230[var25] = (short) (this.method2404((byte) 123, var36, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field9233[var25] < 2) {
                    var22.field9233[var25] = 2;
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
                    class439 var31 = this.field7293.field679.method1366((byte) -77, var30);
                    if (!var31.field6474) {
                        var26 = true;
                        if (this.method3791(var31.field6467) || var31.field6475 != 0 || var31.field6466 != 0) {
                            var22.field9238 = (byte) (var22.field9238 | 4);
                        }
                    }
                }
            }
            var22.field9236 = new int[var27];
            if (arg10 != null) {
                var22.field9237 = new int[var27];
            }
            var22.field9226 = new short[var27];
            var22.field9232 = new short[var27];
            var22.field9229 = new short[var27];
            if (var26) {
                var22.field9235 = new short[var27];
                var22.field9231 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field9236[var22.field9228] = class750.method5454(arg9[var29], 13020);
                    } else {
                        var22.field9236[var22.field9228] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field9237[var22.field9228] = class750.method5454(arg10[var29], 13020);
                        } else {
                            var22.field9237[var22.field9228] = -1;
                        }
                    }
                    var22.field9226[var22.field9228] = (short) arg6[var29];
                    var22.field9232[var22.field9228] = (short) arg7[var29];
                    var22.field9229[var22.field9228] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7293.field679.method1366((byte) -57, arg11[var29]).field6474) {
                            var22.field9235[var22.field9228] = (short) arg11[var29];
                            var22.field9231[var22.field9228] = (short) arg12[var29];
                        } else {
                            var22.field9235[var22.field9228] = -1;
                        }
                    }
                    ++var22.field9228;
                }
            }
            this.field7289[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class332 var38 = new class332();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field5205 = class124.method1074(-24734, this.field7288[arg0][arg1] - this.field7280[arg0][arg1], class750.method5454(arg10[0], 13020));
                    if (var39 == -1) {
                        var38.field5203 = (byte) (var38.field5203 | 2);
                    }
                }
                if (super.field4338[arg0 + 1][arg1] == super.field4338[arg0][arg1] && super.field4338[arg0 + 1][arg1 + 1] == super.field4338[arg0][arg1] && super.field4338[arg0][arg1 + 1] == super.field4338[arg0][arg1]) {
                    var38.field5203 = (byte) (var38.field5203 | 1);
                }
                class439 var41 = null;
                if (var40 != -1) {
                    var41 = this.field7293.field679.method1366((byte) -59, var40);
                }
                if (var41 != null && (var38.field5203 & 2) == 0 && !var41.field6474) {
                    var38.field5206 = (short) (this.field7288[arg0][arg1] - this.field7280[arg0][arg1]);
                    var38.field5204 = (short) (this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]);
                    var38.field5207 = (short) (this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]);
                    var38.field5201 = (short) (this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]);
                    var38.field5202 = (short) var40;
                    if (this.method3791(var41.field6467) || var41.field6475 != 0 || var41.field6466 != 0) {
                        var38.field5203 = (byte) (var38.field5203 | 4);
                    }
                } else {
                    short var42 = class750.method5454(var39, 13020);
                    var38.field5206 = (short) class124.method1074(-24734, this.field7288[arg0][arg1] - this.field7280[arg0][arg1], var42);
                    var38.field5204 = (short) class124.method1074(-24734, this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1], var42);
                    var38.field5207 = (short) class124.method1074(-24734, this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1], var42);
                    var38.field5201 = (short) class124.method1074(-24734, this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1], var42);
                    var38.field5202 = -1;
                }
                this.field7278[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 2034)
    public final void method1503(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field7286 & 32) == 0;
        if (this.field7283 == null && !var15) {
            this.field7283 = new class111[super.field4337][super.field4336];
            this.field7277 = new class147[super.field4337][super.field4336];
        } else if (this.field7274 == null && var15) {
            this.field7274 = new class449[super.field4337][super.field4336];
        } else if (this.field7278 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class151.field1862[class750.method5454(arg6[var16], 13020) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class151.field1862[class750.method5454(arg7[var17], 13020) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class449 var18 = new class449();
                var18.field6599 = (short) arg2.length;
                var18.field6603 = (short) (arg2.length / 3);
                var18.field6598 = new short[var18.field6599];
                var18.field6605 = new short[var18.field6599];
                var18.field6604 = new short[var18.field6599];
                var18.field6600 = new int[var18.field6599];
                var18.field6601 = new short[var18.field6599];
                var18.field6606 = new short[var18.field6599];
                var18.field6607 = new byte[var18.field6599];
                if (arg5 != null) {
                    var18.field6608 = new short[var18.field6599];
                }
                for (int var19 = 0; var19 < var18.field6599; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field7288[arg0][arg1] - this.field7280[arg0][arg1];
                    } else if (var22 == 0 && super.field4340 == var23) {
                        var25 = this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1];
                    } else if (super.field4340 == var22 && super.field4340 == var23) {
                        var25 = this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1];
                    } else if (super.field4340 == var22 && var23 == 0) {
                        var25 = this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]) * var22 + (this.field7288[arg0][arg1] - this.field7280[arg0][arg1]) * (super.field4340 - var22);
                        int var27 = (this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]) * var22 + (this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]) * (super.field4340 - var22);
                        var25 = (super.field4340 - var23) * var26 + var23 * var27 >> super.field4341 * 2;
                    }
                    int var28 = (arg0 << super.field4341) + var22;
                    int var29 = (arg1 << super.field4341) + var23;
                    var18.field6598[var19] = (short) var22;
                    var18.field6604[var19] = (short) var23;
                    var18.field6605[var19] = (short) (this.method2404((byte) 115, var28, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field6600[var19] = 0;
                        if (arg7 != null) {
                            var18.field6607[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field6608[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method3791(this.field7293.field679.method1366((byte) -85, arg8[var19]).field6467)) {
                            var32 = -1694498816;
                        }
                        var18.field6600[var19] = var32 | class447.method3437(arg10, method3790(arg6[var19] >> 8, var25), var30, 116);
                        if (arg7 != null) {
                            var18.field6607[var19] = (byte) var25;
                        }
                    }
                    var18.field6601[var19] = (short) arg8[var19];
                    var18.field6606[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field6602 = new int[var18.field6603];
                }
                for (int var20 = 0; var20 < var18.field6603; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field6602[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field7274[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field4340 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field4340 && arg4[var38] == super.field4340) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field4340) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field4340 != arg2[var40] && arg2[0] - super.field4340 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field4340 != arg4[var40] && arg4[0] - super.field4340 != arg4[var40]) {
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
                    class111 var41 = new class111();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field1287 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field1291 = (byte) (var41.field1291 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field4338[arg0 + 1][arg1] == super.field4338[arg0][arg1] && super.field4338[arg0 + 1][arg1 + 1] == super.field4338[arg0][arg1] && super.field4338[arg0][arg1 + 1] == super.field4338[arg0][arg1]) {
                        var41.field1291 = (byte) (var41.field1291 | 1);
                    }
                    if (var43 != -1 && (var41.field1291 & 2) == 0 && !this.field7293.field679.method1366((byte) -97, var43).field6474) {
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
                        var41.field1288 = class447.method3437(arg10, method3790(arg6[var34] >> 8, this.field7288[arg0][arg1] - this.field7280[arg0][arg1]), var44, 62);
                        if (var41.field1287 != 0) {
                            var41.field1288 |= 255 - (this.field7288[arg0][arg1] - this.field7280[arg0][arg1]) << 25;
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
                        var41.field1289 = class447.method3437(arg10, method3790(arg6[var35] >> 8, this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]), var45, 48);
                        if (var41.field1287 != 0) {
                            var41.field1289 |= 255 - (this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]) << 25;
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
                        var41.field1294 = class447.method3437(arg10, method3790(arg6[var36] >> 8, this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]), var46, 92);
                        if (var41.field1287 != 0) {
                            var41.field1294 |= 255 - (this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field1286 = class447.method3437(arg10, method3790(arg6[var37] >> 8, this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]), var47, 99);
                        var41.field1290 = (short) var43;
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
                        var41.field1288 = class447.method3437(arg10, method3790(arg6[var34] >> 8, this.field7288[arg0][arg1] - this.field7280[arg0][arg1]), var48, 78);
                        if (var41.field1287 != 0) {
                            var41.field1288 |= 255 - (this.field7288[arg0][arg1] - this.field7280[arg0][arg1]) << 25;
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
                        var41.field1289 = class447.method3437(arg10, method3790(arg6[var35] >> 8, this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]), var49, 124);
                        if (var41.field1287 != 0) {
                            var41.field1289 |= 255 - (this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]) << 25;
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
                        var41.field1294 = class447.method3437(arg10, method3790(arg6[var36] >> 8, this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]), var50, 57);
                        if (var41.field1287 != 0) {
                            var41.field1294 |= 255 - (this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field1286 = class447.method3437(arg10, method3790(arg6[var37] >> 8, this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]), var51, 47);
                        if (var41.field1287 != 0) {
                            var41.field1286 |= 255 - (this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]) << 25;
                        }
                        var41.field1290 = -1;
                    }
                    if (arg5 != null) {
                        var41.field1292 = (short) arg5[var36];
                        var41.field1296 = (short) arg5[var37];
                        var41.field1295 = (short) arg5[var35];
                        var41.field1293 = (short) arg5[var34];
                    }
                    this.field7283[arg0][arg1] = var41;
                } else {
                    class147 var52 = new class147();
                    var52.field1805 = (short) arg2.length;
                    var52.field1812 = (short) (arg2.length / 3);
                    var52.field1802 = new short[var52.field1805];
                    var52.field1811 = new short[var52.field1805];
                    var52.field1807 = new short[var52.field1805];
                    var52.field1804 = new int[var52.field1805];
                    if (arg5 != null) {
                        var52.field1809 = new short[var52.field1805];
                    }
                    for (int var53 = 0; var53 < var52.field1805; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field7288[arg0][arg1] - this.field7280[arg0][arg1];
                        } else if (var68 == 0 && super.field4340 == var69) {
                            var71 = this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1];
                        } else if (super.field4340 == var68 && super.field4340 == var69) {
                            var71 = this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1];
                        } else if (super.field4340 == var68 && var69 == 0) {
                            var71 = this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field7288[arg0 + 1][arg1] - this.field7280[arg0 + 1][arg1]) * var68 + (this.field7288[arg0][arg1] - this.field7280[arg0][arg1]) * (super.field4340 - var68);
                            int var73 = (this.field7288[arg0 + 1][arg1 + 1] - this.field7280[arg0 + 1][arg1 + 1]) * var68 + (this.field7288[arg0][arg1 + 1] - this.field7280[arg0][arg1 + 1]) * (super.field4340 - var68);
                            var71 = (super.field4340 - var69) * var72 + var69 * var73 >> super.field4341 * 2;
                        }
                        int var74 = (arg0 << super.field4341) + var68;
                        int var75 = (arg1 << super.field4341) + var69;
                        var52.field1802[var53] = (short) var68;
                        var52.field1807[var53] = (short) var69;
                        var52.field1811[var53] = (short) (this.method2404((byte) 121, var74, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field1804[var53] = var71 << 25;
                            } else {
                                var52.field1804[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field1809[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field1804[var53] = class447.method3437(arg10, method3790(arg6[var53] >> 8, var71), var76, 81);
                            if (arg7 != null) {
                                var52.field1804[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field1812; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field7293.field679.method1366((byte) -60, arg8[var55 * 3]).field6474) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field1810 = new int[var52.field1812];
                    }
                    if (var54) {
                        var52.field1808 = new short[var52.field1812];
                        var52.field1803 = new short[var52.field1812];
                    }
                    for (int var56 = 0; var56 < var52.field1812; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field1810[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field7293.field679.method1366((byte) -51, var62).field6474) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field7293.field679.method1366((byte) -65, var63).field6474) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field7293.field679.method1366((byte) -53, var64).field6474) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field1808[var56] = (short) var64;
                                var52.field1803[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field7293.field679.method1366((byte) -77, var65).field6474) {
                                        var52.field1804[var57] = class151.field1862[class750.method5454(this.field7293.field679.method1366((byte) -103, var65).field6472 & 65535, 13020) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field7293.field679.method1366((byte) -48, var66).field6474) {
                                        var52.field1804[var58] = class151.field1862[class750.method5454(this.field7293.field679.method1366((byte) -66, var66).field6472 & 65535, 13020) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field7293.field679.method1366((byte) -77, var67).field6474) {
                                        var52.field1804[var59] = class151.field1862[class750.method5454(this.field7293.field679.method1366((byte) -100, var67).field6472 & 65535, 13020) & 65535];
                                    }
                                }
                                var52.field1808[var56] = -1;
                            }
                        }
                    }
                    this.field7277[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(III[[ZZII)V", line = 2737)
    public final void method1515(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class559 var8 = this.field7293.field8525;
        this.field7272 = arg5;
        this.field7282 = var8.field8305;
        this.field7276 = var8.field8321;
        this.field7292 = var8.field8309;
        this.field7285 = var8.field8324;
        this.field7287 = var8.field8312;
        this.field7273 = var8.field8327;
        this.field7291 = var8.field8326;
        this.field7290 = var8.field8311;
        this.field7281 = var8.field8319;
        this.field7284 = var8.field8315;
        this.field7279 = var8.field8301;
        this.field7275 = var8.field8310;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field4337 && var12 >= 0 && var12 < super.field4336) {
                        this.method3794(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 2782)
    public final void method1514(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(II)I", line = 2786)
    private static final int method3790(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!lia", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 2815)
    public final void method1507(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)Z", line = 2820)
    private final boolean method3791(int arg0) {
        if ((this.field7286 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 2836)
    public final boolean method1501(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V", line = 2841)
    public final void method1505(int arg0, int arg1) {
        this.method3794(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIZLmp;Lem;[I[I[I[II)V", line = 2845)
    private final void method3792(int arg0, int arg1, boolean arg2, class792 arg3, class237 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class449 var11 = this.field7274[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field7272 == -1) {
                    for (int var12 = 0; var12 < var11.field6599; ++var12) {
                        int var13 = (arg0 << super.field4341) + var11.field6598[var12];
                        int var14 = var11.field6605[var12];
                        int var15 = (arg1 << super.field4341) + var11.field6604[var12];
                        float var16 = (float) var15 * this.field7279 + (float) var13 * this.field7281 + (float) var14 * this.field7284 + this.field7275;
                        if (var16 <= (float) this.field7293.field8515) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field11519);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field6608[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field11525) {
                            int var19 = (int) (var16 - (float) arg3.field11519);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field7292 + (float) var13 * this.field7282 + (float) var14 * this.field7276 + this.field7285;
                        float var21 = (float) var15 * this.field7291 + (float) var13 * this.field7287 + (float) var14 * this.field7273 + this.field7290;
                        arg5[var12] = (int) ((float) this.field7293.field8542 * var20 / var16) + arg4.field3573;
                        arg6[var12] = (int) ((float) this.field7293.field8518 * var21 / var16) + arg4.field3570;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field6599; ++var22) {
                        int var36 = (arg0 << super.field4341) + var11.field6598[var22];
                        int var37 = var11.field6605[var22];
                        int var38 = (arg1 << super.field4341) + var11.field6604[var22];
                        float var39 = (float) var38 * this.field7279 + (float) var36 * this.field7281 + (float) var37 * this.field7284 + this.field7275;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field7272 - arg3.field11519;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field6608[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field11525) {
                            int var42 = this.field7272 - arg3.field11519;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field7292 + (float) var36 * this.field7282 + (float) var37 * this.field7276 + this.field7285;
                        float var44 = (float) var38 * this.field7291 + (float) var36 * this.field7287 + (float) var37 * this.field7273 + this.field7290;
                        arg5[var22] = (int) ((float) this.field7293.field8542 * var43 / (float) this.field7272) + arg4.field3573;
                        arg6[var22] = (int) ((float) this.field7293.field8518 * var44 / (float) this.field7272) + arg4.field3570;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field4340;
                for (int var24 = 0; var24 < var11.field6603; ++var24) {
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
                        arg4.field3576 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field3579 || var29 > arg4.field3579 || var30 > arg4.field3579;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field4341;
                            int var35 = arg1 << super.field4341;
                            if ((var11.field6600[var25] & 16777215) != 0) {
                                if (var11.field6601[var25] == var11.field6601[var26] && var11.field6601[var25] == var11.field6601[var27] && var11.field6606[var25] == var11.field6606[var26] && var11.field6606[var25] == var11.field6606[var27]) {
                                    arg4.method2024((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field6598[var25] + var34) / (float) var11.field6606[var25], (float) (var11.field6598[var26] + var34) / (float) var11.field6606[var26], (float) (var11.field6598[var27] + var34) / (float) var11.field6606[var27], (float) (var11.field6604[var25] + var35) / (float) var11.field6606[var25], (float) (var11.field6604[var26] + var35) / (float) var11.field6606[var26], (float) (var11.field6604[var27] + var35) / (float) var11.field6606[var27], var11.field6600[var25], var11.field6600[var26], var11.field6600[var27], arg3.field11531, arg8[var25], arg8[var26], arg8[var27], var11.field6601[var25]);
                                } else {
                                    arg4.method2034((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field6598[var25] + var34) / var23, (float) (var11.field6598[var26] + var34) / var23, (float) (var11.field6598[var27] + var34) / var23, (float) (var11.field6604[var25] + var35) / var23, (float) (var11.field6604[var26] + var35) / var23, (float) (var11.field6604[var27] + var35) / var23, var11.field6600[var25], var11.field6600[var26], var11.field6600[var27], arg3.field11531, arg8[var25], arg8[var26], arg8[var27], var11.field6601[var25], var23 / (float) var11.field6606[var25], var11.field6601[var26], var23 / (float) var11.field6606[var26], var11.field6601[var27], var23 / (float) var11.field6606[var27]);
                                }
                            }
                        } else {
                            arg4.method2038((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field11531);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "ka", descriptor = "(III)V", line = 3035)
    public final void method1509(int arg0, int arg1, int arg2) {
        if (this.field7280[arg0][arg1] < arg2) {
            this.field7280[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!lia", name = "YA", descriptor = "()V", line = 3041)
    public final void method1500() {
        this.field7288 = null;
        this.field7280 = null;
    }

    @OriginalMember(owner = "client!lia", name = "fa", descriptor = "(IILr;)Lr;", line = 3046)
    public final class194 method1504(int arg0, int arg1, class194 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIII[[ZLmp;Lem;[I[I)V", line = 3052)
    private final void method3793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class792 arg8, class237 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field11520;
        this.field7293.method488(false);
        arg9.field3574 = false;
        arg9.field3584 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field7278[var18][var19] != null) {
                        class332 var20 = this.field7278[var18][var19];
                        if (var20.field5202 != -1 && (var20.field5203 & 2) == 0 && var20.field5205 == -1) {
                            int var21 = this.field7293.method4300(var20.field5202);
                            arg9.method2021((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class124.method1074(-24734, var20.field5207 & 65535, var21), (float) class124.method1074(-24734, var20.field5201 & 65535, var21), (float) class124.method1074(-24734, var20.field5204 & 65535, var21));
                            arg9.method2021((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class124.method1074(-24734, var20.field5206 & 65535, var21), (float) class124.method1074(-24734, var20.field5204 & 65535, var21), (float) class124.method1074(-24734, var20.field5201 & 65535, var21));
                        } else if (var20.field5205 == -1) {
                            arg9.method2021((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field5207 & 65535), (float) (var20.field5201 & 65535), (float) (var20.field5204 & 65535));
                            arg9.method2021((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field5206 & 65535), (float) (var20.field5204 & 65535), (float) (var20.field5201 & 65535));
                        } else {
                            int var22 = var20.field5205;
                            arg9.method2021((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method2021((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field7289[var18][var19] != null) {
                        class632 var23 = this.field7289[var18][var19];
                        for (int var24 = 0; var24 < var23.field9227; ++var24) {
                            arg10[var24] = var23.field9225[var24] * var14 / super.field4340 + var16;
                            arg11[var24] = var17 - var23.field9234[var24] * var14 / super.field4340;
                        }
                        for (int var25 = 0; var25 < var23.field9228; ++var25) {
                            short var26 = var23.field9226[var25];
                            short var27 = var23.field9232[var25];
                            short var28 = var23.field9229[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field9237 != null && var23.field9237[var25] != -1) {
                                int var35 = var23.field9237[var25];
                                arg9.method2021((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class124.method1074(-24734, var23.field9233[var26], var35), (float) class124.method1074(-24734, var23.field9233[var27], var35), (float) class124.method1074(-24734, var23.field9233[var28], var35));
                            } else if (var23.field9235 != null && var23.field9235[var25] != -1) {
                                int var36 = this.field7293.method4300(var23.field9235[var25]);
                                arg9.method2021((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class124.method1074(-24734, var23.field9233[var26], var36), (float) class124.method1074(-24734, var23.field9233[var27], var36), (float) class124.method1074(-24734, var23.field9233[var28], var36));
                            } else {
                                int var37 = var23.field9236[var25];
                                arg9.method2021((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class124.method1074(-24734, var23.field9233[var26], var37), (float) class124.method1074(-24734, var23.field9233[var27], var37), (float) class124.method1074(-24734, var23.field9233[var28], var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3574 = true;
        this.field7293.method488(var15);
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(III)V", line = 3188)
    private final void method3794(int arg0, int arg1, int arg2) {
        class792 var4 = this.field7293.method4306(Thread.currentThread());
        var4.field11533.field3578 = 0;
        if (this.field7283 != null) {
            this.method3789(arg0, arg1, var4.field11527, var4, var4.field11533, var4.field11560, var4.field11559, var4.field11554, var4.field11553, arg2);
        } else if (this.field7278 != null) {
            this.method3787(arg0, arg1, var4.field11533, var4.field11560, var4.field11559, var4.field11554, var4.field11553, arg2);
        } else {
            if (this.field7274 != null) {
                this.method3792(arg0, arg1, var4.field11527, var4, var4.field11533, var4.field11560, var4.field11559, var4.field11554, var4.field11553, arg2);
            }
        }
    }
}
