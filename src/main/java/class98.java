import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class98 {

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lki;")
    public class61 field1809 = new class61();

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Leb;")
    private static class230 field1806 = class68.method589(0, "Please remove ");

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Leb;")
    public static class230 field1811 = field1806;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Leb;")
    public static class230 field1813 = class68.method589(0, " <col=ffffff>");

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Leb;")
    public static class230 field1814 = field1806;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Lki;")
    private class61 field1817;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)Lki;")
    public final class61 method832(boolean arg0) {
        field1821++;
        if (arg0) {
            return null;
        }
        class61 var2 = this.field1809.field1163;
        if (this.field1809 == var2) {
            this.field1817 = null;
            return null;
        } else {
            this.field1817 = var2.field1163;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILki;)V")
    public final void method833(int arg0, class61 arg1) {
        field1819++;
        if (arg0 != -1) {
            this.field1809 = null;
        }
        if (arg1.field1163 != null) {
            arg1.method518(arg0 + 94);
        }
        arg1.field1163 = this.field1809;
        arg1.field1169 = this.field1809.field1169;
        arg1.field1163.field1169 = arg1;
        arg1.field1169.field1163 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Lki;")
    public final class61 method834(byte arg0) {
        class61 var2 = this.field1817;
        field1805++;
        if (arg0 != 82) {
            field1811 = null;
        }
        if (this.field1809 == var2) {
            this.field1817 = null;
            return null;
        } else {
            this.field1817 = var2.field1169;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)Lki;")
    public final class61 method835(boolean arg0) {
        field1808++;
        if (arg0) {
            field1806 = null;
        }
        class61 var2 = this.field1809.field1169;
        if (this.field1809 == var2) {
            return null;
        } else {
            var2.method518(95);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(Z)V")
    public static void method836(boolean arg0) {
        field1814 = null;
        field1811 = null;
        field1806 = null;
        field1813 = null;
        if (!arg0) {
            method842((class245[]) null, false, 18);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method837(int arg0) {
        while (true) {
            class61 var2 = this.field1809.field1169;
            if (this.field1809 == var2) {
                this.field1817 = null;
                if (arg0 != -26215) {
                    field1811 = null;
                }
                field1818++;
                return;
            }
            var2.method518(126);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Lki;")
    public final class61 method838(byte arg0) {
        if (arg0 != 58) {
            this.field1817 = null;
        }
        field1804++;
        class61 var2 = this.field1817;
        if (this.field1809 == var2) {
            this.field1817 = null;
            return null;
        } else {
            this.field1817 = var2.field1163;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Lki;")
    public final class61 method839(int arg0) {
        field1820++;
        class61 var2 = this.field1809.field1169;
        if (this.field1809 == var2) {
            this.field1817 = null;
            return null;
        } else if (arg0 == 128) {
            this.field1817 = var2.field1169;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)[Leh;")
    public static final class80[] method840(int arg0) {
        field1816++;
        if (arg0 != 1) {
            field1814 = null;
        }
        class80[] var1 = new class80[class194.field3434];
        for (int var2 = 0; var2 < class194.field3434; var2++) {
            byte[] var3 = class215.field3725[var2];
            int var4 = class7.field124[var2] * class273.field4806[var2];
            if (class271.field4794[var2]) {
                byte[] var5 = class254.field4527[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; var7 < var4; var7++) {
                    var6[var7] = class177.method1290(class189.method1350(255, var5[var7]) << 24, class263.field4676[class189.method1350(255, var3[var7])]);
                }
                var1[var2] = new class211(class47.field839, class15.field346, class96.field1735[var2], class113.field2034[var2], class7.field124[var2], class273.field4806[var2], var6);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class263.field4676[class189.method1350(255, var3[var9])];
                }
                var1[var2] = new class10(class47.field839, class15.field346, class96.field1735[var2], class113.field2034[var2], class7.field124[var2], class273.field4806[var2], var8);
            }
        }
        class78.method650(true);
        return var1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1812++;
        if (arg0 < arg2) {
            class182.method1311(arg4, arg2, true, class66.field1254[arg1], arg0);
        } else {
            class182.method1311(arg4, arg0, true, class66.field1254[arg1], arg2);
        }
        if (arg3 != -5) {
            field1806 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([Lka;ZI)V")
    public static final void method842(class245[] arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class245 var4 = arg0[var3];
            if (var4 != null && var4.field4245 == arg2 && (!var4.field4216 || !client.method1161(var4))) {
                if (var4.field4306 == 0) {
                    if (!var4.field4216 && client.method1161(var4) && class206.field3629 != var4) {
                        continue;
                    }
                    method842(arg0, false, var4.field4362);
                    if (var4.field4318 != null) {
                        method842(var4.field4318, false, var4.field4362);
                    }
                    class150 var5 = (class150) client.field2708.method394((long) var4.field4362, -21083);
                    if (var5 != null) {
                        class112.method902(95, var5.field2681);
                    }
                }
                if (var4.field4306 == 6) {
                    if (var4.field4233 != -1 || var4.field4355 != -1) {
                        boolean var6 = class145.method1104(var4, (byte) 123);
                        int var7;
                        if (var6) {
                            var7 = var4.field4355;
                        } else {
                            var7 = var4.field4233;
                        }
                        if (var7 != -1) {
                            class249 var8 = class237.method1667(var7, -126);
                            if (var8 != null) {
                                var4.field4271 += class219.field3771;
                                while (var8.field4433[var4.field4368] < var4.field4271) {
                                    var4.field4271 -= var8.field4433[var4.field4368];
                                    var4.field4368++;
                                    if (var8.field4408.length <= var4.field4368) {
                                        var4.field4368 -= var8.field4441;
                                        if (var4.field4368 < 0 || var4.field4368 >= var8.field4408.length) {
                                            var4.field4368 = 0;
                                        }
                                    }
                                    class92.method777((byte) -65, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4250 != 0 && !var4.field4216) {
                        int var9 = var4.field4250 >> 16;
                        int var10 = class219.field3771 * var9;
                        var4.field4206 = var4.field4206 + var10 & 0x7FF;
                        int var11 = var4.field4250 << 16 >> 16;
                        int var12 = class219.field3771 * var11;
                        var4.field4256 = var4.field4256 + var12 & 0x7FF;
                        class92.method777((byte) -65, var4);
                    }
                }
            }
        }
        field1810++;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(ILki;)V")
    public final void method843(int arg0, class61 arg1) {
        field1815++;
        if (arg1.field1163 != null) {
            arg1.method518(arg0 ^ 0xFFFFFF94);
        }
        if (arg0 != -5) {
            field1806 = null;
        }
        arg1.field1163 = this.field1809.field1163;
        arg1.field1169 = this.field1809;
        arg1.field1163.field1169 = arg1;
        arg1.field1169.field1163 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([Lhh;IZ)V")
    public static final void method844(class116[] arg0, int arg1, boolean arg2) {
        field1807++;
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
                        if ((class79.field1435[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class79.field1435[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method933(0, var5, var6);
                            }
                        }
                    }
                }
            }
            class217.field3751 += (int) (Math.random() * 5.0D) - 2;
            class236.field4085 += (int) (Math.random() * 5.0D) - 2;
            if (class236.field4085 < -8) {
                class236.field4085 = -8;
            }
            if (class236.field4085 > 8) {
                class236.field4085 = 8;
            }
            if (class217.field3751 < -16) {
                class217.field3751 = -16;
            }
            if (class217.field3751 > 16) {
                class217.field3751 = 16;
            }
        }
        int[][] var8 = new int[104][104];
        int var9 = class217.field3751 >> 1;
        int var10 = class236.field4085 >> 2 << 10;
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class209.field3650[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    int var101 = class106.field1912[var12][var100 + 1][var54] - class106.field1912[var12][var100 - 1][var54];
                    byte var102 = 74;
                    int var103 = class106.field1912[var12][var100][var54 + 1] - class106.field1912[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var101 * var101 - (-(var103 * var103) - 65536)));
                    int var105 = (var101 << 8) / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = -65536 / var104;
                    int var108 = (var51[var100 - 1][var54] >> 2) + (var51[var100][var54 - 1] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54] >> 1) + (var51[var100][var54 + 1] >> 3);
                    int var109 = (var107 * -10 + var105 * -50 + var106 * -50) / var53 + var102;
                    var8[var100][var54] = var109 - var108;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class249.field4437[var55] = 0;
                class54.field941[var55] = 0;
                class194.field3452[var55] = 0;
                class110.field1975[var55] = 0;
                class160.field2864[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class139.field2482[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class146 var96 = class130.method1028(arg1 ^ 0x58D8FCC0, var95 - 1);
                            class249.field4437[var85] += var96.field2620;
                            class54.field941[var85] += var96.field2625;
                            class194.field3452[var85] += var96.field2633;
                            class110.field1975[var85] += var96.field2630;
                            var10002 = class160.field2864[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class139.field2482[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class146 var99 = class130.method1028(1, var98 - 1);
                            class249.field4437[var85] -= var99.field2620;
                            class54.field941[var85] -= var99.field2625;
                            class194.field3452[var85] -= var99.field2633;
                            class110.field1975[var85] -= var99.field2630;
                            var10002 = class160.field2864[var85]--;
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
                        int var93 = var91 - 5;
                        if (var92 < 104) {
                            var89 += class110.field1975[var92];
                            var90 += class160.field2864[var92];
                            var87 += class249.field4437[var92];
                            var88 += class194.field3452[var92];
                            var86 += class54.field941[var92];
                        }
                        if (var93 >= 0) {
                            var90 -= class160.field2864[var93];
                            var88 -= class194.field3452[var93];
                            var89 -= class110.field1975[var93];
                            var86 -= class54.field941[var93];
                            var87 -= class249.field4437[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var11[var56][var91] = class44.method382((byte) 91, var87 * 256 / var89, var88 / var90, var86 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class179.method1302(76) || (class79.field1435[0][var57][var58] & 0x2) != 0 || (class79.field1435[var12][var57][var58] & 0x10) == 0 && class16.method210(var58, var57, var12, -1) == class171.field3036) {
                        if (class81.field1464 > var12) {
                            class81.field1464 = var12;
                        }
                        int var59 = class139.field2482[var12][var57][var58] & 0xFF;
                        int var60 = class127.field2220[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class106.field1912[var12][var57][var58];
                            int var62 = class106.field1912[var12][var57 + 1][var58];
                            int var63 = class106.field1912[var12][var57 + 1][var58 + 1];
                            int var64 = class106.field1912[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class157.field2813[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class206.method1446(var60 - 1, arg1 + -1490615485).field700) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class268.field4763[var12][var57][var58] = class177.method1290(class268.field4763[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var59 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var11[var57][var58];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var10 + var67 & 0xFC00) + (var67 & 0x380) + var68;
                                var66 = class3.field20[class127.method992(96, var69, arg1 - 1490615361)];
                            }
                            int var70 = var8[var57][var58];
                            int var71 = var8[var57 + 1][var58 + 1];
                            int var72 = var8[var57 + 1][var58];
                            int var73 = var8[var57][var58 + 1];
                            if (var60 == 0) {
                                class99.method845(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class127.method992(var70, var67, 128), class127.method992(var72, var67, 128), class127.method992(var71, var67, 128), class127.method992(var73, var67, 128), 0, 0, 0, 0, var66, 0);
                            } else {
                                int var74 = class157.field2813[var12][var57][var58] + 1;
                                byte var75 = class158.field2818[var12][var57][var58];
                                class37 var76 = class206.method1446(var60 - 1, arg1 + -1490615485);
                                int var77 = var76.field695;
                                if (var77 >= 0 && !class3.field15.method728(1, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var81;
                                if (var77 >= 0) {
                                    var81 = class3.field20[class172.method1261(arg1 - 1490615364, 96, class3.field15.method729(69, var77))];
                                    var78 = -1;
                                } else if (var76.field685 == -1) {
                                    var78 = -2;
                                    var81 = 0;
                                } else {
                                    var78 = var76.field685;
                                    int var79 = (var78 & 0x7F) + var9;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 127) {
                                        var79 = 127;
                                    }
                                    int var80 = (var78 & 0x380) + (var78 + var10 & 0xFC00) + var79;
                                    var81 = class3.field20[class172.method1261(6, 96, var80)];
                                }
                                if (var76.field691 >= 0) {
                                    int var82 = var76.field691;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var10 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var81 = class3.field20[class172.method1261(-40, 96, var84)];
                                }
                                class99.method845(var12, var57, var58, var74, var75, var77, var61, var62, var63, var64, class127.method992(var70, var67, 128), class127.method992(var72, var67, arg1 ^ 0x58D8FC41), class127.method992(var71, var67, 128), class127.method992(var73, var67, 128), class172.method1261(120, var70, var78), class172.method1261(17, var72, var78), class172.method1261(-28, var71, var78), class172.method1261(27, var73, var78), var66, var81);
                            }
                        }
                    }
                }
            }
            class139.field2482[var12] = null;
            class127.field2220[var12] = null;
            class157.field2813[var12] = null;
            class158.field2818[var12] = null;
            class209.field3650[var12] = null;
        }
        class53.method420(-50, -10, -50);
        if (!arg2) {
            for (int var13 = 0; var13 < 104; var13++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    if ((class79.field1435[1][var13][var50] & 0x2) == 2) {
                        class221.method1512(var13, var50);
                    }
                }
            }
            for (int var14 = 0; var14 < 4; var14++) {
                for (int var15 = 0; var15 <= 104; var15++) {
                    for (int var16 = 0; var16 <= 104; var16++) {
                        if ((class268.field4763[var14][var16][var15] & 0x1) != 0) {
                            int var17;
                            for (var17 = var15; var17 > 0 && (class268.field4763[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                            }
                            int var18;
                            for (var18 = var15; var18 < 104 && (class268.field4763[var14][var16][var18 + 1] & 0x1) != 0; var18++) {
                            }
                            int var19;
                            label353: for (var19 = var14; var19 > 0; var19--) {
                                for (int var20 = var17; var20 <= var18; var20++) {
                                    if ((class268.field4763[var19 - 1][var16][var20] & 0x1) == 0) {
                                        break label353;
                                    }
                                }
                            }
                            int var21;
                            label341: for (var21 = var14; var21 < 3; var21++) {
                                for (int var22 = var17; var22 <= var18; var22++) {
                                    if ((class268.field4763[var21 + 1][var16][var22] & 0x1) == 0) {
                                        break label341;
                                    }
                                }
                            }
                            int var23 = (var21 + 1 - var19) * (var18 + 1 - var17);
                            if (var23 >= 8) {
                                int var24 = class106.field1912[var19][var16][var17];
                                short var25 = 240;
                                int var26 = class106.field1912[var21][var16][var17] - var25;
                                class230.method1596(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var24);
                                for (int var27 = var19; var27 <= var21; var27++) {
                                    for (int var28 = var17; var28 <= var18; var28++) {
                                        class268.field4763[var27][var16][var28] = class189.method1350(class268.field4763[var27][var16][var28], -2);
                                    }
                                }
                            }
                        }
                        if ((class268.field4763[var14][var16][var15] & 0x2) != 0) {
                            int var29;
                            for (var29 = var16; var29 > 0 && (class268.field4763[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                            }
                            int var30 = var14;
                            int var31 = var14;
                            int var32;
                            for (var32 = var16; var32 < 104 && (class268.field4763[var14][var32 + 1][var15] & 0x2) != 0; var32++) {
                            }
                            label408: while (var30 > 0) {
                                for (int var33 = var29; var33 <= var32; var33++) {
                                    if ((class268.field4763[var30 - 1][var33][var15] & 0x2) == 0) {
                                        break label408;
                                    }
                                }
                                var30--;
                            }
                            label397: while (var31 < 3) {
                                for (int var34 = var29; var34 <= var32; var34++) {
                                    if ((class268.field4763[var31 + 1][var34][var15] & 0x2) == 0) {
                                        break label397;
                                    }
                                }
                                var31++;
                            }
                            int var35 = (var31 - (var30 - 1)) * (var32 + 1 - var29);
                            if (var35 >= 8) {
                                short var36 = 240;
                                int var37 = class106.field1912[var31][var29][var15] - var36;
                                int var38 = class106.field1912[var30][var29][var15];
                                class230.method1596(2, var29 * 128, var32 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                                for (int var39 = var30; var39 <= var31; var39++) {
                                    for (int var40 = var29; var40 <= var32; var40++) {
                                        class268.field4763[var39][var40][var15] = class189.method1350(class268.field4763[var39][var40][var15], -3);
                                    }
                                }
                            }
                        }
                        if ((class268.field4763[var14][var16][var15] & 0x4) != 0) {
                            int var41 = var16;
                            int var42 = var15;
                            int var43 = var16;
                            while (var42 > 0 && (class268.field4763[var14][var16][var42 - 1] & 0x4) != 0) {
                                var42--;
                            }
                            int var44;
                            for (var44 = var15; var44 < 104 && (class268.field4763[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                            }
                            label462: while (var41 > 0) {
                                for (int var45 = var42; var45 <= var44; var45++) {
                                    if ((class268.field4763[var14][var41 - 1][var45] & 0x4) == 0) {
                                        break label462;
                                    }
                                }
                                var41--;
                            }
                            label451: while (var43 < 104) {
                                for (int var46 = var42; var46 <= var44; var46++) {
                                    if ((class268.field4763[var14][var43 + 1][var46] & 0x4) == 0) {
                                        break label451;
                                    }
                                }
                                var43++;
                            }
                            if ((var44 + 1 - var42) * (var43 + 1 - var41) >= 4) {
                                int var47 = class106.field1912[var14][var41][var42];
                                class230.method1596(4, var41 * 128, var43 * 128 + 128, var42 * 128, var44 * 128 + 128, var47, var47);
                                for (int var48 = var41; var48 <= var43; var48++) {
                                    for (int var49 = var42; var49 <= var44; var49++) {
                                        class268.field4763[var14][var48][var49] = class189.method1350(class268.field4763[var14][var48][var49], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 1490615489) {
            method842((class245[]) null, true, -116);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class98() {
        this.field1809.field1163 = this.field1809;
        this.field1809.field1169 = this.field1809;
    }
}
