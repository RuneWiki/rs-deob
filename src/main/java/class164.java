import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class164 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Liga;")
    public static class91 field2095 = new class91(8, 8);

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "F")
    public static float field2098 = 1.0F;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lae;")
    public static class283 field2097;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 3)
    public static void method1031(int arg0) {
        field2095 = null;
        if (arg0 != 8) {
            field2096 = 11;
        }
        field2097 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 21)
    public static final void method1032(int arg0) {
        class207.method1320(-51);
        field2093++;
        if (arg0 != 8) {
            method1032(-19);
        }
    }
}
