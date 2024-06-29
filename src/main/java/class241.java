import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class241 extends class403 {

    @OriginalMember(owner = "client!jp", name = "Fb", descriptor = "Ldu;")
    public static class242 field3504;

    @OriginalMember(owner = "client!jp", name = "Eb", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!jp", name = "Gb", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!jp", name = "Hb", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!jp", name = "Ib", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!jp", name = "Jb", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!jp", name = "Kb", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!jp", name = "Lb", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!jp", name = "Mb", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!jp", name = "Nb", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!jp", name = "Qb", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!jp", name = "Rb", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!jp", name = "Pb", descriptor = "Loo;")
    private class450 field3514;

    @OriginalMember(owner = "client!jp", name = "Ob", descriptor = "[I")
    public static int[] field3513;

    static {
        new class530("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3504 = new class242(7, 4);
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "(Z)V", line = 4)
    public final void method1514(boolean arg0) {
        if (arg0) {
            this.method1518(-3);
        }
        ++field3508;
        super.field5665 = (this.field3516 + 7) / 8;
    }

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "(I)V", line = 15)
    public final void method1515(int arg0) {
        this.field3516 = super.field5665 * 8;
        if (arg0 != -2044015643) {
            this.method1523(20, 15);
        }
        ++field3503;
    }

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "(B)Z", line = 27)
    public final boolean method1516(byte arg0) {
        ++field3509;
        int var2 = super.field5663[super.field5665] + -this.field3514.method2631(232576748) & 255;
        if (~var2 > -129) {
            return false;
        } else {
            int var3 = 76 % ((arg0 - 25) / 48);
            return true;
        }
    }

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "(B)V", line = 54)
    public static void method1517(byte arg0) {
        field3513 = null;
        if (arg0 != 0) {
            field3504 = null;
        }
        field3504 = null;
    }

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "(I)I", line = 70)
    public final int method1518(int arg0) {
        ++field3511;
        int var2 = 255 & super.field5663[super.field5665++] + -this.field3514.method2637(arg0 ^ 28);
        if (var2 < 128) {
            return var2;
        } else {
            return arg0 != -128 ? -124 : (super.field5663[super.field5665++] - this.field3514.method2637(-108) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([IZ)V", line = 100)
    public final void method1519(int[] arg0, boolean arg1) {
        this.field3514 = new class450(arg0);
        if (arg1) {
            field3504 = null;
        }
        ++field3506;
    }

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "(II)I", line = 111)
    public final int method1520(int arg0, int arg1) {
        ++field3507;
        int var3 = this.field3516 >> 3;
        int var4 = -(7 & this.field3516) + 8;
        int var5 = 0;
        this.field3516 += arg1;
        if (arg0 != -12494) {
            this.method1523(-50, 103);
        }
        while (~var4 > ~arg1) {
            var5 += (class459.field6423[var4] & super.field5663[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field5663[var3] >> -arg1 + var4 & class459.field6423[arg1]) + var5;
        } else {
            var6 = (super.field5663[var3] & class459.field6423[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([BIII)V", line = 150)
    public final void method1521(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 438851265) {
            this.method1516((byte) -117);
        }
        for (int var5 = 0; ~arg3 < ~var5; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field5663[super.field5665++] + -this.field3514.method2637(-78));
        }
        ++field3510;
    }

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "(II)I", line = 169)
    public final int method1522(int arg0, int arg1) {
        if (arg0 != 8) {
            this.field3514 = null;
        }
        ++field3505;
        return arg1 * 8 + -this.field3516;
    }

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "(II)V", line = 182)
    public final void method1523(int arg0, int arg1) {
        if (arg0 == 9823) {
            ++field3515;
            super.field5663[super.field5665++] = (byte) (arg1 + this.field3514.method2637(-119));
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I)V", line = 193)
    public class241(int arg0) {
        super(arg0);
    }
}
