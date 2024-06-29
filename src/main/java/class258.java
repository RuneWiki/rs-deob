import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class258 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "J")
    public long field4576 = 0L;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Ljd;")
    public static class86 field4589 = class122.method868("M", true);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lrk;")
    public static class257 field4574 = new class257();

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field4591 = 500;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Ljd;")
    public static class86 field4593 = class122.method868("hint_headicons", true);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "F")
    public static float field4592;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public int field4572;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lse;")
    public static class198 field4578;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Leh;")
    public class80 field4583;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Leh;")
    public class80 field4590;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBI)V")
    public static final void method1741(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class36.field809.field3565 = 0;
        int var5 = 70 % ((-arg3 - 20) / 60);
        class36.field809.method1388(-80, 189);
        field4573++;
        class36.field809.method1388(-69, arg1);
        class36.field809.method1388(-93, arg0);
        class36.field809.method1428((byte) 127, arg2);
        class36.field809.method1428((byte) -99, arg4);
        class153.field2890 = -3;
        class138.field2633 = 0;
        class195.field3489 = 1;
        class253.field4497 = 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
    public static final void method1742(int arg0, byte arg1) {
        field4588++;
        class13 var2 = (class13) class152.field2876.method1698((long) arg0, (byte) 27);
        if (var2 != null) {
            var2.method1477(1);
            if (arg1 != 90) {
                field4591 = -84;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Loa;")
    public static final class97 method1743(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class97 var4 = var3.field4443;
            var3.field4443 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method1744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field4580++;
        if (arg9 != -63) {
            field4592 = -1.1685846F;
        }
        class162 var10 = null;
        for (class162 var11 = (class162) class229.field4158.method1737((byte) 74); var11 != null; var11 = (class162) class229.field4158.method1740(arg9 - 8780)) {
            if (var11.field3033 == arg7 && var11.field3055 == arg8 && var11.field3041 == arg1 && var11.field3052 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class162();
            var10.field3033 = arg7;
            var10.field3041 = arg1;
            var10.field3052 = arg0;
            var10.field3055 = arg8;
            class116.method817((byte) -125, var10);
            class229.field4158.method1731(-28, var10);
        }
        var10.field3046 = arg2;
        var10.field3044 = arg5;
        var10.field3036 = arg6;
        var10.field3049 = arg4;
        var10.field3043 = arg3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method1745(int arg0) {
        field4574 = null;
        field4589 = null;
        field4593 = null;
        field4578 = null;
        if (arg0 >= -96) {
            method1741(-123, -21, 81, (byte) 38, 62);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lcj;")
    public static final class115 method1746(int arg0) {
        field4586++;
        try {
            return arg0 == -25672 ? (class115) Class.forName("ga").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return new class4();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZIIIIII[III)V")
    public static final void method1747(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        field4585++;
        int var11 = arg0;
        if (class131.field2490 <= arg0) {
            return;
        }
        int var12 = arg0 + arg4;
        if (class131.field2489 > arg0) {
            var11 = class131.field2489;
        }
        if (class131.field2489 >= var12) {
            return;
        }
        if (var12 > class131.field2490) {
            var12 = class131.field2490;
        }
        int var13 = arg2;
        if (arg2 >= class131.field2492) {
            return;
        }
        if (class131.field2491 > arg2) {
            var13 = class131.field2491;
        }
        int var14 = arg2 + arg3;
        if (class131.field2491 >= var14) {
            return;
        }
        if (arg7 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg7 = 1;
        }
        int var15 = class131.field2495 * var13 + var11;
        int var16 = var13 - arg2;
        if (arg7 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 8;
        }
        int var17 = class131.field2495 + var11 - var12;
        if (arg10 != 1) {
            return;
        }
        int var18 = var12 - arg0;
        if (var14 > class131.field2492) {
            var14 = class131.field2492;
        }
        int var19 = var11 - arg0;
        int var20 = var14 - arg2;
        int var21 = arg3 - var20;
        int var22 = arg4 - var19;
        int var23 = arg3 - var16;
        int var24 = arg4 - var18;
        if (arg7 == 1) {
            if (arg9 == 0) {
                for (int var25 = var16; var25 < var20; var25++) {
                    for (int var26 = var19; var26 < var18; var26++) {
                        if (var26 <= var25) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 1) {
                for (int var27 = var23 - 1; var27 >= var21; var27--) {
                    for (int var28 = var19; var28 < var18; var28++) {
                        if (var28 <= var27) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 2) {
                for (int var29 = var16; var29 < var20; var29++) {
                    for (int var30 = var19; var30 < var18; var30++) {
                        if (var30 >= var29) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 3) {
                for (int var31 = var23 - 1; var31 >= var21; var31--) {
                    for (int var32 = var19; var32 < var18; var32++) {
                        if (var32 >= var31) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 == 2) {
            if (arg9 == 0) {
                for (int var33 = var23 - 1; var33 >= var21; var33--) {
                    for (int var34 = var19; var34 < var18; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 1) {
                for (int var35 = var16; var35 < var20; var35++) {
                    for (int var36 = var19; var36 < var18; var36++) {
                        if (var15 >= 0 && arg8.length > var15) {
                            if ((var35 << 1) <= var36) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var17;
                }
            } else if (arg9 == 2) {
                for (int var37 = var16; var37 < var20; var37++) {
                    for (int var38 = var22 - 1; var38 >= var24; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 3) {
                for (int var39 = var23 - 1; var39 >= var21; var39--) {
                    for (int var40 = var22 - 1; var40 >= var24; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 == 3) {
            if (arg9 == 0) {
                for (int var41 = var23 - 1; var41 >= var21; var41--) {
                    for (int var42 = var22 - 1; var42 >= var24; var42--) {
                        if ((var41 >> 1) >= var42) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 1) {
                for (int var43 = var23 - 1; var43 >= var21; var43--) {
                    for (int var44 = var19; var44 < var18; var44++) {
                        if (var44 >= (var43 << 1)) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 2) {
                for (int var45 = var16; var45 < var20; var45++) {
                    for (int var46 = var19; var46 < var18; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 3) {
                for (int var47 = var16; var47 < var20; var47++) {
                    for (int var48 = var22 - 1; var48 >= var24; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 == 4) {
            if (arg9 == 0) {
                for (int var49 = var23 - 1; var49 >= var21; var49--) {
                    for (int var50 = var19; var50 < var18; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 1) {
                for (int var51 = var16; var51 < var20; var51++) {
                    for (int var52 = var19; var52 < var18; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 2) {
                for (int var53 = var16; var53 < var20; var53++) {
                    for (int var54 = var22 - 1; var54 >= var24; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg9 == 3) {
                for (int var55 = var23 - 1; var55 >= var21; var55--) {
                    for (int var56 = var22 - 1; var56 >= var24; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg8[var15] = arg5;
                        } else if (arg1) {
                            arg8[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg9 == 0) {
                    for (int var65 = var16; var65 < var20; var65++) {
                        for (int var66 = var19; var66 < var18; var66++) {
                            if (arg4 / 2 >= var66) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var16; var67 < var20; var67++) {
                        for (int var68 = var19; var68 < var18; var68++) {
                            if (var67 <= arg3 / 2) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var16; var69 < var20; var69++) {
                        for (int var70 = var19; var70 < var18; var70++) {
                            if (var70 >= arg4 / 2) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var71 = var16; var71 < var20; var71++) {
                        for (int var72 = var19; var72 < var18; var72++) {
                            if (arg3 / 2 <= var71) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg9 == 0) {
                    for (int var73 = var16; var73 < var20; var73++) {
                        for (int var74 = var19; var74 < var18; var74++) {
                            if (var74 <= (var73 - (arg3 / 2))) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var75 = var23 - 1; var75 >= var21; var75--) {
                        for (int var76 = var19; var76 < var18; var76++) {
                            if (var75 - (arg3 / 2) >= var76) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var77 = var23 - 1; var77 >= var21; var77--) {
                        for (int var78 = var22 - 1; var78 >= var24; var78--) {
                            if ((var77 - arg3 / 2) >= var78) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var79 = var16; var79 < var20; var79++) {
                        for (int var80 = var22 - 1; var80 >= var24; var80--) {
                            if (var80 <= (var79 - (arg3 / 2))) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg9 == 0) {
                    for (int var81 = var16; var81 < var20; var81++) {
                        for (int var82 = var19; var82 < var18; var82++) {
                            if (var82 >= (var81 - (arg3 / 2))) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var83 = var23 - 1; var83 >= var21; var83--) {
                        for (int var84 = var19; var84 < var18; var84++) {
                            if (var83 - (arg3 / 2) <= var84) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var85 = var23 - 1; var85 >= var21; var85--) {
                        for (int var86 = var22 - 1; var86 >= var24; var86--) {
                            if (var85 - arg3 / 2 <= var86) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var87 = var16; var87 < var20; var87++) {
                        for (int var88 = var22 - 1; var88 >= var24; var88--) {
                            if (var87 - (arg3 / 2) <= var88) {
                                arg8[var15] = arg5;
                            } else if (arg1) {
                                arg8[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var57 = var23 - 1; var57 >= var21; var57--) {
                for (int var58 = var22 - 1; var58 >= var24; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg8[var15] = arg5;
                    } else if (arg1) {
                        arg8[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg9 == 1) {
            for (int var59 = var23 - 1; var59 >= var21; var59--) {
                for (int var60 = var19; var60 < var18; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg8[var15] = arg5;
                    } else if (arg1) {
                        arg8[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg9 == 2) {
            for (int var61 = var16; var61 < var20; var61++) {
                for (int var62 = var19; var62 < var18; var62++) {
                    if ((var61 >> 1) <= var62) {
                        arg8[var15] = arg5;
                    } else if (arg1) {
                        arg8[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg9 == 3) {
            for (int var63 = var16; var63 < var20; var63++) {
                for (int var64 = var22 - 1; var64 >= var24; var64--) {
                    if (var63 << 1 >= var64) {
                        arg8[var15] = arg5;
                    } else if (arg1) {
                        arg8[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var17;
            }
        }
    }
}
