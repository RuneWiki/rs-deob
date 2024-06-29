import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class173 extends class120 {

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "Ljava/lang/String;")
    public String field2722;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2714 = " is already on your ignore list.";

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field2715 = 0;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field2720 = 0;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field2723 = -2;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "[Lfg;")
    public static class12[] field2724;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "[[[B")
    public static byte[][][] field2711;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "[[[Lsj;")
    public static class49[][][] field2712;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static final void method1217(byte arg0) {
        class149.field2208 = -3;
        class254.field4115 = 0;
        class104.field1602 = 0;
        class234.field3760 = 0;
        if (arg0 != 44) {
            method1222(false);
        }
        class186.field2927 = false;
        class111.field1680 = 1;
        class94.field1454 = -1;
        field2717++;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
    public static final void method1218(int arg0, int arg1) {
        class145.field2135.method1425(arg0, -114);
        if (arg1 != -1782761983) {
            method1217((byte) 95);
        }
        class207.field3234.method1425(arg0, -121);
        class168.field2596.method1425(arg0, arg1 ^ 0x6A42C983);
        field2709++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 10) {
            return;
        }
        field2718++;
        class28.field388 = 0;
        for (int var7 = -1; var7 < class73.field1040 + class236.field3774; var7++) {
            class82 var23;
            if (var7 == -1) {
                var23 = class149.field2227;
            } else if (var7 >= class73.field1040) {
                var23 = class100.field1566[class248.field3967[var7 - class73.field1040]];
            } else {
                var23 = class153.field2277[class8.field117[var7]];
            }
            if (var23 != null && var23.method409(0)) {
                if (var23 instanceof class56) {
                    class136 var24 = ((class56) var23).field793;
                    if (var24.field1987 != null) {
                        var24 = var24.method928(12);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class73.field1040) {
                    class136 var25 = ((class56) var23).field793;
                    if (var25.field1987 != null) {
                        var25 = var25.method928(12);
                    }
                    if (var25.field2006 >= 0 && var25.field2006 < class282.field4467.length) {
                        int var26;
                        if (var25.field2008 == -1) {
                            var26 = var23.method569((byte) -116) + 15;
                        } else {
                            var26 = var25.field2008 + 15;
                        }
                        class10.method60(arg0, arg4 ^ 0x75, arg1 >> 1, arg2, var26, var23, arg3 >> 1);
                        if (class199.field3121 > -1) {
                            class282.field4467[var25.field2006].method71(class199.field3121 + arg5 - 12, class179.field2789 + arg6 + -30);
                        }
                    }
                    class194[] var27 = class144.field2129;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class194 var29 = var27[var28];
                        if (var29 != null && var29.field3050 == 1 && class248.field3967[var7 - class73.field1040] == var29.field3045 && (class111.field1684 % 20) < 10) {
                            int var30;
                            if (var25.field2008 == -1) {
                                var30 = var23.method569((byte) -117) + 15;
                            } else {
                                var30 = var25.field2008 + 15;
                            }
                            class10.method60(arg0, 125, arg1 >> 1, arg2, var30, var23, arg3 >> 1);
                            if (class199.field3121 > -1) {
                                class146.field2152[var29.field3053].method71(arg5 - (12 - class199.field3121), class179.field2789 + arg6 - 28);
                            }
                        }
                    }
                } else {
                    class186 var31 = (class186) var23;
                    int var32 = 30;
                    if (var31.field2935 != -1 || var31.field2942 != -1) {
                        class10.method60(arg0, 125, arg1 >> 1, arg2, var23.method569((byte) -112) + 15, var23, arg3 >> 1);
                        if (class199.field3121 > -1) {
                            if (var31.field2935 != -1) {
                                class246.field3950[var31.field2935].method71(class199.field3121 + arg5 - 12, class179.field2789 + arg6 + -var32);
                                var32 += 25;
                            }
                            if (var31.field2942 != -1) {
                                class282.field4467[var31.field2942].method71(class199.field3121 + arg5 - 12, class179.field2789 + arg6 - var32);
                                var32 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class194[] var33 = class144.field2129;
                        for (int var34 = 0; var34 < var33.length; var34++) {
                            class194 var35 = var33[var34];
                            if (var35 != null && var35.field3050 == 10 && class8.field117[var7] == var35.field3045) {
                                class10.method60(arg0, -72, arg1 >> 1, arg2, var23.method569((byte) -104) + 15, var23, arg3 >> 1);
                                if (class199.field3121 > -1) {
                                    class146.field2152[var35.field3053].method71(class199.field3121 + arg5 - 12, arg6 - -class179.field2789 + -var32);
                                }
                            }
                        }
                    }
                }
                if (var23.field1278 != null && (class73.field1040 <= var7 || class232.field3732 == 0 || class232.field3732 == 3 || class232.field3732 == 1 && class239.method1617(((class186) var23).field2912, true))) {
                    class10.method60(arg0, 125, arg1 >> 1, arg2, var23.method569((byte) -102), var23, arg3 >> 1);
                    if (class199.field3121 > -1 && class28.field388 < class101.field1578) {
                        class101.field1577[class28.field388] = class232.field3734.method1309(var23.field1278) / 2;
                        class101.field1576[class28.field388] = class232.field3734.field2956;
                        class101.field1568[class28.field388] = class199.field3121;
                        class101.field1572[class28.field388] = class179.field2789;
                        class101.field1571[class28.field388] = var23.field1258;
                        class101.field1575[class28.field388] = var23.field1217;
                        class101.field1569[class28.field388] = var23.field1194;
                        class101.field1579[class28.field388] = var23.field1278;
                        class28.field388++;
                    }
                }
                if (var23.field1220 > class111.field1684) {
                    class229 var36 = class76.field1080[0];
                    class229 var37 = class76.field1080[1];
                    int var38;
                    if ((var23 instanceof class56)) {
                        class56 var39 = (class56) var23;
                        class229[] var40 = (class229[]) class37.field484.method1428((long) var39.field793.field2001, (byte) -67);
                        if (var40 == null) {
                            var40 = class281.method1881(var39.field793.field2001, 0, class237.field3802, false);
                            if (var40 != null) {
                                class37.field484.method1424((long) var39.field793.field2001, var40, -2003648287);
                            }
                        }
                        class136 var41 = var39.field793;
                        if (var40 != null && var40.length == 2) {
                            var36 = var40[0];
                            var37 = var40[1];
                        }
                        if (var41.field2008 == -1) {
                            var38 = var23.method569((byte) -123);
                        } else {
                            var38 = var41.field2008;
                        }
                    } else {
                        var38 = var23.method569((byte) -105);
                    }
                    class10.method60(arg0, 127, arg1 >> 1, arg2, var36.field3713 + var38 + 10, var23, arg3 >> 1);
                    if (class199.field3121 > -1) {
                        int var42 = class179.field2789 + arg6 - 3;
                        int var43 = arg5 + class199.field3121 - (var36.field3712 >> 1);
                        var36.method71(var43, var42);
                        int var44 = var23.field1255 * var36.field3712 / 255;
                        int var45 = var36.field3713;
                        class127.method866(var43, var42, var43 + var44, var42 - -var45);
                        var37.method71(var43, var42);
                        class127.method861(arg5, arg6, arg1 + arg5, arg3 + arg6);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (class111.field1684 < var23.field1245[var46]) {
                        int var47;
                        if ((var23 instanceof class56)) {
                            class56 var48 = (class56) var23;
                            class136 var49 = var48.field793;
                            if (var49.field2008 == -1) {
                                var47 = var23.method569((byte) -115) / 2;
                            } else {
                                var47 = var49.field2008 / 2;
                            }
                        } else {
                            var47 = var23.method569((byte) -122) / 2;
                        }
                        class10.method60(arg0, 126, arg1 >> 1, arg2, var47, var23, arg3 >> 1);
                        if (class199.field3121 > -1) {
                            if (var46 == 1) {
                                class179.field2789 -= 20;
                            }
                            if (var46 == 2) {
                                class199.field3121 -= 15;
                                class179.field2789 -= 10;
                            }
                            if (var46 == 3) {
                                class179.field2789 -= 10;
                                class199.field3121 += 15;
                            }
                            class290.field4578[var23.field1201[var46]].method71(arg5 - (12 - class199.field3121), class179.field2789 + arg6 + -12);
                            class144.field2118.method1315(Integer.toString(var23.field1241[var46]), class199.field3121 + arg5 - 1, arg6 + 3 + class179.field2789, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class28.field388; var8++) {
            int var9 = class101.field1572[var8];
            int var10 = class101.field1568[var8];
            int var11 = class101.field1576[var8];
            int var12 = class101.field1577[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((class101.field1572[var22] - class101.field1576[var22]) < (var9 + 2) && (class101.field1572[var22] + 2) > (var9 - var11) && class101.field1577[var22] + class101.field1568[var22] > var10 - var12 && var10 + var12 > class101.field1568[var22] + -class101.field1577[var22] && class101.field1572[var22] - class101.field1576[var22] < var9) {
                        var13 = true;
                        var9 = class101.field1572[var22] - class101.field1576[var22];
                    }
                }
            }
            class199.field3121 = class101.field1568[var8];
            class179.field2789 = class101.field1572[var8] = var9;
            String var14 = class101.field1579[var8];
            if (class152.field2256 == 0) {
                int var15 = 16776960;
                if (class101.field1571[var8] < 6) {
                    var15 = class271.field4308[class101.field1571[var8]];
                }
                if (class101.field1571[var8] == 6) {
                    var15 = class64.field900 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class101.field1571[var8] == 7) {
                    var15 = (class64.field900 % 20) < 10 ? 255 : 65535;
                }
                if (class101.field1571[var8] == 8) {
                    var15 = (class64.field900 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class101.field1571[var8] == 9) {
                    int var16 = 150 - class101.field1569[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class101.field1571[var8] == 10) {
                    int var17 = 150 - class101.field1569[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16384000 + 16711935 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = (var17 - 100) * 327680 + 500 + 255 - var17 * 5;
                    }
                }
                if (class101.field1571[var8] == 11) {
                    int var18 = 150 - class101.field1569[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = ((var18 - 50) * 327685) + 65280;
                    } else if (var18 < 150) {
                        var15 = 32768000 - (var18 * 327680 - 16777215);
                    }
                }
                if (class101.field1575[var8] == 0) {
                    class232.field3734.method1315(var14, class199.field3121 + arg5, class179.field2789 + arg6, var15, 0);
                }
                if (class101.field1575[var8] == 1) {
                    class232.field3734.method1310(var14, arg5 + class199.field3121, class179.field2789 + arg6, var15, 0, class64.field900);
                }
                if (class101.field1575[var8] == 2) {
                    class232.field3734.method1313(var14, arg5 + class199.field3121, class179.field2789 + arg6, var15, 0, class64.field900);
                }
                if (class101.field1575[var8] == 3) {
                    class232.field3734.method1318(var14, class199.field3121 + arg5, class179.field2789 + arg6, var15, 0, class64.field900, 150 - class101.field1569[var8]);
                }
                if (class101.field1575[var8] == 4) {
                    int var19 = (150 - class101.field1569[var8]) * (class232.field3734.method1309(var14) + 100) / 150;
                    class127.method866(class199.field3121 + arg5 - 50, arg6, arg5 + class199.field3121 + 50, arg3 + arg6);
                    class232.field3734.method1325(var14, class199.field3121 + arg5 - (-50 - -var19), arg6 - -class179.field2789, var15, 0);
                    class127.method861(arg5, arg6, arg1 + arg5, arg3 + arg6);
                }
                if (class101.field1575[var8] == 5) {
                    int var20 = 150 - class101.field1569[var8];
                    int var21 = 0;
                    class127.method866(arg5, class179.field2789 + arg6 - class232.field3734.field2956 - 1, arg1 + arg5, class179.field2789 + arg6 + 5);
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class232.field3734.method1315(var14, class199.field3121 + arg5, arg6 - -var21 + class179.field2789, var15, 0);
                    class127.method861(arg5, arg6, arg1 + arg5, arg3 + arg6);
                }
            } else {
                class232.field3734.method1315(var14, class199.field3121 + arg5, class179.field2789 + arg6, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII)I")
    public static final int method1220(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field2720 = -9;
        }
        field2713++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FBED4F) >> 19;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)I")
    public static final int method1221(int arg0, int arg1) {
        int var2 = -54 / ((arg0 - 35) / 54);
        field2719++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V")
    public static void method1222(boolean arg0) {
        field2714 = null;
        if (arg0) {
            field2723 = -97;
        }
        field2711 = null;
        field2712 = null;
        field2724 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class173() {
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class173(String arg0, int arg1) {
        this.field2722 = arg0;
    }
}
