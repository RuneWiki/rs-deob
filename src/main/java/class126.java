import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class126 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    public static int[] field1537 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Liq;")
    public static class362 field1536 = new class362("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIII)V")
    public static final void method787(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1535++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        if (!arg2) {
            method788(-23);
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class296.method1954(arg3, arg4 + arg1, class291.field4067[arg0], arg4 - arg1, -1);
        int var20 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class296.method1954(arg3, var23, class291.field4067[var21], var24, -1);
            class296.method1954(arg3, var23, class291.field4067[var22], var24, -1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method788(int arg0) {
        if (arg0 == 23725) {
            field1536 = null;
            field1537 = null;
        }
    }
}
