import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class542 {

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field8109 = -1;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Lha;")
    public static class116 field8106;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Lnl;")
    public static class533 field8105;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method3184(int arg0, int arg1, int arg2) {
        if (arg0 != 6) {
            field8105 = null;
        }
        field8104++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(III)Z", line = 17)
    public static final boolean method3185(int arg0, int arg1, int arg2) {
        field8110++;
        if (arg1 == -18225) {
            return (arg2 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 30)
    public static final void method3186(int arg0) {
        int var1 = 70 % ((arg0 - 9) / 45);
        field8108++;
        for (class537 var2 = (class537) class178.field2698.method2496((byte) 10); var2 != null; var2 = (class537) class178.field2698.method2494(64)) {
            if (var2.field7938 == -1) {
                var2.field7947 = 0;
                if (var2.field7940 >= 0 && var2.field7948 >= 0 && var2.field7940 < class35.field399 && var2.field7948 < class382.field5586) {
                    class464.method2754(var2, (byte) 74);
                }
            } else {
                var2.method2997(1);
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V", line = 62)
    public static void method3187(int arg0) {
        if (arg0 == 0) {
            field8105 = null;
            field8106 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIFFIIFB)[F", line = 74)
    public static final float[] method3188(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, byte arg7) {
        field8107++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        int var12 = 2 / ((arg7 - 40) / 47);
        var8[7] = 0.0F;
        var8[8] = var10;
        var8[1] = 0.0F;
        var8[2] = var11;
        float var13 = 1.0F - var10;
        var8[6] = -var11;
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = (float) arg0 / 32767.0F;
        float var17 = 0.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var19 = 1.0F - var16;
        float var20 = (float) Math.sqrt((double) (arg4 * arg4 + arg5 * arg5));
        if (var20 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var15 = (float) (-arg5) / var20;
                var17 = (float) arg4 / var20;
            }
            var14[3] = -var17 * var18;
            var14[7] = -var15 * var18;
            var14[0] = var15 * var15 * var19 + var16;
            var14[5] = var15 * var18;
            var14[4] = var16;
            var14[2] = var15 * var17 * var19;
            var14[1] = var17 * var18;
            var14[6] = var15 * var17 * var19;
            var14[8] = var17 * var17 * var19 + var16;
            var9[0] = var8[2] * var14[6] + var8[1] * var14[3] + var8[0] * var14[0];
            var9[1] = var8[2] * var14[7] + var8[0] * var14[1] + var8[1] * var14[4];
            var9[3] = var8[5] * var14[6] + var8[3] * var14[0] + var8[4] * var14[3];
            var9[2] = var8[2] * var14[8] + var8[1] * var14[5] + var8[0] * var14[2];
            var9[4] = var8[5] * var14[7] + var8[4] * var14[4] + var8[3] * var14[1];
            var9[5] = var8[5] * var14[8] + var8[4] * var14[5] + var8[3] * var14[2];
            var9[6] = var8[8] * var14[6] + var8[7] * var14[3] + var8[6] * var14[0];
            var9[7] = var8[8] * var14[7] + var8[6] * var14[1] + var8[7] * var14[4];
            var9[8] = var8[8] * var14[8] + var8[6] * var14[2] + var8[7] * var14[5];
        }
        var9[8] *= arg2;
        var9[3] *= arg3;
        var9[1] *= arg6;
        var9[0] *= arg6;
        var9[7] *= arg2;
        var9[2] *= arg6;
        var9[4] *= arg3;
        var9[6] *= arg2;
        var9[5] *= arg3;
        return var9;
    }
}
