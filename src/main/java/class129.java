import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class129 extends class203 {

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    private final int field2281;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    private final int field2285;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    private final int field2274;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    private final int field2292;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    private final int field2288;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    private final int field2286;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    private final int field2280;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    private final int field2273;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Lvh;")
    public static class43 field2278 = null;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2284 = new CRC32();

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "[I")
    public static int[] field2291 = new int[200];

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field2295 = 2301979;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "Llc;")
    public static class143 field2293 = class66.method374("Suche nach Updates )2 ", -1);

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "Llc;")
    public static class143 field2296 = class66.method374("cross", -1);

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "F")
    public static float field2279;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static int method777(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lgf;IIZII)V")
    public static final void method778(class7 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class85.field1515 = 10000;
        class238.field4309 = arg1;
        class189.field3419 = arg3;
        class70.field1339 = arg5;
        class24.field416 = 1;
        ++field2277;
        class88.field1599 = arg4;
        class7.field121 = arg0;
        if (arg2 != 2627) {
            field2291 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        if (arg0 == -13349) {
            ++field2289;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2281 = arg5;
        this.field2285 = arg6;
        this.field2274 = arg0;
        this.field2292 = arg7;
        this.field2288 = arg2;
        this.field2286 = arg1;
        this.field2280 = arg4;
        this.field2273 = arg3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(JB)V")
    public static final void method779(long arg0, byte arg1) {
        ++field2275;
        if (~arg0 != -1L) {
            int var3 = 119 / ((-60 - arg1) / 44);
            for (int var4 = 0; class25.field421 > var4; ++var4) {
                if (class13.field251[var4] == arg0) {
                    --class25.field421;
                    ++class204.field3713;
                    for (int var5 = var4; ~class25.field421 < ~var5; ++var5) {
                        class237.field4305[var5] = class237.field4305[var5 + 1];
                        field2291[var5] = field2291[var5 + 1];
                        class255.field4594[var5] = class255.field4594[var5 + 1];
                        class13.field251[var5] = class13.field251[var5 + 1];
                        class188.field3397[var5] = class188.field3397[var5 + 1];
                        class269.field4818[var5] = class269.field4818[var5 + 1];
                    }
                    field2294 = class13.field249;
                    class285.field5010.method799(103, 136);
                    class285.field5010.method1243(arg0, 99);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Llc;")
    public static final class143 method780(int arg0, int arg1) {
        ++field2276;
        if (arg1 > 0 && ~arg1 >= -256) {
            class143 var2 = new class143();
            var2.field2503 = new byte[1];
            var2.field2548 = 1;
            if (arg0 != -256) {
                method780(-2, -82);
            }
            var2.field2503[0] = (byte) arg1;
            return var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIILlf;IIIIIIZ)V")
    public static final void method781(boolean arg0, int arg1, int arg2, class106 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        ++field2287;
        if (arg10 && !class21.method149((byte) -57) && (class231.field4225[0][arg5][arg1] & 2) == 0) {
            if ((class231.field4225[arg2][arg5][arg1] & 16) != 0) {
                return;
            }
            if (class71.method411(arg4 + 56267, arg1, arg5, arg2) != class225.field4075) {
                return;
            }
        }
        if (arg4 != -29969) {
            field2296 = null;
        }
        if (class287.field5041 > arg2) {
            class287.field5041 = arg2;
        }
        class209 var11 = class34.method232(167, arg6);
        int var12;
        int var13;
        if (arg8 != 1 && ~arg8 != -4) {
            var12 = var11.field3877;
            var13 = var11.field3836;
        } else {
            var13 = var11.field3877;
            var12 = var11.field3836;
        }
        int var14;
        int var15;
        if (~(arg5 + var12) < -105) {
            var14 = arg5;
            var15 = arg5 + 1;
        } else {
            var15 = (var12 + 1 >> 1) + arg5;
            var14 = (var12 >> 1) + arg5;
        }
        int var16;
        int var17;
        if (~(arg1 + var13) >= -105) {
            var16 = (var13 >> 1) + arg1;
            var17 = (var13 + 1 >> 1) + arg1;
        } else {
            var17 = arg1 + 1;
            var16 = arg1;
        }
        int[][] var18 = class192.field3535[arg9];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg5 << 7) + (var12 << 6);
        int var21 = (arg1 << 7) + (var13 << 6);
        long var22 = (long) (arg8 << 20 | arg7 << 14 | arg5 | arg1 << 7 | 1073741824);
        int[][] var24 = null;
        if (var11.field3835 == 0 || arg0) {
            var22 |= Long.MIN_VALUE;
        }
        if (!arg0) {
            if (~arg9 > -4) {
                var24 = class192.field3535[arg9 - -1];
            }
        } else {
            var24 = class273.field4861[0];
        }
        if (var11.field3859 == 1) {
            var22 |= 4194304L;
        }
        if (var11.field3883) {
            var22 |= 2147483648L;
        }
        long var25 = var22 | (long) arg6 << 32;
        if (var11.method1456(true)) {
            class266.method1772(var11, arg8, arg1, arg5, arg2, 128, (class32) null, (class187) null);
        }
        boolean var27 = var11.field3838 & !arg0;
        if (arg7 == 22) {
            if (class225.field4083 || var11.field3835 != 0 || ~var11.field3890 == -2 || var11.field3840) {
                class51 var29;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var28 = var11.method1462(22, arg8, var18, var24, var21, (class100) null, var20, 47, arg10, var27, var19);
                    var29 = var28.field4802;
                } else {
                    var29 = new class34(arg6, 22, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class61.method346(arg2, arg5, arg1, var19, var29, var25, var11.field3846);
                if (~var11.field3890 == -2 && arg3 != null) {
                    arg3.method640(arg5, 262144, arg1);
                }
            }
        } else if (arg7 != 10 && arg7 != 11) {
            if (~arg7 <= -13) {
                class51 var31;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var30 = var11.method1462(arg7, arg8, var18, var24, var21, (class100) null, var20, arg4 + 29865, arg10, var27, var19);
                    var31 = var30.field4802;
                } else {
                    var31 = new class34(arg6, arg7, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class166.method1090(arg2, arg5, arg1, var19, 1, 1, var31, 0, var25);
                if (arg10 && ~arg7 <= -13 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
                    class272.field4858[arg2][arg5][arg1] = class119.method729(class272.field4858[arg2][arg5][arg1], 4);
                }
                if (var11.field3890 != 0 && arg3 != null) {
                    arg3.method633(arg5, var12, var11.field3895, var13, arg1, arg4 ^ 20689);
                }
            } else if (~arg7 == -1) {
                class51 var33;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var32 = var11.method1462(0, arg8, var18, var24, var21, (class100) null, var20, arg4 ^ -29958, arg10, var27, var19);
                    var33 = var32.field4802;
                } else {
                    var33 = new class34(arg6, 0, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class135.method812(arg2, arg5, arg1, var19, var33, (class51) null, class97.field1775[arg8], 0, var25);
                if (arg10) {
                    if (arg8 == 0) {
                        if (var11.field3875) {
                            class137.field2405[arg2][arg5][arg1] = 50;
                            class137.field2405[arg2][arg5][arg1 + 1] = 50;
                        }
                        if (var11.field3871) {
                            class272.field4858[arg2][arg5][arg1] = class119.method729(class272.field4858[arg2][arg5][arg1], 1);
                        }
                    } else if (~arg8 != -2) {
                        if (arg8 != 2) {
                            if (~arg8 == -4) {
                                if (var11.field3875) {
                                    class137.field2405[arg2][arg5][arg1] = 50;
                                    class137.field2405[arg2][arg5 + 1][arg1] = 50;
                                }
                                if (var11.field3871) {
                                    class272.field4858[arg2][arg5][arg1] = class119.method729(class272.field4858[arg2][arg5][arg1], 2);
                                }
                            }
                        } else {
                            if (var11.field3875) {
                                class137.field2405[arg2][arg5 + 1][arg1] = 50;
                                class137.field2405[arg2][arg5 + 1][arg1 - -1] = 50;
                            }
                            if (var11.field3871) {
                                class272.field4858[arg2][arg5 - -1][arg1] = class119.method729(class272.field4858[arg2][arg5 - -1][arg1], 1);
                            }
                        }
                    } else {
                        if (var11.field3875) {
                            class137.field2405[arg2][arg5][arg1 + 1] = 50;
                            class137.field2405[arg2][arg5 - -1][arg1 + 1] = 50;
                        }
                        if (var11.field3871) {
                            class272.field4858[arg2][arg5][arg1 + 1] = class119.method729(class272.field4858[arg2][arg5][arg1 + 1], 2);
                        }
                    }
                }
                if (~var11.field3890 != -1 && arg3 != null) {
                    arg3.method641(arg8, arg7, true, arg5, arg1, var11.field3895);
                }
                if (var11.field3876 != 16) {
                    class65.method370(arg2, arg5, arg1, var11.field3876);
                }
            } else if (~arg7 == -2) {
                class51 var35;
                if (var11.field3898 == -1 && var11.field3868 == null && !var11.field3889) {
                    class268 var34 = var11.method1462(1, arg8, var18, var24, var21, (class100) null, var20, 108, arg10, var27, var19);
                    var35 = var34.field4802;
                } else {
                    var35 = new class34(arg6, 1, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class135.method812(arg2, arg5, arg1, var19, var35, (class51) null, class265.field4766[arg8], 0, var25);
                if (var11.field3875 && arg10) {
                    if (~arg8 == -1) {
                        class137.field2405[arg2][arg5][arg1 + 1] = 50;
                    } else if (arg8 != 1) {
                        if (arg8 != 2) {
                            if (~arg8 == -4) {
                                class137.field2405[arg2][arg5][arg1] = 50;
                            }
                        } else {
                            class137.field2405[arg2][arg5 - -1][arg1] = 50;
                        }
                    } else {
                        class137.field2405[arg2][arg5 + 1][arg1 + 1] = 50;
                    }
                }
                if (var11.field3890 != 0 && arg3 != null) {
                    arg3.method641(arg8, arg7, true, arg5, arg1, var11.field3895);
                }
            } else if (arg7 == 2) {
                int var36 = arg8 + 1 & 3;
                class51 var38;
                class51 var40;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var37 = var11.method1462(2, arg8 + 4, var18, var24, var21, (class100) null, var20, arg4 + 30040, arg10, var27, var19);
                    var38 = var37.field4802;
                    class268 var39 = var11.method1462(2, var36, var18, var24, var21, (class100) null, var20, 69, arg10, var27, var19);
                    var40 = var39.field4802;
                } else {
                    var38 = new class34(arg6, 2, arg8 + 4, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                    var40 = new class34(arg6, 2, var36, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class135.method812(arg2, arg5, arg1, var19, var38, var40, class97.field1775[arg8], class97.field1775[var36], var25);
                if (var11.field3871 && arg10) {
                    if (arg8 != 0) {
                        if (arg8 != 1) {
                            if (arg8 == 2) {
                                class272.field4858[arg2][arg5 + 1][arg1] = class119.method729(class272.field4858[arg2][arg5 + 1][arg1], 1);
                                class272.field4858[arg2][arg5][arg1] = class119.method729(class272.field4858[arg2][arg5][arg1], 2);
                            } else if (arg8 == 3) {
                                class272.field4858[arg2][arg5][arg1] = class119.method729(class272.field4858[arg2][arg5][arg1], 2);
                                class272.field4858[arg2][arg5][arg1] = class119.method729(class272.field4858[arg2][arg5][arg1], 1);
                            }
                        } else {
                            class272.field4858[arg2][arg5][arg1 - -1] = class119.method729(class272.field4858[arg2][arg5][arg1 - -1], 2);
                            class272.field4858[arg2][arg5 - -1][arg1] = class119.method729(class272.field4858[arg2][arg5 - -1][arg1], 1);
                        }
                    } else {
                        class272.field4858[arg2][arg5][arg1] = class119.method729(class272.field4858[arg2][arg5][arg1], 1);
                        class272.field4858[arg2][arg5][arg1 + 1] = class119.method729(class272.field4858[arg2][arg5][arg1 + 1], 2);
                    }
                }
                if (~var11.field3890 != -1 && arg3 != null) {
                    arg3.method641(arg8, arg7, true, arg5, arg1, var11.field3895);
                }
                if (~var11.field3876 != -17) {
                    class65.method370(arg2, arg5, arg1, var11.field3876);
                }
            } else if (arg7 == 3) {
                class51 var42;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var41 = var11.method1462(3, arg8, var18, var24, var21, (class100) null, var20, 56, arg10, var27, var19);
                    var42 = var41.field4802;
                } else {
                    var42 = new class34(arg6, 3, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class135.method812(arg2, arg5, arg1, var19, var42, (class51) null, class265.field4766[arg8], 0, var25);
                if (var11.field3875 && arg10) {
                    if (arg8 == 0) {
                        class137.field2405[arg2][arg5][arg1 + 1] = 50;
                    } else if (arg8 != 1) {
                        if (~arg8 == -3) {
                            class137.field2405[arg2][arg5 + 1][arg1] = 50;
                        } else if (~arg8 == -4) {
                            class137.field2405[arg2][arg5][arg1] = 50;
                        }
                    } else {
                        class137.field2405[arg2][arg5 + 1][arg1 + 1] = 50;
                    }
                }
                if (var11.field3890 != 0 && arg3 != null) {
                    arg3.method641(arg8, arg7, true, arg5, arg1, var11.field3895);
                }
            } else if (arg7 == 9) {
                class51 var44;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var43 = var11.method1462(arg7, arg8, var18, var24, var21, (class100) null, var20, 52, arg10, var27, var19);
                    var44 = var43.field4802;
                } else {
                    var44 = new class34(arg6, arg7, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class166.method1090(arg2, arg5, arg1, var19, 1, 1, var44, 0, var25);
                if (var11.field3890 != 0 && arg3 != null) {
                    arg3.method633(arg5, var12, var11.field3895, var13, arg1, -9666);
                }
                if (~var11.field3876 != -17) {
                    class65.method370(arg2, arg5, arg1, var11.field3876);
                }
            } else if (arg7 == 4) {
                class51 var46;
                if (var11.field3898 == -1 && var11.field3868 == null && !var11.field3889) {
                    class268 var45 = var11.method1462(4, arg8, var18, var24, var21, (class100) null, var20, arg4 ^ 30066, arg10, var27, var19);
                    var46 = var45.field4802;
                } else {
                    var46 = new class34(arg6, 4, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class15.method117(arg2, arg5, arg1, var19, var46, (class51) null, class97.field1775[arg8], 0, 0, 0, var25);
            } else if (arg7 == 5) {
                int var47 = 16;
                long var48 = class13.method104(arg2, arg5, arg1);
                if (var48 != 0L) {
                    var47 = class34.method232(167, Integer.MAX_VALUE & (int) (var48 >>> 32)).field3876;
                }
                class51 var51;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var50 = var11.method1462(4, arg8, var18, var24, var21, (class100) null, var20, 104, arg10, var27, var19);
                    var51 = var50.field4802;
                } else {
                    var51 = new class34(arg6, 4, arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class15.method117(arg2, arg5, arg1, var19, var51, (class51) null, class97.field1775[arg8], 0, class223.field4040[arg8] * var47, class12.field237[arg8] * var47, var25);
            } else if (~arg7 == -7) {
                int var52 = 8;
                long var53 = class13.method104(arg2, arg5, arg1);
                if (var53 != 0L) {
                    var52 = class34.method232(167, Integer.MAX_VALUE & (int) (var53 >>> 32)).field3876 / 2;
                }
                class51 var56;
                if (var11.field3898 == -1 && var11.field3868 == null && !var11.field3889) {
                    class268 var55 = var11.method1462(4, arg8 + 4, var18, var24, var21, (class100) null, var20, -75, arg10, var27, var19);
                    var56 = var55.field4802;
                } else {
                    var56 = new class34(arg6, 4, arg8 - -4, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class15.method117(arg2, arg5, arg1, var19, var56, (class51) null, 256, arg8, class124.field2187[arg8] * var52, class168.field3005[arg8] * var52, var25);
            } else if (arg7 == 7) {
                int var57 = 3 & arg8 + 2;
                class51 var59;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var58 = var11.method1462(4, var57 - -4, var18, var24, var21, (class100) null, var20, 85, arg10, var27, var19);
                    var59 = var58.field4802;
                } else {
                    var59 = new class34(arg6, 4, var57 - -4, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class15.method117(arg2, arg5, arg1, var19, var59, (class51) null, 256, var57, 0, 0, var25);
            } else if (arg7 == 8) {
                int var60 = 8;
                long var61 = class13.method104(arg2, arg5, arg1);
                if (~var61 != -1L) {
                    var60 = class34.method232(167, (int) (var61 >>> 32) & Integer.MAX_VALUE).field3876 / 2;
                }
                int var63 = 3 & arg8 + 2;
                class51 var65;
                class51 var67;
                if (~var11.field3898 == 0 && var11.field3868 == null && !var11.field3889) {
                    class268 var64 = var11.method1462(4, arg8 - -4, var18, var24, var21, (class100) null, var20, 106, arg10, var27, var19);
                    var65 = var64.field4802;
                    class268 var66 = var11.method1462(4, var63 + 4, var18, var24, var21, (class100) null, var20, 86, arg10, var27, var19);
                    var67 = var66.field4802;
                } else {
                    var65 = new class34(arg6, 4, arg8 + 4, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                    var67 = new class34(arg6, 4, var63 + 4, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
                }
                class15.method117(arg2, arg5, arg1, var19, var65, var67, 256, arg8, class124.field2187[arg8] * var60, class168.field3005[arg8] * var60, var25);
            }
        } else {
            class51 var69;
            if (var11.field3898 == -1 && var11.field3868 == null && !var11.field3889) {
                class268 var68 = var11.method1462(10, ~arg7 == -12 ? arg8 + 4 : arg8, var18, var24, var21, (class100) null, var20, arg4 + 29845, arg10, var27, var19);
                var69 = var68.field4802;
            } else {
                var69 = new class34(arg6, 10, ~arg7 == -12 ? arg8 + 4 : arg8, arg9, arg5, arg1, var11.field3898, var11.field3834, (class51) null);
            }
            if (var69 != null) {
                boolean var70 = class166.method1090(arg2, arg5, arg1, var19, var12, var13, var69, 0, var25);
                if (var11.field3875 && var70 && arg10) {
                    int var71 = 15;
                    if (var69 instanceof class150) {
                        var71 = ((class150) var69).method973() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; ~var72 >= ~var12; ++var72) {
                        for (int var73 = 0; ~var13 <= ~var73; ++var73) {
                            if (~var71 < ~class137.field2405[arg2][arg5 + var72][arg1 + var73]) {
                                class137.field2405[arg2][arg5 - -var72][arg1 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (~var11.field3890 != -1 && arg3 != null) {
                arg3.method633(arg5, var12, var11.field3895, var13, arg1, -9666);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(III)Lkd;")
    public static final class63 method782(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class63 var4 = var3.field2124;
            var3.field2124 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        ++field2290;
        int var4 = 83 / ((arg0 - -14) / 59);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
    public final void method497(int arg0, byte arg1, int arg2) {
        int var4 = this.field2286 * arg0 >> 12;
        int var5 = this.field2288 * arg2 >> 12;
        int var6 = this.field2274 * arg2 >> 12;
        if (arg1 <= -17) {
            int var7 = this.field2273 * arg0 >> 12;
            ++field2283;
            int var8 = this.field2280 * arg2 >> 12;
            int var9 = this.field2285 * arg2 >> 12;
            int var10 = this.field2281 * arg0 >> 12;
            int var11 = this.field2292 * arg0 >> 12;
            class195.method1345(var4, var7, var6, var10, var9, var5, var8, super.field3688, var11, true);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public static void method783(byte arg0) {
        field2278 = null;
        field2296 = null;
        field2291 = null;
        if (arg0 > -107) {
            method781(false, -14, -57, (class106) null, -81, -84, -69, -44, 26, -49, false);
        }
        field2284 = null;
        field2293 = null;
    }
}
