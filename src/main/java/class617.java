import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class617 extends class452 {

    @OriginalMember(owner = "client!lt", name = "Gb", descriptor = "Lgl;")
    public static class547 field8682 = new class547(15, 2);

    @OriginalMember(owner = "client!lt", name = "Eb", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!lt", name = "Fb", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!lt", name = "Hb", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!lt", name = "Jb", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!lt", name = "Kb", descriptor = "I")
    private int field8686;

    @OriginalMember(owner = "client!lt", name = "Lb", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!lt", name = "Mb", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!lt", name = "Nb", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!lt", name = "Ob", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!lt", name = "Pb", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!lt", name = "Ib", descriptor = "Lffa;")
    private class169 field8684;

    @OriginalMember(owner = "client!lt", name = "Db", descriptor = "Lq;")
    public static class389 field8679;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([BIBI)V", line = 7)
    public final void method3458(byte[] arg0, int arg1, byte arg2, int arg3) {
        int var5 = -44 / ((arg2 - 71) / 47);
        for (int var6 = 0; var6 < arg1; ++var6) {
            arg0[arg3 + var6] = (byte) (super.field6209[super.field6215++] + -this.field8684.method1010(-127));
        }
        ++field8690;
    }

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "(B)V", line = 29)
    public final void method3459(byte arg0) {
        this.field8686 = super.field6215 * 8;
        ++field8688;
        if (arg0 != -116) {
            this.field8684 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "(I)I", line = 44)
    public final int method3460(int arg0) {
        if (arg0 >= -32) {
            field8679 = null;
        }
        ++field8685;
        int var2 = 255 & super.field6209[super.field6215++] + -this.field8684.method1010(-123);
        return var2 < 128 ? var2 : (super.field6209[super.field6215++] - this.field8684.method1010(-113) & 255) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!lt", name = "y", descriptor = "(I)Z", line = 62)
    public final boolean method3461(int arg0) {
        ++field8689;
        if (arg0 < 91) {
            this.method3460(88);
        }
        int var2 = 255 & super.field6209[super.field6215] + -this.field8684.method1011((byte) -1);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([IB)V", line = 80)
    public final void method3462(int[] arg0, byte arg1) {
        this.field8684 = new class169(arg0);
        ++field8683;
        if (arg1 != -110) {
            this.method3464(39, 11);
        }
    }

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "(B)V", line = 91)
    public final void method3463(byte arg0) {
        ++field8681;
        if (arg0 == 104) {
            super.field6215 = (this.field8686 - -7) / 8;
        }
    }

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "(II)I", line = 103)
    public final int method3464(int arg0, int arg1) {
        if (arg0 < 30) {
            method3466((byte) -88);
        }
        ++field8680;
        return arg1 * 8 - this.field8686;
    }

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "(IB)I", line = 114)
    public final int method3465(int arg0, byte arg1) {
        if (arg1 > -78) {
            this.method3464(-69, -122);
        }
        ++field8687;
        int var3 = this.field8686 >> 3;
        int var4 = -(this.field8686 & 7) + 8;
        int var5 = 0;
        this.field8686 += arg0;
        while (var4 < arg0) {
            var5 += (super.field6209[var3++] & class39.field424[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (class39.field424[var4] & super.field6209[var3]) + var5;
        } else {
            var6 = (super.field6209[var3] >> -arg0 + var4 & class39.field424[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "(B)V", line = 144)
    public static void method3466(byte arg0) {
        field8682 = null;
        if (arg0 >= 90) {
            field8679 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "(IZ)V", line = 156)
    public final void method3467(int arg0, boolean arg1) {
        if (!arg1) {
            this.field8684 = null;
        }
        super.field6209[super.field6215++] = (byte) (arg0 + this.field8684.method1010(9));
        ++field8691;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V", line = 168)
    public class617(int arg0) {
        super(arg0);
    }
}
