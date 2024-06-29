import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class636 extends class10 {

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field8561;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lcu;")
    public static class206 field8569 = new class206(24, 15);

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Luc;")
    public static class27 field8570;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8566;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "[Lkea;")
    public static class221[] field8571;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I", line = 3)
    public static final int method3513(int arg0, int arg1, int arg2) {
        field8564++;
        if (arg2 > -19) {
            method3516((byte) -126);
        }
        return arg0 == 4 || arg0 == 5 ? class338.field4684[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIII)V", line = 20)
    public static final void method3514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8563++;
        int var8 = class300.method1829(class310.field4279, arg2, 127, class442.field6058);
        int var9 = class300.method1829(class310.field4279, arg5, -61, class442.field6058);
        int var10 = class300.method1829(class600.field7959, arg3, -107, class366.field4956);
        int var11 = class300.method1829(class600.field7959, arg0, 127, class366.field4956);
        int var12 = class300.method1829(class310.field4279, arg2 + arg4, -96, class442.field6058);
        int var13 = class300.method1829(class310.field4279, arg5 - arg4, -23, class442.field6058);
        for (int var14 = var8; var14 < var12; var14++) {
            class475.method2668(arg1, var11, 7, class236.field3325[var14], var10);
        }
        if (arg6 > -29) {
            method3516((byte) -39);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class475.method2668(arg1, var11, 7, class236.field3325[var15], var10);
        }
        int var16 = class300.method1829(class600.field7959, arg3 + arg4, -9, class366.field4956);
        int var17 = class300.method1829(class600.field7959, arg0 - arg4, 110, class366.field4956);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class236.field3325[var18];
            class475.method2668(arg1, var16, 7, var19, var10);
            class475.method2668(arg7, var17, 7, var19, var16);
            class475.method2668(arg1, var11, 7, var19, var17);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 76)
    public class636(Object arg0, int arg1) {
        super(arg1);
        this.field8561 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)Z", line = 85)
    public final boolean method123(byte arg0) {
        field8562++;
        return arg0 != 54;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FIIIIIFIIFII[F)V", line = 96)
    public static final void method3515(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10, int arg11, float[] arg12) {
        field8567++;
        int var13 = arg1 - arg8;
        int var14 = arg3 - arg2;
        int var15 = arg10 - arg4;
        float var16 = arg12[2] * (float) var14 + arg12[0] * (float) var15 + arg12[1] * (float) var13;
        float var17 = arg12[5] * (float) var14 + arg12[arg7] * (float) var15 + arg12[4] * (float) var13;
        float var18 = arg12[8] * (float) var14 + arg12[6] * (float) var15 + arg12[7] * (float) var13;
        float var19;
        float var20;
        if (arg11 == 0) {
            var20 = arg6 + 0.5F - var18;
            var19 = arg0 + var16 + 0.5F;
        } else if (arg11 == 1) {
            var19 = arg0 + var16 + 0.5F;
            var20 = arg6 + var18 + 0.5F;
        } else if (arg11 == 2) {
            var20 = arg9 + 0.5F - var17;
            var19 = arg0 + 0.5F - var16;
        } else if (arg11 == 3) {
            var19 = arg0 + var16 + 0.5F;
            var20 = arg9 + 0.5F - var17;
        } else if (arg11 == 4) {
            var19 = arg6 + var18 + 0.5F;
            var20 = arg9 + 0.5F - var17;
        } else {
            var19 = arg6 + 0.5F - var18;
            var20 = arg9 + 0.5F - var17;
        }
        if (arg5 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg5 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg5 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class428.field5882 = var20;
        class305.field4230 = var19;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 182)
    public final Object method126(int arg0) {
        int var2 = 4 / ((-arg0 - 21) / 61);
        field8568++;
        return this.field8561;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V", line = 192)
    public static void method3516(byte arg0) {
        field8569 = null;
        field8571 = null;
        if (arg0 != -120) {
            method3515(-0.7888452F, 19, -51, -55, -98, 34, -0.07204388F, -107, -73, -0.22418644F, 10, -47, null);
        }
        field8570 = null;
        field8566 = null;
    }
}
