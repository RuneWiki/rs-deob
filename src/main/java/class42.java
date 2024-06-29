import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public interface class42 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
    boolean method323(int arg0, int arg1);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
    int method324(int arg0, int arg1);

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)[I")
    int[] method325(int arg0, int arg1);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)Z")
    boolean method326(byte arg0, int arg1);
}
