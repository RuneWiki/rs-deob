import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class184 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
    public static boolean field2893 = true;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lid;")
    public static class149 field2890;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lkf;")
    public static class180 field2891;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field2891 = null;
        field2890 = null;
        if (arg0 != 1) {
            field2893 = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIZILdl;)V")
    public static final void method1282(int arg0, int arg1, int arg2, boolean arg3, int arg4, class123 arg5) {
        class281.field4456 = arg3;
        class244.field3901 = arg2;
        class38.field518 = 10000;
        field2889++;
        class189.field2985 = 1;
        class182.field2887 = arg0;
        if (arg4 <= 87) {
            field2891 = null;
        }
        class249.field3996 = arg1;
        class63.field887 = arg5;
    }
}
