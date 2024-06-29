import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class302 {

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3922 = null;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)Z")
    public static final boolean method1770(int arg0, int arg1) {
        field3921++;
        if (arg0 != 1002) {
            field3922 = null;
        }
        if (arg1 == 16 || arg1 == 51 || arg1 == 44 || arg1 == 23 || arg1 == 4) {
            return true;
        } else {
            return arg1 == 21 || arg1 == 1002;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public static void method1771(byte arg0) {
        field3922 = null;
        if (arg0 <= 41) {
            field3922 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)Z")
    public static final boolean method1772(byte arg0, int arg1) {
        if (arg0 != -30) {
            field3922 = null;
        }
        field3920++;
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }
}
