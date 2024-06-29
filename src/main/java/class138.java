import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class138 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lsv;")
    public static class570 field2282 = new class570(63, 1);

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
    public static int[] field2290 = new int[3];

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "[Lje;")
    public static class98[] field2291 = new class98[14];

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Leaa;")
    public static class395 field2288 = null;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Ll;")
    public static class291 field2286;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lnj;")
    public static class464 field2289;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lhi;")
    public static class465 field2285;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Z")
    public boolean field2280;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Z")
    public boolean field2283;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IFIIIFIF)[F", line = 4)
    public static final float[] method1130(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float arg7) {
        field2278++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[0] = var10;
        var8[8] = var10;
        var8[6] = -var11;
        var8[2] = var11;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg4 * arg4 + (arg3 * arg3)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg3) / var19;
                var15 = (float) arg4 / var19;
            }
            var13[3] = -var15 * var17;
            var13[7] = -var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[6] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var13[4] = var16;
            var13[1] = var15 * var17;
            var13[5] = var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[8] *= arg1;
        var9[6] *= arg1;
        var9[0] *= arg5;
        var9[2] *= arg5;
        var9[4] *= arg7;
        var9[7] *= arg1;
        var9[1] *= arg5;
        var9[3] *= arg7;
        var9[arg0] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZIBI)V", line = 86)
    public static final void method1131(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -51) {
            return;
        }
        field2281++;
        if (class420.field5820.field9482.method2338(17539) == 0) {
            class180.method1313(false, 25932);
        } else {
            class622.field8777 = class420.field5820.field9482.method2338(17539);
            class636.method3625(true, 0, 117);
        }
        class563.field7863 = arg0;
        class674.field9436 = arg1;
        class454.field6208 = arg2;
        class751.method4135(arg4);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 121)
    public static void method1132(int arg0) {
        field2289 = null;
        field2288 = null;
        field2290 = null;
        if (arg0 != 8) {
            method1132(-73);
        }
        field2282 = null;
        field2285 = null;
        field2286 = null;
        field2291 = null;
    }
}
