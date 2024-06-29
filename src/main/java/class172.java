import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class172 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[Lhh;")
    public static class120[] field2766 = new class120[29];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
    public static final void method1276(int arg0, String arg1, byte arg2, String arg3) {
        class245.method1756(-1635, arg3, -1, arg1, arg0, (String) null);
        field2768++;
        if (arg2 != 40) {
            method1277(25);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1277(int arg0) {
        field2766 = null;
        int var1 = 19 / ((-arg0 - 41) / 56);
    }
}
