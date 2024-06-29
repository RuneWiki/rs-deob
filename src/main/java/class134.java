import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface class134 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)Z")
    boolean method909(int arg0, byte arg1);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIFII)Lq;")
    class128 method910(boolean arg0, int arg1, float arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    int method911(int arg0, int arg1);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)Z")
    boolean method912(int arg0, byte arg1);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Z")
    boolean method913(int arg0, int arg1);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIF)[I")
    int[] method914(int arg0, int arg1, float arg2);
}
