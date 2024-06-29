import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public interface class7 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    boolean method37(int arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
    int method38(int arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I")
    int[] method39(int arg0, byte arg1);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)Z")
    boolean method40(byte arg0, int arg1);
}
