import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public interface class67 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
    int[] method568(int arg0, byte arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z")
    boolean method569(int arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Z")
    boolean method570(byte arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)I")
    int method571(int arg0, byte arg1);
}
