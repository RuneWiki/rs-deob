import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class271 extends class74 {

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field4283 = 0;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field4289 = 0;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class271() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class90.field1458 == -1) {
            int var7 = class160.field2452;
            int var8 = class254.field3901;
            int var9 = class124.field1960;
            int var10 = (-arg4 + arg5) * (-var8 + var9) / arg3 + var8;
            int var11 = class285.field4486;
            int var12 = (-arg2 + arg0) * (-var7 + var11) / arg6 + var7;
            if (class179.field2678 && ~(class71.field1135 & 64) != -1) {
                class188 var13 = class32.method261(class10.field197, class217.field3369, 108);
                if (var13 != null) {
                    class155.method1045(" ->", (short) 15, class78.field1316, var12, class87.field1421, 0L, (byte) 78, var10);
                } else {
                    class270.method1824(64512);
                }
            } else {
                if (class154.field2352 == 1) {
                    class155.method1045("", (short) 9, class218.field3417, var12, -1, 0L, (byte) 78, var10);
                }
                class155.method1045("", (short) 44, class203.field3171, var12, -1, 0L, (byte) 78, var10);
                ++class87.field1425;
            }
        }
        ++field4282;
        long var14 = -1L;
        if (arg1 >= 94) {
            for (int var16 = 0; ~var16 > ~class263.field4113; ++var16) {
                long var17 = class80.field1333[var16];
                int var19 = 127 & (int) var17 >> 7;
                int var20 = 127 & (int) var17;
                int var21 = (2049177940 & (int) var17) >> 29;
                int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
                if (var14 != var17) {
                    var14 = var17;
                    if (var21 == 2 && class268.method1820(class274.field4318, var20, var19, var17)) {
                        class73 var23 = class85.method690(2276, var22);
                        if (var23.field1189 != null) {
                            var23 = var23.method577(59);
                        }
                        if (var23 == null) {
                            continue;
                        }
                        if (class90.field1458 == 1) {
                            ++class39.field644;
                            class155.method1045(class56.field870 + " -> <col=00ffff>" + var23.field1231, (short) 23, class256.field3920, var20, class86.field1418, var17, (byte) 78, var19);
                        } else if (class179.field2678) {
                            class289 var24 = ~class258.field3951 == 0 ? null : class31.method250(class258.field3951, -89);
                            if (~(class71.field1135 & 4) != -1 && (var24 == null || var23.method573(class258.field3951, 9623, var24.field4557) != var24.field4557)) {
                                ++class249.field3840;
                                class155.method1045(class126.field1982 + " -> <col=00ffff>" + var23.field1231, (short) 20, class78.field1316, var20, class87.field1421, var17, (byte) 78, var19);
                            }
                        } else {
                            ++class165.field2502;
                            String[] var25 = var23.field1164;
                            if (class215.field3316) {
                                var25 = class296.method1987(var25, 122);
                            }
                            if (var25 != null) {
                                for (int var26 = 4; var26 >= 0; --var26) {
                                    if (var25[var26] != null) {
                                        ++class252.field3880;
                                        short var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 2;
                                        }
                                        int var28 = -1;
                                        if (var23.field1200 == var26) {
                                            var28 = var23.field1182;
                                        }
                                        if (~var26 == -2) {
                                            var27 = 19;
                                        }
                                        if (~var23.field1176 == ~var26) {
                                            var28 = var23.field1190;
                                        }
                                        if (~var26 == -3) {
                                            var27 = 26;
                                        }
                                        if (~var26 == -4) {
                                            var27 = 42;
                                        }
                                        if (~var26 == -5) {
                                            var27 = 1004;
                                        }
                                        class155.method1045("<col=00ffff>" + var23.field1231, var27, var25[var26], var20, var28, var17, (byte) 78, var19);
                                    }
                                }
                            }
                            class155.method1045("<col=00ffff>" + var23.field1231, (short) 1006, class117.field1822, var20, class228.field3576, (long) var23.field1209, (byte) 78, var19);
                        }
                    }
                    if (var21 == 1) {
                        class32 var29 = class72.field1144[var22];
                        if (~(1 & var29.field518.field3352) == -1 && (127 & var29.field4176) == 0 && ~(127 & var29.field4123) == -1 || (var29.field518.field3352 & 1) == 1 && ~(var29.field4176 & 127) == -65 && ~(127 & var29.field4123) == -65) {
                            int var30 = var29.field4176 - -64 - var29.field518.field3352 * 64;
                            int var31 = -(var29.field518.field3352 * 64) + var29.field4123 + 64;
                            for (int var32 = 0; ~var32 > ~class62.field1006; ++var32) {
                                class32 var37 = class72.field1144[class198.field3113[var32]];
                                if (var37 != null && !var37.field4122 && var29 != var37 && var37.field4124) {
                                    int var38 = -(var37.field518.field3352 * 64) + 64 + var37.field4176;
                                    int var39 = var37.field4123 - (var37.field518.field3352 - 1) * 64;
                                    if (var38 >= var30 && ~(var29.field518.field3352 - (-var30 + var38 >> 7)) <= ~var37.field518.field3352 && var31 <= var39 && ~var37.field518.field3352 >= ~(-(-var31 + var39 >> 7) + var29.field518.field3352)) {
                                        class11.method122(var19, var37.field518, var20, 70, class198.field3113[var32]);
                                        var37.field4122 = true;
                                    }
                                }
                            }
                            for (int var33 = 0; class5.field78 > var33; ++var33) {
                                class28 var34 = class41.field675[class166.field2510[var33]];
                                if (var34 != null && !var34.field4122 && var34.field4124) {
                                    int var35 = var34.field4176 + -((var34.method226((byte) -97) + -1) * 64);
                                    int var36 = var34.field4123 + -(64 * (var34.method226((byte) -97) - 1));
                                    if (~var30 >= ~var35 && ~var34.method226((byte) -97) >= ~(-(-var30 + var35 >> 7) + var29.field518.field3352) && var31 <= var36 && ~var34.method226((byte) -97) >= ~(-(-var31 + var36 >> 7) + var29.field518.field3352)) {
                                        class191.method1291((byte) -37, var34, var19, class166.field2510[var33], var20);
                                        var34.field4122 = true;
                                    }
                                }
                            }
                        }
                        if (var29.field4122) {
                            continue;
                        }
                        class11.method122(var19, var29.field518, var20, 70, var22);
                        var29.field4122 = true;
                    }
                    if (~var21 == -1) {
                        class28 var40 = class41.field675[var22];
                        if (~(127 & var40.field4176) == -65 && (var40.field4123 & 127) == 64) {
                            int var41 = var40.field4176 - (var40.method226((byte) -97) + -1) * 64;
                            int var42 = var40.field4123 - (-1 + var40.method226((byte) -97)) * 64;
                            for (int var43 = 0; ~var43 > ~class62.field1006; ++var43) {
                                class32 var48 = class72.field1144[class198.field3113[var43]];
                                if (var48 != null && !var48.field4122 && var48.field4124) {
                                    int var49 = var48.field4176 - (var48.field518.field3352 + -1) * 64;
                                    int var50 = -((var48.field518.field3352 + -1) * 64) + var48.field4123;
                                    if (~var49 <= ~var41 && var48.field518.field3352 <= var40.method226((byte) -97) + -(-var41 + var49 >> 7) && var42 <= var50 && var48.field518.field3352 <= -(-var42 + var50 >> 7) + var40.method226((byte) -97)) {
                                        class11.method122(var19, var48.field518, var20, 28, class198.field3113[var43]);
                                        var48.field4122 = true;
                                    }
                                }
                            }
                            for (int var44 = 0; ~var44 > ~class5.field78; ++var44) {
                                class28 var45 = class41.field675[class166.field2510[var44]];
                                if (var45 != null && !var45.field4122 && var40 != var45 && var45.field4124) {
                                    int var46 = var45.field4176 + -(64 * (var45.method226((byte) -97) + -1));
                                    int var47 = var45.field4123 + 64 + -(64 * var45.method226((byte) -97));
                                    if (var46 >= var41 && ~var45.method226((byte) -97) >= ~(-(-var41 + var46 >> 7) + var40.method226((byte) -97)) && ~var42 >= ~var47 && ~var45.method226((byte) -97) >= ~(var40.method226((byte) -97) + -(-var42 + var47 >> 7))) {
                                        class191.method1291((byte) -37, var45, var19, class166.field2510[var44], var20);
                                        var45.field4122 = true;
                                    }
                                }
                            }
                        }
                        if (var40.field4122) {
                            continue;
                        }
                        class191.method1291((byte) -37, var40, var19, var22, var20);
                        var40.field4122 = true;
                    }
                    if (~var21 == -4) {
                        class149 var51 = class293.field4613[class274.field4318][var20][var19];
                        if (var51 != null) {
                            for (class50 var52 = (class50) var51.method1012(-1); var52 != null; var52 = (class50) var51.method1009((byte) -94)) {
                                int var53 = var52.field803.field3477;
                                class123 var54 = class32.method260(var53, true);
                                if (~class90.field1458 == -2) {
                                    ++class61.field983;
                                    class155.method1045(class56.field870 + " -> <col=ff9040>" + var54.field1885, (short) 37, class256.field3920, var20, class86.field1418, (long) var53, (byte) 78, var19);
                                } else if (class179.field2678) {
                                    class289 var55 = class258.field3951 == -1 ? null : class31.method250(class258.field3951, -89);
                                    if ((1 & class71.field1135) != 0 && (var55 == null || ~var54.method876(-1, class258.field3951, var55.field4557) != ~var55.field4557)) {
                                        ++class66.field1055;
                                        class155.method1045(class126.field1982 + " -> <col=ff9040>" + var54.field1885, (short) 59, class78.field1316, var20, class87.field1421, (long) var53, (byte) 78, var19);
                                    }
                                } else {
                                    ++class223.field3507;
                                    String[] var56 = var54.field1908;
                                    if (class215.field3316) {
                                        var56 = class296.method1987(var56, 120);
                                    }
                                    for (int var57 = 4; ~var57 <= -1; --var57) {
                                        if (var56 != null && var56[var57] != null) {
                                            ++class195.field3069;
                                            byte var58 = 0;
                                            if (var57 == 0) {
                                                var58 = 14;
                                            }
                                            if (~var57 == -2) {
                                                var58 = 47;
                                            }
                                            if (~var57 == -3) {
                                                var58 = 17;
                                            }
                                            if (~var57 == -4) {
                                                var58 = 58;
                                            }
                                            if (~var57 == -5) {
                                                var58 = 46;
                                            }
                                            int var59 = -1;
                                            if (var54.field1899 == var57) {
                                                var59 = var54.field1913;
                                            }
                                            if (var54.field1897 == var57) {
                                                var59 = var54.field1878;
                                            }
                                            class155.method1045("<col=ff9040>" + var54.field1885, var58, var56[var57], var20, var59, (long) var53, (byte) 78, var19);
                                        }
                                    }
                                    class155.method1045("<col=ff9040>" + var54.field1885, (short) 1007, class117.field1822, var20, class228.field3576, (long) var53, (byte) 78, var19);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Lkd;")
    public static final class209 method1830(byte arg0) {
        ++field4286;
        int var1 = -121 % ((-8 - arg0) / 49);
        return ~class105.field1695 > ~class121.field1868.length ? class121.field1868[class105.field1695++] : null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
    public static final void method1831(byte arg0) {
        ++class1.field8;
        ++field4287;
        int var1 = -97 % ((arg0 - -24) / 48);
        class292.field4607.method1251(190, (byte) -35);
        class292.field4607.method312(1489253544, class109.field1741);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZBIII)V")
    public static final void method1832(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -37) {
            method1833((byte) -126, 14, -121);
        }
        class100.field1593 = 0L;
        ++field4284;
        boolean var5 = false;
        int var6 = class245.method1659(124);
        if (arg4 == 3 || ~var6 == -4) {
            arg0 = true;
        }
        if (class59.field939.startsWith("mac") && arg4 > 0) {
            arg0 = true;
        }
        if (arg4 <= 0 == var6 > 0) {
            var5 = true;
        }
        if (arg0 && ~arg4 < -1) {
            var5 = true;
        }
        class149.method1018(arg2, -2162, var5, arg0, arg3, arg4, var6);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(BII)I")
    public static final int method1833(byte arg0, int arg1, int arg2) {
        int var3 = 32 % ((arg0 - -10) / 56);
        class127 var4 = (class127) class251.field3858.method1414(true, (long) arg2);
        ++field4285;
        if (var4 == null) {
            return -1;
        } else {
            return arg1 >= 0 && ~arg1 > ~var4.field1998.length ? var4.field1998[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            field4283 = -120;
        }
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int[][] var4 = this.method592(arg1, 0, arg0 ^ 86);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            for (int var8 = 0; class178.field2662 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        ++field4288;
        return var3;
    }
}
