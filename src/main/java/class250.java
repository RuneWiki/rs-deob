import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class250 extends class73 {

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    private int field3875;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    private int field3872;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field3873;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public static boolean field3878 = false;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field3879 = 0;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
    public static int[] field3877;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public final void method584(int arg0, int arg1, int arg2) {
        ++field3874;
        int var4 = this.field3875 * arg2 >> 12;
        int var5 = this.field3873 * arg0 >> 12;
        int var6 = this.field3872 * arg0 >> 12;
        int var7 = this.field3880 * arg2 >> 12;
        class233.method1585(false, super.field1182, var4, var5, var6, var7);
        if (arg1 <= 116) {
            method1707(4, -57, 7, -48, (byte) -65, 91);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method1705(int arg0) {
        if (arg0 != 32) {
            field3877 = null;
        }
        field3877 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)I")
    public static final int method1706(boolean arg0) {
        ++field3870;
        if (arg0) {
            method1705(91);
        }
        if ((double) class44.field777 == 3.0D) {
            return 37;
        } else if ((double) class44.field777 == 4.0D) {
            return 50;
        } else if ((double) class44.field777 == 6.0D) {
            return 75;
        } else {
            return (double) class44.field777 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
    public final void method588(int arg0, int arg1, int arg2) {
        ++field3882;
        int var4 = -22 % ((arg2 - 61) / 46);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIII)V")
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3875 = arg2;
        this.field3872 = arg3;
        this.field3880 = arg0;
        this.field3873 = arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field3871;
        if (arg2 == arg3) {
            class78.method619(arg5, arg1, 1, arg0, arg3);
        } else {
            if (~class196.field2961 >= ~(arg5 - arg3) && ~(arg5 - -arg3) >= ~class84.field1287 && class175.field2557 <= -arg2 + arg1 && arg1 + arg2 <= class91.field1381) {
                class51.method383(arg1, arg0, arg2, true, arg5, arg3);
            } else {
                class108.method780(arg3, arg5, arg2, arg1, 0, arg0);
            }
            if (arg4 >= -55) {
                field3877 = null;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
    public final void method587(int arg0, int arg1, int arg2) {
        ++field3881;
        if (arg2 != -10) {
            field3877 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjk;IIZ)V")
    public static final void method1708(int arg0, class297 arg1, int arg2, int arg3, boolean arg4) {
        class195.method1316(-73);
        ++field3876;
        class72.method567(arg0, arg2, arg1.field4627 + arg0, arg1.field4531 + arg2);
        if (~class283.field4336 != -3 && class283.field4336 != 5 && class14.field205 != null) {
            int var5 = class185.field2687.field425 / 32 + 48;
            int var6 = (int) class89.field1349 + class96.field1420 & 2047;
            int var7 = 464 - class185.field2687.field455 / 32;
            ((class289) class14.field205).method1224(arg0, arg2, arg1.field4627, arg1.field4531, var5, var7, var6, 256 - -class258.field3958, arg1.field4550, arg1.field4645);
            if (class21.field358 != null) {
                for (int var8 = 0; class21.field358.field3727 > var8; ++var8) {
                    if (class21.field358.method1646(1821211216, var8)) {
                        int var9 = class119.field1776[var6];
                        int var10 = (((class21.field358.field3738[var8] & 268423879) >> 14) + -class90.field1367) * 4 + -(class185.field2687.field425 / 32) + 2;
                        int var11 = class119.field1774[var6];
                        class192 var12 = class246.field3835;
                        int var13 = ((16383 & class21.field358.field3738[var8]) + -class188.field2774) * 4 + 2 + -(class185.field2687.field455 / 32);
                        int var14 = var9 * 256 / (class258.field3958 + 256);
                        int var15 = var11 * 256 / (class258.field3958 + 256);
                        int var16 = var13 * var14 + -(var10 * var15) >> 16;
                        if (class21.field358.method1642(var8, (byte) -31) == 1) {
                            var12 = class269.field4186;
                        }
                        if (class21.field358.method1642(var8, (byte) -31) == 2) {
                            var12 = class105.field1555;
                        }
                        int var17 = var12.method1290(class21.field358.field3731[var8], 100);
                        int var18 = var10 * var14 + var13 * var15 >> 16;
                        int var19 = var18 - var17 / 2;
                        if (~var19 <= ~(-arg1.field4627) && arg1.field4627 >= var19 && var16 >= -arg1.field4531 && ~var16 >= ~arg1.field4531) {
                            int var20 = 16777215;
                            if (class21.field358.field3733[var8] != -1) {
                                var20 = class21.field358.field3733[var8];
                            }
                            class72.method571(arg1.field4550, arg1.field4645);
                            var12.method1289(class21.field358.field3731[var8], var19 - -(arg1.field4627 / 2) + arg0, arg2 - (-(arg1.field4531 / 2) - -var16), var17, 50, var20, 0, 256, 1, 0, 0);
                            class72.method575();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class123.field1822; ++var21) {
                int var58 = class196.field2960[var21] * 4 + 2 + -(class185.field2687.field425 / 32);
                int var59 = class160.field2330[var21] * 4 + 2 + -(class185.field2687.field455 / 32);
                class188 var60 = class3.method42(-113, class295.field4484[var21]);
                if (var60.field2804 != null) {
                    var60 = var60.method1253(false);
                    if (var60 == null || var60.field2786 == -1) {
                        continue;
                    }
                }
                class111.method802(arg0, arg1, -29, var58, arg2, var59, class22.field363[var60.field2786]);
            }
            for (int var22 = 0; ~var22 > -105; ++var22) {
                for (int var54 = 0; var54 < 104; ++var54) {
                    class284 var55 = class235.field3614[class260.field3986][var22][var54];
                    if (var55 != null) {
                        int var56 = var22 * 4 + 2 + -(class185.field2687.field425 / 32);
                        int var57 = var54 * 4 - (-2 - -(class185.field2687.field455 / 32));
                        class111.method802(arg0, arg1, -65, var56, arg2, var57, class201.field3013[0]);
                    }
                }
            }
            for (int var23 = 0; class207.field3093 > var23; ++var23) {
                class87 var50 = class243.field3762[class285.field4379[var23]];
                if (var50 != null && var50.method173((byte) 109)) {
                    class189 var51 = var50.field1323;
                    if (var51 != null && var51.field2829 != null) {
                        var51 = var51.method1257(-32207);
                    }
                    if (var51 != null && var51.field2868 && var51.field2849) {
                        int var52 = var50.field425 / 32 + -(class185.field2687.field425 / 32);
                        int var53 = var50.field455 / 32 + -(class185.field2687.field455 / 32);
                        if (~var51.field2826 == 0) {
                            class111.method802(arg0, arg1, -80, var52, arg2, var53, class201.field3013[1]);
                        } else {
                            class111.method802(arg0, arg1, -43, var52, arg2, var53, class22.field363[var51.field2826]);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class266.field4155; ++var24) {
                class224 var40 = class166.field2438[class205.field3068[var24]];
                if (var40 != null && var40.method173((byte) 109)) {
                    int var41 = var40.field425 / 32 - class185.field2687.field425 / 32;
                    int var42 = var40.field455 / 32 + -(class185.field2687.field455 / 32);
                    boolean var43 = false;
                    long var44 = class37.method286(25077, var40.field3488);
                    for (int var46 = 0; var46 < class3.field36; ++var46) {
                        if (class131.field1926[var46] == var44 && ~class117.field1762[var46] != -1) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; ~class212.field3256 < ~var48; ++var48) {
                        if (~class182.field2646[var48].field2628 == ~var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class185.field2687.field3476 != 0 && var40.field3476 != 0 && ~class185.field2687.field3476 == ~var40.field3476) {
                        var49 = true;
                    }
                    if (var43) {
                        class111.method802(arg0, arg1, -121, var41, arg2, var42, class201.field3013[3]);
                    } else if (!var47) {
                        if (var49) {
                            class111.method802(arg0, arg1, -47, var41, arg2, var42, class201.field3013[4]);
                        } else {
                            class111.method802(arg0, arg1, -33, var41, arg2, var42, class201.field3013[2]);
                        }
                    } else {
                        class111.method802(arg0, arg1, -19, var41, arg2, var42, class201.field3013[5]);
                    }
                }
            }
            int var25 = 0;
            class130[] var26 = class234.field3610;
            while (var25 < var26.length) {
                class130 var29 = var26[var25];
                if (var29 != null && var29.field1913 != 0 && class120.field1794 % 20 < 10) {
                    if (var29.field1913 == 1 && var29.field1904 >= 0 && var29.field1904 < class243.field3762.length) {
                        class87 var30 = class243.field3762[var29.field1904];
                        if (var30 != null) {
                            int var31 = var30.field425 / 32 - class185.field2687.field425 / 32;
                            int var32 = var30.field455 / 32 + -(class185.field2687.field455 / 32);
                            class143.method970(var29.field1918, var32, var31, 256, arg0, arg2, 360000, arg1);
                        }
                    }
                    if (var29.field1913 == 2) {
                        int var33 = (-class188.field2774 + var29.field1907) * 4 + -(class185.field2687.field455 / 32) + 2;
                        int var34 = (var29.field1916 - class90.field1367) * 4 - class185.field2687.field425 / 32 + 2;
                        int var35 = var29.field1905 * 4;
                        int var36 = var35 * var35;
                        class143.method970(var29.field1918, var33, var34, 256, arg0, arg2, var36, arg1);
                    }
                    if (var29.field1913 == 10 && ~var29.field1904 <= -1 && ~var29.field1904 > ~class166.field2438.length) {
                        class224 var37 = class166.field2438[var29.field1904];
                        if (var37 != null) {
                            int var38 = var37.field425 / 32 + -(class185.field2687.field425 / 32);
                            int var39 = var37.field455 / 32 + -(class185.field2687.field455 / 32);
                            class143.method970(var29.field1918, var39, var38, 256, arg0, arg2, 360000, arg1);
                        }
                    }
                }
                ++var25;
            }
            if (~class111.field1693 != -1) {
                int var27 = class111.field1693 * 4 - (-2 + class185.field2687.field425 / 32 + -((class185.field2687.method168(-118) + -1) * 2));
                int var28 = class97.field1427 * 4 + 2 - class185.field2687.field455 / 32 + (-1 + class185.field2687.method168(-109)) * 2;
                class111.method802(arg0, arg1, -69, var27, arg2, var28, class62.field1037);
            }
            class72.method576(arg1.field4627 / 2 + arg0 + -1, arg1.field4531 / 2 + (arg2 - 1), 3, 3, 16777215);
        } else {
            class72.method558(arg0, arg2, 0, arg1.field4550, arg1.field4645);
        }
        class285.field4371[arg3] = arg4;
    }
}
