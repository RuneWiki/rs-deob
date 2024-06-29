import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class128 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ldj;")
    public static class44 field2278 = class89.method650(255, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Ldj;")
    public static class44 field2275 = class89.method650(255, "Die Verbindung konnte");

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[[[I")
    public static int[][][] field2279 = new int[4][13][13];

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "[I")
    public static int[] field2277 = new int[100];

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[Lfj;")
    public static class66[] field2276 = new class66[2048];

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Ldj;")
    public static class44 field2280 = class89.method650(255, "::fpson");

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "J")
    public static long field2284;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method876(byte arg0) {
        field2277 = null;
        field2280 = null;
        field2276 = null;
        if (arg0 > 74) {
            field2279 = null;
            field2275 = null;
            field2278 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
    public static final boolean method877(int arg0, int arg1) {
        field2282++;
        if (arg1 != 8672) {
            method877(8, 86);
        }
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILvc;II)V")
    public static final void method878(int arg0, class223 arg1, int arg2, int arg3) {
        if (arg1.field4160 == 1) {
            class194.field3409++;
            class116.method815(0L, arg1.field4035, (short) 50, 0, (byte) -115, class94.field1752, arg1.field4040);
        }
        field2281++;
        if (arg1.field4160 == 2 && !class202.field3614) {
            class44 var4 = class70.method551((byte) -69, arg1);
            if (var4 != null) {
                class116.method815(0L, var4, (short) 33, -1, (byte) -115, class70.method555(new class44[] { class181.field3141, arg1.field4058 }, -3), arg1.field4040);
                class66.field1221++;
            }
        }
        if (arg1.field4160 == 3) {
            class116.method815(0L, class115.field2040, (short) 1, 0, (byte) -115, class94.field1752, arg1.field4040);
            class44.field798++;
        }
        if (arg1.field4160 == 4) {
            class220.field3986++;
            class116.method815(0L, arg1.field4035, (short) 34, 0, (byte) -115, class94.field1752, arg1.field4040);
        }
        if (arg1.field4160 == 5) {
            class169.field2921++;
            class116.method815(0L, arg1.field4035, (short) 57, 0, (byte) -115, class94.field1752, arg1.field4040);
        }
        if (arg2 != 28236) {
            return;
        }
        if (arg1.field4160 == 6 && class10.field215 == null) {
            class58.field1084++;
            class116.method815(0L, arg1.field4035, (short) 24, -1, (byte) -115, class94.field1752, arg1.field4040);
        }
        if (arg1.field4076 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field4158; var6++) {
                for (int var7 = 0; var7 < arg1.field4136; var7++) {
                    int var8 = (arg1.field4145 + 32) * var7;
                    int var9 = (arg1.field4108 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field4153[var5];
                        var8 += arg1.field4111[var5];
                    }
                    if (var8 <= arg3 && var9 <= arg0 && var8 + 32 > arg3 && arg0 < var9 + 32) {
                        class38.field674 = arg1;
                        class31.field545 = var5;
                        if (arg1.field4166[var5] > 0) {
                            class214 var10 = class192.method1227(-31700, arg1.field4166[var5] - 1);
                            if (class39.field719 == 1 && class55.method397(class117.method821(arg1, 21064), false)) {
                                if (class172.field2998 != arg1.field4040 || class129.field2300 != var5) {
                                    class172.field2991++;
                                    class116.method815((long) var10.field3881, class187.field3232, (short) 25, var5, (byte) -115, class70.method555(new class44[] { class146.field2579, class94.field1739, var10.field3837 }, -3), arg1.field4040);
                                }
                            } else if (!class202.field3614 || !class55.method397(class117.method821(arg1, arg2 - 7172), false)) {
                                class133.field2382++;
                                class44[] var11 = var10.field3844;
                                if (class129.field2309) {
                                    var11 = class24.method172(var11, 5);
                                }
                                if (class55.method397(class117.method821(arg1, 21064), false)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class44.field796++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 41;
                                            } else {
                                                var13 = 49;
                                            }
                                            class116.method815((long) var10.field3881, var11[var12], var13, var5, (byte) -115, class70.method555(new class44[] { class78.field1499, var10.field3837 }, -3), arg1.field4040);
                                        } else if (var12 == 4) {
                                            class40.field755++;
                                            class116.method815((long) var10.field3881, class119.field2115, (short) 49, var5, (byte) -115, class70.method555(new class44[] { class78.field1499, var10.field3837 }, -3), arg1.field4040);
                                        }
                                    }
                                }
                                if (class53.method381(class117.method821(arg1, 21064), (byte) -81)) {
                                    class116.method815((long) var10.field3881, class187.field3232, (short) 12, var5, (byte) -115, class70.method555(new class44[] { class78.field1499, var10.field3837 }, -3), arg1.field4040);
                                    class197.field3486++;
                                }
                                if (class55.method397(class117.method821(arg1, 21064), false) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class14.field265++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 42;
                                            }
                                            if (var14 == 1) {
                                                var15 = 40;
                                            }
                                            if (var14 == 2) {
                                                var15 = 15;
                                            }
                                            class116.method815((long) var10.field3881, var11[var14], var15, var5, (byte) -115, class70.method555(new class44[] { class78.field1499, var10.field3837 }, arg2 ^ 0xFFFF91B1), arg1.field4040);
                                        }
                                    }
                                }
                                class44[] var16 = arg1.field4061;
                                if (class129.field2309) {
                                    var16 = class24.method172(var16, arg2 ^ 0x6E49);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class20.field350++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 6;
                                            }
                                            if (var17 == 1) {
                                                var18 = 21;
                                            }
                                            if (var17 == 2) {
                                                var18 = 35;
                                            }
                                            if (var17 == 3) {
                                                var18 = 47;
                                            }
                                            if (var17 == 4) {
                                                var18 = 8;
                                            }
                                            class116.method815((long) var10.field3881, var16[var17], var18, var5, (byte) -115, class70.method555(new class44[] { class78.field1499, var10.field3837 }, arg2 ^ 0xFFFF91B1), arg1.field4040);
                                        }
                                    }
                                }
                                class116.method815((long) var10.field3881, class41.field776, (short) 1001, var5, (byte) -115, class70.method555(new class44[] { class78.field1499, var10.field3837 }, -3), arg1.field4040);
                            } else if ((class4.field51 & 0x10) == 16) {
                                class27.field479++;
                                class116.method815((long) var10.field3881, class114.field2028, (short) 39, var5, (byte) -115, class70.method555(new class44[] { class201.field3567, class94.field1739, var10.field3837 }, -3), arg1.field4040);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field4118) {
            return;
        }
        if (!class202.field3614) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class44 var23 = class89.method652(var19, 0, arg1);
                if (var23 != null) {
                    class123.field2182++;
                    class116.method815((long) (var19 + 1), var23, (short) 1004, arg1.field4085, (byte) -115, arg1.field4127, arg1.field4040);
                }
            }
            class44 var20 = class70.method551((byte) -73, arg1);
            if (var20 != null) {
                class116.method815(0L, var20, (short) 33, arg1.field4085, (byte) -115, arg1.field4127, arg1.field4040);
                class66.field1221++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class44 var22 = class89.method652(var21, 0, arg1);
                if (var22 != null) {
                    class116.method815((long) (var21 + 1), var22, (short) 32, arg1.field4085, (byte) -115, arg1.field4127, arg1.field4040);
                    class123.field2182++;
                }
            }
            if (class162.method1048(class117.method821(arg1, 21064), 1)) {
                class58.field1084++;
                class116.method815(0L, class48.field898, (short) 24, arg1.field4085, (byte) -115, class94.field1752, arg1.field4040);
                return;
            }
            return;
        }
        if (class200.method1290(class117.method821(arg1, 21064), 104) && (class4.field51 & 0x20) == 32) {
            class131.field2343++;
            class116.method815(0L, class114.field2028, (short) 46, arg1.field4085, (byte) -115, class70.method555(new class44[] { class201.field3567, class194.field3397, arg1.field4127 }, -3), arg1.field4040);
            return;
        }
    }
}
