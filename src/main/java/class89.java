import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class89 {

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
    public boolean field1467 = false;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Z")
    public boolean field1469 = true;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public int field1473 = -1;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public int field1463 = 128;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public int field1480 = 8;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field1481 = 16;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public int field1477 = -1;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "Z")
    public boolean field1482 = true;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public int field1483 = 0;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field1470 = 1190717;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Lna;")
    public static class26 field1461 = class69.method505("compass", (byte) -121);

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lbe;")
    public static class297 field1465 = null;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field1478 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lrk;")
    public static class175 field1474;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "Lve;")
    public static class266 field1476;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lfe;B)V", line = 5)
    public static final void method694(class241 arg0, byte arg1) {
        if (class229.field3626 == arg0.field3927 || arg0.field3908 == -1 || arg0.field3971 != 0 || (arg0.field3895 + 1) > client.method1731(arg0.field3908, (byte) -20).field4076[arg0.field3976]) {
            int var2 = arg0.field3927 - arg0.field3940;
            int var3 = class229.field3626 - arg0.field3940;
            int var4 = arg0.field3921 * 128 + arg0.method1078((byte) 114) * 64;
            int var5 = arg0.field3979 * 128 + (arg0.method1078((byte) 114) * 64);
            int var6 = arg0.field3966 * 128 + arg0.method1078((byte) 114) * 64;
            int var7 = arg0.field3937 * 128 + arg0.method1078((byte) 114) * 64;
            arg0.field3962 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field3972 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        field1479++;
        if (arg1 > -51) {
            return;
        }
        arg0.field3967 = 0;
        if (arg0.field3984 == 0) {
            arg0.field3946 = 1024;
        }
        if (arg0.field3984 == 1) {
            arg0.field3946 = 1536;
        }
        if (arg0.field3984 == 2) {
            arg0.field3946 = 0;
        }
        if (arg0.field3984 == 3) {
            arg0.field3946 = 512;
        }
        arg0.field3922 = arg0.field3946;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)V", line = 50)
    public static final void method695(int arg0, int arg1, int arg2, int arg3) {
        field1464++;
        if (arg2 != 1) {
            method697((class297) null, 43);
        }
        class120 var4 = class293.method2059(arg2 ^ 0x5, 11, arg1);
        var4.method833((byte) 33);
        var4.field1876 = arg3;
        var4.field1877 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([IIIIIIIIIZB)V", line = 87)
    public static final void method696(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        field1475++;
        int var11 = arg2;
        if (class34.field567 <= arg2) {
            return;
        }
        if (arg2 < class34.field564) {
            var11 = class34.field564;
        }
        int var12 = arg2 + arg7;
        if (class34.field564 >= var12) {
            return;
        }
        if (class34.field567 < var12) {
            var12 = class34.field567;
        }
        int var13 = arg8;
        if (class34.field570 <= arg8) {
            return;
        }
        int var14 = arg6 + arg8;
        if (arg8 < class34.field566) {
            var13 = class34.field566;
        }
        if (var14 <= class34.field566 || arg10 != 21) {
            return;
        }
        int var15 = class34.field563 * var13 + var11;
        if (arg5 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg5 = 1;
        }
        int var16 = var11 + class34.field563 - var12;
        int var17 = var13 - arg8;
        int var18 = arg6 - var17;
        if (class34.field570 < var14) {
            var14 = class34.field570;
        }
        if (arg5 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg5 = 1;
        }
        int var19 = var11 - arg2;
        int var20 = arg7 - var19;
        if (arg5 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg5 = 8;
        }
        int var21 = var12 - arg2;
        int var22 = arg7 - var21;
        int var23 = var14 - arg8;
        int var24 = arg6 - var23;
        if (arg5 == 1) {
            if (arg3 == 0) {
                for (int var81 = var17; var81 < var23; var81++) {
                    for (int var82 = var19; var82 < var21; var82++) {
                        if (var82 <= var81) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var87 = var18 - 1; var87 >= var24; var87--) {
                    for (int var88 = var19; var88 < var21; var88++) {
                        if (var87 >= var88) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var85 = var17; var85 < var23; var85++) {
                    for (int var86 = var19; var86 < var21; var86++) {
                        if (var86 >= var85) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var83 = var18 - 1; var83 >= var24; var83--) {
                    for (int var84 = var19; var84 < var21; var84++) {
                        if (var84 >= var83) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg5 == 2) {
            if (arg3 == 0) {
                for (int var31 = var18 - 1; var31 >= var24; var31--) {
                    for (int var32 = var19; var32 < var21; var32++) {
                        if ((var31 >> 1) >= var32) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var25 = var17; var25 < var23; var25++) {
                    for (int var26 = var19; var26 < var21; var26++) {
                        if (var15 >= 0 && var15 < arg0.length) {
                            if ((var25 << 1) <= var26) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var29 = var17; var29 < var23; var29++) {
                    for (int var30 = var20 - 1; var30 >= var22; var30--) {
                        if (var29 >> 1 >= var30) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var27 = var18 - 1; var27 >= var24; var27--) {
                    for (int var28 = var20 - 1; var28 >= var22; var28--) {
                        if (var27 << 1 <= var28) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg5 == 3) {
            if (arg3 == 0) {
                for (int var73 = var18 - 1; var73 >= var24; var73--) {
                    for (int var74 = var20 - 1; var74 >= var22; var74--) {
                        if ((var73 >> 1) >= var74) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var75 = var18 - 1; var75 >= var24; var75--) {
                    for (int var76 = var19; var76 < var21; var76++) {
                        if (var76 >= var75 << 1) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var77 = var17; var77 < var23; var77++) {
                    for (int var78 = var19; var78 < var21; var78++) {
                        if (var78 <= (var77 >> 1)) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var79 = var17; var79 < var23; var79++) {
                    for (int var80 = var20 - 1; var80 >= var22; var80--) {
                        if ((var79 << 1) <= var80) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg5 == 4) {
            if (arg3 == 0) {
                for (int var71 = var18 - 1; var71 >= var24; var71--) {
                    for (int var72 = var19; var72 < var21; var72++) {
                        if ((var71 >> 1) <= var72) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var65 = var17; var65 < var23; var65++) {
                    for (int var66 = var19; var66 < var21; var66++) {
                        if ((var65 << 1) >= var66) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var67 = var17; var67 < var23; var67++) {
                    for (int var68 = var20 - 1; var68 >= var22; var68--) {
                        if (var68 >= (var67 >> 1)) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var69 = var18 - 1; var69 >= var24; var69--) {
                    for (int var70 = var20 - 1; var70 >= var22; var70--) {
                        if (var70 <= var69 << 1) {
                            arg0[var15] = arg1;
                        } else if (arg9) {
                            arg0[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg3 == 0) {
                    for (int var33 = var17; var33 < var23; var33++) {
                        for (int var34 = var19; var34 < var21; var34++) {
                            if (var34 <= arg7 / 2) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var39 = var17; var39 < var23; var39++) {
                        for (int var40 = var19; var40 < var21; var40++) {
                            if (var39 <= arg6 / 2) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var35 = var17; var35 < var23; var35++) {
                        for (int var36 = var19; var36 < var21; var36++) {
                            if (var36 >= arg7 / 2) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var37 = var17; var37 < var23; var37++) {
                        for (int var38 = var19; var38 < var21; var38++) {
                            if (var37 >= (arg6 / 2)) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg3 == 0) {
                    for (int var41 = var17; var41 < var23; var41++) {
                        for (int var42 = var19; var42 < var21; var42++) {
                            if (var42 <= var41 - (arg6 / 2)) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var43 = var18 - 1; var43 >= var24; var43--) {
                        for (int var44 = var19; var44 < var21; var44++) {
                            if ((var43 - (arg6 / 2)) >= var44) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var45 = var18 - 1; var45 >= var24; var45--) {
                        for (int var46 = var20 - 1; var46 >= var22; var46--) {
                            if (var46 <= var45 - (arg6 / 2)) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var47 = var17; var47 < var23; var47++) {
                        for (int var48 = var20 - 1; var48 >= var22; var48--) {
                            if (var47 - (arg6 / 2) >= var48) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg5 == 8) {
                if (arg3 == 0) {
                    for (int var55 = var17; var55 < var23; var55++) {
                        for (int var56 = var19; var56 < var21; var56++) {
                            if (var55 - (arg6 / 2) <= var56) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var49 = var18 - 1; var49 >= var24; var49--) {
                        for (int var50 = var19; var50 < var21; var50++) {
                            if (var49 - (arg6 / 2) <= var50) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var53 = var18 - 1; var53 >= var24; var53--) {
                        for (int var54 = var20 - 1; var54 >= var22; var54--) {
                            if (var54 >= (var53 - arg6 / 2)) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var51 = var17; var51 < var23; var51++) {
                        for (int var52 = var20 - 1; var52 >= var22; var52--) {
                            if (var51 - (arg6 / 2) <= var52) {
                                arg0[var15] = arg1;
                            } else if (arg9) {
                                arg0[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var57 = var18 - 1; var57 >= var24; var57--) {
                for (int var58 = var20 - 1; var58 >= var22; var58--) {
                    if (var57 >> 1 <= var58) {
                        arg0[var15] = arg1;
                    } else if (arg9) {
                        arg0[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 1) {
            for (int var59 = var18 - 1; var59 >= var24; var59--) {
                for (int var60 = var19; var60 < var21; var60++) {
                    if (var60 <= var59 << 1) {
                        arg0[var15] = arg1;
                    } else if (arg9) {
                        arg0[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 2) {
            for (int var63 = var17; var63 < var23; var63++) {
                for (int var64 = var19; var64 < var21; var64++) {
                    if (var64 >= (var63 >> 1)) {
                        arg0[var15] = arg1;
                    } else if (arg9) {
                        arg0[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 3) {
            for (int var61 = var17; var61 < var23; var61++) {
                for (int var62 = var20 - 1; var62 >= var22; var62--) {
                    if (var61 << 1 >= var62) {
                        arg0[var15] = arg1;
                    } else if (arg9) {
                        arg0[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lbe;I)Lbe;", line = 1276)
    public static final class297 method697(class297 arg0, int arg1) {
        field1462++;
        if (arg1 < 57) {
            method697((class297) null, -22);
        }
        if (arg0.field4993 != -1) {
            return class178.method1226((byte) 118, arg0.field4993);
        }
        int var2 = arg0.field5088 >>> 16;
        class295 var3 = new class295(class74.field1132);
        for (class174 var4 = (class174) var3.method2073((byte) 125); var4 != null; var4 = (class174) var3.method2072(0)) {
            if (var4.field2721 == var2) {
                return class178.method1226((byte) 127, (int) var4.field2293);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILwa;I)V", line = 1319)
    public final void method698(int arg0, class82 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method642((byte) -111);
            if (var4 == 0) {
                field1472++;
                if (arg0 != 24559) {
                    method700(-85);
                }
                return;
            }
            this.method703(0, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBIIIII)V", line = 1336)
    public static final void method699(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1466++;
        if (arg1 <= 68) {
            method697((class297) null, 38);
        }
        int var7 = arg3 - arg5;
        class305.method2142(arg3, 4);
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = -var7;
        int var12 = var7;
        int var13 = -1;
        if (arg2 >= class80.field1259 && class117.field1840 >= arg2) {
            int[] var14 = class45.field710[arg2];
            int var15 = class308.method2151(class27.field454, arg6 - arg3, (byte) 0, class225.field3572);
            int var16 = class308.method2151(class27.field454, arg3 + arg6, (byte) 0, class225.field3572);
            int var17 = class308.method2151(class27.field454, arg6 - var7, (byte) 0, class225.field3572);
            int var18 = class308.method2151(class27.field454, arg6 + var7, (byte) 0, class225.field3572);
            class76.method543(var14, var15, 102, var17, arg4);
            class76.method543(var14, var17, -44, var18, arg0);
            class76.method543(var14, var18, -61, var16, arg4);
        }
        int var19 = -1;
        while (var8 < var9) {
            var13 += 2;
            var19 += 2;
            var11 += var19;
            var10 += var13;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                class86.field1421[var12] = var8;
                var11 -= var12 << 1;
            }
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (class80.field1259 <= var21 && class117.field1840 >= var20) {
                    if (var9 >= var7) {
                        int var22 = class308.method2151(class27.field454, arg6 + var8, (byte) 0, class225.field3572);
                        int var23 = class308.method2151(class27.field454, arg6 - var8, (byte) 0, class225.field3572);
                        if (class117.field1840 >= var21) {
                            class76.method543(class45.field710[var21], var23, -53, var22, arg4);
                        }
                        if (var20 >= class80.field1259) {
                            class76.method543(class45.field710[var20], var23, 96, var22, arg4);
                        }
                    } else {
                        int var24 = class86.field1421[var9];
                        int var25 = class308.method2151(class27.field454, arg6 + var8, (byte) 0, class225.field3572);
                        int var26 = class308.method2151(class27.field454, arg6 - var8, (byte) 0, class225.field3572);
                        int var27 = class308.method2151(class27.field454, arg6 + var24, (byte) 0, class225.field3572);
                        int var28 = class308.method2151(class27.field454, arg6 - var24, (byte) 0, class225.field3572);
                        if (class117.field1840 >= var21) {
                            int[] var29 = class45.field710[var21];
                            class76.method543(var29, var26, 116, var28, arg4);
                            class76.method543(var29, var28, 125, var27, arg0);
                            class76.method543(var29, var27, 87, var25, arg4);
                        }
                        if (var20 >= class80.field1259) {
                            int[] var30 = class45.field710[var20];
                            class76.method543(var30, var26, 110, var28, arg4);
                            class76.method543(var30, var28, -114, var27, arg0);
                            class76.method543(var30, var27, -88, var25, arg4);
                        }
                    }
                }
            }
            int var31 = arg2 - var8;
            int var32 = arg2 + var8;
            if (class80.field1259 <= var32 && class117.field1840 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class225.field3572 && class27.field454 >= var34) {
                    int var35 = class308.method2151(class27.field454, var33, (byte) 0, class225.field3572);
                    int var36 = class308.method2151(class27.field454, var34, (byte) 0, class225.field3572);
                    if (var8 < var7) {
                        int var37 = var12 >= var8 ? var12 : class86.field1421[var8];
                        int var38 = class308.method2151(class27.field454, arg6 + var37, (byte) 0, class225.field3572);
                        int var39 = class308.method2151(class27.field454, arg6 - var37, (byte) 0, class225.field3572);
                        if (class117.field1840 >= var32) {
                            int[] var40 = class45.field710[var32];
                            class76.method543(var40, var36, 126, var39, arg4);
                            class76.method543(var40, var39, 103, var38, arg0);
                            class76.method543(var40, var38, -61, var35, arg4);
                        }
                        if (var31 >= class80.field1259) {
                            int[] var41 = class45.field710[var31];
                            class76.method543(var41, var36, 102, var39, arg4);
                            class76.method543(var41, var39, -94, var38, arg0);
                            class76.method543(var41, var38, 99, var35, arg4);
                        }
                    } else {
                        if (class117.field1840 >= var32) {
                            class76.method543(class45.field710[var32], var36, 94, var35, arg4);
                        }
                        if (var31 >= class80.field1259) {
                            class76.method543(class45.field710[var31], var36, 126, var35, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 1521)
    public static void method700(int arg0) {
        field1474 = null;
        if (arg0 == -2) {
            field1461 = null;
            field1476 = null;
            field1465 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIB)V", line = 1539)
    public static final void method701(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1459++;
        class186 var5 = (class186) class55.field876.method1827((long) arg3, 0);
        if (var5 == null) {
            var5 = new class186();
            class55.field876.method1826(1, var5, (long) arg3);
        }
        if (arg4 <= 16) {
            return;
        }
        if (arg1 >= var5.field2887.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field2887.length; var8++) {
                var6[var8] = var5.field2887[var8];
                var7[var8] = var5.field2892[var8];
            }
            for (int var9 = var5.field2887.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2887 = var6;
            var5.field2892 = var7;
        }
        var5.field2887[arg1] = arg0;
        var5.field2892[arg1] = arg2;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 1596)
    public static final void method702(int arg0) {
        boolean var1 = false;
        field1468++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class126.field1955 - 1); var2++) {
                if (class142.field2178[var2] < 1000 && class142.field2178[var2 + 1] > 1000) {
                    class26 var3 = class252.field4138[var2];
                    var1 = false;
                    class252.field4138[var2] = class252.field4138[var2 + 1];
                    class252.field4138[var2 + 1] = var3;
                    class26 var4 = class141.field2154[var2];
                    class141.field2154[var2] = class141.field2154[var2 + 1];
                    class141.field2154[var2 + 1] = var4;
                    int var5 = class193.field3009[var2];
                    class193.field3009[var2] = class193.field3009[var2 + 1];
                    class193.field3009[var2 + 1] = var5;
                    int var6 = class322.field5529[var2];
                    class322.field5529[var2] = class322.field5529[var2 + 1];
                    class322.field5529[var2 + 1] = var6;
                    int var7 = class85.field1404[var2];
                    class85.field1404[var2] = class85.field1404[var2 + 1];
                    class85.field1404[var2 + 1] = var7;
                    short var8 = class142.field2178[var2];
                    class142.field2178[var2] = class142.field2178[var2 + 1];
                    class142.field2178[var2 + 1] = var8;
                    long var9 = class268.field4429[var2];
                    class268.field4429[var2] = class268.field4429[var2 + 1];
                    class268.field4429[var2 + 1] = var9;
                }
            }
        }
        if (arg0 <= 103) {
            field1461 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILwa;I)V", line = 1673)
    private final void method703(int arg0, int arg1, class82 arg2, int arg3) {
        if (arg0 != 0) {
            return;
        }
        field1471++;
        if (arg1 == 1) {
            this.field1483 = class297.method2103(116, arg2.method633((byte) 83));
        } else if (arg1 == 2) {
            this.field1473 = arg2.method642((byte) -128);
        } else if (arg1 == 3) {
            this.field1473 = arg2.method576(1);
            if (this.field1473 == 65535) {
                this.field1473 = -1;
            }
        } else if (arg1 == 5) {
            this.field1482 = false;
        } else if (arg1 == 7) {
            this.field1477 = class297.method2103(116, arg2.method633((byte) 82));
        } else if (arg1 == 8) {
            class98.field1601 = arg3;
        } else if (arg1 == 9) {
            this.field1463 = arg2.method576(arg0 ^ 0x1);
        } else if (arg1 == 10) {
            this.field1469 = false;
        } else if (arg1 == 11) {
            this.field1480 = arg2.method642((byte) -89);
        } else if (arg1 == 12) {
            this.field1467 = true;
        } else if (arg1 == 13) {
            this.field1470 = arg2.method633((byte) 110);
        } else if (arg1 == 14) {
            this.field1481 = arg2.method642((byte) -68);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 1754)
    public static final void method704(int arg0, int arg1) {
        field1458++;
        if (arg0 != 2714) {
            method701(-80, -123, -59, 60, (byte) 40);
        }
        class120 var2 = class293.method2059(4, 11, arg1);
        var2.method823(true);
    }
}
