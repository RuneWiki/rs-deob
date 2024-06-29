import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface class19 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I")
    int method129(int arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)[I")
    int[] method130(int arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Z")
    boolean method131(byte arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Z")
    boolean method132(int arg0, boolean arg1);
}
