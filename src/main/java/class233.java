import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class233 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
    public static boolean field3339 = true;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field3342 = 0;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3340 = -1;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3346 = "green:";

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lfh;")
    public static class140 field3348;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIB)V", line = 12)
    public static final void method1657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3343++;
        class118.field1541 = 0;
        int var7 = 79 / ((arg6 + 59) / 58);
        for (int var8 = -1; var8 < (class257.field3747 + class112.field1441); var8++) {
            class331 var9;
            if (var8 == -1) {
                var9 = class359.field5616;
            } else if (var8 < class112.field1441) {
                var9 = class311.field4574[class288.field4157[var8]];
            } else {
                var9 = class251.field3688[class305.field4455[var8 - class112.field1441]];
            }
            if (var9 != null && var9.method1251(0)) {
                if (var9 instanceof class169) {
                    class157 var10 = ((class169) var9).field2345;
                    if (var10.field2206 != null) {
                        var10 = var10.method1210(-119);
                    }
                    if (var10 == null) {
                        continue;
                    }
                }
                if (var8 >= class112.field1441) {
                    class157 var11 = ((class169) var9).field2345;
                    if (var11.field2206 != null) {
                        var11 = var11.method1210(-16);
                    }
                    if (var11.field2188 >= 0 && var11.field2188 < class254.field3708.length) {
                        int var12;
                        if (var11.field2221 == -1) {
                            var12 = var9.method2294((byte) -126) + 15;
                        } else {
                            var12 = var11.field2221 + 15;
                        }
                        class94.method680(arg2 >> 1, arg3, arg1, arg4 >> 1, false, var12, var9);
                        if (class300.field4405 > -1) {
                            class254.field3708[var11.field2188].method85(arg0 - (12 - class300.field4405), class206.field2860 + arg5 + -30);
                        }
                    }
                    class234[] var13 = class102.field1326;
                    for (int var14 = 0; var14 < var13.length; var14++) {
                        class234 var15 = var13[var14];
                        if (var15 != null && var15.field3359 == 1 && class305.field4455[var8 - class112.field1441] == var15.field3358 && (class313.field4603 % 20) < 10) {
                            int var16;
                            if (var11.field2221 == -1) {
                                var16 = var9.method2294((byte) -30) + 15;
                            } else {
                                var16 = var11.field2221 + 15;
                            }
                            class94.method680(arg2 >> 1, arg3, arg1, arg4 >> 1, false, var16, var9);
                            if (class300.field4405 > -1) {
                                class291.field4233[var15.field3355].method85(arg0 + class300.field4405 - 12, class206.field2860 + arg5 + -28);
                            }
                        }
                    }
                } else {
                    int var17 = 30;
                    class239 var18 = (class239) var9;
                    if (var18.field3450 != -1 || var18.field3476 != -1) {
                        class94.method680(arg2 >> 1, arg3, arg1, arg4 >> 1, false, var9.method2294((byte) 36) + 15, var9);
                        if (class300.field4405 > -1) {
                            if (var18.field3450 != -1) {
                                class221.field3187[var18.field3450].method85(class300.field4405 + arg0 - 12, class206.field2860 + arg5 + -var17);
                                var17 += 25;
                            }
                            if (var18.field3476 != -1) {
                                class254.field3708[var18.field3476].method85(class300.field4405 + arg0 - 12, class206.field2860 + arg5 + -var17);
                                var17 += 25;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        class234[] var19 = class102.field1326;
                        for (int var20 = 0; var20 < var19.length; var20++) {
                            class234 var21 = var19[var20];
                            if (var21 != null && var21.field3359 == 10 && class288.field4157[var8] == var21.field3358) {
                                class94.method680(arg2 >> 1, arg3, arg1, arg4 >> 1, false, var9.method2294((byte) -127) + 15, var9);
                                if (class300.field4405 > -1) {
                                    class291.field4233[var21.field3355].method85(class300.field4405 + arg0 - 12, arg5 - -class206.field2860 + -var17);
                                }
                            }
                        }
                    }
                }
                if (var9.field4864 != null && (var8 >= class112.field1441 || class322.field4731 == 0 || class322.field4731 == 3 || class322.field4731 == 1 && class15.method107(-111, ((class239) var9).field3475))) {
                    class94.method680(arg2 >> 1, arg3, arg1, arg4 >> 1, false, var9.method2294((byte) -127), var9);
                    if (class300.field4405 > -1 && class118.field1541 < class160.field2281) {
                        class160.field2275[class118.field1541] = class186.field2554.method1894(var9.field4864) / 2;
                        class160.field2271[class118.field1541] = class186.field2554.field3999;
                        class160.field2274[class118.field1541] = class300.field4405;
                        class160.field2288[class118.field1541] = class206.field2860;
                        class160.field2272[class118.field1541] = var9.field4865;
                        class160.field2268[class118.field1541] = var9.field4887;
                        class160.field2276[class118.field1541] = var9.field4918;
                        class160.field2282[class118.field1541] = var9.field4864;
                        class118.field1541++;
                    }
                }
                if (class313.field4603 < var9.field4880) {
                    class158 var22 = class314.field4624[0];
                    class158 var23 = class314.field4624[1];
                    int var24;
                    if ((var9 instanceof class169)) {
                        class169 var25 = (class169) var9;
                        class158[] var26 = (class158[]) ((class158[]) class224.field3232.method2265((long) var25.field2345.field2190, (byte) 121));
                        if (var26 == null) {
                            var26 = class356.method2473(class1.field7, (byte) 110, 0, var25.field2345.field2190);
                            if (var26 != null) {
                                class224.field3232.method2257(-127, var26, (long) var25.field2345.field2190);
                            }
                        }
                        if (var26 != null && var26.length == 2) {
                            var23 = var26[1];
                            var22 = var26[0];
                        }
                        class157 var27 = var25.field2345;
                        if (var27.field2221 == -1) {
                            var24 = var9.method2294((byte) 86);
                        } else {
                            var24 = var27.field2221;
                        }
                    } else {
                        var24 = var9.method2294((byte) -48);
                    }
                    class94.method680(arg2 >> 1, arg3, arg1, arg4 >> 1, false, var22.field2250 + var24 + 10, var9);
                    if (class300.field4405 > -1) {
                        int var28 = arg0 + class300.field4405 - (var22.field2252 >> 1);
                        int var29 = class206.field2860 + arg5 - 3;
                        var22.method85(var28, var29);
                        int var30 = var9.field4917 * var22.field2252 / 255;
                        int var31 = var22.field2250;
                        if (class47.field623) {
                            class129.method988(var28, var29, var28 + var30, var29 + var31);
                        } else {
                            class37.method246(var28, var29, var28 + var30, var29 - -var31);
                        }
                        var23.method85(var28, var29);
                        if (class47.field623) {
                            class129.method989(arg0, arg5, arg0 + arg4, arg2 + arg5);
                        } else {
                            class37.method235(arg0, arg5, arg0 + arg4, arg2 + arg5);
                        }
                    }
                }
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var9.field4892[var32] > class313.field4603) {
                        int var35;
                        if (var9 instanceof class169) {
                            class169 var33 = (class169) var9;
                            class157 var34 = var33.field2345;
                            if (var34.field2221 == -1) {
                                var35 = var9.method2294((byte) 49) / 2;
                            } else {
                                var35 = var34.field2221 / 2;
                            }
                        } else {
                            var35 = var9.method2294((byte) -42) / 2;
                        }
                        class94.method680(arg2 >> 1, arg3, arg1, arg4 >> 1, false, var35, var9);
                        if (class300.field4405 > -1) {
                            if (var32 == 1) {
                                class206.field2860 -= 20;
                            }
                            if (var32 == 2) {
                                class206.field2860 -= 10;
                                class300.field4405 -= 15;
                            }
                            if (var32 == 3) {
                                class300.field4405 += 15;
                                class206.field2860 -= 10;
                            }
                            class211.field2987[var9.field4882[var32]].method85(class300.field4405 + arg0 - 12, arg5 - (-class206.field2860 + 12));
                            class327.field4771.method1911(Integer.toString(var9.field4854[var32]), arg0 + class300.field4405 - 1, arg5 - -class206.field2860 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var36 = 0; var36 < class118.field1541; var36++) {
            int var37 = class160.field2274[var36];
            int var38 = class160.field2288[var36];
            int var39 = class160.field2275[var36];
            int var40 = class160.field2271[var36];
            boolean var41 = true;
            while (var41) {
                var41 = false;
                for (int var42 = 0; var42 < var36; var42++) {
                    if (class160.field2288[var42] - class160.field2271[var42] < var38 - -2 && var38 - var40 < class160.field2288[var42] + 2 && var37 - var39 < class160.field2275[var42] + class160.field2274[var42] && var37 + var39 > class160.field2274[var42] - class160.field2275[var42] && var38 > class160.field2288[var42] - class160.field2271[var42]) {
                        var41 = true;
                        var38 = class160.field2288[var42] - class160.field2271[var42];
                    }
                }
            }
            class300.field4405 = class160.field2274[var36];
            class206.field2860 = class160.field2288[var36] = var38;
            String var43 = class160.field2282[var36];
            if (class239.field3479 == 0) {
                int var44 = 16776960;
                if (class160.field2272[var36] < 6) {
                    var44 = class15.field165[class160.field2272[var36]];
                }
                if (class160.field2272[var36] == 6) {
                    var44 = class42.field531 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class160.field2272[var36] == 7) {
                    var44 = (class42.field531 % 20) < 10 ? 255 : 65535;
                }
                if (class160.field2272[var36] == 8) {
                    var44 = (class42.field531 % 20) < 10 ? 45056 : 8454016;
                }
                if (class160.field2272[var36] == 9) {
                    int var45 = 150 - class160.field2276[var36];
                    if (var45 < 50) {
                        var44 = var45 * 1280 + 16711680;
                    } else if (var45 < 100) {
                        var44 = 16776960 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var44 = 65280 - (500 - (var45 * 5));
                    }
                }
                if (class160.field2272[var36] == 10) {
                    int var46 = 150 - class160.field2276[var36];
                    if (var46 < 50) {
                        var44 = (var46 * 5) + 16711680;
                    } else if (var46 < 100) {
                        var44 = 16711935 - ((var46 - 50) * 327680);
                    } else if (var46 < 150) {
                        var44 = (var46 - 100) * 327680 + 255 + 500 - (var46 * 5);
                    }
                }
                if (class160.field2272[var36] == 11) {
                    int var47 = 150 - class160.field2276[var36];
                    if (var47 < 50) {
                        var44 = 16777215 - (var47 * 327685);
                    } else if (var47 < 100) {
                        var44 = (var47 - 50) * 327685 + 65280;
                    } else if (var47 < 150) {
                        var44 = 16777215 + 32768000 - (var47 * 327680);
                    }
                }
                if (class160.field2268[var36] == 0) {
                    class186.field2554.method1911(var43, class300.field4405 + arg0, arg5 - -class206.field2860, var44, 0);
                }
                if (class160.field2268[var36] == 1) {
                    class186.field2554.method1903(var43, class300.field4405 + arg0, arg5 - -class206.field2860, var44, 0, class42.field531);
                }
                if (class160.field2268[var36] == 2) {
                    class186.field2554.method1897(var43, class300.field4405 + arg0, class206.field2860 + arg5, var44, 0, class42.field531);
                }
                if (class160.field2268[var36] == 3) {
                    class186.field2554.method1906(var43, arg0 + class300.field4405, class206.field2860 + arg5, var44, 0, class42.field531, 150 - class160.field2276[var36]);
                }
                if (class160.field2268[var36] == 4) {
                    int var48 = (150 - class160.field2276[var36]) * (class186.field2554.method1894(var43) + 100) / 150;
                    if (class47.field623) {
                        class129.method988(arg0 + class300.field4405 - 50, arg5, arg0 + class300.field4405 + 50, arg5 - -arg2);
                    } else {
                        class37.method246(arg0 + class300.field4405 - 50, arg5, arg0 + class300.field4405 + 50, arg2 + arg5);
                    }
                    class186.field2554.method1900(var43, arg0 + class300.field4405 + 50 - var48, arg5 - -class206.field2860, var44, 0);
                    if (class47.field623) {
                        class129.method989(arg0, arg5, arg0 + arg4, arg5 - -arg2);
                    } else {
                        class37.method235(arg0, arg5, arg0 + arg4, arg5 - -arg2);
                    }
                }
                if (class160.field2268[var36] == 5) {
                    int var49 = 0;
                    int var50 = 150 - class160.field2276[var36];
                    if (class47.field623) {
                        class129.method988(arg0, class206.field2860 + arg5 - class186.field2554.field3999 - 1, arg0 - -arg4, arg5 + class206.field2860 + 5);
                    } else {
                        class37.method246(arg0, arg5 + class206.field2860 - class186.field2554.field3999 - 1, arg0 + arg4, arg5 + class206.field2860 + 5);
                    }
                    if (var50 < 25) {
                        var49 = var50 - 25;
                    } else if (var50 > 125) {
                        var49 = var50 - 125;
                    }
                    class186.field2554.method1911(var43, class300.field4405 + arg0, class206.field2860 + var49 + arg5, var44, 0);
                    if (class47.field623) {
                        class129.method989(arg0, arg5, arg0 + arg4, arg5 - -arg2);
                    } else {
                        class37.method235(arg0, arg5, arg0 + arg4, arg2 + arg5);
                    }
                }
            } else {
                class186.field2554.method1911(var43, class300.field4405 + arg0, class206.field2860 + arg5, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 501)
    public static final void method1658(byte arg0) {
        class313.field4598.method197(70);
        field3344++;
        int var1 = 0;
        if (arg0 != 53) {
            method1658((byte) -2);
        }
        while (var1 < 32) {
            class286.field4075[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class116.field1509[var2] = 0L;
        }
        class288.field4172 = 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V", line = 527)
    public static final void method1659(int arg0, int arg1) {
        field3347++;
        class206.field2870[0] = (float) class335.method2339(arg0 >> 16, 255) / 255.0F;
        class206.field2870[2] = (float) class335.method2339(255, arg0) / 255.0F;
        if (arg1 != 65535) {
            field3346 = (String) null;
        }
        class206.field2870[1] = (float) class335.method2339(255, arg0 >> 8) / 255.0F;
        class270.method1840(false, 3);
        class270.method1840(false, 4);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 551)
    public static void method1660(int arg0) {
        field3346 = null;
        field3348 = null;
        if (arg0 != 0) {
            method1658((byte) -65);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V", line = 564)
    public static final void method1661(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -91) {
            return;
        }
        class25.field292 = arg3;
        class321.field4722 = arg4;
        class207.field2937 = arg1;
        class245.field3574 = arg2;
        field3341++;
    }
}
