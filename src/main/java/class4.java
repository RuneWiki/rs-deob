import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class4 {

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lae;")
    private static class6 field40 = class64.method474(111, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
    public static int[] field47 = new int[2048];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lae;")
    public static class6 field52 = field40;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lae;")
    public static class6 field51 = class64.method474(115, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    private static int field42 = 50;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
    private static int[] field44 = new int[field42];

    @OriginalMember(owner = "client!a", name = "q", descriptor = "[I")
    private static int[] field46 = new int[field42];

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    private static int[] field31 = new int[field42];

    @OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
    private static int[] field49 = new int[field42];

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
    private static int[] field32 = new int[field42];

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[Lae;")
    private static class6[] field41 = new class6[field42];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
    private static int[] field50 = new int[field42];

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    private static int[] field43 = new int[field42];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lcc;")
    public static class17 field35;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V", line = 20)
    public static final void method16(int arg0, boolean arg1) {
        field38++;
        if (arg0 != -11) {
            return;
        }
        for (int var2 = 0; var2 < class138.field3365; var2++) {
            class2 var3 = class49.field1097[class42.field967[var2]];
            int var4 = (class42.field967[var2] << 14) + 536870912;
            if (var3 != null && var3.method9((byte) -77) && var3.field11.field2366 == arg1 && var3.field11.method837(true)) {
                int var5 = var3.field1783 >> 7;
                int var6 = var3.field1752 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field1777 == 1 && (var3.field1783 & 0x7F) == 64 && (var3.field1752 & 0x7F) == 64) {
                        if (class38.field877[var5][var6] == class80.field1946) {
                            continue;
                        }
                        class38.field877[var5][var6] = class80.field1946;
                    }
                    if (!var3.field11.field2370) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class81.field1967.method540(class15.field305, var3.field1783, var3.field1752, class20.method193((var3.field1777 - 1) * 64 + var3.field1752, 9990, class15.field305, var3.field1783 + (var3.field1777 - 1) * 64), var3.field1777 * 64 - 4, var3, var3.field1722, var4, var3.field1778);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lee;", line = 71)
    public static final class32 method17(int arg0, int arg1) {
        field37++;
        class32 var2 = (class32) class82.field1998.method128((byte) 127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class57.field1249.method160(30605, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class32 var4 = new class32();
        class77 var5 = new class77(var3);
        var5.field1821 = var5.field1858.length - 12;
        int var6 = var5.method647((byte) -72);
        var4.field798 = var5.method636(102);
        var4.field797 = var5.method636(109);
        if (arg0 != 19506) {
            method20(3);
        }
        var4.field795 = var5.method636(108);
        int var7 = 0;
        var4.field787 = var5.method636(arg0 ^ 0xFFFFB39D);
        var4.field796 = new class6[var6];
        var4.field778 = new int[var6];
        var4.field780 = new int[var6];
        var5.field1821 = 0;
        while (var5.field1821 < var5.field1858.length - 12) {
            int var8 = var5.method636(127);
            if (var8 == 3) {
                var4.field796[var7] = var5.method660((byte) -12);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field780[var7] = var5.method620((byte) -8);
            } else {
                var4.field780[var7] = var5.method647((byte) -72);
            }
            var4.field778[var7++] = var8;
        }
        class82.field1998.method130(var4, (long) arg1, (byte) 96);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 129)
    public static void method18(int arg0) {
        field40 = null;
        field50 = null;
        field35 = null;
        field32 = null;
        field47 = null;
        field51 = null;
        field49 = null;
        field52 = null;
        field46 = null;
        field31 = null;
        field41 = null;
        field44 = null;
        field43 = null;
        if (arg0 != 29053) {
            field43 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 154)
    public static final void method19(boolean arg0) {
        class79.field1939 = 0;
        field30++;
        for (int var1 = -1; var1 < class47.field1065 + class138.field3365; var1++) {
            class76 var18;
            if (var1 == -1) {
                var18 = class12.field229;
            } else if (class47.field1065 > var1) {
                var18 = class20.field387[field47[var1]];
            } else {
                var18 = class49.field1097[class42.field967[var1 - class47.field1065]];
            }
            if (var18 != null && var18.method9((byte) -77)) {
                if (var18 instanceof class2) {
                    class100 var19 = ((class2) var18).field11;
                    if (var19.field2361 != null) {
                        var19 = var19.method842(5585);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class47.field1065 <= var1) {
                    class100 var22 = ((class2) var18).field11;
                    if (var22.field2348 >= 0 && class122.field3003.length > var22.field2348) {
                        class61.method455((byte) -11, var18.field1790 + 15, var18);
                        if (class20.field404 > -1) {
                            class122.field3003[var22.field2348].method850(class20.field404 - 12, class104.field2469 + -30);
                        }
                    }
                    if (class73.field1668 == 1 && class42.field967[var1 - class47.field1065] == class54.field1199 && class5.field61 % 20 < 10) {
                        class61.method455((byte) -11, var18.field1790 + 15, var18);
                        if (class20.field404 > -1) {
                            class27.field678[0].method850(class20.field404 - 12, class104.field2469 + -28);
                        }
                    }
                } else {
                    class66 var20 = (class66) var18;
                    int var21 = 30;
                    if (var20.field1439 != -1 || var20.field1437 != -1) {
                        class61.method455((byte) -11, var18.field1790 + 15, var18);
                        if (class20.field404 > -1) {
                            if (var20.field1439 != -1) {
                                class59.field1305[var20.field1439].method850(class20.field404 - 12, -var21 + class104.field2469);
                                var21 += 25;
                            }
                            if (var20.field1437 != -1) {
                                class122.field3003[var20.field1437].method850(class20.field404 - 12, -var21 + class104.field2469);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class73.field1668 == 10 && field47[var1] == class60.field1310) {
                        class61.method455((byte) -11, var18.field1790 + 15, var18);
                        if (class20.field404 > -1) {
                            class27.field678[1].method850(class20.field404 - 12, -var21 + class104.field2469);
                        }
                    }
                }
                if (var18.field1775 != null && (var1 >= class47.field1065 || class116.field2725 == 0 || class116.field2725 == 3 || class116.field2725 == 1 && class6.method31(21469, ((class66) var18).field1456))) {
                    class61.method455((byte) -11, var18.field1790, var18);
                    if (class20.field404 > -1 && field42 > class79.field1939) {
                        field46[class79.field1939] = class56.field1229.method96(var18.field1775) / 2;
                        field44[class79.field1939] = class56.field1229.field184;
                        field31[class79.field1939] = class20.field404;
                        field49[class79.field1939] = class104.field2469;
                        field50[class79.field1939] = var18.field1776;
                        field43[class79.field1939] = var18.field1747;
                        field32[class79.field1939] = var18.field1730;
                        field41[class79.field1939] = var18.field1775;
                        class79.field1939++;
                    }
                }
                if (class5.field61 < var18.field1723) {
                    class61.method455((byte) -11, var18.field1790 + 15, var18);
                    if (class20.field404 > -1) {
                        int var23 = var18.field1801 * 30 / var18.field1745;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class74.method579(class20.field404 - 15, class104.field2469 - 3, var23, 5, 65280);
                        class74.method579(class20.field404 + var23 - 15, class104.field2469 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field1766[var24] > class5.field61) {
                        class61.method455((byte) -11, var18.field1790 / 2, var18);
                        if (class20.field404 > -1) {
                            if (var24 == 1) {
                                class104.field2469 -= 20;
                            }
                            if (var24 == 2) {
                                class104.field2469 -= 10;
                                class20.field404 -= 15;
                            }
                            if (var24 == 3) {
                                class20.field404 += 15;
                                class104.field2469 -= 10;
                            }
                            class118.field2819[var18.field1729[var24]].method850(class20.field404 - 12, class104.field2469 + -12);
                            class2.field15.method88(class114.method942((byte) 71, var18.field1749[var24]), class20.field404, class104.field2469 + 4, 0);
                            class2.field15.method88(class114.method942((byte) 71, var18.field1749[var24]), class20.field404 - 1, class104.field2469 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class79.field1939; var2++) {
            int var3 = field49[var2];
            int var4 = field44[var2];
            int var5 = field31[var2];
            int var6 = field46[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (var3 + 2 > field49[var17] + -field44[var17] && var3 - var4 < field49[var17] + 2 && field46[var17] + field31[var17] > -var6 + var5 && field31[var17] - field46[var17] < var5 + var6 && field49[var17] - field44[var17] < var3) {
                        var7 = true;
                        var3 = field49[var17] - field44[var17];
                    }
                }
            }
            class20.field404 = field31[var2];
            class104.field2469 = field49[var2] = var3;
            class6 var8 = field41[var2];
            if (class135.field3300 == 0) {
                int var9 = 16776960;
                if (field50[var2] < 6) {
                    var9 = class72.field1641[field50[var2]];
                }
                if (field50[var2] == 6) {
                    var9 = class80.field1946 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field50[var2] == 7) {
                    var9 = class80.field1946 % 20 >= 10 ? 65535 : 255;
                }
                if (field50[var2] == 8) {
                    var9 = class80.field1946 % 20 >= 10 ? 8454016 : 45056;
                }
                if (field50[var2] == 9) {
                    int var10 = 150 - field32[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (field50[var2] == 10) {
                    int var11 = 150 - field32[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 + 500 + 255 - var11 * 5 - 32768000;
                    }
                }
                if (field50[var2] == 11) {
                    int var12 = 150 - field32[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (field43[var2] == 0) {
                    class56.field1229.method88(var8, class20.field404, class104.field2469 + 1, 0);
                    class56.field1229.method88(var8, class20.field404, class104.field2469, var9);
                }
                if (field43[var2] == 1) {
                    class56.field1229.method97(var8, class20.field404, class104.field2469 + 1, 0, class80.field1946);
                    class56.field1229.method97(var8, class20.field404, class104.field2469, var9, class80.field1946);
                }
                if (field43[var2] == 2) {
                    class56.field1229.method103(var8, class20.field404, class104.field2469 + 1, 0, class80.field1946);
                    class56.field1229.method103(var8, class20.field404, class104.field2469, var9, class80.field1946);
                }
                if (field43[var2] == 3) {
                    class56.field1229.method85(var8, class20.field404, class104.field2469 + 1, 0, class80.field1946, 150 - field32[var2]);
                    class56.field1229.method85(var8, class20.field404, class104.field2469, var9, class80.field1946, 150 - field32[var2]);
                }
                if (field43[var2] == 4) {
                    int var13 = class56.field1229.method96(var8);
                    int var14 = (150 - field32[var2]) * (var13 + 100) / 150;
                    class74.method587(class20.field404 - 50, 0, class20.field404 + 50, 334);
                    class56.field1229.method106(var8, class20.field404 + 50 - var14, class104.field2469 + 1, 0);
                    class56.field1229.method106(var8, class20.field404 + 50 - var14, class104.field2469, var9);
                    class74.method583();
                }
                if (field43[var2] == 5) {
                    int var15 = 0;
                    int var16 = 150 - field32[var2];
                    class74.method587(0, class104.field2469 - class56.field1229.field184 - 1, 512, class104.field2469 + 5);
                    if (var16 < 25) {
                        var15 = var16 - 25;
                    } else if (var16 > 125) {
                        var15 = var16 - 125;
                    }
                    class56.field1229.method88(var8, class20.field404, var15 + class104.field2469 + 1, 0);
                    class56.field1229.method88(var8, class20.field404, class104.field2469 + var15, var9);
                    class74.method583();
                }
            } else {
                class56.field1229.method88(var8, class20.field404, class104.field2469 + 1, 0);
                class56.field1229.method88(var8, class20.field404, class104.field2469, 16776960);
            }
        }
        if (arg0) {
            method20(110);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 530)
    public static final void method20(int arg0) {
        field45++;
        int var1 = class65.field1425;
        int var2 = class20.field407;
        int var3 = class121.field2935;
        int var4 = 6116423;
        int var5 = class69.field1533;
        int var6 = -62 / ((20 - arg0) / 40);
        class74.method579(var3, var1, var2, var5, var4);
        class74.method579(var3 + 1, var1 + 1, var2 - 2, 16, 0);
        class74.method582(var3 + 1, var1 + 18, var2 - 2, var5 + -19, 0);
        class56.field1229.method106(class62.field1365, var3 + 3, var1 - -14, var4);
        int var7 = class57.field1244;
        int var8 = class117.field2771;
        if (class67.field1473 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (class67.field1473 == 1) {
            var8 -= 553;
            var7 -= 205;
        }
        if (class67.field1473 == 2) {
            var8 -= 17;
            var7 -= 357;
        }
        for (int var9 = 0; var9 < class85.field2058; var9++) {
            int var10 = 16777215;
            int var11 = var1 + (class85.field2058 + -1 + -var9) * 15 + 31;
            if (var3 < var8 && var2 + var3 > var8 && var7 > var11 - 13 && var7 < var11 + 3) {
                var10 = 16776960;
            }
            class56.field1229.method94(class57.field1247[var9], var3 + 3, var11, var10, true);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 607)
    public static final void method21(int arg0) {
        short var1 = 256;
        field36++;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class138.field3357[(var1 - 2 << 7) + var2] = 255;
            }
        }
        if (arg0 > -91) {
            method20(-127);
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 128.0D) + 128;
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (var14 << 7) + var15;
            class138.field3357[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class104.field2476[var13] = (class138.field3357[var13 - 1] + class138.field3357[var13 + 1] + class138.field3357[var13 - -128] + class138.field3357[var13 - 128]) / 4;
            }
        }
        class65.field1424 += 128;
        if (class65.field1424 > class12.field234.length) {
            int var5 = (int) (Math.random() * 12.0D);
            class65.field1424 -= class12.field234.length;
            class116.method954(class114.field2698[var5], (byte) -107);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = (var6 << 7) + var9;
                int var11 = class104.field2476[var10 + 128] - class12.field234[class65.field1424 + var10 & class12.field234.length + -1] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class138.field3357[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class69.field1541[var7] = class69.field1541[var7 + 1];
        }
        class69.field1541[var1 - 1] = (int) (Math.sin((double) class5.field61 / 14.0D) * 16.0D + Math.sin((double) class5.field61 / 15.0D) * 14.0D + Math.sin((double) class5.field61 / 16.0D) * 12.0D);
        if (class27.field683 > 0) {
            class27.field683 -= 4;
        }
        if (class80.field1960 > 0) {
            class80.field1960 -= 4;
        }
        if (class27.field683 != 0 || class80.field1960 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 0) {
            class27.field683 = 1024;
        }
        if (var8 == 1) {
            class80.field1960 = 1024;
            return;
        }
    }
}
