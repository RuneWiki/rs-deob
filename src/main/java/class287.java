import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class287 extends class32 {

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "[Lid;")
    public class148[] field5115;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "Lc;")
    public static class105 field5122 = new class105(64);

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field5123 = 0;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "Lqk;")
    public static class207 field5126 = class24.method212(255, "<col=80ff00>");

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "Z")
    public static boolean field5125 = true;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Lpk;")
    public static class99 field5124;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "Lpk;")
    public static class99 field5128;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "[I")
    public static int[] field5127;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)Z")
    public final boolean method1956(int arg0, int arg1) {
        if (arg1 > -34) {
            method1961(84);
        }
        field5118++;
        return this.field5115[arg0].field2562;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lpk;I)V")
    public static final void method1957(class99 arg0, int arg1) {
        if (arg1 <= 13) {
            method1961(39);
        }
        field5114++;
        class283.field4972 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z[Lgi;Z)V")
    public static final void method1958(boolean arg0, class155[] arg1, boolean arg2) {
        field5121++;
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class271.field4791[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class271.field4791[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method1134(-18939, var6, var5);
                            }
                        }
                    }
                }
            }
            class57.field1058 += (int) (Math.random() * 5.0D) - 2;
            if (class57.field1058 < -16) {
                class57.field1058 = -16;
            }
            if (class57.field1058 > 16) {
                class57.field1058 = 16;
            }
            class5.field79 += (int) (Math.random() * 5.0D) - 2;
            if (class5.field79 < -8) {
                class5.field79 = -8;
            }
            if (class5.field79 > 8) {
                class5.field79 = 8;
            }
        }
        if (arg0) {
            return;
        }
        int var8 = class5.field79 >> 2 << 10;
        int var9 = class57.field1058 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class43.field855[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class163.field2881[var12][var100 + 1][var54] - class163.field2881[var12][var100 - 1][var54];
                    int var103 = class163.field2881[var12][var100][var54 + 1] - class163.field2881[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var106 * -10 + var105 * -50 + var107 * -50) / var53 + var101;
                    int var109 = (var51[var100][var54 - 1] >> 2) + (var51[var100][var54 + 1] >> 3) + (var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54] >> 1);
                    var11[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class131.field2268[var55] = 0;
                class282.field4961[var55] = 0;
                class278.field4881[var55] = 0;
                class133.field2316[var55] = 0;
                class217.field3850[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class163.field2875[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class11 var96 = class118.method841(var95 - 1, 1);
                            class131.field2268[var85] += var96.field151;
                            class282.field4961[var85] += var96.field160;
                            class278.field4881[var85] += var96.field157;
                            class133.field2316[var85] += var96.field156;
                            var10002 = class217.field3850[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class163.field2875[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class11 var99 = class118.method841(var98 - 1, 1);
                            class131.field2268[var85] -= var99.field151;
                            class282.field4961[var85] -= var99.field160;
                            class278.field4881[var85] -= var99.field157;
                            class133.field2316[var85] -= var99.field156;
                            var10002 = class217.field3850[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var90 += class133.field2316[var92];
                            var88 += class217.field3850[var92];
                            var89 += class278.field4881[var92];
                            var86 += class131.field2268[var92];
                            var87 += class282.field4961[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var90 -= class133.field2316[var93];
                            var88 -= class217.field3850[var93];
                            var87 -= class282.field4961[var93];
                            var89 -= class278.field4881[var93];
                            var86 -= class131.field2268[var93];
                        }
                        if (var91 >= 0 && var88 > 0) {
                            var10[var56][var91] = class188.method1315(var89 / var88, 1, var87 / var88, var86 * 256 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class212.method1512(-126) || (class271.field4791[0][var57][var58] & 0x2) != 0 || (class271.field4791[var12][var57][var58] & 0x10) == 0 && class126.method885(var57, var58, var12, -43) == class141.field2446) {
                        if (class32.field647 > var12) {
                            class32.field647 = var12;
                        }
                        int var59 = class163.field2875[var12][var57][var58] & 0xFF;
                        int var60 = class255.field4563[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class163.field2881[var12][var57][var58];
                            int var62 = class163.field2881[var12][var57 + 1][var58];
                            int var63 = class163.field2881[var12][var57 + 1][var58 + 1];
                            int var64 = class163.field2881[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class266.field4719[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class26.method216(4, var60 - 1).field4381) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class192.field3384[var12][var57][var58] = class281.method1906(class192.field3384[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var10[var57][var58];
                                int var67 = (var66 & 0x7F) + var9;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var66 & 0x380) + (var8 + var66 & 0xFC00) + var67;
                                var69 = class257.field4600[class70.method508(-1563918489, var68, 96)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58 + 1];
                            int var72 = var11[var57][var58 + 1];
                            int var73 = var11[var57 + 1][var58];
                            if (var60 == 0) {
                                class52.method400(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class70.method508(-1563918489, var66, var70), class70.method508(-1563918489, var66, var73), class70.method508(-1563918489, var66, var71), class70.method508(-1563918489, var66, var72), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class266.field4719[var12][var57][var58] + 1;
                                byte var75 = class92.field1632[var12][var57][var58];
                                class240 var76 = class26.method216(4, var60 - 1);
                                int var77 = var76.field4387;
                                if (var77 >= 0 && !class257.field4602.method346(var77, 0)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class257.field4600[class197.method1371(96, class257.field4602.method342(var77, 65535), (byte) -100)];
                                } else if (var76.field4385 == -1) {
                                    var78 = -2;
                                    var79 = 0;
                                } else {
                                    var78 = var76.field4385;
                                    int var80 = (var78 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var78 + var8 & 0xFC00) + (var78 & 0x380) + var80;
                                    var79 = class257.field4600[class197.method1371(96, var81, (byte) -68)];
                                }
                                if (var76.field4388 >= 0) {
                                    int var82 = var76.field4388;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 + var8 & 0xFC00) + (var82 & 0x380) + var83;
                                    var79 = class257.field4600[class197.method1371(96, var84, (byte) -124)];
                                }
                                class52.method400(var12, var57, var58, var74, var75, var77, var61, var62, var63, var64, class70.method508(-1563918489, var66, var70), class70.method508(-1563918489, var66, var73), class70.method508(-1563918489, var66, var71), class70.method508(-1563918489, var66, var72), class197.method1371(var70, var78, (byte) -117), class197.method1371(var73, var78, (byte) -127), class197.method1371(var71, var78, (byte) -48), class197.method1371(var72, var78, (byte) -82), var69, var79);
                            }
                        }
                    }
                }
            }
            class163.field2875[var12] = null;
            class255.field4563[var12] = null;
            class266.field4719[var12] = null;
            class92.field1632[var12] = null;
            class43.field855[var12] = null;
        }
        class197.method1370(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class271.field4791[1][var13][var50] & 0x2) == 2) {
                    class169.method1215(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class192.field3384[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var15;
                        while (var17 > 0 && (class192.field3384[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        while (var18 < 104 && (class192.field3384[var14][var16][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        int var19 = var14;
                        int var20 = var14;
                        label351: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class192.field3384[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label351;
                                }
                            }
                            var19--;
                        }
                        label340: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class192.field3384[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var20 - (var19 - 1)) * (var18 + 1 - var17);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class163.field2881[var20][var16][var17] - var24;
                            int var26 = class163.field2881[var19][var16][var17];
                            class275.method1865(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class192.field3384[var27][var16][var28] = class121.method860(class192.field3384[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class192.field3384[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30 = var16;
                        while (var29 < 104 && (class192.field3384[var14][var29 + 1][var15] & 0x2) != 0) {
                            var29++;
                        }
                        while (var30 > 0 && (class192.field3384[var14][var30 - 1][var15] & 0x2) != 0) {
                            var30--;
                        }
                        int var31 = var14;
                        int var32;
                        label405: for (var32 = var14; var32 > 0; var32--) {
                            for (int var33 = var30; var33 <= var29; var33++) {
                                if ((class192.field3384[var32 - 1][var33][var15] & 0x2) == 0) {
                                    break label405;
                                }
                            }
                        }
                        label394: while (var31 < 3) {
                            for (int var34 = var30; var34 <= var29; var34++) {
                                if ((class192.field3384[var31 + 1][var34][var15] & 0x2) == 0) {
                                    break label394;
                                }
                            }
                            var31++;
                        }
                        int var35 = (var29 + 1 - var30) * (var31 + 1 - var32);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class163.field2881[var31][var30][var15] - var36;
                            int var38 = class163.field2881[var32][var30][var15];
                            class275.method1865(2, var30 * 128, var29 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var32; var39 <= var31; var39++) {
                                for (int var40 = var30; var40 <= var29; var40++) {
                                    class192.field3384[var39][var40][var15] = class121.method860(class192.field3384[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class192.field3384[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class192.field3384[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class192.field3384[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label459: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class192.field3384[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var41--;
                        }
                        label448: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class192.field3384[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var42++;
                        }
                        if ((var42 - (var41 - 1)) * (var44 + 1 - var43) >= 4) {
                            int var47 = class163.field2881[var14][var41][var43];
                            class275.method1865(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class192.field3384[var14][var48][var49] = class121.method860(class192.field3384[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(BI)Z")
    public final boolean method1959(byte arg0, int arg1) {
        field5120++;
        if (arg0 != -48) {
            method1961(8);
        }
        return this.field5115[arg1].field2550;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lpk;Lpk;IZ)V")
    public class287(class99 arg0, class99 arg1, int arg2, boolean arg3) {
        class132 var5 = new class132();
        int var6 = arg0.method698(7, arg2);
        this.field5115 = new class148[var6];
        int[] var7 = arg0.method699(arg2, (byte) -2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class216 var9 = null;
            byte[] var10 = arg0.method705(arg2, var7[var8], -1);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class216 var12 = (class216) var5.method922((byte) 102); var12 != null; var12 = (class216) var5.method928(-99)) {
                if (var12.field3844 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method702(0, var11, -15265);
                } else {
                    var13 = arg1.method702(var11, 0, -15265);
                }
                var9 = new class216(var11, var13);
                var5.method931(var9, 112);
            }
            this.field5115[var7[var8]] = new class148(var10, var9);
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public static void method1960(int arg0) {
        field5126 = null;
        if (arg0 != 104) {
            method1960(-28);
        }
        field5124 = null;
        field5122 = null;
        field5128 = null;
        field5127 = null;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
    public static final void method1961(int arg0) {
        for (class47 var1 = (class47) class171.field3028.method1873((byte) 43); var1 != null; var1 = (class47) class171.field3028.method1866((byte) -70)) {
            int var2 = var1.field934;
            if (class98.method697(var2, 4401)) {
                boolean var3 = true;
                class220[] var4 = class227.field4162[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4010;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3407;
                    class220 var7 = class233.method1667(var6, arg0 ^ 0x3E);
                    if (var7 != null) {
                        class82.method614((byte) 92, var7);
                    }
                }
            }
        }
        field5119++;
        if (arg0 != 0) {
            field5128 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)V")
    public static final void method1962(int arg0, int arg1) {
        if (arg1 != -3) {
            method1961(42);
        }
        field5117++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class44.method338(-28747);
        } else if (arg0 == 2) {
            class87.method637((byte) 96);
        } else {
            throw new RuntimeException();
        }
    }
}
