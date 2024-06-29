import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class69 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lwb;")
    public static class130 field1768 = class26.method212(":  ", -32376);

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lwb;")
    private static class130 field1772 = class26.method212("Error loading your profile)3", -32376);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lwb;")
    public static class130 field1777 = class26.method212("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -32376);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    public static int[] field1775 = new int[2048];

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lwb;")
    private static class130 field1779 = class26.method212("wishes to duel with you)3", -32376);

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1783 = -1;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[[[I")
    public static int[][][] field1781 = new int[4][105][105];

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lwb;")
    public static class130 field1769 = field1772;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lwb;")
    public static class130 field1773 = field1779;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[I")
    public static int[] field1786 = new int[100];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lce;")
    public static class18 field1780;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method559(int arg0, int arg1) {
        field1778++;
        if (!class52.method446(arg0, (byte) -102)) {
            return false;
        }
        if (arg1 <= 104) {
            field1772 = null;
        }
        boolean var2 = false;
        class3[] var3 = class105.field2549[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class3 var5 = var3[var4];
            if (var5 != null && var5.field110 == 6) {
                if (var5.field71 != -1 || var5.field106 != -1) {
                    boolean var6 = class95.method712(256, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field106;
                    } else {
                        var7 = var5.field71;
                    }
                    if (var7 != -1) {
                        class40 var8 = class85.method641(var7, 12);
                        var5.field135 += class31.field860;
                        label55: while (true) {
                            do {
                                do {
                                    if (var8.field1108[var5.field126] >= var5.field135) {
                                        break label55;
                                    }
                                    var2 = true;
                                    var5.field135 -= var8.field1108[var5.field126];
                                    var5.field126++;
                                } while (var8.field1106.length > var5.field126);
                                var5.field126 -= var8.field1142;
                            } while (var5.field126 >= 0 && var8.field1106.length > var5.field126);
                            var5.field126 = 0;
                        }
                    }
                }
                if (var5.field113 != 0) {
                    var2 = true;
                    int var9 = var5.field113 >> 16;
                    int var10 = var5.field113 << 16 >> 16;
                    int var11 = class31.field860 * var9;
                    var5.field133 = var5.field133 + var11 & 0x7FF;
                    int var12 = class31.field860 * var10;
                    var5.field85 = var5.field85 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIBI)V", line = 92)
    public static final void method560(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1784++;
        int var7 = -7 / ((arg5 - 28) / 54);
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 2048 - arg6 & 0x7FF;
        int var10 = 0;
        int var11 = arg1;
        int var12 = 0;
        if (var8 != 0) {
            int var13 = class102.field2502[var8];
            int var14 = class102.field2514[var8];
            int var15 = var12 * var14 - arg1 * var13 >> 16;
            var11 = arg1 * var14 + var12 * var13 >> 16;
            var12 = var15;
        }
        if (var9 != 0) {
            int var16 = class102.field2502[var9];
            int var17 = class102.field2514[var9];
            int var18 = var10 * var17 + var11 * var16 >> 16;
            var11 = var11 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        class10.field337 = arg2;
        class58.field1465 = arg0 - var11;
        class113.field2780 = arg6;
        class29.field815 = arg4 - var12;
        class103.field2528 = arg3 - var10;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 152)
    public static final void method561(byte arg0) {
        field1785++;
        class108.field2607 = 0;
        for (int var1 = -1; var1 < class61.field1582 + class58.field1466; var1++) {
            class88 var18;
            if (var1 == -1) {
                var18 = class42.field1179;
            } else if (class61.field1582 <= var1) {
                var18 = class26.field766[class24.field716[var1 - class61.field1582]];
            } else {
                var18 = class105.field2550[class26.field770[var1]];
            }
            if (var18 != null && var18.method259(false)) {
                if (var18 instanceof class33) {
                    class84 var19 = ((class33) var18).field913;
                    if (var19.field1987 != null) {
                        var19 = var19.method629(0);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class61.field1582 <= var1) {
                    class84 var22 = ((class33) var18).field913;
                    if (var22.field1971 >= 0 && var22.field1971 < class43.field1198.length) {
                        class120.method916(true, var18.field2078 + 15, var18);
                        if (class115.field2826 > -1) {
                            class43.field1198[var22.field1971].method233(class115.field2826 - 12, client.field523 + -30);
                        }
                    }
                    if (class130.field3065 == 1 && class24.field716[var1 - class61.field1582] == class116.field2861 && class130.field3128 % 20 < 10) {
                        class120.method916(true, var18.field2078 + 15, var18);
                        if (class115.field2826 > -1) {
                            class120.field2938[0].method233(class115.field2826 - 12, client.field523 + -28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class59 var21 = (class59) var18;
                    if (var21.field1514 != -1 || var21.field1495 != -1) {
                        class120.method916(true, var18.field2078 + 15, var18);
                        if (class115.field2826 > -1) {
                            if (var21.field1514 != -1) {
                                class7.field255[var21.field1514].method233(class115.field2826 - 12, -var20 + client.field523);
                                var20 += 25;
                            }
                            if (var21.field1495 != -1) {
                                class43.field1198[var21.field1495].method233(class115.field2826 - 12, -var20 + client.field523);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class130.field3065 == 10 && class26.field770[var1] == class27.field784) {
                        class120.method916(true, var18.field2078 + 15, var18);
                        if (class115.field2826 > -1) {
                            class120.field2938[1].method233(class115.field2826 - 12, -var20 + client.field523);
                        }
                    }
                }
                if (var18.field2074 != null && (class61.field1582 <= var1 || class121.field2965 == 0 || class121.field2965 == 3 || class121.field2965 == 1 && class4.method38(4739, ((class59) var18).field1515))) {
                    class120.method916(true, var18.field2078, var18);
                    if (class115.field2826 > -1 && class67.field1687 > class108.field2607) {
                        class67.field1712[class108.field2607] = class43.field1187.method1013(var18.field2074) / 2;
                        class67.field1722[class108.field2607] = class43.field1187.field3165;
                        class67.field1676[class108.field2607] = class115.field2826;
                        class67.field1716[class108.field2607] = client.field523;
                        class67.field1726[class108.field2607] = var18.field2087;
                        class67.field1741[class108.field2607] = var18.field2114;
                        class67.field1738[class108.field2607] = var18.field2089;
                        class67.field1693[class108.field2607] = var18.field2074;
                        class108.field2607++;
                    }
                }
                if (var18.field2102 > class130.field3128) {
                    class120.method916(true, var18.field2078 + 15, var18);
                    if (class115.field2826 > -1) {
                        int var23 = var18.field2088 * 30 / var18.field2090;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class49.method440(class115.field2826 - 15, client.field523 + -3, var23, 5, 65280);
                        class49.method440(class115.field2826 + var23 - 15, client.field523 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class130.field3128 < var18.field2137[var24]) {
                        class120.method916(true, var18.field2078 / 2, var18);
                        if (class115.field2826 > -1) {
                            if (var24 == 1) {
                                client.field523 -= 20;
                            }
                            if (var24 == 2) {
                                client.field523 -= 10;
                                class115.field2826 -= 15;
                            }
                            if (var24 == 3) {
                                class115.field2826 += 15;
                                client.field523 -= 10;
                            }
                            class113.field2802[var18.field2130[var24]].method233(class115.field2826 - 12, client.field523 + -12);
                            class68.field1766.method1012(class109.method831(var18.field2111[var24], 10), class115.field2826, client.field523 + 4, 0);
                            class68.field1766.method1012(class109.method831(var18.field2111[var24], 10), class115.field2826 - 1, client.field523 + 3, 16777215);
                        }
                    }
                }
            }
        }
        if (arg0 <= 13) {
            field1786 = null;
        }
        for (int var2 = 0; var2 < class108.field2607; var2++) {
            int var3 = class67.field1676[var2];
            int var4 = class67.field1712[var2];
            int var5 = class67.field1716[var2];
            int var6 = class67.field1722[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class67.field1716[var17] - class67.field1722[var17] < var5 - -2 && var5 - var6 < class67.field1716[var17] - -2 && class67.field1712[var17] + class67.field1676[var17] > var3 - var4 && class67.field1676[var17] - class67.field1712[var17] < var3 + var4 && class67.field1716[var17] - class67.field1722[var17] < var5) {
                        var5 = class67.field1716[var17] - class67.field1722[var17];
                        var7 = true;
                    }
                }
            }
            class115.field2826 = class67.field1676[var2];
            client.field523 = class67.field1716[var2] = var5;
            class130 var8 = class67.field1693[var2];
            if (class52.field1366 == 0) {
                int var9 = 16776960;
                if (class67.field1726[var2] < 6) {
                    var9 = class26.field752[class67.field1726[var2]];
                }
                if (class67.field1726[var2] == 6) {
                    var9 = class117.field2904 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class67.field1726[var2] == 7) {
                    var9 = class117.field2904 % 20 >= 10 ? 65535 : 255;
                }
                if (class67.field1726[var2] == 8) {
                    var9 = class117.field2904 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class67.field1726[var2] == 9) {
                    int var10 = 150 - class67.field1738[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16384000 + 16776960 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class67.field1726[var2] == 10) {
                    int var11 = 150 - class67.field1738[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16384000 + 16711935 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 + -100) * 5;
                    }
                }
                if (class67.field1726[var2] == 11) {
                    int var12 = 150 - class67.field1738[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class67.field1741[var2] == 0) {
                    class43.field1187.method1012(var8, class115.field2826, client.field523 + 1, 0);
                    class43.field1187.method1012(var8, class115.field2826, client.field523, var9);
                }
                if (class67.field1741[var2] == 1) {
                    class43.field1187.method994(var8, class115.field2826, client.field523 + 1, 0, class117.field2904);
                    class43.field1187.method994(var8, class115.field2826, client.field523, var9, class117.field2904);
                }
                if (class67.field1741[var2] == 2) {
                    class43.field1187.method1010(var8, class115.field2826, client.field523 + 1, 0, class117.field2904);
                    class43.field1187.method1010(var8, class115.field2826, client.field523, var9, class117.field2904);
                }
                if (class67.field1741[var2] == 3) {
                    class43.field1187.method995(var8, class115.field2826, client.field523 + 1, 0, class117.field2904, 150 - class67.field1738[var2]);
                    class43.field1187.method995(var8, class115.field2826, client.field523, var9, class117.field2904, 150 - class67.field1738[var2]);
                }
                if (class67.field1741[var2] == 4) {
                    int var13 = class43.field1187.method1013(var8);
                    int var14 = (150 - class67.field1738[var2]) * (var13 + 100) / 150;
                    class49.method432(class115.field2826 - 50, 0, class115.field2826 + 50, 334);
                    class43.field1187.method1002(var8, class115.field2826 + 50 - var14, client.field523 + 1, 0);
                    class43.field1187.method1002(var8, class115.field2826 + 50 - var14, client.field523, var9);
                    class49.method437();
                }
                if (class67.field1741[var2] == 5) {
                    int var15 = 150 - class67.field1738[var2];
                    int var16 = 0;
                    class49.method432(0, client.field523 - class43.field1187.field3165 - 1, 512, client.field523 + 5);
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class43.field1187.method1012(var8, class115.field2826, client.field523 + var16 + 1, 0);
                    class43.field1187.method1012(var8, class115.field2826, client.field523 + var16, var9);
                    class49.method437();
                }
            } else {
                class43.field1187.method1012(var8, class115.field2826, client.field523 + 1, 0);
                class43.field1187.method1012(var8, class115.field2826, client.field523, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 553)
    public static final void method562(int arg0) {
        field1774++;
        int var1 = class53.field1384 * 128 + 64;
        int var2 = field1770 * 128 + 64;
        int var3 = class27.method219(336137319, class71.field1818, var2, var1) - class99.field2402;
        if (class103.field2528 < var1) {
            class103.field2528 += class65.field1668 + (var1 - class103.field2528) * class61.field1581 / 1000;
            if (class103.field2528 > var1) {
                class103.field2528 = var1;
            }
        }
        if (arg0 != -15) {
            field1783 = 39;
        }
        if (var1 < class103.field2528) {
            class103.field2528 -= (class103.field2528 - var1) * class61.field1581 / 1000 + class65.field1668;
            if (class103.field2528 < var1) {
                class103.field2528 = var1;
            }
        }
        if (class29.field815 < var3) {
            class29.field815 += (var3 - class29.field815) * class61.field1581 / 1000 + class65.field1668;
            if (class29.field815 > var3) {
                class29.field815 = var3;
            }
        }
        int var4 = field1782 * 128 + 64;
        if (var3 < class29.field815) {
            class29.field815 -= class65.field1668 + (class29.field815 - var3) * class61.field1581 / 1000;
            if (var3 > class29.field815) {
                class29.field815 = var3;
            }
        }
        if (var2 > class58.field1465) {
            class58.field1465 += (var2 - class58.field1465) * class61.field1581 / 1000 + class65.field1668;
            if (var2 < class58.field1465) {
                class58.field1465 = var2;
            }
        }
        if (class58.field1465 > var2) {
            class58.field1465 -= (class58.field1465 - var2) * class61.field1581 / 1000 + class65.field1668;
            if (var2 > class58.field1465) {
                class58.field1465 = var2;
            }
        }
        int var5 = class116.field2868 * 128 + 64;
        int var6 = class27.method219(336137319, class71.field1818, var5, var4) - class105.field2547;
        int var7 = var4 - class103.field2528;
        int var8 = var5 - class58.field1465;
        int var9 = var6 - class29.field815;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class113.field2780;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class10.field337 < var11) {
            class10.field337 += (var11 - class10.field337) * class36.field1053 / 1000 + class22.field630;
            if (class10.field337 > var11) {
                class10.field337 = var11;
            }
        }
        if (class10.field337 > var11) {
            class10.field337 -= (class10.field337 - var11) * class36.field1053 / 1000 + class22.field630;
            if (class10.field337 < var11) {
                class10.field337 = var11;
            }
        }
        if (var13 > 0) {
            class113.field2780 += class36.field1053 * var13 / 1000 + class22.field630;
            class113.field2780 &= 0x7FF;
        }
        if (var13 < 0) {
            class113.field2780 -= class22.field630 + -var13 * class36.field1053 / 1000;
            class113.field2780 &= 0x7FF;
        }
        int var14 = var12 - class113.field2780;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class113.field2780 = var12;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z", line = 710)
    public static final boolean method563(int arg0, int arg1, int arg2) {
        field1776++;
        if (arg1 == 0 && class52.field1364 == arg0) {
            return true;
        } else if (~arg1 == arg2 && class83.field1962 == arg0) {
            return true;
        } else {
            return (arg1 == 2 || arg1 == 3) && class79.field1924 == arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 740)
    public static final void method564(int arg0) {
        class9.field314 = -1;
        class26.field749 = 0;
        class64.field1619 = -1;
        class65.field1652 = -1;
        field1771++;
        class65.field1661 = 0;
        class130.field3101 = 0;
        class26.field757 = 0;
        class47.field1265 = -1;
        class116.field2850 = 0;
        class36.field1078 = 0;
        class14.field406.field1057 = 0;
        class58.field1462 = false;
        class67.field1682.field1057 = 0;
        if (arg0 != -8350) {
            return;
        }
        for (int var1 = 0; var1 < class105.field2550.length; var1++) {
            if (class105.field2550[var1] != null) {
                class105.field2550[var1].field2085 = -1;
            }
        }
        for (int var2 = 0; var2 < class26.field766.length; var2++) {
            if (class26.field766[var2] != null) {
                class26.field766[var2].field2085 = -1;
            }
        }
        class90.method669(19013, 30);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 786)
    public static void method565(byte arg0) {
        field1769 = null;
        field1775 = null;
        field1786 = null;
        field1772 = null;
        field1779 = null;
        field1777 = null;
        field1781 = null;
        if (arg0 <= 97) {
            method559(122, -120);
        }
        field1768 = null;
        field1773 = null;
        field1780 = null;
    }
}
