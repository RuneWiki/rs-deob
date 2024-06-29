import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class313 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "F")
    public static float field4590;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[[Lcaa;")
    public static class538[][] field4591;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[[Z")
    public static boolean[][] field4592;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method1948(byte arg0) {
        field4591 = null;
        field4592 = null;
        int var1 = 56 / ((4 - arg0) / 34);
    }
}
