import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class25 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lvf;")
    public static class265 field693 = class87.method582(-46, "Okay");

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Z")
    public static boolean field695 = false;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[I")
    public static int[] field691 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
    public static int[] field698 = new int[2];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
    public static final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field690++;
        if (arg2 >= class107.field1890 && class79.field1510 >= arg2) {
            int var5 = class219.method1507(class205.field3681, class81.field1521, arg4, 0);
            int var6 = class219.method1507(class205.field3681, class81.field1521, arg1, 0);
            class208.method1429(125, var6, arg3, arg2, var5);
        }
        if (arg0 >= -66) {
            field692 = -58;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method230(byte arg0) {
        field693 = null;
        if (arg0 != 123) {
            method231(true);
        }
        field691 = null;
        field698 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z")
    public static final boolean method231(boolean arg0) {
        field696++;
        try {
            if (class216.field3899 == 2) {
                if (class31.field785 == null) {
                    class31.field785 = class191.method1299(class125.field2245, class120.field2114, class29.field745);
                    if (class31.field785 == null) {
                        return false;
                    }
                }
                if (class245.field4272 == null) {
                    class245.field4272 = new class214(class208.field3754, class11.field380);
                }
                if (class270.field4818.method187(class31.field785, class245.field4272, 22050, (byte) 67, class42.field941)) {
                    class270.field4818.method194((byte) -20);
                    class270.field4818.method190(-386301040, class186.field3372);
                    class270.field4818.method206((byte) 117, class219.field3957, class31.field785);
                    class216.field3899 = 0;
                    class125.field2245 = null;
                    class31.field785 = null;
                    class245.field4272 = null;
                    return true;
                }
            }
            if (!arg0) {
                field695 = true;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class270.field4818.method193(0);
            class245.field4272 = null;
            class125.field2245 = null;
            class216.field3899 = 0;
            class31.field785 = null;
        }
        return false;
    }
}
