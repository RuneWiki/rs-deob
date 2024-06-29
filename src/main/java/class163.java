import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class163 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Ltl;")
    public static class59 field2653 = class85.method639("(U4", 9588);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Ltl;")
    public static class59 field2651 = class85.method639(" zuerst von Ihrer Ignorieren)2Liste(Q", 9588);

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[J")
    public static long[] field2660 = new long[100];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ltl;")
    public static class59 field2656 = class85.method639("(Y<)4col>", 9588);

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[B")
    public static byte[] field2658;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Ltl;")
    public static class59 field2661;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[[I")
    public static int[][] field2662;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIBI)V", line = 15)
    public static final void method1157(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2659++;
        if (arg3 != -104) {
            return;
        }
        if (arg0 <= arg2) {
            class174.method1283(7, arg4, field2662[arg1], arg0, arg2);
        } else {
            class174.method1283(7, arg4, field2662[arg1], arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V", line = 47)
    public static final void method1158(int arg0, int arg1, int arg2) {
        field2655++;
        for (int var3 = 0; var3 < class90.field1424; var3++) {
            class34 var4 = class289.method2008(var3, arg2 ^ 0xFFFFAEE9);
            if (var4 != null) {
                int var5 = var4.field508;
                if (var5 >= 0 && !class298.field5107.method379(var5, (byte) 73)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field494 >= 0) {
                    int var6 = var4.field494;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg1 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class298.field5102[class13.method92(82, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class298.field5102[class13.method92(42, class298.field5107.method374(var5, -2), 96)];
                } else if (var4.field500 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field500;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg1 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class298.field5102[class13.method92(106, var12, 96)];
                }
                class213.field3495[var3 + 1] = var9;
            }
        }
        if (arg2 != -20755) {
            field2662 = (int[][]) ((int[][]) null);
        }
    }

    static {
        int var0 = 0;
        field2658 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2658[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field2661 = class85.method639("::wm2", 9588);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIILdl;I)V", line = 129)
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, class30 arg5, int arg6) {
        field2657++;
        long var7 = 0L;
        if (arg4 == 0) {
            var7 = class4.method25(arg6, arg2, arg3);
        } else if (arg4 == 1) {
            var7 = class155.method1109(arg6, arg2, arg3);
        } else if (arg4 == 2) {
            var7 = class316.method2179(arg6, arg2, arg3);
        } else if (arg4 == 3) {
            var7 = class1.method10(arg6, arg2, arg3);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        if (arg1 < 56) {
            return;
        }
        boolean var11 = false;
        int var12 = (int) var7 >> 14 & 0x1F;
        class180 var13 = class188.method1390(var10, false);
        boolean var14 = false;
        int var15 = (int) var7 >> 20 & 0x3;
        if (var13.method1339(255)) {
            class288.method2001(arg6, true, arg3, arg2, var13);
        }
        if (var7 == 0L) {
            return;
        }
        class176 var16 = null;
        class176 var17 = null;
        if (arg4 == 0) {
            class201 var21 = class209.method1473(arg6, arg2, arg3);
            if (var21 != null) {
                var16 = var21.field3326;
                var17 = var21.field3323;
            }
            if (var13.field3011 != 0) {
                arg5.method206(arg3, (byte) 123, var13.field2948, var15, var12, arg2);
            }
        } else if (arg4 == 1) {
            class222 var20 = class80.method615(arg6, arg2, arg3);
            if (var20 != null) {
                var16 = var20.field3593;
                var17 = var20.field3588;
            }
        } else if (arg4 == 2) {
            class165 var19 = class187.method1383(arg6, arg2, arg3);
            if (var19 != null) {
                var17 = var19.field2688;
            }
            if (var13.field3011 != 0 && (var13.field3006 + arg2) < 104 && (var13.field3006 + arg3) < 104 && var13.field2976 + arg2 < 104 && (arg3 + var13.field2976) < 104) {
                arg5.method201(-3176, var13.field2976, arg3, arg2, var15, var13.field3006, var13.field2948);
            }
        } else if (arg4 == 3) {
            class296 var18 = class146.method1060(arg6, arg2, arg3);
            if (var18 != null) {
                var17 = var18.field5073;
            }
            if (var13.field3011 == 1) {
                arg5.method195(94, arg3, arg2);
            }
        }
        if (!class55.field815 || !var13.field2953) {
            return;
        }
        if (var12 == 2) {
            if (var17 instanceof class237) {
                ((class237) var17).method1663(-2024168478);
            } else {
                class228.method1564(var15 + 4, arg2, var13, arg3, var12, true, 0, 0, arg0);
            }
            if (var16 instanceof class237) {
                ((class237) var16).method1663(-2024168478);
            } else {
                class228.method1564(var15 + 1 & 0x3, arg2, var13, arg3, var12, true, 0, 0, arg0);
            }
        } else if (var12 == 5) {
            if (var17 instanceof class237) {
                ((class237) var17).method1663(-2024168478);
            } else {
                class228.method1564(var15, arg2, var13, arg3, 4, true, class288.field4947[var15] * 8, class50.field767[var15] * 8, arg0);
            }
        } else if (var12 == 6) {
            if (var17 instanceof class237) {
                ((class237) var17).method1663(-2024168478);
            } else {
                class228.method1564(var15 + 4, arg2, var13, arg3, 4, true, class131.field2164[var15] * 8, class129.field2126[var15] * 8, arg0);
            }
        } else if (var12 == 7) {
            if ((var17 instanceof class237)) {
                ((class237) var17).method1663(-2024168478);
            } else {
                class228.method1564((var15 + 2 & 0x3) + 4, arg2, var13, arg3, 4, true, 0, 0, arg0);
            }
        } else if (var12 == 8) {
            if (var17 instanceof class237) {
                ((class237) var17).method1663(-2024168478);
            } else {
                class228.method1564(var15 + 4, arg2, var13, arg3, 4, true, class131.field2164[var15] * 8, class129.field2126[var15] * 8, arg0);
            }
            if (var16 instanceof class237) {
                ((class237) var16).method1663(-2024168478);
            } else {
                class228.method1564((var15 + 2 & 0x3) + 4, arg2, var13, arg3, 4, true, class131.field2164[var15] * 8, class129.field2126[var15] * 8, arg0);
            }
        } else if (var12 == 11) {
            if (var17 instanceof class237) {
                ((class237) var17).method1663(-2024168478);
            } else {
                class228.method1564(var15 + 4, arg2, var13, arg3, 10, true, 0, 0, arg0);
            }
        } else if ((var17 instanceof class237)) {
            ((class237) var17).method1663(-2024168478);
        } else {
            class228.method1564(var15, arg2, var13, arg3, var12, true, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 324)
    public static final void method1160(int arg0) {
        field2652++;
        if (arg0 != 30903) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class231.field3803 - 1); var2++) {
                if (class27.field363[var2] < 1000 && class27.field363[var2 + 1] > 1000) {
                    var1 = false;
                    class59 var3 = class294.field5015[var2];
                    class294.field5015[var2] = class294.field5015[var2 + 1];
                    class294.field5015[var2 + 1] = var3;
                    class59 var4 = class93.field1440[var2];
                    class93.field1440[var2] = class93.field1440[var2 + 1];
                    class93.field1440[var2 + 1] = var4;
                    int var5 = class29.field393[var2];
                    class29.field393[var2] = class29.field393[var2 + 1];
                    class29.field393[var2 + 1] = var5;
                    int var6 = class40.field598[var2];
                    class40.field598[var2] = class40.field598[var2 + 1];
                    class40.field598[var2 + 1] = var6;
                    short var7 = class27.field363[var2];
                    class27.field363[var2] = class27.field363[var2 + 1];
                    class27.field363[var2 + 1] = var7;
                    long var8 = class281.field4843[var2];
                    class281.field4843[var2] = class281.field4843[var2 + 1];
                    class281.field4843[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 381)
    public static final void method1161(byte arg0) {
        int var1 = 80 % ((56 - arg0) / 42);
        field2654++;
        for (int var2 = 0; var2 < class140.field2310; var2++) {
            int var10002 = class232.field3817[var2]--;
            if (class232.field3817[var2] >= -10) {
                class144 var3 = class239.field3992[var2];
                if (var3 == null) {
                    var3 = class144.method1049(class11.field145, class216.field3530[var2], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class232.field3817[var2] += var3.method1047();
                    class239.field3992[var2] = var3;
                }
                if (class232.field3817[var2] < 0) {
                    int var4;
                    if (class34.field503[var2] == 0) {
                        var4 = class228.field3686;
                    } else {
                        int var5 = (class34.field503[var2] & 0xFF) * 128;
                        int var6 = class34.field503[var2] >> 16 & 0xFF;
                        int var7 = class34.field503[var2] >> 8 & 0xFF;
                        int var8 = var7 * 128 - (class286.field4920.field1769 - 64);
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 * 128 + 64 - class286.field4920.field1774;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var10 > var5) {
                            class232.field3817[var2] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class191.field3198 / var5;
                    }
                    if (var4 > 0) {
                        class107 var11 = var3.method1048().method801(class145.field2380);
                        class115 var12 = class115.method834(var11, 100, var4);
                        var12.method852(class219.field3568[var2] - 1);
                        class222.field3596.method365(var12);
                    }
                    class232.field3817[var2] = -100;
                }
            } else {
                class140.field2310--;
                for (int var13 = var2; var13 < class140.field2310; var13++) {
                    class216.field3530[var13] = class216.field3530[var13 + 1];
                    class239.field3992[var13] = class239.field3992[var13 + 1];
                    class219.field3568[var13] = class219.field3568[var13 + 1];
                    class232.field3817[var13] = class232.field3817[var13 + 1];
                    class34.field503[var13] = class34.field503[var13 + 1];
                }
                var2--;
            }
        }
        if (class254.field4219 && !class160.method1143((byte) -96)) {
            if (class99.field1600 != 0 && class211.field3454 != -1) {
                class150.method1082(67, false, class98.field1573, class211.field3454, 0, class99.field1600);
            }
            class254.field4219 = false;
        } else if (class99.field1600 != 0 && class211.field3454 != -1 && !class160.method1143((byte) -59)) {
            class234.field3888.method1768(true, 254);
            class234.field3888.method1213(-1, class211.field3454);
            class211.field3454 = -1;
            class23.field302++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 511)
    public static void method1162(boolean arg0) {
        field2660 = null;
        field2658 = null;
        if (!arg0) {
            method1157(-85, 37, -67, (byte) -73, 13);
        }
        field2651 = null;
        field2653 = null;
        field2661 = null;
        field2662 = (int[][]) null;
        field2656 = null;
    }
}
