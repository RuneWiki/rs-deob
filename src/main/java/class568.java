import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class568 {

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "[I")
    public static int[] field7181 = new int[2];

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "[I")
    public static int[] field7182 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field7183 = 0;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "F")
    public static float field7184;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIII[Luaa;IIZI)V")
    public static final void method3060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class391[] arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field7180++;
        class576.field7320.method915(arg4, arg7, arg10, arg8);
        if (arg3 != 1) {
            return;
        }
        for (int var11 = 0; var11 < arg6.length; var11++) {
            class391 var12 = arg6[var11];
            if (var12 != null && (var12.field5136 == arg5 || arg5 == -1412584499 && class430.field5649 == var12)) {
                int var13 = var12.field5119 + arg2;
                int var14 = var12.field5003 + arg0;
                int var15 = var12.field5117 + var13 + 1;
                int var16 = var14 - (-var12.field5031 - 1);
                int var17;
                if (arg1 == -1) {
                    class393.field5181[class547.field6839].setBounds(var12.field5119 + arg2, var12.field5003 + arg0, var12.field5117, var12.field5031);
                    var17 = class547.field6839++;
                } else {
                    var17 = arg1;
                }
                var12.field5109 = var17;
                var12.field4989 = class693.field8900;
                if (!client.method2630(var12)) {
                    if (var12.field5110 != 0) {
                        class275.method1698(var12, 5);
                    }
                    int var18 = var12.field5119 + arg2;
                    int var19 = var12.field5003 + arg0;
                    int var20 = 0;
                    int var21 = 0;
                    if (class602.field7657) {
                        var20 = class498.method2765((byte) -57);
                        var21 = class507.method2806((byte) -61);
                    }
                    int var22 = var12.field5079;
                    if (class538.field6782 && (client.method2637(var12).field4547 != 0 || var12.field5007 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class430.field5649 == var12) {
                        if (arg5 != -1412584499 && (class719.field9454 == var12.field5152 || class674.field8724 == var12.field5152)) {
                            class564.field7160 = arg0;
                            class276.field3595 = arg6;
                            class225.field3047 = arg2;
                            continue;
                        }
                        if (class614.field7749 && class553.field7004) {
                            int var23 = class737.field9980.method210(0) + var20;
                            int var24 = var21 + class737.field9980.method208(-53);
                            int var25 = var24 - class307.field3858;
                            int var26 = var23 - class251.field3426;
                            if (var26 < class72.field978) {
                                var26 = class72.field978;
                            }
                            if (var25 < class330.field4040) {
                                var25 = class330.field4040;
                            }
                            if ((class72.field978 + class198.field2759.field5117) < (var12.field5117 + var26)) {
                                var26 = class198.field2759.field5117 + class72.field978 - var12.field5117;
                            }
                            if ((var12.field5031 + var25) > (class330.field4040 + class198.field2759.field5031)) {
                                var25 = class198.field2759.field5031 + class330.field4040 - var12.field5031;
                            }
                            var18 = var26;
                            var19 = var25;
                        }
                        if (class674.field8724 == var12.field5152) {
                            var22 = 128;
                        }
                    }
                    int var27;
                    int var28;
                    int var29;
                    int var30;
                    if (var12.field5007 == 2) {
                        var27 = arg4;
                        var28 = arg8;
                        var29 = arg7;
                        var30 = arg10;
                    } else {
                        int var31 = var12.field5117 + var18;
                        int var32 = var12.field5031 + var19;
                        var27 = arg4 >= var18 ? arg4 : var18;
                        if (var12.field5007 == 9) {
                            var32++;
                            var31++;
                        }
                        var29 = arg7 >= var19 ? arg7 : var19;
                        var30 = var31 < arg10 ? var31 : arg10;
                        var28 = var32 < arg8 ? var32 : arg8;
                    }
                    if (var27 < var30 && var28 > var29) {
                        if (var12.field5110 != 0) {
                            if (class66.field870 == var12.field5110 || class638.field8117 == var12.field5110) {
                                class500.method2774(var19, -26279, var18, var12);
                                if (!class602.field7657) {
                                    class292.method1764(var12.field5031, class638.field8117 == var12.field5110, 112, var19, var12.field5117, var18);
                                    class576.field7320.method915(arg4, arg7, arg10, arg8);
                                }
                                class454.field5919[var17] = true;
                                continue;
                            }
                            if (class131.field1737 == var12.field5110) {
                                if (var12.method2251(true, class576.field7320) != null) {
                                    class204.method1385(79);
                                    class136.method788(var19, class576.field7320, var18, var12, (byte) -27);
                                    class576.field7318[var17] = true;
                                    class576.field7320.method915(arg4, arg7, arg10, arg8);
                                    if (class602.field7657) {
                                        if (arg9) {
                                            class548.method2967(var13, var16, var14, (byte) -121, var15);
                                        } else {
                                            class395.method2289(var14, var15, var16, arg3 + 68, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class358.field4370 == var12.field5110) {
                                class105.method619(arg3 - 120, var18, class576.field7320, var12, var19);
                                continue;
                            }
                            if (class29.field263 == var12.field5110) {
                                class212.method1412(7, var12, var18, var19, var12.field5132 % 64, class576.field7320);
                                continue;
                            }
                            if (class103.field1386 == var12.field5110) {
                                if (var12.method2251(true, class576.field7320) != null) {
                                    class785.method4305(var18, var19, var12, (byte) -75);
                                    class576.field7318[var17] = true;
                                    class576.field7320.method915(arg4, arg7, arg10, arg8);
                                    if (class602.field7657) {
                                        if (arg9) {
                                            class548.method2967(var13, var16, var14, (byte) -121, var15);
                                        } else {
                                            class395.method2289(var14, var15, var16, 74, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class232.field3121 == var12.field5110) {
                                class470.method2656(arg3 ^ 0x15, var18, var12.field5117, class345.field4229, class576.field7320, var19, var12.field5031);
                                class454.field5919[var17] = true;
                                class576.field7320.method915(arg4, arg7, arg10, arg8);
                                continue;
                            }
                            if (class621.field7859 == var12.field5110) {
                                class282.method1726(var12.field5117, var18, true, var19, class576.field7320, var12.field5031);
                                class454.field5919[var17] = true;
                                class576.field7320.method915(arg4, arg7, arg10, arg8);
                                continue;
                            }
                            if (class699.field9262 == var12.field5110) {
                                if (!class520.field6621 && !class625.field7958) {
                                    continue;
                                }
                                int var33 = var12.field5117 + var18;
                                int var34 = var19 + 15;
                                if (class602.field7657) {
                                    if (arg9) {
                                        class548.method2967(var13, var16, var14, (byte) -111, var15);
                                    } else {
                                        class395.method2289(var14, var15, var16, arg3 ^ 0x48, var13);
                                    }
                                }
                                if (class520.field6621) {
                                    int var35 = -256;
                                    if (class92.field1254 < 20) {
                                        var35 = -65536;
                                    }
                                    class225.field3058.method2422(-1, var34, var33, "Fps:" + class92.field1254, var35, (byte) 125);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class160.field2079) {
                                            class217.method1425(false);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class648.method3504(arg3 ^ 0xFFFFFFAF, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class225.field3058.method2422(-1, var34, var33, "Mem:" + var37 + "k", var38, (byte) 113);
                                    var34 += 15;
                                    class225.field3058.method2422(-1, var34, var33, "In:" + class129.field1730 + "B/s Out:" + class486.field6271 + "B/s", -256, (byte) 51);
                                    var34 += 15;
                                    int var40 = class576.field7320.method981() / 1024;
                                    class225.field3058.method2422(-1, var34, var33, "Offheap:" + var40 + "k", var40 > 65536 ? -65536 : -256, (byte) 125);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class253.field3439[var44] != null) {
                                            var41 += class253.field3439[var44].method3200((byte) 67);
                                            var42 += class253.field3439[var44].method3201(arg3 - 22671);
                                            var43 += class253.field3439[var44].method3193(0);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class788.method4317(2, 0, true, (long) var46, (byte) 75) + "% (" + var45 + "%)";
                                    class399.field5278.method2422(-1, var34, var33, var47, -256, (byte) 70);
                                    var34 += 12;
                                }
                                if (class70.field959 > 0) {
                                    class399.field5278.method2422(-1, var34, var33, "Particles: " + class204.field2821 + " / " + class70.field959, -256, (byte) 101);
                                }
                                var34 += 12;
                                if (class625.field7958) {
                                    class399.field5278.method2422(-1, var34, var33, "Polys: " + class576.field7320.method950() + " Models: " + class576.field7320.method949(), -256, (byte) 35);
                                    var34 += 12;
                                    class399.field5278.method2422(-1, var34, var33, "Ls: " + class415.field5486 + " La: " + class560.field7109 + " NPC: " + class636.field8085 + " Pl: " + class617.field7826, -256, (byte) 78);
                                    var34 += 12;
                                    class498.method2767(10178);
                                }
                                class454.field5919[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field5007 == 0) {
                            if (class197.field2744 == var12.field5110 && class576.field7320.method899()) {
                                class576.field7320.method983(var18, var19, var12.field5117, var12.field5031);
                            }
                            method3060(var19 - var12.field4984, var17, var18 - var12.field4994, 1, var27, var12.field5151, arg6, var29, var28, arg9, var30);
                            if (var12.field5145 != null) {
                                method3060(var19 - var12.field4984, var17, var18 - var12.field4994, 1, var27, var12.field5151, var12.field5145, var29, var28, arg9, var30);
                            }
                            class278 var48 = (class278) class149.field1895.method2616((long) var12.field5151, (byte) -112);
                            if (var48 != null) {
                                class65.method381(var28, var48.field3617, var18, var19, var17, var30, (byte) 110, var27, var29);
                            }
                            if (class197.field2744 == var12.field5110 && class576.field7320.method899()) {
                                class576.field7320.method999();
                            }
                            class576.field7320.method915(arg4, arg7, arg10, arg8);
                        }
                        if (class40.field461[var17] || class97.field1311 > 1) {
                            if (var12.field5007 == 3) {
                                if (var22 == 0) {
                                    if (var12.field5159) {
                                        class576.field7320.method921(var18, var19, var12.field5117, var12.field5031, var12.field5132, 0);
                                    } else {
                                        class576.field7320.method911(var18, var19, var12.field5117, var12.field5031, var12.field5132, 0);
                                    }
                                } else if (var12.field5159) {
                                    class576.field7320.method921(var18, var19, var12.field5117, var12.field5031, 255 - (var22 & 0xFF) << 24 | var12.field5132 & 0xFFFFFF, 1);
                                } else {
                                    class576.field7320.method911(var18, var19, var12.field5117, var12.field5031, 255 - (var22 & 0xFF) << 24 | var12.field5132 & 0xFFFFFF, 1);
                                }
                                if (class602.field7657) {
                                    if (arg9) {
                                        class548.method2967(var13, var16, var14, (byte) -78, var15);
                                    } else {
                                        class395.method2289(var14, var15, var16, 76, var13);
                                    }
                                }
                            } else if (var12.field5007 == 4) {
                                class420 var49 = var12.method2266(class576.field7320, (byte) 121);
                                if (var49 != null) {
                                    int var50 = var12.field5132;
                                    String var51 = var12.field5141;
                                    if (var12.field5128 != -1) {
                                        class48 var52 = class640.field8189.method705(var12.field5128, -11467);
                                        var51 = var52.field624;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field632 == 1 || var12.field4997 != 1) && var12.field4997 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class365.method2099(arg3 ^ 0x7E, var12.field4997);
                                        }
                                    }
                                    if (var12.field5051 != -1) {
                                        var51 = class249.method1623(arg3 - 4098, var12.field5051);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class165.field2182 == var12) {
                                        var51 = class659.field8575.method3589(class496.field6338, -22395);
                                        var50 = var12.field5132;
                                    }
                                    if (class502.field6439) {
                                        class576.field7320.method928(var18, var19, var18 + var12.field5117, var12.field5031 + var19);
                                    }
                                    var49.method2432(var51, 0, class662.field8639, var12.field5080, var12.field5018, var12.field5097, (byte) -95, var12.field5096, null, 0, 255 - (var22 & 0xFF) << 24 | var50, var12.field5117, var18, var12.field5106 ? 255 - (var22 & 0xFF) << 24 : -1, null, var12.field5031, var19);
                                    if (class502.field6439) {
                                        class576.field7320.method915(arg4, arg7, arg10, arg8);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class502.field6439) {
                                            class166 var53 = class628.method3362(var12.field5049, -33, class576.field7320);
                                            int var54 = var53.method1059((byte) -119, var51, class662.field8639, var12.field5117);
                                            int var55 = var53.method1053(var51, class662.field8639, var12.field5117, var12.field5096, arg3 + 22035);
                                            if (class602.field7657) {
                                                if (arg9) {
                                                    class548.method2967(var18, var19 + var55, var19, (byte) -99, var18 + var54);
                                                } else {
                                                    class395.method2289(var19, var18 + var54, var19 + var55, 98, var18);
                                                }
                                            }
                                        } else if (class602.field7657) {
                                            if (arg9) {
                                                class548.method2967(var13, var16, var14, (byte) -112, var15);
                                            } else {
                                                class395.method2289(var14, var15, var16, 57, var13);
                                            }
                                        }
                                    }
                                } else if (class303.field3821) {
                                    class776.method4255(var12, -1007);
                                }
                            } else if (var12.field5007 == 5) {
                                if (var12.field5012 >= 0) {
                                    var12.method2262(class55.field708, false, class526.field6688).method354((byte) -122, 0, class576.field7320, var12.field5093 << 3, var19, var18, var12.field5031, var12.field5117, 0, var12.field5104 << 3);
                                } else {
                                    class772 var57;
                                    if (var12.field5128 != -1) {
                                        class756 var56 = var12.field5103 ? class422.field5564.field352 : null;
                                        var57 = class640.field8189.method704(arg3 - 2, var12.field5042 | 0xFF000000, var12.field5128, var12.field5123, class576.field7320, var12.field4997, var12.field5043, var56);
                                    } else if (var12.field5051 == -1) {
                                        var57 = var12.method2268(class576.field7320, 1);
                                    } else {
                                        var57 = class144.method829(class576.field7320, 18294, var12.field5051);
                                    }
                                    if (var57 != null) {
                                        int var58 = var57.method623();
                                        int var59 = var57.method628();
                                        int var60 = (var12.field5132 == 0 ? 16777215 : var12.field5132 & 0xFFFFFF) | 255 - (var22 & 0xFF) << 24;
                                        if (var12.field5074) {
                                            class576.field7320.method928(var18, var19, var12.field5117 + var18, var12.field5031 + var19);
                                            if (var12.field5082 != 0) {
                                                int var61 = (var58 + var12.field5117 - 1) / var58;
                                                int var62 = (var12.field5031 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field5132 == 0) {
                                                            var57.method4197((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field5082);
                                                        } else {
                                                            var57.method4200((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field5082, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field5132 == 0 && var22 == 0) {
                                                var57.method4198(var18, var19, var12.field5117, var12.field5031);
                                            } else {
                                                var57.method625(var18, var19, var12.field5117, var12.field5031, 0, var60, 1);
                                            }
                                            class576.field7320.method915(arg4, arg7, arg10, arg8);
                                        } else if (var12.field5132 == 0 && var22 == 0) {
                                            if (var12.field5082 != 0) {
                                                var57.method4197((float) var12.field5117 / 2.0F + (float) var18, (float) var12.field5031 / 2.0F + (float) var19, var12.field5117 * 4096 / var58, var12.field5082);
                                            } else if (var12.field5117 == var58 && var12.field5031 == var59) {
                                                var57.method4203(var18, var19);
                                            } else {
                                                var57.method4206(var18, var19, var12.field5117, var12.field5031);
                                            }
                                        } else if (var12.field5082 != 0) {
                                            var57.method4200((float) var12.field5117 / 2.0F + (float) var18, (float) var12.field5031 / 2.0F + (float) var19, var12.field5117 * 4096 / var58, var12.field5082, 0, var60, 1);
                                        } else if (var12.field5117 == var58 && var12.field5031 == var59) {
                                            var57.method616(var18, var19, 0, var60, 1);
                                        } else {
                                            var57.method4199(var18, var19, var12.field5117, var12.field5031, 0, var60, 1);
                                        }
                                    } else if (class303.field3821) {
                                        class776.method4255(var12, arg3 ^ 0xFFFFFC10);
                                    }
                                }
                                if (class602.field7657) {
                                    if (arg9) {
                                        class548.method2967(var13, var16, var14, (byte) -89, var15);
                                    } else {
                                        class395.method2289(var14, var15, var16, 66, var13);
                                    }
                                }
                            } else if (var12.field5007 == 6) {
                                class202.method1378(false);
                                Object var65 = null;
                                class299 var66 = null;
                                int var67 = 0;
                                if (var12.field5128 != -1) {
                                    class48 var75 = class640.field8189.method705(var12.field5128, arg3 - 11468);
                                    if (var75 != null) {
                                        class48 var76 = var75.method303(var12.field4997, -93);
                                        class11 var77 = var12.field5024 == -1 ? null : class143.field1864.method4265(true, var12.field5024);
                                        class756 var78 = var12.field5103 ? class422.field5564.field352 : null;
                                        var66 = var76.method308(class576.field7320, var12.field5029, 1, var12.field5113, var12.field5142, arg3 ^ 0xFE, 2048, var78, var77);
                                        if (var66 == null) {
                                            class776.method4255(var12, -1007);
                                        } else {
                                            var67 = -var66.method1260() >> 1;
                                        }
                                    }
                                } else if (var12.field5135 == 5) {
                                    int var72 = var12.field5069;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class33 var73 = class263.field3508[var72];
                                        class11 var74 = var12.field5024 == -1 ? null : class143.field1864.method4265(true, var12.field5024);
                                        if (var73 != null && (class330.field4043 == var72 || class299.method1782(var73.field375, arg3 + 4117) == var12.field5027)) {
                                            var66 = var73.field352.method4109(null, var12.field5142, null, var74, class595.field7561, var12.field5113, class576.field7320, class381.field4705, (byte) -63, class115.field1518, 2048, -1, null, class640.field8189, 0, true, class66.field869, var12.field5029, 0, 0, class143.field1864);
                                        }
                                    }
                                } else if (var12.field5135 == 8 || var12.field5135 == 9) {
                                    class148 var69 = class398.method2306(var12.field5069, false, (byte) 41);
                                    class11 var70 = var12.field5024 == -1 ? null : class143.field1864.method4265(true, var12.field5024);
                                    if (var69 != null) {
                                        class756 var71 = var12.field5103 ? class422.field5564.field352 : null;
                                        var66 = var69.method847(var12.field5027, var70, 2048, -63, var12.field5113, var12.field5029, var12.field5135 == 9, var12.field5142, var71, class576.field7320);
                                    }
                                } else if (var12.field5024 == -1) {
                                    var66 = var12.method2255(class66.field869, class640.field8189, class595.field7561, -1, null, class143.field1864, -1, class381.field4705, class115.field1518, class576.field7320, class422.field5564.field352, 0, 102, (class425) var65, 2048);
                                    if (var66 == null && class303.field3821) {
                                        class776.method4255(var12, arg3 ^ 0xFFFFFC10);
                                    }
                                } else {
                                    class11 var68 = class143.field1864.method4265(true, var12.field5024);
                                    var66 = var12.method2255(class66.field869, class640.field8189, class595.field7561, var12.field5113, var68, class143.field1864, var12.field5029, class381.field4705, class115.field1518, class576.field7320, class422.field5564.field352, var12.field5142, 92, (class425) var65, 2048);
                                    if (var66 == null && class303.field3821) {
                                        class776.method4255(var12, -1007);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field5090 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field5117 << 9) / var12.field5090;
                                    }
                                    int var80;
                                    if (var12.field5019 <= 0) {
                                        var80 = 512;
                                    } else {
                                        var80 = (var12.field5031 << 9) / var12.field5019;
                                    }
                                    int var81 = var12.field5117 / 2 + var18;
                                    int var82 = var19 + (var12.field5031 / 2);
                                    if (!var12.field5025) {
                                        var81 += var12.field5028 * var79 >> 9;
                                        var82 += var12.field5108 * var80 >> 9;
                                    }
                                    class129.field1724.method462();
                                    class576.field7320.method991(class129.field1724);
                                    class576.field7320.method967(var81, var82, var79, var80);
                                    class576.field7320.method937();
                                    if (var12.field5120) {
                                        class576.field7320.method883(false);
                                    }
                                    if (var12.field5025) {
                                        class5.field57.method463(var12.field5149);
                                        class5.field57.method448(var12.field5068);
                                        class5.field57.method456(var12.field5088);
                                        class5.field57.method450(var12.field5028, var12.field5108, var12.field4996);
                                    } else {
                                        int var83 = (var12.field5150 << 2) * class541.field6805[var12.field5149 << 3] >> 14;
                                        int var84 = (var12.field5150 << 2) * class541.field6806[var12.field5149 << 3] >> 14;
                                        class5.field57.method466(-var12.field5088 << 3);
                                        class5.field57.method448(var12.field5068 << 3);
                                        class5.field57.method450(var12.field4992 << 2, (var12.field5154 << 2) + var83 + var67, (var12.field5154 << 2) + var84);
                                        class5.field57.method467(var12.field5149 << 3);
                                    }
                                    var12.method2270(var66, class693.field8900, 115, class5.field57, class576.field7320);
                                    if (class502.field6439) {
                                        class576.field7320.method928(var18, var19, var18 + var12.field5117, var12.field5031 + var19);
                                    }
                                    if (var12.field5025) {
                                        if (var12.field5138) {
                                            var66.method1292(class5.field57, null, var12.field5150, 1);
                                        } else {
                                            var66.method1297(class5.field57, null, 1);
                                            if (var12.field5126 != null) {
                                                class576.field7320.method912(var12.field5126.method2838());
                                            }
                                        }
                                    } else if (var12.field5138) {
                                        var66.method1292(class5.field57, null, var12.field5150 << 2, 1);
                                    } else {
                                        var66.method1297(class5.field57, null, 1);
                                        if (var12.field5126 != null) {
                                            class576.field7320.method912(var12.field5126.method2838());
                                        }
                                    }
                                    if (class502.field6439) {
                                        class576.field7320.method915(arg4, arg7, arg10, arg8);
                                    }
                                    if (var12.field5120) {
                                        class576.field7320.method883(true);
                                    }
                                }
                                if (class602.field7657) {
                                    if (arg9) {
                                        class548.method2967(var13, var16, var14, (byte) -83, var15);
                                    } else {
                                        class395.method2289(var14, var15, var16, 93, var13);
                                    }
                                }
                            } else if (var12.field5007 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field5139) {
                                    var86 = var12.field5117 + var18;
                                    var85 = var18;
                                    var88 = var12.field5031 + var19;
                                    var87 = var19;
                                } else {
                                    var85 = var18;
                                    var86 = var12.field5117 + var18;
                                    var87 = var12.field5031 + var19;
                                    var88 = var19;
                                }
                                if (var12.field5087 == 1) {
                                    class576.field7320.method973(var85, var88, var86, var87, var12.field5132, 0);
                                } else {
                                    class576.field7320.method935(var85, var88, var86, var87, var12.field5132, var12.field5087, 0);
                                }
                                if (class602.field7657) {
                                    if (arg9) {
                                        class548.method2967(var13, var16, var14, (byte) -94, var15);
                                    } else {
                                        class395.method2289(var14, var15, var16, arg3 + 51, var13);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public static void method3061(int arg0) {
        int var1 = -85 / ((arg0 + 25) / 46);
        field7182 = null;
        field7181 = null;
    }
}
