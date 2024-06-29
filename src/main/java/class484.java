import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class484 {

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "[I")
    public static int[] field6867 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Lcb;")
    public static class544 field6865;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
    public static final void method2831(int arg0, byte arg1) {
        if (arg1 <= 87) {
            field6867 = null;
        }
        if (class420.field5909 == 0) {
            class76.field1020.method757(144, arg0);
        } else {
            class246.field3513 = arg0;
        }
        field6866++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBIIII)V")
    public static final void method2832(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6868++;
        int var6 = 21 / ((-arg1 - 15) / 46);
        int var7 = 0;
        int var8 = arg0;
        int var9 = arg5 * arg5;
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg0 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - ((var13 - 1) * var12);
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var7 << 1) + 3) * var11;
        int var19 = ((arg0 << 1) - 3) * var12;
        int var20 = (var7 + 1) * var17;
        int var21 = (arg0 - 1) * var16;
        class382.method2347(arg2 - arg5, class347.field5087[arg4], arg3, 7, arg2 + arg5);
        while (var8 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var18;
                    var15 += var20;
                    var18 += var17;
                    var20 += var17;
                    var7++;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var20 += var17;
                var18 += var17;
                var7++;
            }
            var14 += -var21;
            var15 += -var19;
            var8--;
            var21 -= var16;
            var19 -= var16;
            int var22 = arg4 - var8;
            int var23 = arg4 + var8;
            int var24 = arg2 + var7;
            int var25 = arg2 - var7;
            class382.method2347(var25, class347.field5087[var22], arg3, 7, var24);
            class382.method2347(var25, class347.field5087[var23], arg3, 7, var24);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method2833(int arg0) {
        field6867 = null;
        field6865 = null;
        if (arg0 != 0) {
            field6867 = null;
        }
    }
}
