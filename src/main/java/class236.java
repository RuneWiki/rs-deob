import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public interface class236 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Z")
    boolean method83(int arg0, byte arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)I")
    int method80(byte arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IB)Z")
    boolean method88(int arg0, byte arg1);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(IB)[I")
    int[] method84(int arg0, byte arg1);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(BI)Z")
    boolean method78(byte arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(BI)Z")
    boolean method86(byte arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IFB)[I")
    int[] method90(int arg0, float arg1, byte arg2);
}
