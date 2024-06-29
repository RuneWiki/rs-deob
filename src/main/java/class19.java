import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface class19 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
    boolean method134(int arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Z")
    boolean method135(int arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[I")
    int[] method136(byte arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)I")
    int method137(byte arg0, int arg1);
}
