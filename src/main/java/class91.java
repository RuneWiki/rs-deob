import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class91 {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Lcq;")
    public static class110 field911 = new class110(23, -1);

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "J")
    public static long field913 = 0L;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field915 = -1;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 5)
    public static void method461(byte arg0) {
        if (arg0 > -9) {
            field915 = 100;
        }
        field911 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lvs;ILvs;)V", line = 23)
    public static final void method462(class617 arg0, int arg1, class617 arg2) {
        if (arg1 < 115) {
            field911 = null;
        }
        field914++;
        if (arg2.field8698 != null) {
            arg2.method3443(112);
        }
        arg2.field8692 = arg0.field8692;
        arg2.field8698 = arg0;
        arg2.field8698.field8692 = arg2;
        arg2.field8692.field8698 = arg2;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIFI[FI)V", line = 45)
    public static final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float[] arg8, int arg9) {
        int var10 = arg3 - arg4;
        int var11 = arg2 - arg9;
        int var12 = arg5 - arg1;
        field912++;
        float var13 = arg8[2] * (float) var11 + arg8[1] * (float) var10 + arg8[0] * (float) var12;
        float var14 = arg8[5] * (float) var11 + arg8[4] * (float) var10 + arg8[3] * (float) var12;
        float var15 = arg8[8] * (float) var11 + arg8[7] * (float) var10 + arg8[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg6 + 0.5F;
        if (arg7 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg7 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        if (arg0 < 106) {
            method463(-126, 111, -95, -109, 101, -88, 0.42007872F, -64, null, -81);
        }
        class27.field283 = var17;
        class584.field8291 = var18;
    }
}
