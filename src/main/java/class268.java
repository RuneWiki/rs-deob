import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public interface class268 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIFZI)[I")
    int[] method520(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(BI)Lua;")
    class97 method519(byte arg0, int arg1);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(IB)Z")
    boolean method521(int arg0, byte arg1);
}
