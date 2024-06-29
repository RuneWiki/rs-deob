import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public interface class6 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)Z")
    boolean method6(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z")
    boolean method14(byte arg0, int arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I")
    int method7(int arg0, byte arg1);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)[I")
    int[] method16(byte arg0, int arg1);
}
