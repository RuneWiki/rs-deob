import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public interface class12 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)Z")
    boolean method69(int arg0, boolean arg1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
    int method70(int arg0, int arg1);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Z")
    boolean method71(int arg0, int arg1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
    int[] method72(int arg0, byte arg1);
}
