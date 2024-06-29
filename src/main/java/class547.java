import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class547 extends class530 {

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!sha", name = "m", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!sha", name = "n", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "Lwu;")
    public static class557 field7709;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V", line = 3)
    public static void method3268(byte arg0) {
        field7709 = null;
        if (arg0 != -27) {
            field7715 = -23;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)V", line = 14)
    public final void method73(boolean arg0) {
        ++field7710;
        if (super.field7419 < 0 && ~super.field7419 < -5) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            method3268((byte) 52);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)I", line = 29)
    public final int method74(int arg0) {
        ++field7714;
        if (super.field7418.method2254((byte) -58).method1891((byte) -114) > 1) {
            return 4;
        } else {
            if (arg0 != 0) {
                field7715 = -75;
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "([III[ILpga;I)Lub;", line = 44)
    public static final class82 method3269(int[] arg0, int arg1, int arg2, int[] arg3, class492 arg4, int arg5) {
        if (arg5 != -18107) {
            method3268((byte) -105);
        }
        ++field7711;
        if (arg4.method616(class197.field2845, class720.field10164, (byte) -123)) {
            byte[] var6 = new byte[arg1 * arg2];
            for (int var7 = 0; arg2 > var7; ++var7) {
                int var8 = arg1 * var7 + arg0[var7];
                for (int var9 = 0; var9 < arg3[var7]; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class82(arg4, arg1, arg2, var6);
        } else {
            int[] var10 = new int[arg1 * arg2];
            for (int var11 = 0; ~var11 > ~arg2; ++var11) {
                int var12 = arg1 * var11 + arg0[var11];
                for (int var13 = 0; var13 < arg3[var11]; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class82(arg4, arg1, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(ILah;)V", line = 106)
    public class547(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lah;)V", line = 109)
    public class547(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(II)V", line = 112)
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        ++field7712;
        if (arg1 > -38) {
            this.method75(-109, -27);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)I", line = 124)
    public final int method75(int arg0, int arg1) {
        int var3 = -78 % ((63 - arg1) / 60);
        ++field7713;
        return 1;
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)I", line = 134)
    public final int method3270(int arg0) {
        ++field7716;
        if (arg0 != 0) {
            field7709 = null;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "()V", line = 146)
    public static final void method3271() {
        class365.field4690 = class365.field4688;
    }
}
