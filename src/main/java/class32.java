import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lcf;")
    public static class93 field504 = class147.method1066("loginscreen", -48);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lcf;")
    private static class93 field503 = class147.method1066("Cancel", -48);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field505 = 1;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lcf;")
    private static class93 field511 = class147.method1066("Loading sprites )2 ", -48);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lcf;")
    public static class93 field502 = field511;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lcf;")
    public static class93 field509 = field503;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
    public static int[] field507 = new int[128];

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
    public static int[] field512 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Z")
    public static boolean field513;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)I")
    public static final int method188(int arg0, int arg1, int arg2) {
        field516++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 12345678) {
            method192((class181) null, true, -37);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZI[IIIIIIII)V")
    public static final void method189(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field515++;
        if (arg5 != 0) {
            method189(-9, false, -3, (int[]) null, 111, -55, 14, 127, 25, -119, 34);
        }
        int var11 = arg2;
        if (class75.field1395 <= arg2) {
            return;
        }
        int var12 = arg2 + arg9;
        if (class75.field1392 > arg2) {
            var11 = class75.field1392;
        }
        if (var12 <= class75.field1392) {
            return;
        }
        if (var12 > class75.field1395) {
            var12 = class75.field1395;
        }
        int var13 = arg4;
        if (class75.field1394 <= arg4) {
            return;
        }
        if (class75.field1396 > arg4) {
            var13 = class75.field1396;
        }
        int var14 = arg4 + arg7;
        if (var14 <= class75.field1396) {
            return;
        }
        if (arg10 == 9) {
            arg10 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (var14 > class75.field1394) {
            var14 = class75.field1394;
        }
        int var15 = class75.field1398 * var13 + var11;
        int var16 = var13 - arg4;
        if (arg10 == 10) {
            arg10 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        int var17 = var14 - arg4;
        if (arg10 == 11) {
            arg8 = arg8 + 3 & 0x3;
            arg10 = 8;
        }
        int var18 = class75.field1398 + var11 - var12;
        int var19 = arg7 - var16;
        int var20 = var11 - arg2;
        int var21 = var12 - arg2;
        int var22 = arg9 - var20;
        int var23 = arg7 - var17;
        int var24 = arg9 - var21;
        if (arg10 == 1) {
            if (arg8 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var20; var26 < var21; var26++) {
                        if (var25 >= var26) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var27 = var19 - 1; var27 >= var23; var27--) {
                    for (int var28 = var20; var28 < var21; var28++) {
                        if (var28 <= var27) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var20; var30 < var21; var30++) {
                        if (var30 >= var29) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var31 = var19 - 1; var31 >= var23; var31--) {
                    for (int var32 = var20; var32 < var21; var32++) {
                        if (var31 <= var32) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 == 2) {
            if (arg8 == 0) {
                for (int var33 = var19 - 1; var33 >= var23; var33--) {
                    for (int var34 = var20; var34 < var21; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var20; var36 < var21; var36++) {
                        if (var15 >= 0 && arg3.length > var15) {
                            if ((var35 << 1) <= var36) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var22 - 1; var38 >= var24; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var39 = var19 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var24; var40--) {
                        if ((var39 << 1) <= var40) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 == 3) {
            if (arg8 == 0) {
                for (int var41 = var19 - 1; var41 >= var23; var41--) {
                    for (int var42 = var22 - 1; var42 >= var24; var42--) {
                        if (var42 <= var41 >> 1) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var43 = var19 - 1; var43 >= var23; var43--) {
                    for (int var44 = var20; var44 < var21; var44++) {
                        if (var43 << 1 <= var44) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var20; var46 < var21; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var22 - 1; var48 >= var24; var48--) {
                        if (var47 << 1 <= var48) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 == 4) {
            if (arg8 == 0) {
                for (int var49 = var19 - 1; var49 >= var23; var49--) {
                    for (int var50 = var20; var50 < var21; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var51 = var16; var51 < var17; var51++) {
                    for (int var52 = var20; var52 < var21; var52++) {
                        if ((var51 << 1) >= var52) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var53 = var16; var53 < var17; var53++) {
                    for (int var54 = var22 - 1; var54 >= var24; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var55 = var19 - 1; var55 >= var23; var55--) {
                    for (int var56 = var22 - 1; var56 >= var24; var56--) {
                        if (var55 << 1 >= var56) {
                            arg3[var15] = arg0;
                        } else if (arg1) {
                            arg3[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg10 != 5) {
            if (arg10 == 6) {
                if (arg8 == 0) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var20; var66 < var21; var66++) {
                            if (arg9 / 2 >= var66) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var20; var68 < var21; var68++) {
                            if (var67 <= (arg7 / 2)) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var20; var70 < var21; var70++) {
                            if ((arg9 / 2) <= var70) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var20; var72 < var21; var72++) {
                            if (var71 >= (arg7 / 2)) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg10 == 7) {
                if (arg8 == 0) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var20; var74 < var21; var74++) {
                            if (var73 - arg7 / 2 >= var74) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var75 = var19 - 1; var75 >= var23; var75--) {
                        for (int var76 = var20; var76 < var21; var76++) {
                            if (var76 <= (var75 - (arg7 / 2))) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var77 = var19 - 1; var77 >= var23; var77--) {
                        for (int var78 = var22 - 1; var78 >= var24; var78--) {
                            if (var77 - (arg7 / 2) >= var78) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var79 = var16; var79 < var17; var79++) {
                        for (int var80 = var22 - 1; var80 >= var24; var80--) {
                            if (var80 <= (var79 - (arg7 / 2))) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg10 == 8) {
                if (arg8 == 0) {
                    for (int var81 = var16; var81 < var17; var81++) {
                        for (int var82 = var20; var82 < var21; var82++) {
                            if (var81 - (arg7 / 2) <= var82) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var83 = var19 - 1; var83 >= var23; var83--) {
                        for (int var84 = var20; var84 < var21; var84++) {
                            if ((var83 - (arg7 / 2)) <= var84) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var85 = var19 - 1; var85 >= var23; var85--) {
                        for (int var86 = var22 - 1; var86 >= var24; var86--) {
                            if (var85 - arg7 / 2 <= var86) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var87 = var16; var87 < var17; var87++) {
                        for (int var88 = var22 - 1; var88 >= var24; var88--) {
                            if (var87 - (arg7 / 2) <= var88) {
                                arg3[var15] = arg0;
                            } else if (arg1) {
                                arg3[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var57 = var19 - 1; var57 >= var23; var57--) {
                for (int var58 = var22 - 1; var58 >= var24; var58--) {
                    if (var57 >> 1 <= var58) {
                        arg3[var15] = arg0;
                    } else if (arg1) {
                        arg3[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 1) {
            for (int var59 = var19 - 1; var59 >= var23; var59--) {
                for (int var60 = var20; var60 < var21; var60++) {
                    if (var59 << 1 >= var60) {
                        arg3[var15] = arg0;
                    } else if (arg1) {
                        arg3[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 2) {
            for (int var61 = var16; var61 < var17; var61++) {
                for (int var62 = var20; var62 < var21; var62++) {
                    if (var62 >= (var61 >> 1)) {
                        arg3[var15] = arg0;
                    } else if (arg1) {
                        arg3[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 3) {
            for (int var63 = var16; var63 < var17; var63++) {
                for (int var64 = var22 - 1; var64 >= var24; var64--) {
                    if (var63 << 1 >= var64) {
                        arg3[var15] = arg0;
                    } else if (arg1) {
                        arg3[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
    public static final void method190(int arg0, int arg1, int arg2) {
        class212 var3 = class123.method905(-1205364448, arg2, arg1);
        field506++;
        var3.method1493(13);
        var3.field3883 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method191(byte arg0) {
        field503 = null;
        field512 = null;
        field507 = null;
        field502 = null;
        field504 = null;
        if (arg0 == 29) {
            field511 = null;
            field509 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ltg;ZI)V")
    public static final void method192(class181 arg0, boolean arg1, int arg2) {
        int var3 = arg0.field3334 == 0 ? arg0.field3252 : arg0.field3334;
        int var4 = ~arg0.field3184 == arg2 ? arg0.field3270 : arg0.field3184;
        class56.method316(var4, arg0.field3219, var3, false, class6.field82[arg0.field3219 >> 16], arg1);
        if (arg0.field3336 != null) {
            class56.method316(var4, arg0.field3219, var3, false, arg0.field3336, arg1);
        }
        class214 var5 = (class214) class255.field4610.method135((long) arg0.field3219, true);
        field510++;
        if (var5 != null) {
            class61.method385(var5.field3912, 19169, var3, var4, arg1);
        }
    }
}
