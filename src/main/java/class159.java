import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface class159 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIFZI)[I")
    int[] method1259(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IFIZBI)[F")
    float[] method1260(int arg0, float arg1, int arg2, boolean arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIZFI)[I")
    int[] method1261(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)Z")
    boolean method1262(int arg0, byte arg1);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)Ltca;")
    class181 method1263(int arg0, byte arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
    int method1264(int arg0);
}
