import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class141 extends class25 {

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Lcd;")
    public class64 field2482;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Z")
    public static boolean field2485 = true;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Lig;")
    public static class168 field2487 = new class168(4);

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Z")
    public static boolean field2491 = false;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lqm;")
    public static class222 field2483;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[Lcd;")
    public static class64[] field2486;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZII[IIIIIII)V", line = 5)
    public static final void method998(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2490++;
        int var11 = arg0;
        if (arg0 >= class210.field3532) {
            return;
        }
        if (class210.field3531 > arg0) {
            var11 = class210.field3531;
        }
        int var12 = arg0 + arg6;
        if (class210.field3531 >= var12) {
            return;
        }
        if (class210.field3532 < var12) {
            var12 = class210.field3532;
        }
        int var13 = arg3;
        if (arg3 >= class210.field3534) {
            return;
        }
        if (class210.field3530 > arg3) {
            var13 = class210.field3530;
        }
        int var14 = arg2 + arg3;
        if (var14 <= class210.field3530 || arg8 != -1929) {
            return;
        }
        if (class210.field3534 < var14) {
            var14 = class210.field3534;
        }
        if (arg9 == 9) {
            arg7 = arg7 + 1 & 0x3;
            arg9 = 1;
        }
        int var15 = var14 - arg3;
        if (arg9 == 10) {
            arg9 = 1;
            arg7 = arg7 + 3 & 0x3;
        }
        int var16 = class210.field3537 * var13 + var11;
        if (arg9 == 11) {
            arg7 = arg7 + 3 & 0x3;
            arg9 = 8;
        }
        int var17 = var13 - arg3;
        int var18 = class210.field3537 + var11 - var12;
        int var19 = var11 - arg0;
        int var20 = var12 - arg0;
        int var21 = arg6 - var19;
        int var22 = arg2 - var15;
        int var23 = arg2 - var17;
        int var24 = arg6 - var20;
        if (arg9 == 1) {
            if (arg7 == 0) {
                for (int var31 = var17; var31 < var15; var31++) {
                    for (int var32 = var19; var32 < var20; var32++) {
                        if (var32 <= var31) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var29 = var23 - 1; var29 >= var22; var29--) {
                    for (int var30 = var19; var30 < var20; var30++) {
                        if (var30 <= var29) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var27 = var17; var27 < var15; var27++) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var27 <= var28) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var25 = var23 - 1; var25 >= var22; var25--) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var25 <= var26) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 2) {
            if (arg7 == 0) {
                for (int var33 = var23 - 1; var33 >= var22; var33--) {
                    for (int var34 = var19; var34 < var20; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var39 = var17; var39 < var15; var39++) {
                    for (int var40 = var19; var40 < var20; var40++) {
                        if (var16 >= 0 && arg4.length > var16) {
                            if (var40 >= (var39 << 1)) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var21 - 1; var36 >= var24; var36--) {
                        if (var36 <= var35 >> 1) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var37 = var23 - 1; var37 >= var22; var37--) {
                    for (int var38 = var21 - 1; var38 >= var24; var38--) {
                        if (var38 >= (var37 << 1)) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 3) {
            if (arg7 == 0) {
                for (int var87 = var23 - 1; var87 >= var22; var87--) {
                    for (int var88 = var21 - 1; var88 >= var24; var88--) {
                        if (var88 <= var87 >> 1) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var81 = var23 - 1; var81 >= var22; var81--) {
                    for (int var82 = var19; var82 < var20; var82++) {
                        if (var82 >= var81 << 1) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var85 = var17; var85 < var15; var85++) {
                    for (int var86 = var19; var86 < var20; var86++) {
                        if (var85 >> 1 >= var86) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var83 = var17; var83 < var15; var83++) {
                    for (int var84 = var21 - 1; var84 >= var24; var84--) {
                        if ((var83 << 1) <= var84) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 4) {
            if (arg7 == 0) {
                for (int var79 = var23 - 1; var79 >= var22; var79--) {
                    for (int var80 = var19; var80 < var20; var80++) {
                        if ((var79 >> 1) <= var80) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var77 = var17; var77 < var15; var77++) {
                    for (int var78 = var19; var78 < var20; var78++) {
                        if (var77 << 1 >= var78) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var73 = var17; var73 < var15; var73++) {
                    for (int var74 = var21 - 1; var74 >= var24; var74--) {
                        if (var73 >> 1 <= var74) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var75 = var23 - 1; var75 >= var22; var75--) {
                    for (int var76 = var21 - 1; var76 >= var24; var76--) {
                        if (var76 <= var75 << 1) {
                            arg4[var16] = arg5;
                        } else if (arg1) {
                            arg4[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg7 == 0) {
                    for (int var55 = var17; var55 < var15; var55++) {
                        for (int var56 = var19; var56 < var20; var56++) {
                            if (arg6 / 2 >= var56) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var53 = var17; var53 < var15; var53++) {
                        for (int var54 = var19; var54 < var20; var54++) {
                            if ((arg2 / 2) >= var53) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var49 = var17; var49 < var15; var49++) {
                        for (int var50 = var19; var50 < var20; var50++) {
                            if (var50 >= (arg6 / 2)) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var51 = var17; var51 < var15; var51++) {
                        for (int var52 = var19; var52 < var20; var52++) {
                            if (var51 >= arg2 / 2) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg7 == 0) {
                    for (int var63 = var17; var63 < var15; var63++) {
                        for (int var64 = var19; var64 < var20; var64++) {
                            if (var64 <= var63 - (arg2 / 2)) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var61 = var23 - 1; var61 >= var22; var61--) {
                        for (int var62 = var19; var62 < var20; var62++) {
                            if (var62 <= var61 - (arg2 / 2)) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var59 = var23 - 1; var59 >= var22; var59--) {
                        for (int var60 = var21 - 1; var60 >= var24; var60--) {
                            if (var60 <= var59 - (arg2 / 2)) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var57 = var17; var57 < var15; var57++) {
                        for (int var58 = var21 - 1; var58 >= var24; var58--) {
                            if (var58 <= (var57 - (arg2 / 2))) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg7 == 0) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var19; var72 < var20; var72++) {
                            if (var72 >= var71 - arg2 / 2) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var65 = var23 - 1; var65 >= var22; var65--) {
                        for (int var66 = var19; var66 < var20; var66++) {
                            if (var66 >= (var65 - (arg2 / 2))) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var69 = var23 - 1; var69 >= var22; var69--) {
                        for (int var70 = var21 - 1; var70 >= var24; var70--) {
                            if ((var69 - (arg2 / 2)) <= var70) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var21 - 1; var68 >= var24; var68--) {
                            if ((var67 - (arg2 / 2)) <= var68) {
                                arg4[var16] = arg5;
                            } else if (arg1) {
                                arg4[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg7 == 0) {
            for (int var47 = var23 - 1; var47 >= var22; var47--) {
                for (int var48 = var21 - 1; var48 >= var24; var48--) {
                    if (var48 >= var47 >> 1) {
                        arg4[var16] = arg5;
                    } else if (arg1) {
                        arg4[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 1) {
            for (int var45 = var23 - 1; var45 >= var22; var45--) {
                for (int var46 = var19; var46 < var20; var46++) {
                    if ((var45 << 1) >= var46) {
                        arg4[var16] = arg5;
                    } else if (arg1) {
                        arg4[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 2) {
            for (int var43 = var17; var43 < var15; var43++) {
                for (int var44 = var19; var44 < var20; var44++) {
                    if ((var43 >> 1) <= var44) {
                        arg4[var16] = arg5;
                    } else if (arg1) {
                        arg4[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 3) {
            for (int var41 = var17; var41 < var15; var41++) {
                for (int var42 = var21 - 1; var42 >= var24; var42--) {
                    if (var41 << 1 >= var42) {
                        arg4[var16] = arg5;
                    } else if (arg1) {
                        arg4[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 1193)
    public static void method999(boolean arg0) {
        field2486 = null;
        field2487 = null;
        if (arg0) {
            field2486 = (class64[]) null;
        }
        field2483 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)J", line = 1209)
    public static final long method1000(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field5075; var4++) {
            class195 var5 = var3.field5090[var4];
            if ((var5.field3324 >> 29 & 0x3L) == 2L && var5.field3313 == arg1 && var5.field3322 == arg2) {
                return var5.field3324;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Z", line = 1230)
    public static final boolean method1001(byte arg0) {
        if (arg0 >= -2) {
            return true;
        } else {
            field2484++;
            return class123.field2216 ? true : field2485;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLfk;)V", line = 1245)
    public static final void method1002(byte arg0, class41 arg1) {
        field2481++;
        class246 var2 = (class246) class17.field336.method1151(arg1.field672.method509(31492), 0);
        int var3 = 106 / ((71 - arg0) / 49);
        if (var2 == null) {
            class296.method2065(arg1.field1876[0], arg1.field1898[0], -106, class20.field364, (class232) null, 0, (class290) null, arg1);
        } else {
            var2.method1781(0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I", line = 1264)
    public static final int method1003(int arg0, int arg1) {
        field2489++;
        if (arg0 != 127) {
            field2483 = (class222) null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 1285)
    public class141() {
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V", line = 1289)
    public static final void method1004(int arg0) {
        field2493++;
        int var1 = class137.field2440 * 128 + 64;
        int var2 = class258.field4456 * 128 + 64;
        int var3 = class15.method169(var1, 13257, class20.field364, var2) - class94.field1749;
        if (class227.field3857 < 100) {
            if (var2 > class99.field1791) {
                class99.field1791 += (var2 - class99.field1791) * class227.field3857 / 1000 + class156.field2751;
                if (class99.field1791 > var2) {
                    class99.field1791 = var2;
                }
            }
            if (class268.field4622 < var3) {
                class268.field4622 += (var3 - class268.field4622) * class227.field3857 / 1000 + class156.field2751;
                if (var3 < class268.field4622) {
                    class268.field4622 = var3;
                }
            }
            if (var2 < class99.field1791) {
                class99.field1791 -= (class99.field1791 - var2) * class227.field3857 / 1000 + class156.field2751;
                if (class99.field1791 < var2) {
                    class99.field1791 = var2;
                }
            }
            if (class268.field4622 > var3) {
                class268.field4622 -= (class268.field4622 - var3) * class227.field3857 / 1000 + class156.field2751;
                if (class268.field4622 < var3) {
                    class268.field4622 = var3;
                }
            }
            if (var1 > class119.field2156) {
                class119.field2156 += class156.field2751 + ((var1 - class119.field2156) * class227.field3857 / 1000);
                if (class119.field2156 > var1) {
                    class119.field2156 = var1;
                }
            }
            if (var1 < class119.field2156) {
                class119.field2156 -= (class119.field2156 - var1) * class227.field3857 / 1000 + class156.field2751;
                if (var1 > class119.field2156) {
                    class119.field2156 = var1;
                }
            }
        } else {
            class119.field2156 = class137.field2440 * 128 + 64;
            class99.field1791 = class258.field4456 * 128 + 64;
            class268.field4622 = class15.method169(class119.field2156, 13257, class20.field364, class99.field1791) - class94.field1749;
        }
        int var4 = class84.field1556 * 128 + 64;
        int var5 = class245.field4263 * 128 + 64;
        int var6 = class15.method169(var5, 13257, class20.field364, var4) - class290.field4992;
        int var7 = var6 - class268.field4622;
        int var8 = var4 - class99.field1791;
        int var9 = var5 - class119.field2156;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        if (class131.field2336 < var11) {
            class131.field2336 += class121.field2177 + ((var11 - class131.field2336) * class304.field5202 / 1000);
            if (var11 < class131.field2336) {
                class131.field2336 = var11;
            }
        }
        int var13 = var12 - class181.field3102;
        if (var11 < class131.field2336) {
            class131.field2336 -= class121.field2177 + ((class131.field2336 - var11) * class304.field5202 / 1000);
            if (class131.field2336 < var11) {
                class131.field2336 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class181.field3102 += class304.field5202 * var13 / 1000 + class121.field2177;
            class181.field3102 &= 0x7FF;
        }
        if (var13 < 0) {
            class181.field3102 -= -var13 * class304.field5202 / 1000 + class121.field2177;
            class181.field3102 &= 0x7FF;
        }
        int var14 = var12 - class181.field3102;
        int var15 = -116 % ((60 - arg0) / 45);
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class181.field3102 = var12;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lcd;)V", line = 1442)
    public class141(class64 arg0) {
        this.field2482 = arg0;
    }
}
