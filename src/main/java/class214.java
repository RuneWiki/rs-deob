import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class214 extends class32 {

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Z")
    public boolean field3786 = true;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Lqk;")
    public static class207 field3803 = class24.method212(255, "blaugr-Un:");

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lqk;")
    private static class207 field3801 = class24.method212(255, "Allocated memory");

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lqk;")
    public static class207 field3794 = class24.method212(255, "Fps:");

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Lqk;")
    public static class207 field3787 = field3801;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lqk;")
    public static class207 field3807 = class24.method212(255, "_labels");

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lqk;")
    private static class207 field3796 = class24.method212(255, "wave:");

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lqk;")
    public static class207 field3800 = field3796;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Lqk;")
    public static class207 field3784 = field3796;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "Z")
    public static boolean field3808;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "[I")
    private int[] field3798;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "[I")
    public int[] field3811;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "[Lqk;")
    private class207[] field3788;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "[[I")
    private int[][] field3802;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    public static void method1520(int arg0) {
        if (arg0 < 110) {
            field3796 = null;
        }
        field3801 = null;
        field3803 = null;
        field3807 = null;
        field3794 = null;
        field3784 = null;
        field3787 = null;
        field3800 = null;
        field3796 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lv;II)V")
    private final void method1521(class149 arg0, int arg1, int arg2) {
        if (arg2 <= 77) {
            return;
        }
        if (arg1 == 1) {
            this.field3788 = arg0.method1034(-27220).method1445(60, 124);
        } else if (arg1 == 2) {
            int var8 = arg0.method1045((byte) -106);
            this.field3811 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3811[var9] = arg0.method1050(1272006568);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1045((byte) -105);
            this.field3802 = new int[var4][];
            this.field3798 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1050(1272006568);
                this.field3798[var5] = var6;
                this.field3802[var5] = new int[class200.field3508[var6]];
                for (int var7 = 0; var7 < class200.field3508[var6]; var7++) {
                    this.field3802[var5][var7] = arg0.method1050(1272006568);
                }
            }
        } else if (arg1 == 4) {
            this.field3786 = false;
        }
        field3810++;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public final void method1522(int arg0) {
        if (arg0 != 32768) {
            return;
        }
        field3804++;
        if (this.field3811 != null) {
            for (int var2 = 0; var2 < this.field3811.length; var2++) {
                this.field3811[var2] = class281.method1906(this.field3811[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZIIIIBIIIII)Z")
    public static final boolean method1523(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3799++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class276.field4839[var12][var31] = 0;
                class25.field528[var12][var31] = 99999999;
            }
        }
        class276.field4839[arg9][arg8] = 99;
        int var13 = arg9;
        class25.field528[arg9][arg8] = 0;
        byte var14 = 0;
        int var15 = arg8;
        if (arg6 < 122) {
            field3807 = null;
        }
        boolean var16 = false;
        int var17 = 0;
        class19.field315[var14] = arg9;
        int var32 = var14 + 1;
        class62.field1129[var14] = arg8;
        int[][] var18 = class133.field2303[class93.field1645].field2721;
        while (var32 != var17) {
            var13 = class19.field315[var17];
            var15 = class62.field1129[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var13 && arg2 == var15) {
                var16 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class133.field2303[class93.field1645].method1133(arg5 - 1, var15, arg4, arg3, 1, arg2, false, var13)) {
                    var16 = true;
                    break;
                }
                if (arg5 < 10 && class133.field2303[class93.field1645].method1130(var15, 1, 74, arg2, var13, arg3, arg5 - 1, arg4)) {
                    var16 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg7 != 0 && class133.field2303[class93.field1645].method1126(arg7, arg2, var15, false, arg10, 1, var13, arg0, arg3)) {
                var16 = true;
                break;
            }
            int var30 = class25.field528[var13][var15] + 1;
            if (var13 > 0 && class276.field4839[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x12C0108) == 0) {
                class19.field315[var32] = var13 - 1;
                class62.field1129[var32] = var15;
                class276.field4839[var13 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class25.field528[var13 - 1][var15] = var30;
            }
            if (var13 < 103 && class276.field4839[var13 + 1][var15] == 0 && (var18[var13 + 1][var15] & 0x12C0180) == 0) {
                class19.field315[var32] = var13 + 1;
                class62.field1129[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class276.field4839[var13 + 1][var15] = 8;
                class25.field528[var13 + 1][var15] = var30;
            }
            if (var15 > 0 && class276.field4839[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x12C0102) == 0) {
                class19.field315[var32] = var13;
                class62.field1129[var32] = var15 - 1;
                class276.field4839[var13][var15 - 1] = 1;
                class25.field528[var13][var15 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 103 && class276.field4839[var13][var15 + 1] == 0 && (var18[var13][var15 + 1] & 0x12C0120) == 0) {
                class19.field315[var32] = var13;
                class62.field1129[var32] = var15 + 1;
                class276.field4839[var13][var15 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class25.field528[var13][var15 + 1] = var30;
            }
            if (var13 > 0 && var15 > 0 && class276.field4839[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var15] & 0x12C0108) == 0 && (var18[var13][var15 - 1] & 0x12C0102) == 0) {
                class19.field315[var32] = var13 - 1;
                class62.field1129[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class276.field4839[var13 - 1][var15 - 1] = 3;
                class25.field528[var13 - 1][var15 - 1] = var30;
            }
            if (var13 < 103 && var15 > 0 && class276.field4839[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var15] & 0x12C0180) == 0 && (var18[var13][var15 - 1] & 0x12C0102) == 0) {
                class19.field315[var32] = var13 + 1;
                class62.field1129[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class276.field4839[var13 + 1][var15 - 1] = 9;
                class25.field528[var13 + 1][var15 - 1] = var30;
            }
            if (var13 > 0 && var15 < 103 && class276.field4839[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var15] & 0x12C0108) == 0 && (var18[var13][var15 + 1] & 0x12C0120) == 0) {
                class19.field315[var32] = var13 - 1;
                class62.field1129[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class276.field4839[var13 - 1][var15 + 1] = 6;
                class25.field528[var13 - 1][var15 + 1] = var30;
            }
            if (var13 < 103 && var15 < 103 && class276.field4839[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var15] & 0x12C0180) == 0 && (var18[var13][var15 + 1] & 0x12C0120) == 0) {
                class19.field315[var32] = var13 + 1;
                class62.field1129[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class276.field4839[var13 + 1][var15 + 1] = 12;
                class25.field528[var13 + 1][var15 + 1] = var30;
            }
        }
        class140.field2423 = 0;
        if (!var16) {
            if (!arg1) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg3 - var21; var22 <= arg3 + var21; var22++) {
                for (int var23 = arg2 - var21; var23 <= (arg2 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class25.field528[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var23 < arg2) {
                            var25 = arg2 - var23;
                        } else if (var23 > arg2 + arg7 - 1) {
                            var25 = 1 - arg2 - (arg7 - var23);
                        }
                        if (var22 < arg3) {
                            var24 = arg3 - var22;
                        } else if (arg3 + arg10 - 1 < var22) {
                            var24 = var22 - (arg3 + arg10 - 1);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var19 > var26 || var19 == var26 && class25.field528[var22][var23] < var20) {
                            var13 = var22;
                            var19 = var26;
                            var20 = class25.field528[var22][var23];
                            var15 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg9 == var13 && arg8 == var15) {
                return false;
            }
            class140.field2423 = 1;
        }
        byte var27 = 0;
        class19.field315[var27] = var13;
        int var33 = var27 + 1;
        class62.field1129[var27] = var15;
        int var28;
        int var29 = var28 = class276.field4839[var13][var15];
        while (arg9 != var13 || arg8 != var15) {
            if (var28 != var29) {
                class19.field315[var33] = var13;
                var28 = var29;
                class62.field1129[var33++] = var15;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var15++;
            } else if ((var29 & 0x4) != 0) {
                var15--;
            }
            var29 = class276.field4839[var13][var15];
        }
        if (var33 > 0) {
            class248.method1744(var33, (byte) -107, arg11);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)I")
    public final int method1524(int arg0, int arg1, byte arg2) {
        field3790++;
        if (arg2 > -72) {
            this.method1529((byte) -33, 112);
        }
        if (this.field3798 == null || arg0 < 0 || this.field3798.length < arg0) {
            return -1;
        } else if (this.field3802[arg0] == null || arg1 < 0 || arg1 > this.field3802[arg0].length) {
            return -1;
        } else {
            return this.field3802[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)I")
    public final int method1525(int arg0) {
        field3797++;
        if (arg0 < 27) {
            return -52;
        } else if (this.field3798 == null) {
            return 0;
        } else {
            return this.field3798.length;
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
    public static final void method1526(int arg0) {
        field3795++;
        class102.field1843.method1390((byte) 109);
        if (arg0 != 0) {
            field3806 = 84;
        }
        class56.field1041.method1390((byte) 121);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lv;B)Lqk;")
    public final class207 method1527(class149 arg0, byte arg1) {
        field3793++;
        class207 var3 = class191.method1335((byte) 110, 80);
        if (arg1 != -105) {
            return null;
        }
        if (this.field3798 != null) {
            for (int var4 = 0; var4 < this.field3798.length; var4++) {
                var3.method1463(this.field3788[var4], false);
                var3.method1463(class105.method760(this.field3798[var4], arg0.method1070(class151.field2645[this.field3798[var4]], (byte) 120), this.field3802[var4], (byte) 77), false);
            }
        }
        var3.method1463(this.field3788[this.field3788.length - 1], false);
        return var3.method1438(arg1 ^ 0xFFFFFF97);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
    public static final void method1528(int arg0, boolean arg1) {
        if (arg0 != -1) {
            method1532(-99);
        }
        byte[][] var2 = class207.field3680;
        field3812++;
        int var3 = class88.field1591.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class207.field3685[var4] & 0xFF) * 64 - class180.field3231;
                int var7 = (class207.field3685[var4] >> 8) * 64 - class21.field349;
                class21.method129((byte) 8);
                class170.method1220(-1, var7, var6, arg1, var5, class133.field2303);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(BI)I")
    public final int method1529(byte arg0, int arg1) {
        if (arg0 < 83) {
            this.method1527((class149) null, (byte) 53);
        }
        field3792++;
        return this.field3798 == null || arg1 < 0 || this.field3798.length < arg1 ? -1 : this.field3798[arg1];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
    public static final int method1530(int arg0, int arg1, int arg2) {
        int var3 = class227.method1621(arg2 + 45365, arg1 + 91923, 4, 17114) - (-(class227.method1621(arg2 - -10294, arg1 + 37821, 2, 17114) + -128 >> 1) + -(class227.method1621(arg2, arg1, 1, 17114) + -128 >> 2)) - 128;
        field3785++;
        if (arg0 >= -97) {
            return 95;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lv;I)V")
    public final void method1531(class149 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1045((byte) 110);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method1531((class149) null, -10);
                }
                field3789++;
                return;
            }
            this.method1521(arg0, var3, 95);
        }
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
    public static final void method1532(int arg0) {
        field3791++;
        for (int var1 = -1; var1 < class31.field629; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class10.field149[var1];
            }
            class14 var6 = class169.field2953[var5];
            if (var6 != null && var6.field5025 > 0) {
                var6.field5025--;
                if (var6.field5025 == 0) {
                    var6.field5019 = null;
                }
            }
        }
        if (arg0 > -79) {
            method1528(96, false);
        }
        for (int var2 = 0; var2 < class138.field2390; var2++) {
            int var3 = class117.field2036[var2];
            class256 var4 = class79.field1449[var3];
            if (var4 != null && var4.field5025 > 0) {
                var4.field5025--;
                if (var4.field5025 == 0) {
                    var4.field5019 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)Lqk;")
    public final class207 method1533(int arg0) {
        if (arg0 != 32640) {
            return null;
        }
        class207 var2 = class191.method1335((byte) 100, 80);
        field3805++;
        if (this.field3788 == null) {
            return class241.field4394;
        }
        var2.method1463(this.field3788[0], false);
        for (int var3 = 1; var3 < this.field3788.length; var3++) {
            var2.method1463(class153.field2655, false);
            var2.method1463(this.field3788[var3], false);
        }
        return var2.method1438(arg0 ^ 0x7F80);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([ILv;I)V")
    public final void method1534(int[] arg0, class149 arg1, int arg2) {
        field3809++;
        if (this.field3798 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 != 24305) {
            this.method1522(27);
        }
        while (var4 < this.field3798.length) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class124.field2146[this.method1529((byte) 100, var4)];
            if (var5 > 0) {
                arg1.method1078(var5, (long) arg0[var4], true);
            }
            var4++;
        }
    }
}
