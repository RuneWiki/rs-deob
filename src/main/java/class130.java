import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class130 extends class88 {

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "Loe;")
    public class71 field2086;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field2082 = 0;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field2085 = 0;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field2088 = 0;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2089 = "Discard";

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "Lwb;")
    public static class123 field2081;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
    public static final void method885(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2087++;
        if (class272.field4350 == arg3 || arg4 == 0 || class288.field4599 >= 50 || arg0 == -1) {
            return;
        }
        class4.field63[class288.field4599] = arg0;
        class275.field4399[class288.field4599] = arg4;
        class77.field971[class288.field4599] = arg1;
        class220.field3526[class288.field4599] = null;
        class206.field3282[class288.field4599] = 0;
        class68.field858[class288.field4599] = arg2;
        class288.field4599++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -433) {
            field2082 = 46;
        }
        field2080++;
        if (class32.field432 == 0) {
            int var7 = class148.field2326;
            int var8 = class239.field3942;
            int var9 = class59.field758;
            int var10 = (arg3 - arg0) * (var8 - var7) / arg4 + var7;
            int var11 = class51.field665;
            int var12 = (arg6 - arg5) * (var11 - var9) / arg1 + var9;
            if (class247.field4076 && (class78.field984 & 0x40) != 0) {
                class123 var13 = class247.method1714(class236.field3913, class236.field3911, 0);
                if (var13 == null) {
                    class278.method1858(-1);
                } else {
                    class195.method1373(var12, " ->", class78.field983, 0L, (byte) -101, var10, class283.field4511, (short) 57);
                }
            } else {
                if (class297.field4695 == 1) {
                    class195.method1373(var12, "", -1, 0L, (byte) -91, var10, class113.field1627, (short) 22);
                }
                class278.field4426++;
                class195.method1373(var12, "", -1, 0L, (byte) -121, var10, class139.field2229, (short) 33);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class222.field3577; var16++) {
            long var17 = class76.field953[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = (int) var17 & 0x7F;
            int var21 = ((int) var17 & 0x6FFC654E) >> 29;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class39.method210(class244.field4011, var20, var19, var17)) {
                    class228 var23 = class256.method1749(var22, arg2 ^ 0xFFFFFE4F);
                    if (var23.field3641 != null) {
                        var23 = var23.method1629(arg2 ^ 0x1CB);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class32.field432 == 1) {
                        class19.field245++;
                        class195.method1373(var19, class138.field2217 + " -> <col=00ffff>" + var23.field3708, class153.field2379, var17, (byte) -111, var20, class207.field3316, (short) 21);
                    } else if (class247.field4076) {
                        class258 var28 = class73.field918 == -1 ? null : class44.method250(class73.field918, arg2 + 311);
                        if ((class78.field984 & 0x4) != 0 && (var28 == null || var23.method1624(arg2 ^ 0x1CC, var28.field4181, class73.field918) != var28.field4181)) {
                            class195.method1373(var19, class144.field2284 + " -> <col=00ffff>" + var23.field3708, class78.field983, var17, (byte) -76, var20, class283.field4511, (short) 37);
                            class276.field4407++;
                        }
                    } else {
                        class150.field2344++;
                        String[] var24 = var23.field3705;
                        if (class61.field784) {
                            var24 = class89.method484(17594, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class156.field2513++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 26;
                                    }
                                    if (var25 == 1) {
                                        var26 = 36;
                                    }
                                    int var27 = -1;
                                    if (var23.field3679 == var25) {
                                        var27 = var23.field3706;
                                    }
                                    if (var25 == 2) {
                                        var26 = 44;
                                    }
                                    if (var25 == 3) {
                                        var26 = 29;
                                    }
                                    if (var23.field3662 == var25) {
                                        var27 = var23.field3703;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1006;
                                    }
                                    class195.method1373(var19, "<col=00ffff>" + var23.field3708, var27, var17, (byte) -126, var20, var24[var25], var26);
                                }
                            }
                        }
                        class195.method1373(var19, "<col=00ffff>" + var23.field3708, class59.field761, (long) var23.field3697, (byte) -76, var20, class60.field772, (short) 1007);
                    }
                }
                if (var21 == 1) {
                    class200 var29 = class265.field4273[var22];
                    if ((var29.field3166.field3034 & 0x1) == 0 && (var29.field3818 & 0x7F) == 0 && (var29.field3820 & 0x7F) == 0 || (var29.field3166.field3034 & 0x1) == 1 && (var29.field3818 & 0x7F) == 64 && (var29.field3820 & 0x7F) == 64) {
                        int var30 = var29.field3818 + 64 - var29.field3166.field3034 * 64;
                        int var31 = var29.field3820 - (var29.field3166.field3034 * 64 - 64);
                        for (int var32 = 0; var32 < class134.field2122; var32++) {
                            class200 var37 = class265.field4273[class11.field121[var32]];
                            if (var37 != null && !var37.field3788 && var29 != var37 && var37.field3825) {
                                int var38 = var37.field3818 - ((var37.field3166.field3034 - 1) * 64);
                                int var39 = var37.field3820 - ((var37.field3166.field3034 - 1) * 64);
                                if (var30 <= var38 && var37.field3166.field3034 <= var29.field3166.field3034 - (var38 - var30 >> 7) && var31 <= var39 && var29.field3166.field3034 - (var39 - var31 >> 7) >= var37.field3166.field3034) {
                                    class41.method227(var20, class11.field121[var32], var19, var37.field3166, arg2 + 388);
                                    var37.field3788 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class77.field970; var33++) {
                            class259 var34 = class89.field1113[class27.field385[var33]];
                            if (var34 != null && !var34.field3788 && var34.field3825) {
                                int var35 = var34.field3818 + 64 - (var34.method1638(-6377) * 64);
                                int var36 = var34.field3820 + 64 - (var34.method1638(-6377) * 64);
                                if (var35 >= var30 && var34.method1638(arg2 ^ 0x1958) <= (var29.field3166.field3034 - (var35 - var30 >> 7)) && var31 <= var36 && var34.method1638(arg2 ^ 0x1958) <= var29.field3166.field3034 - (var36 - var31 >> 7)) {
                                    class50.method284(var20, var19, 19506, class27.field385[var33], var34);
                                    var34.field3788 = true;
                                }
                            }
                        }
                    }
                    if (var29.field3788) {
                        continue;
                    }
                    class41.method227(var20, var22, var19, var29.field3166, arg2 + 378);
                    var29.field3788 = true;
                }
                if (var21 == 0) {
                    class259 var40 = class89.field1113[var22];
                    if ((var40.field3818 & 0x7F) == 64 && (var40.field3820 & 0x7F) == 64) {
                        int var41 = var40.field3818 - (var40.method1638(-6377) - 1) * 64;
                        int var42 = var40.field3820 - ((var40.method1638(arg2 - 5944) - 1) * 64);
                        for (int var43 = 0; var43 < class134.field2122; var43++) {
                            class200 var48 = class265.field4273[class11.field121[var43]];
                            if (var48 != null && !var48.field3788 && var48.field3825) {
                                int var49 = var48.field3818 + 64 - var48.field3166.field3034 * 64;
                                int var50 = var48.field3820 - (var48.field3166.field3034 - 1) * 64;
                                if (var41 <= var49 && var48.field3166.field3034 <= (var40.method1638(arg2 - 5944) - (var49 - var41 >> 7)) && var50 >= var42 && var48.field3166.field3034 <= (var40.method1638(-6377) - (var50 - var42 >> 7))) {
                                    class41.method227(var20, class11.field121[var43], var19, var48.field3166, arg2 ^ 0x183);
                                    var48.field3788 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class77.field970; var44++) {
                            class259 var45 = class89.field1113[class27.field385[var44]];
                            if (var45 != null && !var45.field3788 && var40 != var45 && var45.field3825) {
                                int var46 = var45.field3818 - (var45.method1638(-6377) * 64 - 64);
                                int var47 = var45.field3820 + 64 - var45.method1638(-6377) * 64;
                                if (var41 <= var46 && var45.method1638(-6377) <= (var40.method1638(arg2 ^ 0x1958) - (var46 - var41 >> 7)) && var42 <= var47 && var45.method1638(-6377) <= (var40.method1638(-6377) - (var47 - var42 >> 7))) {
                                    class50.method284(var20, var19, 19506, class27.field385[var44], var45);
                                    var45.field3788 = true;
                                }
                            }
                        }
                    }
                    if (var40.field3788) {
                        continue;
                    }
                    class50.method284(var20, var19, arg2 + 19939, var22, var40);
                    var40.field3788 = true;
                }
                if (var21 == 3) {
                    class269 var51 = class206.field3296[class244.field4011][var20][var19];
                    if (var51 != null) {
                        for (class226 var52 = (class226) var51.method1806(arg2 ^ 0xFFFFFE4E); var52 != null; var52 = (class226) var51.method1807(arg2 ^ 0x18B)) {
                            int var53 = var52.field3629.field222;
                            class108 var54 = class256.method1753(-2, var53);
                            if (class32.field432 == 1) {
                                class195.method1373(var19, class138.field2217 + " -> <col=ff9040>" + var54.field1504, class153.field2379, (long) var53, (byte) -96, var20, class207.field3316, (short) 25);
                                class95.field1210++;
                            } else if (class247.field4076) {
                                class258 var59 = class73.field918 == -1 ? null : class44.method250(class73.field918, -126);
                                if ((class78.field984 & 0x1) != 0 && (var59 == null || var54.method669(class73.field918, var59.field4181, (byte) -37) != var59.field4181)) {
                                    class216.field3476++;
                                    class195.method1373(var19, class144.field2284 + " -> <col=ff9040>" + var54.field1504, class78.field983, (long) var53, (byte) -103, var20, class283.field4511, (short) 2);
                                }
                            } else {
                                class272.field4345++;
                                String[] var55 = var54.field1475;
                                if (class61.field784) {
                                    var55 = class89.method484(17594, var55);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 3;
                                        }
                                        class51.field659++;
                                        if (var56 == 1) {
                                            var57 = 19;
                                        }
                                        if (var56 == 2) {
                                            var57 = 59;
                                        }
                                        if (var56 == 3) {
                                            var57 = 13;
                                        }
                                        if (var56 == 4) {
                                            var57 = 32;
                                        }
                                        int var58 = -1;
                                        if (var54.field1532 == var56) {
                                            var58 = var54.field1529;
                                        }
                                        if (var54.field1462 == var56) {
                                            var58 = var54.field1464;
                                        }
                                        class195.method1373(var19, "<col=ff9040>" + var54.field1504, var58, (long) var53, (byte) -95, var20, var55[var56], var57);
                                    }
                                }
                                class195.method1373(var19, "<col=ff9040>" + var54.field1504, class59.field761, (long) var53, (byte) -108, var20, class60.field772, (short) 1002);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLnl;ZIILnl;I)I")
    public static final int method887(boolean arg0, class216 arg1, boolean arg2, int arg3, int arg4, class216 arg5, int arg6) {
        int var7 = class39.method214(arg3, arg4 - 8657, arg5, arg2, arg1);
        field2084++;
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else if (arg4 == 0) {
            int var8 = class39.method214(arg6, -8657, arg5, arg0, arg1);
            return arg0 ? -var8 : var8;
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Loe;)V")
    public class130(class71 arg0) {
        this.field2086 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)Ljb;")
    public static final class188 method888(int arg0, int arg1) {
        field2083++;
        class188 var2 = (class188) class104.field1395.method1693((long) arg1, arg0 ^ 0x60);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class113.field1630.method928(class212.method1490((byte) -73, arg1), (byte) 124, class103.method625(arg1, 127));
        class188 var4 = new class188();
        var4.field3028 = arg1;
        if (arg0 != 0) {
            return null;
        }
        if (var3 != null) {
            var4.method1305(new class96(var3), -1);
        }
        var4.method1312(-83);
        class104.field1395.method1694(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
    public static void method889(int arg0) {
        if (arg0 == 0) {
            field2089 = null;
            field2081 = null;
        }
    }
}
