import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class171 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[Lcf;")
    public static class93[] field3004 = new class93[200];

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lcf;")
    public static class93 field3007 = class147.method1066(")3)3)3", -48);

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lcf;")
    public static class93 field3010 = class147.method1066("Verbindung mit Update)2Server)3)3)3", -48);

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method1227(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3006++;
        int var9 = arg4 - arg6;
        int var10 = arg8 - arg7;
        int var11 = (arg1 - arg5 << 16) / var10;
        if (arg2 > -17) {
            method1227(10, -15, (byte) 108, -47, -65, 37, -8, 82, 95);
        }
        int var12 = (arg0 - arg3 << 16) / var9;
        class126.method922(arg5, 0, arg6, arg3, arg7, -123, arg4, 0, var11, arg8, var12);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIIIIIIIII)Z")
    public static final boolean method1228(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3008++;
        if (class166.field2927.method1475(false) == 2) {
            return class279.method1867(arg8, arg3, (byte) 89, arg5, arg11, arg4, arg0, arg7, arg6, arg9, arg10, arg1);
        } else if (class166.field2927.method1475(false) > 2) {
            return class66.method455(arg0, arg10, arg6, arg9, class166.field2927.method1475(false), arg11, true, arg7, arg4, arg3, arg8, arg1, arg5);
        } else {
            int var12 = 12 / ((arg2 - 3) / 35);
            return class285.method1950(arg1, arg8, arg10, arg0, 5470, arg11, arg7, arg6, arg4, arg3, arg9, arg5);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)V")
    public static final void method1229(boolean arg0, int arg1) {
        if (arg1 > 12) {
            field3005++;
            class61.method385(class69.field1262, 19169, class169.field2968, class150.field2629, arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1230(int arg0) {
        field3010 = null;
        field3007 = null;
        if (arg0 <= -11) {
            field3004 = null;
        }
    }
}
