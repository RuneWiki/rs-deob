import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class409 extends class63 {

    @OriginalMember(owner = "client!mfa", name = "Qb", descriptor = "I")
    public static int field5835 = 0;

    @OriginalMember(owner = "client!mfa", name = "Ub", descriptor = "I")
    public static int field5839 = 50;

    @OriginalMember(owner = "client!mfa", name = "Tb", descriptor = "[I")
    public static int[] field5838 = new int[field5839];

    @OriginalMember(owner = "client!mfa", name = "cc", descriptor = "[I")
    public static int[] field5847 = new int[field5839];

    @OriginalMember(owner = "client!mfa", name = "Rb", descriptor = "[I")
    public static int[] field5836 = new int[field5839];

    @OriginalMember(owner = "client!mfa", name = "Kb", descriptor = "[Ljava/lang/String;")
    public static String[] field5829 = new String[field5839];

    @OriginalMember(owner = "client!mfa", name = "bc", descriptor = "I")
    public static int field5846 = 0;

    @OriginalMember(owner = "client!mfa", name = "ac", descriptor = "[I")
    public static int[] field5845 = new int[field5839];

    @OriginalMember(owner = "client!mfa", name = "Vb", descriptor = "[I")
    public static int[] field5840 = new int[field5839];

    @OriginalMember(owner = "client!mfa", name = "Nb", descriptor = "[I")
    public static int[] field5832 = new int[field5839];

    @OriginalMember(owner = "client!mfa", name = "Gb", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!mfa", name = "Hb", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!mfa", name = "Ib", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!mfa", name = "Jb", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!mfa", name = "Lb", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!mfa", name = "Mb", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!mfa", name = "Pb", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!mfa", name = "Sb", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!mfa", name = "Wb", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!mfa", name = "Xb", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!mfa", name = "Yb", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!mfa", name = "Zb", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!mfa", name = "dc", descriptor = "I")
    private int field5848;

    @OriginalMember(owner = "client!mfa", name = "ec", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!mfa", name = "Ob", descriptor = "Laq;")
    private class312 field5833;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "(B)Z")
    public final boolean method2559(byte arg0) {
        ++field5834;
        if (arg0 != -36) {
            this.method2567(102);
        }
        int var2 = 255 & super.field954[super.field956] + -this.field5833.method2042((byte) -60);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "(II)I")
    public final int method2560(int arg0, int arg1) {
        ++field5837;
        int var3 = this.field5848 >> 3;
        int var4 = -(7 & this.field5848) + 8;
        if (arg0 > -28) {
            this.method2566((byte[]) null, -112, -30, -58);
        }
        this.field5848 += arg1;
        int var5 = 0;
        while (~arg1 < ~var4) {
            var5 += (super.field954[var3++] & class42.field522[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field954[var3] >> -arg1 + var4 & class42.field522[arg1]) + var5;
        } else {
            var6 = (class42.field522[var4] & super.field954[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[I)V")
    public final void method2561(int arg0, int[] arg1) {
        this.field5833 = new class312(arg1);
        if (arg0 == 8) {
            ++field5826;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZ)I")
    public final int method2562(int arg0, boolean arg1) {
        ++field5841;
        if (arg1) {
            field5838 = null;
        }
        return arg0 * 8 + -this.field5848;
    }

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "(B)V")
    public final void method2563(byte arg0) {
        ++field5831;
        if (arg0 != 33) {
            this.method2567(-87);
        }
        this.field5848 = super.field956 * 8;
    }

    @OriginalMember(owner = "client!mfa", name = "w", descriptor = "(I)V")
    public static void method2564(int arg0) {
        field5840 = null;
        field5836 = null;
        field5845 = null;
        field5838 = null;
        field5847 = null;
        field5829 = null;
        if (arg0 != -1) {
            field5838 = null;
        }
        field5832 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2565(int arg0, int arg1, int arg2, int arg3) {
        ++field5849;
        if (class762.field10630 && class280.field4072) {
            if (~class527.field7314 > -101) {
                return false;
            } else {
                if (arg3 != 0) {
                    method2564(12);
                }
                int var4 = class316.field4387[arg1][arg2][arg0];
                if (~(-class463.field6452) == ~var4) {
                    return false;
                } else if (~class463.field6452 == ~var4) {
                    return true;
                } else if (class433.field6043 == class371.field5240) {
                    return false;
                } else {
                    int var5 = arg2 << class371.field5241;
                    int var6 = arg0 << class371.field5241;
                    if (class220.method1302(class433.field6043[arg1].method2171(arg0 + 1, arg2, 31), class368.field5213 + var5 + -1, class368.field5213 - 1 + var6, var5 - -1, arg3 + -108, class433.field6043[arg1].method2171(arg0, arg2, 31), var6 + 1, var5 - -1, class433.field6043[arg1].method2171(arg0 - -1, arg2 + 1, 31), class368.field5213 + -1 + var6) && class220.method1302(class433.field6043[arg1].method2171(arg0 + 1, arg2 - -1, arg3 + 31), class368.field5213 + var5 + -1, class368.field5213 + var6 + -1, var5 + 1, -118, class433.field6043[arg1].method2171(arg0, arg2, 31), var6 - -1, class368.field5213 + -1 + var5, class433.field6043[arg1].method2171(arg0, arg2 + 1, 31), var6 + 1)) {
                        ++class671.field9270;
                        class316.field4387[arg1][arg2][arg0] = class463.field6452;
                        return true;
                    } else {
                        class316.field4387[arg1][arg2][arg0] = -class463.field6452;
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "([BIII)V")
    public final void method2566(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field5843;
        if (arg2 == 1277595144) {
            for (int var5 = 0; ~var5 > ~arg3; ++var5) {
                arg0[arg1 + var5] = (byte) (super.field954[super.field956++] + -this.field5833.method2044((byte) -49));
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "x", descriptor = "(I)V")
    public final void method2567(int arg0) {
        ++field5825;
        super.field956 = (this.field5848 + 7) / 8;
        if (arg0 != 0) {
            this.method2568((class312) null, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Laq;B)V")
    public final void method2568(class312 arg0, byte arg1) {
        if (arg1 <= 114) {
            this.method2567(-20);
        }
        ++field5828;
        this.field5833 = arg0;
    }

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "(B)I")
    public final int method2569(byte arg0) {
        ++field5844;
        int var2 = super.field954[super.field956++] + -this.field5833.method2044((byte) -49) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            int var3 = 47 / ((57 - arg0) / 39);
            return (255 & super.field954[super.field956++] - this.field5833.method2044((byte) -49)) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
    public class409(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "(IB)V")
    public final void method2570(int arg0, byte arg1) {
        if (arg1 != -66) {
            field5827 = -128;
        }
        super.field954[super.field956++] = (byte) (arg0 + this.field5833.method2044((byte) -49));
        ++field5830;
    }
}
