import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class27 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    public static int[] field585 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "S")
    public static short field589 = 256;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lek;")
    public static class174 field588;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lbg;I)Ltj;", line = 17)
    public static final class170 method173(class194 arg0, int arg1) {
        field587++;
        arg0.method1325(7627);
        int var2 = arg0.method1325(7627);
        class170 var3 = class288.method1990(120, var2);
        var3.field2966 = arg0.method1325(7627);
        int var4 = arg0.method1325(7627);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1325(arg1 ^ 0x7942);
            var3.method63(var6, arg0, (byte) 13);
        }
        if (arg1 != 25737) {
            method174(-47);
        }
        var3.method267(-2718);
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 51)
    public static void method174(int arg0) {
        if (arg0 == -31717) {
            field585 = null;
            field588 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I", line = 64)
    public static final int method175(int arg0, int arg1, int arg2) {
        field590++;
        if (arg0 >= -47) {
            field585 = (int[]) null;
        }
        int var3 = arg1 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V", line = 91)
    public static final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class77.field1415 = 0;
        field584++;
        if (arg6 < 3) {
            method175(-120, -68, -38);
        }
        for (int var7 = -1; var7 < class75.field1404 + class37.field749; var7++) {
            class16 var8;
            if (var7 == -1) {
                var8 = class163.field2796;
            } else if (class75.field1404 <= var7) {
                var8 = class201.field3560[class39.field839[var7 - class75.field1404]];
            } else {
                var8 = class140.field2405[class203.field3593[var7]];
            }
            if (var8 != null && var8.method122(false)) {
                if (var8 instanceof class115) {
                    class208 var9 = ((class115) var8).field1934;
                    if (var9.field3655 != null) {
                        var9 = var9.method1429((byte) -96);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class75.field1404) {
                    class208 var15 = ((class115) var8).field1934;
                    if (var15.field3655 != null) {
                        var15 = var15.method1429((byte) -96);
                    }
                    if (var15.field3659 >= 0 && var15.field3659 < class117.field1986.length) {
                        int var16;
                        if (var15.field3685 == -1) {
                            var16 = var8.method124(-104) + 15;
                        } else {
                            var16 = var15.field3685 + 15;
                        }
                        class96.method603(var8, 0, arg0 >> 1, arg1, arg2 >> 1, arg3, var16);
                        if (class128.field2205 > -1) {
                            class117.field1986[var15.field3659].method273(class128.field2205 + arg4 - 12, arg5 - -class193.field3339 + -30);
                        }
                    }
                    class199[] var17 = class260.field4489;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class199 var19 = var17[var18];
                        if (var19 != null && var19.field3475 == 1 && class39.field839[var7 - class75.field1404] == var19.field3466 && (class293.field5011 % 20) < 10) {
                            int var20;
                            if (var15.field3685 == -1) {
                                var20 = var8.method124(-65) + 15;
                            } else {
                                var20 = var15.field3685 + 15;
                            }
                            class96.method603(var8, 0, arg0 >> 1, arg1, arg2 >> 1, arg3, var20);
                            if (class128.field2205 > -1) {
                                class242.field4147[var19.field3474].method273(class128.field2205 + arg4 - 12, class193.field3339 + arg5 + -28);
                            }
                        }
                    }
                } else {
                    class123 var10 = (class123) var8;
                    int var11 = 30;
                    if (var10.field2086 != -1 || var10.field2069 != -1) {
                        class96.method603(var8, 0, arg0 >> 1, arg1, arg2 >> 1, arg3, var8.method124(-113) + 15);
                        if (class128.field2205 > -1) {
                            if (var10.field2086 != -1) {
                                class208.field3641[var10.field2086].method273(arg4 + class128.field2205 - 12, class193.field3339 - var11 + arg5);
                                var11 += 25;
                            }
                            if (var10.field2069 != -1) {
                                class117.field1986[var10.field2069].method273(class128.field2205 + arg4 - 12, -var11 + class193.field3339 + arg5);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class199[] var12 = class260.field4489;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class199 var14 = var12[var13];
                            if (var14 != null && var14.field3475 == 10 && class203.field3593[var7] == var14.field3466) {
                                class96.method603(var8, 0, arg0 >> 1, arg1, arg2 >> 1, arg3, var8.method124(-87) + 15);
                                if (class128.field2205 > -1) {
                                    class242.field4147[var14.field3474].method273(arg4 - (12 - class128.field2205), class193.field3339 + arg5 + -var11);
                                }
                            }
                        }
                    }
                }
                if (var8.field462 != null && (class75.field1404 <= var7 || class217.field3827 == 0 || class217.field3827 == 3 || class217.field3827 == 1 && class84.method535(((class123) var8).field2079, -1373))) {
                    class96.method603(var8, 0, arg0 >> 1, arg1, arg2 >> 1, arg3, var8.method124(-68));
                    if (class128.field2205 > -1 && class161.field2752 > class77.field1415) {
                        class161.field2757[class77.field1415] = client.field4159.method2070(var8.field462) / 2;
                        class161.field2750[class77.field1415] = client.field4159.field5189;
                        class161.field2747[class77.field1415] = class128.field2205;
                        class161.field2743[class77.field1415] = class193.field3339;
                        class161.field2753[class77.field1415] = var8.field465;
                        class161.field2759[class77.field1415] = var8.field473;
                        class161.field2760[class77.field1415] = var8.field471;
                        class161.field2748[class77.field1415] = var8.field462;
                        class77.field1415++;
                    }
                }
                if (class293.field5011 < var8.field437) {
                    class55 var21 = class152.field2621[0];
                    class55 var22 = class152.field2621[1];
                    int var26;
                    if (var8 instanceof class115) {
                        class115 var23 = (class115) var8;
                        class55[] var24 = (class55[]) ((class55[]) class93.field1575.method1836((long) var23.field1934.field3664, 0));
                        if (var24 == null) {
                            var24 = class240.method1632(var23.field1934.field3664, (byte) 102, 0, class4.field74);
                            if (var24 != null) {
                                class93.field1575.method1835((byte) -81, (long) var23.field1934.field3664, var24);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        class208 var25 = var23.field1934;
                        if (var25.field3685 == -1) {
                            var26 = var8.method124(-119);
                        } else {
                            var26 = var25.field3685;
                        }
                    } else {
                        var26 = var8.method124(-95);
                    }
                    class96.method603(var8, 0, arg0 >> 1, arg1, arg2 >> 1, arg3, var21.field1060 + var26 + 10);
                    if (class128.field2205 > -1) {
                        int var27 = class128.field2205 + arg4 - (var21.field1058 >> 1);
                        int var28 = arg5 - (3 - class193.field3339);
                        var21.method273(var27, var28);
                        int var29 = var8.field429 * var21.field1058 / 255;
                        int var30 = var21.field1060;
                        if (class247.field4247) {
                            class269.method1874(var27, var28, var27 + var29, var28 - -var30);
                        } else {
                            class213.method1467(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method273(var27, var28);
                        if (class247.field4247) {
                            class269.method1875(arg4, arg5, arg4 + arg0, arg5 - -arg2);
                        } else {
                            class213.method1470(arg4, arg5, arg0 + arg4, arg2 + arg5);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field419[var31] > class293.field5011) {
                        int var34;
                        if (var8 instanceof class115) {
                            class115 var32 = (class115) var8;
                            class208 var33 = var32.field1934;
                            if (var33.field3685 == -1) {
                                var34 = var8.method124(-58) / 2;
                            } else {
                                var34 = var33.field3685 / 2;
                            }
                        } else {
                            var34 = var8.method124(-93) / 2;
                        }
                        class96.method603(var8, 0, arg0 >> 1, arg1, arg2 >> 1, arg3, var34);
                        if (class128.field2205 > -1) {
                            if (var31 == 1) {
                                class193.field3339 -= 20;
                            }
                            if (var31 == 2) {
                                class193.field3339 -= 10;
                                class128.field2205 -= 15;
                            }
                            if (var31 == 3) {
                                class128.field2205 += 15;
                                class193.field3339 -= 10;
                            }
                            class32.field708[var8.field438[var31]].method273(class128.field2205 + arg4 - 12, class193.field3339 + arg5 + -12);
                            class34.field724.method2082(class257.method1811(var8.field417[var31], (byte) 69), arg4 + class128.field2205 - 1, class193.field3339 + arg5 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class77.field1415; var35++) {
            int var36 = class161.field2747[var35];
            int var37 = class161.field2743[var35];
            int var38 = class161.field2757[var35];
            int var39 = class161.field2750[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class161.field2743[var41] - class161.field2750[var41] < var37 + 2 && (class161.field2743[var41] + 2) > (var37 - var39) && (var36 - var38) < (class161.field2747[var41] + class161.field2757[var41]) && (class161.field2747[var41] - class161.field2757[var41]) < (var36 + var38) && var37 > class161.field2743[var41] - class161.field2750[var41]) {
                        var40 = true;
                        var37 = class161.field2743[var41] - class161.field2750[var41];
                    }
                }
            }
            class128.field2205 = class161.field2747[var35];
            class193.field3339 = class161.field2743[var35] = var37;
            class128 var42 = class161.field2748[var35];
            if (class43.field884 == 0) {
                int var43 = 16776960;
                if (class161.field2753[var35] < 6) {
                    var43 = class125.field2099[class161.field2753[var35]];
                }
                if (class161.field2753[var35] == 6) {
                    var43 = (class167.field2873 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class161.field2753[var35] == 7) {
                    var43 = class167.field2873 % 20 < 10 ? 255 : 65535;
                }
                if (class161.field2753[var35] == 8) {
                    var43 = (class167.field2873 % 20) < 10 ? 45056 : 8454016;
                }
                if (class161.field2753[var35] == 9) {
                    int var44 = 150 - class161.field2760[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 33160960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class161.field2753[var35] == 10) {
                    int var45 = 150 - class161.field2760[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 33095935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = -((var45 - 100) * 5 - (var45 * 327680)) - 32767745;
                    }
                }
                if (class161.field2753[var35] == 11) {
                    int var46 = 150 - class161.field2760[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 + 32768000 - (var46 * 327680);
                    }
                }
                if (class161.field2759[var35] == 0) {
                    client.field4159.method2082(var42, class128.field2205 + arg4, class193.field3339 + arg5, var43, 0);
                }
                if (class161.field2759[var35] == 1) {
                    client.field4159.method2079(var42, class128.field2205 + arg4, class193.field3339 + arg5, var43, 0, class167.field2873);
                }
                if (class161.field2759[var35] == 2) {
                    client.field4159.method2074(var42, class128.field2205 + arg4, class193.field3339 + arg5, var43, 0, class167.field2873);
                }
                if (class161.field2759[var35] == 3) {
                    client.field4159.method2085(var42, class128.field2205 + arg4, class193.field3339 + arg5, var43, 0, class167.field2873, 150 - class161.field2760[var35]);
                }
                if (class161.field2759[var35] == 4) {
                    int var47 = (150 - class161.field2760[var35]) * (client.field4159.method2070(var42) + 100) / 150;
                    if (class247.field4247) {
                        class269.method1874(arg4 + class128.field2205 - 50, arg5, class128.field2205 + arg4 + 50, arg2 + arg5);
                    } else {
                        class213.method1467(class128.field2205 + arg4 - 50, arg5, class128.field2205 + arg4 + 50, arg5 - -arg2);
                    }
                    client.field4159.method2067(var42, class128.field2205 + arg4 + 50 - var47, class193.field3339 + arg5, var43, 0);
                    if (class247.field4247) {
                        class269.method1875(arg4, arg5, arg0 + arg4, arg2 + arg5);
                    } else {
                        class213.method1470(arg4, arg5, arg0 + arg4, arg5 - -arg2);
                    }
                }
                if (class161.field2759[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class161.field2760[var35];
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    if (class247.field4247) {
                        class269.method1874(arg4, class193.field3339 + arg5 - client.field4159.field5189 - 1, arg0 + arg4, class193.field3339 + arg5 + 5);
                    } else {
                        class213.method1467(arg4, class193.field3339 + arg5 - client.field4159.field5189 - 1, arg0 + arg4, arg5 + class193.field3339 + 5);
                    }
                    client.field4159.method2082(var42, arg4 + class128.field2205, class193.field3339 + var48 + arg5, var43, 0);
                    if (class247.field4247) {
                        class269.method1875(arg4, arg5, arg0 + arg4, arg2 + arg5);
                    } else {
                        class213.method1470(arg4, arg5, arg0 + arg4, arg2 + arg5);
                    }
                }
            } else {
                client.field4159.method2082(var42, class128.field2205 + arg4, class193.field3339 + arg5, 16776960, 0);
            }
        }
    }
}
