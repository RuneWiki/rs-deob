import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class157 extends class132 {

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Z")
    public static volatile boolean field2809 = true;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lh;")
    public static class69 field2806 = new class69();

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[[[Lh;")
    public static class69[][][] field2813 = new class69[4][104][104];

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Z")
    public static boolean field2817 = false;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Ltg;")
    public static class184 field2818 = class135.method812("RuneScape wurde aktualisiert(Q", 3);

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "[I")
    public static int[] field2819 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "[[B")
    public static byte[][] field2821 = new byte[250][];

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "Ltg;")
    private static class184 field2815 = class135.method812("level)2", 3);

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Ltg;")
    public static class184 field2812 = field2815;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Lna;")
    public static class124 field2814;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Ltg;")
    public class184 field2807;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lwf;")
    public static class210 field2820;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILde;)V")
    public static final void method949(int arg0, class35 arg1) {
        arg1.field648 = false;
        field2811++;
        if (arg1.field655 != -1) {
            class188 var2 = class83.method465(arg1.field655, -1);
            if (var2 == null || var2.field3645 == null) {
                arg1.field655 = -1;
            } else {
                arg1.field666++;
                if (arg1.field643 < var2.field3645.length && arg1.field666 > var2.field3638[arg1.field643]) {
                    arg1.field666 = 1;
                    arg1.field643++;
                    class133.method803(var2, class46.field872 == arg1, arg1.field614, arg1.field635, true, arg1.field643);
                }
                if (var2.field3645.length <= arg1.field643) {
                    arg1.field643 = 0;
                    arg1.field666 = 0;
                    class133.method803(var2, class46.field872 == arg1, arg1.field614, arg1.field635, true, arg1.field643);
                }
            }
        }
        if (arg0 != -27578) {
            return;
        }
        if (arg1.field619 != -1 && arg1.field641 <= class161.field2903) {
            if (arg1.field660 < 0) {
                arg1.field660 = 0;
            }
            int var3 = class74.method438((byte) 120, arg1.field619).field1017;
            if (var3 == -1) {
                arg1.field619 = -1;
            } else {
                class188 var4 = class83.method465(var3, arg0 + 27577);
                if (var4 == null || var4.field3645 == null) {
                    arg1.field619 = -1;
                } else {
                    arg1.field607++;
                    if (var4.field3645.length > arg1.field660 && var4.field3638[arg1.field660] < arg1.field607) {
                        arg1.field660++;
                        arg1.field607 = 1;
                        class133.method803(var4, class46.field872 == arg1, arg1.field614, arg1.field635, true, arg1.field660);
                    }
                    if (arg1.field660 >= var4.field3645.length) {
                        arg1.field619 = -1;
                    }
                }
            }
        }
        if (arg1.field612 != -1 && arg1.field630 <= 1) {
            class188 var5 = class83.method465(arg1.field612, -1);
            if (var5.field3618 == 1 && arg1.field642 > 0 && arg1.field620 <= class161.field2903 && class161.field2903 > arg1.field632) {
                arg1.field630 = 1;
                return;
            }
        }
        if (arg1.field612 != -1 && arg1.field630 == 0) {
            class188 var6 = class83.method465(arg1.field612, -1);
            if (var6 == null || var6.field3645 == null) {
                arg1.field612 = -1;
            } else {
                arg1.field595++;
                if (arg1.field600 < var6.field3645.length && var6.field3638[arg1.field600] < arg1.field595) {
                    arg1.field600++;
                    arg1.field595 = 1;
                    class133.method803(var6, class46.field872 == arg1, arg1.field614, arg1.field635, true, arg1.field600);
                }
                if (var6.field3645.length <= arg1.field600) {
                    arg1.field600 -= var6.field3627;
                    arg1.field662++;
                    if (arg1.field662 >= var6.field3624) {
                        arg1.field612 = -1;
                    } else if (arg1.field600 >= 0 && arg1.field600 < var6.field3645.length) {
                        class133.method803(var6, class46.field872 == arg1, arg1.field614, arg1.field635, true, arg1.field600);
                    } else {
                        arg1.field612 = -1;
                    }
                }
                arg1.field648 = var6.field3650;
            }
        }
        if (arg1.field630 > 0) {
            arg1.field630--;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLaf;Z)V")
    public static final void method950(boolean arg0, class7 arg1, boolean arg2) {
        int var3 = (int) arg1.field2393;
        int var4 = arg1.field119;
        field2816++;
        arg1.method797((byte) -128);
        if (arg0) {
            class135.method817(-61440, var4);
        }
        class1.method4((byte) 41, var4);
        class167 var5 = class44.method255(var3, 10583);
        if (var5 != null) {
            class57.method305(-128, var5);
        }
        class133.field2404 = 0;
        class170.field3244 = arg2;
        class74.method439(31094, class67.field1302, class113.field2043, class125.field2256, class52.field955);
        if (class110.field1986 != -1) {
            class185.method1173(1, -107, class110.field1986);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static void method951(int arg0) {
        field2821 = null;
        if (arg0 >= -12) {
            field2819 = null;
        }
        field2818 = null;
        field2819 = null;
        field2814 = null;
        field2812 = null;
        field2813 = null;
        field2820 = null;
        field2815 = null;
        field2806 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZIIIIIIIIII)Z")
    public static final boolean method952(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg0 != 19661184) {
            field2821 = null;
        }
        field2810++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class107.field1940[var12][var36] = 0;
                class173.field3278[var12][var36] = 99999999;
            }
        }
        class107.field1940[arg6][arg8] = 99;
        class173.field3278[arg6][arg8] = 0;
        int var13 = arg6;
        int var14 = arg8;
        byte var15 = 0;
        int var16 = 0;
        class209.field4014[var15] = arg6;
        int var37 = var15 + 1;
        class98.field1837[var15] = arg8;
        int var17 = class209.field4014.length;
        int[][] var18 = class159.field2883[class47.field892].field1234;
        boolean var19 = false;
        while (var37 != var16) {
            var13 = class209.field4014[var16];
            var14 = class98.field1837[var16];
            var16 = (var16 + 1) % var17;
            if (arg7 == var13 && arg9 == var14) {
                var19 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class159.field2883[class47.field892].method372(arg9, arg3, var14, arg10 - 1, var13, arg7, arg0 - 19661277)) {
                    var19 = true;
                    break;
                }
                if (arg10 < 10 && class159.field2883[class47.field892].method374(var14, var13, arg9, arg3, arg7, arg10 - 1, arg0 ^ 0x12C01F9)) {
                    var19 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg5 != 0 && class159.field2883[class47.field892].method382(arg7, -26754, arg9, var14, arg5, arg2, arg11, var13)) {
                var19 = true;
                break;
            }
            int var35 = class173.field3278[var13][var14] + 1;
            if (var13 > 0 && class107.field1940[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class209.field4014[var37] = var13 - 1;
                class98.field1837[var37] = var14;
                var37 = (var37 + 1) % var17;
                class107.field1940[var13 - 1][var14] = 2;
                class173.field3278[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class107.field1940[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class209.field4014[var37] = var13 + 1;
                class98.field1837[var37] = var14;
                class107.field1940[var13 + 1][var14] = 8;
                class173.field3278[var13 + 1][var14] = var35;
                var37 = (var37 + 1) % var17;
            }
            if (var14 > 0 && class107.field1940[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class209.field4014[var37] = var13;
                class98.field1837[var37] = var14 - 1;
                class107.field1940[var13][var14 - 1] = 1;
                var37 = (var37 + 1) % var17;
                class173.field3278[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class107.field1940[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class209.field4014[var37] = var13;
                class98.field1837[var37] = var14 + 1;
                class107.field1940[var13][var14 + 1] = 4;
                var37 = (var37 + 1) % var17;
                class173.field3278[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class107.field1940[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class209.field4014[var37] = var13 - 1;
                class98.field1837[var37] = var14 - 1;
                var37 = (var37 + 1) % var17;
                class107.field1940[var13 - 1][var14 - 1] = 3;
                class173.field3278[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class107.field1940[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class209.field4014[var37] = var13 + 1;
                class98.field1837[var37] = var14 - 1;
                class107.field1940[var13 + 1][var14 - 1] = 9;
                class173.field3278[var13 + 1][var14 - 1] = var35;
                var37 = (var37 + 1) % var17;
            }
            if (var13 > 0 && var14 < 103 && class107.field1940[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class209.field4014[var37] = var13 - 1;
                class98.field1837[var37] = var14 + 1;
                class107.field1940[var13 - 1][var14 + 1] = 6;
                var37 = (var37 + 1) % var17;
                class173.field3278[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class107.field1940[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class209.field4014[var37] = var13 + 1;
                class98.field1837[var37] = var14 + 1;
                var37 = (var37 + 1) % var17;
                class107.field1940[var13 + 1][var14 + 1] = 12;
                class173.field3278[var13 + 1][var14 + 1] = var35;
            }
        }
        class40.field753 = 0;
        if (!var19) {
            if (!arg1) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg7 - var22; var23 <= arg7 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class173.field3278[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg9 > var24) {
                            var25 = arg9 - var24;
                        } else if (var24 > arg9 + arg5 - 1) {
                            var25 = var24 + 1 - arg9 - arg5;
                        }
                        int var26 = 0;
                        if (arg7 > var23) {
                            var26 = arg7 - var23;
                        } else if (var23 > arg2 + arg7 - 1) {
                            var26 = var23 + 1 - arg2 - arg7;
                        }
                        int var27 = var26 * var26 + var25 * var25;
                        if (var20 > var27 || var20 == var27 && var21 > class173.field3278[var23][var24]) {
                            var13 = var23;
                            var20 = var27;
                            var21 = class173.field3278[var23][var24];
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg8 == var14) {
                return false;
            }
            class40.field753 = 1;
        }
        byte var28 = 0;
        class209.field4014[var28] = var13;
        int var38 = var28 + 1;
        class98.field1837[var28] = var14;
        int var29;
        int var30 = var29 = class107.field1940[var13][var14];
        while (arg6 != var13 || arg8 != var14) {
            if (var29 != var30) {
                class209.field4014[var38] = var13;
                var29 = var30;
                class98.field1837[var38++] = var14;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class107.field1940[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class209.field4014[var38];
            int var33 = class98.field1837[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            if (arg4 == 0) {
                class117.field2122.method106(179, -19);
                class117.field2122.method583((byte) 14, var31 + var31 + 3);
                class83.field1488++;
            }
            if (arg4 == 1) {
                class14.field263++;
                class117.field2122.method106(234, arg0 - 19661110);
                class117.field2122.method583((byte) 14, var31 + var31 + 17);
            }
            if (arg4 == 2) {
                class117.field2122.method106(76, -117);
                class117.field2122.method583((byte) 14, var31 + var31 + 3);
                class66.field1260++;
            }
            class153.field2741 = class98.field1837[0];
            class40.field751 = class209.field4014[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class117.field2122.method583((byte) 14, class209.field4014[var38] - var32);
                class117.field2122.method592(110, class98.field1837[var38] - var33);
            }
            class117.field2122.method570(-601443768, class57.field1020 + var32);
            class117.field2122.method583((byte) 14, class120.field2163[82] ? 1 : 0);
            class117.field2122.method573(-124, class129.field2331 + var33);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
