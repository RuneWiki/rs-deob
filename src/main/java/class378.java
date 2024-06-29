import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class378 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "S")
    public static short field5528 = 32767;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field5530 = 0;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field5531 = 3;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILtj;Lsj;I)V", line = 3)
    public static final void method2465(int arg0, int arg1, class298 arg2, class248 arg3, int arg4) {
        field5529++;
        class421 var5 = arg3.method1620(0, arg2);
        if (arg4 != 4) {
            field5528 = 45;
        }
        if (var5 == null) {
            return;
        }
        arg2.method462(arg1, arg0, arg1 + arg3.field3531, arg0 - -arg3.field3564);
        if (class163.field2223 == 2 || class163.field2223 == 5 || class322.field4804 == null) {
            arg2.method515(-16777216, var5, arg1, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class212.field2884 == 4) {
            var7 = 4096;
            var8 = (int) (-class247.field3479) & 0x3FFF;
            var6 = class7.field96;
            var9 = class334.field4904;
        } else {
            var6 = class383.field5609.field5930;
            var7 = 4096 - (class30.field484 * 16);
            var8 = (int) (-class247.field3479) + class93.field1268 & 0x3FFF;
            var9 = class383.field5609.field5921;
        }
        int var10 = var9 / 32 + 48 - ((class351.field5217 - 104) * 2);
        int var11 = class143.field1815 * 4 + (-(class143.field1815 * 2) - -208) + 48 - var6 / 32;
        class322.field4804.method2071((float) arg3.field3531 / 2.0F + (float) arg1, (float) arg3.field3564 / 2.0F + (float) arg0, (float) var10, (float) var11, var7, var8 << 2, var5, arg1, arg0);
        for (class17 var12 = (class17) class149.field1887.method1575(arg4 - 4); var12 != null; var12 = (class17) class149.field1887.method1573((byte) -128)) {
            int var50 = var12.field274;
            int var51 = (class162.field2130.field3984[var50] >> 14 & 0x3FFF) - class236.field3292;
            int var52 = (class162.field2130.field3984[var50] & 0x3FFF) - class90.field1223;
            int var53 = var51 * 4 + 2 - (var9 / 32);
            int var54 = var52 * 4 + 2 - (var6 / 32);
            class212.method1400(var54, var5, class162.field2130.field3979[var50], arg0, arg2, arg3, var53, arg4 - 9907, arg1);
        }
        for (int var13 = 0; var13 < class330.field4868; var13++) {
            int var47 = class78.field1094[var13] * 4 - (var9 / 32 - 2);
            int var48 = class271.field3996[var13] * 4 + 2 - (var6 / 32);
            class212 var49 = class372.method2447(class443.field6398[var13], (byte) -96);
            if (var49.field2944 != null) {
                var49 = var49.method1387((byte) -53);
                if (var49 == null || var49.field2940 == -1) {
                    continue;
                }
            }
            class212.method1400(var48, var5, var49.field2940, arg0, arg2, arg3, var47, -9903, arg1);
        }
        for (class171 var14 = (class171) class267.field3962.method2812(15710); var14 != null; var14 = (class171) class267.field3962.method2819((byte) 121)) {
            int var44 = (int) (var14.field6091 >> 28 & 0x3L);
            if (class94.field1279 == var44) {
                int var45 = (int) (var14.field6091 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                int var46 = (int) (var14.field6091 >> 14 & 0x3FFFL) * 4 + 2 - var6 / 32;
                client.method393(arg3, arg0, arg1, class237.field3307[0], var46, var45, 2, var5);
            }
        }
        for (int var15 = 0; var15 < class93.field1274; var15++) {
            class163 var40 = class388.field5670[class62.field943[var15]];
            if (var40 != null && var40.method1100(8129)) {
                class189 var41 = var40.field2206;
                if (var41 != null && var41.field2575 != null) {
                    var41 = var41.method1253(-1);
                }
                if (var41 != null && var41.field2585 && var41.field2630) {
                    int var42 = var40.field5921 / 32 - (var9 / 32);
                    int var43 = var40.field5930 / 32 - var6 / 32;
                    if (var41.field2612 == -1) {
                        client.method393(arg3, arg0, arg1, class237.field3307[1], var43, var42, arg4 - 2, var5);
                    } else {
                        class212.method1400(var43, var5, var41.field2612, arg0, arg2, arg3, var42, -9903, arg1);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class402.field5869; var16++) {
            class317 var32 = class176.field2382[class117.field1528[var16]];
            if (var32 != null && var32.method2077(8129)) {
                int var33 = var32.field5921 / 32 - (var9 / 32);
                int var34 = var32.field5930 / 32 - (var6 / 32);
                boolean var35 = false;
                for (int var36 = 0; var36 < class391.field5714; var36++) {
                    if (var32.field4650.equals(class30.field488[var36]) && class362.field5368[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class402.field5873; var38++) {
                    if (var32.field4650.equals(class43.field637[var38].field996)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class383.field5609.field4663 != 0 && var32.field4663 != 0 && class383.field5609.field4663 == var32.field4663) {
                    var39 = true;
                }
                if (var35) {
                    client.method393(arg3, arg0, arg1, class237.field3307[3], var34, var33, arg4 ^ 0x6, var5);
                } else if (var37) {
                    client.method393(arg3, arg0, arg1, class237.field3307[5], var34, var33, 2, var5);
                } else if (var39) {
                    client.method393(arg3, arg0, arg1, class237.field3307[4], var34, var33, 2, var5);
                } else {
                    client.method393(arg3, arg0, arg1, class237.field3307[2], var34, var33, 2, var5);
                }
            }
        }
        class198[] var17 = class349.field5195;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class198 var21 = var17[var18];
            if (var21 != null && var21.field2741 != 0 && (class231.field3179 % 20) < 10) {
                if (var21.field2741 == 1 && var21.field2729 >= 0 && class388.field5670.length > var21.field2729) {
                    class163 var22 = class388.field5670[var21.field2729];
                    if (var22 != null) {
                        int var23 = var22.field5921 / 32 - (var9 / 32);
                        int var24 = var22.field5930 / 32 - (var6 / 32);
                        class186.method1243(var23, var21.field2732, 360000, 120, arg3, arg0, arg1, var5, var24);
                    }
                }
                if (var21.field2741 == 2) {
                    int var25 = (var21.field2739 - class236.field3292) * 4 + 2 - var9 / 32;
                    int var26 = (var21.field2734 - class90.field1223) * 4 + 2 - (var6 / 32);
                    int var27 = var21.field2733 * 4;
                    int var28 = var27 * var27;
                    class186.method1243(var25, var21.field2732, var28, arg4 ^ 0x71, arg3, arg0, arg1, var5, var26);
                }
                if (var21.field2741 == 10 && var21.field2729 >= 0 && class176.field2382.length > var21.field2729) {
                    class317 var29 = class176.field2382[var21.field2729];
                    if (var29 != null) {
                        int var30 = var29.field5921 / 32 - var9 / 32;
                        int var31 = var29.field5930 / 32 - (var6 / 32);
                        class186.method1243(var30, var21.field2732, 360000, 102, arg3, arg0, arg1, var5, var31);
                    }
                }
            }
        }
        if (class212.field2884 == 4) {
            return;
        }
        if (class47.field712 != 0) {
            int var19 = class47.field712 * 4 + (class383.field5609.method1091((byte) 31) * 2) - (var9 / 32);
            int var20 = class142.field1805 * 4 + (class383.field5609.method1091((byte) 87) + -1) * 2 + 2 - (var6 / 32);
            client.method393(arg3, arg0, arg1, class255.field3720[class400.field5859 ? 1 : 0], var20, var19, 2, var5);
        }
        arg2.method2023(3, arg3.field3531 / 2 + arg1 - 1, arg3.field3564 / 2 + arg0 + -1, -11682, 3, -1);
        return;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 290)
    public static final void method2466(int arg0) {
        class176.field2376 = new class242();
        field5526++;
        int var1 = 16 % ((arg0 + 78) / 42);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILsj;II)V", line = 303)
    public static final void method2467(int arg0, class248 arg1, int arg2, int arg3) {
        field5527++;
        if (arg1.field3614 == 1) {
            class405.field5889++;
            class24.method213(arg1.field3636, arg1.field3660, "", -1, (byte) 117, 0L, 0, 22);
        }
        if (arg1.field3614 == 2 && !class263.field3862) {
            String var4 = class296.method2006(arg1, -99);
            if (var4 != null) {
                class24.method213(arg1.field3636, var4, "<col=00ff00>" + arg1.field3529, -1, (byte) 127, 0L, -1, 50);
                class109.field1424++;
            }
        }
        if (arg1.field3614 == 3) {
            class223.field3071++;
            class24.method213(arg1.field3636, class48.field727, "", -1, (byte) 117, 0L, 0, 11);
        }
        if (arg1.field3614 == 4) {
            class24.method213(arg1.field3636, arg1.field3660, "", -1, (byte) 120, 0L, 0, 2);
            class370.field5463++;
        }
        if (arg1.field3614 == 5) {
            class190.field2648++;
            class24.method213(arg1.field3636, arg1.field3660, "", -1, (byte) 97, 0L, 0, 26);
        }
        if (arg1.field3614 == 6 && class415.field6015 == null) {
            class24.method213(arg1.field3636, arg1.field3660, "", -1, (byte) 114, 0L, -1, 59);
            class423.field6165++;
        }
        if (arg1.field3555 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field3661; var6++) {
                for (int var7 = 0; var7 < arg1.field3567; var7++) {
                    int var8 = (arg1.field3519 + 32) * var7;
                    int var9 = (arg1.field3664 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field3645[var5];
                        var8 += arg1.field3612[var5];
                    }
                    if (arg2 >= var8 && arg3 >= var9 && arg2 < var8 + 32 && arg3 < var9 + 32) {
                        class348.field5177 = arg1;
                        class210.field2854 = var5;
                        if (arg1.field3651[var5] > 0) {
                            class226 var10 = client.method402(arg1);
                            class159 var11 = class129.method915(126, arg1.field3651[var5] - 1);
                            if (class117.field1526 == 1 && var10.method1473(-425613281)) {
                                if (class204.field2818 != arg1.field3636 || class211.field2863 != var5) {
                                    class24.method213(arg1.field3636, class429.field6239, class369.field5455 + " -> <col=ff9040>" + var11.field2068, class407.field5935, (byte) 127, (long) var11.field2032, var5, 21);
                                    class30.field489++;
                                }
                            } else if (class263.field3862 && var10.method1473(-425613281)) {
                                class154 var12 = class144.field1847 == -1 ? null : class410.method2595(-22867, class144.field1847);
                                if ((class45.field682 & 0x10) != 0 && (var12 == null || var11.method1058(0, class144.field1847, var12.field1960) != var12.field1960)) {
                                    class24.method213(arg1.field3636, class298.field4505, class396.field5787 + " -> <col=ff9040>" + var11.field2068, class388.field5685, (byte) 119, (long) var11.field2032, var5, 33);
                                    class356.field5272++;
                                }
                            } else {
                                String[] var13 = var11.field2035;
                                if (var10.method1473(-425613281)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            int var15 = -1;
                                            byte var16;
                                            if (var14 == 3) {
                                                var16 = 15;
                                            } else {
                                                var16 = 30;
                                            }
                                            if (var11.field2022 == var14) {
                                                var15 = var11.field2028;
                                            }
                                            if (var11.field2055 == var14) {
                                                var15 = var11.field2067;
                                            }
                                            class24.method213(arg1.field3636, var13[var14], "<col=ff9040>" + var11.field2068, var15, (byte) 116, (long) var11.field2032, var5, var16);
                                            class240.field3362++;
                                        }
                                    }
                                }
                                if (var10.method1468(70)) {
                                    class24.method213(arg1.field3636, class429.field6239, "<col=ff9040>" + var11.field2068, class407.field5935, (byte) 110, (long) var11.field2032, var5, 3);
                                    class127.field1657++;
                                }
                                if (var10.method1473(-425613281) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 8;
                                            }
                                            int var19 = -1;
                                            if (var17 == 1) {
                                                var18 = 4;
                                            }
                                            if (var17 == 2) {
                                                var18 = 47;
                                            }
                                            if (var11.field2022 == var17) {
                                                var19 = var11.field2028;
                                            }
                                            if (var11.field2055 == var17) {
                                                var19 = var11.field2067;
                                            }
                                            class24.method213(arg1.field3636, var13[var17], "<col=ff9040>" + var11.field2068, var19, (byte) 107, (long) var11.field2032, var5, var18);
                                            class294.field4439++;
                                        }
                                    }
                                }
                                String[] var20 = arg1.field3623;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            int var23 = -1;
                                            if (var21 == 0) {
                                                var22 = 1;
                                            }
                                            if (var21 == 1) {
                                                var22 = 41;
                                            }
                                            if (var21 == 2) {
                                                var22 = 60;
                                            }
                                            if (var21 == 3) {
                                                var22 = 5;
                                            }
                                            if (var21 == 4) {
                                                var22 = 13;
                                            }
                                            if (var11.field2022 == var21) {
                                                var23 = var11.field2028;
                                            }
                                            if (var11.field2055 == var21) {
                                                var23 = var11.field2067;
                                            }
                                            class24.method213(arg1.field3636, var20[var21], "<col=ff9040>" + var11.field2068, var23, (byte) 120, (long) var11.field2032, var5, var22);
                                            class4.field53++;
                                        }
                                    }
                                }
                                class155.field1972++;
                                class24.method213(arg1.field3636, class337.field4982, "<col=ff9040>" + var11.field2068, class387.field5664, (byte) 112, (long) var11.field2032, var5, 1002);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        int var24 = 28 % ((-arg0 - 2) / 56);
        if (!arg1.field3537) {
            return;
        }
        if (class263.field3862) {
            if (client.method402(arg1).method1475(1891201) && (class45.field682 & 0x20) != 0) {
                class397.field5790++;
                class24.method213(arg1.field3636, class298.field4505, class396.field5787 + " -> " + arg1.field3585, class388.field5685, (byte) 98, 0L, arg1.field3505, 51);
                return;
            }
            return;
        }
        for (int var25 = 9; var25 >= 5; var25--) {
            String var29 = class24.method218(var25, (byte) 86, arg1);
            if (var29 != null) {
                class109.field1429++;
                class24.method213(arg1.field3636, var29, arg1.field3585, class279.method1834(var25, arg1, -18822), (byte) 118, (long) (var25 + 1), arg1.field3505, 1008);
            }
        }
        String var26 = class296.method2006(arg1, -81);
        if (var26 != null) {
            class24.method213(arg1.field3636, var26, arg1.field3585, -1, (byte) 126, 0L, arg1.field3505, 50);
            class109.field1424++;
        }
        for (int var27 = 4; var27 >= 0; var27--) {
            String var28 = class24.method218(var27, (byte) 107, arg1);
            if (var28 != null) {
                class109.field1429++;
                class24.method213(arg1.field3636, var28, arg1.field3585, class279.method1834(var27, arg1, -18822), (byte) 111, (long) (var27 + 1), arg1.field3505, 6);
            }
        }
        if (!client.method402(arg1).method1474(-32400)) {
            return;
        }
        if (arg1.field3672 == null) {
            class24.method213(arg1.field3636, class27.field463, "", -1, (byte) 117, 0L, arg1.field3505, 59);
        } else {
            class24.method213(arg1.field3636, arg1.field3672, "", -1, (byte) 103, 0L, arg1.field3505, 59);
        }
        class423.field6165++;
        return;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 639)
    public static final void method2468(int arg0) {
        class51 var1 = class223.field3073;
        synchronized (class223.field3073) {
            class223.field3073.method366(126);
        }
        if (arg0 != 0) {
            field5531 = 99;
        }
        field5525++;
    }
}
