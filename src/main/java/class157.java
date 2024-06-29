import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class157 extends class130 {

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2535 = new CRC32();

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Lqj;")
    public static class196 field2538 = class80.method502("scape main", -48);

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Lah;")
    public static class22 field2536 = new class22(50);

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lec;")
    public class178 field2525;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lec;")
    public class178 field2526;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lqj;")
    public class196 field2533;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Z")
    public boolean field2539;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field2534;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
    public static final void method990(int arg0, int arg1) {
        if (arg1 != -8069) {
            return;
        }
        class54.field681 = arg0;
        field2528++;
        if (class56.field741 == 40) {
            class180.method1182((byte) -101, 8);
        } else {
            class180.method1182((byte) -101, 10);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public static void method991(byte arg0) {
        if (arg0 < 3) {
            method991((byte) 76);
        }
        field2538 = null;
        field2536 = null;
        field2535 = null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
    public static final void method992(int arg0, int arg1) {
        class61 var2 = class249.field4410[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class61 var4 = class249.field4410[var3][arg0][arg1] = class249.field4410[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field826--;
                for (int var5 = 0; var5 < var4.field836; var5++) {
                    class200 var6 = var4.field823[var5];
                    if ((var6.field3554 >> 29 & 0x3L) == 2L && var6.field3549 == arg0 && var6.field3548 == arg1) {
                        var6.field3553--;
                    }
                }
            }
        }
        if (class249.field4410[0][arg0][arg1] == null) {
            class249.field4410[0][arg0][arg1] = new class61(0, arg0, arg1);
        }
        class249.field4410[0][arg0][arg1].field821 = var2;
        class249.field4410[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIIIIIII[III)V")
    public static final void method993(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg6 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg6 = 1;
        }
        field2524++;
        if (class55.field682 > arg2) {
            arg5 -= class55.field682 - arg2;
            arg2 = class55.field682;
        }
        if (arg6 == 10) {
            arg10 = arg10 + 3 & 0x3;
            arg6 = 1;
        }
        if (class55.field684 > arg4) {
            arg1 -= class55.field684 - arg4;
            arg4 = class55.field684;
        }
        int var11 = class55.field688 * arg4 + arg2;
        if (arg6 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg6 = 8;
        }
        if (arg7 >= -85) {
            return;
        }
        if (class55.field687 < arg2 + arg5) {
            arg5 = class55.field687 - arg2;
        }
        int var12 = class55.field688 - arg5;
        if (class55.field685 < arg1 + arg4) {
            arg1 = class55.field685 - arg4;
        }
        if (arg6 == 1) {
            if (arg10 == 0) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < arg5; var14++) {
                        if (var14 <= var13) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var15 = arg1 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg5; var16++) {
                        if (var15 >= var16) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var17 = 0; var17 < arg1; var17++) {
                    for (int var18 = 0; var18 < arg5; var18++) {
                        if (var17 <= var18) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg5; var20++) {
                        if (var19 <= var20) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 == 2) {
            if (arg10 == 0) {
                for (int var21 = arg1 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg5; var22++) {
                        if (var22 <= var21 >> 1) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var23 = 0; var23 < arg1; var23++) {
                    for (int var24 = 0; var24 < arg5; var24++) {
                        if (var23 << 1 <= var24) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var25 = 0; var25 < arg1; var25++) {
                    for (int var26 = arg5 - 1; var26 >= 0; var26--) {
                        if (var25 >> 1 >= var26) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var27 = arg1 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg5 - 1; var28 >= 0; var28--) {
                        if (var28 >= var27 << 1) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 == 3) {
            if (arg10 == 0) {
                for (int var29 = arg1 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg5 - 1; var30 >= 0; var30--) {
                        if (var30 <= var29 >> 1) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var31 = arg1 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg5; var32++) {
                        if (var32 >= var31 << 1) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var33 = 0; var33 < arg1; var33++) {
                    for (int var34 = 0; var34 < arg5; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var35 = 0; var35 < arg1; var35++) {
                    for (int var36 = arg5 - 1; var36 >= 0; var36--) {
                        if (var35 << 1 <= var36) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 == 4) {
            if (arg10 == 0) {
                for (int var37 = arg1 - 1; var37 >= 0; var37--) {
                    for (int var38 = 0; var38 < arg5; var38++) {
                        if (var37 >> 1 <= var38) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 1) {
                for (int var39 = 0; var39 < arg1; var39++) {
                    for (int var40 = 0; var40 < arg5; var40++) {
                        if (var40 <= var39 << 1) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 2) {
                for (int var41 = 0; var41 < arg1; var41++) {
                    for (int var42 = arg5 - 1; var42 >= 0; var42--) {
                        if (var41 >> 1 <= var42) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            } else if (arg10 == 3) {
                for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                    for (int var44 = arg5 - 1; var44 >= 0; var44--) {
                        if (var43 << 1 >= var44) {
                            arg8[var11] = arg9;
                        } else if (arg0) {
                            arg8[var11] = arg3;
                        }
                        var11++;
                    }
                    var11 += var12;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg10 == 0) {
                    for (int var53 = 0; var53 < arg1; var53++) {
                        for (int var54 = 0; var54 < arg5; var54++) {
                            if (var54 <= arg5 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var55 = 0; var55 < arg1; var55++) {
                        for (int var56 = 0; var56 < arg5; var56++) {
                            if (arg1 / 2 >= var55) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var57 = 0; var57 < arg1; var57++) {
                        for (int var58 = 0; var58 < arg5; var58++) {
                            if (var58 >= arg5 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var59 = 0; var59 < arg1; var59++) {
                        for (int var60 = 0; var60 < arg5; var60++) {
                            if (arg1 / 2 <= var59) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg10 == 0) {
                    for (int var61 = 0; var61 < arg1; var61++) {
                        for (int var62 = 0; var62 < arg5; var62++) {
                            if (var62 <= var61 - arg1 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var63 = arg1 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg5; var64++) {
                            if (var63 - arg1 / 2 >= var64) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var65 = arg1 - 1; var65 >= 0; var65--) {
                        for (int var66 = arg5 - 1; var66 >= 0; var66--) {
                            if (var66 <= var65 - arg1 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var67 = 0; var67 < arg1; var67++) {
                        for (int var68 = arg5 - 1; var68 >= 0; var68--) {
                            if (var68 <= var67 - arg1 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg10 == 0) {
                    for (int var69 = 0; var69 < arg1; var69++) {
                        for (int var70 = 0; var70 < arg5; var70++) {
                            if (var70 >= var69 - arg1 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var71 = arg1 - 1; var71 >= 0; var71--) {
                        for (int var72 = 0; var72 < arg5; var72++) {
                            if (var72 >= var71 - arg1 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var73 = arg1 - 1; var73 >= 0; var73--) {
                        for (int var74 = arg5 - 1; var74 >= 0; var74--) {
                            if (var74 >= var73 - arg1 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var75 = 0; var75 < arg1; var75++) {
                        for (int var76 = arg5 - 1; var76 >= 0; var76--) {
                            if (var76 >= var75 - arg1 / 2) {
                                arg8[var11] = arg9;
                            } else if (arg0) {
                                arg8[var11] = arg3;
                            }
                            var11++;
                        }
                        var11 += var12;
                    }
                    return;
                }
            }
        } else if (arg10 == 0) {
            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                for (int var46 = arg5 - 1; var46 >= 0; var46--) {
                    if (var46 >= var45 >> 1) {
                        arg8[var11] = arg9;
                    } else if (arg0) {
                        arg8[var11] = arg3;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg10 == 1) {
            for (int var47 = arg1 - 1; var47 >= 0; var47--) {
                for (int var48 = 0; var48 < arg5; var48++) {
                    if (var47 << 1 >= var48) {
                        arg8[var11] = arg9;
                    } else if (arg0) {
                        arg8[var11] = arg3;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg10 == 2) {
            for (int var49 = 0; var49 < arg1; var49++) {
                for (int var50 = 0; var50 < arg5; var50++) {
                    if (var49 >> 1 <= var50) {
                        arg8[var11] = arg9;
                    } else if (arg0) {
                        arg8[var11] = arg3;
                    }
                    var11++;
                }
                var11 += var12;
            }
        } else if (arg10 == 3) {
            for (int var51 = 0; var51 < arg1; var51++) {
                for (int var52 = arg5 - 1; var52 >= 0; var52--) {
                    if (var51 << 1 >= var52) {
                        arg8[var11] = arg9;
                    } else if (arg0) {
                        arg8[var11] = arg3;
                    }
                    var11++;
                }
                var11 += var12;
            }
        }
    }
}
