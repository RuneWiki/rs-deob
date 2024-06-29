import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class354 {

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5442 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lg;")
    public static class67 field5438 = new class67(64);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "F")
    public static float field5443 = 0.0F;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field5444 = 0;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field5445 = 0;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[Lrl;")
    public static class324[] field5437;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZIBZ)Lph;", line = 15)
    public static final class361 method2464(boolean arg0, boolean arg1, int arg2, byte arg3, boolean arg4) {
        class201 var5 = null;
        if (class250.field3707 != null) {
            var5 = new class201(arg2, class250.field3707, class266.field4058[arg2], 1000000);
        }
        class169.field2441[arg2] = class21.field329.method123(var5, arg2, 0, class147.field2119);
        if (arg4) {
            class169.field2441[arg2].method1618((byte) -122);
        }
        field5440++;
        return arg3 >= -106 ? (class361) null : new class361(class169.field2441[arg2], arg1, arg0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 35)
    public static void method2465(byte arg0) {
        field5438 = null;
        field5442 = null;
        field5437 = null;
        if (arg0 >= -120) {
            field5444 = 54;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIZI)V", line = 50)
    public static final void method2466(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (class355.field5452 <= arg1 && arg4 <= class348.field5378 && class326.field4901 <= arg3 && class261.field3911 >= arg0) {
            if (arg6 == 1) {
                class74.method611(arg0, arg2, 126, arg3, arg4, arg1);
            } else {
                class40.method292((byte) -91, arg6, arg3, arg1, arg0, arg4, arg2);
            }
        } else if (arg6 == 1) {
            class21.method128((byte) -122, arg2, arg3, arg1, arg0, arg4);
        } else {
            class167.method1187(arg6, arg1, arg0, arg2, 28727, arg4, arg3);
        }
        field5439++;
        if (!arg5) {
            field5442 = (String[]) null;
        }
    }
}
