import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class517 extends class429 {

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field6897 = -50;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lxa;")
    private class468 field6903;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
    public static final boolean method2883(int arg0, int arg1) {
        ++field6901;
        if (arg1 != 4) {
            return true;
        } else {
            return arg0 == 0 || arg0 == 4;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public final void method911(byte arg0) {
        super.method911(arg0);
        ++field6902;
        this.field6903 = class429.method2448(super.field5888, 18638, ((class698) super.field5899).field9796);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIIZ)V")
    public final void method1181(int arg0, int arg1, int arg2, boolean arg3) {
        ++field6896;
        class10.field197.method423(arg1 + -2, arg0, super.field5899.field4067 + 4, super.field5899.field4075 + 2, ((class698) super.field5899).field9798, 0);
        int var5 = -33 / ((arg2 - 2) / 54);
        class10.field197.method423(arg1 + -1, arg0 + 1, super.field5899.field4067 + 2, super.field5899.field4075, 0, 0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I")
    public static final int method2884(int arg0, int arg1, int arg2) {
        ++field6895;
        if (~arg0 == 1) {
            return 12345678;
        } else if (~arg0 == arg2) {
            if (arg1 >= 2) {
                if (arg1 > 126) {
                    arg1 = 126;
                }
            } else {
                arg1 = 2;
            }
            return arg1;
        } else {
            int var3 = (127 & arg0) * arg1 >> 7;
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg0 & 65408) - -var3;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lbi;Lbi;Lkr;)V")
    public class517(class449 arg0, class449 arg1, class698 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z")
    public final boolean method913(int arg0) {
        ++field6900;
        if (arg0 < 13) {
            this.field6903 = null;
        }
        return !super.method913(84) ? false : super.field5888.method2549(((class698) super.field5899).field9796, 3015);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IFIIFIFI)[F")
    public static final float[] method2885(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, float arg6, int arg7) {
        ++field6899;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        float var12 = -var10 + 1.0F;
        var8[2] = var11;
        var8[7] = 0.0F;
        var8[8] = var10;
        var8[1] = 0.0F;
        var8[6] = -var11;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (-(var16 * var16) + 1.0F)));
        float var18 = -var16 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg5 / var19;
                var14 = (float) (-arg0) / var19;
            }
            var13[1] = var15 * var17;
            var13[7] = -var14 * var17;
            var13[6] = var14 * var15 * var18;
            var13[3] = -var15 * var17;
            var13[4] = var16;
            var13[0] = var14 * var14 * var18 + var16;
            var13[5] = var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[3] *= arg1;
        var9[8] *= arg4;
        var9[5] *= arg1;
        var9[6] *= arg4;
        var9[4] *= arg1;
        var9[2] *= arg6;
        var9[arg3] *= arg6;
        var9[7] *= arg4;
        var9[1] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIZ)V")
    public final void method1179(int arg0, int arg1, int arg2, boolean arg3) {
        ++field6898;
        int var5 = this.method2450(7555) * super.field5899.field4067 / 10000;
        int[] var6 = new int[4];
        class10.field197.method433(var6);
        class10.field197.method421(arg2, arg0 + arg1, arg2 + var5, super.field5899.field4075 + arg1);
        this.field6903.method2643(arg2, arg1 - -2, super.field5899.field4067, super.field5899.field4075);
        class10.field197.method421(var6[0], var6[1], var6[2], var6[3]);
    }
}
