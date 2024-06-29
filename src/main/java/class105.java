import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class105 extends class214 {

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    private int field1504 = 6;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "Lfc;")
    public static class343 field1509;

    static {
        new class112("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method11(int arg0, byte arg1) {
        ++field1506;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            this.method14((byte) 125, 25);
        }
        if (super.field3030.field6644) {
            int[][] var4 = this.method1354(0, arg0, (byte) 23);
            int[][] var5 = this.method1354(1, arg0, (byte) 23);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1504;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class399.field5585; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var20 + var21 + -(var20 * var21 >> 11);
                                                                var7[var16] = var17 + var22 + -(var17 * var22 >> 11);
                                                                var8[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class399.field5585 > var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var27 < var26 ? var26 - var27 : -var26 + var27;
                                                            var7[var23] = ~var28 <= ~var24 ? -var24 + var28 : -var28 + var24;
                                                            var8[var23] = ~var25 <= ~var29 ? -var29 + var25 : -var25 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class399.field5585 > var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = ~var31 > ~var32 ? var32 : var31;
                                                        var7[var30] = var34 <= var35 ? var35 : var34;
                                                        var8[var30] = var33 <= var36 ? var36 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class399.field5585 > var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = ~var40 <= ~var41 ? var41 : var40;
                                                    var7[var37] = var38 <= var42 ? var38 : var42;
                                                    var8[var37] = var43 > var39 ? var39 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class399.field5585 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = ~var47 == -1 ? 0 : 4096 - (-var13[var44] + 4096 << 12) / var47;
                                                var8[var44] = var46 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class399.field5585 < ~var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var49 != 4096 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = ~var50 != -4097 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class399.field5585; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((4096 - var10[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class399.field5585 > var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class399.field5585; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class399.field5585 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class399.field5585; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class399.field5585; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIZII)V", line = 323)
    public static final void method668(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field1507;
        if (class56.method431(12449, arg3)) {
            if (!arg0) {
                field1509 = null;
            }
            class389.method2318(class39.field666[arg3], -1, arg2, (byte) -67, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 338)
    public static final void method669(int arg0, Object[] arg1, long[] arg2) {
        int var3 = 109 / ((arg0 - 67) / 41);
        class343.method2055(arg1, arg2.length + -1, (byte) 108, 0, arg2);
        ++field1511;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Llk;II)V", line = 348)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field1512;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3032 = arg0.method2503(true) == 1;
            }
        } else {
            this.field1504 = arg0.method2503(true);
        }
        if (arg1 >= -114) {
            method669(-3, (Object[]) null, (long[]) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 384)
    public static void method670(byte arg0) {
        field1509 = null;
        if (arg0 >= -47) {
            field1508 = -93;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[Lms;BIIIIIII)V", line = 395)
    public static final void method671(int arg0, class363[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1510;
        int var10 = -71 / ((-28 - arg2) / 35);
        class338.field4636.method1094(arg8, arg0, arg4, arg3);
        for (int var11 = 0; var11 < arg1.length; ++var11) {
            class363 var12 = arg1[var11];
            if (var12 != null && (~var12.field5062 == ~arg9 || ~arg9 == 1412584498 && class146.field2070 == var12)) {
                int var13;
                if (~arg6 == 0) {
                    class180.field2611[class417.field5736].setBounds(var12.field5145 - -arg5, var12.field5183 + arg7, var12.field5101, var12.field5200);
                    var13 = class417.field5736++;
                } else {
                    var13 = arg6;
                }
                var12.field5202 = var13;
                var12.field5136 = class356.field4972;
                if (!client.method2331(var12)) {
                    if (var12.field5080 != 0) {
                        class473.method2776(var12, (byte) -76);
                    }
                    int var14 = var12.field5145 - -arg5;
                    int var15 = var12.field5183 + arg7;
                    int var16 = var12.field5142;
                    if (class443.field6112 && (~client.method2321(var12).field995 != -1 || var12.field5093 == 0) && ~var16 < -128) {
                        var16 = 127;
                    }
                    if (class146.field2070 == var12) {
                        if (arg9 != -1412584499 && (~class167.field2456 == ~var12.field5194 || class31.field506 == var12.field5194)) {
                            class345.field4721 = arg7;
                            class374.field5297 = arg1;
                            class393.field5530 = arg5;
                            continue;
                        }
                        if (class195.field2769 && class235.field3328) {
                            int var17 = class56.field902.method1301(13820);
                            int var18 = class56.field902.method1305(255);
                            int var19 = var17 - class465.field6532;
                            int var20 = var18 - class106.field1516;
                            if (class317.field4305 > var19) {
                                var19 = class317.field4305;
                            }
                            if (var20 < class381.field5402) {
                                var20 = class381.field5402;
                            }
                            if (class317.field4305 + class128.field1819.field5101 < var19 - -var12.field5101) {
                                var19 = class317.field4305 - var12.field5101 + class128.field1819.field5101;
                            }
                            if (class381.field5402 + class128.field1819.field5200 < var12.field5200 + var20) {
                                var20 = -var12.field5200 + class128.field1819.field5200 + class381.field5402;
                            }
                            var14 = var19;
                            var15 = var20;
                        }
                        if (~class31.field506 == ~var12.field5194) {
                            var16 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    if (var12.field5093 == 2) {
                        var21 = arg4;
                        var22 = arg8;
                        var23 = arg0;
                        var24 = arg3;
                    } else {
                        int var25 = var12.field5101 + var14;
                        int var26 = var12.field5200 + var15;
                        var22 = var14 <= arg8 ? arg8 : var14;
                        var23 = arg0 >= var15 ? arg0 : var15;
                        if (~var12.field5093 == -10) {
                            ++var25;
                            ++var26;
                        }
                        var21 = ~var25 > ~arg4 ? var25 : arg4;
                        var24 = arg3 > var26 ? var26 : arg3;
                    }
                    if (var22 < var21 && var24 > var23) {
                        if (~var12.field5080 != -1) {
                            if (class272.field3775 == var12.field5080 || ~class254.field3553 == ~var12.field5080) {
                                class99.method631((byte) -53, var12.field5101, var14, var15, var12.field5200, ~class254.field3553 == ~var12.field5080);
                                class127.field1809[var13] = true;
                                class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                continue;
                            }
                            if (~class37.field639 == ~var12.field5080) {
                                if (var12.method2198(class338.field4636, 0) != null) {
                                    class172.method1155(15547);
                                    class167.method1029(30610, var14, var15, class338.field4636, var12);
                                    class258.field3607[var13] = true;
                                    class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                }
                                continue;
                            }
                            if (class419.field5753 == var12.field5080) {
                                if (var12.method2198(class338.field4636, 0) != null) {
                                    class295.method1824(var12, var14, var15, false);
                                    class258.field3607[var13] = true;
                                    class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                }
                                continue;
                            }
                            if (class460.field6484 == var12.field5080) {
                                class42.method353(-65537, class19.field315, var12.field5101, class338.field4636, var14, var12.field5200, var15);
                                class127.field1809[var13] = true;
                                class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                continue;
                            }
                            if (class172.field2555 == var12.field5080) {
                                class314.method1896(var15, var14, var12.field5101, -22653, var12.field5200, class338.field4636);
                                class127.field1809[var13] = true;
                                class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                continue;
                            }
                            if (class117.field1647 == var12.field5080) {
                                if (!class321.field4385 && !class243.field3446) {
                                    continue;
                                }
                                int var27 = var12.field5101 + var14;
                                int var28 = var15 - -15;
                                if (class321.field4385) {
                                    class262.field3662.method2838("Fps:" + class126.field1735, -1, var27, 0, var28, -256);
                                    var28 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (~var30 < -65537) {
                                        var31 = -65536;
                                    }
                                    class262.field3662.method2838("Mem:" + var30 + "k", -1, var27, 0, var28, var31);
                                    var28 += 15;
                                    class262.field3662.method2838("In:" + class355.field4953 + "B/s Out:" + class235.field3327 + "B/s", -1, var27, 0, var28, -256);
                                    var28 += 15;
                                    int var32 = class338.field4636.method1112() / 1024;
                                    class262.field3662.method2838("Offheap:" + var32 + "k", -1, var27, 0, var28, ~var32 >= -65537 ? -256 : -65536);
                                    var28 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 29; ++var36) {
                                        var33 += class55.field901[var36].method829((byte) -65);
                                        var34 += class55.field901[var36].method835((byte) 75);
                                        var35 += class55.field901[var36].method824(18301);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + method672((long) var38, 2, -29245, true, 0) + "% (" + var37 + "%)";
                                    class96.field1381.method2838(var39, -1, var27, 0, var28, -256);
                                    var28 += 12;
                                }
                                if (class197.field2833 > 0) {
                                    class96.field1381.method2838("Particles: " + class159.field2300 + " / " + class197.field2833, -1, var27, 0, var28, -256);
                                }
                                var28 += 12;
                                if (class243.field3446) {
                                    class96.field1381.method2838("Polys: " + class338.field4636.method1084() + " Models: " + class338.field4636.method1128(), -1, var27, 0, var28, -256);
                                    var28 += 12;
                                    class96.field1381.method2838("Ls: " + class130.field1833 + " La: " + class139.field1986 + " NPC: " + class132.field1863 + " Pl: " + class99.field1402, -1, var27, 0, var28, -256);
                                    var28 += 12;
                                    class70.method492(6);
                                }
                                class127.field1809[var13] = true;
                                continue;
                            }
                        }
                        if (~var12.field5093 == -1) {
                            if (~class121.field1695 == ~var12.field5080 && class338.field4636.method1096()) {
                                class338.field4636.method1127(var14, var15, var12.field5101, var12.field5200);
                            }
                            method671(var23, arg1, (byte) 37, var24, var21, -var12.field5111 + var14, var13, -var12.field5186 + var15, var22, var12.field5096);
                            if (var12.field5113 != null) {
                                method671(var23, var12.field5113, (byte) 22, var24, var21, -var12.field5111 + var14, var13, -var12.field5186 + var15, var22, var12.field5096);
                            }
                            class465 var40 = (class465) class231.field3258.method2614((long) var12.field5096, 55);
                            if (var40 != null) {
                                class35.method280((byte) 42, var21, var24, var22, var23, var13, var14, var40.field6527, var15);
                            }
                            if (class121.field1695 == var12.field5080 && class338.field4636.method1096()) {
                                class338.field4636.method1058();
                                class485.field6852 = true;
                            }
                            class338.field4636.method1094(arg8, arg0, arg4, arg3);
                        }
                        if (class180.field2613[var13] || class365.field5208 > 1) {
                            if (var12.field5093 == 3) {
                                if (~var16 != -1) {
                                    if (!var12.field5091) {
                                        class338.field4636.method1076(var14, var15, var12.field5101, var12.field5200, 16777215 & var12.field5095 | -(255 & var16) + 255 << 24, 1);
                                    } else {
                                        class338.field4636.method1107(var14, var15, var12.field5101, var12.field5200, -(var16 & 255) + 255 << 24 | 16777215 & var12.field5095, 1);
                                    }
                                } else if (!var12.field5091) {
                                    class338.field4636.method1076(var14, var15, var12.field5101, var12.field5200, var12.field5095, 0);
                                } else {
                                    class338.field4636.method1107(var14, var15, var12.field5101, var12.field5200, var12.field5095, 0);
                                }
                            } else if (~var12.field5093 == -5) {
                                class485 var41 = var12.method2205(26666, class338.field4636);
                                if (var41 == null) {
                                    if (class204.field2931) {
                                        class356.method2141(-97, var12);
                                    }
                                } else {
                                    int var42 = var12.field5095;
                                    String var43 = var12.field5123;
                                    if (var12.field5195 != -1) {
                                        class164 var44 = class58.field918.method344(var12.field5195, 31757);
                                        var43 = var44.field2374;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((var44.field2401 == 1 || var12.field5175 != 1) && var12.field5175 != -1) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class280.method1749(var12.field5175, -126);
                                        }
                                    }
                                    if (class422.field5806 == var12) {
                                        var43 = class438.field6011.method695(-124, class487.field6867);
                                        var42 = var12.field5095;
                                    }
                                    if (class244.field3449) {
                                        class338.field4636.method1117(var14, var15, var12.field5101 + var14, var12.field5200 + var15);
                                    }
                                    var41.method2844(0, var15, var12.field5089, var12.field5131, var12.field5200, var12.field5082, (class90) null, var14, var12.field5151 ? -(var16 & 255) + 255 << 24 : -1, -122, var43, 0, var12.field5101, -(var16 & 255) + 255 << 24 | var42, (int[]) null, class145.field2027);
                                    if (class244.field3449) {
                                        class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                    }
                                }
                            } else if (~var12.field5093 == -6) {
                                if (var12.field5103 < 0) {
                                    class385 var46;
                                    if (var12.field5195 != -1) {
                                        class15 var45 = !var12.field5182 ? null : class2.field21.field400;
                                        var46 = class58.field918.method346(var12.field5175, (byte) 102, -16777216 | var12.field5059, var12.field5063, class338.field4636, var45, var12.field5071, var12.field5195);
                                    } else {
                                        var46 = var12.method2209(class338.field4636, 98);
                                    }
                                    if (var46 == null) {
                                        if (class204.field2931) {
                                            class356.method2141(-114, var12);
                                        }
                                    } else {
                                        int var47 = var46.method382();
                                        int var48 = var46.method389();
                                        if (!var12.field5137) {
                                            if (~var16 != -1) {
                                                int var49 = 16777215 | -(var16 & 255) + 255 << 24;
                                                if (var12.field5146 != 0) {
                                                    var46.method2299((float) var12.field5101 / 2.0F + (float) var14, (float) var12.field5200 / 2.0F + (float) var15, var12.field5101 * 4096 / var47, var12.field5146, 1, var49, 1);
                                                } else if (var12.field5101 == var47 && ~var12.field5200 == ~var48) {
                                                    var46.method385(var14, var15, 1, var49, 1);
                                                } else {
                                                    var46.method384(var14, var15, var12.field5101, var12.field5200, 1, var49, 1);
                                                }
                                            } else if (var12.field5146 == 0) {
                                                if (var12.field5101 == var47 && var12.field5200 == var48) {
                                                    var46.method2301(var14, var15);
                                                } else {
                                                    var46.method2297(var14, var15, var12.field5101, var12.field5200);
                                                }
                                            } else {
                                                var46.method2298((float) var12.field5101 / 2.0F + (float) var14, (float) var12.field5200 / 2.0F + (float) var15, var12.field5101 * 4096 / var47, var12.field5146);
                                            }
                                        } else {
                                            class338.field4636.method1117(var14, var15, var14 - -var12.field5101, var12.field5200 + var15);
                                            if (~var12.field5146 != -1) {
                                                int var50 = (-1 - (-var47 - var12.field5101)) / var47;
                                                int var51 = (var48 - (1 - var12.field5200)) / var48;
                                                for (int var52 = 0; var52 < var50; ++var52) {
                                                    for (int var53 = 0; ~var51 < ~var53; ++var53) {
                                                        var46.method2298((float) var47 / 2.0F + (float) (var47 * var52 + var14), (float) var48 / 2.0F + (float) (var48 * var53 + var15), 4096, var12.field5146);
                                                    }
                                                }
                                            } else if (~var16 != -1) {
                                                var46.method383(var14, var15, var12.field5101, var12.field5200, 1, 16777215 | -(255 & var16) + 255 << 24, 1);
                                            } else {
                                                var46.method383(var14, var15, var12.field5101, var12.field5200, 0, 0, 1);
                                            }
                                            class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                        }
                                    }
                                } else {
                                    var12.method2203(class487.field6864, 0, class191.field2725).method852(var12.field5200, var15, var12.field5076 << 3, var14, var12.field5081 << 3, class338.field4636, 0, var12.field5101, (byte) -120, 0);
                                }
                            } else if (var12.field5093 != 6) {
                                if (var12.field5093 == 9) {
                                    int var73;
                                    int var74;
                                    int var75;
                                    int var76;
                                    if (var12.field5090) {
                                        var73 = var15;
                                        var74 = var12.field5101 + var14;
                                        var75 = var12.field5200 + var15;
                                        var76 = var14;
                                    } else {
                                        var73 = var12.field5200 + var15;
                                        var74 = var12.field5101 + var14;
                                        var75 = var15;
                                        var76 = var14;
                                    }
                                    if (~var12.field5050 == -2) {
                                        class338.field4636.method1120(var76, var75, var74, var73, var12.field5095, 0);
                                    } else {
                                        class338.field4636.method1062(var76, var75, var74, var73, var12.field5095, var12.field5050, 0);
                                    }
                                }
                            } else {
                                class127.method777(-1);
                                class232 var54 = null;
                                int var55 = 0;
                                if (~var12.field5195 == 0) {
                                    if (~var12.field5143 != -6) {
                                        if (var12.field5143 != 8 && var12.field5143 != 9) {
                                            if (var12.field5121 != -1) {
                                                class372 var56 = class31.field505.method950(true, var12.field5121);
                                                var54 = var12.method2199(class467.field6550, var12.field5152, var12.field5172, 1024, var56, class2.field21.field400, class31.field505, false, class338.field4636, class320.field4376, class393.field5529, class363.field5161, class58.field918, var12.field5045);
                                                if (var54 == null && class204.field2931) {
                                                    class356.method2141(-75, var12);
                                                }
                                            } else {
                                                var54 = var12.method2199(class467.field6550, -1, -1, 1024, (class372) null, class2.field21.field400, class31.field505, false, class338.field4636, class320.field4376, class393.field5529, class363.field5161, class58.field918, 0);
                                                if (var54 == null && class204.field2931) {
                                                    class356.method2141(-78, var12);
                                                }
                                            }
                                        } else {
                                            class459 var57 = class27.method228((byte) -101, false, var12.field5154);
                                            class372 var58 = ~var12.field5121 != 0 ? class31.field505.method950(true, var12.field5121) : null;
                                            if (var57 != null) {
                                                class15 var59 = !var12.field5182 ? null : class2.field21.field400;
                                                var54 = var57.method2713(var12.field5045, var12.field5152, var58, class338.field4636, var12.field5143 == 9, var12.field5172, var12.field5055, var59, 1024, (byte) -126);
                                            }
                                        }
                                    } else {
                                        int var60 = var12.field5154;
                                        if (~var60 <= -1 && var60 < 2048) {
                                            class23 var61 = class310.field4235[var60];
                                            class372 var62 = ~var12.field5121 == 0 ? null : class31.field505.method950(true, var12.field5121);
                                            if (var61 != null && (class327.field4523 == var60 || class161.method973(var61.field407, -32435) == var12.field5055)) {
                                                var54 = var61.field400.method151(0, 1024, class393.field5529, class467.field6550, class58.field918, class31.field505, var12.field5152, 0, (class60[]) null, var62, -1, (class372) null, 1073741823, class320.field4376, class363.field5161, var12.field5172, class338.field4636, var12.field5045, true);
                                            }
                                        }
                                    }
                                } else {
                                    class164 var63 = class58.field918.method344(var12.field5195, 31757);
                                    if (var63 != null) {
                                        class164 var64 = var63.method1007(-122, var12.field5175);
                                        class372 var65 = var12.field5121 == -1 ? null : class31.field505.method950(true, var12.field5121);
                                        class15 var66 = !var12.field5182 ? null : class2.field21.field400;
                                        var54 = var64.method1013(var12.field5152, 1024, 1, class338.field4636, var66, var12.field5045, var12.field5172, (byte) -61, var65);
                                        if (var54 == null) {
                                            class356.method2141(-69, var12);
                                        } else {
                                            var55 = -var54.method55() / 2;
                                        }
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (~var12.field5060 >= -1) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var12.field5101 << 9) / var12.field5060;
                                    }
                                    int var68;
                                    if (var12.field5106 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var12.field5200 << 9) / var12.field5106;
                                    }
                                    int var69 = (var12.field5169 * var67 >> 9) + var14 - -(var12.field5101 / 2);
                                    int var70 = (var12.field5051 * var68 >> 9) + (var15 - -(var12.field5200 / 2));
                                    class126.field1740.method1388();
                                    class338.field4636.method1071(class126.field1740);
                                    int var71 = class432.field5955[var12.field5075 << 3] * var12.field5126 >> 15;
                                    int var72 = class432.field5957[var12.field5075 << 3] * var12.field5126 >> 15;
                                    class338.field4636.method1079(var69, var70, var67, var68);
                                    class338.field4636.method1144((float) var12.field5067, var12.field5120 ? (float) var12.field5117 : (float) var12.field5117 * 1.5F);
                                    if (arg9 == -1412584499 || class485.field6852) {
                                        class338.field4636.method1137();
                                        class338.field4636.method1111();
                                        class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                        class485.field6852 = false;
                                    }
                                    if (var12.field5061) {
                                        class338.field4636.method1108(false);
                                    }
                                    class262.field3661.method1384(-var12.field5164 << 3);
                                    class262.field3661.method1378(var12.field5108 << 3);
                                    class262.field3661.method1380(var12.field5097, var71 - -var55 + var12.field5046, var12.field5046 + var72);
                                    class262.field3661.method1374(var12.field5075 << 3);
                                    if (class244.field3449) {
                                        class338.field4636.method1117(var14, var15, var14 - -var12.field5101, var12.field5200 + var15);
                                    }
                                    if (!var12.field5120) {
                                        var54.method41(class262.field3661, (class219) null, 1);
                                    } else {
                                        var54.method45(class262.field3661, (class219) null, var12.field5126, 1);
                                    }
                                    if (class244.field3449) {
                                        class338.field4636.method1094(arg8, arg0, arg4, arg3);
                                    }
                                    if (var12.field5061) {
                                        class338.field4636.method1108(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 1390)
    public class105() {
        super(2, false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JIIZI)Ljava/lang/String;", line = 1049)
    public static final String method672(long arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field1505;
        char var6 = ',';
        char var7 = '.';
        if (~arg4 == -1) {
            var6 = '.';
            var7 = ',';
        }
        if (arg4 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg1 < -1) {
            for (int var10 = 0; arg1 > var10; ++var10) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (-((int) arg0 * 10) + 48 - -var11));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (-((int) arg0 * 10) + 48 + var13));
            if (arg0 == 0L) {
                if (arg2 != -29245) {
                    return null;
                }
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)[I", line = 1140)
    public final int[] method14(byte arg0, int arg1) {
        ++field1502;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            field1509 = null;
        }
        if (super.field3024.field6135) {
            int[] var4 = this.method1352(arg1, 0, -30);
            int[] var5 = this.method1352(arg1, 1, -58);
            int var6 = this.field1504;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class399.field5585 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class399.field5585; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class399.field5585; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 < ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class399.field5585 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class399.field5585; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class399.field5585; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class399.field5585 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class399.field5585; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class399.field5585; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class399.field5585; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class399.field5585; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class399.field5585; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }
}
