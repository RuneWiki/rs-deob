import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class416 {

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field5821 = 0;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "[[I")
    public static int[][] field5822 = new int[128][128];

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
    public static boolean field5825 = false;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "Z")
    public static boolean field5823 = true;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
    public static int[] field5827 = new int[13];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field5820;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI)Z", line = 11)
    public static final boolean method2574(boolean arg0, int arg1) {
        field5826++;
        if (arg1 == 46 || arg1 == 8 || arg1 == 45 || arg1 == 44 || arg1 == 24) {
            return true;
        } else if (arg1 == 26 || arg1 == 47 || arg1 == 1004) {
            return true;
        } else {
            if (!arg0) {
                method2576(-74);
            }
            if (arg1 == 10 || arg1 == 13 || arg1 == 49 || arg1 == 5 || arg1 == 16) {
                return true;
            } else {
                return arg1 == 20 || arg1 == 58 || arg1 == 1006 || arg1 == 31;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V", line = 37)
    public static void method2575(boolean arg0) {
        if (arg0) {
            method2579(24);
        }
        field5822 = null;
        field5820 = null;
        field5827 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 54)
    public static final void method2576(int arg0) {
        field5817++;
        if (class363.field5019 == 120) {
            int var1 = class417.field5851.method1861((byte) -72);
            int var2 = ((var1 & 0xF7) >> 4) + class287.field3843 * 2;
            int var3 = (var1 & 0xF) + class430.field6118 * 2;
            int var4 = class417.field5851.method1868((byte) -127) + var2;
            int var5 = class417.field5851.method1868((byte) -126) + var3;
            int var6 = class417.field5851.method1833(66);
            int var7 = class417.field5851.method1853(-90);
            int var8 = class417.field5851.method1861((byte) -72) * 4;
            int var9 = class417.field5851.method1861((byte) -72) * 4;
            int var10 = class417.field5851.method1853(100);
            int var11 = class417.field5851.method1853(arg0 ^ 0xFFFFFF84);
            int var12 = class417.field5851.method1861((byte) -72);
            int var13 = class417.field5851.method1861((byte) -72);
            if (var12 == 255) {
                var12 = -1;
            }
            if (var2 >= 0 && var3 >= 0 && var2 < 208 && var3 < 208 && var4 >= 0 && var5 >= 0 && var4 < 208 && var5 < 208 && var7 != 65535) {
                int var14 = var5 * 64;
                int var15 = var4 * 64;
                int var16 = var2 * 64;
                int var17 = var3 * 64;
                class144 var18 = new class144(var7, class69.field1046, var16, var17, class22.method281(arg0 ^ 0xFFFFFFFE, class69.field1046, var17, var16) - var8, class414.field5793 + var10, class414.field5793 + var11, var12, var13, var6, var9);
                var18.method1112(class22.method281(1, class69.field1046, var14, var15) - var9, class414.field5793 + var10, var14, -1, var15);
                class75.field1119.method1249(new class19(var18), (byte) -125);
            }
        } else if (class363.field5019 == 142) {
            int var19 = class417.field5851.method1861((byte) -72);
            int var20 = ((var19 & 0xFC) >> 4) + class287.field3843 * 2;
            int var21 = (var19 & 0xF) + class430.field6118 * 2;
            int var22 = class417.field5851.method1868((byte) -119) + var20;
            int var23 = var21 + class417.field5851.method1868((byte) -120);
            int var24 = class417.field5851.method1833(69);
            int var25 = class417.field5851.method1833(60);
            int var26 = class417.field5851.method1853(-37);
            int var27 = class417.field5851.method1868((byte) -125);
            int var28 = class417.field5851.method1861((byte) -72) * 4;
            int var29 = class417.field5851.method1853(103);
            int var30 = class417.field5851.method1853(-69);
            int var31 = class417.field5851.method1861((byte) -72);
            int var32 = class417.field5851.method1861((byte) -72);
            if (var31 == 255) {
                var31 = -1;
            }
            if (var20 >= 0 && var21 >= 0 && var20 < 208 && var21 < 208 && var22 >= 0 && var23 >= 0 && var22 < 208 && var23 < 208 && var26 != 65535) {
                int var33 = var22 * 64;
                int var34 = var20 * 64;
                int var35 = var21 * 64;
                int var36 = var23 * 64;
                if (var24 != 0) {
                    int var39;
                    class362 var40;
                    if (var24 >= 0) {
                        int var37 = var24 - 1;
                        int var38 = var37 & 0x7FF;
                        var39 = (var37 & 0x7D84) >> 11;
                        var40 = class298.field4012[var38];
                    } else {
                        int var41 = -var24 - 1;
                        var39 = var41 >> 11 & 0xF;
                        int var42 = var41 & 0x7FF;
                        if (class401.field5606 == var42) {
                            var40 = class95.field1379;
                        } else {
                            var40 = class220.field3044[var42];
                        }
                    }
                    if (var40 != null) {
                        class434 var43 = var40.method2280(65);
                        if (var43.field6186 != null && var43.field6186[var39] != null) {
                            int var44 = var43.field6186[var39][0];
                            int var45 = var43.field6186[var39][2];
                            int var46 = var40.field4977.method2041(arg0 ^ 0x1748);
                            int var47 = class174.field2572[var46];
                            int var48 = class174.field2564[var46];
                            int var49 = var44 * var48 + var45 * var47 >> 15;
                            int var50 = var45 * var48 - (var44 * var47) >> 15;
                            var27 -= var43.field6186[var39][1];
                            var34 += var49;
                            var35 += var50;
                        }
                    }
                }
                class144 var52 = new class144(var26, class69.field1046, var34, var35, class22.method281(1, class69.field1046, var35, var34) - var27, class414.field5793 + var29, class414.field5793 + var30, var31, var32, var25, var28);
                var52.method1112(class22.method281(1, class69.field1046, var36, var33) - var28, class414.field5793 + var29, var36, -1, var33);
                class75.field1119.method1249(new class19(var52), (byte) -128);
            }
        } else if (class363.field5019 == 239) {
            int var53 = class417.field5851.method1829(24185);
            int var54 = var53 >> 2;
            int var55 = var53 & 0x3;
            int var56 = class420.field5884[var54];
            int var57 = class417.field5851.method1852((byte) -21);
            int var58 = class287.field3843 + (var57 >> 4 & 0x7);
            int var59 = (var57 & 0x7) + class430.field6118;
            if (var58 >= 0 && var59 >= 0 && var58 < class116.field1621 && var59 < class385.field5425) {
                class154.method1184(0, var56, class69.field1046, -116, var55, -1, var58, var59, -1, var54);
            }
        } else if (class363.field5019 == 145) {
            int var60 = class417.field5851.method1861((byte) -72);
            int var61 = class287.field3843 + (var60 >> 4 & 0x7);
            int var62 = (var60 & 0x7) + class430.field6118;
            int var63 = class417.field5851.method1853(-72);
            if (var63 == 65535) {
                var63 = -1;
            }
            int var64 = class417.field5851.method1861((byte) -72);
            int var65 = var64 >> 4 & 0xF;
            int var66 = var64 & 0x7;
            int var67 = class417.field5851.method1861((byte) -72);
            int var68 = class417.field5851.method1861((byte) -72);
            if (var61 >= 0 && var62 >= 0 && class116.field1621 > var61 && class385.field5425 > var62) {
                int var69 = var65 + 1;
                if (class95.field1379.field5005[0] >= (var61 - var69) && var61 + var69 >= class95.field1379.field5005[0] && class95.field1379.field4998[0] >= var62 - var69 && class95.field1379.field4998[0] <= (var62 + var69) && class331.field4504 != 0 && var66 > 0 && class384.field5399 < 50 && var63 != -1) {
                    class191.field2751[class384.field5399] = var63;
                    class44.field705[class384.field5399] = var66;
                    class160.field2383[class384.field5399] = var67;
                    class339.field4627[class384.field5399] = null;
                    class286.field3840[class384.field5399] = (var61 << 16) + (var62 << 8) + var65;
                    class339.field4623[class384.field5399] = var68;
                    class384.field5399++;
                }
            }
        } else if (class363.field5019 == 212) {
            int var70 = class417.field5851.method1852((byte) -21);
            int var71 = ((var70 & 0x78) >> 4) + class287.field3843;
            int var72 = (var70 & 0x7) + class430.field6118;
            int var73 = class417.field5851.method1828((byte) -106);
            int var74 = class417.field5851.method1873(arg0 - 8408);
            int var75 = class417.field5851.method1828((byte) -41);
            if (var71 >= 0 && var72 >= 0 && class116.field1621 > var71 && class385.field5425 > var72 && class401.field5606 != var75) {
                class368.method2298(-11821, var72, new class346(var74, var73), var71, class69.field1046);
                class392.method2419(var72, class69.field1046, var71, -70);
            }
        } else {
            if (class363.field5019 == 121) {
                int var76 = class417.field5851.method1853(arg0 ^ 0xFFFFFF8D);
                int var77 = class417.field5851.method1829(24185);
                int var78 = (var77 >> 4 & 0x7) + class287.field3843;
                int var79 = (var77 & 0x7) + class430.field6118;
                byte var80 = class417.field5851.method1846(false);
                int var81 = class417.field5851.method1844(arg0 - 32767);
                int var82 = class417.field5851.method1853(-24);
                byte var83 = class417.field5851.method1846(false);
                int var84 = class417.field5851.method1825(-71);
                int var85 = class417.field5851.method1840((byte) -71);
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                byte var88 = class417.field5851.method1863(arg0 ^ 0xEC2B22B7);
                byte var89 = class417.field5851.method1846(false);
                if (!class249.field3415.method172()) {
                    class368.method2295(var87, var89, var81, var76, var84, var88, var78, (byte) -125, var82, var86, var80, var79, var83);
                }
            }
            if (class363.field5019 == 8) {
                int var90 = class417.field5851.method1861((byte) -72);
                int var91 = (var90 >> 4 & 0x7) + class287.field3843;
                int var92 = (var90 & 0x7) + class430.field6118;
                int var93 = class417.field5851.method1868((byte) -125) + var91;
                int var94 = class417.field5851.method1868((byte) -128) + var92;
                int var95 = class417.field5851.method1833(34);
                int var96 = class417.field5851.method1853(-65);
                int var97 = class417.field5851.method1861((byte) -72) * 4;
                int var98 = class417.field5851.method1861((byte) -72) * 4;
                int var99 = class417.field5851.method1853(127);
                int var100 = class417.field5851.method1853(arg0 ^ 0xFFFFFF9C);
                int var101 = class417.field5851.method1861((byte) -72);
                if (var101 == 255) {
                    var101 = -1;
                }
                int var102 = class417.field5851.method1861((byte) -72);
                if (var91 >= 0 && var92 >= 0 && var91 < class116.field1621 && var92 < class385.field5425 && var93 >= 0 && var94 >= 0 && var93 < class116.field1621 && class385.field5425 > var94 && var96 != 65535) {
                    int var103 = var94 * 128 + 64;
                    int var104 = var93 * 128 + 64;
                    int var105 = var91 * 128 + 64;
                    int var106 = var92 * 128 + 64;
                    class144 var107 = new class144(var96, class69.field1046, var105, var106, class22.method281(1, class69.field1046, var106, var105) - var97, class414.field5793 + var99, class414.field5793 + var100, var101, var102, var95, var98);
                    var107.method1112(class22.method281(1, class69.field1046, var103, var104) - var98, class414.field5793 + var99, var103, arg0, var104);
                    class75.field1119.method1249(new class19(var107), (byte) -122);
                }
            } else if (class363.field5019 == 135) {
                int var108 = class417.field5851.method1861((byte) -72);
                int var109 = ((var108 & 0x71) >> 4) + class287.field3843;
                int var110 = (var108 & 0x7) + class430.field6118;
                int var111 = class417.field5851.method1853(arg0 - 77);
                int var112 = class417.field5851.method1861((byte) -72);
                int var113 = class417.field5851.method1853(98);
                if (var109 >= 0 && var110 >= 0 && class116.field1621 > var109 && class385.field5425 > var110) {
                    int var114 = var109 * 128 + 64;
                    int var115 = var110 * 128 + 64;
                    class438 var116 = new class438(var111, var113, class414.field5793, class69.field1046, var114, class22.method281(1, class69.field1046, var115, var114) - var112, var115, var109, var109, var110, var110);
                    class323.field4395.method1249(new class5(var116), (byte) -103);
                }
            } else if (class363.field5019 == 139) {
                int var117 = class417.field5851.method1861((byte) -72);
                int var118 = class287.field3843 + (var117 >> 4 & 0x7);
                int var119 = (var117 & 0x7) + class430.field6118;
                int var120 = class417.field5851.method1853(-53);
                int var121 = class417.field5851.method1853(arg0 ^ 0xFFFFFF91);
                int var122 = class417.field5851.method1853(-110);
                if (class451.field6514 != null && var118 >= 0 && var119 >= 0 && var118 < class116.field1621 && class385.field5425 > var119) {
                    class396 var123 = (class396) class451.field6514.method614(-122, (long) (var118 | class69.field1046 << 28 | var119 << 14));
                    if (var123 != null) {
                        for (class346 var124 = (class346) var123.field5549.method1240((byte) -116); var124 != null; var124 = (class346) var123.field5549.method1245(arg0 + 2)) {
                            if ((var120 & 0x7FFF) == var124.field4684 && var124.field4688 == var121) {
                                var124.method2367(5);
                                var124.field4688 = var122;
                                class368.method2298(arg0 ^ 0x2E2C, var119, var124, var118, class69.field1046);
                                break;
                            }
                        }
                        class392.method2419(var119, class69.field1046, var118, arg0 - 105);
                    }
                }
            } else if (arg0 == -1) {
                if (class363.field5019 == 84) {
                    int var125 = class417.field5851.method1825(arg0 ^ 0x38);
                    int var126 = class417.field5851.method1861((byte) -72);
                    int var127 = var126 >> 2;
                    int var128 = var126 & 0x3;
                    int var129 = class420.field5884[var127];
                    int var130 = class417.field5851.method1852((byte) -21);
                    int var131 = ((var130 & 0x79) >> 4) + class287.field3843;
                    int var132 = (var130 & 0x7) + class430.field6118;
                    if (var131 >= 0 && var132 >= 0 && class116.field1621 > var131 && class385.field5425 > var132) {
                        class154.method1184(0, var129, class69.field1046, -80, var128, var125, var131, var132, -1, var127);
                    }
                } else if (class363.field5019 == 140) {
                    class417.field5851.method1861((byte) -72);
                    int var133 = class417.field5851.method1861((byte) -72);
                    int var134 = class287.field3843 + (var133 >> 4 & 0x7);
                    int var135 = (var133 & 0x7) + class430.field6118;
                    int var136 = class417.field5851.method1853(-71);
                    int var137 = class417.field5851.method1861((byte) -72);
                    int var138 = class417.field5851.method1880((byte) 98);
                    String var139 = class417.field5851.method1871(arg0);
                    class134.method1070((byte) 97, var136, var139, var137, var134, var135, var138);
                } else if (class363.field5019 == 68) {
                    int var140 = class417.field5851.method1853(103);
                    int var141 = class417.field5851.method1861((byte) -72);
                    class10.method53(var140, true).method2315((byte) -123, var141);
                } else if (class363.field5019 == 98) {
                    int var142 = class417.field5851.method1840((byte) -47);
                    int var143 = class287.field3843 + (var142 >> 4 & 0x7);
                    int var144 = (var142 & 0x7) + class430.field6118;
                    int var145 = class417.field5851.method1840((byte) -23);
                    int var146 = var145 >> 2;
                    int var147 = var145 & 0x3;
                    int var148 = class420.field5884[var146];
                    int var149 = class417.field5851.method1853(-28);
                    if (var149 == 65535) {
                        var149 = -1;
                    }
                    class372.method2326(var148, var146, var144, var149, var147, var143, arg0 + 5, class69.field1046);
                } else if (class363.field5019 == 134) {
                    int var150 = class417.field5851.method1825(arg0 - 94);
                    int var151 = class417.field5851.method1873(-8409);
                    int var152 = class417.field5851.method1829(arg0 ^ 0xFFFFA186);
                    int var153 = (var152 >> 4 & 0x7) + class287.field3843;
                    int var154 = (var152 & 0x7) + class430.field6118;
                    if (var153 >= 0 && var154 >= 0 && class116.field1621 > var153 && class385.field5425 > var154) {
                        class368.method2298(-11821, var154, new class346(var150, var151), var153, class69.field1046);
                        class392.method2419(var154, class69.field1046, var153, -28);
                    }
                } else if (class363.field5019 == 190) {
                    int var155 = class417.field5851.method1873(-8409);
                    int var156 = class417.field5851.method1840((byte) -21);
                    int var157 = class287.field3843 + (var156 >> 4 & 0x7);
                    int var158 = (var156 & 0x7) + class430.field6118;
                    if (var157 >= 0 && var158 >= 0 && class116.field1621 > var157 && var158 < class385.field5425) {
                        class396 var159 = (class396) class451.field6514.method614(-80, (long) (class69.field1046 << 28 | var158 << 14 | var157));
                        if (var159 != null) {
                            for (class346 var160 = (class346) var159.field5549.method1240((byte) -103); var160 != null; var160 = (class346) var159.field5549.method1245(1)) {
                                if ((var155 & 0x7FFF) == var160.field4684) {
                                    var160.method2367(arg0 + 6);
                                    break;
                                }
                            }
                            if (var159.field5549.method1247((byte) 120)) {
                                var159.method2367(5);
                            }
                            class392.method2419(var158, class69.field1046, var157, -28);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIII)V", line = 660)
    public static final void method2577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5819++;
        if (arg3 < 128 || arg0 < 128 || arg3 > class116.field1621 * 128 - 256 || class385.field5425 * 128 - 256 < arg0) {
            class220.field3043[0] = class220.field3043[1] = -1;
            return;
        }
        int var9 = class22.method281(arg1 ^ 0x6, class69.field1046, arg0, arg3) - arg5;
        class228.field3159.method319(arg6, 0, 0);
        class249.field3415.method189(class228.field3159);
        class249.field3415.method171(arg3, var9, arg0, class220.field3043);
        class228.field3159.method319(-arg6, 0, 0);
        class249.field3415.method189(class228.field3159);
        if (arg1 != 7) {
            field5821 = 16;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V", line = 685)
    public static final void method2578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 < (arg1 + arg5); var6++) {
            for (int var9 = arg3; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < class116.field1621 && var6 >= 0 && var6 < class385.field5425) {
                    class44.field703[arg0][var9][var6] = arg0 <= 0 ? 0 : class44.field703[arg0 - 1][var9][var6] - 240;
                }
            }
        }
        field5824++;
        if (~arg3 < arg4 && class116.field1621 > arg3) {
            for (int var7 = arg5 + 1; var7 < arg1 + arg5; var7++) {
                if (var7 >= 0 && var7 < class385.field5425) {
                    class44.field703[arg0][arg3][var7] = class44.field703[arg0][arg3 - 1][var7];
                }
            }
        }
        if (arg5 > 0 && arg5 < class385.field5425) {
            for (int var8 = arg3 + 1; var8 < arg3 + arg2; var8++) {
                if (var8 >= 0 && var8 < class116.field1621) {
                    class44.field703[arg0][var8][arg5] = class44.field703[arg0][var8][arg5 - 1];
                }
            }
        }
        if (arg3 < 0 || arg5 < 0 || class116.field1621 <= arg3 || class385.field5425 <= arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 > 0 && class44.field703[arg0][arg3 - 1][arg5] != 0) {
                class44.field703[arg0][arg3][arg5] = class44.field703[arg0][arg3 - 1][arg5];
                return;
            }
            if (arg5 > 0 && class44.field703[arg0][arg3][arg5 - 1] != 0) {
                class44.field703[arg0][arg3][arg5] = class44.field703[arg0][arg3][arg5 - 1];
                return;
            }
            if (arg3 > 0 && arg5 > 0 && class44.field703[arg0][arg3 - 1][arg5 - 1] != 0) {
                class44.field703[arg0][arg3][arg5] = class44.field703[arg0][arg3 - 1][arg5 - 1];
                return;
            }
        } else if (arg3 <= 0 || class44.field703[arg0][arg3 - 1][arg5] == class44.field703[arg0 - 1][arg3 - 1][arg5]) {
            if (arg5 <= 0 || class44.field703[arg0 - 1][arg3][arg5 - 1] == class44.field703[arg0][arg3][arg5 - 1]) {
                if (arg3 > 0 && arg5 > 0 && class44.field703[arg0 - 1][arg3 - 1][arg5 - 1] != class44.field703[arg0][arg3 - 1][arg5 - 1]) {
                    class44.field703[arg0][arg3][arg5] = class44.field703[arg0][arg3 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            class44.field703[arg0][arg3][arg5] = class44.field703[arg0][arg3][arg5 - 1];
        } else {
            class44.field703[arg0][arg3][arg5] = class44.field703[arg0][arg3 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 781)
    public static final void method2579(int arg0) {
        if (arg0 == 1) {
            field5818++;
            class284.field3805.method2533(arg0 - 1);
        }
    }
}
