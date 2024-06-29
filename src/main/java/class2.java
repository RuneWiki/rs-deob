import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public interface class2 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFB)[I")
    int[] method12(int arg0, float arg1, byte arg2);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Z")
    boolean method13(int arg0, boolean arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)[I")
    int[] method14(boolean arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    int method15(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Z")
    boolean method16(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)Z")
    boolean method17(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IZ)Z")
    boolean method18(int arg0, boolean arg1);
}
