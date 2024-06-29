import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class623 extends class425 {

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public int field9013;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field9016;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "F")
    public static float field9015 = 0.0F;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "[I")
    public static int[] field9010 = new int[250];

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lr;")
    public static class167 field9017;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public static final void method3551(int arg0, int arg1, int arg2) {
        field9011++;
        int var3 = class141.field2478.method286(class265.field3899.method1733(255, class140.field2466), -5113);
        for (class300 var4 = (class300) class126.field2292.method1224(-2); var4 != null; var4 = (class300) class126.field2292.method1232(-2)) {
            int var9 = class103.method960(var4, (byte) 40);
            if (var9 > var3) {
                var3 = var9;
            }
        }
        var3 += 8;
        int var5 = class481.field6904 * 16 + 21;
        int var6 = 85 / ((arg1 - 48) / 45);
        int var7 = arg0 - (var3 / 2);
        if (class506.field7173 < (var3 + var7)) {
            var7 = class506.field7173 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg2;
        if ((var5 + arg2) > class310.field4626) {
            var8 = class310.field4626 - var5;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        class640.field9206 = var7;
        class134.field2391 = var3;
        class337.field5033 = (class163.field2740 ? 26 : 22) + class481.field6904 * 16;
        class308.field4551 = true;
        class43.field1086 = var8;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII[Llk;II)V")
    public static final void method3552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class545[] arg7, int arg8, int arg9) {
        field9017.method142(arg9, arg3, arg5, arg2);
        field9014++;
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class545 var11 = arg7[var10];
            if (var11 != null && (var11.field7733 == arg6 || arg6 == -1412584499 && class44.field1094 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class293.field4404[class152.field2587].setBounds(var11.field7751 + arg8, var11.field7592 + arg0, var11.field7718, var11.field7652);
                    var12 = class152.field2587++;
                } else {
                    var12 = arg1;
                }
                var11.field7721 = class336.field5031;
                var11.field7623 = var12;
                if (!client.method1819(var11)) {
                    if (var11.field7709 != 0) {
                        class488.method2944(-91, var11);
                    }
                    int var13 = var11.field7751 + arg8;
                    int var14 = var11.field7592 + arg0;
                    int var15 = var11.field7683;
                    if (class609.field8870 && (client.method1825(var11).field8941 != 0 || var11.field7649 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class44.field1094 == var11) {
                        if (arg6 != -1412584499 && (class356.field5331 == var11.field7707 || class375.field5585 == var11.field7707)) {
                            class61.field1382 = arg0;
                            class416.field6021 = arg8;
                            class462.field6574 = arg7;
                            continue;
                        }
                        if (class287.field4274 && class282.field4183) {
                            int var16 = class410.field5945.method1931(-23081);
                            int var17 = class410.field5945.method1936(127);
                            int var18 = var16 - class396.field5779;
                            int var19 = var17 - class437.field6305;
                            if (var18 < class260.field3817) {
                                var18 = class260.field3817;
                            }
                            if (class404.field5835 > var19) {
                                var19 = class404.field5835;
                            }
                            if (var18 + var11.field7718 > class260.field3817 + class617.field8960.field7718) {
                                var18 = class260.field3817 + class617.field8960.field7718 - var11.field7718;
                            }
                            if ((class404.field5835 + class617.field8960.field7652) < (var11.field7652 + var19)) {
                                var19 = class404.field5835 + class617.field8960.field7652 - var11.field7652;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (class375.field5585 == var11.field7707) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field7649 == 2) {
                        var25 = arg5;
                        var24 = arg2;
                        var23 = arg3;
                        var22 = arg9;
                    } else {
                        int var20 = var11.field7718 + var13;
                        int var21 = var11.field7652 + var14;
                        var22 = var13 > arg9 ? var13 : arg9;
                        if (var11.field7649 == 9) {
                            var21++;
                            var20++;
                        }
                        var23 = arg3 >= var14 ? arg3 : var14;
                        var24 = arg2 <= var21 ? arg2 : var21;
                        var25 = arg5 <= var20 ? arg5 : var20;
                    }
                    if (var25 > var22 && var23 < var24) {
                        if (var11.field7709 != 0) {
                            if (class79.field1579 == var11.field7709 || class420.field6051 == var11.field7709) {
                                class150.method1180(var13, var14, var11.field7718, var11.field7652, -27271, class420.field6051 == var11.field7709);
                                class248.field3731[var12] = true;
                                field9017.method142(arg9, arg3, arg5, arg2);
                                continue;
                            }
                            if (class152.field2593 == var11.field7709) {
                                if (var11.method3144(26, field9017) != null) {
                                    class418.method2539(false);
                                    class395.method2435(var13, field9017, var14, -1, var11);
                                    class480.field6901[var12] = true;
                                    field9017.method142(arg9, arg3, arg5, arg2);
                                }
                                continue;
                            }
                            if (class135.field2398 == var11.field7709) {
                                if (var11.method3144(124, field9017) != null) {
                                    class200.method1428(var14, -91, var13, var11);
                                    class480.field6901[var12] = true;
                                    field9017.method142(arg9, arg3, arg5, arg2);
                                }
                                continue;
                            }
                            if (class649.field9346 == var11.field7709) {
                                class698.method3902(var11.field7718, var11.field7652, (byte) 28, class513.field7240, field9017, var13, var14);
                                class248.field3731[var12] = true;
                                field9017.method142(arg9, arg3, arg5, arg2);
                                continue;
                            }
                            if (class413.field5982 == var11.field7709) {
                                class22.method460(field9017, var11.field7652, var13, -2, var14, var11.field7718);
                                class248.field3731[var12] = true;
                                field9017.method142(arg9, arg3, arg5, arg2);
                                continue;
                            }
                            if (class27.field920 == var11.field7709) {
                                if (!class239.field3535 && !class135.field2400) {
                                    continue;
                                }
                                int var26 = var11.field7718 + var13;
                                int var27 = var14 + 15;
                                if (class239.field3535) {
                                    int var28 = -256;
                                    if (class349.field5192 < 20) {
                                        var28 = -65536;
                                    }
                                    class363.field5394.method2562(var28, var26, -1, "Fps:" + class349.field5192, 73, var27);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 98304) {
                                        var31 = -65536;
                                        if (class544.field7585) {
                                            class78.method825((byte) 117);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class108.method974(4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 3867);
                                            }
                                        }
                                    }
                                    class363.field5394.method2562(var31, var26, -1, "Mem:" + var30 + "k", 51, var27);
                                    var27 += 15;
                                    class363.field5394.method2562(-256, var26, -1, "In:" + class475.field6799 + "B/s Out:" + class699.field9837 + "B/s", 82, var27);
                                    var27 += 15;
                                    int var33 = field9017.method149() / 1024;
                                    class363.field5394.method2562(var33 <= 65536 ? -256 : -65536, var26, -1, "Offheap:" + var33 + "k", 76, var27);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class486.field6948[var37] != null) {
                                            var34 += class486.field6948[var37].method948(false);
                                            var35 += class486.field6948[var37].method950(59);
                                            var36 += class486.field6948[var37].method951((byte) -1);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class434.method2636(true, 2, (byte) -32, (long) var39, 0) + "% (" + var38 + "%)";
                                    class542.field7569.method2562(-256, var26, -1, var40, 107, var27);
                                    var27 += 12;
                                }
                                if (class76.field1544 > 0) {
                                    class542.field7569.method2562(-256, var26, -1, "Particles: " + class32.field956 + " / " + class76.field1544, 57, var27);
                                }
                                var27 += 12;
                                if (class135.field2400) {
                                    class542.field7569.method2562(-256, var26, -1, "Polys: " + field9017.method116() + " Models: " + field9017.method102(), 60, var27);
                                    var27 += 12;
                                    class542.field7569.method2562(-256, var26, -1, "Ls: " + class372.field5521 + " La: " + class195.field3062 + " NPC: " + class103.field1836 + " Pl: " + class473.field6710, 92, var27);
                                    var27 += 12;
                                    class358.method2292(-126);
                                }
                                class248.field3731[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field7649 == 0) {
                            if (class296.field4433 == var11.field7709 && field9017.method162()) {
                                field9017.method140(var13, var14, var11.field7718, var11.field7652);
                            }
                            method3552(var14 - var11.field7716, var12, var24, var23, -95, var25, var11.field7755, arg7, var13 - var11.field7636, var22);
                            if (var11.field7641 != null) {
                                method3552(var14 - var11.field7716, var12, var24, var23, -120, var25, var11.field7755, var11.field7641, var13 - var11.field7636, var22);
                            }
                            class601 var41 = (class601) class78.field1572.method2596((long) var11.field7755, 76);
                            if (var41 != null) {
                                class531.method3086(var12, var41.field8614, var23, var24, (byte) -122, var13, var14, var22, var25);
                            }
                            if (class296.field4433 == var11.field7709 && field9017.method162()) {
                                field9017.method94();
                            }
                            field9017.method142(arg9, arg3, arg5, arg2);
                        }
                        if (class338.field5050[var12] || class125.field2263 > 1) {
                            if (var11.field7649 == 3) {
                                if (var15 == 0) {
                                    if (var11.field7614) {
                                        field9017.method4(var13, var14, var11.field7718, var11.field7652, var11.field7608, 0);
                                    } else {
                                        field9017.method108(var13, var14, var11.field7718, var11.field7652, var11.field7608, 0);
                                    }
                                } else if (var11.field7614) {
                                    field9017.method4(var13, var14, var11.field7718, var11.field7652, var11.field7608 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    field9017.method108(var13, var14, var11.field7718, var11.field7652, var11.field7608 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field7649 == 4) {
                                class421 var42 = var11.method3134(13, field9017);
                                if (var42 != null) {
                                    int var43 = var11.field7608;
                                    String var44 = var11.field7739;
                                    if (var11.field7702 != -1) {
                                        class110 var45 = class268.field3985.method258(var11.field7702, (byte) -67);
                                        var44 = var45.field1954;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field1934 == 1 || var11.field7687 != 1) && var11.field7687 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class465.method2779(-7, var11.field7687);
                                        }
                                    }
                                    if (class265.field3940 == var11) {
                                        var44 = class265.field3906.method1733(255, class140.field2466);
                                        var43 = var11.field7608;
                                    }
                                    if (class59.field1339) {
                                        field9017.method144(var13, var14, var11.field7718 + var13, var11.field7652 + var14);
                                    }
                                    var42.method2555((byte) -42, var11.field7600, var11.field7668, null, var13, var44, 0, 0, class381.field5638, var11.field7633 ? 255 - (var15 & 0xFF) << 24 : -1, var43 | 255 - (var15 & 0xFF) << 24, var14, var11.field7663, null, var11.field7652, var11.field7718, var11.field7617);
                                    if (class59.field1339) {
                                        field9017.method142(arg9, arg3, arg5, arg2);
                                    }
                                } else if (class55.field1207) {
                                    class531.method3088(var11, (byte) 17);
                                }
                            } else if (var11.field7649 == 5) {
                                if (var11.field7758 < 0) {
                                    class702 var47;
                                    if (var11.field7702 == -1) {
                                        var47 = var11.method3136(-128, field9017);
                                    } else {
                                        class168 var46 = var11.field7619 ? class532.field7456.field8621 : null;
                                        var47 = class268.field3985.method253(var11.field7687, true, var11.field7696, field9017, var46, var11.field7620 | 0xFF000000, var11.field7638, var11.field7702);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method1784();
                                        int var49 = var47.method1789();
                                        int var50 = (var11.field7608 == 0 ? 16777215 : var11.field7608 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field7590) {
                                            field9017.method144(var13, var14, var13 + var11.field7718, var14 - -var11.field7652);
                                            if (var11.field7734 != 0) {
                                                int var51 = (var48 + var11.field7718 - 1) / var48;
                                                int var52 = (var11.field7652 + var49 - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field7608 == 0) {
                                                            var47.method3917((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field7734);
                                                        } else {
                                                            var47.method3916((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field7734, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field7608 == 0 && var15 == 0) {
                                                var47.method3918(var13, var14, var11.field7718, var11.field7652);
                                            } else {
                                                var47.method1788(var13, var14, var11.field7718, var11.field7652, 0, var50, 1);
                                            }
                                            field9017.method142(arg9, arg3, arg5, arg2);
                                        } else if (var11.field7608 == 0 && var15 == 0) {
                                            if (var11.field7734 != 0) {
                                                var47.method3917((float) var11.field7718 / 2.0F + (float) var13, (float) var11.field7652 / 2.0F + (float) var14, var11.field7718 * 4096 / var48, var11.field7734);
                                            } else if (var11.field7718 == var48 && var11.field7652 == var49) {
                                                var47.method3914(var13, var14);
                                            } else {
                                                var47.method3922(var13, var14, var11.field7718, var11.field7652);
                                            }
                                        } else if (var11.field7734 != 0) {
                                            var47.method3916((float) var11.field7718 / 2.0F + (float) var13, (float) var11.field7652 / 2.0F + (float) var14, var11.field7718 * 4096 / var48, var11.field7734, 0, var50, 1);
                                        } else if (var11.field7718 == var48 && var11.field7652 == var49) {
                                            var47.method1743(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method3919(var13, var14, var11.field7718, var11.field7652, 0, var50, 1);
                                        }
                                    } else if (class55.field1207) {
                                        class531.method3088(var11, (byte) 40);
                                    }
                                } else {
                                    var11.method3146(class92.field1672, class475.field6813, -19).method3312(var13, var14, 4494, var11.field7718, var11.field7648 << 3, var11.field7670 << 3, 0, var11.field7652, field9017, 0);
                                }
                            } else if (var11.field7649 == 6) {
                                class691.method3869(-240);
                                class55 var55 = null;
                                int var56 = 0;
                                if (var11.field7702 != -1) {
                                    class110 var64 = class268.field3985.method258(var11.field7702, (byte) -67);
                                    if (var64 != null) {
                                        class110 var65 = var64.method996(var11.field7687, 22617);
                                        class138 var66 = var11.field7698 == -1 ? null : class357.field5338.method2099(var11.field7698, true);
                                        class168 var67 = var11.field7619 ? class532.field7456.field8621 : null;
                                        var55 = var65.method997(var66, 2048, var11.field7661, var11.field7715, field9017, true, var11.field7624, 1, var67);
                                        if (var55 == null) {
                                            class531.method3088(var11, (byte) 115);
                                        } else {
                                            var56 = -var55.method315() >> 1;
                                        }
                                    }
                                } else if (var11.field7602 == 5) {
                                    int var57 = var11.field7742;
                                    if (var57 >= 0 && var57 < 2048) {
                                        class602 var58 = class59.field1341[var57];
                                        class138 var59 = var11.field7698 == -1 ? null : class357.field5338.method2099(var11.field7698, true);
                                        if (var58 != null && (class422.field6096 == var57 || class447.method2688(var58.field8631, 8) == var11.field7677)) {
                                            var55 = var58.field8621.method1274(true, 0, class467.field6618, var11.field7715, var11.field7624, class113.field2038, class268.field3985, null, class357.field5338, var59, field9017, class317.field4681, 2048, 0, class373.field5557, -1, var11.field7661, 9, null);
                                        }
                                    }
                                } else if (var11.field7602 == 8 || var11.field7602 == 9) {
                                    class430 var61 = class605.method3470((byte) -112, false, var11.field7742);
                                    class138 var62 = var11.field7698 == -1 ? null : class357.field5338.method2099(var11.field7698, true);
                                    if (var61 != null) {
                                        class168 var63 = var11.field7619 ? class532.field7456.field8621 : null;
                                        var55 = var61.method2620(field9017, var11.field7677, (byte) -93, var63, 2048, var11.field7624, var11.field7715, var11.field7602 == 9, var11.field7661, var62);
                                    }
                                } else if (var11.field7698 == -1) {
                                    var55 = var11.method3135(class317.field4681, 2048, null, field9017, -1996255645, class268.field3985, 0, class357.field5338, -1, class467.field6618, class373.field5557, class113.field2038, -1, class532.field7456.field8621);
                                    if (var55 == null && class55.field1207) {
                                        class531.method3088(var11, (byte) 52);
                                    }
                                } else {
                                    class138 var60 = class357.field5338.method2099(var11.field7698, true);
                                    var55 = var11.method3135(class317.field4681, 2048, var60, field9017, -1996255645, class268.field3985, var11.field7715, class357.field5338, var11.field7624, class467.field6618, class373.field5557, class113.field2038, var11.field7661, class532.field7456.field8621);
                                    if (var55 == null && class55.field1207) {
                                        class531.method3088(var11, (byte) 70);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field7743 > 0) {
                                        var68 = (var11.field7718 << 9) / var11.field7743;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field7625 > 0) {
                                        var69 = (var11.field7652 << 9) / var11.field7625;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = var11.field7718 / 2 + var13;
                                    int var71 = var11.field7652 / 2 + var14;
                                    if (!var11.field7610) {
                                        var71 += var11.field7645 * var69 >> 9;
                                        var70 += var11.field7618 * var68 >> 9;
                                    }
                                    class608.field8854.method895();
                                    field9017.method145(class608.field8854);
                                    field9017.method62(var70, var71, var68, var69);
                                    field9017.method28();
                                    if (var11.field7703) {
                                        field9017.method81(false);
                                    }
                                    if (var11.field7610) {
                                        class241.field3647.method893(var11.field7737);
                                        class241.field3647.method901(var11.field7635);
                                        class241.field3647.method897(var11.field7756);
                                        class241.field3647.method891(var11.field7618, var11.field7645, var11.field7604);
                                    } else {
                                        int var72 = (var11.field7688 << 2) * class509.field7210[var11.field7737 << 3] >> 14;
                                        int var73 = (var11.field7688 << 2) * class509.field7220[var11.field7737 << 3] >> 14;
                                        class241.field3647.method903(-var11.field7756 << 3);
                                        class241.field3647.method901(var11.field7635 << 3);
                                        class241.field3647.method891(var11.field7595 << 2, (var11.field7754 << 2) + var56 + var72, var73 - -(var11.field7754 << 2));
                                        class241.field3647.method894(var11.field7737 << 3);
                                    }
                                    var11.method3133(class241.field3647, var55, class336.field5031, field9017, -111);
                                    if (class59.field1339) {
                                        field9017.method144(var13, var14, var11.field7718 + var13, var14 - -var11.field7652);
                                    }
                                    if (var11.field7610) {
                                        if (var11.field7630) {
                                            var55.method317(class241.field3647, null, var11.field7688, 1);
                                        } else {
                                            var55.method334(class241.field3647, null, 1);
                                            if (var11.field7728 != null) {
                                                field9017.method123(var11.field7728.method580());
                                            }
                                        }
                                    } else if (var11.field7630) {
                                        var55.method317(class241.field3647, null, var11.field7688 << 2, 1);
                                    } else {
                                        var55.method334(class241.field3647, null, 1);
                                        if (var11.field7728 != null) {
                                            field9017.method123(var11.field7728.method580());
                                        }
                                    }
                                    if (class59.field1339) {
                                        field9017.method142(arg9, arg3, arg5, arg2);
                                    }
                                    if (var11.field7703) {
                                        field9017.method81(true);
                                    }
                                }
                            } else if (var11.field7649 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field7747) {
                                    var74 = var13;
                                    var75 = var14;
                                    var76 = var13 + var11.field7718;
                                    var77 = var11.field7652 + var14;
                                } else {
                                    var77 = var14;
                                    var75 = var11.field7652 + var14;
                                    var76 = var11.field7718 + var13;
                                    var74 = var13;
                                }
                                if (var11.field7646 == 1) {
                                    field9017.method41(var74, var77, var76, var75, var11.field7608, 0);
                                } else {
                                    field9017.method92(var74, var77, var76, var75, var11.field7608, var11.field7646, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 > -62) {
            field9010 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lla;)V")
    public static final void method3553(class421 arg0) {
        class330.field4825 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method3554(int arg0) {
        field9010 = null;
        if (arg0 != -28660) {
            method3553(null);
        }
        field9017 = null;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)Lmba;")
    public static final class388 method3555(int arg0) {
        field9012++;
        if (arg0 != 512) {
            field9017 = null;
        }
        try {
            return new class353();
        } catch (Throwable var2) {
            try {
                return (class388) Class.forName("ega").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class549();
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
    public class623(int arg0, int arg1) {
        this.field9013 = arg1;
        this.field9016 = arg0;
    }
}
