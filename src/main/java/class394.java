import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public interface class394 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Z")
    boolean method575(int arg0, byte arg1);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lns;")
    class189 method577(int arg0, int arg1);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIFII)[I")
    int[] method578(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZFII)[F")
    float[] method579(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(ZIIFII)[I")
    int[] method573(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5);
}
