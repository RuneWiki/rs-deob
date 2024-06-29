import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class274 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4032 = "purple:";

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field4033 = -1;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "F")
    public static float field4031;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[[I")
    public static int[][] field4030;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1753(int arg0) {
        field4030 = null;
        field4032 = null;
        if (arg0 != -1) {
            method1753(20);
        }
    }
}
