import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class90 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1336 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Llc;")
    public static class86 field1334;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Llc;")
    public static class86 field1337;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[Z")
    public static boolean[] field1339;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[[S")
    public static short[][] field1340;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method711(int arg0) {
        field1337 = null;
        field1340 = null;
        field1339 = null;
        if (arg0 < 62) {
            method711(-96);
        }
        field1334 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    public static final void method712(int arg0, int arg1) {
        if (arg1 != -16867) {
            method712(95, 95);
        }
        field1335++;
        class91.field1355.method1548(arg0, 0);
        class265.field4292.method1548(arg0, 0);
    }
}
