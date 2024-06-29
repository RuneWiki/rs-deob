import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class305 extends class89 {

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "[I")
    private int[] field4081 = new int[this.field1082];

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lfv;")
    public static class690 field4076 = new class690();

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Ltt;")
    public static class338 field4082 = new class338(47, 5);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    private int field4072;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    private int field4073;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[B")
    private byte[] field4080;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 3)
    public final void method485(int arg0) {
        if (arg0 >= 91) {
            this.field4073 = Math.abs(this.field4073);
            ++field4079;
            if (~this.field4073 <= -4097) {
                this.field4073 = 4095;
            }
            this.method1311((byte) (this.field4073 >> 4), this.field4072++, true);
            this.field4073 = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 19)
    public final void method482(boolean arg0) {
        ++field4074;
        this.field4072 = 0;
        if (!arg0) {
            this.field4073 = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIF)V", line = 31)
    public class305(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field1082 < ~var7; ++var7) {
            this.field4081[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIZ)V", line = 52)
    public void method1311(byte arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method482(false);
        }
        ++field4075;
        this.field4080[this.field4072++] = (byte) ((class15.method97(arg0, 255) >> 1) + 127);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 64)
    public final void method483(int arg0, int arg1, int arg2) {
        ++field4078;
        if (arg2 != 26676) {
            field4082 = null;
        }
        this.field4073 += this.field4081[arg1] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIBII[BI[BI)V", line = 76)
    public static final void method1787(int arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        ++field4077;
        if (arg2 != -92) {
            field4082 = null;
        }
        int var9 = -(arg8 >> 2);
        int var10 = -(3 & arg8);
        for (int var11 = -arg6; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg7[arg4++]);
                int var14 = arg1++;
                arg5[var14] = (byte) (arg5[var14] + -arg7[arg4++]);
                int var15 = arg1++;
                arg5[var15] = (byte) (arg5[var15] + -arg7[arg4++]);
                int var16 = arg1++;
                arg5[var16] = (byte) (arg5[var16] + -arg7[arg4++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg7[arg4++]);
            }
            arg4 += arg0;
            arg1 += arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Llr;", line = 126)
    public static final class277 method1788(byte arg0) {
        class547.field7487 = 0;
        ++field4083;
        return arg0 <= 68 ? null : class637.method3525(true);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 138)
    public static void method1789(int arg0) {
        field4076 = null;
        if (arg0 != -487070654) {
            field4082 = null;
        }
        field4082 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lkt;Lr;IIIBLlv;Lbda;)V", line = 151)
    public static final void method1790(class83 arg0, class562 arg1, int arg2, int arg3, int arg4, byte arg5, class694 arg6, class437 arg7) {
        ++field4071;
        int var8 = arg6.field9788 + -5 + -(arg4 / 2);
        int var9 = arg3 + 2;
        if (~arg0.field985 != -1) {
            arg1.method3118(true, arg7.method2470() * arg2 + arg3 - var9 - -1, var8, var9, arg4 + 10, arg0.field985);
        }
        if (arg5 != -69) {
            method1788((byte) 58);
        }
        if (arg0.field982 != 0) {
            arg1.method3126(var9, var8, -var9 + arg3 + 1 - -(arg2 * arg7.method2470()), 1, arg4 + 10, arg0.field982);
        }
        int var10 = arg0.field981;
        if (arg6.field9787 && ~arg0.field977 != 0) {
            var10 = arg0.field977;
        }
        for (int var11 = 0; arg2 > var11; ++var11) {
            String var12 = class333.field4486[var11];
            if (~(arg2 + -1) < ~var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg7.method2473(arg1, var12, arg6.field9788, arg3, var10, true);
            arg3 += arg7.method2470();
        }
    }
}
