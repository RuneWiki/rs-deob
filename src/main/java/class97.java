import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class97 extends class470 {

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "Lhn;")
    public static class509 field1391 = new class509(45, 3);

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1393 = "";

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)V", line = 4)
    public static void method786(int arg0) {
        field1393 = null;
        if (arg0 >= -118) {
            method789(32, 104, -3, (class406) null, -114, -103, false);
        }
        field1391 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZII)V", line = 17)
    public final void method787(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field1394 = -34;
        }
        super.field6783 = arg2;
        super.field6791 = arg0;
        super.field6785 = arg3;
        ++field1388;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V", line = 33)
    public static final void method788(boolean arg0) {
        ++field1390;
        class293.field4455.method2588(-111);
        if (arg0) {
            class66.field860.method1026(-15663);
            class233.field3759.method1026(-15663);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIIF)V", line = 46)
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILul;IIZ)V", line = 53)
    public static final void method789(int arg0, int arg1, int arg2, class406 arg3, int arg4, int arg5, boolean arg6) {
        class53.field665 = arg2;
        class60.field718 = 1;
        class326.field4909 = arg4;
        if (arg5 >= 65) {
            ++field1387;
            class150.field2248 = arg1;
            class359.field5329 = arg6;
            class216.field3506 = arg3;
            class265.field4068 = class448.field6563.method1887(3072) / arg0;
            if (~class265.field4068 > -2) {
                class265.field4068 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZIII)I", line = 77)
    public static final int method790(boolean arg0, int arg1, int arg2, int arg3) {
        ++field1392;
        int var4 = arg1 & 3;
        if (var4 == 0) {
            return arg2;
        } else {
            if (arg0) {
                field1394 = -108;
            }
            if (var4 == 1) {
                return -arg3 + 1023;
            } else {
                return ~var4 == -3 ? -arg2 + 1023 : arg3;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IF)V", line = 99)
    public final void method791(int arg0, float arg1) {
        super.field6794 = arg1;
        ++field1389;
        if (arg0 != 1024) {
            method790(false, -3, 32, 103);
        }
    }
}
