import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class624 extends class101 {

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "I")
    public int field8387;

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
    public int field8390;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
    public int field8384;

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "I")
    public int field8389;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "Z")
    public boolean field8394;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public int field8382;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "Z")
    public static boolean field8385 = false;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
    public static int field8383 = -1;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "Lmga;")
    public static class739 field8388 = new class739(14, 8);

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V")
    public static final void method3415(int arg0, int arg1) {
        if (arg1 != 2) {
            return;
        }
        field8393++;
        if (class397.field5830 == 1) {
            class415.field5957 = arg0;
        } else if (class397.field5830 == 2) {
            class24.field378 = arg0;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I[FIFIIFII[FII)V")
    public static final void method3416(int arg0, float[] arg1, int arg2, float arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float[] arg9, int arg10, int arg11) {
        int var12 = arg5 - arg4;
        int var13 = arg8 - arg7;
        field8392++;
        int var14 = arg10 - arg0;
        float var15 = arg1[2] * (float) var13 + arg1[0] * (float) var14 + arg1[1] * (float) var12;
        float var16 = arg1[5] * (float) var13 + arg1[3] * (float) var14 + arg1[4] * (float) var12;
        float var17 = arg1[8] * (float) var13 + arg1[6] * (float) var14 + arg1[7] * (float) var12;
        if (arg11 >= -104) {
            method3415(80, 63);
        }
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var18 = arg6 * var18;
        }
        float var19 = var16 + arg3 + 0.5F;
        if (arg2 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg2 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg2 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg9[0] = var18;
        arg9[1] = var19;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)I")
    public static final int method3417(boolean arg0) {
        field8391++;
        if (!arg0) {
            field8388 = null;
        }
        return class218.field2907;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)V")
    public static final void method3418(int arg0, int arg1) {
        field8386++;
        if (arg0 != 8 || !class302.method1905((byte) -48)) {
            return;
        }
        if (class450.field6276 != arg1) {
            class652.field9041 = "";
        }
        class450.field6276 = arg1;
        if (class457.field6340 != null) {
            class457.field6340.method3027(2);
            class457.field6340 = null;
        }
        class300.method1901(5, 2);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public static void method3419(int arg0) {
        field8388 = null;
        if (arg0 != 6) {
            method3418(-52, 28);
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(IIIIIZ)V")
    public class624(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field8387 = arg4;
        this.field8390 = arg3;
        this.field8384 = arg1;
        this.field8389 = arg0;
        this.field8394 = arg5;
        this.field8382 = arg2;
    }
}
