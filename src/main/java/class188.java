import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class188 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lsc;")
    private static class181 field3315 = class149.method967(255, "Discard");

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lsc;")
    private static class181 field3320 = class149.method967(255, "Checking for updates )2 ");

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lsc;")
    public static class181 field3326 = field3320;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lsc;")
    public static class181 field3318 = field3315;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Ljd;")
    public static class265 field3324 = new class265(100);

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3328 = 0;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "F")
    public static float field3327;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lo;")
    public static class175 field3319;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lje;")
    public static final class227 method1301(int arg0, byte arg1) {
        field3322++;
        if (arg1 != 79) {
            field3327 = 0.7775588F;
        }
        class227 var2 = (class227) class169.field2845.method990((byte) 80, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class180.field3142.method89(arg0, 1, arg1 ^ 0x2B);
        } else {
            var3 = class123.field2016.method89(arg0 & 0x7FFF, 1, arg1 ^ 0x3D);
        }
        class227 var4 = new class227();
        if (var3 != null) {
            var4.method1484(arg1 ^ 0xFFFFFFB3, new class230(var3));
        }
        if (arg0 >= 32768) {
            var4.method1487(arg1 ^ 0x4F);
        }
        class169.field2845.method982(var4, (byte) 60, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method1302(byte arg0) {
        field3316++;
        class87.field1376.method1798(-57);
        if (arg0 <= 46) {
            method1306((int[]) null, -117, -70, -120, 25, 111, true, (byte) 111, -84, -52, -12);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field3315 = null;
        field3318 = null;
        field3319 = null;
        field3320 = null;
        field3324 = null;
        if (arg0 != -18235) {
            method1305(-27, (class249) null, -79, -44, 34, false, 81, (class254) null, -73, 26, -62, -70, 53, 98);
        }
        field3326 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIILaf;IJZ)Z")
    public static final boolean method1304(int arg0, int arg1, int arg2, int arg3, int arg4, class208 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class77.method534(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILnb;IIIZILqa;IIIIII)Lnb;")
    public static final class249 method1305(int arg0, class249 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class254 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3317++;
        long var14 = ((long) arg12 << 48) + (long) ((arg8 << 24) + (arg11 << 16) + arg4) + ((long) arg0 << 32);
        class249 var16 = (class249) class253.field4417.method1794(-1, var14);
        if (var16 == null) {
            byte var17;
            if (arg4 == 1) {
                var17 = 9;
            } else if (arg4 == 2) {
                var17 = 12;
            } else if (arg4 == 3) {
                var17 = 15;
            } else if (arg4 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class50 var19 = new class50((var17 * var18) + 1, var17 * var18 * 2 + -var17, 0);
            int var20 = var19.method358(0, 0, 0);
            int[] var21 = new int[] { 64, 96, 128 };
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var21[var23];
                int var31 = var21[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg6 + (class72.field1150[var33] * var31) >> 16;
                    int var35 = arg10 + (class72.field1145[var33] * var30) >> 16;
                    var22[var23][var32] = var19.method358(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg8 * var25 + arg11 * var26 >> 8);
                short var28 = (short) (((arg0 & 0x380) * var26 + (arg12 & 0x380) * var25 & 0x38000) + ((arg0 & 0x7F) * var26 + (arg12 & 0x7F) * var25 & 0x7F00) + ((arg0 & 0xFC00) * var26 + (arg12 & 0xFC00) * var25 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var19.method368(var20, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var19.method368(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var19.method368(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var19.method351(64, 768, -50, -10, -50);
            class253.field4417.method1795(14177, var14, var16);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg1.method1588();
        int var41 = arg1.method1584();
        int var42 = var36;
        if (arg5) {
            if (arg2 > 1152 && arg2 < 1920) {
                var39 = var36 + 128;
            }
            if (arg2 > 128 && arg2 < 896) {
                var37 -= 128;
            }
            if (arg2 > 1664 || arg2 < 384) {
                var38 -= 128;
            }
            if (arg2 > 640 && arg2 < 1408) {
                var42 = var36 + 128;
            }
        }
        if (var40 < var37) {
            var40 = var37;
        }
        if (var39 < var41) {
            var41 = var39;
        }
        if (arg3 < 4) {
            method1306((int[]) null, -113, -56, -78, 44, 93, true, (byte) 102, -107, 69, -16);
        }
        int var43 = arg1.method1576();
        int var44 = arg1.method1568();
        if (var44 > var42) {
            var44 = var42;
        }
        class32 var45 = null;
        if (var38 > var43) {
            var43 = var38;
        }
        if (arg7 != null) {
            int var46 = arg7.field4431[arg13];
            var45 = class207.method1378(1, var46 >> 16);
            arg13 = var46 & 0xFFFF;
        }
        class249 var47;
        if (var45 == null) {
            var47 = var16.method1581(true, true);
            var47.method1578((var41 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method1596((var40 + var41) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method1581(!var45.method254(10998, arg13), true);
            var47.method1578((var41 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method1596((var40 + var41) / 2, 0, (var43 + var44) / 2);
            var47.method1583(var45, arg13);
        }
        if (arg2 != 0) {
            var47.method1574(arg2);
        }
        class231 var48 = (class231) var47;
        if (arg9 != class232.method1606(class38.field581, (byte) -111, arg10 + var43, arg6 + var40) || arg9 != class232.method1606(class38.field581, (byte) -88, arg10 + var44, arg6 + var41)) {
            for (int var49 = 0; var49 < var48.field4026; var49++) {
                var48.field4001[var49] += class232.method1606(class38.field581, (byte) -75, var48.field3999[var49] + arg10, var48.field4015[var49] + arg6) - arg9;
            }
            var48.field4008 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIIIIZBIII)V")
    public static final void method1306(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte arg7, int arg8, int arg9, int arg10) {
        field3321++;
        if (arg7 != -47) {
            method1302((byte) -7);
        }
        int var11 = arg4;
        if (class17.field312 <= arg4) {
            return;
        }
        if (arg4 < class17.field313) {
            var11 = class17.field313;
        }
        int var12 = arg2 + arg4;
        if (class17.field313 >= var12) {
            return;
        }
        if (var12 > class17.field312) {
            var12 = class17.field312;
        }
        int var13 = arg9;
        if (arg9 >= class17.field311) {
            return;
        }
        if (class17.field314 > arg9) {
            var13 = class17.field314;
        }
        int var14 = arg8 + arg9;
        if (class17.field314 >= var14) {
            return;
        }
        if (arg1 == 9) {
            arg1 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        if (class17.field311 < var14) {
            var14 = class17.field311;
        }
        if (arg1 == 10) {
            arg1 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        int var15 = class17.field308 * var13 + var11;
        if (arg1 == 11) {
            arg1 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        int var16 = var13 - arg9;
        int var17 = var14 - arg9;
        int var18 = var11 + class17.field308 - var12;
        int var19 = var11 - arg4;
        int var20 = var12 - arg4;
        int var21 = arg2 - var20;
        int var22 = arg2 - var19;
        int var23 = arg8 - var17;
        int var24 = arg8 - var16;
        if (arg1 == 1) {
            if (arg3 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var26 <= var25) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var28 <= var27) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var19; var30 < var20; var30++) {
                        if (var29 <= var30) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var19; var32 < var20; var32++) {
                        if (var32 >= var31) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 2) {
            if (arg3 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var19; var34 < var20; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var19; var36 < var20; var36++) {
                        if (var15 >= 0 && var15 < arg0.length) {
                            if ((var35 << 1) <= var36) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var22 - 1; var38 >= var21; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var21; var40--) {
                        if (var40 >= var39 << 1) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 3) {
            if (arg3 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var22 - 1; var42 >= var21; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var19; var44 < var20; var44++) {
                        if (var44 >= var43 << 1) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var19; var46 < var20; var46++) {
                        if (var46 <= var45 >> 1) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var22 - 1; var48 >= var21; var48--) {
                        if (var47 << 1 <= var48) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 4) {
            if (arg3 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var19; var50 < var20; var50++) {
                        if (var50 >= var49 >> 1) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var51 = var16; var51 < var17; var51++) {
                    for (int var52 = var19; var52 < var20; var52++) {
                        if (var51 << 1 >= var52) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var53 = var16; var53 < var17; var53++) {
                    for (int var54 = var22 - 1; var54 >= var21; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var22 - 1; var56 >= var21; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg0[var15] = arg5;
                        } else if (arg6) {
                            arg0[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 != 5) {
            if (arg1 == 6) {
                if (arg3 == 0) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var19; var66 < var20; var66++) {
                            if (var66 <= arg2 / 2) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var19; var68 < var20; var68++) {
                            if ((arg8 / 2) >= var67) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var19; var70 < var20; var70++) {
                            if ((arg2 / 2) <= var70) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var19; var72 < var20; var72++) {
                            if ((arg8 / 2) <= var71) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 7) {
                if (arg3 == 0) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var19; var74 < var20; var74++) {
                            if (var73 - arg8 / 2 >= var74) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var19; var76 < var20; var76++) {
                            if (var75 - arg8 / 2 >= var76) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var22 - 1; var78 >= var21; var78--) {
                            if (var78 <= var77 - (arg8 / 2)) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var79 = var16; var79 < var17; var79++) {
                        for (int var80 = var22 - 1; var80 >= var21; var80--) {
                            if (var79 - (arg8 / 2) >= var80) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 8) {
                if (arg3 == 0) {
                    for (int var81 = var16; var81 < var17; var81++) {
                        for (int var82 = var19; var82 < var20; var82++) {
                            if (var81 - (arg8 / 2) <= var82) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var19; var84 < var20; var84++) {
                            if (var84 >= (var83 - arg8 / 2)) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var22 - 1; var86 >= var21; var86--) {
                            if ((var85 - (arg8 / 2)) <= var86) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var87 = var16; var87 < var17; var87++) {
                        for (int var88 = var22 - 1; var88 >= var21; var88--) {
                            if (var87 - (arg8 / 2) <= var88) {
                                arg0[var15] = arg5;
                            } else if (arg6) {
                                arg0[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var22 - 1; var58 >= var21; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg0[var15] = arg5;
                    } else if (arg6) {
                        arg0[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var19; var60 < var20; var60++) {
                    if (var60 <= var59 << 1) {
                        arg0[var15] = arg5;
                    } else if (arg6) {
                        arg0[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 2) {
            for (int var61 = var16; var61 < var17; var61++) {
                for (int var62 = var19; var62 < var20; var62++) {
                    if ((var61 >> 1) <= var62) {
                        arg0[var15] = arg5;
                    } else if (arg6) {
                        arg0[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 3) {
            for (int var63 = var16; var63 < var17; var63++) {
                for (int var64 = var22 - 1; var64 >= var21; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg0[var15] = arg5;
                    } else if (arg6) {
                        arg0[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }
}
