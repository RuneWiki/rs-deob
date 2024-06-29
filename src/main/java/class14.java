import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Lwo;")
    public static class690 field233 = new class690(113, 2);

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
    public static String field240 = "";

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Ljn;")
    public static class668 field237;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method151(int arg0, int arg1) {
        if (arg1 == 0) {
            field236++;
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIFII[FII)V", line = 17)
    public static final void method152(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float[] arg7, int arg8, int arg9) {
        int var10 = arg2 - arg9;
        int var11 = arg5 - arg6;
        field235++;
        int var12 = arg0 - arg8;
        float var13 = arg7[2] * (float) var11 + arg7[1] * (float) var12 + arg7[0] * (float) var10;
        if (arg1 != -2) {
            return;
        }
        float var14 = arg7[5] * (float) var11 + arg7[4] * (float) var12 + arg7[3] * (float) var10;
        float var15 = arg7[8] * (float) var11 + arg7[7] * (float) var12 + arg7[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg4 + 0.5F;
        if (arg3 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg3 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg3 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class335.field4462 = var17;
        class368.field4957 = var18;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZIB)V", line = 71)
    public static final void method153(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field234++;
        class356.field4752 = 0L;
        int var5 = class158.method996(3);
        if (arg1 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (!class68.field1045.method225()) {
            arg2 = true;
        }
        class419.method2529(arg0, var5, arg2, arg3, arg1, -16777216);
        if (arg4 <= 77) {
            field237 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BIIII)V", line = 94)
    public static final void method154(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field238++;
        class196.field2375 = arg4;
        class288.field3881 = arg3;
        class149.field1840 = arg1;
        if (arg0 == 11) {
            class213.field2652 = arg2;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 109)
    public static void method155(int arg0) {
        if (arg0 == 2204) {
            field237 = null;
            field233 = null;
            field240 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([I[IIII)V", line = 126)
    public static final void method156(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 > arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (((var10 & var9) + var7) > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method156(arg0, arg1, arg2, 72, var6 - 1);
            method156(arg0, arg1, var6 + 1, 68, arg4);
        }
        if (arg3 >= 53) {
            field239++;
        }
    }
}
