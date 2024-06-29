import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class86 {

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "Z")
    public static boolean field1036 = false;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "Lof;")
    public static class475 field1037 = new class475(3, 2);

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "[F")
    public static float[] field1039 = new float[2];

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "[I")
    public static int[] field1038;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1039 = null;
        if (arg0 == 7) {
            field1037 = null;
            field1038 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(JLjava/lang/String;IZJLjava/lang/String;IIIIZIZ)V")
    public static final void method647(long arg0, String arg1, int arg2, boolean arg3, long arg4, String arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, boolean arg12) {
        field1035++;
        if (class263.field3850 || class640.field8992 >= 500) {
            return;
        }
        int var15 = arg7 == -1 ? class213.field2954 : arg7;
        if (arg9 > 42) {
            class171 var16 = new class171(arg1, arg5, var15, arg6, arg8, arg4, arg11, arg2, arg10, arg3, arg0, arg12);
            class573.method3365(var16, 120);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZIIIIII)I")
    public static final int method648(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg2;
            arg2 = var7;
        }
        int var8 = arg3 & 0x3;
        field1034++;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 7 - (arg4 + arg1 - 1);
        } else if (var8 == 2) {
            return 7 - arg5 - (arg2 + -1);
        } else if (arg0) {
            return arg1;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBIFFIIF)[F")
    public static final float[] method649(int arg0, byte arg1, int arg2, float arg3, float arg4, int arg5, int arg6, float arg7) {
        field1033++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
        if (arg1 >= -107) {
            field1037 = null;
        }
        float var11 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[8] = var10;
        var8[7] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg0 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg6 * arg6));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg6 / var19;
                var14 = (float) (-arg2) / var19;
            }
            var13[4] = var16;
            var13[0] = var14 * var14 * var17 + var16;
            var13[7] = -var14 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[6] = var14 * var15 * var17;
            var13[1] = var15 * var18;
            var13[3] = -var15 * var18;
            var13[5] = var14 * var18;
            var13[2] = var14 * var15 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[7] *= arg4;
        var9[6] *= arg4;
        var9[2] *= arg3;
        var9[1] *= arg3;
        var9[8] *= arg4;
        var9[0] *= arg3;
        var9[5] *= arg7;
        var9[4] *= arg7;
        var9[3] *= arg7;
        return var9;
    }
}
