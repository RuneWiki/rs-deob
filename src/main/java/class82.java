import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class82 extends class181 {

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "Z")
    public static boolean field945 = false;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field948 = new String[200];

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "Ler;")
    public static class6 field949 = class542.method3043(-24380);

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "F")
    public static float field956;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "Lga;")
    public static class332 field947;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "Lcr;")
    public class485 field955;

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "[B")
    public byte[] field957;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
    public static void method434(byte arg0) {
        field948 = null;
        if (arg0 > -17) {
            method435(false);
        }
        field947 = null;
        field949 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)[I")
    public static final int[] method435(boolean arg0) {
        if (arg0) {
            field945 = false;
        }
        ++field953;
        return new int[] { class392.field5247, class360.field4778, class90.field1087 };
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIFIFZF)[F")
    public static final float[] method436(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, boolean arg6, float arg7) {
        ++field954;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[0] = var10;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[6] = -var11;
        var8[1] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var18 = -var15 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg2) / var19;
                var16 = (float) arg0 / var19;
            }
            var13[3] = -var16 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[4] = var15;
            var13[2] = var14 * var16 * var18;
            var13[6] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var13[1] = var16 * var17;
            var13[5] = var14 * var17;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg3;
        var9[8] *= arg5;
        var9[5] *= arg7;
        var9[2] *= arg3;
        var9[4] *= arg7;
        if (!arg6) {
            field948 = null;
        }
        var9[7] *= arg5;
        var9[3] *= arg7;
        var9[6] *= arg5;
        var9[1] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)[B")
    public final byte[] method437(int arg0) {
        if (arg0 != 4) {
            field947 = null;
        }
        ++field951;
        if (super.field2536) {
            throw new RuntimeException();
        } else {
            return this.field957;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
    public final int method438(byte arg0) {
        if (arg0 != -112) {
            this.field957 = null;
        }
        ++field950;
        return super.field2536 ? 0 : 100;
    }
}
