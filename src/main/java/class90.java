import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class90 {

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    public int field1108 = -1;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BI)Z", line = 23)
    public static final boolean method500(byte arg0, int arg1) {
        if (arg0 != 107) {
            method500((byte) -97, -26);
        }
        field1104++;
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }
}
