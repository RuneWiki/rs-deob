import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class41 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Ldm;")
    public static class46 field806 = new class46();

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lh;")
    public static class571 field809 = new class571(4);

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Z")
    public static boolean field810;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[Lha;")
    public static class52[] field805;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field805 = null;
        if (arg0 != 16384) {
            field810 = false;
        }
        field809 = null;
        field806 = null;
    }
}
