import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class217 extends class61 {

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Llc;")
    public static class143 field3970 = class66.method374("Angreifen", -1);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Llc;")
    public static class143 field3968 = class66.method374("<col=c0ff00>", -1);

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lng;")
    public static class139 field3975 = new class139(64);

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "J")
    public long field3967;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lia;")
    public static class181 field3966;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lcc;")
    public class217 field3971;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lcc;")
    public class217 field3974;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Lgf;")
    public static class7 field3972;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)Z")
    public final boolean method1487(byte arg0) {
        field3969++;
        if (this.field3971 == null) {
            return false;
        } else {
            if (arg0 != 53) {
                field3978 = 91;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static void method1488(int arg0) {
        field3972 = null;
        field3966 = null;
        if (arg0 == 1) {
            field3970 = null;
            field3968 = null;
            field3975 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIIII[IIIIII)V")
    public static final void method1489(boolean arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg10;
        field3977++;
        if (arg10 >= class260.field4656) {
            return;
        }
        if (arg10 < class260.field4649) {
            var11 = class260.field4649;
        }
        int var12 = arg2 + arg10;
        if (var12 <= class260.field4649) {
            return;
        }
        if (var12 > class260.field4656) {
            var12 = class260.field4656;
        }
        int var13 = arg3;
        if (arg3 >= class260.field4657) {
            return;
        }
        if (arg3 < class260.field4653) {
            var13 = class260.field4653;
        }
        int var14 = arg3 + arg4;
        if (arg1 != 73397217) {
            field3972 = null;
        }
        if (class260.field4653 >= var14) {
            return;
        }
        if (arg6 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        int var15 = class260.field4650 * var13 + var11;
        int var16 = var11 + class260.field4650 - var12;
        int var17 = var12 - arg10;
        int var18 = var13 - arg3;
        int var19 = arg2 - var17;
        int var20 = arg4 - var18;
        if (class260.field4657 < var14) {
            var14 = class260.field4657;
        }
        int var21 = var11 - arg10;
        int var22 = var14 - arg3;
        int var23 = arg4 - var22;
        int var24 = arg2 - var21;
        if (arg6 == 1) {
            if (arg9 == 0) {
                for (int var25 = var18; var25 < var22; var25++) {
                    for (int var26 = var21; var26 < var17; var26++) {
                        if (var26 <= var25) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var27 = var20 - 1; var27 >= var23; var27--) {
                    for (int var28 = var21; var28 < var17; var28++) {
                        if (var28 <= var27) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var29 = var18; var29 < var22; var29++) {
                    for (int var30 = var21; var30 < var17; var30++) {
                        if (var29 <= var30) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var31 = var20 - 1; var31 >= var23; var31--) {
                    for (int var32 = var21; var32 < var17; var32++) {
                        if (var31 <= var32) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 == 2) {
            if (arg9 == 0) {
                for (int var33 = var20 - 1; var33 >= var23; var33--) {
                    for (int var34 = var21; var34 < var17; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var35 = var18; var35 < var22; var35++) {
                    for (int var36 = var21; var36 < var17; var36++) {
                        if (var15 >= 0 && arg5.length > var15) {
                            if (var35 << 1 <= var36) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var37 = var18; var37 < var22; var37++) {
                    for (int var38 = var24 - 1; var38 >= var19; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var39 = var20 - 1; var39 >= var23; var39--) {
                    for (int var40 = var24 - 1; var40 >= var19; var40--) {
                        if (var39 << 1 <= var40) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 == 3) {
            if (arg9 == 0) {
                for (int var41 = var20 - 1; var41 >= var23; var41--) {
                    for (int var42 = var24 - 1; var42 >= var19; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var43 = var20 - 1; var43 >= var23; var43--) {
                    for (int var44 = var21; var44 < var17; var44++) {
                        if (var44 >= (var43 << 1)) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var45 = var18; var45 < var22; var45++) {
                    for (int var46 = var21; var46 < var17; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var47 = var18; var47 < var22; var47++) {
                    for (int var48 = var24 - 1; var48 >= var19; var48--) {
                        if (var48 >= (var47 << 1)) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 == 4) {
            if (arg9 == 0) {
                for (int var49 = var20 - 1; var49 >= var23; var49--) {
                    for (int var50 = var21; var50 < var17; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var51 = var18; var51 < var22; var51++) {
                    for (int var52 = var21; var52 < var17; var52++) {
                        if (var51 << 1 >= var52) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var53 = var18; var53 < var22; var53++) {
                    for (int var54 = var24 - 1; var54 >= var19; var54--) {
                        if (var54 >= var53 >> 1) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var55 = var20 - 1; var55 >= var23; var55--) {
                    for (int var56 = var24 - 1; var56 >= var19; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg5[var15] = arg7;
                        } else if (arg0) {
                            arg5[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg9 == 0) {
                    for (int var65 = var18; var65 < var22; var65++) {
                        for (int var66 = var21; var66 < var17; var66++) {
                            if (var66 <= (arg2 / 2)) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var18; var67 < var22; var67++) {
                        for (int var68 = var21; var68 < var17; var68++) {
                            if (var67 <= (arg4 / 2)) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var18; var69 < var22; var69++) {
                        for (int var70 = var21; var70 < var17; var70++) {
                            if (arg2 / 2 <= var70) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var71 = var18; var71 < var22; var71++) {
                        for (int var72 = var21; var72 < var17; var72++) {
                            if (arg4 / 2 <= var71) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg9 == 0) {
                    for (int var73 = var18; var73 < var22; var73++) {
                        for (int var74 = var21; var74 < var17; var74++) {
                            if ((var73 - (arg4 / 2)) >= var74) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var75 = var20 - 1; var75 >= var23; var75--) {
                        for (int var76 = var21; var76 < var17; var76++) {
                            if (var75 - (arg4 / 2) >= var76) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var77 = var20 - 1; var77 >= var23; var77--) {
                        for (int var78 = var24 - 1; var78 >= var19; var78--) {
                            if (var78 <= var77 - arg4 / 2) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var79 = var18; var79 < var22; var79++) {
                        for (int var80 = var24 - 1; var80 >= var19; var80--) {
                            if (var80 <= (var79 - arg4 / 2)) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg9 == 0) {
                    for (int var81 = var18; var81 < var22; var81++) {
                        for (int var82 = var21; var82 < var17; var82++) {
                            if (var82 >= var81 - arg4 / 2) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var83 = var20 - 1; var83 >= var23; var83--) {
                        for (int var84 = var21; var84 < var17; var84++) {
                            if (var84 >= var83 - (arg4 / 2)) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var85 = var20 - 1; var85 >= var23; var85--) {
                        for (int var86 = var24 - 1; var86 >= var19; var86--) {
                            if (var86 >= var85 - (arg4 / 2)) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var87 = var18; var87 < var22; var87++) {
                        for (int var88 = var24 - 1; var88 >= var19; var88--) {
                            if (var88 >= var87 - (arg4 / 2)) {
                                arg5[var15] = arg7;
                            } else if (arg0) {
                                arg5[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var57 = var20 - 1; var57 >= var23; var57--) {
                for (int var58 = var24 - 1; var58 >= var19; var58--) {
                    if (var57 >> 1 <= var58) {
                        arg5[var15] = arg7;
                    } else if (arg0) {
                        arg5[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg9 == 1) {
            for (int var59 = var20 - 1; var59 >= var23; var59--) {
                for (int var60 = var21; var60 < var17; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg5[var15] = arg7;
                    } else if (arg0) {
                        arg5[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg9 == 2) {
            for (int var61 = var18; var61 < var22; var61++) {
                for (int var62 = var21; var62 < var17; var62++) {
                    if (var62 >= var61 >> 1) {
                        arg5[var15] = arg7;
                    } else if (arg0) {
                        arg5[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg9 == 3) {
            for (int var63 = var18; var63 < var22; var63++) {
                for (int var64 = var24 - 1; var64 >= var19; var64--) {
                    if (var64 <= var63 << 1) {
                        arg5[var15] = arg7;
                    } else if (arg0) {
                        arg5[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public final void method1490(int arg0) {
        field3973++;
        if (this.field3971 == null) {
            return;
        }
        this.field3971.field3974 = this.field3974;
        if (arg0 != -28126) {
            this.method1490(-16);
        }
        this.field3974.field3971 = this.field3971;
        this.field3974 = null;
        this.field3971 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILgf;I)Lvg;")
    public static final class230 method1491(int arg0, class7 arg1, int arg2) {
        field3976++;
        if (class177.method1164(arg2, 86, arg1)) {
            if (arg0 != 2) {
                method1488(22);
            }
            return class258.method1706(86);
        } else {
            return null;
        }
    }
}
