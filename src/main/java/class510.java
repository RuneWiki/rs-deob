import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class510 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2863(byte arg0) {
        if (arg0 != -102) {
            method2864(99, 120, 24, 0.1783325F, -106, null, -100, -98, 90, 41);
        }
        field7073++;
        class451.field6553 = null;
        class566.field8088 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIFI[FIIII)V", line = 27)
    public static final void method2864(int arg0, int arg1, int arg2, float arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field7075++;
        int var10 = arg1 - arg7;
        int var11 = arg0 - arg2;
        int var12 = arg6 - arg4;
        float var13 = arg5[2] * (float) var11 + arg5[1] * (float) var10 + arg5[0] * (float) var12;
        float var14 = arg5[5] * (float) var11 + arg5[4] * (float) var10 + arg5[3] * (float) var12;
        float var15 = arg5[8] * (float) var11 + arg5[6] * (float) var12 + arg5[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg3 + 0.5F;
        if (arg8 != 3094) {
            return;
        }
        if (arg9 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg9 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg9 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class524.field7285 = var18;
        class311.field4556 = var17;
    }
}
