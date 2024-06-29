import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lod;")
    public static class101 field1469 = class46.method335(88, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lod;")
    public static class101 field1471 = class46.method335(-54, " x ");

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lod;")
    private static class101 field1475 = class46.method335(-94, " more options");

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lod;")
    public static class101 field1479 = field1475;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lod;")
    public static class101 field1483 = class46.method335(-80, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[Z")
    public static boolean[] field1473 = new boolean[5];

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field1482 = 20;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lod;")
    public static class101 field1474 = class46.method335(127, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static volatile int field1481 = 0;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1480 = 1;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lod;")
    private static class101 field1476 = class46.method335(-59, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "[Lod;")
    public static class101[] field1486 = new class101[1000];

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lod;")
    public static class101 field1487 = field1476;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Lod;")
    public static class101 field1489 = class46.method335(-74, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lod;")
    private static class101 field1491 = class46.method335(-87, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lod;")
    public static class101 field1468 = field1491;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lc;")
    public static class15 field1484;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
    public static int[] field1470;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method445(byte arg0) {
        field1479 = null;
        field1474 = null;
        if (arg0 <= 106) {
            method450(null, 117, null);
        }
        field1470 = null;
        field1491 = null;
        field1475 = null;
        field1473 = null;
        field1489 = null;
        field1471 = null;
        field1469 = null;
        field1468 = null;
        field1483 = null;
        field1486 = null;
        field1476 = null;
        field1487 = null;
        field1484 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZILsa;)V")
    public static final void method446(int arg0, boolean arg1, int arg2, class126 arg3) {
        field1490++;
        if (arg3.field2803 == 1) {
            class12.field244++;
            class138.method1096(class26.field672, arg3.field2810, 0, -1, 39, arg3.field2780, 0);
        }
        if (arg3.field2803 == 2 && !class106.field2292) {
            class101 var4 = class89.method633(arg3, -22344);
            if (var4 != null) {
                class138.method1096(class15.method101(70, new class101[] { class89.field1929, arg3.field2756 }), var4, -1, -1, 3, arg3.field2780, 0);
                class127.field2874++;
            }
        }
        if (arg1) {
            method450(null, -62, null);
        }
        if (arg3.field2803 == 3) {
            class138.method1096(class26.field672, class61.field1351, 0, -1, 32, arg3.field2780, 0);
            class105.field2255++;
        }
        if (arg3.field2803 == 4) {
            class127.field2879++;
            class138.method1096(class26.field672, arg3.field2810, 0, -1, 48, arg3.field2780, 0);
        }
        if (arg3.field2803 == 5) {
            class138.method1096(class26.field672, arg3.field2810, 0, -1, 19, arg3.field2780, 0);
            class84.field1835++;
        }
        if (arg3.field2803 == 6 && class30.field776 == null) {
            class85.field1851++;
            class138.method1096(class26.field672, arg3.field2810, -1, -1, 23, arg3.field2780, 0);
        }
        if (arg3.field2782 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field2871; var6++) {
                for (int var7 = 0; var7 < arg3.field2785; var7++) {
                    int var8 = (arg3.field2736 + 32) * var6;
                    int var9 = (arg3.field2843 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg3.field2804[var5];
                        var9 += arg3.field2824[var5];
                    }
                    if (var9 <= arg0 && var8 <= arg2 && arg0 < var9 + 32 && arg2 < var8 + 32) {
                        class90.field1966 = arg3;
                        class52.field1180 = var5;
                        if (arg3.field2841[var5] > 0) {
                            class155 var10 = class137.method1045((byte) -54, arg3.field2841[var5] - 1);
                            if (class49.field1158 == 1 && client.method164(class42.method313(arg3, (byte) -55), -618353250)) {
                                if (class132.field3032 != arg3.field2780 || class11.field185 != var5) {
                                    class138.method1096(class15.method101(-16, new class101[] { class132.field3036, class89.field1937, var10.field3570 }), class101.field2208, var5, -1, 38, arg3.field2780, var10.field3529);
                                    class30.field775++;
                                }
                            } else if (!class106.field2292 || !client.method164(class42.method313(arg3, (byte) -25), -618353250)) {
                                class101[] var11 = var10.field3540;
                                class155.field3530++;
                                if (class120.field2645) {
                                    var11 = class26.method209(-8940, var11);
                                }
                                if (client.method164(class42.method313(arg3, (byte) -70), -618353250)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 12;
                                            } else {
                                                var13 = 17;
                                            }
                                            class138.method1096(class15.method101(-14, new class101[] { class140.field3236, var10.field3570 }), var11[var12], var5, -1, var13, arg3.field2780, var10.field3529);
                                            class95.field2039++;
                                        } else if (var12 == 4) {
                                            class138.method1096(class15.method101(70, new class101[] { class140.field3236, var10.field3570 }), class94.field2028, var5, -1, 17, arg3.field2780, var10.field3529);
                                            class11.field209++;
                                        }
                                    }
                                }
                                if (class155.method1198(class42.method313(arg3, (byte) -20), 1339240223)) {
                                    class33.field848++;
                                    class138.method1096(class15.method101(-98, new class101[] { class140.field3236, var10.field3570 }), class101.field2208, var5, -1, 47, arg3.field2780, var10.field3529);
                                }
                                if (client.method164(class42.method313(arg3, (byte) -49), -618353250) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class57.field1288++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 9;
                                            }
                                            if (var14 == 1) {
                                                var15 = 42;
                                            }
                                            if (var14 == 2) {
                                                var15 = 34;
                                            }
                                            class138.method1096(class15.method101(-12, new class101[] { class140.field3236, var10.field3570 }), var11[var14], var5, -1, var15, arg3.field2780, var10.field3529);
                                        }
                                    }
                                }
                                class101[] var16 = arg3.field2762;
                                if (class120.field2645) {
                                    var16 = class26.method209(-8940, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            class132.field3009++;
                                            if (var17 == 0) {
                                                var18 = 26;
                                            }
                                            if (var17 == 1) {
                                                var18 = 31;
                                            }
                                            if (var17 == 2) {
                                                var18 = 16;
                                            }
                                            if (var17 == 3) {
                                                var18 = 18;
                                            }
                                            if (var17 == 4) {
                                                var18 = 50;
                                            }
                                            class138.method1096(class15.method101(-4, new class101[] { class140.field3236, var10.field3570 }), var16[var17], var5, -1, var18, arg3.field2780, var10.field3529);
                                        }
                                    }
                                }
                                class138.method1096(class15.method101(101, new class101[] { class140.field3236, var10.field3570 }), class26.field694, var5, -1, 1004, arg3.field2780, var10.field3529);
                            } else if ((class135.field3095 & 0x10) == 16) {
                                class87.field1923++;
                                class138.method1096(class15.method101(106, new class101[] { class15.field302, class89.field1937, var10.field3570 }), class149.field3395, var5, -1, 6, arg3.field2780, var10.field3529);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field2788) {
            return;
        }
        if (!class106.field2292) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class101 var23 = class133.method1029(arg3, (byte) -82, var19);
                if (var23 != null) {
                    class138.method1096(arg3.field2738, var23, arg3.field2807, -1, 1001, arg3.field2780, var19 + 1);
                    class29.field763++;
                }
            }
            class101 var20 = class89.method633(arg3, -22344);
            if (var20 != null) {
                class127.field2874++;
                class138.method1096(arg3.field2738, var20, arg3.field2807, -1, 3, arg3.field2780, 0);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class101 var22 = class133.method1029(arg3, (byte) -82, var21);
                if (var22 != null) {
                    class29.field763++;
                    class138.method1096(arg3.field2738, var22, arg3.field2807, -1, 2, arg3.field2780, var21 + 1);
                }
            }
            if (class127.method982((byte) -83, class42.method313(arg3, (byte) -59))) {
                class138.method1096(class26.field672, class138.field3149, arg3.field2807, -1, 23, arg3.field2780, 0);
                class85.field1851++;
                return;
            }
            return;
        }
        if (class106.method764(class42.method313(arg3, (byte) -36), 255) && (class135.field3095 & 0x20) == 32) {
            class138.method1096(class15.method101(75, new class101[] { class15.field302, class141.field3239, arg3.field2738 }), class149.field3395, arg3.field2807, -1, 10, arg3.field2780, 0);
            class54.field1231++;
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lc;I)V")
    public static final void method447(class15 arg0, int arg1) {
        class129.field2955 = arg0;
        field1478++;
        if (arg1 != 1850) {
            field1480 = -5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if (arg2 != 23) {
            method450(null, 27, null);
        }
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg5;
            arg5 = var8;
        }
        field1477++;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 8 - arg1 - arg4;
        } else {
            return 1 + 7 - arg5 - arg6;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZ)I")
    public static final int method449(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0 >> 7;
        if (!arg3) {
            field1481 = 20;
        }
        field1472++;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class86.field1905[1][var5][var4] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var7) * class20.field431[var6][var5][var4] + class20.field431[var6][var5 + 1][var4] * var7 >> 7;
        int var10 = (128 - var7) * class20.field431[var6][var5][var4 + 1] + class20.field431[var6][var5 + 1][var4 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Object;ILve;)V")
    public static final void method450(Object arg0, int arg1, class151 arg2) {
        field1485++;
        int var3 = -50 % ((arg1 + 32) / 52);
        if (arg2.field3452 == null) {
            return;
        }
        for (int var4 = 0; var4 < 50 && arg2.field3452.peekEvent() != null; var4++) {
            class127.method981((byte) -86, 1L);
        }
        if (arg0 != null) {
            arg2.field3452.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
