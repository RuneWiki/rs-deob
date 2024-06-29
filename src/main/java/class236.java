import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class236 implements Runnable {

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[Lgl;")
    public volatile class289[] field3790 = new class289[2];

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
    public volatile boolean field3785 = false;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Z")
    public volatile boolean field3796 = false;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[S")
    public static short[] field3789 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[I")
    public static int[] field3791 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[[S")
    public static short[][] field3786 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3799 = "Connecting to update server";

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "[I")
    public static int[] field3797 = new int[200];

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ldk;")
    public static class251 field3782;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Lrm;")
    public class45 field3798;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method1598(int arg0) {
        if (class255.field4127 > 1) {
            class304.field4874 = class74.field1237;
            class255.field4127--;
        }
        if (class182.field3008 > 0) {
            class182.field3008--;
        }
        field3795++;
        if (class161.field2561) {
            class161.field2561 = false;
            class73.method499(-1);
            return;
        }
        for (int var1 = 0; var1 < 100 && class160.method1103(50); var1++) {
        }
        if (class153.field2385 != 30) {
            return;
        }
        class4.method26(class314.field5061, 28586, 113);
        Object var2 = class255.field4115.field1210;
        synchronized (class255.field4115.field1210) {
            if (!class286.field4578) {
                class255.field4115.field1221 = 0;
            } else if (class20.field257 != 0 || class255.field4115.field1221 >= 40) {
                class53.field895++;
                class314.field5061.method828(109, 209);
                int var3 = 0;
                class314.field5061.method1108(0, true);
                int var4 = class314.field5061.field2568;
                for (int var5 = 0; var5 < class255.field4115.field1221 && class314.field5061.field2568 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class255.field4115.field1219[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class255.field4115.field1218[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class255.field4115.field1219[var5] == -1 && class255.field4115.field1218[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class116.field1861 != var7 || class2.field33 != var6) {
                        int var9 = var7 - class116.field1861;
                        class116.field1861 = var7;
                        int var10 = var6 - class2.field33;
                        class2.field33 = var6;
                        if (class137.field2175 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class314.field5061.method1120((class137.field2175 << 12) + var10 + (var9 << 6), true);
                            class137.field2175 = 0;
                        } else if (class137.field2175 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class314.field5061.method1108(class137.field2175 + 128, true);
                            var10 += 128;
                            var9 += 128;
                            class314.field5061.method1120((var9 << 8) + var10, true);
                            class137.field2175 = 0;
                        } else if (class137.field2175 < 32) {
                            class314.field5061.method1108(class137.field2175 + 192, true);
                            if (var8) {
                                class314.field5061.method1125(Integer.MIN_VALUE, 255);
                            } else {
                                class314.field5061.method1125(var6 << 16 | var7, 255);
                            }
                            class137.field2175 = 0;
                        } else {
                            class314.field5061.method1120(class137.field2175 + 57344, true);
                            if (var8) {
                                class314.field5061.method1125(Integer.MIN_VALUE, 255);
                            } else {
                                class314.field5061.method1125(var6 << 16 | var7, 255);
                            }
                            class137.field2175 = 0;
                        }
                    } else if (class137.field2175 < 2047) {
                        class137.field2175++;
                    }
                }
                class314.field5061.method1158(class314.field5061.field2568 - var4, -76);
                if (var3 >= class255.field4115.field1221) {
                    class255.field4115.field1221 = 0;
                } else {
                    class255.field4115.field1221 -= var3;
                    for (int var11 = 0; var11 < class255.field4115.field1221; var11++) {
                        class255.field4115.field1218[var11] = class255.field4115.field1218[var11 + var3];
                        class255.field4115.field1219[var11] = class255.field4115.field1219[var3 + var11];
                    }
                }
            }
        }
        if (class20.field257 != 0) {
            long var12 = (class304.field4865 - class215.field3562) / 50L;
            class215.field3562 = class304.field4865;
            class61.field1000++;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class42.field609;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class309.field4941;
            byte var16 = 0;
            if (class20.field257 == 2) {
                var16 = 1;
            }
            int var17 = (int) var12;
            class314.field5061.method828(121, 112);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class314.field5061.method1111((byte) -102, var14 << 16 | var15);
            class314.field5061.method1135(var16 << 15 | var17, (byte) -53);
        }
        if (class52.field875 > 0) {
            class52.field875--;
        }
        if (class221.field3610 && class52.field875 <= 0) {
            class221.field3610 = false;
            class52.field875 = 20;
            class165.field2650++;
            class314.field5061.method828(122, 79);
            class314.field5061.method1165((int) class90.field1456, (byte) 106);
            class314.field5061.method1120((int) class20.field240, true);
        }
        if (class198.field3186 && !class92.field1484) {
            class98.field1573++;
            class92.field1484 = true;
            class314.field5061.method828(117, 39);
            class314.field5061.method1108(1, true);
        }
        if (!class198.field3186 && class92.field1484) {
            class92.field1484 = false;
            class98.field1573++;
            class314.field5061.method828(126, 39);
            class314.field5061.method1108(0, true);
        }
        if (!class134.field2127) {
            class314.field5061.method828(126, 203);
            class314.field5061.method1113(8843, class50.method354(-32224));
            class134.field2127 = true;
            class148.field2319++;
        }
        if (class267.field4299) {
            class267.field4299 = false;
        } else {
            class245.field3887 /= 2.0F;
        }
        if (class92.field1487) {
            class92.field1487 = false;
        } else {
            class193.field3141 /= 2.0F;
        }
        class90.method611(123);
        if (class153.field2385 != 30) {
            return;
        }
        class100.method682((byte) 61);
        class128.method908(-1);
        class62.method425((byte) 108);
        class273.field4381++;
        if (class273.field4381 > 750) {
            class73.method499(-1);
            return;
        }
        class133.method943((byte) 74);
        class128.method912(64);
        class262.method1759((byte) 108);
        for (int var18 = class201.method1410(true, (byte) -82); var18 != -1; var18 = class201.method1410(false, (byte) -82)) {
            class5.method28(var18, true);
            class190.field3080[class51.method359(31, class268.field4319++)] = var18;
        }
        for (class175 var19 = class206.method1444((byte) 82); var19 != null; var19 = class206.method1444((byte) 115)) {
            int var20 = var19.method1275((byte) -116);
            int var21 = var19.method1280((byte) -119);
            if (var20 == 1) {
                class4.field42[var21] = var19.field2855;
                class104.field1661[class51.method359(class311.field4971++, 31)] = var21;
            } else if (var20 == 2) {
                class228.field3671[var21] = var19.field2854;
                class287.field4604[class51.method359(class117.field1892++, 31)] = var21;
            } else if (var20 == 3) {
                class211 var43 = class17.method87(var21, -20055);
                if (!var19.field2854.equals(var43.field3479)) {
                    var43.field3479 = var19.field2854;
                    class117.method834(var43, (byte) -57);
                }
            } else if (var20 == 4) {
                class211 var22 = class17.method87(var21, -20055);
                int var23 = var19.field2855;
                int var24 = var19.field2865;
                int var25 = var19.field2857;
                if (var22.field3501 != var23 || var22.field3485 != var24 || var22.field3364 != var25) {
                    var22.field3364 = var25;
                    var22.field3501 = var23;
                    var22.field3485 = var24;
                    class117.method834(var22, (byte) -57);
                }
            } else if (var20 == 5) {
                class211 var26 = class17.method87(var21, -20055);
                if (var19.field2855 != var26.field3427 || var19.field2855 == -1) {
                    var26.field3401 = 0;
                    var26.field3376 = 0;
                    var26.field3427 = var19.field2855;
                    var26.field3464 = 1;
                    class117.method834(var26, (byte) -57);
                }
            } else if (var20 == 6) {
                int var37 = var19.field2855;
                int var38 = (var37 & 0x3F8) >> 5;
                int var39 = var37 >> 10 & 0x1F;
                class211 var40 = class17.method87(var21, -20055);
                int var41 = var37 & 0x1F;
                int var42 = (var39 << 19) + (var38 << 11) + (var41 << 3);
                if (var40.field3393 != var42) {
                    var40.field3393 = var42;
                    class117.method834(var40, (byte) -57);
                }
            } else if (var20 == 7) {
                class211 var35 = class17.method87(var21, -20055);
                boolean var36 = var19.field2855 == 1;
                if (var36 != var35.field3495) {
                    var35.field3495 = var36;
                    class117.method834(var35, (byte) -57);
                }
            } else if (var20 == 8) {
                class211 var27 = class17.method87(var21, -20055);
                if (var19.field2855 != var27.field3343 || var19.field2865 != var27.field3456 || var19.field2857 != var27.field3382) {
                    var27.field3382 = var19.field2857;
                    var27.field3343 = var19.field2855;
                    if (var27.field3441 != -1) {
                        if (var27.field3384 > 0) {
                            var27.field3382 = var27.field3382 * 32 / var27.field3384;
                        } else if (var27.field3389 > 0) {
                            var27.field3382 = var27.field3382 * 32 / var27.field3389;
                        }
                    }
                    var27.field3456 = var19.field2865;
                    class117.method834(var27, (byte) -57);
                }
            } else if (var20 == 9) {
                class211 var28 = class17.method87(var21, -20055);
                if (var19.field2855 != var28.field3441 || var19.field2865 != var28.field3496) {
                    var28.field3496 = var19.field2865;
                    var28.field3441 = var19.field2855;
                    class117.method834(var28, (byte) -57);
                }
            } else if (var20 == 10) {
                class211 var34 = class17.method87(var21, -20055);
                if (var19.field2855 != var34.field3476 || var19.field2865 != var34.field3372 || var19.field2857 != var34.field3387) {
                    var34.field3476 = var19.field2855;
                    var34.field3387 = var19.field2857;
                    var34.field3372 = var19.field2865;
                    class117.method834(var34, (byte) -57);
                }
            } else if (var20 == 11) {
                class211 var29 = class17.method87(var21, -20055);
                var29.field3402 = 0;
                var29.field3453 = var29.field3475 = var19.field2855;
                var29.field3390 = 0;
                var29.field3416 = var29.field3451 = var19.field2865;
                class117.method834(var29, (byte) -57);
            } else if (var20 == 12) {
                class211 var32 = class17.method87(var21, -20055);
                int var33 = var19.field2855;
                if (var32 != null && var32.field3385 == 0) {
                    if (var33 > var32.field3414 - var32.field3394) {
                        var33 = var32.field3414 - var32.field3394;
                    }
                    if (var33 < 0) {
                        var33 = 0;
                    }
                    if (var32.field3369 != var33) {
                        var32.field3369 = var33;
                        class117.method834(var32, (byte) -57);
                    }
                }
            } else if (var20 == 13) {
                class211 var30 = class17.method87(var21, -20055);
                var30.field3468 = var19.field2855;
            } else if (var20 == 14) {
                class211 var31 = class17.method87(var21, -20055);
                var31.field3405 = var19.field2855;
            }
        }
        class223.field3630++;
        if (class61.field992 != 0) {
            class287.field4600 += 20;
            if (class287.field4600 >= 400) {
                class61.field992 = 0;
            }
        }
        if (class274.field4400 != null) {
            class98.field1585++;
            if (class98.field1585 >= 15) {
                class117.method834(class274.field4400, (byte) -57);
                class274.field4400 = null;
            }
        }
        if (class11.field110 != null) {
            class117.method834(class11.field110, (byte) -57);
            if (class49.field813 + 5 < class269.field4344 || class49.field813 - 5 > class269.field4344 || (class3.field39 + 5) < class77.field1281 || class77.field1281 < class3.field39 - 5) {
                class43.field644 = true;
            }
            class15.field161++;
            if (class163.field2642 == 0) {
                if (class43.field644 && class15.field161 >= 5) {
                    if (class11.field110 == class109.field1737 && class9.field90 != class168.field2732) {
                        class255.field4123++;
                        byte var44 = 0;
                        class211 var45 = class11.field110;
                        if (class304.field4868 == 1 && var45.field3446 == 206) {
                            var44 = 1;
                        }
                        if (var45.field3361[class168.field2732] <= 0) {
                            var44 = 0;
                        }
                        if (client.method2015(var45).method1535(-30566)) {
                            int var48 = class168.field2732;
                            int var49 = class9.field90;
                            var45.field3361[var48] = var45.field3361[var49];
                            var45.field3500[var48] = var45.field3500[var49];
                            var45.field3361[var49] = -1;
                            var45.field3500[var49] = 0;
                        } else if (var44 == 1) {
                            int var46 = class9.field90;
                            int var47 = class168.field2732;
                            while (var46 != var47) {
                                if (var47 < var46) {
                                    var45.method1474(var46, var46 - 1, 46);
                                    var46--;
                                } else if (var47 > var46) {
                                    var45.method1474(var46, var46 + 1, 72);
                                    var46++;
                                }
                            }
                        } else {
                            var45.method1474(class9.field90, class168.field2732, 73);
                        }
                        class314.field5061.method828(127, 232);
                        class314.field5061.method1120(class168.field2732, true);
                        class314.field5061.method1161(4, var44);
                        class314.field5061.method1111((byte) -102, class11.field110.field3375);
                        class314.field5061.method1165(class9.field90, (byte) 100);
                    }
                } else if ((class2.field21 == 1 || class33.method219(false, class83.field1384 - 1)) && class83.field1384 > 2) {
                    class14.method65(-101);
                } else if (class83.field1384 > 0) {
                    class180.method1312((byte) 8);
                }
                class20.field257 = 0;
                class98.field1585 = 10;
                class11.field110 = null;
            }
        }
        class13.field146 = null;
        class165.field2653 = 0;
        class2.field34 = false;
        class211 var50 = class161.field2559;
        class121.field1926 = false;
        class161.field2559 = null;
        class211 var51 = class305.field4878;
        class305.field4878 = null;
        while (class224.method1539(3072) && class165.field2653 < 128) {
            class309.field4939[class165.field2653] = class265.field4272;
            class132.field2074[class165.field2653] = class101.field1628;
            class165.field2653++;
        }
        int var52 = -30 / ((arg0 - 19) / 43);
        class280.field4486 = null;
        if (class22.field284 != -1) {
            class115.method802(class294.field4709, 0, 0, 0, class22.field284, 0, (byte) -19, class310.field4964);
        }
        class74.field1237++;
        if (class280.field4486 != null) {
            class241.method1624(false);
        }
        while (true) {
            class126 var53;
            class211 var54;
            class211 var55;
            do {
                var53 = (class126) class291.field4675.method1651((byte) 118);
                if (var53 == null) {
                    while (true) {
                        class126 var56;
                        class211 var57;
                        class211 var58;
                        do {
                            var56 = (class126) class204.field3254.method1651((byte) 126);
                            if (var56 == null) {
                                while (true) {
                                    class126 var59;
                                    class211 var60;
                                    class211 var61;
                                    do {
                                        var59 = (class126) class288.field4611.method1651((byte) 118);
                                        if (var59 == null) {
                                            if (class280.field4486 == null) {
                                                class143.field2270 = 0;
                                            }
                                            if (client.field4857 != null) {
                                                class257.method1731(true);
                                            }
                                            if (class298.field4765 > 0 && class100.field1627[82] && class100.field1627[81] && class206.field3274 != 0) {
                                                int var62 = class56.field941 - class206.field3274;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class168.method1223((byte) 89, var62, class239.field3829.field704[0] + class108.field1732, class239.field3829.field709[0] + class276.field4438);
                                            }
                                            if (class298.field4765 > 0 && class100.field1627[82] && class100.field1627[81]) {
                                                if (class272.field4364 != -1) {
                                                    class168.method1223((byte) 95, class56.field941, class298.field4746 + class108.field1732, class276.field4438 - -class272.field4364);
                                                }
                                                class20.field250 = 0;
                                                class244.field3883 = 0;
                                            } else if (class244.field3883 == 2) {
                                                if (class272.field4364 != -1) {
                                                    class187.field3040++;
                                                    class314.field5061.method828(112, 149);
                                                    class314.field5061.method1120(class251.field3997, true);
                                                    class314.field5061.method1113(8843, class78.field1310);
                                                    class314.field5061.method1135(class298.field4746 + class108.field1732, (byte) -53);
                                                    class314.field5061.method1120(class276.field4438 + class272.field4364, true);
                                                    class287.field4600 = 0;
                                                    class61.field992 = 1;
                                                    class161.field2554 = class42.field609;
                                                    class136.field2151 = class309.field4941;
                                                }
                                                class244.field3883 = 0;
                                            } else if (class20.field250 == 2) {
                                                if (class272.field4364 != -1) {
                                                    class115.field1804++;
                                                    class314.field5061.method828(113, 53);
                                                    class314.field5061.method1165(class298.field4746 + class108.field1732, (byte) 71);
                                                    class314.field5061.method1165(class276.field4438 + class272.field4364, (byte) 67);
                                                    class287.field4600 = 0;
                                                    class136.field2151 = class309.field4941;
                                                    class161.field2554 = class42.field609;
                                                    class61.field992 = 1;
                                                }
                                                class20.field250 = 0;
                                            } else if (class272.field4364 != -1 && class244.field3883 == 0 && class20.field250 == 0) {
                                                int var63 = (class272.field4364 << 1) + (1 - class239.field3829.method279(23397)) >> 1;
                                                int var64 = (class298.field4746 << 1) + 1 - class239.field3829.method279(23397) >> 1;
                                                class89.method608(-152, var63, 0, var64);
                                                class161.field2554 = class42.field609;
                                                class287.field4600 = 0;
                                                class136.field2151 = class309.field4941;
                                                class61.field992 = 1;
                                                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var64, 116, 0, 0, 0, 0, var63);
                                            }
                                            class272.field4364 = -1;
                                            class117.method833(-3);
                                            if (class161.field2559 != var50) {
                                                if (var50 != null) {
                                                    class117.method834(var50, (byte) -57);
                                                }
                                                if (class161.field2559 != null) {
                                                    class117.method834(class161.field2559, (byte) -57);
                                                }
                                            }
                                            if (class305.field4878 != var51 && class282.field4502 == class115.field1826) {
                                                if (var51 != null) {
                                                    class117.method834(var51, (byte) -57);
                                                }
                                                if (class305.field4878 != null) {
                                                    class117.method834(class305.field4878, (byte) -57);
                                                }
                                            }
                                            if (class305.field4878 == null) {
                                                if (class282.field4502 > 0) {
                                                    class282.field4502--;
                                                }
                                            } else if (class282.field4502 < class115.field1826) {
                                                class282.field4502++;
                                                if (class282.field4502 == class115.field1826) {
                                                    class117.method834(class305.field4878, (byte) -57);
                                                }
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class234.field3773[var65]++;
                                            }
                                            int var66 = class170.method1232(false);
                                            int var67 = class205.method1434((byte) -70);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class182.field3008 = 250;
                                                class123.method867(14500, -114);
                                                class99.field1599++;
                                                class314.field5061.method828(107, 143);
                                            }
                                            if (class285.field4527 != null && class285.field4527.field2814 == 1) {
                                                if (class285.field4527.field2817 != null) {
                                                    class95.method653(class146.field2311, 357801124, class281.field4494);
                                                }
                                                class285.field4527 = null;
                                                class146.field2311 = false;
                                                class281.field4494 = null;
                                            }
                                            class107.field1701++;
                                            if (class107.field1701 > 500) {
                                                class107.field1701 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x4) == 4) {
                                                    class46.field779 += class95.field1538;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class15.field160 += class32.field477;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class208.field3300 += class295.field4719;
                                                }
                                            }
                                            if (class208.field3300 < -55) {
                                                class295.field4719 = 2;
                                            }
                                            if (class208.field3300 > 55) {
                                                class295.field4719 = -2;
                                            }
                                            if (class15.field160 < -50) {
                                                class32.field477 = 2;
                                            }
                                            if (class46.field779 < -40) {
                                                class95.field1538 = 1;
                                            }
                                            if (class15.field160 > 50) {
                                                class32.field477 = -2;
                                            }
                                            if (class46.field779 > 40) {
                                                class95.field1538 = -1;
                                            }
                                            class47.field790++;
                                            class6.field67++;
                                            if (class47.field790 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                class47.field790 = 0;
                                                if ((var69 & 0x2) == 2) {
                                                    class292.field4687 += class57.field957;
                                                }
                                                if ((var69 & 0x1) == 1) {
                                                    class173.field2831 += class233.field3747;
                                                }
                                            }
                                            if (class173.field2831 < -60) {
                                                class233.field3747 = 2;
                                            }
                                            if (class292.field4687 < -20) {
                                                class57.field957 = 1;
                                            }
                                            if (class292.field4687 > 10) {
                                                class57.field957 = -1;
                                            }
                                            if (class173.field2831 > 60) {
                                                class233.field3747 = -2;
                                            }
                                            if (class6.field67 > 50) {
                                                class314.field5061.method828(124, 122);
                                                class161.field2552++;
                                            }
                                            if (class145.field2294) {
                                                class70.method484(202);
                                                class145.field2294 = false;
                                            }
                                            try {
                                                if (class208.field3298 != null && class314.field5061.field2568 > 0) {
                                                    class208.field3298.method977(class314.field5061.field2573, class314.field5061.field2568, 0, -27241);
                                                    class314.field5061.field2568 = 0;
                                                    class6.field67 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var70) {
                                                class73.method499(-1);
                                                return;
                                            }
                                        }
                                        var60 = var59.field2000;
                                        if (var60.field3413 < 0) {
                                            break;
                                        }
                                        var61 = class17.method87(var60.field3395, -20055);
                                    } while (var61 == null || var61.field3352 == null || var60.field3413 >= var61.field3352.length || var61.field3352[var60.field3413] != var60);
                                    class137.method960(200000, var59);
                                }
                            }
                            var57 = var56.field2000;
                            if (var57.field3413 < 0) {
                                break;
                            }
                            var58 = class17.method87(var57.field3395, -20055);
                        } while (var58 == null || var58.field3352 == null || var58.field3352.length <= var57.field3413 || var58.field3352[var57.field3413] != var57);
                        class137.method960(200000, var56);
                    }
                }
                var54 = var53.field2000;
                if (var54.field3413 < 0) {
                    break;
                }
                var55 = class17.method87(var54.field3395, -20055);
            } while (var55 == null || var55.field3352 == null || var55.field3352.length <= var54.field3413 || var55.field3352[var54.field3413] != var54);
            class137.method960(200000, var53);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method1599(byte arg0) {
        if (arg0 < 12) {
            method1602(3, -32, -86, 19);
        }
        field3789 = null;
        field3799 = null;
        field3786 = null;
        field3797 = null;
        field3782 = null;
        field3791 = null;
    }

    @OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
    public final void run() {
        field3788++;
        this.field3796 = true;
        try {
            while (!this.field3785) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class289 var2 = this.field3790[var1];
                    if (var2 != null) {
                        var2.method1924((byte) 89);
                    }
                }
                class262.method1758(10L, 29552);
                class199.method1385((Object) null, this.field3798, true);
            }
        } catch (Exception var9) {
            class19.method94(-108, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field3796 = false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1600(int arg0, String[] arg1) {
        field3783++;
        String[] var2 = new String[5];
        if (arg0 != 15502) {
            field3792 = 97;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        field3787++;
        if (arg0 != -16 || class92.field1487) {
            return;
        }
        class92.field1487 = true;
        class221.field3610 = true;
        if (class144.field2281) {
            class20.field240 = (float) ((int) class20.field240 - 17 & 0xFFFFFFF0);
        } else {
            class193.field3141 += (-class193.field3141 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
    public static final void method1602(int arg0, int arg1, int arg2, int arg3) {
        field3794++;
        int var4 = class214.field3548 * arg1 >> 8;
        if (arg2 != -2) {
            field3797 = null;
        }
        if (var4 != 0 && arg0 != -1) {
            class295.method1959(arg0, class216.field3566, false, 0, true, var4);
            class277.field4451 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public static final void method1603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 < class250.field3971; var5++) {
            if (arg2 < (class74.field1241[var5] + class15.field164[var5]) && class74.field1241[var5] < (arg2 + arg3) && arg0 < class190.field3075[var5] + class132.field2088[var5] && (arg0 + arg1) > class132.field2088[var5]) {
                class73.field1227[var5] = true;
            }
        }
        field3784++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BB)Lmk;")
    public static final class228 method1604(byte[] arg0, byte arg1) {
        int var2 = 107 % ((arg1 - 67) / 56);
        class228 var3 = new class228();
        field3793++;
        class162 var4 = new class162(arg0);
        var4.field2568 = var4.field2573.length - 2;
        int var5 = var4.method1142(-18970);
        int var6 = var4.field2573.length - (var5 + 12) - 2;
        var4.field2568 = var6;
        int var7 = var4.method1157(65280);
        var3.field3678 = var4.method1142(-18970);
        var3.field3685 = var4.method1142(-18970);
        var3.field3676 = var4.method1142(-18970);
        var3.field3680 = var4.method1142(-18970);
        int var8 = var4.method1133((byte) 53);
        if (var8 > 0) {
            var3.field3672 = new class155[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var4.method1142(-18970);
                class155 var11 = new class155(class247.method1654(var10, 455314946));
                var3.field3672[var9] = var11;
                while (var10-- > 0) {
                    int var12 = var4.method1157(65280);
                    int var13 = var4.method1157(65280);
                    var11.method1052((long) var12, (byte) -65, new class281(var13));
                }
            }
        }
        var4.field2568 = 0;
        int var14 = 0;
        var3.field3688 = var4.method1150(93);
        var3.field3673 = new int[var7];
        var3.field3682 = new int[var7];
        var3.field3687 = new String[var7];
        while (var4.field2568 < var6) {
            int var15 = var4.method1142(-18970);
            if (var15 == 3) {
                var3.field3687[var14] = var4.method1152(-56).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var3.field3673[var14] = var4.method1133((byte) 53);
            } else {
                var3.field3673[var14] = var4.method1157(65280);
            }
            var3.field3682[var14++] = var15;
        }
        return var3;
    }
}
