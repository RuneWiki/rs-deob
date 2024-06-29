import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class15 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field124++;
        int var6 = 0;
        if (arg0 > -121) {
            return;
        }
        int var7 = arg4;
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        class315.method1809(class557.field7954[arg5], arg1, -128, arg3 - arg2, arg3 - -arg2);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
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
            var13 += -var20;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var21 = arg5 - var7;
            int var22 = arg5 + var7;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class315.method1809(class557.field7954[var21], arg1, -128, var24, var23);
            class315.method1809(class557.field7954[var22], arg1, -128, var24, var23);
        }
    }
}
