import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class268 {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lwa;")
    public static class75 field4642 = class66.method560("M", false);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[F")
    public static float[] field4638 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[I")
    public static int[] field4641 = new int[50];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILwa;)Lwa;", line = 5)
    public static final class75 method1924(int arg0, class75 arg1) {
        int var2 = class301.method2068(false, arg1);
        if (arg0 == -23327) {
            field4640++;
            return var2 == -1 ? class300.field5136 : class283.field4876.field2350[var2].method628(class279.field4829, -62, class32.field480);
        } else {
            return (class75) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)Z", line = 29)
    public static final boolean method1925(int arg0, boolean arg1) {
        field4639++;
        if (!arg1) {
            field4642 = (class75) null;
        }
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 77)
    public static void method1926(int arg0) {
        field4638 = null;
        if (arg0 != -160) {
            field4641 = (int[]) null;
        }
        field4642 = null;
        field4641 = null;
    }
}
