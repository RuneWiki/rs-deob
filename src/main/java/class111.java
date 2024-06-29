import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class111 extends class129 {

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lmc;")
    public static class75 field2813 = class30.method234(true, "logo");

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lmc;")
    public static class75 field2814 = class30.method234(true, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Lqc;")
    public static class99 field2804 = new class99();

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "Lmc;")
    public static class75 field2818 = class30.method234(true, "leuchten2:");

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lmc;")
    public static class75 field2820 = class30.method234(true, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "Lkc;")
    public static class63 field2819 = new class63(64);

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "Lnc;")
    public static class81 field2821;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method902(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 103) {
            return;
        }
        for (int var5 = arg0; var5 <= arg0 + arg3; var5++) {
            for (int var6 = arg4; var6 <= arg4 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class63.field1676[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class15.field280[0][var6][var5] = class15.field280[0][var6 - 1][var5];
                    }
                    if (arg2 + arg4 == var6 && var6 < 103) {
                        class15.field280[0][var6][var5] = class15.field280[0][var6 + 1][var5];
                    }
                    if (arg0 == var5 && var5 > 0) {
                        class15.field280[0][var6][var5] = class15.field280[0][var6][var5 - 1];
                    }
                    if (arg0 + arg3 == var5 && var5 < 103) {
                        class15.field280[0][var6][var5] = class15.field280[0][var6][var5 + 1];
                    }
                }
            }
        }
        field2811++;
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V", line = 58)
    public static void method903(int arg0) {
        field2818 = null;
        field2804 = null;
        field2819 = null;
        field2813 = null;
        field2814 = null;
        field2821 = null;
        if (arg0 == 32384) {
            field2820 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILka;I)V", line = 77)
    private final void method904(int arg0, class61 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field2817 = arg1.method507((byte) -70);
            this.field2807 = arg1.method494(20471);
            this.field2812 = arg1.method494(arg2 + 20470);
        }
        field2816++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLka;)V", line = 96)
    public final void method905(boolean arg0, class61 arg1) {
        field2815++;
        while (true) {
            int var3 = arg1.method494(20471);
            if (var3 == 0) {
                if (arg0) {
                    this.field2812 = 92;
                    return;
                } else {
                    return;
                }
            }
            this.method904(var3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIIIIIZIIIII)Z", line = 126)
    public static final boolean method906(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2803++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class96.field2434[var12][var36] = 0;
                class75.field1882[var12][var36] = 99999999;
            }
        }
        int var13 = arg10;
        class96.field2434[arg10][arg8] = 99;
        class75.field1882[arg10][arg8] = 0;
        int var14 = 0;
        boolean var15 = false;
        int var16 = arg8;
        byte var17 = 0;
        if (arg0 < 11) {
            method903(-24);
        }
        class52.field1301[var17] = arg10;
        int var37 = var17 + 1;
        class64.field1696[var17] = arg8;
        int[][] var18 = class110.field2783[class99.field2510].field121;
        int var19 = class52.field1301.length;
        while (var14 != var37) {
            var16 = class64.field1696[var14];
            var13 = class52.field1301[var14];
            var14 = (var14 + 1) % var19;
            if (arg3 == var13 && arg11 == var16) {
                var15 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class110.field2783[class99.field2510].method41(arg1, (byte) -127, arg2 - 1, arg3, var13, arg11, var16)) {
                    var15 = true;
                    break;
                }
                if (arg2 < 10 && class110.field2783[class99.field2510].method52(arg11, arg1, arg3, var13, var16, (byte) -76, arg2 - 1)) {
                    var15 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg9 != 0 && class110.field2783[class99.field2510].method47(var16, arg4, arg11, arg9, arg5, var13, (byte) -100, arg3)) {
                var15 = true;
                break;
            }
            int var35 = class75.field1882[var13][var16] + 1;
            if (var13 > 0 && class96.field2434[var13 - 1][var16] == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0) {
                class52.field1301[var37] = var13 - 1;
                class64.field1696[var37] = var16;
                class96.field2434[var13 - 1][var16] = 2;
                var37 = (var37 + 1) % var19;
                class75.field1882[var13 - 1][var16] = var35;
            }
            if (var13 < 103 && class96.field2434[var13 + 1][var16] == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0) {
                class52.field1301[var37] = var13 + 1;
                class64.field1696[var37] = var16;
                var37 = (var37 + 1) % var19;
                class96.field2434[var13 + 1][var16] = 8;
                class75.field1882[var13 + 1][var16] = var35;
            }
            if (var16 > 0 && class96.field2434[var13][var16 - 1] == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class52.field1301[var37] = var13;
                class64.field1696[var37] = var16 - 1;
                var37 = (var37 + 1) % var19;
                class96.field2434[var13][var16 - 1] = 1;
                class75.field1882[var13][var16 - 1] = var35;
            }
            if (var16 < 103 && class96.field2434[var13][var16 + 1] == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class52.field1301[var37] = var13;
                class64.field1696[var37] = var16 + 1;
                var37 = (var37 + 1) % var19;
                class96.field2434[var13][var16 + 1] = 4;
                class75.field1882[var13][var16 + 1] = var35;
            }
            if (var13 > 0 && var16 > 0 && class96.field2434[var13 - 1][var16 - 1] == 0 && (var18[var13 - 1][var16 - 1] & 0x128010E) == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class52.field1301[var37] = var13 - 1;
                class64.field1696[var37] = var16 - 1;
                class96.field2434[var13 - 1][var16 - 1] = 3;
                class75.field1882[var13 - 1][var16 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var16 > 0 && class96.field2434[var13 + 1][var16 - 1] == 0 && (var18[var13 + 1][var16 - 1] & 0x1280183) == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class52.field1301[var37] = var13 + 1;
                class64.field1696[var37] = var16 - 1;
                var37 = (var37 + 1) % var19;
                class96.field2434[var13 + 1][var16 - 1] = 9;
                class75.field1882[var13 + 1][var16 - 1] = var35;
            }
            if (var13 > 0 && var16 < 103 && class96.field2434[var13 - 1][var16 + 1] == 0 && (var18[var13 - 1][var16 + 1] & 0x1280138) == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class52.field1301[var37] = var13 - 1;
                class64.field1696[var37] = var16 + 1;
                var37 = (var37 + 1) % var19;
                class96.field2434[var13 - 1][var16 + 1] = 6;
                class75.field1882[var13 - 1][var16 + 1] = var35;
            }
            if (var13 < 103 && var16 < 103 && class96.field2434[var13 + 1][var16 + 1] == 0 && (var18[var13 + 1][var16 + 1] & 0x12801E0) == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class52.field1301[var37] = var13 + 1;
                class64.field1696[var37] = var16 + 1;
                class96.field2434[var13 + 1][var16 + 1] = 12;
                var37 = (var37 + 1) % var19;
                class75.field1882[var13 + 1][var16 + 1] = var35;
            }
        }
        class68.field1746 = 0;
        if (!var15) {
            if (!arg6) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg3 - var22; var23 <= arg3 + var22; var23++) {
                for (int var24 = arg11 - var22; var24 <= arg11 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class75.field1882[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var23 < arg3) {
                            var25 = arg3 - var23;
                        } else if (arg3 + arg4 - 1 < var23) {
                            var25 = var23 + 1 - arg3 - arg4;
                        }
                        if (arg11 > var24) {
                            var26 = arg11 - var24;
                        } else if (var24 > arg9 + arg11 - 1) {
                            var26 = var24 + 1 - arg9 - arg11;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class75.field1882[var23][var24] < var21) {
                            var20 = var27;
                            var21 = class75.field1882[var23][var24];
                            var16 = var24;
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var13 && arg8 == var16) {
                return false;
            }
            class68.field1746 = 1;
        }
        byte var28 = 0;
        class52.field1301[var28] = var13;
        int var38 = var28 + 1;
        class64.field1696[var28] = var16;
        int var29;
        int var30 = var29 = class96.field2434[var13][var16];
        while (arg10 != var13 || arg8 != var16) {
            if (var29 != var30) {
                var29 = var30;
                class52.field1301[var38] = var13;
                class64.field1696[var38++] = var16;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var16++;
            } else if ((var30 & 0x4) != 0) {
                var16--;
            }
            var30 = class96.field2434[var13][var16];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class52.field1301[var38];
            int var33 = class64.field1696[var38];
            if (arg7 == 0) {
                class110.field2789++;
                class118.field2923.method707(60, 105);
                class118.field2923.method493((byte) 88, var31 + var31 + 3);
            }
            if (arg7 == 1) {
                class129.field3138++;
                class118.field2923.method707(65, 211);
                class118.field2923.method493((byte) 88, var31 + var31 + 3 + 14);
            }
            if (arg7 == 2) {
                class61.field1559++;
                class118.field2923.method707(19, 95);
                class118.field2923.method493((byte) 88, var31 + var31 + 3);
            }
            class74.field1853 = class52.field1301[0];
            class37.field892 = class64.field1696[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class118.field2923.method508(class52.field1301[var38] - var32, 128);
                class118.field2923.method529(-128, class64.field1696[var38] - var33);
            }
            class118.field2923.method530(var32 + class62.field1618, 127);
            class118.field2923.method508(class71.field1810[82] ? 1 : 0, 128);
            class118.field2923.method530(class55.field1367 + var33, 122);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
