import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class117 {

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1352 = 0;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIII)V", line = 12)
    public static final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1351++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg3 * arg3;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg0 != 2051411841) {
            method707(-73, -28, 11, 75, -22, -16);
        }
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg1 >= class58.field602 && arg1 <= class501.field7217) {
            int var20 = class512.method2932((byte) -46, arg3 + arg4, class163.field1942, class326.field4246);
            int var21 = class512.method2932((byte) -46, arg4 - arg3, class163.field1942, class326.field4246);
            class445.method2463(var21, 98, var20, arg5, class156.field1755[arg1]);
        }
        int var22 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var7--;
            var22 -= var15;
            var18 -= var15;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (var24 >= class58.field602 && var23 <= class501.field7217) {
                int var25 = class512.method2932((byte) -46, arg4 + var6, class163.field1942, class326.field4246);
                int var26 = class512.method2932((byte) -46, arg4 - var6, class163.field1942, class326.field4246);
                if (class58.field602 <= var23) {
                    class445.method2463(var26, 120, var25, arg5, class156.field1755[var23]);
                }
                if (class501.field7217 >= var24) {
                    class445.method2463(var26, 114, var25, arg5, class156.field1755[var24]);
                }
            }
        }
    }
}
