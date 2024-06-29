import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class262 extends class494 {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Z")
    public static boolean field3715 = false;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
    public static int[] field3719 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lqe;")
    public static class469 field3720 = new class469(52, -2);

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "F")
    public static float field3721;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lbba;")
    public static class115 field3718;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public static final void method1692(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3717++;
        float var5 = (float) class84.field1198 / (float) class84.field1204;
        int var6 = arg3;
        if (arg2 <= 100) {
            field3720 = null;
        }
        int var7 = arg0;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg1 - (arg3 - var6) / 2;
        int var9 = arg4 - (arg0 - var7) / 2;
        class270.field3860 = -1;
        class633.field8862 = class84.field1204 * var8 / var6;
        client.field4272 = class84.field1198 - class84.field1198 * var9 / var7;
        class190.field2880 = -1;
        class547.method3199(true);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1693(int arg0, byte arg1, int arg2) {
        field3716++;
        int var3 = 79 / ((73 - arg1) / 41);
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method1694(int arg0) {
        field3720 = null;
        field3718 = null;
        field3719 = null;
        if (arg0 > -51) {
            method1694(53);
        }
    }
}
