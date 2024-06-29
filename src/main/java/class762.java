import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class762 extends class441 implements class722 {

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "S")
    private short field10620;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "Z")
    private boolean field10624;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Z")
    private boolean field10607;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "B")
    private byte field10608;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "Z")
    private boolean field10626;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "Z")
    private boolean field10623;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "Lka;")
    private class284 field10610;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "Lr;")
    private class709 field10622;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "J")
    public static long field10625 = -1L;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "Liv;")
    public static class25 field10618 = new class25(1);

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "[[Z")
    public static boolean[][] field10628 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "Z")
    public static boolean field10630 = true;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field10598;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field10601;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field10602;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field10603;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field10604;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field10611;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field10614;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field10616;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    public static int field10617;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public static int field10621;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public static int field10627;

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
    public static int field10629;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Liha;")
    private class613 field10606;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lha;B)Liha;", line = 7)
    public final class613 method653(class548 arg0, byte arg1) {
        if (arg1 != 13) {
            return null;
        } else {
            if (this.field10606 == null) {
                this.field10606 = class491.method2980(super.field4418, -4, super.field4413, this.method4253(false, arg0, 0), super.field4410);
            }
            ++field10599;
            return this.field10606;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBLha;Z)Lcn;", line = 23)
    private final class308 method4250(int arg0, byte arg1, class548 arg2, boolean arg3) {
        ++field10616;
        class220 var5 = class20.field192.method716(6, this.field10620 & 65535);
        if (arg1 >= -48) {
            this.method641(6);
        }
        class341 var6;
        class341 var7;
        if (this.field10624) {
            var6 = class371.field5240[super.field4419];
            var7 = class550.field7649[0];
        } else {
            var6 = class550.field7649[super.field4419];
            if (super.field4419 >= 3) {
                var7 = null;
            } else {
                var7 = class550.field7649[super.field4419 - -1];
            }
        }
        return var5.method1295(this.field10608, -5488, (class77) null, arg0, arg2, 22, super.field4418, arg3, super.field4413, var7, var6, super.field4410);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;I)Lua;", line = 53)
    public final class3 method660(class548 arg0, int arg1) {
        ++field10627;
        if (this.field10610 == null) {
            return null;
        } else {
            class744 var3 = arg0.method1404();
            var3.method905(super.field4410, super.field4413, super.field4418);
            if (arg1 != -1) {
                return null;
            } else {
                class3 var4 = class682.method3841(1, this.field10626, 28389);
                if (class301.field4261) {
                    this.field10610.method1682(var3, var4.field18[0], class3.field30, 0);
                } else {
                    this.field10610.method1686(var3, var4.field18[0], 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "(I)V", line = 82)
    public final void method641(int arg0) {
        this.field10607 = false;
        if (arg0 < 91) {
            this.field10622 = null;
        }
        ++field10612;
        if (this.field10610 != null) {
            this.field10610.method1691(-65537 & this.field10610.method1703());
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILha;IB)Z", line = 97)
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field10615;
        class284 var5 = this.method4253(false, arg1, 131072);
        if (arg3 > -58) {
            return false;
        } else if (var5 != null) {
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            return !class301.field4261 ? var5.method1669(arg0, arg2, var6, false, 0) : var5.method1653(arg0, arg2, var6, false, 0, class3.field30);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLha;)V", line = 123)
    public final void method659(boolean arg0, class548 arg1) {
        if (!arg0) {
            ++field10605;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)I", line = 134)
    public final int method793(byte arg0) {
        if (arg0 != -86) {
            this.method785(-20);
        }
        ++field10598;
        return this.field10610 == null ? 0 : this.field10610.method1697();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I", line = 146)
    public final int method784(int arg0) {
        ++field10603;
        if (arg0 != -4532) {
            this.method790(65);
        }
        return 22;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 158)
    public final void method795(int arg0) {
        ++field10601;
        if (this.field10610 != null) {
            this.field10610.method1705();
        }
        if (arg0 <= 31) {
            this.method4250(47, (byte) -56, (class548) null, true);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)I", line = 172)
    public final int method782(byte arg0) {
        ++field10600;
        int var2 = 36 % ((-5 - arg0) / 54);
        return 65535 & this.field10620;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILnfa;IIIIIIII)Z", line = 183)
    public static final boolean method4251(int arg0, int arg1, class228 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field10604;
        int var11 = arg10;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        if (arg9 != -11804) {
            method4252((byte) -88);
        }
        int var15 = -var13 + arg10;
        int var16 = -var14 + arg3;
        class202.field2678[var13][var14] = 99;
        class229.field3070[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class748.field10296[var17] = arg10;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class633.field8514[var10001] = arg3;
        int[][] var19 = arg2.field3049;
        while (~var26 != ~var18) {
            var11 = class748.field10296[var18];
            var12 = class633.field8514[var18];
            var18 = 4095 & var18 - -1;
            int var20 = var12 - var16;
            int var21 = -var15 + var11;
            int var22 = var11 - arg2.field3063;
            int var23 = -arg2.field3052 + var12;
            if (arg7 != -4) {
                if (~arg7 != 2) {
                    if (~arg7 != 1) {
                        if (arg7 != -1) {
                            if (arg7 != 0 && ~arg7 != -2 && ~arg7 != -3 && ~arg7 != -4 && ~arg7 != -10) {
                                if (arg2.method1353(arg6, 2, arg0, var11, arg7, var12, (byte) -123, arg1)) {
                                    class633.field8520 = var12;
                                    class750.field10323 = var11;
                                    return true;
                                }
                            } else if (arg2.method1345(arg0, arg7, arg1, 2883842, arg6, var12, 2, var11)) {
                                class750.field10323 = var11;
                                class633.field8520 = var12;
                                return true;
                            }
                        } else if (arg2.method1346(-4794, arg8, arg5, var11, 2, var12, arg6, arg4, arg0)) {
                            class750.field10323 = var11;
                            class633.field8520 = var12;
                            return true;
                        }
                    } else if (arg2.method1352(arg8, 2, var12, 2, arg5, arg0, arg4, -25945, arg6, var11)) {
                        class750.field10323 = var11;
                        class633.field8520 = var12;
                        return true;
                    }
                } else if (class80.method581(arg8, var11, arg0, arg6, 2, arg4, 2, 32660, var12)) {
                    class633.field8520 = var12;
                    class750.field10323 = var11;
                    return true;
                }
            } else if (arg6 == var11 && ~arg0 == ~var12) {
                class633.field8520 = var12;
                class750.field10323 = var11;
                return true;
            }
            int var25 = class229.field3070[var21][var20] + 1;
            if (~var21 < -1 && ~class202.field2678[var21 + -1][var20] == -1 && (var19[var22 + -1][var23] & 1134821376) == 0 && (1310982144 & var19[var22 - 1][var23 + 1]) == 0) {
                class748.field10296[var26] = var11 + -1;
                class633.field8514[var26] = var12;
                class202.field2678[var21 + -1][var20] = 2;
                var26 = 4095 & var26 + 1;
                class229.field3070[var21 + -1][var20] = var25;
            }
            if (var21 < 126 && class202.field2678[var21 + 1][var20] == 0 && ~(var19[var22 + 2][var23] & 1625554944) == -1 && ~(var19[var22 + 2][var23 + 1] & 2015625216) == -1) {
                class748.field10296[var26] = var11 - -1;
                class633.field8514[var26] = var12;
                class202.field2678[var21 + 1][var20] = 8;
                var26 = 4095 & var26 + 1;
                class229.field3070[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class202.field2678[var21][var20 + -1] == 0 && ~(var19[var22][var23 + -1] & 1134821376) == -1 && (var19[var22 + 1][var23 - 1] & 1625554944) == 0) {
                class748.field10296[var26] = var11;
                class633.field8514[var26] = var12 + -1;
                var26 = var26 + 1 & 4095;
                class202.field2678[var21][var20 + -1] = 1;
                class229.field3070[var21][var20 + -1] = var25;
            }
            if (~var20 > -127 && class202.field2678[var21][var20 + 1] == 0 && ~(var19[var22][var23 - -2] & 1310982144) == -1 && ~(var19[var22 + 1][var23 + 2] & 2015625216) == -1) {
                class748.field10296[var26] = var11;
                class633.field8514[var26] = var12 + 1;
                class202.field2678[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 4095;
                class229.field3070[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class202.field2678[var21 + -1][var20 + -1] == 0 && (1336147968 & var19[var22 + -1][var23]) == 0 && (1134821376 & var19[var22 + -1][var23 + -1]) == 0 && ~(1675886592 & var19[var22][var23 - 1]) == -1) {
                class748.field10296[var26] = var11 - 1;
                class633.field8514[var26] = var12 + -1;
                class202.field2678[var21 - 1][var20 + -1] = 3;
                var26 = var26 + 1 & 4095;
                class229.field3070[var21 + -1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class202.field2678[var21 + 1][var20 + -1] == 0 && ~(var19[var22 - -1][var23 + -1] & 1675886592) == -1 && (1625554944 & var19[var22 + 2][var23 - 1]) == 0 && ~(var19[var22 - -2][var23] & 2028208128) == -1) {
                class748.field10296[var26] = var11 + 1;
                class633.field8514[var26] = var12 + -1;
                class202.field2678[var21 + 1][var20 + -1] = 9;
                var26 = 4095 & var26 + 1;
                class229.field3070[var21 + 1][var20 + -1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && class202.field2678[var21 + -1][var20 + 1] == 0 && ~(1336147968 & var19[var22 + -1][var23 + 1]) == -1 && ~(var19[var22 - 1][var23 + 2] & 1310982144) == -1 && ~(var19[var22][var23 + 2] & 2116288512) == -1) {
                class748.field10296[var26] = var11 + -1;
                class633.field8514[var26] = var12 + 1;
                class202.field2678[var21 + -1][var20 + 1] = 6;
                var26 = 4095 & var26 + 1;
                class229.field3070[var21 + -1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && ~class202.field2678[var21 + 1][var20 + 1] == -1 && ~(var19[var22 + 1][var23 + 2] & 2116288512) == -1 && ~(var19[var22 + 2][var23 - -2] & 2015625216) == -1 && ~(var19[var22 + 2][var23 + 1] & 2028208128) == -1) {
                class748.field10296[var26] = var11 + 1;
                class633.field8514[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class202.field2678[var21 + 1][var20 + 1] = 12;
                class229.field3070[var21 + 1][var20 + 1] = var25;
            }
        }
        class633.field8520 = var12;
        class750.field10323 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Z", line = 541)
    public final boolean method781(int arg0) {
        if (arg0 > -86) {
            this.method786((class548) null, false);
        }
        ++field10617;
        return this.field10623;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V", line = 552)
    public static void method4252(byte arg0) {
        if (arg0 > -69) {
            method4252((byte) 16);
        }
        field10618 = null;
        field10628 = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I", line = 563)
    public final int method794(int arg0) {
        ++field10629;
        if (arg0 < 92) {
            this.method785(113);
        }
        return this.field10608;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;Z)V", line = 576)
    public final void method786(class548 arg0, boolean arg1) {
        if (!arg1) {
            field10630 = false;
        }
        ++field10621;
        Object var3 = null;
        class709 var5;
        if (this.field10622 == null && this.field10623) {
            class308 var4 = this.method4250(262144, (byte) -115, arg0, true);
            var5 = var4 == null ? null : var4.field4321;
        } else {
            var5 = this.field10622;
            this.field10622 = null;
        }
        if (var5 != null) {
            class569.method3337(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)Z", line = 604)
    public final boolean method783(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field10614;
            if (this.field10610 == null) {
                return true;
            } else {
                return !this.field10610.method1689();
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLha;ZILuq;II)V", line = 621)
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        ++field10597;
        if (arg4 instanceof class762) {
            class762 var8 = (class762) arg4;
            if (this.field10610 != null && var8.field10610 != null) {
                this.field10610.method1654(var8.field10610, arg6, arg3, arg5, arg2);
            }
        }
        if (arg0 > -8) {
            this.method659(false, (class548) null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lha;Lts;IIIIIZIZ)V", line = 642)
    public class762(class548 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field2894);
        this.field10620 = (short) arg1.field2964;
        super.field4418 = arg6;
        this.field10624 = arg7;
        this.field10607 = arg9;
        super.field4410 = arg4;
        this.field10608 = (byte) arg8;
        this.field10626 = ~arg1.field2948 != -1 && !arg7;
        this.field10623 = arg0.method1490() && arg1.field2956 && !this.field10624 && ~class332.field4707.field4787.method942(0) != -1;
        int var11 = 2048;
        if (this.field10607) {
            var11 |= 65536;
        }
        class308 var12 = this.method4250(var11, (byte) -124, arg0, this.field10623);
        if (var12 != null) {
            this.field10610 = var12.field4319;
            this.field10622 = var12.field4321;
            if (this.field10607) {
                this.field10610 = this.field10610.method1659((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;B)V", line = 677)
    public final void method792(class548 arg0, byte arg1) {
        ++field10609;
        Object var3 = null;
        class709 var5;
        if (this.field10622 == null && this.field10623) {
            class308 var4 = this.method4250(262144, (byte) -54, arg0, true);
            var5 = var4 != null ? var4.field4321 : null;
        } else {
            var5 = this.field10622;
            this.field10622 = null;
        }
        if (var5 != null) {
            class569.method3336(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
        }
        if (arg1 >= -105) {
            this.method785(-2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Z", line = 705)
    public final boolean method642(byte arg0) {
        if (arg0 != 2) {
            return true;
        } else {
            ++field10602;
            return this.field10607;
        }
    }

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "(I)Z", line = 717)
    public final boolean method785(int arg0) {
        if (arg0 >= -117) {
            return false;
        } else {
            ++field10613;
            return this.field10610 != null ? this.field10610.method1673() : false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLha;I)Lka;", line = 733)
    private final class284 method4253(boolean arg0, class548 arg1, int arg2) {
        ++field10619;
        if (this.field10610 != null && arg1.method1484(this.field10610.method1703(), arg2) == 0) {
            return this.field10610;
        } else {
            class308 var4 = this.method4250(arg2, (byte) -85, arg1, arg0);
            return var4 == null ? null : var4.field4319;
        }
    }

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "(I)I", line = 750)
    public final int method790(int arg0) {
        ++field10611;
        if (arg0 != -11692) {
            method4252((byte) -64);
        }
        return this.field10610 != null ? this.field10610.method1668() : 0;
    }
}
