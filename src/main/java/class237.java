import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class237 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lli;")
    public static class185 field4234 = class245.method1649("brillant3:", 122);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Lli;")
    public static class185 field4232 = class245.method1649("Hierhin drehen", 124);

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lli;")
    public static class185 field4241 = class245.method1649("_labels", 126);

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lli;")
    public class185 field4237;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)Lli;")
    public static final class185 method1607(int arg0, byte arg1) {
        int var2 = 57 % ((18 - arg1) / 57);
        field4242++;
        return class87.method567(-11039, new class185[] { class90.method591(arg0 >> 24 & 0xFF, 0), class211.field3856, class90.method591(arg0 >> 16 & 0xFF, 0), class211.field3856, class90.method591(arg0 >> 8 & 0xFF, 0), class211.field3856, class90.method591(arg0 & 0xFF, 0) });
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        field4245++;
        if (arg0 != 10190) {
            field4234 = null;
        }
        if (!class17.method125(arg0 - 10068) && class265.field4703 != class111.field2009) {
            class6.method74(class265.field4703, class103.field1868, class241.field4310.field2720[0], class241.field4310.field2651[0], class265.field4704, 0, false);
        } else if (class265.field4703 != class120.field2192) {
            class120.field2192 = class265.field4703;
            class88.method579(class265.field4703, (byte) 105);
            class81.method522(-1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)I")
    public static final int method1609(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 / arg0;
        field4235++;
        int var5 = arg1 / arg0;
        int var6 = arg3 & arg0 - 1;
        int var7 = arg0 + arg2 & arg1;
        int var8 = class257.method1751(var4, var5, -25551);
        int var9 = class257.method1751(var4 + 1, var5, -25551);
        int var10 = class257.method1751(var4, var5 + 1, -25551);
        int var11 = class257.method1751(var4 + 1, var5 - -1, -25551);
        int var12 = class44.method270(arg0, var6, var9, var8, false);
        int var13 = class44.method270(arg0, var6, var11, var10, false);
        return class44.method270(arg0, var7, var13, var12, false);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)V")
    public static final void method1610(int arg0, byte arg1, int arg2) {
        field4240++;
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class173.field3178[arg0];
        int var5 = class9.field191[arg0];
        if (arg2 == 0) {
            class182.field3349.method577(152, 0);
            class182.field3349.method877((byte) 125, var3 + var3 + 3);
            class19.field310++;
        }
        if (arg2 == 1) {
            class182.field3349.method577(212, 0);
            class182.field3349.method877((byte) 103, var3 + var3 + 17);
            class38.field591++;
        }
        if (arg2 == 2) {
            class265.field4702++;
            class182.field3349.method577(224, 0);
            class182.field3349.method877((byte) 113, var3 + var3 + 3);
        }
        class182.field3349.method846(class139.field2615[82] ? 1 : 0, true);
        class182.field3349.method874(class107.field1933 + var5, 1538997896);
        if (arg1 != 4) {
            method1608(-69);
        }
        class256.field4551 = class173.field3178[0];
        class24.field405 = class9.field191[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class182.field3349.method877((byte) 119, class173.field3178[arg0] - var4);
            class182.field3349.method878(true, class9.field191[arg0] - var5);
        }
        class182.field3349.method874(class77.field1339 + var4, 1538997896);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static void method1611(int arg0) {
        field4241 = null;
        field4232 = null;
        field4234 = null;
        if (arg0 != 5749) {
            field4232 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZI[IIIIII)V")
    public static final void method1612(int arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4244++;
        int var11 = arg6;
        if (class159.field3010 <= arg6) {
            return;
        }
        if (class159.field3008 > arg6) {
            var11 = class159.field3008;
        }
        int var12 = arg2 + arg6;
        if (var12 <= class159.field3008) {
            return;
        }
        if (arg4 > -47) {
            field4232 = null;
        }
        if (class159.field3010 < var12) {
            var12 = class159.field3010;
        }
        int var13 = arg8;
        if (arg8 >= class159.field3016) {
            return;
        }
        if (class159.field3013 > arg8) {
            var13 = class159.field3013;
        }
        int var14 = arg1 + arg8;
        if (class159.field3013 >= var14) {
            return;
        }
        if (var14 > class159.field3016) {
            var14 = class159.field3016;
        }
        if (arg10 == 9) {
            arg10 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        int var15 = var14 - arg8;
        if (arg10 == 10) {
            arg10 = 1;
            arg7 = arg7 + 3 & 0x3;
        }
        if (arg10 == 11) {
            arg10 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        int var16 = class159.field3009 * var13 + var11;
        int var17 = class159.field3009 + var11 - var12;
        int var18 = var13 - arg8;
        int var19 = var12 - arg6;
        int var20 = arg2 - var19;
        int var21 = var11 - arg6;
        int var22 = arg2 - var21;
        int var23 = arg1 - var15;
        int var24 = arg1 - var18;
        if (arg10 == 1) {
            if (arg7 == 0) {
                for (int var25 = var18; var25 < var15; var25++) {
                    for (int var26 = var21; var26 < var19; var26++) {
                        if (var25 >= var26) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var21; var28 < var19; var28++) {
                        if (var28 <= var27) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 2) {
                for (int var29 = var18; var29 < var15; var29++) {
                    for (int var30 = var21; var30 < var19; var30++) {
                        if (var29 <= var30) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var21; var32 < var19; var32++) {
                        if (var31 <= var32) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg10 == 2) {
            if (arg7 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var21; var34 < var19; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 1) {
                for (int var35 = var18; var35 < var15; var35++) {
                    for (int var36 = var21; var36 < var19; var36++) {
                        if (var16 >= 0 && arg5.length > var16) {
                            if (var35 << 1 <= var36) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var17;
                }
            } else if (arg7 == 2) {
                for (int var37 = var18; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var20; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var20; var40--) {
                        if (var40 >= var39 << 1) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg10 == 3) {
            if (arg7 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var22 - 1; var42 >= var20; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var21; var44 < var19; var44++) {
                        if (var44 >= (var43 << 1)) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 2) {
                for (int var45 = var18; var45 < var15; var45++) {
                    for (int var46 = var21; var46 < var19; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 3) {
                for (int var47 = var18; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var20; var48--) {
                        if (var48 >= var47 << 1) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg10 == 4) {
            if (arg7 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var21; var50 < var19; var50++) {
                        if (var50 >= (var49 >> 1)) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 1) {
                for (int var51 = var18; var51 < var15; var51++) {
                    for (int var52 = var21; var52 < var19; var52++) {
                        if (var51 << 1 >= var52) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 2) {
                for (int var53 = var18; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var20; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg7 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var22 - 1; var56 >= var20; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg5[var16] = arg9;
                        } else if (arg3) {
                            arg5[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg10 != 5) {
            if (arg10 == 6) {
                if (arg7 == 0) {
                    for (int var65 = var18; var65 < var15; var65++) {
                        for (int var66 = var21; var66 < var19; var66++) {
                            if (var66 <= (arg2 / 2)) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var67 = var18; var67 < var15; var67++) {
                        for (int var68 = var21; var68 < var19; var68++) {
                            if (var67 <= arg1 / 2) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var69 = var18; var69 < var15; var69++) {
                        for (int var70 = var21; var70 < var19; var70++) {
                            if (var70 >= (arg2 / 2)) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var71 = var18; var71 < var15; var71++) {
                        for (int var72 = var21; var72 < var19; var72++) {
                            if ((arg1 / 2) <= var71) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg10 == 7) {
                if (arg7 == 0) {
                    for (int var73 = var18; var73 < var15; var73++) {
                        for (int var74 = var21; var74 < var19; var74++) {
                            if (var73 - (arg1 / 2) >= var74) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var21; var76 < var19; var76++) {
                            if (var75 - (arg1 / 2) >= var76) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var22 - 1; var78 >= var20; var78--) {
                            if (var78 <= (var77 - (arg1 / 2))) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var79 = var18; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var20; var80--) {
                            if (var80 <= (var79 - (arg1 / 2))) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg10 == 8) {
                if (arg7 == 0) {
                    for (int var81 = var18; var81 < var15; var81++) {
                        for (int var82 = var21; var82 < var19; var82++) {
                            if (var81 - (arg1 / 2) <= var82) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var21; var84 < var19; var84++) {
                            if (var83 - (arg1 / 2) <= var84) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var22 - 1; var86 >= var20; var86--) {
                            if (var85 - (arg1 / 2) <= var86) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var87 = var18; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var20; var88--) {
                            if (var88 >= (var87 - arg1 / 2)) {
                                arg5[var16] = arg9;
                            } else if (arg3) {
                                arg5[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
        } else if (arg7 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var22 - 1; var58 >= var20; var58--) {
                    if (var57 >> 1 <= var58) {
                        arg5[var16] = arg9;
                    } else if (arg3) {
                        arg5[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg7 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var21; var60 < var19; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg5[var16] = arg9;
                    } else if (arg3) {
                        arg5[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg7 == 2) {
            for (int var61 = var18; var61 < var15; var61++) {
                for (int var62 = var21; var62 < var19; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg5[var16] = arg9;
                    } else if (arg3) {
                        arg5[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg7 == 3) {
            for (int var63 = var18; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var20; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg5[var16] = arg9;
                    } else if (arg3) {
                        arg5[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static final void method1613(boolean arg0) {
        class118.field2109.method86(0);
        field4239++;
        if (!arg0) {
            method1608(-101);
        }
    }
}
