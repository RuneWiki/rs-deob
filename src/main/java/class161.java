import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class161 {

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lmb;")
    public static class132 field2922 = class166.method1092(" ", 125);

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field2923 = 0;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lmb;")
    public static class132 field2924 = class166.method1092(" )2> <col=ffff00>", 126);

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Loc;")
    public static class155 field2926;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III[B)Lmb;")
    public static final class132 method1039(int arg0, int arg1, int arg2, byte[] arg3) {
        class132 var4 = new class132();
        var4.field2479 = arg1;
        var4.field2446 = new byte[arg2];
        field2915++;
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field2446[var4.field2479++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1040(int arg0, byte[] arg1) {
        class112 var2 = new class112(arg1);
        if (arg0 != 0) {
            field2917 = 28;
        }
        field2921++;
        int var3 = var2.method716(-1308);
        int var4 = var2.method759(97);
        if (var4 < 0 || class229.field4134 != 0 && class229.field4134 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method723(var5, 0, var4, 0);
            return var5;
        } else {
            int var6 = var2.method759(59);
            if (var6 < 0 || class229.field4134 != 0 && class229.field4134 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class121.method797(var7, var6, arg1, var4, 9);
            } else {
                class230.field4149.method84(var7, var2, (byte) 87);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method1041(boolean arg0) {
        field2924 = null;
        if (!arg0) {
            field2923 = -83;
        }
        field2922 = null;
        field2926 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIZIIILtf;BIZ)V")
    public static final void method1042(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class210 arg7, byte arg8, int arg9, boolean arg10) {
        field2918++;
        if (arg3 && (class148.field2722[0][arg4][arg5] & 0x2) == 0) {
            if ((class148.field2722[arg2][arg4][arg5] & 0x10) != 0) {
                return;
            }
            if (class77.method481(arg4, arg2, arg5, -87) != class132.field2450) {
                return;
            }
        }
        if (arg8 < 64) {
            return;
        }
        if (arg2 < class57.field968) {
            class57.field968 = arg2;
        }
        class84 var11 = class66.method414(0, arg1);
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var11.field1440;
            var13 = var11.field1434;
        } else {
            var12 = var11.field1434;
            var13 = var11.field1440;
        }
        int var14;
        int var15;
        if (arg5 + var13 > 104) {
            var14 = arg5 + 1;
            var15 = arg5;
        } else {
            var15 = (var13 >> 1) + arg5;
            var14 = (var13 + 1 >> 1) + arg5;
        }
        int var16;
        int var17;
        if (arg4 + var12 <= 104) {
            var16 = arg4 + (var12 + 1 >> 1);
            var17 = (var12 >> 1) + arg4;
        } else {
            var17 = arg4;
            var16 = arg4 + 1;
        }
        int[][] var18 = class190.field3531[arg9];
        int var19 = (arg4 << 7) + (var12 << 6);
        int var20 = (arg5 << 7) + (var13 << 6);
        int var21 = var18[var16][var14] + var18[var17][var14] + var18[var16][var15] + var18[var17][var15] >> 2;
        long var22 = (long) ((arg6 | 0x400) << 20 | arg5 << 7 | arg4 | arg0 << 14);
        if (var11.field1442 == 0) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field1426 == 1) {
            var22 |= 0x400000L;
        }
        long var24 = var22 | (long) arg1 << 32;
        if (arg10 && var11.method524((byte) -65)) {
            class210.method1307(arg5, arg6, arg4, arg2, 1024, var11);
        }
        if (arg0 == 22) {
            if (!arg3 || var11.field1442 != 0 || var11.field1427 == 1 || var11.field1417) {
                class136 var27;
                if (var11.field1443 == -1 && var11.field1413 == null) {
                    class81 var26 = var11.method523(var20, arg6, 22, var19, arg10, var21, var18, false);
                    var27 = var26.field1369;
                } else {
                    var27 = new class167(arg1, 22, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
                }
                class198.method1258(arg2, arg4, arg5, var21, var27, var24, var11.field1457);
                if (var11.field1427 == 1 && arg7 != null) {
                    arg7.method1302(arg4, arg5, (byte) -115);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class136 var67;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var66 = var11.method523(var20, arg6, 10, var19, arg10, var21, var18, false);
                var67 = var66.field1369;
            } else {
                var67 = new class167(arg1, 10, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            if (var67 != null) {
                boolean var68 = class106.method659(arg2, arg4, arg5, var21, var12, var13, var67, arg0 == 11 ? 256 : 0, var24);
                if (var11.field1456 && var68 && arg10) {
                    int var69 = 15;
                    if (var67 instanceof class221) {
                        var69 = ((class221) var67).method1390() / 4;
                        if (var69 > 30) {
                            var69 = 30;
                        }
                    }
                    for (int var70 = 0; var70 <= var12; var70++) {
                        for (int var71 = 0; var71 <= var13; var71++) {
                            if (var69 > class226.field4101[arg2][arg4 + var70][arg5 + var71]) {
                                class226.field4101[arg2][arg4 + var70][arg5 + var71] = (byte) var69;
                            }
                        }
                    }
                }
            }
            if (var11.field1427 != 0 && arg7 != null) {
                arg7.method1295(var12, arg4, var13, arg5, var11.field1447, (byte) -58);
            }
        } else if (arg0 >= 12) {
            class136 var29;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var28 = var11.method523(var20, arg6, arg0, var19, arg10, var21, var18, false);
                var29 = var28.field1369;
            } else {
                var29 = new class167(arg1, arg0, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class106.method659(arg2, arg4, arg5, var21, 1, 1, var29, 0, var24);
            if (arg10 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
                class111.field2107[arg2][arg4][arg5] = class219.method1368(class111.field2107[arg2][arg4][arg5], 2340);
            }
            if (var11.field1427 != 0 && arg7 != null) {
                arg7.method1295(var12, arg4, var13, arg5, var11.field1447, (byte) -58);
            }
        } else if (arg0 == 0) {
            class136 var31;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var30 = var11.method523(var20, arg6, 0, var19, arg10, var21, var18, false);
                var31 = var30.field1369;
            } else {
                var31 = new class167(arg1, 0, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class181.method1165(arg2, arg4, arg5, var21, var31, null, class85.field1481[arg6], 0, var24);
            if (arg10) {
                if (arg6 == 0) {
                    if (var11.field1456) {
                        class226.field4101[arg2][arg4][arg5] = 50;
                        class226.field4101[arg2][arg4][arg5 + 1] = 50;
                    }
                    if (var11.field1421) {
                        class111.field2107[arg2][arg4][arg5] = class219.method1368(class111.field2107[arg2][arg4][arg5], 585);
                    }
                } else if (arg6 == 1) {
                    if (var11.field1456) {
                        class226.field4101[arg2][arg4][arg5 + 1] = 50;
                        class226.field4101[arg2][arg4 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field1421) {
                        class111.field2107[arg2][arg4][arg5 + 1] = class219.method1368(class111.field2107[arg2][arg4][arg5 + 1], 1170);
                    }
                } else if (arg6 == 2) {
                    if (var11.field1456) {
                        class226.field4101[arg2][arg4 + 1][arg5] = 50;
                        class226.field4101[arg2][arg4 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field1421) {
                        class111.field2107[arg2][arg4 + 1][arg5] = class219.method1368(class111.field2107[arg2][arg4 + 1][arg5], 585);
                    }
                } else if (arg6 == 3) {
                    if (var11.field1456) {
                        class226.field4101[arg2][arg4][arg5] = 50;
                        class226.field4101[arg2][arg4 + 1][arg5] = 50;
                    }
                    if (var11.field1421) {
                        class111.field2107[arg2][arg4][arg5] = class219.method1368(class111.field2107[arg2][arg4][arg5], 1170);
                    }
                }
            }
            if (var11.field1427 != 0 && arg7 != null) {
                arg7.method1293(-1, arg0, arg4, arg6, arg5, var11.field1447);
            }
            if (var11.field1454 != 16) {
                class88.method551(arg2, arg4, arg5, var11.field1454);
            }
        } else if (arg0 == 1) {
            class136 var33;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var32 = var11.method523(var20, arg6, 1, var19, arg10, var21, var18, false);
                var33 = var32.field1369;
            } else {
                var33 = new class167(arg1, 1, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class181.method1165(arg2, arg4, arg5, var21, var33, null, class240.field4320[arg6], 0, var24);
            if (var11.field1456 && arg10) {
                if (arg6 == 0) {
                    class226.field4101[arg2][arg4][arg5 + 1] = 50;
                } else if (arg6 == 1) {
                    class226.field4101[arg2][arg4 + 1][arg5 + 1] = 50;
                } else if (arg6 == 2) {
                    class226.field4101[arg2][arg4 + 1][arg5] = 50;
                } else if (arg6 == 3) {
                    class226.field4101[arg2][arg4][arg5] = 50;
                }
            }
            if (var11.field1427 != 0 && arg7 != null) {
                arg7.method1293(-1, arg0, arg4, arg6, arg5, var11.field1447);
            }
        } else if (arg0 == 2) {
            int var34 = arg6 + 1 & 0x3;
            class136 var36;
            class136 var38;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var35 = var11.method523(var20, arg6 + 4, 2, var19, arg10, var21, var18, false);
                var36 = var35.field1369;
                class81 var37 = var11.method523(var20, var34, 2, var19, arg10, var21, var18, false);
                var38 = var37.field1369;
            } else {
                var36 = new class167(arg1, 2, arg6 + 4, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
                var38 = new class167(arg1, 2, var34, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class181.method1165(arg2, arg4, arg5, var21, var36, var38, class85.field1481[arg6], class85.field1481[var34], var24);
            if (var11.field1421 && arg10) {
                if (arg6 == 0) {
                    class111.field2107[arg2][arg4][arg5] = class219.method1368(class111.field2107[arg2][arg4][arg5], 585);
                    class111.field2107[arg2][arg4][arg5 + 1] = class219.method1368(class111.field2107[arg2][arg4][arg5 + 1], 1170);
                } else if (arg6 == 1) {
                    class111.field2107[arg2][arg4][arg5 + 1] = class219.method1368(class111.field2107[arg2][arg4][arg5 + 1], 1170);
                    class111.field2107[arg2][arg4 + 1][arg5] = class219.method1368(class111.field2107[arg2][arg4 + 1][arg5], 585);
                } else if (arg6 == 2) {
                    class111.field2107[arg2][arg4 + 1][arg5] = class219.method1368(class111.field2107[arg2][arg4 + 1][arg5], 585);
                    class111.field2107[arg2][arg4][arg5] = class219.method1368(class111.field2107[arg2][arg4][arg5], 1170);
                } else if (arg6 == 3) {
                    class111.field2107[arg2][arg4][arg5] = class219.method1368(class111.field2107[arg2][arg4][arg5], 1170);
                    class111.field2107[arg2][arg4][arg5] = class219.method1368(class111.field2107[arg2][arg4][arg5], 585);
                }
            }
            if (var11.field1427 != 0 && arg7 != null) {
                arg7.method1293(-1, arg0, arg4, arg6, arg5, var11.field1447);
            }
            if (var11.field1454 != 16) {
                class88.method551(arg2, arg4, arg5, var11.field1454);
            }
        } else if (arg0 == 3) {
            class136 var40;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var39 = var11.method523(var20, arg6, 3, var19, arg10, var21, var18, false);
                var40 = var39.field1369;
            } else {
                var40 = new class167(arg1, 3, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class181.method1165(arg2, arg4, arg5, var21, var40, null, class240.field4320[arg6], 0, var24);
            if (var11.field1456 && arg10) {
                if (arg6 == 0) {
                    class226.field4101[arg2][arg4][arg5 + 1] = 50;
                } else if (arg6 == 1) {
                    class226.field4101[arg2][arg4 + 1][arg5 + 1] = 50;
                } else if (arg6 == 2) {
                    class226.field4101[arg2][arg4 + 1][arg5] = 50;
                } else if (arg6 == 3) {
                    class226.field4101[arg2][arg4][arg5] = 50;
                }
            }
            if (var11.field1427 != 0 && arg7 != null) {
                arg7.method1293(-1, arg0, arg4, arg6, arg5, var11.field1447);
            }
        } else if (arg0 == 9) {
            class136 var42;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var41 = var11.method523(var20, arg6, arg0, var19, arg10, var21, var18, false);
                var42 = var41.field1369;
            } else {
                var42 = new class167(arg1, arg0, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class106.method659(arg2, arg4, arg5, var21, 1, 1, var42, 0, var24);
            if (var11.field1427 != 0 && arg7 != null) {
                arg7.method1295(var12, arg4, var13, arg5, var11.field1447, (byte) -58);
            }
            if (var11.field1454 != 16) {
                class88.method551(arg2, arg4, arg5, var11.field1454);
            }
        } else if (arg0 == 4) {
            class136 var44;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var43 = var11.method523(var20, arg6, 4, var19, arg10, var21, var18, false);
                var44 = var43.field1369;
            } else {
                var44 = new class167(arg1, 4, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class125.method817(arg2, arg4, arg5, var21, var44, null, class85.field1481[arg6], 0, 0, 0, var24);
        } else if (arg0 == 5) {
            int var45 = 16;
            long var46 = class85.method534(arg2, arg4, arg5);
            if (var46 != 0L) {
                var45 = class66.method414(0, (int) (var46 >>> 32) & Integer.MAX_VALUE).field1454;
            }
            class136 var49;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var48 = var11.method523(var20, arg6, 4, var19, arg10, var21, var18, false);
                var49 = var48.field1369;
            } else {
                var49 = new class167(arg1, 4, arg6, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class125.method817(arg2, arg4, arg5, var21, var49, null, class85.field1481[arg6], 0, class14.field202[arg6] * var45, class187.field3463[arg6] * var45, var24);
        } else if (arg0 == 6) {
            int var50 = 8;
            long var51 = class85.method534(arg2, arg4, arg5);
            if (var51 != 0L) {
                var50 = class66.method414(0, (int) (var51 >>> 32) & Integer.MAX_VALUE).field1454 / 2;
            }
            class136 var54;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var53 = var11.method523(var20, arg6 + 4, 4, var19, arg10, var21, var18, false);
                var54 = var53.field1369;
            } else {
                var54 = new class167(arg1, 4, arg6 + 4, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class125.method817(arg2, arg4, arg5, var21, var54, null, 256, arg6, class110.field2082[arg6] * var50, class233.field4193[arg6] * var50, var24);
        } else if (arg0 == 7) {
            int var55 = arg6 + 2 & 0x3;
            class136 var57;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var56 = var11.method523(var20, var55 + 4, 4, var19, arg10, var21, var18, false);
                var57 = var56.field1369;
            } else {
                var57 = new class167(arg1, 4, var55 + 4, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class125.method817(arg2, arg4, arg5, var21, var57, null, 256, var55, 0, 0, var24);
        } else if (arg0 == 8) {
            long var58 = class85.method534(arg2, arg4, arg5);
            int var60 = 8;
            if (var58 != 0L) {
                var60 = class66.method414(0, (int) (var58 >>> 32) & Integer.MAX_VALUE).field1454 / 2;
            }
            int var61 = arg6 + 2 & 0x3;
            class136 var63;
            class136 var65;
            if (var11.field1443 == -1 && var11.field1413 == null) {
                class81 var62 = var11.method523(var20, arg6 + 4, 4, var19, arg10, var21, var18, false);
                var63 = var62.field1369;
                class81 var64 = var11.method523(var20, var61 + 4, 4, var19, arg10, var21, var18, false);
                var65 = var64.field1369;
            } else {
                var63 = new class167(arg1, 4, arg6 + 4, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
                var65 = new class167(arg1, 4, var61 + 4, arg9, arg4, arg5, var11.field1443, var11.field1438, null);
            }
            class125.method817(arg2, arg4, arg5, var21, var63, var65, 256, arg6, class110.field2082[arg6] * var60, class233.field4193[arg6] * var60, var24);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBI)I")
    public static final int method1043(int arg0, byte arg1, int arg2) {
        int var3 = -16 / ((arg1 + 9) / 63);
        field2919++;
        int var4 = class71.method433(false, arg2 - 1, arg0 + -1) + class71.method433(false, arg2 - 1, arg0 - -1) + class71.method433(false, arg2 + 1, arg0 + -1) + class71.method433(false, arg2 - -1, arg0 + 1);
        int var5 = class71.method433(false, arg2, arg0 - 1) + class71.method433(false, arg2, arg0 + 1) + class71.method433(false, arg2 - 1, arg0) + class71.method433(false, arg2 + 1, arg0);
        int var6 = class71.method433(false, arg2, arg0);
        return var5 / 8 + var4 / 16 + var6 / 4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
    public static final int method1044(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            return 16;
        }
        field2916++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lmb;I)Z")
    public static final boolean method1045(class132 arg0, int arg1) {
        field2920++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class138.field2596; var2++) {
            if (arg0.method882(24493, class94.field1651[var2])) {
                return true;
            }
        }
        return false;
    }
}
