import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class264 implements Runnable {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[Lcb;")
    public volatile class248[] field4750 = new class248[2];

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Z")
    public volatile boolean field4761 = false;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    public volatile boolean field4758 = false;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Llc;")
    private static class143 field4757 = class66.method374("scroll:", -1);

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Llc;")
    public static class143 field4759 = field4757;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Llc;")
    public static class143 field4763 = field4757;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lgf;")
    public static class7 field4756;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lq;")
    public class81 field4753;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1758(int arg0) {
        field4757 = null;
        field4756 = null;
        field4759 = null;
        if (arg0 != -2761) {
            field4756 = null;
        }
        field4763 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public static final void method1759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class17.field301 == arg3) {
            class186.field3379[class167.field2982 / 100].method1058(class17.field290 - 8, class51.field1009 - 8);
        }
        field4754++;
        if (class17.field301 == 2) {
            class186.field3379[class167.field2982 / 100 + 4].method1058(class17.field290 - 8, class51.field1009 - 8);
        }
        class240.method1608(arg3 ^ 0xFFFF8AFB);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILvh;)V")
    public static final void method1760(int arg0, int arg1, int arg2, class43 arg3) {
        field4760++;
        if (arg3.field803 == 1) {
            class31.field484++;
            class75.method432((short) 28, arg3.field777, 0, true, class21.field342, arg3.field722, 0L);
        }
        if (arg3.field803 == 2 && !class71.field1351) {
            class143 var4 = class13.method102(32767, arg3);
            if (var4 != null) {
                class111.field1962++;
                class75.method432((short) 33, var4, -1, true, class25.method179(0, new class143[] { class128.field2262, arg3.field810 }), arg3.field722, 0L);
            }
        }
        if (arg3.field803 == 3) {
            class97.field1773++;
            class75.method432((short) 20, class221.field4007, 0, true, class21.field342, arg3.field722, 0L);
        }
        int var5 = -115 % ((arg0 + 43) / 62);
        if (arg3.field803 == 4) {
            class189.field3421++;
            class75.method432((short) 25, arg3.field777, 0, true, class21.field342, arg3.field722, 0L);
        }
        if (arg3.field803 == 5) {
            class75.method432((short) 47, arg3.field777, 0, true, class21.field342, arg3.field722, 0L);
            class61.field1159++;
        }
        if (arg3.field803 == 6 && class281.field4937 == null) {
            class75.method432((short) 14, arg3.field777, -1, true, class21.field342, arg3.field722, 0L);
            class179.field3197++;
        }
        if (arg3.field769 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg3.field809; var7++) {
                for (int var8 = 0; var8 < arg3.field739; var8++) {
                    int var9 = (arg3.field791 + 32) * var8;
                    int var10 = (arg3.field871 + 32) * var7;
                    if (var6 < 20) {
                        var10 += arg3.field731[var6];
                        var9 += arg3.field850[var6];
                    }
                    if (var9 <= arg1 && var10 <= arg2 && (var9 + 32) > arg1 && arg2 < var10 + 32) {
                        class256.field4607 = var6;
                        class190.field3471 = arg3;
                        if (arg3.field737[var6] > 0) {
                            class148 var11 = class262.method1743(arg3.field737[var6] - 1, 17366);
                            if (class175.field3132 == 1 && class7.method42(client.method1514(arg3), 0)) {
                                if (class179.field3198 != arg3.field722 || class162.field2912 != var6) {
                                    class279.field4919++;
                                    class75.method432((short) 26, class254.field4549, var6, true, class25.method179(0, new class143[] { class210.field3904, class7.field128, var11.field2681 }), arg3.field722, (long) var11.field2685);
                                }
                            } else if (!class71.field1351 || !class7.method42(client.method1514(arg3), 0)) {
                                class159.field2873++;
                                class143[] var12 = var11.field2673;
                                if (class258.field4635) {
                                    var12 = class72.method415(var12, true);
                                }
                                if (class7.method42(client.method1514(arg3), 0)) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class164.field2934++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 11;
                                            } else {
                                                var14 = 13;
                                            }
                                            class75.method432(var14, var12[var13], var6, true, class25.method179(0, new class143[] { class245.field4390, var11.field2681 }), arg3.field722, (long) var11.field2685);
                                        } else if (var13 == 4) {
                                            class263.field4713++;
                                            class75.method432((short) 13, class145.field2611, var6, true, class25.method179(0, new class143[] { class245.field4390, var11.field2681 }), arg3.field722, (long) var11.field2685);
                                        }
                                    }
                                }
                                if (class99.method586(client.method1514(arg3), (byte) 107)) {
                                    class75.method432((short) 57, class254.field4549, var6, true, class25.method179(0, new class143[] { class245.field4390, var11.field2681 }), arg3.field722, (long) var11.field2685);
                                    class115.field2024++;
                                }
                                if (class7.method42(client.method1514(arg3), 0) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class80.field1446++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 2;
                                            }
                                            if (var15 == 1) {
                                                var16 = 6;
                                            }
                                            if (var15 == 2) {
                                                var16 = 42;
                                            }
                                            class75.method432(var16, var12[var15], var6, true, class25.method179(0, new class143[] { class245.field4390, var11.field2681 }), arg3.field722, (long) var11.field2685);
                                        }
                                    }
                                }
                                class143[] var17 = arg3.field887;
                                if (class258.field4635) {
                                    var17 = class72.method415(var17, true);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            class227.field4094++;
                                            if (var18 == 0) {
                                                var19 = 29;
                                            }
                                            if (var18 == 1) {
                                                var19 = 39;
                                            }
                                            if (var18 == 2) {
                                                var19 = 34;
                                            }
                                            if (var18 == 3) {
                                                var19 = 16;
                                            }
                                            if (var18 == 4) {
                                                var19 = 21;
                                            }
                                            class75.method432(var19, var17[var18], var6, true, class25.method179(0, new class143[] { class245.field4390, var11.field2681 }), arg3.field722, (long) var11.field2685);
                                        }
                                    }
                                }
                                class75.method432((short) 1006, class118.field2101, var6, true, class25.method179(0, new class143[] { class245.field4390, var11.field2681 }), arg3.field722, (long) var11.field2685);
                            } else if ((class106.field1864 & 0x10) == 16) {
                                class75.method432((short) 31, class55.field1067, var6, true, class25.method179(0, new class143[] { class226.field4085, class7.field128, var11.field2681 }), arg3.field722, (long) var11.field2685);
                                class273.field4863++;
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg3.field786) {
            return;
        }
        if (!class71.field1351) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class143 var24 = class155.method1020(arg3, 12757, var20);
                if (var24 != null) {
                    class75.method432((short) 1002, var24, arg3.field719, true, arg3.field800, arg3.field722, (long) (var20 + 1));
                    class120.field2118++;
                }
            }
            class143 var21 = class13.method102(32767, arg3);
            if (var21 != null) {
                class75.method432((short) 33, var21, arg3.field719, true, arg3.field800, arg3.field722, 0L);
                class111.field1962++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class143 var23 = class155.method1020(arg3, 12757, var22);
                if (var23 != null) {
                    class120.field2118++;
                    class75.method432((short) 7, var23, arg3.field719, true, arg3.field800, arg3.field722, (long) (var22 + 1));
                }
            }
            if (!class179.method1178(true, client.method1514(arg3))) {
                return;
            }
            class179.field3197++;
            class75.method432((short) 14, class79.field1444, arg3.field719, true, class21.field342, arg3.field722, 0L);
        } else if (class223.method1535(client.method1514(arg3), (byte) -30) && (class106.field1864 & 0x20) == 32) {
            class75.method432((short) 38, class55.field1067, arg3.field719, true, class25.method179(0, new class143[] { class226.field4085, class132.field2318, arg3.field800 }), arg3.field722, 0L);
            class129.field2282++;
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method1761(int arg0) {
        field4752++;
        class161 var1 = class221.field4004;
        synchronized (class221.field4004) {
            class147.field2660 = class191.field3513;
            class235.field4292 = class277.field4905;
            if (arg0 != 19190) {
                field4763 = null;
            }
            class158.field2859 = class11.field227;
            class92.field1653 = class175.field3140;
            class31.field499 = class192.field3533;
            class202.field3679++;
            class67.field1279 = class24.field399;
            class189.field3425 = class235.field4293;
            class175.field3140 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1762(Throwable arg0, int arg1) throws IOException {
        field4764++;
        String var2;
        if ((arg0 instanceof class168)) {
            class168 var3 = (class168) arg0;
            var2 = var3.field2996 + " | ";
            arg0 = var3.field3000;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg1 != 32) {
                        method1759(-116, -22, -80, 54, -47);
                    }
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Lki;")
    public static final class140 method1763(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class140 var4 = var3.field2129;
            var3.field2129 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)Z")
    public static final boolean method1764(int arg0, int arg1, int arg2) {
        int var3 = class188.field3410[arg0][arg1][arg2];
        if (-class182.field3256 == var3) {
            return false;
        } else if (class182.field3256 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class89.method514(var4 + 1, class192.field3535[arg0][arg1][arg2], var5 + 1) && class89.method514(var4 + 128 - 1, class192.field3535[arg0][arg1 + 1][arg2], var5 + 1) && class89.method514(var4 + 128 - 1, class192.field3535[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class89.method514(var4 + 1, class192.field3535[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class188.field3410[arg0][arg1][arg2] = class182.field3256;
                return true;
            } else {
                class188.field3410[arg0][arg1][arg2] = -class182.field3256;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([Llf;ZB)V")
    public static final void method1765(class106[] arg0, boolean arg1, byte arg2) {
        field4765++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class231.field4225[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class231.field4225[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method632(true, var6, var5);
                            }
                        }
                    }
                }
            }
            class87.field1588 += (int) (Math.random() * 5.0D) - 2;
            if (class87.field1588 < -16) {
                class87.field1588 = -16;
            }
            class99.field1785 += (int) (Math.random() * 5.0D) - 2;
            if (class99.field1785 < -8) {
                class99.field1785 = -8;
            }
            if (class87.field1588 > 16) {
                class87.field1588 = 16;
            }
            if (class99.field1785 > 8) {
                class99.field1785 = 8;
            }
        }
        if (arg2 < 52) {
            field4759 = null;
        }
        int var8 = class87.field1588 >> 1;
        int var9 = class99.field1785 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class137.field2405[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class192.field3535[var12][var100 + 1][var54] - class192.field3535[var12][var100 - 1][var54];
                    int var103 = class192.field3535[var12][var100][var54 + 1] - class192.field3535[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + (var103 * var103) + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var51[var100 + 1][var54] >> 3) + (var51[var100 - 1][var54] >> 2) + (var51[var100][var54] >> 1) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54 + -1] >> 2);
                    int var108 = -65536 / var104;
                    int var109 = (var105 * -50 + var106 * -50 + var108 * -10) / var53 + var101;
                    var10[var100][var54] = var109 - var107;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class36.field618[var55] = 0;
                class173.field3108[var55] = 0;
                class178.field3193[var55] = 0;
                class133.field2326[var55] = 0;
                class7.field146[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class236.field4299[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class272 var96 = class31.method204((byte) 112, var95 - 1);
                            class36.field618[var85] += var96.field4852;
                            class173.field3108[var85] += var96.field4850;
                            class178.field3193[var85] += var96.field4853;
                            class133.field2326[var85] += var96.field4851;
                            var10002 = class7.field146[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class236.field4299[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class272 var99 = class31.method204((byte) 121, var98 - 1);
                            class36.field618[var85] -= var99.field4852;
                            class173.field3108[var85] -= var99.field4850;
                            class178.field3193[var85] -= var99.field4853;
                            class133.field2326[var85] -= var99.field4851;
                            var10002 = class7.field146[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 - 5;
                        int var93 = var91 + 5;
                        if (var93 < 104) {
                            var87 += class173.field3108[var93];
                            var88 += class178.field3193[var93];
                            var89 += class133.field2326[var93];
                            var90 += class7.field146[var93];
                            var86 += class36.field618[var93];
                        }
                        if (var92 >= 0) {
                            var86 -= class36.field618[var92];
                            var88 -= class178.field3193[var92];
                            var90 -= class7.field146[var92];
                            var87 -= class173.field3108[var92];
                            var89 -= class133.field2326[var92];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var11[var56][var91] = class211.method1475(var87 / var90, var88 / var90, (byte) -120, var86 * 256 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg1 || class21.method149((byte) -57) || (class231.field4225[0][var57][var58] & 0x2) != 0 || (class231.field4225[var12][var57][var58] & 0x10) == 0 && class71.method411(26298, var58, var57, var12) == class225.field4075) {
                        if (class287.field5041 > var12) {
                            class287.field5041 = var12;
                        }
                        int var59 = class153.field2771[var12][var57][var58] & 0xFF;
                        int var60 = class236.field4299[var12][var57][var58] & 0xFF;
                        if (var60 > 0 || var59 > 0) {
                            int var61 = class192.field3535[var12][var57][var58];
                            int var62 = class192.field3535[var12][var57 + 1][var58];
                            int var63 = class192.field3535[var12][var57 + 1][var58 + 1];
                            int var64 = class192.field3535[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var60 == 0 && class36.field620[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var59 > 0 && !class9.method78(var59 - 1, false).field50) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class272.field4858[var12][var57][var58] = class119.method729(class272.field4858[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var60 > 0) {
                                var66 = var11[var57][var58];
                                int var67 = (var66 & 0x7F) + var8;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var9 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class196.field3640[class70.method406(50, var68, 96)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var10[var57 + 1][var58];
                            int var71 = var10[var57][var58];
                            int var72 = var10[var57][var58 + 1];
                            int var73 = var10[var57 + 1][var58 + 1];
                            if (var59 == 0) {
                                class200.method1377(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class70.method406(56, var66, var71), class70.method406(47, var66, var70), class70.method406(65, var66, var73), class70.method406(63, var66, var72), 0, 0, 0, 0, var69, 0);
                            } else {
                                byte var74 = class283.field4992[var12][var57][var58];
                                int var75 = class36.field620[var12][var57][var58] + 1;
                                class4 var76 = class9.method78(var59 - 1, false);
                                int var77 = var76.field57;
                                if (var77 >= 0 && !class196.field3636.method385(125, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var79 = class196.field3640[class13.method105(class196.field3636.method388(0, var77), 96, true)];
                                    var78 = -1;
                                } else if (var76.field55 == -1) {
                                    var78 = -2;
                                    var79 = 0;
                                } else {
                                    var78 = var76.field55;
                                    int var80 = (var78 & 0x7F) + var8;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var9 + var78 & 0xFC00) - (-(var78 & 0x380) - var80);
                                    var79 = class196.field3640[class13.method105(var81, 96, true)];
                                }
                                if (var76.field60 >= 0) {
                                    int var82 = var76.field60;
                                    int var83 = (var82 & 0x7F) + var8;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 & 0x380) + ((var9 + var82 & 0xFC00) + var83);
                                    var79 = class196.field3640[class13.method105(var84, 96, true)];
                                }
                                class200.method1377(var12, var57, var58, var75, var74, var77, var61, var62, var63, var64, class70.method406(115, var66, var71), class70.method406(116, var66, var70), class70.method406(27, var66, var73), class70.method406(54, var66, var72), class13.method105(var78, var71, true), class13.method105(var78, var70, true), class13.method105(var78, var73, true), class13.method105(var78, var72, true), var69, var79);
                            }
                        }
                    }
                }
            }
            class236.field4299[var12] = null;
            class153.field2771[var12] = null;
            class36.field620[var12] = null;
            class283.field4992[var12] = null;
            class137.field2405[var12] = null;
        }
        class149.method971(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class231.field4225[1][var13][var50] & 0x2) == 2) {
                    class176.method1159(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class272.field4858[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 > 0 && (class272.field4858[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                        }
                        int var18 = var15;
                        int var19 = var14;
                        int var20 = var14;
                        while (var18 < 104 && (class272.field4858[var14][var16][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        label351: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class272.field4858[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label351;
                                }
                            }
                            var19--;
                        }
                        label340: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class272.field4858[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var18 + 1 - var17) * (var20 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class192.field3535[var19][var16][var17];
                            int var26 = class192.field3535[var20][var16][var17] - var24;
                            class133.method794(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var25);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class272.field4858[var27][var16][var28] = class129.method777(class272.field4858[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class272.field4858[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30 = var14;
                        int var31 = var14;
                        while (var29 > 0 && (class272.field4858[var14][var29 - 1][var15] & 0x2) != 0) {
                            var29--;
                        }
                        int var32;
                        for (var32 = var16; var32 < 104 && (class272.field4858[var14][var32 + 1][var15] & 0x2) != 0; var32++) {
                        }
                        label405: while (var31 > 0) {
                            for (int var33 = var29; var33 <= var32; var33++) {
                                if ((class272.field4858[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label405;
                                }
                            }
                            var31--;
                        }
                        label394: while (var30 < 3) {
                            for (int var34 = var29; var34 <= var32; var34++) {
                                if ((class272.field4858[var30 + 1][var34][var15] & 0x2) == 0) {
                                    break label394;
                                }
                            }
                            var30++;
                        }
                        int var35 = (var32 + 1 - var29) * (var30 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class192.field3535[var31][var29][var15];
                            int var38 = class192.field3535[var30][var29][var15] - var36;
                            class133.method794(2, var29 * 128, var32 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var31; var39 <= var30; var39++) {
                                for (int var40 = var29; var40 <= var32; var40++) {
                                    class272.field4858[var39][var40][var15] = class129.method777(class272.field4858[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class272.field4858[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var15;
                        int var42 = var16;
                        int var43 = var16;
                        while (var41 > 0 && (class272.field4858[var14][var16][var41 - 1] & 0x4) != 0) {
                            var41--;
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class272.field4858[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label459: while (var42 > 0) {
                            for (int var45 = var41; var45 <= var44; var45++) {
                                if ((class272.field4858[var14][var42 - 1][var45] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var42--;
                        }
                        label448: while (var43 < 104) {
                            for (int var46 = var41; var46 <= var44; var46++) {
                                if ((class272.field4858[var14][var43 + 1][var46] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var43++;
                        }
                        if (((var44 - (var41 - 1)) * (var43 - (var42 - 1))) >= 4) {
                            int var47 = class192.field3535[var14][var42][var41];
                            class133.method794(4, var42 * 128, var43 * 128 + 128, var41 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var42; var48 <= var43; var48++) {
                                for (int var49 = var41; var49 <= var44; var49++) {
                                    class272.field4858[var14][var48][var49] = class129.method777(class272.field4858[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
    public final void run() {
        this.field4758 = true;
        field4762++;
        try {
            while (!this.field4761) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class248 var2 = this.field4750[var1];
                    if (var2 != null) {
                        var2.method1657(true);
                    }
                }
                class61.method347(10L, 1);
                class9.method69(this.field4753, 125, (Object) null);
            }
        } catch (Exception var9) {
            class255.method1689(114, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field4758 = false;
        }
    }
}
