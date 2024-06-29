import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class204 extends class11 {

    @OriginalMember(owner = "client!nj", name = "Fb", descriptor = "[F")
    public static float[] field2856 = new float[4];

    @OriginalMember(owner = "client!nj", name = "Ib", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!nj", name = "Nb", descriptor = "[B")
    public static byte[] field2864 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!nj", name = "Pb", descriptor = "B")
    public static byte field2866;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!nj", name = "Db", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!nj", name = "Gb", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!nj", name = "Hb", descriptor = "I")
    private int field2858;

    @OriginalMember(owner = "client!nj", name = "Jb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!nj", name = "Kb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!nj", name = "Lb", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!nj", name = "Mb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!nj", name = "Ob", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!nj", name = "Qb", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!nj", name = "Rb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!nj", name = "Eb", descriptor = "Lbb;")
    private class278 field2855;

    @OriginalMember(owner = "client!nj", name = "Sb", descriptor = "Lel;")
    public static class468 field2869;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "(I)V")
    public static void method1231(int arg0) {
        if (arg0 == 7) {
            field2869 = null;
            field2864 = null;
            field2856 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "(B)I")
    public final int method1232(byte arg0) {
        ++field2853;
        if (arg0 != 46) {
            return -127;
        } else {
            int var2 = super.field138[super.field165++] + -this.field2855.method1790(256) & 255;
            return ~var2 > -129 ? var2 : (var2 + -128 << 8) - -(super.field138[super.field165++] + -this.field2855.method1790(256) & 255);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([II)V")
    public final void method1233(int[] arg0, int arg1) {
        this.field2855 = new class278(arg0);
        ++field2865;
        if (arg1 != 7686) {
            this.method1234(17);
        }
    }

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "(I)Z")
    public final boolean method1234(int arg0) {
        ++field2863;
        int var2 = super.field138[super.field165] + -this.field2855.method1789(-10160) & 255;
        if (arg0 > -98) {
            this.method1232((byte) -47);
        }
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(IB)I")
    public final int method1235(int arg0, byte arg1) {
        if (arg1 != -48) {
            return 125;
        } else {
            ++field2854;
            return arg0 * 8 + -this.field2858;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(ZI)V")
    public final void method1236(boolean arg0, int arg1) {
        if (!arg0) {
            field2866 = -127;
        }
        ++field2860;
        super.field138[super.field165++] = (byte) (arg1 + this.field2855.method1790(256));
    }

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "(II)I")
    public final int method1237(int arg0, int arg1) {
        if (arg0 != 592256579) {
            return 31;
        } else {
            ++field2862;
            int var3 = this.field2858 >> 3;
            int var4 = -(7 & this.field2858) + 8;
            int var5 = 0;
            this.field2858 += arg1;
            while (var4 < arg1) {
                var5 += (class239.field3334[var4] & super.field138[var3++]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 != var4) {
                var6 = (super.field138[var3] >> -arg1 + var4 & class239.field3334[arg1]) + var5;
            } else {
                var6 = (class239.field3334[var4] & super.field138[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "([BIII)V")
    public final void method1238(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 25768) {
            field2869 = null;
        }
        for (int var5 = 0; ~arg2 < ~var5; ++var5) {
            arg0[arg1 + var5] = (byte) (super.field138[super.field165++] + -this.field2855.method1790(class133.method898(arg3, 26024)));
        }
        ++field2857;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
    public class204(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "(I)V")
    public final void method1239(int arg0) {
        super.field165 = (this.field2858 + 7) / arg0;
        ++field2861;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(Z)V")
    public final void method1240(boolean arg0) {
        this.field2858 = super.field165 * 8;
        ++field2868;
        if (arg0) {
            this.field2855 = null;
        }
    }
}
