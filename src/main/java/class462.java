import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class462 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field6397 = 100;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
    public static int[] field6396;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIIIIIII)V", line = 8)
    public static final void method2735(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class174.field2335 && arg3 <= class751.field10402 && class174.field2335 <= arg4 && class751.field10402 >= arg4 && class174.field2335 <= arg1 && arg1 <= class751.field10402 && arg6 >= class174.field2335 && arg6 <= class751.field10402 && arg0 >= class523.field7178 && class495.field6845 >= arg0 && arg5 >= class523.field7178 && class495.field6845 >= arg5 && class523.field7178 <= arg8 && class495.field6845 >= arg8 && class523.field7178 <= arg7 && class495.field6845 >= arg7) {
            class617.method3388(arg5, arg6, arg3, arg8, arg4, 120, arg1, arg9, arg7, arg0);
        } else {
            class599.method3330(arg6, arg5, arg4, 11922, arg7, arg0, arg8, arg1, arg9, arg3);
        }
        field6402++;
        if (arg2 > -121) {
            method2741(null, 67, -12, 2, -81, -43, null, -93, false, 45, -1.4109643F);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIII)Z", line = 26)
    public static final boolean method2736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6401++;
        if (!class414.method2560(arg5, arg0, arg4, arg6)) {
            return false;
        }
        int var10 = class280.field4139[1];
        int var11 = class280.field4139[2];
        int var12 = class280.field4139[0];
        if (!class414.method2560(arg8, arg7, arg3, 1)) {
            return false;
        }
        int var13 = class280.field4139[2];
        int var14 = class280.field4139[0];
        int var15 = class280.field4139[arg6];
        if (class414.method2560(arg9, arg2, arg1, 1)) {
            int var16 = class280.field4139[1];
            int var17 = class280.field4139[2];
            int var18 = class280.field4139[0];
            return class419.method2589(var12, var18, var14, var13, 0, var17, var16, var10, var15, var11);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V", line = 53)
    public static final void method2737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6395++;
        if (arg1 != 1) {
            method2741(null, 70, -92, -3, 17, -107, null, 44, true, -85, 0.045188326F);
        }
        int var8 = arg0 - arg2;
        int var9 = arg2 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class138.method1069(class785.field10808[var10], (byte) 114, arg5, arg6, arg3);
        }
        int var11 = arg6 - arg2;
        for (int var12 = arg0; var12 > var8; var12--) {
            class138.method1069(class785.field10808[var12], (byte) -49, arg5, arg6, arg3);
        }
        int var13 = arg2 + arg5;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class785.field10808[var14];
            class138.method1069(var15, (byte) 82, arg5, var13, arg3);
            class138.method1069(var15, (byte) -112, var13, var11, arg4);
            class138.method1069(var15, (byte) 76, var11, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laj;[ILaj;B)V", line = 101)
    public static final void method2738(class333 arg0, int[] arg1, class333 arg2, byte arg3) {
        if (arg1 != null) {
            class383.field5611 = arg1;
        }
        class569.field7583 = arg0;
        field6400++;
        if (arg3 != 77) {
            method2740((byte) -96);
        }
        class543.field7371 = arg2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 121)
    public static void method2739(int arg0) {
        if (arg0 != -4) {
            method2741(null, 33, 46, 66, -41, -7, null, -128, true, 66, 1.3950858F);
        }
        field6396 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 131)
    public static final void method2740(byte arg0) {
        field6399++;
        int var1 = -128 / ((arg0 + 56) / 62);
        class239 var2 = class332.field4802;
        synchronized (class332.field4802) {
            class332.field4802.method1555((byte) -3);
        }
        class239 var3 = class87.field1228;
        synchronized (class87.field1228) {
            class87.field1228.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([FIIIII[FIZIF)V", line = 146)
    public static final void method2741(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, boolean arg8, int arg9, float arg10) {
        int var11 = arg5 - arg3;
        int var12 = arg4 - arg7;
        field6398++;
        int var13 = arg2 - arg1;
        float var14 = arg6[2] * (float) var12 + arg6[0] * (float) var13 + arg6[1] * (float) var11;
        float var15 = arg6[5] * (float) var12 + arg6[3] * (float) var13 + arg6[4] * (float) var11;
        float var16 = arg6[8] * (float) var12 + arg6[7] * (float) var11 + arg6[6] * (float) var13;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        if (!arg8) {
            field6403 = 64;
        }
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg10 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg9 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg9 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg9 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg0[0] = var18;
        arg0[1] = var19;
    }
}
