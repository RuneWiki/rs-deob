import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class45 {

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field543 = "Examine";

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field544 = 50;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public static int[] field537 = new int[field544];

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
    public static int[] field539 = new int[field544];

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public static int[] field545 = new int[field544];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field548 = 127;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[I")
    public static int[] field550 = new int[field544];

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field551 = new String[field544];

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    public static int[] field549 = new int[field544];

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[I")
    public static int[] field546 = new int[field544];

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[I")
    public static int[] field541 = new int[field544];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lrl;")
    public static class174 field536;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLeb;)V")
    public static final void method346(byte arg0, class103 arg1) {
        if (class143.field2317 == arg1.field1667) {
            class272.field4396[arg1.field1564] = true;
        }
        field552++;
        if (arg0 <= 20) {
            method346((byte) -6, (class103) null);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    public static final void method347(int arg0, int arg1) {
        class185.field2959.method1832(arg0, (byte) 123);
        if (arg1 != 0) {
            field544 = 110;
        }
        field547++;
        class85.field1163.method1832(arg0, (byte) 87);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)I")
    public static int method348(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method349(int arg0, byte arg1) {
        if (arg1 != 79) {
            field536 = null;
        }
        field535++;
        if (arg0 == 100 && class265.field4273 > 0) {
            byte[] var2 = class283.field4511[--class265.field4273];
            class283.field4511[class265.field4273] = null;
            return var2;
        } else if (arg0 == 5000 && class81.field1123 > 0) {
            byte[] var3 = class181.field2914[--class81.field1123];
            class181.field2914[class81.field1123] = null;
            return var3;
        } else if (arg0 == 30000 && class273.field4414 > 0) {
            byte[] var4 = class229.field3645[--class273.field4414];
            class229.field3645[class273.field4414] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII[IZI)V")
    public static final void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, boolean arg9, int arg10) {
        field538++;
        int var11 = arg5;
        if (class63.field892 <= arg5) {
            return;
        }
        if (class63.field889 > arg5) {
            var11 = class63.field889;
        }
        int var12 = arg5 + arg6;
        if (class63.field889 >= var12) {
            return;
        }
        if (class63.field892 < var12) {
            var12 = class63.field892;
        }
        int var13 = arg3;
        if (class63.field891 <= arg3) {
            return;
        }
        if (class63.field893 > arg3) {
            var13 = class63.field893;
        }
        int var14 = arg1 + arg3;
        if (var14 <= class63.field893) {
            return;
        }
        if (var14 > class63.field891) {
            var14 = class63.field891;
        }
        int var15 = var14 - arg3;
        int var16 = class63.field897 * var13 + var11;
        if (arg10 == 9) {
            arg10 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        int var17 = var13 - arg3;
        if (arg10 == 10) {
            arg10 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        int var18 = var11 + class63.field897 - var12;
        int var19 = var11 - arg5;
        if (arg10 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 8;
        }
        int var20 = arg6 - var19;
        int var21 = var12 - arg5;
        int var22 = arg6 - var21;
        int var23 = arg1 - var15;
        int var24 = arg1 - var17;
        if (arg10 == 1) {
            if (arg0 == 0) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var19; var26 < var21; var26++) {
                        if (var25 >= var26) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var19; var28 < var21; var28++) {
                        if (var28 <= var27) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var19; var30 < var21; var30++) {
                        if (var29 <= var30) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var19; var32 < var21; var32++) {
                        if (var31 <= var32) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg10 == 2) {
            if (arg0 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var19; var34 < var21; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var19; var36 < var21; var36++) {
                        if (var16 >= 0 && var16 < arg8.length) {
                            if (var36 >= (var35 << 1)) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg0 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var20 - 1; var38 >= var22; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var20 - 1; var40 >= var22; var40--) {
                        if (var39 << 1 <= var40) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg10 == 3) {
            if (arg0 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var20 - 1; var42 >= var22; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var19; var44 < var21; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 2) {
                for (int var45 = var17; var45 < var15; var45++) {
                    for (int var46 = var19; var46 < var21; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 3) {
                for (int var47 = var17; var47 < var15; var47++) {
                    for (int var48 = var20 - 1; var48 >= var22; var48--) {
                        if (var47 << 1 <= var48) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg10 == 4) {
            if (arg0 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var19; var50 < var21; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 1) {
                for (int var51 = var17; var51 < var15; var51++) {
                    for (int var52 = var19; var52 < var21; var52++) {
                        if ((var51 << 1) >= var52) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 2) {
                for (int var53 = var17; var53 < var15; var53++) {
                    for (int var54 = var20 - 1; var54 >= var22; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg0 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var20 - 1; var56 >= var22; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg8[var16] = arg2;
                        } else if (arg9) {
                            arg8[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg10 != 5) {
            if (arg10 == 6) {
                if (arg0 == 0) {
                    for (int var65 = var17; var65 < var15; var65++) {
                        for (int var66 = var19; var66 < var21; var66++) {
                            if (arg6 / 2 >= var66) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var19; var68 < var21; var68++) {
                            if (var67 <= (arg1 / 2)) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var69 = var17; var69 < var15; var69++) {
                        for (int var70 = var19; var70 < var21; var70++) {
                            if (arg6 / 2 <= var70) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var19; var72 < var21; var72++) {
                            if (var71 >= (arg1 / 2)) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg10 == 7) {
                if (arg0 == 0) {
                    for (int var73 = var17; var73 < var15; var73++) {
                        for (int var74 = var19; var74 < var21; var74++) {
                            if (var73 - (arg1 / 2) >= var74) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var19; var76 < var21; var76++) {
                            if (var76 <= (var75 - (arg1 / 2))) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var20 - 1; var78 >= var22; var78--) {
                            if (var78 <= var77 - (arg1 / 2)) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var79 = var17; var79 < var15; var79++) {
                        for (int var80 = var20 - 1; var80 >= var22; var80--) {
                            if (var80 <= var79 - arg1 / 2) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg4 > 42 && arg10 == 8) {
                if (arg0 == 0) {
                    for (int var81 = var17; var81 < var15; var81++) {
                        for (int var82 = var19; var82 < var21; var82++) {
                            if (var81 - (arg1 / 2) <= var82) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var19; var84 < var21; var84++) {
                            if ((var83 - (arg1 / 2)) <= var84) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var20 - 1; var86 >= var22; var86--) {
                            if (var86 >= var85 - (arg1 / 2)) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var87 = var17; var87 < var15; var87++) {
                        for (int var88 = var20 - 1; var88 >= var22; var88--) {
                            if (var88 >= (var87 - (arg1 / 2))) {
                                arg8[var16] = arg2;
                            } else if (arg9) {
                                arg8[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg0 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var20 - 1; var58 >= var22; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg8[var16] = arg2;
                    } else if (arg9) {
                        arg8[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg0 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var19; var60 < var21; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg8[var16] = arg2;
                    } else if (arg9) {
                        arg8[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg0 == 2) {
            for (int var61 = var17; var61 < var15; var61++) {
                for (int var62 = var19; var62 < var21; var62++) {
                    if (var62 >= (var61 >> 1)) {
                        arg8[var16] = arg2;
                    } else if (arg9) {
                        arg8[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg0 == 3) {
            for (int var63 = var17; var63 < var15; var63++) {
                for (int var64 = var20 - 1; var64 >= var22; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg8[var16] = arg2;
                    } else if (arg9) {
                        arg8[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field542++;
        int var8 = arg0 + arg2;
        int var9 = arg5 - arg2;
        int var10 = arg1 + arg2;
        if (arg6 > -51) {
            return;
        }
        for (int var11 = arg0; var11 < var8; var11++) {
            class168.method1184(128, arg4, arg1, arg3, class85.field1162[var11]);
        }
        int var12 = arg4 - arg2;
        for (int var13 = arg5; var13 > var9; var13--) {
            class168.method1184(128, arg4, arg1, arg3, class85.field1162[var13]);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class85.field1162[var14];
            class168.method1184(128, var10, arg1, arg3, var15);
            class168.method1184(128, var12, var10, arg7, var15);
            class168.method1184(128, arg4, var12, arg3, var15);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method352(int arg0) {
        field550 = null;
        field551 = null;
        field543 = null;
        field546 = null;
        field545 = null;
        field539 = null;
        field549 = null;
        field537 = null;
        field541 = null;
        field536 = null;
        if (arg0 != -1) {
            field546 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Lvl;")
    public static final class68 method353(boolean arg0) {
        field540++;
        class68 var1 = new class68(class88.field1215, class64.field904, class70.field968[0], class249.field3993[0], class207.field3348[0], class263.field4168[0], class168.field2726[0], class131.field2187);
        class111.method804(0);
        if (!arg0) {
            method350(-94, -114, -87, 26, -13, -52, -45, 118, (int[]) null, false, 13);
        }
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)I")
    public static final int method354(byte arg0, int arg1, int arg2) {
        int var3 = -47 / ((-arg0 - 29) / 63);
        field534++;
        int var4 = class153.method1038(arg1 - 1, (byte) -104, arg2 - 1) + (class153.method1038(arg1 - 1, (byte) -104, arg2 + 1) + class153.method1038(arg1 + 1, (byte) -104, arg2 - 1)) + class153.method1038(arg1 - -1, (byte) -104, arg2 + 1);
        int var5 = class153.method1038(arg1, (byte) -104, arg2 - 1) + class153.method1038(arg1, (byte) -104, arg2 + 1) - (-class153.method1038(arg1 + -1, (byte) -104, arg2) - class153.method1038(arg1 + 1, (byte) -104, arg2));
        int var6 = class153.method1038(arg1, (byte) -104, arg2);
        return var4 / 16 + var6 / 4 + (var5 / 8);
    }
}
