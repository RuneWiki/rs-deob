import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class252 extends class234 {

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Lmo;")
    public static class271 field4096 = new class271(0, 5);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method1791(int arg0) {
        field4096 = null;
        if (arg0 != 6695) {
            field4096 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLza;)V")
    public static final void method1792(byte arg0, class299 arg1) {
        field4095++;
        arg1.method571(0, 0, class169.field2570, 350);
        if (arg0 <= 59) {
            return;
        }
        arg1.method506(0, 0, class169.field2570, 350, class71.field1130 << 24 | 0x332277, 1);
        int var2 = 350 / class74.field1266;
        if (class182.field2784 > 0) {
            int var3 = 342 - class74.field1266;
            int var4 = var2 * var3 / (class182.field2784 + var2 - 1);
            int var5 = 4;
            if (class182.field2784 > 1) {
                var5 += (class182.field2784 - class193.field2966 - 1) * (var3 - var4) / (class182.field2784 - 1);
            }
            arg1.method506(class169.field2570 - 16, var5, 12, var4, class71.field1130 << 24 | 0x332277, 2);
            for (int var6 = class193.field2966; var6 < (class193.field2966 + var2) && var6 < class182.field2784; var6++) {
                String[] var7 = class454.method2784('\b', 1, class86.field1415[var6]);
                int var8 = (class169.field2570 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method571(var10, 0, var8 + var10 - 8, 350);
                    class54.field833.method2052(-16777216, var7[var9], -1, true, var10, 350 - (class114.field1755.field316 + 2) - class86.field1390 - (-class193.field2966 + var6) * class74.field1266);
                }
            }
        }
        arg1.method571(0, 0, class169.field2570, 350);
        arg1.method1986(1, -1, 0, class169.field2570, 350 - class86.field1390);
        class441.field6573.method2052(-16777216, "--> " + class406.field6002, -1, true, 10, 350 - class447.field6643.field316 - 1);
        int var11 = -1;
        if (class446.field6625 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method1987((byte) -79, var11, 12, 339 - class447.field6643.field316, class447.field6643.method174("--> " + class406.field6002.substring(0, class489.field7141), (byte) -111) + 10);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLza;I)V")
    public static final void method1793(int arg0, byte arg1, class299 arg2, int arg3) {
        field4093++;
        if (arg0 < 0 || arg3 < 0 || class110.field1653 == 0 || class282.field4408 == 0) {
            return;
        }
        if (arg1 >= -31) {
            method1792((byte) 8, null);
        }
        arg2.method541(class155.field2388, class109.field1643, class110.field1653, class282.field4408);
        arg2.method571(class30.field336, class100.field1537, class110.field1653, class282.field4408);
        class517 var4 = arg2.method496();
        var4.method955(class468.field6891, class337.field5071, class407.field6016, client.field7546, class299.field4593, class372.field5520);
        arg2.method582(var4);
        if (class274.field4306 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method537();
            int var8 = (arg0 - class155.field2388) * var7 / class110.field1653;
            int var9 = (arg3 - class109.field1643) * var7 / class282.field4408;
            int var10 = arg2.method547();
            int var11 = (arg0 - class155.field2388) * var10 / class110.field1653;
            int var12 = (arg3 - class109.field1643) * var10 / class282.field4408;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method958(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method958(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class338.field5076 > var20 && var22 < class250.field4077) {
                    int var23 = class116.field1781.field1274;
                    if (var23 < 3 && (class229.field3460[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class274.field4306[var23].method68(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class116.field1781.method3045(0) - 1 << 6) + var19 >> 7;
                        var6 = (class116.field1781.method3045(0) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class2.field17 && (class166.field2500 & 0x40) != 0) {
                    class38 var24 = class327.method2148(class442.field6585, -7153, class291.field4510);
                    if (var24 == null) {
                        class62.method415(false);
                    } else {
                        class423.method2637(0L, -1, var5, (byte) -113, true, 21, class218.field3297, class246.field3688, false, var6, " ->");
                    }
                } else {
                    if (class401.field5923 == class268.field4258) {
                        class423.method2637(0L, -1, var5, (byte) -113, true, 45, class531.field7763.method1265(class345.field5141, -63), -1, false, var6, "");
                    }
                    class355.field5257++;
                    class423.method2637(0L, -1, var5, (byte) -113, true, 6, class385.field5672, class193.field2968, false, var6, "");
                }
            }
        }
        class150 var25 = class103.field1592;
        for (class293 var26 = (class293) var25.method1076((byte) 119); var26 != null; var26 = (class293) var25.method1077(-1)) {
            if ((class529.field7737 || class116.field1781.field1274 == var26.field4531) && var26.method1960(100, arg0, arg3, arg2)) {
                if (var26.field4527 instanceof class511) {
                    class511 var27 = (class511) var26.field4527;
                    int var28 = var27.method3045(0);
                    if ((var28 & 0x1) == 0 && (var27.field1275 & 0x7F) == 0 && (var27.field1279 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1275 & 0x7F) == 64 && (var27.field1279 & 0x7F) == 64) {
                        int var29 = var27.field1275 - (var27.method3045(0) - 1 << 6);
                        int var30 = var27.field1279 - (var27.method3045(0) - 1 << 6);
                        for (int var31 = 0; var31 < class231.field3482; var31++) {
                            class5 var38 = (class5) class366.field5398.method358((byte) -119, (long) class234.field3513[var31]);
                            if (var38 != null) {
                                class46 var39 = var38.field65;
                                if (class446.field6625 != var39.field7575 && var39.field7568) {
                                    int var40 = var39.field1275 - (var39.field718.field2594 - 1 << 6);
                                    int var41 = var39.field1279 - (var39.field718.field2594 - 1 << 6);
                                    if (var40 >= var29 && var39.field718.field2594 <= (var27.method3045(0) - (var40 - var29 >> 7)) && var41 >= var30 && var39.field718.field2594 <= var27.method3045(0) - (var41 - var30 >> 7)) {
                                        class238.method1608(var39, 24986, class116.field1781.field1274 != var26.field4531);
                                        var39.field7575 = class446.field6625;
                                    }
                                }
                            }
                        }
                        int var32 = class422.field6205;
                        int[] var33 = class506.field7363;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class511 var35 = class530.field7747[var33[var34]];
                            if (var35 != null && class446.field6625 != var35.field7575 && var27 != var35 && var35.field7568) {
                                int var36 = var35.field1275 - (var35.method3045(0) - 1 << 6);
                                int var37 = var35.field1279 - (var35.method3045(0) - 1 << 6);
                                if (var36 >= var29 && var35.method3045(0) <= var27.method3045(0) - (var36 - var29 >> 7) && var30 <= var37 && var35.method3045(0) <= (var27.method3045(0) - (var37 - var30 >> 7))) {
                                    class258.method1818(16706, var35, class116.field1781.field1274 != var26.field4531);
                                    var35.field7575 = class446.field6625;
                                }
                            }
                        }
                    }
                    if (class446.field6625 == var27.field7575) {
                        continue;
                    }
                    class258.method1818(16706, var27, class116.field1781.field1274 != var26.field4531);
                    var27.field7575 = class446.field6625;
                }
                if (var26.field4527 instanceof class46) {
                    class46 var42 = (class46) var26.field4527;
                    if (var42.field718 != null) {
                        if ((var42.field718.field2594 & 0x1) == 0 && (var42.field1275 & 0x7F) == 0 && (var42.field1279 & 0x7F) == 0 || (var42.field718.field2594 & 0x1) == 1 && (var42.field1275 & 0x7F) == 64 && (var42.field1279 & 0x7F) == 64) {
                            int var43 = var42.field1275 - (var42.field718.field2594 - 1 << 6);
                            int var44 = var42.field1279 - (var42.field718.field2594 - 1 << 6);
                            for (int var45 = 0; var45 < class231.field3482; var45++) {
                                class5 var52 = (class5) class366.field5398.method358((byte) -117, (long) class234.field3513[var45]);
                                if (var52 != null) {
                                    class46 var53 = var52.field65;
                                    if (class446.field6625 != var53.field7575 && var42 != var53 && var53.field7568) {
                                        int var54 = var53.field1275 - (var53.field718.field2594 - 1 << 6);
                                        int var55 = var53.field1279 - (var53.field718.field2594 - 1 << 6);
                                        if (var54 >= var43 && var53.field718.field2594 <= (var42.field718.field2594 - (var54 - var43 >> 7)) && var44 <= var55 && (var42.field718.field2594 - (var55 - var44 >> 7)) >= var53.field718.field2594) {
                                            class238.method1608(var53, 24986, class116.field1781.field1274 != var26.field4531);
                                            var53.field7575 = class446.field6625;
                                        }
                                    }
                                }
                            }
                            int var46 = class422.field6205;
                            int[] var47 = class506.field7363;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class511 var49 = class530.field7747[var47[var48]];
                                if (var49 != null && class446.field6625 != var49.field7575 && var49.field7568) {
                                    int var50 = var49.field1275 - (var49.method3045(0) - 1 << 6);
                                    int var51 = var49.field1279 - (var49.method3045(0) - 1 << 6);
                                    if (var50 >= var43 && var49.method3045(0) <= (var42.field718.field2594 - (var50 - var43 >> 7)) && var51 >= var44 && var49.method3045(0) <= var42.field718.field2594 - (var51 - var44 >> 7)) {
                                        class258.method1818(16706, var49, class116.field1781.field1274 != var26.field4531);
                                        var49.field7575 = class446.field6625;
                                    }
                                }
                            }
                        }
                        if (class446.field6625 == var42.field7575) {
                            continue;
                        }
                        class238.method1608(var42, 24986, class116.field1781.field1274 != var26.field4531);
                        var42.field7575 = class446.field6625;
                    }
                }
                if (var26.field4527 instanceof class115) {
                    int var56 = var26.field4525 + class422.field6201;
                    int var57 = var26.field4526 + class23.field273;
                    class192 var58 = (class192) class249.field3827.method358((byte) -128, (long) (var57 << 14 | var26.field4531 << 28 | var56));
                    if (var58 != null) {
                        for (class43 var59 = (class43) var58.field2952.method294(0); var59 != null; var59 = (class43) var58.field2952.method289(5)) {
                            class221 var60 = class300.field4608.method2088(var59.field679, 124);
                            if (!class2.field17) {
                                if (class116.field1781.field1274 == var26.field4531) {
                                    String[] var61 = var60.field3307;
                                    for (int var62 = 4; var62 >= 0; var62--) {
                                        if (var61 != null && var61[var62] != null) {
                                            byte var63 = 0;
                                            if (var62 == 0) {
                                                var63 = 60;
                                            }
                                            int var64 = class504.field7324;
                                            if (var62 == 1) {
                                                var63 = 4;
                                            }
                                            if (var62 == 2) {
                                                var63 = 5;
                                            }
                                            if (var62 == 3) {
                                                var63 = 46;
                                            }
                                            if (var60.field3380 == var62) {
                                                var64 = var60.field3356;
                                            }
                                            if (var62 == 4) {
                                                var63 = 59;
                                            }
                                            if (var60.field3313 == var62) {
                                                var64 = var60.field3371;
                                            }
                                            class348.field5195++;
                                            class423.method2637((long) var59.field679, -1, var26.field4525, (byte) -113, true, var63, var61[var62], var64, false, var26.field4526, "<col=ff9040>" + var60.field3377);
                                        }
                                    }
                                }
                                class474.field6950++;
                                class423.method2637((long) var59.field679, -1, var26.field4525, (byte) -113, true, 1007, class74.field1257.method1265(class345.field5141, -98), class376.field5549, class116.field1781.field1274 != var26.field4531, var26.field4526, "<col=ff9040>" + var60.field3377);
                            } else if (class116.field1781.field1274 == var26.field4531) {
                                class450 var65 = class509.field7406 == -1 ? null : class264.field4225.method2789((byte) 36, class509.field7406);
                                if ((class166.field2500 & 0x1) != 0 && (var65 == null || var60.method1513(class509.field7406, var65.field6692, (byte) -95) != var65.field6692)) {
                                    class423.method2637((long) var59.field679, -1, var26.field4525, (byte) -113, true, 9, class218.field3297, class246.field3688, false, var26.field4526, class447.field6638 + " -> <col=ff9040>" + var60.field3377);
                                    class422.field6203++;
                                }
                            }
                        }
                    }
                }
                if (var26.field4527 instanceof class161) {
                    class161 var66 = (class161) var26.field4527;
                    class395 var67 = class247.field3693.method2281(var66.method99((byte) -107), -9380);
                    if (var67.field5825 != null) {
                        var67 = var67.method2485(class288.field4476, 127);
                    }
                    if (var67 != null) {
                        if (!class2.field17) {
                            if (class116.field1781.field1274 == var26.field4531) {
                                String[] var68 = var67.field5770;
                                if (var68 != null) {
                                    for (int var69 = 4; var69 >= 0; var69--) {
                                        if (var68[var69] != null) {
                                            short var70 = 0;
                                            if (var69 == 0) {
                                                var70 = 30;
                                            }
                                            int var71 = class504.field7324;
                                            if (var69 == 1) {
                                                var70 = 22;
                                            }
                                            if (var69 == 2) {
                                                var70 = 20;
                                            }
                                            if (var69 == 3) {
                                                var70 = 10;
                                            }
                                            if (var67.field5786 == var69) {
                                                var71 = var67.field5833;
                                            }
                                            if (var69 == 4) {
                                                var70 = 1004;
                                            }
                                            if (var67.field5790 == var69) {
                                                var71 = var67.field5766;
                                            }
                                            class390.field5712++;
                                            class423.method2637(class533.method3146(var66, 0, var26.field4525, var26.field4526), -1, var26.field4525, (byte) -113, true, var70, var68[var69], var71, false, var26.field4526, "<col=00ffff>" + var67.field5794);
                                        }
                                    }
                                }
                            }
                            class423.method2637((long) var67.field5831, -1, var26.field4525, (byte) -113, true, 1003, class74.field1257.method1265(class345.field5141, -114), class376.field5549, class116.field1781.field1274 != var26.field4531, var26.field4526, "<col=00ffff>" + var67.field5794);
                            class453.field6736++;
                        } else if (class116.field1781.field1274 == var26.field4531) {
                            class450 var72 = class509.field7406 == -1 ? null : class264.field4225.method2789((byte) 36, class509.field7406);
                            if ((class166.field2500 & 0x4) != 0 && (var72 == null || var67.method2497(var72.field6692, (byte) -122, class509.field7406) != var72.field6692)) {
                                class503.field7303++;
                                class423.method2637(class533.method3146(var66, 0, var26.field4525, var26.field4526), -1, var26.field4525, (byte) -113, true, 49, class218.field3297, class246.field3688, false, var26.field4526, class447.field6638 + " -> <col=00ffff>" + var67.field5794);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
    public static final void method1794(String[] arg0, short[] arg1, int arg2) {
        if (arg2 != 1) {
            field4096 = null;
        }
        class348.method2239(arg0, arg0.length - 1, arg1, -127, 0);
        field4094++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field4096 = null;
        }
        field4092++;
        for (int var5 = 0; var5 < class500.field7273; var5++) {
            Rectangle var6 = class489.field7147[var5];
            if ((var6.x + var6.width) > arg1 && var6.x < (arg1 + arg3) && arg2 < var6.y + var6.height && arg0 + arg2 > var6.y) {
                class434.field6439[var5] = true;
            }
        }
    }
}
