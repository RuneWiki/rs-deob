import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class42 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field1055 = 2;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lgd;")
    public static class40 field1037 = class14.method90(false, "");

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lgd;")
    public static class40 field1045 = class14.method90(false, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lgd;")
    public static class40 field1039 = class14.method90(false, "welle:");

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1051 = -1;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field1068 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lw;")
    public static class135 field1057;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 5)
    public static final void method282(int arg0) {
        class44.method305(-866143504, class94.field2161);
        if (class103.field2493 != -1) {
            class44.method305(-866143504, class103.field2493);
        }
        class86.field1919 = 0;
        if (arg0 != -18566) {
            return;
        }
        field1042++;
        class94.field2169.method561((byte) -74);
        class93.field2128 = class109.method835(class93.field2128);
        class27.method162();
        class60.method446(503, 104, 0, 0, 0, 765, class94.field2161);
        if (class103.field2493 != -1) {
            class60.method446(503, 101, 0, 0, 0, 765, class103.field2493);
        }
        if (class90.field2040) {
            class74.method504(true);
        } else {
            class112.method872(arg0 ^ 0x4885);
            class44.method302(arg0 ^ 0xFFFFB77A);
        }
        try {
            Graphics var1 = class30.field761.getGraphics();
            class94.field2169.method465(-89, 0, var1, 0);
        } catch (Exception var2) {
            class30.field761.repaint();
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 61)
    public static void method283(int arg0) {
        field1037 = null;
        field1057 = null;
        field1039 = null;
        if (arg0 <= 113) {
            method287(124, null);
        }
        field1045 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 93)
    public static final void method284(byte arg0) {
        class30.field762 = true;
        field1059++;
        class58.method438(false);
        if (arg0 != 81) {
            method287(102, null);
        }
        if (class87.field1957) {
            class1.field17.method349(class125.field2973, 239, 40, 0);
            class1.field17.method349(client.method114(true, new class40[] { class125.field2969, class22.field525 }), 239, 60, 128);
        } else if (class53.field1347 == 1) {
            class1.field17.method349(class130.field3139, 239, 40, 0);
            class1.field17.method349(client.method114(true, new class40[] { class125.field2965, class22.field525 }), 239, 60, 128);
        } else if (class53.field1347 == 2) {
            class1.field17.method349(class108.field2630, 239, 40, 0);
            class1.field17.method349(client.method114(true, new class40[] { class125.field2965, class22.field525 }), 239, 60, 128);
        } else if (class53.field1347 == 3) {
            if (class125.field2968 != class125.field2965) {
                class136.method1078(19192, class125.field2965);
                class125.field2968 = class125.field2965;
            }
            class47 var1 = class133.field3238;
            class27.method166(0, 0, 463, 77);
            for (int var2 = 0; var2 < class94.field2174; var2++) {
                int var3 = var2 * 14 + 18 - class69.field1664;
                if (var3 > 0 && var3 < 110) {
                    var1.method349(class9.field229[var2], 239, var3, 0);
                }
            }
            class27.method169();
            if (class94.field2174 > 5) {
                class65.method467(0, class69.field1664, 16, class94.field2174 * 14 + 7, 77, 463);
            }
            if (class125.field2965.method255(-10) == 0) {
                class1.field17.method349(class132.field3202, 239, 40, 255);
            } else if (class94.field2174 == 0) {
                class1.field17.method349(class104.field2524, 239, 40, 0);
            }
            var1.method349(client.method114(true, new class40[] { class125.field2965, class22.field525 }), 239, 90, 0);
            class27.method171(0, 77, 479, 0);
        } else if (class135.field3285 != null) {
            class1.field17.method366(class135.field3285, 10, 20, 459, 40, 0, false, 1, 1, 0);
            class1.field17.method349(class10.field243, 239, 80, 128);
        } else if (class108.field2624 != -1) {
            boolean var19 = class60.method446(96, 96, 2, 0, 0, 479, class108.field2624);
            if (!var19) {
                class122.field2880 = true;
            }
        } else if (class69.field1671 == -1) {
            class47 var5 = class133.field3238;
            class27.method166(0, 0, 463, 77);
            int var6 = 0;
            for (int var7 = 0; var7 < 100; var7++) {
                if (class30.field664[var7] != null) {
                    int var9 = class52.field1316[var7];
                    class40 var10 = class10.field247[var7];
                    byte var11 = 0;
                    int var12 = class130.field3134 + 70 - var6 * 14;
                    if (var10 != null && var10.method276(36, class7.field196)) {
                        var11 = 1;
                        var10 = var10.method240(-28427, 5);
                    }
                    if (var10 != null && var10.method276(36, class55.field1408)) {
                        var10 = var10.method240(-28427, 5);
                        var11 = 2;
                    }
                    if (var9 == 0) {
                        if (var12 > 0 && var12 < 110) {
                            var5.method353(class30.field664[var7], 4, var12, 0);
                        }
                        var6++;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class1.field23 == 0 || class1.field23 == 1 && class66.method478(true, var10))) {
                        var6++;
                        if (var12 > 0 && var12 < 110) {
                            int var13 = 4;
                            if (var11 == 1) {
                                class54.field1394[0].method497(var13, var12 - 12);
                                var13 += 14;
                            }
                            if (var11 == 2) {
                                class54.field1394[1].method497(var13, var12 - 12);
                                var13 += 14;
                            }
                            var5.method353(client.method114(true, new class40[] { var10, class45.field1141 }), var13, var12, 0);
                            int var14 = var13 + var5.method367(var10) + 8;
                            var5.method353(class30.field664[var7], var14, var12, 255);
                        }
                    }
                    if ((var9 == 3 || var9 == 7) && class74.field1713 == 0 && (var9 == 7 || class94.field2163 == 0 || class94.field2163 == 1 && class66.method478(true, var10))) {
                        var6++;
                        if (var12 > 0 && var12 < 110) {
                            byte var15 = 4;
                            var5.method353(class100.field2372, var15, var12, 0);
                            int var16 = var15 + var5.method367(class100.field2372);
                            int var17 = var16 + var5.method350(32);
                            if (var11 == 1) {
                                class54.field1394[0].method497(var17, var12 - 12);
                                var17 += 14;
                            }
                            if (var11 == 2) {
                                class54.field1394[1].method497(var17, var12 - 12);
                                var17 += 14;
                            }
                            var5.method353(client.method114(true, new class40[] { var10, class45.field1141 }), var17, var12, 0);
                            int var18 = var17 + var5.method367(var10) + 8;
                            var5.method353(class30.field664[var7], var18, var12, 8388608);
                        }
                    }
                    if (var9 == 4 && (class76.field1765 == 0 || class76.field1765 == 1 && class66.method478(true, var10))) {
                        if (var12 > 0 && var12 < 110) {
                            var5.method353(client.method114(true, new class40[] { var10, class9.field237, class30.field664[var7] }), 4, var12, 8388736);
                        }
                        var6++;
                    }
                    if (var9 == 5 && class74.field1713 == 0 && class94.field2163 < 2) {
                        var6++;
                        if (var12 > 0 && var12 < 110) {
                            var5.method353(class30.field664[var7], 4, var12, 8388608);
                        }
                    }
                    if (var9 == 6 && class74.field1713 == 0 && class94.field2163 < 2) {
                        var6++;
                        if (var12 > 0 && var12 < 110) {
                            var5.method353(client.method114(true, new class40[] { class108.field2625, class9.field237, var10, class45.field1141 }), 4, var12, 0);
                            var5.method353(class30.field664[var7], var5.method367(client.method114(true, new class40[] { class108.field2625, class9.field237, var10 })) + 12, var12, 8388608);
                        }
                    }
                    if (var9 == 8 && (class76.field1765 == 0 || class76.field1765 == 1 && class66.method478(true, var10))) {
                        if (var12 > 0 && var12 < 110) {
                            var5.method353(client.method114(true, new class40[] { var10, class9.field237, class30.field664[var7] }), 4, var12, 8270336);
                        }
                        var6++;
                    }
                }
            }
            class27.method169();
            class83.field1877 = var6 * 14 + 7;
            if (class83.field1877 < 78) {
                class83.field1877 = 78;
            }
            class65.method467(0, class83.field1877 - class130.field3134 - 77, 16, class83.field1877, 77, 463);
            class40 var8;
            if (class13.field332 == null || class13.field332.field2210 == null) {
                var8 = class92.field2097;
            } else {
                var8 = class13.field332.field2210;
            }
            var5.method353(client.method114(true, new class40[] { var8, class45.field1141 }), 4, 90, 0);
            var5.method353(client.method114(true, new class40[] { class125.field2976, class22.field525 }), var5.method367(client.method114(true, new class40[] { var8, class10.field257 })) + 6, 90, 255);
            class27.method171(0, 77, 479, 0);
        } else {
            boolean var4 = class60.method446(96, arg0 - 22, 3, 0, 0, 479, class69.field1671);
            if (!var4) {
                class122.field2880 = true;
            }
        }
        if (class90.field2040 && class113.field2742 == 2) {
            class74.method504(true);
        }
        class34.method215((byte) 44);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 427)
    public static final void method285(byte arg0) {
        int var1 = -39 / ((arg0 - 42) / 36);
        class103.field2476.method40((byte) -101);
        field1036++;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 441)
    public static final void method286(int arg0) {
        if (arg0 != 4687) {
            field1055 = 12;
        }
        field1032++;
        short var1 = 256;
        if (class38.field938 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class38.field938 > 768) {
                    class63.field1550[var2] = class9.method52(class55.field1407[var2], -45, class8.field219[var2], 1024 - class38.field938);
                } else if (class38.field938 > 256) {
                    class63.field1550[var2] = class8.field219[var2];
                } else {
                    class63.field1550[var2] = class9.method52(class8.field219[var2], arg0 - 4809, class55.field1407[var2], 256 - class38.field938);
                }
            }
        } else if (class24.field555 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class63.field1550[var3] = class55.field1407[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class24.field555 > 768) {
                    class63.field1550[var4] = class9.method52(class55.field1407[var4], class70.method486(arg0, -4721), class114.field2756[var4], 1024 - class24.field555);
                } else if (class24.field555 > 256) {
                    class63.field1550[var4] = class114.field2756[var4];
                } else {
                    class63.field1550[var4] = class9.method52(class114.field2756[var4], arg0 - 4726, class55.field1407[var4], 256 - class24.field555);
                }
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class115.field2774.field1925[var5] = class63.field1548.field1167[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class50.field1284[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class53.field1356[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class115.field2774.field1925[var7];
                    int var29 = class63.field1550[var25];
                    class115.field2774.field1925[var7++] = class101.method709(var27 * class101.method709(var28, 16711935) + class101.method709(16711935, var29) * var25, -16711936) + class101.method709(16711680, var25 * class101.method709(65280, var29) + var27 * class101.method709(var28, 65280)) >> 8;
                }
            }
            var7 += var23;
        }
        for (int var9 = 0; var9 < 33920; var9++) {
            class1.field25.field1925[var9] = class8.field210.field1167[var9];
        }
        int var10 = 0;
        int var11 = 1176;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class50.field1284[var12] / var1;
            int var14 = var11 + var13;
            int var15 = 103 - var13;
            for (int var16 = 0; var16 < var15; var16++) {
                int var17 = class53.field1356[var10++];
                if (var17 == 0) {
                    var14++;
                } else {
                    int var18 = class1.field25.field1925[var14];
                    int var20 = 256 - var17;
                    int var21 = class63.field1550[var17];
                    class1.field25.field1925[var14++] = class101.method709(class101.method709(var21, 65280) * var17 + var20 * class101.method709(65280, var18), 16711680) + class101.method709(-16711936, var20 * class101.method709(var18, 16711935) + var17 * class101.method709(var21, 16711935)) >> 8;
                }
            }
            var11 = var14 + 128 - var13 - var15;
            var10 += 128 - var15;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 621)
    public static final void method287(int arg0, Component arg1) {
        if (arg0 != 24446) {
            method284((byte) -9);
        }
        field1066++;
        arg1.addMouseListener(class65.field1590);
        arg1.addMouseMotionListener(class65.field1590);
        arg1.addFocusListener(class65.field1590);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I", line = 634)
    public static final int method288(int arg0) {
        if (arg0 > -126) {
            method282(92);
        }
        field1047++;
        return class112.field2704++;
    }
}
