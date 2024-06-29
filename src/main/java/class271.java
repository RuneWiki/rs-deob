import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class271 extends class291 {

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public int field4757 = 0;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "Z")
    public static boolean field4754 = true;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "Leg;")
    public static class37 field4752 = class174.method1167(")4", 105);

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public static int field4761 = 0;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "Leg;")
    public static class37 field4763 = class174.method1167("Cach-B", -59);

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field4758 = 99;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "Ljl;")
    public static class101 field4751;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Leh;")
    public static class136 field4755;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public static void method1814(int arg0) {
        field4763 = null;
        field4751 = null;
        if (arg0 != 2159) {
            field4752 = null;
        }
        field4755 = null;
        field4752 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BJ)V")
    public static final void method1815(byte arg0, long arg1) {
        field4767++;
        if (arg1 == 0L) {
            return;
        }
        class273.field4778.method1697(237, arg0 ^ 0xFFFFFFDB);
        class273.field4778.method1256(arg1, (byte) 84);
        if (arg0 != -79) {
            method1819((class37) null, (class187) null, -74);
        }
        class71.field1115++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lva;II)V")
    private final void method1816(class187 arg0, int arg1, int arg2) {
        field4764++;
        if (arg1 != 27325) {
            this.method1820(37, (class187) null);
        }
        if (arg2 == 2) {
            this.field4757 = arg0.method1244(false);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I")
    public static final int method1817(int arg0, int arg1) {
        if (arg0 != -682921625) {
            field4752 = null;
        }
        field4760++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        field4756++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg5;
        } else if (var8 == 2) {
            return 7 - arg6 - (arg3 - 1);
        } else if (arg0 == -8082) {
            return arg4;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Leg;Lva;I)I")
    public static final int method1819(class37 arg0, class187 arg1, int arg2) {
        field4753++;
        int var3 = arg1.field3169;
        arg1.method1266(arg0.field576, -1817230624);
        arg1.field3169 += class68.field1074.method1876(4732, arg1.field3169, arg0.field599, arg0.field576, arg1.field3175, 0);
        return arg2 < 51 ? -95 : arg1.field3169 - var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILva;)V")
    public final void method1820(int arg0, class187 arg1) {
        while (true) {
            int var3 = arg1.method1268(255);
            if (var3 == 0) {
                if (arg0 >= -66) {
                    field4752 = null;
                }
                field4766++;
                return;
            }
            this.method1816(arg1, 27325, var3);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V")
    public static final void method1821(int arg0, int arg1) {
        field4762++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class26.field368[arg1];
        int var3 = class264.field4642[arg1];
        int var4 = (int) class129.field2141[arg1];
        int var5 = class217.field3726[arg1];
        long var6 = class129.field2141[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 10) {
            class273.field4778.method1697(103, 97);
            class72.field1142++;
            class273.field4778.method1262(65, var4);
            class273.field4778.method1299(var5, 22);
            class273.field4778.method1262(111, var2);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-102, var5);
            class269.field4701 = var2;
        }
        if (var3 == 1004) {
            class237 var8 = class156.method1066(arg0 ^ 0xFFFFFFBB, var5);
            if (var8 == null || var8.field4123[var2] < 100000) {
                class273.field4778.method1697(205, 99);
                class273.field4778.method1265(var4, -23132);
                class96.field1506++;
            } else {
                class274.method1839((byte) -59, 0, class179.field2989, class156.method1061((byte) -46, new class37[] { class163.method1096(var8.field4123[var2], (byte) -35), class80.field1248, class9.method52(true, var4).field4325 }));
            }
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-96, var5);
            class269.field4701 = var2;
        }
        if (var3 == 50) {
            class99.method643(var2, -98, var5, var6);
            class175.field2927++;
            class273.field4778.method1697(107, arg0 ^ 0x6E);
            class273.field4778.method1265(class144.field2456 + var5, -23132);
            class273.field4778.method1291(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class273.field4778.method1262(94, class40.field642 + var2);
        }
        if (var3 == 59) {
            class273.field4778.method1697(75, 116);
            class273.field4778.method1293(var5, 1113273252);
            class273.field4778.method1265(var4, -23132);
            class273.field4778.method1291(true, var2);
            class255.field4523++;
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-79, var5);
            class269.field4701 = var2;
        }
        if (var3 == 36) {
            if (var4 == 0) {
                class123.method890(class237.field4140, var2, var5);
            } else if (var4 == 1) {
                if (class127.field2129 > 0 && class158.field2625[82] && class158.field2625[81]) {
                    class177.method1181(class40.field642 + var2, class237.field4140, class144.field2456 + var5, 906);
                } else if (class139.method980(0, true, var5, 0, class82.field1285.field1780[0], 1, 0, 0, 0, true, class82.field1285.field1812[0], var2)) {
                    class273.field4778.method1292(class186.field3122, (byte) -64);
                    class273.field4778.method1292(class126.field2105, (byte) -64);
                    class273.field4778.method1294(class25.field355, arg0 - 26657);
                    class273.field4778.method1292(57, (byte) -64);
                    class273.field4778.method1292(class279.field4933, (byte) -64);
                    class273.field4778.method1292(class172.field2884, (byte) -64);
                    class273.field4778.method1292(89, (byte) -64);
                    class273.field4778.method1294(class82.field1285.field1799, -26655);
                    class273.field4778.method1294(class82.field1285.field1793, -26655);
                    class273.field4778.method1292(class36.field530, (byte) -64);
                    class273.field4778.method1292(63, (byte) -64);
                }
            }
        }
        if (var3 == 2) {
            class188 var9 = class98.field1526[var4];
            if (var9 != null) {
                class134.field2323++;
                class139.method980(0, false, var9.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var9.field1812[0]);
                class200.field3396 = class110.field1837;
                class217.field3734 = 2;
                class51.field798 = class163.field2685;
                class201.field3423 = 0;
                class273.field4778.method1697(119, 101);
                class273.field4778.method1294(var4, -26655);
            }
        }
        if (var3 == 4) {
            class188 var10 = class98.field1526[var4];
            if (var10 != null) {
                class86.field1364++;
                class139.method980(0, false, var10.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var10.field1812[0]);
                class201.field3423 = 0;
                class200.field3396 = class110.field1837;
                class217.field3734 = 2;
                class51.field798 = class163.field2685;
                class273.field4778.method1697(177, arg0 + 104);
                class273.field4778.method1293(class129.field2150, arg0 ^ 0x425B33A6);
                class273.field4778.method1294(class45.field709, -26655);
                class273.field4778.method1265(var4, arg0 - 23134);
            }
        }
        if (var3 == 28) {
            class188 var11 = class98.field1526[var4];
            if (var11 != null) {
                class134.field2318++;
                class139.method980(0, false, var11.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var11.field1812[0]);
                class217.field3734 = 2;
                class201.field3423 = 0;
                class200.field3396 = class110.field1837;
                class51.field798 = class163.field2685;
                class273.field4778.method1697(10, 113);
                class273.field4778.method1291(true, var4);
            }
        }
        if (var3 == 15) {
            class273.field4778.method1697(191, arg0 ^ 0x66);
            class32.field475++;
            class273.field4778.method1294(var4, arg0 ^ 0xFFFF97E3);
            class273.field4778.method1262(102, var2);
            class273.field4778.method1261(var5, 93);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-113, var5);
            class269.field4701 = var2;
        }
        if (var3 == 35 && class224.field3840 == null) {
            class52.method336(var5, true, var2);
            class224.field3840 = class47.method309(128, var5, var2);
            class121.method856(24665, class224.field3840);
        }
        if (var3 == 43) {
            class273.field4778.method1697(85, 114);
            class273.field4778.method1272(27862, var5);
            class273.field4778.method1293(class214.field3706, 1113273252);
            class219.field3764++;
            class273.field4778.method1265(class178.field2976, arg0 - 23134);
            class273.field4778.method1294(var4, -26655);
            class273.field4778.method1291(true, var2);
            class273.field4778.method1262(55, class194.field3330);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(arg0 - 97, var5);
            class269.field4701 = var2;
        }
        if (var3 == 48) {
            class171.field2864++;
            class273.field4778.method1697(239, 123);
            class273.field4778.method1272(27862, var5);
            class237 var12 = class156.method1066(-74, var5);
            if (var12.field4154 != null && var12.field4154[0][0] == 5) {
                int var13 = var12.field4154[0][1];
                class153.field2571[var13] = 1 - class153.field2571[var13];
                class86.method568(13695, var13);
            }
        }
        if (var3 == 1007) {
            class217.field3734 = 2;
            class51.field798 = class163.field2685;
            class201.field3423 = 0;
            class200.field3396 = class110.field1837;
            class163 var14 = class55.field833[var4];
            if (var14 != null) {
                class275 var15 = var14.field2691;
                if (var15.field4888 != null) {
                    var15 = var15.method1854((byte) 68);
                }
                if (var15 != null) {
                    class273.field4778.method1697(232, 127);
                    class273.field4778.method1294(var15.field4881, -26655);
                    class239.field4252++;
                }
            }
        }
        if (var3 == 16) {
            class188 var16 = class98.field1526[var4];
            if (var16 != null) {
                class186.field3119++;
                class139.method980(0, false, var16.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var16.field1812[0]);
                class217.field3734 = 2;
                class201.field3423 = 0;
                class200.field3396 = class110.field1837;
                class51.field798 = class163.field2685;
                class273.field4778.method1697(236, arg0 + 97);
                class273.field4778.method1265(var4, -23132);
            }
        }
        if (var3 == 26) {
            boolean var17 = class139.method980(0, false, var5, 0, class82.field1285.field1780[0], 2, 0, 0, 0, true, class82.field1285.field1812[0], var2);
            class286.field5046++;
            if (!var17) {
                class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
            }
            class200.field3396 = class110.field1837;
            class201.field3423 = 0;
            class217.field3734 = 2;
            class51.field798 = class163.field2685;
            class273.field4778.method1697(149, 95);
            class273.field4778.method1294(var2 + class40.field642, -26655);
            class273.field4778.method1294(class194.field3330, -26655);
            class273.field4778.method1291(true, class178.field2976);
            class273.field4778.method1291(true, var5 + class144.field2456);
            class273.field4778.method1294(var4, -26655);
            class273.field4778.method1293(class214.field3706, 1113273252);
        }
        if (var3 == 32) {
            class270.field4724++;
            class273.field4778.method1697(9, 95);
            class273.field4778.method1294(var4, -26655);
            class273.field4778.method1272(27862, var5);
            class273.field4778.method1262(121, var2);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(arg0 - 124, var5);
            class269.field4701 = var2;
        }
        if (var3 == 25) {
            class99.method643(var2, 106, var5, var6);
            class273.field4778.method1697(244, 109);
            class53.field818++;
            class273.field4778.method1291(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class273.field4778.method1265(class144.field2456 + var5, arg0 + -23134);
            class273.field4778.method1262(55, class40.field642 + var2);
        }
        if (var3 == 6) {
            class273.field4778.method1697(70, 98);
            class7.field112++;
            class273.field4778.method1261(var5, arg0 ^ 0x59);
            class273.field4778.method1291(true, var2);
            class273.field4778.method1291(true, var4);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-126, var5);
            class269.field4701 = var2;
        }
        if (var3 == 13) {
            class188 var19 = class98.field1526[var4];
            if (var19 != null) {
                class139.method980(0, false, var19.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var19.field1812[0]);
                class200.field3396 = class110.field1837;
                class201.field3423 = 0;
                class217.field3734 = 2;
                class51.field798 = class163.field2685;
                class273.field4778.method1697(175, 97);
                class273.field4778.method1294(class194.field3330, -26655);
                class273.field4778.method1265(class178.field2976, -23132);
                class273.field4778.method1294(var4, -26655);
                class273.field4778.method1293(class214.field3706, 1113273252);
                class124.field2075++;
            }
        }
        if (var3 == 47) {
            if (var4 == 0) {
                class63.field1037 = true;
                class123.method890(class237.field4140, var2, var5);
            } else if (class127.field2129 > 0 && class158.field2625[82] && class158.field2625[81]) {
                class177.method1181(class40.field642 + var2, class237.field4140, class144.field2456 + var5, arg0 + 904);
            } else {
                class273.field4778.method1697(204, 118);
                class270.field4712++;
                class273.field4778.method1262(103, class40.field642 + var2);
                class273.field4778.method1262(37, class144.field2456 + var5);
            }
        }
        if (var3 == 22) {
            class74.field1161++;
            if (class132.field2221 == 1) {
                class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
            } else {
                boolean var20 = class139.method980(0, false, var5, 0, class82.field1285.field1780[0], 2, 0, 0, 0, true, class82.field1285.field1812[0], var2);
                if (!var20) {
                    class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
                }
            }
            class200.field3396 = class110.field1837;
            class51.field798 = class163.field2685;
            class217.field3734 = 2;
            class201.field3423 = 0;
            class273.field4778.method1697(150, 127);
            class273.field4778.method1265(var4, -23132);
            class273.field4778.method1291(true, class144.field2456 + var5);
            class273.field4778.method1291(true, var2 + class40.field642);
        }
        if (var3 == 30) {
            class2.field32++;
            boolean var22 = class139.method980(0, false, var5, 0, class82.field1285.field1780[0], 2, 0, 0, 0, true, class82.field1285.field1812[0], var2);
            if (!var22) {
                class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
            }
            class217.field3734 = 2;
            class200.field3396 = class110.field1837;
            class201.field3423 = 0;
            class51.field798 = class163.field2685;
            class273.field4778.method1697(170, arg0 ^ 0x72);
            class273.field4778.method1291(true, class144.field2456 + var5);
            class273.field4778.method1291(true, class45.field709);
            class273.field4778.method1291(true, var4);
            class273.field4778.method1299(class129.field2150, 7);
            class273.field4778.method1265(class40.field642 + var2, arg0 ^ 0xFFFFA5A6);
        }
        if (var3 == 60) {
            class163 var24 = class55.field833[var4];
            if (var24 != null) {
                class139.method980(0, false, var24.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var24.field1812[0]);
                class200.field3396 = class110.field1837;
                class144.field2450++;
                class201.field3423 = 0;
                class51.field798 = class163.field2685;
                class217.field3734 = 2;
                class273.field4778.method1697(231, 108);
                class273.field4778.method1265(var4, -23132);
                class273.field4778.method1293(class129.field2150, 1113273252);
                class273.field4778.method1262(82, class45.field709);
            }
        }
        if (var3 == 5) {
            class237 var25 = class47.method309(arg0 ^ 0x82, var5, var2);
            if (var25 != null) {
                class138.method973((byte) 77);
                class99.method644(var2, -122, class285.method1910(client.method787(var25), -19253), var5);
                class23.field292 = 0;
                class147.field2497 = class263.method1775(0, var25);
                if (class147.field2497 == null) {
                    class147.field2497 = class173.field2903;
                }
                if (!var25.field4129) {
                    class93.field1464 = class156.method1061((byte) 88, new class37[] { class69.field1089, var25.field4147, class170.field2854 });
                    return;
                }
                class93.field1464 = class156.method1061((byte) -74, new class37[] { var25.field4188, class170.field2854 });
            }
            return;
        }
        if (var3 == 14 && class99.method643(var2, 116, var5, var6)) {
            class273.field4778.method1697(118, 115);
            field4765++;
            class273.field4778.method1261(class214.field3706, arg0 + 125);
            class273.field4778.method1291(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class273.field4778.method1265(class40.field642 + var2, -23132);
            class273.field4778.method1265(class178.field2976, arg0 ^ 0xFFFFA5A6);
            class273.field4778.method1294(class144.field2456 + var5, -26655);
            class273.field4778.method1262(arg0 ^ 0x7F, class194.field3330);
        }
        if (var3 == 34) {
            class239.field4246++;
            if (class132.field2221 == 1) {
                class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
            } else {
                boolean var26 = class139.method980(0, false, var5, 0, class82.field1285.field1780[0], 2, 0, 0, 0, true, class82.field1285.field1812[0], var2);
                if (!var26) {
                    class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
                }
            }
            class51.field798 = class163.field2685;
            class217.field3734 = 2;
            class201.field3423 = 0;
            class200.field3396 = class110.field1837;
            class273.field4778.method1697(56, 94);
            class273.field4778.method1262(43, class144.field2456 + var5);
            class273.field4778.method1265(class40.field642 + var2, arg0 ^ 0xFFFFA5A6);
            class273.field4778.method1294(var4, arg0 ^ 0xFFFF97E3);
        }
        if (var3 == 49) {
            class163 var28 = class55.field833[var4];
            if (var28 != null) {
                class139.method980(0, false, var28.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var28.field1812[0]);
                class51.field798 = class163.field2685;
                class200.field3396 = class110.field1837;
                class201.field3423 = 0;
                class28.field411++;
                class217.field3734 = 2;
                class273.field4778.method1697(130, 124);
                class273.field4778.method1294(var4, -26655);
                class273.field4778.method1262(arg0 ^ 0x5D, class194.field3330);
                class273.field4778.method1291(true, class178.field2976);
                class273.field4778.method1299(class214.field3706, 122);
            }
        }
        if (var3 == 23) {
            if (var4 == 0) {
                class99.field1538 = true;
                class123.method890(class237.field4140, var2, var5);
            } else if (var4 == 1) {
                class273.field4778.method1697(29, arg0 + 114);
                class101.field1561++;
                class273.field4778.method1261(class129.field2150, arg0 + 116);
                class273.field4778.method1291(true, class45.field709);
                class273.field4778.method1265(class144.field2456 + var5, -23132);
                class273.field4778.method1294(class40.field642 + var2, arg0 + -26657);
            }
        }
        if (var3 == 19) {
            class273.field4778.method1697(239, arg0 + 110);
            class171.field2864++;
            class273.field4778.method1272(27862, var5);
            class237 var29 = class156.method1066(-79, var5);
            if (var29.field4154 != null && var29.field4154[0][0] == 5) {
                int var30 = var29.field4154[0][1];
                if (class153.field2571[var30] != var29.field4210[0]) {
                    class153.field2571[var30] = var29.field4210[0];
                    class86.method568(13695, var30);
                }
            }
        }
        if (var3 == 1) {
            class163 var31 = class55.field833[var4];
            if (var31 != null) {
                class118.field2007++;
                class139.method980(0, false, var31.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var31.field1812[0]);
                class201.field3423 = 0;
                class217.field3734 = 2;
                class51.field798 = class163.field2685;
                class200.field3396 = class110.field1837;
                class273.field4778.method1697(200, 121);
                class273.field4778.method1291(true, var4);
            }
        }
        if (var3 == 31) {
            class160.field2668++;
            class273.field4778.method1697(242, 97);
            class273.field4778.method1262(79, var2);
            class273.field4778.method1262(89, var4);
            class273.field4778.method1299(var5, arg0 + 110);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-103, var5);
            class269.field4701 = var2;
        }
        if (var3 == 9) {
            class165.field2736++;
            class273.field4778.method1697(60, arg0 ^ 0x79);
            class273.field4778.method1262(arg0 ^ 0x78, var4);
            class273.field4778.method1291(true, var2);
            class273.field4778.method1299(var5, -101);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-112, var5);
            class269.field4701 = var2;
        }
        if (var3 == 37) {
            class273.field4778.method1697(90, arg0 ^ 0x67);
            class263.field4629++;
            class273.field4778.method1294(var2, arg0 ^ 0xFFFF97E3);
            class273.field4778.method1291(true, var4);
            class273.field4778.method1293(var5, 1113273252);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-79, var5);
            class269.field4701 = var2;
        }
        if (var3 == 29) {
            class188 var32 = class98.field1526[var4];
            if (var32 != null) {
                class186.field3118++;
                class139.method980(0, false, var32.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var32.field1812[0]);
                class200.field3396 = class110.field1837;
                class51.field798 = class163.field2685;
                class217.field3734 = 2;
                class201.field3423 = 0;
                class273.field4778.method1697(184, arg0 + 97);
                class273.field4778.method1262(40, var4);
            }
        }
        if (var3 == 1006) {
            class96.field1506++;
            class51.field798 = class163.field2685;
            class200.field3396 = class110.field1837;
            class201.field3423 = 0;
            class217.field3734 = 2;
            class273.field4778.method1697(205, arg0 + 118);
            class273.field4778.method1265(var4, -23132);
        }
        if (var3 == 3) {
            class159.field2639++;
            class273.field4778.method1697(196, arg0 ^ 0x66);
            class273.field4778.method1261(var5, 74);
            class273.field4778.method1262(arg0 + 52, class45.field709);
            class273.field4778.method1293(class129.field2150, arg0 + 1113273250);
            class273.field4778.method1262(arg0 ^ 0x32, var2);
        }
        if (arg0 != 2) {
            method1817(72, 11);
        }
        if (var3 == 11) {
            class163 var33 = class55.field833[var4];
            if (var33 != null) {
                class139.method980(0, false, var33.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var33.field1812[0]);
                class284.field5006++;
                class200.field3396 = class110.field1837;
                class51.field798 = class163.field2685;
                class201.field3423 = 0;
                class217.field3734 = 2;
                class273.field4778.method1697(151, arg0 + 95);
                class273.field4778.method1294(var4, -26655);
            }
        }
        if (var3 == 46) {
            if (class132.field2221 == 1) {
                class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
            } else {
                boolean var34 = class139.method980(0, false, var5, 0, class82.field1285.field1780[0], 2, 0, 0, 0, true, class82.field1285.field1812[0], var2);
                if (!var34) {
                    class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
                }
            }
            class217.field3734 = 2;
            class201.field3423 = 0;
            class51.field798 = class163.field2685;
            class182.field3047++;
            class200.field3396 = class110.field1837;
            class273.field4778.method1697(116, arg0 ^ 0x7C);
            class273.field4778.method1262(35, class40.field642 + var2);
            class273.field4778.method1262(70, var4);
            class273.field4778.method1265(class144.field2456 + var5, -23132);
        }
        if (var3 == 39) {
            class163 var36 = class55.field833[var4];
            if (var36 != null) {
                class139.method980(0, false, var36.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var36.field1812[0]);
                class51.field798 = class163.field2685;
                class200.field3396 = class110.field1837;
                class201.field3423 = 0;
                class217.field3734 = 2;
                class273.field4778.method1697(209, arg0 ^ 0x7D);
                class107.field1653++;
                class273.field4778.method1265(var4, -23132);
            }
        }
        if (var3 == 8) {
            class188 var37 = class98.field1526[var4];
            if (var37 != null) {
                class139.method980(0, false, var37.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var37.field1812[0]);
                class51.field798 = class163.field2685;
                class201.field3423 = 0;
                class217.field3734 = 2;
                class249.field4469++;
                class200.field3396 = class110.field1837;
                class273.field4778.method1697(93, arg0 ^ 0x69);
                class273.field4778.method1265(var4, -23132);
            }
        }
        if (var3 == 21) {
            class188 var38 = class98.field1526[var4];
            if (var38 != null) {
                class139.method980(0, false, var38.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var38.field1812[0]);
                class200.field3396 = class110.field1837;
                class201.field3423 = 0;
                class217.field3734 = 2;
                class22.field290++;
                class51.field798 = class163.field2685;
                class273.field4778.method1697(59, arg0 ^ 0x7B);
                class273.field4778.method1262(41, var4);
            }
        }
        if (var3 == 44) {
            class188 var39 = class98.field1526[var4];
            if (var39 != null) {
                class139.method980(0, false, var39.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var39.field1812[0]);
                class151.field2534++;
                class217.field3734 = 2;
                class201.field3423 = 0;
                class51.field798 = class163.field2685;
                class200.field3396 = class110.field1837;
                class273.field4778.method1697(203, 109);
                class273.field4778.method1265(var4, arg0 ^ 0xFFFFA5A6);
            }
        }
        if (var3 == 20) {
            class273.field4778.method1697(40, 99);
            class9.field149++;
            class273.field4778.method1261(var5, 39);
            class273.field4778.method1262(124, var2);
            class273.field4778.method1265(var4, -23132);
            class273.field4778.method1294(class45.field709, -26655);
            class273.field4778.method1261(class129.field2150, 54);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(arg0 ^ 0xFFFFFF87, var5);
            class269.field4701 = var2;
        }
        if (var3 == 24) {
            class188 var40 = class98.field1526[var4];
            if (var40 != null) {
                class139.method980(0, false, var40.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var40.field1812[0]);
                class200.field3396 = class110.field1837;
                class217.field3734 = 2;
                class102.field1607++;
                class51.field798 = class163.field2685;
                class201.field3423 = 0;
                class273.field4778.method1697(135, 112);
                class273.field4778.method1291(true, var4);
            }
        }
        if (var3 == 51) {
            class273.field4778.method1697(228, 94);
            class137.field2341++;
            class273.field4778.method1293(var5, 1113273252);
            class273.field4778.method1265(var2, -23132);
            class273.field4778.method1262(99, var4);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-84, var5);
            class269.field4701 = var2;
        }
        if (var3 == 18) {
            class99.method643(var2, arg0 - 98, var5, var6);
            class47.field738++;
            class273.field4778.method1697(99, 118);
            class273.field4778.method1294(var2 + class40.field642, -26655);
            class273.field4778.method1291(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class273.field4778.method1265(var5 + class144.field2456, arg0 ^ 0xFFFFA5A6);
        }
        if (var3 == 40) {
            class237 var41 = class156.method1066(-85, var5);
            boolean var42 = true;
            if (var41.field4175 > 0) {
                var42 = class132.method942(var41, (byte) -82);
            }
            if (var42) {
                class171.field2864++;
                class273.field4778.method1697(239, 124);
                class273.field4778.method1272(27862, var5);
            }
        }
        if (var3 == 7) {
            class168.field2803++;
            class99.method643(var2, -17, var5, var6);
            class273.field4778.method1697(248, 122);
            class273.field4778.method1294(class144.field2456 + var5, -26655);
            class273.field4778.method1265(class40.field642 + var2, -23132);
            class273.field4778.method1291(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var3 == 1003) {
            class51.field789++;
            class99.method643(var2, -114, var5, var6);
            class273.field4778.method1697(78, 101);
            class273.field4778.method1262(arg0 + 88, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class273.field4778.method1265(var2 + class40.field642, -23132);
            class273.field4778.method1291(true, var5 + class144.field2456);
        }
        if (var3 == 58) {
            if (class132.field2221 == 1) {
                class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
            } else {
                boolean var43 = class139.method980(0, false, var5, 0, class82.field1285.field1780[0], 2, 0, 0, 0, true, class82.field1285.field1812[0], var2);
                if (!var43) {
                    class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
                }
            }
            class200.field3396 = class110.field1837;
            class217.field3734 = 2;
            class83.field1304++;
            class51.field798 = class163.field2685;
            class201.field3423 = 0;
            class273.field4778.method1697(34, arg0 ^ 0x70);
            class273.field4778.method1294(class40.field642 + var2, -26655);
            class273.field4778.method1265(var4, -23132);
            class273.field4778.method1265(var5 + class144.field2456, -23132);
        }
        if (var3 == 42 && class99.method643(var2, 102, var5, var6)) {
            class152.field2549++;
            class273.field4778.method1697(246, 100);
            class273.field4778.method1291(true, class40.field642 + var2);
            class273.field4778.method1294(class45.field709, arg0 ^ 0xFFFF97E3);
            class273.field4778.method1294(Integer.MAX_VALUE & (int) (var6 >>> 32), -26655);
            class273.field4778.method1294(class144.field2456 + var5, -26655);
            class273.field4778.method1272(27862, class129.field2150);
        }
        if (var3 == 45) {
            class138.method973((byte) 77);
            class237 var45 = class156.method1066(-121, var5);
            class194.field3330 = var2;
            class178.field2976 = var4;
            class214.field3706 = var5;
            class23.field292 = 1;
            class121.method856(arg0 + 24663, var45);
            class150.field2523 = class156.method1061((byte) 93, new class37[] { class203.field3461, class9.method52(true, var4).field4325, class170.field2854 });
            if (class150.field2523 == null) {
                class150.field2523 = class82.field1287;
            }
            return;
        }
        if (var3 == 33) {
            class163 var46 = class55.field833[var4];
            if (var46 != null) {
                class139.method980(0, false, var46.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var46.field1812[0]);
                class217.field3734 = 2;
                class200.field3396 = class110.field1837;
                class56.field880++;
                class201.field3423 = 0;
                class51.field798 = class163.field2685;
                class273.field4778.method1697(126, 127);
                class273.field4778.method1265(var4, -23132);
            }
        }
        if (var3 == 1005) {
            class200.field3396 = class110.field1837;
            class217.field3734 = 2;
            class201.field3423 = 0;
            class51.field798 = class163.field2685;
            class276.field4893++;
            class273.field4778.method1697(230, 97);
            class273.field4778.method1291(true, var4);
        }
        if (var3 == 17) {
            class163 var47 = class55.field833[var4];
            if (var47 != null) {
                class32.field464++;
                class139.method980(0, false, var47.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var47.field1812[0]);
                class217.field3734 = 2;
                class200.field3396 = class110.field1837;
                class201.field3423 = 0;
                class51.field798 = class163.field2685;
                class273.field4778.method1697(187, arg0 + 122);
                class273.field4778.method1262(50, var4);
            }
        }
        if (var3 == 41) {
            class169.method1131(-8);
        }
        if (var3 == 57) {
            class273.field4778.method1697(171, 115);
            class138.field2357++;
            class273.field4778.method1299(var5, 125);
            class273.field4778.method1262(118, var2);
            class273.field4778.method1291(true, var4);
            class189.field3255 = 0;
            class60.field986 = class156.method1066(-126, var5);
            class269.field4701 = var2;
        }
        if (var3 == 38) {
            class175.field2932++;
            if (class132.field2221 == 1) {
                class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
            } else {
                boolean var48 = class139.method980(0, false, var5, 0, class82.field1285.field1780[0], 2, 0, 0, 0, true, class82.field1285.field1812[0], var2);
                if (!var48) {
                    class139.method980(0, false, var5, 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var2);
                }
            }
            class51.field798 = class163.field2685;
            class201.field3423 = 0;
            class200.field3396 = class110.field1837;
            class217.field3734 = 2;
            class273.field4778.method1697(114, 99);
            class273.field4778.method1294(class144.field2456 + var5, -26655);
            class273.field4778.method1291(true, var4);
            class273.field4778.method1291(true, class40.field642 + var2);
        }
        if (var3 == 12 || var3 == 1002) {
            class98.method639(var5, class160.field2663[arg1], 166, var4, var2);
        }
        if (class23.field292 != 0) {
            class23.field292 = 0;
            class121.method856(24665, class156.method1066(-96, class214.field3706));
        }
        if (class174.field2924) {
            class138.method973((byte) 77);
        }
        if (class60.field986 != null && class189.field3255 == 0) {
            class121.method856(arg0 + 24663, class60.field986);
        }
    }
}
