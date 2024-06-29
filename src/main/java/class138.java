import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class138 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field2462 = 0;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field2469 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field2459 = 0;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lia;")
    private static class257 field2473 = class28.method234(87, "Please remove ");

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lia;")
    public static class257 field2465 = field2473;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lia;")
    public static class257 field2470 = field2473;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lmb;")
    public static class178 field2467;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lld;")
    public static class51 field2460;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[Llc;")
    public static class90[] field2463;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "[[[B")
    public static byte[][][] field2476;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIIIIIII[II)V")
    public static final void method947(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg2 < class23.field446) {
            arg10 -= class23.field446 - arg2;
            arg2 = class23.field446;
        }
        field2466++;
        if (arg6 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg4 < class23.field449) {
            arg7 -= class23.field449 - arg4;
            arg4 = class23.field449;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg4 + arg7 > class23.field450) {
            arg7 = class23.field450 - arg4;
        }
        if (class23.field448 < (arg2 + arg10)) {
            arg10 = class23.field448 - arg2;
        }
        int var11 = class23.field451 - arg10;
        int var12 = class23.field451 * arg4 + arg2;
        if (arg6 == 1) {
            if (arg0 == 0) {
                for (int var13 = 0; var13 < arg7; var13++) {
                    for (int var14 = 0; var14 < arg10; var14++) {
                        if (var13 >= var14) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var15 = arg7 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg10; var16++) {
                        if (var15 >= var16) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var17 = 0; var17 < arg7; var17++) {
                    for (int var18 = 0; var18 < arg10; var18++) {
                        if (var18 >= var17) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var19 = arg7 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg10; var20++) {
                        if (var19 <= var20) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg6 == 2) {
            if (arg0 == 0) {
                for (int var21 = arg7 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg10; var22++) {
                        if (var22 <= var21 >> 1) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var23 = 0; var23 < arg7; var23++) {
                    for (int var24 = 0; var24 < arg10; var24++) {
                        if (var24 >= (var23 << 1)) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var25 = 0; var25 < arg7; var25++) {
                    for (int var26 = arg10 - 1; var26 >= 0; var26--) {
                        if ((var25 >> 1) >= var26) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var27 = arg7 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg10 - 1; var28 >= 0; var28--) {
                        if (var27 << 1 <= var28) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg3 == arg6) {
            if (arg0 == 0) {
                for (int var29 = arg7 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg10 - 1; var30 >= 0; var30--) {
                        if (var30 <= var29 >> 1) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var31 = arg7 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg10; var32++) {
                        if (var32 >= var31 << 1) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var33 = 0; var33 < arg7; var33++) {
                    for (int var34 = 0; var34 < arg10; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var35 = 0; var35 < arg7; var35++) {
                    for (int var36 = arg10 - 1; var36 >= 0; var36--) {
                        if (var36 >= (var35 << 1)) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg6 == 4) {
            if (arg0 == 0) {
                for (int var37 = arg7 - 1; var37 >= 0; var37--) {
                    for (int var38 = 0; var38 < arg10; var38++) {
                        if (var38 >= (var37 >> 1)) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 1) {
                for (int var39 = 0; var39 < arg7; var39++) {
                    for (int var40 = 0; var40 < arg10; var40++) {
                        if (var40 <= (var39 << 1)) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 2) {
                for (int var41 = 0; var41 < arg7; var41++) {
                    for (int var42 = arg10 - 1; var42 >= 0; var42--) {
                        if (var42 >= (var41 >> 1)) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg0 == 3) {
                for (int var43 = arg7 - 1; var43 >= 0; var43--) {
                    for (int var44 = arg10 - 1; var44 >= 0; var44--) {
                        if (var43 << 1 >= var44) {
                            arg9[var12] = arg8;
                        } else if (arg1) {
                            arg9[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg0 == 0) {
                    for (int var53 = 0; var53 < arg7; var53++) {
                        for (int var54 = 0; var54 < arg10; var54++) {
                            if (arg10 / 2 >= var54) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var55 = 0; var55 < arg7; var55++) {
                        for (int var56 = 0; var56 < arg10; var56++) {
                            if (var55 <= arg7 / 2) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var57 = 0; var57 < arg7; var57++) {
                        for (int var58 = 0; var58 < arg10; var58++) {
                            if ((arg10 / 2) <= var58) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var59 = 0; var59 < arg7; var59++) {
                        for (int var60 = 0; var60 < arg10; var60++) {
                            if (var59 >= (arg7 / 2)) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg0 == 0) {
                    for (int var61 = 0; var61 < arg7; var61++) {
                        for (int var62 = 0; var62 < arg10; var62++) {
                            if (var61 - (arg7 / 2) >= var62) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var63 = arg7 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg10; var64++) {
                            if ((var63 - arg7 / 2) >= var64) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var65 = arg7 - 1; var65 >= 0; var65--) {
                        for (int var66 = arg10 - 1; var66 >= 0; var66--) {
                            if (var65 - (arg7 / 2) >= var66) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var67 = 0; var67 < arg7; var67++) {
                        for (int var68 = arg10 - 1; var68 >= 0; var68--) {
                            if (var67 - (arg7 / 2) >= var68) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg0 == 0) {
                    for (int var69 = 0; var69 < arg7; var69++) {
                        for (int var70 = 0; var70 < arg10; var70++) {
                            if (var70 >= var69 - (arg7 / 2)) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var71 = arg7 - 1; var71 >= 0; var71--) {
                        for (int var72 = 0; var72 < arg10; var72++) {
                            if ((var71 - arg7 / 2) <= var72) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var73 = arg7 - 1; var73 >= 0; var73--) {
                        for (int var74 = arg10 - 1; var74 >= 0; var74--) {
                            if (var73 - (arg7 / 2) <= var74) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var75 = 0; var75 < arg7; var75++) {
                        for (int var76 = arg10 - 1; var76 >= 0; var76--) {
                            if (var76 >= (var75 - (arg7 / 2))) {
                                arg9[var12] = arg8;
                            } else if (arg1) {
                                arg9[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
        } else if (arg0 == 0) {
            for (int var45 = arg7 - 1; var45 >= 0; var45--) {
                for (int var46 = arg10 - 1; var46 >= 0; var46--) {
                    if (var45 >> 1 <= var46) {
                        arg9[var12] = arg8;
                    } else if (arg1) {
                        arg9[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg0 == 1) {
            for (int var47 = arg7 - 1; var47 >= 0; var47--) {
                for (int var48 = 0; var48 < arg10; var48++) {
                    if (var48 <= (var47 << 1)) {
                        arg9[var12] = arg8;
                    } else if (arg1) {
                        arg9[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg0 == 2) {
            for (int var49 = 0; var49 < arg7; var49++) {
                for (int var50 = 0; var50 < arg10; var50++) {
                    if ((var49 >> 1) <= var50) {
                        arg9[var12] = arg8;
                    } else if (arg1) {
                        arg9[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg0 == 3) {
            for (int var51 = 0; var51 < arg7; var51++) {
                for (int var52 = arg10 - 1; var52 >= 0; var52--) {
                    if (var52 <= (var51 << 1)) {
                        arg9[var12] = arg8;
                    } else if (arg1) {
                        arg9[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static final void method948(boolean arg0) {
        if (!arg0) {
            field2471 = 15;
        }
        for (int var1 = 0; var1 < class238.field4063; var1++) {
            int var10002 = class99.field1822[var1]--;
            if (class99.field1822[var1] >= -10) {
                class88 var3 = class9.field181[var1];
                if (var3 == null) {
                    var3 = class88.method659(class76.field1490, class40.field832[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class99.field1822[var1] += var3.method657();
                    class9.field181[var1] = var3;
                }
                if (class99.field1822[var1] < 0) {
                    int var10;
                    if (class35.field709[var1] == 0) {
                        var10 = class38.field747;
                    } else {
                        int var4 = (class35.field709[var1] & 0xFF) * 128;
                        int var5 = class35.field709[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class137.field2441.field4177;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class35.field709[var1] & 0xFF5F) >> 8;
                        int var8 = var7 * 128 + 64 - class137.field2441.field4143;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class99.field1822[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class99.field1830 / var4;
                    }
                    if (var10 > 0) {
                        class261 var11 = var3.method658().method1735(class57.field1211);
                        class4 var12 = class4.method80(var11, 100, var10);
                        var12.method77(class108.field2023[var1] - 1);
                        class78.field1504.method461(var12);
                    }
                    class99.field1822[var1] = -100;
                }
            } else {
                class238.field4063--;
                for (int var2 = var1; var2 < class238.field4063; var2++) {
                    class40.field832[var2] = class40.field832[var2 + 1];
                    class9.field181[var2] = class9.field181[var2 + 1];
                    class108.field2023[var2] = class108.field2023[var2 + 1];
                    class99.field1822[var2] = class99.field1822[var2 + 1];
                    class35.field709[var2] = class35.field709[var2 + 1];
                }
                var1--;
            }
        }
        if (class246.field4259 && !class239.method1573((byte) -88)) {
            if (class26.field513 != 0 && class124.field2228 != -1) {
                class57.method437(false, class26.field513, class259.field4502, class124.field2228, 0, -21260);
            }
            class246.field4259 = false;
        } else if (class26.field513 != 0 && class124.field2228 != -1 && !class239.method1573((byte) -115)) {
            class205.field3524.method908(!arg0, 158);
            class205.field3524.method1066(-1687589720, class124.field2228);
            class55.field1170++;
            class124.field2228 = -1;
        }
        field2464++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
    public static final int method949(int arg0) {
        if (arg0 >= -79) {
            return -108;
        } else {
            field2461++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static void method950(boolean arg0) {
        field2463 = null;
        field2473 = null;
        if (arg0) {
            field2469 = -120;
        }
        field2460 = null;
        field2467 = null;
        field2465 = null;
        field2470 = null;
        field2476 = null;
    }
}
