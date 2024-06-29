import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class137 extends class544 {

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "J")
    public long field1670;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "[Lei;")
    public static class152[] field1674 = new class152[4];

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field1672 = 0;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Z")
    public static boolean field1675 = true;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field1671 = 0;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "F")
    public static float field1676;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "Lra;")
    public static class90 field1673;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZII)Lmd;", line = 4)
    public static final class463 method762(int arg0, boolean arg1, int arg2, int arg3) {
        field1668++;
        class349 var4 = class383.field5070[arg3][arg0][arg2];
        if (var4 == null) {
            return null;
        }
        class463 var5 = null;
        int var6 = -1;
        if (arg1) {
            method763((byte) -57);
        }
        for (class61 var7 = var4.field4499; var7 != null; var7 = var7.field595) {
            class598 var8 = var7.field589;
            if (var8 instanceof class463) {
                class463 var9 = (class463) var8;
                int var10 = (var9.method2694(28146) - 1) * 64 + 60;
                int var11 = var9.field8661 - var10 >> 7;
                int var12 = var9.field8652 - var10 >> 7;
                int var13 = var9.field8661 + var10 >> 7;
                int var14 = var9.field8652 + var10 >> 7;
                if (var11 <= arg0 && arg2 >= var12 && var13 >= arg0 && var14 >= arg2) {
                    int var15 = (var13 - (arg0 - 1)) * (var14 + 1 - arg2);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V", line = 64)
    public static void method763(byte arg0) {
        if (arg0 != -67) {
            method764((byte) 104, 1.1859796F, 0.9078985F, 101, -120, 0.14398605F, -64, -36);
        }
        field1673 = null;
        field1674 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BFFIIFII)[F", line = 89)
    public static final float[] method764(byte arg0, float arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7) {
        field1669++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[8] = var10;
        var8[7] = 0.0F;
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg4 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        int var18 = 126 % ((-arg0 - 35) / 47);
        float var19 = 1.0F - var15;
        float var20 = (float) Math.sqrt((double) (arg6 * arg6 + (arg7 * arg7)));
        if (var20 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var16 = (float) arg6 / var20;
                var14 = (float) (-arg7) / var20;
            }
            var13[7] = -var14 * var17;
            var13[1] = var16 * var17;
            var13[5] = var14 * var17;
            var13[2] = var14 * var16 * var19;
            var13[8] = var16 * var16 * var19 + var15;
            var13[0] = var14 * var14 * var19 + var15;
            var13[4] = var15;
            var13[6] = var14 * var16 * var19;
            var13[3] = -var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[1] *= arg5;
        var9[0] *= arg5;
        var9[3] *= arg1;
        var9[5] *= arg1;
        var9[4] *= arg1;
        var9[6] *= arg2;
        var9[7] *= arg2;
        var9[2] *= arg5;
        var9[8] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 170)
    public class137() {
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(J)V", line = 175)
    public class137(long arg0) {
        this.field1670 = arg0;
    }
}
