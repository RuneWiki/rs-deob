import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class77 {

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "Lph;")
    public class171 field116;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "Lbb;")
    public static class14 field113 = new class14(64);

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Ldc;")
    public static class37 field117 = class185.method1233((byte) 86, "Untersuchen");

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Z")
    public static boolean field120 = true;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "[I")
    public static int[] field122 = new int[2048];

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "Ldc;")
    public static class37 field119 = class185.method1233((byte) 86, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Ldc;")
    public static class37 field123 = class185.method1233((byte) 86, "titlebutton");

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "Ldc;")
    private static class37 field124 = class185.method1233((byte) 86, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "Ldc;")
    public static class37 field118 = field124;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "Ldj;")
    public static class44 field121;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)J")
    public static final long method60(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        return var3 == null || var3.field299 == null ? 0L : var3.field299.field1081;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Lna;")
    public static final class142 method61(int arg0, boolean arg1) {
        field110++;
        class142 var2 = (class142) class6.field64.method87(120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field1097.method1547(class144.method1002((byte) 47, arg0), 0, class138.method962(arg0, -544255032));
        class142 var4 = new class142();
        if (var3 != null) {
            var4.method991((byte) 121, new class28(var3));
        }
        if (arg1) {
            field120 = false;
        }
        class6.field64.method92((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lig;BLig;)V")
    public static final void method62(class93 arg0, byte arg1, class93 arg2) {
        if (class143.field2755 == null) {
            class143.field2755 = class221.method1459(class6.field69, class212.field3958, 0, 0);
        }
        if (arg1 < 83) {
            field117 = null;
        }
        if (class32.field651 == null) {
            class32.field651 = class147.method1012(class212.field3958, 0, class239.field4392, 0);
        }
        if (class67.field1202 == null) {
            class67.field1202 = class147.method1012(class212.field3958, 0, class94.field1642, 0);
        }
        field114++;
        if (class142.field2736 == null) {
            class142.field2736 = class147.method1012(class212.field3958, 0, class158.field2996, 0);
        }
        class48.method420(0, 23, 765, 480, 0);
        class48.method406(0, 0, 138, 23, 12425273, 9135624);
        class48.method406(138, 0, 640, 23, 5197647, 2697513);
        arg2.method621(class218.field4073, 69, 15, 0, -1);
        if (class142.field2736 != null) {
            class142.field2736[1].method662(140, 1);
            arg0.method607(class117.field2096, 152, 10, 16777215, -1);
            class142.field2736[0].method662(140, 12);
            arg0.method607(class159.field3008, 152, 21, 16777215, -1);
        }
        if (class67.field1202 != null) {
            short var3 = 610;
            short var4 = 500;
            short var5 = 280;
            if (class198.field3701[0] == 0 && class140.field2717[0] == 0) {
                class67.field1202[2].method662(var5, 4);
            } else {
                class67.field1202[0].method662(var5, 4);
            }
            if (class198.field3701[0] == 0 && class140.field2717[0] == 1) {
                class67.field1202[3].method662(var5 + 15, 4);
            } else {
                class67.field1202[1].method662(var5 + 15, 4);
            }
            arg2.method607(class205.field3796, var5 + 32, 17, 16777215, -1);
            short var6 = 390;
            if (class198.field3701[0] == 1 && class140.field2717[0] == 0) {
                class67.field1202[2].method662(var6, 4);
            } else {
                class67.field1202[0].method662(var6, 4);
            }
            if (class198.field3701[0] == 1 && class140.field2717[0] == 1) {
                class67.field1202[3].method662(var6 + 15, 4);
            } else {
                class67.field1202[1].method662(var6 + 15, 4);
            }
            arg2.method607(class127.field2354, var6 + 32, 17, 16777215, -1);
            if (class198.field3701[0] == 2 && class140.field2717[0] == 0) {
                class67.field1202[2].method662(var4, 4);
            } else {
                class67.field1202[0].method662(var4, 4);
            }
            if (class198.field3701[0] == 2 && class140.field2717[0] == 1) {
                class67.field1202[3].method662(var4 + 15, 4);
            } else {
                class67.field1202[1].method662(var4 + 15, 4);
            }
            arg2.method607(class43.field920, var4 + 32, 17, 16777215, -1);
            if (class198.field3701[0] == 3 && class140.field2717[0] == 0) {
                class67.field1202[2].method662(var3, 4);
            } else {
                class67.field1202[0].method662(var3, 4);
            }
            if (class198.field3701[0] == 3 && class140.field2717[0] == 1) {
                class67.field1202[3].method662(var3 + 15, 4);
            } else {
                class67.field1202[1].method662(var3 + 15, 4);
            }
            arg2.method607(class14.field203, var3 + 32, 17, 16777215, -1);
        }
        class48.method420(700, 4, 58, 16, 0);
        arg0.method621(class161.field3046, 729, 16, 16777215, -1);
        class7.field78 = -1;
        if (class143.field2755 == null) {
            return;
        }
        byte var7 = 88;
        byte var8 = 19;
        int var9 = 765 / (var7 + 1);
        int var10 = 480 / (var8 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var9;
            if ((var9 - 1) * var10 >= class115.field2055) {
                var9--;
            }
            if (class115.field2055 <= (var10 - 1) * var9) {
                var10--;
            }
            if (class115.field2055 <= (var10 - 1) * var9) {
                var10--;
            }
        } while (var10 != var11 || var9 != var12);
        int var13 = (765 - var7 * var9) / (var9 - -1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var14 = (765 - var7 * var9 - (var9 + -1) * var13) / 2;
        int var15 = (480 - var8 * var10) / (var10 + 1);
        if (var15 > 5) {
            var15 = 5;
        }
        int var16 = 0;
        int var17 = var14;
        int var18 = (480 - var8 * var10 - (var10 - 1) * var15) / 2;
        int var19 = var18 + 23;
        for (int var20 = 0; var20 < class115.field2055; var20++) {
            class183 var21 = class6.field67[var20];
            boolean var22 = true;
            class37 var23 = class151.method1034((byte) -9, var21.field3383);
            if (var21.field3383 == -1) {
                var22 = false;
                var23 = class105.field1819;
            } else if (var21.field3383 > 1980) {
                var23 = class60.field1118;
                var22 = false;
            }
            if (class80.field1416 >= var17 && var19 <= class235.field4271 && class80.field1416 < var7 + var17 && class235.field4271 < var8 + var19 && var22) {
                class7.field78 = var20;
                class143.field2755[var21.field3386 ? 1 : 0].method692(var17, var19, 128, 16777215);
            } else {
                class143.field2755[var21.field3386 ? 1 : 0].method698(var17, var19);
            }
            if (class32.field651 != null) {
                class32.field651[var21.field3379 + (var21.field3386 ? 8 : 0)].method662(var17 + 29, var19);
            }
            arg2.method621(class151.method1034((byte) -9, var21.field3387), var17 + 15, var8 / 2 + 5 + var19, 0, -1);
            arg0.method621(var23, var17 + 60, var8 / 2 + var19 - -5, 268435455, -1);
            var19 += var15 + var8;
            int var10000 = ~var10;
            var16++;
            if (var10000 >= ~var16) {
                var19 = var18 + 23;
                var16 = 0;
                var17 += var13 + var7;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZIIIII)I")
    public static final int method63(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg0;
            arg0 = var7;
        }
        if (!arg1) {
            return -91;
        }
        field112++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg5;
        } else {
            return 1 + 7 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V")
    public static void method64(int arg0) {
        field118 = null;
        field124 = null;
        field121 = null;
        field117 = null;
        field119 = null;
        field123 = null;
        field113 = null;
        field122 = null;
        if (arg0 != 11) {
            method64(-45);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIBLmf;)V")
    public static final void method65(int arg0, int arg1, byte arg2, class136 arg3) {
        field111++;
        if (arg3.field2548 == 1) {
            class200.method1328(0L, (short) 30, 0, class243.field4462, 500, arg3.field2569, arg3.field2608);
            class49.field989++;
        }
        if (arg2 != 1) {
            field113 = null;
        }
        if (arg3.field2548 == 2 && !class30.field600) {
            class37 var4 = class221.method1458((byte) -114, arg3);
            if (var4 != null) {
                class203.field3759++;
                class200.method1328(0L, (short) 9, -1, class80.method548(new class37[] { class228.field4194, arg3.field2529 }, -10), arg2 + 499, var4, arg3.field2608);
            }
        }
        if (arg3.field2548 == 3) {
            class68.field1217++;
            class200.method1328(0L, (short) 13, 0, class243.field4462, 500, class3.field19, arg3.field2608);
        }
        if (arg3.field2548 == 4) {
            class200.method1328(0L, (short) 57, 0, class243.field4462, 500, arg3.field2569, arg3.field2608);
            class233.field4254++;
        }
        if (arg3.field2548 == 5) {
            class207.field3874++;
            class200.method1328(0L, (short) 23, 0, class243.field4462, 500, arg3.field2569, arg3.field2608);
        }
        if (arg3.field2548 == 6 && class152.field2877 == null) {
            class200.method1328(0L, (short) 15, -1, class243.field4462, 500, arg3.field2569, arg3.field2608);
            class139.field2689++;
        }
        if (arg3.field2513 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field2615; var6++) {
                for (int var7 = 0; var7 < arg3.field2622; var7++) {
                    int var8 = (arg3.field2556 + 32) * var7;
                    int var9 = (arg3.field2508 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field2561[var5];
                        var8 += arg3.field2521[var5];
                    }
                    if (var8 <= arg1 && arg0 >= var9 && arg1 < var8 + 32 && arg0 < var9 + 32) {
                        class217.field4054 = arg3;
                        class109.field1896 = var5;
                        if (arg3.field2538[var5] > 0) {
                            class125 var10 = class223.method1471(117, arg3.field2538[var5] - 1);
                            if (class66.field1191 == 1 && class244.method1588(class107.method699(arg3, 71), -26304)) {
                                if (class109.field1894 != arg3.field2608 || class39.field809 != var5) {
                                    class200.method1328((long) var10.field2256, (short) 26, var5, class80.method548(new class37[] { class223.field4142, class35.field702, var10.field2232 }, -76), 500, class206.field3841, arg3.field2608);
                                    class49.field974++;
                                }
                            } else if (!class30.field600 || !class244.method1588(class107.method699(arg3, 121), -26304)) {
                                class37[] var11 = var10.field2240;
                                class52.field1044++;
                                if (class34.field696) {
                                    var11 = class195.method1299(30113, var11);
                                }
                                if (class244.method1588(class107.method699(arg3, arg2 ^ 0x78), -26304)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class121.field2165++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 6;
                                            } else {
                                                var13 = 11;
                                            }
                                            class200.method1328((long) var10.field2256, var13, var5, class80.method548(new class37[] { class196.field3668, var10.field2232 }, -58), 500, var11[var12], arg3.field2608);
                                        } else if (var12 == 4) {
                                            class200.method1328((long) var10.field2256, (short) 11, var5, class80.method548(new class37[] { class196.field3668, var10.field2232 }, arg2 - 21), 500, class207.field3864, arg3.field2608);
                                            class191.field3565++;
                                        }
                                    }
                                }
                                if (class109.method709(-1, class107.method699(arg3, 105))) {
                                    class200.method1328((long) var10.field2256, (short) 18, var5, class80.method548(new class37[] { class196.field3668, var10.field2232 }, arg2 ^ 0xFFFFFFF3), 500, class206.field3841, arg3.field2608);
                                    class225.field4165++;
                                }
                                if (class244.method1588(class107.method699(arg3, 124), -26304) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class24.field420++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 50;
                                            }
                                            if (var14 == 1) {
                                                var15 = 47;
                                            }
                                            if (var14 == 2) {
                                                var15 = 20;
                                            }
                                            class200.method1328((long) var10.field2256, var15, var5, class80.method548(new class37[] { class196.field3668, var10.field2232 }, -46), 500, var11[var14], arg3.field2608);
                                        }
                                    }
                                }
                                class37[] var16 = arg3.field2539;
                                if (class34.field696) {
                                    var16 = class195.method1299(30113, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class68.field1240++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 36;
                                            }
                                            if (var17 == 1) {
                                                var18 = 7;
                                            }
                                            if (var17 == 2) {
                                                var18 = 8;
                                            }
                                            if (var17 == 3) {
                                                var18 = 28;
                                            }
                                            if (var17 == 4) {
                                                var18 = 51;
                                            }
                                            class200.method1328((long) var10.field2256, var18, var5, class80.method548(new class37[] { class196.field3668, var10.field2232 }, arg2 ^ 0xFFFFFFF6), arg2 ^ 0x1F5, var16[var17], arg3.field2608);
                                        }
                                    }
                                }
                                class200.method1328((long) var10.field2256, (short) 1007, var5, class80.method548(new class37[] { class196.field3668, var10.field2232 }, -11), 500, class156.field2974, arg3.field2608);
                            } else if ((class24.field418 & 0x10) == 16) {
                                class113.field2027++;
                                class200.method1328((long) var10.field2256, (short) 24, var5, class80.method548(new class37[] { class12.field170, class35.field702, var10.field2232 }, -24), 500, class109.field1899, arg3.field2608);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field2527) {
            return;
        }
        if (!class30.field600) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class37 var23 = class97.method645(var19, arg3, 1);
                if (var23 != null) {
                    class50.field1005++;
                    class200.method1328((long) (var19 + 1), (short) 1002, arg3.field2515, arg3.field2640, 500, var23, arg3.field2608);
                }
            }
            class37 var20 = class221.method1458((byte) -111, arg3);
            if (var20 != null) {
                class200.method1328(0L, (short) 9, arg3.field2515, arg3.field2640, 500, var20, arg3.field2608);
                class203.field3759++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class37 var22 = class97.method645(var21, arg3, arg2);
                if (var22 != null) {
                    class200.method1328((long) (var21 + 1), (short) 19, arg3.field2515, arg3.field2640, arg2 + 499, var22, arg3.field2608);
                    class50.field1005++;
                }
            }
            if (class32.method261(class107.method699(arg3, arg2 + 64), arg2)) {
                class139.field2689++;
                class200.method1328(0L, (short) 15, arg3.field2515, class243.field4462, 500, class156.field2970, arg3.field2608);
                return;
            }
            return;
        }
        if (class85.method578(class107.method699(arg3, 72), (byte) 122) && (class24.field418 & 0x20) == 32) {
            class241.field4425++;
            class200.method1328(0L, (short) 49, arg3.field2515, class80.method548(new class37[] { class12.field170, class75.field1325, arg3.field2640 }, -66), arg2 ^ 0x1F5, class109.field1899, arg3.field2608);
            return;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lph;)V")
    public class9(class171 arg0) {
        this.field116 = arg0;
    }
}
