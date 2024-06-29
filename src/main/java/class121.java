import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class121 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "Z")
    public static boolean field1518;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)Z", line = 13)
    public static final boolean method706(int arg0, int arg1, int arg2) {
        if (arg1 == 2048) {
            field1517++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }
}
