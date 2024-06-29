import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class208 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lwo;")
    public static class690 field2537 = new class690(114, 3);

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2540 = -1;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2541 = new String[100];

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lqf;")
    public static class632 field2539 = new class632();

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 5)
    public static void method1248(int arg0) {
        field2539 = null;
        field2541 = null;
        field2537 = null;
        if (arg0 != 113) {
            method1248(-104);
        }
    }
}
