import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface class40 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Z")
    boolean method308(byte arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)Z")
    boolean method309(int arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)I")
    int method310(int arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(FBI)[I")
    int[] method311(float arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(BI)Z")
    boolean method312(byte arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZFI)Lwe;")
    class43 method313(int arg0, int arg1, boolean arg2, float arg3, int arg4);
}
