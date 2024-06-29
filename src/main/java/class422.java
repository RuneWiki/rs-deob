import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class422 {

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field6436 = -50;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
    public static int field6437 = 0;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "Lri;")
    public static class97 field6434;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V", line = 4)
    public static void method2688(int arg0) {
        field6434 = null;
        if (arg0 != 0) {
            method2688(58);
        }
    }
}
