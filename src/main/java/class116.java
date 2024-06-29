import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class116 extends class107 {

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public int field2691 = -1;

    @OriginalMember(owner = "client!tb", name = "wb", descriptor = "I")
    public int field2705 = -1;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public int field2689 = 5;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public int field2692 = -1;

    @OriginalMember(owner = "client!tb", name = "vb", descriptor = "I")
    public int field2704 = -1;

    @OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
    public int field2711 = 2;

    @OriginalMember(owner = "client!tb", name = "Ab", descriptor = "Z")
    public boolean field2709 = false;

    @OriginalMember(owner = "client!tb", name = "Fb", descriptor = "I")
    public int field2714 = -1;

    @OriginalMember(owner = "client!tb", name = "zb", descriptor = "I")
    public int field2708 = 99;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field2694 = 0;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lrc;")
    public static class105 field2685 = class43.method374("Bitte versuchen Sie es erneut)3", 0);

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "I")
    public static int field2701 = -1;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
    public static int field2700 = 255;

    @OriginalMember(owner = "client!tb", name = "Db", descriptor = "[I")
    public static int[] field2712 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "Lle;")
    public static class71 field2702 = new class71(10);

    @OriginalMember(owner = "client!tb", name = "Jb", descriptor = "Lrc;")
    public static class105 field2718 = class43.method374("Fallen lassen", 0);

    @OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Lrc;")
    public static class105 field2716 = class43.method374("mapscene", 0);

    @OriginalMember(owner = "client!tb", name = "Ib", descriptor = "[Lsb;")
    public static class110[] field2717 = new class110[4];

    @OriginalMember(owner = "client!tb", name = "Kb", descriptor = "[I")
    public static int[] field2719 = new int[25];

    @OriginalMember(owner = "client!tb", name = "Nb", descriptor = "Lrc;")
    public static class105 field2722 = class43.method374("Hierhin gehen", 0);

    @OriginalMember(owner = "client!tb", name = "Lb", descriptor = "[[I")
    public static int[][] field2720 = new int[104][104];

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!tb", name = "ub", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!tb", name = "xb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!tb", name = "yb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!tb", name = "Gb", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!tb", name = "Ob", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lbd;")
    public static class11 field2695;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "[I")
    private int[] field2682;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "[I")
    public int[] field2683;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "[I")
    private int[] field2688;

    @OriginalMember(owner = "client!tb", name = "Eb", descriptor = "[I")
    public int[] field2713;

    @OriginalMember(owner = "client!tb", name = "Mb", descriptor = "[[B")
    public static byte[][] field2721;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V", line = 12)
    public static final void method938(int arg0) {
        field2699++;
        if (arg0 != -2) {
            method948(-127, -75, 125, -33, -125, -63, -71);
        }
        int var1 = class18.field389.method785(arg0 + 207, 8);
        if (class97.field2250 > var1) {
            for (int var2 = var1; var2 < class97.field2250; var2++) {
                class73.field1602[class58.field1237++] = class121.field2956[var2];
            }
        }
        if (class97.field2250 < var1) {
            throw new RuntimeException("gppov1");
        }
        class97.field2250 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class121.field2956[var3];
            class15 var5 = class58.field1303[var4];
            int var6 = class18.field389.method785(205, 1);
            if (var6 == 0) {
                class121.field2956[class97.field2250++] = var4;
                var5.field1269 = class104.field2351;
            } else {
                int var7 = class18.field389.method785(205, 2);
                if (var7 == 0) {
                    class121.field2956[class97.field2250++] = var4;
                    var5.field1269 = class104.field2351;
                    class122.field3001[class76.field1701++] = var4;
                } else if (var7 == 1) {
                    class121.field2956[class97.field2250++] = var4;
                    var5.field1269 = class104.field2351;
                    int var8 = class18.field389.method785(arg0 ^ 0xFFFFFF33, 3);
                    var5.method468(var8, 5, false);
                    int var9 = class18.field389.method785(205, 1);
                    if (var9 == 1) {
                        class122.field3001[class76.field1701++] = var4;
                    }
                } else if (var7 == 2) {
                    class121.field2956[class97.field2250++] = var4;
                    var5.field1269 = class104.field2351;
                    int var10 = class18.field389.method785(205, 3);
                    var5.method468(var10, 5, true);
                    int var11 = class18.field389.method785(205, 3);
                    var5.method468(var11, arg0 + 7, true);
                    int var12 = class18.field389.method785(205, 1);
                    if (var12 == 1) {
                        class122.field3001[class76.field1701++] = var4;
                    }
                } else if (var7 == 3) {
                    class73.field1602[class58.field1237++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Z", line = 112)
    public static final boolean method939(int arg0, byte arg1) {
        if (arg1 != 51) {
            field2695 = null;
        }
        field2696++;
        if (!class29.method273(arg0, 125)) {
            return false;
        }
        boolean var2 = false;
        class119[] var3 = class14.field282[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class119 var5 = var3[var4];
            if (var5 != null && var5.field2811 == 6) {
                if (var5.field2844 != -1 || var5.field2859 != -1) {
                    boolean var6 = class117.method952(var5, 67);
                    int var7;
                    if (var6) {
                        var7 = var5.field2859;
                    } else {
                        var7 = var5.field2844;
                    }
                    if (var7 != -1) {
                        class116 var8 = class6.method49(arg1 ^ 0x54, var7);
                        var5.field2878 += class59.field1319;
                        label57: while (true) {
                            do {
                                do {
                                    if (var8.field2683[var5.field2877] >= var5.field2878) {
                                        break label57;
                                    }
                                    var5.field2878 -= var8.field2683[var5.field2877];
                                    var2 = true;
                                    var5.field2877++;
                                } while (var8.field2713.length > var5.field2877);
                                var5.field2877 -= var8.field2692;
                            } while (var5.field2877 >= 0 && var8.field2713.length > var5.field2877);
                            var5.field2877 = 0;
                        }
                    }
                }
                if (var5.field2801 != 0 && !var5.field2800) {
                    var2 = true;
                    int var9 = var5.field2801 << 16 >> 16;
                    int var10 = class59.field1319 * var9;
                    int var11 = var5.field2801 >> 16;
                    var5.field2809 = var5.field2809 + var10 & 0x7FF;
                    int var12 = class59.field1319 * var11;
                    var5.field2823 = var5.field2823 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZLjb;)Ljb;", line = 196)
    public final class56 method940(int arg0, boolean arg1, class56 arg2) {
        if (arg1) {
            this.method943(null, false);
        }
        field2686++;
        int var4 = this.field2713[arg0];
        class61 var5 = class109.method885(105, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method439(true);
        } else {
            class56 var7 = arg2.method439(!var5.method487(var6, 0));
            var7.method443(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 221)
    public final void method941(int arg0) {
        if (this.field2691 == -1) {
            if (this.field2688 == null) {
                this.field2691 = 0;
            } else {
                this.field2691 = 2;
            }
        }
        if (arg0 <= 64) {
            field2716 = null;
        }
        field2710++;
        if (this.field2704 != -1) {
            return;
        }
        if (this.field2688 == null) {
            this.field2704 = 0;
        } else {
            this.field2704 = 2;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILte;)V", line = 253)
    public static final void method942(int arg0, class119 arg1) {
        field2706++;
        if (arg0 != 1) {
            field2717 = null;
        }
        int var2;
        if (arg1.field2867 < 0) {
            var2 = arg1.field2797 >> 16;
        } else {
            var2 = arg1.field2867 >> 16;
        }
        if (class1.field4 == var2 || class51.field1069 == var2) {
            class90.field2064 = true;
        }
        if (client.field424 == var2 || class120.field2901[class134.field3265] == var2) {
            class80.field1805 = true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lb;Z)V", line = 305)
    public final void method943(class7 arg0, boolean arg1) {
        field2703++;
        if (!arg1) {
            field2723 = 61;
        }
        while (true) {
            int var3 = arg0.method96(27023);
            if (var3 == 0) {
                return;
            }
            this.method950(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjb;I)Ljb;", line = 330)
    public final class56 method944(int arg0, class56 arg1, int arg2) {
        if (arg2 != 23858) {
            this.field2711 = 96;
        }
        field2697++;
        int var4 = this.field2713[arg0];
        class61 var5 = class109.method885(arg2 - 23768, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method432(true);
        } else {
            class56 var7 = arg1.method432(!var5.method487(var6, 0));
            var7.method443(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILtb;Ljb;I)Ljb;", line = 352)
    public final class56 method945(byte arg0, int arg1, class116 arg2, class56 arg3, int arg4) {
        int var6 = this.field2713[arg1];
        field2693++;
        class61 var7 = class109.method885(80, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method940(arg4, false, arg3);
        }
        if (arg0 >= -120) {
            method949((byte) 59);
        }
        int var9 = arg2.field2713[arg4];
        class61 var10 = class109.method885(95, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class56 var12 = arg3.method439(!var7.method487(var8, 0));
            var12.method443(var7, var8);
            return var12;
        } else {
            class56 var13 = arg3.method439(!var7.method487(var8, 0) & !var10.method487(var11, 0));
            var13.method423(var7, var8, var10, var11, this.field2688);
            return var13;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjb;IZ)Ljb;", line = 387)
    public final class56 method946(int arg0, class56 arg1, int arg2, boolean arg3) {
        int var5 = this.field2713[arg2];
        field2715++;
        if (arg3) {
            return null;
        }
        class61 var6 = class109.method885(98, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method439(true);
        }
        int var8 = arg0 & 0x3;
        class56 var9 = arg1.method439(!var6.method487(var7, 0));
        if (var8 == 1) {
            var9.method421();
        } else if (var8 == 2) {
            var9.method450();
        } else if (var8 == 3) {
            var9.method442();
        }
        var9.method443(var6, var7);
        if (var8 == 1) {
            var9.method442();
        } else if (var8 == 2) {
            var9.method450();
        } else if (var8 == 3) {
            var9.method421();
        }
        return var9;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZILjb;)Ljb;", line = 437)
    public final class56 method947(boolean arg0, int arg1, class56 arg2) {
        field2687++;
        int var4 = this.field2713[arg1];
        class61 var5 = class109.method885(83, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method439(true);
        }
        if (!arg0) {
            this.method950(-18, null, false);
        }
        class61 var7 = null;
        int var8 = 0;
        if (this.field2682 != null && this.field2682.length > arg1) {
            int var9 = this.field2682[arg1];
            var7 = class109.method885(103, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class56 var11 = arg2.method439(!var5.method487(var6, 0));
            var11.method443(var5, var6);
            return var11;
        } else {
            class56 var10 = arg2.method439(!var5.method487(var6, 0) & !var7.method487(var8, 0));
            var10.method443(var5, var6);
            var10.method443(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)I", line = 496)
    public static final int method948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2698++;
        if ((arg5 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg4;
        } else {
            if (arg0 != -13766) {
                method942(-29, null);
            }
            return var8 == 2 ? 7 + 1 - arg3 - arg1 : arg4;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 542)
    public static void method949(byte arg0) {
        field2685 = null;
        if (arg0 <= 41) {
            return;
        }
        field2712 = null;
        field2721 = null;
        field2702 = null;
        field2722 = null;
        field2718 = null;
        field2720 = null;
        field2717 = null;
        field2695 = null;
        field2716 = null;
        field2719 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILb;Z)V", line = 565)
    private final void method950(int arg0, class7 arg1, boolean arg2) {
        field2690++;
        if (arg0 == 1) {
            int var4 = arg1.method96(27023);
            this.field2683 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2683[var5] = arg1.method101(2);
            }
            this.field2713 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2713[var6] = arg1.method101(2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2713[var7] = (arg1.method101(2) << 16) + this.field2713[var7];
            }
        } else if (arg0 == 2) {
            this.field2692 = arg1.method101(2);
        } else if (arg0 == 3) {
            int var8 = arg1.method96(27023);
            this.field2688 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2688[var9] = arg1.method96(27023);
            }
            this.field2688[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field2709 = true;
        } else if (arg0 == 5) {
            this.field2689 = arg1.method96(27023);
        } else if (arg0 == 6) {
            this.field2705 = arg1.method101(2);
        } else if (arg0 == 7) {
            this.field2714 = arg1.method101(2);
        } else if (arg0 == 8) {
            this.field2708 = arg1.method96(27023);
        } else if (arg0 == 9) {
            this.field2691 = arg1.method96(27023);
        } else if (arg0 == 10) {
            this.field2704 = arg1.method96(27023);
        } else if (arg0 == 11) {
            this.field2711 = arg1.method96(27023);
        } else if (arg0 == 12) {
            int var10 = arg1.method96(27023);
            this.field2682 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2682[var11] = arg1.method101(2);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2682[var12] += arg1.method101(2) << 16;
            }
        }
        if (!arg2) {
            method938(69);
        }
    }
}
