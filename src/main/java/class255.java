import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class255 {

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    private int field4615 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[Lva;")
    public class34[] field4594;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lcc;")
    public static class209 field4608 = class95.method669(114, "brillant3:");

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lcc;")
    public static class209 field4606 = class95.method669(109, ")0");

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field4616 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "J")
    private long field4612;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lva;")
    private class34 field4607;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Lva;")
    private class34 field4614;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(JB)Lva;")
    public final class34 method1755(long arg0, byte arg1) {
        field4601++;
        this.field4612 = arg0;
        class34 var4 = this.field4594[(int) ((long) (this.field4605 - 1) & arg0)];
        for (this.field4607 = var4.field595; this.field4607 != var4; this.field4607 = this.field4607.field595) {
            if (this.field4607.field596 == arg0) {
                class34 var5 = this.field4607;
                this.field4607 = this.field4607.field595;
                return var5;
            }
        }
        this.field4607 = null;
        if (arg1 > -64) {
            this.method1755(-118L, (byte) -14);
        }
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILsj;)V")
    public static final void method1756(int arg0, class49 arg1) {
        class3.field49 = arg1;
        if (arg0 >= -63) {
            field4597 = -91;
        }
        field4598++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public final void method1757(int arg0) {
        field4603++;
        int var2 = 0;
        if (arg0 != -29914) {
            method1756(-85, (class49) null);
        }
        while (var2 < this.field4605) {
            class34 var3 = this.field4594[var2];
            while (true) {
                class34 var4 = var3.field595;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method269(-214950896);
            }
        }
        this.field4614 = null;
        this.field4607 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIIIIII)I")
    public static final int method1758(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4596++;
        int var7 = arg3 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg5;
        }
        if (arg0 != -21) {
            field4608 = null;
        }
        if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 8 - arg5 - arg1;
        } else {
            return 7 - (arg6 + arg4 - 1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Lva;")
    public final class34 method1759(byte arg0) {
        this.field4615 = 0;
        if (arg0 != 43) {
            this.method1767((byte) 28);
        }
        field4600++;
        return this.method1767((byte) 41);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public static final void method1760(int arg0, int arg1) {
        for (class34 var2 = class9.field183.method1759((byte) 43); var2 != null; var2 = class9.field183.method1767((byte) 41)) {
            if ((var2.field596 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method269(-214950896);
            }
        }
        if (arg0 != -187) {
            field4606 = null;
        }
        field4611++;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I")
    public final int method1761(int arg0) {
        field4602++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field4605; var3++) {
            class34 var4 = this.field4594[var3];
            class34 var5 = var4.field595;
            while (var4 != var5) {
                var5 = var5.field595;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lva;JB)V")
    public final void method1762(class34 arg0, long arg1, byte arg2) {
        if (arg2 != 73) {
            return;
        }
        field4609++;
        if (arg0.field598 != null) {
            arg0.method269(-214950896);
        }
        class34 var5 = this.field4594[(int) (arg1 & (long) (this.field4605 - 1))];
        arg0.field596 = arg1;
        arg0.field598 = var5.field598;
        arg0.field595 = var5;
        arg0.field598.field595 = arg0;
        arg0.field595.field598 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)Lva;")
    public final class34 method1763(boolean arg0) {
        field4604++;
        if (this.field4607 == null) {
            return null;
        }
        class34 var2 = this.field4594[(int) (this.field4612 & (long) (this.field4605 - 1))];
        while (this.field4607 != var2) {
            if (this.field4607.field596 == this.field4612) {
                class34 var3 = this.field4607;
                this.field4607 = this.field4607.field595;
                return var3;
            }
            this.field4607 = this.field4607.field595;
        }
        if (!arg0) {
            this.field4615 = -112;
        }
        this.field4607 = null;
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)I")
    public final int method1764(byte arg0) {
        field4613++;
        return arg0 < 14 ? -67 : this.field4605;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public static void method1765(byte arg0) {
        field4608 = null;
        int var1 = 85 / ((-arg0 - 51) / 40);
        field4606 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V")
    public class255(int arg0) {
        this.field4594 = new class34[arg0];
        this.field4605 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class34 var3 = this.field4594[var2] = new class34();
            var3.field598 = var3;
            var3.field595 = var3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method1766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class277.field4883[var12][var31] = 0;
                class50.field997[var12][var31] = 99999999;
            }
        }
        field4610++;
        int var13 = arg1;
        class277.field4883[arg11][arg1] = 99;
        class50.field997[arg11][arg1] = 0;
        int var14 = 0;
        int var15 = arg11;
        byte var16 = 0;
        boolean var17 = false;
        class195.field3499[var16] = arg11;
        int var32 = var16 + 1;
        class265.field4756[var16] = arg1;
        int[][] var18 = class122.field2404[class99.field1937].field3103;
        while (var14 != var32) {
            var15 = class195.field3499[var14];
            var13 = class265.field4756[var14];
            var14 = var14 + 1 & 0xFFF;
            if (arg0 == var15 && arg7 == var13) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class122.field2404[class99.field1937].method1178(var13, arg0, arg5 - 1, var15, (byte) -123, arg9, arg7, 1)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && class122.field2404[class99.field1937].method1174(arg7, var13, 1, arg9, arg0, (byte) 92, arg5 - 1, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg3 != 0 && class122.field2404[class99.field1937].method1175(arg8, var13, arg7, arg3, var15, arg4, arg0, (byte) 106, 1)) {
                var17 = true;
                break;
            }
            int var30 = class50.field997[var15][var13] + 1;
            if (var15 > 0 && class277.field4883[var15 - 1][var13] == 0 && (var18[var15 - 1][var13] & 0x12C0108) == 0) {
                class195.field3499[var32] = var15 - 1;
                class265.field4756[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class277.field4883[var15 - 1][var13] = 2;
                class50.field997[var15 - 1][var13] = var30;
            }
            if (var15 < 103 && class277.field4883[var15 + 1][var13] == 0 && (var18[var15 + 1][var13] & 0x12C0180) == 0) {
                class195.field3499[var32] = var15 + 1;
                class265.field4756[var32] = var13;
                class277.field4883[var15 + 1][var13] = 8;
                class50.field997[var15 + 1][var13] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && class277.field4883[var15][var13 - 1] == 0 && (var18[var15][var13 - 1] & 0x12C0102) == 0) {
                class195.field3499[var32] = var15;
                class265.field4756[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class277.field4883[var15][var13 - 1] = 1;
                class50.field997[var15][var13 - 1] = var30;
            }
            if (var13 < 103 && class277.field4883[var15][var13 + 1] == 0 && (var18[var15][var13 + 1] & 0x12C0120) == 0) {
                class195.field3499[var32] = var15;
                class265.field4756[var32] = var13 + 1;
                class277.field4883[var15][var13 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class50.field997[var15][var13 + 1] = var30;
            }
            if (var15 > 0 && var13 > 0 && class277.field4883[var15 - 1][var13 - 1] == 0 && (var18[var15 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var15 - 1][var13] & 0x12C0108) == 0 && (var18[var15][var13 - 1] & 0x12C0102) == 0) {
                class195.field3499[var32] = var15 - 1;
                class265.field4756[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class277.field4883[var15 - 1][var13 - 1] = 3;
                class50.field997[var15 - 1][var13 - 1] = var30;
            }
            if (var15 < 103 && var13 > 0 && class277.field4883[var15 + 1][var13 - 1] == 0 && (var18[var15 + 1][var13 - 1] & 0x12C0183) == 0 && (var18[var15 + 1][var13] & 0x12C0180) == 0 && (var18[var15][var13 - 1] & 0x12C0102) == 0) {
                class195.field3499[var32] = var15 + 1;
                class265.field4756[var32] = var13 - 1;
                class277.field4883[var15 + 1][var13 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class50.field997[var15 + 1][var13 - 1] = var30;
            }
            if (var15 > 0 && var13 < 103 && class277.field4883[var15 - 1][var13 + 1] == 0 && (var18[var15 - 1][var13 + 1] & 0x12C0138) == 0 && (var18[var15 - 1][var13] & 0x12C0108) == 0 && (var18[var15][var13 + 1] & 0x12C0120) == 0) {
                class195.field3499[var32] = var15 - 1;
                class265.field4756[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class277.field4883[var15 - 1][var13 + 1] = 6;
                class50.field997[var15 - 1][var13 + 1] = var30;
            }
            if (var15 < 103 && var13 < 103 && class277.field4883[var15 + 1][var13 + 1] == 0 && (var18[var15 + 1][var13 + 1] & 0x12C01E0) == 0 && (var18[var15 + 1][var13] & 0x12C0180) == 0 && (var18[var15][var13 + 1] & 0x12C0120) == 0) {
                class195.field3499[var32] = var15 + 1;
                class265.field4756[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class277.field4883[var15 + 1][var13 + 1] = 12;
                class50.field997[var15 + 1][var13 + 1] = var30;
            }
        }
        class48.field922 = 0;
        if (!var17) {
            if (!arg10) {
                return false;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg0 - var20; var22 <= (arg0 + var20); var22++) {
                for (int var23 = arg7 - var20; var23 <= arg7 + var20; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class50.field997[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg0) {
                            var24 = arg0 - var22;
                        } else if (arg0 + arg8 - 1 < var22) {
                            var24 = var22 + 1 - (arg0 + arg8);
                        }
                        int var25 = 0;
                        if (var23 < arg7) {
                            var25 = arg7 - var23;
                        } else if (var23 > arg7 - (1 - arg3)) {
                            var25 = 1 - (arg7 - (var23 - arg3));
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var19 || var19 == var26 && var21 > class50.field997[var22][var23]) {
                            var15 = var22;
                            var21 = class50.field997[var22][var23];
                            var13 = var23;
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg11 == var15 && arg1 == var13) {
                return false;
            }
            class48.field922 = 1;
        }
        byte var27 = 0;
        class195.field3499[var27] = var15;
        int var33 = var27 + 1;
        class265.field4756[var27] = var13;
        int var28;
        int var29 = var28 = class277.field4883[var15][var13];
        while (arg11 != var15 || arg1 != var13) {
            if (var28 != var29) {
                var28 = var29;
                class195.field3499[var33] = var15;
                class265.field4756[var33++] = var13;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            if ((var29 & 0x2) != 0) {
                var15++;
            } else if ((var29 & 0x8) != 0) {
                var15--;
            }
            var29 = class277.field4883[var15][var13];
        }
        if (var33 > 0) {
            class124.method903(20948, arg2, var33);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            if (arg6 != -1) {
                method1765((byte) -72);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)Lva;")
    public final class34 method1767(byte arg0) {
        field4595++;
        if (this.field4615 > 0 && this.field4594[this.field4615 - 1] != this.field4614) {
            class34 var2 = this.field4614;
            this.field4614 = var2.field595;
            return var2;
        }
        if (arg0 != 41) {
            method1766(79, 124, 16, -86, 81, 61, 39, 3, 84, 8, true, -53);
        }
        while (this.field4605 > this.field4615) {
            class34 var3 = this.field4594[this.field4615++].field595;
            if (this.field4594[this.field4615 - 1] != var3) {
                this.field4614 = var3.field595;
                return var3;
            }
        }
        return null;
    }
}
