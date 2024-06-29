import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class144 extends class8 {

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "D")
    public static double field2241 = -1.0D;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "[I")
    public static int[] field2244 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "[I")
    public static int[] field2248 = new int[4096];

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "Lha;")
    public static class328 field2249;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "Lcd;")
    private class69 field2245;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 5)
    public static final String method1060(byte arg0, int arg1) {
        field2240++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 >= 10000000) {
            if (arg0 < 76) {
                method1069(61);
            }
            return "<col=00ff80>" + arg1 / 1000000 + class288.field4611 + "</col>";
        } else {
            return "<col=ffffff>" + arg1 / 1000 + class330.field5087 + "</col>";
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILog;I)V", line = 25)
    public static final void method1061(int arg0, int arg1, class157 arg2, int arg3) {
        field2243++;
        if (arg2.field2598 == arg1) {
            class93.field1274++;
            class20.method111(arg2.field2570, arg2.field2486, 0, "", (short) 47, -1, 1, 0L);
        }
        if (arg2.field2598 == 2 && !class142.field2216) {
            String var4 = class316.method2226(arg2, (byte) 119);
            if (var4 != null) {
                class20.method111(var4, arg2.field2486, -1, "<col=00ff00>" + arg2.field2452, (short) 46, -1, 1, 0L);
                class211.field3455++;
            }
        }
        if (arg2.field2598 == 3) {
            class116.field1758++;
            class20.method111(class212.field3473, arg2.field2486, 0, "", (short) 38, -1, 1, 0L);
        }
        if (arg2.field2598 == 4) {
            client.field1670++;
            class20.method111(arg2.field2570, arg2.field2486, 0, "", (short) 43, -1, arg1, 0L);
        }
        if (arg2.field2598 == 5) {
            class20.method111(arg2.field2570, arg2.field2486, 0, "", (short) 16, -1, 1, 0L);
            class160.field2641++;
        }
        if (arg2.field2598 == 6 && class52.field740 == null) {
            class295.field4670++;
            class20.method111(arg2.field2570, arg2.field2486, -1, "", (short) 13, -1, 1, 0L);
        }
        if (arg2.field2478 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field2424; var6++) {
                for (int var7 = 0; var7 < arg2.field2428; var7++) {
                    int var8 = (arg2.field2590 + 32) * var7;
                    int var9 = (arg2.field2454 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field2442[var5];
                        var9 += arg2.field2427[var5];
                    }
                    if (arg3 >= var8 && arg0 >= var9 && arg3 < (var8 + 32) && arg0 < var9 + 32) {
                        class284.field4548 = var5;
                        class211.field3461 = arg2;
                        if (arg2.field2483[var5] > 0) {
                            class279 var10 = client.method766(arg2);
                            class330 var11 = class285.method2054(arg2.field2483[var5] - 1, 0);
                            if (class8.field119 == 1 && var10.method2026(true)) {
                                if (class223.field3563 != arg2.field2486 || class231.field3674 != var5) {
                                    class20.method111(class64.field925, arg2.field2486, var5, class229.field3644 + " -> <col=ff9040>" + var11.field5135, (short) 18, -1, 1, (long) var11.field5117);
                                    class343.field5337++;
                                }
                            } else if (class142.field2216 && var10.method2026(true)) {
                                class168 var12 = class301.field4728 == -1 ? null : class36.method194(class301.field4728, -19375);
                                if ((class158.field2615 & 0x10) != 0 && (var12 == null || var11.method2319(124, var12.field2773, class301.field4728) != var12.field2773)) {
                                    class141.field2203++;
                                    class20.method111(class141.field2204, arg2.field2486, var5, class200.field3247 + " -> <col=ff9040>" + var11.field5135, (short) 49, class331.field5165, 1, (long) var11.field5117);
                                }
                            } else {
                                String[] var13 = var11.field5098;
                                if (class60.field840) {
                                    var13 = class153.method1107(var13, -107);
                                }
                                if (var10.method2026(true)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class49.field691++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 26;
                                            } else {
                                                var15 = 45;
                                            }
                                            class20.method111(var13[var14], arg2.field2486, var5, "<col=ff9040>" + var11.field5135, var15, -1, arg1, (long) var11.field5117);
                                        }
                                    }
                                }
                                if (var10.method2023(-82)) {
                                    class10.field133++;
                                    class20.method111(class64.field925, arg2.field2486, var5, "<col=ff9040>" + var11.field5135, (short) 31, class223.field3562, 1, (long) var11.field5117);
                                }
                                if (var10.method2026(true) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class58.field823++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 15;
                                            }
                                            if (var16 == 1) {
                                                var17 = 2;
                                            }
                                            if (var16 == 2) {
                                                var17 = 22;
                                            }
                                            class20.method111(var13[var16], arg2.field2486, var5, "<col=ff9040>" + var11.field5135, var17, -1, arg1, (long) var11.field5117);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field2447;
                                if (class60.field840) {
                                    var18 = class153.method1107(var18, -69);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            class61.field863++;
                                            if (var19 == 0) {
                                                var20 = 8;
                                            }
                                            if (var19 == 1) {
                                                var20 = 10;
                                            }
                                            if (var19 == 2) {
                                                var20 = 3;
                                            }
                                            if (var19 == 3) {
                                                var20 = 57;
                                            }
                                            if (var19 == 4) {
                                                var20 = 17;
                                            }
                                            class20.method111(var18[var19], arg2.field2486, var5, "<col=ff9040>" + var11.field5135, var20, -1, 1, (long) var11.field5117);
                                        }
                                    }
                                }
                                class20.method111(class63.field918, arg2.field2486, var5, "<col=ff9040>" + var11.field5135, (short) 1006, class227.field3622, 1, (long) var11.field5117);
                                class341.field5307++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field2421) {
            return;
        }
        if (!class142.field2216) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class48.method303(var21, arg2, -14575);
                if (var22 != null) {
                    class20.method111(var22, arg2.field2486, arg2.field2482, arg2.field2532, (short) 1004, class322.method2260(var21, arg1 ^ 0x6515, arg2), arg1, (long) (var21 + 1));
                    class167.field2770++;
                }
            }
            String var23 = class316.method2226(arg2, (byte) 122);
            if (var23 != null) {
                class20.method111(var23, arg2.field2486, arg2.field2482, arg2.field2532, (short) 46, -1, 1, 0L);
                class211.field3455++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class48.method303(var24, arg2, -14575);
                if (var25 != null) {
                    class167.field2770++;
                    class20.method111(var25, arg2.field2486, arg2.field2482, arg2.field2532, (short) 29, class322.method2260(var24, 25876, arg2), arg1, (long) (var24 - -1));
                }
            }
            if (client.method766(arg2).method2024(115)) {
                class295.field4670++;
                if (arg2.field2460 == null) {
                    class20.method111(class273.field4395, arg2.field2486, arg2.field2482, "", (short) 13, -1, 1, 0L);
                } else {
                    class20.method111(arg2.field2460, arg2.field2486, arg2.field2482, "", (short) 13, -1, 1, 0L);
                }
            }
        } else if (client.method766(arg2).method2020(true) && (class158.field2615 & 0x20) != 0) {
            class20.method111(class141.field2204, arg2.field2486, arg2.field2482, class200.field3247 + " -> " + arg2.field2532, (short) 50, class331.field5165, arg1, 0L);
            class153.field2360++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[B)[B", line = 341)
    public static final byte[] method1062(int arg0, byte[] arg1) {
        field2239++;
        class44 var2 = new class44(arg1);
        int var3 = var2.method286((byte) -96);
        int var4 = var2.method238((byte) 82);
        if (var4 < 0 || class99.field1442 != 0 && var4 > class99.field1442) {
            throw new RuntimeException();
        } else if (arg0 == var3) {
            byte[] var7 = new byte[var4];
            var2.method259(arg0 + 354643112, var7, 0, var4);
            return var7;
        } else {
            int var5 = var2.method238((byte) 82);
            if (var5 < 0 || class99.field1442 != 0 && class99.field1442 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class292.method2092(var6, var5, arg1, var4, 9);
            } else {
                class62.field912.method2140(var6, var2, (byte) 64);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZILjj;)V", line = 393)
    private final void method1063(boolean arg0, int arg1, class44 arg2) {
        field2242++;
        if (!arg0) {
            method1068(-26);
        }
        if (arg1 != 249) {
            return;
        }
        int var4 = arg2.method286((byte) -69);
        if (this.field2245 == null) {
            int var5 = class120.method843(-103, var4);
            this.field2245 = new class69(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method286((byte) -106) == 1;
            int var8 = arg2.method273(-867673064);
            class165 var9;
            if (var7) {
                var9 = new class131(arg2.method265(0));
            } else {
                var9 = new class174(arg2.method238((byte) 82));
            }
            this.field2245.method461(-120, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjj;)V", line = 444)
    public final void method1064(byte arg0, class44 arg1) {
        if (arg0 <= 38) {
            return;
        }
        while (true) {
            int var3 = arg1.method286((byte) -79);
            if (var3 == 0) {
                field2237++;
                return;
            }
            this.method1063(true, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lmm;B)V", line = 469)
    public static final void method1065(class39 arg0, byte arg1) {
        class286.method2058(200000, 25, arg0);
        field2251++;
        if (arg1 != 67) {
            field2238 = -67;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)I", line = 481)
    public final int method1066(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.method1066(-55, 72, -107);
        }
        field2246++;
        if (this.field2245 == null) {
            return arg2;
        } else {
            class174 var4 = (class174) this.field2245.method451((long) arg0, (byte) 100);
            return var4 == null ? arg2 : var4.field2881;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 505)
    public static final void method1067(byte arg0, String arg1) {
        field2252++;
        class13.field154 = arg1;
        if (class14.field159.field1951 == null) {
            return;
        }
        if (arg0 != -89) {
            field2244 = (int[]) null;
        }
        try {
            String var2 = class14.field159.field1951.getParameter("cookieprefix");
            String var3 = class14.field159.field1951.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class336.method2347(arg0 + 207, class283.method2038((byte) 122) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class308.method2182(class14.field159.field1951, "document.cookie=\"" + var5 + "\"", false);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 546)
    public static final void method1068(int arg0) {
        field2247++;
        int var1 = -53 / ((-arg0 - 22) / 62);
        class279.field4492.method707(0);
        class106.field1572.method707(0);
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V", line = 558)
    public static void method1069(int arg0) {
        field2244 = null;
        if (arg0 > -37) {
            field2241 = 2.2536490297442904D;
        }
        field2249 = null;
        field2248 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 573)
    public final String method1070(int arg0, String arg1, int arg2) {
        field2250++;
        if (arg0 != 16370) {
            method1069(-117);
        }
        if (this.field2245 == null) {
            return arg1;
        } else {
            class131 var4 = (class131) this.field2245.method451((long) arg2, (byte) 100);
            return var4 == null ? arg1 : var4.field2069;
        }
    }
}
