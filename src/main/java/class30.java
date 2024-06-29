import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class30 extends class630 {

    @OriginalMember(owner = "client!ks", name = "Pb", descriptor = "Lwp;")
    public static class453 field430 = new class453(33, -1);

    @OriginalMember(owner = "client!ks", name = "Qb", descriptor = "F")
    public static float field431;

    @OriginalMember(owner = "client!ks", name = "Db", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ks", name = "Eb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ks", name = "Fb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ks", name = "Gb", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ks", name = "Hb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ks", name = "Ib", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ks", name = "Jb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ks", name = "Kb", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!ks", name = "Lb", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ks", name = "Mb", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ks", name = "Nb", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ks", name = "Ob", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ks", name = "Rb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ks", name = "Tb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ks", name = "Ub", descriptor = "Lsa;")
    public static class595 field435;

    @OriginalMember(owner = "client!ks", name = "Sb", descriptor = "Lhr;")
    private class608 field433;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "(II)V")
    public final void method197(int arg0, int arg1) {
        if (arg0 != 26951) {
            this.method205(73, 76, (byte[]) null, 84);
        }
        ++field429;
        super.field8804[super.field8812++] = (byte) (arg1 + this.field433.method3322(21));
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLhr;)V")
    public final void method198(byte arg0, class608 arg1) {
        ++field420;
        this.field433 = arg1;
        int var3 = 94 % ((arg0 - 48) / 44);
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(Z)I")
    public final int method199(boolean arg0) {
        ++field428;
        if (arg0) {
            return -114;
        } else {
            int var2 = 255 & super.field8804[super.field8812++] - this.field433.method3322(-80);
            return ~var2 > -129 ? var2 : (255 & super.field8804[super.field8812++] - this.field433.method3322(-90)) + (var2 - 128 << 8);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)I")
    public final int method200(boolean arg0, int arg1) {
        ++field426;
        int var3 = this.field425 >> 3;
        int var4 = 8 - (this.field425 & 7);
        this.field425 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (super.field8804[var3++] & class372.field4700[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0) {
            field430 = null;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class372.field4700[var4] & super.field8804[var3]) + var5;
        } else {
            var6 = (super.field8804[var3] >> -arg1 + var4 & class372.field4700[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(ZI)I")
    public final int method201(boolean arg0, int arg1) {
        if (arg0) {
            field435 = null;
        }
        ++field424;
        return arg1 * 8 + -this.field425;
    }

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "(B)V")
    public static final void method202(byte arg0) {
        for (class164 var1 = (class164) class236.field2953.method237(102); var1 != null; var1 = (class164) class236.field2953.method245((byte) 77)) {
            if (var1.field2154) {
                var1.method937((byte) -99);
            }
        }
        ++field423;
        if (arg0 < 12) {
            field431 = -0.95168245F;
        }
        for (class164 var2 = (class164) class702.field9921.method237(91); var2 != null; var2 = (class164) class702.field9921.method245((byte) 52)) {
            if (var2.field2154) {
                var2.method937((byte) -99);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "(I)V")
    public static void method203(int arg0) {
        if (arg0 == 28554) {
            field430 = null;
            field435 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "(B)Z")
    public final boolean method204(byte arg0) {
        ++field427;
        int var2 = super.field8804[super.field8812] + -this.field433.method3326((byte) 86) & 255;
        if (arg0 != 17) {
            this.field433 = null;
        }
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[BI)V")
    public final void method205(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg2[var5 - -arg0] = (byte) (super.field8804[super.field8812++] + -this.field433.method3322(120));
        }
        int var6 = -38 % ((arg3 - -10) / 44);
        ++field418;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
    public class30(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "(B)V")
    public final void method206(byte arg0) {
        super.field8812 = (this.field425 + 7) / 8;
        if (arg0 <= -41) {
            ++field421;
        }
    }

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "(I)V")
    public final void method207(int arg0) {
        this.field425 = super.field8812 * arg0;
        ++field419;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B[I)V")
    public final void method208(byte arg0, int[] arg1) {
        ++field422;
        this.field433 = new class608(arg1);
        if (arg0 >= -3) {
            this.field425 = 37;
        }
    }
}
