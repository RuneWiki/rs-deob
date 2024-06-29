import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class5 extends class4 {

    @OriginalMember(owner = "client!uha", name = "m", descriptor = "[I")
    public static int[] field29 = new int[4096];

    @OriginalMember(owner = "client!uha", name = "l", descriptor = "I")
    public static int field28 = 1;

    @OriginalMember(owner = "client!uha", name = "o", descriptor = "I")
    public static int field31 = 16777215;

    @OriginalMember(owner = "client!uha", name = "n", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)V")
    public static void method14(int arg0) {
        if (arg0 < 1) {
            method14(-23);
        }
        field29 = null;
    }
}
