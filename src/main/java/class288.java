import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class288 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4910 = 0;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[I")
    public static int[] field4914 = new int[32768];

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Z")
    public static boolean field4913 = false;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lmh;")
    public static class62 field4916 = class201.method1405(true, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method1968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 23316) {
            field4916 = (class62) null;
        }
        field4912++;
        if (arg6 >= class176.field2819 && arg6 <= class52.field755 && class176.field2819 <= arg4 && class52.field755 >= arg4 && arg0 >= class176.field2819 && arg0 <= class52.field755 && arg3 >= class176.field2819 && class52.field755 >= arg3 && arg5 >= class99.field1630 && class81.field1348 >= arg5 && class99.field1630 <= arg2 && arg2 <= class81.field1348 && arg9 >= class99.field1630 && class81.field1348 >= arg9 && class99.field1630 <= arg8 && arg8 <= class81.field1348) {
            class16.method64(arg4, arg6, arg9, arg2, arg0, arg8, arg3, arg7 ^ 0xFFFFA4B6, arg1, arg5);
        } else {
            class54.method353(arg3, -30281, arg9, arg2, arg1, arg0, arg6, arg5, arg8, arg4);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1969(int arg0) {
        int var1 = 29 % ((arg0 + 35) / 52);
        class294.field5004.method1395((byte) -43);
        field4911++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILhi;Lim;Lhi;)V", line = 45)
    public static final void method1970(int arg0, class26 arg1, class175 arg2, class26 arg3) {
        field4915++;
        class259.field4368 = arg3;
        class45.field680 = arg1;
        if (arg0 != 32768) {
            method1970(-3, (class26) null, (class175) null, (class26) null);
        }
        class297.field5075 = arg2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 82)
    public static void method1971(boolean arg0) {
        field4914 = null;
        if (arg0) {
            field4916 = (class62) null;
        }
        field4916 = null;
    }
}
