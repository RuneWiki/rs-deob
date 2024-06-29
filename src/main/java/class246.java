import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public interface class246 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(FII)[I")
    int[] method1373(float arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
    int[] method1360(int arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
    boolean method1361(int arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)Z")
    boolean method1366(int arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(II)I")
    int method1371(int arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Z")
    boolean method1370(int arg0, byte arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Z")
    boolean method1364(int arg0, boolean arg1);
}
