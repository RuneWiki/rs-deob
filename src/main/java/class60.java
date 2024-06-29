import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "[Lgk;")
    public static class159[] field846 = new class159[14];

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Ljava/lang/String;")
    public static String field848 = "Starting 3d Library";

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[I")
    public static int[] field850 = new int[128];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lae;")
    public static class174 field847;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method374(int arg0) {
        field850 = null;
        field846 = null;
        if (arg0 >= -1) {
            method374(-32);
        }
        field847 = null;
        field848 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILse;)Z")
    public static final boolean method375(int arg0, class211 arg1) {
        field849++;
        if (arg1.field3062 == 205) {
            class202.field2795 = 250;
            return true;
        } else {
            if (arg0 > -40) {
                field850 = null;
            }
            return false;
        }
    }
}
