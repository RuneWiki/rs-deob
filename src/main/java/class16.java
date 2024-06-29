import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface class16 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIIFB)[I")
    int[] method91(int arg0, boolean arg1, int arg2, int arg3, float arg4, byte arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
    boolean method92(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Lmk;")
    class39 method93(byte arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BFZIII)[I")
    int[] method94(byte arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIFIZI)[F")
    float[] method95(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5);
}
