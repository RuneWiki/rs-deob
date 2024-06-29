import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class267 extends class60 {

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "[Leh;")
    public static class381[] field3150 = new class381[37];

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "Lhj;")
    public static class596 field3147 = new class596(47, 4);

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "Z")
    public static boolean field3158 = true;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "Z")
    public static boolean field3161 = false;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field3160 = -1;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "[[[B")
    public static byte[][][] field3162;

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lhd;)V", line = 4)
    public class267(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)I", line = 8)
    public final int method406(int arg0, int arg1) {
        if (arg0 != 0) {
            field3161 = true;
        }
        ++field3155;
        return 1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I", line = 19)
    public final int method1581(int arg0) {
        ++field3152;
        if (arg0 != 0) {
            this.method1581(21);
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IFBFIIIF)[F", line = 33)
    public static final float[] method1582(int arg0, float arg1, byte arg2, float arg3, int arg4, int arg5, int arg6, float arg7) {
        ++field3154;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[0] = var10;
        var8[5] = 0.0F;
        var8[6] = -var11;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        float var12 = -var10 + 1.0F;
        var8[2] = var11;
        var8[7] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg0 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var18 = -var15 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg6) / var19;
                var16 = (float) arg5 / var19;
            }
            var13[7] = -var14 * var17;
            var13[2] = var14 * var16 * var18;
            var13[4] = var15;
            var13[6] = var14 * var16 * var18;
            var13[0] = var14 * var14 * var18 + var15;
            var13[8] = var16 * var16 * var18 + var15;
            var13[5] = var14 * var17;
            var13[3] = -var16 * var17;
            var13[1] = var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[7] *= arg3;
        var9[8] *= arg3;
        var9[4] *= arg1;
        var9[5] *= arg1;
        var9[0] *= arg7;
        var9[3] *= arg1;
        var9[1] *= arg7;
        var9[6] *= arg3;
        if (arg2 != 23) {
            field3158 = true;
        }
        var9[2] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Ldq;", line = 116)
    public static final class727 method1583(int arg0, int arg1, int arg2) {
        if (class107.field1351[arg0][arg1][arg2] == null) {
            boolean var3 = class107.field1351[0][arg1][arg2] != null && class107.field1351[0][arg1][arg2].field10172 != null;
            if (var3 && arg0 >= class368.field4569 - 1) {
                return null;
            }
            class651.method3677(arg0, arg1, arg2);
        }
        return class107.field1351[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(II)V", line = 136)
    public static final void method1584(int arg0, int arg1) {
        if (arg1 == 0) {
            if (~class558.field7751 == -1) {
                class665.field9130.method3014(arg0, -2);
            } else {
                class486.field6774 = arg0;
            }
            ++field3148;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V", line = 153)
    public static final void method1585(byte arg0) {
        ++field3157;
        if (arg0 != 76) {
            field3161 = false;
        }
        if (!class393.field5086) {
            class687.field9377 += (-class687.field9377 + 24.0F) / 2.0F;
            class197.field2345 = true;
            class393.field5086 = true;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)I", line = 172)
    public static final int method1586(boolean arg0, int arg1) {
        ++field3153;
        if (arg1 != 9) {
            return 8;
        } else {
            int var2 = class727.field10184;
            if (var2 != 0) {
                if (~var2 != -2) {
                    return var2 == 2 ? 0 : 0;
                } else {
                    return class168.field2025;
                }
            } else {
                return !arg0 ? class168.field2025 : 0;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)I", line = 213)
    public final int method405(boolean arg0) {
        ++field3149;
        if (arg0) {
            method1583(69, -63, -22);
        }
        return 127;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILhd;)V", line = 224)
    public class267(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 234)
    public static void method1587(int arg0) {
        field3150 = null;
        field3162 = null;
        int var1 = 51 / ((arg0 - -4) / 59);
        field3147 = null;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V", line = 248)
    public final void method409(byte arg0) {
        if (super.field799 < 0 && ~super.field799 < -128) {
            super.field799 = this.method405(false);
        }
        ++field3156;
        if (arg0 >= -27) {
            method1582(115, 0.9199272F, (byte) -41, -2.083033F, -8, 95, 44, -0.3295092F);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V", line = 264)
    public final void method407(byte arg0, int arg1) {
        ++field3151;
        super.field799 = arg1;
        int var3 = -60 % ((28 - arg0) / 50);
    }
}
