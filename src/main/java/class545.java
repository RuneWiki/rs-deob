import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class545 {

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field7582 = -1;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIB)I", line = 20)
    public static final int method3050(int arg0, int arg1, byte arg2) {
        field7581++;
        if (arg1 == 1 || arg1 == 3) {
            return class101.field1734[arg0 & 0x3];
        } else {
            if (arg2 != -101) {
                method3050(-75, -36, (byte) 31);
            }
            return class307.field4424[arg0 & 0x3];
        }
    }
}
