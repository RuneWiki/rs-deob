import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class90 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lgg;")
    private class114 field1138 = new class114(64);

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lkha;")
    private class687 field1145;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field1141 = 0;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field1143 = -1;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Llm;")
    public final class47 method625(int arg0, int arg1) {
        field1146++;
        class114 var3 = this.field1138;
        class47 var4;
        synchronized (this.field1138) {
            var4 = (class47) this.field1138.method778((long) arg0, arg1 + 91);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field1145;
        byte[] var6;
        synchronized (this.field1145) {
            var6 = this.field1145.method3810(19, -23360, arg0);
        }
        class47 var7 = new class47();
        if (var6 != null) {
            var7.method384(115, new class179(var6));
        }
        class114 var8 = this.field1138;
        synchronized (this.field1138) {
            this.field1138.method774((long) arg0, -98, var7);
            if (arg1 != -1) {
                field1142 = 17;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public static final void method626(byte arg0) {
        class24.field414.method4212((byte) -125);
        field1137++;
        int var1 = class24.field414.method4206(8, arg0 - 90);
        if (var1 < class443.field6200) {
            for (int var2 = var1; var2 < class443.field6200; var2++) {
                class747.field10446[class440.field6180++] = class61.field832[var2];
            }
        }
        if (var1 > class443.field6200) {
            throw new RuntimeException("gnpov1");
        }
        class443.field6200 = 0;
        if (arg0 != 26) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class61.field832[var3];
            class124 var5 = ((class247) class563.field7875.method3248((long) var4, arg0 - 26)).field3158;
            int var6 = class24.field414.method4206(1, arg0 - 4);
            if (var6 == 0) {
                class61.field832[class443.field6200++] = var4;
                var5.field352 = class593.field8251;
            } else {
                int var7 = class24.field414.method4206(2, 99);
                if (var7 == 0) {
                    class61.field832[class443.field6200++] = var4;
                    var5.field352 = class593.field8251;
                    class83.field1071[class9.field95++] = var4;
                } else if (var7 == 1) {
                    class61.field832[class443.field6200++] = var4;
                    var5.field352 = class593.field8251;
                    int var8 = class24.field414.method4206(3, 124);
                    var5.method808(1, var8, (byte) 87);
                    int var9 = class24.field414.method4206(1, -29);
                    if (var9 == 1) {
                        class83.field1071[class9.field95++] = var4;
                    }
                } else if (var7 == 2) {
                    class61.field832[class443.field6200++] = var4;
                    var5.field352 = class593.field8251;
                    if (class24.field414.method4206(1, 106) == 1) {
                        int var11 = class24.field414.method4206(3, 127);
                        var5.method808(2, var11, (byte) 87);
                        int var12 = class24.field414.method4206(3, 108);
                        var5.method808(2, var12, (byte) 87);
                    } else {
                        int var10 = class24.field414.method4206(3, -57);
                        var5.method808(0, var10, (byte) 87);
                    }
                    int var13 = class24.field414.method4206(1, 124);
                    if (var13 == 1) {
                        class83.field1071[class9.field95++] = var4;
                    }
                } else if (var7 == 3) {
                    class747.field10446[class440.field6180++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ltn;I)Ljh;")
    public static final class533 method627(class179 arg0, int arg1) {
        field1144++;
        if (arg1 != 3) {
            field1143 = -103;
        }
        class533 var2 = new class533();
        var2.field7488 = arg0.method1107(false);
        var2.field7491 = class674.field9178.method1302(var2.field7488, 1);
        return var2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII[Lgaa;ZIIB)V")
    public static final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class460[] arg6, boolean arg7, int arg8, int arg9, byte arg10) {
        field1140++;
        class458.field6407.method131(arg4, arg3, arg0, arg2);
        if (arg10 != -13) {
            field1143 = -101;
        }
        for (int var11 = 0; var11 < arg6.length; var11++) {
            class460 var12 = arg6[var11];
            if (var12 != null && (var12.field6528 == arg8 || arg8 == -1412584499 && class85.field1090 == var12)) {
                int var13 = var12.field6572 + arg5;
                int var14 = var12.field6543 + arg1;
                int var15 = var12.field6566 + var13 + 1;
                int var16 = var14 + var12.field6514 + 1;
                int var17;
                if (arg9 == -1) {
                    class101.field1238[class48.field702].setBounds(var12.field6572 + arg5, var12.field6543 + arg1, var12.field6566, var12.field6514);
                    var17 = class48.field702++;
                } else {
                    var17 = arg9;
                }
                var12.field6495 = class266.field3368;
                var12.field6557 = var17;
                if (!client.method698(var12)) {
                    if (var12.field6506 != 0) {
                        class415.method2468(2, var12);
                    }
                    int var18 = var12.field6572 + arg5;
                    int var19 = var12.field6543 + arg1;
                    int var20 = 0;
                    int var21 = 0;
                    if (class107.field1323) {
                        var20 = class173.method1075(-123);
                        var21 = class203.method1259((byte) 122);
                    }
                    int var22 = var12.field6494;
                    if (class491.field6959 && (client.method715(var12).field465 != 0 || var12.field6483 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class85.field1090 == var12) {
                        if (arg8 != -1412584499 && (class260.field3299 == var12.field6526 || class597.field8283 == var12.field6526)) {
                            class363.field5153 = arg1;
                            class120.field1451 = arg6;
                            class539.field7596 = arg5;
                            continue;
                        }
                        if (class563.field7885 && class424.field6048) {
                            int var23 = class402.field5566.method2337(arg10 - 111) + var20;
                            int var24 = class402.field5566.method2336((byte) 97) + var21;
                            int var25 = var24 - class539.field7595;
                            int var26 = var23 - class175.field2276;
                            if (class263.field3335 > var26) {
                                var26 = class263.field3335;
                            }
                            if (class374.field5258 > var25) {
                                var25 = class374.field5258;
                            }
                            if ((var12.field6566 + var26) > (class263.field3335 + class333.field4299.field6566)) {
                                var26 = class333.field4299.field6566 + class263.field3335 - var12.field6566;
                            }
                            if (class374.field5258 + class333.field4299.field6514 < var12.field6514 + var25) {
                                var25 = class374.field5258 + class333.field4299.field6514 - var12.field6514;
                            }
                            var18 = var26;
                            var19 = var25;
                        }
                        if (class597.field8283 == var12.field6526) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field6483 == 2) {
                        var31 = arg2;
                        var30 = arg3;
                        var32 = arg0;
                        var29 = arg4;
                    } else {
                        int var27 = var18 + var12.field6566;
                        int var28 = var19 + var12.field6514;
                        var29 = arg4 >= var18 ? arg4 : var18;
                        if (var12.field6483 == 9) {
                            var27++;
                            var28++;
                        }
                        var30 = arg3 >= var19 ? arg3 : var19;
                        var31 = var28 < arg2 ? var28 : arg2;
                        var32 = arg0 <= var27 ? arg0 : var27;
                    }
                    if (var29 < var32 && var31 > var30) {
                        if (var12.field6506 != 0) {
                            if (class294.field3836 == var12.field6506 || class187.field2458 == var12.field6506) {
                                class560.method3165(var12, 0, var18, var19);
                                if (!class107.field1323) {
                                    class309.method1806(var18, (byte) -105, var12.field6566, class187.field2458 == var12.field6506, var12.field6514, var19);
                                    class458.field6407.method131(arg4, arg3, arg0, arg2);
                                }
                                class709.field9971[var17] = true;
                                continue;
                            }
                            if (class102.field1259 == var12.field6506) {
                                if (var12.method2702(class458.field6407, 35) != null) {
                                    class384.method2308(-127);
                                    class570.method3207((byte) 90, var12, var19, class458.field6407, var18);
                                    class6.field69[var17] = true;
                                    class458.field6407.method131(arg4, arg3, arg0, arg2);
                                    if (class107.field1323) {
                                        if (arg7) {
                                            class365.method2249(true, var16, var14, var15, var13);
                                        } else {
                                            class534.method3038(var13, var15, var14, (byte) -69, var16);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class74.field1006 == var12.field6506) {
                                if (var12.method2702(class458.field6407, 37) != null) {
                                    class485.method2821(4582, var12, var18, var19);
                                    class6.field69[var17] = true;
                                    class458.field6407.method131(arg4, arg3, arg0, arg2);
                                    if (class107.field1323) {
                                        if (arg7) {
                                            class365.method2249(true, var16, var14, var15, var13);
                                        } else {
                                            class534.method3038(var13, var15, var14, (byte) -69, var16);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class266.field3376 == var12.field6506) {
                                class626.method3422(var12.field6566, var19, class524.field7407, (byte) -120, class458.field6407, var18, var12.field6514);
                                class709.field9971[var17] = true;
                                class458.field6407.method131(arg4, arg3, arg0, arg2);
                                continue;
                            }
                            if (class441.field6187 == var12.field6506) {
                                class315.method1849(false, class458.field6407, var12.field6566, var12.field6514, var19, var18);
                                class709.field9971[var17] = true;
                                class458.field6407.method131(arg4, arg3, arg0, arg2);
                                continue;
                            }
                            if (class387.field5391 == var12.field6506) {
                                if (!class679.field9225 && !class534.field7494) {
                                    continue;
                                }
                                int var33 = var12.field6566 + var18;
                                if (class107.field1323) {
                                    if (arg7) {
                                        class365.method2249(true, var16, var14, var15, var13);
                                    } else {
                                        class534.method3038(var13, var15, var14, (byte) -69, var16);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class679.field9225) {
                                    int var35 = -256;
                                    if (class423.field6018 < 20) {
                                        var35 = -65536;
                                    }
                                    class543.field7644.method2522(-127, var33, "Fps:" + class423.field6018, -1, var34, var35);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class434.field6122) {
                                            class301.method1778((byte) 115);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class395.method2352("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4, -128);
                                            }
                                        }
                                    }
                                    class543.field7644.method2522(-128, var33, "Mem:" + var37 + "k", -1, var34, var38);
                                    var34 += 15;
                                    class543.field7644.method2522(-127, var33, "In:" + class632.field8772 + "B/s Out:" + class595.field8268 + "B/s", -1, var34, -256);
                                    var34 += 15;
                                    int var40 = class458.field6407.method178() / 1024;
                                    class543.field7644.method2522(-127, var33, "Offheap:" + var40 + "k", -1, var34, var40 <= 65536 ? -256 : -65536);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class403.field5622[var44] != null) {
                                            var41 += class403.field5622[var44].method3051(-2);
                                            var42 += class403.field5622[var44].method3058(-119);
                                            var43 += class403.field5622[var44].method3055(arg10 ^ 0x6A);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class310.method1812(2, (byte) -122, 0, true, (long) var46) + "% (" + var45 + "%)";
                                    class524.field7408.method2522(arg10 ^ 0x72, var33, var47, -1, var34, -256);
                                    var34 += 12;
                                }
                                if (class204.field2590 > 0) {
                                    class524.field7408.method2522(arg10 ^ 0x73, var33, "Particles: " + field1141 + " / " + class204.field2590, -1, var34, -256);
                                }
                                var34 += 12;
                                if (class534.field7494) {
                                    class524.field7408.method2522(-127, var33, "Polys: " + class458.field6407.method127() + " Models: " + class458.field6407.method126(), -1, var34, -256);
                                    var34 += 12;
                                    class524.field7408.method2522(-128, var33, "Ls: " + class649.field8918 + " La: " + class310.field3966 + " NPC: " + class658.field9043 + " Pl: " + class595.field8271, -1, var34, -256);
                                    class245.method1515(-6300);
                                    var34 += 12;
                                }
                                class709.field9971[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field6483 == 0) {
                            if (class71.field952 == var12.field6506 && class458.field6407.method57()) {
                                class458.field6407.method96(var18, var19, var12.field6566, var12.field6514);
                            }
                            method628(var32, var19 - var12.field6466, var31, var30, var29, var18 - var12.field6549, arg6, arg7, var12.field6524, var17, (byte) -13);
                            if (var12.field6567 != null) {
                                method628(var32, var19 - var12.field6466, var31, var30, var29, var18 - var12.field6549, var12.field6567, arg7, var12.field6524, var17, (byte) -13);
                            }
                            class157 var48 = (class157) class148.field1802.method3248((long) var12.field6524, 0);
                            if (var48 != null) {
                                class517.method2970(var19, -22704, var48.field2028, var31, var30, var32, var18, var17, var29);
                            }
                            if (class71.field952 == var12.field6506 && class458.field6407.method57()) {
                                class458.field6407.method93();
                            }
                            class458.field6407.method131(arg4, arg3, arg0, arg2);
                        }
                        if (class595.field8265[var17] || class286.field3633 > 1) {
                            if (var12.field6483 == 3) {
                                if (var22 == 0) {
                                    if (var12.field6537) {
                                        class458.field6407.method167(var18, var19, var12.field6566, var12.field6514, var12.field6569, 0);
                                    } else {
                                        class458.field6407.method136(var18, var19, var12.field6566, var12.field6514, var12.field6569, 0);
                                    }
                                } else if (var12.field6537) {
                                    class458.field6407.method167(var18, var19, var12.field6566, var12.field6514, 255 - (var22 & 0xFF) << 24 | var12.field6569 & 0xFFFFFF, 1);
                                } else {
                                    class458.field6407.method136(var18, var19, var12.field6566, var12.field6514, var12.field6569 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                }
                                if (class107.field1323) {
                                    if (arg7) {
                                        class365.method2249(true, var16, var14, var15, var13);
                                    } else {
                                        class534.method3038(var13, var15, var14, (byte) -69, var16);
                                    }
                                }
                            } else if (var12.field6483 == 4) {
                                class423 var49 = var12.method2704(class458.field6407, 27006);
                                if (var49 != null) {
                                    int var50 = var12.field6569;
                                    String var51 = var12.field6609;
                                    if (var12.field6556 != -1) {
                                        class167 var52 = class190.field2488.method3944(256, var12.field6556);
                                        var51 = var52.field2149;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field2169 == 1 || var12.field6470 != 1) && var12.field6470 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class692.method3865(var12.field6470, 0);
                                        }
                                    }
                                    if (var12.field6519 != -1) {
                                        var51 = class128.method828(arg10 ^ 0xFFFFFF96, var12.field6519);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class419.field5958 == var12) {
                                        var51 = class586.field8156.method3261(class416.field5920, (byte) 82);
                                        var50 = var12.field6569;
                                    }
                                    if (class643.field8874) {
                                        class458.field6407.method81(var18, var19, var12.field6566 + var18, var19 - -var12.field6514);
                                    }
                                    var49.method2518(0, var12.field6527, 255 - (var22 & 0xFF) << 24 | var50, 0, var19, class328.field4189, var12.field6579, var12.field6566, var12.field6590 ? 255 - (var22 & 0xFF) << 24 : -1, var12.field6472, null, var18, var12.field6621, null, var12.field6514, 107, var51);
                                    if (class643.field8874) {
                                        class458.field6407.method131(arg4, arg3, arg0, arg2);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class643.field8874) {
                                            class56 var53 = class89.method624(var12.field6633, class458.field6407, arg10 ^ 0xFFFFD8E3);
                                            int var54 = var53.method447(class328.field4189, (byte) 79, var12.field6566, var51);
                                            int var55 = var53.method450(class328.field4189, var51, var12.field6566, (byte) -34, var12.field6472);
                                            if (class107.field1323) {
                                                if (arg7) {
                                                    class365.method2249(true, var19 + var55, var19, var18 + var54, var18);
                                                } else {
                                                    class534.method3038(var18, var18 + var54, var19, (byte) -69, var19 + var55);
                                                }
                                            }
                                        } else if (class107.field1323) {
                                            if (arg7) {
                                                class365.method2249(true, var16, var14, var15, var13);
                                            } else {
                                                class534.method3038(var13, var15, var14, (byte) -69, var16);
                                            }
                                        }
                                    }
                                } else if (class171.field2246) {
                                    class663.method3591(16886, var12);
                                }
                            } else if (var12.field6483 == 5) {
                                if (var12.field6559 < 0) {
                                    class712 var56;
                                    if (var12.field6556 != -1) {
                                        class326 var57 = var12.field6598 ? class339.field4374.field7665 : null;
                                        var56 = class190.field2488.method3948((byte) -83, var12.field6470, var12.field6616, var12.field6556, var12.field6499 | 0xFF000000, var57, var12.field6568, class458.field6407);
                                    } else if (var12.field6519 == -1) {
                                        var56 = var12.method2701(arg10 ^ 0x7B, class458.field6407);
                                    } else {
                                        var56 = class143.method881(class458.field6407, -1, var12.field6519);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method1892();
                                        int var59 = var56.method1882();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field6569 == 0 ? 16777215 : var12.field6569 & 0xFFFFFF);
                                        if (var12.field6544) {
                                            class458.field6407.method81(var18, var19, var12.field6566 + var18, var19 - -var12.field6514);
                                            if (var12.field6619 != 0) {
                                                int var61 = (var12.field6566 + var58 - 1) / var58;
                                                int var62 = (var12.field6514 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field6569 == 0) {
                                                            var56.method3930((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field6619);
                                                        } else {
                                                            var56.method3934((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field6619, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field6569 == 0 && var22 == 0) {
                                                var56.method3938(var18, var19, var12.field6566, var12.field6514);
                                            } else {
                                                var56.method1871(var18, var19, var12.field6566, var12.field6514, 0, var60, 1);
                                            }
                                            class458.field6407.method131(arg4, arg3, arg0, arg2);
                                        } else if (var12.field6569 == 0 && var22 == 0) {
                                            if (var12.field6619 != 0) {
                                                var56.method3930((float) var12.field6566 / 2.0F + (float) var18, (float) var12.field6514 / 2.0F + (float) var19, var12.field6566 * 4096 / var58, var12.field6619);
                                            } else if (var12.field6566 == var58 && var12.field6514 == var59) {
                                                var56.method3929(var18, var19);
                                            } else {
                                                var56.method3933(var18, var19, var12.field6566, var12.field6514);
                                            }
                                        } else if (var12.field6619 != 0) {
                                            var56.method3934((float) var12.field6566 / 2.0F + (float) var18, (float) var12.field6514 / 2.0F + (float) var19, var12.field6566 * 4096 / var58, var12.field6619, 0, var60, 1);
                                        } else if (var12.field6566 == var58 && var12.field6514 == var59) {
                                            var56.method690(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method3937(var18, var19, var12.field6566, var12.field6514, 0, var60, 1);
                                        }
                                    } else if (class171.field2246) {
                                        class663.method3591(16886, var12);
                                    }
                                } else {
                                    var12.method2696(true, class182.field2384, class696.field9859).method2480(-121, 0, var12.field6629 << 3, var12.field6514, var18, var12.field6566, var12.field6600 << 3, class458.field6407, var19, 0);
                                }
                                if (class107.field1323) {
                                    if (arg7) {
                                        class365.method2249(true, var16, var14, var15, var13);
                                    } else {
                                        class534.method3038(var13, var15, var14, (byte) -69, var16);
                                    }
                                }
                            } else if (var12.field6483 == 6) {
                                class516.method2964(255);
                                class219 var65 = null;
                                int var66 = 0;
                                if (var12.field6556 != -1) {
                                    class167 var74 = class190.field2488.method3944(arg10 ^ 0xFFFFFEF3, var12.field6556);
                                    if (var74 != null) {
                                        class167 var75 = var74.method1038((byte) -96, var12.field6470);
                                        class747 var76 = var12.field6477 == -1 ? null : class646.field8903.method643(var12.field6477, -73);
                                        class326 var77 = var12.field6598 ? class339.field4374.field7665 : null;
                                        var65 = var75.method1044(1, var77, (byte) 123, var76, var12.field6498, class458.field6407, var12.field6622, 2048, var12.field6564);
                                        if (var65 == null) {
                                            class663.method3591(16886, var12);
                                        } else {
                                            var66 = -var65.method1353() >> 1;
                                        }
                                    }
                                } else if (var12.field6525 == 5) {
                                    int var71 = var12.field6625;
                                    if (var71 >= 0 && var71 < 2048) {
                                        class546 var72 = class447.field6287[var71];
                                        class747 var73 = var12.field6477 == -1 ? null : class646.field8903.method643(var12.field6477, -87);
                                        if (var72 != null && (class456.field6387 == var71 || class626.method3423(var72.field7690, -128) == var12.field6479)) {
                                            var65 = var72.field7665.method1927((byte) 126, class5.field52, 2048, var73, null, -1, 0, null, class458.field6407, class646.field8903, class598.field8304, null, 0, class190.field2488, true, var12.field6622, class461.field6637, class190.field2501, var12.field6498, 0, var12.field6564);
                                        }
                                    }
                                } else if (var12.field6525 == 8 || var12.field6525 == 9) {
                                    class464 var68 = class175.method1082(false, var12.field6625, (byte) 20);
                                    class747 var69 = var12.field6477 == -1 ? null : class646.field8903.method643(var12.field6477, -123);
                                    if (var68 != null) {
                                        class326 var70 = var12.field6598 ? class339.field4374.field7665 : null;
                                        var65 = var68.method2745(var12.field6479, var70, -1, var12.field6564, var12.field6525 == 9, 2048, var12.field6498, var69, var12.field6622, class458.field6407);
                                    }
                                } else if (var12.field6477 == -1) {
                                    var65 = var12.method2709(class598.field8304, class190.field2488, class5.field52, class190.field2501, class461.field6637, 0, class458.field6407, (byte) 49, -1, class646.field8903, -1, null, 2048, class339.field4374.field7665);
                                    if (var65 == null && class171.field2246) {
                                        class663.method3591(16886, var12);
                                    }
                                } else {
                                    class747 var67 = class646.field8903.method643(var12.field6477, -127);
                                    var65 = var12.method2709(class598.field8304, class190.field2488, class5.field52, class190.field2501, class461.field6637, var12.field6564, class458.field6407, (byte) 49, var12.field6498, class646.field8903, var12.field6622, var67, 2048, class339.field4374.field7665);
                                    if (var65 == null && class171.field2246) {
                                        class663.method3591(16886, var12);
                                    }
                                }
                                if (var65 != null) {
                                    int var78;
                                    if (var12.field6613 <= 0) {
                                        var78 = 512;
                                    } else {
                                        var78 = (var12.field6566 << 9) / var12.field6613;
                                    }
                                    int var79;
                                    if (var12.field6628 > 0) {
                                        var79 = (var12.field6514 << 9) / var12.field6628;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80 = var12.field6566 / 2 + var18;
                                    int var81 = var12.field6514 / 2 + var19;
                                    if (!var12.field6541) {
                                        var80 += var12.field6513 * var78 >> 9;
                                        var81 += var12.field6592 * var79 >> 9;
                                    }
                                    class261.field3318.method1962();
                                    class458.field6407.method77(class261.field3318);
                                    class458.field6407.method117(var80, var81, var78, var79);
                                    class458.field6407.method99();
                                    if (var12.field6503) {
                                        class458.field6407.method129(false);
                                    }
                                    if (var12.field6541) {
                                        class290.field3732.method1964(var12.field6561);
                                        class290.field3732.method1959(var12.field6606);
                                        class290.field3732.method1972(var12.field6563);
                                        class290.field3732.method1973(var12.field6513, var12.field6592, var12.field6620);
                                    } else {
                                        int var82 = (var12.field6573 << 2) * class138.field1644[var12.field6561 << 3] >> 14;
                                        int var83 = (var12.field6573 << 2) * class138.field1645[var12.field6561 << 3] >> 14;
                                        class290.field3732.method1967(-var12.field6563 << 3);
                                        class290.field3732.method1959(var12.field6606 << 3);
                                        class290.field3732.method1973(var12.field6508 << 2, var82 + (var12.field6469 << 2) + var66, var83 - -(var12.field6469 << 2));
                                        class290.field3732.method1975(var12.field6561 << 3);
                                    }
                                    var12.method2707(class266.field3368, arg10 - 81, var65, class290.field3732, class458.field6407);
                                    if (class643.field8874) {
                                        class458.field6407.method81(var18, var19, var12.field6566 + var18, var12.field6514 + var19);
                                    }
                                    if (var12.field6541) {
                                        if (var12.field6464) {
                                            var65.method1375(class290.field3732, null, var12.field6573, 1);
                                        } else {
                                            var65.method1351(class290.field3732, null, 1);
                                            if (var12.field6475 != null) {
                                                class458.field6407.method102(var12.field6475.method2545());
                                            }
                                        }
                                    } else if (var12.field6464) {
                                        var65.method1375(class290.field3732, null, var12.field6573 << 2, 1);
                                    } else {
                                        var65.method1351(class290.field3732, null, 1);
                                        if (var12.field6475 != null) {
                                            class458.field6407.method102(var12.field6475.method2545());
                                        }
                                    }
                                    if (class643.field8874) {
                                        class458.field6407.method131(arg4, arg3, arg0, arg2);
                                    }
                                    if (var12.field6503) {
                                        class458.field6407.method129(true);
                                    }
                                }
                                if (class107.field1323) {
                                    if (arg7) {
                                        class365.method2249(true, var16, var14, var15, var13);
                                    } else {
                                        class534.method3038(var13, var15, var14, (byte) -69, var16);
                                    }
                                }
                            } else if (var12.field6483 == 9) {
                                int var84;
                                int var85;
                                int var86;
                                int var87;
                                if (var12.field6531) {
                                    var84 = var12.field6566 + var18;
                                    var87 = var18;
                                    var85 = var19;
                                    var86 = var12.field6514 + var19;
                                } else {
                                    var84 = var12.field6566 + var18;
                                    var85 = var19 + var12.field6514;
                                    var86 = var19;
                                    var87 = var18;
                                }
                                if (var12.field6535 == 1) {
                                    class458.field6407.method134(var87, var86, var84, var85, var12.field6569, 0);
                                } else {
                                    class458.field6407.method74(var87, var86, var84, var85, var12.field6569, var12.field6535, 0);
                                }
                                if (class107.field1323) {
                                    if (arg7) {
                                        class365.method2249(true, var16, var14, var15, var13);
                                    } else {
                                        class534.method3038(var13, var15, var14, (byte) -69, var16);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ldh;ILkha;)V")
    public class90(class286 arg0, int arg1, class687 arg2) {
        this.field1145 = arg2;
        this.field1139 = this.field1145.method3812(0, 19);
    }
}
