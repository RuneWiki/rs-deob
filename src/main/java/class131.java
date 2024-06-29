import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class131 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
    public static int[] field2060 = new int[50];

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2061 = "wave:";

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field2063 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        field2061 = null;
        if (arg0 != 0) {
            field2063 = 105;
        }
        field2060 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method909(int arg0) {
        field2059++;
        class236.field3814.method537(false);
        int var1 = class236.field3814.method535(1, 104);
        if (var1 == 0) {
            return;
        }
        int var2 = class236.field3814.method535(2, 104);
        if (var2 == 0) {
            class244.field3972[class141.field2155++] = 2047;
        } else if (var2 == 1) {
            int var3 = class236.field3814.method535(3, arg0 ^ 0xFFFFE3D7);
            class283.field4473.method974(1, var3, -32049);
            int var4 = class236.field3814.method535(1, 104);
            if (var4 == 1) {
                class244.field3972[class141.field2155++] = 2047;
            }
        } else if (var2 == 2) {
            if (class236.field3814.method535(1, 104) == 1) {
                int var6 = class236.field3814.method535(3, 104);
                class283.field4473.method974(2, var6, arg0 ^ 0x6170);
                int var7 = class236.field3814.method535(3, arg0 + 7337);
                class283.field4473.method974(2, var7, -32049);
            } else {
                int var5 = class236.field3814.method535(3, arg0 + 7337);
                class283.field4473.method974(0, var5, -32049);
            }
            int var8 = class236.field3814.method535(1, 104);
            if (var8 == 1) {
                class244.field3972[class141.field2155++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class236.field3814.method535(7, arg0 + 7337);
            int var10 = class236.field3814.method535(7, arg0 + 7337);
            class240.field3892 = class236.field3814.method535(2, arg0 + 7337);
            int var11 = class236.field3814.method535(1, 104);
            if (var11 == 1) {
                class244.field3972[class141.field2155++] = 2047;
            }
            int var12 = class236.field3814.method535(1, 104);
            class283.field4473.method1622(var10, arg0 ^ 0xFFFFE3BF, var12 == 1, var9);
        } else if (arg0 != -7233) {
            field2063 = 111;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2067++;
        if (class73.field1227 == 0) {
            int var7 = class95.field1610;
            int var8 = class144.field2217;
            int var9 = class99.field1670;
            int var10 = class146.field2323;
            int var11 = (arg0 - arg2) * (var8 - var7) / arg1 + var7;
            int var12 = (arg6 - arg3) * (var10 - var9) / arg4 + var9;
            if (class122.field1960 && (class170.field2644 & 0x40) != 0) {
                class228 var13 = class31.method239(class139.field2132, -1, class102.field1704);
                if (var13 == null) {
                    class150.method1008(false);
                } else {
                    class117.method825(class258.field4123, -1, class37.field518, var12, 0L, (short) 11, " ->", var11);
                }
            } else {
                if (class167.field2613 == 1) {
                    class117.method825(-1, -1, class222.field3406, var12, 0L, (short) 18, "", var11);
                }
                class243.field3957++;
                class117.method825(-1, -1, class186.field2868, var12, 0L, (short) 2, "", var11);
            }
        }
        long var14 = -1L;
        int var16 = 0;
        if (arg5 != -2) {
            return;
        }
        while (class228.field3623 > var16) {
            long var17 = class185.field2864[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = ((int) var17 & 0x76FE1602) >> 29;
            int var21 = (int) var17 & 0x7F;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                label372: {
                    var14 = var17;
                    if (var20 == 2 && class110.method783(class240.field3892, var21, var19, var17)) {
                        class193 var23 = class69.method501(arg5 + 2, var22);
                        if (var23.field2997 != null) {
                            var23 = var23.method1297(false);
                        }
                        if (var23 == null) {
                            break label372;
                        }
                        if (class73.field1227 == 1) {
                            class117.method825(class140.field2139, -1, class137.field2109, var19, var17, (short) 60, class243.field3951 + " -> <col=00ffff>" + var23.field3031, var21);
                            class40.field579++;
                        } else if (class122.field1960) {
                            class200 var28 = class4.field31 == -1 ? null : class250.method1716(class4.field31, (byte) -47);
                            if ((class170.field2644 & 0x4) != 0 && (var28 == null || var23.method1304(var28.field3132, (byte) -81, class4.field31) != var28.field3132)) {
                                class117.method825(class258.field4123, -1, class37.field518, var19, var17, (short) 12, class190.field2950 + " -> <col=00ffff>" + var23.field3031, var21);
                                class72.field1214++;
                            }
                        } else {
                            class212.field3296++;
                            String[] var24 = var23.field3035;
                            if (class165.field2589) {
                                var24 = class100.method730(arg5 + 2, var24);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; var25--) {
                                    if (var24[var25] != null) {
                                        class100.field1671++;
                                        int var26 = -1;
                                        short var27 = 0;
                                        if (var25 == 0) {
                                            var27 = 57;
                                        }
                                        if (var23.field3022 == var25) {
                                            var26 = var23.field3068;
                                        }
                                        if (var25 == 1) {
                                            var27 = 9;
                                        }
                                        if (var25 == 2) {
                                            var27 = 33;
                                        }
                                        if (var23.field2988 == var25) {
                                            var26 = var23.field3026;
                                        }
                                        if (var25 == 3) {
                                            var27 = 45;
                                        }
                                        if (var25 == 4) {
                                            var27 = 1002;
                                        }
                                        class117.method825(var26, arg5 + 1, var24[var25], var19, var17, var27, "<col=00ffff>" + var23.field3031, var21);
                                    }
                                }
                            }
                            class117.method825(class34.field504, arg5 ^ 0x1, class113.field1851, var19, (long) var23.field3024, (short) 1007, "<col=00ffff>" + var23.field3031, var21);
                        }
                    }
                    if (var20 == 1) {
                        class45 var29 = class255.field4082[var22];
                        if ((var29.field645.field977 & 0x1) == 0 && (var29.field2240 & 0x7F) == 0 && (var29.field2278 & 0x7F) == 0 || (var29.field645.field977 & 0x1) == 1 && (var29.field2240 & 0x7F) == 64 && (var29.field2278 & 0x7F) == 64) {
                            int var30 = var29.field2240 - ((var29.field645.field977 - 1) * 64);
                            int var31 = var29.field2278 - (var29.field645.field977 * 64 - 64);
                            for (int var32 = 0; var32 < class70.field1119; var32++) {
                                class45 var37 = class255.field4082[class284.field4506[var32]];
                                if (var37 != null && !var37.field2253 && var29 != var37 && var37.field2222) {
                                    int var38 = var37.field2240 + 64 - (var37.field645.field977 * 64);
                                    int var39 = var37.field2278 - ((var37.field645.field977 - 1) * 64);
                                    if (var38 >= var30 && (var29.field645.field977 - (var38 - var30 >> 7)) >= var37.field645.field977 && var31 <= var39 && var29.field645.field977 - (var39 - var31 >> 7) >= var37.field645.field977) {
                                        class177.method1201(arg5 + 93, var37.field645, var21, var19, class284.field4506[var32]);
                                        var37.field2253 = true;
                                    }
                                }
                            }
                            for (int var33 = 0; var33 < class137.field2110; var33++) {
                                class236 var34 = class210.field3267[class99.field1660[var33]];
                                if (var34 != null && !var34.field2253 && var34.field2222) {
                                    int var35 = var34.field2240 - ((var34.method971(65535) - 1) * 64);
                                    int var36 = var34.field2278 - ((var34.method971(arg5 + 65537) - 1) * 64);
                                    if (var30 <= var35 && var34.method971(65535) <= (var29.field645.field977 - (var35 - var30 >> 7)) && var31 <= var36 && var34.method971(arg5 ^ 0xFFFF0001) <= (var29.field645.field977 - (var36 - var31 >> 7))) {
                                        class248.method1710(var34, class99.field1660[var33], var21, var19, 46);
                                        var34.field2253 = true;
                                    }
                                }
                            }
                        }
                        if (var29.field2253) {
                            break label372;
                        }
                        class177.method1201(83, var29.field645, var21, var19, var22);
                        var29.field2253 = true;
                    }
                    if (var20 == 0) {
                        class236 var40 = class210.field3267[var22];
                        if ((var40.field2240 & 0x7F) == 64 && (var40.field2278 & 0x7F) == 64) {
                            int var41 = var40.field2240 + 64 - (var40.method971(65535) * 64);
                            int var42 = var40.field2278 - ((var40.method971(65535) - 1) * 64);
                            for (int var43 = 0; var43 < class70.field1119; var43++) {
                                class45 var48 = class255.field4082[class284.field4506[var43]];
                                if (var48 != null && !var48.field2253 && var48.field2222) {
                                    int var49 = var48.field2240 + 64 - (var48.field645.field977 * 64);
                                    int var50 = var48.field2278 - ((var48.field645.field977 - 1) * 64);
                                    if (var49 >= var41 && var48.field645.field977 <= (var40.method971(65535) - (var49 - var41 >> 7)) && var42 <= var50 && var48.field645.field977 <= (var40.method971(65535) - (var50 - var42 >> 7))) {
                                        class177.method1201(125, var48.field645, var21, var19, class284.field4506[var43]);
                                        var48.field2253 = true;
                                    }
                                }
                            }
                            for (int var44 = 0; var44 < class137.field2110; var44++) {
                                class236 var45 = class210.field3267[class99.field1660[var44]];
                                if (var45 != null && !var45.field2253 && var40 != var45 && var45.field2222) {
                                    int var46 = var45.field2240 - ((var45.method971(65535) - 1) * 64);
                                    int var47 = var45.field2278 + (64 - (var45.method971(65535) * 64));
                                    if (var41 <= var46 && var45.method971(65535) <= (var40.method971(65535) - (var46 - var41 >> 7)) && var42 <= var47 && var45.method971(65535) <= (var40.method971(65535) - (var47 - var42 >> 7))) {
                                        class248.method1710(var45, class99.field1660[var44], var21, var19, 46);
                                        var45.field2253 = true;
                                    }
                                }
                            }
                        }
                        if (var40.field2253) {
                            break label372;
                        }
                        class248.method1710(var40, var22, var21, var19, 46);
                        var40.field2253 = true;
                    }
                    if (var20 == 3) {
                        class180 var51 = class222.field3411[class240.field3892][var21][var19];
                        if (var51 != null) {
                            for (class258 var52 = (class258) var51.method1224((byte) 87); var52 != null; var52 = (class258) var51.method1225(15)) {
                                int var53 = var52.field4119.field1746;
                                class72 var54 = class85.method602(false, var53);
                                if (class73.field1227 == 1) {
                                    class117.method825(class140.field2139, arg5 + 1, class137.field2109, var19, (long) var53, (short) 42, class243.field3951 + " -> <col=ff9040>" + var54.field1176, var21);
                                    class267.field4261++;
                                } else if (class122.field1960) {
                                    class200 var59 = class4.field31 == -1 ? null : class250.method1716(class4.field31, (byte) 119);
                                    if ((class170.field2644 & 0x1) != 0 && (var59 == null || var54.method516(0, class4.field31, var59.field3132) != var59.field3132)) {
                                        class117.method825(class258.field4123, -1, class37.field518, var19, (long) var53, (short) 16, class190.field2950 + " -> <col=ff9040>" + var54.field1176, var21);
                                        class214.field3328++;
                                    }
                                } else {
                                    class37.field528++;
                                    String[] var55 = var54.field1177;
                                    if (class165.field2589) {
                                        var55 = class100.method730(0, var55);
                                    }
                                    for (int var56 = 4; var56 >= 0; var56--) {
                                        if (var55 != null && var55[var56] != null) {
                                            class241.field3912++;
                                            byte var57 = 0;
                                            if (var56 == 0) {
                                                var57 = 15;
                                            }
                                            if (var56 == 1) {
                                                var57 = 17;
                                            }
                                            if (var56 == 2) {
                                                var57 = 1;
                                            }
                                            if (var56 == 3) {
                                                var57 = 24;
                                            }
                                            if (var56 == 4) {
                                                var57 = 47;
                                            }
                                            int var58 = -1;
                                            if (var54.field1205 == var56) {
                                                var58 = var54.field1156;
                                            }
                                            if (var54.field1151 == var56) {
                                                var58 = var54.field1149;
                                            }
                                            class117.method825(var58, -1, var55[var56], var19, (long) var53, var57, "<col=ff9040>" + var54.field1176, var21);
                                        }
                                    }
                                    class117.method825(class34.field504, -1, class113.field1851, var19, (long) var53, (short) 1003, "<col=ff9040>" + var54.field1176, var21);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ)V")
    public static final void method911(int arg0, long arg1) {
        field2062++;
        client.field2435.field1535 = 0;
        client.field2435.method654((byte) -116, 21);
        client.field2435.method638(arg1, false);
        class255.field4087 = 1;
        class47.field688 = 0;
        class171.field2677 = -3;
        class15.field234 = 0;
        if (arg0 <= 110) {
            field2061 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method912(int arg0, int arg1) {
        field2066++;
        if (arg1 == 100 && class30.field449 > 0) {
            byte[] var2 = class143.field2172[--class30.field449];
            class143.field2172[class30.field449] = null;
            return var2;
        } else if (arg1 == 5000 && class205.field3207 > 0) {
            byte[] var3 = class264.field4194[--class205.field3207];
            class264.field4194[class205.field3207] = null;
            return var3;
        } else {
            if (arg0 != -1) {
                field2060 = null;
            }
            if (arg1 == 30000 && class135.field2100 > 0) {
                byte[] var4 = class17.field255[--class135.field2100];
                class17.field255[class135.field2100] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static final void method913(int arg0) {
        class184.field2849++;
        if (arg0 <= -32) {
            client.field2435.method536((byte) -104, 98);
            field2065++;
            client.field2435.method638(0L, false);
        }
    }
}
