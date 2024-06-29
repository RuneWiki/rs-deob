import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class16 {

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Lt;")
    public static class31 field228 = class11.method64(-95, "Combat Training");

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lt;")
    public static class31 field230 = class11.method64(119, "Farming patch");

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "Lt;")
    public static class31 field229 = class11.method64(119, "Tannery");

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lt;")
    public static class31 field234 = class11.method64(-40, "b12_full");

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "J")
    public long field232;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Li;")
    public class16 field231;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Li;")
    public class16 field233;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Z")
    public static boolean field235;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Z)V", line = 52)
    public final void method96(boolean arg0) {
        if (this.field233 == null) {
            return;
        }
        this.field233.field231 = this.field231;
        this.field231.field233 = this.field233;
        if (!arg0) {
            field229 = null;
        }
        this.field233 = null;
        this.field231 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)V", line = 75)
    public static void method97(int arg0) {
        field228 = null;
        field230 = null;
        field234 = null;
        field229 = null;
        if (arg0 != -13236) {
            field230 = null;
        }
    }
}
