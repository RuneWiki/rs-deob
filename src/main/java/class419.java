import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class419 extends class276 {

    @OriginalMember(owner = "client!ck", name = "Jb", descriptor = "I")
    public static int field5850 = -1;

    @OriginalMember(owner = "client!ck", name = "Mb", descriptor = "[I")
    public static int[] field5853 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ck", name = "Sb", descriptor = "[[B")
    public static byte[][] field5859 = new byte[1000][];

    @OriginalMember(owner = "client!ck", name = "Fb", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ck", name = "Gb", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ck", name = "Ib", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ck", name = "Kb", descriptor = "I")
    private int field5851;

    @OriginalMember(owner = "client!ck", name = "Lb", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!ck", name = "Ob", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ck", name = "Pb", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ck", name = "Qb", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ck", name = "Rb", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ck", name = "Tb", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ck", name = "Nb", descriptor = "Lph;")
    public static class421 field5854;

    @OriginalMember(owner = "client!ck", name = "Hb", descriptor = "Lbs;")
    private class447 field5848;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
    public class419(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([IB)V")
    public final void method2456(int[] arg0, byte arg1) {
        this.field5848 = new class447(arg0);
        ++field5847;
        if (arg1 != 72) {
            this.method2463(-79, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "(B)V")
    public static void method2457(byte arg0) {
        if (arg0 < -67) {
            field5859 = null;
            field5853 = null;
            field5854 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "(I)Z")
    public final boolean method2458(int arg0) {
        ++field5856;
        if (arg0 >= -102) {
            field5853 = null;
        }
        int var2 = super.field4064[super.field4021] + -this.field5848.method2611(118) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "(I)V")
    public final void method2459(int arg0) {
        this.field5851 = super.field4021 * 8;
        ++field5852;
        if (arg0 != 0) {
            this.field5848 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "(I)I")
    public final int method2460(int arg0) {
        ++field5860;
        int var2 = arg0 & super.field4064[super.field4021++] + -this.field5848.method2610(-103);
        return ~var2 > -129 ? var2 : (255 & super.field4064[super.field4021++] + -this.field5848.method2610(arg0 + -175)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)V")
    public final void method2461(byte arg0, int arg1) {
        if (arg0 != 39) {
            field5854 = null;
        }
        ++field5846;
        super.field4064[super.field4021++] = (byte) (this.field5848.method2610(82) + arg1);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[B)V")
    public final void method2462(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field5849;
        for (int var5 = arg2; ~arg0 < ~var5; ++var5) {
            arg3[var5 - -arg1] = (byte) (super.field4064[super.field4021++] + -this.field5848.method2610(class125.method786(arg2, -85)));
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(IB)I")
    public final int method2463(int arg0, byte arg1) {
        if (arg1 > -96) {
            field5854 = null;
        }
        ++field5858;
        return arg0 * 8 + -this.field5851;
    }

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "(II)I")
    public final int method2464(int arg0, int arg1) {
        ++field5855;
        int var3 = this.field5851 >> 3;
        int var4 = -(this.field5851 & 7) + 8;
        int var5 = arg1;
        this.field5851 += arg0;
        while (~var4 > ~arg0) {
            var5 += (super.field4064[var3++] & class345.field5013[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (class345.field5013[var4] & super.field4064[var3]) + var5;
        } else {
            var6 = (super.field4064[var3] >> -arg0 + var4 & class345.field5013[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(Z)V")
    public final void method2465(boolean arg0) {
        if (!arg0) {
            super.field4021 = (this.field5851 + 7) / 8;
            ++field5857;
        }
    }
}
