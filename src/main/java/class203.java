import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class203 extends class249 {

    @OriginalMember(owner = "client!ci", name = "Pb", descriptor = "I")
    public static int field3658 = 0;

    @OriginalMember(owner = "client!ci", name = "Tb", descriptor = "Lsf;")
    public static class108 field3662 = class140.method973(255, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ci", name = "Qb", descriptor = "I")
    public static int field3659 = 0;

    @OriginalMember(owner = "client!ci", name = "Ub", descriptor = "Lsf;")
    public static class108 field3663 = class140.method973(255, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!ci", name = "cc", descriptor = "I")
    public static int field3671 = 255;

    @OriginalMember(owner = "client!ci", name = "ec", descriptor = "[I")
    public static int[] field3673 = new int[2];

    @OriginalMember(owner = "client!ci", name = "Nb", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!ci", name = "Ob", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ci", name = "Rb", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ci", name = "Sb", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ci", name = "Wb", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ci", name = "Xb", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ci", name = "Yb", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ci", name = "Zb", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ci", name = "ac", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ci", name = "fc", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ci", name = "gc", descriptor = "I")
    private int field3675;

    @OriginalMember(owner = "client!ci", name = "hc", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ci", name = "dc", descriptor = "Lik;")
    public static class262 field3672;

    @OriginalMember(owner = "client!ci", name = "bc", descriptor = "Lpa;")
    private class2 field3670;

    @OriginalMember(owner = "client!ci", name = "Vb", descriptor = "[Lt;")
    public static class257[] field3664;

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V", line = 17)
    public class203(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "(I)V", line = 22)
    public static final void method1426(int arg0) {
        field3657++;
        if (class329.field5618 || class220.field3910 == 2) {
            return;
        }
        try {
            class21.field333.method752(30488, class5.field73);
            if (arg0 != 32214) {
                field3672 = (class262) null;
            }
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "(II)V", line = 52)
    public final void method1427(int arg0, int arg1) {
        field3666++;
        this.field4338[this.field4314++] = (byte) (this.field3670.method21(255) + arg0);
        if (arg1 != 0) {
            field3659 = 123;
        }
    }

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "(B)I", line = 63)
    public final int method1428(byte arg0) {
        field3667++;
        if (arg0 != 121) {
            field3659 = -94;
        }
        return this.field4338[this.field4314++] - this.field3670.method21(255) & 0xFF;
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(Z)V", line = 74)
    public final void method1429(boolean arg0) {
        this.field3675 = this.field4314 * 8;
        if (!arg0) {
            field3660++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "(I)V", line = 85)
    public final void method1430(int arg0) {
        if (arg0 == -21016) {
            this.field4314 = (this.field3675 + 7) / 8;
            field3669++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I", line = 97)
    public final int method1431(byte arg0, int arg1) {
        field3656++;
        int var3 = this.field3675 >> 3;
        int var4 = 0;
        int var5 = 8 - (this.field3675 & 0x7);
        this.field3675 += arg1;
        while (var5 < arg1) {
            var4 += (class195.field3530[var5] & this.field4338[var3++]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        if (arg0 != -94) {
            this.field3675 = 32;
        }
        int var6;
        if (arg1 == var5) {
            var6 = (this.field4338[var3] & class195.field3530[var5]) + var4;
        } else {
            var6 = (this.field4338[var3] >> var5 - arg1 & class195.field3530[arg1]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "(I)V", line = 130)
    public static void method1432(int arg0) {
        field3664 = null;
        field3662 = null;
        field3663 = null;
        field3673 = null;
        int var1 = 24 % ((arg0 - 53) / 34);
        field3672 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([BIIB)V", line = 147)
    public final void method1433(byte[] arg0, int arg1, int arg2, byte arg3) {
        field3668++;
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[arg2 + var5] = (byte) (this.field4338[this.field4314++] - this.field3670.method21(255));
        }
        if (arg3 < 65) {
            this.method1434((int[]) null, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([IB)V", line = 164)
    public final void method1434(int[] arg0, byte arg1) {
        this.field3670 = new class2(arg0);
        int var3 = 122 % ((arg1 - 87) / 38);
        field3661++;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(IB)I", line = 178)
    public final int method1435(int arg0, byte arg1) {
        if (arg1 != -18) {
            field3672 = (class262) null;
        }
        field3674++;
        return arg0 * 8 - this.field3675;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)I", line = 220)
    public static final int method1436(boolean arg0, byte arg1) {
        if (arg1 != 32) {
            method1436(true, (byte) -21);
        }
        long var2 = class118.method835(-1272);
        field3676++;
        for (class83 var4 = arg0 ? (class83) class155.field2792.method1672(arg1 - 32) : (class83) class155.field2792.method1678(95); var4 != null; var4 = (class83) class155.field2792.method1678(-126)) {
            if ((var4.field1292 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field1292 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3375;
                    class261.field4594[var5] = class271.field4734[var5];
                    var4.method1325(0);
                    return var5;
                }
                var4.method1325(0);
            }
        }
        return -1;
    }
}
