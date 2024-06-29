import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class204 extends class263 {

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    private int field2972 = 1024;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    private int field2975 = 0;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    private int field2980 = 1024;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    private int field2979 = 819;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
    private int field2984 = 2048;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
    private int field2986 = 1024;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    private int field2973 = 409;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    private int field2977 = 0;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    private int field2988 = 1024;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "[[Z")
    public static boolean[][] field2987;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    private int field2976;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lgn;B)V")
    public static final void method1337(class526 arg0, byte arg1) {
        ++field2985;
        if (class111.field1693 == arg0) {
            byte var2 = class400.field5966.method2714((byte) -56);
            int var3 = class400.field5966.method2715((byte) 103);
            int var4 = var3 >> 2;
            int var5 = var3 & 3;
            int var6 = class400.field5966.method2745(-1);
            byte var7 = class400.field5966.method2764((byte) 117);
            int var8 = class400.field5966.method2730(-1458809016);
            byte var9 = class400.field5966.method2764((byte) 123);
            int var10 = class400.field5966.method2765(57);
            int var11 = class291.field4353 - -((119 & var10) >> 4);
            int var12 = (var10 & 7) + class346.field5331;
            int var13 = class400.field5966.method2719(113738408);
            int var14 = class400.field5966.method2719(113738408);
            byte var15 = class400.field5966.method2729(true);
            if (!class407.field6147.method112()) {
                class317.method1982(var12, var7, var9, var5, var13, class75.field1069, var2, var14, var8, var15, var4, var11, (byte) -91, var6);
            }
        } else if (class526.field7775 == arg0) {
            int var16 = class400.field5966.method2774(32);
            int var17 = class400.field5966.method2730(-1458809016);
            int var18 = class400.field5966.method2752((byte) 67);
            int var19 = (7 & var18 >> 4) + class291.field4353;
            int var20 = class346.field5331 - -(7 & var18);
            int var21 = class400.field5966.method2774(32);
            if (~var19 <= -1 && ~var20 <= -1 && var19 < class50.field640 && ~class448.field6611 < ~var20 && ~class449.field6615 != ~var16) {
                class128.method942(var19, new class233(var21, var17), class75.field1069, var20, -81);
                class235.method1451(var19, var20, class75.field1069, 0);
            }
        } else if (class464.field6748 == arg0) {
            class400.field5966.method2765(59);
            int var22 = class400.field5966.method2765(127);
            int var23 = class291.field4353 - -(var22 >> 4 & 7);
            int var24 = (7 & var22) + class346.field5331;
            int var25 = class400.field5966.method2727((byte) 43);
            int var26 = class400.field5966.method2765(80);
            int var27 = class400.field5966.method2759(1919914864);
            String var28 = class400.field5966.method2770(-20459);
            class328.method2039(-48, class75.field1069, var25, var26, var23, var27, var24, var28);
        } else if (class56.field772 == arg0) {
            int var29 = class400.field5966.method2727((byte) 43);
            int var30 = class400.field5966.method2765(80);
            class119.field1824.method248(var29, 30).method2894(var30, 0);
        } else if (class231.field3249 == arg0) {
            int var31 = class400.field5966.method2752((byte) -126);
            int var32 = (7 & var31 >> 4) + class291.field4353;
            int var33 = (7 & var31) + class346.field5331;
            int var34 = class400.field5966.method2756((byte) -121);
            int var35 = var34 >> 2;
            int var36 = var34 & 3;
            int var37 = class175.field2591[var35];
            if (class153.method1104(-128, class311.field4830) || var32 >= 0 && ~var33 <= -1 && ~class50.field640 < ~var32 && ~var33 > ~class448.field6611) {
                class470.method2784(var37, var35, -1, var32, var33, class75.field1069, 0, var36, (byte) -30, -1);
            }
        } else if (class33.field459 == arg0) {
            int var38 = class400.field5966.method2774(32);
            if (~var38 == -65536) {
                var38 = -1;
            }
            int var39 = class400.field5966.method2752((byte) -124);
            int var40 = ((120 & var39) >> 4) + class291.field4353;
            int var41 = (7 & var39) + class346.field5331;
            int var42 = class400.field5966.method2715((byte) 68);
            int var43 = var42 >> 2;
            int var44 = 3 & var42;
            int var45 = class175.field2591[var43];
            class154.method1107(var38, class75.field1069, var40, var43, var45, var44, false, var41);
        } else if (class311.field4824 == arg0) {
            int var46 = class400.field5966.method2715((byte) 39);
            int var47 = (var46 >> 4 & 7) + class291.field4353;
            int var48 = class346.field5331 - -(7 & var46);
            int var49 = class400.field5966.method2774(32);
            int var50 = class400.field5966.method2774(32);
            if (~var47 <= -1 && ~var48 <= -1 && ~class50.field640 < ~var47 && class448.field6611 > var48) {
                class128.method942(var47, new class233(var49, var50), class75.field1069, var48, -108);
                class235.method1451(var47, var48, class75.field1069, 0);
            }
        } else if (class117.field1759 == arg0) {
            int var51 = class400.field5966.method2765(110);
            int var52 = (15 & var51 >> 4) + class291.field4353 * 2;
            int var53 = (var51 & 15) + class346.field5331 * 2;
            boolean var54 = ~class400.field5966.method2765(67) != -1;
            int var55 = class400.field5966.method2714((byte) -88) + var52;
            int var56 = var53 - -class400.field5966.method2714((byte) -95);
            int var57 = class400.field5966.method2745(-1);
            int var58 = class400.field5966.method2745(-1);
            int var59 = class400.field5966.method2727((byte) 43);
            byte var60 = class400.field5966.method2714((byte) -93);
            int var61 = 4 * class400.field5966.method2765(85);
            int var62 = class400.field5966.method2727((byte) 43);
            int var63 = class400.field5966.method2727((byte) 43);
            int var64 = class400.field5966.method2765(96);
            int var65 = class400.field5966.method2765(107);
            if (var64 == 255) {
                var64 = -1;
            }
            if (var52 >= 0 && ~var53 <= -1 && ~var52 > ~(class50.field640 * 2) && class50.field640 * 2 > var53 && var55 >= 0 && var56 >= 0 && ~var55 > ~(class448.field6611 * 2) && var56 < class448.field6611 * 2 && var59 != 65535) {
                int var66 = var55 * 64;
                int var67 = var53 * 64;
                int var68 = var52 * 64;
                int var69 = var60 << 0;
                int var70 = var61 << 0;
                int var71 = var56 * 64;
                if (~var57 != -1) {
                    int var73;
                    class400 var75;
                    if (var57 < 0) {
                        int var72 = -var57 - 1;
                        var73 = 15 & var72 >> 11;
                        int var74 = 2047 & var72;
                        if (class449.field6615 != var74) {
                            var75 = class83.field1327[var74];
                        } else {
                            var75 = class410.field6198;
                        }
                    } else {
                        int var76 = var57 + -1;
                        var73 = var76 >> 11 & 15;
                        int var77 = var76 & 2047;
                        var75 = class88.field1375[var77];
                    }
                    if (var75 != null) {
                        class192 var78 = var75.method2415(0);
                        if (var78.field2807 != null && var78.field2807[var73] != null) {
                            int var79 = var78.field2807[var73][0];
                            int var80 = var78.field2807[var73][2];
                            int var81 = var75.field5994.method1496((byte) -60);
                            int var82 = class445.field6545[var81];
                            int var83 = class445.field6544[var81];
                            int var84 = var79 * var83 + var80 * var82 >> 15;
                            int var85 = var80 * var83 - var79 * var82 >> 15;
                            var69 -= var78.field2807[var73][1];
                            var68 += var84;
                            var67 += var85;
                        }
                    }
                }
                class55 var87 = new class55(var59, class75.field1069, var68, var67, var69, class86.field1350 + var62, class86.field1350 + var63, var64, var65, var58, var70, var54);
                var87.method404(class50.method373(class75.field1069, 14966, var71, var66) + -var70, var66, (byte) -52, class86.field1350 + var62, var71);
                class216.field3116.method2958(new class312(var87), (byte) 75);
            }
        } else if (class133.field1987 == arg0) {
            int var88 = class400.field5966.method2765(52);
            int var89 = (var88 >> 4 & 15) + class291.field4353 * 2;
            int var90 = (15 & var88) + class346.field5331 * 2;
            boolean var91 = class400.field5966.method2765(104) != 0;
            int var92 = class400.field5966.method2714((byte) -75) + var89;
            int var93 = var90 - -class400.field5966.method2714((byte) -97);
            int var94 = class400.field5966.method2745(-1);
            int var95 = class400.field5966.method2727((byte) 43);
            int var96 = 4 * class400.field5966.method2765(123);
            int var97 = class400.field5966.method2765(70) * 4;
            int var98 = class400.field5966.method2727((byte) 43);
            int var99 = class400.field5966.method2727((byte) 43);
            int var100 = class400.field5966.method2765(52);
            int var101 = class400.field5966.method2765(50);
            if (var100 == 255) {
                var100 = -1;
            }
            if (~var89 <= -1 && ~var90 <= -1 && class50.field640 * 2 > var89 && class50.field640 * 2 > var90 && ~var92 <= -1 && var93 >= 0 && ~(class448.field6611 * 2) < ~var92 && class448.field6611 * 2 > var93 && ~var95 != -65536) {
                int var102 = var89 * 64;
                int var103 = var96 << 0;
                int var104 = var97 << 0;
                int var105 = var93 * 64;
                int var106 = var90 * 64;
                int var107 = var92 * 64;
                class55 var108 = new class55(var95, class75.field1069, var102, var106, var103, var98 - -class86.field1350, class86.field1350 + var99, var100, var101, var94, var104, var91);
                var108.method404(-var104 + class50.method373(class75.field1069, 14966, var105, var107), var107, (byte) -121, class86.field1350 + var98, var105);
                class216.field3116.method2958(new class312(var108), (byte) 97);
            }
        } else if (class375.field5663 == arg0) {
            int var109 = class400.field5966.method2765(123);
            int var110 = ((var109 & 124) >> 4) + class291.field4353;
            int var111 = (var109 & 7) + class346.field5331;
            int var112 = class400.field5966.method2727((byte) 43);
            if (~var112 == -65536) {
                var112 = -1;
            }
            int var113 = class400.field5966.method2765(59);
            int var114 = (255 & var113) >> 4;
            int var115 = var113 & 7;
            int var116 = class400.field5966.method2765(67);
            int var117 = class400.field5966.method2765(89);
            if (var110 >= 0 && ~var111 <= -1 && var110 < class50.field640 && var111 < class448.field6611) {
                int var118 = var114 + 1;
                if (-var118 + var110 <= class410.field6198.field6065[0] && ~(var110 + var118) <= ~class410.field6198.field6065[0] && ~(var111 - var118) >= ~class410.field6198.field6068[0] && ~(var111 + var118) <= ~class410.field6198.field6068[0]) {
                    class179.method1222(var117, (var111 << 8) + (class75.field1069 << 24) + (var110 << 16) + var114, var112, (byte) 115, var115, var116);
                }
            }
        } else if (class497.field7379 == arg0) {
            int var119 = class400.field5966.method2765(83);
            int var120 = (7 & var119 >> 4) + class291.field4353;
            int var121 = class346.field5331 - -(var119 & 7);
            int var122 = class400.field5966.method2727((byte) 43);
            int var123 = class400.field5966.method2727((byte) 43);
            int var124 = class400.field5966.method2727((byte) 43);
            if (class491.field7318 != null && var120 >= 0 && var121 >= 0 && var120 < class50.field640 && class448.field6611 > var121) {
                class449 var125 = (class449) class491.field7318.method3059(107, (long) (var120 | class75.field1069 << 28 | var121 << 14));
                if (var125 != null) {
                    for (class233 var126 = (class233) var125.field6612.method2957(-47); var126 != null; var126 = (class233) var125.field6612.method2947(-106)) {
                        if ((var122 & 32767) == var126.field3272 && ~var126.field3273 == ~var123) {
                            var126.method876((byte) -96);
                            var126.field3273 = var124;
                            class128.method942(var120, var126, class75.field1069, var121, -64);
                            break;
                        }
                    }
                    class235.method1451(var120, var121, class75.field1069, 0);
                }
            }
        } else if (class10.field93 == arg0) {
            int var127 = class400.field5966.method2765(56);
            int var128 = ((118 & var127) >> 4) + class291.field4353;
            int var129 = (var127 & 7) + class346.field5331;
            int var130 = class400.field5966.method2727((byte) 43);
            int var131 = class400.field5966.method2765(65);
            int var132 = class400.field5966.method2727((byte) 43);
            int var133 = class400.field5966.method2765(50);
            if (~var128 <= -1 && ~var129 <= -1 && ~var128 > ~class50.field640 && ~var129 > ~class448.field6611) {
                int var134 = var128 * 128 - -64;
                int var135 = var129 * 128 + 64;
                int var136 = class75.field1069;
                if (~var136 > -4 && class252.method1506(0, var129, var128)) {
                    ++var136;
                }
                class304 var137 = new class304(var130, var132, class86.field1350, class75.field1069, var136, var134, class50.method373(class75.field1069, 14966, var135, var134) - var131, var135, var128, var128, var129, var129, var133);
                class170.field2497.method2958(new class26(var137), (byte) 64);
            }
        } else if (class260.field3886 == arg0) {
            int var138 = class400.field5966.method2727((byte) 43);
            int var139 = class400.field5966.method2756((byte) -60);
            int var140 = (7 & var139 >> 4) + class291.field4353;
            int var141 = (var139 & 7) + class346.field5331;
            if (~var140 <= -1 && ~var141 <= -1 && var140 < class50.field640 && var141 < class448.field6611) {
                class449 var142 = (class449) class491.field7318.method3059(45, (long) (var141 << 14 | class75.field1069 << 28 | var140));
                if (var142 != null) {
                    for (class233 var143 = (class233) var142.field6612.method2957(-49); var143 != null; var143 = (class233) var142.field6612.method2947(-127)) {
                        if (~(var138 & 32767) == ~var143.field3272) {
                            var143.method876((byte) -96);
                            break;
                        }
                    }
                    if (var142.field6612.method2954((byte) 70)) {
                        var142.method876((byte) -96);
                    }
                    class235.method1451(var140, var141, class75.field1069, 0);
                }
            }
        } else if (class36.field498 == arg0) {
            int var144 = class400.field5966.method2765(124);
            boolean var145 = ~(var144 & 128) != -1;
            int var146 = ((var144 & 57) >> 3) + class291.field4353;
            int var147 = class346.field5331 - -(var144 & 7);
            int var148 = class400.field5966.method2714((byte) -90) + var146;
            int var149 = class400.field5966.method2714((byte) -110) + var147;
            int var150 = class400.field5966.method2745(-1);
            int var151 = class400.field5966.method2727((byte) 43);
            int var152 = class400.field5966.method2765(120) * 4;
            int var153 = class400.field5966.method2765(116) * 4;
            int var154 = class400.field5966.method2727((byte) 43);
            int var155 = class400.field5966.method2727((byte) 43);
            int var156 = class400.field5966.method2765(89);
            int var157 = class400.field5966.method2765(51);
            if (~var156 == -256) {
                var156 = -1;
            }
            if (~var146 <= -1 && var147 >= 0 && ~var146 > ~class50.field640 && class448.field6611 > var147 && ~var148 <= -1 && var149 >= 0 && class50.field640 > var148 && class448.field6611 > var149 && ~var151 != -65536) {
                int var158 = var146 * 128 + 64;
                int var159 = var152 << 0;
                int var160 = var147 * 128 + 64;
                int var161 = var149 * 128 + 64;
                int var162 = var148 * 128 + 64;
                int var163 = var153 << 0;
                class55 var164 = new class55(var151, class75.field1069, var158, var160, var159, var154 - -class86.field1350, class86.field1350 + var155, var156, var157, var150, var163, var145);
                var164.method404(class50.method373(class75.field1069, 14966, var161, var162) + -var163, var162, (byte) -68, class86.field1350 + var154, var161);
                class216.field3116.method2958(new class312(var164), (byte) 64);
            }
        } else if (class187.field2753 != arg0) {
            class488.method2913(0, (Throwable) null, "T3 - " + arg0);
            class457.method2654(false, 117);
            int var173 = -86 % ((81 - arg1) / 39);
        } else {
            int var165 = class400.field5966.method2756((byte) 75);
            int var166 = var165 >> 2;
            int var167 = 3 & var165;
            int var168 = class175.field2591[var166];
            int var169 = class400.field5966.method2727((byte) 43);
            int var170 = class400.field5966.method2752((byte) 7);
            int var171 = class291.field4353 - -((124 & var170) >> 4);
            int var172 = (var170 & 7) + class346.field5331;
            if (class153.method1104(-128, class311.field4830) || var171 >= 0 && ~var172 <= -1 && ~class50.field640 < ~var171 && ~var172 > ~class448.field6611) {
                class470.method2784(var168, var166, var169, var171, var172, class75.field1069, 0, var167, (byte) -88, -1);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[S)[S")
    public static final short[] method1338(int arg0, short[] arg1) {
        ++field2974;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class442.method2592(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILya;)V")
    public static final void method1339(int arg0, class11 arg1) {
        ++field2971;
        if (arg0 != 0) {
            field2987 = null;
        }
        if (!class495.field7350) {
            class335.method2061(Integer.MAX_VALUE, arg1);
        } else {
            class34.method290((byte) -96, arg1);
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
    public final void method748(byte arg0) {
        if (arg0 != 110) {
            this.field2984 = 5;
        }
        ++field2981;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field2980 = arg2.method2727((byte) 43);
                                        }
                                    } else {
                                        this.field2972 = arg2.method2727((byte) 43);
                                    }
                                } else {
                                    this.field2977 = arg2.method2765(56);
                                }
                            } else {
                                this.field2988 = arg2.method2727((byte) 43);
                            }
                        } else {
                            this.field2979 = arg2.method2727((byte) 43);
                        }
                    } else {
                        this.field2973 = arg2.method2727((byte) 43);
                    }
                } else {
                    this.field2984 = arg2.method2727((byte) 43);
                }
            } else {
                this.field2986 = arg2.method2727((byte) 43);
            }
        } else {
            this.field2975 = arg2.method2765(103);
        }
        if (!arg1) {
            this.field2984 = -119;
        }
        ++field2978;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field2983;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[][] var4 = super.field3917.method42(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class367.field5597 * this.field2986 >> 12;
            int var15 = class367.field5597 * this.field2984 >> 12;
            int var16 = class372.field5635 * this.field2973 >> 12;
            int var17 = class372.field5635 * this.field2979 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field2976 = class367.field5597 / 8 * this.field2988 >> 12;
                int var18 = class367.field5597 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2975);
                while (true) {
                    while (true) {
                        int var22 = var14 + class363.method2166(22591, var15 - var14, var21);
                        int var23 = class363.method2166(22591, -var16 + var17, var21) + var16;
                        int var24 = var8 + var22;
                        if (~var24 < ~class367.field5597) {
                            var24 = class367.field5597;
                            var22 = class367.field5597 - var8;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class367.field5597;
                            }
                            if (var29 > class367.field5597) {
                                var29 -= class367.field5597;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class367.field5597;
                                        }
                                        if (class367.field5597 < var31) {
                                            var31 -= class367.field5597;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var29 > var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class367.field5597;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1341(var4, var39 - var38, 79, var7 + var38, var21, var35, -var35 + var25);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var26 >= var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~(var23 + var25) < ~class372.field5635) {
                            var23 = -var25 + class372.field5635;
                        } else {
                            var10 = false;
                        }
                        if (~class367.field5597 == ~var24) {
                            this.method1341(var4, var22, 48, var6 + var8, var21, var25, var23);
                            if (var10) {
                                return arg1 < 40 ? null : var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class363.method2166(22591, class367.field5597, var21);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class367.field5597 + var5;
                            }
                            var9 = 0;
                            if (var43 > class367.field5597) {
                                var43 -= class367.field5597;
                            }
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && ~var43 >= ~var44[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[1] = var24;
                            var45[0] = var8;
                            var45[2] = var23 + var25;
                            this.method1341(var4, var22, 66, var8 - -var6, var21, var25, var23);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return arg1 < 40 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
    public static void method1340(int arg0) {
        if (arg0 != 0) {
            method1339(-10, (class11) null);
        }
        field2987 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([[IIIILjava/util/Random;II)V")
    private final void method1341(int[][] arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int arg6) {
        ++field2982;
        int var8 = this.field2980 <= 0 ? 4096 : -class363.method2166(22591, this.field2980, arg4) + 4096;
        int var9 = this.field2976 * this.field2972 >> 12;
        if (arg2 < 27) {
            this.field2986 = 88;
        }
        int var10 = this.field2976 + -(~var9 < -1 ? class363.method2166(22591, var9, arg4) : 0);
        if (class367.field5597 <= arg3) {
            arg3 -= class367.field5597;
        }
        if (var10 <= 0) {
            if (~class367.field5597 <= ~(arg1 + arg3)) {
                for (int var11 = 0; ~arg6 < ~var11; ++var11) {
                    class442.method2591(arg0[arg5 + var11], arg3, arg1, var8);
                }
            } else {
                int var12 = -arg3 + class367.field5597;
                for (int var13 = 0; ~var13 > ~arg6; ++var13) {
                    int[] var14 = arg0[arg5 + var13];
                    class442.method2591(var14, arg3, var12, var8);
                    class442.method2591(var14, 0, arg1 - var12, var8);
                }
            }
        } else if (~arg6 < -1 && ~arg1 < -1) {
            int var15 = arg1 / 2;
            int var16 = arg6 / 2;
            int var17 = var10 > var15 ? var15 : var10;
            int var18 = ~var16 <= ~var10 ? var10 : var16;
            int var19 = arg3 + var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; ~arg6 < ~var21; ++var21) {
                int[] var22 = arg0[arg5 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field2977 == -1) {
                        for (int var24 = 0; var17 > var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class140.method1023(arg3 - -var24, class83.field1326)] = var22[class140.method1023(class83.field1326, arg3 - 1 + -var24 + arg1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class140.method1023(class83.field1326, arg3 + var26)] = var22[class140.method1023(-var26 + arg1 + arg3 + -1, class83.field1326)] = var23 > var28 ? var28 : var23;
                        }
                    }
                    if (var19 + var20 > class367.field5597) {
                        int var27 = -var19 + class367.field5597;
                        class442.method2591(var22, var19, var27, var23);
                        class442.method2591(var22, 0, -var27 + var20, var23);
                    } else {
                        class442.method2591(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg6;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field2977 == 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class140.method1023(arg3 + var31, class83.field1326)] = var22[class140.method1023(arg3 - var31 + arg1 + -1, class83.field1326)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class140.method1023(arg3 - -var33, class83.field1326)] = var22[class140.method1023(class83.field1326, arg1 + arg3 + -var33 - 1)] = ~var30 >= ~var35 ? var30 : var35;
                            }
                        }
                        if (class367.field5597 < var19 + var20) {
                            int var34 = -var19 + class367.field5597;
                            class442.method2591(var22, var19, var34, var30);
                            class442.method2591(var22, 0, -var34 + var20, var30);
                        } else {
                            class442.method2591(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class140.method1023(class83.field1326, arg3 + var36)] = var22[class140.method1023(class83.field1326, arg1 + arg3 - (var36 - -1))] = var8 * var36 / var17;
                        }
                        if (class367.field5597 >= var19 + var20) {
                            class442.method2591(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class367.field5597;
                            class442.method2591(var22, var19, var37, var8);
                            class442.method2591(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    static {
        new class347("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field2987 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
    }
}
