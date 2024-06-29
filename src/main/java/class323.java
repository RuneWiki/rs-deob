import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class323 extends class339 {

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    private int field4779 = -1;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "Lpga;")
    private class491 field4774;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    private int field4782;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "[[B")
    private byte[][] field4773;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "[[B")
    private byte[][] field4775;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "F")
    private float field4764;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "F")
    private float field4765;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "F")
    private float field4766;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "F")
    private float field4767;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "F")
    private float field4769;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "F")
    private float field4770;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "F")
    private float field4771;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "F")
    private float field4772;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "F")
    private float field4776;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "F")
    private float field4778;

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "F")
    private float field4781;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "F")
    private float field4783;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "[[Lfh;")
    private class381[][] field4763;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "[[Lrv;")
    private class437[][] field4768;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "[[Lcm;")
    private class561[][] field4777;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "[[Lca;")
    private class609[][] field4784;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "[[Ldia;")
    private class615[][] field4780;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(III)V", line = 5)
    private final void method2091(int arg0, int arg1, int arg2) {
        class145 var4 = this.field4774.method2979(Thread.currentThread());
        var4.field2289.field3875 = 0;
        if (this.field4780 != null) {
            this.method2094(arg0, arg1, var4.field2249, var4, var4.field2289, var4.field2282, var4.field2264, var4.field2286, var4.field2265, arg2);
        } else if (this.field4777 != null) {
            this.method2098(arg0, arg1, var4.field2289, var4.field2282, var4.field2264, var4.field2286, var4.field2265, arg2);
        } else {
            if (this.field4763 != null) {
                this.method2095(arg0, arg1, var4.field2249, var4, var4.field2289, var4.field2282, var4.field2264, var4.field2286, var4.field2265, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII[[ZLqk;Luea;[I[I)V", line = 26)
    private final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class145 arg8, class240 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field2242;
        this.field4774.method326(false);
        arg9.field3867 = false;
        arg9.field3879 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4780 != null) {
                        if (this.field4780[var18][var19] != null) {
                            class615 var20 = this.field4780[var18][var19];
                            if (var20.field8671 != -1 && (var20.field8672 & 2) == 0 && var20.field8673 == 0) {
                                int var21 = this.field4774.method2977(var20.field8671);
                                arg9.method1666((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class539.method3160(var21, -6022, var20.field8668), (float) class539.method3160(var21, -6022, var20.field8667), (float) class539.method3160(var21, -6022, var20.field8675));
                                arg9.method1666((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class539.method3160(var21, -6022, var20.field8674), (float) class539.method3160(var21, -6022, var20.field8675), (float) class539.method3160(var21, -6022, var20.field8667));
                            } else if (var20.field8673 == 0) {
                                arg9.method1664((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field8668, var20.field8667, var20.field8675);
                                arg9.method1664((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field8674, var20.field8675, var20.field8667);
                            } else {
                                int var22 = var20.field8673;
                                arg9.method1664((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class273.method1793(var20.field8668 & -16777216, (byte) 69, var22), class273.method1793(var20.field8667 & -16777216, (byte) 69, var22), class273.method1793(var20.field8675 & -16777216, (byte) 69, var22));
                                arg9.method1664((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class273.method1793(var20.field8674 & -16777216, (byte) 69, var22), class273.method1793(var20.field8675 & -16777216, (byte) 69, var22), class273.method1793(var20.field8667 & -16777216, (byte) 69, var22));
                            }
                        } else if (this.field4784[var18][var19] != null) {
                            class609 var23 = this.field4784[var18][var19];
                            for (int var24 = 0; var24 < var23.field8594; ++var24) {
                                arg10[var24] = var23.field8597[var24] * var14 / super.field4958 + var16;
                                arg11[var24] = var17 - var23.field8595[var24] * var14 / super.field4958;
                            }
                            for (int var25 = 0; var25 < var23.field8592; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field8599 != null && var23.field8599[var25] != 0 && (var23.field8600 == null || var23.field8600 != null && var23.field8600[var25] == -1)) {
                                    int var35 = var23.field8599[var25];
                                    arg9.method1664((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class273.method1793(-16777216 - (var23.field8598[var26] & -16777216), (byte) 69, var35), class273.method1793(-16777216 - (var23.field8598[var27] & -16777216), (byte) 69, var35), class273.method1793(-16777216 - (var23.field8598[var28] & -16777216), (byte) 69, var35));
                                } else if (var23.field8600 != null && var23.field8600[var25] != -1) {
                                    int var36 = this.field4774.method2977(var23.field8600[var25]);
                                    arg9.method1666((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method1664((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field8598[var26], var23.field8598[var27], var23.field8598[var28]);
                                }
                            }
                        }
                    } else if (this.field4763[var18][var19] != null) {
                        class381 var37 = this.field4763[var18][var19];
                        for (int var38 = 0; var38 < var37.field5719; ++var38) {
                            arg10[var38] = var37.field5726[var38] * var14 / super.field4958 + var16;
                            arg11[var38] = var17 - var37.field5723[var38] * var14 / super.field4958;
                        }
                        for (int var39 = 0; var39 < var37.field5718; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field5721 != null && var37.field5721[var39] != 0) {
                                int var49 = var37.field5721[var39];
                                arg9.method1664((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method1664((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field5717[var40], var37.field5717[var41], var37.field5717[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3867 = true;
        this.field4774.method326(var15);
    }

    @OriginalMember(owner = "client!cp", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 216)
    public final void method618(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 219)
    public final boolean method624(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Z", line = 223)
    private final boolean method2093(int arg0) {
        if ((this.field4782 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZLqk;Luea;[I[I[I[II)V", line = 239)
    private final void method2094(int arg0, int arg1, boolean arg2, class145 arg3, class240 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class615 var11 = this.field4780[arg0][arg1];
        if (var11 != null) {
            if ((var11.field8672 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field8672 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field4958 * arg0;
                int var13 = super.field4958 + var12;
                int var14 = super.field4958 * arg1;
                int var15 = super.field4958 + var14;
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
                if ((var11.field8672 & 1) != 0 && !arg2) {
                    int var20 = super.field4957[arg0][arg1];
                    float var21 = (float) var20 * this.field4771;
                    if (this.field4779 == -1) {
                        var22 = (float) var14 * this.field4765 + (float) var12 * this.field4766 + var21 + this.field4776;
                        if (var22 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var23 = (float) var14 * this.field4765 + (float) var13 * this.field4766 + var21 + this.field4776;
                        if (var23 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var24 = (float) var15 * this.field4765 + (float) var13 * this.field4766 + var21 + this.field4776;
                        if (var24 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var25 = (float) var15 * this.field4765 + (float) var12 * this.field4766 + var21 + this.field4776;
                        if (var25 <= (float) this.field4774.field7093) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field4765 + (float) var12 * this.field4766 + var21 + this.field4776;
                        var23 = (float) var14 * this.field4765 + (float) var13 * this.field4766 + var21 + this.field4776;
                        var24 = (float) var15 * this.field4765 + (float) var13 * this.field4766 + var21 + this.field4776;
                        var25 = (float) var15 * this.field4765 + (float) var12 * this.field4766 + var21 + this.field4776;
                    }
                    if (arg3.field2245) {
                        int var26 = (int) (var22 - (float) arg3.field2255);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field2255);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field2255);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field2255);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field4769;
                    float var31 = (float) var20 * this.field4764;
                    if (this.field4779 == -1) {
                        float var32 = (float) var14 * this.field4767 + (float) var12 * this.field4770 + var30 + this.field4778;
                        var33 = (int) ((float) this.field4774.field7123 * var32 / var22) + arg4.field3866;
                        float var34 = (float) var14 * this.field4772 + (float) var12 * this.field4781 + var31 + this.field4783;
                        var35 = (int) ((float) this.field4774.field7121 * var34 / var22) + arg4.field3878;
                        float var36 = (float) var14 * this.field4767 + (float) var13 * this.field4770 + var30 + this.field4778;
                        var37 = (int) ((float) this.field4774.field7123 * var36 / var23) + arg4.field3866;
                        float var38 = (float) var14 * this.field4772 + (float) var13 * this.field4781 + var31 + this.field4783;
                        var39 = (int) ((float) this.field4774.field7121 * var38 / var23) + arg4.field3878;
                        float var40 = (float) var15 * this.field4767 + (float) var13 * this.field4770 + var30 + this.field4778;
                        var41 = (int) ((float) this.field4774.field7123 * var40 / var24) + arg4.field3866;
                        float var42 = (float) var15 * this.field4772 + (float) var13 * this.field4781 + var31 + this.field4783;
                        var43 = (int) ((float) this.field4774.field7121 * var42 / var24) + arg4.field3878;
                        float var44 = (float) var15 * this.field4767 + (float) var12 * this.field4770 + var30 + this.field4778;
                        var45 = (int) ((float) this.field4774.field7123 * var44 / var25) + arg4.field3866;
                        float var46 = (float) var15 * this.field4772 + (float) var12 * this.field4781 + var31 + this.field4783;
                        var47 = (int) ((float) this.field4774.field7121 * var46 / var25) + arg4.field3878;
                    } else {
                        float var48 = (float) var14 * this.field4767 + (float) var12 * this.field4770 + var30 + this.field4778;
                        var33 = (int) ((float) this.field4774.field7123 * var48 / (float) this.field4779) + arg4.field3866;
                        float var49 = (float) var14 * this.field4772 + (float) var12 * this.field4781 + var31 + this.field4783;
                        var35 = (int) ((float) this.field4774.field7121 * var49 / (float) this.field4779) + arg4.field3878;
                        float var50 = (float) var14 * this.field4767 + (float) var13 * this.field4770 + var30 + this.field4778;
                        var37 = (int) ((float) this.field4774.field7123 * var50 / (float) this.field4779) + arg4.field3866;
                        float var51 = (float) var14 * this.field4772 + (float) var13 * this.field4781 + var31 + this.field4783;
                        var39 = (int) ((float) this.field4774.field7121 * var51 / (float) this.field4779) + arg4.field3878;
                        float var52 = (float) var15 * this.field4767 + (float) var13 * this.field4770 + var30 + this.field4778;
                        var41 = (int) ((float) this.field4774.field7123 * var52 / (float) this.field4779) + arg4.field3866;
                        float var53 = (float) var15 * this.field4772 + (float) var13 * this.field4781 + var31 + this.field4783;
                        var43 = (int) ((float) this.field4774.field7121 * var53 / (float) this.field4779) + arg4.field3878;
                        float var54 = (float) var15 * this.field4767 + (float) var12 * this.field4770 + var30 + this.field4778;
                        var45 = (int) ((float) this.field4774.field7123 * var54 / (float) this.field4779) + arg4.field3866;
                        float var55 = (float) var15 * this.field4772 + (float) var12 * this.field4781 + var31 + this.field4783;
                        var47 = (int) ((float) this.field4774.field7121 * var55 / (float) this.field4779) + arg4.field3878;
                    }
                } else {
                    int var56 = super.field4957[arg0][arg1];
                    int var57 = super.field4957[arg0 + 1][arg1];
                    int var58 = super.field4957[arg0 + 1][arg1 + 1];
                    int var59 = super.field4957[arg0][arg1 + 1];
                    if (this.field4779 == -1) {
                        var22 = (float) var14 * this.field4765 + (float) var12 * this.field4766 + (float) var56 * this.field4771 + this.field4776;
                        if (var22 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var23 = (float) var14 * this.field4765 + (float) var13 * this.field4766 + (float) var57 * this.field4771 + this.field4776;
                        if (var23 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var24 = (float) var15 * this.field4765 + (float) var13 * this.field4766 + (float) var58 * this.field4771 + this.field4776;
                        if (var24 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var25 = (float) var15 * this.field4765 + (float) var12 * this.field4766 + (float) var59 * this.field4771 + this.field4776;
                        if (var25 <= (float) this.field4774.field7093) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field4765 + (float) var12 * this.field4766 + (float) var56 * this.field4771 + this.field4776;
                        var23 = (float) var14 * this.field4765 + (float) var13 * this.field4766 + (float) var57 * this.field4771 + this.field4776;
                        var24 = (float) var15 * this.field4765 + (float) var13 * this.field4766 + (float) var58 * this.field4771 + this.field4776;
                        var25 = (float) var15 * this.field4765 + (float) var12 * this.field4766 + (float) var59 * this.field4771 + this.field4776;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field2255);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field8670 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field2255);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field8669 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field2255);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field8665 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field2255);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field8666 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field2245) {
                        int var68 = (int) (var22 - (float) arg3.field2255);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field2255);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field2255);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field2255);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field4779 == -1) {
                        float var72 = (float) var14 * this.field4767 + (float) var12 * this.field4770 + (float) var56 * this.field4769 + this.field4778;
                        var33 = (int) ((float) this.field4774.field7123 * var72 / var22) + arg4.field3866;
                        float var73 = (float) var14 * this.field4772 + (float) var12 * this.field4781 + (float) var56 * this.field4764 + this.field4783;
                        var35 = (int) ((float) this.field4774.field7121 * var73 / var22) + arg4.field3878;
                        float var74 = (float) var14 * this.field4767 + (float) var13 * this.field4770 + (float) var57 * this.field4769 + this.field4778;
                        var37 = (int) ((float) this.field4774.field7123 * var74 / var23) + arg4.field3866;
                        float var75 = (float) var14 * this.field4772 + (float) var13 * this.field4781 + (float) var57 * this.field4764 + this.field4783;
                        var39 = (int) ((float) this.field4774.field7121 * var75 / var23) + arg4.field3878;
                        float var76 = (float) var15 * this.field4767 + (float) var13 * this.field4770 + (float) var58 * this.field4769 + this.field4778;
                        var41 = (int) ((float) this.field4774.field7123 * var76 / var24) + arg4.field3866;
                        float var77 = (float) var15 * this.field4772 + (float) var13 * this.field4781 + (float) var58 * this.field4764 + this.field4783;
                        var43 = (int) ((float) this.field4774.field7121 * var77 / var24) + arg4.field3878;
                        float var78 = (float) var15 * this.field4767 + (float) var12 * this.field4770 + (float) var59 * this.field4769 + this.field4778;
                        var45 = (int) ((float) this.field4774.field7123 * var78 / var25) + arg4.field3866;
                        float var79 = (float) var15 * this.field4772 + (float) var12 * this.field4781 + (float) var59 * this.field4764 + this.field4783;
                        var47 = (int) ((float) this.field4774.field7121 * var79 / var25) + arg4.field3878;
                    } else {
                        float var80 = (float) var14 * this.field4767 + (float) var12 * this.field4770 + (float) var56 * this.field4769 + this.field4778;
                        var33 = (int) ((float) this.field4774.field7123 * var80 / (float) this.field4779) + arg4.field3866;
                        float var81 = (float) var14 * this.field4772 + (float) var12 * this.field4781 + (float) var56 * this.field4764 + this.field4783;
                        var35 = (int) ((float) this.field4774.field7121 * var81 / (float) this.field4779) + arg4.field3878;
                        float var82 = (float) var14 * this.field4767 + (float) var13 * this.field4770 + (float) var57 * this.field4769 + this.field4778;
                        var37 = (int) ((float) this.field4774.field7123 * var82 / (float) this.field4779) + arg4.field3866;
                        float var83 = (float) var14 * this.field4772 + (float) var13 * this.field4781 + (float) var57 * this.field4764 + this.field4783;
                        var39 = (int) ((float) this.field4774.field7121 * var83 / (float) this.field4779) + arg4.field3878;
                        float var84 = (float) var15 * this.field4767 + (float) var13 * this.field4770 + (float) var58 * this.field4769 + this.field4778;
                        var41 = (int) ((float) this.field4774.field7123 * var84 / (float) this.field4779) + arg4.field3866;
                        float var85 = (float) var15 * this.field4772 + (float) var13 * this.field4781 + (float) var58 * this.field4764 + this.field4783;
                        var43 = (int) ((float) this.field4774.field7121 * var85 / (float) this.field4779) + arg4.field3878;
                        float var86 = (float) var15 * this.field4767 + (float) var12 * this.field4770 + (float) var59 * this.field4769 + this.field4778;
                        var45 = (int) ((float) this.field4774.field7123 * var86 / (float) this.field4779) + arg4.field3866;
                        float var87 = (float) var15 * this.field4772 + (float) var12 * this.field4781 + (float) var59 * this.field4764 + this.field4783;
                        var47 = (int) ((float) this.field4774.field7121 * var87 / (float) this.field4779) + arg4.field3878;
                    }
                }
                boolean var88 = var11.field8671 != -1 && this.method2093(this.field4774.field7764.method1774(72, var11.field8671).field8079);
                if (this.field4779 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field3876 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field3870 || var45 > arg4.field3870 || var37 > arg4.field3870;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field8671 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method1670((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field8668 & 16777215, var90 | var11.field8667 & 16777215, var90 | var11.field8675 & 16777215, arg3.field2240, var18, var19, var17, var11.field8671);
                                } else {
                                    if (var88) {
                                        arg4.field3875 = 100;
                                    }
                                    arg4.method1664((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class273.method1793(var18 << 24 | arg3.field2240, (byte) 69, var11.field8668), class273.method1793(var19 << 24 | arg3.field2240, (byte) 69, var11.field8667), class273.method1793(var17 << 24 | arg3.field2240, (byte) 69, var11.field8675));
                                    arg4.field3875 = 0;
                                }
                            } else if (var11.field8671 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method1670((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field8668 & 16777215, var91 | var11.field8667 & 16777215, var91 | var11.field8675 & 16777215, 0, 0, 0, 0, var11.field8671);
                            } else {
                                if (var88) {
                                    arg4.field3875 = 100;
                                }
                                arg4.method1664((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field8668, var11.field8667, var11.field8675);
                                arg4.field3875 = 0;
                            }
                        } else {
                            arg4.method1668((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field2240);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field3876 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field3870 || var37 > arg4.field3870 || var45 > arg4.field3870;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field3875 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field8671 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method1670((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field8674 & 16777215, var93 | var11.field8675 & 16777215, var93 | var11.field8667 & 16777215, arg3.field2240, var16, var17, var19, var11.field8671);
                                    return;
                                }
                                if (var88) {
                                    arg4.field3875 = 100;
                                }
                                arg4.method1664((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class273.method1793(var16 << 24 | arg3.field2240, (byte) 69, var11.field8674), class273.method1793(var17 << 24 | arg3.field2240, (byte) 69, var11.field8675), class273.method1793(var19 << 24 | arg3.field2240, (byte) 69, var11.field8667));
                                arg4.field3875 = 0;
                                return;
                            }
                            if (var11.field8671 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method1670((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field8674 & 16777215, var94 | var11.field8675 & 16777215, var94 | var11.field8667 & 16777215, 0, 0, 0, 0, var11.field8671);
                                return;
                            }
                            if (var88) {
                                arg4.field3875 = 100;
                            }
                            arg4.method1664((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field8674, var11.field8675, var11.field8667);
                            arg4.field3875 = 0;
                            return;
                        }
                        arg4.method1668((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field2240);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field3876 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field3870 || var45 > arg4.field3870 || var37 > arg4.field3870;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field3875 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field8671 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method1670((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field8668 & 16777215, var96 | var11.field8667 & 16777215, var96 | var11.field8675 & 16777215, arg3.field2240, var18, var19, var17, var11.field8671);
                                } else {
                                    if (var88) {
                                        arg4.field3875 = 100;
                                    }
                                    arg4.method1664((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class273.method1793(var18 << 24 | arg3.field2240, (byte) 69, var11.field8668), class273.method1793(var19 << 24 | arg3.field2240, (byte) 69, var11.field8667), class273.method1793(var17 << 24 | arg3.field2240, (byte) 69, var11.field8675));
                                    arg4.field3875 = 0;
                                }
                            } else if (var11.field8671 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method1670((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field8668 & 16777215, var97 | var11.field8667 & 16777215, var97 | var11.field8675 & 16777215, 0, 0, 0, 0, var11.field8671);
                            } else {
                                if (var88) {
                                    arg4.field3875 = 100;
                                }
                                arg4.method1664((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field8668, var11.field8667, var11.field8675);
                                arg4.field3875 = 0;
                            }
                        } else {
                            arg4.method1668((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field2240);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field3876 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field3870 || var37 > arg4.field3870 || var45 > arg4.field3870;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field3875 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field8671 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method1670((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field8674 & 16777215, var99 | var11.field8675 & 16777215, var99 | var11.field8667 & 16777215, arg3.field2240, var16, var17, var19, var11.field8671);
                                    return;
                                }
                                if (var88) {
                                    arg4.field3875 = 100;
                                }
                                arg4.method1664((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class273.method1793(var16 << 24 | arg3.field2240, (byte) 69, var11.field8674), class273.method1793(var17 << 24 | arg3.field2240, (byte) 69, var11.field8675), class273.method1793(var19 << 24 | arg3.field2240, (byte) 69, var11.field8667));
                                arg4.field3875 = 0;
                                return;
                            }
                            if (var11.field8671 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method1670((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field8674 & 16777215, var100 | var11.field8675 & 16777215, var100 | var11.field8667 & 16777215, 0, 0, 0, 0, var11.field8671);
                                return;
                            }
                            if (var88) {
                                arg4.field3875 = 100;
                            }
                            arg4.method1664((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field8674, var11.field8675, var11.field8667);
                            arg4.field3875 = 0;
                            return;
                        }
                        arg4.method1668((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field2240);
                    }
                }
            }
        } else {
            class609 var101 = this.field4784[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field8591 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field4779 == -1) {
                    for (int var102 = 0; var102 < var101.field8594; ++var102) {
                        int var103 = (arg0 << super.field4962) + var101.field8597[var102];
                        int var104 = var101.field8596[var102];
                        int var105 = (arg1 << super.field4962) + var101.field8595[var102];
                        float var106 = (float) var105 * this.field4765 + (float) var103 * this.field4766 + (float) var104 * this.field4771 + this.field4776;
                        if (var106 <= (float) this.field4774.field7093) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field2255);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field8593[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field2245) {
                            int var109 = (int) (var106 - (float) arg3.field2255);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field4767 + (float) var103 * this.field4770 + (float) var104 * this.field4769 + this.field4778;
                        float var111 = (float) var105 * this.field4772 + (float) var103 * this.field4781 + (float) var104 * this.field4764 + this.field4783;
                        arg5[var102] = (int) ((float) this.field4774.field7123 * var110 / var106) + arg4.field3866;
                        arg6[var102] = (int) ((float) this.field4774.field7121 * var111 / var106) + arg4.field3878;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field8594; ++var112) {
                        int var152 = (arg0 << super.field4962) + var101.field8597[var112];
                        int var153 = var101.field8596[var112];
                        int var154 = (arg1 << super.field4962) + var101.field8595[var112];
                        float var155 = (float) var154 * this.field4765 + (float) var152 * this.field4766 + (float) var153 * this.field4771 + this.field4776;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field4779 - arg3.field2255;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field8593[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field2245) {
                            int var158 = this.field4779 - arg3.field2255;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field4767 + (float) var152 * this.field4770 + (float) var153 * this.field4769 + this.field4778;
                        float var160 = (float) var154 * this.field4772 + (float) var152 * this.field4781 + (float) var153 * this.field4764 + this.field4783;
                        arg5[var112] = (int) ((float) this.field4774.field7123 * var159 / (float) this.field4779) + arg4.field3866;
                        arg6[var112] = (int) ((float) this.field4774.field7121 * var160 / (float) this.field4779) + arg4.field3878;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field8600 != null) {
                    if (this.field4779 == -1) {
                        for (int var113 = 0; var113 < var101.field8592; ++var113) {
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
                                arg4.field3876 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field3870 || var118 > arg4.field3870 || var119 > arg4.field3870;
                                short var124 = var101.field8600[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method2093(this.field4774.field7764.method1774(64, var124).field8079)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method1670((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field8597[var114] / (float) super.field4958, (float) var101.field8597[var115] / (float) super.field4958, (float) var101.field8597[var116] / (float) super.field4958, (float) var101.field8595[var114] / (float) super.field4958, (float) var101.field8595[var115] / (float) super.field4958, (float) var101.field8595[var116] / (float) super.field4958, var125 | var101.field8598[var114] & 16777215, var125 | var101.field8598[var115] & 16777215, var125 | var101.field8598[var116] & 16777215, arg3.field2240, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field8598[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method2093(this.field4774.field7764.method1774(86, var124).field8079)) {
                                                arg4.field3875 = -1694498816;
                                            }
                                            arg4.method1664((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class273.method1793(arg8[var114] << 24 | arg3.field2240, (byte) 69, var101.field8598[var114]), class273.method1793(arg8[var115] << 24 | arg3.field2240, (byte) 69, var101.field8598[var115]), class273.method1793(arg8[var116] << 24 | arg3.field2240, (byte) 69, var101.field8598[var116]));
                                            arg4.field3875 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method2093(this.field4774.field7764.method1774(56, var124).field8079)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method1670((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field8597[var114] / (float) super.field4958, (float) var101.field8597[var115] / (float) super.field4958, (float) var101.field8597[var116] / (float) super.field4958, (float) var101.field8595[var114] / (float) super.field4958, (float) var101.field8595[var115] / (float) super.field4958, (float) var101.field8595[var116] / (float) super.field4958, var126 | var101.field8598[var114] & 16777215, var126 | var101.field8598[var115] & 16777215, var126 | var101.field8598[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field8598[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method2093(this.field4774.field7764.method1774(90, var124).field8079)) {
                                            arg4.field3875 = -1694498816;
                                        }
                                        arg4.method1664((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field8598[var114], var101.field8598[var115], var101.field8598[var116]);
                                        arg4.field3875 = 0;
                                    }
                                } else {
                                    arg4.method1668((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field2240);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field8592; ++var127) {
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
                            arg4.field3876 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field3870 || var132 > arg4.field3870 || var133 > arg4.field3870;
                            short var138 = var101.field8600[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method2093(this.field4774.field7764.method1774(106, var138).field8079)) {
                                    arg4.field3875 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method2093(this.field4774.field7764.method1774(53, var138).field8079)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method1670((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field8597[var128] / (float) super.field4958, (float) var101.field8597[var129] / (float) super.field4958, (float) var101.field8597[var130] / (float) super.field4958, (float) var101.field8595[var128] / (float) super.field4958, (float) var101.field8595[var129] / (float) super.field4958, (float) var101.field8595[var130] / (float) super.field4958, var139 | var101.field8598[var128] & 16777215, var139 | var101.field8598[var129] & 16777215, var139 | var101.field8598[var130] & 16777215, arg3.field2240, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field8598[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method2093(this.field4774.field7764.method1774(89, var138).field8079)) {
                                            arg4.field3875 = -1694498816;
                                        }
                                        arg4.method1664((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class273.method1793(arg8[var128] << 24 | arg3.field2240, (byte) 69, var101.field8598[var128]), class273.method1793(arg8[var129] << 24 | arg3.field2240, (byte) 69, var101.field8598[var129]), class273.method1793(arg8[var130] << 24 | arg3.field2240, (byte) 69, var101.field8598[var130]));
                                        arg4.field3875 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method2093(this.field4774.field7764.method1774(74, var138).field8079)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method1670((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field8597[var128] / (float) super.field4958, (float) var101.field8597[var129] / (float) super.field4958, (float) var101.field8597[var130] / (float) super.field4958, (float) var101.field8595[var128] / (float) super.field4958, (float) var101.field8595[var129] / (float) super.field4958, (float) var101.field8595[var130] / (float) super.field4958, var140 | var101.field8598[var128] & 16777215, var140 | var101.field8598[var129] & 16777215, var140 | var101.field8598[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field8598[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method2093(this.field4774.field7764.method1774(85, var138).field8079)) {
                                        arg4.field3875 = -1694498816;
                                    }
                                    arg4.method1664((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field8598[var128], var101.field8598[var129], var101.field8598[var130]);
                                    arg4.field3875 = 0;
                                }
                                arg4.field3875 = 0;
                            } else {
                                arg4.method1668((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field2240);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field8592; ++var141) {
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
                        arg4.field3876 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field3870 || var146 > arg4.field3870 || var147 > arg4.field3870;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field8598[var142] & 16777215) != 0) {
                                    arg4.method1664((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class674.method3762((byte) -74, arg3.field2240, var101.field8598[var142], arg8[var142]), class674.method3762((byte) -74, arg3.field2240, var101.field8598[var143], arg8[var143]), class674.method3762((byte) -74, arg3.field2240, var101.field8598[var144], arg8[var144]));
                                }
                            } else if ((var101.field8598[var142] & 16777215) != 0) {
                                arg4.method1664((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field8598[var142], var101.field8598[var143], var101.field8598[var144]);
                            }
                        } else {
                            arg4.method1668((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field2240);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "YA", descriptor = "()V", line = 1227)
    public final void method615() {
        this.field4773 = null;
        this.field4775 = null;
    }

    @OriginalMember(owner = "client!cp", name = "fa", descriptor = "(IILr;)Lr;", line = 1234)
    public final class706 method626(int arg0, int arg1, class706 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lpga;IIII[[I[[II)V", line = 1238)
    public class323(class491 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4774 = arg0;
        this.field4782 = arg2;
        this.field4773 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4774.field7092 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4774.field7094 * var18 + this.field4774.field7107 * var16 + this.field4774.field7103 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4773[var11][var10] = (byte) var20;
            }
        }
        this.field4775 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III[[ZZI)V", line = 1289)
    public final void method628(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class629 var7 = this.field4774.field7116;
        this.field4779 = -1;
        this.field4770 = var7.field8826;
        this.field4769 = var7.field8821;
        this.field4767 = var7.field8845;
        this.field4778 = var7.field8820;
        this.field4781 = var7.field8838;
        this.field4764 = var7.field8841;
        this.field4772 = var7.field8815;
        this.field4783 = var7.field8827;
        this.field4766 = var7.field8836;
        this.field4771 = var7.field8833;
        this.field4765 = var7.field8816;
        this.field4776 = var7.field8817;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field4956 && var11 >= 0 && var11 < super.field4960) {
                        this.method2091(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1335)
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class145 var9 = this.field4774.method2979(Thread.currentThread());
        class240 var10 = var9.field2289;
        var10.field3875 = 0;
        var10.field3876 = true;
        this.field4774.method1287();
        if (this.field4780 == null && this.field4763 == null) {
            if (this.field4777 != null) {
                this.method2096(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field2282, var9.field2264);
            }
        } else {
            this.method2092(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field2282, var9.field2264);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(IIZLqk;Luea;[I[I[I[II)V", line = 1351)
    private final void method2095(int arg0, int arg1, boolean arg2, class145 arg3, class240 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class381 var11 = this.field4763[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field4779 == -1) {
                    for (int var12 = 0; var12 < var11.field5719; ++var12) {
                        int var13 = (arg0 << super.field4962) + var11.field5726[var12];
                        int var14 = var11.field5716[var12];
                        int var15 = (arg1 << super.field4962) + var11.field5723[var12];
                        float var16 = (float) var15 * this.field4765 + (float) var13 * this.field4766 + (float) var14 * this.field4771 + this.field4776;
                        if (var16 <= (float) this.field4774.field7093) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field2255);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field5724[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field2245) {
                            int var19 = (int) (var16 - (float) arg3.field2255);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field4767 + (float) var13 * this.field4770 + (float) var14 * this.field4769 + this.field4778;
                        float var21 = (float) var15 * this.field4772 + (float) var13 * this.field4781 + (float) var14 * this.field4764 + this.field4783;
                        arg5[var12] = (int) ((float) this.field4774.field7123 * var20 / var16) + arg4.field3866;
                        arg6[var12] = (int) ((float) this.field4774.field7121 * var21 / var16) + arg4.field3878;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field5719; ++var22) {
                        int var36 = (arg0 << super.field4962) + var11.field5726[var22];
                        int var37 = var11.field5716[var22];
                        int var38 = (arg1 << super.field4962) + var11.field5723[var22];
                        float var39 = (float) var38 * this.field4765 + (float) var36 * this.field4766 + (float) var37 * this.field4771 + this.field4776;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field4779 - arg3.field2255;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field5724[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field2245) {
                            int var42 = this.field4779 - arg3.field2255;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field4767 + (float) var36 * this.field4770 + (float) var37 * this.field4769 + this.field4778;
                        float var44 = (float) var38 * this.field4772 + (float) var36 * this.field4781 + (float) var37 * this.field4764 + this.field4783;
                        arg5[var22] = (int) ((float) this.field4774.field7123 * var43 / (float) this.field4779) + arg4.field3866;
                        arg6[var22] = (int) ((float) this.field4774.field7121 * var44 / (float) this.field4779) + arg4.field3878;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field4958;
                for (int var24 = 0; var24 < var11.field5718; ++var24) {
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
                        arg4.field3876 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field3870 || var29 > arg4.field3870 || var30 > arg4.field3870;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field4962;
                            int var35 = arg1 << super.field4962;
                            if ((var11.field5717[var25] & 16777215) != 0) {
                                if (var11.field5720[var25] == var11.field5720[var26] && var11.field5720[var25] == var11.field5720[var27] && var11.field5725[var25] == var11.field5725[var26] && var11.field5725[var25] == var11.field5725[var27]) {
                                    arg4.method1670((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field5726[var25] + var34) / (float) var11.field5725[var25], (float) (var11.field5726[var26] + var34) / (float) var11.field5725[var26], (float) (var11.field5726[var27] + var34) / (float) var11.field5725[var27], (float) (var11.field5723[var25] + var35) / (float) var11.field5725[var25], (float) (var11.field5723[var26] + var35) / (float) var11.field5725[var26], (float) (var11.field5723[var27] + var35) / (float) var11.field5725[var27], var11.field5717[var25], var11.field5717[var26], var11.field5717[var27], arg3.field2240, arg8[var25], arg8[var26], arg8[var27], var11.field5720[var25]);
                                } else {
                                    arg4.method1665((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field5726[var25] + var34) / var23, (float) (var11.field5726[var26] + var34) / var23, (float) (var11.field5726[var27] + var34) / var23, (float) (var11.field5723[var25] + var35) / var23, (float) (var11.field5723[var26] + var35) / var23, (float) (var11.field5723[var27] + var35) / var23, var11.field5717[var25], var11.field5717[var26], var11.field5717[var27], arg3.field2240, arg8[var25], arg8[var26], arg8[var27], var11.field5720[var25], var23 / (float) var11.field5725[var25], var11.field5720[var26], var23 / (float) var11.field5725[var26], var11.field5720[var27], var23 / (float) var11.field5725[var27]);
                                }
                            }
                        } else {
                            arg4.method1668((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field2240);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1543)
    public final void method623(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field4782 & 32) == 0;
        if (this.field4780 == null && !var15) {
            this.field4780 = new class615[super.field4956][super.field4960];
            this.field4784 = new class609[super.field4956][super.field4960];
        } else if (this.field4763 == null && var15) {
            this.field4763 = new class381[super.field4956][super.field4960];
        } else if (this.field4777 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class395.field5895[class718.method3964(896, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class395.field5895[class718.method3964(896, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class381 var18 = new class381();
                var18.field5719 = (short) arg2.length;
                var18.field5718 = (short) (arg2.length / 3);
                var18.field5726 = new short[var18.field5719];
                var18.field5716 = new short[var18.field5719];
                var18.field5723 = new short[var18.field5719];
                var18.field5717 = new int[var18.field5719];
                var18.field5720 = new short[var18.field5719];
                var18.field5725 = new short[var18.field5719];
                var18.field5722 = new byte[var18.field5719];
                if (arg5 != null) {
                    var18.field5724 = new short[var18.field5719];
                }
                for (int var19 = 0; var19 < var18.field5719; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field4773[arg0][arg1] - this.field4775[arg0][arg1];
                    } else if (var22 == 0 && super.field4958 == var23) {
                        var25 = this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1];
                    } else if (super.field4958 == var22 && super.field4958 == var23) {
                        var25 = this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1];
                    } else if (super.field4958 == var22 && var23 == 0) {
                        var25 = this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]) * var22 + (this.field4773[arg0][arg1] - this.field4775[arg0][arg1]) * (super.field4958 - var22);
                        int var27 = (this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]) * var22 + (this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]) * (super.field4958 - var22);
                        var25 = (super.field4958 - var23) * var26 + var23 * var27 >> super.field4962 * 2;
                    }
                    int var28 = (arg0 << super.field4962) + var22;
                    int var29 = (arg1 << super.field4962) + var23;
                    var18.field5726[var19] = (short) var22;
                    var18.field5723[var19] = (short) var23;
                    var18.field5716[var19] = (short) (this.method2162(var29, 1, var28) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field5717[var19] = 0;
                        if (arg7 != null) {
                            var18.field5722[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field5724[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method2093(this.field4774.field7764.method1774(54, arg8[var19]).field8079)) {
                            var32 = -1694498816;
                        }
                        var18.field5717[var19] = var32 | class674.method3762((byte) -74, arg10, method2097(arg6[var19] >> 8, var25), var30);
                        if (arg7 != null) {
                            var18.field5722[var19] = (byte) var25;
                        }
                    }
                    var18.field5720[var19] = (short) arg8[var19];
                    var18.field5725[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field5721 = new int[var18.field5718];
                }
                for (int var20 = 0; var20 < var18.field5718; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field5721[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field4763[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field4958 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field4958 && arg4[var38] == super.field4958) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field4958) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field4958 != arg2[var40] && arg2[0] - super.field4958 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field4958 != arg4[var40] && arg4[0] - super.field4958 != arg4[var40]) {
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
                    class615 var41 = new class615();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field8673 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field8672 = (byte) (var41.field8672 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field4957[arg0 + 1][arg1] == super.field4957[arg0][arg1] && super.field4957[arg0 + 1][arg1 + 1] == super.field4957[arg0][arg1] && super.field4957[arg0][arg1 + 1] == super.field4957[arg0][arg1]) {
                        var41.field8672 = (byte) (var41.field8672 | 1);
                    }
                    if (var43 != -1 && (var41.field8672 & 2) == 0 && !this.field4774.field7764.method1774(122, var43).field8062) {
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
                        var41.field8674 = class674.method3762((byte) -74, arg10, method2097(arg6[var34] >> 8, this.field4773[arg0][arg1] - this.field4775[arg0][arg1]), var44);
                        if (var41.field8673 != 0) {
                            var41.field8674 |= 255 - (this.field4773[arg0][arg1] - this.field4775[arg0][arg1]) << 25;
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
                        var41.field8675 = class674.method3762((byte) -74, arg10, method2097(arg6[var35] >> 8, this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]), var45);
                        if (var41.field8673 != 0) {
                            var41.field8675 |= 255 - (this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]) << 25;
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
                        var41.field8668 = class674.method3762((byte) -74, arg10, method2097(arg6[var36] >> 8, this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]), var46);
                        if (var41.field8673 != 0) {
                            var41.field8668 |= 255 - (this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field8667 = class674.method3762((byte) -74, arg10, method2097(arg6[var37] >> 8, this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]), var47);
                        var41.field8671 = (short) var43;
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
                        var41.field8674 = class674.method3762((byte) -74, arg10, method2097(arg6[var34] >> 8, this.field4773[arg0][arg1] - this.field4775[arg0][arg1]), var48);
                        if (var41.field8673 != 0) {
                            var41.field8674 |= 255 - (this.field4773[arg0][arg1] - this.field4775[arg0][arg1]) << 25;
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
                        var41.field8675 = class674.method3762((byte) -74, arg10, method2097(arg6[var35] >> 8, this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]), var49);
                        if (var41.field8673 != 0) {
                            var41.field8675 |= 255 - (this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]) << 25;
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
                        var41.field8668 = class674.method3762((byte) -74, arg10, method2097(arg6[var36] >> 8, this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]), var50);
                        if (var41.field8673 != 0) {
                            var41.field8668 |= 255 - (this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field8667 = class674.method3762((byte) -74, arg10, method2097(arg6[var37] >> 8, this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]), var51);
                        if (var41.field8673 != 0) {
                            var41.field8667 |= 255 - (this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]) << 25;
                        }
                        var41.field8671 = -1;
                    }
                    if (arg5 != null) {
                        var41.field8665 = (short) arg5[var36];
                        var41.field8666 = (short) arg5[var37];
                        var41.field8669 = (short) arg5[var35];
                        var41.field8670 = (short) arg5[var34];
                    }
                    this.field4780[arg0][arg1] = var41;
                } else {
                    class609 var52 = new class609();
                    var52.field8594 = (short) arg2.length;
                    var52.field8592 = (short) (arg2.length / 3);
                    var52.field8597 = new short[var52.field8594];
                    var52.field8596 = new short[var52.field8594];
                    var52.field8595 = new short[var52.field8594];
                    var52.field8598 = new int[var52.field8594];
                    if (arg5 != null) {
                        var52.field8593 = new short[var52.field8594];
                    }
                    for (int var53 = 0; var53 < var52.field8594; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field4773[arg0][arg1] - this.field4775[arg0][arg1];
                        } else if (var68 == 0 && super.field4958 == var69) {
                            var71 = this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1];
                        } else if (super.field4958 == var68 && super.field4958 == var69) {
                            var71 = this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1];
                        } else if (super.field4958 == var68 && var69 == 0) {
                            var71 = this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]) * var68 + (this.field4773[arg0][arg1] - this.field4775[arg0][arg1]) * (super.field4958 - var68);
                            int var73 = (this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]) * var68 + (this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]) * (super.field4958 - var68);
                            var71 = (super.field4958 - var69) * var72 + var69 * var73 >> super.field4962 * 2;
                        }
                        int var74 = (arg0 << super.field4962) + var68;
                        int var75 = (arg1 << super.field4962) + var69;
                        var52.field8597[var53] = (short) var68;
                        var52.field8595[var53] = (short) var69;
                        var52.field8596[var53] = (short) (this.method2162(var75, 1, var74) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field8598[var53] = var71 << 25;
                            } else {
                                var52.field8598[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field8593[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field8598[var53] = class674.method3762((byte) -74, arg10, method2097(arg6[var53] >> 8, var71), var76);
                            if (arg7 != null) {
                                var52.field8598[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field8592; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field4774.field7764.method1774(53, arg8[var55 * 3]).field8062) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field8599 = new int[var52.field8592];
                    }
                    if (var54) {
                        var52.field8600 = new short[var52.field8592];
                        var52.field8590 = new short[var52.field8592];
                    }
                    for (int var56 = 0; var56 < var52.field8592; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field8599[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field4774.field7764.method1774(112, var62).field8062) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field4774.field7764.method1774(48, var63).field8062) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field4774.field7764.method1774(63, var64).field8062) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field8600[var56] = (short) var64;
                                var52.field8590[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field4774.field7764.method1774(58, var65).field8062) {
                                        var52.field8598[var57] = class395.field5895[class718.method3964(896, this.field4774.field7764.method1774(53, var65).field8071 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field4774.field7764.method1774(111, var66).field8062) {
                                        var52.field8598[var58] = class395.field5895[class718.method3964(896, this.field4774.field7764.method1774(68, var66).field8071 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field4774.field7764.method1774(121, var67).field8062) {
                                        var52.field8598[var59] = class395.field5895[class718.method3964(896, this.field4774.field7764.method1774(119, var67).field8071 & 65535) & 65535];
                                    }
                                }
                                var52.field8600[var56] = -1;
                            }
                        }
                    }
                    this.field4784[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(IIIIIII[[ZLqk;Luea;[I[I)V", line = 2243)
    private final void method2096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class145 arg8, class240 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field2242;
        this.field4774.method326(false);
        arg9.field3867 = false;
        arg9.field3879 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field4777[var18][var19] != null) {
                        class561 var20 = this.field4777[var18][var19];
                        if (var20.field7950 != -1 && (var20.field7949 & 2) == 0 && var20.field7953 == -1) {
                            int var21 = this.field4774.method2977(var20.field7950);
                            arg9.method1666((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class539.method3160(var21, -6022, var20.field7951 & 65535), (float) class539.method3160(var21, -6022, var20.field7952 & 65535), (float) class539.method3160(var21, -6022, var20.field7948 & 65535));
                            arg9.method1666((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class539.method3160(var21, -6022, var20.field7947 & 65535), (float) class539.method3160(var21, -6022, var20.field7948 & 65535), (float) class539.method3160(var21, -6022, var20.field7952 & 65535));
                        } else if (var20.field7953 == -1) {
                            arg9.method1666((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field7951 & 65535), (float) (var20.field7952 & 65535), (float) (var20.field7948 & 65535));
                            arg9.method1666((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field7947 & 65535), (float) (var20.field7948 & 65535), (float) (var20.field7952 & 65535));
                        } else {
                            int var22 = var20.field7953;
                            arg9.method1666((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method1666((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field4768[var18][var19] != null) {
                        class437 var23 = this.field4768[var18][var19];
                        for (int var24 = 0; var24 < var23.field6384; ++var24) {
                            arg10[var24] = var23.field6385[var24] * var14 / super.field4958 + var16;
                            arg11[var24] = var17 - var23.field6379[var24] * var14 / super.field4958;
                        }
                        for (int var25 = 0; var25 < var23.field6380; ++var25) {
                            short var26 = var23.field6383[var25];
                            short var27 = var23.field6387[var25];
                            short var28 = var23.field6381[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field6391 != null && var23.field6391[var25] != -1) {
                                int var35 = var23.field6391[var25];
                                arg9.method1666((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class539.method3160(var35, -6022, var23.field6390[var26]), (float) class539.method3160(var35, -6022, var23.field6390[var27]), (float) class539.method3160(var35, -6022, var23.field6390[var28]));
                            } else if (var23.field6382 != null && var23.field6382[var25] != -1) {
                                int var36 = this.field4774.method2977(var23.field6382[var25]);
                                arg9.method1666((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class539.method3160(var36, -6022, var23.field6390[var26]), (float) class539.method3160(var36, -6022, var23.field6390[var27]), (float) class539.method3160(var36, -6022, var23.field6390[var28]));
                            } else {
                                int var37 = var23.field6388[var25];
                                arg9.method1666((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class539.method3160(var37, -6022, var23.field6390[var26]), (float) class539.method3160(var37, -6022, var23.field6390[var27]), (float) class539.method3160(var37, -6022, var23.field6390[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3867 = true;
        this.field4774.method326(var15);
    }

    @OriginalMember(owner = "client!cp", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 2378)
    public final void method621(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V", line = 2381)
    public final void method622(int arg0, int arg1) {
        this.method2091(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lvt;[I)V", line = 2385)
    public final void method617(class759 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)I", line = 2399)
    private static final int method2097(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILuea;[I[I[I[II)V", line = 2429)
    private final void method2098(int arg0, int arg1, class240 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class561 var9 = this.field4777[arg0][arg1];
        if (var9 != null) {
            if ((var9.field7949 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field7949 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field4958 * arg0;
                int var11 = super.field4958 + var10;
                int var12 = super.field4958 * arg1;
                int var13 = super.field4958 + var12;
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
                if ((var9.field7949 & 1) != 0) {
                    int var14 = super.field4957[arg0][arg1];
                    float var15 = (float) var14 * this.field4771;
                    if (this.field4779 == -1) {
                        var16 = (float) var12 * this.field4765 + (float) var10 * this.field4766 + var15 + this.field4776;
                        if (var16 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var17 = (float) var12 * this.field4765 + (float) var11 * this.field4766 + var15 + this.field4776;
                        if (var17 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var18 = (float) var13 * this.field4765 + (float) var11 * this.field4766 + var15 + this.field4776;
                        if (var18 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var19 = (float) var13 * this.field4765 + (float) var10 * this.field4766 + var15 + this.field4776;
                        if (var19 <= (float) this.field4774.field7093) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field4765 + (float) var10 * this.field4766 + var15 + this.field4776;
                        var17 = (float) var12 * this.field4765 + (float) var11 * this.field4766 + var15 + this.field4776;
                        var18 = (float) var13 * this.field4765 + (float) var11 * this.field4766 + var15 + this.field4776;
                        var19 = (float) var13 * this.field4765 + (float) var10 * this.field4766 + var15 + this.field4776;
                    }
                    float var20 = (float) var14 * this.field4769;
                    float var21 = (float) var14 * this.field4764;
                    if (this.field4779 == -1) {
                        float var22 = (float) var12 * this.field4767 + (float) var10 * this.field4770 + var20 + this.field4778;
                        var23 = (int) ((float) this.field4774.field7123 * var22 / var16) + arg2.field3866;
                        float var24 = (float) var12 * this.field4772 + (float) var10 * this.field4781 + var21 + this.field4783;
                        var25 = (int) ((float) this.field4774.field7121 * var24 / var16) + arg2.field3878;
                        float var26 = (float) var12 * this.field4767 + (float) var11 * this.field4770 + var20 + this.field4778;
                        var27 = (int) ((float) this.field4774.field7123 * var26 / var17) + arg2.field3866;
                        float var28 = (float) var12 * this.field4772 + (float) var11 * this.field4781 + var21 + this.field4783;
                        var29 = (int) ((float) this.field4774.field7121 * var28 / var17) + arg2.field3878;
                        float var30 = (float) var13 * this.field4767 + (float) var11 * this.field4770 + var20 + this.field4778;
                        var31 = (int) ((float) this.field4774.field7123 * var30 / var18) + arg2.field3866;
                        float var32 = (float) var13 * this.field4772 + (float) var11 * this.field4781 + var21 + this.field4783;
                        var33 = (int) ((float) this.field4774.field7121 * var32 / var18) + arg2.field3878;
                        float var34 = (float) var13 * this.field4767 + (float) var10 * this.field4770 + var20 + this.field4778;
                        var35 = (int) ((float) this.field4774.field7123 * var34 / var19) + arg2.field3866;
                        float var36 = (float) var13 * this.field4772 + (float) var10 * this.field4781 + var21 + this.field4783;
                        var37 = (int) ((float) this.field4774.field7121 * var36 / var19) + arg2.field3878;
                    } else {
                        float var38 = (float) var12 * this.field4767 + (float) var10 * this.field4770 + var20 + this.field4778;
                        var23 = (int) ((float) this.field4774.field7123 * var38 / (float) this.field4779) + arg2.field3866;
                        float var39 = (float) var12 * this.field4772 + (float) var10 * this.field4781 + var21 + this.field4783;
                        var25 = (int) ((float) this.field4774.field7121 * var39 / (float) this.field4779) + arg2.field3878;
                        float var40 = (float) var12 * this.field4767 + (float) var11 * this.field4770 + var20 + this.field4778;
                        var27 = (int) ((float) this.field4774.field7123 * var40 / (float) this.field4779) + arg2.field3866;
                        float var41 = (float) var12 * this.field4772 + (float) var11 * this.field4781 + var21 + this.field4783;
                        var29 = (int) ((float) this.field4774.field7121 * var41 / (float) this.field4779) + arg2.field3878;
                        float var42 = (float) var13 * this.field4767 + (float) var11 * this.field4770 + var20 + this.field4778;
                        var31 = (int) ((float) this.field4774.field7123 * var42 / (float) this.field4779) + arg2.field3866;
                        float var43 = (float) var13 * this.field4772 + (float) var11 * this.field4781 + var21 + this.field4783;
                        var33 = (int) ((float) this.field4774.field7121 * var43 / (float) this.field4779) + arg2.field3878;
                        float var44 = (float) var13 * this.field4767 + (float) var10 * this.field4770 + var20 + this.field4778;
                        var35 = (int) ((float) this.field4774.field7123 * var44 / (float) this.field4779) + arg2.field3866;
                        float var45 = (float) var13 * this.field4772 + (float) var10 * this.field4781 + var21 + this.field4783;
                        var37 = (int) ((float) this.field4774.field7121 * var45 / (float) this.field4779) + arg2.field3878;
                    }
                } else {
                    int var46 = super.field4957[arg0][arg1];
                    int var47 = super.field4957[arg0 + 1][arg1];
                    int var48 = super.field4957[arg0 + 1][arg1 + 1];
                    int var49 = super.field4957[arg0][arg1 + 1];
                    if (this.field4779 == -1) {
                        var16 = (float) var12 * this.field4765 + (float) var10 * this.field4766 + (float) var46 * this.field4771 + this.field4776;
                        if (var16 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var17 = (float) var12 * this.field4765 + (float) var11 * this.field4766 + (float) var47 * this.field4771 + this.field4776;
                        if (var17 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var18 = (float) var13 * this.field4765 + (float) var11 * this.field4766 + (float) var48 * this.field4771 + this.field4776;
                        if (var18 <= (float) this.field4774.field7093) {
                            return;
                        }
                        var19 = (float) var13 * this.field4765 + (float) var10 * this.field4766 + (float) var49 * this.field4771 + this.field4776;
                        if (var19 <= (float) this.field4774.field7093) {
                            return;
                        }
                        float var50 = (float) var12 * this.field4767 + (float) var10 * this.field4770 + (float) var46 * this.field4769 + this.field4778;
                        var23 = (int) ((float) this.field4774.field7123 * var50 / var16) + arg2.field3866;
                        float var51 = (float) var12 * this.field4772 + (float) var10 * this.field4781 + (float) var46 * this.field4764 + this.field4783;
                        var25 = (int) ((float) this.field4774.field7121 * var51 / var16) + arg2.field3878;
                        float var52 = (float) var12 * this.field4767 + (float) var11 * this.field4770 + (float) var47 * this.field4769 + this.field4778;
                        var27 = (int) ((float) this.field4774.field7123 * var52 / var17) + arg2.field3866;
                        float var53 = (float) var12 * this.field4772 + (float) var11 * this.field4781 + (float) var47 * this.field4764 + this.field4783;
                        var29 = (int) ((float) this.field4774.field7121 * var53 / var17) + arg2.field3878;
                        float var54 = (float) var13 * this.field4767 + (float) var11 * this.field4770 + (float) var48 * this.field4769 + this.field4778;
                        var31 = (int) ((float) this.field4774.field7123 * var54 / var18) + arg2.field3866;
                        float var55 = (float) var13 * this.field4772 + (float) var11 * this.field4781 + (float) var48 * this.field4764 + this.field4783;
                        var33 = (int) ((float) this.field4774.field7121 * var55 / var18) + arg2.field3878;
                        float var56 = (float) var13 * this.field4767 + (float) var10 * this.field4770 + (float) var49 * this.field4769 + this.field4778;
                        var35 = (int) ((float) this.field4774.field7123 * var56 / var19) + arg2.field3866;
                        float var57 = (float) var13 * this.field4772 + (float) var10 * this.field4781 + (float) var49 * this.field4764 + this.field4783;
                        var37 = (int) ((float) this.field4774.field7121 * var57 / var19) + arg2.field3878;
                    } else {
                        var16 = (float) var12 * this.field4765 + (float) var10 * this.field4766 + (float) var46 * this.field4771 + this.field4776;
                        var17 = (float) var12 * this.field4765 + (float) var11 * this.field4766 + (float) var47 * this.field4771 + this.field4776;
                        var18 = (float) var13 * this.field4765 + (float) var11 * this.field4766 + (float) var48 * this.field4771 + this.field4776;
                        var19 = (float) var13 * this.field4765 + (float) var10 * this.field4766 + (float) var49 * this.field4771 + this.field4776;
                        float var58 = (float) var12 * this.field4767 + (float) var10 * this.field4770 + (float) var46 * this.field4769 + this.field4778;
                        var23 = (int) ((float) this.field4774.field7123 * var58 / (float) this.field4779) + arg2.field3866;
                        float var59 = (float) var12 * this.field4772 + (float) var10 * this.field4781 + (float) var46 * this.field4764 + this.field4783;
                        var25 = (int) ((float) this.field4774.field7121 * var59 / (float) this.field4779) + arg2.field3878;
                        float var60 = (float) var12 * this.field4767 + (float) var11 * this.field4770 + (float) var47 * this.field4769 + this.field4778;
                        var27 = (int) ((float) this.field4774.field7123 * var60 / (float) this.field4779) + arg2.field3866;
                        float var61 = (float) var12 * this.field4772 + (float) var11 * this.field4781 + (float) var47 * this.field4764 + this.field4783;
                        var29 = (int) ((float) this.field4774.field7121 * var61 / (float) this.field4779) + arg2.field3878;
                        float var62 = (float) var13 * this.field4767 + (float) var11 * this.field4770 + (float) var48 * this.field4769 + this.field4778;
                        var31 = (int) ((float) this.field4774.field7123 * var62 / (float) this.field4779) + arg2.field3866;
                        float var63 = (float) var13 * this.field4772 + (float) var11 * this.field4781 + (float) var48 * this.field4764 + this.field4783;
                        var33 = (int) ((float) this.field4774.field7121 * var63 / (float) this.field4779) + arg2.field3878;
                        float var64 = (float) var13 * this.field4767 + (float) var10 * this.field4770 + (float) var49 * this.field4769 + this.field4778;
                        var35 = (int) ((float) this.field4774.field7123 * var64 / (float) this.field4779) + arg2.field3866;
                        float var65 = (float) var13 * this.field4772 + (float) var10 * this.field4781 + (float) var49 * this.field4764 + this.field4783;
                        var37 = (int) ((float) this.field4774.field7121 * var65 / (float) this.field4779) + arg2.field3878;
                    }
                }
                if (this.field4779 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field3876 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field3870 || var35 > arg2.field3870 || var27 > arg2.field3870;
                        if (var9.field7950 >= 0) {
                            arg2.method1670((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class395.field5895[var9.field7951 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7952 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7948 & 65535] & 16777215, 0, 0, 0, 0, var9.field7950);
                        } else {
                            arg2.method1666((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field7951 & 65535), (float) (var9.field7952 & 65535), (float) (var9.field7948 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field3876 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field3870 || var27 > arg2.field3870 || var35 > arg2.field3870;
                        if (var9.field7950 >= 0) {
                            arg2.method1670((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class395.field5895[var9.field7947 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7948 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7952 & 65535] & 16777215, 0, 0, 0, 0, var9.field7950);
                            return;
                        }
                        arg2.method1666((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field7947 & 65535), (float) (var9.field7948 & 65535), (float) (var9.field7952 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field3876 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field3870 || var35 > arg2.field3870 || var27 > arg2.field3870;
                        if (var9.field7950 >= 0) {
                            arg2.method1670((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class395.field5895[var9.field7951 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7952 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7948 & 65535] & 16777215, 0, 0, 0, 0, var9.field7950);
                        } else {
                            arg2.method1666((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field7951 & 65535), (float) (var9.field7952 & 65535), (float) (var9.field7948 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field3876 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field3870 || var27 > arg2.field3870 || var35 > arg2.field3870;
                        if (var9.field7950 >= 0) {
                            arg2.method1670((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class395.field5895[var9.field7947 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7948 & 65535] & 16777215, -16777216 | class395.field5895[var9.field7952 & 65535] & 16777215, 0, 0, 0, 0, var9.field7950);
                            return;
                        }
                        arg2.method1666((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field7947 & 65535), (float) (var9.field7948 & 65535), (float) (var9.field7952 & 65535));
                    }
                }
            }
        } else {
            class437 var66 = this.field4768[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field6378 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field4779 == -1) {
                    for (int var67 = 0; var67 < var66.field6384; ++var67) {
                        int var68 = (arg0 << super.field4962) + var66.field6385[var67];
                        short var69 = var66.field6389[var67];
                        int var70 = (arg1 << super.field4962) + var66.field6379[var67];
                        float var71 = (float) var70 * this.field4765 + (float) var68 * this.field4766 + (float) var69 * this.field4771 + this.field4776;
                        if (var71 <= (float) this.field4774.field7093) {
                            return;
                        }
                        float var72 = (float) var70 * this.field4767 + (float) var68 * this.field4770 + (float) var69 * this.field4769 + this.field4778;
                        float var73 = (float) var70 * this.field4772 + (float) var68 * this.field4781 + (float) var69 * this.field4764 + this.field4783;
                        arg3[var67] = (int) ((float) this.field4774.field7123 * var72 / var71) + arg2.field3866;
                        arg4[var67] = (int) ((float) this.field4774.field7121 * var73 / var71) + arg2.field3878;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field6384; ++var74) {
                        int var110 = (arg0 << super.field4962) + var66.field6385[var74];
                        short var111 = var66.field6389[var74];
                        int var112 = (arg1 << super.field4962) + var66.field6379[var74];
                        float var113 = (float) var112 * this.field4765 + (float) var110 * this.field4766 + (float) var111 * this.field4771 + this.field4776;
                        float var114 = (float) var112 * this.field4767 + (float) var110 * this.field4770 + (float) var111 * this.field4769 + this.field4778;
                        float var115 = (float) var112 * this.field4772 + (float) var110 * this.field4781 + (float) var111 * this.field4764 + this.field4783;
                        arg3[var74] = (int) ((float) this.field4774.field7123 * var114 / (float) this.field4779) + arg2.field3866;
                        arg4[var74] = (int) ((float) this.field4774.field7121 * var115 / (float) this.field4779) + arg2.field3878;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field6382 != null) {
                    if (this.field4779 == -1) {
                        for (int var75 = 0; var75 < var66.field6380; ++var75) {
                            short var76 = var66.field6383[var75];
                            short var77 = var66.field6387[var75];
                            short var78 = var66.field6381[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field3876 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field3870 || var80 > arg2.field3870 || var81 > arg2.field3870;
                                short var85 = var66.field6382[var75];
                                if (var85 != -1) {
                                    arg2.method1670((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field6385[var76] / (float) super.field4958, (float) var66.field6385[var77] / (float) super.field4958, (float) var66.field6385[var78] / (float) super.field4958, (float) var66.field6379[var76] / (float) super.field4958, (float) var66.field6379[var77] / (float) super.field4958, (float) var66.field6379[var78] / (float) super.field4958, -16777216 | class395.field5895[var66.field6390[var76] & 65535] & 16777215, -16777216 | class395.field5895[var66.field6390[var77] & 65535] & 16777215, -16777216 | class395.field5895[var66.field6390[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field6388[var75];
                                    if (var86 != -1) {
                                        arg2.method1666((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class539.method3160(var86, -6022, var66.field6390[var76]), (float) class539.method3160(var86, -6022, var66.field6390[var77]), (float) class539.method3160(var86, -6022, var66.field6390[var78]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field6380; ++var87) {
                        short var88 = var66.field6383[var87];
                        short var89 = var66.field6387[var87];
                        short var90 = var66.field6381[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field3876 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field3870 || var92 > arg2.field3870 || var93 > arg2.field3870;
                            short var97 = var66.field6382[var87];
                            if (var97 != -1) {
                                arg2.method1670((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field6385[var88] / (float) super.field4958, (float) var66.field6385[var89] / (float) super.field4958, (float) var66.field6385[var90] / (float) super.field4958, (float) var66.field6379[var88] / (float) super.field4958, (float) var66.field6379[var89] / (float) super.field4958, (float) var66.field6379[var90] / (float) super.field4958, -16777216 | class395.field5895[var66.field6390[var88] & 65535] & 16777215, -16777216 | class395.field5895[var66.field6390[var89] & 65535] & 16777215, -16777216 | class395.field5895[var66.field6390[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field6388[var87];
                                if (var98 != -1) {
                                    arg2.method1666((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class539.method3160(var98, -6022, var66.field6390[var88]), (float) class539.method3160(var98, -6022, var66.field6390[var89]), (float) class539.method3160(var98, -6022, var66.field6390[var90]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field6380; ++var99) {
                    short var100 = var66.field6383[var99];
                    short var101 = var66.field6387[var99];
                    short var102 = var66.field6381[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field6388[var99];
                        if (var109 != -1) {
                            arg2.field3876 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field3870 || var104 > arg2.field3870 || var105 > arg2.field3870;
                            arg2.method1666((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class539.method3160(var109, -6022, var66.field6390[var100]), (float) class539.method3160(var109, -6022, var66.field6390[var101]), (float) class539.method3160(var109, -6022, var66.field6390[var102]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III[[ZZII)V", line = 2906)
    public final void method630(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class629 var8 = this.field4774.field7116;
        this.field4779 = arg5;
        this.field4770 = var8.field8826;
        this.field4769 = var8.field8821;
        this.field4767 = var8.field8845;
        this.field4778 = var8.field8820;
        this.field4781 = var8.field8838;
        this.field4764 = var8.field8841;
        this.field4772 = var8.field8815;
        this.field4783 = var8.field8827;
        this.field4766 = var8.field8836;
        this.field4771 = var8.field8833;
        this.field4765 = var8.field8816;
        this.field4776 = var8.field8817;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field4956 && var12 >= 0 && var12 < super.field4960) {
                        this.method2091(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "ka", descriptor = "(III)V", line = 2952)
    public final void method625(int arg0, int arg1, int arg2) {
        if (this.field4775[arg0][arg1] < arg2) {
            this.field4775[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 2958)
    public final void method632(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4777 == null) {
            this.field4777 = new class561[super.field4956][super.field4960];
            this.field4768 = new class437[super.field4956][super.field4960];
        } else if (this.field4780 != null || this.field4763 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field4958 != var20 || var21 != 0 && super.field4958 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class437 var22 = new class437();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field6384 = var23;
            var22.field6390 = new short[var23];
            var22.field6385 = new short[var23];
            var22.field6389 = new short[var23];
            var22.field6379 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field6390[var25] = (short) (this.field4773[arg0][arg1] - this.field4775[arg0][arg1]);
                } else if (var32 == 0 && super.field4958 == var33) {
                    var22.field6390[var25] = (short) (this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]);
                } else if (super.field4958 == var32 && super.field4958 == var33) {
                    var22.field6390[var25] = (short) (this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]);
                } else if (super.field4958 == var32 && var33 == 0) {
                    var22.field6390[var25] = (short) (this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]) * var32 + (this.field4773[arg0][arg1] - this.field4775[arg0][arg1]) * (super.field4958 - var32);
                    int var35 = (this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]) * var32 + (this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]) * (super.field4958 - var32);
                    var22.field6390[var25] = (short) ((super.field4958 - var33) * var34 + var33 * var35 >> super.field4962 * 2);
                }
                int var36 = (arg0 << super.field4962) + var32;
                int var37 = (arg1 << super.field4962) + var33;
                var22.field6385[var25] = (short) var32;
                var22.field6379[var25] = (short) var33;
                var22.field6389[var25] = (short) (this.method2162(var37, 1, var36) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field6390[var25] < 2) {
                    var22.field6390[var25] = 2;
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
                    class569 var31 = this.field4774.field7764.method1774(100, var30);
                    if (!var31.field8062) {
                        var26 = true;
                        if (this.method2093(var31.field8079) || var31.field8058 != 0 || var31.field8066 != 0) {
                            var22.field6378 = (byte) (var22.field6378 | 4);
                        }
                    }
                }
            }
            var22.field6388 = new int[var27];
            if (arg10 != null) {
                var22.field6391 = new int[var27];
            }
            var22.field6383 = new short[var27];
            var22.field6387 = new short[var27];
            var22.field6381 = new short[var27];
            if (var26) {
                var22.field6382 = new short[var27];
                var22.field6386 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field6388[var22.field6380] = class718.method3964(896, arg9[var29]);
                    } else {
                        var22.field6388[var22.field6380] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field6391[var22.field6380] = class718.method3964(896, arg10[var29]);
                        } else {
                            var22.field6391[var22.field6380] = -1;
                        }
                    }
                    var22.field6383[var22.field6380] = (short) arg6[var29];
                    var22.field6387[var22.field6380] = (short) arg7[var29];
                    var22.field6381[var22.field6380] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4774.field7764.method1774(65, arg11[var29]).field8062) {
                            var22.field6382[var22.field6380] = (short) arg11[var29];
                            var22.field6386[var22.field6380] = (short) arg12[var29];
                        } else {
                            var22.field6382[var22.field6380] = -1;
                        }
                    }
                    ++var22.field6380;
                }
            }
            this.field4768[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class561 var38 = new class561();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field7953 = class539.method3160(class718.method3964(896, arg10[0]), -6022, this.field4773[arg0][arg1] - this.field4775[arg0][arg1]);
                    if (var39 == -1) {
                        var38.field7949 = (byte) (var38.field7949 | 2);
                    }
                }
                if (super.field4957[arg0 + 1][arg1] == super.field4957[arg0][arg1] && super.field4957[arg0 + 1][arg1 + 1] == super.field4957[arg0][arg1] && super.field4957[arg0][arg1 + 1] == super.field4957[arg0][arg1]) {
                    var38.field7949 = (byte) (var38.field7949 | 1);
                }
                class569 var41 = null;
                if (var40 != -1) {
                    var41 = this.field4774.field7764.method1774(96, var40);
                }
                if (var41 != null && (var38.field7949 & 2) == 0 && !var41.field8062) {
                    var38.field7947 = (short) (this.field4773[arg0][arg1] - this.field4775[arg0][arg1]);
                    var38.field7948 = (short) (this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]);
                    var38.field7951 = (short) (this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]);
                    var38.field7952 = (short) (this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]);
                    var38.field7950 = (short) var40;
                    if (this.method2093(var41.field8079) || var41.field8058 != 0 || var41.field8066 != 0) {
                        var38.field7949 = (byte) (var38.field7949 | 4);
                    }
                } else {
                    short var42 = class718.method3964(896, var39);
                    var38.field7947 = (short) class539.method3160(var42, -6022, this.field4773[arg0][arg1] - this.field4775[arg0][arg1]);
                    var38.field7948 = (short) class539.method3160(var42, -6022, this.field4773[arg0 + 1][arg1] - this.field4775[arg0 + 1][arg1]);
                    var38.field7951 = (short) class539.method3160(var42, -6022, this.field4773[arg0 + 1][arg1 + 1] - this.field4775[arg0 + 1][arg1 + 1]);
                    var38.field7952 = (short) class539.method3160(var42, -6022, this.field4773[arg0][arg1 + 1] - this.field4775[arg0][arg1 + 1]);
                    var38.field7950 = -1;
                }
                this.field4777[arg0][arg1] = var38;
            }
        }
    }
}
