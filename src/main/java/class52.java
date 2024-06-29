import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class52 {

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field607 = 0;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "[Li;")
    public static class37[] field606;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public static void method407(int arg0) {
        if (arg0 >= -42) {
            method407(81);
        }
        field606 = null;
    }
}
