import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class476 implements class81 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Lle;")
    public class311 field6522;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public int field6529;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public int field6524;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public int field6530;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public int field6521;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public int field6528;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public int field6531;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Lqj;")
    public class512 field6523;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIZ[Lvfa;IIIII)V", line = 4)
    public static final void method2684(int arg0, int arg1, int arg2, int arg3, boolean arg4, class672[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field6525++;
        class341.field4807.method419(arg8, arg2, arg10, arg0);
        if (arg6 < 80) {
            return;
        }
        for (int var11 = 0; var11 < arg5.length; var11++) {
            class672 var12 = arg5[var11];
            if (var12 != null && (var12.field9255 == arg7 || arg7 == -1412584499 && class137.field2182 == var12)) {
                int var13 = var12.field9212 + arg1;
                int var14 = var12.field9325 + arg3;
                int var15 = var13 + var12.field9287 + 1;
                int var16 = var14 + var12.field9178 + 1;
                int var17;
                if (arg9 == -1) {
                    class179.field2712[class601.field7899].setBounds(var12.field9212 + arg1, var12.field9325 - -arg3, var12.field9287, var12.field9178);
                    var17 = class601.field7899++;
                } else {
                    var17 = arg9;
                }
                var12.field9321 = class29.field474;
                var12.field9294 = var17;
                if (!client.method1883(var12)) {
                    if (var12.field9160 != 0) {
                        class78.method623((byte) -99, var12);
                    }
                    int var18 = var12.field9212 + arg1;
                    int var19 = var12.field9325 + arg3;
                    int var20 = 0;
                    int var21 = 0;
                    if (class24.field412) {
                        var20 = class367.method2167(-2);
                        var21 = class672.method3717((byte) -113);
                    }
                    int var22 = var12.field9299;
                    if (class320.field4567 && (client.method1875(var12).field3004 != 0 || var12.field9239 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class137.field2182 == var12) {
                        if (arg7 != -1412584499 && (class59.field710 == var12.field9301 || class735.field10166 == var12.field9301)) {
                            class477.field6555 = arg3;
                            class9.field165 = arg1;
                            class503.field6747 = arg5;
                            continue;
                        }
                        if (class442.field6096 && class463.field6373) {
                            int var23 = class569.field7492.method780((byte) -128) + var20;
                            int var24 = class569.field7492.method772(123) + var21;
                            int var25 = var23 - class228.field3253;
                            int var26 = var24 - class568.field7466;
                            if (var25 < class362.field5100) {
                                var25 = class362.field5100;
                            }
                            if ((var12.field9287 + var25) > (class362.field5100 + class758.field10549.field9287)) {
                                var25 = class362.field5100 + class758.field10549.field9287 - var12.field9287;
                            }
                            if (class352.field4941 > var26) {
                                var26 = class352.field4941;
                            }
                            if (class352.field4941 + class758.field10549.field9178 < var12.field9178 + var26) {
                                var26 = class758.field10549.field9178 + class352.field4941 - var12.field9178;
                            }
                            var18 = var25;
                            var19 = var26;
                        }
                        if (class735.field10166 == var12.field9301) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field9239 == 2) {
                        var31 = arg10;
                        var30 = arg2;
                        var29 = arg8;
                        var32 = arg0;
                    } else {
                        int var27 = var12.field9287 + var18;
                        int var28 = var12.field9178 + var19;
                        var29 = var18 > arg8 ? var18 : arg8;
                        var30 = var19 <= arg2 ? arg2 : var19;
                        if (var12.field9239 == 9) {
                            var28++;
                            var27++;
                        }
                        var31 = arg10 > var27 ? var27 : arg10;
                        var32 = var28 >= arg0 ? arg0 : var28;
                    }
                    if (var31 > var29 && var32 > var30) {
                        if (var12.field9160 != 0) {
                            if (class336.field4764 == var12.field9160 || class736.field10175 == var12.field9160) {
                                class668.method3690(var18, -104, var12, var19);
                                if (!class24.field412) {
                                    class132.method1027(var19, class736.field10175 == var12.field9160, var18, -119, var12.field9178, var12.field9287);
                                    class341.field4807.method419(arg8, arg2, arg10, arg0);
                                }
                                class12.field192[var17] = true;
                                continue;
                            }
                            if (class371.field5165 == var12.field9160) {
                                if (var12.method3715(class341.field4807, 0) != null) {
                                    class651.method3552(-25926);
                                    class465.method2636(var19, (byte) -110, var18, class341.field4807, var12);
                                    class319.field4545[var17] = true;
                                    class341.field4807.method419(arg8, arg2, arg10, arg0);
                                    if (class24.field412) {
                                        if (arg4) {
                                            class62.method539(var15, var13, (byte) -127, var16, var14);
                                        } else {
                                            class251.method1535(var13, var16, var15, var14, (byte) 104);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class561.field7366 == var12.field9160) {
                                if (var12.method3715(class341.field4807, 0) != null) {
                                    class24.method242(2, var18, var12, var19);
                                    class319.field4545[var17] = true;
                                    class341.field4807.method419(arg8, arg2, arg10, arg0);
                                    if (class24.field412) {
                                        if (arg4) {
                                            class62.method539(var15, var13, (byte) -98, var16, var14);
                                        } else {
                                            class251.method1535(var13, var16, var15, var14, (byte) 121);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class501.field6729 == var12.field9160) {
                                class614.method3338(var12.field9287, class252.field3474, var12.field9178, -1, class341.field4807, var18, var19);
                                class12.field192[var17] = true;
                                class341.field4807.method419(arg8, arg2, arg10, arg0);
                                continue;
                            }
                            if (class585.field7652 == var12.field9160) {
                                class393.method2323(var12.field9287, -24604, var18, var19, var12.field9178, class341.field4807);
                                class12.field192[var17] = true;
                                class341.field4807.method419(arg8, arg2, arg10, arg0);
                                continue;
                            }
                            if (class59.field706 == var12.field9160) {
                                if (!class365.field5129 && !class122.field2005) {
                                    continue;
                                }
                                int var33 = var12.field9287 + var18;
                                int var34 = var19 + 15;
                                if (class24.field412) {
                                    if (arg4) {
                                        class62.method539(var15, var13, (byte) -38, var16, var14);
                                    } else {
                                        class251.method1535(var13, var16, var15, var14, (byte) 111);
                                    }
                                }
                                if (class365.field5129) {
                                    int var35 = -256;
                                    if (class662.field8734 < 20) {
                                        var35 = -65536;
                                    }
                                    class148.field2334.method534(var35, var33, -1, (byte) -108, var34, "Fps:" + class662.field8734);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class471.field6445) {
                                            class745.method4178(-32492);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class178.method1234(4, 31663, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class148.field2334.method534(var38, var33, -1, (byte) -108, var34, "Mem:" + var37 + "k");
                                    var34 += 15;
                                    class148.field2334.method534(-256, var33, -1, (byte) -108, var34, "In:" + class517.field6908 + "B/s Out:" + class42.field554 + "B/s");
                                    var34 += 15;
                                    int var40 = class341.field4807.method488() / 1024;
                                    class148.field2334.method534(var40 > 65536 ? -65536 : -256, var33, -1, (byte) -108, var34, "Offheap:" + var40 + "k");
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class62.field766[var44] != null) {
                                            var41 += class62.field766[var44].method580(100);
                                            var42 += class62.field766[var44].method579(55);
                                            var43 += class62.field766[var44].method582(102);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class307.method1897((byte) -122, 2, (long) var46, 0, true) + "% (" + var45 + "%)";
                                    class275.field3832.method534(-256, var33, -1, (byte) -108, var34, var47);
                                    var34 += 12;
                                }
                                if (class376.field5243 > 0) {
                                    class275.field3832.method534(-256, var33, -1, (byte) -108, var34, "Particles: " + class149.field2339 + " / " + class376.field5243);
                                }
                                var34 += 12;
                                if (class122.field2005) {
                                    class275.field3832.method534(-256, var33, -1, (byte) -108, var34, "Polys: " + class341.field4807.method396() + " Models: " + class341.field4807.method448());
                                    var34 += 12;
                                    class275.field3832.method534(-256, var33, -1, (byte) -108, var34, "Ls: " + class264.field3679 + " La: " + class603.field7928 + " NPC: " + class121.field1937 + " Pl: " + class752.field10491);
                                    class427.method2467(-126);
                                    var34 += 12;
                                }
                                class12.field192[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field9239 == 0) {
                            if (class226.field3220 == var12.field9160 && class341.field4807.method459()) {
                                class341.field4807.method482(var18, var19, var12.field9287, var12.field9178);
                            }
                            method2684(var32, var18 - var12.field9216, var30, var19 - var12.field9226, arg4, arg5, 91, var12.field9200, var29, var17, var31);
                            if (var12.field9240 != null) {
                                method2684(var32, var18 - var12.field9216, var30, var19 - var12.field9226, arg4, var12.field9240, 99, var12.field9200, var29, var17, var31);
                            }
                            class8 var48 = (class8) class350.field4925.method2135((long) var12.field9200, (byte) 31);
                            if (var48 != null) {
                                class385.method2282(var18, var48.field161, var30, 50, var19, var31, var29, var17, var32);
                            }
                            if (class226.field3220 == var12.field9160 && class341.field4807.method459()) {
                                class341.field4807.method439();
                            }
                            class341.field4807.method419(arg8, arg2, arg10, arg0);
                        }
                        if (class525.field6963[var17] || class263.field3674 > 1) {
                            if (var12.field9239 == 3) {
                                if (var22 == 0) {
                                    if (var12.field9174) {
                                        class341.field4807.method504(var18, var19, var12.field9287, var12.field9178, var12.field9263, 0);
                                    } else {
                                        class341.field4807.method455(var18, var19, var12.field9287, var12.field9178, var12.field9263, 0);
                                    }
                                } else if (var12.field9174) {
                                    class341.field4807.method504(var18, var19, var12.field9287, var12.field9178, var12.field9263 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                } else {
                                    class341.field4807.method455(var18, var19, var12.field9287, var12.field9178, 255 - (var22 & 0xFF) << 24 | var12.field9263 & 0xFFFFFF, 1);
                                }
                                if (class24.field412) {
                                    if (arg4) {
                                        class62.method539(var15, var13, (byte) -77, var16, var14);
                                    } else {
                                        class251.method1535(var13, var16, var15, var14, (byte) 95);
                                    }
                                }
                            } else if (var12.field9239 == 4) {
                                class60 var49 = var12.method3705(1, class341.field4807);
                                if (var49 != null) {
                                    int var50 = var12.field9263;
                                    String var51 = var12.field9205;
                                    if (var12.field9318 != -1) {
                                        class597 var52 = class77.field948.method1165((byte) 72, var12.field9318);
                                        var51 = var52.field7763;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field7832 == 1 || var12.field9218 != 1) && var12.field9218 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class311.method1909(var12.field9218, 3);
                                        }
                                    }
                                    if (var12.field9291 != -1) {
                                        var51 = class763.method4241(var12.field9291, -1);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class420.field5787 == var12) {
                                        var51 = class517.field6871.method2877(class713.field9854, (byte) -108);
                                        var50 = var12.field9263;
                                    }
                                    if (class112.field1852) {
                                        class341.field4807.method433(var18, var19, var12.field9287 + var18, var19 - -var12.field9178);
                                    }
                                    var49.method518(var12.field9304, class679.field9485, var12.field9211, var12.field9289, var19, var12.field9245 ? 255 - (var22 & 0xFF) << 24 : -1, var18, var12.field9178, null, var12.field9287, 0, null, 0, 255 - (var22 & 0xFF) << 24 | var50, 1, var12.field9308, var51);
                                    if (class112.field1852) {
                                        class341.field4807.method419(arg8, arg2, arg10, arg0);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class112.field1852) {
                                            class539 var53 = class582.method3184(class341.field4807, var12.field9230, 27198);
                                            int var54 = var53.method3003(var51, -119, class679.field9485, var12.field9287);
                                            int var55 = var53.method2998(-1, var51, var12.field9287, class679.field9485, var12.field9308);
                                            if (class24.field412) {
                                                if (arg4) {
                                                    class62.method539(var18 + var54, var18, (byte) -43, var19 + var55, var19);
                                                } else {
                                                    class251.method1535(var18, var19 + var55, var18 + var54, var19, (byte) 111);
                                                }
                                            }
                                        } else if (class24.field412) {
                                            if (arg4) {
                                                class62.method539(var15, var13, (byte) -118, var16, var14);
                                            } else {
                                                class251.method1535(var13, var16, var15, var14, (byte) 98);
                                            }
                                        }
                                    }
                                } else if (class194.field2927) {
                                    class399.method2347(var12, 2260);
                                }
                            } else if (var12.field9239 == 5) {
                                if (var12.field9246 < 0) {
                                    class133 var56;
                                    if (var12.field9318 != -1) {
                                        class320 var57 = var12.field9267 ? class472.field6475.field5333 : null;
                                        var56 = class77.field948.method1167(-52, -16777216 | var12.field9295, var12.field9318, class341.field4807, var12.field9254, var12.field9218, var12.field9223, var57);
                                    } else if (var12.field9291 == -1) {
                                        var56 = var12.method3716(class341.field4807, (byte) -126);
                                    } else {
                                        var56 = class20.method223(0, class341.field4807, var12.field9291);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method1036();
                                        int var59 = var56.method1048();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field9263 == 0 ? 16777215 : var12.field9263 & 0xFFFFFF);
                                        if (var12.field9315) {
                                            class341.field4807.method433(var18, var19, var18 + var12.field9287, var12.field9178 + var19);
                                            if (var12.field9208 != 0) {
                                                int var61 = (var12.field9287 + var58 - 1) / var58;
                                                int var62 = (var59 + var12.field9178 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field9263 == 0) {
                                                            var56.method1029((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var19 - -(var59 * var64)), 4096, var12.field9208);
                                                        } else {
                                                            var56.method1028((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field9208, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field9263 == 0 && var22 == 0) {
                                                var56.method1049(var18, var19, var12.field9287, var12.field9178);
                                            } else {
                                                var56.method1047(var18, var19, var12.field9287, var12.field9178, 0, var60, 1);
                                            }
                                            class341.field4807.method419(arg8, arg2, arg10, arg0);
                                        } else if (var12.field9263 == 0 && var22 == 0) {
                                            if (var12.field9208 != 0) {
                                                var56.method1029((float) var12.field9287 / 2.0F + (float) var18, (float) var12.field9178 / 2.0F + (float) var19, var12.field9287 * 4096 / var58, var12.field9208);
                                            } else if (var12.field9287 == var58 && var12.field9178 == var59) {
                                                var56.method1035(var18, var19);
                                            } else {
                                                var56.method1052(var18, var19, var12.field9287, var12.field9178);
                                            }
                                        } else if (var12.field9208 != 0) {
                                            var56.method1028((float) var12.field9287 / 2.0F + (float) var18, (float) var12.field9178 / 2.0F + (float) var19, var12.field9287 * 4096 / var58, var12.field9208, 0, var60, 1);
                                        } else if (var12.field9287 == var58 && var12.field9178 == var59) {
                                            var56.method1045(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method1033(var18, var19, var12.field9287, var12.field9178, 0, var60, 1);
                                        }
                                    } else if (class194.field2927) {
                                        class399.method2347(var12, 2260);
                                    }
                                } else {
                                    var12.method3707((byte) -65, class2.field26, class137.field2187).method3767(0, var18, 0, class341.field4807, var12.field9284 << 3, (byte) -125, var12.field9176 << 3, var12.field9178, var19, var12.field9287);
                                }
                                if (class24.field412) {
                                    if (arg4) {
                                        class62.method539(var15, var13, (byte) -45, var16, var14);
                                    } else {
                                        class251.method1535(var13, var16, var15, var14, (byte) 110);
                                    }
                                }
                            } else if (var12.field9239 == 6) {
                                class29.method264((byte) 73);
                                Object var65 = null;
                                class475 var66 = null;
                                int var67 = 0;
                                if (var12.field9318 != -1) {
                                    class597 var75 = class77.field948.method1165((byte) 107, var12.field9318);
                                    if (var75 != null) {
                                        class597 var76 = var75.method3258(18479, var12.field9218);
                                        class456 var77 = var12.field9203 == -1 ? null : class509.field6780.method663((byte) -90, var12.field9203);
                                        class320 var78 = var12.field9267 ? class472.field6475.field5333 : null;
                                        var66 = var76.method3251(var77, var12.field9189, var78, class341.field4807, -26163, 1, var12.field9192, 2048, var12.field9237);
                                        if (var66 == null) {
                                            class399.method2347(var12, 2260);
                                        } else {
                                            var67 = -var66.method180() >> 1;
                                        }
                                    }
                                } else if (var12.field9177 == 5) {
                                    int var72 = var12.field9224;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class383 var73 = class248.field3438[var72];
                                        class456 var74 = var12.field9203 == -1 ? null : class509.field6780.method663((byte) -90, var12.field9203);
                                        if (var73 != null && (class303.field4293 == var72 || class741.method4125((byte) 85, var73.field5334) == var12.field9293)) {
                                            var66 = var73.field5333.method1944(class509.field6780, 0, true, class77.field948, 112, class341.field4807, var12.field9237, null, class74.field901, 2048, null, null, class292.field4177, var12.field9192, 0, var12.field9189, 0, class210.field3095, class372.field5174, -1, var74);
                                        }
                                    }
                                } else if (var12.field9177 == 8 || var12.field9177 == 9) {
                                    class287 var69 = class271.method1629(false, var12.field9224, (byte) -60);
                                    class456 var70 = var12.field9203 == -1 ? null : class509.field6780.method663((byte) -90, var12.field9203);
                                    if (var69 != null) {
                                        class320 var71 = var12.field9267 ? class472.field6475.field5333 : null;
                                        var66 = var69.method1777(var12.field9192, 2048, var12.field9189, var70, var12.field9293, -24182968, var71, class341.field4807, var12.field9237, var12.field9177 == 9);
                                    }
                                } else if (var12.field9203 == -1) {
                                    var66 = var12.method3724(class74.field901, class210.field3095, class292.field4177, 0, -1, class341.field4807, class372.field5174, -1, null, class509.field6780, class472.field6475.field5333, class77.field948, 2048, (class131) var65, false);
                                    if (var66 == null && class194.field2927) {
                                        class399.method2347(var12, 2260);
                                    }
                                } else {
                                    class456 var68 = class509.field6780.method663((byte) -90, var12.field9203);
                                    var66 = var12.method3724(class74.field901, class210.field3095, class292.field4177, var12.field9189, var12.field9192, class341.field4807, class372.field5174, var12.field9237, var68, class509.field6780, class472.field6475.field5333, class77.field948, 2048, (class131) var65, false);
                                    if (var66 == null && class194.field2927) {
                                        class399.method2347(var12, 2260);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field9276 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field9287 << 9) / var12.field9276;
                                    }
                                    int var80;
                                    if (var12.field9282 > 0) {
                                        var80 = (var12.field9178 << 9) / var12.field9282;
                                    } else {
                                        var80 = 512;
                                    }
                                    int var81 = var12.field9287 / 2 + var18;
                                    int var82 = var12.field9178 / 2 + var19;
                                    if (!var12.field9219) {
                                        var81 += var12.field9228 * var79 >> 9;
                                        var82 += var12.field9225 * var80 >> 9;
                                    }
                                    class512.field6795.method1725();
                                    class341.field4807.method481(class512.field6795);
                                    class341.field4807.method445(var81, var82, var79, var80);
                                    class341.field4807.method454();
                                    if (var12.field9311) {
                                        class341.field4807.method493(false);
                                    }
                                    if (var12.field9219) {
                                        class178.field2679.method1705(var12.field9283);
                                        class178.field2679.method1710(var12.field9164);
                                        class178.field2679.method1716(var12.field9244);
                                        class178.field2679.method1730(var12.field9228, var12.field9225, var12.field9290);
                                    } else {
                                        int var83 = (var12.field9320 << 2) * class451.field6174[var12.field9283 << 3] >> 14;
                                        int var84 = (var12.field9320 << 2) * class451.field6177[var12.field9283 << 3] >> 14;
                                        class178.field2679.method1700(-var12.field9244 << 3);
                                        class178.field2679.method1710(var12.field9164 << 3);
                                        class178.field2679.method1730(var12.field9235 << 2, (var12.field9305 << 2) + var67 + var83, (var12.field9305 << 2) + var84);
                                        class178.field2679.method1718(var12.field9283 << 3);
                                    }
                                    var12.method3711(class178.field2679, 5562, var66, class29.field474, class341.field4807);
                                    if (class112.field1852) {
                                        class341.field4807.method433(var18, var19, var12.field9287 + var18, var12.field9178 + var19);
                                    }
                                    if (var12.field9219) {
                                        if (var12.field9186) {
                                            var66.method160(class178.field2679, null, var12.field9320, 1);
                                        } else {
                                            var66.method155(class178.field2679, null, 1);
                                            if (var12.field9297 != null) {
                                                class341.field4807.method508(var12.field9297.method128());
                                            }
                                        }
                                    } else if (var12.field9186) {
                                        var66.method160(class178.field2679, null, var12.field9320 << 2, 1);
                                    } else {
                                        var66.method155(class178.field2679, null, 1);
                                        if (var12.field9297 != null) {
                                            class341.field4807.method508(var12.field9297.method128());
                                        }
                                    }
                                    if (class112.field1852) {
                                        class341.field4807.method419(arg8, arg2, arg10, arg0);
                                    }
                                    if (var12.field9311) {
                                        class341.field4807.method493(true);
                                    }
                                }
                                if (class24.field412) {
                                    if (arg4) {
                                        class62.method539(var15, var13, (byte) -61, var16, var14);
                                    } else {
                                        class251.method1535(var13, var16, var15, var14, (byte) 97);
                                    }
                                }
                            } else if (var12.field9239 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field9185) {
                                    var85 = var18;
                                    var86 = var19;
                                    var87 = var12.field9178 + var19;
                                    var88 = var12.field9287 + var18;
                                } else {
                                    var86 = var12.field9178 + var19;
                                    var85 = var18;
                                    var87 = var19;
                                    var88 = var18 + var12.field9287;
                                }
                                if (var12.field9163 == 1) {
                                    class341.field4807.method412(var85, var87, var88, var86, var12.field9263, 0);
                                } else {
                                    class341.field4807.method404(var85, var87, var88, var86, var12.field9263, var12.field9163, 0);
                                }
                                if (class24.field412) {
                                    if (arg4) {
                                        class62.method539(var15, var13, (byte) -107, var16, var14);
                                    } else {
                                        class251.method1535(var13, var16, var15, var14, (byte) 94);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lmha;", line = 871)
    public class419 method112(byte arg0) {
        field6527++;
        return arg0 == 62 ? null : null;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lle;Lqj;IIIIIII)V", line = 884)
    public class476(class311 arg0, class512 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6522 = arg0;
        this.field6529 = arg4;
        this.field6526 = arg6;
        this.field6524 = arg8;
        this.field6530 = arg7;
        this.field6521 = arg2;
        this.field6528 = arg3;
        this.field6531 = arg5;
        this.field6523 = arg1;
    }
}
