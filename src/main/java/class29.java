import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 {

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field348 = 64;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public int field346 = 1;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Z")
    public boolean field343 = false;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
    public boolean field352 = false;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field354 = 2;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public int field355 = -1;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public int field350 = 64;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lwm;III)V", line = 5)
    private final void method178(class403 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field355 = arg0.method2338(0);
            if (this.field355 == 65535) {
                this.field355 = -1;
            }
        } else if (arg3 == 2) {
            this.field350 = arg0.method2338(0) + 1;
            this.field348 = arg0.method2338(0) + 1;
        } else if (arg3 == 3) {
            arg0.method2359(71);
        } else if (arg3 == 4) {
            this.field354 = arg0.method2357((byte) 119);
        } else if (arg3 == 5) {
            this.field346 = arg0.method2357((byte) 125);
        } else if (arg3 == 6) {
            this.field352 = true;
        } else if (arg3 == 7) {
            this.field343 = true;
        }
        field347++;
        if (arg1 > -14) {
            this.field354 = -67;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILwm;)V", line = 59)
    public final void method179(int arg0, int arg1, class403 arg2) {
        while (true) {
            int var4 = arg2.method2357((byte) 113);
            if (var4 == 0) {
                field344++;
                if (arg1 != 1) {
                    this.method179(-1, -93, null);
                    return;
                }
                return;
            }
            this.method178(arg2, -89, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ldu;I)V", line = 80)
    public static final void method180(class242 arg0, int arg1) {
        field342++;
        if (class496.field7023 == arg0) {
            int var2 = class264.field3874.method2326(1789029408);
            int var3 = (var2 >> 4 & 0x7) + class340.field4927;
            int var4 = (var2 & 0x7) + class285.field4172;
            int var5 = class264.field3874.method2324(-1033632760);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class264.field3874.method2370((byte) 41);
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = class107.field1452[var7];
            class48.method281(var3, var8, var4, var7, class430.field6069, var5, var9, false);
        } else if (arg1 < -75) {
            if (class485.field6765 == arg0) {
                int var10 = class264.field3874.method2338(0);
                int var11 = class264.field3874.method2357((byte) 125);
                class377.field5338.method1901(50, var10).method1707((byte) 29, var11);
            } else if (class241.field3504 == arg0) {
                int var12 = class264.field3874.method2326(1789029408);
                int var13 = class340.field4927 + ((var12 & 0x74) >> 4);
                int var14 = (var12 & 0x7) + class285.field4172;
                int var15 = class264.field3874.method2370((byte) 41);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = class107.field1452[var16];
                int var19 = class264.field3874.method2324(-1033632760);
                if (class390.method2261(class279.field4128, (byte) 108) || var13 >= 0 && var14 >= 0 && var13 < class43.field494 && class500.field7068 > var14) {
                    class383.method2225(class430.field6069, var17, (byte) -75, var16, var14, var19, var13, var18, 0, -1);
                }
            } else if (class334.field4847 == arg0) {
                int var20 = class264.field3874.method2357((byte) 112);
                int var21 = class285.field4172 + (var20 & 0x7);
                int var22 = class367.field5241 + var21;
                int var23 = class340.field4927 + ((var20 & 0x74) >> 4);
                int var24 = class441.field6171 + var23;
                int var25 = class264.field3874.method2338(0);
                int var26 = class264.field3874.method2338(0);
                int var27 = class264.field3874.method2338(0);
                if (class62.field773 != null) {
                    class176 var28 = (class176) class62.field773.method2405((long) (class430.field6069 << 28 | var22 << 14 | var24), -79);
                    if (var28 != null) {
                        for (class25 var29 = (class25) var28.field2531.method2655(15152); var29 != null; var29 = (class25) var28.field2531.method2660((byte) 67)) {
                            if ((var25 & 0x7FFF) == var29.field309 && var29.field311 == var26) {
                                var29.method2891(-123);
                                var29.field311 = var27;
                                class171.method1069(var24, var29, (byte) 125, var22, class430.field6069);
                                break;
                            }
                        }
                        if (var23 >= 0 && var21 >= 0 && var23 < class43.field494 && var21 < class500.field7068) {
                            class195.method1232(var23, class430.field6069, var21, 4915);
                        }
                    }
                }
            } else if (class217.field3149 == arg0) {
                int var30 = class264.field3874.method2324(-1033632760);
                int var31 = class264.field3874.method2370((byte) 41);
                int var32 = class285.field4172 + (var31 & 0x7);
                int var33 = class367.field5241 + var32;
                int var34 = ((var31 & 0x7C) >> 4) + class340.field4927;
                int var35 = class441.field6171 + var34;
                class176 var36 = (class176) class62.field773.method2405((long) (var33 << 14 | class430.field6069 << 28 | var35), -92);
                if (var36 != null) {
                    for (class25 var37 = (class25) var36.field2531.method2655(15152); var37 != null; var37 = (class25) var36.field2531.method2660((byte) 67)) {
                        if ((var30 & 0x7FFF) == var37.field309) {
                            var37.method2891(-126);
                            break;
                        }
                    }
                    if (var36.field2531.method2661(-118)) {
                        var36.method2891(36);
                    }
                    if (var34 >= 0 && var32 >= 0 && var34 < class43.field494 && var32 < class500.field7068) {
                        class195.method1232(var34, class430.field6069, var32, 4915);
                    }
                }
            } else if (class58.field730 == arg0) {
                int var38 = class264.field3874.method2357((byte) 104);
                int var39 = ((var38 & 0xF7) >> 4) + class340.field4927 * 2;
                int var40 = (var38 & 0xF) + class285.field4172 * 2;
                boolean var41 = class264.field3874.method2357((byte) 114) != 0;
                int var42 = class264.field3874.method2359(-106) + var39;
                int var43 = var40 + class264.field3874.method2359(-102);
                int var44 = class264.field3874.method2371(7162);
                int var45 = class264.field3874.method2338(0);
                int var46 = class264.field3874.method2357((byte) 116) * 4;
                int var47 = class264.field3874.method2357((byte) 108) * 4;
                int var48 = class264.field3874.method2338(0);
                int var49 = class264.field3874.method2338(0);
                int var50 = class264.field3874.method2357((byte) 118);
                int var51 = class264.field3874.method2338(0);
                if (var50 == 255) {
                    var50 = -1;
                }
                if (var39 >= 0 && var40 >= 0 && class43.field494 * 2 > var39 && class43.field494 * 2 > var40 && var42 >= 0 && var43 >= 0 && var42 < class500.field7068 * 2 && (class500.field7068 * 2) > var43 && var45 != 65535) {
                    int var52 = var51 << 0;
                    int var53 = var39 * 64;
                    int var54 = var43 * 64;
                    int var55 = var46 << 0;
                    int var56 = var42 * 64;
                    int var57 = var40 * 64;
                    int var58 = var47 << 0;
                    class143 var59 = new class143(var45, class430.field6069, var53, var57, var55, var48 + class390.field5481, class390.field5481 + var49, var50, var52, var44, var58, var41);
                    var59.method888(54, class390.field5481 + var48, -var58 + class488.method2817(var56, true, var54, class430.field6069), var56, var54);
                    class97.field1274.method2657(8492, new class470(var59));
                }
            } else if (class330.field4821 == arg0) {
                int var60 = class264.field3874.method2380(199752600);
                int var61 = class264.field3874.method2357((byte) 105);
                int var62 = class285.field4172 + (var61 & 0x7);
                int var63 = class367.field5241 + var62;
                int var64 = (var61 >> 4 & 0x7) + class340.field4927;
                int var65 = class441.field6171 + var64;
                int var66 = class264.field3874.method2338(0);
                boolean var67 = var64 >= 0 && var62 >= 0 && var64 < class43.field494 && class500.field7068 > var62;
                if (var67 || class390.method2261(class279.field4128, (byte) 108)) {
                    class171.method1069(var65, new class25(var66, var60), (byte) 124, var63, class430.field6069);
                    if (var67) {
                        class195.method1232(var64, class430.field6069, var62, 4915);
                    }
                }
            } else if (class486.field6778 == arg0) {
                int var68 = class264.field3874.method2334(-128);
                int var69 = class264.field3874.method2338(0);
                int var70 = class264.field3874.method2370((byte) 41);
                int var71 = (var70 & 0x7) + class285.field4172;
                int var72 = class367.field5241 + var71;
                int var73 = (var70 >> 4 & 0x7) + class340.field4927;
                int var74 = var73 + class441.field6171;
                int var75 = class264.field3874.method2334(-128);
                if (class343.field4982 != var69) {
                    boolean var76 = var73 >= 0 && var71 >= 0 && var73 < class43.field494 && class500.field7068 > var71;
                    if (var76 || class390.method2261(class279.field4128, (byte) 108)) {
                        class171.method1069(var74, new class25(var75, var68), (byte) 124, var72, class430.field6069);
                        if (var76) {
                            class195.method1232(var73, class430.field6069, var71, 4915);
                        }
                    }
                }
            } else if (class161.field2378 == arg0) {
                class264.field3874.method2357((byte) 118);
                int var77 = class264.field3874.method2357((byte) 112);
                int var78 = ((var77 & 0x79) >> 4) + class340.field4927;
                int var79 = (var77 & 0x7) + class285.field4172;
                int var80 = class264.field3874.method2338(0);
                int var81 = class264.field3874.method2357((byte) 104);
                int var82 = class264.field3874.method2323((byte) 91);
                String var83 = class264.field3874.method2356(-25178);
                class485.method2793(class430.field6069, var78, var80, false, var82, var83, var81, var79);
            } else if (class48.field548 == arg0) {
                int var84 = class264.field3874.method2380(199752600);
                int var85 = class264.field3874.method2357((byte) 106);
                int var86 = class340.field4927 + ((var85 & 0x71) >> 4);
                int var87 = (var85 & 0x7) + class285.field4172;
                byte var88 = class264.field3874.method2352(128);
                byte var89 = class264.field3874.method2352(128);
                int var90 = class264.field3874.method2370((byte) 41);
                int var91 = var90 >> 2;
                int var92 = var90 & 0x3;
                int var93 = class264.field3874.method2324(-1033632760);
                int var94 = class264.field3874.method2343((byte) 53);
                byte var95 = class264.field3874.method2365(false);
                int var96 = class264.field3874.method2334(-128);
                byte var97 = class264.field3874.method2365(false);
                if (!class385.field5414.method317()) {
                    class500.method2905(var87, var94, var96, var84, var89, 219369601, var95, var92, class430.field6069, var91, var97, var86, var93, var88);
                }
            } else if (class31.field364 == arg0) {
                int var98 = class264.field3874.method2357((byte) 115);
                int var99 = ((var98 & 0x79) >> 4) + class340.field4927;
                int var100 = (var98 & 0x7) + class285.field4172;
                int var101 = class264.field3874.method2338(0);
                int var102 = class264.field3874.method2357((byte) 114);
                int var103 = class264.field3874.method2338(0);
                int var104 = class264.field3874.method2357((byte) 106);
                if (var99 >= 0 && var100 >= 0 && class43.field494 > var99 && class500.field7068 > var100) {
                    int var105 = var99 * 128 + 64;
                    int var106 = var100 * 128 + 64;
                    int var107 = class430.field6069;
                    if (var107 < 3 && class362.method2135(var100, 64, var99)) {
                        var107++;
                    }
                    class196 var108 = new class196(var101, var103, class390.field5481, class430.field6069, var107, var105, class488.method2817(var105, true, var106, class430.field6069) - var102, var106, var99, var99, var100, var100, var104);
                    class424.field5976.method2657(8492, new class300(var108));
                }
            } else if (class386.field5420 == arg0) {
                int var109 = class264.field3874.method2357((byte) 122);
                int var110 = class340.field4927 * 2 + (var109 >> 4 & 0xF);
                int var111 = (var109 & 0xF) + class285.field4172 * 2;
                boolean var112 = class264.field3874.method2357((byte) 118) != 0;
                int var113 = var110 + class264.field3874.method2359(71);
                int var114 = var111 + class264.field3874.method2359(97);
                int var115 = class264.field3874.method2371(7162);
                int var116 = class264.field3874.method2371(7162);
                int var117 = class264.field3874.method2338(0);
                byte var118 = class264.field3874.method2359(70);
                int var119 = class264.field3874.method2357((byte) 107) * 4;
                int var120 = class264.field3874.method2338(0);
                int var121 = class264.field3874.method2338(0);
                int var122 = class264.field3874.method2357((byte) 112);
                int var123 = class264.field3874.method2338(0);
                if (var122 == 255) {
                    var122 = -1;
                }
                if (var110 >= 0 && var111 >= 0 && var110 < class43.field494 * 2 && var111 < class43.field494 * 2 && var113 >= 0 && var114 >= 0 && var113 < (class500.field7068 * 2) && var114 < (class500.field7068 * 2) && var117 != 65535) {
                    int var124 = var114 * 64;
                    int var125 = var123 << 0;
                    int var126 = var110 * 64;
                    int var127 = var113 * 64;
                    int var128 = var119 << 0;
                    int var129 = var111 * 64;
                    int var130 = var118 << 0;
                    if (var115 != 0) {
                        class228 var131 = null;
                        int var134;
                        if (var115 < 0) {
                            int var132 = -var115 - 1;
                            int var133 = var132 & 0x7FF;
                            var134 = (var132 & 0x7AF0) >> 11;
                            if (class343.field4982 == var133) {
                                var131 = class246.field3587;
                            } else {
                                var131 = class378.field5355[var133];
                            }
                        } else {
                            int var135 = var115 - 1;
                            var134 = (var135 & 0x7DF6) >> 11;
                            int var136 = var135 & 0x7FF;
                            class378 var137 = (class378) class125.field1687.method2405((long) var136, -124);
                            if (var137 != null) {
                                var131 = var137.field5353;
                            }
                        }
                        if (var131 != null) {
                            class98 var138 = var131.method1406((byte) 115);
                            if (var138.field1287 != null && var138.field1287[var134] != null) {
                                int var139 = var138.field1287[var134][0];
                                int var140 = var138.field1287[var134][2];
                                int var141 = var131.field3328.method1110(0);
                                int var142 = class95.field1242[var141];
                                int var143 = class95.field1241[var141];
                                int var144 = var139 * var143 + var140 * var142 >> 15;
                                int var145 = var140 * var143 - (var139 * var142) >> 15;
                                var130 -= var138.field1287[var134][1];
                                var126 += var144;
                                var129 += var145;
                            }
                        }
                    }
                    class143 var147 = new class143(var117, class430.field6069, var126, var129, var130, class390.field5481 + var120, class390.field5481 + var121, var122, var125, var116, var128, var112);
                    var147.method888(62, class390.field5481 + var120, -var128 + class488.method2817(var127, true, var124, class430.field6069), var127, var124);
                    class97.field1274.method2657(8492, new class470(var147));
                }
            } else if (class510.field7557 == arg0) {
                int var148 = class264.field3874.method2370((byte) 41);
                int var149 = var148 >> 2;
                int var150 = var148 & 0x3;
                int var151 = class107.field1452[var149];
                int var152 = class264.field3874.method2326(1789029408);
                int var153 = ((var152 & 0x77) >> 4) + class340.field4927;
                int var154 = class285.field4172 + (var152 & 0x7);
                if (class390.method2261(class279.field4128, (byte) 108) || var153 >= 0 && var154 >= 0 && class43.field494 > var153 && var154 < class500.field7068) {
                    class383.method2225(class430.field6069, var150, (byte) 119, var149, var154, -1, var153, var151, 0, -1);
                }
            } else if (class461.field6447 == arg0) {
                int var155 = class264.field3874.method2357((byte) 108);
                int var156 = ((var155 & 0x73) >> 4) + class340.field4927;
                int var157 = class285.field4172 + (var155 & 0x7);
                int var158 = class264.field3874.method2338(0);
                if (var158 == 65535) {
                    var158 = -1;
                }
                int var159 = class264.field3874.method2357((byte) 111);
                int var160 = (var159 & 0xF3) >> 4;
                int var161 = var159 & 0x7;
                int var162 = class264.field3874.method2357((byte) 106);
                int var163 = class264.field3874.method2357((byte) 112);
                if (var156 >= 0 && var157 >= 0 && class43.field494 > var156 && var157 < class500.field7068) {
                    int var164 = var160 + 1;
                    if (var156 - var164 <= class246.field3587.field3368[0] && (var156 + var164) >= class246.field3587.field3368[0] && (var157 - var164) <= class246.field3587.field3378[0] && (var157 + var164) >= class246.field3587.field3378[0]) {
                        class247.method1609(var161, var163, var158, (class430.field6069 << 24) + var160 - (-(var156 << 16) - (var157 << 8)), 0, var162);
                    }
                }
            } else if (class354.field5080 == arg0) {
                int var165 = class264.field3874.method2357((byte) 119);
                boolean var166 = (var165 & 0x80) != 0;
                int var167 = ((var165 & 0x3D) >> 3) + class340.field4927;
                int var168 = (var165 & 0x7) + class285.field4172;
                int var169 = var167 + class264.field3874.method2359(-121);
                int var170 = class264.field3874.method2359(-118) + var168;
                int var171 = class264.field3874.method2371(7162);
                int var172 = class264.field3874.method2338(0);
                int var173 = class264.field3874.method2357((byte) 106) * 4;
                int var174 = class264.field3874.method2357((byte) 118) * 4;
                int var175 = class264.field3874.method2338(0);
                int var176 = class264.field3874.method2338(0);
                int var177 = class264.field3874.method2357((byte) 107);
                int var178 = class264.field3874.method2338(0);
                if (var177 == 255) {
                    var177 = -1;
                }
                if (var167 >= 0 && var168 >= 0 && class43.field494 > var167 && var168 < class500.field7068 && var169 >= 0 && var170 >= 0 && class43.field494 > var169 && class500.field7068 > var170 && var172 != 65535) {
                    int var179 = var167 * 128 + 64;
                    int var180 = var178 << 0;
                    int var181 = var174 << 0;
                    int var182 = var168 * 128 + 64;
                    int var183 = var169 * 128 + 64;
                    int var184 = var173 << 0;
                    int var185 = var170 * 128 + 64;
                    class143 var186 = new class143(var172, class430.field6069, var179, var182, var184, class390.field5481 + var175, var176 - -class390.field5481, var177, var180, var171, var181, var166);
                    var186.method888(31, class390.field5481 + var175, class488.method2817(var183, true, var185, class430.field6069) - var181, var183, var185);
                    class97.field1274.method2657(8492, new class470(var186));
                }
            } else {
                class406.method2409(3896, null, "T3 - " + arg0);
                class287.method1771(false, -2049);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lza;)V", line = 746)
    public static final void method181(class290 arg0) {
        for (int var1 = class228.field3359; var1 < class409.field5785; var1++) {
            for (int var2 = 0; var2 < class6.field109; var2++) {
                for (int var3 = 0; var3 < class272.field4032; var3++) {
                    class239 var4 = class268.field3910[var1][var2][var3];
                    if (var4 != null) {
                        class232 var5 = var4.field3487;
                        class232 var6 = var4.field3473;
                        if (var5 != null && var5.method118((byte) 102)) {
                            class85.method619(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method118((byte) 102)) {
                                class85.method619(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method128(-119, arg0, 0, var5, 0, false, 0);
                                var6.method120(0);
                            }
                            var5.method120(0);
                        }
                        for (class134 var7 = var4.field3482; var7 != null; var7 = var7.field1755) {
                            class144 var9 = var7.field1761;
                            if (var9 != null && var9.method118((byte) 102)) {
                                class85.method619(arg0, var9, var1, var2, var3, var9.field1898 + 1 - var9.field1911, var9.field1907 - var9.field1902 + 1);
                                var9.method120(0);
                            }
                        }
                        class35 var8 = var4.field3493;
                        if (var8 != null && var8.method118((byte) 102)) {
                            class300.method1836(arg0, var8, var1, var2, var3);
                            var8.method120(0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Loi;Lza;I)V", line = 822)
    public static final void method182(class53 arg0, class290 arg1, int arg2) {
        field349++;
        class506[] var3 = class506.method3021(arg0, class27.field326, 0);
        class438.field6143 = new class24[var3.length];
        if (arg2 >= -2) {
            return;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class438.field6143[var4] = arg1.method312(var3[var4], true);
        }
        class506[] var5 = class506.method3021(arg0, class528.field7748, 0);
        class8.field130 = new class24[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class8.field130[var6] = arg1.method312(var5[var6], true);
        }
        class506[] var7 = class506.method3021(arg0, class309.field4511, 0);
        class273.field4049 = new class24[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class273.field4049[var8] = arg1.method312(var7[var8], true);
        }
        class506[] var9 = class506.method3021(arg0, class417.field5875, 0);
        class467.field6526 = new class24[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class467.field6526[var10] = arg1.method312(var9[var10], true);
        }
        class506[] var11 = class506.method3021(arg0, class461.field6448, 0);
        class507.field7499 = new class24[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class507.field7499[var12] = arg1.method312(var11[var12], true);
        }
        class506[] var13 = class506.method3021(arg0, class231.field3399, 0);
        class536.field7852 = new class24[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class536.field7852[var14] = arg1.method312(var13[var14], true);
        }
        class506[] var15 = class506.method3021(arg0, class514.field7589, 0);
        class324.field4727 = new class24[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class324.field4727[var16] = arg1.method312(var15[var16], true);
        }
        class506[] var17 = class506.method3021(arg0, class227.field3260, 0);
        class357.field5119 = new class24[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class357.field5119[var18] = arg1.method312(var17[var18], true);
        }
        class506[] var19 = class506.method3021(arg0, class532.field7808, 0);
        class388.field5453 = new class24[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class388.field5453[var20] = arg1.method312(var19[var20], true);
        }
        class506[] var21 = class506.method3021(arg0, class100.field1334, 0);
        class460.field6424 = new class24[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class460.field6424[var22] = arg1.method312(var21[var22], true);
        }
        class506[] var23 = class506.method3021(arg0, class63.field791, 0);
        class116.field1567 = new class24[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class116.field1567[var24] = arg1.method312(var23[var24], true);
        }
        class506[] var25 = class506.method3021(arg0, class430.field6067, 0);
        class90.field1122 = new class24[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class90.field1122[var26] = arg1.method312(var25[var26], true);
        }
        class131.field1726 = arg1.method312(class506.method3018(arg0, class327.field4769, 0), true);
        class328.field4785 = arg1.method312(class506.method3018(arg0, class213.field3078, 0), true);
        class506[] var27 = class506.method3021(arg0, class494.field6987, 0);
        class149.field1976 = new class24[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class149.field1976[var28] = arg1.method312(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[FIIIII)V", line = 953)
    public static final void method183(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field345++;
        if (arg4 > 0 && !class51.method407(arg4, 1024)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class51.method407(arg0, 1024)) {
            int var7 = class338.method2016(arg2, 1);
            int var8 = 0;
            int var9 = arg4 >= arg0 ? arg0 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg1;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg6, arg4, arg0, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    if (arg5 < 58) {
                        method184(21, -106, -13, -67);
                        return;
                    }
                    return;
                }
                int var14 = arg4 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg0 = var11;
                arg4 = var10;
                var12 = var16;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V", line = 1056)
    public static final void method184(int arg0, int arg1, int arg2, int arg3) {
        field351++;
        int var4 = class4.field81.field1422 * arg1 >> 8;
        if (var4 != 0 && arg0 != -1) {
            class503.method2976(var4, true, class497.field7040, false, arg0, 0);
            class207.field3003 = true;
        }
        int var5 = -95 % ((arg3 - 46) / 39);
    }
}
