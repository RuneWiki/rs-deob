import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class223 extends class176 {

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "F")
    public float field3179;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    private int field3184;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field3182 = -1;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "[Liw;")
    public static class263[] field3188 = new class263[32];

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
    public static final void method1425(int arg0, int arg1, int arg2) {
        field3183++;
        if (arg0 == 32) {
            class314 var3 = class483.method2819(13, arg2, 21303);
            var3.method1959(19793);
            var3.field4227 = arg1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1426(int arg0) {
        field3188 = null;
        if (arg0 < 20) {
            method1432(80);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
    public static final int method1427(int arg0, int arg1) {
        if (arg1 != 0) {
            field3180 = 40;
        }
        field3181++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IFFIIIIF)[F")
    public static final float[] method1428(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        field3192++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        float var12 = 1.0F - var10;
        var8[8] = var10;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg5 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg3) / var19;
                var15 = (float) arg4 / var19;
            }
            var13[5] = var14 * var17;
            var13[4] = var16;
            var13[3] = -var15 * var17;
            var13[2] = var14 * var15 * var18;
            var13[7] = -var14 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var13[8] = var15 * var15 * var18 + var16;
            var13[1] = var15 * var17;
            var13[6] = var14 * var15 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[1] *= arg2;
        var9[5] *= arg7;
        var9[6] *= arg1;
        var9[3] *= arg7;
        var9[4] *= arg7;
        var9[8] *= arg1;
        var9[0] *= arg2;
        var9[7] *= arg1;
        var9[arg6] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I")
    public final int method1429(int arg0) {
        field3197++;
        return arg0 == 4330 ? this.field3187 : -8;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)I")
    public final int method1430(boolean arg0) {
        if (!arg0) {
            field3188 = null;
        }
        field3190++;
        return this.field3184;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBI)V")
    public abstract void method506(int arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I")
    public final int method1431(int arg0) {
        if (arg0 < 101) {
            return -115;
        } else {
            field3195++;
            return this.field3194;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(FB)V")
    public abstract void method504(float arg0, byte arg1);

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static final void method1432(int arg0) {
        field3185++;
        if (arg0 != 2) {
            method1428(52, -0.27639598F, -1.0677738F, 65, 27, 97, 70, 1.4378805F);
        }
        if (class69.field1165 == null) {
            return;
        }
        class402.field5723.method3144((byte) -124);
        class1.method3();
        class408.method2420((byte) -93);
        class239.method1493(-16956);
        class90.method655((byte) 64);
        class602.method3553(262144);
        if (class538.field7520 != null) {
            class538.field7520.method1652(arg0 ^ 0xFFFFD74B);
        }
        class610.method3571(126);
        class461.method2689((byte) 31);
        class85.method642(-9135);
        class380.method2248(-127, false);
        class263.method1733(false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class188 var5 = class349.field4696[var1];
            if (var5 != null) {
                var5.field615 = null;
                for (int var6 = 0; var6 < var5.field623.length; var6++) {
                    var5.field623[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class204.field2859; var2++) {
            class109 var3 = class342.field4610[var2].field7929;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field623.length; var4++) {
                    var3.field623[var4] = null;
                }
            }
        }
        class333.field4459 = null;
        class84.field1366 = null;
        class69.field1165.method1284((byte) -70);
        class69.field1165 = null;
    }

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "(I)I")
    public final int method1433(int arg0) {
        if (arg0 != 4294) {
            method1436(true);
        }
        field3191++;
        return this.field3178;
    }

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)I")
    public final int method1434(int arg0) {
        field3196++;
        return arg0 == 7 ? this.field3193 : -21;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIF)V")
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field3187 = arg2;
        this.field3178 = arg3;
        this.field3179 = arg5;
        this.field3194 = arg1;
        this.field3184 = arg4;
        this.field3193 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "(I)F")
    public final float method1435(int arg0) {
        if (arg0 != 0) {
            this.field3178 = -8;
        }
        field3189++;
        return this.field3179;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
    public static final void method1436(boolean arg0) {
        field3186++;
        if (class440.field6254 == 8) {
            class45.method440(4, 114);
        } else if (class440.field6254 == 4 || class440.field6254 == 5) {
            class45.method440(2, 43);
        } else if (class440.field6254 == 11) {
            class45.method440(2, -90);
        }
        if (!arg0) {
            field3182 = -7;
        }
    }
}
