import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class361 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Llg;")
    public static class32 field4782 = new class32(6, 0, 4, 2);

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Leba;")
    public static class550 field4788 = new class550(96, 12);

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lga;")
    public static class332 field4786;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "[[B")
    public static byte[][] field4785;

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class361(String arg0, int arg1) {
        this.field4781 = arg1;
    }

    @OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4784++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method2112(byte arg0) {
        if (arg0 != 90) {
            field4785 = null;
        }
        field4785 = null;
        field4786 = null;
        field4782 = null;
        field4788 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V")
    public static final void method2113(int arg0, int arg1, int arg2) {
        boolean var3 = class153.field2168[0][arg1][arg2] != null && class153.field2168[0][arg1][arg2].field2771 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class153.field2168[var4][arg1][arg2] == null) {
                class207 var5 = class153.field2168[var4][arg1][arg2] = new class207(var4);
                if (var3) {
                    var5.field2776++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIFFFZII)[F")
    public static final float[] method2114(int arg0, int arg1, float arg2, float arg3, float arg4, boolean arg5, int arg6, int arg7) {
        field4783++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[2] = var11;
        var8[1] = 0.0F;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        if (!arg5) {
            field4782 = null;
        }
        float var15 = (float) arg6 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + (arg7 * arg7)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg7) / var19;
                var16 = (float) arg0 / var19;
            }
            var13[6] = var14 * var16 * var17;
            var13[5] = var14 * var18;
            var13[4] = var15;
            var13[2] = var14 * var16 * var17;
            var13[1] = var16 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var13[8] = var16 * var16 * var17 + var15;
            var13[3] = -var16 * var18;
            var13[7] = -var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[3] *= arg2;
        var9[7] *= arg4;
        var9[2] *= arg3;
        var9[4] *= arg2;
        var9[8] *= arg4;
        var9[1] *= arg3;
        var9[0] *= arg3;
        var9[5] *= arg2;
        var9[6] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static final void method2115(int arg0) {
        if (class312.field4206.field5176 && class332.field4461.field3769 != -1) {
            class647.method3594(class332.field4461.field3772, class332.field4461.field3769, 40000);
        }
        int var1 = 82 % ((arg0 - 62) / 37);
        field4787++;
    }
}
