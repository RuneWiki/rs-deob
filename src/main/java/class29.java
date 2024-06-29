import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 {

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field437 = -1;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lcl;")
    public class173 field434;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
    public int[] field427;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field429;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIFFF)[F")
    public static final float[] method199(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        field433++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[6] = -var11;
        var8[1] = 0.0F;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[8] = var10;
        var8[2] = var11;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg0 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg3 * arg3));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg3 / var19;
                var14 = (float) (-arg1) / var19;
            }
            var13[4] = var15;
            var13[0] = var14 * var14 * var18 + var15;
            var13[2] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var13[1] = var16 * var17;
            var13[5] = var14 * var17;
            var13[7] = -var14 * var17;
            var13[6] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[8] *= arg5;
        var9[0] *= arg7;
        var9[7] *= arg5;
        var9[arg2] *= arg7;
        var9[5] *= arg6;
        var9[1] *= arg7;
        var9[6] *= arg5;
        var9[3] *= arg6;
        var9[4] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method200(int arg0, String arg1, byte arg2, String arg3, String arg4, int arg5, String arg6, int arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class405.field5626[var8] = class405.field5626[var8 - 1];
            class377.field5311[var8] = class377.field5311[var8 - 1];
            class188.field2606[var8] = class188.field2606[var8 - 1];
            class35.field498[var8] = class35.field498[var8 - 1];
            class477.field6984[var8] = class477.field6984[var8 - 1];
            class457.field6680[var8] = class457.field6680[var8 - 1];
            class344.field4743[var8] = class344.field4743[var8 - 1];
        }
        field428++;
        if (arg2 <= 73) {
            field436 = -104;
        }
        class405.field5626[0] = arg7;
        class188.field2606[0] = arg3;
        class377.field5311[0] = arg0;
        class35.field498[0] = arg1;
        class477.field6984[0] = arg6;
        class322.field4445++;
        class344.field4743[0] = arg5;
        class457.field6680[0] = arg4;
        class424.field6193 = class234.field3240;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static final void method201(boolean arg0) {
        field432++;
        int var1 = class378.field5322;
        if (arg0) {
            return;
        }
        int[] var2 = class95.field1321;
        for (int var3 = 0; var3 < var1; var3++) {
            class192 var7 = class309.field4234[var2[var3]];
            if (var7 != null && var7.field319 > 0) {
                var7.field319--;
                if (var7.field319 == 0) {
                    var7.field327 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class166.field2352; var4++) {
            int var5 = class54.field750[var4];
            class405 var6 = class179.field2534[var5];
            if (var6 != null && var6.field319 > 0) {
                var6.field319--;
                if (var6.field319 == 0) {
                    var6.field327 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([JI[Ljava/lang/Object;BI)V")
    public static final void method202(long[] arg0, int arg1, Object[] arg2, byte arg3, int arg4) {
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg4; var11++) {
                if (arg0[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var9;
            method202(arg0, arg1, arg2, (byte) -124, var6 - 1);
            method202(arg0, var6 + 1, arg2, (byte) -112, arg4);
        }
        int var15 = -50 % ((-arg3 - 46) / 47);
        field435++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZII)I")
    public static final int method203(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            method201(false);
        }
        field430++;
        int var5 = 65536 - class377.field5315[arg0 * 8192 / arg1] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }
}
