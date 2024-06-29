import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public interface class104 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
    boolean method657(int arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Z")
    boolean method648(byte arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Z")
    boolean method650(int arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)I")
    int method649(byte arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)[I")
    int[] method652(int arg0, int arg1);
}
