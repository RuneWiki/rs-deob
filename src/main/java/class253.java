import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class253 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3905 = new String[100];

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3908 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lug;B)Laa;", line = 5)
    public static final class226 method1881(class25 arg0, byte arg1) {
        field3906++;
        if (arg1 != 21) {
            method1884(-50, (byte) 71, -7, -17, 74, -110);
        }
        return new class226(arg0.method296(-104), arg0.method296(arg1 ^ 0xFFFFFF84), arg0.method296(arg1 ^ 0xFFFFFF8D), arg0.method296(-107), arg0.method265(true), arg0.method265(true), arg0.method281(arg1 ^ 0xFFFFFF95));
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 23)
    public static final String method1882(int arg0, int arg1, boolean arg2) {
        int var3 = arg0 - arg1;
        field3909++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (arg2) {
            return (String) null;
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 <= 0) {
            return "<col=ffff00>";
        } else {
            return "<col=c0ff00>";
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 70)
    public static void method1883(int arg0) {
        field3905 = null;
        if (arg0 >= -89) {
            field3904 = 77;
        }
        field3908 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIII)V", line = 87)
    public static final void method1884(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class173.field2753 = arg3;
        class352.field5621 = arg2;
        class290.field4516 = arg0;
        field3907++;
        if (arg1 != -127) {
            field3908 = (String[]) null;
        }
        class159.field2537 = arg4;
        class315.field4866 = arg5;
    }
}
