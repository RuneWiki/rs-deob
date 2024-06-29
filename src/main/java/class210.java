import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface class210 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIZFII)[F")
    float[] method183(boolean arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBZIIF)[I")
    int[] method181(int arg0, byte arg1, boolean arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIIIFI)[I")
    int[] method185(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Ljh;")
    class444 method186(int arg0, int arg1);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Z")
    boolean method184(int arg0, int arg1);
}
