import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class28 extends class590 {

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "B")
    public byte field473 = 5;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!mca", name = "y", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!mca", name = "A", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!mca", name = "B", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!mca", name = "C", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!mca", name = "D", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!mca", name = "E", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!mca", name = "G", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "Lci;")
    public static class382 field471;

    @OriginalMember(owner = "client!mca", name = "H", descriptor = "Z")
    public boolean field481;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(III)B")
    public static final byte method304(int arg0, int arg1, int arg2) {
        if (arg0 > -45) {
            return -40;
        }
        field476++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BIII)I")
    public static final int method305(byte arg0, int arg1, int arg2, int arg3) {
        field470++;
        int var4 = arg1 / arg2;
        int var5 = arg2 - 1 & arg1;
        int var6 = arg3 / arg2;
        int var7 = arg2 - 1 & arg3;
        int var8 = class265.method1738(true, var6, var4);
        int var9 = class265.method1738(true, var6, var4 + 1);
        int var10 = class265.method1738(true, var6 + 1, var4);
        int var11 = 66 % ((6 - arg0) / 36);
        int var12 = class265.method1738(true, var6 + 1, var4 - -1);
        int var13 = class137.method920(var8, arg2, var9, (byte) 125, var5);
        int var14 = class137.method920(var10, arg2, var12, (byte) 105, var5);
        return class137.method920(var13, arg2, var14, (byte) 34, var7);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IFIFIIFB)[F")
    public static final float[] method306(int arg0, float arg1, int arg2, float arg3, int arg4, int arg5, float arg6, byte arg7) {
        field472++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        float var12 = 1.0F - var10;
        var8[6] = -var11;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[0] = var10;
        var8[2] = var11;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg4 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg5 * arg5));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var16 = (float) arg2 / var19;
            }
            var13[5] = var14 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[4] = var15;
            var13[1] = var16 * var17;
            var13[7] = -var14 * var17;
            var13[2] = var14 * var16 * var18;
            var13[6] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var13[3] = -var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[8] *= arg3;
        var9[5] *= arg1;
        var9[7] *= arg3;
        int var20 = -82 / ((-arg7 - 25) / 60);
        var9[4] *= arg1;
        var9[2] *= arg6;
        var9[6] *= arg3;
        var9[3] *= arg1;
        var9[1] *= arg6;
        var9[0] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method307(int arg0, String arg1) {
        System.exit(1);
        if (arg0 != -13880) {
            field477 = -111;
        }
        field474++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public static void method308(byte arg0) {
        if (arg0 >= 53) {
            field471 = null;
        }
    }
}
