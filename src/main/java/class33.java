import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class33 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lhj;")
    public static class69 field462 = class181.method1318("Spielwelt erstellt)3", (byte) -114);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lhj;")
    public static class69 field465 = class181.method1318("Speicher wird zugewiesen)3", (byte) -119);

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lhj;")
    private static class69 field463 = class181.method1318("Loading fonts )2 ", (byte) -109);

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lhj;")
    public static class69 field467 = field463;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Z")
    public static boolean field453;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[B")
    public byte[] field450;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[B")
    public byte[] field466;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[Lqb;")
    public static class56[] field472;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[[[B")
    public static byte[][][] field454;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZIIIII)V")
    public static final void method177(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class153.field2848 = 0;
        int var7 = -1;
        if (!arg1) {
            field465 = null;
        }
        while (var7 < (class98.field1856 + class46.field659)) {
            class222 var23;
            if (var7 == -1) {
                var23 = class156.field2904;
            } else if (var7 < class98.field1856) {
                var23 = class35.field491[class38.field525[var7]];
            } else {
                var23 = class131.field2428[class245.field4490[var7 - class98.field1856]];
            }
            if (var23 != null && var23.method210(-30948)) {
                label368: {
                    if (var23 instanceof class38) {
                        class186 var24 = ((class38) var23).field517;
                        if (var24.field3375 != null) {
                            var24 = var24.method1358((byte) -36);
                        }
                        if (var24 == null) {
                            break label368;
                        }
                    }
                    if (var7 >= class98.field1856) {
                        class186 var30 = ((class38) var23).field517;
                        if (var30.field3375 != null) {
                            var30 = var30.method1358((byte) -36);
                        }
                        if (var30.field3380 >= 0 && var30.field3380 < class268.field4769.length) {
                            int var31;
                            if (var30.field3390 == -1) {
                                var31 = var23.method1577(-28998) + 15;
                            } else {
                                var31 = var30.field3390 + 15;
                            }
                            class45.method259(var31, arg6 >> 1, (byte) 123, var23, arg0, arg2, arg4 >> 1);
                            if (class228.field4146 > -1) {
                                class268.field4769[var30.field3380].method341(arg3 + class228.field4146 - 12, class236.field4296 + arg5 + -30);
                            }
                        }
                        int var32 = 0;
                        class232[] var33 = class60.field1094;
                        while (var33.length > var32) {
                            class232 var48 = var33[var32];
                            if (var48 != null && var48.field4241 == 1 && class245.field4490[var7 - class98.field1856] == var48.field4236 && class180.field3272 % 20 < 10) {
                                int var49;
                                if (var30.field3390 == -1) {
                                    var49 = var23.method1577(-28998) + 15;
                                } else {
                                    var49 = var30.field3390 + 15;
                                }
                                class45.method259(var49, arg6 >> 1, (byte) 122, var23, arg0, arg2, arg4 >> 1);
                                if (class228.field4146 > -1) {
                                    class13.field195[var48.field4242].method341(arg3 - (12 - class228.field4146), class236.field4296 + -28 + arg5);
                                }
                            }
                            var32++;
                        }
                    } else {
                        int var25 = 30;
                        class108 var26 = (class108) var23;
                        if (var26.field2052 != -1 || var26.field2070 != -1) {
                            class45.method259(var23.method1577(-28998) + 15, arg6 >> 1, (byte) 120, var23, arg0, arg2, arg4 >> 1);
                            if (class228.field4146 > -1) {
                                if (var26.field2052 != -1) {
                                    field472[var26.field2052].method341(class228.field4146 + arg3 - 12, -var25 + arg5 - -class236.field4296);
                                    var25 += 25;
                                }
                                if (var26.field2070 != -1) {
                                    class268.field4769[var26.field2070].method341(class228.field4146 + arg3 - 12, class236.field4296 + arg5 - var25);
                                    var25 += 25;
                                }
                            }
                        }
                        if (var7 >= 0) {
                            class232[] var27 = class60.field1094;
                            for (int var28 = 0; var28 < var27.length; var28++) {
                                class232 var29 = var27[var28];
                                if (var29 != null && var29.field4241 == 10 && class38.field525[var7] == var29.field4236) {
                                    class45.method259(var23.method1577(-28998) + 15, arg6 >> 1, (byte) 120, var23, arg0, arg2, arg4 >> 1);
                                    if (class228.field4146 > -1) {
                                        class13.field195[var29.field4242].method341(class228.field4146 + arg3 - 12, class236.field4296 + arg5 + -var25);
                                    }
                                }
                            }
                        }
                    }
                    if (var23.field3989 != null && (class98.field1856 <= var7 || class126.field2319 == 0 || class126.field2319 == 3 || class126.field2319 == 1 && class128.method911(-3383, ((class108) var23).field2045))) {
                        class45.method259(var23.method1577(-28998), arg6 >> 1, (byte) 124, var23, arg0, arg2, arg4 >> 1);
                        if (class228.field4146 > -1 && class153.field2848 < class52.field929) {
                            class52.field928[class153.field2848] = class26.field378.method1606(var23.field3989) / 2;
                            class52.field934[class153.field2848] = class26.field378.field4091;
                            class52.field930[class153.field2848] = class228.field4146;
                            class52.field921[class153.field2848] = class236.field4296;
                            class52.field917[class153.field2848] = var23.field4029;
                            class52.field932[class153.field2848] = var23.field4040;
                            class52.field920[class153.field2848] = var23.field4036;
                            class52.field926[class153.field2848] = var23.field3989;
                            class153.field2848++;
                        }
                    }
                    if (class180.field3272 < var23.field4042) {
                        class56 var34 = class206.field3764[0];
                        class56 var35 = class206.field3764[1];
                        int var39;
                        if (var23 instanceof class38) {
                            class38 var36 = (class38) var23;
                            class56[] var37 = (class56[]) class227.field4133.method1714((long) var36.field517.field3407, (byte) -125);
                            if (var37 == null) {
                                var37 = class162.method1210(class98.field1859, var36.field517.field3407, 0, 13);
                                if (var37 != null) {
                                    class227.field4133.method1705((byte) 123, var37, (long) var36.field517.field3407);
                                }
                            }
                            if (var37 != null && var37.length == 2) {
                                var34 = var37[0];
                                var35 = var37[1];
                            }
                            class186 var38 = var36.field517;
                            if (var38.field3390 == -1) {
                                var39 = var23.method1577(-28998);
                            } else {
                                var39 = var38.field3390;
                            }
                        } else {
                            var39 = var23.method1577(-28998);
                        }
                        class45.method259(var34.field999 + var39 + 10, arg6 >> 1, (byte) 124, var23, arg0, arg2, arg4 >> 1);
                        if (class228.field4146 > -1) {
                            int var40 = arg5 + class236.field4296 - 3;
                            int var41 = arg3 - ((var34.field1010 >> 1) - class228.field4146);
                            var34.method341(var41, var40);
                            int var42 = var23.field4032 * var34.field1010 / 255;
                            int var43 = var34.field999;
                            class15.method87(var41, var40, var41 + var42, var40 - -var43);
                            var35.method341(var41, var40);
                            class15.method89(arg3, arg5, arg3 + arg6, arg5 - -arg4);
                        }
                    }
                    for (int var44 = 0; var44 < 4; var44++) {
                        if (var23.field4007[var44] > class180.field3272) {
                            int var47;
                            if (var23 instanceof class38) {
                                class38 var45 = (class38) var23;
                                class186 var46 = var45.field517;
                                if (var46.field3390 == -1) {
                                    var47 = var23.method1577(-28998) / 2;
                                } else {
                                    var47 = var46.field3390 / 2;
                                }
                            } else {
                                var47 = var23.method1577(-28998) / 2;
                            }
                            class45.method259(var47, arg6 >> 1, (byte) 125, var23, arg0, arg2, arg4 >> 1);
                            if (class228.field4146 > -1) {
                                if (var44 == 1) {
                                    class236.field4296 -= 20;
                                }
                                if (var44 == 2) {
                                    class236.field4296 -= 10;
                                    class228.field4146 -= 15;
                                }
                                if (var44 == 3) {
                                    class236.field4296 -= 10;
                                    class228.field4146 += 15;
                                }
                                class12.field182[var23.field3987[var44]].method341(class228.field4146 + arg3 - 12, class236.field4296 + -12 + arg5);
                                class227.field4139.method1598(class98.method727(-229, var23.field4050[var44]), arg3 + class228.field4146 - 1, class236.field4296 + arg5 + 3, 16777215, 0);
                            }
                        }
                    }
                }
            }
            var7++;
        }
        for (int var8 = 0; var8 < class153.field2848; var8++) {
            int var9 = class52.field930[var8];
            int var10 = class52.field921[var8];
            int var11 = class52.field934[var8];
            boolean var12 = true;
            int var13 = class52.field928[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class52.field921[var22] - class52.field934[var22] < var10 + 2 && (class52.field921[var22] + 2) > (var10 - var11) && var9 - var13 < class52.field930[var22] + class52.field928[var22] && (class52.field930[var22] - class52.field928[var22]) < (var9 + var13) && class52.field921[var22] - class52.field934[var22] < var10) {
                        var12 = true;
                        var10 = class52.field921[var22] - class52.field934[var22];
                    }
                }
            }
            class228.field4146 = class52.field930[var8];
            class236.field4296 = class52.field921[var8] = var10;
            class69 var14 = class52.field926[var8];
            if (class203.field3662 == 0) {
                int var15 = 16776960;
                if (class52.field917[var8] < 6) {
                    var15 = class5.field46[class52.field917[var8]];
                }
                if (class52.field917[var8] == 6) {
                    var15 = (class62.field1182 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class52.field917[var8] == 7) {
                    var15 = class62.field1182 % 20 < 10 ? 255 : 65535;
                }
                if (class52.field917[var8] == 8) {
                    var15 = (class62.field1182 % 20) < 10 ? 45056 : 8454016;
                }
                if (class52.field917[var8] == 9) {
                    int var16 = 150 - class52.field920[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16384000 + 16776960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class52.field917[var8] == 10) {
                    int var17 = 150 - class52.field920[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var15 = (var17 * 327680) + 255 - (var17 + -100) * 5 - 32768000;
                    }
                }
                if (class52.field917[var8] == 11) {
                    int var18 = 150 - class52.field920[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 - ((var18 - 100) * 327680);
                    }
                }
                if (class52.field932[var8] == 0) {
                    class26.field378.method1598(var14, arg3 + class228.field4146, arg5 - -class236.field4296, var15, 0);
                }
                if (class52.field932[var8] == 1) {
                    class26.field378.method1595(var14, class228.field4146 + arg3, class236.field4296 + arg5, var15, 0, class62.field1182);
                }
                if (class52.field932[var8] == 2) {
                    class26.field378.method1602(var14, class228.field4146 + arg3, class236.field4296 + arg5, var15, 0, class62.field1182);
                }
                if (class52.field932[var8] == 3) {
                    class26.field378.method1605(var14, arg3 + class228.field4146, class236.field4296 + arg5, var15, 0, class62.field1182, 150 - class52.field920[var8]);
                }
                if (class52.field932[var8] == 4) {
                    int var19 = (150 - class52.field920[var8]) * (class26.field378.method1606(var14) + 100) / 150;
                    class15.method87(class228.field4146 + arg3 - 50, arg5, arg3 + class228.field4146 + 50, arg4 + arg5);
                    class26.field378.method1616(var14, arg3 + class228.field4146 + 50 - var19, class236.field4296 + arg5, var15, 0);
                    class15.method89(arg3, arg5, arg3 + arg6, arg4 + arg5);
                }
                if (class52.field932[var8] == 5) {
                    int var20 = 150 - class52.field920[var8];
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class15.method87(arg3, arg5 + class236.field4296 - class26.field378.field4091 - 1, arg3 + arg6, arg5 + class236.field4296 + 5);
                    class26.field378.method1598(var14, class228.field4146 + arg3, arg5 - -var21 + class236.field4296, var15, 0);
                    class15.method89(arg3, arg5, arg3 + arg6, arg4 + arg5);
                }
            } else {
                class26.field378.method1598(var14, class228.field4146 + arg3, class236.field4296 + arg5, 16776960, 0);
            }
        }
        field457++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method178(int arg0) {
        field468++;
        class35.field483 = class257.field4613;
        class40.method223(false, arg0 ^ arg0);
        class35.method188((byte) -108);
        class45.method257((byte) 101, class35.field483);
        class156.field2904 = new class108();
        class156.field2904.field3985 = 3000;
        class156.field2904.field4005 = 3000;
        class202.method1469(class98.field1859, -28322200);
        class115.method851(47, 10);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method179(int arg0) {
        field454 = null;
        field472 = null;
        field463 = null;
        field465 = null;
        field467 = null;
        field462 = null;
        if (arg0 != 8454016) {
            method178(38);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)I")
    public static final int method180(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1 != 1) {
            method178(-110);
        }
        field458++;
        return (arg2 >> 2 << 10) + ((arg0 >> 5 << 7) + (arg3 >> 1));
    }
}
