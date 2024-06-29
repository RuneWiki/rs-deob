import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface class204 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
    int method948(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)Z")
    boolean method932(int arg0, byte arg1);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Z")
    boolean method939(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)Z")
    boolean method935(int arg0, byte arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIF)[I")
    int[] method942(byte arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)[I")
    int[] method946(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(IB)Z")
    boolean method933(int arg0, byte arg1);
}
