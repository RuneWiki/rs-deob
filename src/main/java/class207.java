import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class207 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3265 = -1;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public static int[] field3264 = new int[500];

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3267 = 0;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Llb;")
    public static class211 field3263;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[[[B")
    public static byte[][][] field3268;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 7)
    public static void method1477(byte arg0) {
        field3263 = null;
        if (arg0 != 112) {
            method1479(false, (byte) -109, (class323[]) null);
        }
        field3268 = (byte[][][]) null;
        field3264 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIZ[IIIIII)V", line = 31)
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3266++;
        int var11 = arg6;
        if (class168.field2522 <= arg6) {
            return;
        }
        int var12 = arg6 + arg3;
        if (arg6 < class168.field2528) {
            var11 = class168.field2528;
        }
        if (var12 <= class168.field2528) {
            return;
        }
        if (var12 > class168.field2522) {
            var12 = class168.field2522;
        }
        if (arg2 != 2) {
            field3267 = -1;
        }
        int var13 = arg0;
        if (class168.field2526 <= arg0) {
            return;
        }
        int var14 = arg0 + arg8;
        if (class168.field2530 > arg0) {
            var13 = class168.field2530;
        }
        if (var14 <= class168.field2530) {
            return;
        }
        if (class168.field2526 < var14) {
            var14 = class168.field2526;
        }
        int var15 = var14 - arg0;
        if (arg7 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        int var16 = class168.field2527 + var11 - var12;
        int var17 = class168.field2527 * var13 + var11;
        int var18 = var12 - arg6;
        int var19 = var11 - arg6;
        int var20 = var13 - arg0;
        int var21 = arg3 - var18;
        int var22 = arg3 - var19;
        int var23 = arg8 - var20;
        int var24 = arg8 - var15;
        if (arg7 == 1) {
            if (arg9 == 0) {
                for (int var87 = var20; var87 < var15; var87++) {
                    for (int var88 = var19; var88 < var18; var88++) {
                        if (var87 >= var88) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 1) {
                for (int var85 = var23 - 1; var85 >= var24; var85--) {
                    for (int var86 = var19; var86 < var18; var86++) {
                        if (var85 >= var86) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 2) {
                for (int var83 = var20; var83 < var15; var83++) {
                    for (int var84 = var19; var84 < var18; var84++) {
                        if (var84 >= var83) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 3) {
                for (int var81 = var23 - 1; var81 >= var24; var81--) {
                    for (int var82 = var19; var82 < var18; var82++) {
                        if (var81 <= var82) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg7 == 2) {
            if (arg9 == 0) {
                for (int var73 = var23 - 1; var73 >= var24; var73--) {
                    for (int var74 = var19; var74 < var18; var74++) {
                        if ((var73 >> 1) >= var74) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 1) {
                for (int var79 = var20; var79 < var15; var79++) {
                    for (int var80 = var19; var80 < var18; var80++) {
                        if (var17 >= 0 && var17 < arg5.length) {
                            if (var79 << 1 <= var80) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        } else {
                            var17++;
                        }
                    }
                    var17 += var16;
                }
            } else if (arg9 == 2) {
                for (int var75 = var20; var75 < var15; var75++) {
                    for (int var76 = var22 - 1; var76 >= var21; var76--) {
                        if (var76 <= (var75 >> 1)) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 3) {
                for (int var77 = var23 - 1; var77 >= var24; var77--) {
                    for (int var78 = var22 - 1; var78 >= var21; var78--) {
                        if (var78 >= var77 << 1) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg7 == 3) {
            if (arg9 == 0) {
                for (int var25 = var23 - 1; var25 >= var24; var25--) {
                    for (int var26 = var22 - 1; var26 >= var21; var26--) {
                        if (var26 <= var25 >> 1) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 1) {
                for (int var31 = var23 - 1; var31 >= var24; var31--) {
                    for (int var32 = var19; var32 < var18; var32++) {
                        if (var31 << 1 <= var32) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 2) {
                for (int var27 = var20; var27 < var15; var27++) {
                    for (int var28 = var19; var28 < var18; var28++) {
                        if (var27 >> 1 >= var28) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 3) {
                for (int var29 = var20; var29 < var15; var29++) {
                    for (int var30 = var22 - 1; var30 >= var21; var30--) {
                        if ((var29 << 1) <= var30) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg7 == 4) {
            if (arg9 == 0) {
                for (int var39 = var23 - 1; var39 >= var24; var39--) {
                    for (int var40 = var19; var40 < var18; var40++) {
                        if (var40 >= var39 >> 1) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 1) {
                for (int var37 = var20; var37 < var15; var37++) {
                    for (int var38 = var19; var38 < var18; var38++) {
                        if ((var37 << 1) >= var38) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 2) {
                for (int var35 = var20; var35 < var15; var35++) {
                    for (int var36 = var22 - 1; var36 >= var21; var36--) {
                        if (var36 >= var35 >> 1) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg9 == 3) {
                for (int var33 = var23 - 1; var33 >= var24; var33--) {
                    for (int var34 = var22 - 1; var34 >= var21; var34--) {
                        if (var34 <= var33 << 1) {
                            arg5[var17] = arg10;
                        } else if (arg4) {
                            arg5[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg9 == 0) {
                    for (int var49 = var20; var49 < var15; var49++) {
                        for (int var50 = var19; var50 < var18; var50++) {
                            if (arg3 / 2 >= var50) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var51 = var20; var51 < var15; var51++) {
                        for (int var52 = var19; var52 < var18; var52++) {
                            if (arg8 / 2 >= var51) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var55 = var20; var55 < var15; var55++) {
                        for (int var56 = var19; var56 < var18; var56++) {
                            if (var56 >= (arg3 / 2)) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var53 = var20; var53 < var15; var53++) {
                        for (int var54 = var19; var54 < var18; var54++) {
                            if (var53 >= (arg8 / 2)) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg9 == 0) {
                    for (int var63 = var20; var63 < var15; var63++) {
                        for (int var64 = var19; var64 < var18; var64++) {
                            if (var63 - (arg8 / 2) >= var64) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var57 = var23 - 1; var57 >= var24; var57--) {
                        for (int var58 = var19; var58 < var18; var58++) {
                            if ((var57 - (arg8 / 2)) >= var58) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var61 = var23 - 1; var61 >= var24; var61--) {
                        for (int var62 = var22 - 1; var62 >= var21; var62--) {
                            if (var62 <= var61 - (arg8 / 2)) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var59 = var20; var59 < var15; var59++) {
                        for (int var60 = var22 - 1; var60 >= var21; var60--) {
                            if (var59 - (arg8 / 2) >= var60) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg9 == 0) {
                    for (int var65 = var20; var65 < var15; var65++) {
                        for (int var66 = var19; var66 < var18; var66++) {
                            if (var66 >= var65 - arg8 / 2) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var23 - 1; var67 >= var24; var67--) {
                        for (int var68 = var19; var68 < var18; var68++) {
                            if ((var67 - (arg8 / 2)) <= var68) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var71 = var23 - 1; var71 >= var24; var71--) {
                        for (int var72 = var22 - 1; var72 >= var21; var72--) {
                            if (var71 - (arg8 / 2) <= var72) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var69 = var20; var69 < var15; var69++) {
                        for (int var70 = var22 - 1; var70 >= var21; var70--) {
                            if (var69 - (arg8 / 2) <= var70) {
                                arg5[var17] = arg10;
                            } else if (arg4) {
                                arg5[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var41 = var23 - 1; var41 >= var24; var41--) {
                for (int var42 = var22 - 1; var42 >= var21; var42--) {
                    if ((var41 >> 1) <= var42) {
                        arg5[var17] = arg10;
                    } else if (arg4) {
                        arg5[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg9 == 1) {
            for (int var47 = var23 - 1; var47 >= var24; var47--) {
                for (int var48 = var19; var48 < var18; var48++) {
                    if (var48 <= (var47 << 1)) {
                        arg5[var17] = arg10;
                    } else if (arg4) {
                        arg5[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg9 == 2) {
            for (int var43 = var20; var43 < var15; var43++) {
                for (int var44 = var19; var44 < var18; var44++) {
                    if ((var43 >> 1) <= var44) {
                        arg5[var17] = arg10;
                    } else if (arg4) {
                        arg5[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg9 == 3) {
            for (int var45 = var20; var45 < var15; var45++) {
                for (int var46 = var22 - 1; var46 >= var21; var46--) {
                    if (var46 <= var45 << 1) {
                        arg5[var17] = arg10;
                    } else if (arg4) {
                        arg5[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZB[Lal;)V", line = 1234)
    public static final void method1479(boolean arg0, byte arg1, class323[] arg2) {
        field3269++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class208.field3272[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class208.field3272[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method2210(var5, true, var4);
                            }
                        }
                    }
                }
            }
            class209.field3293 += (int) (Math.random() * 5.0D) - 2;
            class102.field1578 += (int) (Math.random() * 5.0D) - 2;
            if (class209.field3293 < -16) {
                class209.field3293 = -16;
            }
            if (class209.field3293 > 16) {
                class209.field3293 = 16;
            }
            if (class102.field1578 < -8) {
                class102.field1578 = -8;
            }
            if (class102.field1578 > 8) {
                class102.field1578 = 8;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class102.field1578 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class209.field3293 >> 1;
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var13 = class277.field4260[var12];
            if (!class36.field534) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class41.field612[var12][var37 + 1][var36] - class41.field612[var12][var37 - 1][var36];
                        int var40 = class41.field612[var12][var37][var36 + 1] - class41.field612[var12][var37][var36 - 1];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + var39 * var39 + 65536));
                        int var42 = (var40 << 8) / var41;
                        int var43 = (var13[var37][var36] >> 1) + (var13[var37][var36 - 1] >> 2) + (var13[var37][var36 + 1] >> 3) + (var13[var37 - 1][var36] >> 2) + (var13[var37 + 1][var36] >> 3);
                        int var44 = -65536 / var41;
                        int var45 = (var39 << 8) / var41;
                        int var46 = (var45 * -50 + var42 * -50 + var44 * -10) / var35 + var38;
                        var9[var37][var36] = var46 - var43;
                    }
                }
            } else if (class175.field2589) {
                for (int var30 = 1; var30 < 103; var30++) {
                    for (int var31 = 1; var31 < 103; var31++) {
                        byte var32 = 74;
                        int var33 = (var13[var31][var30] >> 1) + (var13[var31][var30 + 1] >> 3) + ((var13[var31][var30 + -1] >> 2) + (var13[var31 - 1][var30] >> 2) - -(var13[var31 + 1][var30] >> 3));
                        var9[var31][var30] = var32 - var33;
                    }
                }
            } else {
                int var14 = (int) class264.field3941[1];
                int var15 = (int) class264.field3941[2];
                int var16 = (int) class264.field3941[0];
                int var17 = (int) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
                int var18 = var17 * 1024 >> 8;
                for (int var19 = 1; var19 < 103; var19++) {
                    for (int var20 = 1; var20 < 103; var20++) {
                        byte var21 = 96;
                        int var22 = class41.field612[var12][var20 + 1][var19] - class41.field612[var12][var20 - 1][var19];
                        int var23 = class41.field612[var12][var20][var19 + 1] - class41.field612[var12][var20][var19 - 1];
                        int var24 = (int) Math.sqrt((double) (var22 * var22 + var23 * var23 + 65536));
                        int var25 = -65536 / var24;
                        int var26 = (var22 << 8) / var24;
                        int var27 = (var13[var20][var19 - 1] >> 2) + (var13[var20 - 1][var19] >> 2) + (var13[var20 - -1][var19] >> 3) - (-(var13[var20][var19 + 1] >> 3) + -(var13[var20][var19] >> 1));
                        int var28 = (var23 << 8) / var24;
                        int var29 = (var15 * var28 + (var16 * var26 + (var14 * var25))) / var18 + var21;
                        var9[var20][var19] = var29 - ((int) ((float) var27 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class125.field1983[var47] = 0;
                class263.field3931[var47] = 0;
                class199.field3148[var47] = 0;
                class17.field191[var47] = 0;
                class328.field5085[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class314.field4872[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class200 var52 = class236.method1656(var51 - 1, false);
                            class125.field1983[var49] += var52.field3178;
                            class263.field3931[var49] += var52.field3171;
                            class199.field3148[var49] += var52.field3177;
                            class17.field191[var49] += var52.field3161;
                            var10002 = class328.field5085[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class314.field4872[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class200 var55 = class236.method1656(var54 - 1, false);
                            class125.field1983[var49] -= var55.field3178;
                            class263.field3931[var49] -= var55.field3171;
                            class199.field3148[var49] -= var55.field3177;
                            class17.field191[var49] -= var55.field3161;
                            var10002 = class328.field5085[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 < 104) {
                            var57 += class125.field1983[var63];
                            var56 += class263.field3931[var63];
                            var59 += class328.field5085[var63];
                            var60 += class17.field191[var63];
                            var58 += class199.field3148[var63];
                        }
                        if (var62 >= 0) {
                            var58 -= class199.field3148[var62];
                            var59 -= class328.field5085[var62];
                            var60 -= class17.field191[var62];
                            var56 -= class263.field3931[var62];
                            var57 -= class125.field1983[var62];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var10[var48][var61] = class96.method764(var56 / var59, var58 / var59, -44, var57 * 256 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label777: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg0 || class252.method1753(-8090) || (class208.field3272[0][var64][var65] & 0x2) != 0 || (class208.field3272[var12][var64][var65] & 0x10) == 0 && class269.method1870(var65, var64, -30, var12) == class167.field2507) {
                        if (class43.field680 > var12) {
                            class43.field680 = var12;
                        }
                        int var66 = class314.field4872[var12][var64][var65] & 0xFF;
                        int var67 = class323.field5018[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class41.field612[var12][var64][var65];
                            int var69 = class41.field612[var12][var64 + 1][var65];
                            int var70 = class41.field612[var12][var64 + 1][var65 + 1];
                            int var71 = class41.field612[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class65.field963[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class116.method904((byte) 107, var67 - 1).field4975) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var68 == var70 && var68 == var71) {
                                    class58.field868[var12][var64][var65] = class147.method1098(class58.field868[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = -1;
                                var74 = 0;
                            } else {
                                var73 = var10[var64][var65];
                                int var75 = (var73 & 0x7F) + var11;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var73 + var8 & 0xFC00) + (var73 & 0x380) + var75;
                                var74 = class56.field832[class58.method522((byte) -109, 96, var76)];
                            }
                            int var77 = var9[var64][var65];
                            int var78 = var9[var64 + 1][var65];
                            int var79 = var9[var64 + 1][var65 + 1];
                            int var80 = var9[var64][var65 + 1];
                            if (var67 == 0) {
                                class65.method554(var12, var64, var65, 0, 0, -1, var68, var69, var70, var71, class58.method522((byte) 106, var77, var73), class58.method522((byte) 125, var78, var73), class58.method522((byte) 77, var79, var73), class58.method522((byte) 77, var80, var73), 0, 0, 0, 0, var74, 0);
                                if (class36.field534 && var12 > 0 && var73 != -1 && class236.method1656(var66 - 1, false).field3167) {
                                    class247.method1716(0, 0, true, false, var64, var65, var68 - class41.field612[0][var64][var65], -class41.field612[0][var64 + 1][var65] + var69, var70 - class41.field612[0][var64 + 1][var65 + 1], var71 - class41.field612[0][var64][var65 + 1]);
                                }
                                if (class36.field534 && !arg0 && class118.field1871 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= (var64 + 1); var96++) {
                                        for (int var97 = var65 - 1; var97 <= (var65 + 1); var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class323.field5018[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class319 var99 = class116.method904((byte) 13, var98 - 1);
                                                    if (var99.field4966 != -1 && class56.field829.method1743(var99.field4966, (byte) -75) == 4) {
                                                        class118.field1871[var64][var65] = (var99.field4978 << 24) + var99.field4968;
                                                        continue label777;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var81 = class272.field4118[var12][var64][var65];
                                int var82 = class65.field963[var12][var64][var65] + 1;
                                class319 var83 = class116.method904((byte) -106, var67 - 1);
                                if (class36.field534 && !arg0 && class118.field1871 != null && var12 == 0) {
                                    if (var83.field4966 != -1 && class56.field829.method1743(var83.field4966, (byte) -20) == 4) {
                                        class118.field1871[var64][var65] = (var83.field4978 << 24) + var83.field4968;
                                    } else {
                                        label743: for (int var84 = var64 - 1; var84 <= (var64 + 1); var84++) {
                                            for (int var85 = var65 - 1; var85 <= (var65 + 1); var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class323.field5018[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class319 var87 = class116.method904((byte) -109, var86 - 1);
                                                        if (var87.field4966 != -1 && class56.field829.method1743(var87.field4966, (byte) -86) == 4) {
                                                            class118.field1871[var64][var65] = (var87.field4978 << 24) + var87.field4968;
                                                            break label743;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field4966;
                                if (var88 >= 0 && !class56.field829.method1737(0, var88)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var90;
                                if (var88 >= 0) {
                                    var89 = class56.field832[class28.method191(-94, 96, class56.field829.method1744(-65536, var88))];
                                    var90 = -1;
                                } else if (var83.field4977 == -1) {
                                    var90 = -2;
                                    var89 = 0;
                                } else {
                                    var90 = var83.field4977;
                                    int var91 = (var90 & 0x7F) + var11;
                                    if (var91 < 0) {
                                        var91 = 0;
                                    } else if (var91 > 127) {
                                        var91 = 127;
                                    }
                                    int var92 = (var90 + var8 & 0xFC00) + (var90 & 0x380) + var91;
                                    var89 = class56.field832[class28.method191(-96, 96, var92)];
                                }
                                if (var83.field4979 >= 0) {
                                    int var93 = var83.field4979;
                                    int var94 = (var93 & 0x7F) + var11;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var93 & 0x380) + (var8 + var93 & 0xFC00) + var94;
                                    var89 = class56.field832[class28.method191(-103, 96, var95)];
                                }
                                class65.method554(var12, var64, var65, var82, var81, var88, var68, var69, var70, var71, class58.method522((byte) -63, var77, var73), class58.method522((byte) -87, var78, var73), class58.method522((byte) -70, var79, var73), class58.method522((byte) 116, var80, var73), class28.method191(-115, var77, var90), class28.method191(-106, var78, var90), class28.method191(-128, var79, var90), class28.method191(-118, var80, var90), var74, var89);
                                if (class36.field534 && var12 > 0) {
                                    class247.method1716(var82, var81, var90 == -2 || !var83.field4962, var73 == -1 || !class236.method1656(var66 - 1, false).field3167, var64, var65, var68 - class41.field612[0][var64][var65], var69 - class41.field612[0][var64 + 1][var65], var70 - class41.field612[0][var64 + 1][var65 + 1], -class41.field612[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class36.field534) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                int[][] var102 = class41.field612[var12];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg0) {
                            class123[] var109 = class321.method2191(var10, class65.field963[var12], 7694, var12, var9, class272.field4118[var12], var101, class41.field612[var12], var103, class118.field1871, class208.field3272, class314.field4872[var12], var100, class258.field3844[0], class323.field5018[var12]);
                            class150.method1109(var12, var109);
                            break;
                        }
                        class123[] var110 = class321.method2191(var10, class65.field963[var12], 7694, var12, var9, class272.field4118[var12], var101, class41.field612[var12], var103, (int[][]) null, class208.field3272, class314.field4872[var12], var100, (int[][]) null, class323.field5018[var12]);
                        class123[] var111 = class154.method1127(var101, class323.field5018[var12], var12, class208.field3272, var9, var100, class272.field4118[var12], var103, (byte) 24, class65.field963[var12], class314.field4872[var12], class41.field612[var12]);
                        class123[] var112 = new class123[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var114 + var110.length] = var111[var114];
                        }
                        class150.method1109(var12, var112);
                        class16.method120(class41.field612[var12], var100, var12, class314.field4872[var12], (byte) 124, class286.field4412, class323.field5018[var12], class272.field4118[var12], class286.field4411, var103, var101, class65.field963[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var102[var105 + 1][var104] - var102[var105 - 1][var104];
                        int var107 = var102[var105][var104 + 1] - var102[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + (var107 * var107) + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class314.field4872[var12] = (byte[][]) null;
            class323.field5018[var12] = (byte[][]) null;
            class65.field963[var12] = (byte[][]) null;
            class272.field4118[var12] = (byte[][]) null;
            class277.field4260[var12] = (byte[][]) null;
        }
        class95.method760(-50, -10, -50);
        if (arg1 <= 71 || arg0) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class208.field3272[1][var115][var116] & 0x2) == 2) {
                    class65.method557(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class58.field868[var117][var119][var118] & 0x1) != 0) {
                        int var120 = var118;
                        int var121;
                        for (var121 = var118; var121 > 0 && (class58.field868[var117][var119][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        while (var120 < 104 && (class58.field868[var117][var119][var120 + 1] & 0x1) != 0) {
                            var120++;
                        }
                        int var122 = var117;
                        int var123 = var117;
                        label459: while (var122 > 0) {
                            for (int var124 = var121; var124 <= var120; var124++) {
                                if ((class58.field868[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label459;
                                }
                            }
                            var122--;
                        }
                        label448: while (var123 < 3) {
                            for (int var125 = var121; var125 <= var120; var125++) {
                                if ((class58.field868[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label448;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var120 + 1 - var121) * (var123 + 1 - var122);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class41.field612[var123][var119][var121] - var127;
                            int var129 = class41.field612[var122][var119][var121];
                            class252.method1755(1, var119 * 128, var119 * 128, var121 * 128, var120 * 128 + 128, var128, var129);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var121; var131 <= var120; var131++) {
                                    class58.field868[var130][var119][var131] = class142.method1078(class58.field868[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class58.field868[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 < 104 && (class58.field868[var117][var132 + 1][var118] & 0x2) != 0; var132++) {
                        }
                        int var133 = var117;
                        int var134;
                        for (var134 = var119; var134 > 0 && (class58.field868[var117][var134 - 1][var118] & 0x2) != 0; var134--) {
                        }
                        int var135 = var117;
                        label513: while (var133 > 0) {
                            for (int var136 = var134; var136 <= var132; var136++) {
                                if ((class58.field868[var133 - 1][var136][var118] & 0x2) == 0) {
                                    break label513;
                                }
                            }
                            var133--;
                        }
                        label502: while (var135 < 3) {
                            for (int var137 = var134; var137 <= var132; var137++) {
                                if ((class58.field868[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label502;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var132 + 1 - var134) * (var135 + 1 - var133);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class41.field612[var135][var134][var118] - var139;
                            int var141 = class41.field612[var133][var134][var118];
                            class252.method1755(2, var134 * 128, var132 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var133; var142 <= var135; var142++) {
                                for (int var143 = var134; var143 <= var132; var143++) {
                                    class58.field868[var142][var143][var118] = class142.method1078(class58.field868[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class58.field868[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146 = var118;
                        int var147;
                        for (var147 = var118; var147 > 0 && (class58.field868[var117][var119][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        while (var146 < 104 && (class58.field868[var117][var119][var146 + 1] & 0x4) != 0) {
                            var146++;
                        }
                        label568: while (var144 > 0) {
                            for (int var148 = var147; var148 <= var146; var148++) {
                                if ((class58.field868[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label568;
                                }
                            }
                            var144--;
                        }
                        label557: while (var145 < 104) {
                            for (int var149 = var147; var149 <= var146; var149++) {
                                if ((class58.field868[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label557;
                                }
                            }
                            var145++;
                        }
                        if (((var145 + 1 - var144) * (var146 + 1 - var147)) >= 4) {
                            int var150 = class41.field612[var117][var144][var147];
                            class252.method1755(4, var144 * 128, var145 * 128 + 128, var147 * 128, var146 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var147; var152 <= var146; var152++) {
                                    class58.field868[var117][var151][var152] = class142.method1078(class58.field868[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BB)V")
    public abstract void method474(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)[B")
    public abstract byte[] method473(int arg0);
}
