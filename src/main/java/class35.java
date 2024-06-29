import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class35 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lbb;")
    private class270 field381;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field382 = new String[100];

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "Lph;")
    public static class315 field387;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Lc;")
    public static class436 field386;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Lpn;")
    private class43 field377;

    static {
        new class72("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lbb;I)V", line = 7)
    public final void method221(class270 arg0, int arg1) {
        this.field381 = arg0;
        field379++;
        if (arg1 != 316392388) {
            method228(98, 54, -54, (Class) null);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 18)
    public static final void method222(byte arg0) {
        field383++;
        class433 var1 = (class433) class201.field2368.method1690((byte) -122);
        if (arg0 >= -5) {
            method223(-111);
        }
        while (var1 != null) {
            class302 var2 = var1.field5908;
            if (class43.field513 != var2.field1528 || var2.field4040) {
                var1.method263(false);
                var2.method1917(0);
            } else if (var2.field4042 <= class106.field1273) {
                var2.method1916(17202, class439.field6032);
                if (var2.field4040) {
                    var1.method263(false);
                } else {
                    class94.method591(var2, true);
                }
            }
            var1 = (class433) class201.field2368.method1699((byte) 81);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 54)
    public static final void method223(int arg0) {
        field378++;
        if (class269.field3478 == 133) {
            int var1 = class215.field2658.method1567(true);
            int var2 = class240.field3159 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + class283.field3706;
            int var4 = class215.field2658.method1567(true);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class30.field330[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < class22.field232 && var3 < class196.field2329) {
                class332.method2133(-1, 0, class43.field513, var5, var7, 31496, var6, var3, -1, var2);
            }
        } else if (class269.field3478 == 27) {
            int var8 = class215.field2658.method1587((byte) -102);
            int var9 = class215.field2658.method1563(-128);
            class380.method2361(var8, -29012).method2768(var9, (byte) -76);
        } else if (class269.field3478 == 30) {
            class215.field2658.method1563(-128);
            int var10 = class215.field2658.method1563(-128);
            int var11 = (var10 >> 4 & 0x7) + class240.field3159;
            int var12 = class283.field3706 + (var10 & 0x7);
            int var13 = class215.field2658.method1587((byte) -102);
            int var14 = class215.field2658.method1563(-128);
            int var15 = class215.field2658.method1545(8);
            String var16 = class215.field2658.method1565(arg0 ^ 0xFFFFFFBD);
            class140.method898(var13, var15, var16, var11, var14, false, var12);
        } else if (class269.field3478 == 83) {
            int var17 = class215.field2658.method1563(arg0 ^ 0xFFFFFF82);
            int var18 = ((var17 & 0xF9) >> 4) + class240.field3159 * 2;
            int var19 = class283.field3706 * 2 + (var17 & 0xF);
            int var20 = class215.field2658.method1589(false) + var18;
            int var21 = class215.field2658.method1589(false) + var19;
            int var22 = class215.field2658.method1582(false);
            int var23 = class215.field2658.method1587((byte) -102);
            int var24 = class215.field2658.method1563(-128) * 4;
            int var25 = class215.field2658.method1563(-128) * 4;
            int var26 = class215.field2658.method1587((byte) -102);
            int var27 = class215.field2658.method1587((byte) -102);
            int var28 = class215.field2658.method1563(-128);
            if (var28 == 255) {
                var28 = -1;
            }
            int var29 = class215.field2658.method1563(-128);
            if (var18 >= 0 && var19 >= 0 && class22.field232 * 2 > var18 && var19 < (class22.field232 * 2) && var20 >= 0 && var21 >= 0 && (class196.field2329 * 2) > var20 && class196.field2329 * 2 > var21 && var23 != 65535) {
                int var30 = var21 * 64;
                int var31 = var19 * 64;
                int var32 = var18 * 64;
                int var33 = var20 * 64;
                class38 var34 = new class38(var23, class43.field513, var32, var31, class189.method1170(var31, var32, true, class43.field513) - var24, var26 - -class106.field1273, class106.field1273 + var27, var28, var29, var22, var25);
                var34.method243(class106.field1273 + var26, (byte) -103, var33, var30, class189.method1170(var30, var33, true, class43.field513) - var25);
                class180.field2094.method1696(false, new class284(var34));
            }
        } else if (class269.field3478 == arg0) {
            int var35 = class215.field2658.method1563(-128);
            int var36 = ((var35 & 0x70) >> 4) + class240.field3159;
            int var37 = (var35 & 0x7) + class283.field3706;
            int var38 = class215.field2658.method1587((byte) -102);
            int var39 = class215.field2658.method1587((byte) -102);
            int var40 = class215.field2658.method1587((byte) -102);
            if (class76.field939 != null && var36 >= 0 && var37 >= 0 && class22.field232 > var36 && var37 < class196.field2329) {
                class14 var41 = (class14) class76.field939.method2218(1, (long) (class43.field513 << 28 | var37 << 14 | var36));
                if (var41 != null) {
                    for (class228 var42 = (class228) var41.field171.method1690((byte) -118); var42 != null; var42 = (class228) var41.field171.method1699((byte) 85)) {
                        if ((var38 & 0x7FFF) == var42.field2885 && var42.field2878 == var39) {
                            var42.method263(false);
                            var42.field2878 = var40;
                            class270.method1693(var36, var37, class43.field513, 20466, var42);
                            break;
                        }
                    }
                    class405.method2523(class43.field513, var36, var37, (byte) -27);
                }
            }
        } else if (class269.field3478 == 98) {
            int var43 = class215.field2658.method1563(-128);
            int var44 = var43 >> 2;
            int var45 = var43 & 0x3;
            int var46 = class30.field330[var44];
            int var47 = class215.field2658.method1587((byte) -102);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var48 = class215.field2658.method1583(-128);
            int var49 = (var48 >> 4 & 0x7) + class240.field3159;
            int var50 = (var48 & 0x7) + class283.field3706;
            class173.method1086(var49, var50, var47, 4, var44, var45, var46, class43.field513);
        } else if (class269.field3478 == 226) {
            int var51 = class215.field2658.method1551(109);
            int var52 = class215.field2658.method1572(-3);
            int var53 = (var52 >> 4 & 0x7) + class240.field3159;
            int var54 = (var52 & 0x7) + class283.field3706;
            if (var53 >= 0 && var54 >= 0 && class22.field232 > var53 && var54 < class196.field2329) {
                class14 var55 = (class14) class76.field939.method2218(1, (long) (var53 | var54 << 14 | class43.field513 << 28));
                if (var55 != null) {
                    for (class228 var56 = (class228) var55.field171.method1690((byte) -127); var56 != null; var56 = (class228) var55.field171.method1699((byte) 98)) {
                        if ((var51 & 0x7FFF) == var56.field2885) {
                            var56.method263(false);
                            break;
                        }
                    }
                    if (var55.field171.method1698(0)) {
                        var55.method263(false);
                    }
                    class405.method2523(class43.field513, var53, var54, (byte) -27);
                }
            }
        } else if (class269.field3478 == 44) {
            int var57 = class215.field2658.method1563(arg0 - 130);
            int var58 = ((var57 & 0x75) >> 4) + class240.field3159;
            int var59 = (var57 & 0x7) + class283.field3706;
            int var60 = class215.field2658.method1587((byte) -102);
            if (var60 == 65535) {
                var60 = -1;
            }
            int var61 = class215.field2658.method1563(-128);
            int var62 = (var61 & 0xF9) >> 4;
            int var63 = var61 & 0x7;
            int var64 = class215.field2658.method1563(arg0 ^ 0xFFFFFF82);
            int var65 = class215.field2658.method1563(-128);
            if (var58 >= 0 && var59 >= 0 && var58 < class22.field232 && var59 < class196.field2329) {
                int var66 = var62 + 1;
                if (class143.field1684.field2480[0] >= var58 - var66 && class143.field1684.field2480[0] <= (var58 + var66) && (var59 - var66) <= class143.field1684.field2482[0] && var59 + var66 >= class143.field1684.field2482[0] && class330.field4500 != 0 && var63 > 0 && class420.field5754 < 50 && var60 != -1) {
                    class107.field1286[class420.field5754] = var60;
                    class195.field2317[class420.field5754] = var63;
                    class30.field329[class420.field5754] = var64;
                    class92.field1074[class420.field5754] = null;
                    class186.field2158[class420.field5754] = (var58 << 16) + (var59 << 8) + var62;
                    class330.field4504[class420.field5754] = var65;
                    class420.field5754++;
                }
            }
        } else if (class269.field3478 == 119) {
            int var67 = class215.field2658.method1587((byte) -102);
            int var68 = class215.field2658.method1578(2);
            int var69 = class215.field2658.method1583(-128);
            int var70 = (var69 >> 4 & 0x7) + class240.field3159;
            int var71 = (var69 & 0x7) + class283.field3706;
            int var72 = class215.field2658.method1587((byte) -102);
            if (var70 >= 0 && var71 >= 0 && var70 < class22.field232 && class196.field2329 > var71 && class429.field5865 != var68) {
                class270.method1693(var70, var71, class43.field513, 20466, new class228(var72, var67));
                class405.method2523(class43.field513, var70, var71, (byte) -27);
            }
        } else if (class269.field3478 == 175) {
            int var73 = class215.field2658.method1569(true);
            int var74 = class215.field2658.method1567(true);
            int var75 = ((var74 & 0x70) >> 4) + class240.field3159;
            int var76 = (var74 & 0x7) + class283.field3706;
            int var77 = class215.field2658.method1567(true);
            int var78 = var77 >> 2;
            int var79 = var77 & 0x3;
            int var80 = class30.field330[var78];
            if (var75 >= 0 && var76 >= 0 && class22.field232 > var75 && class196.field2329 > var76) {
                class332.method2133(var73, 0, class43.field513, var78, var80, 31496, var79, var76, -1, var75);
            }
        } else if (class269.field3478 == 84) {
            int var81 = class215.field2658.method1569(true);
            int var82 = class215.field2658.method1569(true);
            int var83 = class215.field2658.method1583(-128);
            int var84 = (var83 >> 4 & 0x7) + class240.field3159;
            int var85 = (var83 & 0x7) + class283.field3706;
            if (var84 >= 0 && var85 >= 0 && class22.field232 > var84 && class196.field2329 > var85) {
                class270.method1693(var84, var85, class43.field513, arg0 ^ 0x4FF0, new class228(var81, var82));
                class405.method2523(class43.field513, var84, var85, (byte) -27);
            }
        } else if (class269.field3478 == 79) {
            int var86 = class215.field2658.method1563(arg0 ^ 0xFFFFFF82);
            int var87 = ((var86 & 0xF4) >> 4) + class240.field3159 * 2;
            int var88 = (var86 & 0xF) + class283.field3706 * 2;
            int var89 = class215.field2658.method1589(false) + var87;
            int var90 = class215.field2658.method1589(false) + var88;
            int var91 = class215.field2658.method1582(false);
            int var92 = class215.field2658.method1582(false);
            int var93 = class215.field2658.method1587((byte) -102);
            int var94 = class215.field2658.method1589(false);
            int var95 = class215.field2658.method1563(arg0 - 130) * 4;
            int var96 = class215.field2658.method1587((byte) -102);
            int var97 = class215.field2658.method1587((byte) -102);
            int var98 = class215.field2658.method1563(-128);
            if (var98 == 255) {
                var98 = -1;
            }
            int var99 = class215.field2658.method1563(arg0 - 130);
            if (var87 >= 0 && var88 >= 0 && var87 < (class22.field232 * 2) && (class22.field232 * 2) > var88 && var89 >= 0 && var90 >= 0 && class196.field2329 * 2 > var89 && var90 < class196.field2329 * 2 && var93 != 65535) {
                int var100 = var90 * 64;
                int var101 = var88 * 64;
                int var102 = var87 * 64;
                int var103 = var89 * 64;
                if (var91 != 0) {
                    int var105;
                    class204 var107;
                    if (var91 >= 0) {
                        int var104 = var91 - 1;
                        var105 = var104 >> 11 & 0xF;
                        int var106 = var104 & 0x7FF;
                        var107 = class220.field2726[var106];
                    } else {
                        int var108 = -var91 - 1;
                        var105 = var108 >> 11 & 0xF;
                        int var109 = var108 & 0x7FF;
                        if (class429.field5865 == var109) {
                            var107 = class143.field1684;
                        } else {
                            var107 = class212.field2584[var109];
                        }
                    }
                    if (var107 != null) {
                        class437 var110 = var107.method1250(42);
                        if (var110.field6004 != null && var110.field6004[var105] != null) {
                            int var111 = var110.field6004[var105][0];
                            int var112 = var110.field6004[var105][2];
                            int var113 = var107.field2431.method1333(-127);
                            int var114 = class363.field4927[var113];
                            int var115 = class363.field4917[var113];
                            int var116 = var111 * var115 + var112 * var114 >> 15;
                            int var117 = var112 * var115 - var111 * var114 >> 15;
                            var101 += var117;
                            var102 += var116;
                            var94 -= var110.field6004[var105][1];
                        }
                    }
                }
                class38 var119 = new class38(var93, class43.field513, var102, var101, class189.method1170(var101, var102, true, class43.field513) - var94, class106.field1273 + var96, class106.field1273 + var97, var98, var99, var92, var95);
                var119.method243(class106.field1273 + var96, (byte) -107, var103, var100, class189.method1170(var100, var103, true, class43.field513) - var95);
                class180.field2094.method1696(false, new class284(var119));
            }
        } else if (class269.field3478 == 165) {
            int var120 = class215.field2658.method1563(-128);
            int var121 = (var120 >> 4 & 0x7) + class240.field3159;
            int var122 = (var120 & 0x7) + class283.field3706;
            int var123 = var121 + class215.field2658.method1589(false);
            int var124 = class215.field2658.method1589(false) + var122;
            int var125 = class215.field2658.method1582(false);
            int var126 = class215.field2658.method1587((byte) -102);
            int var127 = class215.field2658.method1563(-128) * 4;
            int var128 = class215.field2658.method1563(-128) * 4;
            int var129 = class215.field2658.method1587((byte) -102);
            int var130 = class215.field2658.method1587((byte) -102);
            int var131 = class215.field2658.method1563(arg0 ^ 0xFFFFFF82);
            int var132 = class215.field2658.method1563(arg0 ^ 0xFFFFFF82);
            if (var131 == 255) {
                var131 = -1;
            }
            if (var121 >= 0 && var122 >= 0 && class22.field232 > var121 && var122 < class196.field2329 && var123 >= 0 && var124 >= 0 && var123 < class22.field232 && class196.field2329 > var124 && var126 != 65535) {
                int var133 = var123 * 128 + 64;
                int var134 = var121 * 128 + 64;
                int var135 = var124 * 128 + 64;
                int var136 = var122 * 128 + 64;
                class38 var137 = new class38(var126, class43.field513, var134, var136, class189.method1170(var136, var134, true, class43.field513) - var127, class106.field1273 + var129, var130 + class106.field1273, var131, var132, var125, var128);
                var137.method243(class106.field1273 + var129, (byte) -97, var133, var135, class189.method1170(var135, var133, true, class43.field513) - var128);
                class180.field2094.method1696(false, new class284(var137));
            }
        } else {
            if (class269.field3478 == 162) {
                int var138 = class215.field2658.method1587((byte) -102);
                int var139 = class215.field2658.method1587((byte) -102);
                byte var140 = class215.field2658.method1589(false);
                int var141 = class215.field2658.method1572(arg0 - 5);
                int var142 = class240.field3159 + (var141 >> 4 & 0x7);
                int var143 = class283.field3706 + (var141 & 0x7);
                byte var144 = class215.field2658.method1589(false);
                byte var145 = class215.field2658.method1590((byte) -126);
                int var146 = class215.field2658.method1563(arg0 - 130);
                int var147 = var146 >> 2;
                int var148 = var146 & 0x3;
                int var149 = class215.field2658.method1564(true);
                byte var150 = class215.field2658.method1589(false);
                int var151 = class215.field2658.method1569(true);
                if (!class267.field3454.method726()) {
                    class267.method1671(var150, var143, 0, var147, var140, var139, var138, var148, var142, var145, var149, var144, var151);
                }
            }
            if (class269.field3478 == 35) {
                int var152 = class215.field2658.method1563(-128);
                int var153 = ((var152 & 0x70) >> 4) + class240.field3159;
                int var154 = (var152 & 0x7) + class283.field3706;
                int var155 = class215.field2658.method1587((byte) -102);
                int var156 = class215.field2658.method1563(-128);
                int var157 = class215.field2658.method1587((byte) -102);
                if (var153 >= 0 && var154 >= 0 && class22.field232 > var153 && var154 < class196.field2329) {
                    int var158 = var153 * 128 + 64;
                    int var159 = var154 * 128 + 64;
                    class302 var160 = new class302(var155, var157, class106.field1273, class43.field513, var158, class189.method1170(var159, var158, true, class43.field513) - var156, var159, var153, var153, var154, var154);
                    class201.field2368.method1696(false, new class433(var160));
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)Lpn;", line = 660)
    public final class43 method224(int arg0) {
        field380++;
        class43 var2 = this.field377;
        if (this.field381.field3483 == var2) {
            this.field377 = null;
            return null;
        }
        if (arg0 != -1354376344) {
            this.field377 = null;
        }
        this.field377 = var2.field508;
        return var2;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V", line = 682)
    public static void method225(int arg0) {
        field382 = null;
        field387 = null;
        field386 = null;
        if (arg0 != 44) {
            field386 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V", line = 694)
    public static final void method226(byte arg0) {
        class17.field189 = null;
        class433.field5916 = null;
        class412.field5673 = null;
        class133.field1527 = null;
        class286.field3766 = null;
        class363.field4933 = null;
        if (arg0 != 81) {
            field382 = null;
        }
        field384++;
        class266.field3432 = null;
        class210.field2544 = null;
        class300.field4006 = null;
        class55.field636 = null;
        class383.field5249 = null;
        class333.field4546 = null;
        class270.field3502 = null;
        class195.field2319 = null;
        class12.field156 = null;
        class150.field1756 = null;
        class170.field1992 = null;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V", line = 722)
    public class35() {
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)Lpn;", line = 726)
    public final class43 method227(int arg0) {
        field385++;
        if (arg0 != 1798357390) {
            this.field381 = null;
        }
        class43 var2 = this.field381.field3483.field508;
        if (this.field381.field3483 == var2) {
            this.field377 = null;
            return null;
        } else {
            this.field377 = var2.field508;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 754)
    public static final void method228(int arg0, int arg1, int arg2, Class arg3) {
        class316 var4 = class347.field4722[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class272 var5 = var4.field4256; var5 != null; var5 = var5.field3514) {
            class133 var6 = var5.field3512;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1512 == arg1 && var6.field1518 == arg2) {
                class70.method421(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lbb;)V", line = 785)
    public class35(class270 arg0) {
        this.field381 = arg0;
    }
}
