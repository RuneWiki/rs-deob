import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class470 extends class361 {

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "Lsu;")
    public class143 field6564;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "[F")
    public static float[] field6563 = new float[16];

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Lmt;")
    public static class276 field6561 = new class276(9, 0, 4, 1);

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
    public static int[] field6560;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    public static final int method2723(int arg0, int arg1) {
        field6559++;
        if (arg0 != -20101) {
            method2724(85, 53, 16, 65, -27, -126);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
    public static final void method2724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6562++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - arg2) * var15;
        class447.method2605(-7, arg4 - arg1, arg3, arg1 + arg4, class112.field1523[arg0]);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class447.method2605(arg2 ^ 0xFFFFFFF8, var24, arg3, var23, class112.field1523[var21]);
            class447.method2605(-7, var24, arg3, var23, class112.field1523[var22]);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method2725(int arg0) {
        field6561 = null;
        int var1 = -66 % ((arg0 + 60) / 42);
        field6560 = null;
        field6563 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lsu;)V")
    public class470(class143 arg0) {
        this.field6564 = arg0;
    }
}
