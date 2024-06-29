import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class171 {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "[Lbm;")
    public static class215[] field2215 = new class215[4];

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Loi;")
    public static class169 field2214 = new class169("K", "T", "K", "K");

    @OriginalMember(owner = "client!to", name = "c", descriptor = "[Lkc;")
    public static class156[] field2216 = new class156[128];

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Loi;")
    public static class169 field2217 = new class169("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
    public static int[] field2219 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 5)
    public static void method1130(int arg0) {
        field2219 = null;
        field2215 = null;
        field2216 = null;
        field2217 = null;
        field2214 = null;
        if (arg0 != 0) {
            field2217 = null;
        }
    }
}
