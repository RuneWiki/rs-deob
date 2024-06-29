import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class266 {

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Luf;")
    public static class168 field4476 = class148.method1019(-1720, "");

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Luf;")
    private static class168 field4483 = class148.method1019(-1720, "Connecting to update server");

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Luf;")
    public static class168 field4482 = field4483;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Ljk;")
    public static class76 field4478 = new class76();

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[Luf;")
    public static class168[] field4487 = new class168[1000];

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field4493 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Loe;")
    public static class54 field4489;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 8)
    public static final void method1848(int arg0, int arg1, int arg2) {
        field4479++;
        class73 var3 = class198.method1394(109, arg2);
        int var4 = var3.field981;
        int var5 = var3.field982;
        int var6 = var3.field983;
        int var7 = class240.field3894[var4 - var5];
        if (arg0 < ~arg1 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class215.method1489(var6, class122.field1891[var6] & ~var8 | var8 & arg1 << var5, 69);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 35)
    public static void method1849(int arg0) {
        field4482 = null;
        field4478 = null;
        field4489 = null;
        field4476 = null;
        if (arg0 <= 100) {
            field4483 = (class168) null;
        }
        field4483 = null;
        field4487 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILuf;Luf;I)V", line = 50)
    public static final void method1850(int arg0, class168 arg1, class168 arg2, int arg3) {
        class40.method223((class168) null, -1, arg1, arg0, (byte) -118, arg2);
        int var4 = -87 / ((21 - arg3) / 32);
        field4490++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V", line = 68)
    public static final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4474++;
        class245.method1687(95, arg4);
        int var7 = arg4;
        int var8 = arg4 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = 0;
        int var10 = var8;
        int var11 = -arg4;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class9.field112 <= arg3 && class44.field538 >= arg3) {
            int[] var15 = class284.field4810[arg3];
            int var16 = class54.method301(class65.field874, arg5 - arg4, class150.field2331, 123);
            int var17 = class54.method301(class65.field874, arg4 + arg5, class150.field2331, -91);
            int var18 = class54.method301(class65.field874, arg5 - var8, class150.field2331, -38);
            int var19 = class54.method301(class65.field874, arg5 + var8, class150.field2331, -74);
            class133.method925(14678, var16, arg2, var18, var15);
            class133.method925(14678, var18, arg0, var19, var15);
            class133.method925(14678, var19, arg2, var17, var15);
        }
        if (arg6 <= 107) {
            method1849(11);
        }
        while (var7 > var9) {
            var14 += 2;
            var13 += 2;
            var11 += var13;
            var12 += var14;
            if (var12 >= 0 && var10 >= 1) {
                var10--;
                var12 -= var10 << 1;
                class271.field4562[var10] = var9;
            }
            var9++;
            if (var11 >= 0) {
                var7--;
                int var20 = arg3 + var7;
                var11 -= var7 << 1;
                int var21 = arg3 - var7;
                if (class9.field112 <= var20 && class44.field538 >= var21) {
                    if (var7 >= var8) {
                        int var22 = class54.method301(class65.field874, arg5 + var9, class150.field2331, -59);
                        int var23 = class54.method301(class65.field874, arg5 - var9, class150.field2331, -70);
                        if (class44.field538 >= var20) {
                            class133.method925(14678, var23, arg2, var22, class284.field4810[var20]);
                        }
                        if (var21 >= class9.field112) {
                            class133.method925(14678, var23, arg2, var22, class284.field4810[var21]);
                        }
                    } else {
                        int var24 = class271.field4562[var7];
                        int var25 = class54.method301(class65.field874, arg5 + var9, class150.field2331, 92);
                        int var26 = class54.method301(class65.field874, arg5 - var9, class150.field2331, 87);
                        int var27 = class54.method301(class65.field874, arg5 + var24, class150.field2331, -128);
                        int var28 = class54.method301(class65.field874, arg5 - var24, class150.field2331, 113);
                        if (var20 <= class44.field538) {
                            int[] var29 = class284.field4810[var20];
                            class133.method925(14678, var26, arg2, var28, var29);
                            class133.method925(14678, var28, arg0, var27, var29);
                            class133.method925(14678, var27, arg2, var25, var29);
                        }
                        if (var21 >= class9.field112) {
                            int[] var30 = class284.field4810[var21];
                            class133.method925(14678, var26, arg2, var28, var30);
                            class133.method925(14678, var28, arg0, var27, var30);
                            class133.method925(14678, var27, arg2, var25, var30);
                        }
                    }
                }
            }
            int var31 = arg3 - var9;
            int var32 = arg3 + var9;
            if (class9.field112 <= var32 && var31 <= class44.field538) {
                int var33 = arg5 + var7;
                int var34 = arg5 - var7;
                if (var33 >= class150.field2331 && var34 <= class65.field874) {
                    int var35 = class54.method301(class65.field874, var33, class150.field2331, -124);
                    int var36 = class54.method301(class65.field874, var34, class150.field2331, 126);
                    if (var9 < var8) {
                        int var37 = var10 >= var9 ? var10 : class271.field4562[var9];
                        int var38 = class54.method301(class65.field874, arg5 + var37, class150.field2331, 76);
                        int var39 = class54.method301(class65.field874, arg5 - var37, class150.field2331, -50);
                        if (class44.field538 >= var32) {
                            int[] var40 = class284.field4810[var32];
                            class133.method925(14678, var36, arg2, var39, var40);
                            class133.method925(14678, var39, arg0, var38, var40);
                            class133.method925(14678, var38, arg2, var35, var40);
                        }
                        if (class9.field112 <= var31) {
                            int[] var41 = class284.field4810[var31];
                            class133.method925(14678, var36, arg2, var39, var41);
                            class133.method925(14678, var39, arg0, var38, var41);
                            class133.method925(14678, var38, arg2, var35, var41);
                        }
                    } else {
                        if (class44.field538 >= var32) {
                            class133.method925(14678, var36, arg2, var35, class284.field4810[var32]);
                        }
                        if (var31 >= class9.field112) {
                            class133.method925(14678, var36, arg2, var35, class284.field4810[var31]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLtb;)V", line = 261)
    public static final void method1852(byte arg0, class189 arg1) {
        arg1.field3010 = false;
        field4480++;
        if (arg1.field3045 != -1) {
            class190 var2 = class119.method858(true, arg1.field3045);
            if (var2 == null || var2.field3063 == null) {
                arg1.field3045 = -1;
            } else {
                arg1.field3057++;
                if (var2.field3063.length > arg1.field3053 && var2.field3075[arg1.field3053] < arg1.field3057) {
                    arg1.field3053++;
                    arg1.field3057 = 1;
                    class27.method142(var2, (byte) -119, arg1.field3027, arg1.field3053, arg1.field3021, field4489 == arg1);
                }
                if (var2.field3063.length <= arg1.field3053) {
                    arg1.field3057 = 0;
                    arg1.field3053 = 0;
                    class27.method142(var2, (byte) -119, arg1.field3027, arg1.field3053, arg1.field3021, field4489 == arg1);
                }
            }
        }
        if (arg1.field3026 != -1 && class203.field3335 >= arg1.field3022) {
            int var3 = class270.method1873(arg1.field3026, false).field48;
            if (var3 == -1) {
                arg1.field3026 = -1;
            } else {
                class190 var4 = class119.method858(true, var3);
                if (var4 == null || var4.field3063 == null) {
                    arg1.field3026 = -1;
                } else {
                    if (arg1.field3042 < 0) {
                        arg1.field3042 = 0;
                        class27.method142(var4, (byte) -119, arg1.field3027, 0, arg1.field3021, field4489 == arg1);
                    }
                    arg1.field2989++;
                    if (arg1.field3042 < var4.field3063.length && var4.field3075[arg1.field3042] < arg1.field2989) {
                        arg1.field3042++;
                        arg1.field2989 = 1;
                        class27.method142(var4, (byte) -119, arg1.field3027, arg1.field3042, arg1.field3021, field4489 == arg1);
                    }
                    if (var4.field3063.length <= arg1.field3042) {
                        arg1.field3026 = -1;
                    }
                }
            }
        }
        if (arg1.field3044 != -1 && arg1.field3005 <= 1) {
            class190 var5 = class119.method858(true, arg1.field3044);
            if (var5.field3095 == 1 && arg1.field3043 > 0 && class203.field3335 >= arg1.field3036 && arg1.field2990 < class203.field3335) {
                arg1.field3005 = 1;
                return;
            }
        }
        if (arg1.field3044 != -1 && arg1.field3005 == 0) {
            class190 var6 = class119.method858(true, arg1.field3044);
            if (var6 == null || var6.field3063 == null) {
                arg1.field3044 = -1;
            } else {
                arg1.field3054++;
                if (arg1.field3009 < var6.field3063.length && var6.field3075[arg1.field3009] < arg1.field3054) {
                    arg1.field3009++;
                    arg1.field3054 = 1;
                    class27.method142(var6, (byte) -119, arg1.field3027, arg1.field3009, arg1.field3021, field4489 == arg1);
                }
                if (arg1.field3009 >= var6.field3063.length) {
                    arg1.field3041++;
                    arg1.field3009 -= var6.field3074;
                    if (var6.field3083 <= arg1.field3041) {
                        arg1.field3044 = -1;
                    } else if (arg1.field3009 >= 0 && arg1.field3009 < var6.field3063.length) {
                        class27.method142(var6, (byte) -119, arg1.field3027, arg1.field3009, arg1.field3021, field4489 == arg1);
                    } else {
                        arg1.field3044 = -1;
                    }
                }
                arg1.field3010 = var6.field3078;
            }
        }
        if (arg1.field3005 > 0) {
            arg1.field3005--;
        }
        if (arg0 != 126) {
            method1850(-41, (class168) null, (class168) null, 16);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZIIIIIIII)V", line = 398)
    public static final void method1853(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4481++;
        int var11 = arg10 - arg4;
        int var12 = arg1 - arg9;
        if (arg2) {
            field4489 = (class54) null;
        }
        if (class140.field2161 > arg10) {
            var11++;
        }
        if (arg1 < class172.field2801) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg0 + ((var13 + 1) * arg6) >> 16;
            int var15 = arg6 * var13 + arg0 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg4 + var13 >> 6;
                if (var17 >= 0 && var17 <= class177.field2867.length - 1) {
                    int var18 = arg3 + var15;
                    byte[][] var19 = class125.field1931[var17];
                    byte[][] var20 = class5.field66[var17];
                    int[][] var21 = class177.field2867[var17];
                    byte[][] var22 = class249.field4254[var17];
                    int var23 = arg3 + var14;
                    byte[][] var24 = class209.field3459[var17];
                    byte[][] var25 = class200.field3299[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = (var26 + 1) * arg8 + arg5 >> 16;
                        int var28 = arg5 + (arg8 * var26) >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg7 + var27;
                            int var31 = arg7 + var28;
                            int var32 = arg9 + var26 >> 6;
                            int var33 = arg9 + var26 & 0x3F;
                            int var34 = arg4 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || (var21.length - 1) < var32 || var21[var32] == null) {
                                if (class207.field3401.field2837 != -1) {
                                    var36 = class207.field3401.field2837;
                                } else if ((arg4 + var13 & 0x4) == (arg9 + var26 & 0x4)) {
                                    var36 = class115.field1790[class199.field3287 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var21.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class277.method1911(var18, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var21[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var19[var32] == null ? 0 : class115.field1790[var19[var32][var35] & 0xFF];
                            int var38 = var20[var32] == null ? 0 : class115.field1790[var20[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class277.method1911(var18, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var32] == null ? 0 : var22[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class277.method1911(var18, var31, var16, var29, var37);
                                    } else {
                                        class70.method395(var18, var16, var31, true, var36, var40 >> 2, var39 & 0x3, class277.field4657, -113, var37, var29);
                                    }
                                }
                                if (var38 != 0) {
                                    byte var41 = var24[var32][var35];
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class277.method1911(var18, var31, var16, var29, var38);
                                    }
                                    class70.method395(var18, var16, var31, var37 == 0, 0, var42 >> 2, var41 & 0x3, class277.field4657, -71, var38, var29);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var31;
                                    } else {
                                        var44 = var30 - 1;
                                    }
                                    int var45;
                                    if (var16 == 1) {
                                        var45 = var18;
                                    } else {
                                        var45 = var23 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class277.method1909(var18, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class277.method1906(var18, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class277.method1909(var45, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class277.method1906(var18, var44, var16, var46);
                                    } else if (var43 == 9) {
                                        class277.method1909(var18, var31, var29, 16777215);
                                        class277.method1906(var18, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class277.method1909(var45, var31, var29, 16777215);
                                        class277.method1906(var18, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class277.method1909(var45, var31, var29, 16777215);
                                        class277.method1906(var18, var44, var16, var46);
                                    } else if (var43 == 12) {
                                        class277.method1909(var18, var31, var29, 16777215);
                                        class277.method1906(var18, var44, var16, var46);
                                    } else if (var43 == 17) {
                                        class277.method1906(var18, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class277.method1906(var45, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class277.method1906(var45, var44, 1, var46);
                                    } else if (var43 == 20) {
                                        class277.method1906(var18, var44, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class277.method1906(var18 + var47, -var47 + var44, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class277.method1906(var18 + var48, var31 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg3 + var14;
                    int var50 = arg3 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52 = (arg8 * var51 + arg5 >> 16) + arg7;
                        int var53;
                        if (class207.field3401.field2837 != -1) {
                            var53 = class207.field3401.field2837;
                        } else if ((var51 + arg9 & 0x4) == (arg4 + var13 & 0x4)) {
                            var53 = class115.field1790[class199.field3287 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        int var54 = ((var51 + 1) * arg8 + arg5 >> 16) + arg7;
                        int var55 = var54 - var52;
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        class277.method1911(var50, var52, var16, var55, var53);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg0 + ((var56 + 1) * arg6) >> 16;
            int var58 = arg0 + (arg6 * var56) >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                int var60 = arg4 + var56 >> 6;
                var10000 = arg3 + var57;
                int var62 = arg3 + var58;
                if (var60 >= 0 && var60 <= class207.field3400.length - 1) {
                    short[][] var63 = class207.field3400[var60];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = (var64 + 1) * arg8 + arg5 >> 16;
                        int var66 = arg8 * var64 + arg5 >> 16;
                        int var67 = var65 - var66;
                        if (var67 > 0) {
                            var10000 = arg7 + var65;
                            int var69 = arg7 + var66;
                            int var70 = var64 + arg9 >> 6;
                            if (var70 >= 0 && var63.length - 1 >= var70) {
                                int var71 = ((var64 + arg9 & 0x3F) << 6) + (arg4 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = var63[var70][var71] >> 14 & 0x3;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            class139.field2147[var72 - 1].method1839(var62, var69, var59 * 2, var67 * 2);
                                        } else if (var73 == 1) {
                                            class22.field277[var72 - 1].method1839(var62, var69, var59 * 2, var67 * 2);
                                        } else if (var73 == 2) {
                                            class195.field3163[var72 - 1].method1839(var62, var69, var59 * 2, var67 * 2);
                                        } else if (var73 == 3) {
                                            class78.field1084[var72 - 1].method1839(var62, var69, var59 * 2, var67 * 2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZJ)V", line = 787)
    public static final void method1854(boolean arg0, long arg1) {
        field4477++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (!arg0) {
            return;
        }
        while (var3 < class107.field1642) {
            if (class61.field793[var3] == arg1) {
                class263.field4458++;
                class107.field1642--;
                for (int var4 = var3; var4 < class107.field1642; var4++) {
                    class142.field2192[var4] = class142.field2192[var4 + 1];
                    class237.field3782[var4] = class237.field3782[var4 + 1];
                    class15.field162[var4] = class15.field162[var4 + 1];
                    class61.field793[var4] = class61.field793[var4 + 1];
                    class22.field274[var4] = class22.field274[var4 + 1];
                    class27.field335[var4] = class27.field335[var4 + 1];
                }
                class285.field4828 = class9.field116;
                class249.field4262.method726(111, 2138389379);
                class249.field4262.method1053(arg1, 11247);
                break;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 845)
    public class266() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lod;)V", line = 851)
    public class266(class266 arg0) {
        this.field4485 = arg0.field4485;
        this.field4486 = arg0.field4486;
        this.field4475 = arg0.field4475;
        this.field4488 = arg0.field4488;
    }
}
