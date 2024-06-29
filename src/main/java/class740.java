import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class740 extends class234 {

    @OriginalMember(owner = "client!tia", name = "Jb", descriptor = "Lrn;")
    public static class633 field10016 = new class633(42, 0);

    @OriginalMember(owner = "client!tia", name = "Gb", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!tia", name = "Ib", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!tia", name = "Kb", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!tia", name = "Lb", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!tia", name = "Mb", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!tia", name = "Nb", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!tia", name = "Pb", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!tia", name = "Qb", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!tia", name = "Rb", descriptor = "I")
    public static int field10024;

    @OriginalMember(owner = "client!tia", name = "Sb", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!tia", name = "Tb", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!tia", name = "Ub", descriptor = "I")
    public static int field10027;

    @OriginalMember(owner = "client!tia", name = "Vb", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!tia", name = "Xb", descriptor = "I")
    private int field10030;

    @OriginalMember(owner = "client!tia", name = "Yb", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!tia", name = "ac", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!tia", name = "Ob", descriptor = "Lbw;")
    private class152 field10021;

    @OriginalMember(owner = "client!tia", name = "Wb", descriptor = "Lwm;")
    public static class30 field10029;

    @OriginalMember(owner = "client!tia", name = "Zb", descriptor = "Lwm;")
    public static class30 field10032;

    @OriginalMember(owner = "client!tia", name = "Hb", descriptor = "Loq;")
    public static class775 field10014;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II[JB[Ljava/lang/Object;)V", line = 7)
    public static final void method4016(int arg0, int arg1, long[] arg2, byte arg3, Object[] arg4) {
        if (~arg1 < ~arg0) {
            int var5 = (arg0 - -arg1) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; ~arg1 < ~var11; ++var11) {
                if (arg2[var11] < (long) (var11 & var10) + var7) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method4016(arg0, var6 + -1, arg2, (byte) 55, arg4);
            method4016(var6 + 1, arg1, arg2, (byte) 55, arg4);
        }
        ++field10026;
        if (arg3 != 55) {
            method4016(-33, -64, (long[]) null, (byte) -101, (Object[]) null);
        }
    }

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "(B)Z", line = 68)
    public final boolean method4017(byte arg0) {
        if (arg0 != 61) {
            return false;
        } else {
            ++field10028;
            int var2 = 255 & super.field3193[super.field3133] + -this.field10021.method869(arg0 + -59);
            return var2 >= 128;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I[I)V", line = 85)
    public final void method4018(int arg0, int[] arg1) {
        ++field10015;
        int var3 = -73 % (-arg0 / 37);
        this.field10021 = new class152(arg1);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(III)Lpa;", line = 96)
    public static final class417 method4019(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        return var3 != null && var3.field10426 != null ? var3.field10426 : null;
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "(I)I", line = 103)
    public final int method4020(int arg0) {
        if (arg0 != -3781) {
            method4024(-127, -10, 122);
        }
        ++field10024;
        int var2 = 255 & super.field3193[super.field3133++] + -this.field10021.method865(1271483908);
        return var2 < 128 ? var2 : (var2 + -128 << 8) + (255 & super.field3193[super.field3133++] + -this.field10021.method865(1271483908));
    }

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "(B)V", line = 120)
    public final void method4021(byte arg0) {
        if (arg0 != 48) {
            this.method4023(false, 42);
        }
        this.field10030 = super.field3133 * 8;
        ++field10019;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lbw;B)V", line = 134)
    public final void method4022(class152 arg0, byte arg1) {
        this.field10021 = arg0;
        int var3 = 76 / ((arg1 - -14) / 55);
        ++field10018;
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(ZI)I", line = 144)
    public final int method4023(boolean arg0, int arg1) {
        ++field10013;
        if (!arg0) {
            return 46;
        } else {
            int var3 = this.field10030 >> 3;
            int var4 = -(this.field10030 & 7) + 8;
            int var5 = 0;
            this.field10030 += arg1;
            while (~arg1 < ~var4) {
                var5 += (class511.field6516[var4] & super.field3193[var3++]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 != var4) {
                var6 = (super.field3193[var3] >> var4 - arg1 & class511.field6516[arg1]) + var5;
            } else {
                var6 = (class511.field6516[var4] & super.field3193[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(III)I", line = 177)
    public static final int method4024(int arg0, int arg1, int arg2) {
        ++field10027;
        int var3 = 0;
        if (arg2 >= -2) {
            method4016(-101, -17, (long[]) null, (byte) -113, (Object[]) null);
        }
        while (~arg0 < -1) {
            var3 = 1 & arg1 | var3 << 1;
            --arg0;
            arg1 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "(II)I", line = 197)
    public static final int method4025(int arg0, int arg1) {
        ++field10025;
        return arg0 != 321171297 ? -50 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!tia", name = "A", descriptor = "(I)V", line = 212)
    public static void method4026(int arg0) {
        field10029 = null;
        if (arg0 == 691891335) {
            field10016 = null;
            field10032 = null;
            field10014 = null;
        }
    }

    @OriginalMember(owner = "client!tia", name = "p", descriptor = "(II)V", line = 228)
    public final void method4027(int arg0, int arg1) {
        ++field10017;
        super.field3193[super.field3133++] = (byte) (arg0 + this.field10021.method865(arg1 + 1271457919));
        if (arg1 != 25989) {
            field10016 = null;
        }
    }

    @OriginalMember(owner = "client!tia", name = "q", descriptor = "(II)I", line = 242)
    public final int method4028(int arg0, int arg1) {
        ++field10023;
        return arg1 != 8 ? -56 : arg0 * 8 + -this.field10030;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V", line = 254)
    public class740(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I[BII)V", line = 259)
    public final void method4029(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 <= 59) {
            this.method4028(-94, -7);
        }
        for (int var5 = 0; ~var5 > ~arg0; ++var5) {
            arg1[arg2 + var5] = (byte) (super.field3193[super.field3133++] + -this.field10021.method865(1271483908));
        }
        ++field10031;
    }

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "(Z)V", line = 292)
    public final void method4030(boolean arg0) {
        if (arg0) {
            method4025(115, -15);
        }
        ++field10020;
        super.field3133 = (this.field10030 + 7) / 8;
    }
}
