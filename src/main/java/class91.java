import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public interface class91 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
    boolean method594(int arg0, int arg1);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)Z")
    boolean method592(int arg0, int arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[I")
    int[] method588(int arg0, byte arg1);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)I")
    int method593(int arg0, int arg1);
}
