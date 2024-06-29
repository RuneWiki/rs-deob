import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class211 {

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field3566 = -1;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lcg;")
    public static class49 field3567;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Ljk;")
    public static class99 field3564;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1567(int arg0) {
        field3563++;
        if (class40.field592 == 78) {
            int var1 = class276.field4398.method2348(255);
            int var2 = var1 & 0x3;
            int var3 = var1 >> 2;
            int var4 = class255.field4112[var3];
            int var5 = class276.field4398.method2355(18113);
            int var6 = (var5 >> 4 & 0x7) + class242.field3956;
            int var7 = (var5 & 0x7) + class320.field5069;
            int var8 = class276.field4398.method2339((byte) -46);
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class336.method2337(-1, var4, 0, var6, var7, var3, class205.field3497, var8, var2, 91);
            }
        } else if (class40.field592 == 17) {
            int var9 = class276.field4398.method2348(255);
            int var10 = var9 >> 2;
            int var11 = class255.field4112[var10];
            int var12 = var9 & 0x3;
            int var13 = class276.field4398.method2348(255);
            int var14 = (var13 & 0x7) + class320.field5069;
            int var15 = ((var13 & 0x7C) >> 4) + class242.field3956;
            if (var15 >= 0 && var14 >= 0 && var15 < 104 && var14 < 104) {
                class336.method2337(-1, var11, 0, var15, var14, var10, class205.field3497, -1, var12, 89);
            }
        } else if (class40.field592 == 191) {
            int var149 = class276.field4398.method2339((byte) -46);
            int var150 = class276.field4398.method2364(-9069);
            int var151 = (var150 >> 4 & 0x7) + class242.field3956;
            int var152 = (var150 & 0x7) + class320.field5069;
            int var153 = class276.field4398.method2350(false);
            int var154 = class276.field4398.method2328((byte) 113);
            if (var151 >= 0 && var152 >= 0 && var151 < 104 && var152 < 104 && class316.field5010 != var149) {
                class255 var155 = new class255();
                var155.field4108 = var154;
                var155.field4107 = var153;
                if (class214.field3591[class205.field3497][var151][var152] == null) {
                    class214.field3591[class205.field3497][var151][var152] = new class331();
                }
                class214.field3591[class205.field3497][var151][var152].method2303((byte) -124, new class308(var155));
                class107.method936(var152, arg0 + 1, var151);
            }
        } else {
            if (class40.field592 == 138) {
                int var16 = class276.field4398.method2312(arg0 ^ 0x5FB9);
                int var17 = class276.field4398.method2364(-9069);
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                byte var20 = class276.field4398.method2361(false);
                int var21 = class276.field4398.method2362(95);
                int var22 = class276.field4398.method2348(arg0 + 256);
                int var23 = ((var22 & 0x74) >> 4) + class242.field3956;
                int var24 = class320.field5069 + (var22 & 0x7);
                int var25 = class276.field4398.method2362(arg0 ^ 0xFFFFFFA8);
                byte var26 = class276.field4398.method2361(false);
                byte var27 = class276.field4398.method2373((byte) -99);
                int var28 = class276.field4398.method2328((byte) 124);
                byte var29 = class276.field4398.method2323(arg0 + 106);
                if (!class43.field680) {
                    class328.method2279(var28, var19, var20, var25, var26, var23, var21, var29, var18, var24, (byte) -14, var27, var16);
                }
            }
            if (class40.field592 == 224) {
                int var131 = class276.field4398.method2364(-9069);
                int var132 = (var131 >> 4 & 0xF) + class242.field3956 * 2;
                int var133 = class320.field5069 * 2 + (var131 & 0xF);
                int var134 = class276.field4398.method2323(125) + var132;
                int var135 = class276.field4398.method2323(116) + var133;
                int var136 = class276.field4398.method2326(-116);
                int var137 = class276.field4398.method2339((byte) -46);
                int var138 = class276.field4398.method2364(-9069) * 4;
                int var139 = class276.field4398.method2364(-9069) * 4;
                int var140 = class276.field4398.method2339((byte) -46);
                int var141 = class276.field4398.method2339((byte) -46);
                int var142 = class276.field4398.method2364(arg0 - 9068);
                if (var142 == 255) {
                    var142 = -1;
                }
                int var143 = class276.field4398.method2364(-9069);
                if (var132 >= 0 && var133 >= 0 && var132 < 208 && var133 < 208 && var134 >= 0 && var135 >= 0 && var134 < 208 && var135 < 208 && var137 != 65535) {
                    int var144 = var133 * 64;
                    int var145 = var132 * 64;
                    class219 var146 = new class219(var137, class205.field3497, var145, var144, class223.method1627((byte) -125, var144, var145, class205.field3497) - var138, class181.field3045 + var140, class181.field3045 + var141, var142, var143, var136, var139);
                    int var147 = var134 * 64;
                    int var148 = var135 * 64;
                    var146.method1611(class181.field3045 + var140, var147, -123, class223.method1627((byte) -123, var148, var147, class205.field3497) - var139, var148);
                    class178.field3018.method2303((byte) -124, new class249(var146));
                }
            } else if (class40.field592 == 149) {
                int var30 = class276.field4398.method2364(-9069);
                int var31 = (var30 & 0x7) + class320.field5069;
                int var32 = class242.field3956 + (var30 >> 4 & 0x7);
                int var33 = class276.field4398.method2339((byte) -46);
                int var34 = class276.field4398.method2364(arg0 - 9068);
                int var35 = class276.field4398.method2364(-9069);
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var36 = (var34 & 0xFE) >> 4;
                int var37 = var34 & 0x7;
                int var38 = class276.field4398.method2364(-9069);
                if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                    int var39 = var36 + 1;
                    if (class218.field3632.field1975[0] >= var32 - var39 && (var32 + var39) >= class218.field3632.field1975[0] && class218.field3632.field2034[0] >= (var31 - var39) && class218.field3632.field2034[0] <= (var31 + var39) && class29.field393 != 0 && var37 > 0 && class131.field2256 < 50 && var33 != -1) {
                        class123.field2135[class131.field2256] = var33;
                        class4.field62[class131.field2256] = var37;
                        class271.field4320[class131.field2256] = var35;
                        class133.field2272[class131.field2256] = null;
                        class329.field5241[class131.field2256] = (var31 << 8) + (var32 << 16) + var36;
                        class170.field2941[class131.field2256] = var38;
                        class131.field2256++;
                    }
                }
            } else if (class40.field592 == 109) {
                int var40 = class276.field4398.method2364(-9069);
                int var41 = class242.field3956 + (var40 >> 4 & 0x7);
                int var42 = class320.field5069 + (var40 & 0x7);
                int var43 = var41 + class276.field4398.method2323(101);
                int var44 = class276.field4398.method2323(126) + var42;
                int var45 = class276.field4398.method2326(82);
                int var46 = class276.field4398.method2339((byte) -46);
                int var47 = class276.field4398.method2364(arg0 - 9068) * 4;
                int var48 = class276.field4398.method2364(-9069) * 4;
                int var49 = class276.field4398.method2339((byte) -46);
                int var50 = class276.field4398.method2339((byte) -46);
                int var51 = class276.field4398.method2364(-9069);
                int var52 = class276.field4398.method2364(-9069);
                if (var51 == 255) {
                    var51 = -1;
                }
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && var46 != 65535) {
                    int var53 = var42 * 128 + 64;
                    int var54 = var44 * 128 + 64;
                    int var55 = var43 * 128 + 64;
                    int var56 = var41 * 128 + 64;
                    class219 var57 = new class219(var46, class205.field3497, var56, var53, class223.method1627((byte) -127, var53, var56, class205.field3497) - var47, class181.field3045 + var49, class181.field3045 + var50, var51, var52, var45, var48);
                    var57.method1611(class181.field3045 + var49, var55, 126, class223.method1627((byte) -123, var54, var55, class205.field3497) - var48, var54);
                    class178.field3018.method2303((byte) -124, new class249(var57));
                }
            } else if (class40.field592 == 228) {
                int var58 = class276.field4398.method2339((byte) -46);
                int var59 = class276.field4398.method2364(arg0 ^ 0x236C);
                class92.method798((byte) 104, var58).method836(-23248, var59);
            } else if (class40.field592 == 122) {
                int var60 = class276.field4398.method2363(48);
                int var61 = ((var60 & 0x72) >> 4) + class242.field3956;
                int var62 = (var60 & 0x7) + class320.field5069;
                int var63 = class276.field4398.method2362(95);
                int var64 = class276.field4398.method2328((byte) 124);
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                    class255 var65 = new class255();
                    var65.field4108 = var64;
                    var65.field4107 = var63;
                    if (class214.field3591[class205.field3497][var61][var62] == null) {
                        class214.field3591[class205.field3497][var61][var62] = new class331();
                    }
                    class214.field3591[class205.field3497][var61][var62].method2303((byte) -124, new class308(var65));
                    class107.method936(var62, 0, var61);
                }
            } else if (class40.field592 == 225) {
                int var66 = class276.field4398.method2364(-9069);
                int var67 = class242.field3956 + (var66 >> 4 & 0x7);
                int var68 = (var66 & 0x7) + class320.field5069;
                int var69 = class276.field4398.method2339((byte) -46);
                int var70 = class276.field4398.method2339((byte) -46);
                int var71 = class276.field4398.method2339((byte) -46);
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    class331 var72 = class214.field3591[class205.field3497][var67][var68];
                    if (var72 != null) {
                        for (class308 var73 = (class308) var72.method2297(arg0 ^ 0xFFFFC883); var73 != null; var73 = (class308) var72.method2291(arg0 - 126)) {
                            class255 var74 = var73.field4903;
                            if ((var69 & 0x7FFF) == var74.field4107 && var74.field4108 == var70) {
                                var74.field4108 = var71;
                                break;
                            }
                        }
                        class107.method936(var68, 0, var67);
                    }
                }
            } else if (class40.field592 == 81) {
                int var122 = class276.field4398.method2364(-9069);
                int var123 = (var122 & 0x7) + class320.field5069;
                int var124 = class242.field3956 + ((var122 & 0x75) >> 4);
                int var125 = class276.field4398.method2339((byte) -46);
                int var126 = class276.field4398.method2364(-9069);
                int var127 = class276.field4398.method2339((byte) -46);
                if (var124 >= 0 && var123 >= 0 && var124 < 104 && var123 < 104) {
                    int var128 = var123 * 128 + 64;
                    int var129 = var124 * 128 + 64;
                    class316 var130 = new class316(var125, class205.field3497, var129, var128, class223.method1627((byte) -127, var128, var129, class205.field3497) - var126, var127, class181.field3045);
                    class238.field3897.method2303((byte) -124, new class239(var130));
                }
            } else {
                if (arg0 != -1) {
                    method1568((char) 65501, false);
                }
                if (class40.field592 == 199) {
                    int var116 = class276.field4398.method2355(arg0 ^ 0xFFFFB93E);
                    int var117 = (var116 >> 4 & 0x7) + class242.field3956;
                    int var118 = (var116 & 0x7) + class320.field5069;
                    int var119 = class276.field4398.method2339((byte) -46);
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                        class331 var120 = class214.field3591[class205.field3497][var117][var118];
                        if (var120 != null) {
                            for (class308 var121 = (class308) var120.method2297(14204); var121 != null; var121 = (class308) var120.method2291(70)) {
                                if ((var119 & 0x7FFF) == var121.field4903.field4107) {
                                    var121.method2195(-1);
                                    break;
                                }
                            }
                            if (var120.method2297(14204) == null) {
                                class214.field3591[class205.field3497][var117][var118] = null;
                            }
                            class107.method936(var118, 0, var117);
                        }
                    }
                } else if (class40.field592 == 73) {
                    int var75 = class276.field4398.method2364(-9069);
                    int var76 = (var75 & 0xF) + class320.field5069 * 2;
                    int var77 = (var75 >> 4 & 0xF) + class242.field3956 * 2;
                    int var78 = var77 + class276.field4398.method2323(arg0 - 45);
                    int var79 = class276.field4398.method2323(105) + var76;
                    int var80 = class276.field4398.method2326(-63);
                    int var81 = class276.field4398.method2326(115);
                    int var82 = class276.field4398.method2339((byte) -46);
                    int var83 = class276.field4398.method2323(112);
                    int var84 = class276.field4398.method2364(arg0 ^ 0x236C) * 4;
                    int var85 = class276.field4398.method2339((byte) -46);
                    int var86 = class276.field4398.method2339((byte) -46);
                    int var87 = class276.field4398.method2364(arg0 ^ 0x236C);
                    if (var87 == 255) {
                        var87 = -1;
                    }
                    int var88 = class276.field4398.method2364(-9069);
                    if (var77 >= 0 && var76 >= 0 && var77 < 208 && var76 < 208 && var78 >= 0 && var79 >= 0 && var78 < 208 && var79 < 208 && var82 != 65535) {
                        int var89 = var79 * 64;
                        int var90 = var76 * 64;
                        int var91 = var78 * 64;
                        int var92 = var77 * 64;
                        if (var80 != 0) {
                            int var94;
                            class116 var96;
                            if (var80 < 0) {
                                int var93 = -var80 - 1;
                                var94 = (var93 & 0x79AA) >> 11;
                                int var95 = var93 & 0x7FF;
                                if (class316.field5010 == var95) {
                                    var96 = class218.field3632;
                                } else {
                                    var96 = class135.field2359[var95];
                                }
                            } else {
                                int var97 = var80 - 1;
                                var94 = var97 >> 11 & 0xF;
                                int var98 = var97 & 0x7FF;
                                var96 = class320.field5071[var98];
                            }
                            if (var96 != null) {
                                class346 var99 = var96.method980((byte) 73);
                                if (var99.field5525 != null && var99.field5525[var94] != null) {
                                    var83 -= var99.field5525[var94][1];
                                    int var100 = var99.field5525[var94][0];
                                    int var101 = class62.field961[var96.field1946];
                                    int var102 = class62.field962[var96.field1946];
                                    int var103 = var99.field5525[var94][2];
                                    int var104 = var100 * var101 + var102 * var103 >> 16;
                                    int var105 = var101 * var103 - (var100 * var102) >> 16;
                                    var90 += var105;
                                    var92 += var104;
                                }
                            }
                        }
                        class219 var107 = new class219(var82, class205.field3497, var92, var90, class223.method1627((byte) -121, var90, var92, class205.field3497) - var83, class181.field3045 + var85, class181.field3045 + var86, var87, var88, var81, var84);
                        var107.method1611(class181.field3045 + var85, var91, -111, class223.method1627((byte) -124, var89, var91, class205.field3497) - var84, var89);
                        class178.field3018.method2303((byte) -124, new class249(var107));
                    }
                } else if (class40.field592 == 30) {
                    int var108 = class276.field4398.method2328((byte) 119);
                    if (var108 == 65535) {
                        var108 = -1;
                    }
                    int var109 = class276.field4398.method2355(18113);
                    int var110 = class242.field3956 + (var109 >> 4 & 0x7);
                    int var111 = class320.field5069 + (var109 & 0x7);
                    int var112 = class276.field4398.method2348(255);
                    int var113 = var112 >> 2;
                    int var114 = var112 & 0x3;
                    int var115 = class255.field4112[var113];
                    class284.method1938(var113, var111, var114, var115, class205.field3497, var110, var108, 29067);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(CZ)C", line = 602)
    public static final char method1568(char arg0, boolean arg1) {
        field3565++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        if (arg1) {
            method1569(true);
        }
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 634)
    public static void method1569(boolean arg0) {
        field3567 = null;
        field3564 = null;
        if (arg0) {
            method1569(false);
        }
    }
}
