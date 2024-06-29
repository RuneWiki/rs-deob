import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class510 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7300 = -1;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lqh;")
    public static class75 field7302;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method2981(int arg0) {
        field7302 = null;
        if (arg0 != 2) {
            field7300 = -3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V")
    public static final void method2982(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7301++;
        float var5 = (float) class436.field6225 / (float) class436.field6236;
        int var6 = arg3;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg2 - var7) / arg0;
        int var9 = arg1 - (arg3 - var6) / 2;
        class459.field6580 = class436.field6236 * var9 / var6;
        class450.field6465 = class436.field6225 - class436.field6225 * var8 / var7;
        class389.field5537 = -1;
        class265.field3746 = -1;
        class79.method601(true);
    }
}
