import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class111 {

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
    public static int[] field1966 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field1965 = -1;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BZ[B)V", line = 4)
    public static final void method797(byte arg0, boolean arg1, byte[] arg2) {
        if (arg0 != -77) {
            return;
        }
        field1968++;
        if (class350.field5469 == null) {
            class350.field5469 = new class23(20000);
        }
        class350.field5469.method136(arg2, 866900624, 0, arg2.length);
        if (!arg1) {
            return;
        }
        class416.method2566(class350.field5469.field302, (byte) -107);
        class441.field6575 = new class239[class11.field124];
        int var3 = 0;
        for (int var4 = class228.field3992; var4 <= class491.field7176; var4++) {
            class239 var5 = class313.method1987((byte) 116, var4);
            if (var5 != null) {
                class441.field6575[var3++] = var5;
            }
        }
        class202.field3203 = false;
        class3.field31 = class19.method91((byte) 123);
        class350.field5469 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 49)
    public static final void method798(int arg0) {
        class239.field4117.method1604(4);
        field1967++;
        if (arg0 != 3) {
            method800((byte) 63);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I", line = 64)
    public static final int method799(int arg0, String arg1, int arg2, String arg3) {
        field1959++;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        if (arg0 != 456384544) {
            return 122;
        }
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class332.method2092(var22, 69);
            var9 = class332.method2092(var24, 69);
            char var26 = class337.method2128(var22, (byte) -100, arg2);
            char var27 = class337.method2128(var24, (byte) -23, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class239.method1636(var28, arg2, (byte) -93) - class239.method1636(var29, arg2, (byte) -93);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class239.method1636(var20, arg2, (byte) -93) - class239.method1636(var21, arg2, (byte) -93);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class239.method1636(var14, arg2, (byte) -93) - class239.method1636(var15, arg2, (byte) -93);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bs", name = "toString", descriptor = "()Ljava/lang/String;", line = 189)
    public final String toString() {
        field1964++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V", line = 200)
    public class111(int arg0) {
        this.field1962 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V", line = 209)
    public static void method800(byte arg0) {
        field1966 = null;
        if (arg0 > -21) {
            field1966 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZIIIII[Lec;II)V", line = 219)
    public static final void method801(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class68[] arg7, int arg8, int arg9) {
        class305.field4873.method829(arg2, arg4, arg5, arg8);
        field1961++;
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class68 var11 = arg7[var10];
            if (var11 != null && (var11.field1047 == arg3 || arg3 == -1412584499 && class164.field2598 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class166.field2665[class128.field2208].setBounds(var11.field1118 + arg9, var11.field1127 - -arg6, var11.field1009, var11.field1081);
                    var12 = class128.field2208++;
                } else {
                    var12 = arg0;
                }
                var11.field1004 = class504.field7348;
                var11.field1098 = var12;
                if (!client.method481(var11)) {
                    if (var11.field1115 != 0) {
                        class335.method2118(var11, -133);
                    }
                    int var13 = var11.field1118 + arg9;
                    int var14 = var11.field1127 + arg6;
                    int var15 = var11.field1049;
                    if (class494.field7214 && (client.method475(var11).field4938 != 0 || var11.field1086 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class164.field2598 == var11) {
                        if (arg3 != -1412584499 && (class462.field6873 == var11.field1085 || class320.field5017 == var11.field1085)) {
                            class510.field7419 = arg6;
                            class29.field475 = arg9;
                            class477.field7052 = arg7;
                            continue;
                        }
                        if (class54.field875 && class420.field6357) {
                            int var16 = class333.field5233.method1660(2766);
                            int var17 = class333.field5233.method1655(-109);
                            int var18 = var17 - class222.field3819;
                            int var19 = var16 - class226.field3891;
                            if (var19 < class97.field1607) {
                                var19 = class97.field1607;
                            }
                            if (class326.field5135 > var18) {
                                var18 = class326.field5135;
                            }
                            if (var11.field1009 + var19 > class97.field1607 + class529.field7780.field1009) {
                                var19 = class97.field1607 + class529.field7780.field1009 - var11.field1009;
                            }
                            if (var18 + var11.field1081 > class326.field5135 + class529.field7780.field1081) {
                                var18 = class326.field5135 + class529.field7780.field1081 - var11.field1081;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (class320.field5017 == var11.field1085) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field1086 == 2) {
                        var23 = arg2;
                        var25 = arg5;
                        var22 = arg4;
                        var24 = arg8;
                    } else {
                        int var20 = var11.field1009 + var13;
                        int var21 = var11.field1081 + var14;
                        if (var11.field1086 == 9) {
                            var20++;
                            var21++;
                        }
                        var22 = arg4 < var14 ? var14 : arg4;
                        var23 = arg2 >= var13 ? arg2 : var13;
                        var24 = arg8 > var21 ? var21 : arg8;
                        var25 = var20 < arg5 ? var20 : arg5;
                    }
                    if (var25 > var23 && var22 < var24) {
                        if (var11.field1115 != 0) {
                            if (class81.field1426 == var11.field1115 || class253.field4308 == var11.field1115) {
                                class167.method1151(var13, class253.field4308 == var11.field1115, -21217, var11.field1081, var11.field1009, var14);
                                class445.field6633[var12] = true;
                                class305.field4873.method829(arg2, arg4, arg5, arg8);
                                continue;
                            }
                            if (class34.field529 == var11.field1115) {
                                if (var11.method449(true, class305.field4873) != null) {
                                    class529.method3131(53);
                                    class207.method1356(class305.field4873, 29106, var13, var11, var14);
                                    client.field1170[var12] = true;
                                    class305.field4873.method829(arg2, arg4, arg5, arg8);
                                }
                                continue;
                            }
                            if (class335.field5268 == var11.field1115) {
                                if (var11.method449(true, class305.field4873) != null) {
                                    class116.method927(-115, var11, var14, var13);
                                    client.field1170[var12] = true;
                                    class305.field4873.method829(arg2, arg4, arg5, arg8);
                                }
                                continue;
                            }
                            if (class424.field6392 == var11.field1115) {
                                class64.method418(-1, var14, class305.field4873, var13, class317.field4980, var11.field1009, var11.field1081);
                                class445.field6633[var12] = true;
                                class305.field4873.method829(arg2, arg4, arg5, arg8);
                                continue;
                            }
                            if (class460.field6819 == var11.field1115) {
                                class453.method2711(var14, class305.field4873, var11.field1009, var13, var11.field1081, 1);
                                class445.field6633[var12] = true;
                                class305.field4873.method829(arg2, arg4, arg5, arg8);
                                continue;
                            }
                            if (class293.field4748 == var11.field1115) {
                                if (!class81.field1420 && !class304.field4866) {
                                    continue;
                                }
                                int var26 = var11.field1009 + var13;
                                int var27 = var14 + 15;
                                if (class81.field1420) {
                                    int var28 = -256;
                                    if (class247.field4240 < 20) {
                                        var28 = -65536;
                                    }
                                    class531.field7796.method1902(var28, "Fps:" + class247.field4240, -16777216, -1, var26, var27);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                    }
                                    class531.field7796.method1902(var31, "Mem:" + var30 + "k", -16777216, -1, var26, var27);
                                    var27 += 15;
                                    class531.field7796.method1902(-256, "In:" + class14.field163 + "B/s Out:" + class405.field6156 + "B/s", -16777216, -1, var26, var27);
                                    var27 += 15;
                                    int var32 = class305.field4873.method823() / 1024;
                                    class531.field7796.method1902(var32 > 65536 ? -65536 : -256, "Offheap:" + var32 + "k", -16777216, -1, var26, var27);
                                    var27 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 30; var36++) {
                                        var33 += class436.field6517[var36].method664(4);
                                        var34 += class436.field6517[var36].method655(84);
                                        var35 += class436.field6517[var36].method662(-28134);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class398.method2486(2, true, 8, 0, (long) var38) + "% (" + var37 + "%)";
                                    class151.field2423.method1902(-256, var39, -16777216, -1, var26, var27);
                                    var27 += 12;
                                }
                                if (class10.field100 > 0) {
                                    class151.field2423.method1902(-256, "Particles: " + class339.field5324 + " / " + class10.field100, -16777216, -1, var26, var27);
                                }
                                var27 += 12;
                                if (class304.field4866) {
                                    class151.field2423.method1902(-256, "Polys: " + class305.field4873.method879() + " Models: " + class305.field4873.method905(), -16777216, -1, var26, var27);
                                    var27 += 12;
                                    class151.field2423.method1902(-256, "Ls: " + class6.field66 + " La: " + class157.field2547 + " NPC: " + class230.field4005 + " Pl: " + client.field1166, -16777216, -1, var26, var27);
                                    var27 += 12;
                                    class213.method1399((byte) -87);
                                }
                                class445.field6633[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field1086 == 0) {
                            if (class477.field7057 == var11.field1115 && class305.field4873.method903()) {
                                class305.field4873.method813(var13, var14, var11.field1009, var11.field1081);
                            }
                            method801(var12, true, var23, var11.field1059, var22, var25, var14 - var11.field1042, arg7, var24, var13 - var11.field1041);
                            if (var11.field997 != null) {
                                method801(var12, arg1, var23, var11.field1059, var22, var25, var14 - var11.field1042, var11.field997, var24, var13 - var11.field1041);
                            }
                            class52 var40 = (class52) class259.field4346.method2516((long) var11.field1059, -1);
                            if (var40 != null) {
                                class251.method1704(var23, var12, var24, var40.field841, var14, var13, -1, var22, var25);
                            }
                            if (class477.field7057 == var11.field1115 && class305.field4873.method903()) {
                                class305.field4873.method836();
                                class379.field5880 = true;
                            }
                            class305.field4873.method829(arg2, arg4, arg5, arg8);
                        }
                        if (class67.field987[var12] || class179.field2844 > 1) {
                            if (var11.field1086 == 3) {
                                if (var15 == 0) {
                                    if (var11.field1006) {
                                        class305.field4873.method914(var13, var14, var11.field1009, var11.field1081, var11.field1155, 0);
                                    } else {
                                        class305.field4873.method915(var13, var14, var11.field1009, var11.field1081, var11.field1155, 0);
                                    }
                                } else if (var11.field1006) {
                                    class305.field4873.method914(var13, var14, var11.field1009, var11.field1081, 255 - (var15 & 0xFF) << 24 | var11.field1155 & 0xFFFFFF, 1);
                                } else {
                                    class305.field4873.method915(var13, var14, var11.field1009, var11.field1081, var11.field1155 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field1086 == 4) {
                                class296 var41 = var11.method438(-1, class305.field4873);
                                if (var41 != null) {
                                    int var42 = var11.field1155;
                                    String var43 = var11.field1157;
                                    if (var11.field1062 != -1) {
                                        class104 var44 = class20.field218.method2221(var11.field1062, -1);
                                        var43 = var44.field1771;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((var44.field1745 == 1 || var11.field1007 != 1) && var11.field1007 != -1) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class411.method2536((byte) 49, var11.field1007);
                                        }
                                    }
                                    if (class402.field6122 == var11) {
                                        var43 = class326.field5131.method1954(class300.field4813, -30366);
                                        var42 = var11.field1155;
                                    }
                                    if (class290.field4724) {
                                        class305.field4873.method868(var13, var14, var11.field1009 + var13, var11.field1081 + var14);
                                    }
                                    var41.method1910(null, var11.field1024, var43, var42 | 255 - (var15 & 0xFF) << 24, -6040, var11.field1125, var11.field1053 ? 255 - (var15 & 0xFF) << 24 : -1, 0, var14, var13, var11.field1001, class359.field5589, var11.field1081, var11.field1133, 0, var11.field1009, null);
                                    if (class290.field4724) {
                                        class305.field4873.method829(arg2, arg4, arg5, arg8);
                                    }
                                } else if (class77.field1350) {
                                    class396.method2476(var11, 1);
                                }
                            } else if (var11.field1086 == 5) {
                                if (var11.field1145 >= 0) {
                                    var11.method450((byte) -36, class503.field7338, class279.field4582).method2490(class305.field4873, 0, 0, var11.field1009, var11.field1051 << 3, var11.field1081, var13, 0, var14, var11.field1114 << 3);
                                } else {
                                    class138 var45;
                                    if (var11.field1062 == -1) {
                                        var45 = var11.method442(class305.field4873, -2903);
                                    } else {
                                        class333 var46 = var11.field1012 ? class302.field4850.field2650 : null;
                                        var45 = class20.field218.method2223(var11.field1069, class305.field4873, var11.field1161 | 0xFF000000, var11.field1062, var11.field1107, 6407, var46, var11.field1007);
                                    }
                                    if (var45 != null) {
                                        int var47 = var45.method200();
                                        int var48 = var45.method198();
                                        int var49 = 255 - (var15 & 0xFF) << 24 | (var11.field1155 == 0 ? 16777215 : var11.field1155 & 0xFFFFFF);
                                        if (var11.field1088) {
                                            class305.field4873.method868(var13, var14, var11.field1009 + var13, var14 - -var11.field1081);
                                            if (var11.field1018 != 0) {
                                                int var50 = (var11.field1009 + var47 - 1) / var47;
                                                int var51 = (var48 + var11.field1081 - 1) / var48;
                                                for (int var52 = 0; var52 < var50; var52++) {
                                                    for (int var53 = 0; var53 < var51; var53++) {
                                                        if (var11.field1155 == 0) {
                                                            var45.method1034((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var14 - -(var48 * var53)), 4096, var11.field1018);
                                                        } else {
                                                            var45.method1036((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field1018, 0, var49, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field1155 == 0 && var15 == 0) {
                                                var45.method1038(var13, var14, var11.field1009, var11.field1081);
                                            } else {
                                                var45.method205(var13, var14, var11.field1009, var11.field1081, 0, var49, 1);
                                            }
                                            class305.field4873.method829(arg2, arg4, arg5, arg8);
                                        } else if (var11.field1155 == 0 && var15 == 0) {
                                            if (var11.field1018 != 0) {
                                                var45.method1034((float) var11.field1009 / 2.0F + (float) var13, (float) var11.field1081 / 2.0F + (float) var14, var11.field1009 * 4096 / var47, var11.field1018);
                                            } else if (var11.field1009 == var47 && var11.field1081 == var48) {
                                                var45.method1039(var13, var14);
                                            } else {
                                                var45.method1033(var13, var14, var11.field1009, var11.field1081);
                                            }
                                        } else if (var11.field1018 != 0) {
                                            var45.method1036((float) var11.field1009 / 2.0F + (float) var13, (float) var11.field1081 / 2.0F + (float) var14, var11.field1009 * 4096 / var47, var11.field1018, 0, var49, 1);
                                        } else if (var11.field1009 == var47 && var11.field1081 == var48) {
                                            var45.method199(var13, var14, 0, var49, 1);
                                        } else {
                                            var45.method202(var13, var14, var11.field1009, var11.field1081, 0, var49, 1);
                                        }
                                    } else if (class77.field1350) {
                                        class396.method2476(var11, 1);
                                    }
                                }
                            } else if (var11.field1086 == 6) {
                                class77.method559(-1);
                                class530 var54 = null;
                                int var55 = 0;
                                if (var11.field1062 != -1) {
                                    class104 var56 = class20.field218.method2221(var11.field1062, -1);
                                    if (var56 != null) {
                                        class104 var57 = var56.method707(var11.field1007, 104);
                                        class145 var58 = var11.field1016 == -1 ? null : class130.field2232.method634(-1271654143, var11.field1016);
                                        class333 var59 = var11.field1012 ? class302.field4850.field2650 : null;
                                        var54 = var57.method703(2048, var11.field1084, class305.field4873, var11.field1046, var58, !arg1, 1, var59, var11.field1025);
                                        if (var54 == null) {
                                            class396.method2476(var11, 1);
                                        } else {
                                            var55 = -var54.method726() >> 1;
                                        }
                                    }
                                } else if (var11.field1099 == 5) {
                                    int var64 = var11.field1129;
                                    if (var64 >= 0 && var64 < 2048) {
                                        class166 var65 = class435.field6489[var64];
                                        class145 var66 = var11.field1016 == -1 ? null : class130.field2232.method634(-1271654143, var11.field1016);
                                        if (var65 != null && (class265.field4432 == var64 || class97.method673(62, var65.field2652) == var11.field1044)) {
                                            var54 = var65.field2650.method2094(class22.field239, class327.field5160, -1, 0, var11.field1084, class20.field218, var11.field1046, null, null, true, var11.field1025, 2048, var66, class106.field1901, class305.field4873, class130.field2232, 0, 0, class224.field3870);
                                        }
                                    }
                                } else if (var11.field1099 == 8 || var11.field1099 == 9) {
                                    class112 var61 = class295.method1888(false, var11.field1129, (byte) 114);
                                    class145 var62 = var11.field1016 == -1 ? null : class130.field2232.method634(-1271654143, var11.field1016);
                                    if (var61 != null) {
                                        class333 var63 = var11.field1012 ? class302.field4850.field2650 : null;
                                        var54 = var61.method804(class305.field4873, var11.field1084, 12, var62, 2048, var11.field1046, var11.field1044, var63, var11.field1025, var11.field1099 == 9);
                                    }
                                } else if (var11.field1016 == -1) {
                                    var54 = var11.method451(class20.field218, null, class22.field239, class305.field4873, class302.field4850.field2650, 0, class327.field5160, class130.field2232, class106.field1901, 2048, 0, class224.field3870, -1, -1);
                                    if (var54 == null && class77.field1350) {
                                        class396.method2476(var11, 1);
                                    }
                                } else {
                                    class145 var60 = class130.field2232.method634(-1271654143, var11.field1016);
                                    var54 = var11.method451(class20.field218, var60, class22.field239, class305.field4873, class302.field4850.field2650, var11.field1046, class327.field5160, class130.field2232, class106.field1901, 2048, 0, class224.field3870, var11.field1025, var11.field1084);
                                    if (var54 == null && class77.field1350) {
                                        class396.method2476(var11, 1);
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (var11.field1043 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field1009 << 9) / var11.field1043;
                                    }
                                    int var68;
                                    if (var11.field1077 > 0) {
                                        var68 = (var11.field1081 << 9) / var11.field1077;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69 = var13 - (-(var11.field1146 * var67 >> 9) - (var11.field1009 / 2));
                                    int var70 = (var11.field1158 * var68 >> 9) + var14 + (var11.field1081 / 2);
                                    class71.field1242.method1244();
                                    class305.field4873.method911(class71.field1242);
                                    class305.field4873.method857(var69, var70, var67, var68);
                                    class305.field4873.method877((float) (var11.field1124 << 0), var11.field1112 ? (float) (var11.field1056 << 0) : (float) (var11.field1056 << 0) * 1.5F);
                                    if (arg3 == -1412584499 || class379.field5880) {
                                        class305.field4873.method848();
                                        class305.field4873.method828();
                                        class305.field4873.method829(arg2, arg4, arg5, arg8);
                                        class379.field5880 = false;
                                    }
                                    if (var11.field1023) {
                                        class305.field4873.method886(false);
                                    }
                                    int var71 = (var11.field1017 << 0) * class46.field757[var11.field1113 << 3] >> 15;
                                    int var72 = (var11.field1017 << 0) * class46.field755[var11.field1113 << 3] >> 15;
                                    class350.field5472.method1248(-var11.field1138 << 3);
                                    class350.field5472.method1245(var11.field1031 << 3);
                                    class350.field5472.method1237(var11.field1013 << 0, (var11.field1070 << 0) + var55 + var71, var72 - -(var11.field1070 << 0));
                                    class350.field5472.method1243(var11.field1113 << 3);
                                    if (class290.field4724) {
                                        class305.field4873.method868(var13, var14, var11.field1009 + var13, var11.field1081 + var14);
                                    }
                                    if (var11.field1112) {
                                        var54.method738(class350.field5472, null, var11.field1017 << 0, 1);
                                    } else {
                                        var54.method736(class350.field5472, null, 1);
                                    }
                                    if (class290.field4724) {
                                        class305.field4873.method829(arg2, arg4, arg5, arg8);
                                    }
                                    if (var11.field1023) {
                                        class305.field4873.method886(true);
                                    }
                                    class305.field4873.method877(0.0F, 0.0F);
                                }
                            } else if (var11.field1086 == 9) {
                                int var73;
                                int var74;
                                int var75;
                                int var76;
                                if (var11.field1055) {
                                    var73 = var14 + var11.field1081;
                                    var74 = var13;
                                    var75 = var14;
                                    var76 = var11.field1009 + var13;
                                } else {
                                    var75 = var11.field1081 + var14;
                                    var74 = var13;
                                    var73 = var14;
                                    var76 = var11.field1009 + var13;
                                }
                                if (var11.field1131 == 1) {
                                    class305.field4873.method839(var74, var73, var76, var75, var11.field1155, 0);
                                } else {
                                    class305.field4873.method856(var74, var73, var76, var75, var11.field1155, var11.field1131, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            field1966 = null;
        }
    }
}
