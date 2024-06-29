import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class127 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lsd;")
    public static class166 field2499 = class135.method935(" loggt sich ein)3", 0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2497 = -1;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lsd;")
    public static class166 field2496 = class135.method935("Bitte warten Sie)3)3)3", 0);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[Lsd;")
    public static class166[] field2500 = new class166[200];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
    public static boolean field2493 = false;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lsd;")
    private static class166 field2504 = class135.method935("No reply from loginserver)3", 0);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2505 = 50;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lsd;")
    public static class166 field2506 = class135.method935("gleiten:", 0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lsd;")
    public static class166 field2494 = field2504;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lsd;")
    public static class166 field2495 = class135.method935("Untersuchen", 0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Loe;")
    public static class131 field2502;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method904(byte arg0) {
        field2502 = null;
        field2494 = null;
        field2495 = null;
        field2506 = null;
        field2496 = null;
        field2500 = null;
        field2504 = null;
        int var1 = -92 / ((arg0 - 8) / 59);
        field2499 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvd;III)V")
    public static final void method905(class193 arg0, int arg1, int arg2, int arg3) {
        field2501++;
        if (arg0.field3711 == 1) {
            class151.field2941++;
            class72.method571(0, 0, arg0.field3792, class196.field3891, 30, arg0.field3715, false);
        }
        if (arg0.field3711 == 2 && !class179.field3393) {
            class166 var4 = class52.method382(59, arg0);
            if (var4 != null) {
                class41.field735++;
                class72.method571(0, -1, var4, class22.method148(new class166[] { class98.field1868, arg0.field3780 }, arg2 + 3814), 18, arg0.field3715, false);
            }
        }
        if (arg0.field3711 == 3) {
            class53.field990++;
            class72.method571(0, 0, class74.field1533, class196.field3891, 10, arg0.field3715, false);
        }
        if (arg0.field3711 == 4) {
            class72.method571(0, 0, arg0.field3792, class196.field3891, 31, arg0.field3715, false);
            class61.field1247++;
        }
        if (arg0.field3711 == 5) {
            class72.method571(0, 0, arg0.field3792, class196.field3891, 47, arg0.field3715, false);
            class113.field2204++;
        }
        if (arg2 != -3814) {
            method904((byte) -32);
        }
        if (arg0.field3711 == 6 && class11.field201 == null) {
            class5.field89++;
            class72.method571(0, -1, arg0.field3792, class196.field3891, 43, arg0.field3715, false);
        }
        if (arg0.field3797 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field3768; var6++) {
                for (int var7 = 0; var7 < arg0.field3705; var7++) {
                    int var8 = (arg0.field3757 + 32) * var7;
                    int var9 = (arg0.field3777 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field3817[var5];
                        var8 += arg0.field3783[var5];
                    }
                    if (arg3 >= var8 && arg1 >= var9 && arg3 < var8 + 32 && var9 + 32 > arg1) {
                        client.field514 = var5;
                        class9.field184 = arg0;
                        if (arg0.field3755[var5] > 0) {
                            class57 var10 = class3.method19(arg0.field3755[var5] - 1, true);
                            if (class4.field73 == 1 && class86.method690((byte) 69, class140.method955(-88, arg0))) {
                                if (class104.field2037 != arg0.field3715 || class166.field3163 != var5) {
                                    class54.field1024++;
                                    class72.method571(var10.field1161, var5, class72.field1426, class22.method148(new class166[] { class135.field2651, class159.field3035, var10.field1122 }, arg2 ^ 0xFFFFF11A), 4, arg0.field3715, false);
                                }
                            } else if (!class179.field3393 || !class86.method690((byte) 55, class140.method955(-81, arg0))) {
                                class33.field605++;
                                class166[] var11 = var10.field1131;
                                if (class138.field2684) {
                                    var11 = class167.method1164(var11, 5);
                                }
                                if (class86.method690((byte) 125, class140.method955(-51, arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class135.field2641++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 45;
                                            } else {
                                                var13 = 16;
                                            }
                                            class72.method571(var10.field1161, var5, var11[var12], class22.method148(new class166[] { class35.field662, var10.field1122 }, 0), var13, arg0.field3715, false);
                                        } else if (var12 == 4) {
                                            class192.field3644++;
                                            class72.method571(var10.field1161, var5, class104.field2041, class22.method148(new class166[] { class35.field662, var10.field1122 }, 0), 16, arg0.field3715, false);
                                        }
                                    }
                                }
                                if (class117.method840(class140.method955(-120, arg0), true)) {
                                    class72.method571(var10.field1161, var5, class72.field1426, class22.method148(new class166[] { class35.field662, var10.field1122 }, 0), 32, arg0.field3715, false);
                                    class137.field2670++;
                                }
                                if (class86.method690((byte) 60, class140.method955(arg2 ^ 0xEC1, arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class177.field3343++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 51;
                                            }
                                            if (var14 == 1) {
                                                var15 = 46;
                                            }
                                            if (var14 == 2) {
                                                var15 = 33;
                                            }
                                            class72.method571(var10.field1161, var5, var11[var14], class22.method148(new class166[] { class35.field662, var10.field1122 }, 0), var15, arg0.field3715, false);
                                        }
                                    }
                                }
                                class166[] var16 = arg0.field3751;
                                if (class138.field2684) {
                                    var16 = class167.method1164(var16, 5);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class12.field237++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 2;
                                            }
                                            if (var17 == 1) {
                                                var18 = 29;
                                            }
                                            if (var17 == 2) {
                                                var18 = 35;
                                            }
                                            if (var17 == 3) {
                                                var18 = 22;
                                            }
                                            if (var17 == 4) {
                                                var18 = 48;
                                            }
                                            class72.method571(var10.field1161, var5, var16[var17], class22.method148(new class166[] { class35.field662, var10.field1122 }, 0), var18, arg0.field3715, false);
                                        }
                                    }
                                }
                                class72.method571(var10.field1161, var5, class4.field79, class22.method148(new class166[] { class35.field662, var10.field1122 }, arg2 + 3814), 1002, arg0.field3715, false);
                            } else if ((class49.field911 & 0x10) == 16) {
                                class167.field3218++;
                                class72.method571(var10.field1161, var5, class102.field1988, class22.method148(new class166[] { class43.field759, class159.field3035, var10.field1122 }, 0), 21, arg0.field3715, false);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field3841) {
            return;
        }
        if (!class179.field3393) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class166 var23 = class120.method867(false, var19, arg0);
                if (var23 != null) {
                    class49.field905++;
                    class72.method571(var19 + 1, arg0.field3716, var23, arg0.field3720, 1004, arg0.field3715, false);
                }
            }
            class166 var20 = class52.method382(-100, arg0);
            if (var20 != null) {
                class72.method571(0, arg0.field3716, var20, arg0.field3720, 18, arg0.field3715, false);
                class41.field735++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class166 var22 = class120.method867(false, var21, arg0);
                if (var22 != null) {
                    class49.field905++;
                    class72.method571(var21 + 1, arg0.field3716, var22, arg0.field3720, 38, arg0.field3715, false);
                }
            }
            if (class59.method500(class140.method955(-124, arg0), (byte) 122)) {
                class72.method571(0, arg0.field3716, class70.field1417, class196.field3891, 43, arg0.field3715, false);
                class5.field89++;
                return;
            }
            return;
        }
        if (class164.method1103(class140.method955(-126, arg0), false) && (class49.field911 & 0x20) == 32) {
            class72.method571(0, arg0.field3716, class102.field1988, class22.method148(new class166[] { class43.field759, class30.field560, arg0.field3720 }, 0), 36, arg0.field3715, false);
            class116.field2245++;
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lf;B)V")
    public static final void method906(class47 arg0, byte arg1) {
        if (arg1 < -23) {
            class134.field2600 = arg0;
            class171.field3281 = class134.field2600.method358(16, -1);
            field2503++;
        }
    }
}
