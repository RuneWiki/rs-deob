import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class223 extends class194 {

    @OriginalMember(owner = "client!al", name = "Qb", descriptor = "Loh;")
    public static class263 field3946 = class253.method1681(-127, ": ");

    @OriginalMember(owner = "client!al", name = "Eb", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!al", name = "Fb", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!al", name = "Gb", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!al", name = "Hb", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!al", name = "Ib", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!al", name = "Jb", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!al", name = "Kb", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!al", name = "Lb", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!al", name = "Mb", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!al", name = "Ob", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!al", name = "Pb", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!al", name = "Rb", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!al", name = "Sb", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!al", name = "Nb", descriptor = "Lvd;")
    private class4 field3943;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
    public class223(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!al", name = "w", descriptor = "(I)V")
    public final void method1511(int arg0) {
        ++field3947;
        if (arg0 != Integer.MAX_VALUE) {
            this.field3943 = null;
        }
        this.field3942 = super.field3497 * 8;
    }

    @OriginalMember(owner = "client!al", name = "m", descriptor = "(II)I")
    public final int method1512(int arg0, int arg1) {
        ++field3940;
        int var3 = -(7 & this.field3942) + 8;
        int var4 = this.field3942 >> 3;
        int var5 = 0;
        if (arg1 <= 125) {
            this.field3943 = null;
        }
        this.field3942 += arg0;
        while (~var3 > ~arg0) {
            var5 += (super.field3469[var4++] & class252.field4382[var3]) << -var3 + arg0;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class252.field4382[var3] & super.field3469[var4]) + var5;
        } else {
            var6 = (super.field3469[var4] >> var3 - arg0 & class252.field4382[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!al", name = "x", descriptor = "(I)V")
    public final void method1513(int arg0) {
        ++field3939;
        if (arg0 < 78) {
            this.method1513(24);
        }
        super.field3497 = (this.field3942 + 7) / 8;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II[BI)V")
    public final void method1514(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field3948;
        for (int var5 = 0; ~arg0 < ~var5; ++var5) {
            arg2[arg1 + var5] = (byte) (super.field3469[super.field3497++] + -this.field3943.method21(-1640531527));
        }
        if (arg3 != -4256) {
            this.field3943 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([II)V")
    public final void method1515(int[] arg0, int arg1) {
        if (arg1 != -1) {
            this.method1518(-106, -125);
        }
        ++field3941;
        this.field3943 = new class4(arg0);
    }

    @OriginalMember(owner = "client!al", name = "n", descriptor = "(II)V")
    public final void method1516(int arg0, int arg1) {
        int var3 = 31 % ((9 - arg0) / 41);
        super.field3469[super.field3497++] = (byte) (arg1 + this.field3943.method21(-1640531527));
        ++field3945;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIILnj;IJIIII)Z")
    public static final boolean method1517(int arg0, int arg1, int arg2, int arg3, class139 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class190.method1248(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!al", name = "o", descriptor = "(II)I")
    public final int method1518(int arg0, int arg1) {
        ++field3935;
        return arg1 != 8 ? -103 : arg0 * 8 + -this.field3942;
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(B)I")
    public final int method1519(byte arg0) {
        if (arg0 >= -87) {
            method1522(9, false);
        }
        ++field3937;
        return super.field3469[super.field3497++] - this.field3943.method21(-1640531527) & 255;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(III)I")
    public static final int method1520(int arg0, int arg1, int arg2) {
        if (arg2 != 7) {
            method1521(104);
        }
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        ++field3934;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 255;
    }

    @OriginalMember(owner = "client!al", name = "y", descriptor = "(I)V")
    public static final void method1521(int arg0) {
        for (class173 var1 = (class173) class189.field3408.method1878(true); var1 != null; var1 = (class173) class189.field3408.method1881(-74)) {
            if (~var1.field3145 < -1) {
                --var1.field3145;
            }
            if (var1.field3145 != 0) {
                if (var1.field3137 > 0) {
                    --var1.field3137;
                }
                if (~var1.field3137 == -1 && ~var1.field3149 <= -2 && ~var1.field3140 <= -2 && ~var1.field3149 >= -103 && var1.field3140 <= 102 && (~var1.field3147 > -1 || class50.method321(var1.field3142, var1.field3147, arg0 ^ 18760))) {
                    class238.method1594(var1.field3140, var1.field3151, var1.field3142, var1.field3153, var1.field3149, var1.field3147, var1.field3144, arg0 ^ -15894);
                    var1.field3137 = -1;
                    if (~var1.field3154 == ~var1.field3147 && ~var1.field3154 == 0) {
                        var1.method1614(-1204826926);
                    } else if (var1.field3154 == var1.field3147 && var1.field3155 == var1.field3144 && ~var1.field3142 == ~var1.field3138) {
                        var1.method1614(-1204826926);
                    }
                }
            } else if (var1.field3154 < 0 || class50.method321(var1.field3138, var1.field3154, 127)) {
                class238.method1594(var1.field3140, var1.field3151, var1.field3138, var1.field3153, var1.field3149, var1.field3154, var1.field3155, -30499);
                var1.method1614(-1204826926);
            }
        }
        if (arg0 != 18743) {
            field3946 = null;
        }
        ++field3944;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)I")
    public static final int method1522(int arg0, boolean arg1) {
        if (arg1) {
            field3946 = null;
        }
        ++field3936;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!al", name = "z", descriptor = "(I)V")
    public static void method1523(int arg0) {
        if (arg0 == 30731) {
            field3946 = null;
        }
    }
}
