import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class19 {

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "[B")
    public byte[] field841;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Lkc;")
    private static class67 field822 = class19.method144("Invalid loginserver requested)3", 93);

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "Z")
    public static boolean field821 = false;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "Lkc;")
    private static class67 field830 = class19.method144("yellow:", 126);

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Lkc;")
    public static class67 field820 = field830;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "Lkc;")
    private static class67 field838 = class19.method144("Use", 90);

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "[[[I")
    public static int[][][] field823 = new int[4][105][105];

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lkc;")
    private static class67 field837 = class19.method144("Enter name:", 99);

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "Lkc;")
    public static class67 field832 = field838;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "Lkc;")
    public static class67 field839 = field822;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lkc;")
    public static class67 field824 = field837;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lkc;")
    public static class67 field842 = class19.method144("mapscene", 123);

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lje;")
    public static class63 field827;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Z")
    public static boolean field836;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "[I")
    public static int[] field829;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "[I")
    public static int[] field831;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V", line = 6)
    public static final void method288(int arg0) {
        field835++;
        if (!class70.field1674) {
            return;
        }
        class33 var1 = class93.method738(1, class81.field1914, class1.field7);
        if (var1 != null && var1.field788 != null) {
            class112.method853(var1, var1.field788, false, 0, 0, 0, null);
        }
        if (arg0 <= -124) {
            class70.field1674 = false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)Lnd;", line = 39)
    public static final class86 method289(int arg0) {
        field825++;
        class86 var1 = new class86();
        var1.field2017 = class112.field2596[0];
        byte[] var2 = class54.field1310[arg0];
        var1.field2016 = field829[0];
        var1.field2019 = class12.field266;
        var1.field2013 = class80.field1906[0];
        var1.field2014 = class46.field1121[0];
        int var3 = var1.field2017 * var1.field2014;
        var1.field2015 = new int[var3];
        var1.field2018 = class116.field2735;
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field2015[var4] = class55.field1345[class90.method693(255, var2[var4])];
        }
        class50.method411((byte) 39);
        return var1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhd;B)V", line = 74)
    public static final void method290(class50 arg0, byte arg1) {
        if (class135.field3243 == arg0.field1240 || arg0.field1216 == -1 || arg0.field1207 != 0 || arg0.field1250 + 1 > class70.method576(12, arg0.field1216).field2584[arg0.field1188]) {
            int var2 = arg0.field1240 - arg0.field1210;
            int var3 = arg0.field1243 * 128 + arg0.field1208 * 64;
            int var4 = class135.field3243 - arg0.field1210;
            int var5 = arg0.field1238 * 128 + arg0.field1208 * 64;
            int var6 = arg0.field1227 * 128 + arg0.field1208 * 64;
            arg0.field1260 = ((var2 - var4) * var5 + var4 * var6) / var2;
            int var7 = arg0.field1234 * 128 + arg0.field1208 * 64;
            arg0.field1190 = ((var2 - var4) * var3 + var4 * var7) / var2;
        }
        field840++;
        if (arg0.field1228 == 0) {
            arg0.field1218 = 1024;
        }
        if (arg1 != -116) {
            field830 = null;
        }
        if (arg0.field1228 == 1) {
            arg0.field1218 = 1536;
        }
        arg0.field1189 = 0;
        if (arg0.field1228 == 2) {
            arg0.field1218 = 0;
        }
        if (arg0.field1228 == 3) {
            arg0.field1218 = 512;
        }
        arg0.field1199 = arg0.field1218;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII[Led;IIIII)V", line = 122)
    public static final void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class33[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field826++;
        if (arg4 > arg3 || arg11 < arg9 || arg0 <= arg3 || arg11 >= arg10) {
            return;
        }
        for (int var12 = 0; var12 < arg6.length; var12++) {
            class33 var13 = arg6[var12];
            if (var13 != null && var13.field719 == arg8 && (!var13.field722 || !class99.method760(18547, var13))) {
                int var14 = var13.field813 + arg4 - arg1;
                int var15 = var13.field750 + arg9 - arg5;
                if ((var13.field702 >= 0 || var13.field763 != 0) && arg3 >= var14 && arg11 >= var15 && arg3 < var14 + var13.field733 && arg11 < var15 + var13.field704) {
                    if (var13.field702 >= 0) {
                        class71.field1677 = var13.field702;
                    } else {
                        class71.field1677 = var12;
                    }
                }
                if (var13.field729 == 8 && var14 <= arg3 && arg11 >= var15 && var14 + var13.field733 > arg3 && var13.field704 + var15 > arg11) {
                    class111.field2547 = var12;
                }
                if (var13.field729 == 0) {
                    if (!var13.field722 && class99.method760(18547, var13) && !class58.method459(var12, (byte) -86, arg7)) {
                        continue;
                    }
                    method291(var13.field733 + var14, var13.field728, 45, arg3, var14, var13.field806, arg6, arg7, var13.field740, var15, var13.field704 + var15, arg11);
                    if (var13.field700 != null) {
                        method291(var14 + var13.field733, var13.field728, 45, arg3, var14, var13.field806, var13.field700, arg7, var13.field740, var15, var15 + var13.field704, arg11);
                    }
                    if (var13.field704 < var13.field752 && !var13.field722) {
                        class133.method1027(arg11, arg3, (byte) -112, var13.field733 + var14, arg7, var13, var13.field704, var13.field752, var15);
                    }
                    if (!var13.field722) {
                        continue;
                    }
                }
                if (var13.field713 == 1 && arg3 >= var14 && arg11 >= var15 && var13.field733 + var14 > arg3 && var13.field704 + var15 > arg11) {
                    boolean var16 = false;
                    if (var13.field764 != 0) {
                        var16 = class74.method604((byte) 16, var13);
                    }
                    if (!var16) {
                        class104.field2340++;
                        class44.method379(33, var13.field740, 0, class127.field2976, 0, var13.field748, (byte) 57);
                    }
                }
                if (var13.field713 == 2 && !class70.field1674 && var14 <= arg3 && arg11 >= var15 && arg3 < var14 + var13.field733 && var13.field704 + var15 > arg11) {
                    class67 var17 = class73.method594(var13, 127);
                    if (var17 != null) {
                        class44.method379(20, var13.field740, -1, class63.method479(new class67[] { class25.field536, var13.field759 }, 0), 0, var17, (byte) 108);
                        class125.field2921++;
                    }
                }
                if (var13.field713 == 3 && var14 <= arg3 && var15 <= arg11 && var13.field733 + var14 > arg3 && arg11 < var13.field704 + var15) {
                    class134.field3204++;
                    byte var18;
                    if (arg7 == 3) {
                        var18 = 16;
                    } else {
                        var18 = 48;
                    }
                    class44.method379(var18, var13.field740, 0, class127.field2976, 0, class141.field3397, (byte) 44);
                }
                if (var13.field713 == 4 && arg3 >= var14 && var15 <= arg11 && var13.field733 + var14 > arg3 && var13.field704 + var15 > arg11) {
                    class116.field2743++;
                    class44.method379(46, var13.field740, 0, class127.field2976, 0, var13.field748, (byte) 93);
                }
                if (var13.field713 == 5 && var14 <= arg3 && arg11 >= var15 && var14 + var13.field733 > arg3 && arg11 < var13.field704 + var15) {
                    class112.field2575++;
                    class44.method379(12, var13.field740, 0, class127.field2976, 0, var13.field748, (byte) 119);
                }
                if (var13.field713 == 6 && class98.field2218 == -1 && arg3 >= var14 && arg11 >= var15 && var13.field733 + var14 > arg3 && arg11 < var13.field704 + var15) {
                    class83.field1971++;
                    class44.method379(52, var13.field740, -1, class127.field2976, 0, var13.field748, (byte) 114);
                }
                if (var13.field729 == 2) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var13.field704; var20++) {
                        for (int var21 = 0; var21 < var13.field733; var21++) {
                            int var22 = (var13.field796 + 32) * var20 + var15;
                            int var23 = (var13.field760 + 32) * var21 + var14;
                            if (var19 < 20) {
                                var23 += var13.field716[var19];
                                var22 += var13.field734[var19];
                            }
                            if (var23 <= arg3 && var22 <= arg11 && var23 + 32 > arg3 && arg11 < var22 + 32) {
                                class133.field3179 = var13.field740;
                                class99.field2221 = var19;
                                if (var13.field778[var19] > 0) {
                                    class131 var24 = class55.method440(var13.field778[var19] - 1, 21467);
                                    if (class25.field535 == 1 && class61.method476((byte) 24, class83.method649((byte) -102, var13))) {
                                        if (class99.field2225 != var13.field740 || class134.field3192 != var19) {
                                            class14.field308++;
                                            class44.method379(49, var13.field740, var19, class63.method479(new class67[] { class96.field2168, class10.field227, var24.field3103 }, 0), var24.field3092, field832, (byte) 50);
                                        }
                                    } else if (!class70.field1674 || !class61.method476((byte) 24, class83.method649((byte) -102, var13))) {
                                        class55.field1321++;
                                        class67[] var25 = var24.field3088;
                                        if (class25.field541) {
                                            var25 = class49.method403(var25, -116);
                                        }
                                        if (class61.method476((byte) 24, class83.method649((byte) -102, var13))) {
                                            for (int var26 = 4; var26 >= 3; var26--) {
                                                if (var25 != null && var25[var26] != null) {
                                                    class91.field2096++;
                                                    byte var27;
                                                    if (var26 == 3) {
                                                        var27 = 55;
                                                    } else {
                                                        var27 = 19;
                                                    }
                                                    class44.method379(var27, var13.field740, var19, class63.method479(new class67[] { class116.field2741, var24.field3103 }, 0), var24.field3092, var25[var26], (byte) 24);
                                                } else if (var26 == 4) {
                                                    class44.method379(19, var13.field740, var19, class63.method479(new class67[] { class116.field2741, var24.field3103 }, 0), var24.field3092, class106.field2396, (byte) 18);
                                                    class115.field2714++;
                                                }
                                            }
                                        }
                                        if (class125.method974((byte) 11, class83.method649((byte) -102, var13))) {
                                            class75.field1780++;
                                            class44.method379(56, var13.field740, var19, class63.method479(new class67[] { class116.field2741, var24.field3103 }, arg2 - 45), var24.field3092, field832, (byte) 61);
                                        }
                                        if (class61.method476((byte) 24, class83.method649((byte) -102, var13)) && var25 != null) {
                                            for (int var28 = 2; var28 >= 0; var28--) {
                                                if (var25[var28] != null) {
                                                    class121.field2833++;
                                                    byte var29 = 0;
                                                    if (var28 == 0) {
                                                        var29 = 2;
                                                    }
                                                    if (var28 == 1) {
                                                        var29 = 24;
                                                    }
                                                    if (var28 == 2) {
                                                        var29 = 27;
                                                    }
                                                    class44.method379(var29, var13.field740, var19, class63.method479(new class67[] { class116.field2741, var24.field3103 }, 0), var24.field3092, var25[var28], (byte) 48);
                                                }
                                            }
                                        }
                                        class67[] var30 = var13.field741;
                                        if (class25.field541) {
                                            var30 = class49.method403(var30, -103);
                                        }
                                        if (var30 != null) {
                                            for (int var31 = 4; var31 >= 0; var31--) {
                                                if (var30[var31] != null) {
                                                    client.field454++;
                                                    byte var32 = 0;
                                                    if (var31 == 0) {
                                                        var32 = 8;
                                                    }
                                                    if (var31 == 1) {
                                                        var32 = 15;
                                                    }
                                                    if (var31 == 2) {
                                                        var32 = 4;
                                                    }
                                                    if (var31 == 3) {
                                                        var32 = 37;
                                                    }
                                                    if (var31 == 4) {
                                                        var32 = 43;
                                                    }
                                                    class44.method379(var32, var13.field740, var19, class63.method479(new class67[] { class116.field2741, var24.field3103 }, arg2 ^ 0x2D), var24.field3092, var30[var31], (byte) 96);
                                                }
                                            }
                                        }
                                        class44.method379(1005, var13.field740, var19, class63.method479(new class67[] { class116.field2741, var24.field3103 }, arg2 - 45), var24.field3092, class140.field3339, (byte) 115);
                                    } else if ((class106.field2423 & 0x10) == 16) {
                                        class44.method379(14, var13.field740, var19, class63.method479(new class67[] { class90.field2068, class10.field227, var24.field3103 }, 0), var24.field3092, class69.field1652, (byte) 76);
                                        class71.field1680++;
                                    }
                                }
                            }
                            var19++;
                        }
                    }
                }
                if (var13.field722) {
                    if (class70.field1674) {
                        if (class126.method984(true, class83.method649((byte) -102, var13)) && (class106.field2423 & 0x20) == 32 && arg3 >= var14 && arg11 >= var15 && var14 + var13.field733 > arg3 && var13.field704 + var15 > arg11) {
                            class67.field1571++;
                            class44.method379(1, var13.field740, var13.field800, class63.method479(new class67[] { class90.field2068, class69.field1651, var13.field736 }, arg2 - 45), 0, class69.field1652, (byte) 61);
                        }
                    } else if (var14 <= arg3 && var15 <= arg11 && var14 + var13.field733 > arg3 && arg11 < var15 + var13.field704) {
                        for (int var33 = 9; var33 >= 5; var33--) {
                            class67 var37 = class111.method841(var13, -115, var33);
                            if (var37 != null) {
                                class44.method379(45, var13.field740, var13.field800, var13.field736, var33 + 1, var37, (byte) 81);
                                class20.field411++;
                            }
                        }
                        class67 var34 = class73.method594(var13, arg2 ^ 0x52);
                        if (var34 != null) {
                            class44.method379(20, var13.field740, var13.field800, var13.field736, 0, var34, (byte) 116);
                            class125.field2921++;
                        }
                        for (int var35 = 4; var35 >= 0; var35--) {
                            class67 var36 = class111.method841(var13, -85, var35);
                            if (var36 != null) {
                                class44.method379(45, var13.field740, var13.field800, var13.field736, var35 + 1, var36, (byte) 90);
                                class20.field411++;
                            }
                        }
                        if (class129.method993(class83.method649((byte) -102, var13), (byte) -114)) {
                            class83.field1971++;
                            class44.method379(52, var13.field740, -1, class127.field2976, 0, var13.field748, (byte) 83);
                        }
                    }
                }
            }
        }
        if (arg2 != 45) {
            method288(-42);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 566)
    public static void method292(byte arg0) {
        field820 = null;
        field838 = null;
        field831 = null;
        field829 = null;
        field839 = null;
        field827 = null;
        field822 = null;
        field842 = null;
        field832 = null;
        field824 = null;
        field830 = null;
        field837 = null;
        field823 = null;
        if (arg0 < 116) {
            method291(59, 2, -85, -36, -28, 120, null, 12, 22, 76, 50, -48);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V", line = 605)
    public class34(byte[] arg0) {
        this.field841 = arg0;
    }
}
