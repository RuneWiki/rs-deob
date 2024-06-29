import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class44 {

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "[I")
    public static int[] field979 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field980 = -1;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lha;")
    public static class59 field982;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z")
    public static final boolean method543(int arg0) {
        field981++;
        if (arg0 == 27165) {
            return class98.method915(-30282, "jaclib") ? class98.method915(-30282, "hw3d") : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public static void method544(boolean arg0) {
        field979 = null;
        if (arg0) {
            method544(true);
        }
        field982 = null;
    }
}
