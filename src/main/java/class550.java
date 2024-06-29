import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class550 extends class354 {

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lkg;")
    public static class275 field7682 = new class275(77, 6);

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[[Z")
    public static boolean[][] field7690;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        int var2 = 18 / ((37 - arg0) / 63);
        ++field7683;
        return 1;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        if (arg0 != -1) {
            field7691 = -36;
        }
        super.field4545 = arg1;
        ++field7689;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lwo;)V")
    public class550(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V")
    public static void method3195(byte arg0) {
        field7682 = null;
        int var1 = -39 / ((29 - arg0) / 51);
        field7690 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field7688;
        if (arg0 != 3) {
            field7691 = 91;
        }
        if (super.field4544.method4149((byte) 33)) {
            return 3;
        } else if (super.field4544.method4153(arg0 ^ -12) == class211.field2791) {
            if (~arg1 == -1) {
                if (super.field4544.field10418.method3928((byte) 90) == 1) {
                    return 2;
                }
                if (super.field4544.field10420.method1877((byte) -114) == 1) {
                    return 2;
                }
                if (super.field4544.field10414.method2470((byte) 72) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7687;
        if (arg2 == 0) {
            class237.field3091[class54.field753++] = new class222(arg8, arg6, arg0, arg3, arg3, arg0, arg7, arg1, arg1, arg7, arg5, arg5, arg4, arg4);
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Z")
    public final boolean method3197(int arg0) {
        ++field7685;
        if (super.field4544.method4149((byte) 33)) {
            return false;
        } else {
            int var2 = -70 % ((arg0 - -34) / 41);
            return super.field4544.method4153(-9) == class211.field2791;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)I")
    public final int method3198(byte arg0) {
        ++field7681;
        int var2 = 47 % ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B[BIIIIIII)V")
    public static final void method3199(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7684;
        int var9 = -(arg8 >> 2);
        int var10 = -(3 & arg8);
        if (arg5 != 10076) {
            method3199((byte[]) null, (byte[]) null, 74, 119, 92, 108, 15, 82, -84);
        }
        for (int var11 = -arg2; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg4++;
                arg0[var10001] = (byte) (arg0[var10001] + -arg1[arg6++]);
                int var14 = arg4++;
                arg0[var14] = (byte) (arg0[var14] + -arg1[arg6++]);
                int var15 = arg4++;
                arg0[var15] = (byte) (arg0[var15] + -arg1[arg6++]);
                int var16 = arg4++;
                arg0[var16] = (byte) (arg0[var16] + -arg1[arg6++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg4++;
                arg0[var10001] = (byte) (arg0[var10001] + -arg1[arg6++]);
            }
            arg4 += arg3;
            arg6 += arg7;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (super.field4544.method4153(-9) != class211.field2791) {
            super.field4545 = 1;
        } else if (super.field4544.method4149((byte) 33)) {
            super.field4545 = 0;
        }
        if (arg0 != 6384) {
            method3196(-86, 21, -30, 42, 72, -34, -28, -51, 33);
        }
        ++field7686;
        if (super.field4545 != 0 && ~super.field4545 != -2) {
            super.field4545 = this.method393((byte) 113);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(ILwo;)V")
    public class550(int arg0, class746 arg1) {
        super(arg0, arg1);
    }
}
