import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 {

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
    public static int[] field1447 = new int[100];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lr;")
    public static class118 field1444 = class153.method1136(119, "<)4col>");

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[[Lke;")
    public static class74[][] field1446;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method558(boolean arg0) {
        field1446 = null;
        if (arg0) {
            method558(true);
        }
        field1444 = null;
        field1447 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
    public static final void method559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class48.field1158 = 0;
        for (int var5 = -1; var5 < class105.field2425 + class115.field2702; var5++) {
            class30 var21;
            if (var5 == -1) {
                var21 = class89.field2150;
            } else if (var5 < class105.field2425) {
                var21 = class108.field2526[class73.field1685[var5]];
            } else {
                var21 = class74.field1833[class68.field1580[var5 - class105.field2425]];
            }
            if (var21 != null && var21.method253(-3)) {
                if (var21 instanceof class83) {
                    class110 var22 = ((class83) var21).field1989;
                    if (var22.field2537 != null) {
                        var22 = var22.method864((byte) -121);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class105.field2425) {
                    class110 var23 = ((class83) var21).field1989;
                    if (var23.field2537 != null) {
                        var23 = var23.method864((byte) -121);
                    }
                    if (var23.field2555 >= 0 && class67.field1560.length > var23.field2555) {
                        class112.method877(var21, var21.field757 + 15, false);
                        if (class146.field3261 > -1) {
                            class67.field1560[var23.field2555].method1109(arg1 + class146.field3261 - 12, class46.field1105 + -30 + arg0);
                        }
                    }
                    if (class112.field2598 == 1 && class68.field1580[var5 - class105.field2425] == class14.field298 && class65.field1479 % 20 < 10) {
                        class112.method877(var21, var21.field757 + 15, false);
                        if (class146.field3261 > -1) {
                            class115.field2706[0].method1109(class146.field3261 + arg1 - 12, arg0 - -class46.field1105 - 28);
                        }
                    }
                } else {
                    class132 var24 = (class132) var21;
                    int var25 = 30;
                    if (var24.field3009 != -1 || var24.field3012 != -1) {
                        class112.method877(var21, var21.field757 + 15, false);
                        if (class146.field3261 > -1) {
                            if (var24.field3009 != -1) {
                                class10.field218[var24.field3009].method1109(class146.field3261 + arg1 - 12, arg0 - (-class46.field1105 - -var25));
                                var25 += 25;
                            }
                            if (var24.field3012 != -1) {
                                class67.field1560[var24.field3012].method1109(arg1 + class146.field3261 - 12, -var25 + arg0 + class46.field1105);
                                var25 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class112.field2598 == 10 && class73.field1685[var5] == class24.field606) {
                        class112.method877(var21, var21.field757 + 15, false);
                        if (class146.field3261 > -1) {
                            class115.field2706[1].method1109(arg1 + class146.field3261 - 12, -var25 + arg0 - -class46.field1105);
                        }
                    }
                }
                if (var21.field709 != null && (class105.field2425 <= var5 || class146.field3256 == 0 || class146.field3256 == 3 || class146.field3256 == 1 && class74.method618(0, ((class132) var21).field2996))) {
                    class112.method877(var21, var21.field757, false);
                    if (class146.field3261 > -1 && class48.field1158 < class138.field3150) {
                        class138.field3146[class48.field1158] = class115.field2699.method33(var21.field709) / 2;
                        class138.field3151[class48.field1158] = class115.field2699.field157;
                        class138.field3136[class48.field1158] = class146.field3261;
                        class138.field3145[class48.field1158] = class46.field1105;
                        class138.field3138[class48.field1158] = var21.field740;
                        class138.field3137[class48.field1158] = var21.field771;
                        class138.field3142[class48.field1158] = var21.field773;
                        class138.field3154[class48.field1158] = var21.field709;
                        class48.field1158++;
                    }
                }
                if (class65.field1479 < var21.field776) {
                    class112.method877(var21, var21.field757 + 15, false);
                    if (class146.field3261 > -1) {
                        int var26 = var21.field743 * 30 / var21.field727;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class52.method473(arg1 + class146.field3261 - 15, arg0 - (-class46.field1105 + 3), var26, 5, 65280);
                        class52.method473(arg1 + class146.field3261 + var26 - 15, arg0 - -class46.field1105 + -3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class65.field1479 < var21.field715[var27]) {
                        class112.method877(var21, var21.field757 / 2, false);
                        if (class146.field3261 > -1) {
                            if (var27 == 1) {
                                class46.field1105 -= 20;
                            }
                            if (var27 == 2) {
                                class146.field3261 -= 15;
                                class46.field1105 -= 10;
                            }
                            if (var27 == 3) {
                                class146.field3261 += 15;
                                class46.field1105 -= 10;
                            }
                            class133.field3032[var21.field718[var27]].method1109(class146.field3261 + arg1 - 12, class46.field1105 + arg0 + -12);
                            class70.field1640.method44(class43.method359(var21.field722[var27], (byte) -122), arg1 + class146.field3261 - 1, arg0 - (-class46.field1105 - 3), 16777215, 0);
                        }
                    }
                }
            }
        }
        field1449++;
        for (int var6 = 0; var6 < class48.field1158; var6++) {
            int var7 = class138.field3146[var6];
            int var8 = class138.field3151[var6];
            int var9 = class138.field3145[var6];
            boolean var10 = true;
            int var11 = class138.field3136[var6];
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class138.field3145[var20] - class138.field3151[var20] < var9 - -2 && class138.field3145[var20] + 2 > var9 - var8 && class138.field3146[var20] + class138.field3136[var20] > -var7 + var11 && class138.field3136[var20] - class138.field3146[var20] < var7 + var11 && var9 > class138.field3145[var20] - class138.field3151[var20]) {
                        var9 = class138.field3145[var20] - class138.field3151[var20];
                        var10 = true;
                    }
                }
            }
            class146.field3261 = class138.field3136[var6];
            class46.field1105 = class138.field3145[var6] = var9;
            class118 var12 = class138.field3154[var6];
            if (class34.field850 == 0) {
                int var13 = 16776960;
                if (class138.field3138[var6] < 6) {
                    var13 = class32.field822[class138.field3138[var6]];
                }
                if (class138.field3138[var6] == 6) {
                    var13 = class159.field3660 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class138.field3138[var6] == 7) {
                    var13 = class159.field3660 % 20 >= 10 ? 65535 : 255;
                }
                if (class138.field3138[var6] == 8) {
                    var13 = class159.field3660 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class138.field3138[var6] == 9) {
                    int var14 = 150 - class138.field3142[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class138.field3138[var6] == 10) {
                    int var15 = 150 - class138.field3142[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 - (var15 + -100) * 5;
                    }
                }
                if (class138.field3138[var6] == 11) {
                    int var16 = 150 - class138.field3142[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class138.field3137[var6] == 0) {
                    class115.field2699.method44(var12, arg1 + class146.field3261, class46.field1105 + arg0, var13, 0);
                }
                if (class138.field3137[var6] == 1) {
                    class115.field2699.method49(var12, class146.field3261 + arg1, class46.field1105 + arg0, var13, 0, class159.field3660);
                }
                if (class138.field3137[var6] == 2) {
                    class115.field2699.method55(var12, class146.field3261 + arg1, class46.field1105 + arg0, var13, 0, class159.field3660);
                }
                if (class138.field3137[var6] == 3) {
                    class115.field2699.method40(var12, arg1 + class146.field3261, arg0 - -class46.field1105, var13, 0, class159.field3660, 150 - class138.field3142[var6]);
                }
                if (class138.field3137[var6] == 4) {
                    int var17 = (150 - class138.field3142[var6]) * (class115.field2699.method33(var12) + 100) / 150;
                    class52.method474(class146.field3261 + arg1 - 50, arg0, arg1 + class146.field3261 + 50, arg0 + arg4);
                    class115.field2699.method47(var12, class146.field3261 + arg1 + 50 - var17, class46.field1105 + arg0, var13, 0);
                    class52.method461(arg1, arg0, arg1 + arg3, arg0 - -arg4);
                }
                if (class138.field3137[var6] == 5) {
                    int var18 = 0;
                    int var19 = 150 - class138.field3142[var6];
                    class52.method474(arg1, class46.field1105 + arg0 - class115.field2699.field157 - 1, arg1 + arg3, class46.field1105 + arg0 + 5);
                    if (var19 < 25) {
                        var18 = var19 - 25;
                    } else if (var19 > 125) {
                        var18 = var19 - 125;
                    }
                    class115.field2699.method44(var12, class146.field3261 + arg1, arg0 + var18 + class46.field1105, var13, 0);
                    class52.method461(arg1, arg0, arg1 + arg3, arg0 + arg4);
                }
            } else {
                class115.field2699.method44(var12, class146.field3261 + arg1, class46.field1105 + arg0, 16776960, 0);
            }
        }
        if (arg2 != -8) {
            method559(-50, -96, 96, 63, -52);
        }
    }
}
