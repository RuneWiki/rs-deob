import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class80 {

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "F")
    public float field1030 = 0.25F;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "F")
    public float field1032 = 1.0F;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "F")
    public float field1023 = 1.0F;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "F")
    public float field1018;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "F")
    public float field1016;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "F")
    public float field1020;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lib;")
    public class98 field1035;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Z")
    public static boolean field1017 = true;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1019 = "Connecting to update server";

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "[I")
    public static int[] field1039 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 13)
    public static void method563(byte arg0) {
        field1039 = null;
        field1019 = null;
        if (arg0 != -64) {
            method570((class140) null, -113, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 26)
    public static final void method564(byte arg0) {
        if (class179.field2446 == 2) {
            if (class73.field971 == class20.field231 && class302.field4434 == class16.field204) {
                class179.field2446 = 0;
                if (class226.field3257 && class143.field1991[81] && class66.field853 > 2) {
                    class286.method1948((byte) 96, class66.field853 - 2);
                } else {
                    class286.method1948((byte) 96, class66.field853 - 1);
                }
            }
        } else if (class73.field971 == class140.field1950 && class305.field4465 == class302.field4434) {
            class179.field2446 = 0;
            if (class226.field3257 && class143.field1991[81] && class66.field853 > 2) {
                class286.method1948((byte) 96, class66.field853 - 2);
            } else {
                class286.method1948((byte) 96, class66.field853 - 1);
            }
        } else {
            class179.field2446 = 2;
            class16.field204 = class305.field4465;
            class20.field231 = class140.field1950;
        }
        int var1 = 14 / ((arg0 - 18) / 48);
        field1038++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfh;Lfh;Lfh;I)V", line = 79)
    public static final void method565(class140 arg0, class140 arg1, class140 arg2, int arg3) {
        class176.field2407 = arg0;
        if (arg3 == 31779) {
            class292.field4254 = arg2;
            field1021++;
            class277.field3973 = arg1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfd;I)V", line = 100)
    public final void method566(class299 arg0, int arg1) {
        this.field1023 = (float) (arg0.method2096((byte) -122) * 8) / 255.0F;
        field1029++;
        if (arg1 != -27409) {
            method565((class140) null, (class140) null, (class140) null, -51);
        }
        this.field1030 = (float) (arg0.method2096((byte) -122) * 8) / 255.0F;
        this.field1032 = (float) (arg0.method2096((byte) -122) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 770)
    public class80() {
        this.field1024 = class41.field514;
        this.field1018 = 1.2F;
        this.field1022 = -50;
        this.field1025 = -50;
        this.field1036 = 0;
        this.field1016 = 1.1523438F;
        this.field1027 = -60;
        this.field1020 = 0.69921875F;
        this.field1026 = class41.field516;
        if (class196.field2708 != null) {
            this.field1035 = class98.method708(class196.field2708[0], class196.field2708[1], class196.field2708[2], class196.field2708[3], class196.field2708[4], class196.field2708[5]);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lfd;)V", line = 788)
    public class80(class299 arg0) {
        int var2 = arg0.method2096((byte) -122);
        if ((var2 & 0x1) == 0) {
            this.field1024 = class41.field514;
        } else {
            this.field1024 = arg0.method2062(-25795);
        }
        if ((var2 & 0x2) == 0) {
            this.field1016 = 1.1523438F;
        } else {
            this.field1016 = (float) arg0.method2083((byte) -55) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1020 = 0.69921875F;
        } else {
            this.field1020 = (float) arg0.method2083((byte) -120) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1018 = 1.2F;
        } else {
            this.field1018 = (float) arg0.method2083((byte) -37) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1022 = -50;
            this.field1025 = -50;
            this.field1027 = -60;
        } else {
            this.field1025 = arg0.method2043(true);
            this.field1027 = arg0.method2043(true);
            this.field1022 = arg0.method2043(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field1026 = class41.field516;
        } else {
            this.field1026 = arg0.method2062(-25795);
        }
        if ((var2 & 0x40) == 0) {
            this.field1036 = 0;
        } else {
            this.field1036 = arg0.method2083((byte) -78);
        }
        if ((var2 & 0x80) != 0) {
            this.field1035 = class98.method708(arg0.method2083((byte) -63), arg0.method2083((byte) -31), arg0.method2083((byte) -47), arg0.method2083((byte) -108), arg0.method2083((byte) -59), arg0.method2083((byte) -19));
        } else if (class196.field2708 != null) {
            this.field1035 = class98.method708(class196.field2708[0], class196.field2708[1], class196.field2708[2], class196.field2708[3], class196.field2708[4], class196.field2708[5]);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfh;ILfh;Lfh;Lfh;)V", line = 126)
    public static final void method567(class140 arg0, int arg1, class140 arg2, class140 arg3, class140 arg4) {
        class14.field157 = arg0;
        if (arg1 != 5) {
            field1028 = -56;
        }
        class280.field3993 = arg4;
        class284.field4050 = arg3;
        field1034++;
        class251.field3689 = arg2;
        class26.field308 = new class333[class284.field4050.method1068(-124)][];
        class44.field548 = new boolean[class284.field4050.method1068(-97)];
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I", line = 142)
    public static int method568(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V", line = 150)
    public static final void method569(byte arg0) {
        field1037++;
        if (class154.field2147 == 17) {
            int var138 = class240.field3490.method2096((byte) -122);
            int var139 = class245.field3565 * 2 + ((var138 & 0xFD) >> 4);
            int var140 = (var138 & 0xF) + class294.field4277 * 2;
            int var141 = var139 + class240.field3490.method2104(119);
            int var142 = class240.field3490.method2104(127) + var140;
            int var143 = class240.field3490.method2043(true);
            int var144 = class240.field3490.method2083((byte) -126);
            int var145 = class240.field3490.method2096((byte) -122) * 4;
            int var146 = class240.field3490.method2096((byte) -122) * 4;
            int var147 = class240.field3490.method2083((byte) -72);
            int var148 = class240.field3490.method2083((byte) -76);
            int var149 = class240.field3490.method2096((byte) -122);
            if (var149 == 255) {
                var149 = -1;
            }
            int var150 = class240.field3490.method2096((byte) -122);
            if (var139 >= 0 && var140 >= 0 && var139 < 208 && var140 < 208 && var141 >= 0 && var142 >= 0 && var141 < 208 && var142 < 208 && var144 != 65535) {
                int var151 = var139 * 64;
                int var152 = var140 * 64;
                int var153 = var141 * 64;
                class348 var154 = new class348(var144, class56.field724, var151, var152, class271.method1847(var152, true, var151, class56.field724) - var145, var147 - -class313.field4603, class313.field4603 + var148, var149, var150, var143, var146);
                int var155 = var142 * 64;
                var154.method2416(-102, class271.method1847(var155, true, var153, class56.field724) - var146, var153, class313.field4603 + var147, var155);
                class254.field3705.method415((byte) 78, new class59(var154));
            }
        } else if (class154.field2147 == 114) {
            int var1 = class240.field3490.method2096((byte) -122);
            int var2 = (var1 >> 4 & 0x7) + class245.field3565;
            int var3 = (var1 & 0x7) + class294.field4277;
            int var4 = class240.field3490.method2083((byte) -85);
            int var5 = class240.field3490.method2083((byte) -96);
            int var6 = class240.field3490.method2083((byte) -15);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class54 var7 = class20.field221[class56.field724][var2][var3];
                if (var7 != null) {
                    for (class248 var8 = (class248) var7.method413(1253231568); var8 != null; var8 = (class248) var7.method419(16)) {
                        class133 var9 = var8.field3610;
                        if ((var4 & 0x7FFF) == var9.field1813 && var9.field1811 == var5) {
                            var9.field1811 = var6;
                            break;
                        }
                    }
                    class273.method1855(var2, var3, -14327);
                }
            }
        } else {
            if (class154.field2147 == 133) {
                int var10 = class240.field3490.method2093(-96);
                int var11 = class240.field3490.method2090(-128);
                int var12 = (var11 & 0x7) + class294.field4277;
                int var13 = (var11 >> 4 & 0x7) + class245.field3565;
                int var14 = class240.field3490.method2055(-66);
                int var15 = class240.field3490.method2096((byte) -122);
                int var16 = var15 >> 2;
                byte var17 = class240.field3490.method2075((byte) -120);
                int var18 = var15 & 0x3;
                byte var19 = class240.field3490.method2082(-96);
                byte var20 = class240.field3490.method2104(107);
                byte var21 = class240.field3490.method2082(-113);
                int var22 = class240.field3490.method2055(-66);
                int var23 = class240.field3490.method2083((byte) -128);
                if (!class47.field623) {
                    class67.method485(var17, var10, var14, var22, var16, var19, var20, 101, var23, var18, var12, var21, var13);
                }
            }
            if (class154.field2147 == 111) {
                int var105 = class240.field3490.method2096((byte) -122);
                int var106 = (var105 >> 4 & 0xF) + class245.field3565 * 2;
                int var107 = (var105 & 0xF) + class294.field4277 * 2;
                int var108 = class240.field3490.method2104(115) + var106;
                int var109 = var107 + class240.field3490.method2104(98);
                int var110 = class240.field3490.method2043(true);
                int var111 = class240.field3490.method2043(true);
                int var112 = class240.field3490.method2083((byte) -77);
                int var113 = class240.field3490.method2104(97);
                int var114 = class240.field3490.method2096((byte) -122) * 4;
                int var115 = class240.field3490.method2083((byte) -86);
                int var116 = class240.field3490.method2083((byte) -49);
                int var117 = class240.field3490.method2096((byte) -122);
                if (var117 == 255) {
                    var117 = -1;
                }
                int var118 = class240.field3490.method2096((byte) -122);
                if (var106 >= 0 && var107 >= 0 && var106 < 208 && var107 < 208 && var108 >= 0 && var109 >= 0 && var108 < 208 && var109 < 208 && var112 != 65535) {
                    int var119 = var109 * 64;
                    int var120 = var108 * 64;
                    int var121 = var106 * 64;
                    int var122 = var107 * 64;
                    if (var110 != 0) {
                        int var124;
                        class331 var126;
                        if (var110 >= 0) {
                            int var123 = var110 - 1;
                            var124 = (var123 & 0x782F) >> 11;
                            int var125 = var123 & 0x7FF;
                            var126 = class251.field3688[var125];
                        } else {
                            int var127 = -var110 - 1;
                            var124 = (var127 & 0x7C23) >> 11;
                            int var128 = var127 & 0x7FF;
                            if (class103.field1333 == var128) {
                                var126 = class359.field5616;
                            } else {
                                var126 = class311.field4574[var128];
                            }
                        }
                        if (var126 != null) {
                            class91 var129 = var126.method2300((byte) 76);
                            if (var129.field1177 != null && var129.field1177[var124] != null) {
                                var113 -= var129.field1177[var124][1];
                                int var130 = var129.field1177[var124][0];
                                int var131 = class350.field5476[var126.field4926];
                                int var132 = var129.field1177[var124][2];
                                int var133 = class350.field5474[var126.field4926];
                                int var134 = var130 * var133 + var131 * var132 >> 16;
                                int var135 = var132 * var133 - (var130 * var131) >> 16;
                                var122 += var135;
                                var121 += var134;
                            }
                        }
                    }
                    class348 var137 = new class348(var112, class56.field724, var121, var122, class271.method1847(var122, true, var121, class56.field724) - var113, var115 - -class313.field4603, class313.field4603 + var116, var117, var118, var111, var114);
                    var137.method2416(-10, class271.method1847(var119, true, var120, class56.field724) - var114, var120, class313.field4603 + var115, var119);
                    class254.field3705.method415((byte) -106, new class59(var137));
                }
            } else if (class154.field2147 == 158) {
                int var24 = class240.field3490.method2096((byte) -122);
                int var25 = ((var24 & 0x77) >> 4) + class245.field3565;
                int var26 = (var24 & 0x7) + class294.field4277;
                int var27 = class240.field3490.method2083((byte) -52);
                int var28 = class240.field3490.method2096((byte) -122);
                int var29 = class240.field3490.method2083((byte) -25);
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    int var30 = var26 * 128 + 64;
                    int var31 = var25 * 128 + 64;
                    class347 var32 = new class347(var27, class56.field724, var31, var30, class271.method1847(var30, true, var31, class56.field724) - var28, var29, class313.field4603);
                    class95.field1233.method415((byte) -114, new class226(var32));
                }
            } else if (class154.field2147 == 179) {
                int var33 = class240.field3490.method2083((byte) -81);
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var34 = class240.field3490.method2072(-94);
                int var35 = var34 >> 2;
                int var36 = var34 & 0x3;
                int var37 = class8.field90[var35];
                int var38 = class240.field3490.method2096((byte) -122);
                int var39 = (var38 & 0x7) + class294.field4277;
                int var40 = ((var38 & 0x7F) >> 4) + class245.field3565;
                class45.method322(var33, var40, (byte) -73, class56.field724, var39, var37, var36, var35);
            } else if (class154.field2147 == 131) {
                int var41 = class240.field3490.method2072(-103);
                int var42 = var41 >> 2;
                int var43 = class8.field90[var42];
                int var44 = var41 & 0x3;
                int var45 = class240.field3490.method2102((byte) -99);
                int var46 = class240.field3490.method2096((byte) -122);
                int var47 = (var46 & 0x7) + class294.field4277;
                int var48 = (var46 >> 4 & 0x7) + class245.field3565;
                if (var48 >= 0 && var47 >= 0 && var48 < 104 && var47 < 104) {
                    class139.method1056(var45, class56.field724, var44, var48, -1, var47, (byte) 20, var42, var43, 0);
                }
            } else if (class154.field2147 == 115) {
                int var49 = class240.field3490.method2083((byte) -89);
                int var50 = class240.field3490.method2096((byte) -122);
                class345.method2392(var49, 0).method1593(var50, 23428);
            } else if (class154.field2147 == 232) {
                int var51 = class240.field3490.method2056(93);
                int var52 = (var51 & 0x7) + class294.field4277;
                int var53 = (var51 >> 4 & 0x7) + class245.field3565;
                int var54 = class240.field3490.method2096((byte) -122);
                int var55 = var54 >> 2;
                int var56 = class8.field90[var55];
                int var57 = var54 & 0x3;
                if (var53 >= 0 && var52 >= 0 && var53 < 104 && var52 < 104) {
                    class139.method1056(-1, class56.field724, var57, var53, -1, var52, (byte) -97, var55, var56, 0);
                }
            } else if (class154.field2147 == 105) {
                int var87 = class240.field3490.method2096((byte) -122);
                int var88 = (var87 >> 4 & 0x7) + class245.field3565;
                int var89 = (var87 & 0x7) + class294.field4277;
                int var90 = class240.field3490.method2104(116) + var88;
                int var91 = class240.field3490.method2104(100) + var89;
                int var92 = class240.field3490.method2043(true);
                int var93 = class240.field3490.method2083((byte) -26);
                int var94 = class240.field3490.method2096((byte) -122) * 4;
                int var95 = class240.field3490.method2096((byte) -122) * 4;
                int var96 = class240.field3490.method2083((byte) -49);
                int var97 = class240.field3490.method2083((byte) -119);
                int var98 = class240.field3490.method2096((byte) -122);
                int var99 = class240.field3490.method2096((byte) -122);
                if (var98 == 255) {
                    var98 = -1;
                }
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104 && var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var93 != 65535) {
                    int var100 = var89 * 128 + 64;
                    int var101 = var90 * 128 + 64;
                    int var102 = var91 * 128 + 64;
                    int var103 = var88 * 128 + 64;
                    class348 var104 = new class348(var93, class56.field724, var103, var100, class271.method1847(var100, true, var103, class56.field724) - var94, class313.field4603 + var96, var97 + class313.field4603, var98, var99, var92, var95);
                    var104.method2416(-26, class271.method1847(var102, true, var101, class56.field724) - var95, var101, class313.field4603 + var96, var102);
                    class254.field3705.method415((byte) -91, new class59(var104));
                }
            } else if (class154.field2147 == 120) {
                int var58 = class240.field3490.method2072(-92);
                int var59 = class245.field3565 + ((var58 & 0x73) >> 4);
                int var60 = (var58 & 0x7) + class294.field4277;
                int var61 = class240.field3490.method2097((byte) 120);
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    class54 var62 = class20.field221[class56.field724][var59][var60];
                    if (var62 != null) {
                        for (class248 var63 = (class248) var62.method413(1253231568); var63 != null; var63 = (class248) var62.method419(20)) {
                            if ((var61 & 0x7FFF) == var63.field3610.field1813) {
                                var63.method179((byte) 51);
                                break;
                            }
                        }
                        if (var62.method413(1253231568) == null) {
                            class20.field221[class56.field724][var59][var60] = null;
                        }
                        class273.method1855(var59, var60, -14327);
                    }
                }
            } else if (class154.field2147 == 60) {
                int var81 = class240.field3490.method2090(-128);
                int var82 = (var81 & 0x7) + class294.field4277;
                int var83 = (var81 >> 4 & 0x7) + class245.field3565;
                int var84 = class240.field3490.method2102((byte) 116);
                int var85 = class240.field3490.method2097((byte) 120);
                if (var83 >= 0 && var82 >= 0 && var83 < 104 && var82 < 104) {
                    class133 var86 = new class133();
                    var86.field1811 = var85;
                    var86.field1813 = var84;
                    if (class20.field221[class56.field724][var83][var82] == null) {
                        class20.field221[class56.field724][var83][var82] = new class54();
                    }
                    class20.field221[class56.field724][var83][var82].method415((byte) -13, new class248(var86));
                    class273.method1855(var83, var82, -14327);
                }
            } else if (class154.field2147 == 144) {
                int var64 = class240.field3490.method2096((byte) -122);
                int var65 = class294.field4277 + (var64 & 0x7);
                int var66 = class245.field3565 + (var64 >> 4 & 0x7);
                int var67 = class240.field3490.method2083((byte) -106);
                if (var67 == 65535) {
                    var67 = -1;
                }
                int var68 = class240.field3490.method2096((byte) -122);
                int var69 = var68 >> 4 & 0xF;
                int var70 = var68 & 0x7;
                int var71 = class240.field3490.method2096((byte) -122);
                int var72 = class240.field3490.method2096((byte) -122);
                if (var66 >= 0 && var65 >= 0 && var66 < 104 && var65 < 104) {
                    int var73 = var69 + 1;
                    if (var66 - var73 <= class359.field5616.field4842[0] && class359.field5616.field4842[0] <= (var66 + var73) && (var65 - var73) <= class359.field5616.field4936[0] && var65 + var73 >= class359.field5616.field4936[0] && class204.field2843 != 0 && var70 > 0 && class274.field3921 < 50 && var67 != -1) {
                        class237.field3434[class274.field3921] = var67;
                        class219.field3105[class274.field3921] = var70;
                        class319.field4697[class274.field3921] = var71;
                        class316.field4664[class274.field3921] = null;
                        class92.field1195[class274.field3921] = (var66 << 16) + (var65 << 8) + var69;
                        class254.field3701[class274.field3921] = var72;
                        class274.field3921++;
                    }
                }
            } else if (class154.field2147 == 47) {
                int var74 = class240.field3490.method2055(-66);
                int var75 = class240.field3490.method2083((byte) -19);
                int var76 = class240.field3490.method2083((byte) -89);
                int var77 = class240.field3490.method2090(-128);
                int var78 = ((var77 & 0x7A) >> 4) + class245.field3565;
                int var79 = (var77 & 0x7) + class294.field4277;
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && class103.field1333 != var75) {
                    class133 var80 = new class133();
                    var80.field1811 = var76;
                    var80.field1813 = var74;
                    if (class20.field221[class56.field724][var78][var79] == null) {
                        class20.field221[class56.field724][var78][var79] = new class54();
                    }
                    class20.field221[class56.field724][var78][var79].method415((byte) -121, new class248(var80));
                    class273.method1855(var78, var79, -14327);
                }
            } else if (arg0 < 34) {
                field1031 = -87;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfh;IB)[Lfe;", line = 746)
    public static final class153[] method570(class140 arg0, int arg1, byte arg2) {
        field1033++;
        if (class362.method2524(arg0, -5, arg1)) {
            int var3 = -28 % ((48 - arg2) / 51);
            return class88.method642(118);
        } else {
            return null;
        }
    }
}
