import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public abstract class class298 extends class587 {

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public static int field4202 = 4;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)Lgfa;")
    public abstract class656 method1505(byte arg0);

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
    public static final void method1843(byte arg0) {
        class419.field5959 = false;
        if (arg0 != -80) {
            field4202 = -91;
        }
        field4201++;
        class498.method2983(37);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([FIIFIIIBII)V")
    public static final void method1844(float[] arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        int var10 = arg9 - arg5;
        int var11 = arg4 - arg8;
        int var12 = arg6 - arg2;
        field4203++;
        float var13 = arg0[2] * (float) var10 + arg0[1] * (float) var11 + arg0[0] * (float) var12;
        float var14 = arg0[5] * (float) var10 + arg0[4] * (float) var11 + arg0[3] * (float) var12;
        float var15 = arg0[8] * (float) var10 + arg0[7] * (float) var11 + arg0[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != -121) {
            return;
        }
        float var18 = arg3 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg1 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class636.field9032 = var17;
        class703.field9946 = var18;
    }
}
