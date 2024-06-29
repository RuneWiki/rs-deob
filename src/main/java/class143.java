import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class143 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    private int field2440;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[[I")
    private int[][] field2447;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    private int field2443;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lhi;")
    public static class82 field2438 = class95.method664((byte) -127, "null");

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "S")
    public static short field2441 = 256;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lhi;")
    public static class82 field2437 = class95.method664((byte) -94, "::wm1");

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[S")
    public static short[] field2448 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lhi;")
    public static class82 field2450 = class95.method664((byte) -33, "cookieprefix");

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lhi;")
    public static class82 field2442;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 13)
    public final int method968(int arg0, int arg1) {
        field2446++;
        if (this.field2447 != null) {
            arg0 = (int) ((long) this.field2440 * (long) arg0 / (long) this.field2443) + 6;
        }
        return arg1 >= -98 ? 59 : arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BZ)V", line = 33)
    public static final void method969(byte arg0, boolean arg1) {
        class314.field5417 = (byte[][][]) null;
        class308.field5244 = (int[][][]) null;
        class262.field4474 = (short[][][]) null;
        class44.field767 = (byte[][][]) null;
        field2449++;
        class218.field3781 = (byte[][][]) null;
        class202.field3482 = (byte[][][]) null;
        class53.field848 = null;
        class293.field4917 = null;
        class245.field4257 = 0;
        class283.field4756 = (byte[][][]) null;
        class161.field2815 = (int[][][]) null;
        if (arg1 && class47.field781 != null) {
            class209.field3670 = class47.field781.field1955;
        } else {
            class209.field3670 = null;
        }
        class47.field781 = null;
        class241.field4174.method1938(71);
        class284.field4763 = null;
        class192.field3249 = null;
        class208.field3643 = null;
        int var2 = 78 / ((-arg0 - 49) / 42);
        class127.field2234 = null;
        class297.field5057 = null;
        class224.field3889 = null;
        class275.field4624 = null;
        class259.field4434 = null;
        class135.field2329 = null;
        class310.field5305 = null;
        class152.field2571 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BI)[B", line = 72)
    public final byte[] method970(byte[] arg0, int arg1) {
        if (arg1 != 4) {
            return (byte[]) null;
        }
        if (this.field2447 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2440 / (long) this.field2443) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field2447[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var6[var4 + var10] += var9[var10] * var8;
                }
                int var11 = this.field2440 + var5;
                int var12 = var11 / this.field2443;
                var4 += var12;
                var5 = var11 - this.field2443 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var6[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        field2439++;
        return arg0;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)I", line = 141)
    public final int method971(int arg0, int arg1) {
        field2444++;
        if (this.field2447 != null) {
            arg1 = (int) ((long) this.field2440 * (long) arg1 / (long) this.field2443);
        }
        return arg0 == -14277 ? arg1 : -84;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIBIIII)V", line = 156)
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field2445++;
        int var11 = arg10 - arg8;
        if (arg10 < class244.field4242) {
            var11++;
        }
        int var12 = arg3 - arg2;
        if (arg3 < class157.field2719) {
            var12++;
        }
        if (arg6 >= -39) {
            field2437 = (class82) null;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg5 + ((var13 + 1) * arg4) >> 16;
            int var15 = arg4 * var13 + arg5 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg8 + var13 >> 6;
                if (var17 >= 0 && (class161.field2815.length - 1) >= var17) {
                    int var18 = arg9 + var14;
                    int var19 = arg9 + var15;
                    int[][] var20 = class161.field2815[var17];
                    byte[][] var21 = class202.field3482[var17];
                    byte[][] var22 = class283.field4756[var17];
                    byte[][] var23 = class314.field5417[var17];
                    byte[][] var24 = class44.field767[var17];
                    byte[][] var25 = class218.field3781[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg1 + (arg7 * var26) >> 16;
                        int var28 = (var26 + 1) * arg7 + arg1 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg0 + var28;
                            int var31 = arg0 + var27;
                            int var32 = var26 + arg2 & 0x3F;
                            int var33 = var13 + arg8 & 0x3F;
                            int var34 = (var32 << 6) + var33;
                            int var35 = arg2 + var26 >> 6;
                            int var36;
                            if (var35 < 0 || var20.length - 1 < var35 || var20[var35] == null) {
                                if (class47.field781.field1946 != -1) {
                                    var36 = class47.field781.field1946;
                                } else if ((arg2 + var26 & 0x4) == (arg8 + var13 & 0x4)) {
                                    var36 = class53.field848[class63.field981 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var35 < 0 || var20.length - 1 < var35) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class320.method2217(var19, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var35][var34];
                            }
                            int var37 = var22[var35] == null ? 0 : class53.field848[var22[var35][var34] & 0xFF];
                            int var38 = var21[var35] == null ? 0 : class53.field848[var21[var35][var34] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            if (var38 == 0 && var37 == 0) {
                                class320.method2217(var19, var31, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var39 = var25[var35] == null ? 0 : var25[var35][var34];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class320.method2217(var19, var31, var16, var29, var38);
                                    } else {
                                        class202.method1418(true, var29, class320.field5531, var16, -58, var38, var31, var19, var40 >> 2, var36, var39 & 0x3);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var24[var35][var34];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class320.method2217(var19, var31, var16, var29, var37);
                                    }
                                    class202.method1418(var38 == 0, var29, class320.field5531, var16, -116, var37, var31, var19, var42 >> 2, 0, var41 & 0x3);
                                }
                            }
                            if (var23[var35] != null) {
                                int var43 = var23[var35][var34] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var19;
                                    } else {
                                        var44 = var18 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var31;
                                    } else {
                                        var45 = var30 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class320.method2211(var19, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class320.method2206(var19, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class320.method2211(var44, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class320.method2206(var19, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class320.method2211(var19, var31, var29, 16777215);
                                        class320.method2206(var19, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class320.method2211(var44, var31, var29, 16777215);
                                        class320.method2206(var19, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class320.method2211(var44, var31, var29, 16777215);
                                        class320.method2206(var19, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class320.method2211(var19, var31, var29, 16777215);
                                        class320.method2206(var19, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class320.method2206(var19, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class320.method2206(var44, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class320.method2206(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class320.method2206(var19, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class320.method2206(var19 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class320.method2206(var19 + var48, var31 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg9 + var14;
                    int var50 = arg9 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class47.field781.field1946 != -1) {
                            var52 = class47.field781.field1946;
                        } else if ((arg2 + var51 & 0x4) == (arg8 + var13 & 0x4)) {
                            var52 = class53.field848[class63.field981 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = ((var51 + 1) * arg7 + arg1 >> 16) + arg0;
                        int var54 = (arg1 + (arg7 * var51) >> 16) + arg0;
                        int var55 = var53 - var54;
                        class320.method2217(var50, var54, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg5 + ((var56 + 1) * arg4) >> 16;
            int var58 = arg4 * var56 + arg5 >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                int var60 = arg9 + var58;
                int var61 = arg8 + var56 >> 6;
                var10000 = arg9 + var57;
                if (var61 >= 0 && (class262.field4474.length - 1) >= var61) {
                    short[][] var63 = class262.field4474[var61];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg1 + ((var64 + 1) * arg7) >> 16;
                        int var66 = arg1 + (arg7 * var64) >> 16;
                        int var67 = var65 - var66;
                        if (var67 > 0) {
                            int var68 = arg0 + var66;
                            int var69 = arg2 + var64 >> 6;
                            var10000 = arg0 + var65;
                            if (var69 >= 0 && var63.length - 1 >= var69) {
                                int var71 = ((arg2 + var64 & 0x3F) << 6) + (arg8 + var56 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = (var63[var69][var71] & 0xFE12) >> 14;
                                    int var73 = var63[var69][var71] & 0x3FFF;
                                    if (var73 != 0) {
                                        if (var72 == 0) {
                                            int var74 = class309.field5271[var73 - 1].field3715 * var59 / 4;
                                            int var75 = class309.field5271[var73 - 1].field3721 * var67 / 4;
                                            if (var74 != 0 && var75 != 0) {
                                                int var76 = class309.field5271[var73 - 1].field3718 * var67 / 4;
                                                class309.field5271[var73 - 1].method1279(var60, var68 - var76, var74, var75);
                                            }
                                        } else if (var72 == 1) {
                                            int var83 = class180.field3076[var73 - 1].field3721 * var67 / 4;
                                            int var84 = class180.field3076[var73 - 1].field3715 * var59 / 4;
                                            if (var84 != 0 && var83 != 0) {
                                                int var85 = class180.field3076[var73 - 1].field3718 * var67 / 4;
                                                class180.field3076[var73 - 1].method1279(var60, var68 - var85, var84, var83);
                                            }
                                        } else if (var72 == 2) {
                                            int var80 = class307.field5226[var73 - 1].field3721 * var67 / 4;
                                            int var81 = class307.field5226[var73 - 1].field3715 * var59 / 4;
                                            if (var81 != 0 && var80 != 0) {
                                                int var82 = class307.field5226[var73 - 1].field3718 * var67 / 4;
                                                class307.field5226[var73 - 1].method1279(var60, var68 - var82, var81, var80);
                                            }
                                        } else if (var72 == 3) {
                                            int var77 = class50.field815[var73 - 1].field3721 * var67 / 4;
                                            int var78 = class50.field815[var73 - 1].field3715 * var59 / 4;
                                            if (var78 != 0 && var77 != 0) {
                                                int var79 = class50.field815[var73 - 1].field3718 * var67 / 4;
                                                class50.field815[var73 - 1].method1279(var60, var68 - var79, var78, var77);
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
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIILme;)V", line = 596)
    public static final void method973(int arg0, int arg1, int arg2, int arg3, class75 arg4) {
        field2451++;
        class283.method1968(58);
        if (class147.field2485) {
            class116.method789(arg0, arg3, arg0 + arg4.field1216, arg4.field1205 + arg3);
        } else {
            class320.method2220(arg0, arg3, arg4.field1216 + arg0, arg4.field1205 + arg3);
        }
        if (class92.field1647 != 2 && class92.field1647 != 5 && class54.field870 != null) {
            int var5 = class168.field2932.field1685 / 32 + 48;
            int var6 = class62.field970 + class219.field3804 & 0x7FF;
            int var7 = 464 - class168.field2932.field1689 / 32;
            if (class147.field2485) {
                ((class210) class54.field870).method1512(arg0, arg3, arg4.field1216, arg4.field1205, var5, var7, var6, class5.field41 + 256, (class210) arg4.method469(false, 2));
            } else {
                ((class303) class54.field870).method1038(arg0, arg3, arg4.field1216, arg4.field1205, var5, var7, var6, class5.field41 + 256, arg4.field1223, arg4.field1292);
            }
            if (class32.field473 != null) {
                for (int var8 = 0; var8 < class32.field473.field4312; var8++) {
                    if (class32.field473.method1797(var8, (byte) 74)) {
                        int var9 = (class32.field473.field4317[var8] - class230.field3976) * 4 + 2 - (class168.field2932.field1685 / 32);
                        int var10 = (class32.field473.field4304[var8] - class226.field3916) * 4 - (class168.field2932.field1689 / 32 - 2);
                        int var11 = class102.field1813[var6];
                        int var12 = var11 * 256 / (class5.field41 + 256);
                        int var13 = class102.field1819[var6];
                        int var14 = var13 * 256 / (class5.field41 + 256);
                        int var15 = var10 * var12 + (var9 * var14) >> 16;
                        int var16 = var10 * var14 - (var9 * var12) >> 16;
                        class18 var17 = class21.field283;
                        if (class32.field473.method1798(var8, 33) == 1) {
                            var17 = class138.field2364;
                        }
                        if (class32.field473.method1798(var8, 33) == 2) {
                            var17 = class253.field4354;
                        }
                        int var18 = var17.method107(class32.field473.field4308[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg4.field1216 <= var19 && arg4.field1216 >= var19 && -arg4.field1205 <= var16 && arg4.field1205 >= var16) {
                            int var20 = 16777215;
                            if (class32.field473.field4306[var8] != -1) {
                                var20 = class32.field473.field4306[var8];
                            }
                            if (class147.field2485) {
                                class116.method788((class210) arg4.method469(false, arg1 ^ 0xFFFFFB49));
                            } else {
                                class320.method2201(arg4.field1223, arg4.field1292);
                            }
                            var17.method114(class32.field473.field4308[var8], arg4.field1216 / 2 + arg0 + var19, arg3 - -(arg4.field1205 / 2) + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class147.field2485) {
                                class116.method782();
                            } else {
                                class320.method2200();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class236.field4102; var21++) {
                int var22 = class140.field2397[var21] * 4 + 2 - (class168.field2932.field1685 / 32);
                int var23 = class62.field969[var21] * 4 + 2 - (class168.field2932.field1689 / 32);
                class157 var24 = class99.method682(class231.field3981[var21], (byte) -114);
                if (var24.field2688 != null) {
                    var24 = var24.method1119((byte) 118);
                    if (var24 == null || var24.field2689 == -1) {
                        continue;
                    }
                }
                class32.method251(var22, arg4, var23, arg0, -15639, class60.field949[var24.field2689], arg3);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class277 var27 = class107.field1889[class297.field5058][var25][var26];
                    if (var27 != null) {
                        int var28 = var26 * 4 + 2 - (class168.field2932.field1689 / 32);
                        int var29 = var25 * 4 + 2 - (class168.field2932.field1685 / 32);
                        class32.method251(var29, arg4, var28, arg0, -15639, class42.field745[0], arg3);
                    }
                }
            }
            for (int var30 = 0; var30 < class25.field333; var30++) {
                class275 var31 = class99.field1777[class43.field749[var30]];
                if (var31 != null && var31.method516(0)) {
                    class233 var32 = var31.field4628;
                    if (var32 != null && var32.field4063 != null) {
                        var32 = var32.method1652(false);
                    }
                    if (var32 != null && var32.field4029 && var32.field4071) {
                        int var33 = var31.field1689 / 32 - (class168.field2932.field1689 / 32);
                        int var34 = var31.field1685 / 32 - (class168.field2932.field1685 / 32);
                        if (var32.field4046 == -1) {
                            class32.method251(var34, arg4, var33, arg0, -15639, class42.field745[1], arg3);
                        } else {
                            class32.method251(var34, arg4, var33, arg0, arg1 ^ 0x39A2, class60.field949[var32.field4046], arg3);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class297.field5054; var35++) {
                class81 var36 = class29.field405[class310.field5292[var35]];
                if (var36 != null && var36.method516(0)) {
                    boolean var37 = false;
                    int var38 = var36.field1685 / 32 - (class168.field2932.field1685 / 32);
                    int var39 = var36.field1689 / 32 - class168.field2932.field1689 / 32;
                    long var40 = var36.field1409.method568(22476);
                    for (int var42 = 0; var42 < class90.field1632; var42++) {
                        if (class107.field1903[var42] == var40 && class139.field2386[var42] != 0) {
                            var37 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class80.field1363; var44++) {
                        if (class157.field2662[var44].field2418 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class168.field2932.field1403 != 0 && var36.field1403 != 0 && class168.field2932.field1403 == var36.field1403) {
                        var45 = true;
                    }
                    if (var37) {
                        class32.method251(var38, arg4, var39, arg0, -15639, class42.field745[3], arg3);
                    } else if (var43) {
                        class32.method251(var38, arg4, var39, arg0, -15639, class42.field745[5], arg3);
                    } else if (var45) {
                        class32.method251(var38, arg4, var39, arg0, -15639, class42.field745[4], arg3);
                    } else {
                        class32.method251(var38, arg4, var39, arg0, -15639, class42.field745[2], arg3);
                    }
                }
            }
            class84[] var46 = class101.field1804;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class84 var48 = var46[var47];
                if (var48 != null && var48.field1506 != 0 && (class212.field3708 % 20) < 10) {
                    if (var48.field1506 == 1 && var48.field1494 >= 0 && class99.field1777.length > var48.field1494) {
                        class275 var49 = class99.field1777[var48.field1494];
                        if (var49 != null) {
                            int var50 = var49.field1685 / 32 - (class168.field2932.field1685 / 32);
                            int var51 = var49.field1689 / 32 - (class168.field2932.field1689 / 32);
                            class244.method1749(var51, arg4, var48.field1516, arg3, arg0, 360000, var50);
                        }
                    }
                    if (var48.field1506 == 2) {
                        int var52 = (var48.field1518 - class230.field3976) * 4 + 2 - class168.field2932.field1685 / 32;
                        int var53 = (var48.field1495 - class226.field3916) * 4 + 2 - (class168.field2932.field1689 / 32);
                        class244.method1749(var53, arg4, var48.field1516, arg3, arg0, arg1 ^ 0xFFFA850B, var52);
                    }
                    if (var48.field1506 == 10 && var48.field1494 >= 0 && class29.field405.length > var48.field1494) {
                        class81 var54 = class29.field405[var48.field1494];
                        if (var54 != null) {
                            int var55 = var54.field1685 / 32 - (class168.field2932.field1685 / 32);
                            int var56 = var54.field1689 / 32 - (class168.field2932.field1689 / 32);
                            class244.method1749(var56, arg4, var48.field1516, arg3, arg0, arg1 ^ 0xFFFA850B, var55);
                        }
                    }
                }
            }
            if (class111.field2008 != 0) {
                int var57 = class111.field2008 * 4 + 2 - class168.field2932.field1685 / 32;
                int var58 = class38.field634 * 4 + 2 - class168.field2932.field1689 / 32;
                class32.method251(var57, arg4, var58, arg0, -15639, class265.field4528, arg3);
            }
            if (class147.field2485) {
                class116.method784(arg0 + (arg4.field1216 / 2) - 1, arg3 - -(arg4.field1205 / 2) + -1, 3, 3, 16777215);
            } else {
                class320.method2217(arg0 + (arg4.field1216 / 2) - 1, arg4.field1205 / 2 + arg3 + -1, 3, 3, 16777215);
            }
        } else if (class147.field2485) {
            class86 var59 = arg4.method469(false, 2);
            if (var59 != null) {
                var59.method600(arg0, arg3);
            }
        } else {
            class320.method2209(arg0, arg3, 0, arg4.field1223, arg4.field1292);
        }
        class302.field5151[arg2] = true;
        if (arg1 != -1205) {
            method975(2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)I", line = 938)
    public static int method974(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 950)
    public static void method975(int arg0) {
        if (arg0 != -26365) {
            return;
        }
        field2450 = null;
        field2438 = null;
        field2437 = null;
        field2442 = null;
        field2448 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 964)
    public static final void method976(int arg0, int arg1, int arg2) {
        if (arg1 != 256) {
            field2437 = (class82) null;
        }
        field2453++;
        if (class113.method777((byte) -107, arg0)) {
            class3.method19(arg2, class277.field4660[arg0], (byte) 85);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZI)V", line = 980)
    public static final void method977(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        for (int var5 = 0; var5 < class254.field4381; var5++) {
            if ((class290.field4880[var5] + class191.field3214[var5]) > arg0 && class290.field4880[var5] < (arg0 + arg1) && arg4 < class25.field339[var5] + class117.field2058[var5] && class25.field339[var5] < (arg2 + arg4)) {
                class276.field4639[var5] = true;
            }
        }
        if (!arg3) {
            method972(39, -110, 78, -25, 56, 39, (byte) -43, -68, -11, 69, -26);
        }
        field2452++;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V", line = 999)
    public class143(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class233.method1651(arg0, 78, arg1);
            int var4 = arg1 / var3;
            this.field2440 = var4;
            int var5 = arg0 / var3;
            this.field2447 = new int[var5][14];
            this.field2443 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2447[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
