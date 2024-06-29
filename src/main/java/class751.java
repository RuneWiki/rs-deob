import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class751 extends class278 {

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "I")
    private int field10428 = -1;

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "Lrea;")
    private class205 field10442;

    @OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
    private int field10441;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "[[B")
    private byte[][] field10421;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "[[B")
    private byte[][] field10438;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "F")
    private float field10423;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "F")
    private float field10426;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "F")
    private float field10427;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "F")
    private float field10429;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "F")
    private float field10430;

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "F")
    private float field10431;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "F")
    private float field10432;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "F")
    private float field10433;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "F")
    private float field10434;

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "F")
    private float field10436;

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "F")
    private float field10437;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "F")
    private float field10439;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "[[Lmt;")
    private class396[][] field10424;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "[[Lnr;")
    private class57[][] field10425;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "[[Let;")
    private class594[][] field10422;

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "[[Lgo;")
    private class627[][] field10440;

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "[[Lcc;")
    private class730[][] field10435;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)V")
    private final void method4172(int arg0, int arg1, int arg2) {
        class722 var4 = this.field10442.method1263(Thread.currentThread());
        var4.field10056.field8444 = 0;
        if (this.field10435 != null) {
            this.method4174(arg0, arg1, var4.field10017, var4, var4.field10056, var4.field10027, var4.field10040, var4.field10032, var4.field10042, arg2);
        } else if (this.field10440 != null) {
            this.method4173(arg0, arg1, var4.field10056, var4.field10027, var4.field10040, var4.field10032, var4.field10042, arg2);
        } else {
            if (this.field10422 != null) {
                this.method4179(arg0, arg1, var4.field10017, var4, var4.field10056, var4.field10027, var4.field10040, var4.field10032, var4.field10042, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILqs;[I[I[I[II)V")
    private final void method4173(int arg0, int arg1, class602 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class627 var9 = this.field10440[arg0][arg1];
        if (var9 != null) {
            if ((var9.field8705 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field8705 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3925 * arg0;
                int var11 = super.field3925 + var10;
                int var12 = super.field3925 * arg1;
                int var13 = super.field3925 + var12;
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
                if ((var9.field8705 & 1) != 0) {
                    int var14 = super.field3932[arg0][arg1];
                    float var15 = (float) var14 * this.field10429;
                    if (this.field10428 == -1) {
                        var16 = (float) var12 * this.field10426 + (float) var10 * this.field10431 + var15 + this.field10432;
                        if (var16 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var17 = (float) var12 * this.field10426 + (float) var11 * this.field10431 + var15 + this.field10432;
                        if (var17 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var18 = (float) var13 * this.field10426 + (float) var11 * this.field10431 + var15 + this.field10432;
                        if (var18 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var19 = (float) var13 * this.field10426 + (float) var10 * this.field10431 + var15 + this.field10432;
                        if (var19 <= (float) this.field10442.field2696) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field10426 + (float) var10 * this.field10431 + var15 + this.field10432;
                        var17 = (float) var12 * this.field10426 + (float) var11 * this.field10431 + var15 + this.field10432;
                        var18 = (float) var13 * this.field10426 + (float) var11 * this.field10431 + var15 + this.field10432;
                        var19 = (float) var13 * this.field10426 + (float) var10 * this.field10431 + var15 + this.field10432;
                    }
                    float var20 = (float) var14 * this.field10433;
                    float var21 = (float) var14 * this.field10436;
                    if (this.field10428 == -1) {
                        float var22 = (float) var12 * this.field10423 + (float) var10 * this.field10430 + var20 + this.field10439;
                        var23 = (int) ((float) this.field10442.field2711 * var22 / var16) + arg2.field8440;
                        float var24 = (float) var12 * this.field10434 + (float) var10 * this.field10427 + var21 + this.field10437;
                        var25 = (int) ((float) this.field10442.field2701 * var24 / var16) + arg2.field8447;
                        float var26 = (float) var12 * this.field10423 + (float) var11 * this.field10430 + var20 + this.field10439;
                        var27 = (int) ((float) this.field10442.field2711 * var26 / var17) + arg2.field8440;
                        float var28 = (float) var12 * this.field10434 + (float) var11 * this.field10427 + var21 + this.field10437;
                        var29 = (int) ((float) this.field10442.field2701 * var28 / var17) + arg2.field8447;
                        float var30 = (float) var13 * this.field10423 + (float) var11 * this.field10430 + var20 + this.field10439;
                        var31 = (int) ((float) this.field10442.field2711 * var30 / var18) + arg2.field8440;
                        float var32 = (float) var13 * this.field10434 + (float) var11 * this.field10427 + var21 + this.field10437;
                        var33 = (int) ((float) this.field10442.field2701 * var32 / var18) + arg2.field8447;
                        float var34 = (float) var13 * this.field10423 + (float) var10 * this.field10430 + var20 + this.field10439;
                        var35 = (int) ((float) this.field10442.field2711 * var34 / var19) + arg2.field8440;
                        float var36 = (float) var13 * this.field10434 + (float) var10 * this.field10427 + var21 + this.field10437;
                        var37 = (int) ((float) this.field10442.field2701 * var36 / var19) + arg2.field8447;
                    } else {
                        float var38 = (float) var12 * this.field10423 + (float) var10 * this.field10430 + var20 + this.field10439;
                        var23 = (int) ((float) this.field10442.field2711 * var38 / (float) this.field10428) + arg2.field8440;
                        float var39 = (float) var12 * this.field10434 + (float) var10 * this.field10427 + var21 + this.field10437;
                        var25 = (int) ((float) this.field10442.field2701 * var39 / (float) this.field10428) + arg2.field8447;
                        float var40 = (float) var12 * this.field10423 + (float) var11 * this.field10430 + var20 + this.field10439;
                        var27 = (int) ((float) this.field10442.field2711 * var40 / (float) this.field10428) + arg2.field8440;
                        float var41 = (float) var12 * this.field10434 + (float) var11 * this.field10427 + var21 + this.field10437;
                        var29 = (int) ((float) this.field10442.field2701 * var41 / (float) this.field10428) + arg2.field8447;
                        float var42 = (float) var13 * this.field10423 + (float) var11 * this.field10430 + var20 + this.field10439;
                        var31 = (int) ((float) this.field10442.field2711 * var42 / (float) this.field10428) + arg2.field8440;
                        float var43 = (float) var13 * this.field10434 + (float) var11 * this.field10427 + var21 + this.field10437;
                        var33 = (int) ((float) this.field10442.field2701 * var43 / (float) this.field10428) + arg2.field8447;
                        float var44 = (float) var13 * this.field10423 + (float) var10 * this.field10430 + var20 + this.field10439;
                        var35 = (int) ((float) this.field10442.field2711 * var44 / (float) this.field10428) + arg2.field8440;
                        float var45 = (float) var13 * this.field10434 + (float) var10 * this.field10427 + var21 + this.field10437;
                        var37 = (int) ((float) this.field10442.field2701 * var45 / (float) this.field10428) + arg2.field8447;
                    }
                } else {
                    int var46 = super.field3932[arg0][arg1];
                    int var47 = super.field3932[arg0 + 1][arg1];
                    int var48 = super.field3932[arg0 + 1][arg1 + 1];
                    int var49 = super.field3932[arg0][arg1 + 1];
                    if (this.field10428 == -1) {
                        var16 = (float) var12 * this.field10426 + (float) var10 * this.field10431 + (float) var46 * this.field10429 + this.field10432;
                        if (var16 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var17 = (float) var12 * this.field10426 + (float) var11 * this.field10431 + (float) var47 * this.field10429 + this.field10432;
                        if (var17 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var18 = (float) var13 * this.field10426 + (float) var11 * this.field10431 + (float) var48 * this.field10429 + this.field10432;
                        if (var18 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var19 = (float) var13 * this.field10426 + (float) var10 * this.field10431 + (float) var49 * this.field10429 + this.field10432;
                        if (var19 <= (float) this.field10442.field2696) {
                            return;
                        }
                        float var50 = (float) var12 * this.field10423 + (float) var10 * this.field10430 + (float) var46 * this.field10433 + this.field10439;
                        var23 = (int) ((float) this.field10442.field2711 * var50 / var16) + arg2.field8440;
                        float var51 = (float) var12 * this.field10434 + (float) var10 * this.field10427 + (float) var46 * this.field10436 + this.field10437;
                        var25 = (int) ((float) this.field10442.field2701 * var51 / var16) + arg2.field8447;
                        float var52 = (float) var12 * this.field10423 + (float) var11 * this.field10430 + (float) var47 * this.field10433 + this.field10439;
                        var27 = (int) ((float) this.field10442.field2711 * var52 / var17) + arg2.field8440;
                        float var53 = (float) var12 * this.field10434 + (float) var11 * this.field10427 + (float) var47 * this.field10436 + this.field10437;
                        var29 = (int) ((float) this.field10442.field2701 * var53 / var17) + arg2.field8447;
                        float var54 = (float) var13 * this.field10423 + (float) var11 * this.field10430 + (float) var48 * this.field10433 + this.field10439;
                        var31 = (int) ((float) this.field10442.field2711 * var54 / var18) + arg2.field8440;
                        float var55 = (float) var13 * this.field10434 + (float) var11 * this.field10427 + (float) var48 * this.field10436 + this.field10437;
                        var33 = (int) ((float) this.field10442.field2701 * var55 / var18) + arg2.field8447;
                        float var56 = (float) var13 * this.field10423 + (float) var10 * this.field10430 + (float) var49 * this.field10433 + this.field10439;
                        var35 = (int) ((float) this.field10442.field2711 * var56 / var19) + arg2.field8440;
                        float var57 = (float) var13 * this.field10434 + (float) var10 * this.field10427 + (float) var49 * this.field10436 + this.field10437;
                        var37 = (int) ((float) this.field10442.field2701 * var57 / var19) + arg2.field8447;
                    } else {
                        var16 = (float) var12 * this.field10426 + (float) var10 * this.field10431 + (float) var46 * this.field10429 + this.field10432;
                        var17 = (float) var12 * this.field10426 + (float) var11 * this.field10431 + (float) var47 * this.field10429 + this.field10432;
                        var18 = (float) var13 * this.field10426 + (float) var11 * this.field10431 + (float) var48 * this.field10429 + this.field10432;
                        var19 = (float) var13 * this.field10426 + (float) var10 * this.field10431 + (float) var49 * this.field10429 + this.field10432;
                        float var58 = (float) var12 * this.field10423 + (float) var10 * this.field10430 + (float) var46 * this.field10433 + this.field10439;
                        var23 = (int) ((float) this.field10442.field2711 * var58 / (float) this.field10428) + arg2.field8440;
                        float var59 = (float) var12 * this.field10434 + (float) var10 * this.field10427 + (float) var46 * this.field10436 + this.field10437;
                        var25 = (int) ((float) this.field10442.field2701 * var59 / (float) this.field10428) + arg2.field8447;
                        float var60 = (float) var12 * this.field10423 + (float) var11 * this.field10430 + (float) var47 * this.field10433 + this.field10439;
                        var27 = (int) ((float) this.field10442.field2711 * var60 / (float) this.field10428) + arg2.field8440;
                        float var61 = (float) var12 * this.field10434 + (float) var11 * this.field10427 + (float) var47 * this.field10436 + this.field10437;
                        var29 = (int) ((float) this.field10442.field2701 * var61 / (float) this.field10428) + arg2.field8447;
                        float var62 = (float) var13 * this.field10423 + (float) var11 * this.field10430 + (float) var48 * this.field10433 + this.field10439;
                        var31 = (int) ((float) this.field10442.field2711 * var62 / (float) this.field10428) + arg2.field8440;
                        float var63 = (float) var13 * this.field10434 + (float) var11 * this.field10427 + (float) var48 * this.field10436 + this.field10437;
                        var33 = (int) ((float) this.field10442.field2701 * var63 / (float) this.field10428) + arg2.field8447;
                        float var64 = (float) var13 * this.field10423 + (float) var10 * this.field10430 + (float) var49 * this.field10433 + this.field10439;
                        var35 = (int) ((float) this.field10442.field2711 * var64 / (float) this.field10428) + arg2.field8440;
                        float var65 = (float) var13 * this.field10434 + (float) var10 * this.field10427 + (float) var49 * this.field10436 + this.field10437;
                        var37 = (int) ((float) this.field10442.field2701 * var65 / (float) this.field10428) + arg2.field8447;
                    }
                }
                if (this.field10428 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field8448 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8442 || var35 > arg2.field8442 || var27 > arg2.field8442;
                        if (var9.field8706 >= 0) {
                            arg2.method3385((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class2.field23[var9.field8709 & 65535] & 16777215, -16777216 | class2.field23[var9.field8704 & 65535] & 16777215, -16777216 | class2.field23[var9.field8708 & 65535] & 16777215, 0, 0, 0, 0, var9.field8706);
                        } else {
                            arg2.method3381((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field8709 & 65535), (float) (var9.field8704 & 65535), (float) (var9.field8708 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field8448 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8442 || var27 > arg2.field8442 || var35 > arg2.field8442;
                        if (var9.field8706 >= 0) {
                            arg2.method3385((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class2.field23[var9.field8710 & 65535] & 16777215, -16777216 | class2.field23[var9.field8708 & 65535] & 16777215, -16777216 | class2.field23[var9.field8704 & 65535] & 16777215, 0, 0, 0, 0, var9.field8706);
                            return;
                        }
                        arg2.method3381((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field8710 & 65535), (float) (var9.field8708 & 65535), (float) (var9.field8704 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field8448 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8442 || var35 > arg2.field8442 || var27 > arg2.field8442;
                        if (var9.field8706 >= 0) {
                            arg2.method3385((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class2.field23[var9.field8709 & 65535] & 16777215, -16777216 | class2.field23[var9.field8704 & 65535] & 16777215, -16777216 | class2.field23[var9.field8708 & 65535] & 16777215, 0, 0, 0, 0, var9.field8706);
                        } else {
                            arg2.method3381((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field8709 & 65535), (float) (var9.field8704 & 65535), (float) (var9.field8708 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field8448 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8442 || var27 > arg2.field8442 || var35 > arg2.field8442;
                        if (var9.field8706 >= 0) {
                            arg2.method3385((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class2.field23[var9.field8710 & 65535] & 16777215, -16777216 | class2.field23[var9.field8708 & 65535] & 16777215, -16777216 | class2.field23[var9.field8704 & 65535] & 16777215, 0, 0, 0, 0, var9.field8706);
                            return;
                        }
                        arg2.method3381((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field8710 & 65535), (float) (var9.field8708 & 65535), (float) (var9.field8704 & 65535));
                    }
                }
            }
        } else {
            class57 var66 = this.field10425[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field698 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field10428 == -1) {
                    for (int var67 = 0; var67 < var66.field689; ++var67) {
                        int var68 = (arg0 << super.field3929) + var66.field688[var67];
                        short var69 = var66.field695[var67];
                        int var70 = (arg1 << super.field3929) + var66.field686[var67];
                        float var71 = (float) var70 * this.field10426 + (float) var68 * this.field10431 + (float) var69 * this.field10429 + this.field10432;
                        if (var71 <= (float) this.field10442.field2696) {
                            return;
                        }
                        float var72 = (float) var70 * this.field10423 + (float) var68 * this.field10430 + (float) var69 * this.field10433 + this.field10439;
                        float var73 = (float) var70 * this.field10434 + (float) var68 * this.field10427 + (float) var69 * this.field10436 + this.field10437;
                        arg3[var67] = (int) ((float) this.field10442.field2711 * var72 / var71) + arg2.field8440;
                        arg4[var67] = (int) ((float) this.field10442.field2701 * var73 / var71) + arg2.field8447;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field689; ++var74) {
                        int var110 = (arg0 << super.field3929) + var66.field688[var74];
                        short var111 = var66.field695[var74];
                        int var112 = (arg1 << super.field3929) + var66.field686[var74];
                        float var113 = (float) var112 * this.field10426 + (float) var110 * this.field10431 + (float) var111 * this.field10429 + this.field10432;
                        float var114 = (float) var112 * this.field10423 + (float) var110 * this.field10430 + (float) var111 * this.field10433 + this.field10439;
                        float var115 = (float) var112 * this.field10434 + (float) var110 * this.field10427 + (float) var111 * this.field10436 + this.field10437;
                        arg3[var74] = (int) ((float) this.field10442.field2711 * var114 / (float) this.field10428) + arg2.field8440;
                        arg4[var74] = (int) ((float) this.field10442.field2701 * var115 / (float) this.field10428) + arg2.field8447;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field693 != null) {
                    if (this.field10428 == -1) {
                        for (int var75 = 0; var75 < var66.field690; ++var75) {
                            short var76 = var66.field699[var75];
                            short var77 = var66.field697[var75];
                            short var78 = var66.field696[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field8448 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field8442 || var80 > arg2.field8442 || var81 > arg2.field8442;
                                short var85 = var66.field693[var75];
                                if (var85 != -1) {
                                    arg2.method3385((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field688[var76] / (float) super.field3925, (float) var66.field688[var77] / (float) super.field3925, (float) var66.field688[var78] / (float) super.field3925, (float) var66.field686[var76] / (float) super.field3925, (float) var66.field686[var77] / (float) super.field3925, (float) var66.field686[var78] / (float) super.field3925, -16777216 | class2.field23[var66.field692[var76] & 65535] & 16777215, -16777216 | class2.field23[var66.field692[var77] & 65535] & 16777215, -16777216 | class2.field23[var66.field692[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field694[var75];
                                    if (var86 != -1) {
                                        arg2.method3381((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class61.method527(var66.field692[var76], var86, (byte) -127), (float) class61.method527(var66.field692[var77], var86, (byte) -115), (float) class61.method527(var66.field692[var78], var86, (byte) -101));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field690; ++var87) {
                        short var88 = var66.field699[var87];
                        short var89 = var66.field697[var87];
                        short var90 = var66.field696[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field8448 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field8442 || var92 > arg2.field8442 || var93 > arg2.field8442;
                            short var97 = var66.field693[var87];
                            if (var97 != -1) {
                                arg2.method3385((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field688[var88] / (float) super.field3925, (float) var66.field688[var89] / (float) super.field3925, (float) var66.field688[var90] / (float) super.field3925, (float) var66.field686[var88] / (float) super.field3925, (float) var66.field686[var89] / (float) super.field3925, (float) var66.field686[var90] / (float) super.field3925, -16777216 | class2.field23[var66.field692[var88] & 65535] & 16777215, -16777216 | class2.field23[var66.field692[var89] & 65535] & 16777215, -16777216 | class2.field23[var66.field692[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field694[var87];
                                if (var98 != -1) {
                                    arg2.method3381((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class61.method527(var66.field692[var88], var98, (byte) -100), (float) class61.method527(var66.field692[var89], var98, (byte) -84), (float) class61.method527(var66.field692[var90], var98, (byte) -86));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field690; ++var99) {
                    short var100 = var66.field699[var99];
                    short var101 = var66.field697[var99];
                    short var102 = var66.field696[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field694[var99];
                        if (var109 != -1) {
                            arg2.field8448 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field8442 || var104 > arg2.field8442 || var105 > arg2.field8442;
                            arg2.method3381((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class61.method527(var66.field692[var100], var109, (byte) -89), (float) class61.method527(var66.field692[var101], var109, (byte) -96), (float) class61.method527(var66.field692[var102], var109, (byte) -71));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class722 var9 = this.field10442.method1263(Thread.currentThread());
        class602 var10 = var9.field10056;
        var10.field8444 = 0;
        var10.field8448 = true;
        this.field10442.method440();
        if (this.field10435 == null && this.field10422 == null) {
            if (this.field10440 != null) {
                this.method4177(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field10027, var9.field10040);
            }
        } else {
            this.method4175(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field10027, var9.field10040);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V")
    public final void method1812(int arg0, int arg1) {
        this.method4172(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lrea;IIII[[I[[II)V")
    public class751(class205 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field10442 = arg0;
        this.field10441 = arg2;
        this.field10421 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field10442.field2681 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field10442.field2676 * var18 + this.field10442.field2706 * var16 + this.field10442.field2685 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field10421[var11][var10] = (byte) var20;
            }
        }
        this.field10438 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1825(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field10440 == null) {
            this.field10440 = new class627[super.field3935][super.field3930];
            this.field10425 = new class57[super.field3935][super.field3930];
        } else if (this.field10435 != null || this.field10422 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3925 != var20 || var21 != 0 && super.field3925 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class57 var22 = new class57();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field689 = var23;
            var22.field692 = new short[var23];
            var22.field688 = new short[var23];
            var22.field695 = new short[var23];
            var22.field686 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field692[var25] = (short) (this.field10421[arg0][arg1] - this.field10438[arg0][arg1]);
                } else if (var32 == 0 && super.field3925 == var33) {
                    var22.field692[var25] = (short) (this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]);
                } else if (super.field3925 == var32 && super.field3925 == var33) {
                    var22.field692[var25] = (short) (this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]);
                } else if (super.field3925 == var32 && var33 == 0) {
                    var22.field692[var25] = (short) (this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]) * var32 + (this.field10421[arg0][arg1] - this.field10438[arg0][arg1]) * (super.field3925 - var32);
                    int var35 = (this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]) * var32 + (this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]) * (super.field3925 - var32);
                    var22.field692[var25] = (short) ((super.field3925 - var33) * var34 + var33 * var35 >> super.field3929 * 2);
                }
                int var36 = (arg0 << super.field3929) + var32;
                int var37 = (arg1 << super.field3929) + var33;
                var22.field688[var25] = (short) var32;
                var22.field686[var25] = (short) var33;
                var22.field695[var25] = (short) (this.method1815(var37, var36, 23) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field692[var25] < 2) {
                    var22.field692[var25] = 2;
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
                    class502 var31 = this.field10442.field715.method532((byte) 127, var30);
                    if (!var31.field7194) {
                        var26 = true;
                        if (this.method4178(var31.field7204) || var31.field7207 != 0 || var31.field7193 != 0) {
                            var22.field698 = (byte) (var22.field698 | 4);
                        }
                    }
                }
            }
            var22.field694 = new int[var27];
            if (arg10 != null) {
                var22.field691 = new int[var27];
            }
            var22.field699 = new short[var27];
            var22.field697 = new short[var27];
            var22.field696 = new short[var27];
            if (var26) {
                var22.field693 = new short[var27];
                var22.field687 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field694[var22.field690] = class199.method1219(0, arg9[var29]);
                    } else {
                        var22.field694[var22.field690] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field691[var22.field690] = class199.method1219(0, arg10[var29]);
                        } else {
                            var22.field691[var22.field690] = -1;
                        }
                    }
                    var22.field699[var22.field690] = (short) arg6[var29];
                    var22.field697[var22.field690] = (short) arg7[var29];
                    var22.field696[var22.field690] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field10442.field715.method532((byte) 127, arg11[var29]).field7194) {
                            var22.field693[var22.field690] = (short) arg11[var29];
                            var22.field687[var22.field690] = (short) arg12[var29];
                        } else {
                            var22.field693[var22.field690] = -1;
                        }
                    }
                    ++var22.field690;
                }
            }
            this.field10425[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class627 var38 = new class627();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field8707 = class61.method527(this.field10421[arg0][arg1] - this.field10438[arg0][arg1], class199.method1219(0, arg10[0]), (byte) -83);
                    if (var39 == -1) {
                        var38.field8705 = (byte) (var38.field8705 | 2);
                    }
                }
                if (super.field3932[arg0 + 1][arg1] == super.field3932[arg0][arg1] && super.field3932[arg0 + 1][arg1 + 1] == super.field3932[arg0][arg1] && super.field3932[arg0][arg1 + 1] == super.field3932[arg0][arg1]) {
                    var38.field8705 = (byte) (var38.field8705 | 1);
                }
                class502 var41 = null;
                if (var40 != -1) {
                    var41 = this.field10442.field715.method532((byte) 127, var40);
                }
                if (var41 != null && (var38.field8705 & 2) == 0 && !var41.field7194) {
                    var38.field8710 = (short) (this.field10421[arg0][arg1] - this.field10438[arg0][arg1]);
                    var38.field8708 = (short) (this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]);
                    var38.field8709 = (short) (this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]);
                    var38.field8704 = (short) (this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]);
                    var38.field8706 = (short) var40;
                    if (this.method4178(var41.field7204) || var41.field7207 != 0 || var41.field7193 != 0) {
                        var38.field8705 = (byte) (var38.field8705 | 4);
                    }
                } else {
                    short var42 = class199.method1219(0, var39);
                    var38.field8710 = (short) class61.method527(this.field10421[arg0][arg1] - this.field10438[arg0][arg1], var42, (byte) -91);
                    var38.field8708 = (short) class61.method527(this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1], var42, (byte) -128);
                    var38.field8709 = (short) class61.method527(this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1], var42, (byte) -73);
                    var38.field8704 = (short) class61.method527(this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1], var42, (byte) -123);
                    var38.field8706 = -1;
                }
                this.field10440[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIZLwn;Lqs;[I[I[I[II)V")
    private final void method4174(int arg0, int arg1, boolean arg2, class722 arg3, class602 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class730 var11 = this.field10435[arg0][arg1];
        if (var11 != null) {
            if ((var11.field10195 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field10195 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3925 * arg0;
                int var13 = super.field3925 + var12;
                int var14 = super.field3925 * arg1;
                int var15 = super.field3925 + var14;
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
                if ((var11.field10195 & 1) != 0 && !arg2) {
                    int var20 = super.field3932[arg0][arg1];
                    float var21 = (float) var20 * this.field10429;
                    if (this.field10428 == -1) {
                        var22 = (float) var14 * this.field10426 + (float) var12 * this.field10431 + var21 + this.field10432;
                        if (var22 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var23 = (float) var14 * this.field10426 + (float) var13 * this.field10431 + var21 + this.field10432;
                        if (var23 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var24 = (float) var15 * this.field10426 + (float) var13 * this.field10431 + var21 + this.field10432;
                        if (var24 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var25 = (float) var15 * this.field10426 + (float) var12 * this.field10431 + var21 + this.field10432;
                        if (var25 <= (float) this.field10442.field2696) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field10426 + (float) var12 * this.field10431 + var21 + this.field10432;
                        var23 = (float) var14 * this.field10426 + (float) var13 * this.field10431 + var21 + this.field10432;
                        var24 = (float) var15 * this.field10426 + (float) var13 * this.field10431 + var21 + this.field10432;
                        var25 = (float) var15 * this.field10426 + (float) var12 * this.field10431 + var21 + this.field10432;
                    }
                    if (arg3.field10012) {
                        int var26 = (int) (var22 - (float) arg3.field10013);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field10013);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field10013);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field10013);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field10433;
                    float var31 = (float) var20 * this.field10436;
                    if (this.field10428 == -1) {
                        float var32 = (float) var14 * this.field10423 + (float) var12 * this.field10430 + var30 + this.field10439;
                        var33 = (int) ((float) this.field10442.field2711 * var32 / var22) + arg4.field8440;
                        float var34 = (float) var14 * this.field10434 + (float) var12 * this.field10427 + var31 + this.field10437;
                        var35 = (int) ((float) this.field10442.field2701 * var34 / var22) + arg4.field8447;
                        float var36 = (float) var14 * this.field10423 + (float) var13 * this.field10430 + var30 + this.field10439;
                        var37 = (int) ((float) this.field10442.field2711 * var36 / var23) + arg4.field8440;
                        float var38 = (float) var14 * this.field10434 + (float) var13 * this.field10427 + var31 + this.field10437;
                        var39 = (int) ((float) this.field10442.field2701 * var38 / var23) + arg4.field8447;
                        float var40 = (float) var15 * this.field10423 + (float) var13 * this.field10430 + var30 + this.field10439;
                        var41 = (int) ((float) this.field10442.field2711 * var40 / var24) + arg4.field8440;
                        float var42 = (float) var15 * this.field10434 + (float) var13 * this.field10427 + var31 + this.field10437;
                        var43 = (int) ((float) this.field10442.field2701 * var42 / var24) + arg4.field8447;
                        float var44 = (float) var15 * this.field10423 + (float) var12 * this.field10430 + var30 + this.field10439;
                        var45 = (int) ((float) this.field10442.field2711 * var44 / var25) + arg4.field8440;
                        float var46 = (float) var15 * this.field10434 + (float) var12 * this.field10427 + var31 + this.field10437;
                        var47 = (int) ((float) this.field10442.field2701 * var46 / var25) + arg4.field8447;
                    } else {
                        float var48 = (float) var14 * this.field10423 + (float) var12 * this.field10430 + var30 + this.field10439;
                        var33 = (int) ((float) this.field10442.field2711 * var48 / (float) this.field10428) + arg4.field8440;
                        float var49 = (float) var14 * this.field10434 + (float) var12 * this.field10427 + var31 + this.field10437;
                        var35 = (int) ((float) this.field10442.field2701 * var49 / (float) this.field10428) + arg4.field8447;
                        float var50 = (float) var14 * this.field10423 + (float) var13 * this.field10430 + var30 + this.field10439;
                        var37 = (int) ((float) this.field10442.field2711 * var50 / (float) this.field10428) + arg4.field8440;
                        float var51 = (float) var14 * this.field10434 + (float) var13 * this.field10427 + var31 + this.field10437;
                        var39 = (int) ((float) this.field10442.field2701 * var51 / (float) this.field10428) + arg4.field8447;
                        float var52 = (float) var15 * this.field10423 + (float) var13 * this.field10430 + var30 + this.field10439;
                        var41 = (int) ((float) this.field10442.field2711 * var52 / (float) this.field10428) + arg4.field8440;
                        float var53 = (float) var15 * this.field10434 + (float) var13 * this.field10427 + var31 + this.field10437;
                        var43 = (int) ((float) this.field10442.field2701 * var53 / (float) this.field10428) + arg4.field8447;
                        float var54 = (float) var15 * this.field10423 + (float) var12 * this.field10430 + var30 + this.field10439;
                        var45 = (int) ((float) this.field10442.field2711 * var54 / (float) this.field10428) + arg4.field8440;
                        float var55 = (float) var15 * this.field10434 + (float) var12 * this.field10427 + var31 + this.field10437;
                        var47 = (int) ((float) this.field10442.field2701 * var55 / (float) this.field10428) + arg4.field8447;
                    }
                } else {
                    int var56 = super.field3932[arg0][arg1];
                    int var57 = super.field3932[arg0 + 1][arg1];
                    int var58 = super.field3932[arg0 + 1][arg1 + 1];
                    int var59 = super.field3932[arg0][arg1 + 1];
                    if (this.field10428 == -1) {
                        var22 = (float) var14 * this.field10426 + (float) var12 * this.field10431 + (float) var56 * this.field10429 + this.field10432;
                        if (var22 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var23 = (float) var14 * this.field10426 + (float) var13 * this.field10431 + (float) var57 * this.field10429 + this.field10432;
                        if (var23 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var24 = (float) var15 * this.field10426 + (float) var13 * this.field10431 + (float) var58 * this.field10429 + this.field10432;
                        if (var24 <= (float) this.field10442.field2696) {
                            return;
                        }
                        var25 = (float) var15 * this.field10426 + (float) var12 * this.field10431 + (float) var59 * this.field10429 + this.field10432;
                        if (var25 <= (float) this.field10442.field2696) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field10426 + (float) var12 * this.field10431 + (float) var56 * this.field10429 + this.field10432;
                        var23 = (float) var14 * this.field10426 + (float) var13 * this.field10431 + (float) var57 * this.field10429 + this.field10432;
                        var24 = (float) var15 * this.field10426 + (float) var13 * this.field10431 + (float) var58 * this.field10429 + this.field10432;
                        var25 = (float) var15 * this.field10426 + (float) var12 * this.field10431 + (float) var59 * this.field10429 + this.field10432;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field10013);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field10193 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field10013);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field10200 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field10013);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field10201 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field10013);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field10194 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field10012) {
                        int var68 = (int) (var22 - (float) arg3.field10013);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field10013);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field10013);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field10013);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field10428 == -1) {
                        float var72 = (float) var14 * this.field10423 + (float) var12 * this.field10430 + (float) var56 * this.field10433 + this.field10439;
                        var33 = (int) ((float) this.field10442.field2711 * var72 / var22) + arg4.field8440;
                        float var73 = (float) var14 * this.field10434 + (float) var12 * this.field10427 + (float) var56 * this.field10436 + this.field10437;
                        var35 = (int) ((float) this.field10442.field2701 * var73 / var22) + arg4.field8447;
                        float var74 = (float) var14 * this.field10423 + (float) var13 * this.field10430 + (float) var57 * this.field10433 + this.field10439;
                        var37 = (int) ((float) this.field10442.field2711 * var74 / var23) + arg4.field8440;
                        float var75 = (float) var14 * this.field10434 + (float) var13 * this.field10427 + (float) var57 * this.field10436 + this.field10437;
                        var39 = (int) ((float) this.field10442.field2701 * var75 / var23) + arg4.field8447;
                        float var76 = (float) var15 * this.field10423 + (float) var13 * this.field10430 + (float) var58 * this.field10433 + this.field10439;
                        var41 = (int) ((float) this.field10442.field2711 * var76 / var24) + arg4.field8440;
                        float var77 = (float) var15 * this.field10434 + (float) var13 * this.field10427 + (float) var58 * this.field10436 + this.field10437;
                        var43 = (int) ((float) this.field10442.field2701 * var77 / var24) + arg4.field8447;
                        float var78 = (float) var15 * this.field10423 + (float) var12 * this.field10430 + (float) var59 * this.field10433 + this.field10439;
                        var45 = (int) ((float) this.field10442.field2711 * var78 / var25) + arg4.field8440;
                        float var79 = (float) var15 * this.field10434 + (float) var12 * this.field10427 + (float) var59 * this.field10436 + this.field10437;
                        var47 = (int) ((float) this.field10442.field2701 * var79 / var25) + arg4.field8447;
                    } else {
                        float var80 = (float) var14 * this.field10423 + (float) var12 * this.field10430 + (float) var56 * this.field10433 + this.field10439;
                        var33 = (int) ((float) this.field10442.field2711 * var80 / (float) this.field10428) + arg4.field8440;
                        float var81 = (float) var14 * this.field10434 + (float) var12 * this.field10427 + (float) var56 * this.field10436 + this.field10437;
                        var35 = (int) ((float) this.field10442.field2701 * var81 / (float) this.field10428) + arg4.field8447;
                        float var82 = (float) var14 * this.field10423 + (float) var13 * this.field10430 + (float) var57 * this.field10433 + this.field10439;
                        var37 = (int) ((float) this.field10442.field2711 * var82 / (float) this.field10428) + arg4.field8440;
                        float var83 = (float) var14 * this.field10434 + (float) var13 * this.field10427 + (float) var57 * this.field10436 + this.field10437;
                        var39 = (int) ((float) this.field10442.field2701 * var83 / (float) this.field10428) + arg4.field8447;
                        float var84 = (float) var15 * this.field10423 + (float) var13 * this.field10430 + (float) var58 * this.field10433 + this.field10439;
                        var41 = (int) ((float) this.field10442.field2711 * var84 / (float) this.field10428) + arg4.field8440;
                        float var85 = (float) var15 * this.field10434 + (float) var13 * this.field10427 + (float) var58 * this.field10436 + this.field10437;
                        var43 = (int) ((float) this.field10442.field2701 * var85 / (float) this.field10428) + arg4.field8447;
                        float var86 = (float) var15 * this.field10423 + (float) var12 * this.field10430 + (float) var59 * this.field10433 + this.field10439;
                        var45 = (int) ((float) this.field10442.field2711 * var86 / (float) this.field10428) + arg4.field8440;
                        float var87 = (float) var15 * this.field10434 + (float) var12 * this.field10427 + (float) var59 * this.field10436 + this.field10437;
                        var47 = (int) ((float) this.field10442.field2701 * var87 / (float) this.field10428) + arg4.field8447;
                    }
                }
                boolean var88 = var11.field10196 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var11.field10196).field7204);
                if (this.field10428 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field8448 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8442 || var45 > arg4.field8442 || var37 > arg4.field8442;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field10196 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method3385((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field10192 & 16777215, var90 | var11.field10197 & 16777215, var90 | var11.field10198 & 16777215, arg3.field10015, var18, var19, var17, var11.field10196);
                                } else {
                                    if (var88) {
                                        arg4.field8444 = 100;
                                    }
                                    arg4.method3380((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class503.method2983(var11.field10192, 109, var18 << 24 | arg3.field10015), class503.method2983(var11.field10197, 100, var19 << 24 | arg3.field10015), class503.method2983(var11.field10198, -91, var17 << 24 | arg3.field10015));
                                    arg4.field8444 = 0;
                                }
                            } else if (var11.field10196 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method3385((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field10192 & 16777215, var91 | var11.field10197 & 16777215, var91 | var11.field10198 & 16777215, 0, 0, 0, 0, var11.field10196);
                            } else {
                                if (var88) {
                                    arg4.field8444 = 100;
                                }
                                arg4.method3380((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field10192, var11.field10197, var11.field10198);
                                arg4.field8444 = 0;
                            }
                        } else {
                            arg4.method3374((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field10015);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field8448 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8442 || var37 > arg4.field8442 || var45 > arg4.field8442;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field8444 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field10196 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method3385((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field10202 & 16777215, var93 | var11.field10198 & 16777215, var93 | var11.field10197 & 16777215, arg3.field10015, var16, var17, var19, var11.field10196);
                                    return;
                                }
                                if (var88) {
                                    arg4.field8444 = 100;
                                }
                                arg4.method3380((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class503.method2983(var11.field10202, 108, var16 << 24 | arg3.field10015), class503.method2983(var11.field10198, 93, var17 << 24 | arg3.field10015), class503.method2983(var11.field10197, 127, var19 << 24 | arg3.field10015));
                                arg4.field8444 = 0;
                                return;
                            }
                            if (var11.field10196 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method3385((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field10202 & 16777215, var94 | var11.field10198 & 16777215, var94 | var11.field10197 & 16777215, 0, 0, 0, 0, var11.field10196);
                                return;
                            }
                            if (var88) {
                                arg4.field8444 = 100;
                            }
                            arg4.method3380((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field10202, var11.field10198, var11.field10197);
                            arg4.field8444 = 0;
                            return;
                        }
                        arg4.method3374((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field10015);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field8448 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8442 || var45 > arg4.field8442 || var37 > arg4.field8442;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field8444 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field10196 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method3385((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field10192 & 16777215, var96 | var11.field10197 & 16777215, var96 | var11.field10198 & 16777215, arg3.field10015, var18, var19, var17, var11.field10196);
                                } else {
                                    if (var88) {
                                        arg4.field8444 = 100;
                                    }
                                    arg4.method3380((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class503.method2983(var11.field10192, 112, var18 << 24 | arg3.field10015), class503.method2983(var11.field10197, -67, var19 << 24 | arg3.field10015), class503.method2983(var11.field10198, 87, var17 << 24 | arg3.field10015));
                                    arg4.field8444 = 0;
                                }
                            } else if (var11.field10196 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method3385((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field10192 & 16777215, var97 | var11.field10197 & 16777215, var97 | var11.field10198 & 16777215, 0, 0, 0, 0, var11.field10196);
                            } else {
                                if (var88) {
                                    arg4.field8444 = 100;
                                }
                                arg4.method3380((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field10192, var11.field10197, var11.field10198);
                                arg4.field8444 = 0;
                            }
                        } else {
                            arg4.method3374((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field10015);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field8448 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8442 || var37 > arg4.field8442 || var45 > arg4.field8442;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field8444 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field10196 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method3385((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field10202 & 16777215, var99 | var11.field10198 & 16777215, var99 | var11.field10197 & 16777215, arg3.field10015, var16, var17, var19, var11.field10196);
                                    return;
                                }
                                if (var88) {
                                    arg4.field8444 = 100;
                                }
                                arg4.method3380((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class503.method2983(var11.field10202, 120, var16 << 24 | arg3.field10015), class503.method2983(var11.field10198, -24, var17 << 24 | arg3.field10015), class503.method2983(var11.field10197, -127, var19 << 24 | arg3.field10015));
                                arg4.field8444 = 0;
                                return;
                            }
                            if (var11.field10196 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method3385((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field10202 & 16777215, var100 | var11.field10198 & 16777215, var100 | var11.field10197 & 16777215, 0, 0, 0, 0, var11.field10196);
                                return;
                            }
                            if (var88) {
                                arg4.field8444 = 100;
                            }
                            arg4.method3380((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field10202, var11.field10198, var11.field10197);
                            arg4.field8444 = 0;
                            return;
                        }
                        arg4.method3374((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field10015);
                    }
                }
            }
        } else {
            class396 var101 = this.field10424[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field5587 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field10428 == -1) {
                    for (int var102 = 0; var102 < var101.field5595; ++var102) {
                        int var103 = (arg0 << super.field3929) + var101.field5590[var102];
                        int var104 = var101.field5594[var102];
                        int var105 = (arg1 << super.field3929) + var101.field5586[var102];
                        float var106 = (float) var105 * this.field10426 + (float) var103 * this.field10431 + (float) var104 * this.field10429 + this.field10432;
                        if (var106 <= (float) this.field10442.field2696) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field10013);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field5592[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field10012) {
                            int var109 = (int) (var106 - (float) arg3.field10013);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field10423 + (float) var103 * this.field10430 + (float) var104 * this.field10433 + this.field10439;
                        float var111 = (float) var105 * this.field10434 + (float) var103 * this.field10427 + (float) var104 * this.field10436 + this.field10437;
                        arg5[var102] = (int) ((float) this.field10442.field2711 * var110 / var106) + arg4.field8440;
                        arg6[var102] = (int) ((float) this.field10442.field2701 * var111 / var106) + arg4.field8447;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field5595; ++var112) {
                        int var152 = (arg0 << super.field3929) + var101.field5590[var112];
                        int var153 = var101.field5594[var112];
                        int var154 = (arg1 << super.field3929) + var101.field5586[var112];
                        float var155 = (float) var154 * this.field10426 + (float) var152 * this.field10431 + (float) var153 * this.field10429 + this.field10432;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field10428 - arg3.field10013;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field5592[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field10012) {
                            int var158 = this.field10428 - arg3.field10013;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field10423 + (float) var152 * this.field10430 + (float) var153 * this.field10433 + this.field10439;
                        float var160 = (float) var154 * this.field10434 + (float) var152 * this.field10427 + (float) var153 * this.field10436 + this.field10437;
                        arg5[var112] = (int) ((float) this.field10442.field2711 * var159 / (float) this.field10428) + arg4.field8440;
                        arg6[var112] = (int) ((float) this.field10442.field2701 * var160 / (float) this.field10428) + arg4.field8447;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field5596 != null) {
                    if (this.field10428 == -1) {
                        for (int var113 = 0; var113 < var101.field5593; ++var113) {
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
                                arg4.field8448 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field8442 || var118 > arg4.field8442 || var119 > arg4.field8442;
                                short var124 = var101.field5596[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var124).field7204)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method3385((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field5590[var114] / (float) super.field3925, (float) var101.field5590[var115] / (float) super.field3925, (float) var101.field5590[var116] / (float) super.field3925, (float) var101.field5586[var114] / (float) super.field3925, (float) var101.field5586[var115] / (float) super.field3925, (float) var101.field5586[var116] / (float) super.field3925, var125 | var101.field5589[var114] & 16777215, var125 | var101.field5589[var115] & 16777215, var125 | var101.field5589[var116] & 16777215, arg3.field10015, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field5589[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var124).field7204)) {
                                                arg4.field8444 = -1694498816;
                                            }
                                            arg4.method3380((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class503.method2983(var101.field5589[var114], 105, arg8[var114] << 24 | arg3.field10015), class503.method2983(var101.field5589[var115], 97, arg8[var115] << 24 | arg3.field10015), class503.method2983(var101.field5589[var116], -38, arg8[var116] << 24 | arg3.field10015));
                                            arg4.field8444 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var124).field7204)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method3385((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field5590[var114] / (float) super.field3925, (float) var101.field5590[var115] / (float) super.field3925, (float) var101.field5590[var116] / (float) super.field3925, (float) var101.field5586[var114] / (float) super.field3925, (float) var101.field5586[var115] / (float) super.field3925, (float) var101.field5586[var116] / (float) super.field3925, var126 | var101.field5589[var114] & 16777215, var126 | var101.field5589[var115] & 16777215, var126 | var101.field5589[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field5589[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var124).field7204)) {
                                            arg4.field8444 = -1694498816;
                                        }
                                        arg4.method3380((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field5589[var114], var101.field5589[var115], var101.field5589[var116]);
                                        arg4.field8444 = 0;
                                    }
                                } else {
                                    arg4.method3374((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field10015);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field5593; ++var127) {
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
                            arg4.field8448 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field8442 || var132 > arg4.field8442 || var133 > arg4.field8442;
                            short var138 = var101.field5596[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var138).field7204)) {
                                    arg4.field8444 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var138).field7204)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method3385((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field5590[var128] / (float) super.field3925, (float) var101.field5590[var129] / (float) super.field3925, (float) var101.field5590[var130] / (float) super.field3925, (float) var101.field5586[var128] / (float) super.field3925, (float) var101.field5586[var129] / (float) super.field3925, (float) var101.field5586[var130] / (float) super.field3925, var139 | var101.field5589[var128] & 16777215, var139 | var101.field5589[var129] & 16777215, var139 | var101.field5589[var130] & 16777215, arg3.field10015, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field5589[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var138).field7204)) {
                                            arg4.field8444 = -1694498816;
                                        }
                                        arg4.method3380((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class503.method2983(var101.field5589[var128], -64, arg8[var128] << 24 | arg3.field10015), class503.method2983(var101.field5589[var129], -65, arg8[var129] << 24 | arg3.field10015), class503.method2983(var101.field5589[var130], -40, arg8[var130] << 24 | arg3.field10015));
                                        arg4.field8444 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var138).field7204)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method3385((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field5590[var128] / (float) super.field3925, (float) var101.field5590[var129] / (float) super.field3925, (float) var101.field5590[var130] / (float) super.field3925, (float) var101.field5586[var128] / (float) super.field3925, (float) var101.field5586[var129] / (float) super.field3925, (float) var101.field5586[var130] / (float) super.field3925, var140 | var101.field5589[var128] & 16777215, var140 | var101.field5589[var129] & 16777215, var140 | var101.field5589[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field5589[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method4178(this.field10442.field715.method532((byte) 127, var138).field7204)) {
                                        arg4.field8444 = -1694498816;
                                    }
                                    arg4.method3380((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field5589[var128], var101.field5589[var129], var101.field5589[var130]);
                                    arg4.field8444 = 0;
                                }
                                arg4.field8444 = 0;
                            } else {
                                arg4.method3374((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field10015);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field5593; ++var141) {
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
                        arg4.field8448 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field8442 || var146 > arg4.field8442 || var147 > arg4.field8442;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field5589[var142] & 16777215) != 0) {
                                    arg4.method3380((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class97.method710(arg8[var142], arg3.field10015, var101.field5589[var142], -39), class97.method710(arg8[var143], arg3.field10015, var101.field5589[var143], -60), class97.method710(arg8[var144], arg3.field10015, var101.field5589[var144], -33));
                                }
                            } else if ((var101.field5589[var142] & 16777215) != 0) {
                                arg4.method3380((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field5589[var142], var101.field5589[var143], var101.field5589[var144]);
                            }
                        } else {
                            arg4.method3374((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field10015);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lwi;[I)V")
    public final void method1824(class465 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIIII[[ZLwn;Lqs;[I[I)V")
    private final void method4175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class722 arg8, class602 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field10020;
        this.field10442.method490(false);
        arg9.field8450 = false;
        arg9.field8439 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field10435 != null) {
                        if (this.field10435[var18][var19] != null) {
                            class730 var20 = this.field10435[var18][var19];
                            if (var20.field10196 != -1 && (var20.field10195 & 2) == 0 && var20.field10199 == 0) {
                                int var21 = this.field10442.method1251(var20.field10196);
                                arg9.method3381((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class61.method527(var20.field10192, var21, (byte) -66), (float) class61.method527(var20.field10197, var21, (byte) -95), (float) class61.method527(var20.field10198, var21, (byte) -86));
                                arg9.method3381((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class61.method527(var20.field10202, var21, (byte) -108), (float) class61.method527(var20.field10198, var21, (byte) -89), (float) class61.method527(var20.field10197, var21, (byte) -128));
                            } else if (var20.field10199 == 0) {
                                arg9.method3380((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field10192, var20.field10197, var20.field10198);
                                arg9.method3380((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field10202, var20.field10198, var20.field10197);
                            } else {
                                int var22 = var20.field10199;
                                arg9.method3380((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class503.method2983(var22, 124, var20.field10192 & -16777216), class503.method2983(var22, -40, var20.field10197 & -16777216), class503.method2983(var22, 112, var20.field10198 & -16777216));
                                arg9.method3380((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class503.method2983(var22, 87, var20.field10202 & -16777216), class503.method2983(var22, -85, var20.field10198 & -16777216), class503.method2983(var22, -80, var20.field10197 & -16777216));
                            }
                        } else if (this.field10424[var18][var19] != null) {
                            class396 var23 = this.field10424[var18][var19];
                            for (int var24 = 0; var24 < var23.field5595; ++var24) {
                                arg10[var24] = var23.field5590[var24] * var14 / super.field3925 + var16;
                                arg11[var24] = var17 - var23.field5586[var24] * var14 / super.field3925;
                            }
                            for (int var25 = 0; var25 < var23.field5593; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field5588 != null && var23.field5588[var25] != 0 && (var23.field5596 == null || var23.field5596 != null && var23.field5596[var25] == -1)) {
                                    int var35 = var23.field5588[var25];
                                    arg9.method3380((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class503.method2983(var35, -66, -16777216 - (var23.field5589[var26] & -16777216)), class503.method2983(var35, -65, -16777216 - (var23.field5589[var27] & -16777216)), class503.method2983(var35, 81, -16777216 - (var23.field5589[var28] & -16777216)));
                                } else if (var23.field5596 != null && var23.field5596[var25] != -1) {
                                    int var36 = this.field10442.method1251(var23.field5596[var25]);
                                    arg9.method3381((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method3380((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field5589[var26], var23.field5589[var27], var23.field5589[var28]);
                                }
                            }
                        }
                    } else if (this.field10422[var18][var19] != null) {
                        class594 var37 = this.field10422[var18][var19];
                        for (int var38 = 0; var38 < var37.field8363; ++var38) {
                            arg10[var38] = var37.field8366[var38] * var14 / super.field3925 + var16;
                            arg11[var38] = var17 - var37.field8364[var38] * var14 / super.field3925;
                        }
                        for (int var39 = 0; var39 < var37.field8359; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field8365 != null && var37.field8365[var39] != 0) {
                                int var49 = var37.field8365[var39];
                                arg9.method3380((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method3380((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field8362[var40], var37.field8362[var41], var37.field8362[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8450 = true;
        this.field10442.method490(var15);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(II)I")
    private static final int method4176(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!nca", name = "fa", descriptor = "(IILr;)Lr;")
    public final class180 method1822(int arg0, int arg1, class180 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!nca", name = "YA", descriptor = "()V")
    public final void method1821() {
        this.field10421 = null;
        this.field10438 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1813(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!nca", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1810(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!nca", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1818(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field10441 & 32) == 0;
        if (this.field10435 == null && !var15) {
            this.field10435 = new class730[super.field3935][super.field3930];
            this.field10424 = new class396[super.field3935][super.field3930];
        } else if (this.field10422 == null && var15) {
            this.field10422 = new class594[super.field3935][super.field3930];
        } else if (this.field10440 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class2.field23[class199.method1219(0, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class2.field23[class199.method1219(0, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class594 var18 = new class594();
                var18.field8363 = (short) arg2.length;
                var18.field8359 = (short) (arg2.length / 3);
                var18.field8366 = new short[var18.field8363];
                var18.field8360 = new short[var18.field8363];
                var18.field8364 = new short[var18.field8363];
                var18.field8362 = new int[var18.field8363];
                var18.field8358 = new short[var18.field8363];
                var18.field8357 = new short[var18.field8363];
                var18.field8361 = new byte[var18.field8363];
                if (arg5 != null) {
                    var18.field8356 = new short[var18.field8363];
                }
                for (int var19 = 0; var19 < var18.field8363; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field10421[arg0][arg1] - this.field10438[arg0][arg1];
                    } else if (var22 == 0 && super.field3925 == var23) {
                        var25 = this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1];
                    } else if (super.field3925 == var22 && super.field3925 == var23) {
                        var25 = this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1];
                    } else if (super.field3925 == var22 && var23 == 0) {
                        var25 = this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]) * var22 + (this.field10421[arg0][arg1] - this.field10438[arg0][arg1]) * (super.field3925 - var22);
                        int var27 = (this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]) * var22 + (this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]) * (super.field3925 - var22);
                        var25 = (super.field3925 - var23) * var26 + var23 * var27 >> super.field3929 * 2;
                    }
                    int var28 = (arg0 << super.field3929) + var22;
                    int var29 = (arg1 << super.field3929) + var23;
                    var18.field8366[var19] = (short) var22;
                    var18.field8364[var19] = (short) var23;
                    var18.field8360[var19] = (short) (this.method1815(var29, var28, 52) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field8362[var19] = 0;
                        if (arg7 != null) {
                            var18.field8361[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field8356[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method4178(this.field10442.field715.method532((byte) 127, arg8[var19]).field7204)) {
                            var32 = -1694498816;
                        }
                        var18.field8362[var19] = var32 | class97.method710(var30, arg10, method4176(arg6[var19] >> 8, var25), -128);
                        if (arg7 != null) {
                            var18.field8361[var19] = (byte) var25;
                        }
                    }
                    var18.field8358[var19] = (short) arg8[var19];
                    var18.field8357[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field8365 = new int[var18.field8359];
                }
                for (int var20 = 0; var20 < var18.field8359; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field8365[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field10422[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field3925 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3925 && arg4[var38] == super.field3925) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3925) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3925 != arg2[var40] && arg2[0] - super.field3925 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3925 != arg4[var40] && arg4[0] - super.field3925 != arg4[var40]) {
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
                    class730 var41 = new class730();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field10199 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field10195 = (byte) (var41.field10195 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3932[arg0 + 1][arg1] == super.field3932[arg0][arg1] && super.field3932[arg0 + 1][arg1 + 1] == super.field3932[arg0][arg1] && super.field3932[arg0][arg1 + 1] == super.field3932[arg0][arg1]) {
                        var41.field10195 = (byte) (var41.field10195 | 1);
                    }
                    if (var43 != -1 && (var41.field10195 & 2) == 0 && !this.field10442.field715.method532((byte) 127, var43).field7194) {
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
                        var41.field10202 = class97.method710(var44, arg10, method4176(arg6[var34] >> 8, this.field10421[arg0][arg1] - this.field10438[arg0][arg1]), -112);
                        if (var41.field10199 != 0) {
                            var41.field10202 |= 255 - (this.field10421[arg0][arg1] - this.field10438[arg0][arg1]) << 25;
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
                        var41.field10198 = class97.method710(var45, arg10, method4176(arg6[var35] >> 8, this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]), -76);
                        if (var41.field10199 != 0) {
                            var41.field10198 |= 255 - (this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]) << 25;
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
                        var41.field10192 = class97.method710(var46, arg10, method4176(arg6[var36] >> 8, this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]), -67);
                        if (var41.field10199 != 0) {
                            var41.field10192 |= 255 - (this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field10197 = class97.method710(var47, arg10, method4176(arg6[var37] >> 8, this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]), -95);
                        var41.field10196 = (short) var43;
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
                        var41.field10202 = class97.method710(var48, arg10, method4176(arg6[var34] >> 8, this.field10421[arg0][arg1] - this.field10438[arg0][arg1]), -94);
                        if (var41.field10199 != 0) {
                            var41.field10202 |= 255 - (this.field10421[arg0][arg1] - this.field10438[arg0][arg1]) << 25;
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
                        var41.field10198 = class97.method710(var49, arg10, method4176(arg6[var35] >> 8, this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]), -83);
                        if (var41.field10199 != 0) {
                            var41.field10198 |= 255 - (this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]) << 25;
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
                        var41.field10192 = class97.method710(var50, arg10, method4176(arg6[var36] >> 8, this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]), -117);
                        if (var41.field10199 != 0) {
                            var41.field10192 |= 255 - (this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field10197 = class97.method710(var51, arg10, method4176(arg6[var37] >> 8, this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]), -45);
                        if (var41.field10199 != 0) {
                            var41.field10197 |= 255 - (this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]) << 25;
                        }
                        var41.field10196 = -1;
                    }
                    if (arg5 != null) {
                        var41.field10201 = (short) arg5[var36];
                        var41.field10194 = (short) arg5[var37];
                        var41.field10200 = (short) arg5[var35];
                        var41.field10193 = (short) arg5[var34];
                    }
                    this.field10435[arg0][arg1] = var41;
                } else {
                    class396 var52 = new class396();
                    var52.field5595 = (short) arg2.length;
                    var52.field5593 = (short) (arg2.length / 3);
                    var52.field5590 = new short[var52.field5595];
                    var52.field5594 = new short[var52.field5595];
                    var52.field5586 = new short[var52.field5595];
                    var52.field5589 = new int[var52.field5595];
                    if (arg5 != null) {
                        var52.field5592 = new short[var52.field5595];
                    }
                    for (int var53 = 0; var53 < var52.field5595; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field10421[arg0][arg1] - this.field10438[arg0][arg1];
                        } else if (var68 == 0 && super.field3925 == var69) {
                            var71 = this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1];
                        } else if (super.field3925 == var68 && super.field3925 == var69) {
                            var71 = this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1];
                        } else if (super.field3925 == var68 && var69 == 0) {
                            var71 = this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field10421[arg0 + 1][arg1] - this.field10438[arg0 + 1][arg1]) * var68 + (this.field10421[arg0][arg1] - this.field10438[arg0][arg1]) * (super.field3925 - var68);
                            int var73 = (this.field10421[arg0 + 1][arg1 + 1] - this.field10438[arg0 + 1][arg1 + 1]) * var68 + (this.field10421[arg0][arg1 + 1] - this.field10438[arg0][arg1 + 1]) * (super.field3925 - var68);
                            var71 = (super.field3925 - var69) * var72 + var69 * var73 >> super.field3929 * 2;
                        }
                        int var74 = (arg0 << super.field3929) + var68;
                        int var75 = (arg1 << super.field3929) + var69;
                        var52.field5590[var53] = (short) var68;
                        var52.field5586[var53] = (short) var69;
                        var52.field5594[var53] = (short) (this.method1815(var75, var74, -123) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field5589[var53] = var71 << 25;
                            } else {
                                var52.field5589[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field5592[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field5589[var53] = class97.method710(var76, arg10, method4176(arg6[var53] >> 8, var71), -80);
                            if (arg7 != null) {
                                var52.field5589[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field5593; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field10442.field715.method532((byte) 127, arg8[var55 * 3]).field7194) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field5588 = new int[var52.field5593];
                    }
                    if (var54) {
                        var52.field5596 = new short[var52.field5593];
                        var52.field5591 = new short[var52.field5593];
                    }
                    for (int var56 = 0; var56 < var52.field5593; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field5588[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field10442.field715.method532((byte) 127, var62).field7194) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field10442.field715.method532((byte) 127, var63).field7194) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field10442.field715.method532((byte) 127, var64).field7194) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field5596[var56] = (short) var64;
                                var52.field5591[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field10442.field715.method532((byte) 127, var65).field7194) {
                                        var52.field5589[var57] = class2.field23[class199.method1219(0, this.field10442.field715.method532((byte) 127, var65).field7191 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field10442.field715.method532((byte) 127, var66).field7194) {
                                        var52.field5589[var58] = class2.field23[class199.method1219(0, this.field10442.field715.method532((byte) 127, var66).field7191 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field10442.field715.method532((byte) 127, var67).field7194) {
                                        var52.field5589[var59] = class2.field23[class199.method1219(0, this.field10442.field715.method532((byte) 127, var67).field7191 & 65535) & 65535];
                                    }
                                }
                                var52.field5596[var56] = -1;
                            }
                        }
                    }
                    this.field10424[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1811(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1823(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class96 var8 = this.field10442.field2703;
        this.field10428 = arg5;
        this.field10430 = var8.field1130;
        this.field10433 = var8.field1161;
        this.field10423 = var8.field1159;
        this.field10439 = var8.field1163;
        this.field10427 = var8.field1145;
        this.field10436 = var8.field1152;
        this.field10434 = var8.field1148;
        this.field10437 = var8.field1156;
        this.field10431 = var8.field1162;
        this.field10429 = var8.field1151;
        this.field10426 = var8.field1132;
        this.field10432 = var8.field1141;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3935 && var12 >= 0 && var12 < super.field3930) {
                        this.method4172(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "ka", descriptor = "(III)V")
    public final void method1809(int arg0, int arg1, int arg2) {
        if (this.field10438[arg0][arg1] < arg2) {
            this.field10438[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIIIIII[[ZLwn;Lqs;[I[I)V")
    private final void method4177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class722 arg8, class602 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field10020;
        this.field10442.method490(false);
        arg9.field8450 = false;
        arg9.field8439 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field10440[var18][var19] != null) {
                        class627 var20 = this.field10440[var18][var19];
                        if (var20.field8706 != -1 && (var20.field8705 & 2) == 0 && var20.field8707 == -1) {
                            int var21 = this.field10442.method1251(var20.field8706);
                            arg9.method3381((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class61.method527(var20.field8709 & 65535, var21, (byte) -89), (float) class61.method527(var20.field8704 & 65535, var21, (byte) -79), (float) class61.method527(var20.field8708 & 65535, var21, (byte) -99));
                            arg9.method3381((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class61.method527(var20.field8710 & 65535, var21, (byte) -107), (float) class61.method527(var20.field8708 & 65535, var21, (byte) -94), (float) class61.method527(var20.field8704 & 65535, var21, (byte) -110));
                        } else if (var20.field8707 == -1) {
                            arg9.method3381((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field8709 & 65535), (float) (var20.field8704 & 65535), (float) (var20.field8708 & 65535));
                            arg9.method3381((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field8710 & 65535), (float) (var20.field8708 & 65535), (float) (var20.field8704 & 65535));
                        } else {
                            int var22 = var20.field8707;
                            arg9.method3381((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method3381((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field10425[var18][var19] != null) {
                        class57 var23 = this.field10425[var18][var19];
                        for (int var24 = 0; var24 < var23.field689; ++var24) {
                            arg10[var24] = var23.field688[var24] * var14 / super.field3925 + var16;
                            arg11[var24] = var17 - var23.field686[var24] * var14 / super.field3925;
                        }
                        for (int var25 = 0; var25 < var23.field690; ++var25) {
                            short var26 = var23.field699[var25];
                            short var27 = var23.field697[var25];
                            short var28 = var23.field696[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field691 != null && var23.field691[var25] != -1) {
                                int var35 = var23.field691[var25];
                                arg9.method3381((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class61.method527(var23.field692[var26], var35, (byte) -123), (float) class61.method527(var23.field692[var27], var35, (byte) -67), (float) class61.method527(var23.field692[var28], var35, (byte) -100));
                            } else if (var23.field693 != null && var23.field693[var25] != -1) {
                                int var36 = this.field10442.method1251(var23.field693[var25]);
                                arg9.method3381((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class61.method527(var23.field692[var26], var36, (byte) -122), (float) class61.method527(var23.field692[var27], var36, (byte) -86), (float) class61.method527(var23.field692[var28], var36, (byte) -126));
                            } else {
                                int var37 = var23.field694[var25];
                                arg9.method3381((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class61.method527(var23.field692[var26], var37, (byte) -105), (float) class61.method527(var23.field692[var27], var37, (byte) -120), (float) class61.method527(var23.field692[var28], var37, (byte) -83));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8450 = true;
        this.field10442.method490(var15);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)Z")
    private final boolean method4178(int arg0) {
        if ((this.field10441 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class96 var7 = this.field10442.field2703;
        this.field10428 = -1;
        this.field10430 = var7.field1130;
        this.field10433 = var7.field1161;
        this.field10423 = var7.field1159;
        this.field10439 = var7.field1163;
        this.field10427 = var7.field1145;
        this.field10436 = var7.field1152;
        this.field10434 = var7.field1148;
        this.field10437 = var7.field1156;
        this.field10431 = var7.field1162;
        this.field10429 = var7.field1151;
        this.field10426 = var7.field1132;
        this.field10432 = var7.field1141;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3935 && var11 >= 0 && var11 < super.field3930) {
                        this.method4172(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIZLwn;Lqs;[I[I[I[II)V")
    private final void method4179(int arg0, int arg1, boolean arg2, class722 arg3, class602 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class594 var11 = this.field10422[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field10428 == -1) {
                    for (int var12 = 0; var12 < var11.field8363; ++var12) {
                        int var13 = (arg0 << super.field3929) + var11.field8366[var12];
                        int var14 = var11.field8360[var12];
                        int var15 = (arg1 << super.field3929) + var11.field8364[var12];
                        float var16 = (float) var15 * this.field10426 + (float) var13 * this.field10431 + (float) var14 * this.field10429 + this.field10432;
                        if (var16 <= (float) this.field10442.field2696) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field10013);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field8356[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field10012) {
                            int var19 = (int) (var16 - (float) arg3.field10013);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field10423 + (float) var13 * this.field10430 + (float) var14 * this.field10433 + this.field10439;
                        float var21 = (float) var15 * this.field10434 + (float) var13 * this.field10427 + (float) var14 * this.field10436 + this.field10437;
                        arg5[var12] = (int) ((float) this.field10442.field2711 * var20 / var16) + arg4.field8440;
                        arg6[var12] = (int) ((float) this.field10442.field2701 * var21 / var16) + arg4.field8447;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field8363; ++var22) {
                        int var36 = (arg0 << super.field3929) + var11.field8366[var22];
                        int var37 = var11.field8360[var22];
                        int var38 = (arg1 << super.field3929) + var11.field8364[var22];
                        float var39 = (float) var38 * this.field10426 + (float) var36 * this.field10431 + (float) var37 * this.field10429 + this.field10432;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field10428 - arg3.field10013;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field8356[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field10012) {
                            int var42 = this.field10428 - arg3.field10013;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field10423 + (float) var36 * this.field10430 + (float) var37 * this.field10433 + this.field10439;
                        float var44 = (float) var38 * this.field10434 + (float) var36 * this.field10427 + (float) var37 * this.field10436 + this.field10437;
                        arg5[var22] = (int) ((float) this.field10442.field2711 * var43 / (float) this.field10428) + arg4.field8440;
                        arg6[var22] = (int) ((float) this.field10442.field2701 * var44 / (float) this.field10428) + arg4.field8447;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3925;
                for (int var24 = 0; var24 < var11.field8359; ++var24) {
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
                        arg4.field8448 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field8442 || var29 > arg4.field8442 || var30 > arg4.field8442;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3929;
                            int var35 = arg1 << super.field3929;
                            if ((var11.field8362[var25] & 16777215) != 0) {
                                if (var11.field8358[var25] == var11.field8358[var26] && var11.field8358[var25] == var11.field8358[var27] && var11.field8357[var25] == var11.field8357[var26] && var11.field8357[var25] == var11.field8357[var27]) {
                                    arg4.method3385((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field8366[var25] + var34) / (float) var11.field8357[var25], (float) (var11.field8366[var26] + var34) / (float) var11.field8357[var26], (float) (var11.field8366[var27] + var34) / (float) var11.field8357[var27], (float) (var11.field8364[var25] + var35) / (float) var11.field8357[var25], (float) (var11.field8364[var26] + var35) / (float) var11.field8357[var26], (float) (var11.field8364[var27] + var35) / (float) var11.field8357[var27], var11.field8362[var25], var11.field8362[var26], var11.field8362[var27], arg3.field10015, arg8[var25], arg8[var26], arg8[var27], var11.field8358[var25]);
                                } else {
                                    arg4.method3373((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field8366[var25] + var34) / var23, (float) (var11.field8366[var26] + var34) / var23, (float) (var11.field8366[var27] + var34) / var23, (float) (var11.field8364[var25] + var35) / var23, (float) (var11.field8364[var26] + var35) / var23, (float) (var11.field8364[var27] + var35) / var23, var11.field8362[var25], var11.field8362[var26], var11.field8362[var27], arg3.field10015, arg8[var25], arg8[var26], arg8[var27], var11.field8358[var25], var23 / (float) var11.field8357[var25], var11.field8358[var26], var23 / (float) var11.field8357[var26], var11.field8358[var27], var23 / (float) var11.field8357[var27]);
                                }
                            }
                        } else {
                            arg4.method3374((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field10015);
                        }
                    }
                }
            }
        }
    }
}
