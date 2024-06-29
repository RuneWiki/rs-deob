import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class55 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field815 = -1;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
    public static boolean field817 = true;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[I")
    public static int[] field818 = new int[6];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lrn;")
    public static class417 field814;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[Lu;")
    public static class34[] field816;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 12)
    public static void method517(int arg0) {
        field816 = null;
        if (arg0 == 6) {
            field818 = null;
            field814 = null;
        }
    }
}
