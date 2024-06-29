import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class242 extends class260 {

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lbu;")
    public static class21 field3610 = new class21(77, -1);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "[C")
    public static char[] field3616 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "D")
    public static double field3615;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[Lgp;")
    public static class53[] field3617;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)I", line = 4)
    public static final int method1613(int arg0) {
        if (arg0 != 8220) {
            return 22;
        } else {
            ++field3614;
            return class763.field10520 == 1 ? class631.field8874 : 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V", line = 22)
    public final void method128(int arg0, byte arg1) {
        ++field3608;
        if (arg1 != 122) {
            method1613(-43);
        }
        super.field3828 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)I", line = 33)
    public final int method129(int arg0, int arg1) {
        ++field3611;
        return arg0 != -1 ? 94 : 1;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)I", line = 44)
    public final int method1614(int arg0) {
        ++field3619;
        if (arg0 > -14) {
            this.method1614(-113);
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 56)
    public static void method1615(byte arg0) {
        field3617 = null;
        field3610 = null;
        field3616 = null;
        if (arg0 != 54) {
            field3616 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILgn;)V", line = 72)
    public class242(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I", line = 75)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return -98;
        } else {
            ++field3618;
            return 2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lav;ZI)V", line = 87)
    public static final void method1616(class665 arg0, boolean arg1, int arg2) {
        ++field3609;
        if (class618.field8644 < 400) {
            class110 var3 = arg0.field9240;
            String var4 = arg0.field9243;
            if (var3.field1657 != null) {
                var3 = var3.method840(class537.field7727, -30);
                if (var3 == null) {
                    return;
                }
                var4 = var3.field1630;
            }
            if (var3.field1662) {
                if (arg0.field9248 != 0) {
                    String var5 = class60.field734 != class588.field8297 ? class620.field8689.method3580(class140.field2081, 12) : class620.field8691.method3580(class140.field2081, 12);
                    var4 = var4 + class245.method1627(class210.field3250.field9786, arg0.field9248, (byte) 47) + " (" + var5 + arg0.field9248 + ")";
                }
                if (class691.field9660 && !arg1) {
                    class645 var6 = class474.field6636 != -1 ? class184.field2832.method4117((byte) 49, class474.field6636) : null;
                    if (~(class197.field3008 & 2) != -1 && (var6 == null || var3.method845((byte) -59, var6.field9011, class474.field6636) != var6.field9011)) {
                        class105.method738((long) arg0.field4640, -1, true, class714.field9904 + " -> <col=ffff00>" + var4, false, class169.field2646, false, 0, (long) arg0.field4640, 0, (byte) -42, class572.field8070, 45);
                        ++class586.field8279;
                    }
                }
                if (!arg1) {
                    String[] var7 = var3.field1683;
                    if (class311.field4436) {
                        var7 = class267.method1739(91, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (~var3.field1623 == -1 || !var7[var8].equalsIgnoreCase(class620.field8684.method3580(class140.field2081, 12)))) {
                                byte var9 = 0;
                                int var10 = class450.field6165;
                                if (~var8 == -1) {
                                    var9 = 25;
                                }
                                if (~var8 == -2) {
                                    var9 = 44;
                                }
                                if (~var8 == -3) {
                                    var9 = 10;
                                }
                                if (var8 == 3) {
                                    var9 = 16;
                                }
                                if (~var3.field1666 == ~var8) {
                                    var10 = var3.field1686;
                                }
                                if (var8 == 4) {
                                    var9 = 58;
                                }
                                if (~var3.field1692 == ~var8) {
                                    var10 = var3.field1679;
                                }
                                ++class719.field9958;
                                class105.method738((long) arg0.field4640, -1, true, "<col=ffff00>" + var4, false, var7[var8].equalsIgnoreCase(class620.field8684.method3580(class140.field2081, 12)) ? var3.field1641 : var10, false, 0, (long) arg0.field4640, 0, (byte) -42, var7[var8], var9);
                            }
                        }
                    }
                    if (var3.field1623 == 1 && var7 != null) {
                        for (int var11 = 4; var11 >= 0; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class620.field8684.method3580(class140.field2081, 12))) {
                                short var12 = 0;
                                if (~arg0.field9248 < ~class210.field3250.field9786) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (~var11 == -1) {
                                    var13 = 25;
                                }
                                if (~var11 == -2) {
                                    var13 = 44;
                                }
                                if (~var11 == -3) {
                                    var13 = 10;
                                }
                                if (~var11 == -4) {
                                    var13 = 16;
                                }
                                if (var11 == 4) {
                                    var13 = 58;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                ++class105.field1221;
                                class105.method738((long) arg0.field4640, -1, true, "<col=ffff00>" + var4, false, var3.field1641, false, 0, (long) arg0.field4640, 0, (byte) -42, var7[var11], var13);
                            }
                        }
                    }
                }
                class105.method738((long) arg0.field4640, -1, true, "<col=ffff00>" + var4, arg1, class547.field7869, false, 0, (long) arg0.field4640, 0, (byte) -42, class620.field8683.method3580(class140.field2081, 12), 1009);
                if (arg2 < 36) {
                    field3612 = -9;
                }
                ++class651.field9091;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lgn;)V", line = 261)
    public class242(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 264)
    public final void method126(int arg0) {
        ++field3613;
        if (super.field3829.field10082.method4066(false) && super.field3828 == 2) {
            super.field3828 = 1;
        }
        if (~super.field3828 > -1 || ~super.field3828 < -3) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            method1613(92);
        }
    }
}
