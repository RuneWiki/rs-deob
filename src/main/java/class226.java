import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class226 extends class92 {

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field3431;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field3430 = 0;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "[Lag;")
    public static class189[] field3432;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V")
    public static void method1501(byte arg0) {
        if (arg0 <= 33) {
            field3430 = -58;
        }
        field3432 = null;
    }

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "(I)Z")
    public static final boolean method1502(int arg0) throws IOException {
        field3429++;
        if (class290.field4567 == null) {
            return false;
        }
        int var1 = class290.field4567.method1960(-1);
        if (var1 == 0) {
            return false;
        }
        if (class253.field3868 == -1) {
            class290.field4567.method1963(1, class233.field3518.field3336, 0, false);
            class233.field3518.field3402 = 0;
            var1--;
            class253.field3868 = class233.field3518.method1861(-311308797);
            class105.field1460 = class211.field3065[class253.field3868];
        }
        if (class105.field1460 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class290.field4567.method1963(1, class233.field3518.field3336, 0, false);
            class105.field1460 = class233.field3518.field3336[0] & 0xFF;
        }
        if (class105.field1460 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class290.field4567.method1963(2, class233.field3518.field3336, 0, false);
            class233.field3518.field3402 = 0;
            class105.field1460 = class233.field3518.method1445(false);
        }
        if (class105.field1460 > var1) {
            return false;
        }
        class233.field3518.field3402 = 0;
        class290.field4567.method1963(class105.field1460, class233.field3518.field3336, 0, false);
        class214.field3226 = 0;
        class88.field1210 = class203.field2819;
        class203.field2819 = class151.field2100;
        class151.field2100 = class253.field3868;
        if (class253.field3868 == 79) {
            int var2 = class233.field3518.method1465(-1691509480);
            int var3 = class233.field3518.method1453((byte) -127);
            if (class164.method1088(var2, 65535)) {
                class100.field1401 = var3;
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 130) {
            int var4 = class233.field3518.method1492(arg0 + 2971767);
            int var5 = class233.field3518.method1465(-1691509480);
            int var6 = class233.field3518.method1453((byte) -128);
            if (var5 == 65535) {
                var5 = -1;
            }
            String var7 = class233.field3518.method1455(arg0 ^ 0xFFFFFFE1);
            if (var4 >= 1 && var4 <= 8) {
                if (var7.equalsIgnoreCase("null")) {
                    var7 = null;
                }
                class31.field420[var4 - 1] = var7;
                class48.field701[var4 - 1] = var5;
                class163.field2272[var4 - 1] = var6 == 0;
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 22) {
            int var8 = class233.field3518.method1483((byte) 46);
            class148.field2053 = class200.field2784.method1634(-83, var8);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 224) {
            int var9 = class233.field3518.method1453((byte) -127);
            if (class233.field3518.method1453((byte) -127) == 0) {
                class132.field1867[var9] = new class77();
            } else {
                class233.field3518.field3402--;
                class132.field1867[var9] = new class77(class233.field3518);
            }
            class180.field2529 = class35.field548;
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 244) {
            int var10 = class233.field3518.method1465(arg0 ^ 0x9B2D9D19);
            int var11 = class233.field3518.method1465(-1691509480);
            int var12 = class233.field3518.method1445(false);
            int var13 = class233.field3518.method1467(4);
            int var14 = class233.field3518.method1474((byte) -102);
            if (class164.method1088(var11, 65535)) {
                class87.method551(var14, var12, var13, var10, true);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 174) {
            int var15 = class233.field3518.method1492(2971768);
            int var16 = class233.field3518.method1465(-1691509480);
            int var17 = class233.field3518.method1494((byte) 53);
            if (class164.method1088(var16, 65535)) {
                class246.method1661(-11290, var17, var15);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 227) {
            class145.field2023 = class233.field3518.method1495((byte) -103);
            class141.field1961 = class233.field3518.method1453((byte) -128);
            while (class233.field3518.field3402 < class105.field1460) {
                class253.field3868 = class233.field3518.method1453((byte) -128);
                class297.method1984(0);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 103) {
            for (int var18 = 0; var18 < class120.field1688.length; var18++) {
                if (class120.field1688[var18] != class119.field1677[var18]) {
                    class120.field1688[var18] = class119.field1677[var18];
                    class278.method1858(-8, var18);
                    class211.field3072[class235.method1572(class179.field2508++, 31)] = var18;
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 172) {
            class251.method1680(class233.field3518.method1455(104), 87);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 195) {
            class234.field3535 = 0;
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 99) {
            int var19 = class233.field3518.method1483((byte) 46);
            int var20 = class233.field3518.method1445(false);
            if (var19 < -70000) {
                var20 += 32768;
            }
            class211 var21;
            if (var19 >= 0) {
                var21 = class67.method421(var19, 0);
            } else {
                var21 = null;
            }
            if (var21 != null) {
                for (int var22 = 0; var22 < var21.field3015.length; var22++) {
                    var21.field3015[var22] = 0;
                    var21.field3005[var22] = 0;
                }
            }
            class173.method1133(arg0 - 110, var20);
            int var23 = class233.field3518.method1445(false);
            for (int var24 = 0; var24 < var23; var24++) {
                int var25 = class233.field3518.method1492(2971768);
                if (var25 == 255) {
                    var25 = class233.field3518.method1494((byte) 53);
                }
                int var26 = class233.field3518.method1445(false);
                if (var21 != null && var24 < var21.field3015.length) {
                    var21.field3015[var24] = var26;
                    var21.field3005[var24] = var25;
                }
                class207.method1317(var24, var25, -53, var26 - 1, var20);
            }
            if (var21 != null) {
                class236.method1583(var21, 0);
            }
            class281.method1884(-94);
            class116.field1659[class235.method1572(class36.field554++, 31)] = class235.method1572(32767, var20);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 71) {
            int var27 = class233.field3518.method1494((byte) 53);
            int var28 = class233.field3518.method1474((byte) -119);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = class233.field3518.method1465(-1691509480);
            int var30 = class233.field3518.method1445(false);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = class233.field3518.method1442(255);
            if (class164.method1088(var31, 65535)) {
                for (int var32 = var30; var32 <= var28; var32++) {
                    long var33 = ((long) var27 << 32) + (long) var32;
                    class203 var35 = (class203) class247.field3784.method23(216, var33);
                    class203 var36;
                    if (var35 != null) {
                        var36 = new class203(var35.field2828, var29);
                        var35.method1115(arg0 ^ 0x20);
                    } else if (var32 == -1) {
                        var36 = new class203(class67.method421(var27, 0).field3022.field2828, var29);
                    } else {
                        var36 = new class203(0, var29);
                    }
                    class247.field3784.method20(var36, var33, 0);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 109) {
            int var37 = class233.field3518.method1479(false);
            int var38 = class233.field3518.method1494((byte) 53);
            int var39 = class233.field3518.method1445(false);
            if (class164.method1088(var39, 65535)) {
                class213.method1390(var38, var37, 1);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 239) {
            byte var40 = class233.field3518.method1473((byte) -46);
            int var41 = class233.field3518.method1474((byte) -117);
            int var42 = class233.field3518.method1474((byte) -125);
            if (class164.method1088(var41, arg0 + 65534)) {
                class6.method35(var42, -118, var40);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 104) {
            int var43 = class233.field3518.method1465(-1691509480);
            int var44 = class233.field3518.method1467(arg0 + 3);
            int var45 = class233.field3518.method1465(-1691509480);
            if (class164.method1088(var45, 65535)) {
                class285.method1921(12, var43, var44);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 86) {
            long var46 = class233.field3518.method1491(-21241);
            class233.field3518.method1437((byte) -105);
            long var48 = class233.field3518.method1491(-21241);
            long var50 = (long) class233.field3518.method1445(false);
            long var52 = (long) class233.field3518.method1454(78);
            long var54 = (var50 << 32) + var52;
            int var56 = class233.field3518.method1453((byte) -127);
            boolean var57 = false;
            int var58 = 0;
            label1244: while (true) {
                if (var58 >= 100) {
                    if (var56 <= 1) {
                        if ((!class110.field1529 || class176.field2476) && !class266.field4007) {
                            for (int var59 = 0; var59 < class93.field1300; var59++) {
                                if (class296.field4677[var59] == var46) {
                                    var57 = true;
                                    break label1244;
                                }
                            }
                        } else {
                            var57 = true;
                        }
                    }
                    break;
                }
                if (class252.field3854[var58] == var54) {
                    var57 = true;
                    break;
                }
                var58++;
            }
            if (!var57 && class103.field1434 == 0) {
                class252.field3854[class54.field792] = var54;
                class54.field792 = (class54.field792 + 1) % 100;
                String var60 = class126.method841(class269.method1782(1, class50.method323(class233.field3518, (byte) 121)));
                if (var56 == 2 || var56 == 3) {
                    class282.method1894(9, (byte) 68, "<img=1>" + class274.method1828(0, var46), class274.method1828(arg0 - 1, var48), var60);
                } else if (var56 == 1) {
                    class282.method1894(9, (byte) 68, "<img=0>" + class274.method1828(0, var46), class274.method1828(0, var48), var60);
                } else {
                    class282.method1894(9, (byte) 68, class274.method1828(0, var46), class274.method1828(0, var48), var60);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 94) {
            int var61 = class233.field3518.method1465(-1691509480);
            int var62 = class233.field3518.method1442(255);
            if (var62 == 65535) {
                var62 = -1;
            }
            int var63 = class233.field3518.method1467(4);
            if (class164.method1088(var61, arg0 + 65534)) {
                class252.method1685(1, -1, var63, 23658, var62);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 44) {
            class41.method271(16);
            class281.method1884(-79);
            class179.field2508 += 32;
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 220) {
            int var64 = class233.field3518.method1474((byte) -120);
            int var65 = class233.field3518.method1434((byte) -28);
            class65.method413(var65, var64, true);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 212) {
            int var66 = class233.field3518.method1495((byte) -71);
            int var67 = class233.field3518.method1495((byte) -87);
            int var68 = class233.field3518.method1495((byte) -85);
            class295.field4642 = var66 >> 1;
            class217.field3280.method564(var67, var68, (byte) 83, (var66 & 0x1) == 1);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 47) {
            int var69 = class233.field3518.method1434((byte) -95);
            int var70 = class233.field3518.method1474((byte) -113);
            int var71 = class233.field3518.method1445(false);
            int var72 = class233.field3518.method1495((byte) -78);
            if (class164.method1088(var71, 65535)) {
                class56 var73 = (class56) class289.field4559.method23(arg0 + 215, (long) var69);
                if (var73 != null) {
                    class136.method924((byte) 86, var73, var73.field808 != var70);
                }
                class178.method1165(var72, (byte) -24, var69, var70);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 72) {
            int var74 = class233.field3518.method1492(2971768);
            int var75 = class233.field3518.method1474((byte) -108);
            int var76 = class233.field3518.method1442(255);
            class140 var77 = class119.field1679[var75];
            if (var77 != null) {
                class93.method605(var77, var76, var74, (byte) -110);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 203) {
            int var78 = class233.field3518.method1445(false);
            int var79 = class233.field3518.method1483((byte) 46);
            int var80 = class233.field3518.method1465(-1691509480);
            if (var80 == 65535) {
                var80 = -1;
            }
            if (class164.method1088(var78, arg0 ^ 0xFFFE)) {
                class252.method1685(2, -1, var79, 23658, var80);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 50) {
            int var81 = class233.field3518.method1445(false);
            int var82 = class233.field3518.method1453((byte) -128);
            int var83 = class233.field3518.method1453((byte) -128);
            int var84 = class233.field3518.method1445(false);
            int var85 = class233.field3518.method1453((byte) -127);
            int var86 = class233.field3518.method1453((byte) -127);
            if (class164.method1088(var81, 65535)) {
                class188.method1204(var83, var85, var84, arg0 + 25, var86, var82);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 107) {
            int var87 = class233.field3518.method1465(arg0 ^ 0x9B2D9D19);
            String var88 = class233.field3518.method1455(arg0 + 113);
            int var89 = class233.field3518.method1494((byte) 53);
            if (class164.method1088(var87, arg0 ^ 0xFFFE)) {
                class274.method1831(98, var88, var89);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 23) {
            long var90 = class233.field3518.method1491(arg0 - 21242);
            int var92 = class233.field3518.method1445(false);
            int var93 = class233.field3518.method1453((byte) -128);
            boolean var94 = true;
            String var95 = "";
            if (var92 > 0) {
                var95 = class233.field3518.method1455(-70);
            }
            if (var90 < 0L) {
                var94 = false;
                var90 &= Long.MAX_VALUE;
            }
            String var96 = class274.method1828(0, var90);
            for (int var97 = 0; var97 < class279.field4323; var97++) {
                if (class84.field1144[var97] == var90) {
                    if (class67.field909[var97] != var92) {
                        class67.field909[var97] = var92;
                        if (var92 > 0) {
                            class283.method1900("", var96 + class16.field160, 5, true);
                        }
                        if (var92 == 0) {
                            class283.method1900("", var96 + class249.field3817, 5, true);
                        }
                    }
                    var96 = null;
                    class208.field2966[var97] = var95;
                    class277.field4287[var97] = var93;
                    class145.field2025[var97] = var94;
                    break;
                }
            }
            if (var96 != null && class279.field4323 < 200) {
                class84.field1144[class279.field4323] = var90;
                class180.field2531[class279.field4323] = var96;
                class67.field909[class279.field4323] = var92;
                class208.field2966[class279.field4323] = var95;
                class277.field4287[class279.field4323] = var93;
                class145.field2025[class279.field4323] = var94;
                class279.field4323++;
            }
            class66.field892 = class35.field548;
            boolean var98 = false;
            int var99 = class279.field4323;
            while (var99 > 0) {
                boolean var100 = true;
                var99--;
                for (int var101 = 0; var101 < var99; var101++) {
                    if (class67.field909[var101] != class13.field130 && class67.field909[var101 + 1] == class13.field130 || class67.field909[var101] == 0 && class67.field909[var101 + 1] != 0) {
                        int var102 = class67.field909[var101];
                        class67.field909[var101] = class67.field909[var101 + 1];
                        var100 = false;
                        class67.field909[var101 + 1] = var102;
                        String var103 = class208.field2966[var101];
                        class208.field2966[var101] = class208.field2966[var101 + 1];
                        class208.field2966[var101 + 1] = var103;
                        String var104 = class180.field2531[var101];
                        class180.field2531[var101] = class180.field2531[var101 + 1];
                        class180.field2531[var101 + 1] = var104;
                        long var105 = class84.field1144[var101];
                        class84.field1144[var101] = class84.field1144[var101 + 1];
                        class84.field1144[var101 + 1] = var105;
                        int var107 = class277.field4287[var101];
                        class277.field4287[var101] = class277.field4287[var101 + 1];
                        class277.field4287[var101 + 1] = var107;
                        boolean var108 = class145.field2025[var101];
                        class145.field2025[var101] = class145.field2025[var101 + 1];
                        class145.field2025[var101 + 1] = var108;
                    }
                }
                if (var100) {
                    break;
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 74) {
            class145.field2023 = class233.field3518.method1492(2971768);
            class141.field1961 = class233.field3518.method1453((byte) -128);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 58) {
            int var109 = class233.field3518.method1442(arg0 + 254);
            int var110 = class233.field3518.method1483((byte) 46);
            int var111 = class233.field3518.method1445(false);
            int var112 = class233.field3518.method1474((byte) -113);
            int var113 = class233.field3518.method1465(arg0 - 1691509481);
            if (class164.method1088(var113, 65535)) {
                class252.method1685(7, var112, var110, 23658, var111 << 16 | var109);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 41) {
            int var114 = class233.field3518.method1465(-1691509480);
            int var115 = class233.field3518.method1445(false);
            int var116 = class233.field3518.method1442(255);
            int var117 = class233.field3518.method1494((byte) 53);
            if (var117 >> 30 != 0) {
                int var118 = (var117 & 0x364788F4) >> 28;
                int var119 = ((var117 & 0xFFFEDF4) >> 14) - class37.field565;
                int var120 = (var117 & 0x3FFF) - class216.field3255;
                if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                    int var121 = var119 * 128 + 64;
                    int var122 = var120 * 128 + 64;
                    class246 var123 = new class246(var115, var118, var121, var122, class275.method1836(var118, var122, var121, arg0 - 115) - var114, var116, class52.field740);
                    class256.field3914.method988(new class199(var123), (byte) -77);
                }
            } else if (var117 >> 29 != 0) {
                int var124 = var117 & 0xFFFF;
                class140 var125 = class119.field1679[var124];
                if (var125 != null) {
                    if (var115 == 65535) {
                        var115 = -1;
                    }
                    boolean var126 = true;
                    if (var115 != -1 && var125.field4046 != -1) {
                        if (var125.field4046 == var115) {
                            class191 var127 = class82.method512(var115, (byte) 76);
                            if (var127.field2630 && var127.field2638 != -1) {
                                class240 var128 = class132.method905(true, var127.field2638);
                                int var129 = var128.field3674;
                                if (var129 == 1) {
                                    var125.field4077 = 0;
                                    var125.field4062 = 1;
                                    var126 = false;
                                    var125.field3999 = 0;
                                    var125.field4041 = class52.field740 + var116;
                                    var125.field4061 = 0;
                                    class116.method781(var125.field4085, 236, var125.field4019, false, var125.field4077, var128);
                                } else if (var129 == 2) {
                                    var126 = false;
                                    var125.field4002 = 0;
                                }
                            }
                        } else {
                            class191 var130 = class82.method512(var115, (byte) 111);
                            class191 var131 = class82.method512(var125.field4046, (byte) 122);
                            if (var130.field2638 != -1 && var131.field2638 != -1) {
                                class240 var132 = class132.method905(true, var130.field2638);
                                class240 var133 = class132.method905(true, var131.field2638);
                                if (var133.field3671 > var132.field3671) {
                                    var126 = false;
                                }
                            }
                        }
                    }
                    if (var126) {
                        var125.field4041 = class52.field740 + var116;
                        var125.field4062 = 1;
                        var125.field4061 = 0;
                        var125.field4046 = var115;
                        var125.field4077 = 0;
                        if (var125.field4041 > class52.field740) {
                            var125.field4077 = -1;
                        }
                        var125.field4047 = var114;
                        if (var125.field4046 != -1 && class52.field740 == var125.field4041) {
                            int var134 = class82.method512(var125.field4046, (byte) 67).field2638;
                            if (var134 != -1) {
                                class240 var135 = class132.method905(true, var134);
                                if (var135 != null && var135.field3665 != null) {
                                    class116.method781(var125.field4085, arg0 + 235, var125.field4019, false, 0, var135);
                                }
                            }
                        }
                    }
                }
            } else if ((var117 >> 28) != 0) {
                int var136 = var117 & 0xFFFF;
                class88 var137;
                if (class35.field550 == var136) {
                    var137 = class217.field3280;
                } else {
                    var137 = class154.field2133[var136];
                }
                if (var137 != null) {
                    if (var115 == 65535) {
                        var115 = -1;
                    }
                    boolean var138 = true;
                    if (var115 != -1 && var137.field4046 != -1) {
                        if (var137.field4046 == var115) {
                            class191 var143 = class82.method512(var115, (byte) 79);
                            if (var143.field2630 && var143.field2638 != -1) {
                                class240 var144 = class132.method905(true, var143.field2638);
                                int var145 = var144.field3674;
                                if (var145 == 1) {
                                    var137.field4062 = 1;
                                    var137.field3999 = 0;
                                    var138 = false;
                                    var137.field4061 = 0;
                                    var137.field4041 = class52.field740 + var116;
                                    var137.field4077 = 0;
                                    class116.method781(var137.field4085, arg0 + 235, var137.field4019, false, var137.field4077, var144);
                                } else if (var145 == 2) {
                                    var138 = false;
                                    var137.field4002 = 0;
                                }
                            }
                        } else {
                            class191 var139 = class82.method512(var115, (byte) 96);
                            class191 var140 = class82.method512(var137.field4046, (byte) 80);
                            if (var139.field2638 != -1 && var140.field2638 != -1) {
                                class240 var141 = class132.method905(true, var139.field2638);
                                class240 var142 = class132.method905(true, var140.field2638);
                                if (var141.field3671 < var142.field3671) {
                                    var138 = false;
                                }
                            }
                        }
                    }
                    if (var138) {
                        var137.field4046 = var115;
                        var137.field4061 = 0;
                        if (var137.field4046 == 65535) {
                            var137.field4046 = -1;
                        }
                        var137.field4062 = 1;
                        var137.field4077 = 0;
                        var137.field4047 = var114;
                        var137.field4041 = class52.field740 + var116;
                        if (class52.field740 < var137.field4041) {
                            var137.field4077 = -1;
                        }
                        if (var137.field4046 != -1 && class52.field740 == var137.field4041) {
                            int var146 = class82.method512(var137.field4046, (byte) 70).field2638;
                            if (var146 != -1) {
                                class240 var147 = class132.method905(true, var146);
                                if (var147 != null && var147.field3665 != null) {
                                    class116.method781(var137.field4085, 236, var137.field4019, class217.field3280 == var137, 0, var147);
                                }
                            }
                        }
                    }
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 198) {
            int var148 = class233.field3518.method1494((byte) 53);
            int var149 = class233.field3518.method1465(arg0 ^ 0x9B2D9D19);
            int var150 = class233.field3518.method1442(255);
            if (class164.method1088(var150, 65535)) {
                class35.method238(var148, var149, arg0 - 101);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 181) {
            int var151 = class233.field3518.method1467(4);
            int var152 = class233.field3518.method1474((byte) -106);
            if (class164.method1088(var152, 65535)) {
                int var153 = 0;
                if (class217.field3280.field1209 != null) {
                    var153 = class217.field3280.field1209.method969((byte) -70);
                }
                class252.method1685(3, -1, var151, 23658, var153);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 141) {
            int var154 = class233.field3518.method1445(false);
            int var155 = class233.field3518.method1483((byte) 46);
            if (class164.method1088(var154, 65535)) {
                class56 var156 = (class56) class289.field4559.method23(216, (long) var155);
                if (var156 != null) {
                    class136.method924((byte) 86, var156, true);
                }
                if (class233.field3524 != null) {
                    class236.method1583(class233.field3524, arg0 ^ 0x1);
                    class233.field3524 = null;
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 219) {
            long var157 = class233.field3518.method1491(-21241);
            long var159 = (long) class233.field3518.method1445(false);
            long var161 = (long) class233.field3518.method1454(-69);
            int var163 = class233.field3518.method1453((byte) -128);
            int var164 = class233.field3518.method1445(false);
            long var165 = (var159 << 32) + var161;
            boolean var167 = false;
            int var168 = 0;
            label1291: while (true) {
                if (var168 >= 100) {
                    if (var163 <= 1) {
                        for (int var169 = 0; var169 < class93.field1300; var169++) {
                            if (class296.field4677[var169] == var157) {
                                var167 = true;
                                break label1291;
                            }
                        }
                    }
                    break;
                }
                if (class252.field3854[var168] == var165) {
                    var167 = true;
                    break;
                }
                var168++;
            }
            if (!var167 && class103.field1434 == 0) {
                class252.field3854[class54.field792] = var165;
                class54.field792 = (class54.field792 + 1) % 100;
                String var170 = class79.method508((byte) -80, var164).method610(class233.field3518, 0);
                if (var163 == 2) {
                    class88.method562((String) null, "<img=1>" + class274.method1828(0, var157), 18, var164, true, var170);
                } else if (var163 == 1) {
                    class88.method562((String) null, "<img=0>" + class274.method1828(arg0 - 1, var157), 18, var164, true, var170);
                } else {
                    class88.method562((String) null, class274.method1828(0, var157), 18, var164, true, var170);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 27) {
            int var171 = class233.field3518.method1465(-1691509480);
            int var172 = class233.field3518.method1434((byte) -109);
            int var173 = class233.field3518.method1483((byte) 46);
            if (class164.method1088(var171, 65535)) {
                class56 var174 = (class56) class289.field4559.method23(216, (long) var173);
                class56 var175 = (class56) class289.field4559.method23(arg0 + 215, (long) var172);
                if (var175 != null) {
                    class136.method924((byte) 86, var175, var174 == null || var174.field808 != var175.field808);
                }
                if (var174 != null) {
                    var174.method1115(-124);
                    class289.field4559.method20(var174, (long) var172, arg0 ^ 0x1);
                }
                class211 var176 = class67.method421(var173, arg0 - 1);
                if (var176 != null) {
                    class236.method1583(var176, 0);
                }
                class211 var177 = class67.method421(var172, arg0 - 1);
                if (var177 != null) {
                    class236.method1583(var177, 0);
                    class154.method1025(-120, true, var177);
                }
                if (class212.field3193 != -1) {
                    class10.method64((byte) -115, 1, class212.field3193);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 121) {
            int var178 = class233.field3518.method1494((byte) 53);
            int var179 = var178 >> 28 & 0x3;
            int var180 = var178 >> 14 & 0x3FFF;
            int var181 = class233.field3518.method1474((byte) -109);
            if (var181 == 65535) {
                var181 = -1;
            }
            int var182 = var178 & 0x3FFF;
            int var183 = class233.field3518.method1492(arg0 + 2971767);
            int var184 = var182 - class216.field3255;
            int var185 = var183 & 0x3;
            int var186 = var183 >> 2;
            int var187 = var180 - class37.field565;
            int var188 = class102.field1425[var186];
            class155.method1032(var184, var187, var186, var181, var185, var188, var179, (byte) -109);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 171) {
            int var189 = class233.field3518.method1442(arg0 + 254);
            int var190 = class233.field3518.method1445(false);
            int var191 = class233.field3518.method1474((byte) -104);
            if (class164.method1088(var190, 65535)) {
                class110.method704(var189, var191, true);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 48) {
            int var192 = class233.field3518.method1434((byte) -77);
            int var193 = class233.field3518.method1474((byte) -119);
            if (var193 == 65535) {
                var193 = -1;
            }
            int var194 = class233.field3518.method1442(255);
            int var195 = class233.field3518.method1445(false);
            if (var195 == 65535) {
                var195 = -1;
            }
            int var196 = class233.field3518.method1467(arg0 + 3);
            if (class164.method1088(var194, 65535)) {
                for (int var197 = var193; var197 <= var195; var197++) {
                    long var198 = ((long) var196 << 32) + (long) var197;
                    class203 var200 = (class203) class247.field3784.method23(216, var198);
                    class203 var201;
                    if (var200 != null) {
                        var201 = new class203(var192, var200.field2825);
                        var200.method1115(-120);
                    } else if (var197 == -1) {
                        var201 = new class203(var192, class67.method421(var196, 0).field3022.field2825);
                    } else {
                        var201 = new class203(var192, -1);
                    }
                    class247.field3784.method20(var201, var198, 0);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 208) {
            long var202 = class233.field3518.method1491(-21241);
            long var204 = (long) class233.field3518.method1445(false);
            long var206 = (long) class233.field3518.method1454(98);
            int var208 = class233.field3518.method1453((byte) -127);
            long var209 = (var204 << 32) + var206;
            boolean var211 = false;
            int var212 = 0;
            label1348: while (true) {
                if (var212 >= 100) {
                    if (var208 <= 1) {
                        if ((!class110.field1529 || class176.field2476) && !class266.field4007) {
                            for (int var213 = 0; var213 < class93.field1300; var213++) {
                                if (class296.field4677[var213] == var202) {
                                    var211 = true;
                                    break label1348;
                                }
                            }
                        } else {
                            var211 = true;
                        }
                    }
                    break;
                }
                if (class252.field3854[var212] == var209) {
                    var211 = true;
                    break;
                }
                var212++;
            }
            if (!var211 && class103.field1434 == 0) {
                class252.field3854[class54.field792] = var209;
                class54.field792 = (class54.field792 + 1) % 100;
                String var214 = class126.method841(class269.method1782(1, class50.method323(class233.field3518, (byte) 117)));
                if (var208 == 2 || var208 == 3) {
                    class283.method1900("<img=1>" + class274.method1828(0, var202), var214, 7, true);
                } else if (var208 == 1) {
                    class283.method1900("<img=0>" + class274.method1828(0, var202), var214, 7, true);
                } else {
                    class283.method1900(class274.method1828(arg0 ^ 0x1, var202), var214, 3, true);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 170) {
            String var215 = class233.field3518.method1455(arg0 ^ 0x6A);
            int var216 = class233.field3518.method1465(-1691509480);
            int var217 = class233.field3518.method1465(arg0 - 1691509481);
            if (class164.method1088(var217, 65535)) {
                class149.method1006((byte) -31, var215, var216);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 162) {
            class93.field1300 = class105.field1460 / 8;
            for (int var218 = 0; var218 < class93.field1300; var218++) {
                class296.field4677[var218] = class233.field3518.method1491(-21241);
                class186.field2573[var218] = class17.method101(class296.field4677[var218], (byte) 127);
                class294.field4621[var218] = false;
            }
            class66.field892 = class35.field548;
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 154) {
            class145.field2023 = class233.field3518.method1453((byte) -128);
            class141.field1961 = class233.field3518.method1460(2095725128);
            for (int var219 = class141.field1961; var219 < (class141.field1961 + 8); var219++) {
                for (int var221 = class145.field2023; var221 < (class145.field2023 + 8); var221++) {
                    if (class297.field4690[class295.field4642][var219][var221] != null) {
                        class297.field4690[class295.field4642][var219][var221] = null;
                        class249.method1667(var221, 4, var219);
                    }
                }
            }
            for (class215 var220 = (class215) class41.field607.method990(-84); var220 != null; var220 = (class215) class41.field607.method993(-81)) {
                if (class141.field1961 <= var220.field3230 && var220.field3230 < class141.field1961 + 8 && class145.field2023 <= var220.field3232 && var220.field3232 < (class145.field2023 + 8) && class295.field4642 == var220.field3242) {
                    var220.field3239 = 0;
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 15) {
            String var222 = class233.field3518.method1455(112);
            if (var222.endsWith(":tradereq:")) {
                String var258 = var222.substring(0, var222.indexOf(":"));
                long var259 = class73.method465((byte) -57, var258);
                boolean var261 = false;
                for (int var262 = 0; var262 < class93.field1300; var262++) {
                    if (class296.field4677[var262] == var259) {
                        var261 = true;
                        break;
                    }
                }
                if (!var261 && class103.field1434 == 0) {
                    class283.method1900(var258, class254.field3879, 4, true);
                }
            } else if (var222.endsWith(":chalreq:")) {
                String var223 = var222.substring(0, var222.indexOf(":"));
                long var224 = class73.method465((byte) -113, var223);
                boolean var226 = false;
                for (int var227 = 0; var227 < class93.field1300; var227++) {
                    if (class296.field4677[var227] == var224) {
                        var226 = true;
                        break;
                    }
                }
                if (!var226 && class103.field1434 == 0) {
                    String var228 = var222.substring(var222.indexOf(":") + 1, var222.length() + -9);
                    class283.method1900(var223, var228, 8, true);
                }
            } else if (var222.endsWith(":assistreq:")) {
                String var253 = var222.substring(0, var222.indexOf(":"));
                long var254 = class73.method465((byte) -100, var253);
                boolean var256 = false;
                for (int var257 = 0; var257 < class93.field1300; var257++) {
                    if (class296.field4677[var257] == var254) {
                        var256 = true;
                        break;
                    }
                }
                if (!var256 && class103.field1434 == 0) {
                    class283.method1900(var253, "", 10, true);
                }
            } else if (var222.endsWith(":clan:")) {
                String var229 = var222.substring(0, var222.indexOf(":clan:"));
                class283.method1900("", var229, 11, true);
            } else if (var222.endsWith(":trade:")) {
                String var252 = var222.substring(0, var222.indexOf(":trade:"));
                if (class103.field1434 == 0) {
                    class283.method1900("", var252, 12, true);
                }
            } else if (var222.endsWith(":assist:")) {
                String var230 = var222.substring(0, var222.indexOf(":assist:"));
                if (class103.field1434 == 0) {
                    class283.method1900("", var230, 13, true);
                }
            } else if (var222.endsWith(":duelstake:")) {
                boolean var247 = false;
                String var248 = var222.substring(0, var222.indexOf(":"));
                long var249 = class73.method465((byte) -122, var248);
                for (int var251 = 0; var251 < class93.field1300; var251++) {
                    if (class296.field4677[var251] == var249) {
                        var247 = true;
                        break;
                    }
                }
                if (!var247 && class103.field1434 == 0) {
                    class283.method1900(var248, "", 14, true);
                }
            } else if (var222.endsWith(":duelfriend:")) {
                String var242 = var222.substring(0, var222.indexOf(":"));
                long var243 = class73.method465((byte) -106, var242);
                boolean var245 = false;
                for (int var246 = 0; var246 < class93.field1300; var246++) {
                    if (class296.field4677[var246] == var243) {
                        var245 = true;
                        break;
                    }
                }
                if (!var245 && class103.field1434 == 0) {
                    class283.method1900(var242, "", 15, true);
                }
            } else if (var222.endsWith(":clanreq:")) {
                boolean var237 = false;
                String var238 = var222.substring(0, var222.indexOf(":"));
                long var239 = class73.method465((byte) -113, var238);
                for (int var241 = 0; var241 < class93.field1300; var241++) {
                    if (class296.field4677[var241] == var239) {
                        var237 = true;
                        break;
                    }
                }
                if (!var237 && class103.field1434 == 0) {
                    class283.method1900(var238, "", 16, true);
                }
            } else if (var222.endsWith(":allyreq:")) {
                String var231 = var222.substring(0, var222.indexOf(":"));
                boolean var232 = false;
                long var233 = class73.method465((byte) -71, var231);
                for (int var235 = 0; var235 < class93.field1300; var235++) {
                    if (class296.field4677[var235] == var233) {
                        var232 = true;
                        break;
                    }
                }
                if (!var232 && class103.field1434 == 0) {
                    String var236 = var222.substring(var222.indexOf(":") + 1, var222.length() + -9);
                    class283.method1900(var231, var236, 21, true);
                }
            } else {
                class283.method1900("", var222, 0, true);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 243) {
            int var263 = class233.field3518.method1445(false);
            if (class164.method1088(var263, 65535)) {
                class107.method691(arg0 ^ 0x2772);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 10) {
            int var264 = class233.field3518.method1483((byte) 46);
            class211 var265 = class67.method421(var264, arg0 ^ 0x1);
            for (int var266 = 0; var266 < var265.field3015.length; var266++) {
                var265.field3015[var266] = -1;
                var265.field3015[var266] = 0;
            }
            class236.method1583(var265, 0);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 102) {
            int var267 = class233.field3518.method1445(false);
            int var268 = class233.field3518.method1453((byte) -127);
            int var269 = class233.field3518.method1445(false);
            if (var267 == 65535) {
                var267 = -1;
            }
            int var270 = class233.field3518.method1453((byte) -127);
            class148.method1000(var268, var269, 62, var267, var270);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 13) {
            if (class212.field3193 != -1) {
                class10.method64((byte) -109, 0, class212.field3193);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 21) {
            int var271 = class233.field3518.method1465(-1691509480);
            int var272 = class233.field3518.method1474((byte) -102);
            int var273 = class233.field3518.method1483((byte) 46);
            if (class164.method1088(var271, 65535)) {
                class6.method35(var272, -105, var273);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 155) {
            byte[] var274 = new byte[class105.field1460];
            class233.field3518.method1854(class105.field1460, false, 0, var274);
            String var275 = class122.method801(100, var274, class105.field1460, 0);
            if (class17.field179 == null && class244.field3717 == 3 || !class244.field3728.startsWith("win") || class16.field167) {
                class16.method94(var275, false, true);
            } else {
                class136.field1903 = true;
                class83.field1130 = var275;
                class143.field1981 = class200.field2784.method1640(var275, arg0 - 1);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 87) {
            class261.field3946 = class233.field3518.method1474((byte) -116) * 30;
            class253.field3868 = -1;
            class7.field57 = class35.field548;
            return true;
        } else if (class253.field3868 == 145) {
            int var276 = class233.field3518.method1445(false);
            String var277 = class233.field3518.method1455(-38);
            Object[] var278 = new Object[var277.length() + 1];
            for (int var279 = var277.length() - 1; var279 >= 0; var279--) {
                if (var277.charAt(var279) == 's') {
                    var278[var279 + 1] = class233.field3518.method1455(-81);
                } else {
                    var278[var279 + 1] = Integer.valueOf(class233.field3518.method1483((byte) 46));
                }
            }
            var278[0] = Integer.valueOf(class233.field3518.method1483((byte) 46));
            if (class164.method1088(var276, 65535)) {
                class27 var280 = new class27();
                var280.field341 = var278;
                class213.method1392(var280, arg0 ^ 0xFFFFFF98);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 132) {
            class281.method1884(-72);
            int var281 = class233.field3518.method1453((byte) -127);
            int var282 = class233.field3518.method1453((byte) -127);
            int var283 = class233.field3518.method1467(4);
            class149.field2060[var281] = var283;
            class180.field2521[var281] = var282;
            class15.field149[var281] = 1;
            for (int var284 = 0; var284 < 98; var284++) {
                if (var283 >= class204.field2840[var284]) {
                    class15.field149[var281] = var284 + 2;
                }
            }
            class256.field3920[class235.method1572(31, class241.field3692++)] = var281;
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 221) {
            class181.field2540 = class233.field3518.method1453((byte) -127);
            class286.field4484 = class233.field3518.method1453((byte) -128);
            class288.field4553 = class233.field3518.method1453((byte) -128);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 24) {
            class233.field3518.field3402 += 28;
            if (class233.field3518.method1475(0)) {
                class39.method261(class233.field3518.field3402 - 28, 25, class233.field3518);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 46) {
            String var285 = class233.field3518.method1455(114);
            int var286 = class233.field3518.method1474((byte) -122);
            int var287 = class233.field3518.method1465(arg0 - 1691509481);
            if (class164.method1088(var287, 65535)) {
                class149.method1006((byte) -31, var285, var286);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 35) {
            class156.method1037(-893);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 189) {
            int var288 = class233.field3518.method1445(false);
            class188.method1203(var288, (byte) -76);
            class116.field1659[class235.method1572(31, class36.field554++)] = class235.method1572(var288, 32767);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 113) {
            int var289 = class233.field3518.method1445(false);
            byte var290 = class233.field3518.method1456(arg0 ^ 0x81);
            class142.method953(var290, var289, (byte) 89);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 16) {
            class105.field1458 = class233.field3518.method1453((byte) -127);
            class66.field892 = class35.field548;
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 42) {
            int var291 = class233.field3518.method1465(-1691509480);
            int var292 = class233.field3518.method1434((byte) -36);
            int var293 = class233.field3518.method1474((byte) -106);
            int var294 = class233.field3518.method1442(255);
            if (class164.method1088(var294, 65535)) {
                class7.method42((var293 << 16) + var291, (byte) 7, var292);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 61) {
            int var295 = class233.field3518.method1453((byte) -128);
            int var296 = var295 >> 5;
            int var297 = var295 & 0x1F;
            if (var297 == 0) {
                class175.field2463[var296] = null;
                class253.field3868 = -1;
                return true;
            }
            class275 var298 = new class275();
            var298.field4262 = var297;
            var298.field4262 = var295 & 0x3F;
            var298.field4253 = class233.field3518.method1453((byte) -127);
            if (var298.field4253 >= 0 && var298.field4253 < class65.field882.length) {
                if (var298.field4262 == 1 || var298.field4262 == 10) {
                    var298.field4257 = class233.field3518.method1445(false);
                    class233.field3518.field3402 += 5;
                } else if (var298.field4262 >= 2 && var298.field4262 <= 6) {
                    if (var298.field4262 == 2) {
                        var298.field4259 = 64;
                        var298.field4260 = 64;
                    }
                    if (var298.field4262 == 3) {
                        var298.field4259 = 64;
                        var298.field4260 = 0;
                    }
                    if (var298.field4262 == 4) {
                        var298.field4260 = 128;
                        var298.field4259 = 64;
                    }
                    if (var298.field4262 == 5) {
                        var298.field4259 = 0;
                        var298.field4260 = 64;
                    }
                    if (var298.field4262 == 6) {
                        var298.field4260 = 64;
                        var298.field4259 = 128;
                    }
                    var298.field4262 = 2;
                    var298.field4251 = class233.field3518.method1445(false);
                    var298.field4255 = class233.field3518.method1445(false);
                    var298.field4247 = class233.field3518.method1453((byte) -127);
                    var298.field4250 = class233.field3518.method1445(false);
                }
                var298.field4261 = class233.field3518.method1445(false);
                if (var298.field4261 == 65535) {
                    var298.field4261 = -1;
                }
                class175.field2463[var296] = var298;
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 128) {
            int var299 = class233.field3518.method1445(false);
            int var300 = class233.field3518.method1453((byte) -128);
            int var301 = class233.field3518.method1453((byte) -128);
            int var302 = class233.field3518.method1445(false);
            int var303 = class233.field3518.method1453((byte) -127);
            int var304 = class233.field3518.method1453((byte) -128);
            if (class164.method1088(var299, 65535)) {
                class105.method685(var302, arg0 ^ 0x7F, true, var303, var300, var301, var304);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 2) {
            int var305 = class233.field3518.method1445(false);
            int var306 = class233.field3518.method1434((byte) -91);
            class142.method953(var306, var305, (byte) 89);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 167) {
            long var307 = class233.field3518.method1491(-21241);
            int var309 = class233.field3518.method1445(false);
            boolean var310 = false;
            if ((var307 & Long.MIN_VALUE) != 0L) {
                var310 = true;
            }
            byte var311 = class233.field3518.method1437((byte) -99);
            if (var310) {
                if (class132.field1873 == 0) {
                    class253.field3868 = -1;
                    return true;
                }
                long var317 = var307 & Long.MAX_VALUE;
                boolean var319 = false;
                int var320;
                for (var320 = 0; var320 < class132.field1873 && (class297.field4694[var320].field2369 != var317 || class297.field4694[var320].field3439 != var309); var320++) {
                }
                if (class132.field1873 > var320) {
                    while (var320 < (class132.field1873 - 1)) {
                        class297.field4694[var320] = class297.field4694[var320 + 1];
                        var320++;
                    }
                    class132.field1873--;
                    class297.field4694[class132.field1873] = null;
                }
            } else {
                String var312 = class233.field3518.method1455(120);
                class227 var313 = new class227();
                var313.field2369 = var307;
                var313.field3440 = class197.method1258(var313.field2369, (byte) 117);
                var313.field3439 = var309;
                var313.field3442 = var311;
                var313.field3437 = var312;
                int var314;
                for (var314 = class132.field1873 - 1; var314 >= 0; var314--) {
                    int var315 = class297.field4694[var314].field3440.compareTo(var313.field3440);
                    if (var315 == 0) {
                        class297.field4694[var314].field3439 = var309;
                        class297.field4694[var314].field3442 = var311;
                        class297.field4694[var314].field3437 = var312;
                        if (class266.field4042 == var307) {
                            class198.field2759 = var311;
                        }
                        class253.field3868 = -1;
                        class154.field2131 = class35.field548;
                        return true;
                    }
                    if (var315 < 0) {
                        break;
                    }
                }
                if (class132.field1873 >= class297.field4694.length) {
                    class253.field3868 = -1;
                    return true;
                }
                for (int var316 = class132.field1873 - 1; var316 > var314; var316--) {
                    class297.field4694[var316 + 1] = class297.field4694[var316];
                }
                if (class132.field1873 == 0) {
                    class297.field4694 = new class227[100];
                }
                class297.field4694[var314 + 1] = var313;
                class132.field1873++;
                if (class266.field4042 == var307) {
                    class198.field2759 = var311;
                }
            }
            class253.field3868 = -1;
            class154.field2131 = class35.field548;
            return true;
        } else if (class253.field3868 == 54) {
            int var321 = class233.field3518.method1445(false);
            int var322 = class233.field3518.method1442(255);
            int var323 = class233.field3518.method1492(2971768);
            if (class164.method1088(var321, 65535)) {
                if (var323 == 2) {
                    class66.method417((byte) -47);
                }
                class212.field3193 = var322;
                class38.method251((byte) 63, var322);
                class75.method484(false, 2295);
                class170.method1113((byte) 112, class212.field3193);
                for (int var324 = 0; var324 < 100; var324++) {
                    class42.field640[var324] = true;
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (arg0 != 1) {
            return false;
        } else if (class253.field3868 == 116) {
            long var325 = class233.field3518.method1491(arg0 ^ 0xFFFFAD06);
            String var327 = class126.method841(class269.method1782(1, class50.method323(class233.field3518, (byte) 122)));
            class283.method1900(class274.method1828(0, var325), var327, 6, true);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 83 || class253.field3868 == 38 || class253.field3868 == 199 || class253.field3868 == 31 || class253.field3868 == 95 || class253.field3868 == 118 || class253.field3868 == 112 || class253.field3868 == 106 || class253.field3868 == 123 || class253.field3868 == 18 || class253.field3868 == 89 || class253.field3868 == 101 || class253.field3868 == 151 || class253.field3868 == 222) {
            class297.method1984(0);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 45) {
            int var328 = class233.field3518.method1474((byte) -124);
            int var329 = class233.field3518.method1495((byte) -115);
            class65.method413(var329, var328, true);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 3) {
            int var330 = class233.field3518.method1483((byte) 46);
            int var331 = class233.field3518.method1445(false);
            class211 var332;
            if (var330 >= 0) {
                var332 = class67.method421(var330, 0);
            } else {
                var332 = null;
            }
            if (var330 < -70000) {
                var331 += 32768;
            }
            while (class105.field1460 > class233.field3518.field3402) {
                int var333 = class233.field3518.method1461(true);
                int var334 = class233.field3518.method1445(false);
                int var335 = 0;
                if (var334 != 0) {
                    var335 = class233.field3518.method1453((byte) -127);
                    if (var335 == 255) {
                        var335 = class233.field3518.method1483((byte) 46);
                    }
                }
                if (var332 != null && var333 >= 0 && var333 < var332.field3015.length) {
                    var332.field3015[var333] = var334;
                    var332.field3005[var333] = var335;
                }
                class207.method1317(var333, var335, arg0 - 45, var334 + -1, var331);
            }
            if (var332 != null) {
                class236.method1583(var332, 0);
            }
            class281.method1884(-87);
            class116.field1659[class235.method1572(31, class36.field554++)] = class235.method1572(var331, 32767);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 34) {
            long var336 = class233.field3518.method1491(-21241);
            class233.field3518.method1437((byte) -108);
            boolean var338 = false;
            long var339 = class233.field3518.method1491(-21241);
            long var341 = (long) class233.field3518.method1445(false);
            long var343 = (long) class233.field3518.method1454(-92);
            long var345 = (var341 << 32) + var343;
            int var347 = class233.field3518.method1453((byte) -128);
            int var348 = class233.field3518.method1445(false);
            int var349 = 0;
            label1530: while (true) {
                if (var349 >= 100) {
                    if (var347 <= 1) {
                        for (int var350 = 0; var350 < class93.field1300; var350++) {
                            if (class296.field4677[var350] == var336) {
                                var338 = true;
                                break label1530;
                            }
                        }
                    }
                    break;
                }
                if (class252.field3854[var349] == var345) {
                    var338 = true;
                    break;
                }
                var349++;
            }
            if (!var338 && class103.field1434 == 0) {
                class252.field3854[class54.field792] = var345;
                class54.field792 = (class54.field792 + 1) % 100;
                String var351 = class79.method508((byte) 109, var348).method610(class233.field3518, 0);
                if (var347 == 2 || var347 == 3) {
                    class88.method562(class274.method1828(0, var339), "<img=1>" + class274.method1828(0, var336), 20, var348, true, var351);
                } else if (var347 == 1) {
                    class88.method562(class274.method1828(arg0 - 1, var339), "<img=0>" + class274.method1828(arg0 ^ 0x1, var336), 20, var348, true, var351);
                } else {
                    class88.method562(class274.method1828(arg0 - 1, var339), class274.method1828(0, var336), 20, var348, true, var351);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 43) {
            class85.method530((byte) 92, false);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 249) {
            if (class105.field1460 == 0) {
                class277.field4285 = class269.field4133;
            } else {
                class277.field4285 = class233.field3518.method1455(102);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 215) {
            class281.method1884(-99);
            class42.field626 = class233.field3518.method1479(false);
            class253.field3868 = -1;
            class7.field57 = class35.field548;
            return true;
        } else if (class253.field3868 == 40) {
            for (int var352 = 0; var352 < class154.field2133.length; var352++) {
                if (class154.field2133[var352] != null) {
                    class154.field2133[var352].field4040 = -1;
                }
            }
            for (int var353 = 0; var353 < class119.field1679.length; var353++) {
                if (class119.field1679[var353] != null) {
                    class119.field1679[var353].field4040 = -1;
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 53) {
            int var354 = class233.field3518.method1483((byte) 46);
            int var355 = class233.field3518.method1465(arg0 - 1691509481);
            int var356 = class233.field3518.method1434((byte) -50);
            int var357 = class233.field3518.method1445(false);
            if (var357 == 65535) {
                var357 = -1;
            }
            if (class164.method1088(var355, 65535)) {
                class211 var358 = class67.method421(var356, arg0 - 1);
                if (var358.field3011) {
                    class264.method1732(var354, var357, var356, (byte) 10);
                    class32 var360 = class73.method463(var357, arg0 - 31105);
                    class87.method551(var360.field443, var360.field477, var356, var360.field484, true);
                    class29.method193(var360.field432, var360.field497, 10, var356, var360.field476);
                } else if (var357 == -1) {
                    class253.field3868 = -1;
                    var358.field3027 = 0;
                    return true;
                } else {
                    class32 var359 = class73.method463(var357, -31104);
                    var358.field3012 = var359.field484 * 100 / var354;
                    var358.field3040 = var359.field477;
                    var358.field3075 = var357;
                    var358.field3027 = 4;
                    var358.field3041 = var359.field443;
                    class236.method1583(var358, 0);
                }
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 245) {
            class229.method1513(class200.field2784, class233.field3518, false, class105.field1460);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 6) {
            class22.method162((byte) 70);
            class253.field3868 = -1;
            return false;
        } else if (class253.field3868 == 236) {
            class85.method530((byte) 87, true);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 255) {
            class154.field2131 = class35.field548;
            long var361 = class233.field3518.method1491(-21241);
            if (var361 == 0L) {
                class297.field4694 = null;
                class132.field1873 = 0;
                class73.field1005 = null;
                class273.field4226 = null;
                class253.field3868 = -1;
                return true;
            }
            long var363 = class233.field3518.method1491(-21241);
            class273.field4226 = class197.method1258(var363, (byte) -48);
            class73.field1005 = class197.method1258(var361, (byte) 50);
            class30.field412 = class233.field3518.method1437((byte) -84);
            int var365 = class233.field3518.method1453((byte) -128);
            if (var365 == 255) {
                class253.field3868 = -1;
                return true;
            }
            class132.field1873 = var365;
            class227[] var366 = new class227[100];
            for (int var367 = 0; var367 < class132.field1873; var367++) {
                var366[var367] = new class227();
                var366[var367].field2369 = class233.field3518.method1491(-21241);
                var366[var367].field3440 = class197.method1258(var366[var367].field2369, (byte) 55);
                var366[var367].field3439 = class233.field3518.method1445(false);
                var366[var367].field3442 = class233.field3518.method1437((byte) -126);
                var366[var367].field3437 = class233.field3518.method1455(arg0 ^ 0x7B);
                if (class266.field4042 == var366[var367].field2369) {
                    class198.field2759 = var366[var367].field3442;
                }
            }
            boolean var368 = false;
            int var369 = class132.field1873;
            while (var369 > 0) {
                boolean var370 = true;
                var369--;
                for (int var371 = 0; var371 < var369; var371++) {
                    if (var366[var371].field3440.compareTo(var366[var371 + 1].field3440) > 0) {
                        class227 var372 = var366[var371];
                        var370 = false;
                        var366[var371] = var366[var371 + 1];
                        var366[var371 + 1] = var372;
                    }
                }
                if (var370) {
                    break;
                }
            }
            class253.field3868 = -1;
            class297.field4694 = var366;
            return true;
        } else if (class253.field3868 == 175) {
            long var373 = class233.field3518.method1491(-21241);
            int var375 = class233.field3518.method1445(false);
            String var376 = class79.method508((byte) 53, var375).method610(class233.field3518, 0);
            class88.method562((String) null, class274.method1828(0, var373), 19, var375, true, var376);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 91) {
            int var377 = class233.field3518.method1445(false);
            if (class164.method1088(var377, 65535)) {
                class177.method1161(0);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 250) {
            class232.method1535(-47);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 235) {
            int var378 = class233.field3518.method1495((byte) -66);
            int var379 = class233.field3518.method1474((byte) -106);
            if (var379 == 65535) {
                var379 = -1;
            }
            class241.method1620(var379, arg0 + 13798, var378);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 126) {
            int var380 = class233.field3518.method1453((byte) -128);
            int var381 = class233.field3518.method1465(-1691509480);
            if (var381 == 65535) {
                var381 = -1;
            }
            int var382 = class233.field3518.method1454(118);
            class104.method681(arg0 + 90, var381, var382, var380);
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 117) {
            int var383 = class233.field3518.method1459(false);
            int var384 = class233.field3518.method1445(false);
            int var385 = class233.field3518.method1479(false);
            int var386 = class233.field3518.method1494((byte) 53);
            if (class164.method1088(var384, 65535)) {
                class245.method1647(var383, var385, arg0 - 79, var386);
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 197) {
            int var387 = class233.field3518.method1445(false);
            int var388 = class233.field3518.method1453((byte) -127);
            int var389 = class233.field3518.method1453((byte) -128);
            int var390 = class233.field3518.method1453((byte) -128);
            int var391 = class233.field3518.method1453((byte) -127);
            int var392 = class233.field3518.method1445(false);
            if (class164.method1088(var387, 65535)) {
                class46.field673[var388] = true;
                class46.field676[var388] = var389;
                class122.field1700[var388] = var390;
                class9.field86[var388] = var391;
                class114.field1638[var388] = var392;
            }
            class253.field3868 = -1;
            return true;
        } else if (class253.field3868 == 178) {
            class281.method1884(arg0 - 82);
            class231.field3504 = class233.field3518.method1453((byte) -127);
            class253.field3868 = -1;
            class7.field57 = class35.field548;
            return true;
        } else if (class253.field3868 == 66) {
            class286.field4481 = class233.field3518.method1453((byte) -127);
            class253.field3868 = -1;
            return true;
        } else {
            class221.method1426("T1 - " + class253.field3868 + "," + class203.field2819 + "," + class88.field1210 + " - " + class105.field1460, -1, (Throwable) null);
            class22.method162((byte) -125);
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)Z")
    public final boolean method599(int arg0) {
        field3435++;
        if (arg0 != 128) {
            field3432 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "(I)Ljava/lang/Object;")
    public final Object method601(int arg0) {
        field3428++;
        if (arg0 != 0) {
            field3433 = 115;
        }
        return this.field3431;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class226(Object arg0) {
        this.field3431 = arg0;
    }
}
