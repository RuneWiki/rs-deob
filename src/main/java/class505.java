import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class505 extends class154 {

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    private int field7422;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    private int field7425;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    private int field7427;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    private int field7433;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "D")
    public static double field7423 = -1.0D;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "[I")
    public static int[] field7432;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)Lpv;")
    public static final class50 method2966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7428;
        long var7 = (long) arg5 * 986053L ^ (long) arg4 * 475427L ^ (long) arg3 * 67481L ^ (long) arg2 * 97549L ^ (long) arg1 * 32147369L ^ (long) arg0 * 76724863L;
        class50 var9 = (class50) class321.field4438.method56(var7, 115);
        if (arg6 <= 63) {
            field7423 = 0.7718270861402884D;
        }
        if (var9 != null) {
            return var9;
        } else {
            class50 var10 = class329.field4490.method521(arg3, arg2, arg4, arg5, arg1, arg0);
            class321.field4438.method73(var7, var10, 26425);
            return var10;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2967(String arg0, int arg1) {
        ++field7430;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class223.field3106; ++var2) {
                if (arg0.equalsIgnoreCase(class52.field702[var2])) {
                    return var2;
                }
            }
            if (arg1 != -1) {
                method2970(-127, (byte) 119, -112, 2.2870188F, (float[]) null, 112, 23, 49, 0.6221606F, -78, -104, -11, 0.09362067F);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        ++field7429;
        int var4 = this.field7422 * arg1 >> 12;
        int var5 = this.field7433 * arg1 >> 12;
        if (arg2 != 14619) {
            field7432 = null;
        }
        int var6 = this.field7427 * arg0 >> 12;
        int var7 = this.field7425 * arg0 >> 12;
        class420.method2516(super.field2212, super.field2213, var5, var4, arg2 ^ -14704, super.field2214, var7, var6);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZIIIB)V")
    public static final void method2968(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field7421;
        if (class478.method2809(arg3, false)) {
            int var5 = -108 / ((arg4 - 18) / 51);
            class85.method600(arg2, 18219, class522.field7701[arg3], -1, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)V")
    public final void method294(int arg0, byte arg1, int arg2) {
        ++field7424;
        int var4 = this.field7422 * arg2 >> 12;
        int var5 = this.field7433 * arg2 >> 12;
        if (arg1 != 21) {
            method2968(true, 127, -50, 92, (byte) 76);
        }
        int var6 = this.field7427 * arg0 >> 12;
        int var7 = this.field7425 * arg0 >> 12;
        class386.method2223(super.field2212, var4, var6, var5, var7, (byte) -19, super.field2214);
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
    public final void method296(int arg0, int arg1, int arg2) {
        ++field7431;
        int var4 = this.field7422 * arg0 >> 12;
        int var5 = this.field7433 * arg0 >> 12;
        int var6 = this.field7427 * arg2 >> 12;
        if (arg1 > -29) {
            method2970(-63, (byte) 4, 92, -2.9421086F, (float[]) null, 102, -88, 1, 1.3414514F, -61, -33, 28, 0.21296982F);
        }
        int var7 = this.field7425 * arg2 >> 12;
        class81.method584(18850, super.field2213, var4, var7, var5, var6);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static void method2969(byte arg0) {
        if (arg0 < -118) {
            field7432 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIII)V")
    public class505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7422 = arg0;
        this.field7425 = arg3;
        this.field7427 = arg1;
        this.field7433 = arg2;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBIF[FIIIFIIIF)V")
    public static final void method2970(int arg0, byte arg1, int arg2, float arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg5 - arg2;
        if (arg1 != 28) {
            field7432 = null;
        }
        int var14 = arg10 - arg7;
        ++field7426;
        int var15 = arg6 - arg0;
        float var16 = arg4[2] * (float) var13 + arg4[1] * (float) var14 + arg4[0] * (float) var15;
        float var17 = arg4[5] * (float) var13 + arg4[3] * (float) var15 + arg4[4] * (float) var14;
        float var18 = arg4[8] * (float) var13 + arg4[7] * (float) var14 + arg4[6] * (float) var15;
        float var19;
        float var20;
        if (~arg11 == -1) {
            var19 = arg3 + var16 + 0.5F;
            var20 = -var18 + arg8 + 0.5F;
        } else if (~arg11 == -2) {
            var19 = arg3 + var16 + 0.5F;
            var20 = arg8 + var18 + 0.5F;
        } else if (~arg11 != -3) {
            if (arg11 == 3) {
                var19 = arg3 + var16 + 0.5F;
                var20 = -var17 + arg12 + 0.5F;
            } else if (~arg11 != -5) {
                var19 = -var18 + arg8 + 0.5F;
                var20 = -var17 + arg12 + 0.5F;
            } else {
                var20 = -var17 + arg12 + 0.5F;
                var19 = arg8 + var18 + 0.5F;
            }
        } else {
            var20 = -var17 + arg12 + 0.5F;
            var19 = -var16 + arg3 + 0.5F;
        }
        if (~arg9 == -2) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg9 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg9 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class304.field4171 = var20;
        class205.field2907 = var19;
    }
}
