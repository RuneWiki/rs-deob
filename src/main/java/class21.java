import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 extends class129 {

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public int field409 = 0;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public int field402 = -1;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "Z")
    public boolean field405 = true;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public int field407 = -1;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Lmc;")
    public static class75 field390 = class30.method234(true, "p11_full");

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static int field401 = 1;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "[Lmc;")
    public static class75[] field387 = new class75[100];

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "[Laa;")
    public static class2[] field412 = new class2[1000];

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "Lmc;")
    private static class75 field413 = class30.method234(true, "K");

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "Lmc;")
    private static class75 field410 = class30.method234(true, "Loaded textures");

    @OriginalMember(owner = "client!db", name = "db", descriptor = "Lmc;")
    public static class75 field397 = field410;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Lmc;")
    public static class75 field386 = field413;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "Lmc;")
    public static class75 field400 = field413;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "Lkc;")
    public static class63 field411 = new class63(64);

    @OriginalMember(owner = "client!db", name = "Ab", descriptor = "Lmc;")
    private static class75 field420 = class30.method234(true, "Close");

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "[Lp;")
    public static class90[] field416 = new class90[256];

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "[Z")
    public static boolean[] field417 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

    @OriginalMember(owner = "client!db", name = "yb", descriptor = "[Lpc;")
    public static class93[] field418 = new class93[4];

    @OriginalMember(owner = "client!db", name = "Db", descriptor = "Lmc;")
    public static class75 field423 = field420;

    @OriginalMember(owner = "client!db", name = "Cb", descriptor = "[I")
    public static int[] field422 = new int[100];

    @OriginalMember(owner = "client!db", name = "Eb", descriptor = "Lmc;")
    public static class75 field424 = class30.method234(true, ":tradereq:");

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!db", name = "Bb", descriptor = "Ljava/awt/Frame;")
    public static Frame field421;

    @OriginalMember(owner = "client!db", name = "zb", descriptor = "Z")
    public static boolean field419;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLka;I)V", line = 26)
    private final void method143(int arg0, byte arg1, class61 arg2, int arg3) {
        field392++;
        int var5 = -12 % ((34 - arg1) / 42);
        if (arg0 == 1) {
            this.field409 = arg2.method510(-105);
        } else if (arg0 == 2) {
            this.field407 = arg2.method494(20471);
        } else if (arg0 == 5) {
            this.field405 = false;
        } else if (arg0 == 7) {
            this.field402 = arg2.method510(-61);
            return;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZZ)V", line = 65)
    public static final void method144(boolean arg0, boolean arg1) {
        field394++;
        for (int var2 = 0; var2 < class110.field2790; var2++) {
            int var3 = (class118.field2929[var2] << 14) + 536870912;
            class97 var4 = class12.field231[class118.field2929[var2]];
            if (var4 != null && var4.method395(28619) && var4.field2447.field764 == arg1 && var4.field2447.method268(-2743)) {
                int var5 = var4.field1233 >> 7;
                int var6 = var4.field1242 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field1263 == 1 && (var4.field1233 & 0x7F) == 64 && (var4.field1242 & 0x7F) == 64) {
                        if (class91.field2258[var5][var6] == class112.field2842) {
                            continue;
                        }
                        class91.field2258[var5][var6] = class112.field2842;
                    }
                    if (!var4.field2447.field777) {
                        var3 += Integer.MIN_VALUE;
                    }
                    class107.field2679.method189(class99.field2510, var4.field1233, var4.field1242, class126.method1000(var4.field1263 * 64 + var4.field1242 - 64, class99.field2510, false, (var4.field1263 - 1) * 64 + var4.field1233), var4.field1263 * 64 - 4, var4, var4.field1220, var3, var4.field1208);
                }
            }
        }
        if (!arg0) {
            method153(0);
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V", line = 115)
    public static void method145(int arg0) {
        field417 = null;
        field412 = null;
        field387 = null;
        if (arg0 != 14779) {
            method153(98);
        }
        field421 = null;
        field397 = null;
        field411 = null;
        field416 = null;
        field422 = null;
        field390 = null;
        field410 = null;
        field413 = null;
        field386 = null;
        field424 = null;
        field423 = null;
        field420 = null;
        field400 = null;
        field418 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V", line = 142)
    private final void method146(int arg0, byte arg1) {
        field399++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        int var5 = 90 % ((-arg1 - 45) / 57);
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var3;
        double var10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (var10 < var3) {
            var8 = var10;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var12 = var3;
        if (var10 > var3) {
            var12 = var10;
        }
        double var14 = 0.0D;
        if (var12 < var6) {
            var12 = var6;
        }
        double var16 = (var8 + var12) / 2.0D;
        this.field408 = (int) (var16 * 256.0D);
        if (this.field408 < 0) {
            this.field408 = 0;
        } else if (this.field408 > 255) {
            this.field408 = 255;
        }
        double var18 = 0.0D;
        if (var8 != var12) {
            if (var16 < 0.5D) {
                var18 = (var12 - var8) / (var8 + var12);
            }
            if (var3 == var12) {
                var14 = (var10 - var6) / (var12 - var8);
            } else if (var10 == var12) {
                var14 = (var6 - var3) / (-var8 + var12) + 2.0D;
            } else if (var6 == var12) {
                var14 = (var3 - var10) / (-var8 + var12) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var18 = (var12 - var8) / (2.0D - var12 - var8);
            }
        }
        double var20 = var14 / 6.0D;
        this.field396 = (int) (var18 * 256.0D);
        this.field391 = (int) (var20 * 256.0D);
        if (this.field396 < 0) {
            this.field396 = 0;
        } else if (this.field396 > 255) {
            this.field396 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z", line = 223)
    public static final boolean method147(byte arg0) {
        if (arg0 < 120) {
            field423 = null;
        }
        field404++;
        return class37.field887 != null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 246)
    public static final void method148(byte arg0) {
        field415++;
        try {
            Graphics var1 = class108.field2738.getGraphics();
            class55.field1394.method403(17, (byte) -80, var1, 357);
        } catch (Exception var2) {
            class108.field2738.repaint();
        }
        if (arg0 <= 77) {
            field420 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)V", line = 263)
    public static final void method149(int arg0, long arg1) {
        if (arg0 != -9224) {
            method148((byte) 104);
        }
        field393++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class12.field226; var3++) {
            if (class104.field2649[var3] == arg1) {
                class12.field226--;
                class87.field2154++;
                class108.field2743 = true;
                for (int var4 = var3; var4 < class12.field226; var4++) {
                    class12.field242[var4] = class12.field242[var4 + 1];
                    class131.field3186[var4] = class131.field3186[var4 + 1];
                    class104.field2649[var4] = class104.field2649[var4 + 1];
                }
                class118.field2923.method707(arg0 ^ 0x247F, 48);
                class118.field2923.method501((byte) 46, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILka;I)V", line = 308)
    public final void method150(int arg0, class61 arg1, int arg2) {
        if (arg2 != 16846) {
            return;
        }
        while (true) {
            int var4 = arg1.method494(20471);
            if (var4 == 0) {
                field395++;
                return;
            }
            this.method143(var4, (byte) -64, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)I", line = 333)
    public static final int method151(int arg0, int arg1, int arg2, int arg3) {
        field388++;
        int var4 = 256 - arg1;
        return arg2 == 16711935 ? ((arg0 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg1 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) >> 8 : 85;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V", line = 349)
    public final void method152(int arg0) {
        field406++;
        if (this.field402 != -1) {
            this.method146(this.field402, (byte) 14);
            this.field403 = this.field396;
            this.field414 = this.field391;
            this.field398 = this.field408;
        }
        this.method146(this.field409, (byte) 105);
        if (arg0 != 20993) {
            field397 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V", line = 403)
    public static final void method153(int arg0) {
        class40.field969.field1752 = 0;
        field389++;
        class63.field1673 = true;
        class129.field3140 = 0;
        class126.field3074 = 0;
        class118.field2921 = 0;
        class55.field1406 = 0;
        class79.field2003 = 0;
        class8.field148 = 0;
        class61.field1584 = 0;
        class47.field1129 = 0;
        class125.field3052 = 0;
        class28.field604 = 0;
        class10.field156 = 0;
        class47.field1146 = 0;
        class61.field1596 = 0;
        class41.field977 = 0;
        class119.field2931 = 0;
        class119.field2936 = 0;
        class34.field770 = 0;
        class61.field1552 = 0;
        class41.field996 = 0;
        class55.field1371 = 0;
        class55.field1372 = 0;
        class41.field983 = 0;
        class17.field357 = 0;
        class30.field669 = 0;
        class74.field1830 = 0;
        class72.field1825 = 0;
        class28.field598 = 0;
        class44.field1039 = 0;
        class75.field1905 = 0;
        class86.field2123 = 0;
        client.field372 = 0;
        class50.field1238 = 0;
        class55.field1399 = 0;
        class50.field1257 = 0;
        class76.field1938 = 0;
        class122.field2999 = 0;
        class75.field1878 = 0;
        class47.field1120 = 0;
        class74.field1838 = 0;
        class47.field1153 = 0;
        class110.field2781 = 0;
        field389 = 0;
        class59.field1496 = 0;
        class58.field1454 = 0;
        class126.field3086 = 0;
        class47.field1136 = 0;
        class122.field2993 = 0;
        class112.field2839 = 0;
        class85.field2098 = 0;
        class44.field1059 = 0;
        class12.field229 = 0;
        class38.field918 = 0;
        class91.field2253 = 0;
        class7.field110 = 0;
        class12.field238 = 0;
        class61.field1554 = 0;
        class31.field690 = 0;
        class65.field1705 = 0;
        class84.field2063 = 0;
        class114.field2867 = 0;
        class26.field513 = 0;
        class92.field2274 = 0;
        class94.field2378 = 0;
        class127.field3114 = 0;
        class99.field2513 = 0;
        class1.field16 = 0;
        class79.field1989 = 0;
        class75.field1888 = 0;
        class75.field1880 = 0;
        class119.field2937 = 0;
        class55.field1351 = 0;
        class107.field2664 = 0;
        class107.field2672 = 0;
        class75.field1910 = 0;
        class97.field2452 = 0;
        class122.field2994 = 0;
        class36.field869 = 0;
        class44.field1066 = 0;
        class88.field2162 = 0;
        class70.field1777 = 0;
        class75.field1886 = 0;
        class97.field2440 = 0;
        class96.field2430 = 0;
        class38.field909 = 0;
        class44.field1051 = 0;
        class108.field2718 = 0;
        class55.field1374 = 0;
        class61.field1559 = 0;
        class64.field1697 = 0;
        class62.field1650 = 0;
        class8.field144 = 0;
        class85.field2103 = 0;
        class8.field135 = 0;
        class79.field2000 = 0;
        class43.field1027 = 0;
        class91.field2237 = 0;
        class79.field2002 = 0;
        class15.field286 = 0;
        class75.field1863 = 0;
        class43.field1026 = 0;
        class58.field1451 = 0;
        class61.field1586 = 0;
        class128.field3131 = 0;
        class47.field1147 = 0;
        class45.field1084 = 0;
        class125.field3048 = 0;
        class17.field342 = 0;
        field388 = 0;
        class10.field206 = 0;
        class74.field1842 = 0;
        class17.field349 = 0;
        class56.field1425 = 0;
        class34.field786 = 0;
        class88.field2164 = 0;
        class84.field2077 = 0;
        class24.field463 = 0;
        class47.field1155 = 0;
        class32.field710 = 0;
        class37.field886 = 0;
        class43.field1021 = 0;
        class62.field1633 = 0;
        class59.field1516 = 0;
        class85.field2096 = 0;
        class79.field1997 = 0;
        class47.field1126 = 0;
        class26.field525 = 0;
        class112.field2832 = 0;
        class82.field2037 = 0;
        class50.field1221 = 0;
        class17.field353 = 0;
        class61.field1606 = 0;
        class50.field1225 = 0;
        class65.field1714 = 0;
        class41.field979 = 0;
        class108.field2730 = 0;
        class82.field2038 = 0;
        class87.field2147 = 0;
        class47.field1148 = 0;
        class27.field573 = 0;
        class90.field2198 = 0;
        class75.field1862 = 0;
        class104.field2629 = 0;
        class63.field1657 = 0;
        field394 = 0;
        class110.field2794 = 0;
        class99.field2502 = 0;
        class90.field2205 = 0;
        class76.field1930 = 0;
        class63.field1662 = 0;
        class16.field312 = 0;
        class35.field840 = 0;
        class122.field2965 = 0;
        class47.field1158 = 0;
        class126.field3085 = 0;
        class17.field341 = 0;
        class100.field2591 = 0;
        class30.field679 = 0;
        class111.field2816 = 0;
        class52.field1294 = 0;
        class75.field1913 = 0;
        class17.field339 = 0;
        class30.field683 = 0;
        class8.field134 = 0;
        class40.field955 = 0;
        class75.field1914 = 0;
        class117.field2895 = 0;
        class110.field2799 = 0;
        class86.field2116 = 0;
        class100.field2568 = 0;
        class108.field2715 = 0;
        class76.field1927 = 0;
        client.field367 = 0;
        class107.field2661 = 0;
        class97.field2445 = 0;
        class15.field274 = 0;
        class62.field1641 = 0;
        class47.field1163 = 0;
        class50.field1201 = 0;
        class97.field2441 = 0;
        class76.field1945 = 0;
        class61.field1604 = 0;
        class70.field1788 = 0;
        class94.field2364 = 0;
        class50.field1222 = 0;
        class108.field2748 = 0;
        class47.field1131 = 0;
        class91.field2228 = 0;
        class117.field2915 = 0;
        class47.field1117 = 0;
        class63.field1665 = 0;
        class10.field165 = 0;
        class87.field2148 = 0;
        class25.field494 = 0;
        class5.field69 = 0;
        class58.field1461 = 0;
        class52.field1310 = 0;
        class43.field1028 = 0;
        class119.field2941 = 0;
        class10.field163 = 0;
        class23.field454 = 0;
        class58.field1452 = 0;
        class34.field789 = 0;
        class52.field1308 = 0;
        class75.field1904 = 0;
        class55.field1387 = 0;
        class23.field453 = 0;
        class34.field799 = 0;
        class117.field2892 = 0;
        class71.field1811 = 0;
        class58.field1458 = 0;
        class44.field1038 = 0;
        class122.field2995 = 0;
        class84.field2054 = 0;
        class10.field191 = 0;
        class69.field1770 = 0;
        class61.field1566 = 0;
        class111.field2815 = 0;
        class47.field1151 = 0;
        class61.field1599 = 0;
        class108.field2720 = 0;
        class38.field902 = 0;
        class62.field1617 = 0;
        class75.field1907 = 0;
        class15.field276 = 0;
        class61.field1571 = 0;
        class55.field1396 = 0;
        class35.field835 = 0;
        class23.field444 = 0;
        class104.field2631 = 0;
        class61.field1567 = 0;
        class90.field2195 = 0;
        class34.field775 = 0;
        class84.field2072 = 0;
        class61.field1575 = 0;
        class47.field1123 = 0;
        class75.field1892 = 0;
        class55.field1369 = 0;
        class97.field2439 = 0;
        class122.field2966 = 0;
        field393 = 0;
        class108.field2703 = 0;
        class50.field1231 = 0;
        class61.field1581 = 0;
        class61.field1569 = 0;
        class41.field984 = 0;
        class36.field856 = 0;
        class8.field139 = 0;
        class128.field3125 = 0;
        class70.field1785 = 0;
        class44.field1060 = 0;
        class10.field176 = 0;
        class1.field19 = 0;
        class88.field2168 = 0;
        class76.field1918 = 0;
        class107.field2683 = 0;
        class91.field2263 = 0;
        class15.field262 = 0;
        class57.field1442 = 0;
        class42.field1014 = 0;
        class125.field3058 = 0;
        class84.field2066 = 0;
        class61.field1583 = 0;
        class109.field2762 = 0;
        class32.field716 = 0;
        class25.field484 = 0;
        class10.field217 = 0;
        class75.field1884 = 0;
        class96.field2410 = 0;
        field415 = 0;
        class92.field2273 = 0;
        class74.field1840 = 0;
        class109.field2779 = 0;
        class98.field2462 = 0;
        class63.field1658 = 0;
        class47.field1118 = 0;
        class61.field1550 = 0;
        class52.field1297 = 0;
        class34.field804 = 0;
        class126.field3081 = 0;
        class8.field132 = 0;
        class111.field2805 = 0;
        class107.field2693 = 0;
        class8.field130 = 0;
        class37.field890 = 0;
        class41.field988 = 0;
        class82.field2034 = 0;
        class26.field518 = 0;
        class64.field1684 = 0;
        class52.field1304 = 0;
        class112.field2830 = 0;
        class69.field1754 = 0;
        class82.field2036 = 0;
        class122.field2979 = 0;
        class61.field1558 = 0;
        class34.field805 = 0;
        class61.field1598 = 0;
        class10.field170 = 0;
        class88.field2163 = 0;
        class118.field2917 = 0;
        class47.field1137 = 0;
        field395 = 0;
        class43.field1029 = 0;
        class32.field721 = 0;
        class87.field2154 = 0;
        class55.field1385 = 0;
        class16.field303 = 0;
        class101.field2601 = 0;
        class75.field1883 = 0;
        class40.field944 = 0;
        class70.field1774 = 0;
        class94.field2362 = 0;
        class117.field2912 = 0;
        class58.field1460 = 0;
        class122.field2981 = 0;
        class75.field1889 = 0;
        class59.field1523 = 0;
        class128.field3130 = 0;
        class90.field2204 = 0;
        client.field365 = 0;
        class109.field2754 = 0;
        class117.field2913 = 0;
        class55.field1391 = 0;
        class32.field713 = 0;
        class10.field166 = 0;
        class55.field1408 = 0;
        class61.field1579 = 0;
        class75.field1870 = 0;
        class107.field2681 = 0;
        class7.field102 = 0;
        class47.field1162 = 0;
        class27.field550 = 0;
        class101.field2604 = 0;
        class107.field2686 = 0;
        class128.field3116 = 0;
        class74.field1834 = 0;
        class10.field208 = 0;
        class52.field1298 = arg0;
        class47.field1144 = 0;
        class61.field1580 = 0;
        class127.field3098 = 0;
        class74.field1832 = 0;
        class45.field1093 = 0;
        class84.field2065 = 0;
        class32.field718 = 0;
        class44.field1041 = 0;
        class111.field2806 = 0;
        class122.field2996 = 0;
        class40.field946 = 0;
        class107.field2670 = 0;
        class61.field1605 = 0;
        class15.field266 = 0;
        class7.field105 = 0;
        class23.field447 = 0;
        class35.field831 = 0;
        class68.field1743 = 0;
        class62.field1646 = 0;
        class55.field1355 = 0;
        class70.field1787 = 0;
        class111.field2803 = 0;
        field404 = 0;
        class32.field711 = 0;
        class75.field1900 = 0;
        field399 = 0;
        client.field362 = 0;
        class91.field2247 = 0;
        class17.field334 = 0;
        class38.field912 = 0;
        class82.field2035 = 0;
        class61.field1594 = 0;
        class61.field1610 = 0;
        class16.field307 = 0;
        class117.field2899 = 0;
        class76.field1919 = 0;
        class10.field212 = 0;
        class75.field1898 = 0;
        class75.field1897 = 0;
        class74.field1835 = 0;
        class31.field686 = 0;
        class1.field26 = 0;
        class52.field1291 = 0;
        class129.field3138 = 0;
        class99.field2541 = 0;
        class61.field1570 = 0;
        class70.field1783 = 0;
        class75.field1915 = 0;
        class69.field1753 = 0;
        class74.field1841 = 0;
        class88.field2167 = 0;
        class26.field516 = 0;
        class50.field1205 = 0;
        class85.field2088 = 0;
        class85.field2094 = 0;
        class99.field2484 = 0;
        class47.field1143 = 0;
        class52.field1303 = 0;
        class34.field794 = 0;
        class63.field1656 = 0;
        class23.field452 = 0;
        class84.field2064 = 0;
        class118.field2922 = 0;
        class84.field2059 = 0;
        class47.field1160 = 0;
        class70.field1786 = 0;
        class86.field2122 = 0;
        class58.field1456 = 0;
        class26.field519 = 0;
        class47.field1132 = 0;
        class84.field2058 = 0;
        class62.field1620 = 0;
        class47.field1165 = 0;
        class55.field1356 = 0;
        class79.field2006 = 0;
        class34.field785 = 0;
        class50.field1251 = 0;
        class38.field908 = 0;
        class61.field1547 = 0;
        class37.field882 = 0;
        class71.field1801 = 0;
        class27.field581 = 0;
        class64.field1691 = 0;
        class10.field159 = 0;
        class122.field3004 = 0;
        class32.field715 = 0;
        class59.field1503 = 0;
        class40.field960 = 0;
        class91.field2235 = 0;
        class38.field898 = 0;
        class35.field850 = 0;
        class101.field2607 = 0;
        class7.field98 = 0;
        class8.field141 = 0;
        class43.field1030 = 0;
        class127.field3099 = 0;
        class86.field2114 = 0;
        class85.field2097 = 0;
        class32.field706 = 0;
        class62.field1640 = 0;
        class75.field1879 = 0;
        class125.field3060 = 0;
        class74.field1833 = 0;
        class114.field2889 = 0;
        class15.field275 = 0;
        class32.field725 = 0;
        class16.field310 = 0;
        class62.field1615 = 0;
        class128.field3127 = 0;
        class41.field985 = 0;
        class75.field1902 = 0;
        class78.field1963 = 0;
        class90.field2193 = 0;
        class90.field2192 = 0;
        class38.field899 = 0;
        class44.field1049 = 0;
        class38.field920 = 0;
        class30.field667 = 0;
        class16.field302 = 0;
        class71.field1812 = 0;
        class75.field1896 = 0;
        class85.field2101 = 0;
        class6.field86 = 0;
        class122.field3001 = 0;
        class5.field70 = 0;
        class61.field1587 = 0;
        class127.field3104 = 0;
        class30.field677 = 0;
        class64.field1695 = 0;
        class61.field1602 = 0;
        class82.field2050 = 0;
        class90.field2189 = 0;
        class45.field1081 = 0;
        class47.field1152 = 0;
        class61.field1574 = 0;
        class75.field1916 = 0;
        class59.field1505 = 0;
        class90.field2207 = 0;
        class64.field1687 = 0;
        class16.field329 = 0;
        class131.field3188 = 0;
        class52.field1305 = 0;
        class122.field2969 = 0;
        class36.field864 = 0;
        class44.field1044 = 0;
        class59.field1519 = 0;
        class59.field1541 = 0;
        class85.field2108 = 0;
        class98.field2474 = 0;
        class6.field87 = 0;
        class52.field1283 = 0;
        class15.field268 = 0;
        class52.field1307 = 0;
        class84.field2075 = 0;
        class61.field1563 = 0;
        class10.field197 = 0;
        class76.field1937 = 0;
        class85.field2104 = 0;
        class86.field2130 = 0;
        class55.field1415 = 0;
        class94.field2361 = 0;
        class85.field2091 = 0;
        class122.field3000 = 0;
        class55.field1359 = 0;
        class61.field1560 = 0;
        class37.field884 = 0;
        class68.field1734 = 0;
        class24.field459 = 0;
        class84.field2070 = 0;
        class117.field2897 = 0;
        class61.field1565 = 0;
        class107.field2696 = 0;
        class50.field1260 = 0;
        class107.field2665 = 0;
        class97.field2438 = 0;
        class61.field1582 = 0;
        class45.field1079 = 0;
        class8.field145 = 0;
        class91.field2254 = 0;
        class15.field290 = 0;
        class8.field138 = 0;
        class88.field2156 = 0;
        class58.field1453 = 0;
        class61.field1585 = 0;
        class76.field1934 = 0;
        class59.field1511 = 0;
        class38.field907 = 0;
        class16.field305 = 0;
        class86.field2120 = 0;
        class56.field1435 = 0;
        class61.field1576 = 0;
        class84.field2073 = 0;
        class114.field2883 = 0;
        class55.field1368 = 0;
        class7.field95 = 0;
        class97.field2453 = 0;
        class15.field270 = 0;
        field392 = 0;
        class129.field3139 = 0;
        class63.field1663 = 0;
        class75.field1861 = 0;
        class91.field2256 = 0;
        class61.field1553 = 0;
        class42.field1009 = 0;
        class91.field2241 = 0;
        class52.field1292 = 0;
        class110.field2801 = 0;
        class31.field688 = 0;
        class108.field2725 = 0;
        class3.field52 = 0;
        class75.field1909 = 0;
        class34.field768 = 0;
        client.field373 = 0;
        class114.field2870 = 0;
        class61.field1564 = 0;
        class76.field1946 = 0;
        class75.field1860 = 0;
        class78.field1975 = 0;
        class129.field3135 = 0;
        class69.field1769 = 0;
        class10.field200 = 0;
        class10.field183 = 0;
        class92.field2278 = 0;
        class61.field1595 = 0;
        class96.field2412 = 0;
        class16.field317 = 0;
        class61.field1600 = 0;
        class50.field1218 = 0;
        class17.field356 = 0;
        class52.field1300 = 0;
        class70.field1796 = 0;
        class47.field1121 = 0;
        class126.field3082 = 0;
        class50.field1243 = 0;
        class109.field2772 = 0;
        class97.field2450 = 0;
        class119.field2942 = 0;
        class129.field3132 = 0;
        class35.field832 = 0;
        class61.field1573 = 0;
        class59.field1528 = 0;
        class128.field3122 = 0;
        class36.field875 = 0;
        class47.field1145 = 0;
        class37.field896 = 0;
        client.field360 = 0;
        class7.field120 = 0;
        class61.field1578 = 0;
        class90.field2203 = 0;
        class85.field2089 = 0;
        class90.field2199 = 0;
        class126.field3089 = 0;
        class64.field1681 = 0;
        class111.field2810 = 0;
        class61.field1568 = 0;
        class62.field1655 = 0;
        class91.field2251 = 0;
        class38.field905 = 0;
        class75.field1890 = 0;
        class41.field975 = 0;
        class61.field1546 = 0;
        class61.field1557 = 0;
        class44.field1054 = 0;
        class55.field1380 = 0;
        class99.field2491 = 0;
        class90.field2201 = 0;
        class122.field2971 = 0;
        class55.field1397 = 0;
        class13.field255 = 0;
        class5.field65 = 0;
        class79.field1988 = 0;
        class35.field829 = 0;
        class10.field173 = 0;
        class8.field129 = 0;
        class91.field2226 = 0;
        class16.field313 = 0;
        class107.field2680 = 0;
        class56.field1426 = 0;
        class40.field945 = 0;
        class5.field74 = 0;
        class17.field355 = 0;
        class55.field1416 = 0;
        class52.field1296 = 0;
        class55.field1376 = 0;
        class55.field1389 = 0;
        class47.field1138 = 0;
        class71.field1809 = 0;
        class63.field1659 = 0;
        class43.field1023 = 0;
        class114.field2882 = 0;
        class52.field1302 = 0;
        class32.field728 = 0;
        class57.field1439 = 0;
        class98.field2468 = 0;
        class75.field1876 = 0;
        class82.field2032 = 0;
        class126.field3077 = 0;
        class55.field1409 = 0;
        class52.field1286 = 0;
        class8.field137 = 0;
        class129.field3148 = 0;
        class71.field1815 = 0;
        class99.field2526 = 0;
        class8.field127 = 0;
        class75.field1911 = 0;
        class75.field1887 = 0;
        class96.field2405 = 0;
        class61.field1601 = 0;
        class61.field1548 = 0;
        class30.field673 = 0;
        class126.field3083 = 0;
        class86.field2135 = 0;
        class45.field1082 = 0;
        class85.field2095 = 0;
        class107.field2667 = 0;
        class104.field2635 = 0;
        class92.field2271 = 0;
        class40.field953 = 0;
        class101.field2609 = 0;
        class85.field2090 = 0;
        class30.field678 = 0;
        class130.field3158 = 0;
        class85.field2099 = 0;
        class75.field1874 = 0;
        class32.field709 = 0;
        class61.field1588 = 0;
        class47.field1159 = 0;
        class84.field2060 = 0;
        class62.field1637 = 0;
        class47.field1142 = 0;
        class118.field2918 = 0;
        class25.field496 = 0;
        class61.field1551 = 0;
        class84.field2076 = 0;
        class13.field253 = 0;
        class107.field2677 = 0;
        class16.field299 = 0;
        class37.field883 = 0;
        class69.field1764 = 0;
        class122.field2975 = 0;
        class25.field492 = 0;
        class61.field1555 = 0;
        class63.field1661 = 0;
        class91.field2259 = 0;
        field406 = 0;
        client.field363 = 0;
        class10.field195 = 0;
        class12.field239 = 0;
        class50.field1202 = 0;
        class68.field1751 = 0;
        class59.field1495 = 0;
        class126.field3084 = 0;
        class10.field154 = 0;
        class107.field2663 = 0;
        class55.field1411 = 0;
        client.field368 = 0;
        class118.field2919 = 0;
        class55.field1398 = 0;
        class31.field687 = 0;
        class75.field1864 = 0;
        class99.field2533 = 0;
        class7.field117 = 0;
        class10.field164 = 0;
        class23.field450 = 0;
        class117.field2914 = 0;
        class112.field2846 = 0;
        class40.field954 = 0;
        class110.field2789 = 0;
        class61.field1590 = 0;
        class24.field477 = 0;
        class71.field1800 = 0;
        class107.field2657 = 0;
        class131.field3190 = 0;
        class126.field3091 = 0;
        class41.field973 = 0;
        class59.field1515 = 0;
        class52.field1299 = 0;
        class131.field3183 = 0;
        client.field369 = 0;
        class75.field1901 = 0;
        class109.field2757 = 0;
        class61.field1561 = 0;
        class78.field1954 = 0;
        class75.field1875 = 0;
        class30.field674 = 0;
        class6.field84 = 0;
        class100.field2567 = 0;
        class68.field1748 = 0;
        class71.field1808 = 0;
        class47.field1119 = 0;
        class10.field202 = 0;
        class55.field1392 = 0;
        class8.field128 = 0;
        class8.field149 = 0;
        class75.field1871 = 0;
        class47.field1156 = 0;
        class34.field798 = 0;
        class44.field1052 = 0;
        client.field366 = 0;
        class31.field685 = 0;
        client.field370 = 0;
        class122.field2997 = 0;
        class7.field101 = 0;
        class12.field246 = 0;
        class3.field45 = 0;
        class55.field1414 = 0;
        class122.field2972 = 0;
        class8.field152 = 0;
        client.field371 = 0;
        class131.field3175 = 0;
        class111.field2808 = 0;
        class79.field1999 = 0;
        class90.field2182 = 0;
        class90.field2186 = 0;
        class55.field1393 = 0;
        class84.field2084 = 0;
        class23.field451 = 0;
        class76.field1924 = 0;
        class61.field1603 = 0;
        class12.field244 = 0;
        class87.field2151 = 0;
        class92.field2269 = 0;
        class109.field2749 = 0;
        class15.field291 = 0;
        class108.field2745 = 0;
        class75.field1885 = 0;
        class86.field2112 = 0;
        class1.field12 = 0;
        class87.field2144 = 0;
        class56.field1417 = 0;
        class63.field1660 = 0;
        class84.field2061 = 0;
        class61.field1589 = 0;
        class75.field1865 = 0;
        class78.field1977 = 0;
        class82.field2033 = 0;
        class44.field1062 = 0;
        class47.field1167 = 0;
        class117.field2902 = 0;
        class76.field1947 = 0;
        class126.field3079 = 0;
        class90.field2183 = 0;
        class8.field125 = 0;
        class117.field2910 = 0;
        class34.field806 = 0;
        class47.field1135 = 0;
        class75.field1873 = 0;
        class86.field2136 = 0;
        class7.field115 = 0;
        class90.field2184 = 0;
        class47.field1164 = 0;
        class74.field1837 = 0;
        class40.field956 = 0;
        class99.field2532 = 0;
        class98.field2479 = 0;
        class1.field7 = 0;
        class15.field271 = 0;
        class35.field836 = 0;
        class87.field2146 = 0;
        class34.field813 = 0;
        class44.field1050 = 0;
        class7.field103 = 0;
        class100.field2573 = 0;
        class37.field891 = 0;
        class111.field2811 = 0;
        class92.field2275 = 0;
        class104.field2637 = 0;
        class104.field2628 = 0;
        class88.field2166 = 0;
        class1.field14 = 0;
        class129.field3134 = 0;
        class109.field2758 = 0;
        class79.field1981 = 0;
        class104.field2634 = 0;
        class63.field1671 = true;
        class92.field2281 = 0L;
        class122.method955(-10224);
        class118.field2923.field1556 = 0;
        class42.field1008 = -1;
        class97.field2448.field1556 = 0;
        class107.field2692 = -1;
        class100.field2585 = 0;
        class101.field2613 = 0;
        class117.field2908 = 0;
        class117.field2896 = -1;
        class62.field1648 = -1;
        class15.field283 = false;
        class32.field727 = 0;
        class8.field122 = 0;
        class31.method240(arg0 + 29837, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            field387[var1] = null;
        }
        class74.field1853 = 0;
        class17.field332 = 0;
        class91.field2230 = (int) (Math.random() * 30.0D) - 20;
        class88.field2160 = -1;
        class97.field2455 = (int) (Math.random() * 120.0D) - 60;
        class96.field2417 = 0;
        class37.field892 = 0;
        class84.field2067 = (int) (Math.random() * 80.0D) - 40;
        class127.field3108 = (int) (Math.random() * 100.0D) - 50;
        class42.field1013 = 0;
        class38.field906 = (int) (Math.random() * 110.0D) - 55;
        class43.field1025 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class34.field783 = 0;
        class110.field2790 = 0;
        class79.field1993 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class40.field957[var2] = null;
            class96.field2424[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class12.field231[var3] = null;
        }
        class52.field1315 = class40.field957[2047] = new class122();
        class52.field1312.method256(false);
        class31.field689.method256(false);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class112.field2847[var4][var6][var7] = null;
                }
            }
        }
        class40.field949 = new class32();
        class12.field226 = 0;
        class119.field2945 = 0;
        class71.method598((byte) 83, class55.field1377);
        class55.field1377 = -1;
        class71.method598((byte) 104, class130.field3161);
        class130.field3161 = -1;
        class71.method598((byte) 77, class130.field3155);
        class130.field3155 = -1;
        class71.method598((byte) -106, class52.field1320);
        class52.field1320 = -1;
        class71.method598((byte) -71, class69.field1766);
        class69.field1766 = -1;
        class71.method598((byte) 115, class36.field868);
        class36.field868 = -1;
        class71.method598((byte) 96, class36.field876);
        class32.field732 = null;
        class130.field3167 = 3;
        class128.field3124 = 0;
        class72.field1824 = 0;
        class43.field1032 = -1;
        class15.field283 = false;
        class99.field2485 = false;
        class75.field1894 = false;
        class36.field876 = -1;
        class118.field2920.method343(false, new int[5], null, (byte) -123, -1);
        for (int var5 = 0; var5 < 5; var5++) {
            class68.field1738[var5] = null;
            class75.field1881[var5] = false;
        }
        class41.field994 = true;
    }
}
