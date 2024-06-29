import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class52 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field548 = null;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjg;)Ljg;")
    public abstract class338 method297(int arg0, class338 arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method298(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method299(14);
        }
        field546++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method299(int arg0) {
        if (arg0 <= 43) {
            field547 = -84;
        }
        field548 = null;
    }
}
