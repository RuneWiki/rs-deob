import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class137 extends class114 {

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "[[I")
    public static int[][] field2443 = new int[104][104];

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lia;")
    private static class257 field2442 = class28.method234(-80, "Drop");

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Lia;")
    private static class257 field2449 = class28.method234(127, "Discard");

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "Lia;")
    public static class257 field2453 = class28.method234(112, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "Lia;")
    public static class257 field2444 = field2442;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Lia;")
    public static class257 field2446 = field2449;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Lsc;")
    public static class56 field2448 = new class56(512);

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "[Z")
    public static boolean[] field2456 = new boolean[100];

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field2458 = 0;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "B")
    public byte field2450;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "Lmb;")
    public static class178 field2452;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Lib;")
    public static class180 field2441;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Lvb;")
    public class226 field2451;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "[I")
    public static int[] field2457;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "[[B")
    public static byte[][] field2454;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public static final void method943(int arg0) {
        field2445++;
        if (!class216.field3663) {
            class19.field397[0] = class89.field1710;
            class32.field616[0] = 1001;
            class92.field1757[0] = class17.field378;
            class199.field3407 = 1;
        }
        if (class5.field114 != -1) {
            class104.method754(class5.field114, -1);
        }
        for (int var1 = 0; var1 < class44.field1030; var1++) {
            if (field2456[var1]) {
                class75.field1464[var1] = true;
            }
            class157.field2747[var1] = field2456[var1];
            field2456[var1] = false;
        }
        class197.field3332 = -1;
        class108.field2013 = class7.field153;
        class241.field4189 = null;
        class41.field840 = -1;
        if (class5.field114 != -1) {
            class44.field1030 = 0;
            class114.method818(0, class5.field114, class12.field241, -1, 0, -75, class166.field2897, 0, 0);
        }
        if (arg0 != 16) {
            return;
        }
        class23.method186();
        class71.method537(11915);
        if (class216.field3663) {
            class75.method551(true);
        } else if (class197.field3332 != -1) {
            class14.method136(class197.field3332, 2, class41.field840);
        }
        if (class156.field2738 == 3) {
            for (int var2 = 0; var2 < class44.field1030; var2++) {
                if (class157.field2747[var2]) {
                    class23.method196(client.field1519[var2], class11.field215[var2], class13.field242[var2], class197.field3327[var2], 16711935, 128);
                } else if (class75.field1464[var2]) {
                    class23.method196(client.field1519[var2], class11.field215[var2], class13.field242[var2], class197.field3327[var2], 16711680, 128);
                }
            }
        }
        class5.method101(64, class171.field2935, field2441.field4177, class189.field3261, field2441.field4143);
        class171.field2935 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public static void method944(int arg0) {
        field2446 = null;
        field2442 = null;
        field2457 = null;
        field2444 = null;
        field2443 = null;
        field2449 = null;
        field2452 = null;
        field2456 = null;
        field2441 = null;
        field2453 = null;
        field2448 = null;
        field2454 = null;
        if (arg0 != -4948) {
            method944(68);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method945(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class126.field2266++;
        class108.field2020 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class104.field1944; var12 < class236.field4045; var12++) {
            class177[][] var38 = class75.field1463[var12];
            for (int var39 = class62.field1273; var39 < class143.field2507; var39++) {
                for (int var40 = class44.field973; var40 < class58.field1225; var40++) {
                    class177 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (var41.field3015 <= class189.field3257 && class14.field315[var39 + class11.field212 - class207.field3546][var40 + class11.field212 - class228.field3836] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3013 = true;
                            var41.field3020 = true;
                            if (var41.field3012 > 0) {
                                var41.field3018 = true;
                            } else {
                                var41.field3018 = false;
                            }
                            class108.field2020++;
                        } else {
                            var41.field3013 = false;
                            var41.field3020 = false;
                            var41.field3023 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3024 != null) {
                                    class8 var42 = var41.field3024;
                                    var42.field172.method468(var42.field165, var42.field165, var42.field176, var42.field176, false);
                                    if (var42.field169 != null) {
                                        var42.field169.method468(var42.field165, var42.field165, var42.field176, var42.field176, false);
                                    }
                                }
                                if (var41.field3022 != null) {
                                    class7 var43 = var41.field3022;
                                    var43.field147.method468(var43.field159, var43.field159, var43.field157, var43.field157, false);
                                    if (var43.field156 != null) {
                                        var43.field156.method468(var43.field159, var43.field159, var43.field157, var43.field157, false);
                                    }
                                }
                                if (var41.field3016 != null) {
                                    class115 var44 = var41.field3016;
                                    var44.field2075.method468(var44.field2071, var44.field2071, var44.field2076, var44.field2076, false);
                                }
                                if (var41.field3017 != null) {
                                    for (int var45 = 0; var45 < var41.field3012; var45++) {
                                        class154 var46 = var41.field3017[var45];
                                        var46.field2698.method468(var46.field2688, var46.field2700, var46.field2693, var46.field2695, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class243.field4208 == class152.field2673;
        for (int var14 = class104.field1944; var14 < class236.field4045; var14++) {
            class177[][] var27 = class75.field1463[var14];
            for (int var28 = -class11.field212; var28 <= 0; var28++) {
                int var29 = class207.field3546 + var28;
                int var30 = class207.field3546 - var28;
                if (var29 >= class62.field1273 || var30 < class143.field2507) {
                    for (int var31 = -class11.field212; var31 <= 0; var31++) {
                        int var32 = class228.field3836 + var31;
                        int var33 = class228.field3836 - var31;
                        if (var29 >= class62.field1273) {
                            if (var32 >= class44.field973) {
                                class177 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3013) {
                                    class216.method1436(var34, true);
                                }
                            }
                            if (var33 < class58.field1225) {
                                class177 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3013) {
                                    class216.method1436(var35, true);
                                }
                            }
                        }
                        if (var30 < class143.field2507) {
                            if (var32 >= class44.field973) {
                                class177 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3013) {
                                    class216.method1436(var36, true);
                                }
                            }
                            if (var33 < class58.field1225) {
                                class177 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3013) {
                                    class216.method1436(var37, true);
                                }
                            }
                        }
                        if (class108.field2020 == 0) {
                            if (!var13) {
                                class157.field2751 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class104.field1944; var15 < class236.field4045; var15++) {
            class177[][] var16 = class75.field1463[var15];
            for (int var17 = -class11.field212; var17 <= 0; var17++) {
                int var18 = class207.field3546 + var17;
                int var19 = class207.field3546 - var17;
                if (var18 >= class62.field1273 || var19 < class143.field2507) {
                    for (int var20 = -class11.field212; var20 <= 0; var20++) {
                        int var21 = class228.field3836 + var20;
                        int var22 = class228.field3836 - var20;
                        if (var18 >= class62.field1273) {
                            if (var21 >= class44.field973) {
                                class177 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3013) {
                                    class216.method1436(var23, false);
                                }
                            }
                            if (var22 < class58.field1225) {
                                class177 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3013) {
                                    class216.method1436(var24, false);
                                }
                            }
                        }
                        if (var19 < class143.field2507) {
                            if (var21 >= class44.field973) {
                                class177 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3013) {
                                    class216.method1436(var25, false);
                                }
                            }
                            if (var22 < class58.field1225) {
                                class177 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3013) {
                                    class216.method1436(var26, false);
                                }
                            }
                        }
                        if (class108.field2020 == 0) {
                            if (!var13) {
                                class157.field2751 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class157.field2751 = false;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)I")
    public static final int method946(int arg0, byte arg1) {
        int var2 = 54 / ((51 - arg1) / 55);
        field2455++;
        return arg0 >> 11 & 0x3F;
    }
}
