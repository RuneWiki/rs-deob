import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class398 {

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "Lwp;")
    public static class435 field5520;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "Lsg;")
    public static class461 field5521;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5522++;
        if (class108.field1334 <= arg5 && class592.field8242 >= arg2 && class112.field1386 <= arg4 && arg0 <= class328.field4190) {
            class325.method1919(arg3, arg2, arg4, arg6, arg0, arg1, arg5, -17);
        } else {
            class354.method2107(arg6, true, arg3, arg4, arg0, arg5, arg1, arg2);
        }
        int var8 = -104 % (arg7 / 51);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V", line = 24)
    public static void method2362(byte arg0) {
        int var1 = 23 % ((-arg0 - 24) / 50);
        field5521 = null;
        field5520 = null;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 35)
    public static final boolean method2363(String arg0, int arg1) {
        field5519++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class727.field10184; var2++) {
            if (arg0.equalsIgnoreCase(class4.field34[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class339.field4374.field7690);
    }
}
