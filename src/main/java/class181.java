import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class181 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2496;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2499;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Liba;")
    public static class211 field2500;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field2501;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field2496 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field2499 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field2502 = 0;
        field2500 = new class211(56, 3);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[Lps;I)V", line = 5)
    public static final void method1216(int arg0, class5[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class5 var4 = arg1[var3];
            if (var4 != null && var4.field87 == arg0 && !client.method569(var4)) {
                if (var4.field172 == 0) {
                    method1216(var4.field65, arg1, 0);
                    if (var4.field109 != null) {
                        method1216(var4.field65, var4.field109, 0);
                    }
                    class200 var5 = (class200) class318.field4623.method2002((byte) -123, (long) var4.field65);
                    if (var5 != null) {
                        class19.method129(var5.field2716, -18129);
                    }
                }
                if (var4.field172 == 6 && var4.field51 != -1) {
                    class47 var6 = class203.field2769.method2971(-28, var4.field51);
                    if (var6 != null) {
                        var4.field69 += class255.field3319;
                        int var7 = var4.field56;
                        while (var4.field69 > var6.field729[var4.field56]) {
                            var4.field69 -= var6.field729[var4.field56];
                            var4.field56++;
                            if (var6.field732.length <= var4.field56) {
                                var4.field56 -= var6.field730;
                                if (var4.field56 < 0 || var4.field56 >= var6.field732.length) {
                                    var4.field56 = 0;
                                }
                            }
                            var4.field115 = var4.field56 + 1;
                            if (var6.field732.length <= var4.field115) {
                                var4.field115 -= var6.field730;
                                if (var4.field115 < 0 || var4.field115 >= var6.field732.length) {
                                    var4.field115 = -1;
                                }
                            }
                            class284.method1679(var4, arg2 ^ 0xFFFFFFE1);
                        }
                        if (var4.field56 != var7) {
                            class196.method1283(var6, arg2 ^ 0x7, var4.field56);
                        }
                    }
                }
            }
        }
        field2498++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 101)
    public static void method1217(int arg0) {
        int var1 = 116 / ((arg0 - 40) / 40);
        field2500 = null;
        field2499 = null;
        field2496 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)I", line = 113)
    public static final int method1218(byte arg0, int arg1) {
        if (arg0 == 23) {
            field2495++;
            return (arg1 & 0x3FDCB) >> 11;
        } else {
            return -75;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLpb;)V", line = 125)
    public static final void method1219(boolean arg0, class2 arg1) {
        field2497++;
        if (class142.field2047 == arg1) {
            int var2 = class389.field5816.method3115(29871);
            boolean var3 = (var2 & 0x80) != 0;
            int var4 = (var2 >> 3 & 0x7) + class471.field6784;
            int var5 = (var2 & 0x7) + class350.field5180;
            int var6 = class389.field5816.method3128(32767) + var4;
            int var7 = var5 + class389.field5816.method3128(32767);
            int var8 = class389.field5816.method3129(120);
            int var9 = class389.field5816.method3169(26488);
            int var10 = class389.field5816.method3115(29871) * 4;
            int var11 = class389.field5816.method3115(29871) * 4;
            int var12 = class389.field5816.method3169(26488);
            int var13 = class389.field5816.method3169(26488);
            int var14 = class389.field5816.method3115(29871);
            if (var14 == 255) {
                var14 = -1;
            }
            int var15 = class389.field5816.method3169(26488);
            if (var4 >= 0 && var5 >= 0 && var4 < class72.field1144 && class668.field9444 > var5 && var6 >= 0 && var7 >= 0 && class72.field1144 > var6 && var7 < class668.field9444 && var9 != 65535) {
                int var16 = var7 * 512 + 256;
                int var17 = var11 << 2;
                int var18 = var10 << 2;
                int var19 = var15 << 2;
                int var20 = var6 * 512 + 256;
                int var21 = var5 * 512 + 256;
                int var22 = var4 * 512 + 256;
                class644 var23 = new class644(var9, class488.field6930, class488.field6930, var22, var21, var18, var12 + class45.field685, class45.field685 + var13, var14, var19, var8, var17, var3);
                var23.method3668(class504.method2870((byte) -124, var16, var20, class488.field6930) - var17, (byte) 77, class45.field685 + var12, var20, var16);
                class144.field2079.method1909(new class217(var23), (byte) -81);
            }
        } else if (class183.field2513 == arg1) {
            int var24 = class389.field5816.method3115(29871);
            int var25 = (var24 >> 4 & 0x7) + class471.field6784;
            int var26 = (var24 & 0x7) + class350.field5180;
            int var27 = class389.field5816.method3169(26488);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class389.field5816.method3115(29871);
            int var29 = (var28 & 0xF3) >> 4;
            int var30 = var28 & 0x7;
            int var31 = class389.field5816.method3115(29871);
            int var32 = class389.field5816.method3115(29871);
            int var33 = class389.field5816.method3169(26488);
            if (var25 >= 0 && var26 >= 0 && class72.field1144 > var25 && class668.field9444 > var26) {
                int var34 = var29 + 1;
                if (class321.field4681.field7430[0] >= (var25 - var34) && var25 + var34 >= class321.field4681.field7430[0] && class321.field4681.field7429[0] >= (var26 - var34) && class321.field4681.field7429[0] <= (var26 + var34)) {
                    class595.method3386(var32, (var26 << 8) + (class488.field6930 << 24) + (var25 << 16) + var29, var33, var31, -11356, var30, var27);
                }
            }
        } else if (class413.field6124 == arg1) {
            int var35 = class389.field5816.method3115(29871);
            int var36 = (var35 >> 4 & 0x7) + class471.field6784;
            int var37 = (var35 & 0x7) + class350.field5180;
            int var38 = class389.field5816.method3169(26488);
            if (var38 == 65535) {
                var38 = -1;
            }
            int var39 = class389.field5816.method3115(29871);
            int var40 = var39 >> 4 & 0xF;
            int var41 = var39 & 0x7;
            int var42 = class389.field5816.method3115(29871);
            int var43 = class389.field5816.method3115(29871);
            int var44 = class389.field5816.method3169(26488);
            if (var36 >= 0 && var37 >= 0 && class72.field1144 > var36 && class668.field9444 > var37) {
                int var45 = var40 + 1;
                if ((var36 - var45) <= class321.field4681.field7430[0] && (var36 + var45) >= class321.field4681.field7430[0] && class321.field4681.field7429[0] >= var37 - var45 && (var37 + var45) >= class321.field4681.field7429[0]) {
                    class129.method919(var38, 27700, var44, var41, var43, (class488.field6930 << 24) + (var36 << 16) - (-(var37 << 8) + -var40), false, var42);
                }
            }
        } else if (class416.field6151 == arg1) {
            int var46 = class389.field5816.method3115(29871);
            int var47 = (var46 >> 4 & 0xF) + class471.field6784 * 2;
            int var48 = (var46 & 0xF) + class350.field5180 * 2;
            int var49 = class389.field5816.method3115(29871);
            boolean var50 = (var49 & 0x1) != 0;
            int var51 = var49 >> 1;
            int var52 = var47 + class389.field5816.method3128(32767);
            int var53 = var48 + class389.field5816.method3128(32767);
            int var54 = class389.field5816.method3129(68);
            int var55 = class389.field5816.method3129(70);
            int var56 = class389.field5816.method3169(26488);
            byte var57 = class389.field5816.method3128(32767);
            int var58 = class389.field5816.method3115(29871) * 4;
            int var59 = class389.field5816.method3169(26488);
            int var60 = class389.field5816.method3169(26488);
            int var61 = class389.field5816.method3115(29871);
            if (var61 == 255) {
                var61 = -1;
            }
            int var62 = class389.field5816.method3169(26488);
            if (var47 >= 0 && var48 >= 0 && var47 < (class72.field1144 * 2) && class72.field1144 * 2 > var48 && var52 >= 0 && var53 >= 0 && var52 < class668.field9444 * 2 && var53 < class668.field9444 * 2 && var56 != 65535) {
                int var63 = var58 << 2;
                int var64 = var52 * 256;
                int var65 = var47 * 256;
                int var66 = var57 << 2;
                int var67 = var62 << 2;
                int var68 = var48 * 256;
                int var69 = var53 * 256;
                if (var54 != 0) {
                    class523 var70 = null;
                    if (var54 < 0) {
                        int var71 = -var54 - 1;
                        if (class478.field6850 == var71) {
                            var70 = class321.field4681;
                        } else {
                            var70 = class35.field551[var71];
                        }
                    } else {
                        int var72 = var54 - 1;
                        class177 var73 = (class177) class271.field3550.method2002((byte) -112, (long) var72);
                        if (var73 != null) {
                            var70 = var73.field2476;
                        }
                    }
                    if (var70 != null) {
                        class589 var74 = var70.method2957(arg0);
                        if (var74.field8534 != null && var74.field8534[var51] != null) {
                            int var75 = var74.field8534[var51][0];
                            int var76 = var74.field8534[var51][2];
                            int var77 = var70.field7349.method2129(true);
                            int var78 = class271.field3549[var77];
                            int var79 = class271.field3544[var77];
                            int var80 = var75 * var79 + var76 * var78 >> 14;
                            int var81 = var76 * var79 - (var75 * var78) >> 14;
                            var68 += var81;
                            var65 += var80;
                            var66 -= var74.field8534[var51][1];
                        }
                    }
                }
                class644 var83 = new class644(var56, class488.field6930, class488.field6930, var65, var68, var66, class45.field685 + var59, class45.field685 + var60, var61, var67, var55, var63, var50);
                var83.method3668(class504.method2870((byte) -119, var69, var64, class488.field6930) - var63, (byte) 27, class45.field685 + var59, var64, var69);
                class144.field2079.method1909(new class217(var83), (byte) -81);
            }
        } else if (class620.field8973 == arg1) {
            int var84 = class389.field5816.method3115(29871);
            int var85 = ((var84 & 0x77) >> 4) + class471.field6784;
            int var86 = class350.field5180 + (var84 & 0x7);
            int var87 = class389.field5816.method3115(29871);
            int var88 = var87 >> 2;
            int var89 = var87 & 0x3;
            int var90 = class540.field7953[var88];
            int var91 = class389.field5816.method3168(65536);
            if (class501.method2859((byte) 126, class57.field938) || var85 >= 0 && var86 >= 0 && var85 < class72.field1144 && var86 < class668.field9444) {
                class520.method2938(var88, -87, var90, var86, var85, var89, var91, class488.field6930, -1, 0);
            }
        } else if (class303.field4495 == arg1) {
            int var92 = class389.field5816.method3115(29871);
            int var93 = var92 >> 2;
            int var94 = var92 & 0x3;
            int var95 = class540.field7953[var93];
            int var96 = class389.field5816.method3115(29871);
            int var97 = ((var96 & 0x77) >> 4) + class471.field6784;
            int var98 = (var96 & 0x7) + class350.field5180;
            if (class501.method2859((byte) 123, class57.field938) || var97 >= 0 && var98 >= 0 && class72.field1144 > var97 && var98 < class668.field9444) {
                class520.method2938(var93, -62, var95, var98, var97, var94, -1, class488.field6930, -1, 0);
            }
        } else if (arg0) {
            if (class211.field2850 == arg1) {
                int var99 = class389.field5816.method3115(29871);
                int var100 = ((var99 & 0x7A) >> 4) + class471.field6784;
                int var101 = (var99 & 0x7) + class350.field5180;
                int var102 = class389.field5816.method3169(26488);
                int var103 = class389.field5816.method3115(29871);
                int var104 = class389.field5816.method3169(26488);
                int var105 = class389.field5816.method3115(29871);
                if (var100 >= 0 && var101 >= 0 && class72.field1144 > var100 && class668.field9444 > var101) {
                    int var106 = var100 * 512 + 256;
                    int var107 = var101 * 512 + 256;
                    int var108 = class488.field6930;
                    if (var108 < 3 && class125.method898(-49, var100, var101)) {
                        var108++;
                    }
                    class537 var109 = new class537(var102, var104, class45.field685, class488.field6930, var108, var106, class504.method2870((byte) -126, var107, var106, class488.field6930) - var103, var107, var100, var100, var101, var101, var105);
                    class547.field8071.method1909(new class209(var109), (byte) -81);
                }
            } else if (class82.field1320 == arg1) {
                int var110 = class389.field5816.method3172(32122);
                int var111 = class389.field5816.method3139(121);
                int var112 = (var111 & 0x7) + class350.field5180;
                int var113 = var112 + class403.field6049;
                int var114 = class471.field6784 + ((var111 & 0x77) >> 4);
                int var115 = class397.field6005 + var114;
                int var116 = class389.field5816.method3116(-116);
                int var117 = class389.field5816.method3172(32122);
                if (class478.field6850 != var117) {
                    boolean var118 = var114 >= 0 && var112 >= 0 && var114 < class72.field1144 && class668.field9444 > var112;
                    if (var118 || class501.method2859((byte) 118, class57.field938)) {
                        class5.method22(var115, (byte) 71, var113, new class678(var110, var116), class488.field6930);
                        if (var118) {
                            class408.method2505(class488.field6930, var112, var114, (byte) 75);
                        }
                    }
                }
            } else if (class520.field7285 == arg1) {
                int var119 = class389.field5816.method3115(29871);
                int var120 = (var119 & 0x7) + class350.field5180;
                int var121 = var120 + class403.field6049;
                int var122 = (var119 >> 4 & 0x7) + class471.field6784;
                int var123 = var122 + class397.field6005;
                int var124 = class389.field5816.method3169(26488);
                int var125 = class389.field5816.method3169(26488);
                int var126 = class389.field5816.method3169(26488);
                if (class86.field1336 != null) {
                    class668 var127 = (class668) class86.field1336.method2002((byte) -126, (long) (var121 << 14 | class488.field6930 << 28 | var123));
                    if (var127 != null) {
                        for (class678 var128 = (class678) var127.field9445.method1904(!arg0); var128 != null; var128 = (class678) var127.field9445.method1901(95)) {
                            if ((var124 & 0x7FFF) == var128.field9594 && var128.field9595 == var125) {
                                var128.method2360((byte) 66);
                                var128.field9595 = var126;
                                class5.method22(var123, (byte) 87, var121, var128, class488.field6930);
                                break;
                            }
                        }
                        if (var122 >= 0 && var120 >= 0 && var122 < class72.field1144 && class668.field9444 > var120) {
                            class408.method2505(class488.field6930, var120, var122, (byte) 80);
                        }
                    }
                }
            } else if (class623.field9010 == arg1) {
                int var129 = class389.field5816.method3115(29871);
                int var130 = class350.field5180 + (var129 & 0x7);
                int var131 = class403.field6049 + var130;
                int var132 = class471.field6784 + (var129 >> 4 & 0x7);
                int var133 = class397.field6005 + var132;
                int var134 = class389.field5816.method3116(32);
                int var135 = class389.field5816.method3172(32122);
                boolean var136 = var132 >= 0 && var130 >= 0 && class72.field1144 > var132 && var130 < class668.field9444;
                if (var136 || class501.method2859((byte) 121, class57.field938)) {
                    class5.method22(var133, (byte) 67, var131, new class678(var134, var135), class488.field6930);
                    if (var136) {
                        class408.method2505(class488.field6930, var130, var132, (byte) 65);
                    }
                }
            } else if (class308.field4544 == arg1) {
                int var137 = class389.field5816.method3169(26488);
                int var138 = class389.field5816.method3115(29871);
                class60.field965.method2596(0, var137).method1782((byte) -105, var138);
            } else if (class539.field7909 == arg1) {
                class389.field5816.method3115(29871);
                int var139 = class389.field5816.method3115(29871);
                int var140 = class471.field6784 + ((var139 & 0x76) >> 4);
                int var141 = class350.field5180 + (var139 & 0x7);
                int var142 = class389.field5816.method3169(26488);
                int var143 = class389.field5816.method3115(29871);
                int var144 = class389.field5816.method3154((byte) -49);
                String var145 = class389.field5816.method3145((byte) -121);
                class80.method464(class488.field6930, var143, arg0, var141, var142, var145, var144, var140);
            } else if (class323.field4702 == arg1) {
                int var146 = class389.field5816.method3115(29871);
                int var147 = class350.field5180 + (var146 & 0x7);
                int var148 = class403.field6049 + var147;
                int var149 = (var146 >> 4 & 0x7) + class471.field6784;
                int var150 = var149 + class397.field6005;
                int var151 = class389.field5816.method3169(26488);
                class668 var152 = (class668) class86.field1336.method2002((byte) -106, (long) (var148 << 14 | class488.field6930 << 28 | var150));
                if (var152 != null) {
                    for (class678 var153 = (class678) var152.field9445.method1904(false); var153 != null; var153 = (class678) var152.field9445.method1901(95)) {
                        if ((var151 & 0x7FFF) == var153.field9594) {
                            var153.method2360((byte) 66);
                            break;
                        }
                    }
                    if (var152.field9445.method1903(-16)) {
                        var152.method2360((byte) 66);
                    }
                    if (var149 >= 0 && var147 >= 0 && var149 < class72.field1144 && class668.field9444 > var147) {
                        class408.method2505(class488.field6930, var147, var149, (byte) 42);
                    }
                }
            } else if (class688.field9714 == arg1) {
                int var154 = class389.field5816.method3139(123);
                int var155 = class471.field6784 + ((var154 & 0x7F) >> 4);
                int var156 = (var154 & 0x7) + class350.field5180;
                int var157 = class389.field5816.method3168(65536);
                if (var157 == 65535) {
                    var157 = -1;
                }
                int var158 = class389.field5816.method3115(29871);
                int var159 = var158 >> 2;
                int var160 = var158 & 0x3;
                int var161 = class540.field7953[var159];
                class319.method1973(class488.field6930, var160, var156, var161, var157, 1000, var155, var159);
            } else if (class40.field599 == arg1) {
                int var162 = class389.field5816.method3115(29871);
                int var163 = ((var162 & 0xFC) >> 4) + class471.field6784 * 2;
                int var164 = class350.field5180 * 2 + (var162 & 0xF);
                boolean var165 = class389.field5816.method3115(29871) != 0;
                int var166 = var163 + class389.field5816.method3128(32767);
                int var167 = var164 + class389.field5816.method3128(32767);
                int var168 = class389.field5816.method3129(115);
                int var169 = class389.field5816.method3169(26488);
                int var170 = class389.field5816.method3115(29871) * 4;
                int var171 = class389.field5816.method3115(29871) * 4;
                int var172 = class389.field5816.method3169(26488);
                int var173 = class389.field5816.method3169(26488);
                int var174 = class389.field5816.method3115(29871);
                if (var174 == 255) {
                    var174 = -1;
                }
                int var175 = class389.field5816.method3169(26488);
                if (var163 >= 0 && var164 >= 0 && var163 < (class72.field1144 * 2) && var164 < (class72.field1144 * 2) && var166 >= 0 && var167 >= 0 && var166 < class668.field9444 * 2 && var167 < (class668.field9444 * 2) && var169 != 65535) {
                    int var176 = var166 * 256;
                    int var177 = var170 << 2;
                    int var178 = var171 << 2;
                    int var179 = var175 << 2;
                    int var180 = var167 * 256;
                    int var181 = var163 * 256;
                    int var182 = var164 * 256;
                    class644 var183 = new class644(var169, class488.field6930, class488.field6930, var181, var182, var177, class45.field685 + var172, class45.field685 + var173, var174, var179, var168, var178, var165);
                    var183.method3668(class504.method2870((byte) -122, var180, var176, class488.field6930) - var178, (byte) 92, class45.field685 + var172, var176, var180);
                    class144.field2079.method1909(new class217(var183), (byte) -81);
                }
            } else {
                class118.method869(null, (byte) -128, "T3 - " + arg1);
                class65.method395(false, -61);
            }
        }
    }
}
