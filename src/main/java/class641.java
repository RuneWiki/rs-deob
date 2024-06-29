import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class641 extends class61 {

    @OriginalMember(owner = "client!bw", name = "Sb", descriptor = "Z")
    public static boolean field9232 = false;

    @OriginalMember(owner = "client!bw", name = "Gb", descriptor = "Ljv;")
    public static class71 field9220 = new class71();

    @OriginalMember(owner = "client!bw", name = "Db", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!bw", name = "Eb", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!bw", name = "Fb", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!bw", name = "Hb", descriptor = "I")
    private int field9221;

    @OriginalMember(owner = "client!bw", name = "Ib", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!bw", name = "Jb", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!bw", name = "Kb", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!bw", name = "Lb", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!bw", name = "Mb", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!bw", name = "Nb", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!bw", name = "Ob", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!bw", name = "Pb", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!bw", name = "Rb", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!bw", name = "Qb", descriptor = "Lrh;")
    private class244 field9230;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "(I)V")
    public final void method3647(int arg0) {
        if (arg0 >= -25) {
            this.method3652(94, (class244) null);
        }
        ++field9223;
        super.field1393 = (this.field9221 + 7) / 8;
    }

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "(II)I")
    public final int method3648(int arg0, int arg1) {
        ++field9217;
        int var3 = this.field9221 >> 3;
        int var4 = 8 - (7 & this.field9221);
        int var5 = 0;
        this.field9221 += arg1;
        while (~var4 > ~arg1) {
            var5 += (class662.field9535[var4] & super.field1397[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field1397[var3] >> var4 - arg1 & class662.field9535[arg1]) + var5;
        } else {
            var6 = (super.field1397[var3] & class662.field9535[var4]) + var5;
        }
        int var7 = 18 % (arg0 / 59);
        return var6;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(I)V")
    public class641(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "(B)V")
    public static void method3649(byte arg0) {
        if (arg0 <= 63) {
            field9220 = null;
        }
        field9220 = null;
    }

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "(B)V")
    public final void method3650(byte arg0) {
        this.field9221 = super.field1393 * 8;
        if (arg0 <= 28) {
            this.field9230 = null;
        }
        ++field9228;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(III[B)V")
    public final void method3651(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field9226;
        for (int var5 = 0; ~var5 > ~arg2; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field1397[super.field1393++] + -this.field9230.method1615(class691.method3871(arg1, 18796)));
        }
        if (arg1 != -18797) {
            this.method3650((byte) 105);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILrh;)V")
    public final void method3652(int arg0, class244 arg1) {
        this.field9230 = arg1;
        if (arg0 != -96799165) {
            this.field9230 = null;
        }
        ++field9224;
    }

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "(B)Z")
    public final boolean method3653(byte arg0) {
        ++field9227;
        if (arg0 != -81) {
            return false;
        } else {
            int var2 = 255 & super.field1397[super.field1393] + -this.field9230.method1613(115);
            return ~var2 <= -129;
        }
    }

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "(II)V")
    public final void method3654(int arg0, int arg1) {
        ++field9222;
        super.field1397[super.field1393++] = (byte) (this.field9230.method1615(-1) + arg1);
        if (arg0 > -107) {
            method3657((byte) 49);
        }
    }

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "(II)I")
    public final int method3655(int arg0, int arg1) {
        if (arg0 != 1092933384) {
            method3657((byte) -40);
        }
        ++field9219;
        return arg1 * 8 + -this.field9221;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "([II)V")
    public final void method3656(int[] arg0, int arg1) {
        ++field9231;
        this.field9230 = new class244(arg0);
        if (arg1 != 255) {
            this.method3652(61, (class244) null);
        }
    }

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "(B)[Lia;")
    public static final class547[] method3657(byte arg0) {
        ++field9218;
        return arg0 >= -116 ? null : new class547[] { class506.field7181, class619.field8964, class224.field3360 };
    }

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "(B)I")
    public final int method3658(byte arg0) {
        if (arg0 != -10) {
            this.method3654(69, -16);
        }
        ++field9229;
        int var2 = super.field1397[super.field1393++] + -this.field9230.method1615(-1) & 255;
        return ~var2 > -129 ? var2 : (var2 + -128 << 8) - -(255 & super.field1397[super.field1393++] - this.field9230.method1615(arg0 ^ 9));
    }
}
