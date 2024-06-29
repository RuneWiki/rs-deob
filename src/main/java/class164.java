import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class164 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[Lfv;")
    public static class495[] field2066 = new class495[14];

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lsaa;")
    public static class507 field2067 = new class507("WTRC", 1);

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lqe;")
    public static class122 field2068 = new class122(5000);

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Ljj;")
    public static class398 field2069 = new class398(69, -1);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method1105(int arg0) {
        field2068 = null;
        if (arg0 >= -42) {
            method1105(-68);
        }
        field2069 = null;
        field2067 = null;
        field2066 = null;
    }
}
