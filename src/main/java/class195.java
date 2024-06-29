import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class195 extends class659 {

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILwj;)I")
    public static final int method1284(int arg0, class415 arg1) {
        field2534++;
        if (arg0 != 5125) {
            return 125;
        } else if (class415.field5980 == arg1) {
            return 5120;
        } else if (class415.field5984 == arg1) {
            return 5122;
        } else if (class415.field5985 == arg1) {
            return 5124;
        } else if (class415.field5986 == arg1) {
            return 5121;
        } else if (class415.field5987 == arg1) {
            return 5123;
        } else if (class415.field5988 == arg1) {
            return 5125;
        } else if (class415.field5989 == arg1) {
            return 5131;
        } else if (class415.field5990 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public static final void method1285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2535++;
        int var6 = 0;
        if (arg3 != 5124) {
            method1285(9, -125, 51, -7, 33, 78);
        }
        int var7 = arg0;
        int var8 = arg2 * arg2;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        class464.method2733(arg4, arg5 - arg2, arg2 + arg5, arg3 ^ 0xFFFFB2E4, class228.field2951[arg1]);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class464.method2733(arg4, var24, var23, -22816, class228.field2951[var21]);
            class464.method2733(arg4, var24, var23, -22816, class228.field2951[var22]);
        }
    }
}
