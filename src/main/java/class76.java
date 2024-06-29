import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class76 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lbc;")
    public static class282 field908;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII[I)V")
    public static final void method463(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field912++;
        if (arg1 != 0) {
            return;
        }
        arg0--;
        int var13 = arg3 - 1;
        int var5 = var13 - 7;
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg4[var6] = arg2;
            int var7 = var6 + 1;
            arg4[var7] = arg2;
            int var8 = var7 + 1;
            arg4[var8] = arg2;
            int var9 = var8 + 1;
            arg4[var9] = arg2;
            int var10 = var9 + 1;
            arg4[var10] = arg2;
            int var11 = var10 + 1;
            arg4[var11] = arg2;
            int var12 = var11 + 1;
            arg4[var12] = arg2;
            arg0 = var12 + 1;
            arg4[arg0] = arg2;
        }
        while (var13 > arg0) {
            arg0++;
            arg4[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIIII)V")
    public static final void method464(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class196.field2790 == 0) {
            int var7 = class167.field2400;
            int var8 = class173.field2479;
            int var9 = class39.field472;
            int var10 = class171.field2446;
            int var11 = (arg3 - arg6) * (var8 - var7) / arg4 + var7;
            int var12 = (arg1 - arg5) * (var10 - var9) / arg0 + var9;
            if (class267.field3857 && (class282.field4263 & 0x40) != 0) {
                class82 var13 = class112.method694(class276.field4192, false, class287.field4469);
                if (var13 == null) {
                    class54.method328(false);
                } else {
                    class176.method1143(arg2 + 21, var11, (short) 10, var12, class268.field3916, " ->", class133.field1945, 0L);
                }
            } else {
                class2.field23++;
                if (class5.field67 == 1) {
                    class176.method1143(4, var11, (short) 19, var12, -1, "", class241.field3504, 0L);
                }
                class176.method1143(4, var11, (short) 24, var12, -1, "", class230.field3305, 0L);
            }
        }
        long var14 = -1L;
        if (arg2 != -17) {
            return;
        }
        field904++;
        for (int var16 = 0; var16 < class71.field834; var16++) {
            long var17 = class252.field3648[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 7 & 0x7F;
            int var22 = ((int) var17 & 0x77FBA345) >> 29;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class55.method333(class199.field2833, var19, var21, var17)) {
                    class273 var23 = class164.method1081(arg2 + 17, var20);
                    if (var23.field3991 != null) {
                        var23 = var23.method1751(-23199);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class196.field2790 == 1) {
                        class176.method1143(4, var19, (short) 22, var21, class167.field2403, class107.field1444 + " -> <col=00ffff>" + var23.field4060, class26.field314, var17);
                        class199.field2831++;
                    } else if (class267.field3857) {
                        class139 var24 = class227.field3201 == -1 ? null : class16.method99(class227.field3201, arg2 ^ 0x7C4B);
                        if ((class282.field4263 & 0x4) != 0 && (var24 == null || var23.method1748(true, class227.field3201, var24.field2019) != var24.field2019)) {
                            class122.field1738++;
                            class176.method1143(4, var19, (short) 49, var21, class268.field3916, class48.field560 + " -> <col=00ffff>" + var23.field4060, class133.field1945, var17);
                        }
                    } else {
                        class233.field3368++;
                        String[] var25 = var23.field3996;
                        if (class149.field2171) {
                            var25 = class103.method624(var25, (byte) 102);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class150.field2183++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 32;
                                    }
                                    if (var26 == 1) {
                                        var27 = 14;
                                    }
                                    int var28 = -1;
                                    if (var23.field4002 == var26) {
                                        var28 = var23.field4048;
                                    }
                                    if (var26 == 2) {
                                        var27 = 3;
                                    }
                                    if (var23.field4034 == var26) {
                                        var28 = var23.field4003;
                                    }
                                    if (var26 == 3) {
                                        var27 = 9;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1007;
                                    }
                                    class176.method1143(4, var19, var27, var21, var28, "<col=00ffff>" + var23.field4060, var25[var26], var17);
                                }
                            }
                        }
                        class176.method1143(4, var19, (short) 1003, var21, class263.field3816, "<col=00ffff>" + var23.field4060, class21.field251, (long) var23.field4012);
                    }
                }
                if (var22 == 1) {
                    class54 var29 = class20.field244[var20];
                    if ((var29.field636.field3858 & 0x1) == 0 && (var29.field4563 & 0x7F) == 0 && (var29.field4553 & 0x7F) == 0 || (var29.field636.field3858 & 0x1) == 1 && (var29.field4563 & 0x7F) == 64 && (var29.field4553 & 0x7F) == 64) {
                        int var30 = var29.field4563 - ((var29.field636.field3858 - 1) * 64);
                        int var31 = var29.field4553 + 64 - (var29.field636.field3858 * 64);
                        for (int var32 = 0; var32 < class294.field4642; var32++) {
                            class54 var37 = class20.field244[class14.field176[var32]];
                            if (var37 != null && !var37.field4572 && var29 != var37 && var37.field4524) {
                                int var38 = var37.field4563 + 64 - (var37.field636.field3858 * 64);
                                int var39 = var37.field4553 + 64 - var37.field636.field3858 * 64;
                                if (var30 <= var38 && var37.field636.field3858 <= (var29.field636.field3858 - (var38 - var30 >> 7)) && var39 >= var31 && var37.field636.field3858 <= var29.field636.field3858 - (var39 - var31 >> 7)) {
                                    class280.method1841(var21, var37.field636, true, class14.field176[var32], var19);
                                    var37.field4572 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class238.field3432; var33++) {
                            class240 var34 = class253.field3656[class46.field540[var33]];
                            if (var34 != null && !var34.field4572 && var34.field4524) {
                                int var35 = var34.field4563 + 64 - (var34.method1556(arg2 + 3905) * 64);
                                int var36 = var34.field4553 + 64 - (var34.method1556(3888) * 64);
                                if (var35 >= var30 && var34.method1556(3888) <= (var29.field636.field3858 - (var35 - var30 >> 7)) && var31 <= var36 && var34.method1556(arg2 ^ 0xFFFFF0DF) <= (var29.field636.field3858 - (var36 - var31 >> 7))) {
                                    class84.method502(var19, class46.field540[var33], var21, var34, arg2 + 25);
                                    var34.field4572 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4572) {
                        continue;
                    }
                    class280.method1841(var21, var29.field636, true, var20, var19);
                    var29.field4572 = true;
                }
                if (var22 == 0) {
                    class240 var40 = class253.field3656[var20];
                    if ((var40.field4563 & 0x7F) == 64 && (var40.field4553 & 0x7F) == 64) {
                        int var41 = var40.field4563 - (var40.method1556(3888) - 1) * 64;
                        int var42 = var40.field4553 + 64 - var40.method1556(3888) * 64;
                        for (int var43 = 0; var43 < class294.field4642; var43++) {
                            class54 var48 = class20.field244[class14.field176[var43]];
                            if (var48 != null && !var48.field4572 && var48.field4524) {
                                int var49 = var48.field4553 - ((var48.field636.field3858 - 1) * 64);
                                int var50 = var48.field4563 - (var48.field636.field3858 - 1) * 64;
                                if (var50 >= var41 && var48.field636.field3858 <= (var40.method1556(3888) - (var50 - var41 >> 7)) && var42 <= var49 && var48.field636.field3858 <= (var40.method1556(3888) - (var49 - var42 >> 7))) {
                                    class280.method1841(var21, var48.field636, true, class14.field176[var43], var19);
                                    var48.field4572 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class238.field3432; var44++) {
                            class240 var45 = class253.field3656[class46.field540[var44]];
                            if (var45 != null && !var45.field4572 && var40 != var45 && var45.field4524) {
                                int var46 = var45.field4563 - (var45.method1556(3888) - 1) * 64;
                                int var47 = var45.field4553 + 64 - (var45.method1556(3888) * 64);
                                if (var46 >= var41 && var45.method1556(3888) <= var40.method1556(arg2 ^ 0xFFFFF0DF) - (var46 - var41 >> 7) && var47 >= var42 && var45.method1556(3888) <= (var40.method1556(arg2 ^ 0xFFFFF0DF) - (var47 - var42 >> 7))) {
                                    class84.method502(var19, class46.field540[var44], var21, var45, 8);
                                    var45.field4572 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4572) {
                        continue;
                    }
                    class84.method502(var19, var20, var21, var40, 8);
                    var40.field4572 = true;
                }
                if (var22 == 3) {
                    class234 var51 = class80.field943[class199.field2833][var19][var21];
                    if (var51 != null) {
                        for (class192 var52 = (class192) var51.method1531(-696136762); var52 != null; var52 = (class192) var51.method1525((byte) -84)) {
                            int var53 = var52.field2762.field1303;
                            class229 var54 = class36.method224(var53, 100);
                            if (class196.field2790 == 1) {
                                class176.method1143(4, var19, (short) 11, var21, class167.field2403, class107.field1444 + " -> <col=ff9040>" + var54.field3235, class26.field314, (long) var53);
                                class72.field863++;
                            } else if (class267.field3857) {
                                class139 var59 = class227.field3201 == -1 ? null : class16.method99(class227.field3201, arg2 - 31819);
                                if ((class282.field4263 & 0x1) != 0 && (var59 == null || var54.method1495(var59.field2019, class227.field3201, (byte) 126) != var59.field2019)) {
                                    class176.method1143(4, var19, (short) 47, var21, class268.field3916, class48.field560 + " -> <col=ff9040>" + var54.field3235, class133.field1945, (long) var53);
                                    class284.field4350++;
                                }
                            } else {
                                class224.field3156++;
                                String[] var55 = var54.field3285;
                                if (class149.field2171) {
                                    var55 = class103.method624(var55, (byte) 102);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class64.field749++;
                                        byte var57 = 0;
                                        int var58 = -1;
                                        if (var54.field3266 == var56) {
                                            var58 = var54.field3276;
                                        }
                                        if (var56 == 0) {
                                            var57 = 38;
                                        }
                                        if (var54.field3241 == var56) {
                                            var58 = var54.field3267;
                                        }
                                        if (var56 == 1) {
                                            var57 = 28;
                                        }
                                        if (var56 == 2) {
                                            var57 = 37;
                                        }
                                        if (var56 == 3) {
                                            var57 = 5;
                                        }
                                        if (var56 == 4) {
                                            var57 = 1;
                                        }
                                        class176.method1143(4, var19, var57, var21, var58, "<col=ff9040>" + var54.field3235, var55[var56], (long) var53);
                                    }
                                }
                                class176.method1143(4, var19, (short) 1006, var21, class263.field3816, "<col=ff9040>" + var54.field3235, class21.field251, (long) var53);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static final void method465(int arg0) {
        field909++;
        class222.field3138 = null;
        if (arg0 >= -81) {
            field908 = null;
        }
        class98.field1319 = null;
        class35.field410 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public abstract void method166(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
    public abstract void method168(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)V")
    public abstract void method167(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V")
    public class76(int arg0, int arg1, int arg2) {
        this.field907 = arg2;
        this.field906 = arg0;
        this.field910 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method466(byte arg0) {
        field908 = null;
        if (arg0 != -107) {
            method464(109, 10, (byte) -53, 59, 81, 125, 102);
        }
    }
}
