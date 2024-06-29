import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class173 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lrr;")
    public static class280 field2770 = new class280(11, 0, 1, 2);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field2772 = -1;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[Lsq;")
    public static class145[] field2771 = new class145[14];

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 5)
    public static final void method1171(String arg0, byte arg1) {
        if (arg1 <= 18) {
            field2771 = null;
        }
        field2769++;
        System.out.println("Error: " + class437.method2646("%0a", "\n", 107, arg0));
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 17)
    public static void method1172(int arg0) {
        field2770 = null;
        if (arg0 != 29538) {
            field2771 = null;
        }
        field2771 = null;
    }
}
