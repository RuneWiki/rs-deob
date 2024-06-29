import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class208 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Loe;")
    public static class139 field3995 = new class139(64);

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field4002 = 0;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Ljd;")
    public static class92 field4001 = class202.method1325((byte) 90, "Einloggen");

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Ljd;")
    private static class92 field3999 = class202.method1325((byte) 90, "No response from server)3");

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Ljd;")
    public static class92 field3997 = field3999;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lqa;")
    public static class153 field4000;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    public static int[] field3992;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static final void method1350(int arg0) {
        field3994++;
        if (arg0 < 119) {
            method1351(100);
        }
        if (class61.field1265 == 138) {
            int var1 = class185.field3497.method425((byte) -101);
            int var2 = class185.field3497.method418(82);
            int var3 = (var2 & 0x7) + class195.field3808;
            int var4 = (var2 >> 4 & 0x7) + class102.field2100;
            int var5 = class185.field3497.method425((byte) -101);
            if (var4 >= 0 && var3 >= 0 && var4 < 104 && var3 < 104) {
                class87 var6 = new class87();
                var6.field1719 = var1;
                var6.field1725 = var5;
                if (class136.field2725[class81.field1639][var4][var3] == null) {
                    class136.field2725[class81.field1639][var4][var3] = new class18();
                }
                class136.field2725[class81.field1639][var4][var3].method101(var6, (byte) -73);
                class165.method1073(var3, var4, false);
            }
        } else if (class61.field1265 == 211) {
            int var7 = class185.field3497.method443(255);
            int var8 = (var7 >> 4 & 0x7) + class102.field2100;
            int var9 = class195.field3808 + (var7 & 0x7);
            int var10 = class185.field3497.method442(-21351);
            int var11 = class185.field3497.method442(-21351);
            int var12 = class185.field3497.method442(-21351);
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class18 var13 = class136.field2725[class81.field1639][var8][var9];
                if (var13 != null) {
                    for (class87 var14 = (class87) var13.method103(57); var14 != null; var14 = (class87) var13.method100(-49)) {
                        if ((var10 & 0x7FFF) == var14.field1725 && var14.field1719 == var11) {
                            var14.field1719 = var12;
                            break;
                        }
                    }
                    class165.method1073(var9, var8, false);
                }
            }
        } else if (class61.field1265 == 19) {
            int var15 = class185.field3497.method443(255);
            int var16 = (var15 >> 4 & 0x7) + class102.field2100;
            int var17 = class195.field3808 + (var15 & 0x7);
            int var18 = class185.field3497.method431(-12469) + var16;
            int var19 = var17 + class185.field3497.method431(-12469);
            int var20 = class185.field3497.method417((byte) -118);
            int var21 = class185.field3497.method442(-21351);
            int var22 = class185.field3497.method443(255) * 4;
            int var23 = class185.field3497.method443(255) * 4;
            int var24 = class185.field3497.method442(-21351);
            int var25 = class185.field3497.method442(-21351);
            int var26 = class185.field3497.method443(255);
            int var27 = class185.field3497.method443(255);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var21 != 65535) {
                int var28 = var18 * 128 + 64;
                int var29 = var19 * 128 + 64;
                int var30 = var17 * 128 + 64;
                int var31 = var16 * 128 + 64;
                class35 var32 = new class35(var21, class81.field1639, var31, var30, class118.method804(var31, class81.field1639, var30, 0) - var22, var24 - -class158.field3150, class158.field3150 + var25, var26, var27, var20, var23);
                var32.method227(var28, class118.method804(var28, class81.field1639, var29, 0) - var23, class158.field3150 + var24, var29, (byte) 118);
                class32.field725.method101(var32, (byte) -101);
            }
        } else {
            if (class61.field1265 == 93) {
                int var33 = class185.field3497.method443(255);
                int var34 = class102.field2100 + (var33 >> 4 & 0x7);
                int var35 = (var33 & 0x7) + class195.field3808;
                int var36 = class185.field3497.method442(-21351);
                int var37 = class185.field3497.method443(255);
                int var38 = var37 >> 4 & 0xF;
                if (var36 == 65535) {
                    var36 = -1;
                }
                int var39 = var37 & 0x7;
                int var40 = class185.field3497.method443(255);
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                    int var41 = var38 + 1;
                    if (class15.field423.field233[0] >= var34 - var41 && var34 + var41 >= class15.field423.field233[0] && class15.field423.field198[0] >= var35 - var41 && class15.field423.field198[0] <= var35 + var41 && class136.field2730 != 0 && var39 > 0 && class64.field1308 < 50 && var36 != -1) {
                        class55.field1137[class64.field1308] = var36;
                        class75.field1568[class64.field1308] = var39;
                        class212.field4100[class64.field1308] = var40;
                        class6.field292[class64.field1308] = null;
                        class100.field2067[class64.field1308] = (var34 << 16) + (var35 << 8) + var38;
                        class64.field1308++;
                    }
                }
            }
            if (class61.field1265 == 193) {
                int var42 = class185.field3497.method418(94);
                int var43 = var42 >> 2;
                int var44 = class49.field1058[var43];
                int var45 = var42 & 0x3;
                int var46 = class185.field3497.method418(90);
                int var47 = (var46 >> 4 & 0x7) + class102.field2100;
                int var48 = (var46 & 0x7) + class195.field3808;
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                    class46.method288(class81.field1639, -1, -1, 0, var47, var45, var48, var43, var44, -39);
                }
            } else if (class61.field1265 == 71) {
                int var49 = class185.field3497.method442(-21351);
                int var50 = class185.field3497.method443(255);
                int var51 = class195.field3808 + (var50 & 0x7);
                int var52 = class102.field2100 + (var50 >> 4 & 0x7);
                int var53 = class185.field3497.method411(-44);
                int var54 = var53 & 0x3;
                int var55 = var53 >> 2;
                int var56 = class49.field1058[var55];
                if (var52 >= 0 && var51 >= 0 && var52 < 103 && var51 < 103) {
                    if (var56 == 0) {
                        class48 var57 = class189.method1216(class81.field1639, var52, var51);
                        if (var57 != null) {
                            int var58 = (int) (var57.field1056 >>> 32) & Integer.MAX_VALUE;
                            if (var55 == 2) {
                                var57.field1040 = new class34(var58, 2, var54 + 4, class81.field1639, var52, var51, var49, false, var57.field1040);
                                var57.field1053 = new class34(var58, 2, var54 + 1 & 0x3, class81.field1639, var52, var51, var49, false, var57.field1053);
                            } else {
                                var57.field1040 = new class34(var58, var55, var54, class81.field1639, var52, var51, var49, false, var57.field1040);
                            }
                        }
                    }
                    if (var56 == 1) {
                        class138 var59 = class97.method671(class81.field1639, var52, var51);
                        if (var59 != null) {
                            int var60 = Integer.MAX_VALUE & (int) (var59.field2759 >>> 32);
                            if (var55 == 4 || var55 == 5) {
                                var59.field2775 = new class34(var60, 4, var54, class81.field1639, var52, var51, var49, false, var59.field2775);
                            } else if (var55 == 6) {
                                var59.field2775 = new class34(var60, 4, var54 + 4, class81.field1639, var52, var51, var49, false, var59.field2775);
                            } else if (var55 == 7) {
                                var59.field2775 = new class34(var60, 4, (var54 + 2 & 0x3) + 4, class81.field1639, var52, var51, var49, false, var59.field2775);
                            } else if (var55 == 8) {
                                var59.field2775 = new class34(var60, 4, var54 + 4, class81.field1639, var52, var51, var49, false, var59.field2775);
                                var59.field2772 = new class34(var60, 4, (var54 + 2 & 0x3) + 4, class81.field1639, var52, var51, var49, false, var59.field2772);
                            }
                        }
                    }
                    if (var56 == 2) {
                        if (var55 == 11) {
                            var55 = 10;
                        }
                        class185 var61 = class198.method1316(class81.field1639, var52, var51);
                        if (var61 != null) {
                            var61.field3501 = new class34(Integer.MAX_VALUE & (int) (var61.field3495 >>> 32), var55, var54, class81.field1639, var52, var51, var49, false, var61.field3501);
                        }
                    }
                    if (var56 == 3) {
                        class28 var62 = class43.method274(class81.field1639, var52, var51);
                        if (var62 != null) {
                            var62.field633 = new class34(Integer.MAX_VALUE & (int) (var62.field632 >>> 32), 22, var54, class81.field1639, var52, var51, var49, false, var62.field633);
                        }
                    }
                }
            } else if (class61.field1265 == 174) {
                int var63 = class185.field3497.method425((byte) -101);
                int var64 = class185.field3497.method414((byte) -16);
                int var65 = class185.field3497.method425((byte) -101);
                int var66 = class185.field3497.method418(113);
                int var67 = class195.field3808 + (var66 & 0x7);
                int var68 = (var66 >> 4 & 0x7) + class102.field2100;
                if (var68 >= 0 && var67 >= 0 && var68 < 104 && var67 < 104 && class170.field3313 != var65) {
                    class87 var69 = new class87();
                    var69.field1719 = var64;
                    var69.field1725 = var63;
                    if (class136.field2725[class81.field1639][var68][var67] == null) {
                        class136.field2725[class81.field1639][var68][var67] = new class18();
                    }
                    class136.field2725[class81.field1639][var68][var67].method101(var69, (byte) 119);
                    class165.method1073(var67, var68, false);
                }
            } else if (class61.field1265 == 85) {
                int var70 = class185.field3497.method443(255);
                int var71 = class195.field3808 + (var70 & 0x7);
                int var72 = (var70 >> 4 & 0x7) + class102.field2100;
                int var73 = class185.field3497.method442(-21351);
                int var74 = class185.field3497.method443(255);
                int var75 = class185.field3497.method442(-21351);
                if (var72 >= 0 && var71 >= 0 && var72 < 104 && var71 < 104) {
                    int var76 = var72 * 128 + 64;
                    int var77 = var71 * 128 + 64;
                    class42 var78 = new class42(var73, class81.field1639, var76, var77, class118.method804(var76, class81.field1639, var77, 0) - var74, var75, class158.field3150);
                    class115.field2323.method101(var78, (byte) -5);
                }
            } else if (class61.field1265 == 7) {
                int var79 = class185.field3497.method461(-1);
                int var80 = (var79 >> 4 & 0x7) + class102.field2100;
                int var81 = (var79 & 0x7) + class195.field3808;
                int var82 = class185.field3497.method411(109);
                int var83 = var82 >> 2;
                int var84 = var82 & 0x3;
                int var85 = class49.field1058[var83];
                int var86 = class185.field3497.method465(255);
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    class46.method288(class81.field1639, var86, -1, 0, var80, var84, var81, var83, var85, -63);
                }
            } else {
                if (class61.field1265 == 160) {
                    int var87 = class185.field3497.method442(-21351);
                    byte var88 = class185.field3497.method431(-12469);
                    byte var89 = class185.field3497.method431(-12469);
                    byte var90 = class185.field3497.method434(0);
                    int var91 = class185.field3497.method461(-1);
                    int var92 = var91 >> 2;
                    int var93 = var91 & 0x3;
                    int var94 = class49.field1058[var92];
                    int var95 = class185.field3497.method442(-21351);
                    byte var96 = class185.field3497.method431(-12469);
                    int var97 = class185.field3497.method442(-21351);
                    int var98 = class185.field3497.method461(-1);
                    int var99 = (var98 & 0x7) + class195.field3808;
                    int var100 = (var98 >> 4 & 0x7) + class102.field2100;
                    int var101 = class185.field3497.method425((byte) -101);
                    class91 var102;
                    if (class170.field3313 == var97) {
                        var102 = class15.field423;
                    } else {
                        var102 = class172.field3347[var97];
                    }
                    if (var102 != null) {
                        class214 var103 = class126.method846(0, var101);
                        int var104;
                        int var105;
                        if (var93 == 1 || var93 == 3) {
                            var105 = var103.field4191;
                            var104 = var103.field4197;
                        } else {
                            var104 = var103.field4191;
                            var105 = var103.field4197;
                        }
                        int var106 = var99 + (var104 + 1 >> 1);
                        int var107 = (var105 >> 1) + var100;
                        int[][] var108 = class125.field2538[class81.field1639];
                        int var109 = (var105 + 1 >> 1) + var100;
                        int var110 = (var99 << 7) + (var104 << 6);
                        int var111 = var99 + (var104 >> 1);
                        int var112 = (var100 << 7) + (var105 << 6);
                        int var113 = var108[var107][var111] + var108[var109][var111] + var108[var107][var106] + var108[var109][var106] >> 2;
                        class38 var114 = var103.method1396(false, var93, var112, var110, var92, var113, var108);
                        if (var114 != null) {
                            class46.method288(class81.field1639, -1, var95 + 1, var87 + 1, var100, 0, var99, 0, var94, -51);
                            var102.field1790 = var95 + class158.field3150;
                            var102.field1787 = var100 * 128 + var105 * 64;
                            var102.field1806 = var99 * 128 + var104 * 64;
                            var102.field1800 = var114;
                            var102.field1795 = var113;
                            if (var88 < var96) {
                                byte var115 = var96;
                                var96 = var88;
                                var88 = var115;
                            }
                            var102.field1802 = var96 + var100;
                            var102.field1798 = class158.field3150 + var87;
                            if (var90 < var89) {
                                byte var116 = var89;
                                var89 = var90;
                                var90 = var116;
                            }
                            var102.field1788 = var100 + var88;
                            var102.field1792 = var89 + var99;
                            var102.field1784 = var90 + var99;
                        }
                    }
                }
                if (class61.field1265 == 163) {
                    int var117 = class185.field3497.method414((byte) -16);
                    int var118 = class185.field3497.method443(255);
                    int var119 = class195.field3808 + (var118 & 0x7);
                    int var120 = (var118 >> 4 & 0x7) + class102.field2100;
                    if (var120 >= 0 && var119 >= 0 && var120 < 104 && var119 < 104) {
                        class18 var121 = class136.field2725[class81.field1639][var120][var119];
                        if (var121 != null) {
                            for (class87 var122 = (class87) var121.method103(57); var122 != null; var122 = (class87) var121.method100(-49)) {
                                if ((var117 & 0x7FFF) == var122.field1725) {
                                    var122.method1370(122);
                                    break;
                                }
                            }
                            if (var121.method103(57) == null) {
                                class136.field2725[class81.field1639][var120][var119] = null;
                            }
                            class165.method1073(var119, var120, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method1351(int arg0) {
        field4000 = null;
        field3992 = null;
        field3997 = null;
        field3999 = null;
        field3995 = null;
        if (arg0 == -1) {
            field4001 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method1352(int arg0, int arg1) {
        field3991++;
        class205.field3953 += arg1 * 128;
        short var2 = 256;
        if (class205.field3953 > class93.field1888.length) {
            class205.field3953 -= class93.field1888.length;
            int var3 = (int) (Math.random() * 12.0D);
            class168.method1113(class43.field973[var3], -125);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        if (arg0 != -21983) {
            method1350(-78);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class138.field2773[var4 + var5] - class93.field1888[class93.field1888.length - 1 & class205.field3953 + var4] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class138.field2773[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class138.field2773[var24 + var25] = 255;
                } else {
                    class138.field2773[var25 + var24] = 0;
                }
            }
        }
        if (class130.field2619 > 0) {
            class130.field2619 -= arg1 * 4;
        }
        if (class49.field1057 > 0) {
            class49.field1057 -= arg1 * 4;
        }
        if (class130.field2619 == 0 && class49.field1057 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 1) {
                class49.field1057 = 1024;
            }
            if (var9 == 0) {
                class130.field2619 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class40.field907[var10] = class40.field907[var10 + arg1];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class40.field907[var11] = (int) (Math.sin((double) class166.field3262 / 14.0D) * 16.0D + Math.sin((double) class166.field3262 / 15.0D) * 14.0D + Math.sin((double) class166.field3262 / 16.0D) * 12.0D);
            class166.field3262++;
        }
        class43.field978 += arg1;
        int var12 = ((class158.field3150 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class43.field978 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class138.field2773[var22 + (var23 << 7)] = 192;
        }
        class43.field978 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class138.field2773[var12 + var19 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class138.field2773[var19 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class187.field3534[var21 + var19] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class187.field3534[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class187.field3534[var15 + var18 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class138.field2773[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljd;Lnh;ILjd;Lnh;)Lei;")
    public static final class50 method1353(class92 arg0, class133 arg1, int arg2, class92 arg3, class133 arg4) {
        field3990++;
        if (arg2 == 0) {
            int var5 = arg1.method880(arg0, false);
            int var6 = arg1.method881(var5, 1, arg3);
            return class65.method390(-74, var5, arg4, arg1, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIIILa;)V")
    public static final void method1354(boolean arg0, int arg1, int arg2, int arg3, class1 arg4) {
        field3993++;
        if (class137.field2750 >= 3) {
            class163.method1042(arg1, arg3, 0, arg4.field115, arg4.field26);
        } else {
            class100.field2056.method1088(arg1, arg3, arg4.field96, arg4.field28, class100.field2056.field3276 / 2, class100.field2056.field3275 / 2, class9.field327, 256, arg4.field115, arg4.field26);
        }
        class42.field942[arg2] = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public static final void method1355() {
        int var0 = class33.field739[class133.field2661];
        class13[] var1 = class33.field753[class133.field2661];
        class165.field3255 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class13 var3 = var1[var2];
            if (var3.field394 == 1) {
                int var4 = var3.field387 + class155.field3088 - class111.field2266;
                if (var4 >= 0 && var4 <= class155.field3088 + class155.field3088) {
                    int var5 = var3.field378 + class155.field3088 - class70.field1447;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field393 + class155.field3088 - class70.field1447;
                    if (var6 > class155.field3088 + class155.field3088) {
                        var6 = class155.field3088 + class155.field3088;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class151.field2993[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class129.field2601 - var3.field392;
                        if (var8 > 32) {
                            var3.field381 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field381 = 2;
                            var8 = -var8;
                        }
                        var3.field382 = (var3.field389 - class92.field1829 << 8) / var8;
                        var3.field388 = (var3.field380 - class92.field1829 << 8) / var8;
                        var3.field385 = (var3.field379 - class99.field2020 << 8) / var8;
                        var3.field390 = (var3.field395 - class99.field2020 << 8) / var8;
                        class207.field3980[class165.field3255++] = var3;
                    }
                }
            } else if (var3.field394 == 2) {
                int var9 = var3.field378 + class155.field3088 - class70.field1447;
                if (var9 >= 0 && var9 <= class155.field3088 + class155.field3088) {
                    int var10 = var3.field387 + class155.field3088 - class111.field2266;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field391 + class155.field3088 - class111.field2266;
                    if (var11 > class155.field3088 + class155.field3088) {
                        var11 = class155.field3088 + class155.field3088;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class151.field2993[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class92.field1829 - var3.field389;
                        if (var13 > 32) {
                            var3.field381 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field381 = 4;
                            var13 = -var13;
                        }
                        var3.field386 = (var3.field392 - class129.field2601 << 8) / var13;
                        var3.field377 = (var3.field374 - class129.field2601 << 8) / var13;
                        var3.field385 = (var3.field379 - class99.field2020 << 8) / var13;
                        var3.field390 = (var3.field395 - class99.field2020 << 8) / var13;
                        class207.field3980[class165.field3255++] = var3;
                    }
                }
            } else if (var3.field394 == 4) {
                int var14 = var3.field379 - class99.field2020;
                if (var14 > 128) {
                    int var15 = var3.field378 + class155.field3088 - class70.field1447;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field393 + class155.field3088 - class70.field1447;
                    if (var16 > class155.field3088 + class155.field3088) {
                        var16 = class155.field3088 + class155.field3088;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field387 + class155.field3088 - class111.field2266;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field391 + class155.field3088 - class111.field2266;
                        if (var18 > class155.field3088 + class155.field3088) {
                            var18 = class155.field3088 + class155.field3088;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class151.field2993[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field381 = 5;
                            var3.field386 = (var3.field392 - class129.field2601 << 8) / var14;
                            var3.field377 = (var3.field374 - class129.field2601 << 8) / var14;
                            var3.field382 = (var3.field389 - class92.field1829 << 8) / var14;
                            var3.field388 = (var3.field380 - class92.field1829 << 8) / var14;
                            class207.field3980[class165.field3255++] = var3;
                        }
                    }
                }
            }
        }
    }
}
