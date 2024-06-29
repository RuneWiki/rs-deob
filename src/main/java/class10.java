import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public interface class10 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Z")
    boolean method10(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)Z")
    boolean method19(int arg0, byte arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
    boolean method14(int arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(FIB)[I")
    int[] method9(float arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I")
    int[] method16(byte arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)I")
    int method21(int arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Z")
    boolean method20(byte arg0, int arg1);
}
