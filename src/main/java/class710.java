import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class710 extends class260 {

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field9869 = -50;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field9866 = 0;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Lpha;")
    public static class174 field9864 = new class174("", 17);

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "Z")
    public static boolean field9871 = true;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "[[B")
    public static byte[][] field9861;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[II[I)V", line = 4)
    public static final void method4000(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg1 != -50) {
            method4000(-127, -18, (int[]) null, -18, (int[]) null);
        }
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg0; arg3 > var10; ++var10) {
                if ((var10 & var9) + var7 > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method4000(arg0, -50, arg2, var6 + -1, arg4);
            method4000(var6 + 1, -50, arg2, arg3, arg4);
        }
        ++field9859;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lgn;)V", line = 61)
    public class710(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)I", line = 65)
    public final int method123(int arg0) {
        ++field9862;
        if (arg0 != 4377) {
            this.method4001(87);
        }
        return 2;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(ILgn;)V", line = 78)
    public class710(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)V", line = 83)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        if (arg1 != 122) {
            field9861 = null;
        }
        ++field9870;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 95)
    public final void method126(int arg0) {
        ++field9865;
        if (super.field3829.method4076(-5569)) {
            super.field3828 = 0;
        }
        if (~super.field3829.field10057.method1024(-41) == -1) {
            super.field3828 = 0;
        }
        if (~super.field3828 > -1 || super.field3828 > 2) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            field9871 = false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)I", line = 118)
    public final int method4001(int arg0) {
        if (arg0 >= -14) {
            return 8;
        } else {
            ++field9867;
            return super.field3828;
        }
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)Z", line = 129)
    public final boolean method4002(int arg0) {
        ++field9868;
        if (super.field3829.method4076(-5569)) {
            return false;
        } else if (super.field3829.field10057.method1024(-44) == 0) {
            return false;
        } else {
            return arg0 >= 73;
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(II)I", line = 148)
    public final int method129(int arg0, int arg1) {
        ++field9860;
        if (super.field3829.method4076(arg0 ^ 5568)) {
            return 3;
        } else {
            return ~super.field3829.field10057.method1024(-96) == arg0 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V", line = 167)
    public static void method4003(int arg0) {
        if (arg0 == 17) {
            field9861 = null;
            field9864 = null;
        }
    }
}
