import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class447 extends class601 {

    @OriginalMember(owner = "client!oha", name = "q", descriptor = "[I")
    public static int[] field6199 = new int[13];

    @OriginalMember(owner = "client!oha", name = "s", descriptor = "Z")
    public static boolean field6201 = false;

    @OriginalMember(owner = "client!oha", name = "t", descriptor = "Lrg;")
    public static class557 field6202 = new class557();

    @OriginalMember(owner = "client!oha", name = "l", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!oha", name = "n", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!oha", name = "p", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!oha", name = "u", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)I")
    public final int method2724(int arg0) {
        if (arg0 != 0) {
            return 108;
        } else {
            ++field6194;
            return super.field8131;
        }
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lqea;)V")
    public class447(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
    public static void method2725(int arg0) {
        field6199 = null;
        field6202 = null;
        if (arg0 != 2) {
            method2727(-34, 126, -43, 55, false, -84, (byte[]) null, -108, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            field6199 = null;
        }
        ++field6195;
        if (super.field8137.method2161(0)) {
            return 2;
        } else {
            return super.field8137.field4789.method962(0) && class523.method3116(super.field8137.field4789.method963(0), true) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        if (super.field8137.method2161(0)) {
            super.field8131 = 2;
        }
        int var2 = 99 % ((arg0 - 59) / 33);
        ++field6196;
        if (~super.field8131 > -1 || super.field8131 > 2) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return -19;
        } else {
            ++field6200;
            return super.field8137.method2161(0) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)Z")
    public final boolean method2726(int arg0) {
        if (arg0 != 2048) {
            this.method36(69, (byte) -99);
        }
        ++field6198;
        return !super.field8137.method2161(0);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIIZI[BI[B)V")
    public static final void method2727(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte[] arg6, int arg7, byte[] arg8) {
        ++field6203;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 3);
        int var11 = -arg2;
        if (arg4) {
            method2727(99, -96, 9, 4, true, 97, (byte[]) null, 38, (byte[]) null);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg3++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg8[arg5++]);
                int var14 = arg3++;
                arg6[var14] = (byte) (arg6[var14] + -arg8[arg5++]);
                int var15 = arg3++;
                arg6[var15] = (byte) (arg6[var15] + -arg8[arg5++]);
                int var16 = arg3++;
                arg6[var16] = (byte) (arg6[var16] + -arg8[arg5++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg3++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg8[arg5++]);
            }
            arg5 += arg1;
            arg3 += arg7;
            ++var11;
        }
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = -37 / ((22 - arg0) / 34);
        ++field6197;
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(ILqea;)V")
    public class447(int arg0, class339 arg1) {
        super(arg0, arg1);
    }
}
