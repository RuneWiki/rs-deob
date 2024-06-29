import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class419 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "J")
    public static long field5734 = -1L;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "F")
    public static float field5732;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBIII)V", line = 3)
    public static final void method2541(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5733++;
        int var7 = class527.method3176(arg4, class407.field5535, class734.field10153, -2);
        if (arg3 != -33) {
            method2541(-35, -74, -16, (byte) -11, -89, -109, 91);
        }
        int var8 = class527.method3176(arg5, class407.field5535, class734.field10153, -2);
        int var9 = class527.method3176(arg1, class463.field6533, class618.field8645, -2);
        int var10 = class527.method3176(arg6, class463.field6533, class618.field8645, arg3 + 31);
        int var11 = class527.method3176(arg2 + arg4, class407.field5535, class734.field10153, -2);
        int var12 = class527.method3176(arg5 - arg2, class407.field5535, class734.field10153, -2);
        for (int var13 = var7; var13 < var11; var13++) {
            class434.method2601(class746.field10330[var13], var9, arg0, (byte) -62, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class434.method2601(class746.field10330[var14], var9, arg0, (byte) -62, var10);
        }
        int var15 = class527.method3176(arg1 + arg2, class463.field6533, class618.field8645, -2);
        int var16 = class527.method3176(arg6 - arg2, class463.field6533, class618.field8645, arg3 + 31);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class746.field10330[var17];
            class434.method2601(var18, var9, arg0, (byte) -62, var15);
            class434.method2601(var18, var16, arg0, (byte) -62, var10);
        }
    }
}
