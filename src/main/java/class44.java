import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public interface class44 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z")
    boolean method50(byte arg0, int arg1);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)Z")
    boolean method42(byte arg0, int arg1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
    int[] method48(int arg0, int arg1);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
    int method43(int arg0, int arg1);
}
