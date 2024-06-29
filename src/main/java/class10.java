import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class10 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lok;")
    public static class41 field130 = class137.method956(")4p=", 45);

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
    public static int[] field132 = new int[128];

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
    public static boolean field136 = false;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lmh;")
    public static class65 field137;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lfm;")
    public static class94 field135;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[Lka;")
    public static class279[] field131;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[IIIIZZIII)V", line = 27)
    public static final void method37(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field133++;
        int var11 = arg8;
        if (arg8 >= class54.field802) {
            return;
        }
        if (class54.field795 > arg8) {
            var11 = class54.field795;
        }
        int var12 = arg8 + arg0;
        if (class54.field795 >= var12) {
            return;
        }
        if (class54.field802 < var12) {
            var12 = class54.field802;
        }
        int var13 = arg10;
        if (class54.field799 <= arg10) {
            return;
        }
        if (class54.field800 > arg10) {
            var13 = class54.field800;
        }
        int var14 = arg3 + arg10;
        if (var14 <= class54.field800) {
            return;
        }
        if (var14 > class54.field799) {
            var14 = class54.field799;
        }
        if (arg1 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg1 = 1;
        }
        int var15 = class54.field798 * var13 + var11;
        int var16 = var13 - arg10;
        int var17 = var14 - arg10;
        if (arg1 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg1 = 1;
        }
        if (arg1 == 11) {
            arg1 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        int var18 = class54.field798 + var11 - var12;
        int var19 = var11 - arg8;
        int var20 = arg0 - var19;
        int var21 = var12 - arg8;
        int var22 = arg0 - var21;
        int var23 = arg3 - var17;
        int var24 = arg3 - var16;
        if (arg7) {
            field131 = (class279[]) null;
        }
        if (arg1 == 1) {
            if (arg9 == 0) {
                for (int var31 = var16; var31 < var17; var31++) {
                    for (int var32 = var19; var32 < var21; var32++) {
                        if (var31 >= var32) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var29 = var24 - 1; var29 >= var23; var29--) {
                    for (int var30 = var19; var30 < var21; var30++) {
                        if (var29 >= var30) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var19; var26 < var21; var26++) {
                        if (var25 <= var26) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var19; var28 < var21; var28++) {
                        if (var27 <= var28) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 2) {
            if (arg9 == 0) {
                for (int var87 = var24 - 1; var87 >= var23; var87--) {
                    for (int var88 = var19; var88 < var21; var88++) {
                        if (var88 <= (var87 >> 1)) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var81 = var16; var81 < var17; var81++) {
                    for (int var82 = var19; var82 < var21; var82++) {
                        if (var15 >= 0 && arg2.length > var15) {
                            if (var82 >= var81 << 1) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var85 = var16; var85 < var17; var85++) {
                    for (int var86 = var20 - 1; var86 >= var22; var86--) {
                        if (var85 >> 1 >= var86) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var83 = var24 - 1; var83 >= var23; var83--) {
                    for (int var84 = var20 - 1; var84 >= var22; var84--) {
                        if (var83 << 1 <= var84) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 3) {
            if (arg9 == 0) {
                for (int var79 = var24 - 1; var79 >= var23; var79--) {
                    for (int var80 = var20 - 1; var80 >= var22; var80--) {
                        if ((var79 >> 1) >= var80) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var73 = var24 - 1; var73 >= var23; var73--) {
                    for (int var74 = var19; var74 < var21; var74++) {
                        if (var74 >= var73 << 1) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var75 = var16; var75 < var17; var75++) {
                    for (int var76 = var19; var76 < var21; var76++) {
                        if (var75 >> 1 >= var76) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var77 = var16; var77 < var17; var77++) {
                    for (int var78 = var20 - 1; var78 >= var22; var78--) {
                        if (var78 >= var77 << 1) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 4) {
            if (arg9 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var19; var34 < var21; var34++) {
                        if (var34 >= var33 >> 1) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var19; var36 < var21; var36++) {
                        if ((var35 << 1) >= var36) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var39 = var16; var39 < var17; var39++) {
                    for (int var40 = var20 - 1; var40 >= var22; var40--) {
                        if (var39 >> 1 <= var40) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var37 = var24 - 1; var37 >= var23; var37--) {
                    for (int var38 = var20 - 1; var38 >= var22; var38--) {
                        if (var37 << 1 >= var38) {
                            arg2[var15] = arg5;
                        } else if (arg6) {
                            arg2[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 != 5) {
            if (arg1 == 6) {
                if (arg9 == 0) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        for (int var50 = var19; var50 < var21; var50++) {
                            if (arg0 / 2 >= var50) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var19; var72 < var21; var72++) {
                            if ((arg3 / 2) >= var71) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var19; var70 < var21; var70++) {
                            if ((arg0 / 2) <= var70) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        for (int var52 = var19; var52 < var21; var52++) {
                            if (var51 >= (arg3 / 2)) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 7) {
                if (arg9 == 0) {
                    for (int var53 = var16; var53 < var17; var53++) {
                        for (int var54 = var19; var54 < var21; var54++) {
                            if (var53 - (arg3 / 2) >= var54) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var55 = var24 - 1; var55 >= var23; var55--) {
                        for (int var56 = var19; var56 < var21; var56++) {
                            if (var56 <= (var55 - (arg3 / 2))) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var57 = var24 - 1; var57 >= var23; var57--) {
                        for (int var58 = var20 - 1; var58 >= var22; var58--) {
                            if (var58 <= var57 - (arg3 / 2)) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var59 = var16; var59 < var17; var59++) {
                        for (int var60 = var20 - 1; var60 >= var22; var60--) {
                            if (var59 - arg3 / 2 >= var60) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 8) {
                if (arg9 == 0) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var19; var68 < var21; var68++) {
                            if (var67 - (arg3 / 2) <= var68) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var61 = var24 - 1; var61 >= var23; var61--) {
                        for (int var62 = var19; var62 < var21; var62++) {
                            if (var61 - arg3 / 2 <= var62) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var63 = var24 - 1; var63 >= var23; var63--) {
                        for (int var64 = var20 - 1; var64 >= var22; var64--) {
                            if ((var63 - (arg3 / 2)) <= var64) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var20 - 1; var66 >= var22; var66--) {
                            if ((var65 - (arg3 / 2)) <= var66) {
                                arg2[var15] = arg5;
                            } else if (arg6) {
                                arg2[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var41 = var24 - 1; var41 >= var23; var41--) {
                for (int var42 = var20 - 1; var42 >= var22; var42--) {
                    if ((var41 >> 1) <= var42) {
                        arg2[var15] = arg5;
                    } else if (arg6) {
                        arg2[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 1) {
            for (int var43 = var24 - 1; var43 >= var23; var43--) {
                for (int var44 = var19; var44 < var21; var44++) {
                    if (var44 <= var43 << 1) {
                        arg2[var15] = arg5;
                    } else if (arg6) {
                        arg2[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 2) {
            for (int var47 = var16; var47 < var17; var47++) {
                for (int var48 = var19; var48 < var21; var48++) {
                    if ((var47 >> 1) <= var48) {
                        arg2[var15] = arg5;
                    } else if (arg6) {
                        arg2[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 3) {
            for (int var45 = var16; var45 < var17; var45++) {
                for (int var46 = var20 - 1; var46 >= var22; var46--) {
                    if (var46 <= (var45 << 1)) {
                        arg2[var15] = arg5;
                    } else if (arg6) {
                        arg2[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 1247)
    public static void method38(int arg0) {
        field131 = null;
        field135 = null;
        field132 = null;
        field137 = null;
        field130 = null;
        if (arg0 != 0) {
            field132 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 1284)
    public static final void method39(int arg0) {
        class271.field4356 = true;
        class129.field1910 = 0;
        field129++;
        class74.field1091 = 0L;
        class77.field1141 = 0;
        class23.field354 = 0;
        class65.field971 = 0;
        class41.field667 = 0;
        class130.field1957 = 0;
        class147.field2259 = 0;
        class317.field5356 = 0;
        class41.field663 = 0;
        class301.field4887 = 0;
        class296.field4781 = 0;
        class152.field2416 = 0;
        class286.field4651 = 0;
        class161.field2541 = 0;
        class274.field4488 = 0;
        class62.field912 = 0;
        class46.field720 = 0;
        class151.field2351 = 0;
        class305.field5100 = 0;
        class129.field1917 = 0;
        class223.field3559 = 0;
        class307.field5174 = 0;
        class113.field1662 = 0;
        class75.field1110 = 0;
        class205.field3309 = 0;
        class251.field3989 = 0;
        class27.field394 = 0;
        class202.field3238 = 0;
        class92.field1349 = 0;
        class311.field5253 = 0;
        class143.field2184 = 0;
        class1.field5 = 0;
        class244.field3894 = 0;
        class165.field2612 = 0;
        class222.field3534 = 0;
        class60.field882 = 0;
        class238.field3809 = 0;
        class239.field3827 = 0;
        class152.field2404 = 0;
        class302.field4900 = 0;
        class236.field3795 = 0;
        class112.field1611 = 0;
        class92.field1354 = 0;
        class251.field3998 = 0;
        class41.field631 = 0;
        client.field5146 = 0;
        class112.field1598 = 0;
        class274.field4497 = 0;
        class89.field1302 = 0;
        class305.field5073 = 0;
        class116.field1688 = 0;
        class176.field2863 = 0;
        class180.field2910 = 0;
        class101.field1448 = 0;
        class239.field3828 = 0;
        class161.field2543 = 0;
        class218.field3499 = 0;
        class112.field1649 = 0;
        class228.field3640 = 0;
        class226.field3611 = 0;
        class138.field2103 = 0;
        class274.field4482 = 0;
        class250.field3975 = 0;
        class92.field1358 = 0;
        class13.field171 = 0;
        class274.field4467 = 0;
        class9.field124 = 0;
        class41.field671 = 0;
        class189.field3068 = 0;
        class16.field210 = 0;
        class37.field579 = 0;
        class94.field1375 = 0;
        class44.field690 = 0;
        class147.field2252 = 0;
        class140.field2156 = 0;
        class20.field306 = 0;
        class264.field4186 = 0;
        class138.field2116 = 0;
        class41.field669 = 0;
        class33.field508 = 0;
        class236.field3783 = 0;
        class274.field4487 = 0;
        class41.field654 = 0;
        class65.field961 = 0;
        class36.field543 = 0;
        class298.field4822 = 0;
        class104.field1475 = 0;
        class33.field497 = 0;
        class201.field3213 = 0;
        class41.field674 = 0;
        class305.field5084 = 0;
        class222.field3536 = 0;
        class129.field1923 = 0;
        class112.field1627 = 0;
        class268.field4342 = 0;
        class174.field2827 = 0;
        class139.field2138 = 0;
        class51.field768 = 0;
        class306.field5126 = 0;
        class63.field925 = 0;
        class112.field1606 = 0;
        class312.field5281 = 0;
        class117.field1715 = 0;
        class152.field2373 = 0;
        class37.field569 = 0;
        class312.field5279 = 0;
        class27.field390 = 0;
        class274.field4474 = 0;
        class116.field1683 = 0;
        class53.field788 = 0;
        class69.field1050 = 0;
        class152.field2389 = 0;
        class112.field1628 = 0;
        class88.field1280 = 0;
        class22.field333 = 0;
        class9.field113 = 0;
        class22.field332 = 0;
        class136.field2012 = 0;
        class112.field1639 = 0;
        class8.field105 = 0;
        class60.field860 = 0;
        class273.field4448 = 0;
        class146.field2224 = 0;
        class286.field4648 = 0;
        class118.field1722 = 0;
        class174.field2824 = 0;
        class55.field806 = 0;
        class250.field3986 = 0;
        class112.field1641 = 0;
        class92.field1357 = 0;
        class65.field984 = 0;
        class214.field3446 = 0;
        class41.field642 = 0;
        class274.field4499 = 0;
        class26.field377 = 0;
        class186.field3034 = 0;
        class171.field2780 = 0;
        class140.field2151 = 0;
        class251.field3995 = 0;
        class79.field1161 = 0;
        class65.field965 = 0;
        class252.field4002 = 0;
        class137.field2053 = 0;
        class132.field1969 = 0;
        class149.field2304 = 0;
        class307.field5166 = 0;
        class113.field1666 = 0;
        class141.field2170 = 0;
        class88.field1281 = 0;
        class260.field4143 = 0;
        class28.field422 = 0;
        class22.field336 = 0;
        class275.field4505 = 0;
        class16.field208 = 0;
        class193.field3110 = 0;
        class278.field4554 = 0;
        class307.field5167 = 0;
        class202.field3245 = 0;
        class274.field4475 = 0;
        class268.field4328 = 0;
        class107.field1507 = 0;
        class240.field3846 = 0;
        class169.field2671 = 0;
        class191.field3085 = 0;
        class199.field3193 = 0;
        class310.field5215 = 0;
        class274.field4472 = 0;
        class36.field551 = 0;
        class252.field4012 = 0;
        class62.field916 = 0;
        class129.field1925 = 0;
        class295.field4776 = 0;
        class69.field1048 = 0;
        class130.field1946 = 0;
        class315.field5320 = 0;
        class176.field2850 = 0;
        class150.field2334 = 0;
        class134.field1998 = 0;
        class153.field2438 = 0;
        class15.field195 = 0;
        class41.field621 = 0;
        class1.field11 = 0;
        class296.field4779 = 0;
        class38.field581 = 0;
        class242.field3869 = 0;
        class265.field4205 = 0;
        class193.field3109 = 0;
        class265.field4209 = 0;
        class272.field4425 = 0;
        class147.field2236 = 0;
        class268.field4278 = 0;
        class158.field2487 = 0;
        class262.field4164 = 0;
        class288.field4674 = 0;
        class66.field1007 = 0;
        class256.field4109 = 0;
        class64.field935 = 0;
        class140.field2154 = 0;
        class92.field1334 = 0;
        class120.field1774 = 0;
        class80.field1175 = 0;
        class239.field3830 = 0;
        class234.field3750 = 0;
        class88.field1282 = 0;
        class136.field2024 = 0;
        class305.field5088 = 0;
        class133.field1981 = 0;
        class208.field3370 = 0;
        class69.field1039 = 0;
        class112.field1622 = 0;
        class239.field3831 = 0;
        class146.field2228 = 0;
        class208.field3367 = 0;
        class225.field3600 = 0;
        class288.field4682 = 0;
        class265.field4197 = 0;
        class205.field3308 = 0;
        class23.field351 = 0;
        class305.field5081 = 0;
        class298.field4825 = 0;
        class178.field2884 = 0;
        class300.field4873 = 0;
        class180.field2912 = 0;
        class273.field4444 = 0;
        class134.field1999 = 0;
        class147.field2261 = 0;
        class130.field1953 = 0;
        class95.field1410 = 0;
        class89.field1311 = 0;
        class169.field2675 = 0;
        class205.field3316 = 0;
        class212.field3420 = 0;
        class252.field4011 = 0;
        class110.field1544 = 0;
        class32.field464 = 0;
        class226.field3620 = 0;
        class164.field2589 = 0;
        class165.field2614 = 0;
        class112.field1603 = 0;
        class292.field4722 = 0;
        class69.field1034 = 0;
        class307.field5158 = 0;
        class312.field5264 = 0;
        class88.field1283 = 0;
        class13.field168 = 0;
        class260.field4142 = 0;
        class222.field3550 = 0;
        class24.field366 = 0;
        class159.field2488 = 0;
        class289.field4689 = 0;
        class273.field4443 = 0;
        class44.field701 = 0;
        class274.field4494 = 0;
        class86.field1258 = 0;
        class104.field1471 = 0;
        class274.field4480 = 0;
        class110.field1559 = 0;
        class117.field1702 = 0;
        class286.field4649 = 0;
        class112.field1584 = 0;
        class305.field5083 = 0;
        class147.field2238 = 0;
        class65.field959 = 0;
        class245.field3943 = 0;
        class36.field553 = 0;
        class109.field1534 = 0;
        class256.field4113 = 0;
        class41.field646 = 0;
        class223.field3577 = 0;
        class245.field3937 = 0;
        class171.field2758 = 0;
        class249.field3969 = 0;
        class120.field1778 = 0;
        class218.field3508 = 0;
        class162.field2572 = 0;
        class156.field2458 = 0;
        class52.field783 = 0;
        class97.field1420 = 0;
        class159.field2490 = 0;
        class195.field3153 = 0;
        class158.field2478 = 0;
        class288.field4662 = 0;
        class32.field477 = 0;
        class22.field343 = 0;
        class80.field1180 = 0;
        class129.field1921 = 0;
        class194.field3128 = 0;
        class289.field4686 = 0;
        class300.field4868 = 0;
        class180.field2909 = 0;
        class126.field1875 = 0;
        class5.field56 = 0;
        class120.field1761 = 0;
        class112.field1591 = 0;
        client.field5144 = 0;
        class240.field3841 = 0;
        class112.field1630 = 0;
        class65.field953 = 0;
        class116.field1686 = 0;
        class171.field2768 = 0;
        class32.field483 = 0;
        class20.field310 = 0;
        class112.field1593 = 0;
        class283.field4598 = 0;
        class24.field372 = 0;
        class189.field3066 = 0;
        class41.field619 = 0;
        class65.field963 = 0;
        class222.field3532 = 0;
        class277.field4536 = 0;
        class292.field4726 = 0;
        class92.field1337 = 0;
        class292.field4729 = 0;
        class274.field4476 = 0;
        class204.field3297 = 0;
        class158.field2485 = 0;
        class112.field1618 = 0;
        class274.field4471 = 0;
        class223.field3578 = 0;
        class112.field1616 = 0;
        class223.field3575 = 0;
        class175.field2849 = 0;
        class223.field3573 = 0;
        class41.field637 = 0;
        class305.field5109 = 0;
        class112.field1621 = 0;
        class305.field5074 = 0;
        class300.field4854 = 0;
        class236.field3792 = 0;
        class41.field636 = 0;
        class123.field1830 = 0;
        class296.field4785 = 0;
        class9.field119 = 0;
        class181.field2932 = 0;
        class242.field3873 = 0;
        class189.field3070 = 0;
        class145.field2214 = 0;
        class94.field1376 = 0;
        class244.field3890 = 0;
        class317.field5363 = 0;
        class41.field672 = 0;
        class38.field584 = 0;
        class150.field2340 = 0;
        class45.field708 = 0;
        class226.field3614 = 0;
        class109.field1541 = 0;
        class194.field3134 = 0;
        class46.field717 = 0;
        class188.field3058 = 0;
        class285.field4624 = 0;
        class41.field651 = 0;
        class286.field4650 = 0;
        class41.field622 = 0;
        class201.field3228 = 0;
        class265.field4202 = 0;
        class105.field1490 = 0;
        class126.field1880 = 0;
        class180.field2922 = 0;
        class262.field4158 = 0;
        class311.field5232 = 0;
        class88.field1289 = 0;
        class24.field370 = 0;
        class252.field4004 = 0;
        class136.field2033 = 0;
        class310.field5220 = 0;
        class222.field3541 = 0;
        class274.field4481 = 0;
        class123.field1823 = 0;
        class64.field941 = 0;
        class133.field1988 = 0;
        class44.field702 = 0;
        class112.field1596 = 0;
        class305.field5116 = 0;
        class41.field668 = 0;
        class207.field3349 = 0;
        class181.field2934 = 0;
        class203.field3274 = 0;
        class246.field3949 = 0;
        class129.field1908 = 0;
        class110.field1558 = 0;
        class27.field405 = 0;
        class41.field652 = 0;
        class112.field1623 = 0;
        class302.field5056 = 0;
        class126.field1876 = 0;
        class156.field2459 = 0;
        class112.field1592 = 0;
        class300.field4860 = 0;
        class121.field1791 = 0;
        class94.field1390 = 0;
        class65.field977 = 0;
        class73.field1073 = 0;
        class69.field1047 = 0;
        class41.field635 = 0;
        class252.field4009 = 0;
        class94.field1396 = 0;
        class180.field2906 = 0;
        class174.field2818 = 0;
        class152.field2418 = 0;
        class292.field4733 = 0;
        class251.field3997 = 0;
        class290.field4711 = 0;
        class36.field540 = 0;
        class225.field3601 = 0;
        class193.field3121 = 0;
        class307.field5178 = 0;
        class189.field3063 = 0;
        class262.field4165 = 0;
        class38.field583 = 0;
        class171.field2736 = 0;
        class295.field4775 = 0;
        class171.field2734 = 0;
        class274.field4485 = 0;
        class65.field972 = 0;
        class167.field2662 = 0;
        class266.field4214 = 0;
        class41.field659 = 0;
        class116.field1682 = 0;
        class161.field2554 = 0;
        class297.field4799 = 0;
        class65.field990 = 0;
        class218.field3496 = 0;
        class162.field2586 = 0;
        class92.field1355 = 0;
        class223.field3576 = 0;
        class127.field1894 = 0;
        class272.field4423 = 0;
        class184.field3009 = 0;
        class70.field1058 = 0;
        class109.field1537 = 0;
        class138.field2106 = 0;
        class161.field2550 = 0;
        class129.field1912 = 0;
        class310.field5216 = 0;
        class68.field1021 = 0;
        class194.field3133 = 0;
        class217.field3478 = 0;
        class249.field3963 = 0;
        class151.field2349 = 0;
        class85.field1230 = 0;
        class145.field2209 = 0;
        class48.field738 = 0;
        class312.field5276 = 0;
        class212.field3421 = 0;
        class177.field2874 = 0;
        class119.field1756 = 0;
        class235.field3767 = 0;
        class67.field1013 = 0;
        class41.field665 = 0;
        class117.field1714 = 0;
        class225.field3595 = 0;
        class76.field1129 = 0;
        class94.field1403 = 0;
        class206.field3335 = 0;
        class153.field2449 = 0;
        class223.field3561 = 0;
        class45.field704 = 0;
        class112.field1612 = 0;
        class64.field950 = 0;
        class75.field1104 = 0;
        class86.field1260 = 0;
        class70.field1059 = 0;
        class28.field421 = 0;
        class50.field762 = 0;
        class160.field2520 = 0;
        class118.field1728 = 0;
        class262.field4159 = 0;
        class131.field1966 = 0;
        class41.field629 = 0;
        class65.field982 = 0;
        class174.field2820 = 0;
        class69.field1052 = 0;
        class271.field4386 = 0;
        class245.field3918 = 0;
        class112.field1595 = 0;
        class118.field1736 = 0;
        class46.field727 = 0;
        class201.field3226 = 0;
        class41.field614 = 0;
        class41.field612 = 0;
        class101.field1449 = 0;
        class212.field3412 = 0;
        class268.field4317 = 0;
        class86.field1267 = 0;
        class134.field2005 = 0;
        class281.field4572 = 0;
        class152.field2365 = 0;
        class112.field1629 = 0;
        class214.field3442 = 0;
        class147.field2246 = 0;
        class133.field1986 = 0;
        class252.field4003 = 0;
        class181.field2936 = 0;
        class105.field1495 = 0;
        class26.field380 = 0;
        class192.field3101 = 0;
        class62.field910 = 0;
        class274.field4492 = 0;
        class192.field3102 = 0;
        class88.field1276 = 0;
        class118.field1735 = 0;
        class194.field3140 = 0;
        class252.field4006 = 0;
        class74.field1098 = 0;
        class133.field1995 = 0;
        class152.field2423 = 0;
        class165.field2611 = 0;
        class122.field1802 = 0;
        class180.field2918 = 0;
        class164.field2590 = 0;
        class30.field432 = 0;
        class305.field5101 = 0;
        class131.field1958 = 0;
        class171.field2795 = 0;
        class60.field876 = 0;
        class109.field1529 = 0;
        class294.field4758 = 0;
        class36.field536 = 0;
        class186.field3032 = 0;
        class305.field5089 = 0;
        class27.field391 = 0;
        class23.field355 = 0;
        class152.field2409 = 0;
        class138.field2108 = 0;
        class201.field3217 = 0;
        class110.field1563 = 0;
        class20.field311 = 0;
        class235.field3761 = 0;
        class302.field5057 = 0;
        class169.field2672 = 0;
        class252.field4019 = 0;
        class65.field955 = 0;
        class122.field1808 = 0;
        class282.field4589 = 0;
        class177.field2882 = 0;
        class275.field4510 = 0;
        class299.field4847 = 0;
        class97.field1428 = 0;
        class73.field1076 = 0;
        class146.field2218 = 0;
        class305.field5108 = 0;
        class76.field1128 = 0;
        class41.field630 = 0;
        class271.field4376 = 0;
        class64.field951 = 0;
        class74.field1092 = 0;
        class36.field542 = 0;
        class147.field2258 = 0;
        class236.field3786 = 0;
        class134.field2007 = 0;
        class282.field4584 = 0;
        class107.field1498 = 0;
        class36.field541 = 0;
        class136.field2031 = 0;
        class299.field4845 = 0;
        class123.field1819 = 0;
        class152.field2363 = 0;
        class274.field4490 = 0;
        class304.field5070 = 0;
        class188.field3062 = 0;
        class226.field3623 = 0;
        class213.field3429 = 0;
        class5.field48 = 0;
        class27.field396 = 0;
        class48.field743 = 0;
        class92.field1344 = 0;
        class27.field392 = 0;
        class282.field4590 = 0;
        class14.field183 = 0;
        class59.field851 = 0;
        class286.field4654 = 0;
        class305.field5095 = 0;
        class59.field858 = 0;
        class305.field5075 = 0;
        class123.field1821 = 0;
        class147.field2296 = 0;
        class22.field334 = 0;
        class41.field634 = 0;
        class41.field675 = 0;
        class120.field1769 = 0;
        class130.field1954 = 0;
        class212.field3418 = 0;
        class160.field2505 = 0;
        class207.field3351 = 0;
        class92.field1352 = 0;
        class294.field4753 = 0;
        class232.field3660 = 0;
        class116.field1687 = 0;
        class74.field1097 = 0;
        class20.field319 = 0;
        class188.field3059 = 0;
        class152.field2407 = 0;
        class217.field3484 = 0;
        class236.field3797 = 0;
        class60.field865 = 0;
        class224.field3589 = 0;
        class129.field1911 = 0;
        class118.field1721 = 0;
        class46.field715 = 0;
        class268.field4308 = 0;
        class94.field1379 = 0;
        class311.field5237 = 0;
        class191.field3079 = 0;
        class80.field1185 = 0;
        class120.field1772 = 0;
        class118.field1731 = 0;
        class41.field645 = 0;
        class315.field5313 = 0;
        class112.field1620 = 0;
        class144.field2190 = 0;
        class60.field863 = 0;
        class92.field1328 = 0;
        class184.field3010 = 0;
        class69.field1037 = 0;
        class101.field1440 = 0;
        class86.field1255 = 0;
        class50.field761 = 0;
        class112.field1625 = 0;
        class174.field2821 = 0;
        class91.field1313 = 0;
        class180.field2923 = 0;
        class41.field657 = 0;
        class112.field1644 = 0;
        class300.field4867 = 0;
        class43.field684 = 0;
        class86.field1257 = 0;
        class20.field308 = 0;
        class307.field5157 = 0;
        class65.field978 = 0;
        class45.field703 = 0;
        class32.field470 = 0;
        client.field5136 = 0;
        class116.field1695 = 0;
        class41.field623 = 0;
        class18.field224 = 0;
        class268.field4314 = 0;
        class299.field4844 = 0;
        class22.field341 = 0;
        class185.field3023 = 0;
        class73.field1085 = 0;
        class74.field1094 = 0;
        class218.field3505 = 0;
        class65.field973 = 0;
        class120.field1776 = 0;
        class109.field1536 = 0;
        class69.field1041 = 0;
        class69.field1045 = 0;
        class110.field1551 = 0;
        class41.field643 = 0;
        class119.field1745 = 0;
        class278.field4551 = 0;
        class192.field3100 = 0;
        class196.field3163 = 0;
        class195.field3144 = 0;
        class212.field3419 = 0;
        class32.field481 = 0;
        class238.field3806 = 0;
        class193.field3111 = 0;
        class238.field3812 = 0;
        class302.field4950 = 0;
        class111.field1574 = 0;
        class153.field2446 = 0;
        class129.field1926 = 0;
        class60.field879 = 0;
        class27.field398 = 0;
        class180.field2911 = 0;
        class121.field1784 = 0;
        class152.field2402 = 0;
        class64.field952 = 0;
        class174.field2836 = 0;
        class69.field1046 = 0;
        class285.field4634 = 0;
        class148.field2300 = 0;
        class62.field918 = 0;
        class201.field3208 = 0;
        class191.field3090 = 0;
        class86.field1263 = 0;
        class290.field4709 = 0;
        class281.field4569 = 0;
        class223.field3581 = 0;
        class13.field164 = 0;
        class14.field174 = 0;
        class129.field1930 = 0;
        class138.field2088 = 0;
        class112.field1613 = 0;
        class107.field1501 = 0;
        class86.field1249 = 0;
        class120.field1767 = 0;
        class112.field1643 = 0;
        class65.field976 = 0;
        class278.field4553 = 0;
        class237.field3799 = 0;
        class83.field1208 = 0;
        class132.field1977 = 0;
        class286.field4657 = 0;
        class94.field1402 = 0;
        class22.field338 = 0;
        class300.field4853 = 0;
        class30.field430 = 0;
        class112.field1634 = 0;
        class74.field1095 = 0;
        class148.field2302 = 0;
        class116.field1690 = 0;
        class60.field881 = 0;
        class132.field1972 = 0;
        class194.field3137 = 0;
        class51.field777 = 0;
        class235.field3769 = 0;
        class160.field2527 = 0;
        class255.field4095 = 0;
        class116.field1696 = 0;
        class117.field1709 = 0;
        class274.field4483 = 0;
        class272.field4410 = 0;
        class234.field3736 = 0;
        class152.field2392 = 0;
        class59.field839 = 0;
        class65.field980 = 0;
        field127 = 0;
        class77.field1140 = 0;
        class252.field4017 = 0;
        class240.field3840 = 0;
        class298.field4823 = 0;
        class245.field3922 = 0;
        class5.field47 = 0;
        class196.field3166 = 0;
        class144.field2189 = 0;
        class266.field4223 = 0;
        class41.field673 = 0;
        class250.field3977 = 0;
        class203.field3272 = 0;
        class65.field991 = 0;
        class112.field1654 = 0;
        class59.field854 = 0;
        client.field5147 = 0;
        class223.field3556 = 0;
        class152.field2387 = 0;
        class138.field2096 = 0;
        class138.field2081 = 0;
        class241.field3852 = 0;
        class101.field1443 = 0;
        class41.field633 = 0;
        class15.field198 = 0;
        class300.field4865 = 0;
        class37.field574 = 0;
        class272.field4428 = 0;
        class246.field3950 = 0;
        class158.field2479 = 0;
        class297.field4819 = 0;
        class201.field3214 = 0;
        class92.field1329 = 0;
        class186.field3040 = 0;
        class78.field1152 = 0;
        class169.field2674 = 0;
        class304.field5071 = 0;
        client.field5135 = 0;
        class134.field2002 = 0;
        class33.field510 = 0;
        class52.field779 = 0;
        class297.field4791 = 0;
        class30.field439 = 0;
        class33.field492 = 0;
        class81.field1189 = 0;
        class27.field402 = 0;
        class112.field1632 = 0;
        class196.field3158 = 0;
        class141.field2167 = 0;
        class35.field523 = 0;
        class78.field1149 = 0;
        class317.field5354 = 0;
        class41.field624 = 0;
        class79.field1159 = 0;
        class297.field4805 = 0;
        class133.field1987 = 0;
        class81.field1196 = 0;
        class41.field611 = 0;
        class201.field3224 = 0;
        class41.field664 = 0;
        class194.field3135 = 0;
        class171.field2794 = 0;
        class104.field1480 = 0;
        class145.field2207 = 0;
        class65.field989 = 0;
        class269.field4346 = 0;
        class55.field808 = 0;
        class312.field5268 = 0;
        class187.field3046 = 0;
        class302.field5053 = 0;
        class244.field3897 = 0;
        class212.field3424 = 0;
        class59.field852 = 0;
        class36.field549 = 0;
        class125.field1861 = 0;
        class205.field3311 = 0;
        class136.field2014 = 0;
        class296.field4782 = 0;
        class129.field1914 = 0;
        class20.field307 = 0;
        class116.field1692 = 0;
        class180.field2914 = 0;
        class305.field5094 = 0;
        class266.field4219 = 0;
        class152.field2425 = 0;
        class186.field3035 = 0;
        class181.field2941 = 0;
        class36.field548 = 0;
        class110.field1552 = 0;
        class252.field4014 = 0;
        class41.field627 = 0;
        class118.field1732 = 0;
        class78.field1148 = 0;
        class240.field3844 = 0;
        client.field5137 = 0;
        class36.field546 = 0;
        class3.field43 = 0;
        class147.field2272 = 0;
        class294.field4766 = 0;
        client.field5145 = 0;
        class146.field2229 = 0;
        class221.field3525 = 0;
        class244.field3896 = 0;
        class83.field1212 = 0;
        class274.field4500 = 0;
        class302.field5012 = 0;
        class199.field3192 = 0;
        class268.field4284 = 0;
        class65.field975 = 0;
        class13.field165 = 0;
        class266.field4222 = 0;
        class315.field5317 = 0;
        class112.field1617 = 0;
        class149.field2320 = 0;
        class174.field2837 = 0;
        class128.field1899 = 0;
        class126.field1874 = 0;
        class5.field62 = 0;
        class152.field2398 = 0;
        class30.field438 = 0;
        class276.field4514 = 0;
        class41.field656 = 0;
        class153.field2437 = 0;
        class35.field522 = 0;
        class218.field3504 = 0;
        class89.field1304 = 0;
        class226.field3619 = 0;
        class305.field5079 = 0;
        class112.field1631 = 0;
        class92.field1340 = 0;
        class218.field3491 = 0;
        field129 = 0;
        class152.field2378 = 0;
        class137.field2048 = 0;
        class232.field3663 = 0;
        class171.field2746 = 0;
        class204.field3296 = 0;
        class242.field3868 = 0;
        class22.field335 = 0;
        class290.field4712 = 0;
        class91.field1318 = 0;
        class152.field2368 = 0;
        class46.field729 = 0;
        class225.field3605 = 0;
        class311.field5244 = 0;
        class65.field983 = 0;
        class41.field618 = 0;
        class64.field943 = 0;
        class171.field2740 = 0;
        class226.field3612 = 0;
        class141.field2166 = 0;
        class311.field5239 = 0;
        class276.field4515 = 0;
        class112.field1615 = 0;
        class80.field1174 = 0;
        class86.field1262 = 0;
        class122.field1803 = 0;
        class130.field1945 = 0;
        class13.field161 = 0;
        class289.field4684 = 0;
        class112.field1609 = 0;
        class317.field5355 = 0;
        class129.field1922 = 0;
        class67.field1010 = 0;
        class46.field731 = 0;
        class169.field2688 = 0;
        class237.field3803 = 0;
        class276.field4517 = 0;
        class41.field641 = 0;
        class112.field1601 = 0;
        class53.field791 = 0;
        class214.field3447 = 0;
        class121.field1783 = 0;
        class126.field1870 = 0;
        class176.field2859 = 0;
        class94.field1404 = 0;
        class145.field2201 = 0;
        class64.field934 = 0;
        class298.field4837 = 0;
        class262.field4152 = 0;
        class242.field3867 = 0;
        class48.field751 = 0;
        class204.field3295 = 0;
        class180.field2905 = 0;
        class112.field1642 = 0;
        class278.field4558 = 0;
        class126.field1877 = 0;
        class27.field411 = 0;
        class273.field4460 = 0;
        class41.field650 = 0;
        class315.field5316 = 0;
        class150.field2332 = 0;
        class180.field2916 = 0;
        class273.field4441 = 0;
        class38.field582 = 0;
        class147.field2232 = 0;
        class262.field4161 = 0;
        class305.field5114 = 0;
        class223.field3572 = 0;
        class164.field2593 = 0;
        class271.field4399 = 0;
        class145.field2210 = 0;
        class22.field328 = 0;
        class282.field4591 = 0;
        class236.field3788 = 0;
        class65.field958 = 0;
        class201.field3211 = 0;
        class152.field2388 = 0;
        class158.field2481 = 0;
        class80.field1173 = 0;
        class205.field3330 = 0;
        class120.field1768 = 0;
        class223.field3571 = 0;
        class152.field2386 = 0;
        class207.field3361 = 0;
        class216.field3472 = 0;
        class147.field2241 = 0;
        class152.field2361 = 0;
        class86.field1273 = 0;
        class8.field104 = 0;
        class98.field1431 = 0;
        class181.field2939 = 0;
        class65.field993 = 0;
        class305.field5107 = 0;
        class259.field4131 = 0;
        class271.field4393 = 0;
        class276.field4516 = 0;
        class228.field3632 = 0;
        class230.field3647 = 0;
        class112.field1610 = 0;
        class305.field5087 = 0;
        class222.field3542 = 0;
        class207.field3355 = 0;
        class140.field2153 = 0;
        class112.field1585 = 0;
        class238.field3811 = 0;
        class130.field1951 = 0;
        class312.field5280 = 0;
        class153.field2440 = 0;
        class285.field4631 = 0;
        class88.field1279 = 0;
        class165.field2613 = 0;
        class130.field1952 = 0;
        class212.field3426 = 0;
        class256.field4112 = 0;
        class230.field3644 = 0;
        class300.field4852 = 0;
        class30.field433 = 0;
        class41.field613 = 0;
        class41.field616 = 0;
        class112.field1608 = 0;
        class26.field374 = 0;
        class141.field2174 = 0;
        class213.field3427 = 0;
        class107.field1505 = 0;
        class239.field3825 = 0;
        class272.field4418 = 0;
        class153.field2444 = 0;
        class273.field4461 = 0;
        class238.field3814 = 0;
        class5.field57 = 0;
        class41.field649 = 0;
        class2.field30 = 0;
        class152.field2383 = 0;
        class112.field1652 = 0;
        class105.field1494 = 0;
        class169.field2677 = 0;
        class278.field4555 = 0;
        class290.field4710 = 0;
        class152.field2393 = 0;
        class91.field1314 = 0;
        class305.field5085 = 0;
        class3.field36 = 0;
        class228.field3633 = 0;
        class202.field3231 = 0;
        class281.field4573 = 0;
        class265.field4200 = 0;
        class76.field1135 = 0;
        class44.field699 = 0;
        class33.field490 = 0;
        class152.field2379 = 0;
        class111.field1571 = 0;
        class121.field1792 = 0;
        class285.field4628 = 0;
        class212.field3415 = 0;
        class265.field4195 = 0;
        class38.field592 = 0;
        class153.field2451 = 0;
        class88.field1287 = 0;
        class148.field2303 = 0;
        class125.field1851 = 0;
        class282.field4581 = 0;
        class152.field2362 = 0;
        class94.field1391 = 0;
        class27.field401 = 0;
        class192.field3099 = 0;
        class228.field3635 = 0;
        class259.field4130 = 0;
        class202.field3251 = 0;
        class138.field2112 = 0;
        class223.field3564 = 0;
        class41.field632 = 0;
        class86.field1261 = 0;
        class298.field4827 = 0;
        class52.field780 = 0;
        class210.field3376 = 0;
        class122.field1804 = 0;
        class214.field3448 = 0;
        class305.field5092 = 0;
        class316.field5327 = 0;
        field128 = 0;
        class112.field1587 = 0;
        class18.field225 = 0;
        class65.field964 = 0;
        class191.field3080 = 0;
        class120.field1777 = 0;
        class142.field2180 = 0;
        class134.field2008 = 0;
        class59.field840 = 0;
        class274.field4473 = 0;
        class161.field2544 = 0;
        class123.field1831 = 0;
        class274.field4479 = 0;
        class203.field3267 = 0;
        class22.field326 = 0;
        class111.field1573 = 0;
        class264.field4183 = 0;
        class105.field1492 = 0;
        class174.field2838 = 0;
        class1.field8 = 0;
        class57.field822 = 0;
        class271.field4400 = 0;
        class138.field2124 = 0;
        class314.field5295 = 0;
        class23.field361 = 0;
        class152.field2366 = 0;
        class112.field1626 = 0;
        class153.field2450 = 0;
        class81.field1192 = 0;
        class33.field507 = 0;
        class70.field1053 = 0;
        class302.field5002 = 0;
        class88.field1278 = 0;
        class299.field4849 = 0;
        class164.field2587 = 0;
        class60.field883 = 0;
        class92.field1341 = 0;
        class5.field54 = 0;
        class80.field1181 = 0;
        class181.field2935 = 0;
        class136.field2011 = 0;
        class122.field1800 = 0;
        class69.field1036 = 0;
        class306.field5123 = 0;
        class204.field3292 = 0;
        class218.field3489 = 0;
        class207.field3357 = 0;
        class75.field1108 = 0;
        class186.field3033 = 0;
        class288.field4672 = 0;
        class75.field1102 = 0;
        class118.field1720 = 0;
        class284.field4617 = 0;
        class206.field3338 = 0;
        class262.field4162 = 0;
        class112.field1590 = 0;
        class245.field3920 = 0;
        class296.field4784 = 0;
        class20.field304 = 0;
        class150.field2330 = 0;
        class290.field4715 = 0;
        class41.field658 = 0;
        class101.field1450 = 0;
        class169.field2680 = 0;
        class311.field5259 = 0;
        class60.field872 = 0;
        class152.field2364 = 0;
        class311.field5241 = 0;
        class305.field5082 = 0;
        class3.field40 = 0;
        class139.field2140 = 0;
        class194.field3130 = 0;
        class33.field487 = 0;
        class274.field4463 = 0;
        class111.field1572 = 0;
        class144.field2194 = 0;
        class112.field1645 = 0;
        class81.field1187 = 0;
        class177.field2877 = 0;
        class79.field1164 = 0;
        class48.field752 = 0;
        class88.field1286 = 0;
        class68.field1027 = 0;
        class50.field759 = 0;
        class112.field1602 = 0;
        class138.field2093 = 0;
        class144.field2192 = 0;
        class76.field1131 = 0;
        class112.field1586 = 0;
        class316.field5352 = 0;
        class212.field3409 = 0;
        class41.field670 = 0;
        class171.field2791 = 0;
        class205.field3325 = 0;
        class307.field5159 = 0;
        class119.field1746 = 0;
        class41.field639 = 0;
        class296.field4786 = 0;
        class241.field3861 = 0;
        class136.field2030 = 0;
        class13.field172 = 0;
        class112.field1589 = 0;
        class189.field3072 = 0;
        class292.field4724 = 0;
        class239.field3835 = 0;
        class316.field5337 = 0;
        class171.field2763 = 0;
        class126.field1878 = 0;
        class311.field5234 = 0;
        class46.field718 = 0;
        class131.field1965 = 0;
        class113.field1667 = 0;
        class165.field2610 = 0;
        class274.field4477 = 0;
        class121.field1797 = 0;
        class214.field3449 = 0;
        class282.field4585 = 0;
        class302.field5032 = 0;
        class187.field3048 = 0;
        class177.field2871 = 0;
        class176.field2861 = 0;
        class186.field3037 = 0;
        class65.field970 = 0;
        class180.field2915 = 0;
        class175.field2843 = 0;
        class110.field1550 = 0;
        class171.field2766 = 0;
        class160.field2497 = 0;
        class255.field4100 = 0;
        class278.field4552 = 0;
        class52.field786 = 0;
        class160.field2525 = 0;
        class119.field1743 = 0;
        class79.field1156 = 0;
        class151.field2345 = 0;
        class151.field2356 = 0;
        class250.field3979 = 0;
        class149.field2309 = 0;
        class159.field2492 = 0;
        class125.field1852 = 0;
        class118.field1730 = 0;
        class52.field787 = 0;
        class133.field1992 = 0;
        class117.field1712 = 0;
        class185.field3015 = 0;
        class315.field5318 = 0;
        class299.field4840 = 0;
        class24.field368 = 0;
        class234.field3759 = 0;
        class173.field2809 = 0;
        class65.field967 = 0;
        class152.field2381 = 0;
        class112.field1619 = 0;
        class88.field1291 = 0;
        class74.field1099 = 0;
        class301.field4885 = 0;
        class158.field2477 = 0;
        client.field5148 = 0;
        class85.field1229 = 0;
        class94.field1378 = 0;
        class41.field640 = 0;
        class144.field2193 = 0;
        class81.field1194 = 0;
        class228.field3639 = 0;
        class234.field3748 = 0;
        class112.field1648 = 0;
        class234.field3745 = 0;
        class226.field3622 = 0;
        class138.field2102 = 0;
        class187.field3049 = 0;
        class199.field3198 = 0;
        class265.field4204 = 0;
        class210.field3382 = 0;
        class32.field472 = 0;
        class64.field946 = 0;
        class60.field874 = 0;
        class112.field1588 = 0;
        class225.field3602 = 0;
        class193.field3119 = 0;
        class255.field4098 = 0;
        class164.field2591 = 0;
        class213.field3428 = 0;
        class262.field4160 = 0;
        class305.field5096 = 0;
        class116.field1698 = 0;
        class164.field2592 = 0;
        class288.field4663 = 0;
        class65.field992 = 0;
        class305.field5115 = 0;
        class274.field4489 = 0;
        class252.field4005 = 0;
        class53.field792 = 0;
        class23.field350 = 0;
        class307.field5153 = 0;
        class238.field3815 = 0;
        class235.field3762 = 0;
        class273.field4447 = 0;
        class191.field3083 = 0;
        class174.field2825 = 0;
        class312.field5272 = 0;
        class37.field575 = 0;
        class276.field4512 = 0;
        class91.field1317 = 0;
        class36.field560 = 0;
        class149.field2329 = 0;
        class201.field3227 = 0;
        class266.field4218 = 0;
        class298.field4821 = 0;
        class218.field3501 = 0;
        class274.field4491 = 0;
        class92.field1333 = 0;
        class251.field3991 = 0;
        class156.field2462 = 0;
        class260.field4141 = 0;
        class112.field1650 = 0;
        class129.field1920 = 0;
        class228.field3634 = 0;
        class232.field3675 = 0;
        class65.field988 = 0;
        field133 = 0;
        class129.field1907 = 0;
        class311.field5243 = 0;
        class138.field2104 = 0;
        class158.field2483 = 0;
        class104.field1482 = 0;
        class113.field1664 = 0;
        class14.field186 = 0;
        class302.field5025 = 0;
        class284.field4620 = 0;
        class101.field1439 = 0;
        class133.field1994 = 0;
        class27.field413 = 0;
        class122.field1801 = 0;
        class274.field4486 = 0;
        class191.field3093 = 0;
        class8.field110 = 0;
        class62.field917 = 0;
        class228.field3629 = 0;
        class36.field537 = 0;
        class59.field846 = 0;
        class301.field4882 = 0;
        class133.field1982 = 0;
        class13.field166 = 0;
        class123.field1833 = 0;
        class92.field1359 = 0;
        class8.field103 = 0;
        class67.field1011 = 0;
        class217.field3476 = 0;
        class129.field1924 = 0;
        class246.field3948 = 0;
        class62.field915 = 0;
        class314.field5303 = 0;
        class315.field5308 = 0;
        class150.field2333 = 0;
        class282.field4582 = 0;
        class127.field1893 = 0;
        class272.field4431 = 0;
        class28.field420 = 0;
        class244.field3895 = 0;
        class206.field3336 = 0;
        class213.field3434 = 0;
        class57.field814 = 0;
        class109.field1543 = 0;
        class284.field4603 = 0;
        class41.field648 = 0;
        class171.field2735 = 0;
        class160.field2500 = 0;
        class171.field2759 = 0;
        class298.field4835 = 0;
        class160.field2535 = 0;
        class36.field561 = 0;
        class152.field2414 = 0;
        class132.field1968 = 0;
        class16.field207 = 0;
        class27.field412 = 0;
        class22.field324 = 0;
        class83.field1211 = 0;
        client.field5138 = 0;
        class274.field4478 = 0;
        class202.field3234 = 0;
        class185.field3011 = 0;
        class88.field1274 = 0;
        class305.field5104 = 0;
        class307.field5171 = 0;
        class265.field4198 = 0;
        class112.field1600 = 0;
        class226.field3617 = 0;
        class129.field1916 = 0;
        class48.field745 = 0;
        class81.field1198 = 0;
        class57.field818 = 0;
        class193.field3118 = 0;
        class16.field203 = 0;
        class26.field379 = 0;
        class313.field5282 = 0;
        class15.field201 = 0;
        class167.field2660 = 0;
        class266.field4227 = 0;
        class196.field3161 = 0;
        class242.field3870 = 0;
        class223.field3565 = 0;
        class65.field960 = 0;
        class93.field1368 = 0;
        class274.field4465 = 0;
        class1.field1 = 0;
        class112.field1636 = 0;
        class264.field4178 = 0;
        class316.field5349 = 0;
        class226.field3625 = 0;
        class213.field3432 = 0;
        class274.field4469 = 0;
        class245.field3940 = 0;
        class89.field1310 = 0;
        class152.field2426 = 0;
        class299.field4842 = 0;
        class104.field1478 = 0;
        class118.field1719 = 0;
        class245.field3915 = 0;
        class245.field3905 = 0;
        class307.field5173 = 0;
        class65.field956 = 0;
        class202.field3241 = 0;
        class169.field2686 = 0;
        class152.field2374 = 0;
        class194.field3129 = 0;
        class218.field3511 = 0;
        class290.field4702 = 0;
        class45.field712 = 0;
        class240.field3838 = 0;
        class174.field2834 = 0;
        class112.field1604 = 0;
        class242.field3871 = 0;
        class223.field3574 = 0;
        class91.field1319 = 0;
        class245.field3916 = 0;
        class305.field5111 = 0;
        class152.field2360 = 0;
        class294.field4761 = 0;
        class14.field176 = 0;
        class109.field1532 = 0;
        class141.field2171 = 0;
        class290.field4704 = 0;
        class203.field3254 = 0;
        class112.field1614 = 0;
        class311.field5258 = 0;
        class46.field725 = 0;
        class180.field2913 = 0;
        class189.field3064 = 0;
        class152.field2399 = 0;
        class216.field3466 = 0;
        class241.field3862 = 0;
        class274.field4498 = 0;
        class104.field1479 = 0;
        class120.field1766 = 0;
        class277.field4545 = 0;
        client.field5143 = 0;
        class169.field2683 = 0;
        class174.field2839 = 0;
        class205.field3305 = 0;
        class92.field1351 = 0;
        class112.field1605 = 0;
        class41.field644 = 0;
        class311.field5257 = 0;
        class22.field331 = 0;
        class299.field4846 = 0;
        class152.field2370 = 0;
        class223.field3567 = 0;
        class101.field1455 = 0;
        class117.field1701 = 0;
        class159.field2489 = 0;
        class193.field3112 = 0;
        class89.field1308 = 0;
        class272.field4417 = 0;
        class152.field2424 = 0;
        class210.field3380 = 0;
        class294.field4756 = 0;
        class158.field2480 = 0;
        class93.field1371 = 0;
        class245.field3902 = 0;
        class41.field653 = 0;
        class109.field1540 = 0;
        class147.field2264 = 0;
        class268.field4309 = 0;
        class85.field1228 = 0;
        class140.field2147 = 0;
        class283.field4594 = 0;
        class307.field5175 = 0;
        class32.field467 = 0;
        class273.field4439 = 0;
        class314.field5302 = 0;
        class212.field3410 = 0;
        class68.field1025 = 0;
        class91.field1323 = 0;
        class283.field4596 = 0;
        class192.field3098 = 0;
        class193.field3117 = 0;
        class191.field3082 = 0;
        class302.field5017 = 0;
        class107.field1509 = 0;
        class142.field2182 = 0;
        class266.field4221 = 0;
        class171.field2762 = 0;
        class236.field3784 = 0;
        class276.field4518 = 0;
        class110.field1555 = 0;
        class218.field3503 = 0;
        class33.field496 = 0;
        class308.field5189 = 0;
        class214.field3445 = 0;
        class266.field4216 = 0;
        class5.field50 = 0;
        class178.field2887 = 0;
        class262.field4172 = 0;
        class171.field2751 = 0;
        class57.field817 = 0;
        class93.field1372 = 0;
        class278.field4557 = 0;
        class262.field4170 = 0;
        class176.field2860 = 0;
        class223.field3568 = 0;
        class112.field1637 = 0;
        class79.field1166 = 0;
        class62.field906 = 0;
        class223.field3579 = 0;
        class314.field5299 = 0;
        class79.field1165 = 0;
        class199.field3197 = 0;
        class27.field406 = 0;
        class302.field4943 = 0;
        class301.field4881 = 0;
        class118.field1718 = 0;
        class32.field474 = 0;
        class174.field2833 = 0;
        class199.field3190 = 0;
        class205.field3321 = 0;
        class202.field3249 = 0;
        class260.field4150 = 0;
        class213.field3436 = 0;
        class290.field4705 = 0;
        class176.field2853 = 0;
        class64.field933 = 0;
        class59.field847 = 0;
        class272.field4409 = 0;
        class112.field1647 = 0;
        class316.field5344 = 0;
        class144.field2196 = 0;
        class315.field5324 = 0;
        class297.field4815 = 0;
        class112.field1594 = 0;
        if (arg0 < 35) {
            field135 = (class94) null;
        }
        class314.field5293 = 0;
        class65.field979 = 0;
        class310.field5227 = 0;
        class124.field1841 = 0;
        class138.field2063 = 0;
        class274.field4464 = 0;
        class213.field3440 = 0;
        class278.field4560 = 0;
        class161.field2549 = 0;
        class169.field2681 = 0;
        class272.field4407 = 0;
        class273.field4457 = 0;
        class65.field968 = 0;
        class223.field3555 = 0;
        class262.field4169 = 0;
        class249.field3972 = 0;
        class116.field1681 = 0;
        class76.field1137 = 0;
        class41.field625 = 0;
        class262.field4153 = 0;
        class173.field2816 = 0;
        class109.field1524 = 0;
        class198.field3180 = 0;
        class307.field5152 = 0;
        class312.field5271 = 0;
        class64.field936 = 0;
        class44.field688 = 0;
        class264.field4187 = 0;
        class75.field1103 = 0;
        class230.field3648 = 0;
        class221.field3524 = 0;
        class28.field417 = 0;
        class160.field2518 = 0;
        class217.field3481 = 0;
        class239.field3822 = 0;
        class273.field4452 = 0;
        class274.field4468 = 0;
        class65.field985 = 0;
        class268.field4290 = 0;
        class307.field5168 = 0;
        class152.field2385 = 0;
        class2.field27 = 0;
        class104.field1486 = 0;
        class286.field4653 = 0;
        class145.field2208 = 0;
        class299.field4848 = 0;
        class68.field1026 = 0;
        class292.field4731 = 0;
        class94.field1400 = 0;
        class79.field1169 = 0;
        class27.field414 = 0;
        class305.field5113 = 0;
        class95.field1415 = 0;
        class121.field1789 = 0;
        class274.field4501 = 0;
        class94.field1383 = 0;
        class193.field3115 = 0;
        class133.field1991 = 0;
        class32.field484 = 0;
        class175.field2841 = 0;
        class74.field1101 = 0;
        class147.field2267 = 0;
        class207.field3345 = 0;
        class97.field1424 = 0;
        class120.field1760 = 0;
        class149.field2310 = 0;
        class37.field580 = 0;
        class225.field3603 = 0;
        class298.field4833 = 0;
        class207.field3358 = 0;
        class187.field3050 = 0;
        class152.field2371 = 0;
        class216.field3475 = 0;
        class152.field2421 = 0;
        class13.field173 = 0;
        class36.field538 = 0;
        class101.field1453 = 0;
        class3.field38 = 0;
        class112.field1583 = 0;
        class266.field4211 = 0;
        class147.field2289 = 0;
        class138.field2115 = 0;
        class65.field957 = 0;
        class35.field526 = 0;
        class127.field1888 = 0;
        class48.field744 = 0;
        class111.field1575 = 0;
        class119.field1748 = 0;
        class230.field3646 = 0;
        class255.field4091 = 0;
        class195.field3157 = 0;
        class274.field4470 = 0;
        class64.field949 = 0;
        class20.field322 = 0;
        class75.field1106 = 0;
        class136.field2036 = 0;
        class109.field1539 = 0;
        class164.field2601 = 0;
        class80.field1178 = 0;
        class302.field4993 = 0;
        class180.field2907 = 0;
        class210.field3381 = 0;
        class52.field782 = 0;
        class138.field2109 = 0;
        class202.field3244 = 0;
        class223.field3557 = 0;
        class239.field3818 = 0;
        class41.field638 = 0;
        class152.field2411 = 0;
        class226.field3624 = 0;
        class256.field4104 = 0;
        class44.field696 = 0;
        class59.field848 = 0;
        class73.field1075 = 0;
        class271.field4394 = 0;
        class271.field4375 = 0;
        client.field5141 = 0;
        class112.field1624 = 0;
        client.field5139 = 0;
        class75.field1105 = 0;
        class14.field175 = 0;
        class307.field5165 = 0;
        class160.field2515 = 0;
        class153.field2445 = 0;
        class207.field3360 = 0;
        class316.field5335 = 0;
        class271.field4385 = 0;
        class306.field5121 = 0;
        class161.field2556 = 0;
        class112.field1633 = 0;
        class14.field184 = 0;
        class73.field1077 = 0;
        class120.field1781 = 0;
        class20.field323 = 0;
        class32.field465 = 0;
        class20.field317 = 0;
        class41.field628 = 0;
        class152.field2391 = 0;
        class177.field2873 = 0;
        class302.field5049 = 0;
        class171.field2786 = 0;
        class136.field2020 = 0;
        class138.field2083 = 0;
        class22.field325 = 0;
        class266.field4228 = 0;
        class78.field1150 = 0;
        class128.field1897 = 0;
        class152.field2382 = 0;
        class205.field3307 = 0;
        class245.field3908 = 0;
        class180.field2917 = 0;
        class136.field2025 = 0;
        class273.field4456 = 0;
        class156.field2461 = 0;
        class266.field4212 = 0;
        client.field5142 = 0;
        class152.field2403 = 0;
        class245.field3930 = 0;
        class181.field2931 = 0;
        class311.field5246 = 0;
        class41.field615 = 0;
        class212.field3405 = 0;
        class14.field180 = 0;
        class32.field468 = 0;
        class199.field3187 = 0;
        class64.field944 = 0;
        class62.field903 = 0;
        class113.field1660 = 0;
        class127.field1891 = 0;
        class235.field3774 = 0;
        class104.field1467 = 0;
        class223.field3560 = 0;
        class138.field2090 = 0;
        class65.field954 = 0;
        class241.field3858 = 0;
        class32.field480 = 0;
        class241.field3850 = 0;
        class15.field190 = 0;
        class148.field2301.field4001 = 0;
        class301.field4880 = true;
        class9.method35(true);
        class285.field4642.field1640 = 0;
        class162.field2573 = -1;
        class48.field742 = 0;
        class57.field816 = 0;
        class116.field1679 = -1;
        class164.field2597.field1640 = 0;
        class295.field4770 = -1;
        class38.field586 = 0;
        class131.field1962 = -1;
        for (int var1 = 0; var1 < class35.field529.length; var1++) {
            class35.field529[var1] = null;
        }
        class251.field3993 = false;
        class98.field1432 = 0;
        class85.method607(61, 0);
        for (int var2 = 0; var2 < 100; var2++) {
            class16.field215[var2] = null;
        }
        class41.field620 = 0;
        class298.field4836 = (int) (Math.random() * 110.0D) - 55;
        class127.field1886 = (int) (Math.random() * 100.0D) - 50;
        class8.field101 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class136.field2038 = (int) (Math.random() * 30.0D) - 20;
        class136.field2032 = (int) (Math.random() * 120.0D) - 60;
        class176.field2851 = (int) (Math.random() * 80.0D) - 40;
        class85.field1248 = 0;
        class124.field1846 = 0;
        class97.field1419 = 0;
        class5.field49 = 0;
        class107.field1506 = 0;
        class95.field1414 = 0;
        class101.field1445 = 0;
        class128.field1901 = false;
        class289.field4701 = -1;
        for (int var3 = 0; var3 < 2048; var3++) {
            class246.field3955[var3] = null;
            class50.field766[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class216.field3471[var4] = null;
        }
        class62.field913 = class246.field3955[2047] = new class245();
        class199.field3196.method1499(-3868);
        class290.field4703.method1499(-3868);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class81.field1199[var5][var6][var7] = null;
                }
            }
        }
        class286.field4645 = new class212();
        class289.field4697 = 0;
        class118.field1741 = 0;
        class51.method355((byte) 114);
        class73.method540(3);
        class176.field2865 = 0;
        class292.field4737 = 0;
        class194.field3124 = 0;
        class51.field770 = 0;
        class167.field2654 = 0;
        class299.field4841 = 0;
        class128.field1903 = 0;
        class121.field1782 = 0;
        class272.field4416 = 0;
        class207.field3353 = 0;
        for (int var8 = 0; var8 < class203.field3280.length; var8++) {
            class203.field3280[var8] = -1;
        }
        if (class136.field2015 != -1) {
            class244.method1745((byte) 15, class136.field2015);
        }
        for (class187 var9 = (class187) class113.field1658.method609(-67); var9 != null; var9 = (class187) class113.field1658.method616(117)) {
            class206.method1457(var9, (byte) -63, true);
        }
        class136.field2015 = -1;
        class113.field1658 = new class86(8);
        class112.method777((byte) 50);
        class251.field3993 = false;
        class98.field1432 = 0;
        class109.field1526 = null;
        class203.field3259.method506(false, true, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            class240.field3843[var10] = null;
            class265.field4206[var10] = false;
        }
        class241.method1731(62838176);
        class259.field4127 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class195.field3151[var11] = true;
        }
        class152.field2422 = null;
        class271.field4379 = null;
        class88.field1299 = 0;
        for (int var12 = 0; var12 < 6; var12++) {
            class28.field423[var12] = new class282();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class206.field3340[var13] = 0;
            class64.field938[var13] = 0;
            class85.field1246[var13] = 0;
        }
        if (class166.field2625) {
            class13.method58(-4);
        }
        class26.field384 = class224.field3584;
        class313.field5287 = 0;
        class24.field365 = class290.field4713 = class189.field3069 = class284.field4614 = new short[256];
        class23.field362 = true;
        class268.field4318 = false;
        class278.method1966(94);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZILmh;)Z", line = 3201)
    public static final boolean method40(int arg0, boolean arg1, int arg2, class65 arg3) {
        if (!arg1) {
            field130 = (class41) null;
        }
        field128++;
        byte[] var4 = arg3.method454(arg2, 0, arg0);
        if (var4 == null) {
            return false;
        } else {
            class271.method1920(var4, 4483);
            return true;
        }
    }
}
