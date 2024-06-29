import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class511 extends class766 {

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field7019;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public int field7022;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public int field7025;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public int field7027;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public int field7029;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field7030;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Luf;")
    public class519 field7023;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Luf;")
    public class519 field7026;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Ljava/lang/String;")
    public String field7024;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Z")
    public boolean field7020;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field7021;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZZ)V", line = 8)
    public static final void method2982(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class390.field5443--;
            if (class390.field5443 == 0) {
                class621.field8768 = null;
            }
        }
        field7028++;
        if (arg0 != 0 || !arg1) {
            return;
        }
        class269.field3798--;
        if (class269.field3798 == 0) {
            class789.field10788 = null;
            return;
        }
    }
}
