import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class38 extends class249 {

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public int field666 = 0;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "J")
    public static long field645 = 0L;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "Z")
    public static volatile boolean field670 = false;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Lrc;")
    public class196 field652;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lvi;")
    public class197 field642;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Lff;")
    public static class3 field648;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Lwk;")
    public class47 field669;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Lik;")
    public class72 field667;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "Lik;")
    public class72 field671;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "Z")
    public boolean field660;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "[I")
    public int[] field662;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "[Lrf;")
    public static class30[] field655;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[[[B")
    public static byte[][][] field653;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    public static final void method298(int arg0, int arg1) {
        if (arg1 == -1 && !class119.field2213) {
            class83.method582((byte) -123);
        } else if (arg1 != -1 && (class163.field2897 != arg1 || !class181.method1279(84)) && class92.field1525 != 0 && !class119.field2213) {
            class277.method1875(class181.field3155, 0, arg1, class92.field1525, 2, false, -67);
        }
        if (arg0 == 0) {
            field657++;
            class163.field2897 = arg1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I")
    public static final int method299(int arg0, int arg1, int arg2) {
        field650++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        if (arg0 != 25069) {
            field670 = true;
        }
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (var5 & 0x7F80760) >> 19;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method300(int arg0) {
        int var2 = this.field649;
        if (this.field652 != null) {
            class196 var3 = this.field652.method1377((byte) 31);
            if (var3 == null) {
                this.field662 = null;
                this.field658 = 0;
                this.field668 = 0;
                this.field659 = 0;
                this.field649 = -1;
            } else {
                this.field658 = var3.field3417;
                this.field649 = var3.field3403;
                this.field662 = var3.field3389;
                this.field659 = var3.field3409 * 128;
                this.field668 = var3.field3366;
            }
        } else if (this.field642 != null) {
            int var4 = class27.method180((byte) 122, this.field642);
            if (var2 != var4) {
                this.field649 = var4;
                class229 var5 = this.field642.field3436;
                if (var5.field3926 != null) {
                    var5 = var5.method1560((byte) -74);
                }
                if (var5 == null) {
                    this.field659 = 0;
                } else {
                    this.field659 = var5.field3893 * 128;
                }
            }
        } else if (this.field669 != null) {
            this.field649 = class134.method1003(this.field669, -64);
            this.field659 = this.field669.field825 * 128;
        }
        if (this.field649 != var2 && this.field671 != null) {
            class120.field2228.method1550(this.field671);
            this.field671 = null;
        }
        if (arg0 != 13611) {
            method302(-115);
        }
        field664++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field654++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class2.field20[var12][var31] = 0;
                class90.field1495[var12][var31] = 99999999;
            }
        }
        int var13 = arg5;
        byte var14 = 0;
        class2.field20[arg7][arg5] = 99;
        int var15 = 0;
        boolean var16 = false;
        int var17 = arg7;
        class90.field1495[arg7][arg5] = 0;
        class19.field318[var14] = arg7;
        int var32 = var14 + 1;
        class222.field3799[var14] = arg5;
        if (arg11 <= 91) {
            method299(-42, -64, 34);
        }
        int[][] var18 = class62.field1064[class216.field3712].field3566;
        while (var32 != var15) {
            var13 = class222.field3799[var15];
            var17 = class19.field318[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg2 == var17 && arg1 == var13) {
                var16 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class62.field1064[class216.field3712].method1437(1, var17, arg0 - 1, arg1, 1, var13, arg3, arg2)) {
                    var16 = true;
                    break;
                }
                if (arg0 < 10 && class62.field1064[class216.field3712].method1435(var13, var17, arg1, 6831, 1, arg2, arg3, arg0 - 1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg9 != 0 && class62.field1064[class216.field3712].method1440(arg1, 1, var13, arg9, arg4, arg8, var17, arg2, 1)) {
                var16 = true;
                break;
            }
            int var30 = class90.field1495[var17][var13] + 1;
            if (var17 > 0 && class2.field20[var17 - 1][var13] == 0 && (var18[var17 - 1][var13] & 0x12C0108) == 0) {
                class19.field318[var32] = var17 - 1;
                class222.field3799[var32] = var13;
                class2.field20[var17 - 1][var13] = 2;
                var32 = var32 + 1 & 0xFFF;
                class90.field1495[var17 - 1][var13] = var30;
            }
            if (var17 < 103 && class2.field20[var17 + 1][var13] == 0 && (var18[var17 + 1][var13] & 0x12C0180) == 0) {
                class19.field318[var32] = var17 + 1;
                class222.field3799[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class2.field20[var17 + 1][var13] = 8;
                class90.field1495[var17 + 1][var13] = var30;
            }
            if (var13 > 0 && class2.field20[var17][var13 - 1] == 0 && (var18[var17][var13 - 1] & 0x12C0102) == 0) {
                class19.field318[var32] = var17;
                class222.field3799[var32] = var13 - 1;
                class2.field20[var17][var13 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class90.field1495[var17][var13 - 1] = var30;
            }
            if (var13 < 103 && class2.field20[var17][var13 + 1] == 0 && (var18[var17][var13 + 1] & 0x12C0120) == 0) {
                class19.field318[var32] = var17;
                class222.field3799[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class2.field20[var17][var13 + 1] = 4;
                class90.field1495[var17][var13 + 1] = var30;
            }
            if (var17 > 0 && var13 > 0 && class2.field20[var17 - 1][var13 - 1] == 0 && (var18[var17 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var17 - 1][var13] & 0x12C0108) == 0 && (var18[var17][var13 - 1] & 0x12C0102) == 0) {
                class19.field318[var32] = var17 - 1;
                class222.field3799[var32] = var13 - 1;
                class2.field20[var17 - 1][var13 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class90.field1495[var17 - 1][var13 - 1] = var30;
            }
            if (var17 < 103 && var13 > 0 && class2.field20[var17 + 1][var13 - 1] == 0 && (var18[var17 + 1][var13 - 1] & 0x12C0183) == 0 && (var18[var17 + 1][var13] & 0x12C0180) == 0 && (var18[var17][var13 - 1] & 0x12C0102) == 0) {
                class19.field318[var32] = var17 + 1;
                class222.field3799[var32] = var13 - 1;
                class2.field20[var17 + 1][var13 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class90.field1495[var17 + 1][var13 - 1] = var30;
            }
            if (var17 > 0 && var13 < 103 && class2.field20[var17 - 1][var13 + 1] == 0 && (var18[var17 - 1][var13 + 1] & 0x12C0138) == 0 && (var18[var17 - 1][var13] & 0x12C0108) == 0 && (var18[var17][var13 + 1] & 0x12C0120) == 0) {
                class19.field318[var32] = var17 - 1;
                class222.field3799[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class2.field20[var17 - 1][var13 + 1] = 6;
                class90.field1495[var17 - 1][var13 + 1] = var30;
            }
            if (var17 < 103 && var13 < 103 && class2.field20[var17 + 1][var13 + 1] == 0 && (var18[var17 + 1][var13 + 1] & 0x12C01E0) == 0 && (var18[var17 + 1][var13] & 0x12C0180) == 0 && (var18[var17][var13 + 1] & 0x12C0120) == 0) {
                class19.field318[var32] = var17 + 1;
                class222.field3799[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class2.field20[var17 + 1][var13 + 1] = 12;
                class90.field1495[var17 + 1][var13 + 1] = var30;
            }
        }
        client.field1983 = 0;
        if (!var16) {
            if (!arg10) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg2 - var21; var22 <= (arg2 + var21); var22++) {
                for (int var23 = arg1 - var21; var23 <= (arg1 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class90.field1495[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var23 < arg1) {
                            var25 = arg1 - var23;
                        } else if (arg1 + arg9 - 1 < var23) {
                            var25 = var23 + 1 - arg9 - arg1;
                        }
                        if (arg2 > var22) {
                            var24 = arg2 - var22;
                        } else if (var22 > (arg2 - (1 - arg8))) {
                            var24 = var22 + 1 - arg2 - arg8;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var20 > var26 || var20 == var26 && var19 > class90.field1495[var22][var23]) {
                            var19 = class90.field1495[var22][var23];
                            var13 = var23;
                            var17 = var22;
                            var20 = var26;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg7 == var17 && arg5 == var13) {
                return false;
            }
            client.field1983 = 1;
        }
        byte var27 = 0;
        class19.field318[var27] = var17;
        int var33 = var27 + 1;
        class222.field3799[var27] = var13;
        int var28;
        int var29 = var28 = class2.field20[var17][var13];
        while (arg7 != var17 || arg5 != var13) {
            if (var28 != var29) {
                var28 = var29;
                class19.field318[var33] = var17;
                class222.field3799[var33++] = var13;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            if ((var29 & 0x2) != 0) {
                var17++;
            } else if ((var29 & 0x8) != 0) {
                var17--;
            }
            var29 = class2.field20[var17][var13];
        }
        if (var33 > 0) {
            class276.method1872(-28, var33, arg6);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public static void method302(int arg0) {
        field653 = null;
        field655 = null;
        if (arg0 != 0) {
            method302(69);
        }
        field648 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field665++;
        if (arg2 != 3) {
            method303(-103, 64, 65, 119, -51, -27, -109, -97, 103, 50);
        }
        if (arg3 == arg9 && arg1 == arg4 && arg5 == arg8 && arg0 == arg6) {
            class203.method1417(arg4, arg5, arg3, -71, arg6, arg7);
            return;
        }
        int var10 = arg4;
        int var11 = arg3;
        int var12 = arg3 * 3;
        int var13 = arg4 * 3;
        int var14 = arg1 * 3;
        int var15 = arg9 * 3;
        int var16 = arg8 * 3;
        int var17 = arg5 - (var16 - var15) - arg3;
        int var18 = var12 + var16 - var15 - var15;
        int var19 = var15 - var12;
        int var20 = var14 - var13;
        int var21 = arg0 * 3;
        int var22 = var21 - var14 - (var14 - var13);
        int var23 = var14 + arg6 - arg4 - var21;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var17 * var26;
            int var28 = var23 * var26;
            int var29 = var18 * var25;
            int var30 = var22 * var25;
            int var31 = var19 * var24;
            int var32 = (var27 + var29 + var31 >> 12) + arg3;
            int var33 = var20 * var24;
            int var34 = (var30 + var33 + var28 >> 12) + arg4;
            class203.method1417(var10, var32, var11, -91, var34, arg7);
            var11 = var32;
            var10 = var34;
        }
    }
}
