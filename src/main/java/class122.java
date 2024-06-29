import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class122 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Led;")
    public static class43 field2438 = class191.method1219("nicht hergestellt werden)3", false);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Z")
    public static boolean field2439 = false;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field2441 = new Object();

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[Z")
    public static boolean[] field2449 = new boolean[8];

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Led;")
    private static class43 field2450 = class191.method1219("Loaded interfaces", false);

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Led;")
    public static class43 field2448 = field2450;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lga;")
    public static class58 field2445;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[I")
    public static int[] field2451;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method796(boolean arg0) {
        field2444++;
        if (arg0) {
            class58.field1131.method1108((byte) -90);
            class114.field2193.method1108((byte) -90);
            class186.field3655.method1108((byte) -90);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method797(int arg0) {
        field2449 = null;
        field2448 = null;
        field2445 = null;
        field2438 = null;
        field2441 = null;
        if (arg0 != 1006) {
            method799(null, -25, -119, (byte) -83);
        }
        field2451 = null;
        field2450 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
    public static final void method798(int arg0, byte arg1, int arg2) {
        if (arg1 != 15) {
            return;
        }
        field2443++;
        class118 var3 = class46.field922[class93.field1839][arg2][arg0];
        if (var3 == null) {
            class137.field2842.method1150(class93.field1839, arg2, arg0);
            return;
        }
        class207 var4 = null;
        class207 var5 = (class207) var3.method753(-26703);
        int var6 = -99999999;
        while (var5 != null) {
            class46 var11 = class2.method18(var5.field4040, 0);
            int var12 = var11.field904;
            if (var11.field924 == 1) {
                var12 = (var5.field4046 + 1) * var12;
            }
            if (var6 < var12) {
                var4 = var5;
                var6 = var12;
            }
            var5 = (class207) var3.method755((byte) 117);
        }
        if (var4 == null) {
            class137.field2842.method1150(class93.field1839, arg2, arg0);
            return;
        }
        var3.method752(var4, 22);
        class207 var7 = (class207) var3.method753(-26703);
        class207 var8 = null;
        int var9 = (arg0 << 7) + arg2 + 1610612736;
        class207 var10 = null;
        while (var7 != null) {
            if (var4.field4040 != var7.field4040) {
                if (var10 == null) {
                    var10 = var7;
                }
                if (var7.field4040 != var10.field4040 && var8 == null) {
                    var8 = var7;
                }
            }
            var7 = (class207) var3.method755((byte) 123);
        }
        class137.field2842.method1119(class93.field1839, arg2, arg0, class108.method668(arg0 * 128 + 64, arg2 * 128 + 64, arg1 ^ 0xFFFFFF8F, class93.field1839), var4, var9, var10, var8);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lob;IIB)V")
    public static final void method799(class129 arg0, int arg1, int arg2, byte arg3) {
        if (arg0.field2599 == 1) {
            class46.field887++;
            class149.method926(class110.field2127, arg0.field2683, 34, 0, 51, 0, arg0.field2664);
        }
        if (arg0.field2599 == 2 && !class174.field3464) {
            class43 var4 = class102.method631((byte) 10, arg0);
            if (var4 != null) {
                class149.method926(class167.method1036(new class43[] { class172.field3431, arg0.field2584 }, true), var4, 69, -1, 5, 0, arg0.field2664);
                class41.field805++;
            }
        }
        if (arg0.field2599 == 3) {
            class172.field3439++;
            class149.method926(class110.field2127, class47.field959, 28, 0, 9, 0, arg0.field2664);
        }
        if (arg0.field2599 == 4) {
            class149.method926(class110.field2127, arg0.field2683, -8, 0, 39, 0, arg0.field2664);
            class119.field2362++;
        }
        field2446++;
        if (arg0.field2599 == 5) {
            class80.field1589++;
            class149.method926(class110.field2127, arg0.field2683, -119, 0, 15, 0, arg0.field2664);
        }
        if (arg0.field2599 == 6 && class107.field2052 == null) {
            class153.field3098++;
            class149.method926(class110.field2127, arg0.field2683, 17, -1, 10, 0, arg0.field2664);
        }
        if (arg0.field2690 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2662; var6++) {
                for (int var7 = 0; var7 < arg0.field2656; var7++) {
                    int var8 = (arg0.field2648 + 32) * var7;
                    int var9 = (arg0.field2639 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field2705[var5];
                        var8 += arg0.field2689[var5];
                    }
                    if (var8 <= arg1 && var9 <= arg2 && arg1 < var8 + 32 && var9 + 32 > arg2) {
                        class16.field251 = var5;
                        class167.field3323 = arg0;
                        if (arg0.field2597[var5] > 0) {
                            class46 var10 = class2.method18(arg0.field2597[var5] - 1, 0);
                            if (class161.field3259 == 1 && class193.method1220((byte) -79, class193.method1231((byte) -83, arg0))) {
                                if (class19.field323 != arg0.field2664 || class74.field1462 != var5) {
                                    class138.field2860++;
                                    class149.method926(class167.method1036(new class43[] { class193.field3740, class68.field1369, var10.field905 }, true), class200.field3930, -127, var5, 31, var10.field938, arg0.field2664);
                                }
                            } else if (!class174.field3464 || !class193.method1220((byte) -79, class193.method1231((byte) 125, arg0))) {
                                class43[] var11 = var10.field912;
                                class124.field2468++;
                                if (class54.field1092) {
                                    var11 = class124.method803(var11, 5);
                                }
                                if (class193.method1220((byte) -79, class193.method1231((byte) 122, arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class107.field2045++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 44;
                                            } else {
                                                var13 = 25;
                                            }
                                            class149.method926(class167.method1036(new class43[] { class50.field1002, var10.field905 }, true), var11[var12], -117, var5, var13, var10.field938, arg0.field2664);
                                        } else if (var12 == 4) {
                                            class149.method926(class167.method1036(new class43[] { class50.field1002, var10.field905 }, true), class119.field2379, -125, var5, 25, var10.field938, arg0.field2664);
                                            class55.field1104++;
                                        }
                                    }
                                }
                                if (class101.method625(56, class193.method1231((byte) 125, arg0))) {
                                    class149.method926(class167.method1036(new class43[] { class50.field1002, var10.field905 }, true), class200.field3930, -124, var5, 23, var10.field938, arg0.field2664);
                                    class187.field3675++;
                                }
                                if (class193.method1220((byte) -79, class193.method1231((byte) -99, arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class32.field605++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 2;
                                            }
                                            if (var14 == 1) {
                                                var15 = 8;
                                            }
                                            if (var14 == 2) {
                                                var15 = 35;
                                            }
                                            class149.method926(class167.method1036(new class43[] { class50.field1002, var10.field905 }, true), var11[var14], -128, var5, var15, var10.field938, arg0.field2664);
                                        }
                                    }
                                }
                                class43[] var16 = arg0.field2603;
                                if (class54.field1092) {
                                    var16 = class124.method803(var16, 5);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class126.field2500++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 37;
                                            }
                                            if (var17 == 1) {
                                                var18 = 21;
                                            }
                                            if (var17 == 2) {
                                                var18 = 22;
                                            }
                                            if (var17 == 3) {
                                                var18 = 47;
                                            }
                                            if (var17 == 4) {
                                                var18 = 16;
                                            }
                                            class149.method926(class167.method1036(new class43[] { class50.field1002, var10.field905 }, true), var16[var17], -127, var5, var18, var10.field938, arg0.field2664);
                                        }
                                    }
                                }
                                class149.method926(class167.method1036(new class43[] { class50.field1002, var10.field905 }, true), class124.field2455, 36, var5, 1006, var10.field938, arg0.field2664);
                            } else if ((class27.field486 & 0x10) == 16) {
                                class149.method926(class167.method1036(new class43[] { class29.field534, class68.field1369, var10.field905 }, true), class137.field2852, -120, var5, 48, var10.field938, arg0.field2664);
                                class187.field3671++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg0.field2707) {
            if (!class174.field3464) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class43 var23 = class99.method616((byte) 85, var19, arg0);
                    if (var23 != null) {
                        class149.method926(arg0.field2587, var23, -122, arg0.field2661, 1004, var19 + 1, arg0.field2664);
                        class22.field384++;
                    }
                }
                class43 var20 = class102.method631((byte) 10, arg0);
                if (var20 != null) {
                    class149.method926(arg0.field2587, var20, 13, arg0.field2661, 5, 0, arg0.field2664);
                    class41.field805++;
                }
                for (int var21 = 4; var21 >= 0; var21--) {
                    class43 var22 = class99.method616((byte) 85, var21, arg0);
                    if (var22 != null) {
                        class22.field384++;
                        class149.method926(arg0.field2587, var22, -128, arg0.field2661, 29, var21 + 1, arg0.field2664);
                    }
                }
                if (class193.method1223(class193.method1231((byte) 119, arg0), (byte) 59)) {
                    class149.method926(class110.field2127, class125.field2490, 115, arg0.field2661, 10, 0, arg0.field2664);
                    class153.field3098++;
                }
            } else if (class139.method894(9873, class193.method1231((byte) 121, arg0)) && (class27.field486 & 0x20) == 32) {
                class65.field1326++;
                class149.method926(class167.method1036(new class43[] { class29.field534, class101.field1934, arg0.field2587 }, true), class137.field2852, -123, arg0.field2661, 58, 0, arg0.field2664);
            }
        }
        if (arg3 > -98) {
            field2449 = null;
        }
    }
}
