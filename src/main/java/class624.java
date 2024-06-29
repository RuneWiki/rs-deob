import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class624 extends class213 {

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[I")
    public int[] field8840;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "[I")
    public int[] field8838;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "Lvj;")
    public static class402 field8841 = new class402(1);

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V", line = 4)
    public static void method3492(int arg0) {
        field8841 = null;
        if (arg0 <= 119) {
            method3494(-27, -22, -2, 0.5644169F, -0.06825573F, false, -65, 0.24829899F, 13, -66, null, -76, 50);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V", line = 16)
    public static final void method3493(int arg0, int arg1, boolean arg2) {
        field8842++;
        if (arg0 != 2) {
            field8841 = null;
        }
        class472 var3 = class236.method1367(arg1, true, arg2);
        if (var3 != null) {
            var3.method1519((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIFFZIFII[FII)V", line = 33)
    public static final void method3494(int arg0, int arg1, int arg2, float arg3, float arg4, boolean arg5, int arg6, float arg7, int arg8, int arg9, float[] arg10, int arg11, int arg12) {
        int var13 = arg6 - arg12;
        field8839++;
        int var14 = arg8 - arg9;
        if (!arg5) {
            return;
        }
        int var15 = arg11 - arg1;
        float var16 = arg10[2] * (float) var14 + arg10[0] * (float) var15 + arg10[1] * (float) var13;
        float var17 = arg10[5] * (float) var14 + arg10[4] * (float) var13 + arg10[3] * (float) var15;
        float var18 = arg10[8] * (float) var14 + arg10[7] * (float) var13 + arg10[6] * (float) var15;
        float var19;
        float var20;
        if (arg0 == 0) {
            var20 = arg7 + var16 + 0.5F;
            var19 = arg3 + 0.5F - var18;
        } else if (arg0 == 1) {
            var19 = arg3 + var18 + 0.5F;
            var20 = arg7 + var16 + 0.5F;
        } else if (arg0 == 2) {
            var19 = arg4 + 0.5F - var17;
            var20 = arg7 + 0.5F - var16;
        } else if (arg0 == 3) {
            var20 = arg7 + var16 + 0.5F;
            var19 = arg4 + 0.5F - var17;
        } else if (arg0 == 4) {
            var20 = arg3 + var18 + 0.5F;
            var19 = arg4 + 0.5F - var17;
        } else {
            var19 = arg4 + 0.5F - var17;
            var20 = arg3 + 0.5F - var18;
        }
        if (arg2 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg2 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg2 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class168.field2014 = var19;
        class554.field7897 = var20;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(II[I[I)V", line = 127)
    public class624(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field8840 = arg2;
        this.field8838 = arg3;
    }
}
