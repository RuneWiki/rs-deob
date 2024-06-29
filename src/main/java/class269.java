import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class269 {

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field3632 = 0;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field3636 = 0;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "[I")
    public static int[] field3635;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 14)
    public static void method1645(int arg0) {
        field3635 = null;
        if (arg0 != 0) {
            method1645(-14);
        }
    }
}
