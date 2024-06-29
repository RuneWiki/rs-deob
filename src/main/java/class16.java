import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface class16 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FZZIII)[I")
    int[] method90(float arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
    boolean method91(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIFZ)[I")
    int[] method92(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZIF)[F")
    float[] method93(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Liq;")
    class433 method94(int arg0, byte arg1);
}
