import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class436 extends class365 {

    @OriginalMember(owner = "client!a", name = "Cb", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!a", name = "Db", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!a", name = "Gb", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!a", name = "Hb", descriptor = "I")
    private int field6351;

    @OriginalMember(owner = "client!a", name = "Ib", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!a", name = "Jb", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!a", name = "Kb", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!a", name = "Lb", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!a", name = "Mb", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!a", name = "Nb", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!a", name = "Ob", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!a", name = "Pb", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!a", name = "Qb", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!a", name = "Eb", descriptor = "Luh;")
    private class112 field6348;

    @OriginalMember(owner = "client!a", name = "Fb", descriptor = "Ltj;")
    public static class131 field6349;

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V", line = 4)
    public class436(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I[BII)V", line = 7)
    public final void method2596(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg3; ~var5 > ~arg0; ++var5) {
            arg1[var5 - -arg2] = (byte) (super.field5073[super.field5069++] + -this.field6348.method719(true));
        }
        ++field6358;
    }

    @OriginalMember(owner = "client!a", name = "t", descriptor = "(I)V", line = 23)
    public final void method2597(int arg0) {
        this.field6351 = super.field5069 * 8;
        if (arg0 < 112) {
            this.field6348 = null;
        }
        ++field6353;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[I)V", line = 34)
    public final void method2598(int arg0, int[] arg1) {
        this.field6348 = new class112(arg1);
        if (arg0 == -500891966) {
            ++field6357;
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(BI)I", line = 47)
    public final int method2599(byte arg0, int arg1) {
        ++field6350;
        int var3 = this.field6351 >> 3;
        if (arg0 != 98) {
            this.method2598(84, (int[]) null);
        }
        int var4 = -(this.field6351 & 7) + 8;
        this.field6351 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (super.field5073[var3++] & class504.field7417[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field5073[var3] >> var4 - arg1 & class504.field7417[arg1]) + var5;
        } else {
            var6 = (super.field5073[var3] & class504.field7417[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)Z", line = 86)
    public static final boolean method2600(int arg0, byte arg1, int arg2) {
        ++field6356;
        if (arg1 != -127) {
            method2604(true);
        }
        return ~(1408 & arg2) != -1;
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(B)V", line = 97)
    public final void method2601(byte arg0) {
        ++field6354;
        super.field5069 = (this.field6351 + 7) / 8;
        if (arg0 != 56) {
            this.method2605(34);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IB)V", line = 112)
    public final void method2602(int arg0, byte arg1) {
        ++field6360;
        super.field5073[super.field5069++] = (byte) (this.field6348.method719(true) + arg0);
        if (arg1 != 71) {
            this.method2599((byte) 115, -125);
        }
    }

    @OriginalMember(owner = "client!a", name = "k", descriptor = "(II)I", line = 126)
    public final int method2603(int arg0, int arg1) {
        ++field6355;
        if (arg0 != 1825) {
            this.method2605(-123);
        }
        return arg1 * 8 + -this.field6351;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Z)V", line = 137)
    public static void method2604(boolean arg0) {
        field6349 = null;
        if (arg0) {
            field6349 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "u", descriptor = "(I)Z", line = 157)
    public final boolean method2605(int arg0) {
        ++field6359;
        int var2 = arg0 & super.field5073[super.field5069] - this.field6348.method718(115);
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!a", name = "o", descriptor = "(B)I", line = 171)
    public final int method2606(byte arg0) {
        ++field6346;
        int var2 = super.field5073[super.field5069++] + -this.field6348.method719(true) & 255;
        if (arg0 >= -111) {
            return -103;
        } else {
            return var2 < 128 ? var2 : (var2 - 128 << 8) - -(255 & super.field5073[super.field5069++] - this.field6348.method719(true));
        }
    }
}
