import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class461 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public static int[] field5747 = new int[500];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method2532(int arg0) {
        if (arg0 <= -30) {
            field5747 = null;
        }
    }
}
