import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class70 extends class216 {

    @OriginalMember(owner = "client!jf", name = "Ob", descriptor = "Lsb;")
    public static class98 field1120 = class47.method368("", 0);

    @OriginalMember(owner = "client!jf", name = "Pb", descriptor = "I")
    public static int field1121 = -1;

    @OriginalMember(owner = "client!jf", name = "Eb", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!jf", name = "Fb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!jf", name = "Gb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!jf", name = "Hb", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "client!jf", name = "Ib", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!jf", name = "Jb", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!jf", name = "Kb", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!jf", name = "Lb", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!jf", name = "Mb", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!jf", name = "Nb", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!jf", name = "Qb", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!jf", name = "Sb", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!jf", name = "Tb", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!jf", name = "Ub", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!jf", name = "Wb", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!jf", name = "Vb", descriptor = "Lgd;")
    private class116 field1127;

    @OriginalMember(owner = "client!jf", name = "Rb", descriptor = "Lac;")
    public static class188 field1123;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "(II)I")
    public final int method478(int arg0, int arg1) {
        ++field1111;
        int var3 = 46 % ((19 - arg1) / 44);
        return arg0 * 8 - this.field1113;
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(B)V")
    public final void method479(byte arg0) {
        ++field1114;
        super.field3728 = (this.field1113 + 7) / 8;
        if (arg0 < 125) {
            field1120 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBII)I")
    public static final int method480(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 126) {
            field1120 = null;
        }
        ++field1124;
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
            int var6 = arg0;
            if (~arg0 > -4 && ~(2 & class138.field2461[1][var4][var5]) == -3) {
                var6 = arg0 + 1;
            }
            int var7 = 127 & arg3;
            int var8 = 127 & arg2;
            int var9 = (-var8 + 128) * class78.field1393[var6][var4][var5] - -(class78.field1393[var6][var4 + 1][var5] * var8) >> 7;
            int var10 = (-var8 + 128) * class78.field1393[var6][var4][var5 - -1] - -(class78.field1393[var6][var4 + 1][var5 - -1] * var8) >> 7;
            return (-var7 + 128) * var9 + var7 * var10 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "(I)V")
    public static final void method481(int arg0) {
        int[] var1 = new int[class142.field2517];
        ++field1118;
        int var2 = 0;
        for (int var3 = 0; ~class142.field2517 < ~var3; ++var3) {
            class245 var5 = class235.method1605(65, var3);
            if (~var5.field4299 <= -1 || var5.field4268 >= 0) {
                var1[var2++] = var3;
            }
        }
        class236.field4072 = new int[var2];
        int var4 = 0;
        if (arg0 == -3389) {
            while (~var2 < ~var4) {
                class236.field4072[var4] = var1[var4];
                ++var4;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "(I)V")
    public static void method482(int arg0) {
        if (arg0 != -16166) {
            field1121 = 9;
        }
        field1123 = null;
        field1120 = null;
    }

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "(II)I")
    public final int method483(int arg0, int arg1) {
        ++field1126;
        int var3 = this.field1113 >> 3;
        int var4 = -(this.field1113 & 7) + arg0;
        this.field1113 += arg1;
        int var5 = 0;
        while (~arg1 < ~var4) {
            var5 += (super.field3706[var3++] & class186.field3220[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field3706[var3] >> -arg1 + var4 & class186.field3220[arg1]) + var5;
        } else {
            var6 = (super.field3706[var3] & class186.field3220[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "(I)V")
    public static final void method484(int arg0) {
        if (arg0 <= 84) {
            field1121 = 64;
        }
        class86.field1508.method1517((byte) -60);
        ++field1112;
        class146.field2555.method119((byte) 107);
        class75.field1313.method119((byte) 107);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "([BIII)V")
    public final void method485(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < arg2; ++var5) {
            arg0[arg3 + var5] = (byte) (super.field3706[super.field3728++] + -this.field1127.method871(-4578));
        }
        if (arg1 > -46) {
            this.method491(-56);
        }
        ++field1125;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method486(int arg0, Component arg1) {
        arg1.removeKeyListener(class197.field3394);
        ++field1128;
        arg1.removeFocusListener(class197.field3394);
        class153.field2803 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZBI)I")
    public static final int method487(int arg0, boolean arg1, byte arg2, int arg3) {
        ++field1115;
        class56 var4 = (class56) class211.field3609.method1511((byte) -127, (long) arg3);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            if (arg2 != 0) {
                field1120 = null;
            }
            for (int var6 = 0; ~var4.field893.length < ~var6; ++var6) {
                if (var4.field893[var6] >= 0 && ~class142.field2517 < ~var4.field893[var6]) {
                    class245 var7 = class235.method1605(65, var4.field893[var6]);
                    if (var7.field4262 != null) {
                        class224 var8 = (class224) var7.field4262.method1511((byte) -127, (long) arg0);
                        if (var8 != null) {
                            if (!arg1) {
                                var5 += var8.field3858;
                            } else {
                                var5 += var4.field889[var6] * var8.field3858;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(B)I")
    public final int method488(byte arg0) {
        int var2 = -4 % ((arg0 - -12) / 37);
        ++field1119;
        return super.field3706[super.field3728++] - this.field1127.method871(-4578) & 255;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IB)V")
    public final void method489(int[] arg0, byte arg1) {
        ++field1110;
        if (arg1 == 119) {
            this.field1127 = new class116(arg0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "(II)V")
    public final void method490(int arg0, int arg1) {
        super.field3706[super.field3728++] = (byte) (this.field1127.method871(-4578) + arg0);
        if (arg1 <= -51) {
            ++field1116;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
    public class70(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "(I)V")
    public final void method491(int arg0) {
        this.field1113 = super.field3728 * 8;
        if (arg0 == -1) {
            ++field1117;
        }
    }
}
