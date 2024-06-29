import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class157 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public static int[] field2237 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[S")
    public static short[] field2236 = new short[256];

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "J")
    public static long field2238 = 0L;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(FFBIFIII)[F")
    public static final float[] method1122(float arg0, float arg1, byte arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field2235++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[2] = var11;
        var8[4] = 1.0F;
        var8[8] = var10;
        var8[7] = 0.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg3 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg5 / var19;
                var14 = (float) (-arg6) / var19;
            }
            var13[2] = var14 * var16 * var18;
            var13[7] = -var14 * var17;
            var13[4] = var15;
            var13[1] = var16 * var17;
            var13[5] = var14 * var17;
            var13[3] = -var16 * var17;
            var13[6] = var14 * var16 * var18;
            var13[0] = var14 * var14 * var18 + var15;
            var13[8] = var16 * var16 * var18 + var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[7] *= arg0;
        int var20 = 70 / ((-arg2 - 43) / 38);
        var9[4] *= arg4;
        var9[2] *= arg1;
        var9[3] *= arg4;
        var9[6] *= arg0;
        var9[5] *= arg4;
        var9[8] *= arg0;
        var9[0] *= arg1;
        var9[1] *= arg1;
        return var9;
    }

    @OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2233++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([FIIIFFIIIIB)V")
    public static final void method1123(float[] arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field2234++;
        int var11 = arg9 - arg8;
        int var12 = arg2 - arg6;
        int var13 = arg1 - arg3;
        int var14 = 62 % ((40 - arg10) / 57);
        float var15 = arg0[2] * (float) var12 + arg0[1] * (float) var11 + arg0[0] * (float) var13;
        float var16 = arg0[5] * (float) var12 + arg0[4] * (float) var11 + arg0[3] * (float) var13;
        float var17 = arg0[8] * (float) var12 + arg0[6] * (float) var13 + arg0[7] * (float) var11;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg5 != 1.0F) {
            var18 = arg5 * var18;
        }
        float var19 = var16 + arg4 + 0.5F;
        if (arg7 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class143.field2067 = var18;
        class496.field7028 = var19;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static void method1124(boolean arg0) {
        field2236 = null;
        field2237 = null;
        if (!arg0) {
            field2236 = null;
        }
    }
}
