import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface class243 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
    boolean method1609(int arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZFIZ)Lwf;")
    class17 method1610(int arg0, boolean arg1, float arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Z")
    boolean method1611(int arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)I")
    int method1612(int arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)Z")
    boolean method1613(int arg0, boolean arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(FII)[I")
    int[] method1614(float arg0, int arg1, int arg2);
}
