import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class674 extends class71 {

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lst;")
    public static class335 field9363 = new class335(42, 3);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lfd;")
    public static class298 field9365;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 8)
    public static void method3806(int arg0) {
        if (arg0 >= 119) {
            field9363 = null;
            field9365 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILuv;I)Ljava/lang/String;", line = 33)
    public static final String method3807(int arg0, class755 arg1, int arg2) {
        field9364++;
        if (arg0 != 42) {
            return null;
        } else if (!client.method2738(arg1).method1840(arg2, (byte) -123) && arg1.field10502 == null) {
            return null;
        } else if (arg1.field10551 == null || arg1.field10551.length <= arg2 || arg1.field10551[arg2] == null || arg1.field10551[arg2].trim().length() == 0) {
            return class498.field6966 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field10551[arg2];
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)I")
    public abstract int method2573(byte arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)I")
    public abstract int method2571(boolean arg0);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)J")
    public abstract long method2575(byte arg0);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)I")
    public abstract int method2572(int arg0);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)I")
    public abstract int method2574(byte arg0);
}
