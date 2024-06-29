import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class45 extends class153 {

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Lda;")
    public static class275 field756 = class255.method1672(110, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lda;")
    private static class275 field752 = class255.method1672(122, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Lda;")
    public static class275 field753 = field752;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Lfd;")
    public static class229 field754 = null;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "Z")
    public static boolean field760 = true;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
    public static void method266(byte arg0) {
        int var1 = 80 % ((arg0 - 63) / 45);
        field754 = null;
        field753 = null;
        field752 = null;
        field756 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lma;IBI)Lkb;")
    public static final class259 method267(class105 arg0, int arg1, byte arg2, int arg3) {
        field757++;
        if (arg2 == -85) {
            return class210.method1353(arg1, arg0, arg3, (byte) -106) ? class122.method890(1340077356) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBIILfd;)V")
    public static final void method268(int arg0, byte arg1, int arg2, int arg3, class229 arg4) {
        field759++;
        class160.method1116(true);
        if (arg1 > -59) {
            return;
        }
        class47.method297(arg2, arg3, arg4.field3885 + arg2, arg4.field3980 + arg3);
        if (class120.field2165 == 2 || class120.field2165 == 5 || class213.field3633 == null) {
            class47.method290(arg2, arg3, 0, arg4.field3938, arg4.field3961);
        } else {
            int var5 = class218.field3699 + class169.field2938 & 0x7FF;
            int var6 = class66.field1094.field1770 / 32 + 48;
            int var7 = 464 - (class66.field1094.field1758 / 32);
            ((class259) class213.field3633).method723(arg2, arg3, arg4.field3885, arg4.field3980, var6, var7, var5, class188.field3254 + 256, arg4.field3938, arg4.field3961);
            if (class142.field2504 != null) {
                for (int var8 = 0; var8 < class142.field2504.field1059; var8++) {
                    if (class142.field2504.method441(19332, var8)) {
                        int var9 = (class142.field2504.field1069[var8] - class234.field4083) * 4 + 2 - (class66.field1094.field1758 / 32);
                        int var10 = (class142.field2504.field1068[var8] - class16.field237) * 4 + 2 - (class66.field1094.field1770 / 32);
                        int var11 = class223.field3769[var5];
                        int var12 = var11 * 256 / (class188.field3254 + 256);
                        int var13 = class223.field3760[var5];
                        int var14 = var13 * 256 / (class188.field3254 + 256);
                        int var15 = var9 * var12 + (var10 * var14) >> 16;
                        int var16 = var9 * var14 - (var10 * var12) >> 16;
                        class21 var17 = class5.field73;
                        if (class142.field2504.method443((byte) 37, var8) == 1) {
                            var17 = class99.field1666;
                        }
                        if (class142.field2504.method443((byte) 37, var8) == 2) {
                            var17 = class93.field1599;
                        }
                        int var18 = var17.method129(class142.field2504.field1061[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= (-arg4.field3885) && var19 <= arg4.field3885 && (-arg4.field3980) <= var16 && arg4.field3980 >= var16) {
                            int var20 = 16777215;
                            if (class142.field2504.field1063[var8] != -1) {
                                var20 = class142.field2504.field1063[var8];
                            }
                            class47.method289(arg4.field3938, arg4.field3961);
                            var17.method125(class142.field2504.field1061[var8], var19 + (arg4.field3885 / 2) + arg2, arg4.field3980 / 2 + -var16 + arg3, var18, 50, var20, 0, 256, 1, 0, 0);
                            class47.method292();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class149.field2601; var21++) {
                int var56 = class93.field1598[var21] * 4 + 2 - (class66.field1094.field1770 / 32);
                int var57 = class92.field1565[var21] * 4 + 2 - (class66.field1094.field1758 / 32);
                class34 var58 = class146.method1040(101, class241.field4227[var21]);
                if (var58.field528 != null) {
                    var58 = var58.method203(-127);
                    if (var58 == null || var58.field509 == -1) {
                        continue;
                    }
                }
                class14.method72(arg2, class149.field2602[var58.field509], var57, var56, 75, arg4, arg3);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class84 var53 = class118.field2122[class159.field2790][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class66.field1094.field1770 / 32);
                        int var55 = var52 * 4 + 2 - (class66.field1094.field1758 / 32);
                        class14.method72(arg2, class234.field4091[0], var55, var54, 75, arg4, arg3);
                    }
                }
            }
            for (int var23 = 0; var23 < class181.field3118; var23++) {
                class165 var48 = class31.field478[class228.field3851[var23]];
                if (var48 != null && var48.method747(1529241680)) {
                    class23 var49 = var48.field2873;
                    if (var49 != null && var49.field406 != null) {
                        var49 = var49.method140(1);
                    }
                    if (var49 != null && var49.field344 && var49.field402) {
                        int var50 = var48.field1758 / 32 - (class66.field1094.field1758 / 32);
                        int var51 = var48.field1770 / 32 - (class66.field1094.field1770 / 32);
                        class14.method72(arg2, class234.field4091[1], var50, var51, 75, arg4, arg3);
                    }
                }
            }
            for (int var24 = 0; var24 < class32.field486; var24++) {
                class109 var38 = class16.field238[class149.field2595[var24]];
                if (var38 != null && var38.method747(1529241680)) {
                    int var39 = var38.field1770 / 32 - class66.field1094.field1770 / 32;
                    int var40 = var38.field1758 / 32 - (class66.field1094.field1758 / 32);
                    boolean var41 = false;
                    long var42 = var38.field1910.method1833(0);
                    for (int var44 = 0; var44 < class63.field1053; var44++) {
                        if (class135.field2393[var44] == var42 && class102.field1694[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class225.field3816; var46++) {
                        if (class74.field1224[var46].field1707 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class66.field1094.field1903 != 0 && var38.field1903 != 0 && class66.field1094.field1903 == var38.field1903) {
                        var47 = true;
                    }
                    if (var41) {
                        class14.method72(arg2, class234.field4091[3], var40, var39, 75, arg4, arg3);
                    } else if (var45) {
                        class14.method72(arg2, class234.field4091[5], var40, var39, 75, arg4, arg3);
                    } else if (var47) {
                        class14.method72(arg2, class234.field4091[4], var40, var39, 75, arg4, arg3);
                    } else {
                        class14.method72(arg2, class234.field4091[2], var40, var39, 75, arg4, arg3);
                    }
                }
            }
            int var25 = 0;
            class9[] var26 = class114.field2014;
            while (var26.length > var25) {
                class9 var29 = var26[var25];
                if (var29 != null && var29.field135 != 0 && class35.field576 % 20 < 10) {
                    if (var29.field135 == 1 && var29.field140 >= 0 && class31.field478.length > var29.field140) {
                        class165 var30 = class31.field478[var29.field140];
                        if (var30 != null) {
                            int var31 = var30.field1758 / 32 - (class66.field1094.field1758 / 32);
                            int var32 = var30.field1770 / 32 - (class66.field1094.field1770 / 32);
                            class160.method1121(var31, arg4, var32, arg2, var29.field138, 256, arg3);
                        }
                    }
                    if (var29.field135 == 2) {
                        int var33 = (var29.field141 - class234.field4083) * 4 + (2 - class66.field1094.field1758 / 32);
                        int var34 = (var29.field133 - class16.field237) * 4 + 2 - (class66.field1094.field1770 / 32);
                        class160.method1121(var33, arg4, var34, arg2, var29.field138, 256, arg3);
                    }
                    if (var29.field135 == 10 && var29.field140 >= 0 && var29.field140 < class16.field238.length) {
                        class109 var35 = class16.field238[var29.field140];
                        if (var35 != null) {
                            int var36 = var35.field1770 / 32 - class66.field1094.field1770 / 32;
                            int var37 = var35.field1758 / 32 - (class66.field1094.field1758 / 32);
                            class160.method1121(var37, arg4, var36, arg2, var29.field138, 256, arg3);
                        }
                    }
                }
                var25++;
            }
            if (class220.field3746 != 0) {
                int var27 = class220.field3746 * 4 + 2 - class66.field1094.field1770 / 32;
                int var28 = class108.field1878 * 4 + 2 - class66.field1094.field1758 / 32;
                class14.method72(arg2, class67.field1095, var28, var27, 75, arg4, arg3);
            }
            class47.method299(arg4.field3885 / 2 + arg2 - 1, arg4.field3980 / 2 + -1 + arg3, 3, 3, 16777215);
        }
        class100.field1691[arg0] = true;
    }
}
