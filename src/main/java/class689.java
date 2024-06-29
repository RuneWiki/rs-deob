import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class689 extends class147 {

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    private int field9729 = -1;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "Z")
    public static boolean field9728 = false;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIZI[Luf;IIIIB)V")
    public static final void method3883(int arg0, int arg1, int arg2, boolean arg3, int arg4, class519[] arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field9726++;
        class686.field9702.method488(arg9, arg8, arg0, arg2);
        if (arg10 != 69) {
            return;
        }
        for (int var11 = 0; var11 < arg5.length; var11++) {
            class519 var12 = arg5[var11];
            if (var12 != null && (var12.field7223 == arg7 || arg7 == -1412584499 && class766.field10586 == var12)) {
                int var13 = var12.field7191 + arg4;
                int var14 = var12.field7151 + arg1;
                int var15 = var13 + var12.field7128 + 1;
                int var16 = var12.field7255 + var14 + 1;
                int var17;
                if (arg6 == -1) {
                    class342.field4863[class538.field7479].setBounds(var12.field7191 + arg4, var12.field7151 - -arg1, var12.field7128, var12.field7255);
                    var17 = class538.field7479++;
                } else {
                    var17 = arg6;
                }
                var12.field7127 = class594.field8494;
                var12.field7175 = var17;
                if (!client.method901(var12)) {
                    if (var12.field7232 != 0) {
                        class135.method1123(var12, -11);
                    }
                    int var18 = var12.field7191 + arg4;
                    int var19 = var12.field7151 + arg1;
                    int var20 = 0;
                    int var21 = 0;
                    if (class593.field8489) {
                        var20 = class45.method342(false);
                        var21 = class87.method771(-2);
                    }
                    int var22 = var12.field7228;
                    if (class346.field4929 && (client.method885(var12).field2564 != 0 || var12.field7190 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class766.field10586 == var12) {
                        if (arg7 != -1412584499 && (class282.field4147 == var12.field7248 || class185.field2807 == var12.field7248)) {
                            class262.field3708 = arg4;
                            class212.field3100 = arg5;
                            class188.field2840 = arg1;
                            continue;
                        }
                        if (class752.field10459 && class466.field6363) {
                            int var23 = class754.field10496.method3065(-28062) + var20;
                            int var24 = var21 + class754.field10496.method3066(arg10 + 3);
                            int var25 = var23 - class286.field4209;
                            int var26 = var24 - class591.field8482;
                            if (class47.field639 > var25) {
                                var25 = class47.field639;
                            }
                            if (var12.field7128 + var25 > class47.field639 - -class6.field86.field7128) {
                                var25 = class47.field639 + class6.field86.field7128 - var12.field7128;
                            }
                            if (class445.field6150 > var26) {
                                var26 = class445.field6150;
                            }
                            if ((class445.field6150 + class6.field86.field7255) < (var12.field7255 + var26)) {
                                var26 = class445.field6150 - (var12.field7255 - class6.field86.field7255);
                            }
                            var18 = var25;
                            var19 = var26;
                        }
                        if (class185.field2807 == var12.field7248) {
                            var22 = 128;
                        }
                    }
                    int var27;
                    int var28;
                    int var29;
                    int var30;
                    if (var12.field7190 == 2) {
                        var27 = arg2;
                        var28 = arg9;
                        var29 = arg0;
                        var30 = arg8;
                    } else {
                        int var31 = var12.field7128 + var18;
                        int var32 = var12.field7255 + var19;
                        if (var12.field7190 == 9) {
                            var32++;
                            var31++;
                        }
                        var30 = var19 > arg8 ? var19 : arg8;
                        var28 = arg9 < var18 ? var18 : arg9;
                        var27 = arg2 <= var32 ? arg2 : var32;
                        var29 = var31 < arg0 ? var31 : arg0;
                    }
                    if (var28 < var29 && var27 > var30) {
                        if (var12.field7232 != 0) {
                            if (class744.field10340 == var12.field7232 || class575.field8294 == var12.field7232) {
                                class246.method1633(false, var18, var12, var19);
                                if (!class593.field8489) {
                                    class665.method3730(var19, var18, var12.field7255, (byte) 122, class575.field8294 == var12.field7232, var12.field7128);
                                    class686.field9702.method488(arg9, arg8, arg0, arg2);
                                }
                                class438.field6082[var17] = true;
                                continue;
                            }
                            if (class688.field9723 == var12.field7232) {
                                if (var12.method3047(81, class686.field9702) != null) {
                                    class193.method1378(arg10 - 76);
                                    class84.method748(var12, class686.field9702, var18, 75, var19);
                                    class780.field10685[var17] = true;
                                    class686.field9702.method488(arg9, arg8, arg0, arg2);
                                    if (class593.field8489) {
                                        if (arg3) {
                                            class528.method3090(3985, var16, var14, var13, var15);
                                        } else {
                                            class573.method3338(var15, (byte) -94, var14, var16, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class78.field1172 == var12.field7232) {
                                class728.method4041((byte) 126, class686.field9702, var12, var18, var19);
                                continue;
                            }
                            if (class677.field9512 == var12.field7232) {
                                class623.method3567(var12.field7157 % 64, var19, var12, class686.field9702, 117, var18);
                                continue;
                            }
                            if (class538.field7478 == var12.field7232) {
                                if (var12.method3047(125, class686.field9702) != null) {
                                    class112.method930(var18, -65, var19, var12);
                                    class780.field10685[var17] = true;
                                    class686.field9702.method488(arg9, arg8, arg0, arg2);
                                    if (class593.field8489) {
                                        if (arg3) {
                                            class528.method3090(3985, var16, var14, var13, var15);
                                        } else {
                                            class573.method3338(var15, (byte) -94, var14, var16, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class422.field5874 == var12.field7232) {
                                class632.method3609(var18, var19, 25700, class686.field9702, var12.field7255, var12.field7128, class425.field5903);
                                class438.field6082[var17] = true;
                                class686.field9702.method488(arg9, arg8, arg0, arg2);
                                continue;
                            }
                            if (class153.field2444 == var12.field7232) {
                                class313.method1908(var12.field7255, class686.field9702, -1, var19, var18, var12.field7128);
                                class438.field6082[var17] = true;
                                class686.field9702.method488(arg9, arg8, arg0, arg2);
                                continue;
                            }
                            if (class579.field8346 == var12.field7232) {
                                if (!class530.field7378 && !class359.field5086) {
                                    continue;
                                }
                                int var33 = var12.field7128 + var18;
                                if (class593.field8489) {
                                    if (arg3) {
                                        class528.method3090(3985, var16, var14, var13, var15);
                                    } else {
                                        class573.method3338(var15, (byte) -94, var14, var16, var13);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class530.field7378) {
                                    int var35 = -256;
                                    if (class458.field6265 < 20) {
                                        var35 = -65536;
                                    }
                                    class420.field5827.method2621(var35, "Fps:" + class458.field6265, -50, -1, var33, var34);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class615.field8729) {
                                            class368.method2198(2);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class446.method2645("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 0, 4);
                                            }
                                        }
                                    }
                                    class420.field5827.method2621(var38, "Mem:" + var37 + "k", -50, -1, var33, var34);
                                    var34 += 15;
                                    class420.field5827.method2621(-256, "In:" + class201.field2989 + "B/s Out:" + class477.field6516 + "B/s", arg10 - 125, -1, var33, var34);
                                    var34 += 15;
                                    int var40 = class686.field9702.method474() / 1024;
                                    class420.field5827.method2621(var40 <= 65536 ? -256 : -65536, "Offheap:" + var40 + "k", -121, -1, var33, var34);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class429.field5942[var44] != null) {
                                            var41 += class429.field5942[var44].method3793((byte) -118);
                                            var42 += class429.field5942[var44].method3795(-33);
                                            var43 += class429.field5942[var44].method3794((byte) -40);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class535.method3109((long) var46, 0, 2, (byte) -17, true) + "% (" + var45 + "%)";
                                    class71.field1124.method2621(-256, var47, arg10 ^ 0xFFFFFF9A, -1, var33, var34);
                                    var34 += 12;
                                }
                                if (class719.field10047 > 0) {
                                    class71.field1124.method2621(-256, "Particles: " + class650.field9198 + " / " + class719.field10047, arg10 ^ 0xFFFFFF87, -1, var33, var34);
                                }
                                var34 += 12;
                                if (class359.field5086) {
                                    class71.field1124.method2621(-256, "Polys: " + class686.field9702.method60() + " Models: " + class686.field9702.method473(), -66, -1, var33, var34);
                                    var34 += 12;
                                    class71.field1124.method2621(-256, "Ls: " + class711.field9936 + " La: " + class464.field6304 + " NPC: " + class169.field2558 + " Pl: " + class131.field2218, -45, -1, var33, var34);
                                    var34 += 12;
                                    class647.method3661((byte) 50);
                                }
                                class438.field6082[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field7190 == 0) {
                            if (class672.field9411 == var12.field7232 && class686.field9702.method99()) {
                                class686.field9702.method127(var18, var19, var12.field7128, var12.field7255);
                            }
                            method3883(var29, var19 - var12.field7244, var27, arg3, var18 - var12.field7145, arg5, var17, var12.field7247, var30, var28, (byte) 69);
                            if (var12.field7170 != null) {
                                method3883(var29, var19 - var12.field7244, var27, arg3, var18 - var12.field7145, var12.field7170, var17, var12.field7247, var30, var28, (byte) 69);
                            }
                            class27 var48 = (class27) class37.field437.method4253((long) var12.field7247, -1);
                            if (var48 != null) {
                                class41.method301(var28, var18, var17, var29, var27, 8070, var19, var30, var48.field284);
                            }
                            if (class672.field9411 == var12.field7232 && class686.field9702.method99()) {
                                class686.field9702.method119();
                            }
                            class686.field9702.method488(arg9, arg8, arg0, arg2);
                        }
                        if (class713.field9957[var17] || class707.field9903 > 1) {
                            if (var12.field7190 == 3) {
                                if (var22 == 0) {
                                    if (var12.field7230) {
                                        class686.field9702.method436(var18, var19, var12.field7128, var12.field7255, var12.field7157, 0);
                                    } else {
                                        class686.field9702.method447(var18, var19, var12.field7128, var12.field7255, var12.field7157, 0);
                                    }
                                } else if (var12.field7230) {
                                    class686.field9702.method436(var18, var19, var12.field7128, var12.field7255, var12.field7157 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                } else {
                                    class686.field9702.method447(var18, var19, var12.field7128, var12.field7255, 255 - (var22 & 0xFF) << 24 | var12.field7157 & 0xFFFFFF, 1);
                                }
                                if (class593.field8489) {
                                    if (arg3) {
                                        class528.method3090(3985, var16, var14, var13, var15);
                                    } else {
                                        class573.method3338(var15, (byte) -94, var14, var16, var13);
                                    }
                                }
                            } else if (var12.field7190 == 4) {
                                class443 var49 = var12.method3036(2, class686.field9702);
                                if (var49 != null) {
                                    int var50 = var12.field7157;
                                    String var51 = var12.field7181;
                                    if (var12.field7129 != -1) {
                                        class42 var52 = class422.field5873.method2937((byte) -24, var12.field7129);
                                        var51 = var52.field554;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field572 == 1 || var12.field7132 != 1) && var12.field7132 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class687.method3876((byte) -83, var12.field7132);
                                        }
                                    }
                                    if (var12.field7208 != -1) {
                                        var51 = class500.method2922(32767, var12.field7208);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class284.field4182 == var12) {
                                        var51 = class563.field7829.method3281(class423.field5892, -1);
                                        var50 = var12.field7157;
                                    }
                                    if (class422.field5870) {
                                        class686.field9702.method518(var18, var19, var12.field7128 + var18, var19 - -var12.field7255);
                                    }
                                    var49.method2624(var12.field7285, var12.field7165, var51, var12.field7213, 0, var12.field7255, var18, (byte) -120, var12.field7128, null, null, var19, 0, class581.field8365, var12.field7164, 255 - (var22 & 0xFF) << 24 | var50, var12.field7297 ? 255 - (var22 & 0xFF) << 24 : -1);
                                    if (class422.field5870) {
                                        class686.field9702.method488(arg9, arg8, arg0, arg2);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class422.field5870) {
                                            class470 var53 = class430.method2511(true, class686.field9702, var12.field7131);
                                            int var54 = var53.method2744(var12.field7128, var51, class581.field8365, -78);
                                            int var55 = var53.method2745(var12.field7128, var51, -1, class581.field8365, var12.field7165);
                                            if (class593.field8489) {
                                                if (arg3) {
                                                    class528.method3090(3985, var19 + var55, var19, var18, var18 + var54);
                                                } else {
                                                    class573.method3338(var18 + var54, (byte) -94, var19, var19 + var55, var18);
                                                }
                                            }
                                        } else if (class593.field8489) {
                                            if (arg3) {
                                                class528.method3090(3985, var16, var14, var13, var15);
                                            } else {
                                                class573.method3338(var15, (byte) -94, var14, var16, var13);
                                            }
                                        }
                                    }
                                } else if (class613.field8705) {
                                    class172.method1268(var12, -103);
                                }
                            } else if (var12.field7190 == 5) {
                                if (var12.field7241 >= 0) {
                                    var12.method3048(class606.field8616, class648.field9192, true).method2318(var12.field7255, var19, class686.field9702, var12.field7221 << 3, var12.field7292 << 3, var12.field7128, var18, 0, (byte) -24, 0);
                                } else {
                                    class85 var56;
                                    if (var12.field7129 != -1) {
                                        class285 var57 = var12.field7279 ? class719.field10041.field207 : null;
                                        var56 = class422.field5873.method2942(var12.field7194, var12.field7137, class686.field9702, -126, var12.field7290 | -16777216, var12.field7132, var57, var12.field7129);
                                    } else if (var12.field7208 == -1) {
                                        var56 = var12.method3050(class686.field9702, arg10 ^ 0x1B);
                                    } else {
                                        var56 = class249.method1654(3, var12.field7208, class686.field9702);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method11();
                                        int var59 = var56.method14();
                                        int var60 = (var12.field7157 == 0 ? 16777215 : var12.field7157 & 0xFFFFFF) | 255 - (var22 & 0xFF) << 24;
                                        if (var12.field7205) {
                                            class686.field9702.method518(var18, var19, var12.field7128 + var18, var12.field7255 + var19);
                                            if (var12.field7254 != 0) {
                                                int var61 = (var58 + var12.field7128 - 1) / var58;
                                                int var62 = (var12.field7255 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field7157 == 0) {
                                                            var56.method751((float) var58 / 2.0F + (float) (var18 + (var58 * var63)), (float) var59 / 2.0F + (float) (var19 - -(var59 * var64)), 4096, var12.field7254);
                                                        } else {
                                                            var56.method760((float) var58 / 2.0F + (float) (var18 + (var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field7254, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field7157 == 0 && var22 == 0) {
                                                var56.method757(var18, var19, var12.field7128, var12.field7255);
                                            } else {
                                                var56.method8(var18, var19, var12.field7128, var12.field7255, 0, var60, 1);
                                            }
                                            class686.field9702.method488(arg9, arg8, arg0, arg2);
                                        } else if (var12.field7157 == 0 && var22 == 0) {
                                            if (var12.field7254 != 0) {
                                                var56.method751((float) var12.field7128 / 2.0F + (float) var18, (float) var12.field7255 / 2.0F + (float) var19, var12.field7128 * 4096 / var58, var12.field7254);
                                            } else if (var12.field7128 == var58 && var12.field7255 == var59) {
                                                var56.method759(var18, var19);
                                            } else {
                                                var56.method755(var18, var19, var12.field7128, var12.field7255);
                                            }
                                        } else if (var12.field7254 != 0) {
                                            var56.method760((float) var12.field7128 / 2.0F + (float) var18, (float) var12.field7255 / 2.0F + (float) var19, var12.field7128 * 4096 / var58, var12.field7254, 0, var60, 1);
                                        } else if (var12.field7128 == var58 && var12.field7255 == var59) {
                                            var56.method6(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method758(var18, var19, var12.field7128, var12.field7255, 0, var60, 1);
                                        }
                                    } else if (class613.field8705) {
                                        class172.method1268(var12, -27);
                                    }
                                }
                                if (class593.field8489) {
                                    if (arg3) {
                                        class528.method3090(arg10 + 3916, var16, var14, var13, var15);
                                    } else {
                                        class573.method3338(var15, (byte) -94, var14, var16, var13);
                                    }
                                }
                            } else if (var12.field7190 == 6) {
                                class98.method804((byte) 24);
                                Object var65 = null;
                                class233 var66 = null;
                                int var67 = 0;
                                if (var12.field7129 != -1) {
                                    class42 var68 = class422.field5873.method2937((byte) -10, var12.field7129);
                                    if (var68 != null) {
                                        class42 var69 = var68.method313((byte) -113, var12.field7132);
                                        class98 var70 = var12.field7219 == -1 ? null : class168.field2552.method3287(100, var12.field7219);
                                        class285 var71 = var12.field7279 ? class719.field10041.field207 : null;
                                        var66 = var69.method317(var70, var12.field7258, 1, (byte) -126, var12.field7152, 2048, var71, var12.field7275, class686.field9702);
                                        if (var66 == null) {
                                            class172.method1268(var12, -21);
                                        } else {
                                            var67 = -var66.method534() >> 1;
                                        }
                                    }
                                } else if (var12.field7146 == 5) {
                                    int var72 = var12.field7211;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class21 var73 = class588.field8451[var72];
                                        class98 var74 = var12.field7219 == -1 ? null : class168.field2552.method3287(72, var12.field7219);
                                        if (var73 != null && (class541.field7492 == var72 || class743.method4104(var73.field212, arg10 - 115) == var12.field7226)) {
                                            var66 = var73.field207.method1815(2048, class578.field8328, var12.field7275, var74, null, var12.field7152, class38.field451, class168.field2552, 0, 0, class677.field9511, null, true, var12.field7258, 2282, class686.field9702, -1, class422.field5873, 0, class150.field2404, null);
                                        }
                                    }
                                } else if (var12.field7146 == 8 || var12.field7146 == 9) {
                                    class393 var76 = class275.method1745(false, (byte) -55, var12.field7211);
                                    class98 var77 = var12.field7219 == -1 ? null : class168.field2552.method3287(103, var12.field7219);
                                    if (var76 != null) {
                                        class285 var78 = var12.field7279 ? class719.field10041.field207 : null;
                                        var66 = var76.method2354(0, var12.field7226, var12.field7146 == 9, class686.field9702, var12.field7275, var78, var12.field7258, 2048, var12.field7152, var77);
                                    }
                                } else if (var12.field7219 == -1) {
                                    var66 = var12.method3038(-1, 0, class422.field5873, class578.field8328, null, class168.field2552, class677.field9511, -1, class686.field9702, -1, class38.field451, class719.field10041.field207, 2048, class150.field2404, (class499) var65);
                                    if (var66 == null && class613.field8705) {
                                        class172.method1268(var12, arg10 ^ 0xFFFFFF8E);
                                    }
                                } else {
                                    class98 var75 = class168.field2552.method3287(96, var12.field7219);
                                    var66 = var12.method3038(-1, var12.field7258, class422.field5873, class578.field8328, var75, class168.field2552, class677.field9511, var12.field7275, class686.field9702, var12.field7152, class38.field451, class719.field10041.field207, 2048, class150.field2404, (class499) var65);
                                    if (var66 == null && class613.field8705) {
                                        class172.method1268(var12, arg10 - 149);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field7289 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field7128 << 9) / var12.field7289;
                                    }
                                    int var80;
                                    if (var12.field7215 <= 0) {
                                        var80 = 512;
                                    } else {
                                        var80 = (var12.field7255 << 9) / var12.field7215;
                                    }
                                    int var81 = var12.field7128 / 2 + var18;
                                    int var82 = var12.field7255 / 2 + var19;
                                    if (!var12.field7198) {
                                        var81 += var12.field7294 * var79 >> 9;
                                        var82 += var12.field7180 * var80 >> 9;
                                    }
                                    class390.field5441.method1569();
                                    class686.field9702.method498(class390.field5441);
                                    class686.field9702.method449(var81, var82, var79, var80);
                                    class686.field9702.method91();
                                    if (var12.field7296) {
                                        class686.field9702.method513(false);
                                    }
                                    if (var12.field7198) {
                                        class443.field6148.method1562(var12.field7162);
                                        class443.field6148.method1566(var12.field7133);
                                        class443.field6148.method1551(var12.field7266);
                                        class443.field6148.method1558(var12.field7294, var12.field7180, var12.field7268);
                                    } else {
                                        int var83 = (var12.field7235 << 2) * class253.field3634[var12.field7162 << 3] >> 14;
                                        int var84 = (var12.field7235 << 2) * class253.field3633[var12.field7162 << 3] >> 14;
                                        class443.field6148.method1560(-var12.field7266 << 3);
                                        class443.field6148.method1566(var12.field7133 << 3);
                                        class443.field6148.method1558(var12.field7216 << 2, (var12.field7176 << 2) + var83 + var67, (var12.field7176 << 2) + var84);
                                        class443.field6148.method1553(var12.field7162 << 3);
                                    }
                                    var12.method3049(var66, class443.field6148, arg10 ^ 0xFFFFFFCB, class594.field8494, class686.field9702);
                                    if (class422.field5870) {
                                        class686.field9702.method518(var18, var19, var12.field7128 + var18, var12.field7255 + var19);
                                    }
                                    if (var12.field7198) {
                                        if (var12.field7225) {
                                            var66.method546(class443.field6148, null, var12.field7235, 1);
                                        } else {
                                            var66.method575(class443.field6148, null, 1);
                                            if (var12.field7148 != null) {
                                                class686.field9702.method455(var12.field7148.method1350());
                                            }
                                        }
                                    } else if (var12.field7225) {
                                        var66.method546(class443.field6148, null, var12.field7235 << 2, 1);
                                    } else {
                                        var66.method575(class443.field6148, null, 1);
                                        if (var12.field7148 != null) {
                                            class686.field9702.method455(var12.field7148.method1350());
                                        }
                                    }
                                    if (class422.field5870) {
                                        class686.field9702.method488(arg9, arg8, arg0, arg2);
                                    }
                                    if (var12.field7296) {
                                        class686.field9702.method513(true);
                                    }
                                }
                                if (class593.field8489) {
                                    if (arg3) {
                                        class528.method3090(3985, var16, var14, var13, var15);
                                    } else {
                                        class573.method3338(var15, (byte) -94, var14, var16, var13);
                                    }
                                }
                            } else if (var12.field7190 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field7237) {
                                    var87 = var18;
                                    var85 = var19;
                                    var86 = var12.field7255 + var19;
                                    var88 = var12.field7128 + var18;
                                } else {
                                    var85 = var19 + var12.field7255;
                                    var86 = var19;
                                    var87 = var18;
                                    var88 = var12.field7128 + var18;
                                }
                                if (var12.field7158 == 1) {
                                    class686.field9702.method453(var87, var86, var88, var85, var12.field7157, 0);
                                } else {
                                    class686.field9702.method469(var87, var86, var88, var85, var12.field7157, var12.field7158, 0);
                                }
                                if (class593.field8489) {
                                    if (arg3) {
                                        class528.method3090(arg10 + 3916, var16, var14, var13, var15);
                                    } else {
                                        class573.method3338(var15, (byte) -94, var14, var16, var13);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lhi;B)V")
    public final void method1161(class465 arg0, byte arg1) {
        arg0.method2716(68, this.field9729);
        field9727++;
        int var3 = 127 / ((36 - arg1) / 60);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lol;I)V")
    public final void method1162(class431 arg0, int arg1) {
        this.field9729 = arg0.method2565((byte) -108);
        field9725++;
        arg0.method2557(14929);
        if (arg0.method2557(14929) != 255) {
            arg0.field5983--;
            arg0.method2567((byte) -125);
        }
        if (arg1 > -15) {
            this.field9729 = 65;
        }
    }
}
