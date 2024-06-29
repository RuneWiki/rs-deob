import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class217 {

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2873 = "Continue";

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field2874 = -2;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public static void method1383(int arg0) {
        field2873 = null;
        if (arg0 <= 89) {
            method1383(120);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZIII)V")
    public static final void method1384(boolean arg0, int arg1, int arg2, int arg3) {
        field2872++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class327.field4473 = arg1;
        if (arg3 != 28991) {
            method1383(-11);
        }
        class270.field3679 = arg2;
        class31.field488 = arg0;
    }
}
