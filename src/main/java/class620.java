import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class620 {

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "Z")
    public static boolean field8761 = false;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "Lrk;")
    public static class290 field8760;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "Lhia;")
    public static class49 field8762;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V", line = 11)
    public static void method3557(int arg0) {
        field8760 = null;
        field8762 = null;
        if (arg0 != -1) {
            field8760 = null;
        }
    }
}
