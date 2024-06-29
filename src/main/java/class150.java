import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class150 extends class350 {

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "[B")
    private byte[] field2149;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class150() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V")
    public final void method1039(int arg0, byte arg1, int arg2) {
        field2152++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        if (arg2 != 255) {
            field2151 = -128;
        }
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field2149[var10001] = var4;
        this.field2149[var6] = var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lso;I)Lem;")
    public static final class236 method1040(class494 arg0, int arg1) {
        field2148++;
        if (arg1 != 12) {
            method1041(-0.15950939F, 36, 49, -69, -95, 0.54121405F, -95, 0.07156168F);
        }
        return new class236(arg0.method2988(-3), arg0.method2988(-3), arg0.method2988(arg1 ^ 0xFFFFFFF1), arg0.method2988(-3), arg0.method2988(-3), arg0.method2988(arg1 - 15), arg0.method2988(-3), arg0.method2988(-3), arg0.method2960((byte) 94), arg0.method2964((byte) 93));
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(FIIIIFIF)[F")
    public static final float[] method1041(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float arg7) {
        field2150++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[2] = var11;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        var8[8] = var10;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg4 / 32767.0F;
        float var16 = (float) arg3;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + (arg1 * arg1)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg1) / var19;
                var16 = (float) arg2 / var19;
            }
            var13[1] = var16 * var17;
            var13[4] = var15;
            var13[8] = var16 * var16 * var18 + var15;
            var13[0] = var14 * var14 * var18 + var15;
            var13[7] = -var14 * var17;
            var13[6] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[5] = var14 * var17;
            var13[2] = var14 * var16 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[2] *= arg0;
        var9[0] *= arg0;
        var9[5] *= arg7;
        var9[7] *= arg5;
        var9[6] *= arg5;
        var9[4] *= arg7;
        var9[1] *= arg0;
        var9[8] *= arg5;
        var9[3] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1042(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 85 % ((55 - arg3) / 32);
        this.field2149 = new byte[arg0 * arg1 * arg2 * 2];
        field2153++;
        this.method158(arg1, 108, arg2, arg0);
        return this.field2149;
    }
}
