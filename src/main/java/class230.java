import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class230 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "S")
    public static short field3186 = 1;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "B")
    public byte field3185;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Ljava/lang/String;")
    public String field3180;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Ljava/lang/String;")
    public String field3181;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Ljava/lang/String;")
    public String field3182;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Ljava/lang/String;")
    public String field3188;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZI)V", line = 3)
    public static final void method1450(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3190++;
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg1);
        if (arg0 != 35) {
            method1452(null, (byte) 32, 124, null);
        }
        class373 var8 = (class373) class598.field8356.method970((byte) 89, var6);
        if (var8 == null) {
            var8 = new class373();
            class598.field8356.method968(var6, var8, -1);
        }
        if (arg3 >= var8.field5021.length) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field5021.length; var11++) {
                var9[var11] = var8.field5021[var11];
                var10[var11] = var8.field5020[var11];
            }
            for (int var12 = var8.field5021.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5021 = var9;
            var8.field5020 = var10;
        }
        var8.field5021[arg3] = arg5;
        var8.field5020[arg3] = arg2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 60)
    public static final void method1451(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class301.field4192[var1] = null;
        }
        if (arg0 != -25130) {
            field3186 = -61;
        }
        field3191++;
        class208.field2928 = 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Canvas;BILfa;)Lr;", line = 80)
    public static final class166 method1452(Canvas arg0, byte arg1, int arg2, class212 arg3) {
        if (arg1 == 15) {
            field3183++;
            return new class565(arg0, arg3, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ[Lin;IIIIIII)V", line = 107)
    public static final void method1453(int arg0, boolean arg1, class78[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3189++;
        if (arg1) {
            field3187 = 84;
        }
        class334.field4506.method200(arg3, arg9, arg7, arg8);
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class78 var11 = arg2[var10];
            if (var11 != null && (var11.field1178 == arg4 || arg4 == -1412584499 && class396.field5579 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class596.field8331[class84.field1247].setBounds(var11.field1078 + arg0, var11.field1081 + arg6, var11.field1104, var11.field1050);
                    var12 = class84.field1247++;
                } else {
                    var12 = arg5;
                }
                var11.field1108 = class186.field2697;
                var11.field1071 = var12;
                if (!client.method1687(var11)) {
                    if (var11.field1109 != 0) {
                        class478.method2695(var11, -105);
                    }
                    int var13 = var11.field1078 + arg0;
                    int var14 = var11.field1081 + arg6;
                    int var15 = var11.field1102;
                    if (class314.field4339 && (client.method1679(var11).field4217 != 0 || var11.field1075 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class396.field5579 == var11) {
                        if (arg4 != -1412584499 && (class487.field6685 == var11.field1117 || class262.field3552 == var11.field1117)) {
                            class508.field6962 = arg0;
                            class295.field4045 = arg6;
                            class383.field5418 = arg2;
                            continue;
                        }
                        if (class11.field113 && class198.field2824) {
                            int var16 = class214.field2991.method1499(8);
                            int var17 = class214.field2991.method1491((byte) 113);
                            int var18 = var17 - class220.field3073;
                            int var19 = var16 - class413.field5853;
                            if (class451.field6206 > var19) {
                                var19 = class451.field6206;
                            }
                            if ((var19 + var11.field1104) > (class451.field6206 + class501.field6894.field1104)) {
                                var19 = class451.field6206 + class501.field6894.field1104 - var11.field1104;
                            }
                            if (class1.field3 > var18) {
                                var18 = class1.field3;
                            }
                            if ((class1.field3 + class501.field6894.field1050) < (var18 + var11.field1050)) {
                                var18 = class1.field3 + class501.field6894.field1050 - var11.field1050;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (class262.field3552 == var11.field1117) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field1075 == 2) {
                        var24 = arg7;
                        var23 = arg9;
                        var22 = arg3;
                        var25 = arg8;
                    } else {
                        int var20 = var11.field1104 + var13;
                        int var21 = var11.field1050 + var14;
                        var22 = var13 > arg3 ? var13 : arg3;
                        var23 = var14 <= arg9 ? arg9 : var14;
                        if (var11.field1075 == 9) {
                            var20++;
                            var21++;
                        }
                        var24 = arg7 <= var20 ? arg7 : var20;
                        var25 = arg8 <= var21 ? arg8 : var21;
                    }
                    if (var22 < var24 && var25 > var23) {
                        if (var11.field1109 != 0) {
                            if (class42.field489 == var11.field1109 || class99.field1387 == var11.field1109) {
                                class401.method2342(true, var14, class99.field1387 == var11.field1109, var11.field1050, var13, var11.field1104);
                                class130.field1872[var12] = true;
                                class334.field4506.method200(arg3, arg9, arg7, arg8);
                                continue;
                            }
                            if (class325.field4429 == var11.field1109) {
                                if (var11.method608(class334.field4506, (byte) -118) != null) {
                                    class466.method2634(5);
                                    class266.method1624(var11, class334.field4506, (byte) -111, var14, var13);
                                    class325.field4428[var12] = true;
                                    class334.field4506.method200(arg3, arg9, arg7, arg8);
                                }
                                continue;
                            }
                            if (class133.field1901 == var11.field1109) {
                                if (var11.method608(class334.field4506, (byte) -102) != null) {
                                    class652.method3670(var14, (byte) 124, var11, var13);
                                    class325.field4428[var12] = true;
                                    class334.field4506.method200(arg3, arg9, arg7, arg8);
                                }
                                continue;
                            }
                            if (class346.field4633 == var11.field1109) {
                                class61.method504(class334.field4506, class345.field4629, var11.field1050, 15053, var11.field1104, var14, var13);
                                class130.field1872[var12] = true;
                                class334.field4506.method200(arg3, arg9, arg7, arg8);
                                continue;
                            }
                            if (class86.field1259 == var11.field1109) {
                                class251.method1545(2, var11.field1050, var14, var13, var11.field1104, class334.field4506);
                                class130.field1872[var12] = true;
                                class334.field4506.method200(arg3, arg9, arg7, arg8);
                                continue;
                            }
                            if (class596.field8334 == var11.field1109) {
                                if (!class109.field1514 && !class108.field1499) {
                                    continue;
                                }
                                int var26 = var13 + var11.field1104;
                                int var27 = var14 + 15;
                                if (class109.field1514) {
                                    int var28 = -256;
                                    if (class131.field1883 < 20) {
                                        var28 = -65536;
                                    }
                                    class273.field3741.method2411("Fps:" + class131.field1883, (byte) 59, var26, var28, var27, -1);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 98304) {
                                        var31 = -65536;
                                        if (class241.field3300) {
                                            class595.method3363(80);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class114.method819((byte) -123, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class273.field3741.method2411("Mem:" + var30 + "k", (byte) 121, var26, var31, var27, -1);
                                    var27 += 15;
                                    class273.field3741.method2411("In:" + class452.field6233 + "B/s Out:" + class214.field2989 + "B/s", (byte) 67, var26, -256, var27, -1);
                                    var27 += 15;
                                    int var33 = class334.field4506.method169() / 1024;
                                    class273.field3741.method2411("Offheap:" + var33 + "k", (byte) 68, var26, var33 <= 65536 ? -256 : -65536, var27, -1);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class372.field5017[var37] != null) {
                                            var34 += class372.field5017[var37].method842((byte) 64);
                                            var35 += class372.field5017[var37].method855((byte) 8);
                                            var36 += class372.field5017[var37].method854((byte) -43);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class554.method3108(2, 0, (long) var39, true, (byte) -93) + "% (" + var38 + "%)";
                                    class499.field6781.method2411(var40, (byte) 86, var26, -256, var27, -1);
                                    var27 += 12;
                                }
                                if (class201.field2849 > 0) {
                                    class499.field6781.method2411("Particles: " + class565.field7822 + " / " + class201.field2849, (byte) 89, var26, -256, var27, -1);
                                }
                                var27 += 12;
                                if (class108.field1499) {
                                    class499.field6781.method2411("Polys: " + class334.field4506.method184() + " Models: " + class334.field4506.method97(), (byte) 108, var26, -256, var27, -1);
                                    var27 += 12;
                                    class499.field6781.method2411("Ls: " + class531.field7180 + " La: " + class37.field442 + " NPC: " + class299.field4078 + " Pl: " + class121.field1664, (byte) 93, var26, -256, var27, -1);
                                    class577.method3294(24815);
                                    var27 += 12;
                                }
                                class130.field1872[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field1075 == 0) {
                            if (class511.field7019 == var11.field1109 && class334.field4506.method120()) {
                                class334.field4506.method103(var13, var14, var11.field1104, var11.field1050);
                            }
                            method1453(var13 - var11.field1158, false, arg2, var22, var11.field1129, var12, var14 - var11.field1170, var24, var25, var23);
                            if (var11.field1046 != null) {
                                method1453(var13 - var11.field1158, false, var11.field1046, var22, var11.field1129, var12, var14 - var11.field1170, var24, var25, var23);
                            }
                            class685 var41 = (class685) class4.field26.method970((byte) 89, (long) var11.field1129);
                            if (var41 != null) {
                                class453.method2574(var23, var14, var25, var13, false, var12, var24, var22, var41.field9776);
                            }
                            if (class511.field7019 == var11.field1109 && class334.field4506.method120()) {
                                class334.field4506.method104();
                            }
                            class334.field4506.method200(arg3, arg9, arg7, arg8);
                        }
                        if (class633.field8764[var12] || class571.field8104 > 1) {
                            if (var11.field1075 == 3) {
                                if (var15 == 0) {
                                    if (var11.field1098) {
                                        class334.field4506.method110(var13, var14, var11.field1104, var11.field1050, var11.field1180, 0);
                                    } else {
                                        class334.field4506.method190(var13, var14, var11.field1104, var11.field1050, var11.field1180, 0);
                                    }
                                } else if (var11.field1098) {
                                    class334.field4506.method110(var13, var14, var11.field1104, var11.field1050, 255 - (var15 & 0xFF) << 24 | var11.field1180 & 0xFFFFFF, 1);
                                } else {
                                    class334.field4506.method190(var13, var14, var11.field1104, var11.field1050, var11.field1180 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field1075 == 4) {
                                class417 var42 = var11.method606(class334.field4506, (byte) 3);
                                if (var42 != null) {
                                    int var43 = var11.field1180;
                                    String var44 = var11.field1083;
                                    if (var11.field1145 != -1) {
                                        class661 var45 = class599.field8366.method3949(0, var11.field1145);
                                        var44 = var45.field9222;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field9254 == 1 || var11.field1095 != 1) && var11.field1095 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class91.method665(var11.field1095, arg1);
                                        }
                                    }
                                    if (class578.field8165 == var11) {
                                        var44 = class65.field819.method555(class697.field9900, true);
                                        var43 = var11.field1180;
                                    }
                                    if (class500.field6795) {
                                        class334.field4506.method123(var13, var14, var13 + var11.field1104, var11.field1050 + var14);
                                    }
                                    var42.method2421(var11.field1168, var11.field1120, class382.field5248, var11.field1054 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field1038, var43 | 255 - (var15 & 0xFF) << 24, null, var11.field1050, null, 0, var14, var44, var13, 169, var11.field1104, var11.field1142, 0);
                                    if (class500.field6795) {
                                        class334.field4506.method200(arg3, arg9, arg7, arg8);
                                    }
                                } else if (class346.field4634) {
                                    class26.method255(var11, -20229);
                                }
                            } else if (var11.field1075 == 5) {
                                if (var11.field1099 < 0) {
                                    class702 var46;
                                    if (var11.field1145 == -1) {
                                        var46 = var11.method601((byte) 101, class334.field4506);
                                    } else {
                                        class527 var47 = var11.field1113 ? class143.field2063.field9689 : null;
                                        var46 = class599.field8366.method3960(-21722, var11.field1095, var11.field1076, var11.field1052, var11.field1145, class334.field4506, var47, var11.field1154 | 0xFF000000);
                                    }
                                    if (var46 != null) {
                                        int var48 = var46.method1660();
                                        int var49 = var46.method1661();
                                        int var50 = (var11.field1180 == 0 ? 16777215 : var11.field1180 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field1181) {
                                            class334.field4506.method123(var13, var14, var13 + var11.field1104, var14 - -var11.field1050);
                                            if (var11.field1152 != 0) {
                                                int var51 = (-(-var48 - var11.field1104) - 1) / var48;
                                                int var52 = (-(-var49 - var11.field1050) - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field1180 == 0) {
                                                            var46.method3929((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1152);
                                                        } else {
                                                            var46.method3933((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1152, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field1180 == 0 && var15 == 0) {
                                                var46.method3926(var13, var14, var11.field1104, var11.field1050);
                                            } else {
                                                var46.method1656(var13, var14, var11.field1104, var11.field1050, 0, var50, 1);
                                            }
                                            class334.field4506.method200(arg3, arg9, arg7, arg8);
                                        } else if (var11.field1180 == 0 && var15 == 0) {
                                            if (var11.field1152 != 0) {
                                                var46.method3929((float) var11.field1104 / 2.0F + (float) var13, (float) var11.field1050 / 2.0F + (float) var14, var11.field1104 * 4096 / var48, var11.field1152);
                                            } else if (var11.field1104 == var48 && var11.field1050 == var49) {
                                                var46.method3927(var13, var14);
                                            } else {
                                                var46.method3932(var13, var14, var11.field1104, var11.field1050);
                                            }
                                        } else if (var11.field1152 != 0) {
                                            var46.method3933((float) var11.field1104 / 2.0F + (float) var13, (float) var11.field1050 / 2.0F + (float) var14, var11.field1104 * 4096 / var48, var11.field1152, 0, var50, 1);
                                        } else if (var11.field1104 == var48 && var11.field1050 == var49) {
                                            var46.method935(var13, var14, 0, var50, 1);
                                        } else {
                                            var46.method3934(var13, var14, var11.field1104, var11.field1050, 0, var50, 1);
                                        }
                                    } else if (class346.field4634) {
                                        class26.method255(var11, -20229);
                                    }
                                } else {
                                    var11.method612(class433.field6033, class444.field6147, 0).method2390(class334.field4506, var11.field1104, 3, var13, var11.field1050, var14, var11.field1126 << 3, var11.field1055 << 3, 0, 0);
                                }
                            } else if (var11.field1075 == 6) {
                                class486.method2762(0);
                                class55 var55 = null;
                                int var56 = 0;
                                if (var11.field1145 != -1) {
                                    class661 var64 = class599.field8366.method3949(0, var11.field1145);
                                    if (var64 != null) {
                                        class661 var65 = var64.method3727(var11.field1095, (byte) -27);
                                        class403 var66 = var11.field1028 == -1 ? null : class192.field2727.method3090(25, var11.field1028);
                                        class527 var67 = var11.field1113 ? class143.field2063.field9689 : null;
                                        var55 = var65.method3718(var11.field1176, var11.field1037, var11.field1045, var66, 2048, 1, 101, class334.field4506, var67);
                                        if (var55 == null) {
                                            class26.method255(var11, -20229);
                                        } else {
                                            var56 = -var55.method463() >> 1;
                                        }
                                    }
                                } else if (var11.field1084 == 5) {
                                    int var61 = var11.field1114;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class677 var62 = class671.field9407[var61];
                                        class403 var63 = var11.field1028 == -1 ? null : class192.field2727.method3090(-117, var11.field1028);
                                        if (var62 != null && (class409.field5813 == var61 || class79.method623((byte) -93, var62.field9693) == var11.field1127)) {
                                            var55 = var62.field9689.method3008(0, class347.field4640, var11.field1045, var11.field1176, class578.field8156, class192.field2727, null, class599.field8366, 0, true, null, 2048, -1, var11.field1037, class85.field1251, var63, 0, null, (byte) 124, class334.field4506, class198.field2828);
                                        }
                                    }
                                } else if (var11.field1084 == 8 || var11.field1084 == 9) {
                                    class373 var58 = class687.method3877(var11.field1114, false, 57);
                                    class403 var59 = var11.field1028 == -1 ? null : class192.field2727.method3090(-78, var11.field1028);
                                    if (var58 != null) {
                                        class527 var60 = var11.field1113 ? class143.field2063.field9689 : null;
                                        var55 = var58.method2145((byte) 110, var11.field1045, var11.field1176, 2048, var11.field1037, var60, var11.field1084 == 9, var11.field1127, var59, class334.field4506);
                                    }
                                } else if (var11.field1028 == -1) {
                                    var55 = var11.method613(class334.field4506, 2048, class599.field8366, -1, -91, class198.field2828, class347.field4640, class143.field2063.field9689, class85.field1251, 0, -1, null, class578.field8156, class192.field2727);
                                    if (var55 == null && class346.field4634) {
                                        class26.method255(var11, -20229);
                                    }
                                } else {
                                    class403 var57 = class192.field2727.method3090(-91, var11.field1028);
                                    var55 = var11.method613(class334.field4506, 2048, class599.field8366, var11.field1037, -86, class198.field2828, class347.field4640, class143.field2063.field9689, class85.field1251, var11.field1176, var11.field1045, var57, class578.field8156, class192.field2727);
                                    if (var55 == null && class346.field4634) {
                                        class26.method255(var11, -20229);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field1039 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var11.field1104 << 9) / var11.field1039;
                                    }
                                    int var69;
                                    if (var11.field1184 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var11.field1050 << 9) / var11.field1184;
                                    }
                                    int var70 = var11.field1104 / 2 + var13;
                                    int var71 = var11.field1050 / 2 + var14;
                                    if (!var11.field1183) {
                                        var70 += var11.field1021 * var68 >> 9;
                                        var71 += var11.field1020 * var69 >> 9;
                                    }
                                    class250.field3403.method679();
                                    class334.field4506.method93(class250.field3403);
                                    class334.field4506.method161(var70, var71, var68, var69);
                                    class334.field4506.method89();
                                    if (var11.field1143) {
                                        class334.field4506.method202(false);
                                    }
                                    if (var11.field1183) {
                                        class524.field7112.method678(var11.field1097);
                                        class524.field7112.method674(var11.field1163);
                                        class524.field7112.method673(var11.field1092);
                                        class524.field7112.method687(var11.field1021, var11.field1020, var11.field1118);
                                    } else {
                                        int var72 = (var11.field1155 << 2) * class597.field8342[var11.field1097 << 3] >> 14;
                                        int var73 = (var11.field1155 << 2) * class597.field8344[var11.field1097 << 3] >> 14;
                                        class524.field7112.method686(-var11.field1092 << 3);
                                        class524.field7112.method674(var11.field1163 << 3);
                                        class524.field7112.method687(var11.field1160 << 2, var56 + var72 + (var11.field1016 << 2), (var11.field1016 << 2) + var73);
                                        class524.field7112.method684(var11.field1097 << 3);
                                    }
                                    var11.method615(var55, class334.field4506, -21, class186.field2697, class524.field7112);
                                    if (class500.field6795) {
                                        class334.field4506.method123(var13, var14, var11.field1104 + var13, var11.field1050 + var14);
                                    }
                                    if (var11.field1183) {
                                        if (var11.field1053) {
                                            var55.method453(class524.field7112, null, var11.field1155, 1);
                                        } else {
                                            var55.method465(class524.field7112, null, 1);
                                            if (var11.field1040 != null) {
                                                class334.field4506.method163(var11.field1040.method3607());
                                            }
                                        }
                                    } else if (var11.field1053) {
                                        var55.method453(class524.field7112, null, var11.field1155 << 2, 1);
                                    } else {
                                        var55.method465(class524.field7112, null, 1);
                                        if (var11.field1040 != null) {
                                            class334.field4506.method163(var11.field1040.method3607());
                                        }
                                    }
                                    if (class500.field6795) {
                                        class334.field4506.method200(arg3, arg9, arg7, arg8);
                                    }
                                    if (var11.field1143) {
                                        class334.field4506.method202(true);
                                    }
                                }
                            } else if (var11.field1075 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field1137) {
                                    var74 = var11.field1050 + var14;
                                    var75 = var14;
                                    var76 = var13;
                                    var77 = var11.field1104 + var13;
                                } else {
                                    var76 = var13;
                                    var77 = var11.field1104 + var13;
                                    var74 = var14;
                                    var75 = var11.field1050 + var14;
                                }
                                if (var11.field1061 == 1) {
                                    class334.field4506.method113(var76, var74, var77, var75, var11.field1180, 0);
                                } else {
                                    class334.field4506.method141(var76, var74, var77, var75, var11.field1180, var11.field1061, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
