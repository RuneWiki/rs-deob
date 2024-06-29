import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class350 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Z")
    public static boolean field4884 = false;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ln;")
    public static class13 field4885 = new class13();

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method2235(int arg0) {
        if (arg0 <= 54) {
            field4886 = 117;
        }
        field4885 = null;
    }
}
