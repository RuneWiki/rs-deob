import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class179 extends class244 {

    @OriginalMember(owner = "client!wp", name = "Db", descriptor = "[I")
    public static int[] field2102 = new int[4];

    @OriginalMember(owner = "client!wp", name = "Hb", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!wp", name = "Ib", descriptor = "I")
    public static int field2107 = 0;

    @OriginalMember(owner = "client!wp", name = "Cb", descriptor = "Z")
    public static boolean field2101 = false;

    @OriginalMember(owner = "client!wp", name = "zb", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!wp", name = "Eb", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!wp", name = "Fb", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!wp", name = "Gb", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!wp", name = "Jb", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!wp", name = "Kb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!wp", name = "Lb", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!wp", name = "Mb", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!wp", name = "Nb", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!wp", name = "Ob", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!wp", name = "Pb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!wp", name = "Ab", descriptor = "Lub;")
    private class20 field2099;

    @OriginalMember(owner = "client!wp", name = "Bb", descriptor = "Loh;")
    public static class404 field2100;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([IB)V", line = 4)
    public final void method1100(int[] arg0, byte arg1) {
        ++field2110;
        this.field2099 = new class20(arg0);
        if (arg1 != 47) {
            this.field2099 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(BI)I", line = 17)
    public final int method1101(byte arg0, int arg1) {
        ++field2113;
        if (arg0 > -15) {
            field2101 = true;
        }
        return arg1 * 8 + -this.field2112;
    }

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "(II)I", line = 30)
    public final int method1102(int arg0, int arg1) {
        if (arg0 != 255) {
            return 43;
        } else {
            ++field2108;
            int var3 = this.field2112 >> 3;
            int var4 = -(this.field2112 & 7) + 8;
            int var5 = 0;
            this.field2112 += arg1;
            while (var4 < arg1) {
                var5 += (super.field2912[var3++] & class47.field508[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 == ~var4) {
                var6 = (super.field2912[var3] & class47.field508[var4]) + var5;
            } else {
                var6 = (super.field2912[var3] >> -arg1 + var4 & class47.field508[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "(B)Z", line = 60)
    public final boolean method1103(byte arg0) {
        ++field2098;
        int var2 = super.field2912[super.field2903] - this.field2099.method90(false) & 255;
        if (arg0 != 73) {
            this.method1101((byte) -37, 94);
        }
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lub;B)V", line = 81)
    public final void method1104(class20 arg0, byte arg1) {
        ++field2105;
        this.field2099 = arg0;
        if (arg1 != -63) {
            this.method1108(34);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V", line = 92)
    public class179(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(Z)V", line = 96)
    public static void method1105(boolean arg0) {
        field2102 = null;
        field2100 = null;
        if (arg0) {
            method1105(false);
        }
    }

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "(I)V", line = 108)
    public final void method1106(int arg0) {
        ++field2103;
        int var2 = -20 % ((arg0 - -67) / 36);
        super.field2903 = (this.field2112 + 7) / 8;
    }

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "(II)V", line = 128)
    public final void method1107(int arg0, int arg1) {
        ++field2109;
        if (arg0 != 0) {
            this.field2112 = -67;
        }
        super.field2912[super.field2903++] = (byte) (arg1 + this.field2099.method94(-5583));
    }

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "(I)V", line = 145)
    public final void method1108(int arg0) {
        if (arg0 > -99) {
            this.method1110(125, (byte[]) null, 5, -92);
        }
        ++field2111;
        this.field2112 = super.field2903 * 8;
    }

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "(I)I", line = 160)
    public final int method1109(int arg0) {
        if (arg0 != 0) {
            this.method1102(-94, -20);
        }
        ++field2104;
        int var2 = super.field2912[super.field2903++] + -this.field2099.method94(-5583) & 255;
        return ~var2 > -129 ? var2 : (super.field2912[super.field2903++] - this.field2099.method94(-5583) & 255) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I[BII)V", line = 187)
    public final void method1110(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg2; var5 < arg0; ++var5) {
            arg1[arg3 + var5] = (byte) (super.field2912[super.field2903++] + -this.field2099.method94(arg2 + -5583));
        }
        ++field2114;
    }
}
