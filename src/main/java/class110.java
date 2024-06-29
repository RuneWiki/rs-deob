import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class110 extends class106 {

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "[I")
    public int[] field1952 = new int[] { -1 };

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
    public int[] field1953 = new int[1];

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
    public static boolean field1947 = false;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "[Lhh;")
    public static class84[] field1944;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIIIIIZIII)V")
    public static final void method659(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        int var11 = 76 % ((-arg8 - 60) / 48);
        field1942++;
        if (class221.field3837 > arg9) {
            arg5 -= class221.field3837 - arg9;
            arg9 = class221.field3837;
        }
        if (arg10 == 9) {
            arg2 = arg2 + 1 & 0x3;
            arg10 = 1;
        }
        if (arg1 < class221.field3835) {
            arg4 -= class221.field3835 - arg1;
            arg1 = class221.field3835;
        }
        if (arg10 == 10) {
            arg10 = 1;
            arg2 = arg2 + 3 & 0x3;
        }
        if (arg5 + arg9 > class221.field3832) {
            arg5 = class221.field3832 - arg9;
        }
        if (arg10 == 11) {
            arg2 = arg2 + 3 & 0x3;
            arg10 = 8;
        }
        if (arg1 + arg4 > class221.field3836) {
            arg4 = class221.field3836 - arg1;
        }
        int var12 = class221.field3833 - arg5;
        int var13 = class221.field3833 * arg1 + arg9;
        if (arg10 == 1) {
            if (arg2 == 0) {
                for (int var14 = 0; var14 < arg4; var14++) {
                    for (int var15 = 0; var15 < arg5; var15++) {
                        if (var14 >= var15) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 1) {
                for (int var16 = arg4 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg5; var17++) {
                        if (var17 <= var16) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 2) {
                for (int var18 = 0; var18 < arg4; var18++) {
                    for (int var19 = 0; var19 < arg5; var19++) {
                        if (var18 <= var19) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 3) {
                for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg5; var21++) {
                        if (var20 <= var21) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 == 2) {
            if (arg2 == 0) {
                for (int var22 = arg4 - 1; var22 >= 0; var22--) {
                    for (int var23 = 0; var23 < arg5; var23++) {
                        if (var22 >> 1 >= var23) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 1) {
                for (int var24 = 0; var24 < arg4; var24++) {
                    for (int var25 = 0; var25 < arg5; var25++) {
                        if (var25 >= var24 << 1) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 2) {
                for (int var26 = 0; var26 < arg4; var26++) {
                    for (int var27 = arg5 - 1; var27 >= 0; var27--) {
                        if (var27 <= var26 >> 1) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 3) {
                for (int var28 = arg4 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg5 - 1; var29 >= 0; var29--) {
                        if (var28 << 1 <= var29) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 == 3) {
            if (arg2 == 0) {
                for (int var30 = arg4 - 1; var30 >= 0; var30--) {
                    for (int var31 = arg5 - 1; var31 >= 0; var31--) {
                        if (var30 >> 1 >= var31) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 1) {
                for (int var32 = arg4 - 1; var32 >= 0; var32--) {
                    for (int var33 = 0; var33 < arg5; var33++) {
                        if (var33 >= var32 << 1) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 2) {
                for (int var34 = 0; var34 < arg4; var34++) {
                    for (int var35 = 0; var35 < arg5; var35++) {
                        if (var35 <= var34 >> 1) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 3) {
                for (int var36 = 0; var36 < arg4; var36++) {
                    for (int var37 = arg5 - 1; var37 >= 0; var37--) {
                        if (var36 << 1 <= var37) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 == 4) {
            if (arg2 == 0) {
                for (int var38 = arg4 - 1; var38 >= 0; var38--) {
                    for (int var39 = 0; var39 < arg5; var39++) {
                        if (var38 >> 1 <= var39) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 1) {
                for (int var40 = 0; var40 < arg4; var40++) {
                    for (int var41 = 0; var41 < arg5; var41++) {
                        if (var40 << 1 >= var41) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 2) {
                for (int var42 = 0; var42 < arg4; var42++) {
                    for (int var43 = arg5 - 1; var43 >= 0; var43--) {
                        if (var43 >= var42 >> 1) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg2 == 3) {
                for (int var44 = arg4 - 1; var44 >= 0; var44--) {
                    for (int var45 = arg5 - 1; var45 >= 0; var45--) {
                        if (var44 << 1 >= var45) {
                            arg0[var13] = arg3;
                        } else if (arg7) {
                            arg0[var13] = arg6;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 != 5) {
            if (arg10 == 6) {
                if (arg2 == 0) {
                    for (int var54 = 0; var54 < arg4; var54++) {
                        for (int var55 = 0; var55 < arg5; var55++) {
                            if (var55 <= arg5 / 2) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var56 = 0; var56 < arg4; var56++) {
                        for (int var57 = 0; var57 < arg5; var57++) {
                            if (var56 <= arg4 / 2) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var58 = 0; var58 < arg4; var58++) {
                        for (int var59 = 0; var59 < arg5; var59++) {
                            if (arg5 / 2 <= var59) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var60 = 0; var60 < arg4; var60++) {
                        for (int var61 = 0; var61 < arg5; var61++) {
                            if (arg4 / 2 <= var60) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
            if (arg10 == 7) {
                if (arg2 == 0) {
                    for (int var62 = 0; var62 < arg4; var62++) {
                        for (int var63 = 0; var63 < arg5; var63++) {
                            if (var62 - arg4 / 2 >= var63) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var64 = arg4 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg5; var65++) {
                            if (var65 <= var64 - arg4 / 2) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var66 = arg4 - 1; var66 >= 0; var66--) {
                        for (int var67 = arg5 - 1; var67 >= 0; var67--) {
                            if (var67 <= var66 - arg4 / 2) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var68 = 0; var68 < arg4; var68++) {
                        for (int var69 = arg5 - 1; var69 >= 0; var69--) {
                            if (var68 - arg4 / 2 >= var69) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
            if (arg10 == 8) {
                if (arg2 == 0) {
                    for (int var70 = 0; var70 < arg4; var70++) {
                        for (int var71 = 0; var71 < arg5; var71++) {
                            if (var70 - arg4 / 2 <= var71) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var72 = arg4 - 1; var72 >= 0; var72--) {
                        for (int var73 = 0; var73 < arg5; var73++) {
                            if (var72 - arg4 / 2 <= var73) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var74 = arg4 - 1; var74 >= 0; var74--) {
                        for (int var75 = arg5 - 1; var75 >= 0; var75--) {
                            if (var75 >= var74 - arg4 / 2) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var76 = 0; var76 < arg4; var76++) {
                        for (int var77 = arg5 - 1; var77 >= 0; var77--) {
                            if (var77 >= var76 - arg4 / 2) {
                                arg0[var13] = arg3;
                            } else if (arg7) {
                                arg0[var13] = arg6;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
        } else if (arg2 == 0) {
            for (int var46 = arg4 - 1; var46 >= 0; var46--) {
                for (int var47 = arg5 - 1; var47 >= 0; var47--) {
                    if (var47 >= var46 >> 1) {
                        arg0[var13] = arg3;
                    } else if (arg7) {
                        arg0[var13] = arg6;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg2 == 1) {
            for (int var48 = arg4 - 1; var48 >= 0; var48--) {
                for (int var49 = 0; var49 < arg5; var49++) {
                    if (var49 <= var48 << 1) {
                        arg0[var13] = arg3;
                    } else if (arg7) {
                        arg0[var13] = arg6;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg2 == 2) {
            for (int var50 = 0; var50 < arg4; var50++) {
                for (int var51 = 0; var51 < arg5; var51++) {
                    if (var51 >= var50 >> 1) {
                        arg0[var13] = arg3;
                    } else if (arg7) {
                        arg0[var13] = arg6;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg2 == 3) {
            for (int var52 = 0; var52 < arg4; var52++) {
                for (int var53 = arg5 - 1; var53 >= 0; var53--) {
                    if (var52 << 1 >= var53) {
                        arg0[var13] = arg3;
                    } else if (arg7) {
                        arg0[var13] = arg6;
                    }
                    var13++;
                }
                var13 += var12;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method660(int arg0) {
        if (arg0 == 11023) {
            field1944 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILoc;Loc;Loc;I)V")
    public static final void method661(int arg0, class151 arg1, class151 arg2, class151 arg3, int arg4) {
        class67.method448(-1, arg2, -1, arg0, arg1, arg3);
        field1948++;
        int var5 = 28 % ((arg4 - 43) / 32);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLoc;)V")
    public static final void method662(int arg0, boolean arg1, class151 arg2) {
        class48.field984.method650(-13721, 134);
        class48.field984.method1467(arg2.method981(arg1), arg1);
        class48.field984.method1435((byte) -127, arg0);
        class153.field2763++;
        field1951++;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static final void method663(byte arg0) {
        field1946++;
        class168.field3067 = new class218();
        if (arg0 != 41) {
            field1943 = 118;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILvf;)V")
    public static final void method664(int arg0, class224 arg1) {
        if (arg0 != 1785261985) {
            method661(-52, null, null, null, 57);
        }
        class231.method1509(200000, arg0 ^ 0x9597105D, arg1);
        field1949++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lwd;B)V")
    public static final void method665(class232 arg0, byte arg1) {
        field1945++;
        int var2 = arg0.field4194 == 0 ? arg0.field4216 : arg0.field4194;
        int var3 = arg0.field4244 == 0 ? arg0.field4215 : arg0.field4244;
        class53.method364(var2, arg0.field4261, var3, class115.field2067[arg0.field4261 >> 16], 0);
        if (arg0.field4239 != null) {
            class53.method364(var2, arg0.field4261, var3, arg0.field4239, 0);
        }
        if (arg1 <= -99) {
            class147 var4 = (class147) class227.field3961.method1538((long) arg0.field4261, (byte) 127);
            if (var4 != null) {
                class165.method1066(var2, var3, (byte) 100, var4.field2631);
            }
        }
    }
}
