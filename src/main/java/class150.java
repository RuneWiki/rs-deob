import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface class150 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
    int method928(byte arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    boolean method929(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIIFI)[I")
    int[] method930(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)Lnba;")
    class298 method931(int arg0, boolean arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIZII)[I")
    int[] method932(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIIBF)[F")
    float[] method933(boolean arg0, int arg1, int arg2, int arg3, byte arg4, float arg5);
}
