import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class580 extends class601 {

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Z")
    public static boolean field7940 = false;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "[Z")
    public static boolean[] field7945 = new boolean[200];

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[I")
    public static int[] field7949 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 3)
    public static void method3370(int arg0) {
        field7945 = null;
        if (arg0 != 2) {
            method3373(-125, 61, -120, (Object[]) null, (int[]) null);
        }
        field7949 = null;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Z", line = 14)
    public final boolean method3371(int arg0) {
        if (arg0 != 2048) {
            field7949 = null;
        }
        ++field7941;
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V", line = 28)
    public static final void method3372(int arg0, int arg1, int arg2, long[] arg3, Object[] arg4) {
        if (arg0 > arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            int var10 = ~var7 != Long.MIN_VALUE ? 1 : 0;
            for (int var11 = arg1; var11 < arg0; ++var11) {
                if (arg3[var11] < (long) (var10 & var11) + var7) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method3372(var6 - 1, arg1, -96, arg3, arg4);
            method3372(arg0, var6 + 1, 86, arg3, arg4);
        }
        int var15 = 70 % ((-26 - arg2) / 36);
        ++field7948;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V", line = 82)
    public static final void method3373(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        if (~arg0 > ~arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg0; arg1 > var10; ++var10) {
                if (~arg4[var10] > ~((var9 & var10) + var7)) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method3373(arg0, var6 + -1, Integer.MIN_VALUE, arg3, arg4);
            method3373(var6 + 1, arg1, Integer.MIN_VALUE, arg3, arg4);
        }
        ++field7938;
        if (arg2 != Integer.MIN_VALUE) {
            field7949 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)I", line = 140)
    public static final int method3374(int arg0) {
        ++field7944;
        if (arg0 != 24188) {
            field7949 = null;
        }
        return ~class521.field7260 == -2 ? class154.field2107 : 0;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)I", line = 156)
    public final int method3375(int arg0) {
        ++field7939;
        if (arg0 != 0) {
            field7945 = null;
        }
        return super.field8131;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(ILqea;)V", line = 173)
    public class580(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)I", line = 176)
    public final int method36(int arg0, byte arg1) {
        ++field7947;
        if (arg1 != 22) {
            field7940 = true;
        }
        return arg0 != 0 && ~super.field8137.field4752.method62(0) != -2 ? 2 : 1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I", line = 192)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            field7940 = false;
        }
        ++field7950;
        return 1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 206)
    public final void method41(byte arg0) {
        ++field7946;
        if (~super.field8131 != -1 && super.field8137.field4752.method62(0) != 1) {
            super.field8131 = 0;
        }
        if (super.field8131 < 0 || super.field8131 > 1) {
            super.field8131 = this.method45(8976);
        }
        int var2 = -65 % ((arg0 - 59) / 33);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lqea;)V", line = 227)
    public class580(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V", line = 231)
    public final void method43(int arg0, int arg1) {
        ++field7943;
        super.field8131 = arg1;
        int var3 = -11 % ((arg0 - 22) / 34);
    }
}
