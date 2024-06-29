import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class665 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field9432;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field9435 = -1;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lgj;")
    public static class593 field9431 = new class593();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lkga;")
    public static class511 field9437;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method3731(byte arg0) {
        int var1 = -107 % ((arg0 + 24) / 39);
        field9431 = null;
        field9437 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
    public static final int method3732(byte arg0) {
        field9436++;
        if (arg0 != 1) {
            field9437 = null;
        }
        return class429.method2449(false, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
    public static final int method3733(int arg0) {
        if (arg0 != 6) {
            method3734((byte) 60, -31, -29);
        }
        field9429++;
        return class529.field7056;
    }

    @OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9434++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)V")
    public static final void method3734(byte arg0, int arg1, int arg2) {
        field9433++;
        if (class505.field6740 != arg1) {
            class168.field2599 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class168.field2599[var3] = (var3 << 12) / arg1;
            }
            class505.field6740 = arg1;
            class313.field4306 = arg1 - 1;
            class454.field6187 = arg1 * 32;
        }
        if (class471.field6301 != arg2) {
            if (class505.field6740 == arg2) {
                class402.field5353 = class168.field2599;
            } else {
                class402.field5353 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class402.field5353[var4] = (var4 << 12) / arg2;
                }
            }
            class471.field6301 = arg2;
            class658.field9107 = arg2 - 1;
        }
        if (arg0 != 16) {
            method3733(-68);
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
    public class665(int arg0, int arg1) {
        this.field9432 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIFIFF)[F")
    public static final float[] method3735(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float arg7) {
        field9430++;
        float[] var8 = new float[9];
        if (arg3 > -55) {
            return null;
        }
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[0] = var10;
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[8] = var10;
        var8[5] = 0.0F;
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg5 / var19;
                var14 = (float) (-arg0) / var19;
            }
            var13[1] = var15 * var18;
            var13[6] = var14 * var15 * var17;
            var13[2] = var14 * var15 * var17;
            var13[0] = var14 * var14 * var17 + var16;
            var13[7] = -var14 * var18;
            var13[4] = var16;
            var13[5] = var14 * var18;
            var13[3] = -var15 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[3] *= arg6;
        var9[8] *= arg4;
        var9[7] *= arg4;
        var9[4] *= arg6;
        var9[1] *= arg7;
        var9[6] *= arg4;
        var9[0] *= arg7;
        var9[5] *= arg6;
        var9[2] *= arg7;
        return var9;
    }
}
