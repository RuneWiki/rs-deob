import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface class63 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IFB)[I")
    int[] method90(int arg0, float arg1, byte arg2);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z")
    boolean method94(int arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)Z")
    boolean method88(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Z")
    boolean method93(int arg0, byte arg1);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IZ)[I")
    int[] method89(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(IZ)Z")
    boolean method98(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
    int method97(int arg0, int arg1);
}
