import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class322 {

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Lqfa;")
    public static class98 field38 = new class98(61, -1);

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "[I")
    public static int[] field41 = new int[6];

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "Lhaa;")
    public static class80 field42;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II[JI[I)V", line = 3)
    public static final void method15(int arg0, int arg1, long[] arg2, int arg3, int[] arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg3; arg1 > var11; ++var11) {
                if (~arg2[var11] > ~((long) (var10 & var11) + var7)) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method15(852, var6 + -1, arg2, arg3, arg4);
            method15(852, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0 != 852) {
            field42 = null;
        }
        ++field36;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I", line = 59)
    public static final int method16(int arg0) {
        ++field39;
        if (arg0 != -24897) {
            field38 = null;
        }
        class714 var1 = class668.field9073;
        synchronized (class668.field9073) {
            return class668.field9073.method4026(arg0 ^ -24898);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I", line = 78)
    public final int method17(byte arg0) {
        ++field35;
        int var2 = -104 / ((70 - arg0) / 51);
        return 1;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V", line = 88)
    public static void method18(byte arg0) {
        field38 = null;
        field41 = null;
        if (arg0 > -55) {
            method15(42, -87, (long[]) null, 30, (int[]) null);
        }
        field42 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)I", line = 100)
    public final int method19(int arg0, int arg1) {
        if (arg1 <= 10) {
            field41 = null;
        }
        ++field44;
        return 1;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Z)I", line = 111)
    public final int method20(boolean arg0) {
        if (arg0) {
            this.method17((byte) -45);
        }
        ++field40;
        return super.field4451;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(FIILts;IIFFIFF)[B", line = 125)
    public static final byte[] method21(float arg0, int arg1, int arg2, class535 arg3, int arg4, int arg5, float arg6, float arg7, int arg8, float arg9, float arg10) {
        ++field34;
        byte[] var11 = new byte[arg2 * arg4 * arg1];
        class596.method3357(var11, arg7, arg2, (byte) -52, arg4, arg1, arg3, arg9, arg6, arg8, arg5, arg0, arg10);
        return var11;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILch;)V", line = 136)
    public class4(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)V", line = 139)
    public final void method22(int arg0, int arg1) {
        ++field37;
        super.field4451 = arg1;
        if (arg0 != 0) {
            method18((byte) -14);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V", line = 151)
    public final void method23(boolean arg0) {
        if (super.field4451 != 1 && super.field4451 != 0) {
            super.field4451 = this.method17((byte) 10);
        }
        if (arg0) {
            field42 = null;
        }
        ++field43;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lch;)V", line = 172)
    public class4(class463 arg0) {
        super(arg0);
    }
}
