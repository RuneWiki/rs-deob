import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class64 extends class241 {

    @OriginalMember(owner = "client!so", name = "w", descriptor = "Let;")
    private class460 field930;

    @OriginalMember(owner = "client!so", name = "E", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "[[I")
    public int[][] field927;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "client!so", name = "A", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "[[B")
    private byte[][] field925;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "[[B")
    private byte[][] field932;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    private int field928;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    private int field929;

    @OriginalMember(owner = "client!so", name = "C", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!so", name = "D", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!so", name = "G", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "client!so", name = "H", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "[[Lh;")
    private class146[][] field931;

    @OriginalMember(owner = "client!so", name = "B", descriptor = "[[Lho;")
    private class197[][] field935;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "[[Lob;")
    private class244[][] field933;

    @OriginalMember(owner = "client!so", name = "F", descriptor = "[[Lfd;")
    private class288[][] field939;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII[[ZLda;[I[I)V")
    private final void method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class272 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3956 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field933[var16][var17] != null) {
                        class244 var18 = this.field933[var16][var17];
                        if (var18.field3544 != -1 && (var18.field3543 & 2) == 0 && var18.field3541 == 0) {
                            int var19 = this.field930.method2750(var18.field3544);
                            arg8.method1833(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class334.method2100((byte) 117, var19, var18.field3542), class334.method2100((byte) 115, var19, var18.field3538), class334.method2100((byte) 126, var19, var18.field3545));
                            arg8.method1833(var15, var15, var15 - var13, var14, var13 + var14, var14, class334.method2100((byte) 114, var19, var18.field3546), class334.method2100((byte) 114, var19, var18.field3545), class334.method2100((byte) 121, var19, var18.field3538));
                        } else if (var18.field3541 == 0) {
                            arg8.method1843(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3542, var18.field3538, var18.field3545);
                            arg8.method1843(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3546, var18.field3545, var18.field3538);
                        } else {
                            int var20 = var18.field3541;
                            arg8.method1843(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class411.method2459(var20, var18.field3542 & -16777216, -2153), class411.method2459(var20, var18.field3538 & -16777216, -2153), class411.method2459(var20, var18.field3545 & -16777216, -2153));
                            arg8.method1843(var15, var15, var15 - var13, var14, var13 + var14, var14, class411.method2459(var20, var18.field3546 & -16777216, -2153), class411.method2459(var20, var18.field3545 & -16777216, -2153), class411.method2459(var20, var18.field3538 & -16777216, -2153));
                        }
                    } else if (this.field935[var16][var17] != null) {
                        class197 var21 = this.field935[var16][var17];
                        for (int var22 = 0; var22 < var21.field2918; ++var22) {
                            arg9[var22] = (var21.field2921[var22] - this.field920 * var16) * var13 / this.field920 + var14;
                            arg10[var22] = var15 - (var21.field2919[var22] - this.field920 * var17) * var13 / this.field920;
                        }
                        for (int var23 = 0; var23 < var21.field2920; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2914 == null || var21.field2914[var23] == 0 || var21.field2915 != null && (var21.field2915 == null || var21.field2915[var23] != -1)) {
                                if (var21.field2915 != null && var21.field2915[var23] != -1) {
                                    int var34 = this.field930.method2750(var21.field2915[var23]);
                                    arg8.method1833(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method1843(var30, var31, var32, var27, var28, var29, var21.field2922[var24], var21.field2922[var25], var21.field2922[var26]);
                                }
                            } else {
                                int var33 = var21.field2914[var23];
                                arg8.method1843(var30, var31, var32, var27, var28, var29, class411.method2459(var33, -16777216 - (var21.field2922[var24] & -16777216), -2153), class411.method2459(var33, -16777216 - (var21.field2922[var25] & -16777216), -2153), class411.method2459(var33, -16777216 - (var21.field2922[var26] & -16777216), -2153));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3956 = true;
    }

    @OriginalMember(owner = "client!so", name = "f", descriptor = "(II)I")
    private static final int method574(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIZLda;[I[I[I)V")
    private final void method575(int arg0, int arg1, boolean arg2, class272 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class244 var8 = this.field933[arg0][arg1];
        if (var8 != null) {
            if ((var8.field3543 & 2) == 0) {
                int var9 = this.field920 * arg0;
                int var10 = this.field920 + var9;
                int var11 = this.field920 * arg1;
                int var12 = this.field920 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field3543 & 1) != 0 && !arg2) {
                    int var17 = this.field927[arg0][arg1];
                    int var18 = this.field923 * var17;
                    var19 = (this.field941 * var11 + this.field940 * var9 + var18 >> 15) + this.field942;
                    if (var19 <= this.field930.field6505) {
                        return;
                    }
                    var20 = (this.field941 * var11 + this.field940 * var10 + var18 >> 15) + this.field942;
                    if (var20 <= this.field930.field6505) {
                        return;
                    }
                    var21 = (this.field941 * var12 + this.field940 * var10 + var18 >> 15) + this.field942;
                    if (var21 <= this.field930.field6505) {
                        return;
                    }
                    var22 = (this.field941 * var12 + this.field940 * var9 + var18 >> 15) + this.field942;
                    if (var22 <= this.field930.field6505) {
                        return;
                    }
                    if (this.field930.field6510) {
                        int var23 = var19 - this.field930.field6494;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field930.field6494;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field930.field6494;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field930.field6494;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field924 * var17;
                    int var28 = this.field922 * var17;
                    var29 = (this.field928 * var11 + this.field929 * var9 + var27 >> 15) + this.field937;
                    var30 = this.field930.field6503 * var29 / var19 + arg3.field3946;
                    var31 = (this.field926 * var11 + this.field936 * var9 + var28 >> 15) + this.field921;
                    var32 = this.field930.field6481 * var31 / var19 + arg3.field3953;
                    var33 = (this.field928 * var11 + this.field929 * var10 + var27 >> 15) + this.field937;
                    var34 = this.field930.field6503 * var33 / var20 + arg3.field3946;
                    var35 = (this.field926 * var11 + this.field936 * var10 + var28 >> 15) + this.field921;
                    var36 = this.field930.field6481 * var35 / var20 + arg3.field3953;
                    var37 = (this.field928 * var12 + this.field929 * var10 + var27 >> 15) + this.field937;
                    var38 = this.field930.field6503 * var37 / var21 + arg3.field3946;
                    var39 = (this.field926 * var12 + this.field936 * var10 + var28 >> 15) + this.field921;
                    var40 = this.field930.field6481 * var39 / var21 + arg3.field3953;
                    var41 = (this.field928 * var12 + this.field929 * var9 + var27 >> 15) + this.field937;
                    var42 = this.field930.field6503 * var41 / var22 + arg3.field3946;
                    var43 = (this.field926 * var12 + this.field936 * var9 + var28 >> 15) + this.field921;
                    var44 = this.field930.field6481 * var43 / var22 + arg3.field3953;
                } else {
                    int var45 = this.field927[arg0][arg1];
                    int var46 = this.field927[arg0 + 1][arg1];
                    int var47 = this.field927[arg0 + 1][arg1 + 1];
                    int var48 = this.field927[arg0][arg1 + 1];
                    var19 = (this.field941 * var11 + this.field940 * var9 + this.field923 * var45 >> 15) + this.field942;
                    if (var19 <= this.field930.field6505) {
                        return;
                    }
                    var20 = (this.field941 * var11 + this.field940 * var10 + this.field923 * var46 >> 15) + this.field942;
                    if (var20 <= this.field930.field6505) {
                        return;
                    }
                    var21 = (this.field941 * var12 + this.field940 * var10 + this.field923 * var47 >> 15) + this.field942;
                    if (var21 <= this.field930.field6505) {
                        return;
                    }
                    var22 = (this.field941 * var12 + this.field940 * var9 + this.field923 * var48 >> 15) + this.field942;
                    if (var22 <= this.field930.field6505) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field930.field6494;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field3547 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field930.field6494;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field3539 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field930.field6494;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field3548 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field930.field6494;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field3540 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field930.field6510) {
                        int var57 = var19 - this.field930.field6494;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field930.field6494;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field930.field6494;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field930.field6494;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field928 * var11 + this.field929 * var9 + this.field924 * var45 >> 15) + this.field937;
                    var30 = this.field930.field6503 * var29 / var19 + arg3.field3946;
                    var31 = (this.field926 * var11 + this.field936 * var9 + this.field922 * var45 >> 15) + this.field921;
                    var32 = this.field930.field6481 * var31 / var19 + arg3.field3953;
                    var33 = (this.field928 * var11 + this.field929 * var10 + this.field924 * var46 >> 15) + this.field937;
                    var34 = this.field930.field6503 * var33 / var20 + arg3.field3946;
                    var35 = (this.field926 * var11 + this.field936 * var10 + this.field922 * var46 >> 15) + this.field921;
                    var36 = this.field930.field6481 * var35 / var20 + arg3.field3953;
                    var37 = (this.field928 * var12 + this.field929 * var10 + this.field924 * var47 >> 15) + this.field937;
                    var38 = this.field930.field6503 * var37 / var21 + arg3.field3946;
                    var39 = (this.field926 * var12 + this.field936 * var10 + this.field922 * var47 >> 15) + this.field921;
                    var40 = this.field930.field6481 * var39 / var21 + arg3.field3953;
                    var41 = (this.field928 * var12 + this.field929 * var9 + this.field924 * var48 >> 15) + this.field937;
                    var42 = this.field930.field6503 * var41 / var22 + arg3.field3946;
                    var43 = (this.field926 * var12 + this.field936 * var9 + this.field922 * var48 >> 15) + this.field921;
                    var44 = this.field930.field6481 * var43 / var22 + arg3.field3953;
                }
                boolean var61 = var8.field3544 != -1 && this.method581(this.field930.field1250.method1224((byte) 110, var8.field3544).field4368);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3947 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3949 || var42 > arg3.field3949 || var34 > arg3.field3949;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field3950 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field3544 >= 0) {
                                arg3.method1830(var40, var44, var36, var38, var42, var34, this.field930.field6519, var15, var16, var14, var8.field3542, var8.field3538, var8.field3545, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field3544);
                            } else {
                                arg3.method1843(var40, var44, var36, var38, var42, var34, class411.method2459(var8.field3542, var15 << 24 | this.field930.field6519, -2153), class411.method2459(var8.field3538, var16 << 24 | this.field930.field6519, -2153), class411.method2459(var8.field3545, var14 << 24 | this.field930.field6519, -2153));
                            }
                        } else if (var8.field3544 >= 0) {
                            arg3.method1837(var40, var44, var36, var38, var42, var34, var8.field3542, var8.field3538, var8.field3545, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field3544);
                        } else {
                            arg3.method1843(var40, var44, var36, var38, var42, var34, var8.field3542, var8.field3538, var8.field3545);
                        }
                        arg3.field3950 = 0;
                    } else {
                        arg3.method1844(var40, var44, var36, var38, var42, var34, this.field930.field6519);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3947 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3949 || var34 > arg3.field3949 || var42 > arg3.field3949;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field3950 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field3544 >= 0) {
                                arg3.method1830(var32, var36, var44, var30, var34, var42, this.field930.field6519, var13, var14, var16, var8.field3546, var8.field3545, var8.field3538, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field3544);
                            } else {
                                arg3.method1843(var32, var36, var44, var30, var34, var42, class411.method2459(var8.field3546, var13 << 24 | this.field930.field6519, -2153), class411.method2459(var8.field3545, var14 << 24 | this.field930.field6519, -2153), class411.method2459(var8.field3538, var16 << 24 | this.field930.field6519, -2153));
                            }
                        } else if (var8.field3544 >= 0) {
                            arg3.method1837(var32, var36, var44, var30, var34, var42, var8.field3546, var8.field3545, var8.field3538, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field3544);
                        } else {
                            arg3.method1843(var32, var36, var44, var30, var34, var42, var8.field3546, var8.field3545, var8.field3538);
                        }
                        arg3.field3950 = 0;
                        return;
                    }
                    arg3.method1844(var32, var36, var44, var30, var34, var42, this.field930.field6519);
                }
            }
        } else {
            class197 var64 = this.field935[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field2918; ++var65) {
                    short var105 = var64.field2921[var65];
                    int var106 = var64.field2917[var65];
                    short var107 = var64.field2919[var65];
                    int var108 = (this.field941 * var107 + this.field940 * var105 + this.field923 * var106 >> 15) + this.field942;
                    if (var108 <= this.field930.field6505) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field930.field6494;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field2916[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field930.field6510) {
                        int var111 = var108 - this.field930.field6494;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field928 * var107 + this.field929 * var105 + this.field924 * var106 >> 15) + this.field937;
                    int var113 = (this.field926 * var107 + this.field936 * var105 + this.field922 * var106 >> 15) + this.field921;
                    arg4[var65] = this.field930.field6503 * var112 / var108 + arg3.field3946;
                    arg5[var65] = this.field930.field6481 * var113 / var108 + arg3.field3953;
                }
                if (var64.field2915 != null) {
                    int var66 = this.field927[arg0][arg1];
                    int var67 = this.field927[arg0 + 1][arg1];
                    int var68 = this.field927[arg0][arg1 + 1];
                    int var69 = this.field920 * arg0;
                    int var70 = this.field920 + var69;
                    int var71 = this.field920 * arg1;
                    int var72 = this.field920 + var71;
                    int var73 = (this.field928 * var71 + this.field929 * var69 + this.field924 * var66 >> 15) + this.field937;
                    int var74 = (this.field926 * var71 + this.field936 * var69 + this.field922 * var66 >> 15) + this.field921;
                    int var75 = (this.field941 * var71 + this.field940 * var69 + this.field923 * var66 >> 15) + this.field942;
                    int var76 = (this.field928 * var71 + this.field929 * var70 + this.field924 * var67 >> 15) + this.field937;
                    int var77 = (this.field926 * var71 + this.field936 * var70 + this.field922 * var67 >> 15) + this.field921;
                    int var78 = (this.field941 * var71 + this.field940 * var70 + this.field923 * var67 >> 15) + this.field942;
                    int var79 = (this.field928 * var72 + this.field929 * var69 + this.field924 * var68 >> 15) + this.field937;
                    int var80 = (this.field926 * var72 + this.field936 * var69 + this.field922 * var68 >> 15) + this.field921;
                    int var81 = (this.field941 * var72 + this.field940 * var69 + this.field923 * var68 >> 15) + this.field942;
                    for (int var82 = 0; var82 < var64.field2920; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field3947 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field3949 || var87 > arg3.field3949 || var88 > arg3.field3949;
                            short var93 = var64.field2915[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method581(this.field930.field1250.method1224((byte) 110, var93).field4368)) {
                                    arg3.field3950 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method1830(var89, var90, var91, var86, var87, var88, this.field930.field6519, arg6[var83], arg6[var84], arg6[var85], var64.field2922[var83], var64.field2922[var84], var64.field2922[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field2922[var83] & 16777215) != 0) {
                                        arg3.method1843(var89, var90, var91, var86, var87, var88, class411.method2459(var64.field2922[var83], arg6[var83] << 24 | this.field930.field6519, -2153), class411.method2459(var64.field2922[var84], arg6[var84] << 24 | this.field930.field6519, -2153), class411.method2459(var64.field2922[var85], arg6[var85] << 24 | this.field930.field6519, -2153));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method1837(var89, var90, var91, var86, var87, var88, var64.field2922[var83], var64.field2922[var84], var64.field2922[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field2922[var83] & 16777215) != 0) {
                                    arg3.method1843(var89, var90, var91, var86, var87, var88, var64.field2922[var83], var64.field2922[var84], var64.field2922[var85]);
                                }
                                arg3.field3950 = 0;
                            } else {
                                arg3.method1844(var89, var90, var91, var86, var87, var88, this.field930.field6519);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field2920; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field3947 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field3949 || var99 > arg3.field3949 || var100 > arg3.field3949;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field2922[var95] & 16777215) != 0) {
                                    arg3.method1843(var101, var102, var103, var98, var99, var100, class104.method834(arg6[var95], this.field930.field6519, var64.field2922[var95], (byte) -73), class104.method834(arg6[var96], this.field930.field6519, var64.field2922[var96], (byte) -114), class104.method834(arg6[var97], this.field930.field6519, var64.field2922[var97], (byte) -100));
                                }
                            } else if ((var64.field2922[var95] & 16777215) != 0) {
                                arg3.method1843(var101, var102, var103, var98, var99, var100, var64.field2922[var95], var64.field2922[var96], var64.field2922[var97]);
                            }
                        } else {
                            arg3.method1844(var101, var102, var103, var98, var99, var100, this.field930.field6519);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
    public final void method576(int arg0, int arg1, int arg2) {
        if (this.field932[arg0][arg1] < arg2) {
            this.field932[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lnq;[I)V")
    public final void method577(class104 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Let;IIII[[I[[II)V")
    public class64(class460 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field930 = arg0;
        this.field938 = arg2;
        this.field927 = arg5;
        this.field920 = arg7;
        this.field934 = 0;
        while (arg7 > 1) {
            ++this.field934;
            arg7 >>= 1;
        }
        this.field925 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field930.field6482 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field930.field6508 * var18 + this.field930.field6497 * var16 + this.field930.field6480 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field925[var11][var10] = (byte) var20;
            }
        }
        this.field932 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method578(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field931 == null) {
            this.field931 = new class146[super.field3518][super.field3517];
            this.field939 = new class288[super.field3518][super.field3517];
        } else if (this.field933 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && this.field920 != var20 || var21 != 0 && this.field920 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class288 var22 = new class288();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4089 = var23;
            var22.field4087 = new short[var23];
            var22.field4085 = new int[var23];
            var22.field4084 = new int[var23];
            var22.field4094 = new int[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field4087[var25] = (short) (this.field925[arg0][arg1] - this.field932[arg0][arg1]);
                } else if (var30 == 0 && this.field920 == var31) {
                    var22.field4087[var25] = (short) (this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1]);
                } else if (this.field920 == var30 && this.field920 == var31) {
                    var22.field4087[var25] = (short) (this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1]);
                } else if (this.field920 == var30 && var31 == 0) {
                    var22.field4087[var25] = (short) (this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1]) * var30 + (this.field925[arg0][arg1] - this.field932[arg0][arg1]) * (this.field920 - var30);
                    int var33 = (this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1]) * var30 + (this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1]) * (this.field920 - var30);
                    var22.field4087[var25] = (short) ((this.field920 - var31) * var32 + var31 * var33 >> this.field934 * 2);
                }
                int var34 = (arg0 << this.field934) + var30;
                int var35 = (arg1 << this.field934) + var31;
                var22.field4085[var25] = var34;
                var22.field4094[var25] = var35;
                var22.field4084[var25] = this.method590(var34, var35) + (arg3 != null ? arg3[var25] : 0);
                if (var22.field4087[var25] < 2) {
                    var22.field4087[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field930.field1250.method1224((byte) 110, arg11[var28]).field4375) {
                    var26 = true;
                }
            }
            var22.field4093 = new int[var27];
            if (arg10 != null) {
                var22.field4083 = new int[var27];
            }
            var22.field4086 = new short[var27];
            var22.field4090 = new short[var27];
            var22.field4091 = new short[var27];
            if (var26) {
                var22.field4088 = new short[var27];
                var22.field4095 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4093[var22.field4092] = class487.method2868(-105, arg9[var29]);
                    } else {
                        var22.field4093[var22.field4092] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4083[var22.field4092] = class487.method2868(91, arg10[var29]);
                        } else {
                            var22.field4083[var22.field4092] = -1;
                        }
                    }
                    var22.field4086[var22.field4092] = (short) arg6[var29];
                    var22.field4090[var22.field4092] = (short) arg7[var29];
                    var22.field4091[var22.field4092] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field930.field1250.method1224((byte) 110, arg11[var29]).field4375) {
                            var22.field4088[var22.field4092] = (short) arg11[var29];
                            var22.field4095[var22.field4092] = (short) arg12[var29];
                        } else {
                            var22.field4088[var22.field4092] = -1;
                        }
                    }
                    ++var22.field4092;
                }
            }
            this.field939[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class146 var36 = new class146();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2013 = class334.method2100((byte) 121, class487.method2868(71, arg10[0]), this.field925[arg0][arg1] - this.field932[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field2008 = (byte) (var36.field2008 | 2);
                    }
                }
                if (this.field927[arg0 + 1][arg1] == this.field927[arg0][arg1] && this.field927[arg0 + 1][arg1 + 1] == this.field927[arg0][arg1] && this.field927[arg0][arg1 + 1] == this.field927[arg0][arg1]) {
                    var36.field2008 = (byte) (var36.field2008 | 1);
                }
                if (var38 != -1 && (var36.field2008 & 2) == 0 && !this.field930.field1250.method1224((byte) 110, var38).field4375) {
                    var36.field2007 = (short) (this.field925[arg0][arg1] - this.field932[arg0][arg1]);
                    var36.field2010 = (short) (this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1]);
                    var36.field2011 = (short) (this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1]);
                    var36.field2012 = (short) (this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1]);
                    var36.field2009 = (short) var38;
                } else {
                    short var39 = class487.method2868(-89, var37);
                    var36.field2007 = (short) class334.method2100((byte) 121, var39, this.field925[arg0][arg1] - this.field932[arg0][arg1]);
                    var36.field2010 = (short) class334.method2100((byte) 121, var39, this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1]);
                    var36.field2011 = (short) class334.method2100((byte) 113, var39, this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1]);
                    var36.field2012 = (short) class334.method2100((byte) 117, var39, this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1]);
                    var36.field2009 = -1;
                }
                this.field931[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method579(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field933 == null) {
            this.field933 = new class244[super.field3518][super.field3517];
            this.field935 = new class197[super.field3518][super.field3517];
        } else if (this.field931 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class21.field227[class487.method2868(-61, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class21.field227[class487.method2868(103, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == this.field920 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == this.field920 && arg4[var22] == this.field920) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == this.field920) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + this.field920 != arg2[var24] && arg2[0] - this.field920 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + this.field920 != arg4[var24] && arg4[0] - this.field920 != arg4[var24]) {
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
                class244 var25 = new class244();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field3541 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field3543 = (byte) (var25.field3543 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field927[arg0 + 1][arg1] == this.field927[arg0][arg1] && this.field927[arg0 + 1][arg1 + 1] == this.field927[arg0][arg1] && this.field927[arg0][arg1 + 1] == this.field927[arg0][arg1]) {
                    var25.field3543 = (byte) (var25.field3543 | 1);
                }
                if (var27 != -1 && (var25.field3543 & 2) == 0 && !this.field930.field1250.method1224((byte) 110, var27).field4375) {
                    var25.field3546 = this.field925[arg0][arg1] - this.field932[arg0][arg1];
                    var25.field3545 = this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1];
                    var25.field3542 = this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1];
                    var25.field3538 = this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1];
                    var25.field3544 = (short) var27;
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
                    var25.field3546 = class104.method834(var28, arg10, method574(arg6[var18] >> 8, this.field925[arg0][arg1] - this.field932[arg0][arg1]), (byte) -94);
                    if (var25.field3541 != 0) {
                        var25.field3546 |= 255 - (this.field925[arg0][arg1] - this.field932[arg0][arg1]) << 25;
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
                    var25.field3545 = class104.method834(var29, arg10, method574(arg6[var19] >> 8, this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1]), (byte) -92);
                    if (var25.field3541 != 0) {
                        var25.field3545 |= 255 - (this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1]) << 25;
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
                    var25.field3542 = class104.method834(var30, arg10, method574(arg6[var20] >> 8, this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1]), (byte) -75);
                    if (var25.field3541 != 0) {
                        var25.field3542 |= 255 - (this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field3538 = class104.method834(var31, arg10, method574(arg6[var21] >> 8, this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1]), (byte) -50);
                    if (var25.field3541 != 0) {
                        var25.field3538 |= 255 - (this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1]) << 25;
                    }
                    var25.field3544 = -1;
                }
                if (arg5 != null) {
                    var25.field3548 = (short) arg5[var20];
                    var25.field3540 = (short) arg5[var21];
                    var25.field3539 = (short) arg5[var19];
                    var25.field3547 = (short) arg5[var18];
                }
                this.field933[arg0][arg1] = var25;
            } else {
                class197 var32 = new class197();
                var32.field2918 = (short) arg2.length;
                var32.field2920 = (short) (arg2.length / 3);
                var32.field2921 = new short[var32.field2918];
                var32.field2917 = new short[var32.field2918];
                var32.field2919 = new short[var32.field2918];
                var32.field2922 = new int[var32.field2918];
                if (arg5 != null) {
                    var32.field2916 = new short[var32.field2918];
                }
                for (int var33 = 0; var33 < var32.field2918; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field925[arg0][arg1] - this.field932[arg0][arg1];
                    } else if (var48 == 0 && this.field920 == var49) {
                        var51 = this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1];
                    } else if (this.field920 == var48 && this.field920 == var49) {
                        var51 = this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1];
                    } else if (this.field920 == var48 && var49 == 0) {
                        var51 = this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field925[arg0 + 1][arg1] - this.field932[arg0 + 1][arg1]) * var48 + (this.field925[arg0][arg1] - this.field932[arg0][arg1]) * (this.field920 - var48);
                        int var53 = (this.field925[arg0 + 1][arg1 + 1] - this.field932[arg0 + 1][arg1 + 1]) * var48 + (this.field925[arg0][arg1 + 1] - this.field932[arg0][arg1 + 1]) * (this.field920 - var48);
                        var51 = (this.field920 - var49) * var52 + var49 * var53 >> this.field934 * 2;
                    }
                    short var54 = (short) ((arg0 << this.field934) + var48);
                    short var55 = (short) ((arg1 << this.field934) + var49);
                    var32.field2921[var33] = var54;
                    var32.field2919[var33] = var55;
                    var32.field2917[var33] = (short) (this.method590(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field930.field1250.method1224((byte) 110, arg8[var33]).field4375) {
                        var32.field2922[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field2922[var33] = var51 << 25;
                        } else {
                            var32.field2922[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field2916[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field2922[var33] = class104.method834(var56, arg10, method574(arg6[var33] >> 8, var51), (byte) -124);
                        if (arg7 != null) {
                            var32.field2922[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field2920; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field930.field1250.method1224((byte) 110, arg8[var35 * 3]).field4375) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field2914 = new int[var32.field2920];
                }
                if (var34) {
                    var32.field2915 = new short[var32.field2920];
                    var32.field2923 = new short[var32.field2920];
                }
                for (int var36 = 0; var36 < var32.field2920; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field2914[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field930.field1250.method1224((byte) 110, var42).field4375) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field930.field1250.method1224((byte) 110, var43).field4375) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field930.field1250.method1224((byte) 110, var44).field4375) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field2915[var36] = (short) var44;
                            var32.field2923[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field930.field1250.method1224((byte) 110, var45).field4375) {
                                    var32.field2922[var37] = class21.field227[class487.method2868(-102, this.field930.field1250.method1224((byte) 110, var45).field4365 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field930.field1250.method1224((byte) 110, var46).field4375) {
                                    var32.field2922[var38] = class21.field227[class487.method2868(70, this.field930.field1250.method1224((byte) 110, var46).field4365 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field930.field1250.method1224((byte) 110, var47).field4375) {
                                    var32.field2922[var39] = class21.field227[class487.method2868(-108, this.field930.field1250.method1224((byte) 110, var47).field4365 & 65535) & 65535];
                                }
                            }
                            var32.field2915[var36] = -1;
                        }
                    }
                }
                this.field935[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "()V")
    public final void method580() {
        this.field925 = null;
        this.field932 = null;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)Z")
    private final boolean method581(int arg0) {
        if ((this.field938 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Ldh;IIIIZ)V")
    public final void method582(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ldh;IIIIZ)Z")
    public final boolean method583(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IIIIIII[[ZLda;[I[I)V")
    private final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class272 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3956 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field931[var16][var17] != null) {
                        class146 var18 = this.field931[var16][var17];
                        if (var18.field2009 != -1 && (var18.field2008 & 2) == 0 && var18.field2013 == -1) {
                            int var19 = this.field930.method2750(var18.field2009);
                            arg8.method1833(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class334.method2100((byte) 126, var19, var18.field2011 & 65535), class334.method2100((byte) 124, var19, var18.field2012 & 65535), class334.method2100((byte) 127, var19, var18.field2010 & 65535));
                            arg8.method1833(var15, var15, var15 - var13, var14, var13 + var14, var14, class334.method2100((byte) 120, var19, var18.field2007 & 65535), class334.method2100((byte) 117, var19, var18.field2010 & 65535), class334.method2100((byte) 126, var19, var18.field2012 & 65535));
                        } else if (var18.field2013 == -1) {
                            arg8.method1833(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2011 & 65535, var18.field2012 & 65535, var18.field2010 & 65535);
                            arg8.method1833(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2007 & 65535, var18.field2010 & 65535, var18.field2012 & 65535);
                        } else {
                            int var20 = var18.field2013;
                            arg8.method1833(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1833(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field939[var16][var17] != null) {
                        class288 var21 = this.field939[var16][var17];
                        for (int var22 = 0; var22 < var21.field4089; ++var22) {
                            arg9[var22] = (var21.field4085[var22] - this.field920 * var16) * var13 / this.field920 + var14;
                            arg10[var22] = var15 - (var21.field4094[var22] - this.field920 * var17) * var13 / this.field920;
                        }
                        for (int var23 = 0; var23 < var21.field4092; ++var23) {
                            short var24 = var21.field4086[var23];
                            short var25 = var21.field4090[var23];
                            short var26 = var21.field4091[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4083 != null && var21.field4083[var23] != -1) {
                                int var33 = var21.field4083[var23];
                                arg8.method1833(var30, var31, var32, var27, var28, var29, class334.method2100((byte) 114, var33, var21.field4087[var24]), class334.method2100((byte) 115, var33, var21.field4087[var25]), class334.method2100((byte) 126, var33, var21.field4087[var26]));
                            } else if (var21.field4088 != null && var21.field4088[var23] != -1) {
                                int var34 = this.field930.method2750(var21.field4088[var23]);
                                arg8.method1833(var30, var31, var32, var27, var28, var29, class334.method2100((byte) 125, var34, var21.field4087[var24]), class334.method2100((byte) 121, var34, var21.field4087[var25]), class334.method2100((byte) 127, var34, var21.field4087[var26]));
                            } else {
                                int var35 = var21.field4093[var23];
                                arg8.method1833(var30, var31, var32, var27, var28, var29, class334.method2100((byte) 122, var35, var21.field4087[var24]), class334.method2100((byte) 115, var35, var21.field4087[var25]), class334.method2100((byte) 118, var35, var21.field4087[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3956 = true;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class132 var9 = this.field930.method2757(Thread.currentThread());
        class272 var10 = var9.field1811;
        var10.field3950 = 0;
        var10.field3947 = false;
        if (this.field933 != null) {
            this.method573(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1823, var9.field1815);
        } else {
            if (this.field931 != null) {
                this.method584(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1823, var9.field1815);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILdh;)Ldh;")
    public final class183 method586(int arg0, int arg1, class183 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III[[ZZ)V")
    public final void method587(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class224 var6 = this.field930.field6495;
        this.field929 = var6.field3236;
        this.field924 = var6.field3227;
        this.field928 = var6.field3229;
        this.field937 = var6.field3232;
        this.field936 = var6.field3228;
        this.field922 = var6.field3237;
        this.field926 = var6.field3226;
        this.field921 = var6.field3231;
        this.field940 = var6.field3230;
        this.field923 = var6.field3233;
        this.field941 = var6.field3235;
        this.field942 = var6.field3234;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
    public final void method588(int arg0, int arg1) {
        class132 var3 = this.field930.method2757(Thread.currentThread());
        var3.field1811.field3950 = 0;
        if (this.field933 != null) {
            this.method575(arg0, arg1, this.field930.field6486, var3.field1811, var3.field1823, var3.field1815, var3.field1844);
        } else {
            if (this.field931 != null) {
                this.method592(arg0, arg1, var3.field1811, var3.field1823, var3.field1815, var3.field1844);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(Ldh;IIIIZ)V")
    public final void method589(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(II)I")
    public final int method590(int arg0, int arg1) {
        int var3 = arg0 >> this.field934;
        int var4 = arg1 >> this.field934;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field3518 - 1 && var4 <= super.field3517 - 1) {
            int var5 = arg0 & this.field920 - 1;
            int var6 = arg1 & this.field920 - 1;
            int var7 = (this.field920 - var5) * this.field927[var3][var4] + this.field927[var3 + 1][var4] * var5 >> this.field934;
            int var8 = (this.field920 - var5) * this.field927[var3][var4 + 1] + this.field927[var3 + 1][var4 + 1] * var5 >> this.field934;
            return (this.field920 - var6) * var7 + var6 * var8 >> this.field934;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!so", name = "e", descriptor = "(II)I")
    public final int method591(int arg0, int arg1) {
        return this.field927[arg0][arg1];
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILda;[I[I[I)V")
    private final void method592(int arg0, int arg1, class272 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class146 var7 = this.field931[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2008 & 2) == 0) {
                int var8 = this.field920 * arg0;
                int var9 = this.field920 + var8;
                int var10 = this.field920 * arg1;
                int var11 = this.field920 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field2008 & 1) != 0) {
                    int var12 = this.field927[arg0][arg1];
                    int var13 = this.field923 * var12;
                    var14 = (this.field941 * var10 + this.field940 * var8 + var13 >> 15) + this.field942;
                    if (var14 <= this.field930.field6505) {
                        return;
                    }
                    var15 = (this.field941 * var10 + this.field940 * var9 + var13 >> 15) + this.field942;
                    if (var15 <= this.field930.field6505) {
                        return;
                    }
                    int var16 = (this.field941 * var11 + this.field940 * var9 + var13 >> 15) + this.field942;
                    if (var16 <= this.field930.field6505) {
                        return;
                    }
                    var17 = (this.field941 * var11 + this.field940 * var8 + var13 >> 15) + this.field942;
                    if (var17 <= this.field930.field6505) {
                        return;
                    }
                    int var18 = this.field924 * var12;
                    int var19 = this.field922 * var12;
                    var20 = (this.field928 * var10 + this.field929 * var8 + var18 >> 15) + this.field937;
                    var21 = this.field930.field6503 * var20 / var14 + arg2.field3946;
                    var22 = (this.field926 * var10 + this.field936 * var8 + var19 >> 15) + this.field921;
                    var23 = this.field930.field6481 * var22 / var14 + arg2.field3953;
                    var24 = (this.field928 * var10 + this.field929 * var9 + var18 >> 15) + this.field937;
                    var25 = this.field930.field6503 * var24 / var15 + arg2.field3946;
                    var26 = (this.field926 * var10 + this.field936 * var9 + var19 >> 15) + this.field921;
                    var27 = this.field930.field6481 * var26 / var15 + arg2.field3953;
                    int var28 = (this.field928 * var11 + this.field929 * var9 + var18 >> 15) + this.field937;
                    var29 = this.field930.field6503 * var28 / var16 + arg2.field3946;
                    int var30 = (this.field926 * var11 + this.field936 * var9 + var19 >> 15) + this.field921;
                    var31 = this.field930.field6481 * var30 / var16 + arg2.field3953;
                    var32 = (this.field928 * var11 + this.field929 * var8 + var18 >> 15) + this.field937;
                    var33 = this.field930.field6503 * var32 / var17 + arg2.field3946;
                    var34 = (this.field926 * var11 + this.field936 * var8 + var19 >> 15) + this.field921;
                    var35 = this.field930.field6481 * var34 / var17 + arg2.field3953;
                } else {
                    int var36 = this.field927[arg0][arg1];
                    int var37 = this.field927[arg0 + 1][arg1];
                    int var38 = this.field927[arg0 + 1][arg1 + 1];
                    int var39 = this.field927[arg0][arg1 + 1];
                    var14 = (this.field941 * var10 + this.field940 * var8 + this.field923 * var36 >> 15) + this.field942;
                    if (var14 <= this.field930.field6505) {
                        return;
                    }
                    var15 = (this.field941 * var10 + this.field940 * var9 + this.field923 * var37 >> 15) + this.field942;
                    if (var15 <= this.field930.field6505) {
                        return;
                    }
                    int var40 = (this.field941 * var11 + this.field940 * var9 + this.field923 * var38 >> 15) + this.field942;
                    if (var40 <= this.field930.field6505) {
                        return;
                    }
                    var17 = (this.field941 * var11 + this.field940 * var8 + this.field923 * var39 >> 15) + this.field942;
                    if (var17 <= this.field930.field6505) {
                        return;
                    }
                    var20 = (this.field928 * var10 + this.field929 * var8 + this.field924 * var36 >> 15) + this.field937;
                    var21 = this.field930.field6503 * var20 / var14 + arg2.field3946;
                    var22 = (this.field926 * var10 + this.field936 * var8 + this.field922 * var36 >> 15) + this.field921;
                    var23 = this.field930.field6481 * var22 / var14 + arg2.field3953;
                    var24 = (this.field928 * var10 + this.field929 * var9 + this.field924 * var37 >> 15) + this.field937;
                    var25 = this.field930.field6503 * var24 / var15 + arg2.field3946;
                    var26 = (this.field926 * var10 + this.field936 * var9 + this.field922 * var37 >> 15) + this.field921;
                    var27 = this.field930.field6481 * var26 / var15 + arg2.field3953;
                    int var41 = (this.field928 * var11 + this.field929 * var9 + this.field924 * var38 >> 15) + this.field937;
                    var29 = this.field930.field6503 * var41 / var40 + arg2.field3946;
                    int var42 = (this.field926 * var11 + this.field936 * var9 + this.field922 * var38 >> 15) + this.field921;
                    var31 = this.field930.field6481 * var42 / var40 + arg2.field3953;
                    var32 = (this.field928 * var11 + this.field929 * var8 + this.field924 * var39 >> 15) + this.field937;
                    var33 = this.field930.field6503 * var32 / var17 + arg2.field3946;
                    var34 = (this.field926 * var11 + this.field936 * var8 + this.field922 * var39 >> 15) + this.field921;
                    var35 = this.field930.field6481 * var34 / var17 + arg2.field3953;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3947 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3949 || var33 > arg2.field3949 || var25 > arg2.field3949;
                    if (var7.field2009 >= 0) {
                        if (this.method581(this.field930.field1250.method1224((byte) 110, var7.field2009).field4368)) {
                            arg2.field3950 = 100;
                        }
                        arg2.method1837(var31, var35, var27, var29, var33, var25, var7.field2011 & 65535, var7.field2012 & 65535, var7.field2010 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2009);
                        arg2.field3950 = 0;
                    } else {
                        arg2.method1833(var31, var35, var27, var29, var33, var25, var7.field2011 & 65535, var7.field2012 & 65535, var7.field2010 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3947 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3949 || var25 > arg2.field3949 || var33 > arg2.field3949;
                    if (var7.field2009 >= 0) {
                        if (this.method581(this.field930.field1250.method1224((byte) 110, var7.field2009).field4368)) {
                            arg2.field3950 = 100;
                        }
                        arg2.method1837(var23, var27, var35, var21, var25, var33, var7.field2007 & 65535, var7.field2010 & 65535, var7.field2012 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2009);
                        arg2.field3950 = 0;
                        return;
                    }
                    arg2.method1833(var23, var27, var35, var21, var25, var33, var7.field2007 & 65535, var7.field2010 & 65535, var7.field2012 & 65535);
                }
            }
        } else {
            class288 var43 = this.field939[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field4089; ++var44) {
                    int var84 = var43.field4085[var44];
                    int var85 = var43.field4084[var44];
                    int var86 = var43.field4094[var44];
                    int var87 = (this.field941 * var86 + this.field940 * var84 + this.field923 * var85 >> 15) + this.field942;
                    if (var87 <= this.field930.field6505) {
                        return;
                    }
                    int var88 = (this.field928 * var86 + this.field929 * var84 + this.field924 * var85 >> 15) + this.field937;
                    int var89 = (this.field926 * var86 + this.field936 * var84 + this.field922 * var85 >> 15) + this.field921;
                    arg3[var44] = this.field930.field6503 * var88 / var87 + arg2.field3946;
                    arg4[var44] = this.field930.field6481 * var89 / var87 + arg2.field3953;
                }
                if (var43.field4088 != null) {
                    int var45 = this.field927[arg0][arg1];
                    int var46 = this.field927[arg0 + 1][arg1];
                    int var47 = this.field927[arg0][arg1 + 1];
                    int var48 = this.field920 * arg0;
                    int var49 = this.field920 + var48;
                    int var50 = this.field920 * arg1;
                    int var51 = this.field920 + var50;
                    int var52 = (this.field928 * var50 + this.field929 * var48 + this.field924 * var45 >> 15) + this.field937;
                    int var53 = (this.field926 * var50 + this.field936 * var48 + this.field922 * var45 >> 15) + this.field921;
                    int var54 = (this.field941 * var50 + this.field940 * var48 + this.field923 * var45 >> 15) + this.field942;
                    int var55 = (this.field928 * var50 + this.field929 * var49 + this.field924 * var46 >> 15) + this.field937;
                    int var56 = (this.field926 * var50 + this.field936 * var49 + this.field922 * var46 >> 15) + this.field921;
                    int var57 = (this.field941 * var50 + this.field940 * var49 + this.field923 * var46 >> 15) + this.field942;
                    int var58 = (this.field928 * var51 + this.field929 * var48 + this.field924 * var47 >> 15) + this.field937;
                    int var59 = (this.field926 * var51 + this.field936 * var48 + this.field922 * var47 >> 15) + this.field921;
                    int var60 = (this.field941 * var51 + this.field940 * var48 + this.field923 * var47 >> 15) + this.field942;
                    for (int var61 = 0; var61 < var43.field4092; ++var61) {
                        short var62 = var43.field4086[var61];
                        short var63 = var43.field4090[var61];
                        short var64 = var43.field4091[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field3947 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field3949 || var66 > arg2.field3949 || var67 > arg2.field3949;
                            short var71 = var43.field4088[var61];
                            if (var71 != -1) {
                                if (this.method581(this.field930.field1250.method1224((byte) 110, var71).field4368)) {
                                    arg2.field3950 = 100;
                                }
                                arg2.method1837(var68, var69, var70, var65, var66, var67, var43.field4087[var62], var43.field4087[var63], var43.field4087[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field3950 = 0;
                            } else {
                                int var72 = var43.field4093[var61];
                                if (var72 != -1) {
                                    arg2.method1833(var68, var69, var70, var65, var66, var67, class334.method2100((byte) 113, var72, var43.field4087[var62]), class334.method2100((byte) 118, var72, var43.field4087[var63]), class334.method2100((byte) 119, var72, var43.field4087[var64]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field4092; ++var73) {
                    short var74 = var43.field4086[var73];
                    short var75 = var43.field4090[var73];
                    short var76 = var43.field4091[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field4093[var73];
                        if (var83 != -1) {
                            arg2.field3947 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field3949 || var78 > arg2.field3949 || var79 > arg2.field3949;
                            arg2.method1833(var80, var81, var82, var77, var78, var79, class334.method2100((byte) 116, var83, var43.field4087[var74]), class334.method2100((byte) 125, var83, var43.field4087[var75]), class334.method2100((byte) 120, var83, var43.field4087[var76]));
                        }
                    }
                }
            }
        }
    }
}
