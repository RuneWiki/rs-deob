import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class553 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    public static int[] field7741 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method3105(byte arg0) {
        int var1 = -98 % ((23 - arg0) / 47);
        field7741 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lqa;ILbv;II)V")
    public static final void method3106(class167 arg0, int arg1, class568 arg2, int arg3, int arg4) {
        class612.field8795.method3178(-8299);
        if (arg1 > -124) {
            method3105((byte) -41);
        }
        field7742++;
        if (class394.field5453) {
            return;
        }
        for (class625 var5 = (class625) arg2.method3188((byte) -100); var5 != null; var5 = (class625) arg2.method3182((byte) -123)) {
            class297 var6 = class614.field8823.method1544(36, var5.field9044);
            if (class195.method1256(true, var6)) {
                boolean var7 = class191.method1225(arg4, var5, 117, arg0, var6, arg3);
                if (var7) {
                    class475.method2698(arg0, false, var5, var6);
                }
            }
        }
    }
}
