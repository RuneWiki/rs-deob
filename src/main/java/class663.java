import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class663 extends class342 {

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "B")
    public byte field9428 = 5;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "[Z")
    public static boolean[] field9429 = new boolean[100];

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "Lfv;")
    public static class108 field9417 = new class108(2, 4, 4, 0);

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "Lau;")
    public static class671 field9430 = new class671();

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "Lgu;")
    public static class529 field9432 = null;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "Lfv;")
    public static class108 field9431 = new class108(11, 0, 1, 2);

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public int field9418;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public int field9421;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public int field9423;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public int field9425;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
    public int field9426;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "I")
    public int field9427;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "Z")
    public boolean field9419;

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "[I")
    public static int[] field9433;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)V", line = 11)
    public static void method3722(int arg0) {
        field9433 = null;
        field9429 = null;
        field9431 = null;
        if (arg0 <= 96) {
            field9417 = null;
        }
        field9417 = null;
        field9430 = null;
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(Z)V", line = 29)
    public static final void method3723(boolean arg0) {
        field9424++;
        if (arg0) {
            class14.field135.method317(class593.field8429, class559.field7960, class172.field2052);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZII[Ljava/lang/String;[S)V", line = 43)
    public static final void method3724(boolean arg0, int arg1, int arg2, String[] arg3, short[] arg4) {
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method3724(false, var6 - 1, arg2, arg3, arg4);
            method3724(arg0, arg1, var6 + 1, arg3, arg4);
        }
        if (arg0) {
            field9429 = null;
        }
        field9420++;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lgl;B)V", line = 107)
    public static final void method3725(class547 arg0, byte arg1) {
        field9422++;
        if (class664.field9438 == arg0) {
            int var2 = class680.field9630.method2529(112);
            int var3 = class381.field4948 + (var2 & 0x7);
            int var4 = class146.field1642 + var3;
            int var5 = ((var2 & 0x78) >> 4) + class643.field9101;
            int var6 = class682.field9685 + var5;
            int var7 = class680.field9630.method2574(-1758460248);
            class43 var8 = (class43) class152.field1725.method3234((byte) -128, (long) (var4 << 14 | class596.field8455 << 28 | var6));
            if (var8 != null) {
                for (class232 var9 = (class232) var8.field451.method3174((byte) 49); var9 != null; var9 = (class232) var8.field451.method3168(false)) {
                    if ((var7 & 0x7FFF) == var9.field2958) {
                        var9.method1519((byte) 121);
                        break;
                    }
                }
                if (var8.field451.method3161((byte) 93)) {
                    var8.method1519((byte) 121);
                }
                if (var5 >= 0 && var3 >= 0 && class399.field5338 > var5 && var3 < class349.field4567) {
                    class268.method1513(var5, class596.field8455, (byte) -65, var3);
                }
            }
        } else if (class68.field733 == arg0) {
            int var10 = class680.field9630.method2563(-2263);
            int var11 = class643.field9101 + ((var10 & 0x75) >> 4);
            int var12 = class381.field4948 + (var10 & 0x7);
            int var13 = class680.field9630.method2563(-2263);
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = class393.field5238[var14];
            int var17 = class680.field9630.method2558((byte) -77);
            if (class500.method2876(-4, class381.field4954) || var11 >= 0 && var12 >= 0 && var11 < class399.field5338 && class349.field4567 > var12) {
                class394.method2151(0, var17, var14, var11, var15, -1, var16, var12, class596.field8455, -15955);
            }
        } else if (class248.field3193 == arg0) {
            int var18 = class680.field9630.method2541(102);
            int var19 = ((var18 & 0x78) >> 4) + class643.field9101;
            int var20 = (var18 & 0x7) + class381.field4948;
            int var21 = class680.field9630.method2574(-1758460248);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = class680.field9630.method2541(105);
            int var23 = (var22 & 0xFA) >> 4;
            int var24 = var22 & 0x7;
            int var25 = class680.field9630.method2541(104);
            int var26 = class680.field9630.method2541(100);
            if (var19 >= 0 && var20 >= 0 && class399.field5338 > var19 && class349.field4567 > var20) {
                int var27 = var23 + 1;
                if (class377.field4914.field3839[0] >= (var19 - var27) && class377.field4914.field3839[0] <= (var19 + var27) && var20 - var27 <= class377.field4914.field3841[0] && (var20 + var27) >= class377.field4914.field3841[0]) {
                    class299.method1694(true, var21, var24, var26, false, (var20 << 8) + (class596.field8455 << 24) + (var19 << 16) + var23, var25);
                }
            }
        } else if (class551.field7860 == arg0) {
            int var28 = class680.field9630.method2541(67);
            int var29 = var28 >> 2;
            int var30 = var28 & 0x3;
            int var31 = class680.field9630.method2553(-209425784);
            int var32 = (var31 >> 4 & 0x7) + class643.field9101;
            int var33 = (var31 & 0x7) + class381.field4948;
            byte var34 = class680.field9630.method2555((byte) -26);
            int var35 = class680.field9630.method2558((byte) -78);
            int var36 = class680.field9630.method2565(-126);
            byte var37 = class680.field9630.method2547(true);
            byte var38 = class680.field9630.method2517(32767);
            int var39 = class680.field9630.method2574(-1758460248);
            byte var40 = class680.field9630.method2547(true);
            int var41 = class680.field9630.method2532(false);
            if (!class453.field6284.method315()) {
                class552.method3113(var38, var35, -1, var30, var33, class596.field8455, var36, var40, var41, var37, var32, var29, var39, var34);
            }
        } else if (class250.field3229 == arg0) {
            int var42 = class680.field9630.method2541(64);
            boolean var43 = (var42 & 0x80) != 0;
            int var44 = (var42 >> 3 & 0x7) + class643.field9101;
            int var45 = (var42 & 0x7) + class381.field4948;
            int var46 = var44 + class680.field9630.method2547(true);
            int var47 = var45 + class680.field9630.method2547(true);
            int var48 = class680.field9630.method2549((byte) 32);
            int var49 = class680.field9630.method2574(-1758460248);
            int var50 = class680.field9630.method2541(65) * 4;
            int var51 = class680.field9630.method2541(107) * 4;
            int var52 = class680.field9630.method2574(-1758460248);
            int var53 = class680.field9630.method2574(-1758460248);
            int var54 = class680.field9630.method2541(57);
            if (var54 == 255) {
                var54 = -1;
            }
            int var55 = class680.field9630.method2574(-1758460248);
            if (var44 >= 0 && var45 >= 0 && class399.field5338 > var44 && var45 < class349.field4567 && var46 >= 0 && var47 >= 0 && class399.field5338 > var46 && var47 < class349.field4567 && var49 != 65535) {
                int var56 = var55 << 2;
                int var57 = var44 * 512 + 256;
                int var58 = var47 * 512 + 256;
                int var59 = var45 * 512 + 256;
                int var60 = var46 * 512 + 256;
                int var61 = var50 << 2;
                int var62 = var51 << 2;
                class178 var63 = new class178(var49, class596.field8455, var57, var59, var61, class469.field6549 + var52, class469.field6549 + var53, var54, var56, var48, var62, var43);
                var63.method1054(var60, class469.field6549 + var52, -var62 + class363.method1995(class596.field8455, var58, -1327568407, var60), -126, var58);
                class582.field8274.method3164(new class248(var63), 256);
            }
        } else if (class306.field3996 == arg0) {
            int var64 = class680.field9630.method2541(108);
            int var65 = class381.field4948 + (var64 & 0x7);
            int var66 = class146.field1642 + var65;
            int var67 = class643.field9101 + ((var64 & 0x7E) >> 4);
            int var68 = var67 + class682.field9685;
            int var69 = class680.field9630.method2574(-1758460248);
            int var70 = class680.field9630.method2574(-1758460248);
            int var71 = class680.field9630.method2574(-1758460248);
            if (class152.field1725 != null) {
                class43 var72 = (class43) class152.field1725.method3234((byte) -121, (long) (class596.field8455 << 28 | var66 << 14 | var68));
                if (var72 != null) {
                    for (class232 var73 = (class232) var72.field451.method3174((byte) 49); var73 != null; var73 = (class232) var72.field451.method3168(false)) {
                        if ((var69 & 0x7FFF) == var73.field2958 && var73.field2951 == var70) {
                            var73.method1519((byte) 121);
                            var73.field2951 = var71;
                            class85.method539(var68, var66, var73, -2, class596.field8455);
                            break;
                        }
                    }
                    if (var67 >= 0 && var65 >= 0 && var67 < class399.field5338 && var65 < class349.field4567) {
                        class268.method1513(var67, class596.field8455, (byte) -65, var65);
                    }
                }
            }
        } else if (class428.field5680 == arg0) {
            int var74 = class680.field9630.method2541(75);
            int var75 = (var74 >> 4 & 0xF) + class643.field9101 * 2;
            int var76 = (var74 & 0xF) + class381.field4948 * 2;
            boolean var77 = class680.field9630.method2541(77) != 0;
            int var78 = var75 + class680.field9630.method2547(true);
            int var79 = var76 + class680.field9630.method2547(true);
            int var80 = class680.field9630.method2549((byte) 32);
            int var81 = class680.field9630.method2549((byte) 32);
            int var82 = class680.field9630.method2574(-1758460248);
            byte var83 = class680.field9630.method2547(true);
            int var84 = class680.field9630.method2541(57) * 4;
            int var85 = class680.field9630.method2574(-1758460248);
            int var86 = class680.field9630.method2574(-1758460248);
            int var87 = class680.field9630.method2541(92);
            if (var87 == 255) {
                var87 = -1;
            }
            int var88 = class680.field9630.method2574(-1758460248);
            if (var75 >= 0 && var76 >= 0 && class399.field5338 * 2 > var75 && var76 < class399.field5338 * 2 && var78 >= 0 && var79 >= 0 && var78 < (class349.field4567 * 2) && class349.field4567 * 2 > var79 && var82 != 65535) {
                int var89 = var76 * 256;
                int var90 = var78 * 256;
                int var91 = var75 * 256;
                int var92 = var84 << 2;
                int var93 = var79 * 256;
                int var94 = var88 << 2;
                int var95 = var83 << 2;
                if (var80 != 0) {
                    class292 var96 = null;
                    int var99;
                    if (var80 < 0) {
                        int var97 = -var80 - 1;
                        int var98 = var97 & 0x7FF;
                        var99 = (var97 & 0x790B) >> 11;
                        if (class90.field1038 == var98) {
                            var96 = class377.field4914;
                        } else {
                            var96 = class362.field4726[var98];
                        }
                    } else {
                        int var100 = var80 - 1;
                        int var101 = var100 & 0x7FF;
                        var99 = (var100 & 0x7F1B) >> 11;
                        class443 var102 = (class443) class392.field5223.method3234((byte) -54, (long) var101);
                        if (var102 != null) {
                            var96 = var102.field6107;
                        }
                    }
                    if (var96 != null) {
                        class468 var103 = var96.method1653(1);
                        if (var103.field6513 != null && var103.field6513[var99] != null) {
                            int var104 = var103.field6513[var99][0];
                            int var105 = var103.field6513[var99][2];
                            int var106 = var96.field3765.method1593(-121);
                            int var107 = class285.field3655[var106];
                            int var108 = class285.field3656[var106];
                            int var109 = var105 * var107 + (var104 * var108) >> 14;
                            int var110 = var105 * var108 - (var104 * var107) >> 14;
                            var91 += var109;
                            var89 += var110;
                            var95 -= var103.field6513[var99][1];
                        }
                    }
                }
                class178 var112 = new class178(var82, class596.field8455, var91, var89, var95, class469.field6549 + var85, class469.field6549 + var86, var87, var94, var81, var92, var77);
                var112.method1054(var90, class469.field6549 + var85, -var92 + class363.method1995(class596.field8455, var93, -1327568407, var90), -104, var93);
                class582.field8274.method3164(new class248(var112), 256);
            }
        } else if (class284.field3603 == arg0) {
            int var113 = class680.field9630.method2553(-209425784);
            int var114 = (var113 & 0x7) + class381.field4948;
            int var115 = class146.field1642 + var114;
            int var116 = ((var113 & 0x70) >> 4) + class643.field9101;
            int var117 = class682.field9685 + var116;
            int var118 = class680.field9630.method2542((byte) 84);
            int var119 = class680.field9630.method2558((byte) -93);
            int var120 = class680.field9630.method2558((byte) -68);
            if (class90.field1038 != var120) {
                boolean var121 = var116 >= 0 && var114 >= 0 && var116 < class399.field5338 && var114 < class349.field4567;
                if (var121 || class500.method2876(-4, class381.field4954)) {
                    class85.method539(var117, var115, new class232(var119, var118), -2, class596.field8455);
                    if (var121) {
                        class268.method1513(var116, class596.field8455, (byte) -65, var114);
                    }
                }
            }
        } else if (arg1 >= 100) {
            if (class610.field8623 == arg0) {
                int var122 = class680.field9630.method2574(-1758460248);
                int var123 = class680.field9630.method2541(120);
                class195.field2339.method3729(var122, (byte) 109).method1884(67, var123);
            } else if (class454.field6295 == arg0) {
                int var124 = class680.field9630.method2541(59);
                int var125 = (var124 >> 4 & 0x7) + class643.field9101;
                int var126 = class381.field4948 + (var124 & 0x7);
                int var127 = class680.field9630.method2574(-1758460248);
                if (var127 == 65535) {
                    var127 = -1;
                }
                int var128 = class680.field9630.method2541(110);
                int var129 = (var128 & 0xF8) >> 4;
                int var130 = var128 & 0x7;
                int var131 = class680.field9630.method2541(126);
                int var132 = class680.field9630.method2541(59);
                if (var125 >= 0 && var126 >= 0 && class399.field5338 > var125 && class349.field4567 > var126) {
                    int var133 = var129 + 1;
                    if (class377.field4914.field3839[0] >= var125 - var133 && var125 + var133 >= class377.field4914.field3839[0] && (var126 - var133) <= class377.field4914.field3841[0] && var126 + var133 >= class377.field4914.field3841[0]) {
                        class352.method1952(var130, var127, (class596.field8455 << 24) + (var125 << 16) + (var126 << 8) + var129, -29087, var132, var131);
                    }
                }
            } else if (class526.field7523 == arg0) {
                int var134 = class680.field9630.method2529(93);
                int var135 = var134 >> 2;
                int var136 = var134 & 0x3;
                int var137 = class393.field5238[var135];
                int var138 = class680.field9630.method2542((byte) 79);
                if (var138 == 65535) {
                    var138 = -1;
                }
                int var139 = class680.field9630.method2563(-2263);
                int var140 = (var139 >> 4 & 0x7) + class643.field9101;
                int var141 = (var139 & 0x7) + class381.field4948;
                class452.method2534(var141, -101, var136, class596.field8455, var137, var140, var138, var135);
            } else if (class617.field8682 == arg0) {
                int var142 = class680.field9630.method2563(-2263);
                int var143 = var142 >> 2;
                int var144 = var142 & 0x3;
                int var145 = class393.field5238[var143];
                int var146 = class680.field9630.method2541(50);
                int var147 = ((var146 & 0x79) >> 4) + class643.field9101;
                int var148 = (var146 & 0x7) + class381.field4948;
                if (class500.method2876(-4, class381.field4954) || var147 >= 0 && var148 >= 0 && class399.field5338 > var147 && var148 < class349.field4567) {
                    class394.method2151(0, -1, var143, var147, var144, -1, var145, var148, class596.field8455, -15955);
                }
            } else if (class403.field5365 == arg0) {
                int var149 = class680.field9630.method2563(-2263);
                int var150 = (var149 & 0x7) + class381.field4948;
                int var151 = class146.field1642 + var150;
                int var152 = class643.field9101 + ((var149 & 0x70) >> 4);
                int var153 = class682.field9685 + var152;
                int var154 = class680.field9630.method2542((byte) -96);
                int var155 = class680.field9630.method2542((byte) 40);
                boolean var156 = var152 >= 0 && var150 >= 0 && var152 < class399.field5338 && var150 < class349.field4567;
                if (var156 || class500.method2876(-4, class381.field4954)) {
                    class85.method539(var153, var151, new class232(var155, var154), -2, class596.field8455);
                    if (var156) {
                        class268.method1513(var152, class596.field8455, (byte) -65, var150);
                    }
                }
            } else if (class176.field2099 == arg0) {
                int var157 = class680.field9630.method2541(62);
                int var158 = (var157 >> 4 & 0x7) + class643.field9101;
                int var159 = (var157 & 0x7) + class381.field4948;
                int var160 = class680.field9630.method2574(-1758460248);
                int var161 = class680.field9630.method2541(124);
                int var162 = class680.field9630.method2574(-1758460248);
                int var163 = class680.field9630.method2541(74);
                if (var158 >= 0 && var159 >= 0 && var158 < class399.field5338 && var159 < class349.field4567) {
                    int var164 = var158 * 512 + 256;
                    int var165 = var159 * 512 + 256;
                    int var166 = class596.field8455;
                    if (var166 < 3 && class166.method996(var158, 30405, var159)) {
                        var166++;
                    }
                    class132 var167 = new class132(var160, var162, class469.field6549, class596.field8455, var166, var164, class363.method1995(class596.field8455, var165, -1327568407, var164) - var161, var165, var158, var158, var159, var159, var163);
                    class369.field4792.method3164(new class319(var167), 256);
                }
            } else if (class357.field4678 == arg0) {
                int var168 = class680.field9630.method2541(80);
                int var169 = ((var168 & 0xF3) >> 4) + class643.field9101 * 2;
                int var170 = class381.field4948 * 2 + (var168 & 0xF);
                boolean var171 = class680.field9630.method2541(115) != 0;
                int var172 = var169 + class680.field9630.method2547(true);
                int var173 = var170 + class680.field9630.method2547(true);
                int var174 = class680.field9630.method2549((byte) 32);
                int var175 = class680.field9630.method2574(-1758460248);
                int var176 = class680.field9630.method2541(33) * 4;
                int var177 = class680.field9630.method2541(62) * 4;
                int var178 = class680.field9630.method2574(-1758460248);
                int var179 = class680.field9630.method2574(-1758460248);
                int var180 = class680.field9630.method2541(73);
                int var181 = class680.field9630.method2574(-1758460248);
                if (var180 == 255) {
                    var180 = -1;
                }
                if (var169 >= 0 && var170 >= 0 && var169 < (class399.field5338 * 2) && class399.field5338 * 2 > var170 && var172 >= 0 && var173 >= 0 && class349.field4567 * 2 > var172 && (class349.field4567 * 2) > var173 && var175 != 65535) {
                    int var182 = var172 * 256;
                    int var183 = var170 * 256;
                    int var184 = var176 << 2;
                    int var185 = var169 * 256;
                    int var186 = var177 << 2;
                    int var187 = var181 << 2;
                    int var188 = var173 * 256;
                    class178 var189 = new class178(var175, class596.field8455, var185, var183, var184, class469.field6549 + var178, class469.field6549 + var179, var180, var187, var174, var186, var171);
                    var189.method1054(var182, class469.field6549 + var178, class363.method1995(class596.field8455, var188, -1327568407, var182) - var186, -101, var188);
                    class582.field8274.method3164(new class248(var189), 256);
                }
            } else if (class24.field295 == arg0) {
                class680.field9630.method2541(90);
                int var190 = class680.field9630.method2541(90);
                int var191 = class643.field9101 + (var190 >> 4 & 0x7);
                int var192 = (var190 & 0x7) + class381.field4948;
                int var193 = class680.field9630.method2574(-1758460248);
                int var194 = class680.field9630.method2541(103);
                int var195 = class680.field9630.method2524(3);
                String var196 = class680.field9630.method2516(116);
                class232.method1349(var192, var191, var196, class596.field8455, -111, var195, var194, var193);
            } else {
                class150.method824(15, null, "T3 - " + arg0);
                class184.method1069(false, false);
            }
        }
    }
}
