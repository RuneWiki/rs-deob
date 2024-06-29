import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class181 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
    public static boolean field3221 = true;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method1198(int arg0) {
        field3220++;
        if (arg0 != -1) {
            field3221 = false;
        }
        for (class23 var1 = (class23) class194.field3386.method315(-31594); var1 != null; var1 = (class23) class194.field3386.method312(1012)) {
            if (var1.field261 > 0) {
                var1.field261--;
            }
            if (var1.field261 != 0) {
                if (var1.field266 > 0) {
                    var1.field266--;
                }
                if (var1.field266 == 0 && var1.field270 >= 1 && var1.field260 >= 1 && var1.field270 <= 102 && var1.field260 <= 102 && (var1.field262 < 0 || class237.method1542((byte) 122, var1.field271, var1.field262))) {
                    class243.method1598(var1.field262, var1.field260, var1.field270, true, var1.field271, var1.field272, var1.field268, var1.field259);
                    var1.field266 = -1;
                    if (var1.field269 == var1.field262 && var1.field269 == -1) {
                        var1.method1234(17216);
                    } else if (var1.field269 == var1.field262 && var1.field272 == var1.field265 && var1.field271 == var1.field264) {
                        var1.method1234(17216);
                    }
                }
            } else if (var1.field269 < 0 || class237.method1542((byte) 122, var1.field264, var1.field269)) {
                class243.method1598(var1.field269, var1.field260, var1.field270, true, var1.field264, var1.field265, var1.field268, var1.field259);
                var1.method1234(17216);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method1199(byte arg0) {
        if (arg0 != 52) {
            method1199((byte) 95);
        }
        int var1 = class112.field1815.method671(8, 7);
        field3223++;
        if (class132.field2322 > var1) {
            for (int var2 = var1; var2 < class132.field2322; var2++) {
                class38.field518[class58.field794++] = class115.field1868[var2];
            }
        }
        if (var1 > class132.field2322) {
            throw new RuntimeException("gppov1");
        }
        class132.field2322 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class115.field1868[var3];
            class121 var5 = class104.field1677[var4];
            int var6 = class112.field1815.method671(1, 7);
            if (var6 == 0) {
                class115.field1868[class132.field2322++] = var4;
                var5.field165 = class133.field2326;
            } else {
                int var7 = class112.field1815.method671(2, 7);
                if (var7 == 0) {
                    class115.field1868[class132.field2322++] = var4;
                    var5.field165 = class133.field2326;
                    class38.field521[class84.field1278++] = var4;
                } else if (var7 == 1) {
                    class115.field1868[class132.field2322++] = var4;
                    var5.field165 = class133.field2326;
                    int var8 = class112.field1815.method671(3, 7);
                    var5.method90(var8, true, false);
                    int var9 = class112.field1815.method671(1, 7);
                    if (var9 == 1) {
                        class38.field521[class84.field1278++] = var4;
                    }
                } else if (var7 == 2) {
                    class115.field1868[class132.field2322++] = var4;
                    var5.field165 = class133.field2326;
                    int var10 = class112.field1815.method671(3, arg0 - 45);
                    var5.method90(var10, true, true);
                    int var11 = class112.field1815.method671(3, 7);
                    var5.method90(var11, true, true);
                    int var12 = class112.field1815.method671(1, arg0 - 45);
                    if (var12 == 1) {
                        class38.field521[class84.field1278++] = var4;
                    }
                } else if (var7 == 3) {
                    class38.field518[class58.field794++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
    public static final void method1200(boolean arg0, int arg1) {
        field3222++;
        if (arg0) {
            class50 var2 = class80.method534(2, arg1, (byte) -125);
            var2.method355((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIII[IIZIII)V")
    public static final void method1201(byte arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        if (arg6 == 9) {
            arg6 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        field3225++;
        if (arg6 == 10) {
            arg6 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg9 < class216.field3733) {
            arg10 -= class216.field3733 - arg9;
            arg9 = class216.field3733;
        }
        if (arg0 >= -81) {
            return;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg9 + arg10 > class216.field3728) {
            arg10 = class216.field3728 - arg9;
        }
        if (arg2 < class216.field3732) {
            arg1 -= class216.field3732 - arg2;
            arg2 = class216.field3732;
        }
        if (class216.field3727 < arg2 + arg1) {
            arg1 = class216.field3727 - arg2;
        }
        int var11 = class216.field3729 - arg10;
        int var12 = class216.field3729 * arg2 + arg9;
        if (arg6 == 1) {
            if (arg8 == 0) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < arg10; var14++) {
                        if (var13 >= var14) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 1) {
                for (int var15 = arg1 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg10; var16++) {
                        if (var15 >= var16) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 2) {
                for (int var17 = 0; var17 < arg1; var17++) {
                    for (int var18 = 0; var18 < arg10; var18++) {
                        if (var18 >= var17) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 3) {
                for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg10; var20++) {
                        if (var20 >= var19) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                for (int var21 = arg1 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg10; var22++) {
                        if (var22 <= var21 >> 1) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 1) {
                for (int var23 = 0; var23 < arg1; var23++) {
                    for (int var24 = 0; var24 < arg10; var24++) {
                        if (var23 << 1 <= var24) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 2) {
                for (int var25 = 0; var25 < arg1; var25++) {
                    for (int var26 = arg10 - 1; var26 >= 0; var26--) {
                        if (var26 <= var25 >> 1) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 3) {
                for (int var27 = arg1 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg10 - 1; var28 >= 0; var28--) {
                        if (var27 << 1 <= var28) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                for (int var29 = arg1 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg10 - 1; var30 >= 0; var30--) {
                        if (var29 >> 1 >= var30) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 1) {
                for (int var31 = arg1 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg10; var32++) {
                        if (var32 >= var31 << 1) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 2) {
                for (int var33 = 0; var33 < arg1; var33++) {
                    for (int var34 = 0; var34 < arg10; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 3) {
                for (int var35 = 0; var35 < arg1; var35++) {
                    for (int var36 = arg10 - 1; var36 >= 0; var36--) {
                        if (var36 >= var35 << 1) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg6 == 4) {
            if (arg8 == 0) {
                for (int var37 = arg1 - 1; var37 >= 0; var37--) {
                    for (int var38 = 0; var38 < arg10; var38++) {
                        if (var37 >> 1 <= var38) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 1) {
                for (int var39 = 0; var39 < arg1; var39++) {
                    for (int var40 = 0; var40 < arg10; var40++) {
                        if (var39 << 1 >= var40) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 2) {
                for (int var41 = 0; var41 < arg1; var41++) {
                    for (int var42 = arg10 - 1; var42 >= 0; var42--) {
                        if (var41 >> 1 <= var42) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg8 == 3) {
                for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                    for (int var44 = arg10 - 1; var44 >= 0; var44--) {
                        if (var43 << 1 >= var44) {
                            arg5[var12] = arg3;
                        } else if (arg7) {
                            arg5[var12] = arg4;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg8 == 0) {
                    for (int var53 = 0; var53 < arg1; var53++) {
                        for (int var54 = 0; var54 < arg10; var54++) {
                            if (arg10 / 2 >= var54) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var55 = 0; var55 < arg1; var55++) {
                        for (int var56 = 0; var56 < arg10; var56++) {
                            if (arg1 / 2 >= var55) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var57 = 0; var57 < arg1; var57++) {
                        for (int var58 = 0; var58 < arg10; var58++) {
                            if (arg10 / 2 <= var58) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var59 = 0; var59 < arg1; var59++) {
                        for (int var60 = 0; var60 < arg10; var60++) {
                            if (var59 >= arg1 / 2) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg8 == 0) {
                    for (int var61 = 0; var61 < arg1; var61++) {
                        for (int var62 = 0; var62 < arg10; var62++) {
                            if (var61 - arg1 / 2 >= var62) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var63 = arg1 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg10; var64++) {
                            if (var64 <= var63 - arg1 / 2) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var65 = arg1 - 1; var65 >= 0; var65--) {
                        for (int var66 = arg10 - 1; var66 >= 0; var66--) {
                            if (var65 - arg1 / 2 >= var66) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var67 = 0; var67 < arg1; var67++) {
                        for (int var68 = arg10 - 1; var68 >= 0; var68--) {
                            if (var68 <= var67 - arg1 / 2) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg8 == 0) {
                    for (int var69 = 0; var69 < arg1; var69++) {
                        for (int var70 = 0; var70 < arg10; var70++) {
                            if (var70 >= var69 - arg1 / 2) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var71 = arg1 - 1; var71 >= 0; var71--) {
                        for (int var72 = 0; var72 < arg10; var72++) {
                            if (var72 >= var71 - arg1 / 2) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var73 = arg1 - 1; var73 >= 0; var73--) {
                        for (int var74 = arg10 - 1; var74 >= 0; var74--) {
                            if (var74 >= var73 - arg1 / 2) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var75 = 0; var75 < arg1; var75++) {
                        for (int var76 = arg10 - 1; var76 >= 0; var76--) {
                            if (var75 - arg1 / 2 <= var76) {
                                arg5[var12] = arg3;
                            } else if (arg7) {
                                arg5[var12] = arg4;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                for (int var46 = arg10 - 1; var46 >= 0; var46--) {
                    if (var46 >= var45 >> 1) {
                        arg5[var12] = arg3;
                    } else if (arg7) {
                        arg5[var12] = arg4;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg8 == 1) {
            for (int var47 = arg1 - 1; var47 >= 0; var47--) {
                for (int var48 = 0; var48 < arg10; var48++) {
                    if (var47 << 1 >= var48) {
                        arg5[var12] = arg3;
                    } else if (arg7) {
                        arg5[var12] = arg4;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg8 == 2) {
            for (int var49 = 0; var49 < arg1; var49++) {
                for (int var50 = 0; var50 < arg10; var50++) {
                    if (var49 >> 1 <= var50) {
                        arg5[var12] = arg3;
                    } else if (arg7) {
                        arg5[var12] = arg4;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg8 == 3) {
            for (int var51 = 0; var51 < arg1; var51++) {
                for (int var52 = arg10 - 1; var52 >= 0; var52--) {
                    if (var52 <= var51 << 1) {
                        arg5[var12] = arg3;
                    } else if (arg7) {
                        arg5[var12] = arg4;
                    }
                    var12++;
                }
                var12 += var11;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static final void method1202(int arg0) {
        field3224++;
        if (arg0 != 25682) {
            field3221 = true;
        }
        while (true) {
            class47 var1 = class169.field2941;
            class19 var2;
            synchronized (class169.field2941) {
                var2 = (class19) class255.field4426.method321((byte) -98);
            }
            if (var2 == null) {
                return;
            }
            var2.field239.method1346(255, var2.field237, var2.field229, false, (int) var2.field3308);
        }
    }
}
