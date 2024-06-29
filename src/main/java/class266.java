import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class266 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Z")
    public static boolean field4217 = false;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Z")
    public static boolean field4218 = false;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lbd;")
    public static class186 field4219;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Z")
    public static final boolean method1794(int arg0) throws IOException {
        field4215++;
        if (class5.field69 == null) {
            return false;
        }
        int var1 = class5.field69.method6(-121);
        if (var1 == 0) {
            return false;
        }
        if (class121.field1973 == -1) {
            var1--;
            class5.field69.method4(1, (byte) -72, 0, class67.field1103.field3653);
            class67.field1103.field3655 = 0;
            class121.field1973 = class67.field1103.method538(255);
            class115.field1912 = class110.field1813[class121.field1973];
        }
        if (class115.field1912 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class5.field69.method4(1, (byte) -94, 0, class67.field1103.field3653);
            class115.field1912 = class67.field1103.field3653[0] & 0xFF;
        }
        if (class115.field1912 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class5.field69.method4(2, (byte) 93, 0, class67.field1103.field3653);
            class67.field1103.field3655 = 0;
            var1 -= 2;
            class115.field1912 = class67.field1103.method1521((byte) 113);
        }
        if (var1 < class115.field1912) {
            return false;
        }
        class67.field1103.field3655 = 0;
        class5.field69.method4(class115.field1912, (byte) -117, 0, class67.field1103.field3653);
        class233.field3813 = 0;
        class76.field1229 = class77.field1236;
        class77.field1236 = class253.field4034;
        class253.field4034 = class121.field1973;
        if (class121.field1973 == 159) {
            int var2 = class67.field1103.method1515(-1);
            int var3 = class67.field1103.method1527(arg0 ^ 0x29A4);
            int var4 = class67.field1103.method1515(-1);
            if (class205.method1421(var3, true)) {
                class199.field3186 = var4;
                class122.field1985 = var2;
                if (class229.field3786 == 2) {
                    class200.field3187 = class199.field3186;
                    class202.field3242 = class122.field1985;
                }
                class96.method712((byte) 27);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 103) {
            int var5 = class67.field1103.method1512((byte) -125);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class67.field1103.method1512((byte) -123);
            int var7 = class67.field1103.method1526(-16777216);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var8 = class67.field1103.method1527(-10661);
            int var9 = class67.field1103.method1523((byte) -89);
            if (class205.method1421(var8, true)) {
                for (int var10 = var6; var10 <= var5; var10++) {
                    long var11 = ((long) var7 << 32) + (long) var10;
                    class84 var13 = (class84) class271.field4274.method1400(var11, true);
                    class84 var14;
                    if (var13 != null) {
                        var14 = new class84(var9, var13.field1328);
                        var13.method1388(63);
                    } else if (var10 == -1) {
                        var14 = new class84(var9, class64.method455(var7, arg0 ^ 0xDCB0476F).field634.field1328);
                    } else {
                        var14 = new class84(var9, -1);
                    }
                    class271.field4274.method1399(7292, var14, var11);
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 212) {
            class182.field2867 = class67.field1103.method1517((byte) -96);
            class121.field1973 = -1;
            class99.field1633 = class66.field1094;
            return true;
        } else if (class121.field1973 == 20) {
            int var15 = class67.field1103.method1527(-10661);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = class67.field1103.method1505(-31);
            int var17 = class67.field1103.method1527(-10661);
            int var18 = class67.field1103.method1521((byte) 113);
            int var19 = class67.field1103.method1527(-10661);
            if (var19 == 65535) {
                var19 = -1;
            }
            if (class205.method1421(var17, true)) {
                for (int var20 = var15; var20 <= var19; var20++) {
                    long var21 = ((long) var16 << 32) + (long) var20;
                    class84 var23 = (class84) class271.field4274.method1400(var21, true);
                    class84 var24;
                    if (var23 != null) {
                        var24 = new class84(var23.field1313, var18);
                        var23.method1388(110);
                    } else if (var20 == -1) {
                        var24 = new class84(class64.method455(var16, 592427152).field634.field1313, var18);
                    } else {
                        var24 = new class84(0, var18);
                    }
                    class271.field4274.method1399(arg0 + 7293, var24, var21);
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 223) {
            int var25 = class67.field1103.method1521((byte) 113);
            int var26 = class67.field1103.method1517((byte) -96);
            int var27 = class67.field1103.method1517((byte) -96);
            int var28 = class67.field1103.method1517((byte) -96);
            int var29 = class67.field1103.method1517((byte) -96);
            int var30 = class67.field1103.method1521((byte) 113);
            if (class205.method1421(var25, true)) {
                class285.field4514[var26] = true;
                class121.field1967[var26] = var27;
                class256.field4075[var26] = var28;
                class260.field4137[var26] = var29;
                class245.field3921[var26] = var30;
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 221) {
            int var31 = class67.field1103.method1521((byte) 113);
            int var32 = class67.field1103.method1517((byte) -96);
            int var33 = class67.field1103.method1521((byte) 113);
            if (var31 == 65535) {
                var31 = -1;
            }
            class212.method1460(var33, -23, var32, var31);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 96) {
            int var34 = class67.field1103.method1512((byte) -127);
            int var35 = class67.field1103.method1523((byte) -89);
            if (class205.method1421(var34, true)) {
                int var36 = 0;
                if (class167.field2655.field528 != null) {
                    var36 = class167.field2655.field528.method799(16482);
                }
                class21.method197(-1, var35, (byte) 96, 3, var36);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 104) {
            int var37 = class67.field1103.method1519((byte) 127);
            int var38 = class67.field1103.method1515(-1);
            class234.method1635((byte) -101, var38, var37);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 169) {
            int var39 = class67.field1103.method1542(4);
            int var40 = class67.field1103.method1523((byte) -89);
            int var41 = class67.field1103.method1515(-1);
            if (class205.method1421(var41, true)) {
                class258 var42 = (class258) class128.field2062.method1400((long) var39, true);
                class258 var43 = (class258) class128.field2062.method1400((long) var40, true);
                if (var43 != null) {
                    class66.method461(-27002, var42 == null || var42.field4100 != var43.field4100, var43);
                }
                if (var42 != null) {
                    var42.method1388(arg0 + 70);
                    class128.field2062.method1399(arg0 ^ 0xFFFFE383, var42, (long) var40);
                }
                class36 var44 = class64.method455(var39, arg0 + 592427153);
                if (var44 != null) {
                    class280.method1886(var44, 32);
                }
                class36 var45 = class64.method455(var40, 592427152);
                if (var45 != null) {
                    class280.method1886(var45, arg0 + 33);
                    class195.method1330(var45, -1104623792, true);
                }
                if (class157.field2548 != -1) {
                    class241.method1665(1, class157.field2548, arg0 + 1);
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 249) {
            class244.field3918 = class67.field1103.method1519((byte) 126);
            class84.field1309 = class67.field1103.method1534(false);
            for (int var46 = class84.field1309; var46 < (class84.field1309 + 8); var46++) {
                for (int var48 = class244.field3918; var48 < (class244.field3918 + 8); var48++) {
                    if (class67.field1104[class250.field3980][var46][var48] != null) {
                        class67.field1104[class250.field3980][var46][var48] = null;
                        class169.method1168(-64, var46, var48);
                    }
                }
            }
            for (class285 var47 = (class285) class206.field3310.method843(72); var47 != null; var47 = (class285) class206.field3310.method852((byte) 123)) {
                if (class84.field1309 <= var47.field4501 && var47.field4501 < (class84.field1309 + 8) && var47.field4509 >= class244.field3918 && var47.field4509 < class244.field3918 + 8 && class250.field3980 == var47.field4505) {
                    var47.field4498 = 0;
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 207) {
            int var49 = class67.field1103.method1521((byte) 113);
            int var50 = class67.field1103.method1515(arg0);
            int var51 = class67.field1103.method1512((byte) -126);
            int var52 = class67.field1103.method1523((byte) -89);
            int var53 = class67.field1103.method1527(-10661);
            if (class205.method1421(var50, true)) {
                class21.method197(var49, var52, (byte) 96, 7, var53 << 16 | var51);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 76) {
            int var54 = class67.field1103.method1521((byte) 113);
            int var55 = class67.field1103.method1515(-1);
            int var56 = class67.field1103.method1519((byte) 126);
            if (class205.method1421(var54, true)) {
                if (var56 == 2) {
                    class12.method95(113);
                }
                class157.field2548 = var55;
                class136.method956(var55, -125);
                class271.method1836(false, -103);
                class183.method1242(class157.field2548, 0);
                for (int var57 = 0; var57 < 100; var57++) {
                    class275.field4352[var57] = true;
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 46) {
            class112.field1847 = class66.field1094;
            long var58 = class67.field1103.method1507(93);
            if (var58 == 0L) {
                class121.field1973 = -1;
                class110.field1819 = null;
                class197.field3145 = null;
                class206.field3301 = 0;
                class135.field2226 = null;
                return true;
            }
            long var60 = class67.field1103.method1507(71);
            class197.field3145 = class141.method979(var60, (byte) 98);
            class135.field2226 = class141.method979(var58, (byte) -79);
            class252.field4004 = class67.field1103.method1535((byte) -83);
            int var62 = class67.field1103.method1517((byte) -96);
            if (var62 == 255) {
                class121.field1973 = -1;
                return true;
            }
            class206.field3301 = var62;
            class87[] var63 = new class87[100];
            for (int var64 = 0; var64 < class206.field3301; var64++) {
                var63[var64] = new class87();
                var63[var64].field3247 = class67.field1103.method1507(-108);
                var63[var64].field1386 = class141.method979(var63[var64].field3247, (byte) 94);
                var63[var64].field1387 = class67.field1103.method1521((byte) 113);
                var63[var64].field1389 = class67.field1103.method1535((byte) -126);
                var63[var64].field1382 = class67.field1103.method1539(84);
                if (class53.field919 == var63[var64].field3247) {
                    class36.field552 = var63[var64].field1389;
                }
            }
            boolean var65 = false;
            int var66 = class206.field3301;
            while (var66 > 0) {
                boolean var67 = true;
                var66--;
                for (int var68 = 0; var68 < var66; var68++) {
                    if (var63[var68].field1386.compareTo(var63[var68 + 1].field1386) > 0) {
                        class87 var69 = var63[var68];
                        var67 = false;
                        var63[var68] = var63[var68 + 1];
                        var63[var68 + 1] = var69;
                    }
                }
                if (var67) {
                    break;
                }
            }
            class121.field1973 = -1;
            class110.field1819 = var63;
            return true;
        } else if (class121.field1973 == 183) {
            int var70 = class67.field1103.method1542(arg0 ^ 0xFFFFFFFB);
            int var71 = var70 >> 28 & 0x3;
            int var72 = var70 >> 14 & 0x3FFF;
            int var73 = var70 & 0x3FFF;
            int var74 = class67.field1103.method1512((byte) -123);
            if (var74 == 65535) {
                var74 = -1;
            }
            int var75 = class67.field1103.method1553((byte) 81);
            int var76 = var73 - class214.field3501;
            int var77 = var75 >> 2;
            int var78 = var72 - class50.field884;
            int var79 = var75 & 0x3;
            int var80 = class95.field1562[var77];
            class217.method1481((byte) -62, var79, var77, var78, var80, var71, var74, var76);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 226) {
            class87.method634(true, 18129);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 219) {
            int var81 = class67.field1103.method1517((byte) -96);
            if (class67.field1103.method1517((byte) -96) == 0) {
                class260.field4140[var81] = new class149();
            } else {
                class67.field1103.field3655--;
                class260.field4140[var81] = new class149(class67.field1103);
            }
            class39.field725 = class66.field1094;
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 88) {
            int var82 = class67.field1103.method1527(-10661);
            int var83 = class67.field1103.method1523((byte) -89);
            int var84 = class67.field1103.method1527(-10661);
            if (class205.method1421(var82, true)) {
                class110.method808(var84, var83, true);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 255) {
            int var85 = class67.field1103.method1505(115);
            String var86 = class67.field1103.method1539(arg0 ^ 0x6D);
            int var87 = class67.field1103.method1527(-10661);
            if (class205.method1421(var87, true)) {
                class261.method1782(var85, var86, (byte) 85);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 65) {
            if (class115.field1912 == 0) {
                class1.field28 = class45.field826;
            } else {
                class1.field28 = class67.field1103.method1539(arg0 ^ 0xFFFFFFF5);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 164) {
            String var88 = class67.field1103.method1539(-103);
            if (var88.endsWith(":tradereq:")) {
                String var124 = var88.substring(0, var88.indexOf(":"));
                long var125 = class74.method522((byte) -118, var124);
                boolean var127 = false;
                for (int var128 = 0; var128 < class185.field2910; var128++) {
                    if (class183.field2884[var128] == var125) {
                        var127 = true;
                        break;
                    }
                }
                if (!var127 && class225.field3731 == 0) {
                    class226.method1588(var124, 4, (byte) -19, class53.field915);
                }
            } else if (var88.endsWith(":chalreq:")) {
                String var89 = var88.substring(0, var88.indexOf(":"));
                long var90 = class74.method522((byte) -106, var89);
                boolean var92 = false;
                for (int var93 = 0; var93 < class185.field2910; var93++) {
                    if (class183.field2884[var93] == var90) {
                        var92 = true;
                        break;
                    }
                }
                if (!var92 && class225.field3731 == 0) {
                    String var94 = var88.substring(var88.indexOf(":") + 1, var88.length() + -9);
                    class226.method1588(var89, 8, (byte) -61, var94);
                }
            } else if (var88.endsWith(":assistreq:")) {
                String var119 = var88.substring(0, var88.indexOf(":"));
                long var120 = class74.method522((byte) -101, var119);
                boolean var122 = false;
                for (int var123 = 0; var123 < class185.field2910; var123++) {
                    if (class183.field2884[var123] == var120) {
                        var122 = true;
                        break;
                    }
                }
                if (!var122 && class225.field3731 == 0) {
                    class226.method1588(var119, 10, (byte) -27, "");
                }
            } else if (var88.endsWith(":clan:")) {
                String var95 = var88.substring(0, var88.indexOf(":clan:"));
                class226.method1588("", 11, (byte) -13, var95);
            } else if (var88.endsWith(":trade:")) {
                String var96 = var88.substring(0, var88.indexOf(":trade:"));
                if (class225.field3731 == 0) {
                    class226.method1588("", 12, (byte) -37, var96);
                }
            } else if (var88.endsWith(":assist:")) {
                String var118 = var88.substring(0, var88.indexOf(":assist:"));
                if (class225.field3731 == 0) {
                    class226.method1588("", 13, (byte) -127, var118);
                }
            } else if (var88.endsWith(":duelstake:")) {
                String var113 = var88.substring(0, var88.indexOf(":"));
                long var114 = class74.method522((byte) -95, var113);
                boolean var116 = false;
                for (int var117 = 0; var117 < class185.field2910; var117++) {
                    if (class183.field2884[var117] == var114) {
                        var116 = true;
                        break;
                    }
                }
                if (!var116 && class225.field3731 == 0) {
                    class226.method1588(var113, 14, (byte) -40, "");
                }
            } else if (var88.endsWith(":duelfriend:")) {
                String var108 = var88.substring(0, var88.indexOf(":"));
                long var109 = class74.method522((byte) -69, var108);
                boolean var111 = false;
                for (int var112 = 0; var112 < class185.field2910; var112++) {
                    if (class183.field2884[var112] == var109) {
                        var111 = true;
                        break;
                    }
                }
                if (!var111 && class225.field3731 == 0) {
                    class226.method1588(var108, 15, (byte) -85, "");
                }
            } else if (var88.endsWith(":clanreq:")) {
                String var97 = var88.substring(0, var88.indexOf(":"));
                long var98 = class74.method522((byte) -118, var97);
                boolean var100 = false;
                for (int var101 = 0; var101 < class185.field2910; var101++) {
                    if (class183.field2884[var101] == var98) {
                        var100 = true;
                        break;
                    }
                }
                if (!var100 && class225.field3731 == 0) {
                    class226.method1588(var97, 16, (byte) -93, "");
                }
            } else if (var88.endsWith(":allyreq:")) {
                String var102 = var88.substring(0, var88.indexOf(":"));
                long var103 = class74.method522((byte) -120, var102);
                boolean var105 = false;
                for (int var106 = 0; var106 < class185.field2910; var106++) {
                    if (class183.field2884[var106] == var103) {
                        var105 = true;
                        break;
                    }
                }
                if (!var105 && class225.field3731 == 0) {
                    String var107 = var88.substring(var88.indexOf(":") + 1, var88.length() + -9);
                    class226.method1588(var102, 21, (byte) -79, var107);
                }
            } else {
                class226.method1588("", 0, (byte) -16, var88);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 119) {
            class260.field4133 = class67.field1103.method1517((byte) -96);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 205) {
            class89.method646((byte) -8);
            int var129 = class67.field1103.method1519((byte) 126);
            int var130 = class67.field1103.method1526(arg0 - 16777215);
            int var131 = class67.field1103.method1517((byte) -96);
            class167.field2660[var131] = var130;
            class235.field3834[var131] = var129;
            class189.field3064[var131] = 1;
            for (int var132 = 0; var132 < 98; var132++) {
                if (class16.field281[var132] <= var130) {
                    class189.field3064[var131] = var132 + 2;
                }
            }
            class270.field4253[class202.method1393(31, class148.field2359++)] = var131;
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 130) {
            int var133 = class67.field1103.method1526(-16777216);
            int var134 = class67.field1103.method1521((byte) 113);
            class36 var135;
            if (var133 < 0) {
                var135 = null;
            } else {
                var135 = class64.method455(var133, 592427152);
            }
            if (var133 < -70000) {
                var134 += 32768;
            }
            if (var135 != null) {
                for (int var136 = 0; var136 < var135.field638.length; var136++) {
                    var135.field638[var136] = 0;
                    var135.field714[var136] = 0;
                }
            }
            class216.method1475((byte) -122, var134);
            int var137 = class67.field1103.method1521((byte) 113);
            for (int var138 = 0; var138 < var137; var138++) {
                int var139 = class67.field1103.method1515(arg0);
                int var140 = class67.field1103.method1553((byte) 81);
                if (var140 == 255) {
                    var140 = class67.field1103.method1523((byte) -89);
                }
                if (var135 != null && var138 < var135.field638.length) {
                    var135.field638[var138] = var139;
                    var135.field714[var138] = var140;
                }
                class155.method1078(var134, 0, var140, var139 - 1, var138);
            }
            if (var135 != null) {
                class280.method1886(var135, 32);
            }
            class89.method646((byte) -8);
            class277.field4359[class202.method1393(class90.field1485++, 31)] = class202.method1393(var134, 32767);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 247) {
            int var141 = class67.field1103.method1521((byte) 113);
            if (var141 == 65535) {
                var141 = -1;
            }
            class235.method1637(var141, (byte) -88);
            class121.field1973 = -1;
            return true;
        } else if (~class121.field1973 == arg0) {
            int var142 = class67.field1103.method1525(-3849);
            int var143 = class67.field1103.method1527(-10661);
            if (var143 == 65535) {
                var143 = -1;
            }
            class220.method1498(var142, 0, var143);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 31) {
            class84.field1309 = class67.field1103.method1534(false);
            class244.field3918 = class67.field1103.method1553((byte) 81);
            while (class67.field1103.field3655 < class115.field1912) {
                class121.field1973 = class67.field1103.method1517((byte) -96);
                class189.method1294((byte) -71);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 107) {
            int var144 = class67.field1103.method1526(arg0 ^ 0xFFFFFF);
            int var145 = class67.field1103.method1521((byte) 113);
            int var146 = class67.field1103.method1512((byte) -125);
            if (var146 == 65535) {
                var146 = -1;
            }
            if (class205.method1421(var145, true)) {
                class21.method197(-1, var144, (byte) 96, 2, var146);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 165) {
            int var147 = class67.field1103.method1521((byte) 113);
            int var148 = class67.field1103.method1526(arg0 ^ 0xFFFFFF);
            if (class205.method1421(var147, true)) {
                class258 var149 = (class258) class128.field2062.method1400((long) var148, true);
                if (var149 != null) {
                    class66.method461(-27002, true, var149);
                }
                if (class207.field3333 != null) {
                    class280.method1886(class207.field3333, 32);
                    class207.field3333 = null;
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 135) {
            String var150 = class67.field1103.method1539(28);
            int var151 = class67.field1103.method1553((byte) 81);
            int var152 = class67.field1103.method1527(-10661);
            int var153 = class67.field1103.method1534(false);
            if (var152 == 65535) {
                var152 = -1;
            }
            if (var153 >= 1 && var153 <= 8) {
                if (var150.equalsIgnoreCase("null")) {
                    var150 = null;
                }
                class220.field3609[var153 - 1] = var150;
                class32.field497[var153 - 1] = var152;
                class103.field1674[var153 - 1] = var151 == 0;
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 200) {
            int var154 = class67.field1103.method1523((byte) -89);
            int var155 = class67.field1103.method1521((byte) 113);
            class113.method832(var155, var154, (byte) -6);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 236) {
            int var156 = class67.field1103.method1523((byte) -89);
            int var157 = class67.field1103.method1512((byte) -126);
            class234.method1635((byte) -109, var157, var156);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 173) {
            int var158 = class67.field1103.method1527(-10661);
            int var159 = class67.field1103.method1526(-16777216);
            int var160 = class67.field1103.method1512((byte) -126);
            if (class205.method1421(var158, true)) {
                class174.method1189(arg0 ^ 0xFFFFD39E, var160, var159);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 58) {
            int var161 = class67.field1103.method1515(arg0);
            int var162 = class67.field1103.method1544((byte) 6);
            int var163 = class67.field1103.method1523((byte) -89);
            int var164 = class67.field1103.method1522((byte) -120);
            if (class205.method1421(var161, true)) {
                class125.method899(true, var162, var163, var164);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 237) {
            class179.method1219(-22171, class67.field1103, class105.field1684, class115.field1912);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 153) {
            long var165 = class67.field1103.method1507(56);
            class67.field1103.method1535((byte) -118);
            long var167 = class67.field1103.method1507(46);
            long var169 = (long) class67.field1103.method1521((byte) 113);
            long var171 = (long) class67.field1103.method1531(65280);
            long var173 = (var169 << 32) + var171;
            boolean var175 = false;
            int var176 = class67.field1103.method1517((byte) -96);
            int var177 = 0;
            label1333: while (true) {
                if (var177 >= 100) {
                    if (var176 <= 1) {
                        if ((!class215.field3516 || class74.field1201) && !class9.field134) {
                            for (int var178 = 0; var178 < class185.field2910; var178++) {
                                if (class183.field2884[var178] == var165) {
                                    var175 = true;
                                    break label1333;
                                }
                            }
                        } else {
                            var175 = true;
                        }
                    }
                    break;
                }
                if (class154.field2486[var177] == var173) {
                    var175 = true;
                    break;
                }
                var177++;
            }
            if (!var175 && class225.field3731 == 0) {
                class154.field2486[class74.field1204] = var173;
                class74.field1204 = (class74.field1204 + 1) % 100;
                String var179 = class269.method1819(class61.method437(arg0 + 8347, class44.method364((byte) 105, class67.field1103)));
                if (var176 == 2 || var176 == 3) {
                    class170.method1170(var179, class118.method862(true, var167), "<img=1>" + class118.method862(true, var165), 9, (byte) 55);
                } else if (var176 == 1) {
                    class170.method1170(var179, class118.method862(true, var167), "<img=0>" + class118.method862(true, var165), 9, (byte) 55);
                } else {
                    class170.method1170(var179, class118.method862(true, var167), class118.method862(true, var165), 9, (byte) 55);
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 43) {
            int var180 = class67.field1103.method1512((byte) -125);
            int var181 = class67.field1103.method1521((byte) 113);
            int var182 = class67.field1103.method1542(4);
            int var183 = class67.field1103.method1512((byte) -126);
            if ((var182 >> 30) != 0) {
                int var194 = var182 >> 28 & 0x3;
                int var195 = (var182 & 0x3FFF) - class214.field3501;
                int var196 = ((var182 & 0xFFFF21A) >> 14) - class50.field884;
                if (var196 >= 0 && var195 >= 0 && var196 < 104 && var195 < 104) {
                    int var197 = var196 * 128 + 64;
                    int var198 = var195 * 128 + 64;
                    class170 var199 = new class170(var180, var194, var197, var198, class225.method1583(var198, var197, var194, 0) - var181, var183, class222.field3682);
                    class162.field2586.method855(false, new class174(var199));
                }
            } else if (var182 >> 29 != 0) {
                int var189 = var182 & 0xFFFF;
                class15 var190 = class137.field2260[var189];
                if (var190 != null) {
                    if (var180 == 65535) {
                        var180 = -1;
                    }
                    boolean var191 = true;
                    if (var180 != -1 && var190.field3352 != -1 && class49.method384(class277.method1862(var180, 72).field3050, -115).field2855 < class49.method384(class277.method1862(var190.field3352, arg0 ^ 0xFFFFFF94).field3050, -121).field2855) {
                        var191 = false;
                    }
                    if (var191) {
                        var190.field3410 = var181;
                        var190.field3347 = 1;
                        var190.field3366 = 0;
                        var190.field3352 = var180;
                        var190.field3348 = class222.field3682 + var183;
                        var190.field3323 = 0;
                        if (class222.field3682 < var190.field3348) {
                            var190.field3366 = -1;
                        }
                        if (var190.field3352 != -1 && class222.field3682 == var190.field3348) {
                            int var192 = class277.method1862(var190.field3352, 24).field3050;
                            if (var192 != -1) {
                                class181 var193 = class49.method384(var192, -123);
                                if (var193 != null && var193.field2848 != null) {
                                    class132.method934((byte) 112, var193, var190.field3389, var190.field3341, 0, false);
                                }
                            }
                        }
                    }
                }
            } else if ((var182 >> 28) != 0) {
                int var184 = var182 & 0xFFFF;
                class33 var185;
                if (class233.field3811 == var184) {
                    var185 = class167.field2655;
                } else {
                    var185 = class35.field548[var184];
                }
                if (var185 != null) {
                    if (var180 == 65535) {
                        var180 = -1;
                    }
                    boolean var186 = true;
                    if (var180 != -1 && var185.field3352 != -1 && class49.method384(class277.method1862(var180, arg0 ^ 0xFFFFFFA0).field3050, arg0 ^ 0xFFFFFFE2).field2855 < class49.method384(class277.method1862(var185.field3352, 98).field3050, -121).field2855) {
                        var186 = false;
                    }
                    if (var186) {
                        var185.field3366 = 0;
                        var185.field3323 = 0;
                        var185.field3347 = 1;
                        var185.field3352 = var180;
                        var185.field3348 = class222.field3682 + var183;
                        var185.field3410 = var181;
                        if (var185.field3352 == 65535) {
                            var185.field3352 = -1;
                        }
                        if (class222.field3682 < var185.field3348) {
                            var185.field3366 = -1;
                        }
                        if (var185.field3352 != -1 && class222.field3682 == var185.field3348) {
                            int var187 = class277.method1862(var185.field3352, 79).field3050;
                            if (var187 != -1) {
                                class181 var188 = class49.method384(var187, -96);
                                if (var188 != null && var188.field2848 != null) {
                                    class132.method934((byte) 112, var188, var185.field3389, var185.field3341, 0, class167.field2655 == var185);
                                }
                            }
                        }
                    }
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 55) {
            int var200 = class67.field1103.method1527(-10661);
            int var201 = class67.field1103.method1526(-16777216);
            int var202 = class67.field1103.method1550(-112);
            if (class205.method1421(var200, true)) {
                class81.method586(var202, var201, false);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 72) {
            int var203 = class67.field1103.method1527(-10661);
            class12.method89(var203, 110);
            class277.field4359[class202.method1393(class90.field1485++, 31)] = class202.method1393(32767, var203);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 56) {
            class244.field3918 = class67.field1103.method1534(false);
            class84.field1309 = class67.field1103.method1519((byte) 126);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 185) {
            long var204 = class67.field1103.method1507(78);
            int var206 = class67.field1103.method1521((byte) 113);
            String var207 = class223.method1572((byte) 93, var206).method789(class67.field1103, (byte) -128);
            class28.method240(class118.method862(true, var204), var206, (String) null, 19, var207, -68);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 189) {
            class72.method514(arg0 + 105);
            class121.field1973 = -1;
            return false;
        } else if (class121.field1973 == 209) {
            class234.field3820 = class67.field1103.method1515(-1) * 30;
            class121.field1973 = -1;
            class169.field2687 = class66.field1094;
            return true;
        } else if (class121.field1973 == 12) {
            int var208 = class67.field1103.method1517((byte) -96);
            class60 var209 = new class60();
            int var210 = var208 >> 6;
            var209.field981 = var208 & 0x3F;
            var209.field988 = class67.field1103.method1517((byte) -96);
            if (var209.field988 >= 0 && class278.field4377.length > var209.field988) {
                if (var209.field981 == 1 || var209.field981 == 10) {
                    var209.field994 = class67.field1103.method1521((byte) 113);
                    class67.field1103.field3655 += 3;
                } else if (var209.field981 >= 2 && var209.field981 <= 6) {
                    if (var209.field981 == 2) {
                        var209.field986 = 64;
                        var209.field989 = 64;
                    }
                    if (var209.field981 == 3) {
                        var209.field986 = 64;
                        var209.field989 = 0;
                    }
                    if (var209.field981 == 4) {
                        var209.field986 = 64;
                        var209.field989 = 128;
                    }
                    if (var209.field981 == 5) {
                        var209.field986 = 0;
                        var209.field989 = 64;
                    }
                    if (var209.field981 == 6) {
                        var209.field986 = 128;
                        var209.field989 = 64;
                    }
                    var209.field981 = 2;
                    var209.field996 = class67.field1103.method1521((byte) 113);
                    var209.field987 = class67.field1103.method1521((byte) 113);
                    var209.field983 = class67.field1103.method1517((byte) -96);
                }
                var209.field982 = class67.field1103.method1521((byte) 113);
                if (var209.field982 == 65535) {
                    var209.field982 = -1;
                }
                class156.field2539[var210] = var209;
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 225) {
            long var211 = class67.field1103.method1507(arg0 + 40);
            long var213 = (long) class67.field1103.method1521((byte) 113);
            long var215 = (long) class67.field1103.method1531(65280);
            int var217 = class67.field1103.method1517((byte) -96);
            int var218 = class67.field1103.method1521((byte) 113);
            long var219 = (var213 << 32) + var215;
            boolean var221 = false;
            int var222 = 0;
            label1359: while (true) {
                if (var222 >= 100) {
                    if (var217 <= 1) {
                        for (int var223 = 0; var223 < class185.field2910; var223++) {
                            if (class183.field2884[var223] == var211) {
                                var221 = true;
                                break label1359;
                            }
                        }
                    }
                    break;
                }
                if (class154.field2486[var222] == var219) {
                    var221 = true;
                    break;
                }
                var222++;
            }
            if (!var221 && class225.field3731 == 0) {
                class154.field2486[class74.field1204] = var219;
                class74.field1204 = (class74.field1204 + 1) % 100;
                String var224 = class223.method1572((byte) 93, var218).method789(class67.field1103, (byte) -128);
                if (var217 == 2) {
                    class28.method240("<img=1>" + class118.method862(true, var211), var218, (String) null, 18, var224, -109);
                } else if (var217 == 1) {
                    class28.method240("<img=0>" + class118.method862(true, var211), var218, (String) null, 18, var224, -55);
                } else {
                    class28.method240(class118.method862(true, var211), var218, (String) null, 18, var224, -113);
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 24) {
            class98.method720(-87);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 176) {
            long var225 = class67.field1103.method1507(arg0 ^ 0x3C);
            int var227 = class67.field1103.method1521((byte) 113);
            byte var228 = class67.field1103.method1535((byte) -128);
            boolean var229 = false;
            if ((Long.MIN_VALUE & var225) != 0L) {
                var229 = true;
            }
            if (var229) {
                if (class206.field3301 == 0) {
                    class121.field1973 = -1;
                    return true;
                }
                long var230 = var225 & Long.MAX_VALUE;
                boolean var232 = false;
                int var233;
                for (var233 = 0; var233 < class206.field3301 && (class110.field1819[var233].field3247 != var230 || class110.field1819[var233].field1387 != var227); var233++) {
                }
                if (class206.field3301 > var233) {
                    while (var233 < class206.field3301 - 1) {
                        class110.field1819[var233] = class110.field1819[var233 + 1];
                        var233++;
                    }
                    class206.field3301--;
                    class110.field1819[class206.field3301] = null;
                }
            } else {
                String var234 = class67.field1103.method1539(-126);
                class87 var235 = new class87();
                var235.field3247 = var225;
                var235.field1386 = class141.method979(var235.field3247, (byte) 98);
                var235.field1382 = var234;
                var235.field1387 = var227;
                var235.field1389 = var228;
                int var236;
                for (var236 = class206.field3301 - 1; var236 >= 0; var236--) {
                    int var237 = class110.field1819[var236].field1386.compareTo(var235.field1386);
                    if (var237 == 0) {
                        class110.field1819[var236].field1387 = var227;
                        class110.field1819[var236].field1389 = var228;
                        class110.field1819[var236].field1382 = var234;
                        class112.field1847 = class66.field1094;
                        if (class53.field919 == var225) {
                            class36.field552 = var228;
                        }
                        class121.field1973 = -1;
                        return true;
                    }
                    if (var237 < 0) {
                        break;
                    }
                }
                if (class206.field3301 >= class110.field1819.length) {
                    class121.field1973 = -1;
                    return true;
                }
                for (int var238 = class206.field3301 - 1; var238 > var236; var238--) {
                    class110.field1819[var238 + 1] = class110.field1819[var238];
                }
                if (class206.field3301 == 0) {
                    class110.field1819 = new class87[100];
                }
                class110.field1819[var236 + 1] = var235;
                class206.field3301++;
                if (class53.field919 == var225) {
                    class36.field552 = var228;
                }
            }
            class121.field1973 = -1;
            class112.field1847 = class66.field1094;
            return true;
        } else if (class121.field1973 == 102) {
            class67.field1103.field3655 += 28;
            if (class67.field1103.method1551(26794)) {
                class122.method881(-21374, class67.field1103.field3655 - 28, class67.field1103);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 242) {
            int var239 = class67.field1103.method1521((byte) 113);
            if (class205.method1421(var239, true)) {
                class96.method713(0);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 228) {
            class94.method704(91);
            class89.method646((byte) -8);
            class121.field1973 = -1;
            class176.field2785 += 32;
            return true;
        } else if (class121.field1973 == 38) {
            class154.field2483 = class67.field1103.method1517((byte) -96);
            class118.field1943 = class67.field1103.method1517((byte) -96);
            class177.field2794 = class67.field1103.method1517((byte) -96);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 59) {
            class89.method646((byte) -8);
            class107.field1762 = class67.field1103.method1517((byte) -96);
            class121.field1973 = -1;
            class169.field2687 = class66.field1094;
            return true;
        } else if (class121.field1973 == 151) {
            class89.method646((byte) -8);
            class168.field2669 = class67.field1103.method1550(62);
            class121.field1973 = -1;
            class169.field2687 = class66.field1094;
            return true;
        } else if (class121.field1973 == 217 || class121.field1973 == 2 || class121.field1973 == 156 || class121.field1973 == 142 || class121.field1973 == 230 || class121.field1973 == 254 || class121.field1973 == 134 || class121.field1973 == 98 || class121.field1973 == 120 || class121.field1973 == 75 || class121.field1973 == 40 || class121.field1973 == 109 || class121.field1973 == 211) {
            class189.method1294((byte) -63);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 146) {
            int var240 = class67.field1103.method1512((byte) -126);
            int var241 = class67.field1103.method1512((byte) -128);
            int var242 = class67.field1103.method1526(arg0 - 16777215);
            int var243 = class67.field1103.method1515(-1);
            if (class205.method1421(var240, true)) {
                class98.method722((var241 << 16) + var243, true, var242);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 53) {
            String var244 = class67.field1103.method1539(42);
            int var245 = class67.field1103.method1527(-10661);
            int var246 = class67.field1103.method1527(-10661);
            if (class205.method1421(var246, true)) {
                class215.method1471(var244, var245, (byte) 32);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 251) {
            int var247 = class67.field1103.method1505(109);
            class36 var248 = class64.method455(var247, 592427152);
            for (int var249 = 0; var249 < var248.field638.length; var249++) {
                var248.field638[var249] = -1;
                var248.field638[var249] = 0;
            }
            class280.method1886(var248, 32);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 15) {
            int var250 = class67.field1103.method1534(false);
            int var251 = class67.field1103.method1505(121);
            int var252 = class67.field1103.method1527(-10661);
            int var253 = class67.field1103.method1512((byte) -127);
            if (class205.method1421(var253, true)) {
                class258 var254 = (class258) class128.field2062.method1400((long) var251, true);
                if (var254 != null) {
                    class66.method461(arg0 - 27001, var254.field4100 != var252, var254);
                }
                class240.method1661(var251, 127, var250, var252);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 216) {
            class24.method225(class67.field1103.method1539(-105), (byte) -82);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 177) {
            int var255 = class67.field1103.method1542(4);
            int var256 = class67.field1103.method1515(-1);
            int var257 = class67.field1103.method1515(-1);
            if (var257 == 65535) {
                var257 = -1;
            }
            if (class205.method1421(var256, true)) {
                class21.method197(-1, var255, (byte) 96, 1, var257);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 129) {
            byte[] var258 = new byte[class115.field1912];
            class67.field1103.method532((byte) -114, class115.field1912, var258, 0);
            String var259 = class285.method1914(class115.field1912, var258, 0, -1);
            if (class110.field1811 == null && class165.field2609 == 3 || !class165.field2624.startsWith("win") || class148.field2388) {
                class287.method1930(var259, (byte) 25, true);
            } else {
                class110.field1807 = true;
                class155.field2510 = var259;
                class5.field68 = class105.field1684.method1139(var259, -106);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 4) {
            class121.field1973 = -1;
            class76.field1228 = 0;
            return true;
        } else if (class121.field1973 == 220) {
            class185.field2910 = class115.field1912 / 8;
            for (int var260 = 0; var260 < class185.field2910; var260++) {
                class183.field2884[var260] = class67.field1103.method1507(74);
                class214.field3497[var260] = class63.method447(class183.field2884[var260], class91.method687(arg0, -128));
            }
            class121.field1973 = -1;
            class99.field1633 = class66.field1094;
            return true;
        } else if (class121.field1973 == 94) {
            int var261 = class67.field1103.method1505(arg0 - 109);
            class98.field1619 = class105.field1684.method1142(0, var261);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 187) {
            int var262 = class67.field1103.method1521((byte) 113);
            int var263 = class67.field1103.method1517((byte) -96);
            int var264 = class67.field1103.method1517((byte) -96);
            int var265 = class67.field1103.method1521((byte) 113);
            int var266 = class67.field1103.method1517((byte) -96);
            int var267 = class67.field1103.method1517((byte) -96);
            if (class205.method1421(var262, true)) {
                class202.method1390(var266, var265, var267, var263, (byte) -90, var264);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 22) {
            int var268 = class67.field1103.method1515(-1);
            String var269 = class67.field1103.method1539(-99);
            int var270 = class67.field1103.method1515(arg0);
            if (class205.method1421(var270, true)) {
                class215.method1471(var269, var268, (byte) 32);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 128) {
            int var271 = class67.field1103.method1521((byte) 113);
            String var272 = class67.field1103.method1539(arg0 ^ 0x61);
            Object[] var273 = new Object[var272.length() + 1];
            for (int var274 = var272.length() - 1; var274 >= 0; var274--) {
                if (var272.charAt(var274) == 's') {
                    var273[var274 + 1] = class67.field1103.method1539(arg0 - 116);
                } else {
                    var273[var274 + 1] = Integer.valueOf(class67.field1103.method1526(-16777216));
                }
            }
            var273[0] = Integer.valueOf(class67.field1103.method1526(class91.method687(arg0, 16777215)));
            if (class205.method1421(var271, true)) {
                class213 var275 = new class213();
                var275.field3477 = var273;
                class89.method645(-90, var275);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 239) {
            int var276 = class67.field1103.method1526(-16777216);
            int var277 = class67.field1103.method1521((byte) 113);
            class36 var278;
            if (var276 < 0) {
                var278 = null;
            } else {
                var278 = class64.method455(var276, 592427152);
            }
            if (var276 < -70000) {
                var277 += 32768;
            }
            while (class67.field1103.field3655 < class115.field1912) {
                int var279 = class67.field1103.method1528(19380);
                int var280 = class67.field1103.method1521((byte) 113);
                int var281 = 0;
                if (var280 != 0) {
                    var281 = class67.field1103.method1517((byte) -96);
                    if (var281 == 255) {
                        var281 = class67.field1103.method1526(-16777216);
                    }
                }
                if (var278 != null && var279 >= 0 && var279 < var278.field638.length) {
                    var278.field638[var279] = var280;
                    var278.field714[var279] = var281;
                }
                class155.method1078(var277, arg0 + 1, var281, var280 - 1, var279);
            }
            if (var278 != null) {
                class280.method1886(var278, 32);
            }
            class89.method646((byte) -8);
            class277.field4359[class202.method1393(class90.field1485++, 31)] = class202.method1393(var277, 32767);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 45) {
            long var282 = class67.field1103.method1507(56);
            class67.field1103.method1535((byte) -119);
            long var284 = class67.field1103.method1507(58);
            long var286 = (long) class67.field1103.method1521((byte) 113);
            long var288 = (long) class67.field1103.method1531(arg0 ^ 0xFFFF00FF);
            long var290 = (var286 << 32) + var288;
            int var292 = class67.field1103.method1517((byte) -96);
            int var293 = class67.field1103.method1521((byte) 113);
            boolean var294 = false;
            int var295 = 0;
            label1442: while (true) {
                if (var295 >= 100) {
                    if (var292 <= 1) {
                        for (int var296 = 0; var296 < class185.field2910; var296++) {
                            if (class183.field2884[var296] == var282) {
                                var294 = true;
                                break label1442;
                            }
                        }
                    }
                    break;
                }
                if (class154.field2486[var295] == var290) {
                    var294 = true;
                    break;
                }
                var295++;
            }
            if (!var294 && class225.field3731 == 0) {
                class154.field2486[class74.field1204] = var290;
                class74.field1204 = (class74.field1204 + 1) % 100;
                String var297 = class223.method1572((byte) 107, var293).method789(class67.field1103, (byte) -128);
                if (var292 == 2 || var292 == 3) {
                    class28.method240("<img=1>" + class118.method862(true, var282), var293, class118.method862(true, var284), 20, var297, -95);
                } else if (var292 == 1) {
                    class28.method240("<img=0>" + class118.method862(true, var282), var293, class118.method862(true, var284), 20, var297, -44);
                } else {
                    class28.method240(class118.method862(true, var282), var293, class118.method862(true, var284), 20, var297, arg0 ^ 0x38);
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 30) {
            for (int var298 = 0; var298 < class35.field548.length; var298++) {
                if (class35.field548[var298] != null) {
                    class35.field548[var298].field3378 = -1;
                }
            }
            for (int var299 = 0; var299 < class137.field2260.length; var299++) {
                if (class137.field2260[var299] != null) {
                    class137.field2260[var299].field3378 = -1;
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 235) {
            int var300 = class67.field1103.method1515(-1);
            int var301 = class67.field1103.method1512((byte) -125);
            int var302 = class67.field1103.method1517((byte) -96);
            if (class205.method1421(var301, true)) {
                class174.method1189(11361, var300, var302);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 145) {
            class33.method281((byte) 75);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 33) {
            long var303 = class67.field1103.method1507(-124);
            long var305 = (long) class67.field1103.method1521((byte) 113);
            long var307 = (long) class67.field1103.method1531(65280);
            long var309 = (var305 << 32) + var307;
            int var311 = class67.field1103.method1517((byte) -96);
            boolean var312 = false;
            int var313 = 0;
            label1472: while (true) {
                if (var313 >= 100) {
                    if (var311 <= 1) {
                        if ((!class215.field3516 || class74.field1201) && !class9.field134) {
                            for (int var314 = 0; var314 < class185.field2910; var314++) {
                                if (class183.field2884[var314] == var303) {
                                    var312 = true;
                                    break label1472;
                                }
                            }
                        } else {
                            var312 = true;
                        }
                    }
                    break;
                }
                if (class154.field2486[var313] == var309) {
                    var312 = true;
                    break;
                }
                var313++;
            }
            if (!var312 && class225.field3731 == 0) {
                class154.field2486[class74.field1204] = var309;
                class74.field1204 = (class74.field1204 + 1) % 100;
                String var315 = class269.method1819(class61.method437(arg0 ^ 0xFFFFDF65, class44.method364((byte) 79, class67.field1103)));
                if (var311 == 2 || var311 == 3) {
                    class226.method1588("<img=1>" + class118.method862(true, var303), 7, (byte) -44, var315);
                } else if (var311 == 1) {
                    class226.method1588("<img=0>" + class118.method862(true, var303), 7, (byte) -44, var315);
                } else {
                    class226.method1588(class118.method862(true, var303), 3, (byte) -75, var315);
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 175) {
            int var316 = class67.field1103.method1512((byte) -123);
            int var317 = class67.field1103.method1519((byte) 127);
            if (class205.method1421(var316, true)) {
                class22.field374 = var317;
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 238) {
            int var318 = class67.field1103.method1526(-16777216);
            int var319 = class67.field1103.method1527(-10661);
            int var320 = class67.field1103.method1517((byte) -96);
            if (class205.method1421(var319, true)) {
                class205.method1420(var318, var320, -520);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 100) {
            int var321 = class67.field1103.method1512((byte) -123);
            int var322 = class67.field1103.method1512((byte) -122);
            int var323 = class67.field1103.method1515(-1);
            int var324 = class67.field1103.method1521((byte) 113);
            int var325 = class67.field1103.method1505(120);
            if (class205.method1421(var324, true)) {
                class89.method665(var323, var322, var321, (byte) 114, var325);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 218) {
            for (int var326 = 0; var326 < class82.field1289.length; var326++) {
                if (class82.field1289[var326] != class43.field794[var326]) {
                    class82.field1289[var326] = class43.field794[var326];
                    class111.method813(var326, 119);
                    class85.field1356[class202.method1393(class176.field2785++, 31)] = var326;
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 28) {
            int var327 = class67.field1103.method1521((byte) 113);
            byte var328 = class67.field1103.method1552(~arg0);
            class113.method832(var327, var328, (byte) -34);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 86) {
            int var329 = class67.field1103.method1526(-16777216);
            int var330 = class67.field1103.method1515(-1);
            int var331 = class67.field1103.method1521((byte) 113);
            if (class205.method1421(var330, true)) {
                class118.method866(var329, var331, (byte) 116);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 171) {
            class87.method634(false, arg0 + 18130);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 3) {
            long var332 = class67.field1103.method1507(arg0 + 71);
            int var334 = class67.field1103.method1521((byte) 113);
            boolean var335 = true;
            int var336 = class67.field1103.method1517((byte) -96);
            if (var332 < 0L) {
                var335 = false;
                var332 &= Long.MAX_VALUE;
            }
            String var337 = "";
            if (var334 > 0) {
                var337 = class67.field1103.method1539(48);
            }
            String var338 = class118.method862(true, var332);
            for (int var339 = 0; var339 < class239.field3875; var339++) {
                if (class60.field992[var339] == var332) {
                    if (class141.field2288[var339] != var334) {
                        class141.field2288[var339] = var334;
                        if (var334 > 0) {
                            class226.method1588("", 5, (byte) -72, var338 + class225.field3729);
                        }
                        if (var334 == 0) {
                            class226.method1588("", 5, (byte) -47, var338 + class284.field4479);
                        }
                    }
                    var338 = null;
                    class239.field3878[var339] = var337;
                    class137.field2263[var339] = var336;
                    class197.field3132[var339] = var335;
                    break;
                }
            }
            if (var338 != null && class239.field3875 < 200) {
                class60.field992[class239.field3875] = var332;
                class86.field1379[class239.field3875] = var338;
                class141.field2288[class239.field3875] = var334;
                class239.field3878[class239.field3875] = var337;
                class137.field2263[class239.field3875] = var336;
                class197.field3132[class239.field3875] = var335;
                class239.field3875++;
            }
            class99.field1633 = class66.field1094;
            boolean var340 = false;
            int var341 = class239.field3875;
            while (var341 > 0) {
                var341--;
                boolean var342 = true;
                for (int var343 = 0; var343 < var341; var343++) {
                    if (class141.field2288[var343] != class4.field46 && class141.field2288[var343 + 1] == class4.field46 || class141.field2288[var343] == 0 && class141.field2288[var343 + 1] != 0) {
                        int var344 = class141.field2288[var343];
                        class141.field2288[var343] = class141.field2288[var343 + 1];
                        class141.field2288[var343 + 1] = var344;
                        var342 = false;
                        String var345 = class239.field3878[var343];
                        class239.field3878[var343] = class239.field3878[var343 + 1];
                        class239.field3878[var343 + 1] = var345;
                        String var346 = class86.field1379[var343];
                        class86.field1379[var343] = class86.field1379[var343 + 1];
                        class86.field1379[var343 + 1] = var346;
                        long var347 = class60.field992[var343];
                        class60.field992[var343] = class60.field992[var343 + 1];
                        class60.field992[var343 + 1] = var347;
                        int var349 = class137.field2263[var343];
                        class137.field2263[var343] = class137.field2263[var343 + 1];
                        class137.field2263[var343 + 1] = var349;
                        boolean var350 = class197.field3132[var343];
                        class197.field3132[var343] = class197.field3132[var343 + 1];
                        class197.field3132[var343 + 1] = var350;
                    }
                }
                if (var342) {
                    break;
                }
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 144) {
            int var351 = class67.field1103.method1521((byte) 113);
            int var352 = class67.field1103.method1515(-1);
            int var353 = class67.field1103.method1519((byte) 127);
            class15 var354 = class137.field2260[var352];
            if (var354 != null) {
                class85.method614((byte) -55, var354, var353, var351);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 13) {
            int var355 = class67.field1103.method1521((byte) 113);
            int var356 = class67.field1103.method1517((byte) -96);
            int var357 = class67.field1103.method1517((byte) -96);
            int var358 = class67.field1103.method1521((byte) 113);
            int var359 = class67.field1103.method1517((byte) -96);
            int var360 = class67.field1103.method1517((byte) -96);
            if (class205.method1421(var355, true)) {
                class14.method113(true, var359, var358, var357, var356, 100, var360);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 174) {
            int var361 = class67.field1103.method1519((byte) 126);
            int var362 = class67.field1103.method1534(false);
            int var363 = class67.field1103.method1553((byte) 81);
            class250.field3980 = var362 >> 1;
            class167.field2655.method279(var361, var363, false, (var362 & 0x1) == 1);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 233) {
            if (class157.field2548 != -1) {
                class241.method1665(0, class157.field2548, ~arg0);
            }
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 14) {
            long var364 = class67.field1103.method1507(-99);
            String var366 = class269.method1819(class61.method437(8346, class44.method364((byte) 103, class67.field1103)));
            class226.method1588(class118.method862(true, var364), 6, (byte) -61, var366);
            class121.field1973 = -1;
            return true;
        } else if (class121.field1973 == 118) {
            int var367 = class67.field1103.method1526(arg0 - 16777215);
            int var368 = class67.field1103.method1542(4);
            int var369 = class67.field1103.method1512((byte) -124);
            int var370 = class67.field1103.method1512((byte) -122);
            if (var369 == 65535) {
                var369 = -1;
            }
            if (class205.method1421(var370, true)) {
                class36 var371 = class64.method455(var367, arg0 ^ 0xDCB0476F);
                if (var371.field597) {
                    class250.method1711(var367, var368, var369, true);
                    class12 var373 = class83.method595(var369, -68);
                    class89.method665(var373.field178, var373.field200, var373.field216, (byte) 114, var367);
                    class57.method424(var373.field202, (byte) -121, var373.field161, var367, var373.field184);
                } else if (var369 == -1) {
                    var371.field565 = 0;
                    class121.field1973 = -1;
                    return true;
                } else {
                    class12 var372 = class83.method595(var369, -105);
                    var371.field702 = var372.field200 * 100 / var368;
                    var371.field598 = var369;
                    var371.field565 = 4;
                    var371.field647 = var372.field216;
                    var371.field567 = var372.field178;
                    class280.method1886(var371, arg0 + 33);
                }
            }
            class121.field1973 = -1;
            return true;
        } else {
            class178.method1211("T1 - " + class121.field1973 + "," + class77.field1236 + "," + class76.field1229 + " - " + class115.field1912, -113, (Throwable) null);
            class72.method514(arg0 + 105);
            return true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1795(int arg0) {
        if (arg0 != 255) {
            field4219 = null;
        }
        field4219 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Lji;")
    public static final class42 method1796(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class42 var4 = var3.field2140;
            var3.field2140 = null;
            return var4;
        }
    }
}
