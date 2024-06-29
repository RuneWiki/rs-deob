import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class582 {

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field7631 = 0;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "[I")
    public static int[] field7630 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7632++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public static void method3183(int arg0) {
        if (arg0 != -21012) {
            method3183(-92);
        }
        field7630 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lha;II)Lrc;")
    public static final class539 method3184(class59 arg0, int arg1, int arg2) {
        field7629++;
        if (arg2 != 27198) {
            field7631 = 58;
        }
        class507 var3 = class639.method3495(-112, arg0, true, arg1);
        return var3 == null ? null : var3.field6772;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(II)V")
    public class582(int arg0, int arg1) {
    }
}
