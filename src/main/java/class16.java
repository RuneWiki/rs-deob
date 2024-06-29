import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface class16 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIIIFI)[I")
    int[] method79(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIZFII)[F")
    float[] method80(boolean arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIFZI)[I")
    int[] method81(byte arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
    boolean method82(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Lbb;")
    class222 method83(int arg0, int arg1);
}
