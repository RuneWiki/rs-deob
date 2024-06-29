import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class129 extends class30 {

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Lia;")
    public class257 field2311;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[Lia;")
    public static class257[] field2303 = new class257[100];

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Lia;")
    public static class257 field2309 = class28.method234(99, "settings");

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Lia;")
    private static class257 field2308 = class28.method234(-99, "Take");

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lia;")
    public static class257 field2306 = field2308;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lie;")
    public static class117 field2302 = new class117(64);

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static void method897(int arg0) {
        field2302 = null;
        field2309 = null;
        field2308 = null;
        field2306 = null;
        field2303 = null;
        if (arg0 != 0) {
            field2310 = 121;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)I")
    public static final int method898(int arg0, boolean arg1) {
        field2305++;
        long var2 = class80.method600(-117);
        class37 var4 = arg1 ? (class37) class75.field1453.method427((byte) 58) : (class37) class75.field1453.method428(false);
        if (arg0 < 43) {
            field2309 = null;
        }
        while (var4 != null) {
            if ((var4.field731 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field731 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field573;
                    class117.field2100[var5] = class58.field1233[var5];
                    var4.method254(1);
                    return var5;
                }
                var4.method254(1);
            }
            var4 = (class37) class75.field1453.method428(false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBII)V")
    public static final void method899(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2307++;
        if (class81.field1570 == 1) {
            class255.field4364[class112.field2045 / 100].method486(class123.field2210 - 8, class180.field3123 + -8);
        }
        if (class81.field1570 == 2) {
            class255.field4364[class112.field2045 / 100 + 4].method486(class123.field2210 - 8, class180.field3123 + -8);
        }
        class224.method1469((byte) -38);
        if (arg2 > -99) {
            method901(120, (class44) null, (byte) -45, -82);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)J")
    public static final long method900(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        return var3 == null || var3.field3016 == null ? 0L : var3.field3016.field2079;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILme;BI)V")
    public static final void method901(int arg0, class44 arg1, byte arg2, int arg3) {
        field2313++;
        if (arg1.field1013 == 1) {
            class136.field2433++;
            class95.method694(class17.field378, arg1.field1005, 0, 27360, arg1.field935, (short) 9, 0L);
        }
        if (arg1.field1013 == 2 && !class257.field4404) {
            class257 var4 = class69.method525(arg2 ^ 0x27B3, arg1);
            if (var4 != null) {
                class95.method694(class233.method1528(new class257[] { class238.field4090, arg1.field894 }, 0), var4, -1, 27360, arg1.field935, (short) 15, 0L);
                class200.field3434++;
            }
        }
        if (arg1.field1013 == 3) {
            class95.method694(class17.field378, class125.field2243, 0, arg2 + 27479, arg1.field935, (short) 11, 0L);
            class175.field2988++;
        }
        if (arg1.field1013 == 4) {
            class165.field2887++;
            class95.method694(class17.field378, arg1.field1005, 0, 27360, arg1.field935, (short) 50, 0L);
        }
        if (arg2 != -119) {
            field2302 = null;
        }
        if (arg1.field1013 == 5) {
            class95.method694(class17.field378, arg1.field1005, 0, 27360, arg1.field935, (short) 46, 0L);
            class8.field164++;
        }
        if (arg1.field1013 == 6 && class73.field1421 == null) {
            class207.field3548++;
            class95.method694(class17.field378, arg1.field1005, -1, 27360, arg1.field935, (short) 19, 0L);
        }
        if (arg1.field871 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field912; var6++) {
                for (int var7 = 0; var7 < arg1.field1019; var7++) {
                    int var8 = (arg1.field927 + 32) * var7;
                    int var9 = (arg1.field967 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field954[var5];
                        var8 += arg1.field896[var5];
                    }
                    if (arg3 >= var8 && arg0 >= var9 && arg3 < var8 + 32 && var9 + 32 > arg0) {
                        class241.field4189 = arg1;
                        class94.field1775 = var5;
                        if (arg1.field929[var5] > 0) {
                            class14 var10 = class156.method1090(arg1.field929[var5] - 1, 0);
                            if (class31.field611 == 1 && class178.method1195(client.method590(arg1), arg2 + 120)) {
                                if (class119.field2152 != arg1.field935 || class3.field91 != var5) {
                                    class20.field422++;
                                    class95.method694(class233.method1528(new class257[] { class181.field3142, class150.field2589, var10.field295 }, 0), class200.field3414, var5, arg2 + 27479, arg1.field935, (short) 25, (long) var10.field282);
                                }
                            } else if (!class257.field4404 || !class178.method1195(client.method590(arg1), 1)) {
                                class225.field3778++;
                                class257[] var11 = var10.field317;
                                if (class41.field839) {
                                    var11 = class144.method977(29212, var11);
                                }
                                if (class178.method1195(client.method590(arg1), 1)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 42;
                                            } else {
                                                var13 = 17;
                                            }
                                            class95.method694(class233.method1528(new class257[] { class126.field2251, var10.field295 }, arg2 + 119), var11[var12], var5, 27360, arg1.field935, var13, (long) var10.field282);
                                            class74.field1432++;
                                        } else if (var12 == 4) {
                                            class40.field797++;
                                            class95.method694(class233.method1528(new class257[] { class126.field2251, var10.field295 }, 0), class137.field2444, var5, arg2 + 27479, arg1.field935, (short) 17, (long) var10.field282);
                                        }
                                    }
                                }
                                if (class156.method1092(client.method590(arg1), -1)) {
                                    class92.field1749++;
                                    class95.method694(class233.method1528(new class257[] { class126.field2251, var10.field295 }, 0), class200.field3414, var5, 27360, arg1.field935, (short) 32, (long) var10.field282);
                                }
                                if (class178.method1195(client.method590(arg1), arg2 ^ 0xFFFFFF88) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class126.field2262++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 41;
                                            }
                                            if (var14 == 1) {
                                                var15 = 29;
                                            }
                                            if (var14 == 2) {
                                                var15 = 13;
                                            }
                                            class95.method694(class233.method1528(new class257[] { class126.field2251, var10.field295 }, arg2 ^ 0xFFFFFF89), var11[var14], var5, 27360, arg1.field935, var15, (long) var10.field282);
                                        }
                                    }
                                }
                                class257[] var16 = arg1.field936;
                                if (class41.field839) {
                                    var16 = class144.method977(arg2 ^ 0xFFFF8D95, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class149.field2575++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 38;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 23;
                                            }
                                            if (var17 == 3) {
                                                var18 = 57;
                                            }
                                            if (var17 == 4) {
                                                var18 = 36;
                                            }
                                            class95.method694(class233.method1528(new class257[] { class126.field2251, var10.field295 }, 0), var16[var17], var5, arg2 + 27479, arg1.field935, var18, (long) var10.field282);
                                        }
                                    }
                                }
                                class95.method694(class233.method1528(new class257[] { class126.field2251, var10.field295 }, 0), class92.field1753, var5, 27360, arg1.field935, (short) 1003, (long) var10.field282);
                            } else if ((class76.field1491 & 0x10) == 16) {
                                class260.field4511++;
                                class95.method694(class233.method1528(new class257[] { class72.field1405, class150.field2589, var10.field295 }, 0), class181.field3143, var5, 27360, arg1.field935, (short) 24, (long) var10.field282);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field990) {
            return;
        }
        if (!class257.field4404) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class257 var23 = class229.method1491(arg1, var19, 118);
                if (var23 != null) {
                    class114.field2058++;
                    class95.method694(arg1.field923, var23, arg1.field890, 27360, arg1.field935, (short) 1005, (long) (var19 + 1));
                }
            }
            class257 var20 = class69.method525(-10182, arg1);
            if (var20 != null) {
                class200.field3434++;
                class95.method694(arg1.field923, var20, arg1.field890, 27360, arg1.field935, (short) 15, 0L);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class257 var22 = class229.method1491(arg1, var21, arg2 ^ 0x10);
                if (var22 != null) {
                    class114.field2058++;
                    class95.method694(arg1.field923, var22, arg1.field890, 27360, arg1.field935, (short) 35, (long) (var21 + 1));
                }
            }
            if (!class111.method810(10, client.method590(arg1))) {
                return;
            }
            class95.method694(class17.field378, class197.field3321, arg1.field890, 27360, arg1.field935, (short) 19, 0L);
            class207.field3548++;
        } else if (class24.method211(client.method590(arg1), (byte) 8) && (class76.field1491 & 0x20) == 32) {
            class193.field3285++;
            class95.method694(class233.method1528(new class257[] { class72.field1405, class8.field166, arg1.field923 }, 0), class181.field3143, arg1.field890, 27360, arg1.field935, (short) 34, 0L);
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class129() {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lia;)V")
    public class129(class257 arg0) {
        this.field2311 = arg0;
    }
}
