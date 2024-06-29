import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class296 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4725 = 2;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
    public static int[] field4728 = new int[256];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lem;")
    public static class13 field4723 = new class13();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 6)
    public static void method2018(int arg0) {
        if (arg0 == 2) {
            field4728 = null;
            field4723 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V", line = 17)
    public static final void method2019(int arg0, byte arg1) {
        class255.field4115 = -1;
        class318.field5042 = arg0;
        class255.field4115 = -1;
        class218.method1605(0);
        field4727++;
        if (arg1 < 57) {
            field4728 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V", line = 34)
    public static final void method2020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -5873) {
            return;
        }
        field4724++;
        if (arg1 == arg4) {
            class121.method1024((byte) 103, arg4, arg2, arg3, arg0);
        } else if (class170.field2944 <= arg3 - arg4 && class310.field4916 >= arg3 + arg4 && (arg2 - arg1) >= class90.field1428 && class135.field2358 >= arg2 + arg1) {
            class69.method658(arg1, arg2, 125, arg3, arg0, arg4);
        } else {
            class325.method2258(arg4, arg3, arg0, arg1, arg5 ^ 0x3DC8CA4E, arg2);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lcg;I)Z", line = 67)
    public static final boolean method2021(class49 arg0, int arg1) {
        if (arg1 == -1) {
            field4726++;
            return arg0.method432(class125.field2162, false);
        } else {
            return false;
        }
    }
}
