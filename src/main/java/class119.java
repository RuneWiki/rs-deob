import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class119 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field2906 = 1;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lwb;")
    public static class130 field2909 = class26.method212("Verbindung mit Update)2Server)3)3)3", -32376);

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lwb;")
    public static class130 field2913 = class26.method212("title)3jpg", -32376);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lwb;")
    public static class130 field2914 = class26.method212("@or1@", -32376);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lge;")
    public static class41 field2905 = new class41(64);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lwb;")
    private static class130 field2915 = class26.method212("Connecting to friendserver", -32376);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lwb;")
    public static class130 field2916 = field2915;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lwb;")
    public static class130 field2918 = class26.method212(" (X", -32376);

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field2922 = 0;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lqd;")
    public static class100 field2919;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[[B")
    public static byte[][] field2920;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLwc;Lwc;)V", line = 18)
    public static final void method913(byte arg0, class131 arg1, class131 arg2) {
        field2910++;
        class112.field2749.method181(14664);
        if (class40.field1109 == 0 || class40.field1109 == 5) {
            byte var3 = 20;
            arg1.method1012(class8.field280, 180, 74 - var3, 16777215);
            int var4 = 82 - var3;
            class49.method431(28, var4, 304, 34, 9179409);
            class49.method431(29, var4 + 1, 302, 32, 0);
            class49.method440(30, var4 + 2, class41.field1164 * 3, 30, 9179409);
            class49.method440(class41.field1164 * 3 + 30, var4 - -2, 300 - class41.field1164 * 3, 30, 0);
            arg1.method1012(class124.field2998, 180, 105 - var3, 16777215);
        }
        if (class40.field1109 == 20) {
            byte var5 = 40;
            class26.field767.method744(0, 0);
            arg1.method1006(class124.field3009, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg1.method1006(class124.field3011, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg1.method1006(class124.field3003, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg1.method1000(class15.method114(new class130[] { class17.field466, class124.field3012 }, -20349), 90, var22, 16777215, true);
            int var23 = var22 + 15;
            arg1.method1000(class15.method114(new class130[] { class48.field1293, class124.field3002.method980(-22964) }, arg0 - 20250), 92, var23, 16777215, true);
            int var24 = var23 + 15;
        }
        if (class40.field1109 == 10) {
            class26.field767.method744(0, 0);
            if (field2922 == 0) {
                byte var6 = 100;
                byte var7 = 80;
                arg1.method1006(class63.field1600, 180, var7, 16776960, true);
                int var25 = var7 + 30;
                byte var8 = 120;
                class1.field17.method744(var6 - 73, var8 + -20);
                arg1.method999(class46.field1242, var6 - 73, var8 - 20, 144, 40, 16777215, true, 1, 1, 0);
                short var9 = 260;
                class1.field17.method744(var9 - 73, var8 + -20);
                arg1.method999(class53.field1385, var9 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (field2922 == 2) {
                byte var10 = 100;
                byte var11 = 40;
                short var12 = 150;
                arg1.method1006(class124.field3009, 180, var11, 16776960, true);
                int var26 = var11 + 15;
                arg1.method1006(class124.field3011, 180, var26, 16776960, true);
                int var27 = var26 + 15;
                arg1.method1006(class124.field3003, 180, var27, 16776960, true);
                int var28 = var27 + 15;
                int var29 = var28 + 10;
                arg1.method1000(class15.method114(new class130[] { class17.field466, class124.field3012, class130.field3128 % 40 < 20 & class75.field1859 == 0 ? class52.field1372 : class124.field3010 }, arg0 ^ 0x4F1E), 90, var29, 16777215, true);
                int var30 = var29 + 15;
                arg1.method1000(class15.method114(new class130[] { class48.field1293, class124.field3002.method980(-22964), class75.field1859 == 1 & class130.field3128 % 40 < 20 ? class52.field1372 : class124.field3010 }, arg0 ^ 0x4F1E), 92, var30, 16777215, true);
                class1.field17.method744(var10 - 73, var12 - 20);
                arg1.method1006(class31.field861, var10, var12 + 5, 16777215, true);
                int var31 = var30 + 15;
                short var13 = 260;
                class1.field17.method744(var13 - 73, var12 + -20);
                arg1.method1006(client.field541, var13, var12 + 5, 16777215, true);
            } else if (field2922 == 3) {
                byte var14 = 65;
                arg1.method1006(class116.field2866, 180, 40, 16776960, true);
                short var15 = 180;
                short var16 = 150;
                arg1.method1006(class64.field1630, 180, var14, 16777215, true);
                int var32 = var14 + 15;
                arg1.method1006(class67.field1677, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg1.method1006(class71.field1805, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                arg1.method1006(class106.field2587, 180, var34, 16777215, true);
                class1.field17.method744(var15 - 73, var16 + -20);
                int var35 = var34 + 15;
                arg1.method1006(client.field541, var15, var16 + 5, 16777215, true);
            }
        }
        if (arg0 != -99) {
            return;
        }
        class27.method223((byte) -97);
        try {
            Graphics var17 = class84.field2003.getGraphics();
            class112.field2749.method187(171, var17, arg0 ^ 0x68AB, 202);
            class67.field1740.method187(0, var17, -26826, 0);
            class56.field1439.method187(0, var17, arg0 ^ 0x68AB, 637);
            if (class43.field1191) {
                class43.field1191 = false;
                class130.field3068.method187(0, var17, -26826, 128);
                class51.field1354.method187(371, var17, -26826, 202);
                class108.field2616.method187(265, var17, -26826, 0);
                class101.field2447.method187(265, var17, arg0 - 26727, 562);
                class109.field2624.method187(171, var17, -26826, 128);
                class43.field1190.method187(171, var17, -26826, 562);
            }
        } catch (Exception var18) {
            class84.field2003.repaint();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 169)
    public static final void method914(byte arg0) {
        class108.field2609 = true;
        class37.method380(0);
        field2907++;
        if (class101.field2435) {
            class43.field1187.method1012(class9.field315, 239, 40, 0);
            class43.field1187.method1012(class15.method114(new class130[] { class9.field300, class14.field397 }, -20349), 239, 60, 128);
        } else if (class63.field1598 == 1) {
            class43.field1187.method1012(class46.field1237, 239, 40, 0);
            class43.field1187.method1012(class15.method114(new class130[] { class9.field293, class14.field397 }, -20349), 239, 60, 128);
        } else if (class63.field1598 == 2) {
            class43.field1187.method1012(class71.field1795, 239, 40, 0);
            class43.field1187.method1012(class15.method114(new class130[] { class9.field293, class14.field397 }, -20349), 239, 60, 128);
        } else if (class63.field1598 == 3) {
            if (class9.field307 != class9.field293) {
                class123.method937(class9.field293, (byte) 29);
                class9.field307 = class9.field293;
            }
            class131 var1 = class132.field3202;
            class49.method432(0, 0, 463, 77);
            for (int var2 = 0; var2 < class97.field2353; var2++) {
                int var3 = var2 * 14 + 18 - class17.field474;
                if (var3 > 0 && var3 < 110) {
                    var1.method1012(class94.field2264[var2], 239, var3, 0);
                }
            }
            class49.method437();
            if (class97.field2353 > 5) {
                class35.method321(463, class97.field2353 * 14 + 7, 77, (byte) -61, 0, class17.field474);
            }
            if (class9.field293.method958((byte) -38) == 0) {
                class43.field1187.method1012(class88.field2080, 239, 40, 255);
            } else if (class97.field2353 == 0) {
                class43.field1187.method1012(class65.field1663, 239, 40, 0);
            }
            var1.method1012(class15.method114(new class130[] { class9.field293, class14.field397 }, -20349), 239, 90, 0);
            class49.method438(0, 77, 479, 0);
        } else if (class109.field2676 != null) {
            class43.field1187.method1012(class109.field2676, 239, 40, 0);
            class43.field1187.method1012(class6.field201, 239, 60, 128);
        } else if (class22.field632 != -1) {
            boolean var4 = class90.method667(0, 0, -36, -1, 2, class22.field632, 0, 479, 96);
            if (!var4) {
                class129.field3047 = true;
            }
        } else if (class6.field200 == -1) {
            int var5 = 0;
            class131 var6 = class132.field3202;
            class49.method432(0, 0, 463, 77);
            for (int var7 = 0; var7 < 100; var7++) {
                if (class37.field1089[var7] != null) {
                    int var9 = class69.field1786[var7];
                    int var10 = class111.field2729 + 70 - var5 * 14;
                    class130 var11 = class93.field2218[var7];
                    byte var12 = 0;
                    if (var11 != null && var11.method981(-11361, class83.field1949)) {
                        var11 = var11.method977(5, true);
                        var12 = 1;
                    }
                    if (var11 != null && var11.method981(-11361, class7.field232)) {
                        var11 = var11.method977(5, true);
                        var12 = 2;
                    }
                    if (var9 == 0) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method1002(class37.field1089[var7], 4, var10, 0);
                        }
                        var5++;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class121.field2965 == 0 || class121.field2965 == 1 && class4.method38(4739, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class52.field1363[0].method744(var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class52.field1363[1].method744(var13, var10 - 12);
                                var13 += 14;
                            }
                            var6.method1002(class15.method114(new class130[] { var11, class15.field441 }, -20349), var13, var10, 0);
                            int var14 = var13 + var6.method1013(var11) + 8;
                            var6.method1002(class37.field1089[var7], var14, var10, 255);
                        }
                        var5++;
                    }
                    if ((var9 == 3 || var9 == 7) && class53.field1397 == 0 && (var9 == 7 || class48.field1291 == 0 || class48.field1291 == 1 && class4.method38(4739, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var6.method1002(class101.field2444, var15, var10, 0);
                            int var16 = var15 + var6.method1013(class101.field2444);
                            int var17 = var16 + var6.method1003(32);
                            if (var12 == 1) {
                                class52.field1363[0].method744(var17, var10 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class52.field1363[1].method744(var17, var10 - 12);
                                var17 += 14;
                            }
                            var6.method1002(class15.method114(new class130[] { var11, class15.field441 }, -20349), var17, var10, 0);
                            int var18 = var17 + var6.method1013(var11) + 8;
                            var6.method1002(class37.field1089[var7], var18, var10, 8388608);
                        }
                        var5++;
                    }
                    if (var9 == 4 && (class101.field2420 == 0 || class101.field2420 == 1 && class4.method38(4739, var11))) {
                        var5++;
                        if (var10 > 0 && var10 < 110) {
                            var6.method1002(class15.method114(new class130[] { var11, class23.field663, class37.field1089[var7] }, -20349), 4, var10, 8388736);
                        }
                    }
                    if (var9 == 5 && class53.field1397 == 0 && class48.field1291 < 2) {
                        var5++;
                        if (var10 > 0 && var10 < 110) {
                            var6.method1002(class37.field1089[var7], 4, var10, 8388608);
                        }
                    }
                    if (var9 == 6 && class53.field1397 == 0 && class48.field1291 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method1002(class15.method114(new class130[] { class14.field413, class23.field663, var11, class15.field441 }, -20349), 4, var10, 0);
                            var6.method1002(class37.field1089[var7], var6.method1013(class15.method114(new class130[] { class14.field413, class23.field663, var11 }, -20349)) + 12, var10, 8388608);
                        }
                        var5++;
                    }
                    if (var9 == 8 && (class101.field2420 == 0 || class101.field2420 == 1 && class4.method38(4739, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method1002(class15.method114(new class130[] { var11, class23.field663, class37.field1089[var7] }, -20349), 4, var10, 8270336);
                        }
                        var5++;
                    }
                }
            }
            class49.method437();
            class30.field825 = var5 * 14 + 7;
            if (class30.field825 < 78) {
                class30.field825 = 78;
            }
            class35.method321(463, class30.field825, 77, (byte) -63, 0, class30.field825 - class111.field2729 - 77);
            class130 var8;
            if (class42.field1179 == null || class42.field1179.field1515 == null) {
                var8 = class124.field3012;
            } else {
                var8 = class42.field1179.field1515;
            }
            var6.method1002(class15.method114(new class130[] { var8, class15.field441 }, -20349), 4, 90, 0);
            var6.method1002(class15.method114(new class130[] { class9.field299, class14.field397 }, -20349), var6.method1013(class15.method114(new class130[] { var8, client.field543 }, -20349)) + 6, 90, 255);
            class49.method438(0, 77, 479, 0);
        } else {
            boolean var19 = class90.method667(0, 0, -36, -1, 3, class6.field200, 0, 479, 96);
            if (!var19) {
                class129.field3047 = true;
            }
        }
        if (arg0 <= 114) {
            method914((byte) 110);
        }
        if (class58.field1462 && class116.field2863 == 2) {
            class8.method66(true);
        }
        class96.method719(-128);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 495)
    public static void method915(int arg0) {
        field2905 = null;
        field2914 = null;
        field2915 = null;
        field2920 = null;
        field2918 = null;
        if (arg0 == 40) {
            field2909 = null;
            field2913 = null;
            field2919 = null;
            field2916 = null;
        }
    }
}
