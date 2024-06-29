import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class24 extends class87 implements class278 {

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "Lja;")
    public class101 field441;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Z")
    private boolean field427;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lkm;II)Lab;", line = 3)
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        int var4 = 36 / ((arg1 - -12) / 47);
        ++field436;
        return this.field441.method636(0, false, false, 0, arg0, arg2, (byte) -126);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILvk;IIZII[IIII[II)I", line = 14)
    public static final int method209(int arg0, int arg1, int arg2, class272 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        for (int var15 = 0; ~var15 > -129; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class159.field2286[var15][var35] = 0;
                class84.field1267[var15][var35] = 99999999;
            }
        }
        ++field439;
        boolean var16;
        if (arg7 != 1) {
            if (arg7 == 2) {
                var16 = class326.method1959(arg12, arg10, arg8, arg5, 19757, arg4, arg2, arg3, arg1, arg11, arg0);
            } else {
                var16 = class345.method2061(arg3, arg7, arg5, arg2, arg0, arg10, ~arg14, arg11, arg8, arg4, arg1, arg12);
            }
        } else {
            var16 = class307.method1857(arg11, arg8, arg12, arg2, arg1, arg0, arg5, arg4, arg14 + 1109655552, arg3, arg10);
        }
        int var17 = arg5 - 64;
        int var18 = arg0 - 64;
        int var19 = class239.field3376;
        int var20 = class163.field2335;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = -var23 + arg4; var24 <= arg4 - -var23; ++var24) {
                for (int var25 = arg10 - var23; ~(arg10 + var23) <= ~var25; ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = -var18 + var25;
                    if (var26 >= 0 && ~var27 <= -1 && ~var26 > -129 && var27 < 128 && ~class84.field1267[var26][var27] > -101) {
                        int var28 = 0;
                        if (var24 < arg4) {
                            var28 = -var24 + arg4;
                        } else if (~var24 < ~(arg4 + arg12 + -1)) {
                            var28 = var24 - arg12 - arg4 - -1;
                        }
                        int var29 = 0;
                        if (arg10 > var25) {
                            var29 = -var25 + arg10;
                        } else if (var25 > arg2 + arg10 + -1) {
                            var29 = var25 - -1 - (arg2 + arg10);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || ~var21 == ~var30 && class84.field1267[var26][var27] < var22) {
                            var21 = var30;
                            var20 = var25;
                            var22 = class84.field1267[var26][var27];
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (~arg5 == ~var19 && arg0 == var20) {
            return 0;
        } else {
            class180.field2615[arg14] = var19;
            int var31 = arg14 + 1;
            class7.field130[arg14] = var20;
            int var32;
            int var33 = var32 = class159.field2286[-var17 + var19][-var18 + var20];
            while (~arg5 != ~var19 || ~arg0 != ~var20) {
                if (var32 != var33) {
                    class180.field2615[var31] = var19;
                    var32 = var33;
                    class7.field130[var31++] = var20;
                }
                if ((1 & var33) == 0) {
                    if ((var33 & 4) != 0) {
                        --var20;
                    }
                } else {
                    ++var20;
                }
                if ((var33 & 2) != 0) {
                    ++var19;
                } else if (~(var33 & 8) != -1) {
                    --var19;
                }
                var33 = class159.field2286[var19 - var17][-var18 + var20];
            }
            int var34 = 0;
            while (~(var31--) < -1) {
                arg13[var34] = class180.field2615[var31];
                arg9[var34++] = class7.field130[var31];
                if (~arg13.length >= ~var34) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lbn;B)V", line = 187)
    public static final void method210(class106 arg0, byte arg1) {
        ++field443;
        if (arg0 != null && class250.field3514.field3504 != arg0) {
            int var2 = arg0.field1521;
            int var3 = arg0.field1519;
            int var4 = arg0.field1517;
            int var5 = (int) arg0.field1515;
            long var6 = arg0.field1515;
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            int var8;
            int var9;
            if (class8.field169 == null) {
                var8 = class227.field3212;
                var9 = class275.field3806;
            } else {
                var9 = class8.field169.method980(22);
                var8 = class8.field169.method972(false);
            }
            if (var4 == 30) {
                class235.field3329 = var8;
                ++class235.field3317;
                class258.field3605 = 2;
                class228.field3231 = var9;
                class238.field3358 = 0;
                class131.method793(class229.field3241, -71);
                class366.field5214.method2475(128, class153.field2204 + var2);
                class366.field5214.method2462(var3 - -class325.field4472, (byte) -123);
                class366.field5214.method2458(class194.field2757.method531(82, 51) ? 1 : 0, (byte) 111);
                class366.field5214.method2453(var5, true);
                class154.method933(var2, var3, 17499);
            }
            if (~var4 == -1012) {
                ++class434.field5965;
                class228.field3231 = var9;
                class235.field3329 = var8;
                class238.field3358 = 0;
                class258.field3605 = 2;
                class131.method793(class479.field6782, -115);
                class366.field5214.method2458(!class194.field2757.method531(82, 65) ? 0 : 1, (byte) 122);
                class366.field5214.method2501(class153.field2204 + var2, -128);
                class366.field5214.method2475(128, class325.field4472 + var3);
                class366.field5214.method2475(128, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class396.method2366(0, var3, var6, var2);
            }
            if (var4 == 22) {
                class238.field3358 = 0;
                class235.field3329 = var8;
                ++class473.field6620;
                class258.field3605 = 2;
                class228.field3231 = var9;
                class131.method793(class55.field898, 66);
                class366.field5214.method2501(class153.field2204 + var2, -128);
                class366.field5214.method2462(class202.field2897, (byte) -123);
                class366.field5214.method2475(128, class325.field4472 + var3);
                class366.field5214.method2462(class58.field919, (byte) -123);
                class366.field5214.method2458(class194.field2757.method531(82, 97) ? 1 : 0, (byte) 107);
                class366.field5214.method2462(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -123);
                class366.field5214.method2513((byte) 70, class99.field1406);
                class396.method2366(0, var3, var6, var2);
            }
            if (~var4 == -60 && class422.field5806 == null) {
                class340.method2016(-830, var2, var3);
                class422.field5806 = class485.method2840(var2, var3, (byte) 21);
                class356.method2141(-115, class422.field5806);
            }
            if (~var4 == -20) {
                class238.field3358 = 0;
                class228.field3231 = var9;
                class235.field3329 = var8;
                ++class238.field3353;
                class258.field3605 = 2;
                class131.method793(class41.field697, -76);
                class366.field5214.method2473(class99.field1406, (byte) 124);
                class366.field5214.method2453(class325.field4472 + var3, true);
                class366.field5214.method2458(!class194.field2757.method531(82, 55) ? 0 : 1, (byte) 113);
                class366.field5214.method2501(class202.field2897, -128);
                class366.field5214.method2453(class58.field919, true);
                class366.field5214.method2453(var5, true);
                class366.field5214.method2453(class153.field2204 + var2, true);
                class154.method933(var2, var3, 17499);
            }
            if (var4 == 51) {
                class258.field3605 = 2;
                ++class488.field6882;
                class235.field3329 = var8;
                class238.field3358 = 0;
                class228.field3231 = var9;
                class131.method793(class442.field6074, -80);
                class366.field5214.method2462(class153.field2204 + var2, (byte) -123);
                class366.field5214.method2453(var5, true);
                class366.field5214.method2462(class325.field4472 + var3, (byte) -123);
                class366.field5214.method2499(!class194.field2757.method531(82, 114) ? 0 : 1, 14584);
                class154.method933(var2, var3, 17499);
            }
            if (var4 == 9) {
                if (~class159.field2292 < -1 && class194.field2757.method531(82, 84) && class194.field2757.method531(81, 108)) {
                    class160.method971(class153.field2204 + var2, class325.field4472 + var3, 63, class2.field21.field6766);
                } else {
                    class159.method969(var3, var2, var5, false);
                    if (~var5 == -2) {
                        class366.field5214.method2470((byte) -74, -1);
                        class366.field5214.method2470((byte) -74, -1);
                        class366.field5214.method2462((int) class418.field5750, (byte) -123);
                        class366.field5214.method2470((byte) -74, 57);
                        class366.field5214.method2470((byte) -74, class361.field5042);
                        class366.field5214.method2470((byte) -74, class351.field4804);
                        class366.field5214.method2470((byte) -74, 89);
                        class366.field5214.method2462(class2.field21.field6765, (byte) -123);
                        class366.field5214.method2462(class2.field21.field6746, (byte) -123);
                        class366.field5214.method2470((byte) -74, 63);
                    } else {
                        class235.field3329 = var8;
                        class258.field3605 = 1;
                        class228.field3231 = var9;
                        class238.field3358 = 0;
                    }
                    class425.method2469(1, true, 0, 12914, class2.field21.field1140[0], var2, 1, class2.field21.field1144[0], var3, -4, 0);
                }
            }
            if (~var4 == -61) {
                class235.field3329 = var8;
                class228.field3231 = var9;
                class258.field3605 = 2;
                ++client.field5512;
                class238.field3358 = 0;
                class131.method793(class441.field6050, 127);
                class366.field5214.method2462((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -123);
                class366.field5214.method2462(class153.field2204 + var2, (byte) -123);
                class366.field5214.method2462(class325.field4472 + var3, (byte) -123);
                class366.field5214.method2458(class194.field2757.method531(82, 45) ? 1 : 0, (byte) 117);
                class396.method2366(0, var3, var6, var2);
            }
            if (var4 == 4) {
                class228.field3231 = var9;
                ++class489.field6895;
                class235.field3329 = var8;
                class258.field3605 = 2;
                class238.field3358 = 0;
                class131.method793(class3.field30, -97);
                class366.field5214.method2470((byte) -74, !class194.field2757.method531(82, 103) ? 0 : 1);
                class366.field5214.method2475(128, class325.field4472 + var3);
                class366.field5214.method2475(128, class153.field2204 + var2);
                class366.field5214.method2453(var5, true);
                class154.method933(var2, var3, 17499);
            }
            if (~var4 == -59) {
                class235.field3329 = var8;
                class238.field3358 = 0;
                ++class491.field6935;
                class228.field3231 = var9;
                class258.field3605 = 2;
                class131.method793(class372.field5285, 83);
                class366.field5214.method2462(class153.field2204 + var2, (byte) -123);
                class366.field5214.method2458(class194.field2757.method531(82, 105) ? 1 : 0, (byte) 124);
                class366.field5214.method2501(var5, -128);
                class366.field5214.method2501(var3 - -class325.field4472, -128);
                class154.method933(var2, var3, 17499);
            }
            if (var4 == 20) {
                class23 var10 = class310.field4235[var5];
                if (var10 != null) {
                    class258.field3605 = 2;
                    class235.field3329 = var8;
                    ++class32.field523;
                    class228.field3231 = var9;
                    class238.field3358 = 0;
                    class131.method793(class226.field3199, -32);
                    class366.field5214.method2475(128, var5);
                    class366.field5214.method2470((byte) -74, class194.field2757.method531(82, 91) ? 1 : 0);
                    class425.method2469(var10.method206(0), true, 0, 12914, class2.field21.field1140[0], var10.field1144[0], var10.method206(0), class2.field21.field1144[0], var10.field1140[0], -2, 0);
                }
            }
            if (var4 == 13) {
                class363 var11 = class485.method2840(var2, var3, (byte) 21);
                if (var11 != null) {
                    class7.method84(36);
                    class67 var12 = client.method2321(var11);
                    class254.method1578(var3, var12.field992, var2, var12.method474((byte) -32), -6, var11.field5083, var11.field5077);
                    class238.field3363 = class243.method1518(var11, false);
                    if (class238.field3363 == null) {
                        class238.field3363 = "Null";
                    }
                    class357.field4981 = var11.field5115 + "<col=ffffff>";
                }
            } else {
                if (~var4 == -6) {
                    class196 var13 = class256.field3581[var5];
                    if (var13 != null) {
                        class238.field3358 = 0;
                        class228.field3231 = var9;
                        ++class11.field199;
                        class258.field3605 = 2;
                        class235.field3329 = var8;
                        class131.method793(class11.field201, -123);
                        class366.field5214.method2475(128, var5);
                        class366.field5214.method2470((byte) -74, !class194.field2757.method531(82, 82) ? 0 : 1);
                        class425.method2469(var13.method206(0), true, 0, 12914, class2.field21.field1140[0], var13.field1144[0], var13.method206(0), class2.field21.field1144[0], var13.field1140[0], -2, 0);
                    }
                }
                int var14 = 48 / ((arg1 - 33) / 32);
                if (var4 == 44) {
                    class196 var15 = class256.field3581[var5];
                    if (var15 != null) {
                        ++class204.field2918;
                        class228.field3231 = var9;
                        class258.field3605 = 2;
                        class238.field3358 = 0;
                        class235.field3329 = var8;
                        class131.method793(class455.field6281, -91);
                        class366.field5214.method2462(var5, (byte) -123);
                        class366.field5214.method2478(!class194.field2757.method531(82, 69) ? 0 : 1, (byte) -26);
                        class425.method2469(var15.method206(0), true, 0, 12914, class2.field21.field1140[0], var15.field1144[0], var15.method206(0), class2.field21.field1144[0], var15.field1140[0], -2, 0);
                    }
                }
                if (var4 == 1002) {
                    ++class485.field6836;
                    class228.field3231 = var9;
                    class258.field3605 = 2;
                    class235.field3329 = var8;
                    class238.field3358 = 0;
                    class131.method793(class336.field4617, 109);
                    class366.field5214.method2462(var5, (byte) -123);
                }
                if (var4 == 18) {
                    class196 var16 = class256.field3581[var5];
                    if (var16 != null) {
                        class235.field3329 = var8;
                        class238.field3358 = 0;
                        ++class117.field1646;
                        class228.field3231 = var9;
                        class258.field3605 = 2;
                        class131.method793(class280.field3853, 61);
                        class366.field5214.method2453(var5, true);
                        class366.field5214.method2478(class194.field2757.method531(82, 95) ? 1 : 0, (byte) -26);
                        class425.method2469(var16.method206(0), true, 0, 12914, class2.field21.field1140[0], var16.field1144[0], var16.method206(0), class2.field21.field1144[0], var16.field1140[0], -2, 0);
                    }
                }
                if (~var4 == -11) {
                    class23 var17 = class310.field4235[var5];
                    if (var17 != null) {
                        class238.field3358 = 0;
                        class235.field3329 = var8;
                        class228.field3231 = var9;
                        ++class159.field2285;
                        class258.field3605 = 2;
                        class131.method793(class128.field1817, -115);
                        class366.field5214.method2453(var5, true);
                        class366.field5214.method2458(class194.field2757.method531(82, 58) ? 1 : 0, (byte) 120);
                        class425.method2469(var17.method206(0), true, 0, 12914, class2.field21.field1140[0], var17.field1144[0], var17.method206(0), class2.field21.field1144[0], var17.field1140[0], -2, 0);
                    }
                }
                if (~var4 == -3) {
                    class228.field3231 = var9;
                    class258.field3605 = 1;
                    ++class77.field1164;
                    class238.field3358 = 0;
                    class235.field3329 = var8;
                    class131.method793(class367.field5220, 127);
                    class366.field5214.method2475(128, class153.field2204 + var2);
                    class366.field5214.method2462(class58.field919, (byte) -123);
                    class366.field5214.method2453(class202.field2897, true);
                    class366.field5214.method2453(class325.field4472 - -var3, true);
                    class366.field5214.method2473(class99.field1406, (byte) 100);
                    class425.method2469(1, true, 0, 12914, class2.field21.field1140[0], var2, 1, class2.field21.field1144[0], var3, -4, 0);
                }
                if (~var4 == -1010 || ~var4 == -1004 || var4 == 1006 || ~var4 == -1009 || ~var4 == -1013) {
                    class261.method1614(var4, 32524, var5, var2);
                }
                if (var4 == 3) {
                    class196 var18 = class256.field3581[var5];
                    if (var18 != null) {
                        class228.field3231 = var9;
                        class238.field3358 = 0;
                        ++class70.field1035;
                        class235.field3329 = var8;
                        class258.field3605 = 2;
                        class131.method793(class154.field2213, -119);
                        class366.field5214.method2458(!class194.field2757.method531(82, 98) ? 0 : 1, (byte) 118);
                        class366.field5214.method2453(var5, true);
                        class425.method2469(var18.method206(0), true, 0, 12914, class2.field21.field1140[0], var18.field1144[0], var18.method206(0), class2.field21.field1144[0], var18.field1140[0], -2, 0);
                    }
                }
                if (var4 == 21) {
                    class23 var19 = class310.field4235[var5];
                    if (var19 != null) {
                        class228.field3231 = var9;
                        ++class15.field260;
                        class238.field3358 = 0;
                        class258.field3605 = 2;
                        class235.field3329 = var8;
                        class131.method793(class259.field3612, 88);
                        class366.field5214.method2453(var5, true);
                        class366.field5214.method2478(!class194.field2757.method531(82, 82) ? 0 : 1, (byte) -26);
                        class425.method2469(var19.method206(0), true, 0, 12914, class2.field21.field1140[0], var19.field1144[0], var19.method206(0), class2.field21.field1144[0], var19.field1140[0], -2, 0);
                    }
                }
                if (~var4 == -18) {
                    class23 var20 = class310.field4235[var5];
                    if (var20 != null) {
                        class235.field3329 = var8;
                        class258.field3605 = 2;
                        ++class58.field917;
                        class238.field3358 = 0;
                        class228.field3231 = var9;
                        class131.method793(class235.field3324, 115);
                        class366.field5214.method2481(class99.field1406, true);
                        class366.field5214.method2453(class58.field919, true);
                        class366.field5214.method2458(class194.field2757.method531(82, 76) ? 1 : 0, (byte) 127);
                        class366.field5214.method2462(class202.field2897, (byte) -123);
                        class366.field5214.method2462(var5, (byte) -123);
                        class425.method2469(var20.method206(0), true, 0, 12914, class2.field21.field1140[0], var20.field1144[0], var20.method206(0), class2.field21.field1144[0], var20.field1140[0], -2, 0);
                    }
                }
                if (var4 == 6) {
                    if (~class159.field2292 < -1 && class194.field2757.method531(82, 95) && class194.field2757.method531(81, 53)) {
                        class160.method971(class153.field2204 + var2, class325.field4472 + var3, 63, class2.field21.field6766);
                    } else {
                        class228.field3231 = var9;
                        class235.field3329 = var8;
                        ++class8.field158;
                        class238.field3358 = 0;
                        class258.field3605 = 1;
                        class131.method793(class9.field179, -31);
                        class366.field5214.method2453(class153.field2204 - -var2, true);
                        class366.field5214.method2453(class325.field4472 + var3, true);
                    }
                }
                if (~var4 == -49) {
                    class196 var21 = class256.field3581[var5];
                    if (var21 != null) {
                        class258.field3605 = 2;
                        ++class325.field4476;
                        class228.field3231 = var9;
                        class235.field3329 = var8;
                        class238.field3358 = 0;
                        class131.method793(class214.field3033, -104);
                        class366.field5214.method2453(var5, true);
                        class366.field5214.method2478(!class194.field2757.method531(82, 76) ? 0 : 1, (byte) -26);
                        class425.method2469(var21.method206(0), true, 0, 12914, class2.field21.field1140[0], var21.field1144[0], var21.method206(0), class2.field21.field1144[0], var21.field1140[0], -2, 0);
                    }
                }
                if (~var4 == -9) {
                    class23 var22 = class310.field4235[var5];
                    if (var22 != null) {
                        class235.field3329 = var8;
                        ++class15.field249;
                        class238.field3358 = 0;
                        class258.field3605 = 2;
                        class228.field3231 = var9;
                        class131.method793(class129.field1827, 63);
                        class366.field5214.method2462(var5, (byte) -123);
                        class366.field5214.method2478(!class194.field2757.method531(82, 85) ? 0 : 1, (byte) -26);
                        class425.method2469(var22.method206(0), true, 0, 12914, class2.field21.field1140[0], var22.field1144[0], var22.method206(0), class2.field21.field1144[0], var22.field1140[0], -2, 0);
                    }
                }
                if (var4 == 11) {
                    class235.field3329 = var8;
                    class238.field3358 = 0;
                    class228.field3231 = var9;
                    ++class78.field1179;
                    class258.field3605 = 2;
                    class131.method793(class195.field2765, -95);
                    class366.field5214.method2470((byte) -74, class194.field2757.method531(82, 122) ? 1 : 0);
                    class366.field5214.method2501(class153.field2204 + var2, -128);
                    class366.field5214.method2501(var3 - -class325.field4472, -128);
                    class366.field5214.method2501((int) (var6 >>> 32) & Integer.MAX_VALUE, -128);
                    class396.method2366(0, var3, var6, var2);
                }
                if (~var4 == -48) {
                    class258.field3605 = 2;
                    class238.field3358 = 0;
                    class235.field3329 = var8;
                    ++class199.field2847;
                    class228.field3231 = var9;
                    class131.method793(class138.field1966, -95);
                    class366.field5214.method2501(class325.field4472 + var3, -128);
                    class366.field5214.method2501(var5, -128);
                    class366.field5214.method2475(128, var2 - -class153.field2204);
                    class366.field5214.method2499(!class194.field2757.method531(82, 87) ? 0 : 1, 14584);
                    class154.method933(var2, var3, 17499);
                }
                if (var4 == 57) {
                    class196 var23 = class256.field3581[var5];
                    if (var23 != null) {
                        class235.field3329 = var8;
                        class258.field3605 = 2;
                        ++class337.field4629;
                        class228.field3231 = var9;
                        class238.field3358 = 0;
                        class131.method793(class355.field4952, -65);
                        class366.field5214.method2481(class99.field1406, true);
                        class366.field5214.method2501(class202.field2897, -128);
                        class366.field5214.method2499(class194.field2757.method531(82, 123) ? 1 : 0, 14584);
                        class366.field5214.method2462(var5, (byte) -123);
                        class366.field5214.method2475(128, class58.field919);
                        class425.method2469(var23.method206(0), true, 0, 12914, class2.field21.field1140[0], var23.field1144[0], var23.method206(0), class2.field21.field1144[0], var23.field1140[0], -2, 0);
                    }
                }
                if (~var4 == -16) {
                    class23 var24 = class310.field4235[var5];
                    if (var24 != null) {
                        class235.field3329 = var8;
                        class228.field3231 = var9;
                        class258.field3605 = 2;
                        ++class442.field6090;
                        class238.field3358 = 0;
                        class131.method793(class410.field5687, 91);
                        class366.field5214.method2499(class194.field2757.method531(82, 89) ? 1 : 0, 14584);
                        class366.field5214.method2453(var5, true);
                        class425.method2469(var24.method206(0), true, 0, 12914, class2.field21.field1140[0], var24.field1144[0], var24.method206(0), class2.field21.field1144[0], var24.field1140[0], -2, 0);
                    }
                }
                if (var4 == 45) {
                    ++class132.field1857;
                    class258.field3605 = 2;
                    class228.field3231 = var9;
                    class238.field3358 = 0;
                    class235.field3329 = var8;
                    class131.method793(class466.field6536, -110);
                    class366.field5214.method2501(class325.field4472 + var3, -128);
                    class366.field5214.method2501(Integer.MAX_VALUE & (int) (var6 >>> 32), -128);
                    class366.field5214.method2462(class153.field2204 + var2, (byte) -123);
                    class366.field5214.method2478(!class194.field2757.method531(82, 88) ? 0 : 1, (byte) -26);
                    class396.method2366(0, var3, var6, var2);
                }
                if (var4 == 25) {
                    class23 var25 = class310.field4235[var5];
                    if (var25 != null) {
                        class258.field3605 = 2;
                        class238.field3358 = 0;
                        class235.field3329 = var8;
                        class228.field3231 = var9;
                        ++class85.field1315;
                        class131.method793(class272.field3768, 92);
                        class366.field5214.method2499(class194.field2757.method531(82, 116) ? 1 : 0, 14584);
                        class366.field5214.method2475(128, var5);
                        class425.method2469(var25.method206(0), true, 0, 12914, class2.field21.field1140[0], var25.field1144[0], var25.method206(0), class2.field21.field1144[0], var25.field1140[0], -2, 0);
                    }
                }
                if (var4 == 1007) {
                    ++class295.field4086;
                    class258.field3605 = 2;
                    class228.field3231 = var9;
                    class235.field3329 = var8;
                    class238.field3358 = 0;
                    class131.method793(class265.field3690, -102);
                    class366.field5214.method2462(var5, (byte) -123);
                }
                if (~var4 == -51 || ~var4 == -1005) {
                    class233.method1469(var5, var2, arg0.field1522, var3, 26233);
                }
                if (var4 == 23) {
                    class363 var26 = class485.method2840(var2, var3, (byte) 21);
                    if (var26 != null) {
                        class32.method250(var26, true);
                    }
                }
                if (var4 == 1010) {
                    class228.field3231 = var9;
                    class258.field3605 = 2;
                    class235.field3329 = var8;
                    class238.field3358 = 0;
                    class196 var27 = class256.field3581[var5];
                    if (var27 != null) {
                        class127 var28 = var27.field2789;
                        if (var28.field1780 != null) {
                            var28 = var28.method767(class320.field4376, (byte) 57);
                        }
                        if (var28 != null) {
                            ++class365.field5207;
                            class131.method793(class175.field2575, 60);
                            class366.field5214.method2462(var28.field1784, (byte) -123);
                        }
                    }
                }
                if (var4 == 12) {
                    class23 var29 = class310.field4235[var5];
                    if (var29 != null) {
                        class235.field3329 = var8;
                        class238.field3358 = 0;
                        ++class195.field2762;
                        class228.field3231 = var9;
                        class258.field3605 = 2;
                        class131.method793(class20.field351, 115);
                        class366.field5214.method2499(class194.field2757.method531(82, 114) ? 1 : 0, 14584);
                        class366.field5214.method2475(128, var5);
                        class425.method2469(var29.method206(0), true, 0, 12914, class2.field21.field1140[0], var29.field1144[0], var29.method206(0), class2.field21.field1144[0], var29.field1140[0], -2, 0);
                    }
                }
                if (~var4 == -50) {
                    class23 var30 = class310.field4235[var5];
                    if (var30 != null) {
                        class235.field3329 = var8;
                        ++class147.field2076;
                        class258.field3605 = 2;
                        class238.field3358 = 0;
                        class228.field3231 = var9;
                        class131.method793(class325.field4473, -95);
                        class366.field5214.method2458(class194.field2757.method531(82, 99) ? 1 : 0, (byte) 106);
                        class366.field5214.method2475(128, var5);
                        class425.method2469(var30.method206(0), true, 0, 12914, class2.field21.field1140[0], var30.field1144[0], var30.method206(0), class2.field21.field1144[0], var30.field1140[0], -2, 0);
                    }
                }
                if (~var4 == -47) {
                    class238.field3358 = 0;
                    ++class378.field5341;
                    class235.field3329 = var8;
                    class258.field3605 = 2;
                    class228.field3231 = var9;
                    class131.method793(class270.field3738, -64);
                    class366.field5214.method2458(!class194.field2757.method531(82, 70) ? 0 : 1, (byte) 127);
                    class366.field5214.method2453(var3 - -class325.field4472, true);
                    class366.field5214.method2462((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -123);
                    class366.field5214.method2501(class153.field2204 + var2, -128);
                    class396.method2366(0, var3, var6, var2);
                }
                if (class184.field2678) {
                    class7.method84(36);
                }
                if (class67.field998 != null && ~class197.field2836 == -1) {
                    class356.method2141(-126, class67.field998);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)I", line = 909)
    public final int method211(boolean arg0) {
        if (!arg0) {
            this.method193((class487) null, 82);
        }
        ++field431;
        return this.field441.field1413;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lkm;BII)Z", line = 921)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 123) {
            this.method199((class487) null, (byte) 45, -73, 23);
        }
        ++field429;
        class232 var5 = this.field441.method636(super.field1327, false, false, super.field1333, arg0, 65536, (byte) -121);
        if (var5 == null) {
            return false;
        } else {
            class250 var6 = arg0.method1105();
            var6.method1382(super.field1333 + super.field1331, super.field1330, super.field1332 + super.field1327);
            return var5.method75(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Lkm;I)V", line = 941)
    public final void method197(class487 arg0, int arg1) {
        ++field438;
        class232 var3 = this.field441.method636(super.field1327, false, true, super.field1333, arg0, 131072, (byte) -114);
        int var4 = -119 % ((arg1 - 64) / 59);
        if (var3 != null) {
            this.field441.method642(super.field1333 >> 7, super.field1333 >> 7, super.field1327 >> 7, arg0, 122, super.field1327 >> 7, var3, false);
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I", line = 956)
    public final int method212(int arg0) {
        ++field442;
        if (arg0 != 5281) {
            this.field441 = null;
        }
        return this.field441.method640(0);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(Lkm;I)Lto;", line = 972)
    public final class370 method193(class487 arg0, int arg1) {
        ++field434;
        if (arg1 > -6) {
            this.method215(62);
        }
        class232 var3 = this.field441.method636(super.field1327, false, true, super.field1333, arg0, 1024, (byte) -128);
        if (var3 == null) {
            return null;
        } else {
            class250 var4 = arg0.method1105();
            var4.method1382(super.field1333 - -super.field1331, super.field1330, super.field1332 + super.field1327);
            class370 var5 = null;
            if (this.field427) {
                var5 = class277.method1737((byte) 28, 1);
            }
            if (this.field441.field1445 == null) {
                var3.method41(var4, var5 != null ? var5.field5233[0] : null, 0);
            } else {
                class473 var6 = this.field441.field1445.method567();
                arg0.method1063(var3, var6, var4, var5 != null ? var5.field5233[0] : null, 0);
            }
            this.field441.method642(super.field1333 >> 7, super.field1333 >> 7, super.field1327 >> 7, arg0, -16, super.field1327 >> 7, var3, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I", line = 1010)
    public static final int method213(byte arg0, int arg1) {
        ++field432;
        int var2 = 63 & arg1;
        int var3 = arg1 >> 6 & 3;
        if (arg0 != 78) {
            method213((byte) -91, 46);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (~var3 == -3) {
                return 4;
            }
            if (~var3 == -4) {
                return 8;
            }
        } else if (~var2 == -20 || ~var2 == -22) {
            if (~var3 == -1) {
                return 16;
            }
            if (~var3 == -2) {
                return 32;
            }
            if (~var3 == -3) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Z", line = 1064)
    public final boolean method214(int arg0) {
        if (arg0 <= 24) {
            this.field441 = null;
        }
        ++field430;
        return this.field441.method638(0);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lkm;Lcj;IIIIIZIIIIII)V", line = 1075)
    public class24(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class109.method677(-127, arg11, arg12));
        this.field441 = new class101(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field427 = ~arg1.field6681 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I", line = 1084)
    public final int method215(int arg0) {
        ++field435;
        return arg0 != -11524 ? 109 : this.field441.field1444;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lkm;I)V", line = 1095)
    public final void method216(class487 arg0, int arg1) {
        ++field428;
        int var3 = -71 / ((arg1 - -12) / 60);
        this.field441.method645(arg0, true);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 1106)
    public final void method217(boolean arg0) {
        if (!arg0) {
            ++field440;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lkm;I)V", line = 1120)
    public final void method218(class487 arg0, int arg1) {
        if (arg1 <= -73) {
            this.field441.method637(false, arg0);
            ++field433;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)I", line = 1131)
    public final int method219(int arg0) {
        ++field437;
        return arg0 != -17942 ? 104 : this.field441.field1425;
    }
}
