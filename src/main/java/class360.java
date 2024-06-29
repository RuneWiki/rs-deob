import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class360 {

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field4754;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field4750 = 0;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[I")
    public static int[] field4760 = new int[2];

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lsea;")
    public static class648 field4757;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)Lwj;")
    public final class360 method2057(boolean arg0, int arg1) {
        field4759++;
        return arg0 ? null : new class360(this.field4753, arg1, this.field4758, this.field4756);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBLgj;IIFII[BFFFFI)V")
    public static final void method2058(int arg0, byte arg1, class588 arg2, int arg3, int arg4, float arg5, int arg6, int arg7, byte[] arg8, float arg9, float arg10, float arg11, float arg12, int arg13) {
        field4751++;
        int var14 = arg0 * arg4;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg13; var16++) {
            arg2.method3159(arg11 * 127.0F, arg4, var15, arg5 / (float) arg4, arg10 / (float) arg7, arg0, arg6, -60, arg7, 0, arg9 / (float) arg0);
            int var19 = arg3;
            arg10 *= 2.0F;
            arg9 *= 2.0F;
            arg5 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg8[var19] = (byte) ((int) ((float) arg8[var19] + var15[var20]));
                var19++;
            }
            arg11 *= arg12;
        }
        int var17 = arg3;
        if (arg1 > 52) {
            for (int var18 = 0; var18 < var14; var18++) {
                arg8[var17] = (byte) (arg8[var17] + 127);
                var17++;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method2059(boolean arg0, boolean arg1, String arg2) {
        if (!arg1) {
            class623.method3465(127, arg0, arg2, -1, -1);
            field4752++;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIII)V")
    public class360(int arg0, int arg1, int arg2, int arg3) {
        this.field4756 = arg3;
        this.field4758 = arg2;
        this.field4753 = arg0;
        this.field4754 = arg1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method2060(byte arg0) {
        field4760 = null;
        field4757 = null;
        if (arg0 != -82) {
            method2059(false, false, null);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)V")
    public static final void method2061(byte arg0, int arg1, int arg2) {
        field4755++;
        if (class31.field399 != arg1) {
            class48.field568 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class48.field568[var3] = (var3 << 12) / arg1;
            }
            class525.field7123 = arg1 * 32;
            class353.field4694 = arg1 - 1;
            class31.field399 = arg1;
        }
        if (class148.field2197 != arg2) {
            if (class31.field399 == arg2) {
                class430.field6016 = class48.field568;
            } else {
                class430.field6016 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class430.field6016[var4] = (var4 << 12) / arg2;
                }
            }
            class649.field9002 = arg2 - 1;
            class148.field2197 = arg2;
        }
        if (arg0 != 87) {
            field4760 = null;
        }
    }
}
