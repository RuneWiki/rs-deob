import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class117 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Z")
    public static boolean field1783 = false;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1782 = 0;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lfa;")
    public static class267 field1786;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(CI)C")
    public static final char method857(char arg0, int arg1) {
        field1785++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else {
            return (char) (arg1 == 1 ? Character.toTitleCase(arg0) : 65421);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method858(int arg0) {
        field1786 = null;
        if (arg0 != -1526) {
            field1786 = null;
        }
    }
}
