import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class539 extends class417 {

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Z")
    public boolean field8019;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public int field8016;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public int field8015;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public int field8013;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public int field8017;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public int field8018;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Llu;")
    public static class610 field8022 = new class610(9, -1);

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "F")
    public static float field8023 = 0.0F;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "Lh;")
    public static class572 field8024 = new class572("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "[[I")
    public static int[][] field8026;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method3265(int arg0) {
        field8026 = null;
        field8024 = null;
        int var1 = -59 % ((-arg0 - 11) / 37);
        field8022 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IFIBIIFF)[F")
    public static final float[] method3266(int arg0, float arg1, int arg2, byte arg3, int arg4, int arg5, float arg6, float arg7) {
        field8021++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[0] = var10;
        var8[2] = var11;
        var8[1] = 0.0F;
        var8[6] = -var11;
        var8[4] = 1.0F;
        var8[8] = var10;
        var8[3] = 0.0F;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        if (arg3 != -57) {
            field8023 = 0.29250237F;
        }
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg0) / var19;
                var15 = (float) arg5 / var19;
            }
            var13[0] = var14 * var14 * var17 + var16;
            var13[5] = var14 * var18;
            var13[6] = var14 * var15 * var17;
            var13[2] = var14 * var15 * var17;
            var13[4] = var16;
            var13[3] = -var15 * var18;
            var13[7] = -var14 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[1] = var15 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[5] *= arg6;
        var9[1] *= arg7;
        var9[8] *= arg1;
        var9[7] *= arg1;
        var9[3] *= arg6;
        var9[0] *= arg7;
        var9[2] *= arg7;
        var9[6] *= arg1;
        var9[4] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method3267(String arg0, boolean arg1) {
        if (arg1) {
            method3265(58);
        }
        field8014++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static final void method3268(int arg0) {
        if (class645.field9389 != null) {
            class645.field9389.method1580((byte) 72);
        }
        if (arg0 == 5) {
            field8020++;
            if (class92.field1377 != null) {
                class92.field1377.method1580((byte) 72);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIZ)V")
    public class539(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field8019 = arg5;
        this.field8016 = arg2;
        this.field8015 = arg1;
        this.field8013 = arg0;
        this.field8017 = arg3;
        this.field8018 = arg4;
    }
}
