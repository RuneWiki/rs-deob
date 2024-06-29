import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class46 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field640 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 9)
    public static void method294(byte arg0) {
        if (arg0 != 40) {
            method295(-21);
        }
        field640 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 24)
    public static final void method295(int arg0) {
        if (class139.field2195 < 0) {
            class50.field707 = -1;
            class139.field2195 = 0;
            class88.field1218 = -1;
        }
        field642++;
        if (class111.field1650 < class139.field2195) {
            class88.field1218 = -1;
            class50.field707 = -1;
            class139.field2195 = class111.field1650;
        }
        if (arg0 < ~class91.field1254) {
            class50.field707 = -1;
            class91.field1254 = 0;
            class88.field1218 = -1;
        }
        if (class74.field1048 < class91.field1254) {
            class91.field1254 = class74.field1048;
            class88.field1218 = -1;
            class50.field707 = -1;
        }
    }
}
