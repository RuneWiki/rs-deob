import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class757 extends class179 {

    @OriginalMember(owner = "client!dfa", name = "Mb", descriptor = "Z")
    public static boolean field10545 = false;

    @OriginalMember(owner = "client!dfa", name = "Fb", descriptor = "I")
    public static int field10538 = 0;

    @OriginalMember(owner = "client!dfa", name = "Db", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!dfa", name = "Eb", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!dfa", name = "Hb", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!dfa", name = "Ib", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!dfa", name = "Jb", descriptor = "I")
    public static int field10542;

    @OriginalMember(owner = "client!dfa", name = "Kb", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!dfa", name = "Lb", descriptor = "I")
    public static int field10544;

    @OriginalMember(owner = "client!dfa", name = "Nb", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!dfa", name = "Ob", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!dfa", name = "Pb", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!dfa", name = "Qb", descriptor = "I")
    private int field10549;

    @OriginalMember(owner = "client!dfa", name = "Gb", descriptor = "Lrr;")
    private class395 field10539;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "(II)I")
    public final int method4206(int arg0, int arg1) {
        ++field10543;
        int var3 = this.field10549 >> 3;
        int var4 = -119 % ((arg1 - 59) / 36);
        int var5 = -(7 & this.field10549) + 8;
        this.field10549 += arg0;
        int var6 = 0;
        while (var5 < arg0) {
            var6 += (super.field2325[var3++] & class677.field9202[var5]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (~arg0 != ~var5) {
            var7 = (super.field2325[var3] >> -arg0 + var5 & class677.field9202[arg0]) + var6;
        } else {
            var7 = (super.field2325[var3] & class677.field9202[var5]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "(B)Z")
    public final boolean method4207(byte arg0) {
        ++field10542;
        int var2 = 71 % ((-43 - arg0) / 61);
        int var3 = super.field2325[super.field2354] + -this.field10539.method2350(256) & 255;
        return ~var3 <= -129;
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(IB)I")
    public final int method4208(int arg0, byte arg1) {
        ++field10547;
        return arg1 != 37 ? 78 : arg0 * 8 + -this.field10549;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B[I)V")
    public final void method4209(byte arg0, int[] arg1) {
        if (arg0 <= 104) {
            this.field10539 = null;
        }
        this.field10539 = new class395(arg1);
        ++field10541;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLrr;)V")
    public final void method4210(byte arg0, class395 arg1) {
        ++field10536;
        if (arg0 != -103) {
            this.method4208(-102, (byte) -61);
        }
        this.field10539 = arg1;
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
    public class757(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "(I)I")
    public final int method4211(int arg0) {
        ++field10540;
        if (arg0 != 1526808035) {
            return 123;
        } else {
            int var2 = 255 & super.field2325[super.field2354++] - this.field10539.method2353(arg0 + -1526807911);
            return var2 < 128 ? var2 : (var2 + -128 << 8) + (255 & super.field2325[super.field2354++] + -this.field10539.method2353(118));
        }
    }

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "(B)V")
    public final void method4212(byte arg0) {
        this.field10549 = super.field2354 * 8;
        if (arg0 != -125) {
            field10545 = false;
        }
        ++field10544;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[BII)V")
    public final void method4213(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field10546;
        if (arg0 == -4118) {
            for (int var5 = 0; arg2 > var5; ++var5) {
                arg1[arg3 + var5] = (byte) (super.field2325[super.field2354++] + -this.field10539.method2353(123));
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "(Z)V")
    public final void method4214(boolean arg0) {
        if (!arg0) {
            ++field10537;
            super.field2354 = (this.field10549 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "(BI)V")
    public final void method4215(byte arg0, int arg1) {
        super.field2325[super.field2354++] = (byte) (arg1 + this.field10539.method2353(121));
        ++field10548;
        if (arg0 <= 45) {
            this.field10539 = null;
        }
    }
}
