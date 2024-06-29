import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class200 extends class322 {

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "Lgda;")
    public static class53 field2630 = new class53(71, 2);

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "Lgda;")
    public static class53 field2635 = new class53(28, -1);

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!tw", name = "v", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!tw", name = "w", descriptor = "Leb;")
    public static class625 field2638;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "[[I")
    public static int[][] field2636;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(Z)I")
    public final int method1222(boolean arg0) {
        if (arg0) {
            this.method1225((byte) 61);
        }
        ++field2627;
        return super.field4451;
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2635 = null;
        field2636 = null;
        field2638 = null;
        if (arg0 != -1) {
            field2635 = null;
        }
        field2630 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FIFIIFF[BIIIFBLts;)V")
    public static final void method1224(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float arg6, byte[] arg7, int arg8, int arg9, int arg10, float arg11, byte arg12, class535 arg13) {
        ++field2637;
        int var14 = arg8 * arg9;
        float[] var15 = new float[var14];
        for (int var16 = 0; ~arg3 < ~var16; ++var16) {
            arg13.method1232(arg10, var15, 0, arg4, 66, arg0 / (float) arg8, arg11 * 127.0F, arg5 / (float) arg9, arg2 / (float) arg10, arg8, arg9);
            int var19 = arg1;
            arg2 *= 2.0F;
            arg5 *= 2.0F;
            arg0 *= 2.0F;
            arg11 = arg6 * arg11;
            for (int var20 = 0; var14 > var20; ++var20) {
                arg7[var19] = (byte) ((int) ((float) arg7[var19] + var15[var20]));
                ++var19;
            }
        }
        int var17 = arg1;
        if (arg12 != -119) {
            method1223(6);
        }
        for (int var18 = 0; var14 > var18; ++var18) {
            arg7[var17] = (byte) (arg7[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        ++field2633;
        super.field4451 = arg1;
        if (arg0 != 0) {
            field2638 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILch;)V")
    public class200(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lch;)V")
    public class200(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field2628;
        if (super.field4450.method2751(-18373)) {
            return 3;
        } else if (~super.field4450.field6522.method2865(false) == -1) {
            return 3;
        } else {
            return arg1 <= 10 ? -60 : 1;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (super.field4450.method2751(-18373)) {
            super.field4451 = 0;
        }
        ++field2631;
        if (~super.field4450.field6522.method2865(arg0) == -1) {
            super.field4451 = 0;
        }
        if (~super.field4451 > -1 || super.field4451 > 2) {
            super.field4451 = this.method17((byte) -104);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = 22 % ((70 - arg0) / 51);
        ++field2634;
        return 2;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)Z")
    public final boolean method1225(byte arg0) {
        ++field2632;
        if (super.field4450.method2751(arg0 + -18320)) {
            return false;
        } else if (arg0 != -53) {
            return true;
        } else {
            return super.field4450.field6522.method2865(false) != 0;
        }
    }
}
