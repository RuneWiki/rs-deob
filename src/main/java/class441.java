import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class441 {

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Lel;")
    private class513 field5545;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public int field5540;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field5539 = 0;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "F")
    public static float field5547 = 0.0F;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field5541++;
        this.field5545.method2797(0, this.field5540);
        super.finalize();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FIFIFIIB)[F", line = 15)
    public static final float[] method2417(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, byte arg7) {
        field5542++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        int var11 = -59 % ((arg7 + 66) / 37);
        float var12 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[7] = 0.0F;
        var8[8] = var10;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        var8[6] = -var12;
        var8[2] = var12;
        float var13 = 1.0F - var10;
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = 0.0F;
        float var17 = (float) arg3 / 32767.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - var17 * var17)));
        float var19 = 1.0F - var17;
        float var20 = (float) Math.sqrt((double) (arg1 * arg1 + (arg5 * arg5)));
        if (var20 == 0.0F && var17 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var15 = (float) (-arg5) / var20;
                var16 = (float) arg1 / var20;
            }
            var14[3] = -var16 * var18;
            var14[4] = var17;
            var14[2] = var15 * var16 * var19;
            var14[5] = var15 * var18;
            var14[6] = var15 * var16 * var19;
            var14[8] = var16 * var16 * var19 + var17;
            var14[0] = var15 * var15 * var19 + var17;
            var14[7] = -var15 * var18;
            var14[1] = var16 * var18;
            var9[0] = var8[2] * var14[6] + var8[0] * var14[0] + var8[1] * var14[3];
            var9[1] = var8[2] * var14[7] + var8[0] * var14[1] + var8[1] * var14[4];
            var9[3] = var8[5] * var14[6] + var8[4] * var14[3] + var8[3] * var14[0];
            var9[2] = var8[2] * var14[8] + var8[1] * var14[5] + var8[0] * var14[2];
            var9[4] = var8[5] * var14[7] + var8[4] * var14[4] + var8[3] * var14[1];
            var9[6] = var8[8] * var14[6] + var8[6] * var14[0] + var8[7] * var14[3];
            var9[5] = var8[5] * var14[8] + var8[3] * var14[2] + var8[4] * var14[5];
            var9[7] = var8[8] * var14[7] + var8[6] * var14[1] + var8[7] * var14[4];
            var9[8] = var8[8] * var14[8] + var8[7] * var14[5] + var8[6] * var14[2];
        }
        var9[8] *= arg4;
        var9[1] *= arg2;
        var9[7] *= arg4;
        var9[2] *= arg2;
        var9[4] *= arg0;
        var9[3] *= arg0;
        var9[0] *= arg2;
        var9[6] *= arg4;
        var9[5] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 106)
    public static final void method2418(int arg0) {
        field5543++;
        class564.method2998();
        for (int var1 = arg0; var1 < 4; var1++) {
            class634.field8601[var1].method979(13292);
        }
        class580.method3209(-117);
        class373.method2160(true);
        System.gc();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFB)I", line = 124)
    public static final int method2419(float arg0, float arg1, float arg2, byte arg3) {
        field5546++;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        if (arg3 != -88) {
            field5544 = 63;
        }
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        float var6 = (arg0 < 0.0F) ? -arg0 : arg0;
        if (var5 > var4 && var6 < var5) {
            return arg2 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lel;II)V", line = 166)
    public class441(class513 arg0, int arg1, int arg2) {
        this.field5545 = arg0;
        this.field5540 = arg2;
    }
}
