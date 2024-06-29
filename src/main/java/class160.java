import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class160 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field2611 = 0;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Laj;")
    public static class151 field2615;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
    public static int[] field2616;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[Lmd;")
    public static class273[] field2614;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method1191(int arg0) {
        field2615 = null;
        field2614 = null;
        field2616 = null;
        if (arg0 != -1) {
            field2611 = 73;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1192(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5) {
        if (arg5 != 1464) {
            method1191(37);
        }
        class246.method1755(arg2, -1, -1, (String) null, arg0, arg1, arg3, arg4);
        field2613++;
    }
}
