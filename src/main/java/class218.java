import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class218 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3946 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Ldj;")
    private static class44 field3945 = class89.method650(255, "Unable to find ");

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Ldj;")
    public static class44 field3950 = field3945;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field3951 = 0;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Ldj;")
    public static class44 field3949 = class89.method650(255, "Fallen lassen");

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Ldj;")
    private static class44 field3954 = class89.method650(255, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ldj;")
    public static class44 field3947 = field3954;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field3955 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lfj;")
    public static class66 field3952 = new class66(new byte[5000]);

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Ldj;")
    public static class44 field3958 = class89.method650(255, "Einloggen");

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field3959 = 0;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lrh;")
    public static class188 field3957 = new class188(5000);

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Ldj;")
    public static class44 field3961 = class89.method650(255, "mapfunction");

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lve;")
    public static class225 field3956;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1414(int arg0, int arg1, int arg2, int arg3) {
        if (class94.method668(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class57.method439(var4 + 1, class205.field3675[arg0][arg1][arg2] + arg3, var5 + 1) && class57.method439(var4 + 128 - 1, class205.field3675[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class57.method439(var4 + 128 - 1, class205.field3675[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class57.method439(var4 + 1, class205.field3675[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII[IIIIIZI)V")
    public static final void method1415(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg7 < class99.field1821) {
            arg2 -= class99.field1821 - arg7;
            arg7 = class99.field1821;
        }
        field3944++;
        if (arg6 == 9) {
            arg6 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        int var11 = 64 % ((48 - arg1) / 52);
        if (class99.field1819 > arg10) {
            arg0 -= class99.field1819 - arg10;
            arg10 = class99.field1819;
        }
        if (arg6 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        if (arg2 + arg7 > class99.field1820) {
            arg2 = class99.field1820 - arg7;
        }
        if (arg0 + arg10 > class99.field1817) {
            arg0 = class99.field1817 - arg10;
        }
        int var12 = class99.field1818 - arg0;
        int var13 = class99.field1818 * arg7 + arg10;
        if (arg6 == 1) {
            if (arg3 == 0) {
                for (int var14 = 0; var14 < arg2; var14++) {
                    for (int var15 = 0; var15 < arg0; var15++) {
                        if (var15 <= var14) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 1) {
                for (int var16 = arg2 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg0; var17++) {
                        if (var17 <= var16) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 2) {
                for (int var18 = 0; var18 < arg2; var18++) {
                    for (int var19 = 0; var19 < arg0; var19++) {
                        if (var18 <= var19) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 3) {
                for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg0; var21++) {
                        if (var20 <= var21) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg6 == 2) {
            if (arg3 == 0) {
                for (int var22 = arg2 - 1; var22 >= 0; var22--) {
                    for (int var23 = 0; var23 < arg0; var23++) {
                        if (var22 >> 1 >= var23) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 1) {
                for (int var24 = 0; var24 < arg2; var24++) {
                    for (int var25 = 0; var25 < arg0; var25++) {
                        if (var25 >= var24 << 1) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 2) {
                for (int var26 = 0; var26 < arg2; var26++) {
                    for (int var27 = arg0 - 1; var27 >= 0; var27--) {
                        if (var27 <= var26 >> 1) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 3) {
                for (int var28 = arg2 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg0 - 1; var29 >= 0; var29--) {
                        if (var29 >= var28 << 1) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg6 == 3) {
            if (arg3 == 0) {
                for (int var30 = arg2 - 1; var30 >= 0; var30--) {
                    for (int var31 = arg0 - 1; var31 >= 0; var31--) {
                        if (var31 <= var30 >> 1) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 1) {
                for (int var32 = arg2 - 1; var32 >= 0; var32--) {
                    for (int var33 = 0; var33 < arg0; var33++) {
                        if (var32 << 1 <= var33) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 2) {
                for (int var34 = 0; var34 < arg2; var34++) {
                    for (int var35 = 0; var35 < arg0; var35++) {
                        if (var34 >> 1 >= var35) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 3) {
                for (int var36 = 0; var36 < arg2; var36++) {
                    for (int var37 = arg0 - 1; var37 >= 0; var37--) {
                        if (var37 >= var36 << 1) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg6 == 4) {
            if (arg3 == 0) {
                for (int var38 = arg2 - 1; var38 >= 0; var38--) {
                    for (int var39 = 0; var39 < arg0; var39++) {
                        if (var38 >> 1 <= var39) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 1) {
                for (int var40 = 0; var40 < arg2; var40++) {
                    for (int var41 = 0; var41 < arg0; var41++) {
                        if (var41 <= var40 << 1) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 2) {
                for (int var42 = 0; var42 < arg2; var42++) {
                    for (int var43 = arg0 - 1; var43 >= 0; var43--) {
                        if (var42 >> 1 <= var43) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg3 == 3) {
                for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                    for (int var45 = arg0 - 1; var45 >= 0; var45--) {
                        if (var44 << 1 >= var45) {
                            arg4[var13] = arg8;
                        } else if (arg9) {
                            arg4[var13] = arg5;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg3 == 0) {
                    for (int var54 = 0; var54 < arg2; var54++) {
                        for (int var55 = 0; var55 < arg0; var55++) {
                            if (var55 <= arg0 / 2) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var56 = 0; var56 < arg2; var56++) {
                        for (int var57 = 0; var57 < arg0; var57++) {
                            if (var56 <= arg2 / 2) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var58 = 0; var58 < arg2; var58++) {
                        for (int var59 = 0; var59 < arg0; var59++) {
                            if (var59 >= arg0 / 2) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var60 = 0; var60 < arg2; var60++) {
                        for (int var61 = 0; var61 < arg0; var61++) {
                            if (arg2 / 2 <= var60) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg3 == 0) {
                    for (int var62 = 0; var62 < arg2; var62++) {
                        for (int var63 = 0; var63 < arg0; var63++) {
                            if (var62 - arg2 / 2 >= var63) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var64 = arg2 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg0; var65++) {
                            if (var64 - arg2 / 2 >= var65) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var66 = arg2 - 1; var66 >= 0; var66--) {
                        for (int var67 = arg0 - 1; var67 >= 0; var67--) {
                            if (var66 - arg2 / 2 >= var67) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var68 = 0; var68 < arg2; var68++) {
                        for (int var69 = arg0 - 1; var69 >= 0; var69--) {
                            if (var68 - arg2 / 2 >= var69) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg3 == 0) {
                    for (int var70 = 0; var70 < arg2; var70++) {
                        for (int var71 = 0; var71 < arg0; var71++) {
                            if (var71 >= var70 - arg2 / 2) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var72 = arg2 - 1; var72 >= 0; var72--) {
                        for (int var73 = 0; var73 < arg0; var73++) {
                            if (var72 - arg2 / 2 <= var73) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var74 = arg2 - 1; var74 >= 0; var74--) {
                        for (int var75 = arg0 - 1; var75 >= 0; var75--) {
                            if (var75 >= var74 - arg2 / 2) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var76 = 0; var76 < arg2; var76++) {
                        for (int var77 = arg0 - 1; var77 >= 0; var77--) {
                            if (var76 - arg2 / 2 <= var77) {
                                arg4[var13] = arg8;
                            } else if (arg9) {
                                arg4[var13] = arg5;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var46 = arg2 - 1; var46 >= 0; var46--) {
                for (int var47 = arg0 - 1; var47 >= 0; var47--) {
                    if (var47 >= var46 >> 1) {
                        arg4[var13] = arg8;
                    } else if (arg9) {
                        arg4[var13] = arg5;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg3 == 1) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                for (int var49 = 0; var49 < arg0; var49++) {
                    if (var49 <= var48 << 1) {
                        arg4[var13] = arg8;
                    } else if (arg9) {
                        arg4[var13] = arg5;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg3 == 2) {
            for (int var50 = 0; var50 < arg2; var50++) {
                for (int var51 = 0; var51 < arg0; var51++) {
                    if (var51 >= var50 >> 1) {
                        arg4[var13] = arg8;
                    } else if (arg9) {
                        arg4[var13] = arg5;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg3 == 3) {
            for (int var52 = 0; var52 < arg2; var52++) {
                for (int var53 = arg0 - 1; var53 >= 0; var53--) {
                    if (var52 << 1 >= var53) {
                        arg4[var13] = arg8;
                    } else if (arg9) {
                        arg4[var13] = arg5;
                    }
                    var13++;
                }
                var13 += var12;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1416(int arg0) {
        field3957 = null;
        if (arg0 != -1) {
            return;
        }
        field3958 = null;
        field3950 = null;
        field3956 = null;
        field3961 = null;
        field3954 = null;
        field3947 = null;
        field3952 = null;
        field3945 = null;
        field3949 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            field3957 = null;
        }
        field3948++;
        if (arg1 > class57.field1068 || arg4 < class14.field267) {
            return;
        }
        boolean var6;
        if (class70.field1337 > arg0) {
            var6 = false;
            arg0 = class70.field1337;
        } else if (arg0 <= class70.field1321) {
            var6 = true;
        } else {
            arg0 = class70.field1321;
            var6 = false;
        }
        boolean var7;
        if (arg5 < class70.field1337) {
            var7 = false;
            arg5 = class70.field1337;
        } else if (class70.field1321 >= arg5) {
            var7 = true;
        } else {
            arg5 = class70.field1321;
            var7 = false;
        }
        if (class14.field267 <= arg1) {
            class42.method290(class108.field1979[arg1++], -7, arg5, arg0, arg2);
        } else {
            arg1 = class14.field267;
        }
        if (class57.field1068 >= arg4) {
            class42.method290(class108.field1979[arg4--], -7, arg5, arg0, arg2);
        } else {
            arg4 = class57.field1068;
        }
        if (var7 && var6) {
            for (int var8 = arg1; var8 <= arg4; var8++) {
                int[] var9 = class108.field1979[var8];
                var9[arg5] = var9[arg0] = arg2;
            }
            return;
        }
        if (var7) {
            for (int var10 = arg1; var10 <= arg4; var10++) {
                class108.field1979[var10][arg5] = arg2;
            }
            return;
        }
        if (var6) {
            for (int var11 = arg1; var11 <= arg4; var11++) {
                class108.field1979[var11][arg0] = arg2;
            }
            return;
        }
    }
}
