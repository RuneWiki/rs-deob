import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class472 {

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "S")
    public short field6590;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "Z")
    public boolean field6596;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public int field6599;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public int field6584;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "S")
    public short field6594;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "S")
    public short field6592;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public int field6598;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "B")
    public byte field6595;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public int field6585;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "Lvh;")
    public static class328 field6588 = new class328(64);

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "Lvh;")
    public static class328 field6600 = new class328(8);

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "Llaa;")
    public static class106 field6601 = new class106(2, 4, 4, 0);

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "F")
    public static float field6591;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "Lpb;")
    public static class600 field6593;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "[I")
    public static int[] field6586;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V", line = 12)
    public static void method2683(int arg0) {
        field6588 = null;
        if (arg0 != -27652) {
            field6601 = null;
        }
        field6593 = null;
        field6601 = null;
        field6600 = null;
        field6586 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIFFIF)[F", line = 32)
    public static final float[] method2684(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, float arg7) {
        field6597++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[4] = 1.0F;
        var8[6] = -var11;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg3 * arg3));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg3) / var19;
                var15 = (float) arg0 / var19;
            }
            var13[1] = var15 * var18;
            var13[2] = var14 * var15 * var17;
            var13[8] = var15 * var15 * var17 + var16;
            var13[4] = var16;
            var13[7] = -var14 * var18;
            var13[6] = var14 * var15 * var17;
            var13[0] = var14 * var14 * var17 + var16;
            var13[3] = -var15 * var18;
            var13[5] = var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[7] *= arg5;
        var9[6] *= arg5;
        var9[5] *= arg7;
        var9[4] *= arg7;
        if (arg2 < 111) {
            method2683(-60);
        }
        var9[8] *= arg5;
        var9[1] *= arg4;
        var9[3] *= arg7;
        var9[0] *= arg4;
        var9[2] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Loa;)V", line = 124)
    public static final void method2685(class638 arg0) {
        for (int var1 = class323.field4766; var1 < class552.field7467; var1++) {
            for (int var2 = 0; var2 < class137.field1931; var2++) {
                for (int var3 = 0; var3 < class22.field308; var3++) {
                    class486 var4 = class658.field9266[var1][var2][var3];
                    if (var4 != null) {
                        class86 var5 = var4.field6750;
                        class86 var6 = var4.field6741;
                        if (var5 != null && var5.method140(0)) {
                            class499.method2788(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method140(0)) {
                                class499.method2788(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method143(0, 0, var5, 78, 0, false, arg0);
                                var6.method142(false);
                            }
                            var5.method142(false);
                        }
                        for (class20 var7 = var4.field6751; var7 != null; var7 = var7.field284) {
                            class39 var9 = var7.field281;
                            if (var9 != null && var9.method140(0)) {
                                class499.method2788(arg0, var9, var1, var2, var3, var9.field516 + 1 - var9.field517, var9.field519 - var9.field512 + 1);
                                var9.method142(false);
                            }
                        }
                        class348 var8 = var4.field6748;
                        if (var8 != null && var8.method140(0)) {
                            class208.method1377(arg0, var8, var1, var2, var3);
                            var8.method142(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 203)
    public class472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field6590 = (short) arg5;
        this.field6596 = arg10;
        this.field6599 = arg0;
        this.field6584 = arg11;
        this.field6594 = (short) arg6;
        this.field6592 = (short) arg4;
        this.field6598 = arg3;
        this.field6589 = arg2;
        this.field6595 = (byte) arg8;
        this.field6585 = arg1;
    }
}
