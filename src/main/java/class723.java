import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class723 extends class715 {

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Z")
    private boolean field10095 = false;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
    public static int[] field10101 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lfu;")
    public static class388 field10100;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)V", line = 5)
    public static void method4022(boolean arg0) {
        field10101 = null;
        field10100 = null;
        if (!arg0) {
            field10100 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILdu;I)V", line = 16)
    public final void method693(int arg0, class355 arg1, int arg2) {
        int var4 = 57 / ((31 - arg0) / 50);
        super.field9979.method2732(-78, arg1);
        ++field10092;
        super.field9979.method2721(arg2, true);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lgt;)V", line = 27)
    public class723(class453 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V", line = 30)
    public final void method687(int arg0, int arg1, int arg2) {
        if (arg1 != 1782) {
            field10100 = null;
        }
        ++field10094;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)V", line = 40)
    public final void method691(boolean arg0, int arg1) {
        ++field10093;
        class326 var3 = super.field9979.method2759(-62);
        if (arg1 != 4) {
            field10100 = null;
        }
        if (var3 != null && arg0) {
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2732(arg1 ^ -81, var3);
            super.field9979.method1040((byte) -123, class288.field4067);
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2769(class140.field2165, class218.field3121, arg1 ^ 18725);
            super.field9979.method1020(false, true, (byte) 65, 2, class44.field665);
            super.field9979.method2755(false, 0, class165.field2440);
            class25 var4 = super.field9979.method2773((byte) -30);
            var4.method173(super.field9979.method2744(1), arg1 ^ 18315);
            super.field9979.method2699(class8.field128, -54);
            super.field9979.method2753((byte) -17, 0);
            this.field10095 = true;
        } else {
            super.field9979.method2755(false, 0, class165.field2440);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 72)
    public final void method689(int arg0) {
        if (this.field10095) {
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method1040((byte) -123, class686.field9674);
            super.field9979.method2769(class571.field8118, class571.field8118, 18721);
            super.field9979.method2767(2, 25103, class142.field2176);
            super.field9979.method2755(false, 0, class68.field1225);
            super.field9979.method2763((byte) -123);
            super.field9979.method2732(-76, (class355) null);
            super.field9979.method2753((byte) -17, 0);
            this.field10095 = false;
        } else {
            super.field9979.method2755(false, 0, class68.field1225);
        }
        int var2 = -15 % ((arg0 - -71) / 42);
        ++field10099;
        super.field9979.method2769(class571.field8118, class571.field8118, 18721);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII[BII[B)V", line = 108)
    public static final void method4023(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, byte[] arg8) {
        ++field10097;
        if (arg3 != 1) {
            method4022(true);
        }
        int var9 = -(arg6 >> 2);
        int var10 = -(3 & arg6);
        for (int var11 = -arg7; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg0++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg8[arg4++]);
                int var14 = arg0++;
                arg5[var14] = (byte) (arg5[var14] + -arg8[arg4++]);
                int var15 = arg0++;
                arg5[var15] = (byte) (arg5[var15] + -arg8[arg4++]);
                int var16 = arg0++;
                arg5[var16] = (byte) (arg5[var16] + -arg8[arg4++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg0++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg8[arg4++]);
            }
            arg4 += arg2;
            arg0 += arg1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)Z", line = 153)
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            this.field10095 = false;
        }
        ++field10096;
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V", line = 164)
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 <= -105) {
            ++field10098;
            super.field9979.method2769(class140.field2165, class571.field8118, 18721);
        }
    }
}
