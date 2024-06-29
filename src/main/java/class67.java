import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public interface class67 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[I")
    int[] method14(byte arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    int method17(int arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z")
    boolean method8(int arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Z")
    boolean method9(int arg0, int arg1);
}
