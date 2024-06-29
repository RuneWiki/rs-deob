import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class638 extends class572 {

    @OriginalMember(owner = "client!qf", name = "Nb", descriptor = "I")
    public static int field8648 = 0;

    @OriginalMember(owner = "client!qf", name = "zb", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!qf", name = "Ab", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!qf", name = "Bb", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!qf", name = "Cb", descriptor = "I")
    private int field8637;

    @OriginalMember(owner = "client!qf", name = "Db", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!qf", name = "Eb", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!qf", name = "Gb", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!qf", name = "Hb", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!qf", name = "Jb", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!qf", name = "Kb", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!qf", name = "Lb", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!qf", name = "Mb", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!qf", name = "Ob", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!qf", name = "Pb", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!qf", name = "Qb", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!qf", name = "Fb", descriptor = "Ltu;")
    private class324 field8640;

    @OriginalMember(owner = "client!qf", name = "Ib", descriptor = "Lps;")
    public static class86 field8643;

    @OriginalMember(owner = "client!qf", name = "Rb", descriptor = "[Lxa;")
    public static class468[] field8652;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLtu;)V")
    public final void method3572(byte arg0, class324 arg1) {
        ++field8645;
        this.field8640 = arg1;
        int var3 = -83 / ((arg0 - 4) / 50);
    }

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "(I)V")
    public static void method3573(int arg0) {
        field8652 = null;
        if (arg0 < -99) {
            field8643 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "(I)I")
    public final int method3574(int arg0) {
        ++field8636;
        int var2 = super.field7318[super.field7313++] + -this.field8640.method1869(false) & 255;
        return ~var2 > arg0 ? var2 : (var2 + -128 << 8) + (super.field7318[super.field7313++] - this.field8640.method1869(false) & 255);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[I)V")
    public final void method3575(int arg0, int[] arg1) {
        ++field8647;
        this.field8640 = new class324(arg1);
        if (arg0 != -1) {
            field8648 = -1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "(B)V")
    public final void method3576(byte arg0) {
        ++field8635;
        if (arg0 != 36) {
            field8643 = null;
        }
        super.field7313 = (this.field8637 + 7) / 8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B[BII)V")
    public final void method3577(byte arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = 0; arg3 > var5; ++var5) {
            arg1[arg2 + var5] = (byte) (super.field7318[super.field7313++] + -this.field8640.method1869(false));
        }
        if (arg0 != 15) {
            method3584(-11, 54, -54);
        }
        ++field8650;
    }

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "(II)I")
    public final int method3578(int arg0, int arg1) {
        ++field8649;
        int var3 = this.field8637 >> 3;
        int var4 = arg0 - (7 & this.field8637);
        int var5 = 0;
        this.field8637 += arg1;
        while (arg1 > var4) {
            var5 += (class209.field2476[var4] & super.field7318[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field7318[var3] >> -arg1 + var4 & class209.field2476[arg1]) + var5;
        } else {
            var6 = (super.field7318[var3] & class209.field2476[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(IB)Lvf;")
    public static final class141 method3579(int arg0, byte arg1) {
        ++field8642;
        if (arg1 != -109) {
            method3583(false, 6, -84);
        }
        class141[] var2 = class277.method1674(arg1 ^ -44);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3].field1688 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(BI)V")
    public final void method3580(byte arg0, int arg1) {
        ++field8638;
        super.field7318[super.field7313++] = (byte) (arg1 + this.field8640.method1869(false));
        if (arg0 > -93) {
            this.method3575(-84, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
    public class638(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(IB)I")
    public final int method3581(int arg0, byte arg1) {
        if (arg1 > -70) {
            field8643 = null;
        }
        ++field8639;
        return arg0 * 8 + -this.field8637;
    }

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "(I)V")
    public final void method3582(int arg0) {
        ++field8646;
        int var2 = -9 % ((arg0 - 80) / 36);
        this.field8637 = super.field7313 * 8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3583(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method3573(32);
        }
        ++field8634;
        boolean var3 = (arg1 & 55) == 0 ? class587.method3261(arg1, arg2, -1) : class453.method2492(arg1, arg2, (byte) -82);
        return var3 | ~(65536 & arg2) != -1 | class518.method2807(arg2, arg1, -23925);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
    public static final boolean method3584(int arg0, int arg1, int arg2) {
        if (arg2 != 13896) {
            return true;
        } else {
            ++field8644;
            return (arg1 & 16) != 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZII)V")
    public static final void method3585(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            ++field8641;
            if (class315.field3949 == 1) {
                class294.field3738[class406.field5235 / 100].method2556(class182.field2141 + -8, class161.field1900 + -8);
            }
            if (~class315.field3949 == -3) {
                class294.field3738[4 - -(class406.field5235 / 100)].method2556(class182.field2141 + -8, class161.field1900 + -8);
            }
            class306.method1820(49);
        }
    }

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "(I)Z")
    public final boolean method3586(int arg0) {
        if (arg0 != -30965) {
            this.method3586(68);
        }
        ++field8651;
        int var2 = super.field7318[super.field7313] - this.field8640.method1870(arg0 + 1098) & 255;
        return var2 >= 128;
    }
}
