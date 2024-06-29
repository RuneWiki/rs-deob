import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class331 extends class741 {

    @OriginalMember(owner = "client!hfa", name = "p", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!hfa", name = "q", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!hfa", name = "r", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!hfa", name = "s", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Laj;Laj;Lmba;)V")
    public class331(class333 arg0, class333 arg1, class444 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IZII)V")
    public final void method13(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4777;
        int var5 = this.method4103(2048) * super.field10222.field9033 / 10000;
        class379.field5542.method563(arg3, arg0 + 2, var5, super.field10222.field9025 + -2, ((class444) super.field10222).field6232, 0);
        if (arg2 <= 102) {
            this.method14(false, (byte) 124, 122, 29);
        }
        class379.field5542.method563(arg3 + var5, arg0 + 2, -var5 + super.field10222.field9033, super.field10222.field9025 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZBII)V")
    public final void method14(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field4775;
        class379.field5542.method538(arg2 + -2, arg3, super.field10222.field9033 + 4, super.field10222.field9025 + 2, ((class444) super.field10222).field6236, 0);
        int var5 = -1 / ((64 - arg1) / 35);
        class379.field5542.method538(arg2 + -1, arg3 + 1, super.field10222.field9033 + 2, super.field10222.field9025, 0, 0);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(FIIIIIFF)[F")
    public static final float[] method2080(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7) {
        ++field4778;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[2] = var11;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[1] = 0.0F;
        float var12 = -var10 + 1.0F;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[0] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg3 / 32767.0F;
        float var17 = -var16 + 1.0F;
        float var18 = -((float) Math.sqrt((double) (-(var16 * var16) + 1.0F)));
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 - -(arg5 * arg5)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg2 / var19;
                var14 = (float) (-arg5) / var19;
            }
            var13[5] = var14 * var18;
            var13[6] = var14 * var15 * var17;
            var13[3] = -var15 * var18;
            var13[4] = var16;
            var13[0] = var14 * var14 * var17 + var16;
            var13[7] = -var14 * var18;
            var13[1] = var15 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[2] = var14 * var15 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[1] *= arg6;
        var9[8] *= arg7;
        var9[7] *= arg7;
        var9[3] *= arg0;
        var9[5] *= arg0;
        var9[0] *= arg6;
        var9[4] *= arg0;
        var9[2] *= arg6;
        var9[arg1] *= arg7;
        return var9;
    }
}
