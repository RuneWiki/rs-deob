import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class40 {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Leg;")
    private static class37 field639 = class174.method1167(" from your friend list first)3", -37);

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[Leg;")
    public static class37[] field645 = new class37[500];

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Leg;")
    public static class37 field644 = field639;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Z")
    public static boolean field646 = true;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Leg;")
    public static class37 field640 = class174.method1167("Fertigkeit: ", 94);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Lme;")
    public class67 field648;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[Z")
    public static boolean[] field638;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method270(int arg0) {
        field639 = null;
        field640 = null;
        field645 = null;
        if (arg0 != 8459) {
            method272(111, 120, -42, 63, 99);
        }
        field638 = null;
        field644 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lsb;Z)V")
    public static final void method271(class109 arg0, boolean arg1) {
        field647++;
        if (arg0.field1819 == 0 || !arg1) {
            return;
        }
        if (arg0.field1824 != -1 && arg0.field1824 < 32768) {
            class163 var2 = class55.field833[arg0.field1824];
            if (var2 != null) {
                int var3 = arg0.field1793 - var2.field1793;
                int var4 = arg0.field1799 - var2.field1799;
                if (var4 != 0 || var3 != 0) {
                    arg0.field1816 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1824 >= 32768) {
            int var5 = arg0.field1824 - 32768;
            if (class116.field1986 == var5) {
                var5 = 2047;
            }
            class188 var6 = class98.field1526[var5];
            if (var6 != null) {
                int var7 = arg0.field1799 - var6.field1799;
                int var8 = arg0.field1793 - var6.field1793;
                if (var7 != 0 || var8 != 0) {
                    arg0.field1816 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1784 != 0 || arg0.field1805 != 0) && (arg0.field1834 == 0 || arg0.field1765 > 0)) {
            int var9 = arg0.field1799 + (arg0.method763(-1) - 1) * 64 - ((-field642 + arg0.field1784 - field642) * 64);
            int var10 = arg0.field1793 - (((arg0.field1805 - class144.field2456 - class144.field2456) * 64) - ((arg0.method763(-1) - 1) * 64));
            if (var9 != 0 || var10 != 0) {
                arg0.field1816 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1805 = 0;
            arg0.field1784 = 0;
        }
        int var11 = arg0.field1816 - arg0.field1798 & 0x7FF;
        if (var11 == 0) {
            arg0.field1779 = 0;
            return;
        }
        arg0.field1779++;
        if (var11 <= 1024) {
            arg0.field1798 += arg0.field1819;
            boolean var12 = true;
            if (var11 < arg0.field1819 || var11 > (2048 - arg0.field1819)) {
                var12 = false;
                arg0.field1798 = arg0.field1816;
            }
            if (arg0.field1789 == arg0.field1767 && (arg0.field1779 > 25 || var12)) {
                if (arg0.field1770 == -1) {
                    arg0.field1789 = arg0.field1827;
                } else {
                    arg0.field1789 = arg0.field1770;
                }
            }
        } else {
            arg0.field1798 -= arg0.field1819;
            boolean var13 = true;
            if (arg0.field1819 > var11 || var11 > (2048 - arg0.field1819)) {
                var13 = false;
                arg0.field1798 = arg0.field1816;
            }
            if (arg0.field1789 == arg0.field1767 && (arg0.field1779 > 25 || var13)) {
                if (arg0.field1790 == -1) {
                    arg0.field1789 = arg0.field1827;
                } else {
                    arg0.field1789 = arg0.field1790;
                }
            }
        }
        arg0.field1798 &= 0x7FF;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
    public static final void method272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field636++;
        if (class78.field1216 < 100) {
            class22.method135((byte) 116);
        }
        class122.method869(arg0, arg2, arg0 + arg3, arg2 - -arg1);
        if (class78.field1216 < 100) {
            byte var5 = 20;
            int var6 = arg3 / 2 + arg0;
            int var7 = arg1 / 2 + arg2 - var5 - 18;
            class122.method873(arg0, arg2, arg3, arg1, 0);
            class122.method861(var6 - 152, var7, 304, 34, 9179409);
            class122.method861(var6 - 151, var7 + 1, 302, 32, 0);
            class122.method873(var6 - 150, var7 - -2, class78.field1216 * 3, 30, 9179409);
            class122.method873(class78.field1216 * 3 + var6 - 150, var7 - -2, 300 - (class78.field1216 * 3), 30, 0);
            class180.field3002.method1203(class4.field65, var6, var5 + var7, 16777215, -1);
            return;
        }
        class82.field1298 = class217.field3738 - (int) ((float) arg3 / class79.field1229);
        class225.field3871 = class28.field414 - ((int) ((float) arg1 / class79.field1229));
        class69.field1106 = (int) ((float) (arg3 * 2) / class79.field1229);
        class126.field2126 = (int) ((float) (arg1 * 2) / class79.field1229);
        int var8 = class217.field3738 - ((int) ((float) arg3 / class79.field1229));
        if (arg4 != 12) {
            method271((class109) null, true);
        }
        int var9 = class28.field414 - ((int) ((float) arg1 / class79.field1229));
        int var10 = (int) ((float) arg3 / class79.field1229) + class217.field3738;
        int var11 = (int) ((float) arg1 / class79.field1229) + class28.field414;
        class174.method1169(var11, var10, arg0 + arg3, arg1 + arg2, arg0, var9, arg2, var8, (byte) 98);
        class177.method1180(arg4 ^ 0x30C, var11, arg0 + arg3, arg1 + arg2, arg2, var8, var10, arg0, var9);
        class101.method670(arg0 + arg3, arg1 + arg2, var8, var10, var11, arg0, var9, (byte) 123, arg2);
        if (class171.field2879 > 0) {
            class171.field2879--;
        }
        if (!class243.field4373) {
            return;
        }
        int var12 = arg2 + arg1 - 8;
        int var13 = arg0 + arg3 - 5;
        class109.field1810.method1220(class156.method1061((byte) -76, new class37[] { class238.field4237, class163.method1096(class131.field2178, (byte) -35) }), var13, var12, 16776960, -1);
        int var17 = var12 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class109.field1810.method1220(class156.method1061((byte) -99, new class37[] { class121.field2044, class163.method1096(var16, (byte) -35), class273.field4798 }), var13, var17, var15, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static final void method273(int arg0) {
        field637++;
        class181.field3033.method1403(45);
        int var1 = 86 / ((arg0 + 39) / 58);
        class160.field2671.method1403(45);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lw;Z)V")
    public static final void method274(class111 arg0, boolean arg1) {
        class18.field244.method1574(arg0, 0);
        while (true) {
            class111 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class111[][] var7;
            class111 var82;
            do {
                class111 var81;
                do {
                    class111 var80;
                    do {
                        class111 var79;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class111) class18.field244.method1569((byte) -9);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1879);
                                            var3 = var2.field1878;
                                            var4 = var2.field1859;
                                            var5 = var2.field1867;
                                            var6 = var2.field1871;
                                            var7 = class286.field5048[var5];
                                            if (!var2.field1866) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class111 var8 = class286.field5048[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1879) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class111.field1853 && var3 > class39.field633) {
                                                    class111 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1879 && (var9.field1866 || (var2.field1881 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class111.field1853 && var3 < class77.field1202 - 1) {
                                                    class111 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1879 && (var10.field1866 || (var2.field1881 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class254.field4514 && var4 > class86.field1353) {
                                                    class111 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1879 && (var11.field1866 || (var2.field1881 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class254.field4514 && var4 < class125.field2093 - 1) {
                                                    class111 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1879 && (var12.field1866 || (var2.field1881 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1866 = false;
                                            if (var2.field1869 != null) {
                                                class111 var13 = var2.field1869;
                                                if (var13.field1862 == null) {
                                                    if (var13.field1865 != null) {
                                                        if (class51.method330(0, var3, var4)) {
                                                            class120.method852(var13.field1865, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, true);
                                                        } else {
                                                            class120.method852(var13.field1865, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class51.method330(0, var3, var4)) {
                                                    class46.method299(var13.field1862, 0, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, true);
                                                } else {
                                                    class46.method299(var13.field1862, 0, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, false);
                                                }
                                                class79 var14 = var13.field1868;
                                                if (var14 != null) {
                                                    var14.field1221.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var14.field1234 - class23.field301, var14.field1230 - class120.field2032, var14.field1224 - class184.field3099, var14.field1222, var5, (class193) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1880; var15++) {
                                                    class27 var16 = var13.field1858[var15];
                                                    if (var16 != null) {
                                                        var16.field400.method313(var16.field394, class197.field3347, class61.field999, class8.field139, class69.field1101, var16.field386 - class23.field301, var16.field392 - class120.field2032, var16.field395 - class184.field3099, var16.field381, var5, (class193) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1862 == null) {
                                                if (var2.field1865 != null) {
                                                    if (class51.method330(var6, var3, var4)) {
                                                        class120.method852(var2.field1865, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class120.method852(var2.field1865, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, false);
                                                    }
                                                }
                                            } else if (class51.method330(var6, var3, var4)) {
                                                class46.method299(var2.field1862, var6, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1862.field3904 != 12345678 || class160.field2672 && var5 <= class60.field993) {
                                                    class46.method299(var2.field1862, var6, class197.field3347, class61.field999, class8.field139, class69.field1101, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class239 var18 = var2.field1876;
                                                if (var18 != null && (var18.field4244 & 0x80000000L) != 0L) {
                                                    var18.field4251.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var18.field4245 - class23.field301, var18.field4240 - class120.field2032, var18.field4241 - class184.field3099, var18.field4244, var5, (class193) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class79 var21 = var2.field1868;
                                            class273 var22 = var2.field1875;
                                            if (var21 != null || var22 != null) {
                                                if (class111.field1853 == var3) {
                                                    var19++;
                                                } else if (class111.field1853 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class254.field4514 == var4) {
                                                    var19 += 3;
                                                } else if (class254.field4514 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class231.field3946[var19];
                                                var2.field1874 = class249.field4477[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1228 & class244.field4395[var19]) == 0) {
                                                    var2.field1872 = 0;
                                                } else if (var21.field1228 == 16) {
                                                    var2.field1872 = 3;
                                                    var2.field1861 = class278.field4921[var19];
                                                    var2.field1857 = 3 - var2.field1861;
                                                } else if (var21.field1228 == 32) {
                                                    var2.field1872 = 6;
                                                    var2.field1861 = class5.field89[var19];
                                                    var2.field1857 = 6 - var2.field1861;
                                                } else if (var21.field1228 == 64) {
                                                    var2.field1872 = 12;
                                                    var2.field1861 = class29.field418[var19];
                                                    var2.field1857 = 12 - var2.field1861;
                                                } else {
                                                    var2.field1872 = 9;
                                                    var2.field1861 = class175.field2934[var19];
                                                    var2.field1857 = 9 - var2.field1861;
                                                }
                                                if ((var21.field1228 & var20) != 0 && !class35.method199(var6, var3, var4, var21.field1228)) {
                                                    var21.field1221.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var21.field1234 - class23.field301, var21.field1230 - class120.field2032, var21.field1224 - class184.field3099, var21.field1222, var5, (class193) null);
                                                }
                                                if ((var21.field1219 & var20) != 0 && !class35.method199(var6, var3, var4, var21.field1219)) {
                                                    var21.field1235.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var21.field1234 - class23.field301, var21.field1230 - class120.field2032, var21.field1224 - class184.field3099, var21.field1222, var5, (class193) null);
                                                }
                                            }
                                            if (var22 != null && !class242.method1669(var6, var3, var4, var22.field4780.method308())) {
                                                if ((var22.field4795 & var20) != 0) {
                                                    var22.field4780.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var22.field4783 + var22.field4786 - class23.field301, var22.field4785 - class120.field2032, var22.field4775 + var22.field4784 - class184.field3099, var22.field4781, var5, (class193) null);
                                                } else if (var22.field4795 == 256) {
                                                    int var23 = var22.field4783 - class23.field301;
                                                    int var24 = var22.field4785 - class120.field2032;
                                                    int var25 = var22.field4775 - class184.field3099;
                                                    int var26 = var22.field4777;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field4780.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var22.field4786 + var23, var24, var22.field4784 + var25, var22.field4781, var5, (class193) null);
                                                    } else if (var22.field4791 != null) {
                                                        var22.field4791.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var23, var24, var25, var22.field4781, var5, (class193) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class239 var29 = var2.field1876;
                                                if (var29 != null && (var29.field4244 & 0x80000000L) == 0L) {
                                                    var29.field4251.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var29.field4245 - class23.field301, var29.field4240 - class120.field2032, var29.field4241 - class184.field3099, var29.field4244, var5, (class193) null);
                                                }
                                                class68 var30 = var2.field1870;
                                                if (var30 != null && var30.field1081 == 0) {
                                                    if (var30.field1087 != null) {
                                                        var30.field1087.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var30.field1083 - class23.field301, var30.field1086 - class120.field2032, var30.field1085 - class184.field3099, var30.field1079, var5, (class193) null);
                                                    }
                                                    if (var30.field1077 != null) {
                                                        var30.field1077.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var30.field1083 - class23.field301, var30.field1086 - class120.field2032, var30.field1085 - class184.field3099, var30.field1079, var5, (class193) null);
                                                    }
                                                    if (var30.field1075 != null) {
                                                        var30.field1075.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var30.field1083 - class23.field301, var30.field1086 - class120.field2032, var30.field1085 - class184.field3099, var30.field1079, var5, (class193) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1881;
                                            if (var31 != 0) {
                                                if (var3 < class111.field1853 && (var31 & 0x4) != 0) {
                                                    class111 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1879) {
                                                        class18.field244.method1574(var32, 0);
                                                    }
                                                }
                                                if (var4 < class254.field4514 && (var31 & 0x2) != 0) {
                                                    class111 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1879) {
                                                        class18.field244.method1574(var33, 0);
                                                    }
                                                }
                                                if (var3 > class111.field1853 && (var31 & 0x1) != 0) {
                                                    class111 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1879) {
                                                        class18.field244.method1574(var34, 0);
                                                    }
                                                }
                                                if (var4 > class254.field4514 && (var31 & 0x8) != 0) {
                                                    class111 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1879) {
                                                        class18.field244.method1574(var35, 0);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1872 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1880; var37++) {
                                                if (class214.field3693 != var2.field1858[var37].field398 && (var2.field1877[var37] & var2.field1872) == var2.field1861) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class79 var38 = var2.field1868;
                                                if (!class35.method199(var6, var3, var4, var38.field1228)) {
                                                    var38.field1221.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var38.field1234 - class23.field301, var38.field1230 - class120.field2032, var38.field1224 - class184.field3099, var38.field1222, var5, (class193) null);
                                                }
                                                var2.field1872 = 0;
                                            }
                                        }
                                        if (!var2.field1873) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1880;
                                            var2.field1873 = false;
                                            int var40 = 0;
                                            label584: for (int var41 = 0; var41 < var39; var41++) {
                                                class27 var42 = var2.field1858[var41];
                                                if (class214.field3693 != var42.field398) {
                                                    for (int var43 = var42.field402; var43 <= var42.field387; var43++) {
                                                        for (int var44 = var42.field397; var44 <= var42.field399; var44++) {
                                                            class111 var45 = var7[var43][var44];
                                                            if (var45.field1866) {
                                                                var2.field1873 = true;
                                                                continue label584;
                                                            }
                                                            if (var45.field1872 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field402) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field387) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field397) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field399) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1872) == var2.field1857) {
                                                                    var2.field1873 = true;
                                                                    continue label584;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class108.field1735[var40++] = var42;
                                                    int var47 = class111.field1853 - var42.field402;
                                                    int var48 = var42.field387 - class111.field1853;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class254.field4514 - var42.field397;
                                                    int var50 = var42.field399 - class254.field4514;
                                                    if (var50 > var49) {
                                                        var42.field380 = var47 + var50;
                                                    } else {
                                                        var42.field380 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class27 var54 = class108.field1735[var53];
                                                    if (class214.field3693 != var54.field398) {
                                                        if (var54.field380 > var51) {
                                                            var51 = var54.field380;
                                                            var52 = var53;
                                                        } else if (var54.field380 == var51) {
                                                            int var55 = var54.field386 - class23.field301;
                                                            int var56 = var54.field395 - class184.field3099;
                                                            int var57 = class108.field1735[var52].field386 - class23.field301;
                                                            int var58 = class108.field1735[var52].field395 - class184.field3099;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class27 var59 = class108.field1735[var52];
                                                var59.field398 = class214.field3693;
                                                if (!class95.method622(var6, var59.field402, var59.field387, var59.field397, var59.field399, var59.field400.method308())) {
                                                    var59.field400.method313(var59.field394, class197.field3347, class61.field999, class8.field139, class69.field1101, var59.field386 - class23.field301, var59.field392 - class120.field2032, var59.field395 - class184.field3099, var59.field381, var5, (class193) null);
                                                }
                                                for (int var60 = var59.field402; var60 <= var59.field387; var60++) {
                                                    for (int var61 = var59.field397; var61 <= var59.field399; var61++) {
                                                        class111 var62 = var7[var60][var61];
                                                        if (var62.field1872 != 0) {
                                                            class18.field244.method1574(var62, 0);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1879) {
                                                            class18.field244.method1574(var62, 0);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1873) {
                                                break;
                                            }
                                        } catch (Exception var97) {
                                            var2.field1873 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field1860 != null) {
                                        int var63 = class76.field1179 + class193.field3294;
                                        int var64 = class76.field1194 + class193.field3300;
                                        class129 var65 = var2.field1860.field1981;
                                        for (class129 var66 = var65.field2156; var66 != var65; var66 = var66.field2156) {
                                            class6 var67 = (class6) var66;
                                            if (var67.field103 != null && !var67.field103.field2787.field3289) {
                                                if ((byte) ((int) (var67.field103.field2787.field3296 & 0xFFL)) != var2.field1863) {
                                                    var2.field1860 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field99 >> 12) - class23.field301;
                                                int var69 = (var67.field97 >> 12) - class120.field2032;
                                                int var70 = (var67.field104 >> 12) - class184.field3099;
                                                int var71 = class8.field139 * var70 + class69.field1101 * var68 >> 16;
                                                int var72 = class69.field1101 * var70 - class8.field139 * var68 >> 16;
                                                int var74 = class61.field999 * var69 - class197.field3347 * var72 >> 16;
                                                int var75 = class61.field999 * var72 + class197.field3347 * var69 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    class122.method867(var77, var78, var67.field103.field2794.field892 >> 2, var67.field101, var67.field101 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field1879);
                            } while (var2.field1872 != 0);
                            if (var3 > class111.field1853 || var3 <= class39.field633) {
                                break;
                            }
                            var79 = var7[var3 - 1][var4];
                        } while (var79 != null && var79.field1879);
                        if (var3 < class111.field1853 || var3 >= class77.field1202 - 1) {
                            break;
                        }
                        var80 = var7[var3 + 1][var4];
                    } while (var80 != null && var80.field1879);
                    if (var4 > class254.field4514 || var4 <= class86.field1353) {
                        break;
                    }
                    var81 = var7[var3][var4 - 1];
                } while (var81 != null && var81.field1879);
                if (var4 < class254.field4514 || var4 >= class125.field2093 - 1) {
                    break;
                }
                var82 = var7[var3][var4 + 1];
            } while (var82 != null && var82.field1879);
            var2.field1879 = false;
            class274.field4825--;
            class68 var83 = var2.field1870;
            if (var83 != null && var83.field1081 != 0) {
                if (var83.field1087 != null) {
                    var83.field1087.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var83.field1083 - class23.field301, var83.field1086 - class120.field2032 - var83.field1081, var83.field1085 - class184.field3099, var83.field1079, var5, (class193) null);
                }
                if (var83.field1077 != null) {
                    var83.field1077.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var83.field1083 - class23.field301, var83.field1086 - class120.field2032 - var83.field1081, var83.field1085 - class184.field3099, var83.field1079, var5, (class193) null);
                }
                if (var83.field1075 != null) {
                    var83.field1075.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var83.field1083 - class23.field301, var83.field1086 - class120.field2032 - var83.field1081, var83.field1085 - class184.field3099, var83.field1079, var5, (class193) null);
                }
            }
            if (var2.field1874 != 0) {
                class273 var84 = var2.field1875;
                if (var84 != null && !class242.method1669(var6, var3, var4, var84.field4780.method308())) {
                    if ((var84.field4795 & var2.field1874) != 0) {
                        var84.field4780.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var84.field4783 + var84.field4786 - class23.field301, var84.field4785 - class120.field2032, var84.field4775 + var84.field4784 - class184.field3099, var84.field4781, var5, (class193) null);
                    } else if (var84.field4795 == 256) {
                        int var85 = var84.field4783 - class23.field301;
                        int var86 = var84.field4785 - class120.field2032;
                        int var87 = var84.field4775 - class184.field3099;
                        int var88 = var84.field4777;
                        int var89;
                        if (var88 == 1 || var88 == 2) {
                            var89 = -var85;
                        } else {
                            var89 = var85;
                        }
                        int var90;
                        if (var88 == 2 || var88 == 3) {
                            var90 = -var87;
                        } else {
                            var90 = var87;
                        }
                        if (var90 >= var89) {
                            var84.field4780.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var84.field4786 + var85, var86, var84.field4784 + var87, var84.field4781, var5, (class193) null);
                        } else if (var84.field4791 != null) {
                            var84.field4791.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var85, var86, var87, var84.field4781, var5, (class193) null);
                        }
                    }
                }
                class79 var91 = var2.field1868;
                if (var91 != null) {
                    if ((var91.field1219 & var2.field1874) != 0 && !class35.method199(var6, var3, var4, var91.field1219)) {
                        var91.field1235.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var91.field1234 - class23.field301, var91.field1230 - class120.field2032, var91.field1224 - class184.field3099, var91.field1222, var5, (class193) null);
                    }
                    if ((var91.field1228 & var2.field1874) != 0 && !class35.method199(var6, var3, var4, var91.field1228)) {
                        var91.field1221.method313(0, class197.field3347, class61.field999, class8.field139, class69.field1101, var91.field1234 - class23.field301, var91.field1230 - class120.field2032, var91.field1224 - class184.field3099, var91.field1222, var5, (class193) null);
                    }
                }
            }
            if (var5 < class274.field4815 - 1) {
                class111 var92 = class286.field5048[var5 + 1][var3][var4];
                if (var92 != null && var92.field1879) {
                    class18.field244.method1574(var92, 0);
                }
            }
            if (var3 < class111.field1853) {
                class111 var93 = var7[var3 + 1][var4];
                if (var93 != null && var93.field1879) {
                    class18.field244.method1574(var93, 0);
                }
            }
            if (var4 < class254.field4514) {
                class111 var94 = var7[var3][var4 + 1];
                if (var94 != null && var94.field1879) {
                    class18.field244.method1574(var94, 0);
                }
            }
            if (var3 > class111.field1853) {
                class111 var95 = var7[var3 - 1][var4];
                if (var95 != null && var95.field1879) {
                    class18.field244.method1574(var95, 0);
                }
            }
            if (var4 > class254.field4514) {
                class111 var96 = var7[var3][var4 - 1];
                if (var96 != null && var96.field1879) {
                    class18.field244.method1574(var96, 0);
                }
            }
        }
    }
}
