import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface class16 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lvm;")
    class486 method105(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BZIFII)[I")
    int[] method106(byte arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FBIIZI)[F")
    float[] method107(float arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Z")
    boolean method108(boolean arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZZFI)[I")
    int[] method109(int arg0, int arg1, boolean arg2, boolean arg3, float arg4, int arg5);
}
