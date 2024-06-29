import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class31 extends class90 {

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lmb;")
    public static class96 field485 = class243.method1708("Versteckt", (byte) 112);

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Z")
    public static boolean field487 = false;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Z")
    public static boolean field488 = false;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lmb;")
    public static class96 field494 = class243.method1708(":chalreq:", (byte) 110);

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Lmb;")
    public static class96 field492 = class243.method1708(":duelfriend:", (byte) 120);

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Luc;")
    public static class11 field491 = new class11(64);

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field498 = 2;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Lff;")
    public static class3 field499;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "[I")
    public static int[] field490;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lmb;")
    public static final class96 method205(int arg0, byte arg1) {
        if (arg1 != -78) {
            method207(false, (byte) -13);
        }
        field493++;
        return class137.method1022(false, (byte) 72, 10, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static final void method206(byte arg0) {
        field496++;
        if (class6.field126 == 248) {
            int var1 = class1.field4.method1651(arg0 + 4084);
            int var2 = (var1 & 0x7) + class211.field3641;
            int var3 = ((var1 & 0x71) >> 4) + class147.field2609;
            int var4 = class1.field4.method1663((byte) 96);
            int var5 = class1.field4.method1651(4139);
            int var6 = class1.field4.method1651(4139);
            int var7 = var5 & 0x7;
            int var8 = (var5 & 0xF8) >> 4;
            if (var4 == 65535) {
                var4 = -1;
            }
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                int var9 = var8 + 1;
                if (class236.field4047.field4528[0] >= var3 - var9 && class236.field4047.field4528[0] <= var3 + var9 && class236.field4047.field4566[0] >= (var2 - var9) && var2 + var9 >= class236.field4047.field4566[0] && class5.field100 != 0 && var7 > 0 && class58.field1012 < 50 && var4 != -1) {
                    class134.field2402[class58.field1012] = var4;
                    class43.field741[class58.field1012] = var7;
                    class138.field2479[class58.field1012] = var6;
                    class154.field2711[class58.field1012] = null;
                    class250.field4331[class58.field1012] = (var2 << 8) + (var3 << 16) + var8;
                    class58.field1012++;
                }
            }
        } else if (class6.field126 == 38) {
            int var10 = class1.field4.method1651(4139);
            int var11 = (var10 >> 4 & 0x7) + class147.field2609;
            int var12 = (var10 & 0x7) + class211.field3641;
            int var13 = var11 + class1.field4.method1656(112);
            int var14 = var12 + class1.field4.method1656(-104);
            int var15 = class1.field4.method1627(true);
            int var16 = class1.field4.method1663((byte) -43);
            int var17 = class1.field4.method1651(4139) * 4;
            int var18 = class1.field4.method1651(4139) * 4;
            int var19 = class1.field4.method1663((byte) -73);
            int var20 = class1.field4.method1663((byte) -101);
            int var21 = class1.field4.method1651(4139);
            int var22 = class1.field4.method1651(4139);
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var16 != 65535) {
                int var23 = var12 * 128 + 64;
                int var24 = var11 * 128 + 64;
                class277 var25 = new class277(var16, class216.field3712, var24, var23, class137.method1025(class216.field3712, var23, var24, (byte) -94) - var17, class236.field4053 + var19, class236.field4053 + var20, var21, var22, var15, var18);
                int var26 = var14 * 128 + 64;
                int var27 = var13 * 128 + 64;
                var25.method1877(var27, (byte) -8, class137.method1025(class216.field3712, var26, var27, (byte) -94) - var18, var26, class236.field4053 + var19);
                class242.field4202.method1814(1, new class61(var25));
            }
        } else if (class6.field126 == 135) {
            int var28 = class1.field4.method1651(4139);
            int var29 = class147.field2609 + ((var28 & 0x7C) >> 4);
            int var30 = class211.field3641 + (var28 & 0x7);
            int var31 = class1.field4.method1663((byte) -91);
            int var32 = class1.field4.method1651(4139);
            int var33 = class1.field4.method1663((byte) 68);
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                int var34 = var29 * 128 + 64;
                int var35 = var30 * 128 + 64;
                class4 var36 = new class4(var31, class216.field3712, var34, var35, class137.method1025(class216.field3712, var35, var34, (byte) -94) - var32, var33, class236.field4053);
                class262.field4592.method1814(1, new class92(var36));
            }
        } else if (class6.field126 == 10) {
            int var37 = class1.field4.method1645(-85);
            int var38 = var37 >> 2;
            int var39 = var37 & 0x3;
            int var40 = class156.field2729[var38];
            int var41 = class1.field4.method1645(-92);
            int var42 = (var41 >> 4 & 0x7) + class147.field2609;
            int var43 = (var41 & 0x7) + class211.field3641;
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                class25.method171(var42, 0, var38, var40, var39, var43, -1, 0, class216.field3712, -1);
            }
        } else if (class6.field126 == 253) {
            int var44 = class1.field4.method1618(arg0 ^ 0xFFFFFFBA);
            int var45 = class1.field4.method1663((byte) 119);
            int var46 = class1.field4.method1669(255);
            int var47 = (var46 & 0x7) + class211.field3641;
            int var48 = class147.field2609 + ((var46 & 0x74) >> 4);
            int var49 = class1.field4.method1623(true);
            if (var48 >= 0 && var47 >= 0 && var48 < 104 && var47 < 104 && class229.field3934 != var49) {
                class152 var50 = new class152();
                var50.field2669 = var44;
                var50.field2679 = var45;
                if (class220.field3764[class216.field3712][var48][var47] == null) {
                    class220.field3764[class216.field3712][var48][var47] = new class262();
                }
                class220.field3764[class216.field3712][var48][var47].method1814(arg0 - 54, new class32(var50));
                class247.method1729(var47, -109, var48);
            }
        } else if (class6.field126 == 127) {
            int var51 = class1.field4.method1635(2);
            int var52 = ((var51 & 0x7E) >> 4) + class147.field2609;
            int var53 = (var51 & 0x7) + class211.field3641;
            int var54 = class1.field4.method1663((byte) -72);
            int var55 = class1.field4.method1672((byte) -109);
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                class152 var56 = new class152();
                var56.field2679 = var54;
                var56.field2669 = var55;
                if (class220.field3764[class216.field3712][var52][var53] == null) {
                    class220.field3764[class216.field3712][var52][var53] = new class262();
                }
                class220.field3764[class216.field3712][var52][var53].method1814(1, new class32(var56));
                class247.method1729(var53, 79, var52);
            }
        } else if (class6.field126 == 187) {
            int var57 = class1.field4.method1669(255);
            int var58 = ((var57 & 0x72) >> 4) + class147.field2609;
            int var59 = (var57 & 0x7) + class211.field3641;
            int var60 = class1.field4.method1618(-113);
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                class262 var61 = class220.field3764[class216.field3712][var58][var59];
                if (var61 != null) {
                    for (class32 var62 = (class32) var61.method1811(2); var62 != null; var62 = (class32) var61.method1810(false)) {
                        if ((var60 & 0x7FFF) == var62.field504.field2679) {
                            var62.method1743((byte) 21);
                            break;
                        }
                    }
                    if (var61.method1811(2) == null) {
                        class220.field3764[class216.field3712][var58][var59] = null;
                    }
                    class247.method1729(var59, -124, var58);
                }
            }
        } else if (class6.field126 == 68) {
            int var63 = class1.field4.method1651(arg0 ^ 0x101C);
            int var64 = (var63 & 0x7) + class211.field3641;
            int var65 = (var63 >> 4 & 0x7) + class147.field2609;
            int var66 = class1.field4.method1663((byte) 110);
            int var67 = class1.field4.method1663((byte) 85);
            int var68 = class1.field4.method1663((byte) 107);
            if (var65 >= 0 && var64 >= 0 && var65 < 104 && var64 < 104) {
                class262 var69 = class220.field3764[class216.field3712][var65][var64];
                if (var69 != null) {
                    for (class32 var70 = (class32) var69.method1811(2); var70 != null; var70 = (class32) var69.method1810(false)) {
                        class152 var71 = var70.field504;
                        if ((var66 & 0x7FFF) == var71.field2679 && var71.field2669 == var67) {
                            var71.field2669 = var68;
                            break;
                        }
                    }
                    class247.method1729(var64, -104, var65);
                }
            }
        } else if (class6.field126 == 43) {
            int var72 = class1.field4.method1635(2);
            int var73 = ((var72 & 0x72) >> 4) + class147.field2609;
            int var74 = (var72 & 0x7) + class211.field3641;
            int var75 = class1.field4.method1651(arg0 ^ 0x101C);
            int var76 = var75 >> 2;
            int var77 = var75 & 0x3;
            int var78 = class156.field2729[var76];
            int var79 = class1.field4.method1623(true);
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                class25.method171(var73, 0, var76, var78, var77, var74, var79, 0, class216.field3712, -1);
            }
        } else if (class6.field126 == 196) {
            int var80 = class1.field4.method1635(arg0 - 53);
            int var81 = class147.field2609 + (var80 >> 4 & 0x7);
            int var82 = (var80 & 0x7) + class211.field3641;
            int var83 = class1.field4.method1618(-122);
            if (var83 == 65535) {
                var83 = -1;
            }
            int var84 = class1.field4.method1645(arg0 - 89);
            int var85 = var84 >> 2;
            int var86 = var84 & 0x3;
            int var87 = class156.field2729[var85];
            class10.method76(var86, var87, var82, var81, var83, class216.field3712, var85, -29607);
        } else if (class6.field126 == 134) {
            int var88 = class1.field4.method1651(arg0 + 4084);
            int var89 = (var88 >> 4 & 0xF) + class147.field2609 * 2;
            int var90 = (var88 & 0xF) + class211.field3641 * 2;
            int var91 = class1.field4.method1656(61) + var89;
            int var92 = var90 + class1.field4.method1656(119);
            int var93 = class1.field4.method1627(true);
            int var94 = class1.field4.method1663((byte) 82);
            int var95 = class1.field4.method1651(4139) * 4;
            int var96 = class1.field4.method1651(4139) * 4;
            int var97 = class1.field4.method1663((byte) -75);
            int var98 = class1.field4.method1663((byte) 93);
            int var99 = class1.field4.method1651(4139);
            int var100 = class1.field4.method1651(arg0 ^ 0x101C);
            if (var89 >= 0 && var90 >= 0 && var89 < 208 && var90 < 208 && var91 >= 0 && var92 >= 0 && var91 < 208 && var92 < 208 && var94 != 65535) {
                int var101 = var92 * 64;
                int var102 = var90 * 64;
                int var103 = var91 * 64;
                int var104 = var89 * 64;
                class277 var105 = new class277(var94, class216.field3712, var104, var102, class137.method1025(class216.field3712, var102, var104, (byte) -94) - var95, var97 - -class236.field4053, class236.field4053 + var98, var99, var100, var93, var96);
                var105.method1877(var103, (byte) -8, class137.method1025(class216.field3712, var101, var103, (byte) -94) - var96, var101, class236.field4053 + var97);
                class242.field4202.method1814(arg0 - 54, new class61(var105));
            }
        } else {
            if (arg0 != 55) {
                method206((byte) 24);
            }
            if (class6.field126 == 233) {
                int var106 = class1.field4.method1672((byte) -84);
                byte var107 = class1.field4.method1648((byte) -71);
                int var108 = class1.field4.method1635(2);
                int var109 = var108 & 0x3;
                int var110 = var108 >> 2;
                int var111 = class156.field2729[var110];
                int var112 = class1.field4.method1623(true);
                byte var113 = class1.field4.method1648((byte) -71);
                int var114 = class1.field4.method1635(2);
                int var115 = class147.field2609 + (var114 >> 4 & 0x7);
                int var116 = (var114 & 0x7) + class211.field3641;
                int var117 = class1.field4.method1618(-117);
                int var118 = class1.field4.method1663((byte) 104);
                byte var119 = class1.field4.method1648((byte) -71);
                byte var120 = class1.field4.method1628(false);
                class47 var121;
                if (class229.field3934 == var118) {
                    var121 = class236.field4047;
                } else {
                    var121 = class22.field371[var118];
                }
                if (var121 != null) {
                    class196 var122 = class132.method995(var106, arg0 - 55);
                    int var123;
                    int var124;
                    if (var109 == 1 || var109 == 3) {
                        var123 = var122.field3388;
                        var124 = var122.field3415;
                    } else {
                        var123 = var122.field3415;
                        var124 = var122.field3388;
                    }
                    int var125 = (var123 >> 1) + var115;
                    int var126 = (var123 + 1 >> 1) + var115;
                    int var127 = (var124 >> 1) + var116;
                    int var128 = (var124 + 1 >> 1) + var116;
                    int[][] var129 = class173.field3022[class216.field3712];
                    int var130 = var129[var126][var127] + var129[var125][var127] - (-var129[var125][var128] - var129[var126][var128]) >> 2;
                    int[][] var131 = null;
                    if (class216.field3712 < 3) {
                        var131 = class173.field3022[class216.field3712 + 1];
                    }
                    int var132 = (var115 << 7) + (var123 << 6);
                    int var133 = (var116 << 7) + (var124 << 6);
                    class78 var134 = var122.method1361(var133, -15613, var122.field3380, var132, var130, var129, var110, var109, var131, false, (class30) null);
                    if (var134 != null) {
                        class25.method171(var115, var117 + 1, 0, var111, 0, var116, -1, 0, class216.field3712, var112 + 1);
                        if (var113 > var107) {
                            byte var135 = var113;
                            var113 = var107;
                            var107 = var135;
                        }
                        var121.field823 = var112 + class236.field4053;
                        var121.field814 = class236.field4053 + var117;
                        var121.field798 = var116 * 128 + var124 * 64;
                        var121.field805 = (class35) var134.field1332;
                        var121.field815 = var113 + var115;
                        var121.field803 = var107 + var115;
                        var121.field799 = var130;
                        var121.field833 = var115 * 128 + var123 * 64;
                        if (var120 < var119) {
                            byte var136 = var119;
                            var119 = var120;
                            var120 = var136;
                        }
                        var121.field834 = var116 + var120;
                        var121.field809 = var116 + var119;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V")
    public static final void method207(boolean arg0, byte arg1) {
        field495++;
        byte var2 = 4;
        byte[][] var3 = class241.field4191;
        int var4 = 0;
        if (arg1 != 114) {
            method207(true, (byte) 33);
        }
        while (var4 < var2) {
            class135.method1009((byte) 3);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class246.field4273[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x31305EF) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class157.field2741.length; var14++) {
                                if (class157.field2741[var14] == var13 && var3[var14] != null) {
                                    class254.method1767(class62.field1064, (byte) 44, var4, (var11 & 0x7) * 8, var3[var14], (var12 & 0x7) * 8, var5 * 8, var6 * 8, arg0, var10, var9);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class188.method1327(var6 * 8, (byte) -128, 8, var4, var5 * 8, 8);
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method208(int arg0) {
        field485 = null;
        field490 = null;
        field491 = null;
        field492 = null;
        field499 = null;
        field494 = null;
        if (arg0 != -1) {
            method207(true, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILff;)Loj;")
    public static final class138 method209(int arg0, int arg1, class3 arg2) {
        byte[] var3 = arg2.method42(-24324, arg0);
        if (arg1 < 17) {
            return null;
        } else {
            field489++;
            return var3 == null ? null : new class138(var3);
        }
    }
}
