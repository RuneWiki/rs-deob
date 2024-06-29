import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class295 extends class339 {

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field3906 = 0;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "Lbr;")
    public class192 field3907;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "Ljava/lang/String;")
    public String field3905;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "[I")
    public int[] field3908;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "[I")
    public int[] field3916;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "[Lwh;")
    public class546[] field3917;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field3909;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 15)
    public static final void method1743(byte arg0) {
        class320.field4273 = null;
        class73.field863 = null;
        if (arg0 != -67) {
            method1743((byte) -81);
        }
        field3910++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FI[FIIIIFIII)V", line = 29)
    public static final void method1744(float arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg3;
        int var12 = arg9 - arg6;
        int var13 = arg4 - arg5;
        field3914++;
        float var14 = arg2[2] * (float) var11 + arg2[1] * (float) var13 + arg2[0] * (float) var12;
        float var15 = arg2[5] * (float) var11 + arg2[3] * (float) var12 + arg2[4] * (float) var13;
        float var16 = arg2[8] * (float) var11 + arg2[arg10] * (float) var12 + arg2[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg7 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class680.field9652 = var18;
        class253.field3320 = var17;
    }
}
