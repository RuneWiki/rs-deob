import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class468 extends class587 {

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lvh;")
    public static class125 field6752 = new class125(65, 8);

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "[[Z")
    public static boolean[][] field6753 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[I")
    public static int[] field6755 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lvo;")
    public static class345 field6754;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[[[B")
    public static byte[][][] field6756;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
    public static final void method2763(int arg0, boolean arg1) {
        field6749++;
        class117 var2 = class691.field9789;
        synchronized (class691.field9789) {
            class691.field9789.method939(28093, arg0);
            if (!arg1) {
                method2764(-73, -0.23962495F, 9, 0.877626F, 0.63401777F, 54, -38, 4);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IFIFFIII)[F")
    public static final float[] method2764(int arg0, float arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7) {
        field6751++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[2] = var11;
        var8[8] = var10;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        if (arg2 != 31233) {
            field6752 = null;
        }
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg6 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg7 * arg7));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg0 / var19;
                var14 = (float) (-arg7) / var19;
            }
            var13[1] = var15 * var18;
            var13[0] = var14 * var14 * var17 + var16;
            var13[3] = -var15 * var18;
            var13[6] = var14 * var15 * var17;
            var13[5] = var14 * var18;
            var13[2] = var14 * var15 * var17;
            var13[4] = var16;
            var13[7] = -var14 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg4;
        var9[3] *= arg1;
        var9[1] *= arg3;
        var9[0] *= arg3;
        var9[4] *= arg1;
        var9[8] *= arg4;
        var9[5] *= arg1;
        var9[2] *= arg3;
        var9[7] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lis;B)Lis;")
    public static final class101 method2765(class101 arg0, byte arg1) {
        if (arg1 >= -79) {
            method2768((byte) 17);
        }
        field6748++;
        class101 var2 = client.method716(arg0);
        if (var2 == null) {
            var2 = arg0.field1556;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method2766(int arg0) {
        field6754 = null;
        field6755 = null;
        field6753 = null;
        field6752 = null;
        field6756 = null;
        if (arg0 <= 56) {
            field6753 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lhba;")
    public abstract class639 method2767(int arg0);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method2768(byte arg0) {
        if (arg0 != -110) {
            field6755 = null;
        }
        field6750++;
        class29.method273(255, -1, -9873);
    }
}
