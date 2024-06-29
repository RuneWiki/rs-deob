import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class166 extends class104 {

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "Le;")
    public class191 field2810;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "[I")
    public static int[] field2800 = new int[500];

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Le;")
    public static class191 field2803 = class54.method368("showingVideoAd", 2047);

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Le;")
    public static class191 field2807 = class54.method368("::fps ", 2047);

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field2806 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "Le;")
    public static class191 field2812 = class54.method368("<img=1>", 2047);

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lng;")
    public static class121 field2802;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZII)Le;")
    public static final class191 method1118(boolean arg0, int arg1, int arg2) {
        if (arg1 != 10) {
            method1118(true, 9, -111);
        }
        field2805++;
        return class55.method373(arg1 + 89, arg0, 10, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZILeg;I)V")
    public static final void method1119(boolean arg0, int arg1, class33 arg2, int arg3) {
        if (arg2.field547 == 1) {
            class46.field820++;
            class223.method1549(arg2.field625, 0L, 500, 0, (short) 50, arg2.field491, class26.field385);
        }
        field2801++;
        if (arg2.field547 == 2 && !class197.field3523) {
            class191 var4 = class179.method1200(arg2, true);
            if (var4 != null) {
                class223.method1549(var4, 0L, 500, -1, (short) 35, arg2.field491, class228.method1629(new class191[] { class16.field211, arg2.field601 }, (byte) -22));
                class137.field2294++;
            }
        }
        if (arg2.field547 == 3) {
            class114.field1893++;
            class223.method1549(class236.field4200, 0L, 500, 0, (short) 33, arg2.field491, class26.field385);
        }
        if (arg2.field547 == 4) {
            class207.field3686++;
            class223.method1549(arg2.field625, 0L, 500, 0, (short) 40, arg2.field491, class26.field385);
        }
        if (!arg0) {
            field2806 = -62;
        }
        if (arg2.field547 == 5) {
            class9.field95++;
            class223.method1549(arg2.field625, 0L, 500, 0, (short) 49, arg2.field491, class26.field385);
        }
        if (arg2.field547 == 6 && class32.field449 == null) {
            class217.field3830++;
            class223.method1549(arg2.field625, 0L, 500, -1, (short) 32, arg2.field491, class26.field385);
        }
        if (arg2.field493 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field469; var6++) {
                for (int var7 = 0; var7 < arg2.field488; var7++) {
                    int var8 = (arg2.field577 + 32) * var6;
                    int var9 = (arg2.field605 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg2.field617[var5];
                        var8 += arg2.field485[var5];
                    }
                    if (arg3 >= var9 && var8 <= arg1 && var9 + 32 > arg3 && arg1 < (var8 + 32)) {
                        class67.field1163 = arg2;
                        class102.field1684 = var5;
                        if (arg2.field515[var5] > 0) {
                            class148 var10 = class100.method623(-1, arg2.field515[var5] - 1);
                            if (class192.field3446 == 1 && class229.method1633(-11307, client.method668(arg2))) {
                                if (class70.field1235 != arg2.field491 || class176.field3021 != var5) {
                                    class223.method1549(class266.field4708, (long) var10.field2503, 500, var5, (short) 48, arg2.field491, class228.method1629(new class191[] { class69.field1216, class65.field1137, var10.field2529 }, (byte) -21));
                                    class21.field304++;
                                }
                            } else if (!class197.field3523 || !class229.method1633(-11307, client.method668(arg2))) {
                                class189.field3326++;
                                class191[] var11 = var10.field2512;
                                if (class271.field4784) {
                                    var11 = class236.method1669(var11, !arg0);
                                }
                                if (class229.method1633(-11307, client.method668(arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class18.field249++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 28;
                                            } else {
                                                var13 = 22;
                                            }
                                            class223.method1549(var11[var12], (long) var10.field2503, 500, var5, var13, arg2.field491, class228.method1629(new class191[] { class85.field1400, var10.field2529 }, (byte) -104));
                                        } else if (var12 == 4) {
                                            class223.method1549(class37.field674, (long) var10.field2503, 500, var5, (short) 22, arg2.field491, class228.method1629(new class191[] { class85.field1400, var10.field2529 }, (byte) -123));
                                            class239.field4244++;
                                        }
                                    }
                                }
                                if (class46.method315(client.method668(arg2), (byte) 66)) {
                                    class223.method1549(class266.field4708, (long) var10.field2503, 500, var5, (short) 11, arg2.field491, class228.method1629(new class191[] { class85.field1400, var10.field2529 }, (byte) -60));
                                    class16.field221++;
                                }
                                if (class229.method1633(-11307, client.method668(arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class42.field736++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 19;
                                            }
                                            if (var14 == 1) {
                                                var15 = 21;
                                            }
                                            if (var14 == 2) {
                                                var15 = 44;
                                            }
                                            class223.method1549(var11[var14], (long) var10.field2503, 500, var5, var15, arg2.field491, class228.method1629(new class191[] { class85.field1400, var10.field2529 }, (byte) -106));
                                        }
                                    }
                                }
                                class191[] var16 = arg2.field490;
                                if (class271.field4784) {
                                    var16 = class236.method1669(var16, false);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class61.field1086++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 57;
                                            }
                                            if (var17 == 1) {
                                                var18 = 39;
                                            }
                                            if (var17 == 2) {
                                                var18 = 6;
                                            }
                                            if (var17 == 3) {
                                                var18 = 16;
                                            }
                                            if (var17 == 4) {
                                                var18 = 10;
                                            }
                                            class223.method1549(var16[var17], (long) var10.field2503, 500, var5, var18, arg2.field491, class228.method1629(new class191[] { class85.field1400, var10.field2529 }, (byte) -10));
                                        }
                                    }
                                }
                                class223.method1549(class149.field2563, (long) var10.field2503, 500, var5, (short) 1001, arg2.field491, class228.method1629(new class191[] { class85.field1400, var10.field2529 }, (byte) -119));
                            } else if ((class147.field2482 & 0x10) == 16) {
                                class223.method1549(class14.field171, (long) var10.field2503, 500, var5, (short) 8, arg2.field491, class228.method1629(new class191[] { class45.field806, class65.field1137, var10.field2529 }, (byte) -43));
                                class34.field637++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field591) {
            return;
        }
        if (!class197.field3523) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class191 var23 = class167.method1127((byte) -97, arg2, var19);
                if (var23 != null) {
                    class184.field3182++;
                    class223.method1549(var23, (long) (var19 + 1), 500, arg2.field589, (short) 1007, arg2.field491, arg2.field565);
                }
            }
            class191 var20 = class179.method1200(arg2, true);
            if (var20 != null) {
                class137.field2294++;
                class223.method1549(var20, 0L, 500, arg2.field589, (short) 35, arg2.field491, arg2.field565);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class191 var22 = class167.method1127((byte) -97, arg2, var21);
                if (var22 != null) {
                    class223.method1549(var22, (long) (var21 + 1), 500, arg2.field589, (short) 18, arg2.field491, arg2.field565);
                    class184.field3182++;
                }
            }
            if (class213.method1457(client.method668(arg2), false)) {
                class223.method1549(client.field1734, 0L, 500, arg2.field589, (short) 32, arg2.field491, class26.field385);
                class217.field3830++;
                return;
            }
            return;
        }
        if (class271.method1848(client.method668(arg2), (byte) -126) && (class147.field2482 & 0x20) == 32) {
            class223.method1549(class14.field171, 0L, 500, arg2.field589, (short) 58, arg2.field491, class228.method1629(new class191[] { class45.field806, class4.field37, arg2.field565 }, (byte) -53));
            class122.field2020++;
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        class235.field4191.method985(arg0 ^ arg0);
        class157.field2679.method985(0);
        class8.field76.method985(0);
        field2804++;
        class82.field1381.method985(0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Le;B)Z")
    public static final boolean method1121(class191 arg0, byte arg1) {
        if (arg1 != 111) {
            return false;
        }
        field2813++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class254.field4506; var2++) {
            if (arg0.method1351(arg1 ^ 0xFFFFA5A9, class47.field844[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class166() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Le;)V")
    public class166(class191 arg0) {
        this.field2810 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field2803 = null;
        field2812 = null;
        if (arg0 > -114) {
            field2803 = null;
        }
        field2800 = null;
        field2802 = null;
        field2807 = null;
    }
}
