import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class49 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lh;")
    public static class65 field784 = null;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    public static int[] field783 = new int[100];

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[I")
    public static int[] field788 = new int[5];

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lkb;")
    private static class93 field791 = class76.method390("Loaded title screen", 0);

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field793 = 0;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lkb;")
    public static class93 field792 = field791;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "[I")
    public static int[] field794 = new int[32768];

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lme;")
    public static class114 field789;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method261(byte arg0) {
        field788 = null;
        field792 = null;
        field789 = null;
        field783 = null;
        field791 = null;
        field794 = null;
        field784 = null;
        if (arg0 <= 58) {
            method263(null, 49, -13, 21);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
    public static final void method262(boolean arg0, int arg1) {
        if (arg1 != -51) {
            return;
        }
        int var2 = class205.field3966;
        if (class106.field1940.field2032 >> 7 == class35.field574 && class106.field1940.field2045 >> 7 == class18.field297) {
            class35.field574 = 0;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class34 var4;
            int var5;
            if (arg0) {
                var4 = class106.field1940;
                var5 = 33538048;
            } else {
                var4 = class206.field4035[class144.field2818[var3]];
                var5 = class144.field2818[var3] << 14;
            }
            if (var4 != null && var4.method190((byte) -94)) {
                int var6 = var4.field2032 >> 7;
                int var7 = var4.field2045 >> 7;
                var4.field562 = false;
                if ((class82.field1515 && class205.field3966 > 50 || class205.field3966 > 200) && !arg0 && var4.field2054 == var4.field2015) {
                    var4.field562 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field540 == null || class21.field338 < var4.field555 || class21.field338 >= var4.field556) {
                        if ((var4.field2032 & 0x7F) == 64 && (var4.field2045 & 0x7F) == 64) {
                            if (class176.field3471[var6][var7] == field793) {
                                continue;
                            }
                            class176.field3471[var6][var7] = field793;
                        }
                        var4.field2028 = class189.method1226(var4.field2045, -1, var4.field2032, class114.field2145);
                        class175.field3458.method841(class114.field2145, var4.field2032, var4.field2045, var4.field2028, 60, var4, var4.field2075, var5, var4.field2055);
                    } else {
                        var4.field562 = false;
                        var4.field2028 = class189.method1226(var4.field2045, -1, var4.field2032, class114.field2145);
                        class175.field3458.method837(class114.field2145, var4.field2032, var4.field2045, var4.field2028, 60, var4, var4.field2075, var5, var4.field549, var4.field548, var4.field547, var4.field552);
                    }
                }
            }
        }
        field786++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lh;III)V")
    public static final void method263(class65 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field1164 == 1) {
            class137.method863(arg0.field1045, arg1 - 806855870, 58, 0, class43.field712, 0, arg0.field1058);
            class117.field2183++;
        }
        field785++;
        if (arg0.field1164 == 2 && !class103.field1905) {
            class93 var4 = class28.method156((byte) 121, arg0);
            if (var4 != null) {
                class143.field2789++;
                class137.method863(var4, 17001, 57, -1, class203.method1321(new class93[] { class57.field933, arg0.field1077 }, arg1 ^ -806872938), 0, arg0.field1058);
            }
        }
        if (arg0.field1164 == 3) {
            class36.field580++;
            class137.method863(class167.field3349, 17001, 12, 0, class43.field712, 0, arg0.field1058);
        }
        if (arg0.field1164 == 4) {
            class47.field738++;
            class137.method863(arg0.field1045, 17001, 30, 0, class43.field712, 0, arg0.field1058);
        }
        if (arg0.field1164 == 5) {
            class137.method863(arg0.field1045, 17001, 19, 0, class43.field712, 0, arg0.field1058);
            class197.field3838++;
        }
        if (arg0.field1164 == 6 && class82.field1511 == null) {
            class137.method863(arg0.field1045, 17001, 13, -1, class43.field712, 0, arg0.field1058);
            class100.field1846++;
        }
        if (arg1 != 806872871) {
            field792 = null;
        }
        if (arg0.field1076 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field1052; var6++) {
                for (int var7 = 0; var7 < arg0.field1044; var7++) {
                    int var8 = (arg0.field1169 + 32) * var7;
                    int var9 = (arg0.field1071 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field1165[var5];
                        var8 += arg0.field1145[var5];
                    }
                    if (arg2 >= var8 && var9 <= arg3 && arg2 < var8 + 32 && arg3 < var9 + 32) {
                        class62.field993 = var5;
                        class29.field472 = arg0;
                        if (arg0.field1146[var5] > 0) {
                            class166 var10 = class166.method1126(arg1 ^ 0x3017E745, arg0.field1146[var5] - 1);
                            if (class144.field2800 == 1 && class68.method362(class178.method1173(arg0, 124), (byte) -117)) {
                                if (class141.field2753 != arg0.field1058 || class148.field2852 != var5) {
                                    class137.method863(class154.field3029, 17001, 46, var5, class203.method1321(new class93[] { class108.field1957, class96.field1787, var10.field3281 }, 119), var10.field3299, arg0.field1058);
                                    class141.field2740++;
                                }
                            } else if (!class103.field1905 || !class68.method362(class178.method1173(arg0, 125), (byte) -117)) {
                                class112.field2021++;
                                class93[] var11 = var10.field3278;
                                if (class145.field2830) {
                                    var11 = class46.method242(var11, arg1 - 806894697);
                                }
                                if (class68.method362(class178.method1173(arg0, 124), (byte) -117)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class83.field1530++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 4;
                                            } else {
                                                var13 = 2;
                                            }
                                            class137.method863(var11[var12], arg1 - 806855870, var13, var5, class203.method1321(new class93[] { class64.field1026, var10.field3281 }, 122), var10.field3299, arg0.field1058);
                                        } else if (var12 == 4) {
                                            class136.field2636++;
                                            class137.method863(class91.field1675, 17001, 2, var5, class203.method1321(new class93[] { class64.field1026, var10.field3281 }, 101), var10.field3299, arg0.field1058);
                                        }
                                    }
                                }
                                if (class108.method589(arg1 ^ 0x3017E737, class178.method1173(arg0, 125))) {
                                    class137.method863(class154.field3029, 17001, 6, var5, class203.method1321(new class93[] { class64.field1026, var10.field3281 }, 102), var10.field3299, arg0.field1058);
                                    class95.field1770++;
                                }
                                if (class68.method362(class178.method1173(arg0, 126), (byte) -117) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 41;
                                            }
                                            if (var14 == 1) {
                                                var15 = 1;
                                            }
                                            if (var14 == 2) {
                                                var15 = 29;
                                            }
                                            class16.field277++;
                                            class137.method863(var11[var14], 17001, var15, var5, class203.method1321(new class93[] { class64.field1026, var10.field3281 }, 99), var10.field3299, arg0.field1058);
                                        }
                                    }
                                }
                                class93[] var16 = arg0.field1070;
                                if (class145.field2830) {
                                    var16 = class46.method242(var16, -21826);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class68.field1260++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 26;
                                            }
                                            if (var17 == 1) {
                                                var18 = 42;
                                            }
                                            if (var17 == 2) {
                                                var18 = 7;
                                            }
                                            if (var17 == 3) {
                                                var18 = 40;
                                            }
                                            if (var17 == 4) {
                                                var18 = 36;
                                            }
                                            class137.method863(var16[var17], 17001, var18, var5, class203.method1321(new class93[] { class64.field1026, var10.field3281 }, 105), var10.field3299, arg0.field1058);
                                        }
                                    }
                                }
                                class137.method863(class70.field1298, 17001, 1005, var5, class203.method1321(new class93[] { class64.field1026, var10.field3281 }, 116), var10.field3299, arg0.field1058);
                            } else if ((class75.field1360 & 0x10) == 16) {
                                class137.method863(class207.field4040, 17001, 50, var5, class203.method1321(new class93[] { class122.field2270, class96.field1787, var10.field3281 }, 126), var10.field3299, arg0.field1058);
                                class67.field1217++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field1152) {
            return;
        }
        if (!class103.field1905) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class93 var23 = class76.method391(arg0, var19, (byte) 20);
                if (var23 != null) {
                    class137.method863(var23, 17001, 1006, arg0.field1127, arg0.field1096, var19 + 1, arg0.field1058);
                    class27.field430++;
                }
            }
            class93 var20 = class28.method156((byte) 59, arg0);
            if (var20 != null) {
                class143.field2789++;
                class137.method863(var20, 17001, 57, arg0.field1127, arg0.field1096, 0, arg0.field1058);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class93 var22 = class76.method391(arg0, var21, (byte) 20);
                if (var22 != null) {
                    class137.method863(var22, arg1 - 806855870, 22, arg0.field1127, arg0.field1096, var21 + 1, arg0.field1058);
                    class27.field430++;
                }
            }
            if (!class114.method627(class178.method1173(arg0, 125), -32)) {
                return;
            }
            class100.field1846++;
            class137.method863(class16.field289, 17001, 13, arg0.field1127, class43.field712, 0, arg0.field1058);
        } else if (class182.method1184(class178.method1173(arg0, 125), 0) && (class75.field1360 & 0x20) == 32) {
            class127.field2381++;
            class137.method863(class207.field4040, 17001, 48, arg0.field1127, class203.method1321(new class93[] { class122.field2270, class112.field2079, arg0.field1096 }, 105), 0, arg0.field1058);
            return;
        }
    }
}
