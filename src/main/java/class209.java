import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class209 extends class103 {

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field3533 = 1;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "[I")
    public static int[] field3527 = new int[2];

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Lda;")
    public static class275 field3538 = class255.method1672(115, " <col=ffff00>");

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Lda;")
    public static class275 field3540 = class255.method1672(117, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "[I")
    public static int[] field3531;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "[Lrj;")
    public static class13[] field3539;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "[Lkb;")
    public static class259[] field3537;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field3531 = null;
        field3537 = null;
        field3527 = null;
        field3540 = null;
        field3539 = null;
        if (arg0 != 7) {
            field3538 = null;
        }
        field3538 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z")
    public final boolean method1343(int arg0, int arg1, int arg2) {
        field3532++;
        if (arg0 >= -104) {
            method1346(-19, (class105) null, 48, (byte) 97);
        }
        return this.field3534 <= arg1 && arg1 <= this.field3530 && this.field3529 <= arg2 && this.field3526 >= arg2;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        field3528++;
        if (class268.field4650 == 33) {
            int var1 = class196.field3351.method564((byte) 92);
            int var2 = (var1 & 0x7) + class199.field3395;
            int var3 = class139.field2431 + ((var1 & 0x7E) >> 4);
            int var4 = class196.field3351.method581(arg0 ^ 0x88) + var3;
            int var5 = class196.field3351.method581(arg0 - 120) + var2;
            int var6 = class196.field3351.method570(255);
            int var7 = class196.field3351.method608(109);
            int var8 = class196.field3351.method564((byte) 107) * 4;
            int var9 = class196.field3351.method564((byte) 109) * 4;
            int var10 = class196.field3351.method608(41);
            int var11 = class196.field3351.method608(arg0 - 7);
            int var12 = class196.field3351.method564((byte) 111);
            int var13 = class196.field3351.method564((byte) 120);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var5 * 128 + 64;
                int var15 = var4 * 128 + 64;
                int var16 = var2 * 128 + 64;
                int var17 = var3 * 128 + 64;
                class156 var18 = new class156(var7, class159.field2790, var17, var16, class89.method647(var16, class159.field2790, var17, -90) - var8, class35.field576 + var10, var11 + class35.field576, var12, var13, var6, var9);
                var18.method1103(class35.field576 + var10, var14, var15, 122, class89.method647(var14, class159.field2790, var15, arg0 - 246) - var9);
                class216.field3696.method547(104, new class169(var18));
            }
        } else if (class268.field4650 == 135) {
            int var19 = class196.field3351.method567(-119);
            int var20 = ((var19 & 0x70) >> 4) + class139.field2431;
            int var21 = class199.field3395 + (var19 & 0x7);
            int var22 = class196.field3351.method608(22);
            int var23 = class196.field3351.method562(arg0 - 247);
            int var24 = class196.field3351.method562(-119);
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104 && class11.field167 != var22) {
                class92 var25 = new class92();
                var25.field1567 = var23;
                var25.field1563 = var24;
                if (class118.field2122[class159.field2790][var20][var21] == null) {
                    class118.field2122[class159.field2790][var20][var21] = new class84();
                }
                class118.field2122[class159.field2790][var20][var21].method547(104, new class256(var25));
                class5.method20(var21, arg0 ^ 0xFFFFE7AC, var20);
            }
        } else if (class268.field4650 == 233) {
            int var26 = class196.field3351.method564((byte) 71);
            int var27 = class199.field3395 + (var26 & 0x7);
            int var28 = ((var26 & 0x7D) >> 4) + class139.field2431;
            int var29 = class196.field3351.method608(80);
            int var30 = class196.field3351.method608(arg0 - 41);
            int var31 = class196.field3351.method608(arg0 ^ 0xF2);
            if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                class84 var32 = class118.field2122[class159.field2790][var28][var27];
                if (var32 != null) {
                    for (class256 var33 = (class256) var32.method550(arg0 ^ 0xFFFFFF52); var33 != null; var33 = (class256) var32.method545(arg0 - 24)) {
                        class92 var34 = var33.field4507;
                        if ((var29 & 0x7FFF) == var34.field1567 && var34.field1563 == var30) {
                            var34.field1563 = var31;
                            break;
                        }
                    }
                    class5.method20(var27, -6356, var28);
                }
            }
        } else if (class268.field4650 == 170) {
            int var35 = class196.field3351.method562(-121);
            if (var35 == 65535) {
                var35 = -1;
            }
            int var36 = class196.field3351.method564((byte) 87);
            int var37 = var36 & 0x3;
            int var38 = var36 >> 2;
            int var39 = class149.field2604[var38];
            int var40 = class196.field3351.method559(0);
            int var41 = (var40 >> 4 & 0x7) + class139.field2431;
            int var42 = (var40 & 0x7) + class199.field3395;
            class144.method1031(15854, var35, var37, var42, var38, var39, class159.field2790, var41);
        } else if (class268.field4650 == 109) {
            int var43 = class196.field3351.method564((byte) 112);
            int var44 = class139.field2431 + ((var43 & 0x75) >> 4);
            int var45 = class199.field3395 + (var43 & 0x7);
            int var46 = class196.field3351.method608(arg0 - 76);
            if (var46 == 65535) {
                var46 = -1;
            }
            int var47 = class196.field3351.method564((byte) 101);
            int var48 = class196.field3351.method564((byte) 116);
            int var49 = (var47 & 0xF5) >> 4;
            int var50 = var47 & 0x7;
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                int var51 = var49 + 1;
                if (class66.field1094.field1752[0] >= (var44 - var51) && class66.field1094.field1752[0] <= var44 + var51 && var45 - var51 <= class66.field1094.field1722[0] && class66.field1094.field1722[0] <= (var45 + var51) && class173.field3006 != 0 && var50 > 0 && class17.field247 < 50 && var46 != -1) {
                    class270.field4701[class17.field247] = var46;
                    class70.field1146[class17.field247] = var50;
                    class191.field3280[class17.field247] = var48;
                    class25.field414[class17.field247] = null;
                    class196.field3350[class17.field247] = (var44 << 16) + (var45 << 8) + var49;
                    class17.field247++;
                }
            }
        } else if (class268.field4650 == 186) {
            int var52 = class196.field3351.method564((byte) 93);
            int var53 = (var52 >> 4 & 0xF) + class139.field2431 * 2;
            int var54 = (var52 & 0xF) + class199.field3395 * 2;
            int var55 = class196.field3351.method581(8) + var53;
            int var56 = var54 + class196.field3351.method581(8);
            int var57 = class196.field3351.method570(255);
            int var58 = class196.field3351.method608(arg0 ^ 0xD9);
            int var59 = class196.field3351.method564((byte) 63) * 4;
            int var60 = class196.field3351.method564((byte) 105) * 4;
            int var61 = class196.field3351.method608(105);
            int var62 = class196.field3351.method608(89);
            int var63 = class196.field3351.method564((byte) 99);
            int var64 = class196.field3351.method564((byte) 107);
            if (var53 >= 0 && var54 >= 0 && var53 < 208 && var54 < 208 && var55 >= 0 && var56 >= 0 && var55 < 208 && var56 < 208 && var58 != 65535) {
                int var65 = var54 * 64;
                int var66 = var55 * 64;
                int var67 = var56 * 64;
                int var68 = var53 * 64;
                class156 var69 = new class156(var58, class159.field2790, var68, var65, class89.method647(var65, class159.field2790, var68, 125) - var59, var61 - -class35.field576, var62 + class35.field576, var63, var64, var57, var60);
                var69.method1103(class35.field576 + var61, var67, var66, arg0 ^ 0xFFFFFF23, class89.method647(var67, class159.field2790, var66, arg0 - 5) - var60);
                class216.field3696.method547(104, new class169(var69));
            }
        } else if (class268.field4650 == 239) {
            int var70 = class196.field3351.method562(-127);
            int var71 = class196.field3351.method608(58);
            int var72 = class196.field3351.method603((byte) -51);
            int var73 = ((var72 & 0x7B) >> 4) + class139.field2431;
            int var74 = (var72 & 0x7) + class199.field3395;
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                class92 var75 = new class92();
                var75.field1567 = var70;
                var75.field1563 = var71;
                if (class118.field2122[class159.field2790][var73][var74] == null) {
                    class118.field2122[class159.field2790][var73][var74] = new class84();
                }
                class118.field2122[class159.field2790][var73][var74].method547(arg0 ^ 0xE8, new class256(var75));
                class5.method20(var74, arg0 ^ 0xFFFFE7AC, var73);
            }
        } else {
            if (class268.field4650 == 175) {
                int var76 = class196.field3351.method562(-126);
                int var77 = class196.field3351.method580(true);
                int var78 = class196.field3351.method580(true);
                byte var79 = class196.field3351.method609(-205131416);
                int var80 = class196.field3351.method564((byte) 69);
                int var81 = class199.field3395 + (var80 & 0x7);
                int var82 = class139.field2431 + (var80 >> 4 & 0x7);
                byte var83 = class196.field3351.method581(8);
                int var84 = class196.field3351.method566(arg0 - 129);
                byte var85 = class196.field3351.method581(8);
                int var86 = class196.field3351.method603((byte) -55);
                int var87 = var86 >> 2;
                int var88 = var86 & 0x3;
                int var89 = class149.field2604[var87];
                byte var90 = class196.field3351.method609(arg0 ^ 0xF3C5F1E8);
                class109 var91;
                if (class11.field167 == var84) {
                    var91 = class66.field1094;
                } else {
                    var91 = class16.field238[var84];
                }
                if (var91 != null) {
                    class34 var92 = class146.method1040(-83, var76);
                    int var93;
                    int var94;
                    if (var88 == 1 || var88 == 3) {
                        var94 = var92.field526;
                        var93 = var92.field559;
                    } else {
                        var93 = var92.field526;
                        var94 = var92.field559;
                    }
                    int var95 = var81 + (var93 >> 1);
                    int var96 = (var94 >> 1) + var82;
                    int var97 = (var94 + 1 >> 1) + var82;
                    int var98 = (var93 + 1 >> 1) + var81;
                    int[][] var99 = null;
                    if (class159.field2790 < 3) {
                        var99 = class92.field1575[class159.field2790 + 1];
                    }
                    int[][] var100 = class92.field1575[class159.field2790];
                    int var101 = (var81 << 7) + (var93 << 6);
                    int var102 = var100[var96][var95] + var100[var97][var95] + var100[var96][var98] + var100[var97][var98] >> 2;
                    int var103 = (var82 << 7) + (var94 << 6);
                    class159 var104 = var92.method193(var100, var99, (class20) null, var87, var102, var103, var101, false, var88, var92.field542, arg0 - 178);
                    if (var104 != null) {
                        class116.method844(arg0 ^ 0xFFFFFF06, var82, var78 + 1, var81, var89, 0, -1, class159.field2790, var77 + 1, 0);
                        var91.field1922 = var102;
                        if (var85 > var83) {
                            byte var105 = var85;
                            var85 = var83;
                            var83 = var105;
                        }
                        var91.field1931 = var81 * 128 + var93 * 64;
                        var91.field1912 = class35.field576 + var77;
                        var91.field1916 = var82 + var83;
                        var91.field1909 = class35.field576 + var78;
                        var91.field1904 = (class176) var104.field2788;
                        var91.field1937 = var82 + var85;
                        if (var90 < var79) {
                            byte var106 = var79;
                            var79 = var90;
                            var90 = var106;
                        }
                        var91.field1894 = var79 + var81;
                        var91.field1902 = var82 * 128 + var94 * 64;
                        var91.field1930 = var81 + var90;
                    }
                }
            }
            if (arg0 == 128) {
                if (class268.field4650 == 243) {
                    int var107 = class196.field3351.method564((byte) 81);
                    int var108 = (var107 >> 4 & 0x7) + class139.field2431;
                    int var109 = (var107 & 0x7) + class199.field3395;
                    int var110 = class196.field3351.method608(20);
                    int var111 = class196.field3351.method564((byte) 65);
                    int var112 = class196.field3351.method608(123);
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        int var113 = var108 * 128 + 64;
                        int var114 = var109 * 128 + 64;
                        class178 var115 = new class178(var110, class159.field2790, var113, var114, class89.method647(var114, class159.field2790, var113, 121) - var111, var112, class35.field576);
                        class141.field2494.method547(104, new class162(var115));
                    }
                } else if (class268.field4650 == 223) {
                    int var116 = class196.field3351.method603((byte) -83);
                    int var117 = var116 & 0x3;
                    int var118 = var116 >> 2;
                    int var119 = class149.field2604[var118];
                    int var120 = class196.field3351.method580(true);
                    int var121 = class196.field3351.method603((byte) -91);
                    int var122 = ((var121 & 0x7F) >> 4) + class139.field2431;
                    int var123 = (var121 & 0x7) + class199.field3395;
                    if (var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104) {
                        class116.method844(107, var122, 0, var123, var119, var117, var120, class159.field2790, -1, var118);
                    }
                } else if (class268.field4650 == 18) {
                    int var124 = class196.field3351.method603((byte) -53);
                    int var125 = var124 & 0x3;
                    int var126 = var124 >> 2;
                    int var127 = class149.field2604[var126];
                    int var128 = class196.field3351.method603((byte) -62);
                    int var129 = class199.field3395 + (var128 & 0x7);
                    int var130 = (var128 >> 4 & 0x7) + class139.field2431;
                    if (var130 >= 0 && var129 >= 0 && var130 < 104 && var129 < 104) {
                        class116.method844(95, var130, 0, var129, var127, var125, -1, class159.field2790, -1, var126);
                    }
                } else if (class268.field4650 == 130) {
                    int var131 = class196.field3351.method566(-1);
                    int var132 = class196.field3351.method567(-101);
                    int var133 = ((var132 & 0x7D) >> 4) + class139.field2431;
                    int var134 = (var132 & 0x7) + class199.field3395;
                    if (var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104) {
                        class84 var135 = class118.field2122[class159.field2790][var133][var134];
                        if (var135 != null) {
                            for (class256 var136 = (class256) var135.method550(arg0 - 167); var136 != null; var136 = (class256) var135.method545(arg0 - 24)) {
                                if ((var131 & 0x7FFF) == var136.field4507.field1567) {
                                    var136.method741(3);
                                    break;
                                }
                            }
                            if (var135.method550(-86) == null) {
                                class118.field2122[class159.field2790][var133][var134] = null;
                            }
                            class5.method20(var134, arg0 ^ 0xFFFFE7AC, var133);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
    public static final void method1345(int arg0, int arg1) {
        field3527 = new int[arg0];
        class32.field482 = new int[arg0];
        field3536++;
        if (arg1 != 0) {
            field3540 = null;
        }
        class256.field4508 = new int[arg0];
        class205.field3478 = new int[arg0];
        class23.field350 = new int[arg0];
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIII)V")
    public class209(int arg0, int arg1, int arg2, int arg3) {
        this.field3530 = arg2;
        this.field3534 = arg0;
        this.field3529 = arg1;
        this.field3526 = arg3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILma;IB)Lrk;")
    public static final class20 method1346(int arg0, class105 arg1, int arg2, byte arg3) {
        field3535++;
        if (class210.method1353(arg0, arg1, arg2, (byte) -88)) {
            if (arg3 < 81) {
                field3531 = null;
            }
            return class3.method13(0);
        } else {
            return null;
        }
    }
}
