import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class251 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3794 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lrb;")
    public static class143 field3793 = new class143(8);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
    public static final int method1733(int arg0) {
        field3797++;
        if ((double) class46.field627 == 3.0D) {
            return 37;
        } else if ((double) class46.field627 == 4.0D) {
            return 50;
        } else if ((double) class46.field627 == 6.0D) {
            return 75;
        } else if (arg0 == 37) {
            return (double) class46.field627 == 8.0D ? 100 : 200;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Z")
    public static final boolean method1734(int arg0) throws IOException {
        field3795++;
        if (class281.field4537 == null) {
            return false;
        }
        int var1 = class281.field4537.method1434(0);
        if (var1 == 0) {
            return false;
        }
        if (class45.field592 == -1) {
            class281.field4537.method1443(-127, 0, class92.field1488.field758, 1);
            var1--;
            class92.field1488.field735 = 0;
            class45.field592 = class92.field1488.method681(true);
            class162.field2510 = class300.field4851[class45.field592];
        }
        if (class162.field2510 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class281.field4537.method1443(arg0 + 55, 0, class92.field1488.field758, 1);
            class162.field2510 = class92.field1488.field758[0] & 0xFF;
        }
        if (class162.field2510 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class281.field4537.method1443(-123, 0, class92.field1488.field758, 2);
            class92.field1488.field735 = 0;
            class162.field2510 = class92.field1488.method331(-50);
        }
        if (var1 < class162.field2510) {
            return false;
        }
        class92.field1488.field735 = 0;
        class281.field4537.method1443(29, 0, class92.field1488.field758, class162.field2510);
        class274.field4433 = class304.field4926;
        class304.field4926 = class222.field3258;
        class243.field3574 = 0;
        class222.field3258 = class45.field592;
        if (class45.field592 == 147) {
            class240.field3524 = class92.field1488.method366(-16505);
            class275.field4456 = class92.field1488.method359(255);
            for (int var2 = class240.field3524; var2 < class240.field3524 + 8; var2++) {
                for (int var4 = class275.field4456; var4 < class275.field4456 + 8; var4++) {
                    if (class37.field475[class37.field474][var2][var4] != null) {
                        class37.field475[class37.field474][var2][var4] = null;
                        class87.method641(var2, 3391, var4);
                    }
                }
            }
            for (class293 var3 = (class293) class222.field3228.method8(-89); var3 != null; var3 = (class293) class222.field3228.method12((byte) 69)) {
                if (var3.field4655 >= class240.field3524 && class240.field3524 + 8 > var3.field4655 && var3.field4663 >= class275.field4456 && var3.field4663 < (class275.field4456 + 8) && class37.field474 == var3.field4670) {
                    var3.field4668 = 0;
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 10) {
            int var5 = class92.field1488.method361(arg0 - 16777213);
            int var6 = class92.field1488.method354(arg0 - 93);
            class281.method1944(var6, var5, (byte) 121);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 173) {
            class23.method158(arg0 - 28878, class162.field2510, class92.field1488, class273.field4426);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 19) {
            int var7 = class92.field1488.method366(-16505);
            if (class92.field1488.method366(arg0 ^ 0x407A) == 0) {
                class313.field5026[var7] = new class81();
            } else {
                class92.field1488.field735--;
                class313.field5026[var7] = new class81(class92.field1488);
            }
            class99.field1686 = class248.field3705;
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 33) {
            int var8 = class92.field1488.method366(-16505);
            int var9 = class92.field1488.method366(-16505);
            byte var10 = class92.field1488.method335((byte) 26);
            if (class252.field3799 != var10) {
                class45.field592 = -1;
                return true;
            }
            if (var8 == 255) {
                class255.field3855 = 0;
                class113.field1883 = 0;
                class258.field4001 = false;
            } else {
                class255.field3855 = var9;
                class113.field1883 = var8;
                class258.field4001 = true;
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 174) {
            long var11 = class92.field1488.method371(22726);
            int var13 = class92.field1488.method331(-115);
            boolean var14 = false;
            if ((Long.MIN_VALUE & var11) != 0L) {
                var14 = true;
            }
            byte var15 = class92.field1488.method335((byte) 26);
            if (var14) {
                if (class78.field1261 == 0) {
                    class45.field592 = -1;
                    return true;
                }
                long var16 = var11 & Long.MAX_VALUE;
                boolean var18 = false;
                int var19;
                for (var19 = 0; class78.field1261 > var19 && (class62.field939[var19].field4008 != var16 || class62.field939[var19].field567 != var13); var19++) {
                }
                if (class78.field1261 > var19) {
                    while (var19 < class78.field1261 - 1) {
                        class62.field939[var19] = class62.field939[var19 + 1];
                        var19++;
                    }
                    class78.field1261--;
                    class62.field939[class78.field1261] = null;
                }
            } else {
                String var20 = class92.field1488.method326(78);
                class43 var21 = new class43();
                var21.field4008 = var11;
                var21.field565 = class38.method240(var21.field4008, true);
                var21.field567 = var13;
                var21.field563 = var15;
                var21.field562 = var20;
                int var22;
                for (var22 = class78.field1261 - 1; var22 >= 0; var22--) {
                    int var23 = class62.field939[var22].field565.compareTo(var21.field565);
                    if (var23 == 0) {
                        class62.field939[var22].field567 = var13;
                        class62.field939[var22].field563 = var15;
                        class62.field939[var22].field562 = var20;
                        if (class303.field4898 == var11) {
                            class51.field706 = var15;
                        }
                        class45.field592 = -1;
                        class302.field4893 = class248.field3705;
                        return true;
                    }
                    if (var23 < 0) {
                        break;
                    }
                }
                if (class62.field939.length <= class78.field1261) {
                    class45.field592 = -1;
                    return true;
                }
                for (int var24 = class78.field1261 - 1; var24 > var22; var24--) {
                    class62.field939[var24 + 1] = class62.field939[var24];
                }
                if (class78.field1261 == 0) {
                    class62.field939 = new class43[100];
                }
                class62.field939[var22 + 1] = var21;
                class78.field1261++;
                if (class303.field4898 == var11) {
                    class51.field706 = var15;
                }
            }
            class302.field4893 = class248.field3705;
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 150) {
            int var25 = class92.field1488.method331(arg0 ^ 0x4F);
            int var26 = class92.field1488.method354(-100);
            int var27 = class92.field1488.method377((byte) 41);
            class12 var28 = class255.field3856[var26];
            if (var28 != null) {
                class197.method1391(var28, var25, false, var27);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 166) {
            class92.field1488.field735 += 28;
            if (class92.field1488.method324((byte) -52)) {
                class106.method819(class92.field1488, -80, class92.field1488.field735 - 28);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 2) {
            class302.field4893 = class248.field3705;
            long var29 = class92.field1488.method371(arg0 ^ 0xFFFFA73B);
            if (var29 == 0L) {
                class62.field939 = null;
                class284.field4573 = null;
                class45.field592 = -1;
                class78.field1261 = 0;
                class35.field448 = null;
                return true;
            }
            long var31 = class92.field1488.method371(22726);
            class35.field448 = class38.method240(var31, true);
            class284.field4573 = class38.method240(var29, true);
            class273.field4421 = class92.field1488.method335((byte) 26);
            int var33 = class92.field1488.method366(-16505);
            if (var33 == 255) {
                class45.field592 = -1;
                return true;
            }
            class78.field1261 = var33;
            class43[] var34 = new class43[100];
            for (int var35 = 0; var35 < class78.field1261; var35++) {
                var34[var35] = new class43();
                var34[var35].field4008 = class92.field1488.method371(22726);
                var34[var35].field565 = class38.method240(var34[var35].field4008, true);
                var34[var35].field567 = class92.field1488.method331(-17);
                var34[var35].field563 = class92.field1488.method335((byte) 26);
                var34[var35].field562 = class92.field1488.method326(arg0 + 34);
                if (class303.field4898 == var34[var35].field4008) {
                    class51.field706 = var34[var35].field563;
                }
            }
            boolean var36 = false;
            int var37 = class78.field1261;
            while (var37 > 0) {
                var37--;
                boolean var38 = true;
                for (int var39 = 0; var39 < var37; var39++) {
                    if (var34[var39].field565.compareTo(var34[var39 + 1].field565) > 0) {
                        var38 = false;
                        class43 var40 = var34[var39];
                        var34[var39] = var34[var39 + 1];
                        var34[var39 + 1] = var40;
                    }
                }
                if (var38) {
                    break;
                }
            }
            class62.field939 = var34;
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 43) {
            class47.field659 = class162.field2510 / 8;
            for (int var41 = 0; var41 < class47.field659; var41++) {
                class203.field3007[var41] = class92.field1488.method371(22726);
                class292.field4639[var41] = class20.method140(true, class203.field3007[var41]);
                class221.field3226[var41] = false;
            }
            class45.field592 = -1;
            class135.field2210 = class248.field3705;
            return true;
        } else if (class45.field592 == 155) {
            class226.method1569(true, (byte) 66);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 1) {
            int var42 = class92.field1488.method374((byte) 80);
            String var43 = class92.field1488.method326(arg0 + 70);
            int var44 = class92.field1488.method361(-16777216);
            if (class149.method1115(var42, (byte) 78)) {
                class124.method955(var44, var43, 1);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 46) {
            int var45 = class92.field1488.method331(-77);
            int var46 = class92.field1488.method366(arg0 ^ 0x407A);
            int var47 = class92.field1488.method366(-16505);
            int var48 = class92.field1488.method366(-16505);
            int var49 = class92.field1488.method366(-16505);
            int var50 = class92.field1488.method331(-18);
            if (class149.method1115(var45, (byte) 78)) {
                class223.field3274[var46] = true;
                class196.field2889[var46] = var47;
                class275.field4453[var46] = var48;
                class111.field1852[var46] = var49;
                class37.field482[var46] = var50;
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 63) {
            int var51 = class92.field1488.method374((byte) 80);
            int var52 = class92.field1488.method344((byte) 115);
            int var53 = var52 >> 2;
            if (var51 == 65535) {
                var51 = -1;
            }
            int var54 = class210.field3105[var53];
            int var55 = class92.field1488.method340(-121);
            int var56 = (var55 & 0x347C6006) >> 28;
            int var57 = (var55 & 0xFFFDD65) >> 14;
            int var58 = var52 & 0x3;
            int var59 = var57 - class163.field2520;
            int var60 = var55 & 0x3FFF;
            int var61 = var60 - class149.field2390;
            class34.method218(var54, var56, 115, var61, var59, var58, var51, var53);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 53) {
            class275.field4456 = class92.field1488.method344((byte) 79);
            class240.field3524 = class92.field1488.method359(255);
            while (class162.field2510 > class92.field1488.field735) {
                class45.field592 = class92.field1488.method366(-16505);
                class13.method93((byte) 126);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 113) {
            int var62 = class92.field1488.method331(-13);
            int var63 = class92.field1488.method375(-74);
            int var64 = class92.field1488.method327(arg0 + 65283);
            int var65 = class92.field1488.method327(65280);
            int var66 = class92.field1488.method327(65280);
            if (class149.method1115(var65, (byte) 78)) {
                class223.method1548(var62, false, var66 | var64 << 16, 7, var63);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 115 || class45.field592 == 111 || class45.field592 == 17 || class45.field592 == 144 || class45.field592 == 114 || class45.field592 == 133 || class45.field592 == 47 || class45.field592 == 158 || class45.field592 == 105 || class45.field592 == 120 || class45.field592 == 60 || class45.field592 == 179 || class45.field592 == 232 || class45.field592 == 131) {
            class13.method93((byte) -88);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 183) {
            int var67 = class92.field1488.method340(-88);
            int var68 = class92.field1488.method327(arg0 + 65283);
            if (var68 == 65535) {
                var68 = -1;
            }
            int var69 = class92.field1488.method354(-118);
            int var70 = class92.field1488.method340(-118);
            if (class149.method1115(var69, (byte) 78)) {
                class263 var71 = class144.method1078(var67, arg0 + 8537);
                if (var71.field4167) {
                    class145.method1084(false, var67, var68, var70);
                    class31 var72 = class12.method88(var68, 27838);
                    class39.method247(var72.field379, 8, var72.field339, var72.field387, var67);
                    class240.method1639(var72.field329, 10, var72.field357, var72.field394, var67);
                } else if (var68 == -1) {
                    class45.field592 = -1;
                    var71.field4158 = 0;
                    return true;
                } else {
                    class31 var73 = class12.method88(var68, 27838);
                    var71.field4211 = var73.field379;
                    var71.field4060 = var68;
                    var71.field4071 = var73.field387;
                    var71.field4217 = var73.field339 * 100 / var70;
                    var71.field4158 = 4;
                    class63.method476(var71, arg0 ^ 0xFFFFC8E4);
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 156) {
            int var74 = class92.field1488.method331(arg0 - 42);
            if (class149.method1115(var74, (byte) 78)) {
                class147.method1091(8263);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 59) {
            String var75 = class92.field1488.method326(27);
            if (var75.endsWith(":tradereq:")) {
                boolean var112 = false;
                String var113 = var75.substring(0, var75.indexOf(":"));
                long var114 = class143.method1064((byte) -76, var113);
                for (int var116 = 0; var116 < class47.field659; var116++) {
                    if (class203.field3007[var116] == var114) {
                        var112 = true;
                        break;
                    }
                }
                if (!var112 && class146.field2349 == 0) {
                    class258.method1777(-1, 4, var113, class306.field4947);
                }
            } else if (var75.endsWith(":chalreq:")) {
                String var76 = var75.substring(0, var75.indexOf(":"));
                long var77 = class143.method1064((byte) -97, var76);
                boolean var79 = false;
                for (int var80 = 0; var80 < class47.field659; var80++) {
                    if (class203.field3007[var80] == var77) {
                        var79 = true;
                        break;
                    }
                }
                if (!var79 && class146.field2349 == 0) {
                    String var81 = var75.substring(var75.indexOf(":") + 1, var75.length() + -9);
                    class258.method1777(-1, 8, var76, var81);
                }
            } else if (var75.endsWith(":assistreq:")) {
                String var82 = var75.substring(0, var75.indexOf(":"));
                boolean var83 = false;
                long var84 = class143.method1064((byte) -89, var82);
                for (int var86 = 0; var86 < class47.field659; var86++) {
                    if (class203.field3007[var86] == var84) {
                        var83 = true;
                        break;
                    }
                }
                if (!var83 && class146.field2349 == 0) {
                    class258.method1777(-1, 10, var82, "");
                }
            } else if (var75.endsWith(":clan:")) {
                String var111 = var75.substring(0, var75.indexOf(":clan:"));
                class258.method1777(-1, 11, "", var111);
            } else if (var75.endsWith(":trade:")) {
                String var87 = var75.substring(0, var75.indexOf(":trade:"));
                if (class146.field2349 == 0) {
                    class258.method1777(-1, 12, "", var87);
                }
            } else if (var75.endsWith(":assist:")) {
                String var110 = var75.substring(0, var75.indexOf(":assist:"));
                if (class146.field2349 == 0) {
                    class258.method1777(arg0 + 2, 13, "", var110);
                }
            } else if (var75.endsWith(":duelstake:")) {
                String var105 = var75.substring(0, var75.indexOf(":"));
                long var106 = class143.method1064((byte) -74, var105);
                boolean var108 = false;
                for (int var109 = 0; var109 < class47.field659; var109++) {
                    if (class203.field3007[var109] == var106) {
                        var108 = true;
                        break;
                    }
                }
                if (!var108 && class146.field2349 == 0) {
                    class258.method1777(-1, 14, var105, "");
                }
            } else if (var75.endsWith(":duelfriend:")) {
                String var100 = var75.substring(0, var75.indexOf(":"));
                long var101 = class143.method1064((byte) -105, var100);
                boolean var103 = false;
                for (int var104 = 0; var104 < class47.field659; var104++) {
                    if (class203.field3007[var104] == var101) {
                        var103 = true;
                        break;
                    }
                }
                if (!var103 && class146.field2349 == 0) {
                    class258.method1777(-1, 15, var100, "");
                }
            } else if (var75.endsWith(":clanreq:")) {
                String var95 = var75.substring(0, var75.indexOf(":"));
                boolean var96 = false;
                long var97 = class143.method1064((byte) -127, var95);
                for (int var99 = 0; var99 < class47.field659; var99++) {
                    if (class203.field3007[var99] == var97) {
                        var96 = true;
                        break;
                    }
                }
                if (!var96 && class146.field2349 == 0) {
                    class258.method1777(-1, 16, var95, "");
                }
            } else if (var75.endsWith(":allyreq:")) {
                String var89 = var75.substring(0, var75.indexOf(":"));
                boolean var90 = false;
                long var91 = class143.method1064((byte) -71, var89);
                for (int var93 = 0; var93 < class47.field659; var93++) {
                    if (class203.field3007[var93] == var91) {
                        var90 = true;
                        break;
                    }
                }
                if (!var90 && class146.field2349 == 0) {
                    String var94 = var75.substring(var75.indexOf(":") + 1, var75.length() + -9);
                    class258.method1777(-1, 21, var89, var94);
                }
            } else if (var75.endsWith(":spam:")) {
                String var88 = var75.substring(0, var75.length() - 6);
                if (class146.field2349 == 0) {
                    class258.method1777(-1, 22, "", var88);
                }
            } else {
                class258.method1777(-1, 0, "", var75);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 25) {
            class99.method772((byte) -127);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 55) {
            class201.field2963 = class92.field1488.method366(-16505);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 93) {
            int var117 = class92.field1488.method331(-120);
            int var118 = class92.field1488.method366(arg0 ^ 0x407A);
            int var119 = class92.field1488.method366(-16505);
            int var120 = class92.field1488.method331(-90);
            int var121 = class92.field1488.method366(arg0 - 16502);
            int var122 = class92.field1488.method366(-16505);
            if (class149.method1115(var117, (byte) 78)) {
                class110.method842(var120, var121, var118, 2047, var122, var119);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 49) {
            class226.method1569(false, (byte) 15);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 172) {
            int var123 = class92.field1488.method349(arg0 ^ 0x5B);
            int var124 = class92.field1488.method337(104);
            int var125 = class92.field1488.method327(65280);
            if (class149.method1115(var125, (byte) 78)) {
                class200.method1409(var124, var123, 5);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 40) {
            int var126 = class92.field1488.method349(-56);
            int var127 = class92.field1488.method374((byte) 80);
            int var128 = class92.field1488.method366(-16505);
            if (class149.method1115(var127, (byte) 78)) {
                class309.method2090(var126, var128, (byte) -35);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 116) {
            int var129 = class92.field1488.method354(-100);
            int var130 = class92.field1488.method354(-90);
            String var131 = class92.field1488.method326(arg0 + 53);
            if (class149.method1115(var130, (byte) 78)) {
                class36.method231(false, var131, var129);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 75) {
            int var132 = class92.field1488.method327(65280);
            String var133 = class92.field1488.method326(106);
            int var134 = class92.field1488.method327(65280);
            if (class149.method1115(var132, (byte) 78)) {
                class36.method231(false, var133, var134);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 4) {
            class111.field1856 = class92.field1488.method366(arg0 - 16502);
            class45.field592 = -1;
            class135.field2210 = class248.field3705;
            return true;
        } else if (class45.field592 == 86) {
            class6.method33((byte) -124, class92.field1488.method326(61));
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 126) {
            String var135 = class92.field1488.method326(79);
            int var136 = class92.field1488.method377((byte) 36);
            int var137 = class92.field1488.method374((byte) 80);
            int var138 = class92.field1488.method344((byte) -105);
            if (var137 == 65535) {
                var137 = -1;
            }
            if (var138 >= 1 && var138 <= 8) {
                if (var135.equalsIgnoreCase("null")) {
                    var135 = null;
                }
                class206.field3036[var138 - 1] = var135;
                class120.field1948[var138 - 1] = var137;
                class200.field2948[var138 - 1] = var136 == 0;
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 136) {
            class212.method1491(-5612);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 8) {
            class107.method828(-26080);
            class45.field589 = class92.field1488.method366(arg0 - 16502);
            class45.field592 = -1;
            class298.field4774 = class248.field3705;
            return true;
        } else if (class45.field592 == 31) {
            int var139 = class92.field1488.method340(-79);
            int var140 = class92.field1488.method331(arg0 - 17);
            int var141 = class92.field1488.method354(arg0 ^ 0x6C);
            int var142 = class92.field1488.method331(-35);
            int var143 = class92.field1488.method331(-42);
            if (var142 == 65535) {
                var142 = -1;
            }
            if (var143 == 65535) {
                var143 = -1;
            }
            if (class149.method1115(var141, (byte) 78)) {
                for (int var144 = var143; var144 <= var142; var144++) {
                    long var145 = ((long) var139 << 32) + (long) var144;
                    class250 var147 = (class250) class255.field3846.method1073(-1, var145);
                    class250 var148;
                    if (var147 != null) {
                        var148 = new class250(var147.field3789, var140);
                        var147.method1781(5250);
                    } else if (var144 == -1) {
                        var148 = new class250(class144.method1078(var139, 8534).field4045.field3789, var140);
                    } else {
                        var148 = new class250(0, var140);
                    }
                    class255.field3846.method1074((byte) 39, var148, var145);
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 225) {
            int var149 = class92.field1488.method331(-7);
            int var150 = class92.field1488.method327(65280);
            int var151 = class92.field1488.method344((byte) 82);
            if (class149.method1115(var150, (byte) 78)) {
                if (var151 == 2) {
                    class126.method965(true);
                }
                class1.field17 = var149;
                class91.method687(var149, (byte) -128);
                class110.method840(0, false);
                class191.method1353(0, class1.field17);
                for (int var152 = 0; var152 < 100; var152++) {
                    class91.field1452[var152] = true;
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 44) {
            long var153 = class92.field1488.method371(22726);
            long var155 = (long) class92.field1488.method331(arg0 - 123);
            long var157 = (long) class92.field1488.method362(-4);
            int var159 = class92.field1488.method366(-16505);
            long var160 = (var155 << 32) + var157;
            boolean var162 = false;
            int var163 = 0;
            label1386: while (true) {
                if (var163 >= 100) {
                    if (var159 <= 1) {
                        if ((!class284.field4567 || class291.field4630) && !class124.field2080) {
                            for (int var164 = 0; var164 < class47.field659; var164++) {
                                if (class203.field3007[var164] == var153) {
                                    var162 = true;
                                    break label1386;
                                }
                            }
                        } else {
                            var162 = true;
                        }
                    }
                    break;
                }
                if (class305.field4932[var163] == var160) {
                    var162 = true;
                    break;
                }
                var163++;
            }
            if (!var162 && class146.field2349 == 0) {
                class305.field4932[class156.field2448] = var160;
                class156.field2448 = (class156.field2448 + 1) % 100;
                String var165 = class10.method69(class188.method1346(false, class190.method1350(class92.field1488, 14258)));
                if (var159 == 2 || var159 == 3) {
                    class258.method1777(-1, 7, "<img=1>" + class121.method920(106, var153), var165);
                } else if (var159 == 1) {
                    class258.method1777(arg0 ^ 0x2, 7, "<img=0>" + class121.method920(arg0 + 28, var153), var165);
                } else {
                    class258.method1777(-1, 3, class121.method920(16, var153), var165);
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 176) {
            int var166 = class92.field1488.method331(-67);
            int var167 = class92.field1488.method327(arg0 + 65283);
            byte var168 = class92.field1488.method357((byte) 41);
            if (class149.method1115(var166, (byte) 78)) {
                class123.method950(var167, (byte) 100, var168);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 99) {
            long var169 = class92.field1488.method371(22726);
            class92.field1488.method335((byte) 26);
            long var171 = class92.field1488.method371(arg0 ^ 0xFFFFA73B);
            long var173 = (long) class92.field1488.method331(-57);
            long var175 = (long) class92.field1488.method362(arg0 ^ 0x1);
            int var177 = class92.field1488.method366(arg0 ^ 0x407A);
            int var178 = class92.field1488.method331(-35);
            long var179 = (var173 << 32) + var175;
            boolean var181 = false;
            int var182 = 0;
            label1409: while (true) {
                if (var182 >= 100) {
                    if (var177 <= 1) {
                        for (int var183 = 0; var183 < class47.field659; var183++) {
                            if (class203.field3007[var183] == var169) {
                                var181 = true;
                                break label1409;
                            }
                        }
                    }
                    break;
                }
                if (class305.field4932[var182] == var179) {
                    var181 = true;
                    break;
                }
                var182++;
            }
            if (!var181 && class146.field2349 == 0) {
                class305.field4932[class156.field2448] = var179;
                class156.field2448 = (class156.field2448 + 1) % 100;
                String var184 = class25.method169(var178, false).method697(5542, class92.field1488);
                if (var177 == 2 || var177 == 3) {
                    class194.method1376("<img=1>" + class121.method920(27, var169), 20, (byte) 38, class121.method920(41, var171), var178, var184);
                } else if (var177 == 1) {
                    class194.method1376("<img=0>" + class121.method920(arg0 ^ 0xFFFFFFC9, var169), 20, (byte) 38, class121.method920(31, var171), var178, var184);
                } else {
                    class194.method1376(class121.method920(77, var169), 20, (byte) 38, class121.method920(64, var171), var178, var184);
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 246) {
            long var185 = class92.field1488.method371(arg0 ^ 0xFFFFA73B);
            class92.field1488.method335((byte) 26);
            long var187 = class92.field1488.method371(arg0 ^ 0xFFFFA73B);
            long var189 = (long) class92.field1488.method331(arg0 ^ 0x2B);
            long var191 = (long) class92.field1488.method362(-4);
            long var193 = (var189 << 32) + var191;
            boolean var195 = false;
            int var196 = class92.field1488.method366(-16505);
            int var197 = 0;
            label1441: while (true) {
                if (var197 >= 100) {
                    if (var196 <= 1) {
                        if ((!class284.field4567 || class291.field4630) && !class124.field2080) {
                            for (int var198 = 0; var198 < class47.field659; var198++) {
                                if (class203.field3007[var198] == var185) {
                                    var195 = true;
                                    break label1441;
                                }
                            }
                        } else {
                            var195 = true;
                        }
                    }
                    break;
                }
                if (class305.field4932[var197] == var193) {
                    var195 = true;
                    break;
                }
                var197++;
            }
            if (!var195 && class146.field2349 == 0) {
                class305.field4932[class156.field2448] = var193;
                class156.field2448 = (class156.field2448 + 1) % 100;
                String var199 = class10.method69(class188.method1346(false, class190.method1350(class92.field1488, arg0 + 14261)));
                if (var196 == 2 || var196 == 3) {
                    class85.method632("<img=1>" + class121.method920(arg0 ^ 0xFFFFFFDA, var185), 9, (byte) -116, var199, class121.method920(102, var187));
                } else if (var196 == 1) {
                    class85.method632("<img=0>" + class121.method920(50, var185), 9, (byte) 1, var199, class121.method920(arg0 ^ 0xFFFFFFCA, var187));
                } else {
                    class85.method632(class121.method920(27, var185), 9, (byte) 64, var199, class121.method920(21, var187));
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 52) {
            int var200 = class92.field1488.method331(-4);
            if (class149.method1115(var200, (byte) 78)) {
                class63.method480(false);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 137) {
            int var201 = class92.field1488.method374((byte) 80);
            int var202 = class92.field1488.method366(-16505);
            class309.method2091(var202, var201, arg0 + 3);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 199) {
            int var203 = class92.field1488.method361(arg0 ^ 0xFFFFFD);
            int var204 = class92.field1488.method331(-68);
            if (class149.method1115(var204, (byte) 78)) {
                int var205 = 0;
                if (class213.field3139.field3063 != null) {
                    var205 = class213.field3139.field3063.method2030(-69);
                }
                class223.method1548(-1, false, var205, 3, var203);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 222) {
            long var206 = class92.field1488.method371(22726);
            long var208 = (long) class92.field1488.method331(arg0 ^ 0x43);
            long var210 = (long) class92.field1488.method362(-4);
            long var212 = (var208 << 32) + var210;
            boolean var214 = false;
            int var215 = class92.field1488.method366(-16505);
            int var216 = class92.field1488.method331(-59);
            int var217 = 0;
            label1457: while (true) {
                if (var217 >= 100) {
                    if (var215 <= 1) {
                        for (int var218 = 0; var218 < class47.field659; var218++) {
                            if (class203.field3007[var218] == var206) {
                                var214 = true;
                                break label1457;
                            }
                        }
                    }
                    break;
                }
                if (class305.field4932[var217] == var212) {
                    var214 = true;
                    break;
                }
                var217++;
            }
            if (!var214 && class146.field2349 == 0) {
                class305.field4932[class156.field2448] = var212;
                class156.field2448 = (class156.field2448 + 1) % 100;
                String var219 = class25.method169(var216, false).method697(arg0 + 5545, class92.field1488);
                if (var215 == 2) {
                    class194.method1376("<img=1>" + class121.method920(92, var206), 18, (byte) 38, (String) null, var216, var219);
                } else if (var215 == 1) {
                    class194.method1376("<img=0>" + class121.method920(42, var206), 18, (byte) 38, (String) null, var216, var219);
                } else {
                    class194.method1376(class121.method920(96, var206), 18, (byte) 38, (String) null, var216, var219);
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 130) {
            int var220 = class92.field1488.method359(arg0 + 258);
            int var221 = class92.field1488.method377((byte) 118);
            int var222 = class92.field1488.method366(-16505);
            class37.field474 = var222 >> 1;
            class213.field3139.method1466(var220, var221, (var222 & 0x1) == 1, (byte) 61);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 243) {
            int var223 = class92.field1488.method331(-44);
            int var224 = class92.field1488.method361(-16777216);
            int var225 = class92.field1488.method327(65280);
            if (class149.method1115(var225, (byte) 78)) {
                class159.method1160(var224, arg0 ^ 0xFFFFFF83, var223);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 253) {
            int var226 = class92.field1488.method331(-88);
            String var227 = class92.field1488.method326(53);
            Object[] var228 = new Object[var227.length() + 1];
            for (int var229 = var227.length() - 1; var229 >= 0; var229--) {
                if (var227.charAt(var229) == 's') {
                    var228[var229 + 1] = class92.field1488.method326(110);
                } else {
                    var228[var229 + 1] = Integer.valueOf(class92.field1488.method340(-100));
                }
            }
            var228[0] = Integer.valueOf(class92.field1488.method340(arg0 - 87));
            if (class149.method1115(var226, (byte) 78)) {
                class234 var230 = new class234();
                var230.field3419 = var228;
                class224.method1557((byte) 91, var230);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 194) {
            int var231 = class92.field1488.method340(-110);
            int var232 = class92.field1488.method331(-73);
            if (var231 < -70000) {
                var232 += 32768;
            }
            class263 var233;
            if (var231 >= 0) {
                var233 = class144.method1078(var231, arg0 ^ 0xFFFFDEAB);
            } else {
                var233 = null;
            }
            if (var233 != null) {
                for (int var234 = 0; var234 < var233.field4132.length; var234++) {
                    var233.field4132[var234] = 0;
                    var233.field4214[var234] = 0;
                }
            }
            class202.method1425(var232, 0);
            int var235 = class92.field1488.method331(arg0 ^ 0x70);
            for (int var236 = 0; var236 < var235; var236++) {
                int var237 = class92.field1488.method331(arg0 - 119);
                int var238 = class92.field1488.method377((byte) 18);
                if (var238 == 255) {
                    var238 = class92.field1488.method340(arg0 - 105);
                }
                if (var233 != null && var236 < var233.field4132.length) {
                    var233.field4132[var236] = var237;
                    var233.field4214[var236] = var238;
                }
                class268.method1855(var238, var236, var237 - 1, arg0 + -56, var232);
            }
            if (var233 != null) {
                class63.method476(var233, 14105);
            }
            class107.method828(-26080);
            class245.field3608[class301.method2056(31, class269.field4332++)] = class301.method2056(var232, 32767);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 104) {
            long var239 = class92.field1488.method371(22726);
            String var241 = class10.method69(class188.method1346(false, class190.method1350(class92.field1488, 14258)));
            class258.method1777(-1, 6, class121.method920(arg0 + 47, var239), var241);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 65) {
            int var242 = class92.field1488.method375(-54);
            int var243 = class92.field1488.method327(65280);
            int var244 = class92.field1488.method351(0);
            int var245 = class92.field1488.method381(false);
            if (class149.method1115(var243, (byte) 78)) {
                class268.method1853(var245, (byte) 127, var242, var244);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 54) {
            if (class162.field2510 == 0) {
                class24.field264 = class295.field4750;
            } else {
                class24.field264 = class92.field1488.method326(27);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 163) {
            for (int var246 = 0; var246 < class303.field4900.length; var246++) {
                if (class9.field103[var246] != class303.field4900[var246]) {
                    class303.field4900[var246] = class9.field103[var246];
                    class276.method1918(var246, (byte) -127);
                    class301.field4881[class301.method2056(31, class188.field2795++)] = var246;
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 72) {
            class283.field4556 = class92.field1488.method374((byte) 80) * 30;
            class45.field592 = -1;
            class298.field4774 = class248.field3705;
            return true;
        } else if (class45.field592 == 229) {
            for (int var247 = 0; var247 < class92.field1475.length; var247++) {
                if (class92.field1475[var247] != null) {
                    class92.field1475[var247].field3741 = -1;
                }
            }
            for (int var248 = 0; var248 < class255.field3856.length; var248++) {
                if (class255.field3856[var248] != null) {
                    class255.field3856[var248].field3741 = -1;
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 89) {
            int var249 = class92.field1488.method374((byte) 80);
            int var250 = class92.field1488.method340(-92);
            int var251 = class92.field1488.method349(arg0 ^ 0x5B);
            if (class149.method1115(var249, (byte) 78)) {
                class133 var252 = (class133) field3793.method1073(arg0 ^ 0x2, (long) var250);
                class133 var253 = (class133) field3793.method1073(arg0 + 2, (long) var251);
                if (var253 != null) {
                    class35.method226(var253, var252 == null || var252.field2187 != var253.field2187, -71);
                }
                if (var252 != null) {
                    var252.method1781(arg0 ^ 0xFFFFEB7F);
                    field3793.method1074((byte) 39, var252, (long) var251);
                }
                class263 var254 = class144.method1078(var250, 8534);
                if (var254 != null) {
                    class63.method476(var254, 14105);
                }
                class263 var255 = class144.method1078(var251, arg0 + 8537);
                if (var255 != null) {
                    class63.method476(var255, arg0 + 14108);
                    class107.method826((byte) 126, var255, true);
                }
                if (class1.field17 != -1) {
                    class16.method108(arg0 ^ 0x5F, class1.field17, 1);
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 164) {
            class107.method828(-26080);
            int var256 = class92.field1488.method366(-16505);
            int var257 = class92.field1488.method361(arg0 - 16777213);
            int var258 = class92.field1488.method366(-16505);
            class140.field2269[var258] = var257;
            class52.field724[var258] = var256;
            class185.field2761[var258] = 1;
            for (int var259 = 0; var259 < 98; var259++) {
                if (class185.field2766[var259] <= var257) {
                    class185.field2761[var258] = var259 + 2;
                }
            }
            class2.field31[class301.method2056(class62.field941++, 31)] = var258;
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 135) {
            int var260 = class92.field1488.method331(-65);
            int var261 = class92.field1488.method340(-82);
            if (class149.method1115(var260, (byte) 78)) {
                class133 var262 = (class133) field3793.method1073(arg0 ^ 0x2, (long) var261);
                if (var262 != null) {
                    class35.method226(var262, true, -65);
                }
                if (class195.field2880 != null) {
                    class63.method476(class195.field2880, 14105);
                    class195.field2880 = null;
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 95) {
            class107.method828(-26080);
            class305.field4933 = class92.field1488.method337(105);
            class45.field592 = -1;
            class298.field4774 = class248.field3705;
            return true;
        } else if (class45.field592 == 30) {
            byte[] var263 = new byte[class162.field2510];
            class92.field1488.method689(var263, 0, class162.field2510, (byte) -66);
            String var264 = class102.method794(var263, (byte) 77, class162.field2510, 0);
            if (class195.field2881 == null && class122.field2024 == 3 || !class122.field2011.startsWith("win") || class186.field2774) {
                class218.method1520(var264, 16, true);
            } else {
                class256.field3875 = true;
                class75.field1178 = var264;
                class5.field48 = class273.field4426.method929(true, var264);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 100) {
            int var265 = class92.field1488.method331(-4);
            int var266 = class92.field1488.method359(arg0 ^ 0xFFFFFF02);
            if (var265 == 65535) {
                var265 = -1;
            }
            class94.method724(arg0 - 77, var265, var266);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 206) {
            int var267 = class92.field1488.method366(-16505);
            int var268 = class92.field1488.method327(65280);
            if (var268 == 65535) {
                var268 = -1;
            }
            int var269 = class92.field1488.method350(false);
            class100.method787(-1, var269, var267, var268);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 11) {
            int var270 = class92.field1488.method374((byte) 80);
            int var271 = class92.field1488.method375(arg0 ^ 0x79);
            int var272 = class92.field1488.method354(-128);
            if (class149.method1115(var270, (byte) 78)) {
                class200.method1412(arg0 ^ 0x2A, var271, var272);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 153) {
            int var273 = class92.field1488.method331(-4);
            if (var273 == 65535) {
                var273 = -1;
            }
            int var274 = class92.field1488.method366(-16505);
            int var275 = class92.field1488.method331(-16);
            int var276 = class92.field1488.method366(-16505);
            class245.method1688(0, var273, var274, var276, var275);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 152) {
            int var277 = class92.field1488.method327(65280);
            int var278 = class92.field1488.method327(65280);
            int var279 = class92.field1488.method354(-117);
            int var280 = class92.field1488.method349(-54);
            if (class149.method1115(var277, (byte) 78)) {
                class33.method217((var278 << 16) + var279, 7841, var280);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 87) {
            int var281 = class92.field1488.method327(65280);
            int var282 = class92.field1488.method331(-19);
            int var283 = class92.field1488.method349(-117);
            if (var282 == 65535) {
                var282 = -1;
            }
            if (class149.method1115(var281, (byte) 78)) {
                class223.method1548(-1, false, var282, 1, var283);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 26) {
            int var284 = class92.field1488.method361(-16777216);
            class263 var285 = class144.method1078(var284, 8534);
            for (int var286 = 0; var286 < var285.field4132.length; var286++) {
                var285.field4132[var286] = -1;
                var285.field4132[var286] = 0;
            }
            class63.method476(var285, arg0 ^ 0xFFFFC8E4);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 34) {
            int var287 = class92.field1488.method340(-113);
            int var288 = class92.field1488.method331(arg0 ^ 0x71);
            class263 var289;
            if (var287 < 0) {
                var289 = null;
            } else {
                var289 = class144.method1078(var287, arg0 ^ 0xFFFFDEAB);
            }
            if (var287 < -70000) {
                var288 += 32768;
            }
            while (class162.field2510 > class92.field1488.field735) {
                int var290 = class92.field1488.method368(-129);
                int var291 = 0;
                int var292 = class92.field1488.method331(arg0 ^ 0x7E);
                if (var292 != 0) {
                    var291 = class92.field1488.method366(-16505);
                    if (var291 == 255) {
                        var291 = class92.field1488.method340(-85);
                    }
                }
                if (var289 != null && var290 >= 0 && var289.field4132.length > var290) {
                    var289.field4132[var290] = var292;
                    var289.field4214[var290] = var291;
                }
                class268.method1855(var291, var290, var292 - 1, 117, var288);
            }
            if (var289 != null) {
                class63.method476(var289, 14105);
            }
            class107.method828(arg0 ^ 0x65DD);
            class245.field3608[class301.method2056(class269.field4332++, 31)] = class301.method2056(32767, var288);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 18) {
            int var293 = class92.field1488.method374((byte) 80);
            if (var293 == 65535) {
                var293 = -1;
            }
            int var294 = class92.field1488.method331(-67);
            int var295 = class92.field1488.method340(-104);
            if (class149.method1115(var294, (byte) 78)) {
                class223.method1548(-1, false, var293, 2, var295);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 242) {
            int var296 = class92.field1488.method366(-16505);
            int var297 = class92.field1488.method374((byte) 80);
            if (class149.method1115(var297, (byte) 78)) {
                class20.field214 = var296;
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 35) {
            int var298 = class92.field1488.method377((byte) 35);
            int var299 = class92.field1488.method327(65280);
            int var300 = class92.field1488.method349(arg0 - 108);
            int var301 = class92.field1488.method374((byte) 80);
            if (class149.method1115(var299, (byte) 78)) {
                class133 var302 = (class133) field3793.method1073(-1, (long) var300);
                if (var302 != null) {
                    class35.method226(var302, var302.field2187 != var301, -104);
                }
                class53.method353(var298, (byte) 122, var301, var300);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 42) {
            int var303 = class92.field1488.method327(65280);
            int var304 = class92.field1488.method354(-91);
            int var305 = class92.field1488.method327(65280);
            if (class149.method1115(var303, (byte) 78)) {
                class76.method569(var304, var305, 106);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 162) {
            int var306 = class92.field1488.method340(-89);
            int var307 = class92.field1488.method340(-109);
            int var308 = class92.field1488.method331(-75);
            if (var308 == 65535) {
                var308 = -1;
            }
            int var309 = class92.field1488.method327(65280);
            int var310 = class92.field1488.method327(65280);
            if (var309 == 65535) {
                var309 = -1;
            }
            if (class149.method1115(var310, (byte) 78)) {
                for (int var311 = var309; var311 <= var308; var311++) {
                    long var312 = ((long) var307 << 32) + (long) var311;
                    class250 var314 = (class250) class255.field3846.method1073(arg0 ^ 0x2, var312);
                    class250 var315;
                    if (var314 != null) {
                        var315 = new class250(var306, var314.field3781);
                        var314.method1781(5250);
                    } else if (var311 == -1) {
                        var315 = new class250(var306, class144.method1078(var307, 8534).field4045.field3781);
                    } else {
                        var315 = new class250(var306, -1);
                    }
                    class255.field3846.method1074((byte) 39, var315, var312);
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 78) {
            class39.method244((byte) 111);
            class107.method828(-26080);
            class188.field2795 += 32;
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 97) {
            class275.field4456 = class92.field1488.method344((byte) -123);
            class240.field3524 = class92.field1488.method359(arg0 + 258);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 151) {
            int var316 = class92.field1488.method331(-65);
            int var317 = class92.field1488.method366(arg0 ^ 0x407A);
            int var318 = class92.field1488.method366(arg0 ^ 0x407A);
            int var319 = class92.field1488.method331(-78);
            int var320 = class92.field1488.method366(-16505);
            int var321 = class92.field1488.method366(-16505);
            if (class149.method1115(var316, (byte) 78)) {
                class48.method296((byte) -47, var319, var318, true, var317, var321, var320);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 221) {
            long var322 = class92.field1488.method371(22726);
            int var324 = class92.field1488.method331(arg0 - 26);
            String var325 = class25.method169(var324, false).method697(5542, class92.field1488);
            class194.method1376(class121.method920(80, var322), 19, (byte) 38, (String) null, var324, var325);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 177) {
            int var326 = class92.field1488.method366(-16505);
            int var327 = var326 >> 5;
            int var328 = var326 & 0x1F;
            if (var328 == 0) {
                class142.field2301[var327] = null;
                class45.field592 = -1;
                return true;
            }
            class147 var329 = new class147();
            var329.field2362 = var328;
            var329.field2364 = class92.field1488.method366(-16505);
            if (var329.field2364 >= 0 && var329.field2364 < class174.field2654.length) {
                if (var329.field2362 == 1 || var329.field2362 == 10) {
                    var329.field2367 = class92.field1488.method331(arg0 - 41);
                    class92.field1488.field735 += 5;
                } else if (var329.field2362 >= 2 && var329.field2362 <= 6) {
                    if (var329.field2362 == 2) {
                        var329.field2363 = 64;
                        var329.field2371 = 64;
                    }
                    if (var329.field2362 == 3) {
                        var329.field2363 = 64;
                        var329.field2371 = 0;
                    }
                    if (var329.field2362 == 4) {
                        var329.field2371 = 128;
                        var329.field2363 = 64;
                    }
                    if (var329.field2362 == 5) {
                        var329.field2371 = 64;
                        var329.field2363 = 0;
                    }
                    if (var329.field2362 == 6) {
                        var329.field2371 = 64;
                        var329.field2363 = 128;
                    }
                    var329.field2362 = 2;
                    var329.field2353 = class92.field1488.method331(arg0 - 68);
                    var329.field2373 = class92.field1488.method331(-65);
                    var329.field2357 = class92.field1488.method366(-16505);
                    var329.field2359 = class92.field1488.method331(-48);
                }
                var329.field2355 = class92.field1488.method331(-102);
                if (var329.field2355 == 65535) {
                    var329.field2355 = -1;
                }
                class142.field2301[var327] = var329;
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 192) {
            class115.method861(0);
            class45.field592 = -1;
            return false;
        } else if (class45.field592 == 23) {
            class185.field2767 = class92.field1488.method366(-16505);
            class134.field2197 = class92.field1488.method366(-16505);
            class152.field2407 = class92.field1488.method366(-16505);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 237) {
            int var330 = class92.field1488.method374((byte) 80);
            int var331 = class92.field1488.method354(arg0 - 84);
            int var332 = class92.field1488.method374((byte) 80);
            int var333 = class92.field1488.method361(-16777216);
            if ((var333 >> 30) != 0) {
                int var334 = ((var333 & 0xFFFE175) >> 14) - class163.field2520;
                int var335 = var333 >> 28 & 0x3;
                int var336 = (var333 & 0x3FFF) - class149.field2390;
                if (var334 >= 0 && var336 >= 0 && var334 < 104 && var336 < 104) {
                    int var337 = var336 * 128 + 64;
                    int var338 = var334 * 128 + 64;
                    class179 var339 = new class179(var330, var335, var338, var337, class113.method851(var335, -125, var337, var338) - var332, var331, class199.field2930);
                    class126.field2123.method13(32, new class162(var339));
                }
            } else if (var333 >> 29 != 0) {
                int var352 = var333 & 0xFFFF;
                class12 var353 = class255.field3856[var352];
                if (var353 != null) {
                    boolean var354 = true;
                    if (var330 == 65535) {
                        var330 = -1;
                    }
                    if (var330 != -1 && var353.field3718 != -1) {
                        if (var353.field3718 == var330) {
                            class120 var355 = class152.method1126(var330, (byte) -1);
                            if (var355.field1947 && var355.field1944 != -1) {
                                class76 var356 = class232.method1609((byte) -32, var355.field1944);
                                int var357 = var356.field1202;
                                if (var357 == 1) {
                                    var353.field3689 = 0;
                                    var353.field3706 = class199.field2930 + var331;
                                    var353.field3672 = 0;
                                    var353.field3688 = 1;
                                    var353.field3716 = 0;
                                    var354 = false;
                                    class32.method208(var353.field3660, var353.field3672, true, false, var353.field3753, var356);
                                } else if (var357 == 2) {
                                    var353.field3713 = 0;
                                    var354 = false;
                                }
                            }
                        } else {
                            class120 var358 = class152.method1126(var330, (byte) -1);
                            class120 var359 = class152.method1126(var353.field3718, (byte) -1);
                            if (var358.field1944 != -1 && var359.field1944 != -1) {
                                class76 var360 = class232.method1609((byte) -32, var358.field1944);
                                class76 var361 = class232.method1609((byte) -32, var359.field1944);
                                if (var361.field1214 > var360.field1214) {
                                    var354 = false;
                                }
                            }
                        }
                    }
                    if (var354) {
                        var353.field3718 = var330;
                        var353.field3672 = 0;
                        var353.field3706 = class199.field2930 + var331;
                        var353.field3689 = 0;
                        var353.field3663 = var332;
                        if (var353.field3706 > class199.field2930) {
                            var353.field3672 = -1;
                        }
                        var353.field3688 = 1;
                        if (var353.field3718 != -1 && class199.field2930 == var353.field3706) {
                            int var362 = class152.method1126(var353.field3718, (byte) -1).field1944;
                            if (var362 != -1) {
                                class76 var363 = class232.method1609((byte) -32, var362);
                                if (var363 != null && var363.field1191 != null) {
                                    class32.method208(var353.field3660, 0, true, false, var353.field3753, var363);
                                }
                            }
                        }
                    }
                }
            } else if ((var333 >> 28) != 0) {
                int var340 = var333 & 0xFFFF;
                class207 var341;
                if (class279.field4498 == var340) {
                    var341 = class213.field3139;
                } else {
                    var341 = class92.field1475[var340];
                }
                if (var341 != null) {
                    boolean var342 = true;
                    if (var330 == 65535) {
                        var330 = -1;
                    }
                    if (var330 != -1 && var341.field3718 != -1) {
                        if (var341.field3718 == var330) {
                            class120 var347 = class152.method1126(var330, (byte) -1);
                            if (var347.field1947 && var347.field1944 != -1) {
                                class76 var348 = class232.method1609((byte) -32, var347.field1944);
                                int var349 = var348.field1202;
                                if (var349 == 1) {
                                    var342 = false;
                                    var341.field3672 = 0;
                                    var341.field3716 = 0;
                                    var341.field3706 = class199.field2930 + var331;
                                    var341.field3689 = 0;
                                    var341.field3688 = 1;
                                    class32.method208(var341.field3660, var341.field3672, true, false, var341.field3753, var348);
                                } else if (var349 == 2) {
                                    var341.field3713 = 0;
                                    var342 = false;
                                }
                            }
                        } else {
                            class120 var343 = class152.method1126(var330, (byte) -1);
                            class120 var344 = class152.method1126(var341.field3718, (byte) -1);
                            if (var343.field1944 != -1 && var344.field1944 != -1) {
                                class76 var345 = class232.method1609((byte) -32, var343.field1944);
                                class76 var346 = class232.method1609((byte) -32, var344.field1944);
                                if (var345.field1214 < var346.field1214) {
                                    var342 = false;
                                }
                            }
                        }
                    }
                    if (var342) {
                        var341.field3672 = 0;
                        var341.field3689 = 0;
                        var341.field3718 = var330;
                        if (var341.field3718 == 65535) {
                            var341.field3718 = -1;
                        }
                        var341.field3706 = class199.field2930 + var331;
                        var341.field3688 = 1;
                        var341.field3663 = var332;
                        if (class199.field2930 < var341.field3706) {
                            var341.field3672 = -1;
                        }
                        if (var341.field3718 != -1 && class199.field2930 == var341.field3706) {
                            int var350 = class152.method1126(var341.field3718, (byte) -1).field1944;
                            if (var350 != -1) {
                                class76 var351 = class232.method1609((byte) -32, var350);
                                if (var351 != null && var351.field1191 != null) {
                                    class32.method208(var341.field3660, 0, true, class213.field3139 == var341, var341.field3753, var351);
                                }
                            }
                        }
                    }
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 138) {
            int var364 = class92.field1488.method327(65280);
            int var365 = class92.field1488.method375(-94);
            class309.method2091(var365, var364, 0);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 90) {
            int var366 = class92.field1488.method327(65280);
            int var367 = class92.field1488.method354(-128);
            int var368 = class92.field1488.method354(arg0 ^ 0x5A);
            int var369 = class92.field1488.method374((byte) 80);
            int var370 = class92.field1488.method349(arg0 - 52);
            if (class149.method1115(var368, (byte) 78)) {
                class39.method247(var369, 8, var366, var367, var370);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 182) {
            long var371 = class92.field1488.method371(22726);
            int var373 = class92.field1488.method331(-120);
            String var374 = "";
            boolean var375 = true;
            int var376 = class92.field1488.method366(arg0 ^ 0x407A);
            if (var371 < 0L) {
                var375 = false;
                var371 &= Long.MAX_VALUE;
            }
            if (var373 > 0) {
                var374 = class92.field1488.method326(103);
            }
            String var377 = class121.method920(40, var371);
            for (int var378 = 0; var378 < class110.field1832; var378++) {
                if (class245.field3605[var378] == var371) {
                    if (class268.field4315[var378] != var373) {
                        class268.field4315[var378] = var373;
                        if (var373 > 0) {
                            class258.method1777(arg0 ^ 0x2, 5, "", var377 + class308.field4964);
                        }
                        if (var373 == 0) {
                            class258.method1777(arg0 ^ 0x2, 5, "", var377 + class252.field3801);
                        }
                    }
                    var377 = null;
                    class258.field3980[var378] = var374;
                    class292.field4637[var378] = var376;
                    class240.field3519[var378] = var375;
                    break;
                }
            }
            if (var377 != null && class110.field1832 < 200) {
                class245.field3605[class110.field1832] = var371;
                class223.field3268[class110.field1832] = var377;
                class268.field4315[class110.field1832] = var373;
                class258.field3980[class110.field1832] = var374;
                class292.field4637[class110.field1832] = var376;
                class240.field3519[class110.field1832] = var375;
                class110.field1832++;
            }
            boolean var379 = false;
            int var380 = class110.field1832;
            class135.field2210 = class248.field3705;
            while (var380 > 0) {
                var380--;
                boolean var381 = true;
                for (int var382 = 0; var382 < var380; var382++) {
                    if (class268.field4315[var382] != class114.field1884 && class268.field4315[var382 + 1] == class114.field1884 || class268.field4315[var382] == 0 && class268.field4315[var382 + 1] != 0) {
                        var381 = false;
                        int var383 = class268.field4315[var382];
                        class268.field4315[var382] = class268.field4315[var382 + 1];
                        class268.field4315[var382 + 1] = var383;
                        String var384 = class258.field3980[var382];
                        class258.field3980[var382] = class258.field3980[var382 + 1];
                        class258.field3980[var382 + 1] = var384;
                        String var385 = class223.field3268[var382];
                        class223.field3268[var382] = class223.field3268[var382 + 1];
                        class223.field3268[var382 + 1] = var385;
                        long var386 = class245.field3605[var382];
                        class245.field3605[var382] = class245.field3605[var382 + 1];
                        class245.field3605[var382 + 1] = var386;
                        int var388 = class292.field4637[var382];
                        class292.field4637[var382] = class292.field4637[var382 + 1];
                        class292.field4637[var382 + 1] = var388;
                        boolean var389 = class240.field3519[var382];
                        class240.field3519[var382] = class240.field3519[var382 + 1];
                        class240.field3519[var382 + 1] = var389;
                    }
                }
                if (var381) {
                    break;
                }
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 103) {
            int var390 = class92.field1488.method340(-94);
            class65.field981 = class273.field4426.method937(arg0 ^ 0xFFFFFFFD, var390);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 96) {
            if (class1.field17 != -1) {
                class16.method108(112, class1.field17, 0);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 148) {
            int var391 = class92.field1488.method331(-39);
            int var392 = class92.field1488.method349(-100);
            int var393 = class92.field1488.method331(-52);
            if (class149.method1115(var393, (byte) 78)) {
                class123.method950(var391, (byte) 104, var392);
            }
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 168) {
            int var394 = class92.field1488.method331(-51);
            class224.method1554(var394, (byte) -88);
            class245.field3608[class301.method2056(class269.field4332++, 31)] = class301.method2056(var394, 32767);
            class45.field592 = -1;
            return true;
        } else if (class45.field592 == 38) {
            byte var395 = class92.field1488.method335((byte) 26);
            int var396 = class92.field1488.method374((byte) 80);
            class281.method1944(var396, var395, (byte) 121);
            class45.field592 = -1;
            return true;
        } else {
            class5.method27(119, "T1 - " + class45.field592 + "," + class304.field4926 + "," + class274.field4433 + " - " + class162.field2510, (Throwable) null);
            class115.method861(arg0 ^ arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public static void method1735(int arg0) {
        field3793 = null;
        if (arg0 != -31254) {
            field3793 = null;
        }
    }
}
