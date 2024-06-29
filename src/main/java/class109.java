import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public interface class109 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Z")
    boolean method702(int arg0, int arg1);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)Ljc;")
    class279 method703(int arg0, int arg1);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZFIZII)[I")
    int[] method704(boolean arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IFZIII)[I")
    int[] method705(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBIFZI)[F")
    float[] method706(int arg0, byte arg1, int arg2, float arg3, boolean arg4, int arg5);
}
