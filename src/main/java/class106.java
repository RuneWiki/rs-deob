import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class106 {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        class593.field8098.method549(class388.field5622, class74.field1013, class454.field6506);
        if (arg0 != 7) {
            method802((byte) 40);
        }
        field1497++;
    }
}
