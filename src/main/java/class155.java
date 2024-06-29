import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class155 extends class119 {

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "[Lnf;")
    public class96[] field3547;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lv;")
    public static class146 field3531 = class159.method1226((byte) -37, "gr-Un:");

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lv;")
    private static class146 field3537 = class159.method1226((byte) -37, "Location");

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lv;")
    private static class146 field3542 = class159.method1226((byte) -37, "Examine");

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Lv;")
    public static class146 field3535 = class159.method1226((byte) -37, "titlebox");

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Lv;")
    public static class146 field3536 = field3542;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Lv;")
    public static class146 field3539 = field3537;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Lv;")
    private static class146 field3545 = class159.method1226((byte) -37, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "Lv;")
    public static class146 field3543 = field3545;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "Ldc;")
    public static class25 field3546;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lne;IIIIIII)V")
    public static final void method1159(class95 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -3 % ((34 - arg6) / 50);
        field3538++;
        if (arg7 < 0 || arg7 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg0.method790((byte) 73);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method790((byte) 73);
                    return;
                }
                if (var11 <= 49) {
                    arg0.method790((byte) 73);
                }
            }
        }
        class74.field1772[arg4][arg7][arg3] = 0;
        while (true) {
            int var9 = arg0.method790((byte) 73);
            if (var9 == 0) {
                if (arg4 == 0) {
                    class78.field1891[0][arg7][arg3] = -class31.method210(false, arg3 + arg1 + 556238, 932731 - -arg7 + arg5) * 8;
                    return;
                } else {
                    class78.field1891[arg4][arg7][arg3] = class78.field1891[arg4 - 1][arg7][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method790((byte) 73);
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg4 != 0) {
                    class78.field1891[arg4][arg7][arg3] = class78.field1891[arg4 - 1][arg7][arg3] - var10 * 8;
                    return;
                }
                class78.field1891[0][arg7][arg3] = -var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class37.field839[arg4][arg7][arg3] = arg0.method770((byte) -125);
                class154.field3527[arg4][arg7][arg3] = (byte) ((var9 - 2) / 4);
                class29.field611[arg4][arg7][arg3] = (byte) class90.method711(arg2 + var9 - 2, 3);
            } else if (var9 <= 81) {
                class74.field1772[arg4][arg7][arg3] = (byte) (var9 - 49);
            } else {
                class37.field835[arg4][arg7][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lmb;BLmb;)V")
    public static final void method1160(class85 arg0, byte arg1, class85 arg2) {
        field3534++;
        if (class123.field2859) {
            class33.method219(arg0, (byte) 88, arg2);
            return;
        }
        if (class47.field1071 == 0 || class47.field1071 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg0.method806(class67.field1530, 382, 245 - var3, 16777215, -1);
            class56.method391(230, var4, 304, 34, 9179409);
            class56.method391(231, var4 + 1, 302, 32, 0);
            class56.method382(232, var4 + 2, class105.field2519 * 3, 30, 9179409);
            class56.method382(class105.field2519 * 3 + 232, var4 + 2, 300 - class105.field2519 * 3, 30, 0);
            arg0.method806(class134.field3067, 382, 276 - var3, 16777215, -1);
        }
        if (class47.field1071 == 20) {
            class143.field3260.method1065(382 - class143.field3260.field3280 / 2, 271 - class143.field3260.field3287 / 2);
            short var5 = 211;
            arg0.method806(class134.field3066, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method806(class134.field3062, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method806(class134.field3070, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method827(class71.method509(new class146[] { class125.field2905, class99.method821(class134.field3057) }, (byte) -108), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method827(class71.method509(new class146[] { class95.field2315, class134.field3056.method1102(0) }, (byte) -82), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class47.field1071 == 10) {
            class143.field3260.method1065(202, 171);
            if (class72.field1684 == 0) {
                short var6 = 251;
                short var7 = 291;
                arg0.method806(class48.field1098, 382, var6, 16776960, 0);
                short var8 = 302;
                class51.field1157.method1065(var8 - 73, var7 + -20);
                arg0.method820(class66.field1490, var8 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                int var27 = var6 + 30;
                class51.field1157.method1065(var9 - 73, var7 - 20);
                arg0.method820(class1.field9, var9 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class72.field1684 == 2) {
                short var13 = 211;
                arg0.method806(class134.field3066, 382, var13, 16776960, 0);
                int var34 = var13 + 15;
                short var14 = 302;
                short var15 = 321;
                arg0.method806(class134.field3062, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                arg0.method806(class134.field3070, 382, var35, 16776960, 0);
                int var36 = var35 + 15;
                int var37 = var36 + 10;
                arg0.method827(class71.method509(new class146[] { class125.field2905, class99.method821(class134.field3057), class1.field11 == 0 & class94.field2229 % 40 < 20 ? class113.field2661 : class134.field3064 }, (byte) -73), 272, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg0.method827(class71.method509(new class146[] { class95.field2315, class134.field3056.method1102(arg1 ^ 0x18), class94.field2229 % 40 < 20 & class1.field11 == 1 ? class113.field2661 : class134.field3064 }, (byte) 55), 274, var38, 16777215, 0);
                class51.field1157.method1065(var14 - 73, var15 + -20);
                int var39 = var38 + 15;
                arg0.method806(class90.field2170, var14, var15 + 5, 16777215, 0);
                short var16 = 462;
                class51.field1157.method1065(var16 - 73, var15 + -20);
                arg0.method806(class140.field3210, var16, var15 + 5, 16777215, 0);
            } else if (class72.field1684 == 3) {
                arg0.method806(class147.field3408, 382, 211, 16776960, 0);
                short var10 = 236;
                arg0.method806(class107.field2559, 382, var10, 16777215, 0);
                short var11 = 321;
                int var30 = var10 + 15;
                arg0.method806(class60.field1384, 382, var30, 16777215, 0);
                int var31 = var30 + 15;
                short var12 = 382;
                arg0.method806(field3543, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg0.method806(class122.field2830, 382, var32, 16777215, 0);
                class51.field1157.method1065(var12 - 73, var11 - 20);
                arg0.method806(class140.field3210, var12, var11 + 5, 16777215, 0);
                int var33 = var32 + 15;
            }
        }
        if (class46.field1059 != 1) {
            if (class75.field1804 > 0) {
                class145.method1069(class75.field1804, (byte) -71);
                class75.field1804 = 0;
            }
            class6.method49(256);
        }
        class78.field1888[class101.field2454 ? 1 : 0].method1065(725, 463);
        if (class47.field1071 > 5 && class157.field3607 != 2 && class67.field1505 == 0) {
            if (class44.field985 == null) {
                class44.field985 = class29.method199(class134.field3064, class48.field1108, class3.field89, -26);
            } else {
                byte var17 = 5;
                short var18 = 463;
                class44.field985.method1065(var17, var18);
                byte var19 = 100;
                byte var20 = 35;
                arg0.method806(class71.method509(new class146[] { class148.field3436, class28.field593, class75.method564(false, class33.field713) }, (byte) -78), var19 / 2 + var17, var20 / 2 + var18 + -2, 16777215, 0);
                if (class95.field2272 == null) {
                    arg2.method806(class150.field3478, var19 / 2 + var17, var20 / 2 + (var18 - -12), 16777215, 0);
                } else {
                    arg2.method806(class26.field514, var19 / 2 + var17, var20 / 2 + var18 + 12, 16777215, 0);
                }
            }
        }
        if (arg1 != 24) {
            method1159(null, 63, -107, 17, 0, -81, -112, -112);
        }
        try {
            Graphics var21 = class1.field3.getGraphics();
            class141.field3233.method599(21982, 0, var21, 0);
        } catch (Exception var22) {
            class1.field3.repaint();
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public static final void method1161(int arg0, int arg1, int arg2) {
        field3541++;
        if (arg0 <= 62) {
            method1163(-29);
        }
        long var3 = (long) ((arg2 << 16) + arg1);
        class141 var5 = (class141) class42.field970.method332((byte) -79, var3);
        if (var5 != null) {
            class37.field831.method1229(true, var5);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Z")
    public final boolean method1162(byte arg0, int arg1) {
        if (arg0 != -103) {
            field3537 = null;
        }
        field3533++;
        return this.field3547[arg1].field2335;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static void method1163(int arg0) {
        field3536 = null;
        field3539 = null;
        if (arg0 != -16864) {
            method1160(null, (byte) 107, null);
        }
        field3537 = null;
        field3535 = null;
        field3546 = null;
        field3545 = null;
        field3542 = null;
        field3543 = null;
        field3531 = null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lla;Lla;IZ)V")
    public class155(class77 arg0, class77 arg1, int arg2, boolean arg3) {
        class152 var5 = new class152();
        int var6 = arg0.method578(arg2, 0);
        this.field3547 = new class96[var6];
        int[] var7 = arg0.method577(arg2, 103);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class46 var9 = null;
            byte[] var10 = arg0.method585(arg2, 124, var7[var8]);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class46 var12 = (class46) var5.method1138(25852); var12 != null; var12 = (class46) var5.method1142(1)) {
                if (var12.field1058 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method576(-1, 0, var11);
                } else {
                    var13 = arg1.method576(-1, var11, 0);
                }
                var9 = new class46(var11, var13);
                var5.method1136(var9, false);
            }
            this.field3547[var7[var8]] = new class96(var10, var9);
        }
    }
}
