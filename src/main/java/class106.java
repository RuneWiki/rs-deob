import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public interface class106 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    int method894(int arg0, int arg1);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[I")
    int[] method895(int arg0, int arg1);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Z")
    boolean method896(byte arg0, int arg1);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)Z")
    boolean method897(int arg0, int arg1);
}
