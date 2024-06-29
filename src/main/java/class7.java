import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface class7 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z")
    boolean method54(int arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
    int method55(int arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
    int[] method56(byte arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Z")
    boolean method57(int arg0, byte arg1);
}
