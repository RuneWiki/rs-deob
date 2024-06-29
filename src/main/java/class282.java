import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class282 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "B")
    private byte field4580;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4583 = 0;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[I")
    public static int[] field4587 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILbc;)Lok;", line = 5)
    public static final class41 method1984(int arg0, class302 arg1) {
        field4582++;
        if (arg0 == class278.method1963(client.method2119(arg1), -1691001909)) {
            return null;
        } else if (arg1.field5020 == null || arg1.field5020.method299(false).method275(false) == 0) {
            return class150.field2331 ? class104.field1474 : null;
        } else {
            return arg1.field5020;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V", line = 25)
    public static final void method1985(int arg0, int arg1, int arg2) {
        field4591++;
        if (arg2 != -6) {
            method1986((byte) 82);
        }
        for (int var3 = 0; var3 < class275.field4509; var3++) {
            class117 var4 = class301.method2075(arg2 + 1006, var3);
            if (var4 != null) {
                int var5 = var4.field1700;
                if (var5 >= 0 && !class31.field461.method687((byte) -121, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field1713 >= 0) {
                    int var6 = var4.field1713;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class31.field447[class259.method1827((byte) -92, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class31.field447[class259.method1827((byte) -95, class31.field461.method693(2, var5), 96)];
                } else if (var4.field1710 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field1710;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class31.field447[class259.method1827((byte) -110, var12, 96)];
                }
                class278.field4549[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 102)
    public static void method1986(byte arg0) {
        field4587 = null;
        if (arg0 <= 90) {
            field4583 = 84;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)I", line = 113)
    public final int method1987(int arg0) {
        field4584++;
        if (arg0 != 0) {
            field4583 = 90;
        }
        return (this.field4580 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lok;I)V", line = 134)
    public static final void method1988(class41 arg0, int arg1) {
        if (arg1 != -26612) {
            field4583 = 70;
        }
        field4581++;
        if (class62.field919 >= 2) {
            if (arg0.method306(class26.field386, 27080)) {
                class241.method1726(true);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class262.method1843(class187.method1346(new class41[] { class307.field5156, class1.method4(var4, (byte) 34), class236.field3794 }, 0), 0, (class41) null, 117);
            }
            if (class166.field2625 && arg0.method306(class307.field5179, arg1 ^ 0xFFFFF1C4)) {
                System.out.println("oncard_geometry:" + class103.field1462);
                System.out.println("oncard_2d:" + class103.field1458);
                System.out.println("oncard_texture:" + class103.field1457);
            }
            if (arg0.method306(class13.field160, 27080)) {
                class151.method1042(-2871);
            }
            if (arg0.method306(class142.field2183, 27080)) {
                class174.field2831.method903((byte) -124);
            }
            if (arg0.method306(class116.field1697, arg1 + 53692)) {
                class174.field2831.method909(-127);
            }
            if (arg0.method306(class51.field775, 27080)) {
                class138.field2065.method1489(true);
                class118.field1724.method1568(80);
                class174.field2831.method912(-94);
            }
            if (arg0.method306(class239.field3826, arg1 ^ 0xFFFFF1C4)) {
                class85.field1224 = true;
            }
            if (arg0.method306(class296.field4783, 27080)) {
                method1991(arg1 ^ 0x67F4, 25);
            }
            if (arg0.method306(class2.field34, 27080)) {
                class46.field728 = true;
            }
            if (arg0.method306(class105.field1491, 27080)) {
                class46.field728 = false;
            }
            if (arg0.method306(class81.field1195, 27080)) {
                class105.method725(-1, false, 0, false, -1);
            }
            if (arg0.method306(class76.field1130, 27080)) {
                class105.method725(-1, false, 1, false, -1);
            }
            if (arg0.method306(class315.field5325, 27080)) {
                class105.method725(-1, false, 2, false, -1);
            }
            if (arg0.method306(class189.field3071, arg1 ^ 0xFFFFF1C4)) {
                class105.method725(1024, false, 3, false, 768);
            }
            if (arg0.method306(class116.field1691, 27080)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class222.field3548[var5].field3570[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method309(class38.field585, 0) && class51.field774 != 0) {
                class208.method1469(false, arg0.method279(6, (byte) -123).method301((byte) -104));
            }
            if (arg0.method306(class234.field3739, 27080) && class51.field774 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method309(class118.field1733, 0)) {
                class256.field4107 = arg0.method279(12, (byte) -17).method299(false).method301((byte) -122);
                class262.method1843(class187.method1346(new class41[] { class63.field930, class1.method4(class256.field4107, (byte) 86) }, 0), 0, (class41) null, 91);
            }
            if (arg0.method306(class94.field1392, 27080)) {
                class150.field2331 = true;
            }
        }
        class285.field4642.method844(-4, 185);
        class238.field3812++;
        class285.field4642.method797(arg0.method275(false) - 1, -22096);
        class285.field4642.method776(341440880, arg0.method279(2, (byte) -92));
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lbc;IBI)V", line = 284)
    public static final void method1989(class302 arg0, int arg1, byte arg2, int arg3) {
        field4590++;
        if (arg0.field5021 == 1) {
            class79.method565(0L, class266.field4233, (byte) 100, (short) 59, 0, arg0.field4898, arg0.field4910);
            class285.field4634++;
        }
        if (arg0.field5021 == 2 && !class128.field1901) {
            class41 var4 = method1984(0, arg0);
            if (var4 != null) {
                class79.method565(0L, class187.method1346(new class41[] { class105.field1488, arg0.field4992 }, 0), (byte) 63, (short) 50, -1, var4, arg0.field4910);
                class278.field4558++;
            }
        }
        if (arg0.field5021 == 3) {
            class18.field224++;
            class79.method565(0L, class266.field4233, (byte) 114, (short) 31, 0, class129.field1919, arg0.field4910);
        }
        if (arg0.field5021 == 4) {
            class107.field1507++;
            class79.method565(0L, class266.field4233, (byte) 99, (short) 33, 0, arg0.field4898, arg0.field4910);
        }
        if (arg0.field5021 == 5) {
            class79.method565(0L, class266.field4233, (byte) 120, (short) 39, 0, arg0.field4898, arg0.field4910);
            class150.field2333++;
        }
        if (arg0.field5021 == 6 && class109.field1526 == null) {
            class91.field1319++;
            class79.method565(0L, class266.field4233, (byte) 93, (short) 43, -1, arg0.field4898, arg0.field4910);
        }
        if (arg2 != -21) {
            field4583 = 89;
        }
        if (arg0.field4951 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field4921; var6++) {
                for (int var7 = 0; var7 < arg0.field5041; var7++) {
                    int var8 = (arg0.field4998 + 32) * var7;
                    int var9 = (arg0.field4931 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field5036[var5];
                        var8 += arg0.field4963[var5];
                    }
                    if (var8 <= arg3 && var9 <= arg1 && (var8 + 32) > arg3 && arg1 < var9 + 32) {
                        class64.field942 = arg0;
                        class48.field746 = var5;
                        if (arg0.field5011[var5] > 0) {
                            class138 var10 = class130.method918(arg0.field5011[var5] - 1, -101);
                            if (class101.field1445 == 1 && class222.method1591(client.method2119(arg0), (byte) -97)) {
                                if (class10.field134 != arg0.field4910 || class226.field3627 != var5) {
                                    class232.field3663++;
                                    class79.method565((long) var10.field2092, class187.method1346(new class41[] { class74.field1096, class234.field3731, var10.field2120 }, arg2 ^ 0xFFFFFFEB), (byte) 86, (short) 2, var5, class18.field237, arg0.field4910);
                                }
                            } else if (!class128.field1901 || !class222.method1591(client.method2119(arg0), (byte) -86)) {
                                class64.field933++;
                                class41[] var11 = var10.field2130;
                                if (class69.field1030) {
                                    var11 = class153.method1089(var11, true);
                                }
                                if (class222.method1591(client.method2119(arg0), (byte) -109)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class236.field3783++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 24;
                                            } else {
                                                var13 = 26;
                                            }
                                            class79.method565((long) var10.field2092, class187.method1346(new class41[] { class78.field1155, var10.field2120 }, 0), (byte) 78, var13, var5, var11[var12], arg0.field4910);
                                        } else if (var12 == 4) {
                                            class79.method565((long) var10.field2092, class187.method1346(new class41[] { class78.field1155, var10.field2120 }, 0), (byte) 71, (short) 26, var5, class312.field5277, arg0.field4910);
                                            class193.field3111++;
                                        }
                                    }
                                }
                                if (class139.method975(client.method2119(arg0), arg2 ^ 0x34B009B4)) {
                                    class41.field613++;
                                    class79.method565((long) var10.field2092, class187.method1346(new class41[] { class78.field1155, var10.field2120 }, arg2 + 21), (byte) 121, (short) 17, var5, class18.field237, arg0.field4910);
                                }
                                if (class222.method1591(client.method2119(arg0), (byte) -105) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            class43.field684++;
                                            if (var14 == 0) {
                                                var15 = 1;
                                            }
                                            if (var14 == 1) {
                                                var15 = 51;
                                            }
                                            if (var14 == 2) {
                                                var15 = 5;
                                            }
                                            class79.method565((long) var10.field2092, class187.method1346(new class41[] { class78.field1155, var10.field2120 }, 0), (byte) 49, var15, var5, var11[var14], arg0.field4910);
                                        }
                                    }
                                }
                                class41[] var16 = arg0.field4935;
                                if (class69.field1030) {
                                    var16 = class153.method1089(var16, true);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class92.field1329++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 18;
                                            }
                                            if (var17 == 1) {
                                                var18 = 15;
                                            }
                                            if (var17 == 2) {
                                                var18 = 21;
                                            }
                                            if (var17 == 3) {
                                                var18 = 35;
                                            }
                                            if (var17 == 4) {
                                                var18 = 13;
                                            }
                                            class79.method565((long) var10.field2092, class187.method1346(new class41[] { class78.field1155, var10.field2120 }, arg2 + 21), (byte) 103, var18, var5, var16[var17], arg0.field4910);
                                        }
                                    }
                                }
                                class79.method565((long) var10.field2092, class187.method1346(new class41[] { class78.field1155, var10.field2120 }, 0), (byte) 54, (short) 1003, var5, class315.field5311, arg0.field4910);
                            } else if ((class193.field3108 & 0x10) == 16) {
                                class79.method565((long) var10.field2092, class187.method1346(new class41[] { class126.field1871, class234.field3731, var10.field2120 }, 0), (byte) 92, (short) 37, var5, class94.field1389, arg0.field4910);
                                class240.field3838++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field4964) {
            return;
        }
        if (!class128.field1901) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class41 var20 = class136.method948(82, var19, arg0);
                if (var20 != null) {
                    class246.field3948++;
                    class79.method565((long) (var19 + 1), arg0.field4945, (byte) 63, (short) 1004, arg0.field4996, var20, arg0.field4910);
                }
            }
            class41 var21 = method1984(0, arg0);
            if (var21 != null) {
                class278.field4558++;
                class79.method565(0L, arg0.field4945, (byte) 64, (short) 50, arg0.field4996, var21, arg0.field4910);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class41 var23 = class136.method948(arg2 ^ 0xFFFFFFD1, var22, arg0);
                if (var23 != null) {
                    class246.field3948++;
                    class79.method565((long) (var22 + 1), arg0.field4945, (byte) 75, (short) 7, arg0.field4996, var23, arg0.field4910);
                }
            }
            if (class245.method1757((byte) -84, client.method2119(arg0))) {
                class79.method565(0L, class266.field4233, (byte) 101, (short) 43, arg0.field4996, class217.field3483, arg0.field4910);
                class91.field1319++;
            }
        } else if (class123.method871(client.method2119(arg0), true) && (class193.field3108 & 0x20) == 32) {
            class79.method565(0L, class187.method1346(new class41[] { class126.field1871, class35.field531, arg0.field4945 }, 0), (byte) 81, (short) 10, arg0.field4996, class94.field1389, arg0.field4910);
            class116.field1686++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)I", line = 597)
    public final int method1990(byte arg0) {
        field4589++;
        int var2 = -103 % ((arg0 - 2) / 50);
        return this.field4580 & 0x7;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 627)
    public class282() {
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V", line = 647)
    public static final void method1991(int arg0, int arg1) {
        field4585++;
        if (class94.field1377 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class94.field1377 == 0) {
            class240.method1723(-5);
        }
        if (arg1 == 40) {
            class5.method19(88);
        }
        if (arg1 != 40 && class91.field1321 != null) {
            class91.field1321.method1570((byte) -101);
            class91.field1321 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class294.field4755 = 1;
            class222.field3551 = 1;
            class125.field1864 = 0;
            class93.field1374 = 0;
            class283.field4601 = 0;
            class57.method401((byte) 59);
        }
        if (arg1 == 25 || arg1 == 10) {
            class107.method730(104);
        }
        if (arg1 == 5) {
            class173.method1240(class212.field3423, 89);
        } else {
            class191.method1371((byte) 125);
        }
        boolean var3 = class94.field1377 == 5 || class94.field1377 == 10 || class94.field1377 == 28;
        if (var2 != var3) {
            if (var2) {
                class237.field3805 = class89.field1307;
                if (class244.field3900 == 0) {
                    class162.method1143(-12, 2);
                } else {
                    class234.method1689(0, class89.field1307, 2, class294.field4763, false, (byte) 75, 255);
                }
                class174.field2831.method907((byte) -118, false);
            } else {
                class162.method1143(95, 2);
                class174.field2831.method907((byte) -118, true);
            }
        }
        if (arg0 != -8) {
            method1989((class302) null, 90, (byte) -3, -120);
        }
        if (class166.field2625 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class166.method1183();
        }
        class94.field1377 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Llb;)V", line = 733)
    public class282(class112 arg0) {
        this.field4580 = arg0.method785((byte) -121);
        this.field4579 = arg0.method759((byte) -99);
        this.field4588 = arg0.method779(-27100);
        this.field4586 = arg0.method779(-27100);
        this.field4577 = arg0.method779(-27100);
        this.field4578 = arg0.method779(-27100);
    }
}
