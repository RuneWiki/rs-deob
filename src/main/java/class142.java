import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class142 extends class277 {

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Lcc;")
    private static class209 field2618 = class95.method669(83, "purple:");

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2616 = 0;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lcc;")
    public static class209 field2615 = class95.method669(89, "Jeter");

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Lcc;")
    public static class209 field2624 = class95.method669(119, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Lcc;")
    public static class209 field2621 = field2618;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Lcc;")
    public static class209 field2626 = field2618;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Lcc;")
    private static class209 field2627 = class95.method669(121, "Loading config )2 ");

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lcc;")
    public static class209 field2613 = field2627;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Lsj;")
    public static class49 field2625;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static void method986(int arg0) {
        if (arg0 != -1) {
            field2615 = null;
        }
        field2613 = null;
        field2624 = null;
        field2615 = null;
        field2625 = null;
        field2621 = null;
        field2618 = null;
        field2626 = null;
        field2627 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZB)I")
    public static final int method987(boolean arg0, byte arg1) {
        field2617++;
        if (arg1 > -125) {
            method990(-7, -2, 99, -31, -107, false);
        }
        long var2 = class180.method1236(-109);
        for (class173 var4 = arg0 ? (class173) class94.field1859.method1759((byte) 43) : (class173) class94.field1859.method1767((byte) 41); var4 != null; var4 = (class173) class94.field1859.method1767((byte) 41)) {
            if ((var4.field3161 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3161 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field596;
                    class38.field647[var5] = class284.field4997[var5];
                    var4.method269(-214950896);
                    return var5;
                }
                var4.method269(-214950896);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)Z")
    private static final boolean method988(int arg0, int arg1) {
        if (arg0 != 0) {
            field2615 = null;
        }
        field2628++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILji;)V")
    public static final void method989(int arg0, int arg1, int arg2, class42 arg3) {
        field2619++;
        if (arg3.field849 == 1) {
            class117.field2357++;
            class252.method1740(0L, (byte) 90, arg3.field803, arg3.field779, (short) 39, class246.field4451, 0);
        }
        if (arg1 != -1) {
            field2613 = null;
        }
        if (arg3.field849 == 2 && !class260.field4689) {
            class209 var4 = class44.method330(arg3, arg1 ^ 0xFFFFFF89);
            if (var4 != null) {
                class252.method1740(0L, (byte) 90, var4, arg3.field779, (short) 8, class229.method1604(new class209[] { class19.field375, arg3.field807 }, (byte) 32), -1);
                class253.field4556++;
            }
        }
        if (arg3.field849 == 3) {
            class185.field3323++;
            class252.method1740(0L, (byte) 90, class234.field4208, arg3.field779, (short) 50, class246.field4451, 0);
        }
        if (arg3.field849 == 4) {
            class252.method1740(0L, (byte) 90, arg3.field803, arg3.field779, (short) 58, class246.field4451, 0);
            class284.field5001++;
        }
        if (arg3.field849 == 5) {
            class252.method1740(0L, (byte) 90, arg3.field803, arg3.field779, (short) 59, class246.field4451, 0);
            class191.field3454++;
        }
        if (arg3.field849 == 6 && class86.field1699 == null) {
            class118.field2359++;
            class252.method1740(0L, (byte) 90, arg3.field803, arg3.field779, (short) 17, class246.field4451, -1);
        }
        if (arg3.field810 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field853; var6++) {
                for (int var7 = 0; var7 < arg3.field808; var7++) {
                    int var8 = (arg3.field828 + 32) * var6;
                    int var9 = (arg3.field797 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg3.field698[var5];
                        var8 += arg3.field759[var5];
                    }
                    if (arg2 >= var9 && arg0 >= var8 && var9 + 32 > arg2 && arg0 < var8 + 32) {
                        class246.field4466 = arg3;
                        class195.field3507 = var5;
                        if (arg3.field778[var5] > 0) {
                            class82 var10 = class249.method1728(arg3.field778[var5] - 1, true);
                            if (class25.field445 == 1 && method988(0, client.method1070(arg3))) {
                                if (class156.field2854 != arg3.field779 || class83.field1657 != var5) {
                                    class23.field431++;
                                    class252.method1740((long) var10.field1600, (byte) 90, class124.field2417, arg3.field779, (short) 48, class229.method1604(new class209[] { class114.field2289, class132.field2530, var10.field1629 }, (byte) 37), var5);
                                }
                            } else if (!class260.field4689 || !method988(arg1 + 1, client.method1070(arg3))) {
                                class3.field46++;
                                class209[] var11 = var10.field1632;
                                if (class252.field4533) {
                                    var11 = class40.method302((byte) -66, var11);
                                }
                                if (method988(0, client.method1070(arg3))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class8.field159++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 47;
                                            } else {
                                                var13 = 3;
                                            }
                                            class252.method1740((long) var10.field1600, (byte) 90, var11[var12], arg3.field779, var13, class229.method1604(new class209[] { class35.field608, var10.field1629 }, (byte) 93), var5);
                                        } else if (var12 == 4) {
                                            class252.method1740((long) var10.field1600, (byte) 90, class72.field1359, arg3.field779, (short) 3, class229.method1604(new class209[] { class35.field608, var10.field1629 }, (byte) 96), var5);
                                            class261.field4698++;
                                        }
                                    }
                                }
                                if (class149.method1035(client.method1070(arg3), 19)) {
                                    class252.method1740((long) var10.field1600, (byte) 90, class124.field2417, arg3.field779, (short) 6, class229.method1604(new class209[] { class35.field608, var10.field1629 }, (byte) 124), var5);
                                    class66.field1274++;
                                }
                                if (method988(arg1 + 1, client.method1070(arg3)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            class8.field167++;
                                            if (var14 == 0) {
                                                var15 = 35;
                                            }
                                            if (var14 == 1) {
                                                var15 = 28;
                                            }
                                            if (var14 == 2) {
                                                var15 = 51;
                                            }
                                            class252.method1740((long) var10.field1600, (byte) 90, var11[var14], arg3.field779, var15, class229.method1604(new class209[] { class35.field608, var10.field1629 }, (byte) 90), var5);
                                        }
                                    }
                                }
                                class209[] var16 = arg3.field800;
                                if (class252.field4533) {
                                    var16 = class40.method302((byte) -66, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 36;
                                            }
                                            class290.field5113++;
                                            if (var17 == 1) {
                                                var18 = 57;
                                            }
                                            if (var17 == 2) {
                                                var18 = 18;
                                            }
                                            if (var17 == 3) {
                                                var18 = 15;
                                            }
                                            if (var17 == 4) {
                                                var18 = 40;
                                            }
                                            class252.method1740((long) var10.field1600, (byte) 90, var16[var17], arg3.field779, var18, class229.method1604(new class209[] { class35.field608, var10.field1629 }, (byte) 39), var5);
                                        }
                                    }
                                }
                                class252.method1740((long) var10.field1600, (byte) 90, class33.field582, arg3.field779, (short) 1007, class229.method1604(new class209[] { class35.field608, var10.field1629 }, (byte) 51), var5);
                            } else if ((class49.field948 & 0x10) == 16) {
                                class252.method1740((long) var10.field1600, (byte) 90, class184.field3318, arg3.field779, (short) 32, class229.method1604(new class209[] { class44.field879, class132.field2530, var10.field1629 }, (byte) 59), var5);
                                class54.field1068++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field795) {
            return;
        }
        if (!class260.field4689) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class209 var23 = class9.method88(var19, 123, arg3);
                if (var23 != null) {
                    class252.method1740((long) (var19 + 1), (byte) 90, var23, arg3.field779, (short) 1003, arg3.field799, arg3.field721);
                    class23.field427++;
                }
            }
            class209 var20 = class44.method330(arg3, 114);
            if (var20 != null) {
                class252.method1740(0L, (byte) 90, var20, arg3.field779, (short) 8, arg3.field799, arg3.field721);
                class253.field4556++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class209 var22 = class9.method88(var21, 112, arg3);
                if (var22 != null) {
                    class23.field427++;
                    class252.method1740((long) (var21 + 1), (byte) 90, var22, arg3.field779, (short) 43, arg3.field799, arg3.field721);
                }
            }
            if (class104.method709(client.method1070(arg3), false)) {
                class252.method1740(0L, (byte) 90, class93.field1834, arg3.field779, (short) 17, class246.field4451, arg3.field721);
                class118.field2359++;
                return;
            }
            return;
        }
        if (class52.method392(1, client.method1070(arg3)) && (class49.field948 & 0x20) == 32) {
            class205.field3656++;
            class252.method1740(0L, (byte) 90, class184.field3318, arg3.field779, (short) 13, class229.method1604(new class209[] { class44.field879, class99.field1933, arg3.field799 }, (byte) 87), arg3.field721);
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method990(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg0 < arg2) {
            arg0 = 1;
        }
        class256.field4627 = (short) arg3;
        class98.field1919 = (short) arg0;
        field2622++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static final void method991(boolean arg0) {
        field2623++;
        if (class168.field3023 == 0 || class168.field3023 == 5) {
            return;
        }
        try {
            if (++class262.field4727 > 2000) {
                if (class193.field3488 != null) {
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                }
                if (class79.field1471 >= 1) {
                    class168.field3023 = 0;
                    class8.field164 = -5;
                    return;
                }
                class79.field1471++;
                class262.field4727 = 0;
                if (class59.field1186 == class45.field898) {
                    class45.field898 = class155.field2845;
                } else {
                    class45.field898 = class59.field1186;
                }
                class168.field3023 = 1;
            }
            if (class168.field3023 == 1) {
                class246.field4458 = class230.field4187.method994(class45.field898, -32322, class64.field1255);
                class168.field3023 = 2;
            }
            if (class168.field3023 == 2) {
                if (class246.field4458.field3646 == 2) {
                    throw new IOException();
                }
                if (class246.field4458.field3646 != 1) {
                    return;
                }
                class193.field3488 = new class285((Socket) class246.field4458.field3642, class230.field4187);
                class246.field4458 = null;
                long var1 = class265.field4761 = class246.field4467.method1448(!arg0);
                class84.field1677.field2085 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class84.field1677.method773(-6385, 14);
                class84.field1677.method773(-6385, var3);
                class193.field3488.method1921(class84.field1677.field2108, 2, -32362, 0);
                if (class95.field1876 != null) {
                    class95.field1876.method66((byte) -59);
                }
                if (class227.field4148 != null) {
                    class227.field4148.method66((byte) -59);
                }
                int var4 = class193.field3488.method1918((byte) -68);
                if (class95.field1876 != null) {
                    class95.field1876.method66((byte) -59);
                }
                if (class227.field4148 != null) {
                    class227.field4148.method66((byte) -59);
                }
                if (var4 != 0) {
                    class168.field3023 = 0;
                    class8.field164 = var4;
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                    return;
                }
                class168.field3023 = 3;
            }
            if (arg0) {
                field2624 = null;
            }
            if (class168.field3023 == 3) {
                if (class193.field3488.method1915(1) < 8) {
                    return;
                }
                class193.field3488.method1922(client.field2818.field2108, 0, -1, 8);
                client.field2818.field2085 = 0;
                int[] var5 = new int[4];
                class72.field1378 = client.field2818.method753(9444);
                var5[3] = (int) class72.field1378;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class72.field1378 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class84.field1677.field2085 = 0;
                class84.field1677.method773(-6385, 10);
                class84.field1677.method758(var5[0], 1469334200);
                class84.field1677.method758(var5[1], 1469334200);
                class84.field1677.method758(var5[2], 1469334200);
                class84.field1677.method758(var5[3], 1469334200);
                class84.field1677.method756(class246.field4467.method1448(true), (byte) 107);
                class84.field1677.method745(class246.field4463, (byte) 70);
                class84.field1677.method727(-100, class234.field4211, class129.field2477);
                class253.field4561.field2085 = 0;
                if (class284.field5008 == 40) {
                    class253.field4561.method773(-6385, 18);
                } else {
                    class253.field4561.method773(-6385, 16);
                }
                class253.field4561.method740(255, class84.field1677.field2085 + class254.method1750(true, client.field2812) + 159);
                class253.field4561.method758(523, 1469334200);
                class253.field4561.method773(-6385, class84.field1675);
                class253.field4561.method773(-6385, class132.field2532 ? 1 : 0);
                class253.field4561.method773(-6385, 0);
                class253.field4561.method773(-6385, class258.method1788(46));
                class253.field4561.method740(255, class25.field442);
                class253.field4561.method740(255, class50.field981);
                class253.field4561.method773(-6385, class163.field2960);
                class94.method660(class253.field4561, -32030);
                class253.field4561.method745(client.field2812, (byte) -108);
                class253.field4561.method758(class60.field1210, 1469334200);
                class253.field4561.method758(class245.method1713(-119), 1469334200);
                class223.field4068 = true;
                class253.field4561.method740(255, class264.field4732);
                class253.field4561.method758(class79.field1472.method375(true), 1469334200);
                class253.field4561.method758(class187.field3365.method375(true), 1469334200);
                class253.field4561.method758(class243.field4402.method375(true), 1469334200);
                class253.field4561.method758(class13.field235.method375(!arg0), 1469334200);
                class253.field4561.method758(class82.field1652.method375(true), 1469334200);
                class253.field4561.method758(class149.field2729.method375(true), 1469334200);
                class253.field4561.method758(class279.field4902.method375(true), 1469334200);
                class253.field4561.method758(class38.field648.method375(!arg0), 1469334200);
                class253.field4561.method758(class53.field1056.method375(true), 1469334200);
                class253.field4561.method758(class257.field4647.method375(true), 1469334200);
                class253.field4561.method758(class185.field3326.method375(!arg0), 1469334200);
                class253.field4561.method758(class275.field4860.method375(!arg0), 1469334200);
                class253.field4561.method758(class102.field1963.method375(true), 1469334200);
                class253.field4561.method758(class56.field1156.method375(true), 1469334200);
                class253.field4561.method758(class163.field2955.method375(!arg0), 1469334200);
                class253.field4561.method758(class247.field4472.method375(true), 1469334200);
                class253.field4561.method758(class238.field4305.method375(true), 1469334200);
                class253.field4561.method758(class11.field227.method375(true), 1469334200);
                class253.field4561.method758(class124.field2422.method375(true), 1469334200);
                class253.field4561.method758(class158.field2887.method375(true), 1469334200);
                class253.field4561.method758(class97.field1905.method375(true), 1469334200);
                class253.field4561.method758(class191.field3458.method375(true), 1469334200);
                class253.field4561.method758(class288.field5086.method375(true), 1469334200);
                class253.field4561.method758(class174.field3175.method375(!arg0), 1469334200);
                class253.field4561.method758(class69.field1323.method375(true), 1469334200);
                class253.field4561.method758(class163.field2963.method375(!arg0), 1469334200);
                class253.field4561.method758(class206.field3687.method375(true), 1469334200);
                class253.field4561.method758(class40.field681.method375(true), 1469334200);
                class253.field4561.method743(class84.field1677.field2108, 0, class84.field1677.field2085, -30266);
                class193.field3488.method1921(class253.field4561.field2108, class253.field4561.field2085, -32362, 0);
                class84.field1677.method296(var5, -118);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                client.field2818.method296(var5, -122);
                class168.field3023 = 4;
            }
            if (class168.field3023 == 4) {
                if (class193.field3488.method1915(1) < 1) {
                    return;
                }
                int var7 = class193.field3488.method1918((byte) 82);
                if (var7 == 21) {
                    class168.field3023 = 7;
                } else if (var7 == 29) {
                    class168.field3023 = 10;
                } else if (var7 == 1) {
                    class168.field3023 = 5;
                    class8.field164 = var7;
                    return;
                } else if (var7 == 2) {
                    class168.field3023 = 8;
                } else if (var7 == 15) {
                    class168.field3023 = 0;
                    class8.field164 = var7;
                    return;
                } else if (var7 == 23 && class79.field1471 < 1) {
                    class79.field1471++;
                    class262.field4727 = 0;
                    class168.field3023 = 1;
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                    return;
                } else {
                    class168.field3023 = 0;
                    class8.field164 = var7;
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                    return;
                }
            }
            if (class168.field3023 == 6) {
                class84.field1677.field2085 = 0;
                class84.field1677.method287((byte) 123, 17);
                class193.field3488.method1921(class84.field1677.field2108, class84.field1677.field2085, -32362, 0);
                class168.field3023 = 4;
            } else if (class168.field3023 == 7) {
                if (class193.field3488.method1915(1) >= 1) {
                    class129.field2488 = (class193.field3488.method1918((byte) -51) + 3) * 60;
                    class8.field164 = 21;
                    class168.field3023 = 0;
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                }
            } else if (class168.field3023 != 10) {
                if (class168.field3023 == 8) {
                    if (class193.field3488.method1915(1) < 14) {
                        return;
                    }
                    class193.field3488.method1922(client.field2818.field2108, 0, -1, 14);
                    client.field2818.field2085 = 0;
                    class198.field3550 = client.field2818.method774((byte) 79);
                    class224.field4084 = client.field2818.method774((byte) 95);
                    class250.field4505 = client.field2818.method774((byte) 113) == 1;
                    class68.field1304 = client.field2818.method774((byte) 104) == 1;
                    class161.field2921 = client.field2818.method774((byte) 117) == 1;
                    class252.field4534 = client.field2818.method774((byte) 88) == 1;
                    class64.field1244 = client.field2818.method774((byte) 121) == 1;
                    class174.field3179 = client.field2818.method736(125);
                    class92.field1815 = client.field2818.method774((byte) 98) == 1;
                    class90.field1761 = client.field2818.method774((byte) 97) == 1;
                    class87.method631(255, class90.field1761);
                    class59.method451(89, class90.field1761);
                    if (!class132.field2532) {
                        if ((!class250.field4505 || class161.field2921) && !class92.field1815) {
                            try {
                                class229.field4170.method1463(class230.field4187.field2638, (byte) 110);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class257.field4641.method1463(class230.field4187.field2638, (byte) 110);
                            } catch (Throwable var8) {
                            }
                        }
                    }
                    class254.field4590 = client.field2818.method290(8);
                    class112.field2253 = client.field2818.method736(125);
                    class168.field3023 = 9;
                }
                if (class168.field3023 == 9 && class193.field3488.method1915(1) >= class112.field2253) {
                    client.field2818.field2085 = 0;
                    class193.field3488.method1922(client.field2818.field2108, 0, -1, class112.field2253);
                    class168.field3023 = 0;
                    class8.field164 = 2;
                    class196.method1346((byte) 96);
                    class220.field4005 = -1;
                    class99.method694(26441, false);
                    class254.field4590 = -1;
                }
            } else if (class193.field3488.method1915(1) >= 1) {
                class195.field3516 = class193.field3488.method1918((byte) 68);
                class8.field164 = 29;
                class168.field3023 = 0;
                class193.field3488.method1924(false);
                class193.field3488 = null;
            }
        } catch (IOException var10) {
            if (class193.field3488 != null) {
                class193.field3488.method1924(arg0);
                class193.field3488 = null;
            }
            if (class79.field1471 >= 1) {
                class168.field3023 = 0;
                class8.field164 = -4;
            } else {
                class262.field4727 = 0;
                if (class59.field1186 == class45.field898) {
                    class45.field898 = class155.field2845;
                } else {
                    class45.field898 = class59.field1186;
                }
                class168.field3023 = 1;
                class79.field1471++;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V")
    public static final void method992(int arg0, int arg1) {
        field2620++;
        class279.field4919 = -1;
        if (arg1 != -8949) {
            field2613 = null;
        }
        if (arg0 == 37) {
            class11.field224 = 3.0F;
        } else if (arg0 == 50) {
            class11.field224 = 4.0F;
        } else if (arg0 == 75) {
            class11.field224 = 6.0F;
        } else {
            class11.field224 = 8.0F;
        }
        class279.field4919 = -1;
    }
}
