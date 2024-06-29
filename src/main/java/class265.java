import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class265 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4553 = 0;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lok;")
    public static class146 field4560 = class235.method1724(-12908, " (X");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Loh;")
    public static class15 field4558;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 12)
    public static final void method1921(int arg0) {
        if (arg0 != -1) {
            field4560 = (class146) null;
        }
        field4561++;
        if (class199.field3331 == 151) {
            int var1 = client.field4080.method368(31);
            int var2 = class217.field3591 + ((var1 & 0x7D) >> 4);
            int var3 = class206.field3429 + (var1 & 0x7);
            int var4 = client.field4080.method352(255) + var2;
            int var5 = var3 + client.field4080.method352(255);
            int var6 = client.field4080.method343(arg0 + 26168);
            int var7 = client.field4080.method379(-2);
            int var8 = client.field4080.method368(66) * 4;
            int var9 = client.field4080.method368(-126) * 4;
            int var10 = client.field4080.method379(-2);
            int var11 = client.field4080.method379(-2);
            int var12 = client.field4080.method368(arg0 ^ 0x67);
            int var13 = client.field4080.method368(arg0 + 40);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var3 * 128 + 64;
                int var15 = var4 * 128 + 64;
                int var16 = var5 * 128 + 64;
                int var17 = var2 * 128 + 64;
                class46 var18 = new class46(var7, class203.field3387, var17, var14, class19.method141(var17, class203.field3387, var14, 119) - var8, class203.field3385 + var10, var11 + class203.field3385, var12, var13, var6, var9);
                var18.method322(class19.method141(var15, class203.field3387, var16, 121) - var9, class203.field3385 + var10, var16, arg0 - 20125, var15);
                class64.field1105.method1258(arg0 + 1, new class268(var18));
            }
        } else if (class199.field3331 == 15) {
            int var129 = client.field4080.method368(arg0 ^ 0xFFFFFFB2);
            int var130 = var129 >> 2;
            int var131 = class207.field3469[var130];
            int var132 = var129 & 0x3;
            int var133 = client.field4080.method341((byte) -116);
            int var134 = class217.field3591 + (var133 >> 4 & 0x7);
            int var135 = (var133 & 0x7) + class206.field3429;
            int var136 = client.field4080.method390((byte) -112);
            if (var136 == 65535) {
                var136 = -1;
            }
            class41.method292(var131, 103, var136, var132, var130, var134, class203.field3387, var135);
        } else if (class199.field3331 == 183) {
            int var120 = client.field4080.method368(arg0 - 104);
            int var121 = (var120 & 0x7) + class206.field3429;
            int var122 = (var120 >> 4 & 0x7) + class217.field3591;
            int var123 = client.field4080.method379(-2);
            int var124 = client.field4080.method368(-126);
            if (var123 == 65535) {
                var123 = -1;
            }
            int var125 = var124 & 0x7;
            int var126 = (var124 & 0xF9) >> 4;
            int var127 = client.field4080.method368(-108);
            if (var122 >= 0 && var121 >= 0 && var122 < 104 && var121 < 104) {
                int var128 = var126 + 1;
                if (class102.field1639.field5419[0] >= var122 - var128 && class102.field1639.field5419[0] <= (var122 + var128) && var121 - var128 <= class102.field1639.field5432[0] && var121 + var128 >= class102.field1639.field5432[0] && class236.field3936 != 0 && var125 > 0 && class89.field1428 < 50 && var123 != -1) {
                    class322.field5503[class89.field1428] = var123;
                    class174.field2918[class89.field1428] = var125;
                    class84.field1330[class89.field1428] = var127;
                    class250.field4187[class89.field1428] = null;
                    class40.field699[class89.field1428] = (var121 << 8) + (var122 << 16) + var126;
                    class89.field1428++;
                }
            }
        } else if (class199.field3331 == 243) {
            int var19 = client.field4080.method368(122);
            int var20 = (var19 & 0xF) + class206.field3429 * 2;
            int var21 = (var19 >> 4 & 0xF) + class217.field3591 * 2;
            int var22 = client.field4080.method352(255) + var21;
            int var23 = client.field4080.method352(255) + var20;
            int var24 = client.field4080.method343(26167);
            int var25 = client.field4080.method379(-2);
            int var26 = client.field4080.method368(-113) * 4;
            int var27 = client.field4080.method368(arg0 ^ 0xFFFFFF89) * 4;
            int var28 = client.field4080.method379(-2);
            int var29 = client.field4080.method379(-2);
            int var30 = client.field4080.method368(91);
            int var31 = client.field4080.method368(114);
            if (var21 >= 0 && var20 >= 0 && var21 < 208 && var20 < 208 && var22 >= 0 && var23 >= 0 && var22 < 208 && var23 < 208 && var25 != 65535) {
                int var32 = var23 * 64;
                int var33 = var22 * 64;
                int var34 = var20 * 64;
                int var35 = var21 * 64;
                class46 var36 = new class46(var25, class203.field3387, var35, var34, class19.method141(var35, class203.field3387, var34, arg0 + 118) - var26, class203.field3385 + var28, class203.field3385 + var29, var30, var31, var24, var27);
                var36.method322(class19.method141(var33, class203.field3387, var32, arg0 ^ 0xFFFFFF84) - var27, class203.field3385 + var28, var32, -20126, var33);
                class64.field1105.method1258(arg0 + 1, new class268(var36));
            }
        } else if (class199.field3331 == 74) {
            int var114 = client.field4080.method341((byte) -54);
            int var115 = class217.field3591 + ((var114 & 0x73) >> 4);
            int var116 = (var114 & 0x7) + class206.field3429;
            int var117 = client.field4080.method379(arg0 - 1);
            if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                class160 var118 = class268.field4614[class203.field3387][var115][var116];
                if (var118 != null) {
                    for (class39 var119 = (class39) var118.method1251(45); var119 != null; var119 = (class39) var118.method1253(arg0 ^ 0xFFFFFF95)) {
                        if ((var117 & 0x7FFF) == var119.field686.field3381) {
                            var119.method1325(-2935);
                            break;
                        }
                    }
                    if (var118.method1251(85) == null) {
                        class268.field4614[class203.field3387][var115][var116] = null;
                    }
                    class237.method1731(var116, 4, var115);
                }
            }
        } else if (class199.field3331 == 140) {
            int var106 = client.field4080.method336(-2);
            int var107 = client.field4080.method357((byte) -66);
            int var108 = ((var107 & 0x74) >> 4) + class217.field3591;
            int var109 = class206.field3429 + (var107 & 0x7);
            int var110 = client.field4080.method341((byte) -90);
            int var111 = var110 >> 2;
            int var112 = var110 & 0x3;
            int var113 = class207.field3469[var111];
            if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                class51.method418(var111, 0, class203.field3387, var113, -1, var108, 128, var106, var109, var112);
            }
        } else {
            if (class199.field3331 == 55) {
                int var37 = client.field4080.method346((byte) -1);
                int var38 = var37 >> 2;
                int var39 = var37 & 0x3;
                int var40 = class207.field3469[var38];
                byte var41 = client.field4080.method352(255);
                int var42 = client.field4080.method357((byte) -66);
                int var43 = class217.field3591 + (var42 >> 4 & 0x7);
                int var44 = (var42 & 0x7) + class206.field3429;
                int var45 = client.field4080.method336(-2);
                int var46 = client.field4080.method336(-2);
                byte var47 = client.field4080.method375((byte) -38);
                int var48 = client.field4080.method360(-1);
                int var49 = client.field4080.method360(-1);
                byte var50 = client.field4080.method352(255);
                byte var51 = client.field4080.method386((byte) 60);
                class234 var52;
                if (class161.field2730 == var45) {
                    var52 = class102.field1639;
                } else {
                    var52 = class75.field1215[var45];
                }
                if (!class271.field4640 && var52 != null) {
                    class5 var53 = class112.method756((byte) -127, var49);
                    int var54;
                    int var55;
                    if (var39 == 1 || var39 == 3) {
                        var55 = var53.field66;
                        var54 = var53.field62;
                    } else {
                        var54 = var53.field66;
                        var55 = var53.field62;
                    }
                    int var56 = (var54 >> 1) + var43;
                    int var57 = var43 + (var54 + 1 >> 1);
                    int var58 = var44 + (var55 + 1 >> 1);
                    int var59 = var44 + (var55 >> 1);
                    int[][] var60 = class174.field2914[class203.field3387];
                    int[][] var61 = (int[][]) null;
                    if (class203.field3387 < 3) {
                        var61 = class174.field2914[class203.field3387 + 1];
                    }
                    int var62 = (var43 << 7) + (var54 << 6);
                    int var63 = (var44 << 7) + (var55 << 6);
                    int var64 = var60[var56][var59] + var60[var57][var58] + var60[var57][var59] + var60[var56][var58] >> 2;
                    class50 var65 = var53.method27(var64, false, var62, var60, var38, var53.field128, var63, (byte) 92, var61, var39, (class315) null);
                    if (var65 != null) {
                        class51.method418(0, var48 + 1, class203.field3387, var40, var46 + 1, var43, 128, -1, var44, 0);
                        var52.field3908 = var48 + class203.field3385;
                        var52.field3895 = var44 * 128 + (var55 * 64);
                        var52.field3898 = var64;
                        var52.field3911 = var46 + class203.field3385;
                        var52.field3905 = (class208) var65.field900;
                        if (var50 < var41) {
                            byte var66 = var41;
                            var41 = var50;
                            var50 = var66;
                        }
                        if (var47 < var51) {
                            byte var67 = var51;
                            var51 = var47;
                            var47 = var67;
                        }
                        var52.field3893 = var43 + var50;
                        var52.field3909 = var44 + var51;
                        var52.field3896 = var43 * 128 + (var54 * 64);
                        var52.field3920 = var44 + var47;
                        var52.field3924 = var43 + var41;
                    }
                }
            }
            if (class199.field3331 == 246) {
                int var99 = client.field4080.method346((byte) -1);
                int var100 = ((var99 & 0x75) >> 4) + class217.field3591;
                int var101 = (var99 & 0x7) + class206.field3429;
                int var102 = client.field4080.method346((byte) -1);
                int var103 = var102 & 0x3;
                int var104 = var102 >> 2;
                int var105 = class207.field3469[var104];
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    class51.method418(var104, 0, class203.field3387, var105, -1, var100, 128, -1, var101, var103);
                }
            } else if (class199.field3331 == 196) {
                int var93 = client.field4080.method390((byte) -108);
                int var94 = client.field4080.method368(71);
                int var95 = (var94 >> 4 & 0x7) + class217.field3591;
                int var96 = (var94 & 0x7) + class206.field3429;
                int var97 = client.field4080.method360(-1);
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class203 var98 = new class203();
                    var98.field3386 = var93;
                    var98.field3381 = var97;
                    if (class268.field4614[class203.field3387][var95][var96] == null) {
                        class268.field4614[class203.field3387][var95][var96] = new class160();
                    }
                    class268.field4614[class203.field3387][var95][var96].method1258(0, new class39(var98));
                    class237.method1731(var96, arg0 - 83, var95);
                }
            } else if (class199.field3331 == 75) {
                int var84 = client.field4080.method368(arg0 ^ 0x68);
                int var85 = class217.field3591 + (var84 >> 4 & 0x7);
                int var86 = class206.field3429 + (var84 & 0x7);
                int var87 = client.field4080.method379(arg0 ^ 0x1);
                int var88 = client.field4080.method379(-2);
                int var89 = client.field4080.method379(-2);
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    class160 var90 = class268.field4614[class203.field3387][var85][var86];
                    if (var90 != null) {
                        for (class39 var91 = (class39) var90.method1251(-50); var91 != null; var91 = (class39) var90.method1253(73)) {
                            class203 var92 = var91.field686;
                            if ((var87 & 0x7FFF) == var92.field3381 && var92.field3386 == var88) {
                                var92.field3386 = var89;
                                break;
                            }
                        }
                        class237.method1731(var86, 102, var85);
                    }
                }
            } else if (class199.field3331 == 33) {
                int var77 = client.field4080.method379(-2);
                int var78 = client.field4080.method357((byte) -66);
                int var79 = ((var78 & 0x77) >> 4) + class217.field3591;
                int var80 = class206.field3429 + (var78 & 0x7);
                int var81 = client.field4080.method379(-2);
                int var82 = client.field4080.method336(-2);
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && class161.field2730 != var82) {
                    class203 var83 = new class203();
                    var83.field3381 = var77;
                    var83.field3386 = var81;
                    if (class268.field4614[class203.field3387][var79][var80] == null) {
                        class268.field4614[class203.field3387][var79][var80] = new class160();
                    }
                    class268.field4614[class203.field3387][var79][var80].method1258(0, new class39(var83));
                    class237.method1731(var80, arg0 ^ 0x54, var79);
                }
            } else if (class199.field3331 == 159) {
                int var68 = client.field4080.method368(34);
                int var69 = (var68 & 0x7) + class206.field3429;
                int var70 = class217.field3591 + ((var68 & 0x7D) >> 4);
                int var71 = client.field4080.method379(-2);
                int var72 = client.field4080.method368(70);
                int var73 = client.field4080.method379(arg0 - 1);
                if (var70 >= 0 && var69 >= 0 && var70 < 104 && var69 < 104) {
                    int var74 = var69 * 128 + 64;
                    int var75 = var70 * 128 + 64;
                    class106 var76 = new class106(var71, class203.field3387, var75, var74, class19.method141(var75, class203.field3387, var74, arg0 + 122) - var72, var73, class203.field3385);
                    class17.field345.method1258(0, new class44(var76));
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)V", line = 563)
    public static final void method1922(int arg0, byte arg1) {
        field4559++;
        if (arg1 <= 19) {
            method1927(false, 127, 92, -114, -24);
        }
        class226.field3765.method794(-17435, arg0);
        class159.field2689.method794(-17435, arg0);
        class85.field1348.method794(-17435, arg0);
        class205.field3402.method794(-17435, arg0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILok;)V", line = 581)
    public static final void method1923(int arg0, class146 arg1) {
        field4554++;
        class139.field2318 = arg1;
        if (class232.field3876.field2162 == null) {
            return;
        }
        if (arg0 != 619) {
            field4560 = (class146) null;
        }
        try {
            class146 var2 = class35.field656.method1089(-26, class232.field3876.field2162);
            class146 var3 = class207.field3466.method1089(-13, class232.field3876.field2162);
            class146 var4 = class112.method758(arg0 ^ 0x216, new class146[] { var2, class102.field1652, arg1, class140.field2338, var3 });
            class146 var5;
            if (arg1.method1094((byte) -10) == 0) {
                var5 = class112.method758(arg0 ^ 0x212, new class146[] { var4, class92.field1460 });
            } else {
                var5 = class112.method758(121, new class146[] { var4, class196.field3267, class3.method8((byte) -34, class67.method501(arg0 - 745) + 94608000000L), class43.field748, class238.method1736((byte) 61, 94608000L) });
            }
            class112.method758(-35, new class146[] { class180.field3031, var5, class9.field200 }).method1097(class232.field3876.field2162, (byte) -98);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IB)Lk;", line = 615)
    public static final class228 method1924(int arg0, byte arg1) {
        field4552++;
        if (class320.field5462 && class71.field1167 <= arg0 && class39.field697 >= arg0) {
            if (arg1 > -19) {
                method1923(-118, (class146) null);
            }
            return class279.field4783[arg0 - class71.field1167];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 740)
    public class265() {
        new class137();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 650)
    public static void method1925(byte arg0) {
        field4558 = null;
        int var1 = -82 / ((arg0 + 2) / 53);
        field4560 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 667)
    public static final void method1926(int arg0) {
        field4555++;
        if (class211.field3490 < 128) {
            class211.field3490 = 128;
        }
        class158.field2668 &= 0x7FF;
        int var1 = class254.field4237 >> 7;
        int var2 = class203.field3392 >> 7;
        if (class211.field3490 > 383) {
            class211.field3490 = 383;
        }
        int var3 = class19.method141(class254.field4237, class203.field3387, class203.field3392, 122);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class203.field3387;
                    if (var7 < 3 && (class46.field775[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class283.field4846[var7][var5][var6] & 0xFF) * 8 + var3 - class174.field2914[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (arg0 != 15) {
            return;
        }
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class184.field3073) {
            class184.field3073 += (var9 - class184.field3073) / 24;
        } else if (class184.field3073 > var9) {
            class184.field3073 += (var9 - class184.field3073) / 80;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIIII)V", line = 773)
    public static final void method1927(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4557++;
        boolean var5 = false;
        class145.field2424 = (long) arg4;
        int var6 = class157.method1228(1);
        if (arg2 == 3 || var6 == 3) {
            arg0 = true;
        }
        if (arg2 > 0 == var6 <= 0) {
            var5 = true;
        }
        if (class129.field2166.startsWith("mac") && arg2 > 0) {
            arg0 = true;
        }
        if (arg0 && arg2 > 0) {
            var5 = true;
        }
        client.method1788(arg3, var6, var5, arg2, arg1, arg0, (byte) 76);
    }
}
