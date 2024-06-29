import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class289 extends class71 {

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Z")
    public static boolean field3899 = false;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Lrq;")
    public class213 field3887;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field3900;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "[B")
    public byte[] field3901;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "[Ltf;")
    public static class177[] field3896;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "[[[Lf;")
    public static class491[][][] field3897;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I", line = 3)
    public final int method448(int arg0) {
        ++field3893;
        if (arg0 != 64) {
            this.method448(40);
        }
        return super.field973 ? 0 : 100;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(Z)V", line = 26)
    public static void method1629(boolean arg0) {
        field3896 = null;
        if (!arg0) {
            field3900 = null;
        }
        field3900 = null;
        field3897 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)B", line = 38)
    public static final byte method1630(int arg0, int arg1, boolean arg2) {
        ++field3894;
        if (arg2) {
            return -93;
        } else if (arg1 != 9) {
            return 0;
        } else {
            return (byte) (~(arg0 & 1) != -1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)Z", line = 57)
    public static final boolean method1631(int arg0, byte arg1) {
        ++field3895;
        int var2 = 114 / ((arg1 - -25) / 41);
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)[B", line = 68)
    public final byte[] method447(byte arg0) {
        ++field3889;
        if (super.field973) {
            throw new RuntimeException();
        } else {
            return arg0 > -118 ? null : this.field3901;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(IB)Luo;", line = 90)
    public static final class373 method1632(int arg0, byte arg1) {
        ++field3891;
        class373 var2 = (class373) class487.field6743.method493((byte) 19, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = 109 % ((-74 - arg1) / 38);
            byte[] var4 = class19.field269.method702((byte) -110, arg0, 0);
            class373 var5 = new class373();
            if (var4 != null) {
                var5.method2294(new class32(var4), 0);
            }
            var5.method2292(true);
            class487.field6743.method505((long) arg0, var5, 87);
            return var5;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ls;I)V", line = 116)
    public static final void method1633(class169 arg0, int arg1) {
        ++field3888;
        if (class225.field2976 == arg0) {
            int var2 = class314.field4171.method201((byte) -121);
            int var3 = class12.field168 * 2 - -(var2 >> 4 & 15);
            int var4 = class445.field6060 * 2 - -(15 & var2);
            int var5 = var3 + class314.field4171.method211(arg1 + 29854);
            int var6 = var4 - -class314.field4171.method211(arg1 ^ 29858);
            int var7 = class314.field4171.method209((byte) 35);
            int var8 = class314.field4171.method215((byte) 123);
            int var9 = class314.field4171.method201((byte) -111) * 4;
            int var10 = class314.field4171.method201((byte) -122) * 4;
            int var11 = class314.field4171.method215((byte) 91);
            int var12 = class314.field4171.method215((byte) 105);
            int var13 = class314.field4171.method201((byte) -119);
            int var14 = class314.field4171.method201((byte) -121);
            if (var13 == 255) {
                var13 = -1;
            }
            if (~var3 <= -1 && ~var4 <= -1 && class295.field3947 * 2 > var3 && ~(class295.field3947 * 2) < ~var4 && ~var5 <= -1 && ~var6 <= -1 && class39.field567 * 2 > var5 && var6 < class39.field567 * 2 && ~var8 != -65536) {
                int var15 = var5 * 64;
                int var16 = var6 * 64;
                int var17 = var3 * 64;
                int var18 = var4 * 64;
                class230 var19 = new class230(var8, class134.field1961, var17, var18, class247.method1385(58, var17, var18, class134.field1961) - var9, var11 - -class70.field968, class70.field968 + var12, var13, var14, var7, var10);
                var19.method1287(class247.method1385(arg1 ^ -123, var15, var16, class134.field1961) - var10, var15, class70.field968 + var11, true, var16);
                class177.field2403.method641(new class370(var19), (byte) -93);
            }
        } else if (class324.field4324 == arg0) {
            int var20 = class314.field4171.method201((byte) -109);
            int var21 = (7 & var20 >> 4) + class12.field168;
            int var22 = (7 & var20) + class445.field6060;
            int var23 = class314.field4171.method215((byte) 94);
            int var24 = class314.field4171.method215((byte) 122);
            int var25 = class314.field4171.method215((byte) 93);
            if (class33.field505 != null && ~var21 <= -1 && var22 >= 0 && var21 < class295.field3947 && class39.field567 > var22) {
                class223 var26 = (class223) class33.field505.method1528((long) (var21 | class134.field1961 << 28 | var22 << 14), 107);
                if (var26 != null) {
                    for (class459 var27 = (class459) var26.field2963.method652((byte) 37); var27 != null; var27 = (class459) var26.field2963.method653(34)) {
                        if ((32767 & var23) == var27.field6222 && ~var27.field6224 == ~var24) {
                            var27.method2614((byte) -93);
                            var27.field6224 = var25;
                            class99.method609(var22, var21, arg1 + 30748, var27, class134.field1961);
                            break;
                        }
                    }
                    class448.method2637(var21, -751, class134.field1961, var22);
                }
            }
        } else if (class80.field1073 == arg0) {
            int var28 = class314.field4171.method201((byte) -125);
            int var29 = ((var28 & 247) >> 4) + class12.field168 * 2;
            int var30 = (var28 & 15) + class445.field6060 * 2;
            int var31 = class314.field4171.method211(29861) + var29;
            int var32 = var30 + class314.field4171.method211(29861);
            int var33 = class314.field4171.method209((byte) 35);
            int var34 = class314.field4171.method209((byte) 35);
            int var35 = class314.field4171.method215((byte) 109);
            int var36 = class314.field4171.method211(29861);
            int var37 = 4 * class314.field4171.method201((byte) -117);
            int var38 = class314.field4171.method215((byte) 125);
            int var39 = class314.field4171.method215((byte) 114);
            int var40 = class314.field4171.method201((byte) -128);
            if (var40 == 255) {
                var40 = -1;
            }
            int var41 = class314.field4171.method201((byte) -123);
            if (~var29 <= -1 && var30 >= 0 && var29 < class295.field3947 * 2 && class295.field3947 * 2 > var30 && ~var31 <= -1 && ~var32 <= -1 && ~var31 > ~(class39.field567 * 2) && ~var32 > ~(class39.field567 * 2) && ~var35 != -65536) {
                int var42 = var30 * 64;
                int var43 = var31 * 64;
                int var44 = var29 * 64;
                int var45 = var32 * 64;
                if (var33 != 0) {
                    int var47;
                    class86 var49;
                    if (var33 >= 0) {
                        int var46 = var33 + -1;
                        var47 = var46 >> 11 & 15;
                        int var48 = 2047 & var46;
                        var49 = class221.field2941[var48];
                    } else {
                        int var50 = -var33 + -1;
                        var47 = 15 & var50 >> 11;
                        int var51 = var50 & 2047;
                        if (class332.field4494 != var51) {
                            var49 = class413.field5644[var51];
                        } else {
                            var49 = class233.field3103;
                        }
                    }
                    if (var49 != null) {
                        class280 var52 = var49.method549(-103);
                        if (var52.field3732 != null && var52.field3732[var47] != null) {
                            int var53 = var52.field3732[var47][0];
                            int var54 = var52.field3732[var47][2];
                            int var55 = var49.field1143.method2758((byte) 70);
                            int var56 = class364.field4994[var55];
                            int var57 = class364.field4992[var55];
                            int var58 = var54 * var56 - -(var53 * var57) >> 15;
                            int var59 = var54 * var57 + -(var53 * var56) >> 15;
                            var36 -= var52.field3732[var47][1];
                            var44 += var58;
                            var42 += var59;
                        }
                    }
                }
                class230 var61 = new class230(var35, class134.field1961, var44, var42, -var36 + class247.method1385(84, var44, var42, class134.field1961), class70.field968 + var38, var39 - -class70.field968, var40, var41, var34, var37);
                var61.method1287(-var37 + class247.method1385(-119, var43, var45, class134.field1961), var43, class70.field968 + var38, true, var45);
                class177.field2403.method641(new class370(var61), (byte) -93);
            }
        } else if (class231.field3067 != arg0) {
            if (class76.field1017 == arg0) {
                int var68 = class314.field4171.method189(true);
                int var69 = class314.field4171.method239((byte) 107);
                int var70 = class314.field4171.method197(-989178832);
                int var71 = (var70 >> 4 & 7) + class12.field168;
                int var72 = class445.field6060 - -(7 & var70);
                int var73 = class314.field4171.method239((byte) 107);
                if (~var71 <= -1 && var72 >= 0 && ~class295.field3947 < ~var71 && ~var72 > ~class39.field567 && ~class332.field4494 != ~var69) {
                    class99.method609(var72, var71, 30755, new class459(var73, var68), class134.field1961);
                    class448.method2637(var71, arg1 + -758, class134.field1961, var72);
                }
            } else if (class96.field1415 == arg0) {
                int var74 = class314.field4171.method190(arg1 + 120);
                int var75 = var74 >> 2;
                int var76 = var74 & 3;
                int var77 = class7.field92[var75];
                int var78 = class314.field4171.method192((byte) 59);
                int var79 = class314.field4171.method201((byte) -121);
                int var80 = class12.field168 - -(var79 >> 4 & 7);
                int var81 = class445.field6060 - -(var79 & 7);
                if (var80 >= 0 && var81 >= 0 && var80 < class295.field3947 && ~class39.field567 < ~var81) {
                    class425.method2516(var78, var77, var75, var80, var76, var81, class134.field1961, 0, -1, arg1 ^ 22583);
                }
            } else if (class1.field22 == arg0) {
                byte var82 = class314.field4171.method187((byte) -43);
                int var83 = class314.field4171.method201((byte) -126);
                int var84 = ((var83 & 118) >> 4) + class12.field168;
                int var85 = (7 & var83) + class445.field6060;
                int var86 = class314.field4171.method236((byte) 66);
                byte var87 = class314.field4171.method227(-20416);
                int var88 = class314.field4171.method239((byte) 107);
                int var89 = class314.field4171.method239((byte) 107);
                byte var90 = class314.field4171.method187((byte) -43);
                byte var91 = class314.field4171.method187((byte) -43);
                int var92 = class314.field4171.method249((byte) -79);
                int var93 = var92 >> 2;
                int var94 = var92 & 3;
                int var95 = class314.field4171.method215((byte) 93);
                if (!class98.field1432.method1999()) {
                    class134.method818(var84, var95, var90, var88, var91, var87, var82, var89, var86, var93, var94, -89, var85, class134.field1961);
                }
            } else if (class143.field2072 == arg0) {
                int var96 = class314.field4171.method215((byte) 90);
                int var97 = class314.field4171.method201((byte) -106);
                class1.field23.method935(var96, (byte) -119).method562(-1939893693, var97);
            } else if (class206.field2790 == arg0) {
                class314.field4171.method201((byte) -108);
                int var98 = class314.field4171.method201((byte) -113);
                int var99 = ((var98 & 124) >> 4) + class12.field168;
                int var100 = class445.field6060 - -(7 & var98);
                int var101 = class314.field4171.method215((byte) 106);
                int var102 = class314.field4171.method201((byte) -128);
                int var103 = class314.field4171.method219(-118);
                String var104 = class314.field4171.method195(100);
                class462.method2722(var101, var102, var103, var104, class134.field1961, arg1 + -11231, var99, var100);
            } else if (class490.field6831 == arg0) {
                int var105 = class314.field4171.method192((byte) 59);
                if (var105 == 65535) {
                    var105 = -1;
                }
                int var106 = class314.field4171.method197(arg1 + -989178839);
                int var107 = ((117 & var106) >> 4) + class12.field168;
                int var108 = (var106 & 7) + class445.field6060;
                int var109 = class314.field4171.method197(-989178832);
                int var110 = var109 >> 2;
                int var111 = 3 & var109;
                int var112 = class7.field92[var110];
                class104.method632(var110, var105, (byte) 67, var108, var112, var111, var107, class134.field1961);
            } else if (class162.field2262 == arg0) {
                int var113 = class314.field4171.method201((byte) -115);
                int var114 = (var113 >> 4 & 7) + class12.field168;
                int var115 = (var113 & 7) + class445.field6060;
                int var116 = class314.field4171.method215((byte) 96);
                int var117 = class314.field4171.method201((byte) -112);
                int var118 = class314.field4171.method215((byte) 111);
                if (var114 >= 0 && ~var115 <= -1 && class295.field3947 > var114 && ~class39.field567 < ~var115) {
                    int var119 = var114 * 128 - -64;
                    int var120 = var115 * 128 - -64;
                    class103 var121 = new class103(var116, var118, class70.field968, class134.field1961, var119, class247.method1385(-38, var119, var120, class134.field1961) - var117, var120, var114, var114, var115, var115);
                    class450.field6124.method641(new class437(var121), (byte) -93);
                }
            } else if (class140.field2045 == arg0) {
                int var122 = class314.field4171.method201((byte) -105);
                int var123 = ((var122 & 112) >> 4) + class12.field168;
                int var124 = (var122 & 7) + class445.field6060;
                int var125 = class314.field4171.method215((byte) 109);
                if (var125 == 65535) {
                    var125 = -1;
                }
                int var126 = class314.field4171.method201((byte) -106);
                int var127 = var126 >> 4 & 15;
                int var128 = var126 & 7;
                int var129 = class314.field4171.method201((byte) -122);
                int var130 = class314.field4171.method201((byte) -121);
                if (~var123 <= -1 && var124 >= 0 && var123 < class295.field3947 && ~class39.field567 < ~var124) {
                    int var131 = var127 + 1;
                    if (~(-var131 + var123) >= ~class233.field3103.field1193[0] && class233.field3103.field1193[0] <= var123 - -var131 && class233.field3103.field1197[0] >= -var131 + var124 && ~(var124 + var131) <= ~class233.field3103.field1197[0] && class488.field6789.field6671 != 0 && ~var128 < -1 && ~class134.field1963 > -51 && ~var125 != 0) {
                        class230.field3030[class134.field1963] = var125;
                        class214.field2878[class134.field1963] = var128;
                        class356.field4912[class134.field1963] = var129;
                        class336.field4536[class134.field1963] = null;
                        class100.field1460[class134.field1963] = (class134.field1961 << 24) + (var123 << 16) + (var124 << 8) + var127;
                        class249.field3323[class134.field1963] = var130;
                        ++class134.field1963;
                    }
                }
            } else if (class39.field566 == arg0) {
                int var132 = class314.field4171.method249((byte) 126);
                int var133 = ((var132 & 123) >> 4) + class12.field168;
                int var134 = (var132 & 7) + class445.field6060;
                int var135 = class314.field4171.method190(127);
                int var136 = var135 >> 2;
                int var137 = var135 & 3;
                int var138 = class7.field92[var136];
                if (~var133 <= -1 && ~var134 <= -1 && var133 < class295.field3947 && class39.field567 > var134) {
                    class425.method2516(-1, var138, var136, var133, var137, var134, class134.field1961, 0, -1, arg1 + 22569);
                }
            } else if (class120.field1769 == arg0) {
                int var139 = class314.field4171.method201((byte) -124);
                int var140 = ((122 & var139) >> 4) + class12.field168;
                int var141 = (var139 & 7) + class445.field6060;
                int var142 = var140 - -class314.field4171.method211(29861);
                int var143 = var141 + class314.field4171.method211(29861);
                int var144 = class314.field4171.method209((byte) 35);
                int var145 = class314.field4171.method215((byte) 102);
                int var146 = class314.field4171.method201((byte) -112) * 4;
                int var147 = class314.field4171.method201((byte) -106) * 4;
                int var148 = class314.field4171.method215((byte) 121);
                int var149 = class314.field4171.method215((byte) 94);
                int var150 = class314.field4171.method201((byte) -110);
                int var151 = class314.field4171.method201((byte) -108);
                if (var150 == 255) {
                    var150 = -1;
                }
                if (~var140 <= -1 && ~var141 <= -1 && class295.field3947 > var140 && ~var141 > ~class39.field567 && ~var142 <= -1 && var143 >= 0 && ~var142 > ~class295.field3947 && var143 < class39.field567 && var145 != 65535) {
                    int var152 = var141 * 128 + 64;
                    int var153 = var140 * 128 - -64;
                    int var154 = var143 * 128 + 64;
                    int var155 = var142 * 128 + 64;
                    class230 var156 = new class230(var145, class134.field1961, var153, var152, class247.method1385(115, var153, var152, class134.field1961) + -var146, class70.field968 + var148, var149 - -class70.field968, var150, var151, var144, var147);
                    var156.method1287(-var147 + class247.method1385(-128, var155, var154, class134.field1961), var155, class70.field968 + var148, true, var154);
                    class177.field2403.method641(new class370(var156), (byte) -93);
                }
            } else if (class129.field1901 == arg0) {
                int var157 = class314.field4171.method215((byte) 89);
                int var158 = class314.field4171.method192((byte) 59);
                int var159 = class314.field4171.method201((byte) -105);
                int var160 = ((var159 & 123) >> 4) + class12.field168;
                int var161 = (7 & var159) + class445.field6060;
                if (~var160 <= -1 && ~var161 <= -1 && ~var160 > ~class295.field3947 && ~class39.field567 < ~var161) {
                    class99.method609(var161, var160, 30755, new class459(var157, var158), class134.field1961);
                    class448.method2637(var160, -751, class134.field1961, var161);
                }
            } else {
                class228.method1278((Throwable) null, "T3 - " + arg0, arg1 ^ -30117);
                class476.method2779(arg1 ^ arg1);
            }
        } else {
            int var62 = class314.field4171.method190(125);
            int var63 = ((var62 & 118) >> 4) + class12.field168;
            int var64 = (var62 & 7) + class445.field6060;
            int var65 = class314.field4171.method239((byte) 107);
            if (~var63 <= -1 && var64 >= 0 && ~var63 > ~class295.field3947 && ~var64 > ~class39.field567) {
                class223 var66 = (class223) class33.field505.method1528((long) (var63 | class134.field1961 << 28 | var64 << 14), 109);
                if (var66 != null) {
                    for (class459 var67 = (class459) var66.field2963.method652((byte) 37); var67 != null; var67 = (class459) var66.field2963.method653(21)) {
                        if ((var65 & 32767) == var67.field6222) {
                            var67.method2614((byte) -81);
                            break;
                        }
                    }
                    if (var66.field2963.method651((byte) -115)) {
                        var66.method2614((byte) -106);
                    }
                    class448.method2637(var63, -751, class134.field1961, var64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 732)
    public static final String method1634(byte arg0, String arg1) {
        ++field3892;
        if (arg0 != 63) {
            method1632(-62, (byte) -41);
        }
        String var2 = class199.method1137(class322.method1790((byte) 126, arg1), (byte) -127);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
