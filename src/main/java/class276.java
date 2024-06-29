import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class276 extends class677 {

    @OriginalMember(owner = "client!wd", name = "Fb", descriptor = "Lhda;")
    public static class752 field3841 = new class752(107, 6);

    @OriginalMember(owner = "client!wd", name = "Mb", descriptor = "Lqr;")
    public static class65 field3848 = new class65(128, 4);

    @OriginalMember(owner = "client!wd", name = "Ob", descriptor = "Lhda;")
    public static class752 field3850 = new class752(57, 6);

    @OriginalMember(owner = "client!wd", name = "Pb", descriptor = "Llu;")
    public static class714 field3851 = new class714(2);

    @OriginalMember(owner = "client!wd", name = "Bb", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!wd", name = "Cb", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!wd", name = "Db", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!wd", name = "Eb", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!wd", name = "Gb", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!wd", name = "Hb", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!wd", name = "Ib", descriptor = "I")
    private int field3844;

    @OriginalMember(owner = "client!wd", name = "Jb", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!wd", name = "Kb", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!wd", name = "Lb", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!wd", name = "Nb", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!wd", name = "Rb", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!wd", name = "Qb", descriptor = "Llg;")
    private class417 field3852;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[I)V")
    public final void method1654(byte arg0, int[] arg1) {
        this.field3852 = new class417(arg1);
        if (arg0 > 89) {
            ++field3847;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)I")
    public final int method1655(boolean arg0, int arg1) {
        if (arg0) {
            this.method1655(true, -34);
        }
        ++field3840;
        return arg1 * 8 + -this.field3844;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(ZI)V")
    public final void method1656(boolean arg0, int arg1) {
        if (arg0) {
            method1658(-91);
        }
        super.field9399[super.field9419++] = (byte) (this.field3852.method2418((byte) -128) + arg1);
        ++field3842;
    }

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "(I)I")
    public final int method1657(int arg0) {
        ++field3849;
        int var2 = super.field9399[super.field9419++] + -this.field3852.method2418((byte) -124) & 255;
        if (arg0 > -50) {
            this.method1654((byte) -8, (int[]) null);
        }
        return ~var2 > -129 ? var2 : (super.field9399[super.field9419++] - this.field3852.method2418((byte) -125) & 255) + (var2 - 128 << 8);
    }

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "(I)V")
    public static void method1658(int arg0) {
        if (arg0 == 128) {
            field3841 = null;
            field3848 = null;
            field3850 = null;
            field3851 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BBI)V")
    public final void method1659(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field3839;
        int var5 = 0;
        int var6 = -50 % ((-8 - arg2) / 47);
        while (arg0 > var5) {
            arg1[arg3 + var5] = (byte) (super.field9399[super.field9419++] + -this.field3852.method2418((byte) -122));
            ++var5;
        }
    }

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "(I)V")
    public final void method1660(int arg0) {
        super.field9419 = (this.field3844 + 7) / 8;
        if (arg0 > -33) {
            field3848 = null;
        }
        ++field3846;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(Z)V")
    public final void method1661(boolean arg0) {
        this.field3844 = super.field9419 * 8;
        if (arg0) {
            ++field3838;
        }
    }

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "(I)Z")
    public final boolean method1662(int arg0) {
        ++field3845;
        if (arg0 != 1682588262) {
            return true;
        } else {
            int var2 = super.field9399[super.field9419] - this.field3852.method2419((byte) 126) & 255;
            return ~var2 <= -129;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Llg;I)V")
    public final void method1663(class417 arg0, int arg1) {
        if (arg1 == 8) {
            ++field3837;
            this.field3852 = arg0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "(II)I")
    public final int method1664(int arg0, int arg1) {
        ++field3843;
        int var3 = this.field3844 >> 3;
        int var4 = -(this.field3844 & 7) + 8;
        int var5 = 0;
        if (arg0 != 2059) {
            return 119;
        } else {
            this.field3844 += arg1;
            while (var4 < arg1) {
                var5 += (class161.field2408[var4] & super.field9399[var3++]) << arg1 - var4;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 == var4) {
                var6 = (super.field9399[var3] & class161.field2408[var4]) + var5;
            } else {
                var6 = (super.field9399[var3] >> -arg1 + var4 & class161.field2408[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        super(arg0);
    }
}
