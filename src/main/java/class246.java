import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class246 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Z")
    public static boolean field4259 = false;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lia;")
    private static class257 field4264 = class28.method234(-78, "Members object");

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lia;")
    public static class257 field4267 = field4264;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lia;")
    public static class257 field4260 = class28.method234(-39, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static void method1613(boolean arg0) {
        field4264 = null;
        field4267 = null;
        if (arg0) {
            method1617(88, -29, 4, -113, 82);
        }
        field4260 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIILij;IJZ)Z")
    public static final boolean method1614(int arg0, int arg1, int arg2, int arg3, int arg4, class166 arg5, int arg6, long arg7, boolean arg8) {
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
        return class225.method1472(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lbd;BLmb;Lmb;)V")
    public static final void method1615(class98 arg0, byte arg1, class178 arg2, class178 arg3) {
        class72.field1406 = arg2;
        field4265++;
        class136.field2430 = arg0;
        class43.field856 = arg3;
        if (arg1 != 76) {
            field4260 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    public static final void method1616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4262++;
        class94.method692(class185.field3220[arg1], (byte) -123, arg2 - arg4, arg3, arg2 + arg4);
        if (arg0 < 123) {
            return;
        }
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        while (var5 < var6) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class185.field3220[arg1 + var6];
                var7 -= var6 << 1;
                int[] var10 = class185.field3220[arg1 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class94.method692(var9, (byte) -125, var12, arg3, var11);
                class94.method692(var10, (byte) 89, var12, arg3, var11);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class185.field3220[arg1 + var5];
            int[] var16 = class185.field3220[arg1 - var5];
            class94.method692(var15, (byte) -123, var14, arg3, var13);
            class94.method692(var16, (byte) -123, var14, arg3, var13);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIIII)V")
    public static final void method1617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4263++;
        for (int var5 = arg1; var5 < class44.field1030; var5++) {
            if (arg3 < client.field1519[var5] + class13.field242[var5] && client.field1519[var5] < (arg0 + arg3) && arg2 < (class197.field3327[var5] + class11.field215[var5]) && class11.field215[var5] < arg2 + arg4) {
                class75.field1464[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static final void method1618(int arg0) {
        field4266++;
        class2.method30(-125);
        System.gc();
        if (arg0 > -76) {
            method1619(43, 4, -46, -127, true, 56);
        }
        class209.method1404((byte) -38, 25);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class15.field328++;
        field4261++;
        if (!arg4) {
            class170.method1166(true, false);
            class104.method753((byte) 59, true);
            class170.method1166(false, false);
        }
        class104.method753((byte) 59, false);
        if (!arg4) {
            class169.method1161((byte) -64);
        }
        class103.method751((byte) 93);
        if (class224.field3766 == 1) {
            int var6 = class243.field4212;
            if (var6 < class94.field1785 / 256) {
                var6 = class94.field1785 / 256;
            }
            if (class225.field3777[4] && var6 < class211.field3605[4] + 128) {
                var6 = class211.field3605[4] + 128;
            }
            int var7 = class25.field479 + class156.field2735 & 0x7FF;
            class35.method295((byte) -20, class95.field1801, class109.method803(class189.field3261, class137.field2441.field4143, (byte) -58, class137.field2441.field4177) - 50, var7, var6, class238.field4099, var6 * 3 + 600, arg3);
        }
        int var8 = class55.field1171;
        int var9 = class231.field3885;
        int var10 = class255.field4366;
        int var11 = class173.field2956;
        int var12 = class248.field4276;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class225.field3777[var13]) {
                int var38 = (int) ((double) (-class243.field4218[var13]) + (double) (class243.field4218[var13] * 2 + 1) * Math.random() + Math.sin((double) class225.field3785[var13] / 100.0D * (double) class69.field1378[var13]) * (double) class211.field3605[var13]);
                if (var13 == 1) {
                    class55.field1171 += var38;
                }
                if (var13 == 4) {
                    class173.field2956 += var38;
                    if (class173.field2956 < 128) {
                        class173.field2956 = 128;
                    }
                    if (class173.field2956 > 383) {
                        class173.field2956 = 383;
                    }
                }
                if (var13 == 2) {
                    class231.field3885 += var38;
                }
                if (var13 == 3) {
                    class248.field4276 = class248.field4276 + var38 & 0x7FF;
                }
                if (var13 == 0) {
                    class255.field4366 += var38;
                }
            }
        }
        int var14 = 3;
        if (!class72.field1409 && !class185.field3213) {
            var14 = class189.field3261;
        }
        if (class69.method524((byte) 119) && class72.field1409 && !class185.field3213) {
            byte var15 = (byte) (class15.field328 - 4 & 0xFF);
            int var16 = class15.field328 % 104;
            if (class199.field3411 == null) {
                class199.field3411 = new byte[4][104][104];
            }
            for (int var17 = 0; var17 < 4; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class199.field3411[var17][var16][var18] = var15;
                }
            }
        }
        boolean var19 = false;
        if (class69.method524((byte) -7) && class72.field1409 && !class185.field3213 && class189.field3261 != 3) {
            for (int var20 = 0; var20 < 2; var20++) {
                class131.field2341[var20] = -1000000;
                class92.field1752[var20] = 1000000;
                class242.field4193[var20] = 0;
                class33.field648[var20] = 1000000;
                class42.field846[var20] = 0;
            }
            if (class224.field3766 == 1) {
                if ((class233.field4007[class189.field3261][class137.field2441.field4177 >> 7][class137.field2441.field4143 >> 7] & 0x4) != 0) {
                    class212.method1430(class137.field2441.field4143 >> 7, class75.field1463, class137.field2441.field4177 >> 7, true, 0);
                    var19 = true;
                }
                if (class173.field2956 < 310) {
                    int var21 = class255.field4366 >> 7;
                    int var22 = class231.field3885 >> 7;
                    int var23 = class137.field2441.field4177 >> 7;
                    int var24 = class137.field2441.field4143 >> 7;
                    int var25;
                    if (var23 <= var21) {
                        var25 = var21 - var23;
                    } else {
                        var25 = var23 - var21;
                    }
                    int var26;
                    if (var22 < var24) {
                        var26 = var24 - var22;
                    } else {
                        var26 = var22 - var24;
                    }
                    if (var26 >= var25) {
                        int var27 = var25 * 65536 / var26;
                        int var28 = 32768;
                        while (var22 != var24) {
                            if (var24 > var22) {
                                var22++;
                            } else if (var22 > var24) {
                                var22--;
                            }
                            if ((class233.field4007[class189.field3261][var21][var22] & 0x4) != 0) {
                                var19 = true;
                                class212.method1430(var22, class75.field1463, var21, true, 1);
                                break;
                            }
                            var28 += var27;
                            if (var28 >= 65536) {
                                var28 -= 65536;
                                if (var23 > var21) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class233.field4007[class189.field3261][var21][var22] & 0x4) != 0) {
                                    class212.method1430(var22, class75.field1463, var21, true, 1);
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        int var29 = var26 * 65536 / var25;
                        int var30 = 32768;
                        while (var21 != var23) {
                            if (var21 < var23) {
                                var21++;
                            } else if (var21 > var23) {
                                var21--;
                            }
                            if ((class233.field4007[class189.field3261][var21][var22] & 0x4) != 0) {
                                class212.method1430(var22, class75.field1463, var21, true, 1);
                                var19 = true;
                                break;
                            }
                            var30 += var29;
                            if (var30 >= 65536) {
                                if (var22 < var24) {
                                    var22++;
                                } else if (var22 > var24) {
                                    var22--;
                                }
                                var30 -= 65536;
                                if ((class233.field4007[class189.field3261][var21][var22] & 0x4) != 0) {
                                    class212.method1430(var22, class75.field1463, var21, true, 1);
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                int var31 = class109.method803(class189.field3261, class231.field3885, (byte) 123, class255.field4366);
                if (var31 - class55.field1171 < 800 && (class233.field4007[class189.field3261][class255.field4366 >> 7][class231.field3885 >> 7] & 0x4) != 0) {
                    var19 = true;
                    class212.method1430(class231.field3885 >> 7, class75.field1463, class255.field4366 >> 7, true, 1);
                }
            }
        }
        class23.method187(arg2, arg1, arg2 + arg5, arg1 + arg3);
        class101.method739();
        int var32 = class245.field4253;
        if (arg0 > -99) {
            field4259 = true;
        }
        int var33 = class102.field1904;
        if (arg2 <= var32 && arg2 + arg5 > var32 && var33 >= arg1 && (arg1 + arg3) > var33) {
            class216.field3665 = 0;
            int var34 = class213.field3642;
            int var35 = class238.field4086;
            class159.field2789 = (class245.field4253 - arg2) * (var34 - var35) / arg5 + var35;
            class52.field1132 = true;
            int var36 = class151.field2594;
            int var37 = class228.field3834;
            class248.field4294 = (class102.field1904 - arg1) * (var37 - var36) / arg3 + var36;
        } else {
            class52.field1132 = false;
            class216.field3665 = 0;
        }
        class39.method319((byte) 64);
        class23.method198(arg2, arg1, arg5, arg3, 0);
        if (var19) {
            class173.method1177(class255.field4366, class55.field1171, class231.field3885, class173.field2956, class248.field4276, var14, class199.field3411, class131.field2341, class92.field1752, class242.field4193, class42.field846, class33.field648, class189.field3261 + 1, (byte) class15.field328, class137.field2441.field4177 >> 7, class137.field2441.field4143 >> 7);
        } else {
            class173.method1177(class255.field4366, class55.field1171, class231.field3885, class173.field2956, class248.field4276, var14, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 0, (byte) 0, class137.field2441.field4177 >> 7, class137.field2441.field4143 >> 7);
        }
        class39.method319((byte) 82);
        class189.method1271();
        class39.method322(arg1, 256, 256, (byte) 123, arg5, arg3, arg2);
        class248.method1625(arg1, 256, 256, arg2, arg5, 147734087, arg3);
        ((class5) class101.field1870).method102(class171.field2935, 121);
        class129.method899(arg1, arg5, (byte) -115, arg3, arg2);
        class231.field3885 = var9;
        class248.field4276 = var12;
        class55.field1171 = var8;
        class173.field2956 = var11;
        class255.field4366 = var10;
        if (class179.field3094 && class5.method92((byte) 61, false, true) == 0) {
            class179.field3094 = false;
        }
        if (class179.field3094) {
            class23.method198(arg2, arg1, arg5, arg3, 0);
            class10.method121(class20.field415, (byte) 50, false);
        }
        if (!arg4 && !class179.field3094 && !class216.field3663 && arg2 <= var32 && var32 < arg2 + arg5 && arg1 <= var33 && var33 < (arg1 + arg3)) {
            class128.method890(arg2, arg5, arg1, var32, var33, arg3, 20);
        }
    }
}
