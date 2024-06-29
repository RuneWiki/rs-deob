import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class288 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "S")
    public static short field4345 = 205;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lre;")
    public static class263 field4347 = new class263(new byte[5000]);

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4348 = "Loading fonts - ";

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field4352 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lea;")
    public static class235 field4351;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIIIIIIIZ[II)V", line = 6)
    public static final void method1997(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int[] arg9, int arg10) {
        int var11 = arg7;
        field4346++;
        if (arg7 >= class46.field578) {
            return;
        }
        if (arg7 < class46.field582) {
            var11 = class46.field582;
        }
        int var12 = arg4 + arg7;
        if (var12 <= class46.field582) {
            return;
        }
        int var13 = arg2;
        if (var12 > class46.field578) {
            var12 = class46.field578;
        }
        if (arg2 >= class46.field581) {
            return;
        }
        if (class46.field583 > arg2) {
            var13 = class46.field583;
        }
        int var14 = arg2 + arg5;
        if (class46.field583 >= var14) {
            return;
        }
        if (arg1 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg1 = 1;
        }
        if (class46.field581 < var14) {
            var14 = class46.field581;
        }
        if (arg1 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg1 = 1;
        }
        int var15 = var14 - arg2;
        if (arg1 == 11) {
            arg1 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        int var16 = class46.field580 * var13 + var11;
        int var17 = var13 - arg2;
        int var18 = var11 + class46.field580 - var12;
        int var19 = var11 - arg7;
        if (!arg0) {
            return;
        }
        int var20 = arg4 - var19;
        int var21 = var12 - arg7;
        int var22 = arg4 - var21;
        int var23 = arg5 - var15;
        int var24 = arg5 - var17;
        if (arg1 == 1) {
            if (arg6 == 0) {
                for (int var81 = var17; var81 < var15; var81++) {
                    for (int var82 = var19; var82 < var21; var82++) {
                        if (var82 <= var81) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 1) {
                for (int var83 = var24 - 1; var83 >= var23; var83--) {
                    for (int var84 = var19; var84 < var21; var84++) {
                        if (var83 >= var84) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 2) {
                for (int var87 = var17; var87 < var15; var87++) {
                    for (int var88 = var19; var88 < var21; var88++) {
                        if (var88 >= var87) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 3) {
                for (int var85 = var24 - 1; var85 >= var23; var85--) {
                    for (int var86 = var19; var86 < var21; var86++) {
                        if (var85 <= var86) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg1 == 2) {
            if (arg6 == 0) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var19; var32 < var21; var32++) {
                        if (var32 <= var31 >> 1) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 1) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var19; var26 < var21; var26++) {
                        if (var16 >= 0 && var16 < arg9.length) {
                            if (var25 << 1 <= var26) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg6 == 2) {
                for (int var27 = var17; var27 < var15; var27++) {
                    for (int var28 = var20 - 1; var28 >= var22; var28--) {
                        if ((var27 >> 1) >= var28) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 3) {
                for (int var29 = var24 - 1; var29 >= var23; var29--) {
                    for (int var30 = var20 - 1; var30 >= var22; var30--) {
                        if ((var29 << 1) <= var30) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg1 == 3) {
            if (arg6 == 0) {
                for (int var79 = var24 - 1; var79 >= var23; var79--) {
                    for (int var80 = var20 - 1; var80 >= var22; var80--) {
                        if (var80 <= (var79 >> 1)) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 1) {
                for (int var73 = var24 - 1; var73 >= var23; var73--) {
                    for (int var74 = var19; var74 < var21; var74++) {
                        if (var73 << 1 <= var74) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 2) {
                for (int var77 = var17; var77 < var15; var77++) {
                    for (int var78 = var19; var78 < var21; var78++) {
                        if (var77 >> 1 >= var78) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 3) {
                for (int var75 = var17; var75 < var15; var75++) {
                    for (int var76 = var20 - 1; var76 >= var22; var76--) {
                        if (var76 >= (var75 << 1)) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg1 == 4) {
            if (arg6 == 0) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var19; var40 < var21; var40++) {
                        if (var40 >= var39 >> 1) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 1) {
                for (int var33 = var17; var33 < var15; var33++) {
                    for (int var34 = var19; var34 < var21; var34++) {
                        if (var34 <= var33 << 1) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var20 - 1; var38 >= var22; var38--) {
                        if (var37 >> 1 <= var38) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg6 == 3) {
                for (int var35 = var24 - 1; var35 >= var23; var35--) {
                    for (int var36 = var20 - 1; var36 >= var22; var36--) {
                        if ((var35 << 1) >= var36) {
                            arg9[var16] = arg3;
                        } else if (arg8) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg1 != 5) {
            if (arg1 == 6) {
                if (arg6 == 0) {
                    for (int var63 = var17; var63 < var15; var63++) {
                        for (int var64 = var19; var64 < var21; var64++) {
                            if (var64 <= (arg4 / 2)) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var61 = var17; var61 < var15; var61++) {
                        for (int var62 = var19; var62 < var21; var62++) {
                            if (var61 <= (arg5 / 2)) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var59 = var17; var59 < var15; var59++) {
                        for (int var60 = var19; var60 < var21; var60++) {
                            if (var60 >= arg4 / 2) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var41 = var17; var41 < var15; var41++) {
                        for (int var42 = var19; var42 < var21; var42++) {
                            if ((arg5 / 2) <= var41) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 7) {
                if (arg6 == 0) {
                    for (int var57 = var17; var57 < var15; var57++) {
                        for (int var58 = var19; var58 < var21; var58++) {
                            if (var57 - arg5 / 2 >= var58) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var43 = var24 - 1; var43 >= var23; var43--) {
                        for (int var44 = var19; var44 < var21; var44++) {
                            if (var44 <= var43 - (arg5 / 2)) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var45 = var24 - 1; var45 >= var23; var45--) {
                        for (int var46 = var20 - 1; var46 >= var22; var46--) {
                            if ((var45 - (arg5 / 2)) >= var46) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var47 = var17; var47 < var15; var47++) {
                        for (int var48 = var20 - 1; var48 >= var22; var48--) {
                            if (var48 <= (var47 - (arg5 / 2))) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 8) {
                if (arg6 == 0) {
                    for (int var55 = var17; var55 < var15; var55++) {
                        for (int var56 = var19; var56 < var21; var56++) {
                            if (var56 >= var55 - (arg5 / 2)) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var53 = var24 - 1; var53 >= var23; var53--) {
                        for (int var54 = var19; var54 < var21; var54++) {
                            if (var54 >= (var53 - (arg5 / 2))) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var51 = var24 - 1; var51 >= var23; var51--) {
                        for (int var52 = var20 - 1; var52 >= var22; var52--) {
                            if (var52 >= var51 - (arg5 / 2)) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var49 = var17; var49 < var15; var49++) {
                        for (int var50 = var20 - 1; var50 >= var22; var50--) {
                            if (var50 >= (var49 - (arg5 / 2))) {
                                arg9[var16] = arg3;
                            } else if (arg8) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var71 = var24 - 1; var71 >= var23; var71--) {
                for (int var72 = var20 - 1; var72 >= var22; var72--) {
                    if (var71 >> 1 <= var72) {
                        arg9[var16] = arg3;
                    } else if (arg8) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg6 == 1) {
            for (int var65 = var24 - 1; var65 >= var23; var65--) {
                for (int var66 = var19; var66 < var21; var66++) {
                    if ((var65 << 1) >= var66) {
                        arg9[var16] = arg3;
                    } else if (arg8) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg6 == 2) {
            for (int var67 = var17; var67 < var15; var67++) {
                for (int var68 = var19; var68 < var21; var68++) {
                    if (var67 >> 1 <= var68) {
                        arg9[var16] = arg3;
                    } else if (arg8) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg6 == 3) {
            for (int var69 = var17; var69 < var15; var69++) {
                for (int var70 = var20 - 1; var70 >= var22; var70--) {
                    if (var69 << 1 >= var70) {
                        arg9[var16] = arg3;
                    } else if (arg8) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 1192)
    public static void method1998(int arg0) {
        field4347 = null;
        field4351 = null;
        if (arg0 != 0) {
            method1999(55, 75, -52, -55, -98, (class263) null, -99, false, 119);
        }
        field4348 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIILre;IZI)V", line = 1222)
    public static final void method1999(int arg0, int arg1, int arg2, int arg3, int arg4, class263 arg5, int arg6, boolean arg7, int arg8) {
        field4350++;
        if (arg6 >= 0 && arg6 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg7) {
                class179.field2645[arg1][arg6][arg4] = 0;
            }
            while (true) {
                int var9 = arg5.method1787(false);
                if (var9 == 0) {
                    if (arg7) {
                        class294.field4502[0][arg6][arg4] = class55.field690[0][arg6][arg4];
                    } else if (arg1 == 0) {
                        class294.field4502[0][arg6][arg4] = -class154.method1102(arg6 + arg2 + 932731, 45365, arg4 + arg3 + 556238) * 8;
                    } else {
                        class294.field4502[arg1][arg6][arg4] = class294.field4502[arg1 - 1][arg6][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg5.method1787(false);
                    if (arg7) {
                        class294.field4502[0][arg6][arg4] = class55.field690[0][arg6][arg4] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg1 == 0) {
                            class294.field4502[0][arg6][arg4] = -var10 * 8;
                        } else {
                            class294.field4502[arg1][arg6][arg4] = class294.field4502[arg1 - 1][arg6][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class3.field8[arg1][arg6][arg4] = arg5.method1810((byte) 114);
                    class144.field2178[arg1][arg6][arg4] = (byte) ((var9 - 2) / 4);
                    class250.field3730[arg1][arg6][arg4] = (byte) class124.method893(3, var9 + arg8 - 2);
                } else if (var9 > 81) {
                    class326.field4912[arg1][arg6][arg4] = (byte) (var9 - 81);
                } else if (!arg7) {
                    class179.field2645[arg1][arg6][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg5.method1787(false);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method1787(false);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method1787(false);
                }
            }
        }
        if (arg0 != -1) {
            field4348 = (String) null;
        }
    }
}
