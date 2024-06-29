import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class208 extends class335 {

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    private int field3189 = 1;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    private int field3194 = 1;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    private int field3193 = 204;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3183 = "rating: ";

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "Z")
    public static boolean field3191 = true;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "[Lmi;")
    public static class12[] field3190;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[I", line = 6)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            return (int[]) null;
        }
        field3195++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            for (int var4 = 0; var4 < class105.field1630; var4++) {
                int var5 = class90.field1437[var4];
                int var6 = class280.field4316[arg0];
                int var7 = this.field3189 * var5 >> 12;
                int var8 = this.field3194 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3189) * this.field3189;
                int var10 = var6 % (4096 / this.field3194) * this.field3194;
                if (var10 < this.field3193) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field3193) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field3193) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V", line = 96)
    public static void method1478(int arg0) {
        field3190 = null;
        field3183 = null;
        if (arg0 <= 87) {
            method1478(49);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 106)
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILkh;I)V", line = 113)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field3187++;
        if (arg0 == 0) {
            this.field3189 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field3194 = arg1.method1178(0);
        } else if (arg0 == 2) {
            this.field3193 = arg1.method1151(-75);
        }
        if (arg2 <= 51) {
            method1478(-42);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;", line = 160)
    public static final String[] method1479(byte arg0, String arg1, char arg2) {
        int var3 = 0;
        int var4 = class2.method14(arg1, arg2, 0);
        String[] var5 = new String[var4 + 1];
        field3184++;
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            int var8;
            for (var8 = var3; arg1.charAt(var8) != arg2; var8++) {
            }
            var5[var6++] = arg1.substring(var3, var8);
            var3 = var8 + 1;
        }
        if (arg0 <= 39) {
            field3183 = (String) null;
        }
        var5[var4] = arg1.substring(var3);
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII[Ltb;II)V", line = 191)
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class220[] arg7, int arg8, int arg9) {
        field3192++;
        if (class94.field1516) {
            class167.method1187(arg9, arg2, arg3, arg6);
        } else {
            class109.method806(arg9, arg2, arg3, arg6);
            class15.method121();
        }
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class220 var11 = arg7[var10];
            if (var11 != null && (var11.field3393 == arg5 || arg5 == -1412584499 && class222.field3537 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class342.field5326[class169.field2560] = var11.field3361 + arg0;
                    class43.field693[class169.field2560] = var11.field3464 + arg8;
                    class80.field1270[class169.field2560] = var11.field3526;
                    class116.field1780[class169.field2560] = var11.field3458;
                    var12 = class169.field2560++;
                } else {
                    var12 = arg4;
                }
                var11.field3482 = class227.field3618;
                var11.field3506 = var12;
                if (!var11.field3445 || !client.method386(var11)) {
                    if (var11.field3427 > 0) {
                        class211.method1488(var11, (byte) -92);
                    }
                    int var13 = var11.field3361 + arg0;
                    int var14 = var11.field3464 + arg8;
                    int var15 = var11.field3381;
                    if (class175.field2653 && (client.method393(var11).field2403 != 0 || var11.field3468 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class222.field3537 == var11) {
                        if (arg5 != -1412584499 && !var11.field3493) {
                            class120.field1835 = arg8;
                            class142.field2209 = arg0;
                            class120.field1828 = arg7;
                            continue;
                        }
                        if (!var11.field3493) {
                            var15 = 128;
                        }
                        if (class203.field3041 && class136.field2153) {
                            int var16 = class253.field3984;
                            int var17 = class119.field1815;
                            int var18 = var16 - class77.field1245;
                            if (var18 < class165.field2471) {
                                var18 = class165.field2471;
                            }
                            if (class165.field2471 + class125.field1957.field3458 < var18 - -var11.field3458) {
                                var18 = class165.field2471 + class125.field1957.field3458 - var11.field3458;
                            }
                            int var19 = var17 - class136.field2152;
                            var14 = var18;
                            if (class70.field1144 > var19) {
                                var19 = class70.field1144;
                            }
                            if ((class70.field1144 + class125.field1957.field3526) < (var11.field3526 + var19)) {
                                var19 = class70.field1144 + class125.field1957.field3526 - var11.field3526;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field3468 == 2) {
                        var20 = arg9;
                        var25 = arg6;
                        var21 = arg2;
                        var24 = arg3;
                    } else {
                        var20 = var13 <= arg9 ? arg9 : var13;
                        var21 = arg2 < var14 ? var14 : arg2;
                        int var22 = var14 + var11.field3458;
                        int var23 = var13 + var11.field3526;
                        if (var11.field3468 == 9) {
                            var23++;
                            var22++;
                        }
                        var24 = arg3 <= var23 ? arg3 : var23;
                        var25 = arg6 > var22 ? var22 : arg6;
                    }
                    if (!var11.field3445 || var20 < var24 && var25 > var21) {
                        if (var11.field3427 != 0) {
                            if (var11.field3427 == 1337 || var11.field3427 == 1403) {
                                class276.field4263 = var14;
                                class141.field2182 = var13;
                                class107.field1675 = var11;
                                class59.method473(var11.field3427 == 1403, var11.field3526, var11.field3458, var13, 0, var14);
                                class34.field510[var12] = true;
                                if (class94.field1516) {
                                    class167.method1187(arg9, arg2, arg3, arg6);
                                } else {
                                    class109.method806(arg9, arg2, arg3, arg6);
                                }
                                continue;
                            }
                            if (var11.field3427 == 1338) {
                                if (!var11.method1558((byte) 127)) {
                                    continue;
                                }
                                class270.method1858(var13, -22562, var11, var12, var14);
                                if (class94.field1516) {
                                    class167.method1187(arg9, arg2, arg3, arg6);
                                } else {
                                    class109.method806(arg9, arg2, arg3, arg6);
                                }
                                if (class202.field3035 != 0 && class202.field3035 != 3 || class339.field5305 || class227.field3616 < var20 || class22.field348 < var21 || var24 <= class227.field3616 || class22.field348 >= var25) {
                                    continue;
                                }
                                int var127 = class22.field348 - var14;
                                int var128 = class227.field3616 - var13;
                                int var129 = var11.field3486[var127];
                                if (var129 > var128 || (var129 + var11.field3420[var127]) < var128) {
                                    continue;
                                }
                                int var130 = var128 - var11.field3526 / 2;
                                int var131 = (int) class259.field4063 + class345.field5354 & 0x7FF;
                                int var132 = class15.field204[var131];
                                int var133 = class15.field216[var131];
                                int var134 = (class254.field3995 + 256) * var133 >> 8;
                                int var135 = (class254.field3995 + 256) * var132 >> 8;
                                int var136 = var127 - var11.field3458 / 2;
                                int var137 = var134 * var136 - (var130 * var135) >> 11;
                                int var138 = var130 * var134 + var135 * var136 >> 11;
                                int var139 = class98.field1566.field1905 - ((class98.field1566.method280(false) - 1) * 64 - var138) >> 7;
                                int var140 = class98.field1566.field1868 + 64 - var137 - (class98.field1566.method280(false) * 64) >> 7;
                                if (class35.field545 && (class11.field172 & 0x40) != 0) {
                                    class220 var141 = class177.method1263(class224.field3573, -112, class52.field868);
                                    if (var141 == null) {
                                        class216.method1530(-20640);
                                    } else {
                                        class231.method1628(var139, class344.field5344, 0, " ->", var140, (short) 58, class332.field5173, 1L);
                                    }
                                    continue;
                                }
                                if (class288.field4491 == 1) {
                                    class231.method1628(var139, -1, 0, "", var140, (short) 22, class60.field973, 1L);
                                }
                                class231.method1628(var139, -1, 0, "", var140, (short) 24, class152.field2294, 1L);
                                continue;
                            }
                            if (var11.field3427 == 1339) {
                                if (var11.method1558((byte) -84)) {
                                    class153.method1056(var14, arg1 + 12621, var12, var11, var13);
                                    if (class94.field1516) {
                                        class167.method1187(arg9, arg2, arg3, arg6);
                                    } else {
                                        class109.method806(arg9, arg2, arg3, arg6);
                                    }
                                }
                                continue;
                            }
                            if (var11.field3427 == 1400) {
                                class247.method1699(var13, var11.field3458, var14, 17736, var11.field3526);
                                class34.field510[var12] = true;
                                class240.field3831[var12] = true;
                                if (class94.field1516) {
                                    class167.method1187(arg9, arg2, arg3, arg6);
                                } else {
                                    class109.method806(arg9, arg2, arg3, arg6);
                                }
                                continue;
                            }
                            if (var11.field3427 == 1401) {
                                class11.method83(var11.field3458, var14, var11.field3526, -3, var13);
                                class34.field510[var12] = true;
                                class240.field3831[var12] = true;
                                if (class94.field1516) {
                                    class167.method1187(arg9, arg2, arg3, arg6);
                                } else {
                                    class109.method806(arg9, arg2, arg3, arg6);
                                }
                                continue;
                            }
                            if (var11.field3427 == 1402) {
                                if (!class94.field1516) {
                                    class92.method659((byte) -4, var13, var14);
                                    class34.field510[var12] = true;
                                    class240.field3831[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field3427 == 1405) {
                                if (!class306.field4758) {
                                    continue;
                                }
                                int var112 = var14 + 15;
                                int var113 = 16776960;
                                int var114 = var11.field3526 + var13;
                                class233.field3723.method2240("Fps:" + class292.field4541, var114, var112, 16776960, -1);
                                Runtime var115 = Runtime.getRuntime();
                                int var142 = var112 + 15;
                                int var116 = (int) ((var115.totalMemory() - var115.freeMemory()) / 1024L);
                                if (var116 > 65536) {
                                    var113 = 16711680;
                                }
                                class233.field3723.method2240("Mem:" + var116 + "k", var114, var142, var113, -1);
                                var112 = var142 + 15;
                                if (class94.field1516) {
                                    int var117 = 16776960;
                                    int var118 = (class198.field2964 + class198.field2961 + class198.field2962) / 1024;
                                    if (var118 > 65536) {
                                        var117 = 16711680;
                                    }
                                    class233.field3723.method2240("Card:" + var118 + "k", var114, var112, var117, -1);
                                    var112 += 15;
                                }
                                int var119 = 0;
                                int var120 = 16776960;
                                int var121 = 0;
                                int var122 = 0;
                                for (int var123 = 0; var123 < 29; var123++) {
                                    var119 += class235.field3753[var123].method779(false);
                                    var122 += class235.field3753[var123].method791(arg1 - 10474);
                                    var121 += class235.field3753[var123].method786(59);
                                }
                                int var124 = var121 * 100 / var119;
                                int var125 = var122 * 10000 / var119;
                                String var126 = "Cache:" + class292.method1994((long) var125, 2, 0, (byte) -118, true) + "% (" + var124 + "%)";
                                class112.field1736.method2240(var126, var114, var112, var120, -1);
                                var112 += 12;
                                class34.field510[var12] = true;
                                class240.field3831[var12] = true;
                                continue;
                            }
                            if (var11.field3427 == 1406) {
                                class71.field1170 = var13;
                                class87.field1414 = var14;
                                class235.field3760 = var11;
                                continue;
                            }
                        }
                        if (!class339.field5305) {
                            if (var11.field3468 == 0 && var11.field3436 && var20 <= class227.field3616 && var21 <= class22.field348 && class227.field3616 < var24 && var25 > class22.field348 && !class175.field2653) {
                                class233.field3689[0] = 1004;
                                class301.field4706 = 1;
                                class137.field2167[0] = class207.field3175;
                                class32.field468[0] = class332.field5163;
                                class275.field4252[0] = "";
                            }
                            if (var20 <= class227.field3616 && class22.field348 >= var21 && class227.field3616 < var24 && class22.field348 < var25) {
                                class274.method1881(class227.field3616 - var13, 21, class22.field348 - var14, var11);
                            }
                        }
                        if (var11.field3468 == 0) {
                            if (!var11.field3445 && client.method386(var11) && class162.field2441 != var11) {
                                continue;
                            }
                            if (!var11.field3445) {
                                if (var11.field3426 > (var11.field3465 - var11.field3458)) {
                                    var11.field3426 = var11.field3465 - var11.field3458;
                                }
                                if (var11.field3426 < 0) {
                                    var11.field3426 = 0;
                                }
                            }
                            if (class94.field1516 && var11.field3427 == 1407) {
                                class277.method1896(var13, var14, var11.field3526, var11.field3458);
                            }
                            method1480(var13 - var11.field3367, 10602, var21, var24, var12, var11.field3404, var25, arg7, var14 - var11.field3426, var20);
                            if (var11.field3472 != null) {
                                method1480(var13 - var11.field3367, 10602, var21, var24, var12, var11.field3404, var25, var11.field3472, var14 - var11.field3426, var20);
                            }
                            class61 var26 = (class61) class276.field4257.method1222(0, (long) var11.field3404);
                            if (var26 != null) {
                                if (var26.field985 == 0 && !class339.field5305 && var20 <= class227.field3616 && class22.field348 >= var21 && class227.field3616 < var24 && var25 > class22.field348 && !class175.field2653) {
                                    class32.field468[0] = class332.field5163;
                                    class233.field3689[0] = 1004;
                                    class301.field4706 = 1;
                                    class137.field2167[0] = class207.field3175;
                                    class275.field4252[0] = "";
                                }
                                class161.method1100(var25, var12, -1, var14, var13, var20, var21, var24, var26.field982);
                            }
                            if (class94.field1516 && var11.field3427 == 1407) {
                                class277.method1900();
                            }
                            if (class94.field1516) {
                                class167.method1187(arg9, arg2, arg3, arg6);
                            } else {
                                class109.method806(arg9, arg2, arg3, arg6);
                                class15.method121();
                            }
                        }
                        if (class345.field5352[var12] || class190.field2854 > 1) {
                            if (var11.field3468 == 0 && !var11.field3445 && var11.field3465 > var11.field3458) {
                                class173.method1246(arg1 ^ 0x290C, var11.field3526 + var13, var11.field3465, var14, var11.field3426, var11.field3458);
                            }
                            if (var11.field3468 != 1) {
                                if (var11.field3468 == 2) {
                                    int var95 = 0;
                                    for (int var96 = 0; var96 < var11.field3360; var96++) {
                                        for (int var97 = 0; var97 < var11.field3405; var97++) {
                                            int var98 = (var11.field3494 + 32) * var97 + var13;
                                            int var99 = var14 + ((var11.field3411 + 32) * var96);
                                            if (var95 < 20) {
                                                var98 += var11.field3528[var95];
                                                var99 += var11.field3352[var95];
                                            }
                                            if (var11.field3428[var95] > 0) {
                                                boolean var101 = false;
                                                boolean var102 = false;
                                                int var103 = var11.field3428[var95] - 1;
                                                if (arg9 < (var98 + 32) && arg3 > var98 && arg2 < (var99 + 32) && var99 < arg6 || client.field718 == var11 && class274.field4246 == var95) {
                                                    class270 var104;
                                                    if (class313.field4858 == 1 && class315.field4913 == var95 && class53.field892 == var11.field3404) {
                                                        var104 = class67.method512((class189) null, var103, 0, var11.field3391, var11.field3409[var95], 2, (byte) -106);
                                                    } else {
                                                        var104 = class67.method512((class189) null, var103, 3153952, var11.field3391, var11.field3409[var95], 1, (byte) -18);
                                                    }
                                                    if (class15.field212) {
                                                        class34.field510[var12] = true;
                                                    }
                                                    if (var104 == null) {
                                                        class26.method241(3095, var11);
                                                    } else if (client.field718 == var11 && class274.field4246 == var95) {
                                                        int var105 = class253.field3984 - class134.field2142;
                                                        if (var105 < 5 && var105 > -5) {
                                                            var105 = 0;
                                                        }
                                                        int var106 = class119.field1815 - class150.field2273;
                                                        if (var106 < 5 && var106 > -5) {
                                                            var106 = 0;
                                                        }
                                                        if (class81.field1273 < 5) {
                                                            var106 = 0;
                                                            var105 = 0;
                                                        }
                                                        var104.method620(var98 + var106, var99 + var105, 128);
                                                        if (arg5 != -1) {
                                                            class220 var107 = arg7[arg5 & 0xFFFF];
                                                            int var108;
                                                            int var109;
                                                            if (class94.field1516) {
                                                                var109 = class167.field2552;
                                                                var108 = class167.field2554;
                                                            } else {
                                                                var108 = class109.field1705;
                                                                var109 = class109.field1707;
                                                            }
                                                            if (var109 > var99 + var105 && var107.field3426 > 0) {
                                                                int var110 = (var109 - var105 - var99) * class34.field518 / 3;
                                                                if ((class34.field518 * 10) < var110) {
                                                                    var110 = class34.field518 * 10;
                                                                }
                                                                if (var107.field3426 < var110) {
                                                                    var110 = var107.field3426;
                                                                }
                                                                class134.field2142 += var110;
                                                                var107.field3426 -= var110;
                                                                class26.method241(arg1 - 7507, var107);
                                                            }
                                                            if (var108 < (var105 + var99 + 32) && var107.field3465 - var107.field3458 > var107.field3426) {
                                                                int var111 = (var99 - var108 - (-var105 - 32)) * class34.field518 / 3;
                                                                if ((class34.field518 * 10) < var111) {
                                                                    var111 = class34.field518 * 10;
                                                                }
                                                                if ((var107.field3465 - var107.field3426 - var107.field3458) < var111) {
                                                                    var111 = var107.field3465 - var107.field3458 - var107.field3426;
                                                                }
                                                                class134.field2142 -= var111;
                                                                var107.field3426 += var111;
                                                                class26.method241(arg1 ^ 0x257D, var107);
                                                            }
                                                        }
                                                    } else if (class132.field2083 == var11 && class51.field833 == var95) {
                                                        var104.method620(var98, var99, 128);
                                                    } else {
                                                        var104.method617(var98, var99);
                                                    }
                                                }
                                            } else if (var11.field3345 != null && var95 < 20) {
                                                class270 var100 = var11.method1559(-1, var95);
                                                if (var100 != null) {
                                                    var100.method617(var98, var99);
                                                } else if (class116.field1776) {
                                                    class26.method241(3095, var11);
                                                }
                                            }
                                            var95++;
                                        }
                                    }
                                } else if (var11.field3468 == 3) {
                                    int var27;
                                    if (class224.method1588(var11, (byte) 33)) {
                                        var27 = var11.field3499;
                                        if (class162.field2441 == var11 && var11.field3407 != 0) {
                                            var27 = var11.field3407;
                                        }
                                    } else {
                                        var27 = var11.field3487;
                                        if (class162.field2441 == var11 && var11.field3451 != 0) {
                                            var27 = var11.field3451;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3476) {
                                            if (class94.field1516) {
                                                class167.method1186(var13, var14, var11.field3526, var11.field3458, var27);
                                            } else {
                                                class109.method812(var13, var14, var11.field3526, var11.field3458, var27);
                                            }
                                        } else if (class94.field1516) {
                                            class167.method1189(var13, var14, var11.field3526, var11.field3458, var27);
                                        } else {
                                            class109.method801(var13, var14, var11.field3526, var11.field3458, var27);
                                        }
                                    } else if (var11.field3476) {
                                        if (class94.field1516) {
                                            class167.method1193(var13, var14, var11.field3526, var11.field3458, var27, 256 - (var15 & 0xFF));
                                        } else {
                                            class109.method799(var13, var14, var11.field3526, var11.field3458, var27, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class94.field1516) {
                                        class167.method1190(var13, var14, var11.field3526, var11.field3458, var27, 256 - (var15 & 0xFF));
                                    } else {
                                        class109.method802(var13, var14, var11.field3526, var11.field3458, var27, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3468 == 4) {
                                    class329 var91 = var11.method1560(class78.field1251, true);
                                    if (var91 != null) {
                                        String var92 = var11.field3376;
                                        int var93;
                                        if (class224.method1588(var11, (byte) 33)) {
                                            var93 = var11.field3499;
                                            if (class162.field2441 == var11 && var11.field3407 != 0) {
                                                var93 = var11.field3407;
                                            }
                                            if (var11.field3432.length() > 0) {
                                                var92 = var11.field3432;
                                            }
                                        } else {
                                            var93 = var11.field3487;
                                            if (class162.field2441 == var11 && var11.field3451 != 0) {
                                                var93 = var11.field3451;
                                            }
                                        }
                                        if (var11.field3445 && var11.field3378 != -1) {
                                            class299 var94 = class237.method1657(arg1 ^ 0x2968, var11.field3378);
                                            var92 = var94.field4650;
                                            if (var92 == null) {
                                                var92 = "null";
                                            }
                                            if ((var94.field4641 == 1 || var11.field3452 != 1) && var11.field3452 != -1) {
                                                var92 = "<col=ff9040>" + var92 + "</col> x" + class213.method1498(var11.field3452, 700);
                                            }
                                        }
                                        if (class303.field4728 == var11) {
                                            var92 = class292.field4543;
                                            var93 = var11.field3487;
                                        }
                                        if (!var11.field3445) {
                                            var92 = class193.method1377((byte) 123, var11, var92);
                                        }
                                        var91.method2247(var92, var13, var14, var11.field3526, var11.field3458, var93, var11.field3471 ? 0 : -1, var11.field3512, var11.field3374, var11.field3440);
                                    } else if (class116.field1776) {
                                        class26.method241(arg1 ^ 0x257D, var11);
                                    }
                                } else if (var11.field3468 == 5) {
                                    if (!var11.field3445) {
                                        class270 var74 = var11.method1551(2, class224.method1588(var11, (byte) 33));
                                        if (var74 != null) {
                                            var74.method617(var13, var14);
                                        } else if (class116.field1776) {
                                            class26.method241(3095, var11);
                                        }
                                    } else if (var11.field3365 >= 0) {
                                        class45 var75 = var11.method1556((byte) 86);
                                        if (class94.field1516) {
                                            var75.method401(0, var13, var14, var11.field3526, var11.field3458, var11.field3530, var11.field3437, 0);
                                        } else {
                                            var75.method398(0, var13, var14, var11.field3526, var11.field3458, var11.field3530, var11.field3437, 0);
                                        }
                                    } else {
                                        class270 var76;
                                        if (var11.field3378 == -1) {
                                            var76 = var11.method1551(2, false);
                                        } else if (var11.field3508 && class98.field1566.field499 != null) {
                                            var76 = class67.method512(class98.field1566.field499, var11.field3378, var11.field3402, var11.field3391, var11.field3452, var11.field3462, (byte) -122);
                                        } else {
                                            var76 = class67.method512((class189) null, var11.field3378, var11.field3402, var11.field3391, var11.field3452, var11.field3462, (byte) -48);
                                        }
                                        if (var76 != null) {
                                            int var77 = var76.field4211;
                                            int var78 = var76.field4201;
                                            if (var11.field3477) {
                                                int var79 = (var77 - (1 - var11.field3526)) / var77;
                                                int var80 = (var11.field3458 + var78 - 1) / var78;
                                                if (class94.field1516) {
                                                    class167.method1194(var13, var14, var11.field3526 + var13, var11.field3458 + var14);
                                                    boolean var81 = class70.method526(var76.field4202, arg1 ^ 0xFFFFD6E1);
                                                    boolean var82 = class70.method526(var76.field4207, -123);
                                                    class86 var83 = (class86) var76;
                                                    if (var81 && var82) {
                                                        if (var15 == 0) {
                                                            var83.method621(var13, var14, var79, var80);
                                                        } else {
                                                            var83.method627(var13, var14, 256 - (var15 & 0xFF), var79, var80);
                                                        }
                                                    } else if (var81) {
                                                        for (int var84 = 0; var84 < var80; var84++) {
                                                            if (var15 == 0) {
                                                                var83.method621(var13, var78 * var84 + var14, var79, 1);
                                                            } else {
                                                                var83.method627(var13, var78 * var84 + var14, -(var15 & 0xFF) + 256, var79, 1);
                                                            }
                                                        }
                                                    } else if (var82) {
                                                        for (int var87 = 0; var87 < var79; var87++) {
                                                            if (var15 == 0) {
                                                                var83.method621(var77 * var87 + var13, var14, 1, var80);
                                                            } else {
                                                                var83.method627(var77 * var87 + var13, var14, 256 - (var15 & 0xFF), 1, var80);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var85 = 0; var85 < var79; var85++) {
                                                            for (int var86 = 0; var86 < var80; var86++) {
                                                                if (var15 == 0) {
                                                                    var76.method617(var77 * var85 + var13, var78 * var86 + var14);
                                                                } else {
                                                                    var76.method620(var77 * var85 + var13, var14 - -(var78 * var86), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class167.method1187(arg9, arg2, arg3, arg6);
                                                } else {
                                                    class109.method815(var13, var14, var13 + var11.field3526, var11.field3458 + var14);
                                                    for (int var88 = 0; var88 < var79; var88++) {
                                                        for (int var89 = 0; var89 < var80; var89++) {
                                                            if (var11.field3502 != 0) {
                                                                var76.method1856(-118, var11.field3502, var78 / 2 + var78 * var89 + var14, 4096, var77 / 2 + var77 * var88 + var13);
                                                            } else if (var15 == 0) {
                                                                var76.method617(var13 + (var77 * var88), var78 * var89 + var14);
                                                            } else {
                                                                var76.method620(var77 * var88 + var13, var78 * var89 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class109.method806(arg9, arg2, arg3, arg6);
                                                }
                                            } else {
                                                int var90 = var11.field3526 * 4096 / var77;
                                                if (var11.field3502 != 0) {
                                                    var76.method1856(-120, var11.field3502, var11.field3458 / 2 + var14, var90, var11.field3526 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var76.method629(var13, var14, var11.field3526, var11.field3458, 256 - (var15 & 0xFF));
                                                } else if (var11.field3526 == var77 && var11.field3458 == var78) {
                                                    var76.method617(var13, var14);
                                                } else {
                                                    var76.method624(var13, var14, var11.field3526, var11.field3458);
                                                }
                                            }
                                        } else if (class116.field1776) {
                                            class26.method241(3095, var11);
                                        }
                                    }
                                } else if (var11.field3468 == 6) {
                                    boolean var55 = class224.method1588(var11, (byte) 33);
                                    class221 var56 = null;
                                    int var57 = 0;
                                    int var58;
                                    if (var55) {
                                        var58 = var11.field3355;
                                    } else {
                                        var58 = var11.field3406;
                                    }
                                    if (var11.field3378 != -1) {
                                        class299 var63 = class237.method1657(arg1 ^ 0x2968, var11.field3378);
                                        if (var63 != null) {
                                            class299 var64 = var63.method2029(var11.field3452, arg1 - 10602);
                                            class281 var65 = var58 == -1 ? null : class133.method948(var58, (byte) 33);
                                            if (var11.field3508 && class98.field1566.field499 != null) {
                                                var56 = var64.method2032(true, var65, var11.field3500, var11.field3469, class98.field1566.field499, 1, var11.field3349);
                                            } else {
                                                var56 = var64.method2032(true, var65, var11.field3500, var11.field3469, (class189) null, 1, var11.field3349);
                                            }
                                            if (var56 == null) {
                                                class26.method241(3095, var11);
                                            } else {
                                                var57 = -var56.method76() / 2;
                                            }
                                        }
                                    } else if (var11.field3372 == 5) {
                                        if (var11.field3466 == -1) {
                                            var56 = class331.field5157.method1348(-1, true, 0, (class281) null, arg1 - 35458, -1, -1, 0, -1, (class111[]) null, (class281) null);
                                        } else {
                                            int var60 = var11.field3466 & 0x7FF;
                                            if (class120.field1837 == var60) {
                                                var60 = 2047;
                                            }
                                            class33 var61 = class254.field3992[var60];
                                            class281 var62 = var58 == -1 ? null : class133.method948(var58, (byte) 33);
                                            if (var61 != null && (int) class128.method926(var61.field477, (byte) -90) << 11 == (var11.field3466 & 0xFFFFF800)) {
                                                var56 = var61.field499.method1348(-1, true, 0, var62, -24856, -1, var11.field3469, 0, 0, (class111[]) null, (class281) null);
                                            }
                                        }
                                    } else if (var58 == -1) {
                                        var56 = var11.method1569(-1, 0, class98.field1566.field499, (byte) -98, var55, -1, (class281) null);
                                        if (var56 == null && class116.field1776) {
                                            class26.method241(3095, var11);
                                        }
                                    } else {
                                        class281 var59 = class133.method948(var58, (byte) 33);
                                        var56 = var11.method1569(var11.field3469, var11.field3500, class98.field1566.field499, (byte) -84, var55, var11.field3349, var59);
                                        if (var56 == null && class116.field1776) {
                                            class26.method241(3095, var11);
                                        }
                                    }
                                    if (var56 != null) {
                                        int var66;
                                        if (var11.field3439 > 0) {
                                            var66 = (var11.field3526 << 8) / var11.field3439;
                                        } else {
                                            var66 = 256;
                                        }
                                        int var67;
                                        if (var11.field3395 > 0) {
                                            var67 = (var11.field3458 << 8) / var11.field3395;
                                        } else {
                                            var67 = 256;
                                        }
                                        int var68 = (var11.field3396 * var66 >> 8) + var11.field3526 / 2 + var13;
                                        int var69 = (var11.field3423 * var67 >> 8) + var11.field3458 / 2 + var14;
                                        if (class94.field1516) {
                                            if (var11.field3455) {
                                                class94.method703(var68, var69, var11.field3516, var11.field3524, var66, var67);
                                            } else {
                                                class94.method688(var68, var69, var66, var67);
                                                class94.method680((float) var11.field3434, (float) var11.field3524 * 1.5F);
                                            }
                                            class94.method692();
                                            class94.method696(true);
                                            class94.method693(false);
                                            class154.method1062(0, class289.field4507);
                                            if (class230.field3650) {
                                                class167.method1191();
                                                class94.method706();
                                                class167.method1187(arg9, arg2, arg3, arg6);
                                                class230.field3650 = false;
                                            }
                                            if (var11.field3467) {
                                                class94.method674();
                                            }
                                            int var72 = class15.field216[var11.field3350] * var11.field3516 >> 16;
                                            int var73 = class15.field204[var11.field3350] * var11.field3516 >> 16;
                                            if (var11.field3445) {
                                                var56.method199(0, var11.field3505, var11.field3513, var11.field3350, var11.field3453, var57 + var73 + var11.field3446, var11.field3446 + var72, -1L);
                                            } else {
                                                var56.method199(0, var11.field3505, 0, var11.field3350, 0, var73, var72, -1L);
                                            }
                                            if (var11.field3467) {
                                                class94.method683();
                                            }
                                        } else {
                                            class15.method119(var68, var69);
                                            int var70 = class15.field204[var11.field3350] * var11.field3516 >> 16;
                                            int var71 = class15.field216[var11.field3350] * var11.field3516 >> 16;
                                            if (!var11.field3445) {
                                                var56.method199(0, var11.field3505, 0, var11.field3350, 0, var70, var71, -1L);
                                            } else if (var11.field3455) {
                                                ((class66) var56).method500(0, var11.field3505, var11.field3513, var11.field3350, var11.field3453, var11.field3446 + var70 + var57, var11.field3446 + var71, var11.field3516);
                                            } else {
                                                var56.method199(0, var11.field3505, var11.field3513, var11.field3350, var11.field3453, var11.field3446 + var70 + var57, var11.field3446 + var71, -1L);
                                            }
                                            class15.method115();
                                        }
                                    }
                                } else {
                                    if (var11.field3468 == 7) {
                                        class329 var28 = var11.method1560(class78.field1251, true);
                                        if (var28 == null) {
                                            if (class116.field1776) {
                                                class26.method241(3095, var11);
                                            }
                                            continue;
                                        }
                                        int var29 = 0;
                                        for (int var30 = 0; var30 < var11.field3360; var30++) {
                                            for (int var31 = 0; var31 < var11.field3405; var31++) {
                                                if (var11.field3428[var29] > 0) {
                                                    class299 var32 = class237.method1657(arg1 ^ 0x2968, var11.field3428[var29] - 1);
                                                    String var33;
                                                    if (var32.field4641 != 1 && var11.field3409[var29] == 1) {
                                                        var33 = "<col=ff9040>" + var32.field4650 + "</col>";
                                                    } else {
                                                        var33 = "<col=ff9040>" + var32.field4650 + "</col> x" + class213.method1498(var11.field3409[var29], 700);
                                                    }
                                                    int var34 = (var11.field3494 + 115) * var31 + var13;
                                                    int var35 = (var11.field3411 + 12) * var30 + var14;
                                                    if (var11.field3512 == 0) {
                                                        var28.method2245(var33, var34, var35, var11.field3487, var11.field3471 ? 0 : -1);
                                                    } else if (var11.field3512 == 1) {
                                                        var28.method2237(var33, var34 + 57, var35, var11.field3487, var11.field3471 ? 0 : -1);
                                                    } else {
                                                        var28.method2240(var33, var34 + 114, var35, var11.field3487, var11.field3471 ? 0 : -1);
                                                    }
                                                }
                                                var29++;
                                            }
                                        }
                                    }
                                    if (var11.field3468 == 8 && class12.field194 == var11 && class202.field3032 == class165.field2473) {
                                        int var36 = 0;
                                        class329 var37 = class233.field3723;
                                        int var38 = 0;
                                        String var39 = var11.field3376;
                                        String var40 = class193.method1377((byte) -120, var11, var39);
                                        while (var40.length() > 0) {
                                            int var41 = var40.indexOf("<br>");
                                            String var42;
                                            if (var41 == -1) {
                                                var42 = var40;
                                                var40 = "";
                                            } else {
                                                var42 = var40.substring(0, var41);
                                                var40 = var40.substring(var41 + 4);
                                            }
                                            int var43 = var37.method2228(var42);
                                            if (var43 > var36) {
                                                var36 = var43;
                                            }
                                            var38 += var37.field5102 + 1;
                                        }
                                        var36 += 6;
                                        var38 += 7;
                                        int var44 = var11.field3526 + var13 - var36 - 5;
                                        int var45 = var11.field3458 + var14 + 5;
                                        if (arg6 < var38 + var45) {
                                            var45 = arg6 - var38;
                                        }
                                        if (var44 < (var13 + 5)) {
                                            var44 = var13 + 5;
                                        }
                                        if (arg3 < (var44 + var36)) {
                                            var44 = arg3 - var36;
                                        }
                                        if (class94.field1516) {
                                            class167.method1186(var44, var45, var36, var38, 16777120);
                                            class167.method1189(var44, var45, var36, var38, 0);
                                        } else {
                                            class109.method812(var44, var45, var36, var38, 16777120);
                                            class109.method801(var44, var45, var36, var38, 0);
                                        }
                                        String var46 = var11.field3376;
                                        int var47 = var45 - (-var37.field5102 - 2);
                                        String var48 = class193.method1377((byte) 113, var11, var46);
                                        while (var48.length() > 0) {
                                            int var49 = var48.indexOf("<br>");
                                            String var50;
                                            if (var49 == -1) {
                                                var50 = var48;
                                                var48 = "";
                                            } else {
                                                var50 = var48.substring(0, var49);
                                                var48 = var48.substring(var49 + 4);
                                            }
                                            var37.method2245(var50, var44 + 3, var47, 0, -1);
                                            var47 += var37.field5102 + 1;
                                        }
                                    }
                                    if (var11.field3468 == 9) {
                                        int var51;
                                        int var52;
                                        int var53;
                                        int var54;
                                        if (var11.field3366) {
                                            var54 = var13;
                                            var52 = var11.field3526 + var13;
                                            var53 = var11.field3458 + var14;
                                            var51 = var14;
                                        } else {
                                            var51 = var11.field3458 + var14;
                                            var52 = var13 + var11.field3526;
                                            var53 = var14;
                                            var54 = var13;
                                        }
                                        if (var11.field3384 == 1) {
                                            if (class94.field1516) {
                                                class167.method1188(var54, var53, var52, var51, var11.field3487);
                                            } else {
                                                class109.method817(var54, var53, var52, var51, var11.field3487);
                                            }
                                        } else if (class94.field1516) {
                                            class167.method1200(var54, var53, var52, var51, var11.field3487, var11.field3384);
                                        } else {
                                            class109.method810(var54, var53, var52, var51, var11.field3487, var11.field3384);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 10602) {
            field3191 = false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V", line = 1503)
    public static final void method1481(int arg0) {
        int var1 = 81 / ((arg0 - 58) / 37);
        class241.field3856.method2176((byte) -126);
        field3185++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Z)V", line = 1517)
    public static final void method1482(boolean arg0) {
        field3188++;
        int var1 = class344.field5343.method2228(class174.field2630);
        for (int var2 = 0; var2 < class301.field4706; var2++) {
            int var3 = class344.field5343.method2228(class288.method1979(var2, -62));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        int var4 = class301.field4706 * 15 + 21;
        var1 += 8;
        int var5 = class22.field348;
        if (!arg0) {
            method1478(48);
        }
        if (class322.field5024 < (var4 + var5)) {
            var5 = class322.field5024 - var4;
        }
        int var6 = class227.field3616 - (var1 / 2);
        if (var5 < 0) {
            var5 = 0;
        }
        if (class188.field2816 < (var1 + var6)) {
            var6 = class188.field2816 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class84.field1305 == 1) {
            if (class90.field1434 == class227.field3616 && class52.field870 == class22.field348) {
                class339.field5305 = true;
                class112.field1737 = class301.field4706 * 15 + (class238.field3786 ? 26 : 22);
                class308.field4792 = var6;
                class131.field2058 = var1;
                class40.field604 = var5;
                class84.field1305 = 0;
            }
        } else if (class227.field3616 == class205.field3084 && class47.field776 == class22.field348) {
            class112.field1737 = class301.field4706 * 15 + (class238.field3786 ? 26 : 22);
            class84.field1305 = 0;
            class339.field5305 = true;
            class308.field4792 = var6;
            class40.field604 = var5;
            class131.field2058 = var1;
        } else {
            class90.field1434 = class205.field3084;
            class52.field870 = class47.field776;
            class84.field1305 = 1;
        }
    }
}
