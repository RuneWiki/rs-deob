import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class576 {

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "Z")
    public static boolean field7613 = false;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field7611 = -1;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lbi;")
    public static class449 field7609;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public static void method3152(int arg0) {
        field7609 = null;
        if (arg0 >= -28) {
            field7610 = 9;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)Lae;")
    public static final class233 method3153(int arg0) {
        field7612++;
        if (class471.field6307.length > class664.field9423) {
            return class471.field6307[class664.field9423++];
        } else {
            int var1 = -44 % ((-arg0 - 10) / 61);
            return null;
        }
    }
}
