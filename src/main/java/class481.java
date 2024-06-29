import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class481 extends class611 {

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!bi", name = "Ib", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!bi", name = "Jb", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!bi", name = "Kb", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!bi", name = "Lb", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!bi", name = "Mb", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!bi", name = "Nb", descriptor = "I")
    private int field6640;

    @OriginalMember(owner = "client!bi", name = "Ob", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!bi", name = "Qb", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!bi", name = "Rb", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!bi", name = "Sb", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!bi", name = "Tb", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!bi", name = "Ub", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!bi", name = "Pb", descriptor = "Lhj;")
    private class570 field6642;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[BZ)V", line = 7)
    public final void method2696(int arg0, int arg1, byte[] arg2, boolean arg3) {
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg2[var5 - -arg0] = (byte) (super.field8529[super.field8520++] + -this.field6642.method3207(123));
        }
        if (!arg3) {
            this.method2706(true, -96);
        }
        ++field6639;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLhj;)V", line = 24)
    public final void method2697(byte arg0, class570 arg1) {
        if (arg0 >= -82) {
            this.method2700(-35);
        }
        ++field6637;
        this.field6642 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)I", line = 38)
    public static final int method2698(boolean arg0, int arg1) {
        if (arg1 != -31553) {
            field6634 = -49;
        }
        ++field6646;
        int var2 = class392.field5553;
        if (~var2 != -1) {
            if (~var2 != -2) {
                return ~var2 == -3 ? 0 : 0;
            } else {
                return class435.field6103;
            }
        } else {
            return !arg0 ? class435.field6103 : 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "(B)V", line = 79)
    public final void method2699(byte arg0) {
        if (arg0 != 120) {
            this.field6640 = -99;
        }
        ++field6638;
        super.field8520 = (this.field6640 - -7) / 8;
    }

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "(I)I", line = 96)
    public final int method2700(int arg0) {
        if (arg0 != 0) {
            this.field6642 = null;
        }
        ++field6645;
        int var2 = super.field8529[super.field8520++] - this.field6642.method3207(121) & 255;
        return ~var2 > -129 ? var2 : (var2 - 128 << 8) - -(255 & super.field8529[super.field8520++] - this.field6642.method3207(arg0 ^ 106));
    }

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "(I)V", line = 114)
    public final void method2701(int arg0) {
        ++field6636;
        if (arg0 != 0) {
            this.field6640 = 85;
        }
        this.field6640 = super.field8520 * 8;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(BI)I", line = 133)
    public final int method2702(byte arg0, int arg1) {
        ++field6635;
        int var3 = this.field6640 >> 3;
        if (arg0 > -5) {
            this.method2702((byte) 17, -106);
        }
        int var4 = -(this.field6640 & 7) + 8;
        this.field6640 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field8529[var3++] & class262.field3434[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class262.field3434[var4] & super.field8529[var3]) + var5;
        } else {
            var6 = (super.field8529[var3] >> var4 - arg1 & class262.field3434[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "(II)I", line = 163)
    public final int method2703(int arg0, int arg1) {
        int var3 = 90 % ((-63 - arg1) / 54);
        ++field6641;
        return arg0 * 8 - this.field6640;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V", line = 173)
    public class481(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([II)V", line = 177)
    public final void method2704(int[] arg0, int arg1) {
        if (arg1 == 255) {
            ++field6643;
            this.field6642 = new class570(arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "(B)Z", line = 190)
    public final boolean method2705(byte arg0) {
        if (arg0 != 54) {
            this.field6642 = null;
        }
        ++field6647;
        int var2 = 255 & super.field8529[super.field8520] + -this.field6642.method3208(arg0 + -51);
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZI)V", line = 211)
    public final void method2706(boolean arg0, int arg1) {
        if (arg0) {
            field6634 = -46;
        }
        super.field8529[super.field8520++] = (byte) (arg1 + this.field6642.method3207(84));
        ++field6644;
    }
}
