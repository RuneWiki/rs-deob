import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class171 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2757 = "Loaded config";

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
    public static int[] field2758 = new int[200];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1193(String arg0, boolean arg1) {
        int var2 = arg0.length();
        field2764++;
        int var3 = 0;
        int var4 = 0;
        if (!arg1) {
            method1193((String) null, true);
        }
        while (var2 > var4) {
            var3 = (var3 << 5) + class117.method828(86, arg0.charAt(var4)) - var3;
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljj;Z)V")
    public static final void method1194(class134 arg0, boolean arg1) {
        if (arg1) {
            method1193((String) null, true);
        }
        class30.field367 = arg0;
        class166.field2715 = class30.field367.method948((byte) -97, 16);
        field2766++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1195(int arg0) {
        field2757 = null;
        field2758 = null;
        if (arg0 != -1803) {
            method1196(-3, -15, -71, 44, -16);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class8.field117 * arg0 + class236.field3777 * arg3 >> 16;
        int var6 = class8.field117 * arg3 - class236.field3777 * arg0 >> 16;
        int var7 = class296.field4680 * arg1 + class250.field4008 * var6 >> 16;
        int var8 = class250.field4008 * arg1 - class296.field4680 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class296.field4680 * arg2 + class250.field4008 * var6 >> 16;
        int var12 = class250.field4008 * arg2 - class296.field4680 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class246.field3953 && var13 < class246.field3953) {
            return false;
        } else if (var9 > class172.field2775 && var13 > class172.field2775) {
            return false;
        } else if (var10 < class237.field3781 && var14 < class237.field3781) {
            return false;
        } else {
            return var10 <= class41.field490 || var14 <= class41.field490;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1197(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class136.field2263++;
        class200.field3225 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class155.field2494; var12 < class269.field4361; var12++) {
            class99[][] var38 = class273.field4415[var12];
            for (int var39 = class136.field2265; var39 < class100.field1523; var39++) {
                for (int var40 = class222.field3532; var40 < class258.field4119; var40++) {
                    class99 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class259.field4124[var39 + class54.field771 - class177.field2861][var40 + class54.field771 - class21.field265] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1509 = true;
                            var41.field1490 = true;
                            if (var41.field1503 > 0) {
                                var41.field1504 = true;
                            } else {
                                var41.field1504 = false;
                            }
                            class200.field3225++;
                        } else {
                            var41.field1509 = false;
                            var41.field1490 = false;
                            var41.field1508 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1502 != null) {
                                    class233 var42 = var41.field1502;
                                    var42.field3709.method74(0, var12, var42.field3698, var42.field3712, var42.field3715);
                                    if (var42.field3716 != null) {
                                        var42.field3716.method74(0, var12, var42.field3698, var42.field3712, var42.field3715);
                                    }
                                }
                                if (var41.field1494 != null) {
                                    class195 var43 = var41.field1494;
                                    var43.field3149.method74(var43.field3156, var12, var43.field3154, var43.field3152, var43.field3148);
                                    if (var43.field3159 != null) {
                                        var43.field3159.method74(var43.field3156, var12, var43.field3154, var43.field3152, var43.field3148);
                                    }
                                }
                                if (var41.field1491 != null) {
                                    class16 var44 = var41.field1491;
                                    var44.field185.method74(0, var12, var44.field195, var44.field190, var44.field192);
                                }
                                if (var41.field1496 != null) {
                                    for (int var45 = 0; var45 < var41.field1503; var45++) {
                                        class138 var46 = var41.field1496[var45];
                                        var46.field2291.method74(var46.field2283, var12, var46.field2288, var46.field2274, var46.field2277);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class240.field3846 == class229.field3641;
        for (int var14 = class155.field2494; var14 < class269.field4361; var14++) {
            class99[][] var27 = class273.field4415[var14];
            for (int var28 = -class54.field771; var28 <= 0; var28++) {
                int var29 = class177.field2861 + var28;
                int var30 = class177.field2861 - var28;
                if (var29 >= class136.field2265 || var30 < class100.field1523) {
                    for (int var31 = -class54.field771; var31 <= 0; var31++) {
                        int var32 = class21.field265 + var31;
                        int var33 = class21.field265 - var31;
                        if (var29 >= class136.field2265) {
                            if (var32 >= class222.field3532) {
                                class99 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1509) {
                                    class228.method1514(var34, true);
                                }
                            }
                            if (var33 < class258.field4119) {
                                class99 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1509) {
                                    class228.method1514(var35, true);
                                }
                            }
                        }
                        if (var30 < class100.field1523) {
                            if (var32 >= class222.field3532) {
                                class99 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1509) {
                                    class228.method1514(var36, true);
                                }
                            }
                            if (var33 < class258.field4119) {
                                class99 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1509) {
                                    class228.method1514(var37, true);
                                }
                            }
                        }
                        if (class200.field3225 == 0) {
                            if (!var13) {
                                class267.field4341 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class155.field2494; var15 < class269.field4361; var15++) {
            class99[][] var16 = class273.field4415[var15];
            for (int var17 = -class54.field771; var17 <= 0; var17++) {
                int var18 = class177.field2861 + var17;
                int var19 = class177.field2861 - var17;
                if (var18 >= class136.field2265 || var19 < class100.field1523) {
                    for (int var20 = -class54.field771; var20 <= 0; var20++) {
                        int var21 = class21.field265 + var20;
                        int var22 = class21.field265 - var20;
                        if (var18 >= class136.field2265) {
                            if (var21 >= class222.field3532) {
                                class99 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1509) {
                                    class228.method1514(var23, false);
                                }
                            }
                            if (var22 < class258.field4119) {
                                class99 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1509) {
                                    class228.method1514(var24, false);
                                }
                            }
                        }
                        if (var19 < class100.field1523) {
                            if (var21 >= class222.field3532) {
                                class99 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1509) {
                                    class228.method1514(var25, false);
                                }
                            }
                            if (var22 < class258.field4119) {
                                class99 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1509) {
                                    class228.method1514(var26, false);
                                }
                            }
                        }
                        if (class200.field3225 == 0) {
                            if (!var13) {
                                class267.field4341 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class267.field4341 = false;
    }
}
