import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class228 extends class207 {

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "J")
    public static long field2941 = 0L;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field2953 = -1;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[[I")
    public static int[][] field2951;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lrd;)V", line = 4)
    public class228(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 8)
    public final void method37(int arg0) {
        if (super.field2669 < 1 || super.field2669 > 3) {
            super.field2669 = this.method36(-101);
        }
        ++field2944;
        int var2 = 46 / ((arg0 - -58) / 48);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IB)I", line = 22)
    public final int method39(int arg0, byte arg1) {
        if (arg1 != 69) {
            method1444((byte) 124);
        }
        ++field2945;
        return 1;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)I", line = 39)
    public final int method1441(int arg0) {
        ++field2948;
        if (arg0 != 43) {
            field2941 = -107L;
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILuq;IZ)V", line = 50)
    public static final void method1442(int arg0, int arg1, int arg2, int arg3, class172 arg4, int arg5, boolean arg6) {
        if (~arg3 >= -1) {
            class414.method2491(arg1, arg4, arg6, 11889, arg2, arg5);
        } else {
            class765.field10514 = arg4;
            class122.field1694 = arg5;
            class100.field1451 = arg6;
            class348.field5049 = null;
            class460.field6563 = arg2;
            class289.field4115 = 1;
            class786.field10798 = arg1;
            class709.field9701 = class311.field4406.method423(2097152) / arg3;
            if (~class709.field9701 > -2) {
                class709.field9701 = 1;
            }
        }
        if (arg0 < 16) {
            method1442(-95, 124, -54, 16, (class172) null, 65, true);
        }
        ++field2942;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I", line = 85)
    public final int method36(int arg0) {
        ++field2950;
        if (arg0 >= -14) {
            field2951 = null;
        }
        return super.field2668.method2249((byte) 125).method2148(11745) ? 3 : 2;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILrd;)V", line = 97)
    public class228(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII[BZ[B)V", line = 100)
    public static final void method1443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, boolean arg7, byte[] arg8) {
        ++field2947;
        int var9 = -(arg1 >> 2);
        int var10 = -(3 & arg1);
        int var11 = -arg3;
        if (arg7) {
            while (~var11 > -1) {
                int var10001;
                for (int var12 = var9; var12 < 0; ++var12) {
                    var10001 = arg0++;
                    arg6[var10001] = (byte) (arg6[var10001] + -arg8[arg2++]);
                    int var14 = arg0++;
                    arg6[var14] = (byte) (arg6[var14] + -arg8[arg2++]);
                    int var15 = arg0++;
                    arg6[var15] = (byte) (arg6[var15] + -arg8[arg2++]);
                    int var16 = arg0++;
                    arg6[var16] = (byte) (arg6[var16] + -arg8[arg2++]);
                }
                for (int var13 = var10; ~var13 > -1; ++var13) {
                    var10001 = arg0++;
                    arg6[var10001] = (byte) (arg6[var10001] + -arg8[arg2++]);
                }
                arg2 += arg4;
                arg0 += arg5;
                ++var11;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V", line = 147)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        ++field2952;
        if (arg1 > -7) {
            field2941 = -56L;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 158)
    public static void method1444(byte arg0) {
        if (arg0 <= -33) {
            field2951 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V", line = 170)
    public static final void method1445(int arg0, int arg1, int arg2, int arg3) {
        ++field2943;
        int var4 = arg2 << arg0;
        int var5 = arg1 << 3;
        int var6 = arg3 << 3;
        class514.field7144 = (float) var5;
        class294.field4169 = (float) var4;
        if (~class697.field9252 == -3) {
            class41.field442 = var5;
            class476.field6693 = var6;
            class74.field1000 = var4;
        }
        class454.method2696(4);
        class7.field61 = true;
    }
}
