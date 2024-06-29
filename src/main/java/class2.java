import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class2 {

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field20 = -2;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Z")
    public static boolean field26 = true;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
    public static int[] field24 = new int[2];

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "J")
    public static long field27 = 0L;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lbe;")
    private static class283 field17 = class153.method941(-125, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lbe;")
    public static class283 field23 = class153.method941(-85, "rot:");

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lbe;")
    private static class283 field18 = class153.method941(-117, "Starting 3d library");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lbe;")
    public static class283 field15 = field18;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lbe;")
    public static class283 field21 = field17;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lkg;")
    public static class69 field19;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIILkg;)V", line = 11)
    public static final void method10(byte arg0, int arg1, int arg2, class69 arg3) {
        if (arg3.field1102 == 0) {
            arg3.field1135 = arg3.field1111;
        } else if (arg3.field1102 == 1) {
            arg3.field1135 = (arg1 - arg3.field1069) / 2 + arg3.field1111;
        } else if (arg3.field1102 == 2) {
            arg3.field1135 = arg1 - arg3.field1069 - arg3.field1111;
        } else if (arg3.field1102 == 3) {
            arg3.field1135 = arg3.field1111 * arg1 >> 14;
        } else if (arg3.field1102 == 4) {
            arg3.field1135 = (arg3.field1111 * arg1 >> 14) + (arg1 - arg3.field1069) / 2;
        } else {
            arg3.field1135 = arg1 - arg3.field1069 - (arg3.field1111 * arg1 >> 14);
        }
        field22++;
        if (arg0 != 127) {
            field15 = (class283) null;
        }
        if (arg3.field1097 == 0) {
            arg3.field1128 = arg3.field1041;
        } else if (arg3.field1097 == 1) {
            arg3.field1128 = (arg2 - arg3.field1085) / 2 + arg3.field1041;
        } else if (arg3.field1097 == 2) {
            arg3.field1128 = arg2 - arg3.field1085 - arg3.field1041;
        } else if (arg3.field1097 == 3) {
            arg3.field1128 = arg3.field1041 * arg2 >> 14;
        } else if (arg3.field1097 == 4) {
            arg3.field1128 = (arg2 - arg3.field1085) / 2 + (arg3.field1041 * arg2 >> 14);
        } else {
            arg3.field1128 = arg2 - arg3.field1085 - (arg3.field1041 * arg2 >> 14);
        }
        if (!class297.field5037 || !(client.method1601(arg3) != 0 || arg3.field1143 == 0)) {
            return;
        }
        if (arg3.field1128 < 0) {
            arg3.field1128 = 0;
        } else if (arg2 < (arg3.field1128 + arg3.field1085)) {
            arg3.field1128 = arg2 - arg3.field1085;
        }
        if (arg3.field1135 < 0) {
            arg3.field1135 = 0;
        } else if (arg1 < arg3.field1135 + arg3.field1069) {
            arg3.field1135 = arg1 - arg3.field1069;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)V", line = 97)
    public static final void method11(byte arg0, long arg1) {
        field25++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class69.method439(-73, arg1 - 1L);
            class69.method439(arg0 - 49, 1L);
        } else {
            class69.method439(-69, arg1);
        }
        if (arg0 != -20) {
            field19 = (class69) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 119)
    public static void method12(int arg0) {
        field19 = null;
        field18 = null;
        field24 = null;
        field23 = null;
        field21 = null;
        field17 = null;
        if (arg0 == 1) {
            field15 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIZIIIIZII)V", line = 155)
    public static final void method13(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field16++;
        int var11 = arg5;
        if (class78.field1359 <= arg5) {
            return;
        }
        if (class78.field1353 > arg5) {
            var11 = class78.field1353;
        }
        int var12 = arg5 + arg10;
        if (var12 <= class78.field1353) {
            return;
        }
        int var13 = arg7;
        if (class78.field1359 < var12) {
            var12 = class78.field1359;
        }
        if (class78.field1352 <= arg7) {
            return;
        }
        if (class78.field1354 > arg7) {
            var13 = class78.field1354;
        }
        int var14 = arg7 + arg9;
        if (class78.field1354 >= var14) {
            return;
        }
        if (arg6 == 9) {
            arg6 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        int var15 = class78.field1358 * var13 + var11;
        if (class78.field1352 < var14) {
            var14 = class78.field1352;
        }
        int var16 = var13 - arg7;
        int var17 = var11 + class78.field1358 - var12;
        int var18 = var11 - arg5;
        int var19 = var12 - arg5;
        int var20 = arg10 - var18;
        int var21 = var14 - arg7;
        int var22 = arg9 - var21;
        int var23 = arg10 - var19;
        int var24 = arg9 - var16;
        if (arg6 == 1) {
            if (arg1 == 0) {
                for (int var87 = var16; var87 < var21; var87++) {
                    for (int var88 = var18; var88 < var19; var88++) {
                        if (var88 <= var87) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var85 = var24 - 1; var85 >= var22; var85--) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        if (var86 <= var85) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var83 = var16; var83 < var21; var83++) {
                    for (int var84 = var18; var84 < var19; var84++) {
                        if (var83 <= var84) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var81 = var24 - 1; var81 >= var22; var81--) {
                    for (int var82 = var18; var82 < var19; var82++) {
                        if (var82 >= var81) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg6 == 2) {
            if (arg1 == 0) {
                for (int var31 = var24 - 1; var31 >= var22; var31--) {
                    for (int var32 = var18; var32 < var19; var32++) {
                        if ((var31 >> 1) >= var32) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var29 = var16; var29 < var21; var29++) {
                    for (int var30 = var18; var30 < var19; var30++) {
                        if (var15 >= 0 && var15 < arg0.length) {
                            if (var29 << 1 <= var30) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var25 = var16; var25 < var21; var25++) {
                    for (int var26 = var20 - 1; var26 >= var23; var26--) {
                        if ((var25 >> 1) >= var26) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var27 = var24 - 1; var27 >= var22; var27--) {
                    for (int var28 = var20 - 1; var28 >= var23; var28--) {
                        if (var28 >= (var27 << 1)) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg6 == 3) {
            if (arg1 == 0) {
                for (int var79 = var24 - 1; var79 >= var22; var79--) {
                    for (int var80 = var20 - 1; var80 >= var23; var80--) {
                        if (var80 <= var79 >> 1) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var73 = var24 - 1; var73 >= var22; var73--) {
                    for (int var74 = var18; var74 < var19; var74++) {
                        if (var74 >= (var73 << 1)) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var77 = var16; var77 < var21; var77++) {
                    for (int var78 = var18; var78 < var19; var78++) {
                        if (var78 <= var77 >> 1) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var75 = var16; var75 < var21; var75++) {
                    for (int var76 = var20 - 1; var76 >= var23; var76--) {
                        if ((var75 << 1) <= var76) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg6 == 4) {
            if (arg1 == 0) {
                for (int var33 = var24 - 1; var33 >= var22; var33--) {
                    for (int var34 = var18; var34 < var19; var34++) {
                        if (var34 >= (var33 >> 1)) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 1) {
                for (int var39 = var16; var39 < var21; var39++) {
                    for (int var40 = var18; var40 < var19; var40++) {
                        if (var39 << 1 >= var40) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 2) {
                for (int var37 = var16; var37 < var21; var37++) {
                    for (int var38 = var20 - 1; var38 >= var23; var38--) {
                        if ((var37 >> 1) <= var38) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg1 == 3) {
                for (int var35 = var24 - 1; var35 >= var22; var35--) {
                    for (int var36 = var20 - 1; var36 >= var23; var36--) {
                        if (var35 << 1 >= var36) {
                            arg0[var15] = arg4;
                        } else if (arg8) {
                            arg0[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg1 == 0) {
                    for (int var47 = var16; var47 < var21; var47++) {
                        for (int var48 = var18; var48 < var19; var48++) {
                            if (var48 <= (arg10 / 2)) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var45 = var16; var45 < var21; var45++) {
                        for (int var46 = var18; var46 < var19; var46++) {
                            if (var45 <= arg9 / 2) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var43 = var16; var43 < var21; var43++) {
                        for (int var44 = var18; var44 < var19; var44++) {
                            if (arg10 / 2 <= var44) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var41 = var16; var41 < var21; var41++) {
                        for (int var42 = var18; var42 < var19; var42++) {
                            if (var41 >= (arg9 / 2)) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg1 == 0) {
                    for (int var55 = var16; var55 < var21; var55++) {
                        for (int var56 = var18; var56 < var19; var56++) {
                            if ((var55 - arg9 / 2) >= var56) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var49 = var24 - 1; var49 >= var22; var49--) {
                        for (int var50 = var18; var50 < var19; var50++) {
                            if ((var49 - (arg9 / 2)) >= var50) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var51 = var24 - 1; var51 >= var22; var51--) {
                        for (int var52 = var20 - 1; var52 >= var23; var52--) {
                            if (var52 <= (var51 - (arg9 / 2))) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var53 = var16; var53 < var21; var53++) {
                        for (int var54 = var20 - 1; var54 >= var23; var54--) {
                            if (var53 - arg9 / 2 >= var54) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (!arg3 && arg6 == 8) {
                if (arg1 == 0) {
                    for (int var63 = var16; var63 < var21; var63++) {
                        for (int var64 = var18; var64 < var19; var64++) {
                            if ((var63 - arg9 / 2) <= var64) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var57 = var24 - 1; var57 >= var22; var57--) {
                        for (int var58 = var18; var58 < var19; var58++) {
                            if (var57 - (arg9 / 2) <= var58) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var61 = var24 - 1; var61 >= var22; var61--) {
                        for (int var62 = var20 - 1; var62 >= var23; var62--) {
                            if (var62 >= (var61 - (arg9 / 2))) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var59 = var16; var59 < var21; var59++) {
                        for (int var60 = var20 - 1; var60 >= var23; var60--) {
                            if (var59 - (arg9 / 2) <= var60) {
                                arg0[var15] = arg4;
                            } else if (arg8) {
                                arg0[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var71 = var24 - 1; var71 >= var22; var71--) {
                for (int var72 = var20 - 1; var72 >= var23; var72--) {
                    if ((var71 >> 1) <= var72) {
                        arg0[var15] = arg4;
                    } else if (arg8) {
                        arg0[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg1 == 1) {
            for (int var65 = var24 - 1; var65 >= var22; var65--) {
                for (int var66 = var18; var66 < var19; var66++) {
                    if (var66 <= (var65 << 1)) {
                        arg0[var15] = arg4;
                    } else if (arg8) {
                        arg0[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg1 == 2) {
            for (int var67 = var16; var67 < var21; var67++) {
                for (int var68 = var18; var68 < var19; var68++) {
                    if ((var67 >> 1) <= var68) {
                        arg0[var15] = arg4;
                    } else if (arg8) {
                        arg0[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg1 == 3) {
            for (int var69 = var16; var69 < var21; var69++) {
                for (int var70 = var20 - 1; var70 >= var23; var70--) {
                    if (var70 <= (var69 << 1)) {
                        arg0[var15] = arg4;
                    } else if (arg8) {
                        arg0[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lvg;B)Lvg;")
    public abstract class249 method9(class249 arg0, byte arg1);
}
